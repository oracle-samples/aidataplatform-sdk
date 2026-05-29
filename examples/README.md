# AIDP SDK Examples

These examples show how to use the AIDP SDKs with an existing AI Data Platform
workspace and cluster.

Each language sample creates a notebook, creates a workflow job with one
notebook task, starts a job run, waits for a terminal status, and cleans up the
resources it created.

These examples require AIDP SDK version `1.0.0` for the language you are
using. Download the artifacts from the matching GitHub release, then install
the SDK before running a sample.

## Required Environment

```bash
export AIDP_RUN_SAMPLE=true
export AIDP_OCID=<ai_data_platform_ocid>
export AIDP_WORKSPACE_KEY=<workspace_key>
export AIDP_CLUSTER_KEY=<cluster_key>
export AIDP_REGION=<oci_region>
# or:
# export AIDP_ENDPOINT=<service_endpoint>

export OCI_CONFIG_FILE=~/.oci/config
export OCI_PROFILE=DEFAULT
```

Set `AIDP_KEEP_RESOURCES=true` to keep the created folder, notebook, job, and
job run for inspection.

## Run an Example

- [Python](python/README.md)
- [TypeScript/Node.js](typescript/README.md)
- [Java](java/README.md)
