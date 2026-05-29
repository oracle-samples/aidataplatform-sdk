# Copyright (c) 2026, Oracle and/or its affiliates.

from __future__ import annotations

import json
import os
import time
import uuid
from dataclasses import dataclass
from pathlib import Path
from typing import Any

import oci
from oci.auth.signers import SecurityTokenSigner
from oci.exceptions import ServiceError
from oci.signer import Signer, load_private_key_from_file

from aidp_python_client.aidataplatform_dp import (
    ClusterClient,
    NotebookClient,
    WorkflowClient,
    WorkspaceObjectClient,
    models,
)

JOB_PATH = "/Workspace/jobs"
POLL_INTERVAL_SECONDS = 5
JOB_RUN_TIMEOUT_SECONDS = 30 * 60
WORKSPACE_ENDPOINT_TEMPLATE = "https://datahub-dp.{region}.oci.{secondLevelDomain}"
TERMINAL_STATUSES = {
    models.State.STATUS_SUCCESS,
    models.State.STATUS_FAILED,
    models.State.STATUS_CANCELED,
    models.State.STATUS_UPSTREAM_CANCELED,
    models.State.STATUS_UPSTREAM_FAILED,
    models.State.STATUS_EXCLUDED,
    models.State.STATUS_TIMED_OUT,
    models.State.STATUS_SKIPPED,
    models.State.STATUS_INTERNAL_ERROR,
}


@dataclass(frozen=True)
class Config:
    aidp_ocid: str
    workspace_key: str
    cluster_key: str
    region: str | None
    endpoint: str | None
    keep_resources: bool
    oci_config: dict[str, Any]
    signer: Any


@dataclass(frozen=True)
class Clients:
    cluster: ClusterClient
    workspace_object: WorkspaceObjectClient
    notebook: NotebookClient
    workflow: WorkflowClient


@dataclass
class CreatedResources:
    folder_name: str
    notebook_path: str | None = None
    job_key: str | None = None
    job_run_key: str | None = None


def main() -> int:
    config = loadConfig()
    clients = createClients(config)
    resources = CreatedResources(folder_name=sampleName("sample"))

    try:
        log("Resolving cluster")
        cluster_name = getClusterDisplayName(config, clients.cluster)

        log("Creating notebook")
        notebook_path = createNotebook(config, clients, resources.folder_name)
        resources.notebook_path = notebook_path

        log("Creating workflow job")
        job_key = createWorkflowJob(config, clients.workflow, cluster_name, notebook_path)
        resources.job_key = job_key

        log("Starting workflow job run")
        job_run_key = runJob(config, clients.workflow, job_key)
        resources.job_run_key = job_run_key

        log("Waiting for workflow job run")
        status = waitForJobRun(config, clients.workflow, job_run_key)
        printSummary(config, cluster_name, resources, status)
        return 0 if status == models.State.STATUS_SUCCESS else 1
    finally:
        if config.keep_resources:
            log("Skipping cleanup because AIDP_KEEP_RESOURCES=true")
        else:
            cleanup(config, clients, resources)
        closeClients(clients)


def loadConfig() -> Config:
    if env("AIDP_RUN_SAMPLE").lower() != "true":
        raise ValueError("Set AIDP_RUN_SAMPLE=true before running this example.")

    oci_config = oci.config.from_file(
        file_location=os.getenv("OCI_CONFIG_FILE", "~/.oci/config"),
        profile_name=os.getenv("OCI_PROFILE", "DEFAULT"),
    )
    region = optionalEnv("AIDP_REGION") or oci_config.get("region")
    endpoint = optionalEnv("AIDP_ENDPOINT")
    if not endpoint and not region:
        raise ValueError("Set AIDP_REGION or AIDP_ENDPOINT before running this example.")

    return Config(
        aidp_ocid=env("AIDP_OCID"),
        workspace_key=env("AIDP_WORKSPACE_KEY"),
        cluster_key=env("AIDP_CLUSTER_KEY"),
        region=region,
        endpoint=endpoint,
        keep_resources=env("AIDP_KEEP_RESOURCES", default="false").lower() == "true",
        oci_config=oci_config,
        signer=buildSigner(oci_config),
    )


def createClients(config: Config) -> Clients:
    endpoint = resolveEndpoint(config)
    notebook = NotebookClient(config.oci_config, signer=config.signer, service_endpoint=endpoint)
    notebook.base_client._enable_strict_url_encoding = True
    return Clients(
        cluster=ClusterClient(config.oci_config, signer=config.signer, service_endpoint=endpoint),
        workspace_object=WorkspaceObjectClient(
            config.oci_config, signer=config.signer, service_endpoint=endpoint
        ),
        notebook=notebook,
        workflow=WorkflowClient(config.oci_config, signer=config.signer, service_endpoint=endpoint),
    )


