/**
 */
package de.dc.javafx.photoshop.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node FX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.photoshop.model.NodeFX#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.javafx.photoshop.model.NodeFX#getRotate <em>Rotate</em>}</li>
 *   <li>{@link de.dc.javafx.photoshop.model.NodeFX#getScaleX <em>Scale X</em>}</li>
 *   <li>{@link de.dc.javafx.photoshop.model.NodeFX#getScaleY <em>Scale Y</em>}</li>
 *   <li>{@link de.dc.javafx.photoshop.model.NodeFX#getScaleZ <em>Scale Z</em>}</li>
 *   <li>{@link de.dc.javafx.photoshop.model.NodeFX#getTranslateX <em>Translate X</em>}</li>
 *   <li>{@link de.dc.javafx.photoshop.model.NodeFX#getTranslateY <em>Translate Y</em>}</li>
 *   <li>{@link de.dc.javafx.photoshop.model.NodeFX#getTranslateZ <em>Translate Z</em>}</li>
 *   <li>{@link de.dc.javafx.photoshop.model.NodeFX#getOpacity <em>Opacity</em>}</li>
 *   <li>{@link de.dc.javafx.photoshop.model.NodeFX#getStyle <em>Style</em>}</li>
 *   <li>{@link de.dc.javafx.photoshop.model.NodeFX#getStyleClass <em>Style Class</em>}</li>
 *   <li>{@link de.dc.javafx.photoshop.model.NodeFX#isVisible <em>Visible</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.photoshop.model.PhotoShopFXPackage#getNodeFX()
 * @model abstract="true"
 * @generated
 */
public interface NodeFX extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.javafx.photoshop.model.PhotoShopFXPackage#getNodeFX_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.javafx.photoshop.model.NodeFX#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotate</em>' attribute.
	 * @see #setRotate(double)
	 * @see de.dc.javafx.photoshop.model.PhotoShopFXPackage#getNodeFX_Rotate()
	 * @model unique="false"
	 * @generated
	 */
	double getRotate();

	/**
	 * Sets the value of the '{@link de.dc.javafx.photoshop.model.NodeFX#getRotate <em>Rotate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotate</em>' attribute.
	 * @see #getRotate()
	 * @generated
	 */
	void setRotate(double value);

	/**
	 * Returns the value of the '<em><b>Scale X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale X</em>' attribute.
	 * @see #setScaleX(double)
	 * @see de.dc.javafx.photoshop.model.PhotoShopFXPackage#getNodeFX_ScaleX()
	 * @model unique="false"
	 * @generated
	 */
	double getScaleX();

	/**
	 * Sets the value of the '{@link de.dc.javafx.photoshop.model.NodeFX#getScaleX <em>Scale X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale X</em>' attribute.
	 * @see #getScaleX()
	 * @generated
	 */
	void setScaleX(double value);

	/**
	 * Returns the value of the '<em><b>Scale Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale Y</em>' attribute.
	 * @see #setScaleY(double)
	 * @see de.dc.javafx.photoshop.model.PhotoShopFXPackage#getNodeFX_ScaleY()
	 * @model unique="false"
	 * @generated
	 */
	double getScaleY();

	/**
	 * Sets the value of the '{@link de.dc.javafx.photoshop.model.NodeFX#getScaleY <em>Scale Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale Y</em>' attribute.
	 * @see #getScaleY()
	 * @generated
	 */
	void setScaleY(double value);

	/**
	 * Returns the value of the '<em><b>Scale Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale Z</em>' attribute.
	 * @see #setScaleZ(double)
	 * @see de.dc.javafx.photoshop.model.PhotoShopFXPackage#getNodeFX_ScaleZ()
	 * @model unique="false"
	 * @generated
	 */
	double getScaleZ();

	/**
	 * Sets the value of the '{@link de.dc.javafx.photoshop.model.NodeFX#getScaleZ <em>Scale Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale Z</em>' attribute.
	 * @see #getScaleZ()
	 * @generated
	 */
	void setScaleZ(double value);

	/**
	 * Returns the value of the '<em><b>Translate X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translate X</em>' attribute.
	 * @see #setTranslateX(double)
	 * @see de.dc.javafx.photoshop.model.PhotoShopFXPackage#getNodeFX_TranslateX()
	 * @model unique="false"
	 * @generated
	 */
	double getTranslateX();

	/**
	 * Sets the value of the '{@link de.dc.javafx.photoshop.model.NodeFX#getTranslateX <em>Translate X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translate X</em>' attribute.
	 * @see #getTranslateX()
	 * @generated
	 */
	void setTranslateX(double value);

	/**
	 * Returns the value of the '<em><b>Translate Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translate Y</em>' attribute.
	 * @see #setTranslateY(double)
	 * @see de.dc.javafx.photoshop.model.PhotoShopFXPackage#getNodeFX_TranslateY()
	 * @model unique="false"
	 * @generated
	 */
	double getTranslateY();

	/**
	 * Sets the value of the '{@link de.dc.javafx.photoshop.model.NodeFX#getTranslateY <em>Translate Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translate Y</em>' attribute.
	 * @see #getTranslateY()
	 * @generated
	 */
	void setTranslateY(double value);

	/**
	 * Returns the value of the '<em><b>Translate Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translate Z</em>' attribute.
	 * @see #setTranslateZ(double)
	 * @see de.dc.javafx.photoshop.model.PhotoShopFXPackage#getNodeFX_TranslateZ()
	 * @model unique="false"
	 * @generated
	 */
	double getTranslateZ();

	/**
	 * Sets the value of the '{@link de.dc.javafx.photoshop.model.NodeFX#getTranslateZ <em>Translate Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translate Z</em>' attribute.
	 * @see #getTranslateZ()
	 * @generated
	 */
	void setTranslateZ(double value);

	/**
	 * Returns the value of the '<em><b>Opacity</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opacity</em>' attribute.
	 * @see #setOpacity(double)
	 * @see de.dc.javafx.photoshop.model.PhotoShopFXPackage#getNodeFX_Opacity()
	 * @model default="1.0" unique="false"
	 * @generated
	 */
	double getOpacity();

	/**
	 * Sets the value of the '{@link de.dc.javafx.photoshop.model.NodeFX#getOpacity <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opacity</em>' attribute.
	 * @see #getOpacity()
	 * @generated
	 */
	void setOpacity(double value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see de.dc.javafx.photoshop.model.PhotoShopFXPackage#getNodeFX_Style()
	 * @model unique="false"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link de.dc.javafx.photoshop.model.NodeFX#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Class</em>' attribute.
	 * @see #setStyleClass(String)
	 * @see de.dc.javafx.photoshop.model.PhotoShopFXPackage#getNodeFX_StyleClass()
	 * @model unique="false"
	 * @generated
	 */
	String getStyleClass();

	/**
	 * Sets the value of the '{@link de.dc.javafx.photoshop.model.NodeFX#getStyleClass <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Class</em>' attribute.
	 * @see #getStyleClass()
	 * @generated
	 */
	void setStyleClass(String value);

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #setVisible(boolean)
	 * @see de.dc.javafx.photoshop.model.PhotoShopFXPackage#getNodeFX_Visible()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link de.dc.javafx.photoshop.model.NodeFX#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #isVisible()
	 * @generated
	 */
	void setVisible(boolean value);

} // NodeFX
