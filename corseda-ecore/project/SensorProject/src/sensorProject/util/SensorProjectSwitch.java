/**
 */
package sensorProject.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import sensorProject.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see sensorProject.SensorProjectPackage
 * @generated
 */
public class SensorProjectSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SensorProjectPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorProjectSwitch() {
		if (modelPackage == null) {
			modelPackage = SensorProjectPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case SensorProjectPackage.DISTANCE_SYSTEM: {
			DistanceSystem distanceSystem = (DistanceSystem) theEObject;
			T result = caseDistanceSystem(distanceSystem);
			if (result == null)
				result = caseSubSystem(distanceSystem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SensorProjectPackage.ELECTRIC_SYSTEM: {
			ElectricSystem electricSystem = (ElectricSystem) theEObject;
			T result = caseElectricSystem(electricSystem);
			if (result == null)
				result = caseSubSystem(electricSystem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SensorProjectPackage.VISION_SYSTEM: {
			VisionSystem visionSystem = (VisionSystem) theEObject;
			T result = caseVisionSystem(visionSystem);
			if (result == null)
				result = caseSubSystem(visionSystem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SensorProjectPackage.POSITION_SYSTEM: {
			PositionSystem positionSystem = (PositionSystem) theEObject;
			T result = casePositionSystem(positionSystem);
			if (result == null)
				result = caseSubSystem(positionSystem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SensorProjectPackage.SPEED_SYSTEM: {
			SpeedSystem speedSystem = (SpeedSystem) theEObject;
			T result = caseSpeedSystem(speedSystem);
			if (result == null)
				result = caseSubSystem(speedSystem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SensorProjectPackage.PRESSURE_SYSTEM: {
			PressureSystem pressureSystem = (PressureSystem) theEObject;
			T result = casePressureSystem(pressureSystem);
			if (result == null)
				result = caseSubSystem(pressureSystem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SensorProjectPackage.ACOUSTIC_SYSTEM: {
			AcousticSystem acousticSystem = (AcousticSystem) theEObject;
			T result = caseAcousticSystem(acousticSystem);
			if (result == null)
				result = caseSubSystem(acousticSystem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SensorProjectPackage.ACOUSTIC_SENSOR: {
			AcousticSensor acousticSensor = (AcousticSensor) theEObject;
			T result = caseAcousticSensor(acousticSensor);
			if (result == null)
				result = caseSensor(acousticSensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SensorProjectPackage.SUB_SYSTEM: {
			SubSystem subSystem = (SubSystem) theEObject;
			T result = caseSubSystem(subSystem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SensorProjectPackage.SENSOR_SYSTEM: {
			SensorSystem sensorSystem = (SensorSystem) theEObject;
			T result = caseSensorSystem(sensorSystem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SensorProjectPackage.SENSOR: {
			Sensor sensor = (Sensor) theEObject;
			T result = caseSensor(sensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SensorProjectPackage.ELECTRIC_SENSOR: {
			ElectricSensor electricSensor = (ElectricSensor) theEObject;
			T result = caseElectricSensor(electricSensor);
			if (result == null)
				result = caseSensor(electricSensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SensorProjectPackage.DISTANCE_SENSOR: {
			DistanceSensor distanceSensor = (DistanceSensor) theEObject;
			T result = caseDistanceSensor(distanceSensor);
			if (result == null)
				result = caseSensor(distanceSensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SensorProjectPackage.PRESSURE_SENSOR: {
			PressureSensor pressureSensor = (PressureSensor) theEObject;
			T result = casePressureSensor(pressureSensor);
			if (result == null)
				result = caseSensor(pressureSensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SensorProjectPackage.POSTURE_SENSOR: {
			PostureSensor postureSensor = (PostureSensor) theEObject;
			T result = casePostureSensor(postureSensor);
			if (result == null)
				result = caseSensor(postureSensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SensorProjectPackage.TFRAME_SENSOR: {
			TframeSensor tframeSensor = (TframeSensor) theEObject;
			T result = caseTframeSensor(tframeSensor);
			if (result == null)
				result = casePositionSensor(tframeSensor);
			if (result == null)
				result = caseSensor(tframeSensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SensorProjectPackage.POSITION_SENSOR: {
			PositionSensor positionSensor = (PositionSensor) theEObject;
			T result = casePositionSensor(positionSensor);
			if (result == null)
				result = caseSensor(positionSensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SensorProjectPackage.VISION_SENSOR: {
			VisionSensor visionSensor = (VisionSensor) theEObject;
			T result = caseVisionSensor(visionSensor);
			if (result == null)
				result = caseSensor(visionSensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SensorProjectPackage.SPEED_SENSOR: {
			SpeedSensor speedSensor = (SpeedSensor) theEObject;
			T result = caseSpeedSensor(speedSensor);
			if (result == null)
				result = caseSensor(speedSensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SensorProjectPackage.PRESSURE_SENSOR_HEAD: {
			PressureSensorHead pressureSensorHead = (PressureSensorHead) theEObject;
			T result = casePressureSensorHead(pressureSensorHead);
			if (result == null)
				result = casePressureSensor(pressureSensorHead);
			if (result == null)
				result = caseSensor(pressureSensorHead);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SensorProjectPackage.PRESSURE_SENSOR_HAND: {
			PressureSensorHand pressureSensorHand = (PressureSensorHand) theEObject;
			T result = casePressureSensorHand(pressureSensorHand);
			if (result == null)
				result = casePressureSensor(pressureSensorHand);
			if (result == null)
				result = caseSensor(pressureSensorHand);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SensorProjectPackage.PRESSURE_SENSOR_FOOT: {
			PressureSensorFoot pressureSensorFoot = (PressureSensorFoot) theEObject;
			T result = casePressureSensorFoot(pressureSensorFoot);
			if (result == null)
				result = casePressureSensor(pressureSensorFoot);
			if (result == null)
				result = caseSensor(pressureSensorFoot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SensorProjectPackage.POSITION_SENSOR_ROBOT: {
			PositionSensorRobot positionSensorRobot = (PositionSensorRobot) theEObject;
			T result = casePositionSensorRobot(positionSensorRobot);
			if (result == null)
				result = casePositionSensor(positionSensorRobot);
			if (result == null)
				result = caseSensor(positionSensorRobot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SensorProjectPackage.POSITION_SENSOR_HEAD: {
			PositionSensorHead positionSensorHead = (PositionSensorHead) theEObject;
			T result = casePositionSensorHead(positionSensorHead);
			if (result == null)
				result = casePositionSensor(positionSensorHead);
			if (result == null)
				result = caseSensor(positionSensorHead);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SensorProjectPackage.POSITION_SENSOR_FOOT: {
			PositionSensorFoot positionSensorFoot = (PositionSensorFoot) theEObject;
			T result = casePositionSensorFoot(positionSensorFoot);
			if (result == null)
				result = casePositionSensor(positionSensorFoot);
			if (result == null)
				result = caseSensor(positionSensorFoot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SensorProjectPackage.POSITION_SENSOR_HAND: {
			PositionSensorHand positionSensorHand = (PositionSensorHand) theEObject;
			T result = casePositionSensorHand(positionSensorHand);
			if (result == null)
				result = casePositionSensor(positionSensorHand);
			if (result == null)
				result = caseSensor(positionSensorHand);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distance System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distance System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistanceSystem(DistanceSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Electric System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Electric System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElectricSystem(ElectricSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vision System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vision System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisionSystem(VisionSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositionSystem(PositionSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Speed System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Speed System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpeedSystem(SpeedSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pressure System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pressure System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePressureSystem(PressureSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Acoustic System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Acoustic System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcousticSystem(AcousticSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Acoustic Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Acoustic Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcousticSensor(AcousticSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubSystem(SubSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensorSystem(SensorSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Electric Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Electric Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElectricSensor(ElectricSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distance Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distance Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistanceSensor(DistanceSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pressure Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pressure Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePressureSensor(PressureSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Posture Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Posture Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostureSensor(PostureSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tframe Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tframe Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTframeSensor(TframeSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositionSensor(PositionSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vision Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vision Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisionSensor(VisionSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Speed Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Speed Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpeedSensor(SpeedSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pressure Sensor Head</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pressure Sensor Head</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePressureSensorHead(PressureSensorHead object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pressure Sensor Hand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pressure Sensor Hand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePressureSensorHand(PressureSensorHand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pressure Sensor Foot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pressure Sensor Foot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePressureSensorFoot(PressureSensorFoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position Sensor Robot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position Sensor Robot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositionSensorRobot(PositionSensorRobot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position Sensor Head</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position Sensor Head</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositionSensorHead(PositionSensorHead object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position Sensor Foot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position Sensor Foot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositionSensorFoot(PositionSensorFoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position Sensor Hand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position Sensor Hand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositionSensorHand(PositionSensorHand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SensorProjectSwitch
