package com.khubla.acme.domain;

import java.util.*;

public class Representation {
	private String name;
	private Bindings bindings;
	private Map<String, System> systems = new HashMap<String, System>();

	public Bindings getBindings() {
		return bindings;
	}

	public String getName() {
		return name;
	}

	public Map<String, System> getSystems() {
		return systems;
	}

	public void setBindings(Bindings bindings) {
		this.bindings = bindings;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSystems(Map<String, System> systems) {
		this.systems = systems;
	}
}
