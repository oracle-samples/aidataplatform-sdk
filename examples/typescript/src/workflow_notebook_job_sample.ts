// Copyright (c) 2026, Oracle and/or its affiliates.

import { randomUUID } from "crypto";
import { readFileSync } from "fs";
import common = require("oci-common");
import {
  ClusterClient,
  NotebookClient,
  WorkflowClient,
  WorkspaceObjectClient,
  models,
  responses
} from "aidp-typescript-client";

const JOB_PATH = "/Workspace/jobs";
const POLL_INTERVAL_MS = 5_000;
const JOB_RUN_TIMEOUT_MS = 30 * 60 * 1000;
const TERMINAL_STATUSES = new Set<models.State.Status>([
  models.State.Status.Success,
  models.State.Status.Failed,
  models.State.Status.Canceled,
  models.State.Status.UpstreamCanceled,
  models.State.Status.UpstreamFailed,
  models.State.Status.Excluded,
  models.State.Status.TimedOut,
  models.State.Status.Skipped,
  models.State.Status.InternalError
]);

interface Config {
  aidpOcid: string;
  workspaceKey: string;
  clusterKey: string;
  region?: string;
  endpoint?: string;
  keepResources: boolean;
  configFilePath: string;
  profile: string;
}

interface Clients {
  cluster: ClusterClient;
  workspaceObject: WorkspaceObjectClient;
  notebook: NotebookClient;
  workflow: WorkflowClient;
}

interface CreatedResources {
  folderName: string;
  notebookPath?: string;
  jobKey?: string;
  jobRunKey?: string;
}

async function main(): Promise<void> {
  const config = loadConfig();
  const clients = createClients(config);
  const resources: CreatedResources = { folderName: sampleName("sample") };

  try {
    log("Resolving cluster");
    const clusterName = await getClusterDisplayName(config, clients.cluster);

    log("Creating notebook");
    resources.notebookPath = await createNotebook(config, clients, resources.folderName);

    log("Creating workflow job");
    resources.jobKey = await createWorkflowJob(
      config,
      clients.workflow,
      clusterName,
      resources.notebookPath
    );

    log("Starting workflow job run");
    resources.jobRunKey = await runJob(config, clients.workflow, resources.jobKey);

    log("Waiting for workflow job run");
    const status = await waitForJobRun(config, clients.workflow, resources.jobRunKey);
    printSummary(config, clusterName, resources, status);
    process.exitCode = status === models.State.Status.Success ? 0 : 1;
  } finally {
    if (config.keepResources) {
      log("Skipping cleanup because AIDP_KEEP_RESOURCES=true");
    } else {
      await cleanup(config, clients, resources);
    }
    closeClients(clients);
  }
}

function loadConfig(): Config {
  if (env("AIDP_RUN_SAMPLE").toLowerCase() !== "true") {
    throw new Error("Set AIDP_RUN_SAMPLE=true before running this example.");
  }

  const configFilePath = expandHome(process.env.OCI_CONFIG_FILE ?? "~/.oci/config");
  const profile = process.env.OCI_PROFILE?.trim() || "DEFAULT";
  const parsedProfile = parseProfile(configFilePath, profile);
  const region = optionalEnv("AIDP_REGION") ?? parsedProfile.region;
  const endpoint = optionalEnv("AIDP_ENDPOINT");

  if (!endpoint && !region) {
    throw new Error("Set AIDP_REGION or AIDP_ENDPOINT before running this example.");
  }

  return {
    aidpOcid: env("AIDP_OCID"),
    workspaceKey: env("AIDP_WORKSPACE_KEY"),
    clusterKey: env("AIDP_CLUSTER_KEY"),
    region,
    endpoint,
    keepResources: optionalEnv("AIDP_KEEP_RESOURCES")?.toLowerCase() === "true",
    configFilePath,
    profile
  };
}

function createClients(config: Config): Clients {
  const profile = parseProfile(config.configFilePath, config.profile);
  const authProvider = profile.security_token_file
    ? new common.SessionAuthDetailProvider(config.configFilePath, config.profile)
    : new common.ConfigFileAuthenticationDetailsProvider(config.configFilePath, config.profile);
  const clients = {
    cluster: new ClusterClient({ authenticationDetailsProvider: authProvider }),
    workspaceObject: new WorkspaceObjectClient({ authenticationDetailsProvider: authProvider }),
    notebook: new NotebookClient({ authenticationDetailsProvider: authProvider }),
    workflow: new WorkflowClient({ authenticationDetailsProvider: authProvider })
  };

  for (const client of Object.values(clients)) {
    if (config.endpoint) {
      client.endpoint = config.endpoint.replace(/\/+$/, "");
    } else {
      client.regionId = config.region!;
    }
  }
  return clients;
}

