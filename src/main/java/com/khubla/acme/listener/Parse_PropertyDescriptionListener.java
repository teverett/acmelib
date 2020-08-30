package com.khubla.acme.listener;

import com.khubla.acme.*;
import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class Parse_PropertyDescriptionListener extends AbstractListener {
	public Property property;

	@Override
	public void enterParse_PropertyDescription(acmeParser.Parse_PropertyDescriptionContext ctx) {
		/*
		 * name
		 */
		property = new Property();
		if (null != ctx.IDENTIFIER()) {
			property.setName(ctx.IDENTIFIER().getText());
		}
		/*
		 * type
		 */
		if (null != ctx.propertyTypeDescription()) {
			final PropertyTypeDescriptionListener propertyTypeDescriptionListener = new PropertyTypeDescriptionListener();
			propertyTypeDescriptionListener.enterPropertyTypeDescription(ctx.propertyTypeDescription());
			property.setTypeName(propertyTypeDescriptionListener.typeName);
			property.setTypeNamePrefix(propertyTypeDescriptionListener.typePrefix);
		}
		/*
		 * value
		 */
		if (null != ctx.propertyValueDeclaration()) {
			final PropertyValueDeclarationListener propertyValueDeclarationListener = new PropertyValueDeclarationListener();
			propertyValueDeclarationListener.enterPropertyValueDeclaration(ctx.propertyValueDeclaration());
			property.setValue(propertyValueDeclarationListener.value);
		}
		/*
		 * descriptions
		 */
		if (null != ctx.parse_PropertyDescription()) {
			for (final Parse_PropertyDescriptionContext parse_PropertyDescriptionContext : ctx.parse_PropertyDescription()) {
				final Parse_PropertyDescriptionListener parse_PropertyDescriptionListener = new Parse_PropertyDescriptionListener();
				parse_PropertyDescriptionListener.enterParse_PropertyDescription(parse_PropertyDescriptionContext);
			}
		}
	}
}
