<a id="top"></a>
# AIDP Java SDK Operations Reference
This document summarizes the available service clients in the AIDP Java SDK and details every operation's request parameters and responses.

## Clients
- [Async Operations (`AsyncOperationsClient`)](#asyncoperationsclient-client)
- [Audit (`AuditClient`)](#auditclient-client)
- [Bundle (`BundleClient`)](#bundleclient-client)
- [Catalog (`CatalogClient`)](#catalogclient-client)
- [Cluster (`ClusterClient`)](#clusterclient-client)
- [Credentials (`CredentialsClient`)](#credentialsclient-client)
- [Delta Share (`DeltaShareClient`)](#deltashareclient-client)
- [Git (`GitClient`)](#gitclient-client)
- [Ml Ops (`MLOpsClient`)](#mlopsclient-client)
- [Notebook (`NotebookClient`)](#notebookclient-client)
- [Role (`RoleClient`)](#roleclient-client)
- [Schema (`SchemaClient`)](#schemaclient-client)
- [User Setting (`UserSettingClient`)](#usersettingclient-client)
- [Volume (`VolumeClient`)](#volumeclient-client)
- [Workflow (`WorkflowClient`)](#workflowclient-client)
- [Workspace (`WorkspaceClient`)](#workspaceclient-client)
- [Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client)

## Async Operations (`AsyncOperationsClient`)
<a id='asyncoperationsclient-client'></a>
**Operations:**
- [`getAsyncOperation`](#asyncoperationsclient-getasyncoperation)
- [`listAsyncOperations`](#asyncoperationsclient-listasyncoperations)

### `getAsyncOperation`
<a id='asyncoperationsclient-getasyncoperation'></a>
Get detailed information for a particular async operation

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `asyncOperationKey` (string) — The unique identifier of an async operation

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `GetAsyncOperationResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.AsyncOperation

**Response Fields:**
- `key` (str) — **[Required]** key of this AsyncOperation. The unique key that identifies an async operation The key of this AsyncOperation. str
- `resource_type` (str) — **[Required]** resource_type of this AsyncOperation. The resource type of the async operation. Allowed values for this property are: "UNKNOWN", "CATALOG", "SCHEMA", "TABLE", "VIEW", "VOLUME", "VOLUME_FILE", "WORKSPACE", "WORKSPACE_OBJECT", "CLUSTER", "AI_COMPUTE", "KNOWLEDGE_BASE", "KNOWLEDGE_BASE_JOB", "KNOWLEDGE_BASE_JOB_RUN", "AGENT_FLOW", "GIT_OPERATION", "BUNDLE_OPERATION", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The resource_type of this AsyncOperation. str
- `action_type` (str) — **[Required]** action_type of this AsyncOperation. The action type of the async operation. Allowed values for this property are: "UNKNOWN", "CREATE_CATALOG", "UPDATE_CATALOG", "DELETE_CATALOG", "TEST_CONNECTION_CATALOG", "CREATE_USER_SCHEMA_IN_CATALOG", "CREATE_SCHEMA", "DELETE_SCHEMA", "CREATE_TABLE", "UPDATE_TABLE", "DELETE_TABLE", "CREATE_VOLUME", "DELETE_VOLUME", "COPY_VOLUME_FILE", "MOVE_VOLUME_FILE", "DELETE_VOLUME_FILE", "DELETE_VOLUME_FOLDER", "CREATE_WORKSPACE", "UPDATE_WORKSPACE", "DELETE_WORKSPACE", "CREATE_CLUSTER", "UPDATE_CLUSTER", "START_CLUSTER", "STOP_CLUSTER", "RESTART_CLUSTER", "PATCH_CLUSTER_LIBRARIES", "DELETE_CLUSTER", "MANAGE_EXTRACTED_ENTITIES", "REFRESH_ENTITY", "DOWNLOAD_CLUSTER_LOG", "MIGRATE_EXTERNAL_CATALOG", "UPDATE_KNOWLEDGE_BASE", "DELETE_KNOWLEDGE_BASE", "CREATE_KNOWLEDGE_BASE", "DELETE_KNOWLEDGE_BASE_JOB", "CREATE_KNOWLEDGE_BASE_JOB", "CREATE_KNOWLEDGE_BASE_JOB_RUN", "DEPLOY_AGENT_FLOW", "CREATE_GIT_FOLDER", "UPDATE_GIT_REPOSITORY", "CREATE_BUNDLE", "BUNDLE_DEPLOY", "BUNDLE_PURGE", "BUNDLE_SYNC", "MARK_AS_BUNDLE", "GIT_COMMIT_PUSH", "GIT_CREATE_BRANCH", "GIT_CHECKOUT_BRANCH", "GIT_OPERATION_PULL", "GIT_OPERATION_MERGE", "GIT_OPERATION_REBASE", "GIT_OPERATION_RESET", "GIT_OPERATION_RESET_STATE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The action_type of this AsyncOperation. str
- `resource_name` (str) — **[Required]** resource_name of this AsyncOperation. The fully qualified name of the Data Lake resource. Example: For table, it is <catalog_name>.<schema_name>.<table_name>. For Cluster, it is <workspace_key>.<cluster_key> The resource_name of this AsyncOperation. str
- `resource_display_name` (str) — resource_display_name of this AsyncOperation. The display name of the Data Lake resource. Example: For catalog/table/schema, it is same as resourceName But for workspace/cluster it is workspace and cluster displayName field. The resource_display_name of this AsyncOperation. str
- `created_by` (str) — created_by of this AsyncOperation. The principal Id who started the async operation The created_by of this AsyncOperation. str
- `created_by_name` (str) — created_by_name of this AsyncOperation. The principal name who started the async operation The created_by_name of this AsyncOperation. str
- `time_started` (datetime) — **[Required]** time_started of this AsyncOperation. The date and time the Async operation was started, in the format defined by RFC 3339__. Example: 2016-08-25T21:10:29.600Z __ https://tools.ietf.org/html/rfc3339 The time_started of this AsyncOperation. datetime
- `time_finished` (datetime) — time_finished of this AsyncOperation. The date and time the Async operation finished, in the format defined by RFC 3339__. Example: 2016-08-25T21:10:29.600Z __ https://tools.ietf.org/html/rfc3339 The time_finished of this AsyncOperation. datetime
- `status` (str) — **[Required]** status of this AsyncOperation. The state of the Table. Allowed values for this property are: "IN_PROGRESS", "SUCCEEDED", "FAILED", "CANCELED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The status of this AsyncOperation. str
- `error_code` (str) — error_code of this AsyncOperation. Represents the error code of a failure The error_code of this AsyncOperation. str
- `error_message` (str) — error_message of this AsyncOperation. Representss extra error information of a failure The error_message of this AsyncOperation. str

**Return:** [Back to Async Operations (`AsyncOperationsClient`)](#asyncoperationsclient-client) • [Top](#top)

### `listAsyncOperations`
<a id='asyncoperationsclient-listasyncoperations'></a>
List all async operations for a resource type. Filters can be used to narrow the search down.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `resourceType` (string) — Required parameter which decides async operation resource type
- `resourceName` (string) — A filter to return only resources that match the given resource name exactly.
- `matchResourceName` (boolean) — Parameter which decides to list async operations with prefix or exact match to resourceName
- `status` (string) — Option parameter to filter operation on status
- `shouldFilterByCallingPrincipal` (boolean) — A filter to return only resources that match the current principal.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination](
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination](
- `sortOrder` (model.SortOrder) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (ListAsyncOperationsRequest.SortBy) — The field to sort by. You can provide only one sort order. Default order for {@code timeStarted} is descending.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `ListAsyncOperationsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.AsyncOperationCollection

**Response Fields:**
- `items` (list[AsyncOperationSummary]) — **[Required]** items of this AsyncOperationCollection. List of Async Operations. The items of this AsyncOperationCollection. list[oci.aidataplatform_dp.models.AsyncOperationSummary]

**Return:** [Back to Async Operations (`AsyncOperationsClient`)](#asyncoperationsclient-client) • [Top](#top)

## Audit (`AuditClient`)
<a id='auditclient-client'></a>
**Operations:**
- [`manageAuditLogs`](#auditclient-manageauditlogs)
- [`searchAuditLogs`](#auditclient-searchauditlogs)

### `manageAuditLogs`
<a id='auditclient-manageauditlogs'></a>
Manages audit logs for AI Data Platform Workbench.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `manageAuditLogsDetails` (model.ManageAuditLogsDetails) — Details to update in an audit log.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `ManageAuditLogsResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Audit (`AuditClient`)](#auditclient-client) • [Top](#top)

### `searchAuditLogs`
<a id='auditclient-searchauditlogs'></a>
Searches audit logs for AI Data Platform Workbench.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `searchAuditLogsDetails` (model.SearchAuditLogsDetails) — Details for the audit log search.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination](
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination](

**Return Response:** `SearchAuditLogsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.AuditLogSearchResultCollection

**Response Fields:**
- `data` (object) — **[Required]** data of this SearchResult. The actual log data with field mappings. The data of this SearchResult. object

**Return:** [Back to Audit (`AuditClient`)](#auditclient-client) • [Top](#top)

## Bundle (`BundleClient`)
<a id='bundleclient-client'></a>
**Operations:**
- [`createBundle`](#bundleclient-createbundle)
- [`deployBundle`](#bundleclient-deploybundle)
- [`fetchBundleDeploymentStatus`](#bundleclient-fetchbundledeploymentstatus)
- [`purgeBundle`](#bundleclient-purgebundle)
- [`syncBundle`](#bundleclient-syncbundle)

### `createBundle`
<a id='bundleclient-createbundle'></a>
(Preview) Creates a new bundle.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `createBundleDetails` (model.CreateBundleDetails) — Request payload for bundle creation.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `CreateBundleResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Bundle (`BundleClient`)](#bundleclient-client) • [Top](#top)

### `deployBundle`
<a id='bundleclient-deploybundle'></a>
(Preview) Deploys the specified bundle, creating or updating jobs and agent flows according to the bundle manifest. Returns an async job key for tracking deployment progress.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `deployBundleDetails` (model.DeployBundleDetails) — Request payload for bundle deploy.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `DeployBundleResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Bundle (`BundleClient`)](#bundleclient-client) • [Top](#top)

### `fetchBundleDeploymentStatus`
<a id='bundleclient-fetchbundledeploymentstatus'></a>
(Preview) Returns a high-level summary of the most recent deployment activity recorded for the specified bundle.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `fetchBundleDeploymentStatusDetails` (model.FetchBundleDeploymentStatusDetails) — Request payload for FetchBundleDeploymentStatusDetails.

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `FetchBundleDeploymentStatusResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.BundleDeploymentStatus

**Response Fields:**
- `status` (str) — **[Required]** status of this BundleDeploymentStatus. Overall status of the last deployment. Allowed values for this property are: "SUCCEEDED", "FAILED", "IN_PROGRESS", "NOT_DEPLOYED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The status of this BundleDeploymentStatus. str
- `time_started` (datetime) — **[Required]** time_started of this BundleDeploymentStatus. The deployment start time The time_started of this BundleDeploymentStatus. datetime
- `time_completed` (datetime) — **[Required]** time_completed of this BundleDeploymentStatus. The deployment end time The time_completed of this BundleDeploymentStatus. datetime
- `message` (str) — message of this BundleDeploymentStatus. Optional summary message for the last deployment. The message of this BundleDeploymentStatus. str
- `resources` (list[BundleDeployedResource]) — resources of this BundleDeploymentStatus. List of resources from the last deployment. The resources of this BundleDeploymentStatus. list[oci.aidataplatform_dp.models.BundleDeployedResource]

**Return:** [Back to Bundle (`BundleClient`)](#bundleclient-client) • [Top](#top)

### `purgeBundle`
<a id='bundleclient-purgebundle'></a>
(Preview) Tears down all resources deployed by the specified bundle in the workspace.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `purgeBundleDetails` (model.PurgeBundleDetails) — Request payload for bundle purge.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `PurgeBundleResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Bundle (`BundleClient`)](#bundleclient-client) • [Top](#top)

### `syncBundle`
<a id='bundleclient-syncbundle'></a>
(Preview) Synchronizes the code, descriptors, and mapping in the bundle by reconciling the contents with the resource origins. Returns an async job key for tracking sync progress.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `syncBundleDetails` (model.SyncBundleDetails) — Request payload for bundle sync.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `SyncBundleResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Bundle (`BundleClient`)](#bundleclient-client) • [Top](#top)

## Catalog (`CatalogClient`)
<a id='catalogclient-client'></a>
**Operations:**
- [`catalogTestConnection`](#catalogclient-catalogtestconnection)
- [`createCatalog`](#catalogclient-createcatalog)
- [`deleteCatalog`](#catalogclient-deletecatalog)
- [`getCatalog`](#catalogclient-getcatalog)
- [`listCatalogPermissions`](#catalogclient-listcatalogpermissions)
- [`listCatalogs`](#catalogclient-listcatalogs)
- [`manageCatalogPermission`](#catalogclient-managecatalogpermission)
- [`refreshCatalog`](#catalogclient-refreshcatalog)
- [`updateCatalog`](#catalogclient-updatecatalog)

### `catalogTestConnection`
<a id='catalogclient-catalogtestconnection'></a>
Test the connection of an AI Data Platform Workbench to an external catalog.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `catalogTestConnectionDetails` (model.CatalogTestConnectionDetails) — Details for the AI Data Platform Workbench catalog to be tested for connection.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `CatalogTestConnectionResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Catalog (`CatalogClient`)](#catalogclient-client) • [Top](#top)

### `createCatalog`
<a id='catalogclient-createcatalog'></a>
Create a catalog in the AI Data Platform Workbench with the given ID.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `createCatalogDetails` (model.CreateCatalogDetails) — Details for the new AI Data Platform Workbench catalog.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `CreateCatalogResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Catalog (`CatalogClient`)](#catalogclient-client) • [Top](#top)

### `deleteCatalog`
<a id='catalogclient-deletecatalog'></a>
Deletes the specified catalog from an AI Data Platform Workbench.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `catalogKey` (string) — The key of the catalog.

**Optional Parameters:**
- `isForced` (boolean) — A boolean which decides if an entity should be deleted with Cascade effect
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `DeleteCatalogResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Catalog (`CatalogClient`)](#catalogclient-client) • [Top](#top)

### `getCatalog`
<a id='catalogclient-getcatalog'></a>
Gets detailed information about an AI Data Platform Workbench catalog with a given catalog key.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `catalogKey` (string) — The key of the catalog.

**Optional Parameters:**
- `isCatalogGuid` (boolean) — A boolean which decides if catalogKey path parameter is catalog GUID (UUID) or name.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `GetCatalogResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.Catalog

**Response Fields:**
- `key` (str) — **[Required]** key of this Catalog. The AI Data Platform Workbench catalog key. The key of this Catalog. str
- `display_name` (str) — **[Required]** display_name of this Catalog. Catalog display name. The display_name of this Catalog. str
- `description` (str) — description of this Catalog. Short description of the catalog. The description of this Catalog. str
- `catalog_guid` (str) — catalog_guid of this Catalog. Unique identifier for catalog. The catalog_guid of this Catalog. str
- `catalog_type` (str) — catalog_type of this Catalog. Type of catalog. Allowed values for this property are: "EXTERNAL", "INTERNAL", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The catalog_type of this Catalog. str
- `source_type` (str) — source_type of this Catalog. External catalog source type. Allowed values for this property are: "ADW", "ALH", "KAFKA", "ATP", "ORACLE", "EXADATA", "ORACLE_ANALYTICS", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The source_type of this Catalog. str
- `connection_details` (CatalogConnectionDetails) — connection_details of this Catalog. The connection_details of this Catalog. oci.aidataplatform_dp.models.CatalogConnectionDetails
- `lifecycle_state` (str) — lifecycle_state of this Catalog. The current status of the catalog. Allowed values for this property are: "ACTIVE", "CREATING", "DELETING", "UPDATING", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The lifecycle_state of this Catalog. str
- `lifecycle_state_details` (str) — lifecycle_state_details of this Catalog. A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state. The lifecycle_state_details of this Catalog. str
- `time_created` (datetime) — **[Required]** time_created of this Catalog. The date and time the AI Data Platform Workbench catalog was created. The time_created of this Catalog. datetime
- `time_updated` (datetime) — time_updated of this Catalog. The date and time the AI Data Platform Workbench catalog was updated. The time_updated of this Catalog. datetime
- `created_by` (str) — created_by of this Catalog. The ID of the user that created the catalog. The created_by of this Catalog. str
- `updated_by` (str) — updated_by of this Catalog. The ID of the last user to update the catalog. The updated_by of this Catalog. str
- `properties` (dict(str, str)) — properties of this Catalog. Key-value pair used to provide catalog properties like the subCompartment OCID where the buckets need to reside. The properties of this Catalog. dict(str, str)

**Return:** [Back to Catalog (`CatalogClient`)](#catalogclient-client) • [Top](#top)

### `listCatalogPermissions`
<a id='catalogclient-listcatalogpermissions'></a>
Gets a list of all permissions in the specified catalog of an AI Data Platform Workbench.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `catalogKey` (string) — The key of the catalog.

**Optional Parameters:**
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination](
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination](
- `sortOrder` (model.SortOrder) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (ListCatalogPermissionsRequest.SortBy) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `ListCatalogPermissionsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.CatalogPermissionCollection

**Response Fields:**
- `key` (str) — **[Required]** key of this Catalog. The AI Data Platform Workbench catalog key. The key of this Catalog. str
- `display_name` (str) — **[Required]** display_name of this Catalog. Catalog display name. The display_name of this Catalog. str
- `description` (str) — description of this Catalog. Short description of the catalog. The description of this Catalog. str
- `catalog_guid` (str) — catalog_guid of this Catalog. Unique identifier for catalog. The catalog_guid of this Catalog. str
- `catalog_type` (str) — catalog_type of this Catalog. Type of catalog. Allowed values for this property are: "EXTERNAL", "INTERNAL", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The catalog_type of this Catalog. str
- `source_type` (str) — source_type of this Catalog. External catalog source type. Allowed values for this property are: "ADW", "ALH", "KAFKA", "ATP", "ORACLE", "EXADATA", "ORACLE_ANALYTICS", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The source_type of this Catalog. str
- `connection_details` (CatalogConnectionDetails) — connection_details of this Catalog. The connection_details of this Catalog. oci.aidataplatform_dp.models.CatalogConnectionDetails
- `lifecycle_state` (str) — lifecycle_state of this Catalog. The current status of the catalog. Allowed values for this property are: "ACTIVE", "CREATING", "DELETING", "UPDATING", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The lifecycle_state of this Catalog. str
- `lifecycle_state_details` (str) — lifecycle_state_details of this Catalog. A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state. The lifecycle_state_details of this Catalog. str
- `time_created` (datetime) — **[Required]** time_created of this Catalog. The date and time the AI Data Platform Workbench catalog was created. The time_created of this Catalog. datetime
- `time_updated` (datetime) — time_updated of this Catalog. The date and time the AI Data Platform Workbench catalog was updated. The time_updated of this Catalog. datetime
- `created_by` (str) — created_by of this Catalog. The ID of the user that created the catalog. The created_by of this Catalog. str
- `updated_by` (str) — updated_by of this Catalog. The ID of the last user to update the catalog. The updated_by of this Catalog. str
- `properties` (dict(str, str)) — properties of this Catalog. Key-value pair used to provide catalog properties like the subCompartment OCID where the buckets need to reside. The properties of this Catalog. dict(str, str)

**Return:** [Back to Catalog (`CatalogClient`)](#catalogclient-client) • [Top](#top)

### `listCatalogs`
<a id='catalogclient-listcatalogs'></a>
Get a list of catalogs in an AI Data Platform Workbench with a given ID.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `displayName` (string) — A filter to return only resources that match the given display name exactly.
- `catalogState` (ListCatalogsRequest.CatalogState) — The state of the catalog.
- `catalogType` (ListCatalogsRequest.CatalogType) — The type of the catalog.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination](
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination](
- `sortOrder` (model.SortOrder) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (ListCatalogsRequest.SortBy) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `ListCatalogsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.CatalogCollection

**Response Fields:**
- `key` (str) — **[Required]** key of this Catalog. The AI Data Platform Workbench catalog key. The key of this Catalog. str
- `display_name` (str) — **[Required]** display_name of this Catalog. Catalog display name. The display_name of this Catalog. str
- `description` (str) — description of this Catalog. Short description of the catalog. The description of this Catalog. str
- `catalog_guid` (str) — catalog_guid of this Catalog. Unique identifier for catalog. The catalog_guid of this Catalog. str
- `catalog_type` (str) — catalog_type of this Catalog. Type of catalog. Allowed values for this property are: "EXTERNAL", "INTERNAL", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The catalog_type of this Catalog. str
- `source_type` (str) — source_type of this Catalog. External catalog source type. Allowed values for this property are: "ADW", "ALH", "KAFKA", "ATP", "ORACLE", "EXADATA", "ORACLE_ANALYTICS", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The source_type of this Catalog. str
- `connection_details` (CatalogConnectionDetails) — connection_details of this Catalog. The connection_details of this Catalog. oci.aidataplatform_dp.models.CatalogConnectionDetails
- `lifecycle_state` (str) — lifecycle_state of this Catalog. The current status of the catalog. Allowed values for this property are: "ACTIVE", "CREATING", "DELETING", "UPDATING", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The lifecycle_state of this Catalog. str
- `lifecycle_state_details` (str) — lifecycle_state_details of this Catalog. A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state. The lifecycle_state_details of this Catalog. str
- `time_created` (datetime) — **[Required]** time_created of this Catalog. The date and time the AI Data Platform Workbench catalog was created. The time_created of this Catalog. datetime
- `time_updated` (datetime) — time_updated of this Catalog. The date and time the AI Data Platform Workbench catalog was updated. The time_updated of this Catalog. datetime
- `created_by` (str) — created_by of this Catalog. The ID of the user that created the catalog. The created_by of this Catalog. str
- `updated_by` (str) — updated_by of this Catalog. The ID of the last user to update the catalog. The updated_by of this Catalog. str
- `properties` (dict(str, str)) — properties of this Catalog. Key-value pair used to provide catalog properties like the subCompartment OCID where the buckets need to reside. The properties of this Catalog. dict(str, str)

**Return:** [Back to Catalog (`CatalogClient`)](#catalogclient-client) • [Top](#top)

### `manageCatalogPermission`
<a id='catalogclient-managecatalogpermission'></a>
Update permission details for a catalog in an AI Data Platform Workbench.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `catalogKey` (string) — The key of the catalog.
- `manageCatalogPermissionDetails` (model.ManageCatalogPermissionDetails) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `ManageCatalogPermissionResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Catalog (`CatalogClient`)](#catalogclient-client) • [Top](#top)

### `refreshCatalog`
<a id='catalogclient-refreshcatalog'></a>
Refresh a catalog in an AI Data Platform Workbench through a crawler.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `catalogKey` (string) — The key of the catalog.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.

**Return Response:** `RefreshCatalogResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Catalog (`CatalogClient`)](#catalogclient-client) • [Top](#top)

### `updateCatalog`
<a id='catalogclient-updatecatalog'></a>
Update the details of an AI Data Platform Workbench catalog with the given information.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `catalogKey` (string) — The key of the catalog.
- `updateCatalogDetails` (model.UpdateCatalogDetails) — The information to be updated.

**Optional Parameters:**
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `UpdateCatalogResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Catalog (`CatalogClient`)](#catalogclient-client) • [Top](#top)

## Cluster (`ClusterClient`)
<a id='clusterclient-client'></a>
**Operations:**
- [`createCluster`](#clusterclient-createcluster)
- [`deleteCluster`](#clusterclient-deletecluster)
- [`downloadClusterLogs`](#clusterclient-downloadclusterlogs)
- [`getCluster`](#clusterclient-getcluster)
- [`getDefaultCluster`](#clusterclient-getdefaultcluster)
- [`listClusterLibraries`](#clusterclient-listclusterlibraries)
- [`listClusterPermissions`](#clusterclient-listclusterpermissions)
- [`listClusters`](#clusterclient-listclusters)
- [`manageClusterPermission`](#clusterclient-manageclusterpermission)
- [`patchClusterLibrary`](#clusterclient-patchclusterlibrary)
- [`restartCluster`](#clusterclient-restartcluster)
- [`searchClusterLogs`](#clusterclient-searchclusterlogs)
- [`startCluster`](#clusterclient-startcluster)
- [`stopCluster`](#clusterclient-stopcluster)
- [`summarizeMetricsData`](#clusterclient-summarizemetricsdata)
- [`updateCluster`](#clusterclient-updatecluster)

### `createCluster`
<a id='clusterclient-createcluster'></a>
Creates a new cluster with the provided details.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `createClusterDetails` (model.CreateAgentFlowComputeDetails| model.CreateSparkClusterDetails) — Details for the new cluster.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `CreateClusterResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.Cluster

**Response Fields:**
- `key` (str) — **[Required]** key of this Cluster. Cluster key. The key of this Cluster. str
- `display_name` (str) — **[Required]** display_name of this Cluster. Cluster name. The display_name of this Cluster. str
- `description` (str) — description of this Cluster. Cluster description. The description of this Cluster. str
- `source_api` (str) — source_api of this Cluster. User created clusters are associated with a particular workspace. Default cluster is to be used by all catalogs operations that require compute. Default cluster can be thought of as associated with Master catalog. Agent Flow Compute is used to execute Agent Flows. Allowed values for this property are: "CLUSTER_API", "DEFAULT_CLUSTER_API", "AGENT_FLOW_COMPUTE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The source_api of this Cluster. str
- `type` (str) — type of this Cluster. ClusterType Allowed values for this property are: "USER", "AGENT_FLOW_COMPUTE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The type of this Cluster. str
- `time_created` (datetime) — **[Required]** time_created of this Cluster. Date and time the cluster was created. The time_created of this Cluster. datetime
- `time_updated` (datetime) — time_updated of this Cluster. Date and time the cluster was updated. The time_updated of this Cluster. datetime
- `state` (str) — **[Required]** state of this Cluster. Common lifecycle states for resources in a compute cluster. ACCEPTED - The resource create request has been accepted. CREATING - The resource is being created and might not be usable until the entire metadata is defined. ACTIVE - The resource is valid and available for access. DELETING - The resource is being deleted, and might require a deep clean of any children. DELETED - The resource has been deleted, and isn't available. FAILED - The resource is in a failed state due to validation or other errors. STOPPING - The resource is being stopped. STOPPED - The resource has been stopped. UPDATING - The resource is being updated and might not be usable until all changes are commited. STARTING - The resource is being started. RESTARTING - The resource is being restarted. Allowed values for this property are: "ACCEPTED", "CREATING", "ACTIVE", "DELETING", "DELETED", "FAILED", "STOPPING", "STOPPED", "UPDATING", "RESTARTING", "STARTING", "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS", "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL", "NETWORK_CONFIGURATION_ATTACH_FAILED", "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS", "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL", "NETWORK_CONFIGURATION_DETACH_FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The state of this Cluster. str
- `state_details` (str) — state_details of this Cluster. A message that describes the current state of the workspace cluster in more detail. For example, can be used to provide actionable information for a resource in the Failed state. The state_details of this Cluster. str
- `node_type` (str) — node_type of this Cluster. Cluster node type encodes the node shape and associated resources. The node_type of this Cluster. str
- `driver_config` (DriverConfig) — driver_config of this Cluster. The driver_config of this Cluster. oci.aidataplatform_dp.models.DriverConfig
- `active_cluster_resources` (ActiveClusterResources) — active_cluster_resources of this Cluster. The active_cluster_resources of this Cluster. oci.aidataplatform_dp.models.ActiveClusterResources
- `created_by` (str) — created_by of this Cluster. OCID of the user who created this record. The created_by of this Cluster. str
- `created_by_name` (str) — created_by_name of this Cluster. Name of the user who created this record. The created_by_name of this Cluster. str
- `updated_by` (str) — updated_by of this Cluster. OCID of the user who updated this record. The updated_by of this Cluster. str
- `updated_by_name` (str) — updated_by_name of this Cluster. Name of the user who updated this record. The updated_by_name of this Cluster. str
- `stopped_by` (str) — stopped_by of this Cluster. OCID of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped. The stopped_by of this Cluster. str
- `stopped_by_name` (str) — stopped_by_name of this Cluster. Name of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped. The stopped_by_name of this Cluster. str

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)

### `deleteCluster`
<a id='clusterclient-deletecluster'></a>
Deletes a cluster from a workspace.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `clusterKey` (string) — Cluster key.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `DeleteClusterResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)

### `downloadClusterLogs`
<a id='clusterclient-downloadclusterlogs'></a>
Downloads logs within the specified cluster and time range. The logs can be filtered by severity (logLevel), type (logContentTypeContains), and other parameters such as execution context and thread identifiers.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `clusterKey` (string) — Cluster key.
- `downloadClusterLogsDetails` (model.DownloadClusterLogsDetails) — Request payload containing the parameters for filtering cluster logs.

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.

**Return Response:** `DownloadClusterLogsResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)

### `getCluster`
<a id='clusterclient-getcluster'></a>
Returns detailed information about a cluster.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `clusterKey` (string) — Cluster key.

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `GetClusterResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.Cluster

**Response Fields:**
- `key` (str) — **[Required]** key of this Cluster. Cluster key. The key of this Cluster. str
- `display_name` (str) — **[Required]** display_name of this Cluster. Cluster name. The display_name of this Cluster. str
- `description` (str) — description of this Cluster. Cluster description. The description of this Cluster. str
- `source_api` (str) — source_api of this Cluster. User created clusters are associated with a particular workspace. Default cluster is to be used by all catalogs operations that require compute. Default cluster can be thought of as associated with Master catalog. Agent Flow Compute is used to execute Agent Flows. Allowed values for this property are: "CLUSTER_API", "DEFAULT_CLUSTER_API", "AGENT_FLOW_COMPUTE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The source_api of this Cluster. str
- `type` (str) — type of this Cluster. ClusterType Allowed values for this property are: "USER", "AGENT_FLOW_COMPUTE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The type of this Cluster. str
- `time_created` (datetime) — **[Required]** time_created of this Cluster. Date and time the cluster was created. The time_created of this Cluster. datetime
- `time_updated` (datetime) — time_updated of this Cluster. Date and time the cluster was updated. The time_updated of this Cluster. datetime
- `state` (str) — **[Required]** state of this Cluster. Common lifecycle states for resources in a compute cluster. ACCEPTED - The resource create request has been accepted. CREATING - The resource is being created and might not be usable until the entire metadata is defined. ACTIVE - The resource is valid and available for access. DELETING - The resource is being deleted, and might require a deep clean of any children. DELETED - The resource has been deleted, and isn't available. FAILED - The resource is in a failed state due to validation or other errors. STOPPING - The resource is being stopped. STOPPED - The resource has been stopped. UPDATING - The resource is being updated and might not be usable until all changes are commited. STARTING - The resource is being started. RESTARTING - The resource is being restarted. Allowed values for this property are: "ACCEPTED", "CREATING", "ACTIVE", "DELETING", "DELETED", "FAILED", "STOPPING", "STOPPED", "UPDATING", "RESTARTING", "STARTING", "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS", "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL", "NETWORK_CONFIGURATION_ATTACH_FAILED", "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS", "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL", "NETWORK_CONFIGURATION_DETACH_FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The state of this Cluster. str
- `state_details` (str) — state_details of this Cluster. A message that describes the current state of the workspace cluster in more detail. For example, can be used to provide actionable information for a resource in the Failed state. The state_details of this Cluster. str
- `node_type` (str) — node_type of this Cluster. Cluster node type encodes the node shape and associated resources. The node_type of this Cluster. str
- `driver_config` (DriverConfig) — driver_config of this Cluster. The driver_config of this Cluster. oci.aidataplatform_dp.models.DriverConfig
- `active_cluster_resources` (ActiveClusterResources) — active_cluster_resources of this Cluster. The active_cluster_resources of this Cluster. oci.aidataplatform_dp.models.ActiveClusterResources
- `created_by` (str) — created_by of this Cluster. OCID of the user who created this record. The created_by of this Cluster. str
- `created_by_name` (str) — created_by_name of this Cluster. Name of the user who created this record. The created_by_name of this Cluster. str
- `updated_by` (str) — updated_by of this Cluster. OCID of the user who updated this record. The updated_by of this Cluster. str
- `updated_by_name` (str) — updated_by_name of this Cluster. Name of the user who updated this record. The updated_by_name of this Cluster. str
- `stopped_by` (str) — stopped_by of this Cluster. OCID of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped. The stopped_by of this Cluster. str
- `stopped_by_name` (str) — stopped_by_name of this Cluster. Name of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped. The stopped_by_name of this Cluster. str

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)

### `getDefaultCluster`
<a id='clusterclient-getdefaultcluster'></a>
Gets information about the master catalog default cluster.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `GetDefaultClusterResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.DefaultCluster

**Response Fields:**
- `key` (str) — 
- `display_name` (str) — 
- `description` (str) — 
- `source_api` (str) — 
- `type` (str) — 
- `time_created` (datetime) — 
- `time_updated` (datetime) — 
- `state` (str) — 
- `state_details` (str) — 
- `node_type` (str) — 
- `driver_config` (DriverConfig) — 
- `active_cluster_resources` (ActiveClusterResources) — 
- `created_by` (str) — 
- `created_by_name` (str) — 
- `updated_by` (str) — 
- `updated_by_name` (str) — 
- `stopped_by` (str) — 
- `stopped_by_name` (str) — 
- `workspace_key` (str) — workspace_key of this DefaultCluster. The key of the AI Data Platform Workbench workspace where the default cluster is. The workspace_key of this DefaultCluster. str
- `worker_config` (WorkerConfig) — worker_config of this DefaultCluster. The worker_config of this DefaultCluster. oci.aidataplatform_dp.models.WorkerConfig
- `cluster_runtime_config` (ClusterRuntimeConfig) — cluster_runtime_config of this DefaultCluster. The cluster_runtime_config of this DefaultCluster. oci.aidataplatform_dp.models.ClusterRuntimeConfig
- `logging_config` (LoggingConfig) — logging_config of this DefaultCluster. The logging_config of this DefaultCluster. oci.aidataplatform_dp.models.LoggingConfig
- `auto_termination_minutes` (int) — auto_termination_minutes of this DefaultCluster. Optional timeout value in minutes used to automatically stop idle compute clusters. The auto_termination_minutes of this DefaultCluster. int
- `jdbc_endpoint_url` (str) — jdbc_endpoint_url of this DefaultCluster. Spark JDBC URL. The jdbc_endpoint_url of this DefaultCluster. str
- `log_id` (str) — log_id of this DefaultCluster. The OCID of the log where cluster logs are published and retrieved. This logId is always created within the logGroupId returned in the response payload. The log_id of this DefaultCluster. str
- `log_group_id` (str) — log_group_id of this DefaultCluster. The unique OCID that identifies a specific log group within OCI Logging. This log group is exclusively associated with the AI Data Platform Workbench instance and is created in the same compartment within the customer’s tenancy as the AI Data Platform Workbench instance. The log_group_id of this DefaultCluster. str
- `subscription` (SubscriptionDetails) — subscription of this DefaultCluster. The subscription of this DefaultCluster. oci.aidataplatform_dp.models.SubscriptionDetails

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)

### `listClusterLibraries`
<a id='clusterclient-listclusterlibraries'></a>
Gets a list of libraries installed on a cluster.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `clusterKey` (string) — Cluster key.

**Optional Parameters:**
- `displayName` (string) — A filter to return only resources that match the given display name exactly.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination](
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination](
- `sortOrder` (model.SortOrder) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (ListClusterLibrariesRequest.SortBy) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `ListClusterLibrariesResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.ClusterLibraryCollection

**Response Fields:**
- `items` (list[ClusterLibrarySummary]) — **[Required]** items of this ClusterLibraryCollection. List of cluster libraries. The items of this ClusterLibraryCollection. list[oci.aidataplatform_dp.models.ClusterLibrarySummary]

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)

### `listClusterPermissions`
<a id='clusterclient-listclusterpermissions'></a>
Return a list of permissions for a given cluster.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `clusterKey` (string) — Cluster key.

**Optional Parameters:**
- `displayName` (string) — A filter to return only resources that match the given display name exactly.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination](
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination](
- `sortOrder` (model.SortOrder) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (ListClusterPermissionsRequest.SortBy) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `ListClusterPermissionsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.ClusterPermissionCollection

**Response Fields:**
- `items` (list[ClusterPermissionSummary]) — **[Required]** items of this ClusterPermissionCollection. List of cluster permissions. The items of this ClusterPermissionCollection. list[oci.aidataplatform_dp.models.ClusterPermissionSummary]

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)

### `listClusters`
<a id='clusterclient-listclusters'></a>
Returns a list of all clusters in a given workspace.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace

**Optional Parameters:**
- `state` (string) — A filter to return only resources that match the given lifecycle state. The state value is case-insensitive.
- `displayName` (string) — A filter to return only resources that match the given display name exactly.
- `displayNameContains` (string) — A filter to return only resources that have a display name containing the text provided.
- `type` (string) — Cluster type. When the filter is not provided list shows all type of cluster - USER else it show only cluster of type chosen. Only clusters of type USER are attachable to a workspace notebook.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination](
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination](
- `sortOrder` (model.SortOrder) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (ListClustersRequest.SortBy) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `ListClustersResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.ClusterCollection

**Response Fields:**
- `key` (str) — **[Required]** key of this Cluster. Cluster key. The key of this Cluster. str
- `display_name` (str) — **[Required]** display_name of this Cluster. Cluster name. The display_name of this Cluster. str
- `description` (str) — description of this Cluster. Cluster description. The description of this Cluster. str
- `source_api` (str) — source_api of this Cluster. User created clusters are associated with a particular workspace. Default cluster is to be used by all catalogs operations that require compute. Default cluster can be thought of as associated with Master catalog. Agent Flow Compute is used to execute Agent Flows. Allowed values for this property are: "CLUSTER_API", "DEFAULT_CLUSTER_API", "AGENT_FLOW_COMPUTE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The source_api of this Cluster. str
- `type` (str) — type of this Cluster. ClusterType Allowed values for this property are: "USER", "AGENT_FLOW_COMPUTE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The type of this Cluster. str
- `time_created` (datetime) — **[Required]** time_created of this Cluster. Date and time the cluster was created. The time_created of this Cluster. datetime
- `time_updated` (datetime) — time_updated of this Cluster. Date and time the cluster was updated. The time_updated of this Cluster. datetime
- `state` (str) — **[Required]** state of this Cluster. Common lifecycle states for resources in a compute cluster. ACCEPTED - The resource create request has been accepted. CREATING - The resource is being created and might not be usable until the entire metadata is defined. ACTIVE - The resource is valid and available for access. DELETING - The resource is being deleted, and might require a deep clean of any children. DELETED - The resource has been deleted, and isn't available. FAILED - The resource is in a failed state due to validation or other errors. STOPPING - The resource is being stopped. STOPPED - The resource has been stopped. UPDATING - The resource is being updated and might not be usable until all changes are commited. STARTING - The resource is being started. RESTARTING - The resource is being restarted. Allowed values for this property are: "ACCEPTED", "CREATING", "ACTIVE", "DELETING", "DELETED", "FAILED", "STOPPING", "STOPPED", "UPDATING", "RESTARTING", "STARTING", "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS", "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL", "NETWORK_CONFIGURATION_ATTACH_FAILED", "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS", "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL", "NETWORK_CONFIGURATION_DETACH_FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The state of this Cluster. str
- `state_details` (str) — state_details of this Cluster. A message that describes the current state of the workspace cluster in more detail. For example, can be used to provide actionable information for a resource in the Failed state. The state_details of this Cluster. str
- `node_type` (str) — node_type of this Cluster. Cluster node type encodes the node shape and associated resources. The node_type of this Cluster. str
- `driver_config` (DriverConfig) — driver_config of this Cluster. The driver_config of this Cluster. oci.aidataplatform_dp.models.DriverConfig
- `active_cluster_resources` (ActiveClusterResources) — active_cluster_resources of this Cluster. The active_cluster_resources of this Cluster. oci.aidataplatform_dp.models.ActiveClusterResources
- `created_by` (str) — created_by of this Cluster. OCID of the user who created this record. The created_by of this Cluster. str
- `created_by_name` (str) — created_by_name of this Cluster. Name of the user who created this record. The created_by_name of this Cluster. str
- `updated_by` (str) — updated_by of this Cluster. OCID of the user who updated this record. The updated_by of this Cluster. str
- `updated_by_name` (str) — updated_by_name of this Cluster. Name of the user who updated this record. The updated_by_name of this Cluster. str
- `stopped_by` (str) — stopped_by of this Cluster. OCID of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped. The stopped_by of this Cluster. str
- `stopped_by_name` (str) — stopped_by_name of this Cluster. Name of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped. The stopped_by_name of this Cluster. str

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)

### `manageClusterPermission`
<a id='clusterclient-manageclusterpermission'></a>
Updates the permissions for a given cluster.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `clusterKey` (string) — Cluster key.
- `manageClusterPermissionDetails` (model.ManageClusterPermissionDetails) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `ManageClusterPermissionResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)

### `patchClusterLibrary`
<a id='clusterclient-patchclusterlibrary'></a>
Updates libraries of a cluster with the provided patches.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `clusterKey` (string) — Cluster key.
- `patchClusterLibraryDetails` (model.PatchClusterLibraryDetails) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `PatchClusterLibraryResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.ClusterLibraryCollection

**Response Fields:**
- `items` (list[ClusterLibrarySummary]) — **[Required]** items of this ClusterLibraryCollection. List of cluster libraries. The items of this ClusterLibraryCollection. list[oci.aidataplatform_dp.models.ClusterLibrarySummary]

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)

### `restartCluster`
<a id='clusterclient-restartcluster'></a>
Restarts a running cluster.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `clusterKey` (string) — Cluster key.
- `restartClusterDetails` (model.RestartClusterDetails) — Details for restarting the cluster.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `RestartClusterResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.Cluster

**Response Fields:**
- `key` (str) — **[Required]** key of this Cluster. Cluster key. The key of this Cluster. str
- `display_name` (str) — **[Required]** display_name of this Cluster. Cluster name. The display_name of this Cluster. str
- `description` (str) — description of this Cluster. Cluster description. The description of this Cluster. str
- `source_api` (str) — source_api of this Cluster. User created clusters are associated with a particular workspace. Default cluster is to be used by all catalogs operations that require compute. Default cluster can be thought of as associated with Master catalog. Agent Flow Compute is used to execute Agent Flows. Allowed values for this property are: "CLUSTER_API", "DEFAULT_CLUSTER_API", "AGENT_FLOW_COMPUTE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The source_api of this Cluster. str
- `type` (str) — type of this Cluster. ClusterType Allowed values for this property are: "USER", "AGENT_FLOW_COMPUTE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The type of this Cluster. str
- `time_created` (datetime) — **[Required]** time_created of this Cluster. Date and time the cluster was created. The time_created of this Cluster. datetime
- `time_updated` (datetime) — time_updated of this Cluster. Date and time the cluster was updated. The time_updated of this Cluster. datetime
- `state` (str) — **[Required]** state of this Cluster. Common lifecycle states for resources in a compute cluster. ACCEPTED - The resource create request has been accepted. CREATING - The resource is being created and might not be usable until the entire metadata is defined. ACTIVE - The resource is valid and available for access. DELETING - The resource is being deleted, and might require a deep clean of any children. DELETED - The resource has been deleted, and isn't available. FAILED - The resource is in a failed state due to validation or other errors. STOPPING - The resource is being stopped. STOPPED - The resource has been stopped. UPDATING - The resource is being updated and might not be usable until all changes are commited. STARTING - The resource is being started. RESTARTING - The resource is being restarted. Allowed values for this property are: "ACCEPTED", "CREATING", "ACTIVE", "DELETING", "DELETED", "FAILED", "STOPPING", "STOPPED", "UPDATING", "RESTARTING", "STARTING", "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS", "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL", "NETWORK_CONFIGURATION_ATTACH_FAILED", "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS", "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL", "NETWORK_CONFIGURATION_DETACH_FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The state of this Cluster. str
- `state_details` (str) — state_details of this Cluster. A message that describes the current state of the workspace cluster in more detail. For example, can be used to provide actionable information for a resource in the Failed state. The state_details of this Cluster. str
- `node_type` (str) — node_type of this Cluster. Cluster node type encodes the node shape and associated resources. The node_type of this Cluster. str
- `driver_config` (DriverConfig) — driver_config of this Cluster. The driver_config of this Cluster. oci.aidataplatform_dp.models.DriverConfig
- `active_cluster_resources` (ActiveClusterResources) — active_cluster_resources of this Cluster. The active_cluster_resources of this Cluster. oci.aidataplatform_dp.models.ActiveClusterResources
- `created_by` (str) — created_by of this Cluster. OCID of the user who created this record. The created_by of this Cluster. str
- `created_by_name` (str) — created_by_name of this Cluster. Name of the user who created this record. The created_by_name of this Cluster. str
- `updated_by` (str) — updated_by of this Cluster. OCID of the user who updated this record. The updated_by of this Cluster. str
- `updated_by_name` (str) — updated_by_name of this Cluster. Name of the user who updated this record. The updated_by_name of this Cluster. str
- `stopped_by` (str) — stopped_by of this Cluster. OCID of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped. The stopped_by of this Cluster. str
- `stopped_by_name` (str) — stopped_by_name of this Cluster. Name of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped. The stopped_by_name of this Cluster. str

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)

### `searchClusterLogs`
<a id='clusterclient-searchclusterlogs'></a>
Searches logs within the specified cluster and time range. Supports pagination and filtering.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `clusterKey` (string) — Cluster key.
- `searchClusterLogsDetails` (model.SearchClusterLogsDetails) — Request body containing the search parameters for cluster logs.

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination](
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination](
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.

**Return Response:** `SearchClusterLogsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.ClusterLogCollection

**Response Fields:**
- `items` (list[ClusterLogsSummary]) — **[Required]** items of this ClusterLogCollection. List of cluster logs. The items of this ClusterLogCollection. list[oci.aidataplatform_dp.models.ClusterLogsSummary]

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)

### `startCluster`
<a id='clusterclient-startcluster'></a>
Starts a cluster that has halted operation.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `clusterKey` (string) — Cluster key.
- `startClusterDetails` (model.StartClusterDetails) — Details of the cluster being started.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `StartClusterResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.Cluster

**Response Fields:**
- `key` (str) — **[Required]** key of this Cluster. Cluster key. The key of this Cluster. str
- `display_name` (str) — **[Required]** display_name of this Cluster. Cluster name. The display_name of this Cluster. str
- `description` (str) — description of this Cluster. Cluster description. The description of this Cluster. str
- `source_api` (str) — source_api of this Cluster. User created clusters are associated with a particular workspace. Default cluster is to be used by all catalogs operations that require compute. Default cluster can be thought of as associated with Master catalog. Agent Flow Compute is used to execute Agent Flows. Allowed values for this property are: "CLUSTER_API", "DEFAULT_CLUSTER_API", "AGENT_FLOW_COMPUTE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The source_api of this Cluster. str
- `type` (str) — type of this Cluster. ClusterType Allowed values for this property are: "USER", "AGENT_FLOW_COMPUTE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The type of this Cluster. str
- `time_created` (datetime) — **[Required]** time_created of this Cluster. Date and time the cluster was created. The time_created of this Cluster. datetime
- `time_updated` (datetime) — time_updated of this Cluster. Date and time the cluster was updated. The time_updated of this Cluster. datetime
- `state` (str) — **[Required]** state of this Cluster. Common lifecycle states for resources in a compute cluster. ACCEPTED - The resource create request has been accepted. CREATING - The resource is being created and might not be usable until the entire metadata is defined. ACTIVE - The resource is valid and available for access. DELETING - The resource is being deleted, and might require a deep clean of any children. DELETED - The resource has been deleted, and isn't available. FAILED - The resource is in a failed state due to validation or other errors. STOPPING - The resource is being stopped. STOPPED - The resource has been stopped. UPDATING - The resource is being updated and might not be usable until all changes are commited. STARTING - The resource is being started. RESTARTING - The resource is being restarted. Allowed values for this property are: "ACCEPTED", "CREATING", "ACTIVE", "DELETING", "DELETED", "FAILED", "STOPPING", "STOPPED", "UPDATING", "RESTARTING", "STARTING", "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS", "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL", "NETWORK_CONFIGURATION_ATTACH_FAILED", "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS", "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL", "NETWORK_CONFIGURATION_DETACH_FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The state of this Cluster. str
- `state_details` (str) — state_details of this Cluster. A message that describes the current state of the workspace cluster in more detail. For example, can be used to provide actionable information for a resource in the Failed state. The state_details of this Cluster. str
- `node_type` (str) — node_type of this Cluster. Cluster node type encodes the node shape and associated resources. The node_type of this Cluster. str
- `driver_config` (DriverConfig) — driver_config of this Cluster. The driver_config of this Cluster. oci.aidataplatform_dp.models.DriverConfig
- `active_cluster_resources` (ActiveClusterResources) — active_cluster_resources of this Cluster. The active_cluster_resources of this Cluster. oci.aidataplatform_dp.models.ActiveClusterResources
- `created_by` (str) — created_by of this Cluster. OCID of the user who created this record. The created_by of this Cluster. str
- `created_by_name` (str) — created_by_name of this Cluster. Name of the user who created this record. The created_by_name of this Cluster. str
- `updated_by` (str) — updated_by of this Cluster. OCID of the user who updated this record. The updated_by of this Cluster. str
- `updated_by_name` (str) — updated_by_name of this Cluster. Name of the user who updated this record. The updated_by_name of this Cluster. str
- `stopped_by` (str) — stopped_by of this Cluster. OCID of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped. The stopped_by of this Cluster. str
- `stopped_by_name` (str) — stopped_by_name of this Cluster. Name of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped. The stopped_by_name of this Cluster. str

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)

### `stopCluster`
<a id='clusterclient-stopcluster'></a>
Stops an active cluster.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `clusterKey` (string) — Cluster key.
- `stopClusterDetails` (model.StopClusterDetails) — Details for stopping the cluster.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `StopClusterResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.Cluster

**Response Fields:**
- `key` (str) — **[Required]** key of this Cluster. Cluster key. The key of this Cluster. str
- `display_name` (str) — **[Required]** display_name of this Cluster. Cluster name. The display_name of this Cluster. str
- `description` (str) — description of this Cluster. Cluster description. The description of this Cluster. str
- `source_api` (str) — source_api of this Cluster. User created clusters are associated with a particular workspace. Default cluster is to be used by all catalogs operations that require compute. Default cluster can be thought of as associated with Master catalog. Agent Flow Compute is used to execute Agent Flows. Allowed values for this property are: "CLUSTER_API", "DEFAULT_CLUSTER_API", "AGENT_FLOW_COMPUTE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The source_api of this Cluster. str
- `type` (str) — type of this Cluster. ClusterType Allowed values for this property are: "USER", "AGENT_FLOW_COMPUTE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The type of this Cluster. str
- `time_created` (datetime) — **[Required]** time_created of this Cluster. Date and time the cluster was created. The time_created of this Cluster. datetime
- `time_updated` (datetime) — time_updated of this Cluster. Date and time the cluster was updated. The time_updated of this Cluster. datetime
- `state` (str) — **[Required]** state of this Cluster. Common lifecycle states for resources in a compute cluster. ACCEPTED - The resource create request has been accepted. CREATING - The resource is being created and might not be usable until the entire metadata is defined. ACTIVE - The resource is valid and available for access. DELETING - The resource is being deleted, and might require a deep clean of any children. DELETED - The resource has been deleted, and isn't available. FAILED - The resource is in a failed state due to validation or other errors. STOPPING - The resource is being stopped. STOPPED - The resource has been stopped. UPDATING - The resource is being updated and might not be usable until all changes are commited. STARTING - The resource is being started. RESTARTING - The resource is being restarted. Allowed values for this property are: "ACCEPTED", "CREATING", "ACTIVE", "DELETING", "DELETED", "FAILED", "STOPPING", "STOPPED", "UPDATING", "RESTARTING", "STARTING", "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS", "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL", "NETWORK_CONFIGURATION_ATTACH_FAILED", "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS", "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL", "NETWORK_CONFIGURATION_DETACH_FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The state of this Cluster. str
- `state_details` (str) — state_details of this Cluster. A message that describes the current state of the workspace cluster in more detail. For example, can be used to provide actionable information for a resource in the Failed state. The state_details of this Cluster. str
- `node_type` (str) — node_type of this Cluster. Cluster node type encodes the node shape and associated resources. The node_type of this Cluster. str
- `driver_config` (DriverConfig) — driver_config of this Cluster. The driver_config of this Cluster. oci.aidataplatform_dp.models.DriverConfig
- `active_cluster_resources` (ActiveClusterResources) — active_cluster_resources of this Cluster. The active_cluster_resources of this Cluster. oci.aidataplatform_dp.models.ActiveClusterResources
- `created_by` (str) — created_by of this Cluster. OCID of the user who created this record. The created_by of this Cluster. str
- `created_by_name` (str) — created_by_name of this Cluster. Name of the user who created this record. The created_by_name of this Cluster. str
- `updated_by` (str) — updated_by of this Cluster. OCID of the user who updated this record. The updated_by of this Cluster. str
- `updated_by_name` (str) — updated_by_name of this Cluster. Name of the user who updated this record. The updated_by_name of this Cluster. str
- `stopped_by` (str) — stopped_by of this Cluster. OCID of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped. The stopped_by of this Cluster. str
- `stopped_by_name` (str) — stopped_by_name of this Cluster. Name of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped. The stopped_by_name of this Cluster. str

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)

### `summarizeMetricsData`
<a id='clusterclient-summarizemetricsdata'></a>
Provides summarized compute metrics for a compute cluster in the given workspace. This API aggregates metric data points based on a specified namespace, metric name, and aggregation type. The response contains computed metric summaries.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `clusterKey` (string) — Cluster key.
- `summarizeMetricsDataDetails` (model.SummarizeMetricsDataDetails) — Request body containing metric parameters.

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.

**Return Response:** `SummarizeMetricsDataResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.SummarizeMetricsResponse

**Response Fields:**
- `results` (list[MetricsSummary]) — **[Required]** results of this SummarizeMetricsResponse. List of computed metric summary results. The results of this SummarizeMetricsResponse. list[oci.aidataplatform_dp.models.MetricsSummary]

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)

### `updateCluster`
<a id='clusterclient-updatecluster'></a>
Update the details of a given cluster.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `clusterKey` (string) — Cluster key.
- `updateClusterDetails` (model.UpdateAgentFlowComputeDetails| model.UpdateSparkClusterDetails) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `UpdateClusterResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.Cluster

**Response Fields:**
- `key` (str) — **[Required]** key of this Cluster. Cluster key. The key of this Cluster. str
- `display_name` (str) — **[Required]** display_name of this Cluster. Cluster name. The display_name of this Cluster. str
- `description` (str) — description of this Cluster. Cluster description. The description of this Cluster. str
- `source_api` (str) — source_api of this Cluster. User created clusters are associated with a particular workspace. Default cluster is to be used by all catalogs operations that require compute. Default cluster can be thought of as associated with Master catalog. Agent Flow Compute is used to execute Agent Flows. Allowed values for this property are: "CLUSTER_API", "DEFAULT_CLUSTER_API", "AGENT_FLOW_COMPUTE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The source_api of this Cluster. str
- `type` (str) — type of this Cluster. ClusterType Allowed values for this property are: "USER", "AGENT_FLOW_COMPUTE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The type of this Cluster. str
- `time_created` (datetime) — **[Required]** time_created of this Cluster. Date and time the cluster was created. The time_created of this Cluster. datetime
- `time_updated` (datetime) — time_updated of this Cluster. Date and time the cluster was updated. The time_updated of this Cluster. datetime
- `state` (str) — **[Required]** state of this Cluster. Common lifecycle states for resources in a compute cluster. ACCEPTED - The resource create request has been accepted. CREATING - The resource is being created and might not be usable until the entire metadata is defined. ACTIVE - The resource is valid and available for access. DELETING - The resource is being deleted, and might require a deep clean of any children. DELETED - The resource has been deleted, and isn't available. FAILED - The resource is in a failed state due to validation or other errors. STOPPING - The resource is being stopped. STOPPED - The resource has been stopped. UPDATING - The resource is being updated and might not be usable until all changes are commited. STARTING - The resource is being started. RESTARTING - The resource is being restarted. Allowed values for this property are: "ACCEPTED", "CREATING", "ACTIVE", "DELETING", "DELETED", "FAILED", "STOPPING", "STOPPED", "UPDATING", "RESTARTING", "STARTING", "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS", "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL", "NETWORK_CONFIGURATION_ATTACH_FAILED", "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS", "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL", "NETWORK_CONFIGURATION_DETACH_FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The state of this Cluster. str
- `state_details` (str) — state_details of this Cluster. A message that describes the current state of the workspace cluster in more detail. For example, can be used to provide actionable information for a resource in the Failed state. The state_details of this Cluster. str
- `node_type` (str) — node_type of this Cluster. Cluster node type encodes the node shape and associated resources. The node_type of this Cluster. str
- `driver_config` (DriverConfig) — driver_config of this Cluster. The driver_config of this Cluster. oci.aidataplatform_dp.models.DriverConfig
- `active_cluster_resources` (ActiveClusterResources) — active_cluster_resources of this Cluster. The active_cluster_resources of this Cluster. oci.aidataplatform_dp.models.ActiveClusterResources
- `created_by` (str) — created_by of this Cluster. OCID of the user who created this record. The created_by of this Cluster. str
- `created_by_name` (str) — created_by_name of this Cluster. Name of the user who created this record. The created_by_name of this Cluster. str
- `updated_by` (str) — updated_by of this Cluster. OCID of the user who updated this record. The updated_by of this Cluster. str
- `updated_by_name` (str) — updated_by_name of this Cluster. Name of the user who updated this record. The updated_by_name of this Cluster. str
- `stopped_by` (str) — stopped_by of this Cluster. OCID of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped. The stopped_by of this Cluster. str
- `stopped_by_name` (str) — stopped_by_name of this Cluster. Name of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped. The stopped_by_name of this Cluster. str

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)

## Credentials (`CredentialsClient`)
<a id='credentialsclient-client'></a>
**Operations:**
- [`createCredential`](#credentialsclient-createcredential)
- [`deleteCredential`](#credentialsclient-deletecredential)
- [`getCredential`](#credentialsclient-getcredential)
- [`listCredentials`](#credentialsclient-listcredentials)
- [`updateCredential`](#credentialsclient-updatecredential)

### `createCredential`
<a id='credentialsclient-createcredential'></a>
Creates a new credential object with the provided details. The operation completes synchronously; callers can invoke list or get to retrieve the resource payload.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `createDataLakeCredentialDetails` (model.CreateDataLakeCredentialDetails) — Details for the new credential object. When the internal flag is enabled, callers must supply a {@code namespace} value of {@code default} or {@code user_settings} in the payload.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `CreateCredentialResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Credentials (`CredentialsClient`)](#credentialsclient-client) • [Top](#top)

### `deleteCredential`
<a id='credentialsclient-deletecredential'></a>
Deletes a credential object. The operation completes synchronously without a response body.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `credentialKey` (string) — The unique identifier of an credential

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `DeleteCredentialResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Credentials (`CredentialsClient`)](#credentialsclient-client) • [Top](#top)

### `getCredential`
<a id='credentialsclient-getcredential'></a>
Gets detailed information about credential with a given credential key.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `credentialKey` (string) — The unique identifier of an credential

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `GetCredentialResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.Credential

**Response Fields:**
- `key` (str) — **[Required]** key of this Credential. The unique identifier for the credential object. The key of this Credential. str
- `display_name` (str) — **[Required]** display_name of this Credential. A user-friendly name for the credential object. This value does not have to be unique and can be changed. Must start with a letter and contain only letters, numbers, or underscores. Avoid entering confidential information. The display_name of this Credential. str
- `type` (str) — type of this Credential. The type of credential stored. Allowed values are defined in CredentialType. Allowed values for this property are: "SECRET_TOKEN", "VAULT_REFERENCE", "SERVICE_ACCOUNT", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The type of this Credential. str
- `credential_details` (CredentialDetails) — credential_details of this Credential. The credential_details of this Credential. oci.aidataplatform_dp.models.CredentialDetails
- `credential_description` (str) — credential_description of this Credential. A brief summary of the credential object and its purpose. The credential_description of this Credential. str
- `lifecycle_state` (str) — lifecycle_state of this Credential. The current state of the credential object. Allowed values are defined in CredentialLifecycleState. Allowed values for this property are: "ACTIVE", "CREATING", "UPDATING", "DELETING", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The lifecycle_state of this Credential. str
- `lifecycle_state_details` (str) — lifecycle_state_details of this Credential. Additional details or reasons regarding the current lifecycle state. Often used to provide actionable information (e.g., for resources in a Failed state). The lifecycle_state_details of this Credential. str
- `time_created` (datetime) — time_created of this Credential. The date and time when the credential object was created, in RFC 3339 timestamp format. The time_created of this Credential. datetime
- `time_updated` (datetime) — time_updated of this Credential. The date and time when the credential object was most recently updated, in RFC 3339 timestamp format. The time_updated of this Credential. datetime
- `created_by` (str) — created_by of this Credential. The unique identifier of the user who created the credential object. The created_by of this Credential. str
- `updated_by` (str) — updated_by of this Credential. The unique identifier of the user who last updated the credential object. The updated_by of this Credential. str

**Return:** [Back to Credentials (`CredentialsClient`)](#credentialsclient-client) • [Top](#top)

### `listCredentials`
<a id='credentialsclient-listcredentials'></a>
Returns a list of credentials.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `displayName` (string) — A filter to return only resources that match the given display name exactly.
- `displayNameContains` (string) — A filter to return only resources whose displayName contains the provided value (case-insensitive).
- `lifecycleState` (string) — A filter to return only resources whose lifecycleState matches the provided value.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination](
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination](
- `sortOrder` (model.SortOrder) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (ListCredentialsRequest.SortBy) — The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending.
- `credentialType` (model.CredentialType) — The type of the Credential
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `ListCredentialsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.CredentialCollection

**Response Fields:**
- `items` (list[CredentialSummary]) — **[Required]** items of this CredentialCollection. List of credential summaries. The items of this CredentialCollection. list[oci.aidataplatform_dp.models.CredentialSummary]

**Return:** [Back to Credentials (`CredentialsClient`)](#credentialsclient-client) • [Top](#top)

### `updateCredential`
<a id='credentialsclient-updatecredential'></a>
Updates a credential object. The operation completes synchronously; callers can invoke get to confirm the latest state.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `credentialKey` (string) — The unique identifier of an credential
- `updateDataLakeCredentialDetails` (model.UpdateDataLakeCredentialDetails) — The information to be updated.

**Optional Parameters:**
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `UpdateCredentialResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Credentials (`CredentialsClient`)](#credentialsclient-client) • [Top](#top)

## Delta Share (`DeltaShareClient`)
<a id='deltashareclient-client'></a>
**Operations:**
- [`createRecipient`](#deltashareclient-createrecipient)
- [`createShare`](#deltashareclient-createshare)
- [`deleteRecipient`](#deltashareclient-deleterecipient)
- [`deleteShare`](#deltashareclient-deleteshare)
- [`getRecipient`](#deltashareclient-getrecipient)
- [`getShare`](#deltashareclient-getshare)
- [`listRecipientPermissions`](#deltashareclient-listrecipientpermissions)
- [`listRecipientShares`](#deltashareclient-listrecipientshares)
- [`listRecipients`](#deltashareclient-listrecipients)
- [`listShareDataAssets`](#deltashareclient-listsharedataassets)
- [`listSharePermissions`](#deltashareclient-listsharepermissions)
- [`listShareRecipients`](#deltashareclient-listsharerecipients)
- [`listShares`](#deltashareclient-listshares)
- [`manageRecipientPermission`](#deltashareclient-managerecipientpermission)
- [`manageShareAccess`](#deltashareclient-manageshareaccess)
- [`manageShareDataAsset`](#deltashareclient-managesharedataasset)
- [`manageSharePermission`](#deltashareclient-managesharepermission)
- [`updateRecipient`](#deltashareclient-updaterecipient)
- [`updateShare`](#deltashareclient-updateshare)

### `createRecipient`
<a id='deltashareclient-createrecipient'></a>
Creates a recipient for a Delta Share protocol in AI Data Platform Workbench.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `createRecipientDetails` (model.CreateRecipientDetails) — Details for the new recipient for Delta Share protocol in AI Data Platform Workbench.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `CreateRecipientResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.Recipient

**Response Fields:**
- `key` (str) — **[Required]** key of this Recipient. Unique identifier for this recipient in AI Data Platform Workbench instance. The key of this Recipient. str
- `display_name` (str) — **[Required]** display_name of this Recipient. A user-friendly name. Has to be unique within the AI Data Platform Workbench instance. The display_name of this Recipient. str
- `description` (str) — description of this Recipient. Short description of the Recipient The description of this Recipient. str
- `time_created` (datetime) — **[Required]** time_created of this Recipient. The date and time the Delta Share recipient was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2016-08-25T21:10:29.600Z The time_created of this Recipient. datetime
- `time_updated` (datetime) — time_updated of this Recipient. The date and time the Delta Share recipient was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2016-08-25T21:10:29.600Z The time_updated of this Recipient. datetime
- `share_count` (int) — **[Required]** share_count of this Recipient. The number of shares this recipient has access on. The share_count of this Recipient. int
- `created_by` (str) — **[Required]** created_by of this Recipient. The ID of the user who created the recipient. The created_by of this Recipient. str
- `updated_by` (str) — updated_by of this Recipient. The ID of the user who last updated the recipient. The updated_by of this Recipient. str
- `properties` (dict(str, str)) — properties of this Recipient. Key-value pair representing a defined tag key and value. Example: { "CostCenter": "42" } The properties of this Recipient. dict(str, str)
- `lifecycle_state` (str) — **[Required]** lifecycle_state of this Recipient. The state of the recipient. Allowed values for this property are: "ACTIVE", "INACTIVE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The lifecycle_state of this Recipient. str
- `lifecycle_state_details` (str) — lifecycle_state_details of this Recipient. A message describing the current state in more detail. The lifecycle_state_details of this Recipient. str

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)

### `createShare`
<a id='deltashareclient-createshare'></a>
Create a Delta Share protocol in AI Data Platform Workbench.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `createShareDetails` (model.CreateShareDetails) — Details for the new share for Delta Share protocol in AI Data Platform Workbench.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `CreateShareResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.Share

**Response Fields:**
- `key` (str) — **[Required]** key of this Share. Unique identifier for this share in AI Data Platform Workbench instance. The key of this Share. str
- `display_name` (str) — **[Required]** display_name of this Share. A user-friendly name. Has to be unique within the AI Data Platform Workbench instance. The display_name of this Share. str
- `description` (str) — description of this Share. A description associated with this share. The description of this Share. str
- `time_created` (datetime) — **[Required]** time_created of this Share. The date and time the Delta Share was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2016-08-25T21:10:29.600Z The time_created of this Share. datetime
- `time_updated` (datetime) — time_updated of this Share. The date and time the Delta Share was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2016-08-25T21:10:29.600Z The time_updated of this Share. datetime
- `created_by` (str) — **[Required]** created_by of this Share. The ID of the user who created the share. The created_by of this Share. str
- `updated_by` (str) — updated_by of this Share. The ID of the user who last updated the share. The updated_by of this Share. str
- `recipient_count` (int) — **[Required]** recipient_count of this Share. The number of recipients who have access on this share. The recipient_count of this Share. int
- `asset_count` (int) — asset_count of this Share. The number of assets in this share. The asset_count of this Share. int
- `lifecycle_state` (str) — lifecycle_state of this Share. The state of the Share. Allowed values for this property are: "ACTIVE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The lifecycle_state of this Share. str
- `lifecycle_state_details` (str) — lifecycle_state_details of this Share. A message describing the current state in more detail. The lifecycle_state_details of this Share. str

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)

### `deleteRecipient`
<a id='deltashareclient-deleterecipient'></a>
Deletes a Delta Share recipient from an AI Data Platform Workbench.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `recipientKey` (string) — The key of the recipient resource

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `DeleteRecipientResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)

### `deleteShare`
<a id='deltashareclient-deleteshare'></a>
Deletes a Delta Share from an AI Data Platform Workbench.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `shareKey` (string) — The unique key of the Share.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `DeleteShareResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)

### `getRecipient`
<a id='deltashareclient-getrecipient'></a>
Gets detailed information about a Delta Share recipient in an AI Data Platform Workbench instance.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `recipientKey` (string) — The key of the recipient resource

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `GetRecipientResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.Recipient

**Response Fields:**
- `key` (str) — **[Required]** key of this Recipient. Unique identifier for this recipient in AI Data Platform Workbench instance. The key of this Recipient. str
- `display_name` (str) — **[Required]** display_name of this Recipient. A user-friendly name. Has to be unique within the AI Data Platform Workbench instance. The display_name of this Recipient. str
- `description` (str) — description of this Recipient. Short description of the Recipient The description of this Recipient. str
- `time_created` (datetime) — **[Required]** time_created of this Recipient. The date and time the Delta Share recipient was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2016-08-25T21:10:29.600Z The time_created of this Recipient. datetime
- `time_updated` (datetime) — time_updated of this Recipient. The date and time the Delta Share recipient was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2016-08-25T21:10:29.600Z The time_updated of this Recipient. datetime
- `share_count` (int) — **[Required]** share_count of this Recipient. The number of shares this recipient has access on. The share_count of this Recipient. int
- `created_by` (str) — **[Required]** created_by of this Recipient. The ID of the user who created the recipient. The created_by of this Recipient. str
- `updated_by` (str) — updated_by of this Recipient. The ID of the user who last updated the recipient. The updated_by of this Recipient. str
- `properties` (dict(str, str)) — properties of this Recipient. Key-value pair representing a defined tag key and value. Example: { "CostCenter": "42" } The properties of this Recipient. dict(str, str)
- `lifecycle_state` (str) — **[Required]** lifecycle_state of this Recipient. The state of the recipient. Allowed values for this property are: "ACTIVE", "INACTIVE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The lifecycle_state of this Recipient. str
- `lifecycle_state_details` (str) — lifecycle_state_details of this Recipient. A message describing the current state in more detail. The lifecycle_state_details of this Recipient. str

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)

### `getShare`
<a id='deltashareclient-getshare'></a>
Gets detailed information about a Delta Share.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `shareKey` (string) — The unique key of the Share.

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `GetShareResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.Share

**Response Fields:**
- `key` (str) — **[Required]** key of this Share. Unique identifier for this share in AI Data Platform Workbench instance. The key of this Share. str
- `display_name` (str) — **[Required]** display_name of this Share. A user-friendly name. Has to be unique within the AI Data Platform Workbench instance. The display_name of this Share. str
- `description` (str) — description of this Share. A description associated with this share. The description of this Share. str
- `time_created` (datetime) — **[Required]** time_created of this Share. The date and time the Delta Share was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2016-08-25T21:10:29.600Z The time_created of this Share. datetime
- `time_updated` (datetime) — time_updated of this Share. The date and time the Delta Share was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2016-08-25T21:10:29.600Z The time_updated of this Share. datetime
- `created_by` (str) — **[Required]** created_by of this Share. The ID of the user who created the share. The created_by of this Share. str
- `updated_by` (str) — updated_by of this Share. The ID of the user who last updated the share. The updated_by of this Share. str
- `recipient_count` (int) — **[Required]** recipient_count of this Share. The number of recipients who have access on this share. The recipient_count of this Share. int
- `asset_count` (int) — asset_count of this Share. The number of assets in this share. The asset_count of this Share. int
- `lifecycle_state` (str) — lifecycle_state of this Share. The state of the Share. Allowed values for this property are: "ACTIVE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The lifecycle_state of this Share. str
- `lifecycle_state_details` (str) — lifecycle_state_details of this Share. A message describing the current state in more detail. The lifecycle_state_details of this Share. str

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)

### `listRecipientPermissions`
<a id='deltashareclient-listrecipientpermissions'></a>
Gets a detailed list of Delta Share recipient permissions.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `recipientKey` (string) — The key of the recipient resource

**Optional Parameters:**
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination](
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination](
- `sortOrder` (model.SortOrder) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (ListRecipientPermissionsRequest.SortBy) — The field to sort by. Default order for {@code grantee} is ascending.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `ListRecipientPermissionsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.RecipientPermissionCollection

**Response Fields:**
- `items` (list[RecipientPermissionSummary]) — **[Required]** items of this RecipientPermissionCollection. List of recipient permissions. The items of this RecipientPermissionCollection. list[oci.aidataplatform_dp.models.RecipientPermissionSummary]

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)

### `listRecipientShares`
<a id='deltashareclient-listrecipientshares'></a>
Returns a list of Delta Shares that the specified recipient has been granted access to.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `recipientKey` (string) — The key of the recipient resource

**Optional Parameters:**
- `displayName` (string) — A filter to return only resources that match the given display name exactly.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination](
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination](
- `sortOrder` (model.SortOrder) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (ListRecipientSharesRequest.SortBy) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `ListRecipientSharesResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.ShareCollection

**Response Fields:**
- `items` (list[ShareSummary]) — **[Required]** items of this ShareCollection. List of Shares. The items of this ShareCollection. list[oci.aidataplatform_dp.models.ShareSummary]

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)

### `listRecipients`
<a id='deltashareclient-listrecipients'></a>
Gets a list of Delta Share recipients in a AI Data Platform Workbench instance.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `displayName` (string) — A filter to return only resources that match the given display name exactly.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination](
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination](
- `sortOrder` (model.SortOrder) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (ListRecipientsRequest.SortBy) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `ListRecipientsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.RecipientCollection

**Response Fields:**
- `items` (list[RecipientSummary]) — **[Required]** items of this RecipientCollection. List of recipients. The items of this RecipientCollection. list[oci.aidataplatform_dp.models.RecipientSummary]

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)

### `listShareDataAssets`
<a id='deltashareclient-listsharedataassets'></a>
Gets a list of Delta Shares assets in an AI Data Platform Workbench instance.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `shareKey` (string) — The unique key of the Share.

**Optional Parameters:**
- `displayName` (string) — A filter to return only resources that match the given display name exactly.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination](
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination](
- `sortOrder` (model.SortOrder) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (ListShareDataAssetsRequest.SortBy) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `ListShareDataAssetsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.ShareDataAssetCollection

**Response Fields:**
- `items` (list[ShareDataAssetSummary]) — **[Required]** items of this ShareDataAssetCollection. List of Shares assets. The items of this ShareDataAssetCollection. list[oci.aidataplatform_dp.models.ShareDataAssetSummary]

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)

### `listSharePermissions`
<a id='deltashareclient-listsharepermissions'></a>
Returns a list of Delta Shares that the specified recipient has been granted access to.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `shareKey` (string) — The unique key of the Share.

**Optional Parameters:**
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination](
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination](
- `sortOrder` (model.SortOrder) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (ListSharePermissionsRequest.SortBy) — The field to sort by. You can provide only one sort order. Default order for {@code grantee} is ascending. Default order for {@code granteeType} is ascending.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `ListSharePermissionsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.SharePermissionCollection

**Response Fields:**
- `items` (list[SharePermissionSummary]) — **[Required]** items of this SharePermissionCollection. List of share permissions. The items of this SharePermissionCollection. list[oci.aidataplatform_dp.models.SharePermissionSummary]

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)

### `listShareRecipients`
<a id='deltashareclient-listsharerecipients'></a>
Gets a list of recipients that have been given access on the specified Delta Share.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `shareKey` (string) — The unique key of the Share.

**Optional Parameters:**
- `displayName` (string) — A filter to return only resources that match the given display name exactly.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination](
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination](
- `sortOrder` (model.SortOrder) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (ListShareRecipientsRequest.SortBy) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `ListShareRecipientsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.RecipientCollection

**Response Fields:**
- `items` (list[RecipientSummary]) — **[Required]** items of this RecipientCollection. List of recipients. The items of this RecipientCollection. list[oci.aidataplatform_dp.models.RecipientSummary]

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)

### `listShares`
<a id='deltashareclient-listshares'></a>
Gets a list of Delta Shares in an AI Data Platform Workbench instance.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `displayName` (string) — A filter to return only resources that match the given display name exactly.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination](
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination](
- `sortOrder` (model.SortOrder) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (ListSharesRequest.SortBy) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `ListSharesResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.ShareCollection

**Response Fields:**
- `items` (list[ShareSummary]) — **[Required]** items of this ShareCollection. List of Shares. The items of this ShareCollection. list[oci.aidataplatform_dp.models.ShareSummary]

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)

### `manageRecipientPermission`
<a id='deltashareclient-managerecipientpermission'></a>
Updates the permissions of a Delta Share recipient in AI Data Platform Workbench.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `recipientKey` (string) — The key of the recipient resource
- `manageRecipientPermissionDetails` (model.ManageRecipientPermissionDetails) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `ManageRecipientPermissionResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)

### `manageShareAccess`
<a id='deltashareclient-manageshareaccess'></a>
Updates consumer-side access on a share for a recipient. A provider user can grant or revoke access on a particular share for a given recipient.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `shareKey` (string) — The unique key of the Share.
- `manageShareAccessDetails` (model.ManageShareAccessDetails) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `ManageShareAccessResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)

### `manageShareDataAsset`
<a id='deltashareclient-managesharedataasset'></a>
Updates data assets on a Delta Share with the provided information.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `shareKey` (string) — The unique key of the Share.
- `manageShareDataAssetDetails` (model.ManageShareDataAssetDetails) — The Delta Share data asset information to be updated.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `ManageShareDataAssetResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)

### `manageSharePermission`
<a id='deltashareclient-managesharepermission'></a>
Updates permissions on a Delta Share.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `shareKey` (string) — The unique key of the Share.
- `manageSharePermissionDetails` (model.ManageSharePermissionDetails) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `ManageSharePermissionResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)

### `updateRecipient`
<a id='deltashareclient-updaterecipient'></a>
Updates the metadata of a Delta Share recipient in a AI Data Platform Workbench instance.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `recipientKey` (string) — The key of the recipient resource
- `updateRecipientDetails` (model.UpdateRecipientDetails) — The information to be updated for a recipient.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `UpdateRecipientResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)

### `updateShare`
<a id='deltashareclient-updateshare'></a>
Update a Delta Share with the provided metadata.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `shareKey` (string) — The unique key of the Share.
- `updateShareDetails` (model.UpdateShareDetails) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `UpdateShareResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)

## Git (`GitClient`)
<a id='gitclient-client'></a>
**Operations:**
- [`checkoutBranch`](#gitclient-checkoutbranch)
- [`commitPushGitRepository`](#gitclient-commitpushgitrepository)
- [`createGitBranch`](#gitclient-creategitbranch)
- [`getGitDiffDetail`](#gitclient-getgitdiffdetail)
- [`getGitOperationState`](#gitclient-getgitoperationstate)
- [`getGitRepository`](#gitclient-getgitrepository)
- [`listGitBranches`](#gitclient-listgitbranches)
- [`listGitDiffs`](#gitclient-listgitdiffs)
- [`mergeGitRepository`](#gitclient-mergegitrepository)
- [`pullGitRepository`](#gitclient-pullgitrepository)
- [`rebaseGitRepository`](#gitclient-rebasegitrepository)
- [`resetGitFolderState`](#gitclient-resetgitfolderstate)
- [`resetGitRepository`](#gitclient-resetgitrepository)
- [`resolveGitConflicts`](#gitclient-resolvegitconflicts)
- [`updateGitRepository`](#gitclient-updategitrepository)

### `checkoutBranch`
<a id='gitclient-checkoutbranch'></a>
(Preview) Checks out a remote branch into the specified workspace folder, ensuring the worktree tracks the requested branch HEAD.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `gitRepositoryKey` (string) — The Git repository key.
- `checkoutBranchDetails` (model.CheckoutBranchDetails) — Details for the new branch.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `CheckoutBranchResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.GitBranch

**Response Fields:**
- `branch_name` (str) — **[Required]** branch_name of this GitBranch. The name of the Git branch. The branch_name of this GitBranch. str
- `git_url` (str) — **[Required]** git_url of this GitBranch. The Git repository URL corresponding to the branch. The git_url of this GitBranch. str
- `error_message` (str) — error_message of this GitBranch. Git error message. The error_message of this GitBranch. str
- `std_out` (str) — std_out of this GitBranch. Git STDOUT message. The std_out of this GitBranch. str
- `std_err` (str) — std_err of this GitBranch. Git STDERR message. The std_err of this GitBranch. str
- `git_exit_code` (int) — git_exit_code of this GitBranch. Git exit status. The git_exit_code of this GitBranch. int

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)

### `commitPushGitRepository`
<a id='gitclient-commitpushgitrepository'></a>
(Preview) Stages selected workspace updates, creates a commit, and pushes it upstream so automation can sync with Git providers.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `gitRepositoryKey` (string) — The Git repository key.
- `commitPushDetails` (model.CommitPushDetails) — Commit details.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.

**Return Response:** `CommitPushGitRepositoryResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)

### `createGitBranch`
<a id='gitclient-creategitbranch'></a>
(Preview) Creates a new branch in the connected repo so teams can stage changes in isolated workspaces.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `gitRepositoryKey` (string) — The Git repository key.
- `createGitBranchDetails` (model.CreateGitBranchDetails) — Details for the new Workspace Object.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `CreateGitBranchResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.CreateGitBranch

**Response Fields:**
- `branch_name` (str) — **[Required]** branch_name of this GitBranch. The name of the Git branch. The branch_name of this GitBranch. str
- `git_url` (str) — **[Required]** git_url of this GitBranch. The Git repository URL corresponding to the branch. The git_url of this GitBranch. str
- `error_message` (str) — error_message of this GitBranch. Git error message. The error_message of this GitBranch. str
- `std_out` (str) — std_out of this GitBranch. Git STDOUT message. The std_out of this GitBranch. str
- `std_err` (str) — std_err of this GitBranch. Git STDERR message. The std_err of this GitBranch. str
- `git_exit_code` (int) — git_exit_code of this GitBranch. Git exit status. The git_exit_code of this GitBranch. int

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)

### `getGitDiffDetail`
<a id='gitclient-getgitdiffdetail'></a>
(Preview) Returns a unified diff patch for a specific file so editors and review panes can render inline changes.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `gitRepositoryKey` (string) — The Git repository key.
- `gitFolderPath` (string) — The Git folder path.
- `branchName` (string) — Expected branch name for the folder context.
- `gitFilePath` (string) — File path relative to repository root.

**Optional Parameters:**
- `contextLines` (number) — Number of context lines to include in the diff.
- `maxPatchBytes` (number) — Maximum number of bytes of diff output to return.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `GetGitDiffDetailResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.GitDiffDetail

**Response Fields:**
- `git_file_path` (str) — **[Required]** git_file_path of this GitDiffDetail. File path relative to repository root. The git_file_path of this GitDiffDetail. str
- `is_conflict` (bool) — is_conflict of this GitDiffDetail. Indicates whether the file is currently in a conflicted state. The is_conflict of this GitDiffDetail. bool
- `is_binary` (bool) — is_binary of this GitDiffDetail. Indicates whether the file is binary. The is_binary of this GitDiffDetail. bool
- `patch` (str) — patch of this GitDiffDetail. Unified diff patch text. The patch of this GitDiffDetail. str
- `is_truncated` (bool) — is_truncated of this GitDiffDetail. Indicates whether the diff output was truncated. The is_truncated of this GitDiffDetail. bool
- `truncated_reason` (str) — truncated_reason of this GitDiffDetail. Indicates the reason for the truncated diff to be returned. Allowed values for this property are: "MAX_PATCH_BYTES", "BINARY", "TOO_LARGE", "UNKNOWN", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The truncated_reason of this GitDiffDetail. str

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)

### `getGitOperationState`
<a id='gitclient-getgitoperationstate'></a>
(Preview) Returns the current Git worktree status—including in-progress operations or detached HEAD indicators—for the workspace folder.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `gitRepositoryKey` (string) — The Git repository key.

**Optional Parameters:**
- `operationName` (string) — Optional operation the caller intends to perform (for example PULL, PUSH, RESET, CHECKOUT).
- `branchName` (string) — Expected branch name for the folder context.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `GetGitOperationStateResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.GitOperationState

**Response Fields:**
- `git_folder_path` (str) — **[Required]** git_folder_path of this GitOperationState. Folder path used to locate the Git worktree. The git_folder_path of this GitOperationState. str
- `state` (str) — **[Required]** state of this GitOperationState. Current Git operation state detected. Allowed values for this property are: "CLEAN", "MERGE_IN_PROGRESS", "REBASE_IN_PROGRESS", "PULL_IN_PROGRESS", "DETACHED_HEAD", "UNKNOWN", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The state of this GitOperationState. str
- `is_blocking` (bool) — **[Required]** is_blocking of this GitOperationState. Whether the detected state blocks typical write operations. The is_blocking of this GitOperationState. bool
- `is_allowed` (bool) — **[Required]** is_allowed of this GitOperationState. Whether the requested operation is allowed in the current state. If operationName is not provided, this indicates if the repository is in a generally safe state. The is_allowed of this GitOperationState. bool
- `message` (str) — message of this GitOperationState. Human-readable hint for UI display. The message of this GitOperationState. str
- `current_branch` (str) — current_branch of this GitOperationState. Current branch name. Empty if detached HEAD. The current_branch of this GitOperationState. str
- `head_commit_id` (str) — head_commit_id of this GitOperationState. Full commit ID of HEAD. The head_commit_id of this GitOperationState. str
- `is_detached` (bool) — is_detached of this GitOperationState. Whether HEAD is detached. The is_detached of this GitOperationState. bool
- `have_conflicts` (bool) — have_conflicts of this GitOperationState. Indicates if unmerged/conflicted files exist. This does not include file names. The have_conflicts of this GitOperationState. bool
- `time_checked` (datetime) — time_checked of this GitOperationState. Time when the state was computed. The time_checked of this GitOperationState. datetime

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)

### `getGitRepository`
<a id='gitclient-getgitrepository'></a>
(Preview) Returns repository metadata, credential references, and workspace linkage for a specific AI Data Platform Git repository.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `gitRepositoryKey` (string) — The Git repository key.

**Optional Parameters:**
- `shouldIncludeCredentialKey` (boolean) — A flag to include credential key in response. If 'true', credential key will be returned in response. Default 'false'.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `GetGitRepositoryResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.GitRepository

**Response Fields:**
- `key` (str) — **[Required]** key of this GitRepository. Unique key associated with repository. The key of this GitRepository. str
- `workspace_key` (str) — **[Required]** workspace_key of this GitRepository. The workspaceKey associated with the Git repository. The workspace_key of this GitRepository. str
- `branch_name` (str) — **[Required]** branch_name of this GitRepository. The name of the Git branch. The branch_name of this GitRepository. str
- `git_url` (str) — **[Required]** git_url of this GitRepository. The Git repository url corresponding to the branch. The git_url of this GitRepository. str
- `git_folder_path` (str) — **[Required]** git_folder_path of this GitRepository. The path of the current Git folder which has to be created for the new branch. The git_folder_path of this GitRepository. str
- `credential_key` (str) — credential_key of this GitRepository. The credential setting key The credential_key of this GitRepository. str

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)

### `listGitBranches`
<a id='gitclient-listgitbranches'></a>
(Preview) Returns branch summaries with optional display-name filters and pagination, so UIs can show branch pickers and search results.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `gitRepositoryKey` (string) — The Git repository key.

**Optional Parameters:**
- `displayName` (string) — A filter to return only resources that match the given display name exactly.
- `displayNameContains` (string) — A filter to return only resources that have a display name containing the text provided.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination](
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination](
- `sortOrder` (model.SortOrder) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (ListGitBranchesRequest.SortBy) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `ListGitBranchesResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.GitBranchCollection

**Response Fields:**
- `items` (list[GitBranchSummary]) — **[Required]** items of this GitBranchCollection. List of Git branches. The items of this GitBranchCollection. list[oci.aidataplatform_dp.models.GitBranchSummary]

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)

### `listGitDiffs`
<a id='gitclient-listgitdiffs'></a>
(Preview) Returns file-level diff summaries for the workspace branch, enabling UI views of changed files or conflicts without heavy payloads.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `gitRepositoryKey` (string) — The Git repository key.
- `gitFolderPath` (string) — The Git folder path.
- `branchName` (string) — Expected branch name for the folder context.

**Optional Parameters:**
- `compareTo` (ListGitDiffsRequest.CompareTo) — Determines which reference is used for computing diffs.
- `filter` (ListGitDiffsRequest.Filter) — Filter which files are returned.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination](
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination](
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `sortOrder` (model.SortOrder) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (ListGitDiffsRequest.SortBy) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `displayName` (string) — A filter to return only resources that match the given display name exactly.

**Return Response:** `ListGitDiffsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.GitDiffSummaryCollection

**Response Fields:**
- `items` (list[GitDiffSummary]) — **[Required]** items of this GitDiffSummaryCollection. List of Git diff summaries. The items of this GitDiffSummaryCollection. list[oci.aidataplatform_dp.models.GitDiffSummary]

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)

### `mergeGitRepository`
<a id='gitclient-mergegitrepository'></a>
(Preview) Applies the requested branch or commit onto the workspace branch to preview integration changes before pushing.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `gitRepositoryKey` (string) — The Git repository key.
- `gitMergeDetails` (model.GitMergeDetails) — Folder/branch details to merge.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `MergeGitRepositoryResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)

### `pullGitRepository`
<a id='gitclient-pullgitrepository'></a>
(Preview) Performs a Git pull for the workspace branch so developers can sync local files with the latest upstream commits.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `gitRepositoryKey` (string) — The Git repository key.
- `gitPullDetails` (model.GitPullDetails) — Folder/branch details to pull.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `PullGitRepositoryResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)

### `rebaseGitRepository`
<a id='gitclient-rebasegitrepository'></a>
(Preview) Rebases the workspace branch on top of another commit or branch to linearize history and resolve drift.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `gitRepositoryKey` (string) — The Git repository key.
- `gitRebaseDetails` (model.GitRebaseDetails) — Details needed to perform rebase operation.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `RebaseGitRepositoryResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)

### `resetGitFolderState`
<a id='gitclient-resetgitfolderstate'></a>
(Preview) Halts in-progress Git operations and discards local changes in the workspace folder to regain a clean state.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `gitRepositoryKey` (string) — The Git repository key.
- `resetGitFolderStateDetails` (model.ResetGitFolderStateDetails) — Merge conflict resolution details.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.

**Return Response:** `ResetGitFolderStateResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)

### `resetGitRepository`
<a id='gitclient-resetgitrepository'></a>
(Preview) Performs a Git reset so the workspace branch matches the specified commit, discarding newer local commits.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `gitRepositoryKey` (string) — The Git repository key.
- `gitResetDetails` (model.GitResetDetails) — Details needed to perform Git reset operation.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `ResetGitRepositoryResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)

### `resolveGitConflicts`
<a id='gitclient-resolvegitconflicts'></a>
(Preview) Accepts conflict resolution instructions—choose source or target versions—and records the resolution back to the repo.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `gitRepositoryKey` (string) — The Git repository key.
- `conflictResolveDetails` (model.ConflictResolveDetails) — Conflict resolution details.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.

**Return Response:** `ResolveGitConflictsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.GitBranch

**Response Fields:**
- `branch_name` (str) — **[Required]** branch_name of this GitBranch. The name of the Git branch. The branch_name of this GitBranch. str
- `git_url` (str) — **[Required]** git_url of this GitBranch. The Git repository URL corresponding to the branch. The git_url of this GitBranch. str
- `error_message` (str) — error_message of this GitBranch. Git error message. The error_message of this GitBranch. str
- `std_out` (str) — std_out of this GitBranch. Git STDOUT message. The std_out of this GitBranch. str
- `std_err` (str) — std_err of this GitBranch. Git STDERR message. The std_err of this GitBranch. str
- `git_exit_code` (int) — git_exit_code of this GitBranch. Git exit status. The git_exit_code of this GitBranch. int

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)

### `updateGitRepository`
<a id='gitclient-updategitrepository'></a>
(Preview) Updates stored repository details—such as credentials or default branches—so automation stays aligned with your source control.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `updateGitRepositoryDetails` (model.UpdateGitRepositoryDetails) — The information to be updated.
- `gitRepositoryKey` (string) — The Git repository key.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `UpdateGitRepositoryResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)

## Ml Ops (`MLOpsClient`)
<a id='mlopsclient-client'></a>
**Operations:**
- [`createExperiment`](#mlopsclient-createexperiment)
- [`createExperimentRun`](#mlopsclient-createexperimentrun)
- [`createModelVersion`](#mlopsclient-createmodelversion)
- [`createRegisteredModel`](#mlopsclient-createregisteredmodel)
- [`createWorkspaceModelVersion`](#mlopsclient-createworkspacemodelversion)
- [`deleteExperiment`](#mlopsclient-deleteexperiment)
- [`deleteExperimentRun`](#mlopsclient-deleteexperimentrun)
- [`deleteExperimentRunTag`](#mlopsclient-deleteexperimentruntag)
- [`deleteExperimentTag`](#mlopsclient-deleteexperimenttag)
- [`deleteModelVersion`](#mlopsclient-deletemodelversion)
- [`deleteModelVersionTag`](#mlopsclient-deletemodelversiontag)
- [`deleteRegisteredModel`](#mlopsclient-deleteregisteredmodel)
- [`deleteRegisteredModelTag`](#mlopsclient-deleteregisteredmodeltag)
- [`getExperimentById`](#mlopsclient-getexperimentbyid)
- [`getExperimentByName`](#mlopsclient-getexperimentbyname)
- [`getExperimentRunById`](#mlopsclient-getexperimentrunbyid)
- [`getExperimentRunMetricHistory`](#mlopsclient-getexperimentrunmetrichistory)
- [`getModelVersion`](#mlopsclient-getmodelversion)
- [`getRegisteredModel`](#mlopsclient-getregisteredmodel)
- [`listArtifacts`](#mlopsclient-listartifacts)
- [`listExperimentRuns`](#mlopsclient-listexperimentruns)
- [`listExperiments`](#mlopsclient-listexperiments)
- [`listLoggedModels`](#mlopsclient-listloggedmodels)
- [`listModelVersions`](#mlopsclient-listmodelversions)
- [`listRegisteredModels`](#mlopsclient-listregisteredmodels)
- [`logExperimentRunBatch`](#mlopsclient-logexperimentrunbatch)
- [`logExperimentRunInputs`](#mlopsclient-logexperimentruninputs)
- [`logExperimentRunMetric`](#mlopsclient-logexperimentrunmetric)
- [`logExperimentRunModel`](#mlopsclient-logexperimentrunmodel)
- [`logExperimentRunParam`](#mlopsclient-logexperimentrunparam)
- [`renameRegisteredModel`](#mlopsclient-renameregisteredmodel)
- [`restoreExperiment`](#mlopsclient-restoreexperiment)
- [`restoreExperimentRun`](#mlopsclient-restoreexperimentrun)
- [`setExperimentRunTag`](#mlopsclient-setexperimentruntag)
- [`setExperimentTag`](#mlopsclient-setexperimenttag)
- [`setModelVersionTag`](#mlopsclient-setmodelversiontag)
- [`setRegisteredModelTag`](#mlopsclient-setregisteredmodeltag)
- [`transitionModelVersionStage`](#mlopsclient-transitionmodelversionstage)
- [`updateExperiment`](#mlopsclient-updateexperiment)
- [`updateExperimentRun`](#mlopsclient-updateexperimentrun)
- [`updateExperimentRunTags`](#mlopsclient-updateexperimentruntags)
- [`updateExperimentTags`](#mlopsclient-updateexperimenttags)
- [`updateModelVersion`](#mlopsclient-updatemodelversion)
- [`updateModelVersionTags`](#mlopsclient-updatemodelversiontags)
- [`updateRegisteredModel`](#mlopsclient-updateregisteredmodel)
- [`updateRegisteredModelTags`](#mlopsclient-updateregisteredmodeltags)

### `createExperiment`
<a id='mlopsclient-createexperiment'></a>
(Preview) Creates an experiment in a workspace.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `createExperimentDetails` (model.CreateExperimentDetails) — Details for the new experiment.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `CreateExperimentResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.CreateExperimentResponseDetails

**Response Fields:**
- `experiment` (Experiment) — **[Required]** experiment of this ExperimentResponse. The experiment of this ExperimentResponse. oci.aidataplatform_dp.models.Experiment

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `createExperimentRun`
<a id='mlopsclient-createexperimentrun'></a>
(Preview) Creates a new run within an experiment.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `createExperimentRunDetails` (model.CreateExperimentRunDetails) — Details for the new run.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `CreateExperimentRunResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.CreateExperimentRunResponseDetails

**Response Fields:**
- `info` (ExperimentRunInfo) — info of this ExperimentRun. The info of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunInfo
- `data` (ExperimentRunData) — data of this ExperimentRun. The data of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunData
- `inputs` (ExperimentRunInputs) — inputs of this ExperimentRun. The inputs of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunInputs
- `outputs` (ExperimentRunOutputs) — outputs of this ExperimentRun. The outputs of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunOutputs

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `createModelVersion`
<a id='mlopsclient-createmodelversion'></a>
(Preview) Creates a model version.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `createModelVersionDetails` (model.CreateModelVersionDetails) — Details for the new model version.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `CreateModelVersionResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.CreateModelVersionResponseDetails

**Response Fields:**
- `model_type` (str) — model_type of this Model. Possible modelTypes of Models object Allowed values for this property are: "GEN_AI" The model_type of this Model. str
- `id` (str) — **[Required]** id of this Model. A unique Id for the model, that is immutable on creation. The id of this Model. str
- `model_name` (str) — **[Required]** model_name of this Model. modelName that is immutable on creation. The model_name of this Model. str
- `display_name` (str) — display_name of this Model. The model name. It can be changed. The display_name of this Model. str
- `namespace_name` (str) — namespace_name of this Model. The model's schema. The namespace_name of this Model. str
- `description` (str) — description of this Model. The description of the Model. The description of this Model. str
- `time_created` (datetime) — time_created of this Model. The time the Model was created. An RFC3339 formatted datetime string. The time_created of this Model. datetime
- `time_updated` (datetime) — time_updated of this Model. The time the Model was updated. An RFC3339 formatted datetime string. The time_updated of this Model. datetime
- `created_by` (str) — created_by of this Model. The vendor who created the Model. The created_by of this Model. str
- `updated_by` (str) — updated_by of this Model. The vendor who updated the Model. The updated_by of this Model. str
- `lifecycle_state` (str) — lifecycle_state of this Model. The state of the Model. Allowed values for this property are: "ACTIVE", "CREATING", "DELETING", "DELETED", "FAILED" The lifecycle_state of this Model. str
- `lifecycle_details` (str) — lifecycle_details of this Model. A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state. The lifecycle_details of this Model. str

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `createRegisteredModel`
<a id='mlopsclient-createregisteredmodel'></a>
(Preview) Creates a registered model in a workspace.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `createRegisteredModelDetails` (model.CreateRegisteredModelDetails) — Details for the new registered model.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `CreateRegisteredModelResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.CreateRegisteredModelResponseDetails

**Response Fields:**
- `name` (str) — name of this RegisteredModel. Unique name for the model. The name of this RegisteredModel. str
- `creation_timestamp` (int) — creation_timestamp of this RegisteredModel. Timestamp in milliseconds when the model was created. The creation_timestamp of this RegisteredModel. int
- `last_updated_timestamp` (int) — last_updated_timestamp of this RegisteredModel. Timestamp in milliseconds when metadata for the model was last updated. The last_updated_timestamp of this RegisteredModel. int
- `description` (str) — description of this RegisteredModel. Description of the registered model. The description of this RegisteredModel. str
- `latest_versions` (list[ModelVersion]) — latest_versions of this RegisteredModel. Collection of latest model versions for each stage. Only contains models with current READY status. The latest_versions of this RegisteredModel. list[oci.aidataplatform_dp.models.ModelVersion]
- `aliases` (list[RegisteredModelAlias]) — aliases of this RegisteredModel. Aliases pointing to model versions associated with this registered_model. The aliases of this RegisteredModel. list[oci.aidataplatform_dp.models.RegisteredModelAlias]
- `deployment_job_id` (str) — deployment_job_id of this RegisteredModel. Deployment job ID. The deployment_job_id of this RegisteredModel. str
- `deployment_job_state` (str) — deployment_job_state of this RegisteredModel. Job state. Allowed values for this property are: "DEPLOYMENT_JOB_CONNECTION_STATE_UNSPECIFIED", "NOT_SET_UP", "CONNECTED", "NOT_FOUND", "REQUIRED_PARAMETERS_CHANGED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The deployment_job_state of this RegisteredModel. str
- `tags` (list[RegisteredModelTag]) — tags of this RegisteredModel. Tags for the registered model. The tags of this RegisteredModel. list[oci.aidataplatform_dp.models.RegisteredModelTag]

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `createWorkspaceModelVersion`
<a id='mlopsclient-createworkspacemodelversion'></a>
(Preview) Creates a new model version in a specified workspace.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `createModelVersionDetails` (model.CreateModelVersionDetails) — Details for the new model version.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `CreateWorkspaceModelVersionResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.CreateModelVersionResponseDetails

**Response Fields:**
- `model_type` (str) — model_type of this Model. Possible modelTypes of Models object Allowed values for this property are: "GEN_AI" The model_type of this Model. str
- `id` (str) — **[Required]** id of this Model. A unique Id for the model, that is immutable on creation. The id of this Model. str
- `model_name` (str) — **[Required]** model_name of this Model. modelName that is immutable on creation. The model_name of this Model. str
- `display_name` (str) — display_name of this Model. The model name. It can be changed. The display_name of this Model. str
- `namespace_name` (str) — namespace_name of this Model. The model's schema. The namespace_name of this Model. str
- `description` (str) — description of this Model. The description of the Model. The description of this Model. str
- `time_created` (datetime) — time_created of this Model. The time the Model was created. An RFC3339 formatted datetime string. The time_created of this Model. datetime
- `time_updated` (datetime) — time_updated of this Model. The time the Model was updated. An RFC3339 formatted datetime string. The time_updated of this Model. datetime
- `created_by` (str) — created_by of this Model. The vendor who created the Model. The created_by of this Model. str
- `updated_by` (str) — updated_by of this Model. The vendor who updated the Model. The updated_by of this Model. str
- `lifecycle_state` (str) — lifecycle_state of this Model. The state of the Model. Allowed values for this property are: "ACTIVE", "CREATING", "DELETING", "DELETED", "FAILED" The lifecycle_state of this Model. str
- `lifecycle_details` (str) — lifecycle_details of this Model. A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state. The lifecycle_details of this Model. str

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `deleteExperiment`
<a id='mlopsclient-deleteexperiment'></a>
(Preview) Deletes an experiment.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `deleteExperimentDetails` (model.DeleteExperimentDetails) — Details of the experiment.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `DeleteExperimentResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.DeleteExperimentResponseDetails

**Response Fields:**
- `experiment` (Experiment) — **[Required]** experiment of this ExperimentResponse. The experiment of this ExperimentResponse. oci.aidataplatform_dp.models.Experiment

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `deleteExperimentRun`
<a id='mlopsclient-deleteexperimentrun'></a>
(Preview) Deletes an experiment run.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `deleteExperimentRunDetails` (model.DeleteExperimentRunDetails) — Details of the Experiment Run.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `DeleteExperimentRunResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.DeleteExperimentRunResponseDetails

**Response Fields:**
- `info` (ExperimentRunInfo) — info of this ExperimentRun. The info of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunInfo
- `data` (ExperimentRunData) — data of this ExperimentRun. The data of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunData
- `inputs` (ExperimentRunInputs) — inputs of this ExperimentRun. The inputs of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunInputs
- `outputs` (ExperimentRunOutputs) — outputs of this ExperimentRun. The outputs of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunOutputs

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `deleteExperimentRunTag`
<a id='mlopsclient-deleteexperimentruntag'></a>
(Preview) Deletes a tag on an experiment run.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `deleteExperimentRunTagDetails` (model.DeleteExperimentRunTagDetails) — Tag details to delete on an experiment run.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `DeleteExperimentRunTagResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.DeleteExperimentRunTagResponseDetails

**Response Fields:**
- `info` (ExperimentRunInfo) — info of this ExperimentRun. The info of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunInfo
- `data` (ExperimentRunData) — data of this ExperimentRun. The data of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunData
- `inputs` (ExperimentRunInputs) — inputs of this ExperimentRun. The inputs of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunInputs
- `outputs` (ExperimentRunOutputs) — outputs of this ExperimentRun. The outputs of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunOutputs

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `deleteExperimentTag`
<a id='mlopsclient-deleteexperimenttag'></a>
(Preview) Deletes a tag on an experiment.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `deleteExperimentTagDetails` (model.DeleteExperimentTagDetails) — Tag details to delete on an experiment.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `DeleteExperimentTagResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.DeleteExperimentTagResponseDetails

**Response Fields:**
- `experiment_id` (str) — **[Required]** experiment_id of this Experiment. Unique identifier for the experiment. The experiment_id of this Experiment. str
- `name` (str) — **[Required]** name of this Experiment. Name of the experiment. The name of this Experiment. str
- `artifact_location` (str) — artifact_location of this Experiment. Location where all artifacts for the experiment are stored. If not provided, the remote server will select an appropriate default. The artifact_location of this Experiment. str
- `lifecycle_stage` (str) — lifecycle_stage of this Experiment. Lifecycle stage of the experiment, e.g., 'active' or 'deleted'. The lifecycle_stage of this Experiment. str
- `creation_time` (int) — creation_time of this Experiment. Unix timestamp in milliseconds when the experiment was created. The creation_time of this Experiment. int
- `last_update_time` (int) — last_update_time of this Experiment. Unix timestamp in milliseconds when the experiment was last updated. The last_update_time of this Experiment. int
- `tags` (list[ExperimentTag]) — tags of this Experiment. List of tags set on the experiment. The tags of this Experiment. list[oci.aidataplatform_dp.models.ExperimentTag]

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `deleteModelVersion`
<a id='mlopsclient-deletemodelversion'></a>
(Preview) Deletes a model version.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `deleteModelVersionDetails` (model.DeleteModelVersionDetails) — Details of the model version to delete.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `DeleteModelVersionResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.DeleteModelVersionResponseDetails

**Response Fields:**
- `model_type` (str) — model_type of this Model. Possible modelTypes of Models object Allowed values for this property are: "GEN_AI" The model_type of this Model. str
- `id` (str) — **[Required]** id of this Model. A unique Id for the model, that is immutable on creation. The id of this Model. str
- `model_name` (str) — **[Required]** model_name of this Model. modelName that is immutable on creation. The model_name of this Model. str
- `display_name` (str) — display_name of this Model. The model name. It can be changed. The display_name of this Model. str
- `namespace_name` (str) — namespace_name of this Model. The model's schema. The namespace_name of this Model. str
- `description` (str) — description of this Model. The description of the Model. The description of this Model. str
- `time_created` (datetime) — time_created of this Model. The time the Model was created. An RFC3339 formatted datetime string. The time_created of this Model. datetime
- `time_updated` (datetime) — time_updated of this Model. The time the Model was updated. An RFC3339 formatted datetime string. The time_updated of this Model. datetime
- `created_by` (str) — created_by of this Model. The vendor who created the Model. The created_by of this Model. str
- `updated_by` (str) — updated_by of this Model. The vendor who updated the Model. The updated_by of this Model. str
- `lifecycle_state` (str) — lifecycle_state of this Model. The state of the Model. Allowed values for this property are: "ACTIVE", "CREATING", "DELETING", "DELETED", "FAILED" The lifecycle_state of this Model. str
- `lifecycle_details` (str) — lifecycle_details of this Model. A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state. The lifecycle_details of this Model. str

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `deleteModelVersionTag`
<a id='mlopsclient-deletemodelversiontag'></a>
(Preview) Deletes a tag on a model version.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `deleteModelVersionTagDetails` (model.DeleteModelVersionTagDetails) — Details of a model version tag to delete.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `DeleteModelVersionTagResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.DeleteModelVersionTagResponseDetails

**Response Fields:**
- `model_type` (str) — model_type of this Model. Possible modelTypes of Models object Allowed values for this property are: "GEN_AI" The model_type of this Model. str
- `id` (str) — **[Required]** id of this Model. A unique Id for the model, that is immutable on creation. The id of this Model. str
- `model_name` (str) — **[Required]** model_name of this Model. modelName that is immutable on creation. The model_name of this Model. str
- `display_name` (str) — display_name of this Model. The model name. It can be changed. The display_name of this Model. str
- `namespace_name` (str) — namespace_name of this Model. The model's schema. The namespace_name of this Model. str
- `description` (str) — description of this Model. The description of the Model. The description of this Model. str
- `time_created` (datetime) — time_created of this Model. The time the Model was created. An RFC3339 formatted datetime string. The time_created of this Model. datetime
- `time_updated` (datetime) — time_updated of this Model. The time the Model was updated. An RFC3339 formatted datetime string. The time_updated of this Model. datetime
- `created_by` (str) — created_by of this Model. The vendor who created the Model. The created_by of this Model. str
- `updated_by` (str) — updated_by of this Model. The vendor who updated the Model. The updated_by of this Model. str
- `lifecycle_state` (str) — lifecycle_state of this Model. The state of the Model. Allowed values for this property are: "ACTIVE", "CREATING", "DELETING", "DELETED", "FAILED" The lifecycle_state of this Model. str
- `lifecycle_details` (str) — lifecycle_details of this Model. A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state. The lifecycle_details of this Model. str

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `deleteRegisteredModel`
<a id='mlopsclient-deleteregisteredmodel'></a>
(Preview) Deletes a registered model.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `deleteRegisteredModelDetails` (model.DeleteRegisteredModelDetails) — Details of the registered model to delete.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `DeleteRegisteredModelResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.DeleteRegisteredModelResponseDetails

**Response Fields:**
- `name` (str) — name of this RegisteredModel. Unique name for the model. The name of this RegisteredModel. str
- `creation_timestamp` (int) — creation_timestamp of this RegisteredModel. Timestamp in milliseconds when the model was created. The creation_timestamp of this RegisteredModel. int
- `last_updated_timestamp` (int) — last_updated_timestamp of this RegisteredModel. Timestamp in milliseconds when metadata for the model was last updated. The last_updated_timestamp of this RegisteredModel. int
- `description` (str) — description of this RegisteredModel. Description of the registered model. The description of this RegisteredModel. str
- `latest_versions` (list[ModelVersion]) — latest_versions of this RegisteredModel. Collection of latest model versions for each stage. Only contains models with current READY status. The latest_versions of this RegisteredModel. list[oci.aidataplatform_dp.models.ModelVersion]
- `aliases` (list[RegisteredModelAlias]) — aliases of this RegisteredModel. Aliases pointing to model versions associated with this registered_model. The aliases of this RegisteredModel. list[oci.aidataplatform_dp.models.RegisteredModelAlias]
- `deployment_job_id` (str) — deployment_job_id of this RegisteredModel. Deployment job ID. The deployment_job_id of this RegisteredModel. str
- `deployment_job_state` (str) — deployment_job_state of this RegisteredModel. Job state. Allowed values for this property are: "DEPLOYMENT_JOB_CONNECTION_STATE_UNSPECIFIED", "NOT_SET_UP", "CONNECTED", "NOT_FOUND", "REQUIRED_PARAMETERS_CHANGED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The deployment_job_state of this RegisteredModel. str
- `tags` (list[RegisteredModelTag]) — tags of this RegisteredModel. Tags for the registered model. The tags of this RegisteredModel. list[oci.aidataplatform_dp.models.RegisteredModelTag]

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `deleteRegisteredModelTag`
<a id='mlopsclient-deleteregisteredmodeltag'></a>
(Preview) Deletes a tag on a registered model.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `deleteRegisteredModelTagDetails` (model.DeleteRegisteredModelTagDetails) — Details of a registered model tag.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `DeleteRegisteredModelTagResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.DeleteRegisteredModelTagResponseDetails

**Response Fields:**
- `name` (str) — name of this RegisteredModel. Unique name for the model. The name of this RegisteredModel. str
- `creation_timestamp` (int) — creation_timestamp of this RegisteredModel. Timestamp in milliseconds when the model was created. The creation_timestamp of this RegisteredModel. int
- `last_updated_timestamp` (int) — last_updated_timestamp of this RegisteredModel. Timestamp in milliseconds when metadata for the model was last updated. The last_updated_timestamp of this RegisteredModel. int
- `description` (str) — description of this RegisteredModel. Description of the registered model. The description of this RegisteredModel. str
- `latest_versions` (list[ModelVersion]) — latest_versions of this RegisteredModel. Collection of latest model versions for each stage. Only contains models with current READY status. The latest_versions of this RegisteredModel. list[oci.aidataplatform_dp.models.ModelVersion]
- `aliases` (list[RegisteredModelAlias]) — aliases of this RegisteredModel. Aliases pointing to model versions associated with this registered_model. The aliases of this RegisteredModel. list[oci.aidataplatform_dp.models.RegisteredModelAlias]
- `deployment_job_id` (str) — deployment_job_id of this RegisteredModel. Deployment job ID. The deployment_job_id of this RegisteredModel. str
- `deployment_job_state` (str) — deployment_job_state of this RegisteredModel. Job state. Allowed values for this property are: "DEPLOYMENT_JOB_CONNECTION_STATE_UNSPECIFIED", "NOT_SET_UP", "CONNECTED", "NOT_FOUND", "REQUIRED_PARAMETERS_CHANGED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The deployment_job_state of this RegisteredModel. str
- `tags` (list[RegisteredModelTag]) — tags of this RegisteredModel. Tags for the registered model. The tags of this RegisteredModel. list[oci.aidataplatform_dp.models.RegisteredModelTag]

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `getExperimentById`
<a id='mlopsclient-getexperimentbyid'></a>
(Preview) Returns metadata for an experiment by ID. This method works on deleted experiments.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `experimentId` (string) — The unique ID of the experiment to retrieve.

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `GetExperimentByIdResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.ExperimentResponse

**Response Fields:**
- `experiment` (Experiment) — **[Required]** experiment of this ExperimentResponse. The experiment of this ExperimentResponse. oci.aidataplatform_dp.models.Experiment

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `getExperimentByName`
<a id='mlopsclient-getexperimentbyname'></a>
(Preview) Returns experiment metadata for a given name. Returns deleted experiments, but prefers the active experiment if an active and deleted experiment share the same name. If multiple deleted experiments share the same name, the API will return one of them.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `experimentName` (string) — The name of the experiment to retrieve.

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `GetExperimentByNameResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.ExperimentResponse

**Response Fields:**
- `experiment` (Experiment) — **[Required]** experiment of this ExperimentResponse. The experiment of this ExperimentResponse. oci.aidataplatform_dp.models.Experiment

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `getExperimentRunById`
<a id='mlopsclient-getexperimentrunbyid'></a>
(Preview) Returns details of an experiment run by ID.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `runId` (string) — ID of the run to fetch.

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `GetExperimentRunByIdResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.GetExperimentRunResponseDetails

**Response Fields:**
- `info` (ExperimentRunInfo) — info of this ExperimentRun. The info of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunInfo
- `data` (ExperimentRunData) — data of this ExperimentRun. The data of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunData
- `inputs` (ExperimentRunInputs) — inputs of this ExperimentRun. The inputs of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunInputs
- `outputs` (ExperimentRunOutputs) — outputs of this ExperimentRun. The outputs of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunOutputs

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `getExperimentRunMetricHistory`
<a id='mlopsclient-getexperimentrunmetrichistory'></a>
(Preview) Returns a history of experiment run metrics.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `runId` (string) — ID of the run metric history to fetch.
- `metricKey` (string) — Name of the metric key.

**Optional Parameters:**
- `pageToken` (string) — Pagination token to go to the next page of metric history.
- `maxResults` (number) — Maximum number of logged instances of a metric for a run to return per call. Backend servers may restrict the value of max_results depending on performance requirements. Requests that do not specify this value will behave as non-paginated queries where all metric history values for a given metric within a run are returned in a single response.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `GetExperimentRunMetricHistoryResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.ExperimentRunMetricHistoryCollection

**Response Fields:**
- `info` (ExperimentRunInfo) — info of this ExperimentRun. The info of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunInfo
- `data` (ExperimentRunData) — data of this ExperimentRun. The data of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunData
- `inputs` (ExperimentRunInputs) — inputs of this ExperimentRun. The inputs of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunInputs
- `outputs` (ExperimentRunOutputs) — outputs of this ExperimentRun. The outputs of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunOutputs

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `getModelVersion`
<a id='mlopsclient-getmodelversion'></a>
(Preview) Returns detailed information for a model version.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `name` (string) — Name of the model version.
- `version` (string) — Version number of the model version.

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `GetModelVersionResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.GetModelVersionResponseDetails

**Response Fields:**
- `model_type` (str) — model_type of this Model. Possible modelTypes of Models object Allowed values for this property are: "GEN_AI" The model_type of this Model. str
- `id` (str) — **[Required]** id of this Model. A unique Id for the model, that is immutable on creation. The id of this Model. str
- `model_name` (str) — **[Required]** model_name of this Model. modelName that is immutable on creation. The model_name of this Model. str
- `display_name` (str) — display_name of this Model. The model name. It can be changed. The display_name of this Model. str
- `namespace_name` (str) — namespace_name of this Model. The model's schema. The namespace_name of this Model. str
- `description` (str) — description of this Model. The description of the Model. The description of this Model. str
- `time_created` (datetime) — time_created of this Model. The time the Model was created. An RFC3339 formatted datetime string. The time_created of this Model. datetime
- `time_updated` (datetime) — time_updated of this Model. The time the Model was updated. An RFC3339 formatted datetime string. The time_updated of this Model. datetime
- `created_by` (str) — created_by of this Model. The vendor who created the Model. The created_by of this Model. str
- `updated_by` (str) — updated_by of this Model. The vendor who updated the Model. The updated_by of this Model. str
- `lifecycle_state` (str) — lifecycle_state of this Model. The state of the Model. Allowed values for this property are: "ACTIVE", "CREATING", "DELETING", "DELETED", "FAILED" The lifecycle_state of this Model. str
- `lifecycle_details` (str) — lifecycle_details of this Model. A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state. The lifecycle_details of this Model. str

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `getRegisteredModel`
<a id='mlopsclient-getregisteredmodel'></a>
(Preview) Returns details for a specified registered model.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `name` (string) — Name of the registered model.

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `GetRegisteredModelResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.GetRegisteredModelResponseDetails

**Response Fields:**
- `name` (str) — name of this RegisteredModel. Unique name for the model. The name of this RegisteredModel. str
- `creation_timestamp` (int) — creation_timestamp of this RegisteredModel. Timestamp in milliseconds when the model was created. The creation_timestamp of this RegisteredModel. int
- `last_updated_timestamp` (int) — last_updated_timestamp of this RegisteredModel. Timestamp in milliseconds when metadata for the model was last updated. The last_updated_timestamp of this RegisteredModel. int
- `description` (str) — description of this RegisteredModel. Description of the registered model. The description of this RegisteredModel. str
- `latest_versions` (list[ModelVersion]) — latest_versions of this RegisteredModel. Collection of latest model versions for each stage. Only contains models with current READY status. The latest_versions of this RegisteredModel. list[oci.aidataplatform_dp.models.ModelVersion]
- `aliases` (list[RegisteredModelAlias]) — aliases of this RegisteredModel. Aliases pointing to model versions associated with this registered_model. The aliases of this RegisteredModel. list[oci.aidataplatform_dp.models.RegisteredModelAlias]
- `deployment_job_id` (str) — deployment_job_id of this RegisteredModel. Deployment job ID. The deployment_job_id of this RegisteredModel. str
- `deployment_job_state` (str) — deployment_job_state of this RegisteredModel. Job state. Allowed values for this property are: "DEPLOYMENT_JOB_CONNECTION_STATE_UNSPECIFIED", "NOT_SET_UP", "CONNECTED", "NOT_FOUND", "REQUIRED_PARAMETERS_CHANGED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The deployment_job_state of this RegisteredModel. str
- `tags` (list[RegisteredModelTag]) — tags of this RegisteredModel. Tags for the registered model. The tags of this RegisteredModel. list[oci.aidataplatform_dp.models.RegisteredModelTag]

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `listArtifacts`
<a id='mlopsclient-listartifacts'></a>
(Preview) Returns a list of artifacts.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `runId` (string) — ID of the run whose artifacts to list.

**Optional Parameters:**
- `path` (string) — Filter artifacts matching this path (a relative path from the root artifact directory).
- `pageToken` (string) — Token indicating the page of artifact results to fetch.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `ListArtifactsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.ArtifactList

**Response Fields:**
- `root_uri` (str) — root_uri of this ArtifactList. Root artifact directory for the run. The root_uri of this ArtifactList. str
- `files` (list[ArtifactFileInfo]) — files of this ArtifactList. File location and metadata for artifacts. The files of this ArtifactList. list[oci.aidataplatform_dp.models.ArtifactFileInfo]
- `next_page_token` (str) — next_page_token of this ArtifactList. Token that can be used to retrieve the next page of artifact results. The next_page_token of this ArtifactList. str

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `listExperimentRuns`
<a id='mlopsclient-listexperimentruns'></a>
(Preview) Returns a list of experiment runs in a workspace.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `listExperimentRunsDetails` (model.ListExperimentRunsDetails) — Details of experiment runs to fetch.

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `ListExperimentRunsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.ExperimentRunCollection

**Response Fields:**
- `info` (ExperimentRunInfo) — info of this ExperimentRun. The info of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunInfo
- `data` (ExperimentRunData) — data of this ExperimentRun. The data of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunData
- `inputs` (ExperimentRunInputs) — inputs of this ExperimentRun. The inputs of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunInputs
- `outputs` (ExperimentRunOutputs) — outputs of this ExperimentRun. The outputs of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunOutputs

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `listExperiments`
<a id='mlopsclient-listexperiments'></a>
(Preview) Returns a list of experiments with the given details.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `listExperimentsDetails` (model.ListExperimentsDetails) — Details of experiments to fetch.

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `ListExperimentsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.ExperimentCollection

**Response Fields:**
- `experiments` (list[Experiment]) — **[Required]** experiments of this ExperimentCollection. Experiments that match the search criteria. The experiments of this ExperimentCollection. list[oci.aidataplatform_dp.models.Experiment]
- `next_page_token` (str) — next_page_token of this ExperimentCollection. Token that can be used to retrieve the next page of experiments. An empty token means that no more experiments are available for retrieval. The next_page_token of this ExperimentCollection. str

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `listLoggedModels`
<a id='mlopsclient-listloggedmodels'></a>
(Preview) Returns a list of logged models.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `listLoggedModelsDetails` (model.ListLoggedModelsDetails) — Details of logged models to fetch.

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `ListLoggedModelsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.LoggedModelCollection

**Response Fields:**
- `models` (list[LoggedModel]) — models of this LoggedModelCollection. Logged models that match the search criteria The models of this LoggedModelCollection. list[oci.aidataplatform_dp.models.LoggedModel]
- `next_page_token` (str) — next_page_token of this LoggedModelCollection. Token that can be used to retrieve the next page of logged-models. An empty token means that no more logged-models are available for retrieval. The next_page_token of this LoggedModelCollection. str

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `listModelVersions`
<a id='mlopsclient-listmodelversions'></a>
(Preview) Returns a list of model versions.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `filter` (string) — String filter condition, like \"name LIKE 'my-model-name'\". Single boolean condition, with string values wrapped in single quotes.
- `maxResults` (number) — Maximum number of model versions to retrieve.
- `pageToken` (string) — Pagination token to go to the next page based on a previous search query.
- `orderBy` (string) — List of columns to be ordered by including model name, version, stage with an optional \"DESC\" or \"ASC\" annotation, where \"ASC\" is the default. Tiebreaks are done by latest stage transition timestamp, followed by name ASC, followed by version DESC.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `ListModelVersionsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.ModelVersionCollection

**Response Fields:**
- `model_versions` (list[ModelVersion]) — **[Required]** model_versions of this ModelVersionCollection. Model versions that match the search criteria. The model_versions of this ModelVersionCollection. list[oci.aidataplatform_dp.models.ModelVersion]
- `next_page_token` (str) — next_page_token of this ModelVersionCollection. Token that can be used to retrieve the next page of model versions. The next_page_token of this ModelVersionCollection. str

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `listRegisteredModels`
<a id='mlopsclient-listregisteredmodels'></a>
(Preview) Returns a list of registered models in a workspace.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `filter` (string) — String filter condition, like \"name LIKE 'my-model-name'\". Interpreted in the backend automatically as \"name LIKE '%my-model-name%'\". Single boolean condition, with string values wrapped in single quotes.
- `maxResults` (number) — Maximum number of models desired. Default is 100. Max threshold is 1000.
- `pageToken` (string) — Pagination token to go to the next page based on a previous search query.
- `orderBy` (string) — List of columns for ordering search results, which can include model name and last updated timestamp with an optional \"DESC\" or \"ASC\" annotation, where \"ASC\" is the default. Tiebreaks are done by model name ASC.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `ListRegisteredModelsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.RegisteredModelCollection

**Response Fields:**
- `name` (str) — name of this RegisteredModel. Unique name for the model. The name of this RegisteredModel. str
- `creation_timestamp` (int) — creation_timestamp of this RegisteredModel. Timestamp in milliseconds when the model was created. The creation_timestamp of this RegisteredModel. int
- `last_updated_timestamp` (int) — last_updated_timestamp of this RegisteredModel. Timestamp in milliseconds when metadata for the model was last updated. The last_updated_timestamp of this RegisteredModel. int
- `description` (str) — description of this RegisteredModel. Description of the registered model. The description of this RegisteredModel. str
- `latest_versions` (list[ModelVersion]) — latest_versions of this RegisteredModel. Collection of latest model versions for each stage. Only contains models with current READY status. The latest_versions of this RegisteredModel. list[oci.aidataplatform_dp.models.ModelVersion]
- `aliases` (list[RegisteredModelAlias]) — aliases of this RegisteredModel. Aliases pointing to model versions associated with this registered_model. The aliases of this RegisteredModel. list[oci.aidataplatform_dp.models.RegisteredModelAlias]
- `deployment_job_id` (str) — deployment_job_id of this RegisteredModel. Deployment job ID. The deployment_job_id of this RegisteredModel. str
- `deployment_job_state` (str) — deployment_job_state of this RegisteredModel. Job state. Allowed values for this property are: "DEPLOYMENT_JOB_CONNECTION_STATE_UNSPECIFIED", "NOT_SET_UP", "CONNECTED", "NOT_FOUND", "REQUIRED_PARAMETERS_CHANGED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The deployment_job_state of this RegisteredModel. str
- `tags` (list[RegisteredModelTag]) — tags of this RegisteredModel. Tags for the registered model. The tags of this RegisteredModel. list[oci.aidataplatform_dp.models.RegisteredModelTag]

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `logExperimentRunBatch`
<a id='mlopsclient-logexperimentrunbatch'></a>
(Preview) Logs an experiment run batch.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `logExperimentRunBatchDetails` (model.LogExperimentRunBatchDetails) — Details of an experiment run batch.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `LogExperimentRunBatchResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.LogExperimentRunBatchResponseDetails

**Response Fields:**
- `info` (ExperimentRunInfo) — info of this ExperimentRun. The info of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunInfo
- `data` (ExperimentRunData) — data of this ExperimentRun. The data of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunData
- `inputs` (ExperimentRunInputs) — inputs of this ExperimentRun. The inputs of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunInputs
- `outputs` (ExperimentRunOutputs) — outputs of this ExperimentRun. The outputs of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunOutputs

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `logExperimentRunInputs`
<a id='mlopsclient-logexperimentruninputs'></a>
(Preview) Logs experiment run inputs.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `logExperimentRunInputsDetails` (model.LogExperimentRunInputsDetails) — Details of experiment run inputs.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `LogExperimentRunInputsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.LogExperimentRunInputsResponseDetails

**Response Fields:**
- `info` (ExperimentRunInfo) — info of this ExperimentRun. The info of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunInfo
- `data` (ExperimentRunData) — data of this ExperimentRun. The data of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunData
- `inputs` (ExperimentRunInputs) — inputs of this ExperimentRun. The inputs of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunInputs
- `outputs` (ExperimentRunOutputs) — outputs of this ExperimentRun. The outputs of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunOutputs

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `logExperimentRunMetric`
<a id='mlopsclient-logexperimentrunmetric'></a>
(Preview) Logs an experiment run metric.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `logExperimentRunMetricDetails` (model.LogExperimentRunMetricDetails) — Details of an experiment run metric.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `LogExperimentRunMetricResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.LogExperimentRunMetricResponseDetails

**Response Fields:**
- `info` (ExperimentRunInfo) — info of this ExperimentRun. The info of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunInfo
- `data` (ExperimentRunData) — data of this ExperimentRun. The data of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunData
- `inputs` (ExperimentRunInputs) — inputs of this ExperimentRun. The inputs of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunInputs
- `outputs` (ExperimentRunOutputs) — outputs of this ExperimentRun. The outputs of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunOutputs

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `logExperimentRunModel`
<a id='mlopsclient-logexperimentrunmodel'></a>
(Preview) Logs an experiment run model.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `logExperimentRunModelDetails` (model.LogExperimentRunModelDetails) — Details of an experiment run model.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `LogExperimentRunModelResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.LogExperimentRunModelResponseDetails

**Response Fields:**
- `info` (ExperimentRunInfo) — info of this ExperimentRun. The info of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunInfo
- `data` (ExperimentRunData) — data of this ExperimentRun. The data of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunData
- `inputs` (ExperimentRunInputs) — inputs of this ExperimentRun. The inputs of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunInputs
- `outputs` (ExperimentRunOutputs) — outputs of this ExperimentRun. The outputs of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunOutputs

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `logExperimentRunParam`
<a id='mlopsclient-logexperimentrunparam'></a>
(Preview) Logs an experiment run parameter.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `logExperimentRunParamDetails` (model.LogExperimentRunParamDetails) — Details of an experiment run parameter.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `LogExperimentRunParamResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.LogExperimentRunParamResponseDetails

**Response Fields:**
- `info` (ExperimentRunInfo) — info of this ExperimentRun. The info of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunInfo
- `data` (ExperimentRunData) — data of this ExperimentRun. The data of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunData
- `inputs` (ExperimentRunInputs) — inputs of this ExperimentRun. The inputs of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunInputs
- `outputs` (ExperimentRunOutputs) — outputs of this ExperimentRun. The outputs of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunOutputs

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `renameRegisteredModel`
<a id='mlopsclient-renameregisteredmodel'></a>
(Preview) Renames a registered model.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `renameRegisteredModelDetails` (model.RenameRegisteredModelDetails) — Details of a registered model rename.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `RenameRegisteredModelResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.RenameRegisteredModelResponseDetails

**Response Fields:**
- `name` (str) — name of this RegisteredModel. Unique name for the model. The name of this RegisteredModel. str
- `creation_timestamp` (int) — creation_timestamp of this RegisteredModel. Timestamp in milliseconds when the model was created. The creation_timestamp of this RegisteredModel. int
- `last_updated_timestamp` (int) — last_updated_timestamp of this RegisteredModel. Timestamp in milliseconds when metadata for the model was last updated. The last_updated_timestamp of this RegisteredModel. int
- `description` (str) — description of this RegisteredModel. Description of the registered model. The description of this RegisteredModel. str
- `latest_versions` (list[ModelVersion]) — latest_versions of this RegisteredModel. Collection of latest model versions for each stage. Only contains models with current READY status. The latest_versions of this RegisteredModel. list[oci.aidataplatform_dp.models.ModelVersion]
- `aliases` (list[RegisteredModelAlias]) — aliases of this RegisteredModel. Aliases pointing to model versions associated with this registered_model. The aliases of this RegisteredModel. list[oci.aidataplatform_dp.models.RegisteredModelAlias]
- `deployment_job_id` (str) — deployment_job_id of this RegisteredModel. Deployment job ID. The deployment_job_id of this RegisteredModel. str
- `deployment_job_state` (str) — deployment_job_state of this RegisteredModel. Job state. Allowed values for this property are: "DEPLOYMENT_JOB_CONNECTION_STATE_UNSPECIFIED", "NOT_SET_UP", "CONNECTED", "NOT_FOUND", "REQUIRED_PARAMETERS_CHANGED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The deployment_job_state of this RegisteredModel. str
- `tags` (list[RegisteredModelTag]) — tags of this RegisteredModel. Tags for the registered model. The tags of this RegisteredModel. list[oci.aidataplatform_dp.models.RegisteredModelTag]

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `restoreExperiment`
<a id='mlopsclient-restoreexperiment'></a>
(Preview) Restores an experiment.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `restoreExperimentDetails` (model.RestoreExperimentDetails) — Restore experiment details.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `RestoreExperimentResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.RestoreExperimentResponseDetails

**Response Fields:**
- `experiment` (Experiment) — **[Required]** experiment of this ExperimentResponse. The experiment of this ExperimentResponse. oci.aidataplatform_dp.models.Experiment

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `restoreExperimentRun`
<a id='mlopsclient-restoreexperimentrun'></a>
(Preview) Restores an experiment run.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `restoreExperimentRunDetails` (model.RestoreExperimentRunDetails) — Restore experiment run details.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `RestoreExperimentRunResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.RestoreExperimentRunResponseDetails

**Response Fields:**
- `info` (ExperimentRunInfo) — info of this ExperimentRun. The info of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunInfo
- `data` (ExperimentRunData) — data of this ExperimentRun. The data of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunData
- `inputs` (ExperimentRunInputs) — inputs of this ExperimentRun. The inputs of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunInputs
- `outputs` (ExperimentRunOutputs) — outputs of this ExperimentRun. The outputs of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunOutputs

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `setExperimentRunTag`
<a id='mlopsclient-setexperimentruntag'></a>
(Preview) Sets a tag on an experiment run.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `setExperimentRunTagDetails` (model.SetExperimentRunTagDetails) — Tag details to set on an experiment run.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `SetExperimentRunTagResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.SetExperimentRunTagResponseDetails

**Response Fields:**
- `info` (ExperimentRunInfo) — info of this ExperimentRun. The info of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunInfo
- `data` (ExperimentRunData) — data of this ExperimentRun. The data of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunData
- `inputs` (ExperimentRunInputs) — inputs of this ExperimentRun. The inputs of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunInputs
- `outputs` (ExperimentRunOutputs) — outputs of this ExperimentRun. The outputs of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunOutputs

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `setExperimentTag`
<a id='mlopsclient-setexperimenttag'></a>
(Preview) Sets a tag on an experiment.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `setExperimentTagDetails` (model.SetExperimentTagDetails) — Tag details to set on an experiment.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `SetExperimentTagResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.SetExperimentTagResponseDetails

**Response Fields:**
- `experiment_id` (str) — **[Required]** experiment_id of this Experiment. Unique identifier for the experiment. The experiment_id of this Experiment. str
- `name` (str) — **[Required]** name of this Experiment. Name of the experiment. The name of this Experiment. str
- `artifact_location` (str) — artifact_location of this Experiment. Location where all artifacts for the experiment are stored. If not provided, the remote server will select an appropriate default. The artifact_location of this Experiment. str
- `lifecycle_stage` (str) — lifecycle_stage of this Experiment. Lifecycle stage of the experiment, e.g., 'active' or 'deleted'. The lifecycle_stage of this Experiment. str
- `creation_time` (int) — creation_time of this Experiment. Unix timestamp in milliseconds when the experiment was created. The creation_time of this Experiment. int
- `last_update_time` (int) — last_update_time of this Experiment. Unix timestamp in milliseconds when the experiment was last updated. The last_update_time of this Experiment. int
- `tags` (list[ExperimentTag]) — tags of this Experiment. List of tags set on the experiment. The tags of this Experiment. list[oci.aidataplatform_dp.models.ExperimentTag]

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `setModelVersionTag`
<a id='mlopsclient-setmodelversiontag'></a>
(Preview) Sets a tag on a model version.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `setModelVersionTagDetails` (model.SetModelVersionTagDetails) — Details of a model version tag.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `SetModelVersionTagResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.SetModelVersionTagResponseDetails

**Response Fields:**
- `model_type` (str) — model_type of this Model. Possible modelTypes of Models object Allowed values for this property are: "GEN_AI" The model_type of this Model. str
- `id` (str) — **[Required]** id of this Model. A unique Id for the model, that is immutable on creation. The id of this Model. str
- `model_name` (str) — **[Required]** model_name of this Model. modelName that is immutable on creation. The model_name of this Model. str
- `display_name` (str) — display_name of this Model. The model name. It can be changed. The display_name of this Model. str
- `namespace_name` (str) — namespace_name of this Model. The model's schema. The namespace_name of this Model. str
- `description` (str) — description of this Model. The description of the Model. The description of this Model. str
- `time_created` (datetime) — time_created of this Model. The time the Model was created. An RFC3339 formatted datetime string. The time_created of this Model. datetime
- `time_updated` (datetime) — time_updated of this Model. The time the Model was updated. An RFC3339 formatted datetime string. The time_updated of this Model. datetime
- `created_by` (str) — created_by of this Model. The vendor who created the Model. The created_by of this Model. str
- `updated_by` (str) — updated_by of this Model. The vendor who updated the Model. The updated_by of this Model. str
- `lifecycle_state` (str) — lifecycle_state of this Model. The state of the Model. Allowed values for this property are: "ACTIVE", "CREATING", "DELETING", "DELETED", "FAILED" The lifecycle_state of this Model. str
- `lifecycle_details` (str) — lifecycle_details of this Model. A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state. The lifecycle_details of this Model. str

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `setRegisteredModelTag`
<a id='mlopsclient-setregisteredmodeltag'></a>
(Preview) Sets a tag on a registered model.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `setRegisteredModelTagDetails` (model.SetRegisteredModelTagDetails) — Details of a registered model tag.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `SetRegisteredModelTagResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.SetRegisteredModelTagResponseDetails

**Response Fields:**
- `name` (str) — name of this RegisteredModel. Unique name for the model. The name of this RegisteredModel. str
- `creation_timestamp` (int) — creation_timestamp of this RegisteredModel. Timestamp in milliseconds when the model was created. The creation_timestamp of this RegisteredModel. int
- `last_updated_timestamp` (int) — last_updated_timestamp of this RegisteredModel. Timestamp in milliseconds when metadata for the model was last updated. The last_updated_timestamp of this RegisteredModel. int
- `description` (str) — description of this RegisteredModel. Description of the registered model. The description of this RegisteredModel. str
- `latest_versions` (list[ModelVersion]) — latest_versions of this RegisteredModel. Collection of latest model versions for each stage. Only contains models with current READY status. The latest_versions of this RegisteredModel. list[oci.aidataplatform_dp.models.ModelVersion]
- `aliases` (list[RegisteredModelAlias]) — aliases of this RegisteredModel. Aliases pointing to model versions associated with this registered_model. The aliases of this RegisteredModel. list[oci.aidataplatform_dp.models.RegisteredModelAlias]
- `deployment_job_id` (str) — deployment_job_id of this RegisteredModel. Deployment job ID. The deployment_job_id of this RegisteredModel. str
- `deployment_job_state` (str) — deployment_job_state of this RegisteredModel. Job state. Allowed values for this property are: "DEPLOYMENT_JOB_CONNECTION_STATE_UNSPECIFIED", "NOT_SET_UP", "CONNECTED", "NOT_FOUND", "REQUIRED_PARAMETERS_CHANGED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The deployment_job_state of this RegisteredModel. str
- `tags` (list[RegisteredModelTag]) — tags of this RegisteredModel. Tags for the registered model. The tags of this RegisteredModel. list[oci.aidataplatform_dp.models.RegisteredModelTag]

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `transitionModelVersionStage`
<a id='mlopsclient-transitionmodelversionstage'></a>
(Preview) Transitions a model version stage.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `transitionModelVersionStageDetails` (model.TransitionModelVersionStageDetails) — Details to transition a model version stage.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `TransitionModelVersionStageResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.TransitionModelVersionStageResponseDetails

**Response Fields:**
- `model_version` (ModelVersion) — **[Required]** model_version of this TransitionModelVersionStageResponseDetails. The model_version of this TransitionModelVersionStageResponseDetails. oci.aidataplatform_dp.models.ModelVersion

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `updateExperiment`
<a id='mlopsclient-updateexperiment'></a>
(Preview) Updates an experiment.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `updateExperimentDetails` (model.UpdateExperimentDetails) — Update experiment metadata.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `UpdateExperimentResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.UpdateExperimentResponseDetails

**Response Fields:**
- `experiment` (Experiment) — **[Required]** experiment of this ExperimentResponse. The experiment of this ExperimentResponse. oci.aidataplatform_dp.models.Experiment

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `updateExperimentRun`
<a id='mlopsclient-updateexperimentrun'></a>
(Preview) Updates an experiment run.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `updateExperimentRunDetails` (model.UpdateExperimentRunDetails) — Update experiment run details.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `UpdateExperimentRunResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.UpdateExperimentRunResponseDetails

**Response Fields:**
- `info` (ExperimentRunInfo) — info of this ExperimentRun. The info of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunInfo
- `data` (ExperimentRunData) — data of this ExperimentRun. The data of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunData
- `inputs` (ExperimentRunInputs) — inputs of this ExperimentRun. The inputs of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunInputs
- `outputs` (ExperimentRunOutputs) — outputs of this ExperimentRun. The outputs of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunOutputs

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `updateExperimentRunTags`
<a id='mlopsclient-updateexperimentruntags'></a>
(Preview) Updates tags on an experiment run.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `updateExperimentRunTagsDetails` (model.UpdateExperimentRunTagsDetails) — Details of ExperimentRun tags.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `UpdateExperimentRunTagsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.UpdateExperimentRunTagsResponseDetails

**Response Fields:**
- `info` (ExperimentRunInfo) — info of this ExperimentRun. The info of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunInfo
- `data` (ExperimentRunData) — data of this ExperimentRun. The data of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunData
- `inputs` (ExperimentRunInputs) — inputs of this ExperimentRun. The inputs of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunInputs
- `outputs` (ExperimentRunOutputs) — outputs of this ExperimentRun. The outputs of this ExperimentRun. oci.aidataplatform_dp.models.ExperimentRunOutputs

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `updateExperimentTags`
<a id='mlopsclient-updateexperimenttags'></a>
(Preview) Updates tags on experiment.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `updateExperimentTagsDetails` (model.UpdateExperimentTagsDetails) — Details of Experiment tags.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `UpdateExperimentTagsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.UpdateExperimentTagsResponseDetails

**Response Fields:**
- `experiment_id` (str) — **[Required]** experiment_id of this Experiment. Unique identifier for the experiment. The experiment_id of this Experiment. str
- `name` (str) — **[Required]** name of this Experiment. Name of the experiment. The name of this Experiment. str
- `artifact_location` (str) — artifact_location of this Experiment. Location where all artifacts for the experiment are stored. If not provided, the remote server will select an appropriate default. The artifact_location of this Experiment. str
- `lifecycle_stage` (str) — lifecycle_stage of this Experiment. Lifecycle stage of the experiment, e.g., 'active' or 'deleted'. The lifecycle_stage of this Experiment. str
- `creation_time` (int) — creation_time of this Experiment. Unix timestamp in milliseconds when the experiment was created. The creation_time of this Experiment. int
- `last_update_time` (int) — last_update_time of this Experiment. Unix timestamp in milliseconds when the experiment was last updated. The last_update_time of this Experiment. int
- `tags` (list[ExperimentTag]) — tags of this Experiment. List of tags set on the experiment. The tags of this Experiment. list[oci.aidataplatform_dp.models.ExperimentTag]

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `updateModelVersion`
<a id='mlopsclient-updatemodelversion'></a>
(Preview) Updates a model version

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `updateModelVersionDetails` (model.UpdateModelVersionDetails) — Details to update model version.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `UpdateModelVersionResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.UpdateModelVersionResponseDetails

**Response Fields:**
- `model_version` (ModelVersion) — **[Required]** model_version of this UpdateModelVersionResponseDetails. The model_version of this UpdateModelVersionResponseDetails. oci.aidataplatform_dp.models.ModelVersion

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `updateModelVersionTags`
<a id='mlopsclient-updatemodelversiontags'></a>
(Preview) Updates tags on a model version.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `updateModelVersionTagsDetails` (model.UpdateModelVersionTagsDetails) — Details of model version tags to update.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `UpdateModelVersionTagsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.UpdateModelVersionTagsResponseDetails

**Response Fields:**
- `model_type` (str) — model_type of this Model. Possible modelTypes of Models object Allowed values for this property are: "GEN_AI" The model_type of this Model. str
- `id` (str) — **[Required]** id of this Model. A unique Id for the model, that is immutable on creation. The id of this Model. str
- `model_name` (str) — **[Required]** model_name of this Model. modelName that is immutable on creation. The model_name of this Model. str
- `display_name` (str) — display_name of this Model. The model name. It can be changed. The display_name of this Model. str
- `namespace_name` (str) — namespace_name of this Model. The model's schema. The namespace_name of this Model. str
- `description` (str) — description of this Model. The description of the Model. The description of this Model. str
- `time_created` (datetime) — time_created of this Model. The time the Model was created. An RFC3339 formatted datetime string. The time_created of this Model. datetime
- `time_updated` (datetime) — time_updated of this Model. The time the Model was updated. An RFC3339 formatted datetime string. The time_updated of this Model. datetime
- `created_by` (str) — created_by of this Model. The vendor who created the Model. The created_by of this Model. str
- `updated_by` (str) — updated_by of this Model. The vendor who updated the Model. The updated_by of this Model. str
- `lifecycle_state` (str) — lifecycle_state of this Model. The state of the Model. Allowed values for this property are: "ACTIVE", "CREATING", "DELETING", "DELETED", "FAILED" The lifecycle_state of this Model. str
- `lifecycle_details` (str) — lifecycle_details of this Model. A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state. The lifecycle_details of this Model. str

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `updateRegisteredModel`
<a id='mlopsclient-updateregisteredmodel'></a>
(Preview) Updates a registered model with the provided details.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `updateRegisteredModelDetails` (model.UpdateRegisteredModelDetails) — Details to update the registered model.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `UpdateRegisteredModelResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.UpdateRegisteredModelResponseDetails

**Response Fields:**
- `name` (str) — name of this RegisteredModel. Unique name for the model. The name of this RegisteredModel. str
- `creation_timestamp` (int) — creation_timestamp of this RegisteredModel. Timestamp in milliseconds when the model was created. The creation_timestamp of this RegisteredModel. int
- `last_updated_timestamp` (int) — last_updated_timestamp of this RegisteredModel. Timestamp in milliseconds when metadata for the model was last updated. The last_updated_timestamp of this RegisteredModel. int
- `description` (str) — description of this RegisteredModel. Description of the registered model. The description of this RegisteredModel. str
- `latest_versions` (list[ModelVersion]) — latest_versions of this RegisteredModel. Collection of latest model versions for each stage. Only contains models with current READY status. The latest_versions of this RegisteredModel. list[oci.aidataplatform_dp.models.ModelVersion]
- `aliases` (list[RegisteredModelAlias]) — aliases of this RegisteredModel. Aliases pointing to model versions associated with this registered_model. The aliases of this RegisteredModel. list[oci.aidataplatform_dp.models.RegisteredModelAlias]
- `deployment_job_id` (str) — deployment_job_id of this RegisteredModel. Deployment job ID. The deployment_job_id of this RegisteredModel. str
- `deployment_job_state` (str) — deployment_job_state of this RegisteredModel. Job state. Allowed values for this property are: "DEPLOYMENT_JOB_CONNECTION_STATE_UNSPECIFIED", "NOT_SET_UP", "CONNECTED", "NOT_FOUND", "REQUIRED_PARAMETERS_CHANGED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The deployment_job_state of this RegisteredModel. str
- `tags` (list[RegisteredModelTag]) — tags of this RegisteredModel. Tags for the registered model. The tags of this RegisteredModel. list[oci.aidataplatform_dp.models.RegisteredModelTag]

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

### `updateRegisteredModelTags`
<a id='mlopsclient-updateregisteredmodeltags'></a>
(Preview) Updates tags on a registered model.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `updateRegisteredModelTagsDetails` (model.UpdateRegisteredModelTagsDetails) — Details of registered model tags.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dhUserPrincipal` (string) — The DH User Principal Header .

**Return Response:** `UpdateRegisteredModelTagsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.UpdateRegisteredModelTagsResponseDetails

**Response Fields:**
- `name` (str) — name of this RegisteredModel. Unique name for the model. The name of this RegisteredModel. str
- `creation_timestamp` (int) — creation_timestamp of this RegisteredModel. Timestamp in milliseconds when the model was created. The creation_timestamp of this RegisteredModel. int
- `last_updated_timestamp` (int) — last_updated_timestamp of this RegisteredModel. Timestamp in milliseconds when metadata for the model was last updated. The last_updated_timestamp of this RegisteredModel. int
- `description` (str) — description of this RegisteredModel. Description of the registered model. The description of this RegisteredModel. str
- `latest_versions` (list[ModelVersion]) — latest_versions of this RegisteredModel. Collection of latest model versions for each stage. Only contains models with current READY status. The latest_versions of this RegisteredModel. list[oci.aidataplatform_dp.models.ModelVersion]
- `aliases` (list[RegisteredModelAlias]) — aliases of this RegisteredModel. Aliases pointing to model versions associated with this registered_model. The aliases of this RegisteredModel. list[oci.aidataplatform_dp.models.RegisteredModelAlias]
- `deployment_job_id` (str) — deployment_job_id of this RegisteredModel. Deployment job ID. The deployment_job_id of this RegisteredModel. str
- `deployment_job_state` (str) — deployment_job_state of this RegisteredModel. Job state. Allowed values for this property are: "DEPLOYMENT_JOB_CONNECTION_STATE_UNSPECIFIED", "NOT_SET_UP", "CONNECTED", "NOT_FOUND", "REQUIRED_PARAMETERS_CHANGED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The deployment_job_state of this RegisteredModel. str
- `tags` (list[RegisteredModelTag]) — tags of this RegisteredModel. Tags for the registered model. The tags of this RegisteredModel. list[oci.aidataplatform_dp.models.RegisteredModelTag]

**Return:** [Back to Ml Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)

## Notebook (`NotebookClient`)
<a id='notebookclient-client'></a>
**Operations:**
- [`createContent`](#notebookclient-createcontent)
- [`createSession`](#notebookclient-createsession)
- [`deleteContent`](#notebookclient-deletecontent)
- [`deleteSession`](#notebookclient-deletesession)
- [`exportContents`](#notebookclient-exportcontents)
- [`getContent`](#notebookclient-getcontent)
- [`getSession`](#notebookclient-getsession)
- [`listSessions`](#notebookclient-listsessions)
- [`modifyContent`](#notebookclient-modifycontent)
- [`patchSession`](#notebookclient-patchsession)
- [`updateContent`](#notebookclient-updatecontent)

### `createContent`
<a id='notebookclient-createcontent'></a>
Creates a new, untitled, empty file or directory, or copies an existing notebook to a specified path. For example, a POST call to /api/contents/path with body containing copy_from set to /path/to/OtherNotebook.ipynb creates a new copy of OtherNotebook at the specified path.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `contentPath` (string) — The path to the notebook file.
- `createContentDetails` (model.CreateContentDetails) — Notebook content to create a new notebook.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.
- `datalakeTenantId` (string) — The tenant ID header.

**Return Response:** `CreateContentResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.Content

**Response Fields:**
- `name` (str) — **[Required]** name of this Content. Name of notebook, file or directory, equivalent to the last part of the path. The name of this Content. str
- `path` (str) — **[Required]** path of this Content. Full path for notebook, file or directory. The path of this Content. str
- `type` (str) — **[Required]** type of this Content. Type of content model. Allowed values for this property are: "notebook", "file", "directory", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The type of this Content. str
- `writable` (bool) — **[Required]** writable of this Content. Indicates whether the requester has permission to edit the file. The writable of this Content. bool
- `created` (datetime) — **[Required]** created of this Content. Creation timestamp. The created of this Content. datetime
- `last_modified` (datetime) — **[Required]** last_modified of this Content. Last modified timestamp. The last_modified of this Content. datetime
- `size` (int) — size of this Content. Size of file or notebook in bytes. If no size is provided, defaults to null. The size of this Content. int
- `mimetype` (str) — **[Required]** mimetype of this Content. Mimetype is only applicable for File model. For other models, it is None. If content is not null, and type is 'file', this contains the mimetype of file. For example, text/plain application/octet-stream. Otherwise this is null. The mimetype of this Content. str
- `content` (object) — **[Required]** content of this Content. Content if requested, otherwise is Null. For Notebook model, this contains a nbformat NotebookNode representing the .ipynb file represented by the model. For File model, content field is always Unicode type. For text-format file models, content simply contains the bytes of the file after decoding as UTF-8. Non-text (base64) files are read as bytes, base64 encoded, and then decoded as UTF-8. For Directory model, content field contains a list of content-free models representing the entities in the directory. The content of this Content. object
- `format` (str) — **[Required]** format of this Content. Format of content. For Notebook model, format field is always 'json'. For File model, format field is either 'text' or 'base64'. For directory model, format field is always 'json'. Allowed values for this property are: "NULL", "json", "text", "base64", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The format of this Content. str
- `hash` (str) — hash of this Content. [optional] The hexdigest hash string of content, if requested, otherwise null. It cannot be null if hashAlgorithm is defined. The hash of this Content. str
- `hash_algorithm` (str) — hash_algorithm of this Content. [optional] The algorithm used to produce the hash, if requested, (otherwise null). It cannot be null if hash is defined. <a href="https://docs.python.org/3/library/hashlib.html#hashlib.algorithms_available" target="_blank" rel="noopener noreferrer">Available algorithms</a>. The hash_algorithm of this Content. str
- `description` (str) — description of this Content. A user-provided description of the file. The description of this Content. str

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)

### `createSession`
<a id='notebookclient-createsession'></a>
Creates a new session or returns an existing session if a session for the given path already exists.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `createSessionDetails` (model.CreateSessionDetails) — Details to create a new session.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `datalakeTenantId` (string) — The tenant ID header.

**Return Response:** `CreateSessionResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.Session

**Response Fields:**
- `id` (str) — **[Required]** id of this Session. UUID of the notebook session. The id of this Session. str
- `name` (str) — **[Required]** name of this Session. A user-friendly name for the notebook session. The name of this Session. str
- `path` (str) — path of this Session. Path to notebook session. For example, /data/test.ipynb The path of this Session. str
- `type` (str) — type of this Session. Notebook session type. Allowed values for this property are: "notebook", "file", "agentflow", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The type of this Session. str
- `cluster_id` (str) — cluster_id of this Session. Cluster ID. The cluster_id of this Session. str
- `kernel` (Kernel) — kernel of this Session. The kernel of this Session. oci.aidataplatform_dp.models.Kernel
- `agent_flow_key` (str) — agent_flow_key of this Session. Agent Flow Key of an agent flow. The agent_flow_key of this Session. str
- `lifecycle_state` (str) — lifecycle_state of this Session. lifecycleState of a Notebook Session. Allowed values for this property are: "CREATING", "ACTIVE", "FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The lifecycle_state of this Session. str

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)

### `deleteContent`
<a id='notebookclient-deletecontent'></a>
Deletes a notebook file or directory.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `contentPath` (string) — The path to the notebook file.

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.

**Return Response:** `DeleteContentResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)

### `deleteSession`
<a id='notebookclient-deletesession'></a>
Delete a session with given session ID.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `sessionId` (string) — The ID of the Data Lake Notebook Session

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.

**Return Response:** `DeleteSessionResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)

### `exportContents`
<a id='notebookclient-exportcontents'></a>
Exports the notebook file contents. You can optionally specify HTML or ipynb format through the request payload. If no format is specified, ipynb is used by default.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `contentPath` (string) — The path to the notebook file.
- `exportContentsDetails` (model.ExportContentsDetails) — Payload to export contents of a file.

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `ExportContentsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.ExportedContents

**Response Fields:**
- `name` (str) — **[Required]** name of this ExportedContents. Name of file, equivalent to the last part of the path. The name of this ExportedContents. str
- `path` (str) — **[Required]** path of this ExportedContents. Full path of the file. The path of this ExportedContents. str
- `content` (object) — **[Required]** content of this ExportedContents. For ipynb format, this contains a string representing the .ipynb file. For html format, this contains a string representing the HTML page, it has base64 encoded data for images. The content of this ExportedContents. object
- `format` (str) — **[Required]** format of this ExportedContents. Format of content as requested by the client. By default, ipynb format. Allowed values for this property are: "html", "ipynb", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The format of this ExportedContents. str

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)

### `getContent`
<a id='notebookclient-getcontent'></a>
Returns a list of contents for a given file or directory. You can optionally specify a type and/or format argument via URL parameter. When given, the Content service returns a model in the requested type and/or format. If the request cannot be satisfied, for example if type=text is requested, but the file is binary, then the request returns a 400 message and a JSON response with a Reason field identifying the issue. The value of the Reason field is ‘bad format’ or ‘bad type’, depending on what was requested.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `contentPath` (string) — The path to the notebook file.

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `type` (GetContentRequest.Type) — Content type. Either file, directory, or notebook.
- `format` (GetContentRequest.Format) — The format in which content should be returned. Either text, base64, or JSON.
- `content` (number) — Returns content based on param value. When set to 0, content is NOT returned. When set to 1, content is returned.
- `hash` (number) — Returns hash hexdigest string of content and the hash algorithm. 0 for no hash, 1 for return hash. 0 is default. It may be ignored by the content manager.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `GetContentResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.Content

**Response Fields:**
- `name` (str) — **[Required]** name of this Content. Name of notebook, file or directory, equivalent to the last part of the path. The name of this Content. str
- `path` (str) — **[Required]** path of this Content. Full path for notebook, file or directory. The path of this Content. str
- `type` (str) — **[Required]** type of this Content. Type of content model. Allowed values for this property are: "notebook", "file", "directory", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The type of this Content. str
- `writable` (bool) — **[Required]** writable of this Content. Indicates whether the requester has permission to edit the file. The writable of this Content. bool
- `created` (datetime) — **[Required]** created of this Content. Creation timestamp. The created of this Content. datetime
- `last_modified` (datetime) — **[Required]** last_modified of this Content. Last modified timestamp. The last_modified of this Content. datetime
- `size` (int) — size of this Content. Size of file or notebook in bytes. If no size is provided, defaults to null. The size of this Content. int
- `mimetype` (str) — **[Required]** mimetype of this Content. Mimetype is only applicable for File model. For other models, it is None. If content is not null, and type is 'file', this contains the mimetype of file. For example, text/plain application/octet-stream. Otherwise this is null. The mimetype of this Content. str
- `content` (object) — **[Required]** content of this Content. Content if requested, otherwise is Null. For Notebook model, this contains a nbformat NotebookNode representing the .ipynb file represented by the model. For File model, content field is always Unicode type. For text-format file models, content simply contains the bytes of the file after decoding as UTF-8. Non-text (base64) files are read as bytes, base64 encoded, and then decoded as UTF-8. For Directory model, content field contains a list of content-free models representing the entities in the directory. The content of this Content. object
- `format` (str) — **[Required]** format of this Content. Format of content. For Notebook model, format field is always 'json'. For File model, format field is either 'text' or 'base64'. For directory model, format field is always 'json'. Allowed values for this property are: "NULL", "json", "text", "base64", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The format of this Content. str
- `hash` (str) — hash of this Content. [optional] The hexdigest hash string of content, if requested, otherwise null. It cannot be null if hashAlgorithm is defined. The hash of this Content. str
- `hash_algorithm` (str) — hash_algorithm of this Content. [optional] The algorithm used to produce the hash, if requested, (otherwise null). It cannot be null if hash is defined. <a href="https://docs.python.org/3/library/hashlib.html#hashlib.algorithms_available" target="_blank" rel="noopener noreferrer">Available algorithms</a>. The hash_algorithm of this Content. str
- `description` (str) — description of this Content. A user-provided description of the file. The description of this Content. str

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)

### `getSession`
<a id='notebookclient-getsession'></a>
Returns session details for a given session ID.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `sessionId` (string) — The ID of the Data Lake Notebook Session

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `GetSessionResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.Session

**Response Fields:**
- `id` (str) — **[Required]** id of this Session. UUID of the notebook session. The id of this Session. str
- `name` (str) — **[Required]** name of this Session. A user-friendly name for the notebook session. The name of this Session. str
- `path` (str) — path of this Session. Path to notebook session. For example, /data/test.ipynb The path of this Session. str
- `type` (str) — type of this Session. Notebook session type. Allowed values for this property are: "notebook", "file", "agentflow", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The type of this Session. str
- `cluster_id` (str) — cluster_id of this Session. Cluster ID. The cluster_id of this Session. str
- `kernel` (Kernel) — kernel of this Session. The kernel of this Session. oci.aidataplatform_dp.models.Kernel
- `agent_flow_key` (str) — agent_flow_key of this Session. Agent Flow Key of an agent flow. The agent_flow_key of this Session. str
- `lifecycle_state` (str) — lifecycle_state of this Session. lifecycleState of a Notebook Session. Allowed values for this property are: "CREATING", "ACTIVE", "FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The lifecycle_state of this Session. str

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)

### `listSessions`
<a id='notebookclient-listsessions'></a>
Returns a list of all available sessions.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace

**Optional Parameters:**
- `clusterId` (string) — Cluster ID attached to a session.
- `path` (string) — Notebook file path attached to a session.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `agentFlowKey` (string) — Agent flow key of the attached agent flow.

**Return Response:** `ListSessionsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.SessionCollection

**Response Fields:**
- `id` (str) — **[Required]** id of this Session. UUID of the notebook session. The id of this Session. str
- `name` (str) — **[Required]** name of this Session. A user-friendly name for the notebook session. The name of this Session. str
- `path` (str) — path of this Session. Path to notebook session. For example, /data/test.ipynb The path of this Session. str
- `type` (str) — type of this Session. Notebook session type. Allowed values for this property are: "notebook", "file", "agentflow", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The type of this Session. str
- `cluster_id` (str) — cluster_id of this Session. Cluster ID. The cluster_id of this Session. str
- `kernel` (Kernel) — kernel of this Session. The kernel of this Session. oci.aidataplatform_dp.models.Kernel
- `agent_flow_key` (str) — agent_flow_key of this Session. Agent Flow Key of an agent flow. The agent_flow_key of this Session. str
- `lifecycle_state` (str) — lifecycle_state of this Session. lifecycleState of a Notebook Session. Allowed values for this property are: "CREATING", "ACTIVE", "FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The lifecycle_state of this Session. str

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)

### `modifyContent`
<a id='notebookclient-modifycontent'></a>
Renames a file or directory without re-uploading content.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `contentPath` (string) — The path to the notebook file.
- `modifyContentDetails` (model.ModifyContentDetails) — New path for file or directory.

**Optional Parameters:**
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `ModifyContentResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.Content

**Response Fields:**
- `name` (str) — **[Required]** name of this Content. Name of notebook, file or directory, equivalent to the last part of the path. The name of this Content. str
- `path` (str) — **[Required]** path of this Content. Full path for notebook, file or directory. The path of this Content. str
- `type` (str) — **[Required]** type of this Content. Type of content model. Allowed values for this property are: "notebook", "file", "directory", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The type of this Content. str
- `writable` (bool) — **[Required]** writable of this Content. Indicates whether the requester has permission to edit the file. The writable of this Content. bool
- `created` (datetime) — **[Required]** created of this Content. Creation timestamp. The created of this Content. datetime
- `last_modified` (datetime) — **[Required]** last_modified of this Content. Last modified timestamp. The last_modified of this Content. datetime
- `size` (int) — size of this Content. Size of file or notebook in bytes. If no size is provided, defaults to null. The size of this Content. int
- `mimetype` (str) — **[Required]** mimetype of this Content. Mimetype is only applicable for File model. For other models, it is None. If content is not null, and type is 'file', this contains the mimetype of file. For example, text/plain application/octet-stream. Otherwise this is null. The mimetype of this Content. str
- `content` (object) — **[Required]** content of this Content. Content if requested, otherwise is Null. For Notebook model, this contains a nbformat NotebookNode representing the .ipynb file represented by the model. For File model, content field is always Unicode type. For text-format file models, content simply contains the bytes of the file after decoding as UTF-8. Non-text (base64) files are read as bytes, base64 encoded, and then decoded as UTF-8. For Directory model, content field contains a list of content-free models representing the entities in the directory. The content of this Content. object
- `format` (str) — **[Required]** format of this Content. Format of content. For Notebook model, format field is always 'json'. For File model, format field is either 'text' or 'base64'. For directory model, format field is always 'json'. Allowed values for this property are: "NULL", "json", "text", "base64", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The format of this Content. str
- `hash` (str) — hash of this Content. [optional] The hexdigest hash string of content, if requested, otherwise null. It cannot be null if hashAlgorithm is defined. The hash of this Content. str
- `hash_algorithm` (str) — hash_algorithm of this Content. [optional] The algorithm used to produce the hash, if requested, (otherwise null). It cannot be null if hash is defined. <a href="https://docs.python.org/3/library/hashlib.html#hashlib.algorithms_available" target="_blank" rel="noopener noreferrer">Available algorithms</a>. The hash_algorithm of this Content. str
- `description` (str) — description of this Content. A user-provided description of the file. The description of this Content. str

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)

### `patchSession`
<a id='notebookclient-patchsession'></a>
Patches a session with a given ID with the provided details. You can use this to rename a session.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `sessionId` (string) — The ID of the Data Lake Notebook Session
- `patchSessionDetails` (model.PatchSessionDetails) — Details to patch for an existing session.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `PatchSessionResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.Session

**Response Fields:**
- `id` (str) — **[Required]** id of this Session. UUID of the notebook session. The id of this Session. str
- `name` (str) — **[Required]** name of this Session. A user-friendly name for the notebook session. The name of this Session. str
- `path` (str) — path of this Session. Path to notebook session. For example, /data/test.ipynb The path of this Session. str
- `type` (str) — type of this Session. Notebook session type. Allowed values for this property are: "notebook", "file", "agentflow", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The type of this Session. str
- `cluster_id` (str) — cluster_id of this Session. Cluster ID. The cluster_id of this Session. str
- `kernel` (Kernel) — kernel of this Session. The kernel of this Session. oci.aidataplatform_dp.models.Kernel
- `agent_flow_key` (str) — agent_flow_key of this Session. Agent Flow Key of an agent flow. The agent_flow_key of this Session. str
- `lifecycle_state` (str) — lifecycle_state of this Session. lifecycleState of a Notebook Session. Allowed values for this property are: "CREATING", "ACTIVE", "FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The lifecycle_state of this Session. str

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)

### `updateContent`
<a id='notebookclient-updatecontent'></a>
Updates the contents of an existing notebook with the provided details or saves a new notebook.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `contentPath` (string) — The path to the notebook file.
- `updateContentDetails` (model.UpdateContentDetails) — Details to update the notebook content model file.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `UpdateContentResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.Content

**Response Fields:**
- `name` (str) — **[Required]** name of this Content. Name of notebook, file or directory, equivalent to the last part of the path. The name of this Content. str
- `path` (str) — **[Required]** path of this Content. Full path for notebook, file or directory. The path of this Content. str
- `type` (str) — **[Required]** type of this Content. Type of content model. Allowed values for this property are: "notebook", "file", "directory", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The type of this Content. str
- `writable` (bool) — **[Required]** writable of this Content. Indicates whether the requester has permission to edit the file. The writable of this Content. bool
- `created` (datetime) — **[Required]** created of this Content. Creation timestamp. The created of this Content. datetime
- `last_modified` (datetime) — **[Required]** last_modified of this Content. Last modified timestamp. The last_modified of this Content. datetime
- `size` (int) — size of this Content. Size of file or notebook in bytes. If no size is provided, defaults to null. The size of this Content. int
- `mimetype` (str) — **[Required]** mimetype of this Content. Mimetype is only applicable for File model. For other models, it is None. If content is not null, and type is 'file', this contains the mimetype of file. For example, text/plain application/octet-stream. Otherwise this is null. The mimetype of this Content. str
- `content` (object) — **[Required]** content of this Content. Content if requested, otherwise is Null. For Notebook model, this contains a nbformat NotebookNode representing the .ipynb file represented by the model. For File model, content field is always Unicode type. For text-format file models, content simply contains the bytes of the file after decoding as UTF-8. Non-text (base64) files are read as bytes, base64 encoded, and then decoded as UTF-8. For Directory model, content field contains a list of content-free models representing the entities in the directory. The content of this Content. object
- `format` (str) — **[Required]** format of this Content. Format of content. For Notebook model, format field is always 'json'. For File model, format field is either 'text' or 'base64'. For directory model, format field is always 'json'. Allowed values for this property are: "NULL", "json", "text", "base64", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The format of this Content. str
- `hash` (str) — hash of this Content. [optional] The hexdigest hash string of content, if requested, otherwise null. It cannot be null if hashAlgorithm is defined. The hash of this Content. str
- `hash_algorithm` (str) — hash_algorithm of this Content. [optional] The algorithm used to produce the hash, if requested, (otherwise null). It cannot be null if hash is defined. <a href="https://docs.python.org/3/library/hashlib.html#hashlib.algorithms_available" target="_blank" rel="noopener noreferrer">Available algorithms</a>. The hash_algorithm of this Content. str
- `description` (str) — description of this Content. A user-provided description of the file. The description of this Content. str

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)

## Role (`RoleClient`)
<a id='roleclient-client'></a>
**Operations:**
- [`addMemberToRole`](#roleclient-addmembertorole)
- [`createRole`](#roleclient-createrole)
- [`deleteRole`](#roleclient-deleterole)
- [`getRole`](#roleclient-getrole)
- [`listRolePermissions`](#roleclient-listrolepermissions)
- [`listRoles`](#roleclient-listroles)
- [`removeMemberFromRole`](#roleclient-removememberfromrole)
- [`updateRole`](#roleclient-updaterole)

### `addMemberToRole`
<a id='roleclient-addmembertorole'></a>
Assigns a given user/group/principal to a role.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `roleKey` (string) — The unique key of the Role.
- `addMemberToRoleDetails` (model.AddMemberToRoleDetails) — The details of the assignee(s) to which a role is assigned.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `AddMemberToRoleResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Role (`RoleClient`)](#roleclient-client) • [Top](#top)

### `createRole`
<a id='roleclient-createrole'></a>
Creates a role.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `createRoleDetails` (model.CreateRoleDetails) — Details for the new role.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `CreateRoleResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.Role

**Response Fields:**
- `key` (str) — **[Required]** key of this Role. A unique key for the role. It cannot be changed. The key of this Role. str
- `display_name` (str) — display_name of this Role. The role name. It can be changed. The display_name of this Role. str
- `role_type` (str) — role_type of this Role. Type of role. Allowed values for this property are: "SYSTEM", "CUSTOM", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The role_type of this Role. str
- `time_created` (datetime) — time_created of this Role. The time the role was created. An RFC3339 formatted datetime string. The time_created of this Role. datetime
- `time_updated` (datetime) — time_updated of this Role. The time the Role was updated. An RFC3339 formatted datetime string. The time_updated of this Role. datetime
- `created_by` (str) — created_by of this Role. The user name of the user/principal who created the role. The created_by of this Role. str
- `updated_by` (str) — updated_by of this Role. The user name of the user/principal who updated the role. The updated_by of this Role. str
- `is_assigned` (bool) — is_assigned of this Role. The role is assigned to the current user or a group that the user is part of. The is_assigned of this Role. bool
- `assignees` (list[RoleAssignee]) — assignees of this Role. The users and groups this role is assigned to. The assignees of this Role. list[oci.aidataplatform_dp.models.RoleAssignee]
- `lifecycle_state` (str) — lifecycle_state of this Role. The state of the role. Allowed values for this property are: "ACTIVE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The lifecycle_state of this Role. str
- `lifecycle_details` (str) — lifecycle_details of this Role. A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state. The lifecycle_details of this Role. str
- `description` (str) — description of this Role. The description of the role. The description of this Role. str

**Return:** [Back to Role (`RoleClient`)](#roleclient-client) • [Top](#top)

### `deleteRole`
<a id='roleclient-deleterole'></a>
Deletes a role.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `roleKey` (string) — The unique key of the Role.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `DeleteRoleResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Role (`RoleClient`)](#roleclient-client) • [Top](#top)

### `getRole`
<a id='roleclient-getrole'></a>
Returns detailed information about a role.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `roleKey` (string) — The unique key of the Role.

**Optional Parameters:**
- `roleScope` (model.GetRoleScopeType) — The scope of roles to be returned. Defaults to USER.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `GetRoleResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.Role

**Response Fields:**
- `key` (str) — **[Required]** key of this Role. A unique key for the role. It cannot be changed. The key of this Role. str
- `display_name` (str) — display_name of this Role. The role name. It can be changed. The display_name of this Role. str
- `role_type` (str) — role_type of this Role. Type of role. Allowed values for this property are: "SYSTEM", "CUSTOM", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The role_type of this Role. str
- `time_created` (datetime) — time_created of this Role. The time the role was created. An RFC3339 formatted datetime string. The time_created of this Role. datetime
- `time_updated` (datetime) — time_updated of this Role. The time the Role was updated. An RFC3339 formatted datetime string. The time_updated of this Role. datetime
- `created_by` (str) — created_by of this Role. The user name of the user/principal who created the role. The created_by of this Role. str
- `updated_by` (str) — updated_by of this Role. The user name of the user/principal who updated the role. The updated_by of this Role. str
- `is_assigned` (bool) — is_assigned of this Role. The role is assigned to the current user or a group that the user is part of. The is_assigned of this Role. bool
- `assignees` (list[RoleAssignee]) — assignees of this Role. The users and groups this role is assigned to. The assignees of this Role. list[oci.aidataplatform_dp.models.RoleAssignee]
- `lifecycle_state` (str) — lifecycle_state of this Role. The state of the role. Allowed values for this property are: "ACTIVE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The lifecycle_state of this Role. str
- `lifecycle_details` (str) — lifecycle_details of this Role. A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state. The lifecycle_details of this Role. str
- `description` (str) — description of this Role. The description of the role. The description of this Role. str

**Return:** [Back to Role (`RoleClient`)](#roleclient-client) • [Top](#top)

### `listRolePermissions`
<a id='roleclient-listrolepermissions'></a>
Returns a list of permissions for a given role.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `roleKey` (string) — The unique key of the Role.

**Optional Parameters:**
- `permissionScope` (model.ListRolePermissionScopeType) — The scope of role permissions to be returned. Defaults to ALL
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination](
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination](
- `sortOrder` (model.SortOrder) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (ListRolePermissionsRequest.SortBy) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `ListRolePermissionsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.RolePermissionCollection

**Response Fields:**
- `items` (list[RolePermissionSummary]) — **[Required]** items of this RolePermissionCollection. Role permissions. The items of this RolePermissionCollection. list[oci.aidataplatform_dp.models.RolePermissionSummary]

**Return:** [Back to Role (`RoleClient`)](#roleclient-client) • [Top](#top)

### `listRoles`
<a id='roleclient-listroles'></a>
Returns a list of roles.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `lifecycleState` (string) — A filter to return only resources that match the given lifecycle state. The state value is case-insensitive.
- `displayName` (string) — A filter to return only resources that match the given display name exactly.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination](
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination](
- `sortOrder` (model.SortOrder) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (ListRolesRequest.SortBy) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `ListRolesResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.RoleCollection

**Response Fields:**
- `key` (str) — **[Required]** key of this Role. A unique key for the role. It cannot be changed. The key of this Role. str
- `display_name` (str) — display_name of this Role. The role name. It can be changed. The display_name of this Role. str
- `role_type` (str) — role_type of this Role. Type of role. Allowed values for this property are: "SYSTEM", "CUSTOM", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The role_type of this Role. str
- `time_created` (datetime) — time_created of this Role. The time the role was created. An RFC3339 formatted datetime string. The time_created of this Role. datetime
- `time_updated` (datetime) — time_updated of this Role. The time the Role was updated. An RFC3339 formatted datetime string. The time_updated of this Role. datetime
- `created_by` (str) — created_by of this Role. The user name of the user/principal who created the role. The created_by of this Role. str
- `updated_by` (str) — updated_by of this Role. The user name of the user/principal who updated the role. The updated_by of this Role. str
- `is_assigned` (bool) — is_assigned of this Role. The role is assigned to the current user or a group that the user is part of. The is_assigned of this Role. bool
- `assignees` (list[RoleAssignee]) — assignees of this Role. The users and groups this role is assigned to. The assignees of this Role. list[oci.aidataplatform_dp.models.RoleAssignee]
- `lifecycle_state` (str) — lifecycle_state of this Role. The state of the role. Allowed values for this property are: "ACTIVE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The lifecycle_state of this Role. str
- `lifecycle_details` (str) — lifecycle_details of this Role. A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state. The lifecycle_details of this Role. str
- `description` (str) — description of this Role. The description of the role. The description of this Role. str

**Return:** [Back to Role (`RoleClient`)](#roleclient-client) • [Top](#top)

### `removeMemberFromRole`
<a id='roleclient-removememberfromrole'></a>
Revoke a role from a given user or group.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `roleKey` (string) — The unique key of the Role.
- `removeMemberFromRoleDetails` (model.RemoveMemberFromRoleDetails) — The details of the user or group from which the role is to be revoked.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `RemoveMemberFromRoleResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Role (`RoleClient`)](#roleclient-client) • [Top](#top)

### `updateRole`
<a id='roleclient-updaterole'></a>
Updates a role with the provided information.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `roleKey` (string) — The unique key of the Role.
- `updateRoleDetails` (model.UpdateRoleDetails) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `UpdateRoleResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.Role

**Response Fields:**
- `key` (str) — **[Required]** key of this Role. A unique key for the role. It cannot be changed. The key of this Role. str
- `display_name` (str) — display_name of this Role. The role name. It can be changed. The display_name of this Role. str
- `role_type` (str) — role_type of this Role. Type of role. Allowed values for this property are: "SYSTEM", "CUSTOM", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The role_type of this Role. str
- `time_created` (datetime) — time_created of this Role. The time the role was created. An RFC3339 formatted datetime string. The time_created of this Role. datetime
- `time_updated` (datetime) — time_updated of this Role. The time the Role was updated. An RFC3339 formatted datetime string. The time_updated of this Role. datetime
- `created_by` (str) — created_by of this Role. The user name of the user/principal who created the role. The created_by of this Role. str
- `updated_by` (str) — updated_by of this Role. The user name of the user/principal who updated the role. The updated_by of this Role. str
- `is_assigned` (bool) — is_assigned of this Role. The role is assigned to the current user or a group that the user is part of. The is_assigned of this Role. bool
- `assignees` (list[RoleAssignee]) — assignees of this Role. The users and groups this role is assigned to. The assignees of this Role. list[oci.aidataplatform_dp.models.RoleAssignee]
- `lifecycle_state` (str) — lifecycle_state of this Role. The state of the role. Allowed values for this property are: "ACTIVE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The lifecycle_state of this Role. str
- `lifecycle_details` (str) — lifecycle_details of this Role. A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state. The lifecycle_details of this Role. str
- `description` (str) — description of this Role. The description of the role. The description of this Role. str

**Return:** [Back to Role (`RoleClient`)](#roleclient-client) • [Top](#top)

## Schema (`SchemaClient`)
<a id='schemaclient-client'></a>
**Operations:**
- [`createDataTable`](#schemaclient-createdatatable)
- [`createSchema`](#schemaclient-createschema)
- [`createTable`](#schemaclient-createtable)
- [`createView`](#schemaclient-createview)
- [`deleteSchema`](#schemaclient-deleteschema)
- [`deleteTable`](#schemaclient-deletetable)
- [`deleteView`](#schemaclient-deleteview)
- [`generateTempFileUploadTarget`](#schemaclient-generatetempfileuploadtarget)
- [`getSchema`](#schemaclient-getschema)
- [`getTable`](#schemaclient-gettable)
- [`getView`](#schemaclient-getview)
- [`listSchemaPermissions`](#schemaclient-listschemapermissions)
- [`listSchemas`](#schemaclient-listschemas)
- [`listTablePermissions`](#schemaclient-listtablepermissions)
- [`listTables`](#schemaclient-listtables)
- [`listViewPermissions`](#schemaclient-listviewpermissions)
- [`listViews`](#schemaclient-listviews)
- [`manageSchemaPermission`](#schemaclient-manageschemapermission)
- [`manageTablePermission`](#schemaclient-managetablepermission)
- [`manageViewPermission`](#schemaclient-manageviewpermission)
- [`performInferSchema`](#schemaclient-performinferschema)
- [`performInferSchemaWithPreview`](#schemaclient-performinferschemawithpreview)
- [`refreshSchema`](#schemaclient-refreshschema)
- [`refreshTable`](#schemaclient-refreshtable)
- [`retrievePar`](#schemaclient-retrievepar)
- [`updateSchema`](#schemaclient-updateschema)
- [`updateTable`](#schemaclient-updatetable)
- [`updateView`](#schemaclient-updateview)

### `createDataTable`
<a id='schemaclient-createdatatable'></a>
Creates a managed table with data loaded from a sample file.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `createDataTableDetails` (model.CreateDataTableDetails) — Details for the new managed table with data.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `CreateDataTableResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)

### `createSchema`
<a id='schemaclient-createschema'></a>
Creates a schema.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `createSchemaDetails` (model.CreateSchemaDetails) — Details for the new schema.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `CreateSchemaResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)

### `createTable`
<a id='schemaclient-createtable'></a>
Creates a table.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `createTableDetails` (model.CreateTableDetails) — Details for the new table.

**Optional Parameters:**
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `CreateTableResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)

### `createView`
<a id='schemaclient-createview'></a>
Creates a view.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `createViewDetails` (model.CreateViewDetails) — Details for the new view.

**Optional Parameters:**
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `CreateViewResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.View

**Response Fields:**
- `key` (str) — key of this View. The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name> The key of this View. str
- `display_name` (str) — **[Required]** display_name of this View. A user-friendly name. Has to be unique within the scope of the schema and is changeable. The display_name of this View. str
- `catalog_key` (str) — catalog_key of this View. The name of the catalog to which this view belongs. The catalog_key of this View. str
- `schema_key` (str) — schema_key of this View. The name of the Schema to which this view belongs. The schema_key of this View. str
- `view_text` (str) — view_text of this View. The Query used to create the view. The view_text of this View. str
- `description` (str) — description of this View. The description of the view. The description of this View. str
- `view_fields` (list[ViewFieldDetails]) — view_fields of this View. Columns for view. The view_fields of this View. list[oci.aidataplatform_dp.models.ViewFieldDetails]
- `time_created` (datetime) — time_created of this View. The date and time the View was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2016-08-25T21:10:29.600Z The time_created of this View. datetime
- `time_updated` (datetime) — time_updated of this View. The date and time the View was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2016-08-25T21:10:29.600Z The time_updated of this View. datetime
- `created_by` (str) — created_by of this View. The ID of the user/principal who created the view. The created_by of this View. str
- `updated_by` (str) — updated_by of this View. The ID of the user who last updated the view. The updated_by of this View. str
- `view_properties` (list[ViewProperty]) — view_properties of this View. View Properties. The view_properties of this View. list[oci.aidataplatform_dp.models.ViewProperty]
- `lifecycle_state` (str) — lifecycle_state of this View. The state of the view. Allowed values for this property are: "ACTIVE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The lifecycle_state of this View. str
- `lifecycle_state_details` (str) — lifecycle_state_details of this View. A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state. The lifecycle_state_details of this View. str

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)

### `deleteSchema`
<a id='schemaclient-deleteschema'></a>
Deletes a schema from an AI Data Platform Workbench.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `schemaKey` (string) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.

**Optional Parameters:**
- `isForced` (boolean) — A boolean which decides if an entity should be deleted with Cascade effect
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `DeleteSchemaResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)

### `deleteTable`
<a id='schemaclient-deletetable'></a>
Deletes a table from an AI Data Platform Workbench.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `tableKey` (string) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.

**Optional Parameters:**
- `displayName` (string) — A filter to return only resources that match the given display name exactly.
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `DeleteTableResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)

### `deleteView`
<a id='schemaclient-deleteview'></a>
Deletes a view from AI Data Platform Workbench.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `viewKey` (string) — The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>.

**Optional Parameters:**
- `displayName` (string) — A filter to return only resources that match the given display name exactly.
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `DeleteViewResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)

### `generateTempFileUploadTarget`
<a id='schemaclient-generatetempfileuploadtarget'></a>
Generates a URI for uploading a sample file to a temporary folder in a schema.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `schemaKey` (string) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `GenerateTempFileUploadTargetResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.GenerateTempFileUploadTargetResponseDetails

**Response Fields:**
- `temp_file_upload_target` (str) — **[Required]** temp_file_upload_target of this GenerateTempFileUploadTargetResponseDetails. The generated target URI to upload the file, it must be prefixed by object stroage URL. The temp_file_upload_target of this GenerateTempFileUploadTargetResponseDetails. str
- `upload_key` (str) — **[Required]** upload_key of this GenerateTempFileUploadTargetResponseDetails. The unique key for this request. The upload_key of this GenerateTempFileUploadTargetResponseDetails. str
- `oci_file_path` (str) — **[Required]** oci_file_path of this GenerateTempFileUploadTargetResponseDetails. The exact URI path of the object storage. The oci_file_path of this GenerateTempFileUploadTargetResponseDetails. str

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)

### `getSchema`
<a id='schemaclient-getschema'></a>
Returns detailed information about a specified schema.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `schemaKey` (string) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `GetSchemaResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.Schema

**Response Fields:**
- `entity_type` (str) — **[Required]** entity_type of this Schema. An enum to decide the type of the derived model. Allowed values for this property are: "ADW", "ALH", "STANDARD", "KAFKA_TOPIC", "ATP", "ORACLE", "EXADATA", "ORACLE_ANALYTICS", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The entity_type of this Schema. str
- `key` (str) — **[Required]** key of this Schema. The fully qualified name of the schema in the format <catalog_name>.<schema_name>. The key of this Schema. str
- `display_name` (str) — **[Required]** display_name of this Schema. Schema name. The display_name of this Schema. str
- `description` (str) — description of this Schema. Schema description. The description of this Schema. str
- `time_created` (datetime) — time_created of this Schema. The date and time the schema was created. The time_created of this Schema. datetime
- `time_updated` (datetime) — time_updated of this Schema. The date and time the schema was updated. The time_updated of this Schema. datetime
- `created_by` (str) — created_by of this Schema. ID of the user who created the schema. The created_by of this Schema. str
- `updated_by` (str) — updated_by of this Schema. ID of the user who last updated the schema. The updated_by of this Schema. str
- `properties` (dict(str, str)) — properties of this Schema. Key-value pair representing a defined tag key and value. The properties of this Schema. dict(str, str)
- `catalog_name` (str) — catalog_name of this Schema. The name of the catalog to which this schema belongs. The catalog_name of this Schema. str
- `lifecycle_state` (str) — lifecycle_state of this Schema. The current state of the schema. Allowed values for this property are: "ACTIVE", "CREATING", "DELETING", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The lifecycle_state of this Schema. str
- `lifecycle_state_details` (str) — lifecycle_state_details of this Schema. A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state. The lifecycle_state_details of this Schema. str
- `details` (dict(str, str)) — details of this Schema. Deprecated field. Map of key-value pairs. This object will be only provided when the parent catalog is external. The details of this Schema. dict(str, str)

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)

### `getTable`
<a id='schemaclient-gettable'></a>
Returns detailed information about a table.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `tableKey` (string) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `GetTableResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.Table

**Response Fields:**
- `entity_type` (str) — **[Required]** entity_type of this Table. An enum to decide the type of the derived model Allowed values for this property are: "ADW", "ALH", "STANDARD", "ATP", "ORACLE", "EXADATA", "ORACLE_ANALYTICS", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The entity_type of this Table. str
- `key` (str) — key of this Table. The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>. The key of this Table. str
- `display_name` (str) — **[Required]** display_name of this Table. Table name. The display_name of this Table. str
- `catalog_key` (str) — catalog_key of this Table. The name of the catalog to which this table belongs. The catalog_key of this Table. str
- `schema_key` (str) — schema_key of this Table. The name of the schema to which this table belongs. The schema_key of this Table. str
- `location` (str) — location of this Table. Location of the table data. The location of this Table. str
- `description` (str) — description of this Table. Table description. The description of this Table. str
- `table_type` (str) — table_type of this Table. Type of table. Managed, external or mount table. Allowed values for this property are: "MANAGED", "EXTERNAL", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The table_type of this Table. str
- `managed_table_definition` (ManagedTableDefinition) — managed_table_definition of this Table. The managed_table_definition of this Table. oci.aidataplatform_dp.models.ManagedTableDefinition
- `external_table_definition` (ExternalTableDefinition) — external_table_definition of this Table. The external_table_definition of this Table. oci.aidataplatform_dp.models.ExternalTableDefinition
- `table_fields` (list[TableFieldDetails]) — table_fields of this Table. Columns for table. The table_fields of this Table. list[oci.aidataplatform_dp.models.TableFieldDetails]
- `partition_keys` (list[TableFieldDetails]) — partition_keys of this Table. Columns to be used in partition for table. The partition_keys of this Table. list[oci.aidataplatform_dp.models.TableFieldDetails]
- `table_properties` (list[TableProperty]) — table_properties of this Table. Table properties. The table_properties of this Table. list[oci.aidataplatform_dp.models.TableProperty]
- `time_created` (datetime) — time_created of this Table. The date and time the table was created. The time_created of this Table. datetime
- `time_updated` (datetime) — time_updated of this Table. The date and time the table was updated. The time_updated of this Table. datetime
- `created_by` (str) — created_by of this Table. The OCID of the user/principal who created the table. The created_by of this Table. str
- `updated_by` (str) — updated_by of this Table. The ID of the user who last updated the schema. The updated_by of this Table. str
- `lifecycle_state` (str) — lifecycle_state of this Table. The state of the table. Allowed values for this property are: "ACTIVE", "CREATING", "DELETING", "UPDATING", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The lifecycle_state of this Table. str
- `lifecycle_state_details` (str) — lifecycle_state_details of this Table. A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state. The lifecycle_state_details of this Table. str

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)

### `getView`
<a id='schemaclient-getview'></a>
Returns information about a view.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `viewKey` (string) — The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>.

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `GetViewResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.View

**Response Fields:**
- `key` (str) — key of this View. The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name> The key of this View. str
- `display_name` (str) — **[Required]** display_name of this View. A user-friendly name. Has to be unique within the scope of the schema and is changeable. The display_name of this View. str
- `catalog_key` (str) — catalog_key of this View. The name of the catalog to which this view belongs. The catalog_key of this View. str
- `schema_key` (str) — schema_key of this View. The name of the Schema to which this view belongs. The schema_key of this View. str
- `view_text` (str) — view_text of this View. The Query used to create the view. The view_text of this View. str
- `description` (str) — description of this View. The description of the view. The description of this View. str
- `view_fields` (list[ViewFieldDetails]) — view_fields of this View. Columns for view. The view_fields of this View. list[oci.aidataplatform_dp.models.ViewFieldDetails]
- `time_created` (datetime) — time_created of this View. The date and time the View was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2016-08-25T21:10:29.600Z The time_created of this View. datetime
- `time_updated` (datetime) — time_updated of this View. The date and time the View was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2016-08-25T21:10:29.600Z The time_updated of this View. datetime
- `created_by` (str) — created_by of this View. The ID of the user/principal who created the view. The created_by of this View. str
- `updated_by` (str) — updated_by of this View. The ID of the user who last updated the view. The updated_by of this View. str
- `view_properties` (list[ViewProperty]) — view_properties of this View. View Properties. The view_properties of this View. list[oci.aidataplatform_dp.models.ViewProperty]
- `lifecycle_state` (str) — lifecycle_state of this View. The state of the view. Allowed values for this property are: "ACTIVE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The lifecycle_state of this View. str
- `lifecycle_state_details` (str) — lifecycle_state_details of this View. A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state. The lifecycle_state_details of this View. str

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)

### `listSchemaPermissions`
<a id='schemaclient-listschemapermissions'></a>
Returns a list of permissions for a given schema.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `schemaKey` (string) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.

**Optional Parameters:**
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination](
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination](
- `sortOrder` (model.SortOrder) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (ListSchemaPermissionsRequest.SortBy) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `ListSchemaPermissionsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.SchemaPermissionCollection

**Response Fields:**
- `items` (list[SchemaPermissionSummary]) — **[Required]** items of this SchemaPermissionCollection. List of schema permissions. The items of this SchemaPermissionCollection. list[oci.aidataplatform_dp.models.SchemaPermissionSummary]

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)

### `listSchemas`
<a id='schemaclient-listschemas'></a>
Returns a list of schemas in a given AI Data Platform Workbench.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `catalogKey` (string) — The key of the catalog.

**Optional Parameters:**
- `displayName` (string) — A filter to return only resources that match the given display name exactly.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination](
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination](
- `sortOrder` (model.SortOrder) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (ListSchemasRequest.SortBy) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `ListSchemasResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.SchemaCollection

**Response Fields:**
- `items` (list[SchemaSummary]) — **[Required]** items of this SchemaCollection. List of schemas. The items of this SchemaCollection. list[oci.aidataplatform_dp.models.SchemaSummary]

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)

### `listTablePermissions`
<a id='schemaclient-listtablepermissions'></a>
Returns a list of permissions for a given table.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `tableKey` (string) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.

**Optional Parameters:**
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination](
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination](
- `sortOrder` (model.SortOrder) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (ListTablePermissionsRequest.SortBy) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `ListTablePermissionsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.TablePermissionCollection

**Response Fields:**
- `entity_type` (str) — **[Required]** entity_type of this Table. An enum to decide the type of the derived model Allowed values for this property are: "ADW", "ALH", "STANDARD", "ATP", "ORACLE", "EXADATA", "ORACLE_ANALYTICS", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The entity_type of this Table. str
- `key` (str) — key of this Table. The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>. The key of this Table. str
- `display_name` (str) — **[Required]** display_name of this Table. Table name. The display_name of this Table. str
- `catalog_key` (str) — catalog_key of this Table. The name of the catalog to which this table belongs. The catalog_key of this Table. str
- `schema_key` (str) — schema_key of this Table. The name of the schema to which this table belongs. The schema_key of this Table. str
- `location` (str) — location of this Table. Location of the table data. The location of this Table. str
- `description` (str) — description of this Table. Table description. The description of this Table. str
- `table_type` (str) — table_type of this Table. Type of table. Managed, external or mount table. Allowed values for this property are: "MANAGED", "EXTERNAL", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The table_type of this Table. str
- `managed_table_definition` (ManagedTableDefinition) — managed_table_definition of this Table. The managed_table_definition of this Table. oci.aidataplatform_dp.models.ManagedTableDefinition
- `external_table_definition` (ExternalTableDefinition) — external_table_definition of this Table. The external_table_definition of this Table. oci.aidataplatform_dp.models.ExternalTableDefinition
- `table_fields` (list[TableFieldDetails]) — table_fields of this Table. Columns for table. The table_fields of this Table. list[oci.aidataplatform_dp.models.TableFieldDetails]
- `partition_keys` (list[TableFieldDetails]) — partition_keys of this Table. Columns to be used in partition for table. The partition_keys of this Table. list[oci.aidataplatform_dp.models.TableFieldDetails]
- `table_properties` (list[TableProperty]) — table_properties of this Table. Table properties. The table_properties of this Table. list[oci.aidataplatform_dp.models.TableProperty]
- `time_created` (datetime) — time_created of this Table. The date and time the table was created. The time_created of this Table. datetime
- `time_updated` (datetime) — time_updated of this Table. The date and time the table was updated. The time_updated of this Table. datetime
- `created_by` (str) — created_by of this Table. The OCID of the user/principal who created the table. The created_by of this Table. str
- `updated_by` (str) — updated_by of this Table. The ID of the user who last updated the schema. The updated_by of this Table. str
- `lifecycle_state` (str) — lifecycle_state of this Table. The state of the table. Allowed values for this property are: "ACTIVE", "CREATING", "DELETING", "UPDATING", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The lifecycle_state of this Table. str
- `lifecycle_state_details` (str) — lifecycle_state_details of this Table. A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state. The lifecycle_state_details of this Table. str

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)

### `listTables`
<a id='schemaclient-listtables'></a>
Returns a list of tables in a schema.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `catalogKey` (string) — The key of the catalog.
- `schemaKey` (string) — The fully qualified name of the Data Lake Schema in the format <catalog_name>.<schema_name>

**Optional Parameters:**
- `displayName` (string) — A filter to return only resources that match the given display name exactly.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination](
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination](
- `sortOrder` (model.SortOrder) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (ListTablesRequest.SortBy) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `ListTablesResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.TableCollection

**Response Fields:**
- `entity_type` (str) — **[Required]** entity_type of this Table. An enum to decide the type of the derived model Allowed values for this property are: "ADW", "ALH", "STANDARD", "ATP", "ORACLE", "EXADATA", "ORACLE_ANALYTICS", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The entity_type of this Table. str
- `key` (str) — key of this Table. The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>. The key of this Table. str
- `display_name` (str) — **[Required]** display_name of this Table. Table name. The display_name of this Table. str
- `catalog_key` (str) — catalog_key of this Table. The name of the catalog to which this table belongs. The catalog_key of this Table. str
- `schema_key` (str) — schema_key of this Table. The name of the schema to which this table belongs. The schema_key of this Table. str
- `location` (str) — location of this Table. Location of the table data. The location of this Table. str
- `description` (str) — description of this Table. Table description. The description of this Table. str
- `table_type` (str) — table_type of this Table. Type of table. Managed, external or mount table. Allowed values for this property are: "MANAGED", "EXTERNAL", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The table_type of this Table. str
- `managed_table_definition` (ManagedTableDefinition) — managed_table_definition of this Table. The managed_table_definition of this Table. oci.aidataplatform_dp.models.ManagedTableDefinition
- `external_table_definition` (ExternalTableDefinition) — external_table_definition of this Table. The external_table_definition of this Table. oci.aidataplatform_dp.models.ExternalTableDefinition
- `table_fields` (list[TableFieldDetails]) — table_fields of this Table. Columns for table. The table_fields of this Table. list[oci.aidataplatform_dp.models.TableFieldDetails]
- `partition_keys` (list[TableFieldDetails]) — partition_keys of this Table. Columns to be used in partition for table. The partition_keys of this Table. list[oci.aidataplatform_dp.models.TableFieldDetails]
- `table_properties` (list[TableProperty]) — table_properties of this Table. Table properties. The table_properties of this Table. list[oci.aidataplatform_dp.models.TableProperty]
- `time_created` (datetime) — time_created of this Table. The date and time the table was created. The time_created of this Table. datetime
- `time_updated` (datetime) — time_updated of this Table. The date and time the table was updated. The time_updated of this Table. datetime
- `created_by` (str) — created_by of this Table. The OCID of the user/principal who created the table. The created_by of this Table. str
- `updated_by` (str) — updated_by of this Table. The ID of the user who last updated the schema. The updated_by of this Table. str
- `lifecycle_state` (str) — lifecycle_state of this Table. The state of the table. Allowed values for this property are: "ACTIVE", "CREATING", "DELETING", "UPDATING", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The lifecycle_state of this Table. str
- `lifecycle_state_details` (str) — lifecycle_state_details of this Table. A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state. The lifecycle_state_details of this Table. str

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)

### `listViewPermissions`
<a id='schemaclient-listviewpermissions'></a>
Returns a list of view permissions.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `viewKey` (string) — The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>.

**Optional Parameters:**
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination](
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination](
- `sortOrder` (model.SortOrder) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (ListViewPermissionsRequest.SortBy) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `ListViewPermissionsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.ViewPermissionCollection

**Response Fields:**
- `items` (list[ViewPermissionSummary]) — **[Required]** items of this ViewPermissionCollection. List of view permissions. The items of this ViewPermissionCollection. list[oci.aidataplatform_dp.models.ViewPermissionSummary]

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)

### `listViews`
<a id='schemaclient-listviews'></a>
Returns a list of views in a schema.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `catalogKey` (string) — The key of the catalog.
- `schemaKey` (string) — The fully qualified name of the Data Lake Schema in the format <catalog_name>.<schema_name>

**Optional Parameters:**
- `displayName` (string) — A filter to return only resources that match the given display name exactly.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination](
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination](
- `sortOrder` (model.SortOrder) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (ListViewsRequest.SortBy) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `ListViewsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.ViewCollection

**Response Fields:**
- `key` (str) — key of this View. The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name> The key of this View. str
- `display_name` (str) — **[Required]** display_name of this View. A user-friendly name. Has to be unique within the scope of the schema and is changeable. The display_name of this View. str
- `catalog_key` (str) — catalog_key of this View. The name of the catalog to which this view belongs. The catalog_key of this View. str
- `schema_key` (str) — schema_key of this View. The name of the Schema to which this view belongs. The schema_key of this View. str
- `view_text` (str) — view_text of this View. The Query used to create the view. The view_text of this View. str
- `description` (str) — description of this View. The description of the view. The description of this View. str
- `view_fields` (list[ViewFieldDetails]) — view_fields of this View. Columns for view. The view_fields of this View. list[oci.aidataplatform_dp.models.ViewFieldDetails]
- `time_created` (datetime) — time_created of this View. The date and time the View was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2016-08-25T21:10:29.600Z The time_created of this View. datetime
- `time_updated` (datetime) — time_updated of this View. The date and time the View was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2016-08-25T21:10:29.600Z The time_updated of this View. datetime
- `created_by` (str) — created_by of this View. The ID of the user/principal who created the view. The created_by of this View. str
- `updated_by` (str) — updated_by of this View. The ID of the user who last updated the view. The updated_by of this View. str
- `view_properties` (list[ViewProperty]) — view_properties of this View. View Properties. The view_properties of this View. list[oci.aidataplatform_dp.models.ViewProperty]
- `lifecycle_state` (str) — lifecycle_state of this View. The state of the view. Allowed values for this property are: "ACTIVE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The lifecycle_state of this View. str
- `lifecycle_state_details` (str) — lifecycle_state_details of this View. A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state. The lifecycle_state_details of this View. str

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)

### `manageSchemaPermission`
<a id='schemaclient-manageschemapermission'></a>
Updates the permissions for a given schema.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `schemaKey` (string) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.
- `manageSchemaPermissionDetails` (model.ManageSchemaPermissionDetails) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `ManageSchemaPermissionResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)

### `manageTablePermission`
<a id='schemaclient-managetablepermission'></a>
Updates the permissions for a given table.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `tableKey` (string) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.
- `manageTablePermissionDetails` (model.ManageTablePermissionDetails) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `ManageTablePermissionResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)

### `manageViewPermission`
<a id='schemaclient-manageviewpermission'></a>
Updates permissions on a view.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `viewKey` (string) — The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>.
- `manageViewPermissionDetails` (model.ManageViewPermissionDetails) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `ManageViewPermissionResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)

### `performInferSchema`
<a id='schemaclient-performinferschema'></a>
Returns details of a table schema from the specified location.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `schemaKey` (string) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.
- `performInferSchemaDetails` (model.PerformInferSchemaDetails) — Details of the location from which the table schema can be inferred.

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `PerformInferSchemaResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.InferSchema

**Response Fields:**
- `infer_schema_column` (list[InferSchemaColumn]) — **[Required]** infer_schema_column of this InferSchema. Column information obtained by inferring schema. The infer_schema_column of this InferSchema. list[oci.aidataplatform_dp.models.InferSchemaColumn]

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)

### `performInferSchemaWithPreview`
<a id='schemaclient-performinferschemawithpreview'></a>
Returns table schema and data from the specified location.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `schemaKey` (string) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.
- `performInferSchemaDetails` (model.PerformInferSchemaDetails) — Details of the location from which the table schema and data can be inferred.

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `PerformInferSchemaWithPreviewResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.InferSchemaWithPreview

**Response Fields:**
- `schema` (list[InferSchemaColumn]) — **[Required]** schema of this InferSchemaWithPreview. Column information obtained by inferring schema. The schema of this InferSchemaWithPreview. list[oci.aidataplatform_dp.models.InferSchemaColumn]
- `data` (list[dict(str, str)]) — **[Required]** data of this InferSchemaWithPreview. Sample preview data. The data of this InferSchemaWithPreview. list[dict(str, str)]

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)

### `refreshSchema`
<a id='schemaclient-refreshschema'></a>
Refreshes schema in an AI Data Platform Workbench through the crawler.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `schemaKey` (string) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.

**Return Response:** `RefreshSchemaResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)

### `refreshTable`
<a id='schemaclient-refreshtable'></a>
Refreshes a table in an AI Data Platform Workbench through the crawler.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `tableKey` (string) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.

**Return Response:** `RefreshTableResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)

### `retrievePar`
<a id='schemaclient-retrievepar'></a>
Retrieve PAR for the entities created in AI Data Platform Workbench.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `tableKey` (string) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `RetrieveParResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.ParDetails

**Response Fields:**
- `par_url` (str) — **[Required]** par_url of this ParDetails. PAR URL of the table. The par_url of this ParDetails. str
- `table_key` (str) — **[Required]** table_key of this ParDetails. The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>. The table_key of this ParDetails. str
- `time_expires` (datetime) — **[Required]** time_expires of this ParDetails. The date and time the table was updated. The time_expires of this ParDetails. datetime
- `par_access_type` (str) — **[Required]** par_access_type of this ParDetails. The operation that can be performed on this resource. Allowed values for this property are: "OBJECT_READ", "OBJECT_WRITE", "OBJECT_READ_WRITE", "ANY_OBJECT_WRITE", "ANY_OBJECT_READ", "ANY_OBJECT_READ_WRITE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The par_access_type of this ParDetails. str

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)

### `updateSchema`
<a id='schemaclient-updateschema'></a>
Updates a schema.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `schemaKey` (string) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.
- `updateSchemaDetails` (model.UpdateSchemaDetails) — The information to be updated.

**Optional Parameters:**
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `UpdateSchemaResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.Schema

**Response Fields:**
- `entity_type` (str) — **[Required]** entity_type of this Schema. An enum to decide the type of the derived model. Allowed values for this property are: "ADW", "ALH", "STANDARD", "KAFKA_TOPIC", "ATP", "ORACLE", "EXADATA", "ORACLE_ANALYTICS", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The entity_type of this Schema. str
- `key` (str) — **[Required]** key of this Schema. The fully qualified name of the schema in the format <catalog_name>.<schema_name>. The key of this Schema. str
- `display_name` (str) — **[Required]** display_name of this Schema. Schema name. The display_name of this Schema. str
- `description` (str) — description of this Schema. Schema description. The description of this Schema. str
- `time_created` (datetime) — time_created of this Schema. The date and time the schema was created. The time_created of this Schema. datetime
- `time_updated` (datetime) — time_updated of this Schema. The date and time the schema was updated. The time_updated of this Schema. datetime
- `created_by` (str) — created_by of this Schema. ID of the user who created the schema. The created_by of this Schema. str
- `updated_by` (str) — updated_by of this Schema. ID of the user who last updated the schema. The updated_by of this Schema. str
- `properties` (dict(str, str)) — properties of this Schema. Key-value pair representing a defined tag key and value. The properties of this Schema. dict(str, str)
- `catalog_name` (str) — catalog_name of this Schema. The name of the catalog to which this schema belongs. The catalog_name of this Schema. str
- `lifecycle_state` (str) — lifecycle_state of this Schema. The current state of the schema. Allowed values for this property are: "ACTIVE", "CREATING", "DELETING", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The lifecycle_state of this Schema. str
- `lifecycle_state_details` (str) — lifecycle_state_details of this Schema. A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state. The lifecycle_state_details of this Schema. str
- `details` (dict(str, str)) — details of this Schema. Deprecated field. Map of key-value pairs. This object will be only provided when the parent catalog is external. The details of this Schema. dict(str, str)

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)

### `updateTable`
<a id='schemaclient-updatetable'></a>
Updates a table with provided details.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `tableKey` (string) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.
- `updateTableDetails` (model.UpdateTableDetails) — The information to be updated.

**Optional Parameters:**
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `UpdateTableResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)

### `updateView`
<a id='schemaclient-updateview'></a>
Updates a view with given information.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `viewKey` (string) — The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>.
- `updateViewDetails` (model.UpdateViewDetails) — The update mode and information to be updated.

**Optional Parameters:**
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `UpdateViewResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.View

**Response Fields:**
- `key` (str) — key of this View. The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name> The key of this View. str
- `display_name` (str) — **[Required]** display_name of this View. A user-friendly name. Has to be unique within the scope of the schema and is changeable. The display_name of this View. str
- `catalog_key` (str) — catalog_key of this View. The name of the catalog to which this view belongs. The catalog_key of this View. str
- `schema_key` (str) — schema_key of this View. The name of the Schema to which this view belongs. The schema_key of this View. str
- `view_text` (str) — view_text of this View. The Query used to create the view. The view_text of this View. str
- `description` (str) — description of this View. The description of the view. The description of this View. str
- `view_fields` (list[ViewFieldDetails]) — view_fields of this View. Columns for view. The view_fields of this View. list[oci.aidataplatform_dp.models.ViewFieldDetails]
- `time_created` (datetime) — time_created of this View. The date and time the View was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2016-08-25T21:10:29.600Z The time_created of this View. datetime
- `time_updated` (datetime) — time_updated of this View. The date and time the View was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2016-08-25T21:10:29.600Z The time_updated of this View. datetime
- `created_by` (str) — created_by of this View. The ID of the user/principal who created the view. The created_by of this View. str
- `updated_by` (str) — updated_by of this View. The ID of the user who last updated the view. The updated_by of this View. str
- `view_properties` (list[ViewProperty]) — view_properties of this View. View Properties. The view_properties of this View. list[oci.aidataplatform_dp.models.ViewProperty]
- `lifecycle_state` (str) — lifecycle_state of this View. The state of the view. Allowed values for this property are: "ACTIVE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The lifecycle_state of this View. str
- `lifecycle_state_details` (str) — lifecycle_state_details of this View. A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state. The lifecycle_state_details of this View. str

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)

## User Setting (`UserSettingClient`)
<a id='usersettingclient-client'></a>
**Operations:**
- [`createUserSetting`](#usersettingclient-createusersetting)
- [`deleteUserSetting`](#usersettingclient-deleteusersetting)
- [`getUserSetting`](#usersettingclient-getusersetting)
- [`listUserSettings`](#usersettingclient-listusersettings)
- [`updateUserSetting`](#usersettingclient-updateusersetting)

### `createUserSetting`
<a id='usersettingclient-createusersetting'></a>
(Preview) The User Settings API allows you to manage user-specific configurations and credentials within an AI Data Platform instance. What you can do -> Store user credentials and integrations, including: -> IAM user credentials -> Git account configurations (e.g., GitHub PAT) -> Create and manage multiple settings -> Mark a setting as default for a given type -> Retrieve and filter settings by type or default status Supported setting types -> IAM_USER_CREDENTIAL – OCI user credentials for API access -> GIT_ACCOUNT – Git provider configuration (e.g., GitHub personal access token) Core operations -> Create a user setting -> List all user settings (with filtering and pagination) -> Get a specific setting by key -> Update an existing setting -> Delete a setting

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `createUserSettingDetails` (model.CreateUserSettingDetails) — Details for the new setting.

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.

**Return Response:** `CreateUserSettingResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.UserSetting

**Response Fields:**
- `key` (str) — **[Required]** key of this Setting. The unique identifier for the setting. The key of this Setting. str
- `name` (str) — **[Required]** name of this Setting. A user-friendly name for the setting. The name of this Setting. str
- `is_default` (bool) — **[Required]** is_default of this Setting. Indicates whether this setting is the default. The is_default of this Setting. bool
- `data` (SettingData) — data of this Setting. The data of this Setting. oci.aidataplatform_dp.models.SettingData

**Return:** [Back to User Setting (`UserSettingClient`)](#usersettingclient-client) • [Top](#top)

### `deleteUserSetting`
<a id='usersettingclient-deleteusersetting'></a>
(Preview) Deletes a user setting and its credentials from this AI Data Platform instance, freeing the default slot for that type.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `settingKey` (string) — The UUID of the user setting.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `DeleteUserSettingResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to User Setting (`UserSettingClient`)](#usersettingclient-client) • [Top](#top)

### `getUserSetting`
<a id='usersettingclient-getusersetting'></a>
(Preview) Returns the full definition of user settings identified by its key, including type-specific payload and default flag.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `settingKey` (string) — The UUID of the user setting.

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `GetUserSettingResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.UserSetting

**Response Fields:**
- `key` (str) — **[Required]** key of this Setting. The unique identifier for the setting. The key of this Setting. str
- `name` (str) — **[Required]** name of this Setting. A user-friendly name for the setting. The name of this Setting. str
- `is_default` (bool) — **[Required]** is_default of this Setting. Indicates whether this setting is the default. The is_default of this Setting. bool
- `data` (SettingData) — data of this Setting. The data of this Setting. oci.aidataplatform_dp.models.SettingData

**Return:** [Back to User Setting (`UserSettingClient`)](#usersettingclient-client) • [Top](#top)

### `listUserSettings`
<a id='usersettingclient-listusersettings'></a>
(Preview) Returns a list of all user-specific configurations, with filters for setting type, default flag, and pagination when needed.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `settingType` (ListUserSettingsRequest.SettingType) — A filter to return only those settings whose value matches the given data type.
- `isDefault` (boolean) — A filter to return only resources that are default.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination](
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination](
- `sortOrder` (model.SortOrder) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (ListUserSettingsRequest.SortBy) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `displayName` (string) — A filter to return only resources that match the given display name exactly.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `ListUserSettingsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.UserSettingCollection

**Response Fields:**
- `key` (str) — **[Required]** key of this Setting. The unique identifier for the setting. The key of this Setting. str
- `name` (str) — **[Required]** name of this Setting. A user-friendly name for the setting. The name of this Setting. str
- `is_default` (bool) — **[Required]** is_default of this Setting. Indicates whether this setting is the default. The is_default of this Setting. bool
- `data` (SettingData) — data of this Setting. The data of this Setting. oci.aidataplatform_dp.models.SettingData

**Return:** [Back to User Setting (`UserSettingClient`)](#usersettingclient-client) • [Top](#top)

### `updateUserSetting`
<a id='usersettingclient-updateusersetting'></a>
(Preview) Updates the metadata or payload of an existing user setting, letting you rotate credentials or change defaults.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `settingKey` (string) — The UUID of the user setting.
- `updateUserSettingDetails` (model.UpdateUserSettingDetails) — Details for the user setting to be updated.

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.

**Return Response:** `UpdateUserSettingResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.UserSetting

**Response Fields:**
- `key` (str) — **[Required]** key of this Setting. The unique identifier for the setting. The key of this Setting. str
- `name` (str) — **[Required]** name of this Setting. A user-friendly name for the setting. The name of this Setting. str
- `is_default` (bool) — **[Required]** is_default of this Setting. Indicates whether this setting is the default. The is_default of this Setting. bool
- `data` (SettingData) — data of this Setting. The data of this Setting. oci.aidataplatform_dp.models.SettingData

**Return:** [Back to User Setting (`UserSettingClient`)](#usersettingclient-client) • [Top](#top)

## Volume (`VolumeClient`)
<a id='volumeclient-client'></a>
**Operations:**
- [`createVolume`](#volumeclient-createvolume)
- [`deleteDir`](#volumeclient-deletedir)
- [`deleteFile`](#volumeclient-deletefile)
- [`deleteVolume`](#volumeclient-deletevolume)
- [`downloadFile`](#volumeclient-downloadfile)
- [`downloadFileWithPar`](#volumeclient-downloadfilewithpar)
- [`getVolume`](#volumeclient-getvolume)
- [`listFiles`](#volumeclient-listfiles)
- [`listVolumePermissions`](#volumeclient-listvolumepermissions)
- [`listVolumes`](#volumeclient-listvolumes)
- [`makeDir`](#volumeclient-makedir)
- [`manageVolumePermission`](#volumeclient-managevolumepermission)
- [`updateDir`](#volumeclient-updatedir)
- [`updateVolume`](#volumeclient-updatevolume)
- [`uploadFile`](#volumeclient-uploadfile)
- [`uploadFileWithPar`](#volumeclient-uploadfilewithpar)

### `createVolume`
<a id='volumeclient-createvolume'></a>
Creates a volume in AI Data Platform Workbench.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `createVolumeDetails` (model.CreateVolumeDetails) — Details for the new volume.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `CreateVolumeResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.Volume

**Response Fields:**
- `key` (str) — **[Required]** key of this Volume. The key of the volume. The key of this Volume. str
- `display_name` (str) — **[Required]** display_name of this Volume. A user-friendly name. Has to be unique within the schema and is changeable. The display_name of this Volume. str
- `description` (str) — description of this Volume. Short description of the volume The description of this Volume. str
- `time_created` (datetime) — **[Required]** time_created of this Volume. The date and time the Data Lake Volume was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2016-08-25T21:10:29.600Z The time_created of this Volume. datetime
- `time_updated` (datetime) — time_updated of this Volume. The date and time the Data Lake Volume was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2016-08-25T21:10:29.600Z The time_updated of this Volume. datetime
- `created_by` (str) — created_by of this Volume. The ID of the user that created the volume. The created_by of this Volume. str
- `updated_by` (str) — updated_by of this Volume. The ID of the user that last updated the volume The updated_by of this Volume. str
- `catalog_name` (str) — catalog_name of this Volume. The name of the catalog to which this volume belongs. The catalog_name of this Volume. str
- `schema_name` (str) — schema_name of this Volume. The name of the schema to which this volume belongs. The schema_name of this Volume. str
- `full_name` (str) — full_name of this Volume. The fully qualified name of this volume. The full_name of this Volume. str
- `volume_type` (str) — volume_type of this Volume. The type of volume. Allowed values for this property are: "MANAGED", "EXTERNAL", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The volume_type of this Volume. str
- `storage_location` (str) — storage_location of this Volume. The storage location of the external volume. Only applicable for external volumes. The storage_location of this Volume. str
- `lifecycle_state` (str) — lifecycle_state of this Volume. The lifecycle state of the volume. The volume is ready for use in ACTIVE state Allowed values for this property are: "CREATING", "UPDATING", "DELETING", "ACTIVE", "DELETED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The lifecycle_state of this Volume. str
- `lifecycle_state_details` (str) — lifecycle_state_details of this Volume. Additional details associated with the lifecycle state. The lifecycle_state_details of this Volume. str
- `system_tags` (dict(str, dict(str, object))) — system_tags of this Volume. System tags for this resource. Each key is predefined and scoped to a namespace. Example: {"orcl-cloud": {"free-tier-retained": "true"}} The system_tags of this Volume. dict(str, dict(str, object))

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)

### `deleteDir`
<a id='volumeclient-deletedir'></a>
Deletes a directory in a volume.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `volumeKey` (string) — The key of the volume.
- `path` (string) — The absolute path of the file or folder

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `DeleteDirResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)

### `deleteFile`
<a id='volumeclient-deletefile'></a>
Deletes a file or folder in a volume.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `volumeKey` (string) — The key of the volume.
- `path` (string) — The absolute path of the file or folder

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `DeleteFileResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)

### `deleteVolume`
<a id='volumeclient-deletevolume'></a>
Deletes a volume.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `volumeKey` (string) — The key of the volume.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `DeleteVolumeResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)

### `downloadFile`
<a id='volumeclient-downloadfile'></a>
Downloads a file from a volume.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `volumeKey` (string) — The key of the volume.
- `path` (string) — The absolute path of the file or folder

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `DownloadFileResponse` — A :class:~oci.response.Response object with data of type stream

**Response Fields:** None

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)

### `downloadFileWithPar`
<a id='volumeclient-downloadfilewithpar'></a>
provide the par info for downloading the file for given path.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `volumeKey` (string) — The key of the volume.
- `path` (string) — The absolute path of the file or folder

**Optional Parameters:**
- `shouldGenerateNewPar` (boolean) — Flag to toggle to generate short living par
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `DownloadFileWithParResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.DownloadFileWithParResult

**Response Fields:**
- `par_url` (str) — par_url of this DownloadFileWithParResult. String representing the PAR URL. The par_url of this DownloadFileWithParResult. str
- `e_tag` (str) — **[Required]** e_tag of this DownloadFileWithParResult. Etag after creating or closing a file. The e_tag of this DownloadFileWithParResult. str
- `location_uri` (str) — **[Required]** location_uri of this DownloadFileWithParResult. The object storage URI which has bucket and namespace information. The location_uri of this DownloadFileWithParResult. str
- `size` (int) — **[Required]** size of this DownloadFileWithParResult. File size in bytes. The size of this DownloadFileWithParResult. int
- `created_by` (str) — created_by of this DownloadFileWithParResult. The user who created the file. The created_by of this DownloadFileWithParResult. str
- `updated_by` (str) — updated_by of this DownloadFileWithParResult. The user who last updated the file. The updated_by of this DownloadFileWithParResult. str
- `created_time` (str) — created_time of this DownloadFileWithParResult. The time at which the file was created. The created_time of this DownloadFileWithParResult. str
- `updated_time` (str) — updated_time of this DownloadFileWithParResult. The last modified time of the file. The updated_time of this DownloadFileWithParResult. str
- `description` (str) — description of this DownloadFileWithParResult. The file description. The description of this DownloadFileWithParResult. str
- `system_tags` (dict(str, dict(str, object))) — system_tags of this DownloadFileWithParResult. System tags for this resource. Each key is predefined and scoped to a namespace. Example: {"orcl-cloud": {"free-tier-retained": "true"}} The system_tags of this DownloadFileWithParResult. dict(str, dict(str, object))

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)

### `getVolume`
<a id='volumeclient-getvolume'></a>
Returns detailed information about a volume.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `volumeKey` (string) — The key of the volume.

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `GetVolumeResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.Volume

**Response Fields:**
- `key` (str) — **[Required]** key of this Volume. The key of the volume. The key of this Volume. str
- `display_name` (str) — **[Required]** display_name of this Volume. A user-friendly name. Has to be unique within the schema and is changeable. The display_name of this Volume. str
- `description` (str) — description of this Volume. Short description of the volume The description of this Volume. str
- `time_created` (datetime) — **[Required]** time_created of this Volume. The date and time the Data Lake Volume was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2016-08-25T21:10:29.600Z The time_created of this Volume. datetime
- `time_updated` (datetime) — time_updated of this Volume. The date and time the Data Lake Volume was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2016-08-25T21:10:29.600Z The time_updated of this Volume. datetime
- `created_by` (str) — created_by of this Volume. The ID of the user that created the volume. The created_by of this Volume. str
- `updated_by` (str) — updated_by of this Volume. The ID of the user that last updated the volume The updated_by of this Volume. str
- `catalog_name` (str) — catalog_name of this Volume. The name of the catalog to which this volume belongs. The catalog_name of this Volume. str
- `schema_name` (str) — schema_name of this Volume. The name of the schema to which this volume belongs. The schema_name of this Volume. str
- `full_name` (str) — full_name of this Volume. The fully qualified name of this volume. The full_name of this Volume. str
- `volume_type` (str) — volume_type of this Volume. The type of volume. Allowed values for this property are: "MANAGED", "EXTERNAL", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The volume_type of this Volume. str
- `storage_location` (str) — storage_location of this Volume. The storage location of the external volume. Only applicable for external volumes. The storage_location of this Volume. str
- `lifecycle_state` (str) — lifecycle_state of this Volume. The lifecycle state of the volume. The volume is ready for use in ACTIVE state Allowed values for this property are: "CREATING", "UPDATING", "DELETING", "ACTIVE", "DELETED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The lifecycle_state of this Volume. str
- `lifecycle_state_details` (str) — lifecycle_state_details of this Volume. Additional details associated with the lifecycle state. The lifecycle_state_details of this Volume. str
- `system_tags` (dict(str, dict(str, object))) — system_tags of this Volume. System tags for this resource. Each key is predefined and scoped to a namespace. Example: {"orcl-cloud": {"free-tier-retained": "true"}} The system_tags of this Volume. dict(str, dict(str, object))

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)

### `listFiles`
<a id='volumeclient-listfiles'></a>
Returns a list of files in a volume.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `volumeKey` (string) — The key of the volume.
- `path` (string) — The absolute path of the file or folder

**Optional Parameters:**
- `isRecursive` (boolean) — A boolean which decides if nested files should be in the list files in volume response.
- `displayName` (string) — A filter to return only resources that match the given display name exactly.
- `metadataKeys` (string) — Comma separated keys to have in list response.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination](
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination](
- `sortOrder` (model.SortOrder) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (ListFilesRequest.SortBy) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `ListFilesResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.VolumeFileCollection

**Response Fields:**
- `key` (str) — **[Required]** key of this Volume. The key of the volume. The key of this Volume. str
- `display_name` (str) — **[Required]** display_name of this Volume. A user-friendly name. Has to be unique within the schema and is changeable. The display_name of this Volume. str
- `description` (str) — description of this Volume. Short description of the volume The description of this Volume. str
- `time_created` (datetime) — **[Required]** time_created of this Volume. The date and time the Data Lake Volume was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2016-08-25T21:10:29.600Z The time_created of this Volume. datetime
- `time_updated` (datetime) — time_updated of this Volume. The date and time the Data Lake Volume was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2016-08-25T21:10:29.600Z The time_updated of this Volume. datetime
- `created_by` (str) — created_by of this Volume. The ID of the user that created the volume. The created_by of this Volume. str
- `updated_by` (str) — updated_by of this Volume. The ID of the user that last updated the volume The updated_by of this Volume. str
- `catalog_name` (str) — catalog_name of this Volume. The name of the catalog to which this volume belongs. The catalog_name of this Volume. str
- `schema_name` (str) — schema_name of this Volume. The name of the schema to which this volume belongs. The schema_name of this Volume. str
- `full_name` (str) — full_name of this Volume. The fully qualified name of this volume. The full_name of this Volume. str
- `volume_type` (str) — volume_type of this Volume. The type of volume. Allowed values for this property are: "MANAGED", "EXTERNAL", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The volume_type of this Volume. str
- `storage_location` (str) — storage_location of this Volume. The storage location of the external volume. Only applicable for external volumes. The storage_location of this Volume. str
- `lifecycle_state` (str) — lifecycle_state of this Volume. The lifecycle state of the volume. The volume is ready for use in ACTIVE state Allowed values for this property are: "CREATING", "UPDATING", "DELETING", "ACTIVE", "DELETED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The lifecycle_state of this Volume. str
- `lifecycle_state_details` (str) — lifecycle_state_details of this Volume. Additional details associated with the lifecycle state. The lifecycle_state_details of this Volume. str
- `system_tags` (dict(str, dict(str, object))) — system_tags of this Volume. System tags for this resource. Each key is predefined and scoped to a namespace. Example: {"orcl-cloud": {"free-tier-retained": "true"}} The system_tags of this Volume. dict(str, dict(str, object))

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)

### `listVolumePermissions`
<a id='volumeclient-listvolumepermissions'></a>
Returns a list of volume permissions.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `volumeKey` (string) — The key of the volume.

**Optional Parameters:**
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination](
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination](
- `sortOrder` (model.SortOrder) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (ListVolumePermissionsRequest.SortBy) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `ListVolumePermissionsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.VolumePermissionCollection

**Response Fields:**
- `key` (str) — **[Required]** key of this Volume. The key of the volume. The key of this Volume. str
- `display_name` (str) — **[Required]** display_name of this Volume. A user-friendly name. Has to be unique within the schema and is changeable. The display_name of this Volume. str
- `description` (str) — description of this Volume. Short description of the volume The description of this Volume. str
- `time_created` (datetime) — **[Required]** time_created of this Volume. The date and time the Data Lake Volume was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2016-08-25T21:10:29.600Z The time_created of this Volume. datetime
- `time_updated` (datetime) — time_updated of this Volume. The date and time the Data Lake Volume was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2016-08-25T21:10:29.600Z The time_updated of this Volume. datetime
- `created_by` (str) — created_by of this Volume. The ID of the user that created the volume. The created_by of this Volume. str
- `updated_by` (str) — updated_by of this Volume. The ID of the user that last updated the volume The updated_by of this Volume. str
- `catalog_name` (str) — catalog_name of this Volume. The name of the catalog to which this volume belongs. The catalog_name of this Volume. str
- `schema_name` (str) — schema_name of this Volume. The name of the schema to which this volume belongs. The schema_name of this Volume. str
- `full_name` (str) — full_name of this Volume. The fully qualified name of this volume. The full_name of this Volume. str
- `volume_type` (str) — volume_type of this Volume. The type of volume. Allowed values for this property are: "MANAGED", "EXTERNAL", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The volume_type of this Volume. str
- `storage_location` (str) — storage_location of this Volume. The storage location of the external volume. Only applicable for external volumes. The storage_location of this Volume. str
- `lifecycle_state` (str) — lifecycle_state of this Volume. The lifecycle state of the volume. The volume is ready for use in ACTIVE state Allowed values for this property are: "CREATING", "UPDATING", "DELETING", "ACTIVE", "DELETED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The lifecycle_state of this Volume. str
- `lifecycle_state_details` (str) — lifecycle_state_details of this Volume. Additional details associated with the lifecycle state. The lifecycle_state_details of this Volume. str
- `system_tags` (dict(str, dict(str, object))) — system_tags of this Volume. System tags for this resource. Each key is predefined and scoped to a namespace. Example: {"orcl-cloud": {"free-tier-retained": "true"}} The system_tags of this Volume. dict(str, dict(str, object))

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)

### `listVolumes`
<a id='volumeclient-listvolumes'></a>
Returns a list of volumes.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `catalogKey` (string) — The key of the catalog.
- `schemaKey` (string) — The fully qualified name of the Data Lake Schema in the format <catalog_name>.<schema_name>

**Optional Parameters:**
- `displayName` (string) — A filter to return only resources that match the given display name exactly.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination](
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination](
- `sortOrder` (model.SortOrder) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (ListVolumesRequest.SortBy) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `ListVolumesResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.VolumeCollection

**Response Fields:**
- `key` (str) — **[Required]** key of this Volume. The key of the volume. The key of this Volume. str
- `display_name` (str) — **[Required]** display_name of this Volume. A user-friendly name. Has to be unique within the schema and is changeable. The display_name of this Volume. str
- `description` (str) — description of this Volume. Short description of the volume The description of this Volume. str
- `time_created` (datetime) — **[Required]** time_created of this Volume. The date and time the Data Lake Volume was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2016-08-25T21:10:29.600Z The time_created of this Volume. datetime
- `time_updated` (datetime) — time_updated of this Volume. The date and time the Data Lake Volume was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2016-08-25T21:10:29.600Z The time_updated of this Volume. datetime
- `created_by` (str) — created_by of this Volume. The ID of the user that created the volume. The created_by of this Volume. str
- `updated_by` (str) — updated_by of this Volume. The ID of the user that last updated the volume The updated_by of this Volume. str
- `catalog_name` (str) — catalog_name of this Volume. The name of the catalog to which this volume belongs. The catalog_name of this Volume. str
- `schema_name` (str) — schema_name of this Volume. The name of the schema to which this volume belongs. The schema_name of this Volume. str
- `full_name` (str) — full_name of this Volume. The fully qualified name of this volume. The full_name of this Volume. str
- `volume_type` (str) — volume_type of this Volume. The type of volume. Allowed values for this property are: "MANAGED", "EXTERNAL", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The volume_type of this Volume. str
- `storage_location` (str) — storage_location of this Volume. The storage location of the external volume. Only applicable for external volumes. The storage_location of this Volume. str
- `lifecycle_state` (str) — lifecycle_state of this Volume. The lifecycle state of the volume. The volume is ready for use in ACTIVE state Allowed values for this property are: "CREATING", "UPDATING", "DELETING", "ACTIVE", "DELETED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The lifecycle_state of this Volume. str
- `lifecycle_state_details` (str) — lifecycle_state_details of this Volume. Additional details associated with the lifecycle state. The lifecycle_state_details of this Volume. str
- `system_tags` (dict(str, dict(str, object))) — system_tags of this Volume. System tags for this resource. Each key is predefined and scoped to a namespace. Example: {"orcl-cloud": {"free-tier-retained": "true"}} The system_tags of this Volume. dict(str, dict(str, object))

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)

### `makeDir`
<a id='volumeclient-makedir'></a>
Creates a directory in a volume.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `volumeKey` (string) — The key of the volume.
- `path` (string) — The absolute path of the file or folder

**Optional Parameters:**
- `description` (string) — The description of the folder.
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `MakeDirResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)

### `manageVolumePermission`
<a id='volumeclient-managevolumepermission'></a>
Updates the permissions on a volume.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `volumeKey` (string) — The key of the volume.
- `manageVolumePermissionDetails` (model.ManageVolumePermissionDetails) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `ManageVolumePermissionResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)

### `updateDir`
<a id='volumeclient-updatedir'></a>
Updates a directory in volume with the provided information.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `volumeKey` (string) — The key of the volume.
- `updateDirDetails` (model.UpdateDirDetails) — The information to be updated.
- `path` (string) — The absolute path of the file or folder

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `UpdateDirResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)

### `updateVolume`
<a id='volumeclient-updatevolume'></a>
Updates a volume with the provided information.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `volumeKey` (string) — The key of the volume.
- `updateVolumeDetails` (model.UpdateVolumeDetails) — The information to be updated.

**Optional Parameters:**
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `UpdateVolumeResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.Volume

**Response Fields:**
- `key` (str) — **[Required]** key of this Volume. The key of the volume. The key of this Volume. str
- `display_name` (str) — **[Required]** display_name of this Volume. A user-friendly name. Has to be unique within the schema and is changeable. The display_name of this Volume. str
- `description` (str) — description of this Volume. Short description of the volume The description of this Volume. str
- `time_created` (datetime) — **[Required]** time_created of this Volume. The date and time the Data Lake Volume was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2016-08-25T21:10:29.600Z The time_created of this Volume. datetime
- `time_updated` (datetime) — time_updated of this Volume. The date and time the Data Lake Volume was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2016-08-25T21:10:29.600Z The time_updated of this Volume. datetime
- `created_by` (str) — created_by of this Volume. The ID of the user that created the volume. The created_by of this Volume. str
- `updated_by` (str) — updated_by of this Volume. The ID of the user that last updated the volume The updated_by of this Volume. str
- `catalog_name` (str) — catalog_name of this Volume. The name of the catalog to which this volume belongs. The catalog_name of this Volume. str
- `schema_name` (str) — schema_name of this Volume. The name of the schema to which this volume belongs. The schema_name of this Volume. str
- `full_name` (str) — full_name of this Volume. The fully qualified name of this volume. The full_name of this Volume. str
- `volume_type` (str) — volume_type of this Volume. The type of volume. Allowed values for this property are: "MANAGED", "EXTERNAL", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The volume_type of this Volume. str
- `storage_location` (str) — storage_location of this Volume. The storage location of the external volume. Only applicable for external volumes. The storage_location of this Volume. str
- `lifecycle_state` (str) — lifecycle_state of this Volume. The lifecycle state of the volume. The volume is ready for use in ACTIVE state Allowed values for this property are: "CREATING", "UPDATING", "DELETING", "ACTIVE", "DELETED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The lifecycle_state of this Volume. str
- `lifecycle_state_details` (str) — lifecycle_state_details of this Volume. Additional details associated with the lifecycle state. The lifecycle_state_details of this Volume. str
- `system_tags` (dict(str, dict(str, object))) — system_tags of this Volume. System tags for this resource. Each key is predefined and scoped to a namespace. Example: {"orcl-cloud": {"free-tier-retained": "true"}} The system_tags of this Volume. dict(str, dict(str, object))

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)

### `uploadFile`
<a id='volumeclient-uploadfile'></a>
Uploads a file to volume. If the file already exists, it is updated.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `volumeKey` (string) — The key of the volume.
- `uploadFileDetails` (Uint8Array | Buffer | Blob | stream.Readable | ReadableStream | string) — Contents of the file to upload.
- `path` (string) — The absolute path of the file or folder

**Optional Parameters:**
- `isOverwrite` (boolean) — A boolean which decides if overwrite is allowed
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.
- `isUploadFileBase64Encoded` (boolean) — A flag to identify if the upload file is base64 encoded
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `UploadFileResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)

### `uploadFileWithPar`
<a id='volumeclient-uploadfilewithpar'></a>
Uploads a volume file by generating PAR. If file exists, then it will be updated.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `volumeKey` (string) — The key of the volume.
- `uploadFileWithParDetails` (model.UploadFileWithParDetails) — Contents of the file to upload.
- `path` (string) — The absolute path of the file or folder

**Optional Parameters:**
- `isOverwrite` (boolean) — A boolean which decides if overwrite is allowed
- `shouldGenerateNewPar` (boolean) — Flag to toggle to generate short living par
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `UploadFileWithParResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.UploadFileWithParResult

**Response Fields:**
- `par_url` (str) — par_url of this UploadFileWithParResult. String representing the PAR URL. The par_url of this UploadFileWithParResult. str
- `e_tag` (str) — **[Required]** e_tag of this UploadFileWithParResult. Etag after creating or closing a file. The e_tag of this UploadFileWithParResult. str
- `location_uri` (str) — **[Required]** location_uri of this UploadFileWithParResult. The object storage URI which has bucket and namespace information. The location_uri of this UploadFileWithParResult. str
- `size` (int) — size of this UploadFileWithParResult. File size in bytes. The size of this UploadFileWithParResult. int
- `created_by` (str) — created_by of this UploadFileWithParResult. The user who created the file. The created_by of this UploadFileWithParResult. str
- `updated_by` (str) — updated_by of this UploadFileWithParResult. The user who last updated the file. The updated_by of this UploadFileWithParResult. str
- `created_time` (str) — created_time of this UploadFileWithParResult. The time at which the file was created. The created_time of this UploadFileWithParResult. str
- `updated_time` (str) — updated_time of this UploadFileWithParResult. The last modified time of the file. The updated_time of this UploadFileWithParResult. str
- `description` (str) — description of this UploadFileWithParResult. The file description. The description of this UploadFileWithParResult. str
- `system_tags` (dict(str, dict(str, object))) — system_tags of this UploadFileWithParResult. System tags for this resource. Each key is predefined and scoped to a namespace. Example: {"orcl-cloud": {"free-tier-retained": "true"}} The system_tags of this UploadFileWithParResult. dict(str, dict(str, object))

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)

## Workflow (`WorkflowClient`)
<a id='workflowclient-client'></a>
**Operations:**
- [`cancelJobRun`](#workflowclient-canceljobrun)
- [`cancelJobRuns`](#workflowclient-canceljobruns)
- [`createJob`](#workflowclient-createjob)
- [`createJobRun`](#workflowclient-createjobrun)
- [`deleteJob`](#workflowclient-deletejob)
- [`deleteJobRun`](#workflowclient-deletejobrun)
- [`exportTaskRunOutput`](#workflowclient-exporttaskrunoutput)
- [`fetchOutput`](#workflowclient-fetchoutput)
- [`getJob`](#workflowclient-getjob)
- [`getJobRun`](#workflowclient-getjobrun)
- [`getTaskRun`](#workflowclient-gettaskrun)
- [`listJobPermissions`](#workflowclient-listjobpermissions)
- [`listJobRuns`](#workflowclient-listjobruns)
- [`listJobs`](#workflowclient-listjobs)
- [`listRecentJobRuns`](#workflowclient-listrecentjobruns)
- [`listTaskRuns`](#workflowclient-listtaskruns)
- [`manageJobPermission`](#workflowclient-managejobpermission)
- [`repairJobRun`](#workflowclient-repairjobrun)
- [`updateJob`](#workflowclient-updatejob)

### `cancelJobRun`
<a id='workflowclient-canceljobrun'></a>
Cancels a job run.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `jobRunKey` (string) — Job run key.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `CancelJobRunResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.JobRun

**Response Fields:**
- `key` (str) — **[Required]** key of this JobRun. The OCID of the job. The key of this JobRun. str
- `name` (str) — **[Required]** name of this JobRun. A user-friendly name. Does not have to be unique, and is changeable. The name of this JobRun. str
- `job_key` (str) — **[Required]** job_key of this JobRun. The OCID of the job. The job_key of this JobRun. str
- `job_name` (str) — job_name of this JobRun. A user-friendly name. Does not have to be unique, and is changeable. The job_name of this JobRun. str
- `parent_job_run_key` (str) — parent_job_run_key of this JobRun. The OCID of the job. The parent_job_run_key of this JobRun. str
- `root_job_run_key` (str) — root_job_run_key of this JobRun. The OCID of the job. The root_job_run_key of this JobRun. str
- `parent_task_run_key` (str) — parent_task_run_key of this JobRun. The OCID of the task run. The parent_task_run_key of this JobRun. str
- `tasks` (list[Task]) — tasks of this JobRun. List of tasks in a job. The tasks of this JobRun. list[oci.aidataplatform_dp.models.Task]
- `created_by` (str) — created_by of this JobRun. The OCID of the IAM user. The created_by of this JobRun. str
- `created_by_name` (str) — created_by_name of this JobRun. Name of the user who created this record The created_by_name of this JobRun. str
- `max_concurrent_runs` (int) — max_concurrent_runs of this JobRun. Indicates the number of executions for the same job that can be run concurrently. The maximum value cannot exceed 1000. The max_concurrent_runs of this JobRun. int
- `git_config` (GitConfig) — git_config of this JobRun. The git_config of this JobRun. oci.aidataplatform_dp.models.GitConfig
- `queue` (Queue) — queue of this JobRun. The queue of this JobRun. oci.aidataplatform_dp.models.Queue
- `original_attempt_run_id` (str) — original_attempt_run_id of this JobRun. The OCID of the job. The original_attempt_run_id of this JobRun. str
- `state` (State) — state of this JobRun. The state of this JobRun. oci.aidataplatform_dp.models.State
- `schedule` (Schedule) — schedule of this JobRun. The schedule of this JobRun. oci.aidataplatform_dp.models.Schedule
- `cluster_spec` (ClusterSpec) — cluster_spec of this JobRun. The cluster_spec of this JobRun. oci.aidataplatform_dp.models.ClusterSpec
- `cluster_instance` (ClusterInstance) — cluster_instance of this JobRun. The cluster_instance of this JobRun. oci.aidataplatform_dp.models.ClusterInstance
- `parameters` (list[Parameter]) — parameters of this JobRun. An optional list of parameters. The parameters of this JobRun. list[oci.aidataplatform_dp.models.Parameter]
- `unified_job_and_job_run_parameters` (list[Parameter]) — unified_job_and_job_run_parameters of this JobRun. Unified List of job and job run parameters after resolving dynamic value references and parameter resolution as per precedence. The unified_job_and_job_run_parameters of this JobRun. list[oci.aidataplatform_dp.models.Parameter]
- `repair_history` (list[RepairHistory]) — repair_history of this JobRun. Array of repaired runs. The repair_history of this JobRun. list[oci.aidataplatform_dp.models.RepairHistory]
- `system_parameters` (dict(str, str)) — system_parameters of this JobRun. Map of system parameters with their values for this job run. The system_parameters of this JobRun. dict(str, str)
- `start_time` (int) — start_time of this JobRun. The time at which the job execution started in epoch milliseconds. The start_time of this JobRun. int
- `end_time` (int) — end_time of this JobRun. The time at which the job execution started in epoch milliseconds. The end_time of this JobRun. int
- `setup_duration` (int) — setup_duration of this JobRun. The time (in milliseconds) taken to setup the cluster. The setup_duration of this JobRun. int
- `execution_duration` (int) — execution_duration of this JobRun. The time (in milliseconds) taken to complete the job execution. The execution_duration of this JobRun. int
- `cleanup_duration` (int) — cleanup_duration of this JobRun. The time (in milliseconds) taken to terminate the cluster and to clean up any associated artifacts. The cleanup_duration of this JobRun. int
- `run_duration` (int) — run_duration of this JobRun. The time (in milliseconds) taken to complete the job execution and all its repairs to finish. The run_duration of this JobRun. int
- `time_created` (datetime) — time_created of this JobRun. The time at which the job execution started. The time_created of this JobRun. datetime
- `time_updated` (datetime) — time_updated of this JobRun. The time at which the job execution was updated. The time_updated of this JobRun. datetime
- `launched` (str) — launched of this JobRun. Identify job run launched by schedule or manually. Allowed values for this property are: "SCHEDULED", "MANUAL", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The launched of this JobRun. str
- `version` (int) — version of this JobRun. Current version of job run object in repository. The version of this JobRun. int
- `task_to_task_run_map` (dict(str, str)) — task_to_task_run_map of this JobRun. Task to TaskRun map for given job run. The task_to_task_run_map of this JobRun. dict(str, str)
- `task_run_summary_map` (dict(str, object)) — task_run_summary_map of this JobRun. TaskRun to TaskRunSummary map for given job run. The task_run_summary_map of this JobRun. dict(str, object)
- `timeout_seconds` (int) — timeout_seconds of this JobRun. An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value. The timeout_seconds of this JobRun. int
- `repaired_tasks` (list[str]) — repaired_tasks of this JobRun. A list of repaired tasks. The repaired_tasks of this JobRun. list[str]
- `lifecycle_states` (list[LifecycleState]) — lifecycle_states of this JobRun. The collection of lifecycle states. The lifecycle_states of this JobRun. list[oci.aidataplatform_dp.models.LifecycleState]

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)

### `cancelJobRuns`
<a id='workflowclient-canceljobruns'></a>
Cancels all job runs for a given job.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `jobKey` (string) — Job key.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.

**Return Response:** `CancelJobRunsResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)

### `createJob`
<a id='workflowclient-createjob'></a>
Creates a job in an AI Data Platform Workbench.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `createJobDetails` (model.CreateJobDetails) — Details for the new job.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `CreateJobResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.Job

**Response Fields:**
- `key` (str) — **[Required]** key of this Job. The OCID of the job. The key of this Job. str
- `created_by` (str) — **[Required]** created_by of this Job. The OCID of the IAM user. The created_by of this Job. str
- `created_by_name` (str) — created_by_name of this Job. Name of the user who created this record The created_by_name of this Job. str
- `updated_by` (str) — updated_by of this Job. The username of the latest updater. The OCID of the IAM user. The updated_by of this Job. str
- `updated_by_name` (str) — updated_by_name of this Job. Name of the user who updated this record. The updated_by_name of this Job. str
- `run_as` (str) — run_as of this Job. The id with which the job run as. The run_as of this Job. str
- `name` (str) — **[Required]** name of this Job. A user-friendly name. Does not have to be unique, and is changeable. The name of this Job. str
- `description` (str) — description of this Job. A description for the job. The description of this Job. str
- `schedule` (Schedule) — schedule of this Job. The schedule of this Job. oci.aidataplatform_dp.models.Schedule
- `continuous` (Continuous) — continuous of this Job. The continuous of this Job. oci.aidataplatform_dp.models.Continuous
- `max_concurrent_runs` (int) — max_concurrent_runs of this Job. Indicates the number of executions for the same job that can be run concurrently. The maximum value cannot exceed 1000. The max_concurrent_runs of this Job. int
- `git_config` (GitConfig) — git_config of this Job. The git_config of this Job. oci.aidataplatform_dp.models.GitConfig
- `queue` (Queue) — queue of this Job. The queue of this Job. oci.aidataplatform_dp.models.Queue
- `path` (str) — path of this Job. The path to store the job definition in. The path of this Job. str
- `job_clusters` (list[JobCluster]) — job_clusters of this Job. List of job cluster configurations. The job_clusters of this Job. list[oci.aidataplatform_dp.models.JobCluster]
- `tasks` (list[Task]) — tasks of this Job. List of tasks in a job. The tasks of this Job. list[oci.aidataplatform_dp.models.Task]
- `time_created` (datetime) — time_created of this Job. The date and time the DataLake was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2025-05-25T21:10:29.600Z The time_created of this Job. datetime
- `time_updated` (datetime) — time_updated of this Job. The date and time the DataLake was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2025-05-25T21:10:29.600Z The time_updated of this Job. datetime
- `parameters` (list[Parameter]) — parameters of this Job. An optional list of parameters. The parameters of this Job. list[oci.aidataplatform_dp.models.Parameter]
- `timeout_seconds` (int) — timeout_seconds of this Job. An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value. The timeout_seconds of this Job. int

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)

### `createJobRun`
<a id='workflowclient-createjobrun'></a>
Creates a job run for an AI Data Platform Workbench.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `createJobRunDetails` (model.CreateJobRunDetails) — Details for the new job run.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `CreateJobRunResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.JobRun

**Response Fields:**
- `key` (str) — **[Required]** key of this JobRun. The OCID of the job. The key of this JobRun. str
- `name` (str) — **[Required]** name of this JobRun. A user-friendly name. Does not have to be unique, and is changeable. The name of this JobRun. str
- `job_key` (str) — **[Required]** job_key of this JobRun. The OCID of the job. The job_key of this JobRun. str
- `job_name` (str) — job_name of this JobRun. A user-friendly name. Does not have to be unique, and is changeable. The job_name of this JobRun. str
- `parent_job_run_key` (str) — parent_job_run_key of this JobRun. The OCID of the job. The parent_job_run_key of this JobRun. str
- `root_job_run_key` (str) — root_job_run_key of this JobRun. The OCID of the job. The root_job_run_key of this JobRun. str
- `parent_task_run_key` (str) — parent_task_run_key of this JobRun. The OCID of the task run. The parent_task_run_key of this JobRun. str
- `tasks` (list[Task]) — tasks of this JobRun. List of tasks in a job. The tasks of this JobRun. list[oci.aidataplatform_dp.models.Task]
- `created_by` (str) — created_by of this JobRun. The OCID of the IAM user. The created_by of this JobRun. str
- `created_by_name` (str) — created_by_name of this JobRun. Name of the user who created this record The created_by_name of this JobRun. str
- `max_concurrent_runs` (int) — max_concurrent_runs of this JobRun. Indicates the number of executions for the same job that can be run concurrently. The maximum value cannot exceed 1000. The max_concurrent_runs of this JobRun. int
- `git_config` (GitConfig) — git_config of this JobRun. The git_config of this JobRun. oci.aidataplatform_dp.models.GitConfig
- `queue` (Queue) — queue of this JobRun. The queue of this JobRun. oci.aidataplatform_dp.models.Queue
- `original_attempt_run_id` (str) — original_attempt_run_id of this JobRun. The OCID of the job. The original_attempt_run_id of this JobRun. str
- `state` (State) — state of this JobRun. The state of this JobRun. oci.aidataplatform_dp.models.State
- `schedule` (Schedule) — schedule of this JobRun. The schedule of this JobRun. oci.aidataplatform_dp.models.Schedule
- `cluster_spec` (ClusterSpec) — cluster_spec of this JobRun. The cluster_spec of this JobRun. oci.aidataplatform_dp.models.ClusterSpec
- `cluster_instance` (ClusterInstance) — cluster_instance of this JobRun. The cluster_instance of this JobRun. oci.aidataplatform_dp.models.ClusterInstance
- `parameters` (list[Parameter]) — parameters of this JobRun. An optional list of parameters. The parameters of this JobRun. list[oci.aidataplatform_dp.models.Parameter]
- `unified_job_and_job_run_parameters` (list[Parameter]) — unified_job_and_job_run_parameters of this JobRun. Unified List of job and job run parameters after resolving dynamic value references and parameter resolution as per precedence. The unified_job_and_job_run_parameters of this JobRun. list[oci.aidataplatform_dp.models.Parameter]
- `repair_history` (list[RepairHistory]) — repair_history of this JobRun. Array of repaired runs. The repair_history of this JobRun. list[oci.aidataplatform_dp.models.RepairHistory]
- `system_parameters` (dict(str, str)) — system_parameters of this JobRun. Map of system parameters with their values for this job run. The system_parameters of this JobRun. dict(str, str)
- `start_time` (int) — start_time of this JobRun. The time at which the job execution started in epoch milliseconds. The start_time of this JobRun. int
- `end_time` (int) — end_time of this JobRun. The time at which the job execution started in epoch milliseconds. The end_time of this JobRun. int
- `setup_duration` (int) — setup_duration of this JobRun. The time (in milliseconds) taken to setup the cluster. The setup_duration of this JobRun. int
- `execution_duration` (int) — execution_duration of this JobRun. The time (in milliseconds) taken to complete the job execution. The execution_duration of this JobRun. int
- `cleanup_duration` (int) — cleanup_duration of this JobRun. The time (in milliseconds) taken to terminate the cluster and to clean up any associated artifacts. The cleanup_duration of this JobRun. int
- `run_duration` (int) — run_duration of this JobRun. The time (in milliseconds) taken to complete the job execution and all its repairs to finish. The run_duration of this JobRun. int
- `time_created` (datetime) — time_created of this JobRun. The time at which the job execution started. The time_created of this JobRun. datetime
- `time_updated` (datetime) — time_updated of this JobRun. The time at which the job execution was updated. The time_updated of this JobRun. datetime
- `launched` (str) — launched of this JobRun. Identify job run launched by schedule or manually. Allowed values for this property are: "SCHEDULED", "MANUAL", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The launched of this JobRun. str
- `version` (int) — version of this JobRun. Current version of job run object in repository. The version of this JobRun. int
- `task_to_task_run_map` (dict(str, str)) — task_to_task_run_map of this JobRun. Task to TaskRun map for given job run. The task_to_task_run_map of this JobRun. dict(str, str)
- `task_run_summary_map` (dict(str, object)) — task_run_summary_map of this JobRun. TaskRun to TaskRunSummary map for given job run. The task_run_summary_map of this JobRun. dict(str, object)
- `timeout_seconds` (int) — timeout_seconds of this JobRun. An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value. The timeout_seconds of this JobRun. int
- `repaired_tasks` (list[str]) — repaired_tasks of this JobRun. A list of repaired tasks. The repaired_tasks of this JobRun. list[str]
- `lifecycle_states` (list[LifecycleState]) — lifecycle_states of this JobRun. The collection of lifecycle states. The lifecycle_states of this JobRun. list[oci.aidataplatform_dp.models.LifecycleState]

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)

### `deleteJob`
<a id='workflowclient-deletejob'></a>
Deletes a job from an AI Data Platform Workbench.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `jobKey` (string) — Job key.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `DeleteJobResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)

### `deleteJobRun`
<a id='workflowclient-deletejobrun'></a>
Deletes a job run from an AI Data Platform Workbench.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `jobRunKey` (string) — Job run key.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `DeleteJobRunResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)

### `exportTaskRunOutput`
<a id='workflowclient-exporttaskrunoutput'></a>
Exports task run output in HTML or ipynb format.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `taskRunKey` (string) — Task run key.
- `taskRunOutputKey` (string) — Task run output key.
- `exportTaskRunOutputDetails` (model.ExportTaskRunOutputDetails) — Payload to export task run output to a file.

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `ExportTaskRunOutputResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.ExportedTaskRunOutputContents

**Response Fields:**
- `type` (str) — **[Required]** type of this Task. The type of the task. Allowed values for this property are: "NOTEBOOK_TASK", "PYTHON_TASK", "SPARK_SUBMIT_TASK", "IF_ELSE_TASK", "JOB_TASK", "JAR_TASK", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The type of this Task. str
- `task_key` (str) — **[Required]** task_key of this Task. The display name of the task. User can specify a value for this. The task_key of this Task. str
- `depends_on` (list[DependsOn]) — depends_on of this Task. Specifies the dependency graph of the task. All the tasks mentioned in this field need to be completed before executing this task. The depends_on of this Task. list[oci.aidataplatform_dp.models.DependsOn]
- `run_if` (str) — **[Required]** run_if of this Task. The trigger rule based on which the current task execution is determined. Allowed values for this property are: "ALL_SUCCESS", "ALL_DONE", "NONE_FAILED", "AT_LEAST_ONE_SUCCESS", "ALL_FAILED", "AT_LEAST_ONE_FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The run_if of this Task. str
- `max_retries` (int) — max_retries of this Task. The maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it fails with status FAILED or INTERNAL_ERROR. Maximum value is 300. The max_retries of this Task. int
- `min_retry_interval_millis` (int) — min_retry_interval_millis of this Task. An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. If value is not provided, the run would be immediately retried. Maximum value is 10 mins (600000) The min_retry_interval_millis of this Task. int
- `is_retry_on_timeout` (bool) — is_retry_on_timeout of this Task. An optional policy to specify whether to retry a task when it times out. The default behavior is to not retry on timeout. The is_retry_on_timeout of this Task. bool

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)

### `fetchOutput`
<a id='workflowclient-fetchoutput'></a>
Fetches the task run output from the runtime engine.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `taskRunKey` (string) — Task run key.
- `fetchOutputDetails` (model.FetchOutputDetails) — Details for task run output retrieval.

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.

**Return Response:** `FetchOutputResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.TaskRunOutput

**Response Fields:**
- `type` (str) — **[Required]** type of this Task. The type of the task. Allowed values for this property are: "NOTEBOOK_TASK", "PYTHON_TASK", "SPARK_SUBMIT_TASK", "IF_ELSE_TASK", "JOB_TASK", "JAR_TASK", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The type of this Task. str
- `task_key` (str) — **[Required]** task_key of this Task. The display name of the task. User can specify a value for this. The task_key of this Task. str
- `depends_on` (list[DependsOn]) — depends_on of this Task. Specifies the dependency graph of the task. All the tasks mentioned in this field need to be completed before executing this task. The depends_on of this Task. list[oci.aidataplatform_dp.models.DependsOn]
- `run_if` (str) — **[Required]** run_if of this Task. The trigger rule based on which the current task execution is determined. Allowed values for this property are: "ALL_SUCCESS", "ALL_DONE", "NONE_FAILED", "AT_LEAST_ONE_SUCCESS", "ALL_FAILED", "AT_LEAST_ONE_FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The run_if of this Task. str
- `max_retries` (int) — max_retries of this Task. The maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it fails with status FAILED or INTERNAL_ERROR. Maximum value is 300. The max_retries of this Task. int
- `min_retry_interval_millis` (int) — min_retry_interval_millis of this Task. An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. If value is not provided, the run would be immediately retried. Maximum value is 10 mins (600000) The min_retry_interval_millis of this Task. int
- `is_retry_on_timeout` (bool) — is_retry_on_timeout of this Task. An optional policy to specify whether to retry a task when it times out. The default behavior is to not retry on timeout. The is_retry_on_timeout of this Task. bool

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)

### `getJob`
<a id='workflowclient-getjob'></a>
Returns detailed information about a given job in AI Data Platform Workbench.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `jobKey` (string) — Job key.

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `GetJobResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.Job

**Response Fields:**
- `key` (str) — **[Required]** key of this Job. The OCID of the job. The key of this Job. str
- `created_by` (str) — **[Required]** created_by of this Job. The OCID of the IAM user. The created_by of this Job. str
- `created_by_name` (str) — created_by_name of this Job. Name of the user who created this record The created_by_name of this Job. str
- `updated_by` (str) — updated_by of this Job. The username of the latest updater. The OCID of the IAM user. The updated_by of this Job. str
- `updated_by_name` (str) — updated_by_name of this Job. Name of the user who updated this record. The updated_by_name of this Job. str
- `run_as` (str) — run_as of this Job. The id with which the job run as. The run_as of this Job. str
- `name` (str) — **[Required]** name of this Job. A user-friendly name. Does not have to be unique, and is changeable. The name of this Job. str
- `description` (str) — description of this Job. A description for the job. The description of this Job. str
- `schedule` (Schedule) — schedule of this Job. The schedule of this Job. oci.aidataplatform_dp.models.Schedule
- `continuous` (Continuous) — continuous of this Job. The continuous of this Job. oci.aidataplatform_dp.models.Continuous
- `max_concurrent_runs` (int) — max_concurrent_runs of this Job. Indicates the number of executions for the same job that can be run concurrently. The maximum value cannot exceed 1000. The max_concurrent_runs of this Job. int
- `git_config` (GitConfig) — git_config of this Job. The git_config of this Job. oci.aidataplatform_dp.models.GitConfig
- `queue` (Queue) — queue of this Job. The queue of this Job. oci.aidataplatform_dp.models.Queue
- `path` (str) — path of this Job. The path to store the job definition in. The path of this Job. str
- `job_clusters` (list[JobCluster]) — job_clusters of this Job. List of job cluster configurations. The job_clusters of this Job. list[oci.aidataplatform_dp.models.JobCluster]
- `tasks` (list[Task]) — tasks of this Job. List of tasks in a job. The tasks of this Job. list[oci.aidataplatform_dp.models.Task]
- `time_created` (datetime) — time_created of this Job. The date and time the DataLake was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2025-05-25T21:10:29.600Z The time_created of this Job. datetime
- `time_updated` (datetime) — time_updated of this Job. The date and time the DataLake was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2025-05-25T21:10:29.600Z The time_updated of this Job. datetime
- `parameters` (list[Parameter]) — parameters of this Job. An optional list of parameters. The parameters of this Job. list[oci.aidataplatform_dp.models.Parameter]
- `timeout_seconds` (int) — timeout_seconds of this Job. An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value. The timeout_seconds of this Job. int

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)

### `getJobRun`
<a id='workflowclient-getjobrun'></a>
Returns detailed information about a given job run.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `jobRunKey` (string) — Job run key.

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `GetJobRunResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.JobRun

**Response Fields:**
- `key` (str) — **[Required]** key of this JobRun. The OCID of the job. The key of this JobRun. str
- `name` (str) — **[Required]** name of this JobRun. A user-friendly name. Does not have to be unique, and is changeable. The name of this JobRun. str
- `job_key` (str) — **[Required]** job_key of this JobRun. The OCID of the job. The job_key of this JobRun. str
- `job_name` (str) — job_name of this JobRun. A user-friendly name. Does not have to be unique, and is changeable. The job_name of this JobRun. str
- `parent_job_run_key` (str) — parent_job_run_key of this JobRun. The OCID of the job. The parent_job_run_key of this JobRun. str
- `root_job_run_key` (str) — root_job_run_key of this JobRun. The OCID of the job. The root_job_run_key of this JobRun. str
- `parent_task_run_key` (str) — parent_task_run_key of this JobRun. The OCID of the task run. The parent_task_run_key of this JobRun. str
- `tasks` (list[Task]) — tasks of this JobRun. List of tasks in a job. The tasks of this JobRun. list[oci.aidataplatform_dp.models.Task]
- `created_by` (str) — created_by of this JobRun. The OCID of the IAM user. The created_by of this JobRun. str
- `created_by_name` (str) — created_by_name of this JobRun. Name of the user who created this record The created_by_name of this JobRun. str
- `max_concurrent_runs` (int) — max_concurrent_runs of this JobRun. Indicates the number of executions for the same job that can be run concurrently. The maximum value cannot exceed 1000. The max_concurrent_runs of this JobRun. int
- `git_config` (GitConfig) — git_config of this JobRun. The git_config of this JobRun. oci.aidataplatform_dp.models.GitConfig
- `queue` (Queue) — queue of this JobRun. The queue of this JobRun. oci.aidataplatform_dp.models.Queue
- `original_attempt_run_id` (str) — original_attempt_run_id of this JobRun. The OCID of the job. The original_attempt_run_id of this JobRun. str
- `state` (State) — state of this JobRun. The state of this JobRun. oci.aidataplatform_dp.models.State
- `schedule` (Schedule) — schedule of this JobRun. The schedule of this JobRun. oci.aidataplatform_dp.models.Schedule
- `cluster_spec` (ClusterSpec) — cluster_spec of this JobRun. The cluster_spec of this JobRun. oci.aidataplatform_dp.models.ClusterSpec
- `cluster_instance` (ClusterInstance) — cluster_instance of this JobRun. The cluster_instance of this JobRun. oci.aidataplatform_dp.models.ClusterInstance
- `parameters` (list[Parameter]) — parameters of this JobRun. An optional list of parameters. The parameters of this JobRun. list[oci.aidataplatform_dp.models.Parameter]
- `unified_job_and_job_run_parameters` (list[Parameter]) — unified_job_and_job_run_parameters of this JobRun. Unified List of job and job run parameters after resolving dynamic value references and parameter resolution as per precedence. The unified_job_and_job_run_parameters of this JobRun. list[oci.aidataplatform_dp.models.Parameter]
- `repair_history` (list[RepairHistory]) — repair_history of this JobRun. Array of repaired runs. The repair_history of this JobRun. list[oci.aidataplatform_dp.models.RepairHistory]
- `system_parameters` (dict(str, str)) — system_parameters of this JobRun. Map of system parameters with their values for this job run. The system_parameters of this JobRun. dict(str, str)
- `start_time` (int) — start_time of this JobRun. The time at which the job execution started in epoch milliseconds. The start_time of this JobRun. int
- `end_time` (int) — end_time of this JobRun. The time at which the job execution started in epoch milliseconds. The end_time of this JobRun. int
- `setup_duration` (int) — setup_duration of this JobRun. The time (in milliseconds) taken to setup the cluster. The setup_duration of this JobRun. int
- `execution_duration` (int) — execution_duration of this JobRun. The time (in milliseconds) taken to complete the job execution. The execution_duration of this JobRun. int
- `cleanup_duration` (int) — cleanup_duration of this JobRun. The time (in milliseconds) taken to terminate the cluster and to clean up any associated artifacts. The cleanup_duration of this JobRun. int
- `run_duration` (int) — run_duration of this JobRun. The time (in milliseconds) taken to complete the job execution and all its repairs to finish. The run_duration of this JobRun. int
- `time_created` (datetime) — time_created of this JobRun. The time at which the job execution started. The time_created of this JobRun. datetime
- `time_updated` (datetime) — time_updated of this JobRun. The time at which the job execution was updated. The time_updated of this JobRun. datetime
- `launched` (str) — launched of this JobRun. Identify job run launched by schedule or manually. Allowed values for this property are: "SCHEDULED", "MANUAL", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The launched of this JobRun. str
- `version` (int) — version of this JobRun. Current version of job run object in repository. The version of this JobRun. int
- `task_to_task_run_map` (dict(str, str)) — task_to_task_run_map of this JobRun. Task to TaskRun map for given job run. The task_to_task_run_map of this JobRun. dict(str, str)
- `task_run_summary_map` (dict(str, object)) — task_run_summary_map of this JobRun. TaskRun to TaskRunSummary map for given job run. The task_run_summary_map of this JobRun. dict(str, object)
- `timeout_seconds` (int) — timeout_seconds of this JobRun. An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value. The timeout_seconds of this JobRun. int
- `repaired_tasks` (list[str]) — repaired_tasks of this JobRun. A list of repaired tasks. The repaired_tasks of this JobRun. list[str]
- `lifecycle_states` (list[LifecycleState]) — lifecycle_states of this JobRun. The collection of lifecycle states. The lifecycle_states of this JobRun. list[oci.aidataplatform_dp.models.LifecycleState]

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)

### `getTaskRun`
<a id='workflowclient-gettaskrun'></a>
Returns detailed information about a task run with a given task run key.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `taskRunKey` (string) — Task run key.

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `GetTaskRunResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.TaskRun

**Response Fields:**
- `type` (str) — **[Required]** type of this Task. The type of the task. Allowed values for this property are: "NOTEBOOK_TASK", "PYTHON_TASK", "SPARK_SUBMIT_TASK", "IF_ELSE_TASK", "JOB_TASK", "JAR_TASK", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The type of this Task. str
- `task_key` (str) — **[Required]** task_key of this Task. The display name of the task. User can specify a value for this. The task_key of this Task. str
- `depends_on` (list[DependsOn]) — depends_on of this Task. Specifies the dependency graph of the task. All the tasks mentioned in this field need to be completed before executing this task. The depends_on of this Task. list[oci.aidataplatform_dp.models.DependsOn]
- `run_if` (str) — **[Required]** run_if of this Task. The trigger rule based on which the current task execution is determined. Allowed values for this property are: "ALL_SUCCESS", "ALL_DONE", "NONE_FAILED", "AT_LEAST_ONE_SUCCESS", "ALL_FAILED", "AT_LEAST_ONE_FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The run_if of this Task. str
- `max_retries` (int) — max_retries of this Task. The maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it fails with status FAILED or INTERNAL_ERROR. Maximum value is 300. The max_retries of this Task. int
- `min_retry_interval_millis` (int) — min_retry_interval_millis of this Task. An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. If value is not provided, the run would be immediately retried. Maximum value is 10 mins (600000) The min_retry_interval_millis of this Task. int
- `is_retry_on_timeout` (bool) — is_retry_on_timeout of this Task. An optional policy to specify whether to retry a task when it times out. The default behavior is to not retry on timeout. The is_retry_on_timeout of this Task. bool

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)

### `listJobPermissions`
<a id='workflowclient-listjobpermissions'></a>
Returns a list of job permissions.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `jobKey` (string) — Job key.

**Optional Parameters:**
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination](
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination](
- `sortOrder` (model.SortOrder) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (ListJobPermissionsRequest.SortBy) — The field to sort by. You can provide only one sort order.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `ListJobPermissionsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.JobPermissionCollection

**Response Fields:**
- `items` (list[JobPermissionSummary]) — **[Required]** items of this JobPermissionCollection. List of job permissions. The items of this JobPermissionCollection. list[oci.aidataplatform_dp.models.JobPermissionSummary]

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)

### `listJobRuns`
<a id='workflowclient-listjobruns'></a>
Returns a detailed list of job runs in an AI Data Platform Workbench.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace

**Optional Parameters:**
- `displayName` (string) — A filter to return only resources that match the given display name exactly.
- `jobKey` (Array<string>) — The field to filter based on job key.
- `status` (Array<ListJobRunsRequest.Status>) — The field to filter based on state.
- `timeCreatedGreaterThanOrEqualTo` (Date) — Fetch objects from repository that were created after or at the exact timestamp provided in parameter
- `timeCreatedLessThanOrEqualTo` (Date) — Fetch objects from repository that were created before or at the exact timestamp provided in parameter.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated List call.
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination](
- `sortOrder` (model.SortOrder) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (ListJobRunsRequest.SortBy) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `ListJobRunsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.JobRunCollection

**Response Fields:**
- `key` (str) — **[Required]** key of this JobRun. The OCID of the job. The key of this JobRun. str
- `name` (str) — **[Required]** name of this JobRun. A user-friendly name. Does not have to be unique, and is changeable. The name of this JobRun. str
- `job_key` (str) — **[Required]** job_key of this JobRun. The OCID of the job. The job_key of this JobRun. str
- `job_name` (str) — job_name of this JobRun. A user-friendly name. Does not have to be unique, and is changeable. The job_name of this JobRun. str
- `parent_job_run_key` (str) — parent_job_run_key of this JobRun. The OCID of the job. The parent_job_run_key of this JobRun. str
- `root_job_run_key` (str) — root_job_run_key of this JobRun. The OCID of the job. The root_job_run_key of this JobRun. str
- `parent_task_run_key` (str) — parent_task_run_key of this JobRun. The OCID of the task run. The parent_task_run_key of this JobRun. str
- `tasks` (list[Task]) — tasks of this JobRun. List of tasks in a job. The tasks of this JobRun. list[oci.aidataplatform_dp.models.Task]
- `created_by` (str) — created_by of this JobRun. The OCID of the IAM user. The created_by of this JobRun. str
- `created_by_name` (str) — created_by_name of this JobRun. Name of the user who created this record The created_by_name of this JobRun. str
- `max_concurrent_runs` (int) — max_concurrent_runs of this JobRun. Indicates the number of executions for the same job that can be run concurrently. The maximum value cannot exceed 1000. The max_concurrent_runs of this JobRun. int
- `git_config` (GitConfig) — git_config of this JobRun. The git_config of this JobRun. oci.aidataplatform_dp.models.GitConfig
- `queue` (Queue) — queue of this JobRun. The queue of this JobRun. oci.aidataplatform_dp.models.Queue
- `original_attempt_run_id` (str) — original_attempt_run_id of this JobRun. The OCID of the job. The original_attempt_run_id of this JobRun. str
- `state` (State) — state of this JobRun. The state of this JobRun. oci.aidataplatform_dp.models.State
- `schedule` (Schedule) — schedule of this JobRun. The schedule of this JobRun. oci.aidataplatform_dp.models.Schedule
- `cluster_spec` (ClusterSpec) — cluster_spec of this JobRun. The cluster_spec of this JobRun. oci.aidataplatform_dp.models.ClusterSpec
- `cluster_instance` (ClusterInstance) — cluster_instance of this JobRun. The cluster_instance of this JobRun. oci.aidataplatform_dp.models.ClusterInstance
- `parameters` (list[Parameter]) — parameters of this JobRun. An optional list of parameters. The parameters of this JobRun. list[oci.aidataplatform_dp.models.Parameter]
- `unified_job_and_job_run_parameters` (list[Parameter]) — unified_job_and_job_run_parameters of this JobRun. Unified List of job and job run parameters after resolving dynamic value references and parameter resolution as per precedence. The unified_job_and_job_run_parameters of this JobRun. list[oci.aidataplatform_dp.models.Parameter]
- `repair_history` (list[RepairHistory]) — repair_history of this JobRun. Array of repaired runs. The repair_history of this JobRun. list[oci.aidataplatform_dp.models.RepairHistory]
- `system_parameters` (dict(str, str)) — system_parameters of this JobRun. Map of system parameters with their values for this job run. The system_parameters of this JobRun. dict(str, str)
- `start_time` (int) — start_time of this JobRun. The time at which the job execution started in epoch milliseconds. The start_time of this JobRun. int
- `end_time` (int) — end_time of this JobRun. The time at which the job execution started in epoch milliseconds. The end_time of this JobRun. int
- `setup_duration` (int) — setup_duration of this JobRun. The time (in milliseconds) taken to setup the cluster. The setup_duration of this JobRun. int
- `execution_duration` (int) — execution_duration of this JobRun. The time (in milliseconds) taken to complete the job execution. The execution_duration of this JobRun. int
- `cleanup_duration` (int) — cleanup_duration of this JobRun. The time (in milliseconds) taken to terminate the cluster and to clean up any associated artifacts. The cleanup_duration of this JobRun. int
- `run_duration` (int) — run_duration of this JobRun. The time (in milliseconds) taken to complete the job execution and all its repairs to finish. The run_duration of this JobRun. int
- `time_created` (datetime) — time_created of this JobRun. The time at which the job execution started. The time_created of this JobRun. datetime
- `time_updated` (datetime) — time_updated of this JobRun. The time at which the job execution was updated. The time_updated of this JobRun. datetime
- `launched` (str) — launched of this JobRun. Identify job run launched by schedule or manually. Allowed values for this property are: "SCHEDULED", "MANUAL", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The launched of this JobRun. str
- `version` (int) — version of this JobRun. Current version of job run object in repository. The version of this JobRun. int
- `task_to_task_run_map` (dict(str, str)) — task_to_task_run_map of this JobRun. Task to TaskRun map for given job run. The task_to_task_run_map of this JobRun. dict(str, str)
- `task_run_summary_map` (dict(str, object)) — task_run_summary_map of this JobRun. TaskRun to TaskRunSummary map for given job run. The task_run_summary_map of this JobRun. dict(str, object)
- `timeout_seconds` (int) — timeout_seconds of this JobRun. An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value. The timeout_seconds of this JobRun. int
- `repaired_tasks` (list[str]) — repaired_tasks of this JobRun. A list of repaired tasks. The repaired_tasks of this JobRun. list[str]
- `lifecycle_states` (list[LifecycleState]) — lifecycle_states of this JobRun. The collection of lifecycle states. The lifecycle_states of this JobRun. list[oci.aidataplatform_dp.models.LifecycleState]

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)

### `listJobs`
<a id='workflowclient-listjobs'></a>
Returns a list of jobs for a given AI Data Platform Workbench.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace

**Optional Parameters:**
- `displayName` (string) — A filter to return only resources that match the given display name exactly.
- `displayNameContains` (string) — A filter to return only resources that have a display name containing the text provided.
- `path` (string) — The fully qualified path where the job is stored.
- `createdBy` (string) — A filter to return only resources that are created by given user with username that matches exactly.
- `updatedBy` (string) — A filter to return only resources that was last updated by given user with username that matches exactly.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination](
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination](
- `sortOrder` (model.SortOrder) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (ListJobsRequest.SortBy) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `ListJobsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.JobCollection

**Response Fields:**
- `items` (list[JobSummary]) — **[Required]** items of this JobCollection. List of jobs. The items of this JobCollection. list[oci.aidataplatform_dp.models.JobSummary]

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)

### `listRecentJobRuns`
<a id='workflowclient-listrecentjobruns'></a>
Returns a list of the latest job runs for a given job key.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `jobKey` (Array<string>) — The field to filter based on job key.

**Optional Parameters:**
- `recordCount` (number) — The number of records to fetch.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated List call.
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination](
- `sortOrder` (model.SortOrder) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (ListRecentJobRunsRequest.SortBy) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `ListRecentJobRunsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.JobRunCollection

**Response Fields:**
- `key` (str) — **[Required]** key of this JobRun. The OCID of the job. The key of this JobRun. str
- `name` (str) — **[Required]** name of this JobRun. A user-friendly name. Does not have to be unique, and is changeable. The name of this JobRun. str
- `job_key` (str) — **[Required]** job_key of this JobRun. The OCID of the job. The job_key of this JobRun. str
- `job_name` (str) — job_name of this JobRun. A user-friendly name. Does not have to be unique, and is changeable. The job_name of this JobRun. str
- `parent_job_run_key` (str) — parent_job_run_key of this JobRun. The OCID of the job. The parent_job_run_key of this JobRun. str
- `root_job_run_key` (str) — root_job_run_key of this JobRun. The OCID of the job. The root_job_run_key of this JobRun. str
- `parent_task_run_key` (str) — parent_task_run_key of this JobRun. The OCID of the task run. The parent_task_run_key of this JobRun. str
- `tasks` (list[Task]) — tasks of this JobRun. List of tasks in a job. The tasks of this JobRun. list[oci.aidataplatform_dp.models.Task]
- `created_by` (str) — created_by of this JobRun. The OCID of the IAM user. The created_by of this JobRun. str
- `created_by_name` (str) — created_by_name of this JobRun. Name of the user who created this record The created_by_name of this JobRun. str
- `max_concurrent_runs` (int) — max_concurrent_runs of this JobRun. Indicates the number of executions for the same job that can be run concurrently. The maximum value cannot exceed 1000. The max_concurrent_runs of this JobRun. int
- `git_config` (GitConfig) — git_config of this JobRun. The git_config of this JobRun. oci.aidataplatform_dp.models.GitConfig
- `queue` (Queue) — queue of this JobRun. The queue of this JobRun. oci.aidataplatform_dp.models.Queue
- `original_attempt_run_id` (str) — original_attempt_run_id of this JobRun. The OCID of the job. The original_attempt_run_id of this JobRun. str
- `state` (State) — state of this JobRun. The state of this JobRun. oci.aidataplatform_dp.models.State
- `schedule` (Schedule) — schedule of this JobRun. The schedule of this JobRun. oci.aidataplatform_dp.models.Schedule
- `cluster_spec` (ClusterSpec) — cluster_spec of this JobRun. The cluster_spec of this JobRun. oci.aidataplatform_dp.models.ClusterSpec
- `cluster_instance` (ClusterInstance) — cluster_instance of this JobRun. The cluster_instance of this JobRun. oci.aidataplatform_dp.models.ClusterInstance
- `parameters` (list[Parameter]) — parameters of this JobRun. An optional list of parameters. The parameters of this JobRun. list[oci.aidataplatform_dp.models.Parameter]
- `unified_job_and_job_run_parameters` (list[Parameter]) — unified_job_and_job_run_parameters of this JobRun. Unified List of job and job run parameters after resolving dynamic value references and parameter resolution as per precedence. The unified_job_and_job_run_parameters of this JobRun. list[oci.aidataplatform_dp.models.Parameter]
- `repair_history` (list[RepairHistory]) — repair_history of this JobRun. Array of repaired runs. The repair_history of this JobRun. list[oci.aidataplatform_dp.models.RepairHistory]
- `system_parameters` (dict(str, str)) — system_parameters of this JobRun. Map of system parameters with their values for this job run. The system_parameters of this JobRun. dict(str, str)
- `start_time` (int) — start_time of this JobRun. The time at which the job execution started in epoch milliseconds. The start_time of this JobRun. int
- `end_time` (int) — end_time of this JobRun. The time at which the job execution started in epoch milliseconds. The end_time of this JobRun. int
- `setup_duration` (int) — setup_duration of this JobRun. The time (in milliseconds) taken to setup the cluster. The setup_duration of this JobRun. int
- `execution_duration` (int) — execution_duration of this JobRun. The time (in milliseconds) taken to complete the job execution. The execution_duration of this JobRun. int
- `cleanup_duration` (int) — cleanup_duration of this JobRun. The time (in milliseconds) taken to terminate the cluster and to clean up any associated artifacts. The cleanup_duration of this JobRun. int
- `run_duration` (int) — run_duration of this JobRun. The time (in milliseconds) taken to complete the job execution and all its repairs to finish. The run_duration of this JobRun. int
- `time_created` (datetime) — time_created of this JobRun. The time at which the job execution started. The time_created of this JobRun. datetime
- `time_updated` (datetime) — time_updated of this JobRun. The time at which the job execution was updated. The time_updated of this JobRun. datetime
- `launched` (str) — launched of this JobRun. Identify job run launched by schedule or manually. Allowed values for this property are: "SCHEDULED", "MANUAL", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The launched of this JobRun. str
- `version` (int) — version of this JobRun. Current version of job run object in repository. The version of this JobRun. int
- `task_to_task_run_map` (dict(str, str)) — task_to_task_run_map of this JobRun. Task to TaskRun map for given job run. The task_to_task_run_map of this JobRun. dict(str, str)
- `task_run_summary_map` (dict(str, object)) — task_run_summary_map of this JobRun. TaskRun to TaskRunSummary map for given job run. The task_run_summary_map of this JobRun. dict(str, object)
- `timeout_seconds` (int) — timeout_seconds of this JobRun. An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value. The timeout_seconds of this JobRun. int
- `repaired_tasks` (list[str]) — repaired_tasks of this JobRun. A list of repaired tasks. The repaired_tasks of this JobRun. list[str]
- `lifecycle_states` (list[LifecycleState]) — lifecycle_states of this JobRun. The collection of lifecycle states. The lifecycle_states of this JobRun. list[oci.aidataplatform_dp.models.LifecycleState]

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)

### `listTaskRuns`
<a id='workflowclient-listtaskruns'></a>
Returns a list of tasks run in an AI Data Platform Workbench.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `jobRunKey` (string) — The field to filter based on job run key.

**Optional Parameters:**
- `displayName` (string) — A filter to return only resources that match the given display name exactly.
- `status` (Array<ListTaskRunsRequest.Status>) — The field to filter based on state.
- `parentJobRunKey` (string) — The field to filter based on parent job run key.
- `rootJobRunKey` (string) — The field to filter based on root job run key.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination](
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination](
- `sortOrder` (model.SortOrder) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (ListTaskRunsRequest.SortBy) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `ListTaskRunsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.TaskRunCollection

**Response Fields:**
- `type` (str) — **[Required]** type of this Task. The type of the task. Allowed values for this property are: "NOTEBOOK_TASK", "PYTHON_TASK", "SPARK_SUBMIT_TASK", "IF_ELSE_TASK", "JOB_TASK", "JAR_TASK", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The type of this Task. str
- `task_key` (str) — **[Required]** task_key of this Task. The display name of the task. User can specify a value for this. The task_key of this Task. str
- `depends_on` (list[DependsOn]) — depends_on of this Task. Specifies the dependency graph of the task. All the tasks mentioned in this field need to be completed before executing this task. The depends_on of this Task. list[oci.aidataplatform_dp.models.DependsOn]
- `run_if` (str) — **[Required]** run_if of this Task. The trigger rule based on which the current task execution is determined. Allowed values for this property are: "ALL_SUCCESS", "ALL_DONE", "NONE_FAILED", "AT_LEAST_ONE_SUCCESS", "ALL_FAILED", "AT_LEAST_ONE_FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The run_if of this Task. str
- `max_retries` (int) — max_retries of this Task. The maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it fails with status FAILED or INTERNAL_ERROR. Maximum value is 300. The max_retries of this Task. int
- `min_retry_interval_millis` (int) — min_retry_interval_millis of this Task. An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. If value is not provided, the run would be immediately retried. Maximum value is 10 mins (600000) The min_retry_interval_millis of this Task. int
- `is_retry_on_timeout` (bool) — is_retry_on_timeout of this Task. An optional policy to specify whether to retry a task when it times out. The default behavior is to not retry on timeout. The is_retry_on_timeout of this Task. bool

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)

### `manageJobPermission`
<a id='workflowclient-managejobpermission'></a>
Update job permissions with the provided details.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `jobKey` (string) — Job key.
- `manageJobPermissionDetails` (model.ManageJobPermissionDetails) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `ManageJobPermissionResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)

### `repairJobRun`
<a id='workflowclient-repairjobrun'></a>
Repairs and reruns a job run.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `jobRunKey` (string) — Job run key.
- `repairJobRunDetails` (model.RepairJobRunDetails) — Details of the job run to be repaired.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `RepairJobRunResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.JobRun

**Response Fields:**
- `key` (str) — **[Required]** key of this JobRun. The OCID of the job. The key of this JobRun. str
- `name` (str) — **[Required]** name of this JobRun. A user-friendly name. Does not have to be unique, and is changeable. The name of this JobRun. str
- `job_key` (str) — **[Required]** job_key of this JobRun. The OCID of the job. The job_key of this JobRun. str
- `job_name` (str) — job_name of this JobRun. A user-friendly name. Does not have to be unique, and is changeable. The job_name of this JobRun. str
- `parent_job_run_key` (str) — parent_job_run_key of this JobRun. The OCID of the job. The parent_job_run_key of this JobRun. str
- `root_job_run_key` (str) — root_job_run_key of this JobRun. The OCID of the job. The root_job_run_key of this JobRun. str
- `parent_task_run_key` (str) — parent_task_run_key of this JobRun. The OCID of the task run. The parent_task_run_key of this JobRun. str
- `tasks` (list[Task]) — tasks of this JobRun. List of tasks in a job. The tasks of this JobRun. list[oci.aidataplatform_dp.models.Task]
- `created_by` (str) — created_by of this JobRun. The OCID of the IAM user. The created_by of this JobRun. str
- `created_by_name` (str) — created_by_name of this JobRun. Name of the user who created this record The created_by_name of this JobRun. str
- `max_concurrent_runs` (int) — max_concurrent_runs of this JobRun. Indicates the number of executions for the same job that can be run concurrently. The maximum value cannot exceed 1000. The max_concurrent_runs of this JobRun. int
- `git_config` (GitConfig) — git_config of this JobRun. The git_config of this JobRun. oci.aidataplatform_dp.models.GitConfig
- `queue` (Queue) — queue of this JobRun. The queue of this JobRun. oci.aidataplatform_dp.models.Queue
- `original_attempt_run_id` (str) — original_attempt_run_id of this JobRun. The OCID of the job. The original_attempt_run_id of this JobRun. str
- `state` (State) — state of this JobRun. The state of this JobRun. oci.aidataplatform_dp.models.State
- `schedule` (Schedule) — schedule of this JobRun. The schedule of this JobRun. oci.aidataplatform_dp.models.Schedule
- `cluster_spec` (ClusterSpec) — cluster_spec of this JobRun. The cluster_spec of this JobRun. oci.aidataplatform_dp.models.ClusterSpec
- `cluster_instance` (ClusterInstance) — cluster_instance of this JobRun. The cluster_instance of this JobRun. oci.aidataplatform_dp.models.ClusterInstance
- `parameters` (list[Parameter]) — parameters of this JobRun. An optional list of parameters. The parameters of this JobRun. list[oci.aidataplatform_dp.models.Parameter]
- `unified_job_and_job_run_parameters` (list[Parameter]) — unified_job_and_job_run_parameters of this JobRun. Unified List of job and job run parameters after resolving dynamic value references and parameter resolution as per precedence. The unified_job_and_job_run_parameters of this JobRun. list[oci.aidataplatform_dp.models.Parameter]
- `repair_history` (list[RepairHistory]) — repair_history of this JobRun. Array of repaired runs. The repair_history of this JobRun. list[oci.aidataplatform_dp.models.RepairHistory]
- `system_parameters` (dict(str, str)) — system_parameters of this JobRun. Map of system parameters with their values for this job run. The system_parameters of this JobRun. dict(str, str)
- `start_time` (int) — start_time of this JobRun. The time at which the job execution started in epoch milliseconds. The start_time of this JobRun. int
- `end_time` (int) — end_time of this JobRun. The time at which the job execution started in epoch milliseconds. The end_time of this JobRun. int
- `setup_duration` (int) — setup_duration of this JobRun. The time (in milliseconds) taken to setup the cluster. The setup_duration of this JobRun. int
- `execution_duration` (int) — execution_duration of this JobRun. The time (in milliseconds) taken to complete the job execution. The execution_duration of this JobRun. int
- `cleanup_duration` (int) — cleanup_duration of this JobRun. The time (in milliseconds) taken to terminate the cluster and to clean up any associated artifacts. The cleanup_duration of this JobRun. int
- `run_duration` (int) — run_duration of this JobRun. The time (in milliseconds) taken to complete the job execution and all its repairs to finish. The run_duration of this JobRun. int
- `time_created` (datetime) — time_created of this JobRun. The time at which the job execution started. The time_created of this JobRun. datetime
- `time_updated` (datetime) — time_updated of this JobRun. The time at which the job execution was updated. The time_updated of this JobRun. datetime
- `launched` (str) — launched of this JobRun. Identify job run launched by schedule or manually. Allowed values for this property are: "SCHEDULED", "MANUAL", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The launched of this JobRun. str
- `version` (int) — version of this JobRun. Current version of job run object in repository. The version of this JobRun. int
- `task_to_task_run_map` (dict(str, str)) — task_to_task_run_map of this JobRun. Task to TaskRun map for given job run. The task_to_task_run_map of this JobRun. dict(str, str)
- `task_run_summary_map` (dict(str, object)) — task_run_summary_map of this JobRun. TaskRun to TaskRunSummary map for given job run. The task_run_summary_map of this JobRun. dict(str, object)
- `timeout_seconds` (int) — timeout_seconds of this JobRun. An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value. The timeout_seconds of this JobRun. int
- `repaired_tasks` (list[str]) — repaired_tasks of this JobRun. A list of repaired tasks. The repaired_tasks of this JobRun. list[str]
- `lifecycle_states` (list[LifecycleState]) — lifecycle_states of this JobRun. The collection of lifecycle states. The lifecycle_states of this JobRun. list[oci.aidataplatform_dp.models.LifecycleState]

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)

### `updateJob`
<a id='workflowclient-updatejob'></a>
Update details for a job in AI Data Platform Workbench.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `jobKey` (string) — Job key.
- `updateJobDetails` (model.UpdateJobDetails) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `UpdateJobResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.Job

**Response Fields:**
- `key` (str) — **[Required]** key of this Job. The OCID of the job. The key of this Job. str
- `created_by` (str) — **[Required]** created_by of this Job. The OCID of the IAM user. The created_by of this Job. str
- `created_by_name` (str) — created_by_name of this Job. Name of the user who created this record The created_by_name of this Job. str
- `updated_by` (str) — updated_by of this Job. The username of the latest updater. The OCID of the IAM user. The updated_by of this Job. str
- `updated_by_name` (str) — updated_by_name of this Job. Name of the user who updated this record. The updated_by_name of this Job. str
- `run_as` (str) — run_as of this Job. The id with which the job run as. The run_as of this Job. str
- `name` (str) — **[Required]** name of this Job. A user-friendly name. Does not have to be unique, and is changeable. The name of this Job. str
- `description` (str) — description of this Job. A description for the job. The description of this Job. str
- `schedule` (Schedule) — schedule of this Job. The schedule of this Job. oci.aidataplatform_dp.models.Schedule
- `continuous` (Continuous) — continuous of this Job. The continuous of this Job. oci.aidataplatform_dp.models.Continuous
- `max_concurrent_runs` (int) — max_concurrent_runs of this Job. Indicates the number of executions for the same job that can be run concurrently. The maximum value cannot exceed 1000. The max_concurrent_runs of this Job. int
- `git_config` (GitConfig) — git_config of this Job. The git_config of this Job. oci.aidataplatform_dp.models.GitConfig
- `queue` (Queue) — queue of this Job. The queue of this Job. oci.aidataplatform_dp.models.Queue
- `path` (str) — path of this Job. The path to store the job definition in. The path of this Job. str
- `job_clusters` (list[JobCluster]) — job_clusters of this Job. List of job cluster configurations. The job_clusters of this Job. list[oci.aidataplatform_dp.models.JobCluster]
- `tasks` (list[Task]) — tasks of this Job. List of tasks in a job. The tasks of this Job. list[oci.aidataplatform_dp.models.Task]
- `time_created` (datetime) — time_created of this Job. The date and time the DataLake was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2025-05-25T21:10:29.600Z The time_created of this Job. datetime
- `time_updated` (datetime) — time_updated of this Job. The date and time the DataLake was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2025-05-25T21:10:29.600Z The time_updated of this Job. datetime
- `parameters` (list[Parameter]) — parameters of this Job. An optional list of parameters. The parameters of this Job. list[oci.aidataplatform_dp.models.Parameter]
- `timeout_seconds` (int) — timeout_seconds of this Job. An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value. The timeout_seconds of this Job. int

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)

## Workspace (`WorkspaceClient`)
<a id='workspaceclient-client'></a>
**Operations:**
- [`createGitFolder`](#workspaceclient-creategitfolder)
- [`createWorkspace`](#workspaceclient-createworkspace)
- [`deleteWorkspace`](#workspaceclient-deleteworkspace)
- [`getWorkspace`](#workspaceclient-getworkspace)
- [`listCreateWorkspacePermissions`](#workspaceclient-listcreateworkspacepermissions)
- [`listWorkspacePermissions`](#workspaceclient-listworkspacepermissions)
- [`listWorkspaces`](#workspaceclient-listworkspaces)
- [`manageCreateWorkspacePermission`](#workspaceclient-managecreateworkspacepermission)
- [`manageWorkspacePermission`](#workspaceclient-manageworkspacepermission)
- [`updateWorkspace`](#workspaceclient-updateworkspace)
- [`updateWorkspaceAsyncOperationStatus`](#workspaceclient-updateworkspaceasyncoperationstatus)

### `createGitFolder`
<a id='workspaceclient-creategitfolder'></a>
Creates a git folder in the workspace

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `createGitFolderDetails` (model.CreateGitFolderDetails) — The information to be updated.

**Optional Parameters:**
- `dhUserPrincipal` (string) — The DH User Principal Header .
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `CreateGitFolderResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.GitFolder

**Response Fields:**
- `folder_path` (str) — **[Required]** folder_path of this GitFolder. The absolute path of the Git folder user wants to create. The folder_path of this GitFolder. str
- `git_provider_key` (str) — git_provider_key of this GitFolder. key corresponding to Git service provider in git provider table. The git_provider_key of this GitFolder. str
- `git_repository_url` (str) — git_repository_url of this GitFolder. Git repository url used to clone. The git_repository_url of this GitFolder. str
- `description` (str) — description of this GitFolder. Short description about the git repository. The description of this GitFolder. str
- `branch_name` (str) — branch_name of this GitFolder. Git branch name that is cloned. The branch_name of this GitFolder. str
- `folder_metadata` (dict(str, object)) — folder_metadata of this GitFolder. The metadata about the folder, like branchName. The folder_metadata of this GitFolder. dict(str, object)

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)

### `createWorkspace`
<a id='workspaceclient-createworkspace'></a>
Creates a workspace.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `createWorkspaceDetails` (model.CreateWorkspaceDetails) — Details for the new workspace.

**Optional Parameters:**
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `CreateWorkspaceResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.Workspace

**Response Fields:**
- `key` (str) — **[Required]** key of this Workspace. The key of the AI Data Platform Workbench workspace. The key of this Workspace. str
- `display_name` (str) — **[Required]** display_name of this Workspace. A user-friendly name that has to be unique in a AI Data Platform Workbench instance. The display_name of this Workspace. str
- `description` (str) — description of this Workspace. Description of the workspace. The description of this Workspace. str
- `type` (str) — type of this Workspace. Workspace type. Type is DEFAULT for workspace created at AI Data Platform Workbench creation, type is USER for workspace created by AI Data Platform Workbench user. Allowed values for this property are: "DEFAULT", "USER", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The type of this Workspace. str
- `time_created` (datetime) — **[Required]** time_created of this Workspace. The date and time the AI Data Platform Workbench workspace was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2016-08-25T21:10:29.600Z The time_created of this Workspace. datetime
- `time_updated` (datetime) — time_updated of this Workspace. The date and time the AI Data Platform Workbench workspace was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2016-08-25T21:10:29.600Z The time_updated of this Workspace. datetime
- `lifecycle_state` (str) — **[Required]** lifecycle_state of this Workspace. The current state of the AI Data Platform Workbench workspace. Allowed values for this property are: "CREATING", "UPDATING", "ACTIVE", "DELETING", "DELETED", "FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The lifecycle_state of this Workspace. str
- `lifecycle_details` (str) — lifecycle_details of this Workspace. A message that describes the current state of the workspace in more detail. For example, can be used to provide actionable information for a resource in the Failed state. The lifecycle_details of this Workspace. str
- `system_tags` (dict(str, dict(str, object))) — system_tags of this Workspace. System tags for this resource. Each key is predefined and scoped to a namespace. Example: {"orcl-cloud": {"free-tier-retained": "true"}} The system_tags of this Workspace. dict(str, dict(str, object))
- `created_by` (str) — created_by of this Workspace. OCID of the user who created this record. The created_by of this Workspace. str
- `created_by_name` (str) — created_by_name of this Workspace. Name of the user who created this record. The created_by_name of this Workspace. str
- `updated_by` (str) — updated_by of this Workspace. OCID of the user who updated this record. The updated_by of this Workspace. str
- `updated_by_name` (str) — updated_by_name of this Workspace. Name of the user who updated this record. The updated_by_name of this Workspace. str
- `default_catalog_key` (str) — default_catalog_key of this Workspace. The key of the catalog to be used as the default catalog for this workspace. A default catalog in the workspace will allow users to use that catalog without the need to refer it in the notebook. For example, if default catalog is iCat1, and it has schema1 and table1, you can refer to the table in a notebook using: schema1.table1. The default_catalog_key of this Workspace. str
- `is_private_network_enabled` (bool) — is_private_network_enabled of this Workspace. A flag to display whether workspace is private network enabled or not. The is_private_network_enabled of this Workspace. bool
- `network_configuration_details` (WorkspaceNetworkConfigurationDetails) — network_configuration_details of this Workspace. The network_configuration_details of this Workspace. oci.aidataplatform_dp.models.WorkspaceNetworkConfigurationDetails
- `log_group_id` (str) — log_group_id of this Workspace. The OCID of the log group that contains the logs. This uniquely identifies a collection of logs within OCI Logging Service. The log_group_id of this Workspace. str
- `aic_user_schema_name` (str) — aic_user_schema_name of this Workspace. The name of the AIC user schema if created. The aic_user_schema_name of this Workspace. str

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)

### `deleteWorkspace`
<a id='workspaceclient-deleteworkspace'></a>
Deletes a workspace.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `timeDataLakeDeletion` (Date) — Deletion time in the case that a workspace is deleted during AI Data Platform Workbench deletion.

**Return Response:** `DeleteWorkspaceResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)

### `getWorkspace`
<a id='workspaceclient-getworkspace'></a>
Gets detailed information about a workspace.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace

**Optional Parameters:**
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `GetWorkspaceResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.Workspace

**Response Fields:**
- `key` (str) — **[Required]** key of this Workspace. The key of the AI Data Platform Workbench workspace. The key of this Workspace. str
- `display_name` (str) — **[Required]** display_name of this Workspace. A user-friendly name that has to be unique in a AI Data Platform Workbench instance. The display_name of this Workspace. str
- `description` (str) — description of this Workspace. Description of the workspace. The description of this Workspace. str
- `type` (str) — type of this Workspace. Workspace type. Type is DEFAULT for workspace created at AI Data Platform Workbench creation, type is USER for workspace created by AI Data Platform Workbench user. Allowed values for this property are: "DEFAULT", "USER", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The type of this Workspace. str
- `time_created` (datetime) — **[Required]** time_created of this Workspace. The date and time the AI Data Platform Workbench workspace was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2016-08-25T21:10:29.600Z The time_created of this Workspace. datetime
- `time_updated` (datetime) — time_updated of this Workspace. The date and time the AI Data Platform Workbench workspace was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2016-08-25T21:10:29.600Z The time_updated of this Workspace. datetime
- `lifecycle_state` (str) — **[Required]** lifecycle_state of this Workspace. The current state of the AI Data Platform Workbench workspace. Allowed values for this property are: "CREATING", "UPDATING", "ACTIVE", "DELETING", "DELETED", "FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The lifecycle_state of this Workspace. str
- `lifecycle_details` (str) — lifecycle_details of this Workspace. A message that describes the current state of the workspace in more detail. For example, can be used to provide actionable information for a resource in the Failed state. The lifecycle_details of this Workspace. str
- `system_tags` (dict(str, dict(str, object))) — system_tags of this Workspace. System tags for this resource. Each key is predefined and scoped to a namespace. Example: {"orcl-cloud": {"free-tier-retained": "true"}} The system_tags of this Workspace. dict(str, dict(str, object))
- `created_by` (str) — created_by of this Workspace. OCID of the user who created this record. The created_by of this Workspace. str
- `created_by_name` (str) — created_by_name of this Workspace. Name of the user who created this record. The created_by_name of this Workspace. str
- `updated_by` (str) — updated_by of this Workspace. OCID of the user who updated this record. The updated_by of this Workspace. str
- `updated_by_name` (str) — updated_by_name of this Workspace. Name of the user who updated this record. The updated_by_name of this Workspace. str
- `default_catalog_key` (str) — default_catalog_key of this Workspace. The key of the catalog to be used as the default catalog for this workspace. A default catalog in the workspace will allow users to use that catalog without the need to refer it in the notebook. For example, if default catalog is iCat1, and it has schema1 and table1, you can refer to the table in a notebook using: schema1.table1. The default_catalog_key of this Workspace. str
- `is_private_network_enabled` (bool) — is_private_network_enabled of this Workspace. A flag to display whether workspace is private network enabled or not. The is_private_network_enabled of this Workspace. bool
- `network_configuration_details` (WorkspaceNetworkConfigurationDetails) — network_configuration_details of this Workspace. The network_configuration_details of this Workspace. oci.aidataplatform_dp.models.WorkspaceNetworkConfigurationDetails
- `log_group_id` (str) — log_group_id of this Workspace. The OCID of the log group that contains the logs. This uniquely identifies a collection of logs within OCI Logging Service. The log_group_id of this Workspace. str
- `aic_user_schema_name` (str) — aic_user_schema_name of this Workspace. The name of the AIC user schema if created. The aic_user_schema_name of this Workspace. str

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)

### `listCreateWorkspacePermissions`
<a id='workspaceclient-listcreateworkspacepermissions'></a>
Gets a list of create workspace permission summary objects.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination](
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination](
- `sortOrder` (model.SortOrder) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (ListCreateWorkspacePermissionsRequest.SortBy) — The field to sort by. You can provide only one sort order. Default order for {@code granteeName} is ascending.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `ListCreateWorkspacePermissionsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.CreateWorkspacePermissionCollection

**Response Fields:**
- `items` (list[WorkspacePermissionSummary]) — **[Required]** items of this WorkspacePermissionCollection. List of workspace permissions. The items of this WorkspacePermissionCollection. list[oci.aidataplatform_dp.models.WorkspacePermissionSummary]

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)

### `listWorkspacePermissions`
<a id='workspaceclient-listworkspacepermissions'></a>
Gets a list of workspace permissions.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace

**Optional Parameters:**
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination](
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination](
- `sortOrder` (model.SortOrder) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (ListWorkspacePermissionsRequest.SortBy) — The field to sort by. You can provide only one sort order. Default order for {@code granteeName} is ascending.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `ListWorkspacePermissionsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.WorkspacePermissionCollection

**Response Fields:**
- `items` (list[WorkspacePermissionSummary]) — **[Required]** items of this WorkspacePermissionCollection. List of workspace permissions. The items of this WorkspacePermissionCollection. list[oci.aidataplatform_dp.models.WorkspacePermissionSummary]

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)

### `listWorkspaces`
<a id='workspaceclient-listworkspaces'></a>
Gets a list of workspaces.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `lifecycleState` (string) — A filter to return only resources that match the given lifecycle state. The state value is case-insensitive.
- `displayName` (string) — A filter to return only resources that match the given display name exactly.
- `displayNameContains` (string) — A filter to return only resources that have a display name containing the text provided.
- `type` (string) — When no value is provided, all workspaces are returned. Otherwise, workspace of selected value is returned.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination](
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination](
- `sortOrder` (model.SortOrder) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (ListWorkspacesRequest.SortBy) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `isPrivateNetworkEnabled` (boolean) — A flag to filter the workspaces which are private network enabled or disabled
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `ListWorkspacesResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.WorkspaceCollection

**Response Fields:**
- `items` (list[WorkspaceSummary]) — **[Required]** items of this WorkspaceCollection. List of workspaces. The items of this WorkspaceCollection. list[oci.aidataplatform_dp.models.WorkspaceSummary]

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)

### `manageCreateWorkspacePermission`
<a id='workspaceclient-managecreateworkspacepermission'></a>
Updates create workspace permissions on a workspace.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `manageCreateWorkspacePermissionDetails` (model.ManageCreateWorkspacePermissionDetails) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `ManageCreateWorkspacePermissionResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)

### `manageWorkspacePermission`
<a id='workspaceclient-manageworkspacepermission'></a>
Updates permissions on a workspace.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `manageWorkspacePermissionDetails` (model.ManageWorkspacePermissionDetails) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `ManageWorkspacePermissionResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)

### `updateWorkspace`
<a id='workspaceclient-updateworkspace'></a>
Updates the details of a workspace.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `updateWorkspaceDetails` (model.UpdateWorkspaceDetails) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `UpdateWorkspaceResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.Workspace

**Response Fields:**
- `key` (str) — **[Required]** key of this Workspace. The key of the AI Data Platform Workbench workspace. The key of this Workspace. str
- `display_name` (str) — **[Required]** display_name of this Workspace. A user-friendly name that has to be unique in a AI Data Platform Workbench instance. The display_name of this Workspace. str
- `description` (str) — description of this Workspace. Description of the workspace. The description of this Workspace. str
- `type` (str) — type of this Workspace. Workspace type. Type is DEFAULT for workspace created at AI Data Platform Workbench creation, type is USER for workspace created by AI Data Platform Workbench user. Allowed values for this property are: "DEFAULT", "USER", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The type of this Workspace. str
- `time_created` (datetime) — **[Required]** time_created of this Workspace. The date and time the AI Data Platform Workbench workspace was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2016-08-25T21:10:29.600Z The time_created of this Workspace. datetime
- `time_updated` (datetime) — time_updated of this Workspace. The date and time the AI Data Platform Workbench workspace was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2016-08-25T21:10:29.600Z The time_updated of this Workspace. datetime
- `lifecycle_state` (str) — **[Required]** lifecycle_state of this Workspace. The current state of the AI Data Platform Workbench workspace. Allowed values for this property are: "CREATING", "UPDATING", "ACTIVE", "DELETING", "DELETED", "FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The lifecycle_state of this Workspace. str
- `lifecycle_details` (str) — lifecycle_details of this Workspace. A message that describes the current state of the workspace in more detail. For example, can be used to provide actionable information for a resource in the Failed state. The lifecycle_details of this Workspace. str
- `system_tags` (dict(str, dict(str, object))) — system_tags of this Workspace. System tags for this resource. Each key is predefined and scoped to a namespace. Example: {"orcl-cloud": {"free-tier-retained": "true"}} The system_tags of this Workspace. dict(str, dict(str, object))
- `created_by` (str) — created_by of this Workspace. OCID of the user who created this record. The created_by of this Workspace. str
- `created_by_name` (str) — created_by_name of this Workspace. Name of the user who created this record. The created_by_name of this Workspace. str
- `updated_by` (str) — updated_by of this Workspace. OCID of the user who updated this record. The updated_by of this Workspace. str
- `updated_by_name` (str) — updated_by_name of this Workspace. Name of the user who updated this record. The updated_by_name of this Workspace. str
- `default_catalog_key` (str) — default_catalog_key of this Workspace. The key of the catalog to be used as the default catalog for this workspace. A default catalog in the workspace will allow users to use that catalog without the need to refer it in the notebook. For example, if default catalog is iCat1, and it has schema1 and table1, you can refer to the table in a notebook using: schema1.table1. The default_catalog_key of this Workspace. str
- `is_private_network_enabled` (bool) — is_private_network_enabled of this Workspace. A flag to display whether workspace is private network enabled or not. The is_private_network_enabled of this Workspace. bool
- `network_configuration_details` (WorkspaceNetworkConfigurationDetails) — network_configuration_details of this Workspace. The network_configuration_details of this Workspace. oci.aidataplatform_dp.models.WorkspaceNetworkConfigurationDetails
- `log_group_id` (str) — log_group_id of this Workspace. The OCID of the log group that contains the logs. This uniquely identifies a collection of logs within OCI Logging Service. The log_group_id of this Workspace. str
- `aic_user_schema_name` (str) — aic_user_schema_name of this Workspace. The name of the AIC user schema if created. The aic_user_schema_name of this Workspace. str

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)

### `updateWorkspaceAsyncOperationStatus`
<a id='workspaceclient-updateworkspaceasyncoperationstatus'></a>
**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `asyncOperationKey` (string) — The unique identifier of an async operation
- `updateWorkspaceAsyncOperationStatusDetails` (model.UpdateWorkspaceAsyncOperationStatusDetails) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `UpdateWorkspaceAsyncOperationStatusResponse` — See response fields for payload details.

**Response Fields:** None

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)

## Workspace Object (`WorkspaceObjectClient`)
<a id='workspaceobjectclient-client'></a>
**Operations:**
- [`copyWorkspaceObject`](#workspaceobjectclient-copyworkspaceobject)
- [`createWorkspaceObject`](#workspaceobjectclient-createworkspaceobject)
- [`deleteWorkspaceObject`](#workspaceobjectclient-deleteworkspaceobject)
- [`downloadWorkspaceObjectWithPar`](#workspaceobjectclient-downloadworkspaceobjectwithpar)
- [`getWorkspaceObject`](#workspaceobjectclient-getworkspaceobject)
- [`headWorkspaceObject`](#workspaceobjectclient-headworkspaceobject)
- [`listWorkspaceObjectPermissions`](#workspaceobjectclient-listworkspaceobjectpermissions)
- [`listWorkspaceObjects`](#workspaceobjectclient-listworkspaceobjects)
- [`manageWorkspaceObjectPermission`](#workspaceobjectclient-manageworkspaceobjectpermission)
- [`moveWorkspaceObject`](#workspaceobjectclient-moveworkspaceobject)
- [`renameWorkspaceObject`](#workspaceobjectclient-renameworkspaceobject)
- [`updateWorkspaceObject`](#workspaceobjectclient-updateworkspaceobject)
- [`uploadWorkspaceObjectWithPar`](#workspaceobjectclient-uploadworkspaceobjectwithpar)

### `copyWorkspaceObject`
<a id='workspaceobjectclient-copyworkspaceobject'></a>
Copy a workspace object to different location.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `copyWorkspaceObjectDetails` (model.CopyWorkspaceObjectDetails) — Details for copying the workspace object to a different path.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `CopyWorkspaceObjectResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.WorkspaceObjectDetails

**Response Fields:**
- `path` (str) — **[Required]** path of this WorkspaceObjectDetails. The fully qualified path of the workspace object. Example: /Shared/Folder1/Notebook1.ipynb The path of this WorkspaceObjectDetails. str
- `key` (str) — key of this WorkspaceObjectDetails. The key of the Workspace Object. The key of this WorkspaceObjectDetails. str
- `display_name` (str) — **[Required]** display_name of this WorkspaceObjectDetails. The name of the Workspace Object. This will be the name of the file/folder in the workspace. Example: Notebook1.ipynb, Folder1 The display_name of this WorkspaceObjectDetails. str
- `time_created` (datetime) — **[Required]** time_created of this WorkspaceObjectDetails. The date and time the workspace object was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2016-08-25T21:10:29.600Z The time_created of this WorkspaceObjectDetails. datetime
- `time_updated` (datetime) — time_updated of this WorkspaceObjectDetails. The date and time the workspace object was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2016-08-25T21:10:29.600Z The time_updated of this WorkspaceObjectDetails. datetime
- `type` (str) — **[Required]** type of this WorkspaceObjectDetails. The type of the workspace object. Allowed values for this property are: "NOTEBOOK", "JOB", "LAKE_FLOW", "AGENT_LAKE_FLOW", "GENERATED_ARTIFACT", "LIBRARY", "FILE", "FOLDER", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The type of this WorkspaceObjectDetails. str
- `description` (str) — description of this WorkspaceObjectDetails. The description for the file and folder. The description of this WorkspaceObjectDetails. str
- `system_tags` (dict(str, dict(str, object))) — system_tags of this WorkspaceObjectDetails. System tags for this resource. Each key is predefined and scoped to a namespace. Example: {"orcl-cloud": {"free-tier-retained": "true"}} The system_tags of this WorkspaceObjectDetails. dict(str, dict(str, object))

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)

### `createWorkspaceObject`
<a id='workspaceobjectclient-createworkspaceobject'></a>
Creates a workspace object. You can create a file or folder in the workspace.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `createWorkspaceObjectDetails` (Uint8Array | Buffer | Blob | stream.Readable | ReadableStream | string) — Details for the new workspace object.
- `path` (string) — The absolute path of the file or folder

**Optional Parameters:**
- `type` (string) — The type of workspace object.
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.
- `isUploadFileBase64Encoded` (boolean) — A flag to identify if the upload file is base64 encoded
- `isOverwrite` (boolean) — A boolean which decides if overwrite is allowed
- `objectDescription` (string) — The description of the workspace object

**Return Response:** `CreateWorkspaceObjectResponse` — A :class:~oci.response.Response object with data of type stream

**Response Fields:** None

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)

### `deleteWorkspaceObject`
<a id='workspaceobjectclient-deleteworkspaceobject'></a>
Deletes a workspace object.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `objectPath` (string) — The fully qualified path of the workspace object.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `DeleteWorkspaceObjectResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)

### `downloadWorkspaceObjectWithPar`
<a id='workspaceobjectclient-downloadworkspaceobjectwithpar'></a>
Downloads a workspace file by providing the PAR info for downloading the file for given path.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `path` (string) — The absolute path of the file or folder

**Optional Parameters:**
- `shouldGenerateNewPar` (boolean) — Flag to toggle to generate short living par
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `type` (string) — The type of workspace object.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `DownloadWorkspaceObjectWithParResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.DownloadFileWithParResult

**Response Fields:**
- `par_url` (str) — par_url of this DownloadFileWithParResult. String representing the PAR URL. The par_url of this DownloadFileWithParResult. str
- `e_tag` (str) — **[Required]** e_tag of this DownloadFileWithParResult. Etag after creating or closing a file. The e_tag of this DownloadFileWithParResult. str
- `location_uri` (str) — **[Required]** location_uri of this DownloadFileWithParResult. The object storage URI which has bucket and namespace information. The location_uri of this DownloadFileWithParResult. str
- `size` (int) — **[Required]** size of this DownloadFileWithParResult. File size in bytes. The size of this DownloadFileWithParResult. int
- `created_by` (str) — created_by of this DownloadFileWithParResult. The user who created the file. The created_by of this DownloadFileWithParResult. str
- `updated_by` (str) — updated_by of this DownloadFileWithParResult. The user who last updated the file. The updated_by of this DownloadFileWithParResult. str
- `created_time` (str) — created_time of this DownloadFileWithParResult. The time at which the file was created. The created_time of this DownloadFileWithParResult. str
- `updated_time` (str) — updated_time of this DownloadFileWithParResult. The last modified time of the file. The updated_time of this DownloadFileWithParResult. str
- `description` (str) — description of this DownloadFileWithParResult. The file description. The description of this DownloadFileWithParResult. str
- `system_tags` (dict(str, dict(str, object))) — system_tags of this DownloadFileWithParResult. System tags for this resource. Each key is predefined and scoped to a namespace. Example: {"orcl-cloud": {"free-tier-retained": "true"}} The system_tags of this DownloadFileWithParResult. dict(str, dict(str, object))

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)

### `getWorkspaceObject`
<a id='workspaceobjectclient-getworkspaceobject'></a>
Returns detailed information about a workspace object.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `objectPath` (string) — The fully qualified path of the workspace object.

**Optional Parameters:**
- `shouldIncludeMetadata` (boolean) — Path to list all metadata for a file or folder.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `GetWorkspaceObjectResponse` — A :class:~oci.response.Response object with data of type stream

**Response Fields:** None

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)

### `headWorkspaceObject`
<a id='workspaceobjectclient-headworkspaceobject'></a>
Returns metadata about a workspace object. The contents of the file are not retrieved.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `objectPath` (string) — The fully qualified path of the workspace object.

**Optional Parameters:**
- `shouldIncludeMetadata` (boolean) — Path to list all metadata for a file or folder.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `HeadWorkspaceObjectResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)

### `listWorkspaceObjectPermissions`
<a id='workspaceobjectclient-listworkspaceobjectpermissions'></a>
Returns a list of workspace object permissions.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `objectKey` (string) — The key of the workspace object.

**Optional Parameters:**
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination](
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination](
- `sortOrder` (model.SortOrder) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (ListWorkspaceObjectPermissionsRequest.SortBy) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `ListWorkspaceObjectPermissionsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.WorkspaceObjectPermissionCollection

**Response Fields:**
- `items` (list[WorkspaceObjectPermissionSummary]) — **[Required]** items of this WorkspaceObjectPermissionCollection. List of workspace object permissions. The items of this WorkspaceObjectPermissionCollection. list[oci.aidataplatform_dp.models.WorkspaceObjectPermissionSummary]

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)

### `listWorkspaceObjects`
<a id='workspaceobjectclient-listworkspaceobjects'></a>
Returns a list of objects in the workspace.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `path` (string) — The absolute path of the file or folder

**Optional Parameters:**
- `type` (string) — Filter by object type. For example, NOTEBOOK, LIBRARY, or FILE.
- `displayName` (string) — A filter to return only resources that match the given display name exactly.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination](
- `metadataKeys` (string) — Comma separated keys to have in list response.
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination](
- `sortOrder` (model.SortOrder) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (ListWorkspaceObjectsRequest.SortBy) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `ListWorkspaceObjectsResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.WorkspaceObjectCollection

**Response Fields:**
- `items` (list[WorkspaceObjectSummary]) — **[Required]** items of this WorkspaceObjectCollection. List of workspace objects. The items of this WorkspaceObjectCollection. list[oci.aidataplatform_dp.models.WorkspaceObjectSummary]

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)

### `manageWorkspaceObjectPermission`
<a id='workspaceobjectclient-manageworkspaceobjectpermission'></a>
Updates permissions on a workspace object.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `objectKey` (string) — The key of the workspace object.
- `manageWorkspaceObjectPermissionDetails` (model.ManageWorkspaceObjectPermissionDetails) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `ManageWorkspaceObjectPermissionResponse` — A :class:~oci.response.Response object with data of type None

**Response Fields:** None

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)

### `moveWorkspaceObject`
<a id='workspaceobjectclient-moveworkspaceobject'></a>
Moves a workspace object to different location.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `moveWorkspaceObjectDetails` (model.MoveWorkspaceObjectDetails) — Details for moving the workspace object to a different path.

**Optional Parameters:**
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `MoveWorkspaceObjectResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.WorkspaceObjectDetails

**Response Fields:**
- `path` (str) — **[Required]** path of this WorkspaceObjectDetails. The fully qualified path of the workspace object. Example: /Shared/Folder1/Notebook1.ipynb The path of this WorkspaceObjectDetails. str
- `key` (str) — key of this WorkspaceObjectDetails. The key of the Workspace Object. The key of this WorkspaceObjectDetails. str
- `display_name` (str) — **[Required]** display_name of this WorkspaceObjectDetails. The name of the Workspace Object. This will be the name of the file/folder in the workspace. Example: Notebook1.ipynb, Folder1 The display_name of this WorkspaceObjectDetails. str
- `time_created` (datetime) — **[Required]** time_created of this WorkspaceObjectDetails. The date and time the workspace object was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2016-08-25T21:10:29.600Z The time_created of this WorkspaceObjectDetails. datetime
- `time_updated` (datetime) — time_updated of this WorkspaceObjectDetails. The date and time the workspace object was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2016-08-25T21:10:29.600Z The time_updated of this WorkspaceObjectDetails. datetime
- `type` (str) — **[Required]** type of this WorkspaceObjectDetails. The type of the workspace object. Allowed values for this property are: "NOTEBOOK", "JOB", "LAKE_FLOW", "AGENT_LAKE_FLOW", "GENERATED_ARTIFACT", "LIBRARY", "FILE", "FOLDER", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The type of this WorkspaceObjectDetails. str
- `description` (str) — description of this WorkspaceObjectDetails. The description for the file and folder. The description of this WorkspaceObjectDetails. str
- `system_tags` (dict(str, dict(str, object))) — system_tags of this WorkspaceObjectDetails. System tags for this resource. Each key is predefined and scoped to a namespace. Example: {"orcl-cloud": {"free-tier-retained": "true"}} The system_tags of this WorkspaceObjectDetails. dict(str, dict(str, object))

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)

### `renameWorkspaceObject`
<a id='workspaceobjectclient-renameworkspaceobject'></a>
Renames a workspace object.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `renameWorkspaceObjectDetails` (model.RenameWorkspaceObjectDetails) — Details for renaming the workspace object.

**Optional Parameters:**
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Return Response:** `RenameWorkspaceObjectResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.WorkspaceObjectDetails

**Response Fields:**
- `path` (str) — **[Required]** path of this WorkspaceObjectDetails. The fully qualified path of the workspace object. Example: /Shared/Folder1/Notebook1.ipynb The path of this WorkspaceObjectDetails. str
- `key` (str) — key of this WorkspaceObjectDetails. The key of the Workspace Object. The key of this WorkspaceObjectDetails. str
- `display_name` (str) — **[Required]** display_name of this WorkspaceObjectDetails. The name of the Workspace Object. This will be the name of the file/folder in the workspace. Example: Notebook1.ipynb, Folder1 The display_name of this WorkspaceObjectDetails. str
- `time_created` (datetime) — **[Required]** time_created of this WorkspaceObjectDetails. The date and time the workspace object was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2016-08-25T21:10:29.600Z The time_created of this WorkspaceObjectDetails. datetime
- `time_updated` (datetime) — time_updated of this WorkspaceObjectDetails. The date and time the workspace object was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: 2016-08-25T21:10:29.600Z The time_updated of this WorkspaceObjectDetails. datetime
- `type` (str) — **[Required]** type of this WorkspaceObjectDetails. The type of the workspace object. Allowed values for this property are: "NOTEBOOK", "JOB", "LAKE_FLOW", "AGENT_LAKE_FLOW", "GENERATED_ARTIFACT", "LIBRARY", "FILE", "FOLDER", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'. The type of this WorkspaceObjectDetails. str
- `description` (str) — description of this WorkspaceObjectDetails. The description for the file and folder. The description of this WorkspaceObjectDetails. str
- `system_tags` (dict(str, dict(str, object))) — system_tags of this WorkspaceObjectDetails. System tags for this resource. Each key is predefined and scoped to a namespace. Example: {"orcl-cloud": {"free-tier-retained": "true"}} The system_tags of this WorkspaceObjectDetails. dict(str, dict(str, object))

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)

### `updateWorkspaceObject`
<a id='workspaceobjectclient-updateworkspaceobject'></a>
Updates a workspace object with the provided information.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `objectPath` (string) — The fully qualified path of the workspace object.
- `updateWorkspaceObjectDetails` (Uint8Array | Buffer | Blob | stream.Readable | ReadableStream | string) — The information to be updated.

**Optional Parameters:**
- `objectDescription` (string) — The description of the workspace object
- `ifMatch` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.

**Return Response:** `UpdateWorkspaceObjectResponse` — A :class:~oci.response.Response object with data of type stream

**Response Fields:** None

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)

### `uploadWorkspaceObjectWithPar`
<a id='workspaceobjectclient-uploadworkspaceobjectwithpar'></a>
Creates a workspace file by generating PAR or updates the metadata by close file. If file exists, then it will be updated.

**Required Parameters:**
- `aiDataPlatformId` (string) — The [OCID]( of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (string) — The key of the Workspace
- `uploadFileWithParDetails` (model.UploadFileWithParDetails) — Contents of the file to upload.
- `path` (string) — The absolute path of the file or folder

**Optional Parameters:**
- `isOverwrite` (boolean) — A boolean which decides if overwrite is allowed
- `shouldGenerateNewPar` (boolean) — Flag to toggle to generate short living par
- `shouldUpdateRecent` (boolean) — A flag to identify if the recent list should be updated.
- `opcRetryToken` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `type` (string) — The type of workspace object.
- `objectDescription` (string) — The description of the workspace object

**Return Response:** `UploadWorkspaceObjectWithParResponse` — A :class:~oci.response.Response object with data of type :class:~oci.aidataplatform_dp.models.UploadFileWithParResult

**Response Fields:**
- `par_url` (str) — par_url of this UploadFileWithParResult. String representing the PAR URL. The par_url of this UploadFileWithParResult. str
- `e_tag` (str) — **[Required]** e_tag of this UploadFileWithParResult. Etag after creating or closing a file. The e_tag of this UploadFileWithParResult. str
- `location_uri` (str) — **[Required]** location_uri of this UploadFileWithParResult. The object storage URI which has bucket and namespace information. The location_uri of this UploadFileWithParResult. str
- `size` (int) — size of this UploadFileWithParResult. File size in bytes. The size of this UploadFileWithParResult. int
- `created_by` (str) — created_by of this UploadFileWithParResult. The user who created the file. The created_by of this UploadFileWithParResult. str
- `updated_by` (str) — updated_by of this UploadFileWithParResult. The user who last updated the file. The updated_by of this UploadFileWithParResult. str
- `created_time` (str) — created_time of this UploadFileWithParResult. The time at which the file was created. The created_time of this UploadFileWithParResult. str
- `updated_time` (str) — updated_time of this UploadFileWithParResult. The last modified time of the file. The updated_time of this UploadFileWithParResult. str
- `description` (str) — description of this UploadFileWithParResult. The file description. The description of this UploadFileWithParResult. str
- `system_tags` (dict(str, dict(str, object))) — system_tags of this UploadFileWithParResult. System tags for this resource. Each key is predefined and scoped to a namespace. Example: {"orcl-cloud": {"free-tier-retained": "true"}} The system_tags of this UploadFileWithParResult. dict(str, dict(str, object))

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)
