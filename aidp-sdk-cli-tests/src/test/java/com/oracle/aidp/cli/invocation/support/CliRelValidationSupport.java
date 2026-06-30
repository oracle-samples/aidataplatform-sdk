package com.oracle.aidp.cli.invocation.support;

import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.assertStatus;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.assertSuccess;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.data;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.firstExisting;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.optionalText;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.responseJson;
import static org.testng.Assert.assertNotNull;

import com.fasterxml.jackson.databind.JsonNode;
import com.oracle.aidp.cli.invocation.config.CliTestConfig;
import com.oracle.aidp.cli.invocation.runner.CliCommandResult;
import com.oracle.aidp.cli.invocation.runner.CliCommandRunner;
import com.oracle.aidp.cli.invocation.runner.CliInvocationBuilder;
import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.auth.SessionTokenAuthenticationDetailsProvider;
import com.oracle.bmc.objectstorage.ObjectStorageClient;
import com.oracle.bmc.objectstorage.requests.PutObjectRequest;
import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import org.testng.Assert;

public final class CliRelValidationSupport {
  private static final String CONFIG_SECURITY_TOKEN_FILE = "security_token_file";

  private CliRelValidationSupport() {}

  public static JsonNode runStructured(
      CliCommandRunner runner, CliInvocationBuilder builder, String group, String command, String... args) {
    return assertSuccess(runner.run(builder.command(group, command, args)));
  }

  public static JsonNode runStructuredWithBody(
      CliCommandRunner runner,
      CliInvocationBuilder builder,
      String group,
      String command,
      String body,
      String... args) {
    return assertSuccess(runner.run(builder.commandWithBody(group, command, body, args)));
  }

  public static JsonNode responseJsonOrNull(CliCommandResult result) {
    try {
      return responseJson(result);
    } catch (AssertionError e) {
      return null;
    }
  }

  public static boolean hasStatus(JsonNode response, int... statuses) {
    int actual = response.path("status").asInt(-1);
    for (int status : statuses) {
      if (actual == status) {
        return true;
      }
    }
    return false;
  }

  public static JsonNode entity(JsonNode response, String... names) {
    JsonNode responseData = data(response);
    for (String name : names) {
      JsonNode nested = firstExisting(responseData, name, snake(name));
      if (!nested.isMissingNode() && !nested.isNull()) {
        return nested;
      }
    }
    return responseData;
  }

  public static List<JsonNode> collectionItems(JsonNode response, String... collectionNames) {
    JsonNode responseData = data(response);
    JsonNode items = responseData.path("items");
    for (String collectionName : collectionNames) {
      if (items.isArray()) {
        break;
      }
      items = firstExisting(responseData, collectionName, snake(collectionName)).path("items");
    }
    List<JsonNode> values = new ArrayList<>();
    if (items.isArray()) {
      items.forEach(values::add);
    }
    return values;
  }

  public static String optionalKey(JsonNode node) {
    return optionalText(node, "key", "id", "name");
  }

  public static String asyncOperationKey(JsonNode response) {
    String key =
        optionalText(
            response.path("headers"),
            "aidp-async-operation-key",
            "datalake-async-operation-key",
            "oidl-async-operation-key");
    if (key != null && !key.isBlank()) {
      return key;
    }
    JsonNode responseData = data(response);
    JsonNode asyncOperation = firstExisting(responseData, "asyncOperation", "async_operation");
    if (!asyncOperation.isMissingNode() && !asyncOperation.isNull()) {
      return optionalText(asyncOperation, "key", "id");
    }
    return null;
  }

  public static void waitForAsyncOperationSucceeded(
      CliCommandRunner runner,
      CliInvocationBuilder builder,
      String asyncOperationKey,
      Duration timeout,
      Duration pollInterval) {
    assertNotNull(asyncOperationKey, "Expected async operation key.");
    long deadline = System.nanoTime() + timeout.toNanos();
    JsonNode lastResponse = null;
    while (System.nanoTime() < deadline) {
      JsonNode response = runStructured(runner, builder, "async-operations", "get", asyncOperationKey);
      assertStatus(response, 200);
      lastResponse = response;
      String status = optionalText(entity(response, "asyncOperation"), "status", "lifecycleState");
      if (isSucceeded(status)) {
        return;
      }
      if (isFailed(status)) {
        throw new AssertionError("Async operation failed: " + response);
      }
      sleep(pollInterval);
    }
    throw new AssertionError(
        "Timed out waiting for async operation " + asyncOperationKey + ". Last response: " + lastResponse);
  }

  public static void waitForOptionalAsyncOperationSucceeded(
      CliCommandRunner runner,
      CliInvocationBuilder builder,
      JsonNode response,
      Duration timeout,
      Duration pollInterval) {
    String key = asyncOperationKey(response);
    if (key != null && !key.isBlank()) {
      waitForAsyncOperationSucceeded(runner, builder, key, timeout, pollInterval);
    }
  }

