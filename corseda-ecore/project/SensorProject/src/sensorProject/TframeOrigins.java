/**
 */
package sensorProject;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tframe Origins</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see sensorProject.SensorProjectPackage#getTframeOrigins()
 * @model
 * @generated
 */
public enum TframeOrigins implements Enumerator {
	/**
	 * The '<em><b>BATTERY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BATTERY_VALUE
	 * @generated
	 * @ordered
	 */
	BATTERY(0, "BATTERY", "BATTERY"),

	/**
	 * The '<em><b>ACCELEROMETER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCELEROMETER_VALUE
	 * @generated
	 * @ordered
	 */
	ACCELEROMETER(1, "ACCELEROMETER", "ACCELEROMETER"),

	/**
	 * The '<em><b>CAMERABOTTOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAMERABOTTOM_VALUE
	 * @generated
	 * @ordered
	 */
	CAMERABOTTOM(2, "CAMERABOTTOM", "CAMERABOTTOM"),

	/**
	 * The '<em><b>CAMERATOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAMERATOP_VALUE
	 * @generated
	 * @ordered
	 */
	CAMERATOP(3, "CAMERATOP", "CAMERATOP"),

	/**
	 * The '<em><b>HEAD TOUCH FRONT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAD_TOUCH_FRONT_VALUE
	 * @generated
	 * @ordered
	 */
	HEAD_TOUCH_FRONT(4, "HEAD_TOUCH_FRONT", "HEAD_TOUCH_FRONT"),

	/**
	 * The '<em><b>HEAD TOUCH MIDDLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAD_TOUCH_MIDDLE_VALUE
	 * @generated
	 * @ordered
	 */
	HEAD_TOUCH_MIDDLE(5, "HEAD_TOUCH_MIDDLE", "HEAD_TOUCH_MIDDLE"),

	/**
	 * The '<em><b>HEAD TOUCH REAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAD_TOUCH_REAR_VALUE
	 * @generated
	 * @ordered
	 */
	HEAD_TOUCH_REAR(6, "HEAD_TOUCH_REAR", "HEAD_TOUCH_REAR"),

	/**
	 * The '<em><b>LFOOT BUMBER LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LFOOT_BUMBER_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	LFOOT_BUMBER_LEFT(7, "LFOOT_BUMBER_LEFT", "LFOOT_BUMBER_LEFT"),

	/**
	 * The '<em><b>LFOOT BUMBER RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LFOOT_BUMBER_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	LFOOT_BUMBER_RIGHT(8, "LFOOT_BUMBER_RIGHT", "LFOOT_BUMBER_RIGHT"),

	/**
	 * The '<em><b>MICFRONT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICFRONT_VALUE
	 * @generated
	 * @ordered
	 */
	MICFRONT(9, "MICFRONT", "MICFRONT"),

	/**
	 * The '<em><b>MICREAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICREAR_VALUE
	 * @generated
	 * @ordered
	 */
	MICREAR(10, "MICREAR", "MICREAR"),

	/**
	 * The '<em><b>MICLEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICLEFT_VALUE
	 * @generated
	 * @ordered
	 */
	MICLEFT(11, "MICLEFT", "MICLEFT"),

	/**
	 * The '<em><b>MICRIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICRIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	MICRIGHT(12, "MICRIGHT", "MICRIGHT"),

	/**
	 * The '<em><b>RFOOT BUMBER LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RFOOT_BUMBER_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	RFOOT_BUMBER_LEFT(13, "RFOOT_BUMBER_LEFT", "RFOOT_BUMBER_LEFT"),

	/**
	 * The '<em><b>RFOOT BUMBER RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RFOOT_BUMBER_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	RFOOT_BUMBER_RIGHT(14, "RFOOT_BUMBER_RIGHT", "RFOOT_BUMBER_RIGHT"),

	/**
	 * The '<em><b>LHAND TOUCH BACK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LHAND_TOUCH_BACK_VALUE
	 * @generated
	 * @ordered
	 */
	LHAND_TOUCH_BACK(15, "LHAND_TOUCH_BACK", "LHAND_TOUCH_BACK"),

