package com.oracle.aidp.sdk.logging;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;
import java.util.Objects;
import java.util.Properties;

public final class SdkLoggingOptions {
  private static final String DEFAULT_RESOURCE = "sdk.test.properties";
  private static final Properties DEFAULTS = loadDefaults();

  private SdkLoggingOptions() {}

  public static boolean logRequests() {
    return booleanValue("sdkLogRequests", "cliLogRequests", true);
  }

  public static boolean logResponses() {
    return booleanValue("sdkLogResponses", "cliLogResponses", true);
  }

  public static boolean logRequestBodies() {
    return booleanValue("sdkLogRequestBodies", "cliLogRequestBodies", true);
  }

  public static int maxCharacters() {
    String value = value("sdkLogMaxCharacters", "cliLogMaxCharacters", "20000");
    try {
      return Integer.parseInt(value);
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException("sdkLogMaxCharacters must be a whole number: " + value, e);
    }
  }

  private static boolean booleanValue(String key, String alias, boolean defaultValue) {
    String value = value(key, alias, Boolean.toString(defaultValue));
    if ("true".equalsIgnoreCase(value) || "false".equalsIgnoreCase(value)) {
      return Boolean.parseBoolean(value);
    }
    throw new IllegalArgumentException(key + " must be true or false: " + value);
  }

  private static String value(String key, String alias, String defaultValue) {
    String configuredValue = configuredValue(key);
    if (!isBlank(configuredValue)) {
      return configuredValue.trim();
    }
    configuredValue = configuredValue(alias);
    if (!isBlank(configuredValue)) {
      return configuredValue.trim();
    }
    return defaultValue;
  }

  private static String configuredValue(String key) {
    String systemValue = System.getProperty(key);
    if (!isBlank(systemValue)) {
      return systemValue;
    }

    String envValue = System.getenv(toEnvName(key));
    if (!isBlank(envValue)) {
      return envValue;
    }

    return DEFAULTS.getProperty(key);
  }

  private static Properties loadDefaults() {
    Properties properties = new Properties();
    try (InputStream inputStream =
        SdkLoggingOptions.class.getClassLoader().getResourceAsStream(DEFAULT_RESOURCE)) {
      if (inputStream != null) {
        properties.load(inputStream);
      }
    } catch (IOException e) {
      throw new IllegalStateException("Failed to load " + DEFAULT_RESOURCE, e);
    }
    loadConfiguredFile(properties);
    return properties;
  }

  private static void loadConfiguredFile(Properties properties) {
    String configuredPath =
        firstNonBlank(
            System.getProperty("sdkTestConfigFile"),
            System.getenv("SDK_TEST_CONFIG_FILE"),
            System.getProperty("testpropfilename.override"));
    if (isBlank(configuredPath)) {
      return;
    }

    Path path = Path.of(configuredPath).toAbsolutePath().normalize();
    if (!Files.exists(path)) {
      throw new IllegalArgumentException("SDK test config file does not exist: " + path);
    }
    try (InputStream inputStream = Files.newInputStream(path)) {
      properties.load(inputStream);
    } catch (IOException e) {
      throw new IllegalStateException("Failed to load SDK test config file: " + path, e);
    }
  }

  private static String firstNonBlank(String... values) {
    for (String value : values) {
      if (!isBlank(value)) {
        return value;
      }
    }
    return null;
  }

  private static String toEnvName(String key) {
    Objects.requireNonNull(key, "key");
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < key.length(); i++) {
      char ch = key.charAt(i);
      if (Character.isUpperCase(ch) && i > 0) {
        builder.append('_');
      }
      builder.append(Character.isLetterOrDigit(ch) ? Character.toUpperCase(ch) : '_');
    }
    return builder.toString().toUpperCase(Locale.ROOT);
  }

  private static boolean isBlank(String value) {
    return value == null || value.isBlank();
  }
}
