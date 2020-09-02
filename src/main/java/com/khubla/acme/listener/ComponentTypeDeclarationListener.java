package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class ComponentTypeDeclarationListener extends AbstractListener {
	public Type type;

	@Override
	public void enterAcmeComponentTypeDeclaration(AcmeComponentTypeDeclarationContext ctx) {
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
		if (null != ctx.parse_ComponentDescription()) {
			final Component component = new Component();
			final Parse_ComponentDescriptionListener parse_ComponentDescriptionListener = new Parse_ComponentDescriptionListener(component);
			parse_ComponentDescriptionListener.enterParse_ComponentDescription(ctx.parse_ComponentDescription());
		}
	}
}
