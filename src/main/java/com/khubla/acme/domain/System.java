package com.khubla.acme.domain;

import java.util.*;

public class System {
	private String name;
	private final List<String> names = new ArrayList<String>();
	private final Map<String, Component> components = new HashMap<String, Component>();
	private final Map<String, Connector> connectors = new HashMap<String, Connector>();

	public Map<String, Connector> getConnectors() {
		return connectors;
	}

	public System() {
		super();
	}

	public Map<String, Component> getComponents() {
		return components;
	}

	public String getName() {
		return name;
	}

	public List<String> getNames() {
		return names;
	}

	public void setName(String name) {
		this.name = name;
	}
}
