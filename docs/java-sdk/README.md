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
Copy an Agent.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `agentKey` (`string`) — The UUID of the Agent
- `copyAgentDetails` (`oci.aidataplatform_dp.models.CopyAgentDetails`) — Details for copying the agent

**Optional Parameters:**
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `copyAgentResponse`

**Response Fields:**
- `key` (string) — Gets the key of this Agent. The unique identifier (UUID) of the agent.
- `displayName` (string) — Gets the display_name of this Agent. Agent name.
- `workspaceKey` (string) — Gets the workspace_key of this Agent. The key of the workspace to which this agent belongs.
- `description` (string) — Gets the description of this Agent. Agent description.
- `pathInfo` (string) — Gets the path_info of this Agent. Path inside volume where the agent JSON is written.
- `type` (string) — Gets the type of this Agent. The type of agent (Canvas or Code). Allowed values for this property are: "CANVAS", "CODE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `entryFilePath` (string) — Gets the entry_file_path of this Agent. The path to project entry file.
- `dependenciesFilePath` (string) — Gets the dependencies_file_path of this Agent. The path to dependencies file.
- `deploymentComputeKey` (string) — Gets the deployment_compute_key of this Agent. The key of the compute where agent is deployed.
- `deploymentMode` (string) — Gets the deployment_mode of this Agent. Agent deployment mode.
- `uri` (string) — Gets the uri of this Agent. Agent URI.
- `uriState` (string) — Gets the uri_state of this Agent. Agent URI state.
- `lifecycleState` (string) — Gets the lifecycle_state of this Agent. The current state of the agent. Allowed values for this property are: "DRAFT", "DEPLOYED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleDetails` (string) — Gets the lifecycle_details of this Agent. A message that describes the current state of the agent in more detail. For example, can be used to provide actionable information for a resource in the Failed state.
- `timeCreated` (datetime) — Gets the time_created of this Agent. The date and time the agent was created.
- `timeUpdated` (datetime) — Gets the time_updated of this Agent. The date and time the agent was updated.
- `createdBy` (string) — Gets the created_by of this Agent. The OCID of the user/principal who created the agent.
- `updatedBy` (string) — Gets the updated_by of this Agent. The ID of the user who last updated the schema.
- `computeKey` (string) — Gets the compute_key of this Agent. The key of the agent compute associated with this agent.
- `diagram` (oci.aidataplatform_dp.models.AgentDiagram) — Gets the diagram of this Agent.
- `guardrails` (oci.aidataplatform_dp.models.GuardrailsConfiguration) — Gets the guardrails of this Agent.
- `sessionConfig` (oci.aidataplatform_dp.models.SessionConfiguration) — Gets the session_config of this Agent.
- `agentCardConfig` (oci.aidataplatform_dp.models.AgentCardConfigDetail) — Gets the agent_card_config of this Agent.
- `version` (number) — Gets the version of this Agent. A number indicating the version of the record. Each time the record is updated, this version will be incremented. This will be used for optimistic locking.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-createagent"></a>`createAgent`
Create an Agent.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `createAgentDetails` (`oci.aidataplatform_dp.models.CreateAgentDetails`) — Details for the new Agent.

**Optional Parameters:**
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createAgentResponse`

**Response Fields:**
- `key` (string) — Gets the key of this Agent. The unique identifier (UUID) of the agent.
- `displayName` (string) — Gets the display_name of this Agent. Agent name.
- `workspaceKey` (string) — Gets the workspace_key of this Agent. The key of the workspace to which this agent belongs.
- `description` (string) — Gets the description of this Agent. Agent description.
- `pathInfo` (string) — Gets the path_info of this Agent. Path inside volume where the agent JSON is written.
- `type` (string) — Gets the type of this Agent. The type of agent (Canvas or Code). Allowed values for this property are: "CANVAS", "CODE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `entryFilePath` (string) — Gets the entry_file_path of this Agent. The path to project entry file.
- `dependenciesFilePath` (string) — Gets the dependencies_file_path of this Agent. The path to dependencies file.
- `deploymentComputeKey` (string) — Gets the deployment_compute_key of this Agent. The key of the compute where agent is deployed.
- `deploymentMode` (string) — Gets the deployment_mode of this Agent. Agent deployment mode.
- `uri` (string) — Gets the uri of this Agent. Agent URI.
- `uriState` (string) — Gets the uri_state of this Agent. Agent URI state.
- `lifecycleState` (string) — Gets the lifecycle_state of this Agent. The current state of the agent. Allowed values for this property are: "DRAFT", "DEPLOYED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleDetails` (string) — Gets the lifecycle_details of this Agent. A message that describes the current state of the agent in more detail. For example, can be used to provide actionable information for a resource in the Failed state.
- `timeCreated` (datetime) — Gets the time_created of this Agent. The date and time the agent was created.
- `timeUpdated` (datetime) — Gets the time_updated of this Agent. The date and time the agent was updated.
- `createdBy` (string) — Gets the created_by of this Agent. The OCID of the user/principal who created the agent.
- `updatedBy` (string) — Gets the updated_by of this Agent. The ID of the user who last updated the schema.
- `computeKey` (string) — Gets the compute_key of this Agent. The key of the agent compute associated with this agent.
- `diagram` (oci.aidataplatform_dp.models.AgentDiagram) — Gets the diagram of this Agent.
- `guardrails` (oci.aidataplatform_dp.models.GuardrailsConfiguration) — Gets the guardrails of this Agent.
- `sessionConfig` (oci.aidataplatform_dp.models.SessionConfiguration) — Gets the session_config of this Agent.
- `agentCardConfig` (oci.aidataplatform_dp.models.AgentCardConfigDetail) — Gets the agent_card_config of this Agent.
- `version` (number) — Gets the version of this Agent. A number indicating the version of the record. Each time the record is updated, this version will be incremented. This will be used for optimistic locking.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-deleteagent"></a>`deleteAgent`
Delete an Agent from the schema

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `agentKey` (`string`) — The UUID of the Agent

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteAgentResponse`

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-deleteagentdeployment"></a>`deleteAgentDeployment`
Delete an Agent Deployment.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `agentKey` (`string`) — The UUID of the Agent
- `agentDeploymentKey` (`string`) — The UUID of the Agent Deployment

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteAgentDeploymentResponse`

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-deleteagentsession"></a>`deleteAgentSession`
Delete an Agent Session.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `agentKey` (`string`) — The UUID of the Agent
- `sessionId` (`string`) — The UUID of the Agent Session

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteAgentSessionResponse`

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-deployagent"></a>`deployAgent`
Deploys an Agent.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `agentKey` (`string`) — The UUID of the Agent
- `deployAgentDetails` (`oci.aidataplatform_dp.models.DeployAgentDetails`) — Details of a deployable Agent.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deployAgentResponse`

**Response Fields:**
- `key` (string) — Gets the key of this AgentDeployment. Identifier, generally UUID.
- `displayName` (string) — Gets the display_name of this AgentDeployment. Display name.
- `agentKey` (string) — Gets the agent_key of this AgentDeployment. The Agent key for which the session is started.
- `agentComputeKey` (string) — Gets the agent_compute_key of this AgentDeployment. The Agent Compute Key where client can run or test the agent.
- `endpointUrl` (string) — Gets the endpoint_url of this AgentDeployment. The endpointUrl where the client should connect to communicate with the agent.
- `description` (string) — Gets the description of this AgentDeployment. deployment description.
- `deploymentType` (string) — Gets the deployment_type of this AgentDeployment. Type of an agent deployment. Allowed values for this property are: "TEST", "PROD", "CODE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleState` (string) — Gets the lifecycle_state of this AgentDeployment. LifecycleState of an Agent Session or Deployment. Allowed values for this property are: "CREATING", "ACTIVE", "INACTIVE", "FAILED", "DELETED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `deploymentVersion` (string) — Gets the deployment_version of this AgentDeployment. Version of agent deployed on compute.
- `timeCreated` (datetime) — Gets the time_created of this AgentDeployment. The date and time the Agent session was created.
- `createdBy` (string) — Gets the created_by of this AgentDeployment. The OCID of the user/principal who created the agent session.
- `timeUpdated` (datetime) — Gets the time_updated of this AgentDeployment. The date and time the agent deployment was updated.
- `updatedBy` (string) — Gets the updated_by of this AgentDeployment. The OCID of the user/principal who re-deployed the existing agent deployment.
- `sessionRetentionConfig` (oci.aidataplatform_dp.models.SessionRetentionConfiguration) — Gets the session_retention_config of this AgentDeployment.
- `oAuthConfig` (oci.aidataplatform_dp.models.OAuthConfiguration) — Gets the o_auth_config of this AgentDeployment.
- `agentCardUrl` (string) — Gets the agent_card_url of this AgentDeployment. AgentCard base URL.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-getagent"></a>`getAgent`
Returns detailed information about an Agent.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `agentKey` (`string`) — The UUID of the Agent

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getAgentResponse`

**Response Fields:**
- `key` (string) — Gets the key of this Agent. The unique identifier (UUID) of the agent.
- `displayName` (string) — Gets the display_name of this Agent. Agent name.
- `workspaceKey` (string) — Gets the workspace_key of this Agent. The key of the workspace to which this agent belongs.
- `description` (string) — Gets the description of this Agent. Agent description.
- `pathInfo` (string) — Gets the path_info of this Agent. Path inside volume where the agent JSON is written.
- `type` (string) — Gets the type of this Agent. The type of agent (Canvas or Code). Allowed values for this property are: "CANVAS", "CODE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `entryFilePath` (string) — Gets the entry_file_path of this Agent. The path to project entry file.
- `dependenciesFilePath` (string) — Gets the dependencies_file_path of this Agent. The path to dependencies file.
- `deploymentComputeKey` (string) — Gets the deployment_compute_key of this Agent. The key of the compute where agent is deployed.
- `deploymentMode` (string) — Gets the deployment_mode of this Agent. Agent deployment mode.
- `uri` (string) — Gets the uri of this Agent. Agent URI.
- `uriState` (string) — Gets the uri_state of this Agent. Agent URI state.
- `lifecycleState` (string) — Gets the lifecycle_state of this Agent. The current state of the agent. Allowed values for this property are: "DRAFT", "DEPLOYED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleDetails` (string) — Gets the lifecycle_details of this Agent. A message that describes the current state of the agent in more detail. For example, can be used to provide actionable information for a resource in the Failed state.
- `timeCreated` (datetime) — Gets the time_created of this Agent. The date and time the agent was created.
- `timeUpdated` (datetime) — Gets the time_updated of this Agent. The date and time the agent was updated.
- `createdBy` (string) — Gets the created_by of this Agent. The OCID of the user/principal who created the agent.
- `updatedBy` (string) — Gets the updated_by of this Agent. The ID of the user who last updated the schema.
- `computeKey` (string) — Gets the compute_key of this Agent. The key of the agent compute associated with this agent.
- `diagram` (oci.aidataplatform_dp.models.AgentDiagram) — Gets the diagram of this Agent.
- `guardrails` (oci.aidataplatform_dp.models.GuardrailsConfiguration) — Gets the guardrails of this Agent.
- `sessionConfig` (oci.aidataplatform_dp.models.SessionConfiguration) — Gets the session_config of this Agent.
- `agentCardConfig` (oci.aidataplatform_dp.models.AgentCardConfigDetail) — Gets the agent_card_config of this Agent.
- `version` (number) — Gets the version of this Agent. A number indicating the version of the record. Each time the record is updated, this version will be incremented. This will be used for optimistic locking.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-getagentdeployment"></a>`getAgentDeployment`
Returns detailed information about an Agent deployment.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `agentKey` (`string`) — The UUID of the Agent
- `agentDeploymentKey` (`string`) — The UUID of the Agent Deployment

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getAgentDeploymentResponse`

**Response Fields:**
- `key` (string) — Gets the key of this AgentDeployment. Identifier, generally UUID.
- `displayName` (string) — Gets the display_name of this AgentDeployment. Display name.
- `agentKey` (string) — Gets the agent_key of this AgentDeployment. The Agent key for which the session is started.
- `agentComputeKey` (string) — Gets the agent_compute_key of this AgentDeployment. The Agent Compute Key where client can run or test the agent.
- `endpointUrl` (string) — Gets the endpoint_url of this AgentDeployment. The endpointUrl where the client should connect to communicate with the agent.
- `description` (string) — Gets the description of this AgentDeployment. deployment description.
- `deploymentType` (string) — Gets the deployment_type of this AgentDeployment. Type of an agent deployment. Allowed values for this property are: "TEST", "PROD", "CODE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleState` (string) — Gets the lifecycle_state of this AgentDeployment. LifecycleState of an Agent Session or Deployment. Allowed values for this property are: "CREATING", "ACTIVE", "INACTIVE", "FAILED", "DELETED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `deploymentVersion` (string) — Gets the deployment_version of this AgentDeployment. Version of agent deployed on compute.
- `timeCreated` (datetime) — Gets the time_created of this AgentDeployment. The date and time the Agent session was created.
- `createdBy` (string) — Gets the created_by of this AgentDeployment. The OCID of the user/principal who created the agent session.
- `timeUpdated` (datetime) — Gets the time_updated of this AgentDeployment. The date and time the agent deployment was updated.
- `updatedBy` (string) — Gets the updated_by of this AgentDeployment. The OCID of the user/principal who re-deployed the existing agent deployment.
- `sessionRetentionConfig` (oci.aidataplatform_dp.models.SessionRetentionConfiguration) — Gets the session_retention_config of this AgentDeployment.
- `oAuthConfig` (oci.aidataplatform_dp.models.OAuthConfiguration) — Gets the o_auth_config of this AgentDeployment.
- `agentCardUrl` (string) — Gets the agent_card_url of this AgentDeployment. AgentCard base URL.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-getagentsession"></a>`getAgentSession`
Returns detailed information about an Agent Session.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `agentKey` (`string`) — The UUID of the Agent
- `sessionId` (`string`) — The UUID of the Agent Session

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getAgentSessionResponse`

**Response Fields:**
- `displayName` (string) — Gets the display_name of this AgentSession. Display name.
- `key` (string) — Gets the key of this AgentSession. Agent Session identifier.
- `agentKey` (string) — Gets the agent_key of this AgentSession. The Agent key for which the session is started.
- `endpointUrl` (string) — Gets the endpoint_url of this AgentSession. The endpointUrl where the client should connect to communicate with the agent.
- `lifecycleState` (string) — Gets the lifecycle_state of this AgentSession. LifecycleState of an Agent Session or Deployment. Allowed values for this property are: "CREATING", "ACTIVE", "INACTIVE", "FAILED", "DELETED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `agentComputeKey` (string) — Gets the agent_compute_key of this AgentSession. The Agent Compute Key where client can run or test the agent.
- `timeCreated` (datetime) — Gets the time_created of this AgentSession. The date and time the Agent session was created.
- `updatedBy` (string) — Gets the updated_by of this AgentSession. OCID of the user who updated this record
- `createdBy` (string) — Gets the created_by of this AgentSession. The OCID of the user/principal who created the agent session.
- `timeUpdated` (datetime) — Gets the time_updated of this AgentSession. The date and time the Agent session was updated.
- `timeStarted` (datetime) — Gets the time_started of this AgentSession. The date and time the session was started.
- `timeEnded` (datetime) — Gets the time_ended of this AgentSession. The date and time the session was ended.
- `context` (oci.aidataplatform_dp.models.AgentSessionContext) — Gets the context of this AgentSession.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-getagentsessiontrace"></a>`getAgentSessionTrace`
Returns trace details for a given message key.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `agentKey` (`string`) — The UUID of the Agent
- `sessionId` (`string`) — The UUID of the Agent Session
- `traceKey` (`string`) — A filter to return only resources that match the given display trace key exactly.

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getAgentSessionTraceResponse`

**Response Fields:**
- `traceId` (string) — Gets the trace_id of this TraceDetails. trace id
- `parentSessionId` (string) — Gets the parent_session_id of this TraceDetails. session id
- `spans` (list[oci.aidataplatform_dp.models.SpanDetails]) — Gets the spans of this TraceDetails. collections of spans
- `startTime` (number) — Gets the start_time of this TraceDetails. startTime
- `endTime` (number) — Gets the end_time of this TraceDetails. endTime
- `resources` (dict(str, object)) — Gets the resources of this TraceDetails. Map of properties

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-listagentdeployments"></a>`listAgentDeployments`
Returns a list of deployments of an agent.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `agentKey` (`string`) — The UUID of the Agent

**Optional Parameters:**
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `displayName` (`string`) — A filter to return only resources that match the given display name exactly.
- `displayNameContains` (`string`) — A filter to return only resources that have a display name containing the text provided.
- `lifecycleState` (`list[str]`) — A filter to return only resources whose value matches the given lifecycleState. Allowed values are: "CREATING", "ACTIVE", "INACTIVE", "FAILED", "DELETED"
- `timeCreatedGreaterThanOrEqualTo` (`datetime`) — Fetch objects from repository that were created after or at the exact timestamp provided in parameter
- `timeCreatedLessThanOrEqualTo` (`datetime`) — Fetch objects from repository that were created before or at the exact timestamp provided in parameter.
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `computeKey` (`list[str]`) — Compute key.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listAgentDeploymentsResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.AgentDeploymentSummary]) — Gets the items of this AgentDeploymentCollection. List of agent deployments.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-listagentpermissions"></a>`listAgentPermissions`
Returns a list of permissions for a given Agent.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `agentKey` (`string`) — The UUID of the Agent

**Optional Parameters:**
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listAgentPermissionsResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.AgentPermissionSummary]) — Gets the items of this AgentPermissionCollection. List of agent permissions.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-listagentsessionchathistories"></a>`listAgentSessionChatHistories`
Returns list of Agent Session chat messages.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `agentKey` (`string`) — The UUID of the Agent
- `sessionId` (`string`) — The UUID of the Agent Session

**Optional Parameters:**
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listAgentSessionChatHistoriesResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.SessionChatHistorySummary]) — Gets the items of this SessionChatHistoryCollection. Collection of chat messages

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-listagentsessions"></a>`listAgentSessions`
Returns a list of testing sessions of an Agent.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `agentKey` (`string`) — The UUID of the Agent

**Optional Parameters:**
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `displayNameContains` (`string`) — A filter to return only resources that have a display name containing the text provided.
- `timeCreatedGreaterThanOrEqualTo` (`datetime`) — Fetch objects from repository that were created after or at the exact timestamp provided in parameter
- `timeCreatedLessThanOrEqualTo` (`datetime`) — Fetch objects from repository that were created before or at the exact timestamp provided in parameter.
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listAgentSessionsResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.AgentSessionSummary]) — Gets the items of this AgentSessionCollection. List of agent sessions.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-listagents"></a>`listAgents`
Returns a list of Agents in a schema.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace

