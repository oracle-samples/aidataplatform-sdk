package com.oracle.aidp.sdk.schema;

import static com.oracle.aidp.sdk.support.SdkTestSupport.assertSuccessful;
import static com.oracle.aidp.sdk.support.SdkTestSupport.isBlank;
import static com.oracle.aidp.sdk.support.SdkTestSupport.requestId;
import static com.oracle.aidp.sdk.support.SdkTestSupport.requireValue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import com.oracle.aidp.sdk.client.SdkClients;
import com.oracle.aidp.sdk.config.SdkTestConfig;
import com.oracle.aidataplatform.dp.SchemaClient;
import com.oracle.aidataplatform.dp.model.AssignSchemaPermissionDetails;
import com.oracle.aidataplatform.dp.model.AssignTablePermissionDetails;
import com.oracle.aidataplatform.dp.model.AssignViewPermissionDetails;
import com.oracle.aidataplatform.dp.model.CreateDataTableDetails;
import com.oracle.aidataplatform.dp.model.CreateSchemaDetails;
import com.oracle.aidataplatform.dp.model.CreateTableDetails;
import com.oracle.aidataplatform.dp.model.CreateViewDetails;
import com.oracle.aidataplatform.dp.model.DataFormat;
import com.oracle.aidataplatform.dp.model.ExternalTableDefinition;
import com.oracle.aidataplatform.dp.model.ExternalTableLocationType;
import com.oracle.aidataplatform.dp.model.GranteeType;
import com.oracle.aidataplatform.dp.model.ManagedTableDefinition;
import com.oracle.aidataplatform.dp.model.ManageSchemaPermissionDetails;
import com.oracle.aidataplatform.dp.model.ManageTablePermissionDetails;
import com.oracle.aidataplatform.dp.model.ManageViewPermissionDetails;
import com.oracle.aidataplatform.dp.model.PerformInferSchemaDetails;
import com.oracle.aidataplatform.dp.model.PermissionAssignees;
import com.oracle.aidataplatform.dp.model.RevokeSchemaPermissionDetails;
import com.oracle.aidataplatform.dp.model.RevokeTablePermissionDetails;
import com.oracle.aidataplatform.dp.model.RevokeViewPermissionDetails;
import com.oracle.aidataplatform.dp.model.SchemaPrivilegeForManage;
import com.oracle.aidataplatform.dp.model.SortOrder;
import com.oracle.aidataplatform.dp.model.TableFieldDetails;
import com.oracle.aidataplatform.dp.model.TablePrivilegeForManage;
import com.oracle.aidataplatform.dp.model.TableType;
import com.oracle.aidataplatform.dp.model.UpdateSchemaDetails;
import com.oracle.aidataplatform.dp.model.UpdateTableDetails;
import com.oracle.aidataplatform.dp.model.UpdateViewDetails;
import com.oracle.aidataplatform.dp.model.ViewFieldDetails;
import com.oracle.aidataplatform.dp.model.ViewPrivilegeForManage;
import com.oracle.aidataplatform.dp.model.ViewUpdateDetails;
import com.oracle.aidataplatform.dp.requests.CreateDataTableRequest;
import com.oracle.aidataplatform.dp.requests.CreateSchemaRequest;
import com.oracle.aidataplatform.dp.requests.CreateTableRequest;
import com.oracle.aidataplatform.dp.requests.CreateViewRequest;
import com.oracle.aidataplatform.dp.requests.DeleteSchemaRequest;
import com.oracle.aidataplatform.dp.requests.DeleteTableRequest;
import com.oracle.aidataplatform.dp.requests.DeleteViewRequest;
import com.oracle.aidataplatform.dp.requests.GenerateTempFileUploadTargetRequest;
import com.oracle.aidataplatform.dp.requests.GetSchemaRequest;
import com.oracle.aidataplatform.dp.requests.GetTableRequest;
import com.oracle.aidataplatform.dp.requests.GetViewRequest;
import com.oracle.aidataplatform.dp.requests.ListSchemaPermissionsRequest;
import com.oracle.aidataplatform.dp.requests.ListSchemasRequest;
import com.oracle.aidataplatform.dp.requests.ListTablePermissionsRequest;
import com.oracle.aidataplatform.dp.requests.ListTablesRequest;
import com.oracle.aidataplatform.dp.requests.ListViewPermissionsRequest;
import com.oracle.aidataplatform.dp.requests.ListViewsRequest;
import com.oracle.aidataplatform.dp.requests.ManageSchemaPermissionRequest;
import com.oracle.aidataplatform.dp.requests.ManageTablePermissionRequest;
import com.oracle.aidataplatform.dp.requests.ManageViewPermissionRequest;
import com.oracle.aidataplatform.dp.requests.PerformInferSchemaRequest;
import com.oracle.aidataplatform.dp.requests.PerformInferSchemaWithPreviewRequest;
import com.oracle.aidataplatform.dp.requests.RefreshSchemaRequest;
import com.oracle.aidataplatform.dp.requests.RefreshTableRequest;
import com.oracle.aidataplatform.dp.requests.RetrieveParRequest;
import com.oracle.aidataplatform.dp.requests.UpdateSchemaRequest;
import com.oracle.aidataplatform.dp.requests.UpdateTableRequest;
import com.oracle.aidataplatform.dp.requests.UpdateViewRequest;
import com.oracle.aidataplatform.dp.responses.CreateDataTableResponse;
import com.oracle.aidataplatform.dp.responses.CreateSchemaResponse;
import com.oracle.aidataplatform.dp.responses.CreateTableResponse;
import com.oracle.aidataplatform.dp.responses.CreateViewResponse;
import com.oracle.aidataplatform.dp.responses.DeleteSchemaResponse;
import com.oracle.aidataplatform.dp.responses.DeleteTableResponse;
import com.oracle.aidataplatform.dp.responses.DeleteViewResponse;
import com.oracle.aidataplatform.dp.responses.GenerateTempFileUploadTargetResponse;
import com.oracle.aidataplatform.dp.responses.GetSchemaResponse;
import com.oracle.aidataplatform.dp.responses.GetTableResponse;
import com.oracle.aidataplatform.dp.responses.GetViewResponse;
import com.oracle.aidataplatform.dp.responses.ListSchemaPermissionsResponse;
import com.oracle.aidataplatform.dp.responses.ListSchemasResponse;
import com.oracle.aidataplatform.dp.responses.ListTablePermissionsResponse;
import com.oracle.aidataplatform.dp.responses.ListTablesResponse;
import com.oracle.aidataplatform.dp.responses.ListViewPermissionsResponse;
import com.oracle.aidataplatform.dp.responses.ListViewsResponse;
import com.oracle.aidataplatform.dp.responses.ManageSchemaPermissionResponse;
import com.oracle.aidataplatform.dp.responses.ManageTablePermissionResponse;
import com.oracle.aidataplatform.dp.responses.ManageViewPermissionResponse;
import com.oracle.aidataplatform.dp.responses.PerformInferSchemaResponse;
import com.oracle.aidataplatform.dp.responses.PerformInferSchemaWithPreviewResponse;
import com.oracle.aidataplatform.dp.responses.RefreshSchemaResponse;
import com.oracle.aidataplatform.dp.responses.RefreshTableResponse;
import com.oracle.aidataplatform.dp.responses.RetrieveParResponse;
import com.oracle.aidataplatform.dp.responses.UpdateSchemaResponse;
import com.oracle.aidataplatform.dp.responses.UpdateTableResponse;
import com.oracle.aidataplatform.dp.responses.UpdateViewResponse;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.objectstorage.ObjectStorageClient;
import com.oracle.bmc.objectstorage.requests.PutObjectRequest;
import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SchemaSdkIT {
  private SdkTestConfig config;
  private SchemaClient schemaClient;
  private String createdSchemaKey;
  private String createdTableKey;
  private String createdViewKey;
  private String uploadedSampleFileLocation;
  private final List<String> createdTableKeys = new ArrayList<>();
  private final List<String> createdViewKeys = new ArrayList<>();

  @BeforeClass(
      alwaysRun = true,
      groups = {"sdk_tests", "sdk_schema", "schema", "rel_validation"})
  public void setUp() throws Exception {
    config = SdkTestConfig.load();
    schemaClient = SdkClients.schemaClient(config);
  }

  @Test(groups = {"sdk_tests", "sdk_schema", "schema", "rel_validation"}, priority = 0)
  public void listSchemasTest() {
    ListSchemasResponse response = listSchemas(null, 10);

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getSchemaCollection());
    assertNotNull(response.getSchemaCollection().getItems());
  }

  @Test(groups = {"sdk_tests", "sdk_schema", "schema", "rel_validation"}, priority = 1)
  public void getSchemaTest() {
    String schemaKey = schemaKey();

    GetSchemaResponse response = getSchema(schemaKey);

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getSchema());
    assertEquals(response.getSchema().getKey(), schemaKey);
  }

  @Test(groups = {"sdk_tests", "sdk_schema", "schema", "rel_validation"}, priority = 2)
  public void listSchemaPermissionsTest() {
    String schemaKey = schemaKey();

    ListSchemaPermissionsResponse response = listSchemaPermissions(schemaKey);

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getSchemaPermissionCollection());
    assertNotNull(response.getSchemaPermissionCollection().getItems());
  }

  @Test(groups = {"sdk_tests", "sdk_schema", "schema", "rel_validation"}, priority = 3)
  public void listTablesTest() {
    String schemaKey = schemaKey();

    ListTablesResponse response = listTables(schemaKey, null, 10);

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getTableCollection());
    assertNotNull(response.getTableCollection().getItems());
  }

  @Test(groups = {"sdk_tests", "sdk_schema", "schema", "rel_validation"}, priority = 4)
  public void getTableTest() throws Exception {
    String tableKey = tableKey();

    GetTableResponse response = getTable(tableKey);

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getTable());
    assertEquals(response.getTable().getKey(), tableKey);
  }

  @Test(groups = {"sdk_tests", "sdk_schema", "schema", "rel_validation"}, priority = 5)
  public void listTablePermissionsTest() throws Exception {
    String tableKey = tableKey();

    ListTablePermissionsResponse response = listTablePermissions(tableKey);

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getTablePermissionCollection());
    assertNotNull(response.getTablePermissionCollection().getItems());
  }

  @Test(groups = {"sdk_tests", "sdk_schema", "schema", "rel_validation"}, priority = 6)
  public void listViewsTest() {
    String schemaKey = schemaKey();

    ListViewsResponse response = listViews(schemaKey, null, 10);

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getViewCollection());
    assertNotNull(response.getViewCollection().getItems());
  }

  @Test(groups = {"sdk_tests", "sdk_schema", "schema", "rel_validation"}, priority = 7)
  public void getViewTest() throws Exception {
    String viewKey = viewKey();

    GetViewResponse response = getView(viewKey);

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getView());
    assertEquals(response.getView().getKey(), viewKey);
  }

  @Test(groups = {"sdk_tests", "sdk_schema", "schema", "rel_validation"}, priority = 8)
  public void listViewPermissionsTest() throws Exception {
    String viewKey = viewKey();

    ListViewPermissionsResponse response = listViewPermissions(viewKey);

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getViewPermissionCollection());
    assertNotNull(response.getViewPermissionCollection().getItems());
  }

  @Test(groups = {"sdk_tests", "sdk_schema", "schema", "rel_validation"}, priority = 20)
  public void schemaMutationFlowTest() throws Exception {
    if (!config.runSchemaMutationTests()) {
      throw new SkipException("Set sdkRunSchemaMutationTests=true to run schema mutation tests.");
    }

    String suffix = Long.toString(System.currentTimeMillis());
    String displayName = config.schemaNamePrefix() + suffix;
    String updatedDisplayName = displayName + "_updated";

    CreateSchemaResponse createResponse =
        schemaClient.createSchema(
            CreateSchemaRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .createSchemaDetails(
                    CreateSchemaDetails.builder()
                        .displayName(displayName)
                        .catalogName(config.catalogKey())
                        .description("Created by SchemaSdkIT")
                        .properties(Map.of("sdkTest", "true"))
                        .build())
                .shouldUpdateRecent(false)
                .opcRetryToken(requestId("create-schema-retry"))
                .opcRequestId(requestId("create-schema"))
                .build());
    assertSuccessful(createResponse.get__httpStatusCode__());
    assertNotNull(createResponse.getOpcRequestId());
    assertNotNull(createResponse.getAidpAsyncOperationKey());

    createdSchemaKey = createdKey(createResponse.getLocation(), config.catalogKey(), displayName);
    createdSchemaKey = waitForSchema(createdSchemaKey, displayName);

    GetSchemaResponse getResponse = getSchema(createdSchemaKey);
    assertSuccessful(getResponse.get__httpStatusCode__());
    assertNotNull(getResponse.getSchema());
    assertEquals(getResponse.getSchema().getKey(), createdSchemaKey);

    assertSuccessful(listSchemaPermissions(createdSchemaKey).get__httpStatusCode__());

    if (config.runSchemaPermissionMutationTests()) {
      ManageSchemaPermissionResponse assignResponse =
          manageSchemaPermission(createdSchemaKey, true, schemaPermission());
      assertSuccessful(assignResponse.get__httpStatusCode__());

      ManageSchemaPermissionResponse revokeResponse =
          manageSchemaPermission(createdSchemaKey, false, schemaPermission());
      assertSuccessful(revokeResponse.get__httpStatusCode__());
    }

    if (config.runSchemaRefreshTests()) {
      RefreshSchemaResponse refreshResponse =
          schemaClient.refreshSchema(
              RefreshSchemaRequest.builder()
                  .aiDataPlatformId(config.dataHubId())
                  .schemaKey(createdSchemaKey)
                  .shouldUpdateRecent(false)
                  .opcRetryToken(requestId("refresh-schema-retry"))
                  .opcRequestId(requestId("refresh-schema"))
                  .build());
      assertSuccessful(refreshResponse.get__httpStatusCode__());
      assertNotNull(refreshResponse.getOpcRequestId());
    }

    UpdateSchemaResponse updateResponse =
        schemaClient.updateSchema(
            UpdateSchemaRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .schemaKey(createdSchemaKey)
                .updateSchemaDetails(
                    UpdateSchemaDetails.builder()
                        .displayName(updatedDisplayName)
                        .description("Updated by SchemaSdkIT")
                        .properties(Map.of("sdkTest", "true", "updated", "true"))
                        .build())
                .shouldUpdateRecent(false)
                .opcRequestId(requestId("update-schema"))
                .build());
    assertSuccessful(updateResponse.get__httpStatusCode__());
    assertNotNull(updateResponse.getOpcRequestId());
    if (updateResponse.getSchema() != null && !isBlank(updateResponse.getSchema().getKey())) {
      createdSchemaKey = updateResponse.getSchema().getKey();
    } else {
      createdSchemaKey = waitForSchema(createdKey(null, config.catalogKey(), updatedDisplayName), updatedDisplayName);
    }

    DeleteSchemaResponse deleteResponse = deleteSchema(createdSchemaKey);
    assertSuccessful(deleteResponse.get__httpStatusCode__());
    assertNotNull(deleteResponse.getOpcRequestId());
    createdSchemaKey = null;
  }

  @Test(groups = {"sdk_tests", "sdk_schema", "schema", "rel_validation"}, priority = 21)
  public void tableMutationFlowTest() throws Exception {
    if (!config.runSchemaTableMutationTests()) {
      throw new SkipException("Set sdkRunSchemaTableMutationTests=true to run table mutation tests.");
    }
    String schemaKey = schemaKey();
    String suffix = Long.toString(System.currentTimeMillis());
    String displayName = config.schemaTableNamePrefix() + suffix;
    String updatedDisplayName = displayName + "_updated";

    CreateTableResponse createResponse =
        schemaClient.createTable(
            CreateTableRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .createTableDetails(createTableDetails(schemaKey, displayName))
                .shouldUpdateRecent(false)
                .opcRetryToken(requestId("create-table-retry"))
                .opcRequestId(requestId("create-table"))
                .build());
    assertSuccessful(createResponse.get__httpStatusCode__());
    assertNotNull(createResponse.getOpcRequestId());
    assertNotNull(createResponse.getAidpAsyncOperationKey());

    createdTableKey = createdKey(createResponse.getLocation(), schemaKey, displayName);
    createdTableKey = waitForTable(schemaKey, createdTableKey, displayName);
    trackCreatedTable(createdTableKey);

    assertSuccessful(getTable(createdTableKey).get__httpStatusCode__());
    assertSuccessful(listTablePermissions(createdTableKey).get__httpStatusCode__());

    if (config.runSchemaPermissionMutationTests()) {
      ManageTablePermissionResponse assignResponse =
          manageTablePermission(createdTableKey, true, tablePermission());
      assertSuccessful(assignResponse.get__httpStatusCode__());

      ManageTablePermissionResponse revokeResponse =
          manageTablePermission(createdTableKey, false, tablePermission());
      assertSuccessful(revokeResponse.get__httpStatusCode__());
    }

    if (config.runSchemaRefreshTests()) {
      RefreshTableResponse refreshResponse =
          schemaClient.refreshTable(
              RefreshTableRequest.builder()
                  .aiDataPlatformId(config.dataHubId())
                  .tableKey(createdTableKey)
                  .shouldUpdateRecent(false)
                  .opcRetryToken(requestId("refresh-table-retry"))
                  .opcRequestId(requestId("refresh-table"))
                  .build());
      assertSuccessful(refreshResponse.get__httpStatusCode__());
      assertNotNull(refreshResponse.getOpcRequestId());
    }

    if (config.runSchemaParTests()) {
      RetrieveParResponse parResponse =
          schemaClient.retrievePar(
              RetrieveParRequest.builder()
                  .aiDataPlatformId(config.dataHubId())
                  .tableKey(createdTableKey)
                  .shouldUpdateRecent(false)
                  .opcRequestId(requestId("retrieve-par"))
                  .build());
      assertSuccessful(parResponse.get__httpStatusCode__());
      assertNotNull(parResponse.getParDetails());
      assertEquals(parResponse.getParDetails().getTableKey(), createdTableKey);
    }

    UpdateTableResponse updateResponse =
        schemaClient.updateTable(
            UpdateTableRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .tableKey(createdTableKey)
                .updateTableDetails(
                    UpdateTableDetails.builder()
                        .displayName(updatedDisplayName)
                        .description("Updated by SchemaSdkIT")
                        .build())
                .shouldUpdateRecent(false)
                .opcRequestId(requestId("update-table"))
                .build());
    assertSuccessful(updateResponse.get__httpStatusCode__());
    assertNotNull(updateResponse.getOpcRequestId());
    createdTableKey = waitForTable(schemaKey, createdKey(null, schemaKey, updatedDisplayName), updatedDisplayName);

    DeleteTableResponse deleteResponse = deleteTable(createdTableKey);
    assertSuccessful(deleteResponse.get__httpStatusCode__());
    assertNotNull(deleteResponse.getOpcRequestId());
    createdTableKeys.remove(createdTableKey);
    createdTableKey = null;
  }

  @Test(groups = {"sdk_tests", "sdk_schema", "schema", "rel_validation"}, priority = 22)
  public void dataTableFromSampleFileMutationTest() throws Exception {
    if (!config.runSchemaDataTableMutationTests()) {
      throw new SkipException(
          "Set sdkRunSchemaDataTableMutationTests=true to run sample-file managed table tests.");
    }
    String schemaKey = schemaKey();
    String objectStorageLocationPath = config.schemaDataTableObjectStorageLocationPath();
    if (isBlank(objectStorageLocationPath)) {
      objectStorageLocationPath = sampleFileLocation(schemaKey);
    }
    String displayName = config.schemaTableNamePrefix() + "data_" + System.currentTimeMillis();

    CreateDataTableResponse response =
        schemaClient.createDataTable(
            CreateDataTableRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .createDataTableDetails(
                    CreateDataTableDetails.builder()
                        .displayName(displayName)
                        .description("Created by SchemaSdkIT from sample file")
                        .catalogKey(config.catalogKey())
                        .schemaKey(schemaKey)
                        .fileFormat(DataFormat.create(config.schemaDataTableFileFormat()))
                        .objectStorageLocationPath(objectStorageLocationPath)
                        .managedTableDefinition(managedTableDefinition())
                        .tableFields(tableFields())
                        .selectedColumns(List.of("id", "name"))
                        .build())
                .shouldUpdateRecent(false)
                .opcRetryToken(requestId("create-data-table-retry"))
                .opcRequestId(requestId("create-data-table"))
                .build());
    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getOpcRequestId());
    assertNotNull(response.getAidpAsyncOperationKey());

    createdTableKey = waitForTable(schemaKey, createdKey(null, schemaKey, displayName), displayName);
    trackCreatedTable(createdTableKey);
    DeleteTableResponse deleteResponse = deleteTable(createdTableKey);
    assertSuccessful(deleteResponse.get__httpStatusCode__());
    createdTableKeys.remove(createdTableKey);
    createdTableKey = null;
  }

  @Test(groups = {"sdk_tests", "sdk_schema", "schema", "rel_validation"}, priority = 23)
  public void viewMutationFlowTest() throws Exception {
    if (!config.runSchemaViewMutationTests()) {
      throw new SkipException("Set sdkRunSchemaViewMutationTests=true to run view mutation tests.");
    }
    String schemaKey = schemaKey();
    String suffix = Long.toString(System.currentTimeMillis());
    String displayName = config.schemaViewNamePrefix() + suffix;
    String updatedDisplayName = displayName + "_updated";
    String viewText = viewText();

    CreateViewResponse createResponse =
        schemaClient.createView(
            CreateViewRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .createViewDetails(
                    CreateViewDetails.builder()
                        .displayName(displayName)
                        .description("Created by SchemaSdkIT")
                        .catalogKey(config.catalogKey())
                        .schemaKey(schemaKey)
                        .viewText(viewText)
                        .viewFields(viewFields())
                        .build())
                .shouldUpdateRecent(false)
                .opcRetryToken(requestId("create-view-retry"))
                .opcRequestId(requestId("create-view"))
                .build());
    assertSuccessful(createResponse.get__httpStatusCode__());
    assertNotNull(createResponse.getView());
    createdViewKey = createResponse.getView().getKey();
    assertNotNull(createdViewKey);
    trackCreatedView(createdViewKey);
    assertEquals(createResponse.getView().getDisplayName(), displayName);

    assertSuccessful(getView(createdViewKey).get__httpStatusCode__());
    assertSuccessful(listViewPermissions(createdViewKey).get__httpStatusCode__());

    if (config.runSchemaPermissionMutationTests()) {
      ManageViewPermissionResponse assignResponse =
          manageViewPermission(createdViewKey, true, viewPermission());
      assertSuccessful(assignResponse.get__httpStatusCode__());

      ManageViewPermissionResponse revokeResponse =
          manageViewPermission(createdViewKey, false, viewPermission());
      assertSuccessful(revokeResponse.get__httpStatusCode__());
    }

    UpdateViewResponse updateResponse =
        schemaClient.updateView(
            UpdateViewRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .viewKey(createdViewKey)
                .updateViewDetails(
                    UpdateViewDetails.builder()
                        .updateMode(UpdateViewDetails.UpdateMode.RenameView)
                        .viewUpdateDetails(ViewUpdateDetails.builder().displayName(updatedDisplayName).build())
                        .build())
                .shouldUpdateRecent(false)
                .opcRequestId(requestId("update-view"))
                .build());
    assertSuccessful(updateResponse.get__httpStatusCode__());
    assertNotNull(updateResponse.getView());
    createdViewKey = updateResponse.getView().getKey();
    assertEquals(updateResponse.getView().getDisplayName(), updatedDisplayName);

    DeleteViewResponse deleteResponse = deleteView(createdViewKey);
    assertSuccessful(deleteResponse.get__httpStatusCode__());
    assertNotNull(deleteResponse.getOpcRequestId());
    createdViewKeys.remove(createdViewKey);
    createdViewKey = null;
  }

  @Test(groups = {"sdk_tests", "sdk_schema", "schema", "rel_validation"}, priority = 24)
  public void generateTempFileUploadTargetTest() {
    if (!config.runSchemaTempUploadTargetTests()) {
      throw new SkipException(
          "Set sdkRunSchemaTempUploadTargetTests=true to run temp upload target tests.");
    }
    String schemaKey = schemaKey();

    GenerateTempFileUploadTargetResponse response =
        schemaClient.generateTempFileUploadTarget(
            GenerateTempFileUploadTargetRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .schemaKey(schemaKey)
                .shouldUpdateRecent(false)
                .opcRequestId(requestId("generate-temp-upload"))
                .build());
    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getGenerateTempFileUploadTargetResponseDetails());
    assertNotNull(response.getGenerateTempFileUploadTargetResponseDetails().getTempFileUploadTarget());
    assertNotNull(response.getGenerateTempFileUploadTargetResponseDetails().getUploadKey());
  }

  @Test(groups = {"sdk_tests", "sdk_schema", "schema", "rel_validation"}, priority = 25)
  public void inferSchemaTest() throws Exception {
    if (!config.runSchemaInferTests()) {
      throw new SkipException("Set sdkRunSchemaInferTests=true to run infer schema tests.");
    }
    String schemaKey = schemaKey();
    String inferLocation = config.schemaInferLocation();
    if (isBlank(inferLocation)) {
      inferLocation = sampleFileLocation(schemaKey);
    }

    PerformInferSchemaResponse response =
        schemaClient.performInferSchema(
            PerformInferSchemaRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .schemaKey(schemaKey)
                .performInferSchemaDetails(inferSchemaDetails(inferLocation))
                .shouldUpdateRecent(false)
                .opcRequestId(requestId("infer-schema"))
                .build());
    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getInferSchema());
    assertNotNull(response.getInferSchema().getInferSchemaColumn());
  }

  @Test(groups = {"sdk_tests", "sdk_schema", "schema", "rel_validation"}, priority = 26)
  public void inferSchemaWithPreviewTest() throws Exception {
    if (!config.runSchemaInferTests()) {
      throw new SkipException("Set sdkRunSchemaInferTests=true to run infer schema preview tests.");
    }
    String schemaKey = schemaKey();
    String inferLocation = config.schemaInferLocation();
    if (isBlank(inferLocation)) {
      inferLocation = sampleFileLocation(schemaKey);
    }

    PerformInferSchemaWithPreviewResponse response =
        schemaClient.performInferSchemaWithPreview(
            PerformInferSchemaWithPreviewRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .schemaKey(schemaKey)
                .performInferSchemaDetails(inferSchemaDetails(inferLocation))
                .shouldUpdateRecent(false)
                .opcRequestId(requestId("infer-schema-preview"))
                .build());
    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getInferSchemaWithPreview());
    assertNotNull(response.getInferSchemaWithPreview().getSchema());
    assertNotNull(response.getInferSchemaWithPreview().getData());
  }

  @Test(groups = {"sdk_tests", "sdk_schema", "schema", "rel_validation"}, priority = 99)
  public void cleanupSchemaFixturesTest() {
    if (!config.runSchemaFixtureCleanupTests()) {
      throw new SkipException("Set sdkRunSchemaFixtureCleanupTests=true to run fixture cleanup.");
    }
    String schemaKey = schemaKey();

    ListViewsResponse viewsResponse = listViews(schemaKey, null, 100);
    assertSuccessful(viewsResponse.get__httpStatusCode__());
    if (viewsResponse.getViewCollection() != null
        && viewsResponse.getViewCollection().getItems() != null) {
      viewsResponse.getViewCollection().getItems().stream()
          .filter(view -> startsWithSdkPrefix(view.getDisplayName(), config.schemaViewNamePrefix()))
          .forEach(view -> deleteView(view.getKey()));
    }

    ListTablesResponse tablesResponse = listTables(schemaKey, null, 100);
    assertSuccessful(tablesResponse.get__httpStatusCode__());
    if (tablesResponse.getTableCollection() != null
        && tablesResponse.getTableCollection().getItems() != null) {
      tablesResponse.getTableCollection().getItems().stream()
          .filter(table -> startsWithSdkPrefix(table.getDisplayName(), config.schemaTableNamePrefix()))
          .forEach(table -> deleteTable(table.getKey()));
    }
  }

  @AfterClass(
      alwaysRun = true,
      groups = {"sdk_tests", "sdk_schema", "schema", "rel_validation"})
  public void tearDown() {
    for (String viewKey : List.copyOf(createdViewKeys)) {
      try {
        deleteView(viewKey);
      } catch (BmcException e) {
        if (e.getStatusCode() != 404) {
          throw e;
        }
      }
    }
    createdViewKeys.clear();
    for (String tableKey : List.copyOf(createdTableKeys)) {
      try {
        deleteTable(tableKey);
      } catch (BmcException e) {
        if (e.getStatusCode() != 404) {
          throw e;
        }
      }
    }
    createdTableKeys.clear();
    if (createdSchemaKey != null) {
      try {
        deleteSchema(createdSchemaKey);
      } catch (BmcException e) {
        if (e.getStatusCode() != 404) {
          throw e;
        }
      }
    }
    if (schemaClient != null) {
      schemaClient.close();
    }
  }

  private String schemaKey() {
    if (!isBlank(config.schemaKey())) {
      return config.schemaKey();
    }
    ListSchemasResponse response = listSchemas(null, 1);
    assertSuccessful(response.get__httpStatusCode__());
    if (response.getSchemaCollection() == null
        || response.getSchemaCollection().getItems() == null
        || response.getSchemaCollection().getItems().isEmpty()) {
      if (config.runSchemaMutationTests()) {
        return createSchemaFixture();
      }
      throw new IllegalStateException("No schema is available for SDK schema tests.");
    }
    return response.getSchemaCollection().getItems().get(0).getKey();
  }

  private String createSchemaFixture() {
    String displayName = config.schemaNamePrefix() + "fixture_" + System.currentTimeMillis();
    CreateSchemaResponse createResponse =
        schemaClient.createSchema(
            CreateSchemaRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .createSchemaDetails(
                    CreateSchemaDetails.builder()
                        .displayName(displayName)
                        .catalogName(config.catalogKey())
                        .description("Created by SchemaSdkIT fixture")
                        .properties(Map.of("sdkTest", "true"))
                        .build())
                .shouldUpdateRecent(false)
                .opcRetryToken(requestId("create-schema-fixture-retry"))
                .opcRequestId(requestId("create-schema-fixture"))
                .build());
    assertSuccessful(createResponse.get__httpStatusCode__());
    assertNotNull(createResponse.getAidpAsyncOperationKey());

    createdSchemaKey = createdKey(createResponse.getLocation(), config.catalogKey(), displayName);
    try {
      createdSchemaKey = waitForSchema(createdSchemaKey, displayName);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new RuntimeException("Interrupted while waiting for schema fixture.", e);
    }
    return createdSchemaKey;
  }

  private String tableKey() throws Exception {
    if (!isBlank(config.tableKey())) {
      return config.tableKey();
    }
    if (!isBlank(createdTableKey)) {
      return createdTableKey;
    }
    String schemaKey = schemaKey();
    ListTablesResponse response = listTables(schemaKey, null, 1);
    assertSuccessful(response.get__httpStatusCode__());
    if (response.getTableCollection() == null
        || response.getTableCollection().getItems() == null
        || response.getTableCollection().getItems().isEmpty()) {
      if (config.runSchemaTableMutationTests() || config.runSchemaViewMutationTests()) {
        return createTableFixture(schemaKey);
      }
      throw new SkipException(
          "Set tableKey, create at least one table, or set sdkRunSchemaTableMutationTests=true to run this SDK test.");
    }
    return response.getTableCollection().getItems().get(0).getKey();
  }

  private String viewKey() throws Exception {
    if (!isBlank(config.viewKey())) {
      return config.viewKey();
    }
    if (!isBlank(createdViewKey)) {
      return createdViewKey;
    }
    String schemaKey = schemaKey();
    ListViewsResponse response = listViews(schemaKey, null, 1);
    assertSuccessful(response.get__httpStatusCode__());
    if (response.getViewCollection() == null
        || response.getViewCollection().getItems() == null
        || response.getViewCollection().getItems().isEmpty()) {
      if (config.runSchemaViewMutationTests()) {
        return createViewFixture(schemaKey);
      }
      throw new SkipException(
          "Set viewKey, create at least one view, or set sdkRunSchemaViewMutationTests=true to run this SDK test.");
    }
    return response.getViewCollection().getItems().get(0).getKey();
  }

  private String createTableFixture(String schemaKey) throws Exception {
    String displayName = config.schemaTableNamePrefix() + "fixture_" + System.currentTimeMillis();
    CreateTableResponse createResponse =
        schemaClient.createTable(
            CreateTableRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .createTableDetails(createTableDetails(schemaKey, displayName))
                .shouldUpdateRecent(false)
                .opcRetryToken(requestId("create-table-fixture-retry"))
                .opcRequestId(requestId("create-table-fixture"))
                .build());
    assertSuccessful(createResponse.get__httpStatusCode__());
    assertNotNull(createResponse.getAidpAsyncOperationKey());

    createdTableKey = createdKey(createResponse.getLocation(), schemaKey, displayName);
    createdTableKey = waitForTable(schemaKey, createdTableKey, displayName);
    trackCreatedTable(createdTableKey);
    return createdTableKey;
  }

  private String createViewFixture(String schemaKey) throws Exception {
    String displayName = config.schemaViewNamePrefix() + "fixture_" + System.currentTimeMillis();
    CreateViewResponse createResponse =
        schemaClient.createView(
            CreateViewRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .createViewDetails(
                    CreateViewDetails.builder()
                        .displayName(displayName)
                        .description("Created by SchemaSdkIT fixture")
                        .catalogKey(config.catalogKey())
                        .schemaKey(schemaKey)
                        .viewText(viewText())
                        .viewFields(viewFields())
                        .build())
                .shouldUpdateRecent(false)
                .opcRetryToken(requestId("create-view-fixture-retry"))
                .opcRequestId(requestId("create-view-fixture"))
                .build());
    assertSuccessful(createResponse.get__httpStatusCode__());
    assertNotNull(createResponse.getView());
    createdViewKey = createResponse.getView().getKey();
    trackCreatedView(createdViewKey);
    return createdViewKey;
  }

  private String viewText() throws Exception {
    if (!isBlank(config.schemaViewText())) {
      return config.schemaViewText();
    }
    throw new SkipException("Set sdkSchemaViewText to run view mutation tests.");
  }

  private String sampleFileLocation(String schemaKey) throws Exception {
    if (!isBlank(uploadedSampleFileLocation)) {
      return uploadedSampleFileLocation;
    }

    GenerateTempFileUploadTargetResponse response =
        schemaClient.generateTempFileUploadTarget(
            GenerateTempFileUploadTargetRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .schemaKey(schemaKey)
                .shouldUpdateRecent(false)
                .opcRequestId(requestId("generate-temp-upload"))
                .build());
    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getGenerateTempFileUploadTargetResponseDetails());
    String uploadTarget =
        response.getGenerateTempFileUploadTargetResponseDetails().getTempFileUploadTarget();
    String ociFilePath = response.getGenerateTempFileUploadTargetResponseDetails().getOciFilePath();
    assertNotNull(uploadTarget);
    assertNotNull(ociFilePath);

    uploadSampleCsv(uploadTarget, ociFilePath);
    uploadedSampleFileLocation = ociFilePath;
    return uploadedSampleFileLocation;
  }

  private void uploadSampleCsv(String uploadTarget, String ociFilePath) throws Exception {
    byte[] content = "id,name\n1,alice\n2,bob\n".getBytes(StandardCharsets.UTF_8);

    Exception objectStorageException = null;
    if (!isBlank(ociFilePath) && ociFilePath.startsWith("oci://")) {
      try {
        uploadSampleCsvToObjectStorage(ociFilePath, content);
        return;
      } catch (Exception e) {
        objectStorageException = e;
      }
    }

    Integer lastStatusCode = null;
    Exception lastException = null;
    for (String url : uploadUrls(uploadTarget)) {
      try {
        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        connection.setRequestMethod("PUT");
        connection.setDoOutput(true);
        connection.setConnectTimeout(30_000);
        connection.setReadTimeout(30_000);
        connection.setRequestProperty("Content-Type", "text/csv");
        connection.setRequestProperty("Content-Length", Integer.toString(content.length));
        try (OutputStream outputStream = connection.getOutputStream()) {
          outputStream.write(content);
        }
        int statusCode = connection.getResponseCode();
        if (statusCode / 100 == 2) {
          return;
        }
        lastStatusCode = statusCode;
      } catch (Exception e) {
        lastException = e;
      }
    }

    if (lastException != null && lastStatusCode == null) {
      if (objectStorageException != null) {
        lastException.addSuppressed(objectStorageException);
      }
      throw lastException;
    }
    AssertionError error =
        new AssertionError("Expected successful temp file upload but got " + lastStatusCode);
    if (objectStorageException != null) {
      error.addSuppressed(objectStorageException);
    }
    throw error;
  }

  private void uploadSampleCsvToObjectStorage(String ociFilePath, byte[] content) throws Exception {
    ObjectStorageLocation location = ObjectStorageLocation.parse(ociFilePath);
    Exception lastException = null;
    for (String endpoint : objectStorageEndpoints()) {
      ObjectStorageClient client = null;
      try {
        client = new ObjectStorageClient(SdkClients.authenticationProvider(config));
        client.setEndpoint(endpoint);
        client.putObject(
            PutObjectRequest.builder()
                .namespaceName(location.namespaceName())
                .bucketName(location.bucketName())
                .objectName(location.objectName())
                .contentLength((long) content.length)
                .contentType("text/csv")
                .putObjectBody(new ByteArrayInputStream(content))
                .build());
        return;
      } catch (Exception e) {
        lastException = e;
      } finally {
        if (client != null) {
          client.close();
        }
      }
    }
    throw lastException;
  }

  private List<String> uploadUrls(String uploadTarget) {
    if (uploadTarget.startsWith("http://") || uploadTarget.startsWith("https://")) {
      return List.of(uploadTarget);
    }
    String namespace = namespaceFromUploadTarget(uploadTarget);
    LinkedHashSet<String> urls = new LinkedHashSet<>();
    for (String endpoint : objectStorageEndpoints()) {
      urls.add(uploadUrl(endpoint, uploadTarget));
      String namespaceEndpoint = namespaceEndpoint(endpoint, namespace);
      if (namespaceEndpoint != null) {
        urls.add(uploadUrl(namespaceEndpoint, uploadTarget));
      }
    }
    return List.copyOf(urls);
  }

  private List<String> objectStorageEndpoints() {
    LinkedHashSet<String> endpoints = new LinkedHashSet<>();
    endpoints.add(config.schemaTempUploadEndpoint());
    addObjectStorageEndpoint(endpoints, config.region(), objectStorageRealm(config.endpoint()));
    String serviceEndpoint = config.endpoint();
    String serviceRealm = serviceRealm(serviceEndpoint);
    if (serviceRealm != null) {
      String serviceRegion = serviceRegion(serviceEndpoint, serviceRealm);
      if (serviceRegion != null) {
        addObjectStorageEndpoint(endpoints, serviceRegion, objectStorageRealm(serviceEndpoint));
        addObjectStorageEndpoint(endpoints, serviceRegion, serviceRealm);
      }
    }
    endpoints.add("https://objectstorage." + config.region() + ".oraclecloud.com");
    return List.copyOf(endpoints);
  }

  private String uploadUrl(String endpoint, String uploadTarget) {
    if (endpoint.endsWith("/") && uploadTarget.startsWith("/")) {
      return endpoint.substring(0, endpoint.length() - 1) + uploadTarget;
    }
    if (!endpoint.endsWith("/") && !uploadTarget.startsWith("/")) {
      return endpoint + "/" + uploadTarget;
    }
    return endpoint + uploadTarget;
  }

  private String serviceRealm(String serviceEndpoint) {
    String host = URI.create(serviceEndpoint).getHost();
    if (host == null) {
      return null;
    }
    if (host.endsWith(".oci.oc-test.com")) {
      return "oci.oc-test.com";
    }
    if (host.endsWith(".oraclecloud.com")) {
      return "oraclecloud.com";
    }
    return null;
  }

  private String objectStorageRealm(String serviceEndpoint) {
    String realm = serviceRealm(serviceEndpoint);
    if ("oci.oc-test.com".equals(realm)) {
      return "oci.customer-oci.com";
    }
    return realm == null ? "oraclecloud.com" : realm;
  }

  private String serviceRegion(String serviceEndpoint, String realm) {
    String host = URI.create(serviceEndpoint).getHost();
    if (host == null || !host.endsWith("." + realm)) {
      return null;
    }
    String prefix = host.substring(0, host.length() - realm.length() - 1);
    int lastDot = prefix.lastIndexOf('.');
    if (lastDot < 0 || lastDot == prefix.length() - 1) {
      return null;
    }
    return prefix.substring(lastDot + 1);
  }

  private void addObjectStorageEndpoint(LinkedHashSet<String> endpoints, String region, String realm) {
    if (!isBlank(region) && !isBlank(realm)) {
      endpoints.add("https://objectstorage." + region + "." + realm);
    }
  }

  private String namespaceFromUploadTarget(String uploadTarget) {
    String marker = "/n/";
    int namespaceStart = uploadTarget.indexOf(marker);
    if (namespaceStart < 0) {
      return null;
    }
    int valueStart = namespaceStart + marker.length();
    int valueEnd = uploadTarget.indexOf('/', valueStart);
    if (valueEnd <= valueStart) {
      return null;
    }
    return uploadTarget.substring(valueStart, valueEnd);
  }

  private String namespaceEndpoint(String endpoint, String namespace) {
    if (isBlank(namespace)) {
      return null;
    }
    URI uri = URI.create(endpoint);
    String host = uri.getHost();
    if (host == null || host.startsWith(namespace + ".")) {
      return null;
    }
    return uri.getScheme() + "://" + namespace + "." + host;
  }

  private record ObjectStorageLocation(String bucketName, String namespaceName, String objectName) {
    private static ObjectStorageLocation parse(String location) {
      URI uri = URI.create(location);
      String bucketName = uri.getUserInfo();
      String namespaceName = uri.getHost();
      String objectName = uri.getPath() == null ? null : uri.getPath().replaceFirst("^/", "");
      if (isBlank(bucketName) || isBlank(namespaceName) || isBlank(objectName)) {
        throw new IllegalArgumentException("Invalid OCI object storage location: " + location);
      }
      return new ObjectStorageLocation(bucketName, namespaceName, objectName);
    }
  }

  private void trackCreatedTable(String tableKey) {
    if (!isBlank(tableKey) && !createdTableKeys.contains(tableKey)) {
      createdTableKeys.add(tableKey);
    }
  }

  private void trackCreatedView(String viewKey) {
    if (!isBlank(viewKey) && !createdViewKeys.contains(viewKey)) {
      createdViewKeys.add(viewKey);
    }
  }

  private boolean startsWithSdkPrefix(String displayName, String prefix) {
    return !isBlank(displayName) && !isBlank(prefix) && displayName.startsWith(prefix);
  }

  private ListSchemasResponse listSchemas(String displayName, int limit) {
    ListSchemasRequest.Builder builder =
        ListSchemasRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .catalogKey(config.catalogKey())
            .limit(limit)
            .sortBy(ListSchemasRequest.SortBy.DisplayName)
            .sortOrder(SortOrder.Asc)
            .opcRequestId(requestId("list-schemas"));
    if (!isBlank(displayName)) {
      builder.displayName(displayName);
    }
    return schemaClient.listSchemas(builder.build());
  }

  private ListTablesResponse listTables(String schemaKey, String displayName, int limit) {
    ListTablesRequest.Builder builder =
        ListTablesRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .catalogKey(config.catalogKey())
            .schemaKey(schemaKey)
            .limit(limit)
            .sortBy(ListTablesRequest.SortBy.DisplayName)
            .sortOrder(SortOrder.Asc)
            .opcRequestId(requestId("list-tables"));
    if (!isBlank(displayName)) {
      builder.displayName(displayName);
    }
    return schemaClient.listTables(builder.build());
  }

  private ListViewsResponse listViews(String schemaKey, String displayName, int limit) {
    ListViewsRequest.Builder builder =
        ListViewsRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .catalogKey(config.catalogKey())
            .schemaKey(schemaKey)
            .limit(limit)
            .sortBy(ListViewsRequest.SortBy.DisplayName)
            .sortOrder(SortOrder.Asc)
            .opcRequestId(requestId("list-views"));
    if (!isBlank(displayName)) {
      builder.displayName(displayName);
    }
    return schemaClient.listViews(builder.build());
  }

  private GetSchemaResponse getSchema(String schemaKey) {
    return schemaClient.getSchema(
        GetSchemaRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .schemaKey(schemaKey)
            .shouldUpdateRecent(false)
            .opcRequestId(requestId("get-schema"))
            .build());
  }

  private GetTableResponse getTable(String tableKey) {
    return schemaClient.getTable(
        GetTableRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .tableKey(tableKey)
            .shouldUpdateRecent(false)
            .opcRequestId(requestId("get-table"))
            .build());
  }

  private GetViewResponse getView(String viewKey) {
    return schemaClient.getView(
        GetViewRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .viewKey(viewKey)
            .shouldUpdateRecent(false)
            .opcRequestId(requestId("get-view"))
            .build());
  }

  private ListSchemaPermissionsResponse listSchemaPermissions(String schemaKey) {
    return schemaClient.listSchemaPermissions(
        ListSchemaPermissionsRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .schemaKey(schemaKey)
            .limit(10)
            .sortOrder(SortOrder.Asc)
            .opcRequestId(requestId("list-schema-permissions"))
            .build());
  }

  private ListTablePermissionsResponse listTablePermissions(String tableKey) {
    return schemaClient.listTablePermissions(
        ListTablePermissionsRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .tableKey(tableKey)
            .limit(10)
            .sortOrder(SortOrder.Asc)
            .opcRequestId(requestId("list-table-permissions"))
            .build());
  }

  private ListViewPermissionsResponse listViewPermissions(String viewKey) {
    return schemaClient.listViewPermissions(
        ListViewPermissionsRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .viewKey(viewKey)
            .limit(10)
            .sortOrder(SortOrder.Asc)
            .opcRequestId(requestId("list-view-permissions"))
            .build());
  }

  private ManageSchemaPermissionResponse manageSchemaPermission(
      String schemaKey, boolean assign, PermissionAssignees assignees) {
    ManageSchemaPermissionDetails details;
    if (assign) {
      details =
          ManageSchemaPermissionDetails.builder()
              .assignSchemaPermissionDetails(
                  AssignSchemaPermissionDetails.builder()
                      .assignees(assignees)
                      .permissions(List.of(SchemaPrivilegeForManage.Select))
                      .build())
              .build();
    } else {
      details =
          ManageSchemaPermissionDetails.builder()
              .revokeSchemaPermissionDetails(
                  RevokeSchemaPermissionDetails.builder()
                      .assignees(assignees)
                      .permissions(List.of(SchemaPrivilegeForManage.Select))
                      .build())
              .build();
    }
    return schemaClient.manageSchemaPermission(
        ManageSchemaPermissionRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .schemaKey(schemaKey)
            .manageSchemaPermissionDetails(details)
            .shouldUpdateRecent(false)
            .opcRequestId(requestId(assign ? "assign-schema-perm" : "revoke-schema-perm"))
            .build());
  }

  private ManageTablePermissionResponse manageTablePermission(
      String tableKey, boolean assign, PermissionAssignees assignees) {
    ManageTablePermissionDetails details;
    if (assign) {
      details =
          ManageTablePermissionDetails.builder()
              .assignTablePermissionDetails(
                  AssignTablePermissionDetails.builder()
                      .assignees(assignees)
                      .permissions(List.of(TablePrivilegeForManage.Select))
                      .includeColumns(List.of())
                      .excludeColumns(List.of())
                      .build())
              .build();
    } else {
      details =
          ManageTablePermissionDetails.builder()
              .revokeTablePermissionDetails(
                  RevokeTablePermissionDetails.builder()
                      .assignees(assignees)
                      .permissions(List.of(TablePrivilegeForManage.Select))
                      .includeColumns(List.of())
                      .excludeColumns(List.of())
                      .build())
              .build();
    }
    return schemaClient.manageTablePermission(
        ManageTablePermissionRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .tableKey(tableKey)
            .manageTablePermissionDetails(details)
            .shouldUpdateRecent(false)
            .opcRequestId(requestId(assign ? "assign-table-perm" : "revoke-table-perm"))
            .build());
  }

  private ManageViewPermissionResponse manageViewPermission(
      String viewKey, boolean assign, PermissionAssignees assignees) {
    ManageViewPermissionDetails details;
    if (assign) {
      details =
          ManageViewPermissionDetails.builder()
              .assignViewPermissionDetails(
                  AssignViewPermissionDetails.builder()
                      .assignees(assignees)
                      .permissions(List.of(ViewPrivilegeForManage.Select))
                      .includeColumns(List.of())
                      .excludeColumns(List.of())
                      .build())
              .build();
    } else {
      details =
          ManageViewPermissionDetails.builder()
              .revokeViewPermissionDetails(
                  RevokeViewPermissionDetails.builder()
                      .assignees(assignees)
                      .permissions(List.of(ViewPrivilegeForManage.Select))
                      .includeColumns(List.of())
                      .excludeColumns(List.of())
                      .build())
              .build();
    }
    return schemaClient.manageViewPermission(
        ManageViewPermissionRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .viewKey(viewKey)
            .manageViewPermissionDetails(details)
            .shouldUpdateRecent(false)
            .opcRequestId(requestId(assign ? "assign-view-perm" : "revoke-view-perm"))
            .build());
  }

  private DeleteSchemaResponse deleteSchema(String schemaKey) {
    return schemaClient.deleteSchema(
        DeleteSchemaRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .schemaKey(schemaKey)
            .isForced(true)
            .shouldUpdateRecent(false)
            .opcRequestId(requestId("delete-schema"))
            .build());
  }

  private DeleteTableResponse deleteTable(String tableKey) {
    return schemaClient.deleteTable(
        DeleteTableRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .tableKey(tableKey)
            .shouldUpdateRecent(false)
            .opcRequestId(requestId("delete-table"))
            .build());
  }

  private DeleteViewResponse deleteView(String viewKey) {
    return schemaClient.deleteView(
        DeleteViewRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .viewKey(viewKey)
            .shouldUpdateRecent(false)
            .opcRequestId(requestId("delete-view"))
            .build());
  }

  private PermissionAssignees schemaPermission() {
    String target = config.schemaPermissionTarget();
    if (isBlank(target)) {
      throw new SkipException(
          "Set sdkSchemaPermissionTarget, sdkWorkspacePermissionTarget, subjectId, or userOcid to run this SDK test.");
    }
    return PermissionAssignees.builder()
        .type(GranteeType.create(config.schemaPermissionGranteeType()))
        .targets(List.of(target))
        .build();
  }

  private PermissionAssignees tablePermission() {
    return schemaPermission();
  }

  private PermissionAssignees viewPermission() {
    return schemaPermission();
  }

  private CreateTableDetails createTableDetails(String schemaKey, String displayName) {
    TableType tableType = TableType.create(config.schemaTableType());
    CreateTableDetails.Builder builder =
        CreateTableDetails.builder()
            .displayName(displayName)
            .description("Created by SchemaSdkIT")
            .catalogKey(config.catalogKey())
            .schemaKey(schemaKey)
            .tableType(tableType)
            .tableFields(tableFields());
    if (tableType == TableType.External) {
      builder.externalTableDefinition(externalTableDefinition());
    } else {
      builder.managedTableDefinition(managedTableDefinition());
    }
    return builder.build();
  }

  private ManagedTableDefinition managedTableDefinition() {
    return ManagedTableDefinition.builder()
        .managedTableDataFormat(DataFormat.create(config.schemaManagedTableDataFormat()))
        .build();
  }

  private ExternalTableDefinition externalTableDefinition() {
    return ExternalTableDefinition.builder()
        .externalTableLocationType(ExternalTableLocationType.ObjectStorage)
        .objectStorageLocationPath(requireValue(config, "sdkSchemaExternalTableLocationPath"))
        .externalTableDataFormat(DataFormat.create(config.schemaExternalTableDataFormat()))
        .build();
  }

  private List<TableFieldDetails> tableFields() {
    return List.of(
        TableFieldDetails.builder()
            .fieldName("id")
            .fieldType("INT")
            .fieldDescription("SDK test id")
            .build(),
        TableFieldDetails.builder()
            .fieldName("name")
            .fieldType("STRING")
            .fieldDescription("SDK test name")
            .build());
  }

  private List<ViewFieldDetails> viewFields() {
    return List.of(
        ViewFieldDetails.builder()
            .fieldName("id")
            .fieldType("INT")
            .fieldDescription("SDK test id")
            .build());
  }

  private PerformInferSchemaDetails inferSchemaDetails(String inferLocation) {
    return PerformInferSchemaDetails.builder()
        .dataFormat(DataFormat.create(config.schemaInferDataFormat()))
        .location(inferLocation)
        .numberOfPartitions(0)
        .build();
  }

  private String waitForSchema(String expectedKey, String displayName) throws InterruptedException {
    return waitForEntityKey(
        expectedKey,
        displayName,
        () -> {
          ListSchemasResponse response = listSchemas(displayName, 10);
          assertSuccessful(response.get__httpStatusCode__());
          if (response.getSchemaCollection() == null
              || response.getSchemaCollection().getItems() == null) {
            return null;
          }
          return response.getSchemaCollection().getItems().stream()
              .filter(schema -> displayName.equals(schema.getDisplayName()))
              .findFirst()
              .map(schema -> schema.getKey())
              .orElse(null);
        });
  }

  private String waitForTable(String schemaKey, String expectedKey, String displayName)
      throws InterruptedException {
    return waitForEntityKey(
        expectedKey,
        displayName,
        () -> {
          ListTablesResponse response = listTables(schemaKey, displayName, 10);
          assertSuccessful(response.get__httpStatusCode__());
          if (response.getTableCollection() == null || response.getTableCollection().getItems() == null) {
            return null;
          }
          return response.getTableCollection().getItems().stream()
              .filter(table -> displayName.equals(table.getDisplayName()))
              .findFirst()
              .map(table -> table.getKey())
              .orElse(null);
        });
  }

  private String waitForEntityKey(String expectedKey, String displayName, KeyLookup lookup)
      throws InterruptedException {
    Duration timeout = config.schemaReadyTimeout();
    long deadline = System.nanoTime() + timeout.toNanos();
    while (System.nanoTime() < deadline) {
      String discoveredKey = lookup.get();
      if (!isBlank(discoveredKey)) {
        return discoveredKey;
      }
      Thread.sleep(config.pollInterval().toMillis());
    }
    if (!isBlank(expectedKey)) {
      return expectedKey;
    }
    throw new AssertionError("Timed out waiting for Schema entity: " + displayName);
  }

  private String createdKey(String location, String parentKey, String displayName) {
    if (!isBlank(location)) {
      String normalized = location;
      int queryIndex = normalized.indexOf('?');
      if (queryIndex >= 0) {
        normalized = normalized.substring(0, queryIndex);
      }
      int slashIndex = normalized.lastIndexOf('/');
      if (slashIndex >= 0 && slashIndex + 1 < normalized.length()) {
        return normalized.substring(slashIndex + 1);
      }
    }
    return parentKey + "." + displayName;
  }

  @FunctionalInterface
  private interface KeyLookup {
    String get();
  }
}
