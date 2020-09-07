package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class PropertyBlockEntryListener extends AbstractListener {
	public Property property;

	@Override
	public void enterAcmePropertyBlockEntry(AcmePropertyBlockEntryContext ctx) {
		property = new Property();
		if (null != ctx.identifier()) {
			final IdentifierListener identifierListener = new IdentifierListener();
			identifierListener.enterIdentifier(ctx.identifier());
			property.setName(identifierListener.identifier);
		}
		if (null != ctx.acmePropertyTypeRef()) {
			final PropertyTypeRefListener propertyTypeRefListener = new PropertyTypeRefListener();
			propertyTypeRefListener.enterAcmePropertyTypeRef(ctx.acmePropertyTypeRef());
			property.setPropertyType(propertyTypeRefListener.propertyType);
		}
		if (null != ctx.acmePropertyValueDeclaration()) {
			final PropertyValueDeclarationListener propertyValueDeclarationListener = new PropertyValueDeclarationListener();
			propertyValueDeclarationListener.enterAcmePropertyValueDeclaration(ctx.acmePropertyValueDeclaration());
			property.setValue(propertyValueDeclarationListener.value);
		}
	}
}