async function createNotebook(
  config: Config,
  clients: Clients,
  folderName: string
): Promise<string> {
  const folderPath = `/Workspace/${folderName}`;
  const notebookName = `notebook_${shortId()}.ipynb`;

  await clients.workspaceObject.createWorkspaceObject({
    aiDataPlatformId: config.aidpOcid,
    workspaceKey: config.workspaceKey,
    createWorkspaceObjectDetails: "",
    path: folderName,
    type: "FOLDER",
    opcRetryToken: requestId("create-folder-retry"),
    opcRequestId: requestId("create-folder")
  });

  const created = await clients.notebook.createContent({
    aiDataPlatformId: config.aidpOcid,
    workspaceKey: config.workspaceKey,
    contentPath: folderPath,
    createContentDetails: { ext: ".ipynb", type: "notebook" },
    opcRetryToken: requestId("create-notebook-retry"),
    opcRequestId: requestId("create-notebook")
  });

  const renamed = await clients.notebook.modifyContent({
    aiDataPlatformId: config.aidpOcid,
    workspaceKey: config.workspaceKey,
    contentPath: created.content.path,
    modifyContentDetails: { path: `${folderPath}/${notebookName}` },
    opcRequestId: requestId("rename-notebook")
  });

  await clients.notebook.updateContent({
    aiDataPlatformId: config.aidpOcid,
    workspaceKey: config.workspaceKey,
    contentPath: renamed.content.path,
    updateContentDetails: {
      name: notebookName,
      path: renamed.content.path,
      type: models.UpdateContentDetails.Type.Notebook,
      content: notebookContent(),
      format: models.UpdateContentDetails.Format.Json
    },
    opcRequestId: requestId("update-notebook")
  });
  return renamed.content.path;
}

async function createWorkflowJob(
  config: Config,
  workflow: WorkflowClient,
  clusterName: string,
  notebookPath: string
): Promise<string> {
  const jobName = `workflow_job_${shortId()}.job`;
  const job = await workflow.createJob({
    aiDataPlatformId: config.aidpOcid,
    workspaceKey: config.workspaceKey,
    createJobDetails: {
      name: jobName,
      description: "",
      path: JOB_PATH,
      maxConcurrentRuns: 1
    },
    opcRetryToken: requestId("create-job-retry"),
    opcRequestId: requestId("create-job")
  });

  const jobCluster: models.JobCluster = {
    clusterKey: config.clusterKey,
    clusterName
  };
  const notebookTask: models.NotebookTask = {
    taskKey: `notebook_task_${shortId()}`,
    runIf: models.Task.RunIf.AllSuccess,
    maxRetries: 0,
    dependsOn: [],
    isRetryOnTimeout: false,
    cluster: jobCluster,
    source: models.NotebookTask.Source.Workspace,
    notebookPath: ensureLeadingSlash(notebookPath),
    parameters: [],
    type: models.NotebookTask.type
  };

  await workflow.updateJob({
    aiDataPlatformId: config.aidpOcid,
    workspaceKey: config.workspaceKey,
    jobKey: job.job.key,
    updateJobDetails: {
      name: jobName,
      description: "",
      path: JOB_PATH,
      maxConcurrentRuns: 1,
      jobClusters: [jobCluster],
      tasks: [notebookTask]
    },
    opcRequestId: requestId("update-job")
  });
  return job.job.key;
}

async function runJob(
  config: Config,
  workflow: WorkflowClient,
  jobKey: string
): Promise<string> {
  const response = await workflow.createJobRun({
    aiDataPlatformId: config.aidpOcid,
    workspaceKey: config.workspaceKey,
    createJobRunDetails: { jobKey },
    opcRetryToken: requestId("create-job-run-retry"),
    opcRequestId: requestId("create-job-run")
  });
  return response.jobRun.key;
}

async function waitForJobRun(
  config: Config,
  workflow: WorkflowClient,
  jobRunKey: string
): Promise<models.State.Status> {
  const deadline = Date.now() + JOB_RUN_TIMEOUT_MS;
  while (true) {
    const response: responses.GetJobRunResponse = await workflow.getJobRun({
      aiDataPlatformId: config.aidpOcid,
      workspaceKey: config.workspaceKey,
      jobRunKey,
      opcRequestId: requestId("get-job-run")
    });
    const status = response.jobRun.state?.status;
    log(`Job run status: ${status ?? "UNKNOWN"}`);
    if (status && TERMINAL_STATUSES.has(status)) {
      return status;
    }
    if (Date.now() >= deadline) {
      throw new Error(`Timed out waiting for job run ${jobRunKey}.`);
    }
    await sleep(POLL_INTERVAL_MS);
  }
}

