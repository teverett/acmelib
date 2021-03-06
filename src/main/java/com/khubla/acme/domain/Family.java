package com.khubla.acme.domain;

import java.util.*;

import com.khubla.acme.domain.propertytype.*;

public class Family {
	private String name;
	private Attachments attachments;
	private final Map<String, Component> components = new HashMap<String, Component>();
	private final Map<String, ComponentType> componentTypes = new HashMap<String, ComponentType>();
	private final Map<String, Connector> connectors = new HashMap<String, Connector>();
	private final Map<String, ConnectorType> connectorTypes = new HashMap<String, ConnectorType>();
	private final Map<String, PortType> portTypes = new HashMap<String, PortType>();
	private final Map<String, RoleType> roleTypes = new HashMap<String, RoleType>();
	private final Map<String, PropertyType> propertyTypes = new HashMap<String, PropertyType>();
	private final List<DesignRule> designRules = new ArrayList<DesignRule>();
	private final List<DesignAnalysis> designAnalysises = new ArrayList<DesignAnalysis>();

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

	public void addDesignAnalysis(DesignAnalysis designAnalysis) {
		designAnalysises.add(designAnalysis);
	}

	public void addDesignRule(DesignRule designRule) {
		designRules.add(designRule);
	}

	public void addPortType(PortType portType) {
		portTypes.put(portType.getName(), portType);
	}

	public void addPropertyType(PropertyType propertyType) {
		propertyTypes.put(propertyType.getName(), propertyType);
	}

	public void addRoleType(RoleType roleType) {
		roleTypes.put(roleType.getName(), roleType);
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

	public List<DesignAnalysis> getDesignAnalysises() {
		return designAnalysises;
	}

	public List<DesignRule> getDesignRules() {
		return designRules;
	}

	public String getName() {
		return name;
	}

	public Map<String, PortType> getPortTypes() {
		return portTypes;
	}

	public Map<String, PropertyType> getPropertyTypes() {
		return propertyTypes;
	}

	public Map<String, RoleType> getRoleTypes() {
		return roleTypes;
	}

	public void setAttachments(Attachments attachments) {
		this.attachments = attachments;
	}

	public void setName(String name) {
		this.name = name;
	}
}
