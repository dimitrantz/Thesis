/**
 */
package sensorProject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Posture Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sensorProject.PostureSensor#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see sensorProject.SensorProjectPackage#getPostureSensor()
 * @model
 * @generated
 */
public interface PostureSensor extends Sensor {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link sensorProject.PostureID}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see sensorProject.PostureID
	 * @see #setType(PostureID)
	 * @see sensorProject.SensorProjectPackage#getPostureSensor_Type()
	 * @model required="true"
	 * @generated
	 */
	PostureID getType();

	/**
	 * Sets the value of the '{@link sensorProject.PostureSensor#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see sensorProject.PostureID
	 * @see #getType()
	 * @generated
	 */
	void setType(PostureID value);

} // PostureSensor
