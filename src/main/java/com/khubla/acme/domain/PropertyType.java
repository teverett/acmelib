package com.khubla.acme.domain;

import java.util.*;

import com.khubla.acme.domain.type.*;

public class PropertyType {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(List<String> names) {
		name = AbstractType.buildName(names);
	}

	public void setName(String name) {
		this.name = name;
	}
}
