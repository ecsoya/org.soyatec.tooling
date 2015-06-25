package org.soyatec.tooling.richtext.utils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

public class FileUtils {
	private static final int MAX_BUFFER_SIZE = Integer.MAX_VALUE - 8;
	// buffer size used for reading and writing
	private static final int BUFFER_SIZE = 8192;

	private FileUtils() {
	}

	/**
	 * Read file contents to a string.
	 */
	public static String readAsString(IFile file) throws Exception {
		if (file == null || !file.exists()) {
			return null;
		}
		InputStream contents = null;
		try {
			contents = file.getContents();
			byte[] bytes = read(contents, BUFFER_SIZE);
			return new String(bytes);
		} catch (Exception e) {
			throw e;
		} finally {
			if (contents != null) {
				contents.close();
			}
		}
	}

	private static byte[] read(InputStream source, int initialSize)
			throws IOException {
		int capacity = initialSize;
		byte[] buf = new byte[capacity];
		int nread = 0;
		int n;
		for (;;) {
			// read to EOF which may read more or less than initialSize (eg:
			// file
			// is truncated while we are reading)
			while ((n = source.read(buf, nread, capacity - nread)) > 0)
				nread += n;

			// if last call to source.read() returned -1, we are done
			// otherwise, try to read one more byte; if that failed we're done
			// too
			if (n < 0 || (n = source.read()) < 0)
				break;

			// one more byte was read; need to allocate a larger buffer
			if (capacity <= MAX_BUFFER_SIZE - capacity) {
				capacity = Math.max(capacity << 1, BUFFER_SIZE);
			} else {
				if (capacity == MAX_BUFFER_SIZE)
					throw new OutOfMemoryError("Required array size too large");
				capacity = MAX_BUFFER_SIZE;
			}
			buf = Arrays.copyOf(buf, capacity);
			buf[nread++] = (byte) n;
		}
		return (capacity == nread) ? buf : Arrays.copyOf(buf, nread);
	}

	/**
	 * Save string value to file.
	 */
	public static void saveFromString(IFile file, String value,
			IProgressMonitor monitor) throws Exception {
		if (file == null) {
			return;
		}
		if (value == null) {
			value = "";
		}
		ByteArrayInputStream in = new ByteArrayInputStream(value.getBytes());
		try {
			if (file.exists()) {
				file.setContents(in, true, true, monitor);
			} else {
				file.create(in, true, monitor);
			}
		} catch (CoreException e) {
			throw e;
		} finally {
			in.close();
		}
	}
}
