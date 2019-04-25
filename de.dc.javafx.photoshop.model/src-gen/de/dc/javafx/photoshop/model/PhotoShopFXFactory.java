/**
 */
package de.dc.javafx.photoshop.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dc.javafx.photoshop.model.PhotoShopFXPackage
 * @generated
 */
public interface PhotoShopFXFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PhotoShopFXFactory eINSTANCE = de.dc.javafx.photoshop.model.impl.PhotoShopFXFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Photo Shop FX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Photo Shop FX</em>'.
	 * @generated
	 */
	PhotoShopFX createPhotoShopFX();

	/**
	 * Returns a new object of class '<em>Point FX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point FX</em>'.
	 * @generated
	 */
	PointFX createPointFX();

	/**
	 * Returns a new object of class '<em>Line FX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line FX</em>'.
	 * @generated
	 */
	LineFX createLineFX();

	/**
	 * Returns a new object of class '<em>Rectangle FX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rectangle FX</em>'.
	 * @generated
	 */
	RectangleFX createRectangleFX();

	/**
	 * Returns a new object of class '<em>Arc FX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arc FX</em>'.
	 * @generated
	 */
	ArcFX createArcFX();

	/**
	 * Returns a new object of class '<em>Circle FX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Circle FX</em>'.
	 * @generated
	 */
	CircleFX createCircleFX();

	/**
	 * Returns a new object of class '<em>Polygon FX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Polygon FX</em>'.
	 * @generated
	 */
	PolygonFX createPolygonFX();

	/**
	 * Returns a new object of class '<em>Text FX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text FX</em>'.
	 * @generated
	 */
	TextFX createTextFX();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PhotoShopFXPackage getPhotoShopFXPackage();

} //PhotoShopFXFactory
