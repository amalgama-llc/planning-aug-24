package com.company.test1.scheduling.slots;

import com.company.test1.datamodel.WorkCenter;

public abstract class WorkCenterSlot extends AbstractSlot {
	
	private final double cost;
	private final WorkCenter workCenter;

	protected WorkCenterSlot(double beginTime, double endTime, WorkCenter workCenter, double cost) {
		super(beginTime, endTime);
		this.workCenter = workCenter;
		this.cost = cost;
	}
	
	public WorkCenter getWorkCenter() {
		return workCenter;
	}
	
	public double getCost() {
		return cost;
	}

}
