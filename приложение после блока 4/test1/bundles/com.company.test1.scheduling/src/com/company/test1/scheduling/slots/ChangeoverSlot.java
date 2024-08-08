package com.company.test1.scheduling.slots;

import com.company.test1.datamodel.WorkCenter;

public class ChangeoverSlot extends WorkCenterSlot {

	public ChangeoverSlot(double beginTime, double endTime, WorkCenter workCenter, double cost) {
		super(beginTime, endTime, workCenter, cost);
	}
	
	@Override
	public String toString() {
		return "Переналадка";
	}

}
