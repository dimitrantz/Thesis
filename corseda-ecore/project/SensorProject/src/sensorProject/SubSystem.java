/**
 */
package sensorProject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sensorProject.SubSystem#getCategory <em>Category</em>}</li>
 *   <li>{@link sensorProject.SubSystem#getHasSensor <em>Has Sensor</em>}</li>
 *   <li>{@link sensorProject.SubSystem#getRefresh_rate <em>Refresh rate</em>}</li>
 *   <li>{@link sensorProject.SubSystem#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see sensorProject.SensorProjectPackage#getSubSystem()
 * @model
 * @generated
 */
public interface SubSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link sensorProject.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see sensorProject.Category
	 * @see #setCategory(Category)
	 * @see sensorProject.SensorProjectPackage#getSubSystem_Category()
	 * @model required="true"
	 * @generated
	 */
	Category getCategory();

	/**
	 * Sets the value of the '{@link sensorProject.SubSystem#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see sensorProject.Category
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Category value);

	/**
	 * Returns the value of the '<em><b>Has Sensor</b></em>' containment reference list.
	 * The list contents are of type {@link sensorProject.Sensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Sensor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Sensor</em>' containment reference list.
	 * @see sensorProject.SensorProjectPackage#getSubSystem_HasSensor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Sensor> getHasSensor();

	/**
	 * Returns the value of the '<em><b>Refresh rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refresh rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refresh rate</em>' attribute.
	 * @see #setRefresh_rate(double)
	 * @see sensorProject.SensorProjectPackage#getSubSystem_Refresh_rate()
	 * @model required="true"
	 * @generated
	 */
	double getRefresh_rate();

	/**
	 * Sets the value of the '{@link sensorProject.SubSystem#getRefresh_rate <em>Refresh rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh rate</em>' attribute.
	 * @see #getRefresh_rate()
	 * @generated
	 */
	void setRefresh_rate(double value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see sensorProject.SensorProjectPackage#getSubSystem_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link sensorProject.SubSystem#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // SubSystem
