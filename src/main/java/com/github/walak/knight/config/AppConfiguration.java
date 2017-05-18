package com.github.walak.knight.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AppConfiguration extends Properties {

    public AppConfiguration() {
    }

    public AppConfiguration(File file) {
        try (FileInputStream fileStream = new FileInputStream(file)) {
            load(fileStream);
        } catch (IOException e) {
            throw new RuntimeException("Error reading configuration from file [ " + file.getName() + " ]");
        }

    }

    public String getUsedDbConfig() {
        return getProperty("global.useDbCconfig");
    }

    public String getDbUrl() {
        String usedConfig = getUsedDbConfig();

        return getProperty(usedConfig + ".jdbcUrl");
    }

    public int getBatchSize() {
        return Integer.valueOf(getProperty("runner.batchSize"));
    }

    public String getHttpHost() {
        return getProperty("runner.httpHost");
    }

    public int getHttpPort() {
        return Integer.valueOf(getProperty("runner.httpPort"));
    }

    public static AppConfiguration empty() {
        return new AppConfiguration();
    }
}
