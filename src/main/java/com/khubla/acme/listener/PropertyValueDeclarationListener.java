package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class PropertyValueDeclarationListener extends AbstractListener {
	public Object value;

	@Override
	public void enterAcmePropertyValueDeclaration(AcmePropertyValueDeclarationContext ctx) {
		if (ctx.INTEGER_LITERAL() != null) {
			value = Integer.parseInt(ctx.INTEGER_LITERAL().getText());
		} else if (ctx.FLOATING_POINT_LITERAL() != null) {
			value = Double.parseDouble(ctx.FLOATING_POINT_LITERAL().getText());
		} else if (ctx.STRING_LITERAL() != null) {
			value = ctx.STRING_LITERAL().getText();
		} else if (ctx.FALSE() != null) {
			value = Boolean.FALSE;
		} else if (ctx.TRUE() != null) {
			value = Boolean.TRUE;
		} else if (ctx.acmePropertyRecord() != null) {
			final PropertyRecordListener propertyRecordListener = new PropertyRecordListener();
			propertyRecordListener.enterAcmePropertyRecord(ctx.acmePropertyRecord());
		} else if (ctx.acmePropertySequence() != null) {
			throw new RuntimeException("Not Implemented");
		} else if (ctx.acmePropertySet() != null) {
			final PropertySetListener propertySetListener = new PropertySetListener();
			propertySetListener.enterAcmePropertySet(ctx.acmePropertySet());
		} else if (ctx.enumidentifier() != null) {
			final EnumidentifierListener enumidentifierListener = new EnumidentifierListener();
			enumidentifierListener.enterEnumidentifier(ctx.enumidentifier());
		} else {
			throw new RuntimeException("Unknown Value Type: " + ctx.getText());
		}
	}
}
