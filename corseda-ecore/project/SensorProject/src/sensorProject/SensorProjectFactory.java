/**
 */
package sensorProject;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see sensorProject.SensorProjectPackage
 * @generated
 */
public interface SensorProjectFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SensorProjectFactory eINSTANCE = sensorProject.impl.SensorProjectFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Distance System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Distance System</em>'.
	 * @generated
	 */
	DistanceSystem createDistanceSystem();

	/**
	 * Returns a new object of class '<em>Electric System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Electric System</em>'.
	 * @generated
	 */
	ElectricSystem createElectricSystem();

	/**
	 * Returns a new object of class '<em>Vision System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vision System</em>'.
	 * @generated
	 */
	VisionSystem createVisionSystem();

	/**
	 * Returns a new object of class '<em>Position System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position System</em>'.
	 * @generated
	 */
	PositionSystem createPositionSystem();

	/**
	 * Returns a new object of class '<em>Speed System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Speed System</em>'.
	 * @generated
	 */
	SpeedSystem createSpeedSystem();

	/**
	 * Returns a new object of class '<em>Pressure System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pressure System</em>'.
	 * @generated
	 */
	PressureSystem createPressureSystem();

	/**
	 * Returns a new object of class '<em>Acoustic System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Acoustic System</em>'.
	 * @generated
	 */
	AcousticSystem createAcousticSystem();

	/**
	 * Returns a new object of class '<em>Acoustic Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Acoustic Sensor</em>'.
	 * @generated
	 */
	AcousticSensor createAcousticSensor();

	/**
	 * Returns a new object of class '<em>Sub System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub System</em>'.
	 * @generated
	 */
	SubSystem createSubSystem();

	/**
	 * Returns a new object of class '<em>Sensor System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor System</em>'.
	 * @generated
	 */
	SensorSystem createSensorSystem();

	/**
	 * Returns a new object of class '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor</em>'.
	 * @generated
	 */
	Sensor createSensor();

	/**
	 * Returns a new object of class '<em>Electric Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Electric Sensor</em>'.
	 * @generated
	 */
	ElectricSensor createElectricSensor();

	/**
	 * Returns a new object of class '<em>Distance Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Distance Sensor</em>'.
	 * @generated
	 */
	DistanceSensor createDistanceSensor();

	/**
	 * Returns a new object of class '<em>Pressure Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pressure Sensor</em>'.
	 * @generated
	 */
	PressureSensor createPressureSensor();

	/**
	 * Returns a new object of class '<em>Posture Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Posture Sensor</em>'.
	 * @generated
	 */
	PostureSensor createPostureSensor();

	/**
	 * Returns a new object of class '<em>Tframe Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tframe Sensor</em>'.
	 * @generated
	 */
	TframeSensor createTframeSensor();

	/**
	 * Returns a new object of class '<em>Position Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position Sensor</em>'.
	 * @generated
	 */
	PositionSensor createPositionSensor();

	/**
	 * Returns a new object of class '<em>Vision Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vision Sensor</em>'.
	 * @generated
	 */
	VisionSensor createVisionSensor();

	/**
	 * Returns a new object of class '<em>Speed Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Speed Sensor</em>'.
	 * @generated
	 */
	SpeedSensor createSpeedSensor();

	/**
	 * Returns a new object of class '<em>Pressure Sensor Head</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pressure Sensor Head</em>'.
	 * @generated
	 */
	PressureSensorHead createPressureSensorHead();

	/**
	 * Returns a new object of class '<em>Pressure Sensor Hand</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pressure Sensor Hand</em>'.
	 * @generated
	 */
	PressureSensorHand createPressureSensorHand();

	/**
	 * Returns a new object of class '<em>Pressure Sensor Foot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pressure Sensor Foot</em>'.
	 * @generated
	 */
	PressureSensorFoot createPressureSensorFoot();

	/**
	 * Returns a new object of class '<em>Position Sensor Robot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position Sensor Robot</em>'.
	 * @generated
	 */
	PositionSensorRobot createPositionSensorRobot();

	/**
	 * Returns a new object of class '<em>Position Sensor Head</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position Sensor Head</em>'.
	 * @generated
	 */
	PositionSensorHead createPositionSensorHead();

	/**
	 * Returns a new object of class '<em>Position Sensor Foot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position Sensor Foot</em>'.
	 * @generated
	 */
	PositionSensorFoot createPositionSensorFoot();

	/**
	 * Returns a new object of class '<em>Position Sensor Hand</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position Sensor Hand</em>'.
	 * @generated
	 */
	PositionSensorHand createPositionSensorHand();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SensorProjectPackage getSensorProjectPackage();

} //SensorProjectFactory
