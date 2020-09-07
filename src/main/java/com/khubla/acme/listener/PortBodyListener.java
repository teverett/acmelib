package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class PortBodyListener extends AbstractListener {
	private Port port = null;
	private PortType portType = null;

	public PortBodyListener(Port port) {
		super();
		this.port = port;
	}

	public PortBodyListener(PortType portType) {
		super();
		this.portType = portType;
	}

	@Override
	public void enterAcmePortBody(AcmePortBodyContext ctx) {
		if (null != ctx.designRule()) {
			for (final DesignRuleContext designRuleContext : ctx.designRule()) {
				final DesignRuleListener designRuleListener = new DesignRuleListener();
				designRuleListener.enterDesignRule(designRuleContext);
				if (null != port) {
					port.addDesignRule(designRuleListener.designRule);
				}
				if (null != portType) {
					portType.addDesignRule(designRuleListener.designRule);
				}
			}
		}
		if (null != ctx.acmePropertyDeclaration()) {
			for (final AcmePropertyDeclarationContext acmePropertyDeclarationContext : ctx.acmePropertyDeclaration()) {
				final PropertyDeclarationListener propertyDeclarationListener = new PropertyDeclarationListener();
				propertyDeclarationListener.enterAcmePropertyDeclaration(acmePropertyDeclarationContext);
				if (null != port) {
					port.addProperty(propertyDeclarationListener.property);
				}
				if (null != portType) {
					portType.addProperty(propertyDeclarationListener.property);
				}
			}
		}
		if (null != ctx.acmeRepresentationDeclaration()) {
			for (final AcmeRepresentationDeclarationContext acmeRepresentationDeclarationContext : ctx.acmeRepresentationDeclaration()) {
				final RepresentationDeclarationListener representationDeclarationListener = new RepresentationDeclarationListener();
				representationDeclarationListener.enterAcmeRepresentationDeclaration(acmeRepresentationDeclarationContext);
				throw new RuntimeException("Not Implemented");
			}
		}
	}
}
