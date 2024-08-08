package com.company.test1.application.pages;

import org.eclipse.emf.databinding.FeaturePath;

import com.amalgamasimulation.desktop.binding.UpdateValueStrategyFactory;
import com.company.test1.application.localization.Messages;
import com.company.test1.datamodel.DatamodelPackage;
import com.company.test1.datamodel.Operation;

public class OperationPage extends AbstractPage<Operation> {

	public OperationPage(Messages messages) {
		super(messages, null);
	}

	@Override
	public boolean isVisible(Object selectedObject) {
		return selectedObject instanceof Operation;
	}
	
	@Override
	protected String getNameClassObject() {
		return messages.obj_OPERATION;
	}
	
	@Override
	protected String getObjectDisplayName() {
		return observable.getValue().getName();
	}
	
	@Override
	protected FeaturePath[] getUpdateListeners() {
		return new FeaturePath [] {
				FeaturePath.fromList(DatamodelPackage.Literals.OPERATION__NAME),
				FeaturePath.fromList(DatamodelPackage.Literals.OPERATION__MIN_DELAY_BEFORE_NEXT_MINUTES)};
	}

	@Override
	protected void createControlsInternal() {
		addStringSection(messages.obj_OPERATION_col_NAME, DatamodelPackage.Literals.OPERATION__NAME)
			.addTextbox(UpdateValueStrategyFactory.stringIsNotEmpty());
		addStringSection("Min delay before next operation, minutes", DatamodelPackage.Literals.OPERATION__MIN_DELAY_BEFORE_NEXT_MINUTES)
			.addTextbox(UpdateValueStrategyFactory.doublePositiveWithZero(0));
	}
}
