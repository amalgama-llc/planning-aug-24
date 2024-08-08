/**
 */
package com.company.test1.datamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Performance Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.company.test1.datamodel.PerformanceRecord#getWorkCenter <em>Work Center</em>}</li>
 *   <li>{@link com.company.test1.datamodel.PerformanceRecord#getOperation <em>Operation</em>}</li>
 *   <li>{@link com.company.test1.datamodel.PerformanceRecord#getDurationMinutes <em>Duration Minutes</em>}</li>
 *   <li>{@link com.company.test1.datamodel.PerformanceRecord#getCost <em>Cost</em>}</li>
 *   <li>{@link com.company.test1.datamodel.PerformanceRecord#getScenario <em>Scenario</em>}</li>
 * </ul>
 *
 * @see com.company.test1.datamodel.DatamodelPackage#getPerformanceRecord()
 * @model
 * @generated
 */
public interface PerformanceRecord extends EObject {
	/**
	 * Returns the value of the '<em><b>Work Center</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Center</em>' reference.
	 * @see #setWorkCenter(WorkCenter)
	 * @see com.company.test1.datamodel.DatamodelPackage#getPerformanceRecord_WorkCenter()
	 * @model
	 * @generated
	 */
	WorkCenter getWorkCenter();

	/**
	 * Sets the value of the '{@link com.company.test1.datamodel.PerformanceRecord#getWorkCenter <em>Work Center</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Center</em>' reference.
	 * @see #getWorkCenter()
	 * @generated
	 */
	void setWorkCenter(WorkCenter value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(Operation)
	 * @see com.company.test1.datamodel.DatamodelPackage#getPerformanceRecord_Operation()
	 * @model
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link com.company.test1.datamodel.PerformanceRecord#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

	/**
	 * Returns the value of the '<em><b>Duration Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration Minutes</em>' attribute.
	 * @see #setDurationMinutes(double)
	 * @see com.company.test1.datamodel.DatamodelPackage#getPerformanceRecord_DurationMinutes()
	 * @model
	 * @generated
	 */
	double getDurationMinutes();

	/**
	 * Sets the value of the '{@link com.company.test1.datamodel.PerformanceRecord#getDurationMinutes <em>Duration Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Minutes</em>' attribute.
	 * @see #getDurationMinutes()
	 * @generated
	 */
	void setDurationMinutes(double value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @see com.company.test1.datamodel.DatamodelPackage#getPerformanceRecord_Cost()
	 * @model
	 * @generated
	 */
	double getCost();

	/**
	 * Sets the value of the '{@link com.company.test1.datamodel.PerformanceRecord#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(double value);

	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.company.test1.datamodel.Scenario#getPerformanceRecords <em>Performance Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' container reference.
	 * @see #setScenario(Scenario)
	 * @see com.company.test1.datamodel.DatamodelPackage#getPerformanceRecord_Scenario()
	 * @see com.company.test1.datamodel.Scenario#getPerformanceRecords
	 * @model opposite="performanceRecords" transient="false"
	 * @generated
	 */
	Scenario getScenario();

	/**
	 * Sets the value of the '{@link com.company.test1.datamodel.PerformanceRecord#getScenario <em>Scenario</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario</em>' container reference.
	 * @see #getScenario()
	 * @generated
	 */
	void setScenario(Scenario value);

} // PerformanceRecord
