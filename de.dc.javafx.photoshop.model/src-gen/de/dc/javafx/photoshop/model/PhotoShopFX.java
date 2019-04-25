/**
 */
package de.dc.javafx.photoshop.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Photo Shop FX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.photoshop.model.PhotoShopFX#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.photoshop.model.PhotoShopFXPackage#getPhotoShopFX()
 * @model
 * @generated
 */
public interface PhotoShopFX extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.javafx.photoshop.model.NodeFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see de.dc.javafx.photoshop.model.PhotoShopFXPackage#getPhotoShopFX_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodeFX> getNodes();

} // PhotoShopFX
