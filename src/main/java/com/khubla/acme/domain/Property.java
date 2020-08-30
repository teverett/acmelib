package com.khubla.acme.domain;

public class Property {
	private String name;
	private String typeName;
	private String typeNamePrefix;
	private String value;

	public String getName() {
		return name;
	}

	public String getTypeName() {
		return typeName;
	}

	public String getTypeNamePrefix() {
		return typeNamePrefix;
	}

	public String getValue() {
		return value;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public void setTypeNamePrefix(String typeNamePrefix) {
		this.typeNamePrefix = typeNamePrefix;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
