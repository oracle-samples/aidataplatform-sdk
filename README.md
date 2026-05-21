# Oracle AI Data Platform SDK

Oracle AI Data Platform SDK provides generated clients and command line tools for
working with Oracle AI Data Platform public APIs.

This repository contains:

- AIDP CLI packages for command line access.
- A Java SDK client.
- A Python SDK client.
- A TypeScript SDK client.
- Runnable examples for common workspace, cluster, notebook, and workflow use cases.

## Installation

### AIDP CLI

Build the Python client and Python CLI wheels from this repository:

```bash
export BLD_VERSION=<version>

python3 aidp-python-client/scripts/write_version_file.py
python3 -m build --wheel aidp-python-client/src

python3 aidp-cli/aidp-py-cli/scripts/write_version_file.py
python3 -m build --wheel aidp-cli/aidp-py-cli
```

Install the local wheels together:

```bash
python3 -m pip install --force-reinstall \
  aidp-python-client/src/dist/aidp_python_client-<version>-py3-none-any.whl \
  aidp-cli/aidp-py-cli/dist/aidp_cli-<version>-py3-none-any.whl
```

Build the npm CLI package from this repository:

```bash
export PKG_VERSION=<version>

npm --prefix aidp-typescript-client run write-version
npm --prefix aidp-typescript-client ci
npm --prefix aidp-typescript-client run build
npm pack ./aidp-typescript-client --pack-destination aidp-typescript-client

npm --prefix aidp-cli/aidp-npm-cli run write-version
npm --prefix aidp-cli/aidp-npm-cli ci
npm --prefix aidp-cli/aidp-npm-cli run build
npm pack ./aidp-cli/aidp-npm-cli --pack-destination aidp-cli/aidp-npm-cli
```

Install the local npm CLI package:

```bash
npm install -g aidp-cli/aidp-npm-cli/aidp-cli-<version>.tgz
```

Verify either CLI installation:

```bash
aidp --help
aidp command-groups
aidp search list workspaces
```

### Java Client

Build and install the Java clients into your local Maven repository:

```bash
mvn -pl aidp-java-client,aidp-java-client-2x install -DskipTests
```

Then add the Java client dependency to your Maven project:

```xml
<dependency>
  <groupId>com.oracle.aidataplatform</groupId>
  <artifactId>aidp-java-client</artifactId>
  <version>${aidp.version}</version>
</dependency>
```

For applications that must stay on the OCI Java SDK 2.x client stack, use:

```xml
<dependency>
  <groupId>com.oracle.aidataplatform</groupId>
  <artifactId>aidp-java-client-2x</artifactId>
  <version>${aidp.version}</version>
</dependency>
```

### Python Client

Build the Python client wheel from this repository:

```bash
export BLD_VERSION=<version>
python3 aidp-python-client/scripts/write_version_file.py
python3 -m build --wheel aidp-python-client/src
```

Install the local wheel:

```bash
python3 -m pip install --force-reinstall \
  aidp-python-client/src/dist/aidp_python_client-<version>-py3-none-any.whl
```

### TypeScript Client

Build the TypeScript client package from this repository:

```bash
export PKG_VERSION=<version>

npm --prefix aidp-typescript-client run write-version
npm --prefix aidp-typescript-client ci
npm --prefix aidp-typescript-client run build
npm pack ./aidp-typescript-client --pack-destination aidp-typescript-client
```

Install the local package in your application:

```bash
npm install ./aidp-typescript-client/aidp-typescript-client-<version>.tgz
```

The TypeScript client depends on OCI authentication support. During local
development, install dependencies from the local package lock file before
building or running examples:

```bash
npm --prefix aidp-typescript-client ci
```

To run the TypeScript example project from this repository:

```bash
npm --prefix aidp-typescript-client-example ci
npm --prefix aidp-typescript-client-example run build
```

## Configuration

The SDKs use OCI authentication. Configure an OCI profile, then provide an AI
Data Platform OCID and either an OCI region or an explicit service endpoint.

Common environment variables used by the examples:

```bash
export AIDP_DP_AI_DATA_PLATFORM_ID=<ai_data_platform_ocid>
export AIDP_DP_REGION=<oci_region>
# Optional endpoint override. Use this instead of region when required.
export AIDP_DP_ENDPOINT=<service_endpoint>
export OCI_CONFIG_FILE=~/.oci/config
export OCI_PROFILE=DEFAULT
```

For the CLI, you can also set the AIDP instance OCID once:

```bash
export AIDP_INSTANCE_ID=<ai_data_platform_ocid>
aidp configure set instance-id <ai_data_platform_ocid>
```

## Documentation

