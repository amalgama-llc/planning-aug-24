/**
 */
package com.company.test1.datamodel.impl;

import com.company.test1.datamodel.DatamodelPackage;
import com.company.test1.datamodel.Operation;
import com.company.test1.datamodel.PerformanceRecord;
import com.company.test1.datamodel.Scenario;
import com.company.test1.datamodel.WorkCenter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Performance Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.company.test1.datamodel.impl.PerformanceRecordImpl#getWorkCenter <em>Work Center</em>}</li>
 *   <li>{@link com.company.test1.datamodel.impl.PerformanceRecordImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link com.company.test1.datamodel.impl.PerformanceRecordImpl#getDurationMinutes <em>Duration Minutes</em>}</li>
 *   <li>{@link com.company.test1.datamodel.impl.PerformanceRecordImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link com.company.test1.datamodel.impl.PerformanceRecordImpl#getScenario <em>Scenario</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerformanceRecordImpl extends MinimalEObjectImpl.Container implements PerformanceRecord {
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
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected Operation operation;

	/**
	 * The default value of the '{@link #getDurationMinutes() <em>Duration Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationMinutes()
	 * @generated
	 * @ordered
	 */
	protected static final double DURATION_MINUTES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDurationMinutes() <em>Duration Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationMinutes()
	 * @generated
	 * @ordered
	 */
	protected double durationMinutes = DURATION_MINUTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final double COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected double cost = COST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformanceRecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatamodelPackage.Literals.PERFORMANCE_RECORD;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DatamodelPackage.PERFORMANCE_RECORD__WORK_CENTER, oldWorkCenter, workCenter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.PERFORMANCE_RECORD__WORK_CENTER,
					oldWorkCenter, workCenter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation getOperation() {
		if (operation != null && operation.eIsProxy()) {
			InternalEObject oldOperation = (InternalEObject) operation;
			operation = (Operation) eResolveProxy(oldOperation);
			if (operation != oldOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DatamodelPackage.PERFORMANCE_RECORD__OPERATION, oldOperation, operation));
			}
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperation(Operation newOperation) {
		Operation oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.PERFORMANCE_RECORD__OPERATION,
					oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDurationMinutes() {
		return durationMinutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDurationMinutes(double newDurationMinutes) {
		double oldDurationMinutes = durationMinutes;
		durationMinutes = newDurationMinutes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.PERFORMANCE_RECORD__DURATION_MINUTES,
					oldDurationMinutes, durationMinutes));
	}

	/**
	 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCost(double newCost) {
		double oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.PERFORMANCE_RECORD__COST, oldCost,
					cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Scenario getScenario() {
		if (eContainerFeatureID() != DatamodelPackage.PERFORMANCE_RECORD__SCENARIO)
			return null;
		return (Scenario) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScenario(Scenario newScenario, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newScenario, DatamodelPackage.PERFORMANCE_RECORD__SCENARIO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScenario(Scenario newScenario) {
		if (newScenario != eInternalContainer()
				|| (eContainerFeatureID() != DatamodelPackage.PERFORMANCE_RECORD__SCENARIO && newScenario != null)) {
			if (EcoreUtil.isAncestor(this, newScenario))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newScenario != null)
				msgs = ((InternalEObject) newScenario).eInverseAdd(this, DatamodelPackage.SCENARIO__PERFORMANCE_RECORDS,
						Scenario.class, msgs);
			msgs = basicSetScenario(newScenario, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.PERFORMANCE_RECORD__SCENARIO,
					newScenario, newScenario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DatamodelPackage.PERFORMANCE_RECORD__SCENARIO:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetScenario((Scenario) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DatamodelPackage.PERFORMANCE_RECORD__SCENARIO:
			return basicSetScenario(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case DatamodelPackage.PERFORMANCE_RECORD__SCENARIO:
			return eInternalContainer().eInverseRemove(this, DatamodelPackage.SCENARIO__PERFORMANCE_RECORDS,
					Scenario.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DatamodelPackage.PERFORMANCE_RECORD__WORK_CENTER:
			if (resolve)
				return getWorkCenter();
			return basicGetWorkCenter();
		case DatamodelPackage.PERFORMANCE_RECORD__OPERATION:
			if (resolve)
				return getOperation();
			return basicGetOperation();
		case DatamodelPackage.PERFORMANCE_RECORD__DURATION_MINUTES:
			return getDurationMinutes();
		case DatamodelPackage.PERFORMANCE_RECORD__COST:
			return getCost();
		case DatamodelPackage.PERFORMANCE_RECORD__SCENARIO:
			return getScenario();
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
		case DatamodelPackage.PERFORMANCE_RECORD__WORK_CENTER:
			setWorkCenter((WorkCenter) newValue);
			return;
		case DatamodelPackage.PERFORMANCE_RECORD__OPERATION:
			setOperation((Operation) newValue);
			return;
		case DatamodelPackage.PERFORMANCE_RECORD__DURATION_MINUTES:
			setDurationMinutes((Double) newValue);
			return;
		case DatamodelPackage.PERFORMANCE_RECORD__COST:
			setCost((Double) newValue);
			return;
		case DatamodelPackage.PERFORMANCE_RECORD__SCENARIO:
			setScenario((Scenario) newValue);
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
		case DatamodelPackage.PERFORMANCE_RECORD__WORK_CENTER:
			setWorkCenter((WorkCenter) null);
			return;
		case DatamodelPackage.PERFORMANCE_RECORD__OPERATION:
			setOperation((Operation) null);
			return;
		case DatamodelPackage.PERFORMANCE_RECORD__DURATION_MINUTES:
			setDurationMinutes(DURATION_MINUTES_EDEFAULT);
			return;
		case DatamodelPackage.PERFORMANCE_RECORD__COST:
			setCost(COST_EDEFAULT);
			return;
		case DatamodelPackage.PERFORMANCE_RECORD__SCENARIO:
			setScenario((Scenario) null);
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
		case DatamodelPackage.PERFORMANCE_RECORD__WORK_CENTER:
			return workCenter != null;
		case DatamodelPackage.PERFORMANCE_RECORD__OPERATION:
			return operation != null;
		case DatamodelPackage.PERFORMANCE_RECORD__DURATION_MINUTES:
			return durationMinutes != DURATION_MINUTES_EDEFAULT;
		case DatamodelPackage.PERFORMANCE_RECORD__COST:
			return cost != COST_EDEFAULT;
		case DatamodelPackage.PERFORMANCE_RECORD__SCENARIO:
			return getScenario() != null;
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
		result.append(" (durationMinutes: ");
		result.append(durationMinutes);
		result.append(", cost: ");
		result.append(cost);
		result.append(')');
		return result.toString();
	}

} //PerformanceRecordImpl
