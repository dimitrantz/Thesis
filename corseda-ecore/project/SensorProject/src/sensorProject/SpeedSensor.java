/**
 */
package sensorProject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Speed Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sensorProject.SpeedSensor#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see sensorProject.SensorProjectPackage#getSpeedSensor()
 * @model
 * @generated
 */
public interface SpeedSensor extends Sensor {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link sensorProject.SpeedID}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see sensorProject.SpeedID
	 * @see #setType(SpeedID)
	 * @see sensorProject.SensorProjectPackage#getSpeedSensor_Type()
	 * @model required="true"
	 * @generated
	 */
	SpeedID getType();

	/**
	 * Sets the value of the '{@link sensorProject.SpeedSensor#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see sensorProject.SpeedID
	 * @see #getType()
	 * @generated
	 */
	void setType(SpeedID value);

} // SpeedSensor
