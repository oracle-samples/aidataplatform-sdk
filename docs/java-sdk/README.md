<a id="top"></a>
# AIDP Java SDK Operations Reference
This document summarizes the available service clients in the AIDP Java SDK and details every operation's request parameters and responses.

## Clients
- [Agent (`AgentClient`)](#agentclient-client)
- [Async Operations (`AsyncOperationsClient`)](#asyncoperationsclient-client)
- [Audit (`AuditClient`)](#auditclient-client)
- [Bundle (`BundleClient`)](#bundleclient-client)
- [Catalog (`CatalogClient`)](#catalogclient-client)
- [Cluster (`ClusterClient`)](#clusterclient-client)
- [Credentials (`CredentialsClient`)](#credentialsclient-client)
- [Delta Share (`DeltaShareClient`)](#deltashareclient-client)
- [Git (`GitClient`)](#gitclient-client)
- [ML Ops (`MLOpsClient`)](#mlopsclient-client)
- [Notebook (`NotebookClient`)](#notebookclient-client)
- [Role (`RoleClient`)](#roleclient-client)
- [Schema (`SchemaClient`)](#schemaclient-client)
- [Semantic Catalog (`SemanticCatalogClient`)](#semanticcatalogclient-client)
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
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `agentKey` (`String`) — The key of the Workspace
- `copyAgentDetails` (`com.oracle.aidataplatform.dp.model.CopyAgentDetails`) — The UUID of the agent.

**Optional Parameters:**
- `shouldUpdateRecent` (`Boolean`) — Details for copying the agent.
- `opcRetryToken` (`String`) — A flag to identify if the recent list should be updated.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `ifMatch` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `copyAgentResponse`

**Response Fields:**
- `location` (`String`) — The returned {@code Agent} instance.
- `contentLocation` (`String`) — URL for the created agent. The agent key is generated after this request is sent.
- `etag` (`String`) — Same as location.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `agent` (`com.oracle.aidataplatform.dp.model.Agent`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-createagent"></a>`createAgent`
Creates an agent.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `createAgentDetails` (`com.oracle.aidataplatform.dp.model.CreateAgentDetails`) — The key of the Workspace

**Optional Parameters:**
- `shouldUpdateRecent` (`Boolean`) — Details for the new agent.
- `opcRetryToken` (`String`) — A flag to identify if the recent list should be updated.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createAgentResponse`

**Response Fields:**
- `location` (`String`) — The returned {@code Agent} instance.
- `contentLocation` (`String`) — URL for the created agent. The agent key is generated after this request is sent.
- `etag` (`String`) — Same as location.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `agent` (`com.oracle.aidataplatform.dp.model.Agent`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-deleteagent"></a>`deleteAgent`
Delete an agent from the schema.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `agentKey` (`String`) — The key of the Workspace

**Optional Parameters:**
- `ifMatch` (`String`) — The UUID of the agent.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteAgentResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-deleteagentdeployment"></a>`deleteAgentDeployment`
Deletes an agent deployment.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `agentKey` (`String`) — The key of the Workspace
- `agentDeploymentKey` (`String`) — The UUID of the agent.

**Optional Parameters:**
- `ifMatch` (`String`) — The UUID of the agent deployment.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteAgentDeploymentResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-deleteagentsession"></a>`deleteAgentSession`
Deletes an agent Session.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `agentKey` (`String`) — The key of the Workspace
- `sessionId` (`String`) — The UUID of the agent.

**Optional Parameters:**
- `opcRequestId` (`String`) — The UUID of the agent session.
- `ifMatch` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteAgentSessionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-deployagent"></a>`deployAgent`
Deploys a specified agent.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `agentKey` (`String`) — The key of the Workspace
- `deployAgentDetails` (`com.oracle.aidataplatform.dp.model.DeployAgentDetails`) — The UUID of the agent.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details of a deployable agent.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deployAgentResponse`

**Response Fields:**
- `location` (`String`) — The returned {@code AgentDeployment} instance.
- `contentLocation` (`String`) — URI for the created Agent deployment.
- `etag` (`String`) — Same as location.
- `aidpAsyncOperationKey` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.
- `agentDeployment` (`com.oracle.aidataplatform.dp.model.AgentDeployment`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-getagent"></a>`getAgent`
Returns detailed information about an agent.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `agentKey` (`String`) — The key of the Workspace

**Optional Parameters:**
- `opcRequestId` (`String`) — The UUID of the agent.
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getAgentResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code Agent} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `agent` (`com.oracle.aidataplatform.dp.model.Agent`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-getagentdeployment"></a>`getAgentDeployment`
Returns detailed information about an agent deployment.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `agentKey` (`String`) — The key of the Workspace
- `agentDeploymentKey` (`String`) — The UUID of the agent.

**Optional Parameters:**
- `opcRequestId` (`String`) — The UUID of the agent deployment.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getAgentDeploymentResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code AgentDeployment} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `agentDeployment` (`com.oracle.aidataplatform.dp.model.AgentDeployment`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-getagentsession"></a>`getAgentSession`
Returns detailed information about an agent session.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `agentKey` (`String`) — The key of the Workspace
- `sessionId` (`String`) — The UUID of the agent.

**Optional Parameters:**
- `opcRequestId` (`String`) — The UUID of the agent session.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getAgentSessionResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code AgentSession} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `agentSession` (`com.oracle.aidataplatform.dp.model.AgentSession`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-getagentsessiontrace"></a>`getAgentSessionTrace`
Returns trace details for a given message key.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `agentKey` (`String`) — The key of the Workspace
- `sessionId` (`String`) — The UUID of the agent.
- `traceKey` (`String`) — The UUID of the agent session.

**Optional Parameters:**
- `opcRequestId` (`String`) — A filter to return only resources that match the given display trace key exactly.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getAgentSessionTraceResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code TraceDetails} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `traceDetails` (`com.oracle.aidataplatform.dp.model.TraceDetails`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-listagentdeployments"></a>`listAgentDeployments`
Returns a list of all deployments of an agent.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `agentKey` (`String`) — The key of the Workspace

**Optional Parameters:**
- `limit` (`Integer`) — The UUID of the agent.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `displayName` (`String`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `displayNameContains` (`String`) — A filter to return only resources that match the given display name exactly.
- `lifecycleState` (`java.util.List<com.oracle.aidataplatform.dp.model.DeploymentLifecycleState>`) — A filter to return only resources that have a display name containing the text provided.
- `timeCreatedGreaterThanOrEqualTo` (`java.util.Date`) — A filter to return only resources whose value matches the given lifecycleState.
- `timeCreatedLessThanOrEqualTo` (`java.util.Date`) — Fetch objects from repository that were created after or at the exact timestamp provided in parameter
- `sortBy` (`SortBy`) — Fetch objects from repository that were created before or at the exact timestamp provided in parameter.
- `computeKey` (`java.util.List<String>`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (`String`) — Compute key.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listAgentDeploymentsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code AgentDeploymentCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `agentDeploymentCollection` (`com.oracle.aidataplatform.dp.model.AgentDeploymentCollection`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-listagentpermissions"></a>`listAgentPermissions`
Returns a list of permissions for a given agent.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `agentKey` (`String`) — The key of the Workspace

**Optional Parameters:**
- `limit` (`Integer`) — The UUID of the agent.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `opcRequestId` (`String`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listAgentPermissionsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code AgentPermissionCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `agentPermissionCollection` (`com.oracle.aidataplatform.dp.model.AgentPermissionCollection`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-listagentsessionchathistories"></a>`listAgentSessionChatHistories`
Returns list of agent session chat messages.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `agentKey` (`String`) — The key of the Workspace
- `sessionId` (`String`) — The UUID of the agent.

**Optional Parameters:**
- `limit` (`Integer`) — The UUID of the agent session.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `opcRequestId` (`String`) — For list pagination. The value of the opc-next-page response header from the previous
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listAgentSessionChatHistoriesResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code SessionChatHistoryCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `sessionChatHistoryCollection` (`com.oracle.aidataplatform.dp.model.SessionChatHistoryCollection`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-listagentsessions"></a>`listAgentSessions`
Returns a list of testing sessions of an agent.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `agentKey` (`String`) — The key of the Workspace

**Optional Parameters:**
- `limit` (`Integer`) — The UUID of the agent.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `displayNameContains` (`String`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `timeCreatedGreaterThanOrEqualTo` (`java.util.Date`) — A filter to return only resources that have a display name containing the text provided.
- `timeCreatedLessThanOrEqualTo` (`java.util.Date`) — Fetch objects from repository that were created after or at the exact timestamp provided in parameter
- `sortBy` (`SortBy`) — Fetch objects from repository that were created before or at the exact timestamp provided in parameter.
- `opcRequestId` (`String`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listAgentSessionsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code AgentSessionCollection} instance.
- `opcPrevPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcNextPage` (`String`) — For list pagination. When this header appears in the response, previous pages of results remain.
- `agentSessionCollection` (`com.oracle.aidataplatform.dp.model.AgentSessionCollection`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-listagents"></a>`listAgents`
Returns a list of agents in a schema.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `computeKey` (`String`) — The key of the Workspace
- `displayName` (`String`) — Compute key.
- `displayNameContains` (`String`) — A filter to return only resources that match the given display name exactly.
- `limit` (`Integer`) — A filter to return only resources that have a display name containing the text provided.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `opcRequestId` (`String`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listAgentsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code AgentCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `agentCollection` (`com.oracle.aidataplatform.dp.model.AgentCollection`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-manageagentpermission"></a>`manageAgentPermission`
Update the permissions for a given agent.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `agentKey` (`String`) — The key of the Workspace
- `manageAgentPermissionDetails` (`com.oracle.aidataplatform.dp.model.ManageAgentPermissionDetails`) — The UUID of the agent.

**Optional Parameters:**
- `ifMatch` (`String`) — The information to be updated.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageAgentPermissionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-previewagentagentcard"></a>`previewAgentAgentCard`
Returns the agent card based on the given agent card configuration.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `previewAgentCardDetails` (`com.oracle.aidataplatform.dp.model.PreviewAgentCardDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRetryToken` (`String`) — Request details for previewing an agent card.
- `ifMatch` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `previewAgentAgentCardResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code AgentCardPreviewResponse} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `agentCardPreviewResponse` (`com.oracle.aidataplatform.dp.model.AgentCardPreviewResponse`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-redeployagentbykey"></a>`redeployAgentByKey`
Redeploys an agent.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `agentKey` (`String`) — The key of the Workspace
- `updateAgentDeploymentDetails` (`com.oracle.aidataplatform.dp.model.UpdateAgentDeploymentDetails`) — The UUID of the agent.

**Optional Parameters:**
- `ifMatch` (`String`) — Details for updating an agent deployment asynchronously.
- `opcRetryToken` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `redeployAgentByKeyResponse`

**Response Fields:**
- `location` (`String`) — The returned {@code AgentDeployment} instance.
- `contentLocation` (`String`) — URI for the newly created agent deployment.
- `etag` (`String`) — Same as location.
- `aidpAsyncOperationKey` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.
- `agentDeployment` (`com.oracle.aidataplatform.dp.model.AgentDeployment`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-updateagent"></a>`updateAgent`
Updates an agent with provided details.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `agentKey` (`String`) — The key of the Workspace
- `updateAgentDetails` (`com.oracle.aidataplatform.dp.model.UpdateAgentDetails`) — The UUID of the agent.

**Optional Parameters:**
- `shouldUpdateRecent` (`Boolean`) — The information to be updated.
- `ifMatch` (`String`) — A flag to identify if the recent list should be updated.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateAgentResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code Agent} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `agent` (`com.oracle.aidataplatform.dp.model.Agent`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-updateagentdeploymentmetadata"></a>`updateAgentDeploymentMetadata`
Updates the deployment metadata for an agent.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `agentKey` (`String`) — The key of the Workspace
- `updateAgentDeploymentMetadataDetails` (`com.oracle.aidataplatform.dp.model.UpdateAgentDeploymentMetadataDetails`) — The UUID of the agent.

**Optional Parameters:**
- `shouldUpdateRecent` (`Boolean`) — Agent card details to update.
- `opcRetryToken` (`String`) — A flag to identify if the recent list should be updated.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `ifMatch` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateAgentDeploymentMetadataResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code AgentDeployment} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `agentDeployment` (`com.oracle.aidataplatform.dp.model.AgentDeployment`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-validateagent"></a>`validateAgent`
Validates the agent JSON diagram generated by UI.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `agentKey` (`String`) — The key of the Workspace

**Optional Parameters:**
- `opcRequestId` (`String`) — The UUID of the agent.
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `validateAgentResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code ValidateAgentResponse} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `validateAgentResponse` (`com.oracle.aidataplatform.dp.model.ValidateAgentResponse`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


## <a id="asyncoperationsclient-client"></a>Async Operations (`AsyncOperationsClient`)
**Operations:**
- [`getAsyncOperation`](#asyncoperationsclient-getasyncoperation)
- [`listAsyncOperations`](#asyncoperationsclient-listasyncoperations)

### <a id="asyncoperationsclient-getasyncoperation"></a>`getAsyncOperation`
Get detailed information for a particular async operation

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `asyncOperationKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRequestId` (`String`) — The unique identifier of an async operation
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getAsyncOperationResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code AsyncOperation} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `asyncOperation` (`com.oracle.aidataplatform.dp.model.AsyncOperation`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to Async Operations (`AsyncOperationsClient`)](#asyncoperationsclient-client) • [Top](#top)


### <a id="asyncoperationsclient-listasyncoperations"></a>`listAsyncOperations`
List all async operations for a resource type. Filters can be used to narrow the search down.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `resourceType` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `resourceName` (`String`) — Required parameter which decides async operation resource type
- `matchResourceName` (`Boolean`) — A filter to return only resources that match the given resource name exactly.
- `status` (`String`) — Parameter which decides to list async operations with prefix or exact match to resourceName
- `shouldFilterByCallingPrincipal` (`Boolean`) — Option parameter to filter operation on status
- `limit` (`Integer`) — A filter to return only resources that match the current principal.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `opcRequestId` (`String`) — The field to sort by. You can provide only one sort order. Default order for {@code timeStarted} is descending.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listAsyncOperationsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code AsyncOperationCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `asyncOperationCollection` (`com.oracle.aidataplatform.dp.model.AsyncOperationCollection`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to Async Operations (`AsyncOperationsClient`)](#asyncoperationsclient-client) • [Top](#top)


## <a id="auditclient-client"></a>Audit (`AuditClient`)
**Operations:**
- [`manageAuditLogs`](#auditclient-manageauditlogs)
- [`searchAuditLogs`](#auditclient-searchauditlogs)

### <a id="auditclient-manageauditlogs"></a>`manageAuditLogs`
Manages audit logs.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `manageAuditLogsDetails` (`com.oracle.aidataplatform.dp.model.ManageAuditLogsDetails`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details to update in an audit log.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageAuditLogsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Audit (`AuditClient`)](#auditclient-client) • [Top](#top)


### <a id="auditclient-searchauditlogs"></a>`searchAuditLogs`
Searches audit logs.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `searchAuditLogsDetails` (`com.oracle.aidataplatform.dp.model.SearchAuditLogsDetails`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details for the audit log search.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `limit` (`Integer`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `searchAuditLogsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code AuditLogSearchResultCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `auditLogSearchResultCollection` (`com.oracle.aidataplatform.dp.model.AuditLogSearchResultCollection`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

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
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `createBundleDetails` (`com.oracle.aidataplatform.dp.model.CreateBundleDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRetryToken` (`String`) — Request payload for bundle creation.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createBundleResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.
- `aidpAsyncOperationKey` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Bundle (`BundleClient`)](#bundleclient-client) • [Top](#top)


### <a id="bundleclient-createbundleaction"></a>`createBundleAction`
(Preview) Creates a new bundle. This operation is asynchronous. The service validates the request, starts bundle creation, and returns an async operation key in the response headers. Use the async operation APIs to track completion. Typical use cases: - capture selected workspace resources into a version-controlled bundle - prepare a bundle for later deployment or promotion - establish a bundle root that can later be inspected, updated, or deployed Request notes: - `path` identifies the parent folder in the workspace volume where the bundle should be created - `name` identifies the bundle folder name - `bundledResources` identifies which workspace resources should be included

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `createBundleDetails` (`com.oracle.aidataplatform.dp.model.CreateBundleDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRetryToken` (`String`) — Request payload for bundle creation.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createBundleActionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.
- `aidpAsyncOperationKey` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Bundle (`BundleClient`)](#bundleclient-client) • [Top](#top)


### <a id="bundleclient-deploybundle"></a>`deployBundle`
(Deprecated)

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `deployBundleDetails` (`com.oracle.aidataplatform.dp.model.DeployBundleDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRetryToken` (`String`) — Request payload for bundle deploy.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deployBundleResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.
- `aidpAsyncOperationKey` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Bundle (`BundleClient`)](#bundleclient-client) • [Top](#top)


### <a id="bundleclient-deploybundleaction"></a>`deployBundleAction`
Deprecated compatibility API. Use `publish` for new callers.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `deployBundleDetails` (`com.oracle.aidataplatform.dp.model.DeployBundleDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRetryToken` (`String`) — Request payload for bundle deploy.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deployBundleActionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.
- `aidpAsyncOperationKey` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Bundle (`BundleClient`)](#bundleclient-client) • [Top](#top)


### <a id="bundleclient-fetchbundledeploymentstatus"></a>`fetchBundleDeploymentStatus`
(Deprecated)

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `fetchBundleDeploymentStatusDetails` (`com.oracle.aidataplatform.dp.model.FetchBundleDeploymentStatusDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRequestId` (`String`) — Request payload for FetchBundleDeploymentStatusDetails.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `fetchBundleDeploymentStatusResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code BundleDeploymentStatus} instance.
- `bundleDeploymentStatus` (`com.oracle.aidataplatform.dp.model.BundleDeploymentStatus`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Bundle (`BundleClient`)](#bundleclient-client) • [Top](#top)


### <a id="bundleclient-fetchbundledeploymentstatusaction"></a>`fetchBundleDeploymentStatusAction`
Deprecated compatibility API. Use `getBundlePublishStatus` for new callers.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `fetchBundleDeploymentStatusDetails` (`com.oracle.aidataplatform.dp.model.FetchBundleDeploymentStatusDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRequestId` (`String`) — Request payload for FetchBundleDeploymentStatusDetails.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `fetchBundleDeploymentStatusActionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code BundleDeploymentStatus} instance.
- `bundleDeploymentStatus` (`com.oracle.aidataplatform.dp.model.BundleDeploymentStatus`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Bundle (`BundleClient`)](#bundleclient-client) • [Top](#top)


### <a id="bundleclient-fetchbundlepublishstatusaction"></a>`fetchBundlePublishStatusAction`
(Preview) Returns the latest publish summary.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `fetchBundlePublishStatusDetails` (`com.oracle.aidataplatform.dp.model.FetchBundlePublishStatusDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRequestId` (`String`) — Publish status request.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `fetchBundlePublishStatusActionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code BundlePublishStatus} instance.
- `bundlePublishStatus` (`com.oracle.aidataplatform.dp.model.BundlePublishStatus`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Bundle (`BundleClient`)](#bundleclient-client) • [Top](#top)


### <a id="bundleclient-publishbundleaction"></a>`publishBundleAction`
(Preview) Publishes the specified bundle, creating or updating jobs and agent flows according to the bundle manifest. Returns an async job key for tracking publish progress. This operation is asynchronous. The request is accepted for background execution and returns an async operation key in the response headers. Publishing typically uses: - the bundle manifest at the bundle root - top-level resource descriptors in the bundle - dependency descriptors referenced by those top-level resources - default or override variable values when present Use this operation when you want to apply the bundle contents into the target workspace state. Request notes: - `path` identifies the bundle root folder in the workspace volume

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `publishBundleDetails` (`com.oracle.aidataplatform.dp.model.PublishBundleDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRetryToken` (`String`) — Request payload for bundle publish.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `publishBundleActionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.
- `aidpAsyncOperationKey` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Bundle (`BundleClient`)](#bundleclient-client) • [Top](#top)


### <a id="bundleclient-purgebundle"></a>`purgeBundle`
(Deprecated)

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `purgeBundleDetails` (`com.oracle.aidataplatform.dp.model.PurgeBundleDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRetryToken` (`String`) — Request payload for bundle purge.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `purgeBundleResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.
- `aidpAsyncOperationKey` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Bundle (`BundleClient`)](#bundleclient-client) • [Top](#top)


### <a id="bundleclient-purgebundleaction"></a>`purgeBundleAction`
(Preview) Tears down all resources deployed by the specified bundle in the workspace. This operation is intended to tear down resources that were created or managed through bundle deployment. It does not delete the bundle files themselves from the workspace volume. This operation is asynchronous. The service accepts the purge request, starts the background teardown workflow, and returns async operation headers. Typical use cases: - remove resources that were previously deployed from a bundle - clean up a workspace before re-deploying or retiring a bundle Request notes: - `path` identifies the bundle root folder in the workspace volume

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `purgeBundleDetails` (`com.oracle.aidataplatform.dp.model.PurgeBundleDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRetryToken` (`String`) — Request payload for bundle purge.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `purgeBundleActionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.
- `aidpAsyncOperationKey` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Bundle (`BundleClient`)](#bundleclient-client) • [Top](#top)


### <a id="bundleclient-syncbundle"></a>`syncBundle`
(Deprecated)

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `syncBundleDetails` (`com.oracle.aidataplatform.dp.model.SyncBundleDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRetryToken` (`String`) — Request payload for bundle sync.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `syncBundleResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.
- `aidpAsyncOperationKey` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Bundle (`BundleClient`)](#bundleclient-client) • [Top](#top)


### <a id="bundleclient-syncbundleaction"></a>`syncBundleAction`
(Preview) Synchronizes the code, descriptors, and mapping in the bundle by reconciling the contents with the resource origins. Returns an async job key for tracking sync progress. This operation is intended for cases where the bundle should be refreshed to reflect newer source changes while preserving the bundle structure and identity. This operation is asynchronous and returns async operation headers when accepted. Typical use cases: - refresh bundle contents after upstream workspace resources have changed - reconcile descriptor or artifact content with current resource origins - preserve local bundle overrides while pulling in source resource updates - keep a bundle current before promoting it Request notes: - `path` identifies the bundle root folder in the workspace volume - the bundle must contain a valid `aidp_workbench.yaml` - the bundle must contain `.aidp/resource_origins.yaml` - origin metadata must refer to the same AIDP/Data Lake and workspace as the request

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `syncBundleDetails` (`com.oracle.aidataplatform.dp.model.SyncBundleDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRetryToken` (`String`) — Request payload for bundle sync.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `syncBundleActionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.
- `aidpAsyncOperationKey` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

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
- `catalogTestConnectionDetails` (`com.oracle.aidataplatform.dp.model.CatalogTestConnectionDetails`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details for the AI Data Platform Workbench catalog to be tested for connection.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `catalogTestConnectionResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.

**Return:** [Back to Catalog (`CatalogClient`)](#catalogclient-client) • [Top](#top)


### <a id="catalogclient-createcatalog"></a>`createCatalog`
Creates a catalog with the given ID.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `createCatalogDetails` (`com.oracle.aidataplatform.dp.model.CreateCatalogDetails`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details for the new AI Data Platform Workbench catalog.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createCatalogResponse`

**Response Fields:**
- `location` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `contentLocation` (`String`) — URL for the created catalog. The AI Data Platform Workbench catalog key is generated after this request is sent.
- `aidpAsyncOperationKey` (`String`) — Same as location.
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.

**Return:** [Back to Catalog (`CatalogClient`)](#catalogclient-client) • [Top](#top)


### <a id="catalogclient-deletecatalog"></a>`deleteCatalog`
Deletes the specified catalog.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `catalogKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `isForced` (`Boolean`) — The key of the catalog.
- `ifMatch` (`String`) — A boolean which decides if an entity should be deleted with Cascade effect
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteCatalogResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.

**Return:** [Back to Catalog (`CatalogClient`)](#catalogclient-client) • [Top](#top)


### <a id="catalogclient-getcatalog"></a>`getCatalog`
Gets detailed information about a catalog with a given catalog key.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `catalogKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `isCatalogGuid` (`Boolean`) — The key of the catalog.
- `shouldSkipOcidTranslation` (`Boolean`) — A boolean which decides if catalogKey path parameter is catalog GUID (UUID) or name.
- `opcRequestId` (`String`) — When true, skip user OCID translation and return raw OCIDs.
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getCatalogResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code Catalog} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `catalog` (`com.oracle.aidataplatform.dp.model.Catalog`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Catalog (`CatalogClient`)](#catalogclient-client) • [Top](#top)


### <a id="catalogclient-listcatalogpermissions"></a>`listCatalogPermissions`
Gets a list of all permissions in the specified catalog.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `catalogKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `limit` (`Integer`) — The key of the catalog.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `opcRequestId` (`String`) — The field to sort by. You can provide only one sort order. Default order for timeCreated
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listCatalogPermissionsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code CatalogPermissionCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `catalogPermissionCollection` (`com.oracle.aidataplatform.dp.model.CatalogPermissionCollection`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to Catalog (`CatalogClient`)](#catalogclient-client) • [Top](#top)


### <a id="catalogclient-listcatalogs"></a>`listCatalogs`
Gets a list of catalogs with a given ID.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `displayName` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `catalogState` (`CatalogState`) — A filter to return only resources that match the given display name exactly.
- `catalogType` (`CatalogType`) — The state of the catalog.
- `shouldSkipOcidTranslation` (`Boolean`) — The type of the catalog.
- `limit` (`Integer`) — When true, skip user OCID translation and return raw OCIDs.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `opcRequestId` (`String`) — The field to sort by. You can provide only one sort order. Default order for timeCreated
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listCatalogsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code CatalogCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `catalogCollection` (`com.oracle.aidataplatform.dp.model.CatalogCollection`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to Catalog (`CatalogClient`)](#catalogclient-client) • [Top](#top)


### <a id="catalogclient-managecatalogpermission"></a>`manageCatalogPermission`
Updates permission details for a catalog.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `catalogKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `manageCatalogPermissionDetails` (`com.oracle.aidataplatform.dp.model.ManageCatalogPermissionDetails`) — The key of the catalog.

**Optional Parameters:**
- `ifMatch` (`String`) — The information to be updated.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageCatalogPermissionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Catalog (`CatalogClient`)](#catalogclient-client) • [Top](#top)


### <a id="catalogclient-refreshcatalog"></a>`refreshCatalog`
Refreshes a catalog through a crawler.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `catalogKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `ifMatch` (`String`) — The key of the catalog.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `opcRetryToken` (`String`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `refreshCatalogResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.
- `aidpAsyncOperationKey` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Catalog (`CatalogClient`)](#catalogclient-client) • [Top](#top)


### <a id="catalogclient-updatecatalog"></a>`updateCatalog`
Updates the details of a catalog with the given information.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `catalogKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `updateCatalogDetails` (`com.oracle.aidataplatform.dp.model.UpdateCatalogDetails`) — The key of the catalog.

**Optional Parameters:**
- `shouldUpdateRecent` (`Boolean`) — The information to be updated.
- `ifMatch` (`String`) — A flag to identify if the recent list should be updated.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateCatalogResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.

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
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `clusterKey` (`String`) — The key of the Workspace

**Optional Parameters:**
- `opcRetryToken` (`String`) — Cluster key.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `cloneComputeResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-createcluster"></a>`createCluster`
Creates a new cluster with the provided details.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `createClusterDetails` (`com.oracle.aidataplatform.dp.model.CreateClusterDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details for the new cluster.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createClusterResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — The returned {@code Cluster} instance.
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.
- `etag` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `cluster` (`com.oracle.aidataplatform.dp.model.Cluster`) — For optimistic concurrency control. See {@code if-match}.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-deletecluster"></a>`deleteCluster`
Deletes a cluster from a workspace.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `clusterKey` (`String`) — The key of the Workspace

**Optional Parameters:**
- `ifMatch` (`String`) — Cluster key.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteClusterResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-downloadclusterlogs"></a>`downloadClusterLogs`
Downloads logs within the specified cluster and time range. The logs can be filtered by severity (`logLevel`), type (`logContentTypeContains`), and other parameters such as execution context and thread identifiers.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `clusterKey` (`String`) — The key of the Workspace
- `downloadClusterLogsDetails` (`com.oracle.aidataplatform.dp.model.DownloadClusterLogsDetails`) — Cluster key.

**Optional Parameters:**
- `opcRequestId` (`String`) — Request payload containing the parameters for filtering cluster logs.
- `opcRetryToken` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `downloadClusterLogsResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `datalakeClusterLogParUrl` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.
- `opcRequestId` (`String`) — This string represents the PAR URL for the compute log file. The {@code datalake-cluster-log-par-url} should be used only after the

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-exportcomputeconfiguration"></a>`exportComputeConfiguration`
Writes selected Compute configuration values supplied by the caller to a workspace YAML file without overwriting an existing file.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `clusterKey` (`String`) — The key of the Workspace
- `exportComputeConfigurationDetails` (`com.oracle.aidataplatform.dp.model.ExportComputeConfigurationDetails`) — Cluster key.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Selected identifiers and destination for the YAML export.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `exportComputeConfigurationResponse`

**Response Fields:**
- `location` (`String`) — The returned {@code java.io.InputStream} instance.
- `contentLocation` (`String`) — URL for the created workspace object.
- `opcRequestId` (`String`) — Same as location.
- `path` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `type` (`String`) — Full path of the YAML workspace object.
- `timeUpdated` (`java.util.Date`) — Workspace object type.
- `inputStream` (`java.io.InputStream`) — Date and time when the YAML workspace object was created.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-getcluster"></a>`getCluster`
Returns detailed information about a cluster.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `clusterKey` (`String`) — The key of the Workspace

**Optional Parameters:**
- `opcRequestId` (`String`) — Cluster key.
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getClusterResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code Cluster} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `cluster` (`com.oracle.aidataplatform.dp.model.Cluster`) — Unique Oracle-assigned identifier for the request. If you need to contact

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-getcomputeconfiguration"></a>`getComputeConfiguration`
Gets cluster-scoped Python and JAR libraries and environment variables from Spark Compute.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `clusterKey` (`String`) — The key of the Workspace

**Optional Parameters:**
- `opcRequestId` (`String`) — Cluster key.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getComputeConfigurationResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code ComputeConfiguration} instance.
- `computeConfiguration` (`com.oracle.aidataplatform.dp.model.ComputeConfiguration`) — Unique Oracle-assigned identifier for the request. If you need to contact

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-getdefaultcluster"></a>`getDefaultCluster`
Gets information about the master catalog default cluster.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRequestId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getDefaultClusterResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code DefaultCluster} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `defaultCluster` (`com.oracle.aidataplatform.dp.model.DefaultCluster`) — Unique Oracle-assigned identifier for the request. If you need to contact

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-importcomputeconfiguration"></a>`importComputeConfiguration`
Imports one or more unique workspace YAML files into an active Spark Compute.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `clusterKey` (`String`) — The key of the Workspace
- `importComputeConfigurationDetails` (`com.oracle.aidataplatform.dp.model.ImportComputeConfigurationDetails`) — Cluster key.

**Optional Parameters:**
- `opcRetryToken` (`String`) — YAML workspace paths to import.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `importComputeConfigurationResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-listclusterlibraries"></a>`listClusterLibraries`
Gets a list of libraries installed on a cluster.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `clusterKey` (`String`) — The key of the Workspace

**Optional Parameters:**
- `displayName` (`String`) — Cluster key.
- `limit` (`Integer`) — A filter to return only resources that match the given display name exactly.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `opcRequestId` (`String`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listClusterLibrariesResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code ClusterLibraryCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `opcPrevPage` (`String`) — For list pagination. When this header appears in the response, additional pages of results remain. For
- `opcTotalItems` (`Integer`) — For list pagination. When this header appears in the response, previous pages of results remain. For
- `clusterLibraryCollection` (`com.oracle.aidataplatform.dp.model.ClusterLibraryCollection`) — For list pagination. This header provides total number of items available. For

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-listclusterpermissions"></a>`listClusterPermissions`
Return a list of permissions for a given cluster.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `clusterKey` (`String`) — The key of the Workspace

**Optional Parameters:**
- `displayName` (`String`) — Cluster key.
- `limit` (`Integer`) — A filter to return only resources that match the given display name exactly.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `opcRequestId` (`String`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listClusterPermissionsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code ClusterPermissionCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `clusterPermissionCollection` (`com.oracle.aidataplatform.dp.model.ClusterPermissionCollection`) — For list pagination. When this header appears in the response, additional pages of results remain. For

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-listclusters"></a>`listClusters`
Returns a list of all clusters in a given workspace.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `state` (`com.oracle.aidataplatform.dp.model.Cluster.State`) — The key of the Workspace
- `displayName` (`String`) — A filter to return only resources that match the given lifecycle state. The state value is case-insensitive.
- `displayNameContains` (`String`) — A filter to return only resources that match the given display name exactly.
- `type` (`String`) — A filter to return only resources that have a display name containing the text provided.
- `limit` (`Integer`) — Cluster type. When the filter is not provided list shows all cluster types - USER and AI_COMPUTE else it shows only
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `opcRequestId` (`String`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listClustersResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code ClusterCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `clusterCollection` (`com.oracle.aidataplatform.dp.model.ClusterCollection`) — For list pagination. When this header appears in the response, additional pages of results remain. For

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-manageclusterpermission"></a>`manageClusterPermission`
Updates the permissions for a given cluster.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `clusterKey` (`String`) — The key of the Workspace
- `manageClusterPermissionDetails` (`com.oracle.aidataplatform.dp.model.ManageClusterPermissionDetails`) — Cluster key.

**Optional Parameters:**
- `ifMatch` (`String`) — The information to be updated.
- `opcRetryToken` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageClusterPermissionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-patchclusterlibrary"></a>`patchClusterLibrary`
Updates libraries of a cluster with the provided patches.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `clusterKey` (`String`) — The key of the Workspace
- `patchClusterLibraryDetails` (`com.oracle.aidataplatform.dp.model.PatchClusterLibraryDetails`) — Cluster key.

**Optional Parameters:**
- `ifMatch` (`String`) — The information to be updated.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `patchClusterLibraryResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code ClusterLibraryCollection} instance.
- `aidpAsyncOperationKey` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.
- `clusterLibraryCollection` (`com.oracle.aidataplatform.dp.model.ClusterLibraryCollection`) — Unique Oracle-assigned identifier for the request. If you need to contact

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-queryreplicaids"></a>`queryReplicaIds`
Queries compute replica identifiers for a compute cluster in the given workspace. The response contains distinct replica identifiers derived from the Monitoring `agentNode` metric dimension.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `clusterKey` (`String`) — The key of the Workspace
- `queryReplicaIdsDetails` (`com.oracle.aidataplatform.dp.model.QueryReplicaIdsDetails`) — Cluster key.

**Optional Parameters:**
- `opcRequestId` (`String`) — Request body containing replica query parameters.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `queryReplicaIdsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code QueryReplicaIdsResult} instance.
- `queryReplicaIdsResult` (`com.oracle.aidataplatform.dp.model.QueryReplicaIdsResult`) — Unique Oracle-assigned identifier for the request. If you need to contact

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-restartcluster"></a>`restartCluster`
Restarts a running cluster.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `clusterKey` (`String`) — The key of the Workspace
- `restartClusterDetails` (`com.oracle.aidataplatform.dp.model.RestartClusterDetails`) — Cluster key.

**Optional Parameters:**
- `ifMatch` (`String`) — Details for restarting the cluster.
- `opcRetryToken` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `restartClusterResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — The returned {@code Cluster} instance.
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.
- `etag` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `cluster` (`com.oracle.aidataplatform.dp.model.Cluster`) — For optimistic concurrency control. See {@code if-match}.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-searchclusterlogs"></a>`searchClusterLogs`
Searches logs within the specified cluster and time range. Supports pagination and filtering.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `clusterKey` (`String`) — The key of the Workspace
- `searchClusterLogsDetails` (`com.oracle.aidataplatform.dp.model.SearchClusterLogsDetails`) — Cluster key.

**Optional Parameters:**
- `opcRequestId` (`String`) — Request body containing the search parameters for cluster logs.
- `limit` (`Integer`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `opcRetryToken` (`String`) — For list pagination. The value of the opc-next-page response header from the previous
- `ifMatch` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `searchClusterLogsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code ClusterLogCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `clusterLogCollection` (`com.oracle.aidataplatform.dp.model.ClusterLogCollection`) — For list pagination. When this header appears in the response, additional pages of results remain. For

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-searchmavenpackages"></a>`searchMavenPackages`
Searches Maven packages available for cluster library installation.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `clusterKey` (`String`) — The key of the Workspace
- `mavenSearchQuery` (`String`) — Cluster key.

**Optional Parameters:**
- `limit` (`Integer`) — Search text matched against Maven package metadata, including group and artifact identifiers. For example, {@code commons-csv} can return {@code org.apache.commons:commons-csv}.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `opcRequestId` (`String`) — For list pagination. The value of the opc-next-page response header from the previous
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `searchMavenPackagesResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code MavenSearchSummaryCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `opcPrevPage` (`String`) — For list pagination. When this header appears in the response, additional pages of results remain. For
- `mavenSearchSummaryCollection` (`com.oracle.aidataplatform.dp.model.MavenSearchSummaryCollection`) — For list pagination. When this header appears in the response, previous pages of results remain. For

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-startcluster"></a>`startCluster`
Starts a cluster that has halted operation.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `clusterKey` (`String`) — The key of the Workspace
- `startClusterDetails` (`com.oracle.aidataplatform.dp.model.StartClusterDetails`) — Cluster key.

**Optional Parameters:**
- `ifMatch` (`String`) — Details of the cluster being started.
- `opcRetryToken` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `startClusterResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — The returned {@code Cluster} instance.
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.
- `etag` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `cluster` (`com.oracle.aidataplatform.dp.model.Cluster`) — For optimistic concurrency control. See {@code if-match}.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-stopcluster"></a>`stopCluster`
Stops an active cluster.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `clusterKey` (`String`) — The key of the Workspace
- `stopClusterDetails` (`com.oracle.aidataplatform.dp.model.StopClusterDetails`) — Cluster key.

**Optional Parameters:**
- `ifMatch` (`String`) — Details for stopping the cluster.
- `opcRetryToken` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `stopClusterResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — The returned {@code Cluster} instance.
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.
- `etag` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `cluster` (`com.oracle.aidataplatform.dp.model.Cluster`) — For optimistic concurrency control. See {@code if-match}.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-summarizemetricsdata"></a>`summarizeMetricsData`
Provides summarized compute metrics for a compute cluster in the given workspace. This API aggregates metric data points based on a specified namespace, metric name, and aggregation type. The response contains computed metric summaries.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `clusterKey` (`String`) — The key of the Workspace
- `summarizeMetricsDataDetails` (`com.oracle.aidataplatform.dp.model.SummarizeMetricsDataDetails`) — Cluster key.

**Optional Parameters:**
- `opcRequestId` (`String`) — Request body containing metric parameters.
- `opcRetryToken` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `ifMatch` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `summarizeMetricsDataResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code SummarizeMetricsResponse} instance.
- `opcRequestId` (`String`) — The ETag for optimistic concurrency control.
- `summarizeMetricsResponse` (`com.oracle.aidataplatform.dp.model.SummarizeMetricsResponse`) — Unique Oracle-assigned identifier for the request. If you need to contact

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-updatecluster"></a>`updateCluster`
Update the details of a given cluster.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `clusterKey` (`String`) — The key of the Workspace
- `updateClusterDetails` (`com.oracle.aidataplatform.dp.model.UpdateClusterDetails`) — Cluster key.

**Optional Parameters:**
- `ifMatch` (`String`) — The information to be updated.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateClusterResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — The returned {@code Cluster} instance.
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.
- `etag` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `cluster` (`com.oracle.aidataplatform.dp.model.Cluster`) — For optimistic concurrency control. See {@code if-match}.

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
- `createDataLakeCredentialDetails` (`com.oracle.aidataplatform.dp.model.CreateDataLakeCredentialDetails`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details for the new credential object. When the internal flag is enabled, callers must supply a {@code namespace} value of {@code default} or {@code user_settings} in the payload.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createCredentialResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Credentials (`CredentialsClient`)](#credentialsclient-client) • [Top](#top)


### <a id="credentialsclient-deletecredential"></a>`deleteCredential`
Deletes a credential object. The operation completes synchronously without a response body.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `credentialKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `ifMatch` (`String`) — The unique identifier of an credential
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteCredentialResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Credentials (`CredentialsClient`)](#credentialsclient-client) • [Top](#top)


### <a id="credentialsclient-getcredential"></a>`getCredential`
Gets detailed information about credential with a given credential key.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `credentialKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRequestId` (`String`) — The unique identifier of an credential
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getCredentialResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code Credential} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `credential` (`com.oracle.aidataplatform.dp.model.Credential`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Credentials (`CredentialsClient`)](#credentialsclient-client) • [Top](#top)


### <a id="credentialsclient-listcredentials"></a>`listCredentials`
Returns a list of credentials.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `displayName` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `displayNameContains` (`String`) — A filter to return only resources that match the given display name exactly.
- `lifecycleState` (`String`) — A filter to return only resources whose displayName contains the provided value (case-insensitive).
- `limit` (`Integer`) — A filter to return only resources whose lifecycleState matches the provided value.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `credentialType` (`com.oracle.aidataplatform.dp.model.CredentialType`) — The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending.
- `opcRequestId` (`String`) — The type of the Credential
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listCredentialsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code CredentialCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `credentialCollection` (`com.oracle.aidataplatform.dp.model.CredentialCollection`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to Credentials (`CredentialsClient`)](#credentialsclient-client) • [Top](#top)


### <a id="credentialsclient-updatecredential"></a>`updateCredential`
Updates a credential object. The operation completes synchronously; callers can invoke get to confirm the latest state.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `credentialKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `updateDataLakeCredentialDetails` (`com.oracle.aidataplatform.dp.model.UpdateDataLakeCredentialDetails`) — The unique identifier of an credential

**Optional Parameters:**
- `shouldUpdateRecent` (`Boolean`) — The information to be updated.
- `ifMatch` (`String`) — A flag to identify if the recent list should be updated.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateCredentialResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Credentials (`CredentialsClient`)](#credentialsclient-client) • [Top](#top)


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
- `createRecipientDetails` (`com.oracle.aidataplatform.dp.model.CreateRecipientDetails`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details for the new recipient for Delta Share protocol in AI Data Platform Workbench.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createRecipientResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code Recipient} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `recipient` (`com.oracle.aidataplatform.dp.model.Recipient`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-createshare"></a>`createShare`
Creates a Delta Share protocol.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `createShareDetails` (`com.oracle.aidataplatform.dp.model.CreateShareDetails`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details for the new share for Delta Share protocol in AI Data Platform Workbench.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createShareResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code Share} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `share` (`com.oracle.aidataplatform.dp.model.Share`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-deleterecipient"></a>`deleteRecipient`
Deletes a Delta Share recipient.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `recipientKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `ifMatch` (`String`) — The key of the recipient resource
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteRecipientResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-deleteshare"></a>`deleteShare`
Deletes a Delta Share.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `shareKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `ifMatch` (`String`) — The unique key of the Share.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteShareResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-getrecipient"></a>`getRecipient`
Gets detailed information about a Delta Share recipient.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `recipientKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRequestId` (`String`) — The key of the recipient resource
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getRecipientResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code Recipient} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `recipient` (`com.oracle.aidataplatform.dp.model.Recipient`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-getshare"></a>`getShare`
Gets detailed information about a Delta Share.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `shareKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRequestId` (`String`) — The unique key of the Share.
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getShareResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code Share} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `share` (`com.oracle.aidataplatform.dp.model.Share`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-listrecipientpermissions"></a>`listRecipientPermissions`
Gets a detailed list of Delta Share recipient permissions.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `recipientKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `limit` (`Integer`) — The key of the recipient resource
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `opcRequestId` (`String`) — The field to sort by. Default order for {@code grantee} is ascending.
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listRecipientPermissionsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code RecipientPermissionCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `recipientPermissionCollection` (`com.oracle.aidataplatform.dp.model.RecipientPermissionCollection`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-listrecipientshares"></a>`listRecipientShares`
Returns a list of Delta Shares that the specified recipient has been granted access to.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `recipientKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `displayName` (`String`) — The key of the recipient resource
- `limit` (`Integer`) — A filter to return only resources that match the given display name exactly.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `opcRequestId` (`String`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated}
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listRecipientSharesResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code ShareCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `shareCollection` (`com.oracle.aidataplatform.dp.model.ShareCollection`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-listrecipients"></a>`listRecipients`
Gets a list of Delta Share recipients.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `displayName` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `limit` (`Integer`) — A filter to return only resources that match the given display name exactly.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `opcRequestId` (`String`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated}
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listRecipientsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code RecipientCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `recipientCollection` (`com.oracle.aidataplatform.dp.model.RecipientCollection`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-listsharedataassets"></a>`listShareDataAssets`
Gets a list of Delta Share assets.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `shareKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `displayName` (`String`) — The unique key of the Share.
- `limit` (`Integer`) — A filter to return only resources that match the given display name exactly.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `opcRequestId` (`String`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated}
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listShareDataAssetsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code ShareDataAssetCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `shareDataAssetCollection` (`com.oracle.aidataplatform.dp.model.ShareDataAssetCollection`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-listsharepermissions"></a>`listSharePermissions`
Returns a list of Delta Shares that the specified recipient has been granted access to.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `shareKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `limit` (`Integer`) — The unique key of the Share.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `opcRequestId` (`String`) — The field to sort by. You can provide only one sort order. Default order for {@code grantee}
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listSharePermissionsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code SharePermissionCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `sharePermissionCollection` (`com.oracle.aidataplatform.dp.model.SharePermissionCollection`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-listsharerecipients"></a>`listShareRecipients`
Gets a list of recipients that have been given access on the specified Delta Share.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `shareKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `displayName` (`String`) — The unique key of the Share.
- `limit` (`Integer`) — A filter to return only resources that match the given display name exactly.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `opcRequestId` (`String`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated}
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listShareRecipientsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code RecipientCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `recipientCollection` (`com.oracle.aidataplatform.dp.model.RecipientCollection`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-listshares"></a>`listShares`
Gets a list of Delta Shares.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `displayName` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `limit` (`Integer`) — A filter to return only resources that match the given display name exactly.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `opcRequestId` (`String`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated}
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listSharesResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code ShareCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `shareCollection` (`com.oracle.aidataplatform.dp.model.ShareCollection`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-managerecipientpermission"></a>`manageRecipientPermission`
Updates the permissions of a Delta Share recipient.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `recipientKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `manageRecipientPermissionDetails` (`com.oracle.aidataplatform.dp.model.ManageRecipientPermissionDetails`) — The key of the recipient resource

**Optional Parameters:**
- `ifMatch` (`String`) — The information to be updated.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageRecipientPermissionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-manageshareaccess"></a>`manageShareAccess`
Updates consumer-side access on a share for a recipient. A provider user can grant or revoke access on a particular share for a given recipient.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `shareKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `manageShareAccessDetails` (`com.oracle.aidataplatform.dp.model.ManageShareAccessDetails`) — The unique key of the Share.

**Optional Parameters:**
- `ifMatch` (`String`) — The information to be updated.
- `opcRetryToken` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageShareAccessResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-managesharedataasset"></a>`manageShareDataAsset`
Updates data assets on a Delta Share with the provided information.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `shareKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `manageShareDataAssetDetails` (`com.oracle.aidataplatform.dp.model.ManageShareDataAssetDetails`) — The unique key of the Share.

**Optional Parameters:**
- `ifMatch` (`String`) — The Delta Share data asset information to be updated.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageShareDataAssetResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-managesharepermission"></a>`manageSharePermission`
Updates permissions on a Delta Share.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `shareKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `manageSharePermissionDetails` (`com.oracle.aidataplatform.dp.model.ManageSharePermissionDetails`) — The unique key of the Share.

**Optional Parameters:**
- `ifMatch` (`String`) — The information to be updated.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageSharePermissionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-updaterecipient"></a>`updateRecipient`
Updates the metadata of a Delta Share recipient.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `recipientKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `updateRecipientDetails` (`com.oracle.aidataplatform.dp.model.UpdateRecipientDetails`) — The key of the recipient resource

**Optional Parameters:**
- `ifMatch` (`String`) — The information to be updated for a recipient.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateRecipientResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-updateshare"></a>`updateShare`
Update a Delta Share with the provided metadata.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `shareKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `updateShareDetails` (`com.oracle.aidataplatform.dp.model.UpdateShareDetails`) — The unique key of the Share.

**Optional Parameters:**
- `ifMatch` (`String`) — The information to be updated.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
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
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `gitRepositoryKey` (`String`) — The key of the Workspace
- `checkoutBranchDetails` (`com.oracle.aidataplatform.dp.model.CheckoutBranchDetails`) — The Git repository key.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details for the new branch.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `ifMatch` (`String`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `checkoutBranchResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code GitBranch} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `aidpAsyncOperationKey` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `gitBranch` (`com.oracle.aidataplatform.dp.model.GitBranch`) — The key of the asynchronous operations associated with an AI Data Platform instance.

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-commitpushgitrepository"></a>`commitPushGitRepository`
(Preview) Stages selected workspace updates, creates a commit, and pushes it upstream so automation can sync with Git providers.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `gitRepositoryKey` (`String`) — The key of the Workspace
- `commitPushDetails` (`com.oracle.aidataplatform.dp.model.CommitPushDetails`) — The Git repository key.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Commit details.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `ifMatch` (`String`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `commitPushGitRepositoryResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.
- `aidpAsyncOperationKey` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-creategitbranch"></a>`createGitBranch`
(Preview) Creates a new branch in the connected repo so teams can stage changes in isolated workspaces.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `gitRepositoryKey` (`String`) — The key of the Workspace
- `createGitBranchDetails` (`com.oracle.aidataplatform.dp.model.CreateGitBranchDetails`) — The Git repository key.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details for the new Workspace Object.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createGitBranchResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code CreateGitBranch} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `aidpAsyncOperationKey` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `createGitBranch` (`com.oracle.aidataplatform.dp.model.CreateGitBranch`) — The key of the asynchronous operations associated with an AI Data Platform instance.

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-getgitdiffdetail"></a>`getGitDiffDetail`
(Preview) Returns a unified diff patch for a specific file so editors and review panes can render inline changes.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `gitRepositoryKey` (`String`) — The key of the Workspace
- `gitFolderPath` (`String`) — The Git repository key.
- `branchName` (`String`) — The Git folder path.
- `gitFilePath` (`String`) — Expected branch name for the folder context.

**Optional Parameters:**
- `contextLines` (`Integer`) — File path relative to repository root.
- `maxPatchBytes` (`Integer`) — Number of context lines to include in the diff.
- `opcRequestId` (`String`) — Maximum number of bytes of diff output to return.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getGitDiffDetailResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code GitDiffDetail} instance.
- `gitDiffDetail` (`com.oracle.aidataplatform.dp.model.GitDiffDetail`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-getgitoperationstate"></a>`getGitOperationState`
(Preview) Returns the current Git worktree status—including in-progress operations or detached HEAD indicators—for the workspace folder.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `gitRepositoryKey` (`String`) — The key of the Workspace

**Optional Parameters:**
- `operationName` (`String`) — The Git repository key.
- `branchName` (`String`) — Optional operation the caller intends to perform (for example PULL, PUSH, RESET, CHECKOUT).
- `opcRequestId` (`String`) — Expected branch name for the folder context.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getGitOperationStateResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code GitOperationState} instance.
- `gitOperationState` (`com.oracle.aidataplatform.dp.model.GitOperationState`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-getgitrepository"></a>`getGitRepository`
(Preview) Returns repository metadata, credential references, and workspace linkage for a specific AI Data Platform Git repository.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `gitRepositoryKey` (`String`) — The key of the Workspace

**Optional Parameters:**
- `shouldIncludeCredentialKey` (`Boolean`) — The Git repository key.
- `opcRequestId` (`String`) — A flag to include credential key in response. If 'true', credential key will be returned in response. Default 'false'.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getGitRepositoryResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code GitRepository} instance.
- `etag` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `gitRepository` (`com.oracle.aidataplatform.dp.model.GitRepository`) — For optimistic concurrency control. See {@code if-match}.

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-listgitbranches"></a>`listGitBranches`
(Preview) Returns branch summaries with optional display-name filters and pagination, so UIs can show branch pickers and search results.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `gitRepositoryKey` (`String`) — The key of the Workspace

**Optional Parameters:**
- `displayName` (`String`) — The Git repository key.
- `displayNameContains` (`String`) — A filter to return only resources that match the given display name exactly.
- `limit` (`Integer`) — A filter to return only resources that have a display name containing the text provided.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `opcRequestId` (`String`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listGitBranchesResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code GitBranchCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcTotalItems` (`Integer`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `gitBranchCollection` (`com.oracle.aidataplatform.dp.model.GitBranchCollection`) — For list pagination. This header provides total number of items available.

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-listgitdiffs"></a>`listGitDiffs`
(Preview) Returns file-level diff summaries for the workspace branch, enabling UI views of changed files or conflicts without heavy payloads.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `gitRepositoryKey` (`String`) — The key of the Workspace
- `gitFolderPath` (`String`) — The Git repository key.
- `branchName` (`String`) — The Git folder path.

**Optional Parameters:**
- `compareTo` (`CompareTo`) — Expected branch name for the folder context.
- `filter` (`Filter`) — Determines which reference is used for computing diffs.
- `limit` (`Integer`) — Filter which files are returned.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `opcRequestId` (`String`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `displayName` (`String`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated}
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listGitDiffsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code GitDiffSummaryCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcTotalItems` (`Integer`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `gitDiffSummaryCollection` (`com.oracle.aidataplatform.dp.model.GitDiffSummaryCollection`) — For list pagination. This header provides total number of items available.

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-mergegitrepository"></a>`mergeGitRepository`
(Preview) Applies the requested branch or commit onto the workspace branch to preview integration changes before pushing.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `gitRepositoryKey` (`String`) — The key of the Workspace
- `gitMergeDetails` (`com.oracle.aidataplatform.dp.model.GitMergeDetails`) — The Git repository key.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Folder/branch details to merge.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `ifMatch` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `shouldUpdateRecent` (`Boolean`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `mergeGitRepositoryResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.
- `aidpAsyncOperationKey` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-pullgitrepository"></a>`pullGitRepository`
(Preview) Performs a Git pull for the workspace branch so developers can sync local files with the latest upstream commits.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `gitRepositoryKey` (`String`) — The key of the Workspace
- `gitPullDetails` (`com.oracle.aidataplatform.dp.model.GitPullDetails`) — The Git repository key.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Folder/branch details to pull.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `ifMatch` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `shouldUpdateRecent` (`Boolean`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `pullGitRepositoryResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.
- `aidpAsyncOperationKey` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-rebasegitrepository"></a>`rebaseGitRepository`
(Preview) Rebases the workspace branch on top of another commit or branch to linearize history and resolve drift.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `gitRepositoryKey` (`String`) — The key of the Workspace
- `gitRebaseDetails` (`com.oracle.aidataplatform.dp.model.GitRebaseDetails`) — The Git repository key.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details needed to perform rebase operation.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `ifMatch` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `shouldUpdateRecent` (`Boolean`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `rebaseGitRepositoryResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.
- `aidpAsyncOperationKey` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-resetgitfolderstate"></a>`resetGitFolderState`
(Preview) Halts in-progress Git operations and discards local changes in the workspace folder to regain a clean state.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `gitRepositoryKey` (`String`) — The key of the Workspace
- `resetGitFolderStateDetails` (`com.oracle.aidataplatform.dp.model.ResetGitFolderStateDetails`) — The Git repository key.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Merge conflict resolution details.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `ifMatch` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `resetGitFolderStateResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.
- `aidpAsyncOperationKey` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-resetgitrepository"></a>`resetGitRepository`
(Preview) Performs a Git reset so the workspace branch matches the specified commit, discarding newer local commits.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `gitRepositoryKey` (`String`) — The key of the Workspace
- `gitResetDetails` (`com.oracle.aidataplatform.dp.model.GitResetDetails`) — The Git repository key.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details needed to perform Git reset operation.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `ifMatch` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `shouldUpdateRecent` (`Boolean`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `resetGitRepositoryResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.
- `aidpAsyncOperationKey` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-resolvegitconflicts"></a>`resolveGitConflicts`
(Preview) Accepts conflict resolution instructions—choose source or target versions—and records the resolution back to the repo.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `gitRepositoryKey` (`String`) — The key of the Workspace
- `conflictResolveDetails` (`com.oracle.aidataplatform.dp.model.ConflictResolveDetails`) — The Git repository key.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Conflict resolution details.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `ifMatch` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `resolveGitConflictsResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code GitBranch} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `gitBranch` (`com.oracle.aidataplatform.dp.model.GitBranch`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-updategitrepository"></a>`updateGitRepository`
(Preview) Updates stored repository details—such as credentials or default branches—so automation stays aligned with your source control.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `updateGitRepositoryDetails` (`com.oracle.aidataplatform.dp.model.UpdateGitRepositoryDetails`) — The key of the Workspace
- `gitRepositoryKey` (`String`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`String`) — The Git repository key.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateGitRepositoryResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


## <a id="mlopsclient-client"></a>ML Ops (`MLOpsClient`)
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

### <a id="mlopsclient-createexperiment"></a>`createExperiment`
(Preview) Creates an experiment in a workspace.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `createExperimentDetails` (`com.oracle.aidataplatform.dp.model.CreateExperimentDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details for the new experiment.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createExperimentResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code CreateExperimentResponseDetails} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `createExperimentResponseDetails` (`com.oracle.aidataplatform.dp.model.CreateExperimentResponseDetails`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-createexperimentrun"></a>`createExperimentRun`
(Preview) Creates a new run within an experiment.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `createExperimentRunDetails` (`com.oracle.aidataplatform.dp.model.CreateExperimentRunDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details for the new run.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createExperimentRunResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code CreateExperimentRunResponseDetails} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `createExperimentRunResponseDetails` (`com.oracle.aidataplatform.dp.model.CreateExperimentRunResponseDetails`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-createmodelversion"></a>`createModelVersion`
(Preview) Creates a model version.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `createModelVersionDetails` (`com.oracle.aidataplatform.dp.model.CreateModelVersionDetails`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details for the new model version.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createModelVersionResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code CreateModelVersionResponseDetails} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `createModelVersionResponseDetails` (`com.oracle.aidataplatform.dp.model.CreateModelVersionResponseDetails`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-createregisteredmodel"></a>`createRegisteredModel`
(Preview) Creates a registered model in a workspace.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `createRegisteredModelDetails` (`com.oracle.aidataplatform.dp.model.CreateRegisteredModelDetails`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details for the new registered model.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createRegisteredModelResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code CreateRegisteredModelResponseDetails} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `createRegisteredModelResponseDetails` (`com.oracle.aidataplatform.dp.model.CreateRegisteredModelResponseDetails`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-createworkspacemodelversion"></a>`createWorkspaceModelVersion`
(Preview) Creates a new model version in a specified workspace.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `createModelVersionDetails` (`com.oracle.aidataplatform.dp.model.CreateModelVersionDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details for the new model version.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createWorkspaceModelVersionResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code CreateModelVersionResponseDetails} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `createModelVersionResponseDetails` (`com.oracle.aidataplatform.dp.model.CreateModelVersionResponseDetails`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-deleteexperiment"></a>`deleteExperiment`
(Preview) Deletes an experiment.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `deleteExperimentDetails` (`com.oracle.aidataplatform.dp.model.DeleteExperimentDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details of the experiment.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteExperimentResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code DeleteExperimentResponseDetails} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `deleteExperimentResponseDetails` (`com.oracle.aidataplatform.dp.model.DeleteExperimentResponseDetails`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-deleteexperimentrun"></a>`deleteExperimentRun`
(Preview) Deletes an experiment run.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `deleteExperimentRunDetails` (`com.oracle.aidataplatform.dp.model.DeleteExperimentRunDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details of the Experiment Run.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteExperimentRunResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code DeleteExperimentRunResponseDetails} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `deleteExperimentRunResponseDetails` (`com.oracle.aidataplatform.dp.model.DeleteExperimentRunResponseDetails`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-deleteexperimentruntag"></a>`deleteExperimentRunTag`
(Preview) Deletes a tag on an experiment run.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `deleteExperimentRunTagDetails` (`com.oracle.aidataplatform.dp.model.DeleteExperimentRunTagDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRetryToken` (`String`) — Tag details to delete on an experiment run.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteExperimentRunTagResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code DeleteExperimentRunTagResponseDetails} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `deleteExperimentRunTagResponseDetails` (`com.oracle.aidataplatform.dp.model.DeleteExperimentRunTagResponseDetails`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-deleteexperimenttag"></a>`deleteExperimentTag`
(Preview) Deletes a tag on an experiment.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `deleteExperimentTagDetails` (`com.oracle.aidataplatform.dp.model.DeleteExperimentTagDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRetryToken` (`String`) — Tag details to delete on an experiment.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteExperimentTagResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code DeleteExperimentTagResponseDetails} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `deleteExperimentTagResponseDetails` (`com.oracle.aidataplatform.dp.model.DeleteExperimentTagResponseDetails`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-deletemodelversion"></a>`deleteModelVersion`
(Preview) Deletes a model version.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `deleteModelVersionDetails` (`com.oracle.aidataplatform.dp.model.DeleteModelVersionDetails`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details of the model version to delete.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteModelVersionResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code DeleteModelVersionResponseDetails} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `deleteModelVersionResponseDetails` (`com.oracle.aidataplatform.dp.model.DeleteModelVersionResponseDetails`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-deletemodelversiontag"></a>`deleteModelVersionTag`
(Preview) Deletes a tag on a model version.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `deleteModelVersionTagDetails` (`com.oracle.aidataplatform.dp.model.DeleteModelVersionTagDetails`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details of a model version tag to delete.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteModelVersionTagResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code DeleteModelVersionTagResponseDetails} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `deleteModelVersionTagResponseDetails` (`com.oracle.aidataplatform.dp.model.DeleteModelVersionTagResponseDetails`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-deleteregisteredmodel"></a>`deleteRegisteredModel`
(Preview) Deletes a registered model.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `deleteRegisteredModelDetails` (`com.oracle.aidataplatform.dp.model.DeleteRegisteredModelDetails`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details of the registered model to delete.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteRegisteredModelResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code DeleteRegisteredModelResponseDetails} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `deleteRegisteredModelResponseDetails` (`com.oracle.aidataplatform.dp.model.DeleteRegisteredModelResponseDetails`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-deleteregisteredmodeltag"></a>`deleteRegisteredModelTag`
(Preview) Deletes a tag on a registered model.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `deleteRegisteredModelTagDetails` (`com.oracle.aidataplatform.dp.model.DeleteRegisteredModelTagDetails`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details of a registered model tag.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteRegisteredModelTagResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code DeleteRegisteredModelTagResponseDetails} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `deleteRegisteredModelTagResponseDetails` (`com.oracle.aidataplatform.dp.model.DeleteRegisteredModelTagResponseDetails`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-getexperimentbyid"></a>`getExperimentById`
(Preview) Returns metadata for an experiment by ID. This method works on deleted experiments.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `experimentId` (`String`) — The key of the Workspace

**Optional Parameters:**
- `opcRequestId` (`String`) — The unique ID of the experiment to retrieve.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getExperimentByIdResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code ExperimentResponse} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `experimentResponse` (`com.oracle.aidataplatform.dp.model.ExperimentResponse`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-getexperimentbyname"></a>`getExperimentByName`
(Preview) Returns experiment metadata for a given name. Returns deleted experiments, but prefers the active experiment if an active and deleted experiment share the same name. If multiple deleted experiments share the same name, the API will return one of them.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `experimentName` (`String`) — The key of the Workspace

**Optional Parameters:**
- `opcRequestId` (`String`) — The name of the experiment to retrieve.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getExperimentByNameResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code ExperimentResponse} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `experimentResponse` (`com.oracle.aidataplatform.dp.model.ExperimentResponse`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-getexperimentrunbyid"></a>`getExperimentRunById`
(Preview) Returns details of an experiment run by ID.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `runId` (`String`) — The key of the Workspace

**Optional Parameters:**
- `opcRequestId` (`String`) — ID of the run to fetch.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getExperimentRunByIdResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code GetExperimentRunResponseDetails} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `getExperimentRunResponseDetails` (`com.oracle.aidataplatform.dp.model.GetExperimentRunResponseDetails`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-getexperimentrunmetrichistory"></a>`getExperimentRunMetricHistory`
(Preview) Returns a history of experiment run metrics.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `runId` (`String`) — The key of the Workspace
- `metricKey` (`String`) — ID of the run metric history to fetch.

**Optional Parameters:**
- `pageToken` (`String`) — Name of the metric key.
- `maxResults` (`Integer`) — Pagination token to go to the next page of metric history.
- `opcRequestId` (`String`) — Maximum number of logged instances of a metric for a run to return per call. Backend servers
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getExperimentRunMetricHistoryResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code ExperimentRunMetricHistoryCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `experimentRunMetricHistoryCollection` (`com.oracle.aidataplatform.dp.model.ExperimentRunMetricHistoryCollection`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-getmodelversion"></a>`getModelVersion`
(Preview) Returns detailed information for a model version.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `name` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `version` (`String`) — Name of the model version.

**Optional Parameters:**
- `opcRequestId` (`String`) — Version number of the model version.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getModelVersionResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code GetModelVersionResponseDetails} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `getModelVersionResponseDetails` (`com.oracle.aidataplatform.dp.model.GetModelVersionResponseDetails`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-getregisteredmodel"></a>`getRegisteredModel`
(Preview) Returns details for a specified registered model.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `name` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRequestId` (`String`) — Name of the registered model.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getRegisteredModelResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code GetRegisteredModelResponseDetails} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `getRegisteredModelResponseDetails` (`com.oracle.aidataplatform.dp.model.GetRegisteredModelResponseDetails`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-listartifacts"></a>`listArtifacts`
(Preview) Returns a list of artifacts.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `runId` (`String`) — The key of the Workspace

**Optional Parameters:**
- `path` (`String`) — ID of the run whose artifacts to list.
- `pageToken` (`String`) — Filter artifacts matching this path (a relative path from the root artifact directory).
- `opcRequestId` (`String`) — Token indicating the page of artifact results to fetch.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listArtifactsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code ArtifactList} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `artifactList` (`com.oracle.aidataplatform.dp.model.ArtifactList`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-listexperimentruns"></a>`listExperimentRuns`
(Preview) Returns a list of experiment runs in a workspace.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `listExperimentRunsDetails` (`com.oracle.aidataplatform.dp.model.ListExperimentRunsDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRequestId` (`String`) — Details of experiment runs to fetch.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listExperimentRunsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code ExperimentRunCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `experimentRunCollection` (`com.oracle.aidataplatform.dp.model.ExperimentRunCollection`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-listexperiments"></a>`listExperiments`
(Preview) Returns a list of experiments with the given details.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `listExperimentsDetails` (`com.oracle.aidataplatform.dp.model.ListExperimentsDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRequestId` (`String`) — Details of experiments to fetch.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listExperimentsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code ExperimentCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `experimentCollection` (`com.oracle.aidataplatform.dp.model.ExperimentCollection`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-listloggedmodels"></a>`listLoggedModels`
(Preview) Returns a list of logged models.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `listLoggedModelsDetails` (`com.oracle.aidataplatform.dp.model.ListLoggedModelsDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRequestId` (`String`) — Details of logged models to fetch.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listLoggedModelsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code LoggedModelCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `loggedModelCollection` (`com.oracle.aidataplatform.dp.model.LoggedModelCollection`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-listmodelversions"></a>`listModelVersions`
(Preview) Returns a list of model versions.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `filter` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `maxResults` (`Long`) — String filter condition, like "name LIKE 'my-model-name'". Single boolean condition, with string
- `pageToken` (`String`) — Maximum number of model versions to retrieve.
- `orderBy` (`String`) — Pagination token to go to the next page based on a previous search query.
- `opcRequestId` (`String`) — List of columns to be ordered by including model name, version, stage with an optional "DESC" or "ASC"
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listModelVersionsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code ModelVersionCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `modelVersionCollection` (`com.oracle.aidataplatform.dp.model.ModelVersionCollection`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-listregisteredmodels"></a>`listRegisteredModels`
(Preview) Returns a list of registered models in a workspace.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `filter` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `maxResults` (`Long`) — String filter condition, like "name LIKE 'my-model-name'". Interpreted in the backend
- `pageToken` (`String`) — Maximum number of models desired. Default is 100. Max threshold is 1000.
- `orderBy` (`String`) — Pagination token to go to the next page based on a previous search query.
- `opcRequestId` (`String`) — List of columns for ordering search results, which can include model name and last updated
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listRegisteredModelsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code RegisteredModelCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `registeredModelCollection` (`com.oracle.aidataplatform.dp.model.RegisteredModelCollection`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-logexperimentrunbatch"></a>`logExperimentRunBatch`
(Preview) Logs an experiment run batch.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `logExperimentRunBatchDetails` (`com.oracle.aidataplatform.dp.model.LogExperimentRunBatchDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details of an experiment run batch.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `logExperimentRunBatchResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code LogExperimentRunBatchResponseDetails} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `logExperimentRunBatchResponseDetails` (`com.oracle.aidataplatform.dp.model.LogExperimentRunBatchResponseDetails`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-logexperimentruninputs"></a>`logExperimentRunInputs`
(Preview) Logs experiment run inputs.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `logExperimentRunInputsDetails` (`com.oracle.aidataplatform.dp.model.LogExperimentRunInputsDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details of experiment run inputs.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `logExperimentRunInputsResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code LogExperimentRunInputsResponseDetails} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `logExperimentRunInputsResponseDetails` (`com.oracle.aidataplatform.dp.model.LogExperimentRunInputsResponseDetails`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-logexperimentrunmetric"></a>`logExperimentRunMetric`
(Preview) Logs an experiment run metric.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `logExperimentRunMetricDetails` (`com.oracle.aidataplatform.dp.model.LogExperimentRunMetricDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details of an experiment run metric.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `logExperimentRunMetricResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code LogExperimentRunMetricResponseDetails} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `logExperimentRunMetricResponseDetails` (`com.oracle.aidataplatform.dp.model.LogExperimentRunMetricResponseDetails`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-logexperimentrunmodel"></a>`logExperimentRunModel`
(Preview) Logs an experiment run model.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `logExperimentRunModelDetails` (`com.oracle.aidataplatform.dp.model.LogExperimentRunModelDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details of an experiment run model.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `logExperimentRunModelResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code LogExperimentRunModelResponseDetails} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `logExperimentRunModelResponseDetails` (`com.oracle.aidataplatform.dp.model.LogExperimentRunModelResponseDetails`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-logexperimentrunparam"></a>`logExperimentRunParam`
(Preview) Logs an experiment run parameter.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `logExperimentRunParamDetails` (`com.oracle.aidataplatform.dp.model.LogExperimentRunParamDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details of an experiment run parameter.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `logExperimentRunParamResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code LogExperimentRunParamResponseDetails} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `logExperimentRunParamResponseDetails` (`com.oracle.aidataplatform.dp.model.LogExperimentRunParamResponseDetails`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-renameregisteredmodel"></a>`renameRegisteredModel`
(Preview) Renames a registered model.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `renameRegisteredModelDetails` (`com.oracle.aidataplatform.dp.model.RenameRegisteredModelDetails`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details of a registered model rename.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `renameRegisteredModelResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code RenameRegisteredModelResponseDetails} instance.
- `renameRegisteredModelResponseDetails` (`com.oracle.aidataplatform.dp.model.RenameRegisteredModelResponseDetails`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-restoreexperiment"></a>`restoreExperiment`
(Preview) Restores an experiment.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `restoreExperimentDetails` (`com.oracle.aidataplatform.dp.model.RestoreExperimentDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRetryToken` (`String`) — Restore experiment details.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `restoreExperimentResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code RestoreExperimentResponseDetails} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `restoreExperimentResponseDetails` (`com.oracle.aidataplatform.dp.model.RestoreExperimentResponseDetails`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-restoreexperimentrun"></a>`restoreExperimentRun`
(Preview) Restores an experiment run.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `restoreExperimentRunDetails` (`com.oracle.aidataplatform.dp.model.RestoreExperimentRunDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRetryToken` (`String`) — Restore experiment run details.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `restoreExperimentRunResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code RestoreExperimentRunResponseDetails} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `restoreExperimentRunResponseDetails` (`com.oracle.aidataplatform.dp.model.RestoreExperimentRunResponseDetails`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-setexperimentruntag"></a>`setExperimentRunTag`
(Preview) Sets a tag on an experiment run.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `setExperimentRunTagDetails` (`com.oracle.aidataplatform.dp.model.SetExperimentRunTagDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRetryToken` (`String`) — Tag details to set on an experiment run.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `setExperimentRunTagResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code SetExperimentRunTagResponseDetails} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `setExperimentRunTagResponseDetails` (`com.oracle.aidataplatform.dp.model.SetExperimentRunTagResponseDetails`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-setexperimenttag"></a>`setExperimentTag`
(Preview) Sets a tag on an experiment.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `setExperimentTagDetails` (`com.oracle.aidataplatform.dp.model.SetExperimentTagDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRetryToken` (`String`) — Tag details to set on an experiment.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `setExperimentTagResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code SetExperimentTagResponseDetails} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `setExperimentTagResponseDetails` (`com.oracle.aidataplatform.dp.model.SetExperimentTagResponseDetails`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-setmodelversiontag"></a>`setModelVersionTag`
(Preview) Sets a tag on a model version.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `setModelVersionTagDetails` (`com.oracle.aidataplatform.dp.model.SetModelVersionTagDetails`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details of a model version tag.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `setModelVersionTagResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code SetModelVersionTagResponseDetails} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `setModelVersionTagResponseDetails` (`com.oracle.aidataplatform.dp.model.SetModelVersionTagResponseDetails`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-setregisteredmodeltag"></a>`setRegisteredModelTag`
(Preview) Sets a tag on a registered model.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `setRegisteredModelTagDetails` (`com.oracle.aidataplatform.dp.model.SetRegisteredModelTagDetails`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details of a registered model tag.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `setRegisteredModelTagResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code SetRegisteredModelTagResponseDetails} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `setRegisteredModelTagResponseDetails` (`com.oracle.aidataplatform.dp.model.SetRegisteredModelTagResponseDetails`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-transitionmodelversionstage"></a>`transitionModelVersionStage`
(Preview) Transitions a model version stage.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `transitionModelVersionStageDetails` (`com.oracle.aidataplatform.dp.model.TransitionModelVersionStageDetails`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details to transition a model version stage.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `transitionModelVersionStageResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code TransitionModelVersionStageResponseDetails} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `transitionModelVersionStageResponseDetails` (`com.oracle.aidataplatform.dp.model.TransitionModelVersionStageResponseDetails`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-updateexperiment"></a>`updateExperiment`
(Preview) Updates an experiment.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `updateExperimentDetails` (`com.oracle.aidataplatform.dp.model.UpdateExperimentDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRetryToken` (`String`) — Update experiment metadata.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateExperimentResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code UpdateExperimentResponseDetails} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `updateExperimentResponseDetails` (`com.oracle.aidataplatform.dp.model.UpdateExperimentResponseDetails`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-updateexperimentrun"></a>`updateExperimentRun`
(Preview) Updates an experiment run.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `updateExperimentRunDetails` (`com.oracle.aidataplatform.dp.model.UpdateExperimentRunDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRetryToken` (`String`) — Update experiment run details.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateExperimentRunResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code UpdateExperimentRunResponseDetails} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `updateExperimentRunResponseDetails` (`com.oracle.aidataplatform.dp.model.UpdateExperimentRunResponseDetails`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-updateexperimentruntags"></a>`updateExperimentRunTags`
(Preview) Updates tags on an experiment run.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `updateExperimentRunTagsDetails` (`com.oracle.aidataplatform.dp.model.UpdateExperimentRunTagsDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details of ExperimentRun tags.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateExperimentRunTagsResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code UpdateExperimentRunTagsResponseDetails} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `updateExperimentRunTagsResponseDetails` (`com.oracle.aidataplatform.dp.model.UpdateExperimentRunTagsResponseDetails`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-updateexperimenttags"></a>`updateExperimentTags`
(Preview) Updates tags on experiment.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `updateExperimentTagsDetails` (`com.oracle.aidataplatform.dp.model.UpdateExperimentTagsDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details of Experiment tags.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateExperimentTagsResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code UpdateExperimentTagsResponseDetails} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `updateExperimentTagsResponseDetails` (`com.oracle.aidataplatform.dp.model.UpdateExperimentTagsResponseDetails`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-updatemodelversion"></a>`updateModelVersion`
(Preview) Updates a model version

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `updateModelVersionDetails` (`com.oracle.aidataplatform.dp.model.UpdateModelVersionDetails`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details to update model version.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateModelVersionResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code UpdateModelVersionResponseDetails} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `updateModelVersionResponseDetails` (`com.oracle.aidataplatform.dp.model.UpdateModelVersionResponseDetails`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-updatemodelversiontags"></a>`updateModelVersionTags`
(Preview) Updates tags on a model version.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `updateModelVersionTagsDetails` (`com.oracle.aidataplatform.dp.model.UpdateModelVersionTagsDetails`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details of model version tags to update.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateModelVersionTagsResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code UpdateModelVersionTagsResponseDetails} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `updateModelVersionTagsResponseDetails` (`com.oracle.aidataplatform.dp.model.UpdateModelVersionTagsResponseDetails`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-updateregisteredmodel"></a>`updateRegisteredModel`
(Preview) Updates a registered model with the provided details.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `updateRegisteredModelDetails` (`com.oracle.aidataplatform.dp.model.UpdateRegisteredModelDetails`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details to update the registered model.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateRegisteredModelResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code UpdateRegisteredModelResponseDetails} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `updateRegisteredModelResponseDetails` (`com.oracle.aidataplatform.dp.model.UpdateRegisteredModelResponseDetails`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-updateregisteredmodeltags"></a>`updateRegisteredModelTags`
(Preview) Updates tags on a registered model.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `updateRegisteredModelTagsDetails` (`com.oracle.aidataplatform.dp.model.UpdateRegisteredModelTagsDetails`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details of registered model tags.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateRegisteredModelTagsResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code UpdateRegisteredModelTagsResponseDetails} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `updateRegisteredModelTagsResponseDetails` (`com.oracle.aidataplatform.dp.model.UpdateRegisteredModelTagsResponseDetails`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

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
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `contentPath` (`String`) — The key of the Workspace
- `createContentDetails` (`com.oracle.aidataplatform.dp.model.CreateContentDetails`) — The path to the notebook file.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Notebook content to create a new notebook.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `datalakeTenantId` (`String`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createContentResponse`

**Response Fields:**
- `location` (`String`) — The returned {@code Content} instance.
- `etag` (`String`) — URL for the new file.
- `opcWorkRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — The OCID of the asynchronous work request.
- `content` (`com.oracle.aidataplatform.dp.model.Content`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)


### <a id="notebookclient-createsession"></a>`createSession`
Creates a new session or returns an existing session if a session for the given path already exists.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `createSessionDetails` (`com.oracle.aidataplatform.dp.model.CreateSessionDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details to create a new session.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `datalakeTenantId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createSessionResponse`

**Response Fields:**
- `location` (`String`) — The returned {@code Session} instance.
- `etag` (`String`) — URL for session commands.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcWorkRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `session` (`com.oracle.aidataplatform.dp.model.Session`) — The OCID of the asynchronous work request.

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)


### <a id="notebookclient-deletecontent"></a>`deleteContent`
Deletes a notebook file or directory.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `contentPath` (`String`) — The key of the Workspace

**Optional Parameters:**
- `opcRequestId` (`String`) — The path to the notebook file.
- `ifMatch` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteContentResponse`

**Response Fields:**
- `location` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcWorkRequestId` (`String`) — URL for the deleted file.
- `opcRequestId` (`String`) — The OCID of the asynchronous work request.

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)


### <a id="notebookclient-deletesession"></a>`deleteSession`
Delete a session with given session ID.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `sessionId` (`String`) — The key of the Workspace

**Optional Parameters:**
- `opcRequestId` (`String`) — The ID of the Data Lake Notebook Session
- `ifMatch` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteSessionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)


### <a id="notebookclient-exportcontents"></a>`exportContents`
Exports the notebook file contents. You can optionally specify HTML or ipynb format through the request payload. If no format is specified, ipynb is used by default.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `contentPath` (`String`) — The key of the Workspace
- `exportContentsDetails` (`com.oracle.aidataplatform.dp.model.ExportContentsDetails`) — The path to the notebook file.

**Optional Parameters:**
- `opcRequestId` (`String`) — Payload to export contents of a file.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `exportContentsResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code ExportedContents} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `exportedContents` (`com.oracle.aidataplatform.dp.model.ExportedContents`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)


### <a id="notebookclient-getcontent"></a>`getContent`
Returns content for a given file or metadata for a directory. Directory content listing is not supported; requests with type=directory and content=1 return 400 and should use content=0 to retrieve directory metadata. You can optionally specify a type and/or format argument via URL parameter. When given, the Content service returns a model in the requested type and/or format. If the request cannot be satisfied, for example if type=text is requested, but the file is binary, then the request returns a 400 message and a JSON response with a Reason field identifying the issue. The value of the Reason field is ‘bad format’ or ‘bad type’, depending on what was requested.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `contentPath` (`String`) — The key of the Workspace

**Optional Parameters:**
- `opcRequestId` (`String`) — The path to the notebook file.
- `type` (`Type`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `format` (`Format`) — Content type. Either file, directory, or notebook.
- `content` (`Integer`) — The format in which content should be returned. Either text, base64, or JSON.
- `hash` (`Integer`) — Returns content based on param value. When set to 0, content is NOT returned. When set to 1, content is returned.
- `shouldUpdateRecent` (`Boolean`) — Returns hash hexdigest string of content and the hash algorithm. 0 for no hash, 1 for return hash. 0 is default. It may be ignored by the content manager.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getContentResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code Content} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `lastModified` (`java.util.Date`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `content` (`com.oracle.aidataplatform.dp.model.Content`) — Last modified date for file.

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)


### <a id="notebookclient-getsession"></a>`getSession`
Returns session details for a given session ID.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `sessionId` (`String`) — The key of the Workspace

**Optional Parameters:**
- `opcRequestId` (`String`) — The ID of the Data Lake Notebook Session
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getSessionResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code Session} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `session` (`com.oracle.aidataplatform.dp.model.Session`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)


### <a id="notebookclient-listsessions"></a>`listSessions`
Returns a list of all available sessions.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `clusterId` (`String`) — The key of the Workspace
- `path` (`String`) — Cluster ID attached to a session.
- `opcRequestId` (`String`) — Notebook file path attached to a session.
- `agentFlowKey` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `limit` (`Integer`) — Agent flow key of the attached agent flow.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `sortOrder` (`SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listSessionsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code SessionCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `sessionCollection` (`com.oracle.aidataplatform.dp.model.SessionCollection`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)


### <a id="notebookclient-modifycontent"></a>`modifyContent`
Renames a file or directory without re-uploading content.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `contentPath` (`String`) — The key of the Workspace
- `modifyContentDetails` (`com.oracle.aidataplatform.dp.model.ModifyContentDetails`) — The path to the notebook file.

**Optional Parameters:**
- `shouldUpdateRecent` (`Boolean`) — New path for file or directory.
- `ifMatch` (`String`) — A flag to identify if the recent list should be updated.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `modifyContentResponse`

**Response Fields:**
- `location` (`String`) — The returned {@code Content} instance.
- `etag` (`String`) — Updated URL for the file or directory.
- `opcWorkRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — The OCID of the asynchronous work request.
- `content` (`com.oracle.aidataplatform.dp.model.Content`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)


### <a id="notebookclient-patchsession"></a>`patchSession`
Patches a session with a given ID with the provided details. You can use this to rename a session.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `sessionId` (`String`) — The key of the Workspace
- `patchSessionDetails` (`com.oracle.aidataplatform.dp.model.PatchSessionDetails`) — The ID of the Data Lake Notebook Session

**Optional Parameters:**
- `ifMatch` (`String`) — Details to patch for an existing session.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `patchSessionResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code Session} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `session` (`com.oracle.aidataplatform.dp.model.Session`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)


### <a id="notebookclient-updatecontent"></a>`updateContent`
Updates the contents of an existing notebook with the provided details or saves a new notebook.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `contentPath` (`String`) — The key of the Workspace
- `updateContentDetails` (`com.oracle.aidataplatform.dp.model.UpdateContentDetails`) — The path to the notebook file.

**Optional Parameters:**
- `ifMatch` (`String`) — Details to update the notebook content model file.
- `shouldUpdateRecent` (`Boolean`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `opcRequestId` (`String`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateContentResponse`

**Response Fields:**
- `location` (`String`) — The returned {@code Content} instance.
- `etag` (`String`) — URL for the new file.
- `opcWorkRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — The OCID of the asynchronous work request.
- `content` (`com.oracle.aidataplatform.dp.model.Content`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

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
- `roleKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `addMemberToRoleDetails` (`com.oracle.aidataplatform.dp.model.AddMemberToRoleDetails`) — The unique key of the Role.

**Optional Parameters:**
- `ifMatch` (`String`) — The details of the assignee(s) to which a role is assigned.
- `opcRetryToken` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `addMemberToRoleResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Role (`RoleClient`)](#roleclient-client) • [Top](#top)


### <a id="roleclient-createrole"></a>`createRole`
Creates a role.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `createRoleDetails` (`com.oracle.aidataplatform.dp.model.CreateRoleDetails`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details for the new role.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createRoleResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code Role} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `role` (`com.oracle.aidataplatform.dp.model.Role`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Role (`RoleClient`)](#roleclient-client) • [Top](#top)


### <a id="roleclient-deleterole"></a>`deleteRole`
Deletes a role.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `roleKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `ifMatch` (`String`) — The unique key of the Role.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteRoleResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Role (`RoleClient`)](#roleclient-client) • [Top](#top)


### <a id="roleclient-getrole"></a>`getRole`
Returns detailed information about a role.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `roleKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `roleScope` (`com.oracle.aidataplatform.dp.model.GetRoleScopeType`) — The unique key of the Role.
- `opcRequestId` (`String`) — The scope of roles to be returned. Defaults to USER.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getRoleResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code Role} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `role` (`com.oracle.aidataplatform.dp.model.Role`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Role (`RoleClient`)](#roleclient-client) • [Top](#top)


### <a id="roleclient-listrolepermissions"></a>`listRolePermissions`
Returns a list of permissions for a given role.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `roleKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `permissionScope` (`com.oracle.aidataplatform.dp.model.ListRolePermissionScopeType`) — The unique key of the Role.
- `limit` (`Integer`) — The scope of role permissions to be returned. Defaults to ALL
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `opcRequestId` (`String`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated}
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listRolePermissionsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code RolePermissionCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `rolePermissionCollection` (`com.oracle.aidataplatform.dp.model.RolePermissionCollection`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to Role (`RoleClient`)](#roleclient-client) • [Top](#top)


### <a id="roleclient-listroles"></a>`listRoles`
Returns a list of roles.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `lifecycleState` (`com.oracle.aidataplatform.dp.model.Role.LifecycleState`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `displayName` (`String`) — A filter to return only resources that match the given lifecycle state. The
- `limit` (`Integer`) — A filter to return only resources that match the given display name exactly.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `opcRequestId` (`String`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated}
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listRolesResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code RoleCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `roleCollection` (`com.oracle.aidataplatform.dp.model.RoleCollection`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to Role (`RoleClient`)](#roleclient-client) • [Top](#top)


### <a id="roleclient-removememberfromrole"></a>`removeMemberFromRole`
Revoke a role from a given user or group.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `roleKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `removeMemberFromRoleDetails` (`com.oracle.aidataplatform.dp.model.RemoveMemberFromRoleDetails`) — The unique key of the Role.

**Optional Parameters:**
- `ifMatch` (`String`) — The details of the user or group from which the role is to be revoked.
- `opcRetryToken` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `removeMemberFromRoleResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Role (`RoleClient`)](#roleclient-client) • [Top](#top)


### <a id="roleclient-updaterole"></a>`updateRole`
Updates a role with the provided information.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `roleKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `updateRoleDetails` (`com.oracle.aidataplatform.dp.model.UpdateRoleDetails`) — The unique key of the Role.

**Optional Parameters:**
- `ifMatch` (`String`) — The information to be updated.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateRoleResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code Role} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `role` (`com.oracle.aidataplatform.dp.model.Role`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

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
- `createDataTableDetails` (`com.oracle.aidataplatform.dp.model.CreateDataTableDetails`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details for the new managed table with data.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createDataTableResponse`

**Response Fields:**
- `opcWorkRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.
- `opcRequestId` (`String`) — The OCID of the asynchronous work request.
- `aidpAsyncOperationKey` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-createschema"></a>`createSchema`
Creates a schema.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `createSchemaDetails` (`com.oracle.aidataplatform.dp.model.CreateSchemaDetails`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details for the new schema.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createSchemaResponse`

**Response Fields:**
- `location` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `contentLocation` (`String`) — URL for the created schema. The schema key is generated after this request is sent.
- `aidpAsyncOperationKey` (`String`) — Same as location.
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-createtable"></a>`createTable`
Creates a table.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `createTableDetails` (`com.oracle.aidataplatform.dp.model.CreateTableDetails`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `shouldUpdateRecent` (`Boolean`) — Details for the new table.
- `opcRetryToken` (`String`) — A flag to identify if the recent list should be updated.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createTableResponse`

**Response Fields:**
- `location` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `contentLocation` (`String`) — URL for the created Table. The table key is generated after this request is sent.
- `aidpAsyncOperationKey` (`String`) — Same as location.
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-createview"></a>`createView`
Creates a view.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `createViewDetails` (`com.oracle.aidataplatform.dp.model.CreateViewDetails`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `shouldUpdateRecent` (`Boolean`) — Details for the new view.
- `opcRetryToken` (`String`) — A flag to identify if the recent list should be updated.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createViewResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code View} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `view` (`com.oracle.aidataplatform.dp.model.View`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-deleteschema"></a>`deleteSchema`
Deletes a schema.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `schemaKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `isForced` (`Boolean`) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.
- `ifMatch` (`String`) — A boolean which decides if an entity should be deleted with Cascade effect
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteSchemaResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-deletetable"></a>`deleteTable`
Deletes a table.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `tableKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `displayName` (`String`) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.
- `ifMatch` (`String`) — A filter to return only resources that match the given display name exactly.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteTableResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-deleteview"></a>`deleteView`
Deletes a view.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `viewKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `displayName` (`String`) — The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>.
- `ifMatch` (`String`) — A filter to return only resources that match the given display name exactly.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteViewResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-generatetempfileuploadtarget"></a>`generateTempFileUploadTarget`
Generates a URI for uploading a sample file to a temporary folder in a schema.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `schemaKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRequestId` (`String`) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `generateTempFileUploadTargetResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code GenerateTempFileUploadTargetResponseDetails} instance.
- `generateTempFileUploadTargetResponseDetails` (`com.oracle.aidataplatform.dp.model.GenerateTempFileUploadTargetResponseDetails`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-getschema"></a>`getSchema`
Returns detailed information about a specified schema.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `schemaKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `shouldSkipOcidTranslation` (`Boolean`) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.
- `opcRequestId` (`String`) — When true, skip user OCID translation and return raw OCIDs.
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getSchemaResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code Schema} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `schema` (`com.oracle.aidataplatform.dp.model.Schema`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-gettable"></a>`getTable`
Returns detailed information about a table.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `tableKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `shouldSkipOcidTranslation` (`Boolean`) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.
- `opcRequestId` (`String`) — When true, skip user OCID translation and return raw OCIDs.
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getTableResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code Table} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `table` (`com.oracle.aidataplatform.dp.model.Table`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-getview"></a>`getView`
Returns information about a view.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `viewKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRequestId` (`String`) — The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>.
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getViewResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code View} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `view` (`com.oracle.aidataplatform.dp.model.View`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-listschemapermissions"></a>`listSchemaPermissions`
Returns a list of permissions for a given schema.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `schemaKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `limit` (`Integer`) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `opcRequestId` (`String`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listSchemaPermissionsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code SchemaPermissionCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `schemaPermissionCollection` (`com.oracle.aidataplatform.dp.model.SchemaPermissionCollection`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-listschemas"></a>`listSchemas`
Returns a list of schemas.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `catalogKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `shouldSkipOcidTranslation` (`Boolean`) — The key of the catalog.
- `displayName` (`String`) — When true, skip user OCID translation and return raw OCIDs.
- `limit` (`Integer`) — A filter to return only resources that match the given display name exactly.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `opcRequestId` (`String`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listSchemasResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code SchemaCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `schemaCollection` (`com.oracle.aidataplatform.dp.model.SchemaCollection`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-listtablepermissions"></a>`listTablePermissions`
Returns a list of permissions for a given table.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `tableKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `limit` (`Integer`) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `opcRequestId` (`String`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listTablePermissionsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code TablePermissionCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `tablePermissionCollection` (`com.oracle.aidataplatform.dp.model.TablePermissionCollection`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-listtables"></a>`listTables`
Returns a list of tables in a schema.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `catalogKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `schemaKey` (`String`) — The key of the catalog.

**Optional Parameters:**
- `shouldSkipOcidTranslation` (`Boolean`) — The fully qualified name of the Data Lake Schema in the format <catalog_name>.<schema_name>
- `displayName` (`String`) — When true, skip user OCID translation and return raw OCIDs.
- `limit` (`Integer`) — A filter to return only resources that match the given display name exactly.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `opcRequestId` (`String`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listTablesResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code TableCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `tableCollection` (`com.oracle.aidataplatform.dp.model.TableCollection`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-listviewpermissions"></a>`listViewPermissions`
Returns a list of view permissions.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `viewKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `limit` (`Integer`) — The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `opcRequestId` (`String`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listViewPermissionsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code ViewPermissionCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `viewPermissionCollection` (`com.oracle.aidataplatform.dp.model.ViewPermissionCollection`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-listviews"></a>`listViews`
Returns a list of views in a schema.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `catalogKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `schemaKey` (`String`) — The key of the catalog.

**Optional Parameters:**
- `displayName` (`String`) — The fully qualified name of the Data Lake Schema in the format <catalog_name>.<schema_name>
- `limit` (`Integer`) — A filter to return only resources that match the given display name exactly.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `opcRequestId` (`String`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listViewsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code ViewCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `viewCollection` (`com.oracle.aidataplatform.dp.model.ViewCollection`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-manageschemapermission"></a>`manageSchemaPermission`
Updates the permissions for a given schema.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `schemaKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `manageSchemaPermissionDetails` (`com.oracle.aidataplatform.dp.model.ManageSchemaPermissionDetails`) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.

**Optional Parameters:**
- `ifMatch` (`String`) — The information to be updated.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageSchemaPermissionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-managetablepermission"></a>`manageTablePermission`
Updates the permissions for a given table.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `tableKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `manageTablePermissionDetails` (`com.oracle.aidataplatform.dp.model.ManageTablePermissionDetails`) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.

**Optional Parameters:**
- `ifMatch` (`String`) — The information to be updated.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageTablePermissionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-manageviewpermission"></a>`manageViewPermission`
Updates permissions on a view.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `viewKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `manageViewPermissionDetails` (`com.oracle.aidataplatform.dp.model.ManageViewPermissionDetails`) — The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>.

**Optional Parameters:**
- `ifMatch` (`String`) — The information to be updated.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageViewPermissionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-performinferschema"></a>`performInferSchema`
Returns details of a table schema from the specified location.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `schemaKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `performInferSchemaDetails` (`com.oracle.aidataplatform.dp.model.PerformInferSchemaDetails`) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.

**Optional Parameters:**
- `opcRequestId` (`String`) — Details of the location from which the table schema can be inferred.
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `performInferSchemaResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code InferSchema} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `inferSchema` (`com.oracle.aidataplatform.dp.model.InferSchema`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-performinferschemawithpreview"></a>`performInferSchemaWithPreview`
Returns table schema and data from the specified location.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `schemaKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `performInferSchemaDetails` (`com.oracle.aidataplatform.dp.model.PerformInferSchemaDetails`) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.

**Optional Parameters:**
- `opcRequestId` (`String`) — Details of the location from which the table schema and data can be inferred.
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `performInferSchemaWithPreviewResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code InferSchemaWithPreview} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `inferSchemaWithPreview` (`com.oracle.aidataplatform.dp.model.InferSchemaWithPreview`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-refreshschema"></a>`refreshSchema`
Refreshes schema through the crawler.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `schemaKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `ifMatch` (`String`) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `opcRetryToken` (`String`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `refreshSchemaResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.
- `aidpAsyncOperationKey` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-refreshtable"></a>`refreshTable`
Refreshes a table through the crawler.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `tableKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `ifMatch` (`String`) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `opcRetryToken` (`String`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `refreshTableResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.
- `aidpAsyncOperationKey` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-retrievepar"></a>`retrievePar`
Retrieves PAR for the entities created.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `tableKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `ifMatch` (`String`) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `retrieveParResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code ParDetails} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `parDetails` (`com.oracle.aidataplatform.dp.model.ParDetails`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-updateschema"></a>`updateSchema`
Updates a schema.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `schemaKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `updateSchemaDetails` (`com.oracle.aidataplatform.dp.model.UpdateSchemaDetails`) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.

**Optional Parameters:**
- `shouldUpdateRecent` (`Boolean`) — The information to be updated.
- `ifMatch` (`String`) — A flag to identify if the recent list should be updated.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateSchemaResponse`

**Response Fields:**
- `opcWorkRequestId` (`String`) — The returned {@code Schema} instance.
- `opcRequestId` (`String`) — The OCID of the asynchronous work request.
- `etag` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `schema` (`com.oracle.aidataplatform.dp.model.Schema`) — For optimistic concurrency control. See {@code if-match}.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-updatetable"></a>`updateTable`
Updates a table with provided details.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `tableKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `updateTableDetails` (`com.oracle.aidataplatform.dp.model.UpdateTableDetails`) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.

**Optional Parameters:**
- `shouldUpdateRecent` (`Boolean`) — The information to be updated.
- `ifMatch` (`String`) — A flag to identify if the recent list should be updated.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateTableResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-updateview"></a>`updateView`
Updates a view with given information.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `viewKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `updateViewDetails` (`com.oracle.aidataplatform.dp.model.UpdateViewDetails`) — The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>.

**Optional Parameters:**
- `shouldUpdateRecent` (`Boolean`) — The update mode and information to be updated.
- `ifMatch` (`String`) — A flag to identify if the recent list should be updated.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateViewResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code View} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `view` (`com.oracle.aidataplatform.dp.model.View`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


## <a id="semanticcatalogclient-client"></a>Semantic Catalog (`SemanticCatalogClient`)
**Operations:**
- [`exportLineage`](#semanticcatalogclient-exportlineage)
- [`fetchEntityLineage`](#semanticcatalogclient-fetchentitylineage)

### <a id="semanticcatalogclient-exportlineage"></a>`exportLineage`
(Preview) Returns complete lineage for the provided anchor node in CSV format.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `exportLineageDetails` (`com.oracle.aidataplatform.dp.model.ExportLineageDetails`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRetryToken` (`String`) — The information needed to export lineage.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `ifMatch` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `exportLineageResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code java.io.InputStream} instance.
- `contentDisposition` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `inputStream` (`java.io.InputStream`) — Attachment filename in {@code AnchorNodeName_Timestamp.csv} format.

**Return:** [Back to Semantic Catalog (`SemanticCatalogClient`)](#semanticcatalogclient-client) • [Top](#top)


### <a id="semanticcatalogclient-fetchentitylineage"></a>`fetchEntityLineage`
(Preview) Returns lineage for a given entity object.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `fetchEntityLineageDetails` (`com.oracle.aidataplatform.dp.model.FetchEntityLineageDetails`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRetryToken` (`String`) — The information needed to obtain desired lineage.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `ifMatch` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `limit` (`Integer`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `fetchEntityLineageResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code EntityLineage} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `entityLineage` (`com.oracle.aidataplatform.dp.model.EntityLineage`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to Semantic Catalog (`SemanticCatalogClient`)](#semanticcatalogclient-client) • [Top](#top)


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
- `createUserSettingDetails` (`com.oracle.aidataplatform.dp.model.CreateUserSettingDetails`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRequestId` (`String`) — Details for the new setting.
- `opcRetryToken` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createUserSettingResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code UserSetting} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `userSetting` (`com.oracle.aidataplatform.dp.model.UserSetting`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to User Setting (`UserSettingClient`)](#usersettingclient-client) • [Top](#top)


### <a id="usersettingclient-deleteusersetting"></a>`deleteUserSetting`
(Preview) Deletes a user setting and its credentials from this AI Data Platform instance, freeing the default slot for that type.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `settingKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `ifMatch` (`String`) — The UUID of the user setting.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteUserSettingResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to User Setting (`UserSettingClient`)](#usersettingclient-client) • [Top](#top)


### <a id="usersettingclient-getusersetting"></a>`getUserSetting`
(Preview) Returns the full definition of user settings identified by its key, including type-specific payload and default flag.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `settingKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRequestId` (`String`) — The UUID of the user setting.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getUserSettingResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code UserSetting} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `userSetting` (`com.oracle.aidataplatform.dp.model.UserSetting`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to User Setting (`UserSettingClient`)](#usersettingclient-client) • [Top](#top)


### <a id="usersettingclient-listusersettings"></a>`listUserSettings`
(Preview) Returns a list of all user-specific configurations, with filters for setting type, default flag, and pagination when needed.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `settingType` (`SettingType`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `isDefault` (`Boolean`) — A filter to return only those settings whose value matches the given data type.
- `limit` (`Integer`) — A filter to return only resources that are default.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `displayName` (`String`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `opcRequestId` (`String`) — A filter to return only resources that match the given display name exactly.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listUserSettingsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code UserSettingCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `userSettingCollection` (`com.oracle.aidataplatform.dp.model.UserSettingCollection`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to User Setting (`UserSettingClient`)](#usersettingclient-client) • [Top](#top)


### <a id="usersettingclient-updateusersetting"></a>`updateUserSetting`
(Preview) Updates the metadata or payload of an existing user setting, letting you rotate credentials or change defaults.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `settingKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `updateUserSettingDetails` (`com.oracle.aidataplatform.dp.model.UpdateUserSettingDetails`) — The UUID of the user setting.

**Optional Parameters:**
- `opcRequestId` (`String`) — Details for the user setting to be updated.
- `ifMatch` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateUserSettingResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code UserSetting} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `userSetting` (`com.oracle.aidataplatform.dp.model.UserSetting`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

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
- `createVolumeDetails` (`com.oracle.aidataplatform.dp.model.CreateVolumeDetails`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details for the new volume.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createVolumeResponse`

**Response Fields:**
- `location` (`String`) — The returned {@code Volume} instance.
- `contentLocation` (`String`) — URL for the created volume. The volume key is generated after this request is sent.
- `etag` (`String`) — Same as location.
- `opcWorkRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — The OCID of the asynchronous work request.
- `volume` (`com.oracle.aidataplatform.dp.model.Volume`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-deletedir"></a>`deleteDir`
Deletes a directory in a volume.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `volumeKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `path` (`String`) — The key of the volume.

**Optional Parameters:**
- `opcRetryToken` (`String`) — The absolute path of the file or folder
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteDirResponse`

**Response Fields:**
- `opcWorkRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcRequestId` (`String`) — The OCID of the asynchronous work request.

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-deletefile"></a>`deleteFile`
Deletes a file or folder in a volume.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `volumeKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `path` (`String`) — The key of the volume.

**Optional Parameters:**
- `opcRequestId` (`String`) — The absolute path of the file or folder
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteFileResponse`

**Response Fields:**
- `opcWorkRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcRequestId` (`String`) — The OCID of the asynchronous work request.

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-deletevolume"></a>`deleteVolume`
Deletes a volume.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `volumeKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `ifMatch` (`String`) — The key of the volume.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteVolumeResponse`

**Response Fields:**
- `opcWorkRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcRequestId` (`String`) — The OCID of the asynchronous work request.

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-downloadfile"></a>`downloadFile`
Downloads a file from a volume.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `volumeKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `path` (`String`) — The key of the volume.

**Optional Parameters:**
- `opcRequestId` (`String`) — The absolute path of the file or folder
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `downloadFileResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code java.io.InputStream} instance.
- `inputStream` (`java.io.InputStream`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-downloadfilewithpar"></a>`downloadFileWithPar`
provide the par info for downloading the file for given path.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `volumeKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `path` (`String`) — The key of the volume.

**Optional Parameters:**
- `shouldGenerateNewPar` (`Boolean`) — The absolute path of the file or folder
- `opcRetryToken` (`String`) — Flag to toggle to generate short living par
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `downloadFileWithParResponse`

**Response Fields:**
- `location` (`String`) — The returned {@code DownloadFileWithParResult} instance.
- `contentLocation` (`String`) — URL for the uploaded volume file.
- `etag` (`String`) — Same as location.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `downloadFileWithParResult` (`com.oracle.aidataplatform.dp.model.DownloadFileWithParResult`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-getvolume"></a>`getVolume`
Returns detailed information about a volume.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `volumeKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRequestId` (`String`) — The key of the volume.
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getVolumeResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code Volume} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `volume` (`com.oracle.aidataplatform.dp.model.Volume`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-listfiles"></a>`listFiles`
Returns a list of files in a volume.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `volumeKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `path` (`String`) — The key of the volume.

**Optional Parameters:**
- `isRecursive` (`Boolean`) — The absolute path of the file or folder
- `displayName` (`String`) — A boolean which decides if nested files should be in the list files in volume response.
- `metadataKeys` (`String`) — A filter to return only resources that match the given display name exactly.
- `limit` (`Integer`) — Comma separated keys to have in list response.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `opcRequestId` (`String`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated}
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listFilesResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code VolumeFileCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `volumeFileCollection` (`com.oracle.aidataplatform.dp.model.VolumeFileCollection`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-listvolumepermissions"></a>`listVolumePermissions`
Returns a list of volume permissions.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `volumeKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `limit` (`Integer`) — The key of the volume.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `opcRequestId` (`String`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated}
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listVolumePermissionsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code VolumePermissionCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `volumePermissionCollection` (`com.oracle.aidataplatform.dp.model.VolumePermissionCollection`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-listvolumes"></a>`listVolumes`
Returns a list of volumes.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `catalogKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `schemaKey` (`String`) — The key of the catalog.

**Optional Parameters:**
- `displayName` (`String`) — The fully qualified name of the Data Lake Schema in the format <catalog_name>.<schema_name>
- `limit` (`Integer`) — A filter to return only resources that match the given display name exactly.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `opcRequestId` (`String`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated}
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listVolumesResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code VolumeCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `volumeCollection` (`com.oracle.aidataplatform.dp.model.VolumeCollection`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-makedir"></a>`makeDir`
Creates a directory in a volume.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `volumeKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `path` (`String`) — The key of the volume.

**Optional Parameters:**
- `description` (`String`) — The absolute path of the file or folder
- `opcRetryToken` (`String`) — The description of the folder.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `makeDirResponse`

**Response Fields:**
- `location` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `contentLocation` (`String`) — URL for the created folder.
- `opcRequestId` (`String`) — Same as location.

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-managevolumepermission"></a>`manageVolumePermission`
Updates the permissions on a volume.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `volumeKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `manageVolumePermissionDetails` (`com.oracle.aidataplatform.dp.model.ManageVolumePermissionDetails`) — The key of the volume.

**Optional Parameters:**
- `ifMatch` (`String`) — The information to be updated.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageVolumePermissionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-updatedir"></a>`updateDir`
Updates a directory in volume with the provided information.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `volumeKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `updateDirDetails` (`com.oracle.aidataplatform.dp.model.UpdateDirDetails`) — The key of the volume.
- `path` (`String`) — The information to be updated.

**Optional Parameters:**
- `opcRetryToken` (`String`) — The absolute path of the file or folder
- `ifMatch` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateDirResponse`

**Response Fields:**
- `location` (`String`) — The OCID of the asynchronous work request.
- `opcRequestId` (`String`) — URL for the deleted folder.
- `opcWorkRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-updatevolume"></a>`updateVolume`
Updates a volume with the provided information.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `volumeKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `updateVolumeDetails` (`com.oracle.aidataplatform.dp.model.UpdateVolumeDetails`) — The key of the volume.

**Optional Parameters:**
- `shouldUpdateRecent` (`Boolean`) — The information to be updated.
- `ifMatch` (`String`) — A flag to identify if the recent list should be updated.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateVolumeResponse`

**Response Fields:**
- `opcWorkRequestId` (`String`) — The returned {@code Volume} instance.
- `opcRequestId` (`String`) — The OCID of the asynchronous work request.
- `etag` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `volume` (`com.oracle.aidataplatform.dp.model.Volume`) — For optimistic concurrency control. See {@code if-match}.

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-uploadandextractvolumezip"></a>`uploadAndExtractVolumeZip`
Creates or updates an asynchronous volume ZIP upload and extraction operation. CREATE returns a PAR URL for uploading the ZIP bytes and an async operation key. UPDATE records the uploaded ZIP metadata so extraction can continue.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `volumeKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `uploadAndExtractZipDetails` (`com.oracle.aidataplatform.dp.model.UploadAndExtractZipDetails`) — The key of the volume.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details for uploading and extracting the volume ZIP file.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `uploadAndExtractVolumeZipResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — The returned {@code UploadAndExtractZipResult} instance.
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.
- `uploadAndExtractZipResult` (`com.oracle.aidataplatform.dp.model.UploadAndExtractZipResult`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-uploadfile"></a>`uploadFile`
Uploads a file to volume. If the file already exists, it is updated.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `volumeKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `uploadFileDetails` (`java.io.InputStream`) — The key of the volume.
- `path` (`String`) — Contents of the file to upload.

**Optional Parameters:**
- `isOverwrite` (`Boolean`) — The absolute path of the file or folder
- `shouldUpdateRecent` (`Boolean`) — A boolean which decides if overwrite is allowed
- `isUploadFileBase64Encoded` (`Boolean`) — A flag to identify if the recent list should be updated.
- `opcRetryToken` (`String`) — A flag to identify if the upload file is base64 encoded
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `uploadFileResponse`

**Response Fields:**
- `location` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `contentLocation` (`String`) — URL for the uploaded volume file.
- `etag` (`String`) — Same as location.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-uploadfilewithpar"></a>`uploadFileWithPar`
Uploads a volume file by generating PAR. If file exists, then it will be updated.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `volumeKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `uploadFileWithParDetails` (`com.oracle.aidataplatform.dp.model.UploadFileWithParDetails`) — The key of the volume.
- `path` (`String`) — Contents of the file to upload.

**Optional Parameters:**
- `isOverwrite` (`Boolean`) — The absolute path of the file or folder
- `shouldGenerateNewPar` (`Boolean`) — A boolean which decides if overwrite is allowed
- `shouldCreateRecursively` (`Boolean`) — Flag to toggle to generate short living par
- `shouldUpdateRecent` (`Boolean`) — A boolean which decides if parent directories should be created recursively during upload.
- `opcRetryToken` (`String`) — A flag to identify if the recent list should be updated.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `uploadFileWithParResponse`

**Response Fields:**
- `location` (`String`) — The returned {@code UploadFileWithParResult} instance.
- `contentLocation` (`String`) — URL for the uploaded volume file.
- `etag` (`String`) — Same as location.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `uploadFileWithParResult` (`com.oracle.aidataplatform.dp.model.UploadFileWithParResult`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-zipanddownloadvolumefolder"></a>`zipAndDownloadVolumeFolder`
Starts asynchronous creation of a ZIP archive for a volume folder. The response includes a PAR URL for downloading the archive after the operation succeeds.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `volumeKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `zipAndDownloadFolderDetails` (`com.oracle.aidataplatform.dp.model.ZipAndDownloadFolderDetails`) — The key of the volume.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details for zipping a volume folder for download.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `zipAndDownloadVolumeFolderResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — The returned {@code ZipAndDownloadFolderResult} instance.
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.
- `zipAndDownloadFolderResult` (`com.oracle.aidataplatform.dp.model.ZipAndDownloadFolderResult`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

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
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `jobRunKey` (`String`) — The key of the Workspace

**Optional Parameters:**
- `ifMatch` (`String`) — Job run key.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `opcRetryToken` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `shouldUpdateRecent` (`Boolean`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `cancelJobRunResponse`

**Response Fields:**
- `location` (`String`) — The returned {@code JobRun} instance.
- `contentLocation` (`String`) — URL for the created job run. The job run key is generated after this request is sent.
- `etag` (`String`) — Same as location.
- `opcWorkRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — The OCID of the asynchronous work request.
- `jobRun` (`com.oracle.aidataplatform.dp.model.JobRun`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-canceljobruns"></a>`cancelJobRuns`
Cancels all job runs for a given job.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `jobKey` (`String`) — The key of the Workspace

**Optional Parameters:**
- `ifMatch` (`String`) — Job key.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `opcRetryToken` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `cancelJobRunsResponse`

**Response Fields:**
- `opcWorkRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcRequestId` (`String`) — The OCID of the asynchronous work request.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-createjob"></a>`createJob`
Creates a job.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `createJobDetails` (`com.oracle.aidataplatform.dp.model.CreateJobDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details for the new job.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createJobResponse`

**Response Fields:**
- `location` (`String`) — The returned {@code Job} instance.
- `contentLocation` (`String`) — URL for the created job. The job key is generated after this request is sent.
- `etag` (`String`) — Same as location.
- `opcWorkRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — The OCID of the asynchronous work request.
- `job` (`com.oracle.aidataplatform.dp.model.Job`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-createjobrun"></a>`createJobRun`
Creates a job run.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `createJobRunDetails` (`com.oracle.aidataplatform.dp.model.CreateJobRunDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details for the new job run.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createJobRunResponse`

**Response Fields:**
- `location` (`String`) — The returned {@code JobRun} instance.
- `contentLocation` (`String`) — URL for the created job run. The job run key is generated after this request is sent.
- `etag` (`String`) — Same as location.
- `opcWorkRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — The OCID of the asynchronous work request.
- `jobRun` (`com.oracle.aidataplatform.dp.model.JobRun`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-deletejob"></a>`deleteJob`
Deletes a job.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `jobKey` (`String`) — The key of the Workspace

**Optional Parameters:**
- `ifMatch` (`String`) — Job key.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteJobResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-deletejobrun"></a>`deleteJobRun`
Deletes a job run.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `jobRunKey` (`String`) — The key of the Workspace

**Optional Parameters:**
- `ifMatch` (`String`) — Job run key.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteJobRunResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-exporttaskrunoutput"></a>`exportTaskRunOutput`
Exports task run output in HTML or ipynb format.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `taskRunKey` (`String`) — The key of the Workspace
- `taskRunOutputKey` (`String`) — Task run key.
- `exportTaskRunOutputDetails` (`com.oracle.aidataplatform.dp.model.ExportTaskRunOutputDetails`) — Task run output key.

**Optional Parameters:**
- `opcRequestId` (`String`) — Payload to export task run output to a file.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `exportTaskRunOutputResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code ExportedTaskRunOutputContents} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `exportedTaskRunOutputContents` (`com.oracle.aidataplatform.dp.model.ExportedTaskRunOutputContents`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-fetchoutput"></a>`fetchOutput`
Fetches the task run output from the runtime engine.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `taskRunKey` (`String`) — The key of the Workspace
- `fetchOutputDetails` (`com.oracle.aidataplatform.dp.model.FetchOutputDetails`) — Task run key.

**Optional Parameters:**
- `opcRequestId` (`String`) — Details for task run output retrieval.
- `opcRetryToken` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `fetchOutputResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code TaskRunOutput} instance.
- `etag` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `taskRunOutput` (`com.oracle.aidataplatform.dp.model.TaskRunOutput`) — For optimistic concurrency control. See {@code if-match}.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-getjob"></a>`getJob`
Returns detailed information about a given job.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `jobKey` (`String`) — The key of the Workspace

**Optional Parameters:**
- `opcRequestId` (`String`) — Job key.
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getJobResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code Job} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `job` (`com.oracle.aidataplatform.dp.model.Job`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-getjobrun"></a>`getJobRun`
Returns detailed information about a given job run.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `jobRunKey` (`String`) — The key of the Workspace

**Optional Parameters:**
- `opcRequestId` (`String`) — Job run key.
- `shouldIncludeTaskRunSummaries` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `shouldUpdateRecent` (`Boolean`) — A flag to identify if task run summaries should be included in the job run response. If omitted, the service applies its configured default behavior.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getJobRunResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code JobRun} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `jobRun` (`com.oracle.aidataplatform.dp.model.JobRun`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-gettaskrun"></a>`getTaskRun`
Returns detailed information about a task run with a given task run key.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `taskRunKey` (`String`) — The key of the Workspace

**Optional Parameters:**
- `opcRequestId` (`String`) — Task run key.
- `shouldIncludeTaskRunRetries` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getTaskRunResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code TaskRun} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `taskRun` (`com.oracle.aidataplatform.dp.model.TaskRun`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-listjobpermissions"></a>`listJobPermissions`
Returns a list of job permissions.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `jobKey` (`String`) — The key of the Workspace

**Optional Parameters:**
- `limit` (`Integer`) — Job key.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `opcRequestId` (`String`) — The field to sort by. You can provide only one sort order.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listJobPermissionsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code JobPermissionCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `jobPermissionCollection` (`com.oracle.aidataplatform.dp.model.JobPermissionCollection`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-listjobruns"></a>`listJobRuns`
Returns a detailed list of job runs.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `displayName` (`String`) — The key of the Workspace
- `jobKey` (`java.util.List<String>`) — A filter to return only resources that match the given display name exactly.
- `status` (`java.util.List<Status>`) — The field to filter based on job key.
- `timeCreatedGreaterThanOrEqualTo` (`java.util.Date`) — The field to filter based on state.
- `timeCreatedLessThanOrEqualTo` (`java.util.Date`) — Fetch objects from repository that were created after or at the exact timestamp provided in parameter
- `limit` (`Integer`) — Fetch objects from repository that were created before or at the exact timestamp provided in parameter.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a paginated List call.
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `opcRequestId` (`String`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listJobRunsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code JobRunCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcPrevPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `jobRunCollection` (`com.oracle.aidataplatform.dp.model.JobRunCollection`) — For list pagination. When this header appears in the response, previous pages of results remain.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-listjobs"></a>`listJobs`
Returns a list of jobs.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `displayName` (`String`) — The key of the Workspace
- `jobKey` (`java.util.List<String>`) — A filter to return only resources that match the given display name exactly.
- `displayNameContains` (`String`) — The field to filter based on job key.
- `path` (`String`) — A filter to return only resources that have a display name containing the text provided.
- `createdBy` (`String`) — The fully qualified path where the job is stored.
- `updatedBy` (`String`) — A filter to return only resources that are created by given user with username that matches exactly.
- `limit` (`Integer`) — A filter to return only resources that was last updated by given user with username that matches exactly.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a paginated List call.
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `opcRequestId` (`String`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listJobsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code JobCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcPrevPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `opcTotalItems` (`Integer`) — For list pagination. When this header appears in the response, previous pages of results remain.
- `jobCollection` (`com.oracle.aidataplatform.dp.model.JobCollection`) — For list pagination. This header provides total number of items available.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-listrecentjobruns"></a>`listRecentJobRuns`
Returns a list of the latest job runs for a given job key.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `jobKey` (`java.util.List<String>`) — The key of the Workspace

**Optional Parameters:**
- `recordCount` (`Integer`) — The field to filter based on job key.
- `limit` (`Integer`) — The number of records to fetch.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a paginated List call.
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `opcRequestId` (`String`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listRecentJobRunsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code JobRunCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `jobRunCollection` (`com.oracle.aidataplatform.dp.model.JobRunCollection`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-listtaskrunretries"></a>`listTaskRunRetries`
Returns detailed information about retries of a task run with a given task run key.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `taskRunKey` (`String`) — The key of the Workspace

**Optional Parameters:**
- `displayName` (`String`) — Task run key.
- `status` (`java.util.List<Status>`) — A filter to return only resources that match the given display name exactly.
- `limit` (`Integer`) — The field to filter based on state.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `opcRequestId` (`String`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listTaskRunRetriesResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code TaskRunRetryCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcPrevPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `taskRunRetryCollection` (`com.oracle.aidataplatform.dp.model.TaskRunRetryCollection`) — For list pagination. When this header appears in the response, previous pages of results remain.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-listtaskruns"></a>`listTaskRuns`
Returns a list of task runs.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `jobRunKey` (`String`) — The key of the Workspace

**Optional Parameters:**
- `displayName` (`String`) — The field to filter based on job run key.
- `status` (`java.util.List<Status>`) — A filter to return only resources that match the given display name exactly.
- `parentJobRunKey` (`String`) — The field to filter based on state.
- `rootJobRunKey` (`String`) — The field to filter based on parent job run key.
- `limit` (`Integer`) — The field to filter based on root job run key.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a paginated List call.
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `opcRequestId` (`String`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listTaskRunsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code TaskRunCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcPrevPage` (`String`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
- `taskRunCollection` (`com.oracle.aidataplatform.dp.model.TaskRunCollection`) — For list pagination. When this header appears in the response, previous pages of results remain.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-managejobpermission"></a>`manageJobPermission`
Update job permissions with the provided details.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `jobKey` (`String`) — The key of the Workspace
- `manageJobPermissionDetails` (`com.oracle.aidataplatform.dp.model.ManageJobPermissionDetails`) — Job key.

**Optional Parameters:**
- `ifMatch` (`String`) — The information to be updated.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageJobPermissionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-repairjobrun"></a>`repairJobRun`
Repairs and reruns a job run.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `jobRunKey` (`String`) — The key of the Workspace
- `repairJobRunDetails` (`com.oracle.aidataplatform.dp.model.RepairJobRunDetails`) — Job run key.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details of the job run to be repaired.
- `shouldUpdateRecent` (`Boolean`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `ifMatch` (`String`) — A flag to identify if the recent list should be updated.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `repairJobRunResponse`

**Response Fields:**
- `location` (`String`) — The returned {@code JobRun} instance.
- `contentLocation` (`String`) — URL for the created/repaired job run. The job run key is generated after this request is sent.
- `etag` (`String`) — Same as location.
- `opcWorkRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — The OCID of the asynchronous work request.
- `jobRun` (`com.oracle.aidataplatform.dp.model.JobRun`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-updatejob"></a>`updateJob`
Updates details for a job.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `jobKey` (`String`) — The key of the Workspace
- `updateJobDetails` (`com.oracle.aidataplatform.dp.model.UpdateJobDetails`) — Job key.

**Optional Parameters:**
- `ifMatch` (`String`) — The information to be updated.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateJobResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code Job} instance.
- `etag` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `job` (`com.oracle.aidataplatform.dp.model.Job`) — For optimistic concurrency control. See {@code if-match}.

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
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `createGitFolderDetails` (`com.oracle.aidataplatform.dp.model.CreateGitFolderDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRetryToken` (`String`) — The information to be updated.
- `ifMatch` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createGitFolderResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — The returned {@code GitFolder} instance.
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.
- `etag` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `gitFolder` (`com.oracle.aidataplatform.dp.model.GitFolder`) — For optimistic concurrency control. See {@code if-match}.

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)


### <a id="workspaceclient-createworkspace"></a>`createWorkspace`
Creates a workspace.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `createWorkspaceDetails` (`com.oracle.aidataplatform.dp.model.CreateWorkspaceDetails`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details for the new workspace.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createWorkspaceResponse`

**Response Fields:**
- `location` (`String`) — The returned {@code Workspace} instance.
- `contentLocation` (`String`) — URL for the created workspace. The workspace key is generated after this request is sent.
- `etag` (`String`) — Same as location.
- `aidpAsyncOperationKey` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.
- `workspace` (`com.oracle.aidataplatform.dp.model.Workspace`) — Unique Oracle-assigned identifier for the request. If you need to contact

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)


### <a id="workspaceclient-deleteworkspace"></a>`deleteWorkspace`
Deletes a workspace.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `ifMatch` (`String`) — The key of the Workspace
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `timeDataLakeDeletion` (`java.util.Date`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteWorkspaceResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)


### <a id="workspaceclient-getworkspace"></a>`getWorkspace`
Gets detailed information about a workspace.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `opcRequestId` (`String`) — The key of the Workspace
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getWorkspaceResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code Workspace} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `workspace` (`com.oracle.aidataplatform.dp.model.Workspace`) — Unique Oracle-assigned identifier for the request. If you need to contact

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)


### <a id="workspaceclient-listcreateworkspacepermissions"></a>`listCreateWorkspacePermissions`
Gets a list of create workspace permission summary objects.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `limit` (`Integer`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `opcRequestId` (`String`) — The field to sort by. You can provide only one sort order. Default order for {@code granteeName}
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listCreateWorkspacePermissionsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code CreateWorkspacePermissionCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `createWorkspacePermissionCollection` (`com.oracle.aidataplatform.dp.model.CreateWorkspacePermissionCollection`) — For list pagination. When this header appears in the response, additional pages of results remain. For

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)


### <a id="workspaceclient-listworkspacepermissions"></a>`listWorkspacePermissions`
Gets a list of workspace permissions.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `limit` (`Integer`) — The key of the Workspace
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `opcRequestId` (`String`) — The field to sort by. You can provide only one sort order. Default order for {@code granteeName}
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listWorkspacePermissionsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code WorkspacePermissionCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `workspacePermissionCollection` (`com.oracle.aidataplatform.dp.model.WorkspacePermissionCollection`) — For list pagination. When this header appears in the response, additional pages of results remain. For

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)


### <a id="workspaceclient-listworkspaces"></a>`listWorkspaces`
Gets a list of workspaces.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `lifecycleState` (`com.oracle.aidataplatform.dp.model.Workspace.LifecycleState`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `displayName` (`String`) — A filter to return only resources that match the given lifecycle state. The
- `displayNameContains` (`String`) — A filter to return only resources that match the given display name exactly.
- `type` (`com.oracle.aidataplatform.dp.model.Workspace.Type`) — A filter to return only resources that have a display name containing the text provided.
- `limit` (`Integer`) — When no value is provided, all workspaces are returned. Otherwise, workspace of selected value is returned.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `isPrivateNetworkEnabled` (`Boolean`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated}
- `opcRequestId` (`String`) — A flag to filter the workspaces which are private network enabled or disabled
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listWorkspacesResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code WorkspaceCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `workspaceCollection` (`com.oracle.aidataplatform.dp.model.WorkspaceCollection`) — For list pagination. When this header appears in the response, additional pages of results remain. For

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)


### <a id="workspaceclient-managecreateworkspacepermission"></a>`manageCreateWorkspacePermission`
Updates create workspace permissions on a workspace.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `manageCreateWorkspacePermissionDetails` (`com.oracle.aidataplatform.dp.model.ManageCreateWorkspacePermissionDetails`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.

**Optional Parameters:**
- `ifMatch` (`String`) — The information to be updated.
- `opcRetryToken` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageCreateWorkspacePermissionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)


### <a id="workspaceclient-manageworkspacepermission"></a>`manageWorkspacePermission`
Updates permissions on a workspace.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `manageWorkspacePermissionDetails` (`com.oracle.aidataplatform.dp.model.ManageWorkspacePermissionDetails`) — The key of the Workspace

**Optional Parameters:**
- `ifMatch` (`String`) — The information to be updated.
- `opcRetryToken` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageWorkspacePermissionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)


### <a id="workspaceclient-updateworkspace"></a>`updateWorkspace`
Updates the details of a workspace.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `updateWorkspaceDetails` (`com.oracle.aidataplatform.dp.model.UpdateWorkspaceDetails`) — The key of the Workspace

**Optional Parameters:**
- `ifMatch` (`String`) — The information to be updated.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateWorkspaceResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — The returned {@code Workspace} instance.
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.
- `etag` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `workspace` (`com.oracle.aidataplatform.dp.model.Workspace`) — For optimistic concurrency control. See {@code if-match}.

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)


### <a id="workspaceclient-updateworkspaceasyncoperationstatus"></a>`updateWorkspaceAsyncOperationStatus`
Updates the status of a workspace.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `asyncOperationKey` (`String`) — The key of the Workspace
- `updateWorkspaceAsyncOperationStatusDetails` (`com.oracle.aidataplatform.dp.model.UpdateWorkspaceAsyncOperationStatusDetails`) — The unique identifier of an async operation

**Optional Parameters:**
- `ifMatch` (`String`) — The information to be updated.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateWorkspaceAsyncOperationStatusResponse`

**Response Fields:**
- `opcWorkRequestId` (`String`) — The returned {@code Workspace} instance.
- `opcRequestId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the asynchronous work request.
- `etag` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `workspace` (`com.oracle.aidataplatform.dp.model.Workspace`) — For optimistic concurrency control. See {@code if-match}.

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
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `copyWorkspaceObjectDetails` (`com.oracle.aidataplatform.dp.model.CopyWorkspaceObjectDetails`) — The key of the Workspace

**Optional Parameters:**
- `ifMatch` (`String`) — Details for copying the workspace object to a different path.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `copyWorkspaceObjectResponse`

**Response Fields:**
- `opcWorkRequestId` (`String`) — The returned {@code WorkspaceObjectDetails} instance.
- `opcRequestId` (`String`) — The OCID of the asynchronous work request.
- `etag` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `workspaceObjectDetails` (`com.oracle.aidataplatform.dp.model.WorkspaceObjectDetails`) — For optimistic concurrency control. See {@code if-match}.

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)


### <a id="workspaceobjectclient-createworkspaceobject"></a>`createWorkspaceObject`
Creates a workspace object. You can create a file or folder in the workspace.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `createWorkspaceObjectDetails` (`java.io.InputStream`) — The key of the Workspace
- `path` (`String`) — Details for the new workspace object.

**Optional Parameters:**
- `type` (`String`) — The absolute path of the file or folder
- `opcRetryToken` (`String`) — The type of workspace object.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `isUploadFileBase64Encoded` (`Boolean`) — A flag to identify if the recent list should be updated.
- `isOverwrite` (`Boolean`) — A flag to identify if the upload file is base64 encoded
- `objectDescription` (`String`) — A boolean which decides if overwrite is allowed
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createWorkspaceObjectResponse`

**Response Fields:**
- `location` (`String`) — The returned {@code java.io.InputStream} instance.
- `contentLocation` (`String`) — URL for the created workspace object. The workspace object key is generated after this request is sent.
- `etag` (`String`) — Same as location.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `objectKey` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `path` (`String`) — Unique key of the object.
- `type` (`String`) — The full path of the object.
- `timeUpdated` (`java.util.Date`) — Type of the object
- `inputStream` (`java.io.InputStream`) — The date and time when Workspace Object was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)


### <a id="workspaceobjectclient-deleteworkspaceobject"></a>`deleteWorkspaceObject`
Deletes a workspace object.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `objectPath` (`String`) — The key of the Workspace

**Optional Parameters:**
- `ifMatch` (`String`) — The fully qualified path of the workspace object.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteWorkspaceObjectResponse`

**Response Fields:**
- `opcWorkRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `opcRequestId` (`String`) — The OCID of the asynchronous work request.

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)


### <a id="workspaceobjectclient-downloadworkspaceobjectwithpar"></a>`downloadWorkspaceObjectWithPar`
Downloads a workspace file by providing the PAR info for downloading the file for given path.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `path` (`String`) — The key of the Workspace

**Optional Parameters:**
- `shouldGenerateNewPar` (`Boolean`) — The absolute path of the file or folder
- `opcRetryToken` (`String`) — Flag to toggle to generate short living par
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `type` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `shouldUpdateRecent` (`Boolean`) — The type of workspace object.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `downloadWorkspaceObjectWithParResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code DownloadFileWithParResult} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `objectKey` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `path` (`String`) — Unique key of the object
- `type` (`String`) — The full path of the object
- `timeUpdated` (`java.util.Date`) — Type of the object
- `downloadFileWithParResult` (`com.oracle.aidataplatform.dp.model.DownloadFileWithParResult`) — The date and time when Workspace Object was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)


### <a id="workspaceobjectclient-getworkspaceobject"></a>`getWorkspaceObject`
Returns detailed information about a workspace object.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `objectPath` (`String`) — The key of the Workspace

**Optional Parameters:**
- `shouldIncludeMetadata` (`Boolean`) — The fully qualified path of the workspace object.
- `opcRequestId` (`String`) — Path to list all metadata for a file or folder.
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getWorkspaceObjectResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code java.io.InputStream} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `objectKey` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `path` (`String`) — Unique key of the object.
- `type` (`String`) — The full path of the object.
- `timeUpdated` (`java.util.Date`) — Type of the object
- `inputStream` (`java.io.InputStream`) — The date and time when Workspace Object was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)


### <a id="workspaceobjectclient-headworkspaceobject"></a>`headWorkspaceObject`
Returns metadata about a workspace object. The contents of the file are not retrieved.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `objectPath` (`String`) — The key of the Workspace

**Optional Parameters:**
- `shouldIncludeMetadata` (`Boolean`) — The fully qualified path of the workspace object.
- `opcRequestId` (`String`) — Path to list all metadata for a file or folder.
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `headWorkspaceObjectResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The file composite (data + metadata) etag.
- `objectKey` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `path` (`String`) — Unique key of the object.
- `type` (`String`) — The full path of the object.
- `timeUpdated` (`java.util.Date`) — Type of the object
- `fileMetadata` (`String`) — The date and time when Workspace Object was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
- `compositeEtag` (`String`) — File metadata of the file.

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)


### <a id="workspaceobjectclient-listworkspaceobjectpermissions"></a>`listWorkspaceObjectPermissions`
Returns a list of workspace object permissions.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `objectKey` (`String`) — The key of the Workspace

**Optional Parameters:**
- `limit` (`Integer`) — The key of the workspace object.
- `page` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `opcRequestId` (`String`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated}
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listWorkspaceObjectPermissionsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code WorkspaceObjectPermissionCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `workspaceObjectPermissionCollection` (`com.oracle.aidataplatform.dp.model.WorkspaceObjectPermissionCollection`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)


### <a id="workspaceobjectclient-listworkspaceobjects"></a>`listWorkspaceObjects`
Returns a list of objects in the workspace.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `path` (`String`) — The key of the Workspace

**Optional Parameters:**
- `type` (`String`) — The absolute path of the file or folder
- `displayName` (`String`) — Filter by object type. For example, NOTEBOOK, LIBRARY, or FILE.
- `limit` (`Integer`) — A filter to return only resources that match the given display name exactly.
- `metadataKeys` (`String`) — For list pagination. The maximum number of results per page, or items to return in a
- `page` (`String`) — Comma separated keys to have in list response.
- `sortOrder` (`com.oracle.aidataplatform.dp.model.SortOrder`) — For list pagination. The value of the opc-next-page response header from the previous
- `sortBy` (`SortBy`) — The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
- `opcRequestId` (`String`) — The field to sort by. You can provide only one sort order. Default order for {@code timeCreated}
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listWorkspaceObjectsResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code WorkspaceObjectCollection} instance.
- `opcNextPage` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `workspaceObjectCollection` (`com.oracle.aidataplatform.dp.model.WorkspaceObjectCollection`) — For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)


### <a id="workspaceobjectclient-manageworkspaceobjectpermission"></a>`manageWorkspaceObjectPermission`
Updates permissions on a workspace object.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `objectKey` (`String`) — The key of the Workspace
- `manageWorkspaceObjectPermissionDetails` (`com.oracle.aidataplatform.dp.model.ManageWorkspaceObjectPermissionDetails`) — The key of the workspace object.

**Optional Parameters:**
- `ifMatch` (`String`) — The information to be updated.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageWorkspaceObjectPermissionResponse`

**Response Fields:**
- `opcRequestId` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)


### <a id="workspaceobjectclient-moveworkspaceobject"></a>`moveWorkspaceObject`
Moves a workspace object to different location.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `moveWorkspaceObjectDetails` (`com.oracle.aidataplatform.dp.model.MoveWorkspaceObjectDetails`) — The key of the Workspace

**Optional Parameters:**
- `ifMatch` (`String`) — Details for moving the workspace object to a different path.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `moveWorkspaceObjectResponse`

**Response Fields:**
- `opcWorkRequestId` (`String`) — The returned {@code WorkspaceObjectDetails} instance.
- `opcRequestId` (`String`) — The OCID of the asynchronous work request.
- `etag` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `workspaceObjectDetails` (`com.oracle.aidataplatform.dp.model.WorkspaceObjectDetails`) — For optimistic concurrency control. See {@code if-match}.

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)


### <a id="workspaceobjectclient-renameworkspaceobject"></a>`renameWorkspaceObject`
Renames a workspace object.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `renameWorkspaceObjectDetails` (`com.oracle.aidataplatform.dp.model.RenameWorkspaceObjectDetails`) — The key of the Workspace

**Optional Parameters:**
- `shouldUpdateRecent` (`Boolean`) — Details for renaming the workspace object.
- `ifMatch` (`String`) — A flag to identify if the recent list should be updated.
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `renameWorkspaceObjectResponse`

**Response Fields:**
- `opcWorkRequestId` (`String`) — The returned {@code WorkspaceObjectDetails} instance.
- `opcRequestId` (`String`) — The OCID of the asynchronous work request.
- `etag` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `workspaceObjectDetails` (`com.oracle.aidataplatform.dp.model.WorkspaceObjectDetails`) — For optimistic concurrency control. See {@code if-match}.

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)


### <a id="workspaceobjectclient-updateworkspaceobject"></a>`updateWorkspaceObject`
Updates a workspace object with the provided information.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `objectPath` (`String`) — The key of the Workspace
- `updateWorkspaceObjectDetails` (`java.io.InputStream`) — The fully qualified path of the workspace object.

**Optional Parameters:**
- `objectDescription` (`String`) — The information to be updated.
- `ifMatch` (`String`) — The description of the workspace object
- `opcRequestId` (`String`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
- `shouldUpdateRecent` (`Boolean`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateWorkspaceObjectResponse`

**Response Fields:**
- `opcRequestId` (`String`) — The returned {@code java.io.InputStream} instance.
- `etag` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `objectKey` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `path` (`String`) — Unique key of the object.
- `type` (`String`) — The full path of the object.
- `timeUpdated` (`java.util.Date`) — Type of the object
- `inputStream` (`java.io.InputStream`) — The date and time when Workspace Object was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)


### <a id="workspaceobjectclient-uploadandextractworkspacezip"></a>`uploadAndExtractWorkspaceZip`
Creates or updates an asynchronous workspace ZIP upload and extraction operation. CREATE returns a PAR URL for uploading the ZIP bytes and an async operation key. UPDATE records the uploaded ZIP metadata so extraction can continue.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `uploadAndExtractZipDetails` (`com.oracle.aidataplatform.dp.model.UploadAndExtractZipDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details for uploading and extracting the workspace ZIP file.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `uploadAndExtractWorkspaceZipResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — The returned {@code UploadAndExtractZipResult} instance.
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.
- `uploadAndExtractZipResult` (`com.oracle.aidataplatform.dp.model.UploadAndExtractZipResult`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)


### <a id="workspaceobjectclient-uploadworkspaceobjectwithpar"></a>`uploadWorkspaceObjectWithPar`
Creates a workspace file by generating PAR or updates the metadata by close file. If file exists, then it will be updated.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `uploadFileWithParDetails` (`com.oracle.aidataplatform.dp.model.UploadFileWithParDetails`) — The key of the Workspace
- `path` (`String`) — Contents of the file to upload.

**Optional Parameters:**
- `isOverwrite` (`Boolean`) — The absolute path of the file or folder
- `shouldGenerateNewPar` (`Boolean`) — A boolean which decides if overwrite is allowed
- `shouldCreateRecursively` (`Boolean`) — Flag to toggle to generate short living par
- `shouldUpdateRecent` (`Boolean`) — A boolean which decides if parent directories should be created recursively during upload.
- `opcRetryToken` (`String`) — A flag to identify if the recent list should be updated.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `type` (`String`) — Unique Oracle-assigned identifier for the request. If you need to contact
- `objectDescription` (`String`) — The type of workspace object.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `uploadWorkspaceObjectWithParResponse`

**Response Fields:**
- `etag` (`String`) — The returned {@code UploadFileWithParResult} instance.
- `opcRequestId` (`String`) — For optimistic concurrency control. See {@code if-match}.
- `objectKey` (`String`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
- `path` (`String`) — Unique key of the object
- `type` (`String`) — The full path of the object
- `timeUpdated` (`java.util.Date`) — Type of the object
- `uploadFileWithParResult` (`com.oracle.aidataplatform.dp.model.UploadFileWithParResult`) — The date and time when Workspace Object was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)


### <a id="workspaceobjectclient-zipanddownloadworkspacefolder"></a>`zipAndDownloadWorkspaceFolder`
Starts asynchronous creation of a ZIP archive for a workspace folder. The response includes a PAR URL for downloading the archive after the operation succeeds.

**Required Parameters:**
- `aiDataPlatformId` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `workspaceKey` (`String`) — The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
- `zipAndDownloadFolderDetails` (`com.oracle.aidataplatform.dp.model.ZipAndDownloadFolderDetails`) — The key of the Workspace

**Optional Parameters:**
- `opcRetryToken` (`String`) — Details for zipping a workspace folder for download.
- `opcRequestId` (`String`) — A token that uniquely identifies a request so it can be retried in case of a timeout or
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `zipAndDownloadWorkspaceFolderResponse`

**Response Fields:**
- `aidpAsyncOperationKey` (`String`) — The returned {@code ZipAndDownloadFolderResult} instance.
- `opcRequestId` (`String`) — The key of the asynchronous operations associated with an AI Data Platform instance.
- `zipAndDownloadFolderResult` (`com.oracle.aidataplatform.dp.model.ZipAndDownloadFolderResult`) — Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)