	/**
	 * The '<em><b>LHAND TOUCH LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LHAND_TOUCH_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	LHAND_TOUCH_LEFT(16, "LHAND_TOUCH_LEFT", "LHAND_TOUCH_LEFT"),

	/**
	 * The '<em><b>LHAND TOUCH RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LHAND_TOUCH_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	LHAND_TOUCH_RIGHT(17, "LHAND_TOUCH_RIGHT", "LHAND_TOUCH_RIGHT"),

	/**
	 * The '<em><b>RHAND TOUCH BACK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RHAND_TOUCH_BACK_VALUE
	 * @generated
	 * @ordered
	 */
	RHAND_TOUCH_BACK(18, "RHAND_TOUCH_BACK", "RHAND_TOUCH_BACK"),

	/**
	 * The '<em><b>RHAND TOUCH LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RHAND_TOUCH_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	RHAND_TOUCH_LEFT(19, "RHAND_TOUCH_LEFT", "RHAND_TOUCH_LEFT"),

	/**
	 * The '<em><b>RHAND TOUCH RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RHAND_TOUCH_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	RHAND_TOUCH_RIGHT(20, "RHAND_TOUCH_RIGHT", "RHAND_TOUCH_RIGHT"),

	/**
	 * The '<em><b>SONAR LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SONAR_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	SONAR_LEFT(21, "SONAR_LEFT", "SONAR_LEFT"),

	/**
	 * The '<em><b>SONAR RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SONAR_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	SONAR_RIGHT(22, "SONAR_RIGHT", "SONAR_RIGHT"),

	/**
	 * The '<em><b>HEADYAW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEADYAW_VALUE
	 * @generated
	 * @ordered
	 */
	HEADYAW(23, "HEADYAW", "HEADYAW"),

	/**
	 * The '<em><b>HEADPITCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEADPITCH_VALUE
	 * @generated
	 * @ordered
	 */
	HEADPITCH(24, "HEADPITCH", "HEADPITCH"),

	/**
	 * The '<em><b>LSHOULDERPITCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LSHOULDERPITCH_VALUE
	 * @generated
	 * @ordered
	 */
	LSHOULDERPITCH(25, "LSHOULDERPITCH", "LSHOULDERPITCH"),

	/**
	 * The '<em><b>LSHOULDERROLL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LSHOULDERROLL_VALUE
	 * @generated
	 * @ordered
	 */
	LSHOULDERROLL(26, "LSHOULDERROLL", "LSHOULDERROLL"),

	/**
	 * The '<em><b>LELBOWYAW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LELBOWYAW_VALUE
	 * @generated
	 * @ordered
	 */
	LELBOWYAW(27, "LELBOWYAW", "LELBOWYAW"),

	/**
	 * The '<em><b>RSHOULDERPITCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RSHOULDERPITCH_VALUE
	 * @generated
	 * @ordered
	 */
	RSHOULDERPITCH(28, "RSHOULDERPITCH", "RSHOULDERPITCH"),

	/**
	 * The '<em><b>RSHOULDERROLL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RSHOULDERROLL_VALUE
	 * @generated
	 * @ordered
	 */
	RSHOULDERROLL(29, "RSHOULDERROLL", "RSHOULDERROLL"),

	/**
	 * The '<em><b>RELBOWYAW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELBOWYAW_VALUE
	 * @generated
	 * @ordered
	 */
	RELBOWYAW(30, "RELBOWYAW", "RELBOWYAW"),

	/**
	 * The '<em><b>RELBOWROLL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELBOWROLL_VALUE
	 * @generated
	 * @ordered
	 */
	RELBOWROLL(31, "RELBOWROLL", "RELBOWROLL"),

	/**
	 * The '<em><b>RWRISTYAW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RWRISTYAW_VALUE
	 * @generated
	 * @ordered
	 */
	RWRISTYAW(32, "RWRISTYAW", "RWRISTYAW"),

	/**
	 * The '<em><b>LHIPYAWPITCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LHIPYAWPITCH_VALUE
	 * @generated
	 * @ordered
	 */
	LHIPYAWPITCH(33, "LHIPYAWPITCH", "LHIPYAWPITCH"),

