package com.khubla.acme.domain;

import java.util.*;

public class Type {
	private String name;
	private List<Role> roles = new ArrayList<Role>();

	public String getName() {
		return name;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
}
