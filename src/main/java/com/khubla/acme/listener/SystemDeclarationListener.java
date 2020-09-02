package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.System;;

public class SystemDeclarationListener extends AbstractListener {
	public System system;

	@Override
	public void enterAcmeSystemDeclaration(AcmeSystemDeclarationContext ctx) {
		system = new System();
		/*
		 * name
		 */
		if (null != ctx.identifier()) {
			final IdentifierListener identifierListener = new IdentifierListener();
			identifierListener.enterIdentifier(ctx.identifier());
			system.setName(identifierListener.identifier);
		}
		/*
		 * family
		 */
		if (null != ctx.acmeFamilyRef()) {
			for (final AcmeFamilyRefContext AcmeFamilyRefContext : ctx.acmeFamilyRef()) {
				final FamilyRefListener familyRefListener = new FamilyRefListener();
				familyRefListener.enterAcmeFamilyRef(AcmeFamilyRefContext);
			}
		}
		/*
		 * body
		 */
		if (null != ctx.acmeSystemBody()) {
			final SystemBodyListener systemBodyListener = new SystemBodyListener();
			systemBodyListener.enterAcmeSystemBody(ctx.acmeSystemBody());
		}
		/*
		 * instantation re
		 */
		if (null != ctx.acmeFamilyInstantiationRef()) {
			for (final AcmeFamilyInstantiationRefContext acmeFamilyInstantiationRefContext : ctx.acmeFamilyInstantiationRef()) {
				final FamilyInstantiationRefListener familyInstantiationRefListener = new FamilyInstantiationRefListener();
				familyInstantiationRefListener.enterAcmeFamilyInstantiationRef(acmeFamilyInstantiationRefContext);
			}
		}
	}
}
