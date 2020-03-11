/**
 */
package sensorProject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Acoustic System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sensorProject.AcousticSystem#getRecordTime <em>Record Time</em>}</li>
 *   <li>{@link sensorProject.AcousticSystem#getTimeFormat <em>Time Format</em>}</li>
 *   <li>{@link sensorProject.AcousticSystem#isMeasureOnce <em>Measure Once</em>}</li>
 * </ul>
 *
 * @see sensorProject.SensorProjectPackage#getAcousticSystem()
 * @model
 * @generated
 */
public interface AcousticSystem extends SubSystem {
	/**
	 * Returns the value of the '<em><b>Record Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record Time</em>' attribute.
	 * @see #setRecordTime(double)
	 * @see sensorProject.SensorProjectPackage#getAcousticSystem_RecordTime()
	 * @model required="true"
	 * @generated
	 */
	double getRecordTime();

	/**
	 * Sets the value of the '{@link sensorProject.AcousticSystem#getRecordTime <em>Record Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record Time</em>' attribute.
	 * @see #getRecordTime()
	 * @generated
	 */
	void setRecordTime(double value);

	/**
	 * Returns the value of the '<em><b>Time Format</b></em>' attribute.
	 * The literals are from the enumeration {@link sensorProject.AcousticTimeID}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Format</em>' attribute.
	 * @see sensorProject.AcousticTimeID
	 * @see #setTimeFormat(AcousticTimeID)
	 * @see sensorProject.SensorProjectPackage#getAcousticSystem_TimeFormat()
	 * @model required="true"
	 * @generated
	 */
	AcousticTimeID getTimeFormat();

	/**
	 * Sets the value of the '{@link sensorProject.AcousticSystem#getTimeFormat <em>Time Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Format</em>' attribute.
	 * @see sensorProject.AcousticTimeID
	 * @see #getTimeFormat()
	 * @generated
	 */
	void setTimeFormat(AcousticTimeID value);

	/**
	 * Returns the value of the '<em><b>Measure Once</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure Once</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Once</em>' attribute.
	 * @see #setMeasureOnce(boolean)
	 * @see sensorProject.SensorProjectPackage#getAcousticSystem_MeasureOnce()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isMeasureOnce();

	/**
	 * Sets the value of the '{@link sensorProject.AcousticSystem#isMeasureOnce <em>Measure Once</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Once</em>' attribute.
	 * @see #isMeasureOnce()
	 * @generated
	 */
	void setMeasureOnce(boolean value);

} // AcousticSystem
