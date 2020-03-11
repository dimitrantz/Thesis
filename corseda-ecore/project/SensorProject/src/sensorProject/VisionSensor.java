/**
 */
package sensorProject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vision Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sensorProject.VisionSensor#getType <em>Type</em>}</li>
 *   <li>{@link sensorProject.VisionSensor#getResolution <em>Resolution</em>}</li>
 * </ul>
 *
 * @see sensorProject.SensorProjectPackage#getVisionSensor()
 * @model
 * @generated
 */
public interface VisionSensor extends Sensor {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link sensorProject.VisionID}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see sensorProject.VisionID
	 * @see #setType(VisionID)
	 * @see sensorProject.SensorProjectPackage#getVisionSensor_Type()
	 * @model required="true"
	 * @generated
	 */
	VisionID getType();

	/**
	 * Sets the value of the '{@link sensorProject.VisionSensor#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see sensorProject.VisionID
	 * @see #getType()
	 * @generated
	 */
	void setType(VisionID value);

	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' attribute.
	 * The literals are from the enumeration {@link sensorProject.ResolutionID}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolution</em>' attribute.
	 * @see sensorProject.ResolutionID
	 * @see #setResolution(ResolutionID)
	 * @see sensorProject.SensorProjectPackage#getVisionSensor_Resolution()
	 * @model required="true"
	 * @generated
	 */
	ResolutionID getResolution();

	/**
	 * Sets the value of the '{@link sensorProject.VisionSensor#getResolution <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution</em>' attribute.
	 * @see sensorProject.ResolutionID
	 * @see #getResolution()
	 * @generated
	 */
	void setResolution(ResolutionID value);

} // VisionSensor
