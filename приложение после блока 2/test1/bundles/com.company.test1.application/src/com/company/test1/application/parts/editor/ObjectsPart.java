package com.company.test1.application.parts.editor;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;

import com.amalgamasimulation.utils.format.Formats;
import com.company.test1.application.command.CommandFactory;
import com.company.test1.application.utils.AbstractObjectsPart;
import com.company.test1.application.utils.DataBinding;
import com.company.test1.application.utils.ObjectsPage;
import com.company.test1.application.utils.Topics;
import com.company.test1.application.utils.TreeElementType;
import com.company.test1.datamodel.DatamodelFactory;
import com.company.test1.datamodel.DatamodelPackage;
import com.company.test1.datamodel.Operation;
import com.company.test1.datamodel.PerformanceRecord;
import com.company.test1.datamodel.Product;
import com.company.test1.datamodel.ProductionPlanRecord;
import com.company.test1.datamodel.Scenario;
import com.company.test1.datamodel.WorkCenter;

public class ObjectsPart extends AbstractObjectsPart {
	
	private DataBinding dataBinding = DataBinding.getInstance(eventBroker);

	@SuppressWarnings("all")
	protected IObservableValue<Scenario> scenarioObservable = new WritableValue<>();

	@Override
	protected void registerPages() {
		eventBroker.subscribe(Topics.NEW_SCENARIO, event -> scenarioObservable.setValue(appData.getScenario()));
		
		new ObjectsPage<WorkCenter>(	
									this,
									DatamodelPackage.Literals.SCENARIO__WORK_CENTERS, 
									TreeElementType.WORK_CENTER,
									() -> CommandFactory.create(dataBinding.scenarioObservable.getValue(), messages.obj_WORK_CENTER, "WC-", 
											() -> DatamodelFactory.eINSTANCE.createWorkCenter(), true).getObject(),
									elem -> CommandFactory.remove(elem, true),
									elem -> CommandFactory.copy(elem, -1, true, true).getObject())
				.setTableRefreshBinding(DatamodelPackage.Literals.WORK_CENTER__NAME)
				.setAfterCreateTableElementAction(tableView -> {
					tableView.addColumn(messages.obj_WORK_CENTER_col_NAME, 250, WorkCenter::getName)
							.setIdTextEditingSupport(dataBinding.workCentersObservable,
									DatamodelPackage.Literals.WORK_CENTER__NAME);
				});
		
		new ObjectsPage<Operation>(
									this,
									DatamodelPackage.Literals.SCENARIO__OPERATIONS, 
									TreeElementType.OPERATION,
									() -> CommandFactory.create(dataBinding.scenarioObservable.getValue(), messages.obj_OPERATION, "Op-", 
											() -> DatamodelFactory.eINSTANCE.createOperation(), true).getObject(),
									elem -> CommandFactory.remove(elem, true),
									elem -> CommandFactory.copy(elem, -1, true, true).getObject())
				.setTableRefreshBinding(DatamodelPackage.Literals.OPERATION__NAME,
										DatamodelPackage.Literals.OPERATION__MIN_DELAY_BEFORE_NEXT_MINUTES)
				.setAfterCreateTableElementAction(tableView -> {
					tableView.addColumn(messages.obj_OPERATION_col_NAME, 250, Operation::getName)
							.setIdTextEditingSupport(dataBinding.operationsObservable,
									DatamodelPackage.Literals.OPERATION__NAME);
					tableView
						.addColumn("Min delay before next operation (minutes)", 240, rec -> rec.getMinDelayBeforeNextMinutes())
						.setLabelExtractor(Formats.getDefaultFormats()::noDecimals);
				});
		
		new ObjectsPage<Product>(
									this,
									DatamodelPackage.Literals.SCENARIO__PRODUCTS, 
									TreeElementType.PRODUCT,
									() -> CommandFactory.create(dataBinding.scenarioObservable.getValue(), messages.obj_PRODUCT, "Pr-", 
											() -> DatamodelFactory.eINSTANCE.createProduct(), true).getObject(),
									elem -> CommandFactory.remove(elem, true),
									elem -> CommandFactory.copy(elem, -1, true, true).getObject())
				.setTableRefreshBinding(DatamodelPackage.Literals.PRODUCT__NAME)
				.setAfterCreateTableElementAction(tableView -> {
					tableView.addColumn(messages.obj_PRODUCT_col_NAME, 250, Product::getName)
							.setIdTextEditingSupport(dataBinding.productsObservable,
									DatamodelPackage.Literals.PRODUCT__NAME);
				});

		new ObjectsPage<ProductionPlanRecord>(
									this,
									DatamodelPackage.Literals.SCENARIO__PRODUCTION_PLAN_RECORDS, 
									TreeElementType.PRODUCTION_PLAN,
									() -> {
										var rec = CommandFactory.create(dataBinding.scenarioObservable.getValue(), 
																		messages.obj_PRODUCTION_PLAN, 
																		"",								
																		() -> DatamodelFactory.eINSTANCE.createProductionPlanRecord(), true).getObject();
										rec.setQuantity(10);
										return rec;},
									elem -> CommandFactory.remove(elem, true),
									elem -> CommandFactory.copy(elem, -1, true, true).getObject())
				.setTableRefreshBinding(
							DatamodelPackage.Literals.PRODUCTION_PLAN_RECORD__PRODUCT, 
							DatamodelPackage.Literals.PRODUCTION_PLAN_RECORD__QUANTITY,
							DatamodelPackage.Literals.PRODUCTION_PLAN_RECORD__PLANNED_DATE)
				.setAfterCreateTableElementAction(tableView -> {
					tableView
							.addColumn(messages.obj_PRODUCT, 250, rec -> rec.getProduct())
							.setLabelExtractorNullable(Product::getName);
					tableView
							.addColumn(messages.obj_PRODUCTION_PLAN_RECORD_col_QUANTITY, 100, rec -> rec.getQuantity());
					tableView
							.addColumn(messages.obj_PRODUCTION_PLAN_RECORD_col_PLANNED_DATE, 140, rec -> rec.getPlannedDate())
							.setLabelExtractorNullable(Formats.getDefaultFormats()::dayMonthLongYearHoursMinutes);
				});
		
		new ObjectsPage<PerformanceRecord>(
									this,
									DatamodelPackage.Literals.SCENARIO__PERFORMANCE_RECORDS, 
									TreeElementType.PERFORMANCE_RECORD,
									() -> {
										var rec = CommandFactory.create(dataBinding.scenarioObservable.getValue(), 
																		messages.obj_PERFORMANCE_RECORD, 
																		"",								
																		() -> DatamodelFactory.eINSTANCE.createPerformanceRecord(), true).getObject();
										rec.setDurationMinutes(60);
										return rec;},
									elem -> CommandFactory.remove(elem, true),
									elem -> CommandFactory.copy(elem, -1, true, true).getObject())
				.setTableRefreshBinding(
						DatamodelPackage.Literals.PERFORMANCE_RECORD__COST,
						DatamodelPackage.Literals.PERFORMANCE_RECORD__DURATION_MINUTES,
						DatamodelPackage.Literals.PERFORMANCE_RECORD__OPERATION,
						DatamodelPackage.Literals.PERFORMANCE_RECORD__WORK_CENTER)
				.setAfterCreateTableElementAction(tableView -> {
					tableView
							.addColumn(messages.obj_OPERATION, 150, rec -> rec.getOperation())
							.setLabelExtractorNullable(Operation::getName);
					tableView
							.addColumn(messages.obj_WORK_CENTER, 150, rec -> rec.getWorkCenter())
							.setLabelExtractorNullable(WorkCenter::getName);
					tableView
							.addColumn(messages.obj_PERFORMANCE_RECORD_col_DURATION_MINUTES, 140, rec -> rec.getDurationMinutes())
							.setLabelExtractor(Formats.getDefaultFormats()::noDecimals);
					tableView
							.addColumn(messages.obj_PERFORMANCE_RECORD_col_COST, 100, rec -> rec.getCost())
							.setLabelExtractor(Formats.getDefaultFormats()::noDecimals);
				});
	}
}
