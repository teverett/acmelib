package com.khubla.acme.domain;

import java.util.*;

public class Family {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Attachments attachments;

	public Attachments getAttachments() {
		return attachments;
	}

	public void setAttachments(Attachments attachments) {
		this.attachments = attachments;
	}

	private final Map<String, Component> components = new HashMap<String, Component>();
	private final Map<String, ComponentType> componentTypes = new HashMap<String, ComponentType>();
	private final Map<String, Connector> connectors = new HashMap<String, Connector>();
	private final Map<String, ConnectorType> connectorTypes = new HashMap<String, ConnectorType>();

	public Map<String, ConnectorType> getConnectorTypes() {
		return connectorTypes;
	}

	public Map<String, Connector> getConnectors() {
		return connectors;
	}

	public Map<String, ComponentType> getComponentTypes() {
		return componentTypes;
	}

	public Map<String, Component> getComponents() {
		return components;
	}

	public void addComponent(Component component) {
		this.components.put(component.getName(), component);
	}

	public void addComponentType(ComponentType componentType) {
		this.componentTypes.put(componentType.getName(), componentType);
	}

	public void addConnector(Connector connector) {
		this.connectors.put(connector.getName(), connector);
	}

	public void addConnectorType(ConnectorType connectorType) {
		this.connectorTypes.put(connectorType.getName(), connectorType);
	}
}
