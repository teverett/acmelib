package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class ComponentDeclarationListener extends AbstractListener {
	public Component component;

	@Override
	public void enterAcmeComponentDeclaration(AcmeComponentDeclarationContext ctx) {
		component = new Component();
		/*
		 * name
		 */
		if (null != ctx.identifier()) {
			final IdentifierListener identifierListener = new IdentifierListener();
			identifierListener.enterIdentifier(ctx.identifier());
			component.setName(identifierListener.identifier);
		}
		/*
		 * type ref
		 */
		if (null != ctx.acmeComponentTypeRef()) {
			for (final AcmeComponentTypeRefContext acmeComponentTypeRefContext : ctx.acmeComponentTypeRef()) {
				final ComponentTypeRefListener componentTypeRefListener = new ComponentTypeRefListener();
				componentTypeRefListener.enterAcmeComponentTypeRef(acmeComponentTypeRefContext);
			}
		}
		/*
		 * body
		 */
		if (null != ctx.acmeComponentBody()) {
			final ComponentBodyListener componentBodyListener = new ComponentBodyListener(component);
			componentBodyListener.enterAcmeComponentBody(ctx.acmeComponentBody());
		}
		/*
		 * instantiated ref
		 */
		if (null != ctx.acmeComponentInstantiatedTypeRef()) {
			for (final AcmeComponentInstantiatedTypeRefContext acmeComponentInstantiatedTypeRefContext : ctx.acmeComponentInstantiatedTypeRef()) {
				final ComponentInstantiatedTypeRefListener componentInstantiatedTypeRefListener = new ComponentInstantiatedTypeRefListener();
				componentInstantiatedTypeRefListener.enterAcmeComponentInstantiatedTypeRef(acmeComponentInstantiatedTypeRefContext);
			}
		}
	}
}
