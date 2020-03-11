/**
 */
package sensorProject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distance Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sensorProject.DistanceSensor#getMaxDistanceAccepted <em>Max Distance Accepted</em>}</li>
 *   <li>{@link sensorProject.DistanceSensor#getMinDistanceAccepted <em>Min Distance Accepted</em>}</li>
 *   <li>{@link sensorProject.DistanceSensor#getType <em>Type</em>}</li>
 *   <li>{@link sensorProject.DistanceSensor#getAlarmValue <em>Alarm Value</em>}</li>
 *   <li>{@link sensorProject.DistanceSensor#isNotifications <em>Notifications</em>}</li>
 * </ul>
 *
 * @see sensorProject.SensorProjectPackage#getDistanceSensor()
 * @model
 * @generated
 */
public interface DistanceSensor extends Sensor {
	/**
	 * Returns the value of the '<em><b>Max Distance Accepted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Distance Accepted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Distance Accepted</em>' attribute.
	 * @see #setMaxDistanceAccepted(double)
	 * @see sensorProject.SensorProjectPackage#getDistanceSensor_MaxDistanceAccepted()
	 * @model required="true"
	 * @generated
	 */
	double getMaxDistanceAccepted();

	/**
	 * Sets the value of the '{@link sensorProject.DistanceSensor#getMaxDistanceAccepted <em>Max Distance Accepted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Distance Accepted</em>' attribute.
	 * @see #getMaxDistanceAccepted()
	 * @generated
	 */
	void setMaxDistanceAccepted(double value);

	/**
	 * Returns the value of the '<em><b>Min Distance Accepted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Distance Accepted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Distance Accepted</em>' attribute.
	 * @see #setMinDistanceAccepted(double)
	 * @see sensorProject.SensorProjectPackage#getDistanceSensor_MinDistanceAccepted()
	 * @model required="true"
	 * @generated
	 */
	double getMinDistanceAccepted();

	/**
	 * Sets the value of the '{@link sensorProject.DistanceSensor#getMinDistanceAccepted <em>Min Distance Accepted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Distance Accepted</em>' attribute.
	 * @see #getMinDistanceAccepted()
	 * @generated
	 */
	void setMinDistanceAccepted(double value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link sensorProject.DistanceID}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see sensorProject.DistanceID
	 * @see #setType(DistanceID)
	 * @see sensorProject.SensorProjectPackage#getDistanceSensor_Type()
	 * @model required="true"
	 * @generated
	 */
	DistanceID getType();

	/**
	 * Sets the value of the '{@link sensorProject.DistanceSensor#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see sensorProject.DistanceID
	 * @see #getType()
	 * @generated
	 */
	void setType(DistanceID value);

	/**
	 * Returns the value of the '<em><b>Alarm Value</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alarm Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alarm Value</em>' attribute.
	 * @see #setAlarmValue(double)
	 * @see sensorProject.SensorProjectPackage#getDistanceSensor_AlarmValue()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	double getAlarmValue();

	/**
	 * Sets the value of the '{@link sensorProject.DistanceSensor#getAlarmValue <em>Alarm Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alarm Value</em>' attribute.
	 * @see #getAlarmValue()
	 * @generated
	 */
	void setAlarmValue(double value);

	/**
	 * Returns the value of the '<em><b>Notifications</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notifications</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notifications</em>' attribute.
	 * @see #setNotifications(boolean)
	 * @see sensorProject.SensorProjectPackage#getDistanceSensor_Notifications()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isNotifications();

	/**
	 * Sets the value of the '{@link sensorProject.DistanceSensor#isNotifications <em>Notifications</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notifications</em>' attribute.
	 * @see #isNotifications()
	 * @generated
	 */
	void setNotifications(boolean value);

} // DistanceSensor
