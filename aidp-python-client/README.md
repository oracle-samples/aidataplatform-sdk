# Oracle AI Data Platform
Oracle AI Data Platform Workbench simplifies cataloging, ingesting, and analyzing data for data professionals in an organization.
The Oracle AI Data Platform Workbench service provides the platform and the framework to create data analytics pipelines.

## Documentation
[Oracle AI Data Platform Workbench documentation](https://docs.oracle.com/en/cloud/paas/ai-data-platform/)

## Using SDK
The `aidp-python-client` SDK is the Python artifact for calling Oracle AI Data Platform public APIs from Python applications and automation.

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

```python
client = WorkspaceClient(config, signer=signer)
response = client.list_workspaces(ai_data_platform_id, limit=10)
```

For more details, see [Oracle AI Data Platform Python SDK documentation](https://github.com/oracle-samples/aidataplatform-sdk/blob/main/docs/python-sdk/README.md).
