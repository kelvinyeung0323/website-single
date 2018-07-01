package com.peacock.website.frontend.sys.configuration.domain;

public class SysConfigurationKey {
    private String module;

    private String key;

    public SysConfigurationKey(String module, String key) {
        this.module = module;
        this.key = key;
    }

    public SysConfigurationKey() {
        super();
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module == null ? null : module.trim();
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }
}