package com.company.test1.application.handlers;

import jakarta.inject.Inject;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.services.nls.Translation;
import org.eclipse.swt.widgets.Shell;

import com.company.test1.application.AppInfo;
import com.amalgamasimulation.desktop.ui.dialogs.AboutDialog;
import com.company.test1.application.localization.Messages;

public class AboutHandler {

	@Inject
	@Translation
	private Messages messages;

	@CanExecute
	private boolean canExecute() {
		return true;
	}

	@Execute
	public void execute(Shell shell) {
		new AboutDialog(shell, new AppInfo()).open();
	}
}
