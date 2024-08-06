package com.company.test1.application.handlers;

import jakarta.inject.Inject;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.swt.widgets.Shell;

import com.company.test1.application.scenario.ScenarioFileFormat;
import com.company.test1.application.states.AppState;
import com.company.test1.application.states.AppData;
import com.amalgamasimulation.desktop.ui.dialogs.DialogUtils;


public class SaveAsHandler {

	@Inject
	private AppState appState;
	
	@Inject
	private AppData appData;

	@CanExecute
	private boolean canExecute() {
		return appState.isEditor() && appState.isScenarioExist();
	}

	@Execute
	public void execute(Shell shell, IEventBroker eventBroker) {
		DialogUtils.showSaveFileDialog(shell, path -> appState.saveScenario(path, appData), ScenarioFileFormat.EXCEL.filePattern);
	}
}