	/**
	 * The '<em><b>LHIPROLL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LHIPROLL_VALUE
	 * @generated
	 * @ordered
	 */
	LHIPROLL(34, "LHIPROLL", "LHIPROLL"),

	/**
	 * The '<em><b>LHIPPITCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LHIPPITCH_VALUE
	 * @generated
	 * @ordered
	 */
	LHIPPITCH(35, "LHIPPITCH", "LHIPPITCH"),

	/**
	 * The '<em><b>LKNEEPITCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LKNEEPITCH_VALUE
	 * @generated
	 * @ordered
	 */
	LKNEEPITCH(36, "LKNEEPITCH", "LKNEEPITCH"),

	/**
	 * The '<em><b>LANKLEPITCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LANKLEPITCH_VALUE
	 * @generated
	 * @ordered
	 */
	LANKLEPITCH(37, "LANKLEPITCH", "LANKLEPITCH"),

	/**
	 * The '<em><b>RHIPYAWPITCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RHIPYAWPITCH_VALUE
	 * @generated
	 * @ordered
	 */
	RHIPYAWPITCH(38, "RHIPYAWPITCH", "RHIPYAWPITCH"),

	/**
	 * The '<em><b>RHIPROLL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RHIPROLL_VALUE
	 * @generated
	 * @ordered
	 */
	RHIPROLL(39, "RHIPROLL", "RHIPROLL"),

	/**
	 * The '<em><b>RHIPPITCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RHIPPITCH_VALUE
	 * @generated
	 * @ordered
	 */
	RHIPPITCH(40, "RHIPPITCH", "RHIPPITCH"),

	/**
	 * The '<em><b>RKNEEPITCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RKNEEPITCH_VALUE
	 * @generated
	 * @ordered
	 */
	RKNEEPITCH(41, "RKNEEPITCH", "RKNEEPITCH"),

	/**
	 * The '<em><b>RANKLEROLL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RANKLEROLL_VALUE
	 * @generated
	 * @ordered
	 */
	RANKLEROLL(42, "RANKLEROLL", "RANKLEROLL"),

	/**
	 * The '<em><b>RANKLEPITCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RANKLEPITCH_VALUE
	 * @generated
	 * @ordered
	 */
	RANKLEPITCH(43, "RANKLEPITCH", "RANKLEPITCH"),

	/**
	 * The '<em><b>LANKLEROLL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LANKLEROLL_VALUE
	 * @generated
	 * @ordered
	 */
	LANKLEROLL(44, "LANKLEROLL", "LANKLEROLL"),

	/**
	 * The '<em><b>LELBOWROLL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LELBOWROLL_VALUE
	 * @generated
	 * @ordered
	 */
	LELBOWROLL(45, "LELBOWROLL", "LELBOWROLL"),

	/**
	 * The '<em><b>LWRISTYAW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LWRISTYAW_VALUE
	 * @generated
	 * @ordered
	 */
	LWRISTYAW(46, "LWRISTYAW", "LWRISTYAW");

