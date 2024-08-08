/**
 */
package com.company.test1.datamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.company.test1.datamodel.OperationAssignment#getScenario <em>Scenario</em>}</li>
 *   <li>{@link com.company.test1.datamodel.OperationAssignment#getProduct <em>Product</em>}</li>
 *   <li>{@link com.company.test1.datamodel.OperationAssignment#getProductionPlanItemIndex <em>Production Plan Item Index</em>}</li>
 *   <li>{@link com.company.test1.datamodel.OperationAssignment#getOperation <em>Operation</em>}</li>
 *   <li>{@link com.company.test1.datamodel.OperationAssignment#getCost <em>Cost</em>}</li>
 * </ul>
 *
 * @see com.company.test1.datamodel.DatamodelPackage#getOperationAssignment()
 * @model
 * @generated
 */
public interface OperationAssignment extends Assignment {
	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.company.test1.datamodel.Scenario#getOperationAssignments <em>Operation Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' container reference.
	 * @see #setScenario(Scenario)
	 * @see com.company.test1.datamodel.DatamodelPackage#getOperationAssignment_Scenario()
	 * @see com.company.test1.datamodel.Scenario#getOperationAssignments
	 * @model opposite="operationAssignments" transient="false"
	 * @generated
	 */
	Scenario getScenario();

	/**
	 * Sets the value of the '{@link com.company.test1.datamodel.OperationAssignment#getScenario <em>Scenario</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario</em>' container reference.
	 * @see #getScenario()
	 * @generated
	 */
	void setScenario(Scenario value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see com.company.test1.datamodel.DatamodelPackage#getOperationAssignment_Product()
	 * @model
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link com.company.test1.datamodel.OperationAssignment#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

	/**
	 * Returns the value of the '<em><b>Production Plan Item Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Production Plan Item Index</em>' attribute.
	 * @see #setProductionPlanItemIndex(int)
	 * @see com.company.test1.datamodel.DatamodelPackage#getOperationAssignment_ProductionPlanItemIndex()
	 * @model
	 * @generated
	 */
	int getProductionPlanItemIndex();

	/**
	 * Sets the value of the '{@link com.company.test1.datamodel.OperationAssignment#getProductionPlanItemIndex <em>Production Plan Item Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Production Plan Item Index</em>' attribute.
	 * @see #getProductionPlanItemIndex()
	 * @generated
	 */
	void setProductionPlanItemIndex(int value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(Operation)
	 * @see com.company.test1.datamodel.DatamodelPackage#getOperationAssignment_Operation()
	 * @model
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link com.company.test1.datamodel.OperationAssignment#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @see com.company.test1.datamodel.DatamodelPackage#getOperationAssignment_Cost()
	 * @model
	 * @generated
	 */
	double getCost();

	/**
	 * Sets the value of the '{@link com.company.test1.datamodel.OperationAssignment#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(double value);

} // OperationAssignment
