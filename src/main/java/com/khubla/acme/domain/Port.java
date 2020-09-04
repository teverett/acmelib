package com.khubla.acme.domain;

import java.util.*;

public class Port {
	private final Map<String, PortType> portTypes = new HashMap<String, PortType>();
	private final List<DesignRule> designRules = new ArrayList<DesignRule>();

	public void addDesignRule(DesignRule designRule) {
		designRules.add(designRule);
	}

	public List<DesignRule> getDesignRules() {
		return designRules;
	}

	public Map<String, PortType> getPortTypes() {
		return portTypes;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addPortType(PortType portType) {
		this.portTypes.put(portType.getName(), portType);
	}
}
