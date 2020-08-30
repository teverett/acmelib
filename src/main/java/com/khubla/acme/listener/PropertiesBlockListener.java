package com.khubla.acme.listener;

import com.khubla.acme.*;
import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class PropertiesBlockListener extends AbstractListener {
	public Properties properties;

	@Override
	public void enterPropertiesBlock(acmeParser.PropertiesBlockContext ctx) {
		properties = new Properties();
		if (null != ctx.parse_PropertyDescription()) {
			for (final Parse_PropertyDescriptionContext parse_PropertyDescriptionContext : ctx.parse_PropertyDescription()) {
				final Parse_PropertyDescriptionListener parse_PropertyDescriptionListener = new Parse_PropertyDescriptionListener();
				parse_PropertyDescriptionListener.enterParse_PropertyDescription(parse_PropertyDescriptionContext);
				properties.getProperties().add(parse_PropertyDescriptionListener.property);
			}
		}
	}
}
