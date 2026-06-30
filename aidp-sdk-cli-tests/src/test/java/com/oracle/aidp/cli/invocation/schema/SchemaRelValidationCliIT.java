package com.oracle.aidp.cli.invocation.schema;

import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.assertStatus;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.assertStatusIn;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.data;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.optionalText;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.requiredText;
import static com.oracle.aidp.cli.invocation.support.CliRelValidationSupport.asyncOperationKey;
import static com.oracle.aidp.cli.invocation.support.CliRelValidationSupport.collectionItems;
import static com.oracle.aidp.cli.invocation.support.CliRelValidationSupport.entity;
import static com.oracle.aidp.cli.invocation.support.CliRelValidationSupport.runStructured;
import static com.oracle.aidp.cli.invocation.support.CliRelValidationSupport.runStructuredWithBody;
import static com.oracle.aidp.cli.invocation.support.CliRelValidationSupport.uploadText;
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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SchemaRelValidationCliIT {
  private static final String SAMPLE_CSV = "id,name\n1,alice\n2,bob\n";

  private CliTestConfig config;
  private CliCommandRunner runner;
  private CliInvocationBuilder invocationBuilder;
  private String schemaName;
  private String updatedSchemaName;
  private String schemaKey;
  private String tableName;
  private String updatedTableName;
  private String tableKey;
  private String dataTableName;
  private String dataTableKey;
  private String viewName;
  private String updatedViewName;
  private String viewKey;
  private String uploadedSampleFileLocation;
  private final List<String> createdTableKeys = new ArrayList<>();
  private final List<String> createdViewKeys = new ArrayList<>();

  @BeforeClass(
      alwaysRun = true,
      groups = {"cli_tests", "cli_schema", "schema", "rel_validation"})
  public void setUp() {
    config = CliTestConfig.load();
    runner = new CliCommandRunner(config);
    invocationBuilder = new CliInvocationBuilder(config);
  }

  @Test(groups = {"cli_tests", "cli_schema", "schema", "rel_validation"}, priority = 0)
  public void testCreateSchemaCommand() {
    schemaName = config.schemaNamePrefix() + UUID.randomUUID().toString().replace("-", "");
    updatedSchemaName = schemaName + "_updated";
    String body =
        """
        {
          "displayName": %s,
          "catalogName": %s,
          "description": "Created by SchemaRelValidationCliIT",
          "properties": {
            "cliTest": "true"
          }
        }
        """
            .formatted(quoted(schemaName), quoted(config.schemaCatalogKey()));

    JsonNode response = runStructuredWithBody(runner, invocationBuilder, "schema", "create", body);

    assertStatusIn(response, 200, 201, 202);
    waitForOptionalAsyncOperationSucceeded(
        runner, invocationBuilder, response, config.resourceReadyTimeout(), config.pollInterval());
    schemaKey = waitForSchemaKey(schemaName);
    assertNotNull(asyncOperationKey(response), "Schema create should return an async operation key.");
  }

  @Test(
      groups = {"cli_tests", "cli_schema", "schema", "rel_validation"},
      priority = 1,
      dependsOnMethods = {"testCreateSchemaCommand"})
  public void testListSchemasCommand() {
    JsonNode response =
        runStructured(
            runner,
            invocationBuilder,
            "schema",
            "list",
            "--catalog-key",
            config.schemaCatalogKey(),
            "--display-name",
            schemaName,
            "--limit",
            "10");

    assertStatus(response, 200);
    assertTrue(
        collectionItems(response, "schemaCollection").stream().anyMatch(this::matchesCurrentSchema),
        "Schema list should contain the created schema.");
  }

  @Test(
      groups = {"cli_tests", "cli_schema", "schema", "rel_validation"},
      priority = 2,
      dependsOnMethods = {"testCreateSchemaCommand"})
  public void testGetSchemaCommand() {
    JsonNode response = runStructured(runner, invocationBuilder, "schema", "get", schemaKey);

    assertStatusIn(response, 200, 202);
    JsonNode schema = entity(response, "schema");
    assertEquals(requiredText(schema, "key"), schemaKey);
  }

  @Test(
      groups = {"cli_tests", "cli_schema", "schema", "rel_validation"},
      priority = 3,
      dependsOnMethods = {"testCreateSchemaCommand"})
  public void testListSchemaPermissionsCommand() {
    JsonNode response =
        runStructured(runner, invocationBuilder, "schema", "list-permissions", schemaKey, "--limit", "10");

    assertStatus(response, 200);
    assertNotNull(data(response), "Schema permissions response should contain data.");
  }

  @Test(
      groups = {"cli_tests", "cli_schema", "schema", "rel_validation"},
      priority = 4,
      dependsOnMethods = {"testCreateSchemaCommand"})
  public void testManageSchemaPermissionCommand() {
    JsonNode assignResponse =
        runStructuredWithBody(
            runner, invocationBuilder, "schema", "manage-permission", schemaPermissionBody(true), schemaKey);
    assertStatusIn(assignResponse, 200, 201, 202, 204);

    JsonNode revokeResponse =
        runStructuredWithBody(
            runner, invocationBuilder, "schema", "manage-permission", schemaPermissionBody(false), schemaKey);
    assertStatusIn(revokeResponse, 200, 201, 202, 204);
  }

  @Test(
      groups = {"cli_tests", "cli_schema", "schema", "rel_validation"},
      priority = 5,
      dependsOnMethods = {"testManageSchemaPermissionCommand"})
  public void testUpdateSchemaCommand() {
    String body =
        """
        {
          "displayName": %s,
          "description": "Updated by SchemaRelValidationCliIT",
          "properties": {
            "cliTest": "true",
            "updated": "true"
          }
        }
        """
            .formatted(quoted(schemaName));

    JsonNode response =
        runStructuredWithBody(runner, invocationBuilder, "schema", "update", body, schemaKey);

    assertStatusIn(response, 200, 202);
    waitForOptionalAsyncOperationSucceeded(
        runner, invocationBuilder, response, config.resourceReadyTimeout(), config.pollInterval());
    String updatedKey = optionalText(entity(response, "schema"), "key");
    if (updatedKey != null && !updatedKey.isBlank()) {
      schemaKey = updatedKey;
    }
  }

  @Test(
      groups = {"cli_tests", "cli_schema", "schema", "rel_validation"},
      priority = 6,
      dependsOnMethods = {"testUpdateSchemaCommand"})
  public void testGenerateTempFileUploadTargetCommand() throws Exception {
    JsonNode response =
        runStructured(runner, invocationBuilder, "schema", "generate-temp-file-upload-target", schemaKey);

    assertStatus(response, 200);
    JsonNode details = entity(response, "generateTempFileUploadTargetResponseDetails");
    String uploadTarget = requiredText(details, "tempFileUploadTarget", "temp_file_upload_target");
    uploadedSampleFileLocation = requiredText(details, "ociFilePath", "oci_file_path");
    uploadText(uploadTarget, uploadedSampleFileLocation, SAMPLE_CSV, config);
  }

  @Test(
      groups = {"cli_tests", "cli_schema", "schema", "rel_validation"},
      priority = 7,
      dependsOnMethods = {"testGenerateTempFileUploadTargetCommand"})
  public void testInferSchemaCommand() {
    JsonNode response =
        runStructuredWithBody(
            runner, invocationBuilder, "schema", "infer", inferSchemaBody(sampleFileLocation()), schemaKey);

    assertStatus(response, 200);
    assertNotNull(data(response), "Infer schema response should contain data.");
  }

  @Test(
      groups = {"cli_tests", "cli_schema", "schema", "rel_validation"},
      priority = 8,
      dependsOnMethods = {"testGenerateTempFileUploadTargetCommand"})
  public void testInferSchemaWithPreviewCommand() {
    JsonNode response =
        runStructuredWithBody(
            runner,
            invocationBuilder,
            "schema",
            "infer-with-preview",
            inferSchemaBody(sampleFileLocation()),
            schemaKey);

    assertStatus(response, 200);
    assertNotNull(data(response), "Infer schema preview response should contain data.");
  }

  @Test(
      groups = {"cli_tests", "cli_schema", "schema", "rel_validation"},
      priority = 9,
      dependsOnMethods = {"testUpdateSchemaCommand"})
  public void testCreateTableCommand() {
    tableName = config.schemaTableNamePrefix() + UUID.randomUUID().toString().replace("-", "");
    updatedTableName = tableName + "_updated";

    JsonNode response =
        runStructuredWithBody(
            runner, invocationBuilder, "schema", "create-table", createTableBody(tableName));

    assertStatusIn(response, 200, 201, 202);
    waitForOptionalAsyncOperationSucceeded(
        runner, invocationBuilder, response, config.resourceReadyTimeout(), config.pollInterval());
    tableKey = waitForTableKey(tableName);
    trackTable(tableKey);
  }

  @Test(
      groups = {"cli_tests", "cli_schema", "schema", "rel_validation"},
      priority = 10,
      dependsOnMethods = {"testCreateTableCommand"})
  public void testListTablesCommand() {
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
            tableName,
            "--limit",
            "10");

    assertStatus(response, 200);
    assertTrue(
        collectionItems(response, "tableCollection").stream().anyMatch(this::matchesCurrentTable),
        "Table list should contain the created table.");
  }

  @Test(
      groups = {"cli_tests", "cli_schema", "schema", "rel_validation"},
      priority = 11,
      dependsOnMethods = {"testCreateTableCommand"})
  public void testGetTableCommand() {
    JsonNode response = runStructured(runner, invocationBuilder, "schema", "get-table", tableKey);

    assertStatusIn(response, 200, 202);
    assertEquals(requiredText(entity(response, "table"), "key"), tableKey);
  }

  @Test(
      groups = {"cli_tests", "cli_schema", "schema", "rel_validation"},
      priority = 12,
      dependsOnMethods = {"testCreateTableCommand"})
  public void testListTablePermissionsCommand() {
    JsonNode response =
        runStructured(runner, invocationBuilder, "schema", "list-table-permissions", tableKey, "--limit", "10");

    assertStatus(response, 200);
    assertNotNull(data(response), "Table permissions response should contain data.");
  }

  @Test(
      groups = {"cli_tests", "cli_schema", "schema", "rel_validation"},
      priority = 13,
      dependsOnMethods = {"testCreateTableCommand"})
  public void testManageTablePermissionCommand() {
    JsonNode assignResponse =
        runStructuredWithBody(
            runner, invocationBuilder, "schema", "manage-table-permission", tablePermissionBody(true), tableKey);
    assertStatusIn(assignResponse, 200, 201, 202, 204);

    JsonNode revokeResponse =
        runStructuredWithBody(
            runner, invocationBuilder, "schema", "manage-table-permission", tablePermissionBody(false), tableKey);
    assertStatusIn(revokeResponse, 200, 201, 202, 204);
  }

  @Test(
      groups = {"cli_tests", "cli_schema", "schema", "rel_validation"},
      priority = 14,
      dependsOnMethods = {"testCreateTableCommand"})
  public void testRefreshTableCommand() {
    JsonNode response = runStructured(runner, invocationBuilder, "schema", "refresh-table", tableKey);

    assertStatusIn(response, 200, 202);
    waitForOptionalAsyncOperationSucceeded(
        runner, invocationBuilder, response, config.resourceReadyTimeout(), config.pollInterval());
  }

  @Test(
      groups = {"cli_tests", "cli_schema", "schema", "rel_validation"},
      priority = 15,
      dependsOnMethods = {"testCreateTableCommand"})
  public void testRetrieveParCommand() {
    JsonNode response = runStructured(runner, invocationBuilder, "schema", "retrieve-par", tableKey);

    assertStatus(response, 200);
    assertNotNull(data(response), "Retrieve PAR response should contain data.");
  }

  @Test(
      groups = {"cli_tests", "cli_schema", "schema", "rel_validation"},
      priority = 16,
      dependsOnMethods = {"testCreateTableCommand"})
  public void testUpdateTableCommand() {
    String body =
        """
        {
          "displayName": %s,
          "description": "Updated by SchemaRelValidationCliIT"
        }
        """
            .formatted(quoted(updatedTableName));

    JsonNode response =
        runStructuredWithBody(runner, invocationBuilder, "schema", "update-table", body, tableKey);

    assertStatusIn(response, 200, 202);
    waitForOptionalAsyncOperationSucceeded(
        runner, invocationBuilder, response, config.resourceReadyTimeout(), config.pollInterval());
    tableName = updatedTableName;
    tableKey = waitForTableKey(updatedTableName);
    trackTable(tableKey);
  }

  @Test(
      groups = {"cli_tests", "cli_schema", "schema", "rel_validation"},
      priority = 17,
      dependsOnMethods = {"testGenerateTempFileUploadTargetCommand"})
  public void testCreateDataTableCommand() {
    dataTableName = config.schemaTableNamePrefix() + "data_" + UUID.randomUUID().toString().replace("-", "");
    JsonNode response =
        runStructuredWithBody(
            runner, invocationBuilder, "schema", "create-data-table", createDataTableBody(dataTableName));

    assertStatusIn(response, 200, 201, 202);
    waitForOptionalAsyncOperationSucceeded(
        runner, invocationBuilder, response, config.resourceReadyTimeout(), config.pollInterval());
    dataTableKey = waitForTableKey(dataTableName);
    trackTable(dataTableKey);
  }

  @Test(
      groups = {"cli_tests", "cli_schema", "schema", "rel_validation"},
      priority = 18,
      dependsOnMethods = {"testUpdateTableCommand"})
  public void testCreateViewCommand() {
    viewName = config.schemaViewNamePrefix() + UUID.randomUUID().toString().replace("-", "");
    updatedViewName = viewName + "_updated";

    JsonNode response =
        runStructuredWithBody(runner, invocationBuilder, "schema", "create-view", createViewBody(viewName));

    assertStatusIn(response, 200, 201, 202);
    viewKey = optionalText(entity(response, "view"), "key");
    if (viewKey == null || viewKey.isBlank()) {
      waitForOptionalAsyncOperationSucceeded(
          runner, invocationBuilder, response, config.resourceReadyTimeout(), config.pollInterval());
      viewKey = waitForViewKey(viewName);
    }
    trackView(viewKey);
  }

  @Test(
      groups = {"cli_tests", "cli_schema", "schema", "rel_validation"},
      priority = 19,
      dependsOnMethods = {"testCreateViewCommand"})
  public void testListViewsCommand() {
    JsonNode response =
        runStructured(
            runner,
            invocationBuilder,
            "schema",
            "list-views",
            "--catalog-key",
            config.schemaCatalogKey(),
            "--schema-key",
            schemaKey,
            "--display-name",
            viewName,
            "--limit",
            "10");

    assertStatus(response, 200);
    assertTrue(
        collectionItems(response, "viewCollection").stream().anyMatch(this::matchesCurrentView),
        "View list should contain the created view.");
  }

  @Test(
      groups = {"cli_tests", "cli_schema", "schema", "rel_validation"},
      priority = 20,
      dependsOnMethods = {"testCreateViewCommand"})
  public void testGetViewCommand() {
    JsonNode response = runStructured(runner, invocationBuilder, "schema", "get-view", viewKey);

    assertStatusIn(response, 200, 202);
    assertEquals(requiredText(entity(response, "view"), "key"), viewKey);
  }

  @Test(
      groups = {"cli_tests", "cli_schema", "schema", "rel_validation"},
      priority = 21,
      dependsOnMethods = {"testCreateViewCommand"})
  public void testListViewPermissionsCommand() {
    JsonNode response =
        runStructured(runner, invocationBuilder, "schema", "list-view-permissions", viewKey, "--limit", "10");

    assertStatus(response, 200);
    assertNotNull(data(response), "View permissions response should contain data.");
  }

  @Test(
      groups = {"cli_tests", "cli_schema", "schema", "rel_validation"},
      priority = 22,
      dependsOnMethods = {"testCreateViewCommand"})
  public void testManageViewPermissionCommand() {
    JsonNode assignResponse =
        runStructuredWithBody(
            runner, invocationBuilder, "schema", "manage-view-permission", viewPermissionBody(true), viewKey);
    assertStatusIn(assignResponse, 200, 201, 202, 204);

    JsonNode revokeResponse =
        runStructuredWithBody(
            runner, invocationBuilder, "schema", "manage-view-permission", viewPermissionBody(false), viewKey);
    assertStatusIn(revokeResponse, 200, 201, 202, 204);
  }

  @Test(
      groups = {"cli_tests", "cli_schema", "schema", "rel_validation"},
      priority = 23,
      dependsOnMethods = {"testCreateViewCommand"})
  public void testUpdateViewCommand() {
    String body =
        """
        {
          "updateMode": "RENAME_VIEW",
          "viewUpdateDetails": {
            "displayName": %s
          }
        }
        """
            .formatted(quoted(updatedViewName));

    JsonNode response =
        runStructuredWithBody(runner, invocationBuilder, "schema", "update-view", body, viewKey);

    assertStatusIn(response, 200, 202);
    viewName = updatedViewName;
    String updatedKey = optionalText(entity(response, "view"), "key");
    if (updatedKey != null && !updatedKey.isBlank()) {
      viewKey = updatedKey;
      trackView(viewKey);
    } else {
      waitForOptionalAsyncOperationSucceeded(
          runner, invocationBuilder, response, config.resourceReadyTimeout(), config.pollInterval());
      viewKey = waitForViewKey(updatedViewName);
      trackView(viewKey);
    }
  }

  @Test(
      groups = {"cli_tests", "cli_schema", "schema", "rel_validation"},
      priority = 24,
      dependsOnMethods = {"testUpdateViewCommand"})
  public void testRefreshSchemaCommand() {
    JsonNode response = runStructured(runner, invocationBuilder, "schema", "refresh", schemaKey);

    assertStatusIn(response, 200, 202);
    if (response.path("status").asInt(-1) == 202) {
      assertNotNull(asyncOperationKey(response), "Schema refresh should return an async operation key.");
    }
  }

  @Test(
      groups = {"cli_tests", "cli_schema", "schema", "rel_validation"},
      priority = 25,
      dependsOnMethods = {"testRefreshSchemaCommand"})
  public void testDeleteViewCommand() {
    JsonNode response = runStructured(runner, invocationBuilder, "schema", "delete-view", viewKey);

    assertStatusIn(response, 200, 202, 204);
    waitForOptionalAsyncOperationSucceeded(
        runner, invocationBuilder, response, config.resourceReadyTimeout(), config.pollInterval());
    createdViewKeys.remove(viewKey);
    viewKey = null;
  }

  @Test(
      groups = {"cli_tests", "cli_schema", "schema", "rel_validation"},
      priority = 26,
      dependsOnMethods = {"testDeleteViewCommand"})
  public void testDeleteTableCommand() {
    JsonNode response = runStructured(runner, invocationBuilder, "schema", "delete-table", tableKey);

    assertStatusIn(response, 200, 202, 204);
    waitForOptionalAsyncOperationSucceeded(
        runner, invocationBuilder, response, config.resourceReadyTimeout(), config.pollInterval());
    createdTableKeys.remove(tableKey);
    tableKey = null;
  }

  @Test(
      groups = {"cli_tests", "cli_schema", "schema", "rel_validation"},
      priority = 27,
      dependsOnMethods = {"testDeleteTableCommand"})
  public void testDeleteSchemaCommand() {
    deleteDataTableFixture();

    JsonNode response =
        runStructured(
            runner,
            invocationBuilder,
            "schema",
            "delete",
            schemaKey,
            "--is-forced=true");

    assertStatusIn(response, 200, 202, 204);
    waitForOptionalAsyncOperationSucceeded(
        runner, invocationBuilder, response, config.resourceReadyTimeout(), config.pollInterval());
    schemaKey = null;
  }

  @AfterClass(
      alwaysRun = true,
      groups = {"cli_tests", "cli_schema", "schema", "rel_validation"})
  public void tearDown() {
    for (String createdViewKey : List.copyOf(createdViewKeys)) {
      deleteIgnoringNotFound("delete-view", createdViewKey);
    }
    createdViewKeys.clear();

    for (String createdTableKey : List.copyOf(createdTableKeys)) {
      deleteIgnoringNotFound("delete-table", createdTableKey);
    }
    createdTableKeys.clear();

    if (schemaKey != null) {
      CliCommandResult result =
          runner.run(
              invocationBuilder.command(
                  "schema", "delete", schemaKey, "--is-forced=true"));
      if (result.exitCode() != 0 && !isNotFound(result)) {
        throw new AssertionError("Failed to clean up schema " + schemaKey + ":\n" + result.combinedOutput());
      }
    }
  }

  private String createTableBody(String displayName) {
    return """
        {
          "displayName": %s,
          "description": "Created by SchemaRelValidationCliIT",
          "catalogKey": %s,
          "schemaKey": %s,
          "tableType": "MANAGED",
          "managedTableDefinition": {
            "managedTableDataFormat": %s
          },
          "tableFields": %s
        }
        """
        .formatted(
            quoted(displayName),
            quoted(config.schemaCatalogKey()),
            quoted(schemaKey),
            quoted(config.schemaManagedTableDataFormat()),
            tableFieldsJson());
  }

  private String createDataTableBody(String displayName) {
    return """
        {
          "displayName": %s,
          "description": "Created by SchemaRelValidationCliIT from sample CSV",
          "catalogKey": %s,
          "schemaKey": %s,
          "fileFormat": %s,
          "objectStorageLocationPath": %s,
          "managedTableDefinition": {
            "managedTableDataFormat": %s
          },
          "tableFields": %s,
          "selectedColumns": ["_c0", "_c1"]
        }
        """
        .formatted(
            quoted(displayName),
            quoted(config.schemaCatalogKey()),
            quoted(schemaKey),
            quoted(config.schemaInferDataFormat()),
            quoted(sampleFileLocation()),
            quoted(config.schemaManagedTableDataFormat()),
            inferredCsvTableFieldsJson());
  }

  private String createViewBody(String displayName) {
    return """
        {
          "displayName": %s,
          "description": "Created by SchemaRelValidationCliIT",
          "catalogKey": %s,
          "schemaKey": %s,
          "viewText": %s,
          "viewFields": [
            {
              "fieldName": "id",
              "fieldType": "INT",
              "fieldDescription": "CLI test id"
            }
          ]
        }
        """
        .formatted(
            quoted(displayName),
            quoted(config.schemaCatalogKey()),
            quoted(schemaKey),
            quoted("SELECT id FROM " + tableKey));
  }

  private String inferSchemaBody(String location) {
    return """
        {
          "dataFormat": %s,
          "location": %s,
          "numberOfPartitions": 0
        }
        """
        .formatted(quoted(config.schemaInferDataFormat()), quoted(location));
  }

  private String schemaPermissionBody(boolean assign) {
    return permissionBody(
        assign,
        "assignSchemaPermissionDetails",
        "revokeSchemaPermissionDetails",
        """
            "permissions": ["SELECT"]
            """);
  }

  private String tablePermissionBody(boolean assign) {
    return permissionBody(
        assign,
        "assignTablePermissionDetails",
        "revokeTablePermissionDetails",
        """
            "permissions": ["SELECT"],
            "includeColumns": [],
            "excludeColumns": []
            """);
  }

  private String viewPermissionBody(boolean assign) {
    return permissionBody(
        assign,
        "assignViewPermissionDetails",
        "revokeViewPermissionDetails",
        """
            "permissions": ["SELECT"],
            "includeColumns": [],
            "excludeColumns": []
            """);
  }

  private String permissionBody(
      boolean assign, String assignFieldName, String revokeFieldName, String permissionFields) {
    String fieldName = assign ? assignFieldName : revokeFieldName;
    return """
        {
          "%s": {
            "assignees": {
              "type": %s,
              "targets": [%s]
            },
            %s
          }
        }
        """
        .formatted(
            fieldName,
            quoted(config.schemaPermissionGranteeType()),
            quoted(config.schemaPermissionTarget()),
            permissionFields);
  }

  private String tableFieldsJson() {
    return """
        [
          {
            "fieldName": "id",
            "fieldType": "INT",
            "fieldDescription": "CLI test id"
          },
          {
            "fieldName": "name",
            "fieldType": "STRING",
            "fieldDescription": "CLI test name"
          }
        ]
        """;
  }

  private String inferredCsvTableFieldsJson() {
    return """
        [
          {
            "fieldName": "_c0",
            "fieldType": "STRING",
            "fieldDescription": "CLI test inferred column 0"
          },
          {
            "fieldName": "_c1",
            "fieldType": "STRING",
            "fieldDescription": "CLI test inferred column 1"
          }
        ]
        """;
  }

  private String sampleFileLocation() {
    assertNotNull(uploadedSampleFileLocation, "Sample CSV must be uploaded first.");
    return uploadedSampleFileLocation;
  }

  private String waitForSchemaKey(String displayName) {
    return waitForEntityKey(
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
    return waitForEntityKey(
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

  private String waitForViewKey(String displayName) {
    return waitForEntityKey(
        displayName,
        () -> {
          JsonNode response =
              runStructured(
                  runner,
                  invocationBuilder,
                  "schema",
                  "list-views",
                  "--catalog-key",
                  config.schemaCatalogKey(),
                  "--schema-key",
                  schemaKey,
                  "--display-name",
                  displayName,
                  "--limit",
                  "10");
          assertStatus(response, 200);
          return collectionItems(response, "viewCollection").stream()
              .filter(item -> displayName.equals(optionalText(item, "displayName", "display_name")))
              .findFirst()
              .map(item -> requiredText(item, "key"))
              .orElse(null);
        });
  }

  private String waitForEntityKey(String displayName, KeyLookup lookup) {
    Duration timeout = config.resourceReadyTimeout();
    long deadline = System.nanoTime() + timeout.toNanos();
    while (System.nanoTime() < deadline) {
      String key = lookup.get();
      if (key != null && !key.isBlank()) {
        return key;
      }
      sleep(config.pollInterval());
    }
    throw new AssertionError("Timed out waiting for schema entity " + displayName);
  }

  private boolean matchesCurrentSchema(JsonNode schema) {
    return schemaKey.equals(optionalText(schema, "key"))
        || schemaName.equals(optionalText(schema, "displayName", "display_name"));
  }

  private boolean matchesCurrentTable(JsonNode table) {
    return tableKey.equals(optionalText(table, "key"))
        || tableName.equals(optionalText(table, "displayName", "display_name"));
  }

  private boolean matchesCurrentView(JsonNode view) {
    return viewKey.equals(optionalText(view, "key"))
        || viewName.equals(optionalText(view, "displayName", "display_name"));
  }

  private void trackTable(String createdTableKey) {
    if (createdTableKey != null && !createdTableKey.isBlank() && !createdTableKeys.contains(createdTableKey)) {
      createdTableKeys.add(createdTableKey);
    }
  }

  private void trackView(String createdViewKey) {
    if (createdViewKey != null && !createdViewKey.isBlank() && !createdViewKeys.contains(createdViewKey)) {
      createdViewKeys.add(createdViewKey);
    }
  }

  private void deleteDataTableFixture() {
    if (dataTableKey == null) {
      return;
    }
    deleteIgnoringNotFound("delete-table", dataTableKey);
    createdTableKeys.remove(dataTableKey);
    dataTableKey = null;
  }

  private void deleteIgnoringNotFound(String command, String key) {
    if (key == null || key.isBlank()) {
      return;
    }
    CliCommandResult result = runner.run(invocationBuilder.command("schema", command, key));
    if (result.exitCode() != 0 && !isNotFound(result)) {
      throw new AssertionError("Failed to clean up " + command + " " + key + ":\n" + result.combinedOutput());
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
      throw new AssertionError("Interrupted while waiting for schema entity.", e);
    }
  }

  @FunctionalInterface
  private interface KeyLookup {
    String get();
  }
}
