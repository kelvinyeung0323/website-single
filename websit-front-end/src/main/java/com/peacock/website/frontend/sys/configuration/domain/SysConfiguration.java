package com.peacock.website.frontend.sys.configuration.domain;

public class SysConfiguration extends SysConfigurationKey {
    private String value;

    private String description;

    public SysConfiguration(String module, String key, String value, String description) {
        super(module, key);
        this.value = value;
        this.description = description;
    }

    public SysConfiguration() {
        super();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}