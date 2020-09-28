package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.propertytype.*;

public class PropertyTypeDeclarationListener extends AbstractListener {
	public PropertyType propertyType;

	@Override
	public void enterAcmePropertyTypeDeclaration(AcmePropertyTypeDeclarationContext ctx) {
		String name;
		/*
		 * id
		 */
		if (null != ctx.identifier()) {
			final IdentifierListener identifierListener = new IdentifierListener();
			identifierListener.enterIdentifier(ctx.identifier());
			name = identifierListener.identifier;
		}
		if (null != ctx.acmePropertyTypeAny()) {
			final PropertyTypeAnyListener propertyTypeAnyListener = new PropertyTypeAnyListener();
			propertyTypeAnyListener.enterAcmePropertyTypeAny(ctx.acmePropertyTypeAny());
			propertyType = new AnyPropertyType();
		}
		if (null != ctx.acmePropertyTypeBoolean()) {
			final PropertyTypeBooleanListener propertyTypeBooleanListener = new PropertyTypeBooleanListener();
			propertyTypeBooleanListener.enterAcmePropertyTypeBoolean(ctx.acmePropertyTypeBoolean());
			propertyType = new BooleanPropertyType();
		}
		if (null != ctx.acmePropertyTypeInt()) {
			final PropertyTypeIntListener propertyTypeIntListener = new PropertyTypeIntListener();
			propertyTypeIntListener.enterAcmePropertyTypeInt(ctx.acmePropertyTypeInt());
			propertyType = new IntegerPropertyType();
		}
		if (null != ctx.acmePropertyTypeDouble()) {
			final PropertyTypeDoubleListener propertyTypeDoubleListener = new PropertyTypeDoubleListener();
			propertyTypeDoubleListener.enterAcmePropertyTypeEnum(ctx.acmePropertyTypeEnum());
			propertyType = new DoublePropertyType();
		}
		if (null != ctx.acmePropertyTypeFloat()) {
			final PropertyTypeFloatListener propertyTypeFloatListener = new PropertyTypeFloatListener();
			propertyTypeFloatListener.enterAcmePropertyTypeFloat(ctx.acmePropertyTypeFloat());
			propertyType = new FloatPropertyType();
		}
		if (null != ctx.acmePropertyTypeString()) {
			final PropertyTypeStringListener propertyTypeStringListener = new PropertyTypeStringListener();
			propertyTypeStringListener.enterAcmePropertyTypeString(ctx.acmePropertyTypeString());
			propertyType = new StringPropertyType();
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
