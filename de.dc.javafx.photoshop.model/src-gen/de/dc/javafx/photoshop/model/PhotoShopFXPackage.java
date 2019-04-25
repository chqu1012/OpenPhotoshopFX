/**
 */
package de.dc.javafx.photoshop.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dc.javafx.photoshop.model.PhotoShopFXFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel multipleEditorPages='false' creationIcons='false' editDirectory='/de.dc.javafx.photoshop.model.edit/src-gen' editorDirectory='/de.dc.javafx.photoshop.model.editor/src-gen' richClientPlatform='true' codeFormatting='true' importerID='org.eclipse.emf.importer.ecore' runtimePlatform='RCP' prefix='PhotoShopFX' findAction='true' autoResizeProperties='true' creationSubmenus='true' fileExtensions='psfx' basePackage='de.dc.javafx.photoshop'"
 * @generated
 */
public interface PhotoShopFXPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.frater-anatis.org/javafx";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "psfx";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PhotoShopFXPackage eINSTANCE = de.dc.javafx.photoshop.model.impl.PhotoShopFXPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dc.javafx.photoshop.model.impl.PhotoShopFXImpl <em>Photo Shop FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.photoshop.model.impl.PhotoShopFXImpl
	 * @see de.dc.javafx.photoshop.model.impl.PhotoShopFXPackageImpl#getPhotoShopFX()
	 * @generated
	 */
	int PHOTO_SHOP_FX = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_SHOP_FX__NODES = 0;

	/**
	 * The number of structural features of the '<em>Photo Shop FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_SHOP_FX_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Photo Shop FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_SHOP_FX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.photoshop.model.impl.NodeFXImpl <em>Node FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.photoshop.model.impl.NodeFXImpl
	 * @see de.dc.javafx.photoshop.model.impl.PhotoShopFXPackageImpl#getNodeFX()
	 * @generated
	 */
	int NODE_FX = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FX__NAME = 0;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FX__ROTATE = 1;

	/**
	 * The feature id for the '<em><b>Scale X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FX__SCALE_X = 2;

	/**
	 * The feature id for the '<em><b>Scale Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FX__SCALE_Y = 3;

	/**
	 * The feature id for the '<em><b>Scale Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FX__SCALE_Z = 4;

	/**
	 * The feature id for the '<em><b>Translate X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FX__TRANSLATE_X = 5;

	/**
	 * The feature id for the '<em><b>Translate Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FX__TRANSLATE_Y = 6;

	/**
	 * The feature id for the '<em><b>Translate Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FX__TRANSLATE_Z = 7;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FX__OPACITY = 8;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FX__STYLE = 9;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FX__STYLE_CLASS = 10;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FX__VISIBLE = 11;

	/**
	 * The number of structural features of the '<em>Node FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FX_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Node FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.photoshop.model.impl.PointFXImpl <em>Point FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.photoshop.model.impl.PointFXImpl
	 * @see de.dc.javafx.photoshop.model.impl.PhotoShopFXPackageImpl#getPointFX()
	 * @generated
	 */
	int POINT_FX = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FX__NAME = NODE_FX__NAME;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FX__ROTATE = NODE_FX__ROTATE;

	/**
	 * The feature id for the '<em><b>Scale X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FX__SCALE_X = NODE_FX__SCALE_X;

	/**
	 * The feature id for the '<em><b>Scale Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FX__SCALE_Y = NODE_FX__SCALE_Y;

	/**
	 * The feature id for the '<em><b>Scale Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FX__SCALE_Z = NODE_FX__SCALE_Z;

	/**
	 * The feature id for the '<em><b>Translate X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FX__TRANSLATE_X = NODE_FX__TRANSLATE_X;

	/**
	 * The feature id for the '<em><b>Translate Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FX__TRANSLATE_Y = NODE_FX__TRANSLATE_Y;

	/**
	 * The feature id for the '<em><b>Translate Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FX__TRANSLATE_Z = NODE_FX__TRANSLATE_Z;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FX__OPACITY = NODE_FX__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FX__STYLE = NODE_FX__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FX__STYLE_CLASS = NODE_FX__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FX__VISIBLE = NODE_FX__VISIBLE;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FX__X = NODE_FX_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FX__Y = NODE_FX_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Point FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FX_FEATURE_COUNT = NODE_FX_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Point FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FX_OPERATION_COUNT = NODE_FX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.photoshop.model.impl.ShapeFXImpl <em>Shape FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.photoshop.model.impl.ShapeFXImpl
	 * @see de.dc.javafx.photoshop.model.impl.PhotoShopFXPackageImpl#getShapeFX()
	 * @generated
	 */
	int SHAPE_FX = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FX__NAME = NODE_FX__NAME;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FX__ROTATE = NODE_FX__ROTATE;

	/**
	 * The feature id for the '<em><b>Scale X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FX__SCALE_X = NODE_FX__SCALE_X;

	/**
	 * The feature id for the '<em><b>Scale Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FX__SCALE_Y = NODE_FX__SCALE_Y;

	/**
	 * The feature id for the '<em><b>Scale Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FX__SCALE_Z = NODE_FX__SCALE_Z;

	/**
	 * The feature id for the '<em><b>Translate X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FX__TRANSLATE_X = NODE_FX__TRANSLATE_X;

	/**
	 * The feature id for the '<em><b>Translate Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FX__TRANSLATE_Y = NODE_FX__TRANSLATE_Y;

	/**
	 * The feature id for the '<em><b>Translate Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FX__TRANSLATE_Z = NODE_FX__TRANSLATE_Z;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FX__OPACITY = NODE_FX__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FX__STYLE = NODE_FX__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FX__STYLE_CLASS = NODE_FX__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FX__VISIBLE = NODE_FX__VISIBLE;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FX__POSITION = NODE_FX_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Shape FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FX_FEATURE_COUNT = NODE_FX_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Shape FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FX_OPERATION_COUNT = NODE_FX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.photoshop.model.impl.LineFXImpl <em>Line FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.photoshop.model.impl.LineFXImpl
	 * @see de.dc.javafx.photoshop.model.impl.PhotoShopFXPackageImpl#getLineFX()
	 * @generated
	 */
	int LINE_FX = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FX__NAME = SHAPE_FX__NAME;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FX__ROTATE = SHAPE_FX__ROTATE;

	/**
	 * The feature id for the '<em><b>Scale X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FX__SCALE_X = SHAPE_FX__SCALE_X;

	/**
	 * The feature id for the '<em><b>Scale Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FX__SCALE_Y = SHAPE_FX__SCALE_Y;

	/**
	 * The feature id for the '<em><b>Scale Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FX__SCALE_Z = SHAPE_FX__SCALE_Z;

	/**
	 * The feature id for the '<em><b>Translate X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FX__TRANSLATE_X = SHAPE_FX__TRANSLATE_X;

	/**
	 * The feature id for the '<em><b>Translate Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FX__TRANSLATE_Y = SHAPE_FX__TRANSLATE_Y;

	/**
	 * The feature id for the '<em><b>Translate Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FX__TRANSLATE_Z = SHAPE_FX__TRANSLATE_Z;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FX__OPACITY = SHAPE_FX__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FX__STYLE = SHAPE_FX__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FX__STYLE_CLASS = SHAPE_FX__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FX__VISIBLE = SHAPE_FX__VISIBLE;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FX__POSITION = SHAPE_FX__POSITION;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FX__END_POSITION = SHAPE_FX_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Line FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FX_FEATURE_COUNT = SHAPE_FX_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Line FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FX_OPERATION_COUNT = SHAPE_FX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.photoshop.model.impl.RectangleFXImpl <em>Rectangle FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.photoshop.model.impl.RectangleFXImpl
	 * @see de.dc.javafx.photoshop.model.impl.PhotoShopFXPackageImpl#getRectangleFX()
	 * @generated
	 */
	int RECTANGLE_FX = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FX__NAME = SHAPE_FX__NAME;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FX__ROTATE = SHAPE_FX__ROTATE;

	/**
	 * The feature id for the '<em><b>Scale X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FX__SCALE_X = SHAPE_FX__SCALE_X;

	/**
	 * The feature id for the '<em><b>Scale Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FX__SCALE_Y = SHAPE_FX__SCALE_Y;

	/**
	 * The feature id for the '<em><b>Scale Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FX__SCALE_Z = SHAPE_FX__SCALE_Z;

	/**
	 * The feature id for the '<em><b>Translate X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FX__TRANSLATE_X = SHAPE_FX__TRANSLATE_X;

	/**
	 * The feature id for the '<em><b>Translate Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FX__TRANSLATE_Y = SHAPE_FX__TRANSLATE_Y;

	/**
	 * The feature id for the '<em><b>Translate Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FX__TRANSLATE_Z = SHAPE_FX__TRANSLATE_Z;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FX__OPACITY = SHAPE_FX__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FX__STYLE = SHAPE_FX__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FX__STYLE_CLASS = SHAPE_FX__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FX__VISIBLE = SHAPE_FX__VISIBLE;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FX__POSITION = SHAPE_FX__POSITION;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FX__WIDTH = SHAPE_FX_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FX__HEIGHT = SHAPE_FX_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rectangle FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FX_FEATURE_COUNT = SHAPE_FX_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rectangle FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FX_OPERATION_COUNT = SHAPE_FX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.photoshop.model.impl.ArcFXImpl <em>Arc FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.photoshop.model.impl.ArcFXImpl
	 * @see de.dc.javafx.photoshop.model.impl.PhotoShopFXPackageImpl#getArcFX()
	 * @generated
	 */
	int ARC_FX = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FX__NAME = SHAPE_FX__NAME;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FX__ROTATE = SHAPE_FX__ROTATE;

	/**
	 * The feature id for the '<em><b>Scale X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FX__SCALE_X = SHAPE_FX__SCALE_X;

	/**
	 * The feature id for the '<em><b>Scale Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FX__SCALE_Y = SHAPE_FX__SCALE_Y;

	/**
	 * The feature id for the '<em><b>Scale Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FX__SCALE_Z = SHAPE_FX__SCALE_Z;

	/**
	 * The feature id for the '<em><b>Translate X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FX__TRANSLATE_X = SHAPE_FX__TRANSLATE_X;

	/**
	 * The feature id for the '<em><b>Translate Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FX__TRANSLATE_Y = SHAPE_FX__TRANSLATE_Y;

	/**
	 * The feature id for the '<em><b>Translate Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FX__TRANSLATE_Z = SHAPE_FX__TRANSLATE_Z;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FX__OPACITY = SHAPE_FX__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FX__STYLE = SHAPE_FX__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FX__STYLE_CLASS = SHAPE_FX__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FX__VISIBLE = SHAPE_FX__VISIBLE;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FX__POSITION = SHAPE_FX__POSITION;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FX__RADIUS = SHAPE_FX_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FX__START_ANGLE = SHAPE_FX_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arc FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FX_FEATURE_COUNT = SHAPE_FX_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Arc FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FX_OPERATION_COUNT = SHAPE_FX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.photoshop.model.impl.CircleFXImpl <em>Circle FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.photoshop.model.impl.CircleFXImpl
	 * @see de.dc.javafx.photoshop.model.impl.PhotoShopFXPackageImpl#getCircleFX()
	 * @generated
	 */
	int CIRCLE_FX = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_FX__NAME = SHAPE_FX__NAME;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_FX__ROTATE = SHAPE_FX__ROTATE;

	/**
	 * The feature id for the '<em><b>Scale X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_FX__SCALE_X = SHAPE_FX__SCALE_X;

	/**
	 * The feature id for the '<em><b>Scale Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_FX__SCALE_Y = SHAPE_FX__SCALE_Y;

	/**
	 * The feature id for the '<em><b>Scale Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_FX__SCALE_Z = SHAPE_FX__SCALE_Z;

	/**
	 * The feature id for the '<em><b>Translate X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_FX__TRANSLATE_X = SHAPE_FX__TRANSLATE_X;

	/**
	 * The feature id for the '<em><b>Translate Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_FX__TRANSLATE_Y = SHAPE_FX__TRANSLATE_Y;

	/**
	 * The feature id for the '<em><b>Translate Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_FX__TRANSLATE_Z = SHAPE_FX__TRANSLATE_Z;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_FX__OPACITY = SHAPE_FX__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_FX__STYLE = SHAPE_FX__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_FX__STYLE_CLASS = SHAPE_FX__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_FX__VISIBLE = SHAPE_FX__VISIBLE;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_FX__POSITION = SHAPE_FX__POSITION;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_FX__RADIUS = SHAPE_FX_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Circle FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_FX_FEATURE_COUNT = SHAPE_FX_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Circle FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_FX_OPERATION_COUNT = SHAPE_FX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.photoshop.model.impl.PolygonFXImpl <em>Polygon FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.photoshop.model.impl.PolygonFXImpl
	 * @see de.dc.javafx.photoshop.model.impl.PhotoShopFXPackageImpl#getPolygonFX()
	 * @generated
	 */
	int POLYGON_FX = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_FX__NAME = SHAPE_FX__NAME;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_FX__ROTATE = SHAPE_FX__ROTATE;

	/**
	 * The feature id for the '<em><b>Scale X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_FX__SCALE_X = SHAPE_FX__SCALE_X;

	/**
	 * The feature id for the '<em><b>Scale Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_FX__SCALE_Y = SHAPE_FX__SCALE_Y;

	/**
	 * The feature id for the '<em><b>Scale Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_FX__SCALE_Z = SHAPE_FX__SCALE_Z;

	/**
	 * The feature id for the '<em><b>Translate X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_FX__TRANSLATE_X = SHAPE_FX__TRANSLATE_X;

	/**
	 * The feature id for the '<em><b>Translate Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_FX__TRANSLATE_Y = SHAPE_FX__TRANSLATE_Y;

	/**
	 * The feature id for the '<em><b>Translate Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_FX__TRANSLATE_Z = SHAPE_FX__TRANSLATE_Z;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_FX__OPACITY = SHAPE_FX__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_FX__STYLE = SHAPE_FX__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_FX__STYLE_CLASS = SHAPE_FX__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_FX__VISIBLE = SHAPE_FX__VISIBLE;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_FX__POSITION = SHAPE_FX__POSITION;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_FX__POINTS = SHAPE_FX_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Polygon FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_FX_FEATURE_COUNT = SHAPE_FX_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Polygon FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_FX_OPERATION_COUNT = SHAPE_FX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.photoshop.model.impl.TextFXImpl <em>Text FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.photoshop.model.impl.TextFXImpl
	 * @see de.dc.javafx.photoshop.model.impl.PhotoShopFXPackageImpl#getTextFX()
	 * @generated
	 */
	int TEXT_FX = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FX__NAME = SHAPE_FX__NAME;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FX__ROTATE = SHAPE_FX__ROTATE;

	/**
	 * The feature id for the '<em><b>Scale X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FX__SCALE_X = SHAPE_FX__SCALE_X;

	/**
	 * The feature id for the '<em><b>Scale Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FX__SCALE_Y = SHAPE_FX__SCALE_Y;

	/**
	 * The feature id for the '<em><b>Scale Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FX__SCALE_Z = SHAPE_FX__SCALE_Z;

	/**
	 * The feature id for the '<em><b>Translate X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FX__TRANSLATE_X = SHAPE_FX__TRANSLATE_X;

	/**
	 * The feature id for the '<em><b>Translate Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FX__TRANSLATE_Y = SHAPE_FX__TRANSLATE_Y;

	/**
	 * The feature id for the '<em><b>Translate Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FX__TRANSLATE_Z = SHAPE_FX__TRANSLATE_Z;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FX__OPACITY = SHAPE_FX__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FX__STYLE = SHAPE_FX__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FX__STYLE_CLASS = SHAPE_FX__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FX__VISIBLE = SHAPE_FX__VISIBLE;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FX__POSITION = SHAPE_FX__POSITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FX__VALUE = SHAPE_FX_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FX_FEATURE_COUNT = SHAPE_FX_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FX_OPERATION_COUNT = SHAPE_FX_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.photoshop.model.PhotoShopFX <em>Photo Shop FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Photo Shop FX</em>'.
	 * @see de.dc.javafx.photoshop.model.PhotoShopFX
	 * @generated
	 */
	EClass getPhotoShopFX();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.javafx.photoshop.model.PhotoShopFX#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see de.dc.javafx.photoshop.model.PhotoShopFX#getNodes()
	 * @see #getPhotoShopFX()
	 * @generated
	 */
	EReference getPhotoShopFX_Nodes();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.photoshop.model.NodeFX <em>Node FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node FX</em>'.
	 * @see de.dc.javafx.photoshop.model.NodeFX
	 * @generated
	 */
	EClass getNodeFX();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.photoshop.model.NodeFX#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.javafx.photoshop.model.NodeFX#getName()
	 * @see #getNodeFX()
	 * @generated
	 */
	EAttribute getNodeFX_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.photoshop.model.NodeFX#getRotate <em>Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotate</em>'.
	 * @see de.dc.javafx.photoshop.model.NodeFX#getRotate()
	 * @see #getNodeFX()
	 * @generated
	 */
	EAttribute getNodeFX_Rotate();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.photoshop.model.NodeFX#getScaleX <em>Scale X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale X</em>'.
	 * @see de.dc.javafx.photoshop.model.NodeFX#getScaleX()
	 * @see #getNodeFX()
	 * @generated
	 */
	EAttribute getNodeFX_ScaleX();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.photoshop.model.NodeFX#getScaleY <em>Scale Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Y</em>'.
	 * @see de.dc.javafx.photoshop.model.NodeFX#getScaleY()
	 * @see #getNodeFX()
	 * @generated
	 */
	EAttribute getNodeFX_ScaleY();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.photoshop.model.NodeFX#getScaleZ <em>Scale Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Z</em>'.
	 * @see de.dc.javafx.photoshop.model.NodeFX#getScaleZ()
	 * @see #getNodeFX()
	 * @generated
	 */
	EAttribute getNodeFX_ScaleZ();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.photoshop.model.NodeFX#getTranslateX <em>Translate X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Translate X</em>'.
	 * @see de.dc.javafx.photoshop.model.NodeFX#getTranslateX()
	 * @see #getNodeFX()
	 * @generated
	 */
	EAttribute getNodeFX_TranslateX();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.photoshop.model.NodeFX#getTranslateY <em>Translate Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Translate Y</em>'.
	 * @see de.dc.javafx.photoshop.model.NodeFX#getTranslateY()
	 * @see #getNodeFX()
	 * @generated
	 */
	EAttribute getNodeFX_TranslateY();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.photoshop.model.NodeFX#getTranslateZ <em>Translate Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Translate Z</em>'.
	 * @see de.dc.javafx.photoshop.model.NodeFX#getTranslateZ()
	 * @see #getNodeFX()
	 * @generated
	 */
	EAttribute getNodeFX_TranslateZ();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.photoshop.model.NodeFX#getOpacity <em>Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opacity</em>'.
	 * @see de.dc.javafx.photoshop.model.NodeFX#getOpacity()
	 * @see #getNodeFX()
	 * @generated
	 */
	EAttribute getNodeFX_Opacity();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.photoshop.model.NodeFX#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see de.dc.javafx.photoshop.model.NodeFX#getStyle()
	 * @see #getNodeFX()
	 * @generated
	 */
	EAttribute getNodeFX_Style();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.photoshop.model.NodeFX#getStyleClass <em>Style Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Class</em>'.
	 * @see de.dc.javafx.photoshop.model.NodeFX#getStyleClass()
	 * @see #getNodeFX()
	 * @generated
	 */
	EAttribute getNodeFX_StyleClass();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.photoshop.model.NodeFX#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see de.dc.javafx.photoshop.model.NodeFX#isVisible()
	 * @see #getNodeFX()
	 * @generated
	 */
	EAttribute getNodeFX_Visible();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.photoshop.model.PointFX <em>Point FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point FX</em>'.
	 * @see de.dc.javafx.photoshop.model.PointFX
	 * @generated
	 */
	EClass getPointFX();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.photoshop.model.PointFX#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see de.dc.javafx.photoshop.model.PointFX#getX()
	 * @see #getPointFX()
	 * @generated
	 */
	EAttribute getPointFX_X();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.photoshop.model.PointFX#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see de.dc.javafx.photoshop.model.PointFX#getY()
	 * @see #getPointFX()
	 * @generated
	 */
	EAttribute getPointFX_Y();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.photoshop.model.ShapeFX <em>Shape FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape FX</em>'.
	 * @see de.dc.javafx.photoshop.model.ShapeFX
	 * @generated
	 */
	EClass getShapeFX();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.javafx.photoshop.model.ShapeFX#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see de.dc.javafx.photoshop.model.ShapeFX#getPosition()
	 * @see #getShapeFX()
	 * @generated
	 */
	EReference getShapeFX_Position();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.photoshop.model.LineFX <em>Line FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line FX</em>'.
	 * @see de.dc.javafx.photoshop.model.LineFX
	 * @generated
	 */
	EClass getLineFX();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.javafx.photoshop.model.LineFX#getEndPosition <em>End Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End Position</em>'.
	 * @see de.dc.javafx.photoshop.model.LineFX#getEndPosition()
	 * @see #getLineFX()
	 * @generated
	 */
	EReference getLineFX_EndPosition();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.photoshop.model.RectangleFX <em>Rectangle FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangle FX</em>'.
	 * @see de.dc.javafx.photoshop.model.RectangleFX
	 * @generated
	 */
	EClass getRectangleFX();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.photoshop.model.RectangleFX#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see de.dc.javafx.photoshop.model.RectangleFX#getWidth()
	 * @see #getRectangleFX()
	 * @generated
	 */
	EAttribute getRectangleFX_Width();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.photoshop.model.RectangleFX#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see de.dc.javafx.photoshop.model.RectangleFX#getHeight()
	 * @see #getRectangleFX()
	 * @generated
	 */
	EAttribute getRectangleFX_Height();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.photoshop.model.ArcFX <em>Arc FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc FX</em>'.
	 * @see de.dc.javafx.photoshop.model.ArcFX
	 * @generated
	 */
	EClass getArcFX();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.photoshop.model.ArcFX#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see de.dc.javafx.photoshop.model.ArcFX#getRadius()
	 * @see #getArcFX()
	 * @generated
	 */
	EAttribute getArcFX_Radius();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.photoshop.model.ArcFX#getStartAngle <em>Start Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Angle</em>'.
	 * @see de.dc.javafx.photoshop.model.ArcFX#getStartAngle()
	 * @see #getArcFX()
	 * @generated
	 */
	EAttribute getArcFX_StartAngle();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.photoshop.model.CircleFX <em>Circle FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circle FX</em>'.
	 * @see de.dc.javafx.photoshop.model.CircleFX
	 * @generated
	 */
	EClass getCircleFX();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.photoshop.model.CircleFX#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see de.dc.javafx.photoshop.model.CircleFX#getRadius()
	 * @see #getCircleFX()
	 * @generated
	 */
	EAttribute getCircleFX_Radius();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.photoshop.model.PolygonFX <em>Polygon FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polygon FX</em>'.
	 * @see de.dc.javafx.photoshop.model.PolygonFX
	 * @generated
	 */
	EClass getPolygonFX();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.javafx.photoshop.model.PolygonFX#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Points</em>'.
	 * @see de.dc.javafx.photoshop.model.PolygonFX#getPoints()
	 * @see #getPolygonFX()
	 * @generated
	 */
	EReference getPolygonFX_Points();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.photoshop.model.TextFX <em>Text FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text FX</em>'.
	 * @see de.dc.javafx.photoshop.model.TextFX
	 * @generated
	 */
	EClass getTextFX();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.photoshop.model.TextFX#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dc.javafx.photoshop.model.TextFX#getValue()
	 * @see #getTextFX()
	 * @generated
	 */
	EAttribute getTextFX_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PhotoShopFXFactory getPhotoShopFXFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dc.javafx.photoshop.model.impl.PhotoShopFXImpl <em>Photo Shop FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.photoshop.model.impl.PhotoShopFXImpl
		 * @see de.dc.javafx.photoshop.model.impl.PhotoShopFXPackageImpl#getPhotoShopFX()
		 * @generated
		 */
		EClass PHOTO_SHOP_FX = eINSTANCE.getPhotoShopFX();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHOTO_SHOP_FX__NODES = eINSTANCE.getPhotoShopFX_Nodes();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.photoshop.model.impl.NodeFXImpl <em>Node FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.photoshop.model.impl.NodeFXImpl
		 * @see de.dc.javafx.photoshop.model.impl.PhotoShopFXPackageImpl#getNodeFX()
		 * @generated
		 */
		EClass NODE_FX = eINSTANCE.getNodeFX();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_FX__NAME = eINSTANCE.getNodeFX_Name();

		/**
		 * The meta object literal for the '<em><b>Rotate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_FX__ROTATE = eINSTANCE.getNodeFX_Rotate();

		/**
		 * The meta object literal for the '<em><b>Scale X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_FX__SCALE_X = eINSTANCE.getNodeFX_ScaleX();

		/**
		 * The meta object literal for the '<em><b>Scale Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_FX__SCALE_Y = eINSTANCE.getNodeFX_ScaleY();

		/**
		 * The meta object literal for the '<em><b>Scale Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_FX__SCALE_Z = eINSTANCE.getNodeFX_ScaleZ();

		/**
		 * The meta object literal for the '<em><b>Translate X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_FX__TRANSLATE_X = eINSTANCE.getNodeFX_TranslateX();

		/**
		 * The meta object literal for the '<em><b>Translate Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_FX__TRANSLATE_Y = eINSTANCE.getNodeFX_TranslateY();

		/**
		 * The meta object literal for the '<em><b>Translate Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_FX__TRANSLATE_Z = eINSTANCE.getNodeFX_TranslateZ();

		/**
		 * The meta object literal for the '<em><b>Opacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_FX__OPACITY = eINSTANCE.getNodeFX_Opacity();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_FX__STYLE = eINSTANCE.getNodeFX_Style();

		/**
		 * The meta object literal for the '<em><b>Style Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_FX__STYLE_CLASS = eINSTANCE.getNodeFX_StyleClass();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_FX__VISIBLE = eINSTANCE.getNodeFX_Visible();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.photoshop.model.impl.PointFXImpl <em>Point FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.photoshop.model.impl.PointFXImpl
		 * @see de.dc.javafx.photoshop.model.impl.PhotoShopFXPackageImpl#getPointFX()
		 * @generated
		 */
		EClass POINT_FX = eINSTANCE.getPointFX();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT_FX__X = eINSTANCE.getPointFX_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT_FX__Y = eINSTANCE.getPointFX_Y();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.photoshop.model.impl.ShapeFXImpl <em>Shape FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.photoshop.model.impl.ShapeFXImpl
		 * @see de.dc.javafx.photoshop.model.impl.PhotoShopFXPackageImpl#getShapeFX()
		 * @generated
		 */
		EClass SHAPE_FX = eINSTANCE.getShapeFX();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE_FX__POSITION = eINSTANCE.getShapeFX_Position();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.photoshop.model.impl.LineFXImpl <em>Line FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.photoshop.model.impl.LineFXImpl
		 * @see de.dc.javafx.photoshop.model.impl.PhotoShopFXPackageImpl#getLineFX()
		 * @generated
		 */
		EClass LINE_FX = eINSTANCE.getLineFX();

		/**
		 * The meta object literal for the '<em><b>End Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_FX__END_POSITION = eINSTANCE.getLineFX_EndPosition();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.photoshop.model.impl.RectangleFXImpl <em>Rectangle FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.photoshop.model.impl.RectangleFXImpl
		 * @see de.dc.javafx.photoshop.model.impl.PhotoShopFXPackageImpl#getRectangleFX()
		 * @generated
		 */
		EClass RECTANGLE_FX = eINSTANCE.getRectangleFX();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGLE_FX__WIDTH = eINSTANCE.getRectangleFX_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGLE_FX__HEIGHT = eINSTANCE.getRectangleFX_Height();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.photoshop.model.impl.ArcFXImpl <em>Arc FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.photoshop.model.impl.ArcFXImpl
		 * @see de.dc.javafx.photoshop.model.impl.PhotoShopFXPackageImpl#getArcFX()
		 * @generated
		 */
		EClass ARC_FX = eINSTANCE.getArcFX();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC_FX__RADIUS = eINSTANCE.getArcFX_Radius();

		/**
		 * The meta object literal for the '<em><b>Start Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC_FX__START_ANGLE = eINSTANCE.getArcFX_StartAngle();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.photoshop.model.impl.CircleFXImpl <em>Circle FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.photoshop.model.impl.CircleFXImpl
		 * @see de.dc.javafx.photoshop.model.impl.PhotoShopFXPackageImpl#getCircleFX()
		 * @generated
		 */
		EClass CIRCLE_FX = eINSTANCE.getCircleFX();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCLE_FX__RADIUS = eINSTANCE.getCircleFX_Radius();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.photoshop.model.impl.PolygonFXImpl <em>Polygon FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.photoshop.model.impl.PolygonFXImpl
		 * @see de.dc.javafx.photoshop.model.impl.PhotoShopFXPackageImpl#getPolygonFX()
		 * @generated
		 */
		EClass POLYGON_FX = eINSTANCE.getPolygonFX();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLYGON_FX__POINTS = eINSTANCE.getPolygonFX_Points();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.photoshop.model.impl.TextFXImpl <em>Text FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.photoshop.model.impl.TextFXImpl
		 * @see de.dc.javafx.photoshop.model.impl.PhotoShopFXPackageImpl#getTextFX()
		 * @generated
		 */
		EClass TEXT_FX = eINSTANCE.getTextFX();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_FX__VALUE = eINSTANCE.getTextFX_Value();

	}

} //PhotoShopFXPackage
