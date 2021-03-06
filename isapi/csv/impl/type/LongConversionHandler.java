/*
 * This file is part of CSV package.
 *
 *  CSV is free software: you can redistribute it 
 *  and/or modify it under the terms of version 3 of the GNU 
 *  Lesser General Public  License as published by the Free Software 
 *  Foundation.
 *  
 *  CSV is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public 
 *  License along with CSV.  If not, see 
 *  <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */
package csv.impl.type;

import csv.TypeConversionHandler;

/**
 * Conversion Handler for long.
 * @author ralph
 *
 */
public class LongConversionHandler implements TypeConversionHandler {

	public static final TypeConversionHandler INSTANCE = new LongConversionHandler();
	
	/**
	 * Constructor.
	 */
	public LongConversionHandler() {
	}

	/**
	 * @see csv.TypeConversionHandler#getTypes()
	 */
	@Override
	public String[] getTypes() {
		return new String[] { "long", "java.lang.Long" };
	}

	/**
	 * @see csv.TypeConversionHandler#toObject(java.lang.String)
	 */
	@Override
	public Object toObject(String s) {
		return Long.parseLong(s);
	}

	/**
	 * @see csv.TypeConversionHandler#toString(java.lang.Object)
	 */
	@Override
	public String toString(Object o) {
		return o.toString();
	}

}
