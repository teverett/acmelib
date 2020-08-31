package com.khubla.acme.listener;

import com.khubla.acme.*;
import com.khubla.acme.domain.*;

public class TypeDeclarationListener extends AbstractListener {
	public Type type;

	@Override
	public void enterTypeDeclaration(acmeParser.TypeDeclarationContext ctx) {
		if (null != ctx.elementTypeDeclaration()) {
			final ElementTypeDeclarationListener elementTypeDeclarationListener = new ElementTypeDeclarationListener();
			elementTypeDeclarationListener.enterElementTypeDeclaration(ctx.elementTypeDeclaration());
			type = elementTypeDeclarationListener.type;
		}
		if (null != ctx.propertyTypeDeclaration()) {
			final PropertyTypeDescriptionListener propertyTypeDescriptionListener = new PropertyTypeDescriptionListener();
			propertyTypeDescriptionListener.enterPropertyTypeDeclaration(ctx.propertyTypeDeclaration());
		}
	}
}
