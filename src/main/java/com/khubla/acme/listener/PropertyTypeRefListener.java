package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class PropertyTypeRefListener extends AbstractListener {
	public PropertyType propertyType;

	@Override
	public void enterAcmePropertyTypeRef(AcmePropertyTypeRefContext ctx) {
		propertyType = new PropertyType();
		if (null != ctx.acmePropertyTypeDeclarationRef()) {
			final PropertyTypeDeclarationRefListener propertyTypeDeclarationRefListener = new PropertyTypeDeclarationRefListener();
			propertyTypeDeclarationRefListener.enterAcmePropertyTypeDeclarationRef(ctx.acmePropertyTypeDeclarationRef());
			propertyType.setName(propertyTypeDeclarationRefListener.names);
		}
		if (null != ctx.acmePropertyTypeStructure()) {
			final PropertyTypeStructureListener propertyTypeStructureListener = new PropertyTypeStructureListener();
			propertyTypeStructureListener.enterAcmePropertyTypeStructure(ctx.acmePropertyTypeStructure());
			propertyType.setName(propertyTypeStructureListener.type);
		}
	}
}
