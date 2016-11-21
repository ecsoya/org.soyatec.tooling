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

import org.eclipse.core.runtime.Assert;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.soyatec.tooling.di.Diagram;
import org.soyatec.tooling.di.Line;

public abstract class CreateLineCommand extends Command {

	protected EditPart source;
	protected EditPart target;

	protected String sourceAnchor;
	protected String targetAnchor;

	protected Line lineObject;
	protected Diagram diagram;

	public CreateLineCommand(final Diagram diagram, final Line lineObject) {
		Assert.isNotNull(diagram, "Container for lines."); //$NON-NLS-1$
		this.diagram = diagram;
		this.lineObject = lineObject;
	}

	public EditPart getSource() {
		return source;
	}

	public void setSource(final EditPart source) {
		this.source = source;
	}

	public EditPart getTarget() {
		return target;
	}

	public void setTarget(final EditPart target) {
		this.target = target;
	}

	public String getSourceAnchor() {
		return sourceAnchor;
	}

	public void setSourceAnchor(final String sourceAnchor) {
		this.sourceAnchor = sourceAnchor;
	}

	public String getTargetAnchor() {
		return targetAnchor;
	}

	public void setTargetAnchor(final String targetAnchor) {
		this.targetAnchor = targetAnchor;
	}

	public void setLineObject(final Line lineObject) {
		this.lineObject = lineObject;
	}

	public Line getLineObject() {
		return lineObject;
	}

	public Diagram getDiagram() {
		return diagram;
	}

	public void execute() {
		doCreateLine(diagram, lineObject);
	}

	public boolean canUndo() {
		return lineObject != null && diagram != null
				&& lineObject.eContainer() == diagram;
	}

	public void undo() {
		doRemoveLine(diagram, lineObject);
	}

	protected abstract void doCreateLine(Diagram diagram, Line line);

	protected abstract void doRemoveLine(Diagram diagram, Line line);
}
