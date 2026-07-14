package com.oracle.aidp.sdk.workspace;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import com.oracle.aidp.sdk.client.SdkClients;
import com.oracle.aidp.sdk.config.SdkTestConfig;
import com.oracle.aidp.sdk.support.SDKGitHelper;
import com.oracle.aidp.sdk.support.SdkTestSupport;
import com.oracle.aidataplatform.dp.WorkspaceClient;
import com.oracle.aidataplatform.dp.model.AssignCreateWorkspacePermissionDetails;
import com.oracle.aidataplatform.dp.model.AssignWorkspacePermissionDetails;
import com.oracle.aidataplatform.dp.model.CreateWorkspaceDetails;
import com.oracle.aidataplatform.dp.model.GranteeType;
import com.oracle.aidataplatform.dp.model.ManageCreateWorkspacePermissionDetails;
import com.oracle.aidataplatform.dp.model.ManageWorkspacePermissionDetails;
import com.oracle.aidataplatform.dp.model.PermissionAssignees;
import com.oracle.aidataplatform.dp.model.RevokeCreateWorkspacePermissionDetails;
import com.oracle.aidataplatform.dp.model.RevokeWorkspacePermissionDetails;
import com.oracle.aidataplatform.dp.model.SortOrder;
import com.oracle.aidataplatform.dp.model.UpdateWorkspaceAsyncOperationStatusDetails;
import com.oracle.aidataplatform.dp.model.UpdateWorkspaceDetails;
import com.oracle.aidataplatform.dp.model.Workspace;
import com.oracle.aidataplatform.dp.model.WorkspacePrivilege;
import com.oracle.aidataplatform.dp.requests.CreateWorkspaceRequest;
import com.oracle.aidataplatform.dp.requests.DeleteWorkspaceRequest;
import com.oracle.aidataplatform.dp.requests.GetWorkspaceRequest;
import com.oracle.aidataplatform.dp.requests.ListCreateWorkspacePermissionsRequest;
import com.oracle.aidataplatform.dp.requests.ListWorkspacePermissionsRequest;
import com.oracle.aidataplatform.dp.requests.ListWorkspacesRequest;
import com.oracle.aidataplatform.dp.requests.ManageCreateWorkspacePermissionRequest;
import com.oracle.aidataplatform.dp.requests.ManageWorkspacePermissionRequest;
import com.oracle.aidataplatform.dp.requests.UpdateWorkspaceAsyncOperationStatusRequest;
import com.oracle.aidataplatform.dp.requests.UpdateWorkspaceRequest;
import com.oracle.aidataplatform.dp.responses.CreateWorkspaceResponse;
import com.oracle.aidataplatform.dp.responses.DeleteWorkspaceResponse;
import com.oracle.aidataplatform.dp.responses.GetWorkspaceResponse;
import com.oracle.aidataplatform.dp.responses.ListCreateWorkspacePermissionsResponse;
import com.oracle.aidataplatform.dp.responses.ListWorkspacePermissionsResponse;
import com.oracle.aidataplatform.dp.responses.ListWorkspacesResponse;
import com.oracle.aidataplatform.dp.responses.ManageCreateWorkspacePermissionResponse;
import com.oracle.aidataplatform.dp.responses.ManageWorkspacePermissionResponse;
import com.oracle.aidataplatform.dp.responses.UpdateWorkspaceAsyncOperationStatusResponse;
import com.oracle.aidataplatform.dp.responses.UpdateWorkspaceResponse;
import com.oracle.bmc.model.BmcException;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WorkspaceSdkIT {
  private static final String WORKSPACE_NAME_PREFIX = "IT_Workspace_SDK_";
  private static final String UPDATED_WORKSPACE_NAME_PREFIX = "Updated_Display_Name_SDK_";

  private SdkTestConfig config;
  private WorkspaceClient workspaceClient;
  private String displayName;
  private String updatedDisplayName;
  private String workspaceKey;
  private String workspaceCreateAsyncOperationKey;
  private SDKGitHelper gitFixture;
  private String gitFolderPath;
  private int permissionCount;
  private int createWorkspacePermissionCount;

  @BeforeClass(
      alwaysRun = true,
      groups = {"sdk_tests", "sdk_workspace", "workspace", "rel_validation"})
  public void setUp() throws Exception {
    config = SdkTestConfig.load();
    workspaceClient = SdkClients.workspaceClient(config);
  }

  @Test(groups = {"sdk_tests", "sdk_workspace", "workspace", "rel_validation"})
  public void createWorkspaceTest() {
    displayName = WORKSPACE_NAME_PREFIX + UUID.randomUUID();
    CreateWorkspaceResponse response =
        workspaceClient.createWorkspace(
            CreateWorkspaceRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .createWorkspaceDetails(
                    CreateWorkspaceDetails.builder()
                        .displayName(displayName)
                        .description("Workspace created by WorkspaceSdkIT")
                        .defaultCatalogKey("default")
                        .build())
                .opcRetryToken(requestId("create-workspace-retry"))
                .opcRequestId(requestId("create-workspace"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertEquals(response.get__httpStatusCode__(), 201);
    Workspace workspace = response.getWorkspace();
    assertNotNull(workspace, "Created workspace should be present.");
    assertEquals(workspace.getDisplayName(), displayName);
    assertNotNull(workspace.getKey(), "Created workspace key should be present.");
    workspaceKey = workspace.getKey();
    workspaceCreateAsyncOperationKey = response.getAidpAsyncOperationKey();

    waitForWorkspaceLifecycleState(workspaceKey, Workspace.LifecycleState.Active);
  }

  @Test(
      groups = {"sdk_tests", "sdk_workspace", "workspace", "rel_validation"},
      dependsOnMethods = {"createWorkspaceTest"})
  public void getWorkspaceTest() {
    Workspace workspace = getWorkspace(workspaceKey).getWorkspace();
    assertNotNull(workspace, "Fetched workspace should be present.");
    assertEquals(workspace.getKey(), workspaceKey);
    assertEquals(workspace.getDisplayName(), displayName);
    assertEquals(workspace.getLifecycleState(), Workspace.LifecycleState.Active);
  }

  @Test(
      groups = {"sdk_tests", "sdk_workspace", "workspace", "rel_validation"},
      dependsOnMethods = {"createWorkspaceTest"})
  public void listWorkspacesTest() {
    ListWorkspacesResponse response =
        workspaceClient.listWorkspaces(
            ListWorkspacesRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .lifecycleState(Workspace.LifecycleState.Active)
                .limit(10)
                .sortOrder(SortOrder.Asc)
                .sortBy(ListWorkspacesRequest.SortBy.DisplayName)
                .opcRequestId(requestId("list-workspaces"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getWorkspaceCollection());
    assertFalse(
        response.getWorkspaceCollection().getItems().isEmpty(),
        "Workspace list should contain at least one item.");
  }

  @Test(
      groups = {"sdk_tests", "sdk_workspace", "workspace", "rel_validation"},
      dependsOnMethods = {"createWorkspaceTest"})
  public void listWorkspacesByDisplayNameTest() {
    ListWorkspacesResponse response =
        workspaceClient.listWorkspaces(
            ListWorkspacesRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .lifecycleState(Workspace.LifecycleState.Active)
                .displayName(displayName)
                .limit(10)
                .sortOrder(SortOrder.Asc)
                .sortBy(ListWorkspacesRequest.SortBy.DisplayName)
                .opcRequestId(requestId("list-workspaces-display-name"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    List<?> workspaces = response.getWorkspaceCollection().getItems();
    assertEquals(workspaces.size(), 1, "Display-name filter should return exactly one workspace.");
    assertEquals(response.getWorkspaceCollection().getItems().get(0).getDisplayName(), displayName);
  }

  @Test(
      groups = {"sdk_tests", "sdk_workspace", "workspace", "rel_validation"},
      dependsOnMethods = {"createWorkspaceTest"})
  public void updateWorkspaceDisplayNameTest() {
    updatedDisplayName = UPDATED_WORKSPACE_NAME_PREFIX + System.currentTimeMillis();

    UpdateWorkspaceResponse response =
        workspaceClient.updateWorkspace(
            UpdateWorkspaceRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .updateWorkspaceDetails(
                    UpdateWorkspaceDetails.builder().displayName(updatedDisplayName).build())
                .opcRequestId(requestId("update-workspace-display-name"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertEquals(response.get__httpStatusCode__(), 202);
    assertEquals(response.getWorkspace().getDisplayName(), updatedDisplayName);
    waitForWorkspaceLifecycleState(workspaceKey, Workspace.LifecycleState.Active);
  }

  @Test(
      groups = {"sdk_tests", "sdk_workspace", "workspace", "rel_validation"},
      dependsOnMethods = {"updateWorkspaceDisplayNameTest"})
  public void updateWorkspaceDescriptionTest() {
    String description = "Updated description for Java SDK rel validation.";

    UpdateWorkspaceResponse response =
        workspaceClient.updateWorkspace(
            UpdateWorkspaceRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .updateWorkspaceDetails(
                    UpdateWorkspaceDetails.builder().description(description).build())
                .opcRequestId(requestId("update-workspace-description"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertEquals(response.getWorkspace().getDescription(), description);
    waitForWorkspaceLifecycleState(workspaceKey, Workspace.LifecycleState.Active);
  }

  @Test(
      groups = {"sdk_tests", "sdk_workspace", "workspace", "rel_validation"},
      dependsOnMethods = {"createWorkspaceTest"})
  public void listCreateWorkspacePermissionsTest() {
    ListCreateWorkspacePermissionsResponse response =
        workspaceClient.listCreateWorkspacePermissions(
            ListCreateWorkspacePermissionsRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .limit(10)
                .sortOrder(SortOrder.Asc)
                .opcRequestId(requestId("list-create-workspace-permissions"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getCreateWorkspacePermissionCollection());
    assertNotNull(response.getCreateWorkspacePermissionCollection().getItems());
    createWorkspacePermissionCount = response.getCreateWorkspacePermissionCollection().getItems().size();
  }

  @Test(
      groups = {"sdk_tests", "sdk_workspace", "workspace", "rel_validation"},
      dependsOnMethods = {"listCreateWorkspacePermissionsTest"})
  public void manageCreateWorkspacePermissionTest() {
    requireCreateWorkspacePermissionMutationConfig();

    ManageCreateWorkspacePermissionResponse response =
        workspaceClient.manageCreateWorkspacePermission(
            ManageCreateWorkspacePermissionRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .manageCreateWorkspacePermissionDetails(assignCreateWorkspacePermissionDetails())
                .opcRetryToken(requestId("manage-create-workspace-permission-retry"))
                .opcRequestId(requestId("manage-create-workspace-permission"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    ListCreateWorkspacePermissionsResponse permissions = listCreateWorkspacePermissions();
    assertTrue(
        permissions.getCreateWorkspacePermissionCollection().getItems().size()
            >= createWorkspacePermissionCount,
        "Create-workspace permission count should not shrink after assign.");
  }

  @Test(
      groups = {"sdk_tests", "sdk_workspace", "workspace", "rel_validation"},
      dependsOnMethods = {"manageCreateWorkspacePermissionTest"})
  public void revokeCreateWorkspacePermissionTest() {
    ManageCreateWorkspacePermissionResponse response =
        workspaceClient.manageCreateWorkspacePermission(
            ManageCreateWorkspacePermissionRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .manageCreateWorkspacePermissionDetails(revokeCreateWorkspacePermissionDetails())
                .opcRetryToken(requestId("revoke-create-workspace-permission-retry"))
                .opcRequestId(requestId("revoke-create-workspace-permission"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    ListCreateWorkspacePermissionsResponse permissions = listCreateWorkspacePermissions();
    assertTrue(
        permissions.getCreateWorkspacePermissionCollection().getItems().size()
            <= createWorkspacePermissionCount,
        "Create-workspace permission count should return to its original size after revoke.");
  }

  @Test(
      groups = {"sdk_tests", "sdk_workspace", "workspace", "rel_validation"},
      dependsOnMethods = {"createWorkspaceTest"})
  public void listWorkspacePermissionsTest() {
    ListWorkspacePermissionsResponse response =
        listWorkspacePermissions(workspaceKey);
    permissionCount = response.getWorkspacePermissionCollection().getItems().size();
  }

  @Test(
      groups = {"sdk_tests", "sdk_workspace", "workspace", "rel_validation"},
      dependsOnMethods = {"listWorkspacePermissionsTest"})
  public void manageWorkspacePermissionTest() {
    requirePermissionMutationConfig();

    ManageWorkspacePermissionResponse response =
        workspaceClient.manageWorkspacePermission(
            ManageWorkspacePermissionRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .manageWorkspacePermissionDetails(assignWorkspacePermissionDetails())
                .opcRetryToken(requestId("manage-workspace-permission-retry"))
                .opcRequestId(requestId("manage-workspace-permission"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    ListWorkspacePermissionsResponse permissions = listWorkspacePermissions(workspaceKey);
    assertTrue(
        permissions.getWorkspacePermissionCollection().getItems().size() >= permissionCount,
        "Workspace permission count should not shrink after assign.");
  }

  @Test(
      groups = {"sdk_tests", "sdk_workspace", "workspace", "rel_validation"},
      dependsOnMethods = {"manageWorkspacePermissionTest"})
  public void revokeWorkspacePermissionTest() {
    ManageWorkspacePermissionResponse response =
        workspaceClient.manageWorkspacePermission(
            ManageWorkspacePermissionRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .manageWorkspacePermissionDetails(revokeWorkspacePermissionDetails())
                .opcRetryToken(requestId("revoke-workspace-permission-retry"))
                .opcRequestId(requestId("revoke-workspace-permission"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    ListWorkspacePermissionsResponse permissions = listWorkspacePermissions(workspaceKey);
    assertTrue(
        permissions.getWorkspacePermissionCollection().getItems().size() <= permissionCount,
        "Workspace permission count should return to its original size after revoke.");
  }

  @Test(
      groups = {"sdk_tests", "sdk_workspace", "workspace", "rel_validation"},
      dependsOnMethods = {"createWorkspaceTest"})
  public void createGitFolderTest() throws Exception {
    requireGitFolderConfig();

    gitFolderPath =
        isBlank(config.gitFolderPath()) ? "sdk_git_" + System.currentTimeMillis() : config.gitFolderPath();
    gitFixture = new SDKGitHelper(config, workspaceKey, gitFolderPath);
    gitFixture.ensureGitFolderAvailable();
    assertNotNull(gitFixture.folderPath());
  }

  @Test(
      groups = {"sdk_tests", "sdk_workspace", "workspace", "rel_validation"},
      dependsOnMethods = {"createWorkspaceTest"})
  public void updateWorkspaceAsyncOperationStatusTest() {
    requireWorkspaceAsyncOperationStatusConfig();

    UpdateWorkspaceAsyncOperationStatusResponse response =
        workspaceClient.updateWorkspaceAsyncOperationStatus(
            UpdateWorkspaceAsyncOperationStatusRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceAsyncOperationWorkspaceKey())
                .asyncOperationKey(workspaceAsyncOperationKey())
                .ifMatch(config.workspaceAsyncOperationIfMatch())
                .updateWorkspaceAsyncOperationStatusDetails(
                    updateWorkspaceAsyncOperationStatusDetails())
                .opcRequestId(requestId("update-workspace-async-operation-status"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getWorkspace());
  }

  @Test(
      groups = {"sdk_tests", "sdk_workspace", "workspace", "rel_validation"},
      dependsOnMethods = {
        "getWorkspaceTest",
        "listWorkspacesTest",
        "listWorkspacesByDisplayNameTest",
        "updateWorkspaceDescriptionTest",
        "listCreateWorkspacePermissionsTest",
        "manageCreateWorkspacePermissionTest",
        "revokeCreateWorkspacePermissionTest",
        "listWorkspacePermissionsTest",
        "manageWorkspacePermissionTest",
        "revokeWorkspacePermissionTest",
        "createGitFolderTest",
        "updateWorkspaceAsyncOperationStatusTest"
      },
      alwaysRun = true,
      priority = 100)
  public void deleteWorkspaceTest() {
    closeGitFixture();
    deleteWorkspaceIfPresent();
  }

  @AfterClass(
      alwaysRun = true,
      groups = {"sdk_tests", "sdk_workspace", "workspace", "rel_validation"})
  public void cleanUp() {
    try {
      closeGitFixture();
      deleteWorkspaceIfPresent();
    } finally {
      closeWorkspaceClient();
    }
  }

  private ListWorkspacePermissionsResponse listWorkspacePermissions(String key) {
    ListWorkspacePermissionsResponse response =
        workspaceClient.listWorkspacePermissions(
            ListWorkspacePermissionsRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(key)
                .limit(10)
                .sortOrder(SortOrder.Asc)
                .opcRequestId(requestId("list-workspace-permissions"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getWorkspacePermissionCollection());
    assertNotNull(response.getWorkspacePermissionCollection().getItems());
    return response;
  }

  private void deleteWorkspaceIfPresent() {
    if (workspaceClient == null || isBlank(workspaceKey)) {
      return;
    }

    String keyToDelete = workspaceKey;
    try {
      DeleteWorkspaceResponse response =
          workspaceClient.deleteWorkspace(
              DeleteWorkspaceRequest.builder()
                  .aiDataPlatformId(config.dataHubId())
                  .workspaceKey(keyToDelete)
                  .opcRequestId(requestId("delete-workspace"))
                  .build());
      assertSuccessful(response.get__httpStatusCode__());
      waitForWorkspaceDeleted(keyToDelete);
    } catch (BmcException e) {
      if (e.getStatusCode() != 404) {
        throw e;
      }
    } finally {
      workspaceKey = null;
    }
  }

  private ListCreateWorkspacePermissionsResponse listCreateWorkspacePermissions() {
    ListCreateWorkspacePermissionsResponse response =
        workspaceClient.listCreateWorkspacePermissions(
            ListCreateWorkspacePermissionsRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .limit(10)
                .sortOrder(SortOrder.Asc)
                .opcRequestId(requestId("list-create-workspace-permissions-after-mutation"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getCreateWorkspacePermissionCollection());
    assertNotNull(response.getCreateWorkspacePermissionCollection().getItems());
    return response;
  }

  private GetWorkspaceResponse getWorkspace(String key) {
    GetWorkspaceResponse response =
        workspaceClient.getWorkspace(
            GetWorkspaceRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(key)
                .opcRequestId(requestId("get-workspace"))
                .build());
    assertSuccessful(response.get__httpStatusCode__());
    return response;
  }

  private void waitForWorkspaceLifecycleState(String key, Workspace.LifecycleState expectedState) {
    long deadline = System.nanoTime() + config.workspaceReadyTimeout().toNanos();
    AssertionError lastError = null;
    while (System.nanoTime() < deadline) {
      try {
        Workspace workspace = getWorkspace(key).getWorkspace();
        if (workspace != null && expectedState == workspace.getLifecycleState()) {
          return;
        }
      } catch (AssertionError e) {
        lastError = e;
      }
      sleep(config.pollInterval());
    }
    if (lastError != null) {
      throw lastError;
    }
    throw new AssertionError("Workspace " + key + " did not reach state " + expectedState);
  }

  private void waitForWorkspaceDeleted(String key) {
    long deadline = System.nanoTime() + config.workspaceDeleteTimeout().toNanos();
    while (System.nanoTime() < deadline) {
      try {
        getWorkspace(key);
      } catch (BmcException e) {
        if (e.getStatusCode() == 404) {
          return;
        }
      }
      sleep(config.pollInterval());
    }
    throw new AssertionError("Workspace " + key + " was not deleted within configured timeout.");
  }

  private ManageWorkspacePermissionDetails assignWorkspacePermissionDetails() {
    return ManageWorkspacePermissionDetails.builder()
        .assignWorkspacePermissionDetails(
            AssignWorkspacePermissionDetails.builder()
                .assignees(
                    PermissionAssignees.builder()
                        .type(GranteeType.User)
                        .targets(List.of(config.workspacePermissionTarget()))
                        .build())
                .permissions(List.of(WorkspacePrivilege.User))
                .build())
        .build();
  }

  private ManageCreateWorkspacePermissionDetails assignCreateWorkspacePermissionDetails() {
    return ManageCreateWorkspacePermissionDetails.builder()
        .assignCreateWorkspacePermissionDetails(
            AssignCreateWorkspacePermissionDetails.builder().assignees(permissionAssignees()).build())
        .build();
  }

  private ManageWorkspacePermissionDetails revokeWorkspacePermissionDetails() {
    return ManageWorkspacePermissionDetails.builder()
        .revokeWorkspacePermissionDetails(
            RevokeWorkspacePermissionDetails.builder()
                .assignees(
                    PermissionAssignees.builder()
                        .type(GranteeType.User)
                        .targets(List.of(config.workspacePermissionTarget()))
                        .build())
                .permissions(List.of(WorkspacePrivilege.User))
                .build())
        .build();
  }

  private ManageCreateWorkspacePermissionDetails revokeCreateWorkspacePermissionDetails() {
    return ManageCreateWorkspacePermissionDetails.builder()
        .revokeCreateWorkspacePermissionDetails(
            RevokeCreateWorkspacePermissionDetails.builder().assignees(permissionAssignees()).build())
        .build();
  }

  private PermissionAssignees permissionAssignees() {
    return PermissionAssignees.builder()
        .type(GranteeType.User)
        .targets(List.of(config.workspacePermissionTarget()))
        .build();
  }

  private UpdateWorkspaceAsyncOperationStatusDetails updateWorkspaceAsyncOperationStatusDetails() {
    return UpdateWorkspaceAsyncOperationStatusDetails.builder()
        .state(workspaceAsyncOperationState())
        .stateMessage(config.workspaceAsyncOperationStateMessage())
        .externalId(config.workspaceAsyncOperationExternalId())
        .properties(Map.of("source", "WorkspaceSdkIT"))
        .build();
  }

  private UpdateWorkspaceAsyncOperationStatusDetails.State workspaceAsyncOperationState() {
    String state = config.workspaceAsyncOperationState();
    try {
      return UpdateWorkspaceAsyncOperationStatusDetails.State.create(state);
    } catch (IllegalArgumentException e) {
      return UpdateWorkspaceAsyncOperationStatusDetails.State.valueOf(state);
    }
  }

  private void requirePermissionMutationConfig() {
    if (!config.runPermissionMutationTests()) {
      throw new SkipException(
          "Set sdkRunPermissionMutationTests=true to run workspace permission mutation tests.");
    }
    if (isBlank(config.workspacePermissionTarget())) {
      throw new SkipException(
          "Set sdkWorkspacePermissionTarget, subjectId, or userOcid to run permission mutation tests.");
    }
  }

  private void requireCreateWorkspacePermissionMutationConfig() {
    if (!config.runCreateWorkspacePermissionMutationTests()) {
      throw new SkipException(
          "Set sdkRunCreateWorkspacePermissionMutationTests=true to run create-workspace permission mutation tests.");
    }
    if (isBlank(config.workspacePermissionTarget())) {
      throw new SkipException(
          "Set sdkWorkspacePermissionTarget, subjectId, or userOcid to run create-workspace permission mutation tests.");
    }
  }

  private void requireGitFolderConfig() {
    if (!config.runGitFolderTests()) {
      throw new SkipException("Set sdkRunGitFolderTests=true to run workspace git folder tests.");
    }
    if (isBlank(config.gitRepositoryUrl())
        || isBlank(config.gitBranchName())
        || (isBlank(config.gitCredentialKey())
            && (isBlank(config.gitUserName()) || isBlank(config.gitPersonalAccessToken())))) {
      throw new SkipException(
          "Skipping workspace create-git-folder test. Configure sdkGitRepositoryUrl, "
              + "sdkGitBranchName, and either sdkGitCredentialKey or sdkGitUserName plus "
              + "sdkGitPersonalAccessToken; CLI aliases are also supported.");
    }
  }

  private void requireWorkspaceAsyncOperationStatusConfig() {
    if (!config.runWorkspaceAsyncOperationStatusTests()) {
      throw new SkipException(
          "Set sdkRunWorkspaceAsyncOperationStatusTests=true to run workspace async status tests.");
    }
    requireNonBlank(workspaceAsyncOperationWorkspaceKey(), "sdkWorkspaceAsyncOperationWorkspaceKey");
    requireNonBlank(workspaceAsyncOperationKey(), "sdkWorkspaceAsyncOperationKey");
  }

  private String workspaceAsyncOperationWorkspaceKey() {
    String configuredWorkspaceKey = config.workspaceAsyncOperationWorkspaceKey();
    return isBlank(configuredWorkspaceKey) ? workspaceKey : configuredWorkspaceKey;
  }

  private String workspaceAsyncOperationKey() {
    String configuredAsyncOperationKey = config.workspaceAsyncOperationKey();
    return isBlank(configuredAsyncOperationKey)
        ? workspaceCreateAsyncOperationKey
        : configuredAsyncOperationKey;
  }

  private void closeWorkspaceClient() {
    if (workspaceClient != null) {
      workspaceClient.close();
    }
  }

  private void closeGitFixture() {
    if (gitFixture != null) {
      gitFixture.close();
      gitFixture = null;
    }
  }

  private static void assertSuccessful(int statusCode) {
    SdkTestSupport.assertSuccessful(statusCode);
  }

  private static void sleep(Duration duration) {
    try {
      Thread.sleep(duration.toMillis());
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new RuntimeException("Interrupted while waiting for workspace state.", e);
    }
  }

  private static String requestId(String prefix) {
    String boundedPrefix = prefix.length() > 24 ? prefix.substring(0, 24) : prefix;
    return boundedPrefix + "-" + UUID.randomUUID();
  }

  private static boolean isBlank(String value) {
    return value == null || value.isBlank();
  }

  private static void requireNonBlank(String value, String key) {
    if (isBlank(value)) {
      throw new SkipException("Set " + key + " to run this SDK test.");
    }
  }
}
