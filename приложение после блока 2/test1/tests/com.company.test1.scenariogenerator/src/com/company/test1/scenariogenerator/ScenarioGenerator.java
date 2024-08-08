package com.company.test1.scenariogenerator;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.amalgamasimulation.emf.excel.EMFExcelSaver;
import com.company.test1.datamodel.Operation;
import com.company.test1.datamodel.Product;
import com.company.test1.datamodel.Scenario;
import com.company.test1.datamodel.WorkCenter;
import com.company.test1.datamodel.data.EMFExcelDataTransform;

/**
 * Run this class as JUnit test suite to generate demo scenarios in the 'scenarios' folder in the project's root folder.
 */
public class ScenarioGenerator {
	private static final String SCENARIOS_OUTPUT_FOLDER = "../../scenarios/";
	
	@Test
	@DisplayName("Several work centers")
	void createScenarioWCWithDifferentPerformance() {
		ScenarioFactory factory = new ScenarioFactory();
		factory.createScenario("Several work centers", LocalDateTime.parse("2023-05-01T00:00"), LocalDateTime.parse("2023-05-04T00:00"));
		
		Product product = factory.addProduct("Cylinder body");
		
		Operation cutting = factory.addOperation("Cutting");
		Operation molding = factory.addOperation("Molding");
		Operation painting = factory.addOperation("Painting");
		
		WorkCenter cutterFast = factory.addWorkCenter("Fast cutter");
		WorkCenter cutterSlow = factory.addWorkCenter("Slow cutter");
		WorkCenter pressOne = factory.addWorkCenter("Press-1");
		WorkCenter pressTwo = factory.addWorkCenter("Press-2");
		WorkCenter painter = factory.addWorkCenter("Painting chamber");
		
		product.getOperations().addAll(List.of(cutting, molding, painting));
		
		factory.addPerformanceRecord(cutterFast, cutting, 60, 120);
		factory.addPerformanceRecord(cutterSlow, cutting, 90, 50);
		factory.addPerformanceRecord(pressOne, molding, 120, 450);
		factory.addPerformanceRecord(pressTwo, molding, 120, 350);
		factory.addPerformanceRecord(painter, painting, 30, 1200);
		
		factory.addProductionPlan(product, LocalDateTime.parse("2023-05-03T00:00"), 7);
		
		saveScenario(factory.getScenario(), SCENARIOS_OUTPUT_FOLDER + "SeveralWorkCenters.xlsx");
	}
	
	@Test
	@DisplayName("Pottery workshop")
	void createScenarioPotteryWorkshop() {
		ScenarioFactory factory = new ScenarioFactory();
		factory.createScenario("Several work centers", LocalDateTime.parse("2024-05-01T00:00"), LocalDateTime.parse("2024-05-31T00:00"));
		
		Product product = factory.addProduct("Фарфоровая чашка");
		
		Operation modeling = factory.addOperation("Лепка");
		Operation firstFiring = factory.addOperation("Утильный обжиг");
		Operation painting = factory.addOperation("Роспись");
		Operation glazing = factory.addOperation("Глазурирование");
		Operation secondFiring = factory.addOperation("Политой обжиг");
		
		WorkCenter potterFast = factory.addWorkCenter("Гончар-1");
		WorkCenter potterSlow = factory.addWorkCenter("Гончар-2");
		WorkCenter potteryKiln = factory.addWorkCenter("Печь");
		WorkCenter painter = factory.addWorkCenter("Художник");
		
		product.getOperations().addAll(List.of(modeling, firstFiring, painting, glazing, secondFiring));
		
		factory.addPerformanceRecord(potterFast, modeling, 15, 120);
		factory.addPerformanceRecord(potterSlow, modeling, 30, 50);
		factory.addPerformanceRecord(potteryKiln, firstFiring, 90, 50);
		factory.addPerformanceRecord(painter, painting, 30, 100);
		factory.addPerformanceRecord(painter, glazing, 5, 100);
		factory.addPerformanceRecord(potteryKiln, secondFiring, 360, 250);
		
		factory.addProductionPlan(product, LocalDateTime.parse("2024-05-31T00:00"), 15);
		
		saveScenario(factory.getScenario(), SCENARIOS_OUTPUT_FOLDER + "PotteryWorkshop.xlsx");
	}
	
	private boolean saveScenario(Scenario scenario, String filepath) {
		EMFExcelSaver<Scenario> saver = EMFExcelDataTransform.emfExcelTransform.createSaver(filepath, scenario);
		boolean result = saver.save();
		if (!result) {
			saver.getErrorsAndWarnings().forEach(System.out::println);
		}
		return result;
	}
}
