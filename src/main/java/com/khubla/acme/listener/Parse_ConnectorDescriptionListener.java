package com.khubla.acme.listener;

import com.khubla.acme.*;
import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class Parse_ConnectorDescriptionListener extends AbstractListener {
	private Connector connector;

	public Parse_ConnectorDescriptionListener(Connector connector) {
		super();
		this.connector = connector;
	}

	@Override
	public void enterParse_ConnectorDescription(acmeParser.Parse_ConnectorDescriptionContext ctx) {
		/*
		 * types
		 */
		if (null != ctx.lookup_ConnectorTypeByName()) {
			for (final Lookup_ConnectorTypeByNameContext lookup_ConnectorTypeByNameContext : ctx.lookup_ConnectorTypeByName()) {
				final Lookup_ConnectorTypeByNameListener lookup_ConnectorTypeByNameListener = new Lookup_ConnectorTypeByNameListener();
				lookup_ConnectorTypeByNameListener.enterLookup_ConnectorTypeByName(lookup_ConnectorTypeByNameContext);
			}
		}
		/*
		 * properties blocks
		 */
		if (null != ctx.propertiesBlock()) {
			for (final PropertiesBlockContext propertiesBlockContext : ctx.propertiesBlock()) {
				final PropertiesBlockListener propertiesBlockListener = new PropertiesBlockListener();
				propertiesBlockListener.enterPropertiesBlock(propertiesBlockContext);
				connector.setProperties(propertiesBlockListener.properties);
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
		 * role decl
		 */
		if (null != ctx.roleDeclaration()) {
			for (final RoleDeclarationContext roleDeclarationContext : ctx.roleDeclaration()) {
				final RoleDeclarationListener roleDeclarationListener = new RoleDeclarationListener();
				roleDeclarationListener.enterRoleDeclaration(roleDeclarationContext);
			}
		}
		/*
		 * block1
		 */
		if (null != ctx.rolesBlock1()) {
			for (final RolesBlock1Context rolesBlock1Context : ctx.rolesBlock1()) {
				final RolesBlock1Listener rolesBlock1Listener = new RolesBlock1Listener();
				rolesBlock1Listener.enterRolesBlock1(rolesBlock1Context);
			}
		}
		/*
		 * block2
		 */
		if (null != ctx.rolesBlock2()) {
			for (final RolesBlock2Context rolesBlock2Context : ctx.rolesBlock2()) {
				final RolesBlock2Listener rolesBlock2Listener = new RolesBlock2Listener();
				rolesBlock2Listener.enterRolesBlock2(rolesBlock2Context);
				connector.setRoles(rolesBlock2Listener.roles);
			}
		}
		/*
		 * extend
		 */
		if (null != ctx.parse_ConnectorDescription()) {
			final Parse_ConnectorDescriptionListener parse_ConnectorDescriptionListener = new Parse_ConnectorDescriptionListener(connector);
			parse_ConnectorDescriptionListener.enterParse_ConnectorDescription(ctx.parse_ConnectorDescription());
		}
	}

	public Connector getConnector() {
		return connector;
	}

	public void setConnector(Connector connector) {
		this.connector = connector;
	}
}
