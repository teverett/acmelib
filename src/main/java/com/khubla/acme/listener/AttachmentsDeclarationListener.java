package com.khubla.acme.listener;

import java.util.*;

import org.antlr.v4.runtime.tree.*;

import com.khubla.acme.*;
import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class AttachmentsDeclarationListener extends AbstractListener {
	public List<String> names = new ArrayList<String>();
	public Attachments attachments;

	@Override
	public void enterAttachmentsDeclaration(acmeParser.AttachmentsDeclarationContext ctx) {
		attachments = new Attachments();
		/*
		 * identifiers
		 */
		if (null != ctx.IDENTIFIER()) {
			for (final TerminalNode terminalNode : ctx.IDENTIFIER()) {
				names.add(terminalNode.getText());
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
	}
}
