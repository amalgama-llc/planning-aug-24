# ПРАКТИКА: Начальное состояние расписания

*AS IS*: На момент начала составления расписания в нём нет ни одного слота.

*TO BE*: На момент начала составления расписания в нём уже заданы ранее добавленные слоты (берутся из сценария).
Такие слоты могут начинаться/завершаться в любое время относительно стартовой даты планирования.
В частности возможны операции, которые на момент "времени ноль" выполнены наполовину (слот начинается в прошлом, завершается в будущем).


## Обновление модели данных и редактора

1. Новый *абстрактный* класс модели данных `Assignment` с полями:
  - workCenter (ПЦ)
  - beginDate (астрономическое время начала операции)
  - endDate (астрономическое время окончания операции)
2. Новый класс модели данных `OperationAssignment` (наследник `Assignment`) с полями:
  - product (тип изделия)
  - productionPlanItemIndex (номер изделия, например: изделие 36 из запланированных 100)
  - operation (операция)
  - cost (стоимость выполнения)
3. В редакторе - новый элемент дерева сценария, новая таблица для `OperationAssignment`:

```
new ObjectsPage<OperationAssignment>(	
							this,
							DatamodelPackage.Literals.SCENARIO__OPERATION_ASSIGNMENTS, 
							TreeElementType.OPERATION_ASSIGNMENT,
							() -> CommandFactory.create(dataBinding.scenarioObservable.getValue(), "Operation assignment", "", 
									() -> {
										var rec = DatamodelFactory.eINSTANCE.createOperationAssignment();
										rec.setBeginDate(dataBinding.scenarioObservable.getValue().getBeginDate());
										rec.setEndDate(dataBinding.scenarioObservable.getValue().getBeginDate());
										return rec;
										}, true).getObject(),
							elem -> CommandFactory.remove(elem, true),
							elem -> CommandFactory.copy(elem, -1, true, true).getObject())
				.setTableRefreshBinding(DatamodelPackage.Literals.ASSIGNMENT__WORK_CENTER,
										DatamodelPackage.Literals.ASSIGNMENT__BEGIN_DATE,
										DatamodelPackage.Literals.ASSIGNMENT__END_DATE,
										DatamodelPackage.Literals.OPERATION_ASSIGNMENT__COST,
										DatamodelPackage.Literals.OPERATION_ASSIGNMENT__OPERATION,
										DatamodelPackage.Literals.OPERATION_ASSIGNMENT__PRODUCT,
										DatamodelPackage.Literals.OPERATION_ASSIGNMENT__PRODUCTION_PLAN_ITEM_INDEX)
				.setAfterCreateTableElementAction(tableView -> {
				tableView.addColumn("Work center", 150, rec -> rec.getWorkCenter())
					.setLabelExtractorNullable(wc -> wc.getName())
					.setComboboxEditingSupport(	dataBinding.workCentersObservable, 
												DatamodelPackage.Literals.ASSIGNMENT__WORK_CENTER, 
												DatamodelPackage.Literals.WORK_CENTER__NAME);
				tableView.addColumn("Operation", 150, rec -> rec.getOperation())
					.setLabelExtractorNullable(op -> op.getName())
					.setComboboxEditingSupport(	dataBinding.operationsObservable, 
											DatamodelPackage.Literals.OPERATION_ASSIGNMENT__OPERATION, 
											DatamodelPackage.Literals.OPERATION__NAME);
				tableView.addColumn("Product name", 150, rec -> rec.getProduct())
					.setLabelExtractorNullable(p -> p.getName())
					.setComboboxEditingSupport(	dataBinding.productsObservable, 
										DatamodelPackage.Literals.OPERATION_ASSIGNMENT__PRODUCT, 
										DatamodelPackage.Literals.PRODUCT__NAME);
				tableView.addColumn("Product #", 100, rec -> rec.getProductionPlanItemIndex())
					.setTextEditingSupport(DatamodelPackage.Literals.OPERATION_ASSIGNMENT__PRODUCTION_PLAN_ITEM_INDEX, UpdateValueStrategyFactory.integerPositiveWithZero());
				
				tableView
					.addColumn("Cost", 100, rec -> rec.getCost())
					.setLabelExtractor(Formats.getDefaultFormats()::noDecimals)
					.setTextEditingSupport(DatamodelPackage.Literals.OPERATION_ASSIGNMENT__COST, UpdateValueStrategyFactory.doublePositiveWithZero(0));
				
				tableView
					.addColumn("Begin date", 100, rec -> rec.getBeginDate())
					.setLabelExtractor(Formats.getDefaultFormats()::dayMonthLongYearHoursMinutes)
					.setLocalDateTimeButtonEditingSupport(DatamodelPackage.Literals.ASSIGNMENT__BEGIN_DATE);
				tableView
					.addColumn("End date", 100, rec -> rec.getEndDate())
					.setLabelExtractor(Formats.getDefaultFormats()::dayMonthLongYearHoursMinutes)
					.setLocalDateTimeButtonEditingSupport(DatamodelPackage.Literals.ASSIGNMENT__END_DATE);
				});
```


## Доработка планировщика

1. Инициализация Schedule: добавление слотов из объектов `OperationAssignment` в сценарии.
2. Обновление логики создания начальных Pointer-ов.
