package com.oracle.aidp.runner;

import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.Security;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

public final class AidpSdkCliTestExecutor {
  private static final String DEFAULT_SUITE_XML = "test-suites/sdk-validation.xml";

  private AidpSdkCliTestExecutor() {}

  public static void main(String[] args) {
    System.exit(run(args));
  }

  static int run(String[] args) {
    try {
      ArgumentResult argumentResult = applyArguments(args);
      if (argumentResult == ArgumentResult.HELP) {
        printUsage();
        return 0;
      }
      if (argumentResult == ArgumentResult.ERROR) {
        printUsage();
        return 2;
      }

      applyEnvironmentDefaults();
      CanaryUserBootstrap.bootstrapIfEnabled();
      GitConfigBootstrap.bootstrapIfEnabled();
      TestNG testng = createTestNg();
      logRunnerConfiguration();

      testng.run();
      if (testng.hasSkip() && !testng.hasFailure()) {
        return 0;
      }
      return testng.getStatus();
    } catch (Exception e) {
      e.printStackTrace(System.err);
      return 1;
    }
  }

  private static TestNG createTestNg() {
    Security.setProperty("networkaddress.cache.ttl", "0");
    Security.setProperty("networkaddress.cache.negative.ttl", "0");

    TestNG testng = new TestNG();
    testng.setConfigFailurePolicy(XmlSuite.FailurePolicy.CONTINUE);
    testng.setOutputDirectory(value("outputDirectory", "target/failsafe-reports"));

    String groups = value("groups", null);
    if (!isBlank(groups)) {
      testng.setGroups(groups);
    }

    String excludedGroups = value("excludedGroups", null);
    if (!isBlank(excludedGroups)) {
      testng.setExcludedGroups(excludedGroups);
    }

    String threadCount = value("threadCount", null);
    if (!isBlank(threadCount)) {
      testng.setThreadCount(parsePositiveInt("threadCount", threadCount));
    }

    String parallel = value("parallel", null);
    if (!isBlank(parallel)) {
      testng.setParallel(parseParallelMode(parallel));
    }

    String verbose = value("verbose", null);
    if (!isBlank(verbose)) {
      testng.setVerbose(parsePositiveInt("verbose", verbose));
    }

    configureSuite(testng);
    return testng;
  }

  private static void configureSuite(TestNG testng) {
    String suiteXmlFile = normalizeSuiteXml(value("suiteXmlFile", DEFAULT_SUITE_XML));
    Path suitePath = Path.of(suiteXmlFile);
    if (Files.isRegularFile(suitePath)) {
      testng.setTestSuites(List.of(suitePath.toString()));
      return;
    }

    Path testJar = configuredTestJar();
    testng.setTestJar(testJar.toString());
    testng.setXmlPathInJar(suiteXmlFile);
  }

  private static Path configuredTestJar() {
    String configured = value("testJar", null);
    if (!isBlank(configured)) {
      return Path.of(configured).toAbsolutePath().normalize();
    }

    try {
      return Path.of(
              AidpSdkCliTestExecutor.class
                  .getProtectionDomain()
                  .getCodeSource()
                  .getLocation()
                  .toURI())
          .toAbsolutePath()
          .normalize();
    } catch (URISyntaxException e) {
      throw new IllegalStateException("Unable to resolve current test jar path.", e);
    }
  }

  private static ArgumentResult applyArguments(String[] args) {
    for (int i = 0; i < args.length; i++) {
      String arg = args[i];
      if ("--help".equals(arg) || "-h".equals(arg)) {
        return ArgumentResult.HELP;
      }

      if (arg.startsWith("-D")) {
        if (!setPropertyFromAssignment(arg.substring(2))) {
          System.err.println("Invalid property argument: " + arg);
          return ArgumentResult.ERROR;
        }
        continue;
      }

      if (!arg.startsWith("--")) {
        System.err.println("Unexpected argument: " + arg);
        return ArgumentResult.ERROR;
      }

      String option = arg.substring(2);
      int equalsIndex = option.indexOf('=');
      if (equalsIndex >= 0) {
        String key = option.substring(0, equalsIndex);
        String value = option.substring(equalsIndex + 1);
        setProperty(normalizeOptionName(key), value);
        continue;
      }

      if (i + 1 >= args.length || args[i + 1].startsWith("--")) {
        System.err.println("Missing value for option: " + arg);
        return ArgumentResult.ERROR;
      }
      setProperty(normalizeOptionName(option), args[++i]);
    }
    return ArgumentResult.OK;
  }

