package com.company.test1.scheduling.selector;

import java.util.Comparator;
import java.util.List;

import com.company.test1.scheduling.alternatives.Alternative;

/**
 * В приоритете - дешёвые альтернативы, но если есть более дорогая альтернатива, чья длительность
 * меньше более чем на 20% - то предпочитаем вторую.
 * 
 * TODO
 * 
 */
public class CheapestThenShortestSelector implements AlternativeSelector {
	
	private static Comparator<Alternative> COMPARATOR = Comparator
			.comparingDouble(alt -> alt.getOperationSlot().getCost());

	@Override
	public Alternative select(List<Alternative> alternatives) {
		return alternatives.stream().sorted(COMPARATOR).findFirst().get();
	}
	
	//private 
	
	// 1. Разбивка по кластерам по времени
	// 2. 
	
	

}
