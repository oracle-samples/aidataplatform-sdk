package com.oracle.aidp.sdk.config;

import com.oracle.bmc.ConfigFileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Locale;
import java.util.Objects;
import java.util.Properties;

public final class SdkTestConfig {
  private static final String DEFAULT_RESOURCE = "sdk.test.properties";
  private static final String CLI_DEFAULT_RESOURCE = "cli-test.properties";

  private final Properties properties;

  private SdkTestConfig(Properties properties) {
    this.properties = properties;
  }

  public static SdkTestConfig load() {
    Properties properties = new Properties();
    loadClasspathDefaults(properties);
    loadConfiguredFile(properties);
    return new SdkTestConfig(properties);
  }

  public String dataHubId() {
    return required("dataHubId");
  }

  public String workspaceKey() {
    return value("workspaceKey", null);
  }

  public String sharedWorkspaceName() {
    return value("sdkSharedWorkspaceName", "SDK_Test_WS");
  }

  public String clusterKey() {
    return value("clusterKey", null);
  }

  public String sharedClusterName() {
    return value("sdkSharedClusterName", "SDK_Cluster");
  }

  public String roleKey() {
    return value("roleKey", null);
  }

  public boolean runRoleMutationTests() {
    return booleanValue("sdkRunRoleMutationTests", true);
  }

  public boolean runRoleMemberMutationTests() {
    return booleanValue("sdkRunRoleMemberMutationTests", !isBlank(roleMemberTarget()));
  }

  public String roleNamePrefix() {
    return value("sdkRoleNamePrefix", "sdk_role_");
  }

  public String roleMemberTarget() {
    return value("sdkRoleMemberTarget", null);
  }

  public String roleMemberTargetName() {
    return value("sdkRoleMemberTargetName", null);
  }

  public String roleMemberAssigneeType() {
    return value("sdkRoleMemberAssigneeType", "USER");
  }

  public String catalogKey() {
    return value("catalogKey", "default");
  }

  public String schemaKey() {
    return value("schemaKey", null);
  }

  public String tableKey() {
    return value("tableKey", null);
  }

  public String viewKey() {
    return value("viewKey", null);
  }

  public boolean runSchemaMutationTests() {
    return booleanValue("sdkRunSchemaMutationTests", true);
  }

  public boolean runSchemaTableMutationTests() {
    return booleanValue("sdkRunSchemaTableMutationTests", true);
  }

  public boolean runSchemaViewMutationTests() {
    return booleanValue("sdkRunSchemaViewMutationTests", true);
  }

  public boolean runSchemaPermissionMutationTests() {
    return booleanValue("sdkRunSchemaPermissionMutationTests", !isBlank(schemaPermissionTarget()));
  }

  public boolean runSchemaRefreshTests() {
    return booleanValue("sdkRunSchemaRefreshTests", true);
  }

  public boolean runSchemaInferTests() {
    return booleanValue("sdkRunSchemaInferTests", true);
  }

  public boolean runSchemaTempUploadTargetTests() {
    return booleanValue("sdkRunSchemaTempUploadTargetTests", true);
  }

  public boolean runSchemaDataTableMutationTests() {
    return booleanValue("sdkRunSchemaDataTableMutationTests", true);
  }

  public boolean runSchemaParTests() {
    return booleanValue("sdkRunSchemaParTests", true);
  }

  public boolean runSchemaFixtureCleanupTests() {
    return booleanValue("sdkRunSchemaFixtureCleanupTests", true);
  }

  public String schemaNamePrefix() {
    return value("sdkSchemaNamePrefix", "sdk_schema_");
  }

  public String schemaTableNamePrefix() {
    return value("sdkSchemaTableNamePrefix", "sdk_table_");
  }

  public String schemaViewNamePrefix() {
    return value("sdkSchemaViewNamePrefix", "sdk_view_");
  }

  public String schemaPermissionTarget() {
    String target = value("sdkSchemaPermissionTarget", null);
    return isBlank(target) ? workspacePermissionTarget() : target;
  }

