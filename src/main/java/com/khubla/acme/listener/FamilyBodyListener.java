package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class FamilyBodyListener extends AbstractListener {
	private final Family family;

	public Family getFamily() {
		return family;
	}

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
			for (AcmeAttachmentDeclarationContext acmeAttachmentDeclarationContext : ctx.acmeAttachmentDeclaration()) {
				AttachmentsDeclarationListener attachmentsDeclarationListener = new AttachmentsDeclarationListener();
				attachmentsDeclarationListener.enterAcmeAttachmentDeclaration(acmeAttachmentDeclarationContext);
				family.setAttachments(attachmentsDeclarationListener.attachments);
			}
		}
		if (null != ctx.acmeComponentDeclaration()) {
			for (AcmeComponentDeclarationContext acmeComponentDeclarationContext : ctx.acmeComponentDeclaration()) {
				ComponentDeclarationListener componentDeclarationListener = new ComponentDeclarationListener();
				componentDeclarationListener.enterAcmeComponentDeclaration(acmeComponentDeclarationContext);
				this.family.addComponent(componentDeclarationListener.component);
			}
		}
		if (null != ctx.acmeComponentTypeDeclaration()) {
			for (AcmeComponentTypeDeclarationContext acmeComponentTypeDeclarationContext : ctx.acmeComponentTypeDeclaration()) {
				ComponentTypeDeclarationListener componentTypeDeclarationListener = new ComponentTypeDeclarationListener();
				componentTypeDeclarationListener.enterAcmeComponentTypeDeclaration(acmeComponentTypeDeclarationContext);
				this.family.addComponentType(componentTypeDeclarationListener.componentType);
			}
		}
		if (null != ctx.acmeConnectorDeclaration()) {
			for (AcmeConnectorDeclarationContext acmeConnectorDeclarationContext : ctx.acmeConnectorDeclaration()) {
				ConnectorDeclarationListener connectorDeclarationListener = new ConnectorDeclarationListener();
				connectorDeclarationListener.enterAcmeConnectorDeclaration(acmeConnectorDeclarationContext);
				this.family.addConnector(connectorDeclarationListener.connector);
			}
		}
		if (null != ctx.acmeConnectorTypeDeclaration()) {
			for (AcmeConnectorTypeDeclarationContext acmeConnectorTypeDeclarationContext : ctx.acmeConnectorTypeDeclaration()) {
				ConnectorTypeDeclarationListener connectorTypeDeclarationListener = new ConnectorTypeDeclarationListener();
				connectorTypeDeclarationListener.enterAcmeConnectorTypeDeclaration(acmeConnectorTypeDeclarationContext);
				this.family.addConnectorType(connectorTypeDeclarationListener.connectorType);
			}
		}
		if (null != ctx.acmeDesignAnalysisDeclaration()) {
			for (AcmeDesignAnalysisDeclarationContext acmeDesignAnalysisDeclarationContext : ctx.acmeDesignAnalysisDeclaration()) {
				DesignAnalysisDeclarationListener designAnalysisDeclarationListener = new DesignAnalysisDeclarationListener();
				designAnalysisDeclarationListener.enterAcmeDesignAnalysisDeclaration(acmeDesignAnalysisDeclarationContext);
				throw new RuntimeException("Not Implemented");
			}
		}
		if (null != ctx.acmeGenericElementTypeDeclaration()) {
			for (AcmeGenericElementTypeDeclarationContext acmeGenericElementTypeDeclarationContext : ctx.acmeGenericElementTypeDeclaration()) {
				throw new RuntimeException("Not Implemented");
			}
		}
		if (null != ctx.acmeGroupDeclaration()) {
			for (AcmeGroupDeclarationContext acmeGroupDeclarationContext : ctx.acmeGroupDeclaration()) {
				GroupDeclarationListener groupDeclarationListener = new GroupDeclarationListener();
				groupDeclarationListener.enterAcmeGroupDeclaration(acmeGroupDeclarationContext);
				throw new RuntimeException("Not Implemented");
			}
		}
		if (null != ctx.acmeGroupTypeDeclaration()) {
			for (AcmeGroupTypeDeclarationContext acmeGroupTypeDeclarationContext : ctx.acmeGroupTypeDeclaration()) {
				throw new RuntimeException("Not Implemented");
			}
		}
		if (null != ctx.acmePortDeclaration()) {
			for (AcmePortDeclarationContext acmePortDeclarationContext : ctx.acmePortDeclaration()) {
				PortDeclarationListener portDeclarationListener = new PortDeclarationListener();
				portDeclarationListener.enterAcmePortDeclaration(acmePortDeclarationContext);
				throw new RuntimeException("Not Implemented");
			}
		}
		if (null != ctx.acmePortTypeDeclaration()) {
			for (AcmePortTypeDeclarationContext acmePortTypeDeclarationContext : ctx.acmePortTypeDeclaration()) {
				PortTypeDeclarationListener portTypeDeclarationListener = new PortTypeDeclarationListener();
				portTypeDeclarationListener.enterAcmePortTypeDeclaration(acmePortTypeDeclarationContext);
				throw new RuntimeException("Not Implemented");
			}
		}
		if (null != ctx.acmePropertyDeclaration()) {
			for (AcmePropertyDeclarationContext acmePropertyDeclarationContext : ctx.acmePropertyDeclaration()) {
				PropertyDeclarationListener propertyDeclarationListener = new PropertyDeclarationListener();
				propertyDeclarationListener.enterAcmePropertyDeclaration(acmePropertyDeclarationContext);
				throw new RuntimeException("Not Implemented");
			}
		}
		if (null != ctx.acmePropertyTypeDeclaration()) {
			for (AcmePropertyTypeDeclarationContext acmePropertyTypeDeclarationContext : ctx.acmePropertyTypeDeclaration()) {
				// PropertyTypeDeclarationListener propertyTypeDeclarationListener = new
				// PropertyDeclarationListener();
				throw new RuntimeException("Not Implemented");
			}
		}
		if (null != ctx.acmeRoleDeclaration()) {
			for (AcmeRoleDeclarationContext acmeRoleDeclarationContext : ctx.acmeRoleDeclaration()) {
				RoleDeclarationListener roleDeclarationListener = new RoleDeclarationListener();
				roleDeclarationListener.enterAcmeRoleDeclaration(acmeRoleDeclarationContext);
				throw new RuntimeException("Not Implemented");
			}
		}
		if (null != ctx.acmeRoleTypeDeclaration()) {
			for (AcmeRoleTypeDeclarationContext acmeRoleTypeDeclarationContext : ctx.acmeRoleTypeDeclaration()) {
				RoleTypeDeclarationListener roleTypeDeclarationListener = new RoleTypeDeclarationListener();
				roleTypeDeclarationListener.enterAcmeRoleTypeDeclaration(acmeRoleTypeDeclarationContext);
				throw new RuntimeException("Not Implemented");
			}
		}
	}
}
