package com.khubla.acme.listener;

import com.khubla.acme.*;
import com.khubla.acme.domain.*;

public class ElementProtoTypeDeclarationListener extends AbstractListener {
	public Type type;

	@Override
	public void enterElementProtoTypeDeclaration(acmeParser.ElementProtoTypeDeclarationContext ctx) {
		/*
		 * name
		 */
		type = new Type();
		if (null != ctx.IDENTIFIER()) {
			type.setName(ctx.IDENTIFIER().getText());
		}
		/*
		 * desc
		 */
		if (null != ctx.parse_ElementProtoTypeDescription()) {
			final Parse_ElementProtoTypeDescriptionListener parse_ElementProtoTypeDescriptionListener = new Parse_ElementProtoTypeDescriptionListener();
			parse_ElementProtoTypeDescriptionListener.enterParse_ElementProtoTypeDescription(ctx.parse_ElementProtoTypeDescription());
		}
	}
}
