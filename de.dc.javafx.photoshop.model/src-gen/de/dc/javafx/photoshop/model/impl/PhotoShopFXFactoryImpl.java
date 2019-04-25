/**
 */
package de.dc.javafx.photoshop.model.impl;

import de.dc.javafx.photoshop.model.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PhotoShopFXFactoryImpl extends EFactoryImpl implements PhotoShopFXFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PhotoShopFXFactory init() {
		try {
			PhotoShopFXFactory thePhotoShopFXFactory = (PhotoShopFXFactory) EPackage.Registry.INSTANCE
					.getEFactory(PhotoShopFXPackage.eNS_URI);
			if (thePhotoShopFXFactory != null) {
				return thePhotoShopFXFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PhotoShopFXFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhotoShopFXFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case PhotoShopFXPackage.PHOTO_SHOP_FX:
			return createPhotoShopFX();
		case PhotoShopFXPackage.POINT_FX:
			return createPointFX();
		case PhotoShopFXPackage.LINE_FX:
			return createLineFX();
		case PhotoShopFXPackage.RECTANGLE_FX:
			return createRectangleFX();
		case PhotoShopFXPackage.ARC_FX:
			return createArcFX();
		case PhotoShopFXPackage.CIRCLE_FX:
			return createCircleFX();
		case PhotoShopFXPackage.POLYGON_FX:
			return createPolygonFX();
		case PhotoShopFXPackage.TEXT_FX:
			return createTextFX();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhotoShopFX createPhotoShopFX() {
		PhotoShopFXImpl photoShopFX = new PhotoShopFXImpl();
		return photoShopFX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointFX createPointFX() {
		PointFXImpl pointFX = new PointFXImpl();
		return pointFX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineFX createLineFX() {
		LineFXImpl lineFX = new LineFXImpl();
		return lineFX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RectangleFX createRectangleFX() {
		RectangleFXImpl rectangleFX = new RectangleFXImpl();
		return rectangleFX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArcFX createArcFX() {
		ArcFXImpl arcFX = new ArcFXImpl();
		return arcFX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CircleFX createCircleFX() {
		CircleFXImpl circleFX = new CircleFXImpl();
		return circleFX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolygonFX createPolygonFX() {
		PolygonFXImpl polygonFX = new PolygonFXImpl();
		return polygonFX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextFX createTextFX() {
		TextFXImpl textFX = new TextFXImpl();
		return textFX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhotoShopFXPackage getPhotoShopFXPackage() {
		return (PhotoShopFXPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PhotoShopFXPackage getPackage() {
		return PhotoShopFXPackage.eINSTANCE;
	}

} //PhotoShopFXFactoryImpl
