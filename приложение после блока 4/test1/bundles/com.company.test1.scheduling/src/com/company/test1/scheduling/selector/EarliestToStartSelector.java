package com.company.test1.scheduling.selector;

import java.util.Comparator;
import java.util.List;

import com.company.test1.scheduling.alternatives.Alternative;

public class EarliestToStartSelector implements AlternativeSelector {
	
	private static Comparator<Alternative> COMPARATOR = Comparator
			.comparingDouble(alt -> alt.beginTime());

	@Override
	public Alternative select(List<Alternative> alternatives) {
		return alternatives.stream().sorted(COMPARATOR).findFirst().get();
	}

}
