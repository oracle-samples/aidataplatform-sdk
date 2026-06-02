<a id="top"></a>
# AIDP CLI Command Reference
This guide summarizes the command groups, commands, options, and payload requirements exposed by the `aidp` command-line interface.
## Global Options
- `--debug` — enable debug logging
- `--profile` / `-p` — OCI config profile (default `DEFAULT`)
- `--auth` — authentication mode (`api_key`, `security_token`, `instance_principal`, `resource_principal`; default `security_token`)
- `--config-file` — path to OCI config file
- `--region` — OCI region override
- `--endpoint` — data plane endpoint override (default `https://aidp.<region>.oci.oraclecloud.com`)
- `--instance-id` — AIDP instance OCID
- `--timeout` — connection/read timeout in seconds
## Utility Commands
- `aidp command-groups` — list API command groups
- `aidp search <term>` — fuzzy-search command names and descriptions
- `aidp configure` — set default profile, instance OCID, and other settings
- `aidp help [group|command]` — show contextual help
- `aidp version` — print CLI version
## Command Index
- [Async Operations](#async-operations)
- [Audit](#audit)
- [Bundle](#bundle)
- [Catalog](#catalog)
- [Cluster](#cluster)
- [Credentials](#credentials)
- [Delta Share](#delta-share)
- [Mlops](#mlops)
- [Notebook](#notebook)
- [Role](#role)
- [Schema](#schema)
- [User Setting](#user-setting)
- [Volume](#volume)
- [Workflow](#workflow)
- [Workspace](#workspace)
- [Workspace Object](#workspace-object)
## Async Operations
Async operations.
**Command Index:**
- [async-operations get](#async-operations-get)
- [async-operations list](#async-operations-list)
### Commands
#### `aidp async-operations get`
<a id="async-operations-get"></a>
Get detailed information for a particular async operation.
Get detailed information for a particular async operation

**Usage:**

`aidp async-operations get <AI-DATA-PLATFORM-ID> <ASYNC-OPERATION-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `async-operation-key` (string, required) — The unique identifier of an async operation

**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Async Operations](#async-operations) • [Top](#top)

#### `aidp async-operations list`
<a id="async-operations-list"></a>
List all async operations for a resource type.
List all async operations for a resource type. Filters can be used to narrow the search down.

**Usage:**

`aidp async-operations list <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `resource-type` (string, optional) — Required parameter which decides async operation resource type
- `resource-name` (string, optional) — A filter to return only resources that match the given resource name exactly.
- `match-resource-name` (boolean, optional) — Parameter which decides to list async operations with prefix or exact match to resourceName
- `status` (string, optional) — Option parameter to filter operation on status
- `should-filter-by-calling-principal` (boolean, optional) — A filter to return only resources that match the current principal.
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC" Allowed values: ASC, DESC
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeStarted is descending. Allowed values are: "timeStarted" Allowed values: timeStarted
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Async Operations](#async-operations) • [Top](#top)

## Audit
Audit logs.
**Command Index:**
- [audit manage-logs](#audit-manage-logs)
- [audit search-logs](#audit-search-logs)
### Commands
#### `aidp audit manage-logs`
<a id="audit-manage-logs"></a>
Manages audit logs for AI Data Platform Workbench.

**Usage:**

`aidp audit manage-logs <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `manage-audit-logs-details` (object, required) — Details to update in an audit log.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
**Request Body (`ManageAuditLogsDetails`):**
- `action` (str, optional) — action of this ManageAuditLogsDetails
- `retention_period` (int, optional) — retention_period of this ManageAuditLogsDetails
**Example:**
```json
{
  "action": "<string>",
  "retention_period": 123
}
```
---

**Return:** [Back to Audit](#audit) • [Top](#top)

#### `aidp audit search-logs`
<a id="audit-search-logs"></a>
Searches audit logs for AI Data Platform Workbench.

**Usage:**

`aidp audit search-logs <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `search-audit-logs-details` (object, required) — Details for the audit log search.
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
**Request Body (`SearchAuditLogsDetails`):**
- `time_begin` (datetime, optional) — time_begin of this SearchAuditLogsDetails
- `time_end` (datetime, optional) — time_end of this SearchAuditLogsDetails
- `object_type` (str, optional) — object_type of this SearchAuditLogsDetails
- `object_name` (str, optional) — object_name of this SearchAuditLogsDetails
- `operation` (str, optional) — operation of this SearchAuditLogsDetails
- `status` (str, optional) — status of this SearchAuditLogsDetails
- `started_by` (str, optional) — started_by of this SearchAuditLogsDetails
- `query` (str, optional) — query of this SearchAuditLogsDetails
- `sort_by` (str, optional) — sort_by of this SearchAuditLogsDetails
- `sort_order` (str, optional) — sort_order of this SearchAuditLogsDetails
**Example:**
```json
{
  "time_begin": "<datetime>",
  "time_end": "<datetime>",
  "object_type": "<string>",
  "object_name": "<string>",
  "operation": "<string>"
}
```
---

**Return:** [Back to Audit](#audit) • [Top](#top)

## Bundle
Bundles, bundle deployment status, and sync bundles.
**Command Index:**
- [bundle create](#bundle-create)
- [bundle deploy](#bundle-deploy)
- [bundle fetch-deployment-status](#bundle-fetch-deployment-status)
- [bundle purge](#bundle-purge)
- [bundle sync-bundle](#bundle-sync-bundle)
### Commands
#### `aidp bundle create`
<a id="bundle-create"></a>
(Preview) Creates a new bundle.
(Preview) Creates a new bundle. A bundle is a self-contained, portable representation of selected workspace assets, such as jobs and agent flows, along with their dependencies and associated code artifacts. It captures both the resource configurations and the supporting assets required to recreate those resources in another workspace or environment. The bundle manifest is named aidp_workbench.yaml. The bundle preserves the workspace folder structure for code artifacts from the location where it was created, so the generated bundle mirrors the source layout. Dependencies are tracked inside the bundle under each asset type: - job and agent flow dependencies are added under the dependencies folder inside the jobs and agentflows folders - code dependencies are added under the artifacts directory in the bundle Dependency references use template variables, for example: - compute: $${jobs.dependencies.training_compute.compute.key} - nested jobs: $${jobs.dependencies.training_job.job.key} - aicompute: $${jobs.dependencies.training_aicompute.aicompute.key} Bundles also support the special variable $${bundle.root}, which points to the root of the bundle folder and is used for referencing artifacts. Variables and overrides: - bundles support parameterization using variables defined in the bundle manifest (aidp_workbench.yaml) Example manifest defaults: defaults: variables: job_compute_key: "$${jobs.dependencies.small.compute.key}" - variables can be referenced in resource descriptors using the $${var.<name>} syntax Example usage in a job descriptor: "clusterKey": "$${var.job_compute_key}" - workspace-specific overrides can be provided via .aidp/overrides.yaml inside the bundle - this file is intended for environment-specific configuration and should not be committed to Git, allowing the bundle to remain portable and environment-agnostic Example overrides file: variables: job_compute_key: f6e7f5d8-d965-4009-95d9-02e993d9a16b - when an override is provided, the referenced dependency (for example, compute) is not created, and the provided value is used instead - when no override is provided, the system falls back to the default variable value, which may reference a dependency included in the bundle (resulting in that dependency being created) - this mechanism enables environment-specific customization (for example, reusing existing infrastructure in production while creating new resources in development) - the same pattern can be used for other environment-specific parameters such as compute shape, number of OCPUs, or other configuration values Git integration and promotion: - bundles can only be created inside Git-backed workspace folders - bundles are self-contained packages that include resource definitions, dependency references, and associated code artifacts required to recreate the bundled resources - the entire bundle folder can be committed and pushed to a Git repository - bundles can be pulled into another workspace via Git and deployed there - bundles can be promoted across environments (for example, dev → test → prod) using Git workflows - because the bundle includes both resource configuration and code dependencies, it can be used to reliably replicate assets across workspaces This operation is asynchronous. The service validates the request, starts bundle creation, and returns an async operation key in the response headers. Use the async operation APIs to track completion. Typical use cases: - capture selected workspace resources into a version-controlled bundle - prepare a bundle for later deployment or promotion - establish a bundle root that can later be inspected, updated, or deployed Request notes: - path identifies the parent folder in the workspace volume where the bundle should be created - name identifies the bundle folder name - bundledResources identifies which workspace resources should be included

**Usage:**

`aidp bundle create <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `create-bundle-details` (object, required) — Request payload for bundle creation.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
**Request Body (`CreateBundleDetails`):**
- `name` (str, required) — **[Required]** name of this CreateBundleDetails
- `description` (str, optional) — description of this CreateBundleDetails
- `path` (str, required) — **[Required]** path of this CreateBundleDetails
- `bundled_resources` (list[BundledResource], required) — **[Required]** bundled_resources of this CreateBundleDetails
**Example:**
```json
{
  "name": "<string>",
  "description": "<string>",
  "path": "<string>",
  "bundled_resources": [
    "<BundledResource>"
  ]
}
```
---

**Return:** [Back to Bundle](#bundle) • [Top](#top)

#### `aidp bundle deploy`
<a id="bundle-deploy"></a>
(Preview) Deploys the specified bundle, creating or updating jobs and agent flows according to the bundle manifest.
(Preview) Deploys the specified bundle, creating or updating jobs and agent flows according to the bundle manifest. Returns an async job key for tracking deployment progress. This operation is asynchronous. The request is accepted for background execution and returns an async operation key in the response headers. Deployment typically uses: - the bundle manifest at the bundle root - top-level resource descriptors in the bundle - dependency descriptors referenced by those top-level resources - default or override variable values when present Use this operation when you want to apply the bundle contents into the target workspace state. Request notes: - path identifies the bundle root folder in the workspace volume

**Usage:**

`aidp bundle deploy <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `deploy-bundle-details` (object, required) — Request payload for bundle deploy.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
**Request Body (`DeployBundleDetails`):**
- `path` (str, required) — **[Required]** path of this DeployBundleDetails
**Example:**
```json
{
  "path": "<string>"
}
```
---

**Return:** [Back to Bundle](#bundle) • [Top](#top)

#### `aidp bundle fetch-deployment-status`
<a id="bundle-fetch-deployment-status"></a>
(Preview) Returns a high-level summary of the most recent deployment activity recorded for the specified bundle.
(Preview) Returns a high-level summary of the most recent deployment activity recorded for the specified bundle. This operation is useful after deploy or purge requests when you want the latest bundle-level deployment outcome rather than raw async operation details. The response can include: - overall deployment status - start and completion timestamps - summary message - resources associated with the last recorded deployment result Typical status values include: - IN_PROGRESS - SUCCEEDED - FAILED - NOT_DEPLOYED Request notes: - path identifies the bundle root folder in the workspace volume

**Usage:**

`aidp bundle fetch-deployment-status <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `fetch-bundle-deployment-status-details` (object, required) — Request payload for FetchBundleDeploymentStatusDetails.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
**Request Body (`FetchBundleDeploymentStatusDetails`):**
- `path` (str, required) — **[Required]** path of this FetchBundleDeploymentStatusDetails
**Example:**
```json
{
  "path": "<string>"
}
```
---

**Return:** [Back to Bundle](#bundle) • [Top](#top)

#### `aidp bundle purge`
<a id="bundle-purge"></a>
(Preview) Tears down all resources deployed by the specified bundle in the workspace.
(Preview) Tears down all resources deployed by the specified bundle in the workspace. This operation is intended to tear down resources that were created or managed through bundle deployment. It does not delete the bundle files themselves from the workspace volume. This operation is asynchronous. The service accepts the purge request, starts the background teardown workflow, and returns async operation headers. Typical use cases: - remove resources that were previously deployed from a bundle - clean up a workspace before re-deploying or retiring a bundle Request notes: - path identifies the bundle root folder in the workspace volume

**Usage:**

`aidp bundle purge <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `purge-bundle-details` (object, required) — Request payload for bundle purge.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
**Request Body (`PurgeBundleDetails`):**
- `path` (str, required) — **[Required]** path of this PurgeBundleDetails
**Example:**
```json
{
  "path": "<string>"
}
```
---

**Return:** [Back to Bundle](#bundle) • [Top](#top)

#### `aidp bundle sync-bundle`
<a id="bundle-sync-bundle"></a>
(Preview) Synchronizes the code, descriptors, and mapping in the bundle by reconciling the contents with the resource origins.
(Preview) Synchronizes the code, descriptors, and mapping in the bundle by reconciling the contents with the resource origins. Returns an async job key for tracking sync progress. This operation is intended for cases where the bundle should be refreshed to reflect newer source changes while preserving the bundle structure and identity. Sync uses the bundle's recorded origin metadata to rebuild the bundle from the source jobs and agent flows that were captured when the bundle was created. The source metadata is stored in .aidp/resource_origins.yaml and must match the requested AIDP/Data Lake and workspace. The operation refreshes source-controlled bundle content while preserving the bundle identity and runtime metadata. During sync, the service stages a refreshed bundle snapshot under the bundle .aidp directory, compares existing and staged descriptors, preserves existing variable aliases and override references where possible, merges existing manifest default variables, and then promotes the refreshed source-controlled files back into the bundle root. Sync preserves environment-specific and deployment runtime files such as .aidp/overrides.yaml and .aidp/aidp.state.json. These files are not replaced by the refreshed source snapshot. This operation is asynchronous and returns async operation headers when accepted. Typical use cases: - refresh bundle contents after upstream workspace resources have changed - reconcile descriptor or artifact content with current resource origins - preserve local bundle overrides while pulling in source resource updates - keep a Git-backed bundle current before committing or promoting it Request notes: - path identifies the bundle root folder in the workspace volume - the bundle must contain a valid aidp_workbench.yaml - the bundle must contain .aidp/resource_origins.yaml - origin metadata must refer to the same AIDP/Data Lake and workspace as the request

**Usage:**

`aidp bundle sync-bundle <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `sync-bundle-details` (object, required) — Request payload for bundle sync.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
**Request Body (`SyncBundleDetails`):**
- `path` (str, required) — **[Required]** path of this SyncBundleDetails
**Example:**
```json
{
  "path": "<string>"
}
```
---

**Return:** [Back to Bundle](#bundle) • [Top](#top)

## Catalog
Catalogs, catalog permissions, and connections.
**Command Index:**
- [catalog create](#catalog-create)
- [catalog delete](#catalog-delete)
- [catalog get](#catalog-get)
- [catalog list](#catalog-list)
- [catalog list-permissions](#catalog-list-permissions)
- [catalog manage-permission](#catalog-manage-permission)
- [catalog refresh](#catalog-refresh)
- [catalog test-connection](#catalog-test-connection)
- [catalog update](#catalog-update)
### Commands
#### `aidp catalog create`
<a id="catalog-create"></a>
Create a catalog in the AI Data Platform Workbench with the given ID.

**Usage:**

`aidp catalog create <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `create-catalog-details` (object, required) — Details for the new AI Data Platform Workbench catalog.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
**Request Body (`CreateCatalogDetails`):**
- `display_name` (str, required) — **[Required]** display_name of this CreateCatalogDetails
- `description` (str, optional) — description of this CreateCatalogDetails
- `catalog_type` (str, optional) — catalog_type of this CreateCatalogDetails
- `source_type` (str, optional) — source_type of this CreateCatalogDetails
- `properties` (dict(str, str), optional) — properties of this CreateCatalogDetails
- `connection_details` (CreateConnectionDetails, optional) — connection_details of this CreateCatalogDetails
**Example:**
```json
{
  "display_name": "<string>",
  "description": "<string>",
  "catalog_type": "<string>",
  "source_type": "<string>",
  "properties": "<dict(str, str)>"
}
```
---

**Return:** [Back to Catalog](#catalog) • [Top](#top)

#### `aidp catalog delete`
<a id="catalog-delete"></a>
Deletes the specified catalog from an AI Data Platform Workbench.

**Usage:**

`aidp catalog delete <AI-DATA-PLATFORM-ID> <CATALOG-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `catalog-key` (string, required) — The key of the catalog.

**Options:**
- `is-forced` (boolean, optional) — A boolean which decides if an entity should be deleted with Cascade effect
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---

**Return:** [Back to Catalog](#catalog) • [Top](#top)

#### `aidp catalog get`
<a id="catalog-get"></a>
Gets detailed information about an AI Data Platform Workbench catalog with a given catalog key.

**Usage:**

`aidp catalog get <AI-DATA-PLATFORM-ID> <CATALOG-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `catalog-key` (string, required) — The key of the catalog.

**Options:**
- `is-catalog-guid` (boolean, optional) — A boolean which decides if catalogKey path parameter is catalog GUID (UUID) or name.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---

**Return:** [Back to Catalog](#catalog) • [Top](#top)

#### `aidp catalog list`
<a id="catalog-list"></a>
Get a list of catalogs in an AI Data Platform Workbench with a given ID.

**Usage:**

`aidp catalog list <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `catalog-state` (string, optional) — The state of the catalog. Allowed values are: "ACTIVE", "CREATING", "DELETING" Allowed values: ACTIVE, CREATING, DELETING
- `catalog-type` (string, optional) — The type of the catalog. Allowed values are: "INTERNAL", "EXTERNAL" Allowed values: INTERNAL, EXTERNAL
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC" Allowed values: ASC, DESC
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName" Allowed values: timeCreated, displayName
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Catalog](#catalog) • [Top](#top)

#### `aidp catalog list-permissions`
<a id="catalog-list-permissions"></a>
Gets a list of all permissions in the specified catalog of an AI Data Platform Workbench.

**Usage:**

`aidp catalog list-permissions <AI-DATA-PLATFORM-ID> <CATALOG-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `catalog-key` (string, required) — The key of the catalog.

**Options:**
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC" Allowed values: ASC, DESC
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName" Allowed values: timeCreated, displayName
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---

**Return:** [Back to Catalog](#catalog) • [Top](#top)

#### `aidp catalog manage-permission`
<a id="catalog-manage-permission"></a>
Update permission details for a catalog in an AI Data Platform Workbench.

**Usage:**

`aidp catalog manage-permission <AI-DATA-PLATFORM-ID> <CATALOG-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `catalog-key` (string, required) — The key of the catalog.

**Options:**
- `manage-catalog-permission-details` (object, required) — The information to be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
**Request Body (`ManageCatalogPermissionDetails`):**
- `assign_catalog_permission_details` (AssignCatalogPermissionDetails, optional) — assign_catalog_permission_details of this ManageCatalogPermissionDetails
- `revoke_catalog_permission_details` (RevokeCatalogPermissionDetails, optional) — revoke_catalog_permission_details of this ManageCatalogPermissionDetails
**Example:**
```json
{
  "assign_catalog_permission_details": "<AssignCatalogPermissionDetails>",
  "revoke_catalog_permission_details": "<RevokeCatalogPermissionDetails>"
}
```
---

**Return:** [Back to Catalog](#catalog) • [Top](#top)

#### `aidp catalog refresh`
<a id="catalog-refresh"></a>
Refresh a catalog in an AI Data Platform Workbench through a crawler.

**Usage:**

`aidp catalog refresh <AI-DATA-PLATFORM-ID> <CATALOG-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `catalog-key` (string, required) — The key of the catalog.

**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
---

**Return:** [Back to Catalog](#catalog) • [Top](#top)

#### `aidp catalog test-connection`
<a id="catalog-test-connection"></a>
Test the connection of an AI Data Platform Workbench to an external catalog.

**Usage:**

`aidp catalog test-connection <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `catalog-test-connection-details` (object, required) — Details for the AI Data Platform Workbench catalog to be tested for connection.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
**Request Body (`CatalogTestConnectionDetails`):**
- `key` (str, optional) — key of this CatalogTestConnectionDetails
- `source_type` (str, optional) — source_type of this CatalogTestConnectionDetails
- `connection_details` (CatalogConnectionDetails, optional) — connection_details of this CatalogTestConnectionDetails
**Example:**
```json
{
  "key": "<string>",
  "source_type": "<string>",
  "connection_details": "<CatalogConnectionDetails>"
}
```
---

**Return:** [Back to Catalog](#catalog) • [Top](#top)

#### `aidp catalog update`
<a id="catalog-update"></a>
Update the details of an AI Data Platform Workbench catalog with the given information.

**Usage:**

`aidp catalog update <AI-DATA-PLATFORM-ID> <CATALOG-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `catalog-key` (string, required) — The key of the catalog.

**Options:**
- `update-catalog-details` (object, required) — The information to be updated.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
**Request Body (`UpdateCatalogDetails`):**
- `display_name` (str, optional) — display_name of this UpdateCatalogDetails
- `description` (str, optional) — description of this UpdateCatalogDetails
- `connection_details` (UpdateConnectionDetails, optional) — connection_details of this UpdateCatalogDetails
- `properties` (dict(str, str), optional) — properties of this UpdateCatalogDetails
**Example:**
```json
{
  "display_name": "<string>",
  "description": "<string>",
  "connection_details": "<UpdateConnectionDetails>",
  "properties": "<dict(str, str)>"
}
```
---

**Return:** [Back to Catalog](#catalog) • [Top](#top)

## Cluster
Clusters, cluster logs, cluster libraries, and cluster permissions.
**Command Index:**
- [cluster create](#cluster-create)
- [cluster delete](#cluster-delete)
- [cluster download-logs](#cluster-download-logs)
- [cluster get](#cluster-get)
- [cluster get-default](#cluster-get-default)
- [cluster list](#cluster-list)
- [cluster list-libraries](#cluster-list-libraries)
- [cluster list-permissions](#cluster-list-permissions)
- [cluster manage-permission](#cluster-manage-permission)
- [cluster patch-library](#cluster-patch-library)
- [cluster restart](#cluster-restart)
- [cluster search-logs](#cluster-search-logs)
- [cluster start](#cluster-start)
- [cluster stop](#cluster-stop)
- [cluster summarize-metrics-data](#cluster-summarize-metrics-data)
- [cluster update](#cluster-update)
### Commands
#### `aidp cluster create`
<a id="cluster-create"></a>
Creates a new cluster with the provided details.

**Usage:**

`aidp cluster create <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `create-cluster-details` (object, required) — Details for the new cluster.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
**Request Body (`CreateClusterDetails`):**
- `type` (str, required) — **[Required]** type of this CreateClusterDetails
- `display_name` (str, required) — **[Required]** display_name of this CreateClusterDetails
- `description` (str, optional) — description of this CreateClusterDetails
- `driver_config` (DriverConfig, required) — **[Required]** driver_config of this CreateClusterDetails
- `node_type` (str, optional) — node_type of this CreateClusterDetails
**Example:**
```json
{
  "type": "<string>",
  "display_name": "<string>",
  "description": "<string>",
  "driver_config": "<DriverConfig>",
  "node_type": "<string>"
}
```
---

**Return:** [Back to Cluster](#cluster) • [Top](#top)

#### `aidp cluster delete`
<a id="cluster-delete"></a>
Deletes a cluster from a workspace.

**Usage:**

`aidp cluster delete <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <CLUSTER-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `cluster-key` (string, required) — Cluster key.

**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Cluster](#cluster) • [Top](#top)

#### `aidp cluster download-logs`
<a id="cluster-download-logs"></a>
Downloads logs within the specified cluster and time range.
Downloads logs within the specified cluster and time range. The logs can be filtered by severity (logLevel), type (logContentTypeContains), and other parameters such as execution context and thread identifiers.

**Usage:**

`aidp cluster download-logs <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <CLUSTER-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `cluster-key` (string, required) — Cluster key.

**Options:**
- `download-cluster-logs-details` (object, required) — Request payload containing the parameters for filtering cluster logs.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
**Request Body (`DownloadClusterLogsDetails`):**
- `time_begin` (datetime, required) — **[Required]** time_begin of this DownloadClusterLogsDetails
- `time_end` (datetime, required) — **[Required]** time_end of this DownloadClusterLogsDetails
- `log_content_type_contains` (str, required) — **[Required]** log_content_type_contains of this DownloadClusterLogsDetails
- `client_context` (str, optional) — client_context of this DownloadClusterLogsDetails
- `subject_contains` (str, optional) — subject_contains of this DownloadClusterLogsDetails
- `log_level` (str, optional) — log_level of this DownloadClusterLogsDetails
- `opc_request_id` (str, optional) — opc_request_id of this DownloadClusterLogsDetails
- `thread` (str, optional) — thread of this DownloadClusterLogsDetails
- `execution_context_id` (str, optional) — execution_context_id of this DownloadClusterLogsDetails
- `log_stream_type_contains` (str, optional) — log_stream_type_contains of this DownloadClusterLogsDetails
- `event_type` (str, optional) — event_type of this DownloadClusterLogsDetails
**Example:**
```json
{
  "time_begin": "<datetime>",
  "time_end": "<datetime>",
  "log_content_type_contains": "<string>",
  "client_context": "<string>",
  "subject_contains": "<string>"
}
```
---

**Return:** [Back to Cluster](#cluster) • [Top](#top)

#### `aidp cluster get`
<a id="cluster-get"></a>
Returns detailed information about a cluster.

**Usage:**

`aidp cluster get <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <CLUSTER-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `cluster-key` (string, required) — Cluster key.

**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---

**Return:** [Back to Cluster](#cluster) • [Top](#top)

#### `aidp cluster get-default`
<a id="cluster-get-default"></a>
Gets information about the master catalog default cluster.

**Usage:**

`aidp cluster get-default <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Cluster](#cluster) • [Top](#top)

#### `aidp cluster list`
<a id="cluster-list"></a>
Returns a list of all clusters in a given workspace.

**Usage:**

`aidp cluster list <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `state` (string, optional) — A filter to return only resources that match the given lifecycle state. The state value is case-insensitive. Allowed values are: "ACCEPTED", "CREATING", "ACTIVE", "DELETING", "DELETED", "FAILED", "STOPPING", "STOPPED", "UPDATING", "RESTARTING", "STARTING", "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS", "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL", "NETWORK_CONFIGURATION_ATTACH_FAILED", "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS", "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL", "NETWORK_CONFIGURATION_DETACH_FAILED" Allowed values: ACCEPTED, CREATING, ACTIVE, DELETING, DELETED, FAILED, STOPPING, STOPPED, UPDATING, RESTARTING, STARTING, NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS, NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL, NETWORK_CONFIGURATION_ATTACH_FAILED, NETWORK_CONFIGURATION_DETACH_IN_PROGRESS, NETWORK_CONFIGURATION_DETACH_SUCCESSFUL, NETWORK_CONFIGURATION_DETACH_FAILED
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `display-name-contains` (string, optional) — A filter to return only resources that have a display name containing the text provided.
- `type` (string, optional) — Cluster type. When the filter is not provided list shows all type of cluster - USER else it show only cluster of type chosen. Only clusters of type USER are attachable to a workspace notebook.
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC" Allowed values: ASC, DESC
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName" Allowed values: timeCreated, displayName
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Cluster](#cluster) • [Top](#top)

#### `aidp cluster list-libraries`
<a id="cluster-list-libraries"></a>
Gets a list of libraries installed on a cluster.

**Usage:**

`aidp cluster list-libraries <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <CLUSTER-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `cluster-key` (string, required) — Cluster key.

**Options:**
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC" Allowed values: ASC, DESC
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName" Allowed values: timeCreated, displayName
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Cluster](#cluster) • [Top](#top)

#### `aidp cluster list-permissions`
<a id="cluster-list-permissions"></a>
Return a list of permissions for a given cluster.

**Usage:**

`aidp cluster list-permissions <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <CLUSTER-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `cluster-key` (string, required) — Cluster key.

**Options:**
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC" Allowed values: ASC, DESC
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName" Allowed values: timeCreated, displayName
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Cluster](#cluster) • [Top](#top)

#### `aidp cluster manage-permission`
<a id="cluster-manage-permission"></a>
Updates the permissions for a given cluster.

**Usage:**

`aidp cluster manage-permission <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <CLUSTER-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `cluster-key` (string, required) — Cluster key.

**Options:**
- `manage-cluster-permission-details` (object, required) — The information to be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
**Request Body (`ManageClusterPermissionDetails`):**
- `assign_cluster_permission_details` (AssignClusterPermissionDetails, optional) — assign_cluster_permission_details of this ManageClusterPermissionDetails
- `revoke_cluster_permission_details` (RevokeClusterPermissionDetails, optional) — revoke_cluster_permission_details of this ManageClusterPermissionDetails
**Example:**
```json
{
  "assign_cluster_permission_details": "<AssignClusterPermissionDetails>",
  "revoke_cluster_permission_details": "<RevokeClusterPermissionDetails>"
}
```
---

**Return:** [Back to Cluster](#cluster) • [Top](#top)

#### `aidp cluster patch-library`
<a id="cluster-patch-library"></a>
Updates libraries of a cluster with the provided patches.

**Usage:**

`aidp cluster patch-library <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <CLUSTER-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `cluster-key` (string, required) — Cluster key.

**Options:**
- `patch-cluster-library-details` (object, required) — The information to be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
**Request Body (`PatchClusterLibraryDetails`):**
- `items` (list[ClusterLibraryDetails], required) — **[Required]** items of this PatchClusterLibraryDetails
**Example:**
```json
{
  "items": [
    "<ClusterLibraryDetails>"
  ]
}
```
---

**Return:** [Back to Cluster](#cluster) • [Top](#top)

#### `aidp cluster restart`
<a id="cluster-restart"></a>
Restarts a running cluster.

**Usage:**

`aidp cluster restart <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <CLUSTER-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `cluster-key` (string, required) — Cluster key.

**Options:**
- `restart-cluster-details` (object, required) — Details for restarting the cluster.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Cluster](#cluster) • [Top](#top)

#### `aidp cluster search-logs`
<a id="cluster-search-logs"></a>
Searches logs within the specified cluster and time range.
Searches logs within the specified cluster and time range. Supports pagination and filtering.

**Usage:**

`aidp cluster search-logs <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <CLUSTER-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `cluster-key` (string, required) — Cluster key.

**Options:**
- `search-cluster-logs-details` (object, required) — Request body containing the search parameters for cluster logs.
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
**Request Body (`SearchClusterLogsDetails`):**
- `time_begin` (datetime, required) — **[Required]** time_begin of this SearchClusterLogsDetails
- `time_end` (datetime, required) — **[Required]** time_end of this SearchClusterLogsDetails
- `log_content_type_contains` (str, required) — **[Required]** log_content_type_contains of this SearchClusterLogsDetails
- `subject_contains` (str, optional) — subject_contains of this SearchClusterLogsDetails
- `message_contains` (str, optional) — message_contains of this SearchClusterLogsDetails
- `log_level` (str, optional) — log_level of this SearchClusterLogsDetails
- `opc_request_id` (str, optional) — opc_request_id of this SearchClusterLogsDetails
- `advanced_filter` (str, optional) — advanced_filter of this SearchClusterLogsDetails
- `thread` (str, optional) — thread of this SearchClusterLogsDetails
- `execution_context_id` (str, optional) — execution_context_id of this SearchClusterLogsDetails
- `log_stream_type_contains` (str, optional) — log_stream_type_contains of this SearchClusterLogsDetails
- `event_type` (str, optional) — event_type of this SearchClusterLogsDetails
**Example:**
```json
{
  "time_begin": "<datetime>",
  "time_end": "<datetime>",
  "log_content_type_contains": "<string>",
  "subject_contains": "<string>",
  "message_contains": "<string>"
}
```
---

**Return:** [Back to Cluster](#cluster) • [Top](#top)

#### `aidp cluster start`
<a id="cluster-start"></a>
Starts a cluster that has halted operation.

**Usage:**

`aidp cluster start <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <CLUSTER-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `cluster-key` (string, required) — Cluster key.

**Options:**
- `start-cluster-details` (object, required) — Details of the cluster being started.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Cluster](#cluster) • [Top](#top)

#### `aidp cluster stop`
<a id="cluster-stop"></a>
Stops an active cluster.

**Usage:**

`aidp cluster stop <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <CLUSTER-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `cluster-key` (string, required) — Cluster key.

**Options:**
- `stop-cluster-details` (object, required) — Details for stopping the cluster.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Cluster](#cluster) • [Top](#top)

#### `aidp cluster summarize-metrics-data`
<a id="cluster-summarize-metrics-data"></a>
Provides summarized compute metrics for a compute cluster in the given workspace.
Provides summarized compute metrics for a compute cluster in the given workspace. This API aggregates metric data points based on a specified namespace, metric name, and aggregation type. The response contains computed metric summaries.

**Usage:**

`aidp cluster summarize-metrics-data <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <CLUSTER-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `cluster-key` (string, required) — Cluster key.

**Options:**
- `summarize-metrics-data-details` (object, required) — Request body containing metric parameters.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
**Request Body (`SummarizeMetricsDataDetails`):**
- `aggregation_type` (str, required) — **[Required]** aggregation_type of this SummarizeMetricsDataDetails
- `metric_name` (str, required) — **[Required]** metric_name of this SummarizeMetricsDataDetails
- `time_begin` (datetime, required) — **[Required]** time_begin of this SummarizeMetricsDataDetails
- `time_end` (datetime, required) — **[Required]** time_end of this SummarizeMetricsDataDetails
- `interval` (str, required) — **[Required]** interval of this SummarizeMetricsDataDetails
- `resolution` (str, optional) — resolution of this SummarizeMetricsDataDetails
**Example:**
```json
{
  "aggregation_type": "<string>",
  "metric_name": "<string>",
  "time_begin": "<datetime>",
  "time_end": "<datetime>",
  "interval": "<string>"
}
```
---

**Return:** [Back to Cluster](#cluster) • [Top](#top)

#### `aidp cluster update`
<a id="cluster-update"></a>
Update the details of a given cluster.

**Usage:**

`aidp cluster update <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <CLUSTER-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `cluster-key` (string, required) — Cluster key.

**Options:**
- `update-cluster-details` (object, required) — The information to be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
**Request Body (`UpdateClusterDetails`):**
- `type` (str, required) — **[Required]** type of this UpdateClusterDetails
- `display_name` (str, optional) — display_name of this UpdateClusterDetails
- `description` (str, optional) — description of this UpdateClusterDetails
- `driver_config` (DriverConfig, optional) — driver_config of this UpdateClusterDetails
- `node_type` (str, optional) — node_type of this UpdateClusterDetails
**Example:**
```json
{
  "type": "<string>",
  "display_name": "<string>",
  "description": "<string>",
  "driver_config": "<DriverConfig>",
  "node_type": "<string>"
}
```
---

**Return:** [Back to Cluster](#cluster) • [Top](#top)

## Credentials
Credentials.
**Command Index:**
- [credentials create](#credentials-create)
- [credentials delete](#credentials-delete)
- [credentials get](#credentials-get)
- [credentials list](#credentials-list)
- [credentials update](#credentials-update)
### Commands
#### `aidp credentials create`
<a id="credentials-create"></a>
Creates a new credential object with the provided details.
Creates a new credential object with the provided details. The operation completes synchronously; callers can invoke list or get to retrieve the resource payload.

**Usage:**

`aidp credentials create <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `create-data-lake-credential-details` (object, required) — Details for the new credential object. When the internal flag is enabled, callers must supply a namespace value of default or user_settings in the payload.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
**Request Body (`CreateDataLakeCredentialDetails`):**
- `display_name` (str, required) — **[Required]** display_name of this CreateDataLakeCredentialDetails
- `credential_description` (str, optional) — credential_description of this CreateDataLakeCredentialDetails
- `type` (str, required) — **[Required]** type of this CreateDataLakeCredentialDetails
- `credential_details` (CredentialDetails, required) — **[Required]** credential_details of this CreateDataLakeCredentialDetails
**Example:**
```json
{
  "display_name": "<string>",
  "credential_description": "<string>",
  "type": "<string>",
  "credential_details": "<CredentialDetails>"
}
```
---

**Return:** [Back to Credentials](#credentials) • [Top](#top)

#### `aidp credentials delete`
<a id="credentials-delete"></a>
Deletes a credential object.
Deletes a credential object. The operation completes synchronously without a response body.

**Usage:**

`aidp credentials delete <AI-DATA-PLATFORM-ID> <CREDENTIAL-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `credential-key` (string, required) — The unique identifier of an credential

**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---

**Return:** [Back to Credentials](#credentials) • [Top](#top)

#### `aidp credentials get`
<a id="credentials-get"></a>
Gets detailed information about credential with a given credential key.

**Usage:**

`aidp credentials get <AI-DATA-PLATFORM-ID> <CREDENTIAL-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `credential-key` (string, required) — The unique identifier of an credential

**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---

**Return:** [Back to Credentials](#credentials) • [Top](#top)

#### `aidp credentials list`
<a id="credentials-list"></a>
Returns a list of credentials.

**Usage:**

`aidp credentials list <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `display-name-contains` (string, optional) — A filter to return only resources whose displayName contains the provided value (case-insensitive).
- `lifecycle-state` (string, optional) — A filter to return only resources whose lifecycleState matches the provided value.
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC" Allowed values: ASC, DESC
- `sort-by` (string, optional) — The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "name" Allowed values: timeCreated, name
- `credential-type` (string, optional) — The type of the Credential Allowed values are: "SECRET_TOKEN", "VAULT_REFERENCE", "SERVICE_ACCOUNT" Allowed values: SECRET_TOKEN, VAULT_REFERENCE, SERVICE_ACCOUNT
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---

**Return:** [Back to Credentials](#credentials) • [Top](#top)

#### `aidp credentials update`
<a id="credentials-update"></a>
Updates a credential object.
Updates a credential object. The operation completes synchronously; callers can invoke get to confirm the latest state.

**Usage:**

`aidp credentials update <AI-DATA-PLATFORM-ID> <CREDENTIAL-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `credential-key` (string, required) — The unique identifier of an credential

**Options:**
- `update-data-lake-credential-details` (object, required) — The information to be updated.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
**Request Body (`UpdateDataLakeCredentialDetails`):**
- `display_name` (str, optional) — display_name of this UpdateDataLakeCredentialDetails
- `credential_description` (str, optional) — credential_description of this UpdateDataLakeCredentialDetails
- `type` (str, optional) — type of this UpdateDataLakeCredentialDetails
- `credential_details` (CredentialDetails, optional) — credential_details of this UpdateDataLakeCredentialDetails
**Example:**
```json
{
  "display_name": "<string>",
  "credential_description": "<string>",
  "type": "<string>",
  "credential_details": "<CredentialDetails>"
}
```
---

**Return:** [Back to Credentials](#credentials) • [Top](#top)

## Delta Share
Recipients, shares, recipient permissions, and share data assets.
**Command Index:**
- [delta-share create](#delta-share-create)
- [delta-share create-recipient](#delta-share-create-recipient)
- [delta-share delete](#delta-share-delete)
- [delta-share delete-recipient](#delta-share-delete-recipient)
- [delta-share get](#delta-share-get)
- [delta-share get-recipient](#delta-share-get-recipient)
- [delta-share list](#delta-share-list)
- [delta-share list-data-assets](#delta-share-list-data-assets)
- [delta-share list-permissions](#delta-share-list-permissions)
- [delta-share list-recipient-permissions](#delta-share-list-recipient-permissions)
- [delta-share list-recipient-shares](#delta-share-list-recipient-shares)
- [delta-share list-recipients](#delta-share-list-recipients)
- [delta-share list-share-recipients](#delta-share-list-share-recipients)
- [delta-share manage-access](#delta-share-manage-access)
- [delta-share manage-data-asset](#delta-share-manage-data-asset)
- [delta-share manage-permission](#delta-share-manage-permission)
- [delta-share manage-recipient-permission](#delta-share-manage-recipient-permission)
- [delta-share update](#delta-share-update)
- [delta-share update-recipient](#delta-share-update-recipient)
### Commands
#### `aidp delta-share create`
<a id="delta-share-create"></a>
Create a Delta Share protocol in AI Data Platform Workbench.

**Usage:**

`aidp delta-share create <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `create-share-details` (object, required) — Details for the new share for Delta Share protocol in AI Data Platform Workbench.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
**Request Body (`CreateShareDetails`):**
- `display_name` (str, required) — **[Required]** display_name of this CreateShareDetails
- `description` (str, optional) — description of this CreateShareDetails
**Example:**
```json
{
  "display_name": "<string>",
  "description": "<string>"
}
```
---

**Return:** [Back to Delta Share](#delta-share) • [Top](#top)

#### `aidp delta-share create-recipient`
<a id="delta-share-create-recipient"></a>
Creates a recipient for a Delta Share protocol in AI Data Platform Workbench.

**Usage:**

`aidp delta-share create-recipient <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `create-recipient-details` (object, required) — Details for the new recipient for Delta Share protocol in AI Data Platform Workbench.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
**Request Body (`CreateRecipientDetails`):**
- `display_name` (str, required) — **[Required]** display_name of this CreateRecipientDetails
- `description` (str, optional) — description of this CreateRecipientDetails
- `properties` (dict(str, str), optional) — properties of this CreateRecipientDetails
**Example:**
```json
{
  "display_name": "<string>",
  "description": "<string>",
  "properties": "<dict(str, str)>"
}
```
---

**Return:** [Back to Delta Share](#delta-share) • [Top](#top)

#### `aidp delta-share delete`
<a id="delta-share-delete"></a>
Deletes a Delta Share from an AI Data Platform Workbench.

**Usage:**

`aidp delta-share delete <AI-DATA-PLATFORM-ID> <SHARE-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `share-key` (string, required) — The unique key of the Share.

**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---

**Return:** [Back to Delta Share](#delta-share) • [Top](#top)

#### `aidp delta-share delete-recipient`
<a id="delta-share-delete-recipient"></a>
Deletes a Delta Share recipient from an AI Data Platform Workbench.

**Usage:**

`aidp delta-share delete-recipient <AI-DATA-PLATFORM-ID> <RECIPIENT-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `recipient-key` (string, required) — The key of the recipient resource

**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---

**Return:** [Back to Delta Share](#delta-share) • [Top](#top)

#### `aidp delta-share get`
<a id="delta-share-get"></a>
Gets detailed information about a Delta Share.

**Usage:**

`aidp delta-share get <AI-DATA-PLATFORM-ID> <SHARE-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `share-key` (string, required) — The unique key of the Share.

**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---

**Return:** [Back to Delta Share](#delta-share) • [Top](#top)

#### `aidp delta-share get-recipient`
<a id="delta-share-get-recipient"></a>
Gets detailed information about a Delta Share recipient in an AI Data Platform Workbench instance.

**Usage:**

`aidp delta-share get-recipient <AI-DATA-PLATFORM-ID> <RECIPIENT-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `recipient-key` (string, required) — The key of the recipient resource

**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---

**Return:** [Back to Delta Share](#delta-share) • [Top](#top)

#### `aidp delta-share list`
<a id="delta-share-list"></a>
Gets a list of Delta Shares in an AI Data Platform Workbench instance.

**Usage:**

`aidp delta-share list <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC" Allowed values: ASC, DESC
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName" Allowed values: timeCreated, displayName
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Delta Share](#delta-share) • [Top](#top)

#### `aidp delta-share list-data-assets`
<a id="delta-share-list-data-assets"></a>
Gets a list of Delta Shares assets in an AI Data Platform Workbench instance.

**Usage:**

`aidp delta-share list-data-assets <AI-DATA-PLATFORM-ID> <SHARE-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `share-key` (string, required) — The unique key of the Share.

**Options:**
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC" Allowed values: ASC, DESC
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName" Allowed values: timeCreated, displayName
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---

**Return:** [Back to Delta Share](#delta-share) • [Top](#top)

#### `aidp delta-share list-permissions`
<a id="delta-share-list-permissions"></a>
Returns a list of Delta Shares that the specified recipient has been granted access to.

**Usage:**

`aidp delta-share list-permissions <AI-DATA-PLATFORM-ID> <SHARE-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `share-key` (string, required) — The unique key of the Share.

**Options:**
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC" Allowed values: ASC, DESC
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for grantee is ascending. Default order for granteeType is ascending. Allowed values are: "grantee", "granteeType" Allowed values: grantee, granteeType
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---

**Return:** [Back to Delta Share](#delta-share) • [Top](#top)

#### `aidp delta-share list-recipient-permissions`
<a id="delta-share-list-recipient-permissions"></a>
Gets a detailed list of Delta Share recipient permissions.

**Usage:**

`aidp delta-share list-recipient-permissions <AI-DATA-PLATFORM-ID> <RECIPIENT-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `recipient-key` (string, required) — The key of the recipient resource

**Options:**
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC" Allowed values: ASC, DESC
- `sort-by` (string, optional) — The field to sort by. Default order for grantee is ascending. Allowed values are: "grantee" Allowed values: grantee
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---

**Return:** [Back to Delta Share](#delta-share) • [Top](#top)

#### `aidp delta-share list-recipient-shares`
<a id="delta-share-list-recipient-shares"></a>
Returns a list of Delta Shares that the specified recipient has been granted access to.

**Usage:**

`aidp delta-share list-recipient-shares <AI-DATA-PLATFORM-ID> <RECIPIENT-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `recipient-key` (string, required) — The key of the recipient resource

**Options:**
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC" Allowed values: ASC, DESC
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName" Allowed values: timeCreated, displayName
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---

**Return:** [Back to Delta Share](#delta-share) • [Top](#top)

#### `aidp delta-share list-recipients`
<a id="delta-share-list-recipients"></a>
Gets a list of Delta Share recipients in a AI Data Platform Workbench instance.

**Usage:**

`aidp delta-share list-recipients <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC" Allowed values: ASC, DESC
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName" Allowed values: timeCreated, displayName
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Delta Share](#delta-share) • [Top](#top)

#### `aidp delta-share list-share-recipients`
<a id="delta-share-list-share-recipients"></a>
Gets a list of recipients that have been given access on the specified Delta Share.

**Usage:**

`aidp delta-share list-share-recipients <AI-DATA-PLATFORM-ID> <SHARE-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `share-key` (string, required) — The unique key of the Share.

**Options:**
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC" Allowed values: ASC, DESC
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName" Allowed values: timeCreated, displayName
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---

**Return:** [Back to Delta Share](#delta-share) • [Top](#top)

#### `aidp delta-share manage-access`
<a id="delta-share-manage-access"></a>
Updates consumer-side access on a share for a recipient.
Updates consumer-side access on a share for a recipient. A provider user can grant or revoke access on a particular share for a given recipient.

**Usage:**

`aidp delta-share manage-access <AI-DATA-PLATFORM-ID> <SHARE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `share-key` (string, required) — The unique key of the Share.

**Options:**
- `manage-share-access-details` (object, required) — The information to be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
**Request Body (`ManageShareAccessDetails`):**
- `action` (str, required) — **[Required]** action of this ManageShareAccessDetails
- `recipient` (str, required) — **[Required]** recipient of this ManageShareAccessDetails
**Example:**
```json
{
  "action": "<string>",
  "recipient": "<string>"
}
```
---

**Return:** [Back to Delta Share](#delta-share) • [Top](#top)

#### `aidp delta-share manage-data-asset`
<a id="delta-share-manage-data-asset"></a>
Updates data assets on a Delta Share with the provided information.

**Usage:**

`aidp delta-share manage-data-asset <AI-DATA-PLATFORM-ID> <SHARE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `share-key` (string, required) — The unique key of the Share.

**Options:**
- `manage-share-data-asset-details` (object, required) — The Delta Share data asset information to be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
**Request Body (`ManageShareDataAssetDetails`):**
- `action` (str, required) — **[Required]** action of this ManageShareDataAssetDetails
- `type` (str, required) — **[Required]** type of this ManageShareDataAssetDetails
- `name` (str, required) — **[Required]** name of this ManageShareDataAssetDetails
- `description` (str, optional) — description of this ManageShareDataAssetDetails
- `partition` (str, optional) — partition of this ManageShareDataAssetDetails
- `alias` (str, optional) — alias of this ManageShareDataAssetDetails
**Example:**
```json
{
  "action": "<string>",
  "type": "<string>",
  "name": "<string>",
  "description": "<string>",
  "partition": "<string>"
}
```
---

**Return:** [Back to Delta Share](#delta-share) • [Top](#top)

#### `aidp delta-share manage-permission`
<a id="delta-share-manage-permission"></a>
Updates permissions on a Delta Share.

**Usage:**

`aidp delta-share manage-permission <AI-DATA-PLATFORM-ID> <SHARE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `share-key` (string, required) — The unique key of the Share.

**Options:**
- `manage-share-permission-details` (object, required) — The information to be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
**Request Body (`ManageSharePermissionDetails`):**
- `assign_share_permission_details` (AssignSharePermissionDetails, optional) — assign_share_permission_details of this ManageSharePermissionDetails
- `revoke_share_permission_details` (RevokeSharePermissionDetails, optional) — revoke_share_permission_details of this ManageSharePermissionDetails
**Example:**
```json
{
  "assign_share_permission_details": "<AssignSharePermissionDetails>",
  "revoke_share_permission_details": "<RevokeSharePermissionDetails>"
}
```
---

**Return:** [Back to Delta Share](#delta-share) • [Top](#top)

#### `aidp delta-share manage-recipient-permission`
<a id="delta-share-manage-recipient-permission"></a>
Updates the permissions of a Delta Share recipient in AI Data Platform Workbench.

**Usage:**

`aidp delta-share manage-recipient-permission <AI-DATA-PLATFORM-ID> <RECIPIENT-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `recipient-key` (string, required) — The key of the recipient resource

**Options:**
- `manage-recipient-permission-details` (object, required) — The information to be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
**Request Body (`ManageRecipientPermissionDetails`):**
- `assign_recipient_permission_details` (AssignRecipientPermissionDetails, optional) — assign_recipient_permission_details of this ManageRecipientPermissionDetails
- `revoke_recipient_permission_details` (RevokeRecipientPermissionDetails, optional) — revoke_recipient_permission_details of this ManageRecipientPermissionDetails
**Example:**
```json
{
  "assign_recipient_permission_details": "<AssignRecipientPermissionDetails>",
  "revoke_recipient_permission_details": "<RevokeRecipientPermissionDetails>"
}
```
---

**Return:** [Back to Delta Share](#delta-share) • [Top](#top)

#### `aidp delta-share update`
<a id="delta-share-update"></a>
Update a Delta Share with the provided metadata.

**Usage:**

`aidp delta-share update <AI-DATA-PLATFORM-ID> <SHARE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `share-key` (string, required) — The unique key of the Share.

**Options:**
- `update-share-details` (object, required) — The information to be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
**Request Body (`UpdateShareDetails`):**
- `display_name` (str, optional) — display_name of this UpdateShareDetails
- `description` (str, optional) — description of this UpdateShareDetails
**Example:**
```json
{
  "display_name": "<string>",
  "description": "<string>"
}
```
---

**Return:** [Back to Delta Share](#delta-share) • [Top](#top)

#### `aidp delta-share update-recipient`
<a id="delta-share-update-recipient"></a>
Updates the metadata of a Delta Share recipient in a AI Data Platform Workbench instance.

**Usage:**

`aidp delta-share update-recipient <AI-DATA-PLATFORM-ID> <RECIPIENT-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `recipient-key` (string, required) — The key of the recipient resource

**Options:**
- `update-recipient-details` (object, required) — The information to be updated for a recipient.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
**Request Body (`UpdateRecipientDetails`):**
- `display_name` (str, optional) — display_name of this UpdateRecipientDetails
- `description` (str, optional) — description of this UpdateRecipientDetails
- `properties` (dict(str, str), optional) — properties of this UpdateRecipientDetails
**Example:**
```json
{
  "display_name": "<string>",
  "description": "<string>",
  "properties": "<dict(str, str)>"
}
```
---

**Return:** [Back to Delta Share](#delta-share) • [Top](#top)

## Mlops
Experiments, experiment runs, registered models, and model versions.
**Command Index:**
- [mlops create-experiment](#mlops-create-experiment)
- [mlops create-experiment-run](#mlops-create-experiment-run)
- [mlops create-model-version](#mlops-create-model-version)
- [mlops create-registered-model](#mlops-create-registered-model)
- [mlops create-workspace-model-version](#mlops-create-workspace-model-version)
- [mlops delete-experiment](#mlops-delete-experiment)
- [mlops delete-experiment-run](#mlops-delete-experiment-run)
- [mlops delete-experiment-run-tag](#mlops-delete-experiment-run-tag)
- [mlops delete-experiment-tag](#mlops-delete-experiment-tag)
- [mlops delete-model-version](#mlops-delete-model-version)
- [mlops delete-model-version-tag](#mlops-delete-model-version-tag)
- [mlops delete-registered-model](#mlops-delete-registered-model)
- [mlops delete-registered-model-tag](#mlops-delete-registered-model-tag)
- [mlops get-experiment-by-id](#mlops-get-experiment-by-id)
- [mlops get-experiment-by-name](#mlops-get-experiment-by-name)
- [mlops get-experiment-run-by-id](#mlops-get-experiment-run-by-id)
- [mlops get-experiment-run-metric-history](#mlops-get-experiment-run-metric-history)
- [mlops get-model-version](#mlops-get-model-version)
- [mlops get-registered-model](#mlops-get-registered-model)
- [mlops list-artifacts](#mlops-list-artifacts)
- [mlops list-experiment-runs](#mlops-list-experiment-runs)
- [mlops list-experiments](#mlops-list-experiments)
- [mlops list-logged-models](#mlops-list-logged-models)
- [mlops list-model-versions](#mlops-list-model-versions)
- [mlops list-registered-models](#mlops-list-registered-models)
- [mlops log-experiment-run-batch](#mlops-log-experiment-run-batch)
- [mlops log-experiment-run-inputs](#mlops-log-experiment-run-inputs)
- [mlops log-experiment-run-metric](#mlops-log-experiment-run-metric)
- [mlops log-experiment-run-model](#mlops-log-experiment-run-model)
- [mlops log-experiment-run-param](#mlops-log-experiment-run-param)
- [mlops rename-registered-model](#mlops-rename-registered-model)
- [mlops restore-experiment](#mlops-restore-experiment)
- [mlops restore-experiment-run](#mlops-restore-experiment-run)
- [mlops set-experiment-run-tag](#mlops-set-experiment-run-tag)
- [mlops set-experiment-tag](#mlops-set-experiment-tag)
- [mlops set-model-version-tag](#mlops-set-model-version-tag)
- [mlops set-registered-model-tag](#mlops-set-registered-model-tag)
- [mlops transition-model-version-stage](#mlops-transition-model-version-stage)
- [mlops update-experiment](#mlops-update-experiment)
- [mlops update-experiment-run](#mlops-update-experiment-run)
- [mlops update-experiment-run-tags](#mlops-update-experiment-run-tags)
- [mlops update-experiment-tags](#mlops-update-experiment-tags)
- [mlops update-model-version](#mlops-update-model-version)
- [mlops update-model-version-tags](#mlops-update-model-version-tags)
- [mlops update-registered-model](#mlops-update-registered-model)
- [mlops update-registered-model-tags](#mlops-update-registered-model-tags)
### Commands
#### `aidp mlops create-experiment`
<a id="mlops-create-experiment"></a>
(Preview) Creates an experiment in a workspace.

**Usage:**

`aidp mlops create-experiment <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `create-experiment-details` (object, required) — Details for the new experiment.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
**Request Body (`CreateExperimentDetails`):**
- `name` (str, required) — **[Required]** name of this CreateExperimentDetails
- `artifact_location` (str, optional) — artifact_location of this CreateExperimentDetails
- `tags` (list[ExperimentTag], optional) — tags of this CreateExperimentDetails
**Example:**
```json
{
  "name": "<string>",
  "artifact_location": "<string>",
  "tags": [
    "<ExperimentTag>"
  ]
}
```
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops create-experiment-run`
<a id="mlops-create-experiment-run"></a>
(Preview) Creates a new run within an experiment.

**Usage:**

`aidp mlops create-experiment-run <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `create-experiment-run-details` (object, required) — Details for the new run.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
**Request Body (`CreateExperimentRunDetails`):**
- `run_name` (str, optional) — run_name of this CreateExperimentRunDetails
- `experiment_id` (str, optional) — experiment_id of this CreateExperimentRunDetails
- `start_time` (int, optional) — start_time of this CreateExperimentRunDetails
- `tags` (list[ExperimentRunTag], optional) — tags of this CreateExperimentRunDetails
**Example:**
```json
{
  "run_name": "<string>",
  "experiment_id": "<string>",
  "start_time": 123,
  "tags": [
    "<ExperimentRunTag>"
  ]
}
```
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops create-model-version`
<a id="mlops-create-model-version"></a>
(Preview) Creates a model version.

**Usage:**

`aidp mlops create-model-version <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `create-model-version-details` (object, required) — Details for the new model version.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
**Request Body (`CreateModelVersionDetails`):**
- `name` (str, required) — **[Required]** name of this CreateModelVersionDetails
- `description` (str, optional) — description of this CreateModelVersionDetails
- `source` (str, required) — **[Required]** source of this CreateModelVersionDetails
- `run_id` (str, optional) — run_id of this CreateModelVersionDetails
- `tags` (list[ModelVersionTag], optional) — tags of this CreateModelVersionDetails
- `run_link` (str, optional) — run_link of this CreateModelVersionDetails
- `model_id` (str, optional) — model_id of this CreateModelVersionDetails
**Example:**
```json
{
  "name": "<string>",
  "description": "<string>",
  "source": "<string>",
  "run_id": "<string>",
  "tags": [
    "<ModelVersionTag>"
  ]
}
```
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops create-registered-model`
<a id="mlops-create-registered-model"></a>
(Preview) Creates a registered model in a workspace.

**Usage:**

`aidp mlops create-registered-model <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `create-registered-model-details` (object, required) — Details for the new registered model.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
**Request Body (`CreateRegisteredModelDetails`):**
- `name` (str, required) — **[Required]** name of this CreateRegisteredModelDetails
- `tags` (list[RegisteredModelTag], optional) — tags of this CreateRegisteredModelDetails
- `description` (str, optional) — description of this CreateRegisteredModelDetails
- `deployment_job_id` (str, optional) — deployment_job_id of this CreateRegisteredModelDetails
**Example:**
```json
{
  "name": "<string>",
  "tags": [
    "<RegisteredModelTag>"
  ],
  "description": "<string>",
  "deployment_job_id": "<string>"
}
```
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops create-workspace-model-version`
<a id="mlops-create-workspace-model-version"></a>
(Preview) Creates a new model version in a specified workspace.

**Usage:**

`aidp mlops create-workspace-model-version <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `create-model-version-details` (object, required) — Details for the new model version.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
**Request Body (`CreateModelVersionDetails`):**
- `name` (str, required) — **[Required]** name of this CreateModelVersionDetails
- `description` (str, optional) — description of this CreateModelVersionDetails
- `source` (str, required) — **[Required]** source of this CreateModelVersionDetails
- `run_id` (str, optional) — run_id of this CreateModelVersionDetails
- `tags` (list[ModelVersionTag], optional) — tags of this CreateModelVersionDetails
- `run_link` (str, optional) — run_link of this CreateModelVersionDetails
- `model_id` (str, optional) — model_id of this CreateModelVersionDetails
**Example:**
```json
{
  "name": "<string>",
  "description": "<string>",
  "source": "<string>",
  "run_id": "<string>",
  "tags": [
    "<ModelVersionTag>"
  ]
}
```
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops delete-experiment`
<a id="mlops-delete-experiment"></a>
(Preview) Deletes an experiment.

**Usage:**

`aidp mlops delete-experiment <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `delete-experiment-details` (object, required) — Details of the experiment.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
**Request Body (`DeleteExperimentDetails`):**
- `experiment_id` (str, required) — **[Required]** experiment_id of this DeleteExperimentDetails
**Example:**
```json
{
  "experiment_id": "<string>"
}
```
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops delete-experiment-run`
<a id="mlops-delete-experiment-run"></a>
(Preview) Deletes an experiment run.

**Usage:**

`aidp mlops delete-experiment-run <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `delete-experiment-run-details` (object, required) — Details of the Experiment Run.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
**Request Body (`DeleteExperimentRunDetails`):**
- `run_id` (str, required) — **[Required]** run_id of this DeleteExperimentRunDetails
**Example:**
```json
{
  "run_id": "<string>"
}
```
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops delete-experiment-run-tag`
<a id="mlops-delete-experiment-run-tag"></a>
(Preview) Deletes a tag on an experiment run.

**Usage:**

`aidp mlops delete-experiment-run-tag <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `delete-experiment-run-tag-details` (object, required) — Tag details to delete on an experiment run.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
**Request Body (`DeleteExperimentRunTagDetails`):**
- `run_id` (str, required) — **[Required]** run_id of this DeleteExperimentRunTagDetails
- `key` (str, required) — **[Required]** key of this DeleteExperimentRunTagDetails
**Example:**
```json
{
  "run_id": "<string>",
  "key": "<string>"
}
```
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops delete-experiment-tag`
<a id="mlops-delete-experiment-tag"></a>
(Preview) Deletes a tag on an experiment.

**Usage:**

`aidp mlops delete-experiment-tag <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `delete-experiment-tag-details` (object, required) — Tag details to delete on an experiment.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
**Request Body (`DeleteExperimentTagDetails`):**
- `experiment_id` (str, required) — **[Required]** experiment_id of this DeleteExperimentTagDetails
- `key` (str, required) — **[Required]** key of this DeleteExperimentTagDetails
**Example:**
```json
{
  "experiment_id": "<string>",
  "key": "<string>"
}
```
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops delete-model-version`
<a id="mlops-delete-model-version"></a>
(Preview) Deletes a model version.

**Usage:**

`aidp mlops delete-model-version <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `delete-model-version-details` (object, required) — Details of the model version to delete.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
**Request Body (`DeleteModelVersionDetails`):**
- `name` (str, required) — **[Required]** name of this DeleteModelVersionDetails
- `version` (str, required) — **[Required]** version of this DeleteModelVersionDetails
**Example:**
```json
{
  "name": "<string>",
  "version": "<string>"
}
```
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops delete-model-version-tag`
<a id="mlops-delete-model-version-tag"></a>
(Preview) Deletes a tag on a model version.

**Usage:**

`aidp mlops delete-model-version-tag <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `delete-model-version-tag-details` (object, required) — Details of a model version tag to delete.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
**Request Body (`DeleteModelVersionTagDetails`):**
- `name` (str, required) — **[Required]** name of this DeleteModelVersionTagDetails
- `version` (str, required) — **[Required]** version of this DeleteModelVersionTagDetails
- `key` (str, required) — **[Required]** key of this DeleteModelVersionTagDetails
**Example:**
```json
{
  "name": "<string>",
  "version": "<string>",
  "key": "<string>"
}
```
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops delete-registered-model`
<a id="mlops-delete-registered-model"></a>
(Preview) Deletes a registered model.

**Usage:**

`aidp mlops delete-registered-model <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `delete-registered-model-details` (object, required) — Details of the registered model to delete.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
**Request Body (`DeleteRegisteredModelDetails`):**
- `name` (str, required) — **[Required]** name of this DeleteRegisteredModelDetails
**Example:**
```json
{
  "name": "<string>"
}
```
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops delete-registered-model-tag`
<a id="mlops-delete-registered-model-tag"></a>
(Preview) Deletes a tag on a registered model.

**Usage:**

`aidp mlops delete-registered-model-tag <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `delete-registered-model-tag-details` (object, required) — Details of a registered model tag.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
**Request Body (`DeleteRegisteredModelTagDetails`):**
- `name` (str, required) — **[Required]** name of this DeleteRegisteredModelTagDetails
- `key` (str, required) — **[Required]** key of this DeleteRegisteredModelTagDetails
**Example:**
```json
{
  "name": "<string>",
  "key": "<string>"
}
```
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops get-experiment-by-id`
<a id="mlops-get-experiment-by-id"></a>
(Preview) Returns metadata for an experiment by ID.
(Preview) Returns metadata for an experiment by ID. This method works on deleted experiments.

**Usage:**

`aidp mlops get-experiment-by-id <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `experiment-id` (string, required) — The unique ID of the experiment to retrieve.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops get-experiment-by-name`
<a id="mlops-get-experiment-by-name"></a>
(Preview) Returns experiment metadata for a given name.
(Preview) Returns experiment metadata for a given name. Returns deleted experiments, but prefers the active experiment if an active and deleted experiment share the same name. If multiple deleted experiments share the same name, the API will return one of them.

**Usage:**

`aidp mlops get-experiment-by-name <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `experiment-name` (string, required) — The name of the experiment to retrieve.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops get-experiment-run-by-id`
<a id="mlops-get-experiment-run-by-id"></a>
(Preview) Returns details of an experiment run by ID.

**Usage:**

`aidp mlops get-experiment-run-by-id <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `run-id` (string, required) — ID of the run to fetch.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops get-experiment-run-metric-history`
<a id="mlops-get-experiment-run-metric-history"></a>
(Preview) Returns a history of experiment run metrics.

**Usage:**

`aidp mlops get-experiment-run-metric-history <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `run-id` (string, required) — ID of the run metric history to fetch.
- `metric-key` (string, required) — Name of the metric key.
- `page-token` (string, optional) — Pagination token to go to the next page of metric history.
- `max-results` (integer, optional) — Maximum number of logged instances of a metric for a run to return per call. Backend servers may restrict the value of max_results depending on performance requirements. Requests that do not specify this value will behave as non-paginated queries where all metric history values for a given metric within a run are returned in a single response.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops get-model-version`
<a id="mlops-get-model-version"></a>
(Preview) Returns detailed information for a model version.

**Usage:**

`aidp mlops get-model-version <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `name` (string, required) — Name of the model version.
- `version` (string, required) — Version number of the model version.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops get-registered-model`
<a id="mlops-get-registered-model"></a>
(Preview) Returns details for a specified registered model.

**Usage:**

`aidp mlops get-registered-model <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `name` (string, required) — Name of the registered model.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops list-artifacts`
<a id="mlops-list-artifacts"></a>
(Preview) Returns a list of artifacts.

**Usage:**

`aidp mlops list-artifacts <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `run-id` (string, required) — ID of the run whose artifacts to list.
- `path` (string, optional) — Filter artifacts matching this path (a relative path from the root artifact directory).
- `page-token` (string, optional) — Token indicating the page of artifact results to fetch.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops list-experiment-runs`
<a id="mlops-list-experiment-runs"></a>
(Preview) Returns a list of experiment runs in a workspace.

**Usage:**

`aidp mlops list-experiment-runs <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `list-experiment-runs-details` (object, required) — Details of experiment runs to fetch.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
**Request Body (`ListExperimentRunsDetails`):**
- `experiment_ids` (list[str], optional) — experiment_ids of this ListExperimentRunsDetails
- `max_results` (int, optional) — max_results of this ListExperimentRunsDetails
- `page_token` (str, optional) — page_token of this ListExperimentRunsDetails
- `filter` (str, optional) — filter of this ListExperimentRunsDetails
- `order_by` (list[str], optional) — order_by of this ListExperimentRunsDetails
- `run_view_type` (str, optional) — run_view_type of this ListExperimentRunsDetails
**Example:**
```json
{
  "experiment_ids": [
    "<string>"
  ],
  "max_results": 123,
  "page_token": "<string>",
  "filter": "<string>",
  "order_by": [
    "<string>"
  ]
}
```
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops list-experiments`
<a id="mlops-list-experiments"></a>
(Preview) Returns a list of experiments with the given details.

**Usage:**

`aidp mlops list-experiments <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `list-experiments-details` (object, required) — Details of experiments to fetch.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
**Request Body (`ListExperimentsDetails`):**
- `max_results` (int, optional) — max_results of this ListExperimentsDetails
- `page_token` (str, optional) — page_token of this ListExperimentsDetails
- `filter` (str, optional) — filter of this ListExperimentsDetails
- `order_by` (list[str], optional) — order_by of this ListExperimentsDetails
- `view_type` (str, optional) — view_type of this ListExperimentsDetails
**Example:**
```json
{
  "max_results": 123,
  "page_token": "<string>",
  "filter": "<string>",
  "order_by": [
    "<string>"
  ],
  "view_type": "<string>"
}
```
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops list-logged-models`
<a id="mlops-list-logged-models"></a>
(Preview) Returns a list of logged models.

**Usage:**

`aidp mlops list-logged-models <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `list-logged-models-details` (object, required) — Details of logged models to fetch.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
**Request Body (`ListLoggedModelsDetails`):**
- `experiment_ids` (list[str], optional) — experiment_ids of this ListLoggedModelsDetails
- `max_results` (int, optional) — max_results of this ListLoggedModelsDetails
- `page_token` (str, optional) — page_token of this ListLoggedModelsDetails
- `filter` (str, optional) — filter of this ListLoggedModelsDetails
- `order_by` (list[LoggedModelOrder], optional) — order_by of this ListLoggedModelsDetails
**Example:**
```json
{
  "experiment_ids": [
    "<string>"
  ],
  "max_results": 123,
  "page_token": "<string>",
  "filter": "<string>",
  "order_by": [
    "<LoggedModelOrder>"
  ]
}
```
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops list-model-versions`
<a id="mlops-list-model-versions"></a>
(Preview) Returns a list of model versions.

**Usage:**

`aidp mlops list-model-versions <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `filter` (string, optional) — String filter condition, like "name LIKE 'my-model-name'". Single boolean condition, with string values wrapped in single quotes.
- `max-results` (integer, optional) — Maximum number of model versions to retrieve.
- `page-token` (string, optional) — Pagination token to go to the next page based on a previous search query.
- `order-by` (string, optional) — List of columns to be ordered by including model name, version, stage with an optional "DESC" or "ASC" annotation, where "ASC" is the default. Tiebreaks are done by latest stage transition timestamp, followed by name ASC, followed by version DESC.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops list-registered-models`
<a id="mlops-list-registered-models"></a>
(Preview) Returns a list of registered models in a workspace.

**Usage:**

`aidp mlops list-registered-models <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `filter` (string, optional) — String filter condition, like "name LIKE 'my-model-name'". Interpreted in the backend automatically as "name LIKE '%my-model-name%'". Single boolean condition, with string values wrapped in single quotes.
- `max-results` (integer, optional) — Maximum number of models desired. Default is 100. Max threshold is 1000.
- `page-token` (string, optional) — Pagination token to go to the next page based on a previous search query.
- `order-by` (string, optional) — List of columns for ordering search results, which can include model name and last updated timestamp with an optional "DESC" or "ASC" annotation, where "ASC" is the default. Tiebreaks are done by model name ASC.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops log-experiment-run-batch`
<a id="mlops-log-experiment-run-batch"></a>
(Preview) Logs an experiment run batch.

**Usage:**

`aidp mlops log-experiment-run-batch <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `log-experiment-run-batch-details` (object, required) — Details of an experiment run batch.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
**Request Body (`LogExperimentRunBatchDetails`):**
- `run_id` (str, required) — **[Required]** run_id of this LogExperimentRunBatchDetails
- `metrics` (list[ExperimentRunMetric], optional) — metrics of this LogExperimentRunBatchDetails
- `params` (list[ExperimentRunParam], optional) — params of this LogExperimentRunBatchDetails
- `tags` (list[ExperimentRunTag], optional) — tags of this LogExperimentRunBatchDetails
**Example:**
```json
{
  "run_id": "<string>",
  "metrics": [
    "<ExperimentRunMetric>"
  ],
  "params": [
    "<ExperimentRunParam>"
  ],
  "tags": [
    "<ExperimentRunTag>"
  ]
}
```
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops log-experiment-run-inputs`
<a id="mlops-log-experiment-run-inputs"></a>
(Preview) Logs experiment run inputs.

**Usage:**

`aidp mlops log-experiment-run-inputs <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `log-experiment-run-inputs-details` (object, required) — Details of experiment run inputs.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
**Request Body (`LogExperimentRunInputsDetails`):**
- `run_id` (str, required) — **[Required]** run_id of this LogExperimentRunInputsDetails
- `dataset_inputs` (list[DatasetInput], optional) — dataset_inputs of this LogExperimentRunInputsDetails
**Example:**
```json
{
  "run_id": "<string>",
  "dataset_inputs": [
    "<DatasetInput>"
  ]
}
```
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops log-experiment-run-metric`
<a id="mlops-log-experiment-run-metric"></a>
(Preview) Logs an experiment run metric.

**Usage:**

`aidp mlops log-experiment-run-metric <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `log-experiment-run-metric-details` (object, required) — Details of an experiment run metric.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
**Request Body (`LogExperimentRunMetricDetails`):**
- `run_id` (str, required) — **[Required]** run_id of this LogExperimentRunMetricDetails
- `key` (str, required) — **[Required]** key of this LogExperimentRunMetricDetails
- `value` (float, required) — **[Required]** value of this LogExperimentRunMetricDetails
- `timestamp` (int, required) — **[Required]** timestamp of this LogExperimentRunMetricDetails
- `step` (int, optional) — step of this LogExperimentRunMetricDetails
**Example:**
```json
{
  "run_id": "<string>",
  "key": "<string>",
  "value": 1.23,
  "timestamp": 123,
  "step": 123
}
```
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops log-experiment-run-model`
<a id="mlops-log-experiment-run-model"></a>
(Preview) Logs an experiment run model.

**Usage:**

`aidp mlops log-experiment-run-model <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `log-experiment-run-model-details` (object, required) — Details of an experiment run model.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
**Request Body (`LogExperimentRunModelDetails`):**
- `run_id` (str, required) — **[Required]** run_id of this LogExperimentRunModelDetails
- `model_json` (str, required) — **[Required]** model_json of this LogExperimentRunModelDetails
**Example:**
```json
{
  "run_id": "<string>",
  "model_json": "<string>"
}
```
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops log-experiment-run-param`
<a id="mlops-log-experiment-run-param"></a>
(Preview) Logs an experiment run parameter.

**Usage:**

`aidp mlops log-experiment-run-param <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `log-experiment-run-param-details` (object, required) — Details of an experiment run parameter.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
**Request Body (`LogExperimentRunParamDetails`):**
- `run_id` (str, required) — **[Required]** run_id of this LogExperimentRunParamDetails
- `key` (str, required) — **[Required]** key of this LogExperimentRunParamDetails
- `value` (str, required) — **[Required]** value of this LogExperimentRunParamDetails
**Example:**
```json
{
  "run_id": "<string>",
  "key": "<string>",
  "value": "<string>"
}
```
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops rename-registered-model`
<a id="mlops-rename-registered-model"></a>
(Preview) Renames a registered model.

**Usage:**

`aidp mlops rename-registered-model <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `rename-registered-model-details` (object, required) — Details of a registered model rename.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
**Request Body (`RenameRegisteredModelDetails`):**
- `name` (str, required) — **[Required]** name of this RenameRegisteredModelDetails
- `new_name` (str, optional) — new_name of this RenameRegisteredModelDetails
**Example:**
```json
{
  "name": "<string>",
  "new_name": "<string>"
}
```
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops restore-experiment`
<a id="mlops-restore-experiment"></a>
(Preview) Restores an experiment.

**Usage:**

`aidp mlops restore-experiment <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `restore-experiment-details` (object, required) — Restore experiment details.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
**Request Body (`RestoreExperimentDetails`):**
- `experiment_id` (str, required) — **[Required]** experiment_id of this RestoreExperimentDetails
**Example:**
```json
{
  "experiment_id": "<string>"
}
```
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops restore-experiment-run`
<a id="mlops-restore-experiment-run"></a>
(Preview) Restores an experiment run.

**Usage:**

`aidp mlops restore-experiment-run <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `restore-experiment-run-details` (object, required) — Restore experiment run details.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
**Request Body (`RestoreExperimentRunDetails`):**
- `run_id` (str, required) — **[Required]** run_id of this RestoreExperimentRunDetails
**Example:**
```json
{
  "run_id": "<string>"
}
```
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops set-experiment-run-tag`
<a id="mlops-set-experiment-run-tag"></a>
(Preview) Sets a tag on an experiment run.

**Usage:**

`aidp mlops set-experiment-run-tag <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `set-experiment-run-tag-details` (object, required) — Tag details to set on an experiment run.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
**Request Body (`SetExperimentRunTagDetails`):**
- `run_id` (str, required) — **[Required]** run_id of this SetExperimentRunTagDetails
- `key` (str, required) — **[Required]** key of this SetExperimentRunTagDetails
- `value` (str, required) — **[Required]** value of this SetExperimentRunTagDetails
**Example:**
```json
{
  "run_id": "<string>",
  "key": "<string>",
  "value": "<string>"
}
```
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops set-experiment-tag`
<a id="mlops-set-experiment-tag"></a>
(Preview) Sets a tag on an experiment.

**Usage:**

`aidp mlops set-experiment-tag <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `set-experiment-tag-details` (object, required) — Tag details to set on an experiment.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
**Request Body (`SetExperimentTagDetails`):**
- `experiment_id` (str, required) — **[Required]** experiment_id of this SetExperimentTagDetails
- `key` (str, required) — **[Required]** key of this SetExperimentTagDetails
- `value` (str, required) — **[Required]** value of this SetExperimentTagDetails
**Example:**
```json
{
  "experiment_id": "<string>",
  "key": "<string>",
  "value": "<string>"
}
```
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops set-model-version-tag`
<a id="mlops-set-model-version-tag"></a>
(Preview) Sets a tag on a model version.

**Usage:**

`aidp mlops set-model-version-tag <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `set-model-version-tag-details` (object, required) — Details of a model version tag.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
**Request Body (`SetModelVersionTagDetails`):**
- `name` (str, required) — **[Required]** name of this SetModelVersionTagDetails
- `version` (str, required) — **[Required]** version of this SetModelVersionTagDetails
- `key` (str, required) — **[Required]** key of this SetModelVersionTagDetails
- `value` (str, required) — **[Required]** value of this SetModelVersionTagDetails
**Example:**
```json
{
  "name": "<string>",
  "version": "<string>",
  "key": "<string>",
  "value": "<string>"
}
```
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops set-registered-model-tag`
<a id="mlops-set-registered-model-tag"></a>
(Preview) Sets a tag on a registered model.

**Usage:**

`aidp mlops set-registered-model-tag <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `set-registered-model-tag-details` (object, required) — Details of a registered model tag.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
**Request Body (`SetRegisteredModelTagDetails`):**
- `name` (str, required) — **[Required]** name of this SetRegisteredModelTagDetails
- `key` (str, required) — **[Required]** key of this SetRegisteredModelTagDetails
- `value` (str, required) — **[Required]** value of this SetRegisteredModelTagDetails
**Example:**
```json
{
  "name": "<string>",
  "key": "<string>",
  "value": "<string>"
}
```
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops transition-model-version-stage`
<a id="mlops-transition-model-version-stage"></a>
(Preview) Transitions a model version stage.

**Usage:**

`aidp mlops transition-model-version-stage <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `transition-model-version-stage-details` (object, required) — Details to transition a model version stage.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
**Request Body (`TransitionModelVersionStageDetails`):**
- `name` (str, required) — **[Required]** name of this TransitionModelVersionStageDetails
- `version` (str, required) — **[Required]** version of this TransitionModelVersionStageDetails
- `stage` (str, required) — **[Required]** stage of this TransitionModelVersionStageDetails
- `archive_existing_versions` (bool, required) — **[Required]** archive_existing_versions of this TransitionModelVersionStageDetails
**Example:**
```json
{
  "name": "<string>",
  "version": "<string>",
  "stage": "<string>",
  "archive_existing_versions": true
}
```
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops update-experiment`
<a id="mlops-update-experiment"></a>
(Preview) Updates an experiment.

**Usage:**

`aidp mlops update-experiment <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `update-experiment-details` (object, required) — Update experiment metadata.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
**Request Body (`UpdateExperimentDetails`):**
- `experiment_id` (str, required) — **[Required]** experiment_id of this UpdateExperimentDetails
- `new_name` (str, optional) — new_name of this UpdateExperimentDetails
**Example:**
```json
{
  "experiment_id": "<string>",
  "new_name": "<string>"
}
```
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops update-experiment-run`
<a id="mlops-update-experiment-run"></a>
(Preview) Updates an experiment run.

**Usage:**

`aidp mlops update-experiment-run <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `update-experiment-run-details` (object, required) — Update experiment run details.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
**Request Body (`UpdateExperimentRunDetails`):**
- `run_id` (str, required) — **[Required]** run_id of this UpdateExperimentRunDetails
- `status` (str, optional) — status of this UpdateExperimentRunDetails
- `end_time` (int, optional) — end_time of this UpdateExperimentRunDetails
- `run_name` (str, optional) — run_name of this UpdateExperimentRunDetails
**Example:**
```json
{
  "run_id": "<string>",
  "status": "<string>",
  "end_time": 123,
  "run_name": "<string>"
}
```
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops update-experiment-run-tags`
<a id="mlops-update-experiment-run-tags"></a>
(Preview) Updates tags on an experiment run.

**Usage:**

`aidp mlops update-experiment-run-tags <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `update-experiment-run-tags-details` (object, required) — Details of ExperimentRun tags.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
**Request Body (`UpdateExperimentRunTagsDetails`):**
- `run_id` (str, required) — **[Required]** run_id of this UpdateExperimentRunTagsDetails
- `set_tags` (list[ExperimentRunTag], optional) — set_tags of this UpdateExperimentRunTagsDetails
- `delete_tags` (list[ExperimentRunTagKey], optional) — delete_tags of this UpdateExperimentRunTagsDetails
**Example:**
```json
{
  "run_id": "<string>",
  "set_tags": [
    "<ExperimentRunTag>"
  ],
  "delete_tags": [
    "<ExperimentRunTagKey>"
  ]
}
```
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops update-experiment-tags`
<a id="mlops-update-experiment-tags"></a>
(Preview) Updates tags on experiment.

**Usage:**

`aidp mlops update-experiment-tags <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `update-experiment-tags-details` (object, required) — Details of Experiment tags.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
**Request Body (`UpdateExperimentTagsDetails`):**
- `experiment_id` (str, required) — **[Required]** experiment_id of this UpdateExperimentTagsDetails
- `set_tags` (list[ExperimentTag], optional) — set_tags of this UpdateExperimentTagsDetails
- `delete_tags` (list[ExperimentTagKey], optional) — delete_tags of this UpdateExperimentTagsDetails
**Example:**
```json
{
  "experiment_id": "<string>",
  "set_tags": [
    "<ExperimentTag>"
  ],
  "delete_tags": [
    "<ExperimentTagKey>"
  ]
}
```
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops update-model-version`
<a id="mlops-update-model-version"></a>
(Preview) Updates a model version.
(Preview) Updates a model version

**Usage:**

`aidp mlops update-model-version <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `update-model-version-details` (object, required) — Details to update model version.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
**Request Body (`UpdateModelVersionDetails`):**
- `name` (str, required) — **[Required]** name of this UpdateModelVersionDetails
- `version` (str, required) — **[Required]** version of this UpdateModelVersionDetails
- `description` (str, optional) — description of this UpdateModelVersionDetails
**Example:**
```json
{
  "name": "<string>",
  "version": "<string>",
  "description": "<string>"
}
```
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops update-model-version-tags`
<a id="mlops-update-model-version-tags"></a>
(Preview) Updates tags on a model version.

**Usage:**

`aidp mlops update-model-version-tags <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `update-model-version-tags-details` (object, required) — Details of model version tags to update.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
**Request Body (`UpdateModelVersionTagsDetails`):**
- `name` (str, required) — **[Required]** name of this UpdateModelVersionTagsDetails
- `version` (str, required) — **[Required]** version of this UpdateModelVersionTagsDetails
- `set_tags` (list[ModelVersionTag], optional) — set_tags of this UpdateModelVersionTagsDetails
- `delete_tags` (list[ModelVersionTagKey], optional) — delete_tags of this UpdateModelVersionTagsDetails
**Example:**
```json
{
  "name": "<string>",
  "version": "<string>",
  "set_tags": [
    "<ModelVersionTag>"
  ],
  "delete_tags": [
    "<ModelVersionTagKey>"
  ]
}
```
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops update-registered-model`
<a id="mlops-update-registered-model"></a>
(Preview) Updates a registered model with the provided details.

**Usage:**

`aidp mlops update-registered-model <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `update-registered-model-details` (object, required) — Details to update the registered model.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
**Request Body (`UpdateRegisteredModelDetails`):**
- `name` (str, required) — **[Required]** name of this UpdateRegisteredModelDetails
- `description` (str, optional) — description of this UpdateRegisteredModelDetails
- `deployment_job_id` (str, optional) — deployment_job_id of this UpdateRegisteredModelDetails
**Example:**
```json
{
  "name": "<string>",
  "description": "<string>",
  "deployment_job_id": "<string>"
}
```
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops update-registered-model-tags`
<a id="mlops-update-registered-model-tags"></a>
(Preview) Updates tags on a registered model.

**Usage:**

`aidp mlops update-registered-model-tags <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `update-registered-model-tags-details` (object, required) — Details of registered model tags.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
**Request Body (`UpdateRegisteredModelTagsDetails`):**
- `name` (str, required) — **[Required]** name of this UpdateRegisteredModelTagsDetails
- `set_tags` (list[RegisteredModelTag], optional) — set_tags of this UpdateRegisteredModelTagsDetails
- `delete_tags` (list[RegisteredModelTagKey], optional) — delete_tags of this UpdateRegisteredModelTagsDetails
**Example:**
```json
{
  "name": "<string>",
  "set_tags": [
    "<RegisteredModelTag>"
  ],
  "delete_tags": [
    "<RegisteredModelTagKey>"
  ]
}
```
---

**Return:** [Back to Mlops](#mlops) • [Top](#top)

## Notebook
Content and sessions.
**Command Index:**
- [notebook create-content](#notebook-create-content)
- [notebook create-session](#notebook-create-session)
- [notebook delete-content](#notebook-delete-content)
- [notebook delete-session](#notebook-delete-session)
- [notebook export-contents](#notebook-export-contents)
- [notebook get-content](#notebook-get-content)
- [notebook get-session](#notebook-get-session)
- [notebook list-sessions](#notebook-list-sessions)
- [notebook modify-content](#notebook-modify-content)
- [notebook patch-session](#notebook-patch-session)
- [notebook update-content](#notebook-update-content)
### Commands
#### `aidp notebook create-content`
<a id="notebook-create-content"></a>
Creates a new, untitled, empty file or directory, or copies an existing notebook to a specified path.
Creates a new, untitled, empty file or directory, or copies an existing notebook to a specified path. For example, a POST call to /api/contents/path with body containing copy_from set to /path/to/OtherNotebook.ipynb creates a new copy of OtherNotebook at the specified path.

**Usage:**

`aidp notebook create-content <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <CONTENT-PATH> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `content-path` (string, required) — The path to the notebook file.

**Options:**
- `create-content-details` (object, required) — Notebook content to create a new notebook.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `datalake-tenant-id` (string, optional) — The tenant ID header.
**Request Body (`CreateContentDetails`):**
- `copy_from` (str, optional) — copy_from of this CreateContentDetails
- `ext` (str, optional) — ext of this CreateContentDetails
- `type` (str, optional) — type of this CreateContentDetails
**Example:**
```json
{
  "copy_from": "<string>",
  "ext": "<string>",
  "type": "<string>"
}
```
---

**Return:** [Back to Notebook](#notebook) • [Top](#top)

#### `aidp notebook create-session`
<a id="notebook-create-session"></a>
Creates a new session or returns an existing session if a session for the given path already exists.

**Usage:**

`aidp notebook create-session <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `create-session-details` (object, required) — Details to create a new session.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `datalake-tenant-id` (string, optional) — The tenant ID header.
**Request Body (`CreateSessionDetails`):**
- `id` (str, optional) — id of this CreateSessionDetails
- `path` (str, optional) — path of this CreateSessionDetails
- `name` (str, optional) — name of this CreateSessionDetails
- `type` (str, optional) — type of this CreateSessionDetails
- `cluster_id` (str, optional) — cluster_id of this CreateSessionDetails
- `agent_flow_key` (str, optional) — agent_flow_key of this CreateSessionDetails
- `kernel` (Kernel, optional) — kernel of this CreateSessionDetails
**Example:**
```json
{
  "id": "<string>",
  "path": "<string>",
  "name": "<string>",
  "type": "<string>",
  "cluster_id": "<string>"
}
```
---

**Return:** [Back to Notebook](#notebook) • [Top](#top)

#### `aidp notebook delete-content`
<a id="notebook-delete-content"></a>
Deletes a notebook file or directory.

**Usage:**

`aidp notebook delete-content <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <CONTENT-PATH>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `content-path` (string, required) — The path to the notebook file.

**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
---

**Return:** [Back to Notebook](#notebook) • [Top](#top)

#### `aidp notebook delete-session`
<a id="notebook-delete-session"></a>
Delete a session with given session ID.

**Usage:**

`aidp notebook delete-session <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <SESSION-ID>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `session-id` (string, required) — The ID of the Data Lake Notebook Session

**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
---

**Return:** [Back to Notebook](#notebook) • [Top](#top)

#### `aidp notebook export-contents`
<a id="notebook-export-contents"></a>
Exports the notebook file contents.
Exports the notebook file contents. You can optionally specify HTML or ipynb format through the request payload. If no format is specified, ipynb is used by default.

**Usage:**

`aidp notebook export-contents <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <CONTENT-PATH> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `content-path` (string, required) — The path to the notebook file.

**Options:**
- `export-contents-details` (object, required) — Payload to export contents of a file.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
**Request Body (`ExportContentsDetails`):**
- `format` (str, optional) — format of this ExportContentsDetails
**Example:**
```json
{
  "format": "<string>"
}
```
---

**Return:** [Back to Notebook](#notebook) • [Top](#top)

#### `aidp notebook get-content`
<a id="notebook-get-content"></a>
Returns a list of contents for a given file or directory.
Returns a list of contents for a given file or directory. You can optionally specify a type and/or format argument via URL parameter. When given, the Content service returns a model in the requested type and/or format. If the request cannot be satisfied, for example if type=text is requested, but the file is binary, then the request returns a 400 message and a JSON response with a Reason field identifying the issue. The value of the Reason field is ‘bad format’ or ‘bad type’, depending on what was requested.

**Usage:**

`aidp notebook get-content <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <CONTENT-PATH>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `content-path` (string, required) — The path to the notebook file.

**Options:**
- `type` (string, optional) — Content type. Either file, directory, or notebook. Allowed values are: "file", "directory", "notebook" Allowed values: file, directory, notebook
- `format` (string, optional) — The format in which content should be returned. Either text, base64, or JSON. Allowed values are: "text", "base64", "json" Allowed values: text, base64, json
- `content` (integer, optional) — Returns content based on param value. When set to 0, content is NOT returned. When set to 1, content is returned.
- `hash` (integer, optional) — Returns hash hexdigest string of content and the hash algorithm. 0 for no hash, 1 for return hash. 0 is default. It may be ignored by the content manager.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---

**Return:** [Back to Notebook](#notebook) • [Top](#top)

#### `aidp notebook get-session`
<a id="notebook-get-session"></a>
Returns session details for a given session ID.

**Usage:**

`aidp notebook get-session <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <SESSION-ID>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `session-id` (string, required) — The ID of the Data Lake Notebook Session

**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Notebook](#notebook) • [Top](#top)

#### `aidp notebook list-sessions`
<a id="notebook-list-sessions"></a>
Returns a list of all available sessions.

**Usage:**

`aidp notebook list-sessions <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `cluster-id` (string, optional) — Cluster ID attached to a session.
- `path` (string, optional) — Notebook file path attached to a session.
- `agent-flow-key` (string, optional) — Agent flow key of the attached agent flow.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Notebook](#notebook) • [Top](#top)

#### `aidp notebook modify-content`
<a id="notebook-modify-content"></a>
Renames a file or directory without re-uploading content.

**Usage:**

`aidp notebook modify-content <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <CONTENT-PATH> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `content-path` (string, required) — The path to the notebook file.

**Options:**
- `modify-content-details` (object, required) — New path for file or directory.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
**Request Body (`ModifyContentDetails`):**
- `path` (str, optional) — path of this ModifyContentDetails
**Example:**
```json
{
  "path": "<string>"
}
```
---

**Return:** [Back to Notebook](#notebook) • [Top](#top)

#### `aidp notebook patch-session`
<a id="notebook-patch-session"></a>
Patches a session with a given ID with the provided details.
Patches a session with a given ID with the provided details. You can use this to rename a session.

**Usage:**

`aidp notebook patch-session <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <SESSION-ID> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `session-id` (string, required) — The ID of the Data Lake Notebook Session

**Options:**
- `patch-session-details` (object, required) — Details to patch for an existing session.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
**Request Body (`PatchSessionDetails`):**
- `id` (str, optional) — id of this PatchSessionDetails
- `name` (str, optional) — name of this PatchSessionDetails
- `path` (str, optional) — path of this PatchSessionDetails
- `type` (str, optional) — type of this PatchSessionDetails
- `kernel` (Kernel, optional) — kernel of this PatchSessionDetails
- `cluster_id` (str, optional) — cluster_id of this PatchSessionDetails
- `must_refresh_context` (bool, optional) — must_refresh_context of this PatchSessionDetails
**Example:**
```json
{
  "id": "<string>",
  "name": "<string>",
  "path": "<string>",
  "type": "<string>",
  "kernel": "<Kernel>"
}
```
---

**Return:** [Back to Notebook](#notebook) • [Top](#top)

#### `aidp notebook update-content`
<a id="notebook-update-content"></a>
Updates the contents of an existing notebook with the provided details or saves a new notebook.

**Usage:**

`aidp notebook update-content <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <CONTENT-PATH> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `content-path` (string, required) — The path to the notebook file.

**Options:**
- `update-content-details` (object, required) — Details to update the notebook content model file.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
**Request Body (`UpdateContentDetails`):**
- `name` (str, optional) — name of this UpdateContentDetails
- `path` (str, optional) — path of this UpdateContentDetails
- `type` (str, optional) — type of this UpdateContentDetails
- `content` (object, optional) — content of this UpdateContentDetails
- `format` (str, optional) — format of this UpdateContentDetails
**Example:**
```json
{
  "name": "<string>",
  "path": "<string>",
  "type": "<string>",
  "content": "<object>",
  "format": "<string>"
}
```
---

**Return:** [Back to Notebook](#notebook) • [Top](#top)

## Role
Roles, role members, and role permissions.
**Command Index:**
- [role add-member](#role-add-member)
- [role create](#role-create)
- [role delete](#role-delete)
- [role get](#role-get)
- [role list](#role-list)
- [role list-permissions](#role-list-permissions)
- [role remove-member](#role-remove-member)
- [role update](#role-update)
### Commands
#### `aidp role add-member`
<a id="role-add-member"></a>
Assigns a given user/group/principal to a role.

**Usage:**

`aidp role add-member <AI-DATA-PLATFORM-ID> <ROLE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `role-key` (string, required) — The unique key of the Role.

**Options:**
- `add-member-to-role-details` (object, required) — The details of the assignee(s) to which a role is assigned.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
**Request Body (`AddMemberToRoleDetails`):**
- `assignees` (list[RoleAssignee], required) — **[Required]** assignees of this AddMemberToRoleDetails
**Example:**
```json
{
  "assignees": [
    "<RoleAssignee>"
  ]
}
```
---

**Return:** [Back to Role](#role) • [Top](#top)

#### `aidp role create`
<a id="role-create"></a>
Creates a role.

**Usage:**

`aidp role create <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `create-role-details` (object, required) — Details for the new role.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
**Request Body (`CreateRoleDetails`):**
- `display_name` (str, required) — **[Required]** display_name of this CreateRoleDetails
- `description` (str, optional) — description of this CreateRoleDetails
**Example:**
```json
{
  "display_name": "<string>",
  "description": "<string>"
}
```
---

**Return:** [Back to Role](#role) • [Top](#top)

#### `aidp role delete`
<a id="role-delete"></a>
Deletes a role.

**Usage:**

`aidp role delete <AI-DATA-PLATFORM-ID> <ROLE-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `role-key` (string, required) — The unique key of the Role.

**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Role](#role) • [Top](#top)

#### `aidp role get`
<a id="role-get"></a>
Returns detailed information about a role.

**Usage:**

`aidp role get <AI-DATA-PLATFORM-ID> <ROLE-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `role-key` (string, required) — The unique key of the Role.

**Options:**
- `role-scope` (string, optional) — The scope of roles to be returned. Defaults to USER. Allowed values are: "USER", "ADMIN", "MEMBER_OF" Allowed values: USER, ADMIN, MEMBER_OF
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Role](#role) • [Top](#top)

#### `aidp role list`
<a id="role-list"></a>
Returns a list of roles.

**Usage:**

`aidp role list <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `lifecycle-state` (string, optional) — A filter to return only resources that match the given lifecycle state. The state value is case-insensitive. Allowed values are: "ACTIVE" Allowed values: ACTIVE
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC" Allowed values: ASC, DESC
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName" Allowed values: timeCreated, displayName
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Role](#role) • [Top](#top)

#### `aidp role list-permissions`
<a id="role-list-permissions"></a>
Returns a list of permissions for a given role.

**Usage:**

`aidp role list-permissions <AI-DATA-PLATFORM-ID> <ROLE-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `role-key` (string, required) — The unique key of the Role.

**Options:**
- `permission-scope` (string, optional) — The scope of role permissions to be returned. Defaults to ALL Allowed values are: "DIRECT", "INHERITED", "ALL" Allowed values: DIRECT, INHERITED, ALL
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC" Allowed values: ASC, DESC
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName" Allowed values: timeCreated, displayName
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Role](#role) • [Top](#top)

#### `aidp role remove-member`
<a id="role-remove-member"></a>
Revoke a role from a given user or group.

**Usage:**

`aidp role remove-member <AI-DATA-PLATFORM-ID> <ROLE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `role-key` (string, required) — The unique key of the Role.

**Options:**
- `remove-member-from-role-details` (object, required) — The details of the user or group from which the role is to be revoked.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
**Request Body (`RemoveMemberFromRoleDetails`):**
- `assignees` (list[RoleAssignee], required) — **[Required]** assignees of this RemoveMemberFromRoleDetails
**Example:**
```json
{
  "assignees": [
    "<RoleAssignee>"
  ]
}
```
---

**Return:** [Back to Role](#role) • [Top](#top)

#### `aidp role update`
<a id="role-update"></a>
Updates a role with the provided information.

**Usage:**

`aidp role update <AI-DATA-PLATFORM-ID> <ROLE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `role-key` (string, required) — The unique key of the Role.

**Options:**
- `update-role-details` (object, required) — The information to be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
**Request Body (`UpdateRoleDetails`):**
- `display_name` (str, optional) — display_name of this UpdateRoleDetails
- `description` (str, optional) — description of this UpdateRoleDetails
**Example:**
```json
{
  "display_name": "<string>",
  "description": "<string>"
}
```
---

**Return:** [Back to Role](#role) • [Top](#top)

## Schema
Schemas, tables, views, and schema permissions.
**Command Index:**
- [schema create](#schema-create)
- [schema create-data-table](#schema-create-data-table)
- [schema create-table](#schema-create-table)
- [schema create-view](#schema-create-view)
- [schema delete](#schema-delete)
- [schema delete-table](#schema-delete-table)
- [schema delete-view](#schema-delete-view)
- [schema generate-temp-file-upload-target](#schema-generate-temp-file-upload-target)
- [schema get](#schema-get)
- [schema get-table](#schema-get-table)
- [schema get-view](#schema-get-view)
- [schema infer](#schema-infer)
- [schema infer-with-preview](#schema-infer-with-preview)
- [schema list](#schema-list)
- [schema list-permissions](#schema-list-permissions)
- [schema list-table-permissions](#schema-list-table-permissions)
- [schema list-tables](#schema-list-tables)
- [schema list-view-permissions](#schema-list-view-permissions)
- [schema list-views](#schema-list-views)
- [schema manage-permission](#schema-manage-permission)
- [schema manage-table-permission](#schema-manage-table-permission)
- [schema manage-view-permission](#schema-manage-view-permission)
- [schema refresh](#schema-refresh)
- [schema refresh-table](#schema-refresh-table)
- [schema retrieve-par](#schema-retrieve-par)
- [schema update](#schema-update)
- [schema update-table](#schema-update-table)
- [schema update-view](#schema-update-view)
### Commands
#### `aidp schema create`
<a id="schema-create"></a>
Creates a schema.

**Usage:**

`aidp schema create <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `create-schema-details` (object, required) — Details for the new schema.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
**Request Body (`CreateSchemaDetails`):**
- `display_name` (str, required) — **[Required]** display_name of this CreateSchemaDetails
- `description` (str, optional) — description of this CreateSchemaDetails
- `properties` (dict(str, str), optional) — properties of this CreateSchemaDetails
- `catalog_name` (str, required) — **[Required]** catalog_name of this CreateSchemaDetails
**Example:**
```json
{
  "display_name": "<string>",
  "description": "<string>",
  "properties": "<dict(str, str)>",
  "catalog_name": "<string>"
}
```
---

**Return:** [Back to Schema](#schema) • [Top](#top)

#### `aidp schema create-data-table`
<a id="schema-create-data-table"></a>
Creates a managed table with data loaded from a sample file.

**Usage:**

`aidp schema create-data-table <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `create-data-table-details` (object, required) — Details for the new managed table with data.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
**Request Body (`CreateDataTableDetails`):**
- `display_name` (str, required) — **[Required]** display_name of this CreateDataTableDetails
- `description` (str, optional) — description of this CreateDataTableDetails
- `catalog_key` (str, required) — **[Required]** catalog_key of this CreateDataTableDetails
- `schema_key` (str, required) — **[Required]** schema_key of this CreateDataTableDetails
- `table_fields` (list[TableFieldDetails], required) — **[Required]** table_fields of this CreateDataTableDetails
- `partition_keys` (list[TableFieldDetails], optional) — partition_keys of this CreateDataTableDetails
- `table_properties` (list[TableProperty], optional) — table_properties of this CreateDataTableDetails
- `managed_table_definition` (ManagedTableDefinition, required) — **[Required]** managed_table_definition of this CreateDataTableDetails
- `selected_columns` (list[str], required) — **[Required]** selected_columns of this CreateDataTableDetails
- `file_format` (str, required) — **[Required]** file_format of this CreateDataTableDetails
- `object_storage_location_path` (str, required) — **[Required]** object_storage_location_path of this CreateDataTableDetails
**Example:**
```json
{
  "display_name": "<string>",
  "description": "<string>",
  "catalog_key": "<string>",
  "schema_key": "<string>",
  "table_fields": [
    "<TableFieldDetails>"
  ]
}
```
---

**Return:** [Back to Schema](#schema) • [Top](#top)

#### `aidp schema create-table`
<a id="schema-create-table"></a>
Creates a table.

**Usage:**

`aidp schema create-table <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `create-table-details` (object, required) — Details for the new table.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
**Request Body (`CreateTableDetails`):**
- `display_name` (str, required) — **[Required]** display_name of this CreateTableDetails
- `catalog_key` (str, required) — **[Required]** catalog_key of this CreateTableDetails
- `schema_key` (str, required) — **[Required]** schema_key of this CreateTableDetails
- `description` (str, optional) — description of this CreateTableDetails
- `table_type` (str, required) — **[Required]** table_type of this CreateTableDetails
- `managed_table_definition` (ManagedTableDefinition, optional) — managed_table_definition of this CreateTableDetails
- `external_table_definition` (ExternalTableDefinition, optional) — external_table_definition of this CreateTableDetails
- `table_fields` (list[TableFieldDetails], optional) — table_fields of this CreateTableDetails
- `partition_keys` (list[TableFieldDetails], optional) — partition_keys of this CreateTableDetails
- `table_properties` (list[TableProperty], optional) — table_properties of this CreateTableDetails
**Example:**
```json
{
  "display_name": "<string>",
  "catalog_key": "<string>",
  "schema_key": "<string>",
  "description": "<string>",
  "table_type": "<string>"
}
```
---

**Return:** [Back to Schema](#schema) • [Top](#top)

#### `aidp schema create-view`
<a id="schema-create-view"></a>
Creates a view.

**Usage:**

`aidp schema create-view <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `create-view-details` (object, required) — Details for the new view.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
**Request Body (`CreateViewDetails`):**
- `display_name` (str, required) — **[Required]** display_name of this CreateViewDetails
- `catalog_key` (str, required) — **[Required]** catalog_key of this CreateViewDetails
- `schema_key` (str, required) — **[Required]** schema_key of this CreateViewDetails
- `description` (str, optional) — description of this CreateViewDetails
- `view_text` (str, required) — **[Required]** view_text of this CreateViewDetails
- `view_properties` (list[ViewProperty], optional) — view_properties of this CreateViewDetails
- `view_fields` (list[ViewFieldDetails], optional) — view_fields of this CreateViewDetails
**Example:**
```json
{
  "display_name": "<string>",
  "catalog_key": "<string>",
  "schema_key": "<string>",
  "description": "<string>",
  "view_text": "<string>"
}
```
---

**Return:** [Back to Schema](#schema) • [Top](#top)

#### `aidp schema delete`
<a id="schema-delete"></a>
Deletes a schema from an AI Data Platform Workbench.

**Usage:**

`aidp schema delete <AI-DATA-PLATFORM-ID> <SCHEMA-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `schema-key` (string, required) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.

**Options:**
- `is-forced` (boolean, optional) — A boolean which decides if an entity should be deleted with Cascade effect
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---

**Return:** [Back to Schema](#schema) • [Top](#top)

#### `aidp schema delete-table`
<a id="schema-delete-table"></a>
Deletes a table from an AI Data Platform Workbench.

**Usage:**

`aidp schema delete-table <AI-DATA-PLATFORM-ID> <TABLE-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `table-key` (string, required) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.

**Options:**
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---

**Return:** [Back to Schema](#schema) • [Top](#top)

#### `aidp schema delete-view`
<a id="schema-delete-view"></a>
Deletes a view from AI Data Platform Workbench.

**Usage:**

`aidp schema delete-view <AI-DATA-PLATFORM-ID> <VIEW-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `view-key` (string, required) — The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>.

**Options:**
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---

**Return:** [Back to Schema](#schema) • [Top](#top)

#### `aidp schema generate-temp-file-upload-target`
<a id="schema-generate-temp-file-upload-target"></a>
Generates a URI for uploading a sample file to a temporary folder in a schema.

**Usage:**

`aidp schema generate-temp-file-upload-target <AI-DATA-PLATFORM-ID> <SCHEMA-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `schema-key` (string, required) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.

**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---

**Return:** [Back to Schema](#schema) • [Top](#top)

#### `aidp schema get`
<a id="schema-get"></a>
Returns detailed information about a specified schema.

**Usage:**

`aidp schema get <AI-DATA-PLATFORM-ID> <SCHEMA-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `schema-key` (string, required) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.

**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---

**Return:** [Back to Schema](#schema) • [Top](#top)

#### `aidp schema get-table`
<a id="schema-get-table"></a>
Returns detailed information about a table.

**Usage:**

`aidp schema get-table <AI-DATA-PLATFORM-ID> <TABLE-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `table-key` (string, required) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.

**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---

**Return:** [Back to Schema](#schema) • [Top](#top)

#### `aidp schema get-view`
<a id="schema-get-view"></a>
Returns information about a view.

**Usage:**

`aidp schema get-view <AI-DATA-PLATFORM-ID> <VIEW-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `view-key` (string, required) — The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>.

**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---

**Return:** [Back to Schema](#schema) • [Top](#top)

#### `aidp schema infer`
<a id="schema-infer"></a>
Returns details of a table schema from the specified location.

**Usage:**

`aidp schema infer <AI-DATA-PLATFORM-ID> <SCHEMA-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `schema-key` (string, required) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.

**Options:**
- `perform-infer-schema-details` (object, required) — Details of the location from which the table schema can be inferred.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
**Request Body (`PerformInferSchemaDetails`):**
- `data_format` (str, required) — **[Required]** data_format of this PerformInferSchemaDetails
- `location` (str, required) — **[Required]** location of this PerformInferSchemaDetails
- `number_of_partitions` (int, optional) — number_of_partitions of this PerformInferSchemaDetails
- `infer_schema_properties` (list[InferSchemaProperties], optional) — infer_schema_properties of this PerformInferSchemaDetails
**Example:**
```json
{
  "data_format": "<string>",
  "location": "<string>",
  "number_of_partitions": 123,
  "infer_schema_properties": [
    "<InferSchemaProperties>"
  ]
}
```
---

**Return:** [Back to Schema](#schema) • [Top](#top)

#### `aidp schema infer-with-preview`
<a id="schema-infer-with-preview"></a>
Returns table schema and data from the specified location.

**Usage:**

`aidp schema infer-with-preview <AI-DATA-PLATFORM-ID> <SCHEMA-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `schema-key` (string, required) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.

**Options:**
- `perform-infer-schema-details` (object, required) — Details of the location from which the table schema and data can be inferred.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
**Request Body (`PerformInferSchemaDetails`):**
- `data_format` (str, required) — **[Required]** data_format of this PerformInferSchemaDetails
- `location` (str, required) — **[Required]** location of this PerformInferSchemaDetails
- `number_of_partitions` (int, optional) — number_of_partitions of this PerformInferSchemaDetails
- `infer_schema_properties` (list[InferSchemaProperties], optional) — infer_schema_properties of this PerformInferSchemaDetails
**Example:**
```json
{
  "data_format": "<string>",
  "location": "<string>",
  "number_of_partitions": 123,
  "infer_schema_properties": [
    "<InferSchemaProperties>"
  ]
}
```
---

**Return:** [Back to Schema](#schema) • [Top](#top)

#### `aidp schema list`
<a id="schema-list"></a>
Returns a list of schemas in a given AI Data Platform Workbench.

**Usage:**

`aidp schema list <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `catalog-key` (string, required) — The key of the catalog.
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC" Allowed values: ASC, DESC
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName" Allowed values: timeCreated, displayName
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Schema](#schema) • [Top](#top)

#### `aidp schema list-permissions`
<a id="schema-list-permissions"></a>
Returns a list of permissions for a given schema.

**Usage:**

`aidp schema list-permissions <AI-DATA-PLATFORM-ID> <SCHEMA-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `schema-key` (string, required) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.

**Options:**
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC" Allowed values: ASC, DESC
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName" Allowed values: timeCreated, displayName
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---

**Return:** [Back to Schema](#schema) • [Top](#top)

#### `aidp schema list-table-permissions`
<a id="schema-list-table-permissions"></a>
Returns a list of permissions for a given table.

**Usage:**

`aidp schema list-table-permissions <AI-DATA-PLATFORM-ID> <TABLE-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `table-key` (string, required) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.

**Options:**
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC" Allowed values: ASC, DESC
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName" Allowed values: timeCreated, displayName
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---

**Return:** [Back to Schema](#schema) • [Top](#top)

#### `aidp schema list-tables`
<a id="schema-list-tables"></a>
Returns a list of tables in a schema.

**Usage:**

`aidp schema list-tables <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `catalog-key` (string, required) — The key of the catalog.
- `schema-key` (string, required) — The fully qualified name of the Data Lake Schema in the format <catalog_name>.<schema_name>
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC" Allowed values: ASC, DESC
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName" Allowed values: timeCreated, displayName
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Schema](#schema) • [Top](#top)

#### `aidp schema list-view-permissions`
<a id="schema-list-view-permissions"></a>
Returns a list of view permissions.

**Usage:**

`aidp schema list-view-permissions <AI-DATA-PLATFORM-ID> <VIEW-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `view-key` (string, required) — The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>.

**Options:**
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC" Allowed values: ASC, DESC
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName" Allowed values: timeCreated, displayName
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---

**Return:** [Back to Schema](#schema) • [Top](#top)

#### `aidp schema list-views`
<a id="schema-list-views"></a>
Returns a list of views in a schema.

**Usage:**

`aidp schema list-views <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `catalog-key` (string, required) — The key of the catalog.
- `schema-key` (string, required) — The fully qualified name of the Data Lake Schema in the format <catalog_name>.<schema_name>
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC" Allowed values: ASC, DESC
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName" Allowed values: timeCreated, displayName
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Schema](#schema) • [Top](#top)

#### `aidp schema manage-permission`
<a id="schema-manage-permission"></a>
Updates the permissions for a given schema.

**Usage:**

`aidp schema manage-permission <AI-DATA-PLATFORM-ID> <SCHEMA-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `schema-key` (string, required) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.

**Options:**
- `manage-schema-permission-details` (object, required) — The information to be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
**Request Body (`ManageSchemaPermissionDetails`):**
- `assign_schema_permission_details` (AssignSchemaPermissionDetails, optional) — assign_schema_permission_details of this ManageSchemaPermissionDetails
- `revoke_schema_permission_details` (RevokeSchemaPermissionDetails, optional) — revoke_schema_permission_details of this ManageSchemaPermissionDetails
**Example:**
```json
{
  "assign_schema_permission_details": "<AssignSchemaPermissionDetails>",
  "revoke_schema_permission_details": "<RevokeSchemaPermissionDetails>"
}
```
---

**Return:** [Back to Schema](#schema) • [Top](#top)

#### `aidp schema manage-table-permission`
<a id="schema-manage-table-permission"></a>
Updates the permissions for a given table.

**Usage:**

`aidp schema manage-table-permission <AI-DATA-PLATFORM-ID> <TABLE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `table-key` (string, required) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.

**Options:**
- `manage-table-permission-details` (object, required) — The information to be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
**Request Body (`ManageTablePermissionDetails`):**
- `assign_table_permission_details` (AssignTablePermissionDetails, optional) — assign_table_permission_details of this ManageTablePermissionDetails
- `revoke_table_permission_details` (RevokeTablePermissionDetails, optional) — revoke_table_permission_details of this ManageTablePermissionDetails
**Example:**
```json
{
  "assign_table_permission_details": "<AssignTablePermissionDetails>",
  "revoke_table_permission_details": "<RevokeTablePermissionDetails>"
}
```
---

**Return:** [Back to Schema](#schema) • [Top](#top)

#### `aidp schema manage-view-permission`
<a id="schema-manage-view-permission"></a>
Updates permissions on a view.

**Usage:**

`aidp schema manage-view-permission <AI-DATA-PLATFORM-ID> <VIEW-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `view-key` (string, required) — The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>.

**Options:**
- `manage-view-permission-details` (object, required) — The information to be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
**Request Body (`ManageViewPermissionDetails`):**
- `assign_view_permission_details` (AssignViewPermissionDetails, optional) — assign_view_permission_details of this ManageViewPermissionDetails
- `revoke_view_permission_details` (RevokeViewPermissionDetails, optional) — revoke_view_permission_details of this ManageViewPermissionDetails
**Example:**
```json
{
  "assign_view_permission_details": "<AssignViewPermissionDetails>",
  "revoke_view_permission_details": "<RevokeViewPermissionDetails>"
}
```
---

**Return:** [Back to Schema](#schema) • [Top](#top)

#### `aidp schema refresh`
<a id="schema-refresh"></a>
Refreshes schema in an AI Data Platform Workbench through the crawler.

**Usage:**

`aidp schema refresh <AI-DATA-PLATFORM-ID> <SCHEMA-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `schema-key` (string, required) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.

**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
---

**Return:** [Back to Schema](#schema) • [Top](#top)

#### `aidp schema refresh-table`
<a id="schema-refresh-table"></a>
Refreshes a table in an AI Data Platform Workbench through the crawler.

**Usage:**

`aidp schema refresh-table <AI-DATA-PLATFORM-ID> <TABLE-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `table-key` (string, required) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.

**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
---

**Return:** [Back to Schema](#schema) • [Top](#top)

#### `aidp schema retrieve-par`
<a id="schema-retrieve-par"></a>
Retrieve PAR for the entities created in AI Data Platform Workbench.

**Usage:**

`aidp schema retrieve-par <AI-DATA-PLATFORM-ID> <TABLE-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `table-key` (string, required) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.

**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---

**Return:** [Back to Schema](#schema) • [Top](#top)

#### `aidp schema update`
<a id="schema-update"></a>
Updates a schema.

**Usage:**

`aidp schema update <AI-DATA-PLATFORM-ID> <SCHEMA-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `schema-key` (string, required) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.

**Options:**
- `update-schema-details` (object, required) — The information to be updated.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
**Request Body (`UpdateSchemaDetails`):**
- `display_name` (str, optional) — display_name of this UpdateSchemaDetails
- `description` (str, optional) — description of this UpdateSchemaDetails
- `properties` (dict(str, str), optional) — properties of this UpdateSchemaDetails
**Example:**
```json
{
  "display_name": "<string>",
  "description": "<string>",
  "properties": "<dict(str, str)>"
}
```
---

**Return:** [Back to Schema](#schema) • [Top](#top)

#### `aidp schema update-table`
<a id="schema-update-table"></a>
Updates a table with provided details.

**Usage:**

`aidp schema update-table <AI-DATA-PLATFORM-ID> <TABLE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `table-key` (string, required) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.

**Options:**
- `update-table-details` (object, required) — The information to be updated.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
**Request Body (`UpdateTableDetails`):**
- `display_name` (str, optional) — display_name of this UpdateTableDetails
- `description` (str, optional) — description of this UpdateTableDetails
- `add_table_fields` (list[TableFieldDetails], optional) — add_table_fields of this UpdateTableDetails
- `drop_table_fields` (list[TableFieldDetails], optional) — drop_table_fields of this UpdateTableDetails
- `rename_table_fields` (list[RenameTableFieldDetails], optional) — rename_table_fields of this UpdateTableDetails
- `add_table_properties` (list[TableProperty], optional) — add_table_properties of this UpdateTableDetails
- `drop_table_properties` (list[TableProperty], optional) — drop_table_properties of this UpdateTableDetails
- `update_table_fields` (list[UpdateTableFieldDetails], optional) — update_table_fields of this UpdateTableDetails
**Example:**
```json
{
  "display_name": "<string>",
  "description": "<string>",
  "add_table_fields": [
    "<TableFieldDetails>"
  ],
  "drop_table_fields": [
    "<TableFieldDetails>"
  ],
  "rename_table_fields": [
    "<RenameTableFieldDetails>"
  ]
}
```
---

**Return:** [Back to Schema](#schema) • [Top](#top)

#### `aidp schema update-view`
<a id="schema-update-view"></a>
Updates a view with given information.

**Usage:**

`aidp schema update-view <AI-DATA-PLATFORM-ID> <VIEW-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `view-key` (string, required) — The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>.

**Options:**
- `update-view-details` (object, required) — The update mode and information to be updated.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
**Request Body (`UpdateViewDetails`):**
- `update_mode` (str, required) — **[Required]** update_mode of this UpdateViewDetails
- `view_update_details` (ViewUpdateDetails, optional) — view_update_details of this UpdateViewDetails
**Example:**
```json
{
  "update_mode": "<string>",
  "view_update_details": "<ViewUpdateDetails>"
}
```
---

**Return:** [Back to Schema](#schema) • [Top](#top)

## User Setting
User settings.
**Command Index:**
- [user-setting create](#user-setting-create)
- [user-setting delete](#user-setting-delete)
- [user-setting get](#user-setting-get)
- [user-setting list](#user-setting-list)
- [user-setting update](#user-setting-update)
### Commands
#### `aidp user-setting create`
<a id="user-setting-create"></a>
(Preview) The User Settings API allows you to manage user-specific configurations and credentials within an AI Data Platform instance.
(Preview) The User Settings API allows you to manage user-specific configurations and credentials within an AI Data Platform instance. What you can do -> Store user credentials and integrations, including: -> IAM user credentials -> Git account configurations (e.g., GitHub PAT) -> Create and manage multiple settings -> Mark a setting as default for a given type -> Retrieve and filter settings by type or default status Supported setting types -> IAM_USER_CREDENTIAL – OCI user credentials for API access -> GIT_ACCOUNT – Git provider configuration (e.g., GitHub personal access token) Core operations -> Create a user setting -> List all user settings (with filtering and pagination) -> Get a specific setting by key -> Update an existing setting -> Delete a setting

**Usage:**

`aidp user-setting create <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `create-user-setting-details` (object, required) — Details for the new setting.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
**Request Body (`CreateUserSettingDetails`):**
- `name` (str, required) — **[Required]** name of this CreateUserSettingDetails
- `is_default` (bool, required) — **[Required]** is_default of this CreateUserSettingDetails
- `data` (SettingData, required) — **[Required]** data of this CreateUserSettingDetails
**Example:**
```json
{
  "name": "<string>",
  "is_default": true,
  "data": "<SettingData>"
}
```
---

**Return:** [Back to User Setting](#user-setting) • [Top](#top)

#### `aidp user-setting delete`
<a id="user-setting-delete"></a>
(Preview) Deletes a user setting and its credentials from this AI Data Platform instance, freeing the default slot for that type.

**Usage:**

`aidp user-setting delete <AI-DATA-PLATFORM-ID> <SETTING-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `setting-key` (string, required) — The UUID of the user setting.

**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to User Setting](#user-setting) • [Top](#top)

#### `aidp user-setting get`
<a id="user-setting-get"></a>
(Preview) Returns the full definition of user settings identified by its key, including type-specific payload and default flag.

**Usage:**

`aidp user-setting get <AI-DATA-PLATFORM-ID> <SETTING-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `setting-key` (string, required) — The UUID of the user setting.

**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to User Setting](#user-setting) • [Top](#top)

#### `aidp user-setting list`
<a id="user-setting-list"></a>
(Preview) Returns a list of all user-specific configurations, with filters for setting type, default flag, and pagination when needed.

**Usage:**

`aidp user-setting list <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `setting-type` (string, optional) — A filter to return only those settings whose value matches the given data type. Allowed values are: "IAM_USER_CREDENTIAL", "GIT_ACCOUNT" Allowed values: IAM_USER_CREDENTIAL, GIT_ACCOUNT
- `is-default` (boolean, optional) — A filter to return only resources that are default.
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC" Allowed values: ASC, DESC
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName" Allowed values: timeCreated, displayName
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to User Setting](#user-setting) • [Top](#top)

#### `aidp user-setting update`
<a id="user-setting-update"></a>
(Preview) Updates the metadata or payload of an existing user setting, letting you rotate credentials or change defaults.

**Usage:**

`aidp user-setting update <AI-DATA-PLATFORM-ID> <SETTING-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `setting-key` (string, required) — The UUID of the user setting.

**Options:**
- `update-user-setting-details` (object, required) — Details for the user setting to be updated.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
**Request Body (`UpdateUserSettingDetails`):**
- `name` (str, required) — **[Required]** name of this UpdateUserSettingDetails
- `is_default` (bool, required) — **[Required]** is_default of this UpdateUserSettingDetails
- `data` (SettingData, required) — **[Required]** data of this UpdateUserSettingDetails
**Example:**
```json
{
  "name": "<string>",
  "is_default": true,
  "data": "<SettingData>"
}
```
---

**Return:** [Back to User Setting](#user-setting) • [Top](#top)

## Volume
Files, volumes, directories, and volume permissions.
**Command Index:**
- [volume create](#volume-create)
- [volume delete](#volume-delete)
- [volume delete-dir](#volume-delete-dir)
- [volume delete-file](#volume-delete-file)
- [volume download-file](#volume-download-file)
- [volume download-file-with-par](#volume-download-file-with-par)
- [volume get](#volume-get)
- [volume list](#volume-list)
- [volume list-files](#volume-list-files)
- [volume list-permissions](#volume-list-permissions)
- [volume make-dir](#volume-make-dir)
- [volume manage-permission](#volume-manage-permission)
- [volume update](#volume-update)
- [volume update-dir](#volume-update-dir)
- [volume upload-file](#volume-upload-file)
- [volume upload-file-with-par](#volume-upload-file-with-par)
### Commands
#### `aidp volume create`
<a id="volume-create"></a>
Creates a volume in AI Data Platform Workbench.

**Usage:**

`aidp volume create <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `create-volume-details` (object, required) — Details for the new volume.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
**Request Body (`CreateVolumeDetails`):**
- `display_name` (str, required) — **[Required]** display_name of this CreateVolumeDetails
- `catalog_name` (str, required) — **[Required]** catalog_name of this CreateVolumeDetails
- `schema_name` (str, required) — **[Required]** schema_name of this CreateVolumeDetails
- `description` (str, optional) — description of this CreateVolumeDetails
- `volume_type` (str, optional) — volume_type of this CreateVolumeDetails
- `storage_location` (str, optional) — storage_location of this CreateVolumeDetails
**Example:**
```json
{
  "display_name": "<string>",
  "catalog_name": "<string>",
  "schema_name": "<string>",
  "description": "<string>",
  "volume_type": "<string>"
}
```
---

**Return:** [Back to Volume](#volume) • [Top](#top)

#### `aidp volume delete`
<a id="volume-delete"></a>
Deletes a volume.

**Usage:**

`aidp volume delete <AI-DATA-PLATFORM-ID> <VOLUME-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `volume-key` (string, required) — The key of the volume.

**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Volume](#volume) • [Top](#top)

#### `aidp volume delete-dir`
<a id="volume-delete-dir"></a>
Deletes a directory in a volume.

**Usage:**

`aidp volume delete-dir <AI-DATA-PLATFORM-ID> <VOLUME-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `volume-key` (string, required) — The key of the volume.

**Options:**
- `path` (string, required) — The absolute path of the file or folder
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Volume](#volume) • [Top](#top)

#### `aidp volume delete-file`
<a id="volume-delete-file"></a>
Deletes a file or folder in a volume.

**Usage:**

`aidp volume delete-file <AI-DATA-PLATFORM-ID> <VOLUME-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `volume-key` (string, required) — The key of the volume.

**Options:**
- `path` (string, required) — The absolute path of the file or folder
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Volume](#volume) • [Top](#top)

#### `aidp volume download-file`
<a id="volume-download-file"></a>
Downloads a file from a volume.

**Usage:**

`aidp volume download-file <AI-DATA-PLATFORM-ID> <VOLUME-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `volume-key` (string, required) — The key of the volume.

**Options:**
- `path` (string, required) — The absolute path of the file or folder
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---

**Return:** [Back to Volume](#volume) • [Top](#top)

#### `aidp volume download-file-with-par`
<a id="volume-download-file-with-par"></a>
provide the par info for downloading the file for given path.

**Usage:**

`aidp volume download-file-with-par <AI-DATA-PLATFORM-ID> <VOLUME-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `volume-key` (string, required) — The key of the volume.

**Options:**
- `should-generate-new-par` (boolean, optional) — Flag to toggle to generate short living par
- `path` (string, required) — The absolute path of the file or folder
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Volume](#volume) • [Top](#top)

#### `aidp volume get`
<a id="volume-get"></a>
Returns detailed information about a volume.

**Usage:**

`aidp volume get <AI-DATA-PLATFORM-ID> <VOLUME-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `volume-key` (string, required) — The key of the volume.

**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---

**Return:** [Back to Volume](#volume) • [Top](#top)

#### `aidp volume list`
<a id="volume-list"></a>
Returns a list of volumes.

**Usage:**

`aidp volume list <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `catalog-key` (string, required) — The key of the catalog.
- `schema-key` (string, required) — The fully qualified name of the Data Lake Schema in the format <catalog_name>.<schema_name>
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC" Allowed values: ASC, DESC
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName" Allowed values: timeCreated, displayName
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Volume](#volume) • [Top](#top)

#### `aidp volume list-files`
<a id="volume-list-files"></a>
Returns a list of files in a volume.

**Usage:**

`aidp volume list-files <AI-DATA-PLATFORM-ID> <VOLUME-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `volume-key` (string, required) — The key of the volume.

**Options:**
- `is-recursive` (boolean, optional) — A boolean which decides if nested files should be in the list files in volume response.
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `path` (string, required) — The absolute path of the file or folder
- `metadata-keys` (string, optional) — Comma separated keys to have in list response.
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC" Allowed values: ASC, DESC
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName" Allowed values: timeCreated, displayName
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---

**Return:** [Back to Volume](#volume) • [Top](#top)

#### `aidp volume list-permissions`
<a id="volume-list-permissions"></a>
Returns a list of volume permissions.

**Usage:**

`aidp volume list-permissions <AI-DATA-PLATFORM-ID> <VOLUME-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `volume-key` (string, required) — The key of the volume.

**Options:**
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC" Allowed values: ASC, DESC
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName" Allowed values: timeCreated, displayName
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Volume](#volume) • [Top](#top)

#### `aidp volume make-dir`
<a id="volume-make-dir"></a>
Creates a directory in a volume.

**Usage:**

`aidp volume make-dir <AI-DATA-PLATFORM-ID> <VOLUME-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `volume-key` (string, required) — The key of the volume.

**Options:**
- `description` (string, optional) — The description of the folder.
- `path` (string, required) — The absolute path of the file or folder
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---

**Return:** [Back to Volume](#volume) • [Top](#top)

#### `aidp volume manage-permission`
<a id="volume-manage-permission"></a>
Updates the permissions on a volume.

**Usage:**

`aidp volume manage-permission <AI-DATA-PLATFORM-ID> <VOLUME-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `volume-key` (string, required) — The key of the volume.

**Options:**
- `manage-volume-permission-details` (object, required) — The information to be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
**Request Body (`ManageVolumePermissionDetails`):**
- `assign_volume_permission_details` (AssignVolumePermissionDetails, optional) — assign_volume_permission_details of this ManageVolumePermissionDetails
- `revoke_volume_permission_details` (RevokeVolumePermissionDetails, optional) — revoke_volume_permission_details of this ManageVolumePermissionDetails
**Example:**
```json
{
  "assign_volume_permission_details": "<AssignVolumePermissionDetails>",
  "revoke_volume_permission_details": "<RevokeVolumePermissionDetails>"
}
```
---

**Return:** [Back to Volume](#volume) • [Top](#top)

#### `aidp volume update`
<a id="volume-update"></a>
Updates a volume with the provided information.

**Usage:**

`aidp volume update <AI-DATA-PLATFORM-ID> <VOLUME-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `volume-key` (string, required) — The key of the volume.

**Options:**
- `update-volume-details` (object, required) — The information to be updated.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
**Request Body (`UpdateVolumeDetails`):**
- `display_name` (str, optional) — display_name of this UpdateVolumeDetails
- `description` (str, optional) — description of this UpdateVolumeDetails
**Example:**
```json
{
  "display_name": "<string>",
  "description": "<string>"
}
```
---

**Return:** [Back to Volume](#volume) • [Top](#top)

#### `aidp volume update-dir`
<a id="volume-update-dir"></a>
Updates a directory in volume with the provided information.

**Usage:**

`aidp volume update-dir <AI-DATA-PLATFORM-ID> <VOLUME-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `volume-key` (string, required) — The key of the volume.

**Options:**
- `update-dir-details` (object, required) — The information to be updated.
- `path` (string, required) — The absolute path of the file or folder
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
**Request Body (`UpdateDirDetails`):**
- `display_name` (str, optional) — display_name of this UpdateDirDetails
**Example:**
```json
{
  "display_name": "<string>"
}
```
---

**Return:** [Back to Volume](#volume) • [Top](#top)

#### `aidp volume upload-file`
<a id="volume-upload-file"></a>
Uploads a file to volume.
Uploads a file to volume. If the file already exists, it is updated.

**Usage:**

`aidp volume upload-file <AI-DATA-PLATFORM-ID> <VOLUME-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `volume-key` (string, required) — The key of the volume.

**Options:**
- `upload-file-details` (object, required) — Contents of the file to upload.
- `is-overwrite` (boolean, optional) — A boolean which decides if overwrite is allowed
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `is-upload-file-base64-encoded` (boolean, optional) — A flag to identify if the upload file is base64 encoded
- `path` (string, required) — The absolute path of the file or folder
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Volume](#volume) • [Top](#top)

#### `aidp volume upload-file-with-par`
<a id="volume-upload-file-with-par"></a>
Uploads a volume file by generating PAR.
Uploads a volume file by generating PAR. If file exists, then it will be updated.

**Usage:**

`aidp volume upload-file-with-par <AI-DATA-PLATFORM-ID> <VOLUME-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `volume-key` (string, required) — The key of the volume.

**Options:**
- `upload-file-with-par-details` (object, required) — Contents of the file to upload.
- `is-overwrite` (boolean, optional) — A boolean which decides if overwrite is allowed
- `should-generate-new-par` (boolean, optional) — Flag to toggle to generate short living par
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `path` (string, required) — The absolute path of the file or folder
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
**Request Body (`UploadFileWithParDetails`):**
- `action` (str, optional) — action of this UploadFileWithParDetails
- `e_tag` (str, optional) — e_tag of this UploadFileWithParDetails
- `size` (int, optional) — size of this UploadFileWithParDetails
- `system_tags` (dict(str, dict(str, object)), optional) — system_tags of this UploadFileWithParDetails
**Example:**
```json
{
  "action": "<string>",
  "e_tag": "<string>",
  "size": 123,
  "system_tags": "<dict(str, dict(str, object))>"
}
```
---

**Return:** [Back to Volume](#volume) • [Top](#top)

## Workflow
Job runs, jobs, task run output, and task runs.
**Command Index:**
- [workflow cancel-job-run](#workflow-cancel-job-run)
- [workflow cancel-job-runs](#workflow-cancel-job-runs)
- [workflow create-job](#workflow-create-job)
- [workflow create-job-run](#workflow-create-job-run)
- [workflow delete-job](#workflow-delete-job)
- [workflow delete-job-run](#workflow-delete-job-run)
- [workflow export-task-run-output](#workflow-export-task-run-output)
- [workflow fetch-output](#workflow-fetch-output)
- [workflow get-job](#workflow-get-job)
- [workflow get-job-run](#workflow-get-job-run)
- [workflow get-task-run](#workflow-get-task-run)
- [workflow list-job-permissions](#workflow-list-job-permissions)
- [workflow list-job-runs](#workflow-list-job-runs)
- [workflow list-jobs](#workflow-list-jobs)
- [workflow list-recent-job-runs](#workflow-list-recent-job-runs)
- [workflow list-task-runs](#workflow-list-task-runs)
- [workflow manage-job-permission](#workflow-manage-job-permission)
- [workflow repair-job-run](#workflow-repair-job-run)
- [workflow update-job](#workflow-update-job)
### Commands
#### `aidp workflow cancel-job-run`
<a id="workflow-cancel-job-run"></a>
Cancels a job run.

**Usage:**

`aidp workflow cancel-job-run <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <JOB-RUN-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `job-run-key` (string, required) — Job run key.

**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---

**Return:** [Back to Workflow](#workflow) • [Top](#top)

#### `aidp workflow cancel-job-runs`
<a id="workflow-cancel-job-runs"></a>
Cancels all job runs for a given job.

**Usage:**

`aidp workflow cancel-job-runs <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <JOB-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `job-key` (string, required) — Job key.

**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
---

**Return:** [Back to Workflow](#workflow) • [Top](#top)

#### `aidp workflow create-job`
<a id="workflow-create-job"></a>
Creates a job in an AI Data Platform Workbench.

**Usage:**

`aidp workflow create-job <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `create-job-details` (object, required) — Details for the new job.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
**Request Body (`CreateJobDetails`):**
- `run_as` (str, optional) — run_as of this CreateJobDetails
- `name` (str, required) — **[Required]** name of this CreateJobDetails
- `description` (str, optional) — description of this CreateJobDetails
- `schedule` (Schedule, optional) — schedule of this CreateJobDetails
- `continuous` (Continuous, optional) — continuous of this CreateJobDetails
- `max_concurrent_runs` (int, optional) — max_concurrent_runs of this CreateJobDetails
- `git_config` (GitConfig, optional) — git_config of this CreateJobDetails
- `queue` (Queue, optional) — queue of this CreateJobDetails
- `job_clusters` (list[JobCluster], optional) — job_clusters of this CreateJobDetails
- `path` (str, optional) — path of this CreateJobDetails
- `tasks` (list[Task], optional) — tasks of this CreateJobDetails
- `parameters` (list[Parameter], optional) — parameters of this CreateJobDetails
- `timeout_seconds` (int, optional) — timeout_seconds of this CreateJobDetails
**Example:**
```json
{
  "run_as": "<string>",
  "name": "<string>",
  "description": "<string>",
  "schedule": "<Schedule>",
  "continuous": "<Continuous>"
}
```
---

**Return:** [Back to Workflow](#workflow) • [Top](#top)

#### `aidp workflow create-job-run`
<a id="workflow-create-job-run"></a>
Creates a job run for an AI Data Platform Workbench.

**Usage:**

`aidp workflow create-job-run <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `create-job-run-details` (object, required) — Details for the new job run.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
**Request Body (`CreateJobRunDetails`):**
- `key` (str, optional) — key of this CreateJobRunDetails
- `job_key` (str, required) — **[Required]** job_key of this CreateJobRunDetails
- `original_attempt_run_id` (str, optional) — original_attempt_run_id of this CreateJobRunDetails
- `schedule` (Schedule, optional) — schedule of this CreateJobRunDetails
- `parameters` (list[Parameter], optional) — parameters of this CreateJobRunDetails
- `queue` (Queue, optional) — queue of this CreateJobRunDetails
- `repair_history` (list[RepairHistory], optional) — repair_history of this CreateJobRunDetails
**Example:**
```json
{
  "key": "<string>",
  "job_key": "<string>",
  "original_attempt_run_id": "<string>",
  "schedule": "<Schedule>",
  "parameters": [
    "<Parameter>"
  ]
}
```
---

**Return:** [Back to Workflow](#workflow) • [Top](#top)

#### `aidp workflow delete-job`
<a id="workflow-delete-job"></a>
Deletes a job from an AI Data Platform Workbench.

**Usage:**

`aidp workflow delete-job <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <JOB-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `job-key` (string, required) — Job key.

**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Workflow](#workflow) • [Top](#top)

#### `aidp workflow delete-job-run`
<a id="workflow-delete-job-run"></a>
Deletes a job run from an AI Data Platform Workbench.

**Usage:**

`aidp workflow delete-job-run <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <JOB-RUN-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `job-run-key` (string, required) — Job run key.

**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Workflow](#workflow) • [Top](#top)

#### `aidp workflow export-task-run-output`
<a id="workflow-export-task-run-output"></a>
Exports task run output in HTML or ipynb format.

**Usage:**

`aidp workflow export-task-run-output <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <TASK-RUN-KEY> <TASK-RUN-OUTPUT-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `task-run-key` (string, required) — Task run key.
- `task-run-output-key` (string, required) — Task run output key.

**Options:**
- `export-task-run-output-details` (object, required) — Payload to export task run output to a file.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
**Request Body (`ExportTaskRunOutputDetails`):**
- `format` (str, optional) — format of this ExportTaskRunOutputDetails
**Example:**
```json
{
  "format": "<string>"
}
```
---

**Return:** [Back to Workflow](#workflow) • [Top](#top)

#### `aidp workflow fetch-output`
<a id="workflow-fetch-output"></a>
Fetches the task run output from the runtime engine.

**Usage:**

`aidp workflow fetch-output <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <TASK-RUN-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `task-run-key` (string, required) — Task run key.

**Options:**
- `fetch-output-details` (object, required) — Details for task run output retrieval.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
**Request Body (`FetchOutputDetails`):**
- `output_key` (str, optional) — output_key of this FetchOutputDetails
**Example:**
```json
{
  "output_key": "<string>"
}
```
---

**Return:** [Back to Workflow](#workflow) • [Top](#top)

#### `aidp workflow get-job`
<a id="workflow-get-job"></a>
Returns detailed information about a given job in AI Data Platform Workbench.

**Usage:**

`aidp workflow get-job <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <JOB-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `job-key` (string, required) — Job key.

**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---

**Return:** [Back to Workflow](#workflow) • [Top](#top)

#### `aidp workflow get-job-run`
<a id="workflow-get-job-run"></a>
Returns detailed information about a given job run.

**Usage:**

`aidp workflow get-job-run <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <JOB-RUN-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `job-run-key` (string, required) — Job run key.

**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---

**Return:** [Back to Workflow](#workflow) • [Top](#top)

#### `aidp workflow get-task-run`
<a id="workflow-get-task-run"></a>
Returns detailed information about a task run with a given task run key.

**Usage:**

`aidp workflow get-task-run <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <TASK-RUN-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `task-run-key` (string, required) — Task run key.

**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Workflow](#workflow) • [Top](#top)

#### `aidp workflow list-job-permissions`
<a id="workflow-list-job-permissions"></a>
Returns a list of job permissions.

**Usage:**

`aidp workflow list-job-permissions <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <JOB-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `job-key` (string, required) — Job key.

**Options:**
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC" Allowed values: ASC, DESC
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Allowed values are: "timeCreated", "displayName" Allowed values: timeCreated, displayName
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Workflow](#workflow) • [Top](#top)

#### `aidp workflow list-job-runs`
<a id="workflow-list-job-runs"></a>
Returns a detailed list of job runs in an AI Data Platform Workbench.

**Usage:**

`aidp workflow list-job-runs <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `time-created-greater-than-or-equal-to` (datetime, optional) — Fetch objects from repository that were created after or at the exact timestamp provided in parameter
- `time-created-less-than-or-equal-to` (datetime, optional) — Fetch objects from repository that were created before or at the exact timestamp provided in parameter.
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated List call.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC" Allowed values: ASC, DESC
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName", "status" Allowed values: timeCreated, displayName, status
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Workflow](#workflow) • [Top](#top)

#### `aidp workflow list-jobs`
<a id="workflow-list-jobs"></a>
Returns a list of jobs for a given AI Data Platform Workbench.

**Usage:**

`aidp workflow list-jobs <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `display-name-contains` (string, optional) — A filter to return only resources that have a display name containing the text provided.
- `path` (string, optional) — The fully qualified path where the job is stored.
- `created-by` (string, optional) — A filter to return only resources that are created by given user with username that matches exactly.
- `updated-by` (string, optional) — A filter to return only resources that was last updated by given user with username that matches exactly.
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC" Allowed values: ASC, DESC
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName", "status" Allowed values: timeCreated, displayName, status
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Workflow](#workflow) • [Top](#top)

#### `aidp workflow list-recent-job-runs`
<a id="workflow-list-recent-job-runs"></a>
Returns a list of the latest job runs for a given job key.

**Usage:**

`aidp workflow list-recent-job-runs <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `record-count` (integer, optional) — The number of records to fetch.
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated List call.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC" Allowed values: ASC, DESC
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName", "status" Allowed values: timeCreated, displayName, status
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Workflow](#workflow) • [Top](#top)

#### `aidp workflow list-task-runs`
<a id="workflow-list-task-runs"></a>
Returns a list of tasks run in an AI Data Platform Workbench.

**Usage:**

`aidp workflow list-task-runs <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `job-run-key` (string, required) — The field to filter based on job run key.
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `parent-job-run-key` (string, optional) — The field to filter based on parent job run key.
- `root-job-run-key` (string, optional) — The field to filter based on root job run key.
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC" Allowed values: ASC, DESC
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName", "status" Allowed values: timeCreated, displayName, status
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Workflow](#workflow) • [Top](#top)

#### `aidp workflow manage-job-permission`
<a id="workflow-manage-job-permission"></a>
Update job permissions with the provided details.

**Usage:**

`aidp workflow manage-job-permission <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <JOB-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `job-key` (string, required) — Job key.

**Options:**
- `manage-job-permission-details` (object, required) — The information to be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
**Request Body (`ManageJobPermissionDetails`):**
- `assign_job_permission_details` (AssignJobPermissionDetails, optional) — assign_job_permission_details of this ManageJobPermissionDetails
- `revoke_job_permission_details` (RevokeJobPermissionDetails, optional) — revoke_job_permission_details of this ManageJobPermissionDetails
**Example:**
```json
{
  "assign_job_permission_details": "<AssignJobPermissionDetails>",
  "revoke_job_permission_details": "<RevokeJobPermissionDetails>"
}
```
---

**Return:** [Back to Workflow](#workflow) • [Top](#top)

#### `aidp workflow repair-job-run`
<a id="workflow-repair-job-run"></a>
Repairs and reruns a job run.

**Usage:**

`aidp workflow repair-job-run <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <JOB-RUN-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `job-run-key` (string, required) — Job run key.

**Options:**
- `repair-job-run-details` (object, required) — Details of the job run to be repaired.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
**Request Body (`RepairJobRunDetails`):**
- `task_keys` (list[str], required) — **[Required]** task_keys of this RepairJobRunDetails
- `parameters` (list[Parameter], optional) — parameters of this RepairJobRunDetails
**Example:**
```json
{
  "task_keys": [
    "<string>"
  ],
  "parameters": [
    "<Parameter>"
  ]
}
```
---

**Return:** [Back to Workflow](#workflow) • [Top](#top)

#### `aidp workflow update-job`
<a id="workflow-update-job"></a>
Update details for a job in AI Data Platform Workbench.

**Usage:**

`aidp workflow update-job <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <JOB-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `job-key` (string, required) — Job key.

**Options:**
- `update-job-details` (object, required) — The information to be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
**Request Body (`UpdateJobDetails`):**
- `run_as` (str, optional) — run_as of this UpdateJobDetails
- `name` (str, required) — **[Required]** name of this UpdateJobDetails
- `description` (str, optional) — description of this UpdateJobDetails
- `schedule` (Schedule, optional) — schedule of this UpdateJobDetails
- `continuous` (Continuous, optional) — continuous of this UpdateJobDetails
- `max_concurrent_runs` (int, optional) — max_concurrent_runs of this UpdateJobDetails
- `git_config` (GitConfig, optional) — git_config of this UpdateJobDetails
- `queue` (Queue, optional) — queue of this UpdateJobDetails
- `job_clusters` (list[JobCluster], optional) — job_clusters of this UpdateJobDetails
- `path` (str, optional) — path of this UpdateJobDetails
- `tasks` (list[Task], optional) — tasks of this UpdateJobDetails
- `parameters` (list[Parameter], optional) — parameters of this UpdateJobDetails
- `timeout_seconds` (int, optional) — timeout_seconds of this UpdateJobDetails
**Example:**
```json
{
  "run_as": "<string>",
  "name": "<string>",
  "description": "<string>",
  "schedule": "<Schedule>",
  "continuous": "<Continuous>"
}
```
---

**Return:** [Back to Workflow](#workflow) • [Top](#top)

## Workspace
Workspaces, workspace permissions, git folders, and workspace status.
**Command Index:**
- [workspace create](#workspace-create)
- [workspace create-git-folder](#workspace-create-git-folder)
- [workspace delete](#workspace-delete)
- [workspace get](#workspace-get)
- [workspace list](#workspace-list)
- [workspace list-create-permissions](#workspace-list-create-permissions)
- [workspace list-permissions](#workspace-list-permissions)
- [workspace manage-create-permission](#workspace-manage-create-permission)
- [workspace manage-permission](#workspace-manage-permission)
- [workspace update](#workspace-update)
- [workspace update-async-operation-status](#workspace-update-async-operation-status)
### Commands
#### `aidp workspace create`
<a id="workspace-create"></a>
Creates a workspace.

**Usage:**

`aidp workspace create <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `create-workspace-details` (object, required) — Details for the new workspace.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
**Request Body (`CreateWorkspaceDetails`):**
- `display_name` (str, required) — **[Required]** display_name of this CreateWorkspaceDetails
- `description` (str, optional) — description of this CreateWorkspaceDetails
- `default_catalog_key` (str, optional) — default_catalog_key of this CreateWorkspaceDetails
- `network_configuration_details` (WorkspaceNetworkConfigurationDetails, optional) — network_configuration_details of this CreateWorkspaceDetails
**Example:**
```json
{
  "display_name": "<string>",
  "description": "<string>",
  "default_catalog_key": "<string>",
  "network_configuration_details": "<WorkspaceNetworkConfigurationDetails>"
}
```
---

**Return:** [Back to Workspace](#workspace) • [Top](#top)

#### `aidp workspace create-git-folder`
<a id="workspace-create-git-folder"></a>
Creates a git folder in the workspace.
Creates a git folder in the workspace

**Usage:**

`aidp workspace create-git-folder <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `create-git-folder-details` (object, required) — The information to be updated.
- `dh-user-principal` (string, optional) — The DH User Principal Header .
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
**Request Body (`CreateGitFolderDetails`):**
- `folder_path` (str, required) — **[Required]** folder_path of this CreateGitFolderDetails
- `git_provider_key` (str, optional) — git_provider_key of this CreateGitFolderDetails
- `git_repository_url` (str, required) — **[Required]** git_repository_url of this CreateGitFolderDetails
- `branch_name` (str, required) — **[Required]** branch_name of this CreateGitFolderDetails
- `credential_key` (str, required) — **[Required]** credential_key of this CreateGitFolderDetails
- `description` (str, optional) — description of this CreateGitFolderDetails
**Example:**
```json
{
  "folder_path": "<string>",
  "git_provider_key": "<string>",
  "git_repository_url": "<string>",
  "branch_name": "<string>",
  "credential_key": "<string>"
}
```
---

**Return:** [Back to Workspace](#workspace) • [Top](#top)

#### `aidp workspace delete`
<a id="workspace-delete"></a>
Deletes a workspace.

**Usage:**

`aidp workspace delete <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `time-data-lake-deletion` (datetime, optional) — Deletion time in the case that a workspace is deleted during AI Data Platform Workbench deletion.
---

**Return:** [Back to Workspace](#workspace) • [Top](#top)

#### `aidp workspace get`
<a id="workspace-get"></a>
Gets detailed information about a workspace.

**Usage:**

`aidp workspace get <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Workspace](#workspace) • [Top](#top)

#### `aidp workspace list`
<a id="workspace-list"></a>
Gets a list of workspaces.

**Usage:**

`aidp workspace list <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `lifecycle-state` (string, optional) — A filter to return only resources that match the given lifecycle state. The state value is case-insensitive. Allowed values are: "CREATING", "UPDATING", "ACTIVE", "DELETING", "DELETED", "FAILED" Allowed values: CREATING, UPDATING, ACTIVE, DELETING, DELETED, FAILED
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `display-name-contains` (string, optional) — A filter to return only resources that have a display name containing the text provided.
- `type` (string, optional) — When no value is provided, all workspaces are returned. Otherwise, workspace of selected value is returned. Allowed values are: "DEFAULT", "USER" Allowed values: DEFAULT, USER
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC" Allowed values: ASC, DESC
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName" Allowed values: timeCreated, displayName
- `is-private-network-enabled` (boolean, optional) — A flag to filter the workspaces which are private network enabled or disabled
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Workspace](#workspace) • [Top](#top)

#### `aidp workspace list-create-permissions`
<a id="workspace-list-create-permissions"></a>
Gets a list of create workspace permission summary objects.

**Usage:**

`aidp workspace list-create-permissions <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC" Allowed values: ASC, DESC
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for granteeName is ascending. Allowed values are: "granteeName" Allowed values: granteeName
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Workspace](#workspace) • [Top](#top)

#### `aidp workspace list-permissions`
<a id="workspace-list-permissions"></a>
Gets a list of workspace permissions.

**Usage:**

`aidp workspace list-permissions <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC" Allowed values: ASC, DESC
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for granteeName is ascending. Allowed values are: "granteeName" Allowed values: granteeName
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Workspace](#workspace) • [Top](#top)

#### `aidp workspace manage-create-permission`
<a id="workspace-manage-create-permission"></a>
Updates create workspace permissions on a workspace.

**Usage:**

`aidp workspace manage-create-permission <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.

**Options:**
- `manage-create-workspace-permission-details` (object, required) — The information to be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
**Request Body (`ManageCreateWorkspacePermissionDetails`):**
- `assign_create_workspace_permission_details` (AssignCreateWorkspacePermissionDetails, optional) — assign_create_workspace_permission_details of this ManageCreateWorkspacePermissionDetails
- `revoke_create_workspace_permission_details` (RevokeCreateWorkspacePermissionDetails, optional) — revoke_create_workspace_permission_details of this ManageCreateWorkspacePermissionDetails
**Example:**
```json
{
  "assign_create_workspace_permission_details": "<AssignCreateWorkspacePermissionDetails>",
  "revoke_create_workspace_permission_details": "<RevokeCreateWorkspacePermissionDetails>"
}
```
---

**Return:** [Back to Workspace](#workspace) • [Top](#top)

#### `aidp workspace manage-permission`
<a id="workspace-manage-permission"></a>
Updates permissions on a workspace.

**Usage:**

`aidp workspace manage-permission <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `manage-workspace-permission-details` (object, required) — The information to be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
**Request Body (`ManageWorkspacePermissionDetails`):**
- `assign_workspace_permission_details` (AssignWorkspacePermissionDetails, optional) — assign_workspace_permission_details of this ManageWorkspacePermissionDetails
- `revoke_workspace_permission_details` (RevokeWorkspacePermissionDetails, optional) — revoke_workspace_permission_details of this ManageWorkspacePermissionDetails
**Example:**
```json
{
  "assign_workspace_permission_details": "<AssignWorkspacePermissionDetails>",
  "revoke_workspace_permission_details": "<RevokeWorkspacePermissionDetails>"
}
```
---

**Return:** [Back to Workspace](#workspace) • [Top](#top)

#### `aidp workspace update`
<a id="workspace-update"></a>
Updates the details of a workspace.

**Usage:**

`aidp workspace update <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `update-workspace-details` (object, required) — The information to be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
**Request Body (`UpdateWorkspaceDetails`):**
- `display_name` (str, optional) — display_name of this UpdateWorkspaceDetails
- `description` (str, optional) — description of this UpdateWorkspaceDetails
- `default_catalog_key` (str, optional) — default_catalog_key of this UpdateWorkspaceDetails
- `network_configuration_details` (WorkspaceNetworkConfigurationDetails, optional) — network_configuration_details of this UpdateWorkspaceDetails
**Example:**
```json
{
  "display_name": "<string>",
  "description": "<string>",
  "default_catalog_key": "<string>",
  "network_configuration_details": "<WorkspaceNetworkConfigurationDetails>"
}
```
---

**Return:** [Back to Workspace](#workspace) • [Top](#top)

#### `aidp workspace update-async-operation-status`
<a id="workspace-update-async-operation-status"></a>
Updates the status of a workspace.

**Usage:**

`aidp workspace update-async-operation-status <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <ASYNC-OPERATION-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `async-operation-key` (string, required) — The unique identifier of an async operation

**Options:**
- `update-workspace-async-operation-status-details` (object, required) — The information to be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
**Request Body (`UpdateWorkspaceAsyncOperationStatusDetails`):**
- `state_message` (str, optional) — state_message of this UpdateWorkspaceAsyncOperationStatusDetails
- `state` (str, required) — **[Required]** state of this UpdateWorkspaceAsyncOperationStatusDetails
- `external_id` (str, optional) — external_id of this UpdateWorkspaceAsyncOperationStatusDetails
- `properties` (dict(str, object), optional) — properties of this UpdateWorkspaceAsyncOperationStatusDetails
**Example:**
```json
{
  "state_message": "<string>",
  "state": "<string>",
  "external_id": "<string>",
  "properties": "<dict(str, object)>"
}
```
---

**Return:** [Back to Workspace](#workspace) • [Top](#top)

## Workspace Object
Workspace objects, workspace files, and workspace object permissions.
**Command Index:**
- [workspace-object copy](#workspace-object-copy)
- [workspace-object create](#workspace-object-create)
- [workspace-object delete](#workspace-object-delete)
- [workspace-object download-with-par](#workspace-object-download-with-par)
- [workspace-object get](#workspace-object-get)
- [workspace-object head](#workspace-object-head)
- [workspace-object list](#workspace-object-list)
- [workspace-object list-permissions](#workspace-object-list-permissions)
- [workspace-object manage-permission](#workspace-object-manage-permission)
- [workspace-object move](#workspace-object-move)
- [workspace-object rename](#workspace-object-rename)
- [workspace-object update](#workspace-object-update)
- [workspace-object upload-with-par](#workspace-object-upload-with-par)
### Commands
#### `aidp workspace-object copy`
<a id="workspace-object-copy"></a>
Copy a workspace object to different location.

**Usage:**

`aidp workspace-object copy <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `copy-workspace-object-details` (object, required) — Details for copying the workspace object to a different path.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
**Request Body (`CopyWorkspaceObjectDetails`):**
- `from_path` (str, optional) — from_path of this CopyWorkspaceObjectDetails
- `to_path` (str, optional) — to_path of this CopyWorkspaceObjectDetails
- `is_delete_source` (bool, optional) — is_delete_source of this CopyWorkspaceObjectDetails
- `is_over_write` (bool, optional) — is_over_write of this CopyWorkspaceObjectDetails
- `buffer_size` (int, optional) — buffer_size of this CopyWorkspaceObjectDetails
- `is_include_outputs` (bool, optional) — is_include_outputs of this CopyWorkspaceObjectDetails
**Example:**
```json
{
  "from_path": "<string>",
  "to_path": "<string>",
  "is_delete_source": true,
  "is_over_write": true,
  "buffer_size": 123
}
```
---

**Return:** [Back to Workspace Object](#workspace-object) • [Top](#top)

#### `aidp workspace-object create`
<a id="workspace-object-create"></a>
Creates a workspace object.
Creates a workspace object. You can create a file or folder in the workspace.

**Usage:**

`aidp workspace-object create <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `create-workspace-object-details` (object, required) — Details for the new workspace object.
- `object-description` (string, optional) — The description of the workspace object
- `type` (string, optional) — The type of workspace object.
- `path` (string, required) — The absolute path of the file or folder
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `is-upload-file-base64-encoded` (boolean, optional) — A flag to identify if the upload file is base64 encoded
- `is-overwrite` (boolean, optional) — A boolean which decides if overwrite is allowed
---

**Return:** [Back to Workspace Object](#workspace-object) • [Top](#top)

#### `aidp workspace-object delete`
<a id="workspace-object-delete"></a>
Deletes a workspace object.

**Usage:**

`aidp workspace-object delete <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <OBJECT-PATH>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `object-path` (string, required) — The fully qualified path of the workspace object.

**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Workspace Object](#workspace-object) • [Top](#top)

#### `aidp workspace-object download-with-par`
<a id="workspace-object-download-with-par"></a>
Downloads a workspace file by providing the PAR info for downloading the file for given path.

**Usage:**

`aidp workspace-object download-with-par <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `should-generate-new-par` (boolean, optional) — Flag to toggle to generate short living par
- `path` (string, required) — The absolute path of the file or folder
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `type` (string, optional) — The type of workspace object.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---

**Return:** [Back to Workspace Object](#workspace-object) • [Top](#top)

#### `aidp workspace-object get`
<a id="workspace-object-get"></a>
Returns detailed information about a workspace object.

**Usage:**

`aidp workspace-object get <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <OBJECT-PATH>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `object-path` (string, required) — The fully qualified path of the workspace object.

**Options:**
- `should-include-metadata` (boolean, optional) — Path to list all metadata for a file or folder.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---

**Return:** [Back to Workspace Object](#workspace-object) • [Top](#top)

#### `aidp workspace-object head`
<a id="workspace-object-head"></a>
Returns metadata about a workspace object.
Returns metadata about a workspace object. The contents of the file are not retrieved.

**Usage:**

`aidp workspace-object head <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <OBJECT-PATH>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `object-path` (string, required) — The fully qualified path of the workspace object.

**Options:**
- `should-include-metadata` (boolean, optional) — Path to list all metadata for a file or folder.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---

**Return:** [Back to Workspace Object](#workspace-object) • [Top](#top)

#### `aidp workspace-object list`
<a id="workspace-object-list"></a>
Returns a list of objects in the workspace.

**Usage:**

`aidp workspace-object list <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `path` (string, required) — The absolute path of the file or folder
- `type` (string, optional) — Filter by object type. For example, NOTEBOOK, LIBRARY, or FILE.
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `metadata-keys` (string, optional) — Comma separated keys to have in list response.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC" Allowed values: ASC, DESC
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName" Allowed values: timeCreated, displayName
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---

**Return:** [Back to Workspace Object](#workspace-object) • [Top](#top)

#### `aidp workspace-object list-permissions`
<a id="workspace-object-list-permissions"></a>
Returns a list of workspace object permissions.

**Usage:**

`aidp workspace-object list-permissions <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <OBJECT-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `object-key` (string, required) — The key of the workspace object.

**Options:**
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC" Allowed values: ASC, DESC
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName" Allowed values: timeCreated, displayName
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---

**Return:** [Back to Workspace Object](#workspace-object) • [Top](#top)

#### `aidp workspace-object manage-permission`
<a id="workspace-object-manage-permission"></a>
Updates permissions on a workspace object.

**Usage:**

`aidp workspace-object manage-permission <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <OBJECT-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `object-key` (string, required) — The key of the workspace object.

**Options:**
- `manage-workspace-object-permission-details` (object, required) — The information to be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
**Request Body (`ManageWorkspaceObjectPermissionDetails`):**
- `assign_workspace_object_permission_details` (AssignWorkspaceObjectPermissionDetails, optional) — assign_workspace_object_permission_details of this ManageWorkspaceObjectPermissionDetails
- `revoke_workspace_object_permission_details` (RevokeWorkspaceObjectPermissionDetails, optional) — revoke_workspace_object_permission_details of this ManageWorkspaceObjectPermissionDetails
**Example:**
```json
{
  "assign_workspace_object_permission_details": "<AssignWorkspaceObjectPermissionDetails>",
  "revoke_workspace_object_permission_details": "<RevokeWorkspaceObjectPermissionDetails>"
}
```
---

**Return:** [Back to Workspace Object](#workspace-object) • [Top](#top)

#### `aidp workspace-object move`
<a id="workspace-object-move"></a>
Moves a workspace object to different location.

**Usage:**

`aidp workspace-object move <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `move-workspace-object-details` (object, required) — Details for moving the workspace object to a different path.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
**Request Body (`MoveWorkspaceObjectDetails`):**
- `from_path` (str, optional) — from_path of this MoveWorkspaceObjectDetails
- `to_path` (str, optional) — to_path of this MoveWorkspaceObjectDetails
**Example:**
```json
{
  "from_path": "<string>",
  "to_path": "<string>"
}
```
---

**Return:** [Back to Workspace Object](#workspace-object) • [Top](#top)

#### `aidp workspace-object rename`
<a id="workspace-object-rename"></a>
Renames a workspace object.

**Usage:**

`aidp workspace-object rename <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `rename-workspace-object-details` (object, required) — Details for renaming the workspace object.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
**Request Body (`RenameWorkspaceObjectDetails`):**
- `path` (str, optional) — path of this RenameWorkspaceObjectDetails
- `new_name` (str, optional) — new_name of this RenameWorkspaceObjectDetails
**Example:**
```json
{
  "path": "<string>",
  "new_name": "<string>"
}
```
---

**Return:** [Back to Workspace Object](#workspace-object) • [Top](#top)

#### `aidp workspace-object update`
<a id="workspace-object-update"></a>
Updates a workspace object with the provided information.

**Usage:**

`aidp workspace-object update <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <OBJECT-PATH> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `object-path` (string, required) — The fully qualified path of the workspace object.

**Options:**
- `update-workspace-object-details` (object, required) — The information to be updated.
- `object-description` (string, optional) — The description of the workspace object
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---

**Return:** [Back to Workspace Object](#workspace-object) • [Top](#top)

#### `aidp workspace-object upload-with-par`
<a id="workspace-object-upload-with-par"></a>
Creates a workspace file by generating PAR or updates the metadata by close file.
Creates a workspace file by generating PAR or updates the metadata by close file. If file exists, then it will be updated.

**Usage:**

`aidp workspace-object upload-with-par <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace

**Options:**
- `upload-file-with-par-details` (object, required) — Contents of the file to upload.
- `is-overwrite` (boolean, optional) — A boolean which decides if overwrite is allowed
- `should-generate-new-par` (boolean, optional) — Flag to toggle to generate short living par
- `object-description` (string, optional) — The description of the workspace object
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `path` (string, required) — The absolute path of the file or folder
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `type` (string, optional) — The type of workspace object.
**Request Body (`UploadFileWithParDetails`):**
- `action` (str, optional) — action of this UploadFileWithParDetails
- `e_tag` (str, optional) — e_tag of this UploadFileWithParDetails
- `size` (int, optional) — size of this UploadFileWithParDetails
- `system_tags` (dict(str, dict(str, object)), optional) — system_tags of this UploadFileWithParDetails
**Example:**
```json
{
  "action": "<string>",
  "e_tag": "<string>",
  "size": 123,
  "system_tags": "<dict(str, dict(str, object))>"
}
```
---

**Return:** [Back to Workspace Object](#workspace-object) • [Top](#top)

