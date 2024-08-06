/**
 */
package com.company.test1.datamodel;

import java.time.LocalDateTime;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.company.test1.datamodel.Scenario#getName <em>Name</em>}</li>
 *   <li>{@link com.company.test1.datamodel.Scenario#getBeginDate <em>Begin Date</em>}</li>
 *   <li>{@link com.company.test1.datamodel.Scenario#getEndDate <em>End Date</em>}</li>
 *   <li>{@link com.company.test1.datamodel.Scenario#getSelectorType <em>Selector Type</em>}</li>
 *   <li>{@link com.company.test1.datamodel.Scenario#getWorkCenters <em>Work Centers</em>}</li>
 *   <li>{@link com.company.test1.datamodel.Scenario#getOperations <em>Operations</em>}</li>
 *   <li>{@link com.company.test1.datamodel.Scenario#getProducts <em>Products</em>}</li>
 *   <li>{@link com.company.test1.datamodel.Scenario#getProductionPlanRecords <em>Production Plan Records</em>}</li>
 *   <li>{@link com.company.test1.datamodel.Scenario#getPerformanceRecords <em>Performance Records</em>}</li>
 * </ul>
 *
 * @see com.company.test1.datamodel.DatamodelPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.company.test1.datamodel.DatamodelPackage#getScenario_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.company.test1.datamodel.Scenario#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin Date</em>' attribute.
	 * @see #setBeginDate(LocalDateTime)
	 * @see com.company.test1.datamodel.DatamodelPackage#getScenario_BeginDate()
	 * @model dataType="com.amalgamasimulation.ecoreutils.LocalDateTime"
	 * @generated
	 */
	LocalDateTime getBeginDate();

	/**
	 * Sets the value of the '{@link com.company.test1.datamodel.Scenario#getBeginDate <em>Begin Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin Date</em>' attribute.
	 * @see #getBeginDate()
	 * @generated
	 */
	void setBeginDate(LocalDateTime value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(LocalDateTime)
	 * @see com.company.test1.datamodel.DatamodelPackage#getScenario_EndDate()
	 * @model dataType="com.amalgamasimulation.ecoreutils.LocalDateTime"
	 * @generated
	 */
	LocalDateTime getEndDate();

	/**
	 * Sets the value of the '{@link com.company.test1.datamodel.Scenario#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(LocalDateTime value);

	/**
	 * Returns the value of the '<em><b>Selector Type</b></em>' attribute.
	 * The default value is <code>"FIRST"</code>.
	 * The literals are from the enumeration {@link com.company.test1.datamodel.SelectorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selector Type</em>' attribute.
	 * @see com.company.test1.datamodel.SelectorType
	 * @see #setSelectorType(SelectorType)
	 * @see com.company.test1.datamodel.DatamodelPackage#getScenario_SelectorType()
	 * @model default="FIRST"
	 * @generated
	 */
	SelectorType getSelectorType();

	/**
	 * Sets the value of the '{@link com.company.test1.datamodel.Scenario#getSelectorType <em>Selector Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector Type</em>' attribute.
	 * @see com.company.test1.datamodel.SelectorType
	 * @see #getSelectorType()
	 * @generated
	 */
	void setSelectorType(SelectorType value);

	/**
	 * Returns the value of the '<em><b>Work Centers</b></em>' containment reference list.
	 * The list contents are of type {@link com.company.test1.datamodel.WorkCenter}.
	 * It is bidirectional and its opposite is '{@link com.company.test1.datamodel.WorkCenter#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Centers</em>' containment reference list.
	 * @see com.company.test1.datamodel.DatamodelPackage#getScenario_WorkCenters()
	 * @see com.company.test1.datamodel.WorkCenter#getScenario
	 * @model opposite="scenario" containment="true"
	 * @generated
	 */
	EList<WorkCenter> getWorkCenters();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link com.company.test1.datamodel.Operation}.
	 * It is bidirectional and its opposite is '{@link com.company.test1.datamodel.Operation#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see com.company.test1.datamodel.DatamodelPackage#getScenario_Operations()
	 * @see com.company.test1.datamodel.Operation#getScenario
	 * @model opposite="scenario" containment="true"
	 * @generated
	 */
	EList<Operation> getOperations();

	/**
	 * Returns the value of the '<em><b>Products</b></em>' containment reference list.
	 * The list contents are of type {@link com.company.test1.datamodel.Product}.
	 * It is bidirectional and its opposite is '{@link com.company.test1.datamodel.Product#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' containment reference list.
	 * @see com.company.test1.datamodel.DatamodelPackage#getScenario_Products()
	 * @see com.company.test1.datamodel.Product#getScenario
	 * @model opposite="scenario" containment="true"
	 * @generated
	 */
	EList<Product> getProducts();

	/**
	 * Returns the value of the '<em><b>Production Plan Records</b></em>' containment reference list.
	 * The list contents are of type {@link com.company.test1.datamodel.ProductionPlanRecord}.
	 * It is bidirectional and its opposite is '{@link com.company.test1.datamodel.ProductionPlanRecord#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Production Plan Records</em>' containment reference list.
	 * @see com.company.test1.datamodel.DatamodelPackage#getScenario_ProductionPlanRecords()
	 * @see com.company.test1.datamodel.ProductionPlanRecord#getScenario
	 * @model opposite="scenario" containment="true"
	 * @generated
	 */
	EList<ProductionPlanRecord> getProductionPlanRecords();

	/**
	 * Returns the value of the '<em><b>Performance Records</b></em>' containment reference list.
	 * The list contents are of type {@link com.company.test1.datamodel.PerformanceRecord}.
	 * It is bidirectional and its opposite is '{@link com.company.test1.datamodel.PerformanceRecord#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance Records</em>' containment reference list.
	 * @see com.company.test1.datamodel.DatamodelPackage#getScenario_PerformanceRecords()
	 * @see com.company.test1.datamodel.PerformanceRecord#getScenario
	 * @model opposite="scenario" containment="true"
	 * @generated
	 */
	EList<PerformanceRecord> getPerformanceRecords();

} // Scenario
