/**
 */
package de.dc.javafx.photoshop.model.impl;

import de.dc.javafx.photoshop.model.LineFX;
import de.dc.javafx.photoshop.model.PhotoShopFXPackage;
import de.dc.javafx.photoshop.model.PointFX;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line FX</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.photoshop.model.impl.LineFXImpl#getEndPosition <em>End Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LineFXImpl extends ShapeFXImpl implements LineFX {
	/**
	 * The cached value of the '{@link #getEndPosition() <em>End Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPosition()
	 * @generated
	 * @ordered
	 */
	protected PointFX endPosition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineFXImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotoShopFXPackage.Literals.LINE_FX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointFX getEndPosition() {
		return endPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndPosition(PointFX newEndPosition, NotificationChain msgs) {
		PointFX oldEndPosition = endPosition;
		endPosition = newEndPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PhotoShopFXPackage.LINE_FX__END_POSITION, oldEndPosition, newEndPosition);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndPosition(PointFX newEndPosition) {
		if (newEndPosition != endPosition) {
			NotificationChain msgs = null;
			if (endPosition != null)
				msgs = ((InternalEObject) endPosition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PhotoShopFXPackage.LINE_FX__END_POSITION, null, msgs);
			if (newEndPosition != null)
				msgs = ((InternalEObject) newEndPosition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PhotoShopFXPackage.LINE_FX__END_POSITION, null, msgs);
			msgs = basicSetEndPosition(newEndPosition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotoShopFXPackage.LINE_FX__END_POSITION,
					newEndPosition, newEndPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PhotoShopFXPackage.LINE_FX__END_POSITION:
			return basicSetEndPosition(null, msgs);
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
		case PhotoShopFXPackage.LINE_FX__END_POSITION:
			return getEndPosition();
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
		case PhotoShopFXPackage.LINE_FX__END_POSITION:
			setEndPosition((PointFX) newValue);
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
		case PhotoShopFXPackage.LINE_FX__END_POSITION:
			setEndPosition((PointFX) null);
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
		case PhotoShopFXPackage.LINE_FX__END_POSITION:
			return endPosition != null;
		}
		return super.eIsSet(featureID);
	}

} //LineFXImpl
