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
package org.soyatec.tooling.gef.properties;

import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Spinner;

/**
 * FieldEditor for integer values.
 *
 * @author Ecsoya
 */
public class SpinnerFieldEditor extends FieldEditor {

	/**
	 * Value that will feed Spinner.setIncrement(int).
	 */
	private int incrementValue;

	/**
	 * Value that will feed Spinner.setMaximum(int).
	 */
	private int maxValue;

	/**
	 * Value that will feed Spinner.setMinimum(int).
	 */
	private int minValue;

	/**
	 * Old integer value.
	 */
	private int oldValue;

	/**
	 * Value that will feed Spinner.setPageIncrement(int).
	 */
	private int pageIncrementValue;

	/**
	 * The scale, or <code>null</code> if none.
	 */
	protected Spinner spinner;

	/**
	 * Creates a scale field editor.
	 *
	 * @param name
	 *            the name of the preference this field editor works on
	 * @param labelText
	 *            the label text of the field editor
	 * @param parent
	 *            the parent of the field editor's control
	 */
	public SpinnerFieldEditor(final String name, final String labelText,
			final Composite parent) {
		super(name, labelText, parent);
		setDefaultValues();
	}

	/**
	 * Creates a scale field editor with particular scale values.
	 *
	 * @param name
	 *            the name of the preference this field editor works on
	 * @param labelText
	 *            the label text of the field editor
	 * @param parent
	 *            the parent of the field editor's control
	 * @param min
	 *            the value used for Scale.setMinimum(int).
	 * @param max
	 *            the value used for Scale.setMaximum(int).
	 * @param increment
	 *            the value used for Scale.setIncrement(int).
	 * @param pageIncrement
	 *            the value used for Scale.setPageIncrement(int).
	 */
	public SpinnerFieldEditor(final String name, final String labelText,
			final Composite parent, final int min, final int max,
			final int increment, final int pageIncrement) {
		super(name, labelText, parent);
		setValues(min, max, increment, pageIncrement);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.preference.FieldEditor#adjustForNumColumns(int)
	 */
	@Override
	protected void adjustForNumColumns(final int numColumns) {
		((GridData) spinner.getLayoutData()).horizontalSpan = numColumns - 1;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.jface.preference.FieldEditor#doFillIntoGrid(org.eclipse.swt
	 * .widgets.Composite, int)
	 */
	@Override
	protected void doFillIntoGrid(final Composite parent, final int numColumns) {
		final Control control = getLabelControl(parent);
		GridData gd = new GridData();
		control.setLayoutData(gd);

		spinner = getSpinnerControl(parent);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.verticalAlignment = GridData.FILL;
		gd.horizontalSpan = numColumns - 1;
		gd.grabExcessHorizontalSpace = true;
		spinner.setLayoutData(gd);
		updateSpinner();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.preference.FieldEditor#doLoad()
	 */
	@Override
	protected void doLoad() {
		if (spinner != null) {
			final int value = getPreferenceStore().getInt(getPreferenceName());
			spinner.setSelection(value);
			oldValue = value;
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.preference.FieldEditor#doLoadDefault()
	 */
	@Override
	protected void doLoadDefault() {
		if (spinner != null) {
			final int value = getPreferenceStore().getDefaultInt(
					getPreferenceName());
			spinner.setSelection(value);
		}
		valueChanged();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.preference.FieldEditor#doStore()
	 */
	@Override
	protected void doStore() {
		getPreferenceStore().setValue(getPreferenceName(),
				spinner.getSelection());
	}

	/**
	 * Returns the value that will be used for Scale.setIncrement(int).
	 *
	 * @return the value.
	 * @see org.eclipse.swt.widgets.Scale#setIncrement(int)
	 */
	public int getIncrement() {
		return incrementValue;
	}

	/**
	 * Returns the value that will be used for Scale.setMaximum(int).
	 *
	 * @return the value.
	 * @see org.eclipse.swt.widgets.Scale#setMaximum(int)
	 */
	public int getMaximum() {
		return maxValue;
	}

	/**
	 * Returns the value that will be used for Scale.setMinimum(int).
	 *
	 * @return the value.
	 * @see org.eclipse.swt.widgets.Scale#setMinimum(int)
	 */
	public int getMinimum() {
		return minValue;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.preference.FieldEditor#getNumberOfControls()
	 */
	@Override
	public int getNumberOfControls() {
		return 2;
	}

	/**
	 * Returns the value that will be used for Scale.setPageIncrement(int).
	 *
	 * @return the value.
	 * @see org.eclipse.swt.widgets.Scale#setPageIncrement(int)
	 */
	public int getPageIncrement() {
		return pageIncrementValue;
	}

	/**
	 * Returns this field editor's scale control.
	 *
	 * @return the scale control, or <code>null</code> if no scale field is
	 *         created yet
	 */
	public Spinner getSpinnerControl() {
		return spinner;
	}

	/**
	 * Returns this field editor's scale control. The control is created if it
	 * does not yet exist.
	 *
	 * @param parent
	 *            the parent
	 * @return the scale control
	 */
	private Spinner getSpinnerControl(final Composite parent) {
		if (spinner == null) {
			spinner = new Spinner(parent, SWT.READ_ONLY | SWT.BORDER);
			spinner.setFont(parent.getFont());
			spinner.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(final SelectionEvent event) {
					valueChanged();
				}
			});
			spinner.addDisposeListener(new DisposeListener() {
				public void widgetDisposed(final DisposeEvent event) {
					spinner = null;
				}
			});
		} else {
			checkParent(spinner, parent);
		}
		return spinner;
	}

	/**
	 * Set default values for the various scale fields. These defaults are:<br>
	 * <ul>
	 * <li>Minimum = 0
	 * <li>Maximim = 10
	 * <li>Increment = 1
	 * <li>Page Increment = 1
	 * </ul>
	 */
	private void setDefaultValues() {
		setValues(0, 10, 1, 1);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.preference.FieldEditor#setFocus()
	 */
	@Override
	public void setFocus() {
		if (spinner != null && !spinner.isDisposed()) {
			spinner.setFocus();
		}
	}

	/**
	 * Set the value to be used for Scale.setIncrement(int) and update the
	 * scale.
	 *
	 * @param increment
	 *            a value greater than 0.
	 * @see org.eclipse.swt.widgets.Scale#setIncrement(int)
	 */
	public void setIncrement(final int increment) {
		this.incrementValue = increment;
		updateSpinner();
	}

	/**
	 * Set the value to be used for Scale.setMaximum(int) and update the scale.
	 *
	 * @param max
	 *            a value greater than 0.
	 * @see org.eclipse.swt.widgets.Scale#setMaximum(int)
	 */
	public void setMaximum(final int max) {
		this.maxValue = max;
		updateSpinner();
	}

	/**
	 * Set the value to be used for Scale.setMinumum(int) and update the scale.
	 *
	 * @param min
	 *            a value greater than 0.
	 * @see org.eclipse.swt.widgets.Scale#setMinimum(int)
	 */
	public void setMinimum(final int min) {
		this.minValue = min;
		updateSpinner();
	}

	/**
	 * Set the value to be used for Scale.setPageIncrement(int) and update the
	 * scale.
	 *
	 * @param pageIncrement
	 *            a value greater than 0.
	 * @see org.eclipse.swt.widgets.Scale#setPageIncrement(int)
	 */
	public void setPageIncrement(final int pageIncrement) {
		this.pageIncrementValue = pageIncrement;
		updateSpinner();
	}

	/**
	 * Set all Scale values.
	 *
	 * @param min
	 *            the value used for Scale.setMinimum(int).
	 * @param max
	 *            the value used for Scale.setMaximum(int).
	 * @param increment
	 *            the value used for Scale.setIncrement(int).
	 * @param pageIncrement
	 *            the value used for Scale.setPageIncrement(int).
	 */
	private void setValues(final int min, final int max, final int increment,
			final int pageIncrement) {
		this.incrementValue = increment;
		this.maxValue = max;
		this.minValue = min;
		this.pageIncrementValue = pageIncrement;
		updateSpinner();
	}

	/**
	 * Update the scale particulars with set values.
	 */
	private void updateSpinner() {
		if (spinner != null && !spinner.isDisposed()) {
			spinner.setMinimum(getMinimum());
			spinner.setMaximum(getMaximum());
			spinner.setIncrement(getIncrement());
			spinner.setPageIncrement(getPageIncrement());
		}
	}

	/**
	 * Informs this field editor's listener, if it has one, about a change to
	 * the value (<code>VALUE</code> property) provided that the old and new
	 * values are different.
	 * <p>
	 * This hook is <em>not</em> called when the scale is initialized (or reset
	 * to the default value) from the preference store.
	 * </p>
	 */
	protected void valueChanged() {
		setPresentsDefaultValue(false);

		final int newValue = spinner.getSelection();
		if (newValue != oldValue) {
			fireStateChanged(IS_VALID, false, true);
			fireValueChanged(VALUE, new Integer(oldValue),
					new Integer(newValue));
			oldValue = newValue;
		}
	}

	public void setEnabled(final boolean enabled, final Composite parent) {
		super.setEnabled(enabled, parent);
		getSpinnerControl(parent).setEnabled(enabled);
	}
}
