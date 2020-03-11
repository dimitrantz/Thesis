/**
 */
package sensorProject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position Sensor Head</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sensorProject.PositionSensorHead#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see sensorProject.SensorProjectPackage#getPositionSensorHead()
 * @model
 * @generated
 */
public interface PositionSensorHead extends PositionSensor {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link sensorProject.PositionID_Head}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see sensorProject.PositionID_Head
	 * @see #setType(PositionID_Head)
	 * @see sensorProject.SensorProjectPackage#getPositionSensorHead_Type()
	 * @model required="true"
	 * @generated
	 */
	PositionID_Head getType();

	/**
	 * Sets the value of the '{@link sensorProject.PositionSensorHead#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see sensorProject.PositionID_Head
	 * @see #getType()
	 * @generated
	 */
	void setType(PositionID_Head value);

} // PositionSensorHead
