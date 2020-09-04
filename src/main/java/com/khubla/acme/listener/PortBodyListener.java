package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class PortBodyListener extends AbstractListener {
	private final Port port;

	public PortBodyListener(Port port) {
		super();
		this.port = port;
	}

	@Override
	public void enterAcmePortBody(AcmePortBodyContext ctx) {
		if (null != ctx.designRule()) {
			for (final DesignRuleContext designRuleContext : ctx.designRule()) {
				final DesignRuleListener designRuleListener = new DesignRuleListener();
				designRuleListener.enterDesignRule(designRuleContext);
				port.addDesignRule(designRuleListener.designRule);
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
	}
}
