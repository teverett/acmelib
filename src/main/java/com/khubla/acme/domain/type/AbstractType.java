package com.khubla.acme.domain.type;

import java.util.*;

public class AbstractType implements Type {
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

	public AbstractType(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
}
