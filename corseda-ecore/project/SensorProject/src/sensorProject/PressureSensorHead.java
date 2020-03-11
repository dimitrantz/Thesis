/**
 */
package sensorProject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pressure Sensor Head</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sensorProject.PressureSensorHead#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see sensorProject.SensorProjectPackage#getPressureSensorHead()
 * @model
 * @generated
 */
public interface PressureSensorHead extends PressureSensor {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link sensorProject.PressureID_Head}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see sensorProject.PressureID_Head
	 * @see #setType(PressureID_Head)
	 * @see sensorProject.SensorProjectPackage#getPressureSensorHead_Type()
	 * @model required="true"
	 * @generated
	 */
	PressureID_Head getType();

	/**
	 * Sets the value of the '{@link sensorProject.PressureSensorHead#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see sensorProject.PressureID_Head
	 * @see #getType()
	 * @generated
	 */
	void setType(PressureID_Head value);

} // PressureSensorHead
