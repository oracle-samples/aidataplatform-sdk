package com.oracle.aidp.sdk.support;

import static com.oracle.aidp.sdk.support.SdkTestSupport.assertSuccessful;
import static com.oracle.aidp.sdk.support.SdkTestSupport.isBlank;
import static com.oracle.aidp.sdk.support.SdkTestSupport.requestId;
import static org.testng.Assert.assertNotNull;

import com.oracle.aidp.sdk.client.SdkClients;
import com.oracle.aidp.sdk.config.SdkTestConfig;
import com.oracle.aidataplatform.dp.UserSettingClient;
import com.oracle.aidataplatform.dp.WorkspaceClient;
import com.oracle.aidataplatform.dp.WorkspaceObjectClient;
import com.oracle.aidataplatform.dp.model.CreateGitFolderDetails;
import com.oracle.aidataplatform.dp.model.CreateUserSettingDetails;
import com.oracle.aidataplatform.dp.model.GitAccountProviderName;
import com.oracle.aidataplatform.dp.model.GitAccountUserSetting;
import com.oracle.aidataplatform.dp.model.GitFolder;
import com.oracle.aidataplatform.dp.model.SortOrder;
import com.oracle.aidataplatform.dp.model.WorkspaceObjectSummary;
import com.oracle.aidataplatform.dp.requests.CreateGitFolderRequest;
import com.oracle.aidataplatform.dp.requests.CreateUserSettingRequest;
import com.oracle.aidataplatform.dp.requests.DeleteUserSettingRequest;
import com.oracle.aidataplatform.dp.requests.DeleteWorkspaceObjectRequest;
import com.oracle.aidataplatform.dp.requests.HeadWorkspaceObjectRequest;
import com.oracle.aidataplatform.dp.requests.ListWorkspaceObjectsRequest;
import com.oracle.aidataplatform.dp.responses.CreateGitFolderResponse;
import com.oracle.aidataplatform.dp.responses.CreateUserSettingResponse;
import com.oracle.aidataplatform.dp.responses.HeadWorkspaceObjectResponse;
import com.oracle.aidataplatform.dp.responses.ListWorkspaceObjectsResponse;
import com.oracle.bmc.model.BmcException;
import java.time.Duration;
import java.util.Map;
import java.util.UUID;

public final class SDKGitHelper implements AutoCloseable {
  private final SdkTestConfig config;
  private final String workspaceKey;
  private final String folderPath;
  private final WorkspaceClient workspaceClient;
  private final WorkspaceObjectClient workspaceObjectClient;
  private final UserSettingClient userSettingClient;

  private String createdCredentialKey;
  private String workspaceObjectKey;
  private boolean createdFolder;
  private boolean folderAvailable;

  public SDKGitHelper(SdkTestConfig config, String workspaceKey, String folderPath)
      throws Exception {
    this.config = config;
    this.workspaceKey = workspaceKey;
    this.folderPath = normalizePath(folderPath);
    this.workspaceClient = SdkClients.workspaceClient(config);
    this.workspaceObjectClient = SdkClients.workspaceObjectClient(config);
    this.userSettingClient = SdkClients.userSettingClient(config);
  }

  public String ensureGitRepositoryKey() {
    String configuredRepositoryKey =
        config.value("gitRepositoryKey", config.value("sdkGitRepositoryKey", null));
    if (!isBlank(configuredRepositoryKey)) {
      return configuredRepositoryKey;
    }

    ensureGitFolderAvailable();
    String repositoryKey = waitForRepositoryKeyFromWorkspaceObject();
    return firstNonBlank(repositoryKey, workspaceObjectKey, folderPath);
  }

  public void ensureGitFolderAvailable() {
    if (folderAvailable) {
      return;
    }

    CreateGitFolderResponse response;
    try {
      response =
          workspaceClient.createGitFolder(
              CreateGitFolderRequest.builder()
                  .aiDataPlatformId(config.dataHubId())
                  .workspaceKey(workspaceKey)
                  .createGitFolderDetails(createGitFolderDetails())
                  .opcRetryToken(requestId("sdk-git-folder-retry"))
                  .opcRequestId(requestId("sdk-git-folder"))
                  .build());
      assertSuccessful(response.get__httpStatusCode__());
      createdFolder = true;
      String repositoryKey = repositoryKeyFromGitFolder(response.getGitFolder());
      if (!isBlank(repositoryKey)) {
        workspaceObjectKey = repositoryKey;
      }
    } catch (BmcException e) {
      if (e.getStatusCode() != 409) {
        throw e;
      }
    }

    workspaceObjectKey = firstNonBlank(workspaceObjectKey, waitForWorkspaceObjectAvailable());
    folderAvailable = true;
  }

