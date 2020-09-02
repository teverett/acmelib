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
			IdentifierListener identifierListener = new IdentifierListener();
			identifierListener.enterIdentifier(ctx.identifier());
			system.setName(identifierListener.identifier);
		}
		/*
		 * family
		 */
		if (null != ctx.acmeFamilyRef()) {
			for (AcmeFamilyRefContext AcmeFamilyRefContext : ctx.acmeFamilyRef()) {
				FamilyRefListener familyRefListener = new FamilyRefListener();
				familyRefListener.enterAcmeFamilyRef(AcmeFamilyRefContext);
			}
		}
		/*
		 * body
		 */
		if (null != ctx.acmeSystemBody()) {
			SystemBodyListener systemBodyListener = new SystemBodyListener();
			systemBodyListener.enterAcmeSystemBody(ctx.acmeSystemBody());
		}
		/*
		 * instantation re
		 */
		if (null != ctx.acmeFamilyInstantiationRef()) {
			for (AcmeFamilyInstantiationRefContext acmeFamilyInstantiationRefContext : ctx.acmeFamilyInstantiationRef()) {
				FamilyInstantiationRefListener familyInstantiationRefListener = new FamilyInstantiationRefListener();
				familyInstantiationRefListener.enterAcmeFamilyInstantiationRef(acmeFamilyInstantiationRefContext);
			}
		}
	}
}
