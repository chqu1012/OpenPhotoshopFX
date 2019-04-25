/**
 */
package de.dc.javafx.photoshop.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line FX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.photoshop.model.LineFX#getEndPosition <em>End Position</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.photoshop.model.PhotoShopFXPackage#getLineFX()
 * @model
 * @generated
 */
public interface LineFX extends ShapeFX {
	/**
	 * Returns the value of the '<em><b>End Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Position</em>' containment reference.
	 * @see #setEndPosition(PointFX)
	 * @see de.dc.javafx.photoshop.model.PhotoShopFXPackage#getLineFX_EndPosition()
	 * @model containment="true"
	 * @generated
	 */
	PointFX getEndPosition();

	/**
	 * Sets the value of the '{@link de.dc.javafx.photoshop.model.LineFX#getEndPosition <em>End Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Position</em>' containment reference.
	 * @see #getEndPosition()
	 * @generated
	 */
	void setEndPosition(PointFX value);

} // LineFX
