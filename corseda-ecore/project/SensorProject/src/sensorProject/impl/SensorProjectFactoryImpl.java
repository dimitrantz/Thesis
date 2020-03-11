/**
 */
package sensorProject.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sensorProject.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SensorProjectFactoryImpl extends EFactoryImpl implements SensorProjectFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SensorProjectFactory init() {
		try {
			SensorProjectFactory theSensorProjectFactory = (SensorProjectFactory) EPackage.Registry.INSTANCE
					.getEFactory(SensorProjectPackage.eNS_URI);
			if (theSensorProjectFactory != null) {
				return theSensorProjectFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SensorProjectFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorProjectFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SensorProjectPackage.DISTANCE_SYSTEM:
			return createDistanceSystem();
		case SensorProjectPackage.ELECTRIC_SYSTEM:
			return createElectricSystem();
		case SensorProjectPackage.VISION_SYSTEM:
			return createVisionSystem();
		case SensorProjectPackage.POSITION_SYSTEM:
			return createPositionSystem();
		case SensorProjectPackage.SPEED_SYSTEM:
			return createSpeedSystem();
		case SensorProjectPackage.PRESSURE_SYSTEM:
			return createPressureSystem();
		case SensorProjectPackage.ACOUSTIC_SYSTEM:
			return createAcousticSystem();
		case SensorProjectPackage.ACOUSTIC_SENSOR:
			return createAcousticSensor();
		case SensorProjectPackage.SUB_SYSTEM:
			return createSubSystem();
		case SensorProjectPackage.SENSOR_SYSTEM:
			return createSensorSystem();
		case SensorProjectPackage.SENSOR:
			return createSensor();
		case SensorProjectPackage.ELECTRIC_SENSOR:
			return createElectricSensor();
		case SensorProjectPackage.DISTANCE_SENSOR:
			return createDistanceSensor();
		case SensorProjectPackage.PRESSURE_SENSOR:
			return createPressureSensor();
		case SensorProjectPackage.POSTURE_SENSOR:
			return createPostureSensor();
		case SensorProjectPackage.TFRAME_SENSOR:
			return createTframeSensor();
		case SensorProjectPackage.POSITION_SENSOR:
			return createPositionSensor();
		case SensorProjectPackage.VISION_SENSOR:
			return createVisionSensor();
		case SensorProjectPackage.SPEED_SENSOR:
			return createSpeedSensor();
		case SensorProjectPackage.PRESSURE_SENSOR_HEAD:
			return createPressureSensorHead();
		case SensorProjectPackage.PRESSURE_SENSOR_HAND:
			return createPressureSensorHand();
		case SensorProjectPackage.PRESSURE_SENSOR_FOOT:
			return createPressureSensorFoot();
		case SensorProjectPackage.POSITION_SENSOR_ROBOT:
			return createPositionSensorRobot();
		case SensorProjectPackage.POSITION_SENSOR_HEAD:
			return createPositionSensorHead();
		case SensorProjectPackage.POSITION_SENSOR_FOOT:
			return createPositionSensorFoot();
		case SensorProjectPackage.POSITION_SENSOR_HAND:
			return createPositionSensorHand();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case SensorProjectPackage.VISION_ID:
			return createVisionIDFromString(eDataType, initialValue);
		case SensorProjectPackage.RESOLUTION_ID:
			return createResolutionIDFromString(eDataType, initialValue);
		case SensorProjectPackage.DISTANCE_ID:
			return createDistanceIDFromString(eDataType, initialValue);
		case SensorProjectPackage.POSITION_ID_ROBOT:
			return createPositionID_RobotFromString(eDataType, initialValue);
		case SensorProjectPackage.CATEGORY:
			return createCategoryFromString(eDataType, initialValue);
		case SensorProjectPackage.ELECTRIC_ID:
			return createElectricIDFromString(eDataType, initialValue);
		case SensorProjectPackage.SPEED_ID:
			return createSpeedIDFromString(eDataType, initialValue);
		case SensorProjectPackage.POSTURE_ID:
			return createPostureIDFromString(eDataType, initialValue);
		case SensorProjectPackage.POSITION_ID_HAND:
			return createPositionID_HandFromString(eDataType, initialValue);
		case SensorProjectPackage.ACOUSTIC_ID:
			return createAcousticIDFromString(eDataType, initialValue);
		case SensorProjectPackage.POSITION_ID_HEAD:
			return createPositionID_HeadFromString(eDataType, initialValue);
		case SensorProjectPackage.POSITION_ID_FOOT:
			return createPositionID_FootFromString(eDataType, initialValue);
		case SensorProjectPackage.TFRAME_ORIGINS:
			return createTframeOriginsFromString(eDataType, initialValue);
		case SensorProjectPackage.TFRAME_TARGETS:
			return createTframeTargetsFromString(eDataType, initialValue);
		case SensorProjectPackage.PRESSURE_ID_HEAD:
			return createPressureID_HeadFromString(eDataType, initialValue);
		case SensorProjectPackage.PRESSURE_ID_HAND:
			return createPressureID_HandFromString(eDataType, initialValue);
		case SensorProjectPackage.PRESSURE_ID_FOOT:
			return createPressureID_FootFromString(eDataType, initialValue);
		case SensorProjectPackage.ACOUSTIC_TIME_ID:
			return createAcousticTimeIDFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case SensorProjectPackage.VISION_ID:
			return convertVisionIDToString(eDataType, instanceValue);
		case SensorProjectPackage.RESOLUTION_ID:
			return convertResolutionIDToString(eDataType, instanceValue);
		case SensorProjectPackage.DISTANCE_ID:
			return convertDistanceIDToString(eDataType, instanceValue);
		case SensorProjectPackage.POSITION_ID_ROBOT:
			return convertPositionID_RobotToString(eDataType, instanceValue);
		case SensorProjectPackage.CATEGORY:
			return convertCategoryToString(eDataType, instanceValue);
		case SensorProjectPackage.ELECTRIC_ID:
			return convertElectricIDToString(eDataType, instanceValue);
		case SensorProjectPackage.SPEED_ID:
			return convertSpeedIDToString(eDataType, instanceValue);
		case SensorProjectPackage.POSTURE_ID:
			return convertPostureIDToString(eDataType, instanceValue);
		case SensorProjectPackage.POSITION_ID_HAND:
			return convertPositionID_HandToString(eDataType, instanceValue);
		case SensorProjectPackage.ACOUSTIC_ID:
			return convertAcousticIDToString(eDataType, instanceValue);
		case SensorProjectPackage.POSITION_ID_HEAD:
			return convertPositionID_HeadToString(eDataType, instanceValue);
		case SensorProjectPackage.POSITION_ID_FOOT:
			return convertPositionID_FootToString(eDataType, instanceValue);
		case SensorProjectPackage.TFRAME_ORIGINS:
			return convertTframeOriginsToString(eDataType, instanceValue);
		case SensorProjectPackage.TFRAME_TARGETS:
			return convertTframeTargetsToString(eDataType, instanceValue);
		case SensorProjectPackage.PRESSURE_ID_HEAD:
			return convertPressureID_HeadToString(eDataType, instanceValue);
		case SensorProjectPackage.PRESSURE_ID_HAND:
			return convertPressureID_HandToString(eDataType, instanceValue);
		case SensorProjectPackage.PRESSURE_ID_FOOT:
			return convertPressureID_FootToString(eDataType, instanceValue);
		case SensorProjectPackage.ACOUSTIC_TIME_ID:
			return convertAcousticTimeIDToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistanceSystem createDistanceSystem() {
		DistanceSystemImpl distanceSystem = new DistanceSystemImpl();
		return distanceSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricSystem createElectricSystem() {
		ElectricSystemImpl electricSystem = new ElectricSystemImpl();
		return electricSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionSystem createVisionSystem() {
		VisionSystemImpl visionSystem = new VisionSystemImpl();
		return visionSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionSystem createPositionSystem() {
		PositionSystemImpl positionSystem = new PositionSystemImpl();
		return positionSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeedSystem createSpeedSystem() {
		SpeedSystemImpl speedSystem = new SpeedSystemImpl();
		return speedSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PressureSystem createPressureSystem() {
		PressureSystemImpl pressureSystem = new PressureSystemImpl();
		return pressureSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcousticSystem createAcousticSystem() {
		AcousticSystemImpl acousticSystem = new AcousticSystemImpl();
		return acousticSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcousticSensor createAcousticSensor() {
		AcousticSensorImpl acousticSensor = new AcousticSensorImpl();
		return acousticSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubSystem createSubSystem() {
		SubSystemImpl subSystem = new SubSystemImpl();
		return subSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorSystem createSensorSystem() {
		SensorSystemImpl sensorSystem = new SensorSystemImpl();
		return sensorSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricSensor createElectricSensor() {
		ElectricSensorImpl electricSensor = new ElectricSensorImpl();
		return electricSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistanceSensor createDistanceSensor() {
		DistanceSensorImpl distanceSensor = new DistanceSensorImpl();
		return distanceSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PressureSensor createPressureSensor() {
		PressureSensorImpl pressureSensor = new PressureSensorImpl();
		return pressureSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostureSensor createPostureSensor() {
		PostureSensorImpl postureSensor = new PostureSensorImpl();
		return postureSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TframeSensor createTframeSensor() {
		TframeSensorImpl tframeSensor = new TframeSensorImpl();
		return tframeSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionSensor createPositionSensor() {
		PositionSensorImpl positionSensor = new PositionSensorImpl();
		return positionSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionSensor createVisionSensor() {
		VisionSensorImpl visionSensor = new VisionSensorImpl();
		return visionSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeedSensor createSpeedSensor() {
		SpeedSensorImpl speedSensor = new SpeedSensorImpl();
		return speedSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PressureSensorHead createPressureSensorHead() {
		PressureSensorHeadImpl pressureSensorHead = new PressureSensorHeadImpl();
		return pressureSensorHead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PressureSensorHand createPressureSensorHand() {
		PressureSensorHandImpl pressureSensorHand = new PressureSensorHandImpl();
		return pressureSensorHand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PressureSensorFoot createPressureSensorFoot() {
		PressureSensorFootImpl pressureSensorFoot = new PressureSensorFootImpl();
		return pressureSensorFoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionSensorRobot createPositionSensorRobot() {
		PositionSensorRobotImpl positionSensorRobot = new PositionSensorRobotImpl();
		return positionSensorRobot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionSensorHead createPositionSensorHead() {
		PositionSensorHeadImpl positionSensorHead = new PositionSensorHeadImpl();
		return positionSensorHead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionSensorFoot createPositionSensorFoot() {
		PositionSensorFootImpl positionSensorFoot = new PositionSensorFootImpl();
		return positionSensorFoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionSensorHand createPositionSensorHand() {
		PositionSensorHandImpl positionSensorHand = new PositionSensorHandImpl();
		return positionSensorHand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionID createVisionIDFromString(EDataType eDataType, String initialValue) {
		VisionID result = VisionID.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisionIDToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolutionID createResolutionIDFromString(EDataType eDataType, String initialValue) {
		ResolutionID result = ResolutionID.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResolutionIDToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistanceID createDistanceIDFromString(EDataType eDataType, String initialValue) {
		DistanceID result = DistanceID.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDistanceIDToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionID_Robot createPositionID_RobotFromString(EDataType eDataType, String initialValue) {
		PositionID_Robot result = PositionID_Robot.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionID_RobotToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategoryFromString(EDataType eDataType, String initialValue) {
		Category result = Category.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricID createElectricIDFromString(EDataType eDataType, String initialValue) {
		ElectricID result = ElectricID.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertElectricIDToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeedID createSpeedIDFromString(EDataType eDataType, String initialValue) {
		SpeedID result = SpeedID.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpeedIDToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostureID createPostureIDFromString(EDataType eDataType, String initialValue) {
		PostureID result = PostureID.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPostureIDToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionID_Hand createPositionID_HandFromString(EDataType eDataType, String initialValue) {
		PositionID_Hand result = PositionID_Hand.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionID_HandToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcousticID createAcousticIDFromString(EDataType eDataType, String initialValue) {
		AcousticID result = AcousticID.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAcousticIDToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionID_Head createPositionID_HeadFromString(EDataType eDataType, String initialValue) {
		PositionID_Head result = PositionID_Head.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionID_HeadToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionID_Foot createPositionID_FootFromString(EDataType eDataType, String initialValue) {
		PositionID_Foot result = PositionID_Foot.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionID_FootToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TframeOrigins createTframeOriginsFromString(EDataType eDataType, String initialValue) {
		TframeOrigins result = TframeOrigins.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTframeOriginsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TframeTargets createTframeTargetsFromString(EDataType eDataType, String initialValue) {
		TframeTargets result = TframeTargets.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTframeTargetsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PressureID_Head createPressureID_HeadFromString(EDataType eDataType, String initialValue) {
		PressureID_Head result = PressureID_Head.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPressureID_HeadToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PressureID_Hand createPressureID_HandFromString(EDataType eDataType, String initialValue) {
		PressureID_Hand result = PressureID_Hand.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPressureID_HandToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PressureID_Foot createPressureID_FootFromString(EDataType eDataType, String initialValue) {
		PressureID_Foot result = PressureID_Foot.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPressureID_FootToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcousticTimeID createAcousticTimeIDFromString(EDataType eDataType, String initialValue) {
		AcousticTimeID result = AcousticTimeID.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAcousticTimeIDToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorProjectPackage getSensorProjectPackage() {
		return (SensorProjectPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SensorProjectPackage getPackage() {
		return SensorProjectPackage.eINSTANCE;
	}

} //SensorProjectFactoryImpl
