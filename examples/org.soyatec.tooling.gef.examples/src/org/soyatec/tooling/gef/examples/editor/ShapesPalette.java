package org.soyatec.tooling.gef.examples.editor;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.palette.ConnectionCreationToolEntry;
import org.eclipse.gef.palette.CreationToolEntry;
import org.eclipse.gef.palette.MarqueeToolEntry;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.SelectionToolEntry;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gef.requests.CreationFactory;
import org.eclipse.gef.tools.ConnectionCreationTool;
import org.eclipse.jface.resource.ImageDescriptor;
import org.soyatec.tooling.di.DiPackage;
import org.soyatec.tooling.di.View;
import org.soyatec.tooling.gef.examples.Activator;
import org.soyatec.tooling.gef.examples.shapes.ShapesPackage;

public class ShapesPalette {

	private ShapesPalette() {
	}

	public static PaletteRoot create() {
		PaletteRoot paletteRoot = new PaletteRoot();

		addCommonTools(paletteRoot);

		addShapeTools(paletteRoot);

		addConnectionTools(paletteRoot);

		return paletteRoot;
	}

	private static void addConnectionTools(PaletteRoot parent) {
		final PaletteGroup connGroup = new PaletteGroup("Connections");

		connGroup.add(createToolEntry(
				"Solid Line",
				"Solid Line",
				createCreationFactory(ShapesPackage.eINSTANCE.getSolidLine(),
						DiPackage.eINSTANCE.getConnector()),
				"icons/solidline_16.gif", "icons/solidline_24.gif",
				ConnectionCreationToolEntry.class));

		connGroup.add(createToolEntry(
				"Dashed Line",
				"Dashed Line",
				createCreationFactory(ShapesPackage.eINSTANCE.getDashedLine(),
						DiPackage.eINSTANCE.getConnector()),
				"icons/dashline_16.gif", "icons/dashline_24.gif",
				ConnectionCreationToolEntry.class));

		parent.add(connGroup);
	}

	private static ToolEntry createToolEntry(String label, String description,
			CreationFactory factory, String smallIconPath,
			String largeIconPath, Class<? extends ToolEntry> entryClass) {
		ImageDescriptor iconSmall = ImageDescriptor.createFromFile(
				Activator.class, smallIconPath);
		ImageDescriptor iconLarge = ImageDescriptor.createFromFile(
				Activator.class, largeIconPath);
		if (CreationToolEntry.class == entryClass) {
			return new CreationToolEntry(label, description, factory,
					iconSmall, iconLarge);
		} else if (ConnectionCreationToolEntry.class == entryClass) {
			ConnectionCreationToolEntry entry = new ConnectionCreationToolEntry(
					label, description, factory, iconSmall, iconLarge);
			entry.setToolProperty(
					ConnectionCreationTool.PROPERTY_UNLOAD_WHEN_FINISHED, true);
			return entry;
		}
		return null;
	}

	private static CreationFactory createCreationFactory(
			final EClass elementType, final EClass viewType) {

		return new CreationFactory() {

			@Override
			public Object getObjectType() {
				return elementType;
			}

			@Override
			public Object getNewObject() {
				final EObject object = viewType.getEPackage()
						.getEFactoryInstance().create(viewType);
				if (object instanceof View) {
					EObject element = elementType.getEPackage()
							.getEFactoryInstance().create(elementType);
					((View) object).setElement(element);
				}
				return object;
			}
		};
	}

	private static void addShapeTools(PaletteRoot parent) {
		final PaletteGroup shapeGroup = new PaletteGroup("Shapes");

		shapeGroup.add(createToolEntry(
				"Rectangle",
				"Rectangle",
				createCreationFactory(ShapesPackage.eINSTANCE.getRectangle(),
						DiPackage.eINSTANCE.getGradientShape()),
				"icons/rectangle_16.gif", "icons/rectangle_24.gif",
				CreationToolEntry.class));

		shapeGroup.add(createToolEntry(
				"Ellipse",
				"Ellipse",
				createCreationFactory(ShapesPackage.eINSTANCE.getEllipse(),
						DiPackage.eINSTANCE.getShape()),
				"icons/ellipse_16.gif", "icons/ellipse_24.gif",
				CreationToolEntry.class));

		parent.add(shapeGroup);
	}

	private static PaletteGroup addCommonTools(final PaletteContainer parent) {
		final PaletteGroup commonTools = new PaletteGroup("Common Tools"); //$NON-NLS-1$
		final SelectionToolEntry entry = new SelectionToolEntry();
		commonTools.add(entry);
		if (parent instanceof PaletteRoot) {
			((PaletteRoot) parent).setDefaultEntry(entry);
		}
		commonTools.add(new MarqueeToolEntry());

		parent.add(commonTools);
		return commonTools;
	}

}
