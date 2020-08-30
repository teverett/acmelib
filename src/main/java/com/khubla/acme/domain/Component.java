package com.khubla.acme.domain;

import java.util.*;

public class Component {
	private String name;
	private final Map<String, Port> ports = new HashMap<String, Port>();
	private Properties properties;

	public String getName() {
		return name;
	}

	public Map<String, Port> getPorts() {
		return ports;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
}
