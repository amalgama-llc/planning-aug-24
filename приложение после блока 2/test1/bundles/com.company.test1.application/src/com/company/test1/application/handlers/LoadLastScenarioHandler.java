package com.company.test1.application.handlers;

import jakarta.inject.Inject;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.core.services.nls.Translation;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuItem;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.swt.widgets.Shell;

import com.company.test1.application.states.AppState;
import com.company.test1.application.localization.Messages;
import com.company.test1.application.states.AppData;

public class LoadLastScenarioHandler {

	@Inject
	@Translation
	private Messages messages;

	@Inject
	private AppData appData;

	@Inject
	private AppState appState;

	@CanExecute
	private boolean canExecute() {
		return appState.isEditor();
	}

	@Execute
	public void execute(Shell shell, MMenuItem menuItem, IEventBroker eventBroker, MApplication app, EPartService partService,
			EModelService modelService, MWindow mainWindow) {
		// ask if user wants the (changed) scenario to be saved
		if (appState.ensureCurrentScenarioIsSaved(shell, appData)) {
			appState.loadScenario(menuItem.getLabel(), true);
		}
	}
}
