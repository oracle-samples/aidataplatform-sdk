# Oracle AI Data Platform SDK

Oracle AI Data Platform SDK provides generated clients and command line tools
for working with Oracle AI Data Platform public APIs.

This repository contains:

- AIDP CLI packages for command line access.
- A Java SDK client.
- A Python SDK client.
- A TypeScript SDK client.
- Runnable examples for common workspace, cluster, notebook, and workflow use cases.

## Install

Download release artifacts from `releases/tag/v1.0.0`. The commands below
assume you are running them from the artifact directory.

Python CLI and SDK:

```bash
python3 -m pip install aidp_python_client-1.0.0-py3-none-any.whl aidp_cli-1.0.0-py3-none-any.whl
```

TypeScript/Node.js CLI and SDK:

```bash
npm install -g aidp-typescript-client-1.0.0.tgz aidp-cli-1.0.0.tgz
```

Python SDK:

Required only for SDK-only Python integrations. The Python CLI install command
already includes this artifact.

```bash
python3 -m pip install aidp_python_client-1.0.0-py3-none-any.whl
```

TypeScript/Node.js SDK:

Required only for SDK-only Node.js integrations. The Node.js CLI install
command already includes this artifact.

```bash
npm install aidp-typescript-client-1.0.0.tgz
```

Java SDK:

Make `aidp-java-client-1.0.0.jar` available in your Maven repository, then add
the dependency to your application.

```xml
<dependency>
  <groupId>com.oracle.aidataplatform</groupId>
  <artifactId>aidp-java-client</artifactId>
  <version>1.0.0</version>
</dependency>
```

## Configure Authentication

AIDP clients use OCI authentication. Configure an OCI profile first. For a
session-token profile, authenticate with OCI CLI:

```bash
oci session authenticate \
  --profile-name DEFAULT \
  --region us-ashburn-1 \
  --tenancy-name <tenancy_name>
```

Set common defaults:

```bash
export OCI_CONFIG_FILE=~/.oci/config
export OCI_PROFILE=DEFAULT
export OCI_CLI_AUTH=security_token
export OCI_CLI_REGION=<oci_region>
export AIDP_INSTANCE_ID=<ai_data_platform_ocid>
# Optional endpoint override:
export OCI_CLI_ENDPOINT=https://aidp.<region>.oci.oraclecloud.com
```

You can also pass `--instance-id <ai_data_platform_ocid>` directly to CLI
commands, or save it with `aidp configure set instance-id <ai_data_platform_ocid>`.

## Use the CLI

Start with help and discovery:

```bash
aidp --help
aidp command-groups
aidp workspace
aidp workspace list --help
```

Invoke a workspace API:

```bash
aidp \
  --auth security_token \
  --profile DEFAULT \
  --region <oci_region> \
  --instance-id <ai_data_platform_ocid> \
  workspace list
```

Use `--endpoint <service_endpoint>` when you need an explicit endpoint instead
of region-based endpoint resolution.

For APIs that accept a JSON body, write the body to a file and pass
`--body @file.json`.

## Use the SDKs

The SDKs handle OCI request signing, endpoints, typed request and response
models, pagination patterns, retries, and structured service errors.

Java:

```java
WorkspaceClient client = WorkspaceClient.builder().region(region).build(provider);
ListWorkspacesResponse response = client.listWorkspaces(request);
```

Python:

```python
client = WorkspaceClient(config, signer=signer)
response = client.list_workspaces(ai_data_platform_id, limit=10)
```

TypeScript/Node.js:

```ts
const client = new WorkspaceClient({ authenticationDetailsProvider: authProvider });
const response = await client.listWorkspaces({ aiDataPlatformId, limit: 10 });
```

For runnable notebook workflow samples, see [examples](./examples/README.md).

## Documentation and Help

See the examples in this repository and the
[Oracle AI Data Platform API documentation](https://docs.oracle.com/en/cloud/paas/ai-data-platform/aiwap/index.html)
for complete workflows. For questions or support, use the standard project
support channels for this repository.

## Security

Please consult the [security guide](./SECURITY.md) for our responsible security
vulnerability disclosure process.

## License

Copyright (c) 2026, Oracle and/or its affiliates.

This software is licensed under the Universal Permissive License 1.0.