**Optional Parameters:**
- `computeKey` (`string`) — Compute key.
- `displayName` (`string`) — A filter to return only resources that match the given display name exactly.
- `displayNameContains` (`string`) — A filter to return only resources that have a display name containing the text provided.
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listAgentsResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.AgentInfo]) — Gets the items of this AgentCollection. List of Agents.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-manageagentpermission"></a>`manageAgentPermission`
Update the permissions for a given Agent.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `agentKey` (`string`) — The UUID of the Agent
- `manageAgentPermissionDetails` (`oci.aidataplatform_dp.models.ManageAgentPermissionDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageAgentPermissionResponse`

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-previewagentagentcard"></a>`previewAgentAgentCard`
Returns the agent card based on the given agent card configuration.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `previewAgentCardDetails` (`oci.aidataplatform_dp.models.PreviewAgentCardDetails`) — Request details for previewing an agent card

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `previewAgentAgentCardResponse`

**Response Fields:**
- `agentCardJson` (string) — Gets the agent_card_json of this AgentCardPreviewResponse. JSON string representation of AgentCard

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-redeployagentbykey"></a>`redeployAgentByKey`
Redeploys an Agent.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `agentKey` (`string`) — The UUID of the Agent
- `updateAgentDeploymentDetails` (`oci.aidataplatform_dp.models.UpdateAgentDeploymentDetails`) — Details for updating an Agent deployment asynchronously.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `redeployAgentByKeyResponse`

**Response Fields:**
- `key` (string) — Gets the key of this AgentDeployment. Identifier, generally UUID.
- `displayName` (string) — Gets the display_name of this AgentDeployment. Display name.
- `agentKey` (string) — Gets the agent_key of this AgentDeployment. The Agent key for which the session is started.
- `agentComputeKey` (string) — Gets the agent_compute_key of this AgentDeployment. The Agent Compute Key where client can run or test the agent.
- `endpointUrl` (string) — Gets the endpoint_url of this AgentDeployment. The endpointUrl where the client should connect to communicate with the agent.
- `description` (string) — Gets the description of this AgentDeployment. deployment description.
- `deploymentType` (string) — Gets the deployment_type of this AgentDeployment. Type of an agent deployment. Allowed values for this property are: "TEST", "PROD", "CODE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleState` (string) — Gets the lifecycle_state of this AgentDeployment. LifecycleState of an Agent Session or Deployment. Allowed values for this property are: "CREATING", "ACTIVE", "INACTIVE", "FAILED", "DELETED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `deploymentVersion` (string) — Gets the deployment_version of this AgentDeployment. Version of agent deployed on compute.
- `timeCreated` (datetime) — Gets the time_created of this AgentDeployment. The date and time the Agent session was created.
- `createdBy` (string) — Gets the created_by of this AgentDeployment. The OCID of the user/principal who created the agent session.
- `timeUpdated` (datetime) — Gets the time_updated of this AgentDeployment. The date and time the agent deployment was updated.
- `updatedBy` (string) — Gets the updated_by of this AgentDeployment. The OCID of the user/principal who re-deployed the existing agent deployment.
- `sessionRetentionConfig` (oci.aidataplatform_dp.models.SessionRetentionConfiguration) — Gets the session_retention_config of this AgentDeployment.
- `oAuthConfig` (oci.aidataplatform_dp.models.OAuthConfiguration) — Gets the o_auth_config of this AgentDeployment.
- `agentCardUrl` (string) — Gets the agent_card_url of this AgentDeployment. AgentCard base URL.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-updateagent"></a>`updateAgent`
Update an Agent with provided details.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `agentKey` (`string`) — The UUID of the Agent
- `updateAgentDetails` (`oci.aidataplatform_dp.models.UpdateAgentDetails`) — The information to be updated.

**Optional Parameters:**
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateAgentResponse`

**Response Fields:**
- `key` (string) — Gets the key of this Agent. The unique identifier (UUID) of the agent.
- `displayName` (string) — Gets the display_name of this Agent. Agent name.
- `workspaceKey` (string) — Gets the workspace_key of this Agent. The key of the workspace to which this agent belongs.
- `description` (string) — Gets the description of this Agent. Agent description.
- `pathInfo` (string) — Gets the path_info of this Agent. Path inside volume where the agent JSON is written.
- `type` (string) — Gets the type of this Agent. The type of agent (Canvas or Code). Allowed values for this property are: "CANVAS", "CODE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `entryFilePath` (string) — Gets the entry_file_path of this Agent. The path to project entry file.
- `dependenciesFilePath` (string) — Gets the dependencies_file_path of this Agent. The path to dependencies file.
- `deploymentComputeKey` (string) — Gets the deployment_compute_key of this Agent. The key of the compute where agent is deployed.
- `deploymentMode` (string) — Gets the deployment_mode of this Agent. Agent deployment mode.
- `uri` (string) — Gets the uri of this Agent. Agent URI.
- `uriState` (string) — Gets the uri_state of this Agent. Agent URI state.
- `lifecycleState` (string) — Gets the lifecycle_state of this Agent. The current state of the agent. Allowed values for this property are: "DRAFT", "DEPLOYED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleDetails` (string) — Gets the lifecycle_details of this Agent. A message that describes the current state of the agent in more detail. For example, can be used to provide actionable information for a resource in the Failed state.
- `timeCreated` (datetime) — Gets the time_created of this Agent. The date and time the agent was created.
- `timeUpdated` (datetime) — Gets the time_updated of this Agent. The date and time the agent was updated.
- `createdBy` (string) — Gets the created_by of this Agent. The OCID of the user/principal who created the agent.
- `updatedBy` (string) — Gets the updated_by of this Agent. The ID of the user who last updated the schema.
- `computeKey` (string) — Gets the compute_key of this Agent. The key of the agent compute associated with this agent.
- `diagram` (oci.aidataplatform_dp.models.AgentDiagram) — Gets the diagram of this Agent.
- `guardrails` (oci.aidataplatform_dp.models.GuardrailsConfiguration) — Gets the guardrails of this Agent.
- `sessionConfig` (oci.aidataplatform_dp.models.SessionConfiguration) — Gets the session_config of this Agent.
- `agentCardConfig` (oci.aidataplatform_dp.models.AgentCardConfigDetail) — Gets the agent_card_config of this Agent.
- `version` (number) — Gets the version of this Agent. A number indicating the version of the record. Each time the record is updated, this version will be incremented. This will be used for optimistic locking.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-updateagentdeploymentmetadata"></a>`updateAgentDeploymentMetadata`
Update the deployment metadata for an Agent.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `agentKey` (`string`) — The UUID of the Agent
- `updateAgentDeploymentMetadataDetails` (`oci.aidataplatform_dp.models.UpdateAgentDeploymentMetadataDetails`) — Agent card details to update

**Optional Parameters:**
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateAgentDeploymentMetadataResponse`

**Response Fields:**
- `key` (string) — Gets the key of this AgentDeployment. Identifier, generally UUID.
- `displayName` (string) — Gets the display_name of this AgentDeployment. Display name.
- `agentKey` (string) — Gets the agent_key of this AgentDeployment. The Agent key for which the session is started.
- `agentComputeKey` (string) — Gets the agent_compute_key of this AgentDeployment. The Agent Compute Key where client can run or test the agent.
- `endpointUrl` (string) — Gets the endpoint_url of this AgentDeployment. The endpointUrl where the client should connect to communicate with the agent.
- `description` (string) — Gets the description of this AgentDeployment. deployment description.
- `deploymentType` (string) — Gets the deployment_type of this AgentDeployment. Type of an agent deployment. Allowed values for this property are: "TEST", "PROD", "CODE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleState` (string) — Gets the lifecycle_state of this AgentDeployment. LifecycleState of an Agent Session or Deployment. Allowed values for this property are: "CREATING", "ACTIVE", "INACTIVE", "FAILED", "DELETED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `deploymentVersion` (string) — Gets the deployment_version of this AgentDeployment. Version of agent deployed on compute.
- `timeCreated` (datetime) — Gets the time_created of this AgentDeployment. The date and time the Agent session was created.
- `createdBy` (string) — Gets the created_by of this AgentDeployment. The OCID of the user/principal who created the agent session.
- `timeUpdated` (datetime) — Gets the time_updated of this AgentDeployment. The date and time the agent deployment was updated.
- `updatedBy` (string) — Gets the updated_by of this AgentDeployment. The OCID of the user/principal who re-deployed the existing agent deployment.
- `sessionRetentionConfig` (oci.aidataplatform_dp.models.SessionRetentionConfiguration) — Gets the session_retention_config of this AgentDeployment.
- `oAuthConfig` (oci.aidataplatform_dp.models.OAuthConfiguration) — Gets the o_auth_config of this AgentDeployment.
- `agentCardUrl` (string) — Gets the agent_card_url of this AgentDeployment. AgentCard base URL.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


### <a id="agentclient-validateagent"></a>`validateAgent`
Validate the agent json diagram generated by UI.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `agentKey` (`string`) — The UUID of the Agent

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `validateAgentResponse`

**Response Fields:**
- `isValidAgent` (boolean) — Gets the is_valid_agent of this ValidateAgentResponse. true if valid, else false
- `validationError` (list[oci.aidataplatform_dp.models.ValidationError]) — Gets the validation_error of this ValidateAgentResponse. List of validation errors encountered in the diagram.

**Return:** [Back to Agent (`AgentClient`)](#agentclient-client) • [Top](#top)


## <a id="asyncoperationsclient-client"></a>Async Operations (`AsyncOperationsClient`)
**Operations:**
- [`getAsyncOperation`](#asyncoperationsclient-getasyncoperation)
- [`listAsyncOperations`](#asyncoperationsclient-listasyncoperations)

### <a id="asyncoperationsclient-getasyncoperation"></a>`getAsyncOperation`
Get detailed information for a particular async operation

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `asyncOperationKey` (`string`) — The unique identifier of an async operation

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getAsyncOperationResponse`

**Response Fields:**
- `key` (string) — Gets the key of this AsyncOperation. The unique key that identifies an async operation
- `resourceType` (string) — Gets the resource_type of this AsyncOperation. The resource type of the async operation. Allowed values for this property are: "UNKNOWN", "CATALOG", "SCHEMA", "TABLE", "VIEW", "VOLUME", "VOLUME_FILE", "WORKSPACE", "WORKSPACE_OBJECT", "CLUSTER", "AI_COMPUTE", "KNOWLEDGE_BASE", "KNOWLEDGE_BASE_JOB", "KNOWLEDGE_BASE_JOB_RUN", "AGENT", "GIT_OPERATION", "BUNDLE_OPERATION", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `actionType` (string) — Gets the action_type of this AsyncOperation. The action type of the async operation. Allowed values for this property are: "UNKNOWN", "CREATE_CATALOG", "UPDATE_CATALOG", "DELETE_CATALOG", "TEST_CONNECTION_CATALOG", "CREATE_USER_SCHEMA_IN_CATALOG", "CREATE_SCHEMA", "DELETE_SCHEMA", "CREATE_TABLE", "UPDATE_TABLE", "DELETE_TABLE", "CREATE_VOLUME", "DELETE_VOLUME", "COPY_VOLUME_FILE", "MOVE_VOLUME_FILE", "DELETE_VOLUME_FILE", "DELETE_VOLUME_FOLDER", "LOAD_MODELS_IN_CATALOG", "CREATE_WORKSPACE", "UPDATE_WORKSPACE", "DELETE_WORKSPACE", "CREATE_CLUSTER", "UPDATE_CLUSTER", "START_CLUSTER", "STOP_CLUSTER", "RESTART_CLUSTER", "PATCH_CLUSTER_LIBRARIES", "DELETE_CLUSTER", "MANAGE_EXTRACTED_ENTITIES", "REFRESH_ENTITY", "DOWNLOAD_CLUSTER_LOG", "MIGRATE_EXTERNAL_CATALOG", "UPDATE_KNOWLEDGE_BASE", "DELETE_KNOWLEDGE_BASE", "CREATE_KNOWLEDGE_BASE", "DELETE_KNOWLEDGE_BASE_JOB", "CREATE_KNOWLEDGE_BASE_JOB", "CREATE_KNOWLEDGE_BASE_JOB_RUN", "DEPLOY_AGENT", "CREATE_GIT_FOLDER", "UPDATE_GIT_REPOSITORY", "CREATE_BUNDLE", "BUNDLE_DEPLOY", "BUNDLE_PURGE", "BUNDLE_SYNC", "MARK_AS_BUNDLE", "GIT_COMMIT_PUSH", "GIT_CREATE_BRANCH", "GIT_CHECKOUT_BRANCH", "GIT_OPERATION_PULL", "GIT_OPERATION_MERGE", "GIT_OPERATION_REBASE", "GIT_OPERATION_RESET", "GIT_OPERATION_RESET_STATE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `resourceName` (string) — Gets the resource_name of this AsyncOperation. The fully qualified name of the Data Lake resource. Example: For table, it is <catalog_name>.<schema_name>.<table_name>. For Cluster, it is <workspace_key>.<cluster_key>
- `resourceDisplayName` (string) — Gets the resource_display_name of this AsyncOperation. The display name of the Data Lake resource. Example: For catalog/table/schema, it is same as resourceName But for workspace/cluster it is workspace and cluster displayName field.
- `createdBy` (string) — Gets the created_by of this AsyncOperation. The principal Id who started the async operation
- `createdByName` (string) — Gets the created_by_name of this AsyncOperation. The principal name who started the async operation
- `timeStarted` (datetime) — Gets the time_started of this AsyncOperation. The date and time the Async operation was started, in the format defined by `RFC 3339`. Example: `2016-08-25T21:10:29.600Z`  https://tools.ietf.org/html/rfc3339
- `timeFinished` (datetime) — Gets the time_finished of this AsyncOperation. The date and time the Async operation finished, in the format defined by `RFC 3339`. Example: `2016-08-25T21:10:29.600Z`  https://tools.ietf.org/html/rfc3339
- `status` (string) — Gets the status of this AsyncOperation. The state of the Table. Allowed values for this property are: "IN_PROGRESS", "SUCCEEDED", "FAILED", "CANCELED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `errorCode` (string) — Gets the error_code of this AsyncOperation. Represents the error code of a failure
- `errorMessage` (string) — Gets the error_message of this AsyncOperation. Representss extra error information of a failure

**Return:** [Back to Async Operations (`AsyncOperationsClient`)](#asyncoperationsclient-client) • [Top](#top)


### <a id="asyncoperationsclient-listasyncoperations"></a>`listAsyncOperations`
List all async operations for a resource type. Filters can be used to narrow the search down.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

**Optional Parameters:**
- `resourceType` (`string`) — Required parameter which decides async operation resource type
- `resourceName` (`string`) — A filter to return only resources that match the given resource name exactly.
- `matchResourceName` (`boolean`) — Parameter which decides to list async operations with prefix or exact match to resourceName
- `status` (`string`) — Option parameter to filter operation on status
- `shouldFilterByCallingPrincipal` (`boolean`) — A filter to return only resources that match the current principal.
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Default order for `timeStarted` is descending. Allowed values are: "timeStarted"
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listAsyncOperationsResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.AsyncOperationSummary]) — Gets the items of this AsyncOperationCollection. List of Async Operations.

**Return:** [Back to Async Operations (`AsyncOperationsClient`)](#asyncoperationsclient-client) • [Top](#top)


## <a id="auditclient-client"></a>Audit (`AuditClient`)
**Operations:**
- [`manageAuditLogs`](#auditclient-manageauditlogs)
- [`searchAuditLogs`](#auditclient-searchauditlogs)

### <a id="auditclient-manageauditlogs"></a>`manageAuditLogs`
Manages audit logs.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `manageAuditLogsDetails` (`oci.aidataplatform_dp.models.ManageAuditLogsDetails`) — Details to update in an audit log.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageAuditLogsResponse`

**Return:** [Back to Audit (`AuditClient`)](#auditclient-client) • [Top](#top)


### <a id="auditclient-searchauditlogs"></a>`searchAuditLogs`
Searches audit logs.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `searchAuditLogsDetails` (`oci.aidataplatform_dp.models.SearchAuditLogsDetails`) — Details for the audit log search.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `searchAuditLogsResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.AuditLogSearchResultSummary]) — Gets the items of this AuditLogSearchResultCollection. Audit log search results.

**Return:** [Back to Audit (`AuditClient`)](#auditclient-client) • [Top](#top)


## <a id="bundleclient-client"></a>Bundle (`BundleClient`)
**Operations:**
- [`createBundle`](#bundleclient-createbundle)
- [`createBundleAction`](#bundleclient-createbundleaction)
- [`deployBundle`](#bundleclient-deploybundle)
- [`deployBundleAction`](#bundleclient-deploybundleaction)
- [`fetchBundleDeploymentStatus`](#bundleclient-fetchbundledeploymentstatus)
- [`fetchBundleDeploymentStatusAction`](#bundleclient-fetchbundledeploymentstatusaction)
- [`purgeBundle`](#bundleclient-purgebundle)
- [`purgeBundleAction`](#bundleclient-purgebundleaction)
- [`syncBundle`](#bundleclient-syncbundle)
- [`syncBundleAction`](#bundleclient-syncbundleaction)

### <a id="bundleclient-createbundle"></a>`createBundle`
(Deprecated) Creates a new bundle. A bundle is a self-contained, portable representation of selected workspace assets, such as jobs and agent flows, along with their dependencies and associated code artifacts. It captures both the resource configurations and the supporting assets required to recreate those resources in another workspace or environment. The bundle manifest is named `aidp_workbench.yaml`. The bundle preserves the workspace folder structure for code artifacts from the location where it was created, so the generated bundle mirrors the source layout. Dependencies are tracked inside the bundle under each asset type: - job and agent flow dependencies are added under the `dependencies` folder inside the `jobs` and `agentflows` folders - code dependencies are added under the `artifacts` directory in the bundle Dependency references use template variables, for example: - compute: `$${jobs.dependencies.training_compute.compute.key}` - nested jobs: `$${jobs.dependencies.training_job.job.key}` - aicompute: `$${jobs.dependencies.training_aicompute.aicompute.key}` Bundles also support the special variable `$${bundle.root}`, which points to the root of the bundle folder and is used for referencing artifacts. Variables and overrides: - bundles support parameterization using variables defined in the bundle manifest (`aidp_workbench.yaml`) Example manifest defaults: defaults: variables: job_compute_key: "$${jobs.dependencies.small.compute.key}" - variables can be referenced in resource descriptors using the `$${var.<name>}` syntax Example usage in a job descriptor: "clusterKey": "$${var.job_compute_key}" - workspace-specific overrides can be provided via `.aidp/overrides.yaml` inside the bundle - this file is intended for environment-specific configuration and should not be committed to Git, allowing the bundle to remain portable and environment-agnostic Example overrides file: variables: job_compute_key: f6e7f5d8-d965-4009-95d9-02e993d9a16b - when an override is provided, the referenced dependency (for example, compute) is not created, and the provided value is used instead - when no override is provided, the system falls back to the default variable value, which may reference a dependency included in the bundle (resulting in that dependency being created) - this mechanism enables environment-specific customization (for example, reusing existing infrastructure in production while creating new resources in development) - the same pattern can be used for other environment-specific parameters such as compute shape, number of OCPUs, or other configuration values Git integration and promotion: - bundles can only be created inside Git-backed workspace folders - bundles are self-contained packages that include resource definitions, dependency references, and associated code artifacts required to recreate the bundled resources - the entire bundle folder can be committed and pushed to a Git repository - bundles can be pulled into another workspace via Git and deployed there - bundles can be promoted across environments (for example, dev → test → prod) using Git workflows - because the bundle includes both resource configuration and code dependencies, it can be used to reliably replicate assets across workspaces This operation is asynchronous. The service validates the request, starts bundle creation, and returns an async operation key in the response headers. Use the async operation APIs to track completion. Typical use cases: - capture selected workspace resources into a version-controlled bundle - prepare a bundle for later deployment or promotion - establish a bundle root that can later be inspected, updated, or deployed Request notes: - `path` identifies the parent folder in the workspace volume where the bundle should be created - `name` identifies the bundle folder name - `bundledResources` identifies which workspace resources should be included

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `createBundleDetails` (`oci.aidataplatform_dp.models.CreateBundleDetails`) — Request payload for bundle creation.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createBundleResponse`

**Return:** [Back to Bundle (`BundleClient`)](#bundleclient-client) • [Top](#top)


### <a id="bundleclient-createbundleaction"></a>`createBundleAction`
(Preview) Creates a new bundle. A bundle is a self-contained, portable representation of selected workspace assets, such as jobs and agent flows, along with their dependencies and associated code artifacts. It captures both the resource configurations and the supporting assets required to recreate those resources in another workspace or environment. The bundle manifest is named `aidp_workbench.yaml`. The bundle preserves the workspace folder structure for code artifacts from the location where it was created, so the generated bundle mirrors the source layout. Dependencies are tracked inside the bundle under each asset type: - job and agent flow dependencies are added under the `dependencies` folder inside the `jobs` and `agentflows` folders - code dependencies are added under the `artifacts` directory in the bundle Dependency references use template variables, for example: - compute: `$${jobs.dependencies.training_compute.compute.key}` - nested jobs: `$${jobs.dependencies.training_job.job.key}` - aicompute: `$${jobs.dependencies.training_aicompute.aicompute.key}` Bundles also support the special variable `$${bundle.root}`, which points to the root of the bundle folder and is used for referencing artifacts. Variables and overrides: - bundles support parameterization using variables defined in the bundle manifest (`aidp_workbench.yaml`) Example manifest defaults: defaults: variables: job_compute_key: "$${jobs.dependencies.small.compute.key}" - variables can be referenced in resource descriptors using the `$${var.<name>}` syntax Example usage in a job descriptor: "clusterKey": "$${var.job_compute_key}" - workspace-specific overrides can be provided via `.aidp/overrides.yaml` inside the bundle - this file is intended for environment-specific configuration and should not be committed to Git, allowing the bundle to remain portable and environment-agnostic Example overrides file: variables: job_compute_key: f6e7f5d8-d965-4009-95d9-02e993d9a16b - when an override is provided, the referenced dependency (for example, compute) is not created, and the provided value is used instead - when no override is provided, the system falls back to the default variable value, which may reference a dependency included in the bundle (resulting in that dependency being created) - this mechanism enables environment-specific customization (for example, reusing existing infrastructure in production while creating new resources in development) - the same pattern can be used for other environment-specific parameters such as compute shape, number of OCPUs, or other configuration values Git integration and promotion: - bundles can only be created inside Git-backed workspace folders - bundles are self-contained packages that include resource definitions, dependency references, and associated code artifacts required to recreate the bundled resources - the entire bundle folder can be committed and pushed to a Git repository - bundles can be pulled into another workspace via Git and deployed there - bundles can be promoted across environments (for example, dev → test → prod) using Git workflows - because the bundle includes both resource configuration and code dependencies, it can be used to reliably replicate assets across workspaces This operation is asynchronous. The service validates the request, starts bundle creation, and returns an async operation key in the response headers. Use the async operation APIs to track completion. Typical use cases: - capture selected workspace resources into a version-controlled bundle - prepare a bundle for later deployment or promotion - establish a bundle root that can later be inspected, updated, or deployed Request notes: - `path` identifies the parent folder in the workspace volume where the bundle should be created - `name` identifies the bundle folder name - `bundledResources` identifies which workspace resources should be included

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `createBundleDetails` (`oci.aidataplatform_dp.models.CreateBundleDetails`) — Request payload for bundle creation.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createBundleActionResponse`

**Return:** [Back to Bundle (`BundleClient`)](#bundleclient-client) • [Top](#top)


### <a id="bundleclient-deploybundle"></a>`deployBundle`
(Deprecated) Deploys the specified bundle, creating or updating jobs and agent flows according to the bundle manifest. Returns an async job key for tracking deployment progress. This operation is asynchronous. The request is accepted for background execution and returns an async operation key in the response headers. Deployment typically uses: - the bundle manifest at the bundle root - top-level resource descriptors in the bundle - dependency descriptors referenced by those top-level resources - default or override variable values when present Use this operation when you want to apply the bundle contents into the target workspace state. Request notes: - `path` identifies the bundle root folder in the workspace volume

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `deployBundleDetails` (`oci.aidataplatform_dp.models.DeployBundleDetails`) — Request payload for bundle deploy.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deployBundleResponse`

**Return:** [Back to Bundle (`BundleClient`)](#bundleclient-client) • [Top](#top)


### <a id="bundleclient-deploybundleaction"></a>`deployBundleAction`
(Preview) Deploys the specified bundle, creating or updating jobs and agent flows according to the bundle manifest. Returns an async job key for tracking deployment progress. This operation is asynchronous. The request is accepted for background execution and returns an async operation key in the response headers. Deployment typically uses: - the bundle manifest at the bundle root - top-level resource descriptors in the bundle - dependency descriptors referenced by those top-level resources - default or override variable values when present Use this operation when you want to apply the bundle contents into the target workspace state. Request notes: - `path` identifies the bundle root folder in the workspace volume

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `deployBundleDetails` (`oci.aidataplatform_dp.models.DeployBundleDetails`) — Request payload for bundle deploy.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deployBundleActionResponse`

**Return:** [Back to Bundle (`BundleClient`)](#bundleclient-client) • [Top](#top)


### <a id="bundleclient-fetchbundledeploymentstatus"></a>`fetchBundleDeploymentStatus`
(Deprecated) Returns a high-level summary of the most recent deployment activity recorded for the specified bundle. This operation is useful after deploy or purge requests when you want the latest bundle-level deployment outcome rather than raw async operation details. The response can include: - overall deployment status - start and completion timestamps - summary message - resources associated with the last recorded deployment result Typical status values include: - `IN_PROGRESS` - `SUCCEEDED` - `FAILED` - `NOT_DEPLOYED` Request notes: - `path` identifies the bundle root folder in the workspace volume

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `fetchBundleDeploymentStatusDetails` (`oci.aidataplatform_dp.models.FetchBundleDeploymentStatusDetails`) — Request payload for FetchBundleDeploymentStatusDetails.

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `fetchBundleDeploymentStatusResponse`

**Response Fields:**
- `status` (string) — Gets the status of this BundleDeploymentStatus. Overall status of the last deployment. Allowed values for this property are: "SUCCEEDED", "FAILED", "IN_PROGRESS", "NOT_DEPLOYED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `timeStarted` (datetime) — Gets the time_started of this BundleDeploymentStatus. The deployment start time
- `timeCompleted` (datetime) — Gets the time_completed of this BundleDeploymentStatus. The deployment end time
- `message` (string) — Gets the message of this BundleDeploymentStatus. Optional summary message for the last deployment.
- `resources` (list[oci.aidataplatform_dp.models.BundleDeployedResource]) — Gets the resources of this BundleDeploymentStatus. List of resources from the last deployment.

**Return:** [Back to Bundle (`BundleClient`)](#bundleclient-client) • [Top](#top)


### <a id="bundleclient-fetchbundledeploymentstatusaction"></a>`fetchBundleDeploymentStatusAction`
(Preview) Returns a high-level summary of the most recent deployment activity recorded for the specified bundle. This operation is useful after deploy or purge requests when you want the latest bundle-level deployment outcome rather than raw async operation details. The response can include: - overall deployment status - start and completion timestamps - summary message - resources associated with the last recorded deployment result Typical status values include: - `IN_PROGRESS` - `SUCCEEDED` - `FAILED` - `NOT_DEPLOYED` Request notes: - `path` identifies the bundle root folder in the workspace volume

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `fetchBundleDeploymentStatusDetails` (`oci.aidataplatform_dp.models.FetchBundleDeploymentStatusDetails`) — Request payload for FetchBundleDeploymentStatusDetails.

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `fetchBundleDeploymentStatusActionResponse`

**Response Fields:**
- `status` (string) — Gets the status of this BundleDeploymentStatus. Overall status of the last deployment. Allowed values for this property are: "SUCCEEDED", "FAILED", "IN_PROGRESS", "NOT_DEPLOYED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `timeStarted` (datetime) — Gets the time_started of this BundleDeploymentStatus. The deployment start time
- `timeCompleted` (datetime) — Gets the time_completed of this BundleDeploymentStatus. The deployment end time
- `message` (string) — Gets the message of this BundleDeploymentStatus. Optional summary message for the last deployment.
- `resources` (list[oci.aidataplatform_dp.models.BundleDeployedResource]) — Gets the resources of this BundleDeploymentStatus. List of resources from the last deployment.

**Return:** [Back to Bundle (`BundleClient`)](#bundleclient-client) • [Top](#top)


### <a id="bundleclient-purgebundle"></a>`purgeBundle`
(Deprecated) Tears down all resources deployed by the specified bundle in the workspace. This operation is intended to tear down resources that were created or managed through bundle deployment. It does not delete the bundle files themselves from the workspace volume. This operation is asynchronous. The service accepts the purge request, starts the background teardown workflow, and returns async operation headers. Typical use cases: - remove resources that were previously deployed from a bundle - clean up a workspace before re-deploying or retiring a bundle Request notes: - `path` identifies the bundle root folder in the workspace volume

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `purgeBundleDetails` (`oci.aidataplatform_dp.models.PurgeBundleDetails`) — Request payload for bundle purge.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `purgeBundleResponse`

**Return:** [Back to Bundle (`BundleClient`)](#bundleclient-client) • [Top](#top)


### <a id="bundleclient-purgebundleaction"></a>`purgeBundleAction`
(Preview) Tears down all resources deployed by the specified bundle in the workspace. This operation is intended to tear down resources that were created or managed through bundle deployment. It does not delete the bundle files themselves from the workspace volume. This operation is asynchronous. The service accepts the purge request, starts the background teardown workflow, and returns async operation headers. Typical use cases: - remove resources that were previously deployed from a bundle - clean up a workspace before re-deploying or retiring a bundle Request notes: - `path` identifies the bundle root folder in the workspace volume

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `purgeBundleDetails` (`oci.aidataplatform_dp.models.PurgeBundleDetails`) — Request payload for bundle purge.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `purgeBundleActionResponse`

**Return:** [Back to Bundle (`BundleClient`)](#bundleclient-client) • [Top](#top)


### <a id="bundleclient-syncbundle"></a>`syncBundle`
(Deprecated) Synchronizes the code, descriptors, and mapping in the bundle by reconciling the contents with the resource origins. Returns an async job key for tracking sync progress. This operation is intended for cases where the bundle should be refreshed to reflect newer source changes while preserving the bundle structure and identity. Sync uses the bundle's recorded origin metadata to rebuild the bundle from the source jobs and agent flows that were captured when the bundle was created. The source metadata is stored in `.aidp/resource_origins.yaml` and must match the requested AIDP/Data Lake and workspace. The operation refreshes source-controlled bundle content while preserving the bundle identity and runtime metadata. During sync, the service stages a refreshed bundle snapshot under the bundle `.aidp` directory, compares existing and staged descriptors, preserves existing variable aliases and override references where possible, merges existing manifest default variables, and then promotes the refreshed source-controlled files back into the bundle root. Sync preserves environment-specific and deployment runtime files such as `.aidp/overrides.yaml` and `.aidp/aidp.state.json`. These files are not replaced by the refreshed source snapshot. This operation is asynchronous and returns async operation headers when accepted. Typical use cases: - refresh bundle contents after upstream workspace resources have changed - reconcile descriptor or artifact content with current resource origins - preserve local bundle overrides while pulling in source resource updates - keep a Git-backed bundle current before committing or promoting it Request notes: - `path` identifies the bundle root folder in the workspace volume - the bundle must contain a valid `aidp_workbench.yaml` - the bundle must contain `.aidp/resource_origins.yaml` - origin metadata must refer to the same AIDP/Data Lake and workspace as the request

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `syncBundleDetails` (`oci.aidataplatform_dp.models.SyncBundleDetails`) — Request payload for bundle sync.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `syncBundleResponse`

**Return:** [Back to Bundle (`BundleClient`)](#bundleclient-client) • [Top](#top)


### <a id="bundleclient-syncbundleaction"></a>`syncBundleAction`
(Preview) Synchronizes the code, descriptors, and mapping in the bundle by reconciling the contents with the resource origins. Returns an async job key for tracking sync progress. This operation is intended for cases where the bundle should be refreshed to reflect newer source changes while preserving the bundle structure and identity. Sync uses the bundle's recorded origin metadata to rebuild the bundle from the source jobs and agent flows that were captured when the bundle was created. The source metadata is stored in `.aidp/resource_origins.yaml` and must match the requested AIDP/Data Lake and workspace. The operation refreshes source-controlled bundle content while preserving the bundle identity and runtime metadata. During sync, the service stages a refreshed bundle snapshot under the bundle `.aidp` directory, compares existing and staged descriptors, preserves existing variable aliases and override references where possible, merges existing manifest default variables, and then promotes the refreshed source-controlled files back into the bundle root. Sync preserves environment-specific and deployment runtime files such as `.aidp/overrides.yaml` and `.aidp/aidp.state.json`. These files are not replaced by the refreshed source snapshot. This operation is asynchronous and returns async operation headers when accepted. Typical use cases: - refresh bundle contents after upstream workspace resources have changed - reconcile descriptor or artifact content with current resource origins - preserve local bundle overrides while pulling in source resource updates - keep a Git-backed bundle current before committing or promoting it Request notes: - `path` identifies the bundle root folder in the workspace volume - the bundle must contain a valid `aidp_workbench.yaml` - the bundle must contain `.aidp/resource_origins.yaml` - origin metadata must refer to the same AIDP/Data Lake and workspace as the request

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `syncBundleDetails` (`oci.aidataplatform_dp.models.SyncBundleDetails`) — Request payload for bundle sync.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `syncBundleActionResponse`

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
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `catalogTestConnectionDetails` (`oci.aidataplatform_dp.models.CatalogTestConnectionDetails`) — Details for the AI Data Platform Workbench catalog to be tested for connection.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `catalogTestConnectionResponse`

**Return:** [Back to Catalog (`CatalogClient`)](#catalogclient-client) • [Top](#top)


### <a id="catalogclient-createcatalog"></a>`createCatalog`
Creates a catalog with the given ID.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `createCatalogDetails` (`oci.aidataplatform_dp.models.CreateCatalogDetails`) — Details for the new AI Data Platform Workbench catalog.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createCatalogResponse`

**Return:** [Back to Catalog (`CatalogClient`)](#catalogclient-client) • [Top](#top)


### <a id="catalogclient-deletecatalog"></a>`deleteCatalog`
Deletes the specified catalog.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `catalogKey` (`string`) — The key of the catalog.

**Optional Parameters:**
- `isForced` (`boolean`) — A boolean which decides if an entity should be deleted with Cascade effect
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteCatalogResponse`

**Return:** [Back to Catalog (`CatalogClient`)](#catalogclient-client) • [Top](#top)


### <a id="catalogclient-getcatalog"></a>`getCatalog`
Gets detailed information about a catalog with a given catalog key.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `catalogKey` (`string`) — The key of the catalog.

**Optional Parameters:**
- `isCatalogGuid` (`boolean`) — A boolean which decides if catalogKey path parameter is catalog GUID (UUID) or name.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getCatalogResponse`

**Response Fields:**
- `key` (string) — Gets the key of this Catalog. The AI Data Platform Workbench catalog key.
- `displayName` (string) — Gets the display_name of this Catalog. Catalog display name.
- `description` (string) — Gets the description of this Catalog. Short description of the catalog.
- `catalogGuid` (string) — Gets the catalog_guid of this Catalog. Unique identifier for catalog.
- `catalogType` (string) — Gets the catalog_type of this Catalog. Type of catalog. Allowed values for this property are: "EXTERNAL", "INTERNAL", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `sourceType` (string) — Gets the source_type of this Catalog. External catalog source type. Allowed values for this property are: "ADW", "ALH", "KAFKA", "ATP", "ORACLE", "EXADATA", "MYSQL", "AZURE_SQLSERVER", "SNOWFLAKE", "GOOGLE_BIGQUERY", "ORACLE_ANALYTICS", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `connectionDetails` (oci.aidataplatform_dp.models.CatalogConnectionDetails) — Gets the connection_details of this Catalog.
- `lifecycleState` (string) — Gets the lifecycle_state of this Catalog. The current status of the catalog. Allowed values for this property are: "ACTIVE", "CREATING", "DELETING", "UPDATING", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleStateDetails` (string) — Gets the lifecycle_state_details of this Catalog. A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.
- `timeCreated` (datetime) — Gets the time_created of this Catalog. The date and time the AI Data Platform Workbench catalog was created.
- `timeUpdated` (datetime) — Gets the time_updated of this Catalog. The date and time the AI Data Platform Workbench catalog was updated.
- `createdBy` (string) — Gets the created_by of this Catalog. The ID of the user that created the catalog.
- `updatedBy` (string) — Gets the updated_by of this Catalog. The ID of the last user to update the catalog.
- `properties` (dict(str, str)) — Gets the properties of this Catalog. Key-value pair used to provide catalog properties like the subCompartment OCID where the buckets need to reside.

**Return:** [Back to Catalog (`CatalogClient`)](#catalogclient-client) • [Top](#top)


### <a id="catalogclient-listcatalogpermissions"></a>`listCatalogPermissions`
Gets a list of all permissions in the specified catalog.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `catalogKey` (`string`) — The key of the catalog.

**Optional Parameters:**
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName"
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listCatalogPermissionsResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.CatalogPermissionSummary]) — Gets the items of this CatalogPermissionCollection. List of catalog permissions.

**Return:** [Back to Catalog (`CatalogClient`)](#catalogclient-client) • [Top](#top)


### <a id="catalogclient-listcatalogs"></a>`listCatalogs`
Gets a list of catalogs with a given ID.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

**Optional Parameters:**
- `displayName` (`string`) — A filter to return only resources that match the given display name exactly.
- `catalogState` (`string`) — The state of the catalog. Allowed values are: "ACTIVE", "CREATING", "DELETING"
- `catalogType` (`string`) — The type of the catalog. Allowed values are: "INTERNAL", "EXTERNAL"
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName"
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listCatalogsResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.CatalogSummary]) — Gets the items of this CatalogCollection. List of catalogs.

**Return:** [Back to Catalog (`CatalogClient`)](#catalogclient-client) • [Top](#top)


### <a id="catalogclient-managecatalogpermission"></a>`manageCatalogPermission`
Updates permission details for a catalog.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `catalogKey` (`string`) — The key of the catalog.
- `manageCatalogPermissionDetails` (`oci.aidataplatform_dp.models.ManageCatalogPermissionDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageCatalogPermissionResponse`

**Return:** [Back to Catalog (`CatalogClient`)](#catalogclient-client) • [Top](#top)


### <a id="catalogclient-refreshcatalog"></a>`refreshCatalog`
Refreshes a catalog through a crawler.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `catalogKey` (`string`) — The key of the catalog.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `refreshCatalogResponse`

**Return:** [Back to Catalog (`CatalogClient`)](#catalogclient-client) • [Top](#top)


### <a id="catalogclient-updatecatalog"></a>`updateCatalog`
Updates the details of a catalog with the given information.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `catalogKey` (`string`) — The key of the catalog.
- `updateCatalogDetails` (`oci.aidataplatform_dp.models.UpdateCatalogDetails`) — The information to be updated.

**Optional Parameters:**
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateCatalogResponse`

**Return:** [Back to Catalog (`CatalogClient`)](#catalogclient-client) • [Top](#top)


## <a id="clusterclient-client"></a>Cluster (`ClusterClient`)
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
- [`queryReplicaIds`](#clusterclient-queryreplicaids)
- [`restartCluster`](#clusterclient-restartcluster)
- [`searchClusterLogs`](#clusterclient-searchclusterlogs)
- [`startCluster`](#clusterclient-startcluster)
- [`stopCluster`](#clusterclient-stopcluster)
- [`summarizeMetricsData`](#clusterclient-summarizemetricsdata)
- [`updateCluster`](#clusterclient-updatecluster)

### <a id="clusterclient-createcluster"></a>`createCluster`
Creates a new cluster with the provided details.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `createClusterDetails` (`oci.aidataplatform_dp.models.CreateClusterDetails`) — Details for the new cluster.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createClusterResponse`

**Response Fields:**
- `key` (string) — Gets the key of this Cluster. Cluster key.
- `displayName` (string) — Gets the display_name of this Cluster. Cluster name.
- `description` (string) — Gets the description of this Cluster. Cluster description.
- `sourceApi` (string) — Gets the source_api of this Cluster. User created clusters are associated with a particular workspace. AI compute is used to execute Agents. Allowed values for this property are: "CLUSTER_API", "DEFAULT_CLUSTER_API", "AI_COMPUTE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `type` (string) — Gets the type of this Cluster. ClusterType Allowed values for this property are: "USER", "AI_COMPUTE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `timeCreated` (datetime) — Gets the time_created of this Cluster. Date and time the cluster was created.
- `timeUpdated` (datetime) — Gets the time_updated of this Cluster. Date and time the cluster was updated.
- `state` (string) — Gets the state of this Cluster. Common lifecycle states for resources in a compute cluster. ACCEPTED        - The resource create request has been accepted. CREATING        - The resource is being created and might not be usable until the entire metadata is defined. ACTIVE          - The resource is valid and available for access. DELETING        - The resource is being deleted, and might require a deep clean of any children. DELETED         - The resource has been deleted, and isn't available. FAILED          - The resource is in a failed state due to validation or other errors. STOPPING        - The resource is being stopped. STOPPED         - The resource has been stopped. UPDATING        - The resource is being updated and might not be usable until all changes are commited. STARTING        - The resource is being started. RESTARTING      - The resource is being restarted. Allowed values for this property are: "ACCEPTED", "CREATING", "ACTIVE", "DELETING", "DELETED", "FAILED", "STOPPING", "STOPPED", "UPDATING", "RESTARTING", "STARTING", "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS", "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL", "NETWORK_CONFIGURATION_ATTACH_FAILED", "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS", "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL", "NETWORK_CONFIGURATION_DETACH_FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `stateDetails` (string) — Gets the state_details of this Cluster. A message that describes the current state of the workspace cluster in more detail. For example, can be used to provide actionable information for a resource in the Failed state.
- `nodeType` (string) — Gets the node_type of this Cluster. Cluster node type encodes the node shape and associated resources.
- `driverConfig` (oci.aidataplatform_dp.models.DriverConfig) — Gets the driver_config of this Cluster.
- `activeClusterResources` (oci.aidataplatform_dp.models.ActiveClusterResources) — Gets the active_cluster_resources of this Cluster.
- `createdBy` (string) — Gets the created_by of this Cluster. OCID of the user who created this record.
- `createdByName` (string) — Gets the created_by_name of this Cluster. Name of the user who created this record.
- `updatedBy` (string) — Gets the updated_by of this Cluster. OCID of the user who updated this record.
- `updatedByName` (string) — Gets the updated_by_name of this Cluster. Name of the user who updated this record.
- `stoppedBy` (string) — Gets the stopped_by of this Cluster. OCID of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped.
- `stoppedByName` (string) — Gets the stopped_by_name of this Cluster. Name of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-deletecluster"></a>`deleteCluster`
Deletes a cluster from a workspace.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `clusterKey` (`string`) — Cluster key.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteClusterResponse`

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-downloadclusterlogs"></a>`downloadClusterLogs`
Downloads logs within the specified cluster and time range. The logs can be filtered by severity (`logLevel`), type (`logContentTypeContains`), and other parameters such as execution context and thread identifiers.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `clusterKey` (`string`) — Cluster key.
- `downloadClusterLogsDetails` (`oci.aidataplatform_dp.models.DownloadClusterLogsDetails`) — Request payload containing the parameters for filtering cluster logs.

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `downloadClusterLogsResponse`

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-getcluster"></a>`getCluster`
Returns detailed information about a cluster.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `clusterKey` (`string`) — Cluster key.

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getClusterResponse`

**Response Fields:**
- `key` (string) — Gets the key of this Cluster. Cluster key.
- `displayName` (string) — Gets the display_name of this Cluster. Cluster name.
- `description` (string) — Gets the description of this Cluster. Cluster description.
- `sourceApi` (string) — Gets the source_api of this Cluster. User created clusters are associated with a particular workspace. AI compute is used to execute Agents. Allowed values for this property are: "CLUSTER_API", "DEFAULT_CLUSTER_API", "AI_COMPUTE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `type` (string) — Gets the type of this Cluster. ClusterType Allowed values for this property are: "USER", "AI_COMPUTE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `timeCreated` (datetime) — Gets the time_created of this Cluster. Date and time the cluster was created.
- `timeUpdated` (datetime) — Gets the time_updated of this Cluster. Date and time the cluster was updated.
- `state` (string) — Gets the state of this Cluster. Common lifecycle states for resources in a compute cluster. ACCEPTED        - The resource create request has been accepted. CREATING        - The resource is being created and might not be usable until the entire metadata is defined. ACTIVE          - The resource is valid and available for access. DELETING        - The resource is being deleted, and might require a deep clean of any children. DELETED         - The resource has been deleted, and isn't available. FAILED          - The resource is in a failed state due to validation or other errors. STOPPING        - The resource is being stopped. STOPPED         - The resource has been stopped. UPDATING        - The resource is being updated and might not be usable until all changes are commited. STARTING        - The resource is being started. RESTARTING      - The resource is being restarted. Allowed values for this property are: "ACCEPTED", "CREATING", "ACTIVE", "DELETING", "DELETED", "FAILED", "STOPPING", "STOPPED", "UPDATING", "RESTARTING", "STARTING", "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS", "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL", "NETWORK_CONFIGURATION_ATTACH_FAILED", "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS", "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL", "NETWORK_CONFIGURATION_DETACH_FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `stateDetails` (string) — Gets the state_details of this Cluster. A message that describes the current state of the workspace cluster in more detail. For example, can be used to provide actionable information for a resource in the Failed state.
- `nodeType` (string) — Gets the node_type of this Cluster. Cluster node type encodes the node shape and associated resources.
- `driverConfig` (oci.aidataplatform_dp.models.DriverConfig) — Gets the driver_config of this Cluster.
- `activeClusterResources` (oci.aidataplatform_dp.models.ActiveClusterResources) — Gets the active_cluster_resources of this Cluster.
- `createdBy` (string) — Gets the created_by of this Cluster. OCID of the user who created this record.
- `createdByName` (string) — Gets the created_by_name of this Cluster. Name of the user who created this record.
- `updatedBy` (string) — Gets the updated_by of this Cluster. OCID of the user who updated this record.
- `updatedByName` (string) — Gets the updated_by_name of this Cluster. Name of the user who updated this record.
- `stoppedBy` (string) — Gets the stopped_by of this Cluster. OCID of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped.
- `stoppedByName` (string) — Gets the stopped_by_name of this Cluster. Name of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-getdefaultcluster"></a>`getDefaultCluster`
Gets information about the master catalog default cluster.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getDefaultClusterResponse`

**Response Fields:**
- `workspaceKey` (string) — Gets the workspace_key of this DefaultCluster. The key of the AI Data Platform Workbench workspace where the default cluster is.
- `workerConfig` (oci.aidataplatform_dp.models.WorkerConfig) — Gets the worker_config of this DefaultCluster.
- `clusterRuntimeConfig` (oci.aidataplatform_dp.models.ClusterRuntimeConfig) — Gets the cluster_runtime_config of this DefaultCluster.
- `loggingConfig` (oci.aidataplatform_dp.models.LoggingConfig) — Gets the logging_config of this DefaultCluster.
- `autoTerminationMinutes` (number) — Gets the auto_termination_minutes of this DefaultCluster. Optional timeout value in minutes used to automatically stop idle compute clusters.
- `jdbcEndpointUrl` (string) — Gets the jdbc_endpoint_url of this DefaultCluster. Spark JDBC URL.
- `logId` (string) — Gets the log_id of this DefaultCluster. The OCID of the log where cluster logs are published and retrieved. This logId is always created within the logGroupId returned in the response payload.
- `logGroupId` (string) — Gets the log_group_id of this DefaultCluster. The unique OCID that identifies a specific log group within OCI Logging. This log group is exclusively associated with the AI Data Platform Workbench instance and is created in the same compartment within the customer’s tenancy as the AI Data Platform Workbench instance.
- `subscription` (oci.aidataplatform_dp.models.SubscriptionDetails) — Gets the subscription of this DefaultCluster.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-listclusterlibraries"></a>`listClusterLibraries`
Gets a list of libraries installed on a cluster.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `clusterKey` (`string`) — Cluster key.

**Optional Parameters:**
- `displayName` (`string`) — A filter to return only resources that match the given display name exactly.
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listClusterLibrariesResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.ClusterLibrarySummary]) — Gets the items of this ClusterLibraryCollection. List of cluster libraries.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-listclusterpermissions"></a>`listClusterPermissions`
Return a list of permissions for a given cluster.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `clusterKey` (`string`) — Cluster key.

**Optional Parameters:**
- `displayName` (`string`) — A filter to return only resources that match the given display name exactly.
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listClusterPermissionsResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.ClusterPermissionSummary]) — Gets the items of this ClusterPermissionCollection. List of cluster permissions.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-listclusters"></a>`listClusters`
Returns a list of all clusters in a given workspace.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace

**Optional Parameters:**
- `state` (`string`) — A filter to return only resources that match the given lifecycle state. The state value is case-insensitive. Allowed values are: "ACCEPTED", "CREATING", "ACTIVE", "DELETING", "DELETED", "FAILED", "STOPPING", "STOPPED", "UPDATING", "RESTARTING", "STARTING", "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS", "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL", "NETWORK_CONFIGURATION_ATTACH_FAILED", "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS", "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL", "NETWORK_CONFIGURATION_DETACH_FAILED"
- `displayName` (`string`) — A filter to return only resources that match the given display name exactly.
- `displayNameContains` (`string`) — A filter to return only resources that have a display name containing the text provided.
- `type` (`string`) — Cluster type. When the filter is not provided list shows all cluster types - USER and AI_COMPUTE else it shows only cluster of type chosen. Only clusters of type USER are attachable to a workspace notebook.
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listClustersResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.ClusterSummary]) — Gets the items of this ClusterCollection. List of Clusters.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-manageclusterpermission"></a>`manageClusterPermission`
Updates the permissions for a given cluster.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `clusterKey` (`string`) — Cluster key.
- `manageClusterPermissionDetails` (`oci.aidataplatform_dp.models.ManageClusterPermissionDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageClusterPermissionResponse`

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-patchclusterlibrary"></a>`patchClusterLibrary`
Updates libraries of a cluster with the provided patches.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `clusterKey` (`string`) — Cluster key.
- `patchClusterLibraryDetails` (`oci.aidataplatform_dp.models.PatchClusterLibraryDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `patchClusterLibraryResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.ClusterLibrarySummary]) — Gets the items of this ClusterLibraryCollection. List of cluster libraries.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-queryreplicaids"></a>`queryReplicaIds`
Queries compute replica identifiers for a compute cluster in the given workspace. The response contains distinct replica identifiers derived from the Monitoring `agentNode` metric dimension.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `clusterKey` (`string`) — Cluster key.
- `queryReplicaIdsDetails` (`oci.aidataplatform_dp.models.QueryReplicaIdsDetails`) — Request body containing replica query parameters.

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `queryReplicaIdsResponse`

**Response Fields:**
- `replicaIds` (list[str]) — Gets the replica_ids of this QueryReplicaIdsResult. Distinct compute replica identifiers derived from the Monitoring `agentNode` dimension.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-restartcluster"></a>`restartCluster`
Restarts a running cluster.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `clusterKey` (`string`) — Cluster key.
- `restartClusterDetails` (`oci.aidataplatform_dp.models.RestartClusterDetails`) — Details for restarting the cluster.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `restartClusterResponse`

**Response Fields:**
- `key` (string) — Gets the key of this Cluster. Cluster key.
- `displayName` (string) — Gets the display_name of this Cluster. Cluster name.
- `description` (string) — Gets the description of this Cluster. Cluster description.
- `sourceApi` (string) — Gets the source_api of this Cluster. User created clusters are associated with a particular workspace. AI compute is used to execute Agents. Allowed values for this property are: "CLUSTER_API", "DEFAULT_CLUSTER_API", "AI_COMPUTE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `type` (string) — Gets the type of this Cluster. ClusterType Allowed values for this property are: "USER", "AI_COMPUTE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `timeCreated` (datetime) — Gets the time_created of this Cluster. Date and time the cluster was created.
- `timeUpdated` (datetime) — Gets the time_updated of this Cluster. Date and time the cluster was updated.
- `state` (string) — Gets the state of this Cluster. Common lifecycle states for resources in a compute cluster. ACCEPTED        - The resource create request has been accepted. CREATING        - The resource is being created and might not be usable until the entire metadata is defined. ACTIVE          - The resource is valid and available for access. DELETING        - The resource is being deleted, and might require a deep clean of any children. DELETED         - The resource has been deleted, and isn't available. FAILED          - The resource is in a failed state due to validation or other errors. STOPPING        - The resource is being stopped. STOPPED         - The resource has been stopped. UPDATING        - The resource is being updated and might not be usable until all changes are commited. STARTING        - The resource is being started. RESTARTING      - The resource is being restarted. Allowed values for this property are: "ACCEPTED", "CREATING", "ACTIVE", "DELETING", "DELETED", "FAILED", "STOPPING", "STOPPED", "UPDATING", "RESTARTING", "STARTING", "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS", "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL", "NETWORK_CONFIGURATION_ATTACH_FAILED", "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS", "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL", "NETWORK_CONFIGURATION_DETACH_FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `stateDetails` (string) — Gets the state_details of this Cluster. A message that describes the current state of the workspace cluster in more detail. For example, can be used to provide actionable information for a resource in the Failed state.
- `nodeType` (string) — Gets the node_type of this Cluster. Cluster node type encodes the node shape and associated resources.
- `driverConfig` (oci.aidataplatform_dp.models.DriverConfig) — Gets the driver_config of this Cluster.
- `activeClusterResources` (oci.aidataplatform_dp.models.ActiveClusterResources) — Gets the active_cluster_resources of this Cluster.
- `createdBy` (string) — Gets the created_by of this Cluster. OCID of the user who created this record.
- `createdByName` (string) — Gets the created_by_name of this Cluster. Name of the user who created this record.
- `updatedBy` (string) — Gets the updated_by of this Cluster. OCID of the user who updated this record.
- `updatedByName` (string) — Gets the updated_by_name of this Cluster. Name of the user who updated this record.
- `stoppedBy` (string) — Gets the stopped_by of this Cluster. OCID of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped.
- `stoppedByName` (string) — Gets the stopped_by_name of this Cluster. Name of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-searchclusterlogs"></a>`searchClusterLogs`
Searches logs within the specified cluster and time range. Supports pagination and filtering.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `clusterKey` (`string`) — Cluster key.
- `searchClusterLogsDetails` (`oci.aidataplatform_dp.models.SearchClusterLogsDetails`) — Request body containing the search parameters for cluster logs.

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `searchClusterLogsResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.ClusterLogsSummary]) — Gets the items of this ClusterLogCollection. List of cluster logs.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-startcluster"></a>`startCluster`
Starts a cluster that has halted operation.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `clusterKey` (`string`) — Cluster key.
- `startClusterDetails` (`oci.aidataplatform_dp.models.StartClusterDetails`) — Details of the cluster being started.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `startClusterResponse`

**Response Fields:**
- `key` (string) — Gets the key of this Cluster. Cluster key.
- `displayName` (string) — Gets the display_name of this Cluster. Cluster name.
- `description` (string) — Gets the description of this Cluster. Cluster description.
- `sourceApi` (string) — Gets the source_api of this Cluster. User created clusters are associated with a particular workspace. AI compute is used to execute Agents. Allowed values for this property are: "CLUSTER_API", "DEFAULT_CLUSTER_API", "AI_COMPUTE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `type` (string) — Gets the type of this Cluster. ClusterType Allowed values for this property are: "USER", "AI_COMPUTE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `timeCreated` (datetime) — Gets the time_created of this Cluster. Date and time the cluster was created.
- `timeUpdated` (datetime) — Gets the time_updated of this Cluster. Date and time the cluster was updated.
- `state` (string) — Gets the state of this Cluster. Common lifecycle states for resources in a compute cluster. ACCEPTED        - The resource create request has been accepted. CREATING        - The resource is being created and might not be usable until the entire metadata is defined. ACTIVE          - The resource is valid and available for access. DELETING        - The resource is being deleted, and might require a deep clean of any children. DELETED         - The resource has been deleted, and isn't available. FAILED          - The resource is in a failed state due to validation or other errors. STOPPING        - The resource is being stopped. STOPPED         - The resource has been stopped. UPDATING        - The resource is being updated and might not be usable until all changes are commited. STARTING        - The resource is being started. RESTARTING      - The resource is being restarted. Allowed values for this property are: "ACCEPTED", "CREATING", "ACTIVE", "DELETING", "DELETED", "FAILED", "STOPPING", "STOPPED", "UPDATING", "RESTARTING", "STARTING", "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS", "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL", "NETWORK_CONFIGURATION_ATTACH_FAILED", "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS", "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL", "NETWORK_CONFIGURATION_DETACH_FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `stateDetails` (string) — Gets the state_details of this Cluster. A message that describes the current state of the workspace cluster in more detail. For example, can be used to provide actionable information for a resource in the Failed state.
- `nodeType` (string) — Gets the node_type of this Cluster. Cluster node type encodes the node shape and associated resources.
- `driverConfig` (oci.aidataplatform_dp.models.DriverConfig) — Gets the driver_config of this Cluster.
- `activeClusterResources` (oci.aidataplatform_dp.models.ActiveClusterResources) — Gets the active_cluster_resources of this Cluster.
- `createdBy` (string) — Gets the created_by of this Cluster. OCID of the user who created this record.
- `createdByName` (string) — Gets the created_by_name of this Cluster. Name of the user who created this record.
- `updatedBy` (string) — Gets the updated_by of this Cluster. OCID of the user who updated this record.
- `updatedByName` (string) — Gets the updated_by_name of this Cluster. Name of the user who updated this record.
- `stoppedBy` (string) — Gets the stopped_by of this Cluster. OCID of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped.
- `stoppedByName` (string) — Gets the stopped_by_name of this Cluster. Name of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-stopcluster"></a>`stopCluster`
Stops an active cluster.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `clusterKey` (`string`) — Cluster key.
- `stopClusterDetails` (`oci.aidataplatform_dp.models.StopClusterDetails`) — Details for stopping the cluster.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `stopClusterResponse`

**Response Fields:**
- `key` (string) — Gets the key of this Cluster. Cluster key.
- `displayName` (string) — Gets the display_name of this Cluster. Cluster name.
- `description` (string) — Gets the description of this Cluster. Cluster description.
- `sourceApi` (string) — Gets the source_api of this Cluster. User created clusters are associated with a particular workspace. AI compute is used to execute Agents. Allowed values for this property are: "CLUSTER_API", "DEFAULT_CLUSTER_API", "AI_COMPUTE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `type` (string) — Gets the type of this Cluster. ClusterType Allowed values for this property are: "USER", "AI_COMPUTE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `timeCreated` (datetime) — Gets the time_created of this Cluster. Date and time the cluster was created.
- `timeUpdated` (datetime) — Gets the time_updated of this Cluster. Date and time the cluster was updated.
- `state` (string) — Gets the state of this Cluster. Common lifecycle states for resources in a compute cluster. ACCEPTED        - The resource create request has been accepted. CREATING        - The resource is being created and might not be usable until the entire metadata is defined. ACTIVE          - The resource is valid and available for access. DELETING        - The resource is being deleted, and might require a deep clean of any children. DELETED         - The resource has been deleted, and isn't available. FAILED          - The resource is in a failed state due to validation or other errors. STOPPING        - The resource is being stopped. STOPPED         - The resource has been stopped. UPDATING        - The resource is being updated and might not be usable until all changes are commited. STARTING        - The resource is being started. RESTARTING      - The resource is being restarted. Allowed values for this property are: "ACCEPTED", "CREATING", "ACTIVE", "DELETING", "DELETED", "FAILED", "STOPPING", "STOPPED", "UPDATING", "RESTARTING", "STARTING", "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS", "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL", "NETWORK_CONFIGURATION_ATTACH_FAILED", "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS", "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL", "NETWORK_CONFIGURATION_DETACH_FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `stateDetails` (string) — Gets the state_details of this Cluster. A message that describes the current state of the workspace cluster in more detail. For example, can be used to provide actionable information for a resource in the Failed state.
- `nodeType` (string) — Gets the node_type of this Cluster. Cluster node type encodes the node shape and associated resources.
- `driverConfig` (oci.aidataplatform_dp.models.DriverConfig) — Gets the driver_config of this Cluster.
- `activeClusterResources` (oci.aidataplatform_dp.models.ActiveClusterResources) — Gets the active_cluster_resources of this Cluster.
- `createdBy` (string) — Gets the created_by of this Cluster. OCID of the user who created this record.
- `createdByName` (string) — Gets the created_by_name of this Cluster. Name of the user who created this record.
- `updatedBy` (string) — Gets the updated_by of this Cluster. OCID of the user who updated this record.
- `updatedByName` (string) — Gets the updated_by_name of this Cluster. Name of the user who updated this record.
- `stoppedBy` (string) — Gets the stopped_by of this Cluster. OCID of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped.
- `stoppedByName` (string) — Gets the stopped_by_name of this Cluster. Name of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-summarizemetricsdata"></a>`summarizeMetricsData`
Provides summarized compute metrics for a compute cluster in the given workspace. This API aggregates metric data points based on a specified namespace, metric name, and aggregation type. The response contains computed metric summaries.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `clusterKey` (`string`) — Cluster key.
- `summarizeMetricsDataDetails` (`oci.aidataplatform_dp.models.SummarizeMetricsDataDetails`) — Request body containing metric parameters.

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `summarizeMetricsDataResponse`

**Response Fields:**
- `results` (list[oci.aidataplatform_dp.models.MetricsSummary]) — Gets the results of this SummarizeMetricsResponse. List of computed metric summary results.

**Return:** [Back to Cluster (`ClusterClient`)](#clusterclient-client) • [Top](#top)


### <a id="clusterclient-updatecluster"></a>`updateCluster`
Update the details of a given cluster.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `clusterKey` (`string`) — Cluster key.
- `updateClusterDetails` (`oci.aidataplatform_dp.models.UpdateClusterDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateClusterResponse`

**Response Fields:**
- `key` (string) — Gets the key of this Cluster. Cluster key.
- `displayName` (string) — Gets the display_name of this Cluster. Cluster name.
- `description` (string) — Gets the description of this Cluster. Cluster description.
- `sourceApi` (string) — Gets the source_api of this Cluster. User created clusters are associated with a particular workspace. AI compute is used to execute Agents. Allowed values for this property are: "CLUSTER_API", "DEFAULT_CLUSTER_API", "AI_COMPUTE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `type` (string) — Gets the type of this Cluster. ClusterType Allowed values for this property are: "USER", "AI_COMPUTE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `timeCreated` (datetime) — Gets the time_created of this Cluster. Date and time the cluster was created.
- `timeUpdated` (datetime) — Gets the time_updated of this Cluster. Date and time the cluster was updated.
- `state` (string) — Gets the state of this Cluster. Common lifecycle states for resources in a compute cluster. ACCEPTED        - The resource create request has been accepted. CREATING        - The resource is being created and might not be usable until the entire metadata is defined. ACTIVE          - The resource is valid and available for access. DELETING        - The resource is being deleted, and might require a deep clean of any children. DELETED         - The resource has been deleted, and isn't available. FAILED          - The resource is in a failed state due to validation or other errors. STOPPING        - The resource is being stopped. STOPPED         - The resource has been stopped. UPDATING        - The resource is being updated and might not be usable until all changes are commited. STARTING        - The resource is being started. RESTARTING      - The resource is being restarted. Allowed values for this property are: "ACCEPTED", "CREATING", "ACTIVE", "DELETING", "DELETED", "FAILED", "STOPPING", "STOPPED", "UPDATING", "RESTARTING", "STARTING", "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS", "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL", "NETWORK_CONFIGURATION_ATTACH_FAILED", "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS", "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL", "NETWORK_CONFIGURATION_DETACH_FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `stateDetails` (string) — Gets the state_details of this Cluster. A message that describes the current state of the workspace cluster in more detail. For example, can be used to provide actionable information for a resource in the Failed state.
- `nodeType` (string) — Gets the node_type of this Cluster. Cluster node type encodes the node shape and associated resources.
- `driverConfig` (oci.aidataplatform_dp.models.DriverConfig) — Gets the driver_config of this Cluster.
- `activeClusterResources` (oci.aidataplatform_dp.models.ActiveClusterResources) — Gets the active_cluster_resources of this Cluster.
- `createdBy` (string) — Gets the created_by of this Cluster. OCID of the user who created this record.
- `createdByName` (string) — Gets the created_by_name of this Cluster. Name of the user who created this record.
- `updatedBy` (string) — Gets the updated_by of this Cluster. OCID of the user who updated this record.
- `updatedByName` (string) — Gets the updated_by_name of this Cluster. Name of the user who updated this record.
- `stoppedBy` (string) — Gets the stopped_by of this Cluster. OCID of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped.
- `stoppedByName` (string) — Gets the stopped_by_name of this Cluster. Name of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped.

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
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `createDataLakeCredentialDetails` (`oci.aidataplatform_dp.models.CreateDataLakeCredentialDetails`) — Details for the new credential object. When the internal flag is enabled, callers must supply a `namespace` value of `default` or `user_settings` in the payload.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createCredentialResponse`

**Return:** [Back to Credentials (`CredentialsClient`)](#credentialsclient-client) • [Top](#top)


### <a id="credentialsclient-deletecredential"></a>`deleteCredential`
Deletes a credential object. The operation completes synchronously without a response body.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `credentialKey` (`string`) — The unique identifier of an credential

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteCredentialResponse`

**Return:** [Back to Credentials (`CredentialsClient`)](#credentialsclient-client) • [Top](#top)


### <a id="credentialsclient-getcredential"></a>`getCredential`
Gets detailed information about credential with a given credential key.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `credentialKey` (`string`) — The unique identifier of an credential

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getCredentialResponse`

**Response Fields:**
- `key` (string) — Gets the key of this Credential. The unique identifier for the credential object.
- `displayName` (string) — Gets the display_name of this Credential. A user-friendly name for the credential object. This value does not have to be unique and can be changed. Must start with a letter and contain only letters, numbers, or underscores. Avoid entering confidential information.
- `type` (string) — Gets the type of this Credential. The type of credential stored. Allowed values are defined in CredentialType. Allowed values for this property are: "SECRET_TOKEN", "VAULT_REFERENCE", "SERVICE_ACCOUNT", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `credentialDetails` (oci.aidataplatform_dp.models.CredentialDetails) — Gets the credential_details of this Credential.
- `credentialDescription` (string) — Gets the credential_description of this Credential. A brief summary of the credential object and its purpose.
- `lifecycleState` (string) — Gets the lifecycle_state of this Credential. The current state of the credential object. Allowed values are defined in CredentialLifecycleState. Allowed values for this property are: "ACTIVE", "CREATING", "UPDATING", "DELETING", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleStateDetails` (string) — Gets the lifecycle_state_details of this Credential. Additional details or reasons regarding the current lifecycle state. Often used to provide actionable information (e.g., for resources in a Failed state).
- `timeCreated` (datetime) — Gets the time_created of this Credential. The date and time when the credential object was created, in RFC 3339 timestamp format.
- `timeUpdated` (datetime) — Gets the time_updated of this Credential. The date and time when the credential object was most recently updated, in RFC 3339 timestamp format.
- `createdBy` (string) — Gets the created_by of this Credential. The unique identifier of the user who created the credential object.
- `updatedBy` (string) — Gets the updated_by of this Credential. The unique identifier of the user who last updated the credential object.

**Return:** [Back to Credentials (`CredentialsClient`)](#credentialsclient-client) • [Top](#top)


### <a id="credentialsclient-listcredentials"></a>`listCredentials`
Returns a list of credentials.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

**Optional Parameters:**
- `displayName` (`string`) — A filter to return only resources that match the given display name exactly.
- `displayNameContains` (`string`) — A filter to return only resources whose displayName contains the provided value (case-insensitive).
- `lifecycleState` (`string`) — A filter to return only resources whose lifecycleState matches the provided value.
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "name"
- `credentialType` (`string`) — The type of the Credential Allowed values are: "SECRET_TOKEN", "VAULT_REFERENCE", "SERVICE_ACCOUNT"
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listCredentialsResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.CredentialSummary]) — Gets the items of this CredentialCollection. List of credential summaries.

**Return:** [Back to Credentials (`CredentialsClient`)](#credentialsclient-client) • [Top](#top)


### <a id="credentialsclient-updatecredential"></a>`updateCredential`
Updates a credential object. The operation completes synchronously; callers can invoke get to confirm the latest state.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `credentialKey` (`string`) — The unique identifier of an credential
- `updateDataLakeCredentialDetails` (`oci.aidataplatform_dp.models.UpdateDataLakeCredentialDetails`) — The information to be updated.

**Optional Parameters:**
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateCredentialResponse`

**Return:** [Back to Credentials (`CredentialsClient`)](#credentialsclient-client) • [Top](#top)


## <a id="datalineageclient-client"></a>Data Lineage (`DataLineageClient`)
**Operations:**
- [`exportLineage`](#datalineageclient-exportlineage)
- [`fetchEntityLineage`](#datalineageclient-fetchentitylineage)

### <a id="datalineageclient-exportlineage"></a>`exportLineage`
(Preview) Returns complete lineage for the provided anchor node in CSV format.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `exportLineageDetails` (`oci.aidataplatform_dp.models.ExportLineageDetails`) — The information needed to export lineage.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `exportLineageResponse`

**Return:** [Back to Data Lineage (`DataLineageClient`)](#datalineageclient-client) • [Top](#top)


### <a id="datalineageclient-fetchentitylineage"></a>`fetchEntityLineage`
(Preview) Returns lineage for a given entity object.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `fetchEntityLineageDetails` (`oci.aidataplatform_dp.models.FetchEntityLineageDetails`) — The information needed to obtain desired lineage.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `fetchEntityLineageResponse`

**Response Fields:**
- `nodes` (list[oci.aidataplatform_dp.models.LineageObject]) — Gets the nodes of this EntityLineage. Set of links that are involved in the lineage.
- `links` (list[oci.aidataplatform_dp.models.LineageRelationship]) — Gets the links of this EntityLineage. Set of links between the objects in the 'objects' set.

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
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `createRecipientDetails` (`oci.aidataplatform_dp.models.CreateRecipientDetails`) — Details for the new recipient for Delta Share protocol in AI Data Platform Workbench.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createRecipientResponse`

**Response Fields:**
- `key` (string) — Gets the key of this Recipient. Unique identifier for this recipient in AI Data Platform Workbench instance.
- `displayName` (string) — Gets the display_name of this Recipient. A user-friendly name. Has to be unique within the AI Data Platform Workbench instance.
- `description` (string) — Gets the description of this Recipient. Short description of the Recipient
- `timeCreated` (datetime) — Gets the time_created of this Recipient. The date and time the Delta Share recipient was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `timeUpdated` (datetime) — Gets the time_updated of this Recipient. The date and time the Delta Share recipient was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `shareCount` (number) — Gets the share_count of this Recipient. The number of shares this recipient has access on.
- `createdBy` (string) — Gets the created_by of this Recipient. The ID of the user who created the recipient.
- `updatedBy` (string) — Gets the updated_by of this Recipient. The ID of the user who last updated the recipient.
- `properties` (dict(str, str)) — Gets the properties of this Recipient. Key-value pair representing a defined tag key and value. Example: `{ "CostCenter": "42" }`
- `lifecycleState` (string) — Gets the lifecycle_state of this Recipient. The state of the recipient. Allowed values for this property are: "ACTIVE", "INACTIVE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleStateDetails` (string) — Gets the lifecycle_state_details of this Recipient. A message describing the current state in more detail.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-createshare"></a>`createShare`
Creates a Delta Share protocol.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `createShareDetails` (`oci.aidataplatform_dp.models.CreateShareDetails`) — Details for the new share for Delta Share protocol in AI Data Platform Workbench.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createShareResponse`

**Response Fields:**
- `key` (string) — Gets the key of this Share. Unique identifier for this share in AI Data Platform Workbench instance.
- `displayName` (string) — Gets the display_name of this Share. A user-friendly name. Has to be unique within the AI Data Platform Workbench instance.
- `description` (string) — Gets the description of this Share. A description associated with this share.
- `timeCreated` (datetime) — Gets the time_created of this Share. The date and time the Delta Share was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `timeUpdated` (datetime) — Gets the time_updated of this Share. The date and time the Delta Share was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `createdBy` (string) — Gets the created_by of this Share. The ID of the user who created the share.
- `updatedBy` (string) — Gets the updated_by of this Share. The ID of the user who last updated the share.
- `recipientCount` (number) — Gets the recipient_count of this Share. The number of recipients who have access on this share.
- `assetCount` (number) — Gets the asset_count of this Share. The number of assets in this share.
- `lifecycleState` (string) — Gets the lifecycle_state of this Share. The state of the Share. Allowed values for this property are: "ACTIVE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleStateDetails` (string) — Gets the lifecycle_state_details of this Share. A message describing the current state in more detail.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-deleterecipient"></a>`deleteRecipient`
Deletes a Delta Share recipient.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `recipientKey` (`string`) — The key of the recipient resource

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteRecipientResponse`

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-deleteshare"></a>`deleteShare`
Deletes a Delta Share.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `shareKey` (`string`) — The unique key of the Share.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteShareResponse`

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-getrecipient"></a>`getRecipient`
Gets detailed information about a Delta Share recipient.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `recipientKey` (`string`) — The key of the recipient resource

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getRecipientResponse`

**Response Fields:**
- `key` (string) — Gets the key of this Recipient. Unique identifier for this recipient in AI Data Platform Workbench instance.
- `displayName` (string) — Gets the display_name of this Recipient. A user-friendly name. Has to be unique within the AI Data Platform Workbench instance.
- `description` (string) — Gets the description of this Recipient. Short description of the Recipient
- `timeCreated` (datetime) — Gets the time_created of this Recipient. The date and time the Delta Share recipient was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `timeUpdated` (datetime) — Gets the time_updated of this Recipient. The date and time the Delta Share recipient was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `shareCount` (number) — Gets the share_count of this Recipient. The number of shares this recipient has access on.
- `createdBy` (string) — Gets the created_by of this Recipient. The ID of the user who created the recipient.
- `updatedBy` (string) — Gets the updated_by of this Recipient. The ID of the user who last updated the recipient.
- `properties` (dict(str, str)) — Gets the properties of this Recipient. Key-value pair representing a defined tag key and value. Example: `{ "CostCenter": "42" }`
- `lifecycleState` (string) — Gets the lifecycle_state of this Recipient. The state of the recipient. Allowed values for this property are: "ACTIVE", "INACTIVE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleStateDetails` (string) — Gets the lifecycle_state_details of this Recipient. A message describing the current state in more detail.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-getshare"></a>`getShare`
Gets detailed information about a Delta Share.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `shareKey` (`string`) — The unique key of the Share.

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getShareResponse`

**Response Fields:**
- `key` (string) — Gets the key of this Share. Unique identifier for this share in AI Data Platform Workbench instance.
- `displayName` (string) — Gets the display_name of this Share. A user-friendly name. Has to be unique within the AI Data Platform Workbench instance.
- `description` (string) — Gets the description of this Share. A description associated with this share.
- `timeCreated` (datetime) — Gets the time_created of this Share. The date and time the Delta Share was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `timeUpdated` (datetime) — Gets the time_updated of this Share. The date and time the Delta Share was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `createdBy` (string) — Gets the created_by of this Share. The ID of the user who created the share.
- `updatedBy` (string) — Gets the updated_by of this Share. The ID of the user who last updated the share.
- `recipientCount` (number) — Gets the recipient_count of this Share. The number of recipients who have access on this share.
- `assetCount` (number) — Gets the asset_count of this Share. The number of assets in this share.
- `lifecycleState` (string) — Gets the lifecycle_state of this Share. The state of the Share. Allowed values for this property are: "ACTIVE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleStateDetails` (string) — Gets the lifecycle_state_details of this Share. A message describing the current state in more detail.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-listrecipientpermissions"></a>`listRecipientPermissions`
Gets a detailed list of Delta Share recipient permissions.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `recipientKey` (`string`) — The key of the recipient resource

**Optional Parameters:**
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. Default order for `grantee` is ascending. Allowed values are: "grantee"
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listRecipientPermissionsResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.RecipientPermissionSummary]) — Gets the items of this RecipientPermissionCollection. List of recipient permissions.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-listrecipientshares"></a>`listRecipientShares`
Returns a list of Delta Shares that the specified recipient has been granted access to.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `recipientKey` (`string`) — The key of the recipient resource

**Optional Parameters:**
- `displayName` (`string`) — A filter to return only resources that match the given display name exactly.
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listRecipientSharesResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.ShareSummary]) — Gets the items of this ShareCollection. List of Shares.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-listrecipients"></a>`listRecipients`
Gets a list of Delta Share recipients.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

**Optional Parameters:**
- `displayName` (`string`) — A filter to return only resources that match the given display name exactly.
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listRecipientsResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.RecipientSummary]) — Gets the items of this RecipientCollection. List of recipients.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-listsharedataassets"></a>`listShareDataAssets`
Gets a list of Delta Share assets.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `shareKey` (`string`) — The unique key of the Share.

**Optional Parameters:**
- `displayName` (`string`) — A filter to return only resources that match the given display name exactly.
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listShareDataAssetsResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.ShareDataAssetSummary]) — Gets the items of this ShareDataAssetCollection. List of Shares assets.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-listsharepermissions"></a>`listSharePermissions`
Returns a list of Delta Shares that the specified recipient has been granted access to.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `shareKey` (`string`) — The unique key of the Share.

**Optional Parameters:**
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Default order for `grantee` is ascending. Default order for `granteeType` is ascending. Allowed values are: "grantee", "granteeType"
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listSharePermissionsResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.SharePermissionSummary]) — Gets the items of this SharePermissionCollection. List of share permissions.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-listsharerecipients"></a>`listShareRecipients`
Gets a list of recipients that have been given access on the specified Delta Share.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `shareKey` (`string`) — The unique key of the Share.

**Optional Parameters:**
- `displayName` (`string`) — A filter to return only resources that match the given display name exactly.
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listShareRecipientsResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.RecipientSummary]) — Gets the items of this RecipientCollection. List of recipients.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-listshares"></a>`listShares`
Gets a list of Delta Shares.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

**Optional Parameters:**
- `displayName` (`string`) — A filter to return only resources that match the given display name exactly.
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listSharesResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.ShareSummary]) — Gets the items of this ShareCollection. List of Shares.

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-managerecipientpermission"></a>`manageRecipientPermission`
Updates the permissions of a Delta Share recipient.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `recipientKey` (`string`) — The key of the recipient resource
- `manageRecipientPermissionDetails` (`oci.aidataplatform_dp.models.ManageRecipientPermissionDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageRecipientPermissionResponse`

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-manageshareaccess"></a>`manageShareAccess`
Updates consumer-side access on a share for a recipient. A provider user can grant or revoke access on a particular share for a given recipient.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `shareKey` (`string`) — The unique key of the Share.
- `manageShareAccessDetails` (`oci.aidataplatform_dp.models.ManageShareAccessDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageShareAccessResponse`

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-managesharedataasset"></a>`manageShareDataAsset`
Updates data assets on a Delta Share with the provided information.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `shareKey` (`string`) — The unique key of the Share.
- `manageShareDataAssetDetails` (`oci.aidataplatform_dp.models.ManageShareDataAssetDetails`) — The Delta Share data asset information to be updated.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageShareDataAssetResponse`

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-managesharepermission"></a>`manageSharePermission`
Updates permissions on a Delta Share.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `shareKey` (`string`) — The unique key of the Share.
- `manageSharePermissionDetails` (`oci.aidataplatform_dp.models.ManageSharePermissionDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageSharePermissionResponse`

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-updaterecipient"></a>`updateRecipient`
Updates the metadata of a Delta Share recipient.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `recipientKey` (`string`) — The key of the recipient resource
- `updateRecipientDetails` (`oci.aidataplatform_dp.models.UpdateRecipientDetails`) — The information to be updated for a recipient.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateRecipientResponse`

**Return:** [Back to Delta Share (`DeltaShareClient`)](#deltashareclient-client) • [Top](#top)


### <a id="deltashareclient-updateshare"></a>`updateShare`
Update a Delta Share with the provided metadata.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `shareKey` (`string`) — The unique key of the Share.
- `updateShareDetails` (`oci.aidataplatform_dp.models.UpdateShareDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateShareResponse`

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
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `gitRepositoryKey` (`string`) — The Git repository key.
- `checkoutBranchDetails` (`oci.aidataplatform_dp.models.CheckoutBranchDetails`) — Details for the new branch.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `checkoutBranchResponse`

**Response Fields:**
- `branchName` (string) — Gets the branch_name of this GitBranch. The name of the Git branch.
- `gitUrl` (string) — Gets the git_url of this GitBranch. The Git repository URL corresponding to the branch.
- `errorMessage` (string) — Gets the error_message of this GitBranch. Git error message.
- `stdOut` (string) — Gets the std_out of this GitBranch. Git STDOUT message.
- `stdErr` (string) — Gets the std_err of this GitBranch. Git STDERR message.
- `gitExitCode` (number) — Gets the git_exit_code of this GitBranch. Git exit status.

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-commitpushgitrepository"></a>`commitPushGitRepository`
(Preview) Stages selected workspace updates, creates a commit, and pushes it upstream so automation can sync with Git providers.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `gitRepositoryKey` (`string`) — The Git repository key.
- `commitPushDetails` (`oci.aidataplatform_dp.models.CommitPushDetails`) — Commit details.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `commitPushGitRepositoryResponse`

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-creategitbranch"></a>`createGitBranch`
(Preview) Creates a new branch in the connected repo so teams can stage changes in isolated workspaces.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `gitRepositoryKey` (`string`) — The Git repository key.
- `createGitBranchDetails` (`oci.aidataplatform_dp.models.CreateGitBranchDetails`) — Details for the new Workspace Object.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createGitBranchResponse`

**Response Fields:**
- `gitBranchName` (string) — Gets the git_branch_name of this CreateGitBranch. The name of the Git branch.
- `gitUrl` (string) — Gets the git_url of this CreateGitBranch. The Git repository URL corresponding to the branch.
- `errorMessage` (string) — Gets the error_message of this CreateGitBranch. Git error message.
- `stdOut` (string) — Gets the std_out of this CreateGitBranch. Git STDOUT message.
- `stdErr` (string) — Gets the std_err of this CreateGitBranch. Git STDERR message.
- `gitExitCode` (number) — Gets the git_exit_code of this CreateGitBranch. Git exit status.
- `gitFolderPath` (string) — Gets the git_folder_path of this CreateGitBranch. The path of the current Git folder which has to be created for the new branch.

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-getgitdiffdetail"></a>`getGitDiffDetail`
(Preview) Returns a unified diff patch for a specific file so editors and review panes can render inline changes.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `gitRepositoryKey` (`string`) — The Git repository key.
- `gitFolderPath` (`string`) — The Git folder path.
- `branchName` (`string`) — Expected branch name for the folder context.
- `gitFilePath` (`string`) — File path relative to repository root.

**Optional Parameters:**
- `contextLines` (`number`) — Number of context lines to include in the diff.
- `maxPatchBytes` (`number`) — Maximum number of bytes of diff output to return.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getGitDiffDetailResponse`

**Response Fields:**
- `gitFilePath` (string) — Gets the git_file_path of this GitDiffDetail. File path relative to repository root.
- `isConflict` (boolean) — Gets the is_conflict of this GitDiffDetail. Indicates whether the file is currently in a conflicted state.
- `isBinary` (boolean) — Gets the is_binary of this GitDiffDetail. Indicates whether the file is binary.
- `patch` (string) — Gets the patch of this GitDiffDetail. Unified diff patch text.
- `isTruncated` (boolean) — Gets the is_truncated of this GitDiffDetail. Indicates whether the diff output was truncated.
- `truncatedReason` (string) — Gets the truncated_reason of this GitDiffDetail. Indicates the reason for the truncated diff to be returned. Allowed values for this property are: "MAX_PATCH_BYTES", "BINARY", "TOO_LARGE", "UNKNOWN", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-getgitoperationstate"></a>`getGitOperationState`
(Preview) Returns the current Git worktree status—including in-progress operations or detached HEAD indicators—for the workspace folder.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `gitRepositoryKey` (`string`) — The Git repository key.

**Optional Parameters:**
- `operationName` (`string`) — Optional operation the caller intends to perform (for example PULL, PUSH, RESET, CHECKOUT).
- `branchName` (`string`) — Expected branch name for the folder context.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getGitOperationStateResponse`

**Response Fields:**
- `gitFolderPath` (string) — Gets the git_folder_path of this GitOperationState. Folder path used to locate the Git worktree.
- `state` (string) — Gets the state of this GitOperationState. Current Git operation state detected. Allowed values for this property are: "CLEAN", "MERGE_IN_PROGRESS", "REBASE_IN_PROGRESS", "PULL_IN_PROGRESS", "DETACHED_HEAD", "UNKNOWN", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `isBlocking` (boolean) — Gets the is_blocking of this GitOperationState. Whether the detected state blocks typical write operations.
- `isAllowed` (boolean) — Gets the is_allowed of this GitOperationState. Whether the requested operation is allowed in the current state. If operationName is not provided, this indicates if the repository is in a generally safe state.
- `message` (string) — Gets the message of this GitOperationState. Human-readable hint for UI display.
- `currentBranch` (string) — Gets the current_branch of this GitOperationState. Current branch name. Empty if detached HEAD.
- `headCommitId` (string) — Gets the head_commit_id of this GitOperationState. Full commit ID of HEAD.
- `isDetached` (boolean) — Gets the is_detached of this GitOperationState. Whether HEAD is detached.
- `haveConflicts` (boolean) — Gets the have_conflicts of this GitOperationState. Indicates if unmerged/conflicted files exist. This does not include file names.
- `timeChecked` (datetime) — Gets the time_checked of this GitOperationState. Time when the state was computed.

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-getgitrepository"></a>`getGitRepository`
(Preview) Returns repository metadata, credential references, and workspace linkage for a specific AI Data Platform Git repository.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `gitRepositoryKey` (`string`) — The Git repository key.

**Optional Parameters:**
- `shouldIncludeCredentialKey` (`boolean`) — A flag to include credential key in response. If 'true', credential key will be returned in response. Default 'false'.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getGitRepositoryResponse`

**Response Fields:**
- `key` (string) — Gets the key of this GitRepository. Unique key associated with repository.
- `workspaceKey` (string) — Gets the workspace_key of this GitRepository. The workspaceKey associated with the Git repository.
- `branchName` (string) — Gets the branch_name of this GitRepository. The name of the Git branch.
- `gitUrl` (string) — Gets the git_url of this GitRepository. The Git repository url corresponding to the branch.
- `gitFolderPath` (string) — Gets the git_folder_path of this GitRepository. The path of the current Git folder which has to be created for the new branch.
- `credentialKey` (string) — Gets the credential_key of this GitRepository. The credential setting key

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-listgitbranches"></a>`listGitBranches`
(Preview) Returns branch summaries with optional display-name filters and pagination, so UIs can show branch pickers and search results.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `gitRepositoryKey` (`string`) — The Git repository key.

**Optional Parameters:**
- `displayName` (`string`) — A filter to return only resources that match the given display name exactly.
- `displayNameContains` (`string`) — A filter to return only resources that have a display name containing the text provided.
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName", "status"
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listGitBranchesResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.GitBranchSummary]) — Gets the items of this GitBranchCollection. List of Git branches.

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-listgitdiffs"></a>`listGitDiffs`
(Preview) Returns file-level diff summaries for the workspace branch, enabling UI views of changed files or conflicts without heavy payloads.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `gitRepositoryKey` (`string`) — The Git repository key.
- `gitFolderPath` (`string`) — The Git folder path.
- `branchName` (`string`) — Expected branch name for the folder context.

**Optional Parameters:**
- `compareTo` (`string`) — Determines which reference is used for computing diffs. Allowed values are: "HEAD", "UPSTREAM", "INDEX", "WORKTREE", "MERGE_BASE"
- `filter` (`string`) — Filter which files are returned. Allowed values are: "ALL", "DIFF_ONLY", "CONFLICTS_ONLY"
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated"
- `displayName` (`string`) — A filter to return only resources that match the given display name exactly.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listGitDiffsResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.GitDiffSummary]) — Gets the items of this GitDiffSummaryCollection. List of Git diff summaries.

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-mergegitrepository"></a>`mergeGitRepository`
(Preview) Applies the requested branch or commit onto the workspace branch to preview integration changes before pushing.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `gitRepositoryKey` (`string`) — The Git repository key.
- `gitMergeDetails` (`oci.aidataplatform_dp.models.GitMergeDetails`) — Folder/branch details to merge.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `mergeGitRepositoryResponse`

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-pullgitrepository"></a>`pullGitRepository`
(Preview) Performs a Git pull for the workspace branch so developers can sync local files with the latest upstream commits.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `gitRepositoryKey` (`string`) — The Git repository key.
- `gitPullDetails` (`oci.aidataplatform_dp.models.GitPullDetails`) — Folder/branch details to pull.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `pullGitRepositoryResponse`

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-rebasegitrepository"></a>`rebaseGitRepository`
(Preview) Rebases the workspace branch on top of another commit or branch to linearize history and resolve drift.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `gitRepositoryKey` (`string`) — The Git repository key.
- `gitRebaseDetails` (`oci.aidataplatform_dp.models.GitRebaseDetails`) — Details needed to perform rebase operation.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `rebaseGitRepositoryResponse`

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-resetgitfolderstate"></a>`resetGitFolderState`
(Preview) Halts in-progress Git operations and discards local changes in the workspace folder to regain a clean state.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `gitRepositoryKey` (`string`) — The Git repository key.
- `resetGitFolderStateDetails` (`oci.aidataplatform_dp.models.ResetGitFolderStateDetails`) — Merge conflict resolution details.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `resetGitFolderStateResponse`

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-resetgitrepository"></a>`resetGitRepository`
(Preview) Performs a Git reset so the workspace branch matches the specified commit, discarding newer local commits.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `gitRepositoryKey` (`string`) — The Git repository key.
- `gitResetDetails` (`oci.aidataplatform_dp.models.GitResetDetails`) — Details needed to perform Git reset operation.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `resetGitRepositoryResponse`

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-resolvegitconflicts"></a>`resolveGitConflicts`
(Preview) Accepts conflict resolution instructions—choose source or target versions—and records the resolution back to the repo.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `gitRepositoryKey` (`string`) — The Git repository key.
- `conflictResolveDetails` (`oci.aidataplatform_dp.models.ConflictResolveDetails`) — Conflict resolution details.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `resolveGitConflictsResponse`

**Response Fields:**
- `branchName` (string) — Gets the branch_name of this GitBranch. The name of the Git branch.
- `gitUrl` (string) — Gets the git_url of this GitBranch. The Git repository URL corresponding to the branch.
- `errorMessage` (string) — Gets the error_message of this GitBranch. Git error message.
- `stdOut` (string) — Gets the std_out of this GitBranch. Git STDOUT message.
- `stdErr` (string) — Gets the std_err of this GitBranch. Git STDERR message.
- `gitExitCode` (number) — Gets the git_exit_code of this GitBranch. Git exit status.

**Return:** [Back to Git (`GitClient`)](#gitclient-client) • [Top](#top)


### <a id="gitclient-updategitrepository"></a>`updateGitRepository`
(Preview) Updates stored repository details—such as credentials or default branches—so automation stays aligned with your source control.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `updateGitRepositoryDetails` (`oci.aidataplatform_dp.models.UpdateGitRepositoryDetails`) — The information to be updated.
- `gitRepositoryKey` (`string`) — The Git repository key.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateGitRepositoryResponse`

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
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `createExperimentDetails` (`oci.aidataplatform_dp.models.CreateExperimentDetails`) — Details for the new experiment.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createExperimentResponse`

**Response Fields:**
- `experiment_id` (string) — Gets the experiment_id of this CreateExperimentResponseDetails. Unique identifier for the experiment.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-createexperimentrun"></a>`createExperimentRun`
(Preview) Creates a new run within an experiment.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `createExperimentRunDetails` (`oci.aidataplatform_dp.models.CreateExperimentRunDetails`) — Details for the new run.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createExperimentRunResponse`

**Response Fields:**
- `run` (oci.aidataplatform_dp.models.ExperimentRun) — Gets the run of this CreateExperimentRunResponseDetails.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-createmodelversion"></a>`createModelVersion`
(Preview) Creates a model version.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `createModelVersionDetails` (`oci.aidataplatform_dp.models.CreateModelVersionDetails`) — Details for the new model version.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createModelVersionResponse`

**Response Fields:**
- `model_version` (oci.aidataplatform_dp.models.ModelVersion) — Gets the model_version of this CreateModelVersionResponseDetails.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-createregisteredmodel"></a>`createRegisteredModel`
(Preview) Creates a registered model in a workspace.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `createRegisteredModelDetails` (`oci.aidataplatform_dp.models.CreateRegisteredModelDetails`) — Details for the new registered model.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createRegisteredModelResponse`

**Response Fields:**
- `registered_model` (oci.aidataplatform_dp.models.RegisteredModel) — Gets the registered_model of this CreateRegisteredModelResponseDetails.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-createworkspacemodelversion"></a>`createWorkspaceModelVersion`
(Preview) Creates a new model version in a specified workspace.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `createModelVersionDetails` (`oci.aidataplatform_dp.models.CreateModelVersionDetails`) — Details for the new model version.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createWorkspaceModelVersionResponse`

**Response Fields:**
- `model_version` (oci.aidataplatform_dp.models.ModelVersion) — Gets the model_version of this CreateModelVersionResponseDetails.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-deleteexperiment"></a>`deleteExperiment`
(Preview) Deletes an experiment.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `deleteExperimentDetails` (`oci.aidataplatform_dp.models.DeleteExperimentDetails`) — Details of the experiment.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteExperimentResponse`

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-deleteexperimentrun"></a>`deleteExperimentRun`
(Preview) Deletes an experiment run.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `deleteExperimentRunDetails` (`oci.aidataplatform_dp.models.DeleteExperimentRunDetails`) — Details of the Experiment Run.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteExperimentRunResponse`

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-deleteexperimentruntag"></a>`deleteExperimentRunTag`
(Preview) Deletes a tag on an experiment run.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `deleteExperimentRunTagDetails` (`oci.aidataplatform_dp.models.DeleteExperimentRunTagDetails`) — Tag details to delete on an experiment run.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteExperimentRunTagResponse`

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-deleteexperimenttag"></a>`deleteExperimentTag`
(Preview) Deletes a tag on an experiment.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `deleteExperimentTagDetails` (`oci.aidataplatform_dp.models.DeleteExperimentTagDetails`) — Tag details to delete on an experiment.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteExperimentTagResponse`

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-deletemodelversion"></a>`deleteModelVersion`
(Preview) Deletes a model version.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `deleteModelVersionDetails` (`oci.aidataplatform_dp.models.DeleteModelVersionDetails`) — Details of the model version to delete.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteModelVersionResponse`

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-deletemodelversiontag"></a>`deleteModelVersionTag`
(Preview) Deletes a tag on a model version.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `deleteModelVersionTagDetails` (`oci.aidataplatform_dp.models.DeleteModelVersionTagDetails`) — Details of a model version tag to delete.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteModelVersionTagResponse`

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-deleteregisteredmodel"></a>`deleteRegisteredModel`
(Preview) Deletes a registered model.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `deleteRegisteredModelDetails` (`oci.aidataplatform_dp.models.DeleteRegisteredModelDetails`) — Details of the registered model to delete.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteRegisteredModelResponse`

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-deleteregisteredmodeltag"></a>`deleteRegisteredModelTag`
(Preview) Deletes a tag on a registered model.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `deleteRegisteredModelTagDetails` (`oci.aidataplatform_dp.models.DeleteRegisteredModelTagDetails`) — Details of a registered model tag.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteRegisteredModelTagResponse`

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-getexperimentbyid"></a>`getExperimentById`
(Preview) Returns metadata for an experiment by ID. This method works on deleted experiments.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `experimentId` (`string`) — The unique ID of the experiment to retrieve.

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getExperimentByIdResponse`

**Response Fields:**
- `experiment` (oci.aidataplatform_dp.models.Experiment) — Gets the experiment of this ExperimentResponse.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-getexperimentbyname"></a>`getExperimentByName`
(Preview) Returns experiment metadata for a given name. Returns deleted experiments, but prefers the active experiment if an active and deleted experiment share the same name. If multiple deleted experiments share the same name, the API will return one of them.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `experimentName` (`string`) — The name of the experiment to retrieve.

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getExperimentByNameResponse`

**Response Fields:**
- `experiment` (oci.aidataplatform_dp.models.Experiment) — Gets the experiment of this ExperimentResponse.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-getexperimentrunbyid"></a>`getExperimentRunById`
(Preview) Returns details of an experiment run by ID.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `runId` (`string`) — ID of the run to fetch.

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getExperimentRunByIdResponse`

**Response Fields:**
- `run` (oci.aidataplatform_dp.models.ExperimentRun) — Gets the run of this GetExperimentRunResponseDetails.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-getexperimentrunmetrichistory"></a>`getExperimentRunMetricHistory`
(Preview) Returns a history of experiment run metrics.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `runId` (`string`) — ID of the run metric history to fetch.
- `metricKey` (`string`) — Name of the metric key.

**Optional Parameters:**
- `pageToken` (`string`) — Pagination token to go to the next page of metric history.
- `maxResults` (`number`) — Maximum number of logged instances of a metric for a run to return per call. Backend servers may restrict the value of max_results depending on performance requirements. Requests that do not specify this value will behave as non-paginated queries where all metric history values for a given metric within a run are returned in a single response.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getExperimentRunMetricHistoryResponse`

**Response Fields:**
- `metrics` (list[oci.aidataplatform_dp.models.ExperimentRunMetric]) — Gets the metrics of this ExperimentRunMetricHistoryCollection. Logged values for the metric.
- `next_page_token` (string) — Gets the next_page_token of this ExperimentRunMetricHistoryCollection. Token that can be used to retrieve the next page of metric history. An empty token means that no more metric history are available for retrieval.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-getmodelversion"></a>`getModelVersion`
(Preview) Returns detailed information for a model version.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `name` (`string`) — Name of the model version.
- `version` (`string`) — Version number of the model version.

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getModelVersionResponse`

**Response Fields:**
- `model_version` (oci.aidataplatform_dp.models.ModelVersion) — Gets the model_version of this GetModelVersionResponseDetails.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-getregisteredmodel"></a>`getRegisteredModel`
(Preview) Returns details for a specified registered model.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `name` (`string`) — Name of the registered model.

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getRegisteredModelResponse`

**Response Fields:**
- `registered_model` (oci.aidataplatform_dp.models.RegisteredModel) — Gets the registered_model of this GetRegisteredModelResponseDetails.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-listartifacts"></a>`listArtifacts`
(Preview) Returns a list of artifacts.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `runId` (`string`) — ID of the run whose artifacts to list.

**Optional Parameters:**
- `path` (`string`) — Filter artifacts matching this path (a relative path from the root artifact directory).
- `pageToken` (`string`) — Token indicating the page of artifact results to fetch.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listArtifactsResponse`

**Response Fields:**
- `root_uri` (string) — Gets the root_uri of this ArtifactList. Root artifact directory for the run.
- `files` (list[oci.aidataplatform_dp.models.ArtifactFileInfo]) — Gets the files of this ArtifactList. File location and metadata for artifacts.
- `next_page_token` (string) — Gets the next_page_token of this ArtifactList. Token that can be used to retrieve the next page of artifact results.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-listexperimentruns"></a>`listExperimentRuns`
(Preview) Returns a list of experiment runs in a workspace.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `listExperimentRunsDetails` (`oci.aidataplatform_dp.models.ListExperimentRunsDetails`) — Details of experiment runs to fetch.

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listExperimentRunsResponse`

**Response Fields:**
- `runs` (list[oci.aidataplatform_dp.models.ExperimentRun]) — Gets the runs of this ExperimentRunCollection. Runs that match the search criteria.
- `next_page_token` (string) — Gets the next_page_token of this ExperimentRunCollection. Token that can be used to retrieve the next page of runs. An empty token means that no more runs are available for retrieval.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-listexperiments"></a>`listExperiments`
(Preview) Returns a list of experiments with the given details.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `listExperimentsDetails` (`oci.aidataplatform_dp.models.ListExperimentsDetails`) — Details of experiments to fetch.

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listExperimentsResponse`

**Response Fields:**
- `experiments` (list[oci.aidataplatform_dp.models.Experiment]) — Gets the experiments of this ExperimentCollection. Experiments that match the search criteria.
- `next_page_token` (string) — Gets the next_page_token of this ExperimentCollection. Token that can be used to retrieve the next page of experiments. An empty token means that no more experiments are available for retrieval.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-listloggedmodels"></a>`listLoggedModels`
(Preview) Returns a list of logged models.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `listLoggedModelsDetails` (`oci.aidataplatform_dp.models.ListLoggedModelsDetails`) — Details of logged models to fetch.

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listLoggedModelsResponse`

**Response Fields:**
- `models` (list[oci.aidataplatform_dp.models.LoggedModel]) — Gets the models of this LoggedModelCollection. Logged models that match the search criteria
- `next_page_token` (string) — Gets the next_page_token of this LoggedModelCollection. Token that can be used to retrieve the next page of logged-models. An empty token means that no more logged-models are available for retrieval.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-listmodelversions"></a>`listModelVersions`
(Preview) Returns a list of model versions.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

**Optional Parameters:**
- `filter` (`string`) — String filter condition, like "name LIKE 'my-model-name'". Single boolean condition, with string values wrapped in single quotes.
- `maxResults` (`number`) — Maximum number of model versions to retrieve.
- `pageToken` (`string`) — Pagination token to go to the next page based on a previous search query.
- `orderBy` (`string`) — List of columns to be ordered by including model name, version, stage with an optional "DESC" or "ASC" annotation, where "ASC" is the default. Tiebreaks are done by latest stage transition timestamp, followed by name ASC, followed by version DESC.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listModelVersionsResponse`

**Response Fields:**
- `model_versions` (list[oci.aidataplatform_dp.models.ModelVersion]) — Gets the model_versions of this ModelVersionCollection. Model versions that match the search criteria.
- `next_page_token` (string) — Gets the next_page_token of this ModelVersionCollection. Token that can be used to retrieve the next page of model versions.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-listregisteredmodels"></a>`listRegisteredModels`
(Preview) Returns a list of registered models in a workspace.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

**Optional Parameters:**
- `filter` (`string`) — String filter condition, like "name LIKE 'my-model-name'". Interpreted in the backend automatically as "name LIKE '%my-model-name%'". Single boolean condition, with string values wrapped in single quotes.
- `maxResults` (`number`) — Maximum number of models desired. Default is 100. Max threshold is 1000.
- `pageToken` (`string`) — Pagination token to go to the next page based on a previous search query.
- `orderBy` (`string`) — List of columns for ordering search results, which can include model name and last updated timestamp with an optional "DESC" or "ASC" annotation, where "ASC" is the default. Tiebreaks are done by model name ASC.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listRegisteredModelsResponse`

**Response Fields:**
- `registered_models` (list[oci.aidataplatform_dp.models.RegisteredModel]) — Gets the registered_models of this RegisteredModelCollection. Registered models that match the search criteria.
- `next_page_token` (string) — Gets the next_page_token of this RegisteredModelCollection. Token that can be used to retrieve the next page of registered models.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-logexperimentrunbatch"></a>`logExperimentRunBatch`
(Preview) Logs an experiment run batch.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `logExperimentRunBatchDetails` (`oci.aidataplatform_dp.models.LogExperimentRunBatchDetails`) — Details of an experiment run batch.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `logExperimentRunBatchResponse`

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-logexperimentruninputs"></a>`logExperimentRunInputs`
(Preview) Logs experiment run inputs.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `logExperimentRunInputsDetails` (`oci.aidataplatform_dp.models.LogExperimentRunInputsDetails`) — Details of experiment run inputs.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `logExperimentRunInputsResponse`

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-logexperimentrunmetric"></a>`logExperimentRunMetric`
(Preview) Logs an experiment run metric.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `logExperimentRunMetricDetails` (`oci.aidataplatform_dp.models.LogExperimentRunMetricDetails`) — Details of an experiment run metric.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `logExperimentRunMetricResponse`

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-logexperimentrunmodel"></a>`logExperimentRunModel`
(Preview) Logs an experiment run model.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `logExperimentRunModelDetails` (`oci.aidataplatform_dp.models.LogExperimentRunModelDetails`) — Details of an experiment run model.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `logExperimentRunModelResponse`

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-logexperimentrunparam"></a>`logExperimentRunParam`
(Preview) Logs an experiment run parameter.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `logExperimentRunParamDetails` (`oci.aidataplatform_dp.models.LogExperimentRunParamDetails`) — Details of an experiment run parameter.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `logExperimentRunParamResponse`

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-renameregisteredmodel"></a>`renameRegisteredModel`
(Preview) Renames a registered model.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `renameRegisteredModelDetails` (`oci.aidataplatform_dp.models.RenameRegisteredModelDetails`) — Details of a registered model rename.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `renameRegisteredModelResponse`

**Response Fields:**
- `registered_model` (oci.aidataplatform_dp.models.RegisteredModel) — Gets the registered_model of this RenameRegisteredModelResponseDetails.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-restoreexperiment"></a>`restoreExperiment`
(Preview) Restores an experiment.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `restoreExperimentDetails` (`oci.aidataplatform_dp.models.RestoreExperimentDetails`) — Restore experiment details.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `restoreExperimentResponse`

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-restoreexperimentrun"></a>`restoreExperimentRun`
(Preview) Restores an experiment run.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `restoreExperimentRunDetails` (`oci.aidataplatform_dp.models.RestoreExperimentRunDetails`) — Restore experiment run details.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `restoreExperimentRunResponse`

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-setexperimentruntag"></a>`setExperimentRunTag`
(Preview) Sets a tag on an experiment run.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `setExperimentRunTagDetails` (`oci.aidataplatform_dp.models.SetExperimentRunTagDetails`) — Tag details to set on an experiment run.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `setExperimentRunTagResponse`

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-setexperimenttag"></a>`setExperimentTag`
(Preview) Sets a tag on an experiment.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `setExperimentTagDetails` (`oci.aidataplatform_dp.models.SetExperimentTagDetails`) — Tag details to set on an experiment.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `setExperimentTagResponse`

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-setmodelversiontag"></a>`setModelVersionTag`
(Preview) Sets a tag on a model version.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `setModelVersionTagDetails` (`oci.aidataplatform_dp.models.SetModelVersionTagDetails`) — Details of a model version tag.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `setModelVersionTagResponse`

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-setregisteredmodeltag"></a>`setRegisteredModelTag`
(Preview) Sets a tag on a registered model.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `setRegisteredModelTagDetails` (`oci.aidataplatform_dp.models.SetRegisteredModelTagDetails`) — Details of a registered model tag.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `setRegisteredModelTagResponse`

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-transitionmodelversionstage"></a>`transitionModelVersionStage`
(Preview) Transitions a model version stage.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `transitionModelVersionStageDetails` (`oci.aidataplatform_dp.models.TransitionModelVersionStageDetails`) — Details to transition a model version stage.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `transitionModelVersionStageResponse`

**Response Fields:**
- `model_version` (oci.aidataplatform_dp.models.ModelVersion) — Gets the model_version of this TransitionModelVersionStageResponseDetails.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-updateexperiment"></a>`updateExperiment`
(Preview) Updates an experiment.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `updateExperimentDetails` (`oci.aidataplatform_dp.models.UpdateExperimentDetails`) — Update experiment metadata.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateExperimentResponse`

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-updateexperimentrun"></a>`updateExperimentRun`
(Preview) Updates an experiment run.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `updateExperimentRunDetails` (`oci.aidataplatform_dp.models.UpdateExperimentRunDetails`) — Update experiment run details.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateExperimentRunResponse`

**Response Fields:**
- `run_info` (oci.aidataplatform_dp.models.ExperimentRunInfo) — Gets the run_info of this UpdateExperimentRunResponseDetails.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-updateexperimentruntags"></a>`updateExperimentRunTags`
(Preview) Updates tags on an experiment run.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `updateExperimentRunTagsDetails` (`oci.aidataplatform_dp.models.UpdateExperimentRunTagsDetails`) — Details of ExperimentRun tags.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateExperimentRunTagsResponse`

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-updateexperimenttags"></a>`updateExperimentTags`
(Preview) Updates tags on experiment.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `updateExperimentTagsDetails` (`oci.aidataplatform_dp.models.UpdateExperimentTagsDetails`) — Details of Experiment tags.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateExperimentTagsResponse`

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-updatemodelversion"></a>`updateModelVersion`
(Preview) Updates a model version

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `updateModelVersionDetails` (`oci.aidataplatform_dp.models.UpdateModelVersionDetails`) — Details to update model version.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateModelVersionResponse`

**Response Fields:**
- `model_version` (oci.aidataplatform_dp.models.ModelVersion) — Gets the model_version of this UpdateModelVersionResponseDetails.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-updatemodelversiontags"></a>`updateModelVersionTags`
(Preview) Updates tags on a model version.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `updateModelVersionTagsDetails` (`oci.aidataplatform_dp.models.UpdateModelVersionTagsDetails`) — Details of model version tags to update.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateModelVersionTagsResponse`

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-updateregisteredmodel"></a>`updateRegisteredModel`
(Preview) Updates a registered model with the provided details.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `updateRegisteredModelDetails` (`oci.aidataplatform_dp.models.UpdateRegisteredModelDetails`) — Details to update the registered model.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateRegisteredModelResponse`

**Response Fields:**
- `registered_model` (oci.aidataplatform_dp.models.RegisteredModel) — Gets the registered_model of this UpdateRegisteredModelResponseDetails.

**Return:** [Back to ML Ops (`MLOpsClient`)](#mlopsclient-client) • [Top](#top)


### <a id="mlopsclient-updateregisteredmodeltags"></a>`updateRegisteredModelTags`
(Preview) Updates tags on a registered model.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `updateRegisteredModelTagsDetails` (`oci.aidataplatform_dp.models.UpdateRegisteredModelTagsDetails`) — Details of registered model tags.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateRegisteredModelTagsResponse`

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
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `contentPath` (`string`) — The path to the notebook file.
- `createContentDetails` (`oci.aidataplatform_dp.models.CreateContentDetails`) — Notebook content to create a new notebook.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `datalakeTenantId` (`string`) — The tenant ID header.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createContentResponse`

**Response Fields:**
- `name` (string) — Gets the name of this Content. Name of notebook, file or directory, equivalent to the last part of the path.
- `path` (string) — Gets the path of this Content. Full path for notebook, file or directory.
- `type` (string) — Gets the type of this Content. Type of content model. Allowed values for this property are: "notebook", "file", "directory", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `writable` (boolean) — Gets the writable of this Content. Indicates whether the requester has permission to edit the file.
- `created` (datetime) — Gets the created of this Content. Creation timestamp.
- `last_modified` (datetime) — Gets the last_modified of this Content. Last modified timestamp.
- `size` (number) — Gets the size of this Content. Size of file or notebook in bytes. If no size is provided, defaults to null.
- `mimetype` (string) — Gets the mimetype of this Content. Mimetype is only applicable for File model. For other models, it is None. If content is not null, and type is 'file', this contains the mimetype of file. For example, text/plain application/octet-stream. Otherwise this is null.
- `content` (object) — Gets the content of this Content. Content if requested, otherwise is Null. For Notebook model, this contains a nbformat NotebookNode representing the .ipynb file represented by the model. For File model, content field is always Unicode type. For text-format file models, content simply contains the bytes of the file after decoding as UTF-8. Non-text (base64) files are read as bytes, base64 encoded, and then decoded as UTF-8. For Directory model, content field contains a list of content-free models representing the entities in the directory.
- `format` (string) — Gets the format of this Content. Format of content. For Notebook model, format field is always 'json'. For File model, format field is either 'text' or 'base64'. For directory model, format field is always 'json'. Allowed values for this property are: "NULL", "json", "text", "base64", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `hash` (string) — Gets the hash of this Content. [optional] The hexdigest hash string of content, if requested, otherwise null. It cannot be null if hashAlgorithm is defined.
- `hash_algorithm` (string) — Gets the hash_algorithm of this Content. [optional] The algorithm used to produce the hash, if requested, (otherwise null). It cannot be null if hash is defined. <a href="https://docs.python.org/3/library/hashlib.html#hashlib.algorithms_available" target="_blank" rel="noopener noreferrer">Available algorithms</a>.
- `description` (string) — Gets the description of this Content. A user-provided description of the file.

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)


### <a id="notebookclient-createsession"></a>`createSession`
Creates a new session or returns an existing session if a session for the given path already exists.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `createSessionDetails` (`oci.aidataplatform_dp.models.CreateSessionDetails`) — Details to create a new session.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `datalakeTenantId` (`string`) — The tenant ID header.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createSessionResponse`

**Response Fields:**
- `id` (string) — Gets the id of this Session. UUID of the notebook session.
- `name` (string) — Gets the name of this Session. A user-friendly name for the notebook session.
- `path` (string) — Gets the path of this Session. Path to notebook session. For example, /data/test.ipynb
- `type` (string) — Gets the type of this Session. Notebook session type. Allowed values for this property are: "notebook", "file", "agentflow", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `cluster_id` (string) — Gets the cluster_id of this Session. Cluster ID.
- `kernel` (oci.aidataplatform_dp.models.Kernel) — Gets the kernel of this Session.
- `agentFlowKey` (string) — Gets the agent_flow_key of this Session. Agent Flow Key of an agent flow.
- `lifecycleState` (string) — Gets the lifecycle_state of this Session. lifecycleState of a Notebook Session. Allowed values for this property are: "CREATING", "ACTIVE", "FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)


### <a id="notebookclient-deletecontent"></a>`deleteContent`
Deletes a notebook file or directory.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `contentPath` (`string`) — The path to the notebook file.

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteContentResponse`

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)


### <a id="notebookclient-deletesession"></a>`deleteSession`
Delete a session with given session ID.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `sessionId` (`string`) — The ID of the Data Lake Notebook Session

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteSessionResponse`

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)


### <a id="notebookclient-exportcontents"></a>`exportContents`
Exports the notebook file contents. You can optionally specify HTML or ipynb format through the request payload. If no format is specified, ipynb is used by default.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `contentPath` (`string`) — The path to the notebook file.
- `exportContentsDetails` (`oci.aidataplatform_dp.models.ExportContentsDetails`) — Payload to export contents of a file.

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `exportContentsResponse`

**Response Fields:**
- `name` (string) — Gets the name of this ExportedContents. Name of file, equivalent to the last part of the path.
- `path` (string) — Gets the path of this ExportedContents. Full path of the file.
- `content` (object) — Gets the content of this ExportedContents. For ipynb format, this contains a string representing the .ipynb file. For html format, this contains a string representing the HTML page, it has base64 encoded data for images.
- `format` (string) — Gets the format of this ExportedContents. Format of content as requested by the client. By default, ipynb format. Allowed values for this property are: "html", "ipynb", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)


