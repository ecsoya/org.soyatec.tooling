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
package org.soyatec.tooling.richtext.actions;

import org.eclipse.epf.richtext.IRichText;
import org.eclipse.epf.richtext.RichTextCommand;
import org.soyatec.tooling.richtext.Activator;

public class ForegroundAction extends ColorAction {

	public ForegroundAction(IRichText richText) {
		super(richText);
		setImageDescriptor(Activator.imageDescriptorFromPlugin(
				Activator.PLUGIN_ID, "icons/textForeground.ico"));
		setToolTipText("Text Foreground");
	}

	protected String getCommandName() {
		return RichTextCommand.FORGROUND_COLOR;
	}

}
