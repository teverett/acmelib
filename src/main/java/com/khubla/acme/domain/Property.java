package com.khubla.acme.domain;

import java.util.*;

import com.khubla.acme.domain.propertytype.*;

public class Property {
	private String name;
	private Object value;
	private PropertyType propertyType;
	private final Map<String, Property> properties = new HashMap<String, Property>();

	public void addProperties(List<Property> props) {
		for (final Property property : props) {
			properties.put(property.getName(), property);
		}
	}

	public void addProperty(Property property) {
		properties.put(property.getName(), property);
	}

	public String getName() {
		return name;
	}

	public Map<String, Property> getProperties() {
		return properties;
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
