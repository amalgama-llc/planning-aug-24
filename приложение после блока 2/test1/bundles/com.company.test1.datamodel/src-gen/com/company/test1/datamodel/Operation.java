/**
 */
package com.company.test1.datamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.company.test1.datamodel.Operation#getName <em>Name</em>}</li>
 *   <li>{@link com.company.test1.datamodel.Operation#getScenario <em>Scenario</em>}</li>
 *   <li>{@link com.company.test1.datamodel.Operation#getMinDelayBeforeNextMinutes <em>Min Delay Before Next Minutes</em>}</li>
 * </ul>
 *
 * @see com.company.test1.datamodel.DatamodelPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.company.test1.datamodel.DatamodelPackage#getOperation_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.company.test1.datamodel.Operation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.company.test1.datamodel.Scenario#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' container reference.
	 * @see #setScenario(Scenario)
	 * @see com.company.test1.datamodel.DatamodelPackage#getOperation_Scenario()
	 * @see com.company.test1.datamodel.Scenario#getOperations
	 * @model opposite="operations" transient="false"
	 * @generated
	 */
	Scenario getScenario();

	/**
	 * Sets the value of the '{@link com.company.test1.datamodel.Operation#getScenario <em>Scenario</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario</em>' container reference.
	 * @see #getScenario()
	 * @generated
	 */
	void setScenario(Scenario value);

	/**
	 * Returns the value of the '<em><b>Min Delay Before Next Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Delay Before Next Minutes</em>' attribute.
	 * @see #setMinDelayBeforeNextMinutes(double)
	 * @see com.company.test1.datamodel.DatamodelPackage#getOperation_MinDelayBeforeNextMinutes()
	 * @model
	 * @generated
	 */
	double getMinDelayBeforeNextMinutes();

	/**
	 * Sets the value of the '{@link com.company.test1.datamodel.Operation#getMinDelayBeforeNextMinutes <em>Min Delay Before Next Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Delay Before Next Minutes</em>' attribute.
	 * @see #getMinDelayBeforeNextMinutes()
	 * @generated
	 */
	void setMinDelayBeforeNextMinutes(double value);

} // Operation
