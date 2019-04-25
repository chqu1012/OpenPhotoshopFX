/**
 */
package de.dc.javafx.photoshop.model.impl;

import de.dc.javafx.photoshop.model.ArcFX;
import de.dc.javafx.photoshop.model.CircleFX;
import de.dc.javafx.photoshop.model.LineFX;
import de.dc.javafx.photoshop.model.NodeFX;
import de.dc.javafx.photoshop.model.PhotoShopFX;
import de.dc.javafx.photoshop.model.PhotoShopFXFactory;
import de.dc.javafx.photoshop.model.PhotoShopFXPackage;
import de.dc.javafx.photoshop.model.PointFX;
import de.dc.javafx.photoshop.model.PolygonFX;
import de.dc.javafx.photoshop.model.RectangleFX;
import de.dc.javafx.photoshop.model.ShapeFX;
import de.dc.javafx.photoshop.model.TextFX;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PhotoShopFXPackageImpl extends EPackageImpl implements PhotoShopFXPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass photoShopFXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeFXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointFXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapeFXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineFXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectangleFXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcFXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass circleFXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygonFXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textFXEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.dc.javafx.photoshop.model.PhotoShopFXPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PhotoShopFXPackageImpl() {
		super(eNS_URI, PhotoShopFXFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PhotoShopFXPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PhotoShopFXPackage init() {
		if (isInited)
			return (PhotoShopFXPackage) EPackage.Registry.INSTANCE.getEPackage(PhotoShopFXPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPhotoShopFXPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PhotoShopFXPackageImpl thePhotoShopFXPackage = registeredPhotoShopFXPackage instanceof PhotoShopFXPackageImpl
				? (PhotoShopFXPackageImpl) registeredPhotoShopFXPackage
				: new PhotoShopFXPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePhotoShopFXPackage.createPackageContents();

		// Initialize created meta-data
		thePhotoShopFXPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePhotoShopFXPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PhotoShopFXPackage.eNS_URI, thePhotoShopFXPackage);
		return thePhotoShopFXPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPhotoShopFX() {
		return photoShopFXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPhotoShopFX_Nodes() {
		return (EReference) photoShopFXEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNodeFX() {
		return nodeFXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeFX_Name() {
		return (EAttribute) nodeFXEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeFX_Opacity() {
		return (EAttribute) nodeFXEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeFX_Style() {
		return (EAttribute) nodeFXEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeFX_StyleClass() {
		return (EAttribute) nodeFXEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeFX_StrokeWidth() {
		return (EAttribute) nodeFXEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeFX_Rotate() {
		return (EAttribute) nodeFXEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeFX_ScaleX() {
		return (EAttribute) nodeFXEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeFX_ScaleY() {
		return (EAttribute) nodeFXEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeFX_ScaleZ() {
		return (EAttribute) nodeFXEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeFX_TranslateX() {
		return (EAttribute) nodeFXEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeFX_TranslateY() {
		return (EAttribute) nodeFXEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeFX_TranslateZ() {
		return (EAttribute) nodeFXEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeFX_Visible() {
		return (EAttribute) nodeFXEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPointFX() {
		return pointFXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointFX_X() {
		return (EAttribute) pointFXEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointFX_Y() {
		return (EAttribute) pointFXEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShapeFX() {
		return shapeFXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShapeFX_Position() {
		return (EReference) shapeFXEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLineFX() {
		return lineFXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLineFX_EndPosition() {
		return (EReference) lineFXEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRectangleFX() {
		return rectangleFXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRectangleFX_Width() {
		return (EAttribute) rectangleFXEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRectangleFX_Height() {
		return (EAttribute) rectangleFXEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRectangleFX_ArcWidth() {
		return (EAttribute) rectangleFXEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRectangleFX_ArcHeight() {
		return (EAttribute) rectangleFXEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArcFX() {
		return arcFXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArcFX_Radius() {
		return (EAttribute) arcFXEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArcFX_StartAngle() {
		return (EAttribute) arcFXEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCircleFX() {
		return circleFXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCircleFX_Radius() {
		return (EAttribute) circleFXEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPolygonFX() {
		return polygonFXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPolygonFX_Points() {
		return (EReference) polygonFXEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextFX() {
		return textFXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextFX_Value() {
		return (EAttribute) textFXEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhotoShopFXFactory getPhotoShopFXFactory() {
		return (PhotoShopFXFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		photoShopFXEClass = createEClass(PHOTO_SHOP_FX);
		createEReference(photoShopFXEClass, PHOTO_SHOP_FX__NODES);

		nodeFXEClass = createEClass(NODE_FX);
		createEAttribute(nodeFXEClass, NODE_FX__NAME);
		createEAttribute(nodeFXEClass, NODE_FX__OPACITY);
		createEAttribute(nodeFXEClass, NODE_FX__STYLE);
		createEAttribute(nodeFXEClass, NODE_FX__STYLE_CLASS);
		createEAttribute(nodeFXEClass, NODE_FX__STROKE_WIDTH);
		createEAttribute(nodeFXEClass, NODE_FX__ROTATE);
		createEAttribute(nodeFXEClass, NODE_FX__SCALE_X);
		createEAttribute(nodeFXEClass, NODE_FX__SCALE_Y);
		createEAttribute(nodeFXEClass, NODE_FX__SCALE_Z);
		createEAttribute(nodeFXEClass, NODE_FX__TRANSLATE_X);
		createEAttribute(nodeFXEClass, NODE_FX__TRANSLATE_Y);
		createEAttribute(nodeFXEClass, NODE_FX__TRANSLATE_Z);
		createEAttribute(nodeFXEClass, NODE_FX__VISIBLE);

		pointFXEClass = createEClass(POINT_FX);
		createEAttribute(pointFXEClass, POINT_FX__X);
		createEAttribute(pointFXEClass, POINT_FX__Y);

		shapeFXEClass = createEClass(SHAPE_FX);
		createEReference(shapeFXEClass, SHAPE_FX__POSITION);

		lineFXEClass = createEClass(LINE_FX);
		createEReference(lineFXEClass, LINE_FX__END_POSITION);

		rectangleFXEClass = createEClass(RECTANGLE_FX);
		createEAttribute(rectangleFXEClass, RECTANGLE_FX__WIDTH);
		createEAttribute(rectangleFXEClass, RECTANGLE_FX__HEIGHT);
		createEAttribute(rectangleFXEClass, RECTANGLE_FX__ARC_WIDTH);
		createEAttribute(rectangleFXEClass, RECTANGLE_FX__ARC_HEIGHT);

		arcFXEClass = createEClass(ARC_FX);
		createEAttribute(arcFXEClass, ARC_FX__RADIUS);
		createEAttribute(arcFXEClass, ARC_FX__START_ANGLE);

		circleFXEClass = createEClass(CIRCLE_FX);
		createEAttribute(circleFXEClass, CIRCLE_FX__RADIUS);

		polygonFXEClass = createEClass(POLYGON_FX);
		createEReference(polygonFXEClass, POLYGON_FX__POINTS);

		textFXEClass = createEClass(TEXT_FX);
		createEAttribute(textFXEClass, TEXT_FX__VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pointFXEClass.getESuperTypes().add(this.getNodeFX());
		shapeFXEClass.getESuperTypes().add(this.getNodeFX());
		lineFXEClass.getESuperTypes().add(this.getShapeFX());
		rectangleFXEClass.getESuperTypes().add(this.getShapeFX());
		arcFXEClass.getESuperTypes().add(this.getShapeFX());
		circleFXEClass.getESuperTypes().add(this.getShapeFX());
		polygonFXEClass.getESuperTypes().add(this.getShapeFX());
		textFXEClass.getESuperTypes().add(this.getShapeFX());

		// Initialize classes, features, and operations; add parameters
		initEClass(photoShopFXEClass, PhotoShopFX.class, "PhotoShopFX", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhotoShopFX_Nodes(), this.getNodeFX(), null, "nodes", null, 0, -1, PhotoShopFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeFXEClass, NodeFX.class, "NodeFX", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeFX_Name(), theEcorePackage.getEString(), "name", null, 0, 1, NodeFX.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeFX_Opacity(), theEcorePackage.getEDouble(), "opacity", "1.0", 0, 1, NodeFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getNodeFX_Style(), theEcorePackage.getEString(), "style", null, 0, 1, NodeFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getNodeFX_StyleClass(), theEcorePackage.getEString(), "styleClass", null, 0, 1, NodeFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getNodeFX_StrokeWidth(), theEcorePackage.getEDouble(), "strokeWidth", "1.0", 0, 1, NodeFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getNodeFX_Rotate(), theEcorePackage.getEDouble(), "rotate", null, 0, 1, NodeFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getNodeFX_ScaleX(), theEcorePackage.getEDouble(), "scaleX", null, 0, 1, NodeFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getNodeFX_ScaleY(), theEcorePackage.getEDouble(), "scaleY", null, 0, 1, NodeFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getNodeFX_ScaleZ(), theEcorePackage.getEDouble(), "scaleZ", null, 0, 1, NodeFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getNodeFX_TranslateX(), theEcorePackage.getEDouble(), "translateX", null, 0, 1, NodeFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getNodeFX_TranslateY(), theEcorePackage.getEDouble(), "translateY", null, 0, 1, NodeFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getNodeFX_TranslateZ(), theEcorePackage.getEDouble(), "translateZ", null, 0, 1, NodeFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getNodeFX_Visible(), theEcorePackage.getEBoolean(), "visible", "true", 0, 1, NodeFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(pointFXEClass, PointFX.class, "PointFX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPointFX_X(), theEcorePackage.getEDouble(), "x", "10", 0, 1, PointFX.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPointFX_Y(), theEcorePackage.getEDouble(), "y", "10", 0, 1, PointFX.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shapeFXEClass, ShapeFX.class, "ShapeFX", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShapeFX_Position(), this.getPointFX(), null, "position", null, 0, 1, ShapeFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineFXEClass, LineFX.class, "LineFX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLineFX_EndPosition(), this.getPointFX(), null, "endPosition", null, 0, 1, LineFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rectangleFXEClass, RectangleFX.class, "RectangleFX", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRectangleFX_Width(), theEcorePackage.getEDouble(), "width", "100", 0, 1, RectangleFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getRectangleFX_Height(), theEcorePackage.getEDouble(), "height", "100", 0, 1, RectangleFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getRectangleFX_ArcWidth(), theEcorePackage.getEDouble(), "arcWidth", "0", 0, 1,
				RectangleFX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangleFX_ArcHeight(), theEcorePackage.getEDouble(), "arcHeight", "0", 0, 1,
				RectangleFX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(arcFXEClass, ArcFX.class, "ArcFX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArcFX_Radius(), theEcorePackage.getEDouble(), "radius", null, 0, 1, ArcFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getArcFX_StartAngle(), theEcorePackage.getEDouble(), "startAngle", null, 0, 1, ArcFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(circleFXEClass, CircleFX.class, "CircleFX", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCircleFX_Radius(), theEcorePackage.getEDouble(), "radius", null, 0, 1, CircleFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(polygonFXEClass, PolygonFX.class, "PolygonFX", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolygonFX_Points(), this.getPointFX(), null, "points", null, 0, -1, PolygonFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textFXEClass, TextFX.class, "TextFX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextFX_Value(), theEcorePackage.getEString(), "value", null, 0, 1, TextFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PhotoShopFXPackageImpl