  private static void applyEnvironmentDefaults() {
    Map<String, String> envToProperty = new HashMap<>();
    envToProperty.put("TEST_GROUPS", "groups");
    envToProperty.put("EXCLUDED_GROUPS", "excludedGroups");
    envToProperty.put("SUITE_XML_FILE", "suiteXmlFile");
    envToProperty.put("THREAD_COUNT", "threadCount");
    envToProperty.put("PARALLEL", "parallel");
    envToProperty.put("TEST_OUTPUT_DIRECTORY", "outputDirectory");
    envToProperty.put("AIDP_TEST_JAR", "testJar");
    envToProperty.put("AIDP_CLI_PATH", "aidpCliPath");
    envToProperty.put("AIDP_CLI_UNDER_TEST", "aidpCliUnderTest");
    envToProperty.put("DATA_HUB_ID", "dataHubId");
    envToProperty.put("DP_SERVICE_ENDPOINT", "dpServiceEndpoint");
    envToProperty.put("REGION", "region");
    envToProperty.put("OCI_AUTH", "ociAuth");
    envToProperty.put("OCI_CONFIG_FILE_PATH", "ociConfigFilePath");
    envToProperty.put("OCI_PROFILE", "ociProfile");
    envToProperty.put("CLI_TEST_CONFIG_FILE", "cliTestConfigFile");
    envToProperty.put("SDK_TEST_CONFIG_FILE", "sdkTestConfigFile");
    envToProperty.put("CANARY_USER_BOOTSTRAP_ENABLED", "canaryUserBootstrapEnabled");
    envToProperty.put("CANARY_USER", "canaryUser");
    envToProperty.put("CANARY_USER_OCID", "canaryUserOcid");
    envToProperty.put("CANARY_USER_VAULT_ID", "canaryUserVaultId");
    envToProperty.put("CANARY_USER_VAULT_NAME", "canaryUserVaultName");
    envToProperty.put("CANARY_USER_FINGERPRINT_SECRET_NAME", "canaryUserFingerprintSecretName");
    envToProperty.put("CANARY_USER_PEM_SECRET_NAME", "canaryUserPemSecretName");
    envToProperty.put("CANARY_USER_GRANT_ADMIN_ENABLED", "canaryUserGrantAdminEnabled");
    envToProperty.put("CANARY_USER_GRANT_ADMIN_REQUIRED", "canaryUserGrantAdminRequired");
    envToProperty.put(
        "CANARY_USER_GRANT_PROPAGATION_SECONDS", "canaryUserGrantPropagationSeconds");
    envToProperty.put("TENANCY", "tenancy");
    envToProperty.put("HOME_REGION", "homeRegion");
    envToProperty.put("VAULT_ID", "vaultId");
    envToProperty.put("GIT_CONFIG_BOOTSTRAP_ENABLED", "gitConfigBootstrapEnabled");
    envToProperty.put("GIT_VAULT_OCID", "gitVaultOcid");
    envToProperty.put("SCM_SECRET_NAME", "scmSecretName");
    envToProperty.put("SCM_URL", "scmUrl");
    envToProperty.put("SCM_BRANCH_NAME", "scmBranchName");
    envToProperty.put("GIT_TEST_USER", "gitTestUser");
    envToProperty.put("GIT_PROVIDER_NAME", "gitProviderName");
    envToProperty.put("GIT_PROVIDER_KEY", "gitProviderKey");

    for (Map.Entry<String, String> entry : envToProperty.entrySet()) {
      String envValue = System.getenv(entry.getKey());
      if (!isBlank(envValue) && isBlank(System.getProperty(entry.getValue()))) {
        System.setProperty(entry.getValue(), envValue.trim());
      }
    }
  }

  private static boolean setPropertyFromAssignment(String assignment) {
    int equalsIndex = assignment.indexOf('=');
    if (equalsIndex <= 0) {
      return false;
    }
    setProperty(
        normalizeOptionName(assignment.substring(0, equalsIndex)),
        assignment.substring(equalsIndex + 1));
    return true;
  }

  private static void setProperty(String key, String value) {
    if (isBlank(key)) {
      throw new IllegalArgumentException("Property name must not be blank.");
    }
    System.setProperty(key, value == null ? "" : value);
  }

  private static String normalizeOptionName(String option) {
    return switch (option) {
      case "suite", "suite-xml-file" -> "suiteXmlFile";
      case "excluded-groups" -> "excludedGroups";
      case "thread-count" -> "threadCount";
      case "output-directory" -> "outputDirectory";
      case "test-jar" -> "testJar";
      default -> kebabToCamel(option);
    };
  }

