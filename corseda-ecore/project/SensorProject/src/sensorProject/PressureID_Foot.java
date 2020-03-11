/**
 */
package sensorProject;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Pressure ID Foot</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see sensorProject.SensorProjectPackage#getPressureID_Foot()
 * @model
 * @generated
 */
public enum PressureID_Foot implements Enumerator {
	/**
	 * The '<em><b>LFOOT BUMPER LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LFOOT_BUMPER_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	LFOOT_BUMPER_LEFT(0, "LFOOT_BUMPER_LEFT", "LFOOT_BUMPER_LEFT"),

	/**
	 * The '<em><b>LFOOT BUMPER RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LFOOT_BUMPER_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	LFOOT_BUMPER_RIGHT(1, "LFOOT_BUMPER_RIGHT", "LFOOT_BUMPER_RIGHT"),

	/**
	 * The '<em><b>RFOOT BUMPER LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RFOOT_BUMPER_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	RFOOT_BUMPER_LEFT(2, "RFOOT_BUMPER_LEFT", "RFOOT_BUMPER_LEFT"),

	/**
	 * The '<em><b>RFOOT BUMPER RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RFOOT_BUMPER_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	RFOOT_BUMPER_RIGHT(3, "RFOOT_BUMPER_RIGHT", "RFOOT_BUMPER_RIGHT");

	/**
	 * The '<em><b>LFOOT BUMPER LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LFOOT BUMPER LEFT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LFOOT_BUMPER_LEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LFOOT_BUMPER_LEFT_VALUE = 0;

	/**
	 * The '<em><b>LFOOT BUMPER RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LFOOT BUMPER RIGHT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LFOOT_BUMPER_RIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LFOOT_BUMPER_RIGHT_VALUE = 1;

	/**
	 * The '<em><b>RFOOT BUMPER LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RFOOT BUMPER LEFT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RFOOT_BUMPER_LEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RFOOT_BUMPER_LEFT_VALUE = 2;

	/**
	 * The '<em><b>RFOOT BUMPER RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RFOOT BUMPER RIGHT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RFOOT_BUMPER_RIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RFOOT_BUMPER_RIGHT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Pressure ID Foot</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PressureID_Foot[] VALUES_ARRAY = new PressureID_Foot[] { LFOOT_BUMPER_LEFT, LFOOT_BUMPER_RIGHT,
			RFOOT_BUMPER_LEFT, RFOOT_BUMPER_RIGHT, };

	/**
	 * A public read-only list of all the '<em><b>Pressure ID Foot</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PressureID_Foot> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Pressure ID Foot</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PressureID_Foot get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PressureID_Foot result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pressure ID Foot</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PressureID_Foot getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PressureID_Foot result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pressure ID Foot</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PressureID_Foot get(int value) {
		switch (value) {
		case LFOOT_BUMPER_LEFT_VALUE:
			return LFOOT_BUMPER_LEFT;
		case LFOOT_BUMPER_RIGHT_VALUE:
			return LFOOT_BUMPER_RIGHT;
		case RFOOT_BUMPER_LEFT_VALUE:
			return RFOOT_BUMPER_LEFT;
		case RFOOT_BUMPER_RIGHT_VALUE:
			return RFOOT_BUMPER_RIGHT;
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
	private PressureID_Foot(int value, String name, String literal) {
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

} //PressureID_Foot
