package com.company.test1.scheduling.alternatives;

import com.company.test1.scheduling.Pointer;
import com.company.test1.scheduling.Schedule;
import com.company.test1.scheduling.slots.OperationSlot;

/**
 * Alternative represents one of the possible ways to make the next scheduling
 * step. It contains the (future) slot to be added to the schedule.
 * <p>
 * Alternatives are created at the outset of each scheduling step; current
 * schedule is considered. Any alternative created for some scheduling step may
 * be applied at that step, and the resulting schedule will still be valid
 * (i.e., it will not contain any errors).
 *
 */
public class Alternative {
	protected int id;
	protected Schedule schedule;
	protected OperationSlot operationSlot;
	protected Pointer pointer;

	public Alternative(Schedule schedule, OperationSlot operationSlot, Pointer pointer) {
		this.id = schedule.nextAlternativeId();
		this.schedule = schedule;
		this.operationSlot = operationSlot;
		this.pointer = pointer;
	}

	public int getId() {
		return id;
	}

	public Schedule getSchedule() {
		return schedule;
	}
	
	public OperationSlot getOperationSlot() {
		return operationSlot;
	}

	public void apply() {
		schedule.getWorkCenterSequence(operationSlot.getWorkCenter()).insert(operationSlot.beginTime(), operationSlot);

		schedule.removePointer(pointer);
		
		if (pointer.isLastOperation()) {
			// доделали изделие
			schedule.addCompleted(pointer.getProduct());
		}
		
		schedule.addTotalCost(operationSlot.getCost());
		
		if (!pointer.isLastOperation()) {
			// create a pointer to the next operation in the same production item
			Pointer newPointer = pointer.nextOperationPointer(operationSlot.endTime() + operationSlot.getOperation().getMinDelayBeforeNextMinutes());
			schedule.addPointer(newPointer);
		}
				
		if (!pointer.isLastItem()) {
			if (pointer.isFirstOperation()) {
				// create a pointer to the 1st operation in the next production item
				Pointer newPointer = pointer.nextProductionPlanItemPointer(0);
				schedule.addPointer(newPointer);
			}
		}
	}
	
	@Override
	public String toString() {
		return operationSlot.toString() + "@" + operationSlot.getWorkCenter().getName();
	}

}
