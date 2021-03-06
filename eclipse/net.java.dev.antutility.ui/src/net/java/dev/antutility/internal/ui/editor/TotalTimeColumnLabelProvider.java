/*******************************************************************************
 * Copyright (c) 2007, 2009 David Green and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David Green - initial API and implementation
 *******************************************************************************/
package net.java.dev.antutility.internal.ui.editor;

import net.java.dev.antutility.internal.core.MeasurementAccumulator;

import org.eclipse.jface.viewers.ColumnLabelProvider;

public class TotalTimeColumnLabelProvider extends ColumnLabelProvider {

	@Override
	public String getText(Object element) {
		if (element instanceof MeasurementAccumulator) {
			MeasurementAccumulator accumulator = (MeasurementAccumulator) element;
			
			return String.valueOf(accumulator.localTime + accumulator.childTime);
		}
		return "???";
	}
}
