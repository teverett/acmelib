package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class PropertyValueDeclarationListener extends AbstractListener {
	public String value;

	@Override
	public void enterAcmePropertyValueDeclaration(AcmePropertyValueDeclarationContext ctx) {
		if (ctx.INTEGER_LITERAL() != null) {
			value = ctx.INTEGER_LITERAL().getText();
		} else if (ctx.FLOATING_POINT_LITERAL() != null) {
			value = ctx.FLOATING_POINT_LITERAL().getText();
		} else if (ctx.STRING_LITERAL() != null) {
			value = ctx.STRING_LITERAL().getText();
		} else if (ctx.TRUE() != null) {
			throw new RuntimeException("Not Implemented");
		} else if (ctx.FALSE() != null) {
			throw new RuntimeException("Not Implemented");
		} else if (ctx.acmePropertyRecord() != null) {
			throw new RuntimeException("Not Implemented");
		} else if (ctx.acmePropertySequence() != null) {
			throw new RuntimeException("Not Implemented");
		} else if (ctx.acmePropertySet() != null) {
			throw new RuntimeException("Not Implemented");
		} else if (ctx.enumidentifier() != null) {
			throw new RuntimeException("Not Implemented");
		}
	}
}
