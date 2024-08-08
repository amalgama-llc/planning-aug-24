package com.company.test1.application.parts.editor.treeelements;

import java.time.temporal.ChronoField;
import java.util.List;

import com.amalgamasimulation.utils.format.Formats;
import com.company.test1.application.utils.TreeElementType;
import com.company.test1.application.localization.Messages;
import com.company.test1.datamodel.Scenario;

public class TreeElementScenario extends TreeElement {
	private Scenario scenario;
	private Messages messages;

	public TreeElementScenario(Scenario scenario, Messages messages) {
		super(TreeElementType.SCENARIO, scenario);
		this.scenario = scenario;
		this.messages = messages;
	}

	@Override
	public String getLabel() {
		return messages.obj_SCENARIO + 
				" " + Formats.getDefaultFormats().dayMonthLongYear(scenario.getBeginDate()) + 
				" - " + Formats.getDefaultFormats().dayMonthLongYear(scenario.getEndDate()) +
				", " + (scenario.getEndDate().getLong(ChronoField.EPOCH_DAY) - scenario.getBeginDate().getLong(ChronoField.EPOCH_DAY)) + " days";
	}

	@Override
	protected List<TreeElement> createChildElements() {
		return List.of(
				createLeaf(TreeElementType.WORK_CENTER, () -> scenario.getWorkCenters().size()),
				createLeaf(TreeElementType.OPERATION, () -> scenario.getOperations().size()),
				createLeaf(TreeElementType.PRODUCT, () -> scenario.getProducts().size()),
				createLeaf(TreeElementType.PERFORMANCE_RECORD, () -> scenario.getPerformanceRecords().size()),
				createLeaf(TreeElementType.PRODUCTION_PLAN, () -> scenario.getProductionPlanRecords().size()),
				createLeaf(TreeElementType.CHANGEOVER, () -> scenario.getChangeovers().size()),
				createLeaf(TreeElementType.OPERATION_ASSIGNMENT, () -> scenario.getOperationAssignments().size()),
				createLeaf(TreeElementType.UNAVAILABILITY_ASSIGNMENT, () -> scenario.getUnavailabilityAssignments().size())
				);
	}
	
}
