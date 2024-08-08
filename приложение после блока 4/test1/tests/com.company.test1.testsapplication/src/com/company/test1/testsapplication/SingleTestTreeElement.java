package com.company.test1.testsapplication;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import org.opentest4j.AssertionFailedError;

import com.company.test1.scheduling.Schedule;
import com.company.test1.tests.utils.AbstractVisualizedTest;

public class SingleTestTreeElement extends TreeElement{
	
	private Supplier<Object> instanceSupplier;
	private Method testMethod;
	private List<Method> initializationMethods;
	private RunResult runResult = RunResult.NONE;
	private Schedule schedule;
	
	public SingleTestTreeElement(	String name,
									Supplier<Object> instanceSupplier,
									Method testMethod,
									List<Method> initializationMethods) {
		super(name);
		this.instanceSupplier = instanceSupplier;
		this.testMethod = testMethod;
		this.initializationMethods = initializationMethods;
	}
	
	@Override
	public List<TreeElement> getChildElements() {
		return Collections.emptyList();
	}
	
	public RunResult getRunResult() {
		return runResult;
	}
	
	public void setRunResult(RunResult runResult) {
		this.runResult = runResult;
	}
	
	public Schedule getSchedule() {
		return schedule;
	}
	
	public void runTest() {		
		try {
			AbstractVisualizedTest visualizedTest = (AbstractVisualizedTest) instanceSupplier.get();
			for (Method initializationMethod : initializationMethods) {
				initializationMethod.invoke(visualizedTest);
			}
			testMethod.invoke(visualizedTest);
			schedule = visualizedTest.getSchedule();
			runResult = RunResult.PASSED;
		} catch (Exception e) {
			if (e.getCause() instanceof AssertionFailedError) {
				runResult = RunResult.FAILED;
			} else {
				runResult = RunResult.ERROR;
			}
		}
	}
}
