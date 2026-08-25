<a id="top"></a>
# AIDP Python SDK Operations Reference
This document summarizes the available service clients in the AIDP SDK and details every operation's request parameters and responses.
## Clients
- [Agent (AgentClient)](#agent-agentclient)
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
- [Semantic Catalog (SemanticCatalogClient)](#semantic-catalog-semanticcatalogclient)
- [User Setting (UserSettingClient)](#user-setting-usersettingclient)
- [Volume (VolumeClient)](#volume-volumeclient)
- [Workflow (WorkflowClient)](#workflow-workflowclient)
- [Workspace (WorkspaceClient)](#workspace-workspaceclient)
- [Workspace Object (WorkspaceObjectClient)](#workspace-object-workspaceobjectclient)

## <a id="agent-agentclient"></a>Agent (AgentClient)
**Operations:**
- [`copy_agent`](#copy-agent)
- [`create_agent`](#create-agent)
- [`delete_agent`](#delete-agent)
- [`delete_agent_deployment`](#delete-agent-deployment)
- [`delete_agent_session`](#delete-agent-session)
- [`deploy_agent`](#deploy-agent)
- [`get_agent`](#get-agent)
- [`get_agent_deployment`](#get-agent-deployment)
- [`get_agent_session`](#get-agent-session)
- [`get_agent_session_trace`](#get-agent-session-trace)
- [`list_agent_deployments`](#list-agent-deployments)
- [`list_agent_permissions`](#list-agent-permissions)
- [`list_agent_session_chat_histories`](#list-agent-session-chat-histories)
- [`list_agent_sessions`](#list-agent-sessions)
- [`list_agents`](#list-agents)
- [`manage_agent_permission`](#manage-agent-permission)
- [`preview_agent_agent_card`](#preview-agent-agent-card)
- [`redeploy_agent_by_key`](#redeploy-agent-by-key)
- [`update_agent`](#update-agent)
- [`update_agent_deployment_metadata`](#update-agent-deployment-metadata)
- [`validate_agent`](#validate-agent)

### <a id="copy-agent"></a>`copy_agent`
Copies an agent.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `agent_key` (string) — The UUID of the agent.
- `copy_agent_details` (oci.aidataplatform_dp.models.CopyAgentDetails) — Details for copying the agent.

**Optional Parameters:**
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.Agent

**Response Fields:**
- `key` (string) — Gets the key of this Agent. The unique identifier (UUID) of the agent.
- `displayName` (string) — Gets the display_name of this Agent. Agent name.
- `description` (string) — Gets the description of this Agent. Agent description.
- `pathInfo` (string) — Gets the path_info of this Agent. Path inside volume where the agent JSON is written.
- `lifecycleState` (string) — Gets the lifecycle_state of this Agent. The current state of the agent. Allowed values for this property are: "DRAFT", "DEPLOYED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.

**Optional Response Fields:**
- `workspaceKey` (string) — Gets the workspace_key of this Agent. The key of the workspace to which this agent belongs.
- `type` (string) — Gets the type of this Agent. The type of agent (Canvas or Code). Allowed values for this property are: "CANVAS", "CODE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `entryFilePath` (string) — Gets the entry_file_path of this Agent. The path to project entry file.
- `dependenciesFilePath` (string) — Gets the dependencies_file_path of this Agent. The path to dependencies file.
- `deploymentComputeKey` (string) — Gets the deployment_compute_key of this Agent. The key of the compute where agent is deployed.
- `deploymentMode` (string) — Gets the deployment_mode of this Agent. Agent deployment mode.
- `uri` (string) — Gets the uri of this Agent. Agent URI.
- `uriState` (string) — Gets the uri_state of this Agent. Agent URI state.
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

**Return:** [Back to Agent (AgentClient)](#agent-agentclient) • [Top](#top)

### <a id="create-agent"></a>`create_agent`
Creates an agent.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `create_agent_details` (oci.aidataplatform_dp.models.CreateAgentDetails) — Details for the new agent.

**Optional Parameters:**
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.Agent

**Response Fields:**
- `key` (string) — Gets the key of this Agent. The unique identifier (UUID) of the agent.
- `displayName` (string) — Gets the display_name of this Agent. Agent name.
- `description` (string) — Gets the description of this Agent. Agent description.
- `pathInfo` (string) — Gets the path_info of this Agent. Path inside volume where the agent JSON is written.
- `lifecycleState` (string) — Gets the lifecycle_state of this Agent. The current state of the agent. Allowed values for this property are: "DRAFT", "DEPLOYED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.

**Optional Response Fields:**
- `workspaceKey` (string) — Gets the workspace_key of this Agent. The key of the workspace to which this agent belongs.
- `type` (string) — Gets the type of this Agent. The type of agent (Canvas or Code). Allowed values for this property are: "CANVAS", "CODE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `entryFilePath` (string) — Gets the entry_file_path of this Agent. The path to project entry file.
- `dependenciesFilePath` (string) — Gets the dependencies_file_path of this Agent. The path to dependencies file.
- `deploymentComputeKey` (string) — Gets the deployment_compute_key of this Agent. The key of the compute where agent is deployed.
- `deploymentMode` (string) — Gets the deployment_mode of this Agent. Agent deployment mode.
- `uri` (string) — Gets the uri of this Agent. Agent URI.
- `uriState` (string) — Gets the uri_state of this Agent. Agent URI state.
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

**Return:** [Back to Agent (AgentClient)](#agent-agentclient) • [Top](#top)

### <a id="delete-agent"></a>`delete_agent`
Delete an agent from the schema.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `agent_key` (string) — The UUID of the agent.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Agent (AgentClient)](#agent-agentclient) • [Top](#top)

### <a id="delete-agent-deployment"></a>`delete_agent_deployment`
Deletes an agent deployment.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `agent_key` (string) — The UUID of the agent.
- `agent_deployment_key` (string) — The UUID of the agent deployment.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Agent (AgentClient)](#agent-agentclient) • [Top](#top)

### <a id="delete-agent-session"></a>`delete_agent_session`
Deletes an agent Session.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `agent_key` (string) — The UUID of the agent.
- `session_id` (string) — The UUID of the agent session.

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Agent (AgentClient)](#agent-agentclient) • [Top](#top)

### <a id="deploy-agent"></a>`deploy_agent`
Deploys a specified agent.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `agent_key` (string) — The UUID of the agent.
- `deploy_agent_details` (oci.aidataplatform_dp.models.DeployAgentDetails) — Details of a deployable agent.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.AgentDeployment

**Response Fields:**
- `key` (string) — Gets the key of this AgentDeployment. Identifier, generally UUID.
- `displayName` (string) — Gets the display_name of this AgentDeployment. Display name.
- `agentKey` (string) — Gets the agent_key of this AgentDeployment. The Agent key for which the session is started.
- `endpointUrl` (string) — Gets the endpoint_url of this AgentDeployment. The endpointUrl where the client should connect to communicate with the agent.
- `deploymentType` (string) — Gets the deployment_type of this AgentDeployment. Type of an agent deployment. Allowed values for this property are: "TEST", "PROD", "CODE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleState` (string) — Gets the lifecycle_state of this AgentDeployment. LifecycleState of an Agent Session or Deployment. Allowed values for this property are: "CREATING", "ACTIVE", "INACTIVE", "FAILED", "DELETED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `deploymentVersion` (string) — Gets the deployment_version of this AgentDeployment. Version of agent deployed on compute.
- `timeCreated` (datetime) — Gets the time_created of this AgentDeployment. The date and time the Agent session was created.
- `createdBy` (string) — Gets the created_by of this AgentDeployment. The OCID of the user/principal who created the agent session.

**Optional Response Fields:**
- `agentComputeKey` (string) — Gets the agent_compute_key of this AgentDeployment. The Agent Compute Key where client can run or test the agent.
- `description` (string) — Gets the description of this AgentDeployment. deployment description.
- `timeUpdated` (datetime) — Gets the time_updated of this AgentDeployment. The date and time the agent deployment was updated.
- `updatedBy` (string) — Gets the updated_by of this AgentDeployment. The OCID of the user/principal who re-deployed the existing agent deployment.
- `sessionRetentionConfig` (oci.aidataplatform_dp.models.SessionRetentionConfiguration) — Gets the session_retention_config of this AgentDeployment.
- `oAuthConfig` (oci.aidataplatform_dp.models.OAuthConfiguration) — Gets the o_auth_config of this AgentDeployment.
- `agentCardUrl` (string) — Gets the agent_card_url of this AgentDeployment. AgentCard base URL.

**Return:** [Back to Agent (AgentClient)](#agent-agentclient) • [Top](#top)

### <a id="get-agent"></a>`get_agent`
Returns detailed information about an agent.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `agent_key` (string) — The UUID of the agent.

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.Agent

**Response Fields:**
- `key` (string) — Gets the key of this Agent. The unique identifier (UUID) of the agent.
- `displayName` (string) — Gets the display_name of this Agent. Agent name.
- `description` (string) — Gets the description of this Agent. Agent description.
- `pathInfo` (string) — Gets the path_info of this Agent. Path inside volume where the agent JSON is written.
- `lifecycleState` (string) — Gets the lifecycle_state of this Agent. The current state of the agent. Allowed values for this property are: "DRAFT", "DEPLOYED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.

**Optional Response Fields:**
- `workspaceKey` (string) — Gets the workspace_key of this Agent. The key of the workspace to which this agent belongs.
- `type` (string) — Gets the type of this Agent. The type of agent (Canvas or Code). Allowed values for this property are: "CANVAS", "CODE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `entryFilePath` (string) — Gets the entry_file_path of this Agent. The path to project entry file.
- `dependenciesFilePath` (string) — Gets the dependencies_file_path of this Agent. The path to dependencies file.
- `deploymentComputeKey` (string) — Gets the deployment_compute_key of this Agent. The key of the compute where agent is deployed.
- `deploymentMode` (string) — Gets the deployment_mode of this Agent. Agent deployment mode.
- `uri` (string) — Gets the uri of this Agent. Agent URI.
- `uriState` (string) — Gets the uri_state of this Agent. Agent URI state.
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

**Return:** [Back to Agent (AgentClient)](#agent-agentclient) • [Top](#top)

### <a id="get-agent-deployment"></a>`get_agent_deployment`
Returns detailed information about an agent deployment.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `agent_key` (string) — The UUID of the agent.
- `agent_deployment_key` (string) — The UUID of the agent deployment.

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.AgentDeployment

**Response Fields:**
- `key` (string) — Gets the key of this AgentDeployment. Identifier, generally UUID.
- `displayName` (string) — Gets the display_name of this AgentDeployment. Display name.
- `agentKey` (string) — Gets the agent_key of this AgentDeployment. The Agent key for which the session is started.
- `endpointUrl` (string) — Gets the endpoint_url of this AgentDeployment. The endpointUrl where the client should connect to communicate with the agent.
- `deploymentType` (string) — Gets the deployment_type of this AgentDeployment. Type of an agent deployment. Allowed values for this property are: "TEST", "PROD", "CODE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleState` (string) — Gets the lifecycle_state of this AgentDeployment. LifecycleState of an Agent Session or Deployment. Allowed values for this property are: "CREATING", "ACTIVE", "INACTIVE", "FAILED", "DELETED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `deploymentVersion` (string) — Gets the deployment_version of this AgentDeployment. Version of agent deployed on compute.
- `timeCreated` (datetime) — Gets the time_created of this AgentDeployment. The date and time the Agent session was created.
- `createdBy` (string) — Gets the created_by of this AgentDeployment. The OCID of the user/principal who created the agent session.

**Optional Response Fields:**
- `agentComputeKey` (string) — Gets the agent_compute_key of this AgentDeployment. The Agent Compute Key where client can run or test the agent.
- `description` (string) — Gets the description of this AgentDeployment. deployment description.
- `timeUpdated` (datetime) — Gets the time_updated of this AgentDeployment. The date and time the agent deployment was updated.
- `updatedBy` (string) — Gets the updated_by of this AgentDeployment. The OCID of the user/principal who re-deployed the existing agent deployment.
- `sessionRetentionConfig` (oci.aidataplatform_dp.models.SessionRetentionConfiguration) — Gets the session_retention_config of this AgentDeployment.
- `oAuthConfig` (oci.aidataplatform_dp.models.OAuthConfiguration) — Gets the o_auth_config of this AgentDeployment.
- `agentCardUrl` (string) — Gets the agent_card_url of this AgentDeployment. AgentCard base URL.

**Return:** [Back to Agent (AgentClient)](#agent-agentclient) • [Top](#top)

### <a id="get-agent-session"></a>`get_agent_session`
Returns detailed information about an agent session.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `agent_key` (string) — The UUID of the agent.
- `session_id` (string) — The UUID of the agent session.

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.AgentSession

**Response Fields:**
- `displayName` (string) — Gets the display_name of this AgentSession. Display name.
- `key` (string) — Gets the key of this AgentSession. Agent Session identifier.
- `agentKey` (string) — Gets the agent_key of this AgentSession. The Agent key for which the session is started.
- `endpointUrl` (string) — Gets the endpoint_url of this AgentSession. The endpointUrl where the client should connect to communicate with the agent.
- `lifecycleState` (string) — Gets the lifecycle_state of this AgentSession. LifecycleState of an Agent Session or Deployment. Allowed values for this property are: "CREATING", "ACTIVE", "INACTIVE", "FAILED", "DELETED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `agentComputeKey` (string) — Gets the agent_compute_key of this AgentSession. The Agent Compute Key where client can run or test the agent.

**Optional Response Fields:**
- `timeCreated` (datetime) — Gets the time_created of this AgentSession. The date and time the Agent session was created.
- `updatedBy` (string) — Gets the updated_by of this AgentSession. OCID of the user who updated this record
- `createdBy` (string) — Gets the created_by of this AgentSession. The OCID of the user/principal who created the agent session.
- `timeUpdated` (datetime) — Gets the time_updated of this AgentSession. The date and time the Agent session was updated.
- `timeStarted` (datetime) — Gets the time_started of this AgentSession. The date and time the session was started.
- `timeEnded` (datetime) — Gets the time_ended of this AgentSession. The date and time the session was ended.
- `context` (oci.aidataplatform_dp.models.AgentSessionContext) — Gets the context of this AgentSession.

**Return:** [Back to Agent (AgentClient)](#agent-agentclient) • [Top](#top)

### <a id="get-agent-session-trace"></a>`get_agent_session_trace`
Returns trace details for a given message key.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `agent_key` (string) — The UUID of the agent.
- `session_id` (string) — The UUID of the agent session.
- `trace_key` (string) — A filter to return only resources that match the given display trace key exactly.

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.TraceDetails

**Response Fields:**
- `traceId` (string) — Gets the trace_id of this TraceDetails. trace id
- `parentSessionId` (string) — Gets the parent_session_id of this TraceDetails. session id
- `spans` (list[oci.aidataplatform_dp.models.SpanDetails]) — Gets the spans of this TraceDetails. collections of spans
- `startTime` (number) — Gets the start_time of this TraceDetails. startTime
- `endTime` (number) — Gets the end_time of this TraceDetails. endTime

**Optional Response Fields:**
- `resources` (dict(str, object)) — Gets the resources of this TraceDetails. Map of properties

**Return:** [Back to Agent (AgentClient)](#agent-agentclient) • [Top](#top)

### <a id="list-agent-deployments"></a>`list_agent_deployments`
Returns a list of all deployments of an agent.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `agent_key` (string) — The UUID of the agent.

**Optional Parameters:**
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `display_name` (string) — A filter to return only resources that match the given display name exactly.
- `display_name_contains` (string) — A filter to return only resources that have a display name containing the text provided.
- `lifecycle_state` (list[str]) — A filter to return only resources whose value matches the given lifecycleState. Allowed values are: "CREATING", "ACTIVE", "INACTIVE", "FAILED", "DELETED"
- `time_created_greater_than_or_equal_to` (datetime) — Fetch objects from repository that were created after or at the exact timestamp provided in parameter
- `time_created_less_than_or_equal_to` (datetime) — Fetch objects from repository that were created before or at the exact timestamp provided in parameter.
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `compute_key` (list[str]) — Compute key.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.AgentDeploymentCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.AgentDeploymentSummary]) — Gets the items of this AgentDeploymentCollection. List of agent deployments.

**Return:** [Back to Agent (AgentClient)](#agent-agentclient) • [Top](#top)

### <a id="list-agent-permissions"></a>`list_agent_permissions`
Returns a list of permissions for a given agent.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `agent_key` (string) — The UUID of the agent.

**Optional Parameters:**
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.AgentPermissionCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.AgentPermissionSummary]) — Gets the items of this AgentPermissionCollection. List of agent permissions.

**Return:** [Back to Agent (AgentClient)](#agent-agentclient) • [Top](#top)

### <a id="list-agent-session-chat-histories"></a>`list_agent_session_chat_histories`
Returns list of agent session chat messages.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `agent_key` (string) — The UUID of the agent.
- `session_id` (string) — The UUID of the agent session.

**Optional Parameters:**
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.SessionChatHistoryCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.SessionChatHistorySummary]) — Gets the items of this SessionChatHistoryCollection. Collection of chat messages

**Return:** [Back to Agent (AgentClient)](#agent-agentclient) • [Top](#top)

### <a id="list-agent-sessions"></a>`list_agent_sessions`
Returns a list of testing sessions of an agent.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `agent_key` (string) — The UUID of the agent.

**Optional Parameters:**
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `display_name_contains` (string) — A filter to return only resources that have a display name containing the text provided.
- `time_created_greater_than_or_equal_to` (datetime) — Fetch objects from repository that were created after or at the exact timestamp provided in parameter
- `time_created_less_than_or_equal_to` (datetime) — Fetch objects from repository that were created before or at the exact timestamp provided in parameter.
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.AgentSessionCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.AgentSessionSummary]) — Gets the items of this AgentSessionCollection. List of agent sessions.

**Return:** [Back to Agent (AgentClient)](#agent-agentclient) • [Top](#top)

### <a id="list-agents"></a>`list_agents`
Returns a list of agents in a schema.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace

**Optional Parameters:**
- `compute_key` (string) — Compute key.
- `display_name` (string) — A filter to return only resources that match the given display name exactly.
- `display_name_contains` (string) — A filter to return only resources that have a display name containing the text provided.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.AgentCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.AgentInfo]) — Gets the items of this AgentCollection. List of Agents.

**Return:** [Back to Agent (AgentClient)](#agent-agentclient) • [Top](#top)

### <a id="manage-agent-permission"></a>`manage_agent_permission`
Update the permissions for a given agent.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `agent_key` (string) — The UUID of the agent.
- `manage_agent_permission_details` (oci.aidataplatform_dp.models.ManageAgentPermissionDetails) — The information to be updated.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Agent (AgentClient)](#agent-agentclient) • [Top](#top)

### <a id="preview-agent-agent-card"></a>`preview_agent_agent_card`
Returns the agent card based on the given agent card configuration.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `preview_agent_card_details` (oci.aidataplatform_dp.models.PreviewAgentCardDetails) — Request details for previewing an agent card.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.AgentCardPreviewResponse

**Response Fields:**
- `agentCardJson` (string) — Gets the agent_card_json of this AgentCardPreviewResponse. JSON string representation of AgentCard

**Return:** [Back to Agent (AgentClient)](#agent-agentclient) • [Top](#top)

### <a id="redeploy-agent-by-key"></a>`redeploy_agent_by_key`
Redeploys an agent.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `agent_key` (string) — The UUID of the agent.
- `update_agent_deployment_details` (oci.aidataplatform_dp.models.UpdateAgentDeploymentDetails) — Details for updating an agent deployment asynchronously.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.AgentDeployment

**Response Fields:**
- `key` (string) — Gets the key of this AgentDeployment. Identifier, generally UUID.
- `displayName` (string) — Gets the display_name of this AgentDeployment. Display name.
- `agentKey` (string) — Gets the agent_key of this AgentDeployment. The Agent key for which the session is started.
- `endpointUrl` (string) — Gets the endpoint_url of this AgentDeployment. The endpointUrl where the client should connect to communicate with the agent.
- `deploymentType` (string) — Gets the deployment_type of this AgentDeployment. Type of an agent deployment. Allowed values for this property are: "TEST", "PROD", "CODE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleState` (string) — Gets the lifecycle_state of this AgentDeployment. LifecycleState of an Agent Session or Deployment. Allowed values for this property are: "CREATING", "ACTIVE", "INACTIVE", "FAILED", "DELETED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `deploymentVersion` (string) — Gets the deployment_version of this AgentDeployment. Version of agent deployed on compute.
- `timeCreated` (datetime) — Gets the time_created of this AgentDeployment. The date and time the Agent session was created.
- `createdBy` (string) — Gets the created_by of this AgentDeployment. The OCID of the user/principal who created the agent session.

**Optional Response Fields:**
- `agentComputeKey` (string) — Gets the agent_compute_key of this AgentDeployment. The Agent Compute Key where client can run or test the agent.
- `description` (string) — Gets the description of this AgentDeployment. deployment description.
- `timeUpdated` (datetime) — Gets the time_updated of this AgentDeployment. The date and time the agent deployment was updated.
- `updatedBy` (string) — Gets the updated_by of this AgentDeployment. The OCID of the user/principal who re-deployed the existing agent deployment.
- `sessionRetentionConfig` (oci.aidataplatform_dp.models.SessionRetentionConfiguration) — Gets the session_retention_config of this AgentDeployment.
- `oAuthConfig` (oci.aidataplatform_dp.models.OAuthConfiguration) — Gets the o_auth_config of this AgentDeployment.
- `agentCardUrl` (string) — Gets the agent_card_url of this AgentDeployment. AgentCard base URL.

**Return:** [Back to Agent (AgentClient)](#agent-agentclient) • [Top](#top)

### <a id="update-agent"></a>`update_agent`
Updates an agent with provided details.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `agent_key` (string) — The UUID of the agent.
- `update_agent_details` (oci.aidataplatform_dp.models.UpdateAgentDetails) — The information to be updated.

**Optional Parameters:**
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.Agent

**Response Fields:**
- `key` (string) — Gets the key of this Agent. The unique identifier (UUID) of the agent.
- `displayName` (string) — Gets the display_name of this Agent. Agent name.
- `description` (string) — Gets the description of this Agent. Agent description.
- `pathInfo` (string) — Gets the path_info of this Agent. Path inside volume where the agent JSON is written.
- `lifecycleState` (string) — Gets the lifecycle_state of this Agent. The current state of the agent. Allowed values for this property are: "DRAFT", "DEPLOYED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.

**Optional Response Fields:**
- `workspaceKey` (string) — Gets the workspace_key of this Agent. The key of the workspace to which this agent belongs.
- `type` (string) — Gets the type of this Agent. The type of agent (Canvas or Code). Allowed values for this property are: "CANVAS", "CODE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `entryFilePath` (string) — Gets the entry_file_path of this Agent. The path to project entry file.
- `dependenciesFilePath` (string) — Gets the dependencies_file_path of this Agent. The path to dependencies file.
- `deploymentComputeKey` (string) — Gets the deployment_compute_key of this Agent. The key of the compute where agent is deployed.
- `deploymentMode` (string) — Gets the deployment_mode of this Agent. Agent deployment mode.
- `uri` (string) — Gets the uri of this Agent. Agent URI.
- `uriState` (string) — Gets the uri_state of this Agent. Agent URI state.
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

**Return:** [Back to Agent (AgentClient)](#agent-agentclient) • [Top](#top)

### <a id="update-agent-deployment-metadata"></a>`update_agent_deployment_metadata`
Updates the deployment metadata for an agent.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `agent_key` (string) — The UUID of the agent.
- `update_agent_deployment_metadata_details` (oci.aidataplatform_dp.models.UpdateAgentDeploymentMetadataDetails) — Agent card details to update.

**Optional Parameters:**
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.AgentDeployment

**Response Fields:**
- `key` (string) — Gets the key of this AgentDeployment. Identifier, generally UUID.
- `displayName` (string) — Gets the display_name of this AgentDeployment. Display name.
- `agentKey` (string) — Gets the agent_key of this AgentDeployment. The Agent key for which the session is started.
- `endpointUrl` (string) — Gets the endpoint_url of this AgentDeployment. The endpointUrl where the client should connect to communicate with the agent.
- `deploymentType` (string) — Gets the deployment_type of this AgentDeployment. Type of an agent deployment. Allowed values for this property are: "TEST", "PROD", "CODE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleState` (string) — Gets the lifecycle_state of this AgentDeployment. LifecycleState of an Agent Session or Deployment. Allowed values for this property are: "CREATING", "ACTIVE", "INACTIVE", "FAILED", "DELETED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `deploymentVersion` (string) — Gets the deployment_version of this AgentDeployment. Version of agent deployed on compute.
- `timeCreated` (datetime) — Gets the time_created of this AgentDeployment. The date and time the Agent session was created.
- `createdBy` (string) — Gets the created_by of this AgentDeployment. The OCID of the user/principal who created the agent session.

**Optional Response Fields:**
- `agentComputeKey` (string) — Gets the agent_compute_key of this AgentDeployment. The Agent Compute Key where client can run or test the agent.
- `description` (string) — Gets the description of this AgentDeployment. deployment description.
- `timeUpdated` (datetime) — Gets the time_updated of this AgentDeployment. The date and time the agent deployment was updated.
- `updatedBy` (string) — Gets the updated_by of this AgentDeployment. The OCID of the user/principal who re-deployed the existing agent deployment.
- `sessionRetentionConfig` (oci.aidataplatform_dp.models.SessionRetentionConfiguration) — Gets the session_retention_config of this AgentDeployment.
- `oAuthConfig` (oci.aidataplatform_dp.models.OAuthConfiguration) — Gets the o_auth_config of this AgentDeployment.
- `agentCardUrl` (string) — Gets the agent_card_url of this AgentDeployment. AgentCard base URL.

**Return:** [Back to Agent (AgentClient)](#agent-agentclient) • [Top](#top)

### <a id="validate-agent"></a>`validate_agent`
Validates the agent JSON diagram generated by UI.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `agent_key` (string) — The UUID of the agent.

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.ValidateAgentResponse

**Response Fields:**
- `isValidAgent` (boolean) — Gets the is_valid_agent of this ValidateAgentResponse. true if valid, else false

**Optional Response Fields:**
- `validationError` (list[oci.aidataplatform_dp.models.ValidationError]) — Gets the validation_error of this ValidateAgentResponse. List of validation errors encountered in the diagram.

**Return:** [Back to Agent (AgentClient)](#agent-agentclient) • [Top](#top)

## <a id="async-operations-asyncoperationsclient"></a>Async Operations (AsyncOperationsClient)
**Operations:**
- [`get_async_operation`](#get-async-operation)
- [`list_async_operations`](#list-async-operations)

### <a id="get-async-operation"></a>`get_async_operation`
Get detailed information for a particular async operation

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `async_operation_key` (string) — The unique identifier of an async operation

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.AsyncOperation

**Response Fields:**
- `key` (string) — Gets the key of this AsyncOperation. The unique key that identifies an async operation
- `resourceType` (string) — Gets the resource_type of this AsyncOperation. The resource type of the async operation. Allowed values for this property are: "UNKNOWN", "CATALOG", "SCHEMA", "TABLE", "VIEW", "VOLUME", "VOLUME_FILE", "WORKSPACE", "WORKSPACE_OBJECT", "CLUSTER", "AI_COMPUTE", "KNOWLEDGE_BASE", "KNOWLEDGE_BASE_JOB", "KNOWLEDGE_BASE_JOB_RUN", "AGENT", "GIT_OPERATION", "BUNDLE_OPERATION", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `actionType` (string) — Gets the action_type of this AsyncOperation. The action type of the async operation. Allowed values for this property are: "UNKNOWN", "CREATE_CATALOG", "UPDATE_CATALOG", "DELETE_CATALOG", "TEST_CONNECTION_CATALOG", "CREATE_USER_SCHEMA_IN_CATALOG", "CREATE_SCHEMA", "DELETE_SCHEMA", "CREATE_TABLE", "UPDATE_TABLE", "DELETE_TABLE", "CREATE_VOLUME", "DELETE_VOLUME", "COPY_VOLUME_FILE", "UPLOAD_AND_EXTRACT_ZIP", "ZIP_AND_DOWNLOAD_FOLDER", "MOVE_VOLUME_FILE", "DELETE_VOLUME_FILE", "DELETE_VOLUME_FOLDER", "LOAD_MODELS_IN_CATALOG", "CREATE_WORKSPACE", "UPDATE_WORKSPACE", "DELETE_WORKSPACE", "CREATE_CLUSTER", "UPDATE_CLUSTER", "START_CLUSTER", "STOP_CLUSTER", "RESTART_CLUSTER", "PATCH_CLUSTER_LIBRARIES", "DELETE_CLUSTER", "MANAGE_EXTRACTED_ENTITIES", "REFRESH_ENTITY", "DOWNLOAD_CLUSTER_LOG", "MIGRATE_EXTERNAL_CATALOG", "UPDATE_KNOWLEDGE_BASE", "DELETE_KNOWLEDGE_BASE", "CREATE_KNOWLEDGE_BASE", "DELETE_KNOWLEDGE_BASE_JOB", "CREATE_KNOWLEDGE_BASE_JOB", "CREATE_KNOWLEDGE_BASE_JOB_RUN", "DEPLOY_AGENT", "CREATE_GIT_FOLDER", "UPDATE_GIT_REPOSITORY", "CREATE_BUNDLE", "BUNDLE_DEPLOY", "BUNDLE_PURGE", "BUNDLE_SYNC", "MARK_AS_BUNDLE", "GIT_COMMIT_PUSH", "GIT_CREATE_BRANCH", "GIT_CHECKOUT_BRANCH", "GIT_OPERATION_PULL", "GIT_OPERATION_MERGE", "GIT_OPERATION_REBASE", "GIT_OPERATION_RESET", "GIT_OPERATION_RESET_STATE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `resourceName` (string) — Gets the resource_name of this AsyncOperation. The fully qualified name of the Data Lake resource. Example: For table, it is <catalog_name>.<schema_name>.<table_name>. For Cluster, it is <workspace_key>.<cluster_key>
- `timeStarted` (datetime) — Gets the time_started of this AsyncOperation. The date and time the Async operation was started, in the format defined by `RFC 3339`. Example: `2016-08-25T21:10:29.600Z`  https://tools.ietf.org/html/rfc3339
- `status` (string) — Gets the status of this AsyncOperation. The state of the Table. Allowed values for this property are: "IN_PROGRESS", "SUCCEEDED", "FAILED", "CANCELED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.

**Optional Response Fields:**
- `resourceDisplayName` (string) — Gets the resource_display_name of this AsyncOperation. The display name of the Data Lake resource. Example: For catalog/table/schema, it is same as resourceName But for workspace/cluster it is workspace and cluster displayName field.
- `createdBy` (string) — Gets the created_by of this AsyncOperation. The principal Id who started the async operation
- `createdByName` (string) — Gets the created_by_name of this AsyncOperation. The principal name who started the async operation
- `timeFinished` (datetime) — Gets the time_finished of this AsyncOperation. The date and time the Async operation finished, in the format defined by `RFC 3339`. Example: `2016-08-25T21:10:29.600Z`  https://tools.ietf.org/html/rfc3339
- `statusDetails` (string) — Gets the status_details of this AsyncOperation. status details
- `errorCode` (string) — Gets the error_code of this AsyncOperation. Represents the error code of a failure
- `errorMessage` (string) — Gets the error_message of this AsyncOperation. Representss extra error information of a failure

**Return:** [Back to Async Operations (AsyncOperationsClient)](#async-operations-asyncoperationsclient) • [Top](#top)

### <a id="list-async-operations"></a>`list_async_operations`
List all async operations for a resource type. Filters can be used to narrow the search down.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

**Optional Parameters:**
- `resource_type` (string) — Required parameter which decides async operation resource type
- `resource_name` (string) — A filter to return only resources that match the given resource name exactly.
- `match_resource_name` (boolean) — Parameter which decides to list async operations with prefix or exact match to resourceName
- `status` (string) — Option parameter to filter operation on status
- `should_filter_by_calling_principal` (boolean) — A filter to return only resources that match the current principal.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for `timeStarted` is descending. Allowed values are: "timeStarted"
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.AsyncOperationCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.AsyncOperationSummary]) — Gets the items of this AsyncOperationCollection. List of Async Operations.

**Return:** [Back to Async Operations (AsyncOperationsClient)](#async-operations-asyncoperationsclient) • [Top](#top)

## <a id="audit-auditclient"></a>Audit (AuditClient)
**Operations:**
- [`manage_audit_logs`](#manage-audit-logs)
- [`search_audit_logs`](#search-audit-logs)

### <a id="manage-audit-logs"></a>`manage_audit_logs`
Manages audit logs.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `manage_audit_logs_details` (oci.aidataplatform_dp.models.ManageAuditLogsDetails) — Details to update in an audit log.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Audit (AuditClient)](#audit-auditclient) • [Top](#top)

### <a id="search-audit-logs"></a>`search_audit_logs`
Searches audit logs.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `search_audit_logs_details` (oci.aidataplatform_dp.models.SearchAuditLogsDetails) — Details for the audit log search.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.AuditLogSearchResultCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.AuditLogSearchResultSummary]) — Gets the items of this AuditLogSearchResultCollection. Audit log search results.

**Return:** [Back to Audit (AuditClient)](#audit-auditclient) • [Top](#top)

## <a id="bundle-bundleclient"></a>Bundle (BundleClient)
**Operations:**
- [`create_bundle`](#create-bundle)
- [`create_bundle_action`](#create-bundle-action)
- [`deploy_bundle`](#deploy-bundle)
- [`deploy_bundle_action`](#deploy-bundle-action)
- [`fetch_bundle_deployment_status`](#fetch-bundle-deployment-status)
- [`fetch_bundle_deployment_status_action`](#fetch-bundle-deployment-status-action)
- [`fetch_bundle_publish_status_action`](#fetch-bundle-publish-status-action)
- [`publish_bundle_action`](#publish-bundle-action)
- [`purge_bundle`](#purge-bundle)
- [`purge_bundle_action`](#purge-bundle-action)
- [`sync_bundle`](#sync-bundle)
- [`sync_bundle_action`](#sync-bundle-action)

### <a id="create-bundle"></a>`create_bundle`
(Deprecated)

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `create_bundle_details` (oci.aidataplatform_dp.models.CreateBundleDetails) — Request payload for bundle creation.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Bundle (BundleClient)](#bundle-bundleclient) • [Top](#top)

### <a id="create-bundle-action"></a>`create_bundle_action`
(Preview) Creates a new bundle. This operation is asynchronous. The service validates the request, starts bundle creation, and returns an async operation key in the response headers. Use the async operation APIs to track completion. Typical use cases: - capture selected workspace resources into a version-controlled bundle - prepare a bundle for later deployment or promotion - establish a bundle root that can later be inspected, updated, or deployed Request notes: - `path` identifies the parent folder in the workspace volume where the bundle should be created - `name` identifies the bundle folder name - `bundledResources` identifies which workspace resources should be included

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `create_bundle_details` (oci.aidataplatform_dp.models.CreateBundleDetails) — Request payload for bundle creation.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Bundle (BundleClient)](#bundle-bundleclient) • [Top](#top)

### <a id="deploy-bundle"></a>`deploy_bundle`
(Deprecated)

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `deploy_bundle_details` (oci.aidataplatform_dp.models.DeployBundleDetails) — Request payload for bundle deploy.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Bundle (BundleClient)](#bundle-bundleclient) • [Top](#top)

### <a id="deploy-bundle-action"></a>`deploy_bundle_action`
Deprecated compatibility API. Use `publish` for new callers.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `deploy_bundle_details` (oci.aidataplatform_dp.models.DeployBundleDetails) — Request payload for bundle deploy.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Bundle (BundleClient)](#bundle-bundleclient) • [Top](#top)

### <a id="fetch-bundle-deployment-status"></a>`fetch_bundle_deployment_status`
(Deprecated)

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `fetch_bundle_deployment_status_details` (oci.aidataplatform_dp.models.FetchBundleDeploymentStatusDetails) — Request payload for FetchBundleDeploymentStatusDetails.

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.BundleDeploymentStatus

**Response Fields:**
- `status` (string) — Gets the status of this BundleDeploymentStatus. Overall status of the last deployment. Allowed values for this property are: "SUCCEEDED", "FAILED", "IN_PROGRESS", "NOT_DEPLOYED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `timeStarted` (datetime) — Gets the time_started of this BundleDeploymentStatus. The deployment start time
- `timeCompleted` (datetime) — Gets the time_completed of this BundleDeploymentStatus. The deployment end time

**Optional Response Fields:**
- `message` (string) — Gets the message of this BundleDeploymentStatus. Optional summary message for the last deployment.
- `publish` (oci.aidataplatform_dp.models.BundlePublishLocation) — Gets the publish of this BundleDeploymentStatus.
- `resources` (list[oci.aidataplatform_dp.models.BundleDeployedResource]) — Gets the resources of this BundleDeploymentStatus. List of resources from the last deployment.

**Return:** [Back to Bundle (BundleClient)](#bundle-bundleclient) • [Top](#top)

### <a id="fetch-bundle-deployment-status-action"></a>`fetch_bundle_deployment_status_action`
Deprecated compatibility API. Use `getBundlePublishStatus` for new callers.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `fetch_bundle_deployment_status_details` (oci.aidataplatform_dp.models.FetchBundleDeploymentStatusDetails) — Request payload for FetchBundleDeploymentStatusDetails.

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.BundleDeploymentStatus

**Response Fields:**
- `status` (string) — Gets the status of this BundleDeploymentStatus. Overall status of the last deployment. Allowed values for this property are: "SUCCEEDED", "FAILED", "IN_PROGRESS", "NOT_DEPLOYED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `timeStarted` (datetime) — Gets the time_started of this BundleDeploymentStatus. The deployment start time
- `timeCompleted` (datetime) — Gets the time_completed of this BundleDeploymentStatus. The deployment end time

**Optional Response Fields:**
- `message` (string) — Gets the message of this BundleDeploymentStatus. Optional summary message for the last deployment.
- `publish` (oci.aidataplatform_dp.models.BundlePublishLocation) — Gets the publish of this BundleDeploymentStatus.
- `resources` (list[oci.aidataplatform_dp.models.BundleDeployedResource]) — Gets the resources of this BundleDeploymentStatus. List of resources from the last deployment.

**Return:** [Back to Bundle (BundleClient)](#bundle-bundleclient) • [Top](#top)

### <a id="fetch-bundle-publish-status-action"></a>`fetch_bundle_publish_status_action`
(Preview) Returns the latest publish summary.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `fetch_bundle_publish_status_details` (oci.aidataplatform_dp.models.FetchBundlePublishStatusDetails) — Publish status request.

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.BundlePublishStatus

**Response Fields:**
- `status` (string) — Gets the status of this BundlePublishStatus. Publish status. Allowed values for this property are: "SUCCEEDED", "FAILED", "IN_PROGRESS", "NOT_PUBLISHED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `timeStarted` (datetime) — Gets the time_started of this BundlePublishStatus. Publish start time.
- `timeCompleted` (datetime) — Gets the time_completed of this BundlePublishStatus. Publish end time.

**Optional Response Fields:**
- `message` (string) — Gets the message of this BundlePublishStatus. Publish summary.
- `publish` (oci.aidataplatform_dp.models.BundlePublishLocation) — Gets the publish of this BundlePublishStatus.
- `resources` (list[oci.aidataplatform_dp.models.BundlePublishedResource]) — Gets the resources of this BundlePublishStatus. Published resources.

**Return:** [Back to Bundle (BundleClient)](#bundle-bundleclient) • [Top](#top)

### <a id="publish-bundle-action"></a>`publish_bundle_action`
(Preview) Publishes the specified bundle, creating or updating jobs and agent flows according to the bundle manifest. Returns an async job key for tracking publish progress. This operation is asynchronous. The request is accepted for background execution and returns an async operation key in the response headers. Publishing typically uses: - the bundle manifest at the bundle root - top-level resource descriptors in the bundle - dependency descriptors referenced by those top-level resources - default or override variable values when present Use this operation when you want to apply the bundle contents into the target workspace state. Request notes: - `path` identifies the bundle root folder in the workspace volume

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `publish_bundle_details` (oci.aidataplatform_dp.models.PublishBundleDetails) — Request payload for bundle publish.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Bundle (BundleClient)](#bundle-bundleclient) • [Top](#top)

### <a id="purge-bundle"></a>`purge_bundle`
(Deprecated)

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `purge_bundle_details` (oci.aidataplatform_dp.models.PurgeBundleDetails) — Request payload for bundle purge.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Bundle (BundleClient)](#bundle-bundleclient) • [Top](#top)

### <a id="purge-bundle-action"></a>`purge_bundle_action`
(Preview) Tears down all resources deployed by the specified bundle in the workspace. This operation is intended to tear down resources that were created or managed through bundle deployment. It does not delete the bundle files themselves from the workspace volume. This operation is asynchronous. The service accepts the purge request, starts the background teardown workflow, and returns async operation headers. Typical use cases: - remove resources that were previously deployed from a bundle - clean up a workspace before re-deploying or retiring a bundle Request notes: - `path` identifies the bundle root folder in the workspace volume

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `purge_bundle_details` (oci.aidataplatform_dp.models.PurgeBundleDetails) — Request payload for bundle purge.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Bundle (BundleClient)](#bundle-bundleclient) • [Top](#top)

### <a id="sync-bundle"></a>`sync_bundle`
(Deprecated)

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `sync_bundle_details` (oci.aidataplatform_dp.models.SyncBundleDetails) — Request payload for bundle sync.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Bundle (BundleClient)](#bundle-bundleclient) • [Top](#top)

### <a id="sync-bundle-action"></a>`sync_bundle_action`
(Preview) Synchronizes the code, descriptors, and mapping in the bundle by reconciling the contents with the resource origins. Returns an async job key for tracking sync progress. This operation is intended for cases where the bundle should be refreshed to reflect newer source changes while preserving the bundle structure and identity. This operation is asynchronous and returns async operation headers when accepted. Typical use cases: - refresh bundle contents after upstream workspace resources have changed - reconcile descriptor or artifact content with current resource origins - preserve local bundle overrides while pulling in source resource updates - keep a bundle current before promoting it Request notes: - `path` identifies the bundle root folder in the workspace volume - the bundle must contain a valid `aidp_workbench.yaml` - the bundle must contain `.aidp/resource_origins.yaml` - origin metadata must refer to the same AIDP/Data Lake and workspace as the request

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `sync_bundle_details` (oci.aidataplatform_dp.models.SyncBundleDetails) — Request payload for bundle sync.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Bundle (BundleClient)](#bundle-bundleclient) • [Top](#top)

## <a id="catalog-catalogclient"></a>Catalog (CatalogClient)
**Operations:**
- [`catalog_test_connection`](#catalog-test-connection)
- [`create_catalog`](#create-catalog)
- [`delete_catalog`](#delete-catalog)
- [`get_catalog`](#get-catalog)
- [`list_catalog_permissions`](#list-catalog-permissions)
- [`list_catalogs`](#list-catalogs)
- [`manage_catalog_permission`](#manage-catalog-permission)
- [`refresh_catalog`](#refresh-catalog)
- [`update_catalog`](#update-catalog)

### <a id="catalog-test-connection"></a>`catalog_test_connection`
Tests the connection to an external catalog.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `catalog_test_connection_details` (oci.aidataplatform_dp.models.CatalogTestConnectionDetails) — Details for the AI Data Platform Workbench catalog to be tested for connection.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Catalog (CatalogClient)](#catalog-catalogclient) • [Top](#top)

### <a id="create-catalog"></a>`create_catalog`
Creates a catalog with the given ID.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `create_catalog_details` (oci.aidataplatform_dp.models.CreateCatalogDetails) — Details for the new AI Data Platform Workbench catalog.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Catalog (CatalogClient)](#catalog-catalogclient) • [Top](#top)

### <a id="delete-catalog"></a>`delete_catalog`
Deletes the specified catalog.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `catalog_key` (string) — The key of the catalog.

**Optional Parameters:**
- `is_forced` (boolean) — A boolean which decides if an entity should be deleted with Cascade effect
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Catalog (CatalogClient)](#catalog-catalogclient) • [Top](#top)

### <a id="get-catalog"></a>`get_catalog`
Gets detailed information about a catalog with a given catalog key.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `catalog_key` (string) — The key of the catalog.

**Optional Parameters:**
- `is_catalog_guid` (boolean) — A boolean which decides if catalogKey path parameter is catalog GUID (UUID) or name.
- `should_skip_ocid_translation` (boolean) — When true, skip user OCID translation and return raw OCIDs.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.Catalog

**Response Fields:**
- `key` (string) — Gets the key of this Catalog. The AI Data Platform Workbench catalog key.
- `displayName` (string) — Gets the display_name of this Catalog. Catalog display name.
- `timeCreated` (datetime) — Gets the time_created of this Catalog. The date and time the AI Data Platform Workbench catalog was created.

**Optional Response Fields:**
- `description` (string) — Gets the description of this Catalog. Short description of the catalog.
- `catalogGuid` (string) — Gets the catalog_guid of this Catalog. Unique identifier for catalog.
- `catalogType` (string) — Gets the catalog_type of this Catalog. Type of catalog. Allowed values for this property are: "EXTERNAL", "INTERNAL", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `sourceType` (string) — Gets the source_type of this Catalog. External catalog source type. Allowed values for this property are: "ADW", "ALH", "KAFKA", "ATP", "ORACLE", "EXADATA", "MYSQL", "AZURE_SQLSERVER", "SNOWFLAKE", "DB2", "ORACLE_ANALYTICS", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `connectionDetails` (oci.aidataplatform_dp.models.CatalogConnectionDetails) — Gets the connection_details of this Catalog.
- `lifecycleState` (string) — Gets the lifecycle_state of this Catalog. The current status of the catalog. Allowed values for this property are: "ACTIVE", "CREATING", "DELETING", "UPDATING", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleStateDetails` (string) — Gets the lifecycle_state_details of this Catalog. A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.
- `timeUpdated` (datetime) — Gets the time_updated of this Catalog. The date and time the AI Data Platform Workbench catalog was updated.
- `createdBy` (string) — Gets the created_by of this Catalog. The ID of the user that created the catalog.
- `updatedBy` (string) — Gets the updated_by of this Catalog. The ID of the last user to update the catalog.
- `properties` (dict(str, str)) — Gets the properties of this Catalog. Key-value pair used to provide catalog properties like the subCompartment OCID where the buckets need to reside.

**Return:** [Back to Catalog (CatalogClient)](#catalog-catalogclient) • [Top](#top)

### <a id="list-catalog-permissions"></a>`list_catalog_permissions`
Gets a list of all permissions in the specified catalog.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `catalog_key` (string) — The key of the catalog.

**Optional Parameters:**
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName"
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.CatalogPermissionCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.CatalogPermissionSummary]) — Gets the items of this CatalogPermissionCollection. List of catalog permissions.

**Return:** [Back to Catalog (CatalogClient)](#catalog-catalogclient) • [Top](#top)

### <a id="list-catalogs"></a>`list_catalogs`
Gets a list of catalogs with a given ID.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

**Optional Parameters:**
- `display_name` (string) — A filter to return only resources that match the given display name exactly.
- `catalog_state` (string) — The state of the catalog. Allowed values are: "ACTIVE", "CREATING", "DELETING"
- `catalog_type` (string) — The type of the catalog. Allowed values are: "INTERNAL", "EXTERNAL"
- `should_skip_ocid_translation` (boolean) — When true, skip user OCID translation and return raw OCIDs.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName"
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.CatalogCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.CatalogSummary]) — Gets the items of this CatalogCollection. List of catalogs.

**Return:** [Back to Catalog (CatalogClient)](#catalog-catalogclient) • [Top](#top)

### <a id="manage-catalog-permission"></a>`manage_catalog_permission`
Updates permission details for a catalog.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `catalog_key` (string) — The key of the catalog.
- `manage_catalog_permission_details` (oci.aidataplatform_dp.models.ManageCatalogPermissionDetails) — The information to be updated.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Catalog (CatalogClient)](#catalog-catalogclient) • [Top](#top)

### <a id="refresh-catalog"></a>`refresh_catalog`
Refreshes a catalog through a crawler.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `catalog_key` (string) — The key of the catalog.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Catalog (CatalogClient)](#catalog-catalogclient) • [Top](#top)

### <a id="update-catalog"></a>`update_catalog`
Updates the details of a catalog with the given information.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `catalog_key` (string) — The key of the catalog.
- `update_catalog_details` (oci.aidataplatform_dp.models.UpdateCatalogDetails) — The information to be updated.

**Optional Parameters:**
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Catalog (CatalogClient)](#catalog-catalogclient) • [Top](#top)

## <a id="cluster-clusterclient"></a>Cluster (ClusterClient)
**Operations:**
- [`clone_compute`](#clone-compute)
- [`create_cluster`](#create-cluster)
- [`delete_cluster`](#delete-cluster)
- [`download_cluster_logs`](#download-cluster-logs)
- [`export_compute_configuration`](#export-compute-configuration)
- [`get_cluster`](#get-cluster)
- [`get_compute_configuration`](#get-compute-configuration)
- [`get_default_cluster`](#get-default-cluster)
- [`import_compute_configuration`](#import-compute-configuration)
- [`list_cluster_libraries`](#list-cluster-libraries)
- [`list_cluster_permissions`](#list-cluster-permissions)
- [`list_clusters`](#list-clusters)
- [`manage_cluster_permission`](#manage-cluster-permission)
- [`patch_cluster_library`](#patch-cluster-library)
- [`query_replica_ids`](#query-replica-ids)
- [`restart_cluster`](#restart-cluster)
- [`search_cluster_logs`](#search-cluster-logs)
- [`search_maven_packages`](#search-maven-packages)
- [`start_cluster`](#start-cluster)
- [`stop_cluster`](#stop-cluster)
- [`summarize_metrics_data`](#summarize-metrics-data)
- [`update_cluster`](#update-cluster)

### <a id="clone-compute"></a>`clone_compute`
Creates one Spark Compute by copying all source Compute settings and configuration.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `cluster_key` (string) — Cluster key.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Cluster (ClusterClient)](#cluster-clusterclient) • [Top](#top)

### <a id="create-cluster"></a>`create_cluster`
Creates a new cluster with the provided details.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `create_cluster_details` (oci.aidataplatform_dp.models.CreateClusterDetails) — Details for the new cluster.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.Cluster

**Response Fields:**
- `key` (string) — Gets the key of this Cluster. Cluster key.
- `displayName` (string) — Gets the display_name of this Cluster. Cluster name.
- `timeCreated` (datetime) — Gets the time_created of this Cluster. Date and time the cluster was created.
- `state` (string) — Gets the state of this Cluster. Common lifecycle states for resources in a compute cluster. ACCEPTED        - The resource create request has been accepted. CREATING        - The resource is being created and might not be usable until the entire metadata is defined. ACTIVE          - The resource is valid and available for access. DELETING        - The resource is being deleted, and might require a deep clean of any children. DELETED         - The resource has been deleted, and isn't available. FAILED          - The resource is in a failed state due to validation or other errors. STOPPING        - The resource is being stopped. STOPPED         - The resource has been stopped. UPDATING        - The resource is being updated and might not be usable until all changes are commited. STARTING        - The resource is being started. RESTARTING      - The resource is being restarted. Allowed values for this property are: "ACCEPTED", "CREATING", "ACTIVE", "DELETING", "DELETED", "FAILED", "STOPPING", "STOPPED", "UPDATING", "RESTARTING", "STARTING", "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS", "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL", "NETWORK_CONFIGURATION_ATTACH_FAILED", "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS", "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL", "NETWORK_CONFIGURATION_DETACH_FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.

**Optional Response Fields:**
- `description` (string) — Gets the description of this Cluster. Cluster description.
- `sourceApi` (string) — Gets the source_api of this Cluster. User created clusters are associated with a particular workspace. AI compute is used to execute Agents. Allowed values for this property are: "CLUSTER_API", "DEFAULT_CLUSTER_API", "AI_COMPUTE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `type` (string) — Gets the type of this Cluster. ClusterType Allowed values for this property are: "USER", "AI_COMPUTE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `timeUpdated` (datetime) — Gets the time_updated of this Cluster. Date and time the cluster was updated.
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

**Return:** [Back to Cluster (ClusterClient)](#cluster-clusterclient) • [Top](#top)

### <a id="delete-cluster"></a>`delete_cluster`
Deletes a cluster from a workspace.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `cluster_key` (string) — Cluster key.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Cluster (ClusterClient)](#cluster-clusterclient) • [Top](#top)

### <a id="download-cluster-logs"></a>`download_cluster_logs`
Downloads logs within the specified cluster and time range. The logs can be filtered by severity (`logLevel`), type (`logContentTypeContains`), and other parameters such as execution context and thread identifiers.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `cluster_key` (string) — Cluster key.
- `download_cluster_logs_details` (oci.aidataplatform_dp.models.DownloadClusterLogsDetails) — Request payload containing the parameters for filtering cluster logs.

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Cluster (ClusterClient)](#cluster-clusterclient) • [Top](#top)

### <a id="export-compute-configuration"></a>`export_compute_configuration`
Writes selected Compute configuration values supplied by the caller to a workspace YAML file without overwriting an existing file.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `cluster_key` (string) — Cluster key.
- `export_compute_configuration_details` (oci.aidataplatform_dp.models.ExportComputeConfigurationDetails) — Selected identifiers and destination for the YAML export.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type stream

**Return:** [Back to Cluster (ClusterClient)](#cluster-clusterclient) • [Top](#top)

### <a id="get-cluster"></a>`get_cluster`
Returns detailed information about a cluster.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `cluster_key` (string) — Cluster key.

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.Cluster

**Response Fields:**
- `key` (string) — Gets the key of this Cluster. Cluster key.
- `displayName` (string) — Gets the display_name of this Cluster. Cluster name.
- `timeCreated` (datetime) — Gets the time_created of this Cluster. Date and time the cluster was created.
- `state` (string) — Gets the state of this Cluster. Common lifecycle states for resources in a compute cluster. ACCEPTED        - The resource create request has been accepted. CREATING        - The resource is being created and might not be usable until the entire metadata is defined. ACTIVE          - The resource is valid and available for access. DELETING        - The resource is being deleted, and might require a deep clean of any children. DELETED         - The resource has been deleted, and isn't available. FAILED          - The resource is in a failed state due to validation or other errors. STOPPING        - The resource is being stopped. STOPPED         - The resource has been stopped. UPDATING        - The resource is being updated and might not be usable until all changes are commited. STARTING        - The resource is being started. RESTARTING      - The resource is being restarted. Allowed values for this property are: "ACCEPTED", "CREATING", "ACTIVE", "DELETING", "DELETED", "FAILED", "STOPPING", "STOPPED", "UPDATING", "RESTARTING", "STARTING", "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS", "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL", "NETWORK_CONFIGURATION_ATTACH_FAILED", "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS", "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL", "NETWORK_CONFIGURATION_DETACH_FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.

**Optional Response Fields:**
- `description` (string) — Gets the description of this Cluster. Cluster description.
- `sourceApi` (string) — Gets the source_api of this Cluster. User created clusters are associated with a particular workspace. AI compute is used to execute Agents. Allowed values for this property are: "CLUSTER_API", "DEFAULT_CLUSTER_API", "AI_COMPUTE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `type` (string) — Gets the type of this Cluster. ClusterType Allowed values for this property are: "USER", "AI_COMPUTE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `timeUpdated` (datetime) — Gets the time_updated of this Cluster. Date and time the cluster was updated.
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

**Return:** [Back to Cluster (ClusterClient)](#cluster-clusterclient) • [Top](#top)

### <a id="get-compute-configuration"></a>`get_compute_configuration`
Gets cluster-scoped Python and JAR libraries and environment variables from Spark Compute.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `cluster_key` (string) — Cluster key.

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.ComputeConfiguration

**Optional Response Fields:**
- `clusterKey` (string) — Gets the cluster_key of this ComputeConfiguration. Source cluster key.
- `environmentVariables` (dict(str, str)) — Gets the environment_variables of this ComputeConfiguration. Environment-variable keys and authoritative values configured on the source Compute.
- `libraries` (oci.aidataplatform_dp.models.ComputeConfigurationLibraries) — Gets the libraries of this ComputeConfiguration.

**Return:** [Back to Cluster (ClusterClient)](#cluster-clusterclient) • [Top](#top)

### <a id="get-default-cluster"></a>`get_default_cluster`
Gets information about the master catalog default cluster.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.DefaultCluster

**Optional Response Fields:**
- `workspaceKey` (string) — Gets the workspace_key of this DefaultCluster. The key of the AI Data Platform Workbench workspace where the default cluster is.
- `workerConfig` (oci.aidataplatform_dp.models.WorkerConfig) — Gets the worker_config of this DefaultCluster.
- `clusterRuntimeConfig` (oci.aidataplatform_dp.models.ClusterRuntimeConfig) — Gets the cluster_runtime_config of this DefaultCluster.
- `loggingConfig` (oci.aidataplatform_dp.models.LoggingConfig) — Gets the logging_config of this DefaultCluster.
- `autoTerminationMinutes` (number) — Gets the auto_termination_minutes of this DefaultCluster. Optional timeout value in minutes used to automatically stop idle compute clusters.
- `jdbcEndpointUrl` (string) — Gets the jdbc_endpoint_url of this DefaultCluster. Spark JDBC URL.
- `logId` (string) — Gets the log_id of this DefaultCluster. The OCID of the log where cluster logs are published and retrieved. This logId is always created within the logGroupId returned in the response payload.
- `logGroupId` (string) — Gets the log_group_id of this DefaultCluster. The unique OCID that identifies a specific log group within OCI Logging. This log group is exclusively associated with the AI Data Platform Workbench instance and is created in the same compartment within the customer’s tenancy as the AI Data Platform Workbench instance.
- `subscription` (oci.aidataplatform_dp.models.SubscriptionDetails) — Gets the subscription of this DefaultCluster.

**Return:** [Back to Cluster (ClusterClient)](#cluster-clusterclient) • [Top](#top)

### <a id="import-compute-configuration"></a>`import_compute_configuration`
Imports one or more unique workspace YAML files into an active Spark Compute.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `cluster_key` (string) — Cluster key.
- `import_compute_configuration_details` (oci.aidataplatform_dp.models.ImportComputeConfigurationDetails) — YAML workspace paths to import.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Cluster (ClusterClient)](#cluster-clusterclient) • [Top](#top)

### <a id="list-cluster-libraries"></a>`list_cluster_libraries`
Gets a list of libraries installed on a cluster.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `cluster_key` (string) — Cluster key.

**Optional Parameters:**
- `display_name` (string) — A filter to return only resources that match the given display name exactly.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.ClusterLibraryCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.ClusterLibrarySummary]) — Gets the items of this ClusterLibraryCollection. List of cluster libraries.

**Return:** [Back to Cluster (ClusterClient)](#cluster-clusterclient) • [Top](#top)

### <a id="list-cluster-permissions"></a>`list_cluster_permissions`
Return a list of permissions for a given cluster.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `cluster_key` (string) — Cluster key.

**Optional Parameters:**
- `display_name` (string) — A filter to return only resources that match the given display name exactly.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.ClusterPermissionCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.ClusterPermissionSummary]) — Gets the items of this ClusterPermissionCollection. List of cluster permissions.

**Return:** [Back to Cluster (ClusterClient)](#cluster-clusterclient) • [Top](#top)

### <a id="list-clusters"></a>`list_clusters`
Returns a list of all clusters in a given workspace.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace

**Optional Parameters:**
- `state` (string) — A filter to return only resources that match the given lifecycle state. The state value is case-insensitive. Allowed values are: "ACCEPTED", "CREATING", "ACTIVE", "DELETING", "DELETED", "FAILED", "STOPPING", "STOPPED", "UPDATING", "RESTARTING", "STARTING", "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS", "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL", "NETWORK_CONFIGURATION_ATTACH_FAILED", "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS", "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL", "NETWORK_CONFIGURATION_DETACH_FAILED"
- `display_name` (string) — A filter to return only resources that match the given display name exactly.
- `display_name_contains` (string) — A filter to return only resources that have a display name containing the text provided.
- `type` (string) — Cluster type. When the filter is not provided list shows all cluster types - USER and AI_COMPUTE else it shows only cluster of type chosen. Only clusters of type USER are attachable to a workspace notebook.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.ClusterCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.ClusterSummary]) — Gets the items of this ClusterCollection. List of Clusters.

**Return:** [Back to Cluster (ClusterClient)](#cluster-clusterclient) • [Top](#top)

### <a id="manage-cluster-permission"></a>`manage_cluster_permission`
Updates the permissions for a given cluster.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `cluster_key` (string) — Cluster key.
- `manage_cluster_permission_details` (oci.aidataplatform_dp.models.ManageClusterPermissionDetails) — The information to be updated.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Cluster (ClusterClient)](#cluster-clusterclient) • [Top](#top)

### <a id="patch-cluster-library"></a>`patch_cluster_library`
Updates libraries of a cluster with the provided patches.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `cluster_key` (string) — Cluster key.
- `patch_cluster_library_details` (oci.aidataplatform_dp.models.PatchClusterLibraryDetails) — The information to be updated.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.ClusterLibraryCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.ClusterLibrarySummary]) — Gets the items of this ClusterLibraryCollection. List of cluster libraries.

**Return:** [Back to Cluster (ClusterClient)](#cluster-clusterclient) • [Top](#top)

### <a id="query-replica-ids"></a>`query_replica_ids`
Queries compute replica identifiers for a compute cluster in the given workspace. The response contains distinct replica identifiers derived from the Monitoring `agentNode` metric dimension.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `cluster_key` (string) — Cluster key.
- `query_replica_ids_details` (oci.aidataplatform_dp.models.QueryReplicaIdsDetails) — Request body containing replica query parameters.

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.QueryReplicaIdsResult

**Response Fields:**
- `replicaIds` (list[str]) — Gets the replica_ids of this QueryReplicaIdsResult. Distinct compute replica identifiers derived from the Monitoring `agentNode` dimension.

**Return:** [Back to Cluster (ClusterClient)](#cluster-clusterclient) • [Top](#top)

### <a id="restart-cluster"></a>`restart_cluster`
Restarts a running cluster.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `cluster_key` (string) — Cluster key.
- `restart_cluster_details` (oci.aidataplatform_dp.models.RestartClusterDetails) — Details for restarting the cluster.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.Cluster

**Response Fields:**
- `key` (string) — Gets the key of this Cluster. Cluster key.
- `displayName` (string) — Gets the display_name of this Cluster. Cluster name.
- `timeCreated` (datetime) — Gets the time_created of this Cluster. Date and time the cluster was created.
- `state` (string) — Gets the state of this Cluster. Common lifecycle states for resources in a compute cluster. ACCEPTED        - The resource create request has been accepted. CREATING        - The resource is being created and might not be usable until the entire metadata is defined. ACTIVE          - The resource is valid and available for access. DELETING        - The resource is being deleted, and might require a deep clean of any children. DELETED         - The resource has been deleted, and isn't available. FAILED          - The resource is in a failed state due to validation or other errors. STOPPING        - The resource is being stopped. STOPPED         - The resource has been stopped. UPDATING        - The resource is being updated and might not be usable until all changes are commited. STARTING        - The resource is being started. RESTARTING      - The resource is being restarted. Allowed values for this property are: "ACCEPTED", "CREATING", "ACTIVE", "DELETING", "DELETED", "FAILED", "STOPPING", "STOPPED", "UPDATING", "RESTARTING", "STARTING", "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS", "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL", "NETWORK_CONFIGURATION_ATTACH_FAILED", "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS", "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL", "NETWORK_CONFIGURATION_DETACH_FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.

**Optional Response Fields:**
- `description` (string) — Gets the description of this Cluster. Cluster description.
- `sourceApi` (string) — Gets the source_api of this Cluster. User created clusters are associated with a particular workspace. AI compute is used to execute Agents. Allowed values for this property are: "CLUSTER_API", "DEFAULT_CLUSTER_API", "AI_COMPUTE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `type` (string) — Gets the type of this Cluster. ClusterType Allowed values for this property are: "USER", "AI_COMPUTE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `timeUpdated` (datetime) — Gets the time_updated of this Cluster. Date and time the cluster was updated.
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

**Return:** [Back to Cluster (ClusterClient)](#cluster-clusterclient) • [Top](#top)

### <a id="search-cluster-logs"></a>`search_cluster_logs`
Searches logs within the specified cluster and time range. Supports pagination and filtering.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `cluster_key` (string) — Cluster key.
- `search_cluster_logs_details` (oci.aidataplatform_dp.models.SearchClusterLogsDetails) — Request body containing the search parameters for cluster logs.

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.ClusterLogCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.ClusterLogsSummary]) — Gets the items of this ClusterLogCollection. List of cluster logs.

**Return:** [Back to Cluster (ClusterClient)](#cluster-clusterclient) • [Top](#top)

### <a id="search-maven-packages"></a>`search_maven_packages`
Searches Maven packages available for cluster library installation.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `cluster_key` (string) — Cluster key.
- `maven_search_query` (string) — Search text matched against Maven package metadata, including group and artifact identifiers. For example, `commons-csv` can return `org.apache.commons:commons-csv`.

**Optional Parameters:**
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.MavenSearchSummaryCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.MavenSearchSummary]) — Gets the items of this MavenSearchSummaryCollection. Maven package search results.

**Return:** [Back to Cluster (ClusterClient)](#cluster-clusterclient) • [Top](#top)

### <a id="start-cluster"></a>`start_cluster`
Starts a cluster that has halted operation.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `cluster_key` (string) — Cluster key.
- `start_cluster_details` (oci.aidataplatform_dp.models.StartClusterDetails) — Details of the cluster being started.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.Cluster

**Response Fields:**
- `key` (string) — Gets the key of this Cluster. Cluster key.
- `displayName` (string) — Gets the display_name of this Cluster. Cluster name.
- `timeCreated` (datetime) — Gets the time_created of this Cluster. Date and time the cluster was created.
- `state` (string) — Gets the state of this Cluster. Common lifecycle states for resources in a compute cluster. ACCEPTED        - The resource create request has been accepted. CREATING        - The resource is being created and might not be usable until the entire metadata is defined. ACTIVE          - The resource is valid and available for access. DELETING        - The resource is being deleted, and might require a deep clean of any children. DELETED         - The resource has been deleted, and isn't available. FAILED          - The resource is in a failed state due to validation or other errors. STOPPING        - The resource is being stopped. STOPPED         - The resource has been stopped. UPDATING        - The resource is being updated and might not be usable until all changes are commited. STARTING        - The resource is being started. RESTARTING      - The resource is being restarted. Allowed values for this property are: "ACCEPTED", "CREATING", "ACTIVE", "DELETING", "DELETED", "FAILED", "STOPPING", "STOPPED", "UPDATING", "RESTARTING", "STARTING", "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS", "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL", "NETWORK_CONFIGURATION_ATTACH_FAILED", "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS", "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL", "NETWORK_CONFIGURATION_DETACH_FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.

**Optional Response Fields:**
- `description` (string) — Gets the description of this Cluster. Cluster description.
- `sourceApi` (string) — Gets the source_api of this Cluster. User created clusters are associated with a particular workspace. AI compute is used to execute Agents. Allowed values for this property are: "CLUSTER_API", "DEFAULT_CLUSTER_API", "AI_COMPUTE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `type` (string) — Gets the type of this Cluster. ClusterType Allowed values for this property are: "USER", "AI_COMPUTE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `timeUpdated` (datetime) — Gets the time_updated of this Cluster. Date and time the cluster was updated.
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

**Return:** [Back to Cluster (ClusterClient)](#cluster-clusterclient) • [Top](#top)

### <a id="stop-cluster"></a>`stop_cluster`
Stops an active cluster.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `cluster_key` (string) — Cluster key.
- `stop_cluster_details` (oci.aidataplatform_dp.models.StopClusterDetails) — Details for stopping the cluster.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.Cluster

**Response Fields:**
- `key` (string) — Gets the key of this Cluster. Cluster key.
- `displayName` (string) — Gets the display_name of this Cluster. Cluster name.
- `timeCreated` (datetime) — Gets the time_created of this Cluster. Date and time the cluster was created.
- `state` (string) — Gets the state of this Cluster. Common lifecycle states for resources in a compute cluster. ACCEPTED        - The resource create request has been accepted. CREATING        - The resource is being created and might not be usable until the entire metadata is defined. ACTIVE          - The resource is valid and available for access. DELETING        - The resource is being deleted, and might require a deep clean of any children. DELETED         - The resource has been deleted, and isn't available. FAILED          - The resource is in a failed state due to validation or other errors. STOPPING        - The resource is being stopped. STOPPED         - The resource has been stopped. UPDATING        - The resource is being updated and might not be usable until all changes are commited. STARTING        - The resource is being started. RESTARTING      - The resource is being restarted. Allowed values for this property are: "ACCEPTED", "CREATING", "ACTIVE", "DELETING", "DELETED", "FAILED", "STOPPING", "STOPPED", "UPDATING", "RESTARTING", "STARTING", "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS", "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL", "NETWORK_CONFIGURATION_ATTACH_FAILED", "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS", "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL", "NETWORK_CONFIGURATION_DETACH_FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.

**Optional Response Fields:**
- `description` (string) — Gets the description of this Cluster. Cluster description.
- `sourceApi` (string) — Gets the source_api of this Cluster. User created clusters are associated with a particular workspace. AI compute is used to execute Agents. Allowed values for this property are: "CLUSTER_API", "DEFAULT_CLUSTER_API", "AI_COMPUTE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `type` (string) — Gets the type of this Cluster. ClusterType Allowed values for this property are: "USER", "AI_COMPUTE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `timeUpdated` (datetime) — Gets the time_updated of this Cluster. Date and time the cluster was updated.
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

**Return:** [Back to Cluster (ClusterClient)](#cluster-clusterclient) • [Top](#top)

### <a id="summarize-metrics-data"></a>`summarize_metrics_data`
Provides summarized compute metrics for a compute cluster in the given workspace. This API aggregates metric data points based on a specified namespace, metric name, and aggregation type. The response contains computed metric summaries.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `cluster_key` (string) — Cluster key.
- `summarize_metrics_data_details` (oci.aidataplatform_dp.models.SummarizeMetricsDataDetails) — Request body containing metric parameters.

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.SummarizeMetricsResponse

**Response Fields:**
- `results` (list[oci.aidataplatform_dp.models.MetricsSummary]) — Gets the results of this SummarizeMetricsResponse. List of computed metric summary results.

**Return:** [Back to Cluster (ClusterClient)](#cluster-clusterclient) • [Top](#top)

### <a id="update-cluster"></a>`update_cluster`
Update the details of a given cluster.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `cluster_key` (string) — Cluster key.
- `update_cluster_details` (oci.aidataplatform_dp.models.UpdateClusterDetails) — The information to be updated.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.Cluster

**Response Fields:**
- `key` (string) — Gets the key of this Cluster. Cluster key.
- `displayName` (string) — Gets the display_name of this Cluster. Cluster name.
- `timeCreated` (datetime) — Gets the time_created of this Cluster. Date and time the cluster was created.
- `state` (string) — Gets the state of this Cluster. Common lifecycle states for resources in a compute cluster. ACCEPTED        - The resource create request has been accepted. CREATING        - The resource is being created and might not be usable until the entire metadata is defined. ACTIVE          - The resource is valid and available for access. DELETING        - The resource is being deleted, and might require a deep clean of any children. DELETED         - The resource has been deleted, and isn't available. FAILED          - The resource is in a failed state due to validation or other errors. STOPPING        - The resource is being stopped. STOPPED         - The resource has been stopped. UPDATING        - The resource is being updated and might not be usable until all changes are commited. STARTING        - The resource is being started. RESTARTING      - The resource is being restarted. Allowed values for this property are: "ACCEPTED", "CREATING", "ACTIVE", "DELETING", "DELETED", "FAILED", "STOPPING", "STOPPED", "UPDATING", "RESTARTING", "STARTING", "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS", "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL", "NETWORK_CONFIGURATION_ATTACH_FAILED", "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS", "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL", "NETWORK_CONFIGURATION_DETACH_FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.

**Optional Response Fields:**
- `description` (string) — Gets the description of this Cluster. Cluster description.
- `sourceApi` (string) — Gets the source_api of this Cluster. User created clusters are associated with a particular workspace. AI compute is used to execute Agents. Allowed values for this property are: "CLUSTER_API", "DEFAULT_CLUSTER_API", "AI_COMPUTE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `type` (string) — Gets the type of this Cluster. ClusterType Allowed values for this property are: "USER", "AI_COMPUTE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `timeUpdated` (datetime) — Gets the time_updated of this Cluster. Date and time the cluster was updated.
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

**Return:** [Back to Cluster (ClusterClient)](#cluster-clusterclient) • [Top](#top)

## <a id="credentials-credentialsclient"></a>Credentials (CredentialsClient)
**Operations:**
- [`create_credential`](#create-credential)
- [`delete_credential`](#delete-credential)
- [`get_credential`](#get-credential)
- [`list_credentials`](#list-credentials)
- [`update_credential`](#update-credential)

### <a id="create-credential"></a>`create_credential`
Creates a new credential object with the provided details. The operation completes synchronously; callers can invoke list or get to retrieve the resource payload.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `create_data_lake_credential_details` (oci.aidataplatform_dp.models.CreateDataLakeCredentialDetails) — Details for the new credential object. When the internal flag is enabled, callers must supply a `namespace` value of `default` or `user_settings` in the payload.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Credentials (CredentialsClient)](#credentials-credentialsclient) • [Top](#top)

### <a id="delete-credential"></a>`delete_credential`
Deletes a credential object. The operation completes synchronously without a response body.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `credential_key` (string) — The unique identifier of an credential

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Credentials (CredentialsClient)](#credentials-credentialsclient) • [Top](#top)

### <a id="get-credential"></a>`get_credential`
Gets detailed information about credential with a given credential key.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `credential_key` (string) — The unique identifier of an credential

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.Credential

**Response Fields:**
- `key` (string) — Gets the key of this Credential. The unique identifier for the credential object.
- `displayName` (string) — Gets the display_name of this Credential. A user-friendly name for the credential object. This value does not have to be unique and can be changed. Must start with a letter and contain only letters, numbers, or underscores. Avoid entering confidential information.

**Optional Response Fields:**
- `type` (string) — Gets the type of this Credential. The type of credential stored. Allowed values are defined in CredentialType. Allowed values for this property are: "SECRET_TOKEN", "VAULT_REFERENCE", "SERVICE_ACCOUNT", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `credentialDetails` (oci.aidataplatform_dp.models.CredentialDetails) — Gets the credential_details of this Credential.
- `credentialDescription` (string) — Gets the credential_description of this Credential. A brief summary of the credential object and its purpose.
- `lifecycleState` (string) — Gets the lifecycle_state of this Credential. The current state of the credential object. Allowed values are defined in CredentialLifecycleState. Allowed values for this property are: "ACTIVE", "CREATING", "UPDATING", "DELETING", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleStateDetails` (string) — Gets the lifecycle_state_details of this Credential. Additional details or reasons regarding the current lifecycle state. Often used to provide actionable information (e.g., for resources in a Failed state).
- `timeCreated` (datetime) — Gets the time_created of this Credential. The date and time when the credential object was created, in RFC 3339 timestamp format.
- `timeUpdated` (datetime) — Gets the time_updated of this Credential. The date and time when the credential object was most recently updated, in RFC 3339 timestamp format.
- `createdBy` (string) — Gets the created_by of this Credential. The unique identifier of the user who created the credential object.
- `updatedBy` (string) — Gets the updated_by of this Credential. The unique identifier of the user who last updated the credential object.

**Return:** [Back to Credentials (CredentialsClient)](#credentials-credentialsclient) • [Top](#top)

### <a id="list-credentials"></a>`list_credentials`
Returns a list of credentials.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

**Optional Parameters:**
- `display_name` (string) — A filter to return only resources that match the given display name exactly.
- `display_name_contains` (string) — A filter to return only resources whose displayName contains the provided value (case-insensitive).
- `lifecycle_state` (string) — A filter to return only resources whose lifecycleState matches the provided value.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "name"
- `credential_type` (string) — The type of the Credential Allowed values are: "SECRET_TOKEN", "VAULT_REFERENCE", "SERVICE_ACCOUNT"
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.CredentialCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.CredentialSummary]) — Gets the items of this CredentialCollection. List of credential summaries.

**Return:** [Back to Credentials (CredentialsClient)](#credentials-credentialsclient) • [Top](#top)

### <a id="update-credential"></a>`update_credential`
Updates a credential object. The operation completes synchronously; callers can invoke get to confirm the latest state.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `credential_key` (string) — The unique identifier of an credential
- `update_data_lake_credential_details` (oci.aidataplatform_dp.models.UpdateDataLakeCredentialDetails) — The information to be updated.

**Optional Parameters:**
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Credentials (CredentialsClient)](#credentials-credentialsclient) • [Top](#top)

## <a id="delta-share-deltashareclient"></a>Delta Share (DeltaShareClient)
**Operations:**
- [`create_recipient`](#create-recipient)
- [`create_share`](#create-share)
- [`delete_recipient`](#delete-recipient)
- [`delete_share`](#delete-share)
- [`get_recipient`](#get-recipient)
- [`get_share`](#get-share)
- [`list_recipient_permissions`](#list-recipient-permissions)
- [`list_recipient_shares`](#list-recipient-shares)
- [`list_recipients`](#list-recipients)
- [`list_share_data_assets`](#list-share-data-assets)
- [`list_share_permissions`](#list-share-permissions)
- [`list_share_recipients`](#list-share-recipients)
- [`list_shares`](#list-shares)
- [`manage_recipient_permission`](#manage-recipient-permission)
- [`manage_share_access`](#manage-share-access)
- [`manage_share_data_asset`](#manage-share-data-asset)
- [`manage_share_permission`](#manage-share-permission)
- [`update_recipient`](#update-recipient)
- [`update_share`](#update-share)

### <a id="create-recipient"></a>`create_recipient`
Creates a recipient for a Delta Share protocol.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `create_recipient_details` (oci.aidataplatform_dp.models.CreateRecipientDetails) — Details for the new recipient for Delta Share protocol in AI Data Platform Workbench.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.Recipient

**Response Fields:**
- `key` (string) — Gets the key of this Recipient. Unique identifier for this recipient in AI Data Platform Workbench instance.
- `displayName` (string) — Gets the display_name of this Recipient. A user-friendly name. Has to be unique within the AI Data Platform Workbench instance.
- `timeCreated` (datetime) — Gets the time_created of this Recipient. The date and time the Delta Share recipient was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `shareCount` (number) — Gets the share_count of this Recipient. The number of shares this recipient has access on.
- `createdBy` (string) — Gets the created_by of this Recipient. The ID of the user who created the recipient.
- `lifecycleState` (string) — Gets the lifecycle_state of this Recipient. The state of the recipient. Allowed values for this property are: "ACTIVE", "INACTIVE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.

**Optional Response Fields:**
- `description` (string) — Gets the description of this Recipient. Short description of the Recipient
- `timeUpdated` (datetime) — Gets the time_updated of this Recipient. The date and time the Delta Share recipient was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `updatedBy` (string) — Gets the updated_by of this Recipient. The ID of the user who last updated the recipient.
- `properties` (dict(str, str)) — Gets the properties of this Recipient. Key-value pair representing a defined tag key and value. Example: `{ "CostCenter": "42" }`
- `lifecycleStateDetails` (string) — Gets the lifecycle_state_details of this Recipient. A message describing the current state in more detail.

**Return:** [Back to Delta Share (DeltaShareClient)](#delta-share-deltashareclient) • [Top](#top)

### <a id="create-share"></a>`create_share`
Creates a Delta Share protocol.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `create_share_details` (oci.aidataplatform_dp.models.CreateShareDetails) — Details for the new share for Delta Share protocol in AI Data Platform Workbench.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.Share

**Response Fields:**
- `key` (string) — Gets the key of this Share. Unique identifier for this share in AI Data Platform Workbench instance.
- `displayName` (string) — Gets the display_name of this Share. A user-friendly name. Has to be unique within the AI Data Platform Workbench instance.
- `timeCreated` (datetime) — Gets the time_created of this Share. The date and time the Delta Share was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `createdBy` (string) — Gets the created_by of this Share. The ID of the user who created the share.
- `recipientCount` (number) — Gets the recipient_count of this Share. The number of recipients who have access on this share.

**Optional Response Fields:**
- `description` (string) — Gets the description of this Share. A description associated with this share.
- `timeUpdated` (datetime) — Gets the time_updated of this Share. The date and time the Delta Share was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `updatedBy` (string) — Gets the updated_by of this Share. The ID of the user who last updated the share.
- `assetCount` (number) — Gets the asset_count of this Share. The number of assets in this share.
- `lifecycleState` (string) — Gets the lifecycle_state of this Share. The state of the Share. Allowed values for this property are: "ACTIVE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleStateDetails` (string) — Gets the lifecycle_state_details of this Share. A message describing the current state in more detail.

**Return:** [Back to Delta Share (DeltaShareClient)](#delta-share-deltashareclient) • [Top](#top)

### <a id="delete-recipient"></a>`delete_recipient`
Deletes a Delta Share recipient.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `recipient_key` (string) — The key of the recipient resource

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Delta Share (DeltaShareClient)](#delta-share-deltashareclient) • [Top](#top)

### <a id="delete-share"></a>`delete_share`
Deletes a Delta Share.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `share_key` (string) — The unique key of the Share.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Delta Share (DeltaShareClient)](#delta-share-deltashareclient) • [Top](#top)

### <a id="get-recipient"></a>`get_recipient`
Gets detailed information about a Delta Share recipient.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `recipient_key` (string) — The key of the recipient resource

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.Recipient

**Response Fields:**
- `key` (string) — Gets the key of this Recipient. Unique identifier for this recipient in AI Data Platform Workbench instance.
- `displayName` (string) — Gets the display_name of this Recipient. A user-friendly name. Has to be unique within the AI Data Platform Workbench instance.
- `timeCreated` (datetime) — Gets the time_created of this Recipient. The date and time the Delta Share recipient was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `shareCount` (number) — Gets the share_count of this Recipient. The number of shares this recipient has access on.
- `createdBy` (string) — Gets the created_by of this Recipient. The ID of the user who created the recipient.
- `lifecycleState` (string) — Gets the lifecycle_state of this Recipient. The state of the recipient. Allowed values for this property are: "ACTIVE", "INACTIVE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.

**Optional Response Fields:**
- `description` (string) — Gets the description of this Recipient. Short description of the Recipient
- `timeUpdated` (datetime) — Gets the time_updated of this Recipient. The date and time the Delta Share recipient was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `updatedBy` (string) — Gets the updated_by of this Recipient. The ID of the user who last updated the recipient.
- `properties` (dict(str, str)) — Gets the properties of this Recipient. Key-value pair representing a defined tag key and value. Example: `{ "CostCenter": "42" }`
- `lifecycleStateDetails` (string) — Gets the lifecycle_state_details of this Recipient. A message describing the current state in more detail.

**Return:** [Back to Delta Share (DeltaShareClient)](#delta-share-deltashareclient) • [Top](#top)

### <a id="get-share"></a>`get_share`
Gets detailed information about a Delta Share.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `share_key` (string) — The unique key of the Share.

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.Share

**Response Fields:**
- `key` (string) — Gets the key of this Share. Unique identifier for this share in AI Data Platform Workbench instance.
- `displayName` (string) — Gets the display_name of this Share. A user-friendly name. Has to be unique within the AI Data Platform Workbench instance.
- `timeCreated` (datetime) — Gets the time_created of this Share. The date and time the Delta Share was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `createdBy` (string) — Gets the created_by of this Share. The ID of the user who created the share.
- `recipientCount` (number) — Gets the recipient_count of this Share. The number of recipients who have access on this share.

**Optional Response Fields:**
- `description` (string) — Gets the description of this Share. A description associated with this share.
- `timeUpdated` (datetime) — Gets the time_updated of this Share. The date and time the Delta Share was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `updatedBy` (string) — Gets the updated_by of this Share. The ID of the user who last updated the share.
- `assetCount` (number) — Gets the asset_count of this Share. The number of assets in this share.
- `lifecycleState` (string) — Gets the lifecycle_state of this Share. The state of the Share. Allowed values for this property are: "ACTIVE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `lifecycleStateDetails` (string) — Gets the lifecycle_state_details of this Share. A message describing the current state in more detail.

**Return:** [Back to Delta Share (DeltaShareClient)](#delta-share-deltashareclient) • [Top](#top)

### <a id="list-recipient-permissions"></a>`list_recipient_permissions`
Gets a detailed list of Delta Share recipient permissions.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `recipient_key` (string) — The key of the recipient resource

**Optional Parameters:**
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. Default order for `grantee` is ascending. Allowed values are: "grantee"
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.RecipientPermissionCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.RecipientPermissionSummary]) — Gets the items of this RecipientPermissionCollection. List of recipient permissions.

**Return:** [Back to Delta Share (DeltaShareClient)](#delta-share-deltashareclient) • [Top](#top)

### <a id="list-recipient-shares"></a>`list_recipient_shares`
Returns a list of Delta Shares that the specified recipient has been granted access to.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `recipient_key` (string) — The key of the recipient resource

**Optional Parameters:**
- `display_name` (string) — A filter to return only resources that match the given display name exactly.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.ShareCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.ShareSummary]) — Gets the items of this ShareCollection. List of Shares.

**Return:** [Back to Delta Share (DeltaShareClient)](#delta-share-deltashareclient) • [Top](#top)

### <a id="list-recipients"></a>`list_recipients`
Gets a list of Delta Share recipients.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

**Optional Parameters:**
- `display_name` (string) — A filter to return only resources that match the given display name exactly.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.RecipientCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.RecipientSummary]) — Gets the items of this RecipientCollection. List of recipients.

**Return:** [Back to Delta Share (DeltaShareClient)](#delta-share-deltashareclient) • [Top](#top)

### <a id="list-share-data-assets"></a>`list_share_data_assets`
Gets a list of Delta Share assets.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `share_key` (string) — The unique key of the Share.

**Optional Parameters:**
- `display_name` (string) — A filter to return only resources that match the given display name exactly.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.ShareDataAssetCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.ShareDataAssetSummary]) — Gets the items of this ShareDataAssetCollection. List of Shares assets.

**Return:** [Back to Delta Share (DeltaShareClient)](#delta-share-deltashareclient) • [Top](#top)

### <a id="list-share-permissions"></a>`list_share_permissions`
Returns a list of Delta Shares that the specified recipient has been granted access to.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `share_key` (string) — The unique key of the Share.

**Optional Parameters:**
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for `grantee` is ascending. Default order for `granteeType` is ascending. Allowed values are: "grantee", "granteeType"
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.SharePermissionCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.SharePermissionSummary]) — Gets the items of this SharePermissionCollection. List of share permissions.

**Return:** [Back to Delta Share (DeltaShareClient)](#delta-share-deltashareclient) • [Top](#top)

### <a id="list-share-recipients"></a>`list_share_recipients`
Gets a list of recipients that have been given access on the specified Delta Share.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `share_key` (string) — The unique key of the Share.

**Optional Parameters:**
- `display_name` (string) — A filter to return only resources that match the given display name exactly.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.RecipientCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.RecipientSummary]) — Gets the items of this RecipientCollection. List of recipients.

**Return:** [Back to Delta Share (DeltaShareClient)](#delta-share-deltashareclient) • [Top](#top)

### <a id="list-shares"></a>`list_shares`
Gets a list of Delta Shares.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

**Optional Parameters:**
- `display_name` (string) — A filter to return only resources that match the given display name exactly.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.ShareCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.ShareSummary]) — Gets the items of this ShareCollection. List of Shares.

**Return:** [Back to Delta Share (DeltaShareClient)](#delta-share-deltashareclient) • [Top](#top)

### <a id="manage-recipient-permission"></a>`manage_recipient_permission`
Updates the permissions of a Delta Share recipient.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `recipient_key` (string) — The key of the recipient resource
- `manage_recipient_permission_details` (oci.aidataplatform_dp.models.ManageRecipientPermissionDetails) — The information to be updated.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Delta Share (DeltaShareClient)](#delta-share-deltashareclient) • [Top](#top)

### <a id="manage-share-access"></a>`manage_share_access`
Updates consumer-side access on a share for a recipient. A provider user can grant or revoke access on a particular share for a given recipient.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `share_key` (string) — The unique key of the Share.
- `manage_share_access_details` (oci.aidataplatform_dp.models.ManageShareAccessDetails) — The information to be updated.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Delta Share (DeltaShareClient)](#delta-share-deltashareclient) • [Top](#top)

### <a id="manage-share-data-asset"></a>`manage_share_data_asset`
Updates data assets on a Delta Share with the provided information.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `share_key` (string) — The unique key of the Share.
- `manage_share_data_asset_details` (oci.aidataplatform_dp.models.ManageShareDataAssetDetails) — The Delta Share data asset information to be updated.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Delta Share (DeltaShareClient)](#delta-share-deltashareclient) • [Top](#top)

### <a id="manage-share-permission"></a>`manage_share_permission`
Updates permissions on a Delta Share.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `share_key` (string) — The unique key of the Share.
- `manage_share_permission_details` (oci.aidataplatform_dp.models.ManageSharePermissionDetails) — The information to be updated.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Delta Share (DeltaShareClient)](#delta-share-deltashareclient) • [Top](#top)

### <a id="update-recipient"></a>`update_recipient`
Updates the metadata of a Delta Share recipient.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `recipient_key` (string) — The key of the recipient resource
- `update_recipient_details` (oci.aidataplatform_dp.models.UpdateRecipientDetails) — The information to be updated for a recipient.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Delta Share (DeltaShareClient)](#delta-share-deltashareclient) • [Top](#top)

### <a id="update-share"></a>`update_share`
Update a Delta Share with the provided metadata.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `share_key` (string) — The unique key of the Share.
- `update_share_details` (oci.aidataplatform_dp.models.UpdateShareDetails) — The information to be updated.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Delta Share (DeltaShareClient)](#delta-share-deltashareclient) • [Top](#top)

## <a id="git-gitclient"></a>Git (GitClient)
**Operations:**
- [`checkout_branch`](#checkout-branch)
- [`commit_push_git_repository`](#commit-push-git-repository)
- [`create_git_branch`](#create-git-branch)
- [`get_git_diff_detail`](#get-git-diff-detail)
- [`get_git_operation_state`](#get-git-operation-state)
- [`get_git_repository`](#get-git-repository)
- [`list_git_branches`](#list-git-branches)
- [`list_git_diffs`](#list-git-diffs)
- [`merge_git_repository`](#merge-git-repository)
- [`pull_git_repository`](#pull-git-repository)
- [`rebase_git_repository`](#rebase-git-repository)
- [`reset_git_folder_state`](#reset-git-folder-state)
- [`reset_git_repository`](#reset-git-repository)
- [`resolve_git_conflicts`](#resolve-git-conflicts)
- [`update_git_repository`](#update-git-repository)

### <a id="checkout-branch"></a>`checkout_branch`
(Preview) Checks out a remote branch into the specified workspace folder, ensuring the worktree tracks the requested branch HEAD.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `git_repository_key` (string) — The Git repository key.
- `checkout_branch_details` (oci.aidataplatform_dp.models.CheckoutBranchDetails) — Details for the new branch.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.GitBranch

**Response Fields:**
- `branchName` (string) — Gets the branch_name of this GitBranch. The name of the Git branch.
- `gitUrl` (string) — Gets the git_url of this GitBranch. The Git repository URL corresponding to the branch.

**Optional Response Fields:**
- `errorMessage` (string) — Gets the error_message of this GitBranch. Git error message.
- `stdOut` (string) — Gets the std_out of this GitBranch. Git STDOUT message.
- `stdErr` (string) — Gets the std_err of this GitBranch. Git STDERR message.
- `gitExitCode` (number) — Gets the git_exit_code of this GitBranch. Git exit status.

**Return:** [Back to Git (GitClient)](#git-gitclient) • [Top](#top)

### <a id="commit-push-git-repository"></a>`commit_push_git_repository`
(Preview) Stages selected workspace updates, creates a commit, and pushes it upstream so automation can sync with Git providers.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `git_repository_key` (string) — The Git repository key.
- `commit_push_details` (oci.aidataplatform_dp.models.CommitPushDetails) — Commit details.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Git (GitClient)](#git-gitclient) • [Top](#top)

### <a id="create-git-branch"></a>`create_git_branch`
(Preview) Creates a new branch in the connected repo so teams can stage changes in isolated workspaces.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `git_repository_key` (string) — The Git repository key.
- `create_git_branch_details` (oci.aidataplatform_dp.models.CreateGitBranchDetails) — Details for the new Workspace Object.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.CreateGitBranch

**Response Fields:**
- `gitBranchName` (string) — Gets the git_branch_name of this CreateGitBranch. The name of the Git branch.
- `gitUrl` (string) — Gets the git_url of this CreateGitBranch. The Git repository URL corresponding to the branch.

**Optional Response Fields:**
- `errorMessage` (string) — Gets the error_message of this CreateGitBranch. Git error message.
- `stdOut` (string) — Gets the std_out of this CreateGitBranch. Git STDOUT message.
- `stdErr` (string) — Gets the std_err of this CreateGitBranch. Git STDERR message.
- `gitExitCode` (number) — Gets the git_exit_code of this CreateGitBranch. Git exit status.
- `gitFolderPath` (string) — Gets the git_folder_path of this CreateGitBranch. The path of the current Git folder which has to be created for the new branch.

**Return:** [Back to Git (GitClient)](#git-gitclient) • [Top](#top)

### <a id="get-git-diff-detail"></a>`get_git_diff_detail`
(Preview) Returns a unified diff patch for a specific file so editors and review panes can render inline changes.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `git_repository_key` (string) — The Git repository key.
- `git_folder_path` (string) — The Git folder path.
- `branch_name` (string) — Expected branch name for the folder context.
- `git_file_path` (string) — File path relative to repository root.

**Optional Parameters:**
- `context_lines` (number) — Number of context lines to include in the diff.
- `max_patch_bytes` (number) — Maximum number of bytes of diff output to return.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.GitDiffDetail

**Response Fields:**
- `gitFilePath` (string) — Gets the git_file_path of this GitDiffDetail. File path relative to repository root.

**Optional Response Fields:**
- `isConflict` (boolean) — Gets the is_conflict of this GitDiffDetail. Indicates whether the file is currently in a conflicted state.
- `isBinary` (boolean) — Gets the is_binary of this GitDiffDetail. Indicates whether the file is binary.
- `patch` (string) — Gets the patch of this GitDiffDetail. Unified diff patch text.
- `isTruncated` (boolean) — Gets the is_truncated of this GitDiffDetail. Indicates whether the diff output was truncated.
- `truncatedReason` (string) — Gets the truncated_reason of this GitDiffDetail. Indicates the reason for the truncated diff to be returned. Allowed values for this property are: "MAX_PATCH_BYTES", "BINARY", "TOO_LARGE", "UNKNOWN", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.

**Return:** [Back to Git (GitClient)](#git-gitclient) • [Top](#top)

### <a id="get-git-operation-state"></a>`get_git_operation_state`
(Preview) Returns the current Git worktree status—including in-progress operations or detached HEAD indicators—for the workspace folder.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `git_repository_key` (string) — The Git repository key.

**Optional Parameters:**
- `operation_name` (string) — Optional operation the caller intends to perform (for example PULL, PUSH, RESET, CHECKOUT).
- `branch_name` (string) — Expected branch name for the folder context.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.GitOperationState

**Response Fields:**
- `gitFolderPath` (string) — Gets the git_folder_path of this GitOperationState. Folder path used to locate the Git worktree.
- `state` (string) — Gets the state of this GitOperationState. Current Git operation state detected. Allowed values for this property are: "CLEAN", "MERGE_IN_PROGRESS", "REBASE_IN_PROGRESS", "PULL_IN_PROGRESS", "DETACHED_HEAD", "UNKNOWN", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `isBlocking` (boolean) — Gets the is_blocking of this GitOperationState. Whether the detected state blocks typical write operations.
- `isAllowed` (boolean) — Gets the is_allowed of this GitOperationState. Whether the requested operation is allowed in the current state. If operationName is not provided, this indicates if the repository is in a generally safe state.

**Optional Response Fields:**
- `message` (string) — Gets the message of this GitOperationState. Human-readable hint for UI display.
- `currentBranch` (string) — Gets the current_branch of this GitOperationState. Current branch name. Empty if detached HEAD.
- `headCommitId` (string) — Gets the head_commit_id of this GitOperationState. Full commit ID of HEAD.
- `isDetached` (boolean) — Gets the is_detached of this GitOperationState. Whether HEAD is detached.
- `haveConflicts` (boolean) — Gets the have_conflicts of this GitOperationState. Indicates if unmerged/conflicted files exist. This does not include file names.
- `timeChecked` (datetime) — Gets the time_checked of this GitOperationState. Time when the state was computed.

**Return:** [Back to Git (GitClient)](#git-gitclient) • [Top](#top)

### <a id="get-git-repository"></a>`get_git_repository`
(Preview) Returns repository metadata, credential references, and workspace linkage for a specific AI Data Platform Git repository.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `git_repository_key` (string) — The Git repository key.

**Optional Parameters:**
- `should_include_credential_key` (boolean) — A flag to include credential key in response. If 'true', credential key will be returned in response. Default 'false'.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.GitRepository

**Response Fields:**
- `key` (string) — Gets the key of this GitRepository. Unique key associated with repository.
- `workspaceKey` (string) — Gets the workspace_key of this GitRepository. The workspaceKey associated with the Git repository.
- `branchName` (string) — Gets the branch_name of this GitRepository. The name of the Git branch.
- `gitUrl` (string) — Gets the git_url of this GitRepository. The Git repository url corresponding to the branch.
- `gitFolderPath` (string) — Gets the git_folder_path of this GitRepository. The path of the current Git folder which has to be created for the new branch.

**Optional Response Fields:**
- `credentialKey` (string) — Gets the credential_key of this GitRepository. The credential setting key

**Return:** [Back to Git (GitClient)](#git-gitclient) • [Top](#top)

### <a id="list-git-branches"></a>`list_git_branches`
(Preview) Returns branch summaries with optional display-name filters and pagination, so UIs can show branch pickers and search results.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `git_repository_key` (string) — The Git repository key.

**Optional Parameters:**
- `display_name` (string) — A filter to return only resources that match the given display name exactly.
- `display_name_contains` (string) — A filter to return only resources that have a display name containing the text provided.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName", "status"
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.GitBranchCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.GitBranchSummary]) — Gets the items of this GitBranchCollection. List of Git branches.

**Return:** [Back to Git (GitClient)](#git-gitclient) • [Top](#top)

### <a id="list-git-diffs"></a>`list_git_diffs`
(Preview) Returns file-level diff summaries for the workspace branch, enabling UI views of changed files or conflicts without heavy payloads.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `git_repository_key` (string) — The Git repository key.
- `git_folder_path` (string) — The Git folder path.
- `branch_name` (string) — Expected branch name for the folder context.

**Optional Parameters:**
- `compare_to` (string) — Determines which reference is used for computing diffs. Allowed values are: "HEAD", "UPSTREAM", "INDEX", "WORKTREE", "MERGE_BASE"
- `filter` (string) — Filter which files are returned. Allowed values are: "ALL", "DIFF_ONLY", "CONFLICTS_ONLY"
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated"
- `display_name` (string) — A filter to return only resources that match the given display name exactly.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.GitDiffSummaryCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.GitDiffSummary]) — Gets the items of this GitDiffSummaryCollection. List of Git diff summaries.

**Return:** [Back to Git (GitClient)](#git-gitclient) • [Top](#top)

### <a id="merge-git-repository"></a>`merge_git_repository`
(Preview) Applies the requested branch or commit onto the workspace branch to preview integration changes before pushing.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `git_repository_key` (string) — The Git repository key.
- `git_merge_details` (oci.aidataplatform_dp.models.GitMergeDetails) — Folder/branch details to merge.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Git (GitClient)](#git-gitclient) • [Top](#top)

### <a id="pull-git-repository"></a>`pull_git_repository`
(Preview) Performs a Git pull for the workspace branch so developers can sync local files with the latest upstream commits.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `git_repository_key` (string) — The Git repository key.
- `git_pull_details` (oci.aidataplatform_dp.models.GitPullDetails) — Folder/branch details to pull.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Git (GitClient)](#git-gitclient) • [Top](#top)

### <a id="rebase-git-repository"></a>`rebase_git_repository`
(Preview) Rebases the workspace branch on top of another commit or branch to linearize history and resolve drift.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `git_repository_key` (string) — The Git repository key.
- `git_rebase_details` (oci.aidataplatform_dp.models.GitRebaseDetails) — Details needed to perform rebase operation.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Git (GitClient)](#git-gitclient) • [Top](#top)

### <a id="reset-git-folder-state"></a>`reset_git_folder_state`
(Preview) Halts in-progress Git operations and discards local changes in the workspace folder to regain a clean state.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `git_repository_key` (string) — The Git repository key.
- `reset_git_folder_state_details` (oci.aidataplatform_dp.models.ResetGitFolderStateDetails) — Merge conflict resolution details.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Git (GitClient)](#git-gitclient) • [Top](#top)

### <a id="reset-git-repository"></a>`reset_git_repository`
(Preview) Performs a Git reset so the workspace branch matches the specified commit, discarding newer local commits.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `git_repository_key` (string) — The Git repository key.
- `git_reset_details` (oci.aidataplatform_dp.models.GitResetDetails) — Details needed to perform Git reset operation.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Git (GitClient)](#git-gitclient) • [Top](#top)

### <a id="resolve-git-conflicts"></a>`resolve_git_conflicts`
(Preview) Accepts conflict resolution instructions—choose source or target versions—and records the resolution back to the repo.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `git_repository_key` (string) — The Git repository key.
- `conflict_resolve_details` (oci.aidataplatform_dp.models.ConflictResolveDetails) — Conflict resolution details.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.GitBranch

**Response Fields:**
- `branchName` (string) — Gets the branch_name of this GitBranch. The name of the Git branch.
- `gitUrl` (string) — Gets the git_url of this GitBranch. The Git repository URL corresponding to the branch.

**Optional Response Fields:**
- `errorMessage` (string) — Gets the error_message of this GitBranch. Git error message.
- `stdOut` (string) — Gets the std_out of this GitBranch. Git STDOUT message.
- `stdErr` (string) — Gets the std_err of this GitBranch. Git STDERR message.
- `gitExitCode` (number) — Gets the git_exit_code of this GitBranch. Git exit status.

**Return:** [Back to Git (GitClient)](#git-gitclient) • [Top](#top)

### <a id="update-git-repository"></a>`update_git_repository`
(Preview) Updates stored repository details—such as credentials or default branches—so automation stays aligned with your source control.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `update_git_repository_details` (oci.aidataplatform_dp.models.UpdateGitRepositoryDetails) — The information to be updated.
- `git_repository_key` (string) — The Git repository key.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Git (GitClient)](#git-gitclient) • [Top](#top)

## <a id="ml-ops-mlopsclient"></a>ML Ops (MLOpsClient)
**Operations:**
- [`create_experiment`](#create-experiment)
- [`create_experiment_run`](#create-experiment-run)
- [`create_model_version`](#create-model-version)
- [`create_registered_model`](#create-registered-model)
- [`create_workspace_model_version`](#create-workspace-model-version)
- [`delete_experiment`](#delete-experiment)
- [`delete_experiment_run`](#delete-experiment-run)
- [`delete_experiment_run_tag`](#delete-experiment-run-tag)
- [`delete_experiment_tag`](#delete-experiment-tag)
- [`delete_model_version`](#delete-model-version)
- [`delete_model_version_tag`](#delete-model-version-tag)
- [`delete_registered_model`](#delete-registered-model)
- [`delete_registered_model_tag`](#delete-registered-model-tag)
- [`get_experiment_by_id`](#get-experiment-by-id)
- [`get_experiment_by_name`](#get-experiment-by-name)
- [`get_experiment_run_by_id`](#get-experiment-run-by-id)
- [`get_experiment_run_metric_history`](#get-experiment-run-metric-history)
- [`get_model_version`](#get-model-version)
- [`get_registered_model`](#get-registered-model)
- [`list_artifacts`](#list-artifacts)
- [`list_experiment_runs`](#list-experiment-runs)
- [`list_experiments`](#list-experiments)
- [`list_logged_models`](#list-logged-models)
- [`list_model_versions`](#list-model-versions)
- [`list_registered_models`](#list-registered-models)
- [`log_experiment_run_batch`](#log-experiment-run-batch)
- [`log_experiment_run_inputs`](#log-experiment-run-inputs)
- [`log_experiment_run_metric`](#log-experiment-run-metric)
- [`log_experiment_run_model`](#log-experiment-run-model)
- [`log_experiment_run_param`](#log-experiment-run-param)
- [`rename_registered_model`](#rename-registered-model)
- [`restore_experiment`](#restore-experiment)
- [`restore_experiment_run`](#restore-experiment-run)
- [`set_experiment_run_tag`](#set-experiment-run-tag)
- [`set_experiment_tag`](#set-experiment-tag)
- [`set_model_version_tag`](#set-model-version-tag)
- [`set_registered_model_tag`](#set-registered-model-tag)
- [`transition_model_version_stage`](#transition-model-version-stage)
- [`update_experiment`](#update-experiment)
- [`update_experiment_run`](#update-experiment-run)
- [`update_experiment_run_tags`](#update-experiment-run-tags)
- [`update_experiment_tags`](#update-experiment-tags)
- [`update_model_version`](#update-model-version)
- [`update_model_version_tags`](#update-model-version-tags)
- [`update_registered_model`](#update-registered-model)
- [`update_registered_model_tags`](#update-registered-model-tags)

### <a id="create-experiment"></a>`create_experiment`
(Preview) Creates an experiment in a workspace.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `create_experiment_details` (oci.aidataplatform_dp.models.CreateExperimentDetails) — Details for the new experiment.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.CreateExperimentResponseDetails

**Response Fields:**
- `experiment_id` (string) — Gets the experiment_id of this CreateExperimentResponseDetails. Unique identifier for the experiment.

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="create-experiment-run"></a>`create_experiment_run`
(Preview) Creates a new run within an experiment.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `create_experiment_run_details` (oci.aidataplatform_dp.models.CreateExperimentRunDetails) — Details for the new run.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.CreateExperimentRunResponseDetails

**Response Fields:**
- `run` (oci.aidataplatform_dp.models.ExperimentRun) — Gets the run of this CreateExperimentRunResponseDetails.

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="create-model-version"></a>`create_model_version`
(Preview) Creates a model version.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `create_model_version_details` (oci.aidataplatform_dp.models.CreateModelVersionDetails) — Details for the new model version.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.CreateModelVersionResponseDetails

**Response Fields:**
- `model_version` (oci.aidataplatform_dp.models.ModelVersion) — Gets the model_version of this CreateModelVersionResponseDetails.

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="create-registered-model"></a>`create_registered_model`
(Preview) Creates a registered model in a workspace.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `create_registered_model_details` (oci.aidataplatform_dp.models.CreateRegisteredModelDetails) — Details for the new registered model.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.CreateRegisteredModelResponseDetails

**Response Fields:**
- `registered_model` (oci.aidataplatform_dp.models.RegisteredModel) — Gets the registered_model of this CreateRegisteredModelResponseDetails.

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="create-workspace-model-version"></a>`create_workspace_model_version`
(Preview) Creates a new model version in a specified workspace.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `create_model_version_details` (oci.aidataplatform_dp.models.CreateModelVersionDetails) — Details for the new model version.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.CreateModelVersionResponseDetails

**Response Fields:**
- `model_version` (oci.aidataplatform_dp.models.ModelVersion) — Gets the model_version of this CreateModelVersionResponseDetails.

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="delete-experiment"></a>`delete_experiment`
(Preview) Deletes an experiment.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `delete_experiment_details` (oci.aidataplatform_dp.models.DeleteExperimentDetails) — Details of the experiment.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.DeleteExperimentResponseDetails

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="delete-experiment-run"></a>`delete_experiment_run`
(Preview) Deletes an experiment run.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `delete_experiment_run_details` (oci.aidataplatform_dp.models.DeleteExperimentRunDetails) — Details of the Experiment Run.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.DeleteExperimentRunResponseDetails

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="delete-experiment-run-tag"></a>`delete_experiment_run_tag`
(Preview) Deletes a tag on an experiment run.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `delete_experiment_run_tag_details` (oci.aidataplatform_dp.models.DeleteExperimentRunTagDetails) — Tag details to delete on an experiment run.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.DeleteExperimentRunTagResponseDetails

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="delete-experiment-tag"></a>`delete_experiment_tag`
(Preview) Deletes a tag on an experiment.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `delete_experiment_tag_details` (oci.aidataplatform_dp.models.DeleteExperimentTagDetails) — Tag details to delete on an experiment.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.DeleteExperimentTagResponseDetails

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="delete-model-version"></a>`delete_model_version`
(Preview) Deletes a model version.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `delete_model_version_details` (oci.aidataplatform_dp.models.DeleteModelVersionDetails) — Details of the model version to delete.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.DeleteModelVersionResponseDetails

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="delete-model-version-tag"></a>`delete_model_version_tag`
(Preview) Deletes a tag on a model version.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `delete_model_version_tag_details` (oci.aidataplatform_dp.models.DeleteModelVersionTagDetails) — Details of a model version tag to delete.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.DeleteModelVersionTagResponseDetails

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="delete-registered-model"></a>`delete_registered_model`
(Preview) Deletes a registered model.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `delete_registered_model_details` (oci.aidataplatform_dp.models.DeleteRegisteredModelDetails) — Details of the registered model to delete.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.DeleteRegisteredModelResponseDetails

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="delete-registered-model-tag"></a>`delete_registered_model_tag`
(Preview) Deletes a tag on a registered model.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `delete_registered_model_tag_details` (oci.aidataplatform_dp.models.DeleteRegisteredModelTagDetails) — Details of a registered model tag.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.DeleteRegisteredModelTagResponseDetails

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="get-experiment-by-id"></a>`get_experiment_by_id`
(Preview) Returns metadata for an experiment by ID. This method works on deleted experiments.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `experiment_id` (string) — The unique ID of the experiment to retrieve.

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.ExperimentResponse

**Response Fields:**
- `experiment` (oci.aidataplatform_dp.models.Experiment) — Gets the experiment of this ExperimentResponse.

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="get-experiment-by-name"></a>`get_experiment_by_name`
(Preview) Returns experiment metadata for a given name. Returns deleted experiments, but prefers the active experiment if an active and deleted experiment share the same name. If multiple deleted experiments share the same name, the API will return one of them.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `experiment_name` (string) — The name of the experiment to retrieve.

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.ExperimentResponse

**Response Fields:**
- `experiment` (oci.aidataplatform_dp.models.Experiment) — Gets the experiment of this ExperimentResponse.

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="get-experiment-run-by-id"></a>`get_experiment_run_by_id`
(Preview) Returns details of an experiment run by ID.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `run_id` (string) — ID of the run to fetch.

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.GetExperimentRunResponseDetails

**Response Fields:**
- `run` (oci.aidataplatform_dp.models.ExperimentRun) — Gets the run of this GetExperimentRunResponseDetails.

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="get-experiment-run-metric-history"></a>`get_experiment_run_metric_history`
(Preview) Returns a history of experiment run metrics.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `run_id` (string) — ID of the run metric history to fetch.
- `metric_key` (string) — Name of the metric key.

**Optional Parameters:**
- `page_token` (string) — Pagination token to go to the next page of metric history.
- `max_results` (number) — Maximum number of logged instances of a metric for a run to return per call. Backend servers may restrict the value of max_results depending on performance requirements. Requests that do not specify this value will behave as non-paginated queries where all metric history values for a given metric within a run are returned in a single response.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.ExperimentRunMetricHistoryCollection

**Optional Response Fields:**
- `metrics` (list[oci.aidataplatform_dp.models.ExperimentRunMetric]) — Gets the metrics of this ExperimentRunMetricHistoryCollection. Logged values for the metric.
- `next_page_token` (string) — Gets the next_page_token of this ExperimentRunMetricHistoryCollection. Token that can be used to retrieve the next page of metric history. An empty token means that no more metric history are available for retrieval.

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="get-model-version"></a>`get_model_version`
(Preview) Returns detailed information for a model version.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `name` (string) — Name of the model version.
- `version` (string) — Version number of the model version.

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.GetModelVersionResponseDetails

**Response Fields:**
- `model_version` (oci.aidataplatform_dp.models.ModelVersion) — Gets the model_version of this GetModelVersionResponseDetails.

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="get-registered-model"></a>`get_registered_model`
(Preview) Returns details for a specified registered model.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `name` (string) — Name of the registered model.

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.GetRegisteredModelResponseDetails

**Response Fields:**
- `registered_model` (oci.aidataplatform_dp.models.RegisteredModel) — Gets the registered_model of this GetRegisteredModelResponseDetails.

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="list-artifacts"></a>`list_artifacts`
(Preview) Returns a list of artifacts.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `run_id` (string) — ID of the run whose artifacts to list.

**Optional Parameters:**
- `path` (string) — Filter artifacts matching this path (a relative path from the root artifact directory).
- `page_token` (string) — Token indicating the page of artifact results to fetch.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.ArtifactList

**Optional Response Fields:**
- `root_uri` (string) — Gets the root_uri of this ArtifactList. Root artifact directory for the run.
- `files` (list[oci.aidataplatform_dp.models.ArtifactFileInfo]) — Gets the files of this ArtifactList. File location and metadata for artifacts.
- `next_page_token` (string) — Gets the next_page_token of this ArtifactList. Token that can be used to retrieve the next page of artifact results.

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="list-experiment-runs"></a>`list_experiment_runs`
(Preview) Returns a list of experiment runs in a workspace.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `list_experiment_runs_details` (oci.aidataplatform_dp.models.ListExperimentRunsDetails) — Details of experiment runs to fetch.

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.ExperimentRunCollection

**Response Fields:**
- `runs` (list[oci.aidataplatform_dp.models.ExperimentRun]) — Gets the runs of this ExperimentRunCollection. Runs that match the search criteria.

**Optional Response Fields:**
- `next_page_token` (string) — Gets the next_page_token of this ExperimentRunCollection. Token that can be used to retrieve the next page of runs. An empty token means that no more runs are available for retrieval.

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="list-experiments"></a>`list_experiments`
(Preview) Returns a list of experiments with the given details.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `list_experiments_details` (oci.aidataplatform_dp.models.ListExperimentsDetails) — Details of experiments to fetch.

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.ExperimentCollection

**Response Fields:**
- `experiments` (list[oci.aidataplatform_dp.models.Experiment]) — Gets the experiments of this ExperimentCollection. Experiments that match the search criteria.

**Optional Response Fields:**
- `next_page_token` (string) — Gets the next_page_token of this ExperimentCollection. Token that can be used to retrieve the next page of experiments. An empty token means that no more experiments are available for retrieval.

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="list-logged-models"></a>`list_logged_models`
(Preview) Returns a list of logged models.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `list_logged_models_details` (oci.aidataplatform_dp.models.ListLoggedModelsDetails) — Details of logged models to fetch.

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.LoggedModelCollection

**Optional Response Fields:**
- `models` (list[oci.aidataplatform_dp.models.LoggedModel]) — Gets the models of this LoggedModelCollection. Logged models that match the search criteria
- `next_page_token` (string) — Gets the next_page_token of this LoggedModelCollection. Token that can be used to retrieve the next page of logged-models. An empty token means that no more logged-models are available for retrieval.

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="list-model-versions"></a>`list_model_versions`
(Preview) Returns a list of model versions.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

**Optional Parameters:**
- `filter` (string) — String filter condition, like "name LIKE 'my-model-name'". Single boolean condition, with string values wrapped in single quotes.
- `max_results` (number) — Maximum number of model versions to retrieve.
- `page_token` (string) — Pagination token to go to the next page based on a previous search query.
- `order_by` (string) — List of columns to be ordered by including model name, version, stage with an optional "DESC" or "ASC" annotation, where "ASC" is the default. Tiebreaks are done by latest stage transition timestamp, followed by name ASC, followed by version DESC.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.ModelVersionCollection

**Response Fields:**
- `model_versions` (list[oci.aidataplatform_dp.models.ModelVersion]) — Gets the model_versions of this ModelVersionCollection. Model versions that match the search criteria.

**Optional Response Fields:**
- `next_page_token` (string) — Gets the next_page_token of this ModelVersionCollection. Token that can be used to retrieve the next page of model versions.

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="list-registered-models"></a>`list_registered_models`
(Preview) Returns a list of registered models in a workspace.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

**Optional Parameters:**
- `filter` (string) — String filter condition, like "name LIKE 'my-model-name'". Interpreted in the backend automatically as "name LIKE '%my-model-name%'". Single boolean condition, with string values wrapped in single quotes.
- `max_results` (number) — Maximum number of models desired. Default is 100. Max threshold is 1000.
- `page_token` (string) — Pagination token to go to the next page based on a previous search query.
- `order_by` (string) — List of columns for ordering search results, which can include model name and last updated timestamp with an optional "DESC" or "ASC" annotation, where "ASC" is the default. Tiebreaks are done by model name ASC.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.RegisteredModelCollection

**Response Fields:**
- `registered_models` (list[oci.aidataplatform_dp.models.RegisteredModel]) — Gets the registered_models of this RegisteredModelCollection. Registered models that match the search criteria.

**Optional Response Fields:**
- `next_page_token` (string) — Gets the next_page_token of this RegisteredModelCollection. Token that can be used to retrieve the next page of registered models.

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="log-experiment-run-batch"></a>`log_experiment_run_batch`
(Preview) Logs an experiment run batch.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `log_experiment_run_batch_details` (oci.aidataplatform_dp.models.LogExperimentRunBatchDetails) — Details of an experiment run batch.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.LogExperimentRunBatchResponseDetails

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="log-experiment-run-inputs"></a>`log_experiment_run_inputs`
(Preview) Logs experiment run inputs.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `log_experiment_run_inputs_details` (oci.aidataplatform_dp.models.LogExperimentRunInputsDetails) — Details of experiment run inputs.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.LogExperimentRunInputsResponseDetails

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="log-experiment-run-metric"></a>`log_experiment_run_metric`
(Preview) Logs an experiment run metric.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `log_experiment_run_metric_details` (oci.aidataplatform_dp.models.LogExperimentRunMetricDetails) — Details of an experiment run metric.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.LogExperimentRunMetricResponseDetails

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="log-experiment-run-model"></a>`log_experiment_run_model`
(Preview) Logs an experiment run model.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `log_experiment_run_model_details` (oci.aidataplatform_dp.models.LogExperimentRunModelDetails) — Details of an experiment run model.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.LogExperimentRunModelResponseDetails

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="log-experiment-run-param"></a>`log_experiment_run_param`
(Preview) Logs an experiment run parameter.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `log_experiment_run_param_details` (oci.aidataplatform_dp.models.LogExperimentRunParamDetails) — Details of an experiment run parameter.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.LogExperimentRunParamResponseDetails

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="rename-registered-model"></a>`rename_registered_model`
(Preview) Renames a registered model.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `rename_registered_model_details` (oci.aidataplatform_dp.models.RenameRegisteredModelDetails) — Details of a registered model rename.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.RenameRegisteredModelResponseDetails

**Response Fields:**
- `registered_model` (oci.aidataplatform_dp.models.RegisteredModel) — Gets the registered_model of this RenameRegisteredModelResponseDetails.

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="restore-experiment"></a>`restore_experiment`
(Preview) Restores an experiment.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `restore_experiment_details` (oci.aidataplatform_dp.models.RestoreExperimentDetails) — Restore experiment details.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.RestoreExperimentResponseDetails

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="restore-experiment-run"></a>`restore_experiment_run`
(Preview) Restores an experiment run.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `restore_experiment_run_details` (oci.aidataplatform_dp.models.RestoreExperimentRunDetails) — Restore experiment run details.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.RestoreExperimentRunResponseDetails

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="set-experiment-run-tag"></a>`set_experiment_run_tag`
(Preview) Sets a tag on an experiment run.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `set_experiment_run_tag_details` (oci.aidataplatform_dp.models.SetExperimentRunTagDetails) — Tag details to set on an experiment run.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.SetExperimentRunTagResponseDetails

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="set-experiment-tag"></a>`set_experiment_tag`
(Preview) Sets a tag on an experiment.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `set_experiment_tag_details` (oci.aidataplatform_dp.models.SetExperimentTagDetails) — Tag details to set on an experiment.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.SetExperimentTagResponseDetails

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="set-model-version-tag"></a>`set_model_version_tag`
(Preview) Sets a tag on a model version.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `set_model_version_tag_details` (oci.aidataplatform_dp.models.SetModelVersionTagDetails) — Details of a model version tag.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.SetModelVersionTagResponseDetails

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="set-registered-model-tag"></a>`set_registered_model_tag`
(Preview) Sets a tag on a registered model.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `set_registered_model_tag_details` (oci.aidataplatform_dp.models.SetRegisteredModelTagDetails) — Details of a registered model tag.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.SetRegisteredModelTagResponseDetails

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="transition-model-version-stage"></a>`transition_model_version_stage`
(Preview) Transitions a model version stage.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `transition_model_version_stage_details` (oci.aidataplatform_dp.models.TransitionModelVersionStageDetails) — Details to transition a model version stage.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.TransitionModelVersionStageResponseDetails

**Response Fields:**
- `model_version` (oci.aidataplatform_dp.models.ModelVersion) — Gets the model_version of this TransitionModelVersionStageResponseDetails.

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="update-experiment"></a>`update_experiment`
(Preview) Updates an experiment.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `update_experiment_details` (oci.aidataplatform_dp.models.UpdateExperimentDetails) — Update experiment metadata.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.UpdateExperimentResponseDetails

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="update-experiment-run"></a>`update_experiment_run`
(Preview) Updates an experiment run.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `update_experiment_run_details` (oci.aidataplatform_dp.models.UpdateExperimentRunDetails) — Update experiment run details.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.UpdateExperimentRunResponseDetails

**Response Fields:**
- `run_info` (oci.aidataplatform_dp.models.ExperimentRunInfo) — Gets the run_info of this UpdateExperimentRunResponseDetails.

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="update-experiment-run-tags"></a>`update_experiment_run_tags`
(Preview) Updates tags on an experiment run.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `update_experiment_run_tags_details` (oci.aidataplatform_dp.models.UpdateExperimentRunTagsDetails) — Details of ExperimentRun tags.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.UpdateExperimentRunTagsResponseDetails

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="update-experiment-tags"></a>`update_experiment_tags`
(Preview) Updates tags on experiment.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `update_experiment_tags_details` (oci.aidataplatform_dp.models.UpdateExperimentTagsDetails) — Details of Experiment tags.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.UpdateExperimentTagsResponseDetails

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="update-model-version"></a>`update_model_version`
(Preview) Updates a model version

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `update_model_version_details` (oci.aidataplatform_dp.models.UpdateModelVersionDetails) — Details to update model version.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.UpdateModelVersionResponseDetails

**Response Fields:**
- `model_version` (oci.aidataplatform_dp.models.ModelVersion) — Gets the model_version of this UpdateModelVersionResponseDetails.

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="update-model-version-tags"></a>`update_model_version_tags`
(Preview) Updates tags on a model version.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `update_model_version_tags_details` (oci.aidataplatform_dp.models.UpdateModelVersionTagsDetails) — Details of model version tags to update.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.UpdateModelVersionTagsResponseDetails

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="update-registered-model"></a>`update_registered_model`
(Preview) Updates a registered model with the provided details.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `update_registered_model_details` (oci.aidataplatform_dp.models.UpdateRegisteredModelDetails) — Details to update the registered model.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.UpdateRegisteredModelResponseDetails

**Response Fields:**
- `registered_model` (oci.aidataplatform_dp.models.RegisteredModel) — Gets the registered_model of this UpdateRegisteredModelResponseDetails.

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

### <a id="update-registered-model-tags"></a>`update_registered_model_tags`
(Preview) Updates tags on a registered model.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `update_registered_model_tags_details` (oci.aidataplatform_dp.models.UpdateRegisteredModelTagsDetails) — Details of registered model tags.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.UpdateRegisteredModelTagsResponseDetails

**Return:** [Back to ML Ops (MLOpsClient)](#ml-ops-mlopsclient) • [Top](#top)

## <a id="notebook-notebookclient"></a>Notebook (NotebookClient)
**Operations:**
- [`create_content`](#create-content)
- [`create_session`](#create-session)
- [`delete_content`](#delete-content)
- [`delete_session`](#delete-session)
- [`export_contents`](#export-contents)
- [`get_content`](#get-content)
- [`get_session`](#get-session)
- [`list_sessions`](#list-sessions)
- [`modify_content`](#modify-content)
- [`patch_session`](#patch-session)
- [`update_content`](#update-content)

### <a id="create-content"></a>`create_content`
Creates a new, untitled, empty file or directory, or copies an existing notebook to a specified path. For example, a POST call to /api/contents/path with body containing copy_from set to /path/to/OtherNotebook.ipynb creates a new copy of OtherNotebook at the specified path.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `content_path` (string) — The path to the notebook file.
- `create_content_details` (oci.aidataplatform_dp.models.CreateContentDetails) — Notebook content to create a new notebook.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `datalake_tenant_id` (string) — The tenant ID header.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.Content

**Response Fields:**
- `name` (string) — Gets the name of this Content. Name of notebook, file or directory, equivalent to the last part of the path.
- `path` (string) — Gets the path of this Content. Full path for notebook, file or directory.
- `type` (string) — Gets the type of this Content. Type of content model. Allowed values for this property are: "notebook", "file", "directory", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `writable` (boolean) — Gets the writable of this Content. Indicates whether the requester has permission to edit the file.
- `created` (datetime) — Gets the created of this Content. Creation timestamp.
- `last_modified` (datetime) — Gets the last_modified of this Content. Last modified timestamp.
- `mimetype` (string) — Gets the mimetype of this Content. Mimetype is only applicable for File model. For other models, it is None. If content is not null, and type is 'file', this contains the mimetype of file. For example, text/plain application/octet-stream. Otherwise this is null.
- `content` (object) — Gets the content of this Content. Content if requested, otherwise is Null. For Notebook model, this contains a nbformat NotebookNode representing the .ipynb file represented by the model. For File model, content field is always Unicode type. For text-format file models, content simply contains the bytes of the file after decoding as UTF-8. Non-text (base64) files are read as bytes, base64 encoded, and then decoded as UTF-8. For Directory model, content field contains a list of content-free models representing the entities in the directory.
- `format` (string) — Gets the format of this Content. Format of content. For Notebook model, format field is always 'json'. For File model, format field is either 'text' or 'base64'. For directory model, format field is always 'json'. Allowed values for this property are: "NULL", "json", "text", "base64", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.

**Optional Response Fields:**
- `size` (number) — Gets the size of this Content. Size of file or notebook in bytes. If no size is provided, defaults to null.
- `hash` (string) — Gets the hash of this Content. [optional] The hexdigest hash string of content, if requested, otherwise null. It cannot be null if hashAlgorithm is defined.
- `hash_algorithm` (string) — Gets the hash_algorithm of this Content. [optional] The algorithm used to produce the hash, if requested, (otherwise null). It cannot be null if hash is defined. <a href="https://docs.python.org/3/library/hashlib.html#hashlib.algorithms_available" target="_blank" rel="noopener noreferrer">Available algorithms</a>.
- `description` (string) — Gets the description of this Content. A user-provided description of the file.

**Return:** [Back to Notebook (NotebookClient)](#notebook-notebookclient) • [Top](#top)

### <a id="create-session"></a>`create_session`
Creates a new session or returns an existing session if a session for the given path already exists.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `create_session_details` (oci.aidataplatform_dp.models.CreateSessionDetails) — Details to create a new session.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `datalake_tenant_id` (string) — The tenant ID header.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.Session

**Response Fields:**
- `id` (string) — Gets the id of this Session. UUID of the notebook session.
- `name` (string) — Gets the name of this Session. A user-friendly name for the notebook session.

**Optional Response Fields:**
- `path` (string) — Gets the path of this Session. Path to notebook session. For example, /data/test.ipynb
- `type` (string) — Gets the type of this Session. Notebook session type. Allowed values for this property are: "notebook", "file", "agentflow", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `cluster_id` (string) — Gets the cluster_id of this Session. Cluster ID.
- `kernel` (oci.aidataplatform_dp.models.Kernel) — Gets the kernel of this Session.
- `agentFlowKey` (string) — Gets the agent_flow_key of this Session. Agent Flow Key of an agent flow.
- `lifecycleState` (string) — Gets the lifecycle_state of this Session. lifecycleState of a Notebook Session. Allowed values for this property are: "CREATING", "ACTIVE", "FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.

**Return:** [Back to Notebook (NotebookClient)](#notebook-notebookclient) • [Top](#top)

### <a id="delete-content"></a>`delete_content`
Deletes a notebook file or directory.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `content_path` (string) — The path to the notebook file.

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Notebook (NotebookClient)](#notebook-notebookclient) • [Top](#top)

### <a id="delete-session"></a>`delete_session`
Delete a session with given session ID.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `session_id` (string) — The ID of the Data Lake Notebook Session

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Notebook (NotebookClient)](#notebook-notebookclient) • [Top](#top)

### <a id="export-contents"></a>`export_contents`
Exports the notebook file contents. You can optionally specify HTML or ipynb format through the request payload. If no format is specified, ipynb is used by default.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `content_path` (string) — The path to the notebook file.
- `export_contents_details` (oci.aidataplatform_dp.models.ExportContentsDetails) — Payload to export contents of a file.

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.ExportedContents

**Response Fields:**
- `name` (string) — Gets the name of this ExportedContents. Name of file, equivalent to the last part of the path.
- `path` (string) — Gets the path of this ExportedContents. Full path of the file.
- `content` (object) — Gets the content of this ExportedContents. For ipynb format, this contains a string representing the .ipynb file. For html format, this contains a string representing the HTML page, it has base64 encoded data for images.
- `format` (string) — Gets the format of this ExportedContents. Format of content as requested by the client. By default, ipynb format. Allowed values for this property are: "html", "ipynb", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.

**Return:** [Back to Notebook (NotebookClient)](#notebook-notebookclient) • [Top](#top)

### <a id="get-content"></a>`get_content`
Returns content for a given file or metadata for a directory. Directory content listing is not supported; requests with type=directory and content=1 return 400 and should use content=0 to retrieve directory metadata. You can optionally specify a type and/or format argument via URL parameter. When given, the Content service returns a model in the requested type and/or format. If the request cannot be satisfied, for example if type=text is requested, but the file is binary, then the request returns a 400 message and a JSON response with a Reason field identifying the issue. The value of the Reason field is ‘bad format’ or ‘bad type’, depending on what was requested.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `content_path` (string) — The path to the notebook file.

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `type` (string) — Content type. Either file, directory, or notebook. Allowed values are: "file", "directory", "notebook"
- `format` (string) — The format in which content should be returned. Either text, base64, or JSON. Allowed values are: "text", "base64", "json"
- `content` (number) — Returns content based on param value. When set to 0, content is NOT returned. When set to 1, content is returned.
- `hash` (number) — Returns hash hexdigest string of content and the hash algorithm. 0 for no hash, 1 for return hash. 0 is default. It may be ignored by the content manager.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.Content

**Response Fields:**
- `name` (string) — Gets the name of this Content. Name of notebook, file or directory, equivalent to the last part of the path.
- `path` (string) — Gets the path of this Content. Full path for notebook, file or directory.
- `type` (string) — Gets the type of this Content. Type of content model. Allowed values for this property are: "notebook", "file", "directory", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `writable` (boolean) — Gets the writable of this Content. Indicates whether the requester has permission to edit the file.
- `created` (datetime) — Gets the created of this Content. Creation timestamp.
- `last_modified` (datetime) — Gets the last_modified of this Content. Last modified timestamp.
- `mimetype` (string) — Gets the mimetype of this Content. Mimetype is only applicable for File model. For other models, it is None. If content is not null, and type is 'file', this contains the mimetype of file. For example, text/plain application/octet-stream. Otherwise this is null.
- `content` (object) — Gets the content of this Content. Content if requested, otherwise is Null. For Notebook model, this contains a nbformat NotebookNode representing the .ipynb file represented by the model. For File model, content field is always Unicode type. For text-format file models, content simply contains the bytes of the file after decoding as UTF-8. Non-text (base64) files are read as bytes, base64 encoded, and then decoded as UTF-8. For Directory model, content field contains a list of content-free models representing the entities in the directory.
- `format` (string) — Gets the format of this Content. Format of content. For Notebook model, format field is always 'json'. For File model, format field is either 'text' or 'base64'. For directory model, format field is always 'json'. Allowed values for this property are: "NULL", "json", "text", "base64", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.

**Optional Response Fields:**
- `size` (number) — Gets the size of this Content. Size of file or notebook in bytes. If no size is provided, defaults to null.
- `hash` (string) — Gets the hash of this Content. [optional] The hexdigest hash string of content, if requested, otherwise null. It cannot be null if hashAlgorithm is defined.
- `hash_algorithm` (string) — Gets the hash_algorithm of this Content. [optional] The algorithm used to produce the hash, if requested, (otherwise null). It cannot be null if hash is defined. <a href="https://docs.python.org/3/library/hashlib.html#hashlib.algorithms_available" target="_blank" rel="noopener noreferrer">Available algorithms</a>.
- `description` (string) — Gets the description of this Content. A user-provided description of the file.

**Return:** [Back to Notebook (NotebookClient)](#notebook-notebookclient) • [Top](#top)

### <a id="get-session"></a>`get_session`
Returns session details for a given session ID.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `session_id` (string) — The ID of the Data Lake Notebook Session

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.Session

**Response Fields:**
- `id` (string) — Gets the id of this Session. UUID of the notebook session.
- `name` (string) — Gets the name of this Session. A user-friendly name for the notebook session.

**Optional Response Fields:**
- `path` (string) — Gets the path of this Session. Path to notebook session. For example, /data/test.ipynb
- `type` (string) — Gets the type of this Session. Notebook session type. Allowed values for this property are: "notebook", "file", "agentflow", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `cluster_id` (string) — Gets the cluster_id of this Session. Cluster ID.
- `kernel` (oci.aidataplatform_dp.models.Kernel) — Gets the kernel of this Session.
- `agentFlowKey` (string) — Gets the agent_flow_key of this Session. Agent Flow Key of an agent flow.
- `lifecycleState` (string) — Gets the lifecycle_state of this Session. lifecycleState of a Notebook Session. Allowed values for this property are: "CREATING", "ACTIVE", "FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.

**Return:** [Back to Notebook (NotebookClient)](#notebook-notebookclient) • [Top](#top)

### <a id="list-sessions"></a>`list_sessions`
Returns a list of all available sessions.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace

**Optional Parameters:**
- `cluster_id` (string) — Cluster ID attached to a session.
- `path` (string) — Notebook file path attached to a session.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `agent_flow_key` (string) — Agent flow key of the attached agent flow.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Allowed values are: "timeCreated"
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.SessionCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.SessionSummary]) — Gets the items of this SessionCollection. List of sessions.

**Return:** [Back to Notebook (NotebookClient)](#notebook-notebookclient) • [Top](#top)

### <a id="modify-content"></a>`modify_content`
Renames a file or directory without re-uploading content.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `content_path` (string) — The path to the notebook file.
- `modify_content_details` (oci.aidataplatform_dp.models.ModifyContentDetails) — New path for file or directory.

**Optional Parameters:**
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.Content

**Response Fields:**
- `name` (string) — Gets the name of this Content. Name of notebook, file or directory, equivalent to the last part of the path.
- `path` (string) — Gets the path of this Content. Full path for notebook, file or directory.
- `type` (string) — Gets the type of this Content. Type of content model. Allowed values for this property are: "notebook", "file", "directory", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `writable` (boolean) — Gets the writable of this Content. Indicates whether the requester has permission to edit the file.
- `created` (datetime) — Gets the created of this Content. Creation timestamp.
- `last_modified` (datetime) — Gets the last_modified of this Content. Last modified timestamp.
- `mimetype` (string) — Gets the mimetype of this Content. Mimetype is only applicable for File model. For other models, it is None. If content is not null, and type is 'file', this contains the mimetype of file. For example, text/plain application/octet-stream. Otherwise this is null.
- `content` (object) — Gets the content of this Content. Content if requested, otherwise is Null. For Notebook model, this contains a nbformat NotebookNode representing the .ipynb file represented by the model. For File model, content field is always Unicode type. For text-format file models, content simply contains the bytes of the file after decoding as UTF-8. Non-text (base64) files are read as bytes, base64 encoded, and then decoded as UTF-8. For Directory model, content field contains a list of content-free models representing the entities in the directory.
- `format` (string) — Gets the format of this Content. Format of content. For Notebook model, format field is always 'json'. For File model, format field is either 'text' or 'base64'. For directory model, format field is always 'json'. Allowed values for this property are: "NULL", "json", "text", "base64", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.

**Optional Response Fields:**
- `size` (number) — Gets the size of this Content. Size of file or notebook in bytes. If no size is provided, defaults to null.
- `hash` (string) — Gets the hash of this Content. [optional] The hexdigest hash string of content, if requested, otherwise null. It cannot be null if hashAlgorithm is defined.
- `hash_algorithm` (string) — Gets the hash_algorithm of this Content. [optional] The algorithm used to produce the hash, if requested, (otherwise null). It cannot be null if hash is defined. <a href="https://docs.python.org/3/library/hashlib.html#hashlib.algorithms_available" target="_blank" rel="noopener noreferrer">Available algorithms</a>.
- `description` (string) — Gets the description of this Content. A user-provided description of the file.

**Return:** [Back to Notebook (NotebookClient)](#notebook-notebookclient) • [Top](#top)

### <a id="patch-session"></a>`patch_session`
Patches a session with a given ID with the provided details. You can use this to rename a session.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `session_id` (string) — The ID of the Data Lake Notebook Session
- `patch_session_details` (oci.aidataplatform_dp.models.PatchSessionDetails) — Details to patch for an existing session.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.Session

**Response Fields:**
- `id` (string) — Gets the id of this Session. UUID of the notebook session.
- `name` (string) — Gets the name of this Session. A user-friendly name for the notebook session.

**Optional Response Fields:**
- `path` (string) — Gets the path of this Session. Path to notebook session. For example, /data/test.ipynb
- `type` (string) — Gets the type of this Session. Notebook session type. Allowed values for this property are: "notebook", "file", "agentflow", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `cluster_id` (string) — Gets the cluster_id of this Session. Cluster ID.
- `kernel` (oci.aidataplatform_dp.models.Kernel) — Gets the kernel of this Session.
- `agentFlowKey` (string) — Gets the agent_flow_key of this Session. Agent Flow Key of an agent flow.
- `lifecycleState` (string) — Gets the lifecycle_state of this Session. lifecycleState of a Notebook Session. Allowed values for this property are: "CREATING", "ACTIVE", "FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.

**Return:** [Back to Notebook (NotebookClient)](#notebook-notebookclient) • [Top](#top)

### <a id="update-content"></a>`update_content`
Updates the contents of an existing notebook with the provided details or saves a new notebook.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `content_path` (string) — The path to the notebook file.
- `update_content_details` (oci.aidataplatform_dp.models.UpdateContentDetails) — Details to update the notebook content model file.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.Content

**Response Fields:**
- `name` (string) — Gets the name of this Content. Name of notebook, file or directory, equivalent to the last part of the path.
- `path` (string) — Gets the path of this Content. Full path for notebook, file or directory.
- `type` (string) — Gets the type of this Content. Type of content model. Allowed values for this property are: "notebook", "file", "directory", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `writable` (boolean) — Gets the writable of this Content. Indicates whether the requester has permission to edit the file.
- `created` (datetime) — Gets the created of this Content. Creation timestamp.
- `last_modified` (datetime) — Gets the last_modified of this Content. Last modified timestamp.
- `mimetype` (string) — Gets the mimetype of this Content. Mimetype is only applicable for File model. For other models, it is None. If content is not null, and type is 'file', this contains the mimetype of file. For example, text/plain application/octet-stream. Otherwise this is null.
- `content` (object) — Gets the content of this Content. Content if requested, otherwise is Null. For Notebook model, this contains a nbformat NotebookNode representing the .ipynb file represented by the model. For File model, content field is always Unicode type. For text-format file models, content simply contains the bytes of the file after decoding as UTF-8. Non-text (base64) files are read as bytes, base64 encoded, and then decoded as UTF-8. For Directory model, content field contains a list of content-free models representing the entities in the directory.
- `format` (string) — Gets the format of this Content. Format of content. For Notebook model, format field is always 'json'. For File model, format field is either 'text' or 'base64'. For directory model, format field is always 'json'. Allowed values for this property are: "NULL", "json", "text", "base64", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.

**Optional Response Fields:**
- `size` (number) — Gets the size of this Content. Size of file or notebook in bytes. If no size is provided, defaults to null.
- `hash` (string) — Gets the hash of this Content. [optional] The hexdigest hash string of content, if requested, otherwise null. It cannot be null if hashAlgorithm is defined.
- `hash_algorithm` (string) — Gets the hash_algorithm of this Content. [optional] The algorithm used to produce the hash, if requested, (otherwise null). It cannot be null if hash is defined. <a href="https://docs.python.org/3/library/hashlib.html#hashlib.algorithms_available" target="_blank" rel="noopener noreferrer">Available algorithms</a>.
- `description` (string) — Gets the description of this Content. A user-provided description of the file.

**Return:** [Back to Notebook (NotebookClient)](#notebook-notebookclient) • [Top](#top)

## <a id="role-roleclient"></a>Role (RoleClient)
**Operations:**
- [`add_member_to_role`](#add-member-to-role)
- [`create_role`](#create-role)
- [`delete_role`](#delete-role)
- [`get_role`](#get-role)
- [`list_role_permissions`](#list-role-permissions)
- [`list_roles`](#list-roles)
- [`remove_member_from_role`](#remove-member-from-role)
- [`update_role`](#update-role)

### <a id="add-member-to-role"></a>`add_member_to_role`
Assigns a given user/group/principal to a role.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `role_key` (string) — The unique key of the Role.
- `add_member_to_role_details` (oci.aidataplatform_dp.models.AddMemberToRoleDetails) — The details of the assignee(s) to which a role is assigned.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Role (RoleClient)](#role-roleclient) • [Top](#top)

### <a id="create-role"></a>`create_role`
Creates a role.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `create_role_details` (oci.aidataplatform_dp.models.CreateRoleDetails) — Details for the new role.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.Role

**Response Fields:**
- `key` (string) — Gets the key of this Role. A unique key for the role. It cannot be changed.

**Optional Response Fields:**
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

**Return:** [Back to Role (RoleClient)](#role-roleclient) • [Top](#top)

### <a id="delete-role"></a>`delete_role`
Deletes a role.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `role_key` (string) — The unique key of the Role.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Role (RoleClient)](#role-roleclient) • [Top](#top)

### <a id="get-role"></a>`get_role`
Returns detailed information about a role.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `role_key` (string) — The unique key of the Role.

**Optional Parameters:**
- `role_scope` (string) — The scope of roles to be returned. Defaults to USER. Allowed values are: "USER", "ADMIN", "MEMBER_OF"
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.Role

**Response Fields:**
- `key` (string) — Gets the key of this Role. A unique key for the role. It cannot be changed.

**Optional Response Fields:**
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

**Return:** [Back to Role (RoleClient)](#role-roleclient) • [Top](#top)

### <a id="list-role-permissions"></a>`list_role_permissions`
Returns a list of permissions for a given role.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `role_key` (string) — The unique key of the Role.

**Optional Parameters:**
- `permission_scope` (string) — The scope of role permissions to be returned. Defaults to ALL Allowed values are: "DIRECT", "INHERITED", "ALL"
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.RolePermissionCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.RolePermissionSummary]) — Gets the items of this RolePermissionCollection. Role permissions.

**Return:** [Back to Role (RoleClient)](#role-roleclient) • [Top](#top)

### <a id="list-roles"></a>`list_roles`
Returns a list of roles.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

**Optional Parameters:**
- `lifecycle_state` (string) — A filter to return only resources that match the given lifecycle state. The state value is case-insensitive. Allowed values are: "ACTIVE"
- `display_name` (string) — A filter to return only resources that match the given display name exactly.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.RoleCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.RoleSummary]) — Gets the items of this RoleCollection. The role summaries returned.

**Return:** [Back to Role (RoleClient)](#role-roleclient) • [Top](#top)

### <a id="remove-member-from-role"></a>`remove_member_from_role`
Revoke a role from a given user or group.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `role_key` (string) — The unique key of the Role.
- `remove_member_from_role_details` (oci.aidataplatform_dp.models.RemoveMemberFromRoleDetails) — The details of the user or group from which the role is to be revoked.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Role (RoleClient)](#role-roleclient) • [Top](#top)

### <a id="update-role"></a>`update_role`
Updates a role with the provided information.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `role_key` (string) — The unique key of the Role.
- `update_role_details` (oci.aidataplatform_dp.models.UpdateRoleDetails) — The information to be updated.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.Role

**Response Fields:**
- `key` (string) — Gets the key of this Role. A unique key for the role. It cannot be changed.

**Optional Response Fields:**
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

**Return:** [Back to Role (RoleClient)](#role-roleclient) • [Top](#top)

## <a id="schema-schemaclient"></a>Schema (SchemaClient)
**Operations:**
- [`create_data_table`](#create-data-table)
- [`create_schema`](#create-schema)
- [`create_table`](#create-table)
- [`create_view`](#create-view)
- [`delete_schema`](#delete-schema)
- [`delete_table`](#delete-table)
- [`delete_view`](#delete-view)
- [`generate_temp_file_upload_target`](#generate-temp-file-upload-target)
- [`get_schema`](#get-schema)
- [`get_table`](#get-table)
- [`get_view`](#get-view)
- [`list_schema_permissions`](#list-schema-permissions)
- [`list_schemas`](#list-schemas)
- [`list_table_permissions`](#list-table-permissions)
- [`list_tables`](#list-tables)
- [`list_view_permissions`](#list-view-permissions)
- [`list_views`](#list-views)
- [`manage_schema_permission`](#manage-schema-permission)
- [`manage_table_permission`](#manage-table-permission)
- [`manage_view_permission`](#manage-view-permission)
- [`perform_infer_schema`](#perform-infer-schema)
- [`perform_infer_schema_with_preview`](#perform-infer-schema-with-preview)
- [`refresh_schema`](#refresh-schema)
- [`refresh_table`](#refresh-table)
- [`retrieve_par`](#retrieve-par)
- [`update_schema`](#update-schema)
- [`update_table`](#update-table)
- [`update_view`](#update-view)

### <a id="create-data-table"></a>`create_data_table`
Creates a managed table with data loaded from a sample file.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `create_data_table_details` (oci.aidataplatform_dp.models.CreateDataTableDetails) — Details for the new managed table with data.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### <a id="create-schema"></a>`create_schema`
Creates a schema.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `create_schema_details` (oci.aidataplatform_dp.models.CreateSchemaDetails) — Details for the new schema.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### <a id="create-table"></a>`create_table`
Creates a table.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `create_table_details` (oci.aidataplatform_dp.models.CreateTableDetails) — Details for the new table.

**Optional Parameters:**
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### <a id="create-view"></a>`create_view`
Creates a view.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `create_view_details` (oci.aidataplatform_dp.models.CreateViewDetails) — Details for the new view.

**Optional Parameters:**
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.View

**Response Fields:**
- `displayName` (string) — Gets the display_name of this View. A user-friendly name. Has to be unique within the scope of the schema and is changeable.

**Optional Response Fields:**
- `key` (string) — Gets the key of this View. The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>
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

**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### <a id="delete-schema"></a>`delete_schema`
Deletes a schema.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `schema_key` (string) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.

**Optional Parameters:**
- `is_forced` (boolean) — A boolean which decides if an entity should be deleted with Cascade effect
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### <a id="delete-table"></a>`delete_table`
Deletes a table.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `table_key` (string) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.

**Optional Parameters:**
- `display_name` (string) — A filter to return only resources that match the given display name exactly.
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### <a id="delete-view"></a>`delete_view`
Deletes a view.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `view_key` (string) — The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>.

**Optional Parameters:**
- `display_name` (string) — A filter to return only resources that match the given display name exactly.
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### <a id="generate-temp-file-upload-target"></a>`generate_temp_file_upload_target`
Generates a URI for uploading a sample file to a temporary folder in a schema.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `schema_key` (string) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.GenerateTempFileUploadTargetResponseDetails

**Response Fields:**
- `tempFileUploadTarget` (string) — Gets the temp_file_upload_target of this GenerateTempFileUploadTargetResponseDetails. The generated target URI to upload the file, it must be prefixed by object stroage URL.
- `uploadKey` (string) — Gets the upload_key of this GenerateTempFileUploadTargetResponseDetails. The unique key for this request.
- `ociFilePath` (string) — Gets the oci_file_path of this GenerateTempFileUploadTargetResponseDetails. The exact URI path of the object storage.

**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### <a id="get-schema"></a>`get_schema`
Returns detailed information about a specified schema.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `schema_key` (string) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.

**Optional Parameters:**
- `should_skip_ocid_translation` (boolean) — When true, skip user OCID translation and return raw OCIDs.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.Schema

**Response Fields:**
- `entityType` (string) — Gets the entity_type of this Schema. An enum to decide the type of the derived model. Allowed values for this property are: "ADW", "ALH", "STANDARD", "KAFKA_TOPIC", "ATP", "ORACLE", "EXADATA", "MYSQL", "DB2", "AZURE_SQLSERVER", "SNOWFLAKE", "ORACLE_ANALYTICS", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `key` (string) — Gets the key of this Schema. The fully qualified name of the schema in the format <catalog_name>.<schema_name>.
- `displayName` (string) — Gets the display_name of this Schema. Schema name.

**Optional Response Fields:**
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

**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### <a id="get-table"></a>`get_table`
Returns detailed information about a table.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `table_key` (string) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.

**Optional Parameters:**
- `should_skip_ocid_translation` (boolean) — When true, skip user OCID translation and return raw OCIDs.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.Table

**Response Fields:**
- `entityType` (string) — Gets the entity_type of this Table. An enum to decide the type of the derived model Allowed values for this property are: "ADW", "ALH", "STANDARD", "ATP", "ORACLE", "EXADATA", "MYSQL", "DB2", "AZURE_SQLSERVER", "SNOWFLAKE", "ORACLE_ANALYTICS", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `displayName` (string) — Gets the display_name of this Table. Table name.

**Optional Response Fields:**
- `key` (string) — Gets the key of this Table. The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.
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

**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### <a id="get-view"></a>`get_view`
Returns information about a view.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `view_key` (string) — The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>.

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.View

**Response Fields:**
- `displayName` (string) — Gets the display_name of this View. A user-friendly name. Has to be unique within the scope of the schema and is changeable.

**Optional Response Fields:**
- `key` (string) — Gets the key of this View. The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>
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

**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### <a id="list-schema-permissions"></a>`list_schema_permissions`
Returns a list of permissions for a given schema.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `schema_key` (string) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.

**Optional Parameters:**
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.SchemaPermissionCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.SchemaPermissionSummary]) — Gets the items of this SchemaPermissionCollection. List of schema permissions.

**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### <a id="list-schemas"></a>`list_schemas`
Returns a list of schemas.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `catalog_key` (string) — The key of the catalog.

**Optional Parameters:**
- `should_skip_ocid_translation` (boolean) — When true, skip user OCID translation and return raw OCIDs.
- `display_name` (string) — A filter to return only resources that match the given display name exactly.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.SchemaCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.SchemaSummary]) — Gets the items of this SchemaCollection. List of schemas.

**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### <a id="list-table-permissions"></a>`list_table_permissions`
Returns a list of permissions for a given table.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `table_key` (string) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.

**Optional Parameters:**
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.TablePermissionCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.TablePermissionSummary]) — Gets the items of this TablePermissionCollection. List of table permissions.

**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### <a id="list-tables"></a>`list_tables`
Returns a list of tables in a schema.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `catalog_key` (string) — The key of the catalog.
- `schema_key` (string) — The fully qualified name of the Data Lake Schema in the format <catalog_name>.<schema_name>

**Optional Parameters:**
- `should_skip_ocid_translation` (boolean) — When true, skip user OCID translation and return raw OCIDs.
- `display_name` (string) — A filter to return only resources that match the given display name exactly.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.TableCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.TableSummary]) — Gets the items of this TableCollection. List of tables.

**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### <a id="list-view-permissions"></a>`list_view_permissions`
Returns a list of view permissions.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `view_key` (string) — The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>.

**Optional Parameters:**
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.ViewPermissionCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.ViewPermissionSummary]) — Gets the items of this ViewPermissionCollection. List of view permissions.

**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### <a id="list-views"></a>`list_views`
Returns a list of views in a schema.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `catalog_key` (string) — The key of the catalog.
- `schema_key` (string) — The fully qualified name of the Data Lake Schema in the format <catalog_name>.<schema_name>

**Optional Parameters:**
- `display_name` (string) — A filter to return only resources that match the given display name exactly.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.ViewCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.ViewSummary]) — Gets the items of this ViewCollection. List of views.

**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### <a id="manage-schema-permission"></a>`manage_schema_permission`
Updates the permissions for a given schema.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `schema_key` (string) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.
- `manage_schema_permission_details` (oci.aidataplatform_dp.models.ManageSchemaPermissionDetails) — The information to be updated.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### <a id="manage-table-permission"></a>`manage_table_permission`
Updates the permissions for a given table.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `table_key` (string) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.
- `manage_table_permission_details` (oci.aidataplatform_dp.models.ManageTablePermissionDetails) — The information to be updated.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### <a id="manage-view-permission"></a>`manage_view_permission`
Updates permissions on a view.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `view_key` (string) — The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>.
- `manage_view_permission_details` (oci.aidataplatform_dp.models.ManageViewPermissionDetails) — The information to be updated.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### <a id="perform-infer-schema"></a>`perform_infer_schema`
Returns details of a table schema from the specified location.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `schema_key` (string) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.
- `perform_infer_schema_details` (oci.aidataplatform_dp.models.PerformInferSchemaDetails) — Details of the location from which the table schema can be inferred.

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.InferSchema

**Response Fields:**
- `inferSchemaColumn` (list[oci.aidataplatform_dp.models.InferSchemaColumn]) — Gets the infer_schema_column of this InferSchema. Column information obtained by inferring schema.

**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### <a id="perform-infer-schema-with-preview"></a>`perform_infer_schema_with_preview`
Returns table schema and data from the specified location.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `schema_key` (string) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.
- `perform_infer_schema_details` (oci.aidataplatform_dp.models.PerformInferSchemaDetails) — Details of the location from which the table schema and data can be inferred.

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.InferSchemaWithPreview

**Response Fields:**
- `schema` (list[oci.aidataplatform_dp.models.InferSchemaColumn]) — Gets the schema of this InferSchemaWithPreview. Column information obtained by inferring schema.
- `data` (list[dict(str, str)]) — Gets the data of this InferSchemaWithPreview. Sample preview data.

**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### <a id="refresh-schema"></a>`refresh_schema`
Refreshes schema through the crawler.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `schema_key` (string) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### <a id="refresh-table"></a>`refresh_table`
Refreshes a table through the crawler.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `table_key` (string) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### <a id="retrieve-par"></a>`retrieve_par`
Retrieves PAR for the entities created.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `table_key` (string) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.ParDetails

**Response Fields:**
- `parUrl` (string) — Gets the par_url of this ParDetails. PAR URL of the table.
- `tableKey` (string) — Gets the table_key of this ParDetails. The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.
- `timeExpires` (datetime) — Gets the time_expires of this ParDetails. The date and time the table was updated.
- `parAccessType` (string) — Gets the par_access_type of this ParDetails. The operation that can be performed on this resource. Allowed values for this property are: "OBJECT_READ", "OBJECT_WRITE", "OBJECT_READ_WRITE", "ANY_OBJECT_WRITE", "ANY_OBJECT_READ", "ANY_OBJECT_READ_WRITE", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.

**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### <a id="update-schema"></a>`update_schema`
Updates a schema.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `schema_key` (string) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.
- `update_schema_details` (oci.aidataplatform_dp.models.UpdateSchemaDetails) — The information to be updated.

**Optional Parameters:**
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.Schema

**Response Fields:**
- `entityType` (string) — Gets the entity_type of this Schema. An enum to decide the type of the derived model. Allowed values for this property are: "ADW", "ALH", "STANDARD", "KAFKA_TOPIC", "ATP", "ORACLE", "EXADATA", "MYSQL", "DB2", "AZURE_SQLSERVER", "SNOWFLAKE", "ORACLE_ANALYTICS", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `key` (string) — Gets the key of this Schema. The fully qualified name of the schema in the format <catalog_name>.<schema_name>.
- `displayName` (string) — Gets the display_name of this Schema. Schema name.

**Optional Response Fields:**
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

**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### <a id="update-table"></a>`update_table`
Updates a table with provided details.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `table_key` (string) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.
- `update_table_details` (oci.aidataplatform_dp.models.UpdateTableDetails) — The information to be updated.

**Optional Parameters:**
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

### <a id="update-view"></a>`update_view`
Updates a view with given information.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `view_key` (string) — The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>.
- `update_view_details` (oci.aidataplatform_dp.models.UpdateViewDetails) — The update mode and information to be updated.

**Optional Parameters:**
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.View

**Response Fields:**
- `displayName` (string) — Gets the display_name of this View. A user-friendly name. Has to be unique within the scope of the schema and is changeable.

**Optional Response Fields:**
- `key` (string) — Gets the key of this View. The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>
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

**Return:** [Back to Schema (SchemaClient)](#schema-schemaclient) • [Top](#top)

## <a id="semantic-catalog-semanticcatalogclient"></a>Semantic Catalog (SemanticCatalogClient)
**Operations:**
- [`export_lineage`](#export-lineage)
- [`fetch_entity_lineage`](#fetch-entity-lineage)

### <a id="export-lineage"></a>`export_lineage`
(Preview) Returns complete lineage for the provided anchor node in CSV format.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `export_lineage_details` (oci.aidataplatform_dp.models.ExportLineageDetails) — The information needed to export lineage.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type stream

**Return:** [Back to Semantic Catalog (SemanticCatalogClient)](#semantic-catalog-semanticcatalogclient) • [Top](#top)

### <a id="fetch-entity-lineage"></a>`fetch_entity_lineage`
(Preview) Returns lineage for a given entity object.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `fetch_entity_lineage_details` (oci.aidataplatform_dp.models.FetchEntityLineageDetails) — The information needed to obtain desired lineage.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.EntityLineage

**Response Fields:**
- `nodes` (list[oci.aidataplatform_dp.models.LineageObject]) — Gets the nodes of this EntityLineage. Set of links that are involved in the lineage.
- `links` (list[oci.aidataplatform_dp.models.LineageRelationship]) — Gets the links of this EntityLineage. Set of links between the objects in the 'objects' set.

**Return:** [Back to Semantic Catalog (SemanticCatalogClient)](#semantic-catalog-semanticcatalogclient) • [Top](#top)

## <a id="user-setting-usersettingclient"></a>User Setting (UserSettingClient)
**Operations:**
- [`create_user_setting`](#create-user-setting)
- [`delete_user_setting`](#delete-user-setting)
- [`get_user_setting`](#get-user-setting)
- [`list_user_settings`](#list-user-settings)
- [`update_user_setting`](#update-user-setting)

### <a id="create-user-setting"></a>`create_user_setting`
(Preview) The User Settings API allows you to manage user-specific configurations and credentials within an AI Data Platform instance. What you can do -> Store user credentials and integrations, including: -> IAM user credentials -> Git account configurations (e.g., GitHub PAT) -> Create and manage multiple settings -> Mark a setting as default for a given type -> Retrieve and filter settings by type or default status Supported setting types -> IAM_USER_CREDENTIAL – OCI user credentials for API access -> GIT_ACCOUNT – Git provider configuration (e.g., GitHub personal access token) Core operations -> Create a user setting -> List all user settings (with filtering and pagination) -> Get a specific setting by key -> Update an existing setting -> Delete a setting

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `create_user_setting_details` (oci.aidataplatform_dp.models.CreateUserSettingDetails) — Details for the new setting.

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.UserSetting

**Response Fields:**
- `key` (string) — Gets the key of this UserSetting. The unique identifier for the setting.
- `name` (string) — Gets the name of this UserSetting. A user-friendly name for the setting.
- `isDefault` (boolean) — Gets the is_default of this UserSetting. Indicates whether this setting is the default.

**Optional Response Fields:**
- `data` (oci.aidataplatform_dp.models.SettingData) — Gets the data of this UserSetting.

**Return:** [Back to User Setting (UserSettingClient)](#user-setting-usersettingclient) • [Top](#top)

### <a id="delete-user-setting"></a>`delete_user_setting`
(Preview) Deletes a user setting and its credentials from this AI Data Platform instance, freeing the default slot for that type.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `setting_key` (string) — The UUID of the user setting.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to User Setting (UserSettingClient)](#user-setting-usersettingclient) • [Top](#top)

### <a id="get-user-setting"></a>`get_user_setting`
(Preview) Returns the full definition of user settings identified by its key, including type-specific payload and default flag.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `setting_key` (string) — The UUID of the user setting.

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.UserSetting

**Response Fields:**
- `key` (string) — Gets the key of this UserSetting. The unique identifier for the setting.
- `name` (string) — Gets the name of this UserSetting. A user-friendly name for the setting.
- `isDefault` (boolean) — Gets the is_default of this UserSetting. Indicates whether this setting is the default.

**Optional Response Fields:**
- `data` (oci.aidataplatform_dp.models.SettingData) — Gets the data of this UserSetting.

**Return:** [Back to User Setting (UserSettingClient)](#user-setting-usersettingclient) • [Top](#top)

### <a id="list-user-settings"></a>`list_user_settings`
(Preview) Returns a list of all user-specific configurations, with filters for setting type, default flag, and pagination when needed.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

**Optional Parameters:**
- `setting_type` (string) — A filter to return only those settings whose value matches the given data type. Allowed values are: "IAM_USER_CREDENTIAL", "GIT_ACCOUNT"
- `is_default` (boolean) — A filter to return only resources that are default.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `display_name` (string) — A filter to return only resources that match the given display name exactly.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.UserSettingCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.UserSettingSummary]) — Gets the items of this UserSettingCollection. List of settings.

**Return:** [Back to User Setting (UserSettingClient)](#user-setting-usersettingclient) • [Top](#top)

### <a id="update-user-setting"></a>`update_user_setting`
(Preview) Updates the metadata or payload of an existing user setting, letting you rotate credentials or change defaults.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `setting_key` (string) — The UUID of the user setting.
- `update_user_setting_details` (oci.aidataplatform_dp.models.UpdateUserSettingDetails) — Details for the user setting to be updated.

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.UserSetting

**Response Fields:**
- `key` (string) — Gets the key of this UserSetting. The unique identifier for the setting.
- `name` (string) — Gets the name of this UserSetting. A user-friendly name for the setting.
- `isDefault` (boolean) — Gets the is_default of this UserSetting. Indicates whether this setting is the default.

**Optional Response Fields:**
- `data` (oci.aidataplatform_dp.models.SettingData) — Gets the data of this UserSetting.

**Return:** [Back to User Setting (UserSettingClient)](#user-setting-usersettingclient) • [Top](#top)

## <a id="volume-volumeclient"></a>Volume (VolumeClient)
**Operations:**
- [`create_volume`](#create-volume)
- [`delete_dir`](#delete-dir)
- [`delete_file`](#delete-file)
- [`delete_volume`](#delete-volume)
- [`download_file`](#download-file)
- [`download_file_with_par`](#download-file-with-par)
- [`get_volume`](#get-volume)
- [`list_files`](#list-files)
- [`list_volume_permissions`](#list-volume-permissions)
- [`list_volumes`](#list-volumes)
- [`make_dir`](#make-dir)
- [`manage_volume_permission`](#manage-volume-permission)
- [`update_dir`](#update-dir)
- [`update_volume`](#update-volume)
- [`upload_and_extract_volume_zip`](#upload-and-extract-volume-zip)
- [`upload_file`](#upload-file)
- [`upload_file_with_par`](#upload-file-with-par)
- [`zip_and_download_volume_folder`](#zip-and-download-volume-folder)

### <a id="create-volume"></a>`create_volume`
Creates a volume.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `create_volume_details` (oci.aidataplatform_dp.models.CreateVolumeDetails) — Details for the new volume.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.Volume

**Response Fields:**
- `key` (string) — Gets the key of this Volume. The key of the volume.
- `displayName` (string) — Gets the display_name of this Volume. A user-friendly name. Has to be unique within the schema and is changeable.
- `timeCreated` (datetime) — Gets the time_created of this Volume. The date and time the Data Lake Volume was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`

**Optional Response Fields:**
- `description` (string) — Gets the description of this Volume. Short description of the volume
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

**Return:** [Back to Volume (VolumeClient)](#volume-volumeclient) • [Top](#top)

### <a id="delete-dir"></a>`delete_dir`
Deletes a directory in a volume.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `volume_key` (string) — The key of the volume.
- `path` (string) — The absolute path of the file or folder

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Volume (VolumeClient)](#volume-volumeclient) • [Top](#top)

### <a id="delete-file"></a>`delete_file`
Deletes a file or folder in a volume.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `volume_key` (string) — The key of the volume.
- `path` (string) — The absolute path of the file or folder

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Volume (VolumeClient)](#volume-volumeclient) • [Top](#top)

### <a id="delete-volume"></a>`delete_volume`
Deletes a volume.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `volume_key` (string) — The key of the volume.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Volume (VolumeClient)](#volume-volumeclient) • [Top](#top)

### <a id="download-file"></a>`download_file`
Downloads a file from a volume.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `volume_key` (string) — The key of the volume.
- `path` (string) — The absolute path of the file or folder

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type stream

**Return:** [Back to Volume (VolumeClient)](#volume-volumeclient) • [Top](#top)

### <a id="download-file-with-par"></a>`download_file_with_par`
provide the par info for downloading the file for given path.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `volume_key` (string) — The key of the volume.
- `path` (string) — The absolute path of the file or folder

**Optional Parameters:**
- `should_generate_new_par` (boolean) — Flag to toggle to generate short living par
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.DownloadFileWithParResult

**Response Fields:**
- `eTag` (string) — Gets the e_tag of this DownloadFileWithParResult. Etag after creating or closing a file.
- `locationUri` (string) — Gets the location_uri of this DownloadFileWithParResult. The object storage URI which has bucket and namespace information.
- `size` (number) — Gets the size of this DownloadFileWithParResult. File size in bytes.

**Optional Response Fields:**
- `parUrl` (string) — Gets the par_url of this DownloadFileWithParResult. String representing the PAR URL.
- `createdBy` (string) — Gets the created_by of this DownloadFileWithParResult. The user who created the file.
- `updatedBy` (string) — Gets the updated_by of this DownloadFileWithParResult. The user who last updated the file.
- `createdTime` (string) — Gets the created_time of this DownloadFileWithParResult. The time at which the file was created.
- `updatedTime` (string) — Gets the updated_time of this DownloadFileWithParResult. The last modified time of the file.
- `description` (string) — Gets the description of this DownloadFileWithParResult. The file description.
- `systemTags` (dict(str, dict(str, object))) — Gets the system_tags of this DownloadFileWithParResult. System tags for this resource. Each key is predefined and scoped to a namespace. Example: `{"orcl-cloud": {"free-tier-retained": "true"}}`

**Return:** [Back to Volume (VolumeClient)](#volume-volumeclient) • [Top](#top)

### <a id="get-volume"></a>`get_volume`
Returns detailed information about a volume.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `volume_key` (string) — The key of the volume.

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.Volume

**Response Fields:**
- `key` (string) — Gets the key of this Volume. The key of the volume.
- `displayName` (string) — Gets the display_name of this Volume. A user-friendly name. Has to be unique within the schema and is changeable.
- `timeCreated` (datetime) — Gets the time_created of this Volume. The date and time the Data Lake Volume was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`

**Optional Response Fields:**
- `description` (string) — Gets the description of this Volume. Short description of the volume
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

**Return:** [Back to Volume (VolumeClient)](#volume-volumeclient) • [Top](#top)

### <a id="list-files"></a>`list_files`
Returns a list of files in a volume.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `volume_key` (string) — The key of the volume.
- `path` (string) — The absolute path of the file or folder

**Optional Parameters:**
- `is_recursive` (boolean) — A boolean which decides if nested files should be in the list files in volume response.
- `display_name` (string) — A filter to return only resources that match the given display name exactly.
- `metadata_keys` (string) — Comma separated keys to have in list response.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.VolumeFileCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.VolumeFileSummary]) — Gets the items of this VolumeFileCollection. List of volume files.

**Return:** [Back to Volume (VolumeClient)](#volume-volumeclient) • [Top](#top)

### <a id="list-volume-permissions"></a>`list_volume_permissions`
Returns a list of volume permissions.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `volume_key` (string) — The key of the volume.

**Optional Parameters:**
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.VolumePermissionCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.VolumePermissionSummary]) — Gets the items of this VolumePermissionCollection. List of volume permissions.

**Return:** [Back to Volume (VolumeClient)](#volume-volumeclient) • [Top](#top)

### <a id="list-volumes"></a>`list_volumes`
Returns a list of volumes.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `catalog_key` (string) — The key of the catalog.
- `schema_key` (string) — The fully qualified name of the Data Lake Schema in the format <catalog_name>.<schema_name>

**Optional Parameters:**
- `display_name` (string) — A filter to return only resources that match the given display name exactly.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.VolumeCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.VolumeSummary]) — Gets the items of this VolumeCollection. List of volumes.

**Return:** [Back to Volume (VolumeClient)](#volume-volumeclient) • [Top](#top)

### <a id="make-dir"></a>`make_dir`
Creates a directory in a volume.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `volume_key` (string) — The key of the volume.
- `path` (string) — The absolute path of the file or folder

**Optional Parameters:**
- `description` (string) — The description of the folder.
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Volume (VolumeClient)](#volume-volumeclient) • [Top](#top)

### <a id="manage-volume-permission"></a>`manage_volume_permission`
Updates the permissions on a volume.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `volume_key` (string) — The key of the volume.
- `manage_volume_permission_details` (oci.aidataplatform_dp.models.ManageVolumePermissionDetails) — The information to be updated.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Volume (VolumeClient)](#volume-volumeclient) • [Top](#top)

### <a id="update-dir"></a>`update_dir`
Updates a directory in volume with the provided information.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `volume_key` (string) — The key of the volume.
- `update_dir_details` (oci.aidataplatform_dp.models.UpdateDirDetails) — The information to be updated.
- `path` (string) — The absolute path of the file or folder

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Volume (VolumeClient)](#volume-volumeclient) • [Top](#top)

### <a id="update-volume"></a>`update_volume`
Updates a volume with the provided information.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `volume_key` (string) — The key of the volume.
- `update_volume_details` (oci.aidataplatform_dp.models.UpdateVolumeDetails) — The information to be updated.

**Optional Parameters:**
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.Volume

**Response Fields:**
- `key` (string) — Gets the key of this Volume. The key of the volume.
- `displayName` (string) — Gets the display_name of this Volume. A user-friendly name. Has to be unique within the schema and is changeable.
- `timeCreated` (datetime) — Gets the time_created of this Volume. The date and time the Data Lake Volume was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`

**Optional Response Fields:**
- `description` (string) — Gets the description of this Volume. Short description of the volume
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

**Return:** [Back to Volume (VolumeClient)](#volume-volumeclient) • [Top](#top)

### <a id="upload-and-extract-volume-zip"></a>`upload_and_extract_volume_zip`
Creates or updates an asynchronous volume ZIP upload and extraction operation. CREATE returns a PAR URL for uploading the ZIP bytes and an async operation key. UPDATE records the uploaded ZIP metadata so extraction can continue.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `volume_key` (string) — The key of the volume.
- `upload_and_extract_zip_details` (oci.aidataplatform_dp.models.UploadAndExtractZipDetails) — Details for uploading and extracting the volume ZIP file.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.UploadAndExtractZipResult

**Response Fields:**
- `operationKey` (string) — Gets the operation_key of this UploadAndExtractZipResult. Async operation key for upload and extraction.

**Optional Response Fields:**
- `uploadUrl` (string) — Gets the upload_url of this UploadAndExtractZipResult. PAR URL where the caller uploads the zip bytes. Returned for CREATE.
- `destinationFolderPath` (string) — Gets the destination_folder_path of this UploadAndExtractZipResult. Final workspace folder path where the zip will be extracted. Returned for CREATE.

**Return:** [Back to Volume (VolumeClient)](#volume-volumeclient) • [Top](#top)

### <a id="upload-file"></a>`upload_file`
Uploads a file to volume. If the file already exists, it is updated.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `volume_key` (string) — The key of the volume.
- `upload_file_details` (stream) — Contents of the file to upload.
- `path` (string) — The absolute path of the file or folder

**Optional Parameters:**
- `is_overwrite` (boolean) — A boolean which decides if overwrite is allowed
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `is_upload_file_base64_encoded` (boolean) — A flag to identify if the upload file is base64 encoded
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Volume (VolumeClient)](#volume-volumeclient) • [Top](#top)

### <a id="upload-file-with-par"></a>`upload_file_with_par`
Uploads a volume file by generating PAR. If file exists, then it will be updated.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `volume_key` (string) — The key of the volume.
- `upload_file_with_par_details` (oci.aidataplatform_dp.models.UploadFileWithParDetails) — Contents of the file to upload.
- `path` (string) — The absolute path of the file or folder

**Optional Parameters:**
- `is_overwrite` (boolean) — A boolean which decides if overwrite is allowed
- `should_generate_new_par` (boolean) — Flag to toggle to generate short living par
- `should_create_recursively` (boolean) — A boolean which decides if parent directories should be created recursively during upload.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.UploadFileWithParResult

**Response Fields:**
- `eTag` (string) — Gets the e_tag of this UploadFileWithParResult. Etag after creating or closing a file.
- `locationUri` (string) — Gets the location_uri of this UploadFileWithParResult. The object storage URI which has bucket and namespace information.

**Optional Response Fields:**
- `parUrl` (string) — Gets the par_url of this UploadFileWithParResult. String representing the PAR URL.
- `size` (number) — Gets the size of this UploadFileWithParResult. File size in bytes.
- `createdBy` (string) — Gets the created_by of this UploadFileWithParResult. The user who created the file.
- `updatedBy` (string) — Gets the updated_by of this UploadFileWithParResult. The user who last updated the file.
- `createdTime` (string) — Gets the created_time of this UploadFileWithParResult. The time at which the file was created.
- `updatedTime` (string) — Gets the updated_time of this UploadFileWithParResult. The last modified time of the file.
- `description` (string) — Gets the description of this UploadFileWithParResult. The file description.
- `systemTags` (dict(str, dict(str, object))) — Gets the system_tags of this UploadFileWithParResult. System tags for this resource. Each key is predefined and scoped to a namespace. Example: `{"orcl-cloud": {"free-tier-retained": "true"}}`

**Return:** [Back to Volume (VolumeClient)](#volume-volumeclient) • [Top](#top)

### <a id="zip-and-download-volume-folder"></a>`zip_and_download_volume_folder`
Starts asynchronous creation of a ZIP archive for a volume folder. The response includes a PAR URL for downloading the archive after the operation succeeds.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `volume_key` (string) — The key of the volume.
- `zip_and_download_folder_details` (oci.aidataplatform_dp.models.ZipAndDownloadFolderDetails) — Details for zipping a volume folder for download.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.ZipAndDownloadFolderResult

**Response Fields:**
- `operationKey` (string) — Gets the operation_key of this ZipAndDownloadFolderResult. Async operation key for zip creation.
- `downloadUrl` (string) — Gets the download_url of this ZipAndDownloadFolderResult. PAR URL for downloading the generated archive after async operation success.
- `archiveName` (string) — Gets the archive_name of this ZipAndDownloadFolderResult. Generated archive basename, including its .zip or .aidp extension.

**Return:** [Back to Volume (VolumeClient)](#volume-volumeclient) • [Top](#top)

## <a id="workflow-workflowclient"></a>Workflow (WorkflowClient)
**Operations:**
- [`cancel_job_run`](#cancel-job-run)
- [`cancel_job_runs`](#cancel-job-runs)
- [`create_job`](#create-job)
- [`create_job_run`](#create-job-run)
- [`delete_job`](#delete-job)
- [`delete_job_run`](#delete-job-run)
- [`export_task_run_output`](#export-task-run-output)
- [`fetch_output`](#fetch-output)
- [`get_job`](#get-job)
- [`get_job_run`](#get-job-run)
- [`get_task_run`](#get-task-run)
- [`list_job_permissions`](#list-job-permissions)
- [`list_job_runs`](#list-job-runs)
- [`list_jobs`](#list-jobs)
- [`list_recent_job_runs`](#list-recent-job-runs)
- [`list_task_run_retries`](#list-task-run-retries)
- [`list_task_runs`](#list-task-runs)
- [`manage_job_permission`](#manage-job-permission)
- [`repair_job_run`](#repair-job-run)
- [`update_job`](#update-job)

### <a id="cancel-job-run"></a>`cancel_job_run`
Cancels a job run.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `job_run_key` (string) — Job run key.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.JobRun

**Response Fields:**
- `key` (string) — Gets the key of this JobRun. The OCID of the job.
- `name` (string) — Gets the name of this JobRun. A user-friendly name. Does not have to be unique, and is changeable.
- `jobKey` (string) — Gets the job_key of this JobRun. The OCID of the job.

**Optional Response Fields:**
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

**Return:** [Back to Workflow (WorkflowClient)](#workflow-workflowclient) • [Top](#top)

### <a id="cancel-job-runs"></a>`cancel_job_runs`
Cancels all job runs for a given job.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `job_key` (string) — Job key.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Workflow (WorkflowClient)](#workflow-workflowclient) • [Top](#top)

### <a id="create-job"></a>`create_job`
Creates a job.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `create_job_details` (oci.aidataplatform_dp.models.CreateJobDetails) — Details for the new job.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.Job

**Response Fields:**
- `key` (string) — Gets the key of this Job. The OCID of the job.
- `createdBy` (string) — Gets the created_by of this Job. The OCID of the IAM user.
- `name` (string) — Gets the name of this Job. A user-friendly name. Does not have to be unique, and is changeable.

**Optional Response Fields:**
- `createdByName` (string) — Gets the created_by_name of this Job. Name of the user who created this record
- `updatedBy` (string) — Gets the updated_by of this Job. The username of the latest updater. The OCID of the IAM user.
- `updatedByName` (string) — Gets the updated_by_name of this Job. Name of the user who updated this record.
- `runAs` (string) — Gets the run_as of this Job. This points to the user or service account executing the job.
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

**Return:** [Back to Workflow (WorkflowClient)](#workflow-workflowclient) • [Top](#top)

### <a id="create-job-run"></a>`create_job_run`
Creates a job run.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `create_job_run_details` (oci.aidataplatform_dp.models.CreateJobRunDetails) — Details for the new job run.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.JobRun

**Response Fields:**
- `key` (string) — Gets the key of this JobRun. The OCID of the job.
- `name` (string) — Gets the name of this JobRun. A user-friendly name. Does not have to be unique, and is changeable.
- `jobKey` (string) — Gets the job_key of this JobRun. The OCID of the job.

**Optional Response Fields:**
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

**Return:** [Back to Workflow (WorkflowClient)](#workflow-workflowclient) • [Top](#top)

### <a id="delete-job"></a>`delete_job`
Deletes a job.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `job_key` (string) — Job key.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Workflow (WorkflowClient)](#workflow-workflowclient) • [Top](#top)

### <a id="delete-job-run"></a>`delete_job_run`
Deletes a job run.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `job_run_key` (string) — Job run key.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Workflow (WorkflowClient)](#workflow-workflowclient) • [Top](#top)

### <a id="export-task-run-output"></a>`export_task_run_output`
Exports task run output in HTML or ipynb format.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `task_run_key` (string) — Task run key.
- `task_run_output_key` (string) — Task run output key.
- `export_task_run_output_details` (oci.aidataplatform_dp.models.ExportTaskRunOutputDetails) — Payload to export task run output to a file.

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.ExportedTaskRunOutputContents

**Response Fields:**
- `name` (string) — Gets the name of this ExportedTaskRunOutputContents. Name of file, equivalent to the last part of the path.
- `path` (string) — Gets the path of this ExportedTaskRunOutputContents. Full path of the file.
- `content` (object) — Gets the content of this ExportedTaskRunOutputContents. For ipynb format, this contains a string representing the .ipynb file. For HTML format, this contains a string representing the HTML page. It has base64-encoded data for images.
- `format` (string) — Gets the format of this ExportedTaskRunOutputContents. Format of content as requested by the client. HTML format by default. Allowed values for this property are: "HTML", "IPYNB", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.

**Return:** [Back to Workflow (WorkflowClient)](#workflow-workflowclient) • [Top](#top)

### <a id="fetch-output"></a>`fetch_output`
Fetches the task run output from the runtime engine.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `task_run_key` (string) — Task run key.
- `fetch_output_details` (oci.aidataplatform_dp.models.FetchOutputDetails) — Details for task run output retrieval.

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.TaskRunOutput

**Response Fields:**
- `data` (list[oci.aidataplatform_dp.models.RunOutputData]) — Gets the data of this TaskRunOutput. Array of output objects.

**Optional Response Fields:**
- `key` (string) — Gets the key of this TaskRunOutput. A unique identifier for the output.
- `taskType` (string) — Gets the task_type of this TaskRunOutput. The type of the task. Allowed values for this property are: "NOTEBOOK_TASK", "PYTHON_TASK", "SPARK_SUBMIT_TASK", "IF_ELSE_TASK", "JOB_TASK", "JAR_TASK", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `isTruncated` (boolean) — Gets the is_truncated of this TaskRunOutput. True if logs are truncated.
- `errorTrace` (string) — Gets the error_trace of this TaskRunOutput. If there was an error executing the run, this field contains any available stack traces.
- `outputParameters` (list[oci.aidataplatform_dp.models.OutputParameter]) — Gets the output_parameters of this TaskRunOutput. List of output parameters with name and values.
- `version` (number) — Gets the version of this TaskRunOutput. Current version of job run object in repository.

**Return:** [Back to Workflow (WorkflowClient)](#workflow-workflowclient) • [Top](#top)

### <a id="get-job"></a>`get_job`
Returns detailed information about a given job.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `job_key` (string) — Job key.

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.Job

**Response Fields:**
- `key` (string) — Gets the key of this Job. The OCID of the job.
- `createdBy` (string) — Gets the created_by of this Job. The OCID of the IAM user.
- `name` (string) — Gets the name of this Job. A user-friendly name. Does not have to be unique, and is changeable.

**Optional Response Fields:**
- `createdByName` (string) — Gets the created_by_name of this Job. Name of the user who created this record
- `updatedBy` (string) — Gets the updated_by of this Job. The username of the latest updater. The OCID of the IAM user.
- `updatedByName` (string) — Gets the updated_by_name of this Job. Name of the user who updated this record.
- `runAs` (string) — Gets the run_as of this Job. This points to the user or service account executing the job.
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

**Return:** [Back to Workflow (WorkflowClient)](#workflow-workflowclient) • [Top](#top)

### <a id="get-job-run"></a>`get_job_run`
Returns detailed information about a given job run.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `job_run_key` (string) — Job run key.

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_include_task_run_summaries` (boolean) — A flag to identify if task run summaries should be included in the job run response. If omitted, the service applies its configured default behavior.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.JobRun

**Response Fields:**
- `key` (string) — Gets the key of this JobRun. The OCID of the job.
- `name` (string) — Gets the name of this JobRun. A user-friendly name. Does not have to be unique, and is changeable.
- `jobKey` (string) — Gets the job_key of this JobRun. The OCID of the job.

**Optional Response Fields:**
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

**Return:** [Back to Workflow (WorkflowClient)](#workflow-workflowclient) • [Top](#top)

### <a id="get-task-run"></a>`get_task_run`
Returns detailed information about a task run with a given task run key.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `task_run_key` (string) — Task run key.

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_include_task_run_retries` (boolean) — Indicates whether a get task run response should include task run retries.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.TaskRun

**Response Fields:**
- `key` (string) — Gets the key of this TaskRun. The OCID of the task run.
- `name` (string) — Gets the name of this TaskRun. A user-friendly name. Does not have to be unique, and is changeable.

**Optional Response Fields:**
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

**Return:** [Back to Workflow (WorkflowClient)](#workflow-workflowclient) • [Top](#top)

### <a id="list-job-permissions"></a>`list_job_permissions`
Returns a list of job permissions.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `job_key` (string) — Job key.

**Optional Parameters:**
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Allowed values are: "timeCreated", "displayName"
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.JobPermissionCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.JobPermissionSummary]) — Gets the items of this JobPermissionCollection. List of job permissions.

**Return:** [Back to Workflow (WorkflowClient)](#workflow-workflowclient) • [Top](#top)

### <a id="list-job-runs"></a>`list_job_runs`
Returns a detailed list of job runs.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace

**Optional Parameters:**
- `display_name` (string) — A filter to return only resources that match the given display name exactly.
- `job_key` (list[str]) — The field to filter based on job key.
- `status` (list[str]) — The field to filter based on state. Allowed values are: "PENDING", "RUNNING", "SKIPPED", "INTERNAL_ERROR", "BLOCKED", "SUCCESS", "FAILED", "CANCELED", "UPSTREAM_CANCELED", "UPSTREAM_FAILED", "EXCLUDED"
- `time_created_greater_than_or_equal_to` (datetime) — Fetch objects from repository that were created after or at the exact timestamp provided in parameter
- `time_created_less_than_or_equal_to` (datetime) — Fetch objects from repository that were created before or at the exact timestamp provided in parameter.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated List call.
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName", "status"
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.JobRunCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.JobRunSummary]) — Gets the items of this JobRunCollection. List of job runs.

**Return:** [Back to Workflow (WorkflowClient)](#workflow-workflowclient) • [Top](#top)

### <a id="list-jobs"></a>`list_jobs`
Returns a list of jobs.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace

**Optional Parameters:**
- `display_name` (string) — A filter to return only resources that match the given display name exactly.
- `job_key` (list[str]) — The field to filter based on job key.
- `display_name_contains` (string) — A filter to return only resources that have a display name containing the text provided.
- `path` (string) — The fully qualified path where the job is stored.
- `created_by` (string) — A filter to return only resources that are created by given user with username that matches exactly.
- `updated_by` (string) — A filter to return only resources that was last updated by given user with username that matches exactly.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated List call.
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName", "status"
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.JobCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.JobSummary]) — Gets the items of this JobCollection. List of jobs.

**Return:** [Back to Workflow (WorkflowClient)](#workflow-workflowclient) • [Top](#top)

### <a id="list-recent-job-runs"></a>`list_recent_job_runs`
Returns a list of the latest job runs for a given job key.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `job_key` (oci.aidataplatform_dp.models.list[str]) — The field to filter based on job key.

**Optional Parameters:**
- `record_count` (number) — The number of records to fetch.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated List call.
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName", "status"
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.JobRunCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.JobRunSummary]) — Gets the items of this JobRunCollection. List of job runs.

**Return:** [Back to Workflow (WorkflowClient)](#workflow-workflowclient) • [Top](#top)

### <a id="list-task-run-retries"></a>`list_task_run_retries`
Returns detailed information about retries of a task run with a given task run key.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `task_run_key` (string) — Task run key.

**Optional Parameters:**
- `display_name` (string) — A filter to return only resources that match the given display name exactly.
- `status` (list[str]) — The field to filter based on state. Allowed values are: "PENDING", "RUNNING", "SKIPPED", "INTERNAL_ERROR", "BLOCKED", "SUCCESS", "FAILED", "CANCELED", "UPSTREAM_CANCELED", "UPSTREAM_FAILED", "EXCLUDED"
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName", "status"
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.TaskRunRetryCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.TaskRunRetrySummary]) — Gets the items of this TaskRunRetryCollection. List of TaskRun retries.

**Return:** [Back to Workflow (WorkflowClient)](#workflow-workflowclient) • [Top](#top)

### <a id="list-task-runs"></a>`list_task_runs`
Returns a list of task runs.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `job_run_key` (string) — The field to filter based on job run key.

**Optional Parameters:**
- `display_name` (string) — A filter to return only resources that match the given display name exactly.
- `status` (list[str]) — The field to filter based on state. Allowed values are: "PENDING", "RUNNING", "SKIPPED", "INTERNAL_ERROR", "BLOCKED", "SUCCESS", "FAILED", "CANCELED", "UPSTREAM_CANCELED", "UPSTREAM_FAILED", "EXCLUDED"
- `parent_job_run_key` (string) — The field to filter based on parent job run key.
- `root_job_run_key` (string) — The field to filter based on root job run key.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated List call.
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName", "status"
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.TaskRunCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.TaskRunSummary]) — Gets the items of this TaskRunCollection. List of TaskRuns.

**Return:** [Back to Workflow (WorkflowClient)](#workflow-workflowclient) • [Top](#top)

### <a id="manage-job-permission"></a>`manage_job_permission`
Update job permissions with the provided details.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `job_key` (string) — Job key.
- `manage_job_permission_details` (oci.aidataplatform_dp.models.ManageJobPermissionDetails) — The information to be updated.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Workflow (WorkflowClient)](#workflow-workflowclient) • [Top](#top)

### <a id="repair-job-run"></a>`repair_job_run`
Repairs and reruns a job run.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `job_run_key` (string) — Job run key.
- `repair_job_run_details` (oci.aidataplatform_dp.models.RepairJobRunDetails) — Details of the job run to be repaired.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.JobRun

**Response Fields:**
- `key` (string) — Gets the key of this JobRun. The OCID of the job.
- `name` (string) — Gets the name of this JobRun. A user-friendly name. Does not have to be unique, and is changeable.
- `jobKey` (string) — Gets the job_key of this JobRun. The OCID of the job.

**Optional Response Fields:**
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

**Return:** [Back to Workflow (WorkflowClient)](#workflow-workflowclient) • [Top](#top)

### <a id="update-job"></a>`update_job`
Updates details for a job.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `job_key` (string) — Job key.
- `update_job_details` (oci.aidataplatform_dp.models.UpdateJobDetails) — The information to be updated.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.Job

**Response Fields:**
- `key` (string) — Gets the key of this Job. The OCID of the job.
- `createdBy` (string) — Gets the created_by of this Job. The OCID of the IAM user.
- `name` (string) — Gets the name of this Job. A user-friendly name. Does not have to be unique, and is changeable.

**Optional Response Fields:**
- `createdByName` (string) — Gets the created_by_name of this Job. Name of the user who created this record
- `updatedBy` (string) — Gets the updated_by of this Job. The username of the latest updater. The OCID of the IAM user.
- `updatedByName` (string) — Gets the updated_by_name of this Job. Name of the user who updated this record.
- `runAs` (string) — Gets the run_as of this Job. This points to the user or service account executing the job.
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

**Return:** [Back to Workflow (WorkflowClient)](#workflow-workflowclient) • [Top](#top)

## <a id="workspace-workspaceclient"></a>Workspace (WorkspaceClient)
**Operations:**
- [`create_git_folder`](#create-git-folder)
- [`create_workspace`](#create-workspace)
- [`delete_workspace`](#delete-workspace)
- [`get_workspace`](#get-workspace)
- [`list_create_workspace_permissions`](#list-create-workspace-permissions)
- [`list_workspace_permissions`](#list-workspace-permissions)
- [`list_workspaces`](#list-workspaces)
- [`manage_create_workspace_permission`](#manage-create-workspace-permission)
- [`manage_workspace_permission`](#manage-workspace-permission)
- [`update_workspace`](#update-workspace)
- [`update_workspace_async_operation_status`](#update-workspace-async-operation-status)

### <a id="create-git-folder"></a>`create_git_folder`
Creates a git folder in the workspace

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `create_git_folder_details` (oci.aidataplatform_dp.models.CreateGitFolderDetails) — The information to be updated.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.GitFolder

**Response Fields:**
- `folderPath` (string) — Gets the folder_path of this GitFolder. The absolute path of the Git folder user wants to create.

**Optional Response Fields:**
- `gitProviderKey` (string) — Gets the git_provider_key of this GitFolder. key corresponding to Git service provider in git provider table.
- `gitRepositoryUrl` (string) — Gets the git_repository_url of this GitFolder. Git repository url used to clone.
- `description` (string) — Gets the description of this GitFolder. Short description about the git repository.
- `branchName` (string) — Gets the branch_name of this GitFolder. Git branch name that is cloned.
- `folderMetadata` (dict(str, object)) — Gets the folder_metadata of this GitFolder. The metadata about the folder, like branchName.

**Return:** [Back to Workspace (WorkspaceClient)](#workspace-workspaceclient) • [Top](#top)

### <a id="create-workspace"></a>`create_workspace`
Creates a workspace.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `create_workspace_details` (oci.aidataplatform_dp.models.CreateWorkspaceDetails) — Details for the new workspace.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.Workspace

**Response Fields:**
- `key` (string) — Gets the key of this Workspace. The key of the AI Data Platform Workbench workspace.
- `displayName` (string) — Gets the display_name of this Workspace. A user-friendly name that has to be unique in a AI Data Platform Workbench instance.
- `timeCreated` (datetime) — Gets the time_created of this Workspace. The date and time the AI Data Platform Workbench workspace was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `lifecycleState` (string) — Gets the lifecycle_state of this Workspace. The current state of the AI Data Platform Workbench workspace. Allowed values for this property are: "CREATING", "UPDATING", "ACTIVE", "DELETING", "DELETED", "FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.

**Optional Response Fields:**
- `description` (string) — Gets the description of this Workspace. Description of the workspace.
- `type` (string) — Gets the type of this Workspace. Workspace type. Type is DEFAULT for workspace created at AI Data Platform Workbench creation, type is USER for workspace created by AI Data Platform Workbench user. Allowed values for this property are: "DEFAULT", "USER", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `timeUpdated` (datetime) — Gets the time_updated of this Workspace. The date and time the AI Data Platform Workbench workspace was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
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

**Return:** [Back to Workspace (WorkspaceClient)](#workspace-workspaceclient) • [Top](#top)

### <a id="delete-workspace"></a>`delete_workspace`
Deletes a workspace.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `time_data_lake_deletion` (datetime) — Deletion time in the case that a workspace is deleted during AI Data Platform Workbench deletion.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Workspace (WorkspaceClient)](#workspace-workspaceclient) • [Top](#top)

### <a id="get-workspace"></a>`get_workspace`
Gets detailed information about a workspace.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace

**Optional Parameters:**
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.Workspace

**Response Fields:**
- `key` (string) — Gets the key of this Workspace. The key of the AI Data Platform Workbench workspace.
- `displayName` (string) — Gets the display_name of this Workspace. A user-friendly name that has to be unique in a AI Data Platform Workbench instance.
- `timeCreated` (datetime) — Gets the time_created of this Workspace. The date and time the AI Data Platform Workbench workspace was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `lifecycleState` (string) — Gets the lifecycle_state of this Workspace. The current state of the AI Data Platform Workbench workspace. Allowed values for this property are: "CREATING", "UPDATING", "ACTIVE", "DELETING", "DELETED", "FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.

**Optional Response Fields:**
- `description` (string) — Gets the description of this Workspace. Description of the workspace.
- `type` (string) — Gets the type of this Workspace. Workspace type. Type is DEFAULT for workspace created at AI Data Platform Workbench creation, type is USER for workspace created by AI Data Platform Workbench user. Allowed values for this property are: "DEFAULT", "USER", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `timeUpdated` (datetime) — Gets the time_updated of this Workspace. The date and time the AI Data Platform Workbench workspace was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
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

**Return:** [Back to Workspace (WorkspaceClient)](#workspace-workspaceclient) • [Top](#top)

### <a id="list-create-workspace-permissions"></a>`list_create_workspace_permissions`
Gets a list of create workspace permission summary objects.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

**Optional Parameters:**
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for `granteeName` is ascending. Allowed values are: "granteeName"
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.CreateWorkspacePermissionCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.CreateWorkspacePermissionSummary]) — Gets the items of this CreateWorkspacePermissionCollection. List of Create Workspace permissions.

**Return:** [Back to Workspace (WorkspaceClient)](#workspace-workspaceclient) • [Top](#top)

### <a id="list-workspace-permissions"></a>`list_workspace_permissions`
Gets a list of workspace permissions.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace

**Optional Parameters:**
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for `granteeName` is ascending. Allowed values are: "granteeName"
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.WorkspacePermissionCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.WorkspacePermissionSummary]) — Gets the items of this WorkspacePermissionCollection. List of workspace permissions.

**Return:** [Back to Workspace (WorkspaceClient)](#workspace-workspaceclient) • [Top](#top)

### <a id="list-workspaces"></a>`list_workspaces`
Gets a list of workspaces.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

**Optional Parameters:**
- `lifecycle_state` (string) — A filter to return only resources that match the given lifecycle state. The state value is case-insensitive. Allowed values are: "CREATING", "UPDATING", "ACTIVE", "DELETING", "DELETED", "FAILED"
- `display_name` (string) — A filter to return only resources that match the given display name exactly.
- `display_name_contains` (string) — A filter to return only resources that have a display name containing the text provided.
- `type` (string) — When no value is provided, all workspaces are returned. Otherwise, workspace of selected value is returned. Allowed values are: "DEFAULT", "USER"
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `is_private_network_enabled` (boolean) — A flag to filter the workspaces which are private network enabled or disabled
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.WorkspaceCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.WorkspaceSummary]) — Gets the items of this WorkspaceCollection. List of workspaces.

**Return:** [Back to Workspace (WorkspaceClient)](#workspace-workspaceclient) • [Top](#top)

### <a id="manage-create-workspace-permission"></a>`manage_create_workspace_permission`
Updates create workspace permissions on a workspace.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `manage_create_workspace_permission_details` (oci.aidataplatform_dp.models.ManageCreateWorkspacePermissionDetails) — The information to be updated.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Workspace (WorkspaceClient)](#workspace-workspaceclient) • [Top](#top)

### <a id="manage-workspace-permission"></a>`manage_workspace_permission`
Updates permissions on a workspace.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `manage_workspace_permission_details` (oci.aidataplatform_dp.models.ManageWorkspacePermissionDetails) — The information to be updated.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Workspace (WorkspaceClient)](#workspace-workspaceclient) • [Top](#top)

### <a id="update-workspace"></a>`update_workspace`
Updates the details of a workspace.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `update_workspace_details` (oci.aidataplatform_dp.models.UpdateWorkspaceDetails) — The information to be updated.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.Workspace

**Response Fields:**
- `key` (string) — Gets the key of this Workspace. The key of the AI Data Platform Workbench workspace.
- `displayName` (string) — Gets the display_name of this Workspace. A user-friendly name that has to be unique in a AI Data Platform Workbench instance.
- `timeCreated` (datetime) — Gets the time_created of this Workspace. The date and time the AI Data Platform Workbench workspace was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `lifecycleState` (string) — Gets the lifecycle_state of this Workspace. The current state of the AI Data Platform Workbench workspace. Allowed values for this property are: "CREATING", "UPDATING", "ACTIVE", "DELETING", "DELETED", "FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.

**Optional Response Fields:**
- `description` (string) — Gets the description of this Workspace. Description of the workspace.
- `type` (string) — Gets the type of this Workspace. Workspace type. Type is DEFAULT for workspace created at AI Data Platform Workbench creation, type is USER for workspace created by AI Data Platform Workbench user. Allowed values for this property are: "DEFAULT", "USER", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `timeUpdated` (datetime) — Gets the time_updated of this Workspace. The date and time the AI Data Platform Workbench workspace was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
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

**Return:** [Back to Workspace (WorkspaceClient)](#workspace-workspaceclient) • [Top](#top)

### <a id="update-workspace-async-operation-status"></a>`update_workspace_async_operation_status`
Updates the status of a workspace.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `async_operation_key` (string) — The unique identifier of an async operation
- `update_workspace_async_operation_status_details` (oci.aidataplatform_dp.models.UpdateWorkspaceAsyncOperationStatusDetails) — The information to be updated.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.Workspace

**Response Fields:**
- `key` (string) — Gets the key of this Workspace. The key of the AI Data Platform Workbench workspace.
- `displayName` (string) — Gets the display_name of this Workspace. A user-friendly name that has to be unique in a AI Data Platform Workbench instance.
- `timeCreated` (datetime) — Gets the time_created of this Workspace. The date and time the AI Data Platform Workbench workspace was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `lifecycleState` (string) — Gets the lifecycle_state of this Workspace. The current state of the AI Data Platform Workbench workspace. Allowed values for this property are: "CREATING", "UPDATING", "ACTIVE", "DELETING", "DELETED", "FAILED", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.

**Optional Response Fields:**
- `description` (string) — Gets the description of this Workspace. Description of the workspace.
- `type` (string) — Gets the type of this Workspace. Workspace type. Type is DEFAULT for workspace created at AI Data Platform Workbench creation, type is USER for workspace created by AI Data Platform Workbench user. Allowed values for this property are: "DEFAULT", "USER", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
- `timeUpdated` (datetime) — Gets the time_updated of this Workspace. The date and time the AI Data Platform Workbench workspace was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
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

**Return:** [Back to Workspace (WorkspaceClient)](#workspace-workspaceclient) • [Top](#top)

## <a id="workspace-object-workspaceobjectclient"></a>Workspace Object (WorkspaceObjectClient)
**Operations:**
- [`copy_workspace_object`](#copy-workspace-object)
- [`create_workspace_object`](#create-workspace-object)
- [`delete_workspace_object`](#delete-workspace-object)
- [`download_workspace_object_with_par`](#download-workspace-object-with-par)
- [`get_workspace_object`](#get-workspace-object)
- [`head_workspace_object`](#head-workspace-object)
- [`list_workspace_object_permissions`](#list-workspace-object-permissions)
- [`list_workspace_objects`](#list-workspace-objects)
- [`manage_workspace_object_permission`](#manage-workspace-object-permission)
- [`move_workspace_object`](#move-workspace-object)
- [`rename_workspace_object`](#rename-workspace-object)
- [`update_workspace_object`](#update-workspace-object)
- [`upload_and_extract_workspace_zip`](#upload-and-extract-workspace-zip)
- [`upload_workspace_object_with_par`](#upload-workspace-object-with-par)
- [`zip_and_download_workspace_folder`](#zip-and-download-workspace-folder)

### <a id="copy-workspace-object"></a>`copy_workspace_object`
Copy a workspace object to different location.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `copy_workspace_object_details` (oci.aidataplatform_dp.models.CopyWorkspaceObjectDetails) — Details for copying the workspace object to a different path.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.WorkspaceObjectDetails

**Response Fields:**
- `path` (string) — Gets the path of this WorkspaceObjectDetails. The fully qualified path of the workspace object. Example: /Shared/Folder1/Notebook1.ipynb
- `displayName` (string) — Gets the display_name of this WorkspaceObjectDetails. The name of the Workspace Object. This will be the name of the file/folder in the workspace. Example: Notebook1.ipynb, Folder1
- `timeCreated` (datetime) — Gets the time_created of this WorkspaceObjectDetails. The date and time the workspace object was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `type` (string) — Gets the type of this WorkspaceObjectDetails. The type of the workspace object. Allowed values for this property are: "NOTEBOOK", "JOB", "LAKE_FLOW", "AGENT_LAKE_FLOW", "GENERATED_ARTIFACT", "LIBRARY", "FILE", "FOLDER", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.

**Optional Response Fields:**
- `key` (string) — Gets the key of this WorkspaceObjectDetails. The key of the Workspace Object.
- `timeUpdated` (datetime) — Gets the time_updated of this WorkspaceObjectDetails. The date and time the workspace object was last updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `description` (string) — Gets the description of this WorkspaceObjectDetails. The description for the file and folder.
- `systemTags` (dict(str, dict(str, object))) — Gets the system_tags of this WorkspaceObjectDetails. System tags for this resource. Each key is predefined and scoped to a namespace. Example: `{"orcl-cloud": {"free-tier-retained": "true"}}`

**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#workspace-object-workspaceobjectclient) • [Top](#top)

### <a id="create-workspace-object"></a>`create_workspace_object`
Creates a workspace object. You can create a file or folder in the workspace.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `create_workspace_object_details` (stream) — Details for the new workspace object.
- `path` (string) — The absolute path of the file or folder

**Optional Parameters:**
- `type` (string) — The type of workspace object.
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `is_upload_file_base64_encoded` (boolean) — A flag to identify if the upload file is base64 encoded
- `is_overwrite` (boolean) — A boolean which decides if overwrite is allowed
- `object_description` (string) — The description of the workspace object
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type stream

**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#workspace-object-workspaceobjectclient) • [Top](#top)

### <a id="delete-workspace-object"></a>`delete_workspace_object`
Deletes a workspace object.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `object_path` (string) — The fully qualified path of the workspace object.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#workspace-object-workspaceobjectclient) • [Top](#top)

### <a id="download-workspace-object-with-par"></a>`download_workspace_object_with_par`
Downloads a workspace file by providing the PAR info for downloading the file for given path.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `path` (string) — The absolute path of the file or folder

**Optional Parameters:**
- `should_generate_new_par` (boolean) — Flag to toggle to generate short living par
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `type` (string) — The type of workspace object.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.DownloadFileWithParResult

**Response Fields:**
- `eTag` (string) — Gets the e_tag of this DownloadFileWithParResult. Etag after creating or closing a file.
- `locationUri` (string) — Gets the location_uri of this DownloadFileWithParResult. The object storage URI which has bucket and namespace information.
- `size` (number) — Gets the size of this DownloadFileWithParResult. File size in bytes.

**Optional Response Fields:**
- `parUrl` (string) — Gets the par_url of this DownloadFileWithParResult. String representing the PAR URL.
- `createdBy` (string) — Gets the created_by of this DownloadFileWithParResult. The user who created the file.
- `updatedBy` (string) — Gets the updated_by of this DownloadFileWithParResult. The user who last updated the file.
- `createdTime` (string) — Gets the created_time of this DownloadFileWithParResult. The time at which the file was created.
- `updatedTime` (string) — Gets the updated_time of this DownloadFileWithParResult. The last modified time of the file.
- `description` (string) — Gets the description of this DownloadFileWithParResult. The file description.
- `systemTags` (dict(str, dict(str, object))) — Gets the system_tags of this DownloadFileWithParResult. System tags for this resource. Each key is predefined and scoped to a namespace. Example: `{"orcl-cloud": {"free-tier-retained": "true"}}`

**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#workspace-object-workspaceobjectclient) • [Top](#top)

### <a id="get-workspace-object"></a>`get_workspace_object`
Returns detailed information about a workspace object.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `object_path` (string) — The fully qualified path of the workspace object.

**Optional Parameters:**
- `should_include_metadata` (boolean) — Path to list all metadata for a file or folder.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type stream

**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#workspace-object-workspaceobjectclient) • [Top](#top)

### <a id="head-workspace-object"></a>`head_workspace_object`
Returns metadata about a workspace object. The contents of the file are not retrieved.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `object_path` (string) — The fully qualified path of the workspace object.

**Optional Parameters:**
- `should_include_metadata` (boolean) — Path to list all metadata for a file or folder.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#workspace-object-workspaceobjectclient) • [Top](#top)

### <a id="list-workspace-object-permissions"></a>`list_workspace_object_permissions`
Returns a list of workspace object permissions.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `object_key` (string) — The key of the workspace object.

**Optional Parameters:**
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.WorkspaceObjectPermissionCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.WorkspaceObjectPermissionSummary]) — Gets the items of this WorkspaceObjectPermissionCollection. List of workspace object permissions.

**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#workspace-object-workspaceobjectclient) • [Top](#top)

### <a id="list-workspace-objects"></a>`list_workspace_objects`
Returns a list of objects in the workspace.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `path` (string) — The absolute path of the file or folder

**Optional Parameters:**
- `type` (string) — Filter by object type. For example, NOTEBOOK, LIBRARY, or FILE.
- `display_name` (string) — A filter to return only resources that match the given display name exactly.
- `limit` (number) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `metadata_keys` (string) — Comma separated keys to have in list response.
- `page` (string) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see `List Pagination`.  https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine
- `sort_order` (string) — The sort order to use, either ascending (`ASC`) or descending (`DESC`). Allowed values are: "ASC", "DESC"
- `sort_by` (string) — The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending. Allowed values are: "timeCreated", "displayName"
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.WorkspaceObjectCollection

**Response Fields:**
- `items` (list[oci.aidataplatform_dp.models.WorkspaceObjectSummary]) — Gets the items of this WorkspaceObjectCollection. List of workspace objects.

**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#workspace-object-workspaceobjectclient) • [Top](#top)

### <a id="manage-workspace-object-permission"></a>`manage_workspace_object_permission`
Updates permissions on a workspace object.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `object_key` (string) — The key of the workspace object.
- `manage_workspace_object_permission_details` (oci.aidataplatform_dp.models.ManageWorkspaceObjectPermissionDetails) — The information to be updated.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type None

**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#workspace-object-workspaceobjectclient) • [Top](#top)

### <a id="move-workspace-object"></a>`move_workspace_object`
Moves a workspace object to different location.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `move_workspace_object_details` (oci.aidataplatform_dp.models.MoveWorkspaceObjectDetails) — Details for moving the workspace object to a different path.

**Optional Parameters:**
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.WorkspaceObjectDetails

**Response Fields:**
- `path` (string) — Gets the path of this WorkspaceObjectDetails. The fully qualified path of the workspace object. Example: /Shared/Folder1/Notebook1.ipynb
- `displayName` (string) — Gets the display_name of this WorkspaceObjectDetails. The name of the Workspace Object. This will be the name of the file/folder in the workspace. Example: Notebook1.ipynb, Folder1
- `timeCreated` (datetime) — Gets the time_created of this WorkspaceObjectDetails. The date and time the workspace object was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `type` (string) — Gets the type of this WorkspaceObjectDetails. The type of the workspace object. Allowed values for this property are: "NOTEBOOK", "JOB", "LAKE_FLOW", "AGENT_LAKE_FLOW", "GENERATED_ARTIFACT", "LIBRARY", "FILE", "FOLDER", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.

**Optional Response Fields:**
- `key` (string) — Gets the key of this WorkspaceObjectDetails. The key of the Workspace Object.
- `timeUpdated` (datetime) — Gets the time_updated of this WorkspaceObjectDetails. The date and time the workspace object was last updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `description` (string) — Gets the description of this WorkspaceObjectDetails. The description for the file and folder.
- `systemTags` (dict(str, dict(str, object))) — Gets the system_tags of this WorkspaceObjectDetails. System tags for this resource. Each key is predefined and scoped to a namespace. Example: `{"orcl-cloud": {"free-tier-retained": "true"}}`

**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#workspace-object-workspaceobjectclient) • [Top](#top)

### <a id="rename-workspace-object"></a>`rename_workspace_object`
Renames a workspace object.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `rename_workspace_object_details` (oci.aidataplatform_dp.models.RenameWorkspaceObjectDetails) — Details for renaming the workspace object.

**Optional Parameters:**
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.WorkspaceObjectDetails

**Response Fields:**
- `path` (string) — Gets the path of this WorkspaceObjectDetails. The fully qualified path of the workspace object. Example: /Shared/Folder1/Notebook1.ipynb
- `displayName` (string) — Gets the display_name of this WorkspaceObjectDetails. The name of the Workspace Object. This will be the name of the file/folder in the workspace. Example: Notebook1.ipynb, Folder1
- `timeCreated` (datetime) — Gets the time_created of this WorkspaceObjectDetails. The date and time the workspace object was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `type` (string) — Gets the type of this WorkspaceObjectDetails. The type of the workspace object. Allowed values for this property are: "NOTEBOOK", "JOB", "LAKE_FLOW", "AGENT_LAKE_FLOW", "GENERATED_ARTIFACT", "LIBRARY", "FILE", "FOLDER", 'UNKNOWN_ENUM_VALUE'. Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.

**Optional Response Fields:**
- `key` (string) — Gets the key of this WorkspaceObjectDetails. The key of the Workspace Object.
- `timeUpdated` (datetime) — Gets the time_updated of this WorkspaceObjectDetails. The date and time the workspace object was last updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>. Example: `2016-08-25T21:10:29.600Z`
- `description` (string) — Gets the description of this WorkspaceObjectDetails. The description for the file and folder.
- `systemTags` (dict(str, dict(str, object))) — Gets the system_tags of this WorkspaceObjectDetails. System tags for this resource. Each key is predefined and scoped to a namespace. Example: `{"orcl-cloud": {"free-tier-retained": "true"}}`

**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#workspace-object-workspaceobjectclient) • [Top](#top)

### <a id="update-workspace-object"></a>`update_workspace_object`
Updates a workspace object with the provided information.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `object_path` (string) — The fully qualified path of the workspace object.
- `update_workspace_object_details` (stream) — The information to be updated.

**Optional Parameters:**
- `object_description` (string) — The description of the workspace object
- `if_match` (string) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type stream

**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#workspace-object-workspaceobjectclient) • [Top](#top)

### <a id="upload-and-extract-workspace-zip"></a>`upload_and_extract_workspace_zip`
Creates or updates an asynchronous workspace ZIP upload and extraction operation. CREATE returns a PAR URL for uploading the ZIP bytes and an async operation key. UPDATE records the uploaded ZIP metadata so extraction can continue.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `upload_and_extract_zip_details` (oci.aidataplatform_dp.models.UploadAndExtractZipDetails) — Details for uploading and extracting the workspace ZIP file.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.UploadAndExtractZipResult

**Response Fields:**
- `operationKey` (string) — Gets the operation_key of this UploadAndExtractZipResult. Async operation key for upload and extraction.

**Optional Response Fields:**
- `uploadUrl` (string) — Gets the upload_url of this UploadAndExtractZipResult. PAR URL where the caller uploads the zip bytes. Returned for CREATE.
- `destinationFolderPath` (string) — Gets the destination_folder_path of this UploadAndExtractZipResult. Final workspace folder path where the zip will be extracted. Returned for CREATE.

**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#workspace-object-workspaceobjectclient) • [Top](#top)

### <a id="upload-workspace-object-with-par"></a>`upload_workspace_object_with_par`
Creates a workspace file by generating PAR or updates the metadata by close file. If file exists, then it will be updated.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `upload_file_with_par_details` (oci.aidataplatform_dp.models.UploadFileWithParDetails) — Contents of the file to upload.
- `path` (string) — The absolute path of the file or folder

**Optional Parameters:**
- `is_overwrite` (boolean) — A boolean which decides if overwrite is allowed
- `should_generate_new_par` (boolean) — Flag to toggle to generate short living par
- `should_create_recursively` (boolean) — A boolean which decides if parent directories should be created recursively during upload.
- `should_update_recent` (boolean) — A flag to identify if the recent list should be updated.
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `type` (string) — The type of workspace object.
- `object_description` (string) — The description of the workspace object
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.UploadFileWithParResult

**Response Fields:**
- `eTag` (string) — Gets the e_tag of this UploadFileWithParResult. Etag after creating or closing a file.
- `locationUri` (string) — Gets the location_uri of this UploadFileWithParResult. The object storage URI which has bucket and namespace information.

**Optional Response Fields:**
- `parUrl` (string) — Gets the par_url of this UploadFileWithParResult. String representing the PAR URL.
- `size` (number) — Gets the size of this UploadFileWithParResult. File size in bytes.
- `createdBy` (string) — Gets the created_by of this UploadFileWithParResult. The user who created the file.
- `updatedBy` (string) — Gets the updated_by of this UploadFileWithParResult. The user who last updated the file.
- `createdTime` (string) — Gets the created_time of this UploadFileWithParResult. The time at which the file was created.
- `updatedTime` (string) — Gets the updated_time of this UploadFileWithParResult. The last modified time of the file.
- `description` (string) — Gets the description of this UploadFileWithParResult. The file description.
- `systemTags` (dict(str, dict(str, object))) — Gets the system_tags of this UploadFileWithParResult. System tags for this resource. Each key is predefined and scoped to a namespace. Example: `{"orcl-cloud": {"free-tier-retained": "true"}}`

**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#workspace-object-workspaceobjectclient) • [Top](#top)

### <a id="zip-and-download-workspace-folder"></a>`zip_and_download_workspace_folder`
Starts asynchronous creation of a ZIP archive for a workspace folder. The response includes a PAR URL for downloading the archive after the operation succeeds.

**Required Parameters:**
- `ai_data_platform_id` (string) — The `OCID` of the AI Data Platform (Data Lake) instance.  https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm
- `workspace_key` (string) — The key of the Workspace
- `zip_and_download_folder_details` (oci.aidataplatform_dp.models.ZipAndDownloadFolderDetails) — Details for zipping a workspace folder for download.

**Optional Parameters:**
- `opc_retry_token` (string) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc_request_id` (string) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `retry_strategy` (obj) — A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level. This should be one of the strategies available in the oci.retry module. A convenience oci.retry.DEFAULT_RETRY_STRATEGY is also available. The specifics of the default retry strategy are described here. To have this operation explicitly not perform any retries, pass an instance of oci.retry.NoneRetryStrategy.

**Return Response:** `oci.response.Response` — A oci.response.Response object with data of type oci.aidataplatform_dp.models.ZipAndDownloadFolderResult

**Response Fields:**
- `operationKey` (string) — Gets the operation_key of this ZipAndDownloadFolderResult. Async operation key for zip creation.
- `downloadUrl` (string) — Gets the download_url of this ZipAndDownloadFolderResult. PAR URL for downloading the generated archive after async operation success.
- `archiveName` (string) — Gets the archive_name of this ZipAndDownloadFolderResult. Generated archive basename, including its .zip or .aidp extension.

**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#workspace-object-workspaceobjectclient) • [Top](#top)
