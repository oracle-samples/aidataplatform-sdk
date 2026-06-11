# Oracle AI Data Platform
Oracle AI Data Platform Workbench simplifies cataloging, ingesting, and analyzing data for data professionals in an organization.
The Oracle AI Data Platform Workbench service provides the platform and the framework to create data analytics pipelines.

## Documentation
[Oracle AI Data Platform Workbench documentation](https://docs.oracle.com/en/cloud/paas/ai-data-platform/)

## Using SDK
The `aidp-typescript-client` SDK is the TypeScript and Node.js artifact for calling Oracle AI Data Platform public APIs from Node.js applications and automation.

### Configure Auth
AIDP clients use OCI authentication. Configure an OCI profile before invoking the SDK.

~~~
oci setup config
~~~

For session-token authentication, authenticate with OCI CLI:

~~~
oci session authenticate \
  --profile-name DEFAULT \
  --region us-ashburn-1 \
  --tenancy-name <tenancy_name>
~~~

For API-key authentication, create an OCI config profile once if you do not already have one. OCI CLI can create the file for you if it is installed. Existing OCI config profiles can be reused.

### Use the SDK

```ts
const client = new WorkspaceClient({ authenticationDetailsProvider: authProvider });
const response = await client.listWorkspaces({ aiDataPlatformId, limit: 10 });
```

For more details, see [Oracle AI Data Platform TypeScript SDK documentation](https://github.com/oracle-samples/aidataplatform-sdk/blob/main/docs/typescript-sdk/README.md).
