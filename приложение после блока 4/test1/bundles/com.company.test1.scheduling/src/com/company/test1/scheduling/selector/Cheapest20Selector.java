package com.company.test1.scheduling.selector;

import java.util.Comparator;
import java.util.List;

import com.amalgamasimulation.utils.Utils;
import com.company.test1.scheduling.alternatives.Alternative;

public class Cheapest20Selector implements AlternativeSelector {
	
	private static Comparator<Alternative> COMPARATOR = Comparator
			.comparingDouble(alt -> getPenalty(alt));

	@Override
	public Alternative select(List<Alternative> alternatives) {
		if (alternatives.isEmpty()) {
			return null;
		}
		Alternative cheapest = alternatives.getFirst();
		Alternative fastestToComplete = alternatives.getFirst();
		for (int i = 1; i < alternatives.size(); i++) {
			var alt = alternatives.get(i);
			if (alt.getCost() < cheapest.getCost()) {
				cheapest = alt;
			}
			if (alt.endTime() < fastestToComplete.endTime()) {
				fastestToComplete = alt;
			}
		}
		
		double cheapestDelayMinutes = getDelay(cheapest);
		double fastestDelay = getDelay(fastestToComplete);
		
		// если самая быстрая альтернатива быстрее более чем на 20% , чем самая дешёвая - вернуть быструю, иначе - дешёвую
		if (Utils.zidz(cheapestDelayMinutes, fastestDelay) >= 1.25) {
			return fastestToComplete;
		}
		return cheapest;
		
		
		
		//return alternatives.stream().sorted(COMPARATOR).findFirst().get();
	}
	
	private double getDelay(Alternative alt) {
		return alt.endTime()
		- alt.getSchedule().getLastAddedSlotEndTime(alt.getOperationSlot().getProduct(),
				alt.getOperationSlot().getProductionPlanItemIndex());
	}
	
	private static double getPenalty(Alternative alt) {
		double penalty = alt.getCost();
		if (alt.getOperationSlot().getOperationIndex() == 0) {
			// прибавляем большой штраф (не глядя на масштаб цен)
			penalty += 1000000;
		}
		return penalty;
	}

}
