package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class PropertyTypeRefListener extends AbstractListener {
	@Override
	public void enterAcmePropertyTypeRef(AcmePropertyTypeRefContext ctx) {
		if (null != ctx.acmePropertyTypeDeclarationRef()) {
			PropertyTypeDeclarationRefListener propertyTypeDeclarationRefListener = new PropertyTypeDeclarationRefListener();
			propertyTypeDeclarationRefListener.enterAcmePropertyTypeDeclarationRef(ctx.acmePropertyTypeDeclarationRef());
		}
		if (null != ctx.acmePropertyTypeStructure()) {
			PropertyTypeStructureListener propertyTypeStructureListener = new PropertyTypeStructureListener();
			propertyTypeStructureListener.enterAcmePropertyTypeStructure(ctx.acmePropertyTypeStructure());
		}
	}
}