  public String schemaPermissionGranteeType() {
    return value("sdkSchemaPermissionGranteeType", "USER");
  }

  public String schemaTableType() {
    return value("sdkSchemaTableType", "MANAGED");
  }

  public String schemaManagedTableDataFormat() {
    return value("sdkSchemaManagedTableDataFormat", "ICEBERG");
  }

  public String schemaExternalTableLocationPath() {
    return value("sdkSchemaExternalTableLocationPath", null);
  }

  public String schemaExternalTableDataFormat() {
    return value("sdkSchemaExternalTableDataFormat", "CSV");
  }

  public String schemaViewText() {
    return value("sdkSchemaViewText", "SELECT 1 AS id");
  }

  public String schemaInferLocation() {
    return value("sdkSchemaInferLocation", null);
  }

  public String schemaInferDataFormat() {
    return value("sdkSchemaInferDataFormat", "CSV");
  }

  public String schemaDataTableObjectStorageLocationPath() {
    return value("sdkSchemaDataTableObjectStorageLocationPath", null);
  }

  public String schemaDataTableFileFormat() {
    return value("sdkSchemaDataTableFileFormat", "CSV");
  }

  public String schemaTempUploadEndpoint() {
    String endpoint = value("sdkSchemaTempUploadEndpoint", null);
    if (!isBlank(endpoint)) {
      return endpoint;
    }
    return "https://objectstorage." + required("region") + ".oraclecloud.com";
  }

  public Duration schemaReadyTimeout() {
    return Duration.ofSeconds(longValue("sdkSchemaReadyTimeoutSeconds", 300L));
  }

  public String shareKey() {
    return value("shareKey", null);
  }

  public String recipientKey() {
    return value("recipientKey", null);
  }

  public boolean runDeltaShareMutationTests() {
    return booleanValue("sdkRunDeltaShareMutationTests", true);
  }

  public boolean runDeltaShareAccessMutationTests() {
    return booleanValue("sdkRunDeltaShareAccessMutationTests", true);
  }

  public boolean runDeltaSharePermissionMutationTests() {
    return booleanValue("sdkRunDeltaSharePermissionMutationTests", !isBlank(workspacePermissionTarget()));
  }

  public boolean runDeltaShareDataAssetMutationTests() {
    return booleanValue("sdkRunDeltaShareDataAssetMutationTests", true);
  }

  public String deltaShareNamePrefix() {
    return value("sdkDeltaShareNamePrefix", "sdk_delta_share_");
  }

  public String deltaShareRecipientNamePrefix() {
    return value("sdkDeltaShareRecipientNamePrefix", "sdk_delta_recipient_");
  }

  public String deltaShareIfMatch() {
    return value("sdkDeltaShareIfMatch", null);
  }

  public String deltaShareRecipientIfMatch() {
    return value("sdkDeltaShareRecipientIfMatch", null);
  }

  public String deltaSharePermissionGranteeType() {
    return value("sdkDeltaSharePermissionGranteeType", "USER");
  }

  public String deltaShareDataAssetType() {
    return value("sdkDeltaShareDataAssetType", "TABLE");
  }

  public String deltaShareDataAssetPartition() {
    return value("sdkDeltaShareDataAssetPartition", null);
  }

  public String deltaShareDataAssetAlias() {
    return value("sdkDeltaShareDataAssetAlias", null);
  }

  public String bundlePath() {
    return value("bundlePath", null);
  }

  public boolean runBundleCreateTests() {
    return booleanValue("sdkRunBundleCreateTests", true);
  }

  public boolean runBundleDeployTests() {
    return booleanValue("sdkRunBundleDeployTests", true);
  }

  public boolean runBundlePurgeTests() {
    return booleanValue("sdkRunBundlePurgeTests", true);
  }

  public boolean runBundleSyncTests() {
    return booleanValue("sdkRunBundleSyncTests", true);
  }

  public String bundleCreateParentPath() {
    return value("sdkBundleCreateParentPath", "/Workspace");
  }

  public String bundleName() {
    return value("sdkBundleName", "sdk_bundle_" + System.currentTimeMillis());
  }

