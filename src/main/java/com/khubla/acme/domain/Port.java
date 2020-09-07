package com.khubla.acme.domain;

import java.util.*;

public class Port {
	private final Map<String, PortType> portTypes = new HashMap<String, PortType>();
	private final List<DesignRule> designRules = new ArrayList<DesignRule>();
	private final Map<String, Property> properties = new HashMap<String, Property>();
	private String name;

	public void addDesignRule(DesignRule designRule) {
		designRules.add(designRule);
	}

	public void addPortType(PortType portType) {
		portTypes.put(portType.getName(), portType);
	}

	public void addProperty(Property property) {
		properties.put(property.getName(), property);
	}

	public List<DesignRule> getDesignRules() {
		return designRules;
	}

	public String getName() {
		return name;
	}

	public Map<String, PortType> getPortTypes() {
		return portTypes;
	}

	public Map<String, Property> getProperties() {
		return properties;
	}

	public void setName(String name) {
		this.name = name;
	}
}
