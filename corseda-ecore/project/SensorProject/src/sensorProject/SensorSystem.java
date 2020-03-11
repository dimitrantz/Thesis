/**
 */
package sensorProject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sensorProject.SensorSystem#getName <em>Name</em>}</li>
 *   <li>{@link sensorProject.SensorSystem#getDuration <em>Duration</em>}</li>
 *   <li>{@link sensorProject.SensorSystem#getHasSubsystem <em>Has Subsystem</em>}</li>
 *   <li>{@link sensorProject.SensorSystem#getTimeFormat <em>Time Format</em>}</li>
 * </ul>
 *
 * @see sensorProject.SensorProjectPackage#getSensorSystem()
 * @model
 * @generated
 */
public interface SensorSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sensorProject.SensorProjectPackage#getSensorSystem_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sensorProject.SensorSystem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(double)
	 * @see sensorProject.SensorProjectPackage#getSensorSystem_Duration()
	 * @model required="true"
	 * @generated
	 */
	double getDuration();

	/**
	 * Sets the value of the '{@link sensorProject.SensorSystem#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(double value);

	/**
	 * Returns the value of the '<em><b>Has Subsystem</b></em>' containment reference list.
	 * The list contents are of type {@link sensorProject.SubSystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Subsystem</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Subsystem</em>' containment reference list.
	 * @see sensorProject.SensorProjectPackage#getSensorSystem_HasSubsystem()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SubSystem> getHasSubsystem();

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
	 * @see sensorProject.SensorProjectPackage#getSensorSystem_TimeFormat()
	 * @model required="true"
	 * @generated
	 */
	AcousticTimeID getTimeFormat();

	/**
	 * Sets the value of the '{@link sensorProject.SensorSystem#getTimeFormat <em>Time Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Format</em>' attribute.
	 * @see sensorProject.AcousticTimeID
	 * @see #getTimeFormat()
	 * @generated
	 */
	void setTimeFormat(AcousticTimeID value);

} // SensorSystem
