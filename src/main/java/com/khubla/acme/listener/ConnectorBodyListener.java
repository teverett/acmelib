package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class ConnectorBodyListener extends AbstractListener {
	@Override
	public void enterAcmeConnectorBody(AcmeConnectorBodyContext ctx) {
		if (null != ctx.acmePropertyDeclaration()) {
			for (AcmePropertyDeclarationContext acmePropertyDeclarationContext : ctx.acmePropertyDeclaration()) {
				PropertyDeclarationListener propertyDeclarationListener = new PropertyDeclarationListener();
				propertyDeclarationListener.enterAcmePropertyDeclaration(acmePropertyDeclarationContext);
			}
		}
		if (null != ctx.acmeRepresentationDeclaration()) {
			for (AcmeRepresentationDeclarationContext acmeRepresentationDeclarationContext : ctx.acmeRepresentationDeclaration()) {
				RepresentationDeclarationListener representationDeclarationListener = new RepresentationDeclarationListener();
				representationDeclarationListener.enterAcmeRepresentationDeclaration(acmeRepresentationDeclarationContext);
			}
		}
		if (null != ctx.acmeRoleDeclaration()) {
			for (AcmeRoleDeclarationContext acmeRoleDeclarationContext : ctx.acmeRoleDeclaration()) {
				RoleDeclarationListener roleDeclarationListener = new RoleDeclarationListener();
				roleDeclarationListener.enterAcmeRoleDeclaration(acmeRoleDeclarationContext);
			}
		}
		if (null != ctx.designRule()) {
			for (DesignRuleContext designRuleContext : ctx.designRule()) {
				DesignRuleListener designRuleListener = new DesignRuleListener();
				designRuleListener.enterDesignRule(designRuleContext);
			}
		}
	}
}
