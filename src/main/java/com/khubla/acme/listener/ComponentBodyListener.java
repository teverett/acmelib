package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class ComponentBodyListener extends AbstractListener {
	public ComponentBodyListener(Component component) {
		super();
	}

	@Override
	public void enterAcmeComponentBody(AcmeComponentBodyContext ctx) {
		if (null != ctx.acmePortDeclaration()) {
			for (final AcmePortDeclarationContext acmePortDeclarationContext : ctx.acmePortDeclaration()) {
				final PortDeclarationListener portDeclarationListener = new PortDeclarationListener();
				portDeclarationListener.enterAcmePortDeclaration(acmePortDeclarationContext);
			}
		}
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
		if (null != ctx.designRule()) {
			for (final DesignRuleContext designRuleContext : ctx.designRule()) {
				final DesignRuleListener designRuleListener = new DesignRuleListener();
				designRuleListener.enterDesignRule(designRuleContext);
				;
			}
		}
	}
}
