package com.khubla.acme.domain;

import java.util.*;

public class Attachments {
	private List<Attachment> attachments = new ArrayList<Attachment>();
	private Properties properties;

	public List<Attachment> getAttachments() {
		return attachments;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setAttachments(List<Attachment> attachments) {
		this.attachments = attachments;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
}
