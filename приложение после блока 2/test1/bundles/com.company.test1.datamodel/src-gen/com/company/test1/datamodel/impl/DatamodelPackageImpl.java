/**
 */
package com.company.test1.datamodel.impl;

import com.amalgamasimulation.ecoreutils.EcoreutilsPackage;

import com.company.test1.datamodel.DatamodelFactory;
import com.company.test1.datamodel.DatamodelPackage;
import com.company.test1.datamodel.Operation;
import com.company.test1.datamodel.PerformanceRecord;
import com.company.test1.datamodel.Product;
import com.company.test1.datamodel.ProductionPlanRecord;
import com.company.test1.datamodel.Scenario;
import com.company.test1.datamodel.SelectorType;
import com.company.test1.datamodel.WorkCenter;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatamodelPackageImpl extends EPackageImpl implements DatamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workCenterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productionPlanRecordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performanceRecordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum selectorTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.company.test1.datamodel.DatamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatamodelPackageImpl() {
		super(eNS_URI, DatamodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DatamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatamodelPackage init() {
		if (isInited)
			return (DatamodelPackage) EPackage.Registry.INSTANCE.getEPackage(DatamodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDatamodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DatamodelPackageImpl theDatamodelPackage = registeredDatamodelPackage instanceof DatamodelPackageImpl
				? (DatamodelPackageImpl) registeredDatamodelPackage
				: new DatamodelPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcoreutilsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDatamodelPackage.createPackageContents();

		// Initialize created meta-data
		theDatamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatamodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatamodelPackage.eNS_URI, theDatamodelPackage);
		return theDatamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScenario() {
		return scenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScenario_Name() {
		return (EAttribute) scenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScenario_BeginDate() {
		return (EAttribute) scenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScenario_EndDate() {
		return (EAttribute) scenarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScenario_SelectorType() {
		return (EAttribute) scenarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScenario_WorkCenters() {
		return (EReference) scenarioEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScenario_Operations() {
		return (EReference) scenarioEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScenario_Products() {
		return (EReference) scenarioEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScenario_ProductionPlanRecords() {
		return (EReference) scenarioEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScenario_PerformanceRecords() {
		return (EReference) scenarioEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkCenter() {
		return workCenterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkCenter_Name() {
		return (EAttribute) workCenterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkCenter_Scenario() {
		return (EReference) workCenterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProduct() {
		return productEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_Name() {
		return (EAttribute) productEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_Operations() {
		return (EReference) productEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_Scenario() {
		return (EReference) productEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperation_Name() {
		return (EAttribute) operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperation_Scenario() {
		return (EReference) operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperation_MinDelayBeforeNextMinutes() {
		return (EAttribute) operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductionPlanRecord() {
		return productionPlanRecordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductionPlanRecord_Product() {
		return (EReference) productionPlanRecordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductionPlanRecord_Quantity() {
		return (EAttribute) productionPlanRecordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductionPlanRecord_PlannedDate() {
		return (EAttribute) productionPlanRecordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductionPlanRecord_Scenario() {
		return (EReference) productionPlanRecordEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPerformanceRecord() {
		return performanceRecordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerformanceRecord_WorkCenter() {
		return (EReference) performanceRecordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerformanceRecord_Operation() {
		return (EReference) performanceRecordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerformanceRecord_DurationMinutes() {
		return (EAttribute) performanceRecordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerformanceRecord_Cost() {
		return (EAttribute) performanceRecordEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerformanceRecord_Scenario() {
		return (EReference) performanceRecordEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSelectorType() {
		return selectorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatamodelFactory getDatamodelFactory() {
		return (DatamodelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		scenarioEClass = createEClass(SCENARIO);
		createEAttribute(scenarioEClass, SCENARIO__NAME);
		createEAttribute(scenarioEClass, SCENARIO__BEGIN_DATE);
		createEAttribute(scenarioEClass, SCENARIO__END_DATE);
		createEAttribute(scenarioEClass, SCENARIO__SELECTOR_TYPE);
		createEReference(scenarioEClass, SCENARIO__WORK_CENTERS);
		createEReference(scenarioEClass, SCENARIO__OPERATIONS);
		createEReference(scenarioEClass, SCENARIO__PRODUCTS);
		createEReference(scenarioEClass, SCENARIO__PRODUCTION_PLAN_RECORDS);
		createEReference(scenarioEClass, SCENARIO__PERFORMANCE_RECORDS);

		workCenterEClass = createEClass(WORK_CENTER);
		createEAttribute(workCenterEClass, WORK_CENTER__NAME);
		createEReference(workCenterEClass, WORK_CENTER__SCENARIO);

		productEClass = createEClass(PRODUCT);
		createEAttribute(productEClass, PRODUCT__NAME);
		createEReference(productEClass, PRODUCT__OPERATIONS);
		createEReference(productEClass, PRODUCT__SCENARIO);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__NAME);
		createEReference(operationEClass, OPERATION__SCENARIO);
		createEAttribute(operationEClass, OPERATION__MIN_DELAY_BEFORE_NEXT_MINUTES);

		productionPlanRecordEClass = createEClass(PRODUCTION_PLAN_RECORD);
		createEReference(productionPlanRecordEClass, PRODUCTION_PLAN_RECORD__PRODUCT);
		createEAttribute(productionPlanRecordEClass, PRODUCTION_PLAN_RECORD__QUANTITY);
		createEAttribute(productionPlanRecordEClass, PRODUCTION_PLAN_RECORD__PLANNED_DATE);
		createEReference(productionPlanRecordEClass, PRODUCTION_PLAN_RECORD__SCENARIO);

		performanceRecordEClass = createEClass(PERFORMANCE_RECORD);
		createEReference(performanceRecordEClass, PERFORMANCE_RECORD__WORK_CENTER);
		createEReference(performanceRecordEClass, PERFORMANCE_RECORD__OPERATION);
		createEAttribute(performanceRecordEClass, PERFORMANCE_RECORD__DURATION_MINUTES);
		createEAttribute(performanceRecordEClass, PERFORMANCE_RECORD__COST);
		createEReference(performanceRecordEClass, PERFORMANCE_RECORD__SCENARIO);

		// Create enums
		selectorTypeEEnum = createEEnum(SELECTOR_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcoreutilsPackage theEcoreutilsPackage = (EcoreutilsPackage) EPackage.Registry.INSTANCE
				.getEPackage(EcoreutilsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(scenarioEClass, Scenario.class, "Scenario", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScenario_Name(), ecorePackage.getEString(), "name", null, 0, 1, Scenario.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenario_BeginDate(), theEcoreutilsPackage.getLocalDateTime(), "beginDate", null, 0, 1,
				Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenario_EndDate(), theEcoreutilsPackage.getLocalDateTime(), "endDate", null, 0, 1,
				Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenario_SelectorType(), this.getSelectorType(), "selectorType", "FIRST", 0, 1,
				Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_WorkCenters(), this.getWorkCenter(), this.getWorkCenter_Scenario(), "workCenters",
				null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_Operations(), this.getOperation(), this.getOperation_Scenario(), "operations", null,
				0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_Products(), this.getProduct(), this.getProduct_Scenario(), "products", null, 0, -1,
				Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_ProductionPlanRecords(), this.getProductionPlanRecord(),
				this.getProductionPlanRecord_Scenario(), "productionPlanRecords", null, 0, -1, Scenario.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_PerformanceRecords(), this.getPerformanceRecord(),
				this.getPerformanceRecord_Scenario(), "performanceRecords", null, 0, -1, Scenario.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(workCenterEClass, WorkCenter.class, "WorkCenter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkCenter_Name(), ecorePackage.getEString(), "name", null, 0, 1, WorkCenter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkCenter_Scenario(), this.getScenario(), this.getScenario_WorkCenters(), "scenario", null,
				0, 1, WorkCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProduct_Name(), ecorePackage.getEString(), "name", null, 0, 1, Product.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_Operations(), this.getOperation(), null, "operations", null, 0, -1, Product.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_Scenario(), this.getScenario(), this.getScenario_Products(), "scenario", null, 0, 1,
				Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Operation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Scenario(), this.getScenario(), this.getScenario_Operations(), "scenario", null, 0,
				1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_MinDelayBeforeNextMinutes(), ecorePackage.getEDouble(), "minDelayBeforeNextMinutes",
				null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productionPlanRecordEClass, ProductionPlanRecord.class, "ProductionPlanRecord", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductionPlanRecord_Product(), this.getProduct(), null, "product", null, 0, 1,
				ProductionPlanRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductionPlanRecord_Quantity(), ecorePackage.getEInt(), "quantity", null, 0, 1,
				ProductionPlanRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductionPlanRecord_PlannedDate(), theEcoreutilsPackage.getLocalDateTime(), "plannedDate",
				null, 0, 1, ProductionPlanRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductionPlanRecord_Scenario(), this.getScenario(), this.getScenario_ProductionPlanRecords(),
				"scenario", null, 0, 1, ProductionPlanRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(performanceRecordEClass, PerformanceRecord.class, "PerformanceRecord", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPerformanceRecord_WorkCenter(), this.getWorkCenter(), null, "workCenter", null, 0, 1,
				PerformanceRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerformanceRecord_Operation(), this.getOperation(), null, "operation", null, 0, 1,
				PerformanceRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerformanceRecord_DurationMinutes(), ecorePackage.getEDouble(), "durationMinutes", null, 0, 1,
				PerformanceRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerformanceRecord_Cost(), ecorePackage.getEDouble(), "cost", null, 0, 1,
				PerformanceRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getPerformanceRecord_Scenario(), this.getScenario(), this.getScenario_PerformanceRecords(),
				"scenario", null, 0, 1, PerformanceRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(selectorTypeEEnum, SelectorType.class, "SelectorType");
		addEEnumLiteral(selectorTypeEEnum, SelectorType.FIRST);
		addEEnumLiteral(selectorTypeEEnum, SelectorType.FASTEST_TO_FINISH);
		addEEnumLiteral(selectorTypeEEnum, SelectorType.EARLIEST_TO_START);
		addEEnumLiteral(selectorTypeEEnum, SelectorType.CHEAPEST);

		// Create resource
		createResource(eNS_URI);
	}

} //DatamodelPackageImpl
