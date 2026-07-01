package com.oracle.aidp.sdk.notebook;

import static com.oracle.aidp.sdk.support.SdkTestSupport.assertSuccessful;
import static com.oracle.aidp.sdk.support.SdkTestSupport.requestId;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import com.oracle.aidp.sdk.client.SdkClients;
import com.oracle.aidp.sdk.config.SdkTestConfig;
import com.oracle.aidp.sdk.support.SdkTestResources;
import com.oracle.aidataplatform.dp.AsyncOperationsClient;
import com.oracle.aidataplatform.dp.ClusterClient;
import com.oracle.aidataplatform.dp.NotebookClient;
import com.oracle.aidataplatform.dp.WorkspaceObjectClient;
import com.oracle.aidataplatform.dp.model.Content;
import com.oracle.aidataplatform.dp.model.CreateContentDetails;
import com.oracle.aidataplatform.dp.model.CreateSessionDetails;
import com.oracle.aidataplatform.dp.model.ExportContentsDetails;
import com.oracle.aidataplatform.dp.model.Kernel;
import com.oracle.aidataplatform.dp.model.ModifyContentDetails;
import com.oracle.aidataplatform.dp.model.PatchSessionDetails;
import com.oracle.aidataplatform.dp.model.Session;
import com.oracle.aidataplatform.dp.model.UpdateContentDetails;
import com.oracle.aidataplatform.dp.requests.CreateContentRequest;
import com.oracle.aidataplatform.dp.requests.CreateSessionRequest;
import com.oracle.aidataplatform.dp.requests.CreateWorkspaceObjectRequest;
import com.oracle.aidataplatform.dp.requests.DeleteContentRequest;
import com.oracle.aidataplatform.dp.requests.DeleteSessionRequest;
import com.oracle.aidataplatform.dp.requests.DeleteWorkspaceObjectRequest;
import com.oracle.aidataplatform.dp.requests.ExportContentsRequest;
import com.oracle.aidataplatform.dp.requests.GetContentRequest;
import com.oracle.aidataplatform.dp.requests.GetSessionRequest;
import com.oracle.aidataplatform.dp.requests.ListSessionsRequest;
import com.oracle.aidataplatform.dp.requests.ModifyContentRequest;
import com.oracle.aidataplatform.dp.requests.PatchSessionRequest;
import com.oracle.aidataplatform.dp.requests.UpdateContentRequest;
import com.oracle.aidataplatform.dp.responses.CreateContentResponse;
import com.oracle.aidataplatform.dp.responses.CreateSessionResponse;
import com.oracle.aidataplatform.dp.responses.DeleteContentResponse;
import com.oracle.aidataplatform.dp.responses.DeleteSessionResponse;
import com.oracle.aidataplatform.dp.responses.ExportContentsResponse;
import com.oracle.aidataplatform.dp.responses.GetContentResponse;
import com.oracle.aidataplatform.dp.responses.GetSessionResponse;
import com.oracle.aidataplatform.dp.responses.ListSessionsResponse;
import com.oracle.aidataplatform.dp.responses.ModifyContentResponse;
import com.oracle.aidataplatform.dp.responses.PatchSessionResponse;
import com.oracle.aidataplatform.dp.responses.UpdateContentResponse;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.retrier.RetryConfiguration;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NotebookSdkIT {
  private SdkTestConfig config;
  private NotebookClient notebookClient;
  private WorkspaceObjectClient workspaceObjectClient;
  private ClusterClient clusterClient;
  private AsyncOperationsClient asyncOperationsClient;
  private String aiDataPlatformId;
  private String workspaceKey;
  private String clusterKey;
  private String folderObjectPath;
  private String notebookFolderPath;
  private String notebookFileName;
  private String notebookPath;
  private String currentNotebookPath;
  private String sessionId;
  private String sessionName;
  private boolean notebookDeleted;
  private boolean sessionDeleted;
  private boolean folderDeleted;

  @BeforeClass(
      alwaysRun = true,
      groups = {"sdk_tests", "sdk_notebook", "notebook", "rel_validation"})
  public void setUp() throws Exception {
    config = SdkTestConfig.load();
    aiDataPlatformId = config.value("aidpInstanceId", config.required("dataHubId"));
    workspaceKey = SdkTestResources.ensureSharedWorkspace(config);
    notebookClient = SdkClients.notebookClient(config);
    workspaceObjectClient = SdkClients.workspaceObjectClient(config);
    clusterClient = SdkClients.clusterClient(config);
    asyncOperationsClient = SdkClients.asyncOperationsClient(config);

    String runId = UUID.randomUUID().toString().replace("-", "");
    folderObjectPath = "notebook_sdk_" + runId;
    notebookFolderPath = normalizeNotebookRoot(config.notebookFolderRoot()) + "/" + folderObjectPath;
    notebookFileName = "notebook_" + runId + ".ipynb";
    notebookPath = notebookFolderPath + "/" + notebookFileName;

    createNotebookFolder();
  }

  @Test(groups = {"sdk_tests", "sdk_notebook", "notebook", "rel_validation"})
  public void createContent() {
    CreateContentResponse response =
        notebookClient.createContent(
            CreateContentRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .contentPath(notebookFolderPath)
                .createContentDetails(
                    CreateContentDetails.builder()
                        .type(Content.Type.Notebook)
                        .ext(".ipynb")
                        .build())
                .opcRetryToken(requestId("create-notebook-content"))
                .opcRequestId(requestId("create-notebook-content"))
                .shouldUpdateRecent(false)
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getContent());
    currentNotebookPath = response.getContent().getPath();
    assertFalse(isBlank(currentNotebookPath), "createContent should return content path");
    assertEquals(response.getContent().getType(), Content.Type.Notebook);
  }

  @Test(
      groups = {"sdk_tests", "sdk_notebook", "notebook", "rel_validation"},
      dependsOnMethods = {"createContent"})
  public void modifyContent() {
    ModifyContentResponse response =
        notebookClient.modifyContent(
            ModifyContentRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .contentPath(currentNotebookPath)
                .modifyContentDetails(ModifyContentDetails.builder().path(notebookPath).build())
                .opcRequestId(requestId("modify-notebook-content"))
                .shouldUpdateRecent(false)
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getContent());
    currentNotebookPath = response.getContent().getPath();
    assertNotebookPathEquals(currentNotebookPath, notebookPath);
  }

  @Test(
      groups = {"sdk_tests", "sdk_notebook", "notebook", "rel_validation"},
      dependsOnMethods = {"modifyContent"})
  public void updateContent() {
    UpdateContentResponse response =
        notebookClient.updateContent(
            UpdateContentRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .contentPath(notebookPath)
                .updateContentDetails(
                    UpdateContentDetails.builder()
                        .name(notebookFileName)
                        .path(notebookPath)
                        .type(UpdateContentDetails.Type.Notebook)
                        .format(UpdateContentDetails.Format.Json)
                        .content(notebookBody())
                        .build())
                .opcRequestId(requestId("update-notebook-content"))
                .shouldUpdateRecent(false)
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getContent());
    assertNotebookPathEquals(response.getContent().getPath(), notebookPath);
    currentNotebookPath = response.getContent().getPath();
  }

  @Test(
      groups = {"sdk_tests", "sdk_notebook", "notebook", "rel_validation"},
      dependsOnMethods = {"updateContent"})
  public void getContent() {
    GetContentResponse response = getContentWithRetry();

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getContent());
    assertNotebookPathEquals(response.getContent().getPath(), notebookPath);
  }

  @Test(
      groups = {"sdk_tests", "sdk_notebook", "notebook", "rel_validation"},
      dependsOnMethods = {"updateContent"})
  public void exportContents() {
    ExportContentsResponse response =
        notebookClient.exportContents(
            ExportContentsRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .contentPath(notebookPath)
                .exportContentsDetails(
                    ExportContentsDetails.builder().format(ExportContentsDetails.Format.Ipynb).build())
                .opcRequestId(requestId("export-notebook-content"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getExportedContents());
  }

  @Test(
      groups = {"sdk_tests", "sdk_notebook", "notebook", "rel_validation"},
      dependsOnMethods = {"updateContent"})
  public void createSession() {
    clusterKey =
        SdkTestResources.ensureActiveSharedCluster(
            config, workspaceKey, clusterClient, asyncOperationsClient);
    sessionName = "notebook_session_" + UUID.randomUUID().toString().substring(0, 8);

    CreateSessionResponse response =
        notebookClient.createSession(
            CreateSessionRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .createSessionDetails(
                    CreateSessionDetails.builder()
                        .name(sessionName)
                        .path(notebookPath)
                        .type("notebook")
                        .clusterId(clusterKey)
                        .kernel(Kernel.builder().name(config.notebookKernelName()).build())
                        .build())
                .opcRetryToken(requestId("create-notebook-session"))
                .opcRequestId(requestId("create-notebook-session"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getSession());
    sessionId = response.getSession().getId();
    assertFalse(isBlank(sessionId), "createSession should return session id");
    assertNotebookPathEquals(response.getSession().getPath(), notebookPath);
    waitForSessionActive();
  }

  @Test(
      groups = {"sdk_tests", "sdk_notebook", "notebook", "rel_validation"},
      dependsOnMethods = {"createSession"})
  public void getSession() {
    GetSessionResponse response =
        notebookClient.getSession(
            GetSessionRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .sessionId(sessionId)
                .opcRequestId(requestId("get-notebook-session"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getSession());
    assertEquals(response.getSession().getId(), sessionId);
  }

  @Test(
      groups = {"sdk_tests", "sdk_notebook", "notebook", "rel_validation"},
      dependsOnMethods = {"getSession"})
  public void listSessions() {
    ListSessionsResponse response =
        notebookClient.listSessions(
            ListSessionsRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .path(notebookPath)
                .clusterId(clusterKey)
                .opcRequestId(requestId("list-notebook-sessions"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getSessionCollection());
    assertNotNull(response.getSessionCollection().getItems());
    assertTrue(
        response.getSessionCollection().getItems().stream()
            .anyMatch(session -> sessionId.equals(session.getId())),
        "created session should be present in listSessions response");
  }

  @Test(
      groups = {"sdk_tests", "sdk_notebook", "notebook", "rel_validation"},
      dependsOnMethods = {"listSessions"})
  public void patchSession() {
    String updatedSessionName = sessionName + "_updated";
    PatchSessionResponse response =
        notebookClient.patchSession(
            PatchSessionRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .sessionId(sessionId)
                .patchSessionDetails(
                    PatchSessionDetails.builder()
                        .id(sessionId)
                        .name(updatedSessionName)
                        .path(notebookPath)
                        .type(Session.Type.Notebook)
                        .clusterId(clusterKey)
                        .mustRefreshContext(false)
                        .build())
                .opcRequestId(requestId("patch-notebook-session"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getSession());
    assertEquals(response.getSession().getName(), updatedSessionName);
    sessionName = updatedSessionName;
  }

  @Test(
      groups = {"sdk_tests", "sdk_notebook", "notebook", "rel_validation"},
      dependsOnMethods = {"patchSession"})
  public void deleteSession() {
    DeleteSessionResponse response =
        notebookClient.deleteSession(
            DeleteSessionRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .sessionId(sessionId)
                .opcRequestId(requestId("delete-notebook-session"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    sessionDeleted = true;
  }

  @Test(
      groups = {"sdk_tests", "sdk_notebook", "notebook", "rel_validation"},
      dependsOnMethods = {"deleteSession", "exportContents"})
  public void deleteContent() {
    DeleteContentResponse response =
        notebookClient.deleteContent(
            DeleteContentRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .contentPath(notebookPath)
                .opcRequestId(requestId("delete-notebook-content"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    notebookDeleted = true;
  }

  @AfterClass(alwaysRun = true)
  public void cleanup() {
    if (!isBlank(sessionId) && !sessionDeleted) {
      try {
        notebookClient.deleteSession(
            DeleteSessionRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .sessionId(sessionId)
                .opcRequestId(requestId("cleanup-notebook-session"))
                .build());
      } catch (Exception ignored) {
        // Best-effort cleanup.
      }
    }
    if (!isBlank(notebookPath) && !notebookDeleted) {
      try {
        notebookClient.deleteContent(
            DeleteContentRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .contentPath(isBlank(currentNotebookPath) ? notebookPath : currentNotebookPath)
                .opcRequestId(requestId("cleanup-notebook-content"))
                .build());
      } catch (Exception ignored) {
        // Best-effort cleanup.
      }
    }
    if (!isBlank(folderObjectPath) && !folderDeleted) {
      try {
        workspaceObjectClient.deleteWorkspaceObject(
            DeleteWorkspaceObjectRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .objectPath(folderObjectPath)
                .opcRequestId(requestId("cleanup-notebook-folder"))
                .build());
      } catch (Exception ignored) {
        // Best-effort cleanup.
      }
    }
    if (notebookClient != null) {
      notebookClient.close();
    }
    if (workspaceObjectClient != null) {
      workspaceObjectClient.close();
    }
    if (clusterClient != null) {
      clusterClient.close();
    }
    if (asyncOperationsClient != null) {
      asyncOperationsClient.close();
    }
  }

  private void createNotebookFolder() {
    try {
      workspaceObjectClient.createWorkspaceObject(
          CreateWorkspaceObjectRequest.builder()
              .aiDataPlatformId(aiDataPlatformId)
              .workspaceKey(workspaceKey)
              .createWorkspaceObjectDetails(new ByteArrayInputStream(new byte[0]))
              .path(folderObjectPath)
              .type("FOLDER")
              .isOverwrite(true)
              .opcRetryToken(requestId("create-notebook-folder"))
              .opcRequestId(requestId("create-notebook-folder"))
              .shouldUpdateRecent(false)
              .build());
    } catch (BmcException e) {
      if (e.getStatusCode() == 409) {
        return;
      }
      throw e;
    }
  }

  private Map<String, Object> notebookBody() {
    return Map.of(
        "cells",
        List.of(
            Map.of(
                "cell_type", "code",
                "metadata", Map.of("trusted", true),
                "outputs", List.of(),
                "source", "print(\"Hello from notebook SDK rel validation\")")),
        "metadata",
        Map.of(
            "kernelspec",
            Map.of("display_name", "Python 3", "language", "python", "name", "python3"),
            "language_info",
            Map.of("name", "python")),
        "nbformat",
        4,
        "nbformat_minor",
        5);
  }

  private GetContentResponse getContentWithRetry() {
    long deadline = System.nanoTime() + Duration.ofMinutes(3).toNanos();
    BmcException lastFailure = null;
    while (System.nanoTime() < deadline) {
      try {
        return notebookClient.getContent(
            GetContentRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .contentPath(notebookPath)
                .type(GetContentRequest.Type.Notebook)
                .content(0)
                .opcRequestId(requestId("get-notebook-content"))
                .shouldUpdateRecent(false)
                .retryConfiguration(RetryConfiguration.NO_RETRY_CONFIGURATION)
                .build());
      } catch (BmcException e) {
        if (!isRetryableGetContentFailure(e)) {
          throw e;
        }
        lastFailure = e;
      }
      sleep(Duration.ofSeconds(10));
    }
    throw new AssertionError("Timed out getting notebook content for " + notebookPath, lastFailure);
  }

  private boolean isRetryableGetContentFailure(BmcException e) {
    int statusCode = e.getStatusCode();
    if (statusCode == 404
        || statusCode == 409
        || statusCode == 429
        || statusCode == 500
        || statusCode == 502
        || statusCode == 503
        || statusCode == 504) {
      return true;
    }
    return statusCode == -1
        && (contains(e.getMessage(), "RemoteDisconnected")
            || contains(e.getMessage(), "Connection aborted")
            || contains(e.getMessage(), "request failed"));
  }

  private void waitForSessionActive() {
    long deadline = System.nanoTime() + Duration.ofMinutes(15).toNanos();
    Session lastSession = null;
    while (System.nanoTime() < deadline) {
      try {
        GetSessionResponse response =
            notebookClient.getSession(
                GetSessionRequest.builder()
                    .aiDataPlatformId(aiDataPlatformId)
                    .workspaceKey(workspaceKey)
                    .sessionId(sessionId)
                    .opcRequestId(requestId("poll-notebook-session"))
                    .build());
        assertSuccessful(response.get__httpStatusCode__());
        lastSession = response.getSession();
        if (lastSession != null && Session.LifecycleState.Active == lastSession.getLifecycleState()) {
          return;
        }
        if (lastSession != null && Session.LifecycleState.Failed == lastSession.getLifecycleState()) {
          throw new AssertionError("Notebook session " + sessionId + " entered FAILED state.");
        }
      } catch (BmcException e) {
        if (e.getStatusCode() != -1) {
          throw e;
        }
      }
      sleep(Duration.ofSeconds(20));
    }
    throw new SkipException("Notebook session did not become ACTIVE. Last session=" + lastSession);
  }

  private static void assertNotebookPathEquals(String actual, String expected) {
    assertEquals(normalizeNotebookPath(actual), normalizeNotebookPath(expected));
  }

  private static String normalizeNotebookRoot(String path) {
    String normalized = normalizeNotebookPath(path);
    return normalized.endsWith("/") ? normalized.substring(0, normalized.length() - 1) : normalized;
  }

  private static String normalizeNotebookPath(String path) {
    if (path == null) {
      return null;
    }
    String normalized = path.replace('\\', '/').replaceAll("/{2,}", "/");
    if (normalized.startsWith("Workspace/")) {
      normalized = "/" + normalized;
    }
    return normalized.endsWith("/") && normalized.length() > 1
        ? normalized.substring(0, normalized.length() - 1)
        : normalized;
  }

  private static void sleep(Duration duration) {
    try {
      Thread.sleep(duration.toMillis());
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new RuntimeException("Interrupted while waiting for notebook session.", e);
    }
  }

  private static boolean isBlank(String value) {
    return value == null || value.isBlank();
  }

  private static boolean contains(String value, String expected) {
    return value != null && value.contains(expected);
  }
}
