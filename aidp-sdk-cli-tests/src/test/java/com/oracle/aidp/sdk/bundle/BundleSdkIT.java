package com.oracle.aidp.sdk.bundle;

import static com.oracle.aidp.sdk.support.SdkTestSupport.assertSuccessful;
import static com.oracle.aidp.sdk.support.SdkTestSupport.requestId;
import static com.oracle.aidp.sdk.support.SdkTestSupport.requireValue;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.fail;

import com.oracle.aidp.sdk.client.SdkClients;
import com.oracle.aidp.sdk.config.SdkTestConfig;
import com.oracle.aidp.sdk.support.SDKGitHelper;
import com.oracle.aidp.sdk.support.SdkTestResources;
import com.oracle.aidataplatform.dp.AsyncOperationsClient;
import com.oracle.aidataplatform.dp.BundleClient;
import com.oracle.aidataplatform.dp.WorkflowClient;
import com.oracle.aidataplatform.dp.model.AsyncOperation;
import com.oracle.aidataplatform.dp.model.AsyncOperationStatus;
import com.oracle.aidataplatform.dp.model.BundledResource;
import com.oracle.aidataplatform.dp.model.CreateBundleDetails;
import com.oracle.aidataplatform.dp.model.CreateJobDetails;
import com.oracle.aidataplatform.dp.model.DeployBundleDetails;
import com.oracle.aidataplatform.dp.model.FetchBundleDeploymentStatusDetails;
import com.oracle.aidataplatform.dp.model.PurgeBundleDetails;
import com.oracle.aidataplatform.dp.model.SyncBundleDetails;
import com.oracle.aidataplatform.dp.requests.CreateBundleRequest;
import com.oracle.aidataplatform.dp.requests.CreateJobRequest;
import com.oracle.aidataplatform.dp.requests.DeleteJobRequest;
import com.oracle.aidataplatform.dp.requests.DeployBundleRequest;
import com.oracle.aidataplatform.dp.requests.FetchBundleDeploymentStatusRequest;
import com.oracle.aidataplatform.dp.requests.GetAsyncOperationRequest;
import com.oracle.aidataplatform.dp.requests.PurgeBundleRequest;
import com.oracle.aidataplatform.dp.requests.SyncBundleRequest;
import com.oracle.aidataplatform.dp.responses.CreateBundleResponse;
import com.oracle.aidataplatform.dp.responses.CreateJobResponse;
import com.oracle.aidataplatform.dp.responses.DeployBundleResponse;
import com.oracle.aidataplatform.dp.responses.FetchBundleDeploymentStatusResponse;
import com.oracle.aidataplatform.dp.responses.GetAsyncOperationResponse;
import com.oracle.aidataplatform.dp.responses.PurgeBundleResponse;
import com.oracle.aidataplatform.dp.responses.SyncBundleResponse;
import com.oracle.bmc.model.BmcException;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BundleSdkIT {
  private SdkTestConfig config;
  private BundleClient bundleClient;
  private AsyncOperationsClient asyncOperationsClient;
  private WorkflowClient workflowClient;
  private SDKGitHelper gitFixture;
  private String workspaceKey;
  private String bundleName;
  private String bundleParentPath;
  private String bundlePath;
  private String bundledResourceKey;
  private boolean bundleCreated;
  private boolean bundlePurged;
  private boolean workflowJobDeleted;

  @BeforeClass(
      alwaysRun = true,
      groups = {"sdk_tests", "sdk_bundle", "bundle", "rel_validation"})
  public void setUp() throws Exception {
    config = SdkTestConfig.load();
    workspaceKey = SdkTestResources.ensureSharedWorkspace(config);
    bundleClient = SdkClients.bundleClient(config);
    asyncOperationsClient = SdkClients.asyncOperationsClient(config);
    workflowClient = SdkClients.workflowClient(config);
    bundleName = config.bundleName() + "_" + uniqueSuffix();
    bundleParentPath = bundleParentPath();
    bundlePath = bundleParentPath + "/" + bundleName;
    bundledResourceKey = config.bundleResourceKey();
    if (config.runBundleCreateTests() && isBlank(bundledResourceKey)) {
      bundledResourceKey = createWorkflowJobFixture();
    }
  }

  @Test(groups = {"sdk_tests", "sdk_bundle", "bundle", "rel_validation"}, priority = 0)
  public void createBundleTest() {
    if (!config.runBundleCreateTests()) {
      throw new SkipException("Set sdkRunBundleCreateTests=true to run bundle create tests.");
    }
    CreateBundleResponse response =
        bundleClient.createBundle(
            CreateBundleRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .createBundleDetails(
                    CreateBundleDetails.builder()
                        .name(bundleName)
                        .description("Created by BundleSdkIT")
                        .path(bundleParentPath)
                        .bundledResources(
                            List.of(
                                BundledResource.builder()
                                    .resourceType(
                                        BundledResource.ResourceType.create(config.bundleResourceType()))
                                    .resourceKey(bundledResourceKey)
                                    .build()))
                        .build())
                .opcRetryToken(requestId("create-bundle-retry"))
                .opcRequestId(requestId("create-bundle"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getOpcRequestId());
    assertNotNull(response.getAidpAsyncOperationKey());
    waitForAsyncOperationSucceeded(response.getAidpAsyncOperationKey(), "wait-create-bundle");
    bundleCreated = true;
  }

  @Test(groups = {"sdk_tests", "sdk_bundle", "bundle", "rel_validation"}, priority = 1)
  public void fetchBundleDeploymentStatusTest() {
    String effectiveBundlePath = effectiveBundlePath("fetch bundle deployment status");

    FetchBundleDeploymentStatusResponse response =
        bundleClient.fetchBundleDeploymentStatus(
            FetchBundleDeploymentStatusRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .fetchBundleDeploymentStatusDetails(
                    FetchBundleDeploymentStatusDetails.builder().path(effectiveBundlePath).build())
                .opcRequestId(requestId("fetch-bundle-deployment-status"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getBundleDeploymentStatus());
  }

  @Test(
      groups = {"sdk_tests", "sdk_bundle", "bundle", "rel_validation"},
      priority = 2)
  public void deployBundleTest() {
    if (!config.runBundleDeployTests()) {
      throw new SkipException("Set sdkRunBundleDeployTests=true to run bundle deploy tests.");
    }
    String effectiveBundlePath = effectiveBundlePath("deploy bundle");

    DeployBundleResponse response =
        bundleClient.deployBundle(
            DeployBundleRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .deployBundleDetails(DeployBundleDetails.builder().path(effectiveBundlePath).build())
                .opcRetryToken(requestId("deploy-bundle-retry"))
                .opcRequestId(requestId("deploy-bundle"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getOpcRequestId());
    assertNotNull(response.getAidpAsyncOperationKey());
    waitForAsyncOperationSucceeded(response.getAidpAsyncOperationKey(), "wait-deploy-bundle");
  }

  @Test(
      groups = {"sdk_tests", "sdk_bundle", "bundle", "rel_validation"},
      priority = 3)
  public void syncBundleTest() {
    if (!config.runBundleSyncTests()) {
      throw new SkipException("Set sdkRunBundleSyncTests=true to run bundle sync tests.");
    }
    String effectiveBundlePath = effectiveBundlePath("sync bundle");

    SyncBundleResponse response =
        bundleClient.syncBundle(
            SyncBundleRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .syncBundleDetails(SyncBundleDetails.builder().path(effectiveBundlePath).build())
                .opcRetryToken(requestId("sync-bundle-retry"))
                .opcRequestId(requestId("sync-bundle"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getOpcRequestId());
    assertNotNull(response.getAidpAsyncOperationKey());
    waitForAsyncOperationSucceeded(response.getAidpAsyncOperationKey(), "wait-sync-bundle");
  }

  @Test(
      groups = {"sdk_tests", "sdk_bundle", "bundle", "rel_validation"},
      priority = 4)
  public void purgeBundleTest() {
    if (!config.runBundlePurgeTests()) {
      throw new SkipException("Set sdkRunBundlePurgeTests=true to run bundle purge tests.");
    }
    purgeBundle(effectiveBundlePath("purge bundle"), "purge-bundle");
    bundlePurged = true;
  }

  private void purgeBundle(String effectiveBundlePath, String requestPrefix) {
    PurgeBundleResponse response =
        bundleClient.purgeBundle(
            PurgeBundleRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .purgeBundleDetails(PurgeBundleDetails.builder().path(effectiveBundlePath).build())
                .opcRetryToken(requestId(requestPrefix + "-retry"))
                .opcRequestId(requestId(requestPrefix))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getOpcRequestId());
    assertNotNull(response.getAidpAsyncOperationKey());
    waitForAsyncOperationSucceeded(response.getAidpAsyncOperationKey(), "wait-purge-bundle");
  }

  private String effectiveBundlePath(String action) {
    if (config.runBundleCreateTests()) {
      if (!bundleCreated) {
        throw new SkipException("Bundle create did not complete; skipping " + action + ".");
      }
      return bundlePath;
    }
    return requireValue(config, "bundlePath");
  }

  private String bundleParentPath() throws Exception {
    String configuredParentPath = normalizePath(config.bundleCreateParentPath());
    if (!config.runBundleCreateTests()
        || !"/Workspace".equals(configuredParentPath)
        || !isBlank(config.bundleResourceKey())) {
      return configuredParentPath;
    }

    gitFixture =
        new SDKGitHelper(config, workspaceKey, "bundle_git_" + uniqueSuffix());
    gitFixture.ensureGitFolderAvailable();
    return "/Workspace/" + gitFixture.folderPath();
  }

  private String createWorkflowJobFixture() {
    CreateJobResponse response =
        workflowClient.createJob(
            CreateJobRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .createJobDetails(
                    CreateJobDetails.builder()
                        .name("bundle_job_sdk_" + uniqueSuffix() + ".job")
                        .description("Workflow job fixture for BundleSdkIT")
                        .path("/Workspace/jobs")
                        .maxConcurrentRuns(1)
                        .build())
                .opcRetryToken(requestId("bundle-job-retry"))
                .opcRequestId(requestId("bundle-job"))
                .shouldUpdateRecent(false)
                .build());
    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getJob(), "created workflow job should be present");
    assertNotNull(response.getJob().getKey(), "created workflow job key should be present");
    return response.getJob().getKey();
  }

  private void waitForAsyncOperationSucceeded(String asyncOperationKey, String requestPrefix) {
    Instant deadline = Instant.now().plus(bundleAsyncTimeout());
    AsyncOperation lastOperation = null;

    while (!Instant.now().isAfter(deadline)) {
      GetAsyncOperationResponse response =
          asyncOperationsClient.getAsyncOperation(
              GetAsyncOperationRequest.builder()
                  .aiDataPlatformId(config.dataHubId())
                  .asyncOperationKey(asyncOperationKey)
                  .opcRequestId(requestId(requestPrefix))
                  .build());
      assertSuccessful(response.get__httpStatusCode__());
      lastOperation = response.getAsyncOperation();
      assertNotNull(lastOperation, "Async operation should be present.");

      AsyncOperationStatus status = lastOperation.getStatus();
      if (AsyncOperationStatus.Succeeded.equals(status)) {
        return;
      }
      if (AsyncOperationStatus.Failed.equals(status) || AsyncOperationStatus.Canceled.equals(status)) {
        fail(
            "Async operation "
                + asyncOperationKey
                + " ended with status "
                + status
                + ": "
                + lastOperation.getErrorMessage());
      }
      sleep(config.pollInterval());
    }

    fail(
        "Timed out waiting for async operation "
            + asyncOperationKey
            + " to succeed. Last status: "
            + (lastOperation != null ? lastOperation.getStatus() : null));
  }

  private Duration bundleAsyncTimeout() {
    return config.workspaceReadyTimeout();
  }

  private void sleep(Duration duration) {
    try {
      Thread.sleep(duration.toMillis());
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new AssertionError("Interrupted while waiting for bundle async operation.", e);
    }
  }

  private String normalizePath(String path) {
    if (path == null || path.isBlank()) {
      throw new SkipException("Set sdkBundleCreateParentPath to run bundle mutation tests.");
    }
    String value = path.trim();
    while (value.endsWith("/") && value.length() > 1) {
      value = value.substring(0, value.length() - 1);
    }
    return value;
  }

  private String uniqueSuffix() {
    return System.currentTimeMillis() + "_" + Long.toUnsignedString(System.nanoTime(), 36);
  }

  private boolean isBlank(String value) {
    return value == null || value.isBlank();
  }

  @AfterClass(
      alwaysRun = true,
      groups = {"sdk_tests", "sdk_bundle", "bundle", "rel_validation"})
  public void tearDown() {
    try {
      if (bundleCreated && !bundlePurged && bundleClient != null) {
        purgeBundle(bundlePath, "cleanup-bundle");
        bundlePurged = true;
      }
    } catch (BmcException e) {
      if (e.getStatusCode() != 404) {
        throw e;
      }
    } finally {
      deleteWorkflowJobFixture();
      if (gitFixture != null) {
        gitFixture.close();
      }
    }
    if (bundleClient != null) {
      bundleClient.close();
    }
    if (asyncOperationsClient != null) {
      asyncOperationsClient.close();
    }
    if (workflowClient != null) {
      workflowClient.close();
    }
  }

  private void deleteWorkflowJobFixture() {
    if (workflowJobDeleted || workflowClient == null || isBlank(bundledResourceKey)) {
      return;
    }
    if (!isBlank(config.bundleResourceKey())) {
      return;
    }
    try {
      workflowClient.deleteJob(
          DeleteJobRequest.builder()
              .aiDataPlatformId(config.dataHubId())
              .workspaceKey(workspaceKey)
              .jobKey(bundledResourceKey)
              .opcRequestId(requestId("bundle-job-clean"))
              .build());
      workflowJobDeleted = true;
    } catch (BmcException e) {
      if (e.getStatusCode() != 404) {
        throw e;
      }
      workflowJobDeleted = true;
    }
  }
}
