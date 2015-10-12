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
package org.soyatec.tooling.gef.resources;

import java.text.MessageFormat;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.resource.DeviceResourceManager;
import org.eclipse.jface.resource.FontRegistry;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.resource.ResourceManager;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;
import org.soyatec.tooling.gef.Activator;

public class ResourcesFactory {

	private static ResourceManager resources;
	private static final ResourceBundle bundle = ResourceBundle
			.getBundle("org.soyatec.tooling.gef.resources.messages"); //$NON-NLS-1$

	private static ImageRegistry imageRegistry;
	private static FontRegistry fontRegistry;

	private static final Map<Integer, Color> colorRegistry = new HashMap<Integer, Color>(
			1);

	public static final int COLOR_WHITE = 16777215;
	public static final int COLOR_BLACK = 0;
	public static final int COLOR_COMMENT = 13434879;
	public static final int COLOR_SHAPE = 14012867;

	public static final int COLOR_ERROR = 255;
	public static final int COLOR_WARNING = 13434879;

	public static Display getDisplay() {
		return Display.getCurrent();
	}

	public static FontRegistry getFontRegistry() {
		if (fontRegistry == null) {
			fontRegistry = new FontRegistry(getDisplay(), true);
		}
		return fontRegistry;
	}

	public static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry(getResources());
		}
		return imageRegistry;
	}

	public static ResourceManager getResources() {
		if (resources == null) {
			resources = new DeviceResourceManager(getDisplay());
		}
		return resources;
	}

	public static void dispose() {
		if (resources != null) {
			resources.dispose();
		}
		resources = null;

		Collection<Color> values = colorRegistry.values();
		for (Color color : values) {
			color.dispose();
		}
		colorRegistry.clear();
	}

	public static ImageDescriptor getImageDescriptor(String key) {
		ImageDescriptor descriptor = getImageRegistry().getDescriptor(key);
		if (descriptor == null) {
			descriptor = Activator.getImageDescriptor(key);
			if (descriptor != null) {
				getImageRegistry().put(key, descriptor);
			}
		}
		return descriptor;
	}

	public static Image getImage(String key) {
		Image image = getImageRegistry().get(key);
		if (image == null) {
			getImageDescriptor(key);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	public static String format(String key, Object[] args) {
		return MessageFormat.format(getString(key), args);
	}

	public static Font getFont(String symbolicName) {
		return getFontRegistry().get(symbolicName);
	}

	public static Color getColor(Integer value) {
		Color color = colorRegistry.get(value);
		if (color == null) {
			RGB rgb = integerToRGB(value);
			color = new Color(null, rgb);
			colorRegistry.put(value, color);
		}
		return color;
	}

	public static Color getColor(RGB rgb) {
		Integer value = RGBToInteger(rgb);
		return getColor(value);
	}

	public static Integer RGBToInteger(RGB rgb) {
		return new Integer((rgb.blue << 16) | (rgb.green << 8) | rgb.red);
	}

	public static RGB integerToRGB(Integer color) {
		int n = color.intValue();
		return new RGB((n & 0x000000FF), (n & 0x0000FF00) >> 8,
				(n & 0x00FF0000) >> 16);
	}

	public static String getString(String key) {
		try {
			return bundle.getString(key);
		} catch (MissingResourceException e) {
			return key;
		}
	}

	public static String[] getStrings(String[] keys) {
		Assert.isNotNull(keys);
		int length = keys.length;
		String[] result = new String[length];
		for (int i = 0; i < length; i++) {
			result[i] = getString(keys[i]);
		}
		return result;
	}

}
