package com.oracle.aidp.cli.invocation.config;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Locale;
import java.util.Objects;
import java.util.Properties;

public final class CliTestConfig {
  private static final String DEFAULT_RESOURCE = "cli-test.properties";

  private final Properties properties;

  private CliTestConfig(Properties properties) {
    this.properties = properties;
  }

  public static CliTestConfig load() {
    Properties properties = new Properties();
    loadClasspathDefaults(properties);
    loadConfiguredFile(properties);
    return new CliTestConfig(properties);
  }

  public String aidpCliPath() {
    return value("aidpCliPath", "aidp");
  }

  public String dataHubId() {
    return required("dataHubId");
  }

  public String workspaceKey() {
    return value("workspaceKey", null);
  }

  public String endpoint() {
    return required("dpServiceEndpoint");
  }

  public String region() {
    return required("region");
  }

  public String auth() {
    return value("ociAuth", value("OCI_CLI_AUTH", "security_token"));
  }

  public String configFile() {
    return value("ociConfigFilePath", "~/.oci/config");
  }

  public String profile() {
    return value("ociProfile", "DEFAULT");
  }

  public String workspacePermissionTarget() {
    String target = value("cliWorkspacePermissionTarget", null);
    if (isBlank(target)) {
      target = value("subjectId", null);
    }
    if (isBlank(target)) {
      target = value("userOcid", null);
    }
    if (isBlank(target)) {
      throw new IllegalArgumentException(
          "Missing workspace permission target. Set cliWorkspacePermissionTarget, subjectId, or userOcid.");
    }
    return target;
  }

  public String clusterPermissionTarget() {
    String target = value("cliClusterPermissionTarget", null);
    if (isBlank(target)) {
      target = value("cliWorkspacePermissionTarget", null);
    }
    if (isBlank(target)) {
      target = value("subjectId", null);
    }
    if (isBlank(target)) {
      target = value("userOcid", null);
    }
    if (isBlank(target)) {
      throw new IllegalArgumentException(
          "Missing cluster permission target. Set cliClusterPermissionTarget, "
              + "cliWorkspacePermissionTarget, subjectId, or userOcid.");
    }
    return target;
  }

  public String catalogPermissionTarget() {
    String target = value("cliCatalogPermissionTarget", null);
    if (isBlank(target)) {
      target = value("cliWorkspacePermissionTarget", null);
    }
    if (isBlank(target)) {
      target = value("subjectId", null);
    }
    if (isBlank(target)) {
      target = value("userOcid", null);
    }
    if (isBlank(target)) {
      throw new IllegalArgumentException(
          "Missing catalog permission target. Set cliCatalogPermissionTarget, "
              + "cliWorkspacePermissionTarget, subjectId, or userOcid.");
    }
    return target;
  }

  public String volumeCatalogName() {
    return value("cliVolumeCatalogName", "default");
  }

  public String volumeSchemaName() {
    return value("cliVolumeSchemaName", "default");
  }

  public String volumePermissionTarget() {
    String target = value("cliVolumePermissionTarget", null);
    if (isBlank(target)) {
      target = value("cliCatalogPermissionTarget", null);
    }
    if (isBlank(target)) {
      target = value("cliWorkspacePermissionTarget", null);
    }
    if (isBlank(target)) {
      target = value("subjectId", null);
    }
    if (isBlank(target)) {
      target = value("userOcid", null);
    }
    if (isBlank(target)) {
      throw new IllegalArgumentException(
          "Missing volume permission target. Set cliVolumePermissionTarget, "
              + "cliCatalogPermissionTarget, cliWorkspacePermissionTarget, subjectId, or userOcid.");
    }
    return target;
  }

  public String workflowPermissionTarget() {
    String target = value("cliWorkflowPermissionTarget", null);
    if (isBlank(target)) {
      target = value("cliWorkspacePermissionTarget", null);
    }
    if (isBlank(target)) {
      target = value("subjectId", null);
    }
    if (isBlank(target)) {
      target = value("userOcid", null);
    }
    if (isBlank(target)) {
      throw new IllegalArgumentException(
          "Missing workflow permission target. Set cliWorkflowPermissionTarget, "
              + "cliWorkspacePermissionTarget, subjectId, or userOcid.");
    }
    return target;
  }

  public String createWorkspacePermissionTarget() {
    String target = value("cliCreateWorkspacePermissionTarget", null);
    if (isBlank(target)) {
      target = value("cliWorkspacePermissionTarget", null);
    }
    if (isBlank(target)) {
      target = value("subjectId", null);
    }
    if (isBlank(target)) {
      target = value("userOcid", null);
    }
    if (isBlank(target)) {
      throw new IllegalArgumentException(
          "Missing create workspace permission target. Set cliCreateWorkspacePermissionTarget, "
              + "cliWorkspacePermissionTarget, subjectId, or userOcid.");
    }
    return target;
  }

  public String workspaceObjectPermissionTarget() {
    String target = value("cliWorkspaceObjectPermissionTarget", null);
    if (isBlank(target)) {
      target = value("cliWorkspacePermissionTarget", null);
    }
    if (isBlank(target)) {
      target = value("subjectId", null);
    }
    if (isBlank(target)) {
      target = value("userOcid", null);
    }
    if (isBlank(target)) {
      throw new IllegalArgumentException(
          "Missing workspace object permission target. Set cliWorkspaceObjectPermissionTarget, "
              + "cliWorkspacePermissionTarget, subjectId, or userOcid.");
    }
    return target;
  }

  public String roleNamePrefix() {
    return value("cliRoleNamePrefix", "it_role_cli_");
  }

  public String roleMemberAssigneeType() {
    return value("cliRoleMemberAssigneeType", "USER");
  }

  public String roleMemberTarget() {
    String target = value("cliRoleMemberTarget", null);
    if (isBlank(target)) {
      target = workspacePermissionTarget();
    }
    return target;
  }

  public String schemaCatalogKey() {
    return value("cliSchemaCatalogKey", value("catalogKey", "default"));
  }

  public String schemaNamePrefix() {
    return value("cliSchemaNamePrefix", "it_schema_cli_");
  }

  public String schemaTableNamePrefix() {
    return value("cliSchemaTableNamePrefix", "it_table_cli_");
  }

  public String schemaViewNamePrefix() {
    return value("cliSchemaViewNamePrefix", "it_view_cli_");
  }

  public String schemaPermissionTarget() {
    String target = value("cliSchemaPermissionTarget", null);
    if (isBlank(target)) {
      target = workspacePermissionTarget();
    }
    return target;
  }

  public String schemaPermissionGranteeType() {
    return value("cliSchemaPermissionGranteeType", "USER");
  }

  public String schemaManagedTableDataFormat() {
    return value("cliSchemaManagedTableDataFormat", "ICEBERG");
  }

  public String schemaInferDataFormat() {
    return value("cliSchemaInferDataFormat", "CSV");
  }

  public String schemaTempUploadEndpoint() {
    String endpoint = value("cliSchemaTempUploadEndpoint", null);
    if (!isBlank(endpoint)) {
      return endpoint;
    }
    return "https://objectstorage." + region() + "." + objectStorageRealm();
  }

  public String deltaShareNamePrefix() {
    return value("cliDeltaShareNamePrefix", "it_delta_share_cli_");
  }

  public String deltaShareRecipientNamePrefix() {
    return value("cliDeltaShareRecipientNamePrefix", "it_delta_recipient_cli_");
  }

  public String deltaSharePermissionTarget() {
    String target = value("cliDeltaSharePermissionTarget", null);
    if (isBlank(target)) {
      target = workspacePermissionTarget();
    }
    return target;
  }

  public String deltaSharePermissionGranteeType() {
    return value("cliDeltaSharePermissionGranteeType", "USER");
  }

  public String mlOpsNamePrefix() {
    return value("cliMlOpsNamePrefix", "it_mlops_cli_");
  }

  public String mlOpsWorkspaceName() {
    return value("cliMlOpsWorkspaceName", mlOpsNamePrefix() + "workspace");
  }

  public String mlOpsRegisteredModelCatalog() {
    return value("cliMlOpsRegisteredModelCatalog", schemaCatalogKey());
  }

  public String mlOpsRegisteredModelSchema() {
    return value("cliMlOpsRegisteredModelSchema", "default");
  }

  public String mlOpsModelVersionSource() {
    return value("cliMlOpsModelVersionSource", "runs:/runId/model");
  }

