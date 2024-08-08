/**
 */
package com.company.test1.datamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Changeover</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.company.test1.datamodel.Changeover#getScenario <em>Scenario</em>}</li>
 *   <li>{@link com.company.test1.datamodel.Changeover#getPrevOperation <em>Prev Operation</em>}</li>
 *   <li>{@link com.company.test1.datamodel.Changeover#getNextOperation <em>Next Operation</em>}</li>
 *   <li>{@link com.company.test1.datamodel.Changeover#getWorkCenter <em>Work Center</em>}</li>
 *   <li>{@link com.company.test1.datamodel.Changeover#getDurationMinutes <em>Duration Minutes</em>}</li>
 *   <li>{@link com.company.test1.datamodel.Changeover#getCost <em>Cost</em>}</li>
 * </ul>
 *
 * @see com.company.test1.datamodel.DatamodelPackage#getChangeover()
 * @model
 * @generated
 */
public interface Changeover extends EObject {
	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.company.test1.datamodel.Scenario#getChangeovers <em>Changeovers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' container reference.
	 * @see #setScenario(Scenario)
	 * @see com.company.test1.datamodel.DatamodelPackage#getChangeover_Scenario()
	 * @see com.company.test1.datamodel.Scenario#getChangeovers
	 * @model opposite="changeovers" transient="false"
	 * @generated
	 */
	Scenario getScenario();

	/**
	 * Sets the value of the '{@link com.company.test1.datamodel.Changeover#getScenario <em>Scenario</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario</em>' container reference.
	 * @see #getScenario()
	 * @generated
	 */
	void setScenario(Scenario value);

	/**
	 * Returns the value of the '<em><b>Prev Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prev Operation</em>' reference.
	 * @see #setPrevOperation(Operation)
	 * @see com.company.test1.datamodel.DatamodelPackage#getChangeover_PrevOperation()
	 * @model
	 * @generated
	 */
	Operation getPrevOperation();

	/**
	 * Sets the value of the '{@link com.company.test1.datamodel.Changeover#getPrevOperation <em>Prev Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prev Operation</em>' reference.
	 * @see #getPrevOperation()
	 * @generated
	 */
	void setPrevOperation(Operation value);

	/**
	 * Returns the value of the '<em><b>Next Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Operation</em>' reference.
	 * @see #setNextOperation(Operation)
	 * @see com.company.test1.datamodel.DatamodelPackage#getChangeover_NextOperation()
	 * @model
	 * @generated
	 */
	Operation getNextOperation();

	/**
	 * Sets the value of the '{@link com.company.test1.datamodel.Changeover#getNextOperation <em>Next Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Operation</em>' reference.
	 * @see #getNextOperation()
	 * @generated
	 */
	void setNextOperation(Operation value);

	/**
	 * Returns the value of the '<em><b>Work Center</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Center</em>' reference.
	 * @see #setWorkCenter(WorkCenter)
	 * @see com.company.test1.datamodel.DatamodelPackage#getChangeover_WorkCenter()
	 * @model
	 * @generated
	 */
	WorkCenter getWorkCenter();

	/**
	 * Sets the value of the '{@link com.company.test1.datamodel.Changeover#getWorkCenter <em>Work Center</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Center</em>' reference.
	 * @see #getWorkCenter()
	 * @generated
	 */
	void setWorkCenter(WorkCenter value);

	/**
	 * Returns the value of the '<em><b>Duration Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration Minutes</em>' attribute.
	 * @see #setDurationMinutes(double)
	 * @see com.company.test1.datamodel.DatamodelPackage#getChangeover_DurationMinutes()
	 * @model
	 * @generated
	 */
	double getDurationMinutes();

	/**
	 * Sets the value of the '{@link com.company.test1.datamodel.Changeover#getDurationMinutes <em>Duration Minutes</em>}' attribute.
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
	 * @see com.company.test1.datamodel.DatamodelPackage#getChangeover_Cost()
	 * @model
	 * @generated
	 */
	double getCost();

	/**
	 * Sets the value of the '{@link com.company.test1.datamodel.Changeover#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(double value);

} // Changeover
