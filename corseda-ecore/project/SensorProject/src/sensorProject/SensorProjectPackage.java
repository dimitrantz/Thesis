/**
 */
package sensorProject;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sensorProject.SensorProjectFactory
 * @model kind="package"
 * @generated
 */
public interface SensorProjectPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sensorProject";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/SensorProject/model/sensorProject.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sensorProject";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SensorProjectPackage eINSTANCE = sensorProject.impl.SensorProjectPackageImpl.init();

	/**
	 * The meta object id for the '{@link sensorProject.impl.SubSystemImpl <em>Sub System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.impl.SubSystemImpl
	 * @see sensorProject.impl.SensorProjectPackageImpl#getSubSystem()
	 * @generated
	 */
	int SUB_SYSTEM = 8;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__CATEGORY = 0;

	/**
	 * The feature id for the '<em><b>Has Sensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__HAS_SENSOR = 1;

	/**
	 * The feature id for the '<em><b>Refresh rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__REFRESH_RATE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Sub System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Sub System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sensorProject.impl.DistanceSystemImpl <em>Distance System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.impl.DistanceSystemImpl
	 * @see sensorProject.impl.SensorProjectPackageImpl#getDistanceSystem()
	 * @generated
	 */
	int DISTANCE_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SYSTEM__CATEGORY = SUB_SYSTEM__CATEGORY;

	/**
	 * The feature id for the '<em><b>Has Sensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SYSTEM__HAS_SENSOR = SUB_SYSTEM__HAS_SENSOR;

	/**
	 * The feature id for the '<em><b>Refresh rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SYSTEM__REFRESH_RATE = SUB_SYSTEM__REFRESH_RATE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SYSTEM__DESCRIPTION = SUB_SYSTEM__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Distance System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SYSTEM_FEATURE_COUNT = SUB_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Distance System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SYSTEM_OPERATION_COUNT = SUB_SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensorProject.impl.ElectricSystemImpl <em>Electric System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.impl.ElectricSystemImpl
	 * @see sensorProject.impl.SensorProjectPackageImpl#getElectricSystem()
	 * @generated
	 */
	int ELECTRIC_SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_SYSTEM__CATEGORY = SUB_SYSTEM__CATEGORY;

	/**
	 * The feature id for the '<em><b>Has Sensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_SYSTEM__HAS_SENSOR = SUB_SYSTEM__HAS_SENSOR;

	/**
	 * The feature id for the '<em><b>Refresh rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_SYSTEM__REFRESH_RATE = SUB_SYSTEM__REFRESH_RATE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_SYSTEM__DESCRIPTION = SUB_SYSTEM__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Electric System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_SYSTEM_FEATURE_COUNT = SUB_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Electric System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_SYSTEM_OPERATION_COUNT = SUB_SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensorProject.impl.VisionSystemImpl <em>Vision System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.impl.VisionSystemImpl
	 * @see sensorProject.impl.SensorProjectPackageImpl#getVisionSystem()
	 * @generated
	 */
	int VISION_SYSTEM = 2;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISION_SYSTEM__CATEGORY = SUB_SYSTEM__CATEGORY;

	/**
	 * The feature id for the '<em><b>Has Sensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISION_SYSTEM__HAS_SENSOR = SUB_SYSTEM__HAS_SENSOR;

	/**
	 * The feature id for the '<em><b>Refresh rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISION_SYSTEM__REFRESH_RATE = SUB_SYSTEM__REFRESH_RATE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISION_SYSTEM__DESCRIPTION = SUB_SYSTEM__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Vision System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISION_SYSTEM_FEATURE_COUNT = SUB_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Vision System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISION_SYSTEM_OPERATION_COUNT = SUB_SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensorProject.impl.PositionSystemImpl <em>Position System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.impl.PositionSystemImpl
	 * @see sensorProject.impl.SensorProjectPackageImpl#getPositionSystem()
	 * @generated
	 */
	int POSITION_SYSTEM = 3;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SYSTEM__CATEGORY = SUB_SYSTEM__CATEGORY;

	/**
	 * The feature id for the '<em><b>Has Sensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SYSTEM__HAS_SENSOR = SUB_SYSTEM__HAS_SENSOR;

	/**
	 * The feature id for the '<em><b>Refresh rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SYSTEM__REFRESH_RATE = SUB_SYSTEM__REFRESH_RATE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SYSTEM__DESCRIPTION = SUB_SYSTEM__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Position System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SYSTEM_FEATURE_COUNT = SUB_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Position System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SYSTEM_OPERATION_COUNT = SUB_SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensorProject.impl.SpeedSystemImpl <em>Speed System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.impl.SpeedSystemImpl
	 * @see sensorProject.impl.SensorProjectPackageImpl#getSpeedSystem()
	 * @generated
	 */
	int SPEED_SYSTEM = 4;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_SYSTEM__CATEGORY = SUB_SYSTEM__CATEGORY;

	/**
	 * The feature id for the '<em><b>Has Sensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_SYSTEM__HAS_SENSOR = SUB_SYSTEM__HAS_SENSOR;

	/**
	 * The feature id for the '<em><b>Refresh rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_SYSTEM__REFRESH_RATE = SUB_SYSTEM__REFRESH_RATE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_SYSTEM__DESCRIPTION = SUB_SYSTEM__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Speed System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_SYSTEM_FEATURE_COUNT = SUB_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Speed System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_SYSTEM_OPERATION_COUNT = SUB_SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensorProject.impl.PressureSystemImpl <em>Pressure System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.impl.PressureSystemImpl
	 * @see sensorProject.impl.SensorProjectPackageImpl#getPressureSystem()
	 * @generated
	 */
	int PRESSURE_SYSTEM = 5;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SYSTEM__CATEGORY = SUB_SYSTEM__CATEGORY;

	/**
	 * The feature id for the '<em><b>Has Sensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SYSTEM__HAS_SENSOR = SUB_SYSTEM__HAS_SENSOR;

	/**
	 * The feature id for the '<em><b>Refresh rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SYSTEM__REFRESH_RATE = SUB_SYSTEM__REFRESH_RATE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SYSTEM__DESCRIPTION = SUB_SYSTEM__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Pressure System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SYSTEM_FEATURE_COUNT = SUB_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pressure System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SYSTEM_OPERATION_COUNT = SUB_SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensorProject.impl.AcousticSystemImpl <em>Acoustic System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.impl.AcousticSystemImpl
	 * @see sensorProject.impl.SensorProjectPackageImpl#getAcousticSystem()
	 * @generated
	 */
	int ACOUSTIC_SYSTEM = 6;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_SYSTEM__CATEGORY = SUB_SYSTEM__CATEGORY;

	/**
	 * The feature id for the '<em><b>Has Sensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_SYSTEM__HAS_SENSOR = SUB_SYSTEM__HAS_SENSOR;

	/**
	 * The feature id for the '<em><b>Refresh rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_SYSTEM__REFRESH_RATE = SUB_SYSTEM__REFRESH_RATE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_SYSTEM__DESCRIPTION = SUB_SYSTEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Record Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_SYSTEM__RECORD_TIME = SUB_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_SYSTEM__TIME_FORMAT = SUB_SYSTEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Measure Once</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_SYSTEM__MEASURE_ONCE = SUB_SYSTEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Acoustic System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_SYSTEM_FEATURE_COUNT = SUB_SYSTEM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Acoustic System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_SYSTEM_OPERATION_COUNT = SUB_SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensorProject.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.impl.SensorImpl
	 * @see sensorProject.impl.SensorProjectPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = 0;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sensorProject.impl.AcousticSensorImpl <em>Acoustic Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.impl.AcousticSensorImpl
	 * @see sensorProject.impl.SensorProjectPackageImpl#getAcousticSensor()
	 * @generated
	 */
	int ACOUSTIC_SENSOR = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_SENSOR__TYPE = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Acoustic Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Acoustic Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensorProject.impl.SensorSystemImpl <em>Sensor System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.impl.SensorSystemImpl
	 * @see sensorProject.impl.SensorProjectPackageImpl#getSensorSystem()
	 * @generated
	 */
	int SENSOR_SYSTEM = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_SYSTEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_SYSTEM__DURATION = 1;

	/**
	 * The feature id for the '<em><b>Has Subsystem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_SYSTEM__HAS_SUBSYSTEM = 2;

	/**
	 * The feature id for the '<em><b>Time Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_SYSTEM__TIME_FORMAT = 3;

	/**
	 * The number of structural features of the '<em>Sensor System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_SYSTEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Sensor System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sensorProject.impl.ElectricSensorImpl <em>Electric Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.impl.ElectricSensorImpl
	 * @see sensorProject.impl.SensorProjectPackageImpl#getElectricSensor()
	 * @generated
	 */
	int ELECTRIC_SENSOR = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_SENSOR__TYPE = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alarm Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_SENSOR__ALARM_VALUE = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Notifications</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_SENSOR__NOTIFICATIONS = SENSOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Electric Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Electric Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensorProject.impl.DistanceSensorImpl <em>Distance Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.impl.DistanceSensorImpl
	 * @see sensorProject.impl.SensorProjectPackageImpl#getDistanceSensor()
	 * @generated
	 */
	int DISTANCE_SENSOR = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Max Distance Accepted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR__MAX_DISTANCE_ACCEPTED = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Distance Accepted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR__MIN_DISTANCE_ACCEPTED = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR__TYPE = SENSOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Alarm Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR__ALARM_VALUE = SENSOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Notifications</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR__NOTIFICATIONS = SENSOR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Distance Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Distance Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensorProject.impl.PressureSensorImpl <em>Pressure Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.impl.PressureSensorImpl
	 * @see sensorProject.impl.SensorProjectPackageImpl#getPressureSensor()
	 * @generated
	 */
	int PRESSURE_SENSOR = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The number of structural features of the '<em>Pressure Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pressure Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensorProject.impl.PostureSensorImpl <em>Posture Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.impl.PostureSensorImpl
	 * @see sensorProject.impl.SensorProjectPackageImpl#getPostureSensor()
	 * @generated
	 */
	int POSTURE_SENSOR = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTURE_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTURE_SENSOR__TYPE = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Posture Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTURE_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Posture Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTURE_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensorProject.impl.PositionSensorImpl <em>Position Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.impl.PositionSensorImpl
	 * @see sensorProject.impl.SensorProjectPackageImpl#getPositionSensor()
	 * @generated
	 */
	int POSITION_SENSOR = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The number of structural features of the '<em>Position Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Position Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensorProject.impl.TframeSensorImpl <em>Tframe Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.impl.TframeSensorImpl
	 * @see sensorProject.impl.SensorProjectPackageImpl#getTframeSensor()
	 * @generated
	 */
	int TFRAME_SENSOR = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFRAME_SENSOR__NAME = POSITION_SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFRAME_SENSOR__ORIGIN = POSITION_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFRAME_SENSOR__TARGET = POSITION_SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tframe Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFRAME_SENSOR_FEATURE_COUNT = POSITION_SENSOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tframe Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFRAME_SENSOR_OPERATION_COUNT = POSITION_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensorProject.impl.VisionSensorImpl <em>Vision Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.impl.VisionSensorImpl
	 * @see sensorProject.impl.SensorProjectPackageImpl#getVisionSensor()
	 * @generated
	 */
	int VISION_SENSOR = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISION_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISION_SENSOR__TYPE = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISION_SENSOR__RESOLUTION = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Vision Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISION_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Vision Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISION_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensorProject.impl.SpeedSensorImpl <em>Speed Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.impl.SpeedSensorImpl
	 * @see sensorProject.impl.SensorProjectPackageImpl#getSpeedSensor()
	 * @generated
	 */
	int SPEED_SENSOR = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_SENSOR__TYPE = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Speed Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Speed Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensorProject.impl.PressureSensorHeadImpl <em>Pressure Sensor Head</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.impl.PressureSensorHeadImpl
	 * @see sensorProject.impl.SensorProjectPackageImpl#getPressureSensorHead()
	 * @generated
	 */
	int PRESSURE_SENSOR_HEAD = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_HEAD__NAME = PRESSURE_SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_HEAD__TYPE = PRESSURE_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pressure Sensor Head</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_HEAD_FEATURE_COUNT = PRESSURE_SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pressure Sensor Head</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_HEAD_OPERATION_COUNT = PRESSURE_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensorProject.impl.PressureSensorHandImpl <em>Pressure Sensor Hand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.impl.PressureSensorHandImpl
	 * @see sensorProject.impl.SensorProjectPackageImpl#getPressureSensorHand()
	 * @generated
	 */
	int PRESSURE_SENSOR_HAND = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_HAND__NAME = PRESSURE_SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_HAND__TYPE = PRESSURE_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pressure Sensor Hand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_HAND_FEATURE_COUNT = PRESSURE_SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pressure Sensor Hand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_HAND_OPERATION_COUNT = PRESSURE_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensorProject.impl.PressureSensorFootImpl <em>Pressure Sensor Foot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.impl.PressureSensorFootImpl
	 * @see sensorProject.impl.SensorProjectPackageImpl#getPressureSensorFoot()
	 * @generated
	 */
	int PRESSURE_SENSOR_FOOT = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_FOOT__NAME = PRESSURE_SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_FOOT__TYPE = PRESSURE_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pressure Sensor Foot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_FOOT_FEATURE_COUNT = PRESSURE_SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pressure Sensor Foot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_FOOT_OPERATION_COUNT = PRESSURE_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensorProject.impl.PositionSensorRobotImpl <em>Position Sensor Robot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.impl.PositionSensorRobotImpl
	 * @see sensorProject.impl.SensorProjectPackageImpl#getPositionSensorRobot()
	 * @generated
	 */
	int POSITION_SENSOR_ROBOT = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR_ROBOT__NAME = POSITION_SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR_ROBOT__TYPE = POSITION_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Position Sensor Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR_ROBOT_FEATURE_COUNT = POSITION_SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Position Sensor Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR_ROBOT_OPERATION_COUNT = POSITION_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensorProject.impl.PositionSensorHeadImpl <em>Position Sensor Head</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.impl.PositionSensorHeadImpl
	 * @see sensorProject.impl.SensorProjectPackageImpl#getPositionSensorHead()
	 * @generated
	 */
	int POSITION_SENSOR_HEAD = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR_HEAD__NAME = POSITION_SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR_HEAD__TYPE = POSITION_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Position Sensor Head</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR_HEAD_FEATURE_COUNT = POSITION_SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Position Sensor Head</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR_HEAD_OPERATION_COUNT = POSITION_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensorProject.impl.PositionSensorFootImpl <em>Position Sensor Foot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.impl.PositionSensorFootImpl
	 * @see sensorProject.impl.SensorProjectPackageImpl#getPositionSensorFoot()
	 * @generated
	 */
	int POSITION_SENSOR_FOOT = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR_FOOT__NAME = POSITION_SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR_FOOT__TYPE = POSITION_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Position Sensor Foot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR_FOOT_FEATURE_COUNT = POSITION_SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Position Sensor Foot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR_FOOT_OPERATION_COUNT = POSITION_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensorProject.impl.PositionSensorHandImpl <em>Position Sensor Hand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.impl.PositionSensorHandImpl
	 * @see sensorProject.impl.SensorProjectPackageImpl#getPositionSensorHand()
	 * @generated
	 */
	int POSITION_SENSOR_HAND = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR_HAND__NAME = POSITION_SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR_HAND__TYPE = POSITION_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Position Sensor Hand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR_HAND_FEATURE_COUNT = POSITION_SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Position Sensor Hand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR_HAND_OPERATION_COUNT = POSITION_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensorProject.VisionID <em>Vision ID</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.VisionID
	 * @see sensorProject.impl.SensorProjectPackageImpl#getVisionID()
	 * @generated
	 */
	int VISION_ID = 26;

	/**
	 * The meta object id for the '{@link sensorProject.ResolutionID <em>Resolution ID</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.ResolutionID
	 * @see sensorProject.impl.SensorProjectPackageImpl#getResolutionID()
	 * @generated
	 */
	int RESOLUTION_ID = 27;

	/**
	 * The meta object id for the '{@link sensorProject.DistanceID <em>Distance ID</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.DistanceID
	 * @see sensorProject.impl.SensorProjectPackageImpl#getDistanceID()
	 * @generated
	 */
	int DISTANCE_ID = 28;

	/**
	 * The meta object id for the '{@link sensorProject.PositionID_Robot <em>Position ID Robot</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.PositionID_Robot
	 * @see sensorProject.impl.SensorProjectPackageImpl#getPositionID_Robot()
	 * @generated
	 */
	int POSITION_ID_ROBOT = 29;

	/**
	 * The meta object id for the '{@link sensorProject.Category <em>Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.Category
	 * @see sensorProject.impl.SensorProjectPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 30;

	/**
	 * The meta object id for the '{@link sensorProject.ElectricID <em>Electric ID</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.ElectricID
	 * @see sensorProject.impl.SensorProjectPackageImpl#getElectricID()
	 * @generated
	 */
	int ELECTRIC_ID = 31;

	/**
	 * The meta object id for the '{@link sensorProject.SpeedID <em>Speed ID</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.SpeedID
	 * @see sensorProject.impl.SensorProjectPackageImpl#getSpeedID()
	 * @generated
	 */
	int SPEED_ID = 32;

	/**
	 * The meta object id for the '{@link sensorProject.PostureID <em>Posture ID</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.PostureID
	 * @see sensorProject.impl.SensorProjectPackageImpl#getPostureID()
	 * @generated
	 */
	int POSTURE_ID = 33;

	/**
	 * The meta object id for the '{@link sensorProject.PositionID_Hand <em>Position ID Hand</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.PositionID_Hand
	 * @see sensorProject.impl.SensorProjectPackageImpl#getPositionID_Hand()
	 * @generated
	 */
	int POSITION_ID_HAND = 34;

	/**
	 * The meta object id for the '{@link sensorProject.AcousticID <em>Acoustic ID</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.AcousticID
	 * @see sensorProject.impl.SensorProjectPackageImpl#getAcousticID()
	 * @generated
	 */
	int ACOUSTIC_ID = 35;

	/**
	 * The meta object id for the '{@link sensorProject.PositionID_Head <em>Position ID Head</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.PositionID_Head
	 * @see sensorProject.impl.SensorProjectPackageImpl#getPositionID_Head()
	 * @generated
	 */
	int POSITION_ID_HEAD = 36;

	/**
	 * The meta object id for the '{@link sensorProject.PositionID_Foot <em>Position ID Foot</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.PositionID_Foot
	 * @see sensorProject.impl.SensorProjectPackageImpl#getPositionID_Foot()
	 * @generated
	 */
	int POSITION_ID_FOOT = 37;

	/**
	 * The meta object id for the '{@link sensorProject.TframeOrigins <em>Tframe Origins</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.TframeOrigins
	 * @see sensorProject.impl.SensorProjectPackageImpl#getTframeOrigins()
	 * @generated
	 */
	int TFRAME_ORIGINS = 38;

	/**
	 * The meta object id for the '{@link sensorProject.TframeTargets <em>Tframe Targets</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.TframeTargets
	 * @see sensorProject.impl.SensorProjectPackageImpl#getTframeTargets()
	 * @generated
	 */
	int TFRAME_TARGETS = 39;

	/**
	 * The meta object id for the '{@link sensorProject.PressureID_Head <em>Pressure ID Head</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.PressureID_Head
	 * @see sensorProject.impl.SensorProjectPackageImpl#getPressureID_Head()
	 * @generated
	 */
	int PRESSURE_ID_HEAD = 40;

	/**
	 * The meta object id for the '{@link sensorProject.PressureID_Hand <em>Pressure ID Hand</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.PressureID_Hand
	 * @see sensorProject.impl.SensorProjectPackageImpl#getPressureID_Hand()
	 * @generated
	 */
	int PRESSURE_ID_HAND = 41;

	/**
	 * The meta object id for the '{@link sensorProject.PressureID_Foot <em>Pressure ID Foot</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.PressureID_Foot
	 * @see sensorProject.impl.SensorProjectPackageImpl#getPressureID_Foot()
	 * @generated
	 */
	int PRESSURE_ID_FOOT = 42;

	/**
	 * The meta object id for the '{@link sensorProject.AcousticTimeID <em>Acoustic Time ID</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorProject.AcousticTimeID
	 * @see sensorProject.impl.SensorProjectPackageImpl#getAcousticTimeID()
	 * @generated
	 */
	int ACOUSTIC_TIME_ID = 43;

	/**
	 * Returns the meta object for class '{@link sensorProject.DistanceSystem <em>Distance System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distance System</em>'.
	 * @see sensorProject.DistanceSystem
	 * @generated
	 */
	EClass getDistanceSystem();

	/**
	 * Returns the meta object for class '{@link sensorProject.ElectricSystem <em>Electric System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electric System</em>'.
	 * @see sensorProject.ElectricSystem
	 * @generated
	 */
	EClass getElectricSystem();

	/**
	 * Returns the meta object for class '{@link sensorProject.VisionSystem <em>Vision System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vision System</em>'.
	 * @see sensorProject.VisionSystem
	 * @generated
	 */
	EClass getVisionSystem();

	/**
	 * Returns the meta object for class '{@link sensorProject.PositionSystem <em>Position System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position System</em>'.
	 * @see sensorProject.PositionSystem
	 * @generated
	 */
	EClass getPositionSystem();

	/**
	 * Returns the meta object for class '{@link sensorProject.SpeedSystem <em>Speed System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speed System</em>'.
	 * @see sensorProject.SpeedSystem
	 * @generated
	 */
	EClass getSpeedSystem();

	/**
	 * Returns the meta object for class '{@link sensorProject.PressureSystem <em>Pressure System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pressure System</em>'.
	 * @see sensorProject.PressureSystem
	 * @generated
	 */
	EClass getPressureSystem();

	/**
	 * Returns the meta object for class '{@link sensorProject.AcousticSystem <em>Acoustic System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acoustic System</em>'.
	 * @see sensorProject.AcousticSystem
	 * @generated
	 */
	EClass getAcousticSystem();

	/**
	 * Returns the meta object for the attribute '{@link sensorProject.AcousticSystem#getRecordTime <em>Record Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Record Time</em>'.
	 * @see sensorProject.AcousticSystem#getRecordTime()
	 * @see #getAcousticSystem()
	 * @generated
	 */
	EAttribute getAcousticSystem_RecordTime();

	/**
	 * Returns the meta object for the attribute '{@link sensorProject.AcousticSystem#getTimeFormat <em>Time Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Format</em>'.
	 * @see sensorProject.AcousticSystem#getTimeFormat()
	 * @see #getAcousticSystem()
	 * @generated
	 */
	EAttribute getAcousticSystem_TimeFormat();

	/**
	 * Returns the meta object for the attribute '{@link sensorProject.AcousticSystem#isMeasureOnce <em>Measure Once</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measure Once</em>'.
	 * @see sensorProject.AcousticSystem#isMeasureOnce()
	 * @see #getAcousticSystem()
	 * @generated
	 */
	EAttribute getAcousticSystem_MeasureOnce();

	/**
	 * Returns the meta object for class '{@link sensorProject.AcousticSensor <em>Acoustic Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acoustic Sensor</em>'.
	 * @see sensorProject.AcousticSensor
	 * @generated
	 */
	EClass getAcousticSensor();

	/**
	 * Returns the meta object for the attribute '{@link sensorProject.AcousticSensor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see sensorProject.AcousticSensor#getType()
	 * @see #getAcousticSensor()
	 * @generated
	 */
	EAttribute getAcousticSensor_Type();

	/**
	 * Returns the meta object for class '{@link sensorProject.SubSystem <em>Sub System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub System</em>'.
	 * @see sensorProject.SubSystem
	 * @generated
	 */
	EClass getSubSystem();

	/**
	 * Returns the meta object for the attribute '{@link sensorProject.SubSystem#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see sensorProject.SubSystem#getCategory()
	 * @see #getSubSystem()
	 * @generated
	 */
	EAttribute getSubSystem_Category();

	/**
	 * Returns the meta object for the containment reference list '{@link sensorProject.SubSystem#getHasSensor <em>Has Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Sensor</em>'.
	 * @see sensorProject.SubSystem#getHasSensor()
	 * @see #getSubSystem()
	 * @generated
	 */
	EReference getSubSystem_HasSensor();

	/**
	 * Returns the meta object for the attribute '{@link sensorProject.SubSystem#getRefresh_rate <em>Refresh rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refresh rate</em>'.
	 * @see sensorProject.SubSystem#getRefresh_rate()
	 * @see #getSubSystem()
	 * @generated
	 */
	EAttribute getSubSystem_Refresh_rate();

	/**
	 * Returns the meta object for the attribute '{@link sensorProject.SubSystem#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see sensorProject.SubSystem#getDescription()
	 * @see #getSubSystem()
	 * @generated
	 */
	EAttribute getSubSystem_Description();

	/**
	 * Returns the meta object for class '{@link sensorProject.SensorSystem <em>Sensor System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor System</em>'.
	 * @see sensorProject.SensorSystem
	 * @generated
	 */
	EClass getSensorSystem();

	/**
	 * Returns the meta object for the attribute '{@link sensorProject.SensorSystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sensorProject.SensorSystem#getName()
	 * @see #getSensorSystem()
	 * @generated
	 */
	EAttribute getSensorSystem_Name();

	/**
	 * Returns the meta object for the attribute '{@link sensorProject.SensorSystem#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see sensorProject.SensorSystem#getDuration()
	 * @see #getSensorSystem()
	 * @generated
	 */
	EAttribute getSensorSystem_Duration();

	/**
	 * Returns the meta object for the containment reference list '{@link sensorProject.SensorSystem#getHasSubsystem <em>Has Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Subsystem</em>'.
	 * @see sensorProject.SensorSystem#getHasSubsystem()
	 * @see #getSensorSystem()
	 * @generated
	 */
	EReference getSensorSystem_HasSubsystem();

	/**
	 * Returns the meta object for the attribute '{@link sensorProject.SensorSystem#getTimeFormat <em>Time Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Format</em>'.
	 * @see sensorProject.SensorSystem#getTimeFormat()
	 * @see #getSensorSystem()
	 * @generated
	 */
	EAttribute getSensorSystem_TimeFormat();

	/**
	 * Returns the meta object for class '{@link sensorProject.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see sensorProject.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the attribute '{@link sensorProject.Sensor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sensorProject.Sensor#getName()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Name();

	/**
	 * Returns the meta object for class '{@link sensorProject.ElectricSensor <em>Electric Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electric Sensor</em>'.
	 * @see sensorProject.ElectricSensor
	 * @generated
	 */
	EClass getElectricSensor();

	/**
	 * Returns the meta object for the attribute '{@link sensorProject.ElectricSensor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see sensorProject.ElectricSensor#getType()
	 * @see #getElectricSensor()
	 * @generated
	 */
	EAttribute getElectricSensor_Type();

	/**
	 * Returns the meta object for the attribute '{@link sensorProject.ElectricSensor#getAlarmValue <em>Alarm Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Value</em>'.
	 * @see sensorProject.ElectricSensor#getAlarmValue()
	 * @see #getElectricSensor()
	 * @generated
	 */
	EAttribute getElectricSensor_AlarmValue();

	/**
	 * Returns the meta object for the attribute '{@link sensorProject.ElectricSensor#isNotifications <em>Notifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notifications</em>'.
	 * @see sensorProject.ElectricSensor#isNotifications()
	 * @see #getElectricSensor()
	 * @generated
	 */
	EAttribute getElectricSensor_Notifications();

	/**
	 * Returns the meta object for class '{@link sensorProject.DistanceSensor <em>Distance Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distance Sensor</em>'.
	 * @see sensorProject.DistanceSensor
	 * @generated
	 */
	EClass getDistanceSensor();

	/**
	 * Returns the meta object for the attribute '{@link sensorProject.DistanceSensor#getMaxDistanceAccepted <em>Max Distance Accepted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Distance Accepted</em>'.
	 * @see sensorProject.DistanceSensor#getMaxDistanceAccepted()
	 * @see #getDistanceSensor()
	 * @generated
	 */
	EAttribute getDistanceSensor_MaxDistanceAccepted();

	/**
	 * Returns the meta object for the attribute '{@link sensorProject.DistanceSensor#getMinDistanceAccepted <em>Min Distance Accepted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Distance Accepted</em>'.
	 * @see sensorProject.DistanceSensor#getMinDistanceAccepted()
	 * @see #getDistanceSensor()
	 * @generated
	 */
	EAttribute getDistanceSensor_MinDistanceAccepted();

	/**
	 * Returns the meta object for the attribute '{@link sensorProject.DistanceSensor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see sensorProject.DistanceSensor#getType()
	 * @see #getDistanceSensor()
	 * @generated
	 */
	EAttribute getDistanceSensor_Type();

	/**
	 * Returns the meta object for the attribute '{@link sensorProject.DistanceSensor#getAlarmValue <em>Alarm Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Value</em>'.
	 * @see sensorProject.DistanceSensor#getAlarmValue()
	 * @see #getDistanceSensor()
	 * @generated
	 */
	EAttribute getDistanceSensor_AlarmValue();

	/**
	 * Returns the meta object for the attribute '{@link sensorProject.DistanceSensor#isNotifications <em>Notifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notifications</em>'.
	 * @see sensorProject.DistanceSensor#isNotifications()
	 * @see #getDistanceSensor()
	 * @generated
	 */
	EAttribute getDistanceSensor_Notifications();

	/**
	 * Returns the meta object for class '{@link sensorProject.PressureSensor <em>Pressure Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pressure Sensor</em>'.
	 * @see sensorProject.PressureSensor
	 * @generated
	 */
	EClass getPressureSensor();

	/**
	 * Returns the meta object for class '{@link sensorProject.PostureSensor <em>Posture Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Posture Sensor</em>'.
	 * @see sensorProject.PostureSensor
	 * @generated
	 */
	EClass getPostureSensor();

	/**
	 * Returns the meta object for the attribute '{@link sensorProject.PostureSensor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see sensorProject.PostureSensor#getType()
	 * @see #getPostureSensor()
	 * @generated
	 */
	EAttribute getPostureSensor_Type();

	/**
	 * Returns the meta object for class '{@link sensorProject.TframeSensor <em>Tframe Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tframe Sensor</em>'.
	 * @see sensorProject.TframeSensor
	 * @generated
	 */
	EClass getTframeSensor();

	/**
	 * Returns the meta object for the attribute '{@link sensorProject.TframeSensor#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin</em>'.
	 * @see sensorProject.TframeSensor#getOrigin()
	 * @see #getTframeSensor()
	 * @generated
	 */
	EAttribute getTframeSensor_Origin();

	/**
	 * Returns the meta object for the attribute '{@link sensorProject.TframeSensor#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see sensorProject.TframeSensor#getTarget()
	 * @see #getTframeSensor()
	 * @generated
	 */
	EAttribute getTframeSensor_Target();

	/**
	 * Returns the meta object for class '{@link sensorProject.PositionSensor <em>Position Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position Sensor</em>'.
	 * @see sensorProject.PositionSensor
	 * @generated
	 */
	EClass getPositionSensor();

	/**
	 * Returns the meta object for class '{@link sensorProject.VisionSensor <em>Vision Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vision Sensor</em>'.
	 * @see sensorProject.VisionSensor
	 * @generated
	 */
	EClass getVisionSensor();

	/**
	 * Returns the meta object for the attribute '{@link sensorProject.VisionSensor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see sensorProject.VisionSensor#getType()
	 * @see #getVisionSensor()
	 * @generated
	 */
	EAttribute getVisionSensor_Type();

	/**
	 * Returns the meta object for the attribute '{@link sensorProject.VisionSensor#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution</em>'.
	 * @see sensorProject.VisionSensor#getResolution()
	 * @see #getVisionSensor()
	 * @generated
	 */
	EAttribute getVisionSensor_Resolution();

	/**
	 * Returns the meta object for class '{@link sensorProject.SpeedSensor <em>Speed Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speed Sensor</em>'.
	 * @see sensorProject.SpeedSensor
	 * @generated
	 */
	EClass getSpeedSensor();

	/**
	 * Returns the meta object for the attribute '{@link sensorProject.SpeedSensor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see sensorProject.SpeedSensor#getType()
	 * @see #getSpeedSensor()
	 * @generated
	 */
	EAttribute getSpeedSensor_Type();

	/**
	 * Returns the meta object for class '{@link sensorProject.PressureSensorHead <em>Pressure Sensor Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pressure Sensor Head</em>'.
	 * @see sensorProject.PressureSensorHead
	 * @generated
	 */
	EClass getPressureSensorHead();

	/**
	 * Returns the meta object for the attribute '{@link sensorProject.PressureSensorHead#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see sensorProject.PressureSensorHead#getType()
	 * @see #getPressureSensorHead()
	 * @generated
	 */
	EAttribute getPressureSensorHead_Type();

	/**
	 * Returns the meta object for class '{@link sensorProject.PressureSensorHand <em>Pressure Sensor Hand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pressure Sensor Hand</em>'.
	 * @see sensorProject.PressureSensorHand
	 * @generated
	 */
	EClass getPressureSensorHand();

	/**
	 * Returns the meta object for the attribute '{@link sensorProject.PressureSensorHand#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see sensorProject.PressureSensorHand#getType()
	 * @see #getPressureSensorHand()
	 * @generated
	 */
	EAttribute getPressureSensorHand_Type();

	/**
	 * Returns the meta object for class '{@link sensorProject.PressureSensorFoot <em>Pressure Sensor Foot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pressure Sensor Foot</em>'.
	 * @see sensorProject.PressureSensorFoot
	 * @generated
	 */
	EClass getPressureSensorFoot();

	/**
	 * Returns the meta object for the attribute '{@link sensorProject.PressureSensorFoot#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see sensorProject.PressureSensorFoot#getType()
	 * @see #getPressureSensorFoot()
	 * @generated
	 */
	EAttribute getPressureSensorFoot_Type();

	/**
	 * Returns the meta object for class '{@link sensorProject.PositionSensorRobot <em>Position Sensor Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position Sensor Robot</em>'.
	 * @see sensorProject.PositionSensorRobot
	 * @generated
	 */
	EClass getPositionSensorRobot();

	/**
	 * Returns the meta object for the attribute '{@link sensorProject.PositionSensorRobot#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see sensorProject.PositionSensorRobot#getType()
	 * @see #getPositionSensorRobot()
	 * @generated
	 */
	EAttribute getPositionSensorRobot_Type();

	/**
	 * Returns the meta object for class '{@link sensorProject.PositionSensorHead <em>Position Sensor Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position Sensor Head</em>'.
	 * @see sensorProject.PositionSensorHead
	 * @generated
	 */
	EClass getPositionSensorHead();

	/**
	 * Returns the meta object for the attribute '{@link sensorProject.PositionSensorHead#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see sensorProject.PositionSensorHead#getType()
	 * @see #getPositionSensorHead()
	 * @generated
	 */
	EAttribute getPositionSensorHead_Type();

	/**
	 * Returns the meta object for class '{@link sensorProject.PositionSensorFoot <em>Position Sensor Foot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position Sensor Foot</em>'.
	 * @see sensorProject.PositionSensorFoot
	 * @generated
	 */
	EClass getPositionSensorFoot();

	/**
	 * Returns the meta object for the attribute '{@link sensorProject.PositionSensorFoot#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see sensorProject.PositionSensorFoot#getType()
	 * @see #getPositionSensorFoot()
	 * @generated
	 */
	EAttribute getPositionSensorFoot_Type();

	/**
	 * Returns the meta object for class '{@link sensorProject.PositionSensorHand <em>Position Sensor Hand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position Sensor Hand</em>'.
	 * @see sensorProject.PositionSensorHand
	 * @generated
	 */
	EClass getPositionSensorHand();

	/**
	 * Returns the meta object for the attribute '{@link sensorProject.PositionSensorHand#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see sensorProject.PositionSensorHand#getType()
	 * @see #getPositionSensorHand()
	 * @generated
	 */
	EAttribute getPositionSensorHand_Type();

	/**
	 * Returns the meta object for enum '{@link sensorProject.VisionID <em>Vision ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vision ID</em>'.
	 * @see sensorProject.VisionID
	 * @generated
	 */
	EEnum getVisionID();

	/**
	 * Returns the meta object for enum '{@link sensorProject.ResolutionID <em>Resolution ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resolution ID</em>'.
	 * @see sensorProject.ResolutionID
	 * @generated
	 */
	EEnum getResolutionID();

	/**
	 * Returns the meta object for enum '{@link sensorProject.DistanceID <em>Distance ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Distance ID</em>'.
	 * @see sensorProject.DistanceID
	 * @generated
	 */
	EEnum getDistanceID();

	/**
	 * Returns the meta object for enum '{@link sensorProject.PositionID_Robot <em>Position ID Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Position ID Robot</em>'.
	 * @see sensorProject.PositionID_Robot
	 * @generated
	 */
	EEnum getPositionID_Robot();

	/**
	 * Returns the meta object for enum '{@link sensorProject.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Category</em>'.
	 * @see sensorProject.Category
	 * @generated
	 */
	EEnum getCategory();

	/**
	 * Returns the meta object for enum '{@link sensorProject.ElectricID <em>Electric ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Electric ID</em>'.
	 * @see sensorProject.ElectricID
	 * @generated
	 */
	EEnum getElectricID();

	/**
	 * Returns the meta object for enum '{@link sensorProject.SpeedID <em>Speed ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Speed ID</em>'.
	 * @see sensorProject.SpeedID
	 * @generated
	 */
	EEnum getSpeedID();

	/**
	 * Returns the meta object for enum '{@link sensorProject.PostureID <em>Posture ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Posture ID</em>'.
	 * @see sensorProject.PostureID
	 * @generated
	 */
	EEnum getPostureID();

	/**
	 * Returns the meta object for enum '{@link sensorProject.PositionID_Hand <em>Position ID Hand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Position ID Hand</em>'.
	 * @see sensorProject.PositionID_Hand
	 * @generated
	 */
	EEnum getPositionID_Hand();

	/**
	 * Returns the meta object for enum '{@link sensorProject.AcousticID <em>Acoustic ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Acoustic ID</em>'.
	 * @see sensorProject.AcousticID
	 * @generated
	 */
	EEnum getAcousticID();

	/**
	 * Returns the meta object for enum '{@link sensorProject.PositionID_Head <em>Position ID Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Position ID Head</em>'.
	 * @see sensorProject.PositionID_Head
	 * @generated
	 */
	EEnum getPositionID_Head();

	/**
	 * Returns the meta object for enum '{@link sensorProject.PositionID_Foot <em>Position ID Foot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Position ID Foot</em>'.
	 * @see sensorProject.PositionID_Foot
	 * @generated
	 */
	EEnum getPositionID_Foot();

	/**
	 * Returns the meta object for enum '{@link sensorProject.TframeOrigins <em>Tframe Origins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tframe Origins</em>'.
	 * @see sensorProject.TframeOrigins
	 * @generated
	 */
	EEnum getTframeOrigins();

	/**
	 * Returns the meta object for enum '{@link sensorProject.TframeTargets <em>Tframe Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tframe Targets</em>'.
	 * @see sensorProject.TframeTargets
	 * @generated
	 */
	EEnum getTframeTargets();

	/**
	 * Returns the meta object for enum '{@link sensorProject.PressureID_Head <em>Pressure ID Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pressure ID Head</em>'.
	 * @see sensorProject.PressureID_Head
	 * @generated
	 */
	EEnum getPressureID_Head();

	/**
	 * Returns the meta object for enum '{@link sensorProject.PressureID_Hand <em>Pressure ID Hand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pressure ID Hand</em>'.
	 * @see sensorProject.PressureID_Hand
	 * @generated
	 */
	EEnum getPressureID_Hand();

	/**
	 * Returns the meta object for enum '{@link sensorProject.PressureID_Foot <em>Pressure ID Foot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pressure ID Foot</em>'.
	 * @see sensorProject.PressureID_Foot
	 * @generated
	 */
	EEnum getPressureID_Foot();

	/**
	 * Returns the meta object for enum '{@link sensorProject.AcousticTimeID <em>Acoustic Time ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Acoustic Time ID</em>'.
	 * @see sensorProject.AcousticTimeID
	 * @generated
	 */
	EEnum getAcousticTimeID();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SensorProjectFactory getSensorProjectFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link sensorProject.impl.DistanceSystemImpl <em>Distance System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.impl.DistanceSystemImpl
		 * @see sensorProject.impl.SensorProjectPackageImpl#getDistanceSystem()
		 * @generated
		 */
		EClass DISTANCE_SYSTEM = eINSTANCE.getDistanceSystem();

		/**
		 * The meta object literal for the '{@link sensorProject.impl.ElectricSystemImpl <em>Electric System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.impl.ElectricSystemImpl
		 * @see sensorProject.impl.SensorProjectPackageImpl#getElectricSystem()
		 * @generated
		 */
		EClass ELECTRIC_SYSTEM = eINSTANCE.getElectricSystem();

		/**
		 * The meta object literal for the '{@link sensorProject.impl.VisionSystemImpl <em>Vision System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.impl.VisionSystemImpl
		 * @see sensorProject.impl.SensorProjectPackageImpl#getVisionSystem()
		 * @generated
		 */
		EClass VISION_SYSTEM = eINSTANCE.getVisionSystem();

		/**
		 * The meta object literal for the '{@link sensorProject.impl.PositionSystemImpl <em>Position System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.impl.PositionSystemImpl
		 * @see sensorProject.impl.SensorProjectPackageImpl#getPositionSystem()
		 * @generated
		 */
		EClass POSITION_SYSTEM = eINSTANCE.getPositionSystem();

		/**
		 * The meta object literal for the '{@link sensorProject.impl.SpeedSystemImpl <em>Speed System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.impl.SpeedSystemImpl
		 * @see sensorProject.impl.SensorProjectPackageImpl#getSpeedSystem()
		 * @generated
		 */
		EClass SPEED_SYSTEM = eINSTANCE.getSpeedSystem();

		/**
		 * The meta object literal for the '{@link sensorProject.impl.PressureSystemImpl <em>Pressure System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.impl.PressureSystemImpl
		 * @see sensorProject.impl.SensorProjectPackageImpl#getPressureSystem()
		 * @generated
		 */
		EClass PRESSURE_SYSTEM = eINSTANCE.getPressureSystem();

		/**
		 * The meta object literal for the '{@link sensorProject.impl.AcousticSystemImpl <em>Acoustic System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.impl.AcousticSystemImpl
		 * @see sensorProject.impl.SensorProjectPackageImpl#getAcousticSystem()
		 * @generated
		 */
		EClass ACOUSTIC_SYSTEM = eINSTANCE.getAcousticSystem();

		/**
		 * The meta object literal for the '<em><b>Record Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACOUSTIC_SYSTEM__RECORD_TIME = eINSTANCE.getAcousticSystem_RecordTime();

		/**
		 * The meta object literal for the '<em><b>Time Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACOUSTIC_SYSTEM__TIME_FORMAT = eINSTANCE.getAcousticSystem_TimeFormat();

		/**
		 * The meta object literal for the '<em><b>Measure Once</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACOUSTIC_SYSTEM__MEASURE_ONCE = eINSTANCE.getAcousticSystem_MeasureOnce();

		/**
		 * The meta object literal for the '{@link sensorProject.impl.AcousticSensorImpl <em>Acoustic Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.impl.AcousticSensorImpl
		 * @see sensorProject.impl.SensorProjectPackageImpl#getAcousticSensor()
		 * @generated
		 */
		EClass ACOUSTIC_SENSOR = eINSTANCE.getAcousticSensor();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACOUSTIC_SENSOR__TYPE = eINSTANCE.getAcousticSensor_Type();

		/**
		 * The meta object literal for the '{@link sensorProject.impl.SubSystemImpl <em>Sub System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.impl.SubSystemImpl
		 * @see sensorProject.impl.SensorProjectPackageImpl#getSubSystem()
		 * @generated
		 */
		EClass SUB_SYSTEM = eINSTANCE.getSubSystem();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_SYSTEM__CATEGORY = eINSTANCE.getSubSystem_Category();

		/**
		 * The meta object literal for the '<em><b>Has Sensor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_SYSTEM__HAS_SENSOR = eINSTANCE.getSubSystem_HasSensor();

		/**
		 * The meta object literal for the '<em><b>Refresh rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_SYSTEM__REFRESH_RATE = eINSTANCE.getSubSystem_Refresh_rate();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_SYSTEM__DESCRIPTION = eINSTANCE.getSubSystem_Description();

		/**
		 * The meta object literal for the '{@link sensorProject.impl.SensorSystemImpl <em>Sensor System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.impl.SensorSystemImpl
		 * @see sensorProject.impl.SensorProjectPackageImpl#getSensorSystem()
		 * @generated
		 */
		EClass SENSOR_SYSTEM = eINSTANCE.getSensorSystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_SYSTEM__NAME = eINSTANCE.getSensorSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_SYSTEM__DURATION = eINSTANCE.getSensorSystem_Duration();

		/**
		 * The meta object literal for the '<em><b>Has Subsystem</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_SYSTEM__HAS_SUBSYSTEM = eINSTANCE.getSensorSystem_HasSubsystem();

		/**
		 * The meta object literal for the '<em><b>Time Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_SYSTEM__TIME_FORMAT = eINSTANCE.getSensorSystem_TimeFormat();

		/**
		 * The meta object literal for the '{@link sensorProject.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.impl.SensorImpl
		 * @see sensorProject.impl.SensorProjectPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__NAME = eINSTANCE.getSensor_Name();

		/**
		 * The meta object literal for the '{@link sensorProject.impl.ElectricSensorImpl <em>Electric Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.impl.ElectricSensorImpl
		 * @see sensorProject.impl.SensorProjectPackageImpl#getElectricSensor()
		 * @generated
		 */
		EClass ELECTRIC_SENSOR = eINSTANCE.getElectricSensor();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRIC_SENSOR__TYPE = eINSTANCE.getElectricSensor_Type();

		/**
		 * The meta object literal for the '<em><b>Alarm Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRIC_SENSOR__ALARM_VALUE = eINSTANCE.getElectricSensor_AlarmValue();

		/**
		 * The meta object literal for the '<em><b>Notifications</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRIC_SENSOR__NOTIFICATIONS = eINSTANCE.getElectricSensor_Notifications();

		/**
		 * The meta object literal for the '{@link sensorProject.impl.DistanceSensorImpl <em>Distance Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.impl.DistanceSensorImpl
		 * @see sensorProject.impl.SensorProjectPackageImpl#getDistanceSensor()
		 * @generated
		 */
		EClass DISTANCE_SENSOR = eINSTANCE.getDistanceSensor();

		/**
		 * The meta object literal for the '<em><b>Max Distance Accepted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTANCE_SENSOR__MAX_DISTANCE_ACCEPTED = eINSTANCE.getDistanceSensor_MaxDistanceAccepted();

		/**
		 * The meta object literal for the '<em><b>Min Distance Accepted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTANCE_SENSOR__MIN_DISTANCE_ACCEPTED = eINSTANCE.getDistanceSensor_MinDistanceAccepted();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTANCE_SENSOR__TYPE = eINSTANCE.getDistanceSensor_Type();

		/**
		 * The meta object literal for the '<em><b>Alarm Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTANCE_SENSOR__ALARM_VALUE = eINSTANCE.getDistanceSensor_AlarmValue();

		/**
		 * The meta object literal for the '<em><b>Notifications</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTANCE_SENSOR__NOTIFICATIONS = eINSTANCE.getDistanceSensor_Notifications();

		/**
		 * The meta object literal for the '{@link sensorProject.impl.PressureSensorImpl <em>Pressure Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.impl.PressureSensorImpl
		 * @see sensorProject.impl.SensorProjectPackageImpl#getPressureSensor()
		 * @generated
		 */
		EClass PRESSURE_SENSOR = eINSTANCE.getPressureSensor();

		/**
		 * The meta object literal for the '{@link sensorProject.impl.PostureSensorImpl <em>Posture Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.impl.PostureSensorImpl
		 * @see sensorProject.impl.SensorProjectPackageImpl#getPostureSensor()
		 * @generated
		 */
		EClass POSTURE_SENSOR = eINSTANCE.getPostureSensor();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTURE_SENSOR__TYPE = eINSTANCE.getPostureSensor_Type();

		/**
		 * The meta object literal for the '{@link sensorProject.impl.TframeSensorImpl <em>Tframe Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.impl.TframeSensorImpl
		 * @see sensorProject.impl.SensorProjectPackageImpl#getTframeSensor()
		 * @generated
		 */
		EClass TFRAME_SENSOR = eINSTANCE.getTframeSensor();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TFRAME_SENSOR__ORIGIN = eINSTANCE.getTframeSensor_Origin();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TFRAME_SENSOR__TARGET = eINSTANCE.getTframeSensor_Target();

		/**
		 * The meta object literal for the '{@link sensorProject.impl.PositionSensorImpl <em>Position Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.impl.PositionSensorImpl
		 * @see sensorProject.impl.SensorProjectPackageImpl#getPositionSensor()
		 * @generated
		 */
		EClass POSITION_SENSOR = eINSTANCE.getPositionSensor();

		/**
		 * The meta object literal for the '{@link sensorProject.impl.VisionSensorImpl <em>Vision Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.impl.VisionSensorImpl
		 * @see sensorProject.impl.SensorProjectPackageImpl#getVisionSensor()
		 * @generated
		 */
		EClass VISION_SENSOR = eINSTANCE.getVisionSensor();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISION_SENSOR__TYPE = eINSTANCE.getVisionSensor_Type();

		/**
		 * The meta object literal for the '<em><b>Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISION_SENSOR__RESOLUTION = eINSTANCE.getVisionSensor_Resolution();

		/**
		 * The meta object literal for the '{@link sensorProject.impl.SpeedSensorImpl <em>Speed Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.impl.SpeedSensorImpl
		 * @see sensorProject.impl.SensorProjectPackageImpl#getSpeedSensor()
		 * @generated
		 */
		EClass SPEED_SENSOR = eINSTANCE.getSpeedSensor();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEED_SENSOR__TYPE = eINSTANCE.getSpeedSensor_Type();

		/**
		 * The meta object literal for the '{@link sensorProject.impl.PressureSensorHeadImpl <em>Pressure Sensor Head</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.impl.PressureSensorHeadImpl
		 * @see sensorProject.impl.SensorProjectPackageImpl#getPressureSensorHead()
		 * @generated
		 */
		EClass PRESSURE_SENSOR_HEAD = eINSTANCE.getPressureSensorHead();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESSURE_SENSOR_HEAD__TYPE = eINSTANCE.getPressureSensorHead_Type();

		/**
		 * The meta object literal for the '{@link sensorProject.impl.PressureSensorHandImpl <em>Pressure Sensor Hand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.impl.PressureSensorHandImpl
		 * @see sensorProject.impl.SensorProjectPackageImpl#getPressureSensorHand()
		 * @generated
		 */
		EClass PRESSURE_SENSOR_HAND = eINSTANCE.getPressureSensorHand();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESSURE_SENSOR_HAND__TYPE = eINSTANCE.getPressureSensorHand_Type();

		/**
		 * The meta object literal for the '{@link sensorProject.impl.PressureSensorFootImpl <em>Pressure Sensor Foot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.impl.PressureSensorFootImpl
		 * @see sensorProject.impl.SensorProjectPackageImpl#getPressureSensorFoot()
		 * @generated
		 */
		EClass PRESSURE_SENSOR_FOOT = eINSTANCE.getPressureSensorFoot();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESSURE_SENSOR_FOOT__TYPE = eINSTANCE.getPressureSensorFoot_Type();

		/**
		 * The meta object literal for the '{@link sensorProject.impl.PositionSensorRobotImpl <em>Position Sensor Robot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.impl.PositionSensorRobotImpl
		 * @see sensorProject.impl.SensorProjectPackageImpl#getPositionSensorRobot()
		 * @generated
		 */
		EClass POSITION_SENSOR_ROBOT = eINSTANCE.getPositionSensorRobot();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION_SENSOR_ROBOT__TYPE = eINSTANCE.getPositionSensorRobot_Type();

		/**
		 * The meta object literal for the '{@link sensorProject.impl.PositionSensorHeadImpl <em>Position Sensor Head</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.impl.PositionSensorHeadImpl
		 * @see sensorProject.impl.SensorProjectPackageImpl#getPositionSensorHead()
		 * @generated
		 */
		EClass POSITION_SENSOR_HEAD = eINSTANCE.getPositionSensorHead();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION_SENSOR_HEAD__TYPE = eINSTANCE.getPositionSensorHead_Type();

		/**
		 * The meta object literal for the '{@link sensorProject.impl.PositionSensorFootImpl <em>Position Sensor Foot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.impl.PositionSensorFootImpl
		 * @see sensorProject.impl.SensorProjectPackageImpl#getPositionSensorFoot()
		 * @generated
		 */
		EClass POSITION_SENSOR_FOOT = eINSTANCE.getPositionSensorFoot();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION_SENSOR_FOOT__TYPE = eINSTANCE.getPositionSensorFoot_Type();

		/**
		 * The meta object literal for the '{@link sensorProject.impl.PositionSensorHandImpl <em>Position Sensor Hand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.impl.PositionSensorHandImpl
		 * @see sensorProject.impl.SensorProjectPackageImpl#getPositionSensorHand()
		 * @generated
		 */
		EClass POSITION_SENSOR_HAND = eINSTANCE.getPositionSensorHand();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION_SENSOR_HAND__TYPE = eINSTANCE.getPositionSensorHand_Type();

		/**
		 * The meta object literal for the '{@link sensorProject.VisionID <em>Vision ID</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.VisionID
		 * @see sensorProject.impl.SensorProjectPackageImpl#getVisionID()
		 * @generated
		 */
		EEnum VISION_ID = eINSTANCE.getVisionID();

		/**
		 * The meta object literal for the '{@link sensorProject.ResolutionID <em>Resolution ID</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.ResolutionID
		 * @see sensorProject.impl.SensorProjectPackageImpl#getResolutionID()
		 * @generated
		 */
		EEnum RESOLUTION_ID = eINSTANCE.getResolutionID();

		/**
		 * The meta object literal for the '{@link sensorProject.DistanceID <em>Distance ID</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.DistanceID
		 * @see sensorProject.impl.SensorProjectPackageImpl#getDistanceID()
		 * @generated
		 */
		EEnum DISTANCE_ID = eINSTANCE.getDistanceID();

		/**
		 * The meta object literal for the '{@link sensorProject.PositionID_Robot <em>Position ID Robot</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.PositionID_Robot
		 * @see sensorProject.impl.SensorProjectPackageImpl#getPositionID_Robot()
		 * @generated
		 */
		EEnum POSITION_ID_ROBOT = eINSTANCE.getPositionID_Robot();

		/**
		 * The meta object literal for the '{@link sensorProject.Category <em>Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.Category
		 * @see sensorProject.impl.SensorProjectPackageImpl#getCategory()
		 * @generated
		 */
		EEnum CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '{@link sensorProject.ElectricID <em>Electric ID</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.ElectricID
		 * @see sensorProject.impl.SensorProjectPackageImpl#getElectricID()
		 * @generated
		 */
		EEnum ELECTRIC_ID = eINSTANCE.getElectricID();

		/**
		 * The meta object literal for the '{@link sensorProject.SpeedID <em>Speed ID</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.SpeedID
		 * @see sensorProject.impl.SensorProjectPackageImpl#getSpeedID()
		 * @generated
		 */
		EEnum SPEED_ID = eINSTANCE.getSpeedID();

		/**
		 * The meta object literal for the '{@link sensorProject.PostureID <em>Posture ID</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.PostureID
		 * @see sensorProject.impl.SensorProjectPackageImpl#getPostureID()
		 * @generated
		 */
		EEnum POSTURE_ID = eINSTANCE.getPostureID();

		/**
		 * The meta object literal for the '{@link sensorProject.PositionID_Hand <em>Position ID Hand</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.PositionID_Hand
		 * @see sensorProject.impl.SensorProjectPackageImpl#getPositionID_Hand()
		 * @generated
		 */
		EEnum POSITION_ID_HAND = eINSTANCE.getPositionID_Hand();

		/**
		 * The meta object literal for the '{@link sensorProject.AcousticID <em>Acoustic ID</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.AcousticID
		 * @see sensorProject.impl.SensorProjectPackageImpl#getAcousticID()
		 * @generated
		 */
		EEnum ACOUSTIC_ID = eINSTANCE.getAcousticID();

		/**
		 * The meta object literal for the '{@link sensorProject.PositionID_Head <em>Position ID Head</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.PositionID_Head
		 * @see sensorProject.impl.SensorProjectPackageImpl#getPositionID_Head()
		 * @generated
		 */
		EEnum POSITION_ID_HEAD = eINSTANCE.getPositionID_Head();

		/**
		 * The meta object literal for the '{@link sensorProject.PositionID_Foot <em>Position ID Foot</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.PositionID_Foot
		 * @see sensorProject.impl.SensorProjectPackageImpl#getPositionID_Foot()
		 * @generated
		 */
		EEnum POSITION_ID_FOOT = eINSTANCE.getPositionID_Foot();

		/**
		 * The meta object literal for the '{@link sensorProject.TframeOrigins <em>Tframe Origins</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.TframeOrigins
		 * @see sensorProject.impl.SensorProjectPackageImpl#getTframeOrigins()
		 * @generated
		 */
		EEnum TFRAME_ORIGINS = eINSTANCE.getTframeOrigins();

		/**
		 * The meta object literal for the '{@link sensorProject.TframeTargets <em>Tframe Targets</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.TframeTargets
		 * @see sensorProject.impl.SensorProjectPackageImpl#getTframeTargets()
		 * @generated
		 */
		EEnum TFRAME_TARGETS = eINSTANCE.getTframeTargets();

		/**
		 * The meta object literal for the '{@link sensorProject.PressureID_Head <em>Pressure ID Head</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.PressureID_Head
		 * @see sensorProject.impl.SensorProjectPackageImpl#getPressureID_Head()
		 * @generated
		 */
		EEnum PRESSURE_ID_HEAD = eINSTANCE.getPressureID_Head();

		/**
		 * The meta object literal for the '{@link sensorProject.PressureID_Hand <em>Pressure ID Hand</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.PressureID_Hand
		 * @see sensorProject.impl.SensorProjectPackageImpl#getPressureID_Hand()
		 * @generated
		 */
		EEnum PRESSURE_ID_HAND = eINSTANCE.getPressureID_Hand();

		/**
		 * The meta object literal for the '{@link sensorProject.PressureID_Foot <em>Pressure ID Foot</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.PressureID_Foot
		 * @see sensorProject.impl.SensorProjectPackageImpl#getPressureID_Foot()
		 * @generated
		 */
		EEnum PRESSURE_ID_FOOT = eINSTANCE.getPressureID_Foot();

		/**
		 * The meta object literal for the '{@link sensorProject.AcousticTimeID <em>Acoustic Time ID</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensorProject.AcousticTimeID
		 * @see sensorProject.impl.SensorProjectPackageImpl#getAcousticTimeID()
		 * @generated
		 */
		EEnum ACOUSTIC_TIME_ID = eINSTANCE.getAcousticTimeID();

	}

} //SensorProjectPackage
