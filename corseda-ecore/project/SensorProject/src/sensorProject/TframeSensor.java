/**
 */
package sensorProject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tframe Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sensorProject.TframeSensor#getOrigin <em>Origin</em>}</li>
 *   <li>{@link sensorProject.TframeSensor#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see sensorProject.SensorProjectPackage#getTframeSensor()
 * @model
 * @generated
 */
public interface TframeSensor extends PositionSensor {
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' attribute.
	 * The literals are from the enumeration {@link sensorProject.TframeOrigins}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' attribute.
	 * @see sensorProject.TframeOrigins
	 * @see #setOrigin(TframeOrigins)
	 * @see sensorProject.SensorProjectPackage#getTframeSensor_Origin()
	 * @model required="true"
	 * @generated
	 */
	TframeOrigins getOrigin();

	/**
	 * Sets the value of the '{@link sensorProject.TframeSensor#getOrigin <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' attribute.
	 * @see sensorProject.TframeOrigins
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(TframeOrigins value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * The literals are from the enumeration {@link sensorProject.TframeTargets}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see sensorProject.TframeTargets
	 * @see #setTarget(TframeTargets)
	 * @see sensorProject.SensorProjectPackage#getTframeSensor_Target()
	 * @model required="true"
	 * @generated
	 */
	TframeTargets getTarget();

	/**
	 * Sets the value of the '{@link sensorProject.TframeSensor#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see sensorProject.TframeTargets
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TframeTargets value);

} // TframeSensor
