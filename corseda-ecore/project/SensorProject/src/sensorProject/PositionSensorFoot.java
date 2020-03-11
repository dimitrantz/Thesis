/**
 */
package sensorProject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position Sensor Foot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sensorProject.PositionSensorFoot#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see sensorProject.SensorProjectPackage#getPositionSensorFoot()
 * @model
 * @generated
 */
public interface PositionSensorFoot extends PositionSensor {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link sensorProject.PositionID_Foot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see sensorProject.PositionID_Foot
	 * @see #setType(PositionID_Foot)
	 * @see sensorProject.SensorProjectPackage#getPositionSensorFoot_Type()
	 * @model required="true"
	 * @generated
	 */
	PositionID_Foot getType();

	/**
	 * Sets the value of the '{@link sensorProject.PositionSensorFoot#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see sensorProject.PositionID_Foot
	 * @see #getType()
	 * @generated
	 */
	void setType(PositionID_Foot value);

} // PositionSensorFoot
