package org.soyatec.tooling.views.properties;

import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.forms.widgets.FormToolkit;

public interface IPropertyTab extends ISelectionListener {

	boolean isExpanded();

	String getName();

	String getDescription();

	Control createControl(FormToolkit factory, Composite parent);

	ToolBarManager getToolBarManager();

	void dispose();
}
