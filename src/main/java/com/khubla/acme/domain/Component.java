package com.khubla.acme.domain;

import java.util.*;

public class Component {
	private String name;
	private final Map<String, Port> ports = new HashMap<String, Port>();
	private final Map<String, Representation> representations = new HashMap<String, Representation>();

	public String getName() {
		return name;
	}

	public Map<String, Port> getPorts() {
		return ports;
	}

	public Map<String, Representation> getRepresentations() {
		return representations;
	}

	public void setName(String name) {
		this.name = name;
	}
}
