package com.khubla.acme.listener;

import com.khubla.acme.*;
import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class ComponentDeclarationListener extends AbstractListener {
	public Component component;

	@Override
	public void enterComponentDeclaration(acmeParser.ComponentDeclarationContext ctx) {
		component = new Component();
		/*
		 * name
		 */
		if (null != ctx.IDENTIFIER()) {
			component.setName(ctx.IDENTIFIER().getText());
		}
		/*
		 * types
		 */
		if (null != ctx.lookup_ComponentTypeByName()) {
			for (final Lookup_ComponentTypeByNameContext lookup_ComponentTypeByNameContext : ctx.lookup_ComponentTypeByName()) {
				final Lookup_ComponentTypeByNameListener lookup_ComponentTypeByNameListener = new Lookup_ComponentTypeByNameListener();
				lookup_ComponentTypeByNameListener.enterLookup_ComponentTypeByName(lookup_ComponentTypeByNameContext);
			}
		}
		/*
		 * description
		 */
		if (null != ctx.parse_ComponentDescription()) {
			final Parse_ComponentDescriptionListener parse_ComponentDescriptionListener = new Parse_ComponentDescriptionListener(component);
			parse_ComponentDescriptionListener.enterParse_ComponentDescription(ctx.parse_ComponentDescription());
		}
	}
}
