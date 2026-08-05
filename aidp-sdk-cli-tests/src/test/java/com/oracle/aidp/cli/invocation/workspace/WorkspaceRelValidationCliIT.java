package com.oracle.aidp.cli.invocation.workspace;

import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.assertStatus;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.assertStatusIn;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.assertSuccess;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.data;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.firstExisting;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.items;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.optionalText;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.requiredText;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import com.fasterxml.jackson.databind.JsonNode;
import com.oracle.aidp.cli.invocation.config.CliTestConfig;
import com.oracle.aidp.cli.invocation.fixture.GitCredentialFixture;
import com.oracle.aidp.cli.invocation.logging.CliTestLogger;
import com.oracle.aidp.cli.invocation.runner.CliCommandResult;
import com.oracle.aidp.cli.invocation.runner.CliCommandRunner;
import com.oracle.aidp.cli.invocation.runner.CliInvocationBuilder;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WorkspaceRelValidationCliIT {
  private static final String WORKSPACE_NAME_PREFIX = "IT_Workspace_CLI_";
  private static final String UPDATED_WORKSPACE_NAME_PREFIX = "Updated_Display_Name_CLI_";
  private static final Duration WORKSPACE_READY_TIMEOUT = Duration.ofMinutes(10);
  private static final Duration WORKSPACE_DELETE_TIMEOUT = Duration.ofMinutes(10);
  private static final Duration CREATE_PERMISSION_READY_TIMEOUT = Duration.ofMinutes(2);

  private CliTestConfig config;
  private CliCommandRunner runner;
  private CliInvocationBuilder invocationBuilder;
  private GitCredentialFixture gitCredentialFixture;
  private String displayName;
  private String newDisplayName;
  private String workspaceKey;
  private String workspaceCreateAsyncOperationKey;
  private int permissionCount;
  private boolean createWorkspacePermissionAssignedByTest;

  @BeforeClass(
      alwaysRun = true,
      groups = {"cli_tests", "cli_workspace", "workspace", "rel_validation"})
  public void setUp() {
    config = CliTestConfig.load();
    runner = new CliCommandRunner(config);
    invocationBuilder = new CliInvocationBuilder(config);
    gitCredentialFixture =
        new GitCredentialFixture(
            config, runner, invocationBuilder, UUID.randomUUID().toString().replace("-", ""));
  }

  @Test(groups = {"cli_tests", "cli_workspace", "workspace", "rel_validation"})
  public void testCreateWorkspace() {
    displayName = WORKSPACE_NAME_PREFIX + UUID.randomUUID();
    String body =
        """
        {
          "displayName": "%s",
          "description": "%s",
          "defaultCatalogKey": "default"
        }
        """
            .formatted(displayName, displayName);

    JsonNode response =
        assertSuccess(
            runner.run(invocationBuilder.commandWithBody("workspace", "create", body)));
    assertStatus(response, 201);
    workspaceKey = extractWorkspaceKey(response);
    workspaceCreateAsyncOperationKey = extractAsyncOperationKey(response);
    waitForWorkspaceLifecycleState(workspaceKey, "ACTIVE", WORKSPACE_READY_TIMEOUT);
  }

  @Test(
      groups = {"cli_tests", "cli_workspace", "workspace", "rel_validation"},
      dependsOnMethods = {"testCreateWorkspace"})
  public void testGetWorkspaceCreateAsyncOperation() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.command(
                    "async-operations", "get", workspaceCreateAsyncOperationKey)));
    assertStatus(response, 200);

    JsonNode asyncOperation = asyncOperationNode(response);
    assertEquals(requiredText(asyncOperation, "key"), workspaceCreateAsyncOperationKey);
    assertEquals(requiredText(asyncOperation, "resourceType", "resource_type"), "WORKSPACE");
    assertTrue(
        matchesCurrentWorkspaceAsyncOperation(asyncOperation),
        "Async operation should reference workspace "
            + workspaceKey
            + " or display name "
            + displayName
            + ": "
            + asyncOperation);
    String status = requiredText(asyncOperation, "status");
    assertFalse(
        "FAILED".equalsIgnoreCase(status),
        "Workspace create async operation should not be failed: " + asyncOperation);
  }

  @Test(
      groups = {"cli_tests", "cli_workspace", "workspace", "rel_validation"},
      dependsOnMethods = {"testGetWorkspaceCreateAsyncOperation"})
  public void testListAsyncOperations() {
    JsonNode response = listWorkspaceAsyncOperations(workspaceKey);

    assertStatus(response, 200);
    if (items(response).stream().anyMatch(this::matchesCurrentWorkspaceAsyncOperation)) {
      return;
    }

    JsonNode recentResponse =
        assertSuccess(
            runner.run(
                invocationBuilder.command(
                    "async-operations",
                    "list",
                    "--resource-type",
                    "WORKSPACE",
                    "--limit",
                    "25",
                    "--sort-order",
                    "DESC",
                    "--sort-by",
                    "timeStarted")));

    assertStatus(recentResponse, 200);
    assertTrue(
        items(recentResponse).stream().anyMatch(this::matchesCurrentWorkspaceAsyncOperation),
        "Expected async operation for workspace "
            + workspaceKey
            + " with display name "
            + displayName
            + ". The workspace-key resource-name query returned no matching item.");
  }

  @Test(
      groups = {"cli_tests", "cli_workspace", "workspace", "rel_validation"},
      dependsOnMethods = {"testGetWorkspaceCreateAsyncOperation"})
  public void testUpdateAsyncOperationStatusCommand() {
    String body =
        """
        {
          "state": "NETWORK_CONFIGURATION_CREATED",
          "stateMessage": "network configuration created by CLI rel validation",
          "externalId": "%s",
          "properties": {
            "source": "workspace-cli-rel-validation"
          }
        }
        """
            .formatted(workspaceKey);

    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "workspace",
                    "update-async-operation-status",
                    body,
                    workspaceKey,
                    workspaceCreateAsyncOperationKey)));

    assertStatus(response, 202);
    assertEquals(requiredText(data(response), "key"), workspaceKey);
  }

  @Test(
      groups = {"cli_tests", "cli_workspace", "workspace", "rel_validation"},
      dependsOnMethods = {"testCreateWorkspace"})
  public void getWorkspaceTest() {
    JsonNode response = getWorkspace(workspaceKey);
    assertStatus(response, 200);
    String actualKey = requiredText(data(response), "key");
    assertEquals(actualKey, workspaceKey);

    String privateNetworkEnabled =
        optionalText(data(response), "isPrivateNetworkEnabled", "is_private_network_enabled");
    if (privateNetworkEnabled != null) {
      assertEquals(privateNetworkEnabled, "false");
    }
  }

  @Test(
      groups = {"cli_tests", "cli_workspace", "workspace", "rel_validation"},
      dependsOnMethods = {"testCreateWorkspace"})
  public void listWorkspacesTest() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.command(
                    "workspace",
                    "list",
                    "--lifecycle-state",
                    "ACTIVE",
                    "--limit",
                    "10",
                    "--sort-order",
                    "ASC",
                    "--sort-by",
                    "displayName")));

    assertStatus(response, 200);
    assertFalse(items(response).isEmpty(), "Workspace list should contain at least one item.");
  }

  @Test(
      groups = {"cli_tests", "cli_workspace", "workspace", "rel_validation"},
      dependsOnMethods = {"testCreateWorkspace"})
  public void listWorkspacesDisplayNameTest() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.command(
                    "workspace",
                    "list",
                    "--lifecycle-state",
                    "ACTIVE",
                    "--display-name",
                    displayName,
                    "--limit",
                    "10",
                    "--sort-order",
                    "ASC",
                    "--sort-by",
                    "displayName")));

    assertStatus(response, 200);
    List<JsonNode> workspaces = items(response);
    assertEquals(workspaces.size(), 1, "Display-name filter should return exactly one workspace.");
    assertEquals(workspaceDisplayName(workspaces.get(0)), displayName);
  }

  @Test(
      groups = {"cli_tests", "cli_workspace", "workspace", "rel_validation"},
      dependsOnMethods = {"testCreateWorkspace"})
  public void listWorkspacesDisplayNameContainsTest() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.command(
                    "workspace",
                    "list",
                    "--display-name-contains",
                    WORKSPACE_NAME_PREFIX,
                    "--limit",
                    "10",
                    "--sort-order",
                    "ASC",
                    "--sort-by",
                    "displayName")));

    assertStatus(response, 200);
    assertFalse(items(response).isEmpty(), "Display-name-contains filter returned no workspaces.");
  }

  @Test(
      groups = {"cli_tests", "cli_workspace", "workspace", "rel_validation"},
      dependsOnMethods = {"listWorkspacesTest"})
  public void updateWorkspaceDisplayNameTest() {
    newDisplayName = UPDATED_WORKSPACE_NAME_PREFIX + System.currentTimeMillis();
    String body = "{ \"displayName\": \"" + newDisplayName + "\" }";

    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody("workspace", "update", body, workspaceKey)));
    assertStatus(response, 202);
    assertEquals(workspaceDisplayName(data(response)), newDisplayName);
    waitForWorkspaceLifecycleState(workspaceKey, "ACTIVE", WORKSPACE_READY_TIMEOUT);
  }

  @Test(
      groups = {"cli_tests", "cli_workspace", "workspace", "rel_validation"},
      dependsOnMethods = {"updateWorkspaceDisplayNameTest"})
  public void updateWorkspaceDescriptionTest() {
    String newDescription = "Updated description for CLI rel validation.";
    String body = "{ \"description\": \"" + newDescription + "\" }";

    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody("workspace", "update", body, workspaceKey)));
    assertStatus(response, 202);
    assertEquals(
        requiredText(data(response), "description"),
        newDescription,
        "Description should be updated.");
    waitForWorkspaceLifecycleState(workspaceKey, "ACTIVE", WORKSPACE_READY_TIMEOUT);
  }

  @Test(
      groups = {"cli_tests", "cli_workspace", "workspace", "rel_validation"},
      dependsOnMethods = {"testCreateWorkspace"})
  public void listWorkspacesWithPaginationTest() {
    int limit = 2;
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.command(
                    "workspace",
                    "list",
                    "--lifecycle-state",
                    "ACTIVE",
                    "--limit",
                    Integer.toString(limit),
                    "--sort-order",
                    "ASC",
                    "--sort-by",
                    "timeCreated")));

    assertStatus(response, 200);
    assertTrue(items(response).size() <= limit, "Workspace list size should not exceed limit.");
  }

  @Test(
      groups = {"cli_tests", "cli_workspace", "workspace", "rel_validation"},
      dependsOnMethods = {"testCreateWorkspace"})
  public void listWorkspacePermissionsTest() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.command("workspace", "list-permissions", workspaceKey)));

    assertStatus(response, 200);
    permissionCount = items(response).size();
  }

  @Test(
      groups = {"cli_tests", "cli_workspace", "workspace", "rel_validation"},
      dependsOnMethods = {"testCreateWorkspace"})
  public void testListCreateWorkspacePermissionsCommand() {
    JsonNode response = listCreateWorkspacePermissions();

    assertStatus(response, 200);
    assertTrue(
        createWorkspacePermissionItems(response).size() <= 10,
        "Create workspace permissions list size should not exceed the requested limit.");
  }

  @Test(
      groups = {"cli_tests", "cli_workspace", "workspace", "rel_validation"},
      dependsOnMethods = {"testListCreateWorkspacePermissionsCommand"})
  public void testManageCreateWorkspacePermissionCommand() {
    String target = config.createWorkspacePermissionTarget();
    boolean targetHadPermission =
        createWorkspacePermissionItems(listCreateWorkspacePermissions()).stream()
            .anyMatch(item -> matchesCreateWorkspacePermissionTarget(item, target));

    JsonNode assignResponse =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "workspace", "manage-create-permission", assignCreateWorkspacePermissionBody(target))));
    assertStatusIn(assignResponse, 200, 202, 204);
    createWorkspacePermissionAssignedByTest = !targetHadPermission;

    waitForCreateWorkspacePermissionTarget(target, true, CREATE_PERMISSION_READY_TIMEOUT);

    if (!targetHadPermission) {
      JsonNode revokeResponse =
          assertSuccess(
              runner.run(
                  invocationBuilder.commandWithBody(
                      "workspace",
                      "manage-create-permission",
                      revokeCreateWorkspacePermissionBody(target))));
      assertStatusIn(revokeResponse, 200, 202, 204);
      createWorkspacePermissionAssignedByTest = false;
      waitForCreateWorkspacePermissionTarget(target, false, CREATE_PERMISSION_READY_TIMEOUT);
    }
  }

  @Test(
      groups = {"cli_tests", "cli_workspace", "workspace", "rel_validation"},
      dependsOnMethods = {"listWorkspacePermissionsTest"})
  public void manageWorkspacePermissionTest() {
    String body =
        """
        {
          "assignWorkspacePermissionDetails": {
            "assignees": {
              "type": "USER",
              "targets": ["%s"]
            },
            "permissions": ["USER"]
          }
        }
        """
            .formatted(config.workspacePermissionTarget());

    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "workspace", "manage-permission", body, workspaceKey)));
    assertStatusIn(response, 200, 202, 204);

    JsonNode permissions =
        assertSuccess(
            runner.run(
                invocationBuilder.command("workspace", "list-permissions", workspaceKey)));
    assertStatus(permissions, 200);
    assertTrue(
        items(permissions).size() >= permissionCount,
        "Workspace permission count should not shrink after assign.");
  }

  @Test(
      groups = {"cli_tests", "cli_workspace", "workspace", "rel_validation"},
      dependsOnMethods = {"manageWorkspacePermissionTest"})
  public void revokeWorkspacePermissionToRoleTest() {
    String body =
        """
        {
          "revokeWorkspacePermissionDetails": {
            "assignees": {
              "type": "USER",
              "targets": ["%s"]
            },
            "permissions": ["USER"]
          }
        }
        """
            .formatted(config.workspacePermissionTarget());

    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "workspace", "manage-permission", body, workspaceKey)));
    assertStatusIn(response, 200, 202, 204);

    JsonNode permissions =
        assertSuccess(
            runner.run(
                invocationBuilder.command("workspace", "list-permissions", workspaceKey)));
    assertStatus(permissions, 200);
    assertTrue(
        items(permissions).size() <= permissionCount,
        "Workspace permission count should return to its original size after revoke.");
  }

  @Test(
      groups = {"cli_tests", "cli_workspace", "workspace", "rel_validation"},
      dependsOnMethods = {"manageWorkspacePermissionTest"})
  public void listWorkspacesWithSortingTest() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.command(
                    "workspace",
                    "list",
                    "--lifecycle-state",
                    "ACTIVE",
                    "--sort-order",
                    "ASC",
                    "--sort-by",
                    "displayName")));

    assertStatus(response, 200);
    List<String> displayNames = items(response).stream().map(this::workspaceDisplayName).toList();
    List<String> sorted = displayNames.stream().sorted(Comparator.naturalOrder()).toList();
    assertEquals(displayNames, sorted, "Workspaces should be sorted by display name ascending.");
  }

  @Test(
      groups = {"cli_tests", "cli_workspace", "workspace", "rel_validation"},
      dependsOnMethods = {"updateWorkspaceDisplayNameTest"})
  public void testNotificationOnWorkspaceCreation() {
    CliTestLogger.info(
        "TEST",
        "WorkspaceResourceIT notification validation has no equivalent public AIDP CLI command yet.");
  }

  @Test(
      groups = {"cli_tests", "cli_workspace", "workspace", "rel_validation"},
      dependsOnMethods = {"testCreateWorkspace"})
  public void testCreateGitFolderCommand() {
    gitCredentialFixture.requireConfigured("workspace create-git-folder test");
    String gitFolderPath = "cli_git_" + System.currentTimeMillis();

    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "workspace",
                    "create-git-folder",
                    gitCredentialFixture.createGitFolderBody(
                        gitFolderPath, "Git folder created by CLI rel validation."),
                    workspaceKey)));

    assertStatusIn(response, 200, 202);
    JsonNode gitFolder = data(response);
    assertEquals(requiredText(gitFolder, "folderPath", "folder_path"), gitFolderPath);
    assertTrue(
        optionalText(
                response.path("headers"),
                "datalake-async-operation-key",
                "aidp-async-operation-key",
                "oidl-async-operation-key")
            != null,
        "Create git folder response should include an async operation key.");
  }

  @AfterClass(
      alwaysRun = true,
      groups = {"cli_tests", "cli_workspace", "workspace", "rel_validation"})
  public void deleteWorkspaceTest() {
    try {
      revokeCreateWorkspacePermissionIfAssigned();
    } finally {
      try {
        if (workspaceKey == null || workspaceKey.isBlank()) {
          return;
        }

        CliCommandResult result =
            runner.run(invocationBuilder.command("workspace", "delete", workspaceKey));
        if (result.exitCode() != 0) {
          throw new AssertionError(
              "Failed to delete workspace "
                  + workspaceKey
                  + "\nSTDOUT:\n"
                  + result.stdout()
                  + "\nSTDERR:\n"
                  + result.stderr());
        }
        JsonNode response = assertSuccess(result);
        assertStatus(response, 204);
        waitForWorkspaceDeleted(workspaceKey, WORKSPACE_DELETE_TIMEOUT);
      } finally {
        if (gitCredentialFixture != null) {
          gitCredentialFixture.deleteCreatedCredentialIfPresent();
        }
      }
    }
  }

  private JsonNode getWorkspace(String key) {
    JsonNode response =
        assertSuccess(runner.run(invocationBuilder.command("workspace", "get", key)));
    assertStatus(response, 200);
    return response;
  }

  private JsonNode listWorkspaceAsyncOperations(String resourceName) {
    return assertSuccess(
        runner.run(
            invocationBuilder.command(
                "async-operations",
                "list",
                "--resource-type",
                "WORKSPACE",
                "--resource-name",
                resourceName,
                "--limit",
                "10")));
  }

  private JsonNode listCreateWorkspacePermissions() {
    return assertSuccess(
        runner.run(
            invocationBuilder.command(
                "workspace",
                "list-create-permissions",
                "--limit",
                "10",
                "--sort-order",
                "ASC",
                "--sort-by",
                "granteeName")));
  }

  private List<JsonNode> createWorkspacePermissionItems(JsonNode response) {
    JsonNode responseData = data(response);
    JsonNode responseItems = responseData.path("items");
    if (!responseItems.isArray()) {
      responseItems =
          firstExisting(
                  responseData,
                  "createWorkspacePermissionCollection",
                  "create_workspace_permission_collection")
              .path("items");
    }
    if (!responseItems.isArray()) {
      return List.of();
    }
    List<JsonNode> values = new ArrayList<>();
    responseItems.forEach(values::add);
    return values;
  }

  private boolean matchesCreateWorkspacePermissionTarget(JsonNode item, String target) {
    return target.equals(optionalText(item, "grantee", "granteeId", "grantee_id"));
  }

  private String assignCreateWorkspacePermissionBody(String target) {
    return """
        {
          "assignCreateWorkspacePermissionDetails": {
            "assignees": {
              "type": "USER",
              "targets": ["%s"]
            }
          }
        }
        """
        .formatted(target);
  }

  private String revokeCreateWorkspacePermissionBody(String target) {
    return """
        {
          "revokeCreateWorkspacePermissionDetails": {
            "assignees": {
              "type": "USER",
              "targets": ["%s"]
            }
          }
        }
        """
        .formatted(target);
  }

  private void waitForCreateWorkspacePermissionTarget(
      String target, boolean expectedPresent, Duration timeout) {
    long deadline = System.nanoTime() + timeout.toNanos();
    while (System.nanoTime() < deadline) {
      boolean present =
          createWorkspacePermissionItems(listCreateWorkspacePermissions()).stream()
              .anyMatch(item -> matchesCreateWorkspacePermissionTarget(item, target));
      if (present == expectedPresent) {
        return;
      }
      sleep();
    }
    throw new AssertionError(
        "Create workspace permission target "
            + target
            + " did not reach expected presence="
            + expectedPresent);
  }

  private void revokeCreateWorkspacePermissionIfAssigned() {
    if (!createWorkspacePermissionAssignedByTest || runner == null || config == null) {
      return;
    }

    String target = config.createWorkspacePermissionTarget();
    CliTestLogger.info("CLEANUP", "Revoking create workspace permission for " + target);
    CliCommandResult result =
        runner.run(
            invocationBuilder.commandWithBody(
                "workspace", "manage-create-permission", revokeCreateWorkspacePermissionBody(target)));
    if (result.exitCode() == 0) {
      createWorkspacePermissionAssignedByTest = false;
      return;
    }

    CliTestLogger.block(
        "CLEANUP",
        "Failed to revoke create workspace permission:",
        result.combinedOutput(),
        config.cliLogMaxCharacters());
  }

  private boolean matchesCurrentWorkspaceAsyncOperation(JsonNode asyncOperation) {
    String resourceName = optionalText(asyncOperation, "resourceName", "resource_name");
    String resourceDisplayName =
        optionalText(asyncOperation, "resourceDisplayName", "resource_display_name");

    if (workspaceKey.equals(resourceName)) {
      return true;
    }
    if (displayName.equals(resourceDisplayName)) {
      return true;
    }
    if (newDisplayName != null && newDisplayName.equals(resourceDisplayName)) {
      return true;
    }

    String createResourceNamePrefix = createApiResourceNamePrefix(displayName);
    return resourceName != null
        && !createResourceNamePrefix.isBlank()
        && resourceName.toLowerCase(Locale.ROOT).startsWith(createResourceNamePrefix);
  }

  private static String createApiResourceNamePrefix(String value) {
    if (value == null || value.isBlank()) {
      return "";
    }
    return value.toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9]", "_");
  }

  private String extractWorkspaceKey(JsonNode response) {
    JsonNode responseData = data(response);
    String key = optionalText(responseData, "key");
    if (key != null) {
      return key;
    }
    return requiredText(firstExisting(responseData, "workspace"), "key");
  }

  private String extractAsyncOperationKey(JsonNode response) {
    return requiredText(
        response.path("headers"),
        "datalake-async-operation-key",
        "aidp-async-operation-key",
        "oidl-async-operation-key");
  }

  private JsonNode asyncOperationNode(JsonNode response) {
    JsonNode responseData = data(response);
    if (!responseData.path("key").isMissingNode()) {
      return responseData;
    }
    JsonNode nested = firstExisting(responseData, "asyncOperation", "async_operation");
    if (!nested.isMissingNode()) {
      return nested;
    }
    return responseData;
  }

  private String workspaceDisplayName(JsonNode workspaceNode) {
    return requiredText(workspaceNode, "displayName", "display_name");
  }

  private void waitForWorkspaceLifecycleState(String key, String expectedState, Duration timeout) {
    long deadline = System.nanoTime() + timeout.toNanos();
    AssertionError lastError = null;
    while (System.nanoTime() < deadline) {
      try {
        JsonNode workspace = data(getWorkspace(key));
        String state = optionalText(workspace, "lifecycleState", "lifecycle_state");
        if (expectedState.equalsIgnoreCase(state)) {
          return;
        }
      } catch (AssertionError e) {
        lastError = e;
      }
      sleep();
    }
    if (lastError != null) {
      throw lastError;
    }
    throw new AssertionError("Workspace " + key + " did not reach state " + expectedState);
  }

  private void waitForWorkspaceDeleted(String key, Duration timeout) {
    long deadline = System.nanoTime() + timeout.toNanos();
    while (System.nanoTime() < deadline) {
      CliCommandResult result = runner.run(invocationBuilder.command("workspace", "get", key));
      if (result.exitCode() != 0 && result.combinedOutput().contains("\"status\": 404")) {
        return;
      }
      sleep();
    }
    throw new AssertionError("Workspace " + key + " was not deleted within " + timeout);
  }

  private static void sleep() {
    try {
      Thread.sleep(Duration.ofSeconds(15).toMillis());
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new RuntimeException("Interrupted while waiting for workspace state", e);
    }
  }

  private static boolean isBlank(String value) {
    return value == null || value.isBlank();
  }
}
