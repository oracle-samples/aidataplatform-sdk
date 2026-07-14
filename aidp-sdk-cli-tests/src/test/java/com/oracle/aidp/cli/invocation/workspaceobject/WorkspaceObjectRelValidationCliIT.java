package com.oracle.aidp.cli.invocation.workspaceobject;

import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.assertStatus;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.assertStatusIn;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.assertSuccess;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.data;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.firstExisting;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.optionalText;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.requiredText;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.responseJson;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import com.fasterxml.jackson.databind.JsonNode;
import com.oracle.aidp.cli.invocation.config.CliTestConfig;
import com.oracle.aidp.cli.invocation.logging.CliTestLogger;
import com.oracle.aidp.cli.invocation.runner.CliCommandResult;
import com.oracle.aidp.cli.invocation.runner.CliCommandRunner;
import com.oracle.aidp.cli.invocation.runner.CliInvocationBuilder;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WorkspaceObjectRelValidationCliIT {
  private static final String GROUP_CLI_TESTS = "cli_tests";
  private static final String GROUP_CLI_WORKSPACE_OBJECT = "cli_workspace_object";
  private static final String GROUP_WORKSPACE_OBJECT = "workspace_object";
  private static final String GROUP_REL_VALIDATION = "rel_validation";

  private static final String WORKSPACE_NAME_PREFIX = "IT_Workspace_Object_CLI_";
  private static final Duration WORKSPACE_READY_TIMEOUT = Duration.ofMinutes(10);
  private static final Duration WORKSPACE_DELETE_TIMEOUT = Duration.ofMinutes(10);
  private static final Duration PERMISSION_READY_TIMEOUT = Duration.ofMinutes(2);
  private static final Duration OBJECT_DELETE_TIMEOUT = Duration.ofMinutes(2);
  private static final Duration POLL_INTERVAL = Duration.ofSeconds(15);

  private CliTestConfig config;
  private CliCommandRunner runner;
  private CliInvocationBuilder invocationBuilder;
  private String runId;
  private String workspaceKey;
  private String workspaceDisplayName;
  private String objectPrefix;
  private String primaryPath;
  private String primaryObjectKey;
  private String copyPath;
  private String moveTargetFolderPath;
  private String movedPath;
  private String renamedPath;
  private boolean objectPermissionAssignedByTest;
  private final Set<String> createdObjectPaths = new LinkedHashSet<>();

  @BeforeClass(
      alwaysRun = true,
      groups = {
        GROUP_CLI_TESTS,
        GROUP_CLI_WORKSPACE_OBJECT,
        GROUP_WORKSPACE_OBJECT,
        GROUP_REL_VALIDATION
      })
  public void setUp() {
    config = CliTestConfig.load();
    runner = new CliCommandRunner(config);
    invocationBuilder = new CliInvocationBuilder(config);
    runId = UUID.randomUUID().toString().replace("-", "");
    workspaceDisplayName = WORKSPACE_NAME_PREFIX + runId;
    objectPrefix = "workspace_object_cli_" + runId;
    primaryPath = objectPrefix + "_primary.txt";
    copyPath = objectPrefix + "_copy.txt";
    moveTargetFolderPath = objectPrefix + "_moved_folder";
    movedPath = objectPrefix + "_moved.txt";
    renamedPath = objectPrefix + "_renamed.txt";

    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "workspace", "create", createWorkspaceBody(workspaceDisplayName))));
    assertStatus(response, 201);
    workspaceKey = extractWorkspaceKey(response);
    waitForWorkspaceLifecycleState(workspaceKey, "ACTIVE", WORKSPACE_READY_TIMEOUT);
  }

  @Test(
      groups = {
        GROUP_CLI_TESTS,
        GROUP_CLI_WORKSPACE_OBJECT,
        GROUP_WORKSPACE_OBJECT,
        GROUP_REL_VALIDATION
      })
  public void testCreateWorkspaceObjectCommand() {
    createFileObject(primaryPath, "seed content for " + primaryPath, "Primary CLI file");

    primaryObjectKey = primaryPath;
    JsonNode getResponse = getWorkspaceObject(primaryPath);
    assertStatus(getResponse, 200);
    assertFalse(primaryObjectKey.isBlank(), "Created workspace object key should not be blank.");
  }

  @Test(
      groups = {
        GROUP_CLI_TESTS,
        GROUP_CLI_WORKSPACE_OBJECT,
        GROUP_WORKSPACE_OBJECT,
        GROUP_REL_VALIDATION
      },
      dependsOnMethods = "testCreateWorkspaceObjectCommand")
  public void testGetWorkspaceObjectCommand() {
    JsonNode response = getWorkspaceObject(primaryPath);

    assertStatus(response, 200);
    assertTrue(data(response).isArray(), "Get should return the file stream body: " + response);
  }

  @Test(
      groups = {
        GROUP_CLI_TESTS,
        GROUP_CLI_WORKSPACE_OBJECT,
        GROUP_WORKSPACE_OBJECT,
        GROUP_REL_VALIDATION
      },
      dependsOnMethods = "testCreateWorkspaceObjectCommand")
  public void testHeadWorkspaceObjectCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.command(
                    "workspace-object",
                    "head",
                    workspaceKey,
                    primaryPath,
                    "--should-include-metadata=true")));

    assertStatusIn(response, 200, 204);
    assertFalse(response.path("headers").isMissingNode(), "Head should return response headers.");
  }

  @Test(
      groups = {
        GROUP_CLI_TESTS,
        GROUP_CLI_WORKSPACE_OBJECT,
        GROUP_WORKSPACE_OBJECT,
        GROUP_REL_VALIDATION
      },
      dependsOnMethods = "testCreateWorkspaceObjectCommand")
  public void testListWorkspaceObjectsCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.command(
                    "workspace-object",
                    "list",
                    workspaceKey,
                    "--path",
                    "/",
                    "--type",
                    "FILE",
                    "--limit",
                    "25",
                    "--sort-order",
                    "ASC",
                    "--sort-by",
                    "displayName")));

    assertStatus(response, 200);
    assertTrue(
        workspaceObjectItems(response).stream().anyMatch(item -> objectPathMatches(item, primaryPath)),
        "Workspace object list should include " + primaryPath + ": " + response);
  }

  @Test(
      groups = {
        GROUP_CLI_TESTS,
        GROUP_CLI_WORKSPACE_OBJECT,
        GROUP_WORKSPACE_OBJECT,
        GROUP_REL_VALIDATION
      },
      dependsOnMethods = "testCreateWorkspaceObjectCommand")
  public void testUpdateWorkspaceObjectCommand() {
    String updatedDescription = "Updated by workspace-object CLI rel validation";
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "workspace-object",
                    "update",
                    "updated content for " + primaryPath,
                    workspaceKey,
                    primaryPath,
                    "--object-description",
                    updatedDescription)));

    assertStatus(response, 200);
    assertStatus(getWorkspaceObject(primaryPath), 200);
  }

  @Test(
      groups = {
        GROUP_CLI_TESTS,
        GROUP_CLI_WORKSPACE_OBJECT,
        GROUP_WORKSPACE_OBJECT,
        GROUP_REL_VALIDATION
      },
      dependsOnMethods = "testCreateWorkspaceObjectCommand")
  public void testListWorkspaceObjectPermissionsCommand() {
    JsonNode response = listWorkspaceObjectPermissions(primaryObjectKey);

    assertStatus(response, 200);
    assertNotNull(
        workspaceObjectPermissionItems(response),
        "Workspace object permissions response should have an items collection.");
  }

  @Test(
      groups = {
        GROUP_CLI_TESTS,
        GROUP_CLI_WORKSPACE_OBJECT,
        GROUP_WORKSPACE_OBJECT,
        GROUP_REL_VALIDATION
      },
      dependsOnMethods = "testListWorkspaceObjectPermissionsCommand")
  public void testManageWorkspaceObjectPermissionCommand() {
    String target = config.workspaceObjectPermissionTarget();
    boolean targetHadPermission =
        workspaceObjectPermissionItems(listWorkspaceObjectPermissions(primaryObjectKey)).stream()
            .anyMatch(item -> matchesWorkspaceObjectPermissionTarget(item, target));

    JsonNode assignResponse =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "workspace-object",
                    "manage-permission",
                    assignWorkspaceObjectPermissionBody(target),
                    workspaceKey,
                    primaryObjectKey)));
    assertStatusIn(assignResponse, 200, 202, 204);
    objectPermissionAssignedByTest = !targetHadPermission;

    waitForWorkspaceObjectPermissionTarget(target, true, PERMISSION_READY_TIMEOUT);

    if (!targetHadPermission) {
      JsonNode revokeResponse =
          assertSuccess(
              runner.run(
                  invocationBuilder.commandWithBody(
                      "workspace-object",
                      "manage-permission",
                      revokeWorkspaceObjectPermissionBody(target),
                      workspaceKey,
                      primaryObjectKey)));
      assertStatusIn(revokeResponse, 200, 202, 204);
      objectPermissionAssignedByTest = false;
      waitForWorkspaceObjectPermissionTarget(target, false, PERMISSION_READY_TIMEOUT);
    }
  }

  @Test(
      groups = {
        GROUP_CLI_TESTS,
        GROUP_CLI_WORKSPACE_OBJECT,
        GROUP_WORKSPACE_OBJECT,
        GROUP_REL_VALIDATION
      },
      dependsOnMethods = "testCreateWorkspaceObjectCommand")
  public void testCopyWorkspaceObjectCommand() {
    String requestedCopyPath = copyPath;
    String body =
        """
        {
          "fromPath": "%s",
          "toPath": "%s",
          "isOverWrite": true,
          "isDeleteSource": false,
          "isIncludeOutputs": false
        }
        """
            .formatted(primaryPath, requestedCopyPath);

    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "workspace-object", "copy", body, workspaceKey)));

    assertStatus(response, 200);
    String actualCopyPath = objectPath(response);
    assertNotNull(actualCopyPath, "Copy response should contain the copied object path: " + response);
    assertTrue(
        normalizeObjectPath(actualCopyPath).startsWith(normalizeObjectPath(requestedCopyPath)),
        "Copy response path should start with requested target path. response=" + response);
    assertStatus(getWorkspaceObject(requestedCopyPath), 200);
    copyPath = requestedCopyPath;
    createdObjectPaths.add(copyPath);
  }

  @Test(
      groups = {
        GROUP_CLI_TESTS,
        GROUP_CLI_WORKSPACE_OBJECT,
        GROUP_WORKSPACE_OBJECT,
        GROUP_REL_VALIDATION
      },
      dependsOnMethods = "testCopyWorkspaceObjectCommand")
  public void testMoveWorkspaceObjectCommand() {
    createFolderObject(moveTargetFolderPath);
    String requestedMoveFolderPath = moveTargetFolderPath + "/";
    String body =
        """
        {
          "fromPath": "%s",
          "toPath": "%s"
        }
        """
            .formatted(copyPath, requestedMoveFolderPath);

    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "workspace-object", "move", body, workspaceKey)));

    assertStatus(response, 200);
    createdObjectPaths.remove(copyPath);
    String actualMovedPath = objectPath(response);
    assertNotNull(actualMovedPath, "Move response should contain the moved object path: " + response);
    assertTrue(
        normalizeObjectPath(actualMovedPath).startsWith(normalizeObjectPath(requestedMoveFolderPath)),
        "Move response path should start with requested target folder path. response=" + response);
    movedPath = actualMovedPath;
    createdObjectPaths.add(movedPath);
  }

  @Test(
      groups = {
        GROUP_CLI_TESTS,
        GROUP_CLI_WORKSPACE_OBJECT,
        GROUP_WORKSPACE_OBJECT,
        GROUP_REL_VALIDATION
      },
      dependsOnMethods = "testMoveWorkspaceObjectCommand")
  public void testRenameWorkspaceObjectCommand() {
    String renamedName = renamedPath;
    String body =
        """
        {
          "path": "%s",
          "newName": "%s"
        }
        """
            .formatted(movedPath, renamedName);

    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "workspace-object", "rename", body, workspaceKey)));

    assertStatus(response, 200);
    createdObjectPaths.remove(movedPath);
    String actualRenamedPath = objectPath(response);
    assertNotNull(actualRenamedPath, "Rename response should contain the renamed path: " + response);
    assertTrue(
        normalizeObjectPath(actualRenamedPath).contains(normalizeObjectPath(renamedPath)),
        "Rename response path should contain requested name. response=" + response);
    renamedPath = actualRenamedPath;
    createdObjectPaths.add(renamedPath);
  }

  @Test(
      groups = {
        GROUP_CLI_TESTS,
        GROUP_CLI_WORKSPACE_OBJECT,
        GROUP_WORKSPACE_OBJECT,
        GROUP_REL_VALIDATION
      },
      dependsOnMethods = "testCreateWorkspaceObjectCommand")
  public void testUploadWorkspaceObjectWithParCommand() {
    String uploadPath = objectPrefix + "_upload_par.txt";
    String body =
        """
        {
          "action": "CREATE",
          "size": 0,
          "systemTags": {}
        }
        """;

    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "workspace-object",
                    "upload-with-par",
                    body,
                    workspaceKey,
                    "--path",
                    uploadPath,
                    "--type",
                    "FILE",
                    "--is-overwrite=true",
                    "--should-generate-new-par=true",
                    "--object-description",
                    "PAR upload metadata created by CLI rel validation")));

    assertStatus(response, 200);
    createdObjectPaths.add(uploadPath);
    assertHttpsParUrl(response);
  }

  @Test(
      groups = {
        GROUP_CLI_TESTS,
        GROUP_CLI_WORKSPACE_OBJECT,
        GROUP_WORKSPACE_OBJECT,
        GROUP_REL_VALIDATION
      },
      dependsOnMethods = "testCreateWorkspaceObjectCommand")
  public void testDownloadWorkspaceObjectWithParCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.command(
                    "workspace-object",
                    "download-with-par",
                    workspaceKey,
                    "--path",
                    primaryPath,
                    "--type",
                    "FILE",
                    "--should-generate-new-par=true")));

    assertStatus(response, 200);
    assertHttpsParUrl(response);
  }

  @Test(
      groups = {
        GROUP_CLI_TESTS,
        GROUP_CLI_WORKSPACE_OBJECT,
        GROUP_WORKSPACE_OBJECT,
        GROUP_REL_VALIDATION
      },
      dependsOnMethods = "testCreateWorkspaceObjectCommand")
  public void testDeleteWorkspaceObjectCommand() {
    String deletePath = objectPrefix + "_delete.txt";
    createFileObject(deletePath, "delete command seed", "Delete command fixture");

    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.command(
                    "workspace-object", "delete", workspaceKey, deletePath)));

    assertStatus(response, 204);
    createdObjectPaths.remove(deletePath);
    waitForObjectDeleted(deletePath, OBJECT_DELETE_TIMEOUT);
  }

  @AfterClass(
      alwaysRun = true,
      groups = {
        GROUP_CLI_TESTS,
        GROUP_CLI_WORKSPACE_OBJECT,
        GROUP_WORKSPACE_OBJECT,
        GROUP_REL_VALIDATION
      })
  public void tearDown() {
    try {
      revokeWorkspaceObjectPermissionIfAssigned();
    } finally {
      deleteWorkspace();
    }
  }

  private JsonNode createFileObject(String path, String content, String description) {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "workspace-object",
                    "create",
                    content,
                    workspaceKey,
                    "--path",
                    path,
                    "--type",
                    "FILE",
                    "--object-description",
                    description,
                    "--is-overwrite=true")));

    assertStatusIn(response, 200, 201);
    createdObjectPaths.add(path);
    return response;
  }

  private JsonNode createFolderObject(String path) {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "workspace-object",
                    "create",
                    "",
                    workspaceKey,
                    "--path",
                    path,
                    "--type",
                    "FOLDER",
                    "--object-description",
                    "Folder created by workspace-object CLI rel validation",
                    "--is-overwrite=true")));

    assertStatusIn(response, 200, 201);
    createdObjectPaths.add(path);
    return response;
  }

  private JsonNode listWorkspaceObjectPermissions(String objectKey) {
    return assertSuccess(
        runner.run(
            invocationBuilder.command(
                "workspace-object",
                "list-permissions",
                workspaceKey,
                objectKey,
                "--limit",
                "10",
                "--sort-order",
                "ASC",
                "--sort-by",
                "displayName")));
  }

  private JsonNode getWorkspaceObject(String path) {
    return assertSuccess(
        runner.run(invocationBuilder.command("workspace-object", "get", workspaceKey, path)));
  }

  private List<JsonNode> workspaceObjectItems(JsonNode response) {
    JsonNode responseData = data(response);
    JsonNode responseItems = responseData.path("items");
    if (!responseItems.isArray()) {
      responseItems =
          firstExisting(responseData, "workspaceObjectCollection", "workspace_object_collection")
              .path("items");
    }
    if (!responseItems.isArray()) {
      return List.of();
    }
    List<JsonNode> values = new ArrayList<>();
    responseItems.forEach(values::add);
    return values;
  }

  private List<JsonNode> workspaceObjectPermissionItems(JsonNode response) {
    JsonNode responseData = data(response);
    JsonNode responseItems = responseData.path("items");
    if (!responseItems.isArray()) {
      responseItems =
          firstExisting(
                  responseData,
                  "workspaceObjectPermissionCollection",
                  "workspace_object_permission_collection")
              .path("items");
    }
    if (!responseItems.isArray()) {
      return List.of();
    }
    List<JsonNode> values = new ArrayList<>();
    responseItems.forEach(values::add);
    return values;
  }

  private boolean matchesWorkspaceObjectPermissionTarget(JsonNode item, String target) {
    return target.equals(optionalText(item, "grantee", "granteeId", "grantee_id"));
  }

  private String assignWorkspaceObjectPermissionBody(String target) {
    return """
        {
          "assignWorkspaceObjectPermissionDetails": {
            "assignees": {
              "type": "USER",
              "targets": ["%s"]
            },
            "permissions": ["READ"],
            "isPermissionsInheritable": true
          }
        }
        """
        .formatted(target);
  }

  private String revokeWorkspaceObjectPermissionBody(String target) {
    return """
        {
          "revokeWorkspaceObjectPermissionDetails": {
            "assignees": {
              "type": "USER",
              "targets": ["%s"]
            },
            "permissions": ["READ"],
            "isPermissionsInheritable": true
          }
        }
        """
        .formatted(target);
  }

  private void waitForWorkspaceObjectPermissionTarget(
      String target, boolean expectedPresent, Duration timeout) {
    long deadline = System.nanoTime() + timeout.toNanos();
    while (System.nanoTime() < deadline) {
      boolean present =
          workspaceObjectPermissionItems(listWorkspaceObjectPermissions(primaryObjectKey)).stream()
              .anyMatch(item -> matchesWorkspaceObjectPermissionTarget(item, target));
      if (present == expectedPresent) {
        return;
      }
      sleep();
    }
    throw new AssertionError(
        "Workspace object permission target "
            + target
            + " did not reach expected presence="
            + expectedPresent);
  }

  private void revokeWorkspaceObjectPermissionIfAssigned() {
    if (!objectPermissionAssignedByTest || runner == null || config == null || primaryObjectKey == null) {
      return;
    }

    String target = config.workspaceObjectPermissionTarget();
    CliTestLogger.info("CLEANUP", "Revoking workspace object permission for " + target);
    CliCommandResult result =
        runner.run(
            invocationBuilder.commandWithBody(
                "workspace-object",
                "manage-permission",
                revokeWorkspaceObjectPermissionBody(target),
                workspaceKey,
                primaryObjectKey));
    if (result.exitCode() == 0) {
      objectPermissionAssignedByTest = false;
      return;
    }

    CliTestLogger.block(
        "CLEANUP",
        "Failed to revoke workspace object permission:",
        result.combinedOutput(),
        config.cliLogMaxCharacters());
  }

  private void assertObjectPath(JsonNode response, String expectedPath) {
    String actualPath = objectPath(response);
    assertNotNull(actualPath, "Workspace object response should include object path: " + response);
    assertEquals(normalizeObjectPath(actualPath), normalizeObjectPath(expectedPath));
  }

  private boolean objectPathMatches(JsonNode node, String expectedPath) {
    String actualPath = optionalText(node, "path");
    return actualPath != null
        && normalizeObjectPath(actualPath).equals(normalizeObjectPath(expectedPath));
  }

  private String objectPath(JsonNode response) {
    JsonNode responseData = data(response);
    String path = optionalText(responseData, "path");
    if (path != null) {
      return path;
    }
    JsonNode object = firstExisting(responseData, "workspaceObject", "workspace_object");
    path = optionalText(object, "path");
    if (path != null) {
      return path;
    }
    return optionalText(response.path("headers"), "path", "folder", "file", "display-name");
  }

  private void assertHttpsParUrl(JsonNode response) {
    String parUrl = parUrl(response);
    assertNotNull(parUrl, "PAR response should contain parUrl: " + response);
    assertTrue(parUrl.startsWith("https://"), "PAR URL should be HTTPS: " + parUrl);
  }

  private String parUrl(JsonNode response) {
    JsonNode responseData = data(response);
    String parUrl = optionalText(responseData, "parUrl", "par_url");
    if (parUrl != null) {
      return parUrl;
    }
    JsonNode nested =
        firstExisting(
            responseData,
            "uploadFileWithParResult",
            "upload_file_with_par_result",
            "downloadFileWithParResult",
            "download_file_with_par_result");
    return optionalText(nested, "parUrl", "par_url");
  }

  private String createWorkspaceBody(String displayName) {
    return """
        {
          "displayName": "%s",
          "description": "%s",
          "defaultCatalogKey": "default"
        }
        """
        .formatted(displayName, displayName);
  }

  private JsonNode getWorkspace(String key) {
    JsonNode response =
        assertSuccess(runner.run(invocationBuilder.command("workspace", "get", key)));
    assertStatus(response, 200);
    return response;
  }

  private String extractWorkspaceKey(JsonNode response) {
    JsonNode responseData = data(response);
    String key = optionalText(responseData, "key");
    if (key != null) {
      return key;
    }
    return requiredText(firstExisting(responseData, "workspace"), "key");
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

  private void waitForObjectDeleted(String path, Duration timeout) {
    long deadline = System.nanoTime() + timeout.toNanos();
    while (System.nanoTime() < deadline) {
      CliCommandResult result =
          runner.run(invocationBuilder.command("workspace-object", "get", workspaceKey, path));
      if (isNotFound(result)) {
        return;
      }
      sleep();
    }
    throw new AssertionError("Workspace object " + path + " was not deleted within " + timeout);
  }

  private void deleteWorkspace() {
    if (workspaceKey == null || workspaceKey.isBlank() || runner == null) {
      return;
    }

    CliCommandResult result = runner.run(invocationBuilder.command("workspace", "delete", workspaceKey));
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
  }

  private void waitForWorkspaceDeleted(String key, Duration timeout) {
    long deadline = System.nanoTime() + timeout.toNanos();
    while (System.nanoTime() < deadline) {
      CliCommandResult result = runner.run(invocationBuilder.command("workspace", "get", key));
      if (isNotFound(result)) {
        return;
      }
      sleep();
    }
    throw new AssertionError("Workspace " + key + " was not deleted within " + timeout);
  }

  private boolean isNotFound(CliCommandResult result) {
    if (result.exitCode() != 0 && result.combinedOutput().contains("\"status\": 404")) {
      return true;
    }
    if (result.exitCode() == 0) {
      JsonNode response = responseJson(result);
      return response.path("status").asInt(-1) == 404;
    }
    return false;
  }

  private static String normalizeObjectPath(String value) {
    String normalized = value == null ? "" : value.trim();
    while (normalized.startsWith("/")) {
      normalized = normalized.substring(1);
    }
    return normalized;
  }

  private static void sleep() {
    try {
      Thread.sleep(POLL_INTERVAL.toMillis());
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new RuntimeException("Interrupted while waiting for workspace object state", e);
    }
  }
}
