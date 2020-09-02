package com.khubla.acme.domain;

import java.util.*;

public class Unit {
	private Map<String, System> systems = new HashMap<String, System>();
	private Map<String, Family> familes = new HashMap<String, Family>();
	private List<Design> designs = new ArrayList<Design>();
	private List<Import> imports = new ArrayList<Import>();

	public void addDesign(Design design) {
		designs.add(design);
	}

	public void addFamily(Family family) {
		familes.put(family.getName(), family);
	}

	public void addImport(Import imp) {
		imports.add(imp);
	}

	public void addSysten(System system) {
		systems.put(system.getName(), system);
	}

	public List<Design> getDesigns() {
		return designs;
	}

	public Map<String, Family> getFamiles() {
		return familes;
	}

	public List<Import> getImports() {
		return imports;
	}

	public Map<String, System> getSystems() {
		return systems;
	}

	public void setDesigns(List<Design> designs) {
		this.designs = designs;
	}

	public void setFamiles(Map<String, Family> familes) {
		this.familes = familes;
	}

	public void setImports(List<Import> imports) {
		this.imports = imports;
	}

	public void setSystems(Map<String, System> systems) {
		this.systems = systems;
	}
}
