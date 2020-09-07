package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class PropertyRecordFieldDescriptionListener extends AbstractListener {
	public String name;

	@Override
	public void enterAcmePropertyRecordFieldDescription(AcmePropertyRecordFieldDescriptionContext ctx) {
		/*
		 * id
		 */
		if (null != ctx.identifier()) {
			final IdentifierListener identifierListener = new IdentifierListener();
			identifierListener.enterIdentifier(ctx.identifier());
			name = identifierListener.identifier;
		}
		/*
		 * ref
		 */
		if (null != ctx.acmePropertyTypeRef()) {
			final PropertyTypeRefListener propertyTypeRefListener = new PropertyTypeRefListener();
			propertyTypeRefListener.exitAcmePropertyTypeRef(ctx.acmePropertyTypeRef());
			throw new RuntimeException("Not Implemented");
		}
	}
}
