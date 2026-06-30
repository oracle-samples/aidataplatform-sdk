package com.oracle.aidp.sdk.config;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Service;
import com.oracle.bmc.Services;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.auth.SessionTokenAuthenticationDetailsProvider;
import com.oracle.bmc.http.signing.RequestSigner;
import com.oracle.bmc.http.signing.SigningStrategy;
import com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

public final class SdkClusterResolver {
  private static final ObjectMapper MAPPER = new ObjectMapper();
  private static final String API_VERSION = "20260430";
  private static final Service DATAHUB_SERVICE =
      Services.serviceBuilder()
          .serviceName("DATAHUB_DP")
          .serviceEndpointPrefix("datahub-dp")
          .serviceEndpointTemplate("https://datalake.{region}.oci.{secondLevelDomain}")
          .build();
  private static final Set<String> RESTRICTED_HTTP_HEADERS =
      Set.of("connection", "content-length", "expect", "host", "upgrade");
  private static final long POLL_INTERVAL_MS = 10_000L;

  private SdkClusterResolver() {}

  public static String ensureSdkClusterActive(SdkTestConfig config) throws Exception {
    String workspaceKey = SdkWorkspaceResolver.ensureSdkWorkspaceKey(config);
    String clusterName = config.value("sdkClusterName", "SDK_Cluster");
    String clusterKey = findClusterKey(config, workspaceKey, clusterName);
    if (isBlank(clusterKey)) {
      clusterKey = createCluster(config, workspaceKey, clusterName);
    }
    ensureClusterActive(config, workspaceKey, clusterKey);
    System.setProperty("clusterKey", clusterKey);
    return clusterKey;
  }

  private static String findClusterKey(SdkTestConfig config, String workspaceKey, String clusterName)
      throws Exception {
    try (ClientContext context = ClientContext.create(config)) {
      Response response =
          send(
              context,
              "GET",
              uri(
                  context,
                  "/aiDataPlatforms/"
                      + urlEncode(context.aiDataPlatformId)
                      + "/workspaces/"
                      + urlEncode(workspaceKey)
                      + "/clusters?displayName="
                      + urlEncode(clusterName)
                      + "&limit=50"),
              null,
              Map.of());
      assertStatus(response, Set.of(200), "list clusters");
      JsonNode items = items(response.body);
      if (items.isArray()) {
        for (JsonNode item : items) {
          if (clusterName.equals(text(item, "displayName"))
              && !"DELETED".equalsIgnoreCase(text(item, "state"))) {
            return text(item, "key");
          }
        }
      }
    }
    return "";
  }

  private static String createCluster(SdkTestConfig config, String workspaceKey, String clusterName)
      throws Exception {
    try (ClientContext context = ClientContext.create(config)) {
      Response response =
          send(
              context,
              "POST",
              uri(
                  context,
                  "/aiDataPlatforms/"
                      + urlEncode(context.aiDataPlatformId)
                      + "/workspaces/"
                      + urlEncode(workspaceKey)
                      + "/clusters"),
              createClusterPayload(config, clusterName),
              Map.of("opc-retry-token", "sdk-cluster-" + UUID.randomUUID()));
      assertStatus(response, Set.of(202, 409), "create cluster");
      String key = text(response.body, "key");
      return isBlank(key) ? findClusterKey(config, workspaceKey, clusterName) : key;
    }
  }

  private static void ensureClusterActive(SdkTestConfig config, String workspaceKey, String clusterKey)
      throws Exception {
    String state = getClusterState(config, workspaceKey, clusterKey);
    if (!"ACTIVE".equalsIgnoreCase(state)) {
      try (ClientContext context = ClientContext.create(config)) {
        Response response =
            send(
                context,
                "POST",
                uri(
                    context,
                    "/aiDataPlatforms/"
                        + urlEncode(context.aiDataPlatformId)
                        + "/workspaces/"
                        + urlEncode(workspaceKey)
                        + "/clusters/"
                        + urlEncode(clusterKey)
                        + "/actions/start"),
                MAPPER.createObjectNode(),
                Map.of("opc-retry-token", "sdk-cluster-start-" + UUID.randomUUID()));
        assertStatus(response, Set.of(202, 409), "start cluster");
      }
    }
    waitForClusterActive(config, workspaceKey, clusterKey);
  }

