package com.khubla.acme.listener;

import com.khubla.acme.*;

public class PropertyValueDeclarationListener extends AbstractListener {
	public String value;

	@Override
	public void enterPropertyValueDeclaration(acmeParser.PropertyValueDeclarationContext ctx) {
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
		} else if (ctx.IDENTIFIER() != null) {
			value = ctx.IDENTIFIER().getText();
		} else if (ctx.acmeSetValue() != null) {
			throw new RuntimeException("Not Implemented");
		} else if (ctx.acmeRecordValue() != null) {
			throw new RuntimeException("Not Implemented");
		} else if (ctx.acmeSequenceValue() != null) {
			throw new RuntimeException("Not Implemented");
		}
	}
}
