package com.oracle.aidp.sdk.deltashare;

import static com.oracle.aidp.sdk.support.SdkTestSupport.assertSuccessful;
import static com.oracle.aidp.sdk.support.SdkTestSupport.isBlank;
import static com.oracle.aidp.sdk.support.SdkTestSupport.requestId;
import static com.oracle.aidp.sdk.support.SdkTestSupport.requireValue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import com.oracle.aidp.sdk.client.SdkClients;
import com.oracle.aidp.sdk.config.SdkTestConfig;
import com.oracle.aidataplatform.dp.DeltaShareClient;
import com.oracle.aidataplatform.dp.SchemaClient;
import com.oracle.aidataplatform.dp.model.AssignRecipientPermissionDetails;
import com.oracle.aidataplatform.dp.model.AssignSharePermissionDetails;
import com.oracle.aidataplatform.dp.model.CreateRecipientDetails;
import com.oracle.aidataplatform.dp.model.CreateSchemaDetails;
import com.oracle.aidataplatform.dp.model.CreateShareDetails;
import com.oracle.aidataplatform.dp.model.CreateTableDetails;
import com.oracle.aidataplatform.dp.model.DataFormat;
import com.oracle.aidataplatform.dp.model.GranteeType;
import com.oracle.aidataplatform.dp.model.ManagedTableDefinition;
import com.oracle.aidataplatform.dp.model.ManageRecipientPermissionDetails;
import com.oracle.aidataplatform.dp.model.ManageShareAccessDetails;
import com.oracle.aidataplatform.dp.model.ManageShareDataAssetDetails;
import com.oracle.aidataplatform.dp.model.ManageSharePermissionDetails;
import com.oracle.aidataplatform.dp.model.PermissionAssignees;
import com.oracle.aidataplatform.dp.model.RecipientPrivilege;
import com.oracle.aidataplatform.dp.model.RevokeRecipientPermissionDetails;
import com.oracle.aidataplatform.dp.model.RevokeSharePermissionDetails;
import com.oracle.aidataplatform.dp.model.ShareAccessAction;
import com.oracle.aidataplatform.dp.model.ShareDataAssetAction;
import com.oracle.aidataplatform.dp.model.ShareDataAssetType;
import com.oracle.aidataplatform.dp.model.SharePrivilege;
import com.oracle.aidataplatform.dp.model.SortOrder;
import com.oracle.aidataplatform.dp.model.TableFieldDetails;
import com.oracle.aidataplatform.dp.model.TableType;
import com.oracle.aidataplatform.dp.model.UpdateRecipientDetails;
import com.oracle.aidataplatform.dp.model.UpdateShareDetails;
import com.oracle.aidataplatform.dp.requests.CreateRecipientRequest;
import com.oracle.aidataplatform.dp.requests.CreateSchemaRequest;
import com.oracle.aidataplatform.dp.requests.CreateShareRequest;
import com.oracle.aidataplatform.dp.requests.CreateTableRequest;
import com.oracle.aidataplatform.dp.requests.DeleteRecipientRequest;
import com.oracle.aidataplatform.dp.requests.DeleteSchemaRequest;
import com.oracle.aidataplatform.dp.requests.DeleteShareRequest;
import com.oracle.aidataplatform.dp.requests.DeleteTableRequest;
import com.oracle.aidataplatform.dp.requests.GetRecipientRequest;
import com.oracle.aidataplatform.dp.requests.GetSchemaRequest;
import com.oracle.aidataplatform.dp.requests.GetShareRequest;
import com.oracle.aidataplatform.dp.requests.GetTableRequest;
import com.oracle.aidataplatform.dp.requests.ListRecipientPermissionsRequest;
import com.oracle.aidataplatform.dp.requests.ListRecipientSharesRequest;
import com.oracle.aidataplatform.dp.requests.ListRecipientsRequest;
import com.oracle.aidataplatform.dp.requests.ListShareDataAssetsRequest;
import com.oracle.aidataplatform.dp.requests.ListSharePermissionsRequest;
import com.oracle.aidataplatform.dp.requests.ListShareRecipientsRequest;
import com.oracle.aidataplatform.dp.requests.ListSharesRequest;
import com.oracle.aidataplatform.dp.requests.ManageRecipientPermissionRequest;
import com.oracle.aidataplatform.dp.requests.ManageShareAccessRequest;
import com.oracle.aidataplatform.dp.requests.ManageShareDataAssetRequest;
import com.oracle.aidataplatform.dp.requests.ManageSharePermissionRequest;
import com.oracle.aidataplatform.dp.requests.UpdateRecipientRequest;
import com.oracle.aidataplatform.dp.requests.UpdateShareRequest;
import com.oracle.aidataplatform.dp.responses.CreateRecipientResponse;
import com.oracle.aidataplatform.dp.responses.CreateSchemaResponse;
import com.oracle.aidataplatform.dp.responses.CreateShareResponse;
import com.oracle.aidataplatform.dp.responses.CreateTableResponse;
import com.oracle.aidataplatform.dp.responses.DeleteRecipientResponse;
import com.oracle.aidataplatform.dp.responses.DeleteShareResponse;
import com.oracle.aidataplatform.dp.responses.GetRecipientResponse;
import com.oracle.aidataplatform.dp.responses.GetShareResponse;
import com.oracle.aidataplatform.dp.responses.ListRecipientPermissionsResponse;
import com.oracle.aidataplatform.dp.responses.ListRecipientSharesResponse;
import com.oracle.aidataplatform.dp.responses.ListRecipientsResponse;
import com.oracle.aidataplatform.dp.responses.ListShareDataAssetsResponse;
import com.oracle.aidataplatform.dp.responses.ListSharePermissionsResponse;
import com.oracle.aidataplatform.dp.responses.ListShareRecipientsResponse;
import com.oracle.aidataplatform.dp.responses.ListSharesResponse;
import com.oracle.aidataplatform.dp.responses.ManageRecipientPermissionResponse;
import com.oracle.aidataplatform.dp.responses.ManageShareAccessResponse;
import com.oracle.aidataplatform.dp.responses.ManageShareDataAssetResponse;
import com.oracle.aidataplatform.dp.responses.ManageSharePermissionResponse;
import com.oracle.aidataplatform.dp.responses.UpdateRecipientResponse;
import com.oracle.aidataplatform.dp.responses.UpdateShareResponse;
import com.oracle.bmc.model.BmcException;
import java.util.List;
import java.util.Map;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DeltaShareSdkIT {
  private SdkTestConfig config;
  private DeltaShareClient deltaShareClient;
  private SchemaClient schemaClient;
  private String createdShareKey;
  private String createdRecipientKey;
  private String createdShareEtag;
  private String createdRecipientEtag;
  private String createdDataAssetSchemaKey;
  private String createdDataAssetTableKey;

  @BeforeClass(
      alwaysRun = true,
      groups = {"sdk_tests", "sdk_deltashare", "deltashare", "rel_validation"})
  public void setUp() throws Exception {
    config = SdkTestConfig.load();
    deltaShareClient = SdkClients.deltaShareClient(config);
    schemaClient = SdkClients.schemaClient(config);
  }

  @Test(groups = {"sdk_tests", "sdk_deltashare", "deltashare", "rel_validation"}, priority = 0)
  public void listSharesTest() {
    ListSharesResponse response =
        deltaShareClient.listShares(
            ListSharesRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .limit(10)
                .sortBy(ListSharesRequest.SortBy.DisplayName)
                .sortOrder(SortOrder.Asc)
                .opcRequestId(requestId("list-shares"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getShareCollection());
    assertNotNull(response.getShareCollection().getItems());
  }

  @Test(groups = {"sdk_tests", "sdk_deltashare", "deltashare", "rel_validation"}, priority = 1)
  public void listRecipientsTest() {
    ListRecipientsResponse response =
        deltaShareClient.listRecipients(
            ListRecipientsRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .limit(10)
                .sortBy(ListRecipientsRequest.SortBy.DisplayName)
                .sortOrder(SortOrder.Asc)
                .opcRequestId(requestId("list-recipients"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getRecipientCollection());
    assertNotNull(response.getRecipientCollection().getItems());
  }

  @Test(groups = {"sdk_tests", "sdk_deltashare", "deltashare", "rel_validation"}, priority = 10)
  public void createShareAndRecipientTest() {
    if (!config.runDeltaShareMutationTests()) {
      throw new SkipException("Set sdkRunDeltaShareMutationTests=true to create Delta Share test resources.");
    }

    String suffix = Long.toString(System.currentTimeMillis());
    String shareName = config.deltaShareNamePrefix() + suffix;
    String recipientName = config.deltaShareRecipientNamePrefix() + suffix;

    CreateShareResponse shareResponse =
        deltaShareClient.createShare(
            CreateShareRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .createShareDetails(
                    CreateShareDetails.builder()
                        .displayName(shareName)
                        .description("Created by DeltaShareSdkIT")
                        .build())
                .shouldUpdateRecent(false)
                .opcRetryToken(requestId("create-share-retry"))
                .opcRequestId(requestId("create-share"))
                .build());

    assertSuccessful(shareResponse.get__httpStatusCode__());
    assertNotNull(shareResponse.getShare());
    createdShareKey = shareResponse.getShare().getKey();
    createdShareEtag = shareResponse.getEtag();
    assertNotNull(createdShareKey);
    assertEquals(shareResponse.getShare().getDisplayName(), shareName);

    CreateRecipientResponse recipientResponse =
        deltaShareClient.createRecipient(
            CreateRecipientRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .createRecipientDetails(
                    CreateRecipientDetails.builder()
                        .displayName(recipientName)
                        .description("Created by DeltaShareSdkIT")
                        .properties(Map.of("sdkTest", "true"))
                        .build())
                .shouldUpdateRecent(false)
                .opcRetryToken(requestId("create-recipient-retry"))
                .opcRequestId(requestId("create-recipient"))
                .build());

    assertSuccessful(recipientResponse.get__httpStatusCode__());
    assertNotNull(recipientResponse.getRecipient());
    createdRecipientKey = recipientResponse.getRecipient().getKey();
    createdRecipientEtag = recipientResponse.getEtag();
    assertNotNull(createdRecipientKey);
    assertEquals(recipientResponse.getRecipient().getDisplayName(), recipientName);
  }

  @Test(
      groups = {"sdk_tests", "sdk_deltashare", "deltashare", "rel_validation"},
      priority = 11,
      dependsOnMethods = "createShareAndRecipientTest")
  public void updateCreatedShareAndRecipientTest() {
    String updatedShareName = createdShareKey + "_updated";
    UpdateShareResponse shareResponse =
        deltaShareClient.updateShare(
            UpdateShareRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .shareKey(createdShareKey)
                .ifMatch(createdShareEtag)
                .updateShareDetails(
                    UpdateShareDetails.builder()
                        .displayName(updatedShareName)
                        .description("Updated by DeltaShareSdkIT")
                        .build())
                .shouldUpdateRecent(false)
                .opcRequestId(requestId("update-share"))
                .build());

    assertSuccessful(shareResponse.get__httpStatusCode__());
    assertNotNull(shareResponse.getOpcRequestId());
    createdShareKey = updatedShareName;
    createdShareEtag = getShare(createdShareKey).getEtag();

    String updatedRecipientName = createdRecipientKey + "_updated";
    UpdateRecipientResponse recipientResponse =
        deltaShareClient.updateRecipient(
            UpdateRecipientRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .recipientKey(createdRecipientKey)
                .ifMatch(createdRecipientEtag)
                .updateRecipientDetails(
                    UpdateRecipientDetails.builder()
                        .displayName(updatedRecipientName)
                        .description("Updated by DeltaShareSdkIT")
                        .properties(Map.of("sdkTest", "updated"))
                        .build())
                .shouldUpdateRecent(false)
                .opcRequestId(requestId("update-recipient"))
                .build());

    assertSuccessful(recipientResponse.get__httpStatusCode__());
    assertNotNull(recipientResponse.getOpcRequestId());
    createdRecipientKey = updatedRecipientName;
    createdRecipientEtag = getRecipient(createdRecipientKey).getEtag();
  }

  @Test(groups = {"sdk_tests", "sdk_deltashare", "deltashare", "rel_validation"}, priority = 20)
  public void getShareTest() {
    String shareKey = effectiveShareKey();

    GetShareResponse response = getShare(shareKey);

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getShare());
    assertEquals(response.getShare().getKey(), shareKey);
  }

  @Test(groups = {"sdk_tests", "sdk_deltashare", "deltashare", "rel_validation"}, priority = 21)
  public void listSharePermissionsTest() {
    String shareKey = effectiveShareKey();

    ListSharePermissionsResponse response =
        deltaShareClient.listSharePermissions(
            ListSharePermissionsRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .shareKey(shareKey)
                .limit(10)
                .sortOrder(SortOrder.Asc)
                .opcRequestId(requestId("list-share-permissions"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getSharePermissionCollection());
    assertNotNull(response.getSharePermissionCollection().getItems());
  }

  @Test(groups = {"sdk_tests", "sdk_deltashare", "deltashare", "rel_validation"}, priority = 22)
  public void listShareRecipientsTest() {
    String shareKey = effectiveShareKey();

    ListShareRecipientsResponse response =
        deltaShareClient.listShareRecipients(
            ListShareRecipientsRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .shareKey(shareKey)
                .limit(10)
                .sortBy(ListShareRecipientsRequest.SortBy.DisplayName)
                .sortOrder(SortOrder.Asc)
                .opcRequestId(requestId("list-share-recipients"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getRecipientCollection());
    assertNotNull(response.getRecipientCollection().getItems());
  }

  @Test(groups = {"sdk_tests", "sdk_deltashare", "deltashare", "rel_validation"}, priority = 23)
  public void listShareDataAssetsTest() {
    String shareKey = effectiveShareKey();

    ListShareDataAssetsResponse response =
        deltaShareClient.listShareDataAssets(
            ListShareDataAssetsRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .shareKey(shareKey)
                .limit(10)
                .sortBy(ListShareDataAssetsRequest.SortBy.DisplayName)
                .sortOrder(SortOrder.Asc)
                .opcRequestId(requestId("list-share-data-assets"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getShareDataAssetCollection());
    assertNotNull(response.getShareDataAssetCollection().getItems());
  }

  @Test(groups = {"sdk_tests", "sdk_deltashare", "deltashare", "rel_validation"}, priority = 30)
  public void getRecipientTest() {
    String recipientKey = effectiveRecipientKey();

    GetRecipientResponse response = getRecipient(recipientKey);

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getRecipient());
    assertEquals(response.getRecipient().getKey(), recipientKey);
  }

  @Test(groups = {"sdk_tests", "sdk_deltashare", "deltashare", "rel_validation"}, priority = 31)
  public void listRecipientPermissionsTest() {
    String recipientKey = effectiveRecipientKey();

    ListRecipientPermissionsResponse response =
        deltaShareClient.listRecipientPermissions(
            ListRecipientPermissionsRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .recipientKey(recipientKey)
                .limit(10)
                .sortOrder(SortOrder.Asc)
                .opcRequestId(requestId("list-recipient-permissions"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getRecipientPermissionCollection());
    assertNotNull(response.getRecipientPermissionCollection().getItems());
  }

  @Test(groups = {"sdk_tests", "sdk_deltashare", "deltashare", "rel_validation"}, priority = 32)
  public void listRecipientSharesTest() {
    String recipientKey = effectiveRecipientKey();

    ListRecipientSharesResponse response =
        deltaShareClient.listRecipientShares(
            ListRecipientSharesRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .recipientKey(recipientKey)
                .limit(10)
                .sortBy(ListRecipientSharesRequest.SortBy.DisplayName)
                .sortOrder(SortOrder.Asc)
                .opcRequestId(requestId("list-recipient-shares"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getShareCollection());
    assertNotNull(response.getShareCollection().getItems());
  }

  @Test(groups = {"sdk_tests", "sdk_deltashare", "deltashare", "rel_validation"}, priority = 40)
  public void manageShareAccessTest() {
    if (!config.runDeltaShareAccessMutationTests()) {
      throw new SkipException("Set sdkRunDeltaShareAccessMutationTests=true to run share access mutation tests.");
    }
    String shareKey = effectiveShareKey();
    String recipientKey = effectiveRecipientKey();

    ManageShareAccessResponse grantResponse;
    try {
      grantResponse = manageShareAccess(shareKey, recipientKey, ShareAccessAction.Grant);
    } catch (BmcException e) {
      if (usesConfiguredShareAccessFixture() && isAlreadyExistsConflict(e)) {
        throw new SkipException(
            "Configured share/recipient access already exists; use test-created resources or revoke the fixture grant before running this mutation test.");
      }
      throw e;
    }
    assertSuccessful(grantResponse.get__httpStatusCode__());
    assertNotNull(grantResponse.getOpcRequestId());

    ManageShareAccessResponse revokeResponse = manageShareAccess(shareKey, recipientKey, ShareAccessAction.Revoke);
    assertSuccessful(revokeResponse.get__httpStatusCode__());
    assertNotNull(revokeResponse.getOpcRequestId());
  }

  @Test(groups = {"sdk_tests", "sdk_deltashare", "deltashare", "rel_validation"}, priority = 41)
  public void manageSharePermissionTest() {
    if (!config.runDeltaSharePermissionMutationTests()) {
      throw new SkipException("Set sdkRunDeltaSharePermissionMutationTests=true to run share permission mutation tests.");
    }
    String shareKey = effectiveShareKey();
    PermissionAssignees assignees = permissionAssignees();

    ManageSharePermissionResponse assignResponse =
        deltaShareClient.manageSharePermission(
            ManageSharePermissionRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .shareKey(shareKey)
                .ifMatch(config.deltaShareIfMatch())
                .manageSharePermissionDetails(
                    ManageSharePermissionDetails.builder()
                        .assignSharePermissionDetails(
                            AssignSharePermissionDetails.builder()
                                .assignees(assignees)
                                .permissions(List.of(SharePrivilege.Read))
                                .build())
                        .build())
                .shouldUpdateRecent(false)
                .opcRequestId(requestId("assign-share-perm"))
                .build());
    assertSuccessful(assignResponse.get__httpStatusCode__());
    assertNotNull(assignResponse.getOpcRequestId());

    ManageSharePermissionResponse revokeResponse =
        deltaShareClient.manageSharePermission(
            ManageSharePermissionRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .shareKey(shareKey)
                .ifMatch(config.deltaShareIfMatch())
                .manageSharePermissionDetails(
                    ManageSharePermissionDetails.builder()
                        .revokeSharePermissionDetails(
                            RevokeSharePermissionDetails.builder()
                                .assignees(assignees)
                                .permissions(List.of(SharePrivilege.Read))
                                .build())
                        .build())
                .shouldUpdateRecent(false)
                .opcRequestId(requestId("revoke-share-perm"))
                .build());
    assertSuccessful(revokeResponse.get__httpStatusCode__());
    assertNotNull(revokeResponse.getOpcRequestId());
  }

  @Test(groups = {"sdk_tests", "sdk_deltashare", "deltashare", "rel_validation"}, priority = 42)
  public void manageRecipientPermissionTest() {
    if (!config.runDeltaSharePermissionMutationTests()) {
      throw new SkipException("Set sdkRunDeltaSharePermissionMutationTests=true to run recipient permission mutation tests.");
    }
    String recipientKey = effectiveRecipientKey();
    PermissionAssignees assignees = permissionAssignees();

    ManageRecipientPermissionResponse assignResponse =
        deltaShareClient.manageRecipientPermission(
            ManageRecipientPermissionRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .recipientKey(recipientKey)
                .ifMatch(config.deltaShareRecipientIfMatch())
                .manageRecipientPermissionDetails(
                    ManageRecipientPermissionDetails.builder()
                        .assignRecipientPermissionDetails(
                            AssignRecipientPermissionDetails.builder()
                                .assignees(assignees)
                                .permissions(List.of(RecipientPrivilege.Read))
                                .build())
                        .build())
                .shouldUpdateRecent(false)
                .opcRequestId(requestId("assign-recipient-perm"))
                .build());
    assertSuccessful(assignResponse.get__httpStatusCode__());
    assertNotNull(assignResponse.getOpcRequestId());

    ManageRecipientPermissionResponse revokeResponse =
        deltaShareClient.manageRecipientPermission(
            ManageRecipientPermissionRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .recipientKey(recipientKey)
                .ifMatch(config.deltaShareRecipientIfMatch())
                .manageRecipientPermissionDetails(
                    ManageRecipientPermissionDetails.builder()
                        .revokeRecipientPermissionDetails(
                            RevokeRecipientPermissionDetails.builder()
                                .assignees(assignees)
                                .permissions(List.of(RecipientPrivilege.Read))
                                .build())
                        .build())
                .shouldUpdateRecent(false)
                .opcRequestId(requestId("revoke-recipient-perm"))
                .build());
    assertSuccessful(revokeResponse.get__httpStatusCode__());
    assertNotNull(revokeResponse.getOpcRequestId());
  }

  @Test(groups = {"sdk_tests", "sdk_deltashare", "deltashare", "rel_validation"}, priority = 43)
  public void manageShareDataAssetTest() {
    if (!config.runDeltaShareDataAssetMutationTests()) {
      throw new SkipException("Set sdkRunDeltaShareDataAssetMutationTests=true to run share data asset mutation tests.");
    }
    String shareKey = effectiveShareKey();
    String dataAssetName = effectiveDataAssetName();
    ShareDataAssetType dataAssetType = ShareDataAssetType.create(config.deltaShareDataAssetType());

    ManageShareDataAssetResponse addResponse =
        manageShareDataAsset(shareKey, dataAssetName, dataAssetType, ShareDataAssetAction.Add);
    assertSuccessful(addResponse.get__httpStatusCode__());
    assertNotNull(addResponse.getOpcRequestId());

    ManageShareDataAssetResponse removeResponse =
        manageShareDataAsset(shareKey, dataAssetName, dataAssetType, ShareDataAssetAction.Remove);
    assertSuccessful(removeResponse.get__httpStatusCode__());
    assertNotNull(removeResponse.getOpcRequestId());
  }

  @Test(
      groups = {"sdk_tests", "sdk_deltashare", "deltashare", "rel_validation"},
      priority = 90,
      dependsOnMethods = "createShareAndRecipientTest",
      alwaysRun = true)
  public void deleteCreatedShareAndRecipientTest() {
    if (createdShareKey == null && createdRecipientKey == null) {
      throw new SkipException("No Delta Share test resources were created by this run.");
    }

    deleteCreatedShare();
    deleteCreatedRecipient();
  }

  @AfterClass(
      alwaysRun = true,
      groups = {"sdk_tests", "sdk_deltashare", "deltashare", "rel_validation"})
  public void tearDown() {
    deleteCreatedShare();
    deleteCreatedRecipient();
    deleteCreatedDataAssetTable();
    deleteCreatedDataAssetSchema();
    if (deltaShareClient != null) {
      deltaShareClient.close();
    }
    if (schemaClient != null) {
      schemaClient.close();
    }
  }

  private GetShareResponse getShare(String shareKey) {
    return deltaShareClient.getShare(
        GetShareRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .shareKey(shareKey)
            .shouldUpdateRecent(false)
            .opcRequestId(requestId("get-share"))
            .build());
  }

  private GetRecipientResponse getRecipient(String recipientKey) {
    return deltaShareClient.getRecipient(
        GetRecipientRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .recipientKey(recipientKey)
            .shouldUpdateRecent(false)
            .opcRequestId(requestId("get-recipient"))
            .build());
  }

  private ManageShareAccessResponse manageShareAccess(
      String shareKey, String recipientKey, ShareAccessAction action) {
    return deltaShareClient.manageShareAccess(
        ManageShareAccessRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .shareKey(shareKey)
            .ifMatch(config.deltaShareIfMatch())
            .manageShareAccessDetails(
                ManageShareAccessDetails.builder().action(action).recipient(recipientKey).build())
            .shouldUpdateRecent(false)
            .opcRetryToken(requestId("manage-share-access-retry"))
            .opcRequestId(requestId("manage-share-access"))
            .build());
  }

  private ManageShareDataAssetResponse manageShareDataAsset(
      String shareKey,
      String dataAssetName,
      ShareDataAssetType dataAssetType,
      ShareDataAssetAction action) {
    return deltaShareClient.manageShareDataAsset(
        ManageShareDataAssetRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .shareKey(shareKey)
            .ifMatch(config.deltaShareIfMatch())
            .manageShareDataAssetDetails(
                ManageShareDataAssetDetails.builder()
                    .action(action)
                    .type(dataAssetType)
                    .name(dataAssetName)
                    .description("Managed by DeltaShareSdkIT")
                    .partition(config.deltaShareDataAssetPartition())
                    .alias(config.deltaShareDataAssetAlias())
                    .build())
            .shouldUpdateRecent(false)
            .opcRequestId(requestId("manage-share-asset"))
            .build());
  }

  private boolean usesConfiguredShareAccessFixture() {
    return createdShareKey == null || createdRecipientKey == null;
  }

  private boolean isAlreadyExistsConflict(BmcException e) {
    String message = e.getMessage();
    return e.getStatusCode() == 409
        && message != null
        && message.toLowerCase().contains("already exists");
  }

  private PermissionAssignees permissionAssignees() {
    String target = requireValue(config, "sdkDeltaSharePermissionTarget");
    return PermissionAssignees.builder()
        .type(GranteeType.create(config.deltaSharePermissionGranteeType()))
        .targets(List.of(target))
        .build();
  }

  private String effectiveShareKey() {
    if (createdShareKey != null) {
      return createdShareKey;
    }
    return requireValue(config, "shareKey");
  }

  private String effectiveRecipientKey() {
    if (createdRecipientKey != null) {
      return createdRecipientKey;
    }
    return requireValue(config, "recipientKey");
  }

  private String effectiveDataAssetName() {
    String configuredName = config.value("sdkDeltaShareDataAssetName", null);
    if (!isBlank(configuredName)) {
      return configuredName;
    }
    if (ShareDataAssetType.Table.getValue().equalsIgnoreCase(config.deltaShareDataAssetType())) {
      return createDataAssetTableFixture();
    }
    return requireValue(config, "sdkDeltaShareDataAssetName");
  }

  private String createDataAssetTableFixture() {
    if (!isBlank(createdDataAssetTableKey)) {
      return createdDataAssetTableKey;
    }
    String suffix = Long.toString(System.currentTimeMillis());
    String schemaName = "sdk_delta_asset_schema_" + suffix;
    String tableName = "sdk_delta_asset_table_" + suffix;

    CreateSchemaResponse schemaResponse =
        schemaClient.createSchema(
            CreateSchemaRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .createSchemaDetails(
                    CreateSchemaDetails.builder()
                        .displayName(schemaName)
                        .catalogName(config.catalogKey())
                        .description("Created by DeltaShareSdkIT")
                        .build())
                .shouldUpdateRecent(false)
                .opcRetryToken(requestId("delta-schema-retry"))
                .opcRequestId(requestId("delta-schema"))
                .build());
    assertSuccessful(schemaResponse.get__httpStatusCode__());
    createdDataAssetSchemaKey = createdKey(schemaResponse.getLocation(), config.catalogKey(), schemaName);
    waitForSchema(createdDataAssetSchemaKey);

    CreateTableResponse tableResponse =
        schemaClient.createTable(
            CreateTableRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .createTableDetails(
                    CreateTableDetails.builder()
                        .displayName(tableName)
                        .description("Created by DeltaShareSdkIT")
                        .catalogKey(config.catalogKey())
                        .schemaKey(createdDataAssetSchemaKey)
                        .tableType(TableType.Managed)
                        .managedTableDefinition(
                            ManagedTableDefinition.builder()
                                .managedTableDataFormat(DataFormat.create("DELTA"))
                                .build())
                        .tableFields(
                            List.of(
                                TableFieldDetails.builder()
                                    .fieldName("id")
                                    .fieldType("INT")
                                    .fieldDescription("SDK test id")
                                    .build()))
                        .build())
                .shouldUpdateRecent(false)
                .opcRetryToken(requestId("delta-table-retry"))
                .opcRequestId(requestId("delta-table"))
                .build());
    assertSuccessful(tableResponse.get__httpStatusCode__());
    createdDataAssetTableKey = createdKey(tableResponse.getLocation(), createdDataAssetSchemaKey, tableName);
    waitForTable(createdDataAssetTableKey);
    return createdDataAssetTableKey;
  }

  private void waitForSchema(String schemaKey) {
    long deadline = System.nanoTime() + config.schemaReadyTimeout().toNanos();
    while (System.nanoTime() < deadline) {
      try {
        assertSuccessful(
            schemaClient
                .getSchema(
                    GetSchemaRequest.builder()
                        .aiDataPlatformId(config.dataHubId())
                        .schemaKey(schemaKey)
                        .shouldUpdateRecent(false)
                        .opcRequestId(requestId("delta-get-schema"))
                        .build())
                .get__httpStatusCode__());
        return;
      } catch (BmcException e) {
        if (e.getStatusCode() != 404) {
          throw e;
        }
      }
      sleep();
    }
    throw new AssertionError("Timed out waiting for schema " + schemaKey);
  }

  private void waitForTable(String tableKey) {
    long deadline = System.nanoTime() + config.schemaReadyTimeout().toNanos();
    while (System.nanoTime() < deadline) {
      try {
        assertSuccessful(
            schemaClient
                .getTable(
                    GetTableRequest.builder()
                        .aiDataPlatformId(config.dataHubId())
                        .tableKey(tableKey)
                        .shouldUpdateRecent(false)
                        .opcRequestId(requestId("delta-get-table"))
                        .build())
                .get__httpStatusCode__());
        return;
      } catch (BmcException e) {
        if (e.getStatusCode() != 404) {
          throw e;
        }
      }
      sleep();
    }
    throw new AssertionError("Timed out waiting for table " + tableKey);
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

  private void deleteCreatedDataAssetTable() {
    if (createdDataAssetTableKey == null || schemaClient == null || config == null) {
      return;
    }
    try {
      assertSuccessful(
          schemaClient
              .deleteTable(
                  DeleteTableRequest.builder()
                      .aiDataPlatformId(config.dataHubId())
                      .tableKey(createdDataAssetTableKey)
                      .shouldUpdateRecent(false)
                      .opcRequestId(requestId("delta-delete-table"))
                      .build())
              .get__httpStatusCode__());
    } catch (BmcException e) {
      if (e.getStatusCode() != 404) {
        throw e;
      }
    } finally {
      createdDataAssetTableKey = null;
    }
  }

  private void deleteCreatedDataAssetSchema() {
    if (createdDataAssetSchemaKey == null || schemaClient == null || config == null) {
      return;
    }
    try {
      assertSuccessful(
          schemaClient
              .deleteSchema(
                  DeleteSchemaRequest.builder()
                      .aiDataPlatformId(config.dataHubId())
                      .schemaKey(createdDataAssetSchemaKey)
                      .shouldUpdateRecent(false)
                      .opcRequestId(requestId("delta-delete-schema"))
                      .build())
              .get__httpStatusCode__());
    } catch (BmcException e) {
      if (e.getStatusCode() != 404) {
        throw e;
      }
    } finally {
      createdDataAssetSchemaKey = null;
    }
  }

  private void sleep() {
    try {
      Thread.sleep(config.pollInterval().toMillis());
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new RuntimeException("Interrupted while waiting for Delta Share data asset fixture.", e);
    }
  }

  private void deleteCreatedShare() {
    if (createdShareKey == null || deltaShareClient == null || config == null) {
      return;
    }
    try {
      DeleteShareResponse response =
          deltaShareClient.deleteShare(
              DeleteShareRequest.builder()
                  .aiDataPlatformId(config.dataHubId())
                  .shareKey(createdShareKey)
                  .ifMatch(createdShareEtag)
                  .shouldUpdateRecent(false)
                  .opcRequestId(requestId("delete-share"))
                  .build());
      assertSuccessful(response.get__httpStatusCode__());
      createdShareKey = null;
    } catch (BmcException e) {
      if (e.getStatusCode() != 404) {
        throw e;
      }
      createdShareKey = null;
    }
  }

  private void deleteCreatedRecipient() {
    if (createdRecipientKey == null || deltaShareClient == null || config == null) {
      return;
    }
    try {
      DeleteRecipientResponse response =
          deltaShareClient.deleteRecipient(
              DeleteRecipientRequest.builder()
                  .aiDataPlatformId(config.dataHubId())
                  .recipientKey(createdRecipientKey)
                  .ifMatch(createdRecipientEtag)
                  .shouldUpdateRecent(false)
                  .opcRequestId(requestId("delete-recipient"))
                  .build());
      assertSuccessful(response.get__httpStatusCode__());
      createdRecipientKey = null;
    } catch (BmcException e) {
      if (e.getStatusCode() != 404) {
        throw e;
      }
      createdRecipientKey = null;
    }
  }
}
