// Copyright (c) 2026, Oracle and/or its affiliates.

package com.oracle.aidataplatform.examples;

import com.oracle.aidataplatform.dp.ClusterClient;
import com.oracle.aidataplatform.dp.NotebookClient;
import com.oracle.aidataplatform.dp.WorkflowClient;
import com.oracle.aidataplatform.dp.WorkspaceObjectClient;
import com.oracle.aidataplatform.dp.model.Content;
import com.oracle.aidataplatform.dp.model.CreateContentDetails;
import com.oracle.aidataplatform.dp.model.CreateJobDetails;
import com.oracle.aidataplatform.dp.model.CreateJobRunDetails;
import com.oracle.aidataplatform.dp.model.JobCluster;
import com.oracle.aidataplatform.dp.model.ModifyContentDetails;
import com.oracle.aidataplatform.dp.model.NotebookTask;
import com.oracle.aidataplatform.dp.model.State;
import com.oracle.aidataplatform.dp.model.Task;
import com.oracle.aidataplatform.dp.model.UpdateContentDetails;
import com.oracle.aidataplatform.dp.model.UpdateJobDetails;
import com.oracle.aidataplatform.dp.requests.CreateContentRequest;
import com.oracle.aidataplatform.dp.requests.CreateJobRequest;
import com.oracle.aidataplatform.dp.requests.CreateJobRunRequest;
import com.oracle.aidataplatform.dp.requests.CreateWorkspaceObjectRequest;
import com.oracle.aidataplatform.dp.requests.DeleteContentRequest;
import com.oracle.aidataplatform.dp.requests.DeleteJobRequest;
import com.oracle.aidataplatform.dp.requests.DeleteJobRunRequest;
import com.oracle.aidataplatform.dp.requests.DeleteWorkspaceObjectRequest;
import com.oracle.aidataplatform.dp.requests.GetClusterRequest;
import com.oracle.aidataplatform.dp.requests.GetJobRunRequest;
import com.oracle.aidataplatform.dp.requests.ModifyContentRequest;
import com.oracle.aidataplatform.dp.requests.UpdateContentRequest;
import com.oracle.aidataplatform.dp.requests.UpdateJobRequest;
import com.oracle.aidataplatform.dp.responses.CreateContentResponse;
import com.oracle.aidataplatform.dp.responses.CreateJobResponse;
import com.oracle.aidataplatform.dp.responses.CreateJobRunResponse;
import com.oracle.aidataplatform.dp.responses.GetJobRunResponse;
import com.oracle.aidataplatform.dp.responses.ModifyContentResponse;
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.auth.SessionTokenAuthenticationDetailsProvider;
import com.oracle.bmc.model.BmcException;
import java.io.InputStream;
import java.util.Collections;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public final class WorkflowNotebookJobSample {
    private static final String JOB_PATH = "/Workspace/jobs";
    private static final long POLL_INTERVAL_MILLIS = 5000L;
    private static final long JOB_RUN_TIMEOUT_MILLIS = 30L * 60L * 1000L;
    private static final Set<State.Status> TERMINAL_STATUSES =
            Collections.unmodifiableSet(
                    EnumSet.of(
                            State.Status.Success,
                            State.Status.Failed,
                            State.Status.Canceled,
                            State.Status.UpstreamCanceled,
                            State.Status.UpstreamFailed,
                            State.Status.Excluded,
                            State.Status.TimedOut,
                            State.Status.Skipped,
                            State.Status.InternalError));

    private WorkflowNotebookJobSample() {}

    public static void main(String[] args) throws Exception {
        Config config = loadConfig();
        Clients clients = createClients(config);
        CreatedResources resources = new CreatedResources(sampleName("sample"));

        try {
            log("Resolving cluster");
            String clusterName = getClusterDisplayName(config, clients.cluster);

            log("Creating notebook");
            resources.notebookPath = createNotebook(config, clients, resources.folderName);

            log("Creating workflow job");
            resources.jobKey =
                    createWorkflowJob(config, clients.workflow, clusterName, resources.notebookPath);

            log("Starting workflow job run");
            resources.jobRunKey = runJob(config, clients.workflow, resources.jobKey);

            log("Waiting for workflow job run");
            State.Status status = waitForJobRun(config, clients.workflow, resources.jobRunKey);
            printSummary(config, clusterName, resources, status);
            if (status != State.Status.Success) {
                throw new IllegalStateException("Workflow job run finished with status " + status);
            }
        } finally {
            if (config.keepResources) {
                log("Skipping cleanup because AIDP_KEEP_RESOURCES=true");
            } else {
                cleanup(config, clients, resources);
            }
            closeClients(clients);
        }
    }

    private static Config loadConfig() throws Exception {
        if (!"true".equalsIgnoreCase(env("AIDP_RUN_SAMPLE"))) {
            throw new IllegalArgumentException("Set AIDP_RUN_SAMPLE=true before running this example.");
        }

        String configFilePath =
                System.getenv().getOrDefault("OCI_CONFIG_FILE", ConfigFileReader.DEFAULT_FILE_PATH);
        String profile = System.getenv().getOrDefault("OCI_PROFILE", "DEFAULT");
        ConfigFileReader.ConfigFile ociConfig = ConfigFileReader.parse(configFilePath, profile);
        String region = optionalEnv("AIDP_REGION");
        if (isBlank(region)) {
            region = ociConfig.get("region");
        }
        String endpoint = optionalEnv("AIDP_ENDPOINT");
        if (isBlank(region) && isBlank(endpoint)) {
            throw new IllegalArgumentException("Set AIDP_REGION or AIDP_ENDPOINT before running.");
        }

        return new Config(
                env("AIDP_OCID"),
                env("AIDP_WORKSPACE_KEY"),
                env("AIDP_CLUSTER_KEY"),
                region,
                endpoint,
                "true".equalsIgnoreCase(optionalEnv("AIDP_KEEP_RESOURCES")),
                createAuthProvider(ociConfig));
    }

    private static Clients createClients(Config config) {
        ClusterClient.Builder clusterBuilder = ClusterClient.builder();
        WorkspaceObjectClient.Builder workspaceObjectBuilder = WorkspaceObjectClient.builder();
        NotebookClient.Builder notebookBuilder = NotebookClient.builder();
        WorkflowClient.Builder workflowBuilder = WorkflowClient.builder();

        if (!isBlank(config.endpoint)) {
            clusterBuilder.endpoint(config.endpoint);
            workspaceObjectBuilder.endpoint(config.endpoint);
            notebookBuilder.endpoint(config.endpoint);
            workflowBuilder.endpoint(config.endpoint);
        } else {
            clusterBuilder.region(config.region);
            workspaceObjectBuilder.region(config.region);
            notebookBuilder.region(config.region);
            workflowBuilder.region(config.region);
        }

        return new Clients(
                clusterBuilder.build((AbstractAuthenticationDetailsProvider) config.authProvider),
                workspaceObjectBuilder.build((AbstractAuthenticationDetailsProvider) config.authProvider),
                notebookBuilder.build((AbstractAuthenticationDetailsProvider) config.authProvider),
                workflowBuilder.build((AbstractAuthenticationDetailsProvider) config.authProvider));
    }

    private static String createNotebook(Config config, Clients clients, String folderName) {
        String folderPath = "/Workspace/" + folderName;
        String notebookName = "notebook_" + shortId() + ".ipynb";

        clients.workspaceObject.createWorkspaceObject(
                CreateWorkspaceObjectRequest.builder()
                        .aiDataPlatformId(config.aidpOcid)
                        .workspaceKey(config.workspaceKey)
                        .createWorkspaceObjectDetails(InputStream.nullInputStream())
                        .path(folderName)
                        .type("FOLDER")
                        .opcRetryToken(requestId("create-folder-retry"))
                        .opcRequestId(requestId("create-folder"))
                        .build());

        CreateContentResponse created =
                clients.notebook.createContent(
                        CreateContentRequest.builder()
                                .aiDataPlatformId(config.aidpOcid)
                                .workspaceKey(config.workspaceKey)
                                .contentPath(folderPath)
                                .createContentDetails(
                                        CreateContentDetails.builder()
                                                .ext(".ipynb")
                                                .type(Content.Type.Notebook)
                                                .build())
                                .opcRetryToken(requestId("create-notebook-retry"))
                                .opcRequestId(requestId("create-notebook"))
                                .build());

        ModifyContentResponse renamed =
                clients.notebook.modifyContent(
                        ModifyContentRequest.builder()
                                .aiDataPlatformId(config.aidpOcid)
                                .workspaceKey(config.workspaceKey)
                                .contentPath(created.getContent().getPath())
                                .modifyContentDetails(
                                        ModifyContentDetails.builder()
                                                .path(folderPath + "/" + notebookName)
                                                .build())
                                .opcRequestId(requestId("rename-notebook"))
                                .build());

        clients.notebook.updateContent(
                UpdateContentRequest.builder()
                        .aiDataPlatformId(config.aidpOcid)
                        .workspaceKey(config.workspaceKey)
                        .contentPath(renamed.getContent().getPath())
                        .updateContentDetails(
                                UpdateContentDetails.builder()
                                        .name(notebookName)
                                        .path(renamed.getContent().getPath())
                                        .type(UpdateContentDetails.Type.Notebook)
                                        .content(notebookContent())
                                        .format(UpdateContentDetails.Format.Json)
                                        .build())
                        .opcRequestId(requestId("update-notebook"))
                        .build());

        return renamed.getContent().getPath();
    }

    private static String createWorkflowJob(
            Config config, WorkflowClient workflow, String clusterName, String notebookPath) {
        String jobName = "workflow_job_" + shortId() + ".job";

        CreateJobResponse job =
                workflow.createJob(
                        CreateJobRequest.builder()
                                .aiDataPlatformId(config.aidpOcid)
                                .workspaceKey(config.workspaceKey)
                                .createJobDetails(
                                        CreateJobDetails.builder()
                                                .name(jobName)
                                                .description("")
                                                .path(JOB_PATH)
                                                .maxConcurrentRuns(1)
                                                .build())
                                .opcRetryToken(requestId("create-job-retry"))
                                .opcRequestId(requestId("create-job"))
                                .build());

        JobCluster jobCluster =
                JobCluster.builder()
                        .clusterKey(config.clusterKey)
                        .clusterName(clusterName)
                        .build();
        Task notebookTask =
                NotebookTask.builder()
                        .taskKey("notebook_task_" + shortId())
                        .runIf(Task.RunIf.AllSuccess)
                        .maxRetries(0)
                        .dependsOn(Collections.emptyList())
                        .isRetryOnTimeout(false)
                        .cluster(jobCluster)
                        .notebookPath(ensureLeadingSlash(notebookPath))
                        .parameters(Collections.emptyList())
                        .build();

        workflow.updateJob(
                UpdateJobRequest.builder()
                        .aiDataPlatformId(config.aidpOcid)
                        .workspaceKey(config.workspaceKey)
                        .jobKey(job.getJob().getKey())
                        .updateJobDetails(
                                UpdateJobDetails.builder()
                                        .name(jobName)
                                        .description("")
                                        .path(JOB_PATH)
                                        .maxConcurrentRuns(1)
                                        .jobClusters(List.of(jobCluster))
                                        .tasks(List.of(notebookTask))
                                        .build())
                        .opcRequestId(requestId("update-job"))
                        .build());
        return job.getJob().getKey();
    }

    private static String runJob(Config config, WorkflowClient workflow, String jobKey) {
        CreateJobRunResponse response =
                workflow.createJobRun(
                        CreateJobRunRequest.builder()
                                .aiDataPlatformId(config.aidpOcid)
                                .workspaceKey(config.workspaceKey)
                                .createJobRunDetails(
                                        CreateJobRunDetails.builder().jobKey(jobKey).build())
                                .opcRetryToken(requestId("create-job-run-retry"))
                                .opcRequestId(requestId("create-job-run"))
                                .build());
        return response.getJobRun().getKey();
    }

    private static State.Status waitForJobRun(
            Config config, WorkflowClient workflow, String jobRunKey) throws InterruptedException {
        long deadline = System.currentTimeMillis() + JOB_RUN_TIMEOUT_MILLIS;
        while (true) {
            GetJobRunResponse response =
                    workflow.getJobRun(
                            GetJobRunRequest.builder()
                                    .aiDataPlatformId(config.aidpOcid)
                                    .workspaceKey(config.workspaceKey)
                                    .jobRunKey(jobRunKey)
                                    .opcRequestId(requestId("get-job-run"))
                                    .build());
            State.Status status =
                    response.getJobRun() != null && response.getJobRun().getState() != null
                            ? response.getJobRun().getState().getStatus()
                            : null;
            log("Job run status: " + status);
            if (status != null && TERMINAL_STATUSES.contains(status)) {
                return status;
            }
            if (System.currentTimeMillis() >= deadline) {
                throw new IllegalStateException("Timed out waiting for job run " + jobRunKey);
            }
            Thread.sleep(POLL_INTERVAL_MILLIS);
        }
    }

    private static void cleanup(Config config, Clients clients, CreatedResources resources) {
        log("Cleaning up created resources");
        ignoreNotFound(
                () -> {
                    if (resources.jobRunKey != null) {
                        clients.workflow.deleteJobRun(
                                DeleteJobRunRequest.builder()
                                        .aiDataPlatformId(config.aidpOcid)
                                        .workspaceKey(config.workspaceKey)
                                        .jobRunKey(resources.jobRunKey)
                                        .opcRequestId(requestId("delete-job-run"))
                                        .build());
                    }
                });
        ignoreNotFound(
                () -> {
                    if (resources.jobKey != null) {
                        clients.workflow.deleteJob(
                                DeleteJobRequest.builder()
                                        .aiDataPlatformId(config.aidpOcid)
                                        .workspaceKey(config.workspaceKey)
                                        .jobKey(resources.jobKey)
                                        .opcRequestId(requestId("delete-job"))
                                        .build());
                    }
                });
        ignoreNotFound(
                () -> {
                    if (resources.notebookPath != null) {
                        clients.notebook.deleteContent(
                                DeleteContentRequest.builder()
                                        .aiDataPlatformId(config.aidpOcid)
                                        .workspaceKey(config.workspaceKey)
                                        .contentPath(resources.notebookPath)
                                        .opcRequestId(requestId("delete-notebook"))
                                        .build());
                    }
                });
        ignoreNotFound(
                () ->
                        clients.workspaceObject.deleteWorkspaceObject(
                                DeleteWorkspaceObjectRequest.builder()
                                        .aiDataPlatformId(config.aidpOcid)
                                        .workspaceKey(config.workspaceKey)
                                        .objectPath(resources.folderName)
                                        .opcRequestId(requestId("delete-folder"))
                                        .build()));
    }

    private static String getClusterDisplayName(Config config, ClusterClient cluster) {
        return cluster.getCluster(
                        GetClusterRequest.builder()
                                .aiDataPlatformId(config.aidpOcid)
                                .workspaceKey(config.workspaceKey)
                                .clusterKey(config.clusterKey)
                                .opcRequestId(requestId("get-cluster"))
                                .build())
                .getCluster()
                .getDisplayName();
    }

    private static AuthenticationDetailsProvider createAuthProvider(
            ConfigFileReader.ConfigFile configFile) throws Exception {
        if (!isBlank(configFile.get("security_token_file"))) {
            return new SessionTokenAuthenticationDetailsProvider(configFile);
        }
        return new ConfigFileAuthenticationDetailsProvider(configFile);
    }

    private static Map<String, Object> notebookContent() {
        Map<String, Object> cell = new LinkedHashMap<>();
        cell.put("cell_type", "code");
        cell.put("execution_count", null);
        cell.put("id", UUID.randomUUID().toString());
        cell.put("metadata", Collections.singletonMap("trusted", true));
        cell.put("outputs", Collections.emptyList());
        cell.put("source", "print(\"Hello\")");

        Map<String, Object> metadata = new LinkedHashMap<>();
        metadata.put("kernelspec", Map.of("display_name", "", "name", ""));
        metadata.put("language_info", Collections.singletonMap("name", ""));

        Map<String, Object> content = new LinkedHashMap<>();
        content.put("cells", Collections.singletonList(cell));
        content.put("metadata", metadata);
        content.put("nbformat", 4);
        content.put("nbformat_minor", 5);
        return content;
    }

    private static void printSummary(
            Config config, String clusterName, CreatedResources resources, State.Status status) {
        System.out.println("{");
        System.out.println("  \"workspaceKey\": \"" + jsonEscape(config.workspaceKey) + "\",");
        System.out.println("  \"clusterKey\": \"" + jsonEscape(config.clusterKey) + "\",");
        System.out.println("  \"clusterDisplayName\": \"" + jsonEscape(clusterName) + "\",");
        System.out.println("  \"notebookPath\": \"" + jsonEscape(resources.notebookPath) + "\",");
        System.out.println("  \"jobKey\": \"" + jsonEscape(resources.jobKey) + "\",");
        System.out.println("  \"jobRunKey\": \"" + jsonEscape(resources.jobRunKey) + "\",");
        System.out.println("  \"jobRunStatus\": \"" + jsonEscape(String.valueOf(status)) + "\"");
        System.out.println("}");
    }

    private static String jsonEscape(String value) {
        if (value == null) {
            return "";
        }
        StringBuilder escaped = new StringBuilder(value.length());
        for (int i = 0; i < value.length(); i++) {
            char character = value.charAt(i);
            switch (character) {
                case '\\':
                    escaped.append("\\\\");
                    break;
                case '"':
                    escaped.append("\\\"");
                    break;
                case '\b':
                    escaped.append("\\b");
                    break;
                case '\f':
                    escaped.append("\\f");
                    break;
                case '\n':
                    escaped.append("\\n");
                    break;
                case '\r':
                    escaped.append("\\r");
                    break;
                case '\t':
                    escaped.append("\\t");
                    break;
                default:
                    if (character < 0x20) {
                        escaped.append(String.format("\\u%04x", (int) character));
                    } else {
                        escaped.append(character);
                    }
                    break;
            }
        }
        return escaped.toString();
    }

    private static void closeClients(Clients clients) {
        clients.cluster.close();
        clients.workspaceObject.close();
        clients.notebook.close();
        clients.workflow.close();
    }

    private static void ignoreNotFound(Action action) {
        try {
            action.run();
        } catch (BmcException e) {
            if (e.getStatusCode() != 404) {
                throw e;
            }
        }
    }

    private static String env(String name) {
        String value = System.getenv(name);
        if (isBlank(value)) {
            throw new IllegalArgumentException("Set " + name + " before running this example.");
        }
        return value.trim();
    }

    private static String optionalEnv(String name) {
        String value = System.getenv(name);
        return isBlank(value) ? null : value.trim();
    }

    private static boolean isBlank(String value) {
        return value == null || value.trim().isEmpty();
    }

    private static String ensureLeadingSlash(String path) {
        return path.startsWith("/") ? path : "/" + path;
    }

    private static String requestId(String prefix) {
        return prefix + "-" + UUID.randomUUID();
    }

    private static String shortId() {
        return UUID.randomUUID().toString().replace("-", "").substring(0, 8);
    }

    private static String sampleName(String prefix) {
        return prefix + "_" + System.currentTimeMillis() + "_" + shortId();
    }

    private static void log(String message) {
        System.out.println("[WorkflowNotebookJobSample] " + message);
    }

    private interface Action {
        void run();
    }

    private static final class Config {
        private final String aidpOcid;
        private final String workspaceKey;
        private final String clusterKey;
        private final String region;
        private final String endpoint;
        private final boolean keepResources;
        private final AuthenticationDetailsProvider authProvider;

        private Config(
                String aidpOcid,
                String workspaceKey,
                String clusterKey,
                String region,
                String endpoint,
                boolean keepResources,
                AuthenticationDetailsProvider authProvider) {
            this.aidpOcid = aidpOcid;
            this.workspaceKey = workspaceKey;
            this.clusterKey = clusterKey;
            this.region = region;
            this.endpoint = endpoint;
            this.keepResources = keepResources;
            this.authProvider = authProvider;
        }
    }

    private static final class Clients {
        private final ClusterClient cluster;
        private final WorkspaceObjectClient workspaceObject;
        private final NotebookClient notebook;
        private final WorkflowClient workflow;

        private Clients(
                ClusterClient cluster,
                WorkspaceObjectClient workspaceObject,
                NotebookClient notebook,
                WorkflowClient workflow) {
            this.cluster = cluster;
            this.workspaceObject = workspaceObject;
            this.notebook = notebook;
            this.workflow = workflow;
        }
    }

    private static final class CreatedResources {
        private final String folderName;
        private String notebookPath;
        private String jobKey;
        private String jobRunKey;

        private CreatedResources(String folderName) {
            this.folderName = folderName;
        }
    }
}
