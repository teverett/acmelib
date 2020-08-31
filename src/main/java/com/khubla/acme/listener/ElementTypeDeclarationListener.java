package com.khubla.acme.listener;

import com.khubla.acme.*;
import com.khubla.acme.domain.*;

public class ElementTypeDeclarationListener extends AbstractListener {
	public Type type;

	@Override
	public void enterElementTypeDeclaration(acmeParser.ElementTypeDeclarationContext ctx) {
		if (null != ctx.elementProtoTypeDeclaration()) {
			final ElementProtoTypeDeclarationListener elementProtoTypeDeclarationListener = new ElementProtoTypeDeclarationListener();
			elementProtoTypeDeclarationListener.enterElementProtoTypeDeclaration(ctx.elementProtoTypeDeclaration());
			type = elementProtoTypeDeclarationListener.type;
		} else if (null != ctx.componentTypeDeclaration()) {
			final ComponentTypeDeclarationListener componentTypeDeclarationListener = new ComponentTypeDeclarationListener();
			componentTypeDeclarationListener.enterComponentTypeDeclaration(ctx.componentTypeDeclaration());
			type = componentTypeDeclarationListener.type;
		} else if (null != ctx.groupTypeDeclaration()) {
			final GroupTypeDeclarationListener groupTypeDeclarationListener = new GroupTypeDeclarationListener();
			groupTypeDeclarationListener.enterGroupTypeDeclaration(ctx.groupTypeDeclaration());
			type = groupTypeDeclarationListener.type;
		} else if (null != ctx.connectorTypeDeclaration()) {
			final ConnectorTypeDeclarationListener connectorTypeDeclarationListener = new ConnectorTypeDeclarationListener();
			connectorTypeDeclarationListener.enterConnectorTypeDeclaration(ctx.connectorTypeDeclaration());
			type = connectorTypeDeclarationListener.type;
		} else if (null != ctx.portTypeDeclaration()) {
			final PortTypeDeclarationListener portTypeDeclarationListener = new PortTypeDeclarationListener();
			portTypeDeclarationListener.enterPortTypeDeclaration(ctx.portTypeDeclaration());
			type = portTypeDeclarationListener.type;
		} else if (null != ctx.roleTypeDeclaration()) {
			final RoleTypeDeclarationListener roleTypeDeclarationListener = new RoleTypeDeclarationListener();
			roleTypeDeclarationListener.enterRoleTypeDeclaration(ctx.roleTypeDeclaration());
			type = roleTypeDeclarationListener.type;
		}
	}
}
