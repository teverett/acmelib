package com.khubla.acme.listener;

import java.util.*;

import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class AttachmentsDeclarationListener extends AbstractListener {
	public Attachments attachments;

	@Override
	public void enterAcmeAttachmentDeclaration(AcmeAttachmentDeclarationContext ctx) {
		attachments = new Attachments();
		/*
		 * identifiers
		 */
		final List<String> names = new ArrayList<String>();
		if (null != ctx.acmeInstanceRef()) {
			for (final AcmeInstanceRefContext acmeInstanceRefContext : ctx.acmeInstanceRef()) {
				InstanceRefListener instanceRefListener = new InstanceRefListener();
				instanceRefListener.enterAcmeInstanceRef(acmeInstanceRefContext);
			}
		}
	}
}
