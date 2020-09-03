package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class ComponentBodyListener extends AbstractListener {
	@Override
	public void enterAcmeComponentBody(AcmeComponentBodyContext ctx) {
		if (null != ctx.acmePortDeclaration()) {
			for (AcmePortDeclarationContext acmePortDeclarationContext : ctx.acmePortDeclaration()) {
				PortDeclarationListener portDeclarationListener = new PortDeclarationListener();
				portDeclarationListener.enterAcmePortDeclaration(acmePortDeclarationContext);
			}
		}
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
		if (null != ctx.designRule()) {
			for (DesignRuleContext designRuleContext : ctx.designRule()) {
				DesignRuleListener designRuleListener = new DesignRuleListener();
				designRuleListener.enterDesignRule(designRuleContext);
				;
			}
		}
	}
}
