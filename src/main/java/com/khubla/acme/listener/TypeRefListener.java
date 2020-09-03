package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class TypeRefListener extends AbstractListener {
	public String type;

	@Override
	public void enterAcmeTypeRef(AcmeTypeRefContext ctx) {
		if (null != ctx.reference()) {
			final ReferenceListener referenceListener = new ReferenceListener();
			referenceListener.enterReference(ctx.reference());
		} else if (null != ctx.acmePropertyTypeStructure()) {
			final PropertyTypeStructureListener propertyTypeStructureListener = new PropertyTypeStructureListener();
			propertyTypeStructureListener.enterAcmePropertyTypeStructure(ctx.acmePropertyTypeStructure());
		} else {
			type = ctx.getText();
			// throw new RuntimeException("Not Implemented");
		}
	}
}
