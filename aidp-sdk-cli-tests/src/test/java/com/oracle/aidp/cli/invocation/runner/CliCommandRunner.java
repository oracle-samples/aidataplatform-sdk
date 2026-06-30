package com.oracle.aidp.cli.invocation.runner;

import com.oracle.aidp.cli.invocation.config.CliTestConfig;
import com.oracle.aidp.cli.invocation.logging.CliTestLogger;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public final class CliCommandRunner {
  private final CliTestConfig config;

  public CliCommandRunner(CliTestConfig config) {
    this.config = config;
  }

  public CliCommandResult run(List<String> commandArguments) {
    List<String> command = new ArrayList<>();
    command.add(config.aidpCliPath());
    command.addAll(commandArguments);
    return runRaw(command, config.processTimeout());
  }

  private CliCommandResult runRaw(List<String> command, Duration timeout) {
    long commandId = CliTestLogger.nextCommandId();
    long startNanos = System.nanoTime();
    logRequest(commandId, command);

    ProcessBuilder processBuilder = new ProcessBuilder(command);
    try {
      Process process = processBuilder.start();
      CompletableFuture<String> stdout =
          CompletableFuture.supplyAsync(() -> readAll(process.getInputStream()));
      CompletableFuture<String> stderr =
          CompletableFuture.supplyAsync(() -> readAll(process.getErrorStream()));

      boolean completed = process.waitFor(timeout.toMillis(), TimeUnit.MILLISECONDS);
      if (!completed) {
        process.destroyForcibly();
        CliCommandResult result = new CliCommandResult(
            124,
            stdout.getNow(""),
            "Timed out after " + timeout.toSeconds() + " seconds: " + String.join(" ", command));
        logResponse(commandId, result, elapsed(startNanos));
        return result;
      }

      CliCommandResult result =
          new CliCommandResult(process.exitValue(), stdout.join(), stderr.join());
      logResponse(commandId, result, elapsed(startNanos));
      return result;
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new RuntimeException("Interrupted while running CLI command: " + command, e);
    } catch (IOException e) {
      throw new RuntimeException("Failed to run CLI command: " + command, e);
    }
  }

  private void logRequest(long commandId, List<String> command) {
    if (!config.logCliRequests()) {
      return;
    }

    int maxCharacters = config.cliLogMaxCharacters();
    CliTestLogger.info(
        "REQUEST#" + commandId,
        "command=" + CliTestLogger.commandLine(command));
    if (config.logCliRequestBodies()) {
      CliTestLogger.block(
          "REQUEST#" + commandId,
          "body:",
          CliTestLogger.commandBody(command),
          maxCharacters);
    }
  }

  private void logResponse(long commandId, CliCommandResult result, Duration elapsed) {
    if (!config.logCliResponses()) {
      return;
    }

    int maxCharacters = config.cliLogMaxCharacters();
    CliTestLogger.info(
        "RESPONSE#" + commandId,
        "exitCode=" + result.exitCode() + " durationMs=" + elapsed.toMillis());
    CliTestLogger.block("RESPONSE#" + commandId, "stdout:", result.stdout(), maxCharacters);
    CliTestLogger.block("RESPONSE#" + commandId, "stderr:", result.stderr(), maxCharacters);
  }

  private static Duration elapsed(long startNanos) {
    return Duration.ofNanos(System.nanoTime() - startNanos);
  }

  private static String readAll(java.io.InputStream inputStream) {
    try (inputStream) {
      return new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
    } catch (IOException e) {
      throw new RuntimeException("Failed to read CLI process output", e);
    }
  }
}
