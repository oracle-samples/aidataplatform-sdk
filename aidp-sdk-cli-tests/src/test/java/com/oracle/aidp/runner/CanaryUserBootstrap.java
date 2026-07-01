package com.oracle.aidp.runner;

import com.oracle.aidataplatform.dp.RoleClient;
import com.oracle.aidataplatform.dp.model.AddMemberToRoleDetails;
import com.oracle.aidataplatform.dp.model.GetRoleScopeType;
import com.oracle.aidataplatform.dp.model.RoleAssignee;
import com.oracle.aidataplatform.dp.model.RoleAssigneeType;
import com.oracle.aidataplatform.dp.requests.AddMemberToRoleRequest;
import com.oracle.aidataplatform.dp.requests.GetRoleRequest;
import com.oracle.aidataplatform.dp.responses.GetRoleResponse;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.ResourcePrincipalAuthenticationDetailsProvider;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.User;
import com.oracle.bmc.identity.requests.ListUsersRequest;
import com.oracle.bmc.identity.responses.ListUsersResponse;
import com.oracle.bmc.keymanagement.KmsVaultClient;
import com.oracle.bmc.keymanagement.model.VaultSummary;
import com.oracle.bmc.keymanagement.requests.ListVaultsRequest;
import com.oracle.bmc.keymanagement.responses.ListVaultsResponse;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.secrets.SecretsClient;
import com.oracle.bmc.secrets.model.Base64SecretBundleContentDetails;
import com.oracle.bmc.secrets.model.SecretBundleContentDetails;
import com.oracle.bmc.secrets.requests.GetSecretBundleByNameRequest;
import com.oracle.bmc.secrets.responses.GetSecretBundleByNameResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Base64;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

final class CanaryUserBootstrap {
  private static final String DATA_LAKE_ADMIN_ROLE = "AI_DATA_PLATFORM_ADMIN";

  private CanaryUserBootstrap() {}

  static void bootstrapIfEnabled() throws Exception {
    if (!booleanValue("canaryUserBootstrapEnabled", false)) {
      return;
    }

    BootstrapConfig config = BootstrapConfig.load();
    System.out.println(
        "[AIDP-SDK-CLI-TEST-RUNNER] canaryUserBootstrapEnabled=true, user="
            + config.canaryUser()
            + ", vaultName="
            + valueOrUnset(config.canaryUserVaultName())
            + ", vaultId="
            + valueOrUnset(config.vaultId())
            + ", grantAdminEnabled="
            + config.grantAdminEnabled()
            + ", grantAdminRequired="
            + config.grantAdminRequired());

    ResourcePrincipalAuthenticationDetailsProvider rootProvider =
        ResourcePrincipalAuthenticationDetailsProvider.builder().build();
    String userOcid = resolveUserOcid(rootProvider, config);
    String vaultId = resolveVaultId(rootProvider, config);
    String fingerprint =
        readSecret(rootProvider, config, vaultId, config.canaryUserFingerprintSecretName());
    String privateKeyPem =
        readSecret(rootProvider, config, vaultId, config.canaryUserPemSecretName());

    writeApiKeyFiles(config, userOcid, fingerprint, privateKeyPem);
    if (config.grantAdminEnabled()) {
      try {
        ensureAdminRole(rootProvider, config, userOcid);
      } catch (BmcException e) {
        if (config.grantAdminRequired() || !isAuthorizationFailure(e)) {
          throw e;
        }
        System.out.println(
            "[AIDP-SDK-CLI-TEST-RUNNER] unable to ensure "
                + DATA_LAKE_ADMIN_ROLE
                + " assignment because the OCI DevOps resource principal is not authorized: status="
                + e.getStatusCode()
                + ", serviceCode="
                + e.getServiceCode()
                + ". Continuing because canaryUserGrantAdminRequired=false; "
                + config.canaryUser()
                + " is expected to be pre-provisioned with the required AIDP permissions.");
      }
    } else {
      System.out.println(
          "[AIDP-SDK-CLI-TEST-RUNNER] canary user admin grant disabled by config.");
    }

    System.setProperty("ociAuth", "api_key");
    System.setProperty("ociConfigFilePath", config.ociConfigFilePath().toString());
    System.setProperty("ociProfile", config.ociProfile());
    setIfBlank("userOcid", userOcid);
    setIfBlank("cliWorkspacePermissionTarget", userOcid);
    setIfBlank("cliCreateWorkspacePermissionTarget", userOcid);
    setIfBlank("cliWorkspaceObjectPermissionTarget", userOcid);
    setIfBlank("cliClusterPermissionTarget", userOcid);
    System.out.println(
        "[AIDP-SDK-CLI-TEST-RUNNER] canary user bootstrap complete; CLI auth=api_key, profile="
            + config.ociProfile()
            + ", config="
            + config.ociConfigFilePath());
  }

