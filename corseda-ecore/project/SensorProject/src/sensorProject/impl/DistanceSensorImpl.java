/**
 */
package sensorProject.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sensorProject.DistanceID;
import sensorProject.DistanceSensor;
import sensorProject.SensorProjectPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distance Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sensorProject.impl.DistanceSensorImpl#getMaxDistanceAccepted <em>Max Distance Accepted</em>}</li>
 *   <li>{@link sensorProject.impl.DistanceSensorImpl#getMinDistanceAccepted <em>Min Distance Accepted</em>}</li>
 *   <li>{@link sensorProject.impl.DistanceSensorImpl#getType <em>Type</em>}</li>
 *   <li>{@link sensorProject.impl.DistanceSensorImpl#getAlarmValue <em>Alarm Value</em>}</li>
 *   <li>{@link sensorProject.impl.DistanceSensorImpl#isNotifications <em>Notifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DistanceSensorImpl extends SensorImpl implements DistanceSensor {
	/**
	 * The default value of the '{@link #getMaxDistanceAccepted() <em>Max Distance Accepted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDistanceAccepted()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_DISTANCE_ACCEPTED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxDistanceAccepted() <em>Max Distance Accepted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDistanceAccepted()
	 * @generated
	 * @ordered
	 */
	protected double maxDistanceAccepted = MAX_DISTANCE_ACCEPTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinDistanceAccepted() <em>Min Distance Accepted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinDistanceAccepted()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_DISTANCE_ACCEPTED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinDistanceAccepted() <em>Min Distance Accepted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinDistanceAccepted()
	 * @generated
	 * @ordered
	 */
	protected double minDistanceAccepted = MIN_DISTANCE_ACCEPTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final DistanceID TYPE_EDEFAULT = DistanceID.RIGHT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DistanceID type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlarmValue() <em>Alarm Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmValue()
	 * @generated
	 * @ordered
	 */
	protected static final double ALARM_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAlarmValue() <em>Alarm Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmValue()
	 * @generated
	 * @ordered
	 */
	protected double alarmValue = ALARM_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isNotifications() <em>Notifications</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotifications()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NOTIFICATIONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNotifications() <em>Notifications</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotifications()
	 * @generated
	 * @ordered
	 */
	protected boolean notifications = NOTIFICATIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistanceSensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SensorProjectPackage.Literals.DISTANCE_SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxDistanceAccepted() {
		return maxDistanceAccepted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxDistanceAccepted(double newMaxDistanceAccepted) {
		double oldMaxDistanceAccepted = maxDistanceAccepted;
		maxDistanceAccepted = newMaxDistanceAccepted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SensorProjectPackage.DISTANCE_SENSOR__MAX_DISTANCE_ACCEPTED, oldMaxDistanceAccepted,
					maxDistanceAccepted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinDistanceAccepted() {
		return minDistanceAccepted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinDistanceAccepted(double newMinDistanceAccepted) {
		double oldMinDistanceAccepted = minDistanceAccepted;
		minDistanceAccepted = newMinDistanceAccepted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SensorProjectPackage.DISTANCE_SENSOR__MIN_DISTANCE_ACCEPTED, oldMinDistanceAccepted,
					minDistanceAccepted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistanceID getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DistanceID newType) {
		DistanceID oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorProjectPackage.DISTANCE_SENSOR__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAlarmValue() {
		return alarmValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlarmValue(double newAlarmValue) {
		double oldAlarmValue = alarmValue;
		alarmValue = newAlarmValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorProjectPackage.DISTANCE_SENSOR__ALARM_VALUE,
					oldAlarmValue, alarmValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNotifications() {
		return notifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotifications(boolean newNotifications) {
		boolean oldNotifications = notifications;
		notifications = newNotifications;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorProjectPackage.DISTANCE_SENSOR__NOTIFICATIONS,
					oldNotifications, notifications));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SensorProjectPackage.DISTANCE_SENSOR__MAX_DISTANCE_ACCEPTED:
			return getMaxDistanceAccepted();
		case SensorProjectPackage.DISTANCE_SENSOR__MIN_DISTANCE_ACCEPTED:
			return getMinDistanceAccepted();
		case SensorProjectPackage.DISTANCE_SENSOR__TYPE:
			return getType();
		case SensorProjectPackage.DISTANCE_SENSOR__ALARM_VALUE:
			return getAlarmValue();
		case SensorProjectPackage.DISTANCE_SENSOR__NOTIFICATIONS:
			return isNotifications();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SensorProjectPackage.DISTANCE_SENSOR__MAX_DISTANCE_ACCEPTED:
			setMaxDistanceAccepted((Double) newValue);
			return;
		case SensorProjectPackage.DISTANCE_SENSOR__MIN_DISTANCE_ACCEPTED:
			setMinDistanceAccepted((Double) newValue);
			return;
		case SensorProjectPackage.DISTANCE_SENSOR__TYPE:
			setType((DistanceID) newValue);
			return;
		case SensorProjectPackage.DISTANCE_SENSOR__ALARM_VALUE:
			setAlarmValue((Double) newValue);
			return;
		case SensorProjectPackage.DISTANCE_SENSOR__NOTIFICATIONS:
			setNotifications((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SensorProjectPackage.DISTANCE_SENSOR__MAX_DISTANCE_ACCEPTED:
			setMaxDistanceAccepted(MAX_DISTANCE_ACCEPTED_EDEFAULT);
			return;
		case SensorProjectPackage.DISTANCE_SENSOR__MIN_DISTANCE_ACCEPTED:
			setMinDistanceAccepted(MIN_DISTANCE_ACCEPTED_EDEFAULT);
			return;
		case SensorProjectPackage.DISTANCE_SENSOR__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case SensorProjectPackage.DISTANCE_SENSOR__ALARM_VALUE:
			setAlarmValue(ALARM_VALUE_EDEFAULT);
			return;
		case SensorProjectPackage.DISTANCE_SENSOR__NOTIFICATIONS:
			setNotifications(NOTIFICATIONS_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SensorProjectPackage.DISTANCE_SENSOR__MAX_DISTANCE_ACCEPTED:
			return maxDistanceAccepted != MAX_DISTANCE_ACCEPTED_EDEFAULT;
		case SensorProjectPackage.DISTANCE_SENSOR__MIN_DISTANCE_ACCEPTED:
			return minDistanceAccepted != MIN_DISTANCE_ACCEPTED_EDEFAULT;
		case SensorProjectPackage.DISTANCE_SENSOR__TYPE:
			return type != TYPE_EDEFAULT;
		case SensorProjectPackage.DISTANCE_SENSOR__ALARM_VALUE:
			return alarmValue != ALARM_VALUE_EDEFAULT;
		case SensorProjectPackage.DISTANCE_SENSOR__NOTIFICATIONS:
			return notifications != NOTIFICATIONS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (maxDistanceAccepted: ");
		result.append(maxDistanceAccepted);
		result.append(", minDistanceAccepted: ");
		result.append(minDistanceAccepted);
		result.append(", type: ");
		result.append(type);
		result.append(", alarmValue: ");
		result.append(alarmValue);
		result.append(", notifications: ");
		result.append(notifications);
		result.append(')');
		return result.toString();
	}

} //DistanceSensorImpl
