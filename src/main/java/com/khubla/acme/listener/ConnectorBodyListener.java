package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class ConnectorBodyListener extends AbstractListener {
	@Override
	public void enterAcmeConnectorBody(AcmeConnectorBodyContext ctx) {
		if (null != ctx.acmePropertyDeclaration()) {
			for (final AcmePropertyDeclarationContext acmePropertyDeclarationContext : ctx.acmePropertyDeclaration()) {
				final PropertyDeclarationListener propertyDeclarationListener = new PropertyDeclarationListener();
				propertyDeclarationListener.enterAcmePropertyDeclaration(acmePropertyDeclarationContext);
			}
		}
		if (null != ctx.acmeRepresentationDeclaration()) {
			for (final AcmeRepresentationDeclarationContext acmeRepresentationDeclarationContext : ctx.acmeRepresentationDeclaration()) {
				final RepresentationDeclarationListener representationDeclarationListener = new RepresentationDeclarationListener();
				representationDeclarationListener.enterAcmeRepresentationDeclaration(acmeRepresentationDeclarationContext);
			}
		}
		if (null != ctx.acmeRoleDeclaration()) {
			for (final AcmeRoleDeclarationContext acmeRoleDeclarationContext : ctx.acmeRoleDeclaration()) {
				final RoleDeclarationListener roleDeclarationListener = new RoleDeclarationListener();
				roleDeclarationListener.enterAcmeRoleDeclaration(acmeRoleDeclarationContext);
			}
		}
		if (null != ctx.designRule()) {
			for (final DesignRuleContext designRuleContext : ctx.designRule()) {
				final DesignRuleListener designRuleListener = new DesignRuleListener();
				designRuleListener.enterDesignRule(designRuleContext);
			}
		}
	}
}
