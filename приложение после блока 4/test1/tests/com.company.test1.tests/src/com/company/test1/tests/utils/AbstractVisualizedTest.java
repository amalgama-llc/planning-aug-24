package com.company.test1.tests.utils;

import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.nio.file.Paths;

import com.amalgamasimulation.emf.excel.EMFExcelLoader;
import com.company.test1.datamodel.Scenario;
import com.company.test1.datamodel.data.EMFExcelDataTransform;
import com.company.test1.scheduling.Schedule;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This is the base class for all tests that can be visualized with the test
 * application
 *
 */
public abstract class AbstractVisualizedTest {

	private static String testsFolder;
	
	protected Scenario scenario;
	
	protected AbstractVisualizedTest() {
		initTestsFolder();
	}
	
	// initialize testsFolder once
	private static void initTestsFolder() {
		if (testsFolder == null) {
			Bundle bundle = FrameworkUtil.getBundle(AbstractVisualizedTest.class);
			String basePath;
			if (bundle == null) {
				// 'Run as JUnit' from Eclipse. Test project's folder is the current folder.
				basePath = ".";
			} else {
				String bundleLocation = bundle.getLocation();
				// NOTE: include these 4 bundles into your GUI test app's dependencies list: 
				// org.eclipse.equinox.p2.core, org.eclipse.equinox.p2.engine, org.eclipse.equinox.p2.metadata, org.eclipse.equinox.p2.operations
				if (bundleLocation.startsWith("initial@")) {
					// Running tests from console. Test project's folder is the current folder.
					basePath = ".";
				} else {
					// Running tests from Eclipse using a UI application. Current folder is the Eclipse IDE's folder,
					// so we need to extract the bundle's path.
					basePath = bundleLocation.replace("reference:file:/", "");
				}
			}
			testsFolder = Paths.get(basePath, "..", "..", "scenarios").toFile().getAbsolutePath();
		}
	}
	
	private Schedule schedule;
	
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}	

	public void loadScenario(String relativePathToScenarioFile) {
		String filePath = testsFolder + File.separatorChar + relativePathToScenarioFile;
		EMFExcelLoader<Scenario> loader = EMFExcelDataTransform.emfExcelTransform.createLoader(filePath);
		if (!loader.load()) {
			fail("Unable to load scenario file: " + relativePathToScenarioFile + loader.getErrors());
		}
		this.scenario = loader.getRootObject();
	}
	
	public Schedule getSchedule() {
		return schedule;
	}
}
