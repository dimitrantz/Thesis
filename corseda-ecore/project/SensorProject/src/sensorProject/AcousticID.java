/**
 */
package sensorProject;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Acoustic ID</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see sensorProject.SensorProjectPackage#getAcousticID()
 * @model
 * @generated
 */
public enum AcousticID implements Enumerator {
	/**
	 * The '<em><b>MICFRONT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICFRONT_VALUE
	 * @generated
	 * @ordered
	 */
	MICFRONT(0, "MICFRONT", "MICFRONT"),

	/**
	 * The '<em><b>MICREAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICREAR_VALUE
	 * @generated
	 * @ordered
	 */
	MICREAR(1, "MICREAR", "MICREAR"),

	/**
	 * The '<em><b>MICLEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICLEFT_VALUE
	 * @generated
	 * @ordered
	 */
	MICLEFT(2, "MICLEFT", "MICLEFT"),

	/**
	 * The '<em><b>MICRIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICRIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	MICRIGHT(3, "MICRIGHT", "MICRIGHT");

	/**
	 * The '<em><b>MICFRONT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MICFRONT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MICFRONT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MICFRONT_VALUE = 0;

	/**
	 * The '<em><b>MICREAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MICREAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MICREAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MICREAR_VALUE = 1;

	/**
	 * The '<em><b>MICLEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MICLEFT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MICLEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MICLEFT_VALUE = 2;

	/**
	 * The '<em><b>MICRIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MICRIGHT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MICRIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MICRIGHT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Acoustic ID</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AcousticID[] VALUES_ARRAY = new AcousticID[] { MICFRONT, MICREAR, MICLEFT, MICRIGHT, };

	/**
	 * A public read-only list of all the '<em><b>Acoustic ID</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AcousticID> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Acoustic ID</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AcousticID get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AcousticID result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Acoustic ID</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AcousticID getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AcousticID result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Acoustic ID</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AcousticID get(int value) {
		switch (value) {
		case MICFRONT_VALUE:
			return MICFRONT;
		case MICREAR_VALUE:
			return MICREAR;
		case MICLEFT_VALUE:
			return MICLEFT;
		case MICRIGHT_VALUE:
			return MICRIGHT;
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
	private AcousticID(int value, String name, String literal) {
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

} //AcousticID
