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
package org.soyatec.tooling.gef.commands;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.commands.CommandStackEvent;
import org.eclipse.gef.commands.CommandStackEventListener;

/**
 * EMF based CommandStack, and embedded a GEF CommandStack.
 *
 * @see org.eclipse.gef.commands.CommandStack
 * @see org.eclipse.emf.common.command.CommandStack
 * @see CommandWrap2EMF
 * @see CommandWrap2GEF
 * @author Ecsoya
 */
public class CombinedCommandStack extends CancelableCommandStack {

	private final List<CommandStackEventListener> eventListeners = new ArrayList<CommandStackEventListener>();

	private final CommandStackImpl gefCommandStack = new CommandStackImpl();

	private int detail;

	public CombinedCommandStack() {
	}

	public CommandStackImpl getGefCommandStack() {
		return gefCommandStack;
	}

	@Override
	public void execute(final org.eclipse.emf.common.command.Command command) {
		detail = CommandStack.PRE_EXECUTE;
		super.execute(command);
	}

	@Override
	public void undo() {
		detail = CommandStack.PRE_UNDO;
		super.undo();
	}

	@Override
	public void redo() {
		detail = CommandStack.PRE_REDO;
		super.redo();
	}

	@Override
	protected void notifyListeners() {
		super.notifyListeners();
		if (mostRecentCommand != null) {
			Command command = null;
			if (mostRecentCommand instanceof CommandWrap2EMF) {
				command = ((CommandWrap2EMF) mostRecentCommand).unwrap();
			} else {
				command = new CommandWrap2GEF(mostRecentCommand);
			}
			for (final CommandStackEventListener listener : eventListeners) {
				listener.stackChanged(new CommandStackEvent(gefCommandStack,
						command, detail));
			}
			if (detail == CommandStack.PRE_REDO) {
				detail = CommandStack.POST_REDO;
			} else if (detail == CommandStack.PRE_EXECUTE) {
				detail = CommandStack.POST_EXECUTE;
			} else if (detail == CommandStack.PRE_UNDO) {
				detail = CommandStack.POST_UNDO;
			}

		}
	}

	@Override
	public void saveIsDone() {
		super.saveIsDone();
		gefCommandStack.markSaveLocation();
	}

	@Override
	public boolean isSaveNeeded() {
		return super.isSaveNeeded() || gefCommandStack.isDirty();
	}

	private class CommandStackImpl extends CommandStack {

		@Override
		public void addCommandStackEventListener(
				final CommandStackEventListener listener) {
			eventListeners.add(listener);
		}

		@Override
		public boolean canRedo() {
			return CombinedCommandStack.this.canRedo();
		}

		@Override
		public boolean canUndo() {
			return CombinedCommandStack.this.canUndo();
		}

		@Override
		public void dispose() {
			CombinedCommandStack.this.flush();
		}

		@Override
		public void execute(final Command command) {
			if (command == null) {
				return;
			}

			org.eclipse.emf.common.command.Command emfCommand = null;
			if (command instanceof CommandWrap2GEF) {
				emfCommand = ((CommandWrap2GEF) command).unwrap();
			} else {
				emfCommand = new CommandWrap2EMF(command);
			}
			CombinedCommandStack.this.execute(emfCommand);
		}

		@Override
		public void flush() {
			CombinedCommandStack.this.flush();
		}

		@Override
		public Command getRedoCommand() {
			final org.eclipse.emf.common.command.Command command = CombinedCommandStack.this
					.getRedoCommand();
			Command gefCommand = null;
			if (command != null) {
				if (command instanceof CommandWrap2EMF) {
					gefCommand = ((CommandWrap2EMF) command).unwrap();
				} else {
					gefCommand = new CommandWrap2GEF(command);
				}
			}
			return gefCommand;
		}

		@Override
		public Command getUndoCommand() {
			final org.eclipse.emf.common.command.Command command = CombinedCommandStack.this
					.getUndoCommand();
			Command gefCommand = null;
			if (command != null) {
				if (command instanceof CommandWrap2EMF) {
					gefCommand = ((CommandWrap2EMF) command).unwrap();
				} else {
					gefCommand = new CommandWrap2GEF(command);
				}
			}
			return gefCommand;
		}

		@Override
		public void redo() {
			CombinedCommandStack.this.redo();
		}

		@Override
		public void removeCommandStackEventListener(
				final CommandStackEventListener listener) {
			eventListeners.remove(listener);
		}

		@Override
		public void undo() {
			CombinedCommandStack.this.undo();
		}

	}
}
