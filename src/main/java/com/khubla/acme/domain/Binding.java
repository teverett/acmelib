package com.khubla.acme.domain;

public class Binding {
	private String fromComponent;
	private String fromPort;
	private String toConnector;
	private String toRole;
	private Properties properties;

	public void addProperty(Property property) {
		if (null == properties) {
			properties = new Properties();
		}
		properties.getProperties().add(property);
	}

	public String getFromComponent() {
		return fromComponent;
	}

	public String getFromPort() {
		return fromPort;
	}

	public Properties getProperties() {
		return properties;
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

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public void setToConnector(String toConnector) {
		this.toConnector = toConnector;
	}

	public void setToRole(String toRole) {
		this.toRole = toRole;
	}
}
