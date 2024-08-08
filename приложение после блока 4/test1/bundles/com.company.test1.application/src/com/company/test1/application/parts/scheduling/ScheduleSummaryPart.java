package com.company.test1.application.parts.scheduling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;

import org.eclipse.swt.widgets.Composite;

import com.amalgamasimulation.desktop.ui.views.TableView;
import com.amalgamasimulation.desktop.utils.MessageManager;
import com.company.test1.application.utils.Topics;
import com.company.test1.scheduling.Schedule;
import com.amalgamasimulation.utils.format.Formats;

public class ScheduleSummaryPart {
	
	record NameAndValue(String name, String value) {}
	
	@Inject
	private MessageManager messageManager;
	
	private TableView<NameAndValue> tableView;

	@PostConstruct
	public void createComposite(Composite parent) {
		tableView = new TableView<>(parent, Collections.emptyList(), false, true);
		tableView.addColumn("Name", t -> t.name());
		tableView.addColumn("Value", t -> t.value());
		
		messageManager.subscribe(Topics.SHOW_SCHEDULE, this::onShowSchedule);
	}
	
	private void onShowSchedule(Schedule schedule) {
		List<NameAndValue> tableData = new ArrayList<>();
		tableData.add(new NameAndValue("Total cost", Formats.getDefaultFormats().twoDecimals(schedule.getTotalCost())));
		var beginAndEndDate = schedule.getActualScheduleBeginAndEndDate();
		if (beginAndEndDate != null) {
			tableData.add(new NameAndValue("Begin date", Formats.getDefaultFormats().dayMonthLongYearHoursMinutes(beginAndEndDate.first())));
			tableData.add(new NameAndValue("End date", Formats.getDefaultFormats().dayMonthLongYearHoursMinutes(beginAndEndDate.second())));
		}
		// по каждому продукту в плане - показать, сколько сделано и сколько планировалось
		
		var plan = schedule.getScenario().getProductionPlanRecords();
		var fact = schedule.getCompleted();
		
		tableData.add(new NameAndValue("Produced:", ""));
		for (var planRecord : plan) {
			var product = planRecord.getProduct();
			int planQuantity = planRecord.getQuantity();
			int factQuantity = fact.getOrDefault(product, 0);
			tableData.add(new NameAndValue(" - " + product.getName(), "%s / %s".formatted(factQuantity, planQuantity)));	
		}
		
		tableView.setData(tableData);
	}
}
