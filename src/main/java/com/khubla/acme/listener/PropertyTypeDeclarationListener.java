package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class PropertyTypeDeclarationListener extends AbstractListener {
	public PropertyType propertyType;

	@Override
	public void enterAcmePropertyTypeDeclaration(AcmePropertyTypeDeclarationContext ctx) {
		throw new RuntimeException(":(");
	}
}
