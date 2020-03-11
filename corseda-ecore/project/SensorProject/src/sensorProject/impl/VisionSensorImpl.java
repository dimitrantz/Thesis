/**
 */
package sensorProject.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sensorProject.ResolutionID;
import sensorProject.SensorProjectPackage;
import sensorProject.VisionID;
import sensorProject.VisionSensor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vision Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sensorProject.impl.VisionSensorImpl#getType <em>Type</em>}</li>
 *   <li>{@link sensorProject.impl.VisionSensorImpl#getResolution <em>Resolution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisionSensorImpl extends SensorImpl implements VisionSensor {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final VisionID TYPE_EDEFAULT = VisionID.TOP;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected VisionID type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected static final ResolutionID RESOLUTION_EDEFAULT = ResolutionID.PX4_0X30;

	/**
	 * The cached value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected ResolutionID resolution = RESOLUTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisionSensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SensorProjectPackage.Literals.VISION_SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionID getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(VisionID newType) {
		VisionID oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorProjectPackage.VISION_SENSOR__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolutionID getResolution() {
		return resolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolution(ResolutionID newResolution) {
		ResolutionID oldResolution = resolution;
		resolution = newResolution == null ? RESOLUTION_EDEFAULT : newResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorProjectPackage.VISION_SENSOR__RESOLUTION,
					oldResolution, resolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SensorProjectPackage.VISION_SENSOR__TYPE:
			return getType();
		case SensorProjectPackage.VISION_SENSOR__RESOLUTION:
			return getResolution();
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
		case SensorProjectPackage.VISION_SENSOR__TYPE:
			setType((VisionID) newValue);
			return;
		case SensorProjectPackage.VISION_SENSOR__RESOLUTION:
			setResolution((ResolutionID) newValue);
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
		case SensorProjectPackage.VISION_SENSOR__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case SensorProjectPackage.VISION_SENSOR__RESOLUTION:
			setResolution(RESOLUTION_EDEFAULT);
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
		case SensorProjectPackage.VISION_SENSOR__TYPE:
			return type != TYPE_EDEFAULT;
		case SensorProjectPackage.VISION_SENSOR__RESOLUTION:
			return resolution != RESOLUTION_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", resolution: ");
		result.append(resolution);
		result.append(')');
		return result.toString();
	}

} //VisionSensorImpl
