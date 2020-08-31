package com.khubla.acme.domain;

import java.util.*;

public class Component {
	private String name;
	private final Map<String, Port> ports = new HashMap<String, Port>();
	private final Map<String, Representation> representations = new HashMap<String, Representation>();
	private Properties properties;

	public void addProperty(Property property) {
		if (null == properties) {
			properties = new Properties();
		}
		properties.getProperties().add(property);
	}

	public String getName() {
		return name;
	}

	public Map<String, Port> getPorts() {
		return ports;
	}

	public Properties getProperties() {
		return properties;
	}

	public Map<String, Representation> getRepresentations() {
		return representations;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
}
