package com.oracle.aidp.cli.invocation.audit;

import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.assertStatus;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.assertStatusIn;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.assertSuccess;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.data;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.firstExisting;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.optionalText;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.responseJson;
import static org.testng.Assert.assertTrue;

import com.fasterxml.jackson.databind.JsonNode;
import com.oracle.aidp.cli.invocation.config.CliTestConfig;
import com.oracle.aidp.cli.invocation.runner.CliCommandResult;
import com.oracle.aidp.cli.invocation.runner.CliCommandRunner;
import com.oracle.aidp.cli.invocation.runner.CliInvocationBuilder;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AuditRelValidationCliIT {
  private static final String GROUP_CLI_TESTS = "cli_tests";
  private static final String GROUP_CLI_AUDIT = "cli_audit";
  private static final String GROUP_AUDIT = "audit";
  private static final String GROUP_REL_VALIDATION = "rel_validation";

  private static final Duration AUDIT_SEARCH_READY_TIMEOUT = Duration.ofMinutes(3);
  private static final Duration POLL_INTERVAL = Duration.ofSeconds(10);

  private CliTestConfig config;
  private CliCommandRunner runner;
  private CliInvocationBuilder invocationBuilder;

  @BeforeClass(
      alwaysRun = true,
      groups = {GROUP_CLI_TESTS, GROUP_CLI_AUDIT, GROUP_AUDIT, GROUP_REL_VALIDATION})
  public void setUp() {
    config = CliTestConfig.load();
    runner = new CliCommandRunner(config);
    invocationBuilder = new CliInvocationBuilder(config);
  }

  @Test(groups = {GROUP_CLI_TESTS, GROUP_CLI_AUDIT, GROUP_AUDIT, GROUP_REL_VALIDATION})
  public void testManageLogsCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "audit", "manage-logs", enableAuditLogsBody())));

    assertStatusIn(response, 200, 202, 204);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_AUDIT, GROUP_AUDIT, GROUP_REL_VALIDATION},
      dependsOnMethods = "testManageLogsCommand")
  public void testSearchLogsCommand() {
    JsonNode response =
        pollForSuccessfulResponse(
            "audit log search",
            AUDIT_SEARCH_READY_TIMEOUT,
            () ->
                runner.run(
                    invocationBuilder.commandWithBody(
                        "audit", "search-logs", searchAuditLogsBody(), "--limit", "10")),
            this::hasAuditLogCollection);

    assertStatus(response, 200);
    List<JsonNode> auditLogs = auditLogItems(response);
    if (!auditLogs.isEmpty()) {
      assertAuditLogSummaryShape(auditLogs.get(0));
    }
  }

  private String enableAuditLogsBody() {
    return """
        {
          "action": "ENABLE",
          "retentionPeriod": 90
        }
        """;
  }

  private String searchAuditLogsBody() {
    return """
        {
          "sortBy": "time",
          "sortOrder": "DESC",
          "timeBegin": "%s",
          "timeEnd": "%s"
        }
        """
        .formatted(timeBegin(), timeEnd());
  }

  private String timeBegin() {
    return Instant.now().minus(Duration.ofHours(2)).toString();
  }

  private String timeEnd() {
    return Instant.now().toString();
  }

  private JsonNode pollForSuccessfulResponse(
      String description,
      Duration timeout,
      Supplier<CliCommandResult> command,
      Predicate<JsonNode> responsePredicate) {
    long deadline = System.nanoTime() + timeout.toNanos();
    String lastOutput = null;
    JsonNode lastResponse = null;
    while (System.nanoTime() < deadline) {
      CliCommandResult result = command.get();
      lastOutput = result.combinedOutput();
      lastResponse = responseJsonOrNull(result);
      if (result.exitCode() == 0 && lastResponse != null && hasStatus(lastResponse, 200)) {
        if (responsePredicate.test(lastResponse)) {
          return lastResponse;
        }
      } else if (lastResponse != null && !hasStatus(lastResponse, 404, 409, 500, 502, 503, 504)) {
        throw new AssertionError(
            "Unexpected response while waiting for "
                + description
                + ". Response="
                + lastResponse
                + " output="
                + lastOutput);
      }
      sleep();
    }
    throw new AssertionError(
        "Timed out waiting for "
            + description
            + ". Last response="
            + lastResponse
            + " last output="
            + lastOutput);
  }

  private boolean hasAuditLogCollection(JsonNode response) {
    return auditLogItemsNode(response).isArray();
  }

  private List<JsonNode> auditLogItems(JsonNode response) {
    List<JsonNode> values = new ArrayList<>();
    JsonNode items = auditLogItemsNode(response);
    if (items.isArray()) {
      items.forEach(values::add);
    }
    return values;
  }

  private JsonNode auditLogItemsNode(JsonNode response) {
    JsonNode responseData = data(response);
    JsonNode directItems = responseData.path("items");
    if (directItems.isArray()) {
      return directItems;
    }
    return firstExisting(
            responseData,
            "auditLogSearchResultCollection",
            "audit_log_search_result_collection")
        .path("items");
  }

  private void assertAuditLogSummaryShape(JsonNode auditLog) {
    String objectType = optionalText(auditLog, "objectType", "object_type");
    String operation = optionalText(auditLog, "operation");
    String status = optionalText(auditLog, "status");
    String objectName = optionalText(auditLog, "objectName", "object_name");
    assertTrue(
        objectType != null || operation != null || status != null || objectName != null,
        "Audit log item did not contain expected summary fields: " + auditLog);
  }

  private boolean hasStatus(JsonNode response, int... statuses) {
    if (response == null || !response.path("status").isNumber()) {
      return false;
    }
    int actual = response.path("status").asInt();
    for (int status : statuses) {
      if (actual == status) {
        return true;
      }
    }
    return false;
  }

  private JsonNode responseJsonOrNull(CliCommandResult result) {
    try {
      if (result.combinedOutput().contains("Response:")) {
        return responseJson(result);
      }
      return null;
    } catch (AssertionError e) {
      return null;
    }
  }

  private void sleep() {
    try {
      Thread.sleep(POLL_INTERVAL.toMillis());
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new AssertionError("Interrupted while waiting for audit CLI response.", e);
    }
  }
}
