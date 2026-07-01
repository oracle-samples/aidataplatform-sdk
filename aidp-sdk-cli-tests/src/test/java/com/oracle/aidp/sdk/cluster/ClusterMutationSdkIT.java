package com.oracle.aidp.sdk.cluster;

import static com.oracle.aidp.sdk.support.SdkTestSupport.assertSuccessful;
import static com.oracle.aidp.sdk.support.SdkTestSupport.isBlank;
import static com.oracle.aidp.sdk.support.SdkTestSupport.requestId;
import static com.oracle.aidp.sdk.support.SdkTestSupport.requireValue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import com.oracle.aidp.sdk.client.SdkClients;
import com.oracle.aidp.sdk.config.SdkTestConfig;
import com.oracle.aidp.sdk.support.SdkTestResources;
import com.oracle.aidataplatform.dp.AsyncOperationsClient;
import com.oracle.aidataplatform.dp.ClusterClient;
import com.oracle.aidataplatform.dp.WorkspaceObjectClient;
import com.oracle.aidataplatform.dp.model.AssignClusterPermissionDetails;
import com.oracle.aidataplatform.dp.model.AsyncOperationSummary;
import com.oracle.aidataplatform.dp.model.Cluster;
import com.oracle.aidataplatform.dp.model.ClusterLibraryDetails;
import com.oracle.aidataplatform.dp.model.ClusterLibrarySummary;
import com.oracle.aidataplatform.dp.model.ClusterPrivilege;
import com.oracle.aidataplatform.dp.model.CreateSparkClusterDetails;
import com.oracle.aidataplatform.dp.model.DriverConfig;
import com.oracle.aidataplatform.dp.model.GranteeType;
import com.oracle.aidataplatform.dp.model.InstallClusterLibraryDetails;
import com.oracle.aidataplatform.dp.model.ManageClusterPermissionDetails;
import com.oracle.aidataplatform.dp.model.PatchClusterLibraryDetails;
import com.oracle.aidataplatform.dp.model.PermissionAssignees;
import com.oracle.aidataplatform.dp.model.RestartClusterDetails;
import com.oracle.aidataplatform.dp.model.RevokeClusterPermissionDetails;
import com.oracle.aidataplatform.dp.model.ShapeConfig;
import com.oracle.aidataplatform.dp.model.SparkRuntimeConfig;
import com.oracle.aidataplatform.dp.model.StartClusterDetails;
import com.oracle.aidataplatform.dp.model.StopClusterDetails;
import com.oracle.aidataplatform.dp.model.UninstallClusterLibraryDetails;
import com.oracle.aidataplatform.dp.model.UpdateSparkClusterDetails;
import com.oracle.aidataplatform.dp.model.WorkspaceFileClusterLibrarySummary;
import com.oracle.aidataplatform.dp.model.WorkerConfig;
import com.oracle.aidataplatform.dp.requests.CreateClusterRequest;
import com.oracle.aidataplatform.dp.requests.CreateWorkspaceObjectRequest;
import com.oracle.aidataplatform.dp.requests.DeleteClusterRequest;
import com.oracle.aidataplatform.dp.requests.GetClusterRequest;
import com.oracle.aidataplatform.dp.requests.ListAsyncOperationsRequest;
import com.oracle.aidataplatform.dp.requests.ListClusterLibrariesRequest;
import com.oracle.aidataplatform.dp.requests.ListClusterPermissionsRequest;
import com.oracle.aidataplatform.dp.requests.ListClustersRequest;
import com.oracle.aidataplatform.dp.requests.ManageClusterPermissionRequest;
import com.oracle.aidataplatform.dp.requests.PatchClusterLibraryRequest;
import com.oracle.aidataplatform.dp.requests.RestartClusterRequest;
import com.oracle.aidataplatform.dp.requests.StartClusterRequest;
import com.oracle.aidataplatform.dp.requests.StopClusterRequest;
import com.oracle.aidataplatform.dp.requests.UpdateClusterRequest;
import com.oracle.aidataplatform.dp.responses.CreateClusterResponse;
import com.oracle.aidataplatform.dp.responses.CreateWorkspaceObjectResponse;
import com.oracle.aidataplatform.dp.responses.DeleteClusterResponse;
import com.oracle.aidataplatform.dp.responses.GetClusterResponse;
import com.oracle.aidataplatform.dp.responses.ListAsyncOperationsResponse;
import com.oracle.aidataplatform.dp.responses.ListClusterLibrariesResponse;
import com.oracle.aidataplatform.dp.responses.ListClusterPermissionsResponse;
import com.oracle.aidataplatform.dp.responses.ListClustersResponse;
import com.oracle.aidataplatform.dp.responses.ManageClusterPermissionResponse;
import com.oracle.aidataplatform.dp.responses.PatchClusterLibraryResponse;
import com.oracle.aidataplatform.dp.responses.RestartClusterResponse;
import com.oracle.aidataplatform.dp.responses.StartClusterResponse;
import com.oracle.aidataplatform.dp.responses.StopClusterResponse;
import com.oracle.aidataplatform.dp.responses.UpdateClusterResponse;
import com.oracle.bmc.model.BmcException;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClusterMutationSdkIT {
  private static final String CLUSTER_NAME_PREFIX = "IT_Cluster_SDK_";
  private static final String UPDATED_CLUSTER_NAME_PREFIX = "Updated_Cluster_SDK_";
  private static final String CLUSTER_ASYNC_RESOURCE_TYPE = "CLUSTER";
  private static final String ASYNC_OPERATION_IN_PROGRESS = "IN_PROGRESS";

  private SdkTestConfig config;
  private ClusterClient clusterClient;
  private AsyncOperationsClient asyncOperationsClient;
  private WorkspaceObjectClient workspaceObjectClient;
  private String workspaceKey;
  private String clusterKey;
  private String clusterLibraryPath;
  private int permissionCount;

  @BeforeClass(
      alwaysRun = true,
      groups = {"sdk_tests", "sdk_cluster", "cluster", "rel_validation"})
  public void setUp() throws Exception {
    config = SdkTestConfig.load();
    if (!config.runClusterMutationTests()) {
      throw new SkipException("Set sdkRunClusterMutationTests=true to run cluster mutation tests.");
    }
    workspaceKey = SdkTestResources.ensureSharedWorkspace(config);
    clusterClient = SdkClients.clusterClient(config);
    asyncOperationsClient = SdkClients.asyncOperationsClient(config);
    workspaceObjectClient = SdkClients.workspaceObjectClient(config);
  }

  @Test(groups = {"sdk_tests", "sdk_cluster", "cluster", "rel_validation"}, priority = 0)
  public void createClusterTest() {
    String displayName = CLUSTER_NAME_PREFIX + System.currentTimeMillis();

    CreateClusterResponse response =
        clusterClient.createCluster(
            CreateClusterRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .createClusterDetails(createClusterDetails(displayName))
                .opcRetryToken(requestId("create-cluster-retry"))
                .opcRequestId(requestId("create-cluster"))
                .shouldUpdateRecent(false)
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getCluster(), "Created cluster should be present.");
    assertNotNull(response.getCluster().getKey(), "Created cluster key should be present.");
    clusterKey = response.getCluster().getKey();
    assertEquals(response.getCluster().getDisplayName(), displayName);

    waitForClusterLifecycleState(clusterKey, Cluster.State.Active);
    waitForNoInProgressClusterOperation(clusterKey);
  }

  @Test(
      groups = {"sdk_tests", "sdk_cluster", "cluster", "rel_validation"},
      dependsOnMethods = {"createClusterTest"},
      priority = 1)
  public void getClusterTest() {
    Cluster cluster = getCluster(clusterKey).getCluster();
    assertNotNull(cluster, "Fetched cluster should be present.");
    assertEquals(cluster.getKey(), clusterKey);
    assertEquals(cluster.getState(), Cluster.State.Active);
  }

  @Test(
      groups = {"sdk_tests", "sdk_cluster", "cluster", "rel_validation"},
      dependsOnMethods = {"createClusterTest"},
      priority = 2)
  public void listClustersTest() {
    ListClustersResponse response =
        clusterClient.listClusters(
            ListClustersRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .limit(10)
                .opcRequestId(requestId("list-clusters-mutation"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getClusterCollection());
    assertNotNull(response.getClusterCollection().getItems());
  }

  @Test(
      groups = {"sdk_tests", "sdk_cluster", "cluster", "rel_validation"},
      dependsOnMethods = {"createClusterTest"},
      priority = 3)
  public void updateClusterTest() {
    String updatedDisplayName = UPDATED_CLUSTER_NAME_PREFIX + System.currentTimeMillis();
    String updatedDescription = "Updated by ClusterMutationSdkIT";

    UpdateClusterResponse response =
        clusterClient.updateCluster(
            UpdateClusterRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .clusterKey(clusterKey)
                .updateClusterDetails(
                    UpdateSparkClusterDetails.builder()
                        .displayName(updatedDisplayName)
                        .description(updatedDescription)
                        .build())
                .opcRequestId(requestId("update-cluster"))
                .shouldUpdateRecent(false)
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getCluster(), "Updated cluster should be present.");
    assertEquals(response.getCluster().getDisplayName(), updatedDisplayName);
    waitForClusterLifecycleState(clusterKey, Cluster.State.Active);
    waitForNoInProgressClusterOperation(clusterKey);

    Cluster cluster = getCluster(clusterKey).getCluster();
    assertEquals(cluster.getDescription(), updatedDescription);
  }

  @Test(
      groups = {"sdk_tests", "sdk_cluster", "cluster", "rel_validation"},
      dependsOnMethods = {"createClusterTest"},
      priority = 4)
  public void listClusterPermissionsTest() {
    ListClusterPermissionsResponse response =
        listClusterPermissions(clusterKey, "list-created-cluster-permissions");
    permissionCount = response.getClusterPermissionCollection().getItems().size();
  }

  @Test(
      groups = {"sdk_tests", "sdk_cluster", "cluster", "rel_validation"},
      dependsOnMethods = {"listClusterPermissionsTest"},
      priority = 5)
  public void manageClusterPermissionTest() {
    requireClusterPermissionMutationConfig();

    ManageClusterPermissionResponse response =
        clusterClient.manageClusterPermission(
            ManageClusterPermissionRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .clusterKey(clusterKey)
                .manageClusterPermissionDetails(assignClusterPermissionDetails())
                .opcRetryToken(requestId("manage-cluster-permission-retry"))
                .opcRequestId(requestId("manage-cluster-permission"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    ListClusterPermissionsResponse permissions =
        listClusterPermissions(clusterKey, "list-cluster-permissions-after-assign");
    assertNotNull(permissions.getClusterPermissionCollection().getItems());
  }

  @Test(
      groups = {"sdk_tests", "sdk_cluster", "cluster", "rel_validation"},
      dependsOnMethods = {"manageClusterPermissionTest"},
      priority = 6)
  public void revokeClusterPermissionTest() {
    ManageClusterPermissionResponse response =
        clusterClient.manageClusterPermission(
            ManageClusterPermissionRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .clusterKey(clusterKey)
                .manageClusterPermissionDetails(revokeClusterPermissionDetails())
                .opcRetryToken(requestId("revoke-cluster-permission-retry"))
                .opcRequestId(requestId("revoke-cluster-permission"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    ListClusterPermissionsResponse permissions =
        listClusterPermissions(clusterKey, "list-cluster-permissions-after-revoke");
    assertNotNull(permissions.getClusterPermissionCollection().getItems());
  }

  @Test(
      groups = {"sdk_tests", "sdk_cluster", "cluster", "rel_validation"},
      dependsOnMethods = {"createClusterTest"},
      priority = 7)
  public void listClusterLibrariesTest() {
    ListClusterLibrariesResponse response =
        listClusterLibraries(clusterKey, "list-created-cluster-libraries");

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getClusterLibraryCollection());
    assertNotNull(response.getClusterLibraryCollection().getItems());
  }

  @Test(
      groups = {"sdk_tests", "sdk_cluster", "cluster", "rel_validation"},
      dependsOnMethods = {"createClusterTest"},
      priority = 8)
  public void patchClusterLibraryTest() {
    requireClusterLibraryPatchConfig();
    clusterLibraryPath = clusterLibraryPath();
    uploadClusterLibraryFile(clusterLibraryPath);
    sleep(Duration.ofSeconds(60));

    PatchClusterLibraryResponse installResponse =
        clusterClient.patchClusterLibrary(
            PatchClusterLibraryRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .clusterKey(clusterKey)
                .patchClusterLibraryDetails(
                    PatchClusterLibraryDetails.builder()
                        .items(List.of(installClusterLibraryDetails()))
                        .build())
                .opcRequestId(requestId("install-cluster-library"))
                .build());

    assertSuccessful(installResponse.get__httpStatusCode__());
    assertNotNull(installResponse.getClusterLibraryCollection());
    waitForWorkspaceFileLibraryStatus(clusterLibraryPath, ClusterLibrarySummary.Status.Installed);

    PatchClusterLibraryResponse uninstallResponse =
        clusterClient.patchClusterLibrary(
            PatchClusterLibraryRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .clusterKey(clusterKey)
                .patchClusterLibraryDetails(
                    PatchClusterLibraryDetails.builder()
                        .items(List.of(uninstallClusterLibraryDetails()))
                        .build())
                .opcRequestId(requestId("uninstall-cluster-library"))
                .build());

    assertSuccessful(uninstallResponse.get__httpStatusCode__());
    assertNotNull(uninstallResponse.getClusterLibraryCollection());
    waitForWorkspaceFileLibraryUninstalled(clusterLibraryPath);
    waitForNoInProgressClusterOperation(clusterKey);
  }

  @Test(
      groups = {"sdk_tests", "sdk_cluster", "cluster", "rel_validation"},
      dependsOnMethods = {"createClusterTest"},
      priority = 9)
  public void stopClusterTest() {
    requireClusterLifecycleActionConfig();

    StopClusterResponse response =
        runWithClusterOperationRetry(
            "stop cluster",
            clusterKey,
            () ->
                clusterClient.stopCluster(
                    StopClusterRequest.builder()
                        .aiDataPlatformId(config.dataHubId())
                        .workspaceKey(workspaceKey)
                        .clusterKey(clusterKey)
                        .stopClusterDetails(StopClusterDetails.builder().build())
                        .opcRetryToken(requestId("stop-cluster-retry"))
                        .opcRequestId(requestId("stop-cluster"))
                        .build()));

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getCluster());
    waitForClusterLifecycleState(clusterKey, Cluster.State.Stopped);
    waitForNoInProgressClusterOperation(clusterKey);
  }

  @Test(
      groups = {"sdk_tests", "sdk_cluster", "cluster", "rel_validation"},
      dependsOnMethods = {"stopClusterTest"},
      priority = 10)
  public void startClusterTest() {
    StartClusterResponse response =
        runWithClusterOperationRetry(
            "start cluster",
            clusterKey,
            () ->
                clusterClient.startCluster(
                    StartClusterRequest.builder()
                        .aiDataPlatformId(config.dataHubId())
                        .workspaceKey(workspaceKey)
                        .clusterKey(clusterKey)
                        .startClusterDetails(StartClusterDetails.builder().build())
                        .opcRetryToken(requestId("start-cluster-retry"))
                        .opcRequestId(requestId("start-cluster"))
                        .build()));

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getCluster());
    waitForClusterLifecycleState(clusterKey, Cluster.State.Active);
    waitForNoInProgressClusterOperation(clusterKey);
  }

  @Test(
      groups = {"sdk_tests", "sdk_cluster", "cluster", "rel_validation"},
      dependsOnMethods = {"startClusterTest"},
      priority = 11)
  public void restartClusterTest() {
    RestartClusterResponse response =
        runWithClusterOperationRetry(
            "restart cluster",
            clusterKey,
            () ->
                clusterClient.restartCluster(
                    RestartClusterRequest.builder()
                        .aiDataPlatformId(config.dataHubId())
                        .workspaceKey(workspaceKey)
                        .clusterKey(clusterKey)
                        .restartClusterDetails(RestartClusterDetails.builder().build())
                        .opcRetryToken(requestId("restart-cluster-retry"))
                        .opcRequestId(requestId("restart-cluster"))
                        .build()));

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getCluster());
    waitForClusterLifecycleState(clusterKey, Cluster.State.Active);
    waitForNoInProgressClusterOperation(clusterKey);
  }

  @Test(
      groups = {"sdk_tests", "sdk_cluster", "cluster", "rel_validation"},
      dependsOnMethods = {
        "getClusterTest",
        "listClustersTest",
        "updateClusterTest",
        "listClusterPermissionsTest",
        "manageClusterPermissionTest",
        "revokeClusterPermissionTest",
        "listClusterLibrariesTest",
        "patchClusterLibraryTest",
        "stopClusterTest",
        "startClusterTest",
        "restartClusterTest"
      },
      priority = 100,
      alwaysRun = true)
  public void deleteClusterTest() {
    if (isBlank(clusterKey)) {
      throw new SkipException("Cluster was not created; nothing to delete.");
    }
    waitForNoInProgressClusterOperation(clusterKey);

    DeleteClusterResponse response =
        runWithClusterOperationRetry(
            "delete cluster",
            clusterKey,
            () ->
                clusterClient.deleteCluster(
                    DeleteClusterRequest.builder()
                        .aiDataPlatformId(config.dataHubId())
                        .workspaceKey(workspaceKey)
                        .clusterKey(clusterKey)
                        .opcRequestId(requestId("delete-cluster"))
                        .build()));

    assertSuccessful(response.get__httpStatusCode__());
    waitForClusterDeleted(clusterKey);
    clusterKey = null;
  }

  @AfterClass(
      alwaysRun = true,
      groups = {"sdk_tests", "sdk_cluster", "cluster", "rel_validation"})
  public void tearDown() {
    try {
      if (clusterClient != null && !isBlank(clusterKey)) {
        runWithClusterOperationRetry(
            "delete cluster cleanup",
            clusterKey,
            () ->
                clusterClient.deleteCluster(
                    DeleteClusterRequest.builder()
                        .aiDataPlatformId(config.dataHubId())
                        .workspaceKey(workspaceKey)
                        .clusterKey(clusterKey)
                        .opcRequestId(requestId("delete-cluster-cleanup"))
                        .build()));
        waitForClusterDeleted(clusterKey);
      }
    } finally {
      if (clusterClient != null) {
        clusterClient.close();
      }
      if (workspaceObjectClient != null) {
        workspaceObjectClient.close();
      }
      if (asyncOperationsClient != null) {
        asyncOperationsClient.close();
      }
    }
  }

  private void uploadClusterLibraryFile(String path) {
    byte[] content = "pandas\n".getBytes(StandardCharsets.UTF_8);
    CreateWorkspaceObjectResponse response =
        workspaceObjectClient.createWorkspaceObject(
            CreateWorkspaceObjectRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .path(path)
                .type("FILE")
                .isOverwrite(true)
                .shouldUpdateRecent(false)
                .objectDescription("Cluster library file uploaded by ClusterMutationSdkIT")
                .createWorkspaceObjectDetails(new ByteArrayInputStream(content))
                .opcRetryToken(requestId("upload-cluster-library-retry"))
                .opcRequestId(requestId("upload-cluster-library"))
                .build());
    assertSuccessful(response.get__httpStatusCode__());
  }

  private CreateSparkClusterDetails createClusterDetails(String displayName) {
    ShapeConfig shapeConfig =
        ShapeConfig.builder()
            .ocpus(config.clusterOcpus())
            .memoryInGBs(config.clusterMemoryInGBs())
            .build();

    return CreateSparkClusterDetails.builder()
        .displayName(displayName)
        .description("Cluster created by ClusterMutationSdkIT")
        .nodeType(config.clusterNodeType())
        .driverConfig(
            DriverConfig.builder()
                .driverNodeType(config.clusterNodeType())
                .driverShape(config.clusterDriverShape())
                .driverShapeConfig(shapeConfig)
                .build())
        .workerConfig(
            WorkerConfig.builder()
                .workerShape(config.clusterWorkerShape())
                .workerShapeConfig(shapeConfig)
                .minWorkerCount(config.clusterMinWorkerCount())
                .maxWorkerCount(config.clusterMaxWorkerCount())
                .build())
        .autoTerminationMinutes(config.clusterAutoTerminationMinutes())
        .clusterRuntimeConfig(
            SparkRuntimeConfig.builder()
                .sparkVersion(config.clusterSparkVersion())
                .sparkAdvancedConfigurations(Map.of())
                .sparkEnvVariables(Map.of())
                .initScripts(List.of())
                .build())
        .build();
  }

  private GetClusterResponse getCluster(String key) {
    GetClusterResponse response =
        clusterClient.getCluster(
            GetClusterRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .clusterKey(key)
                .shouldUpdateRecent(false)
                .opcRequestId(requestId("get-cluster-mutation"))
                .build());
    assertSuccessful(response.get__httpStatusCode__());
    return response;
  }

  private ListClusterPermissionsResponse listClusterPermissions(String key, String requestIdPrefix) {
    ListClusterPermissionsResponse response =
        clusterClient.listClusterPermissions(
            ListClusterPermissionsRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .clusterKey(key)
                .limit(10)
                .opcRequestId(requestId(requestIdPrefix))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getClusterPermissionCollection());
    assertNotNull(response.getClusterPermissionCollection().getItems());
    return response;
  }

  private ListClusterLibrariesResponse listClusterLibraries(String key, String requestIdPrefix) {
    ListClusterLibrariesResponse response =
        clusterClient.listClusterLibraries(
            ListClusterLibrariesRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .clusterKey(key)
                .limit(10)
                .opcRequestId(requestId(requestIdPrefix))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getClusterLibraryCollection());
    assertNotNull(response.getClusterLibraryCollection().getItems());
    return response;
  }

  private ManageClusterPermissionDetails assignClusterPermissionDetails() {
    return ManageClusterPermissionDetails.builder()
        .assignClusterPermissionDetails(
            AssignClusterPermissionDetails.builder()
                .assignees(clusterPermissionAssignees())
                .permissions(List.of(ClusterPrivilege.Use))
                .build())
        .build();
  }

  private ManageClusterPermissionDetails revokeClusterPermissionDetails() {
    return ManageClusterPermissionDetails.builder()
        .revokeClusterPermissionDetails(
            RevokeClusterPermissionDetails.builder()
                .assignees(clusterPermissionAssignees())
                .permissions(List.of(ClusterPrivilege.Use))
                .build())
        .build();
  }

  private PermissionAssignees clusterPermissionAssignees() {
    return PermissionAssignees.builder()
        .type(GranteeType.User)
        .targets(List.of(config.clusterPermissionTarget()))
        .build();
  }

  private InstallClusterLibraryDetails installClusterLibraryDetails() {
    return InstallClusterLibraryDetails.builder()
        .type(clusterLibraryType())
        .path(clusterLibraryPath)
        .build();
  }

  private UninstallClusterLibraryDetails uninstallClusterLibraryDetails() {
    return UninstallClusterLibraryDetails.builder()
        .type(clusterLibraryType())
        .name(clusterLibraryName())
        .build();
  }

  private String clusterLibraryPath() {
    if (!isBlank(config.clusterLibraryPath())) {
      return config.clusterLibraryPath();
    }
    return "/Workspace/cluster/sdk-cluster-library-" + System.currentTimeMillis() + ".txt";
  }

  private String clusterLibraryName() {
    return isBlank(config.clusterLibraryName()) ? clusterLibraryPath : config.clusterLibraryName();
  }

  private ClusterLibraryDetails.Type clusterLibraryType() {
    String type = config.clusterLibraryType();
    try {
      return ClusterLibraryDetails.Type.create(type);
    } catch (IllegalArgumentException e) {
      return ClusterLibraryDetails.Type.valueOf(type);
    }
  }

  private void requireClusterPermissionMutationConfig() {
    if (!config.runClusterPermissionMutationTests()) {
      throw new SkipException(
          "Set sdkRunClusterPermissionMutationTests=true to run cluster permission mutation tests.");
    }
    if (isBlank(config.clusterPermissionTarget())) {
      throw new SkipException(
          "Set sdkClusterPermissionTarget, sdkWorkspacePermissionTarget, subjectId, or userOcid to run cluster permission mutation tests.");
    }
  }

  private void requireClusterLibraryPatchConfig() {
    if (!config.runClusterLibraryPatchTests()) {
      throw new SkipException("Set sdkRunClusterLibraryPatchTests=true to run cluster library patch tests.");
    }
  }

  private void requireClusterLifecycleActionConfig() {
    if (!config.runClusterLifecycleActionTests()) {
      throw new SkipException("Set sdkRunClusterLifecycleActionTests=true to run cluster lifecycle action tests.");
    }
  }

  private void waitForClusterLifecycleState(String key, Cluster.State expectedState) {
    long deadline = System.nanoTime() + config.clusterReadyTimeout().toNanos();
    AssertionError lastError = null;
    while (System.nanoTime() < deadline) {
      try {
        Cluster cluster = getCluster(key).getCluster();
        if (cluster != null && expectedState == cluster.getState()) {
          return;
        }
        if (cluster != null && Cluster.State.Failed == cluster.getState()) {
          throw new AssertionError("Cluster " + key + " entered FAILED state.");
        }
      } catch (AssertionError e) {
        lastError = e;
      } catch (BmcException e) {
        if (!isRetryableTransportFailure(e)) {
          throw e;
        }
        lastError = new AssertionError("Retryable failure while polling cluster " + key, e);
      }
      sleep(config.pollInterval());
    }
    if (lastError != null) {
      throw lastError;
    }
    throw new AssertionError("Cluster " + key + " did not reach state " + expectedState);
  }

  private void waitForClusterDeleted(String key) {
    long deadline = System.nanoTime() + config.clusterDeleteTimeout().toNanos();
    while (System.nanoTime() < deadline) {
      try {
        Cluster cluster = getCluster(key).getCluster();
        if (cluster != null && Cluster.State.Deleted == cluster.getState()) {
          return;
        }
      } catch (BmcException e) {
        if (e.getStatusCode() == 404) {
          return;
        }
        if (!isRetryableTransportFailure(e)) {
          throw e;
        }
      }
      sleep(config.pollInterval());
    }
    throw new AssertionError("Cluster " + key + " was not deleted within configured timeout.");
  }

  private void waitForNoInProgressClusterOperation(String key) {
    long deadline = System.nanoTime() + config.clusterReadyTimeout().toNanos();
    List<AsyncOperationSummary> inProgressOperations = List.of();
    while (System.nanoTime() < deadline) {
      try {
        inProgressOperations = listInProgressClusterOperations(key);
        if (inProgressOperations.isEmpty()) {
          return;
        }
      } catch (BmcException e) {
        if (!isRetryableTransportFailure(e)) {
          throw e;
        }
      }
      sleep(config.pollInterval());
    }
    throw new AssertionError(
        "Cluster "
            + key
            + " still has in-progress async operations: "
            + inProgressOperations);
  }

  private <T> T runWithClusterOperationRetry(String operation, String key, Supplier<T> action) {
    long deadline = System.nanoTime() + config.clusterReadyTimeout().toNanos();
    BmcException lastConflict = null;
    while (System.nanoTime() < deadline) {
      try {
        return action.get();
      } catch (BmcException e) {
        if (!isOngoingClusterOperationConflict(e) && !isRetryableTransportFailure(e)) {
          throw e;
        }
        lastConflict = e;
        waitForNoInProgressClusterOperation(key);
        sleep(config.pollInterval());
      }
    }
    throw new AssertionError(
        "Timed out waiting to " + operation + " after ongoing cluster operation conflicts.",
        lastConflict);
  }

  private static boolean isOngoingClusterOperationConflict(BmcException e) {
    return e.getStatusCode() == 409
        && e.getMessage() != null
        && e.getMessage().contains("ongoing operation");
  }

  private static boolean isRetryableTransportFailure(BmcException e) {
    return e.getStatusCode() == -1
        && e.getMessage() != null
        && (e.getMessage().contains("UnknownHostException")
            || e.getMessage().contains("ProcessingException"));
  }

  private List<AsyncOperationSummary> listInProgressClusterOperations(String key) {
    ListAsyncOperationsResponse response =
        asyncOperationsClient.listAsyncOperations(
            ListAsyncOperationsRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .resourceType(CLUSTER_ASYNC_RESOURCE_TYPE)
                .resourceName(workspaceKey + "." + key)
                .matchResourceName(true)
                .status(ASYNC_OPERATION_IN_PROGRESS)
                .shouldFilterByCallingPrincipal(true)
                .limit(20)
                .opcRequestId(requestId("list-cluster-async-ops"))
                .build());
    assertSuccessful(response.get__httpStatusCode__());
    if (response.getAsyncOperationCollection() == null
        || response.getAsyncOperationCollection().getItems() == null) {
      return List.of();
    }
    return response.getAsyncOperationCollection().getItems();
  }

  private void waitForWorkspaceFileLibraryStatus(
      String path, ClusterLibrarySummary.Status expectedStatus) {
    long deadline = System.nanoTime() + config.clusterReadyTimeout().toNanos();
    while (System.nanoTime() < deadline) {
      try {
        Optional<WorkspaceFileClusterLibrarySummary> library = findWorkspaceFileLibrary(path);
        if (library.isPresent()) {
          ClusterLibrarySummary.Status status = library.get().getStatus();
          if (expectedStatus == status) {
            return;
          }
          if (ClusterLibrarySummary.Status.Failed == status) {
            throw new AssertionError(
                "Cluster library " + path + " entered FAILED state: " + library.get().getStateMessage());
          }
        }
      } catch (BmcException e) {
        if (!isRetryableTransportFailure(e)) {
          throw e;
        }
      }
      sleep(config.pollInterval());
    }
    throw new AssertionError("Cluster library " + path + " did not reach state " + expectedStatus);
  }

  private void waitForWorkspaceFileLibraryUninstalled(String path) {
    long deadline = System.nanoTime() + config.clusterReadyTimeout().toNanos();
    while (System.nanoTime() < deadline) {
      try {
        Optional<WorkspaceFileClusterLibrarySummary> library = findWorkspaceFileLibrary(path);
        if (library.isEmpty() || ClusterLibrarySummary.Status.Deleted == library.get().getStatus()) {
          return;
        }
        if (ClusterLibrarySummary.Status.Failed == library.get().getStatus()) {
          throw new AssertionError(
              "Cluster library " + path + " entered FAILED state: " + library.get().getStateMessage());
        }
      } catch (BmcException e) {
        if (!isRetryableTransportFailure(e)) {
          throw e;
        }
      }
      sleep(config.pollInterval());
    }
    throw new AssertionError("Cluster library " + path + " was not uninstalled within timeout.");
  }

  private Optional<WorkspaceFileClusterLibrarySummary> findWorkspaceFileLibrary(String path) {
    return listClusterLibraries(clusterKey, "list-cluster-libraries-status")
        .getClusterLibraryCollection()
        .getItems()
        .stream()
        .filter(WorkspaceFileClusterLibrarySummary.class::isInstance)
        .map(WorkspaceFileClusterLibrarySummary.class::cast)
        .filter(library -> path.equals(library.getPath()) || path.equals(library.getName()))
        .findFirst();
  }

  private static void sleep(Duration duration) {
    try {
      Thread.sleep(duration.toMillis());
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new RuntimeException("Interrupted while waiting for cluster state.", e);
    }
  }
}