### <a id="notebookclient-getcontent"></a>`getContent`
Returns a list of contents for a given file or directory. You can optionally specify a type and/or format argument via URL parameter. When given, the Content service returns a model in the requested type and/or format. If the request cannot be satisfied, for example if type=text is requested, but the file is binary, then the request returns a 400 message and a JSON response with a Reason field identifying the issue. The value of the Reason field is ‘bad format’ or ‘bad type’, depending on what was requested.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `contentPath` (`string`) — The path to the notebook file.

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `type` (`string`) — Content type. Either file, directory, or notebook. Allowed values are: "file", "directory", "notebook"
- `format` (`string`) — The format in which content should be returned. Either text, base64, or JSON. Allowed values are: "text", "base64", "json"
- `content` (`number`) — Returns content based on param value. When set to 0, content is NOT returned. When set to 1, content is returned.
- `hash` (`number`) — Returns hash hexdigest string of content and the hash algorithm. 0 for no hash, 1 for return hash. 0 is default. It may be ignored by the content manager.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getContentResponse`

**Response Fields:**
- `name` (string) — Gets the name of this Content. Name of notebook, file or directory, equivalent to the last part of the path.
- `path` (string) — Gets the path of this Content. Full path for notebook, file or directory.
- `type` (string) — Gets the type of this Content. Type of content model. Allowed values for this property are: "notebook", "file", "directory", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `writable` (boolean) — Gets the writable of this Content. Indicates whether the requester has permission to edit the file.
- `created` (datetime) — Gets the created of this Content. Creation timestamp.
- `last_modified` (datetime) — Gets the last_modified of this Content. Last modified timestamp.
- `size` (number) — Gets the size of this Content. Size of file or notebook in bytes. If no size is provided, defaults to null.
- `mimetype` (string) — Gets the mimetype of this Content. Mimetype is only applicable for File model. For other models, it is None. If content is not null, and type is 'file', this contains the mimetype of file. For example, text/plain application/octet-stream. Otherwise this is null.
- `content` (object) — Gets the content of this Content. Content if requested, otherwise is Null. For Notebook model, this contains a nbformat NotebookNode representing the .ipynb file represented by the model. For File model, content field is always Unicode type. For text-format file models, content simply contains the bytes of the file after decoding as UTF-8. Non-text (base64) files are read as bytes, base64 encoded, and then decoded as UTF-8. For Directory model, content field contains a list of content-free models representing the entities in the directory.
- `format` (string) — Gets the format of this Content. Format of content. For Notebook model, format field is always 'json'. For File model, format field is either 'text' or 'base64'. For directory model, format field is always 'json'. Allowed values for this property are: "NULL", "json", "text", "base64", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `hash` (string) — Gets the hash of this Content. [optional] The hexdigest hash string of content, if requested, otherwise null. It cannot be null if hashAlgorithm is defined.
- `hash_algorithm` (string) — Gets the hash_algorithm of this Content. [optional] The algorithm used to produce the hash, if requested, (otherwise null). It cannot be null if hash is defined. <a href="https://docs.python.org/3/library/hashlib.html#hashlib.algorithms_available" target="_blank" rel="noopener noreferrer">Available algorithms</a>.
- `description` (string) — Gets the description of this Content. A user-provided description of the file.

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)


### <a id="notebookclient-getsession"></a>`getSession`
Returns session details for a given session ID.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `sessionId` (`string`) — The ID of the Data Lake Notebook Session

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getSessionResponse`