async function cleanup(
  config: Config,
  clients: Clients,
  resources: CreatedResources
): Promise<void> {
  log("Cleaning up created resources");
  await ignoreNotFound(() =>
    resources.jobRunKey
      ? clients.workflow.deleteJobRun({
          aiDataPlatformId: config.aidpOcid,
          workspaceKey: config.workspaceKey,
          jobRunKey: resources.jobRunKey,
          opcRequestId: requestId("delete-job-run")
        })
      : undefined
  );
  await ignoreNotFound(() =>
    resources.jobKey
      ? clients.workflow.deleteJob({
          aiDataPlatformId: config.aidpOcid,
          workspaceKey: config.workspaceKey,
          jobKey: resources.jobKey,
          opcRequestId: requestId("delete-job")
        })
      : undefined
  );
  await ignoreNotFound(() =>
    resources.notebookPath
      ? clients.notebook.deleteContent({
          aiDataPlatformId: config.aidpOcid,
          workspaceKey: config.workspaceKey,
          contentPath: resources.notebookPath,
          opcRequestId: requestId("delete-notebook")
        })
      : undefined
  );
  await ignoreNotFound(() =>
    clients.workspaceObject.deleteWorkspaceObject({
      aiDataPlatformId: config.aidpOcid,
      workspaceKey: config.workspaceKey,
      objectPath: resources.folderName,
      opcRequestId: requestId("delete-folder")
    })
  );
}

async function getClusterDisplayName(config: Config, cluster: ClusterClient): Promise<string> {
  const response = await cluster.getCluster({
    aiDataPlatformId: config.aidpOcid,
    workspaceKey: config.workspaceKey,
    clusterKey: config.clusterKey,
    opcRequestId: requestId("get-cluster")
  });
  return response.cluster.displayName;
}

function notebookContent(): Record<string, unknown> {
  return {
    cells: [
      {
        cell_type: "code",
        execution_count: null,
        id: randomUUID(),
        metadata: { trusted: true },
        outputs: [],
        source: 'print("Hello")'
      }
    ],
    metadata: {
      kernelspec: { display_name: "", name: "" },
      language_info: { name: "" }
    },
    nbformat: 4,
    nbformat_minor: 5
  };
}

function printSummary(
  config: Config,
  clusterName: string,
  resources: CreatedResources,
  status: models.State.Status
): void {
  console.log(
    JSON.stringify(
      {
        workspaceKey: config.workspaceKey,
        clusterKey: config.clusterKey,
        clusterDisplayName: clusterName,
        notebookPath: resources.notebookPath,
        jobKey: resources.jobKey,
        jobRunKey: resources.jobRunKey,
        jobRunStatus: status
      },
      null,
      2
    )
  );
}

function parseProfile(configFilePath: string, profileName: string): Record<string, string> {
  const sections = new Map<string, Record<string, string>>();
  let current: string | undefined;

  for (const rawLine of readFileSync(configFilePath, "utf8").split(/\r?\n/)) {
    const line = rawLine.trim();
    if (!line || line.startsWith("#") || line.startsWith(";")) {
      continue;
    }
    const section = line.match(/^\[(.+)]$/);
    if (section) {
      current = section[1].trim();
      sections.set(current, {});
      continue;
    }
    const index = line.indexOf("=");
    if (current && index > 0) {
      sections.get(current)![line.slice(0, index).trim()] = line.slice(index + 1).trim();
    }
  }

  const profile = sections.get(profileName);
  if (!profile) {
    throw new Error(`OCI profile ${profileName} was not found in ${configFilePath}.`);
  }
  return profile;
}

async function ignoreNotFound(call: () => Promise<unknown> | undefined): Promise<void> {
  try {
    await call();
  } catch (error) {
    const statusCode = (error as { statusCode?: number; status?: number }).statusCode
      ?? (error as { status?: number }).status;
    if (statusCode !== 404) {
      throw error;
    }
  }
}

function closeClients(clients: Clients): void {
  clients.cluster.close?.();
  clients.workspaceObject.close?.();
  clients.notebook.close?.();
  clients.workflow.close?.();
}

function env(name: string): string {
  const value = process.env[name]?.trim();
  if (!value) {
    throw new Error(`Set ${name} before running this example.`);
  }
  return value;
}

function optionalEnv(name: string): string | undefined {
  const value = process.env[name]?.trim();
  return value ? value : undefined;
}

function expandHome(value: string): string {
  if (value === "~") {
    return process.env.HOME ?? value;
  }
  return value.startsWith("~/") ? `${process.env.HOME ?? ""}/${value.slice(2)}` : value;
}

function ensureLeadingSlash(path: string): string {
  return path.startsWith("/") ? path : `/${path}`;
}

function requestId(prefix: string): string {
  return `${prefix}-${randomUUID()}`;
}

function shortId(): string {
  return randomUUID().replace(/-/g, "").slice(0, 8);
}

function sampleName(prefix: string): string {
  return `${prefix}_${Date.now()}_${shortId()}`;
}

function sleep(milliseconds: number): Promise<void> {
  return new Promise((resolve) => setTimeout(resolve, milliseconds));
}

function log(message: string): void {
  console.log(`[WorkflowNotebookJobSample] ${message}`);
}

main().catch((error) => {
  console.error(error instanceof Error ? error.stack ?? error.message : String(error));
  process.exitCode = 1;
});
