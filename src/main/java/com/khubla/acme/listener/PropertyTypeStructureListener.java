package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class PropertyTypeStructureListener extends AbstractListener {
	public String type;

	@Override
	public void enterAcmePropertyTypeStructure(AcmePropertyTypeStructureContext ctx) {
		if (null != ctx.acmePropertyTypeAny()) {
			final PropertyTypeAnyListener propertyTypeAnyListener = new PropertyTypeAnyListener();
			propertyTypeAnyListener.enterAcmePropertyTypeAny(ctx.acmePropertyTypeAny());
			type = propertyTypeAnyListener.type;
		}
		if (null != ctx.acmePropertyTypeBoolean()) {
			final PropertyTypeBooleanListener propertyTypeBooleanListener = new PropertyTypeBooleanListener();
			propertyTypeBooleanListener.enterAcmePropertyTypeBoolean(ctx.acmePropertyTypeBoolean());
			type = propertyTypeBooleanListener.type;
		}
		if (null != ctx.acmePropertyTypeInt()) {
			final PropertyTypeIntListener propertyTypeIntListener = new PropertyTypeIntListener();
			propertyTypeIntListener.enterAcmePropertyTypeInt(ctx.acmePropertyTypeInt());
			type = propertyTypeIntListener.type;
		}
		if (null != ctx.acmePropertyTypeDouble()) {
			final PropertyTypeDoubleListener propertyTypeDoubleListener = new PropertyTypeDoubleListener();
			propertyTypeDoubleListener.enterAcmePropertyTypeEnum(ctx.acmePropertyTypeEnum());
			type = propertyTypeDoubleListener.type;
		}
		if (null != ctx.acmePropertyTypeFloat()) {
			final PropertyTypeFloatListener propertyTypeFloatListener = new PropertyTypeFloatListener();
			propertyTypeFloatListener.enterAcmePropertyTypeFloat(ctx.acmePropertyTypeFloat());
			type = propertyTypeFloatListener.type;
		}
		if (null != ctx.acmePropertyTypeString()) {
			final PropertyTypeStringListener propertyTypeStringListener = new PropertyTypeStringListener();
			propertyTypeStringListener.enterAcmePropertyTypeString(ctx.acmePropertyTypeString());
			type = propertyTypeStringListener.type;
		}
		if (null != ctx.acmePropertyTypeRecord()) {
			final PropertyTypeRecordListener propertyTypeRecordListener = new PropertyTypeRecordListener();
			propertyTypeRecordListener.enterAcmePropertyTypeRecord(ctx.acmePropertyTypeRecord());
			throw new RuntimeException("Not Implemented");
		}
		if (null != ctx.acmePropertyTypeSet()) {
			final PropertyTypeSetListener propertyTypeSetListener = new PropertyTypeSetListener();
			propertyTypeSetListener.enterAcmePropertyTypeSet(ctx.acmePropertyTypeSet());
			throw new RuntimeException("Not Implemented");
		}
		if (null != ctx.acmePropertyTypeSequence()) {
			final PropertyTypeSequenceListener propertyTypeSequenceListener = new PropertyTypeSequenceListener();
			propertyTypeSequenceListener.enterAcmePropertyTypeSequence(ctx.acmePropertyTypeSequence());
			throw new RuntimeException("Not Implemented");
		}
		if (null != ctx.acmePropertyTypeEnum()) {
			final PropertyTypeEnumListener propertyTypeEnumListener = new PropertyTypeEnumListener();
			propertyTypeEnumListener.enterAcmePropertyTypeEnum(ctx.acmePropertyTypeEnum());
			throw new RuntimeException("Not Implemented");
		}
	}
}
