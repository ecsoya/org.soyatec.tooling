package org.soyatec.tooling.gef.examples.wizards;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.wizards.newresource.BasicNewFileResourceWizard;
import org.soyatec.tooling.di.DiFactory;
import org.soyatec.tooling.di.Diagram;
import org.soyatec.tooling.gef.examples.shapes.Graph;
import org.soyatec.tooling.gef.examples.shapes.ShapesFactory;

public class NewShapeDiagramWizard extends BasicNewFileResourceWizard implements
		INewWizard {
	private WizardNewFileCreationPage mainPage;

	public NewShapeDiagramWizard() {
	}

	public void addPages() {
		mainPage = new WizardNewFileCreationPage("newFilePage1", getSelection());//$NON-NLS-1$
		mainPage.setFileExtension("ecsoya");
		mainPage.setTitle("Shapes Diagram");
		mainPage.setDescription("Create new shapes diagram");
		addPage(mainPage);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);
	}

	@Override
	public boolean performFinish() {
		IFile file = mainPage.createNewFile();
		if (file == null) {
			return false;
		}

		initFileContent(file);

		selectAndReveal(file);

		// Open editor on new file.
		IWorkbenchWindow dw = getWorkbench().getActiveWorkbenchWindow();
		try {
			if (dw != null) {
				IWorkbenchPage page = dw.getActivePage();
				if (page != null) {
					IDE.openEditor(page, file, true);
				}
			}
		} catch (PartInitException e) {
			e.printStackTrace();
		}

		return true;
	}

	private void initFileContent(IFile file) {
		Diagram diagram = DiFactory.eINSTANCE.createDiagram();

		Graph graph = ShapesFactory.eINSTANCE.createGraph();
		diagram.setElement(graph);

		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet
				.createResource(URI.createPlatformResourceURI(file
						.getFullPath().toString(), true));
		resource.getContents().add(graph);
		resource.getContents().add(diagram);
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
