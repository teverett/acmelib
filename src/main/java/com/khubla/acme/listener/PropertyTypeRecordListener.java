package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class PropertyTypeRecordListener extends AbstractListener {
	@Override
	public void enterAcmePropertyTypeRecord(AcmePropertyTypeRecordContext ctx) {
		if (null != ctx.acmePropertyRecordFieldDescription()) {
			for (final AcmePropertyRecordFieldDescriptionContext acmePropertyRecordFieldDescriptionContext : ctx.acmePropertyRecordFieldDescription()) {
				final PropertyRecordFieldDescriptionListener propertyRecordFieldDescriptionListener = new PropertyRecordFieldDescriptionListener();
				propertyRecordFieldDescriptionListener.enterAcmePropertyRecordFieldDescription(acmePropertyRecordFieldDescriptionContext);
			}
		}
	}
}
