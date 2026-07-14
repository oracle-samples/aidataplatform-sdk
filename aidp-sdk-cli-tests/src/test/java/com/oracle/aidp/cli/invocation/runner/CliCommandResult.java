package com.oracle.aidp.cli.invocation.runner;

public final class CliCommandResult {
  private final int exitCode;
  private final String stdout;
  private final String stderr;

  public CliCommandResult(int exitCode, String stdout, String stderr) {
    this.exitCode = exitCode;
    this.stdout = stdout == null ? "" : stdout;
    this.stderr = stderr == null ? "" : stderr;
  }

  public int exitCode() {
    return exitCode;
  }

  public String stdout() {
    return stdout;
  }

  public String stderr() {
    return stderr;
  }

  public String combinedOutput() {
    if (stderr.isBlank()) {
      return stdout;
    }
    if (stdout.isBlank()) {
      return stderr;
    }
    return stdout + System.lineSeparator() + stderr;
  }
}
