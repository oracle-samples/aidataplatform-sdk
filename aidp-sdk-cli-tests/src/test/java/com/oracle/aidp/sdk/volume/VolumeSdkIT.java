package com.oracle.aidp.sdk.volume;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;

import com.oracle.aidp.sdk.client.SdkClients;
import com.oracle.aidp.sdk.config.SdkTestConfig;
import com.oracle.aidp.sdk.support.SdkTestSupport;
import com.oracle.aidataplatform.dp.VolumeClient;
import com.oracle.aidataplatform.dp.model.AssignVolumePermissionDetails;
import com.oracle.aidataplatform.dp.model.CreateVolumeDetails;
import com.oracle.aidataplatform.dp.model.DownloadFileWithParResult;
import com.oracle.aidataplatform.dp.model.GranteeType;
import com.oracle.aidataplatform.dp.model.ManageVolumePermissionDetails;
import com.oracle.aidataplatform.dp.model.PermissionAssignees;
import com.oracle.aidataplatform.dp.model.SortOrder;
import com.oracle.aidataplatform.dp.model.UpdateDirDetails;
import com.oracle.aidataplatform.dp.model.UpdateVolumeDetails;
import com.oracle.aidataplatform.dp.model.UploadFileWithParDetails;
import com.oracle.aidataplatform.dp.model.UploadFileWithParResult;
import com.oracle.aidataplatform.dp.model.VolumePrivilege;
import com.oracle.aidataplatform.dp.requests.CreateVolumeRequest;
import com.oracle.aidataplatform.dp.requests.DeleteDirRequest;
import com.oracle.aidataplatform.dp.requests.DeleteFileRequest;
import com.oracle.aidataplatform.dp.requests.DeleteVolumeRequest;
import com.oracle.aidataplatform.dp.requests.DownloadFileRequest;
import com.oracle.aidataplatform.dp.requests.DownloadFileWithParRequest;
import com.oracle.aidataplatform.dp.requests.GetVolumeRequest;
import com.oracle.aidataplatform.dp.requests.ListFilesRequest;
import com.oracle.aidataplatform.dp.requests.ListVolumePermissionsRequest;
import com.oracle.aidataplatform.dp.requests.ListVolumesRequest;
import com.oracle.aidataplatform.dp.requests.MakeDirRequest;
import com.oracle.aidataplatform.dp.requests.ManageVolumePermissionRequest;
import com.oracle.aidataplatform.dp.requests.UpdateDirRequest;
import com.oracle.aidataplatform.dp.requests.UpdateVolumeRequest;
import com.oracle.aidataplatform.dp.requests.UploadFileRequest;
import com.oracle.aidataplatform.dp.requests.UploadFileWithParRequest;
import com.oracle.aidataplatform.dp.responses.CreateVolumeResponse;
import com.oracle.aidataplatform.dp.responses.DeleteDirResponse;
import com.oracle.aidataplatform.dp.responses.DeleteFileResponse;
import com.oracle.aidataplatform.dp.responses.DeleteVolumeResponse;
import com.oracle.aidataplatform.dp.responses.DownloadFileResponse;
import com.oracle.aidataplatform.dp.responses.DownloadFileWithParResponse;
import com.oracle.aidataplatform.dp.responses.GetVolumeResponse;
import com.oracle.aidataplatform.dp.responses.ListFilesResponse;
import com.oracle.aidataplatform.dp.responses.ListVolumePermissionsResponse;
import com.oracle.aidataplatform.dp.responses.ListVolumesResponse;
import com.oracle.aidataplatform.dp.responses.MakeDirResponse;
import com.oracle.aidataplatform.dp.responses.ManageVolumePermissionResponse;
import com.oracle.aidataplatform.dp.responses.UpdateDirResponse;
import com.oracle.aidataplatform.dp.responses.UpdateVolumeResponse;
import com.oracle.aidataplatform.dp.responses.UploadFileResponse;
import com.oracle.aidataplatform.dp.responses.UploadFileWithParResponse;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.UUID;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VolumeSdkIT {
  private SdkTestConfig config;
  private VolumeClient volumeClient;
  private String aiDataPlatformId;
  private String createdVolumeKey;
  private String createdVolumeCatalogKey;
  private String createdVolumeSchemaKey;
  private String createdDirectoryPath;
  private String createdUploadedFilePath;
  private boolean createdVolumeDeleted;

  @BeforeClass(alwaysRun = true, groups = {"sdk_tests", "sdk_volume", "volume", "rel_validation"})
  public void setUp() throws Exception {
    config = SdkTestConfig.load();
    aiDataPlatformId = config.value("aidpInstanceId", config.required("dataHubId"));
    assertFalse(aiDataPlatformId.isBlank(), "aiDataPlatformId must be configured");
    volumeClient = SdkClients.volumeClient(config);
  }

  @Test(groups = {"sdk_tests", "sdk_volume", "volume", "rel_validation"}, priority = 10)
  public void createVolume() {
    createdVolumeCatalogKey = config.value("createVolumeCatalogName", config.value("catalogKey", "default"));
    String schemaName = config.value("createVolumeSchemaName", defaultSchemaName());
    createdVolumeSchemaKey = schemaName.contains(".") ? schemaName : createdVolumeCatalogKey + "." + schemaName;
    CreateVolumeRequest.Builder request =
        CreateVolumeRequest.builder()
            .aiDataPlatformId(aiDataPlatformId)
            .createVolumeDetails(createVolumeDetails())
            .opcRequestId(SdkTestSupport.requestId("volume-create"))
            .opcRetryToken(
                firstNonBlank(
                    config.value("createVolumeRetryToken", ""),
                    "volume-create-it-" + UUID.randomUUID()))
            .shouldUpdateRecent(optionalBoolean("createVolumeShouldUpdateRecent"));

    CreateVolumeResponse response = volumeClient.createVolume(request.build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
    if (response.getVolume() != null) {
      createdVolumeKey = response.getVolume().getKey();
    }
  }

  @Test(groups = {"sdk_tests", "sdk_volume", "volume", "rel_validation"}, priority = 12)
  public void listVolumes() {
    String catalogKey = firstNonBlank(config.value("listVolumesCatalogKey", ""), createdVolumeCatalogKey);
    String schemaKey = firstNonBlank(config.value("listVolumesSchemaKey", ""), createdVolumeSchemaKey);
    assertNotBlank(catalogKey, "catalog key should be available for listVolumes");
    assertNotBlank(schemaKey, "schema key should be available for listVolumes");

    ListVolumesRequest.Builder request =
        ListVolumesRequest.builder()
            .aiDataPlatformId(aiDataPlatformId)
            .catalogKey(catalogKey)
            .schemaKey(schemaKey)
            .displayName(blankToNull(config.value("listVolumesDisplayName", "")))
            .limit(parsePositiveInt(config.value("listVolumesLimit", "50"), "listVolumesLimit"))
            .page(blankToNull(config.value("listVolumesPage", "")))
            .sortBy(volumeSortBy(config.value("listVolumesSortBy", "")))
            .sortOrder(sortOrder(config.value("listVolumesSortOrder", "")))
            .opcRequestId(SdkTestSupport.requestId("volume-list"));

    ListVolumesResponse response = volumeClient.listVolumes(request.build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
    assertNotNull(response.getVolumeCollection(), "volume collection should be present");
    assertNotNull(response.getVolumeCollection().getItems(), "volume items should be present");
  }

  @Test(groups = {"sdk_tests", "sdk_volume", "volume", "rel_validation"}, priority = 15)
  public void getVolumeDetails() {
    String volumeKey = firstNonBlank(config.value("getVolumeDetailsVolumeKey", ""), createdVolumeKey);
    if (isBlank(volumeKey)) {
      throw new SkipException(
          "No volume key available for getVolumeDetails; configure getVolumeDetailsVolumeKey or run createVolume first");
    }

    GetVolumeResponse response =
        volumeClient.getVolume(
            GetVolumeRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .volumeKey(volumeKey)
                .shouldUpdateRecent(optionalBoolean("getVolumeDetailsShouldUpdateRecent"))
                .opcRequestId(SdkTestSupport.requestId("volume-get"))
                .build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
    assertNotNull(response.getVolume(), "volume should be present");
  }

  @Test(groups = {"sdk_tests", "sdk_volume", "volume", "rel_validation"}, priority = 16)
  public void updateVolume() {
    String volumeKey =
        firstNonBlank(
            config.value("updateVolumeKey", ""),
            createdVolumeKey,
            config.value("getVolumeDetailsVolumeKey", ""));
    if (isBlank(volumeKey)) {
      throw new SkipException(
          "No volume key available for updateVolume; configure updateVolumeKey or run createVolume first");
    }

    UpdateVolumeResponse response =
        volumeClient.updateVolume(
            UpdateVolumeRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .volumeKey(volumeKey)
                .updateVolumeDetails(updateVolumeDetails())
                .ifMatch(blankToNull(config.value("updateVolumeIfMatch", "")))
                .shouldUpdateRecent(optionalBoolean("updateVolumeShouldUpdateRecent"))
                .opcRequestId(SdkTestSupport.requestId("volume-update"))
                .build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
    if (response.getVolume() != null && !isBlank(response.getVolume().getKey())) {
      createdVolumeKey = response.getVolume().getKey();
    }
  }

  @Test(groups = {"sdk_tests", "sdk_volume", "volume", "rel_validation"}, priority = 18)
  public void getVolumePermissions() {
    String volumeKey = firstNonBlank(config.value("listVolumePermissionsVolumeKey", ""), createdVolumeKey);
    if (isBlank(volumeKey)) {
      throw new SkipException(
          "No volume key available for getVolumePermissions; configure listVolumePermissionsVolumeKey or run createVolume first");
    }

    ListVolumePermissionsResponse response =
        volumeClient.listVolumePermissions(
            ListVolumePermissionsRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .volumeKey(volumeKey)
                .limit(
                    parsePositiveInt(
                        config.value("listVolumePermissionsLimit", "50"),
                        "listVolumePermissionsLimit"))
                .page(blankToNull(config.value("listVolumePermissionsPage", "")))
                .sortBy(volumePermissionSortBy(config.value("listVolumePermissionsSortBy", "")))
                .sortOrder(sortOrder(config.value("listVolumePermissionsSortOrder", "")))
                .opcRequestId(SdkTestSupport.requestId("volume-perms"))
                .build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
    assertNotNull(response.getVolumePermissionCollection(), "permission collection should be present");
  }

  @Test(groups = {"sdk_tests", "sdk_volume", "volume", "rel_validation"}, priority = 19)
  public void manageVolumePermission() {
    String volumeKey = firstNonBlank(config.value("manageVolumePermissionVolumeKey", ""), createdVolumeKey);
    if (isBlank(volumeKey)) {
      throw new SkipException(
          "No volume key available for manageVolumePermission; configure manageVolumePermissionVolumeKey or run createVolume first");
    }
    String assignee = permissionTarget("manageVolumePermissionDefaultAssignee");
    if (isBlank(assignee)) {
      throw new SkipException(
          "Set manageVolumePermissionDefaultAssignee or sdkWorkspacePermissionTarget to run manageVolumePermission");
    }

    ManageVolumePermissionResponse response =
        volumeClient.manageVolumePermission(
            ManageVolumePermissionRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .volumeKey(volumeKey)
                .manageVolumePermissionDetails(manageVolumePermissionDetails(assignee))
                .ifMatch(blankToNull(config.value("manageVolumePermissionIfMatch", "")))
                .opcRequestId(SdkTestSupport.requestId("volume-manage-perm"))
                .build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
  }

  @Test(groups = {"sdk_tests", "sdk_volume", "volume", "rel_validation"}, priority = 20)
  public void mkdirInVolume() {
    String volumeKey = firstNonBlank(config.value("mkdirVolumeKey", ""), createdVolumeKey);
    if (isBlank(volumeKey)) {
      throw new SkipException(
          "No volume key available for mkdir; configure mkdirVolumeKey or run createVolume first");
    }
    String path = normalizePath(config.value("mkdirVolumePath", ""));
    if (isBlank(path)) {
      path = "sdk_it_dir_" + UUID.randomUUID().toString().substring(0, 8);
    }

    MakeDirResponse response =
        volumeClient.makeDir(
            MakeDirRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .volumeKey(volumeKey)
                .path(path)
                .description(blankToNull(config.value("mkdirVolumeDescription", "")))
                .opcRetryToken(blankToNull(config.value("mkdirVolumeRetryToken", "")))
                .shouldUpdateRecent(optionalBoolean("mkdirVolumeShouldUpdateRecent"))
                .opcRequestId(SdkTestSupport.requestId("volume-mkdir"))
                .build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
    createdDirectoryPath = path;
  }

  @Test(groups = {"sdk_tests", "sdk_volume", "volume", "rel_validation"}, priority = 22)
  public void updateVolumeDir() {
    String volumeKey = firstNonBlank(config.value("updateVolumeDirVolumeKey", ""), createdVolumeKey);
    String path = normalizePath(firstNonBlank(config.value("updateVolumeDirPath", ""), createdDirectoryPath));
    if (isBlank(volumeKey) || isBlank(path)) {
      throw new SkipException(
          "No target available for updateVolumeDir; configure updateVolumeDirVolumeKey/updateVolumeDirPath or run create+mkdir first");
    }

    UpdateDirResponse response =
        volumeClient.updateDir(
            UpdateDirRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .volumeKey(volumeKey)
                .path(path)
                .updateDirDetails(updateDirDetails())
                .opcRetryToken(blankToNull(config.value("updateVolumeDirRetryToken", "")))
                .ifMatch(blankToNull(config.value("updateVolumeDirIfMatch", "")))
                .shouldUpdateRecent(optionalBoolean("updateVolumeDirShouldUpdateRecent"))
                .opcRequestId(SdkTestSupport.requestId("volume-update-dir"))
                .build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
  }

  @Test(groups = {"sdk_tests", "sdk_volume", "volume", "rel_validation"}, priority = 23)
  public void uploadVolumeFile() {
    String volumeKey = firstNonBlank(config.value("uploadVolumeFileVolumeKey", ""), createdVolumeKey);
    if (isBlank(volumeKey)) {
      throw new SkipException(
          "No volume key available for uploadVolumeFile; configure uploadVolumeFileVolumeKey or run createVolume first");
    }
    String path = normalizePath(config.value("uploadVolumeFilePath", ""));
    if (isBlank(path)) {
      String dir = normalizePath(createdDirectoryPath);
      path =
          (isBlank(dir) ? "" : dir + "/")
              + "sdk_it_upload_"
              + UUID.randomUUID().toString().substring(0, 8)
              + ".txt";
    }

    byte[] content =
        config.value("uploadVolumeFileContentText", "sdk volume upload content")
            .getBytes(StandardCharsets.UTF_8);
    if (Boolean.TRUE.equals(optionalBoolean("uploadVolumeFileIsBase64Encoded"))) {
      content = java.util.Base64.getEncoder().encode(content);
    }

    UploadFileResponse response =
        volumeClient.uploadFile(
            UploadFileRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .volumeKey(volumeKey)
                .path(path)
                .uploadFileDetails(new ByteArrayInputStream(content))
                .isOverwrite(optionalBoolean("uploadVolumeFileIsOverwrite"))
                .isUploadFileBase64Encoded(optionalBoolean("uploadVolumeFileIsBase64Encoded"))
                .opcRetryToken(blankToNull(config.value("uploadVolumeFileRetryToken", "")))
                .shouldUpdateRecent(optionalBoolean("uploadVolumeFileShouldUpdateRecent"))
                .opcRequestId(SdkTestSupport.requestId("volume-upload"))
                .build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
    createdUploadedFilePath = path;
  }

  @Test(groups = {"sdk_tests", "sdk_volume", "volume", "rel_validation"}, priority = 24)
  public void uploadVolumeFileMeta() {
    String volumeKey = firstNonBlank(config.value("uploadFileMetaVolumeKey", ""), createdVolumeKey);
    String path = normalizePath(firstNonBlank(config.value("uploadFileMetaPath", ""), createdUploadedFilePath));
    if (isBlank(volumeKey) || isBlank(path)) {
      throw new SkipException(
          "No target available for uploadVolumeFileMeta; configure uploadFileMetaVolumeKey/uploadFileMetaPath or run upload first");
    }

    UploadFileWithParResponse response =
        volumeClient.uploadFileWithPar(
            UploadFileWithParRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .volumeKey(volumeKey)
                .path(path)
                .uploadFileWithParDetails(uploadFileWithParDetails("uploadFileMeta"))
                .isOverwrite(optionalBoolean("uploadFileMetaIsOverwrite"))
                .shouldGenerateNewPar(optionalBoolean("uploadFileMetaShouldGenerateNewPar"))
                .shouldUpdateRecent(optionalBoolean("uploadFileMetaShouldUpdateRecent"))
                .opcRetryToken(blankToNull(config.value("uploadFileMetaRetryToken", "")))
                .opcRequestId(SdkTestSupport.requestId("volume-upload-par"))
                .build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
    UploadFileWithParResult result = response.getUploadFileWithParResult();
    assertFalse(result == null || bothBlank(result.getLocationUri(), result.getParUrl()));
  }

  @Test(groups = {"sdk_tests", "sdk_volume", "volume", "rel_validation"}, priority = 25)
  public void listVolumeFiles() {
    String volumeKey = firstNonBlank(config.value("listVolumeFilesVolumeKey", ""), createdVolumeKey);
    String path =
        normalizePath(
            firstNonBlank(
                config.value("listVolumeFilesPath", ""),
                createdDirectoryPath,
                parentDirectoryPath(createdUploadedFilePath)));
    if (isBlank(volumeKey) || isBlank(path)) {
      throw new SkipException(
          "No path available for listVolumeFiles; configure listVolumeFilesPath or run mkdir/upload first");
    }

    ListFilesResponse response =
        volumeClient.listFiles(
            ListFilesRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .volumeKey(volumeKey)
                .path(path)
                .displayName(blankToNull(config.value("listVolumeFilesDisplayName", "")))
                .isRecursive(optionalBoolean("listVolumeFilesIsRecursive"))
                .limit(parsePositiveInt(config.value("listVolumeFilesLimit", "50"), "listVolumeFilesLimit"))
                .metadataKeys(blankToNull(config.value("listVolumeFilesMetadataKeys", "")))
                .page(blankToNull(config.value("listVolumeFilesPage", "")))
                .sortBy(fileSortBy(config.value("listVolumeFilesSortBy", "")))
                .sortOrder(sortOrder(config.value("listVolumeFilesSortOrder", "")))
                .shouldUpdateRecent(optionalBoolean("listVolumeFilesShouldUpdateRecent"))
                .opcRequestId(SdkTestSupport.requestId("volume-list-files"))
                .build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
    assertNotNull(response.getVolumeFileCollection(), "file collection should be present");
  }

  @Test(groups = {"sdk_tests", "sdk_volume", "volume", "rel_validation"}, priority = 30)
  public void downloadFileMeta() {
    String volumeKey = firstNonBlank(config.value("downloadFileMetaVolumeKey", ""), createdVolumeKey);
    String path = normalizePath(firstNonBlank(config.value("downloadFileMetaPath", ""), createdUploadedFilePath));
    if (isBlank(volumeKey) || isBlank(path)) {
      throw new SkipException(
          "No target available for downloadFileMeta; configure downloadFileMetaVolumeKey/downloadFileMetaPath or run upload first");
    }

    DownloadFileWithParResponse response =
        volumeClient.downloadFileWithPar(
            DownloadFileWithParRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .volumeKey(volumeKey)
                .path(path)
                .shouldGenerateNewPar(optionalBoolean("downloadFileMetaShouldGenerateNewPar"))
                .opcRetryToken(blankToNull(config.value("downloadFileMetaRetryToken", "")))
                .opcRequestId(SdkTestSupport.requestId("volume-download-par"))
                .build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
    DownloadFileWithParResult result = response.getDownloadFileWithParResult();
    assertFalse(result == null || bothBlank(result.getLocationUri(), result.getParUrl()));
  }

  @Test(groups = {"sdk_tests", "sdk_volume", "volume", "rel_validation"}, priority = 35)
  public void downloadVolumeFile() {
    String volumeKey = firstNonBlank(config.value("downloadVolumeFileVolumeKey", ""), createdVolumeKey);
    String path =
        normalizePath(
            firstNonBlank(
                config.value("downloadVolumeFilePath", ""),
                config.value("downloadFileMetaPath", ""),
                createdUploadedFilePath));
    if (isBlank(volumeKey) || isBlank(path)) {
      throw new SkipException(
          "No target available for downloadVolumeFile; configure downloadVolumeFileVolumeKey/downloadVolumeFilePath");
    }

    DownloadFileResponse response =
        volumeClient.downloadFile(
            DownloadFileRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .volumeKey(volumeKey)
                .path(path)
                .shouldUpdateRecent(optionalBoolean("downloadVolumeFileShouldUpdateRecent"))
                .opcRequestId(SdkTestSupport.requestId("volume-download"))
                .build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
    assertNotNull(response.getInputStream(), "download response stream should be present");
  }

  @Test(groups = {"sdk_tests", "sdk_volume", "volume", "rel_validation"}, priority = 40)
  public void deleteVolumeFile() {
    String volumeKey = firstNonBlank(config.value("deleteVolumeFileVolumeKey", ""), createdVolumeKey);
    String path = normalizePath(firstNonBlank(config.value("deleteVolumeFilePath", ""), createdUploadedFilePath));
    if (isBlank(volumeKey) || isBlank(path)) {
      throw new SkipException(
          "No target available for delete volume file; configure deleteVolumeFileVolumeKey/deleteVolumeFilePath");
    }

    DeleteFileResponse response =
        volumeClient.deleteFile(
            DeleteFileRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .volumeKey(volumeKey)
                .path(path)
                .opcRequestId(SdkTestSupport.requestId("volume-delete-file"))
                .build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
    if (path.equals(createdUploadedFilePath)) {
      createdUploadedFilePath = null;
    }
  }

  @Test(groups = {"sdk_tests", "sdk_volume", "volume", "rel_validation"}, priority = 50)
  public void deleteVolumeDir() {
    String volumeKey = firstNonBlank(config.value("deleteVolumeDirVolumeKey", ""), createdVolumeKey);
    String path = normalizePath(firstNonBlank(config.value("deleteVolumeDirPath", ""), createdDirectoryPath));
    if (isBlank(volumeKey) || isBlank(path)) {
      throw new SkipException(
          "No target available for delete volume dir; configure deleteVolumeDirVolumeKey/deleteVolumeDirPath or run create+mkdir first");
    }

    DeleteDirResponse response =
        volumeClient.deleteDir(
            DeleteDirRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .volumeKey(volumeKey)
                .path(path)
                .opcRetryToken(blankToNull(config.value("deleteVolumeDirRetryToken", "")))
                .opcRequestId(SdkTestSupport.requestId("volume-delete-dir"))
                .build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
    if (path.equals(createdDirectoryPath)) {
      createdDirectoryPath = null;
    }
  }

  @Test(groups = {"sdk_tests", "sdk_volume", "volume", "rel_validation"}, priority = 90)
  public void deleteVolume() {
    String volumeKey = firstNonBlank(createdVolumeKey, config.value("deleteVolumeKey", ""));
    if (isBlank(volumeKey)) {
      throw new SkipException(
          "No volume key available for deleteVolume; run createVolume first or provide deleteVolumeKey");
    }

    DeleteVolumeResponse response =
        volumeClient.deleteVolume(
            DeleteVolumeRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .volumeKey(volumeKey)
                .ifMatch(blankToNull(config.value("deleteVolumeIfMatch", "")))
                .opcRequestId(SdkTestSupport.requestId("volume-delete"))
                .build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
    if (volumeKey.equals(createdVolumeKey)) {
      createdVolumeDeleted = true;
    }
  }

  @AfterClass(alwaysRun = true)
  public void cleanup() {
    if (!isBlank(createdVolumeKey) && !createdVolumeDeleted) {
      try {
        volumeClient.deleteVolume(
            DeleteVolumeRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .volumeKey(createdVolumeKey)
                .opcRequestId(SdkTestSupport.requestId("volume-cleanup"))
                .build());
      } catch (Exception ignored) {
        // Best-effort cleanup.
      }
    }
    if (volumeClient != null) {
      volumeClient.close();
    }
  }

  private CreateVolumeDetails createVolumeDetails() {
    return CreateVolumeDetails.builder()
        .displayName(uniqueName("sdk_volume_it", config.value("createVolumeDisplayName", "")))
        .catalogName(config.value("createVolumeCatalogName", config.value("catalogKey", "default")))
        .schemaName(config.value("createVolumeSchemaName", defaultSchemaName()))
        .description(config.value("createVolumeDescription", "Created by VolumeSdkIT"))
        .volumeType(CreateVolumeDetails.VolumeType.create(config.value("createVolumeType", "MANAGED")))
        .storageLocation(blankToNull(config.value("createVolumeStorageLocation", "")))
        .build();
  }

  private UpdateVolumeDetails updateVolumeDetails() {
    return UpdateVolumeDetails.builder()
        .displayName(uniqueName("sdk_volume_updated_it", config.value("updateVolumeDisplayName", "")))
        .description(config.value("updateVolumeDescription", "Updated by VolumeSdkIT"))
        .build();
  }

  private ManageVolumePermissionDetails manageVolumePermissionDetails(String assignee) {
    return ManageVolumePermissionDetails.builder()
        .assignVolumePermissionDetails(
            AssignVolumePermissionDetails.builder()
                .assignees(permissionAssignees(assignee))
                .permissions(List.of(VolumePrivilege.Read))
                .build())
        .build();
  }

  private UpdateDirDetails updateDirDetails() {
    return UpdateDirDetails.builder()
        .displayName(uniqueName("sdk_it_dir_updated", config.value("updateVolumeDirDisplayName", "")))
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

  private String defaultSchemaName() {
    String schemaKey = config.value("schemaKey", "default.default");
    int separator = schemaKey.lastIndexOf('.');
    return separator < 0 ? schemaKey : schemaKey.substring(separator + 1);
  }

  private String uniqueName(String defaultPrefix, String configuredName) {
    return firstNonBlank(configuredName, defaultPrefix)
        + "_"
        + UUID.randomUUID().toString().substring(0, 8);
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

  private ListVolumesRequest.SortBy volumeSortBy(String value) {
    return isBlank(value) ? null : ListVolumesRequest.SortBy.create(value);
  }

  private ListVolumePermissionsRequest.SortBy volumePermissionSortBy(String value) {
    return isBlank(value) ? null : ListVolumePermissionsRequest.SortBy.create(value);
  }

  private ListFilesRequest.SortBy fileSortBy(String value) {
    return isBlank(value) ? null : ListFilesRequest.SortBy.create(value);
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

  private String parentDirectoryPath(String path) {
    String normalized = normalizePath(path);
    if (isBlank(normalized) || !normalized.contains("/")) {
      return "";
    }
    return normalized.substring(0, normalized.lastIndexOf('/'));
  }

  private String normalizePath(String path) {
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
