package com.khubla.acme.domain;

import java.util.*;

public class Design {
	private Design design;

	public Design getDesign() {
		return design;
	}

	public void setDesign(Design design) {
		this.design = design;
	}

	private Map<String, System> systems = new HashMap<String, System>();

	public Map<String, System> getSystems() {
		return systems;
	}

	public void setSystems(Map<String, System> systems) {
		this.systems = systems;
	}
}