  private static void waitForClusterActive(SdkTestConfig config, String workspaceKey, String clusterKey)
      throws Exception {
    long timeoutMs = Long.parseLong(config.value("sdkClusterWaitTimeoutMs", "900000"));
    long deadline = System.currentTimeMillis() + timeoutMs;
    while (true) {
      String state = getClusterState(config, workspaceKey, clusterKey);
      if ("ACTIVE".equalsIgnoreCase(state)) {
        return;
      }
      if ("FAILED".equalsIgnoreCase(state) || "DELETED".equalsIgnoreCase(state)) {
        throw new IllegalStateException("Cluster " + clusterKey + " reached state " + state);
      }
      if (System.currentTimeMillis() >= deadline) {
        throw new IllegalStateException(
            "Timed out waiting for cluster " + clusterKey + " to become ACTIVE; last state=" + state);
      }
      Thread.sleep(POLL_INTERVAL_MS);
    }
  }

  private static String getClusterState(SdkTestConfig config, String workspaceKey, String clusterKey)
      throws Exception {
    try (ClientContext context = ClientContext.create(config)) {
      Response response =
          send(
              context,
              "GET",
              uri(
                  context,
                  "/aiDataPlatforms/"
                      + urlEncode(context.aiDataPlatformId)
                      + "/workspaces/"
                      + urlEncode(workspaceKey)
                      + "/clusters/"
                      + urlEncode(clusterKey)),
              null,
              Map.of());
      assertStatus(response, Set.of(200), "get cluster");
      return text(response.body, "state");
    }
  }

  private static ObjectNode createClusterPayload(SdkTestConfig config, String clusterName) {
    ObjectNode shapeConfig = MAPPER.createObjectNode();
    shapeConfig.put("ocpus", Long.parseLong(config.value("sdkClusterOcpus", "2")));
    shapeConfig.put("memoryInGBs", Long.parseLong(config.value("sdkClusterMemoryInGBs", "32")));

    String nodeType = config.value("sdkClusterNodeType", "amd.generic");
    String nodeShape = config.value("sdkClusterNodeShape", "amd.generic");

    ObjectNode driverConfig = MAPPER.createObjectNode();
    driverConfig.put("driverNodeType", nodeType);
    driverConfig.put("driverShape", nodeShape);
    driverConfig.set("driverShapeConfig", shapeConfig.deepCopy());

    ObjectNode workerConfig = MAPPER.createObjectNode();
    workerConfig.put("workerShape", nodeShape);
    workerConfig.set("workerShapeConfig", shapeConfig.deepCopy());
    workerConfig.put("minWorkerCount", Long.parseLong(config.value("sdkClusterMinWorkerCount", "1")));
    workerConfig.put("maxWorkerCount", Long.parseLong(config.value("sdkClusterMaxWorkerCount", "10")));

    ObjectNode runtimeConfig = MAPPER.createObjectNode();
    runtimeConfig.put("type", "SPARK");
    runtimeConfig.put("sparkVersion", config.value("sdkClusterSparkVersion", "3.5.0"));
    runtimeConfig.putArray("initScripts");
    runtimeConfig.set("sparkAdvancedConfigurations", MAPPER.createObjectNode());
    runtimeConfig.set("sparkEnvVariables", MAPPER.createObjectNode());

    ObjectNode payload = MAPPER.createObjectNode();
    payload.put("type", "USER");
    payload.put("displayName", clusterName);
    payload.put("description", "Precreated cluster for SDK validation tests");
    payload.put("nodeType", nodeType);
    payload.set("driverConfig", driverConfig);
    payload.set("workerConfig", workerConfig);
    payload.put(
        "autoTerminationMinutes",
        Long.parseLong(config.value("sdkClusterAutoTerminationMinutes", "120")));
    payload.set("clusterRuntimeConfig", runtimeConfig);
    return payload;
  }

  private static Response send(
      ClientContext context, String method, URI uri, JsonNode payload, Map<String, String> extraHeaders)
      throws Exception {
    byte[] bodyBytes = payload == null ? null : MAPPER.writeValueAsBytes(payload);
    Map<String, List<String>> headersToSign = new LinkedHashMap<>();
    headersToSign.put("accept", List.of("application/json"));
    headersToSign.put(
        "x-date",
        List.of(DateTimeFormatter.RFC_1123_DATE_TIME.format(ZonedDateTime.now(ZoneOffset.UTC))));
    headersToSign.put("opc-request-id", List.of("sdk-cluster-resolver-" + UUID.randomUUID()));
    if (bodyBytes != null) {
      headersToSign.put("content-type", List.of("application/json"));
      headersToSign.put("content-length", List.of(Integer.toString(bodyBytes.length)));
      headersToSign.put("x-content-sha256", List.of(contentSha256(bodyBytes)));
    }
    extraHeaders.forEach(
        (key, value) -> {
          if (!isBlank(value)) {
            headersToSign.put(key.toLowerCase(Locale.ROOT), List.of(value));
          }
        });

    Map<String, String> signedHeaders = context.requestSigner.signRequest(uri, method, headersToSign, null);
    HttpRequest.BodyPublisher bodyPublisher =
        bodyBytes == null ? HttpRequest.BodyPublishers.noBody() : HttpRequest.BodyPublishers.ofByteArray(bodyBytes);
    HttpRequest.Builder builder = HttpRequest.newBuilder(uri).timeout(Duration.ofMinutes(5)).method(method, bodyPublisher);
    headersToSign.forEach(
        (name, values) -> {
          if (!RESTRICTED_HTTP_HEADERS.contains(name.toLowerCase(Locale.ROOT))) {
            values.forEach(value -> builder.header(name, value));
          }
        });
    Set<String> existingHeaders =
        headersToSign.keySet().stream().map(key -> key.toLowerCase(Locale.ROOT)).collect(Collectors.toSet());
    signedHeaders.forEach(
        (name, value) -> {
          String lowerName = name.toLowerCase(Locale.ROOT);
          if (!RESTRICTED_HTTP_HEADERS.contains(lowerName) && !existingHeaders.contains(lowerName)) {
            builder.header(name, value);
          }
        });

    HttpResponse<String> httpResponse = context.httpClient.send(builder.build(), HttpResponse.BodyHandlers.ofString());
    return new Response(httpResponse.statusCode(), parseBody(httpResponse.body()), httpResponse.body());
  }

