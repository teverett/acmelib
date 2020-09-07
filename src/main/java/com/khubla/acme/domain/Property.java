package com.khubla.acme.domain;

public class Property {
	private String name;
	private Object value;
	private PropertyType propertyType;

	public String getName() {
		return name;
	}

	public PropertyType getPropertyType() {
		return propertyType;
	}

	public Object getValue() {
		return value;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPropertyType(PropertyType propertyType) {
		this.propertyType = propertyType;
	}

	public void setValue(Object value) {
		this.value = value;
	}
}
