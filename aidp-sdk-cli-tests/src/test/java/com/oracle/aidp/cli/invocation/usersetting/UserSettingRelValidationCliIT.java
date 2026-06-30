package com.oracle.aidp.cli.invocation.usersetting;

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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserSettingRelValidationCliIT {
  private static final String GROUP_CLI_TESTS = "cli_tests";
  private static final String GROUP_CLI_USER_SETTING = "cli_user_setting";
  private static final String GROUP_USER_SETTING = "user_setting";
  private static final String GROUP_REL_VALIDATION = "rel_validation";

  private static final String SETTING_NAME_PREFIX = "IT_User_Setting_CLI_";
  private static final String UPDATED_SETTING_NAME_PREFIX = "Updated_User_Setting_CLI_";
  private static final String GIT_ACCOUNT = "GIT_ACCOUNT";
  private static final String GITHUB = "GITHUB";
  private static final String PERSONAL_ACCESS_TOKEN = "PERSONAL_ACCESS_TOKEN";

  private CliTestConfig config;
  private CliCommandRunner runner;
  private CliInvocationBuilder invocationBuilder;
  private Path bodyDirectory;
  private final List<Path> bodyFiles = new ArrayList<>();
  private String runId;
  private String settingName;
  private String updatedSettingName;
  private String settingKey;
  private boolean settingDeleted;

  @BeforeClass(
      alwaysRun = true,
      groups = {GROUP_CLI_TESTS, GROUP_CLI_USER_SETTING, GROUP_USER_SETTING, GROUP_REL_VALIDATION})
  public void setUp() throws IOException {
    config = CliTestConfig.load();
    runner = new CliCommandRunner(config);
    invocationBuilder = new CliInvocationBuilder(config);
    runId = UUID.randomUUID().toString().replace("-", "");
    settingName = SETTING_NAME_PREFIX + runId;
    updatedSettingName = UPDATED_SETTING_NAME_PREFIX + runId;
    bodyDirectory = Files.createTempDirectory("aidp-cli-user-setting-");
  }

  @Test(groups = {GROUP_CLI_TESTS, GROUP_CLI_USER_SETTING, GROUP_USER_SETTING, GROUP_REL_VALIDATION})
  public void testCreateUserSettingCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "user-setting",
                    "create",
                    bodyFileArgument(
                        "create-user-setting.json",
                        userSettingBody(settingName, false, "create")))));

    assertStatus(response, 200);
    JsonNode setting = userSettingNode(response);
    settingKey = requiredText(setting, "key");
    assertEquals(settingName(setting), settingName);
    assertEquals(settingType(setting), GIT_ACCOUNT);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_USER_SETTING, GROUP_USER_SETTING, GROUP_REL_VALIDATION},
      dependsOnMethods = "testCreateUserSettingCommand")
  public void testGetUserSettingCommand() {
    JsonNode response =
        assertSuccess(runner.run(invocationBuilder.command("user-setting", "get", settingKey)));

    assertStatus(response, 200);
    JsonNode setting = userSettingNode(response);
    assertEquals(requiredText(setting, "key"), settingKey);
    assertEquals(settingName(setting), settingName);
    assertEquals(settingType(setting), GIT_ACCOUNT);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_USER_SETTING, GROUP_USER_SETTING, GROUP_REL_VALIDATION},
      dependsOnMethods = "testGetUserSettingCommand")
  public void testListUserSettingsCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.command(
                    "user-setting",
                    "list",
                    "--setting-type",
                    GIT_ACCOUNT,
                    "--display-name",
                    settingName,
                    "--limit",
                    "10",
                    "--sort-order",
                    "ASC",
                    "--sort-by",
                    "displayName")));

    assertStatus(response, 200);
    List<JsonNode> settings = userSettingItems(response);
    assertTrue(
        settings.stream().anyMatch(setting -> settingKey.equals(optionalText(setting, "key"))),
        "Created user setting key " + settingKey + " was not present in list response: " + response);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_USER_SETTING, GROUP_USER_SETTING, GROUP_REL_VALIDATION},
      dependsOnMethods = "testListUserSettingsCommand")
  public void testUpdateUserSettingCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "user-setting",
                    "update",
                    bodyFileArgument(
                        "update-user-setting.json",
                        userSettingBody(updatedSettingName, false, "update")),
                    settingKey)));

    assertStatus(response, 200);
    JsonNode setting = userSettingNode(response);
    assertEquals(requiredText(setting, "key"), settingKey);
    assertEquals(settingName(setting), updatedSettingName);
    assertEquals(settingType(setting), GIT_ACCOUNT);

    JsonNode getResponse =
        assertSuccess(runner.run(invocationBuilder.command("user-setting", "get", settingKey)));
    assertStatus(getResponse, 200);
    assertEquals(settingName(userSettingNode(getResponse)), updatedSettingName);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_USER_SETTING, GROUP_USER_SETTING, GROUP_REL_VALIDATION},
      dependsOnMethods = "testUpdateUserSettingCommand")
  public void testDeleteUserSettingCommand() {
    JsonNode response =
        assertSuccess(runner.run(invocationBuilder.command("user-setting", "delete", settingKey)));
    assertStatus(response, 204);
    settingDeleted = true;

    CliCommandResult getResult = runner.run(invocationBuilder.command("user-setting", "get", settingKey));
    JsonNode getResponse = responseJson(getResult);
    assertStatus(getResponse, 404);
  }

  @AfterClass(
      alwaysRun = true,
      groups = {GROUP_CLI_TESTS, GROUP_CLI_USER_SETTING, GROUP_USER_SETTING, GROUP_REL_VALIDATION})
  public void tearDown() {
    if (settingKey != null && !settingDeleted) {
      deleteUserSettingIfPresent();
    }
    deleteBodyFiles();
  }

  private void deleteUserSettingIfPresent() {
    CliTestLogger.info("CLEANUP", "Deleting user setting " + settingKey);
    CliCommandResult result = runner.run(invocationBuilder.command("user-setting", "delete", settingKey));
    if (result.exitCode() != 0 && !result.combinedOutput().contains("\"status\": 404")) {
      throw new AssertionError("Failed to delete user setting: " + result.combinedOutput());
    }
    if (result.exitCode() == 0) {
      assertStatusIn(responseJson(result), 204, 404);
    }
    settingDeleted = true;
  }

  private String bodyFileArgument(String fileName, String body) {
    try {
      Path bodyFile = bodyDirectory.resolve(fileName);
      Files.writeString(bodyFile, body, StandardCharsets.UTF_8);
      bodyFiles.add(bodyFile);
      return "@" + bodyFile;
    } catch (IOException e) {
      throw new IllegalStateException("Failed to write user-setting CLI request body file.", e);
    }
  }

  private String userSettingBody(String name, boolean isDefault, String tokenSuffix) {
    return """
        {
          "name": "%s",
          "isDefault": %s,
          "data": {
            "type": "%s",
            "entityType": "%s",
            "providerName": "%s",
            "username": "%s",
            "personalAccessToken": "%s"
          }
        }
        """
        .formatted(
            name,
            Boolean.toString(isDefault),
            GIT_ACCOUNT,
            PERSONAL_ACCESS_TOKEN,
            GITHUB,
            "cli_user_" + runId,
            "token_" + runId + "_" + tokenSuffix);
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

  private List<JsonNode> userSettingItems(JsonNode response) {
    JsonNode responseData = data(response);
    JsonNode items = responseData.path("items");
    if (!items.isArray()) {
      items = firstExisting(responseData, "userSettingCollection", "user_setting_collection").path("items");
    }

    List<JsonNode> values = new ArrayList<>();
    if (items.isArray()) {
      items.forEach(values::add);
    }
    return values;
  }

  private String settingName(JsonNode setting) {
    return requiredText(setting, "name", "displayName", "display_name");
  }

  private String settingType(JsonNode setting) {
    String type = optionalText(setting.path("data"), "type");
    if (type != null) {
      return type;
    }
    return requiredText(setting, "type", "settingType", "setting_type");
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
}
