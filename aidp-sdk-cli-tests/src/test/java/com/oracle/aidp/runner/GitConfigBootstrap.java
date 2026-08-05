package com.oracle.aidp.runner;

import com.oracle.bmc.Region;
import com.oracle.bmc.auth.ResourcePrincipalAuthenticationDetailsProvider;
import com.oracle.bmc.secrets.SecretsClient;
import com.oracle.bmc.secrets.model.Base64SecretBundleContentDetails;
import com.oracle.bmc.secrets.model.SecretBundleContentDetails;
import com.oracle.bmc.secrets.requests.GetSecretBundleByNameRequest;
import com.oracle.bmc.secrets.responses.GetSecretBundleByNameResponse;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Locale;

final class GitConfigBootstrap {
  private static final String DEFAULT_SCM_URL =
      "https://devops.scmservice.us-phoenix-1.oci.oraclecloud.com/namespaces/axetxrhv8myo/projects/gitreleasevalidation/repositories/gitreleasevalidation";

  private GitConfigBootstrap() {}

  static void bootstrapIfEnabled() {
    BootstrapMode mode = BootstrapMode.from(value("gitConfigBootstrapEnabled", "auto"));
    if (mode == BootstrapMode.DISABLED) {
      System.out.println("[AIDP-SDK-CLI-TEST-RUNNER] Git config bootstrap disabled.");
      return;
    }

    if (directGitConfigPresent()) {
      System.out.println(
          "[AIDP-SDK-CLI-TEST-RUNNER] Git config already provided; skipping Git config bootstrap.");
      return;
    }

    GitConfig config = GitConfig.load();
    if (isBlank(config.gitVaultOcid())) {
      if (mode == BootstrapMode.AUTO) {
        System.out.println(
            "[AIDP-SDK-CLI-TEST-RUNNER] Git config bootstrap auto mode: GIT_VAULT_OCID/gitVaultOcid is not set; Git tests may skip if no direct config is provided.");
        return;
      }
      throw new IllegalArgumentException(
          "Missing required Git config bootstrap property: gitVaultOcid or GIT_VAULT_OCID");
    }

    System.out.println(
        "[AIDP-SDK-CLI-TEST-RUNNER] Git config bootstrap enabled: scmUrl="
            + config.scmUrl()
            + ", scmBranchName="
            + config.scmBranchName()
            + ", gitTestUser="
            + config.gitTestUser()
            + ", gitProviderName="
            + config.gitProviderName()
            + ", gitProviderKey="
            + valueOrUnset(config.gitProviderKey())
            + ", gitVaultOcid="
            + config.gitVaultOcid()
            + ", scmSecretName="
            + config.scmSecretName());

    String scmToken = readSecret(config);
    setGitProperties(config, scmToken);
    System.out.println(
        "[AIDP-SDK-CLI-TEST-RUNNER] Git config bootstrap complete for CLI and SDK Git tests.");
  }

  private static boolean directGitConfigPresent() {
    String repositoryUrl = value("cliWorkspaceGitRepositoryUrl", null);
    String branchName = value("cliWorkspaceGitBranchName", null);
    String credentialKey = value("cliWorkspaceGitCredentialKey", null);
    String username = value("cliWorkspaceGitUsername", null);
    String personalAccessToken = value("cliWorkspaceGitPersonalAccessToken", null);
    return !isBlankOrPlaceholder(repositoryUrl)
        && !isBlankOrPlaceholder(branchName)
        && (!isBlankOrPlaceholder(credentialKey)
            || (!isBlankOrPlaceholder(username) && !isBlankOrPlaceholder(personalAccessToken)));
  }

