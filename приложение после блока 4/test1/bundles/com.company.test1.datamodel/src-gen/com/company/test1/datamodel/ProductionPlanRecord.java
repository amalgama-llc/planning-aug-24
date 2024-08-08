/**
 */
package com.company.test1.datamodel;

import java.time.LocalDateTime;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Production Plan Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.company.test1.datamodel.ProductionPlanRecord#getProduct <em>Product</em>}</li>
 *   <li>{@link com.company.test1.datamodel.ProductionPlanRecord#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link com.company.test1.datamodel.ProductionPlanRecord#getPlannedDate <em>Planned Date</em>}</li>
 *   <li>{@link com.company.test1.datamodel.ProductionPlanRecord#getScenario <em>Scenario</em>}</li>
 * </ul>
 *
 * @see com.company.test1.datamodel.DatamodelPackage#getProductionPlanRecord()
 * @model
 * @generated
 */
public interface ProductionPlanRecord extends EObject {
	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see com.company.test1.datamodel.DatamodelPackage#getProductionPlanRecord_Product()
	 * @model
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link com.company.test1.datamodel.ProductionPlanRecord#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see com.company.test1.datamodel.DatamodelPackage#getProductionPlanRecord_Quantity()
	 * @model
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link com.company.test1.datamodel.ProductionPlanRecord#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Planned Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planned Date</em>' attribute.
	 * @see #setPlannedDate(LocalDateTime)
	 * @see com.company.test1.datamodel.DatamodelPackage#getProductionPlanRecord_PlannedDate()
	 * @model dataType="com.amalgamasimulation.ecoreutils.LocalDateTime"
	 * @generated
	 */
	LocalDateTime getPlannedDate();

	/**
	 * Sets the value of the '{@link com.company.test1.datamodel.ProductionPlanRecord#getPlannedDate <em>Planned Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planned Date</em>' attribute.
	 * @see #getPlannedDate()
	 * @generated
	 */
	void setPlannedDate(LocalDateTime value);

	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.company.test1.datamodel.Scenario#getProductionPlanRecords <em>Production Plan Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' container reference.
	 * @see #setScenario(Scenario)
	 * @see com.company.test1.datamodel.DatamodelPackage#getProductionPlanRecord_Scenario()
	 * @see com.company.test1.datamodel.Scenario#getProductionPlanRecords
	 * @model opposite="productionPlanRecords" transient="false"
	 * @generated
	 */
	Scenario getScenario();

	/**
	 * Sets the value of the '{@link com.company.test1.datamodel.ProductionPlanRecord#getScenario <em>Scenario</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario</em>' container reference.
	 * @see #getScenario()
	 * @generated
	 */
	void setScenario(Scenario value);

} // ProductionPlanRecord
