package com.oracle.aidp.cli.invocation.volume;

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
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VolumeRelValidationCliIT {
  private static final String GROUP_CLI_TESTS = "cli_tests";
  private static final String GROUP_CLI_VOLUME = "cli_volume";
  private static final String GROUP_VOLUME = "volume";
  private static final String GROUP_REL_VALIDATION = "rel_validation";

  private static final String VOLUME_NAME_PREFIX = "it_volume_cli_";
  private static final Duration VOLUME_DELETE_TIMEOUT = Duration.ofMinutes(5);
  private static final Duration POLL_INTERVAL = Duration.ofSeconds(15);

  private CliTestConfig config;
  private CliCommandRunner runner;
  private CliInvocationBuilder invocationBuilder;
  private String runId;
  private String catalogName;
  private String schemaName;
  private String schemaKey;
  private String volumeDisplayName;
  private String updatedVolumeDisplayName;
  private String volumeKey;
  private String directoryPath;
  private String renamedDirectoryPath;
  private String filePath;
  private String parFilePath;
  private Path uploadFile;
  private boolean volumeDeleted;
  private boolean volumePermissionAssignedByTest;

  @BeforeClass(
      alwaysRun = true,
      groups = {GROUP_CLI_TESTS, GROUP_CLI_VOLUME, GROUP_VOLUME, GROUP_REL_VALIDATION})
  public void setUp() {
    config = CliTestConfig.load();
    runner = new CliCommandRunner(config);
    invocationBuilder = new CliInvocationBuilder(config);
    runId = UUID.randomUUID().toString().replace("-", "");
    catalogName = config.volumeCatalogName();
    schemaName = config.volumeSchemaName();
    schemaKey = config.value("cliVolumeSchemaKey", catalogName + "." + schemaName);
    volumeDisplayName = VOLUME_NAME_PREFIX + runId;
    updatedVolumeDisplayName = volumeDisplayName + "_updated";
    directoryPath = "volume_cli_dir_" + runId;
    renamedDirectoryPath = directoryPath + "_renamed";
    filePath = directoryPath + "/hello.txt";
    parFilePath = "volume_cli_par_" + runId + ".txt";
  }

  @Test(groups = {GROUP_CLI_TESTS, GROUP_CLI_VOLUME, GROUP_VOLUME, GROUP_REL_VALIDATION})
  public void testCreateVolumeCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(invocationBuilder.commandWithBody("volume", "create", createVolumeBody())));

    assertStatus(response, 201);
    JsonNode volume = volumeNode(response);
    assertEquals(volumeDisplayName(volume), volumeDisplayName);
    volumeKey = optionalText(volume, "key");
    if (volumeKey == null || volumeKey.isBlank()) {
      volumeKey = volumeKeyFor(volumeDisplayName);
    }
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_VOLUME, GROUP_VOLUME, GROUP_REL_VALIDATION},
      dependsOnMethods = "testCreateVolumeCommand")
  public void testGetVolumeCommand() {
    JsonNode response = getVolume(volumeKey);
    JsonNode volume = volumeNode(response);
    assertEquals(volumeDisplayName(volume), volumeDisplayName);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_VOLUME, GROUP_VOLUME, GROUP_REL_VALIDATION},
      dependsOnMethods = "testGetVolumeCommand")
  public void testListVolumesCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.command(
                    "volume",
                    "list",
                    "--catalog-key",
                    catalogName,
                    "--schema-key",
                    schemaKey,
                    "--display-name",
                    volumeDisplayName,
                    "--limit",
                    "10",
                    "--sort-order",
                    "ASC",
                    "--sort-by",
                    "displayName")));

    assertStatus(response, 200);
    assertTrue(
        volumeItems(response).stream()
            .anyMatch(item -> volumeDisplayName.equals(volumeDisplayNameOrNull(item))),
        "Created volume was not present in list response: " + response);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_VOLUME, GROUP_VOLUME, GROUP_REL_VALIDATION},
      dependsOnMethods = "testListVolumesCommand")
  public void testListVolumePermissionsCommand() {
    JsonNode response = listVolumePermissions();

    assertStatus(response, 200);
    assertTrue(
        volumePermissionItemsNode(response).isArray(),
        "Volume permissions response should expose an items array: " + response);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_VOLUME, GROUP_VOLUME, GROUP_REL_VALIDATION},
      dependsOnMethods = "testListVolumePermissionsCommand")
  public void testManageVolumePermissionCommand() {
    String target = config.volumePermissionTarget();
    boolean targetHadReadPermission =
        volumePermissionItems(listVolumePermissions()).stream()
            .anyMatch(item -> matchesPermissionTarget(item, target, "READ"));

    JsonNode assignResponse =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "volume", "manage-permission", assignVolumePermissionBody(target), volumeKey)));
    assertStatusIn(assignResponse, 200, 202, 204);
    volumePermissionAssignedByTest = !targetHadReadPermission;

    if (!targetHadReadPermission) {
      JsonNode revokeResponse =
          assertSuccess(
              runner.run(
                  invocationBuilder.commandWithBody(
                      "volume", "manage-permission", revokeVolumePermissionBody(target), volumeKey)));
      assertStatusIn(revokeResponse, 200, 202, 204);
      volumePermissionAssignedByTest = false;
    }
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_VOLUME, GROUP_VOLUME, GROUP_REL_VALIDATION},
      dependsOnMethods = "testManageVolumePermissionCommand")
  public void testUpdateVolumeCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody("volume", "update", updateVolumeBody(), volumeKey)));

    assertStatus(response, 200);
    JsonNode volume = volumeNode(response);
    assertEquals(volumeDisplayName(volume), updatedVolumeDisplayName);
    volumeDisplayName = updatedVolumeDisplayName;
    String returnedKey = optionalText(volume, "key");
    volumeKey = returnedKey == null || returnedKey.isBlank() ? volumeKeyFor(volumeDisplayName) : returnedKey;
    JsonNode getResponse = getVolume(volumeKey);
    assertEquals(volumeDisplayName(volumeNode(getResponse)), volumeDisplayName);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_VOLUME, GROUP_VOLUME, GROUP_REL_VALIDATION},
      dependsOnMethods = "testUpdateVolumeCommand")
  public void testMakeDirCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.command(
                    "volume",
                    "make-dir",
                    volumeKey,
                    "--path",
                    directoryPath,
                    "--description",
                    "Directory created by volume CLI rel validation.")));

    assertStatus(response, 201);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_VOLUME, GROUP_VOLUME, GROUP_REL_VALIDATION},
      dependsOnMethods = "testMakeDirCommand")
  public void testListFilesCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.command(
                    "volume",
                    "list-files",
                    volumeKey,
                    "--path",
                    directoryPath,
                    "--limit",
                    "10",
                    "--sort-order",
                    "ASC",
                    "--sort-by",
                    "displayName")));

    assertStatus(response, 200);
    assertTrue(
        volumeFileItemsNode(response).isArray(),
        "Volume list-files response should expose an items array: " + response);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_VOLUME, GROUP_VOLUME, GROUP_REL_VALIDATION},
      dependsOnMethods = "testListFilesCommand")
  public void testUpdateDirCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "volume", "update-dir", updateDirBody(), volumeKey, "--path", directoryPath)));

    assertStatus(response, 200);
    directoryPath = renamedDirectoryPath;
    filePath = directoryPath + "/hello.txt";
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_VOLUME, GROUP_VOLUME, GROUP_REL_VALIDATION},
      dependsOnMethods = "testUpdateDirCommand")
  public void testUploadFileCommand() throws IOException {
    uploadFile = Files.createTempFile("aidp-volume-cli-", ".txt");
    Files.writeString(uploadFile, "volume CLI rel validation content for " + runId);

    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "volume",
                    "upload-file",
                    "@" + uploadFile.toAbsolutePath().normalize(),
                    volumeKey,
                    "--path",
                    filePath,
                    "--is-overwrite=true")));

    assertStatus(response, 200);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_VOLUME, GROUP_VOLUME, GROUP_REL_VALIDATION},
      dependsOnMethods = "testUploadFileCommand")
  public void testDownloadFileCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(invocationBuilder.command("volume", "download-file", volumeKey, "--path", filePath)));

    assertStatus(response, 200);
    assertDownloadedBody(response);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_VOLUME, GROUP_VOLUME, GROUP_REL_VALIDATION},
      dependsOnMethods = "testDownloadFileCommand")
  public void testDownloadFileWithParCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.command(
                    "volume",
                    "download-file-with-par",
                    volumeKey,
                    "--path",
                    filePath,
                    "--should-generate-new-par=true")));

    assertStatus(response, 200);
    assertHttpsParUrl(response);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_VOLUME, GROUP_VOLUME, GROUP_REL_VALIDATION},
      dependsOnMethods = "testDownloadFileWithParCommand")
  public void testUploadFileWithParCommand() {
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
                    "volume",
                    "upload-file-with-par",
                    body,
                    volumeKey,
                    "--path",
                    parFilePath,
                    "--is-overwrite=true",
                    "--should-generate-new-par=true")));

    assertStatus(response, 200);
    assertHttpsParUrl(response);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_VOLUME, GROUP_VOLUME, GROUP_REL_VALIDATION},
      dependsOnMethods = "testUploadFileWithParCommand")
  public void testDeleteFileCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(invocationBuilder.command("volume", "delete-file", volumeKey, "--path", filePath)));

    assertStatus(response, 204);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_VOLUME, GROUP_VOLUME, GROUP_REL_VALIDATION},
      dependsOnMethods = "testDeleteFileCommand")
  public void testDeleteDirCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(invocationBuilder.command("volume", "delete-dir", volumeKey, "--path", directoryPath)));

    assertStatus(response, 204);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_VOLUME, GROUP_VOLUME, GROUP_REL_VALIDATION},
      dependsOnMethods = "testDeleteDirCommand")
  public void testDeleteVolumeCommand() {
    JsonNode response = assertSuccess(runner.run(invocationBuilder.command("volume", "delete", volumeKey)));

    assertStatus(response, 204);
    waitForVolumeDeleted(volumeKey, VOLUME_DELETE_TIMEOUT);
    volumeDeleted = true;
  }

  @AfterClass(
      alwaysRun = true,
      groups = {GROUP_CLI_TESTS, GROUP_CLI_VOLUME, GROUP_VOLUME, GROUP_REL_VALIDATION})
  public void tearDown() {
    try {
      revokeVolumePermissionIfAssigned();
    } finally {
      deleteVolumeIfPresent();
    }
  }

  private JsonNode getVolume(String key) {
    JsonNode response = assertSuccess(runner.run(invocationBuilder.command("volume", "get", key)));
    assertStatus(response, 200);
    return response;
  }

  private JsonNode listVolumePermissions() {
    return assertSuccess(
        runner.run(
            invocationBuilder.command(
                "volume",
                "list-permissions",
                volumeKey,
                "--limit",
                "10",
                "--sort-order",
                "ASC",
                "--sort-by",
                "displayName")));
  }

  private String createVolumeBody() {
    return """
        {
          "catalogName": "%s",
          "schemaName": "%s",
          "displayName": "%s",
          "description": "Volume created by CLI rel validation.",
          "volumeType": "MANAGED"
        }
        """
        .formatted(catalogName, schemaName, volumeDisplayName);
  }

  private String updateVolumeBody() {
    return """
        {
          "displayName": "%s",
          "description": "Updated by volume CLI rel validation."
        }
        """
        .formatted(updatedVolumeDisplayName);
  }

  private String updateDirBody() {
    return """
        {
          "displayName": "%s"
        }
        """
        .formatted(renamedDirectoryPath);
  }

  private String assignVolumePermissionBody(String target) {
    return """
        {
          "assignVolumePermissionDetails": {
            "assignees": {
              "type": "USER",
              "targets": ["%s"]
            },
            "permissions": ["READ"]
          }
        }
        """
        .formatted(target);
  }

  private String revokeVolumePermissionBody(String target) {
    return """
        {
          "revokeVolumePermissionDetails": {
            "assignees": {
              "type": "USER",
              "targets": ["%s"]
            },
            "permissions": ["READ"]
          }
        }
        """
        .formatted(target);
  }

  private JsonNode volumeNode(JsonNode response) {
    JsonNode responseData = data(response);
    if (!responseData.path("displayName").isMissingNode()
        || !responseData.path("display_name").isMissingNode()
        || !responseData.path("name").isMissingNode()) {
      return responseData;
    }
    JsonNode nested = firstExisting(responseData, "volume", "volumeSummary", "volume_summary");
    if (!nested.isMissingNode()) {
      return nested;
    }
    return responseData;
  }

  private List<JsonNode> volumeItems(JsonNode response) {
    JsonNode responseData = data(response);
    JsonNode items = responseData.path("items");
    if (!items.isArray()) {
      items = firstExisting(responseData, "volumeCollection", "volume_collection").path("items");
    }
    List<JsonNode> values = new ArrayList<>();
    if (items.isArray()) {
      items.forEach(values::add);
    }
    return values;
  }

  private JsonNode volumePermissionItemsNode(JsonNode response) {
    JsonNode responseData = data(response);
    JsonNode items = responseData.path("items");
    if (items.isArray()) {
      return items;
    }
    return firstExisting(responseData, "volumePermissionCollection", "volume_permission_collection")
        .path("items");
  }

  private List<JsonNode> volumePermissionItems(JsonNode response) {
    JsonNode items = volumePermissionItemsNode(response);
    List<JsonNode> values = new ArrayList<>();
    if (items.isArray()) {
      items.forEach(values::add);
    }
    return values;
  }

  private JsonNode volumeFileItemsNode(JsonNode response) {
    JsonNode responseData = data(response);
    JsonNode items = responseData.path("items");
    if (items.isArray()) {
      return items;
    }
    return firstExisting(responseData, "volumeFileCollection", "volume_file_collection").path("items");
  }

  private String volumeDisplayName(JsonNode volume) {
    return requiredText(volume, "displayName", "display_name", "name");
  }

  private String volumeDisplayNameOrNull(JsonNode volume) {
    return optionalText(volume, "displayName", "display_name", "name");
  }

  private boolean matchesPermissionTarget(JsonNode item, String target, String permission) {
    String grantee = optionalText(item, "grantee", "granteeId", "grantee_id", "principalId", "principal_id");
    if (grantee == null || !target.equals(grantee)) {
      return false;
    }
    JsonNode permissions = firstExisting(item, "permissions", "privileges");
    if (permissions.isArray()) {
      for (JsonNode value : permissions) {
        if (permission.equalsIgnoreCase(value.asText())) {
          return true;
        }
      }
      return false;
    }
    String singlePermission = optionalText(item, "permission", "privilege");
    return permission.equalsIgnoreCase(singlePermission);
  }

  private void assertDownloadedBody(JsonNode response) {
    JsonNode responseData = data(response);
    assertFalse(responseData.isMissingNode(), "Download response should contain data: " + response);
    if (responseData.isArray()) {
      assertTrue(responseData.size() > 0, "Downloaded data array should not be empty: " + response);
      return;
    }
    assertFalse(responseData.asText("").isBlank(), "Downloaded data should not be blank: " + response);
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

  private String volumeKeyFor(String displayName) {
    return catalogName + "." + schemaName + "." + displayName;
  }

  private void revokeVolumePermissionIfAssigned() {
    if (!volumePermissionAssignedByTest || runner == null || invocationBuilder == null || volumeKey == null) {
      return;
    }
    String target = config.volumePermissionTarget();
    CliTestLogger.info("CLEANUP", "Revoking volume permission for " + target);
    CliCommandResult result =
        runner.run(
            invocationBuilder.commandWithBody(
                "volume", "manage-permission", revokeVolumePermissionBody(target), volumeKey));
    if (result.exitCode() == 0) {
      volumePermissionAssignedByTest = false;
      return;
    }
    CliTestLogger.block(
        "CLEANUP", "Failed to revoke volume permission:", result.combinedOutput(), config.cliLogMaxCharacters());
  }

  private void deleteVolumeIfPresent() {
    if (volumeDeleted || runner == null || invocationBuilder == null || volumeKey == null) {
      return;
    }
    CliTestLogger.info("CLEANUP", "Deleting volume " + volumeKey);
    CliCommandResult result = runner.run(invocationBuilder.command("volume", "delete", volumeKey));
    JsonNode response = responseJsonOrNull(result);
    if (response != null && hasStatus(response, 404)) {
      volumeDeleted = true;
      return;
    }
    if (result.exitCode() != 0) {
      CliTestLogger.block(
          "CLEANUP", "Failed to delete volume:", result.combinedOutput(), config.cliLogMaxCharacters());
      return;
    }
    JsonNode deleteResponse = responseJson(result);
    assertStatus(deleteResponse, 204);
    waitForVolumeDeleted(volumeKey, VOLUME_DELETE_TIMEOUT);
    volumeDeleted = true;
  }

  private void waitForVolumeDeleted(String key, Duration timeout) {
    long deadline = System.nanoTime() + timeout.toNanos();
    while (System.nanoTime() < deadline) {
      CliCommandResult result = runner.run(invocationBuilder.command("volume", "get", key));
      if (isNotFound(result)) {
        return;
      }
      sleep();
    }
    throw new AssertionError("Volume " + key + " was not deleted within " + timeout);
  }

  private boolean isNotFound(CliCommandResult result) {
    JsonNode response = responseJsonOrNull(result);
    return response != null && hasStatus(response, 404);
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

  private static void sleep() {
    try {
      Thread.sleep(POLL_INTERVAL.toMillis());
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new AssertionError("Interrupted while waiting for volume state.", e);
    }
  }
}
