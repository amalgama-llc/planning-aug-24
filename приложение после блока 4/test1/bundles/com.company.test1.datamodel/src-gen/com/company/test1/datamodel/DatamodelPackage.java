/**
 */
package com.company.test1.datamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.company.test1.datamodel.DatamodelFactory
 * @model kind="package"
 * @generated
 */
public interface DatamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/datamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "datamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatamodelPackage eINSTANCE = com.company.test1.datamodel.impl.DatamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.company.test1.datamodel.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.company.test1.datamodel.impl.ScenarioImpl
	 * @see com.company.test1.datamodel.impl.DatamodelPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__NAME = 0;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__BEGIN_DATE = 1;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__END_DATE = 2;

	/**
	 * The feature id for the '<em><b>Selector Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__SELECTOR_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Work Centers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__WORK_CENTERS = 4;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__OPERATIONS = 5;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__PRODUCTS = 6;

	/**
	 * The feature id for the '<em><b>Production Plan Records</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__PRODUCTION_PLAN_RECORDS = 7;

	/**
	 * The feature id for the '<em><b>Performance Records</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__PERFORMANCE_RECORDS = 8;

	/**
	 * The feature id for the '<em><b>Changeovers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__CHANGEOVERS = 9;

	/**
	 * The feature id for the '<em><b>Operation Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__OPERATION_ASSIGNMENTS = 10;

	/**
	 * The feature id for the '<em><b>Unavailability Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__UNAVAILABILITY_ASSIGNMENTS = 11;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.company.test1.datamodel.impl.WorkCenterImpl <em>Work Center</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.company.test1.datamodel.impl.WorkCenterImpl
	 * @see com.company.test1.datamodel.impl.DatamodelPackageImpl#getWorkCenter()
	 * @generated
	 */
	int WORK_CENTER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CENTER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CENTER__SCENARIO = 1;

	/**
	 * The number of structural features of the '<em>Work Center</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CENTER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Work Center</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CENTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.company.test1.datamodel.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.company.test1.datamodel.impl.ProductImpl
	 * @see com.company.test1.datamodel.impl.DatamodelPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__OPERATIONS = 1;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__SCENARIO = 2;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.company.test1.datamodel.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.company.test1.datamodel.impl.OperationImpl
	 * @see com.company.test1.datamodel.impl.DatamodelPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__SCENARIO = 1;

	/**
	 * The feature id for the '<em><b>Min Delay Before Next Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__MIN_DELAY_BEFORE_NEXT_MINUTES = 2;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.company.test1.datamodel.impl.ProductionPlanRecordImpl <em>Production Plan Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.company.test1.datamodel.impl.ProductionPlanRecordImpl
	 * @see com.company.test1.datamodel.impl.DatamodelPackageImpl#getProductionPlanRecord()
	 * @generated
	 */
	int PRODUCTION_PLAN_RECORD = 4;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_PLAN_RECORD__PRODUCT = 0;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_PLAN_RECORD__QUANTITY = 1;

	/**
	 * The feature id for the '<em><b>Planned Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_PLAN_RECORD__PLANNED_DATE = 2;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_PLAN_RECORD__SCENARIO = 3;

	/**
	 * The number of structural features of the '<em>Production Plan Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_PLAN_RECORD_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Production Plan Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_PLAN_RECORD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.company.test1.datamodel.impl.PerformanceRecordImpl <em>Performance Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.company.test1.datamodel.impl.PerformanceRecordImpl
	 * @see com.company.test1.datamodel.impl.DatamodelPackageImpl#getPerformanceRecord()
	 * @generated
	 */
	int PERFORMANCE_RECORD = 5;

	/**
	 * The feature id for the '<em><b>Work Center</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_RECORD__WORK_CENTER = 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_RECORD__OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Duration Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_RECORD__DURATION_MINUTES = 2;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_RECORD__COST = 3;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_RECORD__SCENARIO = 4;

	/**
	 * The number of structural features of the '<em>Performance Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_RECORD_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Performance Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_RECORD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.company.test1.datamodel.impl.ChangeoverImpl <em>Changeover</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.company.test1.datamodel.impl.ChangeoverImpl
	 * @see com.company.test1.datamodel.impl.DatamodelPackageImpl#getChangeover()
	 * @generated
	 */
	int CHANGEOVER = 6;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGEOVER__SCENARIO = 0;

	/**
	 * The feature id for the '<em><b>Prev Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGEOVER__PREV_OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Next Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGEOVER__NEXT_OPERATION = 2;

	/**
	 * The feature id for the '<em><b>Work Center</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGEOVER__WORK_CENTER = 3;

	/**
	 * The feature id for the '<em><b>Duration Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGEOVER__DURATION_MINUTES = 4;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGEOVER__COST = 5;

	/**
	 * The number of structural features of the '<em>Changeover</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGEOVER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Changeover</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGEOVER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.company.test1.datamodel.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.company.test1.datamodel.impl.AssignmentImpl
	 * @see com.company.test1.datamodel.impl.DatamodelPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 7;

	/**
	 * The feature id for the '<em><b>Work Center</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__WORK_CENTER = 0;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__BEGIN_DATE = 1;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__END_DATE = 2;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.company.test1.datamodel.impl.OperationAssignmentImpl <em>Operation Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.company.test1.datamodel.impl.OperationAssignmentImpl
	 * @see com.company.test1.datamodel.impl.DatamodelPackageImpl#getOperationAssignment()
	 * @generated
	 */
	int OPERATION_ASSIGNMENT = 8;

	/**
	 * The feature id for the '<em><b>Work Center</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ASSIGNMENT__WORK_CENTER = ASSIGNMENT__WORK_CENTER;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ASSIGNMENT__BEGIN_DATE = ASSIGNMENT__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ASSIGNMENT__END_DATE = ASSIGNMENT__END_DATE;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ASSIGNMENT__SCENARIO = ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ASSIGNMENT__PRODUCT = ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Production Plan Item Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ASSIGNMENT__PRODUCTION_PLAN_ITEM_INDEX = ASSIGNMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ASSIGNMENT__OPERATION = ASSIGNMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ASSIGNMENT__COST = ASSIGNMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Operation Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ASSIGNMENT_FEATURE_COUNT = ASSIGNMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Operation Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ASSIGNMENT_OPERATION_COUNT = ASSIGNMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.company.test1.datamodel.impl.UnavailabilityAssignmentImpl <em>Unavailability Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.company.test1.datamodel.impl.UnavailabilityAssignmentImpl
	 * @see com.company.test1.datamodel.impl.DatamodelPackageImpl#getUnavailabilityAssignment()
	 * @generated
	 */
	int UNAVAILABILITY_ASSIGNMENT = 9;

	/**
	 * The feature id for the '<em><b>Work Center</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNAVAILABILITY_ASSIGNMENT__WORK_CENTER = ASSIGNMENT__WORK_CENTER;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNAVAILABILITY_ASSIGNMENT__BEGIN_DATE = ASSIGNMENT__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNAVAILABILITY_ASSIGNMENT__END_DATE = ASSIGNMENT__END_DATE;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNAVAILABILITY_ASSIGNMENT__SCENARIO = ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unavailability Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNAVAILABILITY_ASSIGNMENT_FEATURE_COUNT = ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unavailability Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNAVAILABILITY_ASSIGNMENT_OPERATION_COUNT = ASSIGNMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.company.test1.datamodel.SelectorType <em>Selector Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.company.test1.datamodel.SelectorType
	 * @see com.company.test1.datamodel.impl.DatamodelPackageImpl#getSelectorType()
	 * @generated
	 */
	int SELECTOR_TYPE = 10;

	/**
	 * Returns the meta object for class '{@link com.company.test1.datamodel.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see com.company.test1.datamodel.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the attribute '{@link com.company.test1.datamodel.Scenario#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.company.test1.datamodel.Scenario#getName()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.company.test1.datamodel.Scenario#getBeginDate <em>Begin Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin Date</em>'.
	 * @see com.company.test1.datamodel.Scenario#getBeginDate()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_BeginDate();

	/**
	 * Returns the meta object for the attribute '{@link com.company.test1.datamodel.Scenario#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see com.company.test1.datamodel.Scenario#getEndDate()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link com.company.test1.datamodel.Scenario#getSelectorType <em>Selector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selector Type</em>'.
	 * @see com.company.test1.datamodel.Scenario#getSelectorType()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_SelectorType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.company.test1.datamodel.Scenario#getWorkCenters <em>Work Centers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Work Centers</em>'.
	 * @see com.company.test1.datamodel.Scenario#getWorkCenters()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_WorkCenters();

	/**
	 * Returns the meta object for the containment reference list '{@link com.company.test1.datamodel.Scenario#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see com.company.test1.datamodel.Scenario#getOperations()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Operations();

	/**
	 * Returns the meta object for the containment reference list '{@link com.company.test1.datamodel.Scenario#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see com.company.test1.datamodel.Scenario#getProducts()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Products();

	/**
	 * Returns the meta object for the containment reference list '{@link com.company.test1.datamodel.Scenario#getProductionPlanRecords <em>Production Plan Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Production Plan Records</em>'.
	 * @see com.company.test1.datamodel.Scenario#getProductionPlanRecords()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_ProductionPlanRecords();

	/**
	 * Returns the meta object for the containment reference list '{@link com.company.test1.datamodel.Scenario#getPerformanceRecords <em>Performance Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Performance Records</em>'.
	 * @see com.company.test1.datamodel.Scenario#getPerformanceRecords()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_PerformanceRecords();

	/**
	 * Returns the meta object for the containment reference list '{@link com.company.test1.datamodel.Scenario#getChangeovers <em>Changeovers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Changeovers</em>'.
	 * @see com.company.test1.datamodel.Scenario#getChangeovers()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Changeovers();

	/**
	 * Returns the meta object for the containment reference list '{@link com.company.test1.datamodel.Scenario#getOperationAssignments <em>Operation Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation Assignments</em>'.
	 * @see com.company.test1.datamodel.Scenario#getOperationAssignments()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_OperationAssignments();

	/**
	 * Returns the meta object for the containment reference list '{@link com.company.test1.datamodel.Scenario#getUnavailabilityAssignments <em>Unavailability Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unavailability Assignments</em>'.
	 * @see com.company.test1.datamodel.Scenario#getUnavailabilityAssignments()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_UnavailabilityAssignments();

	/**
	 * Returns the meta object for class '{@link com.company.test1.datamodel.WorkCenter <em>Work Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Center</em>'.
	 * @see com.company.test1.datamodel.WorkCenter
	 * @generated
	 */
	EClass getWorkCenter();

	/**
	 * Returns the meta object for the attribute '{@link com.company.test1.datamodel.WorkCenter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.company.test1.datamodel.WorkCenter#getName()
	 * @see #getWorkCenter()
	 * @generated
	 */
	EAttribute getWorkCenter_Name();

	/**
	 * Returns the meta object for the container reference '{@link com.company.test1.datamodel.WorkCenter#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Scenario</em>'.
	 * @see com.company.test1.datamodel.WorkCenter#getScenario()
	 * @see #getWorkCenter()
	 * @generated
	 */
	EReference getWorkCenter_Scenario();

	/**
	 * Returns the meta object for class '{@link com.company.test1.datamodel.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see com.company.test1.datamodel.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link com.company.test1.datamodel.Product#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.company.test1.datamodel.Product#getName()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Name();

	/**
	 * Returns the meta object for the reference list '{@link com.company.test1.datamodel.Product#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operations</em>'.
	 * @see com.company.test1.datamodel.Product#getOperations()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Operations();

	/**
	 * Returns the meta object for the container reference '{@link com.company.test1.datamodel.Product#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Scenario</em>'.
	 * @see com.company.test1.datamodel.Product#getScenario()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Scenario();

	/**
	 * Returns the meta object for class '{@link com.company.test1.datamodel.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see com.company.test1.datamodel.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link com.company.test1.datamodel.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.company.test1.datamodel.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name();

	/**
	 * Returns the meta object for the container reference '{@link com.company.test1.datamodel.Operation#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Scenario</em>'.
	 * @see com.company.test1.datamodel.Operation#getScenario()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Scenario();

	/**
	 * Returns the meta object for the attribute '{@link com.company.test1.datamodel.Operation#getMinDelayBeforeNextMinutes <em>Min Delay Before Next Minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Delay Before Next Minutes</em>'.
	 * @see com.company.test1.datamodel.Operation#getMinDelayBeforeNextMinutes()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_MinDelayBeforeNextMinutes();

	/**
	 * Returns the meta object for class '{@link com.company.test1.datamodel.ProductionPlanRecord <em>Production Plan Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Production Plan Record</em>'.
	 * @see com.company.test1.datamodel.ProductionPlanRecord
	 * @generated
	 */
	EClass getProductionPlanRecord();

	/**
	 * Returns the meta object for the reference '{@link com.company.test1.datamodel.ProductionPlanRecord#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see com.company.test1.datamodel.ProductionPlanRecord#getProduct()
	 * @see #getProductionPlanRecord()
	 * @generated
	 */
	EReference getProductionPlanRecord_Product();

	/**
	 * Returns the meta object for the attribute '{@link com.company.test1.datamodel.ProductionPlanRecord#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see com.company.test1.datamodel.ProductionPlanRecord#getQuantity()
	 * @see #getProductionPlanRecord()
	 * @generated
	 */
	EAttribute getProductionPlanRecord_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link com.company.test1.datamodel.ProductionPlanRecord#getPlannedDate <em>Planned Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Planned Date</em>'.
	 * @see com.company.test1.datamodel.ProductionPlanRecord#getPlannedDate()
	 * @see #getProductionPlanRecord()
	 * @generated
	 */
	EAttribute getProductionPlanRecord_PlannedDate();

	/**
	 * Returns the meta object for the container reference '{@link com.company.test1.datamodel.ProductionPlanRecord#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Scenario</em>'.
	 * @see com.company.test1.datamodel.ProductionPlanRecord#getScenario()
	 * @see #getProductionPlanRecord()
	 * @generated
	 */
	EReference getProductionPlanRecord_Scenario();

	/**
	 * Returns the meta object for class '{@link com.company.test1.datamodel.PerformanceRecord <em>Performance Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performance Record</em>'.
	 * @see com.company.test1.datamodel.PerformanceRecord
	 * @generated
	 */
	EClass getPerformanceRecord();

	/**
	 * Returns the meta object for the reference '{@link com.company.test1.datamodel.PerformanceRecord#getWorkCenter <em>Work Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Center</em>'.
	 * @see com.company.test1.datamodel.PerformanceRecord#getWorkCenter()
	 * @see #getPerformanceRecord()
	 * @generated
	 */
	EReference getPerformanceRecord_WorkCenter();

	/**
	 * Returns the meta object for the reference '{@link com.company.test1.datamodel.PerformanceRecord#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see com.company.test1.datamodel.PerformanceRecord#getOperation()
	 * @see #getPerformanceRecord()
	 * @generated
	 */
	EReference getPerformanceRecord_Operation();

	/**
	 * Returns the meta object for the attribute '{@link com.company.test1.datamodel.PerformanceRecord#getDurationMinutes <em>Duration Minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration Minutes</em>'.
	 * @see com.company.test1.datamodel.PerformanceRecord#getDurationMinutes()
	 * @see #getPerformanceRecord()
	 * @generated
	 */
	EAttribute getPerformanceRecord_DurationMinutes();

	/**
	 * Returns the meta object for the attribute '{@link com.company.test1.datamodel.PerformanceRecord#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see com.company.test1.datamodel.PerformanceRecord#getCost()
	 * @see #getPerformanceRecord()
	 * @generated
	 */
	EAttribute getPerformanceRecord_Cost();

	/**
	 * Returns the meta object for the container reference '{@link com.company.test1.datamodel.PerformanceRecord#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Scenario</em>'.
	 * @see com.company.test1.datamodel.PerformanceRecord#getScenario()
	 * @see #getPerformanceRecord()
	 * @generated
	 */
	EReference getPerformanceRecord_Scenario();

	/**
	 * Returns the meta object for class '{@link com.company.test1.datamodel.Changeover <em>Changeover</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Changeover</em>'.
	 * @see com.company.test1.datamodel.Changeover
	 * @generated
	 */
	EClass getChangeover();

	/**
	 * Returns the meta object for the container reference '{@link com.company.test1.datamodel.Changeover#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Scenario</em>'.
	 * @see com.company.test1.datamodel.Changeover#getScenario()
	 * @see #getChangeover()
	 * @generated
	 */
	EReference getChangeover_Scenario();

	/**
	 * Returns the meta object for the reference '{@link com.company.test1.datamodel.Changeover#getPrevOperation <em>Prev Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prev Operation</em>'.
	 * @see com.company.test1.datamodel.Changeover#getPrevOperation()
	 * @see #getChangeover()
	 * @generated
	 */
	EReference getChangeover_PrevOperation();

	/**
	 * Returns the meta object for the reference '{@link com.company.test1.datamodel.Changeover#getNextOperation <em>Next Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Operation</em>'.
	 * @see com.company.test1.datamodel.Changeover#getNextOperation()
	 * @see #getChangeover()
	 * @generated
	 */
	EReference getChangeover_NextOperation();

	/**
	 * Returns the meta object for the reference '{@link com.company.test1.datamodel.Changeover#getWorkCenter <em>Work Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Center</em>'.
	 * @see com.company.test1.datamodel.Changeover#getWorkCenter()
	 * @see #getChangeover()
	 * @generated
	 */
	EReference getChangeover_WorkCenter();

	/**
	 * Returns the meta object for the attribute '{@link com.company.test1.datamodel.Changeover#getDurationMinutes <em>Duration Minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration Minutes</em>'.
	 * @see com.company.test1.datamodel.Changeover#getDurationMinutes()
	 * @see #getChangeover()
	 * @generated
	 */
	EAttribute getChangeover_DurationMinutes();

	/**
	 * Returns the meta object for the attribute '{@link com.company.test1.datamodel.Changeover#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see com.company.test1.datamodel.Changeover#getCost()
	 * @see #getChangeover()
	 * @generated
	 */
	EAttribute getChangeover_Cost();

	/**
	 * Returns the meta object for class '{@link com.company.test1.datamodel.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see com.company.test1.datamodel.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the reference '{@link com.company.test1.datamodel.Assignment#getWorkCenter <em>Work Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Center</em>'.
	 * @see com.company.test1.datamodel.Assignment#getWorkCenter()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_WorkCenter();

	/**
	 * Returns the meta object for the attribute '{@link com.company.test1.datamodel.Assignment#getBeginDate <em>Begin Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin Date</em>'.
	 * @see com.company.test1.datamodel.Assignment#getBeginDate()
	 * @see #getAssignment()
	 * @generated
	 */
	EAttribute getAssignment_BeginDate();

	/**
	 * Returns the meta object for the attribute '{@link com.company.test1.datamodel.Assignment#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see com.company.test1.datamodel.Assignment#getEndDate()
	 * @see #getAssignment()
	 * @generated
	 */
	EAttribute getAssignment_EndDate();

	/**
	 * Returns the meta object for class '{@link com.company.test1.datamodel.OperationAssignment <em>Operation Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Assignment</em>'.
	 * @see com.company.test1.datamodel.OperationAssignment
	 * @generated
	 */
	EClass getOperationAssignment();

	/**
	 * Returns the meta object for the container reference '{@link com.company.test1.datamodel.OperationAssignment#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Scenario</em>'.
	 * @see com.company.test1.datamodel.OperationAssignment#getScenario()
	 * @see #getOperationAssignment()
	 * @generated
	 */
	EReference getOperationAssignment_Scenario();

	/**
	 * Returns the meta object for the reference '{@link com.company.test1.datamodel.OperationAssignment#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see com.company.test1.datamodel.OperationAssignment#getProduct()
	 * @see #getOperationAssignment()
	 * @generated
	 */
	EReference getOperationAssignment_Product();

	/**
	 * Returns the meta object for the attribute '{@link com.company.test1.datamodel.OperationAssignment#getProductionPlanItemIndex <em>Production Plan Item Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Production Plan Item Index</em>'.
	 * @see com.company.test1.datamodel.OperationAssignment#getProductionPlanItemIndex()
	 * @see #getOperationAssignment()
	 * @generated
	 */
	EAttribute getOperationAssignment_ProductionPlanItemIndex();

	/**
	 * Returns the meta object for the reference '{@link com.company.test1.datamodel.OperationAssignment#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see com.company.test1.datamodel.OperationAssignment#getOperation()
	 * @see #getOperationAssignment()
	 * @generated
	 */
	EReference getOperationAssignment_Operation();

	/**
	 * Returns the meta object for the attribute '{@link com.company.test1.datamodel.OperationAssignment#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see com.company.test1.datamodel.OperationAssignment#getCost()
	 * @see #getOperationAssignment()
	 * @generated
	 */
	EAttribute getOperationAssignment_Cost();

	/**
	 * Returns the meta object for class '{@link com.company.test1.datamodel.UnavailabilityAssignment <em>Unavailability Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unavailability Assignment</em>'.
	 * @see com.company.test1.datamodel.UnavailabilityAssignment
	 * @generated
	 */
	EClass getUnavailabilityAssignment();

	/**
	 * Returns the meta object for the container reference '{@link com.company.test1.datamodel.UnavailabilityAssignment#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Scenario</em>'.
	 * @see com.company.test1.datamodel.UnavailabilityAssignment#getScenario()
	 * @see #getUnavailabilityAssignment()
	 * @generated
	 */
	EReference getUnavailabilityAssignment_Scenario();

	/**
	 * Returns the meta object for enum '{@link com.company.test1.datamodel.SelectorType <em>Selector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Selector Type</em>'.
	 * @see com.company.test1.datamodel.SelectorType
	 * @generated
	 */
	EEnum getSelectorType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatamodelFactory getDatamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.company.test1.datamodel.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.company.test1.datamodel.impl.ScenarioImpl
		 * @see com.company.test1.datamodel.impl.DatamodelPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__NAME = eINSTANCE.getScenario_Name();

		/**
		 * The meta object literal for the '<em><b>Begin Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__BEGIN_DATE = eINSTANCE.getScenario_BeginDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__END_DATE = eINSTANCE.getScenario_EndDate();

		/**
		 * The meta object literal for the '<em><b>Selector Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__SELECTOR_TYPE = eINSTANCE.getScenario_SelectorType();

		/**
		 * The meta object literal for the '<em><b>Work Centers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__WORK_CENTERS = eINSTANCE.getScenario_WorkCenters();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__OPERATIONS = eINSTANCE.getScenario_Operations();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__PRODUCTS = eINSTANCE.getScenario_Products();

		/**
		 * The meta object literal for the '<em><b>Production Plan Records</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__PRODUCTION_PLAN_RECORDS = eINSTANCE.getScenario_ProductionPlanRecords();

		/**
		 * The meta object literal for the '<em><b>Performance Records</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__PERFORMANCE_RECORDS = eINSTANCE.getScenario_PerformanceRecords();

		/**
		 * The meta object literal for the '<em><b>Changeovers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__CHANGEOVERS = eINSTANCE.getScenario_Changeovers();

		/**
		 * The meta object literal for the '<em><b>Operation Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__OPERATION_ASSIGNMENTS = eINSTANCE.getScenario_OperationAssignments();

		/**
		 * The meta object literal for the '<em><b>Unavailability Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__UNAVAILABILITY_ASSIGNMENTS = eINSTANCE.getScenario_UnavailabilityAssignments();

		/**
		 * The meta object literal for the '{@link com.company.test1.datamodel.impl.WorkCenterImpl <em>Work Center</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.company.test1.datamodel.impl.WorkCenterImpl
		 * @see com.company.test1.datamodel.impl.DatamodelPackageImpl#getWorkCenter()
		 * @generated
		 */
		EClass WORK_CENTER = eINSTANCE.getWorkCenter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_CENTER__NAME = eINSTANCE.getWorkCenter_Name();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_CENTER__SCENARIO = eINSTANCE.getWorkCenter_Scenario();

		/**
		 * The meta object literal for the '{@link com.company.test1.datamodel.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.company.test1.datamodel.impl.ProductImpl
		 * @see com.company.test1.datamodel.impl.DatamodelPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__NAME = eINSTANCE.getProduct_Name();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__OPERATIONS = eINSTANCE.getProduct_Operations();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__SCENARIO = eINSTANCE.getProduct_Scenario();

		/**
		 * The meta object literal for the '{@link com.company.test1.datamodel.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.company.test1.datamodel.impl.OperationImpl
		 * @see com.company.test1.datamodel.impl.DatamodelPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__SCENARIO = eINSTANCE.getOperation_Scenario();

		/**
		 * The meta object literal for the '<em><b>Min Delay Before Next Minutes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__MIN_DELAY_BEFORE_NEXT_MINUTES = eINSTANCE.getOperation_MinDelayBeforeNextMinutes();

		/**
		 * The meta object literal for the '{@link com.company.test1.datamodel.impl.ProductionPlanRecordImpl <em>Production Plan Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.company.test1.datamodel.impl.ProductionPlanRecordImpl
		 * @see com.company.test1.datamodel.impl.DatamodelPackageImpl#getProductionPlanRecord()
		 * @generated
		 */
		EClass PRODUCTION_PLAN_RECORD = eINSTANCE.getProductionPlanRecord();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTION_PLAN_RECORD__PRODUCT = eINSTANCE.getProductionPlanRecord_Product();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTION_PLAN_RECORD__QUANTITY = eINSTANCE.getProductionPlanRecord_Quantity();

		/**
		 * The meta object literal for the '<em><b>Planned Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTION_PLAN_RECORD__PLANNED_DATE = eINSTANCE.getProductionPlanRecord_PlannedDate();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTION_PLAN_RECORD__SCENARIO = eINSTANCE.getProductionPlanRecord_Scenario();

		/**
		 * The meta object literal for the '{@link com.company.test1.datamodel.impl.PerformanceRecordImpl <em>Performance Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.company.test1.datamodel.impl.PerformanceRecordImpl
		 * @see com.company.test1.datamodel.impl.DatamodelPackageImpl#getPerformanceRecord()
		 * @generated
		 */
		EClass PERFORMANCE_RECORD = eINSTANCE.getPerformanceRecord();

		/**
		 * The meta object literal for the '<em><b>Work Center</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORMANCE_RECORD__WORK_CENTER = eINSTANCE.getPerformanceRecord_WorkCenter();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORMANCE_RECORD__OPERATION = eINSTANCE.getPerformanceRecord_Operation();

		/**
		 * The meta object literal for the '<em><b>Duration Minutes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMANCE_RECORD__DURATION_MINUTES = eINSTANCE.getPerformanceRecord_DurationMinutes();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMANCE_RECORD__COST = eINSTANCE.getPerformanceRecord_Cost();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORMANCE_RECORD__SCENARIO = eINSTANCE.getPerformanceRecord_Scenario();

		/**
		 * The meta object literal for the '{@link com.company.test1.datamodel.impl.ChangeoverImpl <em>Changeover</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.company.test1.datamodel.impl.ChangeoverImpl
		 * @see com.company.test1.datamodel.impl.DatamodelPackageImpl#getChangeover()
		 * @generated
		 */
		EClass CHANGEOVER = eINSTANCE.getChangeover();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGEOVER__SCENARIO = eINSTANCE.getChangeover_Scenario();

		/**
		 * The meta object literal for the '<em><b>Prev Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGEOVER__PREV_OPERATION = eINSTANCE.getChangeover_PrevOperation();

		/**
		 * The meta object literal for the '<em><b>Next Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGEOVER__NEXT_OPERATION = eINSTANCE.getChangeover_NextOperation();

		/**
		 * The meta object literal for the '<em><b>Work Center</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGEOVER__WORK_CENTER = eINSTANCE.getChangeover_WorkCenter();

		/**
		 * The meta object literal for the '<em><b>Duration Minutes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGEOVER__DURATION_MINUTES = eINSTANCE.getChangeover_DurationMinutes();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGEOVER__COST = eINSTANCE.getChangeover_Cost();

		/**
		 * The meta object literal for the '{@link com.company.test1.datamodel.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.company.test1.datamodel.impl.AssignmentImpl
		 * @see com.company.test1.datamodel.impl.DatamodelPackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Work Center</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__WORK_CENTER = eINSTANCE.getAssignment_WorkCenter();

		/**
		 * The meta object literal for the '<em><b>Begin Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT__BEGIN_DATE = eINSTANCE.getAssignment_BeginDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT__END_DATE = eINSTANCE.getAssignment_EndDate();

		/**
		 * The meta object literal for the '{@link com.company.test1.datamodel.impl.OperationAssignmentImpl <em>Operation Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.company.test1.datamodel.impl.OperationAssignmentImpl
		 * @see com.company.test1.datamodel.impl.DatamodelPackageImpl#getOperationAssignment()
		 * @generated
		 */
		EClass OPERATION_ASSIGNMENT = eINSTANCE.getOperationAssignment();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_ASSIGNMENT__SCENARIO = eINSTANCE.getOperationAssignment_Scenario();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_ASSIGNMENT__PRODUCT = eINSTANCE.getOperationAssignment_Product();

		/**
		 * The meta object literal for the '<em><b>Production Plan Item Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_ASSIGNMENT__PRODUCTION_PLAN_ITEM_INDEX = eINSTANCE
				.getOperationAssignment_ProductionPlanItemIndex();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_ASSIGNMENT__OPERATION = eINSTANCE.getOperationAssignment_Operation();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_ASSIGNMENT__COST = eINSTANCE.getOperationAssignment_Cost();

		/**
		 * The meta object literal for the '{@link com.company.test1.datamodel.impl.UnavailabilityAssignmentImpl <em>Unavailability Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.company.test1.datamodel.impl.UnavailabilityAssignmentImpl
		 * @see com.company.test1.datamodel.impl.DatamodelPackageImpl#getUnavailabilityAssignment()
		 * @generated
		 */
		EClass UNAVAILABILITY_ASSIGNMENT = eINSTANCE.getUnavailabilityAssignment();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNAVAILABILITY_ASSIGNMENT__SCENARIO = eINSTANCE.getUnavailabilityAssignment_Scenario();

		/**
		 * The meta object literal for the '{@link com.company.test1.datamodel.SelectorType <em>Selector Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.company.test1.datamodel.SelectorType
		 * @see com.company.test1.datamodel.impl.DatamodelPackageImpl#getSelectorType()
		 * @generated
		 */
		EEnum SELECTOR_TYPE = eINSTANCE.getSelectorType();

	}

} //DatamodelPackage
