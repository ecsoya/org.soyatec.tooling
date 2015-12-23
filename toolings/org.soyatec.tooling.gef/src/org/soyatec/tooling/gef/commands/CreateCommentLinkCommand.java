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

import org.soyatec.tooling.di.Comment;
import org.soyatec.tooling.di.CommentLink;
import org.soyatec.tooling.di.DiFactory;
import org.soyatec.tooling.di.Diagram;
import org.soyatec.tooling.di.Line;
import org.soyatec.tooling.di.Node;

public class CreateCommentLinkCommand extends CreateLineCommand {

    private Node commentSource;
    private Comment commentTarget;

    public CreateCommentLinkCommand(final Diagram diagram,
            final CommentLink lineObject) {
        super(diagram, lineObject);
    }

    public boolean canExecute() {
        if (source == null || target == null || source == target) {
            return false;
        }
        final Object sourceModel = source.getModel();
        final Object targetModel = target.getModel();
        if (!(sourceModel instanceof Node) || !(targetModel instanceof Comment)) {
            return false;
        }
        commentSource = (Node) sourceModel;
        commentTarget = (Comment) targetModel;
        return true;
    }

    protected void doCreateLine(final Diagram diagram, final Line line) {
        CommentLink commentLink = (CommentLink) line;
        if (commentLink == null) {
            commentLink = DiFactory.eINSTANCE.createCommentLink();
        }
        commentLink.setSourceAnchor(sourceAnchor);
        commentLink.setTargetAnchor(targetAnchor);

        commentLink.setSource(commentSource);
        commentLink.setTarget(commentTarget);

        diagram.getCommentLinks().add(commentLink);
    }

    protected void doRemoveLine(final Diagram diagram, final Line line) {
        if (diagram == null || line == null) {
            return;
        }
        final CommentLink commentLink = (CommentLink) line;
        commentLink.setSource(null);
        commentLink.setTarget(null);

        diagram.getCommentLinks().remove(commentLink);
    }

}
