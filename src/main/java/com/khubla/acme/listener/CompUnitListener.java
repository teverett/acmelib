package com.khubla.acme.listener;

import java.util.*;

import com.khubla.acme.acmeParser.*;

public class CompUnitListener extends AbstractListener {
	@Override
	public void enterAcmeCompUnit(AcmeCompUnitContext ctx) {
		/*
		 * imports
		 */
		List<String> imports = new ArrayList<String>();
		if (null != ctx.acmeImportDeclaration()) {
			for (AcmeImportDeclarationContext acmeImportDeclarationContext : ctx.acmeImportDeclaration()) {
				ImportDeclarationListener importDeclarationListener = new ImportDeclarationListener();
				importDeclarationListener.enterAcmeImportDeclaration(acmeImportDeclarationContext);
				imports.add(importDeclarationListener.name);
			}
		}
		if (null != ctx.acmeSystemDeclaration()) {
			for (AcmeSystemDeclarationContext acmeSystemDeclarationContext : ctx.acmeSystemDeclaration()) {
				SystemDeclarationListener systemDeclarationListener = new SystemDeclarationListener();
				systemDeclarationListener.enterAcmeSystemDeclaration(acmeSystemDeclarationContext);
			}
		} else if (null != ctx.acmeFamilyDeclaration()) {
			for (AcmeFamilyDeclarationContext acmeFamilyDeclarationContext : ctx.acmeFamilyDeclaration()) {
				FamilyDeclarationListener familyDeclarationListener = new FamilyDeclarationListener();
				familyDeclarationListener.enterAcmeFamilyDeclaration(acmeFamilyDeclarationContext);
			}
		} else if (null != ctx.acmeDesignDeclaration()) {
			for (AcmeDesignDeclarationContext acmeDesignDeclarationContext : ctx.acmeDesignDeclaration()) {
				DesignDeclarationListener designDeclarationListener = new DesignDeclarationListener();
				designDeclarationListener.enterAcmeDesignDeclaration(acmeDesignDeclarationContext);
			}
		}
	}
}
