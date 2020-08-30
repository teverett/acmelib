package com.khubla.acme.domain;

import java.util.*;

public class Connector {
	private String name;
	private List<String> roles = new ArrayList<String>();

	public String getName() {
		return name;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
}
