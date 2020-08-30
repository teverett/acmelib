package com.khubla.acme.domain;

import java.util.*;

public class Connector {
	private String name;
	public List<String> roles = new ArrayList<String>();

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
