package com.company.test1.application.pages;

import org.eclipse.emf.databinding.FeaturePath;

import com.amalgamasimulation.desktop.binding.UpdateValueStrategyFactory;
import com.company.test1.application.localization.Messages;
import com.company.test1.datamodel.DatamodelPackage;
import com.company.test1.datamodel.PerformanceRecord;

public class PerformanceRecordPage extends AbstractPage<PerformanceRecord> {

	public PerformanceRecordPage(Messages messages) {
		super(messages, null);
	}

	@Override
	public boolean isVisible(Object selectedObject) {
		return selectedObject instanceof PerformanceRecord;
	}
	
	@Override
	protected String getNameClassObject() {
		return messages.obj_PERFORMANCE_RECORD;
	}
	
	@Override
	protected String getObjectDisplayName() {
		return "";
	}
	
	@Override
	protected FeaturePath[] getUpdateListeners() {
		return new FeaturePath [] {
				FeaturePath.fromList(DatamodelPackage.Literals.PERFORMANCE_RECORD__OPERATION),
				FeaturePath.fromList(DatamodelPackage.Literals.PERFORMANCE_RECORD__COST),
				FeaturePath.fromList(DatamodelPackage.Literals.PERFORMANCE_RECORD__DURATION_MINUTES),
				FeaturePath.fromList(DatamodelPackage.Literals.PERFORMANCE_RECORD__WORK_CENTER)
				};
	}

	@Override
	protected void createControlsInternal() {
		addReferenceSection(messages.obj_OPERATION, DatamodelPackage.Literals.PERFORMANCE_RECORD__OPERATION)
			.addAutoCompleteTextbox(DatamodelPackage.Literals.OPERATION__NAME, dataBinding.operationsObservable)
			.addSelectionDialogButton(messages.obj_OPERATION, dataBinding.operationsObservable, tableView -> {
				tableView.addColumn(messages.obj_OPERATION_col_NAME, 200, p -> p == null ? "" : p.getName());
			})
			.addClearButton()
			.setTextFieldCanBeEmpty(false);
		addReferenceSection(messages.obj_WORK_CENTER, DatamodelPackage.Literals.PERFORMANCE_RECORD__WORK_CENTER)
			.addAutoCompleteTextbox(DatamodelPackage.Literals.WORK_CENTER__NAME, dataBinding.workCentersObservable)
			.addSelectionDialogButton(messages.obj_WORK_CENTER, dataBinding.workCentersObservable, tableView -> {
				tableView.addColumn(messages.obj_WORK_CENTER_col_NAME, 200, p -> p == null ? "" : p.getName());
			})
			.addClearButton()
			.setTextFieldCanBeEmpty(false);
		addStringSection(messages.obj_PERFORMANCE_RECORD_col_DURATION_MINUTES, DatamodelPackage.Literals.PERFORMANCE_RECORD__DURATION_MINUTES)
			.addTextbox(UpdateValueStrategyFactory.doublePositive(0));
		addStringSection(messages.obj_PERFORMANCE_RECORD_col_COST, DatamodelPackage.Literals.PERFORMANCE_RECORD__COST)
			.addTextbox(UpdateValueStrategyFactory.doublePositiveWithZero(0));
	}
}
