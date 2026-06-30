package com.oracle.aidp.sdk.usersetting;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import com.oracle.aidp.sdk.client.SdkClients;
import com.oracle.aidp.sdk.config.SdkTestConfig;
import com.oracle.aidp.sdk.support.SdkTestSupport;
import com.oracle.aidataplatform.dp.model.GitAccountProviderName;
import com.oracle.aidataplatform.dp.model.GitAccountUserSetting;
import com.oracle.aidataplatform.dp.UserSettingClient;
import com.oracle.aidataplatform.dp.model.CreateUserSettingDetails;
import com.oracle.aidataplatform.dp.model.SortOrder;
import com.oracle.aidataplatform.dp.model.UpdateUserSettingDetails;
import com.oracle.aidataplatform.dp.model.UserSetting;
import com.oracle.aidataplatform.dp.requests.CreateUserSettingRequest;
import com.oracle.aidataplatform.dp.requests.DeleteUserSettingRequest;
import com.oracle.aidataplatform.dp.requests.GetUserSettingRequest;
import com.oracle.aidataplatform.dp.requests.ListUserSettingsRequest;
import com.oracle.aidataplatform.dp.requests.UpdateUserSettingRequest;
import com.oracle.aidataplatform.dp.responses.CreateUserSettingResponse;
import com.oracle.aidataplatform.dp.responses.DeleteUserSettingResponse;
import com.oracle.aidataplatform.dp.responses.GetUserSettingResponse;
import com.oracle.aidataplatform.dp.responses.ListUserSettingsResponse;
import com.oracle.aidataplatform.dp.responses.UpdateUserSettingResponse;
import java.util.UUID;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserSettingSdkIT {
  private SdkTestConfig config;
  private UserSettingClient userSettingClient;

  private String deleteUserSettingIfMatch;
  private String listUserSettingsDisplayName;
  private String listUserSettingsIsDefault;
  private String listUserSettingsLimit;
  private String listUserSettingsPage;
  private String listUserSettingsSettingType;
  private String listUserSettingsSortBy;
  private String listUserSettingsSortOrder;
  private String createUserSettingRetryToken;
  private String updateUserSettingIfMatch;

  private String createdSettingKey;
  private boolean createdSettingDeleted;

  @BeforeClass(alwaysRun = true, groups = {"sdk_tests", "sdk_user_setting", "user_setting", "rel_validation"})
  public void setUp() throws Exception {
    config = SdkTestConfig.load();
    userSettingClient = SdkClients.userSettingClient(config);

    deleteUserSettingIfMatch = config.value("deleteUserSettingIfMatch", "");
    listUserSettingsDisplayName = config.value("listUserSettingsDisplayName", "");
    listUserSettingsIsDefault = config.value("listUserSettingsIsDefault", "");
    listUserSettingsLimit = config.value("listUserSettingsLimit", "50");
    listUserSettingsPage = config.value("listUserSettingsPage", "");
    listUserSettingsSettingType = config.value("listUserSettingsSettingType", "");
    listUserSettingsSortBy = config.value("listUserSettingsSortBy", "timeCreated");
    listUserSettingsSortOrder = config.value("listUserSettingsSortOrder", "DESC");
    createUserSettingRetryToken = config.value("createUserSettingRetryToken", "");
    updateUserSettingIfMatch = config.value("updateUserSettingIfMatch", "");
  }

  @Test(groups = {"sdk_tests", "sdk_user_setting", "user_setting", "rel_validation"})
  public void listUserSettings() {
    ListUserSettingsRequest.Builder request =
        ListUserSettingsRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .limit(parsePositiveInt(listUserSettingsLimit, "listUserSettingsLimit"))
            .opcRequestId(requestId("list-user-settings"));

    if (!isBlank(listUserSettingsDisplayName)) {
      request.displayName(listUserSettingsDisplayName);
    }
    if (!isBlank(listUserSettingsIsDefault)) {
      request.isDefault(parseBoolean(listUserSettingsIsDefault, "listUserSettingsIsDefault"));
    }
    if (!isBlank(listUserSettingsPage)) {
      request.page(listUserSettingsPage);
    }
    if (!isBlank(listUserSettingsSettingType)) {
      request.settingType(ListUserSettingsRequest.SettingType.create(listUserSettingsSettingType));
    }
    if (!isBlank(listUserSettingsSortBy)) {
      request.sortBy(ListUserSettingsRequest.SortBy.create(listUserSettingsSortBy));
    }
    if (!isBlank(listUserSettingsSortOrder)) {
      request.sortOrder(SortOrder.create(listUserSettingsSortOrder));
    }

    ListUserSettingsResponse response = userSettingClient.listUserSettings(request.build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getUserSettingCollection(), "user setting collection should be present");
    assertNotNull(response.getUserSettingCollection().getItems(), "user setting items should be present");
  }

  @Test(
      groups = {"sdk_tests", "sdk_user_setting", "user_setting", "rel_validation"},
      dependsOnMethods = {"createUserSetting"})
  public void getUserSetting() {
    if (isBlank(createdSettingKey)) {
      throw new SkipException("No user setting was created in this test run.");
    }

    GetUserSettingResponse response =
        userSettingClient.getUserSetting(
            GetUserSettingRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .settingKey(createdSettingKey)
                .opcRequestId(requestId("get-user-setting"))
                .build());

    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertFalse(isBlank(response.getOpcRequestId()), "opc-request-id should be present");
    UserSetting userSetting = response.getUserSetting();
    assertNotNull(userSetting, "user setting should be present");
    assertEquals(userSetting.getKey(), createdSettingKey, "retrieved setting key should match request key");
  }

  @Test(
      groups = {"sdk_tests", "sdk_user_setting", "user_setting", "rel_validation"},
      dependsOnMethods = {"listUserSettings"})
  public void createUserSetting() {
    CreateUserSettingRequest.Builder request =
        CreateUserSettingRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .createUserSettingDetails(createUserSettingDetails())
            .opcRequestId(requestId("create-user-setting"));
    if (!isBlank(createUserSettingRetryToken)) {
      request.opcRetryToken(createUserSettingRetryToken);
    }

    CreateUserSettingResponse response = userSettingClient.createUserSetting(request.build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertFalse(isBlank(response.getOpcRequestId()), "opc-request-id should be present");
    assertNotNull(response.getUserSetting(), "created user setting should be present");
    createdSettingKey = response.getUserSetting().getKey();
    assertFalse(isBlank(createdSettingKey), "create response should contain key");
  }

  @Test(
      groups = {"sdk_tests", "sdk_user_setting", "user_setting", "rel_validation"},
      dependsOnMethods = {"getUserSetting"})
  public void updateUserSetting() {
    if (isBlank(createdSettingKey)) {
      throw new SkipException("No created setting key available; skipping update");
    }

    UpdateUserSettingRequest.Builder request =
        UpdateUserSettingRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .settingKey(createdSettingKey)
            .updateUserSettingDetails(updateUserSettingDetails())
            .opcRequestId(requestId("update-user-setting"));
    if (!isBlank(updateUserSettingIfMatch)) {
      request.ifMatch(updateUserSettingIfMatch);
    }

    UpdateUserSettingResponse response = userSettingClient.updateUserSetting(request.build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertFalse(isBlank(response.getOpcRequestId()), "opc-request-id should be present");
    assertNotNull(response.getUserSetting(), "updated user setting should be present");
    assertEquals(response.getUserSetting().getKey(), createdSettingKey, "updated setting key should match request key");
  }

  @Test(
      groups = {"sdk_tests", "sdk_user_setting", "user_setting", "rel_validation"},
      dependsOnMethods = {"updateUserSetting"})
  public void deleteCreatedUserSetting() {
    if (isBlank(createdSettingKey)) {
      throw new SkipException("No created setting key available; skipping delete");
    }

    DeleteUserSettingRequest.Builder request =
        DeleteUserSettingRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .settingKey(createdSettingKey)
            .opcRequestId(requestId("delete-user-setting"));
    if (!isBlank(deleteUserSettingIfMatch)) {
      request.ifMatch(deleteUserSettingIfMatch);
    }

    DeleteUserSettingResponse response = userSettingClient.deleteUserSetting(request.build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertFalse(isBlank(response.getOpcRequestId()), "opc-request-id should be present");
    createdSettingDeleted = true;
  }

  @AfterClass(alwaysRun = true)
  public void cleanup() {
    try {
      if (!isBlank(createdSettingKey) && !createdSettingDeleted) {
        userSettingClient.deleteUserSetting(
            DeleteUserSettingRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .settingKey(createdSettingKey)
                .opcRequestId(requestId("cleanup-user-setting"))
                .build());
      }
    } catch (Exception ignored) {
      // Best-effort cleanup.
    } finally {
      if (userSettingClient != null) {
        userSettingClient.close();
      }
    }
  }

  private CreateUserSettingDetails createUserSettingDetails() {
    return CreateUserSettingDetails.builder()
        .name("sdk-git-setting-it-" + UUID.randomUUID().toString().substring(0, 8))
        .isDefault(false)
        .data(gitAccountUserSetting("sdk-it-user", "sdk-it-token-" + UUID.randomUUID()))
        .build();
  }

  private UpdateUserSettingDetails updateUserSettingDetails() {
    return UpdateUserSettingDetails.builder()
        .name("sdk-git-setting-updated-it-" + UUID.randomUUID().toString().substring(0, 8))
        .isDefault(false)
        .data(gitAccountUserSetting("sdk-it-user-updated", "sdk-it-token-" + UUID.randomUUID()))
        .build();
  }

  private GitAccountUserSetting gitAccountUserSetting(String username, String personalAccessToken) {
    return GitAccountUserSetting.builder()
        .providerName(GitAccountProviderName.Github)
        .entityType(GitAccountUserSetting.EntityType.PersonalAccessToken)
        .username(username)
        .personalAccessToken(personalAccessToken)
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

  private static boolean isBlank(String value) {
    return value == null || value.isBlank();
  }
}
