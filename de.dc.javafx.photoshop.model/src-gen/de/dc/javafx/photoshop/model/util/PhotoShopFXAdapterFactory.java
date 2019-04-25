/**
 */
package de.dc.javafx.photoshop.model.util;

import de.dc.javafx.photoshop.model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.dc.javafx.photoshop.model.PhotoShopFXPackage
 * @generated
 */
public class PhotoShopFXAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PhotoShopFXPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhotoShopFXAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PhotoShopFXPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhotoShopFXSwitch<Adapter> modelSwitch = new PhotoShopFXSwitch<Adapter>() {
		@Override
		public Adapter casePhotoShopFX(PhotoShopFX object) {
			return createPhotoShopFXAdapter();
		}

		@Override
		public Adapter caseNodeFX(NodeFX object) {
			return createNodeFXAdapter();
		}

		@Override
		public Adapter casePointFX(PointFX object) {
			return createPointFXAdapter();
		}

		@Override
		public Adapter caseShapeFX(ShapeFX object) {
			return createShapeFXAdapter();
		}

		@Override
		public Adapter caseLineFX(LineFX object) {
			return createLineFXAdapter();
		}

		@Override
		public Adapter caseRectangleFX(RectangleFX object) {
			return createRectangleFXAdapter();
		}

		@Override
		public Adapter caseArcFX(ArcFX object) {
			return createArcFXAdapter();
		}

		@Override
		public Adapter caseCircleFX(CircleFX object) {
			return createCircleFXAdapter();
		}

		@Override
		public Adapter casePolygonFX(PolygonFX object) {
			return createPolygonFXAdapter();
		}

		@Override
		public Adapter caseTextFX(TextFX object) {
			return createTextFXAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.photoshop.model.PhotoShopFX <em>Photo Shop FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.photoshop.model.PhotoShopFX
	 * @generated
	 */
	public Adapter createPhotoShopFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.photoshop.model.NodeFX <em>Node FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.photoshop.model.NodeFX
	 * @generated
	 */
	public Adapter createNodeFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.photoshop.model.PointFX <em>Point FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.photoshop.model.PointFX
	 * @generated
	 */
	public Adapter createPointFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.photoshop.model.ShapeFX <em>Shape FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.photoshop.model.ShapeFX
	 * @generated
	 */
	public Adapter createShapeFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.photoshop.model.LineFX <em>Line FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.photoshop.model.LineFX
	 * @generated
	 */
	public Adapter createLineFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.photoshop.model.RectangleFX <em>Rectangle FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.photoshop.model.RectangleFX
	 * @generated
	 */
	public Adapter createRectangleFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.photoshop.model.ArcFX <em>Arc FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.photoshop.model.ArcFX
	 * @generated
	 */
	public Adapter createArcFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.photoshop.model.CircleFX <em>Circle FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.photoshop.model.CircleFX
	 * @generated
	 */
	public Adapter createCircleFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.photoshop.model.PolygonFX <em>Polygon FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.photoshop.model.PolygonFX
	 * @generated
	 */
	public Adapter createPolygonFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.photoshop.model.TextFX <em>Text FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.photoshop.model.TextFX
	 * @generated
	 */
	public Adapter createTextFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PhotoShopFXAdapterFactory
