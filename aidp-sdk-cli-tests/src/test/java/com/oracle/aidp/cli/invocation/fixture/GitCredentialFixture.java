package com.oracle.aidp.cli.invocation.fixture;

import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.assertStatus;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.assertStatusIn;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.assertSuccess;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.data;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.firstExisting;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.requiredText;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.responseJson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.oracle.aidp.cli.invocation.config.CliTestConfig;
import com.oracle.aidp.cli.invocation.logging.CliTestLogger;
import com.oracle.aidp.cli.invocation.runner.CliCommandResult;
import com.oracle.aidp.cli.invocation.runner.CliCommandRunner;
import com.oracle.aidp.cli.invocation.runner.CliInvocationBuilder;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import org.testng.SkipException;

public final class GitCredentialFixture {
  private static final ObjectMapper MAPPER = new ObjectMapper();
  private static final String GIT_ACCOUNT = "GIT_ACCOUNT";
  private static final String GITHUB = "GITHUB";
  private static final String PERSONAL_ACCESS_TOKEN = "PERSONAL_ACCESS_TOKEN";

  private final CliTestConfig config;
  private final CliCommandRunner runner;
  private final CliInvocationBuilder invocationBuilder;
  private final String runId;
  private final List<Path> bodyFiles = new ArrayList<>();

  private Path bodyDirectory;
  private String createdCredentialKey;

  public GitCredentialFixture(
      CliTestConfig config,
      CliCommandRunner runner,
      CliInvocationBuilder invocationBuilder,
      String runId) {
    this.config = config;
    this.runner = runner;
    this.invocationBuilder = invocationBuilder;
    this.runId = runId;
  }

  public void requireConfigured(String context) {
    if (isBlankOrPlaceholder(repositoryUrl())
        || isBlankOrPlaceholder(branchName())
        || (isBlankOrPlaceholder(configuredCredentialKey())
            && (isBlankOrPlaceholder(username()) || isBlankOrPlaceholder(personalAccessToken())))) {
      throw new SkipException(
          "Skipping "
              + context
              + ". Configure cliWorkspaceGitRepositoryUrl, cliWorkspaceGitBranchName, and either "
              + "cliWorkspaceGitCredentialKey or cliWorkspaceGitUsername + "
              + "cliWorkspaceGitPersonalAccessToken.");
    }
  }

  public String repositoryUrl() {
    return config.value("cliWorkspaceGitRepositoryUrl", null);
  }

  public String branchName() {
    return config.value("cliWorkspaceGitBranchName", null);
  }

  public String providerKey() {
    String providerKey = config.value("cliWorkspaceGitProviderKey", null);
    return isBlankOrPlaceholder(providerKey) ? null : providerKey;
  }