**Response Fields:**
- `id` (string) — Gets the id of this Session. UUID of the notebook session.
- `name` (string) — Gets the name of this Session. A user-friendly name for the notebook session.
- `path` (string) — Gets the path of this Session. Path to notebook session. For example, /data/test.ipynb
- `type` (string) — Gets the type of this Session. Notebook session type. Allowed values for this property are: "notebook", "file", "agentflow", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `cluster_id` (string) — Gets the cluster_id of this Session. Cluster ID.
- `kernel` (oci.aidataplatform_dp.models.Kernel) — Gets the kernel of this Session.
- `agentFlowKey` (string) — Gets the agent_flow_key of this Session. Agent Flow Key of an agent flow.
- `lifecycleState` (string) — Gets the lifecycle_state of this Session. lifecycleState of a Notebook Session. Allowed values for this property are: "CREATING", "ACTIVE", "FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)


### <a id="notebookclient-listsessions"></a>`listSessions`
Returns a list of all available sessions.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace

**Optional Parameters:**
- `clusterId` (`string`) — Cluster ID attached to a session.
- `path` (`string`) — Notebook file path attached to a session.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `agentFlowKey` (`string`) — Agent flow key of the attached agent flow.
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Allowed values are: "timeCreated"
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listSessionsResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.SessionSummary]) — Gets the items of this SessionCollection. List of sessions.

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)


