/**
 */
package com.company.test1.datamodel.impl;

import com.company.test1.datamodel.Changeover;
import com.company.test1.datamodel.DatamodelPackage;
import com.company.test1.datamodel.Operation;
import com.company.test1.datamodel.OperationAssignment;
import com.company.test1.datamodel.PerformanceRecord;
import com.company.test1.datamodel.Product;
import com.company.test1.datamodel.ProductionPlanRecord;
import com.company.test1.datamodel.Scenario;
import com.company.test1.datamodel.SelectorType;
import com.company.test1.datamodel.UnavailabilityAssignment;
import com.company.test1.datamodel.WorkCenter;

import java.time.LocalDateTime;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.company.test1.datamodel.impl.ScenarioImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.company.test1.datamodel.impl.ScenarioImpl#getBeginDate <em>Begin Date</em>}</li>
 *   <li>{@link com.company.test1.datamodel.impl.ScenarioImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link com.company.test1.datamodel.impl.ScenarioImpl#getSelectorType <em>Selector Type</em>}</li>
 *   <li>{@link com.company.test1.datamodel.impl.ScenarioImpl#getWorkCenters <em>Work Centers</em>}</li>
 *   <li>{@link com.company.test1.datamodel.impl.ScenarioImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link com.company.test1.datamodel.impl.ScenarioImpl#getProducts <em>Products</em>}</li>
 *   <li>{@link com.company.test1.datamodel.impl.ScenarioImpl#getProductionPlanRecords <em>Production Plan Records</em>}</li>
 *   <li>{@link com.company.test1.datamodel.impl.ScenarioImpl#getPerformanceRecords <em>Performance Records</em>}</li>
 *   <li>{@link com.company.test1.datamodel.impl.ScenarioImpl#getChangeovers <em>Changeovers</em>}</li>
 *   <li>{@link com.company.test1.datamodel.impl.ScenarioImpl#getOperationAssignments <em>Operation Assignments</em>}</li>
 *   <li>{@link com.company.test1.datamodel.impl.ScenarioImpl#getUnavailabilityAssignments <em>Unavailability Assignments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioImpl extends MinimalEObjectImpl.Container implements Scenario {
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
	 * The default value of the '{@link #getSelectorType() <em>Selector Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectorType()
	 * @generated
	 * @ordered
	 */
	protected static final SelectorType SELECTOR_TYPE_EDEFAULT = SelectorType.FIRST;

	/**
	 * The cached value of the '{@link #getSelectorType() <em>Selector Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectorType()
	 * @generated
	 * @ordered
	 */
	protected SelectorType selectorType = SELECTOR_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWorkCenters() <em>Work Centers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkCenters()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkCenter> workCenters;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operations;

	/**
	 * The cached value of the '{@link #getProducts() <em>Products</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> products;

	/**
	 * The cached value of the '{@link #getProductionPlanRecords() <em>Production Plan Records</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductionPlanRecords()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductionPlanRecord> productionPlanRecords;

	/**
	 * The cached value of the '{@link #getPerformanceRecords() <em>Performance Records</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceRecords()
	 * @generated
	 * @ordered
	 */
	protected EList<PerformanceRecord> performanceRecords;

	/**
	 * The cached value of the '{@link #getChangeovers() <em>Changeovers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeovers()
	 * @generated
	 * @ordered
	 */
	protected EList<Changeover> changeovers;

	/**
	 * The cached value of the '{@link #getOperationAssignments() <em>Operation Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationAssignment> operationAssignments;

	/**
	 * The cached value of the '{@link #getUnavailabilityAssignments() <em>Unavailability Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnavailabilityAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<UnavailabilityAssignment> unavailabilityAssignments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatamodelPackage.Literals.SCENARIO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.SCENARIO__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.SCENARIO__BEGIN_DATE, oldBeginDate,
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.SCENARIO__END_DATE, oldEndDate,
					endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelectorType getSelectorType() {
		return selectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelectorType(SelectorType newSelectorType) {
		SelectorType oldSelectorType = selectorType;
		selectorType = newSelectorType == null ? SELECTOR_TYPE_EDEFAULT : newSelectorType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.SCENARIO__SELECTOR_TYPE,
					oldSelectorType, selectorType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkCenter> getWorkCenters() {
		if (workCenters == null) {
			workCenters = new EObjectContainmentWithInverseEList<WorkCenter>(WorkCenter.class, this,
					DatamodelPackage.SCENARIO__WORK_CENTERS, DatamodelPackage.WORK_CENTER__SCENARIO);
		}
		return workCenters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Operation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentWithInverseEList<Operation>(Operation.class, this,
					DatamodelPackage.SCENARIO__OPERATIONS, DatamodelPackage.OPERATION__SCENARIO);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Product> getProducts() {
		if (products == null) {
			products = new EObjectContainmentWithInverseEList<Product>(Product.class, this,
					DatamodelPackage.SCENARIO__PRODUCTS, DatamodelPackage.PRODUCT__SCENARIO);
		}
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductionPlanRecord> getProductionPlanRecords() {
		if (productionPlanRecords == null) {
			productionPlanRecords = new EObjectContainmentWithInverseEList<ProductionPlanRecord>(
					ProductionPlanRecord.class, this, DatamodelPackage.SCENARIO__PRODUCTION_PLAN_RECORDS,
					DatamodelPackage.PRODUCTION_PLAN_RECORD__SCENARIO);
		}
		return productionPlanRecords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PerformanceRecord> getPerformanceRecords() {
		if (performanceRecords == null) {
			performanceRecords = new EObjectContainmentWithInverseEList<PerformanceRecord>(PerformanceRecord.class,
					this, DatamodelPackage.SCENARIO__PERFORMANCE_RECORDS,
					DatamodelPackage.PERFORMANCE_RECORD__SCENARIO);
		}
		return performanceRecords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Changeover> getChangeovers() {
		if (changeovers == null) {
			changeovers = new EObjectContainmentWithInverseEList<Changeover>(Changeover.class, this,
					DatamodelPackage.SCENARIO__CHANGEOVERS, DatamodelPackage.CHANGEOVER__SCENARIO);
		}
		return changeovers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OperationAssignment> getOperationAssignments() {
		if (operationAssignments == null) {
			operationAssignments = new EObjectContainmentWithInverseEList<OperationAssignment>(
					OperationAssignment.class, this, DatamodelPackage.SCENARIO__OPERATION_ASSIGNMENTS,
					DatamodelPackage.OPERATION_ASSIGNMENT__SCENARIO);
		}
		return operationAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnavailabilityAssignment> getUnavailabilityAssignments() {
		if (unavailabilityAssignments == null) {
			unavailabilityAssignments = new EObjectContainmentWithInverseEList<UnavailabilityAssignment>(
					UnavailabilityAssignment.class, this, DatamodelPackage.SCENARIO__UNAVAILABILITY_ASSIGNMENTS,
					DatamodelPackage.UNAVAILABILITY_ASSIGNMENT__SCENARIO);
		}
		return unavailabilityAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DatamodelPackage.SCENARIO__WORK_CENTERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getWorkCenters()).basicAdd(otherEnd, msgs);
		case DatamodelPackage.SCENARIO__OPERATIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOperations()).basicAdd(otherEnd, msgs);
		case DatamodelPackage.SCENARIO__PRODUCTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getProducts()).basicAdd(otherEnd, msgs);
		case DatamodelPackage.SCENARIO__PRODUCTION_PLAN_RECORDS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getProductionPlanRecords()).basicAdd(otherEnd,
					msgs);
		case DatamodelPackage.SCENARIO__PERFORMANCE_RECORDS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPerformanceRecords()).basicAdd(otherEnd,
					msgs);
		case DatamodelPackage.SCENARIO__CHANGEOVERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getChangeovers()).basicAdd(otherEnd, msgs);
		case DatamodelPackage.SCENARIO__OPERATION_ASSIGNMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOperationAssignments()).basicAdd(otherEnd,
					msgs);
		case DatamodelPackage.SCENARIO__UNAVAILABILITY_ASSIGNMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getUnavailabilityAssignments())
					.basicAdd(otherEnd, msgs);
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
		case DatamodelPackage.SCENARIO__WORK_CENTERS:
			return ((InternalEList<?>) getWorkCenters()).basicRemove(otherEnd, msgs);
		case DatamodelPackage.SCENARIO__OPERATIONS:
			return ((InternalEList<?>) getOperations()).basicRemove(otherEnd, msgs);
		case DatamodelPackage.SCENARIO__PRODUCTS:
			return ((InternalEList<?>) getProducts()).basicRemove(otherEnd, msgs);
		case DatamodelPackage.SCENARIO__PRODUCTION_PLAN_RECORDS:
			return ((InternalEList<?>) getProductionPlanRecords()).basicRemove(otherEnd, msgs);
		case DatamodelPackage.SCENARIO__PERFORMANCE_RECORDS:
			return ((InternalEList<?>) getPerformanceRecords()).basicRemove(otherEnd, msgs);
		case DatamodelPackage.SCENARIO__CHANGEOVERS:
			return ((InternalEList<?>) getChangeovers()).basicRemove(otherEnd, msgs);
		case DatamodelPackage.SCENARIO__OPERATION_ASSIGNMENTS:
			return ((InternalEList<?>) getOperationAssignments()).basicRemove(otherEnd, msgs);
		case DatamodelPackage.SCENARIO__UNAVAILABILITY_ASSIGNMENTS:
			return ((InternalEList<?>) getUnavailabilityAssignments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DatamodelPackage.SCENARIO__NAME:
			return getName();
		case DatamodelPackage.SCENARIO__BEGIN_DATE:
			return getBeginDate();
		case DatamodelPackage.SCENARIO__END_DATE:
			return getEndDate();
		case DatamodelPackage.SCENARIO__SELECTOR_TYPE:
			return getSelectorType();
		case DatamodelPackage.SCENARIO__WORK_CENTERS:
			return getWorkCenters();
		case DatamodelPackage.SCENARIO__OPERATIONS:
			return getOperations();
		case DatamodelPackage.SCENARIO__PRODUCTS:
			return getProducts();
		case DatamodelPackage.SCENARIO__PRODUCTION_PLAN_RECORDS:
			return getProductionPlanRecords();
		case DatamodelPackage.SCENARIO__PERFORMANCE_RECORDS:
			return getPerformanceRecords();
		case DatamodelPackage.SCENARIO__CHANGEOVERS:
			return getChangeovers();
		case DatamodelPackage.SCENARIO__OPERATION_ASSIGNMENTS:
			return getOperationAssignments();
		case DatamodelPackage.SCENARIO__UNAVAILABILITY_ASSIGNMENTS:
			return getUnavailabilityAssignments();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DatamodelPackage.SCENARIO__NAME:
			setName((String) newValue);
			return;
		case DatamodelPackage.SCENARIO__BEGIN_DATE:
			setBeginDate((LocalDateTime) newValue);
			return;
		case DatamodelPackage.SCENARIO__END_DATE:
			setEndDate((LocalDateTime) newValue);
			return;
		case DatamodelPackage.SCENARIO__SELECTOR_TYPE:
			setSelectorType((SelectorType) newValue);
			return;
		case DatamodelPackage.SCENARIO__WORK_CENTERS:
			getWorkCenters().clear();
			getWorkCenters().addAll((Collection<? extends WorkCenter>) newValue);
			return;
		case DatamodelPackage.SCENARIO__OPERATIONS:
			getOperations().clear();
			getOperations().addAll((Collection<? extends Operation>) newValue);
			return;
		case DatamodelPackage.SCENARIO__PRODUCTS:
			getProducts().clear();
			getProducts().addAll((Collection<? extends Product>) newValue);
			return;
		case DatamodelPackage.SCENARIO__PRODUCTION_PLAN_RECORDS:
			getProductionPlanRecords().clear();
			getProductionPlanRecords().addAll((Collection<? extends ProductionPlanRecord>) newValue);
			return;
		case DatamodelPackage.SCENARIO__PERFORMANCE_RECORDS:
			getPerformanceRecords().clear();
			getPerformanceRecords().addAll((Collection<? extends PerformanceRecord>) newValue);
			return;
		case DatamodelPackage.SCENARIO__CHANGEOVERS:
			getChangeovers().clear();
			getChangeovers().addAll((Collection<? extends Changeover>) newValue);
			return;
		case DatamodelPackage.SCENARIO__OPERATION_ASSIGNMENTS:
			getOperationAssignments().clear();
			getOperationAssignments().addAll((Collection<? extends OperationAssignment>) newValue);
			return;
		case DatamodelPackage.SCENARIO__UNAVAILABILITY_ASSIGNMENTS:
			getUnavailabilityAssignments().clear();
			getUnavailabilityAssignments().addAll((Collection<? extends UnavailabilityAssignment>) newValue);
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
		case DatamodelPackage.SCENARIO__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DatamodelPackage.SCENARIO__BEGIN_DATE:
			setBeginDate(BEGIN_DATE_EDEFAULT);
			return;
		case DatamodelPackage.SCENARIO__END_DATE:
			setEndDate(END_DATE_EDEFAULT);
			return;
		case DatamodelPackage.SCENARIO__SELECTOR_TYPE:
			setSelectorType(SELECTOR_TYPE_EDEFAULT);
			return;
		case DatamodelPackage.SCENARIO__WORK_CENTERS:
			getWorkCenters().clear();
			return;
		case DatamodelPackage.SCENARIO__OPERATIONS:
			getOperations().clear();
			return;
		case DatamodelPackage.SCENARIO__PRODUCTS:
			getProducts().clear();
			return;
		case DatamodelPackage.SCENARIO__PRODUCTION_PLAN_RECORDS:
			getProductionPlanRecords().clear();
			return;
		case DatamodelPackage.SCENARIO__PERFORMANCE_RECORDS:
			getPerformanceRecords().clear();
			return;
		case DatamodelPackage.SCENARIO__CHANGEOVERS:
			getChangeovers().clear();
			return;
		case DatamodelPackage.SCENARIO__OPERATION_ASSIGNMENTS:
			getOperationAssignments().clear();
			return;
		case DatamodelPackage.SCENARIO__UNAVAILABILITY_ASSIGNMENTS:
			getUnavailabilityAssignments().clear();
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
		case DatamodelPackage.SCENARIO__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DatamodelPackage.SCENARIO__BEGIN_DATE:
			return BEGIN_DATE_EDEFAULT == null ? beginDate != null : !BEGIN_DATE_EDEFAULT.equals(beginDate);
		case DatamodelPackage.SCENARIO__END_DATE:
			return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
		case DatamodelPackage.SCENARIO__SELECTOR_TYPE:
			return selectorType != SELECTOR_TYPE_EDEFAULT;
		case DatamodelPackage.SCENARIO__WORK_CENTERS:
			return workCenters != null && !workCenters.isEmpty();
		case DatamodelPackage.SCENARIO__OPERATIONS:
			return operations != null && !operations.isEmpty();
		case DatamodelPackage.SCENARIO__PRODUCTS:
			return products != null && !products.isEmpty();
		case DatamodelPackage.SCENARIO__PRODUCTION_PLAN_RECORDS:
			return productionPlanRecords != null && !productionPlanRecords.isEmpty();
		case DatamodelPackage.SCENARIO__PERFORMANCE_RECORDS:
			return performanceRecords != null && !performanceRecords.isEmpty();
		case DatamodelPackage.SCENARIO__CHANGEOVERS:
			return changeovers != null && !changeovers.isEmpty();
		case DatamodelPackage.SCENARIO__OPERATION_ASSIGNMENTS:
			return operationAssignments != null && !operationAssignments.isEmpty();
		case DatamodelPackage.SCENARIO__UNAVAILABILITY_ASSIGNMENTS:
			return unavailabilityAssignments != null && !unavailabilityAssignments.isEmpty();
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
		result.append(", beginDate: ");
		result.append(beginDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", selectorType: ");
		result.append(selectorType);
		result.append(')');
		return result.toString();
	}

} //ScenarioImpl
