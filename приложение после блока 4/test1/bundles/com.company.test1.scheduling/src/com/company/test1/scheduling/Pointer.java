package com.company.test1.scheduling;

import com.company.test1.datamodel.Operation;
import com.company.test1.datamodel.Product;

/**
 * This class describes the next production operation to be scheduled.
 * <p>
 * A production plan record describes the quantity of some product to be
 * produced. All product items made according to some production plan record are
 * equal in terms of production operations required, so the order of product
 * items manufacturing makes no difference. Besides, any two production
 * operations being performed on different product items of the same production
 * plan record also do not depend on each other.
 * <p>
 * Let's assign a 0-based index to each item in the same production plan record.
 * This index can be used as 'priority': when there are two different items
 * within a production plan record that both have the same next operation to be
 * scheduled, we will pick the item with the lowest index (i.e., highest
 * priority).
 * <p>
 * A pointer keeps the information about the next operation to be scheduled for
 * some item being produced.
 * <p>
 * Pointers are managed by {@link Schedule} and {@link Alternative} classes as
 * follows:
 * <ul>
 * <li>During {@link Schedule} initialization, a single pointer is created for
 * each production plan record - the pointer for an item with index 0 pointing
 * to its first (when scheduling LEFT_TO_RIGHT) or last (when scheduling
 * RIGHT_TO_LEFT) production operation. See the {@link Schedule} class
 * constructor for details.</li>
 * <li>When some Alternative is applied and a production step is scheduled for
 * some existing Pointer, this Pointer is disposed. Each of the following two
 * new Pointers may then be created (see {@link Alternative#apply()}):
 * <ul>
 * <li>for the next/previous (depending on scheduling direction) operation on
 * the same product item, if there are any operations left;</li>
 * <li>for the first/last (depending on scheduling direction) operation of the
 * next product item in the production plan record, if there are product items
 * left.</li>
 * </ul>
 * </ul>
 * <p>
 * The {@link Pointer} class is immutable.
 * <p>
 * Pointers are also used to generate {@link Alternative}s.
 * 
 * @see Schedule
 * @see Alternative
 *
 */
public class Pointer {
	
	private final Schedule schedule;
	private final Product product;
	private final int productionPlanRecordQuantity;
	private final int productionPlanItemIndex;
	private final int operationIndex;
	private final double minBeginTime;
	private final double maxEndTime;
	private final Operation operation;
	
	public Pointer(Schedule schedule, Product product, int productionPlanRecordQuantity, int operationIndex, double maxEndTime) {
		this(schedule, product, productionPlanRecordQuantity, 0, operationIndex, 0.0, maxEndTime);
	}
	
	public Pointer(Schedule schedule, Product product, int productionPlanRecordQuantity, 
			int productionPlanItemIndex, int operationIndex, double minBeginTime, double maxEndTime) {
		this.schedule = schedule;
		this.productionPlanRecordQuantity = productionPlanRecordQuantity;
		this.product = product;		
		this.productionPlanItemIndex = productionPlanItemIndex;
		this.operationIndex = operationIndex;
		this.operation = product.getOperations().get(operationIndex);
		this.minBeginTime = minBeginTime;
		this.maxEndTime = maxEndTime;
	}
	
	/**
	 * Returns a new Pointer for the next operation on the same production plan item.
	 * New Pointer's max end time is the same as that of this Pointer.
	 */
	public Pointer nextOperationPointer(double minBeginTime) {
		return new Pointer(	schedule,
							getProduct(),
							getProductionPlanRecordQuantity(), 
							getProductionPlanItemIndex(), 
							getOperationIndex() + 1,  
							minBeginTime,
							maxEndTime);
	}

	/**
	 * Returns a new Pointer for the previous operation on the same production plan item.
	 * New Pointer's min begin time is the same as that of this Pointer.
	 */
	public Pointer previousOperationPointer(double maxEndTime) {
		return new Pointer(	schedule,
							getProduct(),
							getProductionPlanRecordQuantity(), 
							getProductionPlanItemIndex(), 
							getOperationIndex() - 1,  
							minBeginTime,
							maxEndTime);
	}
	
	/**
	 * Returns a new Pointer for the operation with index {@code operationIndex} on the next production plan item.
	 * Min begin time and max end time for the created Pointer are copied from this Pointer.
	 */
	public Pointer nextProductionPlanItemPointer(int operationIndex) {
		return new Pointer(	schedule,
							getProduct(),
							getProductionPlanRecordQuantity(), 
							getProductionPlanItemIndex() + 1, 
							operationIndex,  
							minBeginTime,
							maxEndTime);
	}

	public double getMinBeginTimeForOperation() {
		return minBeginTime;
	}
	
	public double getMaxEndTimeForOperation() {
		return maxEndTime;
	}	
	
	public boolean isFirstOperation() {
		return operationIndex == 0;
	}

	public boolean isLastOperation() {
		return operationIndex == product.getOperations().size() - 1;
	}

	public boolean isLastItem() {
		return productionPlanItemIndex == productionPlanRecordQuantity - 1;
	}

	public Schedule getSchedule() {
		return schedule;
	}

	public Product getProduct() {
		return product;
	}
	
	public Operation getOperation() {
		return operation;
	}

	public int getProductionPlanRecordQuantity() {
		return productionPlanRecordQuantity;
	}

	/**
	 * Returns the 0-based index of the current item within the production plan record.
	 */
	public int getProductionPlanItemIndex() {
		return productionPlanItemIndex;
	}

	/**
	 * Returns the 0-based operation index.
	 */
	public int getOperationIndex() {
		return operationIndex;
	}

}
