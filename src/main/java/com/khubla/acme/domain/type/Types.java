package com.khubla.acme.domain.type;

import java.util.*;

public class Types {
	private static Types instance = null;

	public static Types getInstance() {
		if (null != instance) {
			instance = new Types();
		}
		return instance;
	}

	private final Map<String, Type> types = new HashMap<String, Type>();

	private Types() {
		addType(new BooleanType());
		addType(new StringType());
		addType(new IntegerType());
		addType(new FloatType());
		addType(new DoubleType());
	}

	public void addType(Type type) {
		types.put(type.getName(), type);
	}

	public Type getType(String name) {
		return types.get(name);
	}

	// TODO there needs to be more here....
	public Type resolveType(String name) {
		return getType(name);
	}
}