  private static URI uri(ClientContext context, String pathAndQuery) {
    return URI.create(context.endpoint + "/" + API_VERSION + pathAndQuery);
  }

  private static JsonNode items(JsonNode body) {
    JsonNode items = body.path("items");
    return items.isArray() ? items : body.path("data").path("items");
  }

  private static JsonNode parseBody(String rawBody) throws IOException {
    return isBlank(rawBody) ? MAPPER.createObjectNode() : MAPPER.readTree(rawBody);
  }

  private static void assertStatus(Response response, Set<Integer> expected, String operation) {
    if (!expected.contains(response.statusCode)) {
      throw new IllegalStateException(
          operation + " expected " + expected + ", got " + response.statusCode + " body=" + response.rawBody);
    }
  }

  private static String text(JsonNode node, String fieldName) {
    JsonNode value = node == null ? null : node.get(fieldName);
    return value == null || value.isNull() ? "" : value.asText("");
  }

  private static String urlEncode(String value) {
    return URLEncoder.encode(value, StandardCharsets.UTF_8).replace("+", "%20");
  }

  private static String trimTrailingSlash(String value) {
    String result = value;
    while (result.endsWith("/")) {
      result = result.substring(0, result.length() - 1);
    }
    return result;
  }

  private static String expandHome(String path) {
    if (path == null || path.isBlank() || !path.startsWith("~")) {
      return path;
    }
    return Path.of(System.getProperty("user.home"), path.substring(1)).toString();
  }

  private static String contentSha256(byte[] body) throws Exception {
    MessageDigest digest = MessageDigest.getInstance("SHA-256");
    return Base64.getEncoder().encodeToString(digest.digest(body));
  }

  private static boolean isBlank(String value) {
    return value == null || value.isBlank();
  }

  private record Response(int statusCode, JsonNode body, String rawBody) {}

  private static final class ClientContext implements AutoCloseable {
    private final HttpClient httpClient;
    private final AuthenticationDetailsProvider authProvider;
    private final RequestSigner requestSigner;
    private final String aiDataPlatformId;
    private final String endpoint;

    private ClientContext(
        HttpClient httpClient,
        AuthenticationDetailsProvider authProvider,
        RequestSigner requestSigner,
        String aiDataPlatformId,
        String endpoint) {
      this.httpClient = httpClient;
      this.authProvider = authProvider;
      this.requestSigner = requestSigner;
      this.aiDataPlatformId = aiDataPlatformId;
      this.endpoint = endpoint;
    }

    private static ClientContext create(SdkTestConfig config) throws IOException {
      ConfigFileReader.ConfigFile configFile =
          ConfigFileReader.parse(expandHome(config.configFile()), config.profile());
      AuthenticationDetailsProvider authProvider =
          isBlank(configFile.get("security_token_file"))
              ? new ConfigFileAuthenticationDetailsProvider(configFile)
              : new SessionTokenAuthenticationDetailsProvider(configFile);
      RequestSigner requestSigner =
          new DefaultRequestSignerFactory(SigningStrategy.STANDARD)
              .createRequestSigner(DATAHUB_SERVICE, authProvider);
      return new ClientContext(
          HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(30)).build(),
          authProvider,
          requestSigner,
          config.value("aidpInstanceId", config.required("dataHubId")),
          trimTrailingSlash(config.endpoint()));
    }

    @Override
    public void close() throws Exception {
      if (authProvider instanceof AutoCloseable closeable) {
        closeable.close();
      }
    }
  }
}