  private static String resolveUserOcid(
      ResourcePrincipalAuthenticationDetailsProvider provider, BootstrapConfig config) {
    if (!isBlank(config.canaryUserOcid())) {
      System.out.println(
          "[AIDP-SDK-CLI-TEST-RUNNER] using configured canary user OCID for "
              + config.canaryUser()
              + ": "
              + config.canaryUserOcid());
      return config.canaryUserOcid();
    }

    try (IdentityClient identityClient =
        IdentityClient.builder().region(Region.fromRegionId(config.homeRegion())).build(provider)) {
      String page = null;
      do {
        ListUsersResponse response =
            identityClient.listUsers(
                ListUsersRequest.builder()
                    .compartmentId(config.tenancy())
                    .page(page)
                    .limit(1000)
                    .build());
        for (User user : response.getItems()) {
          if (config.canaryUser().equals(user.getName())) {
            System.out.println(
                "[AIDP-SDK-CLI-TEST-RUNNER] resolved canary user "
                    + config.canaryUser()
                    + " to "
                    + user.getId());
            return user.getId();
          }
        }
        page = response.getOpcNextPage();
      } while (!isBlank(page));
    }
    throw new IllegalStateException(
        "Canary user '" + config.canaryUser() + "' was not found in tenancy " + config.tenancy());
  }

  private static String resolveVaultId(
      ResourcePrincipalAuthenticationDetailsProvider provider, BootstrapConfig config) {
    if (!isBlank(config.canaryUserVaultName())) {
      try (KmsVaultClient kmsVaultClient = new KmsVaultClient(provider)) {
        kmsVaultClient.setRegion(Region.fromRegionId(config.homeRegion()));
        String page = null;
        do {
          ListVaultsResponse response =
              kmsVaultClient.listVaults(
                  ListVaultsRequest.builder().compartmentId(config.tenancy()).page(page).build());
          for (VaultSummary vault : response.getItems()) {
            if (config.canaryUserVaultName().equals(vault.getDisplayName())) {
              System.out.println(
                  "[AIDP-SDK-CLI-TEST-RUNNER] resolved canary user vault "
                      + config.canaryUserVaultName()
                      + " in "
                      + config.homeRegion()
                      + " to "
                      + vault.getId());
              return vault.getId();
            }
          }
          page = response.getOpcNextPage();
        } while (!isBlank(page));
        System.out.println(
            "[AIDP-SDK-CLI-TEST-RUNNER] canary user vault name "
                + config.canaryUserVaultName()
                + " was not found in tenancy "
                + config.tenancy()
                + " and region "
                + config.homeRegion()
                + ".");
      } catch (BmcException e) {
        System.out.println(
            "[AIDP-SDK-CLI-TEST-RUNNER] unable to resolve canary user vault name "
                + config.canaryUserVaultName()
                + ": status="
                + e.getStatusCode()
                + ", serviceCode="
                + e.getServiceCode()
                + ", message="
                + e.getMessage());
        if (isBlank(config.vaultId())) {
          throw e;
        }
      }
    }

    if (!isBlank(config.vaultId())) {
      System.out.println(
          "[AIDP-SDK-CLI-TEST-RUNNER] using configured canary user vault OCID: "
              + config.vaultId());
      return config.vaultId();
    }

    throw new IllegalArgumentException(
        "Missing required canary bootstrap property: canaryUserVaultName, userVault, canaryUserVaultId, or vaultId");
  }

  private static String readSecret(
      ResourcePrincipalAuthenticationDetailsProvider provider,
      BootstrapConfig config,
      String vaultId,
      String secretName) {
    System.out.println(
        "[AIDP-SDK-CLI-TEST-RUNNER] reading canary secret "
            + secretName
            + " from vault "
            + vaultId
            + " in "
            + config.homeRegion());
    try (SecretsClient secretsClient =
        SecretsClient.builder().region(Region.fromRegionId(config.homeRegion())).build(provider)) {
      GetSecretBundleByNameResponse response =
          secretsClient.getSecretBundleByName(
              GetSecretBundleByNameRequest.builder()
                  .vaultId(vaultId)
                  .secretName(secretName)
                  .stage(GetSecretBundleByNameRequest.Stage.Current)
                  .build());
      SecretBundleContentDetails content =
          response.getSecretBundle().getSecretBundleContent();
      if (!(content instanceof Base64SecretBundleContentDetails base64Content)) {
        throw new IllegalStateException("Secret '" + secretName + "' is not base64 content.");
      }
      return new String(
              Base64.getDecoder().decode(base64Content.getContent()), StandardCharsets.UTF_8)
          .trim();
    }
  }

