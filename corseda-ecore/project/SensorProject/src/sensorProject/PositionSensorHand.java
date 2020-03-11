/**
 */
package sensorProject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position Sensor Hand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sensorProject.PositionSensorHand#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see sensorProject.SensorProjectPackage#getPositionSensorHand()
 * @model
 * @generated
 */
public interface PositionSensorHand extends PositionSensor {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link sensorProject.PositionID_Hand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see sensorProject.PositionID_Hand
	 * @see #setType(PositionID_Hand)
	 * @see sensorProject.SensorProjectPackage#getPositionSensorHand_Type()
	 * @model required="true"
	 * @generated
	 */
	PositionID_Hand getType();

	/**
	 * Sets the value of the '{@link sensorProject.PositionSensorHand#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see sensorProject.PositionID_Hand
	 * @see #getType()
	 * @generated
	 */
	void setType(PositionID_Hand value);

} // PositionSensorHand
