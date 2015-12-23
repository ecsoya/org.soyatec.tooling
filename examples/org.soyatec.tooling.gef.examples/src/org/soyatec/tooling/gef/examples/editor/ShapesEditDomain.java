package org.soyatec.tooling.gef.examples.editor;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.ui.IEditorPart;
import org.soyatec.tooling.gef.commands.CombinedCommandStack;
import org.soyatec.tooling.gef.toolbar.editor.ToolBarEditDomain;

public class ShapesEditDomain extends ToolBarEditDomain implements
        IEditingDomainProvider {

    private EditingDomain editingDomain;

    public ShapesEditDomain(final IEditorPart editorPart,
            final EditingDomain editingDomain) {
        super(editorPart);
        this.editingDomain = editingDomain;
    }

    @Override
    public CommandStack getCommandStack() {
        if (editingDomain != null) {
            final org.eclipse.emf.common.command.CommandStack commandStack = editingDomain
                    .getCommandStack();
            if (commandStack instanceof CombinedCommandStack) {
                return ((CombinedCommandStack) commandStack)
                        .getGefCommandStack();
            }
        }
        return super.getCommandStack();
    }

    public EditingDomain getEditingDomain() {
        return editingDomain;
    }

}
