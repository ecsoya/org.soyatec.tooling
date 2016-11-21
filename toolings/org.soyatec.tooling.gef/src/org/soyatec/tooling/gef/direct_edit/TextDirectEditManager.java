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
package org.soyatec.tooling.gef.direct_edit;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.requests.DirectEditRequest;
import org.eclipse.gef.tools.DirectEditManager;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Text;
import org.soyatec.tooling.di.DiPackage;
import org.soyatec.tooling.gef.editparts.ViewEditPart;
import org.soyatec.tooling.gef.figures.ILabelFigure;

/**
 * <li>Open a <code>TextCellEditor</code> on <code>ILabelFigure</code>.</li>
 * 
 * <li>Try to modify the <code>label</code> of <code>UIObject</code>.</li>
 * 
 * @see TextCellEditorLocator
 * @author Ecsoya
 */
public class TextDirectEditManager extends DirectEditManager {

	private Font scaledFont;
	private VerifyListener verifyListener;
	private final ILabelFigure labelFigure;
	private final String initialvalue;

	private final Object model;

	public TextDirectEditManager(final ViewEditPart<?> source,
			final ILabelFigure labelFigure) {
		this(source, labelFigure, null);
	}

	public TextDirectEditManager(final ViewEditPart<?> source,
			final ILabelFigure labelFigure, final String initialvalue) {
		this(source, labelFigure, initialvalue, null, DiPackage.eINSTANCE
				.getView_Label());
	}

	public TextDirectEditManager(final ViewEditPart<?> source,
			final ILabelFigure labelFigure, final String initialvalue,
			final Object model, final Object feature) {
		super(source, TextCellEditor.class, new TextCellEditorLocator(
				labelFigure), feature);
		this.model = model;
		this.labelFigure = labelFigure;
		this.initialvalue = initialvalue;
	}

	protected Object getDirectEditModel() {
		if (model != null) {
			return model;
		} else if (getEditPart() != null) {
			return getEditPart().getModel();
		}
		return null;
	}

	protected void bringDown() {
		// This method might be re-entered when super.bringDown() is called.
		final Font disposeFont = scaledFont;
		scaledFont = null;
		super.bringDown();
		if (disposeFont != null) {
			disposeFont.dispose();
		}
	}

	protected void initCellEditor() {
		final Text text = (Text) getCellEditor().getControl();
		verifyListener = new VerifyListener() {
			public void verifyText(final VerifyEvent event) {
				final Text text = (Text) getCellEditor().getControl();
				final String oldText = text.getText();
				final String leftText = oldText.substring(0, event.start);
				final String rightText = oldText.substring(event.end,
						oldText.length());
				final GC gc = new GC(text);
				Point size = gc.textExtent(leftText + event.text + rightText);
				gc.dispose();
				if (size.x != 0) {
					size = text.computeSize(size.x, SWT.DEFAULT);
				}
				getCellEditor().getControl().setSize(size.x, size.y);
			}
		};
		text.addVerifyListener(verifyListener);

		final String initialLabelText = getInitialValue();
		getCellEditor().setValue(initialLabelText);
		final IFigure figure = getEditPart().getFigure();
		scaledFont = figure.getFont();
		final FontData data = scaledFont.getFontData()[0];
		final Dimension fontSize = new Dimension(0, data.getHeight());
		labelFigure.getLabelFigure().translateToAbsolute(fontSize);
		data.setHeight(fontSize.height);
		scaledFont = new Font(null, data);

		text.setFont(scaledFont);
	}

	protected String getInitialValue() {
		if (initialvalue != null) {
			return initialvalue;
		} else if (labelFigure != null) {
			return labelFigure.getText();
		}
		return "";
	}

	protected void unhookListeners() {
		super.unhookListeners();
		final Text text = (Text) getCellEditor().getControl();
		text.removeVerifyListener(verifyListener);
		verifyListener = null;
	}

	@SuppressWarnings("unchecked")
	@Override
	protected DirectEditRequest createDirectEditRequest() {
		final DirectEditRequest req = super.createDirectEditRequest();
		req.getExtendedData().put(IDirectEdit.DATA_EDIT_MODEL,
				getDirectEditModel());
		return req;
	}
}