def createNotebook(config: Config, clients: Clients, folder_name: str) -> str:
    folder_path = f"/Workspace/{folder_name}"
    notebook_name = f"notebook_{uuid.uuid4().hex[:8]}.ipynb"

    clients.workspace_object.create_workspace_object(
        config.aidp_ocid,
        config.workspace_key,
        b"",
        folder_name,
        type="FOLDER",
        opc_retry_token=requestId("create-folder-retry"),
        opc_request_id=requestId("create-folder"),
    )

    created = clients.notebook.create_content(
        config.aidp_ocid,
        config.workspace_key,
        folder_path,
        models.CreateContentDetails(ext=".ipynb", type="notebook"),
        opc_retry_token=requestId("create-notebook-retry"),
        opc_request_id=requestId("create-notebook"),
    ).data

    renamed = clients.notebook.modify_content(
        config.aidp_ocid,
        config.workspace_key,
        created.path,
        models.ModifyContentDetails(path=f"{folder_path}/{notebook_name}"),
        opc_request_id=requestId("rename-notebook"),
    ).data

    clients.notebook.update_content(
        config.aidp_ocid,
        config.workspace_key,
        renamed.path,
        models.UpdateContentDetails(
            name=notebook_name,
            path=renamed.path,
            type=models.UpdateContentDetails.TYPE_NOTEBOOK,
            content=notebookContent(),
            format=models.UpdateContentDetails.FORMAT_JSON,
        ),
        opc_request_id=requestId("update-notebook"),
    )
    return renamed.path


def createWorkflowJob(
    config: Config,
    workflow: WorkflowClient,
    cluster_name: str,
    notebook_path: str,
) -> str:
    job_name = f"workflow_job_{uuid.uuid4().hex[:8]}.job"
    task_key = f"notebook_task_{uuid.uuid4().hex[:8]}"

    job = workflow.create_job(
        config.aidp_ocid,
        config.workspace_key,
        models.CreateJobDetails(
            name=job_name,
            description="",
            path=JOB_PATH,
            max_concurrent_runs=1,
        ),
        opc_retry_token=requestId("create-job-retry"),
        opc_request_id=requestId("create-job"),
    ).data

    job_cluster = models.JobCluster(
        cluster_key=config.cluster_key,
        cluster_name=cluster_name,
    )
    notebook_task = models.NotebookTask(
        task_key=task_key,
        run_if=models.Task.RUN_IF_ALL_SUCCESS,
        max_retries=0,
        depends_on=[],
        is_retry_on_timeout=False,
        cluster=job_cluster,
        source=models.NotebookTask.SOURCE_WORKSPACE,
        notebook_path=ensureLeadingSlash(notebook_path),
        parameters=[],
    )

    workflow.update_job(
        config.aidp_ocid,
        config.workspace_key,
        job.key,
        models.UpdateJobDetails(
            name=job_name,
            description="",
            path=JOB_PATH,
            max_concurrent_runs=1,
            job_clusters=[job_cluster],
            tasks=[notebook_task],
        ),
        opc_request_id=requestId("update-job"),
    )
    return job.key


def runJob(config: Config, workflow: WorkflowClient, job_key: str) -> str:
    response = workflow.create_job_run(
        config.aidp_ocid,
        config.workspace_key,
        models.CreateJobRunDetails(job_key=job_key),
        opc_retry_token=requestId("create-job-run-retry"),
        opc_request_id=requestId("create-job-run"),
    )
    return response.data.key


def waitForJobRun(config: Config, workflow: WorkflowClient, job_run_key: str) -> str:
    deadline = time.time() + JOB_RUN_TIMEOUT_SECONDS
    while True:
        response = workflow.get_job_run(
            config.aidp_ocid,
            config.workspace_key,
            job_run_key,
            opc_request_id=requestId("get-job-run"),
        )
        status = getattr(response.data.state, "status", None)
        log(f"Job run status: {status}")
        if status in TERMINAL_STATUSES:
            return status
        if time.time() >= deadline:
            raise TimeoutError(f"Timed out waiting for job run {job_run_key}.")
        time.sleep(POLL_INTERVAL_SECONDS)


