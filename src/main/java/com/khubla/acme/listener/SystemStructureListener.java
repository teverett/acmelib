package com.khubla.acme.listener;

import com.khubla.acme.*;
import com.khubla.acme.domain.System;;

public class SystemStructureListener extends AbstractListener {
	private final System system;

	public SystemStructureListener(System system) {
		super();
		this.system = system;
	}

	@Override
	public void enterSystemStructure(acmeParser.SystemStructureContext ctx) {
		/*
		 * component declaration
		 */
		if (null != ctx.componentDeclaration()) {
			final ComponentDeclarationListener componentDeclarationListener = new ComponentDeclarationListener();
			componentDeclarationListener.enterComponentDeclaration(ctx.componentDeclaration());
			system.getComponents().put(componentDeclarationListener.component.getName(), componentDeclarationListener.component);
		}
		/*
		 * component block
		 */
		if (null != ctx.componentsBlock()) {
			final ComponentsBlockListener componentsBlockListener = new ComponentsBlockListener();
			componentsBlockListener.enterComponentsBlock(ctx.componentsBlock());
		}
		/*
		 * group
		 */
		if (null != ctx.groupDeclaration()) {
			final GroupDeclarationListener groupDeclarationListener = new GroupDeclarationListener();
			groupDeclarationListener.enterGroupDeclaration(ctx.groupDeclaration());
		}
		/*
		 * connector declaration
		 */
		if (null != ctx.connectorDeclaration()) {
			final ConnectorDeclarationListener connectorDeclarationListener = new ConnectorDeclarationListener();
			connectorDeclarationListener.enterConnectorDeclaration(ctx.connectorDeclaration());
		}
		/*
		 * connectors block
		 */
		if (null != ctx.connectorsBlock()) {
			final ConnectorsBlockListner connectorsBlockListner = new ConnectorsBlockListner();
			connectorsBlockListner.enterConnectorsBlock(ctx.connectorsBlock());
		}
		/*
		 * ports declaration
		 */
		if (null != ctx.portDeclaration()) {
			final PortDeclarationListener portDeclarationListener = new PortDeclarationListener();
			portDeclarationListener.enterPortDeclaration(ctx.portDeclaration());
		}
		/*
		 * ports block
		 */
		if (null != ctx.portsBlock()) {
			final PortsBlockListener portsBlockListener = new PortsBlockListener();
			portsBlockListener.enterPortsBlock(ctx.portsBlock());
		}
		/*
		 * role decl
		 */
		if (null != ctx.roleDeclaration()) {
			final RoleDeclarationListener roleDeclarationListener = new RoleDeclarationListener();
			roleDeclarationListener.enterRoleDeclaration(ctx.roleDeclaration());
		}
		/*
		 * block1
		 */
		if (null != ctx.rolesBlock1()) {
			final RolesBlock1Listener rolesBlock1Listener = new RolesBlock1Listener();
			rolesBlock1Listener.enterRolesBlock1(ctx.rolesBlock1());
		}
		/*
		 * block2
		 */
		if (null != ctx.rolesBlock2()) {
			final RolesBlock2Listener rolesBlock2Listener = new RolesBlock2Listener();
			rolesBlock2Listener.enterRolesBlock2(ctx.rolesBlock2());
		}
		/*
		 * attachments
		 */
		if (null != ctx.attachmentsDeclaration()) {
			final AttachmentsDeclarationListener attachmentsDeclarationListener = new AttachmentsDeclarationListener();
			attachmentsDeclarationListener.enterAttachmentsDeclaration(ctx.attachmentsDeclaration());
		}
		/*
		 * rep
		 */
		if (null != ctx.representationDeclaration()) {
			final RepresentationDeclarationListener representationDeclarationListener = new RepresentationDeclarationListener();
			representationDeclarationListener.enterRepresentationDeclaration(ctx.representationDeclaration());
		}
		/*
		 * analysis
		 */
		if (null != ctx.designAnalysisDeclaration()) {
			final DesignAnalysisDeclarationListener designAnalysisDeclarationListener = new DesignAnalysisDeclarationListener();
			designAnalysisDeclarationListener.enterDesignAnalysisDeclaration(ctx.designAnalysisDeclaration());
		}
		/*
		 * rule
		 */
		if (null != ctx.parse_DesignRule()) {
			final Parse_DesignRuleListener parse_DesignRuleListener = new Parse_DesignRuleListener();
			parse_DesignRuleListener.enterParse_DesignRule(ctx.parse_DesignRule());
		}
		throw new RuntimeException("Not Implemented");
	}
}
