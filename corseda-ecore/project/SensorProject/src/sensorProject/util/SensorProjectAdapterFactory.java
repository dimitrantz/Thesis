/**
 */
package sensorProject.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import sensorProject.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sensorProject.SensorProjectPackage
 * @generated
 */
public class SensorProjectAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SensorProjectPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorProjectAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SensorProjectPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorProjectSwitch<Adapter> modelSwitch = new SensorProjectSwitch<Adapter>() {
		@Override
		public Adapter caseDistanceSystem(DistanceSystem object) {
			return createDistanceSystemAdapter();
		}

		@Override
		public Adapter caseElectricSystem(ElectricSystem object) {
			return createElectricSystemAdapter();
		}

		@Override
		public Adapter caseVisionSystem(VisionSystem object) {
			return createVisionSystemAdapter();
		}

		@Override
		public Adapter casePositionSystem(PositionSystem object) {
			return createPositionSystemAdapter();
		}

		@Override
		public Adapter caseSpeedSystem(SpeedSystem object) {
			return createSpeedSystemAdapter();
		}

		@Override
		public Adapter casePressureSystem(PressureSystem object) {
			return createPressureSystemAdapter();
		}

		@Override
		public Adapter caseAcousticSystem(AcousticSystem object) {
			return createAcousticSystemAdapter();
		}

		@Override
		public Adapter caseAcousticSensor(AcousticSensor object) {
			return createAcousticSensorAdapter();
		}

		@Override
		public Adapter caseSubSystem(SubSystem object) {
			return createSubSystemAdapter();
		}

		@Override
		public Adapter caseSensorSystem(SensorSystem object) {
			return createSensorSystemAdapter();
		}

		@Override
		public Adapter caseSensor(Sensor object) {
			return createSensorAdapter();
		}

		@Override
		public Adapter caseElectricSensor(ElectricSensor object) {
			return createElectricSensorAdapter();
		}

		@Override
		public Adapter caseDistanceSensor(DistanceSensor object) {
			return createDistanceSensorAdapter();
		}

		@Override
		public Adapter casePressureSensor(PressureSensor object) {
			return createPressureSensorAdapter();
		}

		@Override
		public Adapter casePostureSensor(PostureSensor object) {
			return createPostureSensorAdapter();
		}

		@Override
		public Adapter caseTframeSensor(TframeSensor object) {
			return createTframeSensorAdapter();
		}

		@Override
		public Adapter casePositionSensor(PositionSensor object) {
			return createPositionSensorAdapter();
		}

		@Override
		public Adapter caseVisionSensor(VisionSensor object) {
			return createVisionSensorAdapter();
		}

		@Override
		public Adapter caseSpeedSensor(SpeedSensor object) {
			return createSpeedSensorAdapter();
		}

		@Override
		public Adapter casePressureSensorHead(PressureSensorHead object) {
			return createPressureSensorHeadAdapter();
		}

		@Override
		public Adapter casePressureSensorHand(PressureSensorHand object) {
			return createPressureSensorHandAdapter();
		}

		@Override
		public Adapter casePressureSensorFoot(PressureSensorFoot object) {
			return createPressureSensorFootAdapter();
		}

		@Override
		public Adapter casePositionSensorRobot(PositionSensorRobot object) {
			return createPositionSensorRobotAdapter();
		}

		@Override
		public Adapter casePositionSensorHead(PositionSensorHead object) {
			return createPositionSensorHeadAdapter();
		}

		@Override
		public Adapter casePositionSensorFoot(PositionSensorFoot object) {
			return createPositionSensorFootAdapter();
		}

		@Override
		public Adapter casePositionSensorHand(PositionSensorHand object) {
			return createPositionSensorHandAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link sensorProject.DistanceSystem <em>Distance System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sensorProject.DistanceSystem
	 * @generated
	 */
	public Adapter createDistanceSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sensorProject.ElectricSystem <em>Electric System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sensorProject.ElectricSystem
	 * @generated
	 */
	public Adapter createElectricSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sensorProject.VisionSystem <em>Vision System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sensorProject.VisionSystem
	 * @generated
	 */
	public Adapter createVisionSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sensorProject.PositionSystem <em>Position System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sensorProject.PositionSystem
	 * @generated
	 */
	public Adapter createPositionSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sensorProject.SpeedSystem <em>Speed System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sensorProject.SpeedSystem
	 * @generated
	 */
	public Adapter createSpeedSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sensorProject.PressureSystem <em>Pressure System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sensorProject.PressureSystem
	 * @generated
	 */
	public Adapter createPressureSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sensorProject.AcousticSystem <em>Acoustic System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sensorProject.AcousticSystem
	 * @generated
	 */
	public Adapter createAcousticSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sensorProject.AcousticSensor <em>Acoustic Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sensorProject.AcousticSensor
	 * @generated
	 */
	public Adapter createAcousticSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sensorProject.SubSystem <em>Sub System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sensorProject.SubSystem
	 * @generated
	 */
	public Adapter createSubSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sensorProject.SensorSystem <em>Sensor System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sensorProject.SensorSystem
	 * @generated
	 */
	public Adapter createSensorSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sensorProject.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sensorProject.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sensorProject.ElectricSensor <em>Electric Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sensorProject.ElectricSensor
	 * @generated
	 */
	public Adapter createElectricSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sensorProject.DistanceSensor <em>Distance Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sensorProject.DistanceSensor
	 * @generated
	 */
	public Adapter createDistanceSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sensorProject.PressureSensor <em>Pressure Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sensorProject.PressureSensor
	 * @generated
	 */
	public Adapter createPressureSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sensorProject.PostureSensor <em>Posture Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sensorProject.PostureSensor
	 * @generated
	 */
	public Adapter createPostureSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sensorProject.TframeSensor <em>Tframe Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sensorProject.TframeSensor
	 * @generated
	 */
	public Adapter createTframeSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sensorProject.PositionSensor <em>Position Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sensorProject.PositionSensor
	 * @generated
	 */
	public Adapter createPositionSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sensorProject.VisionSensor <em>Vision Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sensorProject.VisionSensor
	 * @generated
	 */
	public Adapter createVisionSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sensorProject.SpeedSensor <em>Speed Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sensorProject.SpeedSensor
	 * @generated
	 */
	public Adapter createSpeedSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sensorProject.PressureSensorHead <em>Pressure Sensor Head</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sensorProject.PressureSensorHead
	 * @generated
	 */
	public Adapter createPressureSensorHeadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sensorProject.PressureSensorHand <em>Pressure Sensor Hand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sensorProject.PressureSensorHand
	 * @generated
	 */
	public Adapter createPressureSensorHandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sensorProject.PressureSensorFoot <em>Pressure Sensor Foot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sensorProject.PressureSensorFoot
	 * @generated
	 */
	public Adapter createPressureSensorFootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sensorProject.PositionSensorRobot <em>Position Sensor Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sensorProject.PositionSensorRobot
	 * @generated
	 */
	public Adapter createPositionSensorRobotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sensorProject.PositionSensorHead <em>Position Sensor Head</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sensorProject.PositionSensorHead
	 * @generated
	 */
	public Adapter createPositionSensorHeadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sensorProject.PositionSensorFoot <em>Position Sensor Foot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sensorProject.PositionSensorFoot
	 * @generated
	 */
	public Adapter createPositionSensorFootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sensorProject.PositionSensorHand <em>Position Sensor Hand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sensorProject.PositionSensorHand
	 * @generated
	 */
	public Adapter createPositionSensorHandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SensorProjectAdapterFactory
