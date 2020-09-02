package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class ImportDeclarationListener extends AbstractListener {
	public String name;

	@Override
	public void enterAcmeImportDeclaration(AcmeImportDeclarationContext ctx) {
		if (null != ctx.filename()) {
			FilenameListener filenameListener = new FilenameListener();
			filenameListener.enterFilename(ctx.filename());
			this.name = filenameListener.name;
		} else if (null != ctx.stringLiteral()) {
			StringLiteralListener stringLiteralListener = new StringLiteralListener();
			stringLiteralListener.enterStringLiteral(ctx.stringLiteral());
			this.name = stringLiteralListener.string;
		}
	}
}
