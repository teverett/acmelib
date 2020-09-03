package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class FamilyBodyListener extends AbstractListener {
	private final Family family;

	public FamilyBodyListener(Family family) {
		super();
		this.family = family;
	}

	@Override
	public void enterAcmeFamilyBody(AcmeFamilyBodyContext ctx) {
		/*
		 * attachment
		 */
		if (null != ctx.acmeAttachmentDeclaration()) {
			for (final AcmeAttachmentDeclarationContext acmeAttachmentDeclarationContext : ctx.acmeAttachmentDeclaration()) {
				final AttachmentsDeclarationListener attachmentsDeclarationListener = new AttachmentsDeclarationListener();
				attachmentsDeclarationListener.enterAcmeAttachmentDeclaration(acmeAttachmentDeclarationContext);
				family.setAttachments(attachmentsDeclarationListener.attachments);
			}
		}
		if (null != ctx.acmeComponentDeclaration()) {
			for (final AcmeComponentDeclarationContext acmeComponentDeclarationContext : ctx.acmeComponentDeclaration()) {
				final ComponentDeclarationListener componentDeclarationListener = new ComponentDeclarationListener();
				componentDeclarationListener.enterAcmeComponentDeclaration(acmeComponentDeclarationContext);
				family.addComponent(componentDeclarationListener.component);
			}
		}
		if (null != ctx.acmeComponentTypeDeclaration()) {
			for (final AcmeComponentTypeDeclarationContext acmeComponentTypeDeclarationContext : ctx.acmeComponentTypeDeclaration()) {
				final ComponentTypeDeclarationListener componentTypeDeclarationListener = new ComponentTypeDeclarationListener();
				componentTypeDeclarationListener.enterAcmeComponentTypeDeclaration(acmeComponentTypeDeclarationContext);
				family.addComponentType(componentTypeDeclarationListener.componentType);
			}
		}
		if (null != ctx.acmeConnectorDeclaration()) {
			for (final AcmeConnectorDeclarationContext acmeConnectorDeclarationContext : ctx.acmeConnectorDeclaration()) {
				final ConnectorDeclarationListener connectorDeclarationListener = new ConnectorDeclarationListener();
				connectorDeclarationListener.enterAcmeConnectorDeclaration(acmeConnectorDeclarationContext);
				family.addConnector(connectorDeclarationListener.connector);
			}
		}
		if (null != ctx.acmeConnectorTypeDeclaration()) {
			for (final AcmeConnectorTypeDeclarationContext acmeConnectorTypeDeclarationContext : ctx.acmeConnectorTypeDeclaration()) {
				final ConnectorTypeDeclarationListener connectorTypeDeclarationListener = new ConnectorTypeDeclarationListener();
				connectorTypeDeclarationListener.enterAcmeConnectorTypeDeclaration(acmeConnectorTypeDeclarationContext);
				family.addConnectorType(connectorTypeDeclarationListener.connectorType);
			}
		}
		if (null != ctx.acmeDesignAnalysisDeclaration()) {
			for (final AcmeDesignAnalysisDeclarationContext acmeDesignAnalysisDeclarationContext : ctx.acmeDesignAnalysisDeclaration()) {
				final DesignAnalysisDeclarationListener designAnalysisDeclarationListener = new DesignAnalysisDeclarationListener();
				designAnalysisDeclarationListener.enterAcmeDesignAnalysisDeclaration(acmeDesignAnalysisDeclarationContext);
				family.addDesignAnalysis(designAnalysisDeclarationListener.designAnalysis);
			}
		}
		if (null != ctx.acmeGenericElementTypeDeclaration()) {
			for (final AcmeGenericElementTypeDeclarationContext acmeGenericElementTypeDeclarationContext : ctx.acmeGenericElementTypeDeclaration()) {
				throw new RuntimeException("Not Implemented");
			}
		}
		if (null != ctx.acmeGroupDeclaration()) {
			for (final AcmeGroupDeclarationContext acmeGroupDeclarationContext : ctx.acmeGroupDeclaration()) {
				final GroupDeclarationListener groupDeclarationListener = new GroupDeclarationListener();
				groupDeclarationListener.enterAcmeGroupDeclaration(acmeGroupDeclarationContext);
				throw new RuntimeException("Not Implemented");
			}
		}
		if (null != ctx.acmeGroupTypeDeclaration()) {
			for (final AcmeGroupTypeDeclarationContext acmeGroupTypeDeclarationContext : ctx.acmeGroupTypeDeclaration()) {
				throw new RuntimeException("Not Implemented");
			}
		}
		if (null != ctx.acmePortDeclaration()) {
			for (final AcmePortDeclarationContext acmePortDeclarationContext : ctx.acmePortDeclaration()) {
				final PortDeclarationListener portDeclarationListener = new PortDeclarationListener();
				portDeclarationListener.enterAcmePortDeclaration(acmePortDeclarationContext);
				throw new RuntimeException("Not Implemented");
			}
		}
		if (null != ctx.acmePortTypeDeclaration()) {
			for (final AcmePortTypeDeclarationContext acmePortTypeDeclarationContext : ctx.acmePortTypeDeclaration()) {
				final PortTypeDeclarationListener portTypeDeclarationListener = new PortTypeDeclarationListener();
				portTypeDeclarationListener.enterAcmePortTypeDeclaration(acmePortTypeDeclarationContext);
				family.addPortType(portTypeDeclarationListener.type);
			}
		}
		if (null != ctx.acmePropertyDeclaration()) {
			for (final AcmePropertyDeclarationContext acmePropertyDeclarationContext : ctx.acmePropertyDeclaration()) {
				final PropertyDeclarationListener propertyDeclarationListener = new PropertyDeclarationListener();
				propertyDeclarationListener.enterAcmePropertyDeclaration(acmePropertyDeclarationContext);
				throw new RuntimeException("Not Implemented");
			}
		}
		if (null != ctx.acmePropertyTypeDeclaration()) {
			for (final AcmePropertyTypeDeclarationContext acmePropertyTypeDeclarationContext : ctx.acmePropertyTypeDeclaration()) {
				final PropertyTypeDeclarationListener propertyTypeDeclarationListener = new PropertyTypeDeclarationListener();
				propertyTypeDeclarationListener.enterAcmePropertyTypeDeclaration(acmePropertyTypeDeclarationContext);
				family.addPropertyType(propertyTypeDeclarationListener.propertyType);
			}
		}
		if (null != ctx.acmeRoleDeclaration()) {
			for (final AcmeRoleDeclarationContext acmeRoleDeclarationContext : ctx.acmeRoleDeclaration()) {
				final RoleDeclarationListener roleDeclarationListener = new RoleDeclarationListener();
				roleDeclarationListener.enterAcmeRoleDeclaration(acmeRoleDeclarationContext);
				throw new RuntimeException("Not Implemented");
			}
		}
		if (null != ctx.acmeRoleTypeDeclaration()) {
			for (final AcmeRoleTypeDeclarationContext acmeRoleTypeDeclarationContext : ctx.acmeRoleTypeDeclaration()) {
				final RoleTypeDeclarationListener roleTypeDeclarationListener = new RoleTypeDeclarationListener();
				roleTypeDeclarationListener.enterAcmeRoleTypeDeclaration(acmeRoleTypeDeclarationContext);
				family.addRoleType(roleTypeDeclarationListener.type);
			}
		}
		if (null != ctx.designRule()) {
			for (final DesignRuleContext designRuleContext : ctx.designRule()) {
				final DesignRuleListener designRuleListener = new DesignRuleListener();
				designRuleListener.enterDesignRule(designRuleContext);
				family.addDesignRule(designRuleListener.designRule);
			}
		}
	}

	public Family getFamily() {
		return family;
	}
}
