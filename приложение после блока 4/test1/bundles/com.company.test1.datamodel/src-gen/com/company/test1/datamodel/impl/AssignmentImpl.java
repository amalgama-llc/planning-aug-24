/**
 */
package com.company.test1.datamodel.impl;

import com.company.test1.datamodel.Assignment;
import com.company.test1.datamodel.DatamodelPackage;
import com.company.test1.datamodel.WorkCenter;

import java.time.LocalDateTime;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.company.test1.datamodel.impl.AssignmentImpl#getWorkCenter <em>Work Center</em>}</li>
 *   <li>{@link com.company.test1.datamodel.impl.AssignmentImpl#getBeginDate <em>Begin Date</em>}</li>
 *   <li>{@link com.company.test1.datamodel.impl.AssignmentImpl#getEndDate <em>End Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AssignmentImpl extends MinimalEObjectImpl.Container implements Assignment {
	/**
	 * The cached value of the '{@link #getWorkCenter() <em>Work Center</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkCenter()
	 * @generated
	 * @ordered
	 */
	protected WorkCenter workCenter;

	/**
	 * The default value of the '{@link #getBeginDate() <em>Begin Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginDate()
	 * @generated
	 * @ordered
	 */
	protected static final LocalDateTime BEGIN_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeginDate() <em>Begin Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginDate()
	 * @generated
	 * @ordered
	 */
	protected LocalDateTime beginDate = BEGIN_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final LocalDateTime END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected LocalDateTime endDate = END_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatamodelPackage.Literals.ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkCenter getWorkCenter() {
		if (workCenter != null && workCenter.eIsProxy()) {
			InternalEObject oldWorkCenter = (InternalEObject) workCenter;
			workCenter = (WorkCenter) eResolveProxy(oldWorkCenter);
			if (workCenter != oldWorkCenter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatamodelPackage.ASSIGNMENT__WORK_CENTER,
							oldWorkCenter, workCenter));
			}
		}
		return workCenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkCenter basicGetWorkCenter() {
		return workCenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkCenter(WorkCenter newWorkCenter) {
		WorkCenter oldWorkCenter = workCenter;
		workCenter = newWorkCenter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.ASSIGNMENT__WORK_CENTER,
					oldWorkCenter, workCenter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocalDateTime getBeginDate() {
		return beginDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeginDate(LocalDateTime newBeginDate) {
		LocalDateTime oldBeginDate = beginDate;
		beginDate = newBeginDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.ASSIGNMENT__BEGIN_DATE, oldBeginDate,
					beginDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocalDateTime getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndDate(LocalDateTime newEndDate) {
		LocalDateTime oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.ASSIGNMENT__END_DATE, oldEndDate,
					endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DatamodelPackage.ASSIGNMENT__WORK_CENTER:
			if (resolve)
				return getWorkCenter();
			return basicGetWorkCenter();
		case DatamodelPackage.ASSIGNMENT__BEGIN_DATE:
			return getBeginDate();
		case DatamodelPackage.ASSIGNMENT__END_DATE:
			return getEndDate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DatamodelPackage.ASSIGNMENT__WORK_CENTER:
			setWorkCenter((WorkCenter) newValue);
			return;
		case DatamodelPackage.ASSIGNMENT__BEGIN_DATE:
			setBeginDate((LocalDateTime) newValue);
			return;
		case DatamodelPackage.ASSIGNMENT__END_DATE:
			setEndDate((LocalDateTime) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case DatamodelPackage.ASSIGNMENT__WORK_CENTER:
			setWorkCenter((WorkCenter) null);
			return;
		case DatamodelPackage.ASSIGNMENT__BEGIN_DATE:
			setBeginDate(BEGIN_DATE_EDEFAULT);
			return;
		case DatamodelPackage.ASSIGNMENT__END_DATE:
			setEndDate(END_DATE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DatamodelPackage.ASSIGNMENT__WORK_CENTER:
			return workCenter != null;
		case DatamodelPackage.ASSIGNMENT__BEGIN_DATE:
			return BEGIN_DATE_EDEFAULT == null ? beginDate != null : !BEGIN_DATE_EDEFAULT.equals(beginDate);
		case DatamodelPackage.ASSIGNMENT__END_DATE:
			return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (beginDate: ");
		result.append(beginDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(')');
		return result.toString();
	}

} //AssignmentImpl
