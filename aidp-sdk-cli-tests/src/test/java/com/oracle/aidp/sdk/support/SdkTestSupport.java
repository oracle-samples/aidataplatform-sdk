package com.oracle.aidp.sdk.support;

import static org.testng.Assert.assertTrue;

import com.oracle.aidp.sdk.config.SdkTestConfig;
import com.oracle.aidp.sdk.logging.SdkLoggingOptions;
import com.oracle.aidp.sdk.logging.SdkTestListener;
import com.oracle.aidp.sdk.logging.SdkTestLogger;
import java.util.UUID;
import org.testng.SkipException;

public final class SdkTestSupport {
  private SdkTestSupport() {}

  public static void assertSuccessful(int statusCode) {
    logResponseStatus(statusCode);
    assertTrue(statusCode / 100 == 2, "Expected successful status code but got " + statusCode);
  }

  private static void logResponseStatus(int statusCode) {
    if (!SdkLoggingOptions.logResponses()) {
      return;
    }

    Long requestId = SdkTestLogger.currentRequestId();
    String component = requestId == null ? "RESPONSE" : "RESPONSE#" + requestId;
    SdkTestLogger.info(
        component, "test=" + SdkTestListener.currentTestName() + " statusCode=" + statusCode);
    if (requestId != null) {
      SdkTestLogger.clearCurrentRequestId();
    }
  }

  public static String requestId(String prefix) {
    String boundedPrefix = prefix.length() > 24 ? prefix.substring(0, 24) : prefix;
    return boundedPrefix + "-" + UUID.randomUUID();
  }

  public static String requireValue(SdkTestConfig config, String key) {
    String value = config.value(key, null);
    if (isBlank(value)) {
      throw new SkipException("Set " + key + " to run this SDK test.");
    }
    return value;
  }

  public static boolean isBlank(String value) {
    return value == null || value.isBlank();
  }
}
