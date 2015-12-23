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
package org.soyatec.tooling.gef.properties;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gef.commands.CommandStack;
import org.soyatec.tooling.gef.commands.CommandWrap2GEF;
import org.soyatec.tooling.views.properties.AbstractPropertyTab;
import org.soyatec.tooling.views.properties.IPropertyTab;

/**
 * PropertyTab which based on GEF Commands.
 *
 * @author Ecsoya
 */
public abstract class CommandPropertyTab extends AbstractPropertyTab implements
        IPropertyTab {

    protected EditingDomain getEditingDomain() {
        EditingDomain domain = null;
        if (activePart != null) {
            domain = AdapterFactoryEditingDomain
                    .getEditingDomainFor(activePart);
        }
        if (domain == null && input != null) {
            domain = AdapterFactoryEditingDomain.getEditingDomainFor(input);
        }
        return domain;
    }

    protected void executeCommand(final Command command) {
        if (command == null || !command.canExecute()) {
            return;
        }
        final EditingDomain editingDomain = getEditingDomain();
        if (editingDomain == null || editingDomain.getCommandStack() == null) {
            executeCommand(new CommandWrap2GEF(command));
        } else {
            editingDomain.getCommandStack().execute(command);
        }
    }

    protected void executeCommand(final org.eclipse.gef.commands.Command command) {
        if (command == null || !command.canExecute()) {
            return;
        }
        final CommandStack commandStack = getCommandStack();
        if (commandStack != null) {
            commandStack.execute(command);
        } else {
            command.execute();
        }
    }

    protected CommandStack getCommandStack() {
        if (activePart != null) {
            return (CommandStack) activePart.getAdapter(CommandStack.class);
        }
        return null;
    }

}