  public static String uploadText(String uploadTarget, String content, CliTestConfig config) throws Exception {
    byte[] bytes = content.getBytes(StandardCharsets.UTF_8);
    Integer lastStatusCode = null;
    Exception lastException = null;
    for (String uploadUrl : uploadUrls(uploadTarget, config)) {
      try {
        HttpURLConnection connection = (HttpURLConnection) new URL(uploadUrl).openConnection();
        connection.setRequestMethod("PUT");
        connection.setDoOutput(true);
        connection.setConnectTimeout(30_000);
        connection.setReadTimeout(30_000);
        connection.setRequestProperty("Content-Type", "text/csv");
        connection.setRequestProperty("Content-Length", Integer.toString(bytes.length));
        try (OutputStream outputStream = connection.getOutputStream()) {
          outputStream.write(bytes);
        }
        int statusCode = connection.getResponseCode();
        if (statusCode / 100 == 2) {
          return uploadTarget;
        }
        lastStatusCode = statusCode;
      } catch (Exception e) {
        lastException = e;
      }
    }
    if (lastException != null && lastStatusCode == null) {
      throw lastException;
    }
    Assert.fail("Expected successful temp upload but received status " + lastStatusCode);
    return uploadTarget;
  }

  public static String uploadText(
      String uploadTarget, String ociFilePath, String content, CliTestConfig config) throws Exception {
    Exception objectStorageException = null;
    if (ociFilePath != null && ociFilePath.startsWith("oci://")) {
      try {
        uploadTextToObjectStorage(ociFilePath, content, config);
        return uploadTarget;
      } catch (Exception e) {
        objectStorageException = e;
      }
    }
    try {
      return uploadText(uploadTarget, content, config);
    } catch (Exception e) {
      if (objectStorageException != null) {
        e.addSuppressed(objectStorageException);
      }
      throw e;
    }
  }

  public static String requestId(String prefix) {
    return prefix + "-" + Instant.now().toEpochMilli();
  }

  private static List<String> uploadUrls(String uploadTarget, CliTestConfig config) {
    if (uploadTarget.startsWith("http://") || uploadTarget.startsWith("https://")) {
      return List.of(uploadTarget);
    }
    String namespace = namespaceFromUploadTarget(uploadTarget);
    LinkedHashSet<String> urls = new LinkedHashSet<>();
    for (String endpoint : objectStorageEndpoints(config)) {
      urls.add(uploadUrl(endpoint, uploadTarget));
      String namespaceEndpoint = namespaceEndpoint(endpoint, namespace);
      if (namespaceEndpoint != null) {
        urls.add(uploadUrl(namespaceEndpoint, uploadTarget));
      }
    }
    return List.copyOf(urls);
  }

  private static void uploadTextToObjectStorage(String ociFilePath, String content, CliTestConfig config)
      throws Exception {
    ObjectStorageLocation location = ObjectStorageLocation.parse(ociFilePath);
    byte[] bytes = content.getBytes(StandardCharsets.UTF_8);
    Exception lastException = null;
    for (String endpoint : objectStorageEndpoints(config)) {
      ObjectStorageClient client = null;
      try {
        client = objectStorageClient(config, endpoint);
        client.putObject(
            PutObjectRequest.builder()
                .namespaceName(location.namespaceName())
                .bucketName(location.bucketName())
                .objectName(location.objectName())
                .contentLength((long) bytes.length)
                .contentType("text/csv")
                .putObjectBody(new ByteArrayInputStream(bytes))
                .build());
        return;
      } catch (Exception e) {
        lastException = e;
      } finally {
        if (client != null) {
          client.close();
        }
      }
    }
    throw lastException;
  }

  private static ObjectStorageClient objectStorageClient(CliTestConfig config, String endpoint)
      throws Exception {
    ConfigFileReader.ConfigFile configFile = ConfigFileReader.parse(config.configFile(), config.profile());
    BasicAuthenticationDetailsProvider provider;
    if (!isBlank(configFile.get(CONFIG_SECURITY_TOKEN_FILE))) {
      provider = new SessionTokenAuthenticationDetailsProvider(configFile);
    } else {
      provider = new ConfigFileAuthenticationDetailsProvider(configFile);
    }
    ObjectStorageClient client =
        new ObjectStorageClient(provider, ClientConfiguration.builder().build());
    client.setEndpoint(endpoint);
    return client;
  }