  public String bundleResourceType() {
    return value("sdkBundleResourceType", "JOB");
  }

  public String bundleResourceKey() {
    return value("sdkBundleResourceKey", null);
  }

  public String experimentId() {
    return value("experimentId", null);
  }

  public String experimentName() {
    return value("experimentName", null);
  }

  public String experimentRunId() {
    return value("experimentRunId", null);
  }

  public String registeredModelKey() {
    return value("registeredModelKey", null);
  }

  public String registeredModelName() {
    return value("registeredModelName", registeredModelKey());
  }

  public String modelVersionKey() {
    return value("modelVersionKey", null);
  }

  public boolean runMlOpsExperimentMutationTests() {
    return booleanValue("sdkRunMlOpsExperimentMutationTests", true);
  }

  public boolean runMlOpsModelMutationTests() {
    return booleanValue("sdkRunMlOpsModelMutationTests", true);
  }

  public String mlOpsNamePrefix() {
    return value("sdkMlOpsNamePrefix", "sdk_mlops_");
  }

  public String mlOpsModelVersionSource() {
    return value("sdkMlOpsModelVersionSource", "runs:/runId/model");
  }

  public String mlOpsModelVersionStage() {
    return value("sdkMlOpsModelVersionStage", "Staging");
  }

  public String mlOpsLogModelJson() {
    return value(
        "sdkMlOpsLogModelJson",
        "{\"artifact_path\":\"${artifact_path}\",\"utc_time_created\":\"${utc_time_created}\",\"run_id\":\"${run_id}\",\"flavors\":{\"python_function\":{}}}");
  }

  public String dhUserPrincipal() {
    return value("dhUserPrincipal", null);
  }

  public String gitFolderPath() {
    return value("sdkGitFolderPath", null);
  }

  public String gitProviderKey() {
    return value("sdkGitProviderKey", null);
  }

  public String gitRepositoryUrl() {
    return value("sdkGitRepositoryUrl", null);
  }

  public String gitBranchName() {
    return value("sdkGitBranchName", null);
  }

  public String gitCredentialKey() {
    return value("sdkGitCredentialKey", null);
  }

  public String gitUserName() {
    return value("sdkGitUserName", null);
  }

  public String gitPersonalAccessToken() {
    return value("sdkGitPersonalAccessToken", null);
  }

  public String gitCredentialName() {
    return value("sdkGitCredentialName", "sdk-git-credential-" + System.currentTimeMillis());
  }

  public String gitProviderName() {
    return value("sdkGitProviderName", "GITHUB");
  }

  public boolean runGitMutationTests() {
    return booleanValue("sdkRunGitMutationTests", true);
  }

  public String notebookFolderRoot() {
    return value("sdkNotebookFolderRoot", "/Workspace");
  }

  public String notebookKernelName() {
    return value("sdkNotebookKernelName", "python3");
  }

  public String workspaceAsyncOperationKey() {
    return value("sdkWorkspaceAsyncOperationKey", null);
  }

  public String workspaceAsyncOperationWorkspaceKey() {
    return value("sdkWorkspaceAsyncOperationWorkspaceKey", workspaceKey());
  }

  public String workspaceAsyncOperationIfMatch() {
    return value("sdkWorkspaceAsyncOperationIfMatch", null);
  }

  public String workspaceAsyncOperationState() {
    return value("sdkWorkspaceAsyncOperationState", "NETWORK_CONFIGURATION_CREATED");
  }

  public String workspaceAsyncOperationStateMessage() {
    return value("sdkWorkspaceAsyncOperationStateMessage", "network configuration created");
  }

  public String workspaceAsyncOperationExternalId() {
    return value("sdkWorkspaceAsyncOperationExternalId", "sdk-test-external-id");
  }

  public String endpoint() {
    return value("dpServiceEndpoint", null);
  }

  public String region() {
    String region = value("region", null);
    if (isBlank(region) && isBlank(endpoint())) {
      throw new IllegalArgumentException(
          "Missing required SDK test property: region. Provide region when dpServiceEndpoint is not set.");
    }
    return region;
  }

