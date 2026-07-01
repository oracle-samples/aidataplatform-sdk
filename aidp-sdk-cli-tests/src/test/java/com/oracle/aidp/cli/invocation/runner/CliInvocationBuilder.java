package com.oracle.aidp.cli.invocation.runner;

import com.oracle.aidp.cli.invocation.config.CliTestConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class CliInvocationBuilder {
  private final CliTestConfig config;

  public CliInvocationBuilder(CliTestConfig config) {
    this.config = config;
  }

  public List<String> command(String group, String command, String... commandArguments) {
    List<String> args = new ArrayList<>();
    args.add("--auth");
    args.add(config.auth());
    args.add("--profile");
    args.add(config.profile());
    args.add("--config-file");
    args.add(config.configFile());
    args.add("--region");
    args.add(config.region());
    args.add("--endpoint");
    args.add(config.endpoint());
    args.add("--timeout");
    args.add(config.requestTimeoutSeconds());
    args.add(group);
    args.add(command);
    args.addAll(Arrays.asList(commandArguments));
    args.add("--instance-id");
    args.add(config.dataHubId());
    args.add("--debug");
    return args;
  }

  public List<String> commandWithBody(
      String group, String command, String body, String... commandArguments) {
    List<String> argsWithBody = new ArrayList<>(Arrays.asList(commandArguments));
    argsWithBody.add("--body");
    argsWithBody.add(body);
    return command(group, command, argsWithBody.toArray(String[]::new));
  }
}
