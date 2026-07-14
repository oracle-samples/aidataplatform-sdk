package com.oracle.aidp.cli.invocation.role;

import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.assertStatus;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.assertStatusIn;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.optionalText;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.requiredText;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.responseJson;
import static com.oracle.aidp.cli.invocation.support.CliRelValidationSupport.collectionItems;
import static com.oracle.aidp.cli.invocation.support.CliRelValidationSupport.entity;
import static com.oracle.aidp.cli.invocation.support.CliRelValidationSupport.hasStatus;
import static com.oracle.aidp.cli.invocation.support.CliRelValidationSupport.responseJsonOrNull;
import static com.oracle.aidp.cli.invocation.support.CliRelValidationSupport.runStructured;
import static com.oracle.aidp.cli.invocation.support.CliRelValidationSupport.runStructuredWithBody;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import com.fasterxml.jackson.databind.JsonNode;
import com.oracle.aidp.cli.invocation.config.CliTestConfig;
import com.oracle.aidp.cli.invocation.logging.CliTestLogger;
import com.oracle.aidp.cli.invocation.runner.CliCommandResult;
import com.oracle.aidp.cli.invocation.runner.CliCommandRunner;
import com.oracle.aidp.cli.invocation.runner.CliInvocationBuilder;
import java.util.UUID;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RoleRelValidationCliIT {
  private static final String GROUP_CLI_TESTS = "cli_tests";
  private static final String GROUP_CLI_ROLE = "cli_role";
  private static final String GROUP_ROLE = "role";
  private static final String GROUP_REL_VALIDATION = "rel_validation";

  private CliTestConfig config;
  private CliCommandRunner runner;
  private CliInvocationBuilder invocationBuilder;
  private String roleDisplayName;
  private String updatedRoleDisplayName;
  private String roleKey;
  private boolean roleDeleted;
  private boolean memberAdded;

  @BeforeClass(
      alwaysRun = true,
      groups = {GROUP_CLI_TESTS, GROUP_CLI_ROLE, GROUP_ROLE, GROUP_REL_VALIDATION})
  public void setUp() {
    config = CliTestConfig.load();
    runner = new CliCommandRunner(config);
    invocationBuilder = new CliInvocationBuilder(config);
    String runId = UUID.randomUUID().toString().replace("-", "");
    roleDisplayName = config.roleNamePrefix() + runId;
    updatedRoleDisplayName = roleDisplayName + "_updated";
  }

  @Test(groups = {GROUP_CLI_TESTS, GROUP_CLI_ROLE, GROUP_ROLE, GROUP_REL_VALIDATION})
  public void testCreateRoleCommand() {
    JsonNode response =
        runStructuredWithBody(runner, invocationBuilder, "role", "create", createRoleBody());

    assertStatus(response, 200);
    JsonNode role = entity(response, "role");
    assertEquals(requiredText(role, "displayName", "display_name"), roleDisplayName);
    roleKey = requiredText(role, "key");
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_ROLE, GROUP_ROLE, GROUP_REL_VALIDATION},
      dependsOnMethods = "testCreateRoleCommand")
  public void testListRolesCommand() {
    JsonNode response =
        runStructured(
            runner,
            invocationBuilder,
            "role",
            "list",
            "--display-name",
            roleDisplayName,
            "--limit",
            "10",
            "--sort-order",
            "ASC",
            "--sort-by",
            "displayName");

    assertStatus(response, 200);
    assertTrue(
        collectionItems(response, "roleCollection").stream()
            .anyMatch(item -> roleKey.equals(optionalText(item, "key"))),
        "Created role was not present in list response: " + response);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_ROLE, GROUP_ROLE, GROUP_REL_VALIDATION},
      dependsOnMethods = "testListRolesCommand")
  public void testGetRoleCommand() {
    JsonNode response = runStructured(runner, invocationBuilder, "role", "get", roleKey);

    assertStatus(response, 200);
    JsonNode role = entity(response, "role");
    assertEquals(requiredText(role, "key"), roleKey);
    assertEquals(requiredText(role, "displayName", "display_name"), roleDisplayName);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_ROLE, GROUP_ROLE, GROUP_REL_VALIDATION},
      dependsOnMethods = "testGetRoleCommand")
  public void testListRolePermissionsCommand() {
    JsonNode response =
        runStructured(
            runner,
            invocationBuilder,
            "role",
            "list-permissions",
            roleKey,
            "--permission-scope",
            "ALL",
            "--limit",
            "10",
            "--sort-order",
            "ASC",
            "--sort-by",
            "displayName");

    assertStatus(response, 200);
    assertTrue(
        entity(response, "rolePermissionCollection").path("items").isArray()
            || collectionItems(response, "rolePermissionCollection").isEmpty(),
        "Role permissions response should expose a collection: " + response);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_ROLE, GROUP_ROLE, GROUP_REL_VALIDATION},
      dependsOnMethods = "testListRolePermissionsCommand")
  public void testUpdateRoleCommand() {
    JsonNode response =
        runStructuredWithBody(runner, invocationBuilder, "role", "update", updateRoleBody(), roleKey);

    assertStatus(response, 200);
    JsonNode role = entity(response, "role");
    assertEquals(requiredText(role, "displayName", "display_name"), updatedRoleDisplayName);
    roleKey = requiredText(role, "key");
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_ROLE, GROUP_ROLE, GROUP_REL_VALIDATION},
      dependsOnMethods = "testUpdateRoleCommand")
  public void testAddMemberToRoleCommand() {
    JsonNode response =
        runStructuredWithBody(runner, invocationBuilder, "role", "add-member", memberBody(), roleKey);

    assertStatusIn(response, 200, 202, 204);
    memberAdded = true;
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_ROLE, GROUP_ROLE, GROUP_REL_VALIDATION},
      dependsOnMethods = "testAddMemberToRoleCommand")
  public void testRemoveMemberFromRoleCommand() {
    JsonNode response =
        runStructuredWithBody(runner, invocationBuilder, "role", "remove-member", memberBody(), roleKey);

    assertStatusIn(response, 200, 202, 204);
    memberAdded = false;
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_ROLE, GROUP_ROLE, GROUP_REL_VALIDATION},
      dependsOnMethods = "testRemoveMemberFromRoleCommand")
  public void testDeleteRoleCommand() {
    JsonNode response = runStructured(runner, invocationBuilder, "role", "delete", roleKey);

    assertStatusIn(response, 200, 202, 204);
    roleDeleted = true;
  }

  @AfterClass(
      alwaysRun = true,
      groups = {GROUP_CLI_TESTS, GROUP_CLI_ROLE, GROUP_ROLE, GROUP_REL_VALIDATION})
  public void tearDown() {
    if (memberAdded && roleKey != null) {
      CliCommandResult result =
          runner.run(invocationBuilder.commandWithBody("role", "remove-member", memberBody(), roleKey));
      JsonNode response = responseJsonOrNull(result);
      if (response != null && !hasStatus(response, 404)) {
        assertEquals(result.exitCode(), 0, "Failed to remove role member during cleanup: " + result.combinedOutput());
      }
      memberAdded = false;
    }
    if (!roleDeleted && roleKey != null) {
      CliTestLogger.info("CLEANUP", "Deleting role " + roleKey);
      CliCommandResult result = runner.run(invocationBuilder.command("role", "delete", roleKey));
      JsonNode response = responseJsonOrNull(result);
      if (response != null && hasStatus(response, 404)) {
        roleDeleted = true;
        return;
      }
      if (result.exitCode() != 0) {
        responseJson(result);
      }
      roleDeleted = true;
    }
  }

  private String createRoleBody() {
    return """
        {
          "displayName": "%s",
          "description": "Role created by CLI rel validation."
        }
        """
        .formatted(roleDisplayName);
  }

  private String updateRoleBody() {
    return """
        {
          "displayName": "%s",
          "description": "Role updated by CLI rel validation."
        }
        """
        .formatted(updatedRoleDisplayName);
  }

  private String memberBody() {
    return """
        {
          "assignees": [
            {
              "target": "%s",
              "type": "%s"
            }
          ]
        }
        """
        .formatted(config.roleMemberTarget(), config.roleMemberAssigneeType());
  }
}
