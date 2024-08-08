package com.company.test1.application.handlers;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.swt.widgets.Shell;

import com.company.test1.application.dialogs.AmalgamaPlatformLicenseDialog;

public class AmalgamaLicenseHandler {
	
	@CanExecute
	private boolean canExecute() {
		return true;
	}

	@Execute
	public void execute(Shell shell) {
		new AmalgamaPlatformLicenseDialog().open();
	}

}
