/**
 */
package de.dc.javafx.photoshop.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rectangle FX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.photoshop.model.RectangleFX#getWidth <em>Width</em>}</li>
 *   <li>{@link de.dc.javafx.photoshop.model.RectangleFX#getHeight <em>Height</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.photoshop.model.PhotoShopFXPackage#getRectangleFX()
 * @model
 * @generated
 */
public interface RectangleFX extends ShapeFX {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(double)
	 * @see de.dc.javafx.photoshop.model.PhotoShopFXPackage#getRectangleFX_Width()
	 * @model default="100" unique="false"
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link de.dc.javafx.photoshop.model.RectangleFX#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(double value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(double)
	 * @see de.dc.javafx.photoshop.model.PhotoShopFXPackage#getRectangleFX_Height()
	 * @model default="100" unique="false"
	 * @generated
	 */
	double getHeight();

	/**
	 * Sets the value of the '{@link de.dc.javafx.photoshop.model.RectangleFX#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(double value);

} // RectangleFX
