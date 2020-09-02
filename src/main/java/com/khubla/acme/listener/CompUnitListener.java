package com.khubla.acme.listener;

import java.util.*;

import com.khubla.acme.acmeParser.*;

public class CompUnitListener extends AbstractListener {
	@Override
	public void enterAcmeCompUnit(AcmeCompUnitContext ctx) {
		/*
		 * imports
		 */
		final List<String> imports = new ArrayList<String>();
		if (null != ctx.acmeImportDeclaration()) {
			for (final AcmeImportDeclarationContext acmeImportDeclarationContext : ctx.acmeImportDeclaration()) {
				final ImportDeclarationListener importDeclarationListener = new ImportDeclarationListener();
				importDeclarationListener.enterAcmeImportDeclaration(acmeImportDeclarationContext);
				imports.add(importDeclarationListener.name);
			}
		}
		if (null != ctx.acmeSystemDeclaration()) {
			for (final AcmeSystemDeclarationContext acmeSystemDeclarationContext : ctx.acmeSystemDeclaration()) {
				final SystemDeclarationListener systemDeclarationListener = new SystemDeclarationListener();
				systemDeclarationListener.enterAcmeSystemDeclaration(acmeSystemDeclarationContext);
			}
		} else if (null != ctx.acmeFamilyDeclaration()) {
			for (final AcmeFamilyDeclarationContext acmeFamilyDeclarationContext : ctx.acmeFamilyDeclaration()) {
				final FamilyDeclarationListener familyDeclarationListener = new FamilyDeclarationListener();
				familyDeclarationListener.enterAcmeFamilyDeclaration(acmeFamilyDeclarationContext);
			}
		} else if (null != ctx.acmeDesignDeclaration()) {
			for (final AcmeDesignDeclarationContext acmeDesignDeclarationContext : ctx.acmeDesignDeclaration()) {
				final DesignDeclarationListener designDeclarationListener = new DesignDeclarationListener();
				designDeclarationListener.enterAcmeDesignDeclaration(acmeDesignDeclarationContext);
			}
		}
	}
}
