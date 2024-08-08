package com.company.test1.tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
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
import com.company.test1.scheduling.selector.FirstAlternativeSelector;
import com.company.test1.tests.utils.AbstractVisualizedTest;

public class ScheduledOperationsTest extends AbstractVisualizedTest {
	
	@Test
	@DisplayName("After 3 steps, schedule is not complete")
	public void test1() {
		this.scenario = createScenario();
		var schedule = new Schedule(scenario, new FirstAlternativeSelector());
		setSchedule(schedule);
		schedule.schedule(3);
		assertFalse(schedule.allOperationsAreScheduled());
	}
	
	@Test
	@DisplayName("After 2 steps, schedule is complete NEW")
	public void test222() {
		this.scenario = createScenario();
		var schedule = new Schedule(scenario, new FirstAlternativeSelector());
		setSchedule(schedule);
		schedule.schedule(2);
		assertFalse(schedule.allOperationsAreScheduled());
	}
	
	@Test
	@DisplayName("After 6 steps, schedule is complete")
	public void test2() {
		this.scenario = createScenario();
		var schedule = new Schedule(scenario, new FirstAlternativeSelector());
		setSchedule(schedule);
		schedule.schedule(6);
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

		WorkCenter cutter = factory.addWorkCenter("Cutter");
		WorkCenter press = factory.addWorkCenter("Press");
		WorkCenter painter = factory.addWorkCenter("Painting chamber");

		product.getOperations().addAll(List.of(cutting, molding, painting));

		factory.addPerformanceRecord(cutter, cutting, 60, 150);
		factory.addPerformanceRecord(press, molding, 120, 120);
		factory.addPerformanceRecord(painter, painting, 30, 50);

		factory.addProductionPlan(product, LocalDateTime.parse("2023-05-03T00:00"), 2);
		
		return factory.getScenario();
	}
	
	
}
