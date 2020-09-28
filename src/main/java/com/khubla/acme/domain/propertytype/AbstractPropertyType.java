package com.khubla.acme.domain.propertytype;

import java.util.*;

public class AbstractPropertyType implements PropertyType {
	public static String buildName(List<String> names) {
		String ret = new String();
		boolean first = true;
		for (final String n : names) {
			if (first) {
				first = false;
			} else {
				ret += ".";
			}
			ret += n;
		}
		return ret;
	}

	private final String name;

	public AbstractPropertyType(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
}
