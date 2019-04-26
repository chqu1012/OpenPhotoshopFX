/**
 */
package de.dc.javafx.photoshop.model.provider;

import de.dc.javafx.photoshop.model.NodeFX;
import de.dc.javafx.photoshop.model.PhotoShopFXPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.dc.javafx.photoshop.model.NodeFX} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NodeFXItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeFXItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addOpacityPropertyDescriptor(object);
			addStylePropertyDescriptor(object);
			addStyleClassPropertyDescriptor(object);
			addStrokeWidthPropertyDescriptor(object);
			addStrokeColorPropertyDescriptor(object);
			addRotatePropertyDescriptor(object);
			addScaleXPropertyDescriptor(object);
			addScaleYPropertyDescriptor(object);
			addScaleZPropertyDescriptor(object);
			addTranslateXPropertyDescriptor(object);
			addTranslateYPropertyDescriptor(object);
			addTranslateZPropertyDescriptor(object);
			addVisiblePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_NodeFX_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_NodeFX_name_feature", "_UI_NodeFX_type"),
						PhotoShopFXPackage.Literals.NODE_FX__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_DetailsPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Opacity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOpacityPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_NodeFX_opacity_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_NodeFX_opacity_feature",
								"_UI_NodeFX_type"),
						PhotoShopFXPackage.Literals.NODE_FX__OPACITY, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, getString("_UI_DetailsPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Style feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStylePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_NodeFX_style_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_NodeFX_style_feature", "_UI_NodeFX_type"),
						PhotoShopFXPackage.Literals.NODE_FX__STYLE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_DetailsPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Style Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStyleClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_NodeFX_styleClass_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_NodeFX_styleClass_feature",
								"_UI_NodeFX_type"),
						PhotoShopFXPackage.Literals.NODE_FX__STYLE_CLASS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_DetailsPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Stroke Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrokeWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_NodeFX_strokeWidth_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_NodeFX_strokeWidth_feature",
								"_UI_NodeFX_type"),
						PhotoShopFXPackage.Literals.NODE_FX__STROKE_WIDTH, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, getString("_UI_DetailsPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Stroke Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrokeColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_NodeFX_strokeColor_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_NodeFX_strokeColor_feature",
								"_UI_NodeFX_type"),
						PhotoShopFXPackage.Literals.NODE_FX__STROKE_COLOR, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_DetailsPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Rotate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRotatePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_NodeFX_rotate_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_NodeFX_rotate_feature", "_UI_NodeFX_type"),
						PhotoShopFXPackage.Literals.NODE_FX__ROTATE, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Scale X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScaleXPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_NodeFX_scaleX_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_NodeFX_scaleX_feature", "_UI_NodeFX_type"),
						PhotoShopFXPackage.Literals.NODE_FX__SCALE_X, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Scale Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScaleYPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_NodeFX_scaleY_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_NodeFX_scaleY_feature", "_UI_NodeFX_type"),
						PhotoShopFXPackage.Literals.NODE_FX__SCALE_Y, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Scale Z feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScaleZPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_NodeFX_scaleZ_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_NodeFX_scaleZ_feature", "_UI_NodeFX_type"),
						PhotoShopFXPackage.Literals.NODE_FX__SCALE_Z, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Translate X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTranslateXPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_NodeFX_translateX_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_NodeFX_translateX_feature",
								"_UI_NodeFX_type"),
						PhotoShopFXPackage.Literals.NODE_FX__TRANSLATE_X, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Translate Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTranslateYPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_NodeFX_translateY_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_NodeFX_translateY_feature",
								"_UI_NodeFX_type"),
						PhotoShopFXPackage.Literals.NODE_FX__TRANSLATE_Y, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Translate Z feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTranslateZPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_NodeFX_translateZ_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_NodeFX_translateZ_feature",
								"_UI_NodeFX_type"),
						PhotoShopFXPackage.Literals.NODE_FX__TRANSLATE_Z, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Visible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_NodeFX_visible_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_NodeFX_visible_feature",
								"_UI_NodeFX_type"),
						PhotoShopFXPackage.Literals.NODE_FX__VISIBLE, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((NodeFX) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_NodeFX_type")
				: getString("_UI_NodeFX_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(NodeFX.class)) {
		case PhotoShopFXPackage.NODE_FX__NAME:
		case PhotoShopFXPackage.NODE_FX__OPACITY:
		case PhotoShopFXPackage.NODE_FX__STYLE:
		case PhotoShopFXPackage.NODE_FX__STYLE_CLASS:
		case PhotoShopFXPackage.NODE_FX__STROKE_WIDTH:
		case PhotoShopFXPackage.NODE_FX__STROKE_COLOR:
		case PhotoShopFXPackage.NODE_FX__ROTATE:
		case PhotoShopFXPackage.NODE_FX__SCALE_X:
		case PhotoShopFXPackage.NODE_FX__SCALE_Y:
		case PhotoShopFXPackage.NODE_FX__SCALE_Z:
		case PhotoShopFXPackage.NODE_FX__TRANSLATE_X:
		case PhotoShopFXPackage.NODE_FX__TRANSLATE_Y:
		case PhotoShopFXPackage.NODE_FX__TRANSLATE_Z:
		case PhotoShopFXPackage.NODE_FX__VISIBLE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ModelEditPlugin.INSTANCE;
	}

}
