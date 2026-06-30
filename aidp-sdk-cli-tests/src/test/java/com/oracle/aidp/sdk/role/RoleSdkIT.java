package com.oracle.aidp.sdk.role;

import static com.oracle.aidp.sdk.support.SdkTestSupport.assertSuccessful;
import static com.oracle.aidp.sdk.support.SdkTestSupport.isBlank;
import static com.oracle.aidp.sdk.support.SdkTestSupport.requestId;
import static com.oracle.aidp.sdk.support.SdkTestSupport.requireValue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import com.oracle.aidp.sdk.client.SdkClients;
import com.oracle.aidp.sdk.config.SdkTestConfig;
import com.oracle.aidataplatform.dp.RoleClient;
import com.oracle.aidataplatform.dp.model.AddMemberToRoleDetails;
import com.oracle.aidataplatform.dp.model.CreateRoleDetails;
import com.oracle.aidataplatform.dp.model.GetRoleScopeType;
import com.oracle.aidataplatform.dp.model.ListRolePermissionScopeType;
import com.oracle.aidataplatform.dp.model.RemoveMemberFromRoleDetails;
import com.oracle.aidataplatform.dp.model.RoleAssignee;
import com.oracle.aidataplatform.dp.model.RoleAssigneeType;
import com.oracle.aidataplatform.dp.model.SortOrder;
import com.oracle.aidataplatform.dp.model.UpdateRoleDetails;
import com.oracle.aidataplatform.dp.requests.AddMemberToRoleRequest;
import com.oracle.aidataplatform.dp.requests.CreateRoleRequest;
import com.oracle.aidataplatform.dp.requests.DeleteRoleRequest;
import com.oracle.aidataplatform.dp.requests.GetRoleRequest;
import com.oracle.aidataplatform.dp.requests.ListRolePermissionsRequest;
import com.oracle.aidataplatform.dp.requests.ListRolesRequest;
import com.oracle.aidataplatform.dp.requests.RemoveMemberFromRoleRequest;
import com.oracle.aidataplatform.dp.requests.UpdateRoleRequest;
import com.oracle.aidataplatform.dp.responses.CreateRoleResponse;
import com.oracle.aidataplatform.dp.responses.DeleteRoleResponse;
import com.oracle.aidataplatform.dp.responses.GetRoleResponse;
import com.oracle.aidataplatform.dp.responses.ListRolePermissionsResponse;
import com.oracle.aidataplatform.dp.responses.ListRolesResponse;
import com.oracle.aidataplatform.dp.responses.UpdateRoleResponse;
import com.oracle.bmc.model.BmcException;
import java.util.List;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RoleSdkIT {
  private SdkTestConfig config;
  private RoleClient roleClient;
  private String createdRoleKey;
  private boolean createdRoleMemberAdded;

  @BeforeClass(
      alwaysRun = true,
      groups = {"sdk_tests", "sdk_role", "role", "rel_validation"})
  public void setUp() throws Exception {
    config = SdkTestConfig.load();
    roleClient = SdkClients.roleClient(config);
  }

  @Test(groups = {"sdk_tests", "sdk_role", "role", "rel_validation"}, priority = 0)
  public void listRolesTest() {
    ListRolesResponse response =
        roleClient.listRoles(
            ListRolesRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .limit(10)
                .sortBy(ListRolesRequest.SortBy.DisplayName)
                .sortOrder(SortOrder.Asc)
                .opcRequestId(requestId("list-roles"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getRoleCollection());
    assertNotNull(response.getRoleCollection().getItems());
  }

  @Test(groups = {"sdk_tests", "sdk_role", "role", "rel_validation"}, priority = 1)
  public void getRoleTest() {
    String roleKey = roleKey();

    GetRoleResponse response =
        roleClient.getRole(
            GetRoleRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .roleKey(roleKey)
                .roleScope(GetRoleScopeType.All)
                .opcRequestId(requestId("get-role"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getRole());
    assertEquals(response.getRole().getKey(), roleKey);
  }

  @Test(groups = {"sdk_tests", "sdk_role", "role", "rel_validation"}, priority = 2)
  public void listRolePermissionsTest() {
    String roleKey = roleKey();

    ListRolePermissionsResponse response =
        roleClient.listRolePermissions(
            ListRolePermissionsRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .roleKey(roleKey)
                .permissionScope(ListRolePermissionScopeType.All)
                .limit(10)
                .sortOrder(SortOrder.Asc)
                .opcRequestId(requestId("list-role-permissions"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getRolePermissionCollection());
    assertNotNull(response.getRolePermissionCollection().getItems());
  }

  @Test(groups = {"sdk_tests", "sdk_role", "role", "rel_validation"}, priority = 10)
  public void roleMutationFlowTest() {
    if (!config.runRoleMutationTests()) {
      throw new SkipException("Set sdkRunRoleMutationTests=true to run role mutation tests.");
    }
    deleteCreatedRoleFixtureIfPresent();

    String suffix = Long.toString(System.currentTimeMillis());
    String displayName = config.roleNamePrefix() + suffix;
    String updatedDisplayName = displayName + "_updated";

    CreateRoleResponse createResponse =
        roleClient.createRole(
            CreateRoleRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .createRoleDetails(
                    CreateRoleDetails.builder()
                        .displayName(displayName)
                        .description("Created by RoleSdkIT")
                        .build())
                .opcRetryToken(requestId("create-role-retry"))
                .opcRequestId(requestId("create-role"))
                .build());
    assertSuccessful(createResponse.get__httpStatusCode__());
    assertNotNull(createResponse.getRole());
    createdRoleKey = createResponse.getRole().getKey();
    assertNotNull(createdRoleKey);
    assertEquals(createResponse.getRole().getDisplayName(), displayName);

    GetRoleResponse getResponse = getRole(createdRoleKey);
    assertSuccessful(getResponse.get__httpStatusCode__());
    assertNotNull(getResponse.getRole());
    assertEquals(getResponse.getRole().getKey(), createdRoleKey);

    ListRolePermissionsResponse permissionsResponse = listRolePermissions(createdRoleKey);
    assertSuccessful(permissionsResponse.get__httpStatusCode__());
    assertNotNull(permissionsResponse.getRolePermissionCollection());
    assertNotNull(permissionsResponse.getRolePermissionCollection().getItems());

    UpdateRoleResponse updateResponse =
        roleClient.updateRole(
            UpdateRoleRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .roleKey(createdRoleKey)
                .updateRoleDetails(
                    UpdateRoleDetails.builder()
                        .displayName(updatedDisplayName)
                        .description("Updated by RoleSdkIT")
                        .build())
                .opcRequestId(requestId("update-role"))
                .build());
    assertSuccessful(updateResponse.get__httpStatusCode__());
    assertNotNull(updateResponse.getRole());
    assertNotNull(updateResponse.getRole().getKey());
    assertEquals(updateResponse.getRole().getDisplayName(), updatedDisplayName);
    createdRoleKey = updateResponse.getRole().getKey();

    if (config.runRoleMemberMutationTests()) {
      RoleAssignee assignee = roleAssignee();
      assertSuccessful(addMember(createdRoleKey, assignee).get__httpStatusCode__());
      createdRoleMemberAdded = true;
      assertSuccessful(removeMember(createdRoleKey, assignee).get__httpStatusCode__());
      createdRoleMemberAdded = false;
    }

    DeleteRoleResponse deleteResponse = deleteRole(createdRoleKey);
    assertSuccessful(deleteResponse.get__httpStatusCode__());
    assertNotNull(deleteResponse.getOpcRequestId());
    createdRoleKey = null;
  }

  @AfterClass(
      alwaysRun = true,
      groups = {"sdk_tests", "sdk_role", "role", "rel_validation"})
  public void tearDown() {
    if (createdRoleKey != null) {
      if (createdRoleMemberAdded) {
        try {
          removeMember(createdRoleKey, roleAssignee());
        } catch (BmcException e) {
          if (e.getStatusCode() != 404) {
            throw e;
          }
        }
      }
      try {
        deleteRole(createdRoleKey);
      } catch (BmcException e) {
        if (e.getStatusCode() != 404) {
          throw e;
        }
      }
    }
    if (roleClient != null) {
      roleClient.close();
    }
  }

  private GetRoleResponse getRole(String roleKey) {
    return roleClient.getRole(
        GetRoleRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .roleKey(roleKey)
            .roleScope(GetRoleScopeType.All)
            .opcRequestId(requestId("get-role"))
            .build());
  }

  private void deleteCreatedRoleFixtureIfPresent() {
    if (createdRoleKey == null) {
      return;
    }
    try {
      deleteRole(createdRoleKey);
    } catch (BmcException e) {
      if (e.getStatusCode() != 404) {
        throw e;
      }
    } finally {
      createdRoleKey = null;
    }
  }

  private String roleKey() {
    if (!isBlank(config.roleKey())) {
      return config.roleKey();
    }
    ListRolesResponse response =
        roleClient.listRoles(
            ListRolesRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .limit(1)
                .sortBy(ListRolesRequest.SortBy.DisplayName)
                .sortOrder(SortOrder.Asc)
                .opcRequestId(requestId("list-role-for-key"))
                .build());
    assertSuccessful(response.get__httpStatusCode__());
    if (response.getRoleCollection() == null
        || response.getRoleCollection().getItems() == null
        || response.getRoleCollection().getItems().isEmpty()) {
      if (config.runRoleMutationTests()) {
        return createRoleFixture();
      }
      throw new IllegalStateException("No role is available for SDK role tests.");
    }
    return response.getRoleCollection().getItems().get(0).getKey();
  }

  private String createRoleFixture() {
    String displayName = config.roleNamePrefix() + "fixture_" + System.currentTimeMillis();
    CreateRoleResponse createResponse =
        roleClient.createRole(
            CreateRoleRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .createRoleDetails(
                    CreateRoleDetails.builder()
                        .displayName(displayName)
                        .description("Created by RoleSdkIT fixture")
                        .build())
                .opcRetryToken(requestId("create-role-fixture-retry"))
                .opcRequestId(requestId("create-role-fixture"))
                .build());
    assertSuccessful(createResponse.get__httpStatusCode__());
    assertNotNull(createResponse.getRole(), "created role fixture should be present");
    createdRoleKey = createResponse.getRole().getKey();
    assertNotNull(createdRoleKey, "created role fixture key should be present");
    return createdRoleKey;
  }

  private ListRolePermissionsResponse listRolePermissions(String roleKey) {
    return roleClient.listRolePermissions(
        ListRolePermissionsRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .roleKey(roleKey)
            .permissionScope(ListRolePermissionScopeType.All)
            .limit(10)
            .sortOrder(SortOrder.Asc)
            .opcRequestId(requestId("list-role-permissions"))
            .build());
  }

  private com.oracle.aidataplatform.dp.responses.AddMemberToRoleResponse addMember(
      String roleKey, RoleAssignee assignee) {
    return roleClient.addMemberToRole(
        AddMemberToRoleRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .roleKey(roleKey)
            .addMemberToRoleDetails(
                AddMemberToRoleDetails.builder().assignees(List.of(assignee)).build())
            .opcRetryToken(requestId("add-role-member-retry"))
            .opcRequestId(requestId("add-role-member"))
            .build());
  }

  private com.oracle.aidataplatform.dp.responses.RemoveMemberFromRoleResponse removeMember(
      String roleKey, RoleAssignee assignee) {
    return roleClient.removeMemberFromRole(
        RemoveMemberFromRoleRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .roleKey(roleKey)
            .removeMemberFromRoleDetails(
                RemoveMemberFromRoleDetails.builder().assignees(List.of(assignee)).build())
            .opcRetryToken(requestId("remove-role-member-retry"))
            .opcRequestId(requestId("remove-role-member"))
            .build());
  }

  private DeleteRoleResponse deleteRole(String roleKey) {
    return roleClient.deleteRole(
        DeleteRoleRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .roleKey(roleKey)
            .opcRequestId(requestId("delete-role"))
            .build());
  }

  private RoleAssignee roleAssignee() {
    String target = requireValue(config, "sdkRoleMemberTarget");
    String targetName = config.roleMemberTargetName();
    RoleAssignee.Builder builder =
        RoleAssignee.builder()
            .type(RoleAssigneeType.create(config.roleMemberAssigneeType()))
            .target(target);
    if (!isBlank(targetName)) {
      builder.targetName(targetName);
    }
    return builder.build();
  }
}
