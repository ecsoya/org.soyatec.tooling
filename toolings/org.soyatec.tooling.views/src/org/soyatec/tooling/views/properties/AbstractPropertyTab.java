/*******************************************************************************
 * Copyright (c) 2015 Soyatec and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Soyatec - initial API and implementation
 *******************************************************************************/
package org.soyatec.tooling.views.properties;

import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPart;

public abstract class AbstractPropertyTab implements IPropertyTab {

	protected IWorkbenchPart activePart;
	protected ISelection selection;
	protected Object input;

	private boolean isManualRefresh;

	public void selectionChanged(final IWorkbenchPart part,
			final ISelection selection) {
		if (activePart != null && activePart == part && this.selection != null
				&& this.selection.equals(selection)) {
			return;
		}
		this.activePart = part;
		this.selection = selection;
		Object input = null;
		if (selection instanceof IStructuredSelection) {
			input = ((IStructuredSelection) selection).getFirstElement();
		}
		setInput(input);
		refresh();
	}

	protected void setInput(final Object newInput) {
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

	public boolean refresh() {
		return !isManualRefresh();
	}

	@Override
	public boolean isManualRefresh() {
		return isManualRefresh;
	}

	@Override
	public void setManualRefresh(final boolean manualRefresh) {
		this.isManualRefresh = manualRefresh;
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
