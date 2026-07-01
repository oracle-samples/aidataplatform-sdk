package com.oracle.aidp.sdk.audit;

import static com.oracle.aidp.sdk.support.SdkTestSupport.assertSuccessful;
import static com.oracle.aidp.sdk.support.SdkTestSupport.requestId;
import static org.testng.Assert.assertNotNull;

import com.oracle.aidp.sdk.client.SdkClients;
import com.oracle.aidp.sdk.config.SdkTestConfig;
import com.oracle.aidataplatform.dp.AuditClient;
import com.oracle.aidataplatform.dp.model.Action;
import com.oracle.aidataplatform.dp.model.ManageAuditLogsDetails;
import com.oracle.aidataplatform.dp.model.SearchAuditLogsDetails;
import com.oracle.aidataplatform.dp.requests.ManageAuditLogsRequest;
import com.oracle.aidataplatform.dp.requests.SearchAuditLogsRequest;
import com.oracle.aidataplatform.dp.responses.ManageAuditLogsResponse;
import com.oracle.aidataplatform.dp.responses.SearchAuditLogsResponse;
import com.oracle.bmc.model.BmcException;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AuditSdkIT {
  private SdkTestConfig config;
  private AuditClient auditClient;

  @BeforeClass(
      alwaysRun = true,
      groups = {"sdk_tests", "sdk_audit", "audit", "rel_validation"})
  public void setUp() throws Exception {
    config = SdkTestConfig.load();
    auditClient = SdkClients.auditClient(config);
  }

  @Test(groups = {"sdk_tests", "sdk_audit", "audit", "rel_validation"}, priority = 0)
  public void manageAuditLogsTest() {
    if (!config.runAuditManageLogsTests()) {
      throw new SkipException("Set sdkRunAuditManageLogsTests=true to run audit log mutation tests.");
    }

    ManageAuditLogsDetails.Builder detailsBuilder =
        ManageAuditLogsDetails.builder().action(Action.create(config.auditManageAction()));
    if (config.auditRetentionPeriod() != null) {
      detailsBuilder.retentionPeriod(config.auditRetentionPeriod());
    }

    ManageAuditLogsResponse response =
        auditClient.manageAuditLogs(
            ManageAuditLogsRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .manageAuditLogsDetails(detailsBuilder.build())
                .opcRetryToken(requestId("manage-audit-logs-retry"))
                .opcRequestId(requestId("manage-audit-logs"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getOpcRequestId());
  }

  @Test(groups = {"sdk_tests", "sdk_audit", "audit", "rel_validation"}, priority = 1)
  public void searchAuditLogsTest() {
    SearchAuditLogsDetails details =
        SearchAuditLogsDetails.builder()
            .timeBegin(Date.from(Instant.now().minus(config.auditSearchWindowHours(), ChronoUnit.HOURS)))
            .timeEnd(Date.from(Instant.now()))
            .sortBy(SearchAuditLogsDetails.SortBy.Time)
            .sortOrder(SearchAuditLogsDetails.SortOrder.Desc)
            .build();

    SearchAuditLogsResponse response = searchAuditLogsWithRetry(details);

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getAuditLogSearchResultCollection());
    assertNotNull(response.getAuditLogSearchResultCollection().getItems());
  }

  private SearchAuditLogsResponse searchAuditLogsWithRetry(SearchAuditLogsDetails details) {
    long deadline = System.nanoTime() + config.auditSearchReadyTimeout().toNanos();
    BmcException lastNotReady = null;
    while (System.nanoTime() < deadline) {
      try {
        return auditClient.searchAuditLogs(
            SearchAuditLogsRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .searchAuditLogsDetails(details)
                .limit(config.auditSearchLimit())
                .opcRetryToken(requestId("search-audit-logs-retry"))
                .opcRequestId(requestId("search-audit-logs"))
                .build());
      } catch (BmcException e) {
        if (!isAuditSearchNotReady(e)) {
          throw e;
        }
        lastNotReady = e;
        sleep();
      }
    }
    if (lastNotReady != null) {
      throw lastNotReady;
    }
    throw new AssertionError("Audit search did not complete within configured timeout.");
  }

  private static boolean isAuditSearchNotReady(BmcException e) {
    return e.getStatusCode() == 404
        && e.getMessage() != null
        && e.getMessage().contains("Unknown resource");
  }

  private void sleep() {
    try {
      Thread.sleep(config.pollInterval().toMillis());
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new RuntimeException("Interrupted while waiting for audit search readiness", e);
    }
  }

  @AfterClass(
      alwaysRun = true,
      groups = {"sdk_tests", "sdk_audit", "audit", "rel_validation"})
  public void tearDown() {
    if (auditClient != null) {
      auditClient.close();
    }
  }
}
