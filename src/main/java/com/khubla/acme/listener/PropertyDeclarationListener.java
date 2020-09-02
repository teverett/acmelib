package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class PropertyDeclarationListener extends AbstractListener {
	public Property property;

	@Override
	public void enterAcmePropertyDeclaration(AcmePropertyDeclarationContext ctx) {
		/*
		 * id
		 */
		if (null != ctx.identifier()) {
			final IdentifierListener identifierListener = new IdentifierListener();
			identifierListener.enterIdentifier(ctx.identifier());
		}
		/*
		 * type
		 */
		if (null != ctx.acmePropertyTypeRef()) {
			final PropertyTypeRefListener propertyTypeRefListener = new PropertyTypeRefListener();
			propertyTypeRefListener.enterAcmePropertyTypeRef(ctx.acmePropertyTypeRef());
		}
		/*
		 * value
		 */
		if (null != ctx.acmePropertyValueDeclaration()) {
			final PropertyValueDeclarationListener propertyValueDeclarationListener = new PropertyValueDeclarationListener();
			propertyValueDeclarationListener.enterAcmePropertyValueDeclaration(ctx.acmePropertyValueDeclaration());
		}
		/*
		 * block
		 */
		if (null != ctx.acmePropertyBlock()) {
			final PropertyBlockListener propertyBlockListener = new PropertyBlockListener();
			propertyBlockListener.enterAcmePropertyBlock(ctx.acmePropertyBlock());
		}
	}
}