  private static List<String> objectStorageEndpoints(CliTestConfig config) {
    LinkedHashSet<String> endpoints = new LinkedHashSet<>();
    endpoints.add(config.schemaTempUploadEndpoint());
    addObjectStorageEndpoint(endpoints, config.region(), objectStorageRealm(config.endpoint()));
    String serviceEndpoint = config.endpoint();
    String serviceRealm = serviceRealm(serviceEndpoint);
    if (serviceRealm != null) {
      String serviceRegion = serviceRegion(serviceEndpoint, serviceRealm);
      if (serviceRegion != null) {
        addObjectStorageEndpoint(endpoints, serviceRegion, objectStorageRealm(serviceEndpoint));
        addObjectStorageEndpoint(endpoints, serviceRegion, serviceRealm);
      }
    }
    endpoints.add("https://objectstorage." + config.region() + ".oraclecloud.com");
    return List.copyOf(endpoints);
  }

  private static String uploadUrl(String endpoint, String uploadTarget) {
    if (endpoint.endsWith("/") && uploadTarget.startsWith("/")) {
      return endpoint.substring(0, endpoint.length() - 1) + uploadTarget;
    }
    if (!endpoint.endsWith("/") && !uploadTarget.startsWith("/")) {
      return endpoint + "/" + uploadTarget;
    }
    return endpoint + uploadTarget;
  }

  private static String serviceRealm(String serviceEndpoint) {
    String host = URI.create(serviceEndpoint).getHost();
    if (host == null) {
      return null;
    }
    if (host.endsWith(".oci.oc-test.com")) {
      return "oci.oc-test.com";
    }
    if (host.endsWith(".oraclecloud.com")) {
      return "oraclecloud.com";
    }
    return null;
  }

  private static String objectStorageRealm(String serviceEndpoint) {
    String realm = serviceRealm(serviceEndpoint);
    if ("oci.oc-test.com".equals(realm)) {
      return "oci.customer-oci.com";
    }
    return realm == null ? "oraclecloud.com" : realm;
  }

  private static String serviceRegion(String serviceEndpoint, String realm) {
    String host = URI.create(serviceEndpoint).getHost();
    if (host == null || !host.endsWith("." + realm)) {
      return null;
    }
    String prefix = host.substring(0, host.length() - realm.length() - 1);
    int lastDot = prefix.lastIndexOf('.');
    if (lastDot < 0 || lastDot == prefix.length() - 1) {
      return null;
    }
    return prefix.substring(lastDot + 1);
  }

  private static void addObjectStorageEndpoint(LinkedHashSet<String> endpoints, String region, String realm) {
    if (!isBlank(region) && !isBlank(realm)) {
      endpoints.add("https://objectstorage." + region + "." + realm);
    }
  }

  private static String namespaceFromUploadTarget(String uploadTarget) {
    String marker = "/n/";
    int namespaceStart = uploadTarget.indexOf(marker);
    if (namespaceStart < 0) {
      return null;
    }
    int valueStart = namespaceStart + marker.length();
    int valueEnd = uploadTarget.indexOf('/', valueStart);
    if (valueEnd <= valueStart) {
      return null;
    }
    return uploadTarget.substring(valueStart, valueEnd);
  }

  private static String namespaceEndpoint(String endpoint, String namespace) {
    if (isBlank(namespace)) {
      return null;
    }
    URI uri = URI.create(endpoint);
    String host = uri.getHost();
    if (host == null || host.startsWith(namespace + ".")) {
      return null;
    }
    return uri.getScheme() + "://" + namespace + "." + host;
  }

  private record ObjectStorageLocation(String bucketName, String namespaceName, String objectName) {
    private static ObjectStorageLocation parse(String location) {
      URI uri = URI.create(location);
      String bucketName = uri.getUserInfo();
      String namespaceName = uri.getHost();
      String objectName = uri.getPath() == null ? null : uri.getPath().replaceFirst("^/", "");
      if (isBlank(bucketName) || isBlank(namespaceName) || isBlank(objectName)) {
        throw new IllegalArgumentException("Invalid OCI object storage location: " + location);
      }
      return new ObjectStorageLocation(bucketName, namespaceName, objectName);
    }
  }

  private static void sleep(Duration duration) {
    try {
      Thread.sleep(duration.toMillis());
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new AssertionError("Interrupted while waiting.", e);
    }
  }

  private static boolean isSucceeded(String status) {
    return "SUCCEEDED".equalsIgnoreCase(status)
        || "SUCCESS".equalsIgnoreCase(status)
        || "COMPLETED".equalsIgnoreCase(status);
  }

  private static boolean isFailed(String status) {
    return "FAILED".equalsIgnoreCase(status)
        || "CANCELED".equalsIgnoreCase(status)
        || "CANCELLED".equalsIgnoreCase(status);
  }

  private static String snake(String value) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < value.length(); i++) {
      char ch = value.charAt(i);
      if (Character.isUpperCase(ch) && i > 0) {
        builder.append('_');
      }
      builder.append(Character.toLowerCase(ch));
    }
    return builder.toString();
  }

  private static boolean isBlank(String value) {
    return value == null || value.isBlank();
  }
}
