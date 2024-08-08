package com.company.test1.application.states;

import java.io.File;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import com.amalgamasimulation.desktop.ui.dialogs.ProgressDialog;
import com.amalgamasimulation.desktop.ui.dialogs.ResourceErrorsViewDialog;
import com.amalgamasimulation.desktop.utils.RecentlyOpenedFilesManager;
import com.amalgamasimulation.emf.commands.CommandsManager;
import com.amalgamasimulation.emf.excel.EMFExcelLoader;
import com.amalgamasimulation.emf.excel.EMFExcelTransform;
import com.amalgamasimulation.emf.excel.ColumnHeaderProvider;

import com.company.test1.application.AppInfo;
import com.company.test1.application.scenario.ScenarioLoader;
import com.company.test1.application.scenario.ScenarioSaver;
import com.company.test1.application.scenario.ScenarioSaver.ScenarioSavingException;
import com.company.test1.application.utils.FileUtils;
import com.company.test1.datamodel.data.EMFExcelDataTransform;
import com.company.test1.application.utils.MessageBoxFactory;
import com.company.test1.application.utils.PerspectiveUtils;
import com.company.test1.application.utils.validation.ObjectType;
import com.company.test1.datamodel.DatamodelPackage;
import com.company.test1.application.utils.Topics;
import com.company.test1.application.command.CommandFactory;
import org.eclipse.e4.ui.workbench.UIEvents;
import com.company.test1.application.localization.Messages;
import com.company.test1.application.states.AppData;
import com.company.test1.datamodel.Scenario;

@Singleton
@Creatable
public class AppState {

	private String currentLanguage;
	private PerspectiveUtils.Perspective currentPerspective;
	
	private boolean actualPlanned = false;
	
	@Inject
	private IEventBroker eventBroker;
	
	@Inject
	private AppData appData;
	
	@Inject
	private AppInfo appInfo;
		
	private RecentlyOpenedFilesManager recentlyOpenedFilesManager;
	
	public RecentlyOpenedFilesManager getRecentlyOpenedFilesManager() {
		if (recentlyOpenedFilesManager == null) {
			recentlyOpenedFilesManager = new RecentlyOpenedFilesManager(appInfo.getProductID(), 5);
		}
		return recentlyOpenedFilesManager;
	}
	
	public PerspectiveUtils.Perspective getCurrentPerspective() {
		return currentPerspective;
	}	
	
	public void setCurrentPerspective(PerspectiveUtils.Perspective currentPerspective) {
		this.currentPerspective = currentPerspective;
	}

	public void switchPerspective(PerspectiveUtils.Perspective newPerspective, MApplication app, EPartService partService, EModelService modelService, MWindow mainWindow) {
		MPerspective element = (MPerspective) modelService.find(newPerspective.id, app);
		partService.switchPerspective(element);
		currentPerspective = newPerspective;
	}

	public boolean isEditor() {
		return currentPerspective  == PerspectiveUtils.Perspective.EDITOR;
	}

	public boolean isActualPlanned() {
		return actualPlanned;
	}

	public void setActualPlanned(boolean actualPlanned) {
		this.actualPlanned = actualPlanned;
	}
	
	public String getCurrentLanguage() {
		return currentLanguage;
	}

	public void setCurrentLanguage(String currentLanguage) {
		this.currentLanguage = currentLanguage;
	}

	public boolean isScenarioExist() {
		return appData.getScenario() != null;
	}
	
	public void saveIsDone( ) {
		BasicCommandStack b = (BasicCommandStack)CommandsManager.getEditingDomain().getCommandStack();	
		b.saveIsDone();
		setActualPlanned(false);
	}
	
	/**
	 * Checks whether the current scenario is changed. If yes - asks the user to
	 * save the scenario and saves it (after user approval).
	 * 
	 * @param shell
	 * @param appData
	 * @return true if it is safe to proceed (scenario does not need saving, or user
	 *         answered 'YES' or 'NO'); false if the scenario is changed, but user
	 *         answered 'CANCEL' and wants to do something with the scenario
	 */
	public boolean ensureCurrentScenarioIsSaved(Shell shell, AppData appData) {
		if (ScenarioSaver.isSaveNeeded()) {
			// scenario requires saving
			switch (askUserToSaveScenario(shell, appData, AppData.messages)) {
			case SWT.YES:
				// user has agreed to save the scenario
				return saveScenario(appData.getFilePath(), appData);
			case SWT.NO:
				// user does not want the scenario to be saved, but it is ok to proceed with other tasks
				return true;
			case SWT.CANCEL:
				// the user does not want to proceed with other tasks, scenario is not saved yet
				return false;
			default:
				// unknown case
				return false;
			}
		}
		// scenario is saved before, user can go on with other tasks
		return true;
	}
    
