/**
 */
package de.dc.javafx.photoshop.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Circle FX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.photoshop.model.CircleFX#getRadius <em>Radius</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.photoshop.model.PhotoShopFXPackage#getCircleFX()
 * @model
 * @generated
 */
public interface CircleFX extends ShapeFX {
	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(double)
	 * @see de.dc.javafx.photoshop.model.PhotoShopFXPackage#getCircleFX_Radius()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Details'"
	 * @generated
	 */
	double getRadius();

	/**
	 * Sets the value of the '{@link de.dc.javafx.photoshop.model.CircleFX#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(double value);

} // CircleFX
