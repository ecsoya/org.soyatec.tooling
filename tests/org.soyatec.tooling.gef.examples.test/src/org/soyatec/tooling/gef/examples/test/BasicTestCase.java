package org.soyatec.tooling.gef.examples.test;

import static org.junit.Assert.*;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BasicTestCase {

	private IProject project;

	@Before
	public void setUp() throws Exception {
		project = ResourcesPlugin.getWorkspace().getRoot().getProject("test");
		if (!project.exists()) {
			project.create(null);
		}
		if (!project.isOpen()) {
			project.open(null);
		}
	}

	@After
	public void tearDown() throws Exception {
		project.delete(true, null);
	}

	public IProject getProject() {
		return project;
	}

	@Test
	public void test() {
		assertNotNull(project);

		assertNotNull(getActiveShell());
	}

	public IWorkbench getWorkbench() {
		IWorkbench workbench = org.soyatec.tooling.gef.examples.Activator
				.getDefault().getWorkbench();
		assertNotNull(workbench);
		return workbench;
	}

	public Shell getActiveShell() {
		IWorkbench workbench = getWorkbench();
		IWorkbenchWindow activeWorkbenchWindow = workbench
				.getActiveWorkbenchWindow();
		assertNotNull(activeWorkbenchWindow);
		Shell shell = activeWorkbenchWindow.getShell();
		assertNotNull(shell);
		assertEquals(shell.getDisplay(), Display.getCurrent());
		return shell;
	}

}