	/**
	 * The '<em><b>BATTERY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BATTERY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BATTERY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BATTERY_VALUE = 0;

	/**
	 * The '<em><b>ACCELEROMETER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ACCELEROMETER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACCELEROMETER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACCELEROMETER_VALUE = 1;

	/**
	 * The '<em><b>CAMERABOTTOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CAMERABOTTOM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CAMERABOTTOM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CAMERABOTTOM_VALUE = 2;

	/**
	 * The '<em><b>CAMERATOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CAMERATOP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CAMERATOP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CAMERATOP_VALUE = 3;

	/**
	 * The '<em><b>HEAD TOUCH FRONT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HEAD TOUCH FRONT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEAD_TOUCH_FRONT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEAD_TOUCH_FRONT_VALUE = 4;

	/**
	 * The '<em><b>HEAD TOUCH MIDDLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HEAD TOUCH MIDDLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEAD_TOUCH_MIDDLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEAD_TOUCH_MIDDLE_VALUE = 5;

	/**
	 * The '<em><b>HEAD TOUCH REAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HEAD TOUCH REAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEAD_TOUCH_REAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEAD_TOUCH_REAR_VALUE = 6;

	/**
	 * The '<em><b>LFOOT BUMBER LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LFOOT BUMBER LEFT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LFOOT_BUMBER_LEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LFOOT_BUMBER_LEFT_VALUE = 7;

	/**
	 * The '<em><b>LFOOT BUMBER RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LFOOT BUMBER RIGHT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LFOOT_BUMBER_RIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LFOOT_BUMBER_RIGHT_VALUE = 8;

	/**
	 * The '<em><b>MICFRONT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MICFRONT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MICFRONT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MICFRONT_VALUE = 9;

	/**
	 * The '<em><b>MICREAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MICREAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MICREAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MICREAR_VALUE = 10;

	/**
	 * The '<em><b>MICLEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MICLEFT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MICLEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MICLEFT_VALUE = 11;

	/**
	 * The '<em><b>MICRIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MICRIGHT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MICRIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MICRIGHT_VALUE = 12;

	/**
	 * The '<em><b>RFOOT BUMBER LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RFOOT BUMBER LEFT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RFOOT_BUMBER_LEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RFOOT_BUMBER_LEFT_VALUE = 13;

	/**
	 * The '<em><b>RFOOT BUMBER RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RFOOT BUMBER RIGHT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RFOOT_BUMBER_RIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RFOOT_BUMBER_RIGHT_VALUE = 14;

	/**
	 * The '<em><b>LHAND TOUCH BACK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LHAND TOUCH BACK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LHAND_TOUCH_BACK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LHAND_TOUCH_BACK_VALUE = 15;

	/**
	 * The '<em><b>LHAND TOUCH LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LHAND TOUCH LEFT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LHAND_TOUCH_LEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LHAND_TOUCH_LEFT_VALUE = 16;

	/**
	 * The '<em><b>LHAND TOUCH RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LHAND TOUCH RIGHT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LHAND_TOUCH_RIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LHAND_TOUCH_RIGHT_VALUE = 17;

	/**
	 * The '<em><b>RHAND TOUCH BACK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RHAND TOUCH BACK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RHAND_TOUCH_BACK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RHAND_TOUCH_BACK_VALUE = 18;

	/**
	 * The '<em><b>RHAND TOUCH LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RHAND TOUCH LEFT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RHAND_TOUCH_LEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RHAND_TOUCH_LEFT_VALUE = 19;

	/**
	 * The '<em><b>RHAND TOUCH RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RHAND TOUCH RIGHT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RHAND_TOUCH_RIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RHAND_TOUCH_RIGHT_VALUE = 20;

	/**
	 * The '<em><b>SONAR LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SONAR LEFT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SONAR_LEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SONAR_LEFT_VALUE = 21;

	/**
	 * The '<em><b>SONAR RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SONAR RIGHT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SONAR_RIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SONAR_RIGHT_VALUE = 22;

	/**
	 * The '<em><b>HEADYAW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HEADYAW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEADYAW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEADYAW_VALUE = 23;

	/**
	 * The '<em><b>HEADPITCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HEADPITCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEADPITCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEADPITCH_VALUE = 24;

	/**
	 * The '<em><b>LSHOULDERPITCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LSHOULDERPITCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LSHOULDERPITCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LSHOULDERPITCH_VALUE = 25;

	/**
	 * The '<em><b>LSHOULDERROLL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LSHOULDERROLL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LSHOULDERROLL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LSHOULDERROLL_VALUE = 26;

	/**
	 * The '<em><b>LELBOWYAW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LELBOWYAW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LELBOWYAW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LELBOWYAW_VALUE = 27;

	/**
	 * The '<em><b>RSHOULDERPITCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RSHOULDERPITCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RSHOULDERPITCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RSHOULDERPITCH_VALUE = 28;

	/**
	 * The '<em><b>RSHOULDERROLL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RSHOULDERROLL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RSHOULDERROLL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RSHOULDERROLL_VALUE = 29;

	/**
	 * The '<em><b>RELBOWYAW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RELBOWYAW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RELBOWYAW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RELBOWYAW_VALUE = 30;

	/**
	 * The '<em><b>RELBOWROLL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RELBOWROLL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RELBOWROLL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RELBOWROLL_VALUE = 31;

	/**
	 * The '<em><b>RWRISTYAW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RWRISTYAW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RWRISTYAW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RWRISTYAW_VALUE = 32;

	/**
	 * The '<em><b>LHIPYAWPITCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LHIPYAWPITCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LHIPYAWPITCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LHIPYAWPITCH_VALUE = 33;

	/**
	 * The '<em><b>LHIPROLL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LHIPROLL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LHIPROLL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LHIPROLL_VALUE = 34;

	/**
	 * The '<em><b>LHIPPITCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LHIPPITCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LHIPPITCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LHIPPITCH_VALUE = 35;

	/**
	 * The '<em><b>LKNEEPITCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LKNEEPITCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LKNEEPITCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LKNEEPITCH_VALUE = 36;

	/**
	 * The '<em><b>LANKLEPITCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LANKLEPITCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LANKLEPITCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LANKLEPITCH_VALUE = 37;

	/**
	 * The '<em><b>RHIPYAWPITCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RHIPYAWPITCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RHIPYAWPITCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RHIPYAWPITCH_VALUE = 38;

	/**
	 * The '<em><b>RHIPROLL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RHIPROLL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RHIPROLL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RHIPROLL_VALUE = 39;

	/**
	 * The '<em><b>RHIPPITCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RHIPPITCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RHIPPITCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RHIPPITCH_VALUE = 40;

	/**
	 * The '<em><b>RKNEEPITCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RKNEEPITCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RKNEEPITCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RKNEEPITCH_VALUE = 41;

	/**
	 * The '<em><b>RANKLEROLL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RANKLEROLL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RANKLEROLL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RANKLEROLL_VALUE = 42;

	/**
	 * The '<em><b>RANKLEPITCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RANKLEPITCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RANKLEPITCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RANKLEPITCH_VALUE = 43;

	/**
	 * The '<em><b>LANKLEROLL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LANKLEROLL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LANKLEROLL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LANKLEROLL_VALUE = 44;

	/**
	 * The '<em><b>LELBOWROLL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LELBOWROLL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LELBOWROLL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LELBOWROLL_VALUE = 45;

	/**
	 * The '<em><b>LWRISTYAW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LWRISTYAW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LWRISTYAW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LWRISTYAW_VALUE = 46;

	/**
	 * An array of all the '<em><b>Tframe Origins</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TframeOrigins[] VALUES_ARRAY = new TframeOrigins[] { BATTERY, ACCELEROMETER, CAMERABOTTOM,
			CAMERATOP, HEAD_TOUCH_FRONT, HEAD_TOUCH_MIDDLE, HEAD_TOUCH_REAR, LFOOT_BUMBER_LEFT, LFOOT_BUMBER_RIGHT,
			MICFRONT, MICREAR, MICLEFT, MICRIGHT, RFOOT_BUMBER_LEFT, RFOOT_BUMBER_RIGHT, LHAND_TOUCH_BACK,
			LHAND_TOUCH_LEFT, LHAND_TOUCH_RIGHT, RHAND_TOUCH_BACK, RHAND_TOUCH_LEFT, RHAND_TOUCH_RIGHT, SONAR_LEFT,
			SONAR_RIGHT, HEADYAW, HEADPITCH, LSHOULDERPITCH, LSHOULDERROLL, LELBOWYAW, RSHOULDERPITCH, RSHOULDERROLL,
			RELBOWYAW, RELBOWROLL, RWRISTYAW, LHIPYAWPITCH, LHIPROLL, LHIPPITCH, LKNEEPITCH, LANKLEPITCH, RHIPYAWPITCH,
			RHIPROLL, RHIPPITCH, RKNEEPITCH, RANKLEROLL, RANKLEPITCH, LANKLEROLL, LELBOWROLL, LWRISTYAW, };

	/**
	 * A public read-only list of all the '<em><b>Tframe Origins</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TframeOrigins> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tframe Origins</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TframeOrigins get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TframeOrigins result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tframe Origins</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TframeOrigins getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TframeOrigins result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tframe Origins</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TframeOrigins get(int value) {
		switch (value) {
		case BATTERY_VALUE:
			return BATTERY;
		case ACCELEROMETER_VALUE:
			return ACCELEROMETER;
		case CAMERABOTTOM_VALUE:
			return CAMERABOTTOM;
		case CAMERATOP_VALUE:
			return CAMERATOP;
		case HEAD_TOUCH_FRONT_VALUE:
			return HEAD_TOUCH_FRONT;
		case HEAD_TOUCH_MIDDLE_VALUE:
			return HEAD_TOUCH_MIDDLE;
		case HEAD_TOUCH_REAR_VALUE:
			return HEAD_TOUCH_REAR;
		case LFOOT_BUMBER_LEFT_VALUE:
			return LFOOT_BUMBER_LEFT;
		case LFOOT_BUMBER_RIGHT_VALUE:
			return LFOOT_BUMBER_RIGHT;
		case MICFRONT_VALUE:
			return MICFRONT;
		case MICREAR_VALUE:
			return MICREAR;
		case MICLEFT_VALUE:
			return MICLEFT;
		case MICRIGHT_VALUE:
			return MICRIGHT;
		case RFOOT_BUMBER_LEFT_VALUE:
			return RFOOT_BUMBER_LEFT;
		case RFOOT_BUMBER_RIGHT_VALUE:
			return RFOOT_BUMBER_RIGHT;
		case LHAND_TOUCH_BACK_VALUE:
			return LHAND_TOUCH_BACK;
		case LHAND_TOUCH_LEFT_VALUE:
			return LHAND_TOUCH_LEFT;
		case LHAND_TOUCH_RIGHT_VALUE:
			return LHAND_TOUCH_RIGHT;
		case RHAND_TOUCH_BACK_VALUE:
			return RHAND_TOUCH_BACK;
		case RHAND_TOUCH_LEFT_VALUE:
			return RHAND_TOUCH_LEFT;
		case RHAND_TOUCH_RIGHT_VALUE:
			return RHAND_TOUCH_RIGHT;
		case SONAR_LEFT_VALUE:
			return SONAR_LEFT;
		case SONAR_RIGHT_VALUE:
			return SONAR_RIGHT;
		case HEADYAW_VALUE:
			return HEADYAW;
		case HEADPITCH_VALUE:
			return HEADPITCH;
		case LSHOULDERPITCH_VALUE:
			return LSHOULDERPITCH;
		case LSHOULDERROLL_VALUE:
			return LSHOULDERROLL;
		case LELBOWYAW_VALUE:
			return LELBOWYAW;
		case RSHOULDERPITCH_VALUE:
			return RSHOULDERPITCH;
		case RSHOULDERROLL_VALUE:
			return RSHOULDERROLL;
		case RELBOWYAW_VALUE:
			return RELBOWYAW;
		case RELBOWROLL_VALUE:
			return RELBOWROLL;
		case RWRISTYAW_VALUE:
			return RWRISTYAW;
		case LHIPYAWPITCH_VALUE:
			return LHIPYAWPITCH;
		case LHIPROLL_VALUE:
			return LHIPROLL;
		case LHIPPITCH_VALUE:
			return LHIPPITCH;
		case LKNEEPITCH_VALUE:
			return LKNEEPITCH;
		case LANKLEPITCH_VALUE:
			return LANKLEPITCH;
		case RHIPYAWPITCH_VALUE:
			return RHIPYAWPITCH;
		case RHIPROLL_VALUE:
			return RHIPROLL;
		case RHIPPITCH_VALUE:
			return RHIPPITCH;
		case RKNEEPITCH_VALUE:
			return RKNEEPITCH;
		case RANKLEROLL_VALUE:
			return RANKLEROLL;
		case RANKLEPITCH_VALUE:
			return RANKLEPITCH;
		case LANKLEROLL_VALUE:
			return LANKLEROLL;
		case LELBOWROLL_VALUE:
			return LELBOWROLL;
		case LWRISTYAW_VALUE:
			return LWRISTYAW;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TframeOrigins(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //TframeOrigins
