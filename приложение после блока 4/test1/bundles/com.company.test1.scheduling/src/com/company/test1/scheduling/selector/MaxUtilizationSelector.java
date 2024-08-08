package com.company.test1.scheduling.selector;

import java.util.Comparator;
import java.util.List;

import com.company.test1.scheduling.Schedule;
import com.company.test1.scheduling.alternatives.Alternative;

public class MaxUtilizationSelector implements AlternativeSelector {
	
	private static Comparator<Alternative> COMPARATOR = Comparator
			.comparingDouble(alt -> getPenalty(alt));

	@Override
	public Alternative select(List<Alternative> alternatives) {
		return alternatives.stream().sorted(COMPARATOR).findFirst().get();
	}
	
	private static double getPenalty(Alternative alt) {
		
		// Первая группа альтернатив: слоты завершается левее, чем красная линия - ПРЕДПОЧИТАЕМЫЕ
		// Остальные (вторая группа) - менее предпочтительные
		
		Schedule schedule = alt.getSchedule();
		double delay = Math.max(0, alt.endTime() - schedule.dateToTime(schedule.getScenario().getEndDate()));
		
		if (delay == 0.0) {
			// первая группа альтернатив - отрицательные штрафы
			return -alt.getSchedule().getUtilization(alt.getOperationSlot().getWorkCenter());
		} else {
			return delay;
		}
		
	}

}
