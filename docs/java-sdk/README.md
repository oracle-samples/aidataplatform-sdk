<a id="top"></a>
# AIDP Java SDK Operations Reference
This document summarizes the available service clients in the AIDP Java SDK and details every operation's request parameters and responses.

## Security guidance

Treat `parUrl` values and signed URLs returned by an operation as bearer access
material. Do not log, commit, paste into tickets, or include them in support
bundles; redact them before sharing output. Keep OCI configuration, private
keys, session-token files, and credential-bearing request bodies out of source
control and logs. Use short-lived, workload-scoped identities and
least-privilege policies where available.

## Clients
- [Agent (`AgentClient`)](#agentclient-client)
- [Async Operations (`AsyncOperationsClient`)](#asyncoperationsclient-client)
- [Audit (`AuditClient`)](#auditclient-client)
- [Bundle (`BundleClient`)](#bundleclient-client)
- [Catalog (`CatalogClient`)](#catalogclient-client)
- [Cluster (`ClusterClient`)](#clusterclient-client)
- [Credentials (`CredentialsClient`)](#credentialsclient-client)
- [Data Lineage (`DataLineageClient`)](#datalineageclient-client)
- [Delta Share (`DeltaShareClient`)](#deltashareclient-client)
- [Git (`GitClient`)](#gitclient-client)
- [ML Ops (`MLOpsClient`)](#mlopsclient-client)
- [Notebook (`NotebookClient`)](#notebookclient-client)
- [Role (`RoleClient`)](#roleclient-client)
- [Schema (`SchemaClient`)](#schemaclient-client)
- [User Setting (`UserSettingClient`)](#usersettingclient-client)
- [Volume (`VolumeClient`)](#volumeclient-client)
- [Workflow (`WorkflowClient`)](#workflowclient-client)
- [Workspace (`WorkspaceClient`)](#workspaceclient-client)
- [Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client)

## <a id="agentclient-client"></a>Agent (`AgentClient`)
**Operations:**
- [`copyAgent`](#agentclient-copyagent)
- [`createAgent`](#agentclient-createagent)
- [`deleteAgent`](#agentclient-deleteagent)
- [`deleteAgentDeployment`](#agentclient-deleteagentdeployment)
- [`deleteAgentSession`](#agentclient-deleteagentsession)
- [`deployAgent`](#agentclient-deployagent)
- [`getAgent`](#agentclient-getagent)
- [`getAgentDeployment`](#agentclient-getagentdeployment)
- [`getAgentSession`](#agentclient-getagentsession)
- [`getAgentSessionTrace`](#agentclient-getagentsessiontrace)
- [`listAgentDeployments`](#agentclient-listagentdeployments)
- [`listAgentPermissions`](#agentclient-listagentpermissions)
- [`listAgentSessionChatHistories`](#agentclient-listagentsessionchathistories)
- [`listAgentSessions`](#agentclient-listagentsessions)
- [`listAgents`](#agentclient-listagents)
- [`manageAgentPermission`](#agentclient-manageagentpermission)
- [`previewAgentAgentCard`](#agentclient-previewagentagentcard)
- [`redeployAgentByKey`](#agentclient-redeployagentbykey)
- [`updateAgent`](#agentclient-updateagent)
- [`updateAgentDeploymentMetadata`](#agentclient-updateagentdeploymentmetadata)
- [`validateAgent`](#agentclient-validateagent)

### <a id="agentclient-copyagent"></a>`copyAgent`
Copies an agent.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `agentKey` (`String`) — The UUID of the agent.
- `copyAgentDetails` (`com.oracle.aidataplatform.dp.model.CopyAgentDetails`) — Details for copying the agent.

**Optional Parameters:**
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `copyAgentResponse`

**Response Fields:**
- `location` (`String`) — URL for the created agent. The agent key is generated after this request is sent.
- `contentLocation` (`String`) — Same as location.
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `agent` (`com.oracle.aidataplatform.dp.model.Agent`) — The returned {@code Agent} instance.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-createagent"></a>`createAgent`
Creates an agent.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `createAgentDetails` (`com.oracle.aidataplatform.dp.model.CreateAgentDetails`) — Details for the new agent.

**Optional Parameters:**
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createAgentResponse`

**Response Fields:**
- `location` (`String`) — URL for the created agent. The agent key is generated after this request is sent.
- `contentLocation` (`String`) — Same as location.
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `agent` (`com.oracle.aidataplatform.dp.model.Agent`) — The returned {@code Agent} instance.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-deleteagent"></a>`deleteAgent`
Delete an agent from the schema.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `agentKey` (`String`) — The UUID of the agent.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteAgentResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-deleteagentdeployment"></a>`deleteAgentDeployment`
Deletes an agent deployment.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `agentKey` (`String`) — The UUID of the agent.
- `agentDeploymentKey` (`String`) — The UUID of the agent deployment.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteAgentDeploymentResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-deleteagentsession"></a>`deleteAgentSession`
Deletes an agent Session.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `agentKey` (`String`) — The UUID of the agent.
- `sessionId` (`String`) — The UUID of the agent session.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteAgentSessionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-deployagent"></a>`deployAgent`
Deploys a specified agent.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `agentKey` (`String`) — The UUID of the agent.
- `deployAgentDetails` (`com.oracle.aidataplatform.dp.model.DeployAgentDetails`) — Details of a deployable agent.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deployAgentResponse`

**Response Fields:**
- `location` (`String`) — URI for the created Agent deployment.
- `contentLocation` (`String`) — Same as location.
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `agentDeployment` (`com.oracle.aidataplatform.dp.model.AgentDeployment`) — The returned {@code AgentDeployment} instance.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-getagent"></a>`getAgent`
Returns detailed information about an agent.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `agentKey` (`String`) — The UUID of the agent.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getAgentResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `agent` (`com.oracle.aidataplatform.dp.model.Agent`) — The returned {@code Agent} instance.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-getagentdeployment"></a>`getAgentDeployment`
Returns detailed information about an agent deployment.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `agentKey` (`String`) — The UUID of the agent.
- `agentDeploymentKey` (`String`) — The UUID of the agent deployment.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getAgentDeploymentResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `agentDeployment` (`com.oracle.aidataplatform.dp.model.AgentDeployment`) — The returned {@code AgentDeployment} instance.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-getagentsession"></a>`getAgentSession`
Returns detailed information about an agent session.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `agentKey` (`String`) — The UUID of the agent.
- `sessionId` (`String`) — The UUID of the agent session.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getAgentSessionResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `agentSession` (`com.oracle.aidataplatform.dp.model.AgentSession`) — The returned {@code AgentSession} instance.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-getagentsessiontrace"></a>`getAgentSessionTrace`
Returns trace details for a given message key.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `agentKey` (`String`) — The UUID of the agent.
- `sessionId` (`String`) — The UUID of the agent session.
- `traceKey` (`String`) — A filter to return only resources that match the given display trace key exactly.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getAgentSessionTraceResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `traceDetails` (`com.oracle.aidataplatform.dp.model.TraceDetails`) — The returned {@code TraceDetails} instance.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-listagentdeployments"></a>`listAgentDeployments`
Returns a list of all deployments of an agent.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `agentKey` (`String`) — The UUID of the agent.

**Optional Parameters:**
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `displayName` (`String`) — A filter to return only resources that match the given display name exactly.
- `displayNameContains` (`String`) — A filter to return only resources that have a display name containing the text provided.
- `lifecycleState` (`java.util.List<com.oracle.aidataplatform.dp.model.DeploymentLifecycleState>`) — A filter to return only resources whose value matches the given lifecycleState.
- `timeCreatedGreaterThanOrEqualTo` (`java.util.Date`) — Fetch objects from repository that were created after or at the exact timestamp provided in parameter
- `timeCreatedLessThanOrEqualTo` (`java.util.Date`) — Fetch objects from repository that were created before or at the exact timestamp provided in parameter.
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `computeKey` (`java.util.List<String>`) — Compute key.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listAgentDeploymentsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `agentDeploymentCollection` (`com.oracle.aidataplatform.dp.model.AgentDeploymentCollection`) — The returned {@code AgentDeploymentCollection} instance.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-listagentpermissions"></a>`listAgentPermissions`
Returns a list of permissions for a given agent.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `agentKey` (`String`) — The UUID of the agent.

**Optional Parameters:**
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listAgentPermissionsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `agentPermissionCollection` (`com.oracle.aidataplatform.dp.model.AgentPermissionCollection`) — The returned {@code AgentPermissionCollection} instance.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-listagentsessionchathistories"></a>`listAgentSessionChatHistories`
Returns list of agent session chat messages.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `agentKey` (`String`) — The UUID of the agent.
- `sessionId` (`String`) — The UUID of the agent session.

**Optional Parameters:**
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listAgentSessionChatHistoriesResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `sessionChatHistoryCollection` (`com.oracle.aidataplatform.dp.model.SessionChatHistoryCollection`) — The returned {@code SessionChatHistoryCollection} instance.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-listagentsessions"></a>`listAgentSessions`
Returns a list of testing sessions of an agent.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `agentKey` (`String`) — The UUID of the agent.

**Optional Parameters:**
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `displayNameContains` (`String`) — A filter to return only resources that have a display name containing the text provided.
- `timeCreatedGreaterThanOrEqualTo` (`java.util.Date`) — Fetch objects from repository that were created after or at the exact timestamp provided in parameter
- `timeCreatedLessThanOrEqualTo` (`java.util.Date`) — Fetch objects from repository that were created before or at the exact timestamp provided in parameter.
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listAgentSessionsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcPrevPage` (`String`) — For list pagination. When this header appears in the response, previous pages of results remain.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `agentSessionCollection` (`com.oracle.aidataplatform.dp.model.AgentSessionCollection`) — The returned {@code AgentSessionCollection} instance.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-listagents"></a>`listAgents`
Returns a list of agents in a schema.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace

**Optional Parameters:**
- `computeKey` (`String`) — Compute key.
- `displayName` (`String`) — A filter to return only resources that match the given display name exactly.
- `displayNameContains` (`String`) — A filter to return only resources that have a display name containing the text provided.
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listAgentsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `agentCollection` (`com.oracle.aidataplatform.dp.model.AgentCollection`) — The returned {@code AgentCollection} instance.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-manageagentpermission"></a>`manageAgentPermission`
Update the permissions for a given agent.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `agentKey` (`String`) — The UUID of the agent.
- `manageAgentPermissionDetails` (`com.oracle.aidataplatform.dp.model.ManageAgentPermissionDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageAgentPermissionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-previewagentagentcard"></a>`previewAgentAgentCard`
Returns the agent card based on the given agent card configuration.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `previewAgentCardDetails` (`com.oracle.aidataplatform.dp.model.PreviewAgentCardDetails`) — Request details for previewing an agent card.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `previewAgentAgentCardResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `agentCardPreviewResponse` (`com.oracle.aidataplatform.dp.model.AgentCardPreviewResponse`) — The returned {@code AgentCardPreviewResponse} instance.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-redeployagentbykey"></a>`redeployAgentByKey`
Redeploys an agent.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `agentKey` (`String`) — The UUID of the agent.
- `updateAgentDeploymentDetails` (`com.oracle.aidataplatform.dp.model.UpdateAgentDeploymentDetails`) — Details for updating an agent deployment asynchronously.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `redeployAgentByKeyResponse`

**Response Fields:**
- `location` (`String`) — URI for the newly created agent deployment.
- `contentLocation` (`String`) — Same as location.
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `agentDeployment` (`com.oracle.aidataplatform.dp.model.AgentDeployment`) — The returned {@code AgentDeployment} instance.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-updateagent"></a>`updateAgent`
Updates an agent with provided details.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `agentKey` (`String`) — The UUID of the agent.
- `updateAgentDetails` (`com.oracle.aidataplatform.dp.model.UpdateAgentDetails`) — The information to be updated.

**Optional Parameters:**
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateAgentResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `agent` (`com.oracle.aidataplatform.dp.model.Agent`) — The returned {@code Agent} instance.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-updateagentdeploymentmetadata"></a>`updateAgentDeploymentMetadata`
Updates the deployment metadata for an agent.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `agentKey` (`String`) — The UUID of the agent.
- `updateAgentDeploymentMetadataDetails` (`com.oracle.aidataplatform.dp.model.UpdateAgentDeploymentMetadataDetails`) — Agent card details to update.

**Optional Parameters:**
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateAgentDeploymentMetadataResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `agentDeployment` (`com.oracle.aidataplatform.dp.model.AgentDeployment`) — The returned {@code AgentDeployment} instance.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-validateagent"></a>`validateAgent`
Validates the agent JSON diagram generated by UI.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `agentKey` (`String`) — The UUID of the agent.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `validateAgentResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `validateAgentResponse` (`com.oracle.aidataplatform.dp.model.ValidateAgentResponse`) — The returned {@code ValidateAgentResponse} instance.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


## <a id="asyncoperationsclient-client"></a>Async Operations (`AsyncOperationsClient`)
**Operations:**
- [`cancelAsyncOperation`](#asyncoperationsclient-cancelasyncoperation)
- [`getAsyncOperation`](#asyncoperationsclient-getasyncoperation)
- [`listAsyncOperations`](#asyncoperationsclient-listasyncoperations)

### <a id="asyncoperationsclient-cancelasyncoperation"></a>`cancelAsyncOperation`
Cancels a supported asynchronous operation created by the caller. Support depends on the operation type and its current state.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `asyncOperationKey` (`String`) — The unique identifier of an async operation

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `cancelAsyncOperationResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `asyncOperation` (`com.oracle.aidataplatform.dp.model.AsyncOperation`) — The returned {@code AsyncOperation} instance.

**Return:** [Back to Async Operations (`AsyncOperationsClient`)](#asyncoperationsclient-client) • [Top](#top)


### <a id="asyncoperationsclient-getasyncoperation"></a>`getAsyncOperation`
Get detailed information for a particular async operation

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `asyncOperationKey` (`String`) — The unique identifier of an async operation

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getAsyncOperationResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `asyncOperation` (`com.oracle.aidataplatform.dp.model.AsyncOperation`) — The returned {@code AsyncOperation} instance.

**Return:** [Back to Async Operations (`AsyncOperationsClient`)](#asyncoperationsclient-client) • [Top](#top)


### <a id="asyncoperationsclient-listasyncoperations"></a>`listAsyncOperations`
List all async operations for a resource type. Filters can be used to narrow the search down.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `resourceType` (`String`) — Required parameter which decides async operation resource type
- `resourceName` (`String`) — A filter to return only resources that match the given resource name exactly.
- `matchResourceName` (`Boolean`) — Parameter which decides to list async operations with prefix or exact match to resourceName
- `status` (`String`) — Option parameter to filter operation on status
- `shouldFilterByCallingPrincipal` (`Boolean`) — A filter to return only resources that match the current principal.
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for {@code timeStarted} is descending.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listAsyncOperationsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `asyncOperationCollection` (`com.oracle.aidataplatform.dp.model.AsyncOperationCollection`) — The returned {@code AsyncOperationCollection} instance.

**Return:** [Back to Async Operations (`AsyncOperationsClient`)](#asyncoperationsclient-client) • [Top](#top)


## <a id="auditclient-client"></a>Audit (`AuditClient`)
**Operations:**
- [`manageAuditLogs`](#auditclient-manageauditlogs)
- [`searchAuditLogs`](#auditclient-searchauditlogs)

### <a id="auditclient-manageauditlogs"></a>`manageAuditLogs`
Manages audit logs.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `manageAuditLogsDetails` (`com.oracle.aidataplatform.dp.model.ManageAuditLogsDetails`) — Details to update in an audit log.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageAuditLogsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Audit (`AuditClient`)](#auditclient-client) • [Top](#top)


### <a id="auditclient-searchauditlogs"></a>`searchAuditLogs`
Searches audit logs.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `searchAuditLogsDetails` (`com.oracle.aidataplatform.dp.model.SearchAuditLogsDetails`) — Details for the audit log search.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `searchAuditLogsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `auditLogSearchResultCollection` (`com.oracle.aidataplatform.dp.model.AuditLogSearchResultCollection`) — The returned {@code AuditLogSearchResultCollection} instance.

**Return:** [Back to Audit (`AuditClient`)](#auditclient-client) • [Top](#top)


## <a id="bundleclient-client"></a>Bundle (`BundleClient`)
**Operations:**
- [`createBundle`](#bundleclient-createbundle)
- [`createBundleAction`](#bundleclient-createbundleaction)
- [`deployBundle`](#bundleclient-deploybundle)
- [`deployBundleAction`](#bundleclient-deploybundleaction)
- [`fetchBundleDeploymentStatus`](#bundleclient-fetchbundledeploymentstatus)
- [`fetchBundleDeploymentStatusAction`](#bundleclient-fetchbundledeploymentstatusaction)
- [`fetchBundlePublishStatusAction`](#bundleclient-fetchbundlepublishstatusaction)
- [`publishBundleAction`](#bundleclient-publishbundleaction)
- [`purgeBundle`](#bundleclient-purgebundle)
- [`purgeBundleAction`](#bundleclient-purgebundleaction)
- [`syncBundle`](#bundleclient-syncbundle)
- [`syncBundleAction`](#bundleclient-syncbundleaction)

### <a id="bundleclient-createbundle"></a>`createBundle`
(Deprecated)

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `createBundleDetails` (`com.oracle.aidataplatform.dp.model.CreateBundleDetails`) — Request payload for bundle creation.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createBundleResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.

**Return:** [Back to Bundle (`BundleClient`)](#bundleclient-client) • [Top](#top)


### <a id="bundleclient-createbundleaction"></a>`createBundleAction`
(Preview) Creates a new bundle. This operation is asynchronous. The service validates the request, starts bundle creation, and returns an async operation key in the response headers. Use the async operation APIs to track completion. Typical use cases: - capture selected workspace resources into a version-controlled bundle - prepare a bundle for later deployment or promotion - establish a bundle root that can later be inspected, updated, or deployed Request notes: - `path` identifies the parent folder in the workspace volume where the bundle should be created - `name` identifies the bundle folder name - `bundledResources` identifies which workspace resources should be included

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `createBundleDetails` (`com.oracle.aidataplatform.dp.model.CreateBundleDetails`) — Request payload for bundle creation.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createBundleActionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.

**Return:** [Back to Bundle (`BundleClient`)](#bundleclient-client) • [Top](#top)


### <a id="bundleclient-deploybundle"></a>`deployBundle`
(Deprecated)

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `deployBundleDetails` (`com.oracle.aidataplatform.dp.model.DeployBundleDetails`) — Request payload for bundle deploy.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deployBundleResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.

**Return:** [Back to Bundle (`BundleClient`)](#bundleclient-client) • [Top](#top)


### <a id="bundleclient-deploybundleaction"></a>`deployBundleAction`
Deprecated compatibility API. Use `publish` for new callers.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `deployBundleDetails` (`com.oracle.aidataplatform.dp.model.DeployBundleDetails`) — Request payload for bundle deploy.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deployBundleActionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.

**Return:** [Back to Bundle (`BundleClient`)](#bundleclient-client) • [Top](#top)


### <a id="bundleclient-fetchbundledeploymentstatus"></a>`fetchBundleDeploymentStatus`
(Deprecated)

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `fetchBundleDeploymentStatusDetails` (`com.oracle.aidataplatform.dp.model.FetchBundleDeploymentStatusDetails`) — Request payload for FetchBundleDeploymentStatusDetails.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `fetchBundleDeploymentStatusResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `bundleDeploymentStatus` (`com.oracle.aidataplatform.dp.model.BundleDeploymentStatus`) — The returned {@code BundleDeploymentStatus} instance.

**Return:** [Back to Bundle (`BundleClient`)](#bundleclient-client) • [Top](#top)


### <a id="bundleclient-fetchbundledeploymentstatusaction"></a>`fetchBundleDeploymentStatusAction`
Deprecated compatibility API. Use `getBundlePublishStatus` for new callers.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `fetchBundleDeploymentStatusDetails` (`com.oracle.aidataplatform.dp.model.FetchBundleDeploymentStatusDetails`) — Request payload for FetchBundleDeploymentStatusDetails.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `fetchBundleDeploymentStatusActionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `bundleDeploymentStatus` (`com.oracle.aidataplatform.dp.model.BundleDeploymentStatus`) — The returned {@code BundleDeploymentStatus} instance.

**Return:** [Back to Bundle (`BundleClient`)](#bundleclient-client) • [Top](#top)


### <a id="bundleclient-fetchbundlepublishstatusaction"></a>`fetchBundlePublishStatusAction`
(Preview) Returns the latest publish summary.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `fetchBundlePublishStatusDetails` (`com.oracle.aidataplatform.dp.model.FetchBundlePublishStatusDetails`) — Publish status request.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `fetchBundlePublishStatusActionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `bundlePublishStatus` (`com.oracle.aidataplatform.dp.model.BundlePublishStatus`) — The returned {@code BundlePublishStatus} instance.

**Return:** [Back to Bundle (`BundleClient`)](#bundleclient-client) • [Top](#top)


### <a id="bundleclient-publishbundleaction"></a>`publishBundleAction`
(Preview) Publishes the specified bundle, creating or updating jobs and agent flows according to the bundle manifest. Returns an async job key for tracking publish progress. This operation is asynchronous. The request is accepted for background execution and returns an async operation key in the response headers. Publishing typically uses: - the bundle manifest at the bundle root - top-level resource descriptors in the bundle - dependency descriptors referenced by those top-level resources - default or override variable values when present Use this operation when you want to apply the bundle contents into the target workspace state. Request notes: - `path` identifies the bundle root folder in the workspace volume

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `publishBundleDetails` (`com.oracle.aidataplatform.dp.model.PublishBundleDetails`) — Request payload for bundle publish.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `publishBundleActionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.

**Return:** [Back to Bundle (`BundleClient`)](#bundleclient-client) • [Top](#top)


### <a id="bundleclient-purgebundle"></a>`purgeBundle`
(Deprecated)

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `purgeBundleDetails` (`com.oracle.aidataplatform.dp.model.PurgeBundleDetails`) — Request payload for bundle purge.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `purgeBundleResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.

**Return:** [Back to Bundle (`BundleClient`)](#bundleclient-client) • [Top](#top)


### <a id="bundleclient-purgebundleaction"></a>`purgeBundleAction`
(Preview) Tears down all resources deployed by the specified bundle in the workspace. This operation is intended to tear down resources that were created or managed through bundle deployment. It does not delete the bundle files themselves from the workspace volume. This operation is asynchronous. The service accepts the purge request, starts the background teardown workflow, and returns async operation headers. Typical use cases: - remove resources that were previously deployed from a bundle - clean up a workspace before re-deploying or retiring a bundle Request notes: - `path` identifies the bundle root folder in the workspace volume

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `purgeBundleDetails` (`com.oracle.aidataplatform.dp.model.PurgeBundleDetails`) — Request payload for bundle purge.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `purgeBundleActionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.

**Return:** [Back to Bundle (`BundleClient`)](#bundleclient-client) • [Top](#top)


### <a id="bundleclient-syncbundle"></a>`syncBundle`
(Deprecated)

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `syncBundleDetails` (`com.oracle.aidataplatform.dp.model.SyncBundleDetails`) — Request payload for bundle sync.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `syncBundleResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.

**Return:** [Back to Bundle (`BundleClient`)](#bundleclient-client) • [Top](#top)


### <a id="bundleclient-syncbundleaction"></a>`syncBundleAction`
(Preview) Synchronizes the code, descriptors, and mapping in the bundle by reconciling the contents with the resource origins. Returns an async job key for tracking sync progress. This operation is intended for cases where the bundle should be refreshed to reflect newer source changes while preserving the bundle structure and identity. This operation is asynchronous and returns async operation headers when accepted. Typical use cases: - refresh bundle contents after upstream workspace resources have changed - reconcile descriptor or artifact content with current resource origins - preserve local bundle overrides while pulling in source resource updates - keep a bundle current before promoting it Request notes: - `path` identifies the bundle root folder in the workspace volume - the bundle must contain a valid `aidp_workbench.yaml` - the bundle must contain `.aidp/resource_origins.yaml` - origin metadata must refer to the same AIDP/Data Lake and workspace as the request

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `syncBundleDetails` (`com.oracle.aidataplatform.dp.model.SyncBundleDetails`) — Request payload for bundle sync.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `syncBundleActionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.

**Return:** [Back to Bundle (`BundleClient`)](#bundleclient-client) • [Top](#top)


## <a id="catalogclient-client"></a>Catalog (`CatalogClient`)
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

### <a id="catalogclient-catalogtestconnection"></a>`catalogTestConnection`
Tests the connection to an external catalog.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `catalogTestConnectionDetails` (`com.oracle.aidataplatform.dp.model.CatalogTestConnectionDetails`) — Details for the AI Data Platform catalog to be tested for connection.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `catalogTestConnectionResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Catalog (`CatalogClient`)](#catalogclient-client) • [Top](#top)


### <a id="catalogclient-createcatalog"></a>`createCatalog`
Creates a catalog with the given ID.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `createCatalogDetails` (`com.oracle.aidataplatform.dp.model.CreateCatalogDetails`) — Details for the new AI Data Platform catalog.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createCatalogResponse`

**Response Fields:**
- `location` (`String`) — URL for the created catalog. The AI Data Platform catalog key is generated after this request is sent.
- `contentLocation` (`String`) — Same as location.
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Catalog (`CatalogClient`)](#catalogclient-client) • [Top](#top)


### <a id="catalogclient-deletecatalog"></a>`deleteCatalog`
Deletes the specified catalog.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `catalogKey` (`String`) — The key of the catalog.

**Optional Parameters:**
- `isForced` (`Boolean`) — A boolean which decides if an entity should be deleted with Cascade effect
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteCatalogResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Catalog (`CatalogClient`)](#catalogclient-client) • [Top](#top)


### <a id="catalogclient-getcatalog"></a>`getCatalog`
Gets detailed information about a catalog with a given catalog key.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `catalogKey` (`String`) — The key of the catalog.

**Optional Parameters:**
- `isCatalogGuid` (`Boolean`) — A boolean which decides if catalogKey path parameter is catalog GUID (UUID) or name.
- `shouldSkipOcidTranslation` (`Boolean`) — When true, skip user OCID translation and return raw OCIDs.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getCatalogResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `catalog` (`com.oracle.aidataplatform.dp.model.Catalog`) — The returned {@code Catalog} instance.

**Return:** [Back to Catalog (`CatalogClient`)](#catalogclient-client) • [Top](#top)


### <a id="catalogclient-listcatalogpermissions"></a>`listCatalogPermissions`
Gets a list of all permissions in the specified catalog.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `catalogKey` (`String`) — The key of the catalog.

**Optional Parameters:**
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listCatalogPermissionsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `catalogPermissionCollection` (`com.oracle.aidataplatform.dp.model.CatalogPermissionCollection`) — The returned {@code CatalogPermissionCollection} instance.

**Return:** [Back to Catalog (`CatalogClient`)](#catalogclient-client) • [Top](#top)


### <a id="catalogclient-listcatalogs"></a>`listCatalogs`
Gets a list of catalogs with a given ID.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `displayName` (`String`) — A filter to return only resources that match the given display name exactly.
- `catalogState` (`CatalogState`) — The state of the catalog.
- `catalogType` (`CatalogType`) — The type of the catalog.
- `shouldSkipOcidTranslation` (`Boolean`) — When true, skip user OCID translation and return raw OCIDs.
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listCatalogsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `catalogCollection` (`com.oracle.aidataplatform.dp.model.CatalogCollection`) — The returned {@code CatalogCollection} instance.

**Return:** [Back to Catalog (`CatalogClient`)](#catalogclient-client) • [Top](#top)


### <a id="catalogclient-managecatalogpermission"></a>`manageCatalogPermission`
Updates permission details for a catalog.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `catalogKey` (`String`) — The key of the catalog.
- `manageCatalogPermissionDetails` (`com.oracle.aidataplatform.dp.model.ManageCatalogPermissionDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageCatalogPermissionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Catalog (`CatalogClient`)](#catalogclient-client) • [Top](#top)


### <a id="catalogclient-refreshcatalog"></a>`refreshCatalog`
Refreshes a catalog through a crawler.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `catalogKey` (`String`) — The key of the catalog.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `refreshCatalogResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.

**Return:** [Back to Catalog (`CatalogClient`)](#catalogclient-client) • [Top](#top)


### <a id="catalogclient-updatecatalog"></a>`updateCatalog`
Updates the details of a catalog with the given information.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `catalogKey` (`String`) — The key of the catalog.
- `updateCatalogDetails` (`com.oracle.aidataplatform.dp.model.UpdateCatalogDetails`) — The information to be updated.

**Optional Parameters:**
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateCatalogResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Catalog (`CatalogClient`)](#catalogclient-client) • [Top](#top)


## <a id="clusterclient-client"></a>Cluster (`ClusterClient`)
**Operations:**
- [`cloneCompute`](#clusterclient-clonecompute)
- [`createCluster`](#clusterclient-createcluster)
- [`deleteCluster`](#clusterclient-deletecluster)
- [`downloadClusterLogs`](#clusterclient-downloadclusterlogs)
- [`exportComputeConfiguration`](#clusterclient-exportcomputeconfiguration)
- [`getCluster`](#clusterclient-getcluster)
- [`getComputeConfiguration`](#clusterclient-getcomputeconfiguration)
- [`getDefaultCluster`](#clusterclient-getdefaultcluster)
- [`importComputeConfiguration`](#clusterclient-importcomputeconfiguration)
- [`listClusterLibraries`](#clusterclient-listclusterlibraries)
- [`listClusterPermissions`](#clusterclient-listclusterpermissions)
- [`listClusters`](#clusterclient-listclusters)
- [`manageClusterPermission`](#clusterclient-manageclusterpermission)
- [`patchClusterLibrary`](#clusterclient-patchclusterlibrary)
- [`queryReplicaIds`](#clusterclient-queryreplicaids)
- [`restartCluster`](#clusterclient-restartcluster)
- [`searchClusterLogs`](#clusterclient-searchclusterlogs)
- [`searchMavenPackages`](#clusterclient-searchmavenpackages)
- [`startCluster`](#clusterclient-startcluster)
- [`stopCluster`](#clusterclient-stopcluster)
- [`summarizeMetricsData`](#clusterclient-summarizemetricsdata)
- [`updateCluster`](#clusterclient-updatecluster)

### <a id="clusterclient-clonecompute"></a>`cloneCompute`
Creates one Spark Compute by copying all source Compute settings and configuration.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `clusterKey` (`String`) — Cluster key.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `cloneComputeResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-createcluster"></a>`createCluster`
Creates a new cluster with the provided details.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `createClusterDetails` (`com.oracle.aidataplatform.dp.model.CreateClusterDetails`) — Details for the new cluster.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createClusterResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `cluster` (`com.oracle.aidataplatform.dp.model.Cluster`) — The returned {@code Cluster} instance.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-deletecluster"></a>`deleteCluster`
Deletes a cluster from a workspace.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `clusterKey` (`String`) — Cluster key.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteClusterResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-downloadclusterlogs"></a>`downloadClusterLogs`
Downloads logs within the specified cluster and time range. The logs can be filtered by severity (`logLevel`), type (`logContentTypeContains`), and other parameters such as execution context and thread identifiers.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `clusterKey` (`String`) — Cluster key.
- `downloadClusterLogsDetails` (`com.oracle.aidataplatform.dp.model.DownloadClusterLogsDetails`) — Request payload containing the parameters for filtering cluster logs.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `downloadClusterLogsResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.
- `datalakeClusterLogParUrl` (`String`) — This string represents the PAR URL for the compute log file. The {@code datalake-cluster-log-par-url} should be used only after the {@code aidp-async-operation-key} status reaches the SUCCEEDED state. If accessed before the operation completes, the file may be incomplete.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-exportcomputeconfiguration"></a>`exportComputeConfiguration`
Writes selected Compute configuration values supplied by the caller to a workspace YAML file without overwriting an existing file.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `clusterKey` (`String`) — Cluster key.
- `exportComputeConfigurationDetails` (`com.oracle.aidataplatform.dp.model.ExportComputeConfigurationDetails`) — Selected identifiers and destination for the YAML export.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `exportComputeConfigurationResponse`

**Response Fields:**
- `location` (`String`) — URL for the created workspace object.
- `contentLocation` (`String`) — Same as location.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `path` (`String`) — Full path of the YAML workspace object.
- `type` (`String`) — Workspace object type.
- `timeUpdated` (`java.util.Date`) — Date and time when the YAML workspace object was created.
- `inputStream` (`java.io.InputStream`) — The returned {@code java.io.InputStream} instance.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-getcluster"></a>`getCluster`
Returns detailed information about a cluster.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `clusterKey` (`String`) — Cluster key.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getClusterResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `cluster` (`com.oracle.aidataplatform.dp.model.Cluster`) — The returned {@code Cluster} instance.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-getcomputeconfiguration"></a>`getComputeConfiguration`
Gets cluster-scoped Python and JAR libraries and environment variables from Spark Compute.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `clusterKey` (`String`) — Cluster key.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getComputeConfigurationResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `computeConfiguration` (`com.oracle.aidataplatform.dp.model.ComputeConfiguration`) — The returned {@code ComputeConfiguration} instance.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-getdefaultcluster"></a>`getDefaultCluster`
Gets information about the master catalog default cluster.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getDefaultClusterResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `defaultCluster` (`com.oracle.aidataplatform.dp.model.DefaultCluster`) — The returned {@code DefaultCluster} instance.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-importcomputeconfiguration"></a>`importComputeConfiguration`
Imports one or more unique workspace YAML files into an active Spark Compute.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `clusterKey` (`String`) — Cluster key.
- `importComputeConfigurationDetails` (`com.oracle.aidataplatform.dp.model.ImportComputeConfigurationDetails`) — YAML workspace paths to import.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `importComputeConfigurationResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-listclusterlibraries"></a>`listClusterLibraries`
Gets a list of libraries installed on a cluster.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `clusterKey` (`String`) — Cluster key.

**Optional Parameters:**
- `displayName` (`String`) — A filter to return only resources that match the given display name exactly.
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listClusterLibrariesResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `opcPrevPage` (`String`) — For list pagination. When this header appears in the response, previous pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `opcTotalItems` (`Integer`) — For list pagination. This header provides total number of items available. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `clusterLibraryCollection` (`com.oracle.aidataplatform.dp.model.ClusterLibraryCollection`) — The returned {@code ClusterLibraryCollection} instance.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-listclusterpermissions"></a>`listClusterPermissions`
Return a list of permissions for a given cluster.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `clusterKey` (`String`) — Cluster key.

**Optional Parameters:**
- `displayName` (`String`) — A filter to return only resources that match the given display name exactly.
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listClusterPermissionsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `clusterPermissionCollection` (`com.oracle.aidataplatform.dp.model.ClusterPermissionCollection`) — The returned {@code ClusterPermissionCollection} instance.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-listclusters"></a>`listClusters`
Returns a list of all clusters in a given workspace.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace

**Optional Parameters:**
- `state` (`com.oracle.aidataplatform.dp.model.Cluster.State`) — A filter to return only resources that match the given lifecycle state. The state value is case-insensitive.
- `displayName` (`String`) — A filter to return only resources that match the given display name exactly.
- `displayNameContains` (`String`) — A filter to return only resources that have a display name containing the text provided.
- `type` (`String`) — Cluster type. When the filter is not provided list shows all cluster types - USER and AI_COMPUTE else it shows only cluster of type chosen. Only clusters of type USER are attachable to a workspace notebook.
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listClustersResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `clusterCollection` (`com.oracle.aidataplatform.dp.model.ClusterCollection`) — The returned {@code ClusterCollection} instance.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-manageclusterpermission"></a>`manageClusterPermission`
Updates the permissions for a given cluster.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `clusterKey` (`String`) — Cluster key.
- `manageClusterPermissionDetails` (`com.oracle.aidataplatform.dp.model.ManageClusterPermissionDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageClusterPermissionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-patchclusterlibrary"></a>`patchClusterLibrary`
Updates libraries of a cluster with the provided patches.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `clusterKey` (`String`) — Cluster key.
- `patchClusterLibraryDetails` (`com.oracle.aidataplatform.dp.model.PatchClusterLibraryDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `patchClusterLibraryResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `clusterLibraryCollection` (`com.oracle.aidataplatform.dp.model.ClusterLibraryCollection`) — The returned {@code ClusterLibraryCollection} instance.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-queryreplicaids"></a>`queryReplicaIds`
Queries compute replica identifiers for a compute cluster in the given workspace. The response contains distinct replica identifiers derived from the Monitoring `agentNode` metric dimension.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `clusterKey` (`String`) — Cluster key.
- `queryReplicaIdsDetails` (`com.oracle.aidataplatform.dp.model.QueryReplicaIdsDetails`) — Request body containing replica query parameters.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `queryReplicaIdsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `queryReplicaIdsResult` (`com.oracle.aidataplatform.dp.model.QueryReplicaIdsResult`) — The returned {@code QueryReplicaIdsResult} instance.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-restartcluster"></a>`restartCluster`
Restarts a running cluster.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `clusterKey` (`String`) — Cluster key.
- `restartClusterDetails` (`com.oracle.aidataplatform.dp.model.RestartClusterDetails`) — Details for restarting the cluster.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `restartClusterResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `cluster` (`com.oracle.aidataplatform.dp.model.Cluster`) — The returned {@code Cluster} instance.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-searchclusterlogs"></a>`searchClusterLogs`
Searches logs within the specified cluster and time range. Supports pagination and filtering.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `clusterKey` (`String`) — Cluster key.
- `searchClusterLogsDetails` (`com.oracle.aidataplatform.dp.model.SearchClusterLogsDetails`) — Request body containing the search parameters for cluster logs.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `searchClusterLogsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `clusterLogCollection` (`com.oracle.aidataplatform.dp.model.ClusterLogCollection`) — The returned {@code ClusterLogCollection} instance.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-searchmavenpackages"></a>`searchMavenPackages`
Searches Maven packages available for cluster library installation.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `clusterKey` (`String`) — Cluster key.
- `mavenSearchQuery` (`String`) — Search text matched against Maven package metadata, including group and artifact identifiers. For example, {@code commons-csv} can return {@code org.apache.commons:commons-csv}.

**Optional Parameters:**
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `searchMavenPackagesResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `opcPrevPage` (`String`) — For list pagination. When this header appears in the response, previous pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `mavenSearchSummaryCollection` (`com.oracle.aidataplatform.dp.model.MavenSearchSummaryCollection`) — The returned {@code MavenSearchSummaryCollection} instance.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-startcluster"></a>`startCluster`
Starts a cluster that has halted operation.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `clusterKey` (`String`) — Cluster key.
- `startClusterDetails` (`com.oracle.aidataplatform.dp.model.StartClusterDetails`) — Details of the cluster being started.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `startClusterResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `cluster` (`com.oracle.aidataplatform.dp.model.Cluster`) — The returned {@code Cluster} instance.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-stopcluster"></a>`stopCluster`
Stops an active cluster.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `clusterKey` (`String`) — Cluster key.
- `stopClusterDetails` (`com.oracle.aidataplatform.dp.model.StopClusterDetails`) — Details for stopping the cluster.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `stopClusterResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `cluster` (`com.oracle.aidataplatform.dp.model.Cluster`) — The returned {@code Cluster} instance.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-summarizemetricsdata"></a>`summarizeMetricsData`
Provides summarized compute metrics for a compute cluster in the given workspace. This API aggregates metric data points based on a specified namespace, metric name, and aggregation type. The response contains computed metric summaries.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `clusterKey` (`String`) — Cluster key.
- `summarizeMetricsDataDetails` (`com.oracle.aidataplatform.dp.model.SummarizeMetricsDataDetails`) — Request body containing metric parameters.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `summarizeMetricsDataResponse`

**Response Fields:**
- `etag` (`String`) — The ETag for optimistic concurrency control.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `summarizeMetricsResponse` (`com.oracle.aidataplatform.dp.model.SummarizeMetricsResponse`) — The returned {@code SummarizeMetricsResponse} instance.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-updatecluster"></a>`updateCluster`
Update the details of a given cluster.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `clusterKey` (`String`) — Cluster key.
- `updateClusterDetails` (`com.oracle.aidataplatform.dp.model.UpdateClusterDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateClusterResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `cluster` (`com.oracle.aidataplatform.dp.model.Cluster`) — The returned {@code Cluster} instance.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


## <a id="credentialsclient-client"></a>Credentials (`CredentialsClient`)
**Operations:**
- [`createCredential`](#credentialsclient-createcredential)
- [`deleteCredential`](#credentialsclient-deletecredential)
- [`getCredential`](#credentialsclient-getcredential)
- [`listCredentials`](#credentialsclient-listcredentials)
- [`updateCredential`](#credentialsclient-updatecredential)

### <a id="credentialsclient-createcredential"></a>`createCredential`
Creates a new credential object with the provided details. The operation completes synchronously; callers can invoke list or get to retrieve the resource payload.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `createDataLakeCredentialDetails` (`com.oracle.aidataplatform.dp.model.CreateDataLakeCredentialDetails`) — Details for the new credential object. When the internal flag is enabled, callers must supply a {@code namespace} value of {@code default} or {@code user_settings} in the payload.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createCredentialResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Credentials (`CredentialsClient`)](#credentialsclient-client) • [Top](#top)


### <a id="credentialsclient-deletecredential"></a>`deleteCredential`
Deletes a credential object. The operation completes synchronously without a response body.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `credentialKey` (`String`) — The unique identifier of an credential

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteCredentialResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Credentials (`CredentialsClient`)](#credentialsclient-client) • [Top](#top)


### <a id="credentialsclient-getcredential"></a>`getCredential`
Gets detailed information about credential with a given credential key.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `credentialKey` (`String`) — The unique identifier of an credential

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getCredentialResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `credential` (`com.oracle.aidataplatform.dp.model.Credential`) — The returned {@code Credential} instance.

**Return:** [Back to Credentials (`CredentialsClient`)](#credentialsclient-client) • [Top](#top)


### <a id="credentialsclient-listcredentials"></a>`listCredentials`
Returns a list of credentials.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `displayName` (`String`) — A filter to return only resources that match the given display name exactly.
- `displayNameContains` (`String`) — A filter to return only resources whose displayName contains the provided value (case-insensitive).
- `lifecycleState` (`String`) — A filter to return only resources whose lifecycleState matches the provided value.
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending.
- `credentialType` (`com.oracle.aidataplatform.dp.model.CredentialType`) — The type of the Credential
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listCredentialsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `credentialCollection` (`com.oracle.aidataplatform.dp.model.CredentialCollection`) — The returned {@code CredentialCollection} instance.

**Return:** [Back to Credentials (`CredentialsClient`)](#credentialsclient-client) • [Top](#top)


### <a id="credentialsclient-updatecredential"></a>`updateCredential`
Updates a credential object. The operation completes synchronously; callers can invoke get to confirm the latest state.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `credentialKey` (`String`) — The unique identifier of an credential
- `updateDataLakeCredentialDetails` (`com.oracle.aidataplatform.dp.model.UpdateDataLakeCredentialDetails`) — The information to be updated.

**Optional Parameters:**
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateCredentialResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Credentials (`CredentialsClient`)](#credentialsclient-client) • [Top](#top)


## <a id="datalineageclient-client"></a>Data Lineage (`DataLineageClient`)
**Operations:**
- [`exportLineage`](#datalineageclient-exportlineage)
- [`fetchEntityLineage`](#datalineageclient-fetchentitylineage)

### <a id="datalineageclient-exportlineage"></a>`exportLineage`
(Preview) Returns complete lineage for the provided anchor node in CSV format.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `exportLineageDetails` (`com.oracle.aidataplatform.dp.model.ExportLineageDetails`) — The information needed to export lineage.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `exportLineageResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `contentDisposition` (`String`) — Attachment filename in {@code AnchorNodeName_Timestamp.csv} format.
- `inputStream` (`java.io.InputStream`) — The returned {@code java.io.InputStream} instance.

**Return:** [Back to Data Lineage (`DataLineageClient`)](#datalineageclient-client) • [Top](#top)


### <a id="datalineageclient-fetchentitylineage"></a>`fetchEntityLineage`
(Preview) Returns lineage for a given entity object.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `fetchEntityLineageDetails` (`com.oracle.aidataplatform.dp.model.FetchEntityLineageDetails`) — The information needed to obtain desired lineage.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `fetchEntityLineageResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `entityLineage` (`com.oracle.aidataplatform.dp.model.EntityLineage`) — The returned {@code EntityLineage} instance.

**Return:** [Back to Data Lineage (`DataLineageClient`)](#datalineageclient-client) • [Top](#top)


## <a id="deltashareclient-client"></a>Delta Share (`DeltaShareClient`)
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

### <a id="deltashareclient-createrecipient"></a>`createRecipient`
Creates a recipient for a Delta Share protocol.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `createRecipientDetails` (`com.oracle.aidataplatform.dp.model.CreateRecipientDetails`) — Details for the new recipient for Delta Share protocol in AI Data Platform.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createRecipientResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `recipient` (`com.oracle.aidataplatform.dp.model.Recipient`) — The returned {@code Recipient} instance.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-createshare"></a>`createShare`
Creates a Delta Share protocol.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `createShareDetails` (`com.oracle.aidataplatform.dp.model.CreateShareDetails`) — Details for the new share for Delta Share protocol in AI Data Platform.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createShareResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `share` (`com.oracle.aidataplatform.dp.model.Share`) — The returned {@code Share} instance.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-deleterecipient"></a>`deleteRecipient`
Deletes a Delta Share recipient.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `recipientKey` (`String`) — The key of the recipient resource

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteRecipientResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-deleteshare"></a>`deleteShare`
Deletes a Delta Share.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `shareKey` (`String`) — The unique key of the Share.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteShareResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-getrecipient"></a>`getRecipient`
Gets detailed information about a Delta Share recipient.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `recipientKey` (`String`) — The key of the recipient resource

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getRecipientResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `recipient` (`com.oracle.aidataplatform.dp.model.Recipient`) — The returned {@code Recipient} instance.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-getshare"></a>`getShare`
Gets detailed information about a Delta Share.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `shareKey` (`String`) — The unique key of the Share.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getShareResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `share` (`com.oracle.aidataplatform.dp.model.Share`) — The returned {@code Share} instance.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-listrecipientpermissions"></a>`listRecipientPermissions`
Gets a detailed list of Delta Share recipient permissions.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `recipientKey` (`String`) — The key of the recipient resource

**Optional Parameters:**
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. Default order for {@code grantee} is ascending.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listRecipientPermissionsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `recipientPermissionCollection` (`com.oracle.aidataplatform.dp.model.RecipientPermissionCollection`) — The returned {@code RecipientPermissionCollection} instance.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-listrecipientshares"></a>`listRecipientShares`
Returns a list of Delta Shares that the specified recipient has been granted access to.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `recipientKey` (`String`) — The key of the recipient resource

**Optional Parameters:**
- `displayName` (`String`) — A filter to return only resources that match the given display name exactly.
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listRecipientSharesResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `shareCollection` (`com.oracle.aidataplatform.dp.model.ShareCollection`) — The returned {@code ShareCollection} instance.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-listrecipients"></a>`listRecipients`
Gets a list of Delta Share recipients.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `displayName` (`String`) — A filter to return only resources that match the given display name exactly.
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listRecipientsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `recipientCollection` (`com.oracle.aidataplatform.dp.model.RecipientCollection`) — The returned {@code RecipientCollection} instance.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-listsharedataassets"></a>`listShareDataAssets`
Gets a list of Delta Share assets.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `shareKey` (`String`) — The unique key of the Share.

**Optional Parameters:**
- `displayName` (`String`) — A filter to return only resources that match the given display name exactly.
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listShareDataAssetsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `shareDataAssetCollection` (`com.oracle.aidataplatform.dp.model.ShareDataAssetCollection`) — The returned {@code ShareDataAssetCollection} instance.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-listsharepermissions"></a>`listSharePermissions`
Returns a list of Delta Shares that the specified recipient has been granted access to.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `shareKey` (`String`) — The unique key of the Share.

**Optional Parameters:**
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for {@code grantee} is ascending. Default order for {@code granteeType} is ascending.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listSharePermissionsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `sharePermissionCollection` (`com.oracle.aidataplatform.dp.model.SharePermissionCollection`) — The returned {@code SharePermissionCollection} instance.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-listsharerecipients"></a>`listShareRecipients`
Gets a list of recipients that have been given access on the specified Delta Share.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `shareKey` (`String`) — The unique key of the Share.

**Optional Parameters:**
- `displayName` (`String`) — A filter to return only resources that match the given display name exactly.
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listShareRecipientsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `recipientCollection` (`com.oracle.aidataplatform.dp.model.RecipientCollection`) — The returned {@code RecipientCollection} instance.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-listshares"></a>`listShares`
Gets a list of Delta Shares.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `displayName` (`String`) — A filter to return only resources that match the given display name exactly.
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listSharesResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `shareCollection` (`com.oracle.aidataplatform.dp.model.ShareCollection`) — The returned {@code ShareCollection} instance.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-managerecipientpermission"></a>`manageRecipientPermission`
Updates the permissions of a Delta Share recipient.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `recipientKey` (`String`) — The key of the recipient resource
- `manageRecipientPermissionDetails` (`com.oracle.aidataplatform.dp.model.ManageRecipientPermissionDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageRecipientPermissionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-manageshareaccess"></a>`manageShareAccess`
Updates consumer-side access on a share for a recipient. A provider user can grant or revoke access on a particular share for a given recipient.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `shareKey` (`String`) — The unique key of the Share.
- `manageShareAccessDetails` (`com.oracle.aidataplatform.dp.model.ManageShareAccessDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageShareAccessResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-managesharedataasset"></a>`manageShareDataAsset`
Updates data assets on a Delta Share with the provided information.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `shareKey` (`String`) — The unique key of the Share.
- `manageShareDataAssetDetails` (`com.oracle.aidataplatform.dp.model.ManageShareDataAssetDetails`) — The Delta Share data asset information to be updated.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageShareDataAssetResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-managesharepermission"></a>`manageSharePermission`
Updates permissions on a Delta Share.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `shareKey` (`String`) — The unique key of the Share.
- `manageSharePermissionDetails` (`com.oracle.aidataplatform.dp.model.ManageSharePermissionDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageSharePermissionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-updaterecipient"></a>`updateRecipient`
Updates the metadata of a Delta Share recipient.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `recipientKey` (`String`) — The key of the recipient resource
- `updateRecipientDetails` (`com.oracle.aidataplatform.dp.model.UpdateRecipientDetails`) — The information to be updated for a recipient.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateRecipientResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-updateshare"></a>`updateShare`
Update a Delta Share with the provided metadata.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `shareKey` (`String`) — The unique key of the Share.
- `updateShareDetails` (`com.oracle.aidataplatform.dp.model.UpdateShareDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateShareResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


## <a id="gitclient-client"></a>Git (`GitClient`)
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

### <a id="gitclient-checkoutbranch"></a>`checkoutBranch`
(Preview) Checks out a remote branch into the specified workspace folder, ensuring the worktree tracks the requested branch HEAD.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `gitRepositoryKey` (`String`) — The Git repository key.
- `checkoutBranchDetails` (`com.oracle.aidataplatform.dp.model.CheckoutBranchDetails`) — Details for the new branch.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `checkoutBranchResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.
- `gitBranch` (`com.oracle.aidataplatform.dp.model.GitBranch`) — The returned {@code GitBranch} instance.

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-commitpushgitrepository"></a>`commitPushGitRepository`
(Preview) Stages selected workspace updates, creates a commit, and pushes it upstream so automation can sync with Git providers.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `gitRepositoryKey` (`String`) — The Git repository key.
- `commitPushDetails` (`com.oracle.aidataplatform.dp.model.CommitPushDetails`) — Commit details.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `commitPushGitRepositoryResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-creategitbranch"></a>`createGitBranch`
(Preview) Creates a new branch in the connected repo so teams can stage changes in isolated workspaces.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `gitRepositoryKey` (`String`) — The Git repository key.
- `createGitBranchDetails` (`com.oracle.aidataplatform.dp.model.CreateGitBranchDetails`) — Details for the new Workspace Object.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createGitBranchResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.
- `createGitBranch` (`com.oracle.aidataplatform.dp.model.CreateGitBranch`) — The returned {@code CreateGitBranch} instance.

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-getgitdiffdetail"></a>`getGitDiffDetail`
(Preview) Returns a unified diff patch for a specific file so editors and review panes can render inline changes.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `gitRepositoryKey` (`String`) — The Git repository key.
- `gitFolderPath` (`String`) — The Git folder path.
- `branchName` (`String`) — Expected branch name for the folder context.
- `gitFilePath` (`String`) — File path relative to repository root.

**Optional Parameters:**
- `contextLines` (`Integer`) — Number of context lines to include in the diff.
- `maxPatchBytes` (`Integer`) — Maximum number of bytes of diff output to return.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getGitDiffDetailResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `gitDiffDetail` (`com.oracle.aidataplatform.dp.model.GitDiffDetail`) — The returned {@code GitDiffDetail} instance.

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-getgitoperationstate"></a>`getGitOperationState`
(Preview) Returns the current Git worktree status—including in-progress operations or detached HEAD indicators—for the workspace folder.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `gitRepositoryKey` (`String`) — The Git repository key.

**Optional Parameters:**
- `operationName` (`String`) — Optional operation the caller intends to perform (for example PULL, PUSH, RESET, CHECKOUT).
- `branchName` (`String`) — Expected branch name for the folder context.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getGitOperationStateResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `gitOperationState` (`com.oracle.aidataplatform.dp.model.GitOperationState`) — The returned {@code GitOperationState} instance.

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-getgitrepository"></a>`getGitRepository`
(Preview) Returns repository metadata, credential references, and workspace linkage for a specific AI Data Platform Git repository.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `gitRepositoryKey` (`String`) — The Git repository key.

**Optional Parameters:**
- `shouldIncludeCredentialKey` (`Boolean`) — A flag to include credential key in response. If 'true', credential key will be returned in response. Default 'false'.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getGitRepositoryResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `gitRepository` (`com.oracle.aidataplatform.dp.model.GitRepository`) — The returned {@code GitRepository} instance.

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-listgitbranches"></a>`listGitBranches`
(Preview) Returns branch summaries with optional display-name filters and pagination, so UIs can show branch pickers and search results.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `gitRepositoryKey` (`String`) — The Git repository key.

**Optional Parameters:**
- `displayName` (`String`) — A filter to return only resources that match the given display name exactly.
- `displayNameContains` (`String`) — A filter to return only resources that have a display name containing the text provided.
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listGitBranchesResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `opcTotalItems` (`Integer`) — For list pagination. This header provides total number of items available.
- `gitBranchCollection` (`com.oracle.aidataplatform.dp.model.GitBranchCollection`) — The returned {@code GitBranchCollection} instance.

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-listgitdiffs"></a>`listGitDiffs`
(Preview) Returns file-level diff summaries for the workspace branch, enabling UI views of changed files or conflicts without heavy payloads.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `gitRepositoryKey` (`String`) — The Git repository key.
- `gitFolderPath` (`String`) — The Git folder path.
- `branchName` (`String`) — Expected branch name for the folder context.

**Optional Parameters:**
- `compareTo` (`CompareTo`) — Determines which reference is used for computing diffs.
- `filter` (`Filter`) — Filter which files are returned.
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `displayName` (`String`) — A filter to return only resources that match the given display name exactly.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listGitDiffsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `opcTotalItems` (`Integer`) — For list pagination. This header provides total number of items available.
- `gitDiffSummaryCollection` (`com.oracle.aidataplatform.dp.model.GitDiffSummaryCollection`) — The returned {@code GitDiffSummaryCollection} instance.

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-mergegitrepository"></a>`mergeGitRepository`
(Preview) Applies the requested branch or commit onto the workspace branch to preview integration changes before pushing.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `gitRepositoryKey` (`String`) — The Git repository key.
- `gitMergeDetails` (`com.oracle.aidataplatform.dp.model.GitMergeDetails`) — Folder/branch details to merge.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `mergeGitRepositoryResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-pullgitrepository"></a>`pullGitRepository`
(Preview) Performs a Git pull for the workspace branch so developers can sync local files with the latest upstream commits.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `gitRepositoryKey` (`String`) — The Git repository key.
- `gitPullDetails` (`com.oracle.aidataplatform.dp.model.GitPullDetails`) — Folder/branch details to pull.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `pullGitRepositoryResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-rebasegitrepository"></a>`rebaseGitRepository`
(Preview) Rebases the workspace branch on top of another commit or branch to linearize history and resolve drift.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `gitRepositoryKey` (`String`) — The Git repository key.
- `gitRebaseDetails` (`com.oracle.aidataplatform.dp.model.GitRebaseDetails`) — Details needed to perform rebase operation.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `rebaseGitRepositoryResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-resetgitfolderstate"></a>`resetGitFolderState`
(Preview) Halts in-progress Git operations and discards local changes in the workspace folder to regain a clean state.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `gitRepositoryKey` (`String`) — The Git repository key.
- `resetGitFolderStateDetails` (`com.oracle.aidataplatform.dp.model.ResetGitFolderStateDetails`) — Merge conflict resolution details.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `resetGitFolderStateResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-resetgitrepository"></a>`resetGitRepository`
(Preview) Performs a Git reset so the workspace branch matches the specified commit, discarding newer local commits.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `gitRepositoryKey` (`String`) — The Git repository key.
- `gitResetDetails` (`com.oracle.aidataplatform.dp.model.GitResetDetails`) — Details needed to perform Git reset operation.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `resetGitRepositoryResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-resolvegitconflicts"></a>`resolveGitConflicts`
(Preview) Accepts conflict resolution instructions—choose source or target versions—and records the resolution back to the repo.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `gitRepositoryKey` (`String`) — The Git repository key.
- `conflictResolveDetails` (`com.oracle.aidataplatform.dp.model.ConflictResolveDetails`) — Conflict resolution details.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `resolveGitConflictsResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `gitBranch` (`com.oracle.aidataplatform.dp.model.GitBranch`) — The returned {@code GitBranch} instance.

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-updategitrepository"></a>`updateGitRepository`
(Preview) Updates stored repository details—such as credentials or default branches—so automation stays aligned with your source control.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `updateGitRepositoryDetails` (`com.oracle.aidataplatform.dp.model.UpdateGitRepositoryDetails`) — The information to be updated.
- `gitRepositoryKey` (`String`) — The Git repository key.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateGitRepositoryResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


## <a id="mlopsclient-client"></a>ML Ops (`MLOpsClient`)
**Operations:**
- [`activateModelDeployment`](#mlopsclient-activatemodeldeployment)
- [`createExperiment`](#mlopsclient-createexperiment)
- [`createExperimentRun`](#mlopsclient-createexperimentrun)
- [`createModelDeployment`](#mlopsclient-createmodeldeployment)
- [`createModelVersion`](#mlopsclient-createmodelversion)
- [`createRegisteredModel`](#mlopsclient-createregisteredmodel)
- [`createWorkspaceModelVersion`](#mlopsclient-createworkspacemodelversion)
- [`deactivateModelDeployment`](#mlopsclient-deactivatemodeldeployment)
- [`deleteExperiment`](#mlopsclient-deleteexperiment)
- [`deleteExperimentRun`](#mlopsclient-deleteexperimentrun)
- [`deleteExperimentRunTag`](#mlopsclient-deleteexperimentruntag)
- [`deleteExperimentTag`](#mlopsclient-deleteexperimenttag)
- [`deleteModelDeployment`](#mlopsclient-deletemodeldeployment)
- [`deleteModelVersion`](#mlopsclient-deletemodelversion)
- [`deleteModelVersionTag`](#mlopsclient-deletemodelversiontag)
- [`deleteRegisteredModel`](#mlopsclient-deleteregisteredmodel)
- [`deleteRegisteredModelTag`](#mlopsclient-deleteregisteredmodeltag)
- [`getExperimentById`](#mlopsclient-getexperimentbyid)
- [`getExperimentByName`](#mlopsclient-getexperimentbyname)
- [`getExperimentRunById`](#mlopsclient-getexperimentrunbyid)
- [`getExperimentRunMetricHistory`](#mlopsclient-getexperimentrunmetrichistory)
- [`getModelDeployment`](#mlopsclient-getmodeldeployment)
- [`getModelDeploymentActivity`](#mlopsclient-getmodeldeploymentactivity)
- [`getModelDeploymentContract`](#mlopsclient-getmodeldeploymentcontract)
- [`getModelVersion`](#mlopsclient-getmodelversion)
- [`getRegisteredModel`](#mlopsclient-getregisteredmodel)
- [`getRegisteredModelSummary`](#mlopsclient-getregisteredmodelsummary)
- [`listArtifacts`](#mlopsclient-listartifacts)
- [`listExperimentRuns`](#mlopsclient-listexperimentruns)
- [`listExperiments`](#mlopsclient-listexperiments)
- [`listLoggedModels`](#mlopsclient-listloggedmodels)
- [`listModelDeploymentActivities`](#mlopsclient-listmodeldeploymentactivities)
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
- [`rollBackModelDeployment`](#mlopsclient-rollbackmodeldeployment)
- [`rollForwardModelDeployment`](#mlopsclient-rollforwardmodeldeployment)
- [`searchModelDeployments`](#mlopsclient-searchmodeldeployments)
- [`setExperimentRunTag`](#mlopsclient-setexperimentruntag)
- [`setExperimentTag`](#mlopsclient-setexperimenttag)
- [`setModelVersionTag`](#mlopsclient-setmodelversiontag)
- [`setRegisteredModelTag`](#mlopsclient-setregisteredmodeltag)
- [`transitionModelVersionStage`](#mlopsclient-transitionmodelversionstage)
- [`updateExperiment`](#mlopsclient-updateexperiment)
- [`updateExperimentRun`](#mlopsclient-updateexperimentrun)
- [`updateExperimentRunTags`](#mlopsclient-updateexperimentruntags)
- [`updateExperimentTags`](#mlopsclient-updateexperimenttags)
- [`updateModelDeployment`](#mlopsclient-updatemodeldeployment)
- [`updateModelDeploymentTags`](#mlopsclient-updatemodeldeploymenttags)
- [`updateModelVersion`](#mlopsclient-updatemodelversion)
- [`updateModelVersionTags`](#mlopsclient-updatemodelversiontags)
- [`updateRegisteredModel`](#mlopsclient-updateregisteredmodel)
- [`updateRegisteredModelTags`](#mlopsclient-updateregisteredmodeltags)

### <a id="mlopsclient-activatemodeldeployment"></a>`activateModelDeployment`
(Preview) Activates a model deployment so the model becomes available for inference.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `activateModelDeploymentDetails` (`com.oracle.aidataplatform.dp.model.ActivateModelDeploymentDetails`) — Details for the model deployment activation.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `activateModelDeploymentResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-createexperiment"></a>`createExperiment`
(Preview) Creates an experiment in a workspace.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `createExperimentDetails` (`com.oracle.aidataplatform.dp.model.CreateExperimentDetails`) — Details for the new experiment.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createExperimentResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `createExperimentResponseDetails` (`com.oracle.aidataplatform.dp.model.CreateExperimentResponseDetails`) — The returned {@code CreateExperimentResponseDetails} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-createexperimentrun"></a>`createExperimentRun`
(Preview) Creates a new run within an experiment.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `createExperimentRunDetails` (`com.oracle.aidataplatform.dp.model.CreateExperimentRunDetails`) — Details for the new run.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createExperimentRunResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `createExperimentRunResponseDetails` (`com.oracle.aidataplatform.dp.model.CreateExperimentRunResponseDetails`) — The returned {@code CreateExperimentRunResponseDetails} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-createmodeldeployment"></a>`createModelDeployment`
(Preview) Creates a model deployment for a registered model.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `createModelDeploymentDetails` (`com.oracle.aidataplatform.dp.model.CreateModelDeploymentDetails`) — Details for the new model deployment.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createModelDeploymentResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `modelDeployment` (`com.oracle.aidataplatform.dp.model.ModelDeployment`) — The returned {@code ModelDeployment} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-createmodelversion"></a>`createModelVersion`
(Preview) Creates a model version.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `createModelVersionDetails` (`com.oracle.aidataplatform.dp.model.CreateModelVersionDetails`) — Details for the new model version.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createModelVersionResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `createModelVersionResponseDetails` (`com.oracle.aidataplatform.dp.model.CreateModelVersionResponseDetails`) — The returned {@code CreateModelVersionResponseDetails} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-createregisteredmodel"></a>`createRegisteredModel`
(Preview) Creates a registered model in a workspace.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `createRegisteredModelDetails` (`com.oracle.aidataplatform.dp.model.CreateRegisteredModelDetails`) — Details for the new registered model.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createRegisteredModelResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `createRegisteredModelResponseDetails` (`com.oracle.aidataplatform.dp.model.CreateRegisteredModelResponseDetails`) — The returned {@code CreateRegisteredModelResponseDetails} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-createworkspacemodelversion"></a>`createWorkspaceModelVersion`
(Preview) Creates a new model version in a specified workspace.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `createModelVersionDetails` (`com.oracle.aidataplatform.dp.model.CreateModelVersionDetails`) — Details for the new model version.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createWorkspaceModelVersionResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `createModelVersionResponseDetails` (`com.oracle.aidataplatform.dp.model.CreateModelVersionResponseDetails`) — The returned {@code CreateModelVersionResponseDetails} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-deactivatemodeldeployment"></a>`deactivateModelDeployment`
(Preview) Deactivates a model deployment to safely take the model offline.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `deactivateModelDeploymentDetails` (`com.oracle.aidataplatform.dp.model.DeactivateModelDeploymentDetails`) — Details for the model deployment deactivation.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deactivateModelDeploymentResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-deleteexperiment"></a>`deleteExperiment`
(Preview) Deletes an experiment.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `deleteExperimentDetails` (`com.oracle.aidataplatform.dp.model.DeleteExperimentDetails`) — Details of the experiment.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteExperimentResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `deleteExperimentResponseDetails` (`com.oracle.aidataplatform.dp.model.DeleteExperimentResponseDetails`) — The returned {@code DeleteExperimentResponseDetails} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-deleteexperimentrun"></a>`deleteExperimentRun`
(Preview) Deletes an experiment run.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `deleteExperimentRunDetails` (`com.oracle.aidataplatform.dp.model.DeleteExperimentRunDetails`) — Details of the Experiment Run.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteExperimentRunResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `deleteExperimentRunResponseDetails` (`com.oracle.aidataplatform.dp.model.DeleteExperimentRunResponseDetails`) — The returned {@code DeleteExperimentRunResponseDetails} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-deleteexperimentruntag"></a>`deleteExperimentRunTag`
(Preview) Deletes a tag on an experiment run.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `deleteExperimentRunTagDetails` (`com.oracle.aidataplatform.dp.model.DeleteExperimentRunTagDetails`) — Tag details to delete on an experiment run.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteExperimentRunTagResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `deleteExperimentRunTagResponseDetails` (`com.oracle.aidataplatform.dp.model.DeleteExperimentRunTagResponseDetails`) — The returned {@code DeleteExperimentRunTagResponseDetails} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-deleteexperimenttag"></a>`deleteExperimentTag`
(Preview) Deletes a tag on an experiment.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `deleteExperimentTagDetails` (`com.oracle.aidataplatform.dp.model.DeleteExperimentTagDetails`) — Tag details to delete on an experiment.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteExperimentTagResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `deleteExperimentTagResponseDetails` (`com.oracle.aidataplatform.dp.model.DeleteExperimentTagResponseDetails`) — The returned {@code DeleteExperimentTagResponseDetails} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-deletemodeldeployment"></a>`deleteModelDeployment`
(Preview) Deletes a model deployment that is not active.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `deleteModelDeploymentDetails` (`com.oracle.aidataplatform.dp.model.DeleteModelDeploymentDetails`) — Details for the model deployment to delete.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteModelDeploymentResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-deletemodelversion"></a>`deleteModelVersion`
(Preview) Deletes a model version.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `deleteModelVersionDetails` (`com.oracle.aidataplatform.dp.model.DeleteModelVersionDetails`) — Details of the model version to delete.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteModelVersionResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `deleteModelVersionResponseDetails` (`com.oracle.aidataplatform.dp.model.DeleteModelVersionResponseDetails`) — The returned {@code DeleteModelVersionResponseDetails} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-deletemodelversiontag"></a>`deleteModelVersionTag`
(Preview) Deletes a tag on a model version.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `deleteModelVersionTagDetails` (`com.oracle.aidataplatform.dp.model.DeleteModelVersionTagDetails`) — Details of a model version tag to delete.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteModelVersionTagResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `deleteModelVersionTagResponseDetails` (`com.oracle.aidataplatform.dp.model.DeleteModelVersionTagResponseDetails`) — The returned {@code DeleteModelVersionTagResponseDetails} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-deleteregisteredmodel"></a>`deleteRegisteredModel`
(Preview) Deletes a registered model.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `deleteRegisteredModelDetails` (`com.oracle.aidataplatform.dp.model.DeleteRegisteredModelDetails`) — Details of the registered model to delete.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteRegisteredModelResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `deleteRegisteredModelResponseDetails` (`com.oracle.aidataplatform.dp.model.DeleteRegisteredModelResponseDetails`) — The returned {@code DeleteRegisteredModelResponseDetails} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-deleteregisteredmodeltag"></a>`deleteRegisteredModelTag`
(Preview) Deletes a tag on a registered model.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `deleteRegisteredModelTagDetails` (`com.oracle.aidataplatform.dp.model.DeleteRegisteredModelTagDetails`) — Details of a registered model tag.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteRegisteredModelTagResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `deleteRegisteredModelTagResponseDetails` (`com.oracle.aidataplatform.dp.model.DeleteRegisteredModelTagResponseDetails`) — The returned {@code DeleteRegisteredModelTagResponseDetails} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-getexperimentbyid"></a>`getExperimentById`
(Preview) Returns metadata for an experiment by ID. This method works on deleted experiments.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `experimentId` (`String`) — The unique ID of the experiment to retrieve.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getExperimentByIdResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `experimentResponse` (`com.oracle.aidataplatform.dp.model.ExperimentResponse`) — The returned {@code ExperimentResponse} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-getexperimentbyname"></a>`getExperimentByName`
(Preview) Returns experiment metadata for a given name. Returns deleted experiments, but prefers the active experiment if an active and deleted experiment share the same name. If multiple deleted experiments share the same name, the API will return one of them.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `experimentName` (`String`) — The name of the experiment to retrieve.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getExperimentByNameResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `experimentResponse` (`com.oracle.aidataplatform.dp.model.ExperimentResponse`) — The returned {@code ExperimentResponse} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-getexperimentrunbyid"></a>`getExperimentRunById`
(Preview) Returns details of an experiment run by ID.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `runId` (`String`) — ID of the run to fetch.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getExperimentRunByIdResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `getExperimentRunResponseDetails` (`com.oracle.aidataplatform.dp.model.GetExperimentRunResponseDetails`) — The returned {@code GetExperimentRunResponseDetails} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-getexperimentrunmetrichistory"></a>`getExperimentRunMetricHistory`
(Preview) Returns a history of experiment run metrics.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `runId` (`String`) — ID of the run metric history to fetch.
- `metricKey` (`String`) — Name of the metric key.

**Optional Parameters:**
- `pageToken` (`String`) — Pagination token to go to the next page of metric history.
- `maxResults` (`Integer`) — Maximum number of logged instances of a metric for a run to return per call. Backend servers may restrict the value of max_results depending on performance requirements. Requests that do not specify this value will behave as non-paginated queries where all metric history values for a given metric within a run are returned in a single response.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getExperimentRunMetricHistoryResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `experimentRunMetricHistoryCollection` (`com.oracle.aidataplatform.dp.model.ExperimentRunMetricHistoryCollection`) — The returned {@code ExperimentRunMetricHistoryCollection} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-getmodeldeployment"></a>`getModelDeployment`
(Preview) Returns details for a specified model deployment.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `deploymentId` (`String`) — The unique 32-character hexadecimal ID of the model deployment.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getModelDeploymentResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `modelDeployment` (`com.oracle.aidataplatform.dp.model.ModelDeployment`) — The returned {@code ModelDeployment} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-getmodeldeploymentactivity"></a>`getModelDeploymentActivity`
(Preview) Returns the full detail for a single deployment activity, including the configuration snapshot and the comment.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `activityId` (`String`) — The unique 32-character hexadecimal ID of the deployment activity to retrieve.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getModelDeploymentActivityResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `deploymentActivity` (`com.oracle.aidataplatform.dp.model.DeploymentActivity`) — The returned {@code DeploymentActivity} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-getmodeldeploymentcontract"></a>`getModelDeploymentContract`
(Preview) Returns the model contract (input/output signatures and a sample request) for the query-endpoint playground.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `deploymentId` (`String`) — The unique 32-character hexadecimal ID of the model deployment.

**Optional Parameters:**
- `modelVersion` (`Long`) — The model version whose contract to return; when omitted the latest (highest) version on the deployment is used.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getModelDeploymentContractResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `getModelDeploymentContractResponse` (`com.oracle.aidataplatform.dp.model.GetModelDeploymentContractResponse`) — The returned {@code GetModelDeploymentContractResponse} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-getmodelversion"></a>`getModelVersion`
(Preview) Returns detailed information for a model version.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `name` (`String`) — Name of the model version.
- `version` (`String`) — Version number of the model version.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getModelVersionResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `getModelVersionResponseDetails` (`com.oracle.aidataplatform.dp.model.GetModelVersionResponseDetails`) — The returned {@code GetModelVersionResponseDetails} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-getregisteredmodel"></a>`getRegisteredModel`
(Preview) Returns details for a specified registered model.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `name` (`String`) — Name of the registered model.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getRegisteredModelResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `getRegisteredModelResponseDetails` (`com.oracle.aidataplatform.dp.model.GetRegisteredModelResponseDetails`) — The returned {@code GetRegisteredModelResponseDetails} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-getregisteredmodelsummary"></a>`getRegisteredModelSummary`
(Preview) Returns aggregate counts of the registered-model footprint within a catalog and schema.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `catalog` (`String`) — Catalog whose registered-model footprint should be summarized.
- `schema` (`String`) — Schema (within the catalog) whose registered-model footprint should be summarized.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getRegisteredModelSummaryResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `registeredModelSummary` (`com.oracle.aidataplatform.dp.model.RegisteredModelSummary`) — The returned {@code RegisteredModelSummary} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-listartifacts"></a>`listArtifacts`
(Preview) Returns a list of artifacts.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `runId` (`String`) — ID of the run whose artifacts to list.

**Optional Parameters:**
- `path` (`String`) — Filter artifacts matching this path (a relative path from the root artifact directory).
- `pageToken` (`String`) — Token indicating the page of artifact results to fetch.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listArtifactsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `artifactList` (`com.oracle.aidataplatform.dp.model.ArtifactList`) — The returned {@code ArtifactList} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-listexperimentruns"></a>`listExperimentRuns`
(Preview) Returns a list of experiment runs in a workspace.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `listExperimentRunsDetails` (`com.oracle.aidataplatform.dp.model.ListExperimentRunsDetails`) — Details of experiment runs to fetch.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listExperimentRunsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `experimentRunCollection` (`com.oracle.aidataplatform.dp.model.ExperimentRunCollection`) — The returned {@code ExperimentRunCollection} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-listexperiments"></a>`listExperiments`
(Preview) Returns a list of experiments with the given details.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `listExperimentsDetails` (`com.oracle.aidataplatform.dp.model.ListExperimentsDetails`) — Details of experiments to fetch.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listExperimentsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `experimentCollection` (`com.oracle.aidataplatform.dp.model.ExperimentCollection`) — The returned {@code ExperimentCollection} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-listloggedmodels"></a>`listLoggedModels`
(Preview) Returns a list of logged models.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `listLoggedModelsDetails` (`com.oracle.aidataplatform.dp.model.ListLoggedModelsDetails`) — Details of logged models to fetch.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listLoggedModelsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `loggedModelCollection` (`com.oracle.aidataplatform.dp.model.LoggedModelCollection`) — The returned {@code LoggedModelCollection} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-listmodeldeploymentactivities"></a>`listModelDeploymentActivities`
(Preview) Returns the activity history for a model deployment.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `listModelDeploymentActivitiesDetails` (`com.oracle.aidataplatform.dp.model.ListModelDeploymentActivitiesDetails`) — Filters and pagination for the activity search.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listModelDeploymentActivitiesResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `modelDeploymentActivitySummaryCollection` (`com.oracle.aidataplatform.dp.model.ModelDeploymentActivitySummaryCollection`) — The returned {@code ModelDeploymentActivitySummaryCollection} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-listmodelversions"></a>`listModelVersions`
(Preview) Returns a list of model versions.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `filter` (`String`) — String filter condition, like "name LIKE 'my-model-name'". Single boolean condition, with string values wrapped in single quotes.
- `maxResults` (`Long`) — Maximum number of model versions to retrieve.
- `pageToken` (`String`) — Pagination token to go to the next page based on a previous search query.
- `orderBy` (`String`) — List of columns to be ordered by including model name, version, stage with an optional "DESC" or "ASC" annotation, where "ASC" is the default. Tiebreaks are done by latest stage transition timestamp, followed by name ASC, followed by version DESC.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listModelVersionsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `modelVersionCollection` (`com.oracle.aidataplatform.dp.model.ModelVersionCollection`) — The returned {@code ModelVersionCollection} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-listregisteredmodels"></a>`listRegisteredModels`
(Preview) Returns a list of registered models in a workspace.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `filter` (`String`) — String filter condition, like "name LIKE 'my-model-name'". Interpreted in the backend automatically as "name LIKE '%my-model-name%'". Single boolean condition, with string values wrapped in single quotes.
- `maxResults` (`Long`) — Maximum number of models desired. Default is 100. Max threshold is 1000.
- `pageToken` (`String`) — Pagination token to go to the next page based on a previous search query.
- `orderBy` (`String`) — List of columns for ordering search results, which can include model name and last updated timestamp with an optional "DESC" or "ASC" annotation, where "ASC" is the default. Tiebreaks are done by model name ASC.
- `isDeploymentSummaryEnabled` (`Boolean`) — Whether to include the per-model deployment_summary (total_deployment and active_deployment) in each returned registered model. The summary is omitted from a model when it cannot be resolved, so an absent summary means "not requested or unavailable" rather than zero.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listRegisteredModelsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `registeredModelCollection` (`com.oracle.aidataplatform.dp.model.RegisteredModelCollection`) — The returned {@code RegisteredModelCollection} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-logexperimentrunbatch"></a>`logExperimentRunBatch`
(Preview) Logs an experiment run batch.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `logExperimentRunBatchDetails` (`com.oracle.aidataplatform.dp.model.LogExperimentRunBatchDetails`) — Details of an experiment run batch.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `logExperimentRunBatchResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `logExperimentRunBatchResponseDetails` (`com.oracle.aidataplatform.dp.model.LogExperimentRunBatchResponseDetails`) — The returned {@code LogExperimentRunBatchResponseDetails} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-logexperimentruninputs"></a>`logExperimentRunInputs`
(Preview) Logs experiment run inputs.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `logExperimentRunInputsDetails` (`com.oracle.aidataplatform.dp.model.LogExperimentRunInputsDetails`) — Details of experiment run inputs.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `logExperimentRunInputsResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `logExperimentRunInputsResponseDetails` (`com.oracle.aidataplatform.dp.model.LogExperimentRunInputsResponseDetails`) — The returned {@code LogExperimentRunInputsResponseDetails} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-logexperimentrunmetric"></a>`logExperimentRunMetric`
(Preview) Logs an experiment run metric.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `logExperimentRunMetricDetails` (`com.oracle.aidataplatform.dp.model.LogExperimentRunMetricDetails`) — Details of an experiment run metric.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `logExperimentRunMetricResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `logExperimentRunMetricResponseDetails` (`com.oracle.aidataplatform.dp.model.LogExperimentRunMetricResponseDetails`) — The returned {@code LogExperimentRunMetricResponseDetails} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-logexperimentrunmodel"></a>`logExperimentRunModel`
(Preview) Logs an experiment run model.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `logExperimentRunModelDetails` (`com.oracle.aidataplatform.dp.model.LogExperimentRunModelDetails`) — Details of an experiment run model.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `logExperimentRunModelResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `logExperimentRunModelResponseDetails` (`com.oracle.aidataplatform.dp.model.LogExperimentRunModelResponseDetails`) — The returned {@code LogExperimentRunModelResponseDetails} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-logexperimentrunparam"></a>`logExperimentRunParam`
(Preview) Logs an experiment run parameter.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `logExperimentRunParamDetails` (`com.oracle.aidataplatform.dp.model.LogExperimentRunParamDetails`) — Details of an experiment run parameter.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `logExperimentRunParamResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `logExperimentRunParamResponseDetails` (`com.oracle.aidataplatform.dp.model.LogExperimentRunParamResponseDetails`) — The returned {@code LogExperimentRunParamResponseDetails} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-renameregisteredmodel"></a>`renameRegisteredModel`
(Preview) Renames a registered model.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `renameRegisteredModelDetails` (`com.oracle.aidataplatform.dp.model.RenameRegisteredModelDetails`) — Details of a registered model rename.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `renameRegisteredModelResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `renameRegisteredModelResponseDetails` (`com.oracle.aidataplatform.dp.model.RenameRegisteredModelResponseDetails`) — The returned {@code RenameRegisteredModelResponseDetails} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-restoreexperiment"></a>`restoreExperiment`
(Preview) Restores an experiment.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `restoreExperimentDetails` (`com.oracle.aidataplatform.dp.model.RestoreExperimentDetails`) — Restore experiment details.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `restoreExperimentResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `restoreExperimentResponseDetails` (`com.oracle.aidataplatform.dp.model.RestoreExperimentResponseDetails`) — The returned {@code RestoreExperimentResponseDetails} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-restoreexperimentrun"></a>`restoreExperimentRun`
(Preview) Restores an experiment run.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `restoreExperimentRunDetails` (`com.oracle.aidataplatform.dp.model.RestoreExperimentRunDetails`) — Restore experiment run details.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `restoreExperimentRunResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `restoreExperimentRunResponseDetails` (`com.oracle.aidataplatform.dp.model.RestoreExperimentRunResponseDetails`) — The returned {@code RestoreExperimentRunResponseDetails} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-rollbackmodeldeployment"></a>`rollBackModelDeployment`
(Preview) Rolls an active model deployment back to a lower model version of the same registered model.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `rollBackModelDeploymentDetails` (`com.oracle.aidataplatform.dp.model.RollBackModelDeploymentDetails`) — Details for the model deployment roll back.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `rollBackModelDeploymentResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-rollforwardmodeldeployment"></a>`rollForwardModelDeployment`
(Preview) Rolls an active model deployment forward to a higher model version of the same registered model.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `rollForwardModelDeploymentDetails` (`com.oracle.aidataplatform.dp.model.RollForwardModelDeploymentDetails`) — Details for the model deployment roll forward.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `rollForwardModelDeploymentResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-searchmodeldeployments"></a>`searchModelDeployments`
(Preview) Returns a list of model deployments matching the given criteria.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `searchModelDeploymentsDetails` (`com.oracle.aidataplatform.dp.model.SearchModelDeploymentsDetails`) — Filters and pagination for the search.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `searchModelDeploymentsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `modelDeploymentCollection` (`com.oracle.aidataplatform.dp.model.ModelDeploymentCollection`) — The returned {@code ModelDeploymentCollection} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-setexperimentruntag"></a>`setExperimentRunTag`
(Preview) Sets a tag on an experiment run.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `setExperimentRunTagDetails` (`com.oracle.aidataplatform.dp.model.SetExperimentRunTagDetails`) — Tag details to set on an experiment run.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `setExperimentRunTagResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `setExperimentRunTagResponseDetails` (`com.oracle.aidataplatform.dp.model.SetExperimentRunTagResponseDetails`) — The returned {@code SetExperimentRunTagResponseDetails} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-setexperimenttag"></a>`setExperimentTag`
(Preview) Sets a tag on an experiment.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `setExperimentTagDetails` (`com.oracle.aidataplatform.dp.model.SetExperimentTagDetails`) — Tag details to set on an experiment.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `setExperimentTagResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `setExperimentTagResponseDetails` (`com.oracle.aidataplatform.dp.model.SetExperimentTagResponseDetails`) — The returned {@code SetExperimentTagResponseDetails} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-setmodelversiontag"></a>`setModelVersionTag`
(Preview) Sets a tag on a model version.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `setModelVersionTagDetails` (`com.oracle.aidataplatform.dp.model.SetModelVersionTagDetails`) — Details of a model version tag.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `setModelVersionTagResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `setModelVersionTagResponseDetails` (`com.oracle.aidataplatform.dp.model.SetModelVersionTagResponseDetails`) — The returned {@code SetModelVersionTagResponseDetails} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-setregisteredmodeltag"></a>`setRegisteredModelTag`
(Preview) Sets a tag on a registered model.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `setRegisteredModelTagDetails` (`com.oracle.aidataplatform.dp.model.SetRegisteredModelTagDetails`) — Details of a registered model tag.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `setRegisteredModelTagResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `setRegisteredModelTagResponseDetails` (`com.oracle.aidataplatform.dp.model.SetRegisteredModelTagResponseDetails`) — The returned {@code SetRegisteredModelTagResponseDetails} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-transitionmodelversionstage"></a>`transitionModelVersionStage`
(Preview) Transitions a model version stage.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `transitionModelVersionStageDetails` (`com.oracle.aidataplatform.dp.model.TransitionModelVersionStageDetails`) — Details to transition a model version stage.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `transitionModelVersionStageResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `transitionModelVersionStageResponseDetails` (`com.oracle.aidataplatform.dp.model.TransitionModelVersionStageResponseDetails`) — The returned {@code TransitionModelVersionStageResponseDetails} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-updateexperiment"></a>`updateExperiment`
(Preview) Updates an experiment.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `updateExperimentDetails` (`com.oracle.aidataplatform.dp.model.UpdateExperimentDetails`) — Update experiment metadata.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateExperimentResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `updateExperimentResponseDetails` (`com.oracle.aidataplatform.dp.model.UpdateExperimentResponseDetails`) — The returned {@code UpdateExperimentResponseDetails} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-updateexperimentrun"></a>`updateExperimentRun`
(Preview) Updates an experiment run.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `updateExperimentRunDetails` (`com.oracle.aidataplatform.dp.model.UpdateExperimentRunDetails`) — Update experiment run details.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateExperimentRunResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `updateExperimentRunResponseDetails` (`com.oracle.aidataplatform.dp.model.UpdateExperimentRunResponseDetails`) — The returned {@code UpdateExperimentRunResponseDetails} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-updateexperimentruntags"></a>`updateExperimentRunTags`
(Preview) Updates tags on an experiment run.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `updateExperimentRunTagsDetails` (`com.oracle.aidataplatform.dp.model.UpdateExperimentRunTagsDetails`) — Details of ExperimentRun tags.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateExperimentRunTagsResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `updateExperimentRunTagsResponseDetails` (`com.oracle.aidataplatform.dp.model.UpdateExperimentRunTagsResponseDetails`) — The returned {@code UpdateExperimentRunTagsResponseDetails} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-updateexperimenttags"></a>`updateExperimentTags`
(Preview) Updates tags on experiment.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `updateExperimentTagsDetails` (`com.oracle.aidataplatform.dp.model.UpdateExperimentTagsDetails`) — Details of Experiment tags.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateExperimentTagsResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `updateExperimentTagsResponseDetails` (`com.oracle.aidataplatform.dp.model.UpdateExperimentTagsResponseDetails`) — The returned {@code UpdateExperimentTagsResponseDetails} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-updatemodeldeployment"></a>`updateModelDeployment`
(Preview) Updates a model deployment.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `updateModelDeploymentDetails` (`com.oracle.aidataplatform.dp.model.UpdateModelDeploymentDetails`) — Details for the model deployment update.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateModelDeploymentResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `modelDeployment` (`com.oracle.aidataplatform.dp.model.ModelDeployment`) — The returned {@code ModelDeployment} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-updatemodeldeploymenttags"></a>`updateModelDeploymentTags`
(Preview) Updates tags on a model deployment.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `updateModelDeploymentTagsDetails` (`com.oracle.aidataplatform.dp.model.UpdateModelDeploymentTagsDetails`) — Details for the model deployment tags update.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateModelDeploymentTagsResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `updateModelDeploymentTagsResponseDetails` (`com.oracle.aidataplatform.dp.model.UpdateModelDeploymentTagsResponseDetails`) — The returned {@code UpdateModelDeploymentTagsResponseDetails} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-updatemodelversion"></a>`updateModelVersion`
(Preview) Updates a model version

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `updateModelVersionDetails` (`com.oracle.aidataplatform.dp.model.UpdateModelVersionDetails`) — Details to update model version.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateModelVersionResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `updateModelVersionResponseDetails` (`com.oracle.aidataplatform.dp.model.UpdateModelVersionResponseDetails`) — The returned {@code UpdateModelVersionResponseDetails} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-updatemodelversiontags"></a>`updateModelVersionTags`
(Preview) Updates tags on a model version.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `updateModelVersionTagsDetails` (`com.oracle.aidataplatform.dp.model.UpdateModelVersionTagsDetails`) — Details of model version tags to update.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateModelVersionTagsResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `updateModelVersionTagsResponseDetails` (`com.oracle.aidataplatform.dp.model.UpdateModelVersionTagsResponseDetails`) — The returned {@code UpdateModelVersionTagsResponseDetails} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-updateregisteredmodel"></a>`updateRegisteredModel`
(Preview) Updates a registered model with the provided details.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `updateRegisteredModelDetails` (`com.oracle.aidataplatform.dp.model.UpdateRegisteredModelDetails`) — Details to update the registered model.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateRegisteredModelResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `updateRegisteredModelResponseDetails` (`com.oracle.aidataplatform.dp.model.UpdateRegisteredModelResponseDetails`) — The returned {@code UpdateRegisteredModelResponseDetails} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-updateregisteredmodeltags"></a>`updateRegisteredModelTags`
(Preview) Updates tags on a registered model.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `updateRegisteredModelTagsDetails` (`com.oracle.aidataplatform.dp.model.UpdateRegisteredModelTagsDetails`) — Details of registered model tags.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateRegisteredModelTagsResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `updateRegisteredModelTagsResponseDetails` (`com.oracle.aidataplatform.dp.model.UpdateRegisteredModelTagsResponseDetails`) — The returned {@code UpdateRegisteredModelTagsResponseDetails} instance.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


## <a id="notebookclient-client"></a>Notebook (`NotebookClient`)
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

### <a id="notebookclient-createcontent"></a>`createContent`
Creates a new, untitled, empty file or directory, or copies an existing notebook to a specified path. For example, a POST call to /api/contents/path with body containing copy_from set to /path/to/OtherNotebook.ipynb creates a new copy of OtherNotebook at the specified path.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `contentPath` (`String`) — The path to the notebook file.
- `createContentDetails` (`com.oracle.aidataplatform.dp.model.CreateContentDetails`) — Notebook content to create a new notebook.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `datalakeTenantId` (`String`) — The tenant ID header.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createContentResponse`

**Response Fields:**
- `location` (`String`) — URL for the new file.
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcWorkRequestId` (`String`) — The OCID of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `content` (`com.oracle.aidataplatform.dp.model.Content`) — The returned {@code Content} instance.

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)


### <a id="notebookclient-createsession"></a>`createSession`
Creates a new session or returns an existing session if a session for the given path already exists.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `createSessionDetails` (`com.oracle.aidataplatform.dp.model.CreateSessionDetails`) — Details to create a new session.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `datalakeTenantId` (`String`) — The tenant ID header.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createSessionResponse`

**Response Fields:**
- `location` (`String`) — URL for session commands.
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcWorkRequestId` (`String`) — The OCID of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request.
- `session` (`com.oracle.aidataplatform.dp.model.Session`) — The returned {@code Session} instance.

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)


### <a id="notebookclient-deletecontent"></a>`deleteContent`
Deletes a notebook file or directory.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `contentPath` (`String`) — The path to the notebook file.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteContentResponse`

**Response Fields:**
- `location` (`String`) — URL for the deleted file.
- `opcWorkRequestId` (`String`) — The OCID of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)


### <a id="notebookclient-deletesession"></a>`deleteSession`
Delete a session with given session ID.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `sessionId` (`String`) — The ID of the Data Lake Notebook Session

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteSessionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)


### <a id="notebookclient-exportcontents"></a>`exportContents`
Exports the notebook file contents. You can optionally specify HTML or ipynb format through the request payload. If no format is specified, ipynb is used by default.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `contentPath` (`String`) — The path to the notebook file.
- `exportContentsDetails` (`com.oracle.aidataplatform.dp.model.ExportContentsDetails`) — Payload to export contents of a file.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `exportContentsResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `exportedContents` (`com.oracle.aidataplatform.dp.model.ExportedContents`) — The returned {@code ExportedContents} instance.

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)


### <a id="notebookclient-getcontent"></a>`getContent`
Returns content for a given file or metadata for a directory. Directory content listing is not supported; requests with type=directory and content=1 return 400 and should use content=0 to retrieve directory metadata. You can optionally specify a type and/or format argument via URL parameter. When given, the Content service returns a model in the requested type and/or format. If the request cannot be satisfied, for example if type=text is requested, but the file is binary, then the request returns a 400 message and a JSON response with a Reason field identifying the issue. The value of the Reason field is ‘bad format’ or ‘bad type’, depending on what was requested.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `contentPath` (`String`) — The path to the notebook file.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `type` (`Type`) — Content type. Either file, directory, or notebook.
- `format` (`Format`) — The format in which content should be returned. Either text, base64, or JSON.
- `content` (`Integer`) — Returns content based on param value. When set to 0, content is NOT returned. When set to 1, content is returned.
- `hash` (`Integer`) — Returns hash hexdigest string of content and the hash algorithm. 0 for no hash, 1 for return hash. 0 is default. It may be ignored by the content manager.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getContentResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `lastModified` (`java.util.Date`) — Last modified date for file.
- `content` (`com.oracle.aidataplatform.dp.model.Content`) — The returned {@code Content} instance.

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)


### <a id="notebookclient-getsession"></a>`getSession`
Returns session details for a given session ID.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `sessionId` (`String`) — The ID of the Data Lake Notebook Session

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getSessionResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `session` (`com.oracle.aidataplatform.dp.model.Session`) — The returned {@code Session} instance.

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)


### <a id="notebookclient-listsessions"></a>`listSessions`
Returns a list of all available sessions.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace

**Optional Parameters:**
- `clusterId` (`String`) — Cluster ID attached to a session.
- `path` (`String`) — Notebook file path attached to a session.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `agentFlowKey` (`String`) — Agent flow key of the attached agent flow.
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listSessionsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `sessionCollection` (`com.oracle.aidataplatform.dp.model.SessionCollection`) — The returned {@code SessionCollection} instance.

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)


### <a id="notebookclient-modifycontent"></a>`modifyContent`
Renames a file or directory without re-uploading content.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `contentPath` (`String`) — The path to the notebook file.
- `modifyContentDetails` (`com.oracle.aidataplatform.dp.model.ModifyContentDetails`) — New path for file or directory.

**Optional Parameters:**
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `modifyContentResponse`

**Response Fields:**
- `location` (`String`) — Updated URL for the file or directory.
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcWorkRequestId` (`String`) — The OCID of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `content` (`com.oracle.aidataplatform.dp.model.Content`) — The returned {@code Content} instance.

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)


### <a id="notebookclient-patchsession"></a>`patchSession`
Patches a session with a given ID with the provided details. You can use this to rename a session.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `sessionId` (`String`) — The ID of the Data Lake Notebook Session
- `patchSessionDetails` (`com.oracle.aidataplatform.dp.model.PatchSessionDetails`) — Details to patch for an existing session.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `patchSessionResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `session` (`com.oracle.aidataplatform.dp.model.Session`) — The returned {@code Session} instance.

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)


### <a id="notebookclient-updatecontent"></a>`updateContent`
Updates the contents of an existing notebook with the provided details or saves a new notebook.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `contentPath` (`String`) — The path to the notebook file.
- `updateContentDetails` (`com.oracle.aidataplatform.dp.model.UpdateContentDetails`) — Details to update the notebook content model file.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateContentResponse`

**Response Fields:**
- `location` (`String`) — URL for the new file.
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcWorkRequestId` (`String`) — The OCID of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `content` (`com.oracle.aidataplatform.dp.model.Content`) — The returned {@code Content} instance.

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)


## <a id="roleclient-client"></a>Role (`RoleClient`)
**Operations:**
- [`addMemberToRole`](#roleclient-addmembertorole)
- [`createRole`](#roleclient-createrole)
- [`deleteRole`](#roleclient-deleterole)
- [`getRole`](#roleclient-getrole)
- [`listRolePermissions`](#roleclient-listrolepermissions)
- [`listRoles`](#roleclient-listroles)
- [`removeMemberFromRole`](#roleclient-removememberfromrole)
- [`updateRole`](#roleclient-updaterole)

### <a id="roleclient-addmembertorole"></a>`addMemberToRole`
Assigns a given user/group/principal to a role.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `roleKey` (`String`) — The unique key of the Role.
- `addMemberToRoleDetails` (`com.oracle.aidataplatform.dp.model.AddMemberToRoleDetails`) — The details of the assignee(s) to which a role is assigned.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `addMemberToRoleResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Role (`RoleClient`)](#roleclient-client) • [Top](#top)


### <a id="roleclient-createrole"></a>`createRole`
Creates a role.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `createRoleDetails` (`com.oracle.aidataplatform.dp.model.CreateRoleDetails`) — Details for the new role.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createRoleResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `role` (`com.oracle.aidataplatform.dp.model.Role`) — The returned {@code Role} instance.

**Return:** [Back to Role (`RoleClient`)](#roleclient-client) • [Top](#top)


### <a id="roleclient-deleterole"></a>`deleteRole`
Deletes a role.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `roleKey` (`String`) — The unique key of the Role.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteRoleResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Role (`RoleClient`)](#roleclient-client) • [Top](#top)


### <a id="roleclient-getrole"></a>`getRole`
Returns detailed information about a role.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `roleKey` (`String`) — The unique key of the Role.

**Optional Parameters:**
- `roleScope` (`com.oracle.aidataplatform.dp.model.GetRoleScopeType`) — The scope of roles to be returned. Defaults to USER.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getRoleResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `role` (`com.oracle.aidataplatform.dp.model.Role`) — The returned {@code Role} instance.

**Return:** [Back to Role (`RoleClient`)](#roleclient-client) • [Top](#top)


### <a id="roleclient-listrolepermissions"></a>`listRolePermissions`
Returns a list of permissions for a given role.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `roleKey` (`String`) — The unique key of the Role.

**Optional Parameters:**
- `permissionScope` (`com.oracle.aidataplatform.dp.model.ListRolePermissionScopeType`) — The scope of role permissions to be returned. Defaults to ALL
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listRolePermissionsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `rolePermissionCollection` (`com.oracle.aidataplatform.dp.model.RolePermissionCollection`) — The returned {@code RolePermissionCollection} instance.

**Return:** [Back to Role (`RoleClient`)](#roleclient-client) • [Top](#top)


### <a id="roleclient-listroles"></a>`listRoles`
Returns a list of roles.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `lifecycleState` (`com.oracle.aidataplatform.dp.model.Role.LifecycleState`) — A filter to return only resources that match the given lifecycle state. The state value is case-insensitive.
- `displayName` (`String`) — A filter to return only resources that match the given display name exactly.
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listRolesResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `roleCollection` (`com.oracle.aidataplatform.dp.model.RoleCollection`) — The returned {@code RoleCollection} instance.

**Return:** [Back to Role (`RoleClient`)](#roleclient-client) • [Top](#top)


### <a id="roleclient-removememberfromrole"></a>`removeMemberFromRole`
Revoke a role from a given user or group.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `roleKey` (`String`) — The unique key of the Role.
- `removeMemberFromRoleDetails` (`com.oracle.aidataplatform.dp.model.RemoveMemberFromRoleDetails`) — The details of the user or group from which the role is to be revoked.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `removeMemberFromRoleResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Role (`RoleClient`)](#roleclient-client) • [Top](#top)


### <a id="roleclient-updaterole"></a>`updateRole`
Updates a role with the provided information.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `roleKey` (`String`) — The unique key of the Role.
- `updateRoleDetails` (`com.oracle.aidataplatform.dp.model.UpdateRoleDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateRoleResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `role` (`com.oracle.aidataplatform.dp.model.Role`) — The returned {@code Role} instance.

**Return:** [Back to Role (`RoleClient`)](#roleclient-client) • [Top](#top)


## <a id="schemaclient-client"></a>Schema (`SchemaClient`)
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

### <a id="schemaclient-createdatatable"></a>`createDataTable`
Creates a managed table with data loaded from a sample file.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `createDataTableDetails` (`com.oracle.aidataplatform.dp.model.CreateDataTableDetails`) — Details for the new managed table with data.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createDataTableResponse`

**Response Fields:**
- `opcWorkRequestId` (`String`) — The OCID of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-createschema"></a>`createSchema`
Creates a schema.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `createSchemaDetails` (`com.oracle.aidataplatform.dp.model.CreateSchemaDetails`) — Details for the new schema.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createSchemaResponse`

**Response Fields:**
- `location` (`String`) — URL for the created schema. The schema key is generated after this request is sent.
- `contentLocation` (`String`) — Same as location.
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-createtable"></a>`createTable`
Creates a table.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `createTableDetails` (`com.oracle.aidataplatform.dp.model.CreateTableDetails`) — Details for the new table.

**Optional Parameters:**
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createTableResponse`

**Response Fields:**
- `location` (`String`) — URL for the created Table. The table key is generated after this request is sent.
- `contentLocation` (`String`) — Same as location.
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-createview"></a>`createView`
Creates a view.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `createViewDetails` (`com.oracle.aidataplatform.dp.model.CreateViewDetails`) — Details for the new view.

**Optional Parameters:**
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createViewResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `view` (`com.oracle.aidataplatform.dp.model.View`) — The returned {@code View} instance.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-deleteschema"></a>`deleteSchema`
Deletes a schema.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `schemaKey` (`String`) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.

**Optional Parameters:**
- `isForced` (`Boolean`) — A boolean which decides if an entity should be deleted with Cascade effect
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteSchemaResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-deletetable"></a>`deleteTable`
Deletes a table.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `tableKey` (`String`) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.

**Optional Parameters:**
- `displayName` (`String`) — A filter to return only resources that match the given display name exactly.
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteTableResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-deleteview"></a>`deleteView`
Deletes a view.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `viewKey` (`String`) — The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>.

**Optional Parameters:**
- `displayName` (`String`) — A filter to return only resources that match the given display name exactly.
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteViewResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-generatetempfileuploadtarget"></a>`generateTempFileUploadTarget`
Generates a URI for uploading a sample file to a temporary folder in a schema.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `schemaKey` (`String`) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `generateTempFileUploadTargetResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `generateTempFileUploadTargetResponseDetails` (`com.oracle.aidataplatform.dp.model.GenerateTempFileUploadTargetResponseDetails`) — The returned {@code GenerateTempFileUploadTargetResponseDetails} instance.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-getschema"></a>`getSchema`
Returns detailed information about a specified schema.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `schemaKey` (`String`) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.

**Optional Parameters:**
- `shouldSkipOcidTranslation` (`Boolean`) — When true, skip user OCID translation and return raw OCIDs.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getSchemaResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `schema` (`com.oracle.aidataplatform.dp.model.Schema`) — The returned {@code Schema} instance.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-gettable"></a>`getTable`
Returns detailed information about a table.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `tableKey` (`String`) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.

**Optional Parameters:**
- `shouldSkipOcidTranslation` (`Boolean`) — When true, skip user OCID translation and return raw OCIDs.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getTableResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `table` (`com.oracle.aidataplatform.dp.model.Table`) — The returned {@code Table} instance.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-getview"></a>`getView`
Returns information about a view.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `viewKey` (`String`) — The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getViewResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `view` (`com.oracle.aidataplatform.dp.model.View`) — The returned {@code View} instance.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-listschemapermissions"></a>`listSchemaPermissions`
Returns a list of permissions for a given schema.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `schemaKey` (`String`) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.

**Optional Parameters:**
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listSchemaPermissionsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `schemaPermissionCollection` (`com.oracle.aidataplatform.dp.model.SchemaPermissionCollection`) — The returned {@code SchemaPermissionCollection} instance.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-listschemas"></a>`listSchemas`
Returns a list of schemas.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `catalogKey` (`String`) — The key of the catalog.

**Optional Parameters:**
- `shouldSkipOcidTranslation` (`Boolean`) — When true, skip user OCID translation and return raw OCIDs.
- `displayName` (`String`) — A filter to return only resources that match the given display name exactly.
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listSchemasResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `schemaCollection` (`com.oracle.aidataplatform.dp.model.SchemaCollection`) — The returned {@code SchemaCollection} instance.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-listtablepermissions"></a>`listTablePermissions`
Returns a list of permissions for a given table.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `tableKey` (`String`) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.

**Optional Parameters:**
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listTablePermissionsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `tablePermissionCollection` (`com.oracle.aidataplatform.dp.model.TablePermissionCollection`) — The returned {@code TablePermissionCollection} instance.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-listtables"></a>`listTables`
Returns a list of tables in a schema.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `catalogKey` (`String`) — The key of the catalog.
- `schemaKey` (`String`) — The fully qualified name of the Data Lake Schema in the format <catalog_name>.<schema_name>

**Optional Parameters:**
- `shouldSkipOcidTranslation` (`Boolean`) — When true, skip user OCID translation and return raw OCIDs.
- `displayName` (`String`) — A filter to return only resources that match the given display name exactly.
- `tableType` (`com.oracle.aidataplatform.dp.model.TableType`) — Filters the response by table type. When omitted, existing ListTables behavior is preserved.
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listTablesResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `tableCollection` (`com.oracle.aidataplatform.dp.model.TableCollection`) — The returned {@code TableCollection} instance.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-listviewpermissions"></a>`listViewPermissions`
Returns a list of view permissions.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `viewKey` (`String`) — The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>.

**Optional Parameters:**
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listViewPermissionsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `viewPermissionCollection` (`com.oracle.aidataplatform.dp.model.ViewPermissionCollection`) — The returned {@code ViewPermissionCollection} instance.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-listviews"></a>`listViews`
Returns a list of views in a schema.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `catalogKey` (`String`) — The key of the catalog.
- `schemaKey` (`String`) — The fully qualified name of the Data Lake Schema in the format <catalog_name>.<schema_name>

**Optional Parameters:**
- `displayName` (`String`) — A filter to return only resources that match the given display name exactly.
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listViewsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `viewCollection` (`com.oracle.aidataplatform.dp.model.ViewCollection`) — The returned {@code ViewCollection} instance.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-manageschemapermission"></a>`manageSchemaPermission`
Updates the permissions for a given schema.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `schemaKey` (`String`) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.
- `manageSchemaPermissionDetails` (`com.oracle.aidataplatform.dp.model.ManageSchemaPermissionDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageSchemaPermissionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-managetablepermission"></a>`manageTablePermission`
Updates the permissions for a given table.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `tableKey` (`String`) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.
- `manageTablePermissionDetails` (`com.oracle.aidataplatform.dp.model.ManageTablePermissionDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageTablePermissionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-manageviewpermission"></a>`manageViewPermission`
Updates permissions on a view.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `viewKey` (`String`) — The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>.
- `manageViewPermissionDetails` (`com.oracle.aidataplatform.dp.model.ManageViewPermissionDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageViewPermissionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-performinferschema"></a>`performInferSchema`
Returns details of a table schema from the specified location.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `schemaKey` (`String`) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.
- `performInferSchemaDetails` (`com.oracle.aidataplatform.dp.model.PerformInferSchemaDetails`) — Details of the location from which the table schema can be inferred.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `performInferSchemaResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `inferSchema` (`com.oracle.aidataplatform.dp.model.InferSchema`) — The returned {@code InferSchema} instance.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-performinferschemawithpreview"></a>`performInferSchemaWithPreview`
Returns table schema and data from the specified location.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `schemaKey` (`String`) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.
- `performInferSchemaDetails` (`com.oracle.aidataplatform.dp.model.PerformInferSchemaDetails`) — Details of the location from which the table schema and data can be inferred.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `performInferSchemaWithPreviewResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `inferSchemaWithPreview` (`com.oracle.aidataplatform.dp.model.InferSchemaWithPreview`) — The returned {@code InferSchemaWithPreview} instance.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-refreshschema"></a>`refreshSchema`
Refreshes schema through the crawler.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `schemaKey` (`String`) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `refreshSchemaResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-refreshtable"></a>`refreshTable`
Refreshes a table through the crawler.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `tableKey` (`String`) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `refreshTableResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-retrievepar"></a>`retrievePar`
Retrieves PAR for the entities created.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `tableKey` (`String`) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `retrieveParResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `parDetails` (`com.oracle.aidataplatform.dp.model.ParDetails`) — The returned {@code ParDetails} instance.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-updateschema"></a>`updateSchema`
Updates a schema.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `schemaKey` (`String`) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.
- `updateSchemaDetails` (`com.oracle.aidataplatform.dp.model.UpdateSchemaDetails`) — The information to be updated.

**Optional Parameters:**
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateSchemaResponse`

**Response Fields:**
- `opcWorkRequestId` (`String`) — The OCID of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `schema` (`com.oracle.aidataplatform.dp.model.Schema`) — The returned {@code Schema} instance.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-updatetable"></a>`updateTable`
Updates a table with provided details.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `tableKey` (`String`) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.
- `updateTableDetails` (`com.oracle.aidataplatform.dp.model.UpdateTableDetails`) — The information to be updated.

**Optional Parameters:**
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateTableResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-updateview"></a>`updateView`
Updates a view with given information.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `viewKey` (`String`) — The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>.
- `updateViewDetails` (`com.oracle.aidataplatform.dp.model.UpdateViewDetails`) — The update mode and information to be updated.

**Optional Parameters:**
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateViewResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `view` (`com.oracle.aidataplatform.dp.model.View`) — The returned {@code View} instance.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


## <a id="usersettingclient-client"></a>User Setting (`UserSettingClient`)
**Operations:**
- [`createUserSetting`](#usersettingclient-createusersetting)
- [`deleteUserSetting`](#usersettingclient-deleteusersetting)
- [`getUserSetting`](#usersettingclient-getusersetting)
- [`listUserSettings`](#usersettingclient-listusersettings)
- [`updateUserSetting`](#usersettingclient-updateusersetting)

### <a id="usersettingclient-createusersetting"></a>`createUserSetting`
(Preview) The User Settings API allows you to manage user-specific configurations and credentials within an AI Data Platform instance. What you can do -> Store user credentials and integrations, including: -> IAM user credentials -> Git account configurations (e.g., GitHub PAT) -> Create and manage multiple settings -> Mark a setting as default for a given type -> Retrieve and filter settings by type or default status Supported setting types -> IAM_USER_CREDENTIAL – OCI user credentials for API access -> GIT_ACCOUNT – Git provider configuration (e.g., GitHub personal access token) Core operations -> Create a user setting -> List all user settings (with filtering and pagination) -> Get a specific setting by key -> Update an existing setting -> Delete a setting

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `createUserSettingDetails` (`com.oracle.aidataplatform.dp.model.CreateUserSettingDetails`) — Details for the new setting.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createUserSettingResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `userSetting` (`com.oracle.aidataplatform.dp.model.UserSetting`) — The returned {@code UserSetting} instance.

**Return:** [Back to User Setting (`UserSettingClient`)](#usersettingclient-client) • [Top](#top)


### <a id="usersettingclient-deleteusersetting"></a>`deleteUserSetting`
(Preview) Deletes a user setting and its credentials from this AI Data Platform instance, freeing the default slot for that type.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `settingKey` (`String`) — The UUID of the user setting.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteUserSettingResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to User Setting (`UserSettingClient`)](#usersettingclient-client) • [Top](#top)


### <a id="usersettingclient-getusersetting"></a>`getUserSetting`
(Preview) Returns the full definition of user settings identified by its key, including type-specific payload and default flag.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `settingKey` (`String`) — The UUID of the user setting.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getUserSettingResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `userSetting` (`com.oracle.aidataplatform.dp.model.UserSetting`) — The returned {@code UserSetting} instance.

**Return:** [Back to User Setting (`UserSettingClient`)](#usersettingclient-client) • [Top](#top)


### <a id="usersettingclient-listusersettings"></a>`listUserSettings`
(Preview) Returns a list of all user-specific configurations, with filters for setting type, default flag, and pagination when needed.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `settingType` (`SettingType`) — A filter to return only those settings whose value matches the given data type.
- `isDefault` (`Boolean`) — A filter to return only resources that are default.
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `displayName` (`String`) — A filter to return only resources that match the given display name exactly.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listUserSettingsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `userSettingCollection` (`com.oracle.aidataplatform.dp.model.UserSettingCollection`) — The returned {@code UserSettingCollection} instance.

**Return:** [Back to User Setting (`UserSettingClient`)](#usersettingclient-client) • [Top](#top)


### <a id="usersettingclient-updateusersetting"></a>`updateUserSetting`
(Preview) Updates the metadata or payload of an existing user setting, letting you rotate credentials or change defaults.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `settingKey` (`String`) — The UUID of the user setting.
- `updateUserSettingDetails` (`com.oracle.aidataplatform.dp.model.UpdateUserSettingDetails`) — Details for the user setting to be updated.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateUserSettingResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `userSetting` (`com.oracle.aidataplatform.dp.model.UserSetting`) — The returned {@code UserSetting} instance.

**Return:** [Back to User Setting (`UserSettingClient`)](#usersettingclient-client) • [Top](#top)


## <a id="volumeclient-client"></a>Volume (`VolumeClient`)
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
- [`uploadAndExtractVolumeZip`](#volumeclient-uploadandextractvolumezip)
- [`uploadFile`](#volumeclient-uploadfile)
- [`uploadFileWithPar`](#volumeclient-uploadfilewithpar)
- [`zipAndDownloadVolumeFolder`](#volumeclient-zipanddownloadvolumefolder)

### <a id="volumeclient-createvolume"></a>`createVolume`
Creates a volume.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `createVolumeDetails` (`com.oracle.aidataplatform.dp.model.CreateVolumeDetails`) — Details for the new volume.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createVolumeResponse`

**Response Fields:**
- `location` (`String`) — URL for the created volume. The volume key is generated after this request is sent.
- `contentLocation` (`String`) — Same as location.
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcWorkRequestId` (`String`) — The OCID of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `volume` (`com.oracle.aidataplatform.dp.model.Volume`) — The returned {@code Volume} instance.

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-deletedir"></a>`deleteDir`
Deletes a directory in a volume.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `volumeKey` (`String`) — The key of the volume.
- `path` (`String`) — The absolute path of the file or folder

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteDirResponse`

**Response Fields:**
- `opcWorkRequestId` (`String`) — The OCID of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-deletefile"></a>`deleteFile`
Deletes a file or folder in a volume.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `volumeKey` (`String`) — The key of the volume.
- `path` (`String`) — The absolute path of the file or folder

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteFileResponse`

**Response Fields:**
- `opcWorkRequestId` (`String`) — The OCID of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-deletevolume"></a>`deleteVolume`
Deletes a volume.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `volumeKey` (`String`) — The key of the volume.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteVolumeResponse`

**Response Fields:**
- `opcWorkRequestId` (`String`) — The OCID of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-downloadfile"></a>`downloadFile`
Downloads a file from a volume.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `volumeKey` (`String`) — The key of the volume.
- `path` (`String`) — The absolute path of the file or folder

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `downloadFileResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `inputStream` (`java.io.InputStream`) — The returned {@code java.io.InputStream} instance.

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-downloadfilewithpar"></a>`downloadFileWithPar`
provide the par info for downloading the file for given path.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `volumeKey` (`String`) — The key of the volume.
- `path` (`String`) — The absolute path of the file or folder

**Optional Parameters:**
- `shouldGenerateNewPar` (`Boolean`) — Flag to toggle to generate short living par
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `downloadFileWithParResponse`

**Response Fields:**
- `location` (`String`) — URL for the uploaded volume file.
- `contentLocation` (`String`) — Same as location.
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `downloadFileWithParResult` (`com.oracle.aidataplatform.dp.model.DownloadFileWithParResult`) — The returned {@code DownloadFileWithParResult} instance.

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-getvolume"></a>`getVolume`
Returns detailed information about a volume.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `volumeKey` (`String`) — The key of the volume.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getVolumeResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `volume` (`com.oracle.aidataplatform.dp.model.Volume`) — The returned {@code Volume} instance.

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-listfiles"></a>`listFiles`
Returns a list of files in a volume.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `volumeKey` (`String`) — The key of the volume.
- `path` (`String`) — The absolute path of the file or folder

**Optional Parameters:**
- `isRecursive` (`Boolean`) — A boolean which decides if nested files should be in the list files in volume response.
- `displayName` (`String`) — A filter to return only resources that match the given display name exactly.
- `metadataKeys` (`String`) — Comma separated keys to have in list response.
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listFilesResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `volumeFileCollection` (`com.oracle.aidataplatform.dp.model.VolumeFileCollection`) — The returned {@code VolumeFileCollection} instance.

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-listvolumepermissions"></a>`listVolumePermissions`
Returns a list of volume permissions.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `volumeKey` (`String`) — The key of the volume.

**Optional Parameters:**
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listVolumePermissionsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `volumePermissionCollection` (`com.oracle.aidataplatform.dp.model.VolumePermissionCollection`) — The returned {@code VolumePermissionCollection} instance.

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-listvolumes"></a>`listVolumes`
Returns a list of volumes.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `catalogKey` (`String`) — The key of the catalog.
- `schemaKey` (`String`) — The fully qualified name of the Data Lake Schema in the format <catalog_name>.<schema_name>

**Optional Parameters:**
- `displayName` (`String`) — A filter to return only resources that match the given display name exactly.
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listVolumesResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `volumeCollection` (`com.oracle.aidataplatform.dp.model.VolumeCollection`) — The returned {@code VolumeCollection} instance.

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-makedir"></a>`makeDir`
Creates a directory in a volume.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `volumeKey` (`String`) — The key of the volume.
- `path` (`String`) — The absolute path of the file or folder

**Optional Parameters:**
- `description` (`String`) — The description of the folder.
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `makeDirResponse`

**Response Fields:**
- `location` (`String`) — URL for the created folder.
- `contentLocation` (`String`) — Same as location.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-managevolumepermission"></a>`manageVolumePermission`
Updates the permissions on a volume.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `volumeKey` (`String`) — The key of the volume.
- `manageVolumePermissionDetails` (`com.oracle.aidataplatform.dp.model.ManageVolumePermissionDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageVolumePermissionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-updatedir"></a>`updateDir`
Updates a directory in volume with the provided information.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `volumeKey` (`String`) — The key of the volume.
- `updateDirDetails` (`com.oracle.aidataplatform.dp.model.UpdateDirDetails`) — The information to be updated.
- `path` (`String`) — The absolute path of the file or folder

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateDirResponse`

**Response Fields:**
- `location` (`String`) — URL for the deleted folder.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcWorkRequestId` (`String`) — The OCID of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request.

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-updatevolume"></a>`updateVolume`
Updates a volume with the provided information.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `volumeKey` (`String`) — The key of the volume.
- `updateVolumeDetails` (`com.oracle.aidataplatform.dp.model.UpdateVolumeDetails`) — The information to be updated.

**Optional Parameters:**
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateVolumeResponse`

**Response Fields:**
- `opcWorkRequestId` (`String`) — The OCID of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `volume` (`com.oracle.aidataplatform.dp.model.Volume`) — The returned {@code Volume} instance.

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-uploadandextractvolumezip"></a>`uploadAndExtractVolumeZip`
Creates or updates an asynchronous volume ZIP upload and extraction operation. CREATE returns a PAR URL for uploading the ZIP bytes and an async operation key. UPDATE records the uploaded ZIP metadata so extraction can continue.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `volumeKey` (`String`) — The key of the volume.
- `uploadAndExtractZipDetails` (`com.oracle.aidataplatform.dp.model.UploadAndExtractZipDetails`) — Details for uploading and extracting the volume ZIP file.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `uploadAndExtractVolumeZipResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `uploadAndExtractZipResult` (`com.oracle.aidataplatform.dp.model.UploadAndExtractZipResult`) — The returned {@code UploadAndExtractZipResult} instance.

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-uploadfile"></a>`uploadFile`
Uploads a file to volume. If the file already exists, it is updated.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `volumeKey` (`String`) — The key of the volume.
- `uploadFileDetails` (`java.io.InputStream`) — Contents of the file to upload.
- `path` (`String`) — The absolute path of the file or folder

**Optional Parameters:**
- `isOverwrite` (`Boolean`) — A boolean which decides if overwrite is allowed
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `isUploadFileBase64Encoded` (`Boolean`) — A flag to identify if the upload file is base64 encoded
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `uploadFileResponse`

**Response Fields:**
- `location` (`String`) — URL for the uploaded volume file.
- `contentLocation` (`String`) — Same as location.
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-uploadfilewithpar"></a>`uploadFileWithPar`
Uploads a volume file by generating PAR. If file exists, then it will be updated.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `volumeKey` (`String`) — The key of the volume.
- `uploadFileWithParDetails` (`com.oracle.aidataplatform.dp.model.UploadFileWithParDetails`) — Contents of the file to upload.
- `path` (`String`) — The absolute path of the file or folder

**Optional Parameters:**
- `isOverwrite` (`Boolean`) — A boolean which decides if overwrite is allowed
- `shouldGenerateNewPar` (`Boolean`) — Flag to toggle to generate short living par
- `shouldCreateRecursively` (`Boolean`) — A boolean which decides if parent directories should be created recursively during upload.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `uploadFileWithParResponse`

**Response Fields:**
- `location` (`String`) — URL for the uploaded volume file.
- `contentLocation` (`String`) — Same as location.
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `uploadFileWithParResult` (`com.oracle.aidataplatform.dp.model.UploadFileWithParResult`) — The returned {@code UploadFileWithParResult} instance.

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-zipanddownloadvolumefolder"></a>`zipAndDownloadVolumeFolder`
Starts asynchronous creation of a ZIP archive for a volume folder. The response includes a PAR URL for downloading the archive after the operation succeeds.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `volumeKey` (`String`) — The key of the volume.
- `zipAndDownloadFolderDetails` (`com.oracle.aidataplatform.dp.model.ZipAndDownloadFolderDetails`) — Details for zipping a volume folder for download.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `zipAndDownloadVolumeFolderResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `zipAndDownloadFolderResult` (`com.oracle.aidataplatform.dp.model.ZipAndDownloadFolderResult`) — The returned {@code ZipAndDownloadFolderResult} instance.

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


## <a id="workflowclient-client"></a>Workflow (`WorkflowClient`)
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
- [`listTaskRunRetries`](#workflowclient-listtaskrunretries)
- [`listTaskRuns`](#workflowclient-listtaskruns)
- [`manageJobPermission`](#workflowclient-managejobpermission)
- [`repairJobRun`](#workflowclient-repairjobrun)
- [`updateJob`](#workflowclient-updatejob)

### <a id="workflowclient-canceljobrun"></a>`cancelJobRun`
Cancels a job run.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `jobRunKey` (`String`) — Job run key.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `cancelJobRunResponse`

**Response Fields:**
- `location` (`String`) — URL for the created job run. The job run key is generated after this request is sent.
- `contentLocation` (`String`) — Same as location.
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcWorkRequestId` (`String`) — The OCID of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `jobRun` (`com.oracle.aidataplatform.dp.model.JobRun`) — The returned {@code JobRun} instance.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-canceljobruns"></a>`cancelJobRuns`
Cancels all job runs for a given job.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `jobKey` (`String`) — Job key.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `cancelJobRunsResponse`

**Response Fields:**
- `opcWorkRequestId` (`String`) — The OCID of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-createjob"></a>`createJob`
Creates a job.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `createJobDetails` (`com.oracle.aidataplatform.dp.model.CreateJobDetails`) — Details for the new job.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createJobResponse`

**Response Fields:**
- `location` (`String`) — URL for the created job. The job key is generated after this request is sent.
- `contentLocation` (`String`) — Same as location.
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcWorkRequestId` (`String`) — The OCID of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `job` (`com.oracle.aidataplatform.dp.model.Job`) — The returned {@code Job} instance.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-createjobrun"></a>`createJobRun`
Creates a job run.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `createJobRunDetails` (`com.oracle.aidataplatform.dp.model.CreateJobRunDetails`) — Details for the new job run.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createJobRunResponse`

**Response Fields:**
- `location` (`String`) — URL for the created job run. The job run key is generated after this request is sent.
- `contentLocation` (`String`) — Same as location.
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcWorkRequestId` (`String`) — The OCID of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `jobRun` (`com.oracle.aidataplatform.dp.model.JobRun`) — The returned {@code JobRun} instance.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-deletejob"></a>`deleteJob`
Deletes a job.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `jobKey` (`String`) — Job key.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteJobResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-deletejobrun"></a>`deleteJobRun`
Deletes a job run.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `jobRunKey` (`String`) — Job run key.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteJobRunResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-exporttaskrunoutput"></a>`exportTaskRunOutput`
Exports task run output in HTML or ipynb format.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `taskRunKey` (`String`) — Task run key.
- `taskRunOutputKey` (`String`) — Task run output key.
- `exportTaskRunOutputDetails` (`com.oracle.aidataplatform.dp.model.ExportTaskRunOutputDetails`) — Payload to export task run output to a file.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `exportTaskRunOutputResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `exportedTaskRunOutputContents` (`com.oracle.aidataplatform.dp.model.ExportedTaskRunOutputContents`) — The returned {@code ExportedTaskRunOutputContents} instance.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-fetchoutput"></a>`fetchOutput`
Fetches the task run output from the runtime engine.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `taskRunKey` (`String`) — Task run key.
- `fetchOutputDetails` (`com.oracle.aidataplatform.dp.model.FetchOutputDetails`) — Details for task run output retrieval.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `fetchOutputResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `taskRunOutput` (`com.oracle.aidataplatform.dp.model.TaskRunOutput`) — The returned {@code TaskRunOutput} instance.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-getjob"></a>`getJob`
Returns detailed information about a given job.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `jobKey` (`String`) — Job key.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getJobResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `job` (`com.oracle.aidataplatform.dp.model.Job`) — The returned {@code Job} instance.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-getjobrun"></a>`getJobRun`
Returns detailed information about a given job run.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `jobRunKey` (`String`) — Job run key.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldIncludeTaskRunSummaries` (`Boolean`) — A flag to identify if task run summaries should be included in the job run response. If omitted, the service applies its configured default behavior.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getJobRunResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `jobRun` (`com.oracle.aidataplatform.dp.model.JobRun`) — The returned {@code JobRun} instance.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-gettaskrun"></a>`getTaskRun`
Returns detailed information about a task run with a given task run key.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `taskRunKey` (`String`) — Task run key.

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldIncludeTaskRunRetries` (`Boolean`) — Indicates whether a get task run response should include task run retries.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getTaskRunResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `taskRun` (`com.oracle.aidataplatform.dp.model.TaskRun`) — The returned {@code TaskRun} instance.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-listjobpermissions"></a>`listJobPermissions`
Returns a list of job permissions.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `jobKey` (`String`) — Job key.

**Optional Parameters:**
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listJobPermissionsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `jobPermissionCollection` (`com.oracle.aidataplatform.dp.model.JobPermissionCollection`) — The returned {@code JobPermissionCollection} instance.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-listjobruns"></a>`listJobRuns`
Returns a detailed list of job runs.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace

**Optional Parameters:**
- `displayName` (`String`) — A filter to return only resources that match the given display name exactly.
- `jobKey` (`java.util.List<String>`) — The field to filter based on job key.
- `status` (`java.util.List<Status>`) — The field to filter based on state.
- `timeCreatedGreaterThanOrEqualTo` (`java.util.Date`) — Fetch objects from repository that were created after or at the exact timestamp provided in parameter
- `timeCreatedLessThanOrEqualTo` (`java.util.Date`) — Fetch objects from repository that were created before or at the exact timestamp provided in parameter.
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated List call.
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listJobRunsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `opcPrevPage` (`String`) — For list pagination. When this header appears in the response, previous pages of results remain.
- `jobRunCollection` (`com.oracle.aidataplatform.dp.model.JobRunCollection`) — The returned {@code JobRunCollection} instance.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-listjobs"></a>`listJobs`
Returns a list of jobs.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace

**Optional Parameters:**
- `displayName` (`String`) — A filter to return only resources that match the given display name exactly.
- `jobKey` (`java.util.List<String>`) — The field to filter based on job key.
- `displayNameContains` (`String`) — A filter to return only resources that have a display name containing the text provided.
- `path` (`String`) — The fully qualified path where the job is stored.
- `createdBy` (`String`) — A filter to return only resources that are created by given user with username that matches exactly.
- `updatedBy` (`String`) — A filter to return only resources that was last updated by given user with username that matches exactly.
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated List call.
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listJobsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `opcPrevPage` (`String`) — For list pagination. When this header appears in the response, previous pages of results remain.
- `opcTotalItems` (`Integer`) — For list pagination. This header provides total number of items available.
- `jobCollection` (`com.oracle.aidataplatform.dp.model.JobCollection`) — The returned {@code JobCollection} instance.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-listrecentjobruns"></a>`listRecentJobRuns`
Returns a list of the latest job runs for a given job key.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `jobKey` (`java.util.List<String>`) — The field to filter based on job key.

**Optional Parameters:**
- `recordCount` (`Integer`) — The number of records to fetch.
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated List call.
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listRecentJobRunsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `jobRunCollection` (`com.oracle.aidataplatform.dp.model.JobRunCollection`) — The returned {@code JobRunCollection} instance.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-listtaskrunretries"></a>`listTaskRunRetries`
Returns detailed information about retries of a task run with a given task run key.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `taskRunKey` (`String`) — Task run key.

**Optional Parameters:**
- `displayName` (`String`) — A filter to return only resources that match the given display name exactly.
- `status` (`java.util.List<Status>`) — The field to filter based on state.
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listTaskRunRetriesResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `opcPrevPage` (`String`) — For list pagination. When this header appears in the response, previous pages of results remain.
- `taskRunRetryCollection` (`com.oracle.aidataplatform.dp.model.TaskRunRetryCollection`) — The returned {@code TaskRunRetryCollection} instance.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-listtaskruns"></a>`listTaskRuns`
Returns a list of task runs.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `jobRunKey` (`String`) — The field to filter based on job run key.

**Optional Parameters:**
- `displayName` (`String`) — A filter to return only resources that match the given display name exactly.
- `status` (`java.util.List<Status>`) — The field to filter based on state.
- `parentJobRunKey` (`String`) — The field to filter based on parent job run key.
- `rootJobRunKey` (`String`) — The field to filter based on root job run key.
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated List call.
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listTaskRunsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `opcPrevPage` (`String`) — For list pagination. When this header appears in the response, previous pages of results remain.
- `taskRunCollection` (`com.oracle.aidataplatform.dp.model.TaskRunCollection`) — The returned {@code TaskRunCollection} instance.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-managejobpermission"></a>`manageJobPermission`
Update job permissions with the provided details.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `jobKey` (`String`) — Job key.
- `manageJobPermissionDetails` (`com.oracle.aidataplatform.dp.model.ManageJobPermissionDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageJobPermissionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-repairjobrun"></a>`repairJobRun`
Repairs and reruns a job run.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `jobRunKey` (`String`) — Job run key.
- `repairJobRunDetails` (`com.oracle.aidataplatform.dp.model.RepairJobRunDetails`) — Details of the job run to be repaired.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `repairJobRunResponse`

**Response Fields:**
- `location` (`String`) — URL for the created/repaired job run. The job run key is generated after this request is sent.
- `contentLocation` (`String`) — Same as location.
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcWorkRequestId` (`String`) — The OCID of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `jobRun` (`com.oracle.aidataplatform.dp.model.JobRun`) — The returned {@code JobRun} instance.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-updatejob"></a>`updateJob`
Updates details for a job.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `jobKey` (`String`) — Job key.
- `updateJobDetails` (`com.oracle.aidataplatform.dp.model.UpdateJobDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateJobResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `job` (`com.oracle.aidataplatform.dp.model.Job`) — The returned {@code Job} instance.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


## <a id="workspaceclient-client"></a>Workspace (`WorkspaceClient`)
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

### <a id="workspaceclient-creategitfolder"></a>`createGitFolder`
Creates a git folder in the workspace

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `createGitFolderDetails` (`com.oracle.aidataplatform.dp.model.CreateGitFolderDetails`) — The information to be updated.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createGitFolderResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `gitFolder` (`com.oracle.aidataplatform.dp.model.GitFolder`) — The returned {@code GitFolder} instance.

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)


### <a id="workspaceclient-createworkspace"></a>`createWorkspace`
Creates a workspace.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `createWorkspaceDetails` (`com.oracle.aidataplatform.dp.model.CreateWorkspaceDetails`) — Details for the new workspace.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createWorkspaceResponse`

**Response Fields:**
- `location` (`String`) — URL for the created workspace. The workspace key is generated after this request is sent.
- `contentLocation` (`String`) — Same as location.
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `workspace` (`com.oracle.aidataplatform.dp.model.Workspace`) — The returned {@code Workspace} instance.

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)


### <a id="workspaceclient-deleteworkspace"></a>`deleteWorkspace`
Deletes a workspace.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `timeDataLakeDeletion` (`java.util.Date`) — Deletion time in the case that a workspace is deleted during AI Data Platform deletion.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteWorkspaceResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)


### <a id="workspaceclient-getworkspace"></a>`getWorkspace`
Gets detailed information about a workspace.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace

**Optional Parameters:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getWorkspaceResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `workspace` (`com.oracle.aidataplatform.dp.model.Workspace`) — The returned {@code Workspace} instance.

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)


### <a id="workspaceclient-listcreateworkspacepermissions"></a>`listCreateWorkspacePermissions`
Gets a list of create workspace permission summary objects.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for {@code granteeName} is ascending.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listCreateWorkspacePermissionsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `createWorkspacePermissionCollection` (`com.oracle.aidataplatform.dp.model.CreateWorkspacePermissionCollection`) — The returned {@code CreateWorkspacePermissionCollection} instance.

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)


### <a id="workspaceclient-listworkspacepermissions"></a>`listWorkspacePermissions`
Gets a list of workspace permissions.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace

**Optional Parameters:**
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for {@code granteeName} is ascending.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listWorkspacePermissionsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `workspacePermissionCollection` (`com.oracle.aidataplatform.dp.model.WorkspacePermissionCollection`) — The returned {@code WorkspacePermissionCollection} instance.

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)


### <a id="workspaceclient-listworkspaces"></a>`listWorkspaces`
Gets a list of workspaces.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `lifecycleState` (`com.oracle.aidataplatform.dp.model.Workspace.LifecycleState`) — A filter to return only resources that match the given lifecycle state. The state value is case-insensitive.
- `displayName` (`String`) — A filter to return only resources that match the given display name exactly.
- `displayNameContains` (`String`) — A filter to return only resources that have a display name containing the text provided.
- `type` (`com.oracle.aidataplatform.dp.model.Workspace.Type`) — When no value is provided, all workspaces are returned. Otherwise, workspace of selected value is returned.
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `isPrivateNetworkEnabled` (`Boolean`) — A flag to filter the workspaces which are private network enabled or disabled
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listWorkspacesResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `workspaceCollection` (`com.oracle.aidataplatform.dp.model.WorkspaceCollection`) — The returned {@code WorkspaceCollection} instance.

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)


### <a id="workspaceclient-managecreateworkspacepermission"></a>`manageCreateWorkspacePermission`
Updates create workspace permissions on a workspace.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `manageCreateWorkspacePermissionDetails` (`com.oracle.aidataplatform.dp.model.ManageCreateWorkspacePermissionDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageCreateWorkspacePermissionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)


### <a id="workspaceclient-manageworkspacepermission"></a>`manageWorkspacePermission`
Updates permissions on a workspace.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `manageWorkspacePermissionDetails` (`com.oracle.aidataplatform.dp.model.ManageWorkspacePermissionDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageWorkspacePermissionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)


### <a id="workspaceclient-updateworkspace"></a>`updateWorkspace`
Updates the details of a workspace.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `updateWorkspaceDetails` (`com.oracle.aidataplatform.dp.model.UpdateWorkspaceDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateWorkspaceResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `workspace` (`com.oracle.aidataplatform.dp.model.Workspace`) — The returned {@code Workspace} instance.

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)


### <a id="workspaceclient-updateworkspaceasyncoperationstatus"></a>`updateWorkspaceAsyncOperationStatus`
Updates the status of a workspace.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `asyncOperationKey` (`String`) — The unique identifier of an async operation
- `updateWorkspaceAsyncOperationStatusDetails` (`com.oracle.aidataplatform.dp.model.UpdateWorkspaceAsyncOperationStatusDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateWorkspaceAsyncOperationStatusResponse`

**Response Fields:**
- `opcWorkRequestId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `workspace` (`com.oracle.aidataplatform.dp.model.Workspace`) — The returned {@code Workspace} instance.

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)


## <a id="workspaceobjectclient-client"></a>Workspace Object (`WorkspaceObjectClient`)
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
- [`uploadAndExtractWorkspaceZip`](#workspaceobjectclient-uploadandextractworkspacezip)
- [`uploadWorkspaceObjectWithPar`](#workspaceobjectclient-uploadworkspaceobjectwithpar)
- [`zipAndDownloadWorkspaceFolder`](#workspaceobjectclient-zipanddownloadworkspacefolder)

### <a id="workspaceobjectclient-copyworkspaceobject"></a>`copyWorkspaceObject`
Copy a workspace object to different location.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `copyWorkspaceObjectDetails` (`com.oracle.aidataplatform.dp.model.CopyWorkspaceObjectDetails`) — Details for copying the workspace object to a different path.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `copyWorkspaceObjectResponse`

**Response Fields:**
- `opcWorkRequestId` (`String`) — The OCID of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `workspaceObjectDetails` (`com.oracle.aidataplatform.dp.model.WorkspaceObjectDetails`) — The returned {@code WorkspaceObjectDetails} instance.

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)


### <a id="workspaceobjectclient-createworkspaceobject"></a>`createWorkspaceObject`
Creates a workspace object. You can create a file or folder in the workspace.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `createWorkspaceObjectDetails` (`java.io.InputStream`) — Details for the new workspace object.
- `path` (`String`) — The absolute path of the file or folder

**Optional Parameters:**
- `type` (`String`) — The type of workspace object.
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `isUploadFileBase64Encoded` (`Boolean`) — A flag to identify if the upload file is base64 encoded
- `isOverwrite` (`Boolean`) — A boolean which decides if overwrite is allowed
- `objectDescription` (`String`) — The description of the workspace object
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createWorkspaceObjectResponse`

**Response Fields:**
- `location` (`String`) — URL for the created workspace object. The workspace object key is generated after this request is sent.
- `contentLocation` (`String`) — Same as location.
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `objectKey` (`String`) — Unique key of the object.
- `path` (`String`) — The full path of the object.
- `type` (`String`) — Type of the object
- `timeUpdated` (`java.util.Date`) — The date and time when Workspace Object was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z}
- `inputStream` (`java.io.InputStream`) — The returned {@code java.io.InputStream} instance.

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)


### <a id="workspaceobjectclient-deleteworkspaceobject"></a>`deleteWorkspaceObject`
Deletes a workspace object.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `objectPath` (`String`) — The fully qualified path of the workspace object.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteWorkspaceObjectResponse`

**Response Fields:**
- `opcWorkRequestId` (`String`) — The OCID of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)


### <a id="workspaceobjectclient-downloadworkspaceobjectwithpar"></a>`downloadWorkspaceObjectWithPar`
Downloads a workspace file by providing the PAR info for downloading the file for given path.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `path` (`String`) — The absolute path of the file or folder

**Optional Parameters:**
- `shouldGenerateNewPar` (`Boolean`) — Flag to toggle to generate short living par
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `type` (`String`) — The type of workspace object.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `downloadWorkspaceObjectWithParResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `objectKey` (`String`) — Unique key of the object
- `path` (`String`) — The full path of the object
- `type` (`String`) — Type of the object
- `timeUpdated` (`java.util.Date`) — The date and time when Workspace Object was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z}
- `downloadFileWithParResult` (`com.oracle.aidataplatform.dp.model.DownloadFileWithParResult`) — The returned {@code DownloadFileWithParResult} instance.

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)


### <a id="workspaceobjectclient-getworkspaceobject"></a>`getWorkspaceObject`
Returns detailed information about a workspace object.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `objectPath` (`String`) — The fully qualified path of the workspace object.

**Optional Parameters:**
- `shouldIncludeMetadata` (`Boolean`) — Path to list all metadata for a file or folder.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getWorkspaceObjectResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `objectKey` (`String`) — Unique key of the object.
- `path` (`String`) — The full path of the object.
- `type` (`String`) — Type of the object
- `timeUpdated` (`java.util.Date`) — The date and time when Workspace Object was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z}
- `inputStream` (`java.io.InputStream`) — The returned {@code java.io.InputStream} instance.

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)


### <a id="workspaceobjectclient-headworkspaceobject"></a>`headWorkspaceObject`
Returns metadata about a workspace object. The contents of the file are not retrieved.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `objectPath` (`String`) — The fully qualified path of the workspace object.

**Optional Parameters:**
- `shouldIncludeMetadata` (`Boolean`) — Path to list all metadata for a file or folder.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `headWorkspaceObjectResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `objectKey` (`String`) — Unique key of the object.
- `path` (`String`) — The full path of the object.
- `type` (`String`) — Type of the object
- `timeUpdated` (`java.util.Date`) — The date and time when Workspace Object was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z}
- `fileMetadata` (`String`) — File metadata of the file.
- `compositeEtag` (`String`) — The file composite (data + metadata) etag.

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)


### <a id="workspaceobjectclient-listworkspaceobjectpermissions"></a>`listWorkspaceObjectPermissions`
Returns a list of workspace object permissions.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `objectKey` (`String`) — The key of the workspace object.

**Optional Parameters:**
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listWorkspaceObjectPermissionsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `workspaceObjectPermissionCollection` (`com.oracle.aidataplatform.dp.model.WorkspaceObjectPermissionCollection`) — The returned {@code WorkspaceObjectPermissionCollection} instance.

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)


### <a id="workspaceobjectclient-listworkspaceobjects"></a>`listWorkspaceObjects`
Returns a list of objects in the workspace.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `path` (`String`) — The absolute path of the file or folder

**Optional Parameters:**
- `type` (`String`) — Filter by object type. For example, NOTEBOOK, LIBRARY, or FILE.
- `displayName` (`String`) — A filter to return only resources that match the given display name exactly.
- `limit` (`Integer`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `metadataKeys` (`String`) — Comma separated keys to have in list response.
- `page` (`String`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `sortBy` (`SortBy`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listWorkspaceObjectsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `workspaceObjectCollection` (`com.oracle.aidataplatform.dp.model.WorkspaceObjectCollection`) — The returned {@code WorkspaceObjectCollection} instance.

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)


### <a id="workspaceobjectclient-manageworkspaceobjectpermission"></a>`manageWorkspaceObjectPermission`
Updates permissions on a workspace object.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `objectKey` (`String`) — The key of the workspace object.
- `manageWorkspaceObjectPermissionDetails` (`com.oracle.aidataplatform.dp.model.ManageWorkspaceObjectPermissionDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageWorkspaceObjectPermissionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)


### <a id="workspaceobjectclient-moveworkspaceobject"></a>`moveWorkspaceObject`
Moves a workspace object to different location.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `moveWorkspaceObjectDetails` (`com.oracle.aidataplatform.dp.model.MoveWorkspaceObjectDetails`) — Details for moving the workspace object to a different path.

**Optional Parameters:**
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `moveWorkspaceObjectResponse`

**Response Fields:**
- `opcWorkRequestId` (`String`) — The OCID of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `workspaceObjectDetails` (`com.oracle.aidataplatform.dp.model.WorkspaceObjectDetails`) — The returned {@code WorkspaceObjectDetails} instance.

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)


### <a id="workspaceobjectclient-renameworkspaceobject"></a>`renameWorkspaceObject`
Renames a workspace object.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `renameWorkspaceObjectDetails` (`com.oracle.aidataplatform.dp.model.RenameWorkspaceObjectDetails`) — Details for renaming the workspace object.

**Optional Parameters:**
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `renameWorkspaceObjectResponse`

**Response Fields:**
- `opcWorkRequestId` (`String`) — The OCID of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `workspaceObjectDetails` (`com.oracle.aidataplatform.dp.model.WorkspaceObjectDetails`) — The returned {@code WorkspaceObjectDetails} instance.

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)


### <a id="workspaceobjectclient-updateworkspaceobject"></a>`updateWorkspaceObject`
Updates a workspace object with the provided information.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `objectPath` (`String`) — The fully qualified path of the workspace object.
- `updateWorkspaceObjectDetails` (`java.io.InputStream`) — The information to be updated.

**Optional Parameters:**
- `objectDescription` (`String`) — The description of the workspace object
- `ifMatch` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateWorkspaceObjectResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `objectKey` (`String`) — Unique key of the object.
- `path` (`String`) — The full path of the object.
- `type` (`String`) — Type of the object
- `timeUpdated` (`java.util.Date`) — The date and time when Workspace Object was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z}
- `inputStream` (`java.io.InputStream`) — The returned {@code java.io.InputStream} instance.

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)


### <a id="workspaceobjectclient-uploadandextractworkspacezip"></a>`uploadAndExtractWorkspaceZip`
Creates or updates an asynchronous workspace ZIP upload and extraction operation. CREATE returns a PAR URL for uploading the ZIP bytes and an async operation key. UPDATE records the uploaded ZIP metadata so extraction can continue.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `uploadAndExtractZipDetails` (`com.oracle.aidataplatform.dp.model.UploadAndExtractZipDetails`) — Details for uploading and extracting the workspace ZIP file.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `uploadAndExtractWorkspaceZipResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `uploadAndExtractZipResult` (`com.oracle.aidataplatform.dp.model.UploadAndExtractZipResult`) — The returned {@code UploadAndExtractZipResult} instance.

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)


### <a id="workspaceobjectclient-uploadworkspaceobjectwithpar"></a>`uploadWorkspaceObjectWithPar`
Creates a workspace file by generating PAR or updates the metadata by close file. If file exists, then it will be updated.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `uploadFileWithParDetails` (`com.oracle.aidataplatform.dp.model.UploadFileWithParDetails`) — Contents of the file to upload.
- `path` (`String`) — The absolute path of the file or folder

**Optional Parameters:**
- `isOverwrite` (`Boolean`) — A boolean which decides if overwrite is allowed
- `shouldGenerateNewPar` (`Boolean`) — Flag to toggle to generate short living par
- `shouldCreateRecursively` (`Boolean`) — A boolean which decides if parent directories should be created recursively during upload.
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if the recent list should be updated.
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `type` (`String`) — The type of workspace object.
- `objectDescription` (`String`) — The description of the workspace object
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `uploadWorkspaceObjectWithParResponse`

**Response Fields:**
- `etag` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `objectKey` (`String`) — Unique key of the object
- `path` (`String`) — The full path of the object
- `type` (`String`) — Type of the object
- `timeUpdated` (`java.util.Date`) — The date and time when Workspace Object was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z}
- `uploadFileWithParResult` (`com.oracle.aidataplatform.dp.model.UploadFileWithParResult`) — The returned {@code UploadFileWithParResult} instance.

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)


### <a id="workspaceobjectclient-zipanddownloadworkspacefolder"></a>`zipAndDownloadWorkspaceFolder`
Starts asynchronous creation of a ZIP archive for a workspace folder. The response includes a PAR URL for downloading the archive after the operation succeeds.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The key of the Workspace
- `zipAndDownloadFolderDetails` (`com.oracle.aidataplatform.dp.model.ZipAndDownloadFolderDetails`) — Details for zipping a workspace folder for download.

**Optional Parameters:**
- `opcRetryToken` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `zipAndDownloadWorkspaceFolderResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request.
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `zipAndDownloadFolderResult` (`com.oracle.aidataplatform.dp.model.ZipAndDownloadFolderResult`) — The returned {@code ZipAndDownloadFolderResult} instance.

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)