  public String folderPath() {
    return folderPath;
  }

  @Override
  public void close() {
    try {
      if (createdFolder) {
        try {
          deleteGitFolder();
        } catch (BmcException e) {
          System.err.println(
              "Failed to clean SDK Git folder "
                  + folderPath
                  + ": HTTP "
                  + e.getStatusCode());
          createdFolder = false;
        }
      }
    } finally {
      try {
        if (!isBlank(createdCredentialKey)) {
          userSettingClient.deleteUserSetting(
              DeleteUserSettingRequest.builder()
                  .aiDataPlatformId(config.dataHubId())
                  .settingKey(createdCredentialKey)
                  .opcRequestId(requestId("sdk-git-cred-clean"))
                  .build());
        }
      } catch (BmcException e) {
        if (e.getStatusCode() != 404) {
          System.err.println(
              "Failed to clean SDK Git credential: HTTP " + e.getStatusCode());
        }
      } finally {
        workspaceClient.close();
        workspaceObjectClient.close();
        userSettingClient.close();
      }
    }
  }

  private CreateGitFolderDetails createGitFolderDetails() {
    return CreateGitFolderDetails.builder()
        .folderPath(folderPath)
        .gitProviderKey(blankToNull(config.gitProviderKey()))
        .gitRepositoryUrl(requireConfigured(config.gitRepositoryUrl(), "sdkGitRepositoryUrl"))
        .branchName(requireConfigured(config.gitBranchName(), "sdkGitBranchName"))
        .credentialKey(credentialKey())
        .description("Git folder created by SDK validation tests")
        .build();
  }

