/**
 */
package sensorProject.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import sensorProject.AcousticID;
import sensorProject.AcousticSensor;
import sensorProject.AcousticSystem;
import sensorProject.AcousticTimeID;
import sensorProject.Category;
import sensorProject.DistanceID;
import sensorProject.DistanceSensor;
import sensorProject.DistanceSystem;
import sensorProject.ElectricID;
import sensorProject.ElectricSensor;
import sensorProject.ElectricSystem;
import sensorProject.PositionID_Foot;
import sensorProject.PositionID_Hand;
import sensorProject.PositionID_Head;
import sensorProject.PositionID_Robot;
import sensorProject.PositionSensor;
import sensorProject.PositionSensorFoot;
import sensorProject.PositionSensorHand;
import sensorProject.PositionSensorHead;
import sensorProject.PositionSensorRobot;
import sensorProject.PositionSystem;
import sensorProject.PostureID;
import sensorProject.PostureSensor;
import sensorProject.PressureID_Foot;
import sensorProject.PressureID_Hand;
import sensorProject.PressureID_Head;
import sensorProject.PressureSensor;
import sensorProject.PressureSensorFoot;
import sensorProject.PressureSensorHand;
import sensorProject.PressureSensorHead;
import sensorProject.PressureSystem;
import sensorProject.ResolutionID;
import sensorProject.Sensor;
import sensorProject.SensorProjectFactory;
import sensorProject.SensorProjectPackage;
import sensorProject.SensorSystem;
import sensorProject.SpeedID;
import sensorProject.SpeedSensor;
import sensorProject.SpeedSystem;
import sensorProject.SubSystem;
import sensorProject.TframeOrigins;
import sensorProject.TframeSensor;
import sensorProject.TframeTargets;
import sensorProject.VisionID;
import sensorProject.VisionSensor;
import sensorProject.VisionSystem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SensorProjectPackageImpl extends EPackageImpl implements SensorProjectPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distanceSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass electricSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visionSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speedSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pressureSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acousticSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acousticSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass electricSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distanceSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pressureSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postureSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tframeSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visionSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speedSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pressureSensorHeadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pressureSensorHandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pressureSensorFootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionSensorRobotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionSensorHeadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionSensorFootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionSensorHandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visionIDEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resolutionIDEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum distanceIDEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum positionID_RobotEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum categoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum electricIDEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum speedIDEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum postureIDEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum positionID_HandEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum acousticIDEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum positionID_HeadEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum positionID_FootEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tframeOriginsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tframeTargetsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pressureID_HeadEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pressureID_HandEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pressureID_FootEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum acousticTimeIDEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see sensorProject.SensorProjectPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SensorProjectPackageImpl() {
		super(eNS_URI, SensorProjectFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SensorProjectPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SensorProjectPackage init() {
		if (isInited)
			return (SensorProjectPackage) EPackage.Registry.INSTANCE.getEPackage(SensorProjectPackage.eNS_URI);

		// Obtain or create and register package
		SensorProjectPackageImpl theSensorProjectPackage = (SensorProjectPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof SensorProjectPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new SensorProjectPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSensorProjectPackage.createPackageContents();

		// Initialize created meta-data
		theSensorProjectPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSensorProjectPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SensorProjectPackage.eNS_URI, theSensorProjectPackage);
		return theSensorProjectPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistanceSystem() {
		return distanceSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElectricSystem() {
		return electricSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisionSystem() {
		return visionSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositionSystem() {
		return positionSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpeedSystem() {
		return speedSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPressureSystem() {
		return pressureSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcousticSystem() {
		return acousticSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAcousticSystem_RecordTime() {
		return (EAttribute) acousticSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAcousticSystem_TimeFormat() {
		return (EAttribute) acousticSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAcousticSystem_MeasureOnce() {
		return (EAttribute) acousticSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcousticSensor() {
		return acousticSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAcousticSensor_Type() {
		return (EAttribute) acousticSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubSystem() {
		return subSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubSystem_Category() {
		return (EAttribute) subSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubSystem_HasSensor() {
		return (EReference) subSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubSystem_Refresh_rate() {
		return (EAttribute) subSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubSystem_Description() {
		return (EAttribute) subSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensorSystem() {
		return sensorSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensorSystem_Name() {
		return (EAttribute) sensorSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensorSystem_Duration() {
		return (EAttribute) sensorSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensorSystem_HasSubsystem() {
		return (EReference) sensorSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensorSystem_TimeFormat() {
		return (EAttribute) sensorSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensor_Name() {
		return (EAttribute) sensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElectricSensor() {
		return electricSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricSensor_Type() {
		return (EAttribute) electricSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricSensor_AlarmValue() {
		return (EAttribute) electricSensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricSensor_Notifications() {
		return (EAttribute) electricSensorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistanceSensor() {
		return distanceSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistanceSensor_MaxDistanceAccepted() {
		return (EAttribute) distanceSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistanceSensor_MinDistanceAccepted() {
		return (EAttribute) distanceSensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistanceSensor_Type() {
		return (EAttribute) distanceSensorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistanceSensor_AlarmValue() {
		return (EAttribute) distanceSensorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistanceSensor_Notifications() {
		return (EAttribute) distanceSensorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPressureSensor() {
		return pressureSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostureSensor() {
		return postureSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostureSensor_Type() {
		return (EAttribute) postureSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTframeSensor() {
		return tframeSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTframeSensor_Origin() {
		return (EAttribute) tframeSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTframeSensor_Target() {
		return (EAttribute) tframeSensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositionSensor() {
		return positionSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisionSensor() {
		return visionSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisionSensor_Type() {
		return (EAttribute) visionSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisionSensor_Resolution() {
		return (EAttribute) visionSensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpeedSensor() {
		return speedSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeedSensor_Type() {
		return (EAttribute) speedSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPressureSensorHead() {
		return pressureSensorHeadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPressureSensorHead_Type() {
		return (EAttribute) pressureSensorHeadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPressureSensorHand() {
		return pressureSensorHandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPressureSensorHand_Type() {
		return (EAttribute) pressureSensorHandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPressureSensorFoot() {
		return pressureSensorFootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPressureSensorFoot_Type() {
		return (EAttribute) pressureSensorFootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositionSensorRobot() {
		return positionSensorRobotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionSensorRobot_Type() {
		return (EAttribute) positionSensorRobotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositionSensorHead() {
		return positionSensorHeadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionSensorHead_Type() {
		return (EAttribute) positionSensorHeadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositionSensorFoot() {
		return positionSensorFootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionSensorFoot_Type() {
		return (EAttribute) positionSensorFootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositionSensorHand() {
		return positionSensorHandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionSensorHand_Type() {
		return (EAttribute) positionSensorHandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisionID() {
		return visionIDEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResolutionID() {
		return resolutionIDEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDistanceID() {
		return distanceIDEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPositionID_Robot() {
		return positionID_RobotEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCategory() {
		return categoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getElectricID() {
		return electricIDEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSpeedID() {
		return speedIDEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPostureID() {
		return postureIDEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPositionID_Hand() {
		return positionID_HandEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAcousticID() {
		return acousticIDEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPositionID_Head() {
		return positionID_HeadEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPositionID_Foot() {
		return positionID_FootEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTframeOrigins() {
		return tframeOriginsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTframeTargets() {
		return tframeTargetsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPressureID_Head() {
		return pressureID_HeadEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPressureID_Hand() {
		return pressureID_HandEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPressureID_Foot() {
		return pressureID_FootEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAcousticTimeID() {
		return acousticTimeIDEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorProjectFactory getSensorProjectFactory() {
		return (SensorProjectFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		distanceSystemEClass = createEClass(DISTANCE_SYSTEM);

		electricSystemEClass = createEClass(ELECTRIC_SYSTEM);

		visionSystemEClass = createEClass(VISION_SYSTEM);

		positionSystemEClass = createEClass(POSITION_SYSTEM);

		speedSystemEClass = createEClass(SPEED_SYSTEM);

		pressureSystemEClass = createEClass(PRESSURE_SYSTEM);

		acousticSystemEClass = createEClass(ACOUSTIC_SYSTEM);
		createEAttribute(acousticSystemEClass, ACOUSTIC_SYSTEM__RECORD_TIME);
		createEAttribute(acousticSystemEClass, ACOUSTIC_SYSTEM__TIME_FORMAT);
		createEAttribute(acousticSystemEClass, ACOUSTIC_SYSTEM__MEASURE_ONCE);

		acousticSensorEClass = createEClass(ACOUSTIC_SENSOR);
		createEAttribute(acousticSensorEClass, ACOUSTIC_SENSOR__TYPE);

		subSystemEClass = createEClass(SUB_SYSTEM);
		createEAttribute(subSystemEClass, SUB_SYSTEM__CATEGORY);
		createEReference(subSystemEClass, SUB_SYSTEM__HAS_SENSOR);
		createEAttribute(subSystemEClass, SUB_SYSTEM__REFRESH_RATE);
		createEAttribute(subSystemEClass, SUB_SYSTEM__DESCRIPTION);

		sensorSystemEClass = createEClass(SENSOR_SYSTEM);
		createEAttribute(sensorSystemEClass, SENSOR_SYSTEM__NAME);
		createEAttribute(sensorSystemEClass, SENSOR_SYSTEM__DURATION);
		createEReference(sensorSystemEClass, SENSOR_SYSTEM__HAS_SUBSYSTEM);
		createEAttribute(sensorSystemEClass, SENSOR_SYSTEM__TIME_FORMAT);

		sensorEClass = createEClass(SENSOR);
		createEAttribute(sensorEClass, SENSOR__NAME);

		electricSensorEClass = createEClass(ELECTRIC_SENSOR);
		createEAttribute(electricSensorEClass, ELECTRIC_SENSOR__TYPE);
		createEAttribute(electricSensorEClass, ELECTRIC_SENSOR__ALARM_VALUE);
		createEAttribute(electricSensorEClass, ELECTRIC_SENSOR__NOTIFICATIONS);

		distanceSensorEClass = createEClass(DISTANCE_SENSOR);
		createEAttribute(distanceSensorEClass, DISTANCE_SENSOR__MAX_DISTANCE_ACCEPTED);
		createEAttribute(distanceSensorEClass, DISTANCE_SENSOR__MIN_DISTANCE_ACCEPTED);
		createEAttribute(distanceSensorEClass, DISTANCE_SENSOR__TYPE);
		createEAttribute(distanceSensorEClass, DISTANCE_SENSOR__ALARM_VALUE);
		createEAttribute(distanceSensorEClass, DISTANCE_SENSOR__NOTIFICATIONS);

		pressureSensorEClass = createEClass(PRESSURE_SENSOR);

		postureSensorEClass = createEClass(POSTURE_SENSOR);
		createEAttribute(postureSensorEClass, POSTURE_SENSOR__TYPE);

		tframeSensorEClass = createEClass(TFRAME_SENSOR);
		createEAttribute(tframeSensorEClass, TFRAME_SENSOR__ORIGIN);
		createEAttribute(tframeSensorEClass, TFRAME_SENSOR__TARGET);

		positionSensorEClass = createEClass(POSITION_SENSOR);

		visionSensorEClass = createEClass(VISION_SENSOR);
		createEAttribute(visionSensorEClass, VISION_SENSOR__TYPE);
		createEAttribute(visionSensorEClass, VISION_SENSOR__RESOLUTION);

		speedSensorEClass = createEClass(SPEED_SENSOR);
		createEAttribute(speedSensorEClass, SPEED_SENSOR__TYPE);

		pressureSensorHeadEClass = createEClass(PRESSURE_SENSOR_HEAD);
		createEAttribute(pressureSensorHeadEClass, PRESSURE_SENSOR_HEAD__TYPE);

		pressureSensorHandEClass = createEClass(PRESSURE_SENSOR_HAND);
		createEAttribute(pressureSensorHandEClass, PRESSURE_SENSOR_HAND__TYPE);

		pressureSensorFootEClass = createEClass(PRESSURE_SENSOR_FOOT);
		createEAttribute(pressureSensorFootEClass, PRESSURE_SENSOR_FOOT__TYPE);

		positionSensorRobotEClass = createEClass(POSITION_SENSOR_ROBOT);
		createEAttribute(positionSensorRobotEClass, POSITION_SENSOR_ROBOT__TYPE);

		positionSensorHeadEClass = createEClass(POSITION_SENSOR_HEAD);
		createEAttribute(positionSensorHeadEClass, POSITION_SENSOR_HEAD__TYPE);

		positionSensorFootEClass = createEClass(POSITION_SENSOR_FOOT);
		createEAttribute(positionSensorFootEClass, POSITION_SENSOR_FOOT__TYPE);

		positionSensorHandEClass = createEClass(POSITION_SENSOR_HAND);
		createEAttribute(positionSensorHandEClass, POSITION_SENSOR_HAND__TYPE);

		// Create enums
		visionIDEEnum = createEEnum(VISION_ID);
		resolutionIDEEnum = createEEnum(RESOLUTION_ID);
		distanceIDEEnum = createEEnum(DISTANCE_ID);
		positionID_RobotEEnum = createEEnum(POSITION_ID_ROBOT);
		categoryEEnum = createEEnum(CATEGORY);
		electricIDEEnum = createEEnum(ELECTRIC_ID);
		speedIDEEnum = createEEnum(SPEED_ID);
		postureIDEEnum = createEEnum(POSTURE_ID);
		positionID_HandEEnum = createEEnum(POSITION_ID_HAND);
		acousticIDEEnum = createEEnum(ACOUSTIC_ID);
		positionID_HeadEEnum = createEEnum(POSITION_ID_HEAD);
		positionID_FootEEnum = createEEnum(POSITION_ID_FOOT);
		tframeOriginsEEnum = createEEnum(TFRAME_ORIGINS);
		tframeTargetsEEnum = createEEnum(TFRAME_TARGETS);
		pressureID_HeadEEnum = createEEnum(PRESSURE_ID_HEAD);
		pressureID_HandEEnum = createEEnum(PRESSURE_ID_HAND);
		pressureID_FootEEnum = createEEnum(PRESSURE_ID_FOOT);
		acousticTimeIDEEnum = createEEnum(ACOUSTIC_TIME_ID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		distanceSystemEClass.getESuperTypes().add(this.getSubSystem());
		electricSystemEClass.getESuperTypes().add(this.getSubSystem());
		visionSystemEClass.getESuperTypes().add(this.getSubSystem());
		positionSystemEClass.getESuperTypes().add(this.getSubSystem());
		speedSystemEClass.getESuperTypes().add(this.getSubSystem());
		pressureSystemEClass.getESuperTypes().add(this.getSubSystem());
		acousticSystemEClass.getESuperTypes().add(this.getSubSystem());
		acousticSensorEClass.getESuperTypes().add(this.getSensor());
		electricSensorEClass.getESuperTypes().add(this.getSensor());
		distanceSensorEClass.getESuperTypes().add(this.getSensor());
		pressureSensorEClass.getESuperTypes().add(this.getSensor());
		postureSensorEClass.getESuperTypes().add(this.getSensor());
		tframeSensorEClass.getESuperTypes().add(this.getPositionSensor());
		positionSensorEClass.getESuperTypes().add(this.getSensor());
		visionSensorEClass.getESuperTypes().add(this.getSensor());
		speedSensorEClass.getESuperTypes().add(this.getSensor());
		pressureSensorHeadEClass.getESuperTypes().add(this.getPressureSensor());
		pressureSensorHandEClass.getESuperTypes().add(this.getPressureSensor());
		pressureSensorFootEClass.getESuperTypes().add(this.getPressureSensor());
		positionSensorRobotEClass.getESuperTypes().add(this.getPositionSensor());
		positionSensorHeadEClass.getESuperTypes().add(this.getPositionSensor());
		positionSensorFootEClass.getESuperTypes().add(this.getPositionSensor());
		positionSensorHandEClass.getESuperTypes().add(this.getPositionSensor());

		// Initialize classes, features, and operations; add parameters
		initEClass(distanceSystemEClass, DistanceSystem.class, "DistanceSystem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(electricSystemEClass, ElectricSystem.class, "ElectricSystem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(visionSystemEClass, VisionSystem.class, "VisionSystem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(positionSystemEClass, PositionSystem.class, "PositionSystem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(speedSystemEClass, SpeedSystem.class, "SpeedSystem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(pressureSystemEClass, PressureSystem.class, "PressureSystem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(acousticSystemEClass, AcousticSystem.class, "AcousticSystem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAcousticSystem_RecordTime(), ecorePackage.getEDouble(), "recordTime", null, 1, 1,
				AcousticSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcousticSystem_TimeFormat(), this.getAcousticTimeID(), "timeFormat", null, 1, 1,
				AcousticSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcousticSystem_MeasureOnce(), ecorePackage.getEBoolean(), "measureOnce", "true", 1, 1,
				AcousticSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(acousticSensorEClass, AcousticSensor.class, "AcousticSensor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAcousticSensor_Type(), this.getAcousticID(), "type", null, 1, 1, AcousticSensor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subSystemEClass, SubSystem.class, "SubSystem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubSystem_Category(), this.getCategory(), "category", null, 1, 1, SubSystem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubSystem_HasSensor(), this.getSensor(), null, "hasSensor", null, 1, -1, SubSystem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubSystem_Refresh_rate(), ecorePackage.getEDouble(), "refresh_rate", null, 1, 1,
				SubSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubSystem_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				SubSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(sensorSystemEClass, SensorSystem.class, "SensorSystem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensorSystem_Name(), ecorePackage.getEString(), "name", null, 1, 1, SensorSystem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorSystem_Duration(), ecorePackage.getEDouble(), "duration", null, 1, 1,
				SensorSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getSensorSystem_HasSubsystem(), this.getSubSystem(), null, "hasSubsystem", null, 1, -1,
				SensorSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorSystem_TimeFormat(), this.getAcousticTimeID(), "timeFormat", null, 1, 1,
				SensorSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensor_Name(), ecorePackage.getEString(), "name", null, 1, 1, Sensor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(electricSensorEClass, ElectricSensor.class, "ElectricSensor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElectricSensor_Type(), this.getElectricID(), "type", null, 1, 1, ElectricSensor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElectricSensor_AlarmValue(), ecorePackage.getEDouble(), "alarmValue", "0.0", 1, 1,
				ElectricSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getElectricSensor_Notifications(), ecorePackage.getEBoolean(), "notifications", "false", 1, 1,
				ElectricSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(distanceSensorEClass, DistanceSensor.class, "DistanceSensor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDistanceSensor_MaxDistanceAccepted(), ecorePackage.getEDouble(), "maxDistanceAccepted", null,
				1, 1, DistanceSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistanceSensor_MinDistanceAccepted(), ecorePackage.getEDouble(), "minDistanceAccepted", null,
				1, 1, DistanceSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistanceSensor_Type(), this.getDistanceID(), "type", null, 1, 1, DistanceSensor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistanceSensor_AlarmValue(), ecorePackage.getEDouble(), "alarmValue", "0.0", 1, 1,
				DistanceSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistanceSensor_Notifications(), ecorePackage.getEBoolean(), "notifications", "false", 1, 1,
				DistanceSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(pressureSensorEClass, PressureSensor.class, "PressureSensor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(postureSensorEClass, PostureSensor.class, "PostureSensor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPostureSensor_Type(), this.getPostureID(), "type", null, 1, 1, PostureSensor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tframeSensorEClass, TframeSensor.class, "TframeSensor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTframeSensor_Origin(), this.getTframeOrigins(), "origin", null, 1, 1, TframeSensor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTframeSensor_Target(), this.getTframeTargets(), "target", null, 1, 1, TframeSensor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionSensorEClass, PositionSensor.class, "PositionSensor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(visionSensorEClass, VisionSensor.class, "VisionSensor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVisionSensor_Type(), this.getVisionID(), "type", null, 1, 1, VisionSensor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVisionSensor_Resolution(), this.getResolutionID(), "resolution", null, 1, 1,
				VisionSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(speedSensorEClass, SpeedSensor.class, "SpeedSensor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpeedSensor_Type(), this.getSpeedID(), "type", null, 1, 1, SpeedSensor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pressureSensorHeadEClass, PressureSensorHead.class, "PressureSensorHead", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPressureSensorHead_Type(), this.getPressureID_Head(), "type", null, 1, 1,
				PressureSensorHead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(pressureSensorHandEClass, PressureSensorHand.class, "PressureSensorHand", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPressureSensorHand_Type(), this.getPressureID_Hand(), "type", null, 1, 1,
				PressureSensorHand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(pressureSensorFootEClass, PressureSensorFoot.class, "PressureSensorFoot", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPressureSensorFoot_Type(), this.getPressureID_Foot(), "type", null, 1, 1,
				PressureSensorFoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(positionSensorRobotEClass, PositionSensorRobot.class, "PositionSensorRobot", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPositionSensorRobot_Type(), this.getPositionID_Robot(), "type", null, 1, 1,
				PositionSensorRobot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionSensorHeadEClass, PositionSensorHead.class, "PositionSensorHead", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPositionSensorHead_Type(), this.getPositionID_Head(), "type", null, 1, 1,
				PositionSensorHead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(positionSensorFootEClass, PositionSensorFoot.class, "PositionSensorFoot", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPositionSensorFoot_Type(), this.getPositionID_Foot(), "type", null, 1, 1,
				PositionSensorFoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(positionSensorHandEClass, PositionSensorHand.class, "PositionSensorHand", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPositionSensorHand_Type(), this.getPositionID_Hand(), "type", null, 1, 1,
				PositionSensorHand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(visionIDEEnum, VisionID.class, "VisionID");
		addEEnumLiteral(visionIDEEnum, VisionID.TOP);
		addEEnumLiteral(visionIDEEnum, VisionID.BOTTOM);

		initEEnum(resolutionIDEEnum, ResolutionID.class, "ResolutionID");
		addEEnumLiteral(resolutionIDEEnum, ResolutionID.PX4_0X30);
		addEEnumLiteral(resolutionIDEEnum, ResolutionID.PX8_0X60);
		addEEnumLiteral(resolutionIDEEnum, ResolutionID.PX16_0X120);
		addEEnumLiteral(resolutionIDEEnum, ResolutionID.PX32_0X240);
		addEEnumLiteral(resolutionIDEEnum, ResolutionID.PX64_0X480);
		addEEnumLiteral(resolutionIDEEnum, ResolutionID.PX128_0X960);

		initEEnum(distanceIDEEnum, DistanceID.class, "DistanceID");
		addEEnumLiteral(distanceIDEEnum, DistanceID.RIGHT);
		addEEnumLiteral(distanceIDEEnum, DistanceID.LEFT);

		initEEnum(positionID_RobotEEnum, PositionID_Robot.class, "PositionID_Robot");
		addEEnumLiteral(positionID_RobotEEnum, PositionID_Robot.LOCALIZATION);

		initEEnum(categoryEEnum, Category.class, "Category");
		addEEnumLiteral(categoryEEnum, Category.DISTANCE);
		addEEnumLiteral(categoryEEnum, Category.ACOUSTIC);
		addEEnumLiteral(categoryEEnum, Category.SPEED);
		addEEnumLiteral(categoryEEnum, Category.PRESSURE);
		addEEnumLiteral(categoryEEnum, Category.POSITION);
		addEEnumLiteral(categoryEEnum, Category.ELECTRIC);
		addEEnumLiteral(categoryEEnum, Category.VISION);

		initEEnum(electricIDEEnum, ElectricID.class, "ElectricID");
		addEEnumLiteral(electricIDEEnum, ElectricID.BATTERY);

		initEEnum(speedIDEEnum, SpeedID.class, "SpeedID");
		addEEnumLiteral(speedIDEEnum, SpeedID.TORSO);

		initEEnum(postureIDEEnum, PostureID.class, "PostureID");
		addEEnumLiteral(postureIDEEnum, PostureID.ROBOT);

		initEEnum(positionID_HandEEnum, PositionID_Hand.class, "PositionID_Hand");
		addEEnumLiteral(positionID_HandEEnum, PositionID_Hand.LSHOULDERPITCH);
		addEEnumLiteral(positionID_HandEEnum, PositionID_Hand.LSHOULDERROLL);
		addEEnumLiteral(positionID_HandEEnum, PositionID_Hand.LELBOWYAW);
		addEEnumLiteral(positionID_HandEEnum, PositionID_Hand.LELBOWROLL);
		addEEnumLiteral(positionID_HandEEnum, PositionID_Hand.LWRISTYAW);
		addEEnumLiteral(positionID_HandEEnum, PositionID_Hand.RSHOULDERPITCH);
		addEEnumLiteral(positionID_HandEEnum, PositionID_Hand.RSHOULDERROLL);
		addEEnumLiteral(positionID_HandEEnum, PositionID_Hand.RELBOWYAW);
		addEEnumLiteral(positionID_HandEEnum, PositionID_Hand.RELBOWROLL);
		addEEnumLiteral(positionID_HandEEnum, PositionID_Hand.RWRISTYAW);

		initEEnum(acousticIDEEnum, AcousticID.class, "AcousticID");
		addEEnumLiteral(acousticIDEEnum, AcousticID.MICFRONT);
		addEEnumLiteral(acousticIDEEnum, AcousticID.MICREAR);
		addEEnumLiteral(acousticIDEEnum, AcousticID.MICLEFT);
		addEEnumLiteral(acousticIDEEnum, AcousticID.MICRIGHT);

		initEEnum(positionID_HeadEEnum, PositionID_Head.class, "PositionID_Head");
		addEEnumLiteral(positionID_HeadEEnum, PositionID_Head.HEADYAW);
		addEEnumLiteral(positionID_HeadEEnum, PositionID_Head.HEADPITCH);

		initEEnum(positionID_FootEEnum, PositionID_Foot.class, "PositionID_Foot");
		addEEnumLiteral(positionID_FootEEnum, PositionID_Foot.LHIPYAWPITCH);
		addEEnumLiteral(positionID_FootEEnum, PositionID_Foot.LHIPROLL);
		addEEnumLiteral(positionID_FootEEnum, PositionID_Foot.LHIPPITCH);
		addEEnumLiteral(positionID_FootEEnum, PositionID_Foot.LKNEEPITCH);
		addEEnumLiteral(positionID_FootEEnum, PositionID_Foot.LANKLEPITCH);
		addEEnumLiteral(positionID_FootEEnum, PositionID_Foot.LANKLEROLL);
		addEEnumLiteral(positionID_FootEEnum, PositionID_Foot.RHIPYAWPITCH);
		addEEnumLiteral(positionID_FootEEnum, PositionID_Foot.RHIPROLL);
		addEEnumLiteral(positionID_FootEEnum, PositionID_Foot.RHIPPITCH);
		addEEnumLiteral(positionID_FootEEnum, PositionID_Foot.RKNEEPITCH);
		addEEnumLiteral(positionID_FootEEnum, PositionID_Foot.RANKLEROLL);
		addEEnumLiteral(positionID_FootEEnum, PositionID_Foot.RANKLEPITCH);

		initEEnum(tframeOriginsEEnum, TframeOrigins.class, "TframeOrigins");
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.BATTERY);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.ACCELEROMETER);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.CAMERABOTTOM);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.CAMERATOP);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.HEAD_TOUCH_FRONT);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.HEAD_TOUCH_MIDDLE);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.HEAD_TOUCH_REAR);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.LFOOT_BUMBER_LEFT);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.LFOOT_BUMBER_RIGHT);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.MICFRONT);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.MICREAR);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.MICLEFT);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.MICRIGHT);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.RFOOT_BUMBER_LEFT);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.RFOOT_BUMBER_RIGHT);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.LHAND_TOUCH_BACK);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.LHAND_TOUCH_LEFT);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.LHAND_TOUCH_RIGHT);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.RHAND_TOUCH_BACK);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.RHAND_TOUCH_LEFT);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.RHAND_TOUCH_RIGHT);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.SONAR_LEFT);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.SONAR_RIGHT);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.HEADYAW);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.HEADPITCH);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.LSHOULDERPITCH);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.LSHOULDERROLL);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.LELBOWYAW);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.RSHOULDERPITCH);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.RSHOULDERROLL);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.RELBOWYAW);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.RELBOWROLL);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.RWRISTYAW);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.LHIPYAWPITCH);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.LHIPROLL);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.LHIPPITCH);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.LKNEEPITCH);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.LANKLEPITCH);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.RHIPYAWPITCH);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.RHIPROLL);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.RHIPPITCH);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.RKNEEPITCH);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.RANKLEROLL);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.RANKLEPITCH);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.LANKLEROLL);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.LELBOWROLL);
		addEEnumLiteral(tframeOriginsEEnum, TframeOrigins.LWRISTYAW);

		initEEnum(tframeTargetsEEnum, TframeTargets.class, "TframeTargets");
		addEEnumLiteral(tframeTargetsEEnum, TframeTargets.FRAME_ROBOT);
		addEEnumLiteral(tframeTargetsEEnum, TframeTargets.FRAME_TORSO);
		addEEnumLiteral(tframeTargetsEEnum, TframeTargets.FRAME_WORLD);

		initEEnum(pressureID_HeadEEnum, PressureID_Head.class, "PressureID_Head");
		addEEnumLiteral(pressureID_HeadEEnum, PressureID_Head.HEAD_TOUCH_REAR);
		addEEnumLiteral(pressureID_HeadEEnum, PressureID_Head.HEAD_TOUCH_FRONT);
		addEEnumLiteral(pressureID_HeadEEnum, PressureID_Head.HEAD_TOUCH_MIDDLE);

		initEEnum(pressureID_HandEEnum, PressureID_Hand.class, "PressureID_Hand");
		addEEnumLiteral(pressureID_HandEEnum, PressureID_Hand.LHAND_TOUCH_BACK);
		addEEnumLiteral(pressureID_HandEEnum, PressureID_Hand.LHAND_TOUCH_LEFT);
		addEEnumLiteral(pressureID_HandEEnum, PressureID_Hand.LHAND_TOUCH_RIGHT);
		addEEnumLiteral(pressureID_HandEEnum, PressureID_Hand.RHAND_TOUCH_BACK);
		addEEnumLiteral(pressureID_HandEEnum, PressureID_Hand.RHAND_TOUCH_LEFT);
		addEEnumLiteral(pressureID_HandEEnum, PressureID_Hand.RHAND_TOUCH_RIGHT);

		initEEnum(pressureID_FootEEnum, PressureID_Foot.class, "PressureID_Foot");
		addEEnumLiteral(pressureID_FootEEnum, PressureID_Foot.LFOOT_BUMPER_LEFT);
		addEEnumLiteral(pressureID_FootEEnum, PressureID_Foot.LFOOT_BUMPER_RIGHT);
		addEEnumLiteral(pressureID_FootEEnum, PressureID_Foot.RFOOT_BUMPER_LEFT);
		addEEnumLiteral(pressureID_FootEEnum, PressureID_Foot.RFOOT_BUMPER_RIGHT);

		initEEnum(acousticTimeIDEEnum, AcousticTimeID.class, "AcousticTimeID");
		addEEnumLiteral(acousticTimeIDEEnum, AcousticTimeID.SECONDS);
		addEEnumLiteral(acousticTimeIDEEnum, AcousticTimeID.MINUTES);
		addEEnumLiteral(acousticTimeIDEEnum, AcousticTimeID.HOURS);

		// Create resource
		createResource(eNS_URI);
	}

} //SensorProjectPackageImpl
