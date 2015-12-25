package org.soyatec.tooling.gef.examples.test.wizard;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gef.requests.CreationFactory;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.ide.IDE;
import org.junit.Assert;
import org.junit.Test;
import org.soyatec.tooling.di.DiPackage;
import org.soyatec.tooling.di.View;
import org.soyatec.tooling.gef.examples.edit.parts.GraphDiagramEditPart;
import org.soyatec.tooling.gef.examples.edit.parts.RectangleEditPart;
import org.soyatec.tooling.gef.examples.editor.ShapesGraphicalEditor;
import org.soyatec.tooling.gef.examples.shapes.ShapesPackage;
import org.soyatec.tooling.gef.examples.test.BasicTestCase;
import org.soyatec.tooling.gef.examples.wizards.NewShapeDiagramWizard;

public class NewShapeDiagramWizardTest extends BasicTestCase {

	@Test
	public void test() {
		NewShapeDiagramWizard wizard = new NewShapeDiagramWizard();
		IProject project = getProject();
		wizard.init(getWorkbench(), new StructuredSelection(project));
		WizardDialog dialog = new WizardDialog(getActiveShell(), wizard);
		dialog.create();
		IWizardPage[] pages = wizard.getPages();
		Assert.assertEquals(1, pages.length);

		String fileName = "newShapeDiagram";
		((WizardNewFileCreationPage) pages[0]).setFileName(fileName);

		Assert.assertTrue(wizard.performFinish());

		IFile file = project.getFile(fileName + ".ecsoya");
		Assert.assertTrue(file.exists());

		try {
			IEditorPart editor = IDE.openEditor(getWorkbench()
					.getActiveWorkbenchWindow().getActivePage(), file);
			Assert.assertTrue(editor instanceof ShapesGraphicalEditor);

			ShapesGraphicalEditor shapesEditor = (ShapesGraphicalEditor) editor;
			GraphicalViewer viewer = (GraphicalViewer) shapesEditor
					.getAdapter(GraphicalViewer.class);
			EditPart contents = viewer.getContents();
			Assert.assertTrue(contents instanceof GraphDiagramEditPart);

			CreateRequest request = new CreateRequest(
					RequestConstants.REQ_CREATE);
			request.setLocation(new Point(100, 100));
			request.setFactory(createCreationFactory(
					ShapesPackage.eINSTANCE.getRectangle(),
					DiPackage.eINSTANCE.getGradientShape()));
			
			Command command = contents.getCommand(request);
			
			Assert.assertNotNull(command);
			Assert.assertTrue(command.canExecute());
			
			command.execute();

			List children = contents.getChildren();
			Assert.assertEquals(children.size(), 1);
			Object object = children.get(0);
			Assert.assertTrue(object instanceof RectangleEditPart);
			
			
		} catch (PartInitException e) {
			Assert.fail(e.getMessage());
		}
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
}
