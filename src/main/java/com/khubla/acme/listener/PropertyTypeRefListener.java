package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.propertytype.*;

public class PropertyTypeRefListener extends AbstractListener {
	public PropertyType propertyType;

	@Override
	public void enterAcmePropertyTypeRef(AcmePropertyTypeRefContext ctx) {
		if (null != ctx.acmePropertyTypeDeclarationRef()) {
			final PropertyTypeDeclarationRefListener propertyTypeDeclarationRefListener = new PropertyTypeDeclarationRefListener();
			propertyTypeDeclarationRefListener.enterAcmePropertyTypeDeclarationRef(ctx.acmePropertyTypeDeclarationRef());
			propertyType = PropertyTypes.getInstance().getType(AbstractPropertyType.buildName(propertyTypeDeclarationRefListener.names));
		}
		if (null != ctx.acmePropertyTypeStructure()) {
			final PropertyTypeStructureListener propertyTypeStructureListener = new PropertyTypeStructureListener();
			propertyTypeStructureListener.enterAcmePropertyTypeStructure(ctx.acmePropertyTypeStructure());
			propertyType = PropertyTypes.getInstance().getType(propertyTypeStructureListener.type);
		}
	}
}
