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
package org.soyatec.tooling.richtext.editors;

import java.io.InputStream;

import org.apache.velocity.exception.ResourceNotFoundException;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

public class VelocityResourceLoader extends ClasspathResourceLoader {

	public InputStream getResourceStream(String name)
			throws ResourceNotFoundException {
		try {
			return VelocityResourceLoader.class.getResourceAsStream(name);
		} catch (Exception e) {
			return super.getResourceStream(name);
		}
	}

}