    private int askUserToSaveScenario(Shell shell, AppData appData, Messages messages) {
        return MessageBoxFactory.createMessageBox(shell,
                                      SWT.ICON_QUESTION | SWT.YES | SWT.NO | SWT.CANCEL | SWT.APPLICATION_MODAL,
                                      messages.title_exit,
                                      String.format(messages.message_save_old_scenario,
                                                    appData.getScenario().getName()));
    }
    
    private Scenario scenario;
    private EMFExcelLoader<Scenario> loader;
    private boolean isExistErrorsFromEMF;
    
 	public Scenario loadScenario(String filePath, boolean showProgressDialog) {
 		scenario = null;
 		loader = null;
 		isExistErrorsFromEMF = false;
 		
 		if (!FileUtils.checkIsFileAndExists(filePath)) {
			MessageBoxFactory.createMessageBox(new Shell(), SWT.ICON_ERROR | SWT.OK | SWT.APPLICATION_MODAL,
					AppData.messages.title_error, AppData.messages.message_error_check_filepath);
 			return null;
 		}
		
		ProgressDialog.execute(AppData.messages.title_open_scenario, () -> {
			loader = ScenarioLoader.loadExcel(EMFExcelDataTransform.emfExcelTransform, filePath);
			if (!loader.getWarnings().isEmpty() || !loader.getErrors().isEmpty()) {
				isExistErrorsFromEMF = true;
			} else {
				scenario = loader.getRootObject();
			}
			
			if (scenario != null) {				
				setApplicationContext(filePath, scenario);
			}
		});
		
		if (isExistErrorsFromEMF) {
			new ResourceErrorsViewDialog(
					Display.getDefault().getActiveShell(), 
					AppData.messages.title_resource_errors_view_dialog, 
					AppData.messages.message_resource_errors_view_dialog, 
					loader.getErrors(), 
					loader.getWarnings())
				.open();
		}
		
		return scenario;
	}
	
	private void setApplicationContext(String filePath, Scenario scenario) {
		CommandsManager.getEditingDomain().getCommandStack().flush();
		appData.setFilePath(filePath);
		appData.setScenario(scenario);
		appData.getScenario().setName(new File(filePath).getName());
		setActualPlanned(false);
		recentlyOpenedFilesManager.saveString(filePath, RecentlyOpenedFilesManager.PathType.FILE);
		CommandFactory.CROSS_REFERENCE_ADAPTER.setTarget(scenario);
		CommandsManager.getEditingDomain().getCommandStack().addCommandStackListener(l -> {
			eventBroker.send(UIEvents.REQUEST_ENABLEMENT_UPDATE_TOPIC, UIEvents.ALL_ELEMENT_ID );
		});
		eventBroker.send(Topics.NEW_SCENARIO, scenario);
	}
	
	public boolean saveScenario(String filePath, AppData appData) {
		final String scenarioNameBeforeSave = appData	.getScenario()
														.getName();
		appData	.getScenario()
				.setName(new File(filePath).getName());
		try {
			ScenarioSaver.save(appData.getScenario(), filePath);
		} catch (ScenarioSavingException e) {
			appData	.getScenario()
					.setName(scenarioNameBeforeSave);
			MessageBoxFactory.createMessageBox(new Shell(),
	                                      SWT.ICON_WARNING | SWT.OK | SWT.APPLICATION_MODAL,
	                                      AppData.messages.title_save_scenario,
	                                      String.format(AppData.messages.message_scenario_saving_error, e.getMessage()));
			return false;
		}

		appData.setFilePath(filePath);
		saveIsDone();
		return true;
	}

	public boolean saveScenarioCopy(String filePath) {
		try {
			ScenarioSaver.save(appData.getScenario(), filePath);
		} catch (ScenarioSavingException e) {
			return false;
		}
		return true;
	}
	
}
