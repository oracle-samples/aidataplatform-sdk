# Oracle AI Data Platform SDK and CLI

Oracle AI Data Platform SDK and CLI provide generated clients and command line
tools for working with Oracle AI Data Platform public APIs.

This repository contains:

- AIDP CLI packages for command line access.
- A Java SDK client.
- A Python SDK client.
- A TypeScript SDK client.
- Runnable examples for common workspace, cluster, notebook, and workflow use cases.

## Install

Download the required package files from the GitHub release `v1.0.0`. The
commands below assume you are running them from the local directory where those
files were downloaded.

### CLI

For the Python CLI, install Python 3.9 or later and make sure `python3` and
`pip` are available:

```bash
python3 --version
python3 -m ensurepip --upgrade
python3 -m pip install --user --upgrade pip setuptools wheel
export PATH="$(python3 -m site --user-base)/bin:$PATH"
```

OCI CLI is required. You can skip this step if its already installed in your environment.
Use it to create an OCI config file or authenticate with a session token.

For setup help, see [Install OCI CLI](https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/cliinstall.htm).

```bash
python3 -m pip install --user oci-cli
```

Install the Python CLI by unpacking the Python SDK and CLI release zips, then
installing both wheels in one command. The CLI depends on the SDK.

```bash
unzip aidp-python-client-1.0.0.zip -d aidp-python-client
unzip aidp-py-cli-1.0.0.zip -d aidp-py-cli

python3 -m pip install --user \
  ./aidp-python-client/aidp_python_client-1.0.0-py3-none-any.whl \
  ./aidp-py-cli/aidp_cli-1.0.0-py3-none-any.whl

aidp --help
```

For Node.js CLI usage, unpack the TypeScript/Node.js SDK and npm CLI release
zips, then install both tarballs in one command. The CLI depends on the SDK.

```bash
unzip aidp-typescript-client-1.0.0.zip -d aidp-typescript-client
unzip aidp-npm-cli-1.0.0.zip -d aidp-npm-cli

npm install -g \
  ./aidp-typescript-client/aidp-typescript-client-1.0.0.tgz \
  ./aidp-npm-cli/aidp-cli-1.0.0.tgz

aidp --help
```

### SDK

#### Python

Install the Python SDK wheel for SDK-only Python integrations. This is not
required separately if you already installed the SDK in the Python CLI command
above.

```bash
python3 -m pip install aidp_python_client-1.0.0-py3-none-any.whl
```

#### TypeScript/Node.js

Install the TypeScript/Node.js SDK tarball for SDK-only Node.js integrations.
This is not required separately if you already installed the SDK in the Node.js
CLI command above.

```bash
npm install aidp-typescript-client-1.0.0.tgz
```

#### Java

Unpack the Java SDK release zip, install the jar into your Maven repository,
then add the dependency to your application.

```bash
unzip aidp-java-client-1.0.0.zip -d aidp-java-client

mvn install:install-file \
  -Dfile=./aidp-java-client/aidp-java-client-1.0.0.jar \
  -DgroupId=com.oracle.aidataplatform \
  -DartifactId=aidp-java-client \
  -Dversion=1.0.0 \
  -Dpackaging=jar
```

```xml
<dependency>
  <groupId>com.oracle.aidataplatform</groupId>
  <artifactId>aidp-java-client</artifactId>
  <version>1.0.0</version>
</dependency>
```

## Using CLI and SDK

### Configure Auth

AIDP clients use OCI authentication. Configure an OCI profile before invoking
the CLI or SDK.

For API-key authentication, create an OCI config profile once if you do not
already have one. OCI CLI can create the file for you if it is installed.
Existing OCI config profiles can be reused.

```bash
oci setup config
```

For session-token authentication, authenticate with OCI CLI:

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

### Use the CLI

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

### Use the SDK

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
