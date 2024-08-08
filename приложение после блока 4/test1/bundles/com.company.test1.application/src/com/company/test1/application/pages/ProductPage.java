package com.company.test1.application.pages;

import org.eclipse.emf.databinding.FeaturePath;

import com.amalgamasimulation.desktop.binding.UpdateValueStrategyFactory;
import com.company.test1.application.localization.Messages;
import com.company.test1.datamodel.DatamodelPackage;
import com.company.test1.datamodel.Product;

public class ProductPage extends AbstractPage<Product> {

	public ProductPage(Messages messages) {
		super(messages, null);
	}

	@Override
	public boolean isVisible(Object selectedObject) {
		return selectedObject instanceof Product;
	}
	
	@Override
	protected String getNameClassObject() {
		return messages.obj_PRODUCT;
	}
	
	@Override
	protected String getObjectDisplayName() {
		return observable.getValue().getName();
	}
	
	@Override
	protected FeaturePath[] getUpdateListeners() {
		return new FeaturePath [] {FeaturePath.fromList(DatamodelPackage.Literals.PRODUCT__NAME)};
	}

	@Override
	protected void createControlsInternal() {
		addStringSection(messages.obj_OPERATION_col_NAME, DatamodelPackage.Literals.PRODUCT__NAME)
			.addTextbox(UpdateValueStrategyFactory.stringIsNotEmpty());
	}
}
