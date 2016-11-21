/**
 */
package org.soyatec.tooling.gef.examples.shapes.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.soyatec.tooling.gef.examples.shapes.Rectangle;

/**
 * This is the item provider adapter for a
 * {@link org.soyatec.tooling.gef.examples.shapes.Rectangle} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class RectangleItemProvider extends ShapeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RectangleItemProvider(final AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(
			final Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This returns Rectangle.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(final Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/Rectangle"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(final Object object) {
		final String label = ((Rectangle) object).getLabel();
		return label == null || label.length() == 0 ? getString("_UI_Rectangle_type")
				: getString("_UI_Rectangle_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to
	 * update any cached children and by creating a viewer notification, which
	 * it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(final Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			final Collection<Object> newChildDescriptors, final Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
