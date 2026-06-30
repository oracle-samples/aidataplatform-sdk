package com.oracle.aidp.sdk.gitrepository;

import static com.oracle.aidp.sdk.support.SdkTestSupport.assertSuccessful;
import static com.oracle.aidp.sdk.support.SdkTestSupport.requestId;
import static org.testng.Assert.assertNotNull;

import com.oracle.aidp.sdk.client.SdkClients;
import com.oracle.aidp.sdk.config.SdkTestConfig;
import com.oracle.aidp.sdk.support.SDKGitHelper;
import com.oracle.aidp.sdk.support.SdkTestResources;
import com.oracle.aidataplatform.dp.GitClient;
import com.oracle.aidataplatform.dp.WorkspaceObjectClient;
import com.oracle.aidataplatform.dp.model.CheckoutBranchDetails;
import com.oracle.aidataplatform.dp.model.CommitPushDetails;
import com.oracle.aidataplatform.dp.model.ConflictResolveDetails;
import com.oracle.aidataplatform.dp.model.CreateGitBranchDetails;
import com.oracle.aidataplatform.dp.model.GitMergeDetails;
import com.oracle.aidataplatform.dp.model.GitPullDetails;
import com.oracle.aidataplatform.dp.model.GitRebaseDetails;
import com.oracle.aidataplatform.dp.model.GitResetDetails;
import com.oracle.aidataplatform.dp.model.ResetGitFolderStateDetails;
import com.oracle.aidataplatform.dp.model.SortOrder;
import com.oracle.aidataplatform.dp.model.UpdateGitRepositoryDetails;
import com.oracle.aidataplatform.dp.requests.CheckoutBranchRequest;
import com.oracle.aidataplatform.dp.requests.CommitPushGitRepositoryRequest;
import com.oracle.aidataplatform.dp.requests.CreateWorkspaceObjectRequest;
import com.oracle.aidataplatform.dp.requests.CreateGitBranchRequest;
import com.oracle.aidataplatform.dp.requests.GetGitDiffDetailRequest;
import com.oracle.aidataplatform.dp.requests.GetGitOperationStateRequest;
import com.oracle.aidataplatform.dp.requests.GetGitRepositoryRequest;
import com.oracle.aidataplatform.dp.requests.ListGitBranchesRequest;
import com.oracle.aidataplatform.dp.requests.ListGitDiffsRequest;
import com.oracle.aidataplatform.dp.requests.MergeGitRepositoryRequest;
import com.oracle.aidataplatform.dp.requests.PullGitRepositoryRequest;
import com.oracle.aidataplatform.dp.requests.RebaseGitRepositoryRequest;
import com.oracle.aidataplatform.dp.requests.ResetGitFolderStateRequest;
import com.oracle.aidataplatform.dp.requests.ResetGitRepositoryRequest;
import com.oracle.aidataplatform.dp.requests.ResolveGitConflictsRequest;
import com.oracle.aidataplatform.dp.requests.UpdateGitRepositoryRequest;
import com.oracle.aidataplatform.dp.responses.CheckoutBranchResponse;
import com.oracle.aidataplatform.dp.responses.CommitPushGitRepositoryResponse;
import com.oracle.aidataplatform.dp.responses.CreateGitBranchResponse;
import com.oracle.aidataplatform.dp.responses.CreateWorkspaceObjectResponse;
import com.oracle.aidataplatform.dp.responses.GetGitDiffDetailResponse;
import com.oracle.aidataplatform.dp.responses.GetGitOperationStateResponse;
import com.oracle.aidataplatform.dp.responses.GetGitRepositoryResponse;
import com.oracle.aidataplatform.dp.responses.ListGitBranchesResponse;
import com.oracle.aidataplatform.dp.responses.ListGitDiffsResponse;
import com.oracle.aidataplatform.dp.responses.MergeGitRepositoryResponse;
import com.oracle.aidataplatform.dp.responses.PullGitRepositoryResponse;
import com.oracle.aidataplatform.dp.responses.RebaseGitRepositoryResponse;
import com.oracle.aidataplatform.dp.responses.ResetGitFolderStateResponse;
import com.oracle.aidataplatform.dp.responses.ResetGitRepositoryResponse;
import com.oracle.aidataplatform.dp.responses.ResolveGitConflictsResponse;
import com.oracle.aidataplatform.dp.responses.UpdateGitRepositoryResponse;
import com.oracle.bmc.model.BmcException;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GitRepositorySdkIT {
  private SdkTestConfig config;
  private GitClient gitClient;
  private WorkspaceObjectClient workspaceObjectClient;
  private SDKGitHelper gitFixture;
  private String aiDataPlatformId;
  private String workspaceKey;
  private String gitRepositoryKey;
  private String gitFolderPath;
  private String testBranchName;
  private String changedGitFilePath;
  private String changedGitFileName;

  @BeforeClass(alwaysRun = true, groups = {"sdk_tests", "sdk_git", "git", "git_release", "rel_validation"})
  public void setUp() throws Exception {
    config = SdkTestConfig.load();
    aiDataPlatformId = config.value("aidpInstanceId", config.required("dataHubId"));
    workspaceKey = SdkTestResources.ensureSharedWorkspace(config);
    gitFolderPath = defaultGitFolderPath();
    testBranchName = config.value("createGitBranchName", "sdk-it-" + shortId());
    gitClient = SdkClients.gitClient(config);
    workspaceObjectClient = SdkClients.workspaceObjectClient(config);
    gitFixture = new SDKGitHelper(config, workspaceKey, gitFolderPath);
    gitRepositoryKey = gitFixture.ensureGitRepositoryKey();
  }

  @Test(groups = {"sdk_tests", "sdk_git", "git", "git_release", "rel_validation"}, priority = 0)
  public void getGitRepository() {
    try {
      GetGitRepositoryResponse response =
          gitClient.getGitRepository(
              GetGitRepositoryRequest.builder()
                  .aiDataPlatformId(aiDataPlatformId)
                  .workspaceKey(workspaceKey)
                  .gitRepositoryKey(requireGitRepositoryKey())
                  .shouldIncludeCredentialKey(
                      parseBoolean(config.value("getRepositoryShouldIncludeCredentialKey", "false")))
                  .opcRequestId(requestId("get-git-repository"))
                  .build());

      assertSuccessful(response.get__httpStatusCode__());
      assertNotNull(response.getGitRepository());
    } catch (BmcException e) {
      assertAllowedLiveGitState(e);
    }
  }

  @Test(groups = {"sdk_tests", "sdk_git", "git", "git_release", "rel_validation"}, priority = 1)
  public void listGitBranches() {
    try {
      ListGitBranchesResponse response =
          gitClient.listGitBranches(
              ListGitBranchesRequest.builder()
                  .aiDataPlatformId(aiDataPlatformId)
                  .workspaceKey(workspaceKey)
                  .gitRepositoryKey(requireGitRepositoryKey())
                  .displayName(blankToNull(config.value("listBranchesDisplayName", "")))
                  .displayNameContains(blankToNull(config.value("listBranchesDisplayNameContains", "")))
                  .limit(parsePositiveInt(config.value("listBranchesLimit", "10"), "listBranchesLimit"))
                  .page(blankToNull(config.value("listBranchesPage", "")))
                  .sortBy(ListGitBranchesRequest.SortBy.create(config.value("listBranchesSortBy", "displayName")))
                  .sortOrder(SortOrder.create(config.value("listBranchesSortOrder", "ASC")))
                  .opcRequestId(requestId("list-git-branches"))
                  .build());

      assertSuccessful(response.get__httpStatusCode__());
      assertNotNull(response.getGitBranchCollection());
      assertNotNull(response.getGitBranchCollection().getItems());
    } catch (BmcException e) {
      assertAllowedLiveGitState(e);
    }
  }

  @Test(
      groups = {"sdk_tests", "sdk_git", "git", "git_release", "rel_validation"},
      dependsOnMethods = {"checkoutBranch"},
      priority = 21)
  public void getGitDiffDetail() {
    try {
      ensureGitWorktreeChange();
      String gitFilePath = config.value("gitDiffGitFilePath", changedGitFileName);
      GetGitDiffDetailResponse response =
          gitClient.getGitDiffDetail(
              GetGitDiffDetailRequest.builder()
                  .aiDataPlatformId(aiDataPlatformId)
                  .workspaceKey(workspaceKey)
                  .gitRepositoryKey(requireGitRepositoryKey())
                  .gitFolderPath(gitFolderPath())
                  .branchName(branchName())
                  .gitFilePath(gitFilePath)
                  .contextLines(parsePositiveInt(config.value("gitDiffContextLines", "3"), "gitDiffContextLines"))
                  .maxPatchBytes(parsePositiveInt(config.value("gitDiffMaxPatchBytes", "1048576"), "gitDiffMaxPatchBytes"))
                  .opcRequestId(requestId("get-git-diff-detail"))
                  .build());

      assertSuccessful(response.get__httpStatusCode__());
      assertNotNull(response.getGitDiffDetail());
    } catch (BmcException e) {
      assertAllowedLiveGitState(e);
    }
  }

  @Test(groups = {"sdk_tests", "sdk_git", "git", "git_release", "rel_validation"}, priority = 2)
  public void getGitOperationState() {
    try {
      GetGitOperationStateResponse response =
          gitClient.getGitOperationState(
              GetGitOperationStateRequest.builder()
                  .aiDataPlatformId(aiDataPlatformId)
                  .workspaceKey(workspaceKey)
                  .gitRepositoryKey(requireGitRepositoryKey())
                  .operationName(blankToNull(config.value("gitOperationStateOperationName", "")))
                  .branchName(blankToNull(config.value("gitOperationStateBranchName", "")))
                  .opcRequestId(requestId("get-git-operation"))
                  .build());

      assertSuccessful(response.get__httpStatusCode__());
      assertNotNull(response.getOpcRequestId());
    } catch (BmcException e) {
      assertAllowedLiveGitState(e);
    }
  }

  @Test(
      groups = {"sdk_tests", "sdk_git", "git", "git_release", "rel_validation"},
      dependsOnMethods = {"checkoutBranch"},
      priority = 20)
  public void listGitDiffs() {
    try {
      ensureGitWorktreeChange();
      ListGitDiffsResponse response =
          gitClient.listGitDiffs(
              ListGitDiffsRequest.builder()
                  .aiDataPlatformId(aiDataPlatformId)
                  .workspaceKey(workspaceKey)
                  .gitRepositoryKey(requireGitRepositoryKey())
                  .gitFolderPath(gitFolderPath())
                  .branchName(branchName())
                  .compareTo(
                      ListGitDiffsRequest.CompareTo.create(config.value("gitDiffListCompareTo", "HEAD")))
                  .filter(ListGitDiffsRequest.Filter.create(config.value("gitDiffListFilter", "ALL")))
                  .limit(parsePositiveInt(config.value("gitDiffListLimit", "25"), "gitDiffListLimit"))
                  .page(blankToNull(config.value("gitDiffListPage", "")))
                  .sortBy(ListGitDiffsRequest.SortBy.create(config.value("gitDiffListSortBy", "timeCreated")))
                  .sortOrder(SortOrder.create(config.value("gitDiffListSortOrder", "DESC")))
                  .displayName(blankToNull(config.value("gitDiffListDisplayName", "")))
                  .opcRequestId(requestId("list-git-diffs"))
                  .build());

      assertSuccessful(response.get__httpStatusCode__());
      assertNotNull(response.getGitDiffSummaryCollection());
      assertNotNull(response.getGitDiffSummaryCollection().getItems());
    } catch (BmcException e) {
      assertAllowedLiveGitState(e);
    }
  }

  @Test(
      groups = {"sdk_tests", "sdk_git", "git", "git_release", "rel_validation"},
      dependsOnMethods = {"createGitBranch"},
      priority = 11)
  public void checkoutBranch() {
    try {
      CheckoutBranchResponse response =
          gitClient.checkoutBranch(
              CheckoutBranchRequest.builder()
                  .aiDataPlatformId(aiDataPlatformId)
                  .workspaceKey(workspaceKey)
                  .gitRepositoryKey(requireGitRepositoryKey())
                  .checkoutBranchDetails(
                      CheckoutBranchDetails.builder()
                          .branchName(branchName())
                          .gitFolderPath(gitFolderPath())
                          .build())
                  .opcRetryToken(requestId("checkout-git-branch"))
                  .opcRequestId(requestId("checkout-git-branch"))
                  .shouldUpdateRecent(false)
                  .build());

      assertSuccessful(response.get__httpStatusCode__());
      assertNotNull(response.getOpcRequestId());
    } catch (BmcException e) {
      assertAllowedLiveGitState(e);
    }
  }

  @Test(groups = {"sdk_tests", "sdk_git", "git", "git_release", "rel_validation"}, priority = 10)
  public void createGitBranch() {
    try {
      CreateGitBranchResponse response =
          gitClient.createGitBranch(
              CreateGitBranchRequest.builder()
                  .aiDataPlatformId(aiDataPlatformId)
                  .workspaceKey(workspaceKey)
                  .gitRepositoryKey(requireGitRepositoryKey())
                  .createGitBranchDetails(
                      CreateGitBranchDetails.builder()
                          .gitBranchName(testBranchName)
                          .gitFolderPath(gitFolderPath())
                          .build())
                  .opcRetryToken(requestId("create-git-branch"))
                  .opcRequestId(requestId("create-git-branch"))
                  .shouldUpdateRecent(false)
                  .build());

      assertSuccessful(response.get__httpStatusCode__());
      assertNotNull(response.getOpcRequestId());
    } catch (BmcException e) {
      assertAllowedLiveGitState(e);
    }
  }

  @Test(
      groups = {"sdk_tests", "sdk_git", "git", "git_release", "rel_validation"},
      dependsOnMethods = {"getGitDiffDetail"},
      priority = 30)
  public void commitPushGitRepository() {
    try {
      ensureGitWorktreeChange();
      CommitPushGitRepositoryResponse response =
          gitClient.commitPushGitRepository(
              CommitPushGitRepositoryRequest.builder()
                  .aiDataPlatformId(aiDataPlatformId)
                  .workspaceKey(workspaceKey)
                  .gitRepositoryKey(requireGitRepositoryKey())
                  .commitPushDetails(
                      CommitPushDetails.builder()
                          .gitFolderPath(gitFolderPath())
                          .branchName(branchName())
                          .files(csv(config.value("commitPushFilesCsv", changedGitFileName)))
                          .commitMessage(config.value("commitPushMessage", "SDK validation commit " + shortId()))
                          .commitDescription(blankToNull(config.value("commitPushDescription", "")))
                          .build())
                  .opcRetryToken(requestId("commit-push-git"))
                  .opcRequestId(requestId("commit-push-git"))
                  .shouldUpdateRecent(false)
                  .build());

      assertSuccessful(response.get__httpStatusCode__());
      assertNotNull(response.getOpcRequestId());
    } catch (BmcException e) {
      assertAllowedLiveGitState(e);
    }
  }

  @Test(
      groups = {"sdk_tests", "sdk_git", "git", "git_release", "rel_validation"},
      dependsOnMethods = {"commitPushGitRepository"},
      priority = 40)
  public void mergeGitRepository() {
    try {
      MergeGitRepositoryResponse response =
          gitClient.mergeGitRepository(
              MergeGitRepositoryRequest.builder()
                  .aiDataPlatformId(aiDataPlatformId)
                  .workspaceKey(workspaceKey)
                  .gitRepositoryKey(requireGitRepositoryKey())
                  .gitMergeDetails(
                      GitMergeDetails.builder()
                          .gitFolderPath(gitFolderPath())
                          .branchName(branchName())
                          .remoteBranchName(config.value("gitMergeRemoteBranchName", baseBranchName()))
                          .commitId(blankToNull(config.value("gitMergeCommitId", "")))
                          .build())
                  .opcRetryToken(requestId("merge-git-repo"))
                  .opcRequestId(requestId("merge-git-repo"))
                  .shouldUpdateRecent(false)
                  .build());

      assertSuccessful(response.get__httpStatusCode__());
      assertNotNull(response.getOpcRequestId());
    } catch (BmcException e) {
      assertAllowedLiveGitState(e);
    }
  }

  @Test(
      groups = {"sdk_tests", "sdk_git", "git", "git_release", "rel_validation"},
      dependsOnMethods = {"commitPushGitRepository"},
      priority = 41)
  public void pullGitRepository() {
    try {
      PullGitRepositoryResponse response =
          gitClient.pullGitRepository(
              PullGitRepositoryRequest.builder()
                  .aiDataPlatformId(aiDataPlatformId)
                  .workspaceKey(workspaceKey)
                  .gitRepositoryKey(requireGitRepositoryKey())
                  .gitPullDetails(
                      GitPullDetails.builder()
                          .gitFolderPath(gitFolderPath())
                          .branchName(branchName())
                          .remoteBranchName(blankToNull(config.value("gitPullRemoteBranchName", "")))
                          .pullAction(
                              GitPullDetails.PullAction.create(config.value("gitPullPullAction", "PULL")))
                          .commitMessage(blankToNull(config.value("gitPullCommitMessage", "")))
                          .build())
                  .opcRetryToken(requestId("pull-git-repo"))
                  .opcRequestId(requestId("pull-git-repo"))
                  .shouldUpdateRecent(false)
                  .build());

      assertSuccessful(response.get__httpStatusCode__());
      assertNotNull(response.getOpcRequestId());
    } catch (BmcException e) {
      assertAllowedLiveGitState(e);
    }
  }

  @Test(
      groups = {"sdk_tests", "sdk_git", "git", "git_release", "rel_validation"},
      dependsOnMethods = {"pullGitRepository"},
      priority = 42)
  public void rebaseGitRepository() {
    try {
      RebaseGitRepositoryResponse response =
          gitClient.rebaseGitRepository(
              RebaseGitRepositoryRequest.builder()
                  .aiDataPlatformId(aiDataPlatformId)
                  .workspaceKey(workspaceKey)
                  .gitRepositoryKey(requireGitRepositoryKey())
                  .gitRebaseDetails(
                      GitRebaseDetails.builder()
                          .gitFolderPath(gitFolderPath())
                          .branchName(branchName())
                          .remoteBranchName(config.value("gitRebaseRemoteBranchName", baseBranchName()))
                          .commitId(blankToNull(config.value("gitRebaseCommitId", "")))
                          .build())
                  .opcRetryToken(requestId("rebase-git-repo"))
                  .opcRequestId(requestId("rebase-git-repo"))
                  .shouldUpdateRecent(false)
                  .build());

      assertSuccessful(response.get__httpStatusCode__());
      assertNotNull(response.getOpcRequestId());
    } catch (BmcException e) {
      assertAllowedLiveGitState(e);
    }
  }

  @Test(
      groups = {"sdk_tests", "sdk_git", "git", "git_release", "rel_validation"},
      dependsOnMethods = {"pullGitRepository"},
      priority = 43)
  public void resetGitRepository() {
    try {
      ResetGitRepositoryResponse response =
          gitClient.resetGitRepository(
              ResetGitRepositoryRequest.builder()
                  .aiDataPlatformId(aiDataPlatformId)
                  .workspaceKey(workspaceKey)
                  .gitRepositoryKey(requireGitRepositoryKey())
                  .gitResetDetails(
                      GitResetDetails.builder()
                          .gitFolderPath(gitFolderPath())
                          .branchName(branchName())
                          .commitId(blankToNull(config.value("gitResetCommitId", "HEAD")))
                          .resetMode(
                              GitResetDetails.ResetMode.create(config.value("gitResetMode", "SOFT")))
                          .build())
                  .opcRetryToken(requestId("reset-git-repo"))
                  .opcRequestId(requestId("reset-git-repo"))
                  .shouldUpdateRecent(false)
                  .build());

      assertSuccessful(response.get__httpStatusCode__());
      assertNotNull(response.getOpcRequestId());
    } catch (BmcException e) {
      assertAllowedLiveGitState(e);
    }
  }

  @Test(
      groups = {"sdk_tests", "sdk_git", "git", "git_release", "rel_validation"},
      dependsOnMethods = {"commitPushGitRepository"},
      priority = 44)
  public void resetGitFolderState() {
    try {
      ResetGitFolderStateResponse response =
          gitClient.resetGitFolderState(
              ResetGitFolderStateRequest.builder()
                  .aiDataPlatformId(aiDataPlatformId)
                  .workspaceKey(workspaceKey)
                  .gitRepositoryKey(requireGitRepositoryKey())
                  .resetGitFolderStateDetails(
                      ResetGitFolderStateDetails.builder()
                          .action(
                              ResetGitFolderStateDetails.Action.create(
                                  config.value("gitResetStateAction", "DISCARD")))
                          .discardPaths(csv(config.value("gitResetStateDiscardPathsCsv", "")))
                          .canIncludeIgnored(parseBoolean(config.value("gitResetStateCanIncludeIgnored", "false")))
                          .build())
                  .opcRetryToken(requestId("reset-git-state"))
                  .opcRequestId(requestId("reset-git-state"))
                  .build());

      assertSuccessful(response.get__httpStatusCode__());
      assertNotNull(response.getOpcRequestId());
    } catch (BmcException e) {
      assertAllowedLiveGitState(e);
    }
  }

  @Test(
      groups = {"sdk_tests", "sdk_git", "git", "git_release", "rel_validation"},
      dependsOnMethods = {"resetGitFolderState"},
      priority = 45)
  public void resolveGitConflicts() {
    List<String> files = csv(config.value("gitResolveConflictsFilesCsv", changedGitFileName));
    try {
      ResolveGitConflictsResponse response =
          gitClient.resolveGitConflicts(
              ResolveGitConflictsRequest.builder()
                  .aiDataPlatformId(aiDataPlatformId)
                  .workspaceKey(workspaceKey)
                  .gitRepositoryKey(requireGitRepositoryKey())
                  .conflictResolveDetails(
                      ConflictResolveDetails.builder()
                          .files(files)
                          .action(
                              ConflictResolveDetails.Action.create(
                                  config.value("gitResolveConflictsAction", "MARK_RESOLVED")))
                          .build())
                  .opcRetryToken(requestId("resolve-git-conflict"))
                  .opcRequestId(requestId("resolve-git-conflict"))
                  .build());

      assertSuccessful(response.get__httpStatusCode__());
      assertNotNull(response.getOpcRequestId());
    } catch (BmcException e) {
      assertAllowedLiveGitState(e);
    }
  }

  @Test(
      groups = {"sdk_tests", "sdk_git", "git", "git_release", "rel_validation"},
      dependsOnMethods = {"getGitRepository"},
      priority = 12)
  public void updateGitRepository() {
    try {
      UpdateGitRepositoryResponse response =
          gitClient.updateGitRepository(
              UpdateGitRepositoryRequest.builder()
                  .aiDataPlatformId(aiDataPlatformId)
                  .workspaceKey(workspaceKey)
                  .gitRepositoryKey(requireGitRepositoryKey())
                  .updateGitRepositoryDetails(
                      UpdateGitRepositoryDetails.builder()
                          .gitFolderPath(config.value("gitUpdateGitFolderPath", gitFolderPath()))
                          .gitUrl(blankToNull(config.value("gitUpdateGitUrl", config.gitRepositoryUrl())))
                          .credentialKey(blankToNull(config.value("gitUpdateCredentialKey", config.gitCredentialKey())))
                          .build())
                  .opcRequestId(requestId("update-git-repo"))
                  .build());

      assertSuccessful(response.get__httpStatusCode__());
      assertNotNull(response.getOpcRequestId());
    } catch (BmcException e) {
      assertAllowedLiveGitState(e);
    }
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() {
    try {
      if (gitFixture != null) {
        gitFixture.close();
      }
    } finally {
      if (workspaceObjectClient != null) {
        workspaceObjectClient.close();
      }
      if (gitClient != null) {
        gitClient.close();
      }
    }
  }

  private String requireGitRepositoryKey() {
    if (isBlank(gitRepositoryKey)) {
      throw new IllegalStateException("No Git repository key was created or configured.");
    }
    return gitRepositoryKey;
  }

  private String gitFolderPath() {
    return gitFolderPath;
  }

  private String branchName() {
    return testBranchName;
  }

  private String baseBranchName() {
    String value = config.value("checkoutBranchName", config.gitBranchName());
    if (isBlank(value)) {
      throw new IllegalStateException("No Git branch was configured for SDK Git tests.");
    }
    return value;
  }

  private String defaultGitFolderPath() {
    String configuredPath = config.value("gitFolderPath", config.gitFolderPath());
    if (!isBlank(configuredPath)) {
      return configuredPath;
    }
    return "sdk_git_" + shortId();
  }

  private void ensureGitWorktreeChange() {
    if (!isBlank(changedGitFilePath)) {
      return;
    }
    changedGitFileName = "sdk_it_change_" + shortId() + ".txt";
    changedGitFilePath = gitFolderPath() + "/" + changedGitFileName;
    byte[] content =
        ("SDK Git validation change " + UUID.randomUUID() + "\n").getBytes(StandardCharsets.UTF_8);
    CreateWorkspaceObjectResponse response =
        workspaceObjectClient.createWorkspaceObject(
            CreateWorkspaceObjectRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .path(changedGitFilePath)
                .type("FILE")
                .createWorkspaceObjectDetails(new ByteArrayInputStream(content))
                .isOverwrite(true)
                .shouldUpdateRecent(false)
                .opcRetryToken(requestId("git-file-create-retry"))
                .opcRequestId(requestId("git-file-create"))
                .build());
    assertSuccessful(response.get__httpStatusCode__());
  }

  private void assertAllowedLiveGitState(BmcException e) {
    int status = e.getStatusCode();
    if (status == 400 || status == 404 || status == 409 || status == 422 || status == 500) {
      return;
    }
    throw e;
  }

  private static List<String> csv(String value) {
    if (isBlank(value)) {
      return List.of();
    }
    return Arrays.stream(value.split(","))
        .map(String::trim)
        .filter(item -> !item.isEmpty())
        .collect(Collectors.toList());
  }

  private static String blankToNull(String value) {
    return isBlank(value) ? null : value;
  }

  private static Boolean parseBoolean(String value) {
    if ("true".equalsIgnoreCase(value) || "false".equalsIgnoreCase(value)) {
      return Boolean.parseBoolean(value);
    }
    throw new IllegalArgumentException("Boolean value must be true or false: " + value);
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

  private static String shortId() {
    return UUID.randomUUID().toString().replace("-", "").substring(0, 12);
  }

  private static boolean isBlank(String value) {
    return value == null || value.isBlank();
  }
}
