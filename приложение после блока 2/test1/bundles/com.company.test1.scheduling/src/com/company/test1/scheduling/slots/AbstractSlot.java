package com.company.test1.scheduling.slots;

import com.amalgamasimulation.core.scheduling.Slot;

public abstract class AbstractSlot extends Slot {

	protected AbstractSlot(double beginTime, double endTime) {
		super(beginTime, endTime);
	}

}
