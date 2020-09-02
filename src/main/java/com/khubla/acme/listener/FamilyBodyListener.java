package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class FamilyBodyListener extends AbstractListener {
	@Override
	public void enterAcmeFamilyBody(AcmeFamilyBodyContext ctx) {
		/*
		 * attachment
		 */
		if (null != ctx.acmeAttachmentDeclaration()) {
			for (AcmeAttachmentDeclarationContext acmeAttachmentDeclarationContext : ctx.acmeAttachmentDeclaration()) {
				AttachmentsDeclarationListener attachmentsDeclarationListener = new AttachmentsDeclarationListener();
				attachmentsDeclarationListener.enterAcmeAttachmentDeclaration(acmeAttachmentDeclarationContext);
			}
		}
		if (null != ctx.acmeComponentDeclaration()) {
			for (AcmeComponentDeclarationContext acmeComponentDeclarationContext : ctx.acmeComponentDeclaration()) {
				ComponentDeclarationListener componentDeclarationListener = new ComponentDeclarationListener();
				componentDeclarationListener.enterAcmeComponentDeclaration(acmeComponentDeclarationContext);
			}
		}
		if (null != ctx.acmeComponentTypeDeclaration()) {
			for (AcmeComponentTypeDeclarationContext acmeComponentTypeDeclarationContext : ctx.acmeComponentTypeDeclaration()) {
				ComponentTypeDeclarationListener componentTypeDeclarationListener = new ComponentTypeDeclarationListener();
				componentTypeDeclarationListener.enterAcmeComponentTypeDeclaration(acmeComponentTypeDeclarationContext);
			}
		}
		if (null != ctx.acmeConnectorDeclaration()) {
			for (AcmeConnectorDeclarationContext acmeConnectorDeclarationContext : ctx.acmeConnectorDeclaration()) {
				ConnectorDeclarationListener connectorDeclarationListener = new ConnectorDeclarationListener();
				connectorDeclarationListener.enterAcmeConnectorDeclaration(acmeConnectorDeclarationContext);
			}
		}
		if (null != ctx.acmeConnectorTypeDeclaration()) {
			for (AcmeConnectorTypeDeclarationContext acmeConnectorTypeDeclarationContext : ctx.acmeConnectorTypeDeclaration()) {
				ConnectorTypeDeclarationListener connectorTypeDeclarationListener = new ConnectorTypeDeclarationListener();
				connectorTypeDeclarationListener.enterAcmeConnectorTypeDeclaration(acmeConnectorTypeDeclarationContext);
			}
		}
		if (null != ctx.acmeDesignAnalysisDeclaration()) {
			for (AcmeDesignAnalysisDeclarationContext acmeDesignAnalysisDeclarationContext : ctx.acmeDesignAnalysisDeclaration()) {
				DesignAnalysisDeclarationListener designAnalysisDeclarationListener = new DesignAnalysisDeclarationListener();
				designAnalysisDeclarationListener.enterAcmeDesignAnalysisDeclaration(acmeDesignAnalysisDeclarationContext);
			}
		}
		if (null != ctx.acmeGenericElementTypeDeclaration()) {
			for (AcmeGenericElementTypeDeclarationContext acmeGenericElementTypeDeclarationContext : ctx.acmeGenericElementTypeDeclaration()) {
				// TODO
			}
		}
		if (null != ctx.acmeGroupDeclaration()) {
			for (AcmeGroupDeclarationContext acmeGroupDeclarationContext : ctx.acmeGroupDeclaration()) {
				GroupDeclarationListener groupDeclarationListener = new GroupDeclarationListener();
				groupDeclarationListener.enterAcmeGroupDeclaration(acmeGroupDeclarationContext);
			}
		}
		if (null != ctx.acmeGroupTypeDeclaration()) {
			for (AcmeGroupTypeDeclarationContext acmeGroupTypeDeclarationContext : ctx.acmeGroupTypeDeclaration()) {
				// TODO
			}
		}
		if (null != ctx.acmePortDeclaration()) {
			for (AcmePortDeclarationContext acmePortDeclarationContext : ctx.acmePortDeclaration()) {
				PortDeclarationListener portDeclarationListener = new PortDeclarationListener();
				portDeclarationListener.enterAcmePortDeclaration(acmePortDeclarationContext);
			}
		}
		if (null != ctx.acmePortTypeDeclaration()) {
			for (AcmePortTypeDeclarationContext acmePortTypeDeclarationContext : ctx.acmePortTypeDeclaration()) {
				PortTypeDeclarationListener portTypeDeclarationListener = new PortTypeDeclarationListener();
				portTypeDeclarationListener.enterAcmePortTypeDeclaration(acmePortTypeDeclarationContext);
			}
		}
		if (null != ctx.acmePropertyDeclaration()) {
			for (AcmePropertyDeclarationContext acmePropertyDeclarationContext : ctx.acmePropertyDeclaration()) {
				PropertyDeclarationListener propertyDeclarationListener = new PropertyDeclarationListener();
				propertyDeclarationListener.enterAcmePropertyDeclaration(acmePropertyDeclarationContext);
			}
		}
		if (null != ctx.acmePropertyTypeDeclaration()) {
			for (AcmePropertyTypeDeclarationContext acmePropertyTypeDeclarationContext : ctx.acmePropertyTypeDeclaration()) {
				// PropertyTypeDeclarationListener propertyTypeDeclarationListener = new
				// PropertyDeclarationListener();
			}
		}
		if (null != ctx.acmeRoleDeclaration()) {
			for (AcmeRoleDeclarationContext acmeRoleDeclarationContext : ctx.acmeRoleDeclaration()) {
				RoleDeclarationListener roleDeclarationListener = new RoleDeclarationListener();
				roleDeclarationListener.enterAcmeRoleDeclaration(acmeRoleDeclarationContext);
			}
		}
		if (null != ctx.acmeRoleTypeDeclaration()) {
			for (AcmeRoleTypeDeclarationContext acmeRoleTypeDeclarationContext : ctx.acmeRoleTypeDeclaration()) {
				RoleTypeDeclarationListener roleTypeDeclarationListener = new RoleTypeDeclarationListener();
				roleTypeDeclarationListener.enterAcmeRoleTypeDeclaration(acmeRoleTypeDeclarationContext);
			}
		}
	}
}
