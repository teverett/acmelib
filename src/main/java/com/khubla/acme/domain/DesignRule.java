package com.khubla.acme.domain;

public class DesignRule {
	public static enum DesignRuleType {
		heuristic, invariant
	};

	private Properties properties;
	private DesignRuleType designRuleType;

	public void addProperty(Property property) {
		if (null == properties) {
			properties = new Properties();
		}
		properties.getProperties().add(property);
	}

	public DesignRuleType getDesignRuleType() {
		return designRuleType;
	}

	public void setDesignRuleType(DesignRuleType designRuleType) {
		this.designRuleType = designRuleType;
	}
}
