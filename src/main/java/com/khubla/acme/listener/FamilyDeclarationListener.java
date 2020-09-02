package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class FamilyDeclarationListener extends AbstractListener {
	public Family family;

	@Override
	public void enterAcmeFamilyDeclaration(AcmeFamilyDeclarationContext ctx) {
		family = new Family();
		/*
		 * name
		 */
		if (null != ctx.identifier()) {
			final IdentifierListener identifierListener = new IdentifierListener();
			identifierListener.enterIdentifier(ctx.identifier());
			family.setName(identifierListener.identifier);
		}
		/*
		 * body
		 */
		if (null != ctx.acmeFamilyBody()) {
			final FamilyBodyListener familyBodyListener = new FamilyBodyListener();
			familyBodyListener.enterAcmeFamilyBody(ctx.acmeFamilyBody());
		}
		/*
		 * ref
		 */
		if (null != ctx.acmeFamilyRef()) {
			for (final AcmeFamilyRefContext acmeFamilyRefContext : ctx.acmeFamilyRef()) {
				final FamilyRefListener familyRefListener = new FamilyRefListener();
				familyRefListener.enterAcmeFamilyRef(acmeFamilyRefContext);
			}
		}
	}
}
