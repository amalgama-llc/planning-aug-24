package com.company.test1.application.handlers;

import java.util.List;

import jakarta.inject.Inject;
import jakarta.inject.Named;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.services.nls.Translation;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimmedWindow;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.model.application.ui.menu.MHandledMenuItem;
import org.eclipse.e4.ui.model.application.ui.menu.MMenu;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.swt.SWT;
import org.eclipse.e4.ui.model.application.commands.MParameter;
import org.eclipse.swt.widgets.Shell;

import com.company.test1.application.states.AppState;
import com.company.test1.application.utils.MessageBoxFactory;
import com.company.test1.application.utils.PerspectiveUtils;
import com.company.test1.application.utils.Topics;
import com.company.test1.application.utils.validation.ValidationManager;
import com.company.test1.datamodel.Scenario;
import com.company.test1.datamodel.SelectorType;
import com.amalgamasimulation.desktop.utils.MessageManager;
import com.company.test1.application.localization.Messages;
import com.company.test1.application.states.AppData;
import com.company.test1.application.utils.PerspectiveUtils.Perspective;

import com.company.test1.scheduling.Schedule;
import com.company.test1.scheduling.selector.AlternativeSelector;
import com.company.test1.scheduling.selector.Cheapest20Selector;
import com.company.test1.scheduling.selector.CheapestSelector;
import com.company.test1.scheduling.selector.EarliestToStartSelector;
import com.company.test1.scheduling.selector.FastestToFinishSelector;
import com.company.test1.scheduling.selector.FirstAlternativeSelector;
import com.company.test1.scheduling.selector.MaxUtilizationSelector;

public class SwitchPerspectiveHandler {
	
	
	@Inject
	private MessageManager messageManager;
	
	@Inject
	private AppState appState;
	
	@Inject
	@Translation
	private Messages messages;
	
	@Inject
	private AppData appData;
	
    @CanExecute
    private boolean canExecute() {
        return appState.isScenarioExist();
    }
	
	@Execute
	public void execute(@Named(PerspectiveUtils.COMMAND_PARAMETER_NAME) String newApplicationMode, 
						Shell shell,
						MApplication app, 
						EPartService partService, 
						EModelService modelService, 
						MWindow mainWindow) {
		Perspective newPerspective = Perspective.valueOf(newApplicationMode);
		if (newPerspective == null) {
			selectExactlyOneModeMenuItem(appState.getCurrentPerspective(), modelService, mainWindow);
			throw new RuntimeException("Unknown application mode: " + newApplicationMode);
		}
		trySwitchToPerspective(newPerspective, shell, app, partService, modelService, messageManager, messages, appData, appState
						);
	}
	
	public static void trySwitchToPerspective(	Perspective newPerspective, 
												Shell shell,
												MApplication app, 
												EPartService partService, 
												EModelService modelService, 
												MessageManager messageManager, 
												Messages messages,
												AppData appData,
												AppState appState
											) {
		MWindow mainWindow = PerspectiveUtils.getMainWindow(modelService, app);
		if (newPerspective.requiresValidScenario) {
			ValidationManager validationManager = new ValidationManager(messages);
			// here, model's init descriptors get initialized
			validationManager.validate(messageManager, appData.getScenario(), partService);
			if (validationManager.isErrorExist()) {
				MessageBoxFactory.createMessageBox(shell, SWT.ICON_ERROR | SWT.OK | SWT.APPLICATION_MODAL, 
						messages.title_check_data, messages.message_check_data_error);
				selectExactlyOneModeMenuItem(appState.getCurrentPerspective(), modelService, mainWindow);
				return;
			}
		}

		if (newPerspective != appState.getCurrentPerspective()) {
			appState.switchPerspective(newPerspective, app, partService, modelService, mainWindow);
			messageManager.send(Topics.PERSPECTIVE_CHANGED, null);
			if (newPerspective == Perspective.SCHEDULING) {
				Scenario scenario = appData.getScenario();
				AlternativeSelector selector = createAlternativeSelector(scenario.getSelectorType());
				Schedule schedule = new Schedule(scenario, selector);
				messageManager.post(Topics.SHOW_SCHEDULE, schedule);
			}
			selectExactlyOneModeMenuItem(appState.getCurrentPerspective(), modelService, mainWindow);
		}
	}
	
	private static AlternativeSelector createAlternativeSelector(SelectorType selectorType) {
		return switch (selectorType) {
		case FIRST -> new FirstAlternativeSelector();
		case FASTEST_TO_FINISH -> new FastestToFinishSelector();
		case EARLIEST_TO_START -> new EarliestToStartSelector();
		case CHEAPEST -> new CheapestSelector();
		case MAX_UTILIZATION -> new MaxUtilizationSelector();
		case CHEAPEST_20 -> new Cheapest20Selector();
		};
	}
	
	public static void selectExactlyOneModeMenuItem(Perspective perspective, EModelService modelService, MWindow mainWindow) {
		MMenu mainMenu = ((MTrimmedWindow)mainWindow).getMainMenu();
		MUIElement modeMenu = modelService.find(PerspectiveUtils.MODE_MENU_ID, mainMenu);
		List<MHandledMenuItem> modeMenuItems = modelService.findElements(modeMenu, null/*id*/, MHandledMenuItem.class);
		for (var item : modeMenuItems) {
			for (MParameter parameter : item.getParameters()) {
	    		if (parameter.getName().equals(PerspectiveUtils.COMMAND_PARAMETER_NAME)) {
	    			// menu item parameter that contains the target application mode name (as a String)
	    			item.setSelected(parameter.getValue().equals(perspective.name()));
	    		}
			}
		}
	}

}