  public String configFile() {
    return value("ociConfigFilePath", ConfigFileReader.DEFAULT_FILE_PATH);
  }

  public String profile() {
    return value("ociProfile", "DEFAULT");
  }

  public String workspacePermissionTarget() {
    String target = value("sdkWorkspacePermissionTarget", null);
    if (isBlank(target)) {
      target = value("subjectId", null);
    }
    if (isBlank(target)) {
      target = value("userOcid", null);
    }
    return target;
  }

  public boolean runPermissionMutationTests() {
    return booleanValue("sdkRunPermissionMutationTests", !isBlank(workspacePermissionTarget()));
  }

  public boolean runCreateWorkspacePermissionMutationTests() {
    return booleanValue(
        "sdkRunCreateWorkspacePermissionMutationTests", !isBlank(workspacePermissionTarget()));
  }

  public boolean runGitFolderTests() {
    return booleanValue("sdkRunGitFolderTests", true);
  }

  public boolean runWorkspaceAsyncOperationStatusTests() {
    return booleanValue("sdkRunWorkspaceAsyncOperationStatusTests", true);
  }

  public boolean runClusterMutationTests() {
    return booleanValue("sdkRunClusterMutationTests", true);
  }

  public boolean runClusterPermissionMutationTests() {
    return booleanValue("sdkRunClusterPermissionMutationTests", !isBlank(clusterPermissionTarget()));
  }

  public boolean runClusterLibraryPatchTests() {
    return booleanValue("sdkRunClusterLibraryPatchTests", true);
  }

  public boolean runClusterLifecycleActionTests() {
    return booleanValue("sdkRunClusterLifecycleActionTests", true);
  }

  public boolean runAuditManageLogsTests() {
    return booleanValue("sdkRunAuditManageLogsTests", true);
  }

  public String auditManageAction() {
    return value("sdkAuditManageAction", "ENABLE");
  }

  public Integer auditRetentionPeriod() {
    String value = value("sdkAuditRetentionPeriod", null);
    if (isBlank(value)) {
      return null;
    }
    try {
      return Integer.parseInt(value);
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException("sdkAuditRetentionPeriod must be a whole number: " + value, e);
    }
  }

  public int auditSearchLimit() {
    return intValue("sdkAuditSearchLimit", 10);
  }

  public int auditSearchWindowHours() {
    return intValue("sdkAuditSearchWindowHours", 24);
  }

  public Duration auditSearchReadyTimeout() {
    return Duration.ofSeconds(longValue("sdkAuditSearchReadyTimeoutSeconds", 120L));
  }

  public String clusterPermissionTarget() {
    String target = value("sdkClusterPermissionTarget", null);
    return isBlank(target) ? workspacePermissionTarget() : target;
  }

  public String clusterLibraryPath() {
    return value("sdkClusterLibraryPath", null);
  }

  public String clusterLibraryName() {
    String name = value("sdkClusterLibraryName", null);
    if (!isBlank(name)) {
      return name;
    }
    return clusterLibraryPath();
  }

  public String clusterLibraryType() {
    return value("sdkClusterLibraryType", "WORKSPACE_FILE");
  }

  public String clusterNodeType() {
    return value("sdkClusterNodeType", clusterDriverShape());
  }

  public String clusterDriverShape() {
    return value("sdkClusterDriverShape", "amd.generic");
  }

  public String clusterWorkerShape() {
    return value("sdkClusterWorkerShape", "amd.generic");
  }

  public int clusterOcpus() {
    return intValue("sdkClusterOcpus", 1);
  }

  public int clusterMemoryInGBs() {
    return intValue("sdkClusterMemoryInGBs", 16);
  }

  public int clusterMinWorkerCount() {
    return intValue("sdkClusterMinWorkerCount", 1);
  }

  public int clusterMaxWorkerCount() {
    return intValue("sdkClusterMaxWorkerCount", 1);
  }

  public int clusterAutoTerminationMinutes() {
    return intValue("sdkClusterAutoTerminationMinutes", 60);
  }

  public String clusterSparkVersion() {
    return value("sdkClusterSparkVersion", "3.5.0");
  }

