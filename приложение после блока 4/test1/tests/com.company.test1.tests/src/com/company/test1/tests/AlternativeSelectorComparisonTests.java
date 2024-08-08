package com.company.test1.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.company.test1.datamodel.Operation;
import com.company.test1.datamodel.Product;
import com.company.test1.datamodel.Scenario;
import com.company.test1.datamodel.WorkCenter;
import com.company.test1.scenariogenerator.ScenarioFactory;
import com.company.test1.scheduling.Schedule;
import com.company.test1.scheduling.selector.CheapestSelector;
import com.company.test1.scheduling.selector.EarliestToStartSelector;
import com.company.test1.scheduling.selector.FastestToFinishSelector;
import com.company.test1.scheduling.selector.FirstAlternativeSelector;
import com.company.test1.tests.utils.AbstractVisualizedTest;

public class AlternativeSelectorComparisonTests extends AbstractVisualizedTest {

	@Test
	@DisplayName("After 100 steps, schedule is complete - FIRST")
	public void test2First() {
		this.scenario = createScenario();
		var schedule = new Schedule(scenario, new FirstAlternativeSelector());
		setSchedule(schedule);
		schedule.schedule(100);
		assertTrue(schedule.allOperationsAreScheduled());
	}
	
	@Test
	@DisplayName("After 100 steps, schedule is complete - FastestToFinish")
	public void test2FastestToFinish() {
		this.scenario = createScenario();
		var schedule = new Schedule(scenario, new FastestToFinishSelector());
		setSchedule(schedule);
		schedule.schedule(100);
		assertTrue(schedule.allOperationsAreScheduled());
	}
	
	@Test
	@DisplayName("After 100 steps, schedule is complete - EarliestToStart")
	public void test2EarliestToStart() {
		this.scenario = createScenario();
		var schedule = new Schedule(scenario, new EarliestToStartSelector());
		setSchedule(schedule);
		schedule.schedule(100);
		assertTrue(schedule.allOperationsAreScheduled());
	}
	
	@Test
	@DisplayName("After 100 steps, schedule is complete - Cheapest")
	public void test2Cheapest() {
		this.scenario = createScenario();
		var schedule = new Schedule(scenario, new CheapestSelector());
		setSchedule(schedule);
		schedule.schedule(100);
		assertTrue(schedule.allOperationsAreScheduled());
	}
	
	
	

	private static Scenario createScenario() {
		ScenarioFactory factory = new ScenarioFactory();
		factory.createScenario("Simple", LocalDateTime.parse("2023-05-01T00:00"),
				LocalDateTime.parse("2023-05-04T00:00"));

		Product product = factory.addProduct("Cylinder body");

		Operation cutting = factory.addOperation("Cutting");
		Operation molding = factory.addOperation("Molding");
		Operation painting = factory.addOperation("Painting");

		WorkCenter cutter1 = factory.addWorkCenter("Cutter-1");
		WorkCenter cutter2 = factory.addWorkCenter("Cutter-2");
		WorkCenter press1 = factory.addWorkCenter("Press-1");
		WorkCenter press2 = factory.addWorkCenter("Press-2");
		WorkCenter press3 = factory.addWorkCenter("Press-3");
		WorkCenter painter = factory.addWorkCenter("Painting chamber");

		product.getOperations().addAll(List.of(cutting, molding, painting));

		factory.addPerformanceRecord(cutter1, cutting, 60, 150);
		factory.addPerformanceRecord(cutter2, cutting, 45, 600);
		factory.addPerformanceRecord(press1, molding, 45, 120);
		factory.addPerformanceRecord(press2, molding, 90, 200);
		factory.addPerformanceRecord(press3, molding, 30, 600);
		factory.addPerformanceRecord(painter, painting, 30, 50);

		factory.addProductionPlan(product, LocalDateTime.parse("2023-05-03T00:00"), 20);
		
		return factory.getScenario();
	}
}
