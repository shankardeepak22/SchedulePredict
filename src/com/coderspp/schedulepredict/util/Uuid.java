package com.coderspp.schedulepredict.util;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author Deepak Ravi Shankar
 * 
 */

public final class Uuid implements Serializable {

	private static final long serialVersionUID = 5652403921414451918L;

	private String uuid;

	@JsonCreator
	public Uuid(@JsonProperty("uuid") final String uuid) {

		this.uuid = uuid;

	}

	public String getUuid() {
		return uuid;
	}

	@Override
	public String toString() {
		return uuid;
	}

	@Override
	public boolean equals(final Object object) {
		boolean isEqual = false;

		if (object instanceof Uuid) {
			Uuid anotherUuid = (Uuid) object;
			isEqual = new EqualsBuilder().append(uuid, anotherUuid.uuid).isEquals();
		}

		return isEqual;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(uuid).toHashCode();
	}
}
