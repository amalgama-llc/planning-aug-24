package com.company.test1.scheduling.slots;

import com.company.test1.datamodel.WorkCenter;

public class UnavailabilitySlot extends WorkCenterSlot {

	public UnavailabilitySlot(double beginTime, double endTime, WorkCenter workCenter) {
		super(beginTime, endTime, workCenter, 0.0);
	}
	
	@Override
	public String toString() {
		return "Недоступность";
	}

}
