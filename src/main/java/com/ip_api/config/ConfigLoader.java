package com.ip_api.config;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

import java.util.Arrays;
import java.util.List;

public class ConfigLoader {

    private static final String CONFIG_FILE = "application.properties";
    private Configuration config;

    public ConfigLoader() {
        try {
            Configurations configurations = new Configurations();
            config = configurations.properties(CONFIG_FILE);
        } catch (ConfigurationException e) {
            throw new RuntimeException("Failed to load configuration file: " + CONFIG_FILE, e);
        }
    }

    public String getApiEndpoint() {
        return config.getString("api.endpoint");
    }

    public List<String> getNtpDomains() {
        String domains = config.getString("ntp.domains");
        return Arrays.asList(domains.split(","));
    }
}
