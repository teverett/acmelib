package com.khubla.acme.listener;

import java.util.*;

import org.antlr.v4.runtime.tree.*;

import com.khubla.acme.*;
import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class AttachmentsDeclarationListener extends AbstractListener {
	public Attachments attachments;

	@Override
	public void enterAttachmentsDeclaration(acmeParser.AttachmentsDeclarationContext ctx) {
		attachments = new Attachments();
		/*
		 * identifiers
		 */
		final List<String> names = new ArrayList<String>();
		if (null != ctx.IDENTIFIER()) {
			for (final TerminalNode terminalNode : ctx.IDENTIFIER()) {
				names.add(terminalNode.getText());
			}
		}
		final int attachmentsSize = names.size() / 4;
		for (int i = 0; i < attachmentsSize; i++) {
			final Attachment attachment = new Attachment();
			attachment.setFromComponent(names.get(i * 4));
			attachment.setFromPort(names.get((i * 4) + 1));
			attachment.setToConnector(names.get((i * 4) + 2));
			attachment.setToRole(names.get((i * 4) + 3));
			attachments.getAttachments().add(attachment);
		}
		/*
		 * properties blocks
		 */
		if (null != ctx.propertiesBlock()) {
			for (final PropertiesBlockContext propertiesBlockContext : ctx.propertiesBlock()) {
				final PropertiesBlockListener propertiesBlockListener = new PropertiesBlockListener();
				propertiesBlockListener.enterPropertiesBlock(propertiesBlockContext);
				attachments.setProperties(propertiesBlockListener.properties);
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
