/**
 */
package sensorProject;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see sensorProject.SensorProjectPackage#getCategory()
 * @model
 * @generated
 */
public enum Category implements Enumerator {
	/**
	 * The '<em><b>DISTANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	DISTANCE(0, "DISTANCE", "DISTANCE"),

	/**
	 * The '<em><b>ACOUSTIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACOUSTIC_VALUE
	 * @generated
	 * @ordered
	 */
	ACOUSTIC(1, "ACOUSTIC", "ACOUSTIC"),

	/**
	 * The '<em><b>SPEED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPEED_VALUE
	 * @generated
	 * @ordered
	 */
	SPEED(2, "SPEED", "SPEED"),

	/**
	 * The '<em><b>PRESSURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESSURE_VALUE
	 * @generated
	 * @ordered
	 */
	PRESSURE(3, "PRESSURE", "PRESSURE"),

	/**
	 * The '<em><b>POSITION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSITION_VALUE
	 * @generated
	 * @ordered
	 */
	POSITION(4, "POSITION", "POSITION"),

	/**
	 * The '<em><b>ELECTRIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTRIC_VALUE
	 * @generated
	 * @ordered
	 */
	ELECTRIC(6, "ELECTRIC", "ELECTRIC"),

	/**
	 * The '<em><b>VISION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VISION_VALUE
	 * @generated
	 * @ordered
	 */
	VISION(7, "VISION", "VISION");

	/**
	 * The '<em><b>DISTANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DISTANCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISTANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DISTANCE_VALUE = 0;

	/**
	 * The '<em><b>ACOUSTIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ACOUSTIC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACOUSTIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACOUSTIC_VALUE = 1;

	/**
	 * The '<em><b>SPEED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPEED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPEED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPEED_VALUE = 2;

	/**
	 * The '<em><b>PRESSURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRESSURE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRESSURE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRESSURE_VALUE = 3;

	/**
	 * The '<em><b>POSITION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POSITION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POSITION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POSITION_VALUE = 4;

	/**
	 * The '<em><b>ELECTRIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ELECTRIC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELECTRIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRIC_VALUE = 6;

	/**
	 * The '<em><b>VISION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VISION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VISION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VISION_VALUE = 7;

	/**
	 * An array of all the '<em><b>Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Category[] VALUES_ARRAY = new Category[] { DISTANCE, ACOUSTIC, SPEED, PRESSURE, POSITION,
			ELECTRIC, VISION, };

	/**
	 * A public read-only list of all the '<em><b>Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Category> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Category</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Category get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Category result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Category</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Category getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Category result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Category</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Category get(int value) {
		switch (value) {
		case DISTANCE_VALUE:
			return DISTANCE;
		case ACOUSTIC_VALUE:
			return ACOUSTIC;
		case SPEED_VALUE:
			return SPEED;
		case PRESSURE_VALUE:
			return PRESSURE;
		case POSITION_VALUE:
			return POSITION;
		case ELECTRIC_VALUE:
			return ELECTRIC;
		case VISION_VALUE:
			return VISION;
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
	private Category(int value, String name, String literal) {
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

} //Category
