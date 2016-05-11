/**
 * 
 */
package com.coderspp.schedulepredict.errorcodes;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author Deepak Ravi Shankar
 *
 */

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum FlightErrorCode {

	INVALID("INVALID", 1),
	/**
	 * Alive component
	 */
	OK("OK", 2);

	private String displayName;

	private int id;

	private FlightErrorCode(final String displayName, final int id) {
		this.displayName = displayName;
		this.id = id;

	}

	/**
	 * @return the displayName
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * 
	 * @return Department name
	 */
	public String getName() {
		return this.name();
	}

}