### <a id="notebookclient-modifycontent"></a>`modifyContent`
Renames a file or directory without re-uploading content.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `contentPath` (`string`) — The path to the notebook file.
- `modifyContentDetails` (`oci.aidataplatform_dp.models.ModifyContentDetails`) — New path for file or directory.

**Optional Parameters:**
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `modifyContentResponse`

**Response Fields:**
- `name` (string) — Gets the name of this Content. Name of notebook, file or directory, equivalent to the last part of the path.
- `path` (string) — Gets the path of this Content. Full path for notebook, file or directory.
- `type` (string) — Gets the type of this Content. Type of content model. Allowed values for this property are: "notebook", "file", "directory", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `writable` (boolean) — Gets the writable of this Content. Indicates whether the requester has permission to edit the file.
- `created` (datetime) — Gets the created of this Content. Creation timestamp.
- `last_modified` (datetime) — Gets the last_modified of this Content. Last modified timestamp.
- `size` (number) — Gets the size of this Content. Size of file or notebook in bytes. If no size is provided, defaults to null.
- `mimetype` (string) — Gets the mimetype of this Content. Mimetype is only applicable for File model. For other models, it is None. If content is not null, and type is 'file', this contains the mimetype of file. For example, text/plain application/octet-stream. Otherwise this is null.
- `content` (object) — Gets the content of this Content. Content if requested, otherwise is Null. For Notebook model, this contains a nbformat NotebookNode representing the .ipynb file represented by the model. For File model, content field is always Unicode type. For text-format file models, content simply contains the bytes of the file after decoding as UTF-8. Non-text (base64) files are read as bytes, base64 encoded, and then decoded as UTF-8. For Directory model, content field contains a list of content-free models representing the entities in the directory.
- `format` (string) — Gets the format of this Content. Format of content. For Notebook model, format field is always 'json'. For File model, format field is either 'text' or 'base64'. For directory model, format field is always 'json'. Allowed values for this property are: "NULL", "json", "text", "base64", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `hash` (string) — Gets the hash of this Content. [optional] The hexdigest hash string of content, if requested, otherwise null. It cannot be null if hashAlgorithm is defined.
- `hash_algorithm` (string) — Gets the hash_algorithm of this Content. [optional] The algorithm used to produce the hash, if requested, (otherwise null). It cannot be null if hash is defined. <a href="https://docs.python.org/3/library/hashlib.html#hashlib.algorithms_available" target="_blank" rel="noopener noreferrer">Available algorithms</a>.
- `description` (string) — Gets the description of this Content. A user-provided description of the file.

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)


### <a id="notebookclient-patchsession"></a>`patchSession`
Patches a session with a given ID with the provided details. You can use this to rename a session.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `sessionId` (`string`) — The ID of the Data Lake Notebook Session
- `patchSessionDetails` (`oci.aidataplatform_dp.models.PatchSessionDetails`) — Details to patch for an existing session.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `patchSessionResponse`

**Response Fields:**
- `id` (string) — Gets the id of this Session. UUID of the notebook session.
- `name` (string) — Gets the name of this Session. A user-friendly name for the notebook session.
- `path` (string) — Gets the path of this Session. Path to notebook session. For example, /data/test.ipynb
- `type` (string) — Gets the type of this Session. Notebook session type. Allowed values for this property are: "notebook", "file", "agentflow", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `cluster_id` (string) — Gets the cluster_id of this Session. Cluster ID.
- `kernel` (oci.aidataplatform_dp.models.Kernel) — Gets the kernel of this Session.
- `agentFlowKey` (string) — Gets the agent_flow_key of this Session. Agent Flow Key of an agent flow.
- `lifecycleState` (string) — Gets the lifecycle_state of this Session. lifecycleState of a Notebook Session. Allowed values for this property are: "CREATING", "ACTIVE", "FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.

**Return:** [Back to Notebook (`NotebookClient`)](#notebookclient-client) • [Top](#top)


### <a id="notebookclient-updatecontent"></a>`updateContent`
Updates the contents of an existing notebook with the provided details or saves a new notebook.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `contentPath` (`string`) — The path to the notebook file.
- `updateContentDetails` (`oci.aidataplatform_dp.models.UpdateContentDetails`) — Details to update the notebook content model file.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateContentResponse`

**Response Fields:**
- `name` (string) — Gets the name of this Content. Name of notebook, file or directory, equivalent to the last part of the path.
- `path` (string) — Gets the path of this Content. Full path for notebook, file or directory.
- `type` (string) — Gets the type of this Content. Type of content model. Allowed values for this property are: "notebook", "file", "directory", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `writable` (boolean) — Gets the writable of this Content. Indicates whether the requester has permission to edit the file.
- `created` (datetime) — Gets the created of this Content. Creation timestamp.
- `last_modified` (datetime) — Gets the last_modified of this Content. Last modified timestamp.
- `size` (number) — Gets the size of this Content. Size of file or notebook in bytes. If no size is provided, defaults to null.
- `mimetype` (string) — Gets the mimetype of this Content. Mimetype is only applicable for File model. For other models, it is None. If content is not null, and type is 'file', this contains the mimetype of file. For example, text/plain application/octet-stream. Otherwise this is null.
- `content` (object) — Gets the content of this Content. Content if requested, otherwise is Null. For Notebook model, this contains a nbformat NotebookNode representing the .ipynb file represented by the model. For File model, content field is always Unicode type. For text-format file models, content simply contains the bytes of the file after decoding as UTF-8. Non-text (base64) files are read as bytes, base64 encoded, and then decoded as UTF-8. For Directory model, content field contains a list of content-free models representing the entities in the directory.
- `format` (string) — Gets the format of this Content. Format of content. For Notebook model, format field is always 'json'. For File model, format field is either 'text' or 'base64'. For directory model, format field is always 'json'. Allowed values for this property are: "NULL", "json", "text", "base64", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `hash` (string) — Gets the hash of this Content. [optional] The hexdigest hash string of content, if requested, otherwise null. It cannot be null if hashAlgorithm is defined.
- `hash_algorithm` (string) — Gets the hash_algorithm of this Content. [optional] The algorithm used to produce the hash, if requested, (otherwise null). It cannot be null if hash is defined. <a href="https://docs.python.org/3/library/hashlib.html#hashlib.algorithms_available" target="_blank" rel="noopener noreferrer">Available algorithms</a>.
- `description` (string) — Gets the description of this Content. A user-provided description of the file.

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
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `roleKey` (`string`) — The unique key of the Role.
- `addMemberToRoleDetails` (`oci.aidataplatform_dp.models.AddMemberToRoleDetails`) — The details of the assignee(s) to which a role is assigned.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `addMemberToRoleResponse`

**Return:** [Back to Role (`RoleClient`)](#roleclient-client) • [Top](#top)


### <a id="roleclient-createrole"></a>`createRole`
Creates a role.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `createRoleDetails` (`oci.aidataplatform_dp.models.CreateRoleDetails`) — Details for the new role.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createRoleResponse`

**Response Fields:**
- `key` (string) — Gets the key of this Role. A unique key for the role. It cannot be changed.
- `displayName` (string) — Gets the display_name of this Role. The role name. It can be changed.
- `roleType` (string) — Gets the role_type of this Role. Type of role. Allowed values for this property are: "SYSTEM", "CUSTOM", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `timeCreated` (datetime) — Gets the time_created of this Role. The time the role was created. An RFC3339 formatted datetime string.
- `timeUpdated` (datetime) — Gets the time_updated of this Role. The time the Role was updated. An RFC3339 formatted datetime string.
- `createdBy` (string) — Gets the created_by of this Role. The user name of the user/principal who created the role.
- `updatedBy` (string) — Gets the updated_by of this Role. The user name of the user/principal who updated the role.
- `isAssigned` (boolean) — Gets the is_assigned of this Role. The role is assigned to the current user or a group that the user is part of.
- `assignees` (list[oci.aidataplatform_dp.models.RoleAssignee]) — Gets the assignees of this Role. The users and groups this role is assigned to.
- `lifecycleState` (string) — Gets the lifecycle_state of this Role. The state of the role. Allowed values for this property are: "ACTIVE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleDetails` (string) — Gets the lifecycle_details of this Role. A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.
- `description` (string) — Gets the description of this Role. The description of the role.

**Return:** [Back to Role (`RoleClient`)](#roleclient-client) • [Top](#top)


### <a id="roleclient-deleterole"></a>`deleteRole`
Deletes a role.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `roleKey` (`string`) — The unique key of the Role.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteRoleResponse`

**Return:** [Back to Role (`RoleClient`)](#roleclient-client) • [Top](#top)


### <a id="roleclient-getrole"></a>`getRole`
Returns detailed information about a role.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `roleKey` (`string`) — The unique key of the Role.

**Optional Parameters:**
- `roleScope` (`string`) — The scope of roles to be returned. Defaults to USER. Allowed values are: "USER", "ADMIN", "MEMBER_OF"
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getRoleResponse`

**Response Fields:**
- `key` (string) — Gets the key of this Role. A unique key for the role. It cannot be changed.
- `displayName` (string) — Gets the display_name of this Role. The role name. It can be changed.
- `roleType` (string) — Gets the role_type of this Role. Type of role. Allowed values for this property are: "SYSTEM", "CUSTOM", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `timeCreated` (datetime) — Gets the time_created of this Role. The time the role was created. An RFC3339 formatted datetime string.
- `timeUpdated` (datetime) — Gets the time_updated of this Role. The time the Role was updated. An RFC3339 formatted datetime string.
- `createdBy` (string) — Gets the created_by of this Role. The user name of the user/principal who created the role.
- `updatedBy` (string) — Gets the updated_by of this Role. The user name of the user/principal who updated the role.
- `isAssigned` (boolean) — Gets the is_assigned of this Role. The role is assigned to the current user or a group that the user is part of.
- `assignees` (list[oci.aidataplatform_dp.models.RoleAssignee]) — Gets the assignees of this Role. The users and groups this role is assigned to.
- `lifecycleState` (string) — Gets the lifecycle_state of this Role. The state of the role. Allowed values for this property are: "ACTIVE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleDetails` (string) — Gets the lifecycle_details of this Role. A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.
- `description` (string) — Gets the description of this Role. The description of the role.

**Return:** [Back to Role (`RoleClient`)](#roleclient-client) • [Top](#top)


### <a id="roleclient-listrolepermissions"></a>`listRolePermissions`
Returns a list of permissions for a given role.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `roleKey` (`string`) — The unique key of the Role.

**Optional Parameters:**
- `permissionScope` (`string`) — The scope of role permissions to be returned. Defaults to ALL Allowed values are: "DIRECT", "INHERITED", "ALL"
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listRolePermissionsResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.RolePermissionSummary]) — Gets the items of this RolePermissionCollection. Role permissions.

**Return:** [Back to Role (`RoleClient`)](#roleclient-client) • [Top](#top)


### <a id="roleclient-listroles"></a>`listRoles`
Returns a list of roles.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

**Optional Parameters:**
- `lifecycleState` (`string`) — A filter to return only resources that match the given lifecycle state. The state value is case-insensitive. Allowed values are: "ACTIVE"
- `displayName` (`string`) — A filter to return only resources that match the given display name exactly.
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listRolesResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.RoleSummary]) — Gets the items of this RoleCollection. The role summaries returned.

**Return:** [Back to Role (`RoleClient`)](#roleclient-client) • [Top](#top)


### <a id="roleclient-removememberfromrole"></a>`removeMemberFromRole`
Revoke a role from a given user or group.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `roleKey` (`string`) — The unique key of the Role.
- `removeMemberFromRoleDetails` (`oci.aidataplatform_dp.models.RemoveMemberFromRoleDetails`) — The details of the user or group from which the role is to be revoked.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `removeMemberFromRoleResponse`

**Return:** [Back to Role (`RoleClient`)](#roleclient-client) • [Top](#top)


### <a id="roleclient-updaterole"></a>`updateRole`
Updates a role with the provided information.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `roleKey` (`string`) — The unique key of the Role.
- `updateRoleDetails` (`oci.aidataplatform_dp.models.UpdateRoleDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateRoleResponse`

**Response Fields:**
- `key` (string) — Gets the key of this Role. A unique key for the role. It cannot be changed.
- `displayName` (string) — Gets the display_name of this Role. The role name. It can be changed.
- `roleType` (string) — Gets the role_type of this Role. Type of role. Allowed values for this property are: "SYSTEM", "CUSTOM", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `timeCreated` (datetime) — Gets the time_created of this Role. The time the role was created. An RFC3339 formatted datetime string.
- `timeUpdated` (datetime) — Gets the time_updated of this Role. The time the Role was updated. An RFC3339 formatted datetime string.
- `createdBy` (string) — Gets the created_by of this Role. The user name of the user/principal who created the role.
- `updatedBy` (string) — Gets the updated_by of this Role. The user name of the user/principal who updated the role.
- `isAssigned` (boolean) — Gets the is_assigned of this Role. The role is assigned to the current user or a group that the user is part of.
- `assignees` (list[oci.aidataplatform_dp.models.RoleAssignee]) — Gets the assignees of this Role. The users and groups this role is assigned to.
- `lifecycleState` (string) — Gets the lifecycle_state of this Role. The state of the role. Allowed values for this property are: "ACTIVE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleDetails` (string) — Gets the lifecycle_details of this Role. A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.
- `description` (string) — Gets the description of this Role. The description of the role.

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
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `createDataTableDetails` (`oci.aidataplatform_dp.models.CreateDataTableDetails`) — Details for the new managed table with data.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createDataTableResponse`

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-createschema"></a>`createSchema`
Creates a schema.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `createSchemaDetails` (`oci.aidataplatform_dp.models.CreateSchemaDetails`) — Details for the new schema.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createSchemaResponse`

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-createtable"></a>`createTable`
Creates a table.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `createTableDetails` (`oci.aidataplatform_dp.models.CreateTableDetails`) — Details for the new table.

**Optional Parameters:**
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createTableResponse`

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-createview"></a>`createView`
Creates a view.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `createViewDetails` (`oci.aidataplatform_dp.models.CreateViewDetails`) — Details for the new view.

**Optional Parameters:**
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createViewResponse`

**Response Fields:**
- `key` (string) — Gets the key of this View. The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>
- `displayName` (string) — Gets the display_name of this View. A user-friendly name. Has to be unique within the scope of the schema and is changeable.
- `catalogKey` (string) — Gets the catalog_key of this View. The name of the catalog to which this view belongs.
- `schemaKey` (string) — Gets the schema_key of this View. The name of the Schema to which this view belongs.
- `viewText` (string) — Gets the view_text of this View. The Query used to create the view.
- `description` (string) — Gets the description of this View. The description of the view.
- `viewFields` (list[oci.aidataplatform_dp.models.ViewFieldDetails]) — Gets the view_fields of this View. Columns for view.
- `timeCreated` (datetime) — Gets the time_created of this View. The date and time the View was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `timeUpdated` (datetime) — Gets the time_updated of this View. The date and time the View was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `createdBy` (string) — Gets the created_by of this View. The ID of the user/principal who created the view.
- `updatedBy` (string) — Gets the updated_by of this View. The ID of the user who last updated the view.
- `viewProperties` (list[oci.aidataplatform_dp.models.ViewProperty]) — Gets the view_properties of this View. View Properties.
- `lifecycleState` (string) — Gets the lifecycle_state of this View. The state of the view. Allowed values for this property are: "ACTIVE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleStateDetails` (string) — Gets the lifecycle_state_details of this View. A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-deleteschema"></a>`deleteSchema`
Deletes a schema.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `schemaKey` (`string`) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.

**Optional Parameters:**
- `isForced` (`boolean`) — A boolean which decides if an entity should be deleted with Cascade effect
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteSchemaResponse`

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-deletetable"></a>`deleteTable`
Deletes a table.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `tableKey` (`string`) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.

**Optional Parameters:**
- `displayName` (`string`) — A filter to return only resources that match the given display name exactly.
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteTableResponse`

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-deleteview"></a>`deleteView`
Deletes a view.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `viewKey` (`string`) — The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>.

**Optional Parameters:**
- `displayName` (`string`) — A filter to return only resources that match the given display name exactly.
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteViewResponse`

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-generatetempfileuploadtarget"></a>`generateTempFileUploadTarget`
Generates a URI for uploading a sample file to a temporary folder in a schema.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `schemaKey` (`string`) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `generateTempFileUploadTargetResponse`

**Response Fields:**
- `tempFileUploadTarget` (string) — Gets the temp_file_upload_target of this GenerateTempFileUploadTargetResponseDetails. The generated target URI to upload the file, it must be prefixed by object stroage URL.
- `uploadKey` (string) — Gets the upload_key of this GenerateTempFileUploadTargetResponseDetails. The unique key for this request.
- `ociFilePath` (string) — Gets the oci_file_path of this GenerateTempFileUploadTargetResponseDetails. The exact URI path of the object storage.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-getschema"></a>`getSchema`
Returns detailed information about a specified schema.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `schemaKey` (`string`) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getSchemaResponse`

**Response Fields:**
- `entityType` (string) — Gets the entity_type of this Schema. An enum to decide the type of the derived model. Allowed values for this property are: "ADW", "ALH", "STANDARD", "KAFKA_TOPIC", "ATP", "ORACLE", "EXADATA", "MYSQL", "AZURE_SQLSERVER", "SNOWFLAKE", "GOOGLE_BIGQUERY", "ORACLE_ANALYTICS", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `key` (string) — Gets the key of this Schema. The fully qualified name of the schema in the format <catalog_name>.<schema_name>.
- `displayName` (string) — Gets the display_name of this Schema. Schema name.
- `description` (string) — Gets the description of this Schema. Schema description.
- `timeCreated` (datetime) — Gets the time_created of this Schema. The date and time the schema was created.
- `timeUpdated` (datetime) — Gets the time_updated of this Schema. The date and time the schema was updated.
- `createdBy` (string) — Gets the created_by of this Schema. ID of the user who created the schema.
- `updatedBy` (string) — Gets the updated_by of this Schema. ID of the user who last updated the schema.
- `properties` (dict(str, str)) — Gets the properties of this Schema. Key-value pair representing a defined tag key and value.
- `catalogName` (string) — Gets the catalog_name of this Schema. The name of the catalog to which this schema belongs.
- `lifecycleState` (string) — Gets the lifecycle_state of this Schema. The current state of the schema. Allowed values for this property are: "ACTIVE", "CREATING", "DELETING", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleStateDetails` (string) — Gets the lifecycle_state_details of this Schema. A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.
- `details` (dict(str, str)) — Gets the details of this Schema. Deprecated field. Map of key-value pairs. This object will be only provided when the parent catalog is external.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-gettable"></a>`getTable`
Returns detailed information about a table.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `tableKey` (`string`) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getTableResponse`

**Response Fields:**
- `entityType` (string) — Gets the entity_type of this Table. An enum to decide the type of the derived model Allowed values for this property are: "ADW", "ALH", "STANDARD", "ATP", "ORACLE", "EXADATA", "MYSQL", "AZURE_SQLSERVER", "SNOWFLAKE", "GOOGLE_BIGQUERY", "ORACLE_ANALYTICS", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `key` (string) — Gets the key of this Table. The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.
- `displayName` (string) — Gets the display_name of this Table. Table name.
- `catalogKey` (string) — Gets the catalog_key of this Table. The name of the catalog to which this table belongs.
- `schemaKey` (string) — Gets the schema_key of this Table. The name of the schema to which this table belongs.
- `location` (string) — Gets the location of this Table. Location of the table data.
- `description` (string) — Gets the description of this Table. Table description.
- `tableType` (string) — Gets the table_type of this Table. Type of table. Managed, external or mount table. Allowed values for this property are: "MANAGED", "EXTERNAL", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `managedTableDefinition` (oci.aidataplatform_dp.models.ManagedTableDefinition) — Gets the managed_table_definition of this Table.
- `externalTableDefinition` (oci.aidataplatform_dp.models.ExternalTableDefinition) — Gets the external_table_definition of this Table.
- `tableFields` (list[oci.aidataplatform_dp.models.TableFieldDetails]) — Gets the table_fields of this Table. Columns for table.
- `partitionKeys` (list[oci.aidataplatform_dp.models.TableFieldDetails]) — Gets the partition_keys of this Table. Columns to be used in partition for table.
- `tableProperties` (list[oci.aidataplatform_dp.models.TableProperty]) — Gets the table_properties of this Table. Table properties.
- `timeCreated` (datetime) — Gets the time_created of this Table. The date and time the table was created.
- `timeUpdated` (datetime) — Gets the time_updated of this Table. The date and time the table was updated.
- `createdBy` (string) — Gets the created_by of this Table. The OCID of the user/principal who created the table.
- `updatedBy` (string) — Gets the updated_by of this Table. The ID of the user who last updated the schema.
- `lifecycleState` (string) — Gets the lifecycle_state of this Table. The state of the table. Allowed values for this property are: "ACTIVE", "CREATING", "DELETING", "UPDATING", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleStateDetails` (string) — Gets the lifecycle_state_details of this Table. A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-getview"></a>`getView`
Returns information about a view.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `viewKey` (`string`) — The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>.

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getViewResponse`

**Response Fields:**
- `key` (string) — Gets the key of this View. The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>
- `displayName` (string) — Gets the display_name of this View. A user-friendly name. Has to be unique within the scope of the schema and is changeable.
- `catalogKey` (string) — Gets the catalog_key of this View. The name of the catalog to which this view belongs.
- `schemaKey` (string) — Gets the schema_key of this View. The name of the Schema to which this view belongs.
- `viewText` (string) — Gets the view_text of this View. The Query used to create the view.
- `description` (string) — Gets the description of this View. The description of the view.
- `viewFields` (list[oci.aidataplatform_dp.models.ViewFieldDetails]) — Gets the view_fields of this View. Columns for view.
- `timeCreated` (datetime) — Gets the time_created of this View. The date and time the View was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `timeUpdated` (datetime) — Gets the time_updated of this View. The date and time the View was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `createdBy` (string) — Gets the created_by of this View. The ID of the user/principal who created the view.
- `updatedBy` (string) — Gets the updated_by of this View. The ID of the user who last updated the view.
- `viewProperties` (list[oci.aidataplatform_dp.models.ViewProperty]) — Gets the view_properties of this View. View Properties.
- `lifecycleState` (string) — Gets the lifecycle_state of this View. The state of the view. Allowed values for this property are: "ACTIVE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleStateDetails` (string) — Gets the lifecycle_state_details of this View. A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-listschemapermissions"></a>`listSchemaPermissions`
Returns a list of permissions for a given schema.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `schemaKey` (`string`) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.

**Optional Parameters:**
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listSchemaPermissionsResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.SchemaPermissionSummary]) — Gets the items of this SchemaPermissionCollection. List of schema permissions.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-listschemas"></a>`listSchemas`
Returns a list of schemas.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `catalogKey` (`string`) — The key of the catalog.

**Optional Parameters:**
- `displayName` (`string`) — A filter to return only resources that match the given display name exactly.
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listSchemasResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.SchemaSummary]) — Gets the items of this SchemaCollection. List of schemas.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-listtablepermissions"></a>`listTablePermissions`
Returns a list of permissions for a given table.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `tableKey` (`string`) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.

