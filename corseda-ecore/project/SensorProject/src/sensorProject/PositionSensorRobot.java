/**
 */
package sensorProject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position Sensor Robot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sensorProject.PositionSensorRobot#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see sensorProject.SensorProjectPackage#getPositionSensorRobot()
 * @model
 * @generated
 */
public interface PositionSensorRobot extends PositionSensor {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link sensorProject.PositionID_Robot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see sensorProject.PositionID_Robot
	 * @see #setType(PositionID_Robot)
	 * @see sensorProject.SensorProjectPackage#getPositionSensorRobot_Type()
	 * @model required="true"
	 * @generated
	 */
	PositionID_Robot getType();

	/**
	 * Sets the value of the '{@link sensorProject.PositionSensorRobot#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see sensorProject.PositionID_Robot
	 * @see #getType()
	 * @generated
	 */
	void setType(PositionID_Robot value);

} // PositionSensorRobot
