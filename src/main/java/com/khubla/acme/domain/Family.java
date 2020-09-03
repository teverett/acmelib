package com.khubla.acme.domain;

import java.util.*;

public class Family {
	private String name;
	private Attachments attachments;
	private final Map<String, Component> components = new HashMap<String, Component>();
	private final Map<String, ComponentType> componentTypes = new HashMap<String, ComponentType>();
	private final Map<String, Connector> connectors = new HashMap<String, Connector>();
	private final Map<String, ConnectorType> connectorTypes = new HashMap<String, ConnectorType>();
	private final Map<String, PortType> portTypes = new HashMap<String, PortType>();

	public void addComponent(Component component) {
		components.put(component.getName(), component);
	}

	public void addComponentType(ComponentType componentType) {
		componentTypes.put(componentType.getName(), componentType);
	}

	public void addConnector(Connector connector) {
		connectors.put(connector.getName(), connector);
	}

	public void addConnectorType(ConnectorType connectorType) {
		connectorTypes.put(connectorType.getName(), connectorType);
	}

	public void addPortType(PortType portType) {
		portTypes.put(portType.getName(), portType);
	}

	public Attachments getAttachments() {
		return attachments;
	}

	public Map<String, Component> getComponents() {
		return components;
	}

	public Map<String, ComponentType> getComponentTypes() {
		return componentTypes;
	}

	public Map<String, Connector> getConnectors() {
		return connectors;
	}

	public Map<String, ConnectorType> getConnectorTypes() {
		return connectorTypes;
	}

	public String getName() {
		return name;
	}

	public void setAttachments(Attachments attachments) {
		this.attachments = attachments;
	}

	public void setName(String name) {
		this.name = name;
	}
}
