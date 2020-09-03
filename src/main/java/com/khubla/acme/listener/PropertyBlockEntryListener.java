package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class PropertyBlockEntryListener extends AbstractListener {
	@Override
	public void enterAcmePropertyBlockEntry(AcmePropertyBlockEntryContext ctx) {
		if (null != ctx.acmePropertyTypeRef()) {
			PropertyTypeRefListener propertyTypeRefListener = new PropertyTypeRefListener();
			propertyTypeRefListener.enterAcmePropertyTypeRef(ctx.acmePropertyTypeRef());
		}
		if (null != ctx.acmePropertyValueDeclaration()) {
			PropertyValueDeclarationListener propertyValueDeclarationListener = new PropertyValueDeclarationListener();
			propertyValueDeclarationListener.enterAcmePropertyValueDeclaration(ctx.acmePropertyValueDeclaration());
		}
	}
}
