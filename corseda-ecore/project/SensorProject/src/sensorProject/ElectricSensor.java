/**
 */
package sensorProject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Electric Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sensorProject.ElectricSensor#getType <em>Type</em>}</li>
 *   <li>{@link sensorProject.ElectricSensor#getAlarmValue <em>Alarm Value</em>}</li>
 *   <li>{@link sensorProject.ElectricSensor#isNotifications <em>Notifications</em>}</li>
 * </ul>
 *
 * @see sensorProject.SensorProjectPackage#getElectricSensor()
 * @model
 * @generated
 */
public interface ElectricSensor extends Sensor {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link sensorProject.ElectricID}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see sensorProject.ElectricID
	 * @see #setType(ElectricID)
	 * @see sensorProject.SensorProjectPackage#getElectricSensor_Type()
	 * @model required="true"
	 * @generated
	 */
	ElectricID getType();

	/**
	 * Sets the value of the '{@link sensorProject.ElectricSensor#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see sensorProject.ElectricID
	 * @see #getType()
	 * @generated
	 */
	void setType(ElectricID value);

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
	 * @see sensorProject.SensorProjectPackage#getElectricSensor_AlarmValue()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	double getAlarmValue();

	/**
	 * Sets the value of the '{@link sensorProject.ElectricSensor#getAlarmValue <em>Alarm Value</em>}' attribute.
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
	 * @see sensorProject.SensorProjectPackage#getElectricSensor_Notifications()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isNotifications();

	/**
	 * Sets the value of the '{@link sensorProject.ElectricSensor#isNotifications <em>Notifications</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notifications</em>' attribute.
	 * @see #isNotifications()
	 * @generated
	 */
	void setNotifications(boolean value);

} // ElectricSensor
