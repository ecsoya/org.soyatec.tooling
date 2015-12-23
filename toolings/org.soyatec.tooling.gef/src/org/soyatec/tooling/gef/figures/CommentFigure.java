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
package org.soyatec.tooling.gef.figures;

import org.eclipse.draw2d.AbstractBorder;
import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.text.FlowPage;
import org.eclipse.draw2d.text.TextFlow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;

public class CommentFigure extends Figure implements ILabelFigure, IShapeStyle {
    static public final int CLIP_HINT = 12;

    private final int clipHint;

    private TextFlow textFlow;

    private int lineWidth;

    public CommentFigure() {
        this(CLIP_HINT);
    }

    public CommentFigure(final int clipHint) {
        this.clipHint = clipHint;
        setBorder(new NoteFigureBorder(new Insets(clipHint + 1, clipHint / 2,
                clipHint / 2, clipHint / 2)));
        setOpaque(true);
        setLayoutManager(new BorderLayout());
        final FlowPage figure = new FlowPage();
        figure.setOpaque(true);
        figure.add(textFlow = new TextFlow());
        textFlow.setOpaque(true);
        add(figure, BorderLayout.CENTER);
    }

    protected void paintFigure(final Graphics graphics) {
        // super.paintFigure(graphics);
        graphics.fillPolygon(getPointList(getBounds()));
    }

    public void setImage(final Image newImage) {

    }

    public Image getImage() {
        return null;
    }

    public void setText(final String text) {
        if (textFlow != null) {
            textFlow.setText(text);
        }
    }

    public String getText() {
        if (textFlow != null) {
            return textFlow.getText();
        }
        return null;
    }

    public int getClipWidth() {
        return clipHint;
    }

    public int getClipHeight() {
        return clipHint;
    }

    public int getLineWidth() {
        if (lineWidth < 1) {
            lineWidth = 1;
        }
        return lineWidth;
    }

    public void setLineWidth(final int lineWidth) {
        this.lineWidth = lineWidth;
    }

    public int getLineStyle() {
        return SWT.LINE_SOLID;
    }

    public PointList getPointList(final Rectangle r) {
        final PointList p = new PointList();

        p.addPoint(r.x, r.y);
        p.addPoint(r.x + r.width - getClipWidth(), r.y);
        p.addPoint(r.x + r.width - 1, r.y + getClipHeight());
        p.addPoint(r.x + r.width - 1, r.y + r.height - 1);
        p.addPoint(r.x, r.y + r.height - 1);
        p.addPoint(r.x, r.y);

        return p;
    }

    public IFigure getLabelFigure() {
        return textFlow;
    }

    public class NoteFigureBorder extends AbstractBorder {
        private Insets margin;

        NoteFigureBorder(final Insets insets) {
            margin = insets;
        }

        public Insets getMargin() {
            return margin;
        }

        public void setMargin(final Insets margin) {
            this.margin = margin;
        }

        public Insets getInsets(final IFigure figure) {
            final CommentFigure noteFigure = (CommentFigure) figure;
            final int width = noteFigure.getLineWidth();
            return new Insets(width + margin.top, width + margin.left, width
                    + margin.bottom, width + margin.right);
        }

        public void paint(final IFigure figure, final Graphics g,
                final Insets insets) {
            final CommentFigure noteFigure = (CommentFigure) figure;
            final Rectangle r = noteFigure.getBounds().getCopy();
            r.shrink(noteFigure.getLineWidth() / 2,
                    noteFigure.getLineWidth() / 2);

            final PointList p = noteFigure.getPointList(r);
            p.addPoint(r.x, r.y - noteFigure.getLineWidth() / 2);
            g.setLineWidth(noteFigure.getLineWidth());
            g.setLineStyle(noteFigure.getLineStyle());
            g.drawPolyline(p);

            final PointList corner = new PointList();
            corner.addPoint(r.x + r.width - getClipWidth(), r.y);
            corner.addPoint(r.x + r.width - getClipWidth(), r.y
                    + getClipHeight());
            corner.addPoint(r.x + r.width, r.y + getClipHeight());
            g.drawPolyline(corner);
        }
    }

}
