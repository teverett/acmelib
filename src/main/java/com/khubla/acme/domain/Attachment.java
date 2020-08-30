package com.khubla.acme.domain;

public class Attachment {
	private String fromComponent;
	private String fromPort;
	private String toConnector;
	private String toRole;

	public String getFromComponent() {
		return fromComponent;
	}

	public String getFromPort() {
		return fromPort;
	}

	public String getToConnector() {
		return toConnector;
	}

	public String getToRole() {
		return toRole;
	}

	public void setFromComponent(String fromComponent) {
		this.fromComponent = fromComponent;
	}

	public void setFromPort(String fromPort) {
		this.fromPort = fromPort;
	}

	public void setToConnector(String toConnector) {
		this.toConnector = toConnector;
	}

	public void setToRole(String toRole) {
		this.toRole = toRole;
	}
}