  public Duration workspaceReadyTimeout() {
    return durationValue("sdkWorkspaceReadyTimeoutSeconds", "sdkWorkspaceWaitTimeoutMs", 600L);
  }

  public Duration workspaceDeleteTimeout() {
    return durationValue("sdkWorkspaceDeleteTimeoutSeconds", "sdkWorkspaceWaitTimeoutMs", 600L);
  }

  public Duration clusterReadyTimeout() {
    return durationValue("sdkClusterReadyTimeoutSeconds", "sdkClusterWaitTimeoutMs", 1200L);
  }

  public Duration clusterDeleteTimeout() {
    return durationValue("sdkClusterDeleteTimeoutSeconds", "sdkClusterWaitTimeoutMs", 1200L);
  }

  public Duration pollInterval() {
    return Duration.ofSeconds(longValue("sdkPollIntervalSeconds", 15L));
  }

  public String value(String key, String defaultValue) {
    String configuredValue = configuredValue(key);
    if (!isBlank(configuredValue)) {
      return configuredValue.trim();
    }

    for (String alias : aliasesFor(key)) {
      configuredValue = configuredValue(alias);
      if (!isBlank(configuredValue)) {
        return configuredValue.trim();
      }
    }
    return defaultValue;
  }

  public String required(String key) {
    String value = value(key, null);
    if (isBlank(value)) {
      throw new IllegalArgumentException(
          "Missing required SDK test property: "
              + key
              + ". Provide it with -D"
              + key
              + " or -DsdkTestConfigFile.");
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

  private Duration durationValue(String secondsKey, String millisKey, long defaultSeconds) {
    String secondsValue = value(secondsKey, null);
    if (!isBlank(secondsValue)) {
      try {
        return Duration.ofSeconds(Long.parseLong(secondsValue));
      } catch (NumberFormatException e) {
        throw new IllegalArgumentException(secondsKey + " must be a whole number: " + secondsValue, e);
      }
    }

    String millisValue = value(millisKey, null);
    if (!isBlank(millisValue)) {
      try {
        return Duration.ofMillis(Long.parseLong(millisValue));
      } catch (NumberFormatException e) {
        throw new IllegalArgumentException(millisKey + " must be a whole number: " + millisValue, e);
      }
    }
    return Duration.ofSeconds(defaultSeconds);
  }

  private int intValue(String key, int defaultValue) {
    String value = value(key, Integer.toString(defaultValue));
    try {
      return Integer.parseInt(value);
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException(key + " must be a whole number: " + value, e);
    }
  }

  private String configuredValue(String key) {
    String systemValue = System.getProperty(key);
    if (!isBlank(systemValue)) {
      return systemValue;
    }

    String envValue = System.getenv(toEnvName(key));
    if (!isBlank(envValue)) {
      return envValue;
    }

    return properties.getProperty(key);
  }

  private static String[] aliasesFor(String key) {
    return switch (key) {
      case "workspaceKey" -> new String[] {"sdkWorkspaceKey"};
      case "clusterKey" -> new String[] {"sdkClusterKey"};
      case "sdkSharedWorkspaceName" -> new String[] {"sdkWorkspaceName"};
      case "sdkSharedClusterName" -> new String[] {"sdkClusterName"};
      case "sdkWorkspacePermissionTarget",
              "sdkClusterPermissionTarget",
              "sdkSchemaPermissionTarget",
              "sdkDeltaSharePermissionTarget",
              "sdkRoleMemberTarget" ->
          new String[] {"sdkPermissionTarget", "cliWorkspacePermissionTarget", "subjectId", "userOcid"};
      case "shareKey" -> new String[] {"sdkDeltaShareKey", "deltaShareKey"};
      case "recipientKey" -> new String[] {"sdkDeltaShareRecipientKey", "deltaShareRecipientKey"};
      case "schemaKey" -> new String[] {"sdkSchemaKey"};
      case "tableKey" -> new String[] {"sdkTableKey"};
      case "viewKey" -> new String[] {"sdkViewKey"};
      case "sdkDeltaShareDataAssetName" -> new String[] {"tableKey", "schemaKey", "viewKey"};
      case "bundlePath" -> new String[] {"sdkBundlePath"};
      case "sdkBundleResourceKey" ->
          new String[] {"bundleResourceKey", "resourceKey", "workflowJobKey", "agentFlowKey"};
      case "experimentId" -> new String[] {"sdkExperimentId", "mlopsExperimentId", "defaultExperimentId"};
      case "experimentName" ->
          new String[] {"sdkExperimentName", "mlopsExperimentName", "defaultExperimentName"};
      case "experimentRunId" ->
          new String[] {"sdkExperimentRunId", "mlopsExperimentRunId", "runId", "defaultExperimentRunId"};
      case "registeredModelKey" -> new String[] {"sdkRegisteredModelKey", "mlopsRegisteredModelKey"};
      case "registeredModelName" ->
          new String[] {"sdkRegisteredModelName", "mlopsRegisteredModelName", "modelName"};
      case "modelVersionKey" ->
          new String[] {"sdkModelVersionKey", "mlopsModelVersionKey", "modelVersion"};
      case "sdkGitFolderPath" -> new String[] {"gitFolderPath", "createGitFolderPath"};
      case "sdkGitProviderKey" -> new String[] {"cliWorkspaceGitProviderKey", "gitProviderKey"};
      case "sdkGitRepositoryUrl" -> new String[] {"cliWorkspaceGitRepositoryUrl", "gitUrl", "scmUrl"};
      case "sdkGitBranchName" ->
          new String[] {
            "cliWorkspaceGitBranchName", "branchName", "scmBranchName", "checkoutBranchName",
            "createGitBranchName"
          };
      case "sdkGitCredentialKey" ->
          new String[] {
            "cliWorkspaceGitCredentialKey", "credentialKey", "gitCredentialKey",
            "gitUpdateCredentialKey", "getUserSettingKey"
          };
      case "sdkGitUserName" ->
          new String[] {"cliWorkspaceGitUserName", "cliWorkspaceGitUsername", "gitUserName", "username"};
      case "sdkGitPersonalAccessToken" ->
          new String[] {"cliWorkspaceGitPersonalAccessToken", "gitPersonalAccessToken"};
      case "sdkGitCredentialName" -> new String[] {"cliWorkspaceGitCredentialName", "gitCredentialName"};
      case "sdkGitProviderName" -> new String[] {"cliWorkspaceGitProviderName", "gitProviderName"};
      case "sdkWorkspaceAsyncOperationKey" -> new String[] {"asyncOperationKey"};
      case "sdkWorkspaceAsyncOperationIfMatch" -> new String[] {"asyncOperationIfMatch"};
      case "sdkClusterDriverShape", "sdkClusterWorkerShape" ->
          new String[] {"sdkClusterNodeShape", "sdkClusterNodeType"};
      default -> new String[0];
    };
  }

  private boolean booleanValue(String key, boolean defaultValue) {
    String value = value(key, Boolean.toString(defaultValue));
    if ("true".equalsIgnoreCase(value) || "false".equalsIgnoreCase(value)) {
      return Boolean.parseBoolean(value);
    }
    throw new IllegalArgumentException(key + " must be true or false: " + value);
  }

  private static void loadClasspathDefaults(Properties properties) {
    loadClasspathResource(properties, CLI_DEFAULT_RESOURCE);
    loadClasspathResource(properties, DEFAULT_RESOURCE);
  }

  private static void loadClasspathResource(Properties properties, String resource) {
    try (InputStream inputStream =
        SdkTestConfig.class.getClassLoader().getResourceAsStream(resource)) {
      if (inputStream != null) {
        properties.load(inputStream);
      }
    } catch (IOException e) {
      throw new IllegalStateException("Failed to load " + resource, e);
    }
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
    if (value == null || value.isBlank()) {
      return true;
    }
    String trimmed = value.trim();
    return (trimmed.startsWith("<") && trimmed.endsWith(">")) || "provider_key".equals(trimmed);
  }
}
