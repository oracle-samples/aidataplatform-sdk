package com.oracle.aidp.sdk.asyncoperation;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;

import com.oracle.aidp.sdk.client.SdkClients;
import com.oracle.aidp.sdk.config.SdkTestConfig;
import com.oracle.aidp.sdk.support.SdkTestSupport;
import com.oracle.aidataplatform.dp.AsyncOperationsClient;
import com.oracle.aidataplatform.dp.model.AsyncOperation;
import com.oracle.aidataplatform.dp.model.AsyncOperationSummary;
import com.oracle.aidataplatform.dp.model.SortOrder;
import com.oracle.aidataplatform.dp.requests.GetAsyncOperationRequest;
import com.oracle.aidataplatform.dp.requests.ListAsyncOperationsRequest;
import com.oracle.aidataplatform.dp.responses.GetAsyncOperationResponse;
import com.oracle.aidataplatform.dp.responses.ListAsyncOperationsResponse;
import java.util.List;
import java.util.UUID;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AsyncOperationSdkIT {
  private SdkTestConfig config;
  private AsyncOperationsClient asyncOperationsClient;

  private String listAsyncOperationsLimit;
  private String listAsyncOperationsMatchResourceName;
  private String listAsyncOperationsPage;
  private String listAsyncOperationsResourceName;
  private String listAsyncOperationsResourceType;
  private String listAsyncOperationsShouldFilterByCallingPrincipal;
  private String listAsyncOperationsSortBy;
  private String listAsyncOperationsSortOrder;
  private String listAsyncOperationsStatus;
  private String getAsyncOperationKey;

  private String listedAsyncOperationKey;

  @BeforeClass(
      alwaysRun = true,
      groups = {"sdk_tests", "sdk_async_operation", "async_operation", "rel_validation"})
  public void setUp() throws Exception {
    config = SdkTestConfig.load();
    asyncOperationsClient = SdkClients.asyncOperationsClient(config);

    listAsyncOperationsLimit = config.value("listAsyncOperationsLimit", "50");
    listAsyncOperationsMatchResourceName = config.value("listAsyncOperationsMatchResourceName", "");
    listAsyncOperationsPage = config.value("listAsyncOperationsPage", "");
    listAsyncOperationsResourceName = config.value("listAsyncOperationsResourceName", "");
    listAsyncOperationsResourceType = config.value("listAsyncOperationsResourceType", "");
    listAsyncOperationsShouldFilterByCallingPrincipal =
        config.value("listAsyncOperationsShouldFilterByCallingPrincipal", "");
    listAsyncOperationsSortBy = config.value("listAsyncOperationsSortBy", "timeStarted");
    listAsyncOperationsSortOrder = config.value("listAsyncOperationsSortOrder", "DESC");
    listAsyncOperationsStatus = config.value("listAsyncOperationsStatus", "");
    if (isBlank(listAsyncOperationsResourceType) && isBlank(listAsyncOperationsStatus)) {
      // Service requires at least one of resourceType or status.
      listAsyncOperationsStatus = "SUCCEEDED";
    }
    getAsyncOperationKey = config.value("getAsyncOperationKey", "");
  }

  @Test(groups = {"sdk_tests", "sdk_async_operation", "async_operation", "rel_validation"})
  public void listAsyncOperations() {
    ListAsyncOperationsRequest.Builder request =
        ListAsyncOperationsRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .limit(parsePositiveInt(listAsyncOperationsLimit, "listAsyncOperationsLimit"))
            .opcRequestId(requestId("list-async-operations"));

    if (!isBlank(listAsyncOperationsMatchResourceName)) {
      request.matchResourceName(parseBoolean(listAsyncOperationsMatchResourceName, "listAsyncOperationsMatchResourceName"));
    }
    if (!isBlank(listAsyncOperationsPage)) {
      request.page(listAsyncOperationsPage);
    }
    if (!isBlank(listAsyncOperationsResourceName)) {
      request.resourceName(listAsyncOperationsResourceName);
    }
    if (!isBlank(listAsyncOperationsResourceType)) {
      request.resourceType(listAsyncOperationsResourceType);
    }
    if (!isBlank(listAsyncOperationsShouldFilterByCallingPrincipal)) {
      request.shouldFilterByCallingPrincipal(
          parseBoolean(
              listAsyncOperationsShouldFilterByCallingPrincipal,
              "listAsyncOperationsShouldFilterByCallingPrincipal"));
    }
    if (!isBlank(listAsyncOperationsSortBy)) {
      request.sortBy(ListAsyncOperationsRequest.SortBy.create(listAsyncOperationsSortBy));
    }
    if (!isBlank(listAsyncOperationsSortOrder)) {
      request.sortOrder(SortOrder.create(listAsyncOperationsSortOrder));
    }
    if (!isBlank(listAsyncOperationsStatus)) {
      request.status(listAsyncOperationsStatus);
    }

    ListAsyncOperationsResponse response = asyncOperationsClient.listAsyncOperations(request.build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertFalse(isBlank(response.getOpcRequestId()), "opc-request-id should be present");
    assertNotNull(response.getAsyncOperationCollection(), "async operation collection should be present");

    List<AsyncOperationSummary> items = response.getAsyncOperationCollection().getItems();
    assertNotNull(items, "async operation items should be present");
    if (!items.isEmpty()) {
      listedAsyncOperationKey = items.get(0).getKey();
    }
  }

  @Test(
      groups = {"sdk_tests", "sdk_async_operation", "async_operation", "rel_validation"},
      dependsOnMethods = {"listAsyncOperations"})
  public void getAsyncOperation() {
    String targetAsyncOperationKey = firstNonBlank(getAsyncOperationKey, listedAsyncOperationKey);
    if (isBlank(targetAsyncOperationKey)) {
      throw new SkipException(
          "No async operation key available for get; configure getAsyncOperationKey or allow list to discover one");
    }

    GetAsyncOperationResponse response =
        asyncOperationsClient.getAsyncOperation(
            GetAsyncOperationRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .asyncOperationKey(targetAsyncOperationKey)
                .opcRequestId(requestId("get-async-operation"))
                .build());

    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertFalse(isBlank(response.getOpcRequestId()), "opc-request-id should be present");

    AsyncOperation asyncOperation = response.getAsyncOperation();
    assertNotNull(asyncOperation, "async operation should be present");
    assertFalse(isBlank(asyncOperation.getKey()), "async operation key should be present");
    assertNotNull(asyncOperation.getActionType(), "actionType should be present");
    assertNotNull(asyncOperation.getResourceType(), "resourceType should be present");
    assertNotNull(asyncOperation.getStatus(), "status should be present");
  }

  @AfterClass(alwaysRun = true)
  public void cleanup() {
    if (asyncOperationsClient != null) {
      asyncOperationsClient.close();
    }
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
