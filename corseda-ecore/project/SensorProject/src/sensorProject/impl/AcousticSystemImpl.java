/**
 */
package sensorProject.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sensorProject.AcousticSystem;
import sensorProject.AcousticTimeID;
import sensorProject.SensorProjectPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acoustic System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sensorProject.impl.AcousticSystemImpl#getRecordTime <em>Record Time</em>}</li>
 *   <li>{@link sensorProject.impl.AcousticSystemImpl#getTimeFormat <em>Time Format</em>}</li>
 *   <li>{@link sensorProject.impl.AcousticSystemImpl#isMeasureOnce <em>Measure Once</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AcousticSystemImpl extends SubSystemImpl implements AcousticSystem {
	/**
	 * The default value of the '{@link #getRecordTime() <em>Record Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordTime()
	 * @generated
	 * @ordered
	 */
	protected static final double RECORD_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRecordTime() <em>Record Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordTime()
	 * @generated
	 * @ordered
	 */
	protected double recordTime = RECORD_TIME_EDEFAULT;

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
	 * The default value of the '{@link #isMeasureOnce() <em>Measure Once</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMeasureOnce()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MEASURE_ONCE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isMeasureOnce() <em>Measure Once</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMeasureOnce()
	 * @generated
	 * @ordered
	 */
	protected boolean measureOnce = MEASURE_ONCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcousticSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SensorProjectPackage.Literals.ACOUSTIC_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRecordTime() {
		return recordTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecordTime(double newRecordTime) {
		double oldRecordTime = recordTime;
		recordTime = newRecordTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorProjectPackage.ACOUSTIC_SYSTEM__RECORD_TIME,
					oldRecordTime, recordTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SensorProjectPackage.ACOUSTIC_SYSTEM__TIME_FORMAT,
					oldTimeFormat, timeFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMeasureOnce() {
		return measureOnce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasureOnce(boolean newMeasureOnce) {
		boolean oldMeasureOnce = measureOnce;
		measureOnce = newMeasureOnce;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorProjectPackage.ACOUSTIC_SYSTEM__MEASURE_ONCE,
					oldMeasureOnce, measureOnce));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SensorProjectPackage.ACOUSTIC_SYSTEM__RECORD_TIME:
			return getRecordTime();
		case SensorProjectPackage.ACOUSTIC_SYSTEM__TIME_FORMAT:
			return getTimeFormat();
		case SensorProjectPackage.ACOUSTIC_SYSTEM__MEASURE_ONCE:
			return isMeasureOnce();
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
		case SensorProjectPackage.ACOUSTIC_SYSTEM__RECORD_TIME:
			setRecordTime((Double) newValue);
			return;
		case SensorProjectPackage.ACOUSTIC_SYSTEM__TIME_FORMAT:
			setTimeFormat((AcousticTimeID) newValue);
			return;
		case SensorProjectPackage.ACOUSTIC_SYSTEM__MEASURE_ONCE:
			setMeasureOnce((Boolean) newValue);
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
		case SensorProjectPackage.ACOUSTIC_SYSTEM__RECORD_TIME:
			setRecordTime(RECORD_TIME_EDEFAULT);
			return;
		case SensorProjectPackage.ACOUSTIC_SYSTEM__TIME_FORMAT:
			setTimeFormat(TIME_FORMAT_EDEFAULT);
			return;
		case SensorProjectPackage.ACOUSTIC_SYSTEM__MEASURE_ONCE:
			setMeasureOnce(MEASURE_ONCE_EDEFAULT);
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
		case SensorProjectPackage.ACOUSTIC_SYSTEM__RECORD_TIME:
			return recordTime != RECORD_TIME_EDEFAULT;
		case SensorProjectPackage.ACOUSTIC_SYSTEM__TIME_FORMAT:
			return timeFormat != TIME_FORMAT_EDEFAULT;
		case SensorProjectPackage.ACOUSTIC_SYSTEM__MEASURE_ONCE:
			return measureOnce != MEASURE_ONCE_EDEFAULT;
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
		result.append(" (recordTime: ");
		result.append(recordTime);
		result.append(", timeFormat: ");
		result.append(timeFormat);
		result.append(", measureOnce: ");
		result.append(measureOnce);
		result.append(')');
		return result.toString();
	}

} //AcousticSystemImpl
