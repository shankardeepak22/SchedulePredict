package com.coderspp.schedulepredict.util;

import java.util.UUID;

import org.apache.commons.lang3.StringUtils;

/**
 * 
 * @author Deepak Ravi Shankar
 *
 */
public final class UuidGenerator {

	private UuidGenerator() {
	}

	public static String generateId() {

		return StringUtils.upperCase(UUID.randomUUID().toString());

	}

	public static void main(String[] args) {

		System.out.println(UuidGenerator.generateId());
	}

}
