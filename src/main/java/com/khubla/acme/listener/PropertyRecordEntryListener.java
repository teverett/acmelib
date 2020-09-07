package com.khubla.acme.listener;

import com.khubla.acme.*;

public class PropertyRecordEntryListener extends AbstractListener {
	@Override
	public void enterAcmePropertyRecordEntry(acmeParser.AcmePropertyRecordEntryContext ctx) {
		/*
		 * id
		 */
		if (null != ctx.identifier()) {
			final IdentifierListener identifierListener = new IdentifierListener();
			identifierListener.enterIdentifier(ctx.identifier());
			throw new RuntimeException("Not Implemented");
		}
		/*
		 * ref
		 */
		if (null != ctx.acmePropertyTypeRef()) {
			final PropertyTypeRefListener propertyTypeRefListener = new PropertyTypeRefListener();
			propertyTypeRefListener.enterAcmePropertyTypeRef(ctx.acmePropertyTypeRef());
			throw new RuntimeException("Not Implemented");
		}
		/*
		 * val
		 */
		if (null != ctx.acmePropertyValueDeclaration()) {
			final PropertyValueDeclarationListener propertyValueDeclarationListener = new PropertyValueDeclarationListener();
			propertyValueDeclarationListener.enterAcmePropertyValueDeclaration(ctx.acmePropertyValueDeclaration());
			throw new RuntimeException("Not Implemented");
		}
	}
}
