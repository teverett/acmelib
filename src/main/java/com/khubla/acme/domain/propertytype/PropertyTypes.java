package com.khubla.acme.domain.propertytype;

import java.util.*;

public class PropertyTypes {
	private static PropertyTypes instance = null;

	public static PropertyTypes getInstance() {
		if (null != instance) {
			instance = new PropertyTypes();
		}
		return instance;
	}

	private final Map<String, PropertyType> types = new HashMap<String, PropertyType>();

	private PropertyTypes() {
		addType(new BooleanPropertyType());
		addType(new StringPropertyType());
		addType(new IntegerPropertyType());
		addType(new FloatPropertyType());
		addType(new DoublePropertyType());
	}

	public void addType(PropertyType type) {
		types.put(type.getName(), type);
	}

	public PropertyType getType(String name) {
		return types.get(name);
	}

	// TODO there needs to be more here....
	public PropertyType resolveType(String name) {
		return getType(name);
	}
}
