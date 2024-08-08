package com.company.test1.scheduling.selector;

import java.util.List;

import com.company.test1.scheduling.alternatives.Alternative;

public class FirstAlternativeSelector implements AlternativeSelector {
	
	@Override
	public Alternative select(List<Alternative> alternatives) {
		return alternatives.get(0);
	}
}
