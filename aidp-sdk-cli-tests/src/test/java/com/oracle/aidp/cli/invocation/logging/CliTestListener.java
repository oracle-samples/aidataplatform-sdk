package com.oracle.aidp.cli.invocation.logging;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public final class CliTestListener implements ITestListener, ISuiteListener {
  private static final int STACK_TRACE_MAX_CHARACTERS = 12000;

  @Override
  public void onStart(ISuite suite) {
    CliTestLogger.info("SUITE", "START " + suite.getName());
  }

  @Override
  public void onFinish(ISuite suite) {
    CliTestLogger.info("SUITE", "FINISH " + suite.getName());
    logReportLocations(suite);
  }

  @Override
  public void onStart(ITestContext context) {
    ITestNGMethod[] methods = context.getAllTestMethods();
    CliTestLogger.info(
        "TEST-PLAN", "Selected tests for " + context.getName() + ": " + methods.length);
    Arrays.stream(methods)
        .sorted(Comparator.comparing(CliTestListener::testName))
        .forEach(
            method ->
                CliTestLogger.info(
                    "TEST-PLAN",
                    " - "
                        + testName(method)
                        + " groups="
                        + Arrays.toString(method.getGroups())));
  }

  @Override
  public void onTestStart(ITestResult result) {
    CliTestLogger.info(
        "TEST",
        "Starting test "
            + shortTestName(result)
            + " groups="
            + Arrays.toString(result.getMethod().getGroups()));
  }

  @Override
  public void onTestSuccess(ITestResult result) {
    CliTestLogger.info("TEST", "PASS " + testName(result) + " durationMs=" + durationMs(result));
  }

  @Override
  public void onTestFailure(ITestResult result) {
    CliTestLogger.info("TEST", "FAIL " + testName(result) + " durationMs=" + durationMs(result));
    CliTestLogger.block(
        "TEST",
        "Failure stack trace:",
        CliTestLogger.stackTrace(result.getThrowable()),
        STACK_TRACE_MAX_CHARACTERS);
  }

  @Override
  public void onTestSkipped(ITestResult result) {
    CliTestLogger.info("TEST", "SKIP " + testName(result) + " durationMs=" + durationMs(result));
    if (result.getThrowable() != null) {
      CliTestLogger.block(
          "TEST",
          "Skip reason:",
          CliTestLogger.stackTrace(result.getThrowable()),
          STACK_TRACE_MAX_CHARACTERS);
    }
  }

  private static String testName(ITestResult result) {
    return testName(result.getMethod());
  }

  private static String testName(ITestNGMethod method) {
    return method.getRealClass().getName() + "." + method.getMethodName();
  }

  private static String shortTestName(ITestResult result) {
    ITestNGMethod method = result.getMethod();
    return method.getRealClass().getSimpleName() + "." + method.getMethodName();
  }

  private static long durationMs(ITestResult result) {
    long endMillis = result.getEndMillis() > 0 ? result.getEndMillis() : System.currentTimeMillis();
    return Math.max(0L, endMillis - result.getStartMillis());
  }

  private static void logReportLocations(ISuite suite) {
    String outputDirectory = suite.getOutputDirectory();
    if (outputDirectory == null || outputDirectory.isBlank()) {
      return;
    }

    Path suiteReportDirectory = Path.of(outputDirectory).toAbsolutePath().normalize();
    CliTestLogger.info("REPORT", "suiteReportDir=" + suiteReportDirectory);
    Path reportDirectory = suiteReportDirectory.getParent();
    if (reportDirectory == null) {
      return;
    }

    CliTestLogger.info("REPORT", "testngHtml=" + reportDirectory.resolve("index.html"));
    CliTestLogger.info("REPORT", "testngResultsXml=" + reportDirectory.resolve("testng-results.xml"));
    CliTestLogger.info("REPORT", "failsafeSummary=" + reportDirectory.resolve("failsafe-summary.xml"));
  }
}
