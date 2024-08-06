/**
 */
package com.company.test1.datamodel.impl;

import com.company.test1.datamodel.DatamodelPackage;
import com.company.test1.datamodel.Operation;
import com.company.test1.datamodel.Scenario;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.company.test1.datamodel.impl.OperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.company.test1.datamodel.impl.OperationImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link com.company.test1.datamodel.impl.OperationImpl#getMinDelayBeforeNextMinutes <em>Min Delay Before Next Minutes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends MinimalEObjectImpl.Container implements Operation {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinDelayBeforeNextMinutes() <em>Min Delay Before Next Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinDelayBeforeNextMinutes()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_DELAY_BEFORE_NEXT_MINUTES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinDelayBeforeNextMinutes() <em>Min Delay Before Next Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinDelayBeforeNextMinutes()
	 * @generated
	 * @ordered
	 */
	protected double minDelayBeforeNextMinutes = MIN_DELAY_BEFORE_NEXT_MINUTES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatamodelPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.OPERATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Scenario getScenario() {
		if (eContainerFeatureID() != DatamodelPackage.OPERATION__SCENARIO)
			return null;
		return (Scenario) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScenario(Scenario newScenario, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newScenario, DatamodelPackage.OPERATION__SCENARIO, msgs);
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
				|| (eContainerFeatureID() != DatamodelPackage.OPERATION__SCENARIO && newScenario != null)) {
			if (EcoreUtil.isAncestor(this, newScenario))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newScenario != null)
				msgs = ((InternalEObject) newScenario).eInverseAdd(this, DatamodelPackage.SCENARIO__OPERATIONS,
						Scenario.class, msgs);
			msgs = basicSetScenario(newScenario, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.OPERATION__SCENARIO, newScenario,
					newScenario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMinDelayBeforeNextMinutes() {
		return minDelayBeforeNextMinutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinDelayBeforeNextMinutes(double newMinDelayBeforeNextMinutes) {
		double oldMinDelayBeforeNextMinutes = minDelayBeforeNextMinutes;
		minDelayBeforeNextMinutes = newMinDelayBeforeNextMinutes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DatamodelPackage.OPERATION__MIN_DELAY_BEFORE_NEXT_MINUTES, oldMinDelayBeforeNextMinutes,
					minDelayBeforeNextMinutes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DatamodelPackage.OPERATION__SCENARIO:
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
		case DatamodelPackage.OPERATION__SCENARIO:
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
		case DatamodelPackage.OPERATION__SCENARIO:
			return eInternalContainer().eInverseRemove(this, DatamodelPackage.SCENARIO__OPERATIONS, Scenario.class,
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
		case DatamodelPackage.OPERATION__NAME:
			return getName();
		case DatamodelPackage.OPERATION__SCENARIO:
			return getScenario();
		case DatamodelPackage.OPERATION__MIN_DELAY_BEFORE_NEXT_MINUTES:
			return getMinDelayBeforeNextMinutes();
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
		case DatamodelPackage.OPERATION__NAME:
			setName((String) newValue);
			return;
		case DatamodelPackage.OPERATION__SCENARIO:
			setScenario((Scenario) newValue);
			return;
		case DatamodelPackage.OPERATION__MIN_DELAY_BEFORE_NEXT_MINUTES:
			setMinDelayBeforeNextMinutes((Double) newValue);
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
		case DatamodelPackage.OPERATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DatamodelPackage.OPERATION__SCENARIO:
			setScenario((Scenario) null);
			return;
		case DatamodelPackage.OPERATION__MIN_DELAY_BEFORE_NEXT_MINUTES:
			setMinDelayBeforeNextMinutes(MIN_DELAY_BEFORE_NEXT_MINUTES_EDEFAULT);
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
		case DatamodelPackage.OPERATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DatamodelPackage.OPERATION__SCENARIO:
			return getScenario() != null;
		case DatamodelPackage.OPERATION__MIN_DELAY_BEFORE_NEXT_MINUTES:
			return minDelayBeforeNextMinutes != MIN_DELAY_BEFORE_NEXT_MINUTES_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", minDelayBeforeNextMinutes: ");
		result.append(minDelayBeforeNextMinutes);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
