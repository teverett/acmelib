package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class FamilyInstantiationRefListener extends AbstractListener {
	public String name;

	@Override
	public void enterAcmeFamilyInstantiationRef(AcmeFamilyInstantiationRefContext ctx) {
		if (null != ctx.identifier()) {
			final IdentifierListener identifierListener = new IdentifierListener();
			identifierListener.enterIdentifier(ctx.identifier());
			name = identifierListener.identifier;
		}
	}
}