  public String credentialKey() {
    String configuredCredentialKey = configuredCredentialKey();
    if (!isBlankOrPlaceholder(configuredCredentialKey)) {
      return configuredCredentialKey;
    }
    if (!isBlankOrPlaceholder(createdCredentialKey)) {
      return createdCredentialKey;
    }

    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "user-setting",
                    "create",
                    bodyFileArgument(
                        "create-git-credential-user-setting.json",
                        createGitCredentialUserSettingBody()))));
    assertStatus(response, 200);
    createdCredentialKey = requiredText(userSettingNode(response), "key");
    return createdCredentialKey;
  }

  public String createGitFolderBody(String folderPath, String description) {
    ObjectNode body = MAPPER.createObjectNode();
    body.put("folderPath", folderPath);
    String gitProviderKey = providerKey();
    if (gitProviderKey != null) {
      body.put("gitProviderKey", gitProviderKey);
    }
    body.put("gitRepositoryUrl", repositoryUrl());
    body.put("branchName", branchName());
    body.put("credentialKey", credentialKey());
    body.put("description", description);
    return writeJson(body);
  }

  public void deleteCreatedCredentialIfPresent() {
    if (isBlankOrPlaceholder(createdCredentialKey) || runner == null || invocationBuilder == null) {
      deleteBodyFiles();
      return;
    }

    CliTestLogger.info("CLEANUP", "Deleting Git credential user setting " + createdCredentialKey);
    CliCommandResult result =
        runner.run(invocationBuilder.command("user-setting", "delete", createdCredentialKey));
    if (result.exitCode() == 0) {
      assertStatusIn(responseJson(result), 204, 404);
      createdCredentialKey = null;
      deleteBodyFiles();
      return;
    }

    if (result.combinedOutput().contains("\"status\": 404")) {
      createdCredentialKey = null;
      deleteBodyFiles();
      return;
    }

    CliTestLogger.block(
        "CLEANUP",
        "Failed to delete Git credential user setting:",
        result.combinedOutput(),
        config.cliLogMaxCharacters());
    deleteBodyFiles();
  }

  private String configuredCredentialKey() {
    return config.value("cliWorkspaceGitCredentialKey", null);
  }

  private String username() {
    return config.value("cliWorkspaceGitUsername", null);
  }

  private String personalAccessToken() {
    return config.value("cliWorkspaceGitPersonalAccessToken", null);
  }

  private String providerName() {
    String providerName = config.value("cliWorkspaceGitProviderName", GITHUB);
    return isBlankOrPlaceholder(providerName) ? GITHUB : providerName;
  }

  private String credentialName() {
    String name = config.value("cliWorkspaceGitCredentialName", null);
    String baseName = isBlankOrPlaceholder(name) ? "IT_Git_Credential_CLI" : name;
    return baseName + "_" + runId;
  }

  private String createGitCredentialUserSettingBody() {
    ObjectNode body = MAPPER.createObjectNode();
    body.put("name", credentialName());
    body.put("isDefault", false);
    ObjectNode data = body.putObject("data");
    data.put("type", GIT_ACCOUNT);
    data.put("entityType", PERSONAL_ACCESS_TOKEN);
    data.put("providerName", providerName());
    data.put("username", username());
    data.put("personalAccessToken", personalAccessToken());
    return writeJson(body);
  }

  private String bodyFileArgument(String fileName, String body) {
    try {
      if (bodyDirectory == null) {
        bodyDirectory = Files.createTempDirectory("aidp-cli-git-credential-");
      }
      Path bodyFile = bodyDirectory.resolve(fileName);
      Files.writeString(bodyFile, body, StandardCharsets.UTF_8);
      bodyFiles.add(bodyFile);
      return "@" + bodyFile;
    } catch (IOException e) {
      throw new IllegalStateException("Failed to write Git credential CLI request body file.", e);
    }
  }

  private JsonNode userSettingNode(JsonNode response) {
    JsonNode responseData = data(response);
    if (!responseData.path("key").isMissingNode()) {
      return responseData;
    }
    JsonNode nested = firstExisting(responseData, "userSetting", "user_setting");
    if (!nested.isMissingNode()) {
      return nested;
    }
    return responseData;
  }

  private String writeJson(JsonNode node) {
    try {
      return MAPPER.writeValueAsString(node);
    } catch (IOException e) {
      throw new IllegalStateException("Failed to serialize Git fixture JSON body.", e);
    }
  }

  private void deleteBodyFiles() {
    for (Path bodyFile : bodyFiles) {
      try {
        Files.deleteIfExists(bodyFile);
      } catch (IOException e) {
        CliTestLogger.block(
            "CLEANUP",
            "Failed to delete Git fixture request body file:",
            bodyFile + ": " + e.getMessage(),
            config.cliLogMaxCharacters());
      }
    }
    bodyFiles.clear();

    if (bodyDirectory != null) {
      try {
        Files.deleteIfExists(bodyDirectory);
      } catch (IOException e) {
        CliTestLogger.block(
            "CLEANUP",
            "Failed to delete Git fixture request body directory:",
            bodyDirectory + ": " + e.getMessage(),
            config.cliLogMaxCharacters());
      }
      bodyDirectory = null;
    }
  }

  public static boolean isBlankOrPlaceholder(String value) {
    if (value == null || value.isBlank()) {
      return true;
    }
    String trimmed = value.trim();
    return trimmed.startsWith("<") && trimmed.endsWith(">");
  }
}
