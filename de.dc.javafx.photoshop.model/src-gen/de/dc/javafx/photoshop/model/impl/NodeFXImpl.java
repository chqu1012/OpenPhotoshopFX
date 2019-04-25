/**
 */
package de.dc.javafx.photoshop.model.impl;

import de.dc.javafx.photoshop.model.NodeFX;
import de.dc.javafx.photoshop.model.PhotoShopFXPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node FX</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.photoshop.model.impl.NodeFXImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.javafx.photoshop.model.impl.NodeFXImpl#getRotate <em>Rotate</em>}</li>
 *   <li>{@link de.dc.javafx.photoshop.model.impl.NodeFXImpl#getScaleX <em>Scale X</em>}</li>
 *   <li>{@link de.dc.javafx.photoshop.model.impl.NodeFXImpl#getScaleY <em>Scale Y</em>}</li>
 *   <li>{@link de.dc.javafx.photoshop.model.impl.NodeFXImpl#getScaleZ <em>Scale Z</em>}</li>
 *   <li>{@link de.dc.javafx.photoshop.model.impl.NodeFXImpl#getTranslateX <em>Translate X</em>}</li>
 *   <li>{@link de.dc.javafx.photoshop.model.impl.NodeFXImpl#getTranslateY <em>Translate Y</em>}</li>
 *   <li>{@link de.dc.javafx.photoshop.model.impl.NodeFXImpl#getTranslateZ <em>Translate Z</em>}</li>
 *   <li>{@link de.dc.javafx.photoshop.model.impl.NodeFXImpl#getOpacity <em>Opacity</em>}</li>
 *   <li>{@link de.dc.javafx.photoshop.model.impl.NodeFXImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link de.dc.javafx.photoshop.model.impl.NodeFXImpl#getStyleClass <em>Style Class</em>}</li>
 *   <li>{@link de.dc.javafx.photoshop.model.impl.NodeFXImpl#isVisible <em>Visible</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NodeFXImpl extends MinimalEObjectImpl.Container implements NodeFX {
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
	 * The default value of the '{@link #getRotate() <em>Rotate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotate()
	 * @generated
	 * @ordered
	 */
	protected static final double ROTATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRotate() <em>Rotate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotate()
	 * @generated
	 * @ordered
	 */
	protected double rotate = ROTATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getScaleX() <em>Scale X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleX()
	 * @generated
	 * @ordered
	 */
	protected static final double SCALE_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getScaleX() <em>Scale X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleX()
	 * @generated
	 * @ordered
	 */
	protected double scaleX = SCALE_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getScaleY() <em>Scale Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleY()
	 * @generated
	 * @ordered
	 */
	protected static final double SCALE_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getScaleY() <em>Scale Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleY()
	 * @generated
	 * @ordered
	 */
	protected double scaleY = SCALE_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getScaleZ() <em>Scale Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleZ()
	 * @generated
	 * @ordered
	 */
	protected static final double SCALE_Z_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getScaleZ() <em>Scale Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleZ()
	 * @generated
	 * @ordered
	 */
	protected double scaleZ = SCALE_Z_EDEFAULT;

	/**
	 * The default value of the '{@link #getTranslateX() <em>Translate X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslateX()
	 * @generated
	 * @ordered
	 */
	protected static final double TRANSLATE_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTranslateX() <em>Translate X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslateX()
	 * @generated
	 * @ordered
	 */
	protected double translateX = TRANSLATE_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getTranslateY() <em>Translate Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslateY()
	 * @generated
	 * @ordered
	 */
	protected static final double TRANSLATE_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTranslateY() <em>Translate Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslateY()
	 * @generated
	 * @ordered
	 */
	protected double translateY = TRANSLATE_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getTranslateZ() <em>Translate Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslateZ()
	 * @generated
	 * @ordered
	 */
	protected static final double TRANSLATE_Z_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTranslateZ() <em>Translate Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslateZ()
	 * @generated
	 * @ordered
	 */
	protected double translateZ = TRANSLATE_Z_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpacity() <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpacity()
	 * @generated
	 * @ordered
	 */
	protected static final double OPACITY_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getOpacity() <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpacity()
	 * @generated
	 * @ordered
	 */
	protected double opacity = OPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected String style = STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyleClass() <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleClass()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyleClass() <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleClass()
	 * @generated
	 * @ordered
	 */
	protected String styleClass = STYLE_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean visible = VISIBLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeFXImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotoShopFXPackage.Literals.NODE_FX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotoShopFXPackage.NODE_FX__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRotate() {
		return rotate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRotate(double newRotate) {
		double oldRotate = rotate;
		rotate = newRotate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotoShopFXPackage.NODE_FX__ROTATE, oldRotate,
					rotate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getScaleX() {
		return scaleX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScaleX(double newScaleX) {
		double oldScaleX = scaleX;
		scaleX = newScaleX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotoShopFXPackage.NODE_FX__SCALE_X, oldScaleX,
					scaleX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getScaleY() {
		return scaleY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScaleY(double newScaleY) {
		double oldScaleY = scaleY;
		scaleY = newScaleY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotoShopFXPackage.NODE_FX__SCALE_Y, oldScaleY,
					scaleY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getScaleZ() {
		return scaleZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScaleZ(double newScaleZ) {
		double oldScaleZ = scaleZ;
		scaleZ = newScaleZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotoShopFXPackage.NODE_FX__SCALE_Z, oldScaleZ,
					scaleZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTranslateX() {
		return translateX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTranslateX(double newTranslateX) {
		double oldTranslateX = translateX;
		translateX = newTranslateX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotoShopFXPackage.NODE_FX__TRANSLATE_X,
					oldTranslateX, translateX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTranslateY() {
		return translateY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTranslateY(double newTranslateY) {
		double oldTranslateY = translateY;
		translateY = newTranslateY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotoShopFXPackage.NODE_FX__TRANSLATE_Y,
					oldTranslateY, translateY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTranslateZ() {
		return translateZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTranslateZ(double newTranslateZ) {
		double oldTranslateZ = translateZ;
		translateZ = newTranslateZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotoShopFXPackage.NODE_FX__TRANSLATE_Z,
					oldTranslateZ, translateZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getOpacity() {
		return opacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpacity(double newOpacity) {
		double oldOpacity = opacity;
		opacity = newOpacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotoShopFXPackage.NODE_FX__OPACITY, oldOpacity,
					opacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyle(String newStyle) {
		String oldStyle = style;
		style = newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotoShopFXPackage.NODE_FX__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStyleClass() {
		return styleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyleClass(String newStyleClass) {
		String oldStyleClass = styleClass;
		styleClass = newStyleClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotoShopFXPackage.NODE_FX__STYLE_CLASS,
					oldStyleClass, styleClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisible(boolean newVisible) {
		boolean oldVisible = visible;
		visible = newVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotoShopFXPackage.NODE_FX__VISIBLE, oldVisible,
					visible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PhotoShopFXPackage.NODE_FX__NAME:
			return getName();
		case PhotoShopFXPackage.NODE_FX__ROTATE:
			return getRotate();
		case PhotoShopFXPackage.NODE_FX__SCALE_X:
			return getScaleX();
		case PhotoShopFXPackage.NODE_FX__SCALE_Y:
			return getScaleY();
		case PhotoShopFXPackage.NODE_FX__SCALE_Z:
			return getScaleZ();
		case PhotoShopFXPackage.NODE_FX__TRANSLATE_X:
			return getTranslateX();
		case PhotoShopFXPackage.NODE_FX__TRANSLATE_Y:
			return getTranslateY();
		case PhotoShopFXPackage.NODE_FX__TRANSLATE_Z:
			return getTranslateZ();
		case PhotoShopFXPackage.NODE_FX__OPACITY:
			return getOpacity();
		case PhotoShopFXPackage.NODE_FX__STYLE:
			return getStyle();
		case PhotoShopFXPackage.NODE_FX__STYLE_CLASS:
			return getStyleClass();
		case PhotoShopFXPackage.NODE_FX__VISIBLE:
			return isVisible();
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
		case PhotoShopFXPackage.NODE_FX__NAME:
			setName((String) newValue);
			return;
		case PhotoShopFXPackage.NODE_FX__ROTATE:
			setRotate((Double) newValue);
			return;
		case PhotoShopFXPackage.NODE_FX__SCALE_X:
			setScaleX((Double) newValue);
			return;
		case PhotoShopFXPackage.NODE_FX__SCALE_Y:
			setScaleY((Double) newValue);
			return;
		case PhotoShopFXPackage.NODE_FX__SCALE_Z:
			setScaleZ((Double) newValue);
			return;
		case PhotoShopFXPackage.NODE_FX__TRANSLATE_X:
			setTranslateX((Double) newValue);
			return;
		case PhotoShopFXPackage.NODE_FX__TRANSLATE_Y:
			setTranslateY((Double) newValue);
			return;
		case PhotoShopFXPackage.NODE_FX__TRANSLATE_Z:
			setTranslateZ((Double) newValue);
			return;
		case PhotoShopFXPackage.NODE_FX__OPACITY:
			setOpacity((Double) newValue);
			return;
		case PhotoShopFXPackage.NODE_FX__STYLE:
			setStyle((String) newValue);
			return;
		case PhotoShopFXPackage.NODE_FX__STYLE_CLASS:
			setStyleClass((String) newValue);
			return;
		case PhotoShopFXPackage.NODE_FX__VISIBLE:
			setVisible((Boolean) newValue);
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
		case PhotoShopFXPackage.NODE_FX__NAME:
			setName(NAME_EDEFAULT);
			return;
		case PhotoShopFXPackage.NODE_FX__ROTATE:
			setRotate(ROTATE_EDEFAULT);
			return;
		case PhotoShopFXPackage.NODE_FX__SCALE_X:
			setScaleX(SCALE_X_EDEFAULT);
			return;
		case PhotoShopFXPackage.NODE_FX__SCALE_Y:
			setScaleY(SCALE_Y_EDEFAULT);
			return;
		case PhotoShopFXPackage.NODE_FX__SCALE_Z:
			setScaleZ(SCALE_Z_EDEFAULT);
			return;
		case PhotoShopFXPackage.NODE_FX__TRANSLATE_X:
			setTranslateX(TRANSLATE_X_EDEFAULT);
			return;
		case PhotoShopFXPackage.NODE_FX__TRANSLATE_Y:
			setTranslateY(TRANSLATE_Y_EDEFAULT);
			return;
		case PhotoShopFXPackage.NODE_FX__TRANSLATE_Z:
			setTranslateZ(TRANSLATE_Z_EDEFAULT);
			return;
		case PhotoShopFXPackage.NODE_FX__OPACITY:
			setOpacity(OPACITY_EDEFAULT);
			return;
		case PhotoShopFXPackage.NODE_FX__STYLE:
			setStyle(STYLE_EDEFAULT);
			return;
		case PhotoShopFXPackage.NODE_FX__STYLE_CLASS:
			setStyleClass(STYLE_CLASS_EDEFAULT);
			return;
		case PhotoShopFXPackage.NODE_FX__VISIBLE:
			setVisible(VISIBLE_EDEFAULT);
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
		case PhotoShopFXPackage.NODE_FX__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case PhotoShopFXPackage.NODE_FX__ROTATE:
			return rotate != ROTATE_EDEFAULT;
		case PhotoShopFXPackage.NODE_FX__SCALE_X:
			return scaleX != SCALE_X_EDEFAULT;
		case PhotoShopFXPackage.NODE_FX__SCALE_Y:
			return scaleY != SCALE_Y_EDEFAULT;
		case PhotoShopFXPackage.NODE_FX__SCALE_Z:
			return scaleZ != SCALE_Z_EDEFAULT;
		case PhotoShopFXPackage.NODE_FX__TRANSLATE_X:
			return translateX != TRANSLATE_X_EDEFAULT;
		case PhotoShopFXPackage.NODE_FX__TRANSLATE_Y:
			return translateY != TRANSLATE_Y_EDEFAULT;
		case PhotoShopFXPackage.NODE_FX__TRANSLATE_Z:
			return translateZ != TRANSLATE_Z_EDEFAULT;
		case PhotoShopFXPackage.NODE_FX__OPACITY:
			return opacity != OPACITY_EDEFAULT;
		case PhotoShopFXPackage.NODE_FX__STYLE:
			return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
		case PhotoShopFXPackage.NODE_FX__STYLE_CLASS:
			return STYLE_CLASS_EDEFAULT == null ? styleClass != null : !STYLE_CLASS_EDEFAULT.equals(styleClass);
		case PhotoShopFXPackage.NODE_FX__VISIBLE:
			return visible != VISIBLE_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", rotate: ");
		result.append(rotate);
		result.append(", scaleX: ");
		result.append(scaleX);
		result.append(", scaleY: ");
		result.append(scaleY);
		result.append(", scaleZ: ");
		result.append(scaleZ);
		result.append(", translateX: ");
		result.append(translateX);
		result.append(", translateY: ");
		result.append(translateY);
		result.append(", translateZ: ");
		result.append(translateZ);
		result.append(", opacity: ");
		result.append(opacity);
		result.append(", style: ");
		result.append(style);
		result.append(", styleClass: ");
		result.append(styleClass);
		result.append(", visible: ");
		result.append(visible);
		result.append(')');
		return result.toString();
	}

} //NodeFXImpl
