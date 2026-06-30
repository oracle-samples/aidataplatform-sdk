package com.oracle.aidp.sdk.client;

import com.oracle.aidp.sdk.config.SdkTestConfig;
import com.oracle.aidp.sdk.logging.SdkHttpLoggingConfigurator;
import com.oracle.aidataplatform.dp.AsyncOperationsClient;
import com.oracle.aidataplatform.dp.AuditClient;
import com.oracle.aidataplatform.dp.BundleClient;
import com.oracle.aidataplatform.dp.CatalogClient;
import com.oracle.aidataplatform.dp.ClusterClient;
import com.oracle.aidataplatform.dp.CredentialsClient;
import com.oracle.aidataplatform.dp.DeltaShareClient;
import com.oracle.aidataplatform.dp.GitClient;
import com.oracle.aidataplatform.dp.MLOpsClient;
import com.oracle.aidataplatform.dp.NotebookClient;
import com.oracle.aidataplatform.dp.RoleClient;
import com.oracle.aidataplatform.dp.SchemaClient;
import com.oracle.aidataplatform.dp.UserSettingClient;
import com.oracle.aidataplatform.dp.VolumeClient;
import com.oracle.aidataplatform.dp.WorkflowClient;
import com.oracle.aidataplatform.dp.WorkspaceClient;
import com.oracle.aidataplatform.dp.WorkspaceObjectClient;
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.auth.SessionTokenAuthenticationDetailsProvider;
import com.oracle.bmc.common.RegionalClientBuilder;

public final class SdkClients {
  private static final String CONFIG_SECURITY_TOKEN_FILE = "security_token_file";

  private SdkClients() {}

  public static AuthenticationDetailsProvider authenticationProvider(SdkTestConfig config)
      throws Exception {
    ConfigFileReader.ConfigFile configFile =
        ConfigFileReader.parse(config.configFile(), config.profile());
    if (!isBlank(configFile.get(CONFIG_SECURITY_TOKEN_FILE))) {
      return new SessionTokenAuthenticationDetailsProvider(configFile);
    }
    return new ConfigFileAuthenticationDetailsProvider(configFile);
  }

  public static WorkspaceClient workspaceClient(SdkTestConfig config) throws Exception {
    WorkspaceClient.Builder builder = WorkspaceClient.builder();
    configure(builder, config);
    return builder.build((AbstractAuthenticationDetailsProvider) authenticationProvider(config));
  }

  public static ClusterClient clusterClient(SdkTestConfig config) throws Exception {
    ClusterClient.Builder builder = ClusterClient.builder();
    configure(builder, config);
    return builder.build((AbstractAuthenticationDetailsProvider) authenticationProvider(config));
  }

  public static WorkspaceObjectClient workspaceObjectClient(SdkTestConfig config) throws Exception {
    WorkspaceObjectClient.Builder builder = WorkspaceObjectClient.builder();
    configure(builder, config);
    return builder.build((AbstractAuthenticationDetailsProvider) authenticationProvider(config));
  }

  public static CatalogClient catalogClient(SdkTestConfig config) throws Exception {
    CatalogClient.Builder builder = CatalogClient.builder();
    configure(builder, config);
    return builder.build((AbstractAuthenticationDetailsProvider) authenticationProvider(config));
  }

  public static CredentialsClient credentialsClient(SdkTestConfig config) throws Exception {
    CredentialsClient.Builder builder = CredentialsClient.builder();
    configure(builder, config);
    return builder.build((AbstractAuthenticationDetailsProvider) authenticationProvider(config));
  }

  public static UserSettingClient userSettingClient(SdkTestConfig config) throws Exception {
    UserSettingClient.Builder builder = UserSettingClient.builder();
    configure(builder, config);
    return builder.build((AbstractAuthenticationDetailsProvider) authenticationProvider(config));
  }

  public static GitClient gitClient(SdkTestConfig config) throws Exception {
    GitClient.Builder builder = GitClient.builder();
    configure(builder, config);
    return builder.build((AbstractAuthenticationDetailsProvider) authenticationProvider(config));
  }

  public static NotebookClient notebookClient(SdkTestConfig config) throws Exception {
    NotebookClient.Builder builder = NotebookClient.builder();
    configure(builder, config);
    return builder.build((AbstractAuthenticationDetailsProvider) authenticationProvider(config));
  }

  public static VolumeClient volumeClient(SdkTestConfig config) throws Exception {
    VolumeClient.Builder builder = VolumeClient.builder();
    configure(builder, config);
    return builder.build((AbstractAuthenticationDetailsProvider) authenticationProvider(config));
  }

  public static WorkflowClient workflowClient(SdkTestConfig config) throws Exception {
    WorkflowClient.Builder builder = WorkflowClient.builder();
    configure(builder, config);
    return builder.build((AbstractAuthenticationDetailsProvider) authenticationProvider(config));
  }

  public static AsyncOperationsClient asyncOperationsClient(SdkTestConfig config) throws Exception {
    AsyncOperationsClient.Builder builder = AsyncOperationsClient.builder();
    configure(builder, config);
    return builder.build((AbstractAuthenticationDetailsProvider) authenticationProvider(config));
  }

  public static AuditClient auditClient(SdkTestConfig config) throws Exception {
    AuditClient.Builder builder = AuditClient.builder();
    configure(builder, config);
    return builder.build((AbstractAuthenticationDetailsProvider) authenticationProvider(config));
  }

  public static BundleClient bundleClient(SdkTestConfig config) throws Exception {
    BundleClient.Builder builder = BundleClient.builder();
    configure(builder, config);
    return builder.build((AbstractAuthenticationDetailsProvider) authenticationProvider(config));
  }

  public static DeltaShareClient deltaShareClient(SdkTestConfig config) throws Exception {
    DeltaShareClient.Builder builder = DeltaShareClient.builder();
    configure(builder, config);
    return builder.build((AbstractAuthenticationDetailsProvider) authenticationProvider(config));
  }

  public static MLOpsClient mlOpsClient(SdkTestConfig config) throws Exception {
    MLOpsClient.Builder builder = MLOpsClient.builder();
    configure(builder, config);
    return builder.build((AbstractAuthenticationDetailsProvider) authenticationProvider(config));
  }

  public static RoleClient roleClient(SdkTestConfig config) throws Exception {
    RoleClient.Builder builder = RoleClient.builder();
    configure(builder, config);
    return builder.build((AbstractAuthenticationDetailsProvider) authenticationProvider(config));
  }

  public static SchemaClient schemaClient(SdkTestConfig config) throws Exception {
    SchemaClient.Builder builder = SchemaClient.builder();
    configure(builder, config);
    return builder.build((AbstractAuthenticationDetailsProvider) authenticationProvider(config));
  }

  private static <B extends RegionalClientBuilder<B, ?>> void configure(
      B builder, SdkTestConfig config) {
    if (!isBlank(config.endpoint())) {
      builder.endpoint(config.endpoint());
    } else {
      builder.region(config.region());
    }
    builder.additionalClientConfigurator(new SdkHttpLoggingConfigurator());
  }

  private static boolean isBlank(String value) {
    return value == null || value.isBlank();
  }
}
