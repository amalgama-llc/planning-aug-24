package com.company.test1.application.parts.scheduling;

import java.awt.Color;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ToolBar;

import com.amalgamasimulation.charts.TimeGanttChart;
import com.amalgamasimulation.charts.axes.ticks.AxisTimeStyle;
import com.amalgamasimulation.charts.swt.Charts;
import com.amalgamasimulation.charts.utils.GanttChartRow;
import com.amalgamasimulation.charts.utils.LabelSide;
import com.amalgamasimulation.charts.utils.RowHeightPolicy;
import com.amalgamasimulation.charts.visualsets.ConnectionVisualSet;
import com.amalgamasimulation.desktop.ui.views.ToolBarComposite;
import com.amalgamasimulation.desktop.utils.MessageManager;
import com.amalgamasimulation.desktop.utils.ToolbarUtils;
import com.company.test1.application.utils.Topics;
import com.company.test1.datamodel.Product;
import com.company.test1.scheduling.Schedule;
import com.company.test1.scheduling.slots.AbstractSlot;
import com.company.test1.scheduling.slots.OperationSlot;
import com.amalgamasimulation.utils.Colors;
import com.amalgamasimulation.utils.Pair;
import com.amalgamasimulation.utils.format.Formats;
import com.amalgamasimulation.visualsets.VisualSets;

public class SchedulePart {
	
	@Inject
	private MessageManager messageManager;	
	
	private TimeGanttChart ganttChart;
	private Schedule schedule;
		
	@PostConstruct
	public void createComposite(Composite parent) {
		new ToolBarComposite(parent, this::createTopToolBar, this::createContents);
		messageManager.subscribe(Topics.SHOW_SCHEDULE, this::onShowSchedule);
	}
	
	private void createTopToolBar(Composite parent) {
		ToolBar toolBar = new ToolBar(parent, SWT.HORIZONTAL);
		ToolbarUtils.addCommandItem(toolBar, "Run complete scheduling", this::doSchedulingComplete);
		ToolbarUtils.addCommandItem(toolBar, "Make +1 scheduling step", this::doSchedulingStep);
	}
	
	protected void createContents(Composite parent) {
		ganttChart = Charts.gantt(parent, ChronoUnit.MINUTES);
	}
	
	private void doSchedulingComplete() {
		if (this.schedule != null) {
			this.schedule.schedule(Integer.MAX_VALUE);
			messageManager.send(Topics.SHOW_SCHEDULE, this.schedule);
		}
	}
		
	private void doSchedulingStep() {
		if (this.schedule != null) {
			this.schedule.schedule(1);
			messageManager.send(Topics.SHOW_SCHEDULE, this.schedule);
		}
	}
	
	private void onShowSchedule(Schedule schedule) {
		this.schedule = schedule;
		if (schedule != null) {
			ganttChart.getVisualSetContainer().clear();
			ganttChart.getVisualSetContainer().setRowHeightPolicy(RowHeightPolicy.FIXED_ROW_HEIGHT, 50);
			ganttChart.getXAxis().setTimeStyle(AxisTimeStyle.getDefault(schedule.beginDate(), ChronoUnit.MINUTES));
			ganttChart.setLeftMargin(150);
			
			Map<AbstractSlot, GanttChartRow> slotToGanttRowMapping = new HashMap<>();
			Map<Product, Map<Integer, List<OperationSlot>>> productionItemSlots = new HashMap<>();
			
			for (var wcAndSlots : schedule.getWorkCenterSequences()) {
				String workCenterName = wcAndSlots.workCenter().getName();
				GanttChartRow row = new GanttChartRow(workCenterName);
				var slotSequence = wcAndSlots.slots();
				for (var slot : slotSequence.slots()) {
					slotToGanttRowMapping.put(slot, row);
					if (slot instanceof OperationSlot operationSlot) {
						var product = operationSlot.getProduct();
						int productionPlanItemIndex = operationSlot.getProductionPlanItemIndex();
						productionItemSlots.computeIfAbsent(product, p -> new HashMap<>())
											.computeIfAbsent(productionPlanItemIndex, ppi -> new ArrayList<>())
											.add(operationSlot);
					}
				}
				var mainVS = VisualSets.gantt(workCenterName + " main", row, slotSequence);
				mainVS.setBackgroundColor(this::getSlotColor);
				mainVS.addLabel(LabelSide.TOP_LEFT, s -> Formats.getDefaultFormats().dayMonthLongYearHoursMinutes(schedule.timeToDate(s.beginTime())));
				mainVS.addLabel(LabelSide.TOP_RIGHT, s -> Formats.getDefaultFormats().dayMonthLongYearHoursMinutes(schedule.timeToDate(s.endTime())));
				mainVS.addLabel(LabelSide.MIDDLE_CENTER, s -> s.toString());
				
				ganttChart.getVisualSetContainer().addVisualSet(mainVS);
			}
			
			record Arrow(GanttChartRow srcRow, double srcTime, GanttChartRow destRow, double destTime) {}
			List<Arrow> arrows = new ArrayList<>();
			
			// Slots that represent the same 'production plan item' should be connected by arrows			
			for (var itemIndexAndSlots : productionItemSlots.values()) {
				for (var slotList : itemIndexAndSlots.values()) {
					var slotListSorted = new ArrayList<>(slotList);
					Collections.sort(slotListSorted, Comparator.comparingInt(OperationSlot::getOperationIndex));
					for (int i = 0; i < slotListSorted.size() - 1; i++) {
						var thisSlot = slotListSorted.get(i);
						var nextSlot = slotListSorted.get(i + 1);
						var arrow = new Arrow(slotToGanttRowMapping.get(thisSlot), thisSlot.endTime(),
								slotToGanttRowMapping.get(nextSlot), nextSlot.beginTime());
						arrows.add(arrow);
					}
				}
			}
			
			var arrowsVS = new ConnectionVisualSet<Arrow>("arrows", 
					() -> arrows, 
					arrow -> new Pair<>(arrow.srcRow, arrow.srcTime), 
					arrow -> new Pair<>(arrow.destRow, arrow.destTime));
			ganttChart.getVisualSetContainer().addVisualSet(arrowsVS);
		}
	}
	
	private Color getSlotColor(AbstractSlot slot) {
		if (slot instanceof OperationSlot operationSlot) {
			int colorIndex = operationSlot.getProductionPlanItemIndex() * 12 + (Math.abs(operationSlot.getProduct().getName().hashCode() % 2500));
			int r = 70 + (colorIndex * 11 % 150);
			int g = 70 + (colorIndex * 53 % 150);
			int b = 70 + (colorIndex * 29 % 150);
			return new java.awt.Color(r, g, b);
		}
		
		return Colors.BLACK;
	}
		
}
