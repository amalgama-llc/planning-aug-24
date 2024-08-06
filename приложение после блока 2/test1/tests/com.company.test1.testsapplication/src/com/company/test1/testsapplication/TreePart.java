package com.company.test1.testsapplication;

import java.awt.Color;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.ToolBar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.wiring.BundleWiring;

import com.amalgamasimulation.desktop.ui.dialogs.DialogUtils;
import com.amalgamasimulation.desktop.ui.dialogs.ProgressDialog;
import com.amalgamasimulation.desktop.ui.dialogs.ProgressDialog.Style;
import com.amalgamasimulation.desktop.ui.views.ToolBarComposite;
import com.amalgamasimulation.desktop.ui.views.TreeView;
import com.amalgamasimulation.desktop.utils.MenuUtils;
import com.amalgamasimulation.desktop.utils.MessageManager;
import com.amalgamasimulation.desktop.utils.ToolbarUtils;
import com.company.test1.application.scenario.ScenarioFileFormat;
import com.company.test1.application.scenario.ScenarioSaver;
import com.company.test1.application.scenario.ScenarioSaver.ScenarioSavingException;
import com.company.test1.application.utils.IconsMapping;
import com.company.test1.application.utils.MessageBoxFactory;
import com.company.test1.application.utils.Topics;
import com.company.test1.datamodel.Scenario;
import com.company.test1.scheduling.Schedule;
import com.company.test1.tests.utils.AbstractVisualizedTest;

import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;

public class TreePart {
	
	@Inject
	private MessageManager messageManager;
	
	private List<TreeElement> groupElements = initializeTests();
	private TreeView<TreeElement> treeView;
	
	@PostConstruct
	protected void createComposite(Composite parent) {
		new ToolBarComposite(parent, this::createToolBar, this::createTreeView);
	}
	
	private void createToolBar(Composite parent) {
		ToolBar toolBar = new ToolBar(parent, SWT.HORIZONTAL);
		ToolbarUtils.addCommandItem(toolBar, IconsMapping.EXPAND_TREE, "Expand all", () -> treeView.expandAll());
		ToolbarUtils.addCommandItem(toolBar, IconsMapping.COLLAPSE_TREE, "Collapse all", () -> treeView.collapseAll());
		ToolbarUtils.addSeparator(toolBar);
		ToolbarUtils.addCommandItem(toolBar, IconsMapping.CHECK, "Run all tests", () -> runAllTests());
		ToolbarUtils.addSeparator(toolBar);
	}
	
	protected void createTreeView(Composite parent) {
		treeView = new TreeView<>(parent, groupElement -> groupElement.getChildElements(), groupElements);
		treeView.addColumn("Name", 350, e -> e.getName());
		treeView.addColumn("Status", 100,  e -> e.getRunResult())
			.setSimpleBackground(e -> 	e.getRunResult() == RunResult.NONE ? Color.white 
										: e.getRunResult() == RunResult.PASSED ? Color.green 
										: Color.red);
		treeView.addDoubleClickHandler((treeElement, e) -> {
			if (treeElement instanceof SingleTestTreeElement test) {
				runWithAnimation(test);
			}
		});
		treeView.addContextMenuHandler((Menu menu, TreeElement treeElement, int columnIndex) -> {
			if (treeElement instanceof SingleTestTreeElement test) {
				MenuUtils.addCommandMenuItem(menu, IconsMapping.CHECK, "Run this test", () -> ProgressDialog.execute("Running '" + test.getName() + "'", () -> runTest(test)));
				MenuUtils.addCommandMenuItem(menu, IconsMapping.CHECK, "Run with animation", () -> runWithAnimation(test));
				var saveToFile = MenuUtils.addCommandMenuItem(menu, IconsMapping.SAVE, "Save scenario to file...", () -> saveToFile(test));
				saveToFile.setEnabled(test.getSchedule() != null);
			} else if (treeElement instanceof TestsGroupTreeElement test) {
				MenuUtils.addCommandMenuItem(menu, IconsMapping.CHECK, "Run tests in group", () -> runAllTests(test));
			}
			MenuUtils.addCommandMenuItem(menu, IconsMapping.CHECK, "Run all tests", () -> runAllTests());
		});
		treeView.setData(groupElements);
	}
	
