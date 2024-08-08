package com.company.test1.application.scenario;

import com.amalgamasimulation.emf.excel.EMFExcelLoader;
import com.amalgamasimulation.emf.excel.EMFExcelTransform;
import com.company.test1.datamodel.Scenario;

public class ScenarioLoader {
	
	private ScenarioLoader() {}

	public static EMFExcelLoader<Scenario> loadExcel(EMFExcelTransform<Scenario> emfExcelTransform, String filePath) {
		EMFExcelLoader<Scenario> loader = emfExcelTransform.createLoader(filePath);
		loader.load();
		return loader;
	}
}
