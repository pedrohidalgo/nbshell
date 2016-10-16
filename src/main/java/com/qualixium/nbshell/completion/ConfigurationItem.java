package com.qualixium.nbshell.completion;

public class ConfigurationItem {
    public String key;
    public String documentation;
    public String url;

    public ConfigurationItem(String key, String documentation) {
        this.key = key;
        this.documentation = documentation;
    }

    public ConfigurationItem(String key, String documentation, String url) {
        this.key = key;
        this.documentation = documentation;
        this.url = url;
    }

}