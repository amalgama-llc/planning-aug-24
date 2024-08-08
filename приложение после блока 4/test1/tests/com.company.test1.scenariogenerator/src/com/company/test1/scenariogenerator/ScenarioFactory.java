package com.company.test1.scenariogenerator;

import java.time.LocalDateTime;

import com.amalgamasimulation.emf.excel.EMFExcelLoader;
import com.amalgamasimulation.emf.excel.EMFExcelSaver;
import com.company.test1.datamodel.DatamodelFactory;
import com.company.test1.datamodel.Operation;
import com.company.test1.datamodel.PerformanceRecord;
import com.company.test1.datamodel.Product;
import com.company.test1.datamodel.ProductionPlanRecord;
import com.company.test1.datamodel.Scenario;
import com.company.test1.datamodel.WorkCenter;
import com.company.test1.datamodel.data.EMFExcelDataTransform;

public class ScenarioFactory {
	private Scenario scenario;

	public Scenario getScenario() {
		return scenario;
	}

	public Scenario loadScenario(String path) {
		EMFExcelLoader<Scenario> loader = EMFExcelDataTransform.emfExcelTransform.createLoader(path);
		loader.load();
		if (!loader.isLoaded()) {
			loader.getErrorsAndWarnings().forEach(System.out::println);
		}
		scenario = loader.getRootObject();
		return scenario;
	}

	public boolean saveScenario(String filepath) {
		EMFExcelSaver<Scenario> saver = EMFExcelDataTransform.emfExcelTransform.createSaver(filepath, scenario);
		boolean result = saver.save();
		if (!result) {
			saver.getErrorsAndWarnings().forEach(System.out::println);
		}
		return result;
	}

	public Scenario createScenario(String name, LocalDateTime begin, LocalDateTime end) {
		scenario = DatamodelFactory.eINSTANCE.createScenario();
		scenario.setName(name);
		scenario.setBeginDate(begin);
		scenario.setEndDate(end);
		return scenario;
	}

	public Product addProduct(String name) {
		Product product = DatamodelFactory.eINSTANCE.createProduct();
		product.setName(name);
		scenario.getProducts().add(product);
		return product;
	}

	public WorkCenter addWorkCenter(String name) {
		WorkCenter workCenter = DatamodelFactory.eINSTANCE.createWorkCenter();
		workCenter.setName(name);
		scenario.getWorkCenters().add(workCenter);
		return workCenter;
	}

	public Operation addOperation(String name) {
		Operation operation = DatamodelFactory.eINSTANCE.createOperation();
		operation.setName(name);
		scenario.getOperations().add(operation);
		return operation;
	}

	public void addPerformanceRecord(WorkCenter workCenter, Operation operation, double durationMinutes, double cost) {
		PerformanceRecord record = DatamodelFactory.eINSTANCE.createPerformanceRecord();
		record.setWorkCenter(workCenter);
		record.setOperation(operation);
		record.setDurationMinutes(durationMinutes);
		record.setCost(cost);
		scenario.getPerformanceRecords().add(record);
	}

	public void addProductionPlan(Product product, LocalDateTime plannedDate, int quantity) {
		ProductionPlanRecord item = DatamodelFactory.eINSTANCE.createProductionPlanRecord();
		item.setProduct(product);
		item.setQuantity(quantity);
		item.setPlannedDate(plannedDate);
		scenario.getProductionPlanRecords().add(item);
	}
}
