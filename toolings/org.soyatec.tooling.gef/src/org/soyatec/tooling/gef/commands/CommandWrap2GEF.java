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

import java.util.Collection;
import java.util.Collections;

import org.eclipse.gef.commands.Command;

/**
 * Wrap EMF command to GEF Command.
 * 
 * @author Ecsoya
 */
public class CommandWrap2GEF extends Command implements ICancelCommand {
	private final org.eclipse.emf.common.command.Command _command;

	/**
	 * Constructor for CommandWrap2GEF.
	 */
	public CommandWrap2GEF(final org.eclipse.emf.common.command.Command command) {
		this._command = command;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#canExecute()
	 */
	@Override
	public boolean canExecute() {
		return _command == null ? false : _command.canExecute();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#canUndo()
	 */
	@Override
	public boolean canUndo() {
		return _command == null ? false : _command.canUndo();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#chain(Command)
	 */
	@Override
	public Command chain(final Command command) {
		Command chained = this;
		if (command != null) {
			org.eclipse.emf.common.command.Command emfCommand = null;
			if (command instanceof CommandWrap2GEF) {
				emfCommand = ((CommandWrap2GEF) command).unwrap();
			} else {
				emfCommand = new CommandWrap2EMF(command);
			}
			emfCommand = this._command.chain(emfCommand);
			if (emfCommand != null) {
				if (emfCommand instanceof CommandWrap2EMF) {
					chained = ((CommandWrap2EMF) emfCommand).unwrap();
				} else {
					chained = new CommandWrap2GEF(emfCommand);
				}
			}
		}
		return chained;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#dispose()
	 */
	@Override
	public void dispose() {
		if (_command != null) {
			_command.dispose();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	@Override
	public void execute() {
		if (_command != null) {
			_command.execute();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#getLabel()
	 */
	@Override
	public String getLabel() {
		return _command == null ? "CommandWrap4EMF" : _command.getLabel(); //$NON-NLS-1$
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#redo()
	 */
	@Override
	public void redo() {
		if (_command != null) {
			_command.redo();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	@Override
	public void undo() {
		if (_command != null) {
			_command.undo();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#getAffectedObjects()
	 */
	public Collection<?> getAffectedObjects() {
		return _command == null ? Collections.EMPTY_LIST : _command
				.getAffectedObjects();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#getDescription()
	 */
	public String getDescription() {
		return _command == null ? "CommandWrap4EMF" : _command.getDescription(); //$NON-NLS-1$
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#getResult()
	 */
	public Collection<?> getResult() {
		return _command == null ? Collections.EMPTY_LIST : _command.getResult();
	}

	public org.eclipse.emf.common.command.Command unwrap() {
		return _command;
	}

	@Override
	public boolean isCanceled() {
		return _command instanceof ICancelCommand
				&& ((ICancelCommand) _command).isCanceled();
	}

}
