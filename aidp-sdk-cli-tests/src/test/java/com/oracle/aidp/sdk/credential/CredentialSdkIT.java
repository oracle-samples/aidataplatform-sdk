package com.oracle.aidp.sdk.credential;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;

import com.oracle.aidp.sdk.client.SdkClients;
import com.oracle.aidp.sdk.config.SdkTestConfig;
import com.oracle.aidp.sdk.support.SdkTestSupport;
import com.oracle.aidataplatform.dp.CredentialsClient;
import com.oracle.aidataplatform.dp.model.CreateDataLakeCredentialDetails;
import com.oracle.aidataplatform.dp.model.Credential;
import com.oracle.aidataplatform.dp.model.CredentialSummary;
import com.oracle.aidataplatform.dp.model.CredentialType;
import com.oracle.aidataplatform.dp.model.SecretPair;
import com.oracle.aidataplatform.dp.model.SecretTokenCredentialDetails;
import com.oracle.aidataplatform.dp.model.SortOrder;
import com.oracle.aidataplatform.dp.model.UpdateDataLakeCredentialDetails;
import com.oracle.aidataplatform.dp.requests.CreateCredentialRequest;
import com.oracle.aidataplatform.dp.requests.DeleteCredentialRequest;
import com.oracle.aidataplatform.dp.requests.GetCredentialRequest;
import com.oracle.aidataplatform.dp.requests.ListCredentialsRequest;
import com.oracle.aidataplatform.dp.requests.UpdateCredentialRequest;
import com.oracle.aidataplatform.dp.responses.CreateCredentialResponse;
import com.oracle.aidataplatform.dp.responses.DeleteCredentialResponse;
import com.oracle.aidataplatform.dp.responses.GetCredentialResponse;
import com.oracle.aidataplatform.dp.responses.ListCredentialsResponse;
import com.oracle.aidataplatform.dp.responses.UpdateCredentialResponse;
import java.util.List;
import java.util.UUID;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CredentialSdkIT {
  private SdkTestConfig config;
  private CredentialsClient credentialsClient;

  private String createCredentialRetryToken;
  private String createCredentialShouldUpdateRecent;
  private String listCredentialsCredentialType;
  private String listCredentialsDisplayName;
  private String listCredentialsDisplayNameContains;
  private String listCredentialsLifecycleState;
  private String listCredentialsLimit;
  private String listCredentialsPage;
  private String listCredentialsSortBy;
  private String listCredentialsSortOrder;
  private String listCredentialsShouldUpdateRecent;
  private String getCredentialKey;
  private String getCredentialShouldUpdateRecent;
  private String updateCredentialKey;
  private String updateCredentialIfMatch;
  private String updateCredentialShouldUpdateRecent;
  private String deleteCredentialKey;
  private String deleteCredentialIfMatch;
  private String deleteCredentialShouldUpdateRecent;

  private String createdCredentialKey;
  private boolean createdCredentialDeleted;

  @BeforeClass(alwaysRun = true, groups = {"sdk_tests", "sdk_credential", "credential", "rel_validation"})
  public void setUp() throws Exception {
    config = SdkTestConfig.load();
    credentialsClient = SdkClients.credentialsClient(config);

    createCredentialRetryToken = config.value("createCredentialRetryToken", "");
    createCredentialShouldUpdateRecent = config.value("createCredentialShouldUpdateRecent", "");
    listCredentialsCredentialType = config.value("listCredentialsCredentialType", "");
    listCredentialsDisplayName = config.value("listCredentialsDisplayName", "");
    listCredentialsDisplayNameContains = config.value("listCredentialsDisplayNameContains", "");
    listCredentialsLifecycleState = config.value("listCredentialsLifecycleState", "");
    listCredentialsLimit = config.value("listCredentialsLimit", "50");
    listCredentialsPage = config.value("listCredentialsPage", "");
    listCredentialsSortBy = config.value("listCredentialsSortBy", "timeCreated");
    listCredentialsSortOrder = config.value("listCredentialsSortOrder", "DESC");
    listCredentialsShouldUpdateRecent = config.value("listCredentialsShouldUpdateRecent", "");
    getCredentialKey = config.value("getCredentialKey", "");
    getCredentialShouldUpdateRecent = config.value("getCredentialShouldUpdateRecent", "");
    updateCredentialKey = config.value("updateCredentialKey", "");
    updateCredentialIfMatch = config.value("updateCredentialIfMatch", "");
    updateCredentialShouldUpdateRecent = config.value("updateCredentialShouldUpdateRecent", "");
    deleteCredentialKey = config.value("deleteCredentialKey", "");
    deleteCredentialIfMatch = config.value("deleteCredentialIfMatch", "");
    deleteCredentialShouldUpdateRecent = config.value("deleteCredentialShouldUpdateRecent", "");
  }

  @Test(groups = {"sdk_tests", "sdk_credential", "credential", "rel_validation"})
  public void listCredentials() {
    ListCredentialsRequest.Builder request =
        ListCredentialsRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .limit(parsePositiveInt(listCredentialsLimit, "listCredentialsLimit"))
            .opcRequestId(requestId("list-credentials"));

    if (!isBlank(listCredentialsCredentialType)) {
      request.credentialType(CredentialType.create(listCredentialsCredentialType));
    }
    if (!isBlank(listCredentialsDisplayName)) {
      request.displayName(listCredentialsDisplayName);
    }
    if (!isBlank(listCredentialsDisplayNameContains)) {
      request.displayNameContains(listCredentialsDisplayNameContains);
    }
    if (!isBlank(listCredentialsLifecycleState)) {
      request.lifecycleState(listCredentialsLifecycleState);
    }
    if (!isBlank(listCredentialsPage)) {
      request.page(listCredentialsPage);
    }
    if (!isBlank(listCredentialsSortBy)) {
      request.sortBy(ListCredentialsRequest.SortBy.create(listCredentialsSortBy));
    }
    if (!isBlank(listCredentialsSortOrder)) {
      request.sortOrder(SortOrder.create(listCredentialsSortOrder));
    }
    if (!isBlank(listCredentialsShouldUpdateRecent)) {
      request.shouldUpdateRecent(parseBoolean(listCredentialsShouldUpdateRecent, "listCredentialsShouldUpdateRecent"));
    }

    ListCredentialsResponse response = credentialsClient.listCredentials(request.build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertFalse(isBlank(response.getOpcRequestId()), "opc-request-id should be present");
    assertNotNull(response.getCredentialCollection(), "credential collection should be present");
    assertNotNull(response.getCredentialCollection().getItems(), "credential items should be present");
  }

  @Test(groups = {"sdk_tests", "sdk_credential", "credential", "rel_validation"})
  public void createCredential() throws Exception {
    String createdDisplayName =
        "sdk_credential_it_" + UUID.randomUUID().toString().substring(0, 8);

    CreateCredentialRequest.Builder request =
        CreateCredentialRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .createDataLakeCredentialDetails(createDataLakeCredentialDetails(createdDisplayName))
            .opcRequestId(requestId("create-credential"));
    if (!isBlank(createCredentialRetryToken)) {
      request.opcRetryToken(createCredentialRetryToken);
    }
    if (!isBlank(createCredentialShouldUpdateRecent)) {
      request.shouldUpdateRecent(parseBoolean(createCredentialShouldUpdateRecent, "createCredentialShouldUpdateRecent"));
    }

    CreateCredentialResponse response = credentialsClient.createCredential(request.build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertFalse(isBlank(response.getOpcRequestId()), "opc-request-id should be present");

    createdCredentialKey = resolveCredentialKeyByDisplayName(createdDisplayName);
    assertFalse(isBlank(createdCredentialKey), "created credential key should be discoverable");
  }

  @Test(
      groups = {"sdk_tests", "sdk_credential", "credential", "rel_validation"},
      dependsOnMethods = {"createCredential"})
  public void getCredential() {
    String targetCredentialKey = firstNonBlank(getCredentialKey, createdCredentialKey, deleteCredentialKey);
    if (isBlank(targetCredentialKey)) {
      throw new SkipException(
          "No credential key available for get; configure getCredentialKey or run create first");
    }

    GetCredentialRequest.Builder request =
        GetCredentialRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .credentialKey(targetCredentialKey)
            .opcRequestId(requestId("get-credential"));
    if (!isBlank(getCredentialShouldUpdateRecent)) {
      request.shouldUpdateRecent(parseBoolean(getCredentialShouldUpdateRecent, "getCredentialShouldUpdateRecent"));
    }

    GetCredentialResponse response = credentialsClient.getCredential(request.build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertFalse(isBlank(response.getOpcRequestId()), "opc-request-id should be present");
    assertFalse(isBlank(response.getEtag()), "etag should be present");

    Credential credential = response.getCredential();
    assertNotNull(credential, "credential should be present");
    assertEquals(credential.getKey(), targetCredentialKey, "retrieved credential key should match request key");
    assertFalse(isBlank(credential.getDisplayName()), "displayName should be present in credential response");
  }

  @Test(
      groups = {"sdk_tests", "sdk_credential", "credential", "rel_validation"},
      dependsOnMethods = {"getCredential"})
  public void updateCredential() {
    String targetCredentialKey =
        firstNonBlank(updateCredentialKey, createdCredentialKey, getCredentialKey, deleteCredentialKey);
    if (isBlank(targetCredentialKey)) {
      throw new SkipException(
          "No credential key available for update; configure updateCredentialKey or run create/get first");
    }

    UpdateCredentialRequest.Builder request =
        UpdateCredentialRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .credentialKey(targetCredentialKey)
            .updateDataLakeCredentialDetails(updateDataLakeCredentialDetails())
            .opcRequestId(requestId("update-credential"));
    if (!isBlank(updateCredentialIfMatch)) {
      request.ifMatch(updateCredentialIfMatch);
    }
    if (!isBlank(updateCredentialShouldUpdateRecent)) {
      request.shouldUpdateRecent(parseBoolean(updateCredentialShouldUpdateRecent, "updateCredentialShouldUpdateRecent"));
    }

    UpdateCredentialResponse response = credentialsClient.updateCredential(request.build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertFalse(isBlank(response.getOpcRequestId()), "opc-request-id should be present");
  }

  @Test(
      groups = {"sdk_tests", "sdk_credential", "credential", "rel_validation"},
      dependsOnMethods = {"updateCredential"})
  public void deleteCredential() {
    String targetCredentialKey = firstNonBlank(createdCredentialKey, deleteCredentialKey, getCredentialKey);
    if (isBlank(targetCredentialKey)) {
      throw new SkipException(
          "No credential key available for delete; configure deleteCredentialKey or run create first");
    }

    DeleteCredentialRequest.Builder request =
        DeleteCredentialRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .credentialKey(targetCredentialKey)
            .opcRequestId(requestId("delete-credential"));
    if (!isBlank(deleteCredentialIfMatch)) {
      request.ifMatch(deleteCredentialIfMatch);
    }
    if (!isBlank(deleteCredentialShouldUpdateRecent)) {
      request.shouldUpdateRecent(parseBoolean(deleteCredentialShouldUpdateRecent, "deleteCredentialShouldUpdateRecent"));
    }

    DeleteCredentialResponse response = credentialsClient.deleteCredential(request.build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertFalse(isBlank(response.getOpcRequestId()), "opc-request-id should be present");
    if (targetCredentialKey.equals(createdCredentialKey)) {
      createdCredentialDeleted = true;
    }
  }

  @AfterClass(alwaysRun = true)
  public void cleanup() {
    try {
      if (!isBlank(createdCredentialKey) && !createdCredentialDeleted) {
        credentialsClient.deleteCredential(
            DeleteCredentialRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .credentialKey(createdCredentialKey)
                .opcRequestId(requestId("cleanup-credential"))
                .build());
      }
    } catch (Exception ignored) {
      // Best-effort cleanup.
    } finally {
      if (credentialsClient != null) {
        credentialsClient.close();
      }
    }
  }

  private String resolveCredentialKeyByDisplayName(String displayName) throws Exception {
    for (int attempt = 0; attempt < 10; attempt++) {
      ListCredentialsResponse response =
          credentialsClient.listCredentials(
              ListCredentialsRequest.builder()
                  .aiDataPlatformId(config.dataHubId())
                  .displayName(displayName)
                  .limit(50)
                  .sortBy(ListCredentialsRequest.SortBy.TimeCreated)
                  .sortOrder(SortOrder.Desc)
                  .opcRequestId(requestId("resolve-credential"))
                  .build());
      if (response.getCredentialCollection() != null && response.getCredentialCollection().getItems() != null) {
        List<CredentialSummary> items = response.getCredentialCollection().getItems();
        for (CredentialSummary item : items) {
          if (displayName.equals(item.getDisplayName()) && !isBlank(item.getKey())) {
            return item.getKey();
          }
        }
      }
      Thread.sleep(750L);
    }
    return null;
  }

  private static CreateDataLakeCredentialDetails createDataLakeCredentialDetails(
      String displayName) {
    return CreateDataLakeCredentialDetails.builder()
        .displayName(displayName)
        .credentialDescription("Created by CredentialSdkIT")
        .type(CredentialType.SecretToken)
        .credentialDetails(
            SecretTokenCredentialDetails.builder()
                .secretTokenPair(
                    List.of(
                        SecretPair.builder()
                            .secretKey("token")
                            .secretValue("sdk-token-" + UUID.randomUUID())
                            .build()))
                .build())
        .build();
  }

  private static UpdateDataLakeCredentialDetails updateDataLakeCredentialDetails() {
    return UpdateDataLakeCredentialDetails.builder()
        .displayName("sdk_credential_updated_it_" + UUID.randomUUID().toString().substring(0, 8))
        .credentialDescription("Updated by CredentialSdkIT")
        .build();
  }

  private static Boolean parseBoolean(String value, String fieldName) {
    if ("true".equalsIgnoreCase(value) || "false".equalsIgnoreCase(value)) {
      return Boolean.parseBoolean(value);
    }
    throw new IllegalArgumentException(fieldName + " must be true or false: " + value);
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

  private static String requestId(String prefix) {
    String boundedPrefix = prefix.length() > 24 ? prefix.substring(0, 24) : prefix;
    return boundedPrefix + "-" + UUID.randomUUID();
  }

  private static String firstNonBlank(String... values) {
    for (String value : values) {
      if (!isBlank(value)) {
        return value;
      }
    }
    return null;
  }

  private static boolean isBlank(String value) {
    return value == null || value.isBlank();
  }
}
