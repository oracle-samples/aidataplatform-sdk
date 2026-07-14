package com.oracle.aidp.sdk.workspaceobject;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;

import com.oracle.aidp.sdk.client.SdkClients;
import com.oracle.aidp.sdk.config.SdkTestConfig;
import com.oracle.aidp.sdk.support.SdkTestResources;
import com.oracle.aidp.sdk.support.SdkTestSupport;
import com.oracle.aidataplatform.dp.WorkspaceObjectClient;
import com.oracle.aidataplatform.dp.model.AssignWorkspaceObjectPermissionDetails;
import com.oracle.aidataplatform.dp.model.CopyWorkspaceObjectDetails;
import com.oracle.aidataplatform.dp.model.DownloadFileWithParResult;
import com.oracle.aidataplatform.dp.model.GranteeType;
import com.oracle.aidataplatform.dp.model.ManageWorkspaceObjectPermissionDetails;
import com.oracle.aidataplatform.dp.model.MoveWorkspaceObjectDetails;
import com.oracle.aidataplatform.dp.model.PermissionAssignees;
import com.oracle.aidataplatform.dp.model.RenameWorkspaceObjectDetails;
import com.oracle.aidataplatform.dp.model.SortOrder;
import com.oracle.aidataplatform.dp.model.UploadFileWithParDetails;
import com.oracle.aidataplatform.dp.model.UploadFileWithParResult;
import com.oracle.aidataplatform.dp.model.WorkspaceObjectDetails;
import com.oracle.aidataplatform.dp.model.WorkspaceObjectPrivilege;
import com.oracle.aidataplatform.dp.requests.CopyWorkspaceObjectRequest;
import com.oracle.aidataplatform.dp.requests.CreateWorkspaceObjectRequest;
import com.oracle.aidataplatform.dp.requests.DeleteWorkspaceObjectRequest;
import com.oracle.aidataplatform.dp.requests.DownloadWorkspaceObjectWithParRequest;
import com.oracle.aidataplatform.dp.requests.GetWorkspaceObjectRequest;
import com.oracle.aidataplatform.dp.requests.HeadWorkspaceObjectRequest;
import com.oracle.aidataplatform.dp.requests.ListWorkspaceObjectPermissionsRequest;
import com.oracle.aidataplatform.dp.requests.ListWorkspaceObjectsRequest;
import com.oracle.aidataplatform.dp.requests.ManageWorkspaceObjectPermissionRequest;
import com.oracle.aidataplatform.dp.requests.MoveWorkspaceObjectRequest;
import com.oracle.aidataplatform.dp.requests.RenameWorkspaceObjectRequest;
import com.oracle.aidataplatform.dp.requests.UpdateWorkspaceObjectRequest;
import com.oracle.aidataplatform.dp.requests.UploadWorkspaceObjectWithParRequest;
import com.oracle.aidataplatform.dp.responses.CopyWorkspaceObjectResponse;
import com.oracle.aidataplatform.dp.responses.CreateWorkspaceObjectResponse;
import com.oracle.aidataplatform.dp.responses.DeleteWorkspaceObjectResponse;
import com.oracle.aidataplatform.dp.responses.DownloadWorkspaceObjectWithParResponse;
import com.oracle.aidataplatform.dp.responses.GetWorkspaceObjectResponse;
import com.oracle.aidataplatform.dp.responses.HeadWorkspaceObjectResponse;
import com.oracle.aidataplatform.dp.responses.ListWorkspaceObjectPermissionsResponse;
import com.oracle.aidataplatform.dp.responses.ListWorkspaceObjectsResponse;
import com.oracle.aidataplatform.dp.responses.ManageWorkspaceObjectPermissionResponse;
import com.oracle.aidataplatform.dp.responses.MoveWorkspaceObjectResponse;
import com.oracle.aidataplatform.dp.responses.RenameWorkspaceObjectResponse;
import com.oracle.aidataplatform.dp.responses.UpdateWorkspaceObjectResponse;
import com.oracle.aidataplatform.dp.responses.UploadWorkspaceObjectWithParResponse;
import com.oracle.bmc.model.BmcException;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.UUID;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WorkspaceObjectSdkIT {
  private SdkTestConfig config;
  private WorkspaceObjectClient workspaceObjectClient;
  private String aiDataPlatformId;
  private String workspaceKey;
  private String createdObjectPath;
  private String createdObjectKey;
  private String copiedObjectPath;
  private String copiedObjectKey;
  private String movedObjectPath;
  private String renamedObjectPath;
  private boolean createdObjectDeleted;
  private boolean copiedObjectDeleted;

  @BeforeClass(
      alwaysRun = true,
      groups = {"sdk_tests", "sdk_workspace_object", "workspace_object", "rel_validation"})
  public void setUp() throws Exception {
    config = SdkTestConfig.load();
    aiDataPlatformId = config.value("aidpInstanceId", config.required("dataHubId"));
    workspaceKey = SdkTestResources.ensureSharedWorkspace(config);
    assertFalse(aiDataPlatformId.isBlank(), "aiDataPlatformId must be configured");
    assertFalse(workspaceKey == null || workspaceKey.isBlank(), "SDK_Test_WS workspace must be available");
    workspaceObjectClient = SdkClients.workspaceObjectClient(config);
  }

  @Test(
      groups = {"sdk_tests", "sdk_workspace_object", "workspace_object", "rel_validation"},
      priority = 10)
  public void createWorkspaceObject() {
    String type = firstNonBlank(config.value("createWorkspaceObjectType", ""), "FILE");
    String path = normalizeWorkspacePath(config.value("createWorkspaceObjectPath", ""));
    if (isBlank(path)) {
      path = defaultCreatePath(type);
    }

    byte[] body =
        "FOLDER".equalsIgnoreCase(type)
            ? new byte[0]
            : config.value(
                    "createWorkspaceObjectContentText",
                    "sdk workspace object live test file content")
                .getBytes(StandardCharsets.UTF_8);
    if (Boolean.TRUE.equals(optionalBoolean("createWorkspaceObjectIsBase64Encoded"))) {
      body = Base64.getEncoder().encode(body);
    }

    CreateWorkspaceObjectResponse response =
        workspaceObjectClient.createWorkspaceObject(
            CreateWorkspaceObjectRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .createWorkspaceObjectDetails(new ByteArrayInputStream(body))
                .path(path)
                .type(type)
                .objectDescription(blankToNull(config.value("createWorkspaceObjectDescription", "")))
                .isOverwrite(optionalBoolean("createWorkspaceObjectIsOverwrite"))
                .isUploadFileBase64Encoded(optionalBoolean("createWorkspaceObjectIsBase64Encoded"))
                .opcRetryToken(
                    firstNonBlank(
                        config.value("createWorkspaceObjectRetryToken", ""),
                        "workspace-object-create-it-" + UUID.randomUUID()))
                .shouldUpdateRecent(optionalBoolean("createWorkspaceObjectShouldUpdateRecent"))
                .opcRequestId(SdkTestSupport.requestId("wso-create"))
                .build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
    createdObjectPath = firstNonBlank(response.getPath(), path);
    createdObjectKey = firstNonBlank(response.getObjectKey(), createdObjectPath);
  }

  @Test(
      groups = {"sdk_tests", "sdk_workspace_object", "workspace_object", "rel_validation"},
      priority = 20)
  public void listWorkspaceObjects() {
    String path =
        firstNonBlank(
            config.value("listWorkspaceObjectsPath", ""),
            config.value("workspaceObjectRootPath", "Shared"));

    ListWorkspaceObjectsResponse response =
        workspaceObjectClient.listWorkspaceObjects(
            ListWorkspaceObjectsRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .path(blankToNull(normalizeWorkspacePath(path)))
                .type(blankToNull(config.value("listWorkspaceObjectsType", "")))
                .displayName(blankToNull(config.value("listWorkspaceObjectsDisplayName", "")))
                .limit(
                    parsePositiveInt(
                        config.value("listWorkspaceObjectsLimit", "50"),
                        "listWorkspaceObjectsLimit"))
                .metadataKeys(blankToNull(config.value("listWorkspaceObjectsMetadataKeys", "")))
                .page(blankToNull(config.value("listWorkspaceObjectsPage", "")))
                .sortBy(workspaceObjectSortBy(config.value("listWorkspaceObjectsSortBy", "")))
                .sortOrder(sortOrder(config.value("listWorkspaceObjectsSortOrder", "")))
                .shouldUpdateRecent(optionalBoolean("listWorkspaceObjectsShouldUpdateRecent"))
                .opcRequestId(SdkTestSupport.requestId("wso-list"))
                .build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
    assertNotNull(response.getWorkspaceObjectCollection(), "workspace object collection should be present");
  }

  @Test(
      groups = {"sdk_tests", "sdk_workspace_object", "workspace_object", "rel_validation"},
      priority = 30)
  public void getWorkspaceObjectDetails() {
    String path = targetPath(config.value("getWorkspaceObjectDetailsPath", ""));
    if (isBlank(path)) {
      throw new SkipException("No path available for getWorkspaceObjectDetails");
    }

    GetWorkspaceObjectResponse response =
        workspaceObjectClient.getWorkspaceObject(
            GetWorkspaceObjectRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .objectPath(path)
                .shouldIncludeMetadata(optionalBoolean("getWorkspaceObjectDetailsShouldIncludeMetadata"))
                .shouldUpdateRecent(optionalBoolean("getWorkspaceObjectDetailsShouldUpdateRecent"))
                .opcRequestId(SdkTestSupport.requestId("wso-get"))
                .build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
    createdObjectKey = firstNonBlank(createdObjectKey, response.getObjectKey());
  }

  @Test(
      groups = {"sdk_tests", "sdk_workspace_object", "workspace_object", "rel_validation"},
      priority = 40)
  public void getWorkspaceObjectSummaryMetadata() {
    String path = targetPath(config.value("headWorkspaceObjectPath", ""));
    if (isBlank(path)) {
      throw new SkipException("No path available for getWorkspaceObjectSummaryMetadata");
    }

    HeadWorkspaceObjectResponse response =
        workspaceObjectClient.headWorkspaceObject(
            HeadWorkspaceObjectRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .objectPath(path)
                .shouldIncludeMetadata(optionalBoolean("headWorkspaceObjectShouldIncludeMetadata"))
                .shouldUpdateRecent(optionalBoolean("headWorkspaceObjectShouldUpdateRecent"))
                .opcRequestId(SdkTestSupport.requestId("wso-head"))
                .build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
    createdObjectKey = firstNonBlank(createdObjectKey, response.getObjectKey());
  }

  @Test(
      groups = {"sdk_tests", "sdk_workspace_object", "workspace_object", "rel_validation"},
      priority = 50)
  public void listWorkspaceObjectPermissions() {
    String objectKey =
        firstNonBlank(
            config.value("listWorkspaceObjectPermissionsObjectKey", ""),
            createdObjectKey,
            targetPath(""));
    if (isBlank(objectKey)) {
      throw new SkipException("No object key available for listWorkspaceObjectPermissions");
    }

    ListWorkspaceObjectPermissionsResponse response =
        workspaceObjectClient.listWorkspaceObjectPermissions(
            ListWorkspaceObjectPermissionsRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .objectKey(objectKey)
                .limit(
                    parsePositiveInt(
                        config.value("listWorkspaceObjectPermissionsLimit", "50"),
                        "listWorkspaceObjectPermissionsLimit"))
                .page(blankToNull(config.value("listWorkspaceObjectPermissionsPage", "")))
                .sortBy(
                    workspaceObjectPermissionSortBy(
                        config.value("listWorkspaceObjectPermissionsSortBy", "")))
                .sortOrder(sortOrder(config.value("listWorkspaceObjectPermissionsSortOrder", "")))
                .opcRequestId(SdkTestSupport.requestId("wso-perms"))
                .build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
    assertNotNull(response.getWorkspaceObjectPermissionCollection(), "permission collection should be present");
  }

  @Test(
      groups = {"sdk_tests", "sdk_workspace_object", "workspace_object", "rel_validation"},
      priority = 60)
  public void copyWorkspaceObject() {
    CopyWorkspaceObjectDetails details = copyWorkspaceObjectDetails();
    CopyWorkspaceObjectResponse response =
        workspaceObjectClient.copyWorkspaceObject(
            CopyWorkspaceObjectRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .copyWorkspaceObjectDetails(details)
                .ifMatch(blankToNull(config.value("copyWorkspaceObjectIfMatch", "")))
                .shouldUpdateRecent(optionalBoolean("copyWorkspaceObjectShouldUpdateRecent"))
                .opcRequestId(SdkTestSupport.requestId("wso-copy"))
                .build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
    rememberCopied(details.getToPath(), response.getWorkspaceObjectDetails());
  }

  @Test(
      groups = {"sdk_tests", "sdk_workspace_object", "workspace_object", "rel_validation"},
      priority = 70)
  public void moveWorkspaceObject() {
    MoveWorkspaceObjectDetails details = moveWorkspaceObjectDetails();
    MoveWorkspaceObjectResponse response =
        workspaceObjectClient.moveWorkspaceObject(
            MoveWorkspaceObjectRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .moveWorkspaceObjectDetails(details)
                .ifMatch(blankToNull(config.value("moveWorkspaceObjectIfMatch", "")))
                .shouldUpdateRecent(optionalBoolean("moveWorkspaceObjectShouldUpdateRecent"))
                .opcRequestId(SdkTestSupport.requestId("wso-move"))
                .build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
    if (response.getWorkspaceObjectDetails() != null) {
      movedObjectPath = response.getWorkspaceObjectDetails().getPath();
    }
  }

  @Test(
      groups = {"sdk_tests", "sdk_workspace_object", "workspace_object", "rel_validation"},
      priority = 80)
  public void renameWorkspaceObject() {
    RenameWorkspaceObjectDetails details = renameWorkspaceObjectDetails();
    RenameWorkspaceObjectResponse response =
        workspaceObjectClient.renameWorkspaceObject(
            RenameWorkspaceObjectRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .renameWorkspaceObjectDetails(details)
                .ifMatch(blankToNull(config.value("renameWorkspaceObjectIfMatch", "")))
                .shouldUpdateRecent(optionalBoolean("renameWorkspaceObjectShouldUpdateRecent"))
                .opcRequestId(SdkTestSupport.requestId("wso-rename"))
                .build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
    if (response.getWorkspaceObjectDetails() != null) {
      renamedObjectPath = response.getWorkspaceObjectDetails().getPath();
    }
  }

  @Test(
      groups = {"sdk_tests", "sdk_workspace_object", "workspace_object", "rel_validation"},
      priority = 90)
  public void updateWorkspaceObject() {
    String path = targetPath(config.value("updateWorkspaceObjectPath", ""));
    if (isBlank(path)) {
      throw new SkipException("No path available for updateWorkspaceObject");
    }

    byte[] body =
        config.value("updateWorkspaceObjectContentText", "sdk workspace object updated content")
            .getBytes(StandardCharsets.UTF_8);
    UpdateWorkspaceObjectResponse response =
        workspaceObjectClient.updateWorkspaceObject(
            UpdateWorkspaceObjectRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .objectPath(path)
                .updateWorkspaceObjectDetails(new ByteArrayInputStream(body))
                .objectDescription(blankToNull(config.value("updateWorkspaceObjectDescription", "")))
                .ifMatch(blankToNull(config.value("updateWorkspaceObjectIfMatch", "")))
                .shouldUpdateRecent(optionalBoolean("updateWorkspaceObjectShouldUpdateRecent"))
                .opcRequestId(SdkTestSupport.requestId("wso-update"))
                .build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
    createdObjectKey = firstNonBlank(createdObjectKey, response.getObjectKey());
  }

  @Test(
      groups = {"sdk_tests", "sdk_workspace_object", "workspace_object", "rel_validation"},
      priority = 100)
  public void manageWorkspaceObjectPermission() {
    String objectKey =
        firstNonBlank(
            config.value("manageWorkspaceObjectPermissionObjectKey", ""),
            createdObjectKey,
            targetPath(""));
    if (isBlank(objectKey)) {
      throw new SkipException("No object key available for manageWorkspaceObjectPermission");
    }
    String assignee = permissionTarget("manageWorkspaceObjectPermissionDefaultAssignee");
    if (isBlank(assignee)) {
      throw new SkipException(
          "Set manageWorkspaceObjectPermissionDefaultAssignee or sdkWorkspacePermissionTarget to run manageWorkspaceObjectPermission");
    }

    ManageWorkspaceObjectPermissionResponse response =
        workspaceObjectClient.manageWorkspaceObjectPermission(
            ManageWorkspaceObjectPermissionRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .objectKey(objectKey)
                .manageWorkspaceObjectPermissionDetails(
                    manageWorkspaceObjectPermissionDetails(assignee))
                .ifMatch(blankToNull(config.value("manageWorkspaceObjectPermissionIfMatch", "")))
                .opcRequestId(SdkTestSupport.requestId("wso-manage-perm"))
                .build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
  }

  @Test(
      groups = {"sdk_tests", "sdk_workspace_object", "workspace_object", "rel_validation"},
      priority = 110)
  public void uploadWorkspaceFileMeta() {
    String path = targetPath(config.value("uploadWorkspaceFileMetaPath", ""));
    if (isBlank(path)) {
      throw new SkipException("No path available for uploadWorkspaceFileMeta");
    }

    UploadWorkspaceObjectWithParResponse response;
    try {
      response =
          workspaceObjectClient.uploadWorkspaceObjectWithPar(
              UploadWorkspaceObjectWithParRequest.builder()
                  .aiDataPlatformId(aiDataPlatformId)
                  .workspaceKey(workspaceKey)
                  .path(path)
                  .type(firstNonBlank(config.value("uploadWorkspaceFileMetaType", ""), "FILE"))
                  .objectDescription(blankToNull(config.value("uploadWorkspaceFileMetaObjectDescription", "")))
                  .uploadFileWithParDetails(uploadFileWithParDetails("uploadWorkspaceFileMeta"))
                  .isOverwrite(optionalBoolean("uploadWorkspaceFileMetaIsOverwrite"))
                  .shouldGenerateNewPar(optionalBoolean("uploadWorkspaceFileMetaShouldGenerateNewPar"))
                  .shouldUpdateRecent(optionalBoolean("uploadWorkspaceFileMetaShouldUpdateRecent"))
                  .opcRetryToken(blankToNull(config.value("uploadWorkspaceFileMetaRetryToken", "")))
                  .opcRequestId(SdkTestSupport.requestId("wso-upload-par"))
                  .build());
    } catch (BmcException e) {
      if (isParUnsupported(e)) {
        throw new SkipException("UploadWorkspaceObjectWithPar is not allowed in this live QA tenancy.", e);
      }
      throw e;
    }
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
    UploadFileWithParResult result = response.getUploadFileWithParResult();
    assertFalse(result == null || bothBlank(result.getLocationUri(), result.getParUrl()));
  }

  @Test(
      groups = {"sdk_tests", "sdk_workspace_object", "workspace_object", "rel_validation"},
      priority = 120)
  public void downloadWorkspaceFileMeta() {
    String path = targetPath(config.value("downloadWorkspaceFileMetaPath", ""));
    if (isBlank(path)) {
      throw new SkipException("No path available for downloadWorkspaceFileMeta");
    }

    DownloadWorkspaceObjectWithParResponse response;
    try {
      response =
          workspaceObjectClient.downloadWorkspaceObjectWithPar(
              DownloadWorkspaceObjectWithParRequest.builder()
                  .aiDataPlatformId(aiDataPlatformId)
                  .workspaceKey(workspaceKey)
                  .path(path)
                  .type(firstNonBlank(config.value("downloadWorkspaceFileMetaType", ""), "FILE"))
                  .shouldGenerateNewPar(optionalBoolean("downloadWorkspaceFileMetaShouldGenerateNewPar"))
                  .shouldUpdateRecent(optionalBoolean("downloadWorkspaceFileMetaShouldUpdateRecent"))
                  .opcRetryToken(blankToNull(config.value("downloadWorkspaceFileMetaRetryToken", "")))
                  .opcRequestId(SdkTestSupport.requestId("wso-download-par"))
                  .build());
    } catch (BmcException e) {
      if (isParUnsupported(e) || isNotFound(e)) {
        throw new SkipException("DownloadWorkspaceObjectWithPar is unavailable for this live QA object.", e);
      }
      throw e;
    }
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
    DownloadFileWithParResult result = response.getDownloadFileWithParResult();
    assertFalse(result == null || bothBlank(result.getLocationUri(), result.getParUrl()));
  }

  @Test(
      groups = {"sdk_tests", "sdk_workspace_object", "workspace_object", "rel_validation"},
      priority = 130)
  public void deleteWorkspaceObject() {
    String path = targetPath(config.value("deleteWorkspaceObjectPath", ""));
    if (isBlank(path)) {
      throw new SkipException("No path available for deleteWorkspaceObject");
    }

    DeleteWorkspaceObjectResponse response;
    try {
      response = deleteWorkspaceObject(path, config.value("deleteWorkspaceObjectIfMatch", ""));
    } catch (BmcException e) {
      if (isNotFound(e)) {
        rememberDeleted(path);
        return;
      }
      throw e;
    }
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
    rememberDeleted(path);
  }

  private void rememberDeleted(String path) {
    if (path.equals(createdObjectPath)) {
      createdObjectDeleted = true;
    }
    if (path.equals(copiedObjectPath)) {
      copiedObjectDeleted = true;
    }
  }

  @AfterClass(alwaysRun = true)
  public void cleanup() {
    if (!isBlank(copiedObjectPath) && !copiedObjectDeleted) {
      try {
        deleteWorkspaceObject(copiedObjectPath, "");
      } catch (Exception ignored) {
        // Best-effort cleanup.
      }
    }
    if (!isBlank(createdObjectPath) && !createdObjectDeleted) {
      try {
        deleteWorkspaceObject(createdObjectPath, "");
      } catch (Exception ignored) {
        // Best-effort cleanup.
      }
    }
    if (workspaceObjectClient != null) {
      workspaceObjectClient.close();
    }
  }

  private DeleteWorkspaceObjectResponse deleteWorkspaceObject(String path, String ifMatch) {
    return workspaceObjectClient.deleteWorkspaceObject(
        DeleteWorkspaceObjectRequest.builder()
            .aiDataPlatformId(aiDataPlatformId)
            .workspaceKey(workspaceKey)
            .objectPath(path)
            .ifMatch(blankToNull(ifMatch))
            .opcRequestId(SdkTestSupport.requestId("wso-delete"))
            .build());
  }

  private CopyWorkspaceObjectDetails copyWorkspaceObjectDetails() {
    String fromPath = targetPath(config.value("copyWorkspaceObjectFromPath", ""));
    if (isBlank(fromPath)) {
      throw new SkipException("No path available for copyWorkspaceObject");
    }
    return CopyWorkspaceObjectDetails.builder()
        .fromPath(fromPath)
        .toPath(firstNonBlank(
            normalizeWorkspacePath(config.value("copyWorkspaceObjectToPath", "")),
            siblingPath(fromPath, "copy")))
        .isDeleteSource(optionalBoolean("copyWorkspaceObjectIsDeleteSource"))
        .isOverWrite(Boolean.TRUE)
        .build();
  }

  private MoveWorkspaceObjectDetails moveWorkspaceObjectDetails() {
    String fromPath =
        firstNonBlank(
            normalizeWorkspacePath(config.value("moveWorkspaceObjectFromPath", "")),
            copiedObjectPath,
            createdObjectPath);
    if (isBlank(fromPath)) {
      throw new SkipException("No path available for moveWorkspaceObject");
    }
    return MoveWorkspaceObjectDetails.builder()
        .fromPath(fromPath)
        .toPath(firstNonBlank(
            folderPath(config.value("moveWorkspaceObjectToPath", "")),
            folderPath(parentPath(fromPath))))
        .build();
  }

  private RenameWorkspaceObjectDetails renameWorkspaceObjectDetails() {
    String path =
        firstNonBlank(
            normalizeWorkspacePath(config.value("renameWorkspaceObjectPath", "")),
            movedObjectPath,
            copiedObjectPath,
            createdObjectPath);
    if (isBlank(path)) {
      throw new SkipException("No path available for renameWorkspaceObject");
    }
    return RenameWorkspaceObjectDetails.builder()
        .path(path)
        .newName(firstNonBlank(
            config.value("renameWorkspaceObjectNewName", ""),
            "sdk_it_renamed_" + UUID.randomUUID().toString().substring(0, 8) + fileExtension(path)))
        .build();
  }

  private ManageWorkspaceObjectPermissionDetails manageWorkspaceObjectPermissionDetails(
      String assignee) {
    return ManageWorkspaceObjectPermissionDetails.builder()
        .assignWorkspaceObjectPermissionDetails(
            AssignWorkspaceObjectPermissionDetails.builder()
                .assignees(permissionAssignees(assignee))
                .permissions(List.of(WorkspaceObjectPrivilege.Read))
                .isPermissionsInheritable(false)
                .build())
        .build();
  }

  private UploadFileWithParDetails uploadFileWithParDetails(String prefix) {
    return UploadFileWithParDetails.builder()
        .action(UploadFileWithParDetails.Action.create(config.value(prefix + "Action", "REFRESH")))
        .eTag(blankToNull(config.value(prefix + "ETag", "")))
        .size(optionalLong(config.value(prefix + "Size", "")))
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

  private Long optionalLong(String value) {
    return isBlank(value) ? null : Long.valueOf(value);
  }

  private String siblingPath(String path, String suffix) {
    String parent = parentPath(path);
    String fileName = fileName(path);
    String extension = fileExtension(fileName);
    String base = extension.isEmpty() ? fileName : fileName.substring(0, fileName.length() - extension.length());
    String sibling = base + "_" + suffix + "_" + UUID.randomUUID().toString().substring(0, 8) + extension;
    return isBlank(parent) ? sibling : parent + "/" + sibling;
  }

  private String parentPath(String path) {
    String normalized = normalizeWorkspacePath(path);
    int separator = normalized.lastIndexOf('/');
    return separator < 0 ? "" : normalized.substring(0, separator);
  }

  private String fileName(String path) {
    String normalized = normalizeWorkspacePath(path);
    int separator = normalized.lastIndexOf('/');
    return separator < 0 ? normalized : normalized.substring(separator + 1);
  }

  private String fileExtension(String path) {
    String name = fileName(path);
    int separator = name.lastIndexOf('.');
    return separator < 0 ? "" : name.substring(separator);
  }

  private String folderPath(String path) {
    String normalized = normalizeWorkspacePath(path);
    if (isBlank(normalized)) {
      return "";
    }
    return normalized.endsWith("/") ? normalized : normalized + "/";
  }

  private void rememberCopied(String requestedPath, WorkspaceObjectDetails details) {
    copiedObjectPath = firstNonBlank(copiedObjectPath, normalizeWorkspacePath(requestedPath));
    if (details == null) {
      return;
    }
    copiedObjectPath = firstNonBlank(copiedObjectPath, normalizeWorkspacePath(details.getPath()));
    copiedObjectKey = firstNonBlank(copiedObjectKey, details.getKey());
  }

  private String targetPath(String configuredPath) {
    return firstNonBlank(
        normalizeWorkspacePath(configuredPath),
        normalizeWorkspacePath(renamedObjectPath),
        normalizeWorkspacePath(movedObjectPath),
        normalizeWorkspacePath(copiedObjectPath),
        normalizeWorkspacePath(createdObjectPath));
  }

  private String defaultCreatePath(String type) {
    String root = normalizeWorkspacePath(config.value("workspaceObjectRootPath", "Shared"));
    String leaf = "sdk_it_object_" + UUID.randomUUID().toString().substring(0, 8);
    if (!"FOLDER".equalsIgnoreCase(type)) {
      leaf += ".txt";
    }
    return isBlank(root) ? leaf : root + "/" + leaf;
  }

  private Boolean optionalBoolean(String key) {
    String value = config.value(key, "");
    if (isBlank(value)) {
      return null;
    }
    if (!"true".equalsIgnoreCase(value) && !"false".equalsIgnoreCase(value)) {
      throw new IllegalArgumentException(key + " must be true/false when provided: " + value);
    }
    return Boolean.valueOf(value);
  }

  private SortOrder sortOrder(String value) {
    return isBlank(value) ? null : SortOrder.create(value);
  }

  private ListWorkspaceObjectsRequest.SortBy workspaceObjectSortBy(String value) {
    return isBlank(value) ? null : ListWorkspaceObjectsRequest.SortBy.create(value);
  }

  private ListWorkspaceObjectPermissionsRequest.SortBy workspaceObjectPermissionSortBy(String value) {
    return isBlank(value) ? null : ListWorkspaceObjectPermissionsRequest.SortBy.create(value);
  }

  private int parsePositiveInt(String value, String name) {
    try {
      int parsed = Integer.parseInt(value);
      if (parsed <= 0) {
        throw new IllegalArgumentException(name + " must be positive: " + value);
      }
      return parsed;
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException(name + " must be a positive integer: " + value, e);
    }
  }

  private String normalizeWorkspacePath(String path) {
    if (isBlank(path)) {
      return "";
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

  private void assertNotBlank(String value, String message) {
    assertFalse(isBlank(value), message);
  }

  private boolean bothBlank(String left, String right) {
    return isBlank(left) && isBlank(right);
  }

  private boolean isParUnsupported(BmcException e) {
    return e.getStatusCode() == 403 && "NotAllowed".equals(e.getServiceCode());
  }

  private boolean isNotFound(BmcException e) {
    return e.getStatusCode() == 404;
  }

  private String blankToNull(String value) {
    return isBlank(value) ? null : value;
  }

  private String firstNonBlank(String... values) {
    for (String value : values) {
      if (!isBlank(value)) {
        return value;
      }
    }
    return "";
  }

  private boolean isBlank(String value) {
    return value == null || value.isBlank();
  }
}
