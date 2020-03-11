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

import sensorProject.Category;
import sensorProject.Sensor;
import sensorProject.SensorProjectPackage;
import sensorProject.SubSystem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sensorProject.impl.SubSystemImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link sensorProject.impl.SubSystemImpl#getHasSensor <em>Has Sensor</em>}</li>
 *   <li>{@link sensorProject.impl.SubSystemImpl#getRefresh_rate <em>Refresh rate</em>}</li>
 *   <li>{@link sensorProject.impl.SubSystemImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubSystemImpl extends MinimalEObjectImpl.Container implements SubSystem {
	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final Category CATEGORY_EDEFAULT = Category.DISTANCE;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected Category category = CATEGORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasSensor() <em>Has Sensor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSensor()
	 * @generated
	 * @ordered
	 */
	protected EList<Sensor> hasSensor;

	/**
	 * The default value of the '{@link #getRefresh_rate() <em>Refresh rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefresh_rate()
	 * @generated
	 * @ordered
	 */
	protected static final double REFRESH_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRefresh_rate() <em>Refresh rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefresh_rate()
	 * @generated
	 * @ordered
	 */
	protected double refresh_rate = REFRESH_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SensorProjectPackage.Literals.SUB_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(Category newCategory) {
		Category oldCategory = category;
		category = newCategory == null ? CATEGORY_EDEFAULT : newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorProjectPackage.SUB_SYSTEM__CATEGORY,
					oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sensor> getHasSensor() {
		if (hasSensor == null) {
			hasSensor = new EObjectContainmentEList<Sensor>(Sensor.class, this,
					SensorProjectPackage.SUB_SYSTEM__HAS_SENSOR);
		}
		return hasSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRefresh_rate() {
		return refresh_rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefresh_rate(double newRefresh_rate) {
		double oldRefresh_rate = refresh_rate;
		refresh_rate = newRefresh_rate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorProjectPackage.SUB_SYSTEM__REFRESH_RATE,
					oldRefresh_rate, refresh_rate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorProjectPackage.SUB_SYSTEM__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SensorProjectPackage.SUB_SYSTEM__HAS_SENSOR:
			return ((InternalEList<?>) getHasSensor()).basicRemove(otherEnd, msgs);
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
		case SensorProjectPackage.SUB_SYSTEM__CATEGORY:
			return getCategory();
		case SensorProjectPackage.SUB_SYSTEM__HAS_SENSOR:
			return getHasSensor();
		case SensorProjectPackage.SUB_SYSTEM__REFRESH_RATE:
			return getRefresh_rate();
		case SensorProjectPackage.SUB_SYSTEM__DESCRIPTION:
			return getDescription();
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
		case SensorProjectPackage.SUB_SYSTEM__CATEGORY:
			setCategory((Category) newValue);
			return;
		case SensorProjectPackage.SUB_SYSTEM__HAS_SENSOR:
			getHasSensor().clear();
			getHasSensor().addAll((Collection<? extends Sensor>) newValue);
			return;
		case SensorProjectPackage.SUB_SYSTEM__REFRESH_RATE:
			setRefresh_rate((Double) newValue);
			return;
		case SensorProjectPackage.SUB_SYSTEM__DESCRIPTION:
			setDescription((String) newValue);
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
		case SensorProjectPackage.SUB_SYSTEM__CATEGORY:
			setCategory(CATEGORY_EDEFAULT);
			return;
		case SensorProjectPackage.SUB_SYSTEM__HAS_SENSOR:
			getHasSensor().clear();
			return;
		case SensorProjectPackage.SUB_SYSTEM__REFRESH_RATE:
			setRefresh_rate(REFRESH_RATE_EDEFAULT);
			return;
		case SensorProjectPackage.SUB_SYSTEM__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
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
		case SensorProjectPackage.SUB_SYSTEM__CATEGORY:
			return category != CATEGORY_EDEFAULT;
		case SensorProjectPackage.SUB_SYSTEM__HAS_SENSOR:
			return hasSensor != null && !hasSensor.isEmpty();
		case SensorProjectPackage.SUB_SYSTEM__REFRESH_RATE:
			return refresh_rate != REFRESH_RATE_EDEFAULT;
		case SensorProjectPackage.SUB_SYSTEM__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (category: ");
		result.append(category);
		result.append(", refresh_rate: ");
		result.append(refresh_rate);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //SubSystemImpl
