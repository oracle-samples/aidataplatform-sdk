package com.oracle.aidp.cli.invocation.catalog;

import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.assertStatus;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.assertStatusIn;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.assertSuccess;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.data;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.firstExisting;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.optionalText;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.requiredText;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.responseJson;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import com.fasterxml.jackson.databind.JsonNode;
import com.oracle.aidp.cli.invocation.config.CliTestConfig;
import com.oracle.aidp.cli.invocation.logging.CliTestLogger;
import com.oracle.aidp.cli.invocation.runner.CliCommandResult;
import com.oracle.aidp.cli.invocation.runner.CliCommandRunner;
import com.oracle.aidp.cli.invocation.runner.CliInvocationBuilder;
import java.nio.file.Path;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CatalogRelValidationCliIT {
  private static final String GROUP_CLI_TESTS = "cli_tests";
  private static final String GROUP_CLI_CATALOG = "cli_catalog";
  private static final String GROUP_CATALOG = "catalog";
  private static final String GROUP_REL_VALIDATION = "rel_validation";

  private static final String CATALOG_NAME_PREFIX = "it_catalog_cli_";
  private static final String UPDATED_DESCRIPTION = "updated catalog created by cli rel validation.";
  private static final Duration CATALOG_ASYNC_TIMEOUT = Duration.ofMinutes(20);
  private static final Duration CATALOG_READY_TIMEOUT = Duration.ofMinutes(10);
  private static final Duration CATALOG_DELETE_TIMEOUT = Duration.ofMinutes(10);
  private static final Duration POLL_INTERVAL = Duration.ofSeconds(15);

  private CliTestConfig config;
  private CliCommandRunner runner;
  private CliInvocationBuilder invocationBuilder;
  private String runId;
  private String catalogDisplayName;
  private String catalogKey;
  private boolean catalogDeleted;

  @BeforeClass(
      alwaysRun = true,
      groups = {GROUP_CLI_TESTS, GROUP_CLI_CATALOG, GROUP_CATALOG, GROUP_REL_VALIDATION})
  public void setUp() {
    config = CliTestConfig.load();
    runner = new CliCommandRunner(config);
    invocationBuilder = new CliInvocationBuilder(config);
    runId = UUID.randomUUID().toString().replace("-", "");
    catalogDisplayName = CATALOG_NAME_PREFIX + runId;
  }

  @Test(groups = {GROUP_CLI_TESTS, GROUP_CLI_CATALOG, GROUP_CATALOG, GROUP_REL_VALIDATION})
  public void testCreateCatalogCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody("catalog", "create", createCatalogBody())));

    assertStatus(response, 202);
    catalogKey = optionalCatalogKey(response);
    waitForAsyncOperationSucceeded(extractAsyncOperationKey(response), CATALOG_ASYNC_TIMEOUT);
    if (catalogKey == null) {
      catalogKey = catalogDisplayName;
    }

    JsonNode catalog = waitForCatalogAvailable(catalogKey, CATALOG_READY_TIMEOUT);
    assertEquals(catalogDisplayName(catalog), catalogDisplayName);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_CATALOG, GROUP_CATALOG, GROUP_REL_VALIDATION},
      dependsOnMethods = "testCreateCatalogCommand")
  public void testGetCatalogCommand() {
    JsonNode response = getCatalog(catalogKey);
    JsonNode catalog = catalogNode(response);
    assertEquals(requiredText(catalog, "key"), catalogKey);
    assertEquals(catalogDisplayName(catalog), catalogDisplayName);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_CATALOG, GROUP_CATALOG, GROUP_REL_VALIDATION},
      dependsOnMethods = "testGetCatalogCommand")
  public void testListCatalogCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.command(
                    "catalog",
                    "list",
                    "--display-name",
                    catalogDisplayName,
                    "--catalog-type",
                    "INTERNAL",
                    "--limit",
                    "10",
                    "--sort-order",
                    "ASC",
                    "--sort-by",
                    "displayName")));

    assertStatus(response, 200);
    assertTrue(
        catalogItems(response).stream().anyMatch(item -> catalogKey.equals(optionalText(item, "key"))),
        "Created catalog key " + catalogKey + " was not present in list response: " + response);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_CATALOG, GROUP_CATALOG, GROUP_REL_VALIDATION},
      dependsOnMethods = "testListCatalogCommand")
  public void testListCatalogPermissionsCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.command(
                    "catalog",
                    "list-permissions",
                    catalogKey,
                    "--limit",
                    "10",
                    "--sort-order",
                    "ASC",
                    "--sort-by",
                    "displayName")));

    assertStatus(response, 200);
    assertTrue(
        catalogPermissionItemsNode(response).isArray(),
        "Catalog permissions response should expose an items array: " + response);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_CATALOG, GROUP_CATALOG, GROUP_REL_VALIDATION},
      dependsOnMethods = "testListCatalogPermissionsCommand")
  public void testManageCatalogPermissionCommand() {
    String target = config.catalogPermissionTarget();
    JsonNode assignResponse =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "catalog", "manage-permission", assignCatalogPermissionBody(target), catalogKey)));
    assertStatusIn(assignResponse, 200, 202, 204);

    JsonNode revokeResponse =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "catalog", "manage-permission", revokeCatalogPermissionBody(target), catalogKey)));
    assertStatusIn(revokeResponse, 200, 202, 204);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_CATALOG, GROUP_CATALOG, GROUP_REL_VALIDATION},
      dependsOnMethods = "testManageCatalogPermissionCommand")
  public void testRefreshCatalogCommand() {
    String configuredRefreshKey = config.value("cliCatalogRefreshKey", null);
    boolean usingConfiguredRefreshCatalog = configuredRefreshKey != null && !configuredRefreshKey.isBlank();
    String refreshKey = usingConfiguredRefreshCatalog ? configuredRefreshKey : catalogKey;

    CliCommandResult result = runner.run(invocationBuilder.command("catalog", "refresh", refreshKey));
    JsonNode response = responseJson(result);
    if (!usingConfiguredRefreshCatalog && result.exitCode() != 0 && hasStatus(response, 400, 405)) {
      return;
    }

    assertEquals(
        result.exitCode(),
        0,
        "Catalog refresh command failed.\nSTDOUT:\n" + result.stdout() + "\nSTDERR:\n" + result.stderr());
    assertStatus(response, 202);
    waitForOptionalAsyncOperationSucceeded(response, CATALOG_ASYNC_TIMEOUT);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_CATALOG, GROUP_CATALOG, GROUP_REL_VALIDATION},
      dependsOnMethods = "testCreateCatalogCommand")
  public void testCatalogTestConnectionCommand() {
    String configuredBodyArgument = configuredCatalogTestConnectionBodyArgument();
    boolean usingConfiguredBody = configuredBodyArgument != null;
    String bodyArgument =
        usingConfiguredBody ? configuredBodyArgument : invalidCatalogTestConnectionBody();

    CliCommandResult result =
        runner.run(invocationBuilder.commandWithBody("catalog", "test-connection", bodyArgument));
    JsonNode response = responseJson(result);

    if (!usingConfiguredBody) {
      assertStatusIn(response, 400, 409, 422);
      return;
    }

    assertEquals(
        result.exitCode(),
        0,
        "Catalog test-connection command failed.\nSTDOUT:\n" + result.stdout() + "\nSTDERR:\n" + result.stderr());
    assertStatus(response, 202);
    waitForOptionalAsyncOperationSucceeded(response, CATALOG_ASYNC_TIMEOUT);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_CATALOG, GROUP_CATALOG, GROUP_REL_VALIDATION},
      dependsOnMethods = "testRefreshCatalogCommand")
  public void testUpdateCatalogCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody("catalog", "update", updateCatalogBody(), catalogKey)));

    assertStatus(response, 202);
    waitForAsyncOperationSucceeded(extractAsyncOperationKey(response), CATALOG_ASYNC_TIMEOUT);
    JsonNode catalog = catalogNode(getCatalog(catalogKey));
    assertEquals(requiredText(catalog, "key"), catalogKey);
    assertEquals(optionalText(catalog, "description"), UPDATED_DESCRIPTION);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_CATALOG, GROUP_CATALOG, GROUP_REL_VALIDATION},
      dependsOnMethods = "testUpdateCatalogCommand")
  public void testDeleteCatalogCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(invocationBuilder.command("catalog", "delete", catalogKey, "--is-forced=true")));

    assertStatus(response, 202);
    waitForAsyncOperationSucceeded(extractAsyncOperationKey(response), CATALOG_ASYNC_TIMEOUT);
    waitForCatalogDeleted(catalogKey, CATALOG_DELETE_TIMEOUT);
    catalogDeleted = true;
  }

  @AfterClass(
      alwaysRun = true,
      groups = {GROUP_CLI_TESTS, GROUP_CLI_CATALOG, GROUP_CATALOG, GROUP_REL_VALIDATION})
  public void tearDown() {
    deleteCatalogIfPresent();
  }

  private JsonNode getCatalog(String key) {
    JsonNode response = assertSuccess(runner.run(invocationBuilder.command("catalog", "get", key)));
    assertStatus(response, 200);
    return response;
  }

  private JsonNode waitForCatalogAvailable(String key, Duration timeout) {
    long deadline = System.nanoTime() + timeout.toNanos();
    String lastOutput = null;
    JsonNode lastResponse = null;
    while (System.nanoTime() < deadline) {
      CliCommandResult result = runner.run(invocationBuilder.command("catalog", "get", key));
      lastOutput = result.combinedOutput();
      lastResponse = responseJsonOrNull(result);
      if (result.exitCode() == 0 && lastResponse != null && hasStatus(lastResponse, 200)) {
        JsonNode catalog = catalogNode(lastResponse);
        String state = optionalText(catalog, "lifecycleState", "lifecycle_state", "catalogState", "catalog_state");
        if (state == null || "ACTIVE".equalsIgnoreCase(state)) {
          return catalog;
        }
      } else if (lastResponse != null && !hasStatus(lastResponse, 404, 409, 429, 500, 502, 503, 504)) {
        throw new AssertionError("Unexpected response while waiting for catalog " + key + ": " + lastResponse);
      }
      sleep();
    }
    throw new AssertionError(
        "Catalog "
            + key
            + " was not available within "
            + timeout
            + ". Last response="
            + lastResponse
            + "\nLast output:\n"
            + lastOutput);
  }

  private String waitForCatalogKeyByDisplayName(String displayName, Duration timeout) {
    long deadline = System.nanoTime() + timeout.toNanos();
    while (System.nanoTime() < deadline) {
      JsonNode response =
          assertSuccess(
              runner.run(
                  invocationBuilder.command(
                      "catalog",
                      "list",
                      "--display-name",
                      displayName,
                      "--catalog-type",
                      "INTERNAL",
                      "--limit",
                      "10")));
      assertStatus(response, 200);
      for (JsonNode item : catalogItems(response)) {
        if (displayName.equals(catalogDisplayName(item))) {
          return requiredText(item, "key");
        }
      }
      sleep();
    }
    throw new AssertionError("Catalog with displayName " + displayName + " did not appear in list response.");
  }

  private void waitForCatalogDeleted(String key, Duration timeout) {
    long deadline = System.nanoTime() + timeout.toNanos();
    while (System.nanoTime() < deadline) {
      CliCommandResult result = runner.run(invocationBuilder.command("catalog", "get", key));
      JsonNode response = responseJsonOrNull(result);
      if (response != null && hasStatus(response, 404)) {
        return;
      }
      sleep();
    }
    throw new AssertionError("Catalog " + key + " was not deleted within " + timeout);
  }

  private void waitForAsyncOperationSucceeded(String asyncOperationKey, Duration timeout) {
    long deadline = System.nanoTime() + timeout.toNanos();
    String lastOutput = null;
    JsonNode lastResponse = null;
    while (System.nanoTime() < deadline) {
      CliCommandResult result =
          runner.run(invocationBuilder.command("async-operations", "get", asyncOperationKey));
      lastOutput = result.combinedOutput();
      lastResponse = responseJsonOrNull(result);
      if (result.exitCode() == 0 && lastResponse != null && hasStatus(lastResponse, 200)) {
        JsonNode asyncOperation = asyncOperationNode(lastResponse);
        String status = requiredText(asyncOperation, "status");
        if (isSucceededAsyncStatus(status)) {
          return;
        }
        if (isFailedAsyncStatus(status)) {
          throw new AssertionError(
              "Catalog async operation failed. key=" + asyncOperationKey + ", response=" + lastResponse);
        }
      } else if (lastResponse != null && !hasStatus(lastResponse, 401, 404, 409, 429, 500, 502, 503, 504)) {
        throw new AssertionError(
            "Unexpected response while waiting for catalog async operation "
                + asyncOperationKey
                + ": "
                + lastResponse);
      }
      sleep();
    }
    throw new AssertionError(
        "Catalog async operation "
            + asyncOperationKey
            + " did not succeed within "
            + timeout
            + ". Last response="
            + lastResponse
            + "\nLast output:\n"
            + lastOutput);
  }

  private void waitForOptionalAsyncOperationSucceeded(JsonNode response, Duration timeout) {
    String asyncOperationKey = optionalAsyncOperationKey(response);
    if (asyncOperationKey != null) {
      waitForAsyncOperationSucceeded(asyncOperationKey, timeout);
    }
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

  private String createCatalogBody() {
    return """
        {
          "displayName": "%s",
          "description": "Catalog created by CLI rel validation.",
          "catalogType": "INTERNAL",
          "properties": {}
        }
        """
        .formatted(catalogDisplayName);
  }

  private String updateCatalogBody() {
    return """
        {
          "description": "%s",
          "properties": {}
        }
        """
        .formatted(UPDATED_DESCRIPTION);
  }

  private String assignCatalogPermissionBody(String target) {
    return """
        {
          "assignCatalogPermissionDetails": {
            "assignees": {
              "type": "USER",
              "targets": ["%s"]
            },
            "permissions": ["SELECT"]
          }
        }
        """
        .formatted(target);
  }

  private String revokeCatalogPermissionBody(String target) {
    return """
        {
          "revokeCatalogPermissionDetails": {
            "assignees": {
              "type": "USER",
              "targets": ["%s"]
            },
            "permissions": ["SELECT"]
          }
        }
        """
        .formatted(target);
  }

  private String invalidCatalogTestConnectionBody() {
    return """
        {
          "key": "test_connection_%s",
          "sourceType": "ADW",
          "connectionDetails": {
            "displayName": "test_connection_%s",
            "connectionProperties": {}
          }
        }
        """
        .formatted(runId, runId);
  }

  private String configuredCatalogTestConnectionBodyArgument() {
    String value = config.value("cliCatalogTestConnectionBodyFile", null);
    if (value == null || value.isBlank()) {
      return null;
    }
    if (value.startsWith("@") || value.startsWith("file://") || "-".equals(value)) {
      return value;
    }
    return "@" + Path.of(value).toAbsolutePath().normalize();
  }

  private JsonNode catalogNode(JsonNode response) {
    JsonNode responseData = data(response);
    if (!responseData.path("key").isMissingNode()) {
      return responseData;
    }
    JsonNode nested = firstExisting(responseData, "catalog", "catalogSummary", "catalog_summary");
    if (!nested.isMissingNode()) {
      return nested;
    }
    return responseData;
  }

  private String optionalCatalogKey(JsonNode response) {
    JsonNode catalog = catalogNode(response);
    String key = optionalText(catalog, "key");
    if (key != null) {
      return key;
    }
    return optionalText(firstExisting(data(response), "catalog"), "key");
  }

  private List<JsonNode> catalogItems(JsonNode response) {
    JsonNode responseData = data(response);
    JsonNode items = responseData.path("items");
    if (!items.isArray()) {
      items = firstExisting(responseData, "catalogCollection", "catalog_collection").path("items");
    }

    List<JsonNode> values = new ArrayList<>();
    if (items.isArray()) {
      items.forEach(values::add);
    }
    return values;
  }

  private JsonNode catalogPermissionItemsNode(JsonNode response) {
    JsonNode responseData = data(response);
    JsonNode items = responseData.path("items");
    if (items.isArray()) {
      return items;
    }
    return firstExisting(responseData, "catalogPermissionCollection", "catalog_permission_collection")
        .path("items");
  }

  private String catalogDisplayName(JsonNode catalog) {
    return requiredText(catalog, "displayName", "display_name", "name");
  }

  private String extractAsyncOperationKey(JsonNode response) {
    String key = optionalAsyncOperationKey(response);
    assertNotNull(key, "Expected async operation key in response headers: " + response);
    return key;
  }

  private String optionalAsyncOperationKey(JsonNode response) {
    return optionalText(
        response.path("headers"),
        "datalake-async-operation-key",
        "aidp-async-operation-key",
        "oidl-async-operation-key");
  }

  private void deleteCatalogIfPresent() {
    if (catalogDeleted || runner == null || invocationBuilder == null || catalogKey == null) {
      return;
    }
    CliTestLogger.info("CLEANUP", "Deleting catalog " + catalogKey);
    CliCommandResult result =
        runner.run(invocationBuilder.command("catalog", "delete", catalogKey, "--is-forced=true"));
    JsonNode response = responseJsonOrNull(result);
    if (response != null && hasStatus(response, 404)) {
      catalogDeleted = true;
      return;
    }
    if (result.exitCode() != 0) {
      CliTestLogger.block(
          "CLEANUP",
          "Failed to delete catalog:",
          result.combinedOutput(),
          config.cliLogMaxCharacters());
      return;
    }
    JsonNode deleteResponse = responseJson(result);
    assertStatusIn(deleteResponse, 202, 204);
    waitForOptionalAsyncOperationSucceeded(deleteResponse, CATALOG_ASYNC_TIMEOUT);
    waitForCatalogDeleted(catalogKey, CATALOG_DELETE_TIMEOUT);
    catalogDeleted = true;
  }

  private boolean isSucceededAsyncStatus(String status) {
    return "SUCCEEDED".equalsIgnoreCase(status) || "SUCCESS".equalsIgnoreCase(status);
  }

  private boolean isFailedAsyncStatus(String status) {
    return "FAILED".equalsIgnoreCase(status)
        || "CANCELED".equalsIgnoreCase(status)
        || "CANCELLED".equalsIgnoreCase(status);
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
      throw new AssertionError("Interrupted while waiting for catalog response.", e);
    }
  }
}