  private static String readSecret(GitConfig config) {
    ResourcePrincipalAuthenticationDetailsProvider provider =
        ResourcePrincipalAuthenticationDetailsProvider.builder().build();
    try (SecretsClient secretsClient =
        SecretsClient.builder().region(Region.fromRegionId(config.region())).build(provider)) {
      GetSecretBundleByNameResponse response =
          secretsClient.getSecretBundleByName(
              GetSecretBundleByNameRequest.builder()
                  .vaultId(config.gitVaultOcid())
                  .secretName(config.scmSecretName())
                  .stage(GetSecretBundleByNameRequest.Stage.Current)
                  .build());
      SecretBundleContentDetails content =
          response.getSecretBundle().getSecretBundleContent();
      if (!(content instanceof Base64SecretBundleContentDetails base64Content)) {
        throw new IllegalStateException(
            "Secret '" + config.scmSecretName() + "' is not base64 content.");
      }
      return new String(
              Base64.getDecoder().decode(base64Content.getContent()), StandardCharsets.UTF_8)
          .trim();
    }
  }

  private static void setGitProperties(GitConfig config, String scmToken) {
    setIfBlank("cliWorkspaceGitRepositoryUrl", config.scmUrl());
    setIfBlank("sdkGitRepositoryUrl", config.scmUrl());
    setIfBlank("cliWorkspaceGitBranchName", config.scmBranchName());
    setIfBlank("sdkGitBranchName", config.scmBranchName());
    setIfBlank("cliWorkspaceGitUsername", config.gitTestUser());
    setIfBlank("sdkGitUserName", config.gitTestUser());
    setIfBlank("cliWorkspaceGitPersonalAccessToken", scmToken);
    setIfBlank("sdkGitPersonalAccessToken", scmToken);
    setIfBlank("cliWorkspaceGitProviderName", config.gitProviderName());
    setIfBlank("sdkGitProviderName", config.gitProviderName());
    setIfBlank("cliWorkspaceGitProviderKey", config.gitProviderKey());
    setIfBlank("sdkGitProviderKey", config.gitProviderKey());
  }

  private static void setIfBlank(String key, String value) {
    if (isBlank(System.getProperty(key)) && !isBlank(value)) {
      System.setProperty(key, value);
    }
  }

  private static String value(String key, String defaultValue) {
    String value = System.getProperty(key);
    if (!isBlank(value)) {
      return value.trim();
    }
    value = System.getenv(toEnvName(key));
    return isBlank(value) ? defaultValue : value.trim();
  }

  private static String toEnvName(String key) {
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

  private static boolean isBlankOrPlaceholder(String value) {
    if (isBlank(value)) {
      return true;
    }
    String trimmed = value.trim();
    return trimmed.startsWith("<") && trimmed.endsWith(">");
  }

  private static String valueOrUnset(String value) {
    return isBlank(value) ? "<unset>" : value;
  }

  private enum BootstrapMode {
    AUTO,
    ENABLED,
    DISABLED;

    static BootstrapMode from(String value) {
      String normalized = value == null ? "auto" : value.trim().toLowerCase(Locale.ROOT);
      return switch (normalized) {
        case "auto", "" -> AUTO;
        case "true", "enabled", "enable" -> ENABLED;
        case "false", "disabled", "disable" -> DISABLED;
        default ->
            throw new IllegalArgumentException(
                "gitConfigBootstrapEnabled must be auto, true, or false: " + value);
      };
    }
  }

  private record GitConfig(
      String gitVaultOcid,
      String scmSecretName,
      String scmUrl,
      String scmBranchName,
      String gitTestUser,
      String gitProviderName,
      String gitProviderKey,
      String region) {

    static GitConfig load() {
      return new GitConfig(
          value("gitVaultOcid", null),
          value("scmSecretName", "scmTokenTest"),
          value("scmUrl", DEFAULT_SCM_URL),
          value("scmBranchName", "master"),
          value("gitTestUser", "datahubdev/git_automation_user"),
          value("gitProviderName", "OCI_DEVOPS"),
          value("gitProviderKey", "gitProviderKey"),
          value("region", "us-phoenix-1"));
    }
  }
}
