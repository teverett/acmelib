package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class ComponentTypeDeclarationListener extends AbstractListener {
	public Type type;

	@Override
	public void enterAcmeComponentTypeDeclaration(AcmeComponentTypeDeclarationContext ctx) {
		/*
		 * name
		 */
		type = new Type();
		if (null != ctx.identifier()) {
			final IdentifierListener identifierListener = new IdentifierListener();
			identifierListener.enterIdentifier(ctx.identifier());
			type.setName(identifierListener.identifier);
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
