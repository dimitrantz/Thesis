/**
 */
package sensorProject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Acoustic Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sensorProject.AcousticSensor#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see sensorProject.SensorProjectPackage#getAcousticSensor()
 * @model
 * @generated
 */
public interface AcousticSensor extends Sensor {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link sensorProject.AcousticID}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see sensorProject.AcousticID
	 * @see #setType(AcousticID)
	 * @see sensorProject.SensorProjectPackage#getAcousticSensor_Type()
	 * @model required="true"
	 * @generated
	 */
	AcousticID getType();

	/**
	 * Sets the value of the '{@link sensorProject.AcousticSensor#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see sensorProject.AcousticID
	 * @see #getType()
	 * @generated
	 */
	void setType(AcousticID value);

} // AcousticSensor
