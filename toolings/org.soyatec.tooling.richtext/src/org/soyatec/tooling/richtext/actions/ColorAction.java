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
import org.eclipse.epf.richtext.actions.RichTextAction;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.ColorDialog;
import org.eclipse.swt.widgets.Event;

public abstract class ColorAction extends RichTextAction {

    private RGB color = null;

    public ColorAction(final IRichText richText) {
        super(richText, AS_DROP_DOWN_MENU);
    }

    public void runWithEvent(final Event event) {
        if (event.detail == SWT.ARROW || color == null) {
            final ColorDialog dlg = new ColorDialog(
                    event.display.getActiveShell());
            dlg.setRGB(color);
            color = dlg.open();
        }
        super.runWithEvent(event);
    }

    public void execute(final IRichText richText) {
        if (richText != null) {
            richText.executeCommand(getCommandName(), getColorValue());
        }
    }

    protected abstract String getCommandName();

    private String getColorValue() {
        if (color == null) {
            return null;
        }
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("rgb(");
        stringBuilder.append(color.red);
        stringBuilder.append(",");
        stringBuilder.append(color.green);
        stringBuilder.append(",");
        stringBuilder.append(color.blue);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

}
