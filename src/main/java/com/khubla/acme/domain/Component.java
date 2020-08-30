package com.khubla.acme.domain;

import java.util.*;

public class Component {
	private String name;
	private final Map<String, Port> ports = new HashMap<String, Port>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, Port> getPorts() {
		return ports;
	}
}
