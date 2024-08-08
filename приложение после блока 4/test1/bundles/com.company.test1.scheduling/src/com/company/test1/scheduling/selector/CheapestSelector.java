package com.company.test1.scheduling.selector;

import java.util.Comparator;
import java.util.List;

import com.company.test1.scheduling.alternatives.Alternative;

public class CheapestSelector implements AlternativeSelector {
	
	private static Comparator<Alternative> COMPARATOR = Comparator
			.comparingDouble(alt -> getPenalty(alt));

	@Override
	public Alternative select(List<Alternative> alternatives) {
		return alternatives.stream().sorted(COMPARATOR).findFirst().get();
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
