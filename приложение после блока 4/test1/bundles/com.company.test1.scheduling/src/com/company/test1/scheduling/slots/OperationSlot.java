package com.company.test1.scheduling.slots;

import com.company.test1.datamodel.Operation;
import com.company.test1.datamodel.Product;
import com.company.test1.datamodel.WorkCenter;

public class OperationSlot extends WorkCenterSlot {

	private final Operation operation;
	private final Product product;
	private final int productionPlanItemIndex;
	private final int operationIndex;
	
	public OperationSlot(
			double beginTime, 
			double endTime, 
			WorkCenter workCenter, 
			double cost, 
			Operation operation, 
			Product product, 
			int productionPlanItemIndex, 
			int operationIndex) {
		super(beginTime, endTime, workCenter, cost);
		this.operation = operation;
		this.product = product;
		this.productionPlanItemIndex = productionPlanItemIndex;
		this.operationIndex = operationIndex;
	}

	public Operation getOperation() {
		return operation;
	}

	public Product getProduct() {
		return product;
	}
	
	public int getProductionPlanItemIndex() {
		return productionPlanItemIndex;
	}

	public int getOperationIndex() {
		return operationIndex;
	}
	
	@Override
	public String toString() {
		return "%s #%s - %s".formatted(product.getName(), productionPlanItemIndex + 1, operation.getName());
	}
	
}