def cleanup(config: Config, clients: Clients, resources: CreatedResources) -> None:
    log("Cleaning up created resources")
    ignoreNotFound(
        lambda: resources.job_run_key
        and clients.workflow.delete_job_run(
            config.aidp_ocid,
            config.workspace_key,
            resources.job_run_key,
            opc_request_id=requestId("delete-job-run"),
        )
    )
    ignoreNotFound(
        lambda: resources.job_key
        and clients.workflow.delete_job(
            config.aidp_ocid,
            config.workspace_key,
            resources.job_key,
            opc_request_id=requestId("delete-job"),
        )
    )
    ignoreNotFound(
        lambda: resources.notebook_path
        and clients.notebook.delete_content(
            config.aidp_ocid,
            config.workspace_key,
            resources.notebook_path,
            opc_request_id=requestId("delete-notebook"),
        )
    )
    ignoreNotFound(
        lambda: clients.workspace_object.delete_workspace_object(
            config.aidp_ocid,
            config.workspace_key,
            resources.folder_name,
            opc_request_id=requestId("delete-folder"),
        )
    )


def getClusterDisplayName(config: Config, cluster: ClusterClient) -> str:
    response = cluster.get_cluster(
        config.aidp_ocid,
        config.workspace_key,
        config.cluster_key,
        opc_request_id=requestId("get-cluster"),
    )
    return response.data.display_name


def buildSigner(config: dict[str, Any]) -> Any:
    token_file = expandPath(config.get("security_token_file"))
    if token_file:
        token = Path(token_file).read_text(encoding="utf-8").strip()
        private_key = load_private_key_from_file(
            expandPath(config.get("key_file")),
            config.get("pass_phrase"),
        )
        return SecurityTokenSigner(token=token, private_key=private_key)

    return Signer(
        tenancy=config["tenancy"],
        user=config["user"],
        fingerprint=config["fingerprint"],
        private_key_file_location=expandPath(config.get("key_file")),
        pass_phrase=config.get("pass_phrase"),
        private_key_content=config.get("key_content"),
    )


def resolveEndpoint(config: Config) -> str:
    if config.endpoint:
        return config.endpoint.rstrip("/")
    return oci.regions.endpoint_for(
        "workspace",
        region=config.region,
        service_endpoint_template=WORKSPACE_ENDPOINT_TEMPLATE,
    ).rstrip("/")


def notebookContent() -> dict[str, Any]:
    return {
        "cells": [
            {
                "cell_type": "code",
                "execution_count": None,
                "id": str(uuid.uuid4()),
                "metadata": {"trusted": True},
                "outputs": [],
                "source": 'print("Hello")',
            }
        ],
        "metadata": {
            "kernelspec": {"display_name": "", "name": ""},
            "language_info": {"name": ""},
        },
        "nbformat": 4,
        "nbformat_minor": 5,
    }


def printSummary(
    config: Config,
    cluster_name: str,
    resources: CreatedResources,
    status: str,
) -> None:
    print(
        json.dumps(
            {
                "workspaceKey": config.workspace_key,
                "clusterKey": config.cluster_key,
                "clusterDisplayName": cluster_name,
                "notebookPath": resources.notebook_path,
                "jobKey": resources.job_key,
                "jobRunKey": resources.job_run_key,
                "jobRunStatus": status,
            },
            indent=2,
            sort_keys=True,
        )
    )


def closeClients(clients: Clients) -> None:
    for client in (clients.cluster, clients.workspace_object, clients.notebook, clients.workflow):
        base_client = getattr(client, "base_client", None)
        session = getattr(base_client, "session", None)
        if session and hasattr(session, "close"):
            session.close()


def ignoreNotFound(call) -> None:
    try:
        call()
    except ServiceError as exc:
        if exc.status != 404:
            raise


def env(name: str, *, default: str | None = None) -> str:
    value = os.getenv(name, default)
    if value is None or not value.strip():
        raise ValueError(f"Set {name} before running this example.")
    return value.strip()


def optionalEnv(name: str) -> str | None:
    value = os.getenv(name)
    return value.strip() if value and value.strip() else None


def expandPath(value: str | None) -> str | None:
    return os.path.expanduser(value) if value else None


def ensureLeadingSlash(path: str) -> str:
    return path if path.startswith("/") else f"/{path}"


def requestId(prefix: str) -> str:
    return f"{prefix}-{uuid.uuid4()}"


def sampleName(prefix: str) -> str:
    return f"{prefix}_{int(time.time())}_{uuid.uuid4().hex[:8]}"


def log(message: str) -> None:
    print(f"[WorkflowNotebookJobSample] {message}")


if __name__ == "__main__":
    raise SystemExit(main())
