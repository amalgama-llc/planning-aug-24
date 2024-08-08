/**
 */
package com.company.test1.datamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unavailability Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.company.test1.datamodel.UnavailabilityAssignment#getScenario <em>Scenario</em>}</li>
 * </ul>
 *
 * @see com.company.test1.datamodel.DatamodelPackage#getUnavailabilityAssignment()
 * @model
 * @generated
 */
public interface UnavailabilityAssignment extends Assignment {
	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.company.test1.datamodel.Scenario#getUnavailabilityAssignments <em>Unavailability Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' container reference.
	 * @see #setScenario(Scenario)
	 * @see com.company.test1.datamodel.DatamodelPackage#getUnavailabilityAssignment_Scenario()
	 * @see com.company.test1.datamodel.Scenario#getUnavailabilityAssignments
	 * @model opposite="unavailabilityAssignments" transient="false"
	 * @generated
	 */
	Scenario getScenario();

	/**
	 * Sets the value of the '{@link com.company.test1.datamodel.UnavailabilityAssignment#getScenario <em>Scenario</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario</em>' container reference.
	 * @see #getScenario()
	 * @generated
	 */
	void setScenario(Scenario value);

} // UnavailabilityAssignment
