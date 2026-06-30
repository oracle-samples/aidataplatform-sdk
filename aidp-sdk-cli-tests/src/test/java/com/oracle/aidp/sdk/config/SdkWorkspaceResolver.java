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

public final class SdkWorkspaceResolver {
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

  private SdkWorkspaceResolver() {}

  public static String ensureSdkWorkspaceKey(SdkTestConfig config) throws Exception {
    String workspaceName = config.value("sdkWorkspaceName", "SDK_Test_WS");
    String workspaceKey = findWorkspaceKey(config, workspaceName);
    if (isBlank(workspaceKey)) {
      workspaceKey = createWorkspace(config, workspaceName);
    }
    waitForWorkspaceActive(config, workspaceKey);
    System.setProperty("workspaceKey", workspaceKey);
    return workspaceKey;
  }

  private static String findWorkspaceKey(SdkTestConfig config, String workspaceName) throws Exception {
    try (ClientContext context = ClientContext.create(config)) {
      Response response =
          send(
              context,
              "GET",
              uri(
                  context,
                  "/aiDataPlatforms/"
                      + urlEncode(context.aiDataPlatformId)
                      + "/workspaces?displayName="
                      + urlEncode(workspaceName)
                      + "&limit=50"),
              null,
              Map.of());
      assertStatus(response, Set.of(200), "list workspaces");
      JsonNode items = items(response.body);
      if (items.isArray()) {
        for (JsonNode item : items) {
          if (workspaceName.equals(text(item, "displayName"))
              && !"DELETED".equalsIgnoreCase(text(item, "lifecycleState"))) {
            return text(item, "key");
          }
        }
      }
    }
    return "";
  }

  private static String createWorkspace(SdkTestConfig config, String workspaceName) throws Exception {
    try (ClientContext context = ClientContext.create(config)) {
      ObjectNode payload = MAPPER.createObjectNode();
      payload.put("displayName", workspaceName);
      payload.put("description", "Precreated workspace for SDK validation tests");
      Response response =
          send(
              context,
              "POST",
              uri(context, "/aiDataPlatforms/" + urlEncode(context.aiDataPlatformId) + "/workspaces"),
              payload,
              Map.of("opc-retry-token", "sdk-workspace-" + UUID.randomUUID()));
      assertStatus(response, Set.of(201, 409), "create workspace");
      String key = text(response.body, "key");
      return isBlank(key) ? findWorkspaceKey(config, workspaceName) : key;
    }
  }

  private static void waitForWorkspaceActive(SdkTestConfig config, String workspaceKey) throws Exception {
    long timeoutMs = Long.parseLong(config.value("sdkWorkspaceWaitTimeoutMs", "300000"));
    long deadline = System.currentTimeMillis() + timeoutMs;
    try (ClientContext context = ClientContext.create(config)) {
      while (true) {
        Response response =
            send(
                context,
                "GET",
                uri(
                    context,
                    "/aiDataPlatforms/"
                        + urlEncode(context.aiDataPlatformId)
                        + "/workspaces/"
                        + urlEncode(workspaceKey)),
                null,
                Map.of());
        assertStatus(response, Set.of(200), "get workspace");
        String state = text(response.body, "lifecycleState");
        if ("ACTIVE".equalsIgnoreCase(state)) {
          return;
        }
        if ("FAILED".equalsIgnoreCase(state) || "DELETED".equalsIgnoreCase(state)) {
          throw new IllegalStateException("Workspace " + workspaceKey + " reached state " + state);
        }
        if (System.currentTimeMillis() >= deadline) {
          throw new IllegalStateException(
              "Timed out waiting for workspace " + workspaceKey + " to become ACTIVE; last state=" + state);
        }
        Thread.sleep(POLL_INTERVAL_MS);
      }
    }
  }

  private static Response send(
      ClientContext context, String method, URI uri, JsonNode payload, Map<String, String> extraHeaders)
      throws Exception {
    byte[] bodyBytes = payload == null ? null : MAPPER.writeValueAsBytes(payload);
    Map<String, List<String>> headersToSign = new LinkedHashMap<>();
    headersToSign.put("accept", List.of("application/json"));
    headersToSign.put(
        "x-date", List.of(DateTimeFormatter.RFC_1123_DATE_TIME.format(ZonedDateTime.now(ZoneOffset.UTC))));
    headersToSign.put("opc-request-id", List.of("sdk-workspace-resolver-" + UUID.randomUUID()));
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
    Set<String> existingHeaders = headersToSign.keySet().stream().map(key -> key.toLowerCase(Locale.ROOT)).collect(java.util.stream.Collectors.toSet());
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
