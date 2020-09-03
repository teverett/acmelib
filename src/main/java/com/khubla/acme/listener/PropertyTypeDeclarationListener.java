package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class PropertyTypeDeclarationListener extends AbstractListener {
	public PropertyType propertyType;

	@Override
	public void enterAcmePropertyTypeDeclaration(AcmePropertyTypeDeclarationContext ctx) {
		propertyType = new PropertyType();
		/*
		 * id
		 */
		if (null != ctx.identifier()) {
			final IdentifierListener identifierListener = new IdentifierListener();
			identifierListener.enterIdentifier(ctx.identifier());
			propertyType.setName(identifierListener.identifier);
		}
		if (null != ctx.acmePropertyTypeAny()) {
			final PropertyTypeAnyListener propertyTypeAnyListener = new PropertyTypeAnyListener();
			propertyTypeAnyListener.enterAcmePropertyTypeAny(ctx.acmePropertyTypeAny());
		}
		if (null != ctx.acmePropertyTypeBoolean()) {
			final PropertyTypeBooleanListener propertyTypeBooleanListener = new PropertyTypeBooleanListener();
			propertyTypeBooleanListener.enterAcmePropertyTypeBoolean(ctx.acmePropertyTypeBoolean());
		}
		if (null != ctx.acmePropertyTypeInt()) {
			final PropertyTypeIntListener propertyTypeIntListener = new PropertyTypeIntListener();
			propertyTypeIntListener.enterAcmePropertyTypeInt(ctx.acmePropertyTypeInt());
		}
		if (null != ctx.acmePropertyTypeDouble()) {
			final PropertyTypeDoubleListener propertyTypeDoubleListener = new PropertyTypeDoubleListener();
			propertyTypeDoubleListener.enterAcmePropertyTypeEnum(ctx.acmePropertyTypeEnum());
		}
		if (null != ctx.acmePropertyTypeFloat()) {
			final PropertyTypeFloatListener propertyTypeFloatListener = new PropertyTypeFloatListener();
			propertyTypeFloatListener.enterAcmePropertyTypeFloat(ctx.acmePropertyTypeFloat());
		}
		if (null != ctx.acmePropertyTypeString()) {
			final PropertyTypeStringListener propertyTypeStringListener = new PropertyTypeStringListener();
			propertyTypeStringListener.enterAcmePropertyTypeString(ctx.acmePropertyTypeString());
		}
		if (null != ctx.acmePropertyTypeRecord()) {
			final PropertyTypeRecordListener propertyTypeRecordListener = new PropertyTypeRecordListener();
			propertyTypeRecordListener.enterAcmePropertyTypeRecord(ctx.acmePropertyTypeRecord());
		}
		if (null != ctx.acmePropertyTypeSet()) {
			final PropertyTypeSetListener propertyTypeSetListener = new PropertyTypeSetListener();
			propertyTypeSetListener.enterAcmePropertyTypeSet(ctx.acmePropertyTypeSet());
		}
		if (null != ctx.acmePropertyTypeSequence()) {
			final PropertyTypeSequenceListener propertyTypeSequenceListener = new PropertyTypeSequenceListener();
			propertyTypeSequenceListener.enterAcmePropertyTypeSequence(ctx.acmePropertyTypeSequence());
		}
		if (null != ctx.acmePropertyTypeEnum()) {
			final PropertyTypeEnumListener propertyTypeEnumListener = new PropertyTypeEnumListener();
			propertyTypeEnumListener.enterAcmePropertyTypeEnum(ctx.acmePropertyTypeEnum());
		}
	}
}
