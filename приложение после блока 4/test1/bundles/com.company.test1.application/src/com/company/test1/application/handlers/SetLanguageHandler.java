package com.company.test1.application.handlers;

import jakarta.inject.Inject;
import jakarta.inject.Named;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.services.nls.Translation;
import org.eclipse.e4.ui.workbench.IWorkbench;

import com.company.test1.application.states.AppState;
import com.company.test1.application.utils.ChangeLanguageManager;
import com.company.test1.application.localization.Messages;

public class SetLanguageHandler {

	@Inject
	@Translation
	protected Messages messages;

	@Inject
	private AppState appState;

	@CanExecute
	private boolean canExecute() {
		return true;
	}

	@Execute
	public void execute(@Named("com.company.test1.application.commandparameter.parameter1") String language, IWorkbench application) {
		appState.setCurrentLanguage(language);
		new ChangeLanguageManager(messages).setLanguage(application, language);
	}

}
