package com.oracle.aidp.cli.invocation.credentials;

import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.assertStatus;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.assertStatusIn;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.assertSuccess;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.data;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.firstExisting;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.optionalText;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.requiredText;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.responseJson;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import com.fasterxml.jackson.databind.JsonNode;
import com.oracle.aidp.cli.invocation.config.CliTestConfig;
import com.oracle.aidp.cli.invocation.logging.CliTestLogger;
import com.oracle.aidp.cli.invocation.runner.CliCommandResult;
import com.oracle.aidp.cli.invocation.runner.CliCommandRunner;
import com.oracle.aidp.cli.invocation.runner.CliInvocationBuilder;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CredentialsRelValidationCliIT {
  private static final String GROUP_CLI_TESTS = "cli_tests";
  private static final String GROUP_CLI_CREDENTIALS = "cli_credentials";
  private static final String GROUP_CREDENTIALS = "credentials";
  private static final String GROUP_REL_VALIDATION = "rel_validation";

  private static final String CREDENTIAL_NAME_PREFIX = "IT_Credential_CLI_";
  private static final String UPDATED_DESCRIPTION = "Updated credential created by CLI rel validation.";
  private static final String SECRET_TOKEN = "SECRET_TOKEN";
  private static final Duration CREDENTIAL_READY_TIMEOUT = Duration.ofSeconds(30);
  private static final Duration POLL_INTERVAL = Duration.ofSeconds(2);

  private CliTestConfig config;
  private CliCommandRunner runner;
  private CliInvocationBuilder invocationBuilder;
  private Path bodyDirectory;
  private final List<Path> bodyFiles = new ArrayList<>();
  private String runId;
  private String credentialName;
  private String credentialKey;
  private boolean credentialDeleted;

  @BeforeClass(
      alwaysRun = true,
      groups = {GROUP_CLI_TESTS, GROUP_CLI_CREDENTIALS, GROUP_CREDENTIALS, GROUP_REL_VALIDATION})
  public void setUp() throws IOException {
    config = CliTestConfig.load();
    runner = new CliCommandRunner(config);
    invocationBuilder = new CliInvocationBuilder(config);
    runId = UUID.randomUUID().toString().replace("-", "");
    credentialName = CREDENTIAL_NAME_PREFIX + runId;
    bodyDirectory = Files.createTempDirectory("aidp-cli-credentials-");
  }

  @Test(groups = {GROUP_CLI_TESTS, GROUP_CLI_CREDENTIALS, GROUP_CREDENTIALS, GROUP_REL_VALIDATION})
  public void testCreateCredentialsCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "credentials",
                    "create",
                    bodyFileArgument(
                        "create-credential.json",
                        credentialBody(
                            credentialName,
                            "Credential created by CLI rel validation.",
                            "seed_" + runId)))));

    assertStatus(response, 200);
    String responseKey = optionalText(credentialNode(response), "key");
    credentialKey =
        responseKey == null
            ? waitForCredentialKeyByDisplayName(credentialName, CREDENTIAL_READY_TIMEOUT)
            : responseKey;
    JsonNode credential = credentialNode(getCredential(credentialKey));
    assertEquals(requiredText(credential, "key"), credentialKey);
    assertEquals(credentialDisplayName(credential), credentialName);
    assertEquals(credentialType(credential), SECRET_TOKEN);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_CREDENTIALS, GROUP_CREDENTIALS, GROUP_REL_VALIDATION},
      dependsOnMethods = "testCreateCredentialsCommand")
  public void testGetCredentialsCommand() {
    JsonNode response = getCredential(credentialKey);
    JsonNode credential = credentialNode(response);

    assertEquals(requiredText(credential, "key"), credentialKey);
    assertEquals(credentialDisplayName(credential), credentialName);
    assertEquals(credentialType(credential), SECRET_TOKEN);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_CREDENTIALS, GROUP_CREDENTIALS, GROUP_REL_VALIDATION},
      dependsOnMethods = "testGetCredentialsCommand")
  public void testListCredentialsCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.command(
                    "credentials",
                    "list",
                    "--display-name",
                    credentialName,
                    "--credential-type",
                    SECRET_TOKEN,
                    "--limit",
                    "10",
                    "--sort-order",
                    "ASC",
                    "--sort-by",
                    "timeCreated")));

    assertStatus(response, 200);
    assertTrue(
        credentialItems(response).stream()
            .anyMatch(item -> credentialKey.equals(optionalText(item, "key"))),
        "Created credential key " + credentialKey + " was not present in list response: " + response);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_CREDENTIALS, GROUP_CREDENTIALS, GROUP_REL_VALIDATION},
      dependsOnMethods = "testListCredentialsCommand")
  public void testUpdateCredentialsCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "credentials",
                    "update",
                    bodyFileArgument(
                        "update-credential.json",
                        credentialBody(credentialName, UPDATED_DESCRIPTION, "updated_" + runId)),
                    credentialKey)));

    assertStatus(response, 200);

    JsonNode getResponse = getCredential(credentialKey);
    JsonNode getCredential = credentialNode(getResponse);
    assertEquals(requiredText(getCredential, "key"), credentialKey);
    assertEquals(optionalText(getCredential, "credentialDescription", "credential_description"), UPDATED_DESCRIPTION);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_CREDENTIALS, GROUP_CREDENTIALS, GROUP_REL_VALIDATION},
      dependsOnMethods = "testUpdateCredentialsCommand")
  public void testDeleteCredentialsCommand() {
    JsonNode response =
        assertSuccess(runner.run(invocationBuilder.command("credentials", "delete", credentialKey)));
    assertStatus(response, 204);
    credentialDeleted = true;

    CliCommandResult getResult = runner.run(invocationBuilder.command("credentials", "get", credentialKey));
    JsonNode getResponse = responseJson(getResult);
    assertStatus(getResponse, 404);
  }

  @AfterClass(
      alwaysRun = true,
      groups = {GROUP_CLI_TESTS, GROUP_CLI_CREDENTIALS, GROUP_CREDENTIALS, GROUP_REL_VALIDATION})
  public void tearDown() {
    if (credentialKey != null && !credentialDeleted) {
      deleteCredentialIfPresent();
    }
    deleteBodyFiles();
  }

  private JsonNode getCredential(String key) {
    JsonNode response = assertSuccess(runner.run(invocationBuilder.command("credentials", "get", key)));
    assertStatus(response, 200);
    return response;
  }

  private void deleteCredentialIfPresent() {
    CliTestLogger.info("CLEANUP", "Deleting credential " + credentialKey);
    CliCommandResult result = runner.run(invocationBuilder.command("credentials", "delete", credentialKey));
    JsonNode response = responseJsonOrNull(result);
    if (response != null && hasStatus(response, 404)) {
      credentialDeleted = true;
      return;
    }
    if (result.exitCode() != 0) {
      CliTestLogger.block(
          "CLEANUP",
          "Failed to delete credential:",
          result.combinedOutput(),
          config.cliLogMaxCharacters());
      return;
    }
    assertStatusIn(responseJson(result), 204, 404);
    credentialDeleted = true;
  }

  private String waitForCredentialKeyByDisplayName(String displayName, Duration timeout) {
    long deadline = System.nanoTime() + timeout.toNanos();
    while (System.nanoTime() < deadline) {
      JsonNode response =
          assertSuccess(
              runner.run(
                  invocationBuilder.command(
                      "credentials",
                      "list",
                      "--display-name",
                      displayName,
                      "--credential-type",
                      SECRET_TOKEN,
                      "--limit",
                      "10")));
      assertStatus(response, 200);
      for (JsonNode item : credentialItems(response)) {
        if (displayName.equals(credentialDisplayName(item))) {
          return requiredText(item, "key");
        }
      }
      sleep();
    }
    throw new AssertionError("Credential with displayName " + displayName + " did not appear in list response.");
  }

  private String bodyFileArgument(String fileName, String body) {
    try {
      Path bodyFile = bodyDirectory.resolve(fileName);
      Files.writeString(bodyFile, body, StandardCharsets.UTF_8);
      bodyFiles.add(bodyFile);
      return "@" + bodyFile;
    } catch (IOException e) {
      throw new IllegalStateException("Failed to write credentials CLI request body file.", e);
    }
  }

  private String credentialBody(String name, String description, String secretValue) {
    return """
        {
          "displayName": "%s",
          "credentialDescription": "%s",
          "type": "%s",
          "credentialDetails": {
            "credentialType": "%s",
            "secretTokenPair": [
              {
                "secretKey": "API_KEY",
                "secretValue": "%s"
              }
            ]
          }
        }
        """
        .formatted(name, description, SECRET_TOKEN, SECRET_TOKEN, secretValue);
  }

  private JsonNode credentialNode(JsonNode response) {
    JsonNode responseData = data(response);
    if (!responseData.path("key").isMissingNode()) {
      return responseData;
    }
    JsonNode nested =
        firstExisting(responseData, "credential", "dataLakeCredential", "data_lake_credential");
    if (!nested.isMissingNode()) {
      return nested;
    }
    return responseData;
  }

  private List<JsonNode> credentialItems(JsonNode response) {
    JsonNode responseData = data(response);
    JsonNode items = responseData.path("items");
    if (!items.isArray()) {
      items = firstExisting(responseData, "credentialCollection", "credential_collection").path("items");
    }

    List<JsonNode> values = new ArrayList<>();
    if (items.isArray()) {
      items.forEach(values::add);
    }
    return values;
  }

  private String credentialDisplayName(JsonNode credential) {
    return requiredText(credential, "displayName", "display_name", "name");
  }

  private String credentialType(JsonNode credential) {
    return requiredText(credential, "type", "credentialType", "credential_type");
  }

  private boolean hasStatus(JsonNode response, int... acceptableStatuses) {
    int actual = response.path("status").asInt(-1);
    for (int status : acceptableStatuses) {
      if (actual == status) {
        return true;
      }
    }
    return false;
  }

  private JsonNode responseJsonOrNull(CliCommandResult result) {
    try {
      return responseJson(result);
    } catch (AssertionError e) {
      return null;
    }
  }

  private void deleteBodyFiles() {
    for (Path bodyFile : bodyFiles) {
      try {
        Files.deleteIfExists(bodyFile);
      } catch (IOException e) {
        CliTestLogger.info("CLEANUP", "Failed to delete body file " + bodyFile + ": " + e.getMessage());
      }
    }
    if (bodyDirectory != null) {
      try {
        Files.deleteIfExists(bodyDirectory);
      } catch (IOException e) {
        CliTestLogger.info("CLEANUP", "Failed to delete body directory " + bodyDirectory + ": " + e.getMessage());
      }
    }
  }

  private static void sleep() {
    try {
      Thread.sleep(POLL_INTERVAL.toMillis());
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new AssertionError("Interrupted while waiting for credential response.", e);
    }
  }
}
