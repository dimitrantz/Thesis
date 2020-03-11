/**
 */
package sensorProject;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Pressure ID Head</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see sensorProject.SensorProjectPackage#getPressureID_Head()
 * @model
 * @generated
 */
public enum PressureID_Head implements Enumerator {
	/**
	 * The '<em><b>HEAD TOUCH REAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAD_TOUCH_REAR_VALUE
	 * @generated
	 * @ordered
	 */
	HEAD_TOUCH_REAR(0, "HEAD_TOUCH_REAR", "HEAD_TOUCH_REAR"),

	/**
	 * The '<em><b>HEAD TOUCH FRONT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAD_TOUCH_FRONT_VALUE
	 * @generated
	 * @ordered
	 */
	HEAD_TOUCH_FRONT(1, "HEAD_TOUCH_FRONT", "HEAD_TOUCH_FRONT"),

	/**
	 * The '<em><b>HEAD TOUCH MIDDLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAD_TOUCH_MIDDLE_VALUE
	 * @generated
	 * @ordered
	 */
	HEAD_TOUCH_MIDDLE(2, "HEAD_TOUCH_MIDDLE", "HEAD_TOUCH_MIDDLE");

	/**
	 * The '<em><b>HEAD TOUCH REAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HEAD TOUCH REAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEAD_TOUCH_REAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEAD_TOUCH_REAR_VALUE = 0;

	/**
	 * The '<em><b>HEAD TOUCH FRONT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HEAD TOUCH FRONT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEAD_TOUCH_FRONT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEAD_TOUCH_FRONT_VALUE = 1;

	/**
	 * The '<em><b>HEAD TOUCH MIDDLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HEAD TOUCH MIDDLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEAD_TOUCH_MIDDLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEAD_TOUCH_MIDDLE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Pressure ID Head</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PressureID_Head[] VALUES_ARRAY = new PressureID_Head[] { HEAD_TOUCH_REAR, HEAD_TOUCH_FRONT,
			HEAD_TOUCH_MIDDLE, };

	/**
	 * A public read-only list of all the '<em><b>Pressure ID Head</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PressureID_Head> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Pressure ID Head</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PressureID_Head get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PressureID_Head result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pressure ID Head</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PressureID_Head getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PressureID_Head result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pressure ID Head</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PressureID_Head get(int value) {
		switch (value) {
		case HEAD_TOUCH_REAR_VALUE:
			return HEAD_TOUCH_REAR;
		case HEAD_TOUCH_FRONT_VALUE:
			return HEAD_TOUCH_FRONT;
		case HEAD_TOUCH_MIDDLE_VALUE:
			return HEAD_TOUCH_MIDDLE;
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
	private PressureID_Head(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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

} //PressureID_Head
