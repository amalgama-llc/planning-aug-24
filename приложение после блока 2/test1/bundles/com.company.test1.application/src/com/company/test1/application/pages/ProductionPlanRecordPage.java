package com.company.test1.application.pages;

import org.eclipse.emf.databinding.FeaturePath;

import com.amalgamasimulation.desktop.binding.UpdateValueStrategyFactory;
import com.company.test1.application.localization.Messages;
import com.company.test1.datamodel.DatamodelPackage;
import com.company.test1.datamodel.ProductionPlanRecord;

public class ProductionPlanRecordPage extends AbstractPage<ProductionPlanRecord> {

	public ProductionPlanRecordPage(Messages messages) {
		super(messages, null);
	}

	@Override
	public boolean isVisible(Object selectedObject) {
		return selectedObject instanceof ProductionPlanRecord;
	}
	
	@Override
	protected String getNameClassObject() {
		return messages.obj_PRODUCTION_PLAN;
	}
	
	@Override
	protected String getObjectDisplayName() {
		var product = observable.getValue().getProduct();
		return product != null ? product.getName() : "";
	}
	
	@Override
	protected FeaturePath[] getUpdateListeners() {
		return new FeaturePath [] {
				FeaturePath.fromList(DatamodelPackage.Literals.PRODUCTION_PLAN_RECORD__PRODUCT),
				FeaturePath.fromList(DatamodelPackage.Literals.PRODUCTION_PLAN_RECORD__PLANNED_DATE),
				FeaturePath.fromList(DatamodelPackage.Literals.PRODUCTION_PLAN_RECORD__QUANTITY)
				};
	}

	@Override
	protected void createControlsInternal() {
		addReferenceSection(messages.obj_PRODUCT, DatamodelPackage.Literals.PRODUCTION_PLAN_RECORD__PRODUCT)
			.addAutoCompleteTextbox(DatamodelPackage.Literals.PRODUCT__NAME, dataBinding.productsObservable)
			.addSelectionDialogButton(messages.obj_PRODUCT, dataBinding.productsObservable, tableView -> {
				tableView.addColumn(messages.obj_PRODUCT_col_NAME, 200, p -> p == null ? "" : p.getName());
			})
			.addClearButton()
			.setTextFieldCanBeEmpty(false);
		addStringSection(messages.obj_PRODUCTION_PLAN_RECORD_col_QUANTITY, DatamodelPackage.Literals.PRODUCTION_PLAN_RECORD__QUANTITY)
			.addTextbox(UpdateValueStrategyFactory.integerPositive());
		addDateTimeSection(messages.obj_PRODUCTION_PLAN_RECORD_col_PLANNED_DATE, DatamodelPackage.Literals.PRODUCTION_PLAN_RECORD__PLANNED_DATE)
			.addTextbox(UpdateValueStrategyFactory.localDateTime())
			.addLocalDateTimeEditorButton()
			.setEnabled(true);
	}
}
