package com.khubla.acme.domain;

import java.util.*;

public class Connector {
	private String name;
	private List<Role> roles = new ArrayList<Role>();
	private List<DesignRule> designRules = new ArrayList<DesignRule>();
	private Properties properties;

	public void addProperty(Property property) {
		if (null == properties) {
			properties = new Properties();
		}
		properties.getProperties().add(property);
	}

	public List<DesignRule> getDesignRules() {
		return designRules;
	}

	public String getName() {
		return name;
	}

	public Properties getProperties() {
		return properties;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setDesignRules(List<DesignRule> designRules) {
		this.designRules = designRules;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
}
