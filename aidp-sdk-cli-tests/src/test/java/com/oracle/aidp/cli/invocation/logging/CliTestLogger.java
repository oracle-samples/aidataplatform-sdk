package com.oracle.aidp.cli.invocation.logging;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public final class CliTestLogger {
  private static final AtomicLong COMMAND_SEQUENCE = new AtomicLong();

  private CliTestLogger() {}

  public static long nextCommandId() {
    return COMMAND_SEQUENCE.incrementAndGet();
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

  public static String commandLine(List<String> command) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < command.size(); i++) {
      if ("--body".equals(command.get(i)) && i + 1 < command.size()) {
        appendArg(builder, "--body");
        appendArg(builder, "<inline-json-body>");
        i++;
        continue;
      }
      appendArg(builder, command.get(i));
    }
    return builder.toString();
  }

  public static String commandBody(List<String> command) {
    for (int i = 0; i < command.size() - 1; i++) {
      if ("--body".equals(command.get(i))) {
        return command.get(i + 1);
      }
    }
    return null;
  }

  public static String stackTrace(Throwable throwable) {
    if (throwable == null) {
      return "";
    }
    StringWriter writer = new StringWriter();
    throwable.printStackTrace(new PrintWriter(writer));
    return writer.toString();
  }

  private static void appendArg(StringBuilder builder, String arg) {
    if (!builder.isEmpty()) {
      builder.append(' ');
    }
    builder.append(quote(arg));
  }

  private static String quote(String arg) {
    if (arg == null) {
      return "null";
    }
    if (arg.matches("[A-Za-z0-9_./:=@,+-]+")) {
      return arg;
    }
    return "'" + arg.replace("'", "'\\''") + "'";
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
    return "[AIDP-CLI-IT]["
        + OffsetDateTime.now().format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)
        + "]["
        + component
        + "] ";
  }
}
