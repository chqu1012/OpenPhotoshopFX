/**
 */
package de.dc.javafx.photoshop.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc FX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.photoshop.model.ArcFX#getRadius <em>Radius</em>}</li>
 *   <li>{@link de.dc.javafx.photoshop.model.ArcFX#getStartAngle <em>Start Angle</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.photoshop.model.PhotoShopFXPackage#getArcFX()
 * @model
 * @generated
 */
public interface ArcFX extends ShapeFX {
	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(double)
	 * @see de.dc.javafx.photoshop.model.PhotoShopFXPackage#getArcFX_Radius()
	 * @model unique="false"
	 * @generated
	 */
	double getRadius();

	/**
	 * Sets the value of the '{@link de.dc.javafx.photoshop.model.ArcFX#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(double value);

	/**
	 * Returns the value of the '<em><b>Start Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Angle</em>' attribute.
	 * @see #setStartAngle(double)
	 * @see de.dc.javafx.photoshop.model.PhotoShopFXPackage#getArcFX_StartAngle()
	 * @model unique="false"
	 * @generated
	 */
	double getStartAngle();

	/**
	 * Sets the value of the '{@link de.dc.javafx.photoshop.model.ArcFX#getStartAngle <em>Start Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Angle</em>' attribute.
	 * @see #getStartAngle()
	 * @generated
	 */
	void setStartAngle(double value);

} // ArcFX
