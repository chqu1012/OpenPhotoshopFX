/**
 */
package de.dc.javafx.photoshop.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape FX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.photoshop.model.ShapeFX#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.photoshop.model.PhotoShopFXPackage#getShapeFX()
 * @model abstract="true"
 * @generated
 */
public interface ShapeFX extends NodeFX {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(PointFX)
	 * @see de.dc.javafx.photoshop.model.PhotoShopFXPackage#getShapeFX_Position()
	 * @model containment="true"
	 * @generated
	 */
	PointFX getPosition();

	/**
	 * Sets the value of the '{@link de.dc.javafx.photoshop.model.ShapeFX#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(PointFX value);

} // ShapeFX
