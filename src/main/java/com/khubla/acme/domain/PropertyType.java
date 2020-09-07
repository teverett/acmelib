package com.khubla.acme.domain;

import java.util.*;

public class PropertyType {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setName(List<String> names) {
		name = new String();
		boolean first = true;
		for (String n : names) {
			if (first) {
				first = false;
			} else {
				name += ".";
			}
			name += n;
		}
	}
}
