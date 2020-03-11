/**
 */
package sensorProject;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Resolution ID</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see sensorProject.SensorProjectPackage#getResolutionID()
 * @model
 * @generated
 */
public enum ResolutionID implements Enumerator {
	/**
	 * The '<em><b>PX4 0x30</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PX4_0X30_VALUE
	 * @generated
	 * @ordered
	 */
	PX4_0X30(0, "PX40x30", "PX40x30"),

	/**
	 * The '<em><b>PX8 0x60</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PX8_0X60_VALUE
	 * @generated
	 * @ordered
	 */
	PX8_0X60(1, "PX80x60", "PX80x60"),

	/**
	 * The '<em><b>PX16 0x120</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PX16_0X120_VALUE
	 * @generated
	 * @ordered
	 */
	PX16_0X120(2, "PX160x120", "PX160x120"),

	/**
	 * The '<em><b>PX32 0x240</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PX32_0X240_VALUE
	 * @generated
	 * @ordered
	 */
	PX32_0X240(3, "PX320x240", "PX320x240"),

	/**
	 * The '<em><b>PX64 0x480</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PX64_0X480_VALUE
	 * @generated
	 * @ordered
	 */
	PX64_0X480(4, "PX640x480", "PX640x480"),

	/**
	 * The '<em><b>PX128 0x960</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PX128_0X960_VALUE
	 * @generated
	 * @ordered
	 */
	PX128_0X960(5, "PX1280x960", "PX1280x960");

	/**
	 * The '<em><b>PX4 0x30</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PX4 0x30</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PX4_0X30
	 * @model name="PX40x30"
	 * @generated
	 * @ordered
	 */
	public static final int PX4_0X30_VALUE = 0;

	/**
	 * The '<em><b>PX8 0x60</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PX8 0x60</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PX8_0X60
	 * @model name="PX80x60"
	 * @generated
	 * @ordered
	 */
	public static final int PX8_0X60_VALUE = 1;

	/**
	 * The '<em><b>PX16 0x120</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PX16 0x120</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PX16_0X120
	 * @model name="PX160x120"
	 * @generated
	 * @ordered
	 */
	public static final int PX16_0X120_VALUE = 2;

	/**
	 * The '<em><b>PX32 0x240</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PX32 0x240</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PX32_0X240
	 * @model name="PX320x240"
	 * @generated
	 * @ordered
	 */
	public static final int PX32_0X240_VALUE = 3;

	/**
	 * The '<em><b>PX64 0x480</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PX64 0x480</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PX64_0X480
	 * @model name="PX640x480"
	 * @generated
	 * @ordered
	 */
	public static final int PX64_0X480_VALUE = 4;

	/**
	 * The '<em><b>PX128 0x960</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PX128 0x960</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PX128_0X960
	 * @model name="PX1280x960"
	 * @generated
	 * @ordered
	 */
	public static final int PX128_0X960_VALUE = 5;

	/**
	 * An array of all the '<em><b>Resolution ID</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ResolutionID[] VALUES_ARRAY = new ResolutionID[] { PX4_0X30, PX8_0X60, PX16_0X120, PX32_0X240,
			PX64_0X480, PX128_0X960, };

	/**
	 * A public read-only list of all the '<em><b>Resolution ID</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ResolutionID> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Resolution ID</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResolutionID get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResolutionID result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resolution ID</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResolutionID getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResolutionID result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resolution ID</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResolutionID get(int value) {
		switch (value) {
		case PX4_0X30_VALUE:
			return PX4_0X30;
		case PX8_0X60_VALUE:
			return PX8_0X60;
		case PX16_0X120_VALUE:
			return PX16_0X120;
		case PX32_0X240_VALUE:
			return PX32_0X240;
		case PX64_0X480_VALUE:
			return PX64_0X480;
		case PX128_0X960_VALUE:
			return PX128_0X960;
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
	private ResolutionID(int value, String name, String literal) {
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

} //ResolutionID
