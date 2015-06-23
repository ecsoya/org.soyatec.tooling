package org.soyatec.tooling.views.properties;

import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPart;

public abstract class AbstractPropertyTab implements IPropertyTab {

	protected IWorkbenchPart activePart;
	protected ISelection selection;
	protected Object input;

	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		this.activePart = part;
		this.selection = selection;
		Object input = null;
		if (selection instanceof IStructuredSelection) {
			input = ((IStructuredSelection) selection).getFirstElement();
		}
		setInput(input);
		refresh();
	}

	protected void setInput(Object newInput) {
		this.input = newInput;
	}

	public Object getInput() {
		return input;
	}

	public IWorkbenchPart getActivePart() {
		return activePart;
	}

	public ISelection getSelection() {
		return selection;
	}

	protected void refresh() {

	}

	public ToolBarManager getToolBarManager() {
		return null;
	}

	public void dispose() {

	}

	public boolean isExpanded() {
		return true;
	}
}
