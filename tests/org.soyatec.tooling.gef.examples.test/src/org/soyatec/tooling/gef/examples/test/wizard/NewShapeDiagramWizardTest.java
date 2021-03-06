package org.soyatec.tooling.gef.examples.test.wizard;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.junit.Assert;
import org.junit.Test;
import org.soyatec.tooling.gef.examples.test.BasicTestCase;
import org.soyatec.tooling.gef.examples.wizards.NewShapeDiagramWizard;

public class NewShapeDiagramWizardTest extends BasicTestCase {

	@Test
	public void test() {
		final NewShapeDiagramWizard wizard = new NewShapeDiagramWizard();
		final IProject project = getProject();
		wizard.init(getWorkbench(), new StructuredSelection(project));
		final WizardDialog dialog = new WizardDialog(getActiveShell(), wizard);
		dialog.create();
		final IWizardPage[] pages = wizard.getPages();
		Assert.assertEquals(1, pages.length);

		final String fileName = "newShapeDiagram";
		((WizardNewFileCreationPage) pages[0]).setFileName(fileName);

		Assert.assertTrue(wizard.performFinish());

		final IFile file = project.getFile(fileName + ".ecsoya");
		Assert.assertTrue(file.exists());
	}
}