**Optional Parameters:**
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listTablePermissionsResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.TablePermissionSummary]) — Gets the items of this TablePermissionCollection. List of table permissions.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-listtables"></a>`listTables`
Returns a list of tables in a schema.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `catalogKey` (`string`) — The key of the catalog.
- `schemaKey` (`string`) — The fully qualified name of the Data Lake Schema in the format <catalog_name>.<schema_name>

**Optional Parameters:**
- `displayName` (`string`) — A filter to return only resources that match the given display name exactly.
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listTablesResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.TableSummary]) — Gets the items of this TableCollection. List of tables.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-listviewpermissions"></a>`listViewPermissions`
Returns a list of view permissions.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `viewKey` (`string`) — The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>.

**Optional Parameters:**
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listViewPermissionsResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.ViewPermissionSummary]) — Gets the items of this ViewPermissionCollection. List of view permissions.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-listviews"></a>`listViews`
Returns a list of views in a schema.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `catalogKey` (`string`) — The key of the catalog.
- `schemaKey` (`string`) — The fully qualified name of the Data Lake Schema in the format <catalog_name>.<schema_name>

**Optional Parameters:**
- `displayName` (`string`) — A filter to return only resources that match the given display name exactly.
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listViewsResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.ViewSummary]) — Gets the items of this ViewCollection. List of views.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-manageschemapermission"></a>`manageSchemaPermission`
Updates the permissions for a given schema.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `schemaKey` (`string`) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.
- `manageSchemaPermissionDetails` (`oci.aidataplatform_dp.models.ManageSchemaPermissionDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageSchemaPermissionResponse`

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-managetablepermission"></a>`manageTablePermission`
Updates the permissions for a given table.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `tableKey` (`string`) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.
- `manageTablePermissionDetails` (`oci.aidataplatform_dp.models.ManageTablePermissionDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageTablePermissionResponse`

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-manageviewpermission"></a>`manageViewPermission`
Updates permissions on a view.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `viewKey` (`string`) — The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>.
- `manageViewPermissionDetails` (`oci.aidataplatform_dp.models.ManageViewPermissionDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageViewPermissionResponse`

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-performinferschema"></a>`performInferSchema`
Returns details of a table schema from the specified location.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `schemaKey` (`string`) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.
- `performInferSchemaDetails` (`oci.aidataplatform_dp.models.PerformInferSchemaDetails`) — Details of the location from which the table schema can be inferred.

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `performInferSchemaResponse`

**Response Fields:**
- `inferSchemaColumn` (list[oci.aidataplatform_dp.models.InferSchemaColumn]) — Gets the infer_schema_column of this InferSchema. Column information obtained by inferring schema.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-performinferschemawithpreview"></a>`performInferSchemaWithPreview`
Returns table schema and data from the specified location.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `schemaKey` (`string`) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.
- `performInferSchemaDetails` (`oci.aidataplatform_dp.models.PerformInferSchemaDetails`) — Details of the location from which the table schema and data can be inferred.

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `performInferSchemaWithPreviewResponse`

**Response Fields:**
- `schema` (list[oci.aidataplatform_dp.models.InferSchemaColumn]) — Gets the schema of this InferSchemaWithPreview. Column information obtained by inferring schema.
- `data` (list[dict(str, str)]) — Gets the data of this InferSchemaWithPreview. Sample preview data.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-refreshschema"></a>`refreshSchema`
Refreshes schema through the crawler.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `schemaKey` (`string`) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `refreshSchemaResponse`

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-refreshtable"></a>`refreshTable`
Refreshes a table through the crawler.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `tableKey` (`string`) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `refreshTableResponse`

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-retrievepar"></a>`retrievePar`
Retrieves PAR for the entities created.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `tableKey` (`string`) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `retrieveParResponse`

**Response Fields:**
- `parUrl` (string) — Gets the par_url of this ParDetails. PAR URL of the table.
- `tableKey` (string) — Gets the table_key of this ParDetails. The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.
- `timeExpires` (datetime) — Gets the time_expires of this ParDetails. The date and time the table was updated.
- `parAccessType` (string) — Gets the par_access_type of this ParDetails. The operation that can be performed on this resource. Allowed values for this property are: "OBJECT_READ", "OBJECT_WRITE", "OBJECT_READ_WRITE", "ANY_OBJECT_WRITE", "ANY_OBJECT_READ", "ANY_OBJECT_READ_WRITE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-updateschema"></a>`updateSchema`
Updates a schema.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `schemaKey` (`string`) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.
- `updateSchemaDetails` (`oci.aidataplatform_dp.models.UpdateSchemaDetails`) — The information to be updated.

**Optional Parameters:**
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateSchemaResponse`

**Response Fields:**
- `entityType` (string) — Gets the entity_type of this Schema. An enum to decide the type of the derived model. Allowed values for this property are: "ADW", "ALH", "STANDARD", "KAFKA_TOPIC", "ATP", "ORACLE", "EXADATA", "MYSQL", "AZURE_SQLSERVER", "SNOWFLAKE", "GOOGLE_BIGQUERY", "ORACLE_ANALYTICS", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `key` (string) — Gets the key of this Schema. The fully qualified name of the schema in the format <catalog_name>.<schema_name>.
- `displayName` (string) — Gets the display_name of this Schema. Schema name.
- `description` (string) — Gets the description of this Schema. Schema description.
- `timeCreated` (datetime) — Gets the time_created of this Schema. The date and time the schema was created.
- `timeUpdated` (datetime) — Gets the time_updated of this Schema. The date and time the schema was updated.
- `createdBy` (string) — Gets the created_by of this Schema. ID of the user who created the schema.
- `updatedBy` (string) — Gets the updated_by of this Schema. ID of the user who last updated the schema.
- `properties` (dict(str, str)) — Gets the properties of this Schema. Key-value pair representing a defined tag key and value.
- `catalogName` (string) — Gets the catalog_name of this Schema. The name of the catalog to which this schema belongs.
- `lifecycleState` (string) — Gets the lifecycle_state of this Schema. The current state of the schema. Allowed values for this property are: "ACTIVE", "CREATING", "DELETING", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleStateDetails` (string) — Gets the lifecycle_state_details of this Schema. A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.
- `details` (dict(str, str)) — Gets the details of this Schema. Deprecated field. Map of key-value pairs. This object will be only provided when the parent catalog is external.

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-updatetable"></a>`updateTable`
Updates a table with provided details.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `tableKey` (`string`) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.
- `updateTableDetails` (`oci.aidataplatform_dp.models.UpdateTableDetails`) — The information to be updated.

**Optional Parameters:**
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateTableResponse`

**Return:** [Back to Schema (`SchemaClient`)](#schemaclient-client) • [Top](#top)


### <a id="schemaclient-updateview"></a>`updateView`
Updates a view with given information.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `viewKey` (`string`) — The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>.
- `updateViewDetails` (`oci.aidataplatform_dp.models.UpdateViewDetails`) — The update mode and information to be updated.

**Optional Parameters:**
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateViewResponse`

**Response Fields:**
- `key` (string) — Gets the key of this View. The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>
- `displayName` (string) — Gets the display_name of this View. A user-friendly name. Has to be unique within the scope of the schema and is changeable.
- `catalogKey` (string) — Gets the catalog_key of this View. The name of the catalog to which this view belongs.
- `schemaKey` (string) — Gets the schema_key of this View. The name of the Schema to which this view belongs.
- `viewText` (string) — Gets the view_text of this View. The Query used to create the view.
- `description` (string) — Gets the description of this View. The description of the view.
- `viewFields` (list[oci.aidataplatform_dp.models.ViewFieldDetails]) — Gets the view_fields of this View. Columns for view.
- `timeCreated` (datetime) — Gets the time_created of this View. The date and time the View was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `timeUpdated` (datetime) — Gets the time_updated of this View. The date and time the View was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `createdBy` (string) — Gets the created_by of this View. The ID of the user/principal who created the view.
- `updatedBy` (string) — Gets the updated_by of this View. The ID of the user who last updated the view.
- `viewProperties` (list[oci.aidataplatform_dp.models.ViewProperty]) — Gets the view_properties of this View. View Properties.
- `lifecycleState` (string) — Gets the lifecycle_state of this View. The state of the view. Allowed values for this property are: "ACTIVE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleStateDetails` (string) — Gets the lifecycle_state_details of this View. A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.

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
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `createUserSettingDetails` (`oci.aidataplatform_dp.models.CreateUserSettingDetails`) — Details for the new setting.

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createUserSettingResponse`

**Response Fields:**
- `key` (string) — Gets the key of this UserSetting. The unique identifier for the setting.
- `name` (string) — Gets the name of this UserSetting. A user-friendly name for the setting.
- `isDefault` (boolean) — Gets the is_default of this UserSetting. Indicates whether this setting is the default.
- `data` (oci.aidataplatform_dp.models.SettingData) — Gets the data of this UserSetting.

**Return:** [Back to User Setting (`UserSettingClient`)](#usersettingclient-client) • [Top](#top)


### <a id="usersettingclient-deleteusersetting"></a>`deleteUserSetting`
(Preview) Deletes a user setting and its credentials from this AI Data Platform instance, freeing the default slot for that type.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `settingKey` (`string`) — The UUID of the user setting.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteUserSettingResponse`

**Return:** [Back to User Setting (`UserSettingClient`)](#usersettingclient-client) • [Top](#top)


### <a id="usersettingclient-getusersetting"></a>`getUserSetting`
(Preview) Returns the full definition of user settings identified by its key, including type-specific payload and default flag.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `settingKey` (`string`) — The UUID of the user setting.

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getUserSettingResponse`

**Response Fields:**
- `key` (string) — Gets the key of this UserSetting. The unique identifier for the setting.
- `name` (string) — Gets the name of this UserSetting. A user-friendly name for the setting.
- `isDefault` (boolean) — Gets the is_default of this UserSetting. Indicates whether this setting is the default.
- `data` (oci.aidataplatform_dp.models.SettingData) — Gets the data of this UserSetting.

**Return:** [Back to User Setting (`UserSettingClient`)](#usersettingclient-client) • [Top](#top)


### <a id="usersettingclient-listusersettings"></a>`listUserSettings`
(Preview) Returns a list of all user-specific configurations, with filters for setting type, default flag, and pagination when needed.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

**Optional Parameters:**
- `settingType` (`string`) — A filter to return only those settings whose value matches the given data type. Allowed values are: "IAM_USER_CREDENTIAL", "GIT_ACCOUNT"
- `isDefault` (`boolean`) — A filter to return only resources that are default.
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `displayName` (`string`) — A filter to return only resources that match the given display name exactly.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listUserSettingsResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.UserSettingSummary]) — Gets the items of this UserSettingCollection. List of settings.

**Return:** [Back to User Setting (`UserSettingClient`)](#usersettingclient-client) • [Top](#top)


### <a id="usersettingclient-updateusersetting"></a>`updateUserSetting`
(Preview) Updates the metadata or payload of an existing user setting, letting you rotate credentials or change defaults.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `settingKey` (`string`) — The UUID of the user setting.
- `updateUserSettingDetails` (`oci.aidataplatform_dp.models.UpdateUserSettingDetails`) — Details for the user setting to be updated.

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateUserSettingResponse`

**Response Fields:**
- `key` (string) — Gets the key of this UserSetting. The unique identifier for the setting.
- `name` (string) — Gets the name of this UserSetting. A user-friendly name for the setting.
- `isDefault` (boolean) — Gets the is_default of this UserSetting. Indicates whether this setting is the default.
- `data` (oci.aidataplatform_dp.models.SettingData) — Gets the data of this UserSetting.

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
- [`uploadFile`](#volumeclient-uploadfile)
- [`uploadFileWithPar`](#volumeclient-uploadfilewithpar)

### <a id="volumeclient-createvolume"></a>`createVolume`
Creates a volume.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `createVolumeDetails` (`oci.aidataplatform_dp.models.CreateVolumeDetails`) — Details for the new volume.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createVolumeResponse`

**Response Fields:**
- `key` (string) — Gets the key of this Volume. The key of the volume.
- `displayName` (string) — Gets the display_name of this Volume. A user-friendly name. Has to be unique within the schema and is changeable.
- `description` (string) — Gets the description of this Volume. Short description of the volume
- `timeCreated` (datetime) — Gets the time_created of this Volume. The date and time the Data Lake Volume was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `timeUpdated` (datetime) — Gets the time_updated of this Volume. The date and time the Data Lake Volume was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `createdBy` (string) — Gets the created_by of this Volume. The ID of the user that created the volume.
- `updatedBy` (string) — Gets the updated_by of this Volume. The ID of the user that last updated the volume
- `catalogName` (string) — Gets the catalog_name of this Volume. The name of the catalog to which this volume belongs.
- `schemaName` (string) — Gets the schema_name of this Volume. The name of the schema to which this volume belongs.
- `fullName` (string) — Gets the full_name of this Volume. The fully qualified name of this volume.
- `volumeType` (string) — Gets the volume_type of this Volume. The type of volume. Allowed values for this property are: "MANAGED", "EXTERNAL", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `storageLocation` (string) — Gets the storage_location of this Volume. The storage location of the external volume. Only applicable for external volumes.
- `lifecycleState` (string) — Gets the lifecycle_state of this Volume. The lifecycle state of the volume. The volume is ready for use in ACTIVE state Allowed values for this property are: "CREATING", "UPDATING", "DELETING", "ACTIVE", "DELETED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleStateDetails` (string) — Gets the lifecycle_state_details of this Volume. Additional details associated with the lifecycle state.
- `systemTags` (dict(str, dict(str, object))) — Gets the system_tags of this Volume. System tags for this resource. Each key is predefined and scoped to a namespace. Example: `{"orcl-cloud": {"free-tier-retained": "true"}}`

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-deletedir"></a>`deleteDir`
Deletes a directory in a volume.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `volumeKey` (`string`) — The key of the volume.
- `path` (`string`) — The absolute path of the file or folder

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteDirResponse`

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-deletefile"></a>`deleteFile`
Deletes a file or folder in a volume.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `volumeKey` (`string`) — The key of the volume.
- `path` (`string`) — The absolute path of the file or folder

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteFileResponse`

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-deletevolume"></a>`deleteVolume`
Deletes a volume.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `volumeKey` (`string`) — The key of the volume.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteVolumeResponse`

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-downloadfile"></a>`downloadFile`
Downloads a file from a volume.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `volumeKey` (`string`) — The key of the volume.
- `path` (`string`) — The absolute path of the file or folder

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `downloadFileResponse`

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-downloadfilewithpar"></a>`downloadFileWithPar`
provide the par info for downloading the file for given path.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `volumeKey` (`string`) — The key of the volume.
- `path` (`string`) — The absolute path of the file or folder

**Optional Parameters:**
- `shouldGenerateNewPar` (`boolean`) — Flag to toggle to generate short living par
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `downloadFileWithParResponse`

**Response Fields:**
- `parUrl` (string) — Gets the par_url of this DownloadFileWithParResult. String representing the PAR URL.
- `eTag` (string) — Gets the e_tag of this DownloadFileWithParResult. Etag after creating or closing a file.
- `locationUri` (string) — Gets the location_uri of this DownloadFileWithParResult. The object storage URI which has bucket and namespace information.
- `size` (number) — Gets the size of this DownloadFileWithParResult. File size in bytes.
- `createdBy` (string) — Gets the created_by of this DownloadFileWithParResult. The user who created the file.
- `updatedBy` (string) — Gets the updated_by of this DownloadFileWithParResult. The user who last updated the file.
- `createdTime` (string) — Gets the created_time of this DownloadFileWithParResult. The time at which the file was created.
- `updatedTime` (string) — Gets the updated_time of this DownloadFileWithParResult. The last modified time of the file.
- `description` (string) — Gets the description of this DownloadFileWithParResult. The file description.
- `systemTags` (dict(str, dict(str, object))) — Gets the system_tags of this DownloadFileWithParResult. System tags for this resource. Each key is predefined and scoped to a namespace. Example: `{"orcl-cloud": {"free-tier-retained": "true"}}`

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-getvolume"></a>`getVolume`
Returns detailed information about a volume.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `volumeKey` (`string`) — The key of the volume.

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getVolumeResponse`

**Response Fields:**
- `key` (string) — Gets the key of this Volume. The key of the volume.
- `displayName` (string) — Gets the display_name of this Volume. A user-friendly name. Has to be unique within the schema and is changeable.
- `description` (string) — Gets the description of this Volume. Short description of the volume
- `timeCreated` (datetime) — Gets the time_created of this Volume. The date and time the Data Lake Volume was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `timeUpdated` (datetime) — Gets the time_updated of this Volume. The date and time the Data Lake Volume was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `createdBy` (string) — Gets the created_by of this Volume. The ID of the user that created the volume.
- `updatedBy` (string) — Gets the updated_by of this Volume. The ID of the user that last updated the volume
- `catalogName` (string) — Gets the catalog_name of this Volume. The name of the catalog to which this volume belongs.
- `schemaName` (string) — Gets the schema_name of this Volume. The name of the schema to which this volume belongs.
- `fullName` (string) — Gets the full_name of this Volume. The fully qualified name of this volume.
- `volumeType` (string) — Gets the volume_type of this Volume. The type of volume. Allowed values for this property are: "MANAGED", "EXTERNAL", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `storageLocation` (string) — Gets the storage_location of this Volume. The storage location of the external volume. Only applicable for external volumes.
- `lifecycleState` (string) — Gets the lifecycle_state of this Volume. The lifecycle state of the volume. The volume is ready for use in ACTIVE state Allowed values for this property are: "CREATING", "UPDATING", "DELETING", "ACTIVE", "DELETED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleStateDetails` (string) — Gets the lifecycle_state_details of this Volume. Additional details associated with the lifecycle state.
- `systemTags` (dict(str, dict(str, object))) — Gets the system_tags of this Volume. System tags for this resource. Each key is predefined and scoped to a namespace. Example: `{"orcl-cloud": {"free-tier-retained": "true"}}`

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-listfiles"></a>`listFiles`
Returns a list of files in a volume.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `volumeKey` (`string`) — The key of the volume.
- `path` (`string`) — The absolute path of the file or folder

**Optional Parameters:**
- `isRecursive` (`boolean`) — A boolean which decides if nested files should be in the list files in volume response.
- `displayName` (`string`) — A filter to return only resources that match the given display name exactly.
- `metadataKeys` (`string`) — Comma separated keys to have in list response.
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listFilesResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.VolumeFileSummary]) — Gets the items of this VolumeFileCollection. List of volume files.

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-listvolumepermissions"></a>`listVolumePermissions`
Returns a list of volume permissions.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `volumeKey` (`string`) — The key of the volume.

**Optional Parameters:**
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listVolumePermissionsResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.VolumePermissionSummary]) — Gets the items of this VolumePermissionCollection. List of volume permissions.

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-listvolumes"></a>`listVolumes`
Returns a list of volumes.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `catalogKey` (`string`) — The key of the catalog.
- `schemaKey` (`string`) — The fully qualified name of the Data Lake Schema in the format <catalog_name>.<schema_name>

**Optional Parameters:**
- `displayName` (`string`) — A filter to return only resources that match the given display name exactly.
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listVolumesResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.VolumeSummary]) — Gets the items of this VolumeCollection. List of volumes.

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-makedir"></a>`makeDir`
Creates a directory in a volume.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `volumeKey` (`string`) — The key of the volume.
- `path` (`string`) — The absolute path of the file or folder

