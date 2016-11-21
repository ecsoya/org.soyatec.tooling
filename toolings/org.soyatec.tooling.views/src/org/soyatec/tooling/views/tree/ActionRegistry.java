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
package org.soyatec.tooling.views.tree;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.action.IAction;

/**
 * A container for editor actions. You must register the actions before they
 * will be available to the editor.
 */
public class ActionRegistry {

	/*
	 * A hashmap that contains the actions.
	 */
	private final Map<String, IAction> map = new HashMap<String, IAction>(15);

	/**
	 * Calls dispose on all actions which implement the {@link Disposable}
	 * interface so they can perform their own clean-up.
	 */
	public void dispose() {
		map.clear();
	}

	/**
	 * Returns <code>null</code> or the <code>IAction</code> with the given key.
	 * 
	 * @param key
	 *            the ID of the action being requested
	 * @return <code>null</code> or the action with the corresponding ID
	 */
	public IAction getAction(final Object key) {
		return map.get(key);
	}

	/**
	 * Returns an {@link Iterator} over all the actions.
	 * 
	 * @return an iterator over all actions
	 */
	public Iterator<IAction> getActions() {
		return map.values().iterator();
	}

	/**
	 * Register an action with this registry. The action must have an ID.
	 * 
	 * @param action
	 *            the action being registered.
	 */
	public void registerAction(final IAction action) {
		Assert.isNotNull(action.getId(), "action must have an ID in " + //$NON-NLS-1$
				getClass().getName() + " :registerAction(IAction)");//$NON-NLS-1$
		registerAction(action.getId(), action);
	}

	/**
	 * Register an action with this registry using the given id.
	 */
	private void registerAction(final String id, final IAction action) {
		map.put(id, action);
	}

	/**
	 * Removes an action from this registry. The action must have an ID.
	 * 
	 * @param action
	 *            the action to remove
	 */
	public void removeAction(final IAction action) {
		map.remove(action.getId());
	}

}
