package com.oracle.aidp.sdk.logging;

import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.client.HttpClientBuilder;
import com.oracle.bmc.http.client.HttpRequest;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class SdkHttpLoggingConfigurator implements ClientConfigurator {
  @Override
  public void customizeClient(HttpClientBuilder builder) {
    if (SdkLoggingOptions.logRequests()) {
      builder.registerRequestInterceptor(0, this::logRequest);
    }
  }

  private void logRequest(HttpRequest request) {
    long requestId = SdkTestLogger.nextRequestId();
    SdkTestLogger.setCurrentRequestId(requestId);
    String component = "REQUEST#" + requestId;
    int maxCharacters = SdkLoggingOptions.maxCharacters();

    SdkTestLogger.info(
        component,
        "test="
            + SdkTestListener.currentTestName()
            + " method="
            + request.method()
            + " uri="
            + request.uri());
    SdkTestLogger.block(component, "headers:", formatHeaders(request.headers()), maxCharacters);
    if (SdkLoggingOptions.logRequestBodies()) {
      SdkTestLogger.block(component, "body:", bodyAsText(request.body()), maxCharacters);
    }
  }

  private static String formatHeaders(Map<String, List<String>> headers) {
    if (headers == null || headers.isEmpty()) {
      return "";
    }

    List<Map.Entry<String, List<String>>> entries = new ArrayList<>(headers.entrySet());
    entries.sort(Comparator.comparing(entry -> entry.getKey().toLowerCase(Locale.ROOT)));
    StringBuilder builder = new StringBuilder();
    for (Map.Entry<String, List<String>> entry : entries) {
      if (!builder.isEmpty()) {
        builder.append(System.lineSeparator());
      }
      builder.append(entry.getKey()).append(": ");
      if (isSensitiveHeader(entry.getKey())) {
        builder.append("<redacted>");
      } else {
        builder.append(String.join(",", entry.getValue()));
      }
    }
    return builder.toString();
  }

  private static String bodyAsText(Object body) {
    if (body == null) {
      return "";
    }
    if (body instanceof InputStream) {
      return "<stream body>";
    }
    if (body instanceof byte[] bytes) {
      return new String(bytes, StandardCharsets.UTF_8);
    }
    return String.valueOf(body);
  }

  private static boolean isSensitiveHeader(String headerName) {
    if (headerName == null) {
      return false;
    }
    String normalized = headerName.toLowerCase(Locale.ROOT);
    return normalized.equals("authorization")
        || normalized.equals("proxy-authorization")
        || normalized.equals("cookie")
        || normalized.equals("set-cookie")
        || normalized.equals("opc-obo-token")
        || normalized.equals("x-content-sha256")
        || normalized.contains("security-token")
        || normalized.contains("session-token");
  }
}