  private static String kebabToCamel(String option) {
    StringBuilder builder = new StringBuilder();
    boolean uppercaseNext = false;
    for (int i = 0; i < option.length(); i++) {
      char ch = option.charAt(i);
      if (ch == '-' || ch == '_' || ch == '.') {
        uppercaseNext = true;
        continue;
      }
      if (uppercaseNext) {
        builder.append(Character.toUpperCase(ch));
        uppercaseNext = false;
      } else {
        builder.append(ch);
      }
    }
    return builder.toString();
  }

  private static String normalizeSuiteXml(String suiteXmlFile) {
    String normalized = suiteXmlFile.replace('\\', '/');
    String resourcePrefix = "src/test/resources/";
    if (normalized.startsWith(resourcePrefix)) {
      normalized = normalized.substring(resourcePrefix.length());
    }
    while (normalized.startsWith("/")) {
      normalized = normalized.substring(1);
    }
    return normalized;
  }

  private static XmlSuite.ParallelMode parseParallelMode(String value) {
    String normalized = value.trim().replace('-', '_').toUpperCase(Locale.ROOT);
    if ("NONE".equals(normalized) || "FALSE".equals(normalized)) {
      return XmlSuite.ParallelMode.NONE;
    }
    return Arrays.stream(XmlSuite.ParallelMode.values())
        .filter(mode -> mode.name().equals(normalized))
        .findFirst()
        .orElseThrow(() -> new IllegalArgumentException("Unsupported parallel mode: " + value));
  }

  private static int parsePositiveInt(String key, String value) {
    try {
      int parsed = Integer.parseInt(value.trim());
      if (parsed <= 0) {
        throw new IllegalArgumentException(key + " must be positive: " + value);
      }
      return parsed;
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException(key + " must be a whole number: " + value, e);
    }
  }

  private static String value(String key, String defaultValue) {
    String value = System.getProperty(key);
    if (!isBlank(value)) {
      return value.trim();
    }
    return defaultValue;
  }

  private static void logRunnerConfiguration() {
    System.out.println(
        "[AIDP-SDK-CLI-TEST-RUNNER] suiteXmlFile="
            + normalizeSuiteXml(value("suiteXmlFile", DEFAULT_SUITE_XML)));
    System.out.println(
        "[AIDP-SDK-CLI-TEST-RUNNER] groups=" + value("groups", "<suite-default>"));
    System.out.println(
        "[AIDP-SDK-CLI-TEST-RUNNER] testJar=" + configuredTestJar());
    System.out.println(
        "[AIDP-SDK-CLI-TEST-RUNNER] outputDirectory="
            + value("outputDirectory", "target/failsafe-reports"));
  }

  private static void printUsage() {
    System.out.println(
        """
        Usage:
          java [JVM -Dkey=value ...] -jar aidp-sdk-cli-tests-<version>-test-jar-with-dependencies.jar [options]

        Common options:
          --suiteXmlFile <path>       TestNG suite XML. Defaults to test-suites/sdk-validation.xml.
          --groups <groups>           TestNG groups, for example rel_validation or cli_cluster.
          --excludedGroups <groups>   TestNG groups to exclude.
          --threadCount <count>       Override TestNG thread count.
          --parallel <mode>           TestNG parallel mode: methods, classes, tests, instances, or none.
          --outputDirectory <path>    TestNG output directory. Defaults to target/failsafe-reports.
          --testJar <path>            Override packaged test jar path.

        Test configuration options can be passed either as JVM properties or as runner options:
          -DaidpCliPath=/path/to/aidp
          -DdataHubId=<aidp_instance_ocid>
          -DdpServiceEndpoint=<endpoint>
          -Dregion=<oci_region>
          -DociConfigFilePath=~/.oci/config
          -DociProfile=DEFAULT
          -DcliTestConfigFile=/path/to/cli-test.properties
          -DsdkTestConfigFile=/path/to/sdk.test.properties
          -DcanaryUserBootstrapEnabled=true|false
          -DcanaryUserGrantAdminEnabled=true|false
          -DcanaryUserGrantAdminRequired=true|false
          -DgitConfigBootstrapEnabled=auto|true|false
          -DgitVaultOcid=<vault_ocid>
        """);
  }

  private static boolean isBlank(String value) {
    return value == null || value.isBlank();
  }

  private enum ArgumentResult {
    OK,
    HELP,
    ERROR
  }
}
