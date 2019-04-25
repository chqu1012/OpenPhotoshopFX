/**
 */
package de.dc.javafx.photoshop.model.impl;

import de.dc.javafx.photoshop.model.ArcFX;
import de.dc.javafx.photoshop.model.PhotoShopFXPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arc FX</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.photoshop.model.impl.ArcFXImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link de.dc.javafx.photoshop.model.impl.ArcFXImpl#getStartAngle <em>Start Angle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArcFXImpl extends ShapeFXImpl implements ArcFX {
	/**
	 * The default value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double RADIUS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected double radius = RADIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartAngle() <em>Start Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double START_ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getStartAngle() <em>Start Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartAngle()
	 * @generated
	 * @ordered
	 */
	protected double startAngle = START_ANGLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArcFXImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotoShopFXPackage.Literals.ARC_FX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRadius() {
		return radius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRadius(double newRadius) {
		double oldRadius = radius;
		radius = newRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotoShopFXPackage.ARC_FX__RADIUS, oldRadius,
					radius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getStartAngle() {
		return startAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartAngle(double newStartAngle) {
		double oldStartAngle = startAngle;
		startAngle = newStartAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotoShopFXPackage.ARC_FX__START_ANGLE, oldStartAngle,
					startAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PhotoShopFXPackage.ARC_FX__RADIUS:
			return getRadius();
		case PhotoShopFXPackage.ARC_FX__START_ANGLE:
			return getStartAngle();
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
		case PhotoShopFXPackage.ARC_FX__RADIUS:
			setRadius((Double) newValue);
			return;
		case PhotoShopFXPackage.ARC_FX__START_ANGLE:
			setStartAngle((Double) newValue);
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
		case PhotoShopFXPackage.ARC_FX__RADIUS:
			setRadius(RADIUS_EDEFAULT);
			return;
		case PhotoShopFXPackage.ARC_FX__START_ANGLE:
			setStartAngle(START_ANGLE_EDEFAULT);
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
		case PhotoShopFXPackage.ARC_FX__RADIUS:
			return radius != RADIUS_EDEFAULT;
		case PhotoShopFXPackage.ARC_FX__START_ANGLE:
			return startAngle != START_ANGLE_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (radius: ");
		result.append(radius);
		result.append(", startAngle: ");
		result.append(startAngle);
		result.append(')');
		return result.toString();
	}

} //ArcFXImpl
