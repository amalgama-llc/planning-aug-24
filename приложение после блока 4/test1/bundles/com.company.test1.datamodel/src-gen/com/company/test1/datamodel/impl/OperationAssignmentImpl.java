/**
 */
package com.company.test1.datamodel.impl;

import com.company.test1.datamodel.DatamodelPackage;
import com.company.test1.datamodel.Operation;
import com.company.test1.datamodel.OperationAssignment;
import com.company.test1.datamodel.Product;
import com.company.test1.datamodel.Scenario;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.company.test1.datamodel.impl.OperationAssignmentImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link com.company.test1.datamodel.impl.OperationAssignmentImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link com.company.test1.datamodel.impl.OperationAssignmentImpl#getProductionPlanItemIndex <em>Production Plan Item Index</em>}</li>
 *   <li>{@link com.company.test1.datamodel.impl.OperationAssignmentImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link com.company.test1.datamodel.impl.OperationAssignmentImpl#getCost <em>Cost</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationAssignmentImpl extends AssignmentImpl implements OperationAssignment {
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
	 * The default value of the '{@link #getProductionPlanItemIndex() <em>Production Plan Item Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductionPlanItemIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int PRODUCTION_PLAN_ITEM_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getProductionPlanItemIndex() <em>Production Plan Item Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductionPlanItemIndex()
	 * @generated
	 * @ordered
	 */
	protected int productionPlanItemIndex = PRODUCTION_PLAN_ITEM_INDEX_EDEFAULT;

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
	protected OperationAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatamodelPackage.Literals.OPERATION_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Scenario getScenario() {
		if (eContainerFeatureID() != DatamodelPackage.OPERATION_ASSIGNMENT__SCENARIO)
			return null;
		return (Scenario) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScenario(Scenario newScenario, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newScenario, DatamodelPackage.OPERATION_ASSIGNMENT__SCENARIO, msgs);
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
				|| (eContainerFeatureID() != DatamodelPackage.OPERATION_ASSIGNMENT__SCENARIO && newScenario != null)) {
			if (EcoreUtil.isAncestor(this, newScenario))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newScenario != null)
				msgs = ((InternalEObject) newScenario).eInverseAdd(this,
						DatamodelPackage.SCENARIO__OPERATION_ASSIGNMENTS, Scenario.class, msgs);
			msgs = basicSetScenario(newScenario, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.OPERATION_ASSIGNMENT__SCENARIO,
					newScenario, newScenario));
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
							DatamodelPackage.OPERATION_ASSIGNMENT__PRODUCT, oldProduct, product));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.OPERATION_ASSIGNMENT__PRODUCT,
					oldProduct, product));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getProductionPlanItemIndex() {
		return productionPlanItemIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductionPlanItemIndex(int newProductionPlanItemIndex) {
		int oldProductionPlanItemIndex = productionPlanItemIndex;
		productionPlanItemIndex = newProductionPlanItemIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DatamodelPackage.OPERATION_ASSIGNMENT__PRODUCTION_PLAN_ITEM_INDEX, oldProductionPlanItemIndex,
					productionPlanItemIndex));
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
							DatamodelPackage.OPERATION_ASSIGNMENT__OPERATION, oldOperation, operation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.OPERATION_ASSIGNMENT__OPERATION,
					oldOperation, operation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.OPERATION_ASSIGNMENT__COST, oldCost,
					cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DatamodelPackage.OPERATION_ASSIGNMENT__SCENARIO:
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
		case DatamodelPackage.OPERATION_ASSIGNMENT__SCENARIO:
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
		case DatamodelPackage.OPERATION_ASSIGNMENT__SCENARIO:
			return eInternalContainer().eInverseRemove(this, DatamodelPackage.SCENARIO__OPERATION_ASSIGNMENTS,
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
		case DatamodelPackage.OPERATION_ASSIGNMENT__SCENARIO:
			return getScenario();
		case DatamodelPackage.OPERATION_ASSIGNMENT__PRODUCT:
			if (resolve)
				return getProduct();
			return basicGetProduct();
		case DatamodelPackage.OPERATION_ASSIGNMENT__PRODUCTION_PLAN_ITEM_INDEX:
			return getProductionPlanItemIndex();
		case DatamodelPackage.OPERATION_ASSIGNMENT__OPERATION:
			if (resolve)
				return getOperation();
			return basicGetOperation();
		case DatamodelPackage.OPERATION_ASSIGNMENT__COST:
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
		case DatamodelPackage.OPERATION_ASSIGNMENT__SCENARIO:
			setScenario((Scenario) newValue);
			return;
		case DatamodelPackage.OPERATION_ASSIGNMENT__PRODUCT:
			setProduct((Product) newValue);
			return;
		case DatamodelPackage.OPERATION_ASSIGNMENT__PRODUCTION_PLAN_ITEM_INDEX:
			setProductionPlanItemIndex((Integer) newValue);
			return;
		case DatamodelPackage.OPERATION_ASSIGNMENT__OPERATION:
			setOperation((Operation) newValue);
			return;
		case DatamodelPackage.OPERATION_ASSIGNMENT__COST:
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
		case DatamodelPackage.OPERATION_ASSIGNMENT__SCENARIO:
			setScenario((Scenario) null);
			return;
		case DatamodelPackage.OPERATION_ASSIGNMENT__PRODUCT:
			setProduct((Product) null);
			return;
		case DatamodelPackage.OPERATION_ASSIGNMENT__PRODUCTION_PLAN_ITEM_INDEX:
			setProductionPlanItemIndex(PRODUCTION_PLAN_ITEM_INDEX_EDEFAULT);
			return;
		case DatamodelPackage.OPERATION_ASSIGNMENT__OPERATION:
			setOperation((Operation) null);
			return;
		case DatamodelPackage.OPERATION_ASSIGNMENT__COST:
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
		case DatamodelPackage.OPERATION_ASSIGNMENT__SCENARIO:
			return getScenario() != null;
		case DatamodelPackage.OPERATION_ASSIGNMENT__PRODUCT:
			return product != null;
		case DatamodelPackage.OPERATION_ASSIGNMENT__PRODUCTION_PLAN_ITEM_INDEX:
			return productionPlanItemIndex != PRODUCTION_PLAN_ITEM_INDEX_EDEFAULT;
		case DatamodelPackage.OPERATION_ASSIGNMENT__OPERATION:
			return operation != null;
		case DatamodelPackage.OPERATION_ASSIGNMENT__COST:
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
		result.append(" (productionPlanItemIndex: ");
		result.append(productionPlanItemIndex);
		result.append(", cost: ");
		result.append(cost);
		result.append(')');
		return result.toString();
	}

} //OperationAssignmentImpl
