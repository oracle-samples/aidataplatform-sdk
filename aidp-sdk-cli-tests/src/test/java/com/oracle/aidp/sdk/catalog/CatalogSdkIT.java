package com.oracle.aidp.sdk.catalog;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;

import com.oracle.aidp.sdk.client.SdkClients;
import com.oracle.aidp.sdk.config.SdkTestConfig;
import com.oracle.aidp.sdk.support.SdkTestResources;
import com.oracle.aidp.sdk.support.SdkTestSupport;
import com.oracle.aidataplatform.dp.CatalogClient;
import com.oracle.aidataplatform.dp.ClusterClient;
import com.oracle.aidataplatform.dp.model.AssignCatalogPermissionDetails;
import com.oracle.aidataplatform.dp.model.Catalog;
import com.oracle.aidataplatform.dp.model.CatalogSummary;
import com.oracle.aidataplatform.dp.model.CatalogTestConnectionDetails;
import com.oracle.aidataplatform.dp.model.CatalogPrivilege;
import com.oracle.aidataplatform.dp.model.CatalogType;
import com.oracle.aidataplatform.dp.model.CreateCatalogDetails;
import com.oracle.aidataplatform.dp.model.ExternalCatalogSourceType;
import com.oracle.aidataplatform.dp.model.GranteeType;
import com.oracle.aidataplatform.dp.model.ManageCatalogPermissionDetails;
import com.oracle.aidataplatform.dp.model.PermissionAssignees;
import com.oracle.aidataplatform.dp.model.SortOrder;
import com.oracle.aidataplatform.dp.model.UpdateCatalogDetails;
import com.oracle.aidataplatform.dp.requests.CatalogTestConnectionRequest;
import com.oracle.aidataplatform.dp.requests.CreateCatalogRequest;
import com.oracle.aidataplatform.dp.requests.DeleteCatalogRequest;
import com.oracle.aidataplatform.dp.requests.GetCatalogRequest;
import com.oracle.aidataplatform.dp.requests.ListCatalogPermissionsRequest;
import com.oracle.aidataplatform.dp.requests.ListCatalogsRequest;
import com.oracle.aidataplatform.dp.requests.ManageCatalogPermissionRequest;
import com.oracle.aidataplatform.dp.requests.RefreshCatalogRequest;
import com.oracle.aidataplatform.dp.requests.UpdateCatalogRequest;
import com.oracle.aidataplatform.dp.responses.CatalogTestConnectionResponse;
import com.oracle.aidataplatform.dp.responses.CreateCatalogResponse;
import com.oracle.aidataplatform.dp.responses.DeleteCatalogResponse;
import com.oracle.aidataplatform.dp.responses.GetCatalogResponse;
import com.oracle.aidataplatform.dp.responses.ListCatalogPermissionsResponse;
import com.oracle.aidataplatform.dp.responses.ListCatalogsResponse;
import com.oracle.aidataplatform.dp.responses.ManageCatalogPermissionResponse;
import com.oracle.aidataplatform.dp.responses.RefreshCatalogResponse;
import com.oracle.aidataplatform.dp.responses.UpdateCatalogResponse;
import com.oracle.bmc.model.BmcException;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CatalogSdkIT {
  private SdkTestConfig config;
  private CatalogClient catalogClient;

  private String createCatalogRetryToken;
  private String createCatalogShouldUpdateRecent;
  private String listCatalogsCatalogState;
  private String listCatalogsCatalogType;
  private String listCatalogsDisplayName;
  private String listCatalogsLimit;
  private String listCatalogsPage;
  private String listCatalogsSortBy;
  private String listCatalogsSortOrder;
  private String listCatalogPermissionsCatalogKey;
  private String listCatalogPermissionsLimit;
  private String listCatalogPermissionsPage;
  private String listCatalogPermissionsSortBy;
  private String listCatalogPermissionsSortOrder;
  private String listCatalogPermissionsShouldUpdateRecent;
  private String refreshCatalogKey;
  private String refreshCatalogIfMatch;
  private String refreshCatalogRetryToken;
  private String refreshCatalogShouldUpdateRecent;
  private String testConnectionCatalogKey;
  private String testConnectionSourceType;
  private String testConnectionRetryToken;
  private String testConnectionShouldUpdateRecent;
  private String updateCatalogKey;
  private String updateCatalogIfMatch;
  private String updateCatalogShouldUpdateRecent;
  private String manageCatalogPermissionCatalogKey;
  private String manageCatalogPermissionIfMatch;
  private String manageCatalogPermissionShouldUpdateRecent;
  private String getCatalogKey;
  private String getCatalogIsCatalogGuid;
  private String getCatalogShouldUpdateRecent;
  private String deleteCatalogKey;
  private String deleteCatalogIfMatch;
  private String deleteCatalogIsForced;
  private String deleteCatalogShouldUpdateRecent;

  private String listedCatalogKey;
  private String createdCatalogKey;
  private boolean createdCatalogDeleted;

  @BeforeClass(alwaysRun = true, groups = {"sdk_tests", "sdk_catalog", "catalog", "rel_validation"})
  public void setUp() throws Exception {
    config = SdkTestConfig.load();
    catalogClient = SdkClients.catalogClient(config);
    String workspaceKey = SdkTestResources.ensureSharedWorkspace(config);
    ClusterClient clusterClient = SdkClients.clusterClient(config);
    try {
      SdkTestResources.ensureActiveSharedCluster(config, workspaceKey, clusterClient);
    } finally {
      clusterClient.close();
    }

    createCatalogRetryToken = config.value("createCatalogRetryToken", "");
    createCatalogShouldUpdateRecent = config.value("createCatalogShouldUpdateRecent", "");
    listCatalogsCatalogState = config.value("listCatalogsCatalogState", "");
    listCatalogsCatalogType = config.value("listCatalogsCatalogType", "");
    listCatalogsDisplayName = config.value("listCatalogsDisplayName", "");
    listCatalogsLimit = config.value("listCatalogsLimit", "50");
    listCatalogsPage = config.value("listCatalogsPage", "");
    listCatalogsSortBy = config.value("listCatalogsSortBy", "timeCreated");
    listCatalogsSortOrder = config.value("listCatalogsSortOrder", "DESC");
    listCatalogPermissionsCatalogKey = config.value("listCatalogPermissionsCatalogKey", "");
    listCatalogPermissionsLimit = config.value("listCatalogPermissionsLimit", "50");
    listCatalogPermissionsPage = config.value("listCatalogPermissionsPage", "");
    listCatalogPermissionsSortBy = config.value("listCatalogPermissionsSortBy", "");
    listCatalogPermissionsSortOrder = config.value("listCatalogPermissionsSortOrder", "");
    listCatalogPermissionsShouldUpdateRecent = config.value("listCatalogPermissionsShouldUpdateRecent", "");
    refreshCatalogKey = config.value("refreshCatalogKey", "");
    refreshCatalogIfMatch = config.value("refreshCatalogIfMatch", "");
    refreshCatalogRetryToken = config.value("refreshCatalogRetryToken", "");
    refreshCatalogShouldUpdateRecent = config.value("refreshCatalogShouldUpdateRecent", "");
    testConnectionCatalogKey = config.value("testConnectionCatalogKey", "");
    testConnectionSourceType = config.value("testConnectionSourceType", "");
    testConnectionRetryToken = config.value("testConnectionRetryToken", "");
    testConnectionShouldUpdateRecent = config.value("testConnectionShouldUpdateRecent", "");
    updateCatalogKey = config.value("updateCatalogKey", "");
    updateCatalogIfMatch = config.value("updateCatalogIfMatch", "");
    updateCatalogShouldUpdateRecent = config.value("updateCatalogShouldUpdateRecent", "");
    manageCatalogPermissionCatalogKey = config.value("manageCatalogPermissionCatalogKey", "");
    manageCatalogPermissionIfMatch = config.value("manageCatalogPermissionIfMatch", "");
    manageCatalogPermissionShouldUpdateRecent =
        config.value("manageCatalogPermissionShouldUpdateRecent", "");
    getCatalogKey = config.value("getCatalogKey", "");
    getCatalogIsCatalogGuid = config.value("getCatalogIsCatalogGuid", "");
    getCatalogShouldUpdateRecent = config.value("getCatalogShouldUpdateRecent", "");
    deleteCatalogKey = config.value("deleteCatalogKey", "");
    deleteCatalogIfMatch = config.value("deleteCatalogIfMatch", "");
    deleteCatalogIsForced = config.value("deleteCatalogIsForced", "");
    deleteCatalogShouldUpdateRecent = config.value("deleteCatalogShouldUpdateRecent", "");
  }

  @Test(groups = {"sdk_tests", "sdk_catalog", "catalog", "rel_validation"})
  public void listCatalogs() {
    ListCatalogsRequest.Builder request =
        ListCatalogsRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .limit(parsePositiveInt(listCatalogsLimit, "listCatalogsLimit"))
            .opcRequestId(requestId("list-catalogs"));
    if (!isBlank(listCatalogsCatalogState)) {
      request.catalogState(ListCatalogsRequest.CatalogState.create(listCatalogsCatalogState));
    }
    if (!isBlank(listCatalogsCatalogType)) {
      request.catalogType(ListCatalogsRequest.CatalogType.create(listCatalogsCatalogType));
    }
    if (!isBlank(listCatalogsDisplayName)) {
      request.displayName(listCatalogsDisplayName);
    }
    if (!isBlank(listCatalogsPage)) {
      request.page(listCatalogsPage);
    }
    if (!isBlank(listCatalogsSortBy)) {
      request.sortBy(ListCatalogsRequest.SortBy.create(listCatalogsSortBy));
    }
    if (!isBlank(listCatalogsSortOrder)) {
      request.sortOrder(SortOrder.create(listCatalogsSortOrder));
    }

    ListCatalogsResponse response = catalogClient.listCatalogs(request.build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertFalse(isBlank(response.getOpcRequestId()), "opc-request-id should be present");
    assertNotNull(response.getCatalogCollection(), "catalog collection should be present");
    List<CatalogSummary> items = response.getCatalogCollection().getItems();
    assertNotNull(items, "catalog items should be present");
    if (!items.isEmpty()) {
      listedCatalogKey = items.get(0).getKey();
    }
  }

  @Test(
      groups = {"sdk_tests", "sdk_catalog", "catalog", "rel_validation"},
      dependsOnMethods = {"listCatalogs"})
  public void getCatalog() {
    String targetCatalogKey = effectiveCatalogKey(getCatalogKey);
    assertFalse(isBlank(targetCatalogKey), "catalog key should be available for get");

    GetCatalogRequest.Builder request =
        GetCatalogRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .catalogKey(targetCatalogKey)
            .opcRequestId(requestId("get-catalog"));
    if (!isBlank(getCatalogIsCatalogGuid)) {
      request.isCatalogGuid(parseBoolean(getCatalogIsCatalogGuid, "getCatalogIsCatalogGuid"));
    }
    if (!isBlank(getCatalogShouldUpdateRecent)) {
      request.shouldUpdateRecent(parseBoolean(getCatalogShouldUpdateRecent, "getCatalogShouldUpdateRecent"));
    }

    GetCatalogResponse response = catalogClient.getCatalog(request.build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertFalse(isBlank(response.getOpcRequestId()), "opc-request-id should be present");
    Catalog catalog = response.getCatalog();
    assertNotNull(catalog, "catalog should be present");
    assertFalse(isBlank(catalog.getKey()), "catalog key should be present");
  }

  @Test(
      groups = {"sdk_tests", "sdk_catalog", "catalog", "rel_validation"},
      dependsOnMethods = {"getCatalog"})
  public void listCatalogPermissions() {
    String targetCatalogKey = effectiveCatalogKey(listCatalogPermissionsCatalogKey);
    assertFalse(isBlank(targetCatalogKey), "catalog key should be available for permission list");

    ListCatalogPermissionsRequest.Builder request =
        ListCatalogPermissionsRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .catalogKey(targetCatalogKey)
            .limit(parsePositiveInt(listCatalogPermissionsLimit, "listCatalogPermissionsLimit"))
            .opcRequestId(requestId("list-catalog-permissions"));
    if (!isBlank(listCatalogPermissionsPage)) {
      request.page(listCatalogPermissionsPage);
    }
    if (!isBlank(listCatalogPermissionsSortBy)) {
      request.sortBy(ListCatalogPermissionsRequest.SortBy.create(listCatalogPermissionsSortBy));
    }
    if (!isBlank(listCatalogPermissionsSortOrder)) {
      request.sortOrder(SortOrder.create(listCatalogPermissionsSortOrder));
    }
    if (!isBlank(listCatalogPermissionsShouldUpdateRecent)) {
      request.shouldUpdateRecent(
          parseBoolean(listCatalogPermissionsShouldUpdateRecent, "listCatalogPermissionsShouldUpdateRecent"));
    }

    ListCatalogPermissionsResponse response = catalogClient.listCatalogPermissions(request.build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertFalse(isBlank(response.getOpcRequestId()), "opc-request-id should be present");
    assertNotNull(response.getCatalogPermissionCollection(), "catalog permission collection should be present");
  }

  @Test(groups = {"sdk_tests", "sdk_catalog", "catalog", "rel_validation"})
  public void refreshCatalog() {
    String targetCatalogKey = effectiveCatalogKey(refreshCatalogKey);
    assertFalse(isBlank(targetCatalogKey), "catalog key should be available for refresh");

    RefreshCatalogRequest.Builder request =
        RefreshCatalogRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .catalogKey(targetCatalogKey)
            .opcRequestId(requestId("refresh-catalog"));
    if (!isBlank(refreshCatalogIfMatch)) {
      request.ifMatch(refreshCatalogIfMatch);
    }
    if (!isBlank(refreshCatalogRetryToken)) {
      request.opcRetryToken(refreshCatalogRetryToken);
    }
    if (!isBlank(refreshCatalogShouldUpdateRecent)) {
      request.shouldUpdateRecent(parseBoolean(refreshCatalogShouldUpdateRecent, "refreshCatalogShouldUpdateRecent"));
    }

    RefreshCatalogResponse response = catalogClient.refreshCatalog(request.build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertFalse(isBlank(response.getOpcRequestId()), "opc-request-id should be present");
  }

  @Test(groups = {"sdk_tests", "sdk_catalog", "catalog", "rel_validation"})
  public void catalogTestConnection() {
    String targetCatalogKey = effectiveCatalogKey(testConnectionCatalogKey);
    assertFalse(isBlank(targetCatalogKey), "catalog key should be available for test connection");

    CatalogTestConnectionRequest.Builder request =
        CatalogTestConnectionRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .catalogTestConnectionDetails(catalogTestConnectionDetails(targetCatalogKey))
            .opcRequestId(requestId("test-catalog-connection"));
    if (!isBlank(testConnectionRetryToken)) {
      request.opcRetryToken(testConnectionRetryToken);
    }
    if (!isBlank(testConnectionShouldUpdateRecent)) {
      request.shouldUpdateRecent(parseBoolean(testConnectionShouldUpdateRecent, "testConnectionShouldUpdateRecent"));
    }

    try {
      CatalogTestConnectionResponse response = catalogClient.catalogTestConnection(request.build());
      SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
      assertFalse(isBlank(response.getOpcRequestId()), "opc-request-id should be present");
    } catch (BmcException e) {
      if (isBlank(testConnectionSourceType) && isAllowedCatalogTestConnectionState(e)) {
        return;
      }
      throw e;
    }
  }

  @Test(groups = {"sdk_tests", "sdk_catalog", "catalog", "rel_validation"})
  public void createCatalog() throws Exception {
    String createdDisplayName = uniqueName("sdk_catalog_it", config.value("createCatalogDisplayName", ""));

    CreateCatalogRequest.Builder request =
        CreateCatalogRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .createCatalogDetails(createCatalogDetails(createdDisplayName))
            .opcRequestId(requestId("create-catalog"));
    if (!isBlank(createCatalogRetryToken)) {
      request.opcRetryToken(createCatalogRetryToken);
    }
    if (!isBlank(createCatalogShouldUpdateRecent)) {
      request.shouldUpdateRecent(parseBoolean(createCatalogShouldUpdateRecent, "createCatalogShouldUpdateRecent"));
    }

    CreateCatalogResponse response = catalogClient.createCatalog(request.build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertFalse(isBlank(response.getOpcRequestId()), "opc-request-id should be present");
    createdCatalogKey = resolveCatalogKeyByDisplayName(createdDisplayName);
    assertFalse(isBlank(createdCatalogKey), "created catalog key should be discoverable");
  }

  @Test(
      groups = {"sdk_tests", "sdk_catalog", "catalog", "rel_validation"},
      dependsOnMethods = {"createCatalog"})
  public void updateCatalog() {
    String targetCatalogKey = firstNonBlank(updateCatalogKey, createdCatalogKey, getCatalogKey);
    assertFalse(isBlank(targetCatalogKey), "catalog key should be available for update");

    UpdateCatalogDetails details =
        updateCatalogDetails();
    UpdateCatalogRequest.Builder request =
        UpdateCatalogRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .catalogKey(targetCatalogKey)
            .updateCatalogDetails(details)
            .opcRequestId(requestId("update-catalog"));
    if (!isBlank(updateCatalogIfMatch)) {
      request.ifMatch(updateCatalogIfMatch);
    }
    if (!isBlank(updateCatalogShouldUpdateRecent)) {
      request.shouldUpdateRecent(parseBoolean(updateCatalogShouldUpdateRecent, "updateCatalogShouldUpdateRecent"));
    }

    UpdateCatalogResponse response;
    try {
      response = catalogClient.updateCatalog(request.build());
    } catch (BmcException e) {
      if (targetCatalogKey.equals(createdCatalogKey) && isNotFound(e)) {
        return;
      }
      throw e;
    }
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertFalse(isBlank(response.getOpcRequestId()), "opc-request-id should be present");
  }

  @Test(groups = {"sdk_tests", "sdk_catalog", "catalog", "rel_validation"})
  public void manageCatalogPermission() {
    String targetCatalogKey = effectiveCatalogKey(manageCatalogPermissionCatalogKey);
    assertFalse(isBlank(targetCatalogKey), "catalog key should be available for permission mutation");
    String assignee = permissionTarget("manageCatalogPermissionDefaultAssignee");
    if (isBlank(assignee)) {
      throw new SkipException(
          "Set manageCatalogPermissionDefaultAssignee or sdkWorkspacePermissionTarget to run manageCatalogPermission");
    }

    ManageCatalogPermissionDetails details =
        manageCatalogPermissionDetails(assignee);
    ManageCatalogPermissionRequest.Builder request =
        ManageCatalogPermissionRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .catalogKey(targetCatalogKey)
            .manageCatalogPermissionDetails(details)
            .opcRequestId(requestId("manage-catalog-permission"));
    if (!isBlank(manageCatalogPermissionIfMatch)) {
      request.ifMatch(manageCatalogPermissionIfMatch);
    }
    if (!isBlank(manageCatalogPermissionShouldUpdateRecent)) {
      request.shouldUpdateRecent(
          parseBoolean(manageCatalogPermissionShouldUpdateRecent, "manageCatalogPermissionShouldUpdateRecent"));
    }

    ManageCatalogPermissionResponse response = catalogClient.manageCatalogPermission(request.build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertFalse(isBlank(response.getOpcRequestId()), "opc-request-id should be present");
  }

  @Test(
      groups = {"sdk_tests", "sdk_catalog", "catalog", "rel_validation"},
      dependsOnMethods = {"updateCatalog"})
  public void deleteCatalog() {
    String targetCatalogKey = firstNonBlank(createdCatalogKey, deleteCatalogKey);
    assertFalse(isBlank(targetCatalogKey), "catalog key should be available for delete");

    DeleteCatalogRequest.Builder request =
        DeleteCatalogRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .catalogKey(targetCatalogKey)
            .opcRequestId(requestId("delete-catalog"));
    if (!isBlank(deleteCatalogIfMatch)) {
      request.ifMatch(deleteCatalogIfMatch);
    }
    if (!isBlank(deleteCatalogIsForced)) {
      request.isForced(parseBoolean(deleteCatalogIsForced, "deleteCatalogIsForced"));
    }
    if (!isBlank(deleteCatalogShouldUpdateRecent)) {
      request.shouldUpdateRecent(parseBoolean(deleteCatalogShouldUpdateRecent, "deleteCatalogShouldUpdateRecent"));
    }

    DeleteCatalogResponse response;
    try {
      response = catalogClient.deleteCatalog(request.build());
    } catch (BmcException e) {
      if (targetCatalogKey.equals(createdCatalogKey) && isNotFound(e)) {
        createdCatalogDeleted = true;
        return;
      }
      throw e;
    }
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertFalse(isBlank(response.getOpcRequestId()), "opc-request-id should be present");
    if (targetCatalogKey.equals(createdCatalogKey)) {
      createdCatalogDeleted = true;
    }
  }

  @AfterClass(alwaysRun = true)
  public void cleanup() {
    try {
      if (!isBlank(createdCatalogKey) && !createdCatalogDeleted) {
        catalogClient.deleteCatalog(
            DeleteCatalogRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .catalogKey(createdCatalogKey)
                .opcRequestId(requestId("cleanup-catalog"))
                .build());
      }
    } catch (Exception ignored) {
      // Best-effort cleanup.
    } finally {
      if (catalogClient != null) {
        catalogClient.close();
      }
    }
  }

  private String resolveCatalogKeyByDisplayName(String displayName) throws Exception {
    for (int attempt = 0; attempt < 10; attempt++) {
      ListCatalogsResponse response =
          catalogClient.listCatalogs(
              ListCatalogsRequest.builder()
                  .aiDataPlatformId(config.dataHubId())
                  .displayName(displayName)
                  .limit(50)
                  .sortBy(ListCatalogsRequest.SortBy.TimeCreated)
                  .sortOrder(SortOrder.Desc)
                  .opcRequestId(requestId("resolve-catalog"))
                  .build());
      if (response.getCatalogCollection() != null && response.getCatalogCollection().getItems() != null) {
        for (CatalogSummary item : response.getCatalogCollection().getItems()) {
          if (displayName.equals(item.getDisplayName()) && !isBlank(item.getKey())) {
            return item.getKey();
          }
        }
      }
      Thread.sleep(750L);
    }
    return null;
  }

  private CatalogTestConnectionDetails catalogTestConnectionDetails(String catalogKey) {
    CatalogTestConnectionDetails.Builder builder =
        CatalogTestConnectionDetails.builder().key(catalogKey);
    if (!isBlank(testConnectionSourceType)) {
      builder.sourceType(ExternalCatalogSourceType.create(testConnectionSourceType));
    }
    return builder.build();
  }

  private boolean isAllowedCatalogTestConnectionState(BmcException e) {
    int status = e.getStatusCode();
    return status == 400 || status == 409 || status == 422;
  }

  private String effectiveCatalogKey(String configuredCatalogKey) {
    return firstNonBlank(
        configuredCatalogKey,
        getCatalogKey,
        listedCatalogKey,
        createdCatalogKey,
        config.catalogKey());
  }

  private CreateCatalogDetails createCatalogDetails(String displayName) {
    CreateCatalogDetails.Builder builder =
        CreateCatalogDetails.builder()
            .displayName(displayName)
            .description(config.value("createCatalogDescription", "Created by CatalogSdkIT"))
            .catalogType(CatalogType.create(config.value("createCatalogType", "INTERNAL")));
    String sourceType = config.value("createCatalogSourceType", "");
    if (!isBlank(sourceType)) {
      builder.sourceType(ExternalCatalogSourceType.create(sourceType));
    }
    return builder.build();
  }

  private UpdateCatalogDetails updateCatalogDetails() {
    return UpdateCatalogDetails.builder()
        .displayName(uniqueName("sdk_catalog_updated_it", config.value("updateCatalogDisplayName", "")))
        .description(config.value("updateCatalogDescription", "Updated by CatalogSdkIT"))
        .properties(Map.of())
        .build();
  }

  private ManageCatalogPermissionDetails manageCatalogPermissionDetails(String assignee) {
    return ManageCatalogPermissionDetails.builder()
        .assignCatalogPermissionDetails(
            AssignCatalogPermissionDetails.builder()
                .assignees(permissionAssignees(assignee))
                .permissions(List.of(CatalogPrivilege.Select))
                .build())
        .build();
  }

  private PermissionAssignees permissionAssignees(String assignee) {
    return PermissionAssignees.builder()
        .type(GranteeType.User)
        .targets(List.of(assignee))
        .build();
  }

  private String permissionTarget(String key) {
    return firstNonBlank(config.value(key, ""), config.workspacePermissionTarget());
  }

  private static String uniqueName(String defaultPrefix, String configuredName) {
    return firstNonBlank(configuredName, defaultPrefix)
        + "_"
        + UUID.randomUUID().toString().substring(0, 8);
  }

  private static Boolean parseBoolean(String value, String fieldName) {
    if ("true".equalsIgnoreCase(value) || "false".equalsIgnoreCase(value)) {
      return Boolean.parseBoolean(value);
    }
    throw new IllegalArgumentException(fieldName + " must be true or false: " + value);
  }

  private static int parsePositiveInt(String value, String fieldName) {
    try {
      int parsed = Integer.parseInt(value);
      if (parsed <= 0) {
        throw new IllegalArgumentException(fieldName + " must be > 0: " + value);
      }
      return parsed;
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException(fieldName + " must be an integer: " + value, e);
    }
  }

  private static String requestId(String prefix) {
    String boundedPrefix = prefix.length() > 24 ? prefix.substring(0, 24) : prefix;
    return boundedPrefix + "-" + UUID.randomUUID();
  }

  private static String firstNonBlank(String... values) {
    for (String value : values) {
      if (!isBlank(value)) {
        return value;
      }
    }
    return null;
  }

  private static boolean isBlank(String value) {
    return value == null || value.isBlank();
  }

  private static boolean isNotFound(BmcException e) {
    return e.getStatusCode() == 404;
  }
}