	private List<TreeElement> initializeTests() {
		Bundle bundle = FrameworkUtil.getBundle(AbstractVisualizedTest.class);
		BundleWiring bw = bundle.adapt(BundleWiring.class);
		var x = bw.listResources("/", "*.java", BundleWiring.FINDENTRIES_RECURSE + BundleWiring.LISTRESOURCES_LOCAL);
		List<Class<?>> classes = new ArrayList<>();
		try {
			for(String className : x) {
				className = className.replace("src/", "").replace(".java", "").replace("/", ".");
				classes.add( bw.getClassLoader().loadClass(className));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		List<TreeElement> treeElements = new ArrayList<>();
		classes.stream().filter(clazz -> AbstractVisualizedTest.class.isAssignableFrom(clazz)).forEach(clazz -> {
			DisplayName classNameAnnotation = (DisplayName)clazz.getAnnotation(DisplayName.class);
			TestsGroupTreeElement testsGroupTreeElement = new TestsGroupTreeElement(classNameAnnotation == null ? clazz.getSimpleName() : classNameAnnotation.value());
			
			List<Method> beforeEachMethods = new ArrayList<Method>();
			Arrays.asList(clazz.getDeclaredMethods()).forEach(method -> {
				if(method.getAnnotation(BeforeEach.class) != null) {
					beforeEachMethods.add(method);
				}
			});
			
			Arrays.asList(clazz.getDeclaredMethods()).forEach(method -> {
				if(		method.getAnnotation(Test.class) != null
						&& method.getAnnotation(Disabled.class) == null) {
					try {
						DisplayName nameAnnotation = method.getAnnotation(DisplayName.class);
						String name = nameAnnotation == null ? method.getName() : nameAnnotation.value();
						testsGroupTreeElement.getChildElements().add(new SingleTestTreeElement(name, () -> {
							try {
								return clazz.getDeclaredConstructors()[0].newInstance();
							} catch (Exception e) {
								e.printStackTrace();
								return null;
							}
						}, method, beforeEachMethods));
					} catch(Exception e) {
						e.printStackTrace();						
					}
				}
			});
			
			if (!testsGroupTreeElement.getChildElements().isEmpty()) {
				treeElements.add(testsGroupTreeElement);
			}
		});
		treeElements.forEach(e -> e.getChildElements().sort(Comparator.comparing(TreeElement::getName)));
		return treeElements.stream().sorted(Comparator.comparing(TreeElement::getName)).collect(Collectors.toList());
	}
	
	private void runAllTests() {
		runAllTests(null);
	}
	
	private void runAllTests(TestsGroupTreeElement element) {
		treeView.updateView();
		List<SingleTestTreeElement> testsToRun = groupElements.stream().filter(e -> element == null || element == e).flatMap(groupElement -> groupElement.getChildElements().stream()).map(te -> (SingleTestTreeElement)te).collect(Collectors.toList());
		if (!testsToRun.isEmpty()) {
			ProgressDialog.execute("Running...", "Cancel", Style.DEFINITE, () -> {
				testsToRun.forEach(test -> {
					test.setRunResult(RunResult.NONE);
				});
				for (int i = 0; i < testsToRun.size(); i++) {
					if (ProgressDialog.cancelPressed()) {
						break;
					}
					SingleTestTreeElement test = testsToRun.get(i);
					ProgressDialog.setMessage("Running " + (i + 1) + " of " + testsToRun.size() + " (Failed: " + testsToRun.stream().filter(t -> t.getRunResult() == RunResult.FAILED || t.getRunResult() == RunResult.ERROR).count() + ")");
					ProgressDialog.setProgress((double)i / (double)testsToRun.size());
					test.runTest();
				}
			}, () -> {});
			treeView.updateView();
		}
	}
	
	private void runTest(SingleTestTreeElement test) {
		messageManager.send(Topics.SHOW_SCHEDULE, null);
		test.runTest();
		treeView.updateView();
	}
	
	private void runWithAnimation(SingleTestTreeElement test) {
		test.runTest();
		messageManager.send(Topics.SHOW_SCHEDULE, test.getSchedule());
		treeView.updateView();
	}
	
	private void saveToFile(SingleTestTreeElement test) {
		Schedule schedule = test.getSchedule();
		if (schedule == null) {
			return;
		}
		DialogUtils.showSaveFileDialog(new Shell(), "Save test scenario as", test.getName(),
				path -> saveScenario(path, schedule.getScenario()), ScenarioFileFormat.EXCEL.filePattern);
	}
	
	private void saveScenario(String path, Scenario scenario) {
		try {
			ScenarioSaver.save(scenario, path);
			MessageBoxFactory.createMessageBox(new Shell(),
                    SWT.ICON_INFORMATION | SWT.OK | SWT.APPLICATION_MODAL,
                    "Scenario saved",
                    String.format("Scenario saved to a file: %s", path));
		} catch (ScenarioSavingException e) {
			MessageBoxFactory.createMessageBox(new Shell(),
	                                      SWT.ICON_WARNING | SWT.OK | SWT.APPLICATION_MODAL,
	                                      "Scenario saving error",
	                                      String.format("Error occurred while saving scenario to a file: %s", e.getMessage()));
		}
	}
	
}
