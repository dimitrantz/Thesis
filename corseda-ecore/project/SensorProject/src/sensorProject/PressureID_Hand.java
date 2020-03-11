/**
 */
package sensorProject;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Pressure ID Hand</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see sensorProject.SensorProjectPackage#getPressureID_Hand()
 * @model
 * @generated
 */
public enum PressureID_Hand implements Enumerator {
	/**
	 * The '<em><b>LHAND TOUCH BACK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LHAND_TOUCH_BACK_VALUE
	 * @generated
	 * @ordered
	 */
	LHAND_TOUCH_BACK(0, "LHAND_TOUCH_BACK", "LHAND_TOUCH_BACK"),

	/**
	 * The '<em><b>LHAND TOUCH LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LHAND_TOUCH_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	LHAND_TOUCH_LEFT(1, "LHAND_TOUCH_LEFT", "LHAND_TOUCH_LEFT"),

	/**
	 * The '<em><b>LHAND TOUCH RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LHAND_TOUCH_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	LHAND_TOUCH_RIGHT(2, "LHAND_TOUCH_RIGHT", "LHAND_TOUCH_RIGHT"),

	/**
	 * The '<em><b>RHAND TOUCH BACK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RHAND_TOUCH_BACK_VALUE
	 * @generated
	 * @ordered
	 */
	RHAND_TOUCH_BACK(3, "RHAND_TOUCH_BACK", "RHAND_TOUCH_BACK"),

	/**
	 * The '<em><b>RHAND TOUCH LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RHAND_TOUCH_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	RHAND_TOUCH_LEFT(4, "RHAND_TOUCH_LEFT", "RHAND_TOUCH_LEFT"),

	/**
	 * The '<em><b>RHAND TOUCH RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RHAND_TOUCH_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	RHAND_TOUCH_RIGHT(5, "RHAND_TOUCH_RIGHT", "RHAND_TOUCH_RIGHT");

	/**
	 * The '<em><b>LHAND TOUCH BACK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LHAND TOUCH BACK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LHAND_TOUCH_BACK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LHAND_TOUCH_BACK_VALUE = 0;

	/**
	 * The '<em><b>LHAND TOUCH LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LHAND TOUCH LEFT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LHAND_TOUCH_LEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LHAND_TOUCH_LEFT_VALUE = 1;

	/**
	 * The '<em><b>LHAND TOUCH RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LHAND TOUCH RIGHT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LHAND_TOUCH_RIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LHAND_TOUCH_RIGHT_VALUE = 2;

	/**
	 * The '<em><b>RHAND TOUCH BACK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RHAND TOUCH BACK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RHAND_TOUCH_BACK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RHAND_TOUCH_BACK_VALUE = 3;

	/**
	 * The '<em><b>RHAND TOUCH LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RHAND TOUCH LEFT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RHAND_TOUCH_LEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RHAND_TOUCH_LEFT_VALUE = 4;

	/**
	 * The '<em><b>RHAND TOUCH RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RHAND TOUCH RIGHT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RHAND_TOUCH_RIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RHAND_TOUCH_RIGHT_VALUE = 5;

	/**
	 * An array of all the '<em><b>Pressure ID Hand</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PressureID_Hand[] VALUES_ARRAY = new PressureID_Hand[] { LHAND_TOUCH_BACK, LHAND_TOUCH_LEFT,
			LHAND_TOUCH_RIGHT, RHAND_TOUCH_BACK, RHAND_TOUCH_LEFT, RHAND_TOUCH_RIGHT, };

	/**
	 * A public read-only list of all the '<em><b>Pressure ID Hand</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PressureID_Hand> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Pressure ID Hand</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PressureID_Hand get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PressureID_Hand result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pressure ID Hand</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PressureID_Hand getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PressureID_Hand result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pressure ID Hand</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PressureID_Hand get(int value) {
		switch (value) {
		case LHAND_TOUCH_BACK_VALUE:
			return LHAND_TOUCH_BACK;
		case LHAND_TOUCH_LEFT_VALUE:
			return LHAND_TOUCH_LEFT;
		case LHAND_TOUCH_RIGHT_VALUE:
			return LHAND_TOUCH_RIGHT;
		case RHAND_TOUCH_BACK_VALUE:
			return RHAND_TOUCH_BACK;
		case RHAND_TOUCH_LEFT_VALUE:
			return RHAND_TOUCH_LEFT;
		case RHAND_TOUCH_RIGHT_VALUE:
			return RHAND_TOUCH_RIGHT;
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
	private PressureID_Hand(int value, String name, String literal) {
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

} //PressureID_Hand
