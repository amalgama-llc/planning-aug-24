package com.company.test1.application.handlers;

import jakarta.inject.Inject;

import org.eclipse.e4.core.di.annotations.Evaluate;

import com.company.test1.application.states.AppState;


public class RecentFilesListMenuItemIsVisibleExpression {
	
	@Inject
	private AppState appState;
	
	@Evaluate
	public boolean evaluate() {
		return appState.isEditor() && appState.getRecentlyOpenedFilesManager().getLastFilePaths().length > 0;
	}
}
