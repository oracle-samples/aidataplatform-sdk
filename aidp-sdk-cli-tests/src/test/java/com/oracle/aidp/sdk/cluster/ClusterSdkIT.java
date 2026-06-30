package com.oracle.aidp.sdk.cluster;

import static com.oracle.aidp.sdk.support.SdkTestSupport.assertSuccessful;
import static com.oracle.aidp.sdk.support.SdkTestSupport.requestId;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import com.oracle.aidp.sdk.client.SdkClients;
import com.oracle.aidp.sdk.config.SdkTestConfig;
import com.oracle.aidp.sdk.support.SdkTestResources;
import com.oracle.aidataplatform.dp.AsyncOperationsClient;
import com.oracle.aidataplatform.dp.ClusterClient;
import com.oracle.aidataplatform.dp.model.DownloadClusterLogsDetails;
import com.oracle.aidataplatform.dp.model.SearchClusterLogsDetails;
import com.oracle.aidataplatform.dp.model.SortOrder;
import com.oracle.aidataplatform.dp.model.SummarizeMetricsDataDetails;
import com.oracle.aidataplatform.dp.requests.DownloadClusterLogsRequest;
import com.oracle.aidataplatform.dp.requests.GetClusterRequest;
import com.oracle.aidataplatform.dp.requests.GetDefaultClusterRequest;
import com.oracle.aidataplatform.dp.requests.ListClusterLibrariesRequest;
import com.oracle.aidataplatform.dp.requests.ListClusterPermissionsRequest;
import com.oracle.aidataplatform.dp.requests.ListClustersRequest;
import com.oracle.aidataplatform.dp.requests.SearchClusterLogsRequest;
import com.oracle.aidataplatform.dp.requests.SummarizeMetricsDataRequest;
import com.oracle.aidataplatform.dp.responses.DownloadClusterLogsResponse;
import com.oracle.aidataplatform.dp.responses.GetClusterResponse;
import com.oracle.aidataplatform.dp.responses.GetDefaultClusterResponse;
import com.oracle.aidataplatform.dp.responses.ListClusterLibrariesResponse;
import com.oracle.aidataplatform.dp.responses.ListClusterPermissionsResponse;
import com.oracle.aidataplatform.dp.responses.ListClustersResponse;
import com.oracle.aidataplatform.dp.responses.SearchClusterLogsResponse;
import com.oracle.aidataplatform.dp.responses.SummarizeMetricsDataResponse;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClusterSdkIT {
  private SdkTestConfig config;
  private ClusterClient clusterClient;
  private AsyncOperationsClient asyncOperationsClient;
  private String workspaceKey;
  private String clusterKey;

  @BeforeClass(
      alwaysRun = true,
      groups = {"sdk_tests", "sdk_cluster", "cluster", "rel_validation"})
  public void setUp() throws Exception {
    config = SdkTestConfig.load();
    workspaceKey = SdkTestResources.ensureSharedWorkspace(config);
    clusterClient = SdkClients.clusterClient(config);
    asyncOperationsClient = SdkClients.asyncOperationsClient(config);
    clusterKey =
        SdkTestResources.ensureActiveSharedCluster(
            config, workspaceKey, clusterClient, asyncOperationsClient);
  }

  @Test(groups = {"sdk_tests", "sdk_cluster", "cluster", "rel_validation"})
  public void listClustersTest() {
    ListClustersResponse response =
        clusterClient.listClusters(
            ListClustersRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .limit(10)
                .sortBy(ListClustersRequest.SortBy.DisplayName)
                .sortOrder(SortOrder.Asc)
                .opcRequestId(requestId("list-clusters"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getClusterCollection());
    assertNotNull(response.getClusterCollection().getItems());
  }

  @Test(groups = {"sdk_tests", "sdk_cluster", "cluster", "rel_validation"})
  public void getDefaultClusterTest() {
    GetDefaultClusterResponse response =
        clusterClient.getDefaultCluster(
            GetDefaultClusterRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .opcRequestId(requestId("get-default-cluster"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getDefaultCluster());
    assertNotNull(response.getDefaultCluster().getKey());
  }

  @Test(
      groups = {"sdk_tests", "sdk_cluster", "cluster", "rel_validation"},
      dependsOnMethods = {"listClustersTest"})
  public void getClusterTest() {
    GetClusterResponse response =
        clusterClient.getCluster(
            GetClusterRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .clusterKey(clusterKey)
                .shouldUpdateRecent(false)
                .opcRequestId(requestId("get-cluster"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getCluster());
    assertEquals(response.getCluster().getKey(), clusterKey);
  }

  @Test(
      groups = {"sdk_tests", "sdk_cluster", "cluster", "rel_validation"},
      dependsOnMethods = {"listClustersTest"})
  public void listClusterPermissionsTest() {
    ListClusterPermissionsResponse response =
        clusterClient.listClusterPermissions(
            ListClusterPermissionsRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .clusterKey(clusterKey)
                .limit(10)
                .sortOrder(SortOrder.Asc)
                .opcRequestId(requestId("list-cluster-permissions"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getClusterPermissionCollection());
    assertNotNull(response.getClusterPermissionCollection().getItems());
  }

  @Test(
      groups = {"sdk_tests", "sdk_cluster", "cluster", "rel_validation"},
      dependsOnMethods = {"listClustersTest"})
  public void listClusterLibrariesTest() {
    ListClusterLibrariesResponse response =
        clusterClient.listClusterLibraries(
            ListClusterLibrariesRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .clusterKey(clusterKey)
                .limit(10)
                .opcRequestId(requestId("list-cluster-libraries"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getClusterLibraryCollection());
    assertNotNull(response.getClusterLibraryCollection().getItems());
  }

  @Test(
      groups = {"sdk_tests", "sdk_cluster", "cluster", "rel_validation"},
      dependsOnMethods = {"getClusterTest"})
  public void summarizeMetricsDataTest() {
    SummarizeMetricsDataResponse response =
        clusterClient.summarizeMetricsData(
            SummarizeMetricsDataRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .clusterKey(clusterKey)
                .summarizeMetricsDataDetails(
                    SummarizeMetricsDataDetails.builder()
                        .metricName(config.value("summarizeMetricsMetricName", "CPU_UTILIZATION"))
                        .aggregationType(
                            SummarizeMetricsDataDetails.AggregationType.create(
                                config.value("summarizeMetricsAggregationType", "MEAN")))
                        .interval(config.value("summarizeMetricsInterval", "1m"))
                        .resolution(config.value("summarizeMetricsResolution", "1m"))
                        .timeBegin(observabilityWindowBegin())
                        .timeEnd(observabilityWindowEnd())
                        .build())
                .opcRequestId(requestId("summarize-metrics"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getSummarizeMetricsResponse());
    assertNotNull(response.getSummarizeMetricsResponse().getResults());
  }

  @Test(
      groups = {"sdk_tests", "sdk_cluster", "cluster", "rel_validation"},
      dependsOnMethods = {"getClusterTest"})
  public void searchClusterLogsTest() {
    SearchClusterLogsResponse response =
        clusterClient.searchClusterLogs(
            SearchClusterLogsRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .clusterKey(clusterKey)
                .limit(10)
                .searchClusterLogsDetails(searchClusterLogsDetails())
                .opcRequestId(requestId("search-cluster-logs"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getClusterLogCollection());
    assertNotNull(response.getClusterLogCollection().getItems());
  }

  @Test(
      groups = {"sdk_tests", "sdk_cluster", "cluster", "rel_validation"},
      dependsOnMethods = {"getClusterTest"})
  public void downloadClusterLogsTest() {
    DownloadClusterLogsResponse response =
        clusterClient.downloadClusterLogs(
            DownloadClusterLogsRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .clusterKey(clusterKey)
                .downloadClusterLogsDetails(
                    DownloadClusterLogsDetails.builder()
                        .timeBegin(observabilityWindowBegin())
                        .timeEnd(observabilityWindowEnd())
                        .logContentTypeContains(config.value("clusterLogsContentType", "driver"))
                        .logStreamTypeContains(config.value("clusterLogsStreamType", "stdout"))
                        .logLevel(config.value("clusterLogsLevel", "INFO"))
                        .clientContext(requestId("download-cluster-logs"))
                        .build())
                .opcRequestId(requestId("download-cluster-logs"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getOpcRequestId());
  }

  @AfterClass(
      alwaysRun = true,
      groups = {"sdk_tests", "sdk_cluster", "cluster", "rel_validation"})
  public void tearDown() {
    if (clusterClient != null) {
      clusterClient.close();
    }
    if (asyncOperationsClient != null) {
      asyncOperationsClient.close();
    }
  }

  private SearchClusterLogsDetails searchClusterLogsDetails() {
    return SearchClusterLogsDetails.builder()
        .timeBegin(observabilityWindowBegin())
        .timeEnd(observabilityWindowEnd())
        .logContentTypeContains(config.value("clusterLogsContentType", "driver"))
        .logStreamTypeContains(config.value("clusterLogsStreamType", "stdout"))
        .logLevel(config.value("clusterLogsLevel", "INFO"))
        .build();
  }

  private Date observabilityWindowBegin() {
    return Date.from(
        Instant.now()
            .minus(Long.parseLong(config.value("clusterObservabilityWindowHours", "6")), ChronoUnit.HOURS));
  }

  private Date observabilityWindowEnd() {
    return Date.from(Instant.now());
  }
}