  private static void writeApiKeyFiles(
      BootstrapConfig config, String userOcid, String fingerprint, String privateKeyPem)
      throws IOException {
    Files.createDirectories(config.ociConfigFilePath().getParent());
    Files.createDirectories(config.privateKeyPath().getParent());
    String pemText = privateKeyPem.endsWith("\n") ? privateKeyPem : privateKeyPem + "\n";
    Files.writeString(config.privateKeyPath(), pemText, StandardCharsets.UTF_8);
    secureFile(config.privateKeyPath());

    String configText =
        String.join(
            System.lineSeparator(),
            List.of(
                "[" + config.ociProfile() + "]",
                "user=" + userOcid,
                "fingerprint=" + fingerprint,
                "tenancy=" + config.tenancy(),
                "region=" + config.region(),
                "key_file=" + config.privateKeyPath(),
                ""));
    Files.writeString(config.ociConfigFilePath(), configText, StandardCharsets.UTF_8);
    secureFile(config.ociConfigFilePath());
    System.out.println(
        "[AIDP-SDK-CLI-TEST-RUNNER] wrote canary user OCI config to "
            + config.ociConfigFilePath());
  }

  private static void ensureAdminRole(
      ResourcePrincipalAuthenticationDetailsProvider provider,
      BootstrapConfig config,
      String userOcid)
      throws Exception {
    System.out.println(
        "[AIDP-SDK-CLI-TEST-RUNNER] ensuring "
            + DATA_LAKE_ADMIN_ROLE
            + " assignment using OCI DevOps resource principal.");
    try (RoleClient roleClient =
        RoleClient.builder().endpoint(config.dpServiceEndpoint()).build(provider)) {
      GetRoleResponse roleResponse =
          roleClient.getRole(
              GetRoleRequest.builder()
                  .aiDataPlatformId(config.dataHubId())
                  .roleKey(DATA_LAKE_ADMIN_ROLE)
                  .roleScope(GetRoleScopeType.Admin)
                  .opcRequestId(requestId("get-admin-role"))
                  .build());
      boolean assigned =
          roleResponse.getRole().getAssignees() != null
              && roleResponse.getRole().getAssignees().stream()
                  .anyMatch(assignee -> userOcid.equals(assignee.getTarget()));
      if (assigned) {
        System.out.println(
            "[AIDP-SDK-CLI-TEST-RUNNER] "
                + DATA_LAKE_ADMIN_ROLE
                + " is already assigned to "
                + config.canaryUser());
        return;
      }

      System.out.println(
          "[AIDP-SDK-CLI-TEST-RUNNER] assigning "
              + DATA_LAKE_ADMIN_ROLE
              + " to "
              + config.canaryUser());
      RoleAssignee assignee =
          RoleAssignee.builder()
              .type(RoleAssigneeType.User)
              .target(userOcid)
              .targetName(config.canaryUser())
              .build();
      try {
        roleClient.addMemberToRole(
            AddMemberToRoleRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .roleKey(DATA_LAKE_ADMIN_ROLE)
                .addMemberToRoleDetails(
                    AddMemberToRoleDetails.builder().assignees(List.of(assignee)).build())
                .opcRequestId(requestId("add-admin-role"))
                .opcRetryToken(UUID.randomUUID().toString())
                .build());
      } catch (BmcException e) {
        String message = Objects.toString(e.getMessage(), "").toLowerCase(Locale.ROOT);
        if ((e.getStatusCode() == 400 || e.getStatusCode() == 409)
            && message.contains("already")) {
          System.out.println(
              "[AIDP-SDK-CLI-TEST-RUNNER] "
                  + DATA_LAKE_ADMIN_ROLE
                  + " assignment already exists for "
                  + config.canaryUser());
          return;
        }
        throw e;
      }

      if (config.grantPropagationSeconds() > 0) {
        System.out.println(
            "[AIDP-SDK-CLI-TEST-RUNNER] waiting "
                + config.grantPropagationSeconds()
                + "s for role propagation.");
        Thread.sleep(config.grantPropagationSeconds() * 1000L);
      }
    }
  }

