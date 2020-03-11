/**
 */
package sensorProject.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sensorProject.SensorProjectPackage;
import sensorProject.TframeOrigins;
import sensorProject.TframeSensor;
import sensorProject.TframeTargets;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tframe Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sensorProject.impl.TframeSensorImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link sensorProject.impl.TframeSensorImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TframeSensorImpl extends PositionSensorImpl implements TframeSensor {
	/**
	 * The default value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final TframeOrigins ORIGIN_EDEFAULT = TframeOrigins.BATTERY;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected TframeOrigins origin = ORIGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final TframeTargets TARGET_EDEFAULT = TframeTargets.FRAME_ROBOT;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TframeTargets target = TARGET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TframeSensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SensorProjectPackage.Literals.TFRAME_SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TframeOrigins getOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigin(TframeOrigins newOrigin) {
		TframeOrigins oldOrigin = origin;
		origin = newOrigin == null ? ORIGIN_EDEFAULT : newOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorProjectPackage.TFRAME_SENSOR__ORIGIN, oldOrigin,
					origin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TframeTargets getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(TframeTargets newTarget) {
		TframeTargets oldTarget = target;
		target = newTarget == null ? TARGET_EDEFAULT : newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorProjectPackage.TFRAME_SENSOR__TARGET, oldTarget,
					target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SensorProjectPackage.TFRAME_SENSOR__ORIGIN:
			return getOrigin();
		case SensorProjectPackage.TFRAME_SENSOR__TARGET:
			return getTarget();
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
		case SensorProjectPackage.TFRAME_SENSOR__ORIGIN:
			setOrigin((TframeOrigins) newValue);
			return;
		case SensorProjectPackage.TFRAME_SENSOR__TARGET:
			setTarget((TframeTargets) newValue);
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
		case SensorProjectPackage.TFRAME_SENSOR__ORIGIN:
			setOrigin(ORIGIN_EDEFAULT);
			return;
		case SensorProjectPackage.TFRAME_SENSOR__TARGET:
			setTarget(TARGET_EDEFAULT);
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
		case SensorProjectPackage.TFRAME_SENSOR__ORIGIN:
			return origin != ORIGIN_EDEFAULT;
		case SensorProjectPackage.TFRAME_SENSOR__TARGET:
			return target != TARGET_EDEFAULT;
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
		result.append(" (origin: ");
		result.append(origin);
		result.append(", target: ");
		result.append(target);
		result.append(')');
		return result.toString();
	}

} //TframeSensorImpl