**Optional Parameters:**
- `description` (`string`) — The description of the folder.
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `makeDirResponse`

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-managevolumepermission"></a>`manageVolumePermission`
Updates the permissions on a volume.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `volumeKey` (`string`) — The key of the volume.
- `manageVolumePermissionDetails` (`oci.aidataplatform_dp.models.ManageVolumePermissionDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageVolumePermissionResponse`

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-updatedir"></a>`updateDir`
Updates a directory in volume with the provided information.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `volumeKey` (`string`) — The key of the volume.
- `updateDirDetails` (`oci.aidataplatform_dp.models.UpdateDirDetails`) — The information to be updated.
- `path` (`string`) — The absolute path of the file or folder

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateDirResponse`

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-updatevolume"></a>`updateVolume`
Updates a volume with the provided information.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `volumeKey` (`string`) — The key of the volume.
- `updateVolumeDetails` (`oci.aidataplatform_dp.models.UpdateVolumeDetails`) — The information to be updated.

**Optional Parameters:**
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateVolumeResponse`

**Response Fields:**
- `key` (string) — Gets the key of this Volume. The key of the volume.
- `displayName` (string) — Gets the display_name of this Volume. A user-friendly name. Has to be unique within the schema and is changeable.
- `description` (string) — Gets the description of this Volume. Short description of the volume
- `timeCreated` (datetime) — Gets the time_created of this Volume. The date and time the Data Lake Volume was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `timeUpdated` (datetime) — Gets the time_updated of this Volume. The date and time the Data Lake Volume was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `createdBy` (string) — Gets the created_by of this Volume. The ID of the user that created the volume.
- `updatedBy` (string) — Gets the updated_by of this Volume. The ID of the user that last updated the volume
- `catalogName` (string) — Gets the catalog_name of this Volume. The name of the catalog to which this volume belongs.
- `schemaName` (string) — Gets the schema_name of this Volume. The name of the schema to which this volume belongs.
- `fullName` (string) — Gets the full_name of this Volume. The fully qualified name of this volume.
- `volumeType` (string) — Gets the volume_type of this Volume. The type of volume. Allowed values for this property are: "MANAGED", "EXTERNAL", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `storageLocation` (string) — Gets the storage_location of this Volume. The storage location of the external volume. Only applicable for external volumes.
- `lifecycleState` (string) — Gets the lifecycle_state of this Volume. The lifecycle state of the volume. The volume is ready for use in ACTIVE state Allowed values for this property are: "CREATING", "UPDATING", "DELETING", "ACTIVE", "DELETED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleStateDetails` (string) — Gets the lifecycle_state_details of this Volume. Additional details associated with the lifecycle state.
- `systemTags` (dict(str, dict(str, object))) — Gets the system_tags of this Volume. System tags for this resource. Each key is predefined and scoped to a namespace. Example: `{"orcl-cloud": {"free-tier-retained": "true"}}`

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-uploadfile"></a>`uploadFile`
Uploads a file to volume. If the file already exists, it is updated.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `volumeKey` (`string`) — The key of the volume.
- `uploadFileDetails` (`stream`) — Contents of the file to upload.
- `path` (`string`) — The absolute path of the file or folder

**Optional Parameters:**
- `isOverwrite` (`boolean`) — A boolean which decides if overwrite is allowed
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `isUploadFileBase64Encoded` (`boolean`) — A flag to identify if the upload file is base64 encoded
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `uploadFileResponse`

**Return:** [Back to Volume (`VolumeClient`)](#volumeclient-client) • [Top](#top)


### <a id="volumeclient-uploadfilewithpar"></a>`uploadFileWithPar`
Uploads a volume file by generating PAR. If file exists, then it will be updated.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `volumeKey` (`string`) — The key of the volume.
- `uploadFileWithParDetails` (`oci.aidataplatform_dp.models.UploadFileWithParDetails`) — Contents of the file to upload.
- `path` (`string`) — The absolute path of the file or folder

**Optional Parameters:**
- `isOverwrite` (`boolean`) — A boolean which decides if overwrite is allowed
- `shouldGenerateNewPar` (`boolean`) — Flag to toggle to generate short living par
- `shouldCreateRecursively` (`boolean`) — A boolean which decides if parent directories should be created recursively during upload.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `uploadFileWithParResponse`

**Response Fields:**
- `parUrl` (string) — Gets the par_url of this UploadFileWithParResult. String representing the PAR URL.
- `eTag` (string) — Gets the e_tag of this UploadFileWithParResult. Etag after creating or closing a file.
- `locationUri` (string) — Gets the location_uri of this UploadFileWithParResult. The object storage URI which has bucket and namespace information.
- `size` (number) — Gets the size of this UploadFileWithParResult. File size in bytes.
- `createdBy` (string) — Gets the created_by of this UploadFileWithParResult. The user who created the file.
- `updatedBy` (string) — Gets the updated_by of this UploadFileWithParResult. The user who last updated the file.
- `createdTime` (string) — Gets the created_time of this UploadFileWithParResult. The time at which the file was created.
- `updatedTime` (string) — Gets the updated_time of this UploadFileWithParResult. The last modified time of the file.
- `description` (string) — Gets the description of this UploadFileWithParResult. The file description.
- `systemTags` (dict(str, dict(str, object))) — Gets the system_tags of this UploadFileWithParResult. System tags for this resource. Each key is predefined and scoped to a namespace. Example: `{"orcl-cloud": {"free-tier-retained": "true"}}`

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
- [`listTaskRuns`](#workflowclient-listtaskruns)
- [`manageJobPermission`](#workflowclient-managejobpermission)
- [`repairJobRun`](#workflowclient-repairjobrun)
- [`updateJob`](#workflowclient-updatejob)

### <a id="workflowclient-canceljobrun"></a>`cancelJobRun`
Cancels a job run.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `jobRunKey` (`string`) — Job run key.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `cancelJobRunResponse`

**Response Fields:**
- `key` (string) — Gets the key of this JobRun. The OCID of the job.
- `name` (string) — Gets the name of this JobRun. A user-friendly name. Does not have to be unique, and is changeable.
- `jobKey` (string) — Gets the job_key of this JobRun. The OCID of the job.
- `jobName` (string) — Gets the job_name of this JobRun. A user-friendly name. Does not have to be unique, and is changeable.
- `parentJobRunKey` (string) — Gets the parent_job_run_key of this JobRun. The OCID of the job.
- `rootJobRunKey` (string) — Gets the root_job_run_key of this JobRun. The OCID of the job.
- `parentTaskRunKey` (string) — Gets the parent_task_run_key of this JobRun. The OCID of the task run.
- `tasks` (list[oci.aidataplatform_dp.models.Task]) — Gets the tasks of this JobRun. List of tasks in a job.
- `createdBy` (string) — Gets the created_by of this JobRun. The OCID of the IAM user.
- `createdByName` (string) — Gets the created_by_name of this JobRun. Name of the user who created this record
- `maxConcurrentRuns` (number) — Gets the max_concurrent_runs of this JobRun. Indicates the number of executions for the same job that can be run concurrently. The maximum value cannot exceed 1000.
- `gitConfig` (oci.aidataplatform_dp.models.GitConfig) — Gets the git_config of this JobRun.
- `queue` (oci.aidataplatform_dp.models.Queue) — Gets the queue of this JobRun.
- `originalAttemptRunId` (string) — Gets the original_attempt_run_id of this JobRun. The OCID of the job.
- `state` (oci.aidataplatform_dp.models.State) — Gets the state of this JobRun.
- `schedule` (oci.aidataplatform_dp.models.Schedule) — Gets the schedule of this JobRun.
- `clusterSpec` (oci.aidataplatform_dp.models.ClusterSpec) — Gets the cluster_spec of this JobRun.
- `clusterInstance` (oci.aidataplatform_dp.models.ClusterInstance) — Gets the cluster_instance of this JobRun.
- `parameters` (list[oci.aidataplatform_dp.models.Parameter]) — Gets the parameters of this JobRun. An optional list of parameters.
- `unifiedJobAndJobRunParameters` (list[oci.aidataplatform_dp.models.Parameter]) — Gets the unified_job_and_job_run_parameters of this JobRun. Unified List of job and job run parameters after resolving dynamic value references and parameter resolution as per precedence.
- `repairHistory` (list[oci.aidataplatform_dp.models.RepairHistory]) — Gets the repair_history of this JobRun. Array of repaired runs.
- `systemParameters` (dict(str, str)) — Gets the system_parameters of this JobRun. Map of system parameters with their values for this job run.
- `startTime` (number) — Gets the start_time of this JobRun. The time at which the job execution started in epoch milliseconds.
- `endTime` (number) — Gets the end_time of this JobRun. The time at which the job execution started in epoch milliseconds.
- `setupDuration` (number) — Gets the setup_duration of this JobRun. The time (in milliseconds) taken to setup the cluster.
- `executionDuration` (number) — Gets the execution_duration of this JobRun. The time (in milliseconds) taken to complete the job execution.
- `cleanupDuration` (number) — Gets the cleanup_duration of this JobRun. The time (in milliseconds) taken to terminate the cluster and to clean up any associated artifacts.
- `runDuration` (number) — Gets the run_duration of this JobRun. The time (in milliseconds) taken to complete the job execution and all its repairs to finish.
- `timeCreated` (datetime) — Gets the time_created of this JobRun. The time at which the job execution started.
- `timeUpdated` (datetime) — Gets the time_updated of this JobRun. The time at which the job execution was updated.
- `launched` (string) — Gets the launched of this JobRun. Identify job run launched by schedule or manually. Allowed values for this property are: "SCHEDULED", "MANUAL", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `version` (number) — Gets the version of this JobRun. Current version of job run object in repository.
- `taskToTaskRunMap` (dict(str, str)) — Gets the task_to_task_run_map of this JobRun. Task to TaskRun map for given job run.
- `taskRunSummaryMap` (dict(str, object)) — Gets the task_run_summary_map of this JobRun. TaskRun to TaskRunSummary map for given job run.
- `timeoutSeconds` (number) — Gets the timeout_seconds of this JobRun. An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value.
- `repairedTasks` (list[str]) — Gets the repaired_tasks of this JobRun. A list of repaired tasks.
- `repairMode` (string) — Gets the repair_mode of this JobRun. Repair mode to be used for this repair scope. Allowed values for this property are: "RESUME", "RERUN", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleStates` (list[oci.aidataplatform_dp.models.LifecycleState]) — Gets the lifecycle_states of this JobRun. The collection of lifecycle states.
- `runAs` (string) — Gets the run_as of this JobRun. This points to the user or service account executing the job.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-canceljobruns"></a>`cancelJobRuns`
Cancels all job runs for a given job.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `jobKey` (`string`) — Job key.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `cancelJobRunsResponse`

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-createjob"></a>`createJob`
Creates a job.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `createJobDetails` (`oci.aidataplatform_dp.models.CreateJobDetails`) — Details for the new job.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createJobResponse`

**Response Fields:**
- `key` (string) — Gets the key of this Job. The OCID of the job.
- `createdBy` (string) — Gets the created_by of this Job. The OCID of the IAM user.
- `createdByName` (string) — Gets the created_by_name of this Job. Name of the user who created this record
- `updatedBy` (string) — Gets the updated_by of this Job. The username of the latest updater. The OCID of the IAM user.
- `updatedByName` (string) — Gets the updated_by_name of this Job. Name of the user who updated this record.
- `runAs` (string) — Gets the run_as of this Job. This points to the user or service account executing the job.
- `name` (string) — Gets the name of this Job. A user-friendly name. Does not have to be unique, and is changeable.
- `description` (string) — Gets the description of this Job. A description for the job.
- `schedule` (oci.aidataplatform_dp.models.Schedule) — Gets the schedule of this Job.
- `continuous` (oci.aidataplatform_dp.models.Continuous) — Gets the continuous of this Job.
- `maxConcurrentRuns` (number) — Gets the max_concurrent_runs of this Job. Indicates the number of executions for the same job that can be run concurrently. The maximum value cannot exceed 1000.
- `gitConfig` (oci.aidataplatform_dp.models.GitConfig) — Gets the git_config of this Job.
- `queue` (oci.aidataplatform_dp.models.Queue) — Gets the queue of this Job.
- `path` (string) — Gets the path of this Job. The path to store the job definition in.
- `jobClusters` (list[oci.aidataplatform_dp.models.JobCluster]) — Gets the job_clusters of this Job. List of job cluster configurations.
- `tasks` (list[oci.aidataplatform_dp.models.Task]) — Gets the tasks of this Job. List of tasks in a job.
- `timeCreated` (datetime) — Gets the time_created of this Job. The date and time the DataLake was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2025-05-25T21:10:29.600Z`
- `timeUpdated` (datetime) — Gets the time_updated of this Job. The date and time the DataLake was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2025-05-25T21:10:29.600Z`
- `parameters` (list[oci.aidataplatform_dp.models.Parameter]) — Gets the parameters of this Job. An optional list of parameters.
- `timeoutSeconds` (number) — Gets the timeout_seconds of this Job. An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-createjobrun"></a>`createJobRun`
Creates a job run.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `createJobRunDetails` (`oci.aidataplatform_dp.models.CreateJobRunDetails`) — Details for the new job run.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createJobRunResponse`

**Response Fields:**
- `key` (string) — Gets the key of this JobRun. The OCID of the job.
- `name` (string) — Gets the name of this JobRun. A user-friendly name. Does not have to be unique, and is changeable.
- `jobKey` (string) — Gets the job_key of this JobRun. The OCID of the job.
- `jobName` (string) — Gets the job_name of this JobRun. A user-friendly name. Does not have to be unique, and is changeable.
- `parentJobRunKey` (string) — Gets the parent_job_run_key of this JobRun. The OCID of the job.
- `rootJobRunKey` (string) — Gets the root_job_run_key of this JobRun. The OCID of the job.
- `parentTaskRunKey` (string) — Gets the parent_task_run_key of this JobRun. The OCID of the task run.
- `tasks` (list[oci.aidataplatform_dp.models.Task]) — Gets the tasks of this JobRun. List of tasks in a job.
- `createdBy` (string) — Gets the created_by of this JobRun. The OCID of the IAM user.
- `createdByName` (string) — Gets the created_by_name of this JobRun. Name of the user who created this record
- `maxConcurrentRuns` (number) — Gets the max_concurrent_runs of this JobRun. Indicates the number of executions for the same job that can be run concurrently. The maximum value cannot exceed 1000.
- `gitConfig` (oci.aidataplatform_dp.models.GitConfig) — Gets the git_config of this JobRun.
- `queue` (oci.aidataplatform_dp.models.Queue) — Gets the queue of this JobRun.
- `originalAttemptRunId` (string) — Gets the original_attempt_run_id of this JobRun. The OCID of the job.
- `state` (oci.aidataplatform_dp.models.State) — Gets the state of this JobRun.
- `schedule` (oci.aidataplatform_dp.models.Schedule) — Gets the schedule of this JobRun.
- `clusterSpec` (oci.aidataplatform_dp.models.ClusterSpec) — Gets the cluster_spec of this JobRun.
- `clusterInstance` (oci.aidataplatform_dp.models.ClusterInstance) — Gets the cluster_instance of this JobRun.
- `parameters` (list[oci.aidataplatform_dp.models.Parameter]) — Gets the parameters of this JobRun. An optional list of parameters.
- `unifiedJobAndJobRunParameters` (list[oci.aidataplatform_dp.models.Parameter]) — Gets the unified_job_and_job_run_parameters of this JobRun. Unified List of job and job run parameters after resolving dynamic value references and parameter resolution as per precedence.
- `repairHistory` (list[oci.aidataplatform_dp.models.RepairHistory]) — Gets the repair_history of this JobRun. Array of repaired runs.
- `systemParameters` (dict(str, str)) — Gets the system_parameters of this JobRun. Map of system parameters with their values for this job run.
- `startTime` (number) — Gets the start_time of this JobRun. The time at which the job execution started in epoch milliseconds.
- `endTime` (number) — Gets the end_time of this JobRun. The time at which the job execution started in epoch milliseconds.
- `setupDuration` (number) — Gets the setup_duration of this JobRun. The time (in milliseconds) taken to setup the cluster.
- `executionDuration` (number) — Gets the execution_duration of this JobRun. The time (in milliseconds) taken to complete the job execution.
- `cleanupDuration` (number) — Gets the cleanup_duration of this JobRun. The time (in milliseconds) taken to terminate the cluster and to clean up any associated artifacts.
- `runDuration` (number) — Gets the run_duration of this JobRun. The time (in milliseconds) taken to complete the job execution and all its repairs to finish.
- `timeCreated` (datetime) — Gets the time_created of this JobRun. The time at which the job execution started.
- `timeUpdated` (datetime) — Gets the time_updated of this JobRun. The time at which the job execution was updated.
- `launched` (string) — Gets the launched of this JobRun. Identify job run launched by schedule or manually. Allowed values for this property are: "SCHEDULED", "MANUAL", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `version` (number) — Gets the version of this JobRun. Current version of job run object in repository.
- `taskToTaskRunMap` (dict(str, str)) — Gets the task_to_task_run_map of this JobRun. Task to TaskRun map for given job run.
- `taskRunSummaryMap` (dict(str, object)) — Gets the task_run_summary_map of this JobRun. TaskRun to TaskRunSummary map for given job run.
- `timeoutSeconds` (number) — Gets the timeout_seconds of this JobRun. An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value.
- `repairedTasks` (list[str]) — Gets the repaired_tasks of this JobRun. A list of repaired tasks.
- `repairMode` (string) — Gets the repair_mode of this JobRun. Repair mode to be used for this repair scope. Allowed values for this property are: "RESUME", "RERUN", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleStates` (list[oci.aidataplatform_dp.models.LifecycleState]) — Gets the lifecycle_states of this JobRun. The collection of lifecycle states.
- `runAs` (string) — Gets the run_as of this JobRun. This points to the user or service account executing the job.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-deletejob"></a>`deleteJob`
Deletes a job.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `jobKey` (`string`) — Job key.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteJobResponse`

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-deletejobrun"></a>`deleteJobRun`
Deletes a job run.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `jobRunKey` (`string`) — Job run key.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteJobRunResponse`

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-exporttaskrunoutput"></a>`exportTaskRunOutput`
Exports task run output in HTML or ipynb format.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `taskRunKey` (`string`) — Task run key.
- `taskRunOutputKey` (`string`) — Task run output key.
- `exportTaskRunOutputDetails` (`oci.aidataplatform_dp.models.ExportTaskRunOutputDetails`) — Payload to export task run output to a file.

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `exportTaskRunOutputResponse`

**Response Fields:**
- `name` (string) — Gets the name of this ExportedTaskRunOutputContents. Name of file, equivalent to the last part of the path.
- `path` (string) — Gets the path of this ExportedTaskRunOutputContents. Full path of the file.
- `content` (object) — Gets the content of this ExportedTaskRunOutputContents. For ipynb format, this contains a string representing the .ipynb file. For HTML format, this contains a string representing the HTML page. It has base64-encoded data for images.
- `format` (string) — Gets the format of this ExportedTaskRunOutputContents. Format of content as requested by the client. HTML format by default. Allowed values for this property are: "HTML", "IPYNB", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-fetchoutput"></a>`fetchOutput`
Fetches the task run output from the runtime engine.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `taskRunKey` (`string`) — Task run key.
- `fetchOutputDetails` (`oci.aidataplatform_dp.models.FetchOutputDetails`) — Details for task run output retrieval.

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `fetchOutputResponse`

**Response Fields:**
- `key` (string) — Gets the key of this TaskRunOutput. A unique identifier for the output.
- `taskType` (string) — Gets the task_type of this TaskRunOutput. The type of the task. Allowed values for this property are: "NOTEBOOK_TASK", "PYTHON_TASK", "SPARK_SUBMIT_TASK", "IF_ELSE_TASK", "JOB_TASK", "JAR_TASK", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `isTruncated` (boolean) — Gets the is_truncated of this TaskRunOutput. True if logs are truncated.
- `errorTrace` (string) — Gets the error_trace of this TaskRunOutput. If there was an error executing the run, this field contains any available stack traces.
- `data` (list[oci.aidataplatform_dp.models.RunOutputData]) — Gets the data of this TaskRunOutput. Array of output objects.
- `outputParameters` (list[oci.aidataplatform_dp.models.OutputParameter]) — Gets the output_parameters of this TaskRunOutput. List of output parameters with name and values.
- `version` (number) — Gets the version of this TaskRunOutput. Current version of job run object in repository.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-getjob"></a>`getJob`
Returns detailed information about a given job.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `jobKey` (`string`) — Job key.

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getJobResponse`

**Response Fields:**
- `key` (string) — Gets the key of this Job. The OCID of the job.
- `createdBy` (string) — Gets the created_by of this Job. The OCID of the IAM user.
- `createdByName` (string) — Gets the created_by_name of this Job. Name of the user who created this record
- `updatedBy` (string) — Gets the updated_by of this Job. The username of the latest updater. The OCID of the IAM user.
- `updatedByName` (string) — Gets the updated_by_name of this Job. Name of the user who updated this record.
- `runAs` (string) — Gets the run_as of this Job. This points to the user or service account executing the job.
- `name` (string) — Gets the name of this Job. A user-friendly name. Does not have to be unique, and is changeable.
- `description` (string) — Gets the description of this Job. A description for the job.
- `schedule` (oci.aidataplatform_dp.models.Schedule) — Gets the schedule of this Job.
- `continuous` (oci.aidataplatform_dp.models.Continuous) — Gets the continuous of this Job.
- `maxConcurrentRuns` (number) — Gets the max_concurrent_runs of this Job. Indicates the number of executions for the same job that can be run concurrently. The maximum value cannot exceed 1000.
- `gitConfig` (oci.aidataplatform_dp.models.GitConfig) — Gets the git_config of this Job.
- `queue` (oci.aidataplatform_dp.models.Queue) — Gets the queue of this Job.
- `path` (string) — Gets the path of this Job. The path to store the job definition in.
- `jobClusters` (list[oci.aidataplatform_dp.models.JobCluster]) — Gets the job_clusters of this Job. List of job cluster configurations.
- `tasks` (list[oci.aidataplatform_dp.models.Task]) — Gets the tasks of this Job. List of tasks in a job.
- `timeCreated` (datetime) — Gets the time_created of this Job. The date and time the DataLake was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2025-05-25T21:10:29.600Z`
- `timeUpdated` (datetime) — Gets the time_updated of this Job. The date and time the DataLake was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2025-05-25T21:10:29.600Z`
- `parameters` (list[oci.aidataplatform_dp.models.Parameter]) — Gets the parameters of this Job. An optional list of parameters.
- `timeoutSeconds` (number) — Gets the timeout_seconds of this Job. An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-getjobrun"></a>`getJobRun`
Returns detailed information about a given job run.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `jobRunKey` (`string`) — Job run key.

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldIncludeTaskRunSummaries` (`boolean`) — A flag to identify if task run summaries should be included in the job run response. If omitted, the service applies its configured default behavior.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getJobRunResponse`

**Response Fields:**
- `key` (string) — Gets the key of this JobRun. The OCID of the job.
- `name` (string) — Gets the name of this JobRun. A user-friendly name. Does not have to be unique, and is changeable.
- `jobKey` (string) — Gets the job_key of this JobRun. The OCID of the job.
- `jobName` (string) — Gets the job_name of this JobRun. A user-friendly name. Does not have to be unique, and is changeable.
- `parentJobRunKey` (string) — Gets the parent_job_run_key of this JobRun. The OCID of the job.
- `rootJobRunKey` (string) — Gets the root_job_run_key of this JobRun. The OCID of the job.
- `parentTaskRunKey` (string) — Gets the parent_task_run_key of this JobRun. The OCID of the task run.
- `tasks` (list[oci.aidataplatform_dp.models.Task]) — Gets the tasks of this JobRun. List of tasks in a job.
- `createdBy` (string) — Gets the created_by of this JobRun. The OCID of the IAM user.
- `createdByName` (string) — Gets the created_by_name of this JobRun. Name of the user who created this record
- `maxConcurrentRuns` (number) — Gets the max_concurrent_runs of this JobRun. Indicates the number of executions for the same job that can be run concurrently. The maximum value cannot exceed 1000.
- `gitConfig` (oci.aidataplatform_dp.models.GitConfig) — Gets the git_config of this JobRun.
- `queue` (oci.aidataplatform_dp.models.Queue) — Gets the queue of this JobRun.
- `originalAttemptRunId` (string) — Gets the original_attempt_run_id of this JobRun. The OCID of the job.
- `state` (oci.aidataplatform_dp.models.State) — Gets the state of this JobRun.
- `schedule` (oci.aidataplatform_dp.models.Schedule) — Gets the schedule of this JobRun.
- `clusterSpec` (oci.aidataplatform_dp.models.ClusterSpec) — Gets the cluster_spec of this JobRun.
- `clusterInstance` (oci.aidataplatform_dp.models.ClusterInstance) — Gets the cluster_instance of this JobRun.
- `parameters` (list[oci.aidataplatform_dp.models.Parameter]) — Gets the parameters of this JobRun. An optional list of parameters.
- `unifiedJobAndJobRunParameters` (list[oci.aidataplatform_dp.models.Parameter]) — Gets the unified_job_and_job_run_parameters of this JobRun. Unified List of job and job run parameters after resolving dynamic value references and parameter resolution as per precedence.
- `repairHistory` (list[oci.aidataplatform_dp.models.RepairHistory]) — Gets the repair_history of this JobRun. Array of repaired runs.
- `systemParameters` (dict(str, str)) — Gets the system_parameters of this JobRun. Map of system parameters with their values for this job run.
- `startTime` (number) — Gets the start_time of this JobRun. The time at which the job execution started in epoch milliseconds.
- `endTime` (number) — Gets the end_time of this JobRun. The time at which the job execution started in epoch milliseconds.
- `setupDuration` (number) — Gets the setup_duration of this JobRun. The time (in milliseconds) taken to setup the cluster.
- `executionDuration` (number) — Gets the execution_duration of this JobRun. The time (in milliseconds) taken to complete the job execution.
- `cleanupDuration` (number) — Gets the cleanup_duration of this JobRun. The time (in milliseconds) taken to terminate the cluster and to clean up any associated artifacts.
- `runDuration` (number) — Gets the run_duration of this JobRun. The time (in milliseconds) taken to complete the job execution and all its repairs to finish.
- `timeCreated` (datetime) — Gets the time_created of this JobRun. The time at which the job execution started.
- `timeUpdated` (datetime) — Gets the time_updated of this JobRun. The time at which the job execution was updated.
- `launched` (string) — Gets the launched of this JobRun. Identify job run launched by schedule or manually. Allowed values for this property are: "SCHEDULED", "MANUAL", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `version` (number) — Gets the version of this JobRun. Current version of job run object in repository.
- `taskToTaskRunMap` (dict(str, str)) — Gets the task_to_task_run_map of this JobRun. Task to TaskRun map for given job run.
- `taskRunSummaryMap` (dict(str, object)) — Gets the task_run_summary_map of this JobRun. TaskRun to TaskRunSummary map for given job run.
- `timeoutSeconds` (number) — Gets the timeout_seconds of this JobRun. An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value.
- `repairedTasks` (list[str]) — Gets the repaired_tasks of this JobRun. A list of repaired tasks.
- `repairMode` (string) — Gets the repair_mode of this JobRun. Repair mode to be used for this repair scope. Allowed values for this property are: "RESUME", "RERUN", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleStates` (list[oci.aidataplatform_dp.models.LifecycleState]) — Gets the lifecycle_states of this JobRun. The collection of lifecycle states.
- `runAs` (string) — Gets the run_as of this JobRun. This points to the user or service account executing the job.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-gettaskrun"></a>`getTaskRun`
Returns detailed information about a task run with a given task run key.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `taskRunKey` (`string`) — Task run key.

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getTaskRunResponse`

**Response Fields:**
- `key` (string) — Gets the key of this TaskRun. The OCID of the task run.
- `name` (string) — Gets the name of this TaskRun. A user-friendly name. Does not have to be unique, and is changeable.
- `taskKey` (string) — Gets the task_key of this TaskRun. The display name of the task. User can specify a value for this.
- `jobKey` (string) — Gets the job_key of this TaskRun. The OCID of the job.
- `jobRunKey` (string) — Gets the job_run_key of this TaskRun. The OCID of the job.
- `parentJobRunKey` (string) — Gets the parent_job_run_key of this TaskRun. The OCID of the job.
- `rootJobRunKey` (string) — Gets the root_job_run_key of this TaskRun. The OCID of the job.
- `clusterValidationStartTime` (number) — Gets the cluster_validation_start_time of this TaskRun. The time at which the cluster validation started in epoch milliseconds.
- `startTime` (number) — Gets the start_time of this TaskRun. The time at which the job execution started in epoch milliseconds.
- `endTime` (number) — Gets the end_time of this TaskRun. The time at which the job execution started in epoch milliseconds.
- `state` (oci.aidataplatform_dp.models.State) — Gets the state of this TaskRun.
- `setupDuration` (number) — Gets the setup_duration of this TaskRun. The time (in milliseconds) taken to setup the cluster.
- `executionDuration` (number) — Gets the execution_duration of this TaskRun. The time (in milliseconds) taken to complete the job execution.
- `cleanupDuration` (number) — Gets the cleanup_duration of this TaskRun. The time (in milliseconds) taken to terminate the cluster and to clean up any associated artifacts.
- `clusterSpec` (oci.aidataplatform_dp.models.ClusterSpec) — Gets the cluster_spec of this TaskRun.
- `task` (oci.aidataplatform_dp.models.Task) — Gets the task of this TaskRun.
- `version` (number) — Gets the version of this TaskRun. Current version of job run object in repository.
- `retryAttempt` (number) — Gets the retry_attempt of this TaskRun. Sequence number of the current retry attempt. 0 for the original. 1, 2, 3, ... for subsequent retry attempts.
- `retries` (list[oci.aidataplatform_dp.models.TaskRunRetry]) — Gets the retries of this TaskRun. List of task retries.
- `outputKey` (string) — Gets the output_key of this TaskRun. A unique identifier for the output.
- `externalId` (string) — Gets the external_id of this TaskRun. The external ID of the task execution.
- `systemParameters` (dict(str, str)) — Gets the system_parameters of this TaskRun. Map of system parameters with their values for this job run.
- `parameters` (list[oci.aidataplatform_dp.models.Parameter]) — Gets the parameters of this TaskRun. An optional list of parameters.
- `lifecycleStates` (list[oci.aidataplatform_dp.models.LifecycleState]) — Gets the lifecycle_states of this TaskRun. The collection of lifecycle states.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-listjobpermissions"></a>`listJobPermissions`
Returns a list of job permissions.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `jobKey` (`string`) — Job key.

**Optional Parameters:**
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Allowed values are: "timeCreated", "displayName"
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listJobPermissionsResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.JobPermissionSummary]) — Gets the items of this JobPermissionCollection. List of job permissions.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-listjobruns"></a>`listJobRuns`
Returns a detailed list of job runs.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace

**Optional Parameters:**
- `displayName` (`string`) — A filter to return only resources that match the given display name exactly.
- `jobKey` (`list[str]`) — The field to filter based on job key.
- `status` (`list[str]`) — The field to filter based on state. Allowed values are: "PENDING", "RUNNING", "SKIPPED", "INTERNAL_ERROR", "BLOCKED", "SUCCESS", "FAILED", "CANCELED", "UPSTREAM_CANCELED", "UPSTREAM_FAILED", "EXCLUDED"
- `timeCreatedGreaterThanOrEqualTo` (`datetime`) — Fetch objects from repository that were created after or at the exact timestamp provided in parameter
- `timeCreatedLessThanOrEqualTo` (`datetime`) — Fetch objects from repository that were created before or at the exact timestamp provided in parameter.
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated List call.
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName", "status"
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listJobRunsResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.JobRunSummary]) — Gets the items of this JobRunCollection. List of job runs.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-listjobs"></a>`listJobs`
Returns a list of jobs.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace

**Optional Parameters:**
- `displayName` (`string`) — A filter to return only resources that match the given display name exactly.
- `jobKey` (`list[str]`) — The field to filter based on job key.
- `displayNameContains` (`string`) — A filter to return only resources that have a display name containing the text provided.
- `path` (`string`) — The fully qualified path where the job is stored.
- `createdBy` (`string`) — A filter to return only resources that are created by given user with username that matches exactly.
- `updatedBy` (`string`) — A filter to return only resources that was last updated by given user with username that matches exactly.
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName", "status"
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listJobsResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.JobSummary]) — Gets the items of this JobCollection. List of jobs.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-listrecentjobruns"></a>`listRecentJobRuns`
Returns a list of the latest job runs for a given job key.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `jobKey` (`oci.aidataplatform_dp.models.list[str]`) — The field to filter based on job key.

**Optional Parameters:**
- `recordCount` (`number`) — The number of records to fetch.
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated List call.
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName", "status"
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listRecentJobRunsResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.JobRunSummary]) — Gets the items of this JobRunCollection. List of job runs.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-listtaskruns"></a>`listTaskRuns`
Returns a list of task runs.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `jobRunKey` (`string`) — The field to filter based on job run key.

**Optional Parameters:**
- `displayName` (`string`) — A filter to return only resources that match the given display name exactly.
- `status` (`list[str]`) — The field to filter based on state. Allowed values are: "PENDING", "RUNNING", "SKIPPED", "INTERNAL_ERROR", "BLOCKED", "SUCCESS", "FAILED", "CANCELED", "UPSTREAM_CANCELED", "UPSTREAM_FAILED", "EXCLUDED"
- `parentJobRunKey` (`string`) — The field to filter based on parent job run key.
- `rootJobRunKey` (`string`) — The field to filter based on root job run key.
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName", "status"
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listTaskRunsResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.TaskRunSummary]) — Gets the items of this TaskRunCollection. List of TaskRuns.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-managejobpermission"></a>`manageJobPermission`
Update job permissions with the provided details.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `jobKey` (`string`) — Job key.
- `manageJobPermissionDetails` (`oci.aidataplatform_dp.models.ManageJobPermissionDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageJobPermissionResponse`

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-repairjobrun"></a>`repairJobRun`
Repairs and reruns a job run.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `jobRunKey` (`string`) — Job run key.
- `repairJobRunDetails` (`oci.aidataplatform_dp.models.RepairJobRunDetails`) — Details of the job run to be repaired.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `repairJobRunResponse`

**Response Fields:**
- `key` (string) — Gets the key of this JobRun. The OCID of the job.
- `name` (string) — Gets the name of this JobRun. A user-friendly name. Does not have to be unique, and is changeable.
- `jobKey` (string) — Gets the job_key of this JobRun. The OCID of the job.
- `jobName` (string) — Gets the job_name of this JobRun. A user-friendly name. Does not have to be unique, and is changeable.
- `parentJobRunKey` (string) — Gets the parent_job_run_key of this JobRun. The OCID of the job.
- `rootJobRunKey` (string) — Gets the root_job_run_key of this JobRun. The OCID of the job.
- `parentTaskRunKey` (string) — Gets the parent_task_run_key of this JobRun. The OCID of the task run.
- `tasks` (list[oci.aidataplatform_dp.models.Task]) — Gets the tasks of this JobRun. List of tasks in a job.
- `createdBy` (string) — Gets the created_by of this JobRun. The OCID of the IAM user.
- `createdByName` (string) — Gets the created_by_name of this JobRun. Name of the user who created this record
- `maxConcurrentRuns` (number) — Gets the max_concurrent_runs of this JobRun. Indicates the number of executions for the same job that can be run concurrently. The maximum value cannot exceed 1000.
- `gitConfig` (oci.aidataplatform_dp.models.GitConfig) — Gets the git_config of this JobRun.
- `queue` (oci.aidataplatform_dp.models.Queue) — Gets the queue of this JobRun.
- `originalAttemptRunId` (string) — Gets the original_attempt_run_id of this JobRun. The OCID of the job.
- `state` (oci.aidataplatform_dp.models.State) — Gets the state of this JobRun.
- `schedule` (oci.aidataplatform_dp.models.Schedule) — Gets the schedule of this JobRun.
- `clusterSpec` (oci.aidataplatform_dp.models.ClusterSpec) — Gets the cluster_spec of this JobRun.
- `clusterInstance` (oci.aidataplatform_dp.models.ClusterInstance) — Gets the cluster_instance of this JobRun.
- `parameters` (list[oci.aidataplatform_dp.models.Parameter]) — Gets the parameters of this JobRun. An optional list of parameters.
- `unifiedJobAndJobRunParameters` (list[oci.aidataplatform_dp.models.Parameter]) — Gets the unified_job_and_job_run_parameters of this JobRun. Unified List of job and job run parameters after resolving dynamic value references and parameter resolution as per precedence.
- `repairHistory` (list[oci.aidataplatform_dp.models.RepairHistory]) — Gets the repair_history of this JobRun. Array of repaired runs.
- `systemParameters` (dict(str, str)) — Gets the system_parameters of this JobRun. Map of system parameters with their values for this job run.
- `startTime` (number) — Gets the start_time of this JobRun. The time at which the job execution started in epoch milliseconds.
- `endTime` (number) — Gets the end_time of this JobRun. The time at which the job execution started in epoch milliseconds.
- `setupDuration` (number) — Gets the setup_duration of this JobRun. The time (in milliseconds) taken to setup the cluster.
- `executionDuration` (number) — Gets the execution_duration of this JobRun. The time (in milliseconds) taken to complete the job execution.
- `cleanupDuration` (number) — Gets the cleanup_duration of this JobRun. The time (in milliseconds) taken to terminate the cluster and to clean up any associated artifacts.
- `runDuration` (number) — Gets the run_duration of this JobRun. The time (in milliseconds) taken to complete the job execution and all its repairs to finish.
- `timeCreated` (datetime) — Gets the time_created of this JobRun. The time at which the job execution started.
- `timeUpdated` (datetime) — Gets the time_updated of this JobRun. The time at which the job execution was updated.
- `launched` (string) — Gets the launched of this JobRun. Identify job run launched by schedule or manually. Allowed values for this property are: "SCHEDULED", "MANUAL", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `version` (number) — Gets the version of this JobRun. Current version of job run object in repository.
- `taskToTaskRunMap` (dict(str, str)) — Gets the task_to_task_run_map of this JobRun. Task to TaskRun map for given job run.
- `taskRunSummaryMap` (dict(str, object)) — Gets the task_run_summary_map of this JobRun. TaskRun to TaskRunSummary map for given job run.
- `timeoutSeconds` (number) — Gets the timeout_seconds of this JobRun. An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value.
- `repairedTasks` (list[str]) — Gets the repaired_tasks of this JobRun. A list of repaired tasks.
- `repairMode` (string) — Gets the repair_mode of this JobRun. Repair mode to be used for this repair scope. Allowed values for this property are: "RESUME", "RERUN", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleStates` (list[oci.aidataplatform_dp.models.LifecycleState]) — Gets the lifecycle_states of this JobRun. The collection of lifecycle states.
- `runAs` (string) — Gets the run_as of this JobRun. This points to the user or service account executing the job.

**Return:** [Back to Workflow (`WorkflowClient`)](#workflowclient-client) • [Top](#top)


### <a id="workflowclient-updatejob"></a>`updateJob`
Updates details for a job.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `jobKey` (`string`) — Job key.
- `updateJobDetails` (`oci.aidataplatform_dp.models.UpdateJobDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateJobResponse`

**Response Fields:**
- `key` (string) — Gets the key of this Job. The OCID of the job.
- `createdBy` (string) — Gets the created_by of this Job. The OCID of the IAM user.
- `createdByName` (string) — Gets the created_by_name of this Job. Name of the user who created this record
- `updatedBy` (string) — Gets the updated_by of this Job. The username of the latest updater. The OCID of the IAM user.
- `updatedByName` (string) — Gets the updated_by_name of this Job. Name of the user who updated this record.
- `runAs` (string) — Gets the run_as of this Job. This points to the user or service account executing the job.
- `name` (string) — Gets the name of this Job. A user-friendly name. Does not have to be unique, and is changeable.
- `description` (string) — Gets the description of this Job. A description for the job.
- `schedule` (oci.aidataplatform_dp.models.Schedule) — Gets the schedule of this Job.
- `continuous` (oci.aidataplatform_dp.models.Continuous) — Gets the continuous of this Job.
- `maxConcurrentRuns` (number) — Gets the max_concurrent_runs of this Job. Indicates the number of executions for the same job that can be run concurrently. The maximum value cannot exceed 1000.
- `gitConfig` (oci.aidataplatform_dp.models.GitConfig) — Gets the git_config of this Job.
- `queue` (oci.aidataplatform_dp.models.Queue) — Gets the queue of this Job.
- `path` (string) — Gets the path of this Job. The path to store the job definition in.
- `jobClusters` (list[oci.aidataplatform_dp.models.JobCluster]) — Gets the job_clusters of this Job. List of job cluster configurations.
- `tasks` (list[oci.aidataplatform_dp.models.Task]) — Gets the tasks of this Job. List of tasks in a job.
- `timeCreated` (datetime) — Gets the time_created of this Job. The date and time the DataLake was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2025-05-25T21:10:29.600Z`
- `timeUpdated` (datetime) — Gets the time_updated of this Job. The date and time the DataLake was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2025-05-25T21:10:29.600Z`
- `parameters` (list[oci.aidataplatform_dp.models.Parameter]) — Gets the parameters of this Job. An optional list of parameters.
- `timeoutSeconds` (number) — Gets the timeout_seconds of this Job. An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value.

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
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `createGitFolderDetails` (`oci.aidataplatform_dp.models.CreateGitFolderDetails`) — The information to be updated.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createGitFolderResponse`

**Response Fields:**
- `folderPath` (string) — Gets the folder_path of this GitFolder. The absolute path of the Git folder user wants to create.
- `gitProviderKey` (string) — Gets the git_provider_key of this GitFolder. key corresponding to Git service provider in git provider table.
- `gitRepositoryUrl` (string) — Gets the git_repository_url of this GitFolder. Git repository url used to clone.
- `description` (string) — Gets the description of this GitFolder. Short description about the git repository.
- `branchName` (string) — Gets the branch_name of this GitFolder. Git branch name that is cloned.
- `folderMetadata` (dict(str, object)) — Gets the folder_metadata of this GitFolder. The metadata about the folder, like branchName.

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)


### <a id="workspaceclient-createworkspace"></a>`createWorkspace`
Creates a workspace.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `createWorkspaceDetails` (`oci.aidataplatform_dp.models.CreateWorkspaceDetails`) — Details for the new workspace.

**Optional Parameters:**
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createWorkspaceResponse`

**Response Fields:**
- `key` (string) — Gets the key of this Workspace. The key of the AI Data Platform Workbench workspace.
- `displayName` (string) — Gets the display_name of this Workspace. A user-friendly name that has to be unique in a AI Data Platform Workbench instance.
- `description` (string) — Gets the description of this Workspace. Description of the workspace.
- `type` (string) — Gets the type of this Workspace. Workspace type. Type is DEFAULT for workspace created at AI Data Platform Workbench creation, type is USER for workspace created by AI Data Platform Workbench user. Allowed values for this property are: "DEFAULT", "USER", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `timeCreated` (datetime) — Gets the time_created of this Workspace. The date and time the AI Data Platform Workbench workspace was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `timeUpdated` (datetime) — Gets the time_updated of this Workspace. The date and time the AI Data Platform Workbench workspace was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `lifecycleState` (string) — Gets the lifecycle_state of this Workspace. The current state of the AI Data Platform Workbench workspace. Allowed values for this property are: "CREATING", "UPDATING", "ACTIVE", "DELETING", "DELETED", "FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleDetails` (string) — Gets the lifecycle_details of this Workspace. A message that describes the current state of the workspace in more detail. For example, can be used to provide actionable information for a resource in the Failed state.
- `systemTags` (dict(str, dict(str, object))) — Gets the system_tags of this Workspace. System tags for this resource. Each key is predefined and scoped to a namespace. Example: `{"orcl-cloud": {"free-tier-retained": "true"}}`
- `createdBy` (string) — Gets the created_by of this Workspace. OCID of the user who created this record.
- `createdByName` (string) — Gets the created_by_name of this Workspace. Name of the user who created this record.
- `updatedBy` (string) — Gets the updated_by of this Workspace. OCID of the user who updated this record.
- `updatedByName` (string) — Gets the updated_by_name of this Workspace. Name of the user who updated this record.
- `defaultCatalogKey` (string) — Gets the default_catalog_key of this Workspace. The key of the catalog to be used as the default catalog for this workspace. A default catalog in the workspace will allow users to use that catalog without the need to refer it in the notebook. For example, if default catalog is iCat1, and it has schema1 and table1, you can refer to the table in a notebook using: schema1.table1.
- `isPrivateNetworkEnabled` (boolean) — Gets the is_private_network_enabled of this Workspace. A flag to display whether workspace is private network enabled or not.
- `networkConfigurationDetails` (oci.aidataplatform_dp.models.WorkspaceNetworkConfigurationDetails) — Gets the network_configuration_details of this Workspace.
- `logGroupId` (string) — Gets the log_group_id of this Workspace. The OCID of the log group that contains the logs. This uniquely identifies a collection of logs within OCI Logging Service.
- `aicUserSchemaName` (string) — Gets the aic_user_schema_name of this Workspace. The name of the AIC user schema if created.

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)


### <a id="workspaceclient-deleteworkspace"></a>`deleteWorkspace`
Deletes a workspace.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `timeDataLakeDeletion` (`datetime`) — Deletion time in the case that a workspace is deleted during AI Data Platform Workbench deletion.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteWorkspaceResponse`

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)


### <a id="workspaceclient-getworkspace"></a>`getWorkspace`
Gets detailed information about a workspace.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace

**Optional Parameters:**
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getWorkspaceResponse`

**Response Fields:**
- `key` (string) — Gets the key of this Workspace. The key of the AI Data Platform Workbench workspace.
- `displayName` (string) — Gets the display_name of this Workspace. A user-friendly name that has to be unique in a AI Data Platform Workbench instance.
- `description` (string) — Gets the description of this Workspace. Description of the workspace.
- `type` (string) — Gets the type of this Workspace. Workspace type. Type is DEFAULT for workspace created at AI Data Platform Workbench creation, type is USER for workspace created by AI Data Platform Workbench user. Allowed values for this property are: "DEFAULT", "USER", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `timeCreated` (datetime) — Gets the time_created of this Workspace. The date and time the AI Data Platform Workbench workspace was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `timeUpdated` (datetime) — Gets the time_updated of this Workspace. The date and time the AI Data Platform Workbench workspace was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `lifecycleState` (string) — Gets the lifecycle_state of this Workspace. The current state of the AI Data Platform Workbench workspace. Allowed values for this property are: "CREATING", "UPDATING", "ACTIVE", "DELETING", "DELETED", "FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleDetails` (string) — Gets the lifecycle_details of this Workspace. A message that describes the current state of the workspace in more detail. For example, can be used to provide actionable information for a resource in the Failed state.
- `systemTags` (dict(str, dict(str, object))) — Gets the system_tags of this Workspace. System tags for this resource. Each key is predefined and scoped to a namespace. Example: `{"orcl-cloud": {"free-tier-retained": "true"}}`
- `createdBy` (string) — Gets the created_by of this Workspace. OCID of the user who created this record.
- `createdByName` (string) — Gets the created_by_name of this Workspace. Name of the user who created this record.
- `updatedBy` (string) — Gets the updated_by of this Workspace. OCID of the user who updated this record.
- `updatedByName` (string) — Gets the updated_by_name of this Workspace. Name of the user who updated this record.
- `defaultCatalogKey` (string) — Gets the default_catalog_key of this Workspace. The key of the catalog to be used as the default catalog for this workspace. A default catalog in the workspace will allow users to use that catalog without the need to refer it in the notebook. For example, if default catalog is iCat1, and it has schema1 and table1, you can refer to the table in a notebook using: schema1.table1.
- `isPrivateNetworkEnabled` (boolean) — Gets the is_private_network_enabled of this Workspace. A flag to display whether workspace is private network enabled or not.
- `networkConfigurationDetails` (oci.aidataplatform_dp.models.WorkspaceNetworkConfigurationDetails) — Gets the network_configuration_details of this Workspace.
- `logGroupId` (string) — Gets the log_group_id of this Workspace. The OCID of the log group that contains the logs. This uniquely identifies a collection of logs within OCI Logging Service.
- `aicUserSchemaName` (string) — Gets the aic_user_schema_name of this Workspace. The name of the AIC user schema if created.

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)


### <a id="workspaceclient-listcreateworkspacepermissions"></a>`listCreateWorkspacePermissions`
Gets a list of create workspace permission summary objects.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

**Optional Parameters:**
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Default order for `granteeName` is ascending. Allowed values are: "granteeName"
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listCreateWorkspacePermissionsResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.CreateWorkspacePermissionSummary]) — Gets the items of this CreateWorkspacePermissionCollection. List of Create Workspace permissions.

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)


### <a id="workspaceclient-listworkspacepermissions"></a>`listWorkspacePermissions`
Gets a list of workspace permissions.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace

**Optional Parameters:**
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Default order for `granteeName` is ascending. Allowed values are: "granteeName"
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listWorkspacePermissionsResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.WorkspacePermissionSummary]) — Gets the items of this WorkspacePermissionCollection. List of workspace permissions.

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)


