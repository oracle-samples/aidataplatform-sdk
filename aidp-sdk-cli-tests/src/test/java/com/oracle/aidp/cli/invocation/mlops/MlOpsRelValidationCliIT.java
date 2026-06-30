package com.oracle.aidp.cli.invocation.mlops;

import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.assertStatus;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.assertStatusIn;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.data;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.optionalText;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.requiredText;
import static com.oracle.aidp.cli.invocation.support.CliRelValidationSupport.collectionItems;
import static com.oracle.aidp.cli.invocation.support.CliRelValidationSupport.entity;
import static com.oracle.aidp.cli.invocation.support.CliRelValidationSupport.runStructured;
import static com.oracle.aidp.cli.invocation.support.CliRelValidationSupport.runStructuredWithBody;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.MissingNode;
import com.oracle.aidp.cli.invocation.config.CliTestConfig;
import com.oracle.aidp.cli.invocation.runner.CliCommandResult;
import com.oracle.aidp.cli.invocation.runner.CliCommandRunner;
import com.oracle.aidp.cli.invocation.runner.CliInvocationBuilder;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MlOpsRelValidationCliIT {
  private CliTestConfig config;
  private CliCommandRunner runner;
  private CliInvocationBuilder invocationBuilder;
  private String workspaceKey;
  private String workspaceName;
  private boolean workspaceCreatedByTest;
  private String experimentName;
  private String experimentId;
  private String runName;
  private String runId;
  private String metricKey;
  private String registeredModelName;
  private String modelVersion;
  private String workspaceModelVersion;
  private final List<ModelVersionRef> createdModelVersions = new ArrayList<>();

  @BeforeClass(
      alwaysRun = true,
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"})
  public void setUp() {
    config = CliTestConfig.load();
    runner = new CliCommandRunner(config);
    invocationBuilder = new CliInvocationBuilder(config);
    ensureWorkspace();
  }

  @Test(groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"}, priority = 0)
  public void testCreateExperimentCommand() {
    experimentName = config.mlOpsNamePrefix() + "experiment_" + UUID.randomUUID().toString().replace("-", "");
    JsonNode response =
        runMlopsWithBody(
            "create-experiment",
            """
            {
              "name": %s,
              "tags": [
                {
                  "key": "cli_created",
                  "value": "true"
                }
              ]
            }
            """
                .formatted(quoted(experimentName)),
            workspaceKey);

    assertStatusIn(response, 200, 201);
    experimentId = extractExperimentId(response);
    assertNotNull(experimentId, "Create experiment should return an experiment id.");
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 1,
      dependsOnMethods = {"testCreateExperimentCommand"})
  public void testGetExperimentByIdCommand() {
    JsonNode response =
        runMlops(
            "get-experiment-by-id",
            workspaceKey,
            "--experiment-id",
            experimentId);

    assertStatus(response, 200);
    assertNotNull(data(response), "Get experiment by id response should contain data.");
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 2,
      dependsOnMethods = {"testCreateExperimentCommand"})
  public void testGetExperimentByNameCommand() {
    JsonNode response =
        runMlops(
            "get-experiment-by-name",
            workspaceKey,
            "--experiment-name",
            experimentName);

    assertStatus(response, 200);
    assertNotNull(data(response), "Get experiment by name response should contain data.");
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 3,
      dependsOnMethods = {"testCreateExperimentCommand"})
  public void testUpdateExperimentCommand() {
    String updatedName = experimentName + "_updated";
    JsonNode response =
        runMlopsWithBody(
            "update-experiment",
            """
            {
              "experiment_id": %s,
              "new_name": %s
            }
            """
                .formatted(quoted(experimentId), quoted(updatedName)),
            workspaceKey);

    assertStatusIn(response, 200, 202);
    experimentName = updatedName;
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 4,
      dependsOnMethods = {"testCreateExperimentCommand"})
  public void testSetExperimentTagCommand() {
    JsonNode response =
        runMlopsWithBody(
            "set-experiment-tag",
            """
            {
              "experiment_id": %s,
              "key": "cli_experiment_tag",
              "value": "set"
            }
            """
                .formatted(quoted(experimentId)),
            workspaceKey);

    assertStatusIn(response, 200, 201, 202, 204);
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 5,
      dependsOnMethods = {"testSetExperimentTagCommand"})
  public void testUpdateExperimentTagsCommand() {
    JsonNode response =
        runMlopsWithBody(
            "update-experiment-tags",
            """
            {
              "experiment_id": %s,
              "set_tags": [
                {
                  "key": "cli_experiment_batch_tag",
                  "value": "set"
                }
              ],
              "delete_tags": [
                {
                  "key": "cli_experiment_tag"
                }
              ]
            }
            """
                .formatted(quoted(experimentId)),
            workspaceKey);

    assertStatusIn(response, 200, 201, 202, 204);
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 6,
      dependsOnMethods = {"testUpdateExperimentTagsCommand"})
  public void testDeleteExperimentTagCommand() {
    JsonNode response =
        runMlopsWithBody(
            "delete-experiment-tag",
            """
            {
              "experiment_id": %s,
              "key": "cli_experiment_batch_tag"
            }
            """
                .formatted(quoted(experimentId)),
            workspaceKey);

    assertStatusIn(response, 200, 202, 204);
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 7,
      dependsOnMethods = {"testCreateExperimentCommand"})
  public void testCreateExperimentRunCommand() {
    runName = config.mlOpsNamePrefix() + "run_" + UUID.randomUUID().toString().replace("-", "");
    JsonNode response =
        runMlopsWithBody(
            "create-experiment-run",
            """
            {
              "experiment_id": %s,
              "run_name": %s,
              "start_time": %d,
              "tags": [
                {
                  "key": "cli_created",
                  "value": "true"
                }
              ]
            }
            """
                .formatted(quoted(experimentId), quoted(runName), System.currentTimeMillis()),
            workspaceKey);

    assertStatusIn(response, 200, 201);
    runId = extractRunId(response);
    assertNotNull(runId, "Create experiment run should return a run id.");
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 8,
      dependsOnMethods = {"testCreateExperimentRunCommand"})
  public void testGetExperimentRunByIdCommand() {
    JsonNode response = runMlops("get-experiment-run-by-id", workspaceKey, "--run-id", runId);

    assertStatus(response, 200);
    assertNotNull(data(response), "Get experiment run by id response should contain data.");
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 9,
      dependsOnMethods = {"testCreateExperimentRunCommand"})
  public void testListArtifactsCommand() {
    JsonNode response = runMlops("list-artifacts", workspaceKey, "--run-id", runId);

    assertStatus(response, 200);
    assertNotNull(data(response), "List artifacts response should contain data.");
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 10,
      dependsOnMethods = {"testCreateExperimentCommand"})
  public void testListExperimentsCommand() {
    JsonNode response = runMlopsWithBody("list-experiments", "{\"max_results\": 10}", workspaceKey);

    assertStatus(response, 200);
    assertNotNull(data(response), "List experiments response should contain data.");
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 11,
      dependsOnMethods = {"testCreateExperimentRunCommand"})
  public void testListExperimentRunsCommand() {
    JsonNode response =
        runMlopsWithBody(
            "list-experiment-runs",
            """
            {
              "experiment_ids": [%s],
              "max_results": 10
            }
            """
                .formatted(quoted(experimentId)),
            workspaceKey);

    assertStatus(response, 200);
    assertNotNull(data(response), "List experiment runs response should contain data.");
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 12,
      dependsOnMethods = {"testCreateExperimentRunCommand"})
  public void testLogExperimentRunParamCommand() {
    JsonNode response =
        runMlopsWithBody(
            "log-experiment-run-param",
            """
            {
              "run_id": %s,
              "key": "cli_param",
              "value": "value"
            }
            """
                .formatted(quoted(runId)),
            workspaceKey);

    assertStatusIn(response, 200, 201, 202, 204);
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 13,
      dependsOnMethods = {"testCreateExperimentRunCommand"})
  public void testLogExperimentRunMetricCommand() {
    metricKey = "cli_metric_" + UUID.randomUUID().toString().replace("-", "");
    JsonNode response =
        runMlopsWithBody(
            "log-experiment-run-metric",
            """
            {
              "run_id": %s,
              "key": %s,
              "value": 1.0,
              "timestamp": %d,
              "step": 0
            }
            """
                .formatted(quoted(runId), quoted(metricKey), System.currentTimeMillis()),
            workspaceKey);

    assertStatusIn(response, 200, 201, 202, 204);
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 14,
      dependsOnMethods = {"testLogExperimentRunMetricCommand"})
  public void testGetExperimentRunMetricHistoryCommand() {
    JsonNode response =
        runMlops(
            "get-experiment-run-metric-history",
            workspaceKey,
            "--run-id",
            runId,
            "--metric-key",
            metricKey,
            "--max-results",
            "10");

    assertStatus(response, 200);
    assertNotNull(data(response), "Metric history response should contain data.");
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 15,
      dependsOnMethods = {"testCreateExperimentRunCommand"})
  public void testLogExperimentRunBatchCommand() {
    long now = System.currentTimeMillis();
    JsonNode response =
        runMlopsWithBody(
            "log-experiment-run-batch",
            """
            {
              "run_id": %s,
              "metrics": [
                {
                  "key": "cli_batch_metric",
                  "value": 2.0,
                  "timestamp": %d,
                  "step": 1
                }
              ],
              "params": [
                {
                  "key": "cli_batch_param",
                  "value": "value"
                }
              ],
              "tags": [
                {
                  "key": "cli_batch_run_tag",
                  "value": "set"
                }
              ]
            }
            """
                .formatted(quoted(runId), now),
            workspaceKey);

    assertStatusIn(response, 200, 201, 202, 204);
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 16,
      dependsOnMethods = {"testCreateExperimentRunCommand"})
  public void testLogExperimentRunModelCommand() {
    JsonNode response =
        runMlopsWithBody(
            "log-experiment-run-model",
            """
            {
              "run_id": %s,
              "model_json": %s
            }
            """
                .formatted(quoted(runId), quoted(logModelJson())),
            workspaceKey);

    assertStatusIn(response, 200, 201, 202, 204);
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 17,
      dependsOnMethods = {"testLogExperimentRunModelCommand"})
  public void testListLoggedModelsCommand() {
    JsonNode response =
        runMlopsWithBody(
            "list-logged-models",
            """
            {
              "experiment_ids": [%s],
              "max_results": 10
            }
            """
                .formatted(quoted(experimentId)),
            workspaceKey);

    assertStatus(response, 200);
    assertNotNull(data(response), "List logged models response should contain data.");
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 18,
      dependsOnMethods = {"testCreateExperimentRunCommand"})
  public void testLogExperimentRunInputsCommand() {
    JsonNode response =
        runMlopsWithBody(
            "log-experiment-run-inputs",
            """
            {
              "run_id": %s,
              "dataset_inputs": [
                {
                  "dataset": {
                    "name": "cli_dataset",
                    "digest": "cli-digest",
                    "source_type": "URI",
                    "source": "file:///tmp/cli-dataset",
                    "schema": "{}",
                    "profile": "{}"
                  },
                  "tags": [
                    {
                      "key": "cli_input",
                      "value": "true"
                    }
                  ]
                }
              ]
            }
            """
                .formatted(quoted(runId)),
            workspaceKey);

    assertStatusIn(response, 200, 201, 202, 204);
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 19,
      dependsOnMethods = {"testCreateExperimentRunCommand"})
  public void testSetExperimentRunTagCommand() {
    JsonNode response =
        runMlopsWithBody(
            "set-experiment-run-tag",
            """
            {
              "run_id": %s,
              "key": "cli_run_tag",
              "value": "set"
            }
            """
                .formatted(quoted(runId)),
            workspaceKey);

    assertStatusIn(response, 200, 201, 202, 204);
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 20,
      dependsOnMethods = {"testSetExperimentRunTagCommand"})
  public void testUpdateExperimentRunTagsCommand() {
    JsonNode response =
        runMlopsWithBody(
            "update-experiment-run-tags",
            """
            {
              "run_id": %s,
              "set_tags": [
                {
                  "key": "cli_run_batch_tag",
                  "value": "set"
                }
              ],
              "delete_tags": [
                {
                  "key": "cli_run_tag"
                }
              ]
            }
            """
                .formatted(quoted(runId)),
            workspaceKey);

    assertStatusIn(response, 200, 201, 202, 204);
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 21,
      dependsOnMethods = {"testUpdateExperimentRunTagsCommand"})
  public void testDeleteExperimentRunTagCommand() {
    JsonNode response =
        runMlopsWithBody(
            "delete-experiment-run-tag",
            """
            {
              "run_id": %s,
              "key": "cli_run_batch_tag"
            }
            """
                .formatted(quoted(runId)),
            workspaceKey);

    assertStatusIn(response, 200, 202, 204);
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 22,
      dependsOnMethods = {"testDeleteExperimentRunTagCommand"})
  public void testUpdateExperimentRunCommand() {
    String updatedRunName = runName + "_updated";
    JsonNode response =
        runMlopsWithBody(
            "update-experiment-run",
            """
            {
              "run_id": %s,
              "run_name": %s,
              "status": "FINISHED",
              "end_time": %d
            }
            """
                .formatted(quoted(runId), quoted(updatedRunName), System.currentTimeMillis()),
            workspaceKey);

    assertStatusIn(response, 200, 202);
    runName = updatedRunName;
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 23,
      dependsOnMethods = {"testUpdateExperimentRunCommand", "testDeleteModelVersionCommand"})
  public void testDeleteExperimentRunCommand() {
    JsonNode response =
        runMlopsWithBody(
            "delete-experiment-run",
            """
            {
              "run_id": %s
            }
            """
                .formatted(quoted(runId)),
            workspaceKey);

    assertStatusIn(response, 200, 202, 204);
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 24,
      dependsOnMethods = {"testDeleteExperimentRunCommand"})
  public void testRestoreExperimentRunCommand() {
    JsonNode response =
        runMlopsWithBody(
            "restore-experiment-run",
            """
            {
              "run_id": %s
            }
            """
                .formatted(quoted(runId)),
            workspaceKey);

    assertStatusIn(response, 200, 202, 204);
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 25,
      dependsOnMethods = {"testRestoreExperimentRunCommand"})
  public void testDeleteExperimentCommand() {
    JsonNode response =
        runMlopsWithBody(
            "delete-experiment",
            """
            {
              "experiment_id": %s
            }
            """
                .formatted(quoted(experimentId)),
            workspaceKey);

    assertStatusIn(response, 200, 202, 204);
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 26,
      dependsOnMethods = {"testDeleteExperimentCommand"})
  public void testRestoreExperimentCommand() {
    JsonNode response =
        runMlopsWithBody(
            "restore-experiment",
            """
            {
              "experiment_id": %s
            }
            """
                .formatted(quoted(experimentId)),
            workspaceKey);

    assertStatusIn(response, 200, 202, 204);
  }

  @Test(groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"}, priority = 27)
  public void testCreateRegisteredModelCommand() {
    registeredModelName =
        qualifiedRegisteredModelName(
            config.mlOpsNamePrefix() + "model_" + UUID.randomUUID().toString().replace("-", ""));
    JsonNode response =
        runMlopsWithBody(
            "create-registered-model",
            """
            {
              "name": %s,
              "description": "Created by MlOpsRelValidationCliIT",
              "tags": [
                {
                  "key": "cli_created",
                  "value": "true"
                }
              ]
            }
            """
                .formatted(quoted(registeredModelName)));

    assertStatusIn(response, 200, 201);
    String createdName = extractRegisteredModelName(response);
    if (createdName != null && !createdName.isBlank()) {
      registeredModelName = createdName;
    }
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 28,
      dependsOnMethods = {"testCreateRegisteredModelCommand"})
  public void testGetRegisteredModelCommand() {
    JsonNode response = runMlops("get-registered-model", "--name", registeredModelName);

    assertStatus(response, 200);
    assertNotNull(data(response), "Get registered model response should contain data.");
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 29,
      dependsOnMethods = {"testCreateRegisteredModelCommand"})
  public void testListRegisteredModelsCommand() {
    JsonNode response = runMlops("list-registered-models", "--max-results", "10");

    assertStatus(response, 200);
    assertNotNull(data(response), "List registered models response should contain data.");
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 30,
      dependsOnMethods = {"testCreateRegisteredModelCommand"})
  public void testUpdateRegisteredModelCommand() {
    JsonNode response =
        runMlopsWithBody(
            "update-registered-model",
            """
            {
              "name": %s,
              "description": "Updated by MlOpsRelValidationCliIT"
            }
            """
                .formatted(quoted(registeredModelName)));

    assertStatusIn(response, 200, 202);
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 31,
      dependsOnMethods = {"testCreateRegisteredModelCommand"})
  public void testSetRegisteredModelTagCommand() {
    JsonNode response =
        runMlopsWithBody(
            "set-registered-model-tag",
            """
            {
              "name": %s,
              "key": "cli_model_tag",
              "value": "set"
            }
            """
                .formatted(quoted(registeredModelName)));

    assertStatusIn(response, 200, 201, 202, 204);
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 32,
      dependsOnMethods = {"testSetRegisteredModelTagCommand"})
  public void testUpdateRegisteredModelTagsCommand() {
    JsonNode response =
        runMlopsWithBody(
            "update-registered-model-tags",
            """
            {
              "name": %s,
              "set_tags": [
                {
                  "key": "cli_model_batch_tag",
                  "value": "set"
                }
              ],
              "delete_tags": [
                {
                  "key": "cli_model_tag"
                }
              ]
            }
            """
                .formatted(quoted(registeredModelName)));

    assertStatusIn(response, 200, 201, 202, 204);
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 33,
      dependsOnMethods = {"testUpdateRegisteredModelTagsCommand"})
  public void testDeleteRegisteredModelTagCommand() {
    JsonNode response =
        runMlopsWithBody(
            "delete-registered-model-tag",
            """
            {
              "name": %s,
              "key": "cli_model_batch_tag"
            }
            """
                .formatted(quoted(registeredModelName)));

    assertStatusIn(response, 200, 202, 204);
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 34,
      dependsOnMethods = {"testCreateRegisteredModelCommand"})
  public void testRenameRegisteredModelCommand() {
    String renamedModelName = registeredModelName + "_renamed";
    JsonNode response =
        runMlopsWithBody(
            "rename-registered-model",
            """
            {
              "name": %s,
              "new_name": %s
            }
            """
                .formatted(quoted(registeredModelName), quoted(renamedModelName)));

    assertStatusIn(response, 200, 202);
    registeredModelName = renamedModelName;
    String responseName = extractRegisteredModelName(response);
    if (responseName != null && !responseName.isBlank()) {
      registeredModelName = responseName;
    }
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 35,
      dependsOnMethods = {"testRenameRegisteredModelCommand", "testCreateExperimentRunCommand"})
  public void testCreateModelVersionCommand() {
    JsonNode response = runMlopsWithBody("create-model-version", createModelVersionBody());

    assertStatusIn(response, 200, 201);
    modelVersion = extractModelVersion(response);
    assertNotNull(modelVersion, "Create model version should return a model version.");
    createdModelVersions.add(new ModelVersionRef(registeredModelName, modelVersion));
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 36,
      dependsOnMethods = {"testCreateModelVersionCommand"})
  public void testCreateWorkspaceModelVersionCommand() {
    JsonNode response =
        runMlopsWithBody("create-workspace-model-version", createModelVersionBody(), workspaceKey);

    assertStatusIn(response, 200, 201);
    workspaceModelVersion = extractModelVersion(response);
    assertNotNull(workspaceModelVersion, "Create workspace model version should return a model version.");
    createdModelVersions.add(new ModelVersionRef(registeredModelName, workspaceModelVersion));
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 37,
      dependsOnMethods = {"testCreateModelVersionCommand"})
  public void testGetModelVersionCommand() {
    JsonNode response =
        runMlops("get-model-version", "--name", registeredModelName, "--version=" + modelVersion);

    assertStatus(response, 200);
    assertNotNull(data(response), "Get model version response should contain data.");
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 38,
      dependsOnMethods = {"testCreateModelVersionCommand"})
  public void testListModelVersionsCommand() {
    JsonNode response =
        runMlops(
            "list-model-versions",
            "--filter",
            "name='" + registeredModelName + "'",
            "--max-results",
            "10");

    assertStatus(response, 200);
    assertNotNull(data(response), "List model versions response should contain data.");
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 39,
      dependsOnMethods = {"testCreateModelVersionCommand"})
  public void testUpdateModelVersionCommand() {
    JsonNode response =
        runMlopsWithBody(
            "update-model-version",
            """
            {
              "name": %s,
              "version": %s,
              "description": "Updated by MlOpsRelValidationCliIT"
            }
            """
                .formatted(quoted(registeredModelName), quoted(modelVersion)));

    assertStatusIn(response, 200, 202);
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 40,
      dependsOnMethods = {"testCreateModelVersionCommand"})
  public void testSetModelVersionTagCommand() {
    JsonNode response =
        runMlopsWithBody(
            "set-model-version-tag",
            """
            {
              "name": %s,
              "version": %s,
              "key": "cli_version_tag",
              "value": "set"
            }
            """
                .formatted(quoted(registeredModelName), quoted(modelVersion)));

    assertStatusIn(response, 200, 201, 202, 204);
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 41,
      dependsOnMethods = {"testSetModelVersionTagCommand"})
  public void testUpdateModelVersionTagsCommand() {
    JsonNode response =
        runMlopsWithBody(
            "update-model-version-tags",
            """
            {
              "name": %s,
              "version": %s,
              "set_tags": [
                {
                  "key": "cli_version_batch_tag",
                  "value": "set"
                }
              ],
              "delete_tags": [
                {
                  "key": "cli_version_tag"
                }
              ]
            }
            """
                .formatted(quoted(registeredModelName), quoted(modelVersion)));

    assertStatusIn(response, 200, 201, 202, 204);
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 42,
      dependsOnMethods = {"testUpdateModelVersionTagsCommand"})
  public void testDeleteModelVersionTagCommand() {
    JsonNode response =
        runMlopsWithBody(
            "delete-model-version-tag",
            """
            {
              "name": %s,
              "version": %s,
              "key": "cli_version_batch_tag"
            }
            """
                .formatted(quoted(registeredModelName), quoted(modelVersion)));

    assertStatusIn(response, 200, 202, 204);
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 43,
      dependsOnMethods = {"testCreateModelVersionCommand"})
  public void testTransitionModelVersionStageCommand() {
    JsonNode response =
        runMlopsWithBody(
            "transition-model-version-stage",
            """
            {
              "name": %s,
              "version": %s,
              "stage": %s,
              "archive_existing_versions": false
            }
            """
                .formatted(
                    quoted(registeredModelName),
                    quoted(modelVersion),
                    quoted(config.mlOpsModelVersionStage())));

    assertStatusIn(response, 200, 202);
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 44,
      dependsOnMethods = {
        "testCreateWorkspaceModelVersionCommand",
        "testDeleteModelVersionTagCommand",
        "testTransitionModelVersionStageCommand"
      })
  public void testDeleteModelVersionCommand() {
    deleteModelVersion(registeredModelName, modelVersion);
    modelVersion = null;
    deleteModelVersion(registeredModelName, workspaceModelVersion);
    workspaceModelVersion = null;
  }

  @Test(
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"},
      priority = 45,
      dependsOnMethods = {"testDeleteModelVersionCommand"})
  public void testDeleteRegisteredModelCommand() {
    JsonNode response =
        runMlopsWithBody(
            "delete-registered-model",
            """
            {
              "name": %s
            }
            """
                .formatted(quoted(registeredModelName)));

    assertStatusIn(response, 200, 202, 204);
    registeredModelName = null;
  }

  @AfterClass(
      alwaysRun = true,
      groups = {"cli_tests", "cli_mlops", "mlops", "rel_validation"})
  public void tearDown() {
    for (ModelVersionRef modelVersionRef : List.copyOf(createdModelVersions)) {
      deleteModelVersionIgnoring(modelVersionRef.name(), modelVersionRef.version());
    }
    createdModelVersions.clear();
    deleteRegisteredModelIgnoring();
    deleteExperimentRunIgnoring();
    deleteExperimentIgnoring();
    deleteWorkspaceIgnoring();
  }

  private void ensureWorkspace() {
    workspaceKey = config.workspaceKey();
    if (workspaceKey != null && !workspaceKey.isBlank()) {
      return;
    }

    workspaceName = config.mlOpsWorkspaceName() + "_" + UUID.randomUUID().toString().replace("-", "");
    JsonNode response =
        runStructuredWithBody(
            runner,
            invocationBuilder,
            "workspace",
            "create",
            """
            {
              "displayName": %s,
              "description": "Created by MlOpsRelValidationCliIT",
              "defaultCatalogKey": "default"
            }
            """
                .formatted(quoted(workspaceName)));
    assertStatus(response, 201);
    workspaceKey = extractWorkspaceKey(response);
    workspaceCreatedByTest = true;
    waitForWorkspaceLifecycleState("ACTIVE");
  }

  private JsonNode runMlops(String command, String... args) {
    return runStructured(runner, invocationBuilder, "mlops", command, withPrincipal(args));
  }

  private JsonNode runMlopsWithBody(String command, String body, String... args) {
    return runStructuredWithBody(runner, invocationBuilder, "mlops", command, body, withPrincipal(args));
  }

  private String[] withPrincipal(String... args) {
    String dhUserPrincipal = config.dhUserPrincipal();
    if (dhUserPrincipal == null || dhUserPrincipal.isBlank()) {
      return args;
    }
    String[] extended = Arrays.copyOf(args, args.length + 2);
    extended[args.length] = "--dh-user-principal";
    extended[args.length + 1] = dhUserPrincipal;
    return extended;
  }

  private String createModelVersionBody() {
    return """
        {
          "name": %s,
          "source": %s,
          "run_id": %s,
          "description": "Created by MlOpsRelValidationCliIT",
          "tags": [
            {
              "key": "cli_created",
              "value": "true"
            }
          ]
        }
        """
        .formatted(quoted(registeredModelName), quoted(modelVersionSource()), quoted(runId));
  }

  private String modelVersionSource() {
    return config.mlOpsModelVersionSource()
        .replace("${run_id}", runId)
        .replace("runId", runId);
  }

  private String qualifiedRegisteredModelName(String modelName) {
    return config.mlOpsRegisteredModelCatalog() + "." + config.mlOpsRegisteredModelSchema() + "." + modelName;
  }

  private String logModelJson() {
    return config.mlOpsLogModelJson()
        .replace("${run_id}", runId)
        .replace("${artifact_path}", "cli_model")
        .replace("${utc_time_created}", Instant.now().toString());
  }

  private String extractExperimentId(JsonNode response) {
    JsonNode details = entity(response, "createExperimentResponseDetails");
    String value = optionalText(details, "experiment_id", "experimentId");
    if (value != null) {
      return value;
    }
    return optionalText(firstExisting(details, "experiment"), "experiment_id", "experimentId", "id");
  }

  private String extractRunId(JsonNode response) {
    JsonNode details = entity(response, "createExperimentRunResponseDetails");
    String value = optionalText(details, "run_id", "runId");
    if (value != null) {
      return value;
    }
    JsonNode run = firstExisting(details, "run");
    value = optionalText(run, "run_id", "runId");
    if (value != null) {
      return value;
    }
    return optionalText(firstExisting(run, "info", "run_info"), "run_id", "runId");
  }

  private String extractRegisteredModelName(JsonNode response) {
    JsonNode details = entity(
        response,
        "createRegisteredModelResponseDetails",
        "renameRegisteredModelResponseDetails");
    String value = optionalText(details, "name");
    if (value != null) {
      return value;
    }
    return optionalText(firstExisting(details, "registeredModel", "registered_model"), "name");
  }

  private String extractModelVersion(JsonNode response) {
    JsonNode details = entity(response, "createModelVersionResponseDetails");
    String value = optionalText(details, "version");
    if (value != null) {
      return value;
    }
    return optionalText(firstExisting(details, "modelVersion", "model_version"), "version");
  }

  private String extractWorkspaceKey(JsonNode response) {
    JsonNode responseData = data(response);
    String key = optionalText(responseData, "key");
    if (key != null) {
      return key;
    }
    return requiredText(firstExisting(responseData, "workspace"), "key");
  }

  private JsonNode firstExisting(JsonNode node, String... names) {
    for (String name : names) {
      JsonNode value = node.path(name);
      if (!value.isMissingNode() && !value.isNull()) {
        return value;
      }
    }
    return MissingNode.getInstance();
  }

  private void deleteModelVersion(String modelName, String version) {
    JsonNode response =
        runMlopsWithBody(
            "delete-model-version",
            """
            {
              "name": %s,
              "version": %s
            }
            """
                .formatted(quoted(modelName), quoted(version)));
    assertStatusIn(response, 200, 202, 204);
    createdModelVersions.remove(new ModelVersionRef(modelName, version));
  }

  private void deleteModelVersionIgnoring(String modelName, String version) {
    if (modelName == null || version == null) {
      return;
    }
    CliCommandResult result =
        runner.run(
            invocationBuilder.commandWithBody(
                "mlops",
                "delete-model-version",
                """
                {
                  "name": %s,
                  "version": %s
                }
                """
                    .formatted(quoted(modelName), quoted(version)),
                withPrincipal()));
    if (result.exitCode() != 0 && !isNotFound(result)) {
      throw new AssertionError("Failed to clean up MLOps model version:\n" + result.combinedOutput());
    }
  }

  private void deleteRegisteredModelIgnoring() {
    if (registeredModelName == null) {
      return;
    }
    CliCommandResult result =
        runner.run(
            invocationBuilder.commandWithBody(
                "mlops",
                "delete-registered-model",
                """
                {
                  "name": %s
                }
                """
                    .formatted(quoted(registeredModelName)),
                withPrincipal()));
    if (result.exitCode() != 0 && !isNotFound(result)) {
      throw new AssertionError("Failed to clean up MLOps registered model:\n" + result.combinedOutput());
    }
    registeredModelName = null;
  }

  private void deleteExperimentRunIgnoring() {
    if (runId == null || workspaceKey == null) {
      return;
    }
    CliCommandResult result =
        runner.run(
            invocationBuilder.commandWithBody(
                "mlops",
                "delete-experiment-run",
                """
                {
                  "run_id": %s
                }
                """
                    .formatted(quoted(runId)),
                withPrincipal(workspaceKey)));
    if (result.exitCode() != 0 && !isNotFound(result)) {
      throw new AssertionError("Failed to clean up MLOps experiment run:\n" + result.combinedOutput());
    }
    runId = null;
  }

  private void deleteExperimentIgnoring() {
    if (experimentId == null || workspaceKey == null) {
      return;
    }
    CliCommandResult result =
        runner.run(
            invocationBuilder.commandWithBody(
                "mlops",
                "delete-experiment",
                """
                {
                  "experiment_id": %s
                }
                """
                    .formatted(quoted(experimentId)),
                withPrincipal(workspaceKey)));
    if (result.exitCode() != 0 && !isNotFound(result)) {
      throw new AssertionError("Failed to clean up MLOps experiment:\n" + result.combinedOutput());
    }
    experimentId = null;
  }

  private void deleteWorkspaceIgnoring() {
    if (!workspaceCreatedByTest || workspaceKey == null) {
      return;
    }
    CliCommandResult result = runner.run(invocationBuilder.command("workspace", "delete", workspaceKey));
    if (result.exitCode() != 0 && !isNotFound(result)) {
      throw new AssertionError("Failed to clean up MLOps workspace:\n" + result.combinedOutput());
    }
    workspaceKey = null;
  }

  private void waitForWorkspaceLifecycleState(String expectedState) {
    long deadline = System.nanoTime() + config.resourceReadyTimeout().toNanos();
    AssertionError lastError = null;
    while (System.nanoTime() < deadline) {
      try {
        JsonNode response = runStructured(runner, invocationBuilder, "workspace", "get", workspaceKey);
        assertStatus(response, 200);
        String state = optionalText(data(response), "lifecycleState", "lifecycle_state");
        if (expectedState.equalsIgnoreCase(state)) {
          return;
        }
      } catch (AssertionError e) {
        lastError = e;
      }
      sleep(config.pollInterval());
    }
    if (lastError != null) {
      throw lastError;
    }
    throw new AssertionError("Workspace " + workspaceKey + " did not reach state " + expectedState);
  }

  private boolean isNotFound(CliCommandResult result) {
    String output = result.combinedOutput();
    return output.contains("\"status\" : 404")
        || output.contains("\"status\":404")
        || output.contains("NotAuthorizedOrNotFound")
        || output.contains("not found")
        || output.contains("Not Found");
  }

  private static String quoted(String value) {
    assertFalse(value == null || value.isBlank(), "Expected a non-empty value.");
    return "\""
        + value
            .replace("\\", "\\\\")
            .replace("\"", "\\\"")
            .replace("\n", "\\n")
            .replace("\r", "\\r")
        + "\"";
  }

  private static void sleep(Duration duration) {
    try {
      Thread.sleep(duration.toMillis());
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new AssertionError("Interrupted while waiting for MLOps fixture.", e);
    }
  }

  private record ModelVersionRef(String name, String version) {}
}
