package com.khubla.acme.listener;

import com.khubla.acme.*;

public class PropertyTypeDescriptionListener extends AbstractListener {
	public String typePrefix;
	public String typeName;

	@Override
	public void enterPropertyTypeDescription(acmeParser.PropertyTypeDescriptionContext ctx) {
		if (ctx.ANY() != null) {
			throw new RuntimeException("Not Implemented");
		} else if (ctx.INT() != null) {
			throw new RuntimeException("Not Implemented");
		} else if (ctx.FLOAT() != null) {
			throw new RuntimeException("Not Implemented");
		} else if (ctx.BOOLEAN() != null) {
			throw new RuntimeException("Not Implemented");
		} else if (ctx.STRING() != null) {
			throw new RuntimeException("Not Implemented");
		} else if (ctx.SET() != null) {
			throw new RuntimeException("Not Implemented");
		} else if (ctx.SEQUENCE() != null) {
			throw new RuntimeException("Not Implemented");
		} else if (ctx.RECORD() != null) {
			throw new RuntimeException("Not Implemented");
		} else if (ctx.ENUM() != null) {
			throw new RuntimeException("Not Implemented");
		} else if (ctx.lookup_PropertyTypeByName() != null) {
			final Lookup_PropertyTypeByNameListener lookup_PropertyTypeByNameListener = new Lookup_PropertyTypeByNameListener();
			lookup_PropertyTypeByNameListener.enterLookup_PropertyTypeByName(ctx.lookup_PropertyTypeByName());
			if (lookup_PropertyTypeByNameListener.names.size() == 2) {
				typePrefix = lookup_PropertyTypeByNameListener.names.get(0);
				typeName = lookup_PropertyTypeByNameListener.names.get(1);
			} else {
				typeName = lookup_PropertyTypeByNameListener.names.get(0);
			}
		}
	}
}
