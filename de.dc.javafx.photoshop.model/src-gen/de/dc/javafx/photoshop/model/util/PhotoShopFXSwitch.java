/**
 */
package de.dc.javafx.photoshop.model.util;

import de.dc.javafx.photoshop.model.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.dc.javafx.photoshop.model.PhotoShopFXPackage
 * @generated
 */
public class PhotoShopFXSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PhotoShopFXPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhotoShopFXSwitch() {
		if (modelPackage == null) {
			modelPackage = PhotoShopFXPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case PhotoShopFXPackage.PHOTO_SHOP_FX: {
			PhotoShopFX photoShopFX = (PhotoShopFX) theEObject;
			T result = casePhotoShopFX(photoShopFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PhotoShopFXPackage.NODE_FX: {
			NodeFX nodeFX = (NodeFX) theEObject;
			T result = caseNodeFX(nodeFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PhotoShopFXPackage.POINT_FX: {
			PointFX pointFX = (PointFX) theEObject;
			T result = casePointFX(pointFX);
			if (result == null)
				result = caseNodeFX(pointFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PhotoShopFXPackage.SHAPE_FX: {
			ShapeFX shapeFX = (ShapeFX) theEObject;
			T result = caseShapeFX(shapeFX);
			if (result == null)
				result = caseNodeFX(shapeFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PhotoShopFXPackage.LINE_FX: {
			LineFX lineFX = (LineFX) theEObject;
			T result = caseLineFX(lineFX);
			if (result == null)
				result = caseShapeFX(lineFX);
			if (result == null)
				result = caseNodeFX(lineFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PhotoShopFXPackage.RECTANGLE_FX: {
			RectangleFX rectangleFX = (RectangleFX) theEObject;
			T result = caseRectangleFX(rectangleFX);
			if (result == null)
				result = caseShapeFX(rectangleFX);
			if (result == null)
				result = caseNodeFX(rectangleFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PhotoShopFXPackage.ARC_FX: {
			ArcFX arcFX = (ArcFX) theEObject;
			T result = caseArcFX(arcFX);
			if (result == null)
				result = caseShapeFX(arcFX);
			if (result == null)
				result = caseNodeFX(arcFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PhotoShopFXPackage.CIRCLE_FX: {
			CircleFX circleFX = (CircleFX) theEObject;
			T result = caseCircleFX(circleFX);
			if (result == null)
				result = caseShapeFX(circleFX);
			if (result == null)
				result = caseNodeFX(circleFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PhotoShopFXPackage.POLYGON_FX: {
			PolygonFX polygonFX = (PolygonFX) theEObject;
			T result = casePolygonFX(polygonFX);
			if (result == null)
				result = caseShapeFX(polygonFX);
			if (result == null)
				result = caseNodeFX(polygonFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PhotoShopFXPackage.TEXT_FX: {
			TextFX textFX = (TextFX) theEObject;
			T result = caseTextFX(textFX);
			if (result == null)
				result = caseShapeFX(textFX);
			if (result == null)
				result = caseNodeFX(textFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Photo Shop FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Photo Shop FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhotoShopFX(PhotoShopFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeFX(NodeFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointFX(PointFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShapeFX(ShapeFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineFX(LineFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rectangle FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rectangle FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRectangleFX(RectangleFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcFX(ArcFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Circle FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circle FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCircleFX(CircleFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygon FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygon FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolygonFX(PolygonFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextFX(TextFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PhotoShopFXSwitch