  private static String requestId(String prefix) {
    return "aidp-sdk-cli-tests-bootstrap-" + prefix + "-" + UUID.randomUUID();
  }

  private static boolean isAuthorizationFailure(BmcException e) {
    int status = e.getStatusCode();
    String serviceCode = Objects.toString(e.getServiceCode(), "").toLowerCase(Locale.ROOT);
    String message = Objects.toString(e.getMessage(), "").toLowerCase(Locale.ROOT);
    return status == 401
        || status == 403
        || (status == 404
            && (serviceCode.contains("notauthorized")
                || message.contains("not authorized")
                || message.contains("notauthorized")
                || message.contains("notauthenticated")))
        || serviceCode.contains("notauthenticated")
        || serviceCode.contains("notauthorized");
  }

  private static void secureFile(Path path) {
    try {
      Files.setPosixFilePermissions(
          path,
          EnumSet.of(PosixFilePermission.OWNER_READ, PosixFilePermission.OWNER_WRITE));
    } catch (UnsupportedOperationException | IOException ignored) {
      // Some local filesystems do not support POSIX permissions.
    }
  }

  private static void setIfBlank(String key, String value) {
    if (isBlank(System.getProperty(key)) && !isBlank(value)) {
      System.setProperty(key, value);
    }
  }

  private static String required(String key) {
    String value = System.getProperty(key);
    if (isBlank(value)) {
      throw new IllegalArgumentException("Missing required canary bootstrap property: " + key);
    }
    return value.trim();
  }

  private static String value(String key, String defaultValue) {
    String value = System.getProperty(key);
    return isBlank(value) ? defaultValue : value.trim();
  }

  private static boolean booleanValue(String key, boolean defaultValue) {
    String value = value(key, Boolean.toString(defaultValue));
    if ("true".equalsIgnoreCase(value) || "false".equalsIgnoreCase(value)) {
      return Boolean.parseBoolean(value);
    }
    throw new IllegalArgumentException(key + " must be true or false: " + value);
  }

  private static int intValue(String key, int defaultValue) {
    String value = value(key, Integer.toString(defaultValue));
    try {
      return Integer.parseInt(value);
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException(key + " must be an integer: " + value, e);
    }
  }

  private static boolean isBlank(String value) {
    return value == null || value.isBlank();
  }

  private static String valueOrUnset(String value) {
    return isBlank(value) ? "<unset>" : value;
  }

  private record BootstrapConfig(
      String dataHubId,
      String dpServiceEndpoint,
      String region,
      String homeRegion,
      String tenancy,
      String canaryUser,
      String canaryUserOcid,
      String vaultId,
      String canaryUserVaultName,
      String canaryUserFingerprintSecretName,
      String canaryUserPemSecretName,
      boolean grantAdminEnabled,
      boolean grantAdminRequired,
      int grantPropagationSeconds,
      Path ociConfigFilePath,
      String ociProfile,
      Path privateKeyPath) {

    static BootstrapConfig load() {
      String canaryUser = value("canaryUser", "aidp_iam_admin_user1");
      Path configPath =
          Path.of(
                  value(
                      "ociConfigFilePath",
                      Path.of("target", "aidp-sdk-cli-tests", "oci", "config").toString()))
              .toAbsolutePath()
              .normalize();
      Path keyPath =
          Path.of(
                  value(
                      "canaryUserKeyFilePath",
                      configPath.getParent().resolve(canaryUser + "_api_key.pem").toString()))
              .toAbsolutePath()
              .normalize();
      String vaultId = value("canaryUserVaultId", value("vaultId", null));
      String vaultName = value("canaryUserVaultName", value("userVault", null));
      if (isBlank(vaultId) && isBlank(vaultName)) {
        throw new IllegalArgumentException(
            "Missing required canary bootstrap property: canaryUserVaultName, userVault, canaryUserVaultId, or vaultId");
      }

      return new BootstrapConfig(
          required("dataHubId"),
          required("dpServiceEndpoint"),
          required("region"),
          value("homeRegion", required("region")),
          required("tenancy"),
          canaryUser,
          value("canaryUserOcid", value("userOcid", null)),
          vaultId,
          vaultName,
          value("canaryUserFingerprintSecretName", "UserFingerPrintSecrets"),
          value("canaryUserPemSecretName", "UserPemFileSecrets"),
          booleanValue("canaryUserGrantAdminEnabled", true),
          booleanValue("canaryUserGrantAdminRequired", false),
          intValue("canaryUserGrantPropagationSeconds", 15),
          configPath,
          value("ociProfile", canaryUser),
          keyPath);
    }
  }
}
