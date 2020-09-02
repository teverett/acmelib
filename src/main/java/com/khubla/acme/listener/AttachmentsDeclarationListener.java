package com.khubla.acme.listener;

import java.util.*;

import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class AttachmentsDeclarationListener extends AbstractListener {
	public Attachments attachments;

	@Override
	public void enterAcmeAttachmentDeclaration(AcmeAttachmentDeclarationContext ctx) {
		attachments = new Attachments();
		new ArrayList<String>();
		if (null != ctx.acmeInstanceRef()) {
			for (final AcmeInstanceRefContext acmeInstanceRefContext : ctx.acmeInstanceRef()) {
				final InstanceRefListener instanceRefListener = new InstanceRefListener();
				instanceRefListener.enterAcmeInstanceRef(acmeInstanceRefContext);
			}
		}
	}
}
