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
			for (AcmePropertyDeclarationContext acmePropertyDeclarationContext : ctx.acmePropertyDeclaration()) {
				PropertyDeclarationListener propertyDeclarationListener = new PropertyDeclarationListener();
				propertyDeclarationListener.enterAcmePropertyDeclaration(acmePropertyDeclarationContext);
			}
		}
		/*
		 * component
		 */
		if (null != ctx.acmeComponentDeclaration()) {
			for (AcmeComponentDeclarationContext acmeComponentDeclarationContext : ctx.acmeComponentDeclaration()) {
				ComponentDeclarationListener componentDeclarationListener = new ComponentDeclarationListener();
				componentDeclarationListener.enterAcmeComponentDeclaration(acmeComponentDeclarationContext);
			}
		}
		/*
		 * connector
		 */
		if (null != ctx.acmeConnectorDeclaration()) {
			for (AcmeConnectorDeclarationContext acmeConnectorDeclarationContext : ctx.acmeConnectorDeclaration()) {
				ConnectorDeclarationListener connectorDeclarationListener = new ConnectorDeclarationListener();
				connectorDeclarationListener.enterAcmeConnectorDeclaration(acmeConnectorDeclarationContext);
			}
		}
		/*
		 * attachment
		 */
		if (null != ctx.acmeAttachmentDeclaration()) {
			for (AcmeAttachmentDeclarationContext acmeAttachmentDeclarationContext : ctx.acmeAttachmentDeclaration()) {
				AttachmentsDeclarationListener attachmentsDeclarationListener = new AttachmentsDeclarationListener();
				attachmentsDeclarationListener.enterAcmeAttachmentDeclaration(acmeAttachmentDeclarationContext);
			}
		}
		/*
		 * group
		 */
		if (null != ctx.acmeGroupDeclaration()) {
			for (AcmeGroupDeclarationContext acmeGroupDeclarationContext : ctx.acmeGroupDeclaration()) {
				GroupDeclarationListener groupDeclarationListener = new GroupDeclarationListener();
				groupDeclarationListener.enterAcmeGroupDeclaration(acmeGroupDeclarationContext);
			}
		}
		/*
		 * rule
		 */
		if (null != ctx.designRule()) {
			for (DesignRuleContext designRuleContext : ctx.designRule()) {
				DesignRuleListener designRuleListener = new DesignRuleListener();
				designRuleListener.enterDesignRule(designRuleContext);
			}
		}
	}
}
