package com.oracle.aidp.sdk.logging;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public final class SdkTestListener implements ITestListener, ISuiteListener {
  private static final int STACK_TRACE_MAX_CHARACTERS = 12000;
  private static final ThreadLocal<String> CURRENT_TEST_NAME = new ThreadLocal<>();

  @Override
  public void onStart(ISuite suite) {
    SdkTestLogger.info("SUITE", "START " + suite.getName());
  }

  @Override
  public void onFinish(ISuite suite) {
    SdkTestLogger.info("SUITE", "FINISH " + suite.getName());
    logReportLocations(suite);
  }

  @Override
  public void onStart(ITestContext context) {
    ITestNGMethod[] methods = context.getAllTestMethods();
    SdkTestLogger.info(
        "TEST-PLAN", "Selected tests for " + context.getName() + ": " + methods.length);
    Arrays.stream(methods)
        .sorted(Comparator.comparing(SdkTestListener::testName))
        .forEach(
            method ->
                SdkTestLogger.info(
                    "TEST-PLAN",
                    " - "
                        + testName(method)
                        + " groups="
                        + Arrays.toString(method.getGroups())));
  }

  @Override
  public void onTestStart(ITestResult result) {
    CURRENT_TEST_NAME.set(shortTestName(result));
    SdkTestLogger.info(
        "TEST",
        "START "
            + shortTestName(result)
            + " groups="
            + Arrays.toString(result.getMethod().getGroups()));
  }

  @Override
  public void onTestSuccess(ITestResult result) {
    SdkTestLogger.info("TEST", "PASS " + testName(result) + " durationMs=" + durationMs(result));
    clearThreadLocals();
  }

  @Override
  public void onTestFailure(ITestResult result) {
    SdkTestLogger.info("TEST", "FAIL " + testName(result) + " durationMs=" + durationMs(result));
    SdkTestLogger.block(
        "TEST",
        "Failure stack trace:",
        SdkTestLogger.stackTrace(result.getThrowable()),
        STACK_TRACE_MAX_CHARACTERS);
    clearThreadLocals();
  }

  @Override
  public void onTestSkipped(ITestResult result) {
    SdkTestLogger.info("TEST", "SKIP " + testName(result) + " durationMs=" + durationMs(result));
    if (result.getThrowable() != null) {
      SdkTestLogger.block(
          "TEST",
          "Skip reason:",
          SdkTestLogger.stackTrace(result.getThrowable()),
          STACK_TRACE_MAX_CHARACTERS);
    }
    clearThreadLocals();
  }

  public static String currentTestName() {
    String testName = CURRENT_TEST_NAME.get();
    return testName == null ? "<test-setup-or-cleanup>" : testName;
  }

  private static void clearThreadLocals() {
    CURRENT_TEST_NAME.remove();
    SdkTestLogger.clearCurrentRequestId();
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
    SdkTestLogger.info("REPORT", "suiteReportDir=" + suiteReportDirectory);
    Path reportDirectory = suiteReportDirectory.getParent();
    if (reportDirectory == null) {
      return;
    }

    SdkTestLogger.info("REPORT", "testngHtml=" + reportDirectory.resolve("index.html"));
    SdkTestLogger.info("REPORT", "testngResultsXml=" + reportDirectory.resolve("testng-results.xml"));
    SdkTestLogger.info("REPORT", "failsafeSummary=" + reportDirectory.resolve("failsafe-summary.xml"));
  }
}
