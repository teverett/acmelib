package com.khubla.acme.domain;

import java.util.*;

public class Connector {
	private String name;
	private List<Role> roles = new ArrayList<Role>();
	private Properties properties;

	public String getName() {
		return name;
	}

	public Properties getProperties() {
		return properties;
	}

	public List<Role> getRoles() {
		return roles;
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
