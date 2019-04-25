/**
 */
package de.dc.javafx.photoshop.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polygon FX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.photoshop.model.PolygonFX#getPoints <em>Points</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.photoshop.model.PhotoShopFXPackage#getPolygonFX()
 * @model
 * @generated
 */
public interface PolygonFX extends ShapeFX {
	/**
	 * Returns the value of the '<em><b>Points</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.javafx.photoshop.model.PointFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' containment reference list.
	 * @see de.dc.javafx.photoshop.model.PhotoShopFXPackage#getPolygonFX_Points()
	 * @model containment="true"
	 * @generated
	 */
	EList<PointFX> getPoints();

} // PolygonFX
