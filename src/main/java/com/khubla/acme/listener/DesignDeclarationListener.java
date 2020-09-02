package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class DesignDeclarationListener extends AbstractListener {
	private Design design;

	@Override
	public void enterAcmeDesignDeclaration(AcmeDesignDeclarationContext ctx) {
		design = new Design();
		/*
		 * filenames
		 */
		if (null != ctx.filename()) {
			for (final FilenameContext filenameContext : ctx.filename()) {
				final FilenameListener filenameListener = new FilenameListener();
				filenameListener.enterFilename(filenameContext);
			}
		}
		/*
		 * design analysis
		 */
		if (null != ctx.designAnalysisDeclaration()) {
			for (final DesignAnalysisDeclarationContext designAnalysisDeclarationContext : ctx.designAnalysisDeclaration()) {
				final DesignAnalysisDeclarationListener designAnalysisDeclarationListener = new DesignAnalysisDeclarationListener();
				designAnalysisDeclarationListener.enterDesignAnalysisDeclaration(designAnalysisDeclarationContext);
			}
		}
		/*
		 * family
		 */
		if (null != ctx.familyDeclaration()) {
			for (final FamilyDeclarationContext familyDeclarationContext : ctx.familyDeclaration()) {
				final FamilyDeclarationListener familyDeclarationListener = new FamilyDeclarationListener();
				familyDeclarationListener.enterFamilyDeclaration(familyDeclarationContext);
			}
		}
		/*
		 * properties blocks
		 */
		if (null != ctx.propertiesBlock()) {
			for (final PropertiesBlockContext propertiesBlockContext : ctx.propertiesBlock()) {
				final PropertiesBlockListener propertiesBlockListener = new PropertiesBlockListener();
				propertiesBlockListener.enterPropertiesBlock(propertiesBlockContext);
			}
		}
		/*
		 * property declarations
		 */
		if (null != ctx.propertyDeclaration()) {
			for (final PropertyDeclarationContext propertyDeclarationContext : ctx.propertyDeclaration()) {
				final PropertyDeclarationListener propertyDeclarationListener = new PropertyDeclarationListener();
				propertyDeclarationListener.enterPropertyDeclaration(propertyDeclarationContext);
			}
		}
		/*
		 * system declaration
		 */
		if (null != ctx.systemDeclaration()) {
			for (final SystemDeclarationContext systemDeclarationContext : ctx.systemDeclaration()) {
				final SystemDeclarationListener systemDeclarationListener = new SystemDeclarationListener();
				systemDeclarationListener.enterSystemDeclaration(systemDeclarationContext);
				design.getSystems().put(systemDeclarationListener.system.getName(), systemDeclarationListener.system);
			}
		}
		/*
		 * type declaration
		 */
		if (null != ctx.typeDeclaration()) {
			for (final TypeDeclarationContext typeDeclarationContext : ctx.typeDeclaration()) {
				final TypeDeclarationListener typeDeclarationListener = new TypeDeclarationListener();
				typeDeclarationListener.enterTypeDeclaration(typeDeclarationContext);
			}
		}
	}

	public Design getDesign() {
		return design;
	}

	public void setDesign(Design design) {
		this.design = design;
	}
}
