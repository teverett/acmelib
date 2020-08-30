package com.khubla.acme.listener;

import com.khubla.acme.*;
import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class Parse_ComponentDescriptionListener extends AbstractListener {
	public final Component component;

	public Parse_ComponentDescriptionListener(Component component) {
		super();
		this.component = component;
	}

	@Override
	public void enterParse_ComponentDescription(acmeParser.Parse_ComponentDescriptionContext ctx) {
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
		 * port decl
		 */
		if (null != ctx.portDeclaration()) {
			for (final PortDeclarationContext portDeclarationContext : ctx.portDeclaration()) {
				final PortDeclarationListener portDeclarationListener = new PortDeclarationListener();
				portDeclarationListener.enterPortDeclaration(portDeclarationContext);
				component.getPorts().put(portDeclarationListener.port.getName(), portDeclarationListener.port);
			}
		}
		/*
		 * port block
		 */
		if (null != ctx.portsBlock()) {
			for (final PortsBlockContext portsBlockContext : ctx.portsBlock()) {
				final PortsBlockListener portsBlockListener = new PortsBlockListener();
				portsBlockListener.enterPortsBlock(portsBlockContext);
			}
		}
		/*
		 * properties blocks
		 */
		if (null != ctx.propertiesBlock()) {
			for (final PropertiesBlockContext propertiesBlockContext : ctx.propertiesBlock()) {
				final PropertiesBlockListener propertiesBlockListener = new PropertiesBlockListener();
				propertiesBlockListener.enterPropertiesBlock(propertiesBlockContext);
				component.setProperties(propertiesBlockListener.properties);
			}
		}
		/*
		 * property declarations
		 */
		if (null != ctx.propertyDeclaration()) {
			for (final PropertyDeclarationContext propertyDeclarationContext : ctx.propertyDeclaration()) {
				final PropertyDeclarationListener propertyDeclarationListener = new PropertyDeclarationListener();
				propertyDeclarationListener.enterPropertyDeclaration(propertyDeclarationContext);
			}
		}
		/*
		 * rep
		 */
		if (null != ctx.representationDeclaration()) {
			for (final RepresentationDeclarationContext representationDeclarationContext : ctx.representationDeclaration()) {
				final RepresentationDeclarationListener representationDeclarationListener = new RepresentationDeclarationListener();
				representationDeclarationListener.enterRepresentationDeclaration(representationDeclarationContext);
			}
		}
		/*
		 * design rule
		 */
		if (null != ctx.parse_DesignRule()) {
			for (final Parse_DesignRuleContext parse_DesignRuleContext : ctx.parse_DesignRule()) {
				final Parse_DesignRuleListener parse_DesignRuleListener = new Parse_DesignRuleListener();
				parse_DesignRuleListener.enterParse_DesignRule(parse_DesignRuleContext);
			}
		}
		/*
		 * component
		 */
		if (null != ctx.parse_ComponentDescription()) {
			final Parse_ComponentDescriptionListener parse_ComponentDescriptionListener = new Parse_ComponentDescriptionListener(component);
			parse_ComponentDescriptionListener.enterParse_ComponentDescription(ctx.parse_ComponentDescription());
		}
	}
}
