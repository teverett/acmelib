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
			this.value = Boolean.FALSE;
		} else if (ctx.TRUE() != null) {
			this.value = Boolean.TRUE;
		} else if (ctx.acmePropertyRecord() != null) {
			throw new RuntimeException("Not Implemented");
		} else if (ctx.acmePropertySequence() != null) {
			throw new RuntimeException("Not Implemented");
		} else if (ctx.acmePropertySet() != null) {
			throw new RuntimeException("Not Implemented");
		} else if (ctx.enumidentifier() != null) {
			throw new RuntimeException("Not Implemented");
		} else {
			throw new RuntimeException("Unknown Value Type: " + ctx.getText());
		}
	}
}
