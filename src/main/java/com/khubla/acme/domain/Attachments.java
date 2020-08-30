package com.khubla.acme.domain;

import java.util.*;

public class Attachments {
	private List<Attachment> attachments = new ArrayList<Attachment>();

	public List<Attachment> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<Attachment> attachments) {
		this.attachments = attachments;
	}
}
