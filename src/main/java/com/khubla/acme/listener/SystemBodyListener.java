package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;;

public class SystemBodyListener extends AbstractListener {
	public SystemBodyListener() {
		super();
	}

	@Override
	public void enterAcmeSystemBody(AcmeSystemBodyContext ctx) {
		/*
		 * property
		 */
		if (null != ctx.acmePropertyDeclaration()) {
			for (final AcmePropertyDeclarationContext acmePropertyDeclarationContext : ctx.acmePropertyDeclaration()) {
				final PropertyDeclarationListener propertyDeclarationListener = new PropertyDeclarationListener();
				propertyDeclarationListener.enterAcmePropertyDeclaration(acmePropertyDeclarationContext);
			}
		}
		/*
		 * component
		 */
		if (null != ctx.acmeComponentDeclaration()) {
			for (final AcmeComponentDeclarationContext acmeComponentDeclarationContext : ctx.acmeComponentDeclaration()) {
				final ComponentDeclarationListener componentDeclarationListener = new ComponentDeclarationListener();
				componentDeclarationListener.enterAcmeComponentDeclaration(acmeComponentDeclarationContext);
			}
		}
		/*
		 * connector
		 */
		if (null != ctx.acmeConnectorDeclaration()) {
			for (final AcmeConnectorDeclarationContext acmeConnectorDeclarationContext : ctx.acmeConnectorDeclaration()) {
				final ConnectorDeclarationListener connectorDeclarationListener = new ConnectorDeclarationListener();
				connectorDeclarationListener.enterAcmeConnectorDeclaration(acmeConnectorDeclarationContext);
			}
		}
		/*
		 * attachment
		 */
		if (null != ctx.acmeAttachmentDeclaration()) {
			for (final AcmeAttachmentDeclarationContext acmeAttachmentDeclarationContext : ctx.acmeAttachmentDeclaration()) {
				final AttachmentsDeclarationListener attachmentsDeclarationListener = new AttachmentsDeclarationListener();
				attachmentsDeclarationListener.enterAcmeAttachmentDeclaration(acmeAttachmentDeclarationContext);
			}
		}
		/*
		 * group
		 */
		if (null != ctx.acmeGroupDeclaration()) {
			for (final AcmeGroupDeclarationContext acmeGroupDeclarationContext : ctx.acmeGroupDeclaration()) {
				final GroupDeclarationListener groupDeclarationListener = new GroupDeclarationListener();
				groupDeclarationListener.enterAcmeGroupDeclaration(acmeGroupDeclarationContext);
			}
		}
		/*
		 * rule
		 */
		if (null != ctx.designRule()) {
			for (final DesignRuleContext designRuleContext : ctx.designRule()) {
				final DesignRuleListener designRuleListener = new DesignRuleListener();
				designRuleListener.enterDesignRule(designRuleContext);
			}
		}
	}
}
