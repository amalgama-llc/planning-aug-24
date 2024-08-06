/**
 */
package com.company.test1.datamodel.impl;

import com.company.test1.datamodel.DatamodelPackage;
import com.company.test1.datamodel.Product;
import com.company.test1.datamodel.ProductionPlanRecord;
import com.company.test1.datamodel.Scenario;

import java.time.LocalDateTime;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Production Plan Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.company.test1.datamodel.impl.ProductionPlanRecordImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link com.company.test1.datamodel.impl.ProductionPlanRecordImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link com.company.test1.datamodel.impl.ProductionPlanRecordImpl#getPlannedDate <em>Planned Date</em>}</li>
 *   <li>{@link com.company.test1.datamodel.impl.ProductionPlanRecordImpl#getScenario <em>Scenario</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductionPlanRecordImpl extends MinimalEObjectImpl.Container implements ProductionPlanRecord {
	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected Product product;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected int quantity = QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlannedDate() <em>Planned Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedDate()
	 * @generated
	 * @ordered
	 */
	protected static final LocalDateTime PLANNED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlannedDate() <em>Planned Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedDate()
	 * @generated
	 * @ordered
	 */
	protected LocalDateTime plannedDate = PLANNED_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductionPlanRecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatamodelPackage.Literals.PRODUCTION_PLAN_RECORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProduct() {
		if (product != null && product.eIsProxy()) {
			InternalEObject oldProduct = (InternalEObject) product;
			product = (Product) eResolveProxy(oldProduct);
			if (product != oldProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DatamodelPackage.PRODUCTION_PLAN_RECORD__PRODUCT, oldProduct, product));
			}
		}
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product basicGetProduct() {
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProduct(Product newProduct) {
		Product oldProduct = product;
		product = newProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.PRODUCTION_PLAN_RECORD__PRODUCT,
					oldProduct, product));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(int newQuantity) {
		int oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.PRODUCTION_PLAN_RECORD__QUANTITY,
					oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocalDateTime getPlannedDate() {
		return plannedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlannedDate(LocalDateTime newPlannedDate) {
		LocalDateTime oldPlannedDate = plannedDate;
		plannedDate = newPlannedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.PRODUCTION_PLAN_RECORD__PLANNED_DATE,
					oldPlannedDate, plannedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Scenario getScenario() {
		if (eContainerFeatureID() != DatamodelPackage.PRODUCTION_PLAN_RECORD__SCENARIO)
			return null;
		return (Scenario) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScenario(Scenario newScenario, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newScenario, DatamodelPackage.PRODUCTION_PLAN_RECORD__SCENARIO,
				msgs);
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
				|| (eContainerFeatureID() != DatamodelPackage.PRODUCTION_PLAN_RECORD__SCENARIO
						&& newScenario != null)) {
			if (EcoreUtil.isAncestor(this, newScenario))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newScenario != null)
				msgs = ((InternalEObject) newScenario).eInverseAdd(this,
						DatamodelPackage.SCENARIO__PRODUCTION_PLAN_RECORDS, Scenario.class, msgs);
			msgs = basicSetScenario(newScenario, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.PRODUCTION_PLAN_RECORD__SCENARIO,
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
		case DatamodelPackage.PRODUCTION_PLAN_RECORD__SCENARIO:
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
		case DatamodelPackage.PRODUCTION_PLAN_RECORD__SCENARIO:
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
		case DatamodelPackage.PRODUCTION_PLAN_RECORD__SCENARIO:
			return eInternalContainer().eInverseRemove(this, DatamodelPackage.SCENARIO__PRODUCTION_PLAN_RECORDS,
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
		case DatamodelPackage.PRODUCTION_PLAN_RECORD__PRODUCT:
			if (resolve)
				return getProduct();
			return basicGetProduct();
		case DatamodelPackage.PRODUCTION_PLAN_RECORD__QUANTITY:
			return getQuantity();
		case DatamodelPackage.PRODUCTION_PLAN_RECORD__PLANNED_DATE:
			return getPlannedDate();
		case DatamodelPackage.PRODUCTION_PLAN_RECORD__SCENARIO:
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
		case DatamodelPackage.PRODUCTION_PLAN_RECORD__PRODUCT:
			setProduct((Product) newValue);
			return;
		case DatamodelPackage.PRODUCTION_PLAN_RECORD__QUANTITY:
			setQuantity((Integer) newValue);
			return;
		case DatamodelPackage.PRODUCTION_PLAN_RECORD__PLANNED_DATE:
			setPlannedDate((LocalDateTime) newValue);
			return;
		case DatamodelPackage.PRODUCTION_PLAN_RECORD__SCENARIO:
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
		case DatamodelPackage.PRODUCTION_PLAN_RECORD__PRODUCT:
			setProduct((Product) null);
			return;
		case DatamodelPackage.PRODUCTION_PLAN_RECORD__QUANTITY:
			setQuantity(QUANTITY_EDEFAULT);
			return;
		case DatamodelPackage.PRODUCTION_PLAN_RECORD__PLANNED_DATE:
			setPlannedDate(PLANNED_DATE_EDEFAULT);
			return;
		case DatamodelPackage.PRODUCTION_PLAN_RECORD__SCENARIO:
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
		case DatamodelPackage.PRODUCTION_PLAN_RECORD__PRODUCT:
			return product != null;
		case DatamodelPackage.PRODUCTION_PLAN_RECORD__QUANTITY:
			return quantity != QUANTITY_EDEFAULT;
		case DatamodelPackage.PRODUCTION_PLAN_RECORD__PLANNED_DATE:
			return PLANNED_DATE_EDEFAULT == null ? plannedDate != null : !PLANNED_DATE_EDEFAULT.equals(plannedDate);
		case DatamodelPackage.PRODUCTION_PLAN_RECORD__SCENARIO:
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
		result.append(" (quantity: ");
		result.append(quantity);
		result.append(", plannedDate: ");
		result.append(plannedDate);
		result.append(')');
		return result.toString();
	}

} //ProductionPlanRecordImpl
