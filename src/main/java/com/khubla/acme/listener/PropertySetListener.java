package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class PropertySetListener extends AbstractListener {
	@Override
	public void enterAcmePropertySet(AcmePropertySetContext ctx) {
		if (null != ctx.acmePropertyValueDeclaration()) {
			for (final AcmePropertyValueDeclarationContext acmePropertyValueDeclarationContext : ctx.acmePropertyValueDeclaration()) {
				final PropertyValueDeclarationListener propertyValueDeclarationListener = new PropertyValueDeclarationListener();
				propertyValueDeclarationListener.enterAcmePropertyValueDeclaration(acmePropertyValueDeclarationContext);
			}
		}
	}
}