  private String credentialKey() {
    if (!isBlank(config.gitCredentialKey())) {
      return config.gitCredentialKey();
    }
    String username = requireConfigured(config.gitUserName(), "sdkGitUserName");
    String personalAccessToken =
        requireConfigured(config.gitPersonalAccessToken(), "sdkGitPersonalAccessToken");

    CreateUserSettingResponse response =
        userSettingClient.createUserSetting(
            CreateUserSettingRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .createUserSettingDetails(
                    CreateUserSettingDetails.builder()
                        .name(config.gitCredentialName() + "_" + shortId())
                        .isDefault(false)
                        .data(
                            GitAccountUserSetting.builder()
                                .providerName(GitAccountProviderName.create(config.gitProviderName()))
                                .entityType(GitAccountUserSetting.EntityType.PersonalAccessToken)
                                .username(username)
                                .personalAccessToken(personalAccessToken)
                                .build())
                        .build())
                .opcRetryToken(requestId("sdk-git-cred-retry"))
                .opcRequestId(requestId("sdk-git-cred"))
                .build());
    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getUserSetting(), "created Git credential user setting should be present");
    createdCredentialKey = response.getUserSetting().getKey();
    return createdCredentialKey;
  }

  private String waitForRepositoryKeyFromWorkspaceObject() {
    long deadline = System.nanoTime() + Duration.ofSeconds(30).toNanos();
    String lastRepositoryKey = null;
    while (System.nanoTime() < deadline) {
      lastRepositoryKey = repositoryKeyFromWorkspaceObject();
      if (!isBlank(lastRepositoryKey)) {
        return lastRepositoryKey;
      }
      sleep(config.pollInterval());
    }
    return lastRepositoryKey;
  }

  private String waitForWorkspaceObjectAvailable() {
    long deadline = System.nanoTime() + Duration.ofMinutes(5).toNanos();
    BmcException lastException = null;
    while (System.nanoTime() < deadline) {
      try {
        HeadWorkspaceObjectResponse response =
            workspaceObjectClient.headWorkspaceObject(
                HeadWorkspaceObjectRequest.builder()
                    .aiDataPlatformId(config.dataHubId())
                    .workspaceKey(workspaceKey)
                    .objectPath(folderPath)
                    .shouldIncludeMetadata(true)
                    .shouldUpdateRecent(false)
                    .opcRequestId(requestId("sdk-git-folder-head"))
                    .build());
        assertSuccessful(response.get__httpStatusCode__());
        return response.getObjectKey();
      } catch (BmcException e) {
        if (e.getStatusCode() != 404) {
          throw e;
        }
        lastException = e;
      }
      sleep(config.pollInterval());
    }
    if (lastException != null) {
      throw lastException;
    }
    return null;
  }

  private String repositoryKeyFromWorkspaceObject() {
    ListWorkspaceObjectsResponse response =
        workspaceObjectClient.listWorkspaceObjects(
            ListWorkspaceObjectsRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .path(parentPath(folderPath))
                .displayName(leafName(folderPath))
                .limit(10)
                .sortBy(ListWorkspaceObjectsRequest.SortBy.DisplayName)
                .sortOrder(SortOrder.Asc)
                .shouldUpdateRecent(false)
                .opcRequestId(requestId("sdk-git-folder-list"))
                .build());
    assertSuccessful(response.get__httpStatusCode__());
    if (response.getWorkspaceObjectCollection() == null
        || response.getWorkspaceObjectCollection().getItems() == null) {
      return null;
    }
    return response.getWorkspaceObjectCollection().getItems().stream()
        .filter(item -> leafName(folderPath).equals(item.getDisplayName()))
        .map(this::repositoryKeyFromWorkspaceObject)
        .filter(repositoryKey -> !isBlank(repositoryKey))
        .findFirst()
        .orElse(null);
  }

  private String repositoryKeyFromWorkspaceObject(WorkspaceObjectSummary object) {
    if (object == null || object.getMetadata() == null) {
      return null;
    }
    Map<String, String> metadata = object.getMetadata();
    return firstNonBlank(
        metadata.get("repoKey"),
        metadata.get("repo_key"),
        metadata.get("repositoryKey"),
        metadata.get("gitRepositoryKey"));
  }

  private String repositoryKeyFromGitFolder(GitFolder gitFolder) {
    if (gitFolder == null || gitFolder.getFolderMetadata() == null) {
      return null;
    }
    Map<String, Object> metadata = gitFolder.getFolderMetadata();
    return firstNonBlank(
        stringValue(metadata.get("repoKey")),
        stringValue(metadata.get("repo_key")),
        stringValue(metadata.get("repositoryKey")),
        stringValue(metadata.get("gitRepositoryKey")));
  }

  private void deleteGitFolder() {
    try {
      workspaceObjectClient.deleteWorkspaceObject(
          DeleteWorkspaceObjectRequest.builder()
              .aiDataPlatformId(config.dataHubId())
              .workspaceKey(workspaceKey)
              .objectPath(folderPath)
              .opcRequestId(requestId("sdk-git-folder-clean"))
              .build());
      createdFolder = false;
    } catch (BmcException e) {
      if (e.getStatusCode() != 404) {
        throw e;
      }
      createdFolder = false;
    }
  }

  private static String requireConfigured(String value, String name) {
    if (isBlank(value)) {
      throw new IllegalArgumentException("Missing required Git fixture property: " + name);
    }
    return value;
  }

  private static String normalizePath(String path) {
    if (isBlank(path)) {
      return "sdk_git_" + shortId();
    }
    String normalized = path.trim();
    while (normalized.startsWith("/")) {
      normalized = normalized.substring(1);
    }
    while (normalized.endsWith("/") && normalized.length() > 1) {
      normalized = normalized.substring(0, normalized.length() - 1);
    }
    return normalized;
  }

  private static String parentPath(String path) {
    int separator = path.lastIndexOf('/');
    return separator < 0 ? "" : path.substring(0, separator);
  }

  private static String leafName(String path) {
    int separator = path.lastIndexOf('/');
    return separator < 0 ? path : path.substring(separator + 1);
  }

  private static String firstNonBlank(String... values) {
    for (String value : values) {
      if (!isBlank(value)) {
        return value;
      }
    }
    return null;
  }

  private static String stringValue(Object value) {
    return value == null ? null : String.valueOf(value);
  }

  private static String blankToNull(String value) {
    return isBlank(value) ? null : value;
  }

  private static String shortId() {
    return UUID.randomUUID().toString().replace("-", "").substring(0, 12);
  }

  private static void sleep(Duration duration) {
    try {
      Thread.sleep(duration.toMillis());
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new RuntimeException("Interrupted while waiting for Git folder.", e);
    }
  }
}
