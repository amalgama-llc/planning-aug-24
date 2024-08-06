/**
 */
package com.company.test1.datamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Selector Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.company.test1.datamodel.DatamodelPackage#getSelectorType()
 * @model
 * @generated
 */
public enum SelectorType implements Enumerator {
	/**
	 * The '<em><b>FIRST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRST_VALUE
	 * @generated
	 * @ordered
	 */
	FIRST(0, "FIRST", "FIRST"),

	/**
	 * The '<em><b>FASTEST TO FINISH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FASTEST_TO_FINISH_VALUE
	 * @generated
	 * @ordered
	 */
	FASTEST_TO_FINISH(1, "FASTEST_TO_FINISH", "FASTEST_TO_FINISH"),

	/**
	 * The '<em><b>EARLIEST TO START</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EARLIEST_TO_START_VALUE
	 * @generated
	 * @ordered
	 */
	EARLIEST_TO_START(2, "EARLIEST_TO_START", "EARLIEST_TO_START"),
	/**
	* The '<em><b>CHEAPEST</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #CHEAPEST_VALUE
	* @generated
	* @ordered
	*/
	CHEAPEST(3, "CHEAPEST", "CHEAPEST");

	/**
	 * The '<em><b>FIRST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIRST_VALUE = 0;

	/**
	 * The '<em><b>FASTEST TO FINISH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FASTEST_TO_FINISH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FASTEST_TO_FINISH_VALUE = 1;

	/**
	 * The '<em><b>EARLIEST TO START</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EARLIEST_TO_START
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EARLIEST_TO_START_VALUE = 2;

	/**
	 * The '<em><b>CHEAPEST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEAPEST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHEAPEST_VALUE = 3;

	/**
	 * An array of all the '<em><b>Selector Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SelectorType[] VALUES_ARRAY = new SelectorType[] { FIRST, FASTEST_TO_FINISH, EARLIEST_TO_START,
			CHEAPEST, };

	/**
	 * A public read-only list of all the '<em><b>Selector Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SelectorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Selector Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SelectorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SelectorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Selector Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SelectorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SelectorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Selector Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SelectorType get(int value) {
		switch (value) {
		case FIRST_VALUE:
			return FIRST;
		case FASTEST_TO_FINISH_VALUE:
			return FASTEST_TO_FINISH;
		case EARLIEST_TO_START_VALUE:
			return EARLIEST_TO_START;
		case CHEAPEST_VALUE:
			return CHEAPEST;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SelectorType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
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
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //SelectorType
