/**
 */
package sensorProject.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sensorProject.AcousticTimeID;
import sensorProject.SensorProjectPackage;
import sensorProject.SensorSystem;
import sensorProject.SubSystem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sensorProject.impl.SensorSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link sensorProject.impl.SensorSystemImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link sensorProject.impl.SensorSystemImpl#getHasSubsystem <em>Has Subsystem</em>}</li>
 *   <li>{@link sensorProject.impl.SensorSystemImpl#getTimeFormat <em>Time Format</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorSystemImpl extends MinimalEObjectImpl.Container implements SensorSystem {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final double DURATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected double duration = DURATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasSubsystem() <em>Has Subsystem</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSubsystem()
	 * @generated
	 * @ordered
	 */
	protected EList<SubSystem> hasSubsystem;

	/**
	 * The default value of the '{@link #getTimeFormat() <em>Time Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeFormat()
	 * @generated
	 * @ordered
	 */
	protected static final AcousticTimeID TIME_FORMAT_EDEFAULT = AcousticTimeID.SECONDS;

	/**
	 * The cached value of the '{@link #getTimeFormat() <em>Time Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeFormat()
	 * @generated
	 * @ordered
	 */
	protected AcousticTimeID timeFormat = TIME_FORMAT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SensorProjectPackage.Literals.SENSOR_SYSTEM;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorProjectPackage.SENSOR_SYSTEM__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(double newDuration) {
		double oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorProjectPackage.SENSOR_SYSTEM__DURATION,
					oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubSystem> getHasSubsystem() {
		if (hasSubsystem == null) {
			hasSubsystem = new EObjectContainmentEList<SubSystem>(SubSystem.class, this,
					SensorProjectPackage.SENSOR_SYSTEM__HAS_SUBSYSTEM);
		}
		return hasSubsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcousticTimeID getTimeFormat() {
		return timeFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeFormat(AcousticTimeID newTimeFormat) {
		AcousticTimeID oldTimeFormat = timeFormat;
		timeFormat = newTimeFormat == null ? TIME_FORMAT_EDEFAULT : newTimeFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorProjectPackage.SENSOR_SYSTEM__TIME_FORMAT,
					oldTimeFormat, timeFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SensorProjectPackage.SENSOR_SYSTEM__HAS_SUBSYSTEM:
			return ((InternalEList<?>) getHasSubsystem()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SensorProjectPackage.SENSOR_SYSTEM__NAME:
			return getName();
		case SensorProjectPackage.SENSOR_SYSTEM__DURATION:
			return getDuration();
		case SensorProjectPackage.SENSOR_SYSTEM__HAS_SUBSYSTEM:
			return getHasSubsystem();
		case SensorProjectPackage.SENSOR_SYSTEM__TIME_FORMAT:
			return getTimeFormat();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SensorProjectPackage.SENSOR_SYSTEM__NAME:
			setName((String) newValue);
			return;
		case SensorProjectPackage.SENSOR_SYSTEM__DURATION:
			setDuration((Double) newValue);
			return;
		case SensorProjectPackage.SENSOR_SYSTEM__HAS_SUBSYSTEM:
			getHasSubsystem().clear();
			getHasSubsystem().addAll((Collection<? extends SubSystem>) newValue);
			return;
		case SensorProjectPackage.SENSOR_SYSTEM__TIME_FORMAT:
			setTimeFormat((AcousticTimeID) newValue);
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
		case SensorProjectPackage.SENSOR_SYSTEM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SensorProjectPackage.SENSOR_SYSTEM__DURATION:
			setDuration(DURATION_EDEFAULT);
			return;
		case SensorProjectPackage.SENSOR_SYSTEM__HAS_SUBSYSTEM:
			getHasSubsystem().clear();
			return;
		case SensorProjectPackage.SENSOR_SYSTEM__TIME_FORMAT:
			setTimeFormat(TIME_FORMAT_EDEFAULT);
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
		case SensorProjectPackage.SENSOR_SYSTEM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SensorProjectPackage.SENSOR_SYSTEM__DURATION:
			return duration != DURATION_EDEFAULT;
		case SensorProjectPackage.SENSOR_SYSTEM__HAS_SUBSYSTEM:
			return hasSubsystem != null && !hasSubsystem.isEmpty();
		case SensorProjectPackage.SENSOR_SYSTEM__TIME_FORMAT:
			return timeFormat != TIME_FORMAT_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", duration: ");
		result.append(duration);
		result.append(", timeFormat: ");
		result.append(timeFormat);
		result.append(')');
		return result.toString();
	}

} //SensorSystemImpl