For API documentation, see the
[Oracle AI Data Platform API documentation](https://docs.oracle.com/en/cloud/paas/ai-data-platform/aiwap/index.html).

## Examples

### CLI: List Workspaces

```bash
aidp workspace list \
  --instance-id <ai_data_platform_ocid> \
  --region <oci_region>
```

Use an explicit endpoint when needed:

```bash
aidp workspace list \
  --instance-id <ai_data_platform_ocid> \
  --endpoint <service_endpoint>
```

### Java: List Workspaces

```java
import com.oracle.aidataplatform.dp.WorkspaceClient;
import com.oracle.aidataplatform.dp.model.SortOrder;
import com.oracle.aidataplatform.dp.model.Workspace;
import com.oracle.aidataplatform.dp.requests.ListWorkspacesRequest;
import com.oracle.aidataplatform.dp.responses.ListWorkspacesResponse;
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.SessionTokenAuthenticationDetailsProvider;

public class ListWorkspacesExample {
  public static void main(String[] args) throws Exception {
    String aiDataPlatformId = System.getenv("AIDP_DP_AI_DATA_PLATFORM_ID");
    String region = System.getenv("AIDP_DP_REGION");
    String endpoint = System.getenv("AIDP_DP_ENDPOINT");
    String configFile =
        System.getenv().getOrDefault("OCI_CONFIG_FILE", ConfigFileReader.DEFAULT_FILE_PATH);
    String profile = System.getenv().getOrDefault("OCI_PROFILE", "DEFAULT");

    ConfigFileReader.ConfigFile config = ConfigFileReader.parse(configFile, profile);
    SessionTokenAuthenticationDetailsProvider provider =
        new SessionTokenAuthenticationDetailsProvider(config);

    WorkspaceClient.Builder builder = WorkspaceClient.builder();
    if (endpoint != null && !endpoint.isBlank()) {
      builder.endpoint(endpoint);
    } else {
      builder.region(region);
    }

    try (WorkspaceClient client = builder.build(provider)) {
      ListWorkspacesRequest request =
          ListWorkspacesRequest.builder()
              .aiDataPlatformId(aiDataPlatformId)
              .lifecycleState(Workspace.LifecycleState.Active)
              .sortBy(ListWorkspacesRequest.SortBy.TimeCreated)
              .sortOrder(SortOrder.Desc)
              .limit(10)
              .build();

      ListWorkspacesResponse response =
          client.listWorkspaces(request);

      response.getWorkspaceCollection().getItems().forEach(System.out::println);
    }
  }
}
```

### Python: List Workspaces

```python
import os
from pathlib import Path

import oci
from oci.auth.signers import SecurityTokenSigner
from oci.signer import load_private_key_from_file

from aidp_python_client.aidataplatform_dp import WorkspaceClient


def build_signer(config):
    token_file = config.get("security_token_file")
    if token_file:
        token = Path(os.path.expanduser(token_file)).read_text(encoding="utf-8").strip()
        private_key = load_private_key_from_file(
            os.path.expanduser(config["key_file"]),
            config.get("pass_phrase"),
        )
        return SecurityTokenSigner(token=token, private_key=private_key)
    return None


config = oci.config.from_file(
    file_location=os.getenv("OCI_CONFIG_FILE", "~/.oci/config"),
    profile_name=os.getenv("OCI_PROFILE", "DEFAULT"),
)
signer = build_signer(config)
endpoint = os.getenv("AIDP_DP_ENDPOINT")
ai_data_platform_id = os.environ["AIDP_DP_AI_DATA_PLATFORM_ID"]

client_kwargs = {}
if signer:
    client_kwargs["signer"] = signer
if endpoint:
    client_kwargs["service_endpoint"] = endpoint

client = WorkspaceClient(config, **client_kwargs)
try:
    response = client.list_workspaces(
        ai_data_platform_id,
        lifecycle_state="ACTIVE",
        sort_by="timeCreated",
        sort_order="DESC",
        limit=10,
    )
    for workspace in response.data.items:
        print(workspace.display_name, workspace.key)
finally:
    client.base_client.session.close()
```

### TypeScript: List Workspaces

```ts
import common = require("oci-common");
import {
  WorkspaceClient,
  models,
  requests
} from "aidp-typescript-client";

const aiDataPlatformId = process.env.AIDP_DP_AI_DATA_PLATFORM_ID!;
const endpoint = process.env.AIDP_DP_ENDPOINT;
const region = process.env.AIDP_DP_REGION;
const configFilePath = process.env.OCI_CONFIG_FILE ?? `${process.env.HOME}/.oci/config`;
const profile = process.env.OCI_PROFILE ?? "DEFAULT";

const authProvider = new common.SessionAuthDetailProvider(configFilePath, profile);
const client = new WorkspaceClient({ authenticationDetailsProvider: authProvider });

if (endpoint) {
  client.endpoint = endpoint;
} else if (region) {
  client.regionId = region;
}

const request: requests.ListWorkspacesRequest = {
  aiDataPlatformId,
  lifecycleState: "ACTIVE",
  sortBy: requests.ListWorkspacesRequest.SortBy.TimeCreated,
  sortOrder: models.SortOrder.Desc,
  limit: 10
};

const response = await client.listWorkspaces(request);
for (const workspace of response.workspaceCollection.items ?? []) {
  console.log(workspace.displayName, workspace.key);
}
```

## Help

For questions, issues, or support, use the standard project support channels for
this repository.

## Security

Please consult the [security guide](./SECURITY.md) for our responsible security
vulnerability disclosure process.

## License

Copyright (c) 2026, Oracle and/or its affiliates.

This software is dual-licensed under the Universal Permissive License 1.0 and
Apache License 2.0. You may choose either license.
