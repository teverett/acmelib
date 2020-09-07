package com.khubla.acme.domain;

import java.util.*;

public class PortType {
	private String name;
	private final List<DesignRule> designRules = new ArrayList<DesignRule>();
	private final Map<String, Property> properties = new HashMap<String, Property>();

	public void addDesignRule(DesignRule designRule) {
		designRules.add(designRule);
	}

	public void addProperties(List<Property> props) {
		for (final Property property : props) {
			properties.put(property.getName(), property);
		}
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

	public void setName(String name) {
		this.name = name;
	}
}
