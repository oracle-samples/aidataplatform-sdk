package com.oracle.aidp.sdk.support;

import static com.oracle.aidp.sdk.support.SdkTestSupport.assertSuccessful;
import static com.oracle.aidp.sdk.support.SdkTestSupport.isBlank;
import static com.oracle.aidp.sdk.support.SdkTestSupport.requestId;

import com.oracle.aidp.sdk.client.SdkClients;
import com.oracle.aidp.sdk.config.SdkTestConfig;
import com.oracle.aidataplatform.dp.AsyncOperationsClient;
import com.oracle.aidataplatform.dp.ClusterClient;
import com.oracle.aidataplatform.dp.WorkspaceClient;
import com.oracle.aidataplatform.dp.model.AsyncOperationSummary;
import com.oracle.aidataplatform.dp.model.Cluster;
import com.oracle.aidataplatform.dp.model.ClusterSummary;
import com.oracle.aidataplatform.dp.model.CreateSparkClusterDetails;
import com.oracle.aidataplatform.dp.model.CreateWorkspaceDetails;
import com.oracle.aidataplatform.dp.model.DriverConfig;
import com.oracle.aidataplatform.dp.model.ShapeConfig;
import com.oracle.aidataplatform.dp.model.SortOrder;
import com.oracle.aidataplatform.dp.model.SparkRuntimeConfig;
import com.oracle.aidataplatform.dp.model.StartClusterDetails;
import com.oracle.aidataplatform.dp.model.WorkerConfig;
import com.oracle.aidataplatform.dp.model.Workspace;
import com.oracle.aidataplatform.dp.model.WorkspaceSummary;
import com.oracle.aidataplatform.dp.requests.CreateClusterRequest;
import com.oracle.aidataplatform.dp.requests.CreateWorkspaceRequest;
import com.oracle.aidataplatform.dp.requests.GetClusterRequest;
import com.oracle.aidataplatform.dp.requests.GetWorkspaceRequest;
import com.oracle.aidataplatform.dp.requests.ListAsyncOperationsRequest;
import com.oracle.aidataplatform.dp.requests.ListClustersRequest;
import com.oracle.aidataplatform.dp.requests.ListWorkspacesRequest;
import com.oracle.aidataplatform.dp.requests.StartClusterRequest;
import com.oracle.aidataplatform.dp.responses.CreateClusterResponse;
import com.oracle.aidataplatform.dp.responses.CreateWorkspaceResponse;
import com.oracle.aidataplatform.dp.responses.GetClusterResponse;
import com.oracle.aidataplatform.dp.responses.GetWorkspaceResponse;
import com.oracle.aidataplatform.dp.responses.ListAsyncOperationsResponse;
import com.oracle.aidataplatform.dp.responses.ListClustersResponse;
import com.oracle.aidataplatform.dp.responses.ListWorkspacesResponse;
import com.oracle.aidataplatform.dp.responses.StartClusterResponse;
import com.oracle.bmc.model.BmcException;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public final class SdkTestResources {
  private static final String CLUSTER_ASYNC_RESOURCE_TYPE = "CLUSTER";
  private static final String ASYNC_OPERATION_IN_PROGRESS = "IN_PROGRESS";
  private static final Object SHARED_WORKSPACE_LOCK = new Object();
  private static final Map<String, String> SHARED_WORKSPACE_KEYS = new ConcurrentHashMap<>();

  private SdkTestResources() {}

  public static String ensureSharedWorkspace(SdkTestConfig config) throws Exception {
    if (!isBlank(config.workspaceKey())) {
      return config.workspaceKey();
    }

    WorkspaceClient workspaceClient = SdkClients.workspaceClient(config);
    try {
      return ensureSharedWorkspace(config, workspaceClient);
    } finally {
      workspaceClient.close();
    }
  }

  public static String ensureSharedWorkspace(
      SdkTestConfig config, WorkspaceClient workspaceClient) {
    String cacheKey = sharedWorkspaceCacheKey(config);
    synchronized (SHARED_WORKSPACE_LOCK) {
      String cachedWorkspaceKey = SHARED_WORKSPACE_KEYS.get(cacheKey);
      if (!isBlank(cachedWorkspaceKey)) {
        return waitForWorkspaceLifecycleState(
            config, workspaceClient, cachedWorkspaceKey, Workspace.LifecycleState.Active);
      }

      Optional<WorkspaceSummary> existingWorkspace = findSharedWorkspace(config, workspaceClient);
      if (existingWorkspace.isPresent()) {
        return cacheSharedWorkspace(
            cacheKey,
            waitForWorkspaceLifecycleState(
                config,
                workspaceClient,
                existingWorkspace.get().getKey(),
                Workspace.LifecycleState.Active));
      }

      try {
        CreateWorkspaceResponse response =
            workspaceClient.createWorkspace(
                CreateWorkspaceRequest.builder()
                    .aiDataPlatformId(config.dataHubId())
                    .createWorkspaceDetails(
                        CreateWorkspaceDetails.builder()
                            .displayName(config.sharedWorkspaceName())
                            .description("Shared workspace for SDK validation tests")
                            .defaultCatalogKey("default")
                            .build())
                    .opcRetryToken(requestId("shared-workspace-retry"))
                    .opcRequestId(requestId("shared-workspace"))
                    .build());

        assertSuccessful(response.get__httpStatusCode__());
        String workspaceKey = response.getWorkspace().getKey();
        return cacheSharedWorkspace(
            cacheKey,
            waitForWorkspaceLifecycleState(
                config, workspaceClient, workspaceKey, Workspace.LifecycleState.Active));
      } catch (BmcException e) {
        if (e.getStatusCode() != 409) {
          throw e;
        }
        Optional<WorkspaceSummary> conflictingWorkspace =
            findSharedWorkspace(config, workspaceClient);
        if (conflictingWorkspace.isEmpty()) {
          throw e;
        }
        return cacheSharedWorkspace(
            cacheKey,
            waitForWorkspaceLifecycleState(
                config,
                workspaceClient,
                conflictingWorkspace.get().getKey(),
                Workspace.LifecycleState.Active));
      }
    }
  }

  public static String ensureActiveSharedCluster(
      SdkTestConfig config, String workspaceKey, ClusterClient clusterClient)
      throws Exception {
    AsyncOperationsClient asyncOperationsClient = SdkClients.asyncOperationsClient(config);
    try {
      return ensureActiveSharedCluster(config, workspaceKey, clusterClient, asyncOperationsClient);
    } finally {
      asyncOperationsClient.close();
    }
  }

  public static String ensureActiveSharedCluster(
      SdkTestConfig config,
      String workspaceKey,
      ClusterClient clusterClient,
      AsyncOperationsClient asyncOperationsClient) {
    String clusterKey = config.clusterKey();
    if (isBlank(clusterKey)) {
      Optional<ClusterSummary> existingCluster =
          findSharedCluster(config, workspaceKey, clusterClient);
      clusterKey =
          existingCluster
              .map(ClusterSummary::getKey)
              .orElseGet(() -> createSharedCluster(config, workspaceKey, clusterClient));
    }

    ensureClusterActive(config, workspaceKey, clusterKey, clusterClient, asyncOperationsClient);
    return clusterKey;
  }

  private static Optional<WorkspaceSummary> findSharedWorkspace(
      SdkTestConfig config, WorkspaceClient workspaceClient) {
    ListWorkspacesResponse response =
        workspaceClient.listWorkspaces(
            ListWorkspacesRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .displayName(config.sharedWorkspaceName())
                .limit(50)
                .sortOrder(SortOrder.Asc)
                .sortBy(ListWorkspacesRequest.SortBy.DisplayName)
                .opcRequestId(requestId("find-shared-workspace"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    if (response.getWorkspaceCollection() == null
        || response.getWorkspaceCollection().getItems() == null) {
      return Optional.empty();
    }
    return response.getWorkspaceCollection().getItems().stream()
        .filter(workspace -> config.sharedWorkspaceName().equals(workspace.getDisplayName()))
        .filter(workspace -> Workspace.LifecycleState.Deleting != workspace.getLifecycleState())
        .filter(workspace -> Workspace.LifecycleState.Deleted != workspace.getLifecycleState())
        .findFirst();
  }

  private static String sharedWorkspaceCacheKey(SdkTestConfig config) {
    return config.dataHubId() + "|" + config.sharedWorkspaceName();
  }

  private static String cacheSharedWorkspace(String cacheKey, String workspaceKey) {
    SHARED_WORKSPACE_KEYS.put(cacheKey, workspaceKey);
    return workspaceKey;
  }

  private static String waitForWorkspaceLifecycleState(
      SdkTestConfig config,
      WorkspaceClient workspaceClient,
      String workspaceKey,
      Workspace.LifecycleState expectedState) {
    long deadline = System.nanoTime() + config.workspaceReadyTimeout().toNanos();
    AssertionError lastError = null;
    while (System.nanoTime() < deadline) {
      try {
        Workspace workspace = getWorkspace(config, workspaceClient, workspaceKey).getWorkspace();
        if (workspace != null && expectedState == workspace.getLifecycleState()) {
          return workspaceKey;
        }
        if (workspace != null && Workspace.LifecycleState.Failed == workspace.getLifecycleState()) {
          throw new AssertionError("Workspace " + workspaceKey + " entered FAILED state.");
        }
      } catch (AssertionError e) {
        lastError = e;
      }
      sleep(config.pollInterval(), "workspace state");
    }
    if (lastError != null) {
      throw lastError;
    }
    throw new AssertionError("Workspace " + workspaceKey + " did not reach state " + expectedState);
  }

  private static GetWorkspaceResponse getWorkspace(
      SdkTestConfig config, WorkspaceClient workspaceClient, String workspaceKey) {
    GetWorkspaceResponse response =
        workspaceClient.getWorkspace(
            GetWorkspaceRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .opcRequestId(requestId("get-shared-workspace"))
                .build());
    assertSuccessful(response.get__httpStatusCode__());
    return response;
  }

  private static Optional<ClusterSummary> findSharedCluster(
      SdkTestConfig config, String workspaceKey, ClusterClient clusterClient) {
    ListClustersResponse response =
        clusterClient.listClusters(
            ListClustersRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .displayName(config.sharedClusterName())
                .limit(50)
                .sortBy(ListClustersRequest.SortBy.DisplayName)
                .sortOrder(SortOrder.Asc)
                .opcRequestId(requestId("find-shared-cluster"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    if (response.getClusterCollection() == null
        || response.getClusterCollection().getItems() == null) {
      return Optional.empty();
    }
    return response.getClusterCollection().getItems().stream()
        .filter(cluster -> config.sharedClusterName().equals(cluster.getDisplayName()))
        .filter(cluster -> Cluster.State.Deleting != cluster.getState())
        .filter(cluster -> Cluster.State.Deleted != cluster.getState())
        .filter(cluster -> Cluster.State.Failed != cluster.getState())
        .sorted(Comparator.comparingInt(SdkTestResources::clusterStateRank))
        .findFirst();
  }

  private static int clusterStateRank(ClusterSummary cluster) {
    if (Cluster.State.Active == cluster.getState()) {
      return 0;
    }
    if (Cluster.State.Stopped == cluster.getState()) {
      return 1;
    }
    if (Cluster.State.Stopping == cluster.getState()) {
      return 3;
    }
    return 2;
  }

  private static String createSharedCluster(
      SdkTestConfig config, String workspaceKey, ClusterClient clusterClient) {
    CreateClusterResponse response =
        clusterClient.createCluster(
            CreateClusterRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .createClusterDetails(createSharedClusterDetails(config))
                .opcRetryToken(requestId("shared-cluster-retry"))
                .opcRequestId(requestId("shared-cluster"))
                .shouldUpdateRecent(false)
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    return response.getCluster().getKey();
  }

  private static CreateSparkClusterDetails createSharedClusterDetails(SdkTestConfig config) {
    ShapeConfig shapeConfig =
        ShapeConfig.builder()
            .ocpus(config.clusterOcpus())
            .memoryInGBs(config.clusterMemoryInGBs())
            .build();

    return CreateSparkClusterDetails.builder()
        .displayName(config.sharedClusterName())
        .description("Shared cluster for SDK validation tests")
        .driverConfig(
            DriverConfig.builder()
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

  private static void ensureClusterActive(
      SdkTestConfig config,
      String workspaceKey,
      String clusterKey,
      ClusterClient clusterClient,
      AsyncOperationsClient asyncOperationsClient) {
    Cluster cluster = getCluster(config, workspaceKey, clusterKey, clusterClient).getCluster();
    if (cluster == null) {
      throw new AssertionError("Cluster " + clusterKey + " was not returned by getCluster.");
    }
    if (Cluster.State.Active == cluster.getState()) {
      waitForNoInProgressClusterOperation(
          config, workspaceKey, clusterKey, asyncOperationsClient);
      return;
    }
    if (Cluster.State.Stopped == cluster.getState()) {
      startCluster(config, workspaceKey, clusterKey, clusterClient, asyncOperationsClient);
      return;
    }
    if (Cluster.State.Stopping == cluster.getState()) {
      waitForClusterLifecycleState(config, workspaceKey, clusterKey, Cluster.State.Stopped, clusterClient);
      startCluster(config, workspaceKey, clusterKey, clusterClient, asyncOperationsClient);
      return;
    }
    if (Cluster.State.Failed == cluster.getState()) {
      throw new AssertionError("Cluster " + clusterKey + " entered FAILED state.");
    }

    waitForClusterLifecycleState(config, workspaceKey, clusterKey, Cluster.State.Active, clusterClient);
    waitForNoInProgressClusterOperation(config, workspaceKey, clusterKey, asyncOperationsClient);
  }

  private static void startCluster(
      SdkTestConfig config,
      String workspaceKey,
      String clusterKey,
      ClusterClient clusterClient,
      AsyncOperationsClient asyncOperationsClient) {
    waitForNoInProgressClusterOperation(config, workspaceKey, clusterKey, asyncOperationsClient);
    StartClusterResponse response =
        clusterClient.startCluster(
            StartClusterRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .clusterKey(clusterKey)
                .startClusterDetails(StartClusterDetails.builder().build())
                .opcRetryToken(requestId("start-shared-cluster-retry"))
                .opcRequestId(requestId("start-shared-cluster"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    waitForClusterLifecycleState(config, workspaceKey, clusterKey, Cluster.State.Active, clusterClient);
    waitForNoInProgressClusterOperation(config, workspaceKey, clusterKey, asyncOperationsClient);
  }

  private static void waitForClusterLifecycleState(
      SdkTestConfig config,
      String workspaceKey,
      String clusterKey,
      Cluster.State expectedState,
      ClusterClient clusterClient) {
    long deadline = System.nanoTime() + config.clusterReadyTimeout().toNanos();
    AssertionError lastError = null;
    while (System.nanoTime() < deadline) {
      try {
        Cluster cluster = getCluster(config, workspaceKey, clusterKey, clusterClient).getCluster();
        if (cluster != null && expectedState == cluster.getState()) {
          return;
        }
        if (cluster != null && Cluster.State.Failed == cluster.getState()) {
          throw new AssertionError("Cluster " + clusterKey + " entered FAILED state.");
        }
      } catch (AssertionError e) {
        lastError = e;
      } catch (BmcException e) {
        if (!isRetryableTransportFailure(e)) {
          throw e;
        }
        lastError = new AssertionError("Retryable failure while polling cluster " + clusterKey, e);
      }
      sleep(config.pollInterval(), "cluster state");
    }
    if (lastError != null) {
      throw lastError;
    }
    throw new AssertionError("Cluster " + clusterKey + " did not reach state " + expectedState);
  }

  private static GetClusterResponse getCluster(
      SdkTestConfig config, String workspaceKey, String clusterKey, ClusterClient clusterClient) {
    GetClusterResponse response =
        clusterClient.getCluster(
            GetClusterRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .clusterKey(clusterKey)
                .shouldUpdateRecent(false)
                .opcRequestId(requestId("get-shared-cluster"))
                .build());
    assertSuccessful(response.get__httpStatusCode__());
    return response;
  }

  private static void waitForNoInProgressClusterOperation(
      SdkTestConfig config,
      String workspaceKey,
      String clusterKey,
      AsyncOperationsClient asyncOperationsClient) {
    long deadline = System.nanoTime() + config.clusterReadyTimeout().toNanos();
    List<AsyncOperationSummary> inProgressOperations = List.of();
    while (System.nanoTime() < deadline) {
      try {
        inProgressOperations =
            listInProgressClusterOperations(config, workspaceKey, clusterKey, asyncOperationsClient);
        if (inProgressOperations.isEmpty()) {
          return;
        }
      } catch (BmcException e) {
        if (!isRetryableTransportFailure(e)) {
          throw e;
        }
      }
      sleep(config.pollInterval(), "cluster operations");
    }
    throw new AssertionError(
        "Cluster "
            + clusterKey
            + " still has in-progress async operations: "
            + inProgressOperations);
  }

  private static List<AsyncOperationSummary> listInProgressClusterOperations(
      SdkTestConfig config,
      String workspaceKey,
      String clusterKey,
      AsyncOperationsClient asyncOperationsClient) {
    ListAsyncOperationsResponse response =
        asyncOperationsClient.listAsyncOperations(
            ListAsyncOperationsRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .resourceType(CLUSTER_ASYNC_RESOURCE_TYPE)
                .resourceName(workspaceKey + "." + clusterKey)
                .matchResourceName(true)
                .status(ASYNC_OPERATION_IN_PROGRESS)
                .shouldFilterByCallingPrincipal(true)
                .limit(20)
                .opcRequestId(requestId("shared-cluster-async-ops"))
                .build());
    assertSuccessful(response.get__httpStatusCode__());
    if (response.getAsyncOperationCollection() == null
        || response.getAsyncOperationCollection().getItems() == null) {
      return List.of();
    }
    return response.getAsyncOperationCollection().getItems();
  }

  private static boolean isRetryableTransportFailure(BmcException e) {
    return e.getStatusCode() == -1
        && e.getMessage() != null
        && (e.getMessage().contains("UnknownHostException")
            || e.getMessage().contains("ProcessingException"));
  }

  private static void sleep(Duration duration, String action) {
    try {
      Thread.sleep(duration.toMillis());
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new RuntimeException("Interrupted while waiting for " + action + ".", e);
    }
  }
}
