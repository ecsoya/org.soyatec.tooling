/*******************************************************************************
 * Copyright (c) 2015 Soyatec and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Soyatec - initial API and implementation
 *******************************************************************************/
package org.soyatec.tooling.gef.commands;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.command.Command;

/**
 * Wrap GEF command to EMF Command.
 * 
 * @author Ecsoya
 */
public class CommandWrap2EMF implements Command {
	private final org.eclipse.gef.commands.Command _command;

	/**
	 * Constructor for CommandWrap2EMF.
	 */
	public CommandWrap2EMF(final org.eclipse.gef.commands.Command command) {
		this._command = command;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.command.Command#canExecute()
	 */
	public boolean canExecute() {
		return _command == null ? false : _command.canExecute();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.command.Command#canUndo()
	 */
	public boolean canUndo() {
		return _command == null ? false : _command.canUndo();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.command.Command#chain(Command)
	 */
	public Command chain(final Command command) {
		Command chained = this;
		if (command != null) {
			org.eclipse.gef.commands.Command gefCommand = null;
			if (command instanceof CommandWrap2EMF) {
				gefCommand = ((CommandWrap2EMF) command).unwrap();
			} else {
				gefCommand = new CommandWrap2GEF(command);
			}
			gefCommand = this._command.chain(gefCommand);
			if (gefCommand != null) {
				if (gefCommand instanceof CommandWrap2GEF) {
					chained = ((CommandWrap2GEF) gefCommand).unwrap();
				} else {
					chained = new CommandWrap2EMF(gefCommand);
				}
			}
		}
		return chained;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.command.Command#dispose()
	 */
	public void dispose() {
		if (_command != null) {
			_command.dispose();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.command.Command#execute()
	 */
	public void execute() {
		if (_command != null) {
			_command.execute();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.command.Command#getAffectedObjects()
	 */
	public Collection<?> getAffectedObjects() {
		return Collections.EMPTY_LIST;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.command.Command#getDescription()
	 */
	public String getDescription() {
		return "CommandWrap4GEF";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.command.Command#getLabel()
	 */
	public String getLabel() {
		return _command == null ? "CommandWrap4GEF" : _command.getLabel();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.command.Command#getResult()
	 */
	public Collection<?> getResult() {
		return Collections.EMPTY_LIST;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.command.Command#redo()
	 */
	public void redo() {
		if (_command != null) {
			_command.redo();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.command.Command#undo()
	 */
	public void undo() {
		if (_command != null) {
			_command.undo();
		}
	}

	public org.eclipse.gef.commands.Command unwrap() {
		return _command;
	}
}
