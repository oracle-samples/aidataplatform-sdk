<a id="top"></a>
# AIDP Python SDK Operations Reference
This document summarizes the available service clients in the AIDP Python SDK and details every operation's request parameters and responses. 
## Clients
- [Async Operations (AsyncOperationsClient)](#async-operations-asyncoperationsclient)
- [Audit (AuditClient)](#audit-auditclient)
- [Bundle (BundleClient)](#bundle-bundleclient)
- [Catalog (CatalogClient)](#catalog-catalogclient)
- [Cluster (ClusterClient)](#cluster-clusterclient)
- [Credentials (CredentialsClient)](#credentials-credentialsclient)
- [Delta Share (DeltaShareClient)](#delta-share-deltashareclient)
- [Git (GitClient)](#git-gitclient)
- [ML Ops (MLOpsClient)](#ml-ops-mlopsclient)
- [Notebook (NotebookClient)](#notebook-notebookclient)
- [Role (RoleClient)](#role-roleclient)
- [Schema (SchemaClient)](#schema-schemaclient)
- [User Setting (UserSettingClient)](#user-setting-usersettingclient)
- [Volume (VolumeClient)](#volume-volumeclient)
- [Workflow (WorkflowClient)](#workflow-workflowclient)
- [Workspace (WorkspaceClient)](#workspace-workspaceclient)
- [Workspace Object (WorkspaceObjectClient)](#workspace-object-workspaceobjectclient)
## Async Operations (AsyncOperationsClient)
**Operations:**
- [get_async_operation](#get-async-operation)
- [list_async_operations](#list-async-operations)
### `get_async_operation`
<a id="get-async-operation"></a>
Get detailed information for a particular async operation

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `async_operation_key` (str) — unique identifier of an async operation


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.AsyncOperation]` — An async operation

**Response Fields:**

- `key` (str (required)) — key of this AsyncOperation. unique key that identifies an async operation
- `resource_type` (str (required)) — resource_type of this AsyncOperation. resource type of async operation. .
- `action_type` (str (required)) — action_type of this AsyncOperation. action type of async operation. .
- `resource_name` (str (required)) — resource_name of this AsyncOperation. fully qualified name of Data Lake resource. .<schema_name>.<table_name>. For Cluster, it is <workspace_key>.<cluster_key>
- `resource_display_name` (str) — resource_display_name of this AsyncOperation. display name of Data Lake resource
- `created_by` (str) — created_by of this AsyncOperation. principal Id who started async operation
- `created_by_name` (str) — created_by_name of this AsyncOperation. principal name who started async operation
- `time_started` (datetime (required)) — time_started of this AsyncOperation. date and time Async operation was started, in format defined by RFC 3339. .600Z
- `time_finished` (datetime) — time_finished of this AsyncOperation. date and time Async operation finished, in format defined by RFC 3339
- `status` (str (required)) — status of this AsyncOperation. state of Table. .
- `error_code` (str) — error_code of this AsyncOperation. error code of a failure
- `error_message` (str) — error_message of this AsyncOperation. s extra error information of a failure


**Return:** [Back to Async Operations](#async-operations) • [Top](#top)

### `list_async_operations`
<a id="list-async-operations"></a>
List all async operations for a resource type.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance


**Optional Parameters:**

- `resource_type` (str) — Required parameter which decides async operation resource type
- `resource_name` (str) — A filter to return only resources that match given resource name exactly
- `match_resource_name` (bool) — Parameter which decides to list async operations with prefix or exact match to resourceName
- `status` (str) — Option parameter to filter operation on status
- `should_filter_by_calling_principal` (bool) — A filter to return only resources that match current principal
- `limit` (int) — For list pagination. maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination
- `page` (str) — For list pagination. value of opc-next-page response header from previous "List" call. For important details about how pagination works, see List Pagination
- `sort_order` (str) — sort order to use, either ascending (ASC) or descending (DESC).
- `sort_by` (str) — field to sort by. You can provide only one sort order. Default order for timeStarted is descending.
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.AsyncOperationCollection]` — Result of listing Async Operations

**Response Fields:**

- `items` (list[AsyncOperationSummary] (required)) — items of this AsyncOperationCollection. List of Async Operations


**Return:** [Back to Async Operations](#async-operations) • [Top](#top)

## Audit (AuditClient)
**Operations:**
- [manage_audit_logs](#manage-audit-logs)
- [search_audit_logs](#search-audit-logs)
### `manage_audit_logs`
<a id="manage-audit-logs"></a>
Manages audit logs for AI Data Platform Workbench.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `manage_audit_logs_details` (oci.aidataplatform_dp.models.ManageAuditLogsDetails) — Details to update in an audit log


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Audit (AuditClient)](#audit-auditclient) • [Top](#top)

### `search_audit_logs`
<a id="search-audit-logs"></a>
Searches audit logs for AI Data Platform Workbench.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `search_audit_logs_details` (oci.aidataplatform_dp.models.SearchAuditLogsDetails) — Details for audit log search


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `limit` (int) — For list pagination. maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination
- `page` (str) — For list pagination. value of opc-next-page response header from previous "List" call. For important details about how pagination works, see List Pagination
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.AuditLogSearchResultCollection]` — Search results for audit log search request

**Response Fields:**

- `items` (list[AuditLogSearchResultSummary] (required)) — items of this AuditLogSearchResultCollection. Audit log search results


**Return:** [Back to Audit (AuditClient)](#audit-auditclient) • [Top](#top)

## Bundle (BundleClient)
**Operations:**
- [create_bundle](#create-bundle)
- [deploy_bundle](#deploy-bundle)
- [fetch_bundle_deployment_status](#fetch-bundle-deployment-status)
- [purge_bundle](#purge-bundle)
- [sync_bundle](#sync-bundle)
### `create_bundle`
<a id="create-bundle"></a>
(Preview) Creates a new bundle.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `create_bundle_details` (oci.aidataplatform_dp.models.CreateBundleDetails) — Request payload for bundle creation


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Bundle (BundleClient)](#bundle-bundleclient) • [Top](#top)

### `deploy_bundle`
<a id="deploy-bundle"></a>
(Preview) Deploys the specified bundle, creating or updating jobs and agent flows according to the bundle manifest.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `deploy_bundle_details` (oci.aidataplatform_dp.models.DeployBundleDetails) — Request payload for bundle deploy


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Bundle (BundleClient)](#bundle-bundleclient) • [Top](#top)

### `fetch_bundle_deployment_status`
<a id="fetch-bundle-deployment-status"></a>
(Preview) Returns a high-level summary of the most recent deployment activity recorded for the

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `fetch_bundle_deployment_status_details` (oci.aidataplatform_dp.models.FetchBundleDeploymentStatusDetails) — Request payload for FetchBundleDeploymentStatusDetails


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.BundleDeploymentStatus]` — Summary of most recent completed bundle deployment

**Response Fields:**

- `status` (str (required)) — status of this BundleDeploymentStatus. Overall status of last deployment. .
- `time_started` (datetime (required)) — time_started of this BundleDeploymentStatus. deployment start time
- `time_completed` (datetime (required)) — time_completed of this BundleDeploymentStatus. deployment end time
- `message` (str) — message of this BundleDeploymentStatus. Optional summary message for last deployment
- `resources` (list[BundleDeployedResource]) — resources of this BundleDeploymentStatus. List of resources from last deployment


**Return:** [Back to Bundle (BundleClient)](#bundle-bundleclient) • [Top](#top)

### `purge_bundle`
<a id="purge-bundle"></a>
(Preview) Tears down all resources deployed by the specified bundle in the workspace.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `purge_bundle_details` (oci.aidataplatform_dp.models.PurgeBundleDetails) — Request payload for bundle purge


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Bundle (BundleClient)](#bundle-bundleclient) • [Top](#top)

### `sync_bundle`
<a id="sync-bundle"></a>
(Preview) Synchronizes the code, descriptors, and mapping in the bundle by reconciling the contents with the resource origins.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `sync_bundle_details` (oci.aidataplatform_dp.models.SyncBundleDetails) — Request payload for bundle sync


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Bundle (BundleClient)](#bundle-bundleclient) • [Top](#top)

## Catalog (CatalogClient)
**Operations:**
- [catalog_test_connection](#catalog-test-connection)
- [create_catalog](#create-catalog)
- [delete_catalog](#delete-catalog)
- [get_catalog](#get-catalog)
- [list_catalog_permissions](#list-catalog-permissions)
- [list_catalogs](#list-catalogs)
- [manage_catalog_permission](#manage-catalog-permission)
- [refresh_catalog](#refresh-catalog)
- [update_catalog](#update-catalog)
### `catalog_test_connection`
<a id="catalog-test-connection"></a>
Test the connection of an AI Data Platform Workbench to an external catalog.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `catalog_test_connection_details` (oci.aidataplatform_dp.models.CatalogTestConnectionDetails) — Details for AI Data Platform Workbench catalog to be tested for connection


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Catalog (CatalogClient)](#catalog-catalogclient) • [Top](#top)

### `create_catalog`
<a id="create-catalog"></a>
Create a catalog in the AI Data Platform Workbench with the given ID.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `create_catalog_details` (oci.aidataplatform_dp.models.CreateCatalogDetails) — Details for new AI Data Platform Workbench catalog


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Catalog (CatalogClient)](#catalog-catalogclient) • [Top](#top)

### `delete_catalog`
<a id="delete-catalog"></a>
Deletes the specified catalog from an AI Data Platform Workbench.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `catalog_key` (str) — key of catalog


**Optional Parameters:**

- `is_forced` (bool) — A boolean which decides if an entity should be deleted with Cascade effect
- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Catalog (CatalogClient)](#catalog-catalogclient) • [Top](#top)

### `get_catalog`
<a id="get-catalog"></a>
Gets detailed information about an AI Data Platform Workbench catalog with a given catalog key.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `catalog_key` (str) — key of catalog


**Optional Parameters:**

- `is_catalog_guid` (bool) — A boolean which decides if catalogKey path parameter is catalog GUID (UUID) or name
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.Catalog]` — AI Data Platform Workbench catalogs enable you to manage your data and metadata

**Response Fields:**

- `key` (str (required)) — key of this Catalog. AI Data Platform Workbench catalog key
- `display_name` (str (required)) — display_name of this Catalog. Catalog display name
- `description` (str) — description of this Catalog. Short description of catalog
- `catalog_guid` (str) — catalog_guid of this Catalog. Unique identifier for catalog
- `catalog_type` (str) — catalog_type of this Catalog. Type of catalog
- `source_type` (str) — source_type of this Catalog. External catalog source type
- `connection_details` (CatalogConnectionDetails) — connection_details of this Catalog
- `lifecycle_state` (str) — lifecycle_state of this Catalog. current status of catalog
- `lifecycle_state_details` (str) — lifecycle_state_details of this Catalog. A message describing current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state
- `time_created` (datetime (required)) — time_created of this Catalog. date and time AI Data Platform Workbench catalog was created
- `time_updated` (datetime) — time_updated of this Catalog. date and time AI Data Platform Workbench catalog was updated
- `created_by` (str) — created_by of this Catalog. ID of user that created catalog
- `updated_by` (str) — updated_by of this Catalog. ID of last user to update catalog
- `properties` (dict(str, str)) — properties of this Catalog. Key-value pair used to provide catalog properties like subCompartment OCID where buckets need to reside


**Return:** [Back to Catalog (CatalogClient)](#catalog-catalogclient) • [Top](#top)

### `list_catalog_permissions`
<a id="list-catalog-permissions"></a>
Gets a list of all permissions in the specified catalog of an AI Data Platform Workbench.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `catalog_key` (str) — key of catalog


**Optional Parameters:**

- `limit` (int) — For list pagination. maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination
- `page` (str) — For list pagination. value of opc-next-page response header from previous "List" call. For important details about how pagination works, see List Pagination
- `sort_order` (str) — sort order to use, either ascending (ASC) or descending (DESC).
- `sort_by` (str) — field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending.
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.CatalogPermissionCollection]` — Catalog permissions

**Response Fields:**

- `items` (list[CatalogPermissionSummary] (required)) — items of this CatalogPermissionCollection. List of catalog permissions


**Return:** [Back to Catalog (CatalogClient)](#catalog-catalogclient) • [Top](#top)

### `list_catalogs`
<a id="list-catalogs"></a>
Get a list of catalogs in an AI Data Platform Workbench with a given ID.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance


**Optional Parameters:**

- `display_name` (str) — A filter to return only resources that match given display name exactly
- `catalog_state` (str) — state of catalog.
- `catalog_type` (str) — type of catalog.
- `limit` (int) — For list pagination. maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination
- `page` (str) — For list pagination. value of opc-next-page response header from previous "List" call. For important details about how pagination works, see List Pagination
- `sort_order` (str) — sort order to use, either ascending (ASC) or descending (DESC).
- `sort_by` (str) — field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending.
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.CatalogCollection]` — Catalog List

**Response Fields:**

- `items` (list[CatalogSummary] (required)) — items of this CatalogCollection. List of catalogs


**Return:** [Back to Catalog (CatalogClient)](#catalog-catalogclient) • [Top](#top)

### `manage_catalog_permission`
<a id="manage-catalog-permission"></a>
Update permission details for a catalog in an AI Data Platform Workbench.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `catalog_key` (str) — key of catalog
- `manage_catalog_permission_details` (oci.aidataplatform_dp.models.ManageCatalogPermissionDetails) — information to be updated


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Catalog (CatalogClient)](#catalog-catalogclient) • [Top](#top)

### `refresh_catalog`
<a id="refresh-catalog"></a>
Refresh a catalog in an AI Data Platform Workbench through a crawler.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `catalog_key` (str) — key of catalog


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Catalog (CatalogClient)](#catalog-catalogclient) • [Top](#top)

### `update_catalog`
<a id="update-catalog"></a>
Update the details of an AI Data Platform Workbench catalog with the given information.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `catalog_key` (str) — key of catalog
- `update_catalog_details` (oci.aidataplatform_dp.models.UpdateCatalogDetails) — information to be updated


**Optional Parameters:**

- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Catalog (CatalogClient)](#catalog-catalogclient) • [Top](#top)

## Cluster (ClusterClient)
**Operations:**
- [create_cluster](#create-cluster)
- [delete_cluster](#delete-cluster)
- [download_cluster_logs](#download-cluster-logs)
- [get_cluster](#get-cluster)
- [get_default_cluster](#get-default-cluster)
- [list_cluster_libraries](#list-cluster-libraries)
- [list_cluster_permissions](#list-cluster-permissions)
- [list_clusters](#list-clusters)
- [manage_cluster_permission](#manage-cluster-permission)
- [patch_cluster_library](#patch-cluster-library)
- [restart_cluster](#restart-cluster)
- [search_cluster_logs](#search-cluster-logs)
- [start_cluster](#start-cluster)
- [stop_cluster](#stop-cluster)
- [summarize_metrics_data](#summarize-metrics-data)
- [update_cluster](#update-cluster)
### `create_cluster`
<a id="create-cluster"></a>
Creates a new cluster with the provided details.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `create_cluster_details` (oci.aidataplatform_dp.models.CreateClusterDetails) — Details for new cluster


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.Cluster]` — A Cluster is a compute subresource within AI Data Platform Workbench. Compute/Runtime Clusters are Spark execution environments

**Response Fields:**

- `key` (str (required)) — key of this Cluster. Cluster key
- `display_name` (str (required)) — display_name of this Cluster. Cluster name
- `description` (str) — description of this Cluster. Cluster description
- `source_api` (str) — source_api of this Cluster. User created clusters are associated with a particular workspace. Default cluster is to be used by all catalogs operations that require compute. Default cluster can be thought of as associated with Master catalog. Agent Flow Compute is used to execute Agent Flows
- `type` (str) — type of this Cluster. ClusterType
- `time_created` (datetime (required)) — time_created of this Cluster. Date and time cluster was created
- `time_updated` (datetime) — time_updated of this Cluster. Date and time cluster was updated
- `state` (str (required)) — state of this Cluster. Common lifecycle states for resources in a compute cluster. ACCEPTED - resource create request has been accepted. CREATING - resource is being created and might not be usable until entire metadata is defined. ACTIVE - resource is valid and available for access. DELETING - resource is being deleted, and might require a deep clean of any children. DELETED - resource has been deleted, and isn't available. FAILED - resource is in a failed state due to validation or other errors. STOPPING - resource is being stopped. STOPPED - resource has been stopped. UPDATING - resource is being updated and might not be usable until all changes are commited. STARTING - resource is being started. RESTARTING - resource is being restarted. .
- `state_details` (str) — state_details of this Cluster. A message that describes current state of workspace cluster in more detail. For example, can be used to provide actionable information for a resource in Failed state
- `node_type` (str) — node_type of this Cluster. Cluster node type encodes node shape and associated resources
- `driver_config` (DriverConfig) — driver_config of this Cluster
- `active_cluster_resources` (ActiveClusterResources) — active_cluster_resources of this Cluster
- `created_by` (str) — created_by of this Cluster. OCID of user who created this record
- `created_by_name` (str) — created_by_name of this Cluster. Name of user who created this record
- `updated_by` (str) — updated_by of this Cluster. OCID of user who updated this record
- `updated_by_name` (str) — updated_by_name of this Cluster. Name of user who updated this record
- `stopped_by` (str) — stopped_by of this Cluster. OCID of user who stopped cluster. Value will be 'SYSTEM' if it was auto stopped
- `stopped_by_name` (str) — stopped_by_name of this Cluster. Name of user who stopped cluster. Value will be 'SYSTEM' if it was auto stopped


**Return:** [Back to Cluster (ClusterClient)](#cluster-clusterclient) • [Top](#top)

### `delete_cluster`
<a id="delete-cluster"></a>
Deletes a cluster from a workspace.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `cluster_key` (str) — Cluster key


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Cluster (ClusterClient)](#cluster-clusterclient) • [Top](#top)

### `download_cluster_logs`
<a id="download-cluster-logs"></a>
Downloads logs within the specified cluster and time range.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `cluster_key` (str) — Cluster key
- `download_cluster_logs_details` (oci.aidataplatform_dp.models.DownloadClusterLogsDetails) — Request payload containing parameters for filtering cluster logs


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Cluster (ClusterClient)](#cluster-clusterclient) • [Top](#top)

### `get_cluster`
<a id="get-cluster"></a>
Returns detailed information about a cluster.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `cluster_key` (str) — Cluster key


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.Cluster]` — A Cluster is a compute subresource within AI Data Platform Workbench. Compute/Runtime Clusters are Spark execution environments

**Response Fields:**

- `key` (str (required)) — key of this Cluster. Cluster key
- `display_name` (str (required)) — display_name of this Cluster. Cluster name
- `description` (str) — description of this Cluster. Cluster description
- `source_api` (str) — source_api of this Cluster. User created clusters are associated with a particular workspace. Default cluster is to be used by all catalogs operations that require compute. Default cluster can be thought of as associated with Master catalog. Agent Flow Compute is used to execute Agent Flows
- `type` (str) — type of this Cluster. ClusterType
- `time_created` (datetime (required)) — time_created of this Cluster. Date and time cluster was created
- `time_updated` (datetime) — time_updated of this Cluster. Date and time cluster was updated
- `state` (str (required)) — state of this Cluster. Common lifecycle states for resources in a compute cluster. ACCEPTED - resource create request has been accepted. CREATING - resource is being created and might not be usable until entire metadata is defined. ACTIVE - resource is valid and available for access. DELETING - resource is being deleted, and might require a deep clean of any children. DELETED - resource has been deleted, and isn't available. FAILED - resource is in a failed state due to validation or other errors. STOPPING - resource is being stopped. STOPPED - resource has been stopped. UPDATING - resource is being updated and might not be usable until all changes are commited. STARTING - resource is being started. RESTARTING - resource is being restarted. .
- `state_details` (str) — state_details of this Cluster. A message that describes current state of workspace cluster in more detail. For example, can be used to provide actionable information for a resource in Failed state
- `node_type` (str) — node_type of this Cluster. Cluster node type encodes node shape and associated resources
- `driver_config` (DriverConfig) — driver_config of this Cluster
- `active_cluster_resources` (ActiveClusterResources) — active_cluster_resources of this Cluster
- `created_by` (str) — created_by of this Cluster. OCID of user who created this record
- `created_by_name` (str) — created_by_name of this Cluster. Name of user who created this record
- `updated_by` (str) — updated_by of this Cluster. OCID of user who updated this record
- `updated_by_name` (str) — updated_by_name of this Cluster. Name of user who updated this record
- `stopped_by` (str) — stopped_by of this Cluster. OCID of user who stopped cluster. Value will be 'SYSTEM' if it was auto stopped
- `stopped_by_name` (str) — stopped_by_name of this Cluster. Name of user who stopped cluster. Value will be 'SYSTEM' if it was auto stopped


**Return:** [Back to Cluster (ClusterClient)](#cluster-clusterclient) • [Top](#top)

### `get_default_cluster`
<a id="get-default-cluster"></a>
Gets information about the master catalog default cluster.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.DefaultCluster]` — default cluster created by AI Data Platform Workbench

**Response Fields:**

- `key` (str)
- `display_name` (str)
- `description` (str)
- `source_api` (str)
- `type` (str)
- `time_created` (datetime)
- `time_updated` (datetime)
- `state` (str)
- `state_details` (str)
- `node_type` (str)
- `driver_config` (DriverConfig)
- `active_cluster_resources` (ActiveClusterResources)
- `created_by` (str)
- `created_by_name` (str)
- `updated_by` (str)
- `updated_by_name` (str)
- `stopped_by` (str)
- `stopped_by_name` (str)
- `workspace_key` (str) — workspace_key of this DefaultCluster. key of AI Data Platform Workbench workspace where default cluster is
- `worker_config` (WorkerConfig) — worker_config of this DefaultCluster
- `cluster_runtime_config` (ClusterRuntimeConfig) — cluster_runtime_config of this DefaultCluster
- `logging_config` (LoggingConfig) — logging_config of this DefaultCluster
- `auto_termination_minutes` (int) — auto_termination_minutes of this DefaultCluster. Optional timeout value in minutes used to automatically stop idle compute clusters
- `jdbc_endpoint_url` (str) — jdbc_endpoint_url of this DefaultCluster. Spark JDBC URL
- `log_id` (str) — log_id of this DefaultCluster. OCID of log where cluster logs are published and retrieved. This logId is always created within logGroupId returned in response payload
- `log_group_id` (str) — log_group_id of this DefaultCluster. unique OCID that identifies a specific log group within OCI Logging. This log group is exclusively associated with AI Data Platform Workbench instance and is created in same compartment within customer’s tenancy as AI Data Platform Workbench instance
- `subscription` (SubscriptionDetails) — subscription of this DefaultCluster


**Return:** [Back to Cluster (ClusterClient)](#cluster-clusterclient) • [Top](#top)

### `list_cluster_libraries`
<a id="list-cluster-libraries"></a>
Gets a list of libraries installed on a cluster.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `cluster_key` (str) — Cluster key


**Optional Parameters:**

- `display_name` (str) — A filter to return only resources that match given display name exactly
- `limit` (int) — For list pagination. maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination
- `page` (str) — For list pagination. value of opc-next-page response header from previous "List" call. For important details about how pagination works, see List Pagination
- `sort_order` (str) — sort order to use, either ascending (ASC) or descending (DESC).
- `sort_by` (str) — field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending.
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.ClusterLibraryCollection]` — List of cluster libraries

**Response Fields:**

- `items` (list[ClusterLibrarySummary] (required)) — items of this ClusterLibraryCollection. List of cluster libraries


**Return:** [Back to Cluster (ClusterClient)](#cluster-clusterclient) • [Top](#top)

### `list_cluster_permissions`
<a id="list-cluster-permissions"></a>
Return a list of permissions for a given cluster.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `cluster_key` (str) — Cluster key


**Optional Parameters:**

- `display_name` (str) — A filter to return only resources that match given display name exactly
- `limit` (int) — For list pagination. maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination
- `page` (str) — For list pagination. value of opc-next-page response header from previous "List" call. For important details about how pagination works, see List Pagination
- `sort_order` (str) — sort order to use, either ascending (ASC) or descending (DESC).
- `sort_by` (str) — field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending.
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.ClusterPermissionCollection]` — List of cluster permissions

**Response Fields:**

- `items` (list[ClusterPermissionSummary] (required)) — items of this ClusterPermissionCollection. List of cluster permissions


**Return:** [Back to Cluster (ClusterClient)](#cluster-clusterclient) • [Top](#top)

### `list_clusters`
<a id="list-clusters"></a>
Returns a list of all clusters in a given workspace.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace


**Optional Parameters:**

- `state` (str) — A filter to return only resources that match given lifecycle state. state value is case-insensitive.
- `display_name` (str) — A filter to return only resources that match given display name exactly
- `display_name_contains` (str) — A filter to return only resources that have a display name containing text provided
- `type` (str) — Cluster type. When filter is not provided list shows all type of cluster - USER else it show only cluster of type chosen. Only clusters of type USER are attachable to a workspace notebook
- `limit` (int) — For list pagination. maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination
- `page` (str) — For list pagination. value of opc-next-page response header from previous "List" call. For important details about how pagination works, see List Pagination
- `sort_order` (str) — sort order to use, either ascending (ASC) or descending (DESC).
- `sort_by` (str) — field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending.
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.ClusterCollection]` — Results of a cluster list

**Response Fields:**

- `items` (list[ClusterSummary] (required)) — items of this ClusterCollection. List of Clusters


**Return:** [Back to Cluster (ClusterClient)](#cluster-clusterclient) • [Top](#top)

### `manage_cluster_permission`
<a id="manage-cluster-permission"></a>
Updates the permissions for a given cluster.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `cluster_key` (str) — Cluster key
- `manage_cluster_permission_details` (oci.aidataplatform_dp.models.ManageClusterPermissionDetails) — information to be updated


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Cluster (ClusterClient)](#cluster-clusterclient) • [Top](#top)

### `patch_cluster_library`
<a id="patch-cluster-library"></a>
Updates libraries of a cluster with the provided patches.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `cluster_key` (str) — Cluster key
- `patch_cluster_library_details` (oci.aidataplatform_dp.models.PatchClusterLibraryDetails) — information to be updated


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.ClusterLibraryCollection]` — List of cluster libraries

**Response Fields:**

- `items` (list[ClusterLibrarySummary] (required)) — items of this ClusterLibraryCollection. List of cluster libraries


**Return:** [Back to Cluster (ClusterClient)](#cluster-clusterclient) • [Top](#top)

### `restart_cluster`
<a id="restart-cluster"></a>
Restarts a running cluster.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `cluster_key` (str) — Cluster key
- `restart_cluster_details` (oci.aidataplatform_dp.models.RestartClusterDetails) — Details for restarting cluster


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.Cluster]` — A Cluster is a compute subresource within AI Data Platform Workbench. Compute/Runtime Clusters are Spark execution environments

**Response Fields:**

- `key` (str (required)) — key of this Cluster. Cluster key
- `display_name` (str (required)) — display_name of this Cluster. Cluster name
- `description` (str) — description of this Cluster. Cluster description
- `source_api` (str) — source_api of this Cluster. User created clusters are associated with a particular workspace. Default cluster is to be used by all catalogs operations that require compute. Default cluster can be thought of as associated with Master catalog. Agent Flow Compute is used to execute Agent Flows
- `type` (str) — type of this Cluster. ClusterType
- `time_created` (datetime (required)) — time_created of this Cluster. Date and time cluster was created
- `time_updated` (datetime) — time_updated of this Cluster. Date and time cluster was updated
- `state` (str (required)) — state of this Cluster. Common lifecycle states for resources in a compute cluster. ACCEPTED - resource create request has been accepted. CREATING - resource is being created and might not be usable until entire metadata is defined. ACTIVE - resource is valid and available for access. DELETING - resource is being deleted, and might require a deep clean of any children. DELETED - resource has been deleted, and isn't available. FAILED - resource is in a failed state due to validation or other errors. STOPPING - resource is being stopped. STOPPED - resource has been stopped. UPDATING - resource is being updated and might not be usable until all changes are commited. STARTING - resource is being started. RESTARTING - resource is being restarted. .
- `state_details` (str) — state_details of this Cluster. A message that describes current state of workspace cluster in more detail. For example, can be used to provide actionable information for a resource in Failed state
- `node_type` (str) — node_type of this Cluster. Cluster node type encodes node shape and associated resources
- `driver_config` (DriverConfig) — driver_config of this Cluster
- `active_cluster_resources` (ActiveClusterResources) — active_cluster_resources of this Cluster
- `created_by` (str) — created_by of this Cluster. OCID of user who created this record
- `created_by_name` (str) — created_by_name of this Cluster. Name of user who created this record
- `updated_by` (str) — updated_by of this Cluster. OCID of user who updated this record
- `updated_by_name` (str) — updated_by_name of this Cluster. Name of user who updated this record
- `stopped_by` (str) — stopped_by of this Cluster. OCID of user who stopped cluster. Value will be 'SYSTEM' if it was auto stopped
- `stopped_by_name` (str) — stopped_by_name of this Cluster. Name of user who stopped cluster. Value will be 'SYSTEM' if it was auto stopped


**Return:** [Back to Cluster (ClusterClient)](#cluster-clusterclient) • [Top](#top)

### `search_cluster_logs`
<a id="search-cluster-logs"></a>
Searches logs within the specified cluster and time range. Supports pagination and filtering.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `cluster_key` (str) — Cluster key
- `search_cluster_logs_details` (oci.aidataplatform_dp.models.SearchClusterLogsDetails) — Request body containing search parameters for cluster logs


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `limit` (int) — For list pagination. maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination
- `page` (str) — For list pagination. value of opc-next-page response header from previous "List" call. For important details about how pagination works, see List Pagination
- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.ClusterLogCollection]` — Results of a cluster log list

**Response Fields:**

- `items` (list[ClusterLogsSummary] (required)) — items of this ClusterLogCollection. List of cluster logs


**Return:** [Back to Cluster (ClusterClient)](#cluster-clusterclient) • [Top](#top)

### `start_cluster`
<a id="start-cluster"></a>
Starts a cluster that has halted operation.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `cluster_key` (str) — Cluster key
- `start_cluster_details` (oci.aidataplatform_dp.models.StartClusterDetails) — Details of cluster being started


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.Cluster]` — A Cluster is a compute subresource within AI Data Platform Workbench. Compute/Runtime Clusters are Spark execution environments

**Response Fields:**

- `key` (str (required)) — key of this Cluster. Cluster key
- `display_name` (str (required)) — display_name of this Cluster. Cluster name
- `description` (str) — description of this Cluster. Cluster description
- `source_api` (str) — source_api of this Cluster. User created clusters are associated with a particular workspace. Default cluster is to be used by all catalogs operations that require compute. Default cluster can be thought of as associated with Master catalog. Agent Flow Compute is used to execute Agent Flows
- `type` (str) — type of this Cluster. ClusterType
- `time_created` (datetime (required)) — time_created of this Cluster. Date and time cluster was created
- `time_updated` (datetime) — time_updated of this Cluster. Date and time cluster was updated
- `state` (str (required)) — state of this Cluster. Common lifecycle states for resources in a compute cluster. ACCEPTED - resource create request has been accepted. CREATING - resource is being created and might not be usable until entire metadata is defined. ACTIVE - resource is valid and available for access. DELETING - resource is being deleted, and might require a deep clean of any children. DELETED - resource has been deleted, and isn't available. FAILED - resource is in a failed state due to validation or other errors. STOPPING - resource is being stopped. STOPPED - resource has been stopped. UPDATING - resource is being updated and might not be usable until all changes are commited. STARTING - resource is being started. RESTARTING - resource is being restarted. .
- `state_details` (str) — state_details of this Cluster. A message that describes current state of workspace cluster in more detail. For example, can be used to provide actionable information for a resource in Failed state
- `node_type` (str) — node_type of this Cluster. Cluster node type encodes node shape and associated resources
- `driver_config` (DriverConfig) — driver_config of this Cluster
- `active_cluster_resources` (ActiveClusterResources) — active_cluster_resources of this Cluster
- `created_by` (str) — created_by of this Cluster. OCID of user who created this record
- `created_by_name` (str) — created_by_name of this Cluster. Name of user who created this record
- `updated_by` (str) — updated_by of this Cluster. OCID of user who updated this record
- `updated_by_name` (str) — updated_by_name of this Cluster. Name of user who updated this record
- `stopped_by` (str) — stopped_by of this Cluster. OCID of user who stopped cluster. Value will be 'SYSTEM' if it was auto stopped
- `stopped_by_name` (str) — stopped_by_name of this Cluster. Name of user who stopped cluster. Value will be 'SYSTEM' if it was auto stopped


**Return:** [Back to Cluster (ClusterClient)](#cluster-clusterclient) • [Top](#top)

### `stop_cluster`
<a id="stop-cluster"></a>
Stops an active cluster.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `cluster_key` (str) — Cluster key
- `stop_cluster_details` (oci.aidataplatform_dp.models.StopClusterDetails) — Details for stopping cluster


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.Cluster]` — A Cluster is a compute subresource within AI Data Platform Workbench. Compute/Runtime Clusters are Spark execution environments

**Response Fields:**

- `key` (str (required)) — key of this Cluster. Cluster key
- `display_name` (str (required)) — display_name of this Cluster. Cluster name
- `description` (str) — description of this Cluster. Cluster description
- `source_api` (str) — source_api of this Cluster. User created clusters are associated with a particular workspace. Default cluster is to be used by all catalogs operations that require compute. Default cluster can be thought of as associated with Master catalog. Agent Flow Compute is used to execute Agent Flows
- `type` (str) — type of this Cluster. ClusterType
- `time_created` (datetime (required)) — time_created of this Cluster. Date and time cluster was created
- `time_updated` (datetime) — time_updated of this Cluster. Date and time cluster was updated
- `state` (str (required)) — state of this Cluster. Common lifecycle states for resources in a compute cluster. ACCEPTED - resource create request has been accepted. CREATING - resource is being created and might not be usable until entire metadata is defined. ACTIVE - resource is valid and available for access. DELETING - resource is being deleted, and might require a deep clean of any children. DELETED - resource has been deleted, and isn't available. FAILED - resource is in a failed state due to validation or other errors. STOPPING - resource is being stopped. STOPPED - resource has been stopped. UPDATING - resource is being updated and might not be usable until all changes are commited. STARTING - resource is being started. RESTARTING - resource is being restarted. .
- `state_details` (str) — state_details of this Cluster. A message that describes current state of workspace cluster in more detail. For example, can be used to provide actionable information for a resource in Failed state
- `node_type` (str) — node_type of this Cluster. Cluster node type encodes node shape and associated resources
- `driver_config` (DriverConfig) — driver_config of this Cluster
- `active_cluster_resources` (ActiveClusterResources) — active_cluster_resources of this Cluster
- `created_by` (str) — created_by of this Cluster. OCID of user who created this record
- `created_by_name` (str) — created_by_name of this Cluster. Name of user who created this record
- `updated_by` (str) — updated_by of this Cluster. OCID of user who updated this record
- `updated_by_name` (str) — updated_by_name of this Cluster. Name of user who updated this record
- `stopped_by` (str) — stopped_by of this Cluster. OCID of user who stopped cluster. Value will be 'SYSTEM' if it was auto stopped
- `stopped_by_name` (str) — stopped_by_name of this Cluster. Name of user who stopped cluster. Value will be 'SYSTEM' if it was auto stopped


**Return:** [Back to Cluster (ClusterClient)](#cluster-clusterclient) • [Top](#top)

### `summarize_metrics_data`
<a id="summarize-metrics-data"></a>
Provides summarized compute metrics for a compute cluster in the given workspace.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `cluster_key` (str) — Cluster key
- `summarize_metrics_data_details` (oci.aidataplatform_dp.models.SummarizeMetricsDataDetails) — Request body containing metric parameters


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.SummarizeMetricsResponse]` — Response payload containing summarized metric data

**Response Fields:**

- `results` (list[MetricsSummary] (required)) — results of this SummarizeMetricsResponse. List of computed metric summary results


**Return:** [Back to Cluster (ClusterClient)](#cluster-clusterclient) • [Top](#top)

### `update_cluster`
<a id="update-cluster"></a>
Update the details of a given cluster.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `cluster_key` (str) — Cluster key
- `update_cluster_details` (oci.aidataplatform_dp.models.UpdateClusterDetails) — information to be updated


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.Cluster]` — A Cluster is a compute subresource within AI Data Platform Workbench. Compute/Runtime Clusters are Spark execution environments

**Response Fields:**

- `key` (str (required)) — key of this Cluster. Cluster key
- `display_name` (str (required)) — display_name of this Cluster. Cluster name
- `description` (str) — description of this Cluster. Cluster description
- `source_api` (str) — source_api of this Cluster. User created clusters are associated with a particular workspace. Default cluster is to be used by all catalogs operations that require compute. Default cluster can be thought of as associated with Master catalog. Agent Flow Compute is used to execute Agent Flows
- `type` (str) — type of this Cluster. ClusterType
- `time_created` (datetime (required)) — time_created of this Cluster. Date and time cluster was created
- `time_updated` (datetime) — time_updated of this Cluster. Date and time cluster was updated
- `state` (str (required)) — state of this Cluster. Common lifecycle states for resources in a compute cluster. ACCEPTED - resource create request has been accepted. CREATING - resource is being created and might not be usable until entire metadata is defined. ACTIVE - resource is valid and available for access. DELETING - resource is being deleted, and might require a deep clean of any children. DELETED - resource has been deleted, and isn't available. FAILED - resource is in a failed state due to validation or other errors. STOPPING - resource is being stopped. STOPPED - resource has been stopped. UPDATING - resource is being updated and might not be usable until all changes are commited. STARTING - resource is being started. RESTARTING - resource is being restarted. .
- `state_details` (str) — state_details of this Cluster. A message that describes current state of workspace cluster in more detail. For example, can be used to provide actionable information for a resource in Failed state
- `node_type` (str) — node_type of this Cluster. Cluster node type encodes node shape and associated resources
- `driver_config` (DriverConfig) — driver_config of this Cluster
- `active_cluster_resources` (ActiveClusterResources) — active_cluster_resources of this Cluster
- `created_by` (str) — created_by of this Cluster. OCID of user who created this record
- `created_by_name` (str) — created_by_name of this Cluster. Name of user who created this record
- `updated_by` (str) — updated_by of this Cluster. OCID of user who updated this record
- `updated_by_name` (str) — updated_by_name of this Cluster. Name of user who updated this record
- `stopped_by` (str) — stopped_by of this Cluster. OCID of user who stopped cluster. Value will be 'SYSTEM' if it was auto stopped
- `stopped_by_name` (str) — stopped_by_name of this Cluster. Name of user who stopped cluster. Value will be 'SYSTEM' if it was auto stopped


**Return:** [Back to Cluster (ClusterClient)](#cluster-clusterclient) • [Top](#top)

## Credentials (CredentialsClient)
**Operations:**
- [create_credential](#create-credential)
- [delete_credential](#delete-credential)
- [get_credential](#get-credential)
- [list_credentials](#list-credentials)
- [update_credential](#update-credential)
### `create_credential`
<a id="create-credential"></a>
Creates a new credential object with the provided details. The operation completes synchronously; callers can invoke list or get to retrieve the resource payload.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `create_data_lake_credential_details` (oci.aidataplatform_dp.models.CreateDataLakeCredentialDetails) — Details for new credential object. When internal flag is enabled, callers must supply a namespace value of default or user_settings in payload


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Credentials (CredentialsClient)](#credentials-credentialsclient) • [Top](#top)

### `delete_credential`
<a id="delete-credential"></a>
Deletes a credential object. The operation completes synchronously without a response body.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `credential_key` (str) — unique identifier of an credential


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Credentials (CredentialsClient)](#credentials-credentialsclient) • [Top](#top)

### `get_credential`
<a id="get-credential"></a>
Gets detailed information about credential with a given credential key.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `credential_key` (str) — unique identifier of an credential


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.Credential]` — a credential object for public API consumers

**Response Fields:**

- `key` (str (required)) — key of this Credential. unique identifier for credential object
- `display_name` (str (required)) — display_name of this Credential. A user-friendly name for credential object. This value does not have to be unique and can be changed. Must start with a letter and contain only letters, numbers, or underscores. Avoid entering confidential information
- `type` (str) — type of this Credential. type of credential stored.
- `credential_details` (CredentialDetails) — credential_details of this Credential
- `credential_description` (str) — credential_description of this Credential. A brief summary of credential object and its purpose
- `lifecycle_state` (str) — lifecycle_state of this Credential. current state of credential object.
- `lifecycle_state_details` (str) — lifecycle_state_details of this Credential. Additional details or reasons regarding current lifecycle state. Often used to provide actionable information (e.g., for resources in a Failed state)
- `time_created` (datetime) — time_created of this Credential. date and time when credential object was created, in RFC 3339 timestamp format
- `time_updated` (datetime) — time_updated of this Credential. date and time when credential object was most recently updated, in RFC 3339 timestamp format
- `created_by` (str) — created_by of this Credential. unique identifier of user who created credential object
- `updated_by` (str) — updated_by of this Credential. unique identifier of user who last updated credential object


**Return:** [Back to Credentials (CredentialsClient)](#credentials-credentialsclient) • [Top](#top)

### `list_credentials`
<a id="list-credentials"></a>
Returns a list of credentials.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance


**Optional Parameters:**

- `display_name` (str) — A filter to return only resources that match given display name exactly
- `display_name_contains` (str) — A filter to return only resources whose displayName contains provided value (case-insensitive)
- `lifecycle_state` (str) — A filter to return only resources whose lifecycleState matches provided value
- `limit` (int) — For list pagination. maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination
- `page` (str) — For list pagination. value of opc-next-page response header from previous "List" call. For important details about how pagination works, see List Pagination
- `sort_order` (str) — sort order to use, either ascending (ASC) or descending (DESC).
- `sort_by` (str) — field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending.
- `credential_type` (str) — type of Credential
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.CredentialCollection]` — Result set returned by listing credentials through public API

**Response Fields:**

- `items` (list[CredentialSummary] (required)) — items of this CredentialCollection. List of credential summaries


**Return:** [Back to Credentials (CredentialsClient)](#credentials-credentialsclient) • [Top](#top)

### `update_credential`
<a id="update-credential"></a>
Updates a credential object. The operation completes synchronously; callers can invoke get to confirm the latest state.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `credential_key` (str) — unique identifier of an credential
- `update_data_lake_credential_details` (oci.aidataplatform_dp.models.UpdateDataLakeCredentialDetails) — information to be updated


**Optional Parameters:**

- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Credentials (CredentialsClient)](#credentials-credentialsclient) • [Top](#top)

## Delta Share (DeltaShareClient)
**Operations:**
- [create_recipient](#create-recipient)
- [create_share](#create-share)
- [delete_recipient](#delete-recipient)
- [delete_share](#delete-share)
- [get_recipient](#get-recipient)
- [get_share](#get-share)
- [list_recipient_permissions](#list-recipient-permissions)
- [list_recipient_shares](#list-recipient-shares)
- [list_recipients](#list-recipients)
- [list_share_data_assets](#list-share-data-assets)
- [list_share_permissions](#list-share-permissions)
- [list_share_recipients](#list-share-recipients)
- [list_shares](#list-shares)
- [manage_recipient_permission](#manage-recipient-permission)
- [manage_share_access](#manage-share-access)
- [manage_share_data_asset](#manage-share-data-asset)
- [manage_share_permission](#manage-share-permission)
- [update_recipient](#update-recipient)
- [update_share](#update-share)
### `create_recipient`
<a id="create-recipient"></a>
Creates a recipient for a Delta Share protocol in AI Data Platform Workbench.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `create_recipient_details` (oci.aidataplatform_dp.models.CreateRecipientDetails) — Details for new recipient for Delta Share protocol in AI Data Platform Workbench


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.Recipient]` — A Delta Share recipient can access data assets in AI Data Platform Workbench through Delta Share Protocol

**Response Fields:**

- `key` (str (required)) — key of this Recipient. Unique identifier for this recipient in AI Data Platform Workbench instance
- `display_name` (str (required)) — display_name of this Recipient. A user-friendly name. Has to be unique within AI Data Platform Workbench instance
- `description` (str) — description of this Recipient. Short description of Recipient
- `time_created` (datetime (required)) — time_created of this Recipient. date and time Delta Share recipient was created, in format defined by <a href=" target="_blank" rel="noopener noreferrer">RFC 3339</a>. .600Z
- `time_updated` (datetime) — time_updated of this Recipient. date and time Delta Share recipient was updated, in format defined by <a href=" target="_blank" rel="noopener noreferrer">RFC 3339</a>
- `share_count` (int (required)) — share_count of this Recipient. number of shares this recipient has access on
- `created_by` (str (required)) — created_by of this Recipient. ID of user who created recipient
- `updated_by` (str) — updated_by of this Recipient. ID of user who last updated recipient
- `properties` (dict(str, str)) — properties of this Recipient. Key-value pair representing a defined tag key and value.
- `lifecycle_state` (str (required)) — lifecycle_state of this Recipient. state of recipient. .
- `lifecycle_state_details` (str) — lifecycle_state_details of this Recipient. A message describing current state in more detail


**Return:** [Back to Delta Share (DeltaShareClient)](#delta-share-deltashareclient) • [Top](#top)

### `create_share`
<a id="create-share"></a>
Create a Delta Share protocol in AI Data Platform Workbench.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `create_share_details` (oci.aidataplatform_dp.models.CreateShareDetails) — Details for new share for Delta Share protocol in AI Data Platform Workbench


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.Share]` — A share is used to access data assets in AI Data Platform Workbench through Delta Share Protocol

**Response Fields:**

- `key` (str (required)) — key of this Share. Unique identifier for this share in AI Data Platform Workbench instance
- `display_name` (str (required)) — display_name of this Share. A user-friendly name. Has to be unique within AI Data Platform Workbench instance
- `description` (str) — description of this Share. A description associated with this share
- `time_created` (datetime (required)) — time_created of this Share. date and time Delta Share was created, in format defined by <a href=" target="_blank" rel="noopener noreferrer">RFC 3339</a>. .600Z
- `time_updated` (datetime) — time_updated of this Share. date and time Delta Share was updated, in format defined by <a href=" target="_blank" rel="noopener noreferrer">RFC 3339</a>
- `created_by` (str (required)) — created_by of this Share. ID of user who created share
- `updated_by` (str) — updated_by of this Share. ID of user who last updated share
- `recipient_count` (int (required)) — recipient_count of this Share. number of recipients who have access on this share
- `asset_count` (int) — asset_count of this Share. number of assets in this share
- `lifecycle_state` (str) — lifecycle_state of this Share. state of Share
- `lifecycle_state_details` (str) — lifecycle_state_details of this Share. A message describing current state in more detail


**Return:** [Back to Delta Share (DeltaShareClient)](#delta-share-deltashareclient) • [Top](#top)

### `delete_recipient`
<a id="delete-recipient"></a>
Deletes a Delta Share recipient from an AI Data Platform Workbench.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `recipient_key` (str) — key of recipient resource


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Delta Share (DeltaShareClient)](#delta-share-deltashareclient) • [Top](#top)

### `delete_share`
<a id="delete-share"></a>
Deletes a Delta Share from an AI Data Platform Workbench.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `share_key` (str) — unique key of Share


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Delta Share (DeltaShareClient)](#delta-share-deltashareclient) • [Top](#top)

### `get_recipient`
<a id="get-recipient"></a>
Gets detailed information about a Delta Share recipient in an AI Data Platform Workbench instance.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `recipient_key` (str) — key of recipient resource


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.Recipient]` — A Delta Share recipient can access data assets in AI Data Platform Workbench through Delta Share Protocol

**Response Fields:**

- `key` (str (required)) — key of this Recipient. Unique identifier for this recipient in AI Data Platform Workbench instance
- `display_name` (str (required)) — display_name of this Recipient. A user-friendly name. Has to be unique within AI Data Platform Workbench instance
- `description` (str) — description of this Recipient. Short description of Recipient
- `time_created` (datetime (required)) — time_created of this Recipient. date and time Delta Share recipient was created, in format defined by <a href=" target="_blank" rel="noopener noreferrer">RFC 3339</a>. .600Z
- `time_updated` (datetime) — time_updated of this Recipient. date and time Delta Share recipient was updated, in format defined by <a href=" target="_blank" rel="noopener noreferrer">RFC 3339</a>
- `share_count` (int (required)) — share_count of this Recipient. number of shares this recipient has access on
- `created_by` (str (required)) — created_by of this Recipient. ID of user who created recipient
- `updated_by` (str) — updated_by of this Recipient. ID of user who last updated recipient
- `properties` (dict(str, str)) — properties of this Recipient. Key-value pair representing a defined tag key and value.
- `lifecycle_state` (str (required)) — lifecycle_state of this Recipient. state of recipient. .
- `lifecycle_state_details` (str) — lifecycle_state_details of this Recipient. A message describing current state in more detail


**Return:** [Back to Delta Share (DeltaShareClient)](#delta-share-deltashareclient) • [Top](#top)

### `get_share`
<a id="get-share"></a>
Gets detailed information about a Delta Share.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `share_key` (str) — unique key of Share


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.Share]` — A share is used to access data assets in AI Data Platform Workbench through Delta Share Protocol

**Response Fields:**

- `key` (str (required)) — key of this Share. Unique identifier for this share in AI Data Platform Workbench instance
- `display_name` (str (required)) — display_name of this Share. A user-friendly name. Has to be unique within AI Data Platform Workbench instance
- `description` (str) — description of this Share. A description associated with this share
- `time_created` (datetime (required)) — time_created of this Share. date and time Delta Share was created, in format defined by <a href=" target="_blank" rel="noopener noreferrer">RFC 3339</a>. .600Z
- `time_updated` (datetime) — time_updated of this Share. date and time Delta Share was updated, in format defined by <a href=" target="_blank" rel="noopener noreferrer">RFC 3339</a>
- `created_by` (str (required)) — created_by of this Share. ID of user who created share
- `updated_by` (str) — updated_by of this Share. ID of user who last updated share
- `recipient_count` (int (required)) — recipient_count of this Share. number of recipients who have access on this share
- `asset_count` (int) — asset_count of this Share. number of assets in this share
- `lifecycle_state` (str) — lifecycle_state of this Share. state of Share
- `lifecycle_state_details` (str) — lifecycle_state_details of this Share. A message describing current state in more detail


**Return:** [Back to Delta Share (DeltaShareClient)](#delta-share-deltashareclient) • [Top](#top)

### `list_recipient_permissions`
<a id="list-recipient-permissions"></a>
Gets a detailed list of Delta Share recipient permissions.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `recipient_key` (str) — key of recipient resource


**Optional Parameters:**

- `limit` (int) — For list pagination. maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination
- `page` (str) — For list pagination. value of opc-next-page response header from previous "List" call. For important details about how pagination works, see List Pagination
- `sort_order` (str) — sort order to use, either ascending (ASC) or descending (DESC).
- `sort_by` (str) — field to sort by. Default order for grantee is ascending.
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.RecipientPermissionCollection]` — List of recipient permissions

**Response Fields:**

- `items` (list[RecipientPermissionSummary] (required)) — items of this RecipientPermissionCollection. List of recipient permissions


**Return:** [Back to Delta Share (DeltaShareClient)](#delta-share-deltashareclient) • [Top](#top)

### `list_recipient_shares`
<a id="list-recipient-shares"></a>
Returns a list of Delta Shares that the specified recipient has been granted access to.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `recipient_key` (str) — key of recipient resource


**Optional Parameters:**

- `display_name` (str) — A filter to return only resources that match given display name exactly
- `limit` (int) — For list pagination. maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination
- `page` (str) — For list pagination. value of opc-next-page response header from previous "List" call. For important details about how pagination works, see List Pagination
- `sort_order` (str) — sort order to use, either ascending (ASC) or descending (DESC).
- `sort_by` (str) — field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending.
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.ShareCollection]` — Results of a listing Delta Shares. Contains summary information of shares

**Response Fields:**

- `items` (list[ShareSummary] (required)) — items of this ShareCollection. List of Shares


**Return:** [Back to Delta Share (DeltaShareClient)](#delta-share-deltashareclient) • [Top](#top)

### `list_recipients`
<a id="list-recipients"></a>
Gets a list of Delta Share recipients in a AI Data Platform Workbench instance.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance


**Optional Parameters:**

- `display_name` (str) — A filter to return only resources that match given display name exactly
- `limit` (int) — For list pagination. maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination
- `page` (str) — For list pagination. value of opc-next-page response header from previous "List" call. For important details about how pagination works, see List Pagination
- `sort_order` (str) — sort order to use, either ascending (ASC) or descending (DESC).
- `sort_by` (str) — field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending.
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.RecipientCollection]` — Results of a listing Delta Share recipients. Contains summary information of recipients

**Response Fields:**

- `items` (list[RecipientSummary] (required)) — items of this RecipientCollection. List of recipients


**Return:** [Back to Delta Share (DeltaShareClient)](#delta-share-deltashareclient) • [Top](#top)

### `list_share_data_assets`
<a id="list-share-data-assets"></a>
Gets a list of Delta Shares assets in an AI Data Platform Workbench instance.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `share_key` (str) — unique key of Share


**Optional Parameters:**

- `display_name` (str) — A filter to return only resources that match given display name exactly
- `limit` (int) — For list pagination. maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination
- `page` (str) — For list pagination. value of opc-next-page response header from previous "List" call. For important details about how pagination works, see List Pagination
- `sort_order` (str) — sort order to use, either ascending (ASC) or descending (DESC).
- `sort_by` (str) — field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending.
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.ShareDataAssetCollection]` — Results of a listing Delta Shares assets. Contains summary information of shares assets

**Response Fields:**

- `items` (list[ShareDataAssetSummary] (required)) — items of this ShareDataAssetCollection. List of Shares assets


**Return:** [Back to Delta Share (DeltaShareClient)](#delta-share-deltashareclient) • [Top](#top)

### `list_share_permissions`
<a id="list-share-permissions"></a>
Returns a list of Delta Shares that the specified recipient has been granted access to.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `share_key` (str) — unique key of Share


**Optional Parameters:**

- `limit` (int) — For list pagination. maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination
- `page` (str) — For list pagination. value of opc-next-page response header from previous "List" call. For important details about how pagination works, see List Pagination
- `sort_order` (str) — sort order to use, either ascending (ASC) or descending (DESC).
- `sort_by` (str) — field to sort by. You can provide only one sort order. Default order for grantee is ascending. Default order for granteeType is ascending.
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.SharePermissionCollection]` — List of share permissions

**Response Fields:**

- `items` (list[SharePermissionSummary] (required)) — items of this SharePermissionCollection. List of share permissions


**Return:** [Back to Delta Share (DeltaShareClient)](#delta-share-deltashareclient) • [Top](#top)

### `list_share_recipients`
<a id="list-share-recipients"></a>
Gets a list of recipients that have been given access on the specified Delta Share.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `share_key` (str) — unique key of Share


**Optional Parameters:**

- `display_name` (str) — A filter to return only resources that match given display name exactly
- `limit` (int) — For list pagination. maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination
- `page` (str) — For list pagination. value of opc-next-page response header from previous "List" call. For important details about how pagination works, see List Pagination
- `sort_order` (str) — sort order to use, either ascending (ASC) or descending (DESC).
- `sort_by` (str) — field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending.
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.RecipientCollection]` — Results of a listing Delta Share recipients. Contains summary information of recipients

**Response Fields:**

- `items` (list[RecipientSummary] (required)) — items of this RecipientCollection. List of recipients


**Return:** [Back to Delta Share (DeltaShareClient)](#delta-share-deltashareclient) • [Top](#top)

### `list_shares`
<a id="list-shares"></a>
Gets a list of Delta Shares in an AI Data Platform Workbench instance.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance


**Optional Parameters:**

- `display_name` (str) — A filter to return only resources that match given display name exactly
- `limit` (int) — For list pagination. maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination
- `page` (str) — For list pagination. value of opc-next-page response header from previous "List" call. For important details about how pagination works, see List Pagination
- `sort_order` (str) — sort order to use, either ascending (ASC) or descending (DESC).
- `sort_by` (str) — field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending.
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.ShareCollection]` — Results of a listing Delta Shares. Contains summary information of shares

**Response Fields:**

- `items` (list[ShareSummary] (required)) — items of this ShareCollection. List of Shares


**Return:** [Back to Delta Share (DeltaShareClient)](#delta-share-deltashareclient) • [Top](#top)

### `manage_recipient_permission`
<a id="manage-recipient-permission"></a>
Updates the permissions of a Delta Share recipient in AI Data Platform Workbench.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `recipient_key` (str) — key of recipient resource
- `manage_recipient_permission_details` (oci.aidataplatform_dp.models.ManageRecipientPermissionDetails) — information to be updated


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Delta Share (DeltaShareClient)](#delta-share-deltashareclient) • [Top](#top)

### `manage_share_access`
<a id="manage-share-access"></a>
Updates consumer-side access on a share for a recipient. A provider user can grant or revoke access on a particular share for a given recipient.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `share_key` (str) — unique key of Share
- `manage_share_access_details` (oci.aidataplatform_dp.models.ManageShareAccessDetails) — information to be updated


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Delta Share (DeltaShareClient)](#delta-share-deltashareclient) • [Top](#top)

### `manage_share_data_asset`
<a id="manage-share-data-asset"></a>
Updates data assets on a Delta Share with the provided information.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `share_key` (str) — unique key of Share
- `manage_share_data_asset_details` (oci.aidataplatform_dp.models.ManageShareDataAssetDetails) — Delta Share data asset information to be updated


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Delta Share (DeltaShareClient)](#delta-share-deltashareclient) • [Top](#top)

### `manage_share_permission`
<a id="manage-share-permission"></a>
Updates permissions on a Delta Share.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `share_key` (str) — unique key of Share
- `manage_share_permission_details` (oci.aidataplatform_dp.models.ManageSharePermissionDetails) — information to be updated


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Delta Share (DeltaShareClient)](#delta-share-deltashareclient) • [Top](#top)

### `update_recipient`
<a id="update-recipient"></a>
Updates the metadata of a Delta Share recipient in a AI Data Platform Workbench instance.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `recipient_key` (str) — key of recipient resource
- `update_recipient_details` (oci.aidataplatform_dp.models.UpdateRecipientDetails) — information to be updated for a recipient


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Delta Share (DeltaShareClient)](#delta-share-deltashareclient) • [Top](#top)

### `update_share`
<a id="update-share"></a>
Update a Delta Share with the provided metadata.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `share_key` (str) — unique key of Share
- `update_share_details` (oci.aidataplatform_dp.models.UpdateShareDetails) — information to be updated


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Delta Share (DeltaShareClient)](#delta-share-deltashareclient) • [Top](#top)

## Git (GitClient)
**Operations:**
- [checkout_branch](#checkout-branch)
- [commit_push_git_repository](#commit-push-git-repository)
- [create_git_branch](#create-git-branch)
- [get_git_diff_detail](#get-git-diff-detail)
- [get_git_operation_state](#get-git-operation-state)
- [get_git_repository](#get-git-repository)
- [list_git_branches](#list-git-branches)
- [list_git_diffs](#list-git-diffs)
- [merge_git_repository](#merge-git-repository)
- [pull_git_repository](#pull-git-repository)
- [rebase_git_repository](#rebase-git-repository)
- [reset_git_folder_state](#reset-git-folder-state)
- [reset_git_repository](#reset-git-repository)
- [resolve_git_conflicts](#resolve-git-conflicts)
- [update_git_repository](#update-git-repository)
### `checkout_branch`
<a id="checkout-branch"></a>
(Preview) Checks out a remote branch into the specified workspace folder, ensuring the worktree tracks the requested branch HEAD.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `git_repository_key` (str) — Git repository key
- `checkout_branch_details` (oci.aidataplatform_dp.models.CheckoutBranchDetails) — Details for new branch


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.GitBranch]` — Git branch details

**Response Fields:**

- `branch_name` (str (required)) — branch_name of this GitBranch. name of Git branch
- `git_url` (str (required)) — git_url of this GitBranch. Git repository URL corresponding to branch
- `error_message` (str) — error_message of this GitBranch. Git error message
- `std_out` (str) — std_out of this GitBranch. Git STDOUT message
- `std_err` (str) — std_err of this GitBranch. Git STDERR message
- `git_exit_code` (int) — git_exit_code of this GitBranch. Git exit status


**Return:** [Back to Git (GitClient)](#git-gitclient) • [Top](#top)

### `commit_push_git_repository`
<a id="commit-push-git-repository"></a>
(Preview) Stages selected workspace updates, creates a commit, and pushes it upstream so automation can sync with Git providers.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `git_repository_key` (str) — Git repository key
- `commit_push_details` (oci.aidataplatform_dp.models.CommitPushDetails) — Commit details


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Git (GitClient)](#git-gitclient) • [Top](#top)

### `create_git_branch`
<a id="create-git-branch"></a>
(Preview) Creates a new branch in the connected repo so teams can stage changes in isolated workspaces.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `git_repository_key` (str) — Git repository key
- `create_git_branch_details` (oci.aidataplatform_dp.models.CreateGitBranchDetails) — Details for new Workspace Object


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.CreateGitBranch]` — Git branch details

**Response Fields:**

- `git_branch_name` (str (required)) — git_branch_name of this CreateGitBranch. name of Git branch
- `git_url` (str (required)) — git_url of this CreateGitBranch. Git repository URL corresponding to branch
- `error_message` (str) — error_message of this CreateGitBranch. Git error message
- `std_out` (str) — std_out of this CreateGitBranch. Git STDOUT message
- `std_err` (str) — std_err of this CreateGitBranch. Git STDERR message
- `git_exit_code` (int) — git_exit_code of this CreateGitBranch. Git exit status
- `git_folder_path` (str) — git_folder_path of this CreateGitBranch. path of current Git folder which has to be created for new branch


**Return:** [Back to Git (GitClient)](#git-gitclient) • [Top](#top)

### `get_git_diff_detail`
<a id="get-git-diff-detail"></a>
(Preview) Returns a unified diff patch for a specific file so editors and review panes can render inline changes.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `git_repository_key` (str) — Git repository key
- `git_folder_path` (str) — Git folder path
- `branch_name` (str) — Expected branch name for folder context
- `git_file_path` (str) — File path relative to repository root


**Optional Parameters:**

- `context_lines` (int) — Number of context lines to include in diff
- `max_patch_bytes` (int) — Maximum number of bytes of diff output to return
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.GitDiffDetail]` — Unified diff details for a Git file

**Response Fields:**

- `git_file_path` (str (required)) — git_file_path of this GitDiffDetail. File path relative to repository root
- `is_conflict` (bool) — is_conflict of this GitDiffDetail. Indicates whether file is currently in a conflicted state
- `is_binary` (bool) — is_binary of this GitDiffDetail. Indicates whether file is binary
- `patch` (str) — patch of this GitDiffDetail. Unified diff patch text
- `is_truncated` (bool) — is_truncated of this GitDiffDetail. Indicates whether diff output was truncated
- `truncated_reason` (str) — truncated_reason of this GitDiffDetail. Indicates reason for truncated diff to be returned


**Return:** [Back to Git (GitClient)](#git-gitclient) • [Top](#top)

### `get_git_operation_state`
<a id="get-git-operation-state"></a>
(Preview) Returns the current Git worktree status — including in-progress operations or detached HEAD indicators—for workspace folder

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `git_repository_key` (str) — Git repository key


**Optional Parameters:**

- `operation_name` (str) — Optional operation caller intends to perform (for example PULL, PUSH, RESET, CHECKOUT)
- `branch_name` (str) — Expected branch name for folder context
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.GitOperationState]` — Current git operation state for a repository folder context

**Response Fields:**

- `git_folder_path` (str (required)) — git_folder_path of this GitOperationState. Folder path used to locate Git worktree
- `state` (str (required)) — state of this GitOperationState. Current Git operation state detected. .
- `is_blocking` (bool (required)) — is_blocking of this GitOperationState. Whether detected state blocks typical write operations
- `is_allowed` (bool (required)) — is_allowed of this GitOperationState. Whether requested operation is allowed in current state. If operationName is not provided, this indicates if repository is in a generally safe state
- `message` (str) — message of this GitOperationState. Human-readable hint for UI display
- `current_branch` (str) — current_branch of this GitOperationState. Current branch name. Empty if detached HEAD
- `head_commit_id` (str) — head_commit_id of this GitOperationState. Full commit ID of HEAD
- `is_detached` (bool) — is_detached of this GitOperationState. Whether HEAD is detached
- `have_conflicts` (bool) — have_conflicts of this GitOperationState. Indicates if unmerged/conflicted files exist. This does not include file names
- `time_checked` (datetime) — time_checked of this GitOperationState. Time when state was computed


**Return:** [Back to Git (GitClient)](#git-gitclient) • [Top](#top)

### `get_git_repository`
<a id="get-git-repository"></a>
(Preview) Returns repository metadata, credential references, and workspace linkage for a specific AI Data Platform Git repository.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `git_repository_key` (str) — Git repository key


**Optional Parameters:**

- `should_include_credential_key` (bool) — A flag to include credential key in response. If 'true', credential key will be returned in response. Default 'false'
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.GitRepository]` — Details about a Git repository

**Response Fields:**

- `key` (str (required)) — key of this GitRepository. Unique key associated with repository
- `workspace_key` (str (required)) — workspace_key of this GitRepository. workspaceKey associated with Git repository
- `branch_name` (str (required)) — branch_name of this GitRepository. name of Git branch
- `git_url` (str (required)) — git_url of this GitRepository. Git repository url corresponding to branch
- `git_folder_path` (str (required)) — git_folder_path of this GitRepository. path of current Git folder which has to be created for new branch
- `credential_key` (str) — credential_key of this GitRepository. credential setting key


**Return:** [Back to Git (GitClient)](#git-gitclient) • [Top](#top)

### `list_git_branches`
<a id="list-git-branches"></a>
(Preview) Returns branch summaries with optional display-name filters and pagination, so UIs can show branch pickers and search results.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `git_repository_key` (str) — Git repository key


**Optional Parameters:**

- `display_name` (str) — A filter to return only resources that match given display name exactly
- `display_name_contains` (str) — A filter to return only resources that have a display name containing text provided
- `limit` (int) — For list pagination. maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination
- `page` (str) — For list pagination. value of opc-next-page response header from previous "List" call. For important details about how pagination works, see List Pagination
- `sort_order` (str) — sort order to use, either ascending (ASC) or descending (DESC).
- `sort_by` (str) — field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending.
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.GitBranchCollection]` — Collection of Git branches. Contains summary information about a Git branch

**Response Fields:**

- `items` (list[GitBranchSummary] (required)) — items of this GitBranchCollection. List of Git branches


**Return:** [Back to Git (GitClient)](#git-gitclient) • [Top](#top)

### `list_git_diffs`
<a id="list-git-diffs"></a>
(Preview) Returns file-level diff summaries for the workspace branch, enabling UI views of changed files or conflicts without heavy payloads.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `git_repository_key` (str) — Git repository key
- `git_folder_path` (str) — Git folder path
- `branch_name` (str) — Expected branch name for folder context


**Optional Parameters:**

- `compare_to` (str) — Determines which reference is used for computing diffs.
- `filter` (str) — Filter which files are returned.
- `limit` (int) — For list pagination. maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination
- `page` (str) — For list pagination. value of opc-next-page response header from previous "List" call. For important details about how pagination works, see List Pagination
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `sort_order` (str) — sort order to use, either ascending (ASC) or descending (DESC).
- `sort_by` (str) — field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending.
- `display_name` (str) — A filter to return only resources that match given display name exactly
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.GitDiffSummaryCollection]` — Collection of Git diff summaries for files under a folder context

**Response Fields:**

- `items` (list[GitDiffSummary] (required)) — items of this GitDiffSummaryCollection. List of Git diff summaries


**Return:** [Back to Git (GitClient)](#git-gitclient) • [Top](#top)

### `merge_git_repository`
<a id="merge-git-repository"></a>
(Preview) Applies the requested branch or commit onto the workspace branch to preview integration changes before pushing.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `git_repository_key` (str) — Git repository key
- `git_merge_details` (oci.aidataplatform_dp.models.GitMergeDetails) — Folder/branch details to merge


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Git (GitClient)](#git-gitclient) • [Top](#top)

### `pull_git_repository`
<a id="pull-git-repository"></a>
(Preview) Performs a Git pull for the workspace branch so developers can sync local files with the latest upstream commits.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `git_repository_key` (str) — Git repository key
- `git_pull_details` (oci.aidataplatform_dp.models.GitPullDetails) — Folder/branch details to pull


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Git (GitClient)](#git-gitclient) • [Top](#top)

### `rebase_git_repository`
<a id="rebase-git-repository"></a>
(Preview) Rebases the workspace branch on top of another commit or branch to linearize history and resolve drift.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `git_repository_key` (str) — Git repository key
- `git_rebase_details` (oci.aidataplatform_dp.models.GitRebaseDetails) — Details needed to perform rebase operation


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Git (GitClient)](#git-gitclient) • [Top](#top)

### `reset_git_folder_state`
<a id="reset-git-folder-state"></a>
(Preview) Halts in-progress Git operations and discards local changes in the workspace folder to regain a clean state.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `git_repository_key` (str) — Git repository key
- `reset_git_folder_state_details` (oci.aidataplatform_dp.models.ResetGitFolderStateDetails) — Merge conflict resolution details


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Git (GitClient)](#git-gitclient) • [Top](#top)

### `reset_git_repository`
<a id="reset-git-repository"></a>
(Preview) Performs a Git reset so the workspace branch matches the specified commit, discarding newer local commits.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `git_repository_key` (str) — Git repository key
- `git_reset_details` (oci.aidataplatform_dp.models.GitResetDetails) — Details needed to perform Git reset operation


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Git (GitClient)](#git-gitclient) • [Top](#top)

### `resolve_git_conflicts`
<a id="resolve-git-conflicts"></a>
(Preview) Accepts conflict resolution instructions — choose source or target versions—and records resolution back to repo

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `git_repository_key` (str) — Git repository key
- `conflict_resolve_details` (oci.aidataplatform_dp.models.ConflictResolveDetails) — Conflict resolution details


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.GitBranch]` — Git branch details

**Response Fields:**

- `branch_name` (str (required)) — branch_name of this GitBranch. name of Git branch
- `git_url` (str (required)) — git_url of this GitBranch. Git repository URL corresponding to branch
- `error_message` (str) — error_message of this GitBranch. Git error message
- `std_out` (str) — std_out of this GitBranch. Git STDOUT message
- `std_err` (str) — std_err of this GitBranch. Git STDERR message
- `git_exit_code` (int) — git_exit_code of this GitBranch. Git exit status


**Return:** [Back to Git (GitClient)](#git-gitclient) • [Top](#top)

### `update_git_repository`
<a id="update-git-repository"></a>
(Preview) Updates stored repository details — such as credentials or default branches—so automation stays aligned with your source control

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `update_git_repository_details` (oci.aidataplatform_dp.models.UpdateGitRepositoryDetails) — information to be updated
- `git_repository_key` (str) — Git repository key


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Git (GitClient)](#git-gitclient) • [Top](#top)

## ML Ops (MLOpsClient)
**Operations:**
- [create_experiment](#create-experiment)
- [create_experiment_run](#create-experiment-run)
- [create_model_version](#create-model-version)
- [create_registered_model](#create-registered-model)
- [create_workspace_model_version](#create-workspace-model-version)
- [delete_experiment](#delete-experiment)
- [delete_experiment_run](#delete-experiment-run)
- [delete_experiment_run_tag](#delete-experiment-run-tag)
- [delete_experiment_tag](#delete-experiment-tag)
- [delete_model_version](#delete-model-version)
- [delete_model_version_tag](#delete-model-version-tag)
- [delete_registered_model](#delete-registered-model)
- [delete_registered_model_tag](#delete-registered-model-tag)
- [get_experiment_by_id](#get-experiment-by-id)
- [get_experiment_by_name](#get-experiment-by-name)
- [get_experiment_run_by_id](#get-experiment-run-by-id)
- [get_experiment_run_metric_history](#get-experiment-run-metric-history)
- [get_model_version](#get-model-version)
- [get_registered_model](#get-registered-model)
- [list_artifacts](#list-artifacts)
- [list_experiment_runs](#list-experiment-runs)
- [list_experiments](#list-experiments)
- [list_logged_models](#list-logged-models)
- [list_model_versions](#list-model-versions)
- [list_registered_models](#list-registered-models)
- [log_experiment_run_batch](#log-experiment-run-batch)
- [log_experiment_run_inputs](#log-experiment-run-inputs)
- [log_experiment_run_metric](#log-experiment-run-metric)
- [log_experiment_run_model](#log-experiment-run-model)
- [log_experiment_run_param](#log-experiment-run-param)
- [rename_registered_model](#rename-registered-model)
- [restore_experiment](#restore-experiment)
- [restore_experiment_run](#restore-experiment-run)
- [set_experiment_run_tag](#set-experiment-run-tag)
- [set_experiment_tag](#set-experiment-tag)
- [set_model_version_tag](#set-model-version-tag)
- [set_registered_model_tag](#set-registered-model-tag)
- [transition_model_version_stage](#transition-model-version-stage)
- [update_experiment](#update-experiment)
- [update_experiment_run](#update-experiment-run)
- [update_experiment_run_tags](#update-experiment-run-tags)
- [update_experiment_tags](#update-experiment-tags)
- [update_model_version](#update-model-version)
- [update_model_version_tags](#update-model-version-tags)
- [update_registered_model](#update-registered-model)
- [update_registered_model_tags](#update-registered-model-tags)
### `create_experiment`
<a id="create-experiment"></a>
(Preview) Creates an experiment in a workspace.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `create_experiment_details` (oci.aidataplatform_dp.models.CreateExperimentDetails) — Details for new experiment


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.CreateExperimentResponseDetails]` — Response object for creating an experiment

**Response Fields:**

- `experiment_id` (str (required)) — experiment_id of this CreateExperimentResponseDetails. Unique identifier for experiment


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `create_experiment_run`
<a id="create-experiment-run"></a>
(Preview) Creates a new run within an experiment.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `create_experiment_run_details` (oci.aidataplatform_dp.models.CreateExperimentRunDetails) — Details for new run


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.CreateExperimentRunResponseDetails]` — Details of created run

**Response Fields:**

- `run` (ExperimentRun (required)) — run of this CreateExperimentRunResponseDetails


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `create_model_version`
<a id="create-model-version"></a>
(Preview) Creates a model version.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `create_model_version_details` (oci.aidataplatform_dp.models.CreateModelVersionDetails) — Details for new model version


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.CreateModelVersionResponseDetails]` — Created model version details

**Response Fields:**

- `model_version` (ModelVersion (required)) — model_version of this CreateModelVersionResponseDetails


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `create_registered_model`
<a id="create-registered-model"></a>
(Preview) Creates a registered model in a workspace.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `create_registered_model_details` (oci.aidataplatform_dp.models.CreateRegisteredModelDetails) — Details for new registered model


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.CreateRegisteredModelResponseDetails]` — Response object for creating a RegisteredModel

**Response Fields:**

- `registered_model` (RegisteredModel (required)) — registered_model of this CreateRegisteredModelResponseDetails


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `create_workspace_model_version`
<a id="create-workspace-model-version"></a>
(Preview) Creates a new model version in a specified workspace.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `create_model_version_details` (oci.aidataplatform_dp.models.CreateModelVersionDetails) — Details for new model version


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.CreateModelVersionResponseDetails]` — Created model version details

**Response Fields:**

- `model_version` (ModelVersion (required)) — model_version of this CreateModelVersionResponseDetails


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `delete_experiment`
<a id="delete-experiment"></a>
(Preview) Deletes an experiment.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `delete_experiment_details` (oci.aidataplatform_dp.models.DeleteExperimentDetails) — Details of experiment


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.DeleteExperimentResponseDetails]` — Response object for deleting an experiment


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `delete_experiment_run`
<a id="delete-experiment-run"></a>
(Preview) Deletes an experiment run.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `delete_experiment_run_details` (oci.aidataplatform_dp.models.DeleteExperimentRunDetails) — Details of Experiment Run


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.DeleteExperimentRunResponseDetails]` — Response object for deleting experiment run


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `delete_experiment_run_tag`
<a id="delete-experiment-run-tag"></a>
(Preview) Deletes a tag on an experiment run.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `delete_experiment_run_tag_details` (oci.aidataplatform_dp.models.DeleteExperimentRunTagDetails) — Tag details to delete on an experiment run


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.DeleteExperimentRunTagResponseDetails]` — Response object for deleting experiment run tag


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `delete_experiment_tag`
<a id="delete-experiment-tag"></a>
(Preview) Deletes a tag on an experiment.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `delete_experiment_tag_details` (oci.aidataplatform_dp.models.DeleteExperimentTagDetails) — Tag details to delete on an experiment


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.DeleteExperimentTagResponseDetails]` — Response object for deleting tag on an experiment


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `delete_model_version`
<a id="delete-model-version"></a>
(Preview) Deletes a model version.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `delete_model_version_details` (oci.aidataplatform_dp.models.DeleteModelVersionDetails) — Details of model version to delete


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.DeleteModelVersionResponseDetails]` — Response object for deleting a model version


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `delete_model_version_tag`
<a id="delete-model-version-tag"></a>
(Preview) Deletes a tag on a model version.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `delete_model_version_tag_details` (oci.aidataplatform_dp.models.DeleteModelVersionTagDetails) — Details of a model version tag to delete


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.DeleteModelVersionTagResponseDetails]` — Response object for deleting tag of a model version


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `delete_registered_model`
<a id="delete-registered-model"></a>
(Preview) Deletes a registered model.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `delete_registered_model_details` (oci.aidataplatform_dp.models.DeleteRegisteredModelDetails) — Details of registered model to delete


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.DeleteRegisteredModelResponseDetails]` — Response object for deleting a registered model


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `delete_registered_model_tag`
<a id="delete-registered-model-tag"></a>
(Preview) Deletes a tag on a registered model.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `delete_registered_model_tag_details` (oci.aidataplatform_dp.models.DeleteRegisteredModelTagDetails) — Details of a registered model tag


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.DeleteRegisteredModelTagResponseDetails]` — Response object for deleting tag of a registered model


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `get_experiment_by_id`
<a id="get-experiment-by-id"></a>
(Preview) Returns metadata for an experiment by ID. This method works on deleted experiments.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `experiment_id` (str) — unique ID of experiment to retrieve


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.ExperimentResponse]` — Response object for getting an experiment

**Response Fields:**

- `experiment` (Experiment (required)) — experiment of this ExperimentResponse


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `get_experiment_by_name`
<a id="get-experiment-by-name"></a>
(Preview) Returns experiment metadata for a given name. Returns deleted experiments, but prefers the active experiment if an active and deleted experiment share the same name. If multiple deleted experiments share the same name, the API will return one of them.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `experiment_name` (str) — name of experiment to retrieve


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.ExperimentResponse]` — Response object for getting an experiment

**Response Fields:**

- `experiment` (Experiment (required)) — experiment of this ExperimentResponse


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `get_experiment_run_by_id`
<a id="get-experiment-run-by-id"></a>
(Preview) Returns details of an experiment run by ID.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `run_id` (str) — ID of run to fetch


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.GetExperimentRunResponseDetails]` — Details of run

**Response Fields:**

- `run` (ExperimentRun (required)) — run of this GetExperimentRunResponseDetails


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `get_experiment_run_metric_history`
<a id="get-experiment-run-metric-history"></a>
(Preview) Returns a history of experiment run metrics.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `run_id` (str) — ID of run metric history to fetch
- `metric_key` (str) — Name of metric key


**Optional Parameters:**

- `page_token` (str) — Pagination token to go to next page of metric history
- `max_results` (int) — Maximum number of logged instances of a metric for a run to return per call. Backend servers may restrict value of max_results depending on performance requirements. Requests that do not specify this value will behave as non-paginated queries w all metric history values for a given metric within a run are returned in a single response
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.ExperimentRunMetricHistoryCollection]` — Result of history of ExperimentRun metrics

**Response Fields:**

- `metrics` (list[ExperimentRunMetric]) — metrics of this ExperimentRunMetricHistoryCollection. Logged values for metric
- `next_page_token` (str) — next_page_token of this ExperimentRunMetricHistoryCollection. Token that can be used to retrieve next page of metric history. An empty token means that no more metric history are available for retrieval


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `get_model_version`
<a id="get-model-version"></a>
(Preview) Returns detailed information for a model version.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `name` (str) — Name of model version
- `version` (str) — Version number of model version


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.GetModelVersionResponseDetails]` — Model version details

**Response Fields:**

- `model_version` (ModelVersion (required)) — model_version of this GetModelVersionResponseDetails


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `get_registered_model`
<a id="get-registered-model"></a>
(Preview) Returns details for a specified registered model.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `name` (str) — Name of registered model


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.GetRegisteredModelResponseDetails]` — Response object for getting a RegisteredModel

**Response Fields:**

- `registered_model` (RegisteredModel (required)) — registered_model of this GetRegisteredModelResponseDetails


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `list_artifacts`
<a id="list-artifacts"></a>
(Preview) Returns a list of artifacts.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `run_id` (str) — ID of run whose artifacts to list


**Optional Parameters:**

- `path` (str) — Filter artifacts matching this path (a relative path from root artifact directory)
- `page_token` (str) — Token indicating page of artifact results to fetch
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.ArtifactList]` — Result of listing artifacts

**Response Fields:**

- `root_uri` (str) — root_uri of this ArtifactList. Root artifact directory for run
- `files` (list[ArtifactFileInfo]) — files of this ArtifactList. File location and metadata for artifacts
- `next_page_token` (str) — next_page_token of this ArtifactList. Token that can be used to retrieve next page of artifact results


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `list_experiment_runs`
<a id="list-experiment-runs"></a>
(Preview) Returns a list of experiment runs in a workspace.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `list_experiment_runs_details` (oci.aidataplatform_dp.models.ListExperimentRunsDetails) — Details of experiment runs to fetch


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.ExperimentRunCollection]` — Result of listing experiment runs

**Response Fields:**

- `runs` (list[ExperimentRun] (required)) — runs of this ExperimentRunCollection. Runs that match search criteria
- `next_page_token` (str) — next_page_token of this ExperimentRunCollection. Token that can be used to retrieve next page of runs. An empty token means that no more runs are available for retrieval


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `list_experiments`
<a id="list-experiments"></a>
(Preview) Returns a list of experiments with the given details.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `list_experiments_details` (oci.aidataplatform_dp.models.ListExperimentsDetails) — Details of experiments to fetch


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.ExperimentCollection]` — Result of listing experiments

**Response Fields:**

- `experiments` (list[Experiment] (required)) — experiments of this ExperimentCollection. Experiments that match search criteria
- `next_page_token` (str) — next_page_token of this ExperimentCollection. Token that can be used to retrieve next page of experiments. An empty token means that no more experiments are available for retrieval


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `list_logged_models`
<a id="list-logged-models"></a>
(Preview) Returns a list of logged models.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `list_logged_models_details` (oci.aidataplatform_dp.models.ListLoggedModelsDetails) — Details of logged models to fetch


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.LoggedModelCollection]` — Result of listing logged-models

**Response Fields:**

- `models` (list[LoggedModel]) — models of this LoggedModelCollection. Logged models that match search criteria
- `next_page_token` (str) — next_page_token of this LoggedModelCollection. Token that can be used to retrieve next page of logged-models. An empty token means that no more logged-models are available for retrieval


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `list_model_versions`
<a id="list-model-versions"></a>
(Preview) Returns a list of model versions.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance


**Optional Parameters:**

- `filter` (str) — String filter condition, like "name LIKE 'my-model-name'". Single boolean condition, with string values wrapped in single quotes
- `max_results` (int) — Maximum number of model versions to retrieve
- `page_token` (str) — Pagination token to go to next page based on a previous search query
- `order_by` (str) — List of columns to be ordered by including model name, version, stage with an optional "DESC" or "ASC" annotation, w "ASC" is default. Tiebreaks are done by latest stage transition timestamp, followed by name ASC, followed by version DESC
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.ModelVersionCollection]` — Result of listing model versions

**Response Fields:**

- `model_versions` (list[ModelVersion] (required)) — model_versions of this ModelVersionCollection. Model versions that match search criteria
- `next_page_token` (str) — next_page_token of this ModelVersionCollection. Token that can be used to retrieve next page of model versions


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `list_registered_models`
<a id="list-registered-models"></a>
(Preview) Returns a list of registered models in a workspace.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance


**Optional Parameters:**

- `filter` (str) — String filter condition, like "name LIKE 'my-model-name'". Interpreted in backend automatically as "name LIKE '%my-model-name%'". Single boolean condition, with string values wrapped in single quotes
- `max_results` (int) — Maximum number of models desired. Default is 100. Max threshold is 1000
- `page_token` (str) — Pagination token to go to next page based on a previous search query
- `order_by` (str) — List of columns for ordering search results, which can include model name and last updated timestamp with an optional "DESC" or "ASC" annotation, w "ASC" is default. Tiebreaks are done by model name ASC
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.RegisteredModelCollection]` — Result of listing RegisteredModels

**Response Fields:**

- `registered_models` (list[RegisteredModel] (required)) — registered_models of this RegisteredModelCollection. Registered models that match search criteria
- `next_page_token` (str) — next_page_token of this RegisteredModelCollection. Token that can be used to retrieve next page of registered models


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `log_experiment_run_batch`
<a id="log-experiment-run-batch"></a>
(Preview) Logs an experiment run batch.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `log_experiment_run_batch_details` (oci.aidataplatform_dp.models.LogExperimentRunBatchDetails) — Details of an experiment run batch


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.LogExperimentRunBatchResponseDetails]` — Response object for logging experiment run batch


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `log_experiment_run_inputs`
<a id="log-experiment-run-inputs"></a>
(Preview) Logs experiment run inputs.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `log_experiment_run_inputs_details` (oci.aidataplatform_dp.models.LogExperimentRunInputsDetails) — Details of experiment run inputs


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.LogExperimentRunInputsResponseDetails]` — Response object for logging experiment run inputs


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `log_experiment_run_metric`
<a id="log-experiment-run-metric"></a>
(Preview) Logs an experiment run metric.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `log_experiment_run_metric_details` (oci.aidataplatform_dp.models.LogExperimentRunMetricDetails) — Details of an experiment run metric


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.LogExperimentRunMetricResponseDetails]` — Response object for logging experiment run metric


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `log_experiment_run_model`
<a id="log-experiment-run-model"></a>
(Preview) Logs an experiment run model.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `log_experiment_run_model_details` (oci.aidataplatform_dp.models.LogExperimentRunModelDetails) — Details of an experiment run model


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.LogExperimentRunModelResponseDetails]` — Response object for logging experiment run model


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `log_experiment_run_param`
<a id="log-experiment-run-param"></a>
(Preview) Logs an experiment run parameter.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `log_experiment_run_param_details` (oci.aidataplatform_dp.models.LogExperimentRunParamDetails) — Details of an experiment run parameter


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.LogExperimentRunParamResponseDetails]` — Response object for logging experiment run param


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `rename_registered_model`
<a id="rename-registered-model"></a>
(Preview) Renames a registered model.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `rename_registered_model_details` (oci.aidataplatform_dp.models.RenameRegisteredModelDetails) — Details of a registered model rename


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.RenameRegisteredModelResponseDetails]` — Response object for renaming a registered model

**Response Fields:**

- `registered_model` (RegisteredModel (required)) — registered_model of this RenameRegisteredModelResponseDetails


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `restore_experiment`
<a id="restore-experiment"></a>
(Preview) Restores an experiment.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `restore_experiment_details` (oci.aidataplatform_dp.models.RestoreExperimentDetails) — Restore experiment details


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.RestoreExperimentResponseDetails]` — Response object for restoring an experiment


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `restore_experiment_run`
<a id="restore-experiment-run"></a>
(Preview) Restores an experiment run.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `restore_experiment_run_details` (oci.aidataplatform_dp.models.RestoreExperimentRunDetails) — Restore experiment run details


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.RestoreExperimentRunResponseDetails]` — Response object for restoring experiment run


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `set_experiment_run_tag`
<a id="set-experiment-run-tag"></a>
(Preview) Sets a tag on an experiment run.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `set_experiment_run_tag_details` (oci.aidataplatform_dp.models.SetExperimentRunTagDetails) — Tag details to set on an experiment run


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.SetExperimentRunTagResponseDetails]` — Response object for setting experiment run tag


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `set_experiment_tag`
<a id="set-experiment-tag"></a>
(Preview) Sets a tag on an experiment.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `set_experiment_tag_details` (oci.aidataplatform_dp.models.SetExperimentTagDetails) — Tag details to set on an experiment


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.SetExperimentTagResponseDetails]` — Response object for setting tag on an experiment


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `set_model_version_tag`
<a id="set-model-version-tag"></a>
(Preview) Sets a tag on a model version.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `set_model_version_tag_details` (oci.aidataplatform_dp.models.SetModelVersionTagDetails) — Details of a model version tag


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.SetModelVersionTagResponseDetails]` — Response object for setting tag of a model version


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `set_registered_model_tag`
<a id="set-registered-model-tag"></a>
(Preview) Sets a tag on a registered model.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `set_registered_model_tag_details` (oci.aidataplatform_dp.models.SetRegisteredModelTagDetails) — Details of a registered model tag


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.SetRegisteredModelTagResponseDetails]` — Response object for tagging a registered model


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `transition_model_version_stage`
<a id="transition-model-version-stage"></a>
(Preview) Transitions a model version stage.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `transition_model_version_stage_details` (oci.aidataplatform_dp.models.TransitionModelVersionStageDetails) — Details to transition a model version stage


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.TransitionModelVersionStageResponseDetails]` — Updated model version details

**Response Fields:**

- `model_version` (ModelVersion (required)) — model_version of this TransitionModelVersionStageResponseDetails


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `update_experiment`
<a id="update-experiment"></a>
(Preview) Updates an experiment.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `update_experiment_details` (oci.aidataplatform_dp.models.UpdateExperimentDetails) — Update experiment metadata


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.UpdateExperimentResponseDetails]` — Response object for updating an experiment


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `update_experiment_run`
<a id="update-experiment-run"></a>
(Preview) Updates an experiment run.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `update_experiment_run_details` (oci.aidataplatform_dp.models.UpdateExperimentRunDetails) — Update experiment run details


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.UpdateExperimentRunResponseDetails]` — Details of updated run info

**Response Fields:**

- `run_info` (ExperimentRunInfo (required)) — run_info of this UpdateExperimentRunResponseDetails


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `update_experiment_run_tags`
<a id="update-experiment-run-tags"></a>
(Preview) Updates tags on an experiment run.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `update_experiment_run_tags_details` (oci.aidataplatform_dp.models.UpdateExperimentRunTagsDetails) — Details of ExperimentRun tags


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.UpdateExperimentRunTagsResponseDetails]` — Response object for updating tags of an ExperimentRun


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `update_experiment_tags`
<a id="update-experiment-tags"></a>
(Preview) Updates tags on experiment.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `update_experiment_tags_details` (oci.aidataplatform_dp.models.UpdateExperimentTagsDetails) — Details of Experiment tags


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.UpdateExperimentTagsResponseDetails]` — Response object for updating tags of an experiment


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `update_model_version`
<a id="update-model-version"></a>
(Preview) Updates a model version

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `update_model_version_details` (oci.aidataplatform_dp.models.UpdateModelVersionDetails) — Details to update model version


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.UpdateModelVersionResponseDetails]` — Updated model version details

**Response Fields:**

- `model_version` (ModelVersion (required)) — model_version of this UpdateModelVersionResponseDetails


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `update_model_version_tags`
<a id="update-model-version-tags"></a>
(Preview) Updates tags on a model version.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `update_model_version_tags_details` (oci.aidataplatform_dp.models.UpdateModelVersionTagsDetails) — Details of model version tags to update


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.UpdateModelVersionTagsResponseDetails]` — Response object for updating tags of a model version


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `update_registered_model`
<a id="update-registered-model"></a>
(Preview) Updates a registered model with the provided details.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `update_registered_model_details` (oci.aidataplatform_dp.models.UpdateRegisteredModelDetails) — Details to update registered model


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.UpdateRegisteredModelResponseDetails]` — Response object for updating a registered model

**Response Fields:**

- `registered_model` (RegisteredModel (required)) — registered_model of this UpdateRegisteredModelResponseDetails


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### `update_registered_model_tags`
<a id="update-registered-model-tags"></a>
(Preview) Updates tags on a registered model.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `update_registered_model_tags_details` (oci.aidataplatform_dp.models.UpdateRegisteredModelTagsDetails) — Details of registered model tags


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `dh_user_principal` (str) — DH User Principal Header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.UpdateRegisteredModelTagsResponseDetails]` — Response object for updating tags of a registered model


**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

## Notebook (NotebookClient)
**Operations:**
- [create_content](#create-content)
- [create_session](#create-session)
- [delete_content](#delete-content)
- [delete_session](#delete-session)
- [export_contents](#export-contents)
- [get_content](#get-content)
- [get_session](#get-session)
- [list_sessions](#list-sessions)
- [modify_content](#modify-content)
- [patch_session](#patch-session)
- [update_content](#update-content)
### `create_content`
<a id="create-content"></a>
Creates a new, untitled, empty file or directory, or copies an existing notebook to a specified path. For example, a POST call to /api/contents/path with body containing copy_from set to /path/to/OtherNotebook.ipynb creates a new copy of OtherNotebook at the specified path.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `content_path` (str) — path to notebook file
- `create_content_details` (oci.aidataplatform_dp.models.CreateContentDetails) — Notebook content to create a new notebook


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `datalake_tenant_id` (str) — tenant ID header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.Content]` — Content model provides a programmatic interface to interact with notebooks, files and directories within AI Data Platform Workbench Notebook environment

**Response Fields:**

- `name` (str (required)) — name of this Content. Name of notebook, file or directory, equivalent to last part of path
- `path` (str (required)) — path of this Content. Full path for notebook, file or directory
- `type` (str (required)) — type of this Content. Type of content model. .
- `writable` (bool (required)) — writable of this Content. Indicates whether requester has permission to edit file
- `created` (datetime (required)) — created of this Content. Creation timestamp
- `last_modified` (datetime (required)) — last_modified of this Content. Last modified timestamp
- `size` (int) — size of this Content. Size of file or notebook in bytes. If no size is provided, defaults to null
- `mimetype` (str (required)) — mimetype of this Content. Mimetype is only applicable for File model. For other models, it is None. If content is not null, and type is 'file', this contains mimetype of file. For example, text/plain application/octet-stream. Otherwise this is null
- `content` (object (required)) — content of this Content. Content if requested, otherwise is Null. For Notebook model, this contains a nbformat NotebookNode representing .ipynb file represented by model. For File model, content field is always Unicode type. For text-format file models, content simply contains bytes of file after decoding as UTF-8. Non-text (base64) files are read as bytes, base64 encoded, and then decoded as UTF-8. For Directory model, content field contains a list of content-free models representing entities in directory
- `format` (str (required)) — format of this Content. Format of content. For Notebook model, format field is always 'json'. For File model, format field is either 'text' or 'base64'. For directory model, format field is always 'json'. .
- `hash` (str) — hash of this Content. [optional] hexdigest hash string of content, if requested, otherwise null. It cannot be null if hashAlgorithm is defined
- `hash_algorithm` (str) — hash_algorithm of this Content. [optional] algorithm used to produce hash, if requested, (otherwise null). It cannot be null if hash is defined. <a href=" target="_blank" rel="noopener noreferrer">Available algorithms</a>
- `description` (str) — description of this Content. A user-provided description of file


**Return:** [Back to Notebook (NotebookClient)](#notebook-notebookclient) • [Top](#top)

### `create_session`
<a id="create-session"></a>
Creates a new session or returns an existing session if a session for the given path already exists.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `create_session_details` (oci.aidataplatform_dp.models.CreateSessionDetails) — Details to create a new session


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `datalake_tenant_id` (str) — tenant ID header
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.Session]` — Notebook Session describes Session context for a running instance of a Notebook. Each opened Notebook has a separate Session,

**Response Fields:**

- `id` (str (required)) — id of this Session. UUID of notebook session
- `name` (str (required)) — name of this Session. A user-friendly name for notebook session
- `path` (str) — path of this Session. Path to notebook session. For example, /data/test.ipynb
- `type` (str) — type of this Session. Notebook session type
- `cluster_id` (str) — cluster_id of this Session. Cluster ID
- `kernel` (Kernel) — kernel of this Session
- `agent_flow_key` (str) — agent_flow_key of this Session. Agent Flow Key of an agent flow
- `lifecycle_state` (str) — lifecycle_state of this Session. lifecycleState of a Notebook Session


**Return:** [Back to Notebook (NotebookClient)](#notebook-notebookclient) • [Top](#top)

### `delete_content`
<a id="delete-content"></a>
Deletes a notebook file or directory.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `content_path` (str) — path to notebook file


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Notebook (NotebookClient)](#notebook-notebookclient) • [Top](#top)

### `delete_session`
<a id="delete-session"></a>
Delete a session with given session ID.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `session_id` (str) — ID of Data Lake Notebook Session


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Notebook (NotebookClient)](#notebook-notebookclient) • [Top](#top)

### `export_contents`
<a id="export-contents"></a>
Exports the notebook file contents. You can optionally specify HTML or ipynb format through the request payload. If no format is specified, ipynb is used by default.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `content_path` (str) — path to notebook file
- `export_contents_details` (oci.aidataplatform_dp.models.ExportContentsDetails) — Payload to export contents of a file


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.ExportedContents]` — This model represents a file with contents, format and other details

**Response Fields:**

- `name` (str (required)) — name of this ExportedContents. Name of file, equivalent to last part of path
- `path` (str (required)) — path of this ExportedContents. Full path of file
- `content` (object (required)) — content of this ExportedContents. For ipynb format, this contains a string representing .ipynb file. For html format, this contains a string representing HTML page, it has base64 encoded data for images
- `format` (str (required)) — format of this ExportedContents. Format of content as requested by client. By default, ipynb format. .


**Return:** [Back to Notebook (NotebookClient)](#notebook-notebookclient) • [Top](#top)

### `get_content`
<a id="get-content"></a>
Returns a list of contents for a given file or directory. You can optionally specify a type and/or format argument via URL parameter.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `content_path` (str) — path to notebook file


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `type` (str) — Content type. Either file, directory, or notebook.
- `format` (str) — format in which content should be returned. Either text, base64, or JSON.
- `content` (int) — Returns content based on param value. When set to 0, content is NOT returned. When set to 1, content is returned
- `hash` (int) — Returns hash hexdigest string of content and hash algorithm. 0 for no hash, 1 for return hash. 0 is default. It may be ignored by content manager
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.Content]` — Content model provides a programmatic interface to interact with notebooks, files and directories within AI Data Platform Workbench Notebook environment

**Response Fields:**

- `name` (str (required)) — name of this Content. Name of notebook, file or directory, equivalent to last part of path
- `path` (str (required)) — path of this Content. Full path for notebook, file or directory
- `type` (str (required)) — type of this Content. Type of content model. .
- `writable` (bool (required)) — writable of this Content. Indicates whether requester has permission to edit file
- `created` (datetime (required)) — created of this Content. Creation timestamp
- `last_modified` (datetime (required)) — last_modified of this Content. Last modified timestamp
- `size` (int) — size of this Content. Size of file or notebook in bytes. If no size is provided, defaults to null
- `mimetype` (str (required)) — mimetype of this Content. Mimetype is only applicable for File model. For other models, it is None. If content is not null, and type is 'file', this contains mimetype of file. For example, text/plain application/octet-stream. Otherwise this is null
- `content` (object (required)) — content of this Content. Content if requested, otherwise is Null. For Notebook model, this contains a nbformat NotebookNode representing .ipynb file represented by model. For File model, content field is always Unicode type. For text-format file models, content simply contains bytes of file after decoding as UTF-8. Non-text (base64) files are read as bytes, base64 encoded, and then decoded as UTF-8. For Directory model, content field contains a list of content-free models representing entities in directory
- `format` (str (required)) — format of this Content. Format of content. For Notebook model, format field is always 'json'. For File model, format field is either 'text' or 'base64'. For directory model, format field is always 'json'. .
- `hash` (str) — hash of this Content. [optional] hexdigest hash string of content, if requested, otherwise null. It cannot be null if hashAlgorithm is defined
- `hash_algorithm` (str) — hash_algorithm of this Content. [optional] algorithm used to produce hash, if requested, (otherwise null). It cannot be null if hash is defined. <a href=" target="_blank" rel="noopener noreferrer">Available algorithms</a>
- `description` (str) — description of this Content. A user-provided description of file


**Return:** [Back to Notebook (NotebookClient)](#notebook-notebookclient) • [Top](#top)

### `get_session`
<a id="get-session"></a>
Returns session details for a given session ID.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `session_id` (str) — ID of Data Lake Notebook Session


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.Session]` — Notebook Session describes Session context for a running instance of a Notebook. Each opened Notebook has a separate Session,

**Response Fields:**

- `id` (str (required)) — id of this Session. UUID of notebook session
- `name` (str (required)) — name of this Session. A user-friendly name for notebook session
- `path` (str) — path of this Session. Path to notebook session. For example, /data/test.ipynb
- `type` (str) — type of this Session. Notebook session type
- `cluster_id` (str) — cluster_id of this Session. Cluster ID
- `kernel` (Kernel) — kernel of this Session
- `agent_flow_key` (str) — agent_flow_key of this Session. Agent Flow Key of an agent flow
- `lifecycle_state` (str) — lifecycle_state of this Session. lifecycleState of a Notebook Session


**Return:** [Back to Notebook (NotebookClient)](#notebook-notebookclient) • [Top](#top)

### `list_sessions`
<a id="list-sessions"></a>
Returns a list of all available sessions.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace


**Optional Parameters:**

- `cluster_id` (str) — Cluster ID attached to a session
- `path` (str) — Notebook file path attached to a session
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `agent_flow_key` (str) — Agent flow key of attached agent flow
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.SessionCollection]` — A list of session summaries related to a workspace

**Response Fields:**

- `items` (list[SessionSummary] (required)) — items of this SessionCollection. List of sessions


**Return:** [Back to Notebook (NotebookClient)](#notebook-notebookclient) • [Top](#top)

### `modify_content`
<a id="modify-content"></a>
Renames a file or directory without re-uploading content.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `content_path` (str) — path to notebook file
- `modify_content_details` (oci.aidataplatform_dp.models.ModifyContentDetails) — New path for file or directory


**Optional Parameters:**

- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.Content]` — Content model provides a programmatic interface to interact with notebooks, files and directories within AI Data Platform Workbench Notebook environment

**Response Fields:**

- `name` (str (required)) — name of this Content. Name of notebook, file or directory, equivalent to last part of path
- `path` (str (required)) — path of this Content. Full path for notebook, file or directory
- `type` (str (required)) — type of this Content. Type of content model. .
- `writable` (bool (required)) — writable of this Content. Indicates whether requester has permission to edit file
- `created` (datetime (required)) — created of this Content. Creation timestamp
- `last_modified` (datetime (required)) — last_modified of this Content. Last modified timestamp
- `size` (int) — size of this Content. Size of file or notebook in bytes. If no size is provided, defaults to null
- `mimetype` (str (required)) — mimetype of this Content. Mimetype is only applicable for File model. For other models, it is None. If content is not null, and type is 'file', this contains mimetype of file. For example, text/plain application/octet-stream. Otherwise this is null
- `content` (object (required)) — content of this Content. Content if requested, otherwise is Null. For Notebook model, this contains a nbformat NotebookNode representing .ipynb file represented by model. For File model, content field is always Unicode type. For text-format file models, content simply contains bytes of file after decoding as UTF-8. Non-text (base64) files are read as bytes, base64 encoded, and then decoded as UTF-8. For Directory model, content field contains a list of content-free models representing entities in directory
- `format` (str (required)) — format of this Content. Format of content. For Notebook model, format field is always 'json'. For File model, format field is either 'text' or 'base64'. For directory model, format field is always 'json'. .
- `hash` (str) — hash of this Content. [optional] hexdigest hash string of content, if requested, otherwise null. It cannot be null if hashAlgorithm is defined
- `hash_algorithm` (str) — hash_algorithm of this Content. [optional] algorithm used to produce hash, if requested, (otherwise null). It cannot be null if hash is defined. <a href=" target="_blank" rel="noopener noreferrer">Available algorithms</a>
- `description` (str) — description of this Content. A user-provided description of file


**Return:** [Back to Notebook (NotebookClient)](#notebook-notebookclient) • [Top](#top)

### `patch_session`
<a id="patch-session"></a>
Patches a session with a given ID with the provided details. You can use this to rename a session.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `session_id` (str) — ID of Data Lake Notebook Session
- `patch_session_details` (oci.aidataplatform_dp.models.PatchSessionDetails) — Details to patch for an existing session


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.Session]` — Notebook Session describes Session context for a running instance of a Notebook. Each opened Notebook has a separate Session,

**Response Fields:**

- `id` (str (required)) — id of this Session. UUID of notebook session
- `name` (str (required)) — name of this Session. A user-friendly name for notebook session
- `path` (str) — path of this Session. Path to notebook session. For example, /data/test.ipynb
- `type` (str) — type of this Session. Notebook session type
- `cluster_id` (str) — cluster_id of this Session. Cluster ID
- `kernel` (Kernel) — kernel of this Session
- `agent_flow_key` (str) — agent_flow_key of this Session. Agent Flow Key of an agent flow
- `lifecycle_state` (str) — lifecycle_state of this Session. lifecycleState of a Notebook Session


**Return:** [Back to Notebook (NotebookClient)](#notebook-notebookclient) • [Top](#top)

### `update_content`
<a id="update-content"></a>
Updates the contents of an existing notebook with the provided details or saves a new notebook.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `content_path` (str) — path to notebook file
- `update_content_details` (oci.aidataplatform_dp.models.UpdateContentDetails) — Details to update notebook content model file


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.Content]` — Content model provides a programmatic interface to interact with notebooks, files and directories within AI Data Platform Workbench Notebook environment

**Response Fields:**

- `name` (str (required)) — name of this Content. Name of notebook, file or directory, equivalent to last part of path
- `path` (str (required)) — path of this Content. Full path for notebook, file or directory
- `type` (str (required)) — type of this Content. Type of content model. .
- `writable` (bool (required)) — writable of this Content. Indicates whether requester has permission to edit file
- `created` (datetime (required)) — created of this Content. Creation timestamp
- `last_modified` (datetime (required)) — last_modified of this Content. Last modified timestamp
- `size` (int) — size of this Content. Size of file or notebook in bytes. If no size is provided, defaults to null
- `mimetype` (str (required)) — mimetype of this Content. Mimetype is only applicable for File model. For other models, it is None. If content is not null, and type is 'file', this contains mimetype of file. For example, text/plain application/octet-stream. Otherwise this is null
- `content` (object (required)) — content of this Content. Content if requested, otherwise is Null. For Notebook model, this contains a nbformat NotebookNode representing .ipynb file represented by model. For File model, content field is always Unicode type. For text-format file models, content simply contains bytes of file after decoding as UTF-8. Non-text (base64) files are read as bytes, base64 encoded, and then decoded as UTF-8. For Directory model, content field contains a list of content-free models representing entities in directory
- `format` (str (required)) — format of this Content. Format of content. For Notebook model, format field is always 'json'. For File model, format field is either 'text' or 'base64'. For directory model, format field is always 'json'. .
- `hash` (str) — hash of this Content. [optional] hexdigest hash string of content, if requested, otherwise null. It cannot be null if hashAlgorithm is defined
- `hash_algorithm` (str) — hash_algorithm of this Content. [optional] algorithm used to produce hash, if requested, (otherwise null). It cannot be null if hash is defined. <a href=" target="_blank" rel="noopener noreferrer">Available algorithms</a>
- `description` (str) — description of this Content. A user-provided description of file


**Return:** [Back to Notebook (NotebookClient)](#notebook-notebookclient) • [Top](#top)

## Role (RoleClient)
**Operations:**
- [add_member_to_role](#add-member-to-role)
- [create_role](#create-role)
- [delete_role](#delete-role)
- [get_role](#get-role)
- [list_role_permissions](#list-role-permissions)
- [list_roles](#list-roles)
- [remove_member_from_role](#remove-member-from-role)
- [update_role](#update-role)
### `add_member_to_role`
<a id="add-member-to-role"></a>
Assigns a given user/group/principal to a role.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `role_key` (str) — unique key of Role
- `add_member_to_role_details` (oci.aidataplatform_dp.models.AddMemberToRoleDetails) — details of assignee(s) to which a role is assigned


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Role (RoleClient)](#role-roleclient) • [Top](#top)

### `create_role`
<a id="create-role"></a>
Creates a role.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `create_role_details` (oci.aidataplatform_dp.models.CreateRoleDetails) — Details for new role


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.Role]` — Role details

**Response Fields:**

- `key` (str (required)) — key of this Role. A unique key for role. It cannot be changed
- `display_name` (str) — display_name of this Role. role name. It can be changed
- `role_type` (str) — role_type of this Role. Type of role
- `time_created` (datetime) — time_created of this Role. time role was created. An RFC3339 formatted datetime string
- `time_updated` (datetime) — time_updated of this Role. time Role was updated. An RFC3339 formatted datetime string
- `created_by` (str) — created_by of this Role. user name of user/principal who created role
- `updated_by` (str) — updated_by of this Role. user name of user/principal who updated role
- `is_assigned` (bool) — is_assigned of this Role. role is assigned to current user or a group that user is part of
- `assignees` (list[RoleAssignee]) — assignees of this Role. users and groups this role is assigned to
- `lifecycle_state` (str) — lifecycle_state of this Role. state of role
- `lifecycle_details` (str) — lifecycle_details of this Role. A message describing current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state
- `description` (str) — description of this Role. description of role


**Return:** [Back to Role (RoleClient)](#role-roleclient) • [Top](#top)

### `delete_role`
<a id="delete-role"></a>
Deletes a role.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `role_key` (str) — unique key of Role


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Role (RoleClient)](#role-roleclient) • [Top](#top)

### `get_role`
<a id="get-role"></a>
Returns detailed information about a role.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `role_key` (str) — unique key of Role


**Optional Parameters:**

- `role_scope` (str) — scope of roles to be returned. Defaults to USER.
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.Role]` — Role details

**Response Fields:**

- `key` (str (required)) — key of this Role. A unique key for role. It cannot be changed
- `display_name` (str) — display_name of this Role. role name. It can be changed
- `role_type` (str) — role_type of this Role. Type of role
- `time_created` (datetime) — time_created of this Role. time role was created. An RFC3339 formatted datetime string
- `time_updated` (datetime) — time_updated of this Role. time Role was updated. An RFC3339 formatted datetime string
- `created_by` (str) — created_by of this Role. user name of user/principal who created role
- `updated_by` (str) — updated_by of this Role. user name of user/principal who updated role
- `is_assigned` (bool) — is_assigned of this Role. role is assigned to current user or a group that user is part of
- `assignees` (list[RoleAssignee]) — assignees of this Role. users and groups this role is assigned to
- `lifecycle_state` (str) — lifecycle_state of this Role. state of role
- `lifecycle_details` (str) — lifecycle_details of this Role. A message describing current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state
- `description` (str) — description of this Role. description of role


**Return:** [Back to Role (RoleClient)](#role-roleclient) • [Top](#top)

### `list_role_permissions`
<a id="list-role-permissions"></a>
Returns a list of permissions for a given role.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `role_key` (str) — unique key of Role


**Optional Parameters:**

- `permission_scope` (str) — scope of role permissions to be returned. Defaults to ALL
- `limit` (int) — For list pagination. maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination
- `page` (str) — For list pagination. value of opc-next-page response header from previous "List" call. For important details about how pagination works, see List Pagination
- `sort_order` (str) — sort order to use, either ascending (ASC) or descending (DESC).
- `sort_by` (str) — field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending.
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.RolePermissionCollection]` — A collection of permission summaries associated with a role

**Response Fields:**

- `items` (list[RolePermissionSummary] (required)) — items of this RolePermissionCollection. Role permissions


**Return:** [Back to Role (RoleClient)](#role-roleclient) • [Top](#top)

### `list_roles`
<a id="list-roles"></a>
Returns a list of roles.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance


**Optional Parameters:**

- `lifecycle_state` (str) — A filter to return only resources that match given lifecycle state. state value is case-insensitive.
- `display_name` (str) — A filter to return only resources that match given display name exactly
- `limit` (int) — For list pagination. maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination
- `page` (str) — For list pagination. value of opc-next-page response header from previous "List" call. For important details about how pagination works, see List Pagination
- `sort_order` (str) — sort order to use, either ascending (ASC) or descending (DESC).
- `sort_by` (str) — field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending.
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.RoleCollection]` — results of a role search. It contains RoleSummary objects

**Response Fields:**

- `items` (list[RoleSummary] (required)) — items of this RoleCollection. role summaries returned


**Return:** [Back to Role (RoleClient)](#role-roleclient) • [Top](#top)

### `remove_member_from_role`
<a id="remove-member-from-role"></a>
Revoke a role from a given user or group.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `role_key` (str) — unique key of Role
- `remove_member_from_role_details` (oci.aidataplatform_dp.models.RemoveMemberFromRoleDetails) — details of user or group from which role is to be revoked


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Role (RoleClient)](#role-roleclient) • [Top](#top)

### `update_role`
<a id="update-role"></a>
Updates a role with the provided information.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `role_key` (str) — unique key of Role
- `update_role_details` (oci.aidataplatform_dp.models.UpdateRoleDetails) — information to be updated


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.Role]` — Role details

**Response Fields:**

- `key` (str (required)) — key of this Role. A unique key for role. It cannot be changed
- `display_name` (str) — display_name of this Role. role name. It can be changed
- `role_type` (str) — role_type of this Role. Type of role
- `time_created` (datetime) — time_created of this Role. time role was created. An RFC3339 formatted datetime string
- `time_updated` (datetime) — time_updated of this Role. time Role was updated. An RFC3339 formatted datetime string
- `created_by` (str) — created_by of this Role. user name of user/principal who created role
- `updated_by` (str) — updated_by of this Role. user name of user/principal who updated role
- `is_assigned` (bool) — is_assigned of this Role. role is assigned to current user or a group that user is part of
- `assignees` (list[RoleAssignee]) — assignees of this Role. users and groups this role is assigned to
- `lifecycle_state` (str) — lifecycle_state of this Role. state of role
- `lifecycle_details` (str) — lifecycle_details of this Role. A message describing current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state
- `description` (str) — description of this Role. description of role


**Return:** [Back to Role (RoleClient)](#role-roleclient) • [Top](#top)

## Schema (SchemaClient)
**Operations:**
- [create_data_table](#create-data-table)
- [create_schema](#create-schema)
- [create_table](#create-table)
- [create_view](#create-view)
- [delete_schema](#delete-schema)
- [delete_table](#delete-table)
- [delete_view](#delete-view)
- [generate_temp_file_upload_target](#generate-temp-file-upload-target)
- [get_schema](#get-schema)
- [get_table](#get-table)
- [get_view](#get-view)
- [list_schema_permissions](#list-schema-permissions)
- [list_schemas](#list-schemas)
- [list_table_permissions](#list-table-permissions)
- [list_tables](#list-tables)
- [list_view_permissions](#list-view-permissions)
- [list_views](#list-views)
- [manage_schema_permission](#manage-schema-permission)
- [manage_table_permission](#manage-table-permission)
- [manage_view_permission](#manage-view-permission)
- [perform_infer_schema](#perform-infer-schema)
- [perform_infer_schema_with_preview](#perform-infer-schema-with-preview)
- [refresh_schema](#refresh-schema)
- [refresh_table](#refresh-table)
- [retrieve_par](#retrieve-par)
- [update_schema](#update-schema)
- [update_table](#update-table)
- [update_view](#update-view)
### `create_data_table`
<a id="create-data-table"></a>
Creates a managed table with data loaded from a sample file.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `create_data_table_details` (oci.aidataplatform_dp.models.CreateDataTableDetails) — Details for new managed table with data


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### `create_schema`
<a id="create-schema"></a>
Creates a schema.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `create_schema_details` (oci.aidataplatform_dp.models.CreateSchemaDetails) — Details for new schema


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### `create_table`
<a id="create-table"></a>
Creates a table.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `create_table_details` (oci.aidataplatform_dp.models.CreateTableDetails) — Details for new table


**Optional Parameters:**

- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### `create_view`
<a id="create-view"></a>
Creates a view.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `create_view_details` (oci.aidataplatform_dp.models.CreateViewDetails) — Details for new view


**Optional Parameters:**

- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.View]` — Information about view in schema

**Response Fields:**

- `key` (str) — key of this View. fully qualified name of view in format <catalog_name>.<schema_name>.<view_name>
- `display_name` (str (required)) — display_name of this View. A user-friendly name. Has to be unique within scope of schema and is changeable
- `catalog_key` (str) — catalog_key of this View. name of catalog to which this view belongs
- `schema_key` (str) — schema_key of this View. name of Schema to which this view belongs
- `view_text` (str) — view_text of this View. Query used to create view
- `description` (str) — description of this View. description of view
- `view_fields` (list[ViewFieldDetails]) — view_fields of this View. Columns for view
- `time_created` (datetime) — time_created of this View. date and time View was created, in format defined by <a href=" target="_blank" rel="noopener noreferrer">RFC 3339</a>
- `time_updated` (datetime) — time_updated of this View. date and time View was updated, in format defined by <a href=" target="_blank" rel="noopener noreferrer">RFC 3339</a>
- `created_by` (str) — created_by of this View. ID of user/principal who created view
- `updated_by` (str) — updated_by of this View. ID of user who last updated view
- `view_properties` (list[ViewProperty]) — view_properties of this View. View Properties
- `lifecycle_state` (str) — lifecycle_state of this View. state of view
- `lifecycle_state_details` (str) — lifecycle_state_details of this View. A message describing current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state


**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### `delete_schema`
<a id="delete-schema"></a>
Deletes a schema from an AI Data Platform Workbench.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `schema_key` (str) — fully qualified name of schema in format


**Optional Parameters:**

- `is_forced` (bool) — A boolean which decides if an entity should be deleted with Cascade effect
- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### `delete_table`
<a id="delete-table"></a>
Deletes a table from an AI Data Platform Workbench.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `table_key` (str) — fully qualified name of table in format


**Optional Parameters:**

- `display_name` (str) — A filter to return only resources that match given display name exactly
- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### `delete_view`
<a id="delete-view"></a>
Deletes a view from AI Data Platform Workbench.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `view_key` (str) — fully qualified name of view in format


**Optional Parameters:**

- `display_name` (str) — A filter to return only resources that match given display name exactly
- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### `generate_temp_file_upload_target`
<a id="generate-temp-file-upload-target"></a>
Generates a URI for uploading a sample file to a temporary folder in a schema.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `schema_key` (str) — fully qualified name of schema in format


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.GenerateTempFileUploadTargetResponseDetails]` — details for a generated URI for uploading a temporary file in a schema

**Response Fields:**

- `temp_file_upload_target` (str (required)) — temp_file_upload_target of this GenerateTempFileUploadTargetResponseDetails. generated target URI to upload file, it must be prefixed by object stroage URL
- `upload_key` (str (required)) — upload_key of this GenerateTempFileUploadTargetResponseDetails. unique key for this request
- `oci_file_path` (str (required)) — oci_file_path of this GenerateTempFileUploadTargetResponseDetails. exact URI path of object storage


**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### `get_schema`
<a id="get-schema"></a>
Returns detailed information about a specified schema.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `schema_key` (str) — fully qualified name of schema in format


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.Schema]` — Schema in data catalogs are constructs to organize data. Schema can contain tables, which contain structured data,

**Response Fields:**

- `entity_type` (str (required)) — entity_type of this Schema. An enum to decide type of derived model. .
- `key` (str (required)) — key of this Schema. fully qualified name of schema in format <catalog_name>.<schema_name>
- `display_name` (str (required)) — display_name of this Schema. Schema name
- `description` (str) — description of this Schema. Schema description
- `time_created` (datetime) — time_created of this Schema. date and time schema was created
- `time_updated` (datetime) — time_updated of this Schema. date and time schema was updated
- `created_by` (str) — created_by of this Schema. ID of user who created schema
- `updated_by` (str) — updated_by of this Schema. ID of user who last updated schema
- `properties` (dict(str, str)) — properties of this Schema. Key-value pair representing a defined tag key and value
- `catalog_name` (str) — catalog_name of this Schema. name of catalog to which this schema belongs
- `lifecycle_state` (str) — lifecycle_state of this Schema. current state of schema
- `lifecycle_state_details` (str) — lifecycle_state_details of this Schema. A message describing current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state
- `details` (dict(str, str)) — details of this Schema. Deprecated field. Map of key-value pairs. This object will be only provided when parent catalog is external


**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### `get_table`
<a id="get-table"></a>
Returns detailed information about a table.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `table_key` (str) — fully qualified name of table in format


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.Table]` — Information about table in schema

**Response Fields:**

- `entity_type` (str (required)) — entity_type of this Table. An enum to decide type of derived model .
- `key` (str) — key of this Table. fully qualified name of table in format <catalog_name>.<schema_name>.<table_name>
- `display_name` (str (required)) — display_name of this Table. Table name
- `catalog_key` (str) — catalog_key of this Table. name of catalog to which this table belongs
- `schema_key` (str) — schema_key of this Table. name of schema to which this table belongs
- `location` (str) — location of this Table. Location of table data
- `description` (str) — description of this Table. Table description
- `table_type` (str) — table_type of this Table. Type of table. Managed, external or mount table
- `managed_table_definition` (ManagedTableDefinition) — managed_table_definition of this Table
- `external_table_definition` (ExternalTableDefinition) — external_table_definition of this Table
- `table_fields` (list[TableFieldDetails]) — table_fields of this Table. Columns for table
- `partition_keys` (list[TableFieldDetails]) — partition_keys of this Table. Columns to be used in partition for table
- `table_properties` (list[TableProperty]) — table_properties of this Table. Table properties
- `time_created` (datetime) — time_created of this Table. date and time table was created
- `time_updated` (datetime) — time_updated of this Table. date and time table was updated
- `created_by` (str) — created_by of this Table. OCID of user/principal who created table
- `updated_by` (str) — updated_by of this Table. ID of user who last updated schema
- `lifecycle_state` (str) — lifecycle_state of this Table. state of table
- `lifecycle_state_details` (str) — lifecycle_state_details of this Table. A message describing current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state


**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### `get_view`
<a id="get-view"></a>
Returns information about a view.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `view_key` (str) — fully qualified name of view in format


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.View]` — Information about view in schema

**Response Fields:**

- `key` (str) — key of this View. fully qualified name of view in format <catalog_name>.<schema_name>.<view_name>
- `display_name` (str (required)) — display_name of this View. A user-friendly name. Has to be unique within scope of schema and is changeable
- `catalog_key` (str) — catalog_key of this View. name of catalog to which this view belongs
- `schema_key` (str) — schema_key of this View. name of Schema to which this view belongs
- `view_text` (str) — view_text of this View. Query used to create view
- `description` (str) — description of this View. description of view
- `view_fields` (list[ViewFieldDetails]) — view_fields of this View. Columns for view
- `time_created` (datetime) — time_created of this View. date and time View was created, in format defined by <a href=" target="_blank" rel="noopener noreferrer">RFC 3339</a>
- `time_updated` (datetime) — time_updated of this View. date and time View was updated, in format defined by <a href=" target="_blank" rel="noopener noreferrer">RFC 3339</a>
- `created_by` (str) — created_by of this View. ID of user/principal who created view
- `updated_by` (str) — updated_by of this View. ID of user who last updated view
- `view_properties` (list[ViewProperty]) — view_properties of this View. View Properties
- `lifecycle_state` (str) — lifecycle_state of this View. state of view
- `lifecycle_state_details` (str) — lifecycle_state_details of this View. A message describing current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state


**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### `list_schema_permissions`
<a id="list-schema-permissions"></a>
Returns a list of permissions for a given schema.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `schema_key` (str) — fully qualified name of schema in format


**Optional Parameters:**

- `limit` (int) — For list pagination. maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination
- `page` (str) — For list pagination. value of opc-next-page response header from previous "List" call. For important details about how pagination works, see List Pagination
- `sort_order` (str) — sort order to use, either ascending (ASC) or descending (DESC).
- `sort_by` (str) — field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending.
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.SchemaPermissionCollection]` — List of schema permissions

**Response Fields:**

- `items` (list[SchemaPermissionSummary] (required)) — items of this SchemaPermissionCollection. List of schema permissions


**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### `list_schemas`
<a id="list-schemas"></a>
Returns a list of schemas in a given AI Data Platform Workbench.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `catalog_key` (str) — key of catalog


**Optional Parameters:**

- `display_name` (str) — A filter to return only resources that match given display name exactly
- `limit` (int) — For list pagination. maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination
- `page` (str) — For list pagination. value of opc-next-page response header from previous "List" call. For important details about how pagination works, see List Pagination
- `sort_order` (str) — sort order to use, either ascending (ASC) or descending (DESC).
- `sort_by` (str) — field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending.
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.SchemaCollection]` — Result of listing schemas

**Response Fields:**

- `items` (list[SchemaSummary] (required)) — items of this SchemaCollection. List of schemas


**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### `list_table_permissions`
<a id="list-table-permissions"></a>
Returns a list of permissions for a given table.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `table_key` (str) — fully qualified name of table in format


**Optional Parameters:**

- `limit` (int) — For list pagination. maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination
- `page` (str) — For list pagination. value of opc-next-page response header from previous "List" call. For important details about how pagination works, see List Pagination
- `sort_order` (str) — sort order to use, either ascending (ASC) or descending (DESC).
- `sort_by` (str) — field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending.
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.TablePermissionCollection]` — List of table permissions

**Response Fields:**

- `items` (list[TablePermissionSummary] (required)) — items of this TablePermissionCollection. List of table permissions


**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### `list_tables`
<a id="list-tables"></a>
Returns a list of tables in a schema.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `catalog_key` (str) — key of catalog
- `schema_key` (str) — fully qualified name of Data Lake Schema in format


**Optional Parameters:**

- `display_name` (str) — A filter to return only resources that match given display name exactly
- `limit` (int) — For list pagination. maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination
- `page` (str) — For list pagination. value of opc-next-page response header from previous "List" call. For important details about how pagination works, see List Pagination
- `sort_order` (str) — sort order to use, either ascending (ASC) or descending (DESC).
- `sort_by` (str) — field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending.
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.TableCollection]` — Result of listing tables in a schema

**Response Fields:**

- `items` (list[TableSummary] (required)) — items of this TableCollection. List of tables


**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### `list_view_permissions`
<a id="list-view-permissions"></a>
Returns a list of view permissions.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `view_key` (str) — fully qualified name of view in format


**Optional Parameters:**

- `limit` (int) — For list pagination. maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination
- `page` (str) — For list pagination. value of opc-next-page response header from previous "List" call. For important details about how pagination works, see List Pagination
- `sort_order` (str) — sort order to use, either ascending (ASC) or descending (DESC).
- `sort_by` (str) — field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending.
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.ViewPermissionCollection]` — List of view permissions

**Response Fields:**

- `items` (list[ViewPermissionSummary] (required)) — items of this ViewPermissionCollection. List of view permissions


**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### `list_views`
<a id="list-views"></a>
Returns a list of views in a schema.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `catalog_key` (str) — key of catalog
- `schema_key` (str) — fully qualified name of Data Lake Schema in format


**Optional Parameters:**

- `display_name` (str) — A filter to return only resources that match given display name exactly
- `limit` (int) — For list pagination. maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination
- `page` (str) — For list pagination. value of opc-next-page response header from previous "List" call. For important details about how pagination works, see List Pagination
- `sort_order` (str) — sort order to use, either ascending (ASC) or descending (DESC).
- `sort_by` (str) — field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending.
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.ViewCollection]` — Result of listing views in a schema

**Response Fields:**

- `items` (list[ViewSummary] (required)) — items of this ViewCollection. List of views


**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### `manage_schema_permission`
<a id="manage-schema-permission"></a>
Updates the permissions for a given schema.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `schema_key` (str) — fully qualified name of schema in format
- `manage_schema_permission_details` (oci.aidataplatform_dp.models.ManageSchemaPermissionDetails) — information to be updated


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### `manage_table_permission`
<a id="manage-table-permission"></a>
Updates the permissions for a given table.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `table_key` (str) — fully qualified name of table in format
- `manage_table_permission_details` (oci.aidataplatform_dp.models.ManageTablePermissionDetails) — information to be updated


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### `manage_view_permission`
<a id="manage-view-permission"></a>
Updates permissions on a view.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `view_key` (str) — fully qualified name of view in format
- `manage_view_permission_details` (oci.aidataplatform_dp.models.ManageViewPermissionDetails) — information to be updated


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### `perform_infer_schema`
<a id="perform-infer-schema"></a>
Returns details of a table schema from the specified location.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `schema_key` (str) — fully qualified name of schema in format
- `perform_infer_schema_details` (oci.aidataplatform_dp.models.PerformInferSchemaDetails) — Details of location from which table schema can be inferred


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.InferSchema]` — Inferred schema from location

**Response Fields:**

- `infer_schema_column` (list[InferSchemaColumn] (required)) — infer_schema_column of this InferSchema. Column information obtained by inferring schema


**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### `perform_infer_schema_with_preview`
<a id="perform-infer-schema-with-preview"></a>
Returns table schema and data from the specified location.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `schema_key` (str) — fully qualified name of schema in format
- `perform_infer_schema_details` (oci.aidataplatform_dp.models.PerformInferSchemaDetails) — Details of location from which table schema and data can be inferred


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.InferSchemaWithPreview]` — Inferred schema and data

**Response Fields:**

- `schema` (list[InferSchemaColumn] (required)) — schema of this InferSchemaWithPreview. Column information obtained by inferring schema
- `data` (list[dict(str, str)] (required)) — data of this InferSchemaWithPreview. Sample preview data


**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### `refresh_schema`
<a id="refresh-schema"></a>
Refreshes schema in an AI Data Platform Workbench through the crawler.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `schema_key` (str) — fully qualified name of schema in format


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### `refresh_table`
<a id="refresh-table"></a>
Refreshes a table in an AI Data Platform Workbench through the crawler.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `table_key` (str) — fully qualified name of table in format


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### `retrieve_par`
<a id="retrieve-par"></a>
Retrieve PAR for the entities created in AI Data Platform Workbench.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `table_key` (str) — fully qualified name of table in format


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.ParDetails]` — details of PAR URL associated with table

**Response Fields:**

- `par_url` (str (required)) — par_url of this ParDetails. PAR URL of table
- `table_key` (str (required)) — table_key of this ParDetails. fully qualified name of table in format <catalog_name>.<schema_name>.<table_name>
- `time_expires` (datetime (required)) — time_expires of this ParDetails. date and time table was updated
- `par_access_type` (str (required)) — par_access_type of this ParDetails. operation that can be performed on this resource. .


**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### `update_schema`
<a id="update-schema"></a>
Updates a schema.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `schema_key` (str) — fully qualified name of schema in format
- `update_schema_details` (oci.aidataplatform_dp.models.UpdateSchemaDetails) — information to be updated


**Optional Parameters:**

- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.Schema]` — Schema in data catalogs are constructs to organize data. Schema can contain tables, which contain structured data,

**Response Fields:**

- `entity_type` (str (required)) — entity_type of this Schema. An enum to decide type of derived model. .
- `key` (str (required)) — key of this Schema. fully qualified name of schema in format <catalog_name>.<schema_name>
- `display_name` (str (required)) — display_name of this Schema. Schema name
- `description` (str) — description of this Schema. Schema description
- `time_created` (datetime) — time_created of this Schema. date and time schema was created
- `time_updated` (datetime) — time_updated of this Schema. date and time schema was updated
- `created_by` (str) — created_by of this Schema. ID of user who created schema
- `updated_by` (str) — updated_by of this Schema. ID of user who last updated schema
- `properties` (dict(str, str)) — properties of this Schema. Key-value pair representing a defined tag key and value
- `catalog_name` (str) — catalog_name of this Schema. name of catalog to which this schema belongs
- `lifecycle_state` (str) — lifecycle_state of this Schema. current state of schema
- `lifecycle_state_details` (str) — lifecycle_state_details of this Schema. A message describing current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state
- `details` (dict(str, str)) — details of this Schema. Deprecated field. Map of key-value pairs. This object will be only provided when parent catalog is external


**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### `update_table`
<a id="update-table"></a>
Updates a table with provided details.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `table_key` (str) — fully qualified name of table in format
- `update_table_details` (oci.aidataplatform_dp.models.UpdateTableDetails) — information to be updated


**Optional Parameters:**

- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### `update_view`
<a id="update-view"></a>
Updates a view with given information.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `view_key` (str) — fully qualified name of view in format
- `update_view_details` (oci.aidataplatform_dp.models.UpdateViewDetails) — update mode and information to be updated


**Optional Parameters:**

- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.View]` — Information about view in schema

**Response Fields:**

- `key` (str) — key of this View. fully qualified name of view in format <catalog_name>.<schema_name>.<view_name>
- `display_name` (str (required)) — display_name of this View. A user-friendly name. Has to be unique within scope of schema and is changeable
- `catalog_key` (str) — catalog_key of this View. name of catalog to which this view belongs
- `schema_key` (str) — schema_key of this View. name of Schema to which this view belongs
- `view_text` (str) — view_text of this View. Query used to create view
- `description` (str) — description of this View. description of view
- `view_fields` (list[ViewFieldDetails]) — view_fields of this View. Columns for view
- `time_created` (datetime) — time_created of this View. date and time View was created, in format defined by <a href=" target="_blank" rel="noopener noreferrer">RFC 3339</a>
- `time_updated` (datetime) — time_updated of this View. date and time View was updated, in format defined by <a href=" target="_blank" rel="noopener noreferrer">RFC 3339</a>
- `created_by` (str) — created_by of this View. ID of user/principal who created view
- `updated_by` (str) — updated_by of this View. ID of user who last updated view
- `view_properties` (list[ViewProperty]) — view_properties of this View. View Properties
- `lifecycle_state` (str) — lifecycle_state of this View. state of view
- `lifecycle_state_details` (str) — lifecycle_state_details of this View. A message describing current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state


**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

## User Setting (UserSettingClient)
**Operations:**
- [create_user_setting](#create-user-setting)
- [delete_user_setting](#delete-user-setting)
- [get_user_setting](#get-user-setting)
- [list_user_settings](#list-user-settings)
- [update_user_setting](#update-user-setting)
### `create_user_setting`
<a id="create-user-setting"></a>
(Preview) The User Settings API allows you to manage user-specific configurations and credentials within an AI Data Platform instance.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `create_user_setting_details` (oci.aidataplatform_dp.models.CreateUserSettingDetails) — Details for new setting


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.UserSetting]` — User Setting

**Response Fields:**

- `key` (str (required)) — key of this UserSetting. unique identifier for setting
- `name` (str (required)) — name of this UserSetting. A user-friendly name for setting
- `is_default` (bool (required)) — is_default of this UserSetting. Indicates whether this setting is default
- `data` (SettingData) — data of this UserSetting


**Return:** [Back to User Setting (UserSettingClient)](#user-setting-usersettingclient) • [Top](#top)

### `delete_user_setting`
<a id="delete-user-setting"></a>
(Preview) Deletes a user setting and its credentials from this AI Data Platform instance, freeing the default slot for that type.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `setting_key` (str) — UUID of user setting


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to User Setting (UserSettingClient)](#user-setting-usersettingclient) • [Top](#top)

### `get_user_setting`
<a id="get-user-setting"></a>
(Preview) Returns the full definition of user settings identified by its key, including type-specific payload and default flag.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `setting_key` (str) — UUID of user setting


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.UserSetting]` — User Setting

**Response Fields:**

- `key` (str (required)) — key of this UserSetting. unique identifier for setting
- `name` (str (required)) — name of this UserSetting. A user-friendly name for setting
- `is_default` (bool (required)) — is_default of this UserSetting. Indicates whether this setting is default
- `data` (SettingData) — data of this UserSetting


**Return:** [Back to User Setting (UserSettingClient)](#user-setting-usersettingclient) • [Top](#top)

### `list_user_settings`
<a id="list-user-settings"></a>
(Preview) Returns a list of all user-specific configurations, with filters for setting type, default flag, and pagination when needed.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance


**Optional Parameters:**

- `setting_type` (str) — A filter to return only those settings whose value matches given data type.
- `is_default` (bool) — A filter to return only resources that are default
- `limit` (int) — For list pagination. maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination
- `page` (str) — For list pagination. value of opc-next-page response header from previous "List" call. For important details about how pagination works, see List Pagination
- `sort_order` (str) — sort order to use, either ascending (ASC) or descending (DESC).
- `sort_by` (str) — field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending.
- `display_name` (str) — A filter to return only resources that match given display name exactly
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.UserSettingCollection]` — Result of listing settings

**Response Fields:**

- `items` (list[UserSettingSummary] (required)) — items of this UserSettingCollection. List of settings


**Return:** [Back to User Setting (UserSettingClient)](#user-setting-usersettingclient) • [Top](#top)

### `update_user_setting`
<a id="update-user-setting"></a>
(Preview) Updates the metadata or payload of an existing user setting, letting you rotate credentials or change defaults.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `setting_key` (str) — UUID of user setting
- `update_user_setting_details` (oci.aidataplatform_dp.models.UpdateUserSettingDetails) — Details for user setting to be updated


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.UserSetting]` — User Setting

**Response Fields:**

- `key` (str (required)) — key of this UserSetting. unique identifier for setting
- `name` (str (required)) — name of this UserSetting. A user-friendly name for setting
- `is_default` (bool (required)) — is_default of this UserSetting. Indicates whether this setting is default
- `data` (SettingData) — data of this UserSetting


**Return:** [Back to User Setting (UserSettingClient)](#user-setting-usersettingclient) • [Top](#top)

## Volume (VolumeClient)
**Operations:**
- [create_volume](#create-volume)
- [delete_dir](#delete-dir)
- [delete_file](#delete-file)
- [delete_volume](#delete-volume)
- [download_file](#download-file)
- [download_file_with_par](#download-file-with-par)
- [get_volume](#get-volume)
- [list_files](#list-files)
- [list_volume_permissions](#list-volume-permissions)
- [list_volumes](#list-volumes)
- [make_dir](#make-dir)
- [manage_volume_permission](#manage-volume-permission)
- [update_dir](#update-dir)
- [update_volume](#update-volume)
- [upload_file](#upload-file)
- [upload_file_with_par](#upload-file-with-par)
### `create_volume`
<a id="create-volume"></a>
Creates a volume in AI Data Platform Workbench.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `create_volume_details` (oci.aidataplatform_dp.models.CreateVolumeDetails) — Details for new volume


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.Volume]` — A volumes is a container to store data in its original form and can store semi-structured or unstructured data

**Response Fields:**

- `key` (str (required)) — key of this Volume. key of volume
- `display_name` (str (required)) — display_name of this Volume. A user-friendly name. Has to be unique within schema and is changeable
- `description` (str) — description of this Volume. Short description of volume
- `time_created` (datetime (required)) — time_created of this Volume. date and time Data Lake Volume was created, in format defined by <a href=" target="_blank" rel="noopener noreferrer">RFC 3339</a>. .600Z
- `time_updated` (datetime) — time_updated of this Volume. date and time Data Lake Volume was updated, in format defined by <a href=" target="_blank" rel="noopener noreferrer">RFC 3339</a>
- `created_by` (str) — created_by of this Volume. ID of user that created volume
- `updated_by` (str) — updated_by of this Volume. ID of user that last updated volume
- `catalog_name` (str) — catalog_name of this Volume. name of catalog to which this volume belongs
- `schema_name` (str) — schema_name of this Volume. name of schema to which this volume belongs
- `full_name` (str) — full_name of this Volume. fully qualified name of this volume
- `volume_type` (str) — volume_type of this Volume. type of volume
- `storage_location` (str) — storage_location of this Volume. storage location of external volume. Only applicable for external volumes
- `lifecycle_state` (str) — lifecycle_state of this Volume. lifecycle state of volume. volume is ready for use in ACTIVE state
- `lifecycle_state_details` (str) — lifecycle_state_details of this Volume. Additional details associated with lifecycle state
- `system_tags` (dict(str, dict(str, object))) — system_tags of this Volume. System tags for this resource. Each key is predefined and scoped to a namespace.


**Return:** [Back to Volume (VolumeClient)](#volume-volumeclient) • [Top](#top)

### `delete_dir`
<a id="delete-dir"></a>
Deletes a directory in a volume.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `volume_key` (str) — key of volume
- `path` (str) — absolute path of file or folder


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Volume (VolumeClient)](#volume-volumeclient) • [Top](#top)

### `delete_file`
<a id="delete-file"></a>
Deletes a file or folder in a volume.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `volume_key` (str) — key of volume
- `path` (str) — absolute path of file or folder


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Volume (VolumeClient)](#volume-volumeclient) • [Top](#top)

### `delete_volume`
<a id="delete-volume"></a>
Deletes a volume.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `volume_key` (str) — key of volume


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Volume (VolumeClient)](#volume-volumeclient) • [Top](#top)

### `download_file`
<a id="download-file"></a>
Downloads a file from a volume.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `volume_key` (str) — key of volume
- `path` (str) — absolute path of file or folder


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[stream]`


**Return:** [Back to Volume (VolumeClient)](#volume-volumeclient) • [Top](#top)

### `download_file_with_par`
<a id="download-file-with-par"></a>
provide the par info for downloading the file for given path.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `volume_key` (str) — key of volume
- `path` (str) — absolute path of file or folder


**Optional Parameters:**

- `should_generate_new_par` (bool) — Flag to toggle to generate short living par
- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.DownloadFileWithParResult]` — Response object of generate PAR with download API

**Response Fields:**

- `par_url` (str) — par_url of this DownloadFileWithParResult. String representing PAR URL
- `e_tag` (str (required)) — e_tag of this DownloadFileWithParResult. Etag after creating or closing a file
- `location_uri` (str (required)) — location_uri of this DownloadFileWithParResult. object storage URI which has bucket and namespace information
- `size` (int (required)) — size of this DownloadFileWithParResult. File size in bytes
- `created_by` (str) — created_by of this DownloadFileWithParResult. user who created file
- `updated_by` (str) — updated_by of this DownloadFileWithParResult. user who last updated file
- `created_time` (str) — created_time of this DownloadFileWithParResult. time at which file was created
- `updated_time` (str) — updated_time of this DownloadFileWithParResult. last modified time of file
- `description` (str) — description of this DownloadFileWithParResult. file description
- `system_tags` (dict(str, dict(str, object))) — system_tags of this DownloadFileWithParResult. System tags for this resource. Each key is predefined and scoped to a namespace.


**Return:** [Back to Volume (VolumeClient)](#volume-volumeclient) • [Top](#top)

### `get_volume`
<a id="get-volume"></a>
Returns detailed information about a volume.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `volume_key` (str) — key of volume


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.Volume]` — A volumes is a container to store data in its original form and can store semi-structured or unstructured data

**Response Fields:**

- `key` (str (required)) — key of this Volume. key of volume
- `display_name` (str (required)) — display_name of this Volume. A user-friendly name. Has to be unique within schema and is changeable
- `description` (str) — description of this Volume. Short description of volume
- `time_created` (datetime (required)) — time_created of this Volume. date and time Data Lake Volume was created, in format defined by <a href=" target="_blank" rel="noopener noreferrer">RFC 3339</a>. .600Z
- `time_updated` (datetime) — time_updated of this Volume. date and time Data Lake Volume was updated, in format defined by <a href=" target="_blank" rel="noopener noreferrer">RFC 3339</a>
- `created_by` (str) — created_by of this Volume. ID of user that created volume
- `updated_by` (str) — updated_by of this Volume. ID of user that last updated volume
- `catalog_name` (str) — catalog_name of this Volume. name of catalog to which this volume belongs
- `schema_name` (str) — schema_name of this Volume. name of schema to which this volume belongs
- `full_name` (str) — full_name of this Volume. fully qualified name of this volume
- `volume_type` (str) — volume_type of this Volume. type of volume
- `storage_location` (str) — storage_location of this Volume. storage location of external volume. Only applicable for external volumes
- `lifecycle_state` (str) — lifecycle_state of this Volume. lifecycle state of volume. volume is ready for use in ACTIVE state
- `lifecycle_state_details` (str) — lifecycle_state_details of this Volume. Additional details associated with lifecycle state
- `system_tags` (dict(str, dict(str, object))) — system_tags of this Volume. System tags for this resource. Each key is predefined and scoped to a namespace.


**Return:** [Back to Volume (VolumeClient)](#volume-volumeclient) • [Top](#top)

### `list_files`
<a id="list-files"></a>
Returns a list of files in a volume.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `volume_key` (str) — key of volume
- `path` (str) — absolute path of file or folder


**Optional Parameters:**

- `is_recursive` (bool) — A boolean which decides if nested files should be in list files in volume response
- `display_name` (str) — A filter to return only resources that match given display name exactly
- `metadata_keys` (str) — Comma separated keys to have in list response
- `limit` (int) — For list pagination. maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination
- `page` (str) — For list pagination. value of opc-next-page response header from previous "List" call. For important details about how pagination works, see List Pagination
- `sort_order` (str) — sort order to use, either ascending (ASC) or descending (DESC).
- `sort_by` (str) — field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending.
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.VolumeFileCollection]` — Result of listing files in a volume

**Response Fields:**

- `items` (list[VolumeFileSummary] (required)) — items of this VolumeFileCollection. List of volume files


**Return:** [Back to Volume (VolumeClient)](#volume-volumeclient) • [Top](#top)

### `list_volume_permissions`
<a id="list-volume-permissions"></a>
Returns a list of volume permissions.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `volume_key` (str) — key of volume


**Optional Parameters:**

- `limit` (int) — For list pagination. maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination
- `page` (str) — For list pagination. value of opc-next-page response header from previous "List" call. For important details about how pagination works, see List Pagination
- `sort_order` (str) — sort order to use, either ascending (ASC) or descending (DESC).
- `sort_by` (str) — field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending.
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.VolumePermissionCollection]` — List of volume permissions

**Response Fields:**

- `items` (list[VolumePermissionSummary] (required)) — items of this VolumePermissionCollection. List of volume permissions


**Return:** [Back to Volume (VolumeClient)](#volume-volumeclient) • [Top](#top)

### `list_volumes`
<a id="list-volumes"></a>
Returns a list of volumes.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `catalog_key` (str) — key of catalog
- `schema_key` (str) — fully qualified name of Data Lake Schema in format


**Optional Parameters:**

- `display_name` (str) — A filter to return only resources that match given display name exactly
- `limit` (int) — For list pagination. maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination
- `page` (str) — For list pagination. value of opc-next-page response header from previous "List" call. For important details about how pagination works, see List Pagination
- `sort_order` (str) — sort order to use, either ascending (ASC) or descending (DESC).
- `sort_by` (str) — field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending.
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.VolumeCollection]` — Result of listing volumes

**Response Fields:**

- `items` (list[VolumeSummary] (required)) — items of this VolumeCollection. List of volumes


**Return:** [Back to Volume (VolumeClient)](#volume-volumeclient) • [Top](#top)

### `make_dir`
<a id="make-dir"></a>
Creates a directory in a volume.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `volume_key` (str) — key of volume
- `path` (str) — absolute path of file or folder


**Optional Parameters:**

- `description` (str) — description of folder
- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Volume (VolumeClient)](#volume-volumeclient) • [Top](#top)

### `manage_volume_permission`
<a id="manage-volume-permission"></a>
Updates the permissions on a volume.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `volume_key` (str) — key of volume
- `manage_volume_permission_details` (oci.aidataplatform_dp.models.ManageVolumePermissionDetails) — information to be updated


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Volume (VolumeClient)](#volume-volumeclient) • [Top](#top)

### `update_dir`
<a id="update-dir"></a>
Updates a directory in volume with the provided information.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `volume_key` (str) — key of volume
- `update_dir_details` (oci.aidataplatform_dp.models.UpdateDirDetails) — information to be updated
- `path` (str) — absolute path of file or folder


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Volume (VolumeClient)](#volume-volumeclient) • [Top](#top)

### `update_volume`
<a id="update-volume"></a>
Updates a volume with the provided information.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `volume_key` (str) — key of volume
- `update_volume_details` (oci.aidataplatform_dp.models.UpdateVolumeDetails) — information to be updated


**Optional Parameters:**

- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.Volume]` — A volumes is a container to store data in its original form and can store semi-structured or unstructured data

**Response Fields:**

- `key` (str (required)) — key of this Volume. key of volume
- `display_name` (str (required)) — display_name of this Volume. A user-friendly name. Has to be unique within schema and is changeable
- `description` (str) — description of this Volume. Short description of volume
- `time_created` (datetime (required)) — time_created of this Volume. date and time Data Lake Volume was created, in format defined by <a href=" target="_blank" rel="noopener noreferrer">RFC 3339</a>. .600Z
- `time_updated` (datetime) — time_updated of this Volume. date and time Data Lake Volume was updated, in format defined by <a href=" target="_blank" rel="noopener noreferrer">RFC 3339</a>
- `created_by` (str) — created_by of this Volume. ID of user that created volume
- `updated_by` (str) — updated_by of this Volume. ID of user that last updated volume
- `catalog_name` (str) — catalog_name of this Volume. name of catalog to which this volume belongs
- `schema_name` (str) — schema_name of this Volume. name of schema to which this volume belongs
- `full_name` (str) — full_name of this Volume. fully qualified name of this volume
- `volume_type` (str) — volume_type of this Volume. type of volume
- `storage_location` (str) — storage_location of this Volume. storage location of external volume. Only applicable for external volumes
- `lifecycle_state` (str) — lifecycle_state of this Volume. lifecycle state of volume. volume is ready for use in ACTIVE state
- `lifecycle_state_details` (str) — lifecycle_state_details of this Volume. Additional details associated with lifecycle state
- `system_tags` (dict(str, dict(str, object))) — system_tags of this Volume. System tags for this resource. Each key is predefined and scoped to a namespace.


**Return:** [Back to Volume (VolumeClient)](#volume-volumeclient) • [Top](#top)

### `upload_file`
<a id="upload-file"></a>
Uploads a file to volume. If the file already exists, it is updated.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `volume_key` (str) — key of volume
- `upload_file_details` (stream) — Contents of file to upload
- `path` (str) — absolute path of file or folder


**Optional Parameters:**

- `is_overwrite` (bool) — A boolean which decides if overwrite is allowed
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `is_upload_file_base64_encoded` (bool) — A flag to identify if upload file is base64 encoded
- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Volume (VolumeClient)](#volume-volumeclient) • [Top](#top)

### `upload_file_with_par`
<a id="upload-file-with-par"></a>
Uploads a volume file by generating PAR. If file exists, then it will be updated.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `volume_key` (str) — key of volume
- `upload_file_with_par_details` (oci.aidataplatform_dp.models.UploadFileWithParDetails) — Contents of file to upload
- `path` (str) — absolute path of file or folder


**Optional Parameters:**

- `is_overwrite` (bool) — A boolean which decides if overwrite is allowed
- `should_generate_new_par` (bool) — Flag to toggle to generate short living par
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.UploadFileWithParResult]` — Response object of generate PAR with Upload API

**Response Fields:**

- `par_url` (str) — par_url of this UploadFileWithParResult. String representing PAR URL
- `e_tag` (str (required)) — e_tag of this UploadFileWithParResult. Etag after creating or closing a file
- `location_uri` (str (required)) — location_uri of this UploadFileWithParResult. object storage URI which has bucket and namespace information
- `size` (int) — size of this UploadFileWithParResult. File size in bytes
- `created_by` (str) — created_by of this UploadFileWithParResult. user who created file
- `updated_by` (str) — updated_by of this UploadFileWithParResult. user who last updated file
- `created_time` (str) — created_time of this UploadFileWithParResult. time at which file was created
- `updated_time` (str) — updated_time of this UploadFileWithParResult. last modified time of file
- `description` (str) — description of this UploadFileWithParResult. file description
- `system_tags` (dict(str, dict(str, object))) — system_tags of this UploadFileWithParResult. System tags for this resource. Each key is predefined and scoped to a namespace.


**Return:** [Back to Volume (VolumeClient)](#volume-volumeclient) • [Top](#top)

## Workflow (WorkflowClient)
**Operations:**
- [cancel_job_run](#cancel-job-run)
- [cancel_job_runs](#cancel-job-runs)
- [create_job](#create-job)
- [create_job_run](#create-job-run)
- [delete_job](#delete-job)
- [delete_job_run](#delete-job-run)
- [export_task_run_output](#export-task-run-output)
- [fetch_output](#fetch-output)
- [get_job](#get-job)
- [get_job_run](#get-job-run)
- [get_task_run](#get-task-run)
- [list_job_permissions](#list-job-permissions)
- [list_job_runs](#list-job-runs)
- [list_jobs](#list-jobs)
- [list_recent_job_runs](#list-recent-job-runs)
- [list_task_runs](#list-task-runs)
- [manage_job_permission](#manage-job-permission)
- [repair_job_run](#repair-job-run)
- [update_job](#update-job)
### `cancel_job_run`
<a id="cancel-job-run"></a>
Cancels a job run.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `job_run_key` (str) — Job run key


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.JobRun]` — Description of a job run

**Response Fields:**

- `key` (str (required)) — key of this JobRun. OCID of job
- `name` (str (required)) — name of this JobRun. A user-friendly name. Does not have to be unique, and is changeable
- `job_key` (str (required)) — job_key of this JobRun. OCID of job
- `job_name` (str) — job_name of this JobRun. A user-friendly name. Does not have to be unique, and is changeable
- `parent_job_run_key` (str) — parent_job_run_key of this JobRun. OCID of job
- `root_job_run_key` (str) — root_job_run_key of this JobRun. OCID of job
- `parent_task_run_key` (str) — parent_task_run_key of this JobRun. OCID of task run
- `tasks` (list[Task]) — tasks of this JobRun. List of tasks in a job
- `created_by` (str) — created_by of this JobRun. OCID of IAM user
- `created_by_name` (str) — created_by_name of this JobRun. Name of user who created this record
- `max_concurrent_runs` (int) — max_concurrent_runs of this JobRun. Indicates number of executions for same job that can be run concurrently. maximum value cannot exceed 1000
- `git_config` (GitConfig) — git_config of this JobRun
- `queue` (Queue) — queue of this JobRun
- `original_attempt_run_id` (str) — original_attempt_run_id of this JobRun. OCID of job
- `state` (State) — state of this JobRun
- `schedule` (Schedule) — schedule of this JobRun
- `cluster_spec` (ClusterSpec) — cluster_spec of this JobRun
- `cluster_instance` (ClusterInstance) — cluster_instance of this JobRun
- `parameters` (list[Parameter]) — parameters of this JobRun. An optional list of parameters
- `unified_job_and_job_run_parameters` (list[Parameter]) — unified_job_and_job_run_parameters of this JobRun. Unified List of job and job run parameters after resolving dynamic value references and parameter resolution as per precedence
- `repair_history` (list[RepairHistory]) — repair_history of this JobRun. Array of repaired runs
- `system_parameters` (dict(str, str)) — system_parameters of this JobRun. Map of system parameters with their values for this job run
- `start_time` (int) — start_time of this JobRun. time at which job execution started in epoch milliseconds
- `end_time` (int) — end_time of this JobRun. time at which job execution started in epoch milliseconds
- `setup_duration` (int) — setup_duration of this JobRun. time (in milliseconds) taken to setup cluster
- `execution_duration` (int) — execution_duration of this JobRun. time (in milliseconds) taken to complete job execution
- `cleanup_duration` (int) — cleanup_duration of this JobRun. time (in milliseconds) taken to terminate cluster and to clean up any associated artifacts
- `run_duration` (int) — run_duration of this JobRun. time (in milliseconds) taken to complete job execution and all its repairs to finish
- `time_created` (datetime) — time_created of this JobRun. time at which job execution started
- `time_updated` (datetime) — time_updated of this JobRun. time at which job execution was updated
- `launched` (str) — launched of this JobRun. Identify job run launched by schedule or manually
- `version` (int) — version of this JobRun. Current version of job run object in repository
- `task_to_task_run_map` (dict(str, str)) — task_to_task_run_map of this JobRun. Task to TaskRun map for given job run
- `task_run_summary_map` (dict(str, object)) — task_run_summary_map of this JobRun. TaskRun to TaskRunSummary map for given job run
- `timeout_seconds` (int) — timeout_seconds of this JobRun. An optional value to indicate max run duration of a job after which job will be timed out. default is Zero indicating no timeout value
- `repaired_tasks` (list[str]) — repaired_tasks of this JobRun. A list of repaired tasks
- `lifecycle_states` (list[LifecycleState]) — lifecycle_states of this JobRun. collection of lifecycle states


**Return:** [Back to Workflow (WorkflowClient)](#workflow-workflowclient) • [Top](#top)

### `cancel_job_runs`
<a id="cancel-job-runs"></a>
Cancels all job runs for a given job.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `job_key` (str) — Job key


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Workflow (WorkflowClient)](#workflow-workflowclient) • [Top](#top)

### `create_job`
<a id="create-job"></a>
Creates a job in an AI Data Platform Workbench.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `create_job_details` (oci.aidataplatform_dp.models.CreateJobDetails) — Details for new job


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.Job]` — A description of a Job

**Response Fields:**

- `key` (str (required)) — key of this Job. OCID of job
- `created_by` (str (required)) — created_by of this Job. OCID of IAM user
- `created_by_name` (str) — created_by_name of this Job. Name of user who created this record
- `updated_by` (str) — updated_by of this Job. username of latest updater. OCID of IAM user
- `updated_by_name` (str) — updated_by_name of this Job. Name of user who updated this record
- `run_as` (str) — run_as of this Job. id with which job run as
- `name` (str (required)) — name of this Job. A user-friendly name. Does not have to be unique, and is changeable
- `description` (str) — description of this Job. A description for job
- `schedule` (Schedule) — schedule of this Job
- `continuous` (Continuous) — continuous of this Job
- `max_concurrent_runs` (int) — max_concurrent_runs of this Job. Indicates number of executions for same job that can be run concurrently. maximum value cannot exceed 1000
- `git_config` (GitConfig) — git_config of this Job
- `queue` (Queue) — queue of this Job
- `path` (str) — path of this Job. path to store job definition in
- `job_clusters` (list[JobCluster]) — job_clusters of this Job. List of job cluster configurations
- `tasks` (list[Task]) — tasks of this Job. List of tasks in a job
- `time_created` (datetime) — time_created of this Job. date and time DataLake was created, in format defined by <a href=" target="_blank" rel="noopener noreferrer">RFC 3339</a>
- `time_updated` (datetime) — time_updated of this Job. date and time DataLake was updated, in format defined by <a href=" target="_blank" rel="noopener noreferrer">RFC 3339</a>
- `parameters` (list[Parameter]) — parameters of this Job. An optional list of parameters
- `timeout_seconds` (int) — timeout_seconds of this Job. An optional value to indicate max run duration of a job after which job will be timed out. default is Zero indicating no timeout value


**Return:** [Back to Workflow (WorkflowClient)](#workflow-workflowclient) • [Top](#top)

### `create_job_run`
<a id="create-job-run"></a>
Creates a job run for an AI Data Platform Workbench.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `create_job_run_details` (oci.aidataplatform_dp.models.CreateJobRunDetails) — Details for new job run


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.JobRun]` — Description of a job run

**Response Fields:**

- `key` (str (required)) — key of this JobRun. OCID of job
- `name` (str (required)) — name of this JobRun. A user-friendly name. Does not have to be unique, and is changeable
- `job_key` (str (required)) — job_key of this JobRun. OCID of job
- `job_name` (str) — job_name of this JobRun. A user-friendly name. Does not have to be unique, and is changeable
- `parent_job_run_key` (str) — parent_job_run_key of this JobRun. OCID of job
- `root_job_run_key` (str) — root_job_run_key of this JobRun. OCID of job
- `parent_task_run_key` (str) — parent_task_run_key of this JobRun. OCID of task run
- `tasks` (list[Task]) — tasks of this JobRun. List of tasks in a job
- `created_by` (str) — created_by of this JobRun. OCID of IAM user
- `created_by_name` (str) — created_by_name of this JobRun. Name of user who created this record
- `max_concurrent_runs` (int) — max_concurrent_runs of this JobRun. Indicates number of executions for same job that can be run concurrently. maximum value cannot exceed 1000
- `git_config` (GitConfig) — git_config of this JobRun
- `queue` (Queue) — queue of this JobRun
- `original_attempt_run_id` (str) — original_attempt_run_id of this JobRun. OCID of job
- `state` (State) — state of this JobRun
- `schedule` (Schedule) — schedule of this JobRun
- `cluster_spec` (ClusterSpec) — cluster_spec of this JobRun
- `cluster_instance` (ClusterInstance) — cluster_instance of this JobRun
- `parameters` (list[Parameter]) — parameters of this JobRun. An optional list of parameters
- `unified_job_and_job_run_parameters` (list[Parameter]) — unified_job_and_job_run_parameters of this JobRun. Unified List of job and job run parameters after resolving dynamic value references and parameter resolution as per precedence
- `repair_history` (list[RepairHistory]) — repair_history of this JobRun. Array of repaired runs
- `system_parameters` (dict(str, str)) — system_parameters of this JobRun. Map of system parameters with their values for this job run
- `start_time` (int) — start_time of this JobRun. time at which job execution started in epoch milliseconds
- `end_time` (int) — end_time of this JobRun. time at which job execution started in epoch milliseconds
- `setup_duration` (int) — setup_duration of this JobRun. time (in milliseconds) taken to setup cluster
- `execution_duration` (int) — execution_duration of this JobRun. time (in milliseconds) taken to complete job execution
- `cleanup_duration` (int) — cleanup_duration of this JobRun. time (in milliseconds) taken to terminate cluster and to clean up any associated artifacts
- `run_duration` (int) — run_duration of this JobRun. time (in milliseconds) taken to complete job execution and all its repairs to finish
- `time_created` (datetime) — time_created of this JobRun. time at which job execution started
- `time_updated` (datetime) — time_updated of this JobRun. time at which job execution was updated
- `launched` (str) — launched of this JobRun. Identify job run launched by schedule or manually
- `version` (int) — version of this JobRun. Current version of job run object in repository
- `task_to_task_run_map` (dict(str, str)) — task_to_task_run_map of this JobRun. Task to TaskRun map for given job run
- `task_run_summary_map` (dict(str, object)) — task_run_summary_map of this JobRun. TaskRun to TaskRunSummary map for given job run
- `timeout_seconds` (int) — timeout_seconds of this JobRun. An optional value to indicate max run duration of a job after which job will be timed out. default is Zero indicating no timeout value
- `repaired_tasks` (list[str]) — repaired_tasks of this JobRun. A list of repaired tasks
- `lifecycle_states` (list[LifecycleState]) — lifecycle_states of this JobRun. collection of lifecycle states


**Return:** [Back to Workflow (WorkflowClient)](#workflow-workflowclient) • [Top](#top)

### `delete_job`
<a id="delete-job"></a>
Deletes a job from an AI Data Platform Workbench.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `job_key` (str) — Job key


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Workflow (WorkflowClient)](#workflow-workflowclient) • [Top](#top)

### `delete_job_run`
<a id="delete-job-run"></a>
Deletes a job run from an AI Data Platform Workbench.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `job_run_key` (str) — Job run key


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Workflow (WorkflowClient)](#workflow-workflowclient) • [Top](#top)

### `export_task_run_output`
<a id="export-task-run-output"></a>
Exports task run output in HTML or ipynb format.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `task_run_key` (str) — Task run key
- `task_run_output_key` (str) — Task run output key
- `export_task_run_output_details` (oci.aidataplatform_dp.models.ExportTaskRunOutputDetails) — Payload to export task run output to a file


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.ExportedTaskRunOutputContents]` — This model represents a file with contents, format, and other details

**Response Fields:**

- `name` (str (required)) — name of this ExportedTaskRunOutputContents. Name of file, equivalent to last part of path
- `path` (str (required)) — path of this ExportedTaskRunOutputContents. Full path of file
- `content` (object (required)) — content of this ExportedTaskRunOutputContents. For ipynb format, this contains a string representing .ipynb file. For HTML format, this contains a string representing HTML page. It has base64-encoded data for images
- `format` (str (required)) — format of this ExportedTaskRunOutputContents. Format of content as requested by client. HTML format by default. .


**Return:** [Back to Workflow (WorkflowClient)](#workflow-workflowclient) • [Top](#top)

### `fetch_output`
<a id="fetch-output"></a>
Fetches the task run output from the runtime engine.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `task_run_key` (str) — Task run key
- `fetch_output_details` (oci.aidataplatform_dp.models.FetchOutputDetails) — Details for task run output retrieval


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.TaskRunOutput]` — Output of a task run

**Response Fields:**

- `key` (str) — key of this TaskRunOutput. A unique identifier for output
- `task_type` (str) — task_type of this TaskRunOutput. type of task
- `is_truncated` (bool) — is_truncated of this TaskRunOutput. True if logs are truncated
- `error_trace` (str) — error_trace of this TaskRunOutput. If there was an error executing run, this field contains any available stack traces
- `data` (list[RunOutputData] (required)) — data of this TaskRunOutput. Array of output objects
- `output_parameters` (list[OutputParameter]) — output_parameters of this TaskRunOutput. List of output parameters with name and values
- `version` (int) — version of this TaskRunOutput. Current version of job run object in repository


**Return:** [Back to Workflow (WorkflowClient)](#workflow-workflowclient) • [Top](#top)

### `get_job`
<a id="get-job"></a>
Returns detailed information about a given job in AI Data Platform Workbench.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `job_key` (str) — Job key


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.Job]` — A description of a Job

**Response Fields:**

- `key` (str (required)) — key of this Job. OCID of job
- `created_by` (str (required)) — created_by of this Job. OCID of IAM user
- `created_by_name` (str) — created_by_name of this Job. Name of user who created this record
- `updated_by` (str) — updated_by of this Job. username of latest updater. OCID of IAM user
- `updated_by_name` (str) — updated_by_name of this Job. Name of user who updated this record
- `run_as` (str) — run_as of this Job. id with which job run as
- `name` (str (required)) — name of this Job. A user-friendly name. Does not have to be unique, and is changeable
- `description` (str) — description of this Job. A description for job
- `schedule` (Schedule) — schedule of this Job
- `continuous` (Continuous) — continuous of this Job
- `max_concurrent_runs` (int) — max_concurrent_runs of this Job. Indicates number of executions for same job that can be run concurrently. maximum value cannot exceed 1000
- `git_config` (GitConfig) — git_config of this Job
- `queue` (Queue) — queue of this Job
- `path` (str) — path of this Job. path to store job definition in
- `job_clusters` (list[JobCluster]) — job_clusters of this Job. List of job cluster configurations
- `tasks` (list[Task]) — tasks of this Job. List of tasks in a job
- `time_created` (datetime) — time_created of this Job. date and time DataLake was created, in format defined by <a href=" target="_blank" rel="noopener noreferrer">RFC 3339</a>
- `time_updated` (datetime) — time_updated of this Job. date and time DataLake was updated, in format defined by <a href=" target="_blank" rel="noopener noreferrer">RFC 3339</a>
- `parameters` (list[Parameter]) — parameters of this Job. An optional list of parameters
- `timeout_seconds` (int) — timeout_seconds of this Job. An optional value to indicate max run duration of a job after which job will be timed out. default is Zero indicating no timeout value


**Return:** [Back to Workflow (WorkflowClient)](#workflow-workflowclient) • [Top](#top)

### `get_job_run`
<a id="get-job-run"></a>
Returns detailed information about a given job run.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `job_run_key` (str) — Job run key


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.JobRun]` — Description of a job run

**Response Fields:**

- `key` (str (required)) — key of this JobRun. OCID of job
- `name` (str (required)) — name of this JobRun. A user-friendly name. Does not have to be unique, and is changeable
- `job_key` (str (required)) — job_key of this JobRun. OCID of job
- `job_name` (str) — job_name of this JobRun. A user-friendly name. Does not have to be unique, and is changeable
- `parent_job_run_key` (str) — parent_job_run_key of this JobRun. OCID of job
- `root_job_run_key` (str) — root_job_run_key of this JobRun. OCID of job
- `parent_task_run_key` (str) — parent_task_run_key of this JobRun. OCID of task run
- `tasks` (list[Task]) — tasks of this JobRun. List of tasks in a job
- `created_by` (str) — created_by of this JobRun. OCID of IAM user
- `created_by_name` (str) — created_by_name of this JobRun. Name of user who created this record
- `max_concurrent_runs` (int) — max_concurrent_runs of this JobRun. Indicates number of executions for same job that can be run concurrently. maximum value cannot exceed 1000
- `git_config` (GitConfig) — git_config of this JobRun
- `queue` (Queue) — queue of this JobRun
- `original_attempt_run_id` (str) — original_attempt_run_id of this JobRun. OCID of job
- `state` (State) — state of this JobRun
- `schedule` (Schedule) — schedule of this JobRun
- `cluster_spec` (ClusterSpec) — cluster_spec of this JobRun
- `cluster_instance` (ClusterInstance) — cluster_instance of this JobRun
- `parameters` (list[Parameter]) — parameters of this JobRun. An optional list of parameters
- `unified_job_and_job_run_parameters` (list[Parameter]) — unified_job_and_job_run_parameters of this JobRun. Unified List of job and job run parameters after resolving dynamic value references and parameter resolution as per precedence
- `repair_history` (list[RepairHistory]) — repair_history of this JobRun. Array of repaired runs
- `system_parameters` (dict(str, str)) — system_parameters of this JobRun. Map of system parameters with their values for this job run
- `start_time` (int) — start_time of this JobRun. time at which job execution started in epoch milliseconds
- `end_time` (int) — end_time of this JobRun. time at which job execution started in epoch milliseconds
- `setup_duration` (int) — setup_duration of this JobRun. time (in milliseconds) taken to setup cluster
- `execution_duration` (int) — execution_duration of this JobRun. time (in milliseconds) taken to complete job execution
- `cleanup_duration` (int) — cleanup_duration of this JobRun. time (in milliseconds) taken to terminate cluster and to clean up any associated artifacts
- `run_duration` (int) — run_duration of this JobRun. time (in milliseconds) taken to complete job execution and all its repairs to finish
- `time_created` (datetime) — time_created of this JobRun. time at which job execution started
- `time_updated` (datetime) — time_updated of this JobRun. time at which job execution was updated
- `launched` (str) — launched of this JobRun. Identify job run launched by schedule or manually
- `version` (int) — version of this JobRun. Current version of job run object in repository
- `task_to_task_run_map` (dict(str, str)) — task_to_task_run_map of this JobRun. Task to TaskRun map for given job run
- `task_run_summary_map` (dict(str, object)) — task_run_summary_map of this JobRun. TaskRun to TaskRunSummary map for given job run
- `timeout_seconds` (int) — timeout_seconds of this JobRun. An optional value to indicate max run duration of a job after which job will be timed out. default is Zero indicating no timeout value
- `repaired_tasks` (list[str]) — repaired_tasks of this JobRun. A list of repaired tasks
- `lifecycle_states` (list[LifecycleState]) — lifecycle_states of this JobRun. collection of lifecycle states


**Return:** [Back to Workflow (WorkflowClient)](#workflow-workflowclient) • [Top](#top)

### `get_task_run`
<a id="get-task-run"></a>
Returns detailed information about a task run with a given task run key.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `task_run_key` (str) — Task run key


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.TaskRun]` — A description of a task run

**Response Fields:**

- `key` (str (required)) — key of this TaskRun. OCID of task run
- `name` (str (required)) — name of this TaskRun. A user-friendly name. Does not have to be unique, and is changeable
- `task_key` (str) — task_key of this TaskRun. display name of task. User can specify a value for this
- `job_key` (str) — job_key of this TaskRun. OCID of job
- `job_run_key` (str) — job_run_key of this TaskRun. OCID of job
- `parent_job_run_key` (str) — parent_job_run_key of this TaskRun. OCID of job
- `root_job_run_key` (str) — root_job_run_key of this TaskRun. OCID of job
- `cluster_validation_start_time` (int) — cluster_validation_start_time of this TaskRun. time at which cluster validation started in epoch milliseconds
- `start_time` (int) — start_time of this TaskRun. time at which job execution started in epoch milliseconds
- `end_time` (int) — end_time of this TaskRun. time at which job execution started in epoch milliseconds
- `state` (State) — state of this TaskRun
- `setup_duration` (int) — setup_duration of this TaskRun. time (in milliseconds) taken to setup cluster
- `execution_duration` (int) — execution_duration of this TaskRun. time (in milliseconds) taken to complete job execution
- `cleanup_duration` (int) — cleanup_duration of this TaskRun. time (in milliseconds) taken to terminate cluster and to clean up any associated artifacts
- `cluster_spec` (ClusterSpec) — cluster_spec of this TaskRun
- `task` (Task) — task of this TaskRun
- `version` (int) — version of this TaskRun. Current version of job run object in repository
- `retry_attempt` (int) — retry_attempt of this TaskRun. Sequence number of current retry attempt. 0 for original. 1, 2, 3, ... for subsequent retry attempts
- `retries` (list[TaskRunRetry]) — retries of this TaskRun. List of task retries
- `output_key` (str) — output_key of this TaskRun. A unique identifier for output
- `external_id` (str) — external_id of this TaskRun. external ID of task execution
- `system_parameters` (dict(str, str)) — system_parameters of this TaskRun. Map of system parameters with their values for this job run
- `parameters` (list[Parameter]) — parameters of this TaskRun. An optional list of parameters
- `lifecycle_states` (list[LifecycleState]) — lifecycle_states of this TaskRun. collection of lifecycle states


**Return:** [Back to Workflow (WorkflowClient)](#workflow-workflowclient) • [Top](#top)

### `list_job_permissions`
<a id="list-job-permissions"></a>
Returns a list of job permissions.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `job_key` (str) — Job key


**Optional Parameters:**

- `limit` (int) — For list pagination. maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination
- `page` (str) — For list pagination. value of opc-next-page response header from previous "List" call. For important details about how pagination works, see List Pagination
- `sort_order` (str) — sort order to use, either ascending (ASC) or descending (DESC).
- `sort_by` (str) — field to sort by. You can provide only one sort order.
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.JobPermissionCollection]` — List of job permissions

**Response Fields:**

- `items` (list[JobPermissionSummary] (required)) — items of this JobPermissionCollection. List of job permissions


**Return:** [Back to Workflow (WorkflowClient)](#workflow-workflowclient) • [Top](#top)

### `list_job_runs`
<a id="list-job-runs"></a>
Returns a detailed list of job runs in an AI Data Platform Workbench.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace


**Optional Parameters:**

- `display_name` (str) — A filter to return only resources that match given display name exactly
- `job_key` (list[str]) — field to filter based on job key
- `status` (list[str]) — field to filter based on state.
- `time_created_greater_than_or_equal_to` (datetime) — Fetch objects from repository that were created after or at exact timestamp provided in parameter
- `time_created_less_than_or_equal_to` (datetime) — Fetch objects from repository that were created before or at exact timestamp provided in parameter
- `limit` (int) — For list pagination. maximum number of results per page, or items to return in a paginated List call
- `page` (str) — For list pagination. value of opc-next-page response header from previous "List" call. For important details about how pagination works, see List Pagination
- `sort_order` (str) — sort order to use, either ascending (ASC) or descending (DESC).
- `sort_by` (str) — field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending.
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.JobRunCollection]` — List of job runs

**Response Fields:**

- `items` (list[JobRunSummary] (required)) — items of this JobRunCollection. List of job runs


**Return:** [Back to Workflow (WorkflowClient)](#workflow-workflowclient) • [Top](#top)

### `list_jobs`
<a id="list-jobs"></a>
Returns a list of jobs for a given AI Data Platform Workbench.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace


**Optional Parameters:**

- `display_name` (str) — A filter to return only resources that match given display name exactly
- `display_name_contains` (str) — A filter to return only resources that have a display name containing text provided
- `path` (str) — fully qualified path w job is stored
- `created_by` (str) — A filter to return only resources that are created by given user with username that matches exactly
- `updated_by` (str) — A filter to return only resources that was last updated by given user with username that matches exactly
- `limit` (int) — For list pagination. maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination
- `page` (str) — For list pagination. value of opc-next-page response header from previous "List" call. For important details about how pagination works, see List Pagination
- `sort_order` (str) — sort order to use, either ascending (ASC) or descending (DESC).
- `sort_by` (str) — field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending.
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.JobCollection]` — List of jobs

**Response Fields:**

- `items` (list[JobSummary] (required)) — items of this JobCollection. List of jobs


**Return:** [Back to Workflow (WorkflowClient)](#workflow-workflowclient) • [Top](#top)

### `list_recent_job_runs`
<a id="list-recent-job-runs"></a>
Returns a list of the latest job runs for a given job key.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `job_key` (oci.aidataplatform_dp.models.list[str]) — field to filter based on job key


**Optional Parameters:**

- `record_count` (int) — number of records to fetch
- `limit` (int) — For list pagination. maximum number of results per page, or items to return in a paginated List call
- `page` (str) — For list pagination. value of opc-next-page response header from previous "List" call. For important details about how pagination works, see List Pagination
- `sort_order` (str) — sort order to use, either ascending (ASC) or descending (DESC).
- `sort_by` (str) — field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending.
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.JobRunCollection]` — List of job runs

**Response Fields:**

- `items` (list[JobRunSummary] (required)) — items of this JobRunCollection. List of job runs


**Return:** [Back to Workflow (WorkflowClient)](#workflow-workflowclient) • [Top](#top)

### `list_task_runs`
<a id="list-task-runs"></a>
Returns a list of tasks run in an AI Data Platform Workbench.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `job_run_key` (str) — field to filter based on job run key


**Optional Parameters:**

- `display_name` (str) — A filter to return only resources that match given display name exactly
- `status` (list[str]) — field to filter based on state.
- `parent_job_run_key` (str) — field to filter based on parent job run key
- `root_job_run_key` (str) — field to filter based on root job run key
- `limit` (int) — For list pagination. maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination
- `page` (str) — For list pagination. value of opc-next-page response header from previous "List" call. For important details about how pagination works, see List Pagination
- `sort_order` (str) — sort order to use, either ascending (ASC) or descending (DESC).
- `sort_by` (str) — field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending.
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.TaskRunCollection]` — List of TaskRuns

**Response Fields:**

- `items` (list[TaskRunSummary] (required)) — items of this TaskRunCollection. List of TaskRuns


**Return:** [Back to Workflow (WorkflowClient)](#workflow-workflowclient) • [Top](#top)

### `manage_job_permission`
<a id="manage-job-permission"></a>
Update job permissions with the provided details.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `job_key` (str) — Job key
- `manage_job_permission_details` (oci.aidataplatform_dp.models.ManageJobPermissionDetails) — information to be updated


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Workflow (WorkflowClient)](#workflow-workflowclient) • [Top](#top)

### `repair_job_run`
<a id="repair-job-run"></a>
Repairs and reruns a job run.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `job_run_key` (str) — Job run key
- `repair_job_run_details` (oci.aidataplatform_dp.models.RepairJobRunDetails) — Details of job run to be repaired


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.JobRun]` — Description of a job run

**Response Fields:**

- `key` (str (required)) — key of this JobRun. OCID of job
- `name` (str (required)) — name of this JobRun. A user-friendly name. Does not have to be unique, and is changeable
- `job_key` (str (required)) — job_key of this JobRun. OCID of job
- `job_name` (str) — job_name of this JobRun. A user-friendly name. Does not have to be unique, and is changeable
- `parent_job_run_key` (str) — parent_job_run_key of this JobRun. OCID of job
- `root_job_run_key` (str) — root_job_run_key of this JobRun. OCID of job
- `parent_task_run_key` (str) — parent_task_run_key of this JobRun. OCID of task run
- `tasks` (list[Task]) — tasks of this JobRun. List of tasks in a job
- `created_by` (str) — created_by of this JobRun. OCID of IAM user
- `created_by_name` (str) — created_by_name of this JobRun. Name of user who created this record
- `max_concurrent_runs` (int) — max_concurrent_runs of this JobRun. Indicates number of executions for same job that can be run concurrently. maximum value cannot exceed 1000
- `git_config` (GitConfig) — git_config of this JobRun
- `queue` (Queue) — queue of this JobRun
- `original_attempt_run_id` (str) — original_attempt_run_id of this JobRun. OCID of job
- `state` (State) — state of this JobRun
- `schedule` (Schedule) — schedule of this JobRun
- `cluster_spec` (ClusterSpec) — cluster_spec of this JobRun
- `cluster_instance` (ClusterInstance) — cluster_instance of this JobRun
- `parameters` (list[Parameter]) — parameters of this JobRun. An optional list of parameters
- `unified_job_and_job_run_parameters` (list[Parameter]) — unified_job_and_job_run_parameters of this JobRun. Unified List of job and job run parameters after resolving dynamic value references and parameter resolution as per precedence
- `repair_history` (list[RepairHistory]) — repair_history of this JobRun. Array of repaired runs
- `system_parameters` (dict(str, str)) — system_parameters of this JobRun. Map of system parameters with their values for this job run
- `start_time` (int) — start_time of this JobRun. time at which job execution started in epoch milliseconds
- `end_time` (int) — end_time of this JobRun. time at which job execution started in epoch milliseconds
- `setup_duration` (int) — setup_duration of this JobRun. time (in milliseconds) taken to setup cluster
- `execution_duration` (int) — execution_duration of this JobRun. time (in milliseconds) taken to complete job execution
- `cleanup_duration` (int) — cleanup_duration of this JobRun. time (in milliseconds) taken to terminate cluster and to clean up any associated artifacts
- `run_duration` (int) — run_duration of this JobRun. time (in milliseconds) taken to complete job execution and all its repairs to finish
- `time_created` (datetime) — time_created of this JobRun. time at which job execution started
- `time_updated` (datetime) — time_updated of this JobRun. time at which job execution was updated
- `launched` (str) — launched of this JobRun. Identify job run launched by schedule or manually
- `version` (int) — version of this JobRun. Current version of job run object in repository
- `task_to_task_run_map` (dict(str, str)) — task_to_task_run_map of this JobRun. Task to TaskRun map for given job run
- `task_run_summary_map` (dict(str, object)) — task_run_summary_map of this JobRun. TaskRun to TaskRunSummary map for given job run
- `timeout_seconds` (int) — timeout_seconds of this JobRun. An optional value to indicate max run duration of a job after which job will be timed out. default is Zero indicating no timeout value
- `repaired_tasks` (list[str]) — repaired_tasks of this JobRun. A list of repaired tasks
- `lifecycle_states` (list[LifecycleState]) — lifecycle_states of this JobRun. collection of lifecycle states


**Return:** [Back to Workflow (WorkflowClient)](#workflow-workflowclient) • [Top](#top)

### `update_job`
<a id="update-job"></a>
Update details for a job in AI Data Platform Workbench.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `job_key` (str) — Job key
- `update_job_details` (oci.aidataplatform_dp.models.UpdateJobDetails) — information to be updated


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.Job]` — A description of a Job

**Response Fields:**

- `key` (str (required)) — key of this Job. OCID of job
- `created_by` (str (required)) — created_by of this Job. OCID of IAM user
- `created_by_name` (str) — created_by_name of this Job. Name of user who created this record
- `updated_by` (str) — updated_by of this Job. username of latest updater. OCID of IAM user
- `updated_by_name` (str) — updated_by_name of this Job. Name of user who updated this record
- `run_as` (str) — run_as of this Job. id with which job run as
- `name` (str (required)) — name of this Job. A user-friendly name. Does not have to be unique, and is changeable
- `description` (str) — description of this Job. A description for job
- `schedule` (Schedule) — schedule of this Job
- `continuous` (Continuous) — continuous of this Job
- `max_concurrent_runs` (int) — max_concurrent_runs of this Job. Indicates number of executions for same job that can be run concurrently. maximum value cannot exceed 1000
- `git_config` (GitConfig) — git_config of this Job
- `queue` (Queue) — queue of this Job
- `path` (str) — path of this Job. path to store job definition in
- `job_clusters` (list[JobCluster]) — job_clusters of this Job. List of job cluster configurations
- `tasks` (list[Task]) — tasks of this Job. List of tasks in a job
- `time_created` (datetime) — time_created of this Job. date and time DataLake was created, in format defined by <a href=" target="_blank" rel="noopener noreferrer">RFC 3339</a>
- `time_updated` (datetime) — time_updated of this Job. date and time DataLake was updated, in format defined by <a href=" target="_blank" rel="noopener noreferrer">RFC 3339</a>
- `parameters` (list[Parameter]) — parameters of this Job. An optional list of parameters
- `timeout_seconds` (int) — timeout_seconds of this Job. An optional value to indicate max run duration of a job after which job will be timed out. default is Zero indicating no timeout value


**Return:** [Back to Workflow (WorkflowClient)](#workflow-workflowclient) • [Top](#top)

## Workspace (WorkspaceClient)
**Operations:**
- [create_git_folder](#create-git-folder)
- [create_workspace](#create-workspace)
- [delete_workspace](#delete-workspace)
- [get_workspace](#get-workspace)
- [list_create_workspace_permissions](#list-create-workspace-permissions)
- [list_workspace_permissions](#list-workspace-permissions)
- [list_workspaces](#list-workspaces)
- [manage_create_workspace_permission](#manage-create-workspace-permission)
- [manage_workspace_permission](#manage-workspace-permission)
- [update_workspace](#update-workspace)
- [update_workspace_async_operation_status](#update-workspace-async-operation-status)
### `create_git_folder`
<a id="create-git-folder"></a>
Creates a git folder in the workspace

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `create_git_folder_details` (oci.aidataplatform_dp.models.CreateGitFolderDetails) — information to be updated


**Optional Parameters:**

- `dh_user_principal` (str) — DH User Principal Header
- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.GitFolder]` — a Git folder object

**Response Fields:**

- `folder_path` (str (required)) — folder_path of this GitFolder. absolute path of Git folder user wants to create
- `git_provider_key` (str) — git_provider_key of this GitFolder. key corresponding to Git service provider in git provider table
- `git_repository_url` (str) — git_repository_url of this GitFolder. Git repository url used to clone
- `description` (str) — description of this GitFolder. Short description about git repository
- `branch_name` (str) — branch_name of this GitFolder. Git branch name that is cloned
- `folder_metadata` (dict(str, object)) — folder_metadata of this GitFolder. metadata about folder, like branchName


**Return:** [Back to Workspace (WorkspaceClient)](#workspace-workspaceclient) • [Top](#top)

### `create_workspace`
<a id="create-workspace"></a>
Creates a workspace.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `create_workspace_details` (oci.aidataplatform_dp.models.CreateWorkspaceDetails) — Details for new workspace


**Optional Parameters:**

- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.Workspace]` — A AI Data Platform Workbench Workspace is a logical container that provides users with a collaborative development and runtime environment

**Response Fields:**

- `key` (str (required)) — key of this Workspace. key of AI Data Platform Workbench workspace
- `display_name` (str (required)) — display_name of this Workspace. A user-friendly name that has to be unique in a AI Data Platform Workbench instance
- `description` (str) — description of this Workspace. Description of workspace
- `type` (str) — type of this Workspace. Workspace type. Type is DEFAULT for workspace created at AI Data Platform Workbench creation, type is USER for workspace created by AI Data Platform Workbench user
- `time_created` (datetime (required)) — time_created of this Workspace. date and time AI Data Platform Workbench workspace was created, in format defined by <a href=" target="_blank" rel="noopener noreferrer">RFC 3339</a>. .600Z
- `time_updated` (datetime) — time_updated of this Workspace. date and time AI Data Platform Workbench workspace was updated, in format defined by <a href=" target="_blank" rel="noopener noreferrer">RFC 3339</a>
- `lifecycle_state` (str (required)) — lifecycle_state of this Workspace. current state of AI Data Platform Workbench workspace. .
- `lifecycle_details` (str) — lifecycle_details of this Workspace. A message that describes current state of workspace in more detail. For example, can be used to provide actionable information for a resource in Failed state
- `system_tags` (dict(str, dict(str, object))) — system_tags of this Workspace. System tags for this resource. Each key is predefined and scoped to a namespace.
- `created_by` (str) — created_by of this Workspace. OCID of user who created this record
- `created_by_name` (str) — created_by_name of this Workspace. Name of user who created this record
- `updated_by` (str) — updated_by of this Workspace. OCID of user who updated this record
- `updated_by_name` (str) — updated_by_name of this Workspace. Name of user who updated this record
- `default_catalog_key` (str) — default_catalog_key of this Workspace. key of catalog to be used as default catalog for this workspace. A default catalog in workspace will allow users to use that catalog without need to refer it in notebook. For example, if default catalog is iCat1, and it has schema1 and table1, you can refer to table in a notebook using: schema1.table1
- `is_private_network_enabled` (bool) — is_private_network_enabled of this Workspace. A flag to display whether workspace is private network enabled or not
- `network_configuration_details` (WorkspaceNetworkConfigurationDetails) — network_configuration_details of this Workspace
- `log_group_id` (str) — log_group_id of this Workspace. OCID of log group that contains logs. This uniquely identifies a collection of logs within OCI Logging Service
- `aic_user_schema_name` (str) — aic_user_schema_name of this Workspace. name of AIC user schema if created


**Return:** [Back to Workspace (WorkspaceClient)](#workspace-workspaceclient) • [Top](#top)

### `delete_workspace`
<a id="delete-workspace"></a>
Deletes a workspace.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `time_data_lake_deletion` (datetime) — Deletion time in case that a workspace is deleted during AI Data Platform Workbench deletion
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Workspace (WorkspaceClient)](#workspace-workspaceclient) • [Top](#top)

### `get_workspace`
<a id="get-workspace"></a>
Gets detailed information about a workspace.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace


**Optional Parameters:**

- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.Workspace]` — A AI Data Platform Workbench Workspace is a logical container that provides users with a collaborative development and runtime environment

**Response Fields:**

- `key` (str (required)) — key of this Workspace. key of AI Data Platform Workbench workspace
- `display_name` (str (required)) — display_name of this Workspace. A user-friendly name that has to be unique in a AI Data Platform Workbench instance
- `description` (str) — description of this Workspace. Description of workspace
- `type` (str) — type of this Workspace. Workspace type. Type is DEFAULT for workspace created at AI Data Platform Workbench creation, type is USER for workspace created by AI Data Platform Workbench user
- `time_created` (datetime (required)) — time_created of this Workspace. date and time AI Data Platform Workbench workspace was created, in format defined by <a href=" target="_blank" rel="noopener noreferrer">RFC 3339</a>. .600Z
- `time_updated` (datetime) — time_updated of this Workspace. date and time AI Data Platform Workbench workspace was updated, in format defined by <a href=" target="_blank" rel="noopener noreferrer">RFC 3339</a>
- `lifecycle_state` (str (required)) — lifecycle_state of this Workspace. current state of AI Data Platform Workbench workspace. .
- `lifecycle_details` (str) — lifecycle_details of this Workspace. A message that describes current state of workspace in more detail. For example, can be used to provide actionable information for a resource in Failed state
- `system_tags` (dict(str, dict(str, object))) — system_tags of this Workspace. System tags for this resource. Each key is predefined and scoped to a namespace.
- `created_by` (str) — created_by of this Workspace. OCID of user who created this record
- `created_by_name` (str) — created_by_name of this Workspace. Name of user who created this record
- `updated_by` (str) — updated_by of this Workspace. OCID of user who updated this record
- `updated_by_name` (str) — updated_by_name of this Workspace. Name of user who updated this record
- `default_catalog_key` (str) — default_catalog_key of this Workspace. key of catalog to be used as default catalog for this workspace. A default catalog in workspace will allow users to use that catalog without need to refer it in notebook. For example, if default catalog is iCat1, and it has schema1 and table1, you can refer to table in a notebook using: schema1.table1
- `is_private_network_enabled` (bool) — is_private_network_enabled of this Workspace. A flag to display whether workspace is private network enabled or not
- `network_configuration_details` (WorkspaceNetworkConfigurationDetails) — network_configuration_details of this Workspace
- `log_group_id` (str) — log_group_id of this Workspace. OCID of log group that contains logs. This uniquely identifies a collection of logs within OCI Logging Service
- `aic_user_schema_name` (str) — aic_user_schema_name of this Workspace. name of AIC user schema if created


**Return:** [Back to Workspace (WorkspaceClient)](#workspace-workspaceclient) • [Top](#top)

### `list_create_workspace_permissions`
<a id="list-create-workspace-permissions"></a>
Gets a list of create workspace permission summary objects.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance


**Optional Parameters:**

- `limit` (int) — For list pagination. maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination
- `page` (str) — For list pagination. value of opc-next-page response header from previous "List" call. For important details about how pagination works, see List Pagination
- `sort_order` (str) — sort order to use, either ascending (ASC) or descending (DESC).
- `sort_by` (str) — field to sort by. You can provide only one sort order. Default order for granteeName is ascending.
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.CreateWorkspacePermissionCollection]` — List of Create Workspace permissions

**Response Fields:**

- `items` (list[CreateWorkspacePermissionSummary] (required)) — items of this CreateWorkspacePermissionCollection. List of Create Workspace permissions


**Return:** [Back to Workspace (WorkspaceClient)](#workspace-workspaceclient) • [Top](#top)

### `list_workspace_permissions`
<a id="list-workspace-permissions"></a>
Gets a list of workspace permissions.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace


**Optional Parameters:**

- `limit` (int) — For list pagination. maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination
- `page` (str) — For list pagination. value of opc-next-page response header from previous "List" call. For important details about how pagination works, see List Pagination
- `sort_order` (str) — sort order to use, either ascending (ASC) or descending (DESC).
- `sort_by` (str) — field to sort by. You can provide only one sort order. Default order for granteeName is ascending.
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.WorkspacePermissionCollection]` — List of workspace permissions

**Response Fields:**

- `items` (list[WorkspacePermissionSummary] (required)) — items of this WorkspacePermissionCollection. List of workspace permissions


**Return:** [Back to Workspace (WorkspaceClient)](#workspace-workspaceclient) • [Top](#top)

### `list_workspaces`
<a id="list-workspaces"></a>
Gets a list of workspaces.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance


**Optional Parameters:**

- `lifecycle_state` (str) — A filter to return only resources that match given lifecycle state. state value is case-insensitive.
- `display_name` (str) — A filter to return only resources that match given display name exactly
- `display_name_contains` (str) — A filter to return only resources that have a display name containing text provided
- `type` (str) — When no value is provided, all workspaces are returned. Otherwise, workspace of selected value is returned.
- `limit` (int) — For list pagination. maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination
- `page` (str) — For list pagination. value of opc-next-page response header from previous "List" call. For important details about how pagination works, see List Pagination
- `sort_order` (str) — sort order to use, either ascending (ASC) or descending (DESC).
- `sort_by` (str) — field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending.
- `is_private_network_enabled` (bool) — A flag to filter workspaces which are private network enabled or disabled
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.WorkspaceCollection]` — Results of a workspace search. Contains summary information of workspaces

**Response Fields:**

- `items` (list[WorkspaceSummary] (required)) — items of this WorkspaceCollection. List of workspaces


**Return:** [Back to Workspace (WorkspaceClient)](#workspace-workspaceclient) • [Top](#top)

### `manage_create_workspace_permission`
<a id="manage-create-workspace-permission"></a>
Updates create workspace permissions on a workspace.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `manage_create_workspace_permission_details` (oci.aidataplatform_dp.models.ManageCreateWorkspacePermissionDetails) — information to be updated


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Workspace (WorkspaceClient)](#workspace-workspaceclient) • [Top](#top)

### `manage_workspace_permission`
<a id="manage-workspace-permission"></a>
Updates permissions on a workspace.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `manage_workspace_permission_details` (oci.aidataplatform_dp.models.ManageWorkspacePermissionDetails) — information to be updated


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Workspace (WorkspaceClient)](#workspace-workspaceclient) • [Top](#top)

### `update_workspace`
<a id="update-workspace"></a>
Updates the details of a workspace.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `update_workspace_details` (oci.aidataplatform_dp.models.UpdateWorkspaceDetails) — information to be updated


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.Workspace]` — A AI Data Platform Workbench Workspace is a logical container that provides users with a collaborative development and runtime environment

**Response Fields:**

- `key` (str (required)) — key of this Workspace. key of AI Data Platform Workbench workspace
- `display_name` (str (required)) — display_name of this Workspace. A user-friendly name that has to be unique in a AI Data Platform Workbench instance
- `description` (str) — description of this Workspace. Description of workspace
- `type` (str) — type of this Workspace. Workspace type. Type is DEFAULT for workspace created at AI Data Platform Workbench creation, type is USER for workspace created by AI Data Platform Workbench user
- `time_created` (datetime (required)) — time_created of this Workspace. date and time AI Data Platform Workbench workspace was created, in format defined by <a href=" target="_blank" rel="noopener noreferrer">RFC 3339</a>. .600Z
- `time_updated` (datetime) — time_updated of this Workspace. date and time AI Data Platform Workbench workspace was updated, in format defined by <a href=" target="_blank" rel="noopener noreferrer">RFC 3339</a>
- `lifecycle_state` (str (required)) — lifecycle_state of this Workspace. current state of AI Data Platform Workbench workspace. .
- `lifecycle_details` (str) — lifecycle_details of this Workspace. A message that describes current state of workspace in more detail. For example, can be used to provide actionable information for a resource in Failed state
- `system_tags` (dict(str, dict(str, object))) — system_tags of this Workspace. System tags for this resource. Each key is predefined and scoped to a namespace.
- `created_by` (str) — created_by of this Workspace. OCID of user who created this record
- `created_by_name` (str) — created_by_name of this Workspace. Name of user who created this record
- `updated_by` (str) — updated_by of this Workspace. OCID of user who updated this record
- `updated_by_name` (str) — updated_by_name of this Workspace. Name of user who updated this record
- `default_catalog_key` (str) — default_catalog_key of this Workspace. key of catalog to be used as default catalog for this workspace. A default catalog in workspace will allow users to use that catalog without need to refer it in notebook. For example, if default catalog is iCat1, and it has schema1 and table1, you can refer to table in a notebook using: schema1.table1
- `is_private_network_enabled` (bool) — is_private_network_enabled of this Workspace. A flag to display whether workspace is private network enabled or not
- `network_configuration_details` (WorkspaceNetworkConfigurationDetails) — network_configuration_details of this Workspace
- `log_group_id` (str) — log_group_id of this Workspace. OCID of log group that contains logs. This uniquely identifies a collection of logs within OCI Logging Service
- `aic_user_schema_name` (str) — aic_user_schema_name of this Workspace. name of AIC user schema if created


**Return:** [Back to Workspace (WorkspaceClient)](#workspace-workspaceclient) • [Top](#top)

### `update_workspace_async_operation_status`
<a id="update-workspace-async-operation-status"></a>
Updates the status of a workspace.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `async_operation_key` (str) — unique identifier of an async operation
- `update_workspace_async_operation_status_details` (oci.aidataplatform_dp.models.UpdateWorkspaceAsyncOperationStatusDetails) — information to be updated


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.Workspace]` — A AI Data Platform Workbench Workspace is a logical container that provides users with a collaborative development and runtime environment

**Response Fields:**

- `key` (str (required)) — key of this Workspace. key of AI Data Platform Workbench workspace
- `display_name` (str (required)) — display_name of this Workspace. A user-friendly name that has to be unique in a AI Data Platform Workbench instance
- `description` (str) — description of this Workspace. Description of workspace
- `type` (str) — type of this Workspace. Workspace type. Type is DEFAULT for workspace created at AI Data Platform Workbench creation, type is USER for workspace created by AI Data Platform Workbench user
- `time_created` (datetime (required)) — time_created of this Workspace. date and time AI Data Platform Workbench workspace was created, in format defined by <a href=" target="_blank" rel="noopener noreferrer">RFC 3339</a>. .600Z
- `time_updated` (datetime) — time_updated of this Workspace. date and time AI Data Platform Workbench workspace was updated, in format defined by <a href=" target="_blank" rel="noopener noreferrer">RFC 3339</a>
- `lifecycle_state` (str (required)) — lifecycle_state of this Workspace. current state of AI Data Platform Workbench workspace. .
- `lifecycle_details` (str) — lifecycle_details of this Workspace. A message that describes current state of workspace in more detail. For example, can be used to provide actionable information for a resource in Failed state
- `system_tags` (dict(str, dict(str, object))) — system_tags of this Workspace. System tags for this resource. Each key is predefined and scoped to a namespace.
- `created_by` (str) — created_by of this Workspace. OCID of user who created this record
- `created_by_name` (str) — created_by_name of this Workspace. Name of user who created this record
- `updated_by` (str) — updated_by of this Workspace. OCID of user who updated this record
- `updated_by_name` (str) — updated_by_name of this Workspace. Name of user who updated this record
- `default_catalog_key` (str) — default_catalog_key of this Workspace. key of catalog to be used as default catalog for this workspace. A default catalog in workspace will allow users to use that catalog without need to refer it in notebook. For example, if default catalog is iCat1, and it has schema1 and table1, you can refer to table in a notebook using: schema1.table1
- `is_private_network_enabled` (bool) — is_private_network_enabled of this Workspace. A flag to display whether workspace is private network enabled or not
- `network_configuration_details` (WorkspaceNetworkConfigurationDetails) — network_configuration_details of this Workspace
- `log_group_id` (str) — log_group_id of this Workspace. OCID of log group that contains logs. This uniquely identifies a collection of logs within OCI Logging Service
- `aic_user_schema_name` (str) — aic_user_schema_name of this Workspace. name of AIC user schema if created


**Return:** [Back to Workspace (WorkspaceClient)](#workspace-workspaceclient) • [Top](#top)

## Workspace Object (WorkspaceObjectClient)
**Operations:**
- [copy_workspace_object](#copy-workspace-object)
- [create_workspace_object](#create-workspace-object)
- [delete_workspace_object](#delete-workspace-object)
- [download_workspace_object_with_par](#download-workspace-object-with-par)
- [get_workspace_object](#get-workspace-object)
- [head_workspace_object](#head-workspace-object)
- [list_workspace_object_permissions](#list-workspace-object-permissions)
- [list_workspace_objects](#list-workspace-objects)
- [manage_workspace_object_permission](#manage-workspace-object-permission)
- [move_workspace_object](#move-workspace-object)
- [rename_workspace_object](#rename-workspace-object)
- [update_workspace_object](#update-workspace-object)
- [upload_workspace_object_with_par](#upload-workspace-object-with-par)
### `copy_workspace_object`
<a id="copy-workspace-object"></a>
Copy a workspace object to different location.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `copy_workspace_object_details` (oci.aidataplatform_dp.models.CopyWorkspaceObjectDetails) — Details for copying workspace object to a different path


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.WorkspaceObjectDetails]` — A WorkspaceObject is a file or folder belonging to an AI Data Platform Workbench workspace

**Response Fields:**

- `path` (str (required)) — path of this WorkspaceObjectDetails. fully qualified path of workspace object. .ipynb
- `key` (str) — key of this WorkspaceObjectDetails. key of Workspace Object
- `display_name` (str (required)) — display_name of this WorkspaceObjectDetails. name of Workspace Object. This will be name of file/folder in workspace. .ipynb, Folder1
- `time_created` (datetime (required)) — time_created of this WorkspaceObjectDetails. date and time workspace object was created, in format defined by <a href=" target="_blank" rel="noopener noreferrer">RFC 3339</a>. .600Z
- `time_updated` (datetime) — time_updated of this WorkspaceObjectDetails. date and time workspace object was created, in format defined by <a href=" target="_blank" rel="noopener noreferrer">RFC 3339</a>
- `type` (str (required)) — type of this WorkspaceObjectDetails. type of workspace object. .
- `description` (str) — description of this WorkspaceObjectDetails. description for file and folder
- `system_tags` (dict(str, dict(str, object))) — system_tags of this WorkspaceObjectDetails. System tags for this resource. Each key is predefined and scoped to a namespace.


**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#workspace-object-workspaceobjectclient) • [Top](#top)

### `create_workspace_object`
<a id="create-workspace-object"></a>
Creates a workspace object. You can create a file or folder in the workspace.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `create_workspace_object_details` (stream) — Details for new workspace object
- `path` (str) — absolute path of file or folder


**Optional Parameters:**

- `type` (str) — type of workspace object
- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `is_upload_file_base64_encoded` (bool) — A flag to identify if upload file is base64 encoded
- `is_overwrite` (bool) — A boolean which decides if overwrite is allowed
- `object_description` (str) — description of workspace object
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[stream]`


**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#workspace-object-workspaceobjectclient) • [Top](#top)

### `delete_workspace_object`
<a id="delete-workspace-object"></a>
Deletes a workspace object.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `object_path` (str) — fully qualified path of workspace object


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#workspace-object-workspaceobjectclient) • [Top](#top)

### `download_workspace_object_with_par`
<a id="download-workspace-object-with-par"></a>
Downloads a workspace file by providing the PAR info for downloading the file for given path.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `path` (str) — absolute path of file or folder


**Optional Parameters:**

- `should_generate_new_par` (bool) — Flag to toggle to generate short living par
- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `type` (str) — type of workspace object
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.DownloadFileWithParResult]` — Response object of generate PAR with download API

**Response Fields:**

- `par_url` (str) — par_url of this DownloadFileWithParResult. String representing PAR URL
- `e_tag` (str (required)) — e_tag of this DownloadFileWithParResult. Etag after creating or closing a file
- `location_uri` (str (required)) — location_uri of this DownloadFileWithParResult. object storage URI which has bucket and namespace information
- `size` (int (required)) — size of this DownloadFileWithParResult. File size in bytes
- `created_by` (str) — created_by of this DownloadFileWithParResult. user who created file
- `updated_by` (str) — updated_by of this DownloadFileWithParResult. user who last updated file
- `created_time` (str) — created_time of this DownloadFileWithParResult. time at which file was created
- `updated_time` (str) — updated_time of this DownloadFileWithParResult. last modified time of file
- `description` (str) — description of this DownloadFileWithParResult. file description
- `system_tags` (dict(str, dict(str, object))) — system_tags of this DownloadFileWithParResult. System tags for this resource. Each key is predefined and scoped to a namespace.


**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#workspace-object-workspaceobjectclient) • [Top](#top)

### `get_workspace_object`
<a id="get-workspace-object"></a>
Returns detailed information about a workspace object.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `object_path` (str) — fully qualified path of workspace object


**Optional Parameters:**

- `should_include_metadata` (bool) — Path to list all metadata for a file or folder
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[stream]`


**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#workspace-object-workspaceobjectclient) • [Top](#top)

### `head_workspace_object`
<a id="head-workspace-object"></a>
Returns metadata about a workspace object. The contents of the file are not retrieved.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `object_path` (str) — fully qualified path of workspace object


**Optional Parameters:**

- `should_include_metadata` (bool) — Path to list all metadata for a file or folder
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#workspace-object-workspaceobjectclient) • [Top](#top)

### `list_workspace_object_permissions`
<a id="list-workspace-object-permissions"></a>
Returns a list of workspace object permissions.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `object_key` (str) — key of workspace object


**Optional Parameters:**

- `limit` (int) — For list pagination. maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination
- `page` (str) — For list pagination. value of opc-next-page response header from previous "List" call. For important details about how pagination works, see List Pagination
- `sort_order` (str) — sort order to use, either ascending (ASC) or descending (DESC).
- `sort_by` (str) — field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending.
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.WorkspaceObjectPermissionCollection]` — List of workspace object permissions

**Response Fields:**

- `items` (list[WorkspaceObjectPermissionSummary] (required)) — items of this WorkspaceObjectPermissionCollection. List of workspace object permissions


**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#workspace-object-workspaceobjectclient) • [Top](#top)

### `list_workspace_objects`
<a id="list-workspace-objects"></a>
Returns a list of objects in the workspace.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `path` (str) — absolute path of file or folder


**Optional Parameters:**

- `type` (str) — Filter by object type. For example, NOTEBOOK, LIBRARY, or FILE
- `display_name` (str) — A filter to return only resources that match given display name exactly
- `limit` (int) — For list pagination. maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination
- `metadata_keys` (str) — Comma separated keys to have in list response
- `page` (str) — For list pagination. value of opc-next-page response header from previous "List" call. For important details about how pagination works, see List Pagination
- `sort_order` (str) — sort order to use, either ascending (ASC) or descending (DESC).
- `sort_by` (str) — field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending.
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.WorkspaceObjectCollection]` — Results of a workspace object list

**Response Fields:**

- `items` (list[WorkspaceObjectSummary] (required)) — items of this WorkspaceObjectCollection. List of workspace objects


**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#workspace-object-workspaceobjectclient) • [Top](#top)

### `manage_workspace_object_permission`
<a id="manage-workspace-object-permission"></a>
Updates permissions on a workspace object.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `object_key` (str) — key of workspace object
- `manage_workspace_object_permission_details` (oci.aidataplatform_dp.models.ManageWorkspaceObjectPermissionDetails) — information to be updated


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[None]` — No payload in response


**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#workspace-object-workspaceobjectclient) • [Top](#top)

### `move_workspace_object`
<a id="move-workspace-object"></a>
Moves a workspace object to different location.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `move_workspace_object_details` (oci.aidataplatform_dp.models.MoveWorkspaceObjectDetails) — Details for moving workspace object to a different path


**Optional Parameters:**

- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.WorkspaceObjectDetails]` — A WorkspaceObject is a file or folder belonging to an AI Data Platform Workbench workspace

**Response Fields:**

- `path` (str (required)) — path of this WorkspaceObjectDetails. fully qualified path of workspace object. .ipynb
- `key` (str) — key of this WorkspaceObjectDetails. key of Workspace Object
- `display_name` (str (required)) — display_name of this WorkspaceObjectDetails. name of Workspace Object. This will be name of file/folder in workspace. .ipynb, Folder1
- `time_created` (datetime (required)) — time_created of this WorkspaceObjectDetails. date and time workspace object was created, in format defined by <a href=" target="_blank" rel="noopener noreferrer">RFC 3339</a>. .600Z
- `time_updated` (datetime) — time_updated of this WorkspaceObjectDetails. date and time workspace object was created, in format defined by <a href=" target="_blank" rel="noopener noreferrer">RFC 3339</a>
- `type` (str (required)) — type of this WorkspaceObjectDetails. type of workspace object. .
- `description` (str) — description of this WorkspaceObjectDetails. description for file and folder
- `system_tags` (dict(str, dict(str, object))) — system_tags of this WorkspaceObjectDetails. System tags for this resource. Each key is predefined and scoped to a namespace.


**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#workspace-object-workspaceobjectclient) • [Top](#top)

### `rename_workspace_object`
<a id="rename-workspace-object"></a>
Renames a workspace object.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `rename_workspace_object_details` (oci.aidataplatform_dp.models.RenameWorkspaceObjectDetails) — Details for renaming workspace object


**Optional Parameters:**

- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.WorkspaceObjectDetails]` — A WorkspaceObject is a file or folder belonging to an AI Data Platform Workbench workspace

**Response Fields:**

- `path` (str (required)) — path of this WorkspaceObjectDetails. fully qualified path of workspace object. .ipynb
- `key` (str) — key of this WorkspaceObjectDetails. key of Workspace Object
- `display_name` (str (required)) — display_name of this WorkspaceObjectDetails. name of Workspace Object. This will be name of file/folder in workspace. .ipynb, Folder1
- `time_created` (datetime (required)) — time_created of this WorkspaceObjectDetails. date and time workspace object was created, in format defined by <a href=" target="_blank" rel="noopener noreferrer">RFC 3339</a>. .600Z
- `time_updated` (datetime) — time_updated of this WorkspaceObjectDetails. date and time workspace object was created, in format defined by <a href=" target="_blank" rel="noopener noreferrer">RFC 3339</a>
- `type` (str (required)) — type of this WorkspaceObjectDetails. type of workspace object. .
- `description` (str) — description of this WorkspaceObjectDetails. description for file and folder
- `system_tags` (dict(str, dict(str, object))) — system_tags of this WorkspaceObjectDetails. System tags for this resource. Each key is predefined and scoped to a namespace.


**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#workspace-object-workspaceobjectclient) • [Top](#top)

### `update_workspace_object`
<a id="update-workspace-object"></a>
Updates a workspace object with the provided information.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `object_path` (str) — fully qualified path of workspace object
- `update_workspace_object_details` (stream) — information to be updated


**Optional Parameters:**

- `object_description` (str) — description of workspace object
- `if_match` (str) — For optimistic concurrency control. In PUT or DELETE call for a resource, set if-match parameter to value of etag from a previous GET or POST response for that resource. resource will be updated or deleted only if etag you provide matches resource's current etag value
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[stream]`


**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#workspace-object-workspaceobjectclient) • [Top](#top)

### `upload_workspace_object_with_par`
<a id="upload-workspace-object-with-par"></a>
Creates a workspace file by generating PAR or updates the metadata by close file. If file exists, then it will be updated.

**Required Parameters:**

- `ai_data_platform_id` (str) — OCID of AI Data Platform (Data Lake) instance
- `workspace_key` (str) — key of Workspace
- `upload_file_with_par_details` (oci.aidataplatform_dp.models.UploadFileWithParDetails) — Contents of file to upload
- `path` (str) — absolute path of file or folder


**Optional Parameters:**

- `is_overwrite` (bool) — A boolean which decides if overwrite is allowed
- `should_generate_new_par` (bool) — Flag to toggle to generate short living par
- `should_update_recent` (bool) — A flag to identify if recent list should be updated
- `opc_retry_token` (str) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from system, then a retry of original creation request might be rejected
- `opc_request_id` (str) — Unique Oracle-assigned identifier for request. If you need to contact Oracle about a particular request, please provide request ID. only valid characters for request IDs are letters, numbers, underscore, and dash
- `type` (str) — type of workspace object
- `object_description` (str) — description of workspace object
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at client-level. This should be one of strategies available in oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. specifics of default retry strategy are described . To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy

**Return Response:** `oci.response.Response[oci.aidataplatform_dp.models.UploadFileWithParResult]` — Response object of generate PAR with Upload API

**Response Fields:**

- `par_url` (str) — par_url of this UploadFileWithParResult. String representing PAR URL
- `e_tag` (str (required)) — e_tag of this UploadFileWithParResult. Etag after creating or closing a file
- `location_uri` (str (required)) — location_uri of this UploadFileWithParResult. object storage URI which has bucket and namespace information
- `size` (int) — size of this UploadFileWithParResult. File size in bytes
- `created_by` (str) — created_by of this UploadFileWithParResult. user who created file
- `updated_by` (str) — updated_by of this UploadFileWithParResult. user who last updated file
- `created_time` (str) — created_time of this UploadFileWithParResult. time at which file was created
- `updated_time` (str) — updated_time of this UploadFileWithParResult. last modified time of file
- `description` (str) — description of this UploadFileWithParResult. file description
- `system_tags` (dict(str, dict(str, object))) — system_tags of this UploadFileWithParResult. System tags for this resource. Each key is predefined and scoped to a namespace.


**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#workspace-object-workspaceobjectclient) • [Top](#top)

