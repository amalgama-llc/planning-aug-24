package com.company.test1.application.handlers;

import jakarta.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

import com.company.test1.application.states.AppState;
import com.company.test1.application.utils.PerspectiveUtils;

public class ResetPerspectiveHandler {
	@Inject
	protected IEventBroker eventBroker;

	@Inject
	private EPartService partService;

	@Inject
	private AppState appState;

	@Execute
	public void execute(EModelService modelService, MWindow window, MApplication application) {
		PerspectiveUtils.resetPerspectiveByTemplateAll(modelService, application, partService, appState.getCurrentPerspective());
	}
}
