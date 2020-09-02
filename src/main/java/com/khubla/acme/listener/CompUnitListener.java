package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class CompUnitListener extends AbstractListener {
	public Unit unit;

	@Override
	public void enterAcmeCompUnit(AcmeCompUnitContext ctx) {
		unit = new Unit();
		/*
		 * imports
		 */
		if (null != ctx.acmeImportDeclaration()) {
			for (final AcmeImportDeclarationContext acmeImportDeclarationContext : ctx.acmeImportDeclaration()) {
				final ImportDeclarationListener importDeclarationListener = new ImportDeclarationListener();
				importDeclarationListener.enterAcmeImportDeclaration(acmeImportDeclarationContext);
				unit.addImport(new Import(importDeclarationListener.name));
			}
		}
		/*
		 * data
		 */
		if (null != ctx.acmeSystemDeclaration()) {
			for (final AcmeSystemDeclarationContext acmeSystemDeclarationContext : ctx.acmeSystemDeclaration()) {
				final SystemDeclarationListener systemDeclarationListener = new SystemDeclarationListener();
				systemDeclarationListener.enterAcmeSystemDeclaration(acmeSystemDeclarationContext);
				unit.addSysten(systemDeclarationListener.system);
			}
		}
		if (null != ctx.acmeFamilyDeclaration()) {
			for (final AcmeFamilyDeclarationContext acmeFamilyDeclarationContext : ctx.acmeFamilyDeclaration()) {
				final FamilyDeclarationListener familyDeclarationListener = new FamilyDeclarationListener();
				familyDeclarationListener.enterAcmeFamilyDeclaration(acmeFamilyDeclarationContext);
				unit.addFamily(familyDeclarationListener.family);
			}
		}
		if (null != ctx.acmeDesignDeclaration()) {
			for (final AcmeDesignDeclarationContext acmeDesignDeclarationContext : ctx.acmeDesignDeclaration()) {
				final DesignDeclarationListener designDeclarationListener = new DesignDeclarationListener();
				designDeclarationListener.enterAcmeDesignDeclaration(acmeDesignDeclarationContext);
				unit.addDesign(designDeclarationListener.design);
			}
		}
	}
}
