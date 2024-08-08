/**
 */
package com.company.test1.datamodel.impl;

import com.company.test1.datamodel.Changeover;
import com.company.test1.datamodel.DatamodelPackage;
import com.company.test1.datamodel.Operation;
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
 * An implementation of the model object '<em><b>Changeover</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.company.test1.datamodel.impl.ChangeoverImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link com.company.test1.datamodel.impl.ChangeoverImpl#getPrevOperation <em>Prev Operation</em>}</li>
 *   <li>{@link com.company.test1.datamodel.impl.ChangeoverImpl#getNextOperation <em>Next Operation</em>}</li>
 *   <li>{@link com.company.test1.datamodel.impl.ChangeoverImpl#getWorkCenter <em>Work Center</em>}</li>
 *   <li>{@link com.company.test1.datamodel.impl.ChangeoverImpl#getDurationMinutes <em>Duration Minutes</em>}</li>
 *   <li>{@link com.company.test1.datamodel.impl.ChangeoverImpl#getCost <em>Cost</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeoverImpl extends MinimalEObjectImpl.Container implements Changeover {
	/**
	 * The cached value of the '{@link #getPrevOperation() <em>Prev Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevOperation()
	 * @generated
	 * @ordered
	 */
	protected Operation prevOperation;

	/**
	 * The cached value of the '{@link #getNextOperation() <em>Next Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextOperation()
	 * @generated
	 * @ordered
	 */
	protected Operation nextOperation;

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
	protected ChangeoverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatamodelPackage.Literals.CHANGEOVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Scenario getScenario() {
		if (eContainerFeatureID() != DatamodelPackage.CHANGEOVER__SCENARIO)
			return null;
		return (Scenario) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScenario(Scenario newScenario, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newScenario, DatamodelPackage.CHANGEOVER__SCENARIO, msgs);
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
				|| (eContainerFeatureID() != DatamodelPackage.CHANGEOVER__SCENARIO && newScenario != null)) {
			if (EcoreUtil.isAncestor(this, newScenario))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newScenario != null)
				msgs = ((InternalEObject) newScenario).eInverseAdd(this, DatamodelPackage.SCENARIO__CHANGEOVERS,
						Scenario.class, msgs);
			msgs = basicSetScenario(newScenario, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.CHANGEOVER__SCENARIO, newScenario,
					newScenario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation getPrevOperation() {
		if (prevOperation != null && prevOperation.eIsProxy()) {
			InternalEObject oldPrevOperation = (InternalEObject) prevOperation;
			prevOperation = (Operation) eResolveProxy(oldPrevOperation);
			if (prevOperation != oldPrevOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DatamodelPackage.CHANGEOVER__PREV_OPERATION, oldPrevOperation, prevOperation));
			}
		}
		return prevOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetPrevOperation() {
		return prevOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrevOperation(Operation newPrevOperation) {
		Operation oldPrevOperation = prevOperation;
		prevOperation = newPrevOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.CHANGEOVER__PREV_OPERATION,
					oldPrevOperation, prevOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation getNextOperation() {
		if (nextOperation != null && nextOperation.eIsProxy()) {
			InternalEObject oldNextOperation = (InternalEObject) nextOperation;
			nextOperation = (Operation) eResolveProxy(oldNextOperation);
			if (nextOperation != oldNextOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DatamodelPackage.CHANGEOVER__NEXT_OPERATION, oldNextOperation, nextOperation));
			}
		}
		return nextOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetNextOperation() {
		return nextOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNextOperation(Operation newNextOperation) {
		Operation oldNextOperation = nextOperation;
		nextOperation = newNextOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.CHANGEOVER__NEXT_OPERATION,
					oldNextOperation, nextOperation));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatamodelPackage.CHANGEOVER__WORK_CENTER,
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.CHANGEOVER__WORK_CENTER,
					oldWorkCenter, workCenter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.CHANGEOVER__DURATION_MINUTES,
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.CHANGEOVER__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DatamodelPackage.CHANGEOVER__SCENARIO:
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
		case DatamodelPackage.CHANGEOVER__SCENARIO:
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
		case DatamodelPackage.CHANGEOVER__SCENARIO:
			return eInternalContainer().eInverseRemove(this, DatamodelPackage.SCENARIO__CHANGEOVERS, Scenario.class,
					msgs);
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
		case DatamodelPackage.CHANGEOVER__SCENARIO:
			return getScenario();
		case DatamodelPackage.CHANGEOVER__PREV_OPERATION:
			if (resolve)
				return getPrevOperation();
			return basicGetPrevOperation();
		case DatamodelPackage.CHANGEOVER__NEXT_OPERATION:
			if (resolve)
				return getNextOperation();
			return basicGetNextOperation();
		case DatamodelPackage.CHANGEOVER__WORK_CENTER:
			if (resolve)
				return getWorkCenter();
			return basicGetWorkCenter();
		case DatamodelPackage.CHANGEOVER__DURATION_MINUTES:
			return getDurationMinutes();
		case DatamodelPackage.CHANGEOVER__COST:
			return getCost();
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
		case DatamodelPackage.CHANGEOVER__SCENARIO:
			setScenario((Scenario) newValue);
			return;
		case DatamodelPackage.CHANGEOVER__PREV_OPERATION:
			setPrevOperation((Operation) newValue);
			return;
		case DatamodelPackage.CHANGEOVER__NEXT_OPERATION:
			setNextOperation((Operation) newValue);
			return;
		case DatamodelPackage.CHANGEOVER__WORK_CENTER:
			setWorkCenter((WorkCenter) newValue);
			return;
		case DatamodelPackage.CHANGEOVER__DURATION_MINUTES:
			setDurationMinutes((Double) newValue);
			return;
		case DatamodelPackage.CHANGEOVER__COST:
			setCost((Double) newValue);
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
		case DatamodelPackage.CHANGEOVER__SCENARIO:
			setScenario((Scenario) null);
			return;
		case DatamodelPackage.CHANGEOVER__PREV_OPERATION:
			setPrevOperation((Operation) null);
			return;
		case DatamodelPackage.CHANGEOVER__NEXT_OPERATION:
			setNextOperation((Operation) null);
			return;
		case DatamodelPackage.CHANGEOVER__WORK_CENTER:
			setWorkCenter((WorkCenter) null);
			return;
		case DatamodelPackage.CHANGEOVER__DURATION_MINUTES:
			setDurationMinutes(DURATION_MINUTES_EDEFAULT);
			return;
		case DatamodelPackage.CHANGEOVER__COST:
			setCost(COST_EDEFAULT);
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
		case DatamodelPackage.CHANGEOVER__SCENARIO:
			return getScenario() != null;
		case DatamodelPackage.CHANGEOVER__PREV_OPERATION:
			return prevOperation != null;
		case DatamodelPackage.CHANGEOVER__NEXT_OPERATION:
			return nextOperation != null;
		case DatamodelPackage.CHANGEOVER__WORK_CENTER:
			return workCenter != null;
		case DatamodelPackage.CHANGEOVER__DURATION_MINUTES:
			return durationMinutes != DURATION_MINUTES_EDEFAULT;
		case DatamodelPackage.CHANGEOVER__COST:
			return cost != COST_EDEFAULT;
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

} //ChangeoverImpl
