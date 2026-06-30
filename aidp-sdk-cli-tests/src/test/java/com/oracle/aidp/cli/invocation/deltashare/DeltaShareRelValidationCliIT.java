package com.oracle.aidp.cli.invocation.deltashare;

import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.assertStatus;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.assertStatusIn;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.data;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.optionalText;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.requiredText;
import static com.oracle.aidp.cli.invocation.support.CliRelValidationSupport.collectionItems;
import static com.oracle.aidp.cli.invocation.support.CliRelValidationSupport.entity;
import static com.oracle.aidp.cli.invocation.support.CliRelValidationSupport.runStructured;
import static com.oracle.aidp.cli.invocation.support.CliRelValidationSupport.runStructuredWithBody;
import static com.oracle.aidp.cli.invocation.support.CliRelValidationSupport.waitForOptionalAsyncOperationSucceeded;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import com.fasterxml.jackson.databind.JsonNode;
import com.oracle.aidp.cli.invocation.config.CliTestConfig;
import com.oracle.aidp.cli.invocation.runner.CliCommandResult;
import com.oracle.aidp.cli.invocation.runner.CliCommandRunner;
import com.oracle.aidp.cli.invocation.runner.CliInvocationBuilder;
import java.time.Duration;
import java.util.UUID;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DeltaShareRelValidationCliIT {
  private CliTestConfig config;
  private CliCommandRunner runner;
  private CliInvocationBuilder invocationBuilder;
  private String shareName;
  private String shareKey;
  private String recipientName;
  private String recipientKey;
  private String schemaName;
  private String schemaKey;
  private String tableName;
  private String tableKey;
  private boolean shareAccessGranted;
  private boolean dataAssetAdded;

  @BeforeClass(
      alwaysRun = true,
      groups = {"cli_tests", "cli_delta_share", "deltashare", "rel_validation"})
  public void setUp() {
    config = CliTestConfig.load();
    runner = new CliCommandRunner(config);
    invocationBuilder = new CliInvocationBuilder(config);
  }

  @Test(groups = {"cli_tests", "cli_delta_share", "deltashare", "rel_validation"}, priority = 0)
  public void testCreateShareCommand() {
    shareName = config.deltaShareNamePrefix() + UUID.randomUUID().toString().replace("-", "");
    JsonNode response =
        runStructuredWithBody(
            runner,
            invocationBuilder,
            "delta-share",
            "create",
            """
            {
              "displayName": %s,
              "description": "Created by DeltaShareRelValidationCliIT"
            }
            """
                .formatted(quoted(shareName)));

    assertStatusIn(response, 200, 201);
    JsonNode share = entity(response, "share");
    shareKey = requiredText(share, "key");
    assertEquals(optionalText(share, "displayName", "display_name"), shareName);
  }

  @Test(groups = {"cli_tests", "cli_delta_share", "deltashare", "rel_validation"}, priority = 1)
  public void testCreateRecipientCommand() {
    recipientName = config.deltaShareRecipientNamePrefix() + UUID.randomUUID().toString().replace("-", "");
    JsonNode response =
        runStructuredWithBody(
            runner,
            invocationBuilder,
            "delta-share",
            "create-recipient",
            """
            {
              "displayName": %s,
              "description": "Created by DeltaShareRelValidationCliIT",
              "properties": {
                "cliTest": "true"
              }
            }
            """
                .formatted(quoted(recipientName)));

    assertStatusIn(response, 200, 201);
    JsonNode recipient = entity(response, "recipient");
    recipientKey = requiredText(recipient, "key");
    assertEquals(optionalText(recipient, "displayName", "display_name"), recipientName);
  }

  @Test(
      groups = {"cli_tests", "cli_delta_share", "deltashare", "rel_validation"},
      priority = 2,
      dependsOnMethods = {"testCreateShareCommand"})
  public void testListSharesCommand() {
    JsonNode response =
        runStructured(
            runner,
            invocationBuilder,
            "delta-share",
            "list",
            "--display-name",
            shareName,
            "--limit",
            "10");

    assertStatus(response, 200);
    assertTrue(
        collectionItems(response, "shareCollection").stream().anyMatch(this::matchesCurrentShare),
        "Share list should contain the created share.");
  }

  @Test(
      groups = {"cli_tests", "cli_delta_share", "deltashare", "rel_validation"},
      priority = 3,
      dependsOnMethods = {"testCreateRecipientCommand"})
  public void testListRecipientsCommand() {
    JsonNode response =
        runStructured(
            runner,
            invocationBuilder,
            "delta-share",
            "list-recipients",
            "--display-name",
            recipientName,
            "--limit",
            "10");

    assertStatus(response, 200);
    assertTrue(
        collectionItems(response, "recipientCollection").stream().anyMatch(this::matchesCurrentRecipient),
        "Recipient list should contain the created recipient.");
  }

  @Test(
      groups = {"cli_tests", "cli_delta_share", "deltashare", "rel_validation"},
      priority = 4,
      dependsOnMethods = {"testCreateShareCommand"})
  public void testGetShareCommand() {
    JsonNode response = runStructured(runner, invocationBuilder, "delta-share", "get", shareKey);

    assertStatus(response, 200);
    assertEquals(requiredText(entity(response, "share"), "key"), shareKey);
  }

  @Test(
      groups = {"cli_tests", "cli_delta_share", "deltashare", "rel_validation"},
      priority = 5,
      dependsOnMethods = {"testCreateRecipientCommand"})
  public void testGetRecipientCommand() {
    JsonNode response =
        runStructured(runner, invocationBuilder, "delta-share", "get-recipient", recipientKey);

    assertStatus(response, 200);
    assertEquals(requiredText(entity(response, "recipient"), "key"), recipientKey);
  }

  @Test(
      groups = {"cli_tests", "cli_delta_share", "deltashare", "rel_validation"},
      priority = 6,
      dependsOnMethods = {"testGetShareCommand"})
  public void testUpdateShareCommand() {
    String updatedName = shareName + "_updated";
    JsonNode response =
        runStructuredWithBody(
            runner,
            invocationBuilder,
            "delta-share",
            "update",
            """
            {
              "displayName": %s,
              "description": "Updated by DeltaShareRelValidationCliIT"
            }
            """
                .formatted(quoted(updatedName)),
            shareKey);

    assertStatusIn(response, 200, 202, 204);
    shareName = updatedName;
    shareKey = waitForShareKey(updatedName);
  }

  @Test(
      groups = {"cli_tests", "cli_delta_share", "deltashare", "rel_validation"},
      priority = 7,
      dependsOnMethods = {"testGetRecipientCommand"})
  public void testUpdateRecipientCommand() {
    String updatedName = recipientName + "_updated";
    JsonNode response =
        runStructuredWithBody(
            runner,
            invocationBuilder,
            "delta-share",
            "update-recipient",
            """
            {
              "displayName": %s,
              "description": "Updated by DeltaShareRelValidationCliIT",
              "properties": {
                "cliTest": "updated"
              }
            }
            """
                .formatted(quoted(updatedName)),
            recipientKey);

    assertStatusIn(response, 200, 202, 204);
    recipientName = updatedName;
    recipientKey = waitForRecipientKey(updatedName);
  }

  @Test(
      groups = {"cli_tests", "cli_delta_share", "deltashare", "rel_validation"},
      priority = 8,
      dependsOnMethods = {"testUpdateShareCommand"})
  public void testListSharePermissionsCommand() {
    JsonNode response =
        runStructured(runner, invocationBuilder, "delta-share", "list-permissions", shareKey, "--limit", "10");

    assertStatus(response, 200);
    assertNotNull(data(response), "Share permissions response should contain data.");
  }

  @Test(
      groups = {"cli_tests", "cli_delta_share", "deltashare", "rel_validation"},
      priority = 9,
      dependsOnMethods = {"testUpdateRecipientCommand"})
  public void testListRecipientPermissionsCommand() {
    JsonNode response =
        runStructured(
            runner,
            invocationBuilder,
            "delta-share",
            "list-recipient-permissions",
            recipientKey,
            "--limit",
            "10");

    assertStatus(response, 200);
    assertNotNull(data(response), "Recipient permissions response should contain data.");
  }

  @Test(
      groups = {"cli_tests", "cli_delta_share", "deltashare", "rel_validation"},
      priority = 10,
      dependsOnMethods = {"testUpdateShareCommand"})
  public void testManageSharePermissionCommand() {
    JsonNode assignResponse =
        runStructuredWithBody(
            runner,
            invocationBuilder,
            "delta-share",
            "manage-permission",
            sharePermissionBody(true),
            shareKey);
    assertStatusIn(assignResponse, 200, 201, 202, 204);

    JsonNode revokeResponse =
        runStructuredWithBody(
            runner,
            invocationBuilder,
            "delta-share",
            "manage-permission",
            sharePermissionBody(false),
            shareKey);
    assertStatusIn(revokeResponse, 200, 201, 202, 204);
  }

  @Test(
      groups = {"cli_tests", "cli_delta_share", "deltashare", "rel_validation"},
      priority = 11,
      dependsOnMethods = {"testUpdateRecipientCommand"})
  public void testManageRecipientPermissionCommand() {
    JsonNode assignResponse =
        runStructuredWithBody(
            runner,
            invocationBuilder,
            "delta-share",
            "manage-recipient-permission",
            recipientPermissionBody(true),
            recipientKey);
    assertStatusIn(assignResponse, 200, 201, 202, 204);

    JsonNode revokeResponse =
        runStructuredWithBody(
            runner,
            invocationBuilder,
            "delta-share",
            "manage-recipient-permission",
            recipientPermissionBody(false),
            recipientKey);
    assertStatusIn(revokeResponse, 200, 201, 202, 204);
  }

  @Test(
      groups = {"cli_tests", "cli_delta_share", "deltashare", "rel_validation"},
      priority = 12,
      dependsOnMethods = {"testUpdateShareCommand", "testUpdateRecipientCommand"})
  public void testManageAccessCommand() {
    JsonNode response =
        runStructuredWithBody(
            runner,
            invocationBuilder,
            "delta-share",
            "manage-access",
            manageAccessBody("GRANT"),
            shareKey);

    assertStatusIn(response, 200, 201, 202, 204);
    shareAccessGranted = true;
  }

  @Test(
      groups = {"cli_tests", "cli_delta_share", "deltashare", "rel_validation"},
      priority = 13,
      dependsOnMethods = {"testManageAccessCommand"})
  public void testListShareRecipientsCommand() {
    JsonNode response =
        runStructured(
            runner,
            invocationBuilder,
            "delta-share",
            "list-share-recipients",
            shareKey,
            "--limit",
            "10");

    assertStatus(response, 200);
    assertTrue(
        collectionItems(response, "recipientCollection").stream().anyMatch(this::matchesCurrentRecipient),
        "Share recipients list should contain the granted recipient.");
  }

  @Test(
      groups = {"cli_tests", "cli_delta_share", "deltashare", "rel_validation"},
      priority = 14,
      dependsOnMethods = {"testManageAccessCommand"})
  public void testListRecipientSharesCommand() {
    JsonNode response =
        runStructured(
            runner,
            invocationBuilder,
            "delta-share",
            "list-recipient-shares",
            recipientKey,
            "--limit",
            "10");

    assertStatus(response, 200);
    assertTrue(
        collectionItems(response, "shareCollection").stream().anyMatch(this::matchesCurrentShare),
        "Recipient shares list should contain the granted share.");
  }

  @Test(
      groups = {"cli_tests", "cli_delta_share", "deltashare", "rel_validation"},
      priority = 15,
      dependsOnMethods = {"testUpdateShareCommand"})
  public void testManageDataAssetCommand() {
    createSchemaTableFixture();
    JsonNode response =
        runStructuredWithBody(
            runner,
            invocationBuilder,
            "delta-share",
            "manage-data-asset",
            manageDataAssetBody("ADD"),
            shareKey);

    assertStatusIn(response, 200, 201, 202, 204);
    dataAssetAdded = true;
  }

  @Test(
      groups = {"cli_tests", "cli_delta_share", "deltashare", "rel_validation"},
      priority = 16,
      dependsOnMethods = {"testManageDataAssetCommand"})
  public void testListDataAssetsCommand() {
    JsonNode response =
        runStructured(
            runner,
            invocationBuilder,
            "delta-share",
            "list-data-assets",
            shareKey,
            "--limit",
            "10");

    assertStatus(response, 200);
    String catalogPrefix = config.schemaCatalogKey() + ".";
    String listedAssetName =
        tableKey.startsWith(catalogPrefix) ? tableKey.substring(catalogPrefix.length()) : tableKey;
    assertTrue(
        collectionItems(response, "shareDataAssetCollection").stream()
            .anyMatch(
                asset -> {
                  String assetName = optionalText(asset, "name", "key");
                  return tableKey.equals(assetName)
                      || (listedAssetName.equals(assetName)
                          && config.schemaCatalogKey().equals(optionalText(asset, "catalog")));
                }),
        "Share data assets list should contain the added table asset.");
  }

  @Test(
      groups = {"cli_tests", "cli_delta_share", "deltashare", "rel_validation"},
      priority = 17,
      dependsOnMethods = {"testListDataAssetsCommand", "testListRecipientSharesCommand"})
  public void testDeleteShareCommand() {
    removeDataAsset();
    revokeShareAccess();
    JsonNode response = runStructured(runner, invocationBuilder, "delta-share", "delete", shareKey);

    assertStatusIn(response, 200, 202, 204);
    shareKey = null;
  }

  @Test(
      groups = {"cli_tests", "cli_delta_share", "deltashare", "rel_validation"},
      priority = 18,
      dependsOnMethods = {"testDeleteShareCommand"})
  public void testDeleteRecipientCommand() {
    JsonNode response =
        runStructured(runner, invocationBuilder, "delta-share", "delete-recipient", recipientKey);

    assertStatusIn(response, 200, 202, 204);
    recipientKey = null;
  }

  @AfterClass(
      alwaysRun = true,
      groups = {"cli_tests", "cli_delta_share", "deltashare", "rel_validation"})
  public void tearDown() {
    removeDataAsset();
    revokeShareAccess();
    deleteDeltaResource("delete", shareKey);
    shareKey = null;
    deleteDeltaResource("delete-recipient", recipientKey);
    recipientKey = null;
    deleteSchemaFixture();
  }

  private String sharePermissionBody(boolean assign) {
    return permissionBody(assign, "assignSharePermissionDetails", "revokeSharePermissionDetails");
  }

  private String recipientPermissionBody(boolean assign) {
    return permissionBody(assign, "assignRecipientPermissionDetails", "revokeRecipientPermissionDetails");
  }

  private String permissionBody(boolean assign, String assignFieldName, String revokeFieldName) {
    return """
        {
          "%s": {
            "assignees": {
              "type": %s,
              "targets": [%s]
            },
            "permissions": ["READ"]
          }
        }
        """
        .formatted(
            assign ? assignFieldName : revokeFieldName,
            quoted(config.deltaSharePermissionGranteeType()),
            quoted(config.deltaSharePermissionTarget()));
  }

  private String manageAccessBody(String action) {
    return """
        {
          "action": %s,
          "recipient": %s
        }
        """
        .formatted(quoted(action), quoted(recipientKey));
  }

  private String manageDataAssetBody(String action) {
    return """
        {
          "action": %s,
          "type": "TABLE",
          "name": %s,
          "description": "Managed by DeltaShareRelValidationCliIT"
        }
        """
        .formatted(quoted(action), quoted(tableKey));
  }

  private void createSchemaTableFixture() {
    if (tableKey != null) {
      return;
    }
    schemaName = config.schemaNamePrefix() + "delta_" + UUID.randomUUID().toString().replace("-", "");
    JsonNode createSchemaResponse =
        runStructuredWithBody(
            runner,
            invocationBuilder,
            "schema",
            "create",
            """
            {
              "displayName": %s,
              "catalogName": %s,
              "description": "Created by DeltaShareRelValidationCliIT",
              "properties": {
                "cliTest": "deltaShare"
              }
            }
            """
                .formatted(quoted(schemaName), quoted(config.schemaCatalogKey())));
    assertStatusIn(createSchemaResponse, 200, 201, 202);
    waitForOptionalAsyncOperationSucceeded(
        runner, invocationBuilder, createSchemaResponse, config.resourceReadyTimeout(), config.pollInterval());
    schemaKey = waitForSchemaKey(schemaName);

    tableName = config.schemaTableNamePrefix() + "delta_" + UUID.randomUUID().toString().replace("-", "");
    JsonNode createTableResponse =
        runStructuredWithBody(
            runner,
            invocationBuilder,
            "schema",
            "create-table",
            """
            {
              "displayName": %s,
              "description": "Created by DeltaShareRelValidationCliIT",
              "catalogKey": %s,
              "schemaKey": %s,
              "tableType": "MANAGED",
              "managedTableDefinition": {
                "managedTableDataFormat": "DELTA"
              },
              "tableFields": [
                {
                  "fieldName": "id",
                  "fieldType": "INT",
                  "fieldDescription": "CLI test id"
                }
              ],
              "tableProperties": [
                {
                  "propertyName": "delta.minReaderVersion",
                  "propertyValue": "2"
                },
                {
                  "propertyName": "delta.minWriterVersion",
                  "propertyValue": "5"
                },
                {
                  "propertyName": "delta.columnMapping.mode",
                  "propertyValue": "name"
                }
              ]
            }
            """
                .formatted(
                    quoted(tableName),
                    quoted(config.schemaCatalogKey()),
                    quoted(schemaKey)));
    assertStatusIn(createTableResponse, 200, 201, 202);
    waitForOptionalAsyncOperationSucceeded(
        runner, invocationBuilder, createTableResponse, config.resourceReadyTimeout(), config.pollInterval());
    tableKey = waitForTableKey(tableName);
  }

  private String waitForShareKey(String displayName) {
    return waitForKey(
        displayName,
        () -> {
          JsonNode response =
              runStructured(
                  runner,
                  invocationBuilder,
                  "delta-share",
                  "list",
                  "--display-name",
                  displayName,
                  "--limit",
                  "10");
          assertStatus(response, 200);
          return collectionItems(response, "shareCollection").stream()
              .filter(item -> displayName.equals(optionalText(item, "displayName", "display_name")))
              .findFirst()
              .map(item -> requiredText(item, "key"))
              .orElse(null);
        });
  }

  private String waitForRecipientKey(String displayName) {
    return waitForKey(
        displayName,
        () -> {
          JsonNode response =
              runStructured(
                  runner,
                  invocationBuilder,
                  "delta-share",
                  "list-recipients",
                  "--display-name",
                  displayName,
                  "--limit",
                  "10");
          assertStatus(response, 200);
          return collectionItems(response, "recipientCollection").stream()
              .filter(item -> displayName.equals(optionalText(item, "displayName", "display_name")))
              .findFirst()
              .map(item -> requiredText(item, "key"))
              .orElse(null);
        });
  }

  private String waitForSchemaKey(String displayName) {
    return waitForKey(
        displayName,
        () -> {
          JsonNode response =
              runStructured(
                  runner,
                  invocationBuilder,
                  "schema",
                  "list",
                  "--catalog-key",
                  config.schemaCatalogKey(),
                  "--display-name",
                  displayName,
                  "--limit",
                  "10");
          assertStatus(response, 200);
          return collectionItems(response, "schemaCollection").stream()
              .filter(item -> displayName.equals(optionalText(item, "displayName", "display_name")))
              .findFirst()
              .map(item -> requiredText(item, "key"))
              .orElse(null);
        });
  }

  private String waitForTableKey(String displayName) {
    return waitForKey(
        displayName,
        () -> {
          JsonNode response =
              runStructured(
                  runner,
                  invocationBuilder,
                  "schema",
                  "list-tables",
                  "--catalog-key",
                  config.schemaCatalogKey(),
                  "--schema-key",
                  schemaKey,
                  "--display-name",
                  displayName,
                  "--limit",
                  "10");
          assertStatus(response, 200);
          return collectionItems(response, "tableCollection").stream()
              .filter(item -> displayName.equals(optionalText(item, "displayName", "display_name")))
              .findFirst()
              .map(item -> requiredText(item, "key"))
              .orElse(null);
        });
  }

  private String waitForKey(String displayName, KeyLookup lookup) {
    Duration timeout = config.resourceReadyTimeout();
    long deadline = System.nanoTime() + timeout.toNanos();
    while (System.nanoTime() < deadline) {
      String key = lookup.get();
      if (key != null && !key.isBlank()) {
        return key;
      }
      sleep(config.pollInterval());
    }
    throw new AssertionError("Timed out waiting for Delta Share fixture " + displayName);
  }

  private boolean matchesCurrentShare(JsonNode share) {
    return shareKey.equals(optionalText(share, "key"))
        || shareName.equals(optionalText(share, "displayName", "display_name"));
  }

  private boolean matchesCurrentRecipient(JsonNode recipient) {
    return recipientKey.equals(optionalText(recipient, "key"))
        || recipientName.equals(optionalText(recipient, "displayName", "display_name"));
  }

  private void removeDataAsset() {
    if (!dataAssetAdded || shareKey == null || tableKey == null) {
      return;
    }
    CliCommandResult result =
        runner.run(
            invocationBuilder.commandWithBody(
                "delta-share", "manage-data-asset", manageDataAssetBody("REMOVE"), shareKey));
    if (result.exitCode() != 0 && !isNotFound(result)) {
      throw new AssertionError("Failed to remove Delta Share data asset:\n" + result.combinedOutput());
    }
    dataAssetAdded = false;
  }

  private void revokeShareAccess() {
    if (!shareAccessGranted || shareKey == null || recipientKey == null) {
      return;
    }
    CliCommandResult result =
        runner.run(
            invocationBuilder.commandWithBody(
                "delta-share", "manage-access", manageAccessBody("REVOKE"), shareKey));
    if (result.exitCode() != 0 && !isNotFound(result)) {
      throw new AssertionError("Failed to revoke Delta Share access:\n" + result.combinedOutput());
    }
    shareAccessGranted = false;
  }

  private void deleteDeltaResource(String command, String key) {
    if (key == null || key.isBlank()) {
      return;
    }
    CliCommandResult result = runner.run(invocationBuilder.command("delta-share", command, key));
    if (result.exitCode() != 0 && !isNotFound(result)) {
      throw new AssertionError("Failed to clean up delta-share " + command + " " + key + ":\n" + result.combinedOutput());
    }
  }

  private void deleteSchemaFixture() {
    if (tableKey != null) {
      CliCommandResult result = runner.run(invocationBuilder.command("schema", "delete-table", tableKey));
      if (result.exitCode() != 0 && !isNotFound(result)) {
        throw new AssertionError("Failed to clean up delta-share table fixture:\n" + result.combinedOutput());
      }
      tableKey = null;
    }
    if (schemaKey != null) {
      CliCommandResult result =
          runner.run(invocationBuilder.command("schema", "delete", schemaKey, "--is-forced=true"));
      if (result.exitCode() != 0 && !isNotFound(result)) {
        throw new AssertionError("Failed to clean up delta-share schema fixture:\n" + result.combinedOutput());
      }
      schemaKey = null;
    }
  }

  private boolean isNotFound(CliCommandResult result) {
    String output = result.combinedOutput();
    return output.contains("\"status\" : 404")
        || output.contains("\"status\":404")
        || output.contains("NotAuthorizedOrNotFound")
        || output.contains("not found")
        || output.contains("Not Found");
  }

  private static String quoted(String value) {
    assertFalse(value == null || value.isBlank(), "Expected a non-empty value.");
    return "\"" + value.replace("\\", "\\\\").replace("\"", "\\\"") + "\"";
  }

  private static void sleep(Duration duration) {
    try {
      Thread.sleep(duration.toMillis());
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new AssertionError("Interrupted while waiting for Delta Share fixture.", e);
    }
  }

  @FunctionalInterface
  private interface KeyLookup {
    String get();
  }
}