  public String mlOpsModelVersionStage() {
    return value("cliMlOpsModelVersionStage", "Staging");
  }

  public String mlOpsLogModelJson() {
    return value(
        "cliMlOpsLogModelJson",
        "{\"artifact_path\":\"${artifact_path}\",\"utc_time_created\":\"${utc_time_created}\",\"run_id\":\"${run_id}\",\"flavors\":{\"python_function\":{}}}");
  }

  public String dhUserPrincipal() {
    return value("dhUserPrincipal", null);
  }

  public Duration asyncTimeout() {
    return Duration.ofSeconds(longValue("cliAsyncTimeoutSeconds", 1200L));
  }

  public Duration resourceReadyTimeout() {
    return Duration.ofSeconds(longValue("cliResourceReadyTimeoutSeconds", 600L));
  }

  public Duration pollInterval() {
    return Duration.ofSeconds(longValue("cliPollIntervalSeconds", 15L));
  }

  public Duration processTimeout() {
    return Duration.ofSeconds(longValue("cliProcessTimeoutSeconds", 180L));
  }

  public String requestTimeoutSeconds() {
    return Long.toString(longValue("cliRequestTimeoutSeconds", 120L));
  }

  public boolean logCliRequests() {
    return booleanValue("cliLogRequests", true);
  }

  public boolean logCliResponses() {
    return booleanValue("cliLogResponses", true);
  }

  public boolean logCliRequestBodies() {
    return booleanValue("cliLogRequestBodies", true);
  }

  public int cliLogMaxCharacters() {
    return Math.toIntExact(longValue("cliLogMaxCharacters", 20000L));
  }

  public String value(String key, String defaultValue) {
    String systemValue = System.getProperty(key);
    if (!isBlank(systemValue)) {
      return systemValue.trim();
    }

    String envValue = System.getenv(toEnvName(key));
    if (!isBlank(envValue)) {
      return envValue.trim();
    }

    String propertyValue = properties.getProperty(key);
    if (!isBlank(propertyValue)) {
      return propertyValue.trim();
    }
    return defaultValue;
  }

  public String required(String key) {
    String value = value(key, null);
    if (isBlank(value)) {
      throw new IllegalArgumentException(
          "Missing required CLI test property: "
              + key
              + ". Provide it with -D"
              + key
              + " or -DcliTestConfigFile.");
    }
    return value;
  }

  private long longValue(String key, long defaultValue) {
    String value = value(key, Long.toString(defaultValue));
    try {
      return Long.parseLong(value);
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException(key + " must be a whole number: " + value, e);
    }
  }

  private boolean booleanValue(String key, boolean defaultValue) {
    String value = value(key, Boolean.toString(defaultValue));
    if ("true".equalsIgnoreCase(value) || "false".equalsIgnoreCase(value)) {
      return Boolean.parseBoolean(value);
    }
    throw new IllegalArgumentException(key + " must be true or false: " + value);
  }

  private static void loadClasspathDefaults(Properties properties) {
    try (InputStream inputStream =
        CliTestConfig.class.getClassLoader().getResourceAsStream(DEFAULT_RESOURCE)) {
      if (inputStream != null) {
        properties.load(inputStream);
      }
    } catch (IOException e) {
      throw new IllegalStateException("Failed to load " + DEFAULT_RESOURCE, e);
    }
  }

  private static void loadConfiguredFile(Properties properties) {
    String configuredPath = firstNonBlank(
        System.getProperty("cliTestConfigFile"),
        System.getenv("CLI_TEST_CONFIG_FILE"),
        System.getProperty("testpropfilename.override"));
    if (isBlank(configuredPath)) {
      return;
    }

    Path path = Path.of(configuredPath).toAbsolutePath().normalize();
    if (!Files.exists(path)) {
      throw new IllegalArgumentException("CLI test config file does not exist: " + path);
    }
    try (InputStream inputStream = Files.newInputStream(path)) {
      properties.load(inputStream);
    } catch (IOException e) {
      throw new IllegalStateException("Failed to load CLI test config file: " + path, e);
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

  private String objectStorageRealm() {
    String host = URI.create(endpoint()).getHost();
    if (host != null && host.endsWith(".oci.oc-test.com")) {
      return "oci.customer-oci.com";
    }
    return "oraclecloud.com";
  }
}
