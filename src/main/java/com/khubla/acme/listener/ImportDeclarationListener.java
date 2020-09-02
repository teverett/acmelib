package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class ImportDeclarationListener extends AbstractListener {
	public String name;

	@Override
	public void enterAcmeImportDeclaration(AcmeImportDeclarationContext ctx) {
		if (null != ctx.filename()) {
			final FilenameListener filenameListener = new FilenameListener();
			filenameListener.enterFilename(ctx.filename());
			name = filenameListener.name;
		} else if (null != ctx.stringLiteral()) {
			final StringLiteralListener stringLiteralListener = new StringLiteralListener();
			stringLiteralListener.enterStringLiteral(ctx.stringLiteral());
			name = stringLiteralListener.string;
		}
	}
}
