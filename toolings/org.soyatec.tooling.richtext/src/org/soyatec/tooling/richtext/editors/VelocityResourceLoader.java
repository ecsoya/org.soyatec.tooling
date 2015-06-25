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
