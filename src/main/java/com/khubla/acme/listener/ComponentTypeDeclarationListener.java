package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class ComponentTypeDeclarationListener extends AbstractListener {
	public ComponentType componentType;

	@Override
	public void enterAcmeComponentTypeDeclaration(AcmeComponentTypeDeclarationContext ctx) {
		/*
		 * name
		 */
		componentType = new ComponentType();
		if (null != ctx.identifier()) {
			final IdentifierListener identifierListener = new IdentifierListener();
			identifierListener.enterIdentifier(ctx.identifier());
			componentType.setName(identifierListener.identifier);
		}
		/*
		 * body
		 */
		if (null != ctx.acmeComponentBody()) {
			final ComponentBodyListener componentBodyListener = new ComponentBodyListener();
			componentBodyListener.enterAcmeComponentBody(ctx.acmeComponentBody());
		}
		/*
		 * ref
		 */
		if (null != ctx.acmeComponentTypeRef()) {
			for (final AcmeComponentTypeRefContext acmeComponentTypeRefContext : ctx.acmeComponentTypeRef()) {
				final ComponentTypeRefListener componentTypeRefListener = new ComponentTypeRefListener();
				componentTypeRefListener.enterAcmeComponentTypeRef(acmeComponentTypeRefContext);
			}
		}
	}
}
