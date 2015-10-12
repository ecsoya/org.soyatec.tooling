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
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CopyToClipboardCommand;
import org.eclipse.emf.edit.command.CutToClipboardCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.MoveCommand;
import org.eclipse.emf.edit.command.PasteFromClipboardCommand;
import org.eclipse.emf.edit.command.ReplaceCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.soyatec.tooling.gef.utils.EditingDomainUtils;

/**
 * Create GEF commands based EMF commands.
 * 
 * @author Ecsoya
 */
public class CommandFactory {

	private static UnexecutableCommand FAILED_CMD = UnexecutableCommand.INSTANCE;

	public static Command delete(final EObject object) {
		return delete(Collections.singleton(object));
	}

	public static Command delete(final Collection<EObject> objects) {
		if (objects == null || objects.isEmpty()) {
			return FAILED_CMD;
		}
		EditingDomain domain = null;
		for (final EObject eObject : objects) {
			domain = EditingDomainUtils.getEditingDomain(eObject);
			if (domain != null) {
				break;
			}
		}
		return wrap(DeleteCommand.create(domain, objects));
	}

	public static Command set(final EObject owner,
			final EStructuralFeature feature, final Object value) {
		return set(owner, feature, value, -1);
	}

	/**
	 * Set new value to the feature. The old value will be replaced with the new
	 * one.
	 */
	public static Command set(final EObject owner,
			final EStructuralFeature feature, Object value, final int index) {
		final EditingDomain domain = EditingDomainUtils.getEditingDomain(owner);
		if (domain == null || owner == null || feature == null) {
			return FAILED_CMD;
		}
		if (feature.isMany()) {
			if (value == null) {
				value = Collections.emptyList();
			} else if (!(value instanceof Collection<?>)) {
				final List<Object> newValue = new ArrayList<Object>();
				newValue.add(value);
				value = newValue;
			}
		}
		return wrap(SetCommand.create(domain, owner, feature, value, index));
	}

	/**
	 * Add the value to given feature, and the type of the feature MUST be a
	 * Collection.
	 */
	public static Command add(final EObject owner,
			final EStructuralFeature feature, final Object value,
			final int index) {
		final EditingDomain domain = EditingDomainUtils.getEditingDomain(owner);
		if (domain == null || owner == null || feature == null
				|| !FeatureMapUtil.isMany(owner, feature)) {
			return FAILED_CMD;
		}
		if (value instanceof Collection<?>) {
			return wrap(AddCommand.create(domain, owner, feature,
					(Collection<?>) value, index));
		}
		return wrap(AddCommand.create(domain, owner, feature, value, index));
	}

	/**
	 * Add the value to given feature, and the type of the feature MUST be a
	 * Collection.
	 */
	public static Command add(final EObject owner,
			final EStructuralFeature feature, final Object value) {
		return add(owner, feature, value, -1);
	}

	public static Command replace(final EObject oldValue,
			final EStructuralFeature feature, final EObject newValue) {
		if (oldValue == null || newValue == null || feature == null
				|| oldValue.eContainer() == null) {
			return FAILED_CMD;
		}
		final EObject owner = oldValue.eContainer();
		final EditingDomain domain = EditingDomainUtils.getEditingDomain(owner);
		return wrap(ReplaceCommand.create(domain, owner, feature, oldValue,
				Collections.singleton(newValue)));
	}

	public static Command copy(final EObject object) {
		final EditingDomain domain = EditingDomainUtils
				.getEditingDomain(object);
		if (domain == null || object == null) {
			return FAILED_CMD;
		}
		return wrap(CopyToClipboardCommand.create(domain,
				Collections.singleton(object)));
	}

	public static Command cut(final EObject eObject) {
		final EditingDomain domain = EditingDomainUtils
				.getEditingDomain(eObject);
		if (domain == null || eObject == null) {
			return FAILED_CMD;
		}
		return wrap(CutToClipboardCommand.create(domain,
				Collections.singleton(eObject)));
	}

	public static Command paste(final EObject owner) {
		final EditingDomain domain = EditingDomainUtils.getEditingDomain(owner);
		if (domain == null || owner == null) {
			return FAILED_CMD;
		}
		return wrap(PasteFromClipboardCommand.create(domain, owner, null));
	}

	public static Command move(final Object owner, final Object feature,
			final Object value, int index) {
		final EditingDomain domain = EditingDomainUtils.getEditingDomain(owner);
		if (domain == null || owner == null || feature == null) {
			return FAILED_CMD;
		}
		return wrap(MoveCommand.create(domain, owner, feature, value, index));
	}

	/**
	 * Return a GEF command which override by a EMF command.
	 */
	public static Command wrap(
			final org.eclipse.emf.common.command.Command overrideCommand) {
		if (overrideCommand == null || !overrideCommand.canExecute()) {
			return FAILED_CMD;
		}
		return new CommandWrap2GEF(overrideCommand);
	}

	private CommandFactory() {

	}
}
