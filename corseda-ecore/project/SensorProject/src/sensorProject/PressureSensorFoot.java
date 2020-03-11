/**
 */
package sensorProject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pressure Sensor Foot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sensorProject.PressureSensorFoot#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see sensorProject.SensorProjectPackage#getPressureSensorFoot()
 * @model
 * @generated
 */
public interface PressureSensorFoot extends PressureSensor {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link sensorProject.PressureID_Foot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see sensorProject.PressureID_Foot
	 * @see #setType(PressureID_Foot)
	 * @see sensorProject.SensorProjectPackage#getPressureSensorFoot_Type()
	 * @model required="true"
	 * @generated
	 */
	PressureID_Foot getType();

	/**
	 * Sets the value of the '{@link sensorProject.PressureSensorFoot#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see sensorProject.PressureID_Foot
	 * @see #getType()
	 * @generated
	 */
	void setType(PressureID_Foot value);

} // PressureSensorFoot
