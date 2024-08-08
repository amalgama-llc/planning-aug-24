/**
 */
package com.company.test1.datamodel;

import java.time.LocalDateTime;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.company.test1.datamodel.Assignment#getWorkCenter <em>Work Center</em>}</li>
 *   <li>{@link com.company.test1.datamodel.Assignment#getBeginDate <em>Begin Date</em>}</li>
 *   <li>{@link com.company.test1.datamodel.Assignment#getEndDate <em>End Date</em>}</li>
 * </ul>
 *
 * @see com.company.test1.datamodel.DatamodelPackage#getAssignment()
 * @model abstract="true"
 * @generated
 */
public interface Assignment extends EObject {
	/**
	 * Returns the value of the '<em><b>Work Center</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Center</em>' reference.
	 * @see #setWorkCenter(WorkCenter)
	 * @see com.company.test1.datamodel.DatamodelPackage#getAssignment_WorkCenter()
	 * @model
	 * @generated
	 */
	WorkCenter getWorkCenter();

	/**
	 * Sets the value of the '{@link com.company.test1.datamodel.Assignment#getWorkCenter <em>Work Center</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Center</em>' reference.
	 * @see #getWorkCenter()
	 * @generated
	 */
	void setWorkCenter(WorkCenter value);

	/**
	 * Returns the value of the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin Date</em>' attribute.
	 * @see #setBeginDate(LocalDateTime)
	 * @see com.company.test1.datamodel.DatamodelPackage#getAssignment_BeginDate()
	 * @model dataType="com.amalgamasimulation.ecoreutils.LocalDateTime"
	 * @generated
	 */
	LocalDateTime getBeginDate();

	/**
	 * Sets the value of the '{@link com.company.test1.datamodel.Assignment#getBeginDate <em>Begin Date</em>}' attribute.
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
	 * @see com.company.test1.datamodel.DatamodelPackage#getAssignment_EndDate()
	 * @model dataType="com.amalgamasimulation.ecoreutils.LocalDateTime"
	 * @generated
	 */
	LocalDateTime getEndDate();

	/**
	 * Sets the value of the '{@link com.company.test1.datamodel.Assignment#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(LocalDateTime value);

} // Assignment
