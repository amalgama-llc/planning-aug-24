package com.company.test1.application.pages;

import org.eclipse.emf.databinding.FeaturePath;

import com.amalgamasimulation.desktop.binding.UpdateValueStrategyFactory;
import com.company.test1.application.localization.Messages;
import com.company.test1.datamodel.DatamodelPackage;
import com.company.test1.datamodel.WorkCenter;

public class WorkCenterPage extends AbstractPage<WorkCenter> {

	public WorkCenterPage(Messages messages) {
		super(messages, null);
	}

	@Override
	public boolean isVisible(Object selectedObject) {
		return selectedObject instanceof WorkCenter;
	}
	
	@Override
	protected String getNameClassObject() {
		return messages.obj_WORK_CENTER;
	}
	
	@Override
	protected String getObjectDisplayName() {
		return observable.getValue().getName();
	}
	
	@Override
	protected FeaturePath[] getUpdateListeners() {
		return new FeaturePath [] {FeaturePath.fromList(DatamodelPackage.Literals.WORK_CENTER__NAME)};
	}

	@Override
	protected void createControlsInternal() {
		addStringSection(messages.obj_WORK_CENTER_col_NAME, DatamodelPackage.Literals.WORK_CENTER__NAME)
			.addTextbox(UpdateValueStrategyFactory.stringIsNotEmpty());
	}
}
