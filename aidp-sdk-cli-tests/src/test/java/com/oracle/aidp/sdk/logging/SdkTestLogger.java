package com.oracle.aidp.sdk.logging;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.AtomicLong;

public final class SdkTestLogger {
  private static final AtomicLong REQUEST_SEQUENCE = new AtomicLong();
  private static final ThreadLocal<Long> CURRENT_REQUEST_ID = new ThreadLocal<>();

  private SdkTestLogger() {}

  public static long nextRequestId() {
    return REQUEST_SEQUENCE.incrementAndGet();
  }

  public static void setCurrentRequestId(long requestId) {
    CURRENT_REQUEST_ID.set(requestId);
  }

  public static Long currentRequestId() {
    return CURRENT_REQUEST_ID.get();
  }

  public static void clearCurrentRequestId() {
    CURRENT_REQUEST_ID.remove();
  }

  public static void info(String component, String message) {
    synchronized (System.out) {
      System.out.println(prefix(component) + message);
      System.out.flush();
    }
  }

  public static void block(String component, String title, String content, int maxCharacters) {
    if (content == null || content.isBlank()) {
      return;
    }

    synchronized (System.out) {
      System.out.println(prefix(component) + title);
      System.out.println(truncate(content.stripTrailing(), maxCharacters));
      System.out.flush();
    }
  }

  public static String stackTrace(Throwable throwable) {
    if (throwable == null) {
      return "";
    }
    StringWriter writer = new StringWriter();
    throwable.printStackTrace(new PrintWriter(writer));
    return writer.toString();
  }

  private static String truncate(String value, int maxCharacters) {
    if (maxCharacters <= 0 || value.length() <= maxCharacters) {
      return value;
    }
    return value.substring(0, maxCharacters)
        + "\n... truncated "
        + (value.length() - maxCharacters)
        + " characters";
  }

  private static String prefix(String component) {
    return "[AIDP-SDK-IT]["
        + OffsetDateTime.now().format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)
        + "]["
        + component
        + "] ";
  }
}