### <a id="workspaceclient-listworkspaces"></a>`listWorkspaces`
Gets a list of workspaces.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

**Optional Parameters:**
- `lifecycleState` (`string`) — A filter to return only resources that match the given lifecycle state. The state value is case-insensitive. Allowed values are: "CREATING", "UPDATING", "ACTIVE", "DELETING", "DELETED", "FAILED"
- `displayName` (`string`) — A filter to return only resources that match the given display name exactly.
- `displayNameContains` (`string`) — A filter to return only resources that have a display name containing the text provided.
- `type` (`string`) — When no value is provided, all workspaces are returned. Otherwise, workspace of selected value is returned. Allowed values are: "DEFAULT", "USER"
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `isPrivateNetworkEnabled` (`boolean`) — A flag to filter the workspaces which are private network enabled or disabled
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listWorkspacesResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.WorkspaceSummary]) — Gets the items of this WorkspaceCollection. List of workspaces.

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)


### <a id="workspaceclient-managecreateworkspacepermission"></a>`manageCreateWorkspacePermission`
Updates create workspace permissions on a workspace.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `manageCreateWorkspacePermissionDetails` (`oci.aidataplatform_dp.models.ManageCreateWorkspacePermissionDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageCreateWorkspacePermissionResponse`

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)


### <a id="workspaceclient-manageworkspacepermission"></a>`manageWorkspacePermission`
Updates permissions on a workspace.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `manageWorkspacePermissionDetails` (`oci.aidataplatform_dp.models.ManageWorkspacePermissionDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageWorkspacePermissionResponse`

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)


### <a id="workspaceclient-updateworkspace"></a>`updateWorkspace`
Updates the details of a workspace.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `updateWorkspaceDetails` (`oci.aidataplatform_dp.models.UpdateWorkspaceDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateWorkspaceResponse`

**Response Fields:**
- `key` (string) — Gets the key of this Workspace. The key of the AI Data Platform Workbench workspace.
- `displayName` (string) — Gets the display_name of this Workspace. A user-friendly name that has to be unique in a AI Data Platform Workbench instance.
- `description` (string) — Gets the description of this Workspace. Description of the workspace.
- `type` (string) — Gets the type of this Workspace. Workspace type. Type is DEFAULT for workspace created at AI Data Platform Workbench creation, type is USER for workspace created by AI Data Platform Workbench user. Allowed values for this property are: "DEFAULT", "USER", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `timeCreated` (datetime) — Gets the time_created of this Workspace. The date and time the AI Data Platform Workbench workspace was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `timeUpdated` (datetime) — Gets the time_updated of this Workspace. The date and time the AI Data Platform Workbench workspace was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `lifecycleState` (string) — Gets the lifecycle_state of this Workspace. The current state of the AI Data Platform Workbench workspace. Allowed values for this property are: "CREATING", "UPDATING", "ACTIVE", "DELETING", "DELETED", "FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleDetails` (string) — Gets the lifecycle_details of this Workspace. A message that describes the current state of the workspace in more detail. For example, can be used to provide actionable information for a resource in the Failed state.
- `systemTags` (dict(str, dict(str, object))) — Gets the system_tags of this Workspace. System tags for this resource. Each key is predefined and scoped to a namespace. Example: `{"orcl-cloud": {"free-tier-retained": "true"}}`
- `createdBy` (string) — Gets the created_by of this Workspace. OCID of the user who created this record.
- `createdByName` (string) — Gets the created_by_name of this Workspace. Name of the user who created this record.
- `updatedBy` (string) — Gets the updated_by of this Workspace. OCID of the user who updated this record.
- `updatedByName` (string) — Gets the updated_by_name of this Workspace. Name of the user who updated this record.
- `defaultCatalogKey` (string) — Gets the default_catalog_key of this Workspace. The key of the catalog to be used as the default catalog for this workspace. A default catalog in the workspace will allow users to use that catalog without the need to refer it in the notebook. For example, if default catalog is iCat1, and it has schema1 and table1, you can refer to the table in a notebook using: schema1.table1.
- `isPrivateNetworkEnabled` (boolean) — Gets the is_private_network_enabled of this Workspace. A flag to display whether workspace is private network enabled or not.
- `networkConfigurationDetails` (oci.aidataplatform_dp.models.WorkspaceNetworkConfigurationDetails) — Gets the network_configuration_details of this Workspace.
- `logGroupId` (string) — Gets the log_group_id of this Workspace. The OCID of the log group that contains the logs. This uniquely identifies a collection of logs within OCI Logging Service.
- `aicUserSchemaName` (string) — Gets the aic_user_schema_name of this Workspace. The name of the AIC user schema if created.

**Return:** [Back to Workspace (`WorkspaceClient`)](#workspaceclient-client) • [Top](#top)


### <a id="workspaceclient-updateworkspaceasyncoperationstatus"></a>`updateWorkspaceAsyncOperationStatus`
Updates the status of a workspace.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `asyncOperationKey` (`string`) — The unique identifier of an async operation
- `updateWorkspaceAsyncOperationStatusDetails` (`oci.aidataplatform_dp.models.UpdateWorkspaceAsyncOperationStatusDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateWorkspaceAsyncOperationStatusResponse`

**Response Fields:**
- `key` (string) — Gets the key of this Workspace. The key of the AI Data Platform Workbench workspace.
- `displayName` (string) — Gets the display_name of this Workspace. A user-friendly name that has to be unique in a AI Data Platform Workbench instance.
- `description` (string) — Gets the description of this Workspace. Description of the workspace.
- `type` (string) — Gets the type of this Workspace. Workspace type. Type is DEFAULT for workspace created at AI Data Platform Workbench creation, type is USER for workspace created by AI Data Platform Workbench user. Allowed values for this property are: "DEFAULT", "USER", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `timeCreated` (datetime) — Gets the time_created of this Workspace. The date and time the AI Data Platform Workbench workspace was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `timeUpdated` (datetime) — Gets the time_updated of this Workspace. The date and time the AI Data Platform Workbench workspace was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `lifecycleState` (string) — Gets the lifecycle_state of this Workspace. The current state of the AI Data Platform Workbench workspace. Allowed values for this property are: "CREATING", "UPDATING", "ACTIVE", "DELETING", "DELETED", "FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleDetails` (string) — Gets the lifecycle_details of this Workspace. A message that describes the current state of the workspace in more detail. For example, can be used to provide actionable information for a resource in the Failed state.
- `systemTags` (dict(str, dict(str, object))) — Gets the system_tags of this Workspace. System tags for this resource. Each key is predefined and scoped to a namespace. Example: `{"orcl-cloud": {"free-tier-retained": "true"}}`
- `createdBy` (string) — Gets the created_by of this Workspace. OCID of the user who created this record.
- `createdByName` (string) — Gets the created_by_name of this Workspace. Name of the user who created this record.
- `updatedBy` (string) — Gets the updated_by of this Workspace. OCID of the user who updated this record.
- `updatedByName` (string) — Gets the updated_by_name of this Workspace. Name of the user who updated this record.
- `defaultCatalogKey` (string) — Gets the default_catalog_key of this Workspace. The key of the catalog to be used as the default catalog for this workspace. A default catalog in the workspace will allow users to use that catalog without the need to refer it in the notebook. For example, if default catalog is iCat1, and it has schema1 and table1, you can refer to the table in a notebook using: schema1.table1.
- `isPrivateNetworkEnabled` (boolean) — Gets the is_private_network_enabled of this Workspace. A flag to display whether workspace is private network enabled or not.
- `networkConfigurationDetails` (oci.aidataplatform_dp.models.WorkspaceNetworkConfigurationDetails) — Gets the network_configuration_details of this Workspace.
- `logGroupId` (string) — Gets the log_group_id of this Workspace. The OCID of the log group that contains the logs. This uniquely identifies a collection of logs within OCI Logging Service.
- `aicUserSchemaName` (string) — Gets the aic_user_schema_name of this Workspace. The name of the AIC user schema if created.

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
- [`uploadWorkspaceObjectWithPar`](#workspaceobjectclient-uploadworkspaceobjectwithpar)

### <a id="workspaceobjectclient-copyworkspaceobject"></a>`copyWorkspaceObject`
Copy a workspace object to different location.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `copyWorkspaceObjectDetails` (`oci.aidataplatform_dp.models.CopyWorkspaceObjectDetails`) — Details for copying the workspace object to a different path.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `copyWorkspaceObjectResponse`

**Response Fields:**
- `path` (string) — Gets the path of this WorkspaceObjectDetails. The fully qualified path of the workspace object. Example: /Shared/Folder1/Notebook1.ipynb
- `key` (string) — Gets the key of this WorkspaceObjectDetails. The key of the Workspace Object.
- `displayName` (string) — Gets the display_name of this WorkspaceObjectDetails. The name of the Workspace Object. This will be the name of the file/folder in the workspace. Example: Notebook1.ipynb, Folder1
- `timeCreated` (datetime) — Gets the time_created of this WorkspaceObjectDetails. The date and time the workspace object was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `timeUpdated` (datetime) — Gets the time_updated of this WorkspaceObjectDetails. The date and time the workspace object was last updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `type` (string) — Gets the type of this WorkspaceObjectDetails. The type of the workspace object. Allowed values for this property are: "NOTEBOOK", "JOB", "LAKE_FLOW", "AGENT_LAKE_FLOW", "GENERATED_ARTIFACT", "LIBRARY", "FILE", "FOLDER", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `description` (string) — Gets the description of this WorkspaceObjectDetails. The description for the file and folder.
- `systemTags` (dict(str, dict(str, object))) — Gets the system_tags of this WorkspaceObjectDetails. System tags for this resource. Each key is predefined and scoped to a namespace. Example: `{"orcl-cloud": {"free-tier-retained": "true"}}`

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)


### <a id="workspaceobjectclient-createworkspaceobject"></a>`createWorkspaceObject`
Creates a workspace object. You can create a file or folder in the workspace.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `createWorkspaceObjectDetails` (`stream`) — Details for the new workspace object.
- `path` (`string`) — The absolute path of the file or folder

**Optional Parameters:**
- `type` (`string`) — The type of workspace object.
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `isUploadFileBase64Encoded` (`boolean`) — A flag to identify if the upload file is base64 encoded
- `isOverwrite` (`boolean`) — A boolean which decides if overwrite is allowed
- `objectDescription` (`string`) — The description of the workspace object
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `createWorkspaceObjectResponse`

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)


### <a id="workspaceobjectclient-deleteworkspaceobject"></a>`deleteWorkspaceObject`
Deletes a workspace object.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `objectPath` (`string`) — The fully qualified path of the workspace object.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `deleteWorkspaceObjectResponse`

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)


### <a id="workspaceobjectclient-downloadworkspaceobjectwithpar"></a>`downloadWorkspaceObjectWithPar`
Downloads a workspace file by providing the PAR info for downloading the file for given path.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `path` (`string`) — The absolute path of the file or folder

**Optional Parameters:**
- `shouldGenerateNewPar` (`boolean`) — Flag to toggle to generate short living par
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `type` (`string`) — The type of workspace object.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `downloadWorkspaceObjectWithParResponse`

**Response Fields:**
- `parUrl` (string) — Gets the par_url of this DownloadFileWithParResult. String representing the PAR URL.
- `eTag` (string) — Gets the e_tag of this DownloadFileWithParResult. Etag after creating or closing a file.
- `locationUri` (string) — Gets the location_uri of this DownloadFileWithParResult. The object storage URI which has bucket and namespace information.
- `size` (number) — Gets the size of this DownloadFileWithParResult. File size in bytes.
- `createdBy` (string) — Gets the created_by of this DownloadFileWithParResult. The user who created the file.
- `updatedBy` (string) — Gets the updated_by of this DownloadFileWithParResult. The user who last updated the file.
- `createdTime` (string) — Gets the created_time of this DownloadFileWithParResult. The time at which the file was created.
- `updatedTime` (string) — Gets the updated_time of this DownloadFileWithParResult. The last modified time of the file.
- `description` (string) — Gets the description of this DownloadFileWithParResult. The file description.
- `systemTags` (dict(str, dict(str, object))) — Gets the system_tags of this DownloadFileWithParResult. System tags for this resource. Each key is predefined and scoped to a namespace. Example: `{"orcl-cloud": {"free-tier-retained": "true"}}`

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)


### <a id="workspaceobjectclient-getworkspaceobject"></a>`getWorkspaceObject`
Returns detailed information about a workspace object.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `objectPath` (`string`) — The fully qualified path of the workspace object.

**Optional Parameters:**
- `shouldIncludeMetadata` (`boolean`) — Path to list all metadata for a file or folder.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `getWorkspaceObjectResponse`

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)


### <a id="workspaceobjectclient-headworkspaceobject"></a>`headWorkspaceObject`
Returns metadata about a workspace object. The contents of the file are not retrieved.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `objectPath` (`string`) — The fully qualified path of the workspace object.

**Optional Parameters:**
- `shouldIncludeMetadata` (`boolean`) — Path to list all metadata for a file or folder.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `headWorkspaceObjectResponse`

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)


### <a id="workspaceobjectclient-listworkspaceobjectpermissions"></a>`listWorkspaceObjectPermissions`
Returns a list of workspace object permissions.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `objectKey` (`string`) — The key of the workspace object.

**Optional Parameters:**
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listWorkspaceObjectPermissionsResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.WorkspaceObjectPermissionSummary]) — Gets the items of this WorkspaceObjectPermissionCollection. List of workspace object permissions.

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)


### <a id="workspaceobjectclient-listworkspaceobjects"></a>`listWorkspaceObjects`
Returns a list of objects in the workspace.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `path` (`string`) — The absolute path of the file or folder

**Optional Parameters:**
- `type` (`string`) — Filter by object type. For example, NOTEBOOK, LIBRARY, or FILE.
- `displayName` (`string`) — A filter to return only resources that match the given display name exactly.
- `limit` (`number`) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `metadataKeys` (`string`) — Comma separated keys to have in list response.
- `page` (`string`) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sortOrder` (`string`) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sortBy` (`string`) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `listWorkspaceObjectsResponse`

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.WorkspaceObjectSummary]) — Gets the items of this WorkspaceObjectCollection. List of workspace objects.

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)


### <a id="workspaceobjectclient-manageworkspaceobjectpermission"></a>`manageWorkspaceObjectPermission`
Updates permissions on a workspace object.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `objectKey` (`string`) — The key of the workspace object.
- `manageWorkspaceObjectPermissionDetails` (`oci.aidataplatform_dp.models.ManageWorkspaceObjectPermissionDetails`) — The information to be updated.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `manageWorkspaceObjectPermissionResponse`

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)


### <a id="workspaceobjectclient-moveworkspaceobject"></a>`moveWorkspaceObject`
Moves a workspace object to different location.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `moveWorkspaceObjectDetails` (`oci.aidataplatform_dp.models.MoveWorkspaceObjectDetails`) — Details for moving the workspace object to a different path.

**Optional Parameters:**
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `moveWorkspaceObjectResponse`

**Response Fields:**
- `path` (string) — Gets the path of this WorkspaceObjectDetails. The fully qualified path of the workspace object. Example: /Shared/Folder1/Notebook1.ipynb
- `key` (string) — Gets the key of this WorkspaceObjectDetails. The key of the Workspace Object.
- `displayName` (string) — Gets the display_name of this WorkspaceObjectDetails. The name of the Workspace Object. This will be the name of the file/folder in the workspace. Example: Notebook1.ipynb, Folder1
- `timeCreated` (datetime) — Gets the time_created of this WorkspaceObjectDetails. The date and time the workspace object was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `timeUpdated` (datetime) — Gets the time_updated of this WorkspaceObjectDetails. The date and time the workspace object was last updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `type` (string) — Gets the type of this WorkspaceObjectDetails. The type of the workspace object. Allowed values for this property are: "NOTEBOOK", "JOB", "LAKE_FLOW", "AGENT_LAKE_FLOW", "GENERATED_ARTIFACT", "LIBRARY", "FILE", "FOLDER", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `description` (string) — Gets the description of this WorkspaceObjectDetails. The description for the file and folder.
- `systemTags` (dict(str, dict(str, object))) — Gets the system_tags of this WorkspaceObjectDetails. System tags for this resource. Each key is predefined and scoped to a namespace. Example: `{"orcl-cloud": {"free-tier-retained": "true"}}`

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)


### <a id="workspaceobjectclient-renameworkspaceobject"></a>`renameWorkspaceObject`
Renames a workspace object.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `renameWorkspaceObjectDetails` (`oci.aidataplatform_dp.models.RenameWorkspaceObjectDetails`) — Details for renaming the workspace object.

**Optional Parameters:**
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `renameWorkspaceObjectResponse`

**Response Fields:**
- `path` (string) — Gets the path of this WorkspaceObjectDetails. The fully qualified path of the workspace object. Example: /Shared/Folder1/Notebook1.ipynb
- `key` (string) — Gets the key of this WorkspaceObjectDetails. The key of the Workspace Object.
- `displayName` (string) — Gets the display_name of this WorkspaceObjectDetails. The name of the Workspace Object. This will be the name of the file/folder in the workspace. Example: Notebook1.ipynb, Folder1
- `timeCreated` (datetime) — Gets the time_created of this WorkspaceObjectDetails. The date and time the workspace object was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `timeUpdated` (datetime) — Gets the time_updated of this WorkspaceObjectDetails. The date and time the workspace object was last updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `type` (string) — Gets the type of this WorkspaceObjectDetails. The type of the workspace object. Allowed values for this property are: "NOTEBOOK", "JOB", "LAKE_FLOW", "AGENT_LAKE_FLOW", "GENERATED_ARTIFACT", "LIBRARY", "FILE", "FOLDER", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `description` (string) — Gets the description of this WorkspaceObjectDetails. The description for the file and folder.
- `systemTags` (dict(str, dict(str, object))) — Gets the system_tags of this WorkspaceObjectDetails. System tags for this resource. Each key is predefined and scoped to a namespace. Example: `{"orcl-cloud": {"free-tier-retained": "true"}}`

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)


### <a id="workspaceobjectclient-updateworkspaceobject"></a>`updateWorkspaceObject`
Updates a workspace object with the provided information.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `objectPath` (`string`) — The fully qualified path of the workspace object.
- `updateWorkspaceObjectDetails` (`stream`) — The information to be updated.

**Optional Parameters:**
- `objectDescription` (`string`) — The description of the workspace object
- `ifMatch` (`string`) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `updateWorkspaceObjectResponse`

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)


### <a id="workspaceobjectclient-uploadworkspaceobjectwithpar"></a>`uploadWorkspaceObjectWithPar`
Creates a workspace file by generating PAR or updates the metadata by close file. If file exists, then it will be updated.

**Required Parameters:**
- `aiDataPlatformId` (`string`) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspaceKey` (`string`) — The key of the Workspace
- `uploadFileWithParDetails` (`oci.aidataplatform_dp.models.UploadFileWithParDetails`) — Contents of the file to upload.
- `path` (`string`) — The absolute path of the file or folder

**Optional Parameters:**
- `isOverwrite` (`boolean`) — A boolean which decides if overwrite is allowed
- `shouldGenerateNewPar` (`boolean`) — Flag to toggle to generate short living par
- `shouldCreateRecursively` (`boolean`) — A boolean which decides if parent directories should be created recursively during upload.
- `shouldUpdateRecent` (`boolean`) — A flag to identify if the recent list should be updated.
- `opcRetryToken` (`string`) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opcRequestId` (`string`) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `type` (`string`) — The type of workspace object.
- `objectDescription` (`string`) — The description of the workspace object
- `retryStrategy` (`obj`) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `uploadWorkspaceObjectWithParResponse`

**Response Fields:**
- `parUrl` (string) — Gets the par_url of this UploadFileWithParResult. String representing the PAR URL.
- `eTag` (string) — Gets the e_tag of this UploadFileWithParResult. Etag after creating or closing a file.
- `locationUri` (string) — Gets the location_uri of this UploadFileWithParResult. The object storage URI which has bucket and namespace information.
- `size` (number) — Gets the size of this UploadFileWithParResult. File size in bytes.
- `createdBy` (string) — Gets the created_by of this UploadFileWithParResult. The user who created the file.
- `updatedBy` (string) — Gets the updated_by of this UploadFileWithParResult. The user who last updated the file.
- `createdTime` (string) — Gets the created_time of this UploadFileWithParResult. The time at which the file was created.
- `updatedTime` (string) — Gets the updated_time of this UploadFileWithParResult. The last modified time of the file.
- `description` (string) — Gets the description of this UploadFileWithParResult. The file description.
- `systemTags` (dict(str, dict(str, object))) — Gets the system_tags of this UploadFileWithParResult. System tags for this resource. Each key is predefined and scoped to a namespace. Example: `{"orcl-cloud": {"free-tier-retained": "true"}}`

**Return:** [Back to Workspace Object (`WorkspaceObjectClient`)](#workspaceobjectclient-client) • [Top](#top)
