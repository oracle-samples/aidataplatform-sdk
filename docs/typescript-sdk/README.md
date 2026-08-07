<a id="top"></a>
# AIDP TypeScript SDK Operations Reference
This document summarizes the available service clients in the AIDP TypeScript SDK and details every operation's request parameters and responses.

## Clients
- [Agent (AgentClient)](#client-agentclient)
- [Async Operations (AsyncOperationsClient)](#client-asyncoperationsclient)
- [Audit (AuditClient)](#client-auditclient)
- [Bundle (BundleClient)](#client-bundleclient)
- [Catalog (CatalogClient)](#client-catalogclient)
- [Cluster (ClusterClient)](#client-clusterclient)
- [Credentials (CredentialsClient)](#client-credentialsclient)
- [Delta Share (DeltaShareClient)](#client-deltashareclient)
- [Git (GitClient)](#client-gitclient)
- [ML Ops (MLOpsClient)](#client-mlopsclient)
- [Notebook (NotebookClient)](#client-notebookclient)
- [Role (RoleClient)](#client-roleclient)
- [Schema (SchemaClient)](#client-schemaclient)
- [Semantic Catalog (SemanticCatalogClient)](#client-semanticcatalogclient)
- [User Setting (UserSettingClient)](#client-usersettingclient)
- [Volume (VolumeClient)](#client-volumeclient)
- [Workflow (WorkflowClient)](#client-workflowclient)
- [Workspace (WorkspaceClient)](#client-workspaceclient)
- [Workspace Object (WorkspaceObjectClient)](#client-workspaceobjectclient)

## <a id="client-agentclient"></a>AgentClient
**Operations:**
- [`copyAgent`](#operation-agentclient-copyagent)
- [`createAgent`](#operation-agentclient-createagent)
- [`deleteAgent`](#operation-agentclient-deleteagent)
- [`deleteAgentDeployment`](#operation-agentclient-deleteagentdeployment)
- [`deleteAgentSession`](#operation-agentclient-deleteagentsession)
- [`deployAgent`](#operation-agentclient-deployagent)
- [`getAgent`](#operation-agentclient-getagent)
- [`getAgentDeployment`](#operation-agentclient-getagentdeployment)
- [`getAgentSession`](#operation-agentclient-getagentsession)
- [`getAgentSessionTrace`](#operation-agentclient-getagentsessiontrace)
- [`listAgentDeployments`](#operation-agentclient-listagentdeployments)
- [`listAgentPermissions`](#operation-agentclient-listagentpermissions)
- [`listAgentSessionChatHistories`](#operation-agentclient-listagentsessionchathistories)
- [`listAgentSessions`](#operation-agentclient-listagentsessions)
- [`listAgents`](#operation-agentclient-listagents)
- [`manageAgentPermission`](#operation-agentclient-manageagentpermission)
- [`previewAgentAgentCard`](#operation-agentclient-previewagentagentcard)
- [`redeployAgentByKey`](#operation-agentclient-redeployagentbykey)
- [`updateAgent`](#operation-agentclient-updateagent)
- [`updateAgentDeploymentMetadata`](#operation-agentclient-updateagentdeploymentmetadata)
- [`validateAgent`](#operation-agentclient-validateagent)

### <a id="operation-agentclient-copyagent"></a>`copyAgent`
**Description:** Copy an Agent.

**Request Interface:** `requests.CopyAgentRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `agentKey` | `string` | The UUID of the Agent |
| `copyAgentDetails` | `model.CopyAgentDetails` | Details for copying the agent |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |

**Response Interface:** `responses.CopyAgentResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `location` | `string` | URL for the created Agent. The Agent key is generated after this request is sent. |
| `contentLocation` | `string` | Same as location. |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `agent` | `model.Agent` | The returned model.Agent instance. |

**Payload `Agent` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | The unique identifier (UUID) of the agent. |
| `displayName` | `string` | Agent name. |
| `workspaceKey` | `string` | The key of the workspace to which this agent belongs. |
| `description` | `string` | Agent description. |
| `pathInfo` | `string` | Path inside volume where the agent JSON is written. |
| `type` | `Agent.Type` | The type of agent (Canvas or Code). |
| `entryFilePath` | `string` | The path to project entry file. |
| `dependenciesFilePath` | `string` | The path to dependencies file. |
| `deploymentComputeKey` | `string` | The key of the compute where agent is deployed. |
| `deploymentMode` | `string` | Agent deployment mode. |
| `uri` | `string` | Agent URI. |
| `uriState` | `string` | Agent URI state. |
| `lifecycleState` | `Agent.LifecycleState` | The current state of the agent. |
| `lifecycleDetails` | `string` | A message that describes the current state of the agent in more detail. For example, can be used to provide actionable information for a resource in the Failed state. |
| `timeCreated` | `Date` | The date and time the agent was created. |
| `timeUpdated` | `Date` | The date and time the agent was updated. |
| `createdBy` | `string` | The OCID of the user/principal who created the agent. |
| `updatedBy` | `string` | The ID of the user who last updated the schema. |
| `computeKey` | `string` | The key of the agent compute associated with this agent. |
| `version` | `number` | A number indicating the version of the record. Each time the record is updated, this version will be incremented. This will be used for optimistic locking. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
**Return:** [Back to Agent (AgentClient)](#client-agentclient) • [Top](#top)


### <a id="operation-agentclient-createagent"></a>`createAgent`
**Description:** Create an Agent.

**Request Interface:** `requests.CreateAgentRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `createAgentDetails` | `model.CreateAgentDetails` | Details for the new Agent. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.CreateAgentResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `location` | `string` | URL for the created Agent. The Agent key is generated after this request is sent. |
| `contentLocation` | `string` | Same as location. |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `agent` | `model.Agent` | The returned model.Agent instance. |

**Payload `Agent` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | The unique identifier (UUID) of the agent. |
| `displayName` | `string` | Agent name. |
| `workspaceKey` | `string` | The key of the workspace to which this agent belongs. |
| `description` | `string` | Agent description. |
| `pathInfo` | `string` | Path inside volume where the agent JSON is written. |
| `type` | `Agent.Type` | The type of agent (Canvas or Code). |
| `entryFilePath` | `string` | The path to project entry file. |
| `dependenciesFilePath` | `string` | The path to dependencies file. |
| `deploymentComputeKey` | `string` | The key of the compute where agent is deployed. |
| `deploymentMode` | `string` | Agent deployment mode. |
| `uri` | `string` | Agent URI. |
| `uriState` | `string` | Agent URI state. |
| `lifecycleState` | `Agent.LifecycleState` | The current state of the agent. |
| `lifecycleDetails` | `string` | A message that describes the current state of the agent in more detail. For example, can be used to provide actionable information for a resource in the Failed state. |
| `timeCreated` | `Date` | The date and time the agent was created. |
| `timeUpdated` | `Date` | The date and time the agent was updated. |
| `createdBy` | `string` | The OCID of the user/principal who created the agent. |
| `updatedBy` | `string` | The ID of the user who last updated the schema. |
| `computeKey` | `string` | The key of the agent compute associated with this agent. |
| `version` | `number` | A number indicating the version of the record. Each time the record is updated, this version will be incremented. This will be used for optimistic locking. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
**Return:** [Back to Agent (AgentClient)](#client-agentclient) • [Top](#top)


### <a id="operation-agentclient-deleteagent"></a>`deleteAgent`
**Description:** Delete an Agent from the schema

**Request Interface:** `requests.DeleteAgentRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `agentKey` | `string` | The UUID of the Agent |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.DeleteAgentResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Agent (AgentClient)](#client-agentclient) • [Top](#top)


### <a id="operation-agentclient-deleteagentdeployment"></a>`deleteAgentDeployment`
**Description:** Delete an Agent Deployment.

**Request Interface:** `requests.DeleteAgentDeploymentRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `agentKey` | `string` | The UUID of the Agent |
| `agentDeploymentKey` | `string` | The UUID of the Agent Deployment |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.DeleteAgentDeploymentResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Agent (AgentClient)](#client-agentclient) • [Top](#top)


### <a id="operation-agentclient-deleteagentsession"></a>`deleteAgentSession`
**Description:** Delete an Agent Session.

**Request Interface:** `requests.DeleteAgentSessionRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `agentKey` | `string` | The UUID of the Agent |
| `sessionId` | `string` | The UUID of the Agent Session |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |

**Response Interface:** `responses.DeleteAgentSessionResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Agent (AgentClient)](#client-agentclient) • [Top](#top)


### <a id="operation-agentclient-deployagent"></a>`deployAgent`
**Description:** Deploys an Agent.

**Request Interface:** `requests.DeployAgentRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `agentKey` | `string` | The UUID of the Agent |
| `deployAgentDetails` | `model.DeployAgentDetails` | Details of a deployable Agent. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.DeployAgentResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `location` | `string` | URI for the created Agent deployment. |
| `contentLocation` | `string` | Same as location. |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `agentDeployment` | `model.AgentDeployment` | The returned model.AgentDeployment instance. |

**Payload `AgentDeployment` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | Identifier, generally UUID. |
| `displayName` | `string` | Display name. |
| `agentKey` | `string` | The unique identifier (UUID) of the agent. |
| `agentComputeKey` | `string` | The key of the agent compute associated with this agent. |
| `endpointUrl` | `string` | The endpointUrl where the client should connect to communicate with the agent. |
| `description` | `string` | deployment description. |
| `deploymentType` | `model.DeploymentType` | Type of an agent deployment. |
| `lifecycleState` | `model.DeploymentLifecycleState` | LifecycleState of an Agent Session or Deployment. |
| `deploymentVersion` | `string` | Version of agent deployed on compute. |
| `timeCreated` | `Date` | The date and time the Agent session was created. |
| `createdBy` | `string` | The OCID of the user/principal who created the agent session. |
| `timeUpdated` | `Date` | The date and time the agent deployment was updated. |
| `updatedBy` | `string` | The OCID of the user/principal who re-deployed the existing agent deployment. |
| `agentCardUrl` | `string` | AgentCard base URL. |
**Return:** [Back to Agent (AgentClient)](#client-agentclient) • [Top](#top)


### <a id="operation-agentclient-getagent"></a>`getAgent`
**Description:** Returns detailed information about an Agent.

**Request Interface:** `requests.GetAgentRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `agentKey` | `string` | The UUID of the Agent |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.GetAgentResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `agent` | `model.Agent` | The returned model.Agent instance. |

**Payload `Agent` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | The unique identifier (UUID) of the agent. |
| `displayName` | `string` | Agent name. |
| `workspaceKey` | `string` | The key of the workspace to which this agent belongs. |
| `description` | `string` | Agent description. |
| `pathInfo` | `string` | Path inside volume where the agent JSON is written. |
| `type` | `Agent.Type` | The type of agent (Canvas or Code). |
| `entryFilePath` | `string` | The path to project entry file. |
| `dependenciesFilePath` | `string` | The path to dependencies file. |
| `deploymentComputeKey` | `string` | The key of the compute where agent is deployed. |
| `deploymentMode` | `string` | Agent deployment mode. |
| `uri` | `string` | Agent URI. |
| `uriState` | `string` | Agent URI state. |
| `lifecycleState` | `Agent.LifecycleState` | The current state of the agent. |
| `lifecycleDetails` | `string` | A message that describes the current state of the agent in more detail. For example, can be used to provide actionable information for a resource in the Failed state. |
| `timeCreated` | `Date` | The date and time the agent was created. |
| `timeUpdated` | `Date` | The date and time the agent was updated. |
| `createdBy` | `string` | The OCID of the user/principal who created the agent. |
| `updatedBy` | `string` | The ID of the user who last updated the schema. |
| `computeKey` | `string` | The key of the agent compute associated with this agent. |
| `version` | `number` | A number indicating the version of the record. Each time the record is updated, this version will be incremented. This will be used for optimistic locking. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
**Return:** [Back to Agent (AgentClient)](#client-agentclient) • [Top](#top)


### <a id="operation-agentclient-getagentdeployment"></a>`getAgentDeployment`
**Description:** Returns detailed information about an Agent deployment.

**Request Interface:** `requests.GetAgentDeploymentRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `agentKey` | `string` | The UUID of the Agent |
| `agentDeploymentKey` | `string` | The UUID of the Agent Deployment |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.GetAgentDeploymentResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `agentDeployment` | `model.AgentDeployment` | The returned model.AgentDeployment instance. |

**Payload `AgentDeployment` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | Identifier, generally UUID. |
| `displayName` | `string` | Display name. |
| `agentKey` | `string` | The unique identifier (UUID) of the agent. |
| `agentComputeKey` | `string` | The key of the agent compute associated with this agent. |
| `endpointUrl` | `string` | The endpointUrl where the client should connect to communicate with the agent. |
| `description` | `string` | deployment description. |
| `deploymentType` | `model.DeploymentType` | Type of an agent deployment. |
| `lifecycleState` | `model.DeploymentLifecycleState` | LifecycleState of an Agent Session or Deployment. |
| `deploymentVersion` | `string` | Version of agent deployed on compute. |
| `timeCreated` | `Date` | The date and time the Agent session was created. |
| `createdBy` | `string` | The OCID of the user/principal who created the agent session. |
| `timeUpdated` | `Date` | The date and time the agent deployment was updated. |
| `updatedBy` | `string` | The OCID of the user/principal who re-deployed the existing agent deployment. |
| `agentCardUrl` | `string` | AgentCard base URL. |
**Return:** [Back to Agent (AgentClient)](#client-agentclient) • [Top](#top)


### <a id="operation-agentclient-getagentsession"></a>`getAgentSession`
**Description:** Returns detailed information about an Agent Session.

**Request Interface:** `requests.GetAgentSessionRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `agentKey` | `string` | The UUID of the Agent |
| `sessionId` | `string` | The UUID of the Agent Session |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.GetAgentSessionResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `agentSession` | `model.AgentSession` | The returned model.AgentSession instance. |

**Payload `AgentSession` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `displayName` | `string` | Display name. |
| `key` | `string` | Agent Session identifier. |
| `agentKey` | `string` | The Agent key for which the session is started. |
| `endpointUrl` | `string` | The endpointUrl where the client should connect to communicate with the agent. |
| `lifecycleState` | `model.DeploymentLifecycleState` | LifecycleState of an Agent Session or Deployment. |
| `agentComputeKey` | `string` | The Agent Compute Key where client can run or test the agent. |
| `timeCreated` | `Date` | The date and time the Agent session was created. |
| `updatedBy` | `string` | OCID of the user who updated this record |
| `createdBy` | `string` | The OCID of the user/principal who created the agent session. |
| `timeUpdated` | `Date` | The date and time the Agent session was updated. |
| `timeStarted` | `Date` | The date and time the session was started. |
| `timeEnded` | `Date` | The date and time the session was ended. |
**Return:** [Back to Agent (AgentClient)](#client-agentclient) • [Top](#top)


### <a id="operation-agentclient-getagentsessiontrace"></a>`getAgentSessionTrace`
**Description:** Returns trace details for a given message key.

**Request Interface:** `requests.GetAgentSessionTraceRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `agentKey` | `string` | The UUID of the Agent |
| `sessionId` | `string` | The UUID of the Agent Session |
| `traceKey` | `string` | A filter to return only resources that match the given display trace key exactly. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.GetAgentSessionTraceResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `traceDetails` | `model.TraceDetails` | The returned model.TraceDetails instance. |

**Payload `TraceDetails` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `traceId` | `string` | trace id |
| `parentSessionId` | `string` | session id |
| `spans` | `Array<model.SpanDetails>` | collections of spans |
| `startTime` | `number` | startTime Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `endTime` | `number` | endTime Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `resources` | `{ [key: string]: any` | Map of properties |
**Return:** [Back to Agent (AgentClient)](#client-agentclient) • [Top](#top)


### <a id="operation-agentclient-listagentdeployments"></a>`listAgentDeployments`
**Description:** Returns a list of deployments of an agent.

**Request Interface:** `requests.ListAgentDeploymentsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `agentKey` | `string` | The UUID of the Agent |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `displayName` | `string` | A filter to return only resources that match the given display name exactly. |
| `displayNameContains` | `string` | A filter to return only resources that have a display name containing the text provided. |
| `lifecycleState` | `Array<model.DeploymentLifecycleState>` | A filter to return only resources whose value matches the given lifecycleState. |
| `timeCreatedGreaterThanOrEqualTo` | `Date` | Fetch objects from repository that were created after or at the exact timestamp provided in parameter |
| `timeCreatedLessThanOrEqualTo` | `Date` | Fetch objects from repository that were created before or at the exact timestamp provided in parameter. |
| `sortBy` | `ListAgentDeploymentsRequest.SortBy` | The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending. |
| `computeKey` | `Array<string>` | Compute key. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ListAgentDeploymentsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `agentDeploymentCollection` | `model.AgentDeploymentCollection` | The returned model.AgentDeploymentCollection instance. |

**Payload `AgentDeploymentCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.AgentDeploymentSummary>` | List of agent deployments. |
**Return:** [Back to Agent (AgentClient)](#client-agentclient) • [Top](#top)


### <a id="operation-agentclient-listagentpermissions"></a>`listAgentPermissions`
**Description:** Returns a list of permissions for a given Agent.

**Request Interface:** `requests.ListAgentPermissionsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `agentKey` | `string` | The UUID of the Agent |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListAgentPermissionsRequest.SortBy` | The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.ListAgentPermissionsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `agentPermissionCollection` | `model.AgentPermissionCollection` | The returned model.AgentPermissionCollection instance. |

**Payload `AgentPermissionCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.AgentPermissionSummary>` | List of agent permissions. |
**Return:** [Back to Agent (AgentClient)](#client-agentclient) • [Top](#top)


### <a id="operation-agentclient-listagentsessionchathistories"></a>`listAgentSessionChatHistories`
**Description:** Returns list of Agent Session chat messages.

**Request Interface:** `requests.ListAgentSessionChatHistoriesRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `agentKey` | `string` | The UUID of the Agent |
| `sessionId` | `string` | The UUID of the Agent Session |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ListAgentSessionChatHistoriesResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sessionChatHistoryCollection` | `model.SessionChatHistoryCollection` | The returned model.SessionChatHistoryCollection instance. |

**Payload `SessionChatHistoryCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.SessionChatHistorySummary>` | Collection of chat messages |
**Return:** [Back to Agent (AgentClient)](#client-agentclient) • [Top](#top)


### <a id="operation-agentclient-listagentsessions"></a>`listAgentSessions`
**Description:** Returns a list of testing sessions of an Agent.

**Request Interface:** `requests.ListAgentSessionsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `agentKey` | `string` | The UUID of the Agent |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `displayNameContains` | `string` | A filter to return only resources that have a display name containing the text provided. |
| `timeCreatedGreaterThanOrEqualTo` | `Date` | Fetch objects from repository that were created after or at the exact timestamp provided in parameter |
| `timeCreatedLessThanOrEqualTo` | `Date` | Fetch objects from repository that were created before or at the exact timestamp provided in parameter. |
| `sortBy` | `ListAgentSessionsRequest.SortBy` | The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ListAgentSessionsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcPrevPage` | `string` | For list pagination. When this header appears in the response, previous pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `agentSessionCollection` | `model.AgentSessionCollection` | The returned model.AgentSessionCollection instance. |

**Payload `AgentSessionCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.AgentSessionSummary>` | List of agent sessions. |
**Return:** [Back to Agent (AgentClient)](#client-agentclient) • [Top](#top)


### <a id="operation-agentclient-listagents"></a>`listAgents`
**Description:** Returns a list of Agents in a schema.

**Request Interface:** `requests.ListAgentsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `computeKey` | `string` | Compute key. |
| `displayName` | `string` | A filter to return only resources that match the given display name exactly. |
| `displayNameContains` | `string` | A filter to return only resources that have a display name containing the text provided. |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListAgentsRequest.SortBy` | The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ListAgentsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `agentCollection` | `model.AgentCollection` | The returned model.AgentCollection instance. |

**Payload `AgentCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.AgentInfo>` | List of Agents. |
**Return:** [Back to Agent (AgentClient)](#client-agentclient) • [Top](#top)


### <a id="operation-agentclient-manageagentpermission"></a>`manageAgentPermission`
**Description:** Update the permissions for a given Agent.

**Request Interface:** `requests.ManageAgentPermissionRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `agentKey` | `string` | The UUID of the Agent |
| `manageAgentPermissionDetails` | `model.ManageAgentPermissionDetails` | The information to be updated. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.ManageAgentPermissionResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Agent (AgentClient)](#client-agentclient) • [Top](#top)


### <a id="operation-agentclient-previewagentagentcard"></a>`previewAgentAgentCard`
**Description:** Returns the agent card based on the given agent card configuration.

**Request Interface:** `requests.PreviewAgentAgentCardRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `previewAgentCardDetails` | `model.PreviewAgentCardDetails` | Request details for previewing an agent card |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.PreviewAgentAgentCardResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `agentCardPreviewResponse` | `model.AgentCardPreviewResponse` | The returned model.AgentCardPreviewResponse instance. |

**Payload `AgentCardPreviewResponse` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `agentCardJson` | `string` | JSON string representation of AgentCard |
**Return:** [Back to Agent (AgentClient)](#client-agentclient) • [Top](#top)


### <a id="operation-agentclient-redeployagentbykey"></a>`redeployAgentByKey`
**Description:** Redeploys an Agent.

**Request Interface:** `requests.RedeployAgentByKeyRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `agentKey` | `string` | The UUID of the Agent |
| `updateAgentDeploymentDetails` | `model.UpdateAgentDeploymentDetails` | Details for updating an Agent deployment asynchronously. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.RedeployAgentByKeyResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `location` | `string` | URI for the newly created Agent deployment. |
| `contentLocation` | `string` | Same as location. |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `agentDeployment` | `model.AgentDeployment` | The returned model.AgentDeployment instance. |

**Payload `AgentDeployment` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | Identifier, generally UUID. |
| `displayName` | `string` | Display name. |
| `agentKey` | `string` | The unique identifier (UUID) of the agent. |
| `agentComputeKey` | `string` | The key of the agent compute associated with this agent. |
| `endpointUrl` | `string` | The endpointUrl where the client should connect to communicate with the agent. |
| `description` | `string` | deployment description. |
| `deploymentType` | `model.DeploymentType` | Type of an agent deployment. |
| `lifecycleState` | `model.DeploymentLifecycleState` | LifecycleState of an Agent Session or Deployment. |
| `deploymentVersion` | `string` | Version of agent deployed on compute. |
| `timeCreated` | `Date` | The date and time the Agent session was created. |
| `createdBy` | `string` | The OCID of the user/principal who created the agent session. |
| `timeUpdated` | `Date` | The date and time the agent deployment was updated. |
| `updatedBy` | `string` | The OCID of the user/principal who re-deployed the existing agent deployment. |
| `agentCardUrl` | `string` | AgentCard base URL. |
**Return:** [Back to Agent (AgentClient)](#client-agentclient) • [Top](#top)


### <a id="operation-agentclient-updateagent"></a>`updateAgent`
**Description:** Update an Agent with provided details.

**Request Interface:** `requests.UpdateAgentRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `agentKey` | `string` | The UUID of the Agent |
| `updateAgentDetails` | `model.UpdateAgentDetails` | The information to be updated. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.UpdateAgentResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `agent` | `model.Agent` | The returned model.Agent instance. |

**Payload `Agent` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | The unique identifier (UUID) of the agent. |
| `displayName` | `string` | Agent name. |
| `workspaceKey` | `string` | The key of the workspace to which this agent belongs. |
| `description` | `string` | Agent description. |
| `pathInfo` | `string` | Path inside volume where the agent JSON is written. |
| `type` | `Agent.Type` | The type of agent (Canvas or Code). |
| `entryFilePath` | `string` | The path to project entry file. |
| `dependenciesFilePath` | `string` | The path to dependencies file. |
| `deploymentComputeKey` | `string` | The key of the compute where agent is deployed. |
| `deploymentMode` | `string` | Agent deployment mode. |
| `uri` | `string` | Agent URI. |
| `uriState` | `string` | Agent URI state. |
| `lifecycleState` | `Agent.LifecycleState` | The current state of the agent. |
| `lifecycleDetails` | `string` | A message that describes the current state of the agent in more detail. For example, can be used to provide actionable information for a resource in the Failed state. |
| `timeCreated` | `Date` | The date and time the agent was created. |
| `timeUpdated` | `Date` | The date and time the agent was updated. |
| `createdBy` | `string` | The OCID of the user/principal who created the agent. |
| `updatedBy` | `string` | The ID of the user who last updated the schema. |
| `computeKey` | `string` | The key of the agent compute associated with this agent. |
| `version` | `number` | A number indicating the version of the record. Each time the record is updated, this version will be incremented. This will be used for optimistic locking. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
**Return:** [Back to Agent (AgentClient)](#client-agentclient) • [Top](#top)


### <a id="operation-agentclient-updateagentdeploymentmetadata"></a>`updateAgentDeploymentMetadata`
**Description:** Update the deployment metadata for an Agent.

**Request Interface:** `requests.UpdateAgentDeploymentMetadataRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `agentKey` | `string` | The UUID of the Agent |
| `updateAgentDeploymentMetadataDetails` | `model.UpdateAgentDeploymentMetadataDetails` | Agent card details to update |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |

**Response Interface:** `responses.UpdateAgentDeploymentMetadataResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `agentDeployment` | `model.AgentDeployment` | The returned model.AgentDeployment instance. |

**Payload `AgentDeployment` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | Identifier, generally UUID. |
| `displayName` | `string` | Display name. |
| `agentKey` | `string` | The unique identifier (UUID) of the agent. |
| `agentComputeKey` | `string` | The key of the agent compute associated with this agent. |
| `endpointUrl` | `string` | The endpointUrl where the client should connect to communicate with the agent. |
| `description` | `string` | deployment description. |
| `deploymentType` | `model.DeploymentType` | Type of an agent deployment. |
| `lifecycleState` | `model.DeploymentLifecycleState` | LifecycleState of an Agent Session or Deployment. |
| `deploymentVersion` | `string` | Version of agent deployed on compute. |
| `timeCreated` | `Date` | The date and time the Agent session was created. |
| `createdBy` | `string` | The OCID of the user/principal who created the agent session. |
| `timeUpdated` | `Date` | The date and time the agent deployment was updated. |
| `updatedBy` | `string` | The OCID of the user/principal who re-deployed the existing agent deployment. |
| `agentCardUrl` | `string` | AgentCard base URL. |
**Return:** [Back to Agent (AgentClient)](#client-agentclient) • [Top](#top)


### <a id="operation-agentclient-validateagent"></a>`validateAgent`
**Description:** Validate the agent json diagram generated by UI.

**Request Interface:** `requests.ValidateAgentRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `agentKey` | `string` | The UUID of the Agent |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.ValidateAgentResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `validateAgentResponse` | `model.ValidateAgentResponse` | The returned model.ValidateAgentResponse instance. |

**Payload `ValidateAgentResponse` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `isValidAgent` | `boolean` | true if valid, else false |
| `validationError` | `Array<model.ValidationError>` | List of validation errors encountered in the diagram. |
**Return:** [Back to Agent (AgentClient)](#client-agentclient) • [Top](#top)


## <a id="client-asyncoperationsclient"></a>AsyncOperationsClient
**Operations:**
- [`getAsyncOperation`](#operation-asyncoperationsclient-getasyncoperation)
- [`listAsyncOperations`](#operation-asyncoperationsclient-listasyncoperations)

### <a id="operation-asyncoperationsclient-getasyncoperation"></a>`getAsyncOperation`
**Description:** Get detailed information for a particular async operation

**Request Interface:** `requests.GetAsyncOperationRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `asyncOperationKey` | `string` | The unique identifier of an async operation |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.GetAsyncOperationResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `asyncOperation` | `model.AsyncOperation` | The returned model.AsyncOperation instance. |

**Payload `AsyncOperation` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | The unique key that identifies an async operation |
| `resourceType` | `model.AsyncOperationResourceType` | The resource type of the async operation. |
| `actionType` | `model.AsyncOperationActionType` | The action type of the async operation. |
| `resourceName` | `string` | The fully qualified name of the Data Lake resource. Example: For table, it is <catalog_name>.<schema_name>.<table_name>. For Cluster, it is <workspace_key>.<cluster_key> |
| `resourceDisplayName` | `string` | The display name of the Data Lake resource. Example: For catalog/table/schema, it is same as resourceName But for workspace/cluster it is workspace and cluster displayName field. |
| `createdBy` | `string` | The principal Id who started the async operation |
| `createdByName` | `string` | The principal name who started the async operation |
| `timeStarted` | `Date` | The date and time the Async operation was started, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z} |
| `timeFinished` | `Date` | The date and time the Async operation finished, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z} |
| `status` | `model.AsyncOperationStatus` | The state of the Table. |
| `errorCode` | `string` | Represents the error code of a failure |
| `errorMessage` | `string` | Representss extra error information of a failure |
**Return:** [Back to Async Operations (AsyncOperationsClient)](#client-asyncoperationsclient) • [Top](#top)


### <a id="operation-asyncoperationsclient-listasyncoperations"></a>`listAsyncOperations`
**Description:** List all async operations for a resource type. Filters can be used to narrow the search down.

**Request Interface:** `requests.ListAsyncOperationsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `resourceType` | `string` | Required parameter which decides async operation resource type |
| `resourceName` | `string` | A filter to return only resources that match the given resource name exactly. |
| `matchResourceName` | `boolean` | Parameter which decides to list async operations with prefix or exact match to resourceName |
| `status` | `string` | Option parameter to filter operation on status |
| `shouldFilterByCallingPrincipal` | `boolean` | A filter to return only resources that match the current principal. |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListAsyncOperationsRequest.SortBy` | The field to sort by. You can provide only one sort order. Default order for {@code timeStarted} is descending. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ListAsyncOperationsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `asyncOperationCollection` | `model.AsyncOperationCollection` | The returned model.AsyncOperationCollection instance. |

**Payload `AsyncOperationCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.AsyncOperationSummary>` | List of Async Operations. |
**Return:** [Back to Async Operations (AsyncOperationsClient)](#client-asyncoperationsclient) • [Top](#top)


## <a id="client-auditclient"></a>AuditClient
**Operations:**
- [`manageAuditLogs`](#operation-auditclient-manageauditlogs)
- [`searchAuditLogs`](#operation-auditclient-searchauditlogs)

### <a id="operation-auditclient-manageauditlogs"></a>`manageAuditLogs`
**Description:** Manages audit logs.

**Request Interface:** `requests.ManageAuditLogsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `manageAuditLogsDetails` | `model.ManageAuditLogsDetails` | Details to update in an audit log. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ManageAuditLogsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Audit (AuditClient)](#client-auditclient) • [Top](#top)


### <a id="operation-auditclient-searchauditlogs"></a>`searchAuditLogs`
**Description:** Searches audit logs.

**Request Interface:** `requests.SearchAuditLogsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `searchAuditLogsDetails` | `model.SearchAuditLogsDetails` | Details for the audit log search. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |

**Response Interface:** `responses.SearchAuditLogsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `auditLogSearchResultCollection` | `model.AuditLogSearchResultCollection` | The returned model.AuditLogSearchResultCollection instance. |

**Payload `AuditLogSearchResultCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.AuditLogSearchResultSummary>` | Audit log search results. |
**Return:** [Back to Audit (AuditClient)](#client-auditclient) • [Top](#top)


## <a id="client-bundleclient"></a>BundleClient
**Operations:**
- [`createBundle`](#operation-bundleclient-createbundle)
- [`createBundleAction`](#operation-bundleclient-createbundleaction)
- [`deployBundle`](#operation-bundleclient-deploybundle)
- [`deployBundleAction`](#operation-bundleclient-deploybundleaction)
- [`fetchBundleDeploymentStatus`](#operation-bundleclient-fetchbundledeploymentstatus)
- [`fetchBundleDeploymentStatusAction`](#operation-bundleclient-fetchbundledeploymentstatusaction)
- [`purgeBundle`](#operation-bundleclient-purgebundle)
- [`purgeBundleAction`](#operation-bundleclient-purgebundleaction)
- [`syncBundle`](#operation-bundleclient-syncbundle)
- [`syncBundleAction`](#operation-bundleclient-syncbundleaction)

### <a id="operation-bundleclient-createbundle"></a>`createBundle`
**Description:** (Deprecated) Creates a new bundle. A bundle is a self-contained, portable representation of selected workspace assets, such as jobs and agent flows, along with their dependencies and associated code artifacts. It captures both the resource configurations and the supporting assets required to recreate those resources in another workspace or environment. The bundle manifest is named `aidp_workbench.yaml`. The bundle preserves the workspace folder structure for code artifacts from the location where it was created, so the generated bundle mirrors the source layout. Dependencies are tracked inside the bundle under each asset type: - job and agent flow dependencies are added under the `dependencies` folder inside the `jobs` and `agentflows` folders - code dependencies are added under the `artifacts` directory in the bundle Dependency references use template variables, for example: - compute: `$${jobs.dependencies.training_compute.compute.key}` - nested jobs: `$${jobs.dependencies.training_job.job.key}` - aicompute: `$${jobs.dependencies.training_aicompute.aicompute.key}` Bundles also support the special variable `$${bundle.root}`, which points to the root of the bundle folder and is used for referencing artifacts. Variables and overrides: - bundles support parameterization using variables defined in the bundle manifest (`aidp_workbench.yaml`) Example manifest defaults: defaults: variables: job_compute_key: "$${jobs.dependencies.small.compute.key}" - variables can be referenced in resource descriptors using the `$${var.<name>}` syntax Example usage in a job descriptor: "clusterKey": "$${var.job_compute_key}" - workspace-specific overrides can be provided via `.aidp/overrides.yaml` inside the bundle - this file is intended for environment-specific configuration and should not be committed to Git, allowing the bundle to remain portable and environment-agnostic Example overrides file: variables: job_compute_key: f6e7f5d8-d965-4009-95d9-02e993d9a16b - when an override is provided, the referenced dependency (for example, compute) is not created, and the provided value is used instead - when no override is provided, the system falls back to the default variable value, which may reference a dependency included in the bundle (resulting in that dependency being created) - this mechanism enables environment-specific customization (for example, reusing existing infrastructure in production while creating new resources in development) - the same pattern can be used for other environment-specific parameters such as compute shape, number of OCPUs, or other configuration values Git integration and promotion: - bundles can only be created inside Git-backed workspace folders - bundles are self-contained packages that include resource definitions, dependency references, and associated code artifacts required to recreate the bundled resources - the entire bundle folder can be committed and pushed to a Git repository - bundles can be pulled into another workspace via Git and deployed there - bundles can be promoted across environments (for example, dev → test → prod) using Git workflows - because the bundle includes both resource configuration and code dependencies, it can be used to reliably replicate assets across workspaces This operation is asynchronous. The service validates the request, starts bundle creation, and returns an async operation key in the response headers. Use the async operation APIs to track completion. Typical use cases: - capture selected workspace resources into a version-controlled bundle - prepare a bundle for later deployment or promotion - establish a bundle root that can later be inspected, updated, or deployed Request notes: - `path` identifies the parent folder in the workspace volume where the bundle should be created - `name` identifies the bundle folder name - `bundledResources` identifies which workspace resources should be included

**Request Interface:** `requests.CreateBundleRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `createBundleDetails` | `model.CreateBundleDetails` | Request payload for bundle creation. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.CreateBundleResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
**Return:** [Back to Bundle (BundleClient)](#client-bundleclient) • [Top](#top)


### <a id="operation-bundleclient-createbundleaction"></a>`createBundleAction`
**Description:** (Preview) Creates a new bundle. A bundle is a self-contained, portable representation of selected workspace assets, such as jobs and agent flows, along with their dependencies and associated code artifacts. It captures both the resource configurations and the supporting assets required to recreate those resources in another workspace or environment. The bundle manifest is named `aidp_workbench.yaml`. The bundle preserves the workspace folder structure for code artifacts from the location where it was created, so the generated bundle mirrors the source layout. Dependencies are tracked inside the bundle under each asset type: - job and agent flow dependencies are added under the `dependencies` folder inside the `jobs` and `agentflows` folders - code dependencies are added under the `artifacts` directory in the bundle Dependency references use template variables, for example: - compute: `$${jobs.dependencies.training_compute.compute.key}` - nested jobs: `$${jobs.dependencies.training_job.job.key}` - aicompute: `$${jobs.dependencies.training_aicompute.aicompute.key}` Bundles also support the special variable `$${bundle.root}`, which points to the root of the bundle folder and is used for referencing artifacts. Variables and overrides: - bundles support parameterization using variables defined in the bundle manifest (`aidp_workbench.yaml`) Example manifest defaults: defaults: variables: job_compute_key: "$${jobs.dependencies.small.compute.key}" - variables can be referenced in resource descriptors using the `$${var.<name>}` syntax Example usage in a job descriptor: "clusterKey": "$${var.job_compute_key}" - workspace-specific overrides can be provided via `.aidp/overrides.yaml` inside the bundle - this file is intended for environment-specific configuration and should not be committed to Git, allowing the bundle to remain portable and environment-agnostic Example overrides file: variables: job_compute_key: f6e7f5d8-d965-4009-95d9-02e993d9a16b - when an override is provided, the referenced dependency (for example, compute) is not created, and the provided value is used instead - when no override is provided, the system falls back to the default variable value, which may reference a dependency included in the bundle (resulting in that dependency being created) - this mechanism enables environment-specific customization (for example, reusing existing infrastructure in production while creating new resources in development) - the same pattern can be used for other environment-specific parameters such as compute shape, number of OCPUs, or other configuration values Git integration and promotion: - bundles can only be created inside Git-backed workspace folders - bundles are self-contained packages that include resource definitions, dependency references, and associated code artifacts required to recreate the bundled resources - the entire bundle folder can be committed and pushed to a Git repository - bundles can be pulled into another workspace via Git and deployed there - bundles can be promoted across environments (for example, dev → test → prod) using Git workflows - because the bundle includes both resource configuration and code dependencies, it can be used to reliably replicate assets across workspaces This operation is asynchronous. The service validates the request, starts bundle creation, and returns an async operation key in the response headers. Use the async operation APIs to track completion. Typical use cases: - capture selected workspace resources into a version-controlled bundle - prepare a bundle for later deployment or promotion - establish a bundle root that can later be inspected, updated, or deployed Request notes: - `path` identifies the parent folder in the workspace volume where the bundle should be created - `name` identifies the bundle folder name - `bundledResources` identifies which workspace resources should be included

**Request Interface:** `requests.CreateBundleActionRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `createBundleDetails` | `model.CreateBundleDetails` | Request payload for bundle creation. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.CreateBundleActionResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
**Return:** [Back to Bundle (BundleClient)](#client-bundleclient) • [Top](#top)


### <a id="operation-bundleclient-deploybundle"></a>`deployBundle`
**Description:** (Deprecated) Deploys the specified bundle, creating or updating jobs and agent flows according to the bundle manifest. Returns an async job key for tracking deployment progress. This operation is asynchronous. The request is accepted for background execution and returns an async operation key in the response headers. Deployment typically uses: - the bundle manifest at the bundle root - top-level resource descriptors in the bundle - dependency descriptors referenced by those top-level resources - default or override variable values when present Use this operation when you want to apply the bundle contents into the target workspace state. Request notes: - `path` identifies the bundle root folder in the workspace volume

**Request Interface:** `requests.DeployBundleRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `deployBundleDetails` | `model.DeployBundleDetails` | Request payload for bundle deploy. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.DeployBundleResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
**Return:** [Back to Bundle (BundleClient)](#client-bundleclient) • [Top](#top)


### <a id="operation-bundleclient-deploybundleaction"></a>`deployBundleAction`
**Description:** (Preview) Deploys the specified bundle, creating or updating jobs and agent flows according to the bundle manifest. Returns an async job key for tracking deployment progress. This operation is asynchronous. The request is accepted for background execution and returns an async operation key in the response headers. Deployment typically uses: - the bundle manifest at the bundle root - top-level resource descriptors in the bundle - dependency descriptors referenced by those top-level resources - default or override variable values when present Use this operation when you want to apply the bundle contents into the target workspace state. Request notes: - `path` identifies the bundle root folder in the workspace volume

**Request Interface:** `requests.DeployBundleActionRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `deployBundleDetails` | `model.DeployBundleDetails` | Request payload for bundle deploy. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.DeployBundleActionResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
**Return:** [Back to Bundle (BundleClient)](#client-bundleclient) • [Top](#top)


### <a id="operation-bundleclient-fetchbundledeploymentstatus"></a>`fetchBundleDeploymentStatus`
**Description:** (Deprecated) Returns a high-level summary of the most recent deployment activity recorded for the specified bundle. This operation is useful after deploy or purge requests when you want the latest bundle-level deployment outcome rather than raw async operation details. The response can include: - overall deployment status - start and completion timestamps - summary message - resources associated with the last recorded deployment result Typical status values include: - `IN_PROGRESS` - `SUCCEEDED` - `FAILED` - `NOT_DEPLOYED` Request notes: - `path` identifies the bundle root folder in the workspace volume

**Request Interface:** `requests.FetchBundleDeploymentStatusRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `fetchBundleDeploymentStatusDetails` | `model.FetchBundleDeploymentStatusDetails` | Request payload for FetchBundleDeploymentStatusDetails. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.FetchBundleDeploymentStatusResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `bundleDeploymentStatus` | `model.BundleDeploymentStatus` | The returned model.BundleDeploymentStatus instance. |

**Payload `BundleDeploymentStatus` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `status` | `BundleDeploymentStatus.Status` | Overall status of the last deployment. |
| `timeStarted` | `Date` | The deployment start time |
| `timeCompleted` | `Date` | The deployment end time |
| `message` | `string` | Optional summary message for the last deployment. |
| `resources` | `Array<model.BundleDeployedResource>` | List of resources from the last deployment. |
**Return:** [Back to Bundle (BundleClient)](#client-bundleclient) • [Top](#top)


### <a id="operation-bundleclient-fetchbundledeploymentstatusaction"></a>`fetchBundleDeploymentStatusAction`
**Description:** (Preview) Returns a high-level summary of the most recent deployment activity recorded for the specified bundle. This operation is useful after deploy or purge requests when you want the latest bundle-level deployment outcome rather than raw async operation details. The response can include: - overall deployment status - start and completion timestamps - summary message - resources associated with the last recorded deployment result Typical status values include: - `IN_PROGRESS` - `SUCCEEDED` - `FAILED` - `NOT_DEPLOYED` Request notes: - `path` identifies the bundle root folder in the workspace volume

**Request Interface:** `requests.FetchBundleDeploymentStatusActionRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `fetchBundleDeploymentStatusDetails` | `model.FetchBundleDeploymentStatusDetails` | Request payload for FetchBundleDeploymentStatusDetails. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.FetchBundleDeploymentStatusActionResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `bundleDeploymentStatus` | `model.BundleDeploymentStatus` | The returned model.BundleDeploymentStatus instance. |

**Payload `BundleDeploymentStatus` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `status` | `BundleDeploymentStatus.Status` | Overall status of the last deployment. |
| `timeStarted` | `Date` | The deployment start time |
| `timeCompleted` | `Date` | The deployment end time |
| `message` | `string` | Optional summary message for the last deployment. |
| `resources` | `Array<model.BundleDeployedResource>` | List of resources from the last deployment. |
**Return:** [Back to Bundle (BundleClient)](#client-bundleclient) • [Top](#top)


### <a id="operation-bundleclient-purgebundle"></a>`purgeBundle`
**Description:** (Deprecated) Tears down all resources deployed by the specified bundle in the workspace. This operation is intended to tear down resources that were created or managed through bundle deployment. It does not delete the bundle files themselves from the workspace volume. This operation is asynchronous. The service accepts the purge request, starts the background teardown workflow, and returns async operation headers. Typical use cases: - remove resources that were previously deployed from a bundle - clean up a workspace before re-deploying or retiring a bundle Request notes: - `path` identifies the bundle root folder in the workspace volume

**Request Interface:** `requests.PurgeBundleRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `purgeBundleDetails` | `model.PurgeBundleDetails` | Request payload for bundle purge. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.PurgeBundleResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
**Return:** [Back to Bundle (BundleClient)](#client-bundleclient) • [Top](#top)


### <a id="operation-bundleclient-purgebundleaction"></a>`purgeBundleAction`
**Description:** (Preview) Tears down all resources deployed by the specified bundle in the workspace. This operation is intended to tear down resources that were created or managed through bundle deployment. It does not delete the bundle files themselves from the workspace volume. This operation is asynchronous. The service accepts the purge request, starts the background teardown workflow, and returns async operation headers. Typical use cases: - remove resources that were previously deployed from a bundle - clean up a workspace before re-deploying or retiring a bundle Request notes: - `path` identifies the bundle root folder in the workspace volume

**Request Interface:** `requests.PurgeBundleActionRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `purgeBundleDetails` | `model.PurgeBundleDetails` | Request payload for bundle purge. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.PurgeBundleActionResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
**Return:** [Back to Bundle (BundleClient)](#client-bundleclient) • [Top](#top)


### <a id="operation-bundleclient-syncbundle"></a>`syncBundle`
**Description:** (Deprecated) Synchronizes the code, descriptors, and mapping in the bundle by reconciling the contents with the resource origins. Returns an async job key for tracking sync progress. This operation is intended for cases where the bundle should be refreshed to reflect newer source changes while preserving the bundle structure and identity. Sync uses the bundle's recorded origin metadata to rebuild the bundle from the source jobs and agent flows that were captured when the bundle was created. The source metadata is stored in `.aidp/resource_origins.yaml` and must match the requested AIDP/Data Lake and workspace. The operation refreshes source-controlled bundle content while preserving the bundle identity and runtime metadata. During sync, the service stages a refreshed bundle snapshot under the bundle `.aidp` directory, compares existing and staged descriptors, preserves existing variable aliases and override references where possible, merges existing manifest default variables, and then promotes the refreshed source-controlled files back into the bundle root. Sync preserves environment-specific and deployment runtime files such as `.aidp/overrides.yaml` and `.aidp/aidp.state.json`. These files are not replaced by the refreshed source snapshot. This operation is asynchronous and returns async operation headers when accepted. Typical use cases: - refresh bundle contents after upstream workspace resources have changed - reconcile descriptor or artifact content with current resource origins - preserve local bundle overrides while pulling in source resource updates - keep a Git-backed bundle current before committing or promoting it Request notes: - `path` identifies the bundle root folder in the workspace volume - the bundle must contain a valid `aidp_workbench.yaml` - the bundle must contain `.aidp/resource_origins.yaml` - origin metadata must refer to the same AIDP/Data Lake and workspace as the request

**Request Interface:** `requests.SyncBundleRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `syncBundleDetails` | `model.SyncBundleDetails` | Request payload for bundle sync. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.SyncBundleResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
**Return:** [Back to Bundle (BundleClient)](#client-bundleclient) • [Top](#top)


### <a id="operation-bundleclient-syncbundleaction"></a>`syncBundleAction`
**Description:** (Preview) Synchronizes the code, descriptors, and mapping in the bundle by reconciling the contents with the resource origins. Returns an async job key for tracking sync progress. This operation is intended for cases where the bundle should be refreshed to reflect newer source changes while preserving the bundle structure and identity. Sync uses the bundle's recorded origin metadata to rebuild the bundle from the source jobs and agent flows that were captured when the bundle was created. The source metadata is stored in `.aidp/resource_origins.yaml` and must match the requested AIDP/Data Lake and workspace. The operation refreshes source-controlled bundle content while preserving the bundle identity and runtime metadata. During sync, the service stages a refreshed bundle snapshot under the bundle `.aidp` directory, compares existing and staged descriptors, preserves existing variable aliases and override references where possible, merges existing manifest default variables, and then promotes the refreshed source-controlled files back into the bundle root. Sync preserves environment-specific and deployment runtime files such as `.aidp/overrides.yaml` and `.aidp/aidp.state.json`. These files are not replaced by the refreshed source snapshot. This operation is asynchronous and returns async operation headers when accepted. Typical use cases: - refresh bundle contents after upstream workspace resources have changed - reconcile descriptor or artifact content with current resource origins - preserve local bundle overrides while pulling in source resource updates - keep a Git-backed bundle current before committing or promoting it Request notes: - `path` identifies the bundle root folder in the workspace volume - the bundle must contain a valid `aidp_workbench.yaml` - the bundle must contain `.aidp/resource_origins.yaml` - origin metadata must refer to the same AIDP/Data Lake and workspace as the request

**Request Interface:** `requests.SyncBundleActionRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `syncBundleDetails` | `model.SyncBundleDetails` | Request payload for bundle sync. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.SyncBundleActionResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
**Return:** [Back to Bundle (BundleClient)](#client-bundleclient) • [Top](#top)


## <a id="client-catalogclient"></a>CatalogClient
**Operations:**
- [`catalogTestConnection`](#operation-catalogclient-catalogtestconnection)
- [`createCatalog`](#operation-catalogclient-createcatalog)
- [`deleteCatalog`](#operation-catalogclient-deletecatalog)
- [`getCatalog`](#operation-catalogclient-getcatalog)
- [`listCatalogPermissions`](#operation-catalogclient-listcatalogpermissions)
- [`listCatalogs`](#operation-catalogclient-listcatalogs)
- [`manageCatalogPermission`](#operation-catalogclient-managecatalogpermission)
- [`refreshCatalog`](#operation-catalogclient-refreshcatalog)
- [`updateCatalog`](#operation-catalogclient-updatecatalog)

### <a id="operation-catalogclient-catalogtestconnection"></a>`catalogTestConnection`
**Description:** Tests the connection to an external catalog.

**Request Interface:** `requests.CatalogTestConnectionRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `catalogTestConnectionDetails` | `model.CatalogTestConnectionDetails` | Details for the AI Data Platform Workbench catalog to be tested for connection. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.CatalogTestConnectionResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Catalog (CatalogClient)](#client-catalogclient) • [Top](#top)


### <a id="operation-catalogclient-createcatalog"></a>`createCatalog`
**Description:** Creates a catalog with the given ID.

**Request Interface:** `requests.CreateCatalogRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `createCatalogDetails` | `model.CreateCatalogDetails` | Details for the new AI Data Platform Workbench catalog. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.CreateCatalogResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `location` | `string` | URL for the created catalog. The AI Data Platform Workbench catalog key is generated after this request is sent. |
| `contentLocation` | `string` | Same as location. |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Catalog (CatalogClient)](#client-catalogclient) • [Top](#top)


### <a id="operation-catalogclient-deletecatalog"></a>`deleteCatalog`
**Description:** Deletes the specified catalog.

**Request Interface:** `requests.DeleteCatalogRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `catalogKey` | `string` | The key of the catalog. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `isForced` | `boolean` | A boolean which decides if an entity should be deleted with Cascade effect |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.DeleteCatalogResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Catalog (CatalogClient)](#client-catalogclient) • [Top](#top)


### <a id="operation-catalogclient-getcatalog"></a>`getCatalog`
**Description:** Gets detailed information about a catalog with a given catalog key.

**Request Interface:** `requests.GetCatalogRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `catalogKey` | `string` | The key of the catalog. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `isCatalogGuid` | `boolean` | A boolean which decides if catalogKey path parameter is catalog GUID (UUID) or name. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.GetCatalogResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `catalog` | `model.Catalog` | The returned model.Catalog instance. |

**Payload `Catalog` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | The AI Data Platform Workbench catalog key. |
| `displayName` | `string` | Catalog display name. |
| `description` | `string` | Short description of the catalog. |
| `catalogGuid` | `string` | Unique identifier for catalog. |
| `catalogType` | `model.CatalogType` | Type of catalog. |
| `sourceType` | `model.ExternalCatalogSourceType` | External catalog source type. |
| `lifecycleState` | `model.CatalogLifecycleState` | The current status of the catalog. |
| `lifecycleStateDetails` | `string` | A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state. |
| `timeCreated` | `Date` | The date and time the AI Data Platform Workbench catalog was created. |
| `timeUpdated` | `Date` | The date and time the AI Data Platform Workbench catalog was updated. |
| `createdBy` | `string` | The ID of the user that created the catalog. |
| `updatedBy` | `string` | The ID of the last user to update the catalog. |
| `properties` | `{ [key: string]: string` | Key-value pair used to provide catalog properties like the subCompartment OCID where the buckets need to reside. |
**Return:** [Back to Catalog (CatalogClient)](#client-catalogclient) • [Top](#top)


### <a id="operation-catalogclient-listcatalogpermissions"></a>`listCatalogPermissions`
**Description:** Gets a list of all permissions in the specified catalog.

**Request Interface:** `requests.ListCatalogPermissionsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `catalogKey` | `string` | The key of the catalog. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListCatalogPermissionsRequest.SortBy` | The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.ListCatalogPermissionsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `catalogPermissionCollection` | `model.CatalogPermissionCollection` | The returned model.CatalogPermissionCollection instance. |

**Payload `CatalogPermissionCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.CatalogPermissionSummary>` | List of catalog permissions. |
**Return:** [Back to Catalog (CatalogClient)](#client-catalogclient) • [Top](#top)


### <a id="operation-catalogclient-listcatalogs"></a>`listCatalogs`
**Description:** Gets a list of catalogs with a given ID.

**Request Interface:** `requests.ListCatalogsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `displayName` | `string` | A filter to return only resources that match the given display name exactly. |
| `catalogState` | `ListCatalogsRequest.CatalogState` | The state of the catalog. |
| `catalogType` | `ListCatalogsRequest.CatalogType` | The type of the catalog. |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListCatalogsRequest.SortBy` | The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ListCatalogsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `catalogCollection` | `model.CatalogCollection` | The returned model.CatalogCollection instance. |

**Payload `CatalogCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.CatalogSummary>` | List of catalogs. |
**Return:** [Back to Catalog (CatalogClient)](#client-catalogclient) • [Top](#top)


### <a id="operation-catalogclient-managecatalogpermission"></a>`manageCatalogPermission`
**Description:** Updates permission details for a catalog.

**Request Interface:** `requests.ManageCatalogPermissionRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `catalogKey` | `string` | The key of the catalog. |
| `manageCatalogPermissionDetails` | `model.ManageCatalogPermissionDetails` | The information to be updated. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.ManageCatalogPermissionResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Catalog (CatalogClient)](#client-catalogclient) • [Top](#top)


### <a id="operation-catalogclient-refreshcatalog"></a>`refreshCatalog`
**Description:** Refreshes a catalog through a crawler.

**Request Interface:** `requests.RefreshCatalogRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `catalogKey` | `string` | The key of the catalog. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |

**Response Interface:** `responses.RefreshCatalogResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
**Return:** [Back to Catalog (CatalogClient)](#client-catalogclient) • [Top](#top)


### <a id="operation-catalogclient-updatecatalog"></a>`updateCatalog`
**Description:** Updates the details of a catalog with the given information.

**Request Interface:** `requests.UpdateCatalogRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `catalogKey` | `string` | The key of the catalog. |
| `updateCatalogDetails` | `model.UpdateCatalogDetails` | The information to be updated. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.UpdateCatalogResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Catalog (CatalogClient)](#client-catalogclient) • [Top](#top)


## <a id="client-clusterclient"></a>ClusterClient
**Operations:**
- [`createCluster`](#operation-clusterclient-createcluster)
- [`deleteCluster`](#operation-clusterclient-deletecluster)
- [`downloadClusterLogs`](#operation-clusterclient-downloadclusterlogs)
- [`getCluster`](#operation-clusterclient-getcluster)
- [`getDefaultCluster`](#operation-clusterclient-getdefaultcluster)
- [`listClusterLibraries`](#operation-clusterclient-listclusterlibraries)
- [`listClusterPermissions`](#operation-clusterclient-listclusterpermissions)
- [`listClusters`](#operation-clusterclient-listclusters)
- [`manageClusterPermission`](#operation-clusterclient-manageclusterpermission)
- [`patchClusterLibrary`](#operation-clusterclient-patchclusterlibrary)
- [`queryReplicaIds`](#operation-clusterclient-queryreplicaids)
- [`restartCluster`](#operation-clusterclient-restartcluster)
- [`searchClusterLogs`](#operation-clusterclient-searchclusterlogs)
- [`startCluster`](#operation-clusterclient-startcluster)
- [`stopCluster`](#operation-clusterclient-stopcluster)
- [`summarizeMetricsData`](#operation-clusterclient-summarizemetricsdata)
- [`updateCluster`](#operation-clusterclient-updatecluster)

### <a id="operation-clusterclient-createcluster"></a>`createCluster`
**Description:** Creates a new cluster with the provided details.

**Request Interface:** `requests.CreateClusterRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `createClusterDetails` | `model.CreateDflComputeDetails| model.CreateSparkClusterDetails| model.CreateAiComputeDetails` | Details for the new cluster. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.CreateClusterResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `cluster` | `model.Cluster` | The returned model.Cluster instance. |

**Payload `Cluster` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | Cluster key. |
| `displayName` | `string` | Cluster name. |
| `description` | `string` | Cluster description. |
| `type` | `model.ClusterType` | ClusterType |
| `timeCreated` | `Date` | Date and time the cluster was created. |
| `timeUpdated` | `Date` | Date and time the cluster was updated. |
| `state` | `Cluster.State` | Common lifecycle states for resources in a compute cluster. ACCEPTED - The resource create request has been accepted. CREATING - The resource is being created and might not be usable until the entire metadata is defined. ACTIVE - The resource is valid and available for access. DELETING - The resource is being deleted, and might require a deep clean of any children. DELETED - The resource has been deleted, and isn't available. FAILED - The resource is in a failed state due to validation or other errors. STOPPING - The resource is being stopped. STOPPED - The resource has been stopped. UPDATING - The resource is being updated and might not be usable until all changes are commited. STARTING - The resource is being started. RESTARTING - The resource is being restarted. |
| `stateDetails` | `string` | A message that describes the current state of the workspace cluster in more detail. For example, can be used to provide actionable information for a resource in the Failed state. |
| `nodeType` | `string` | Cluster node type encodes the node shape and associated resources. |
| `createdBy` | `string` | OCID of the user who created this record. |
| `createdByName` | `string` | Name of the user who created this record. |
| `updatedBy` | `string` | OCID of the user who updated this record. |
| `updatedByName` | `string` | Name of the user who updated this record. |
| `stoppedBy` | `string` | OCID of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped. |
| `stoppedByName` | `string` | Name of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped. |
**Return:** [Back to Cluster (ClusterClient)](#client-clusterclient) • [Top](#top)


### <a id="operation-clusterclient-deletecluster"></a>`deleteCluster`
**Description:** Deletes a cluster from a workspace.

**Request Interface:** `requests.DeleteClusterRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `clusterKey` | `string` | Cluster key. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.DeleteClusterResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Cluster (ClusterClient)](#client-clusterclient) • [Top](#top)


### <a id="operation-clusterclient-downloadclusterlogs"></a>`downloadClusterLogs`
**Description:** Downloads logs within the specified cluster and time range. The logs can be filtered by severity (`logLevel`), type (`logContentTypeContains`), and other parameters such as execution context and thread identifiers.

**Request Interface:** `requests.DownloadClusterLogsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `clusterKey` | `string` | Cluster key. |
| `downloadClusterLogsDetails` | `model.DownloadClusterLogsDetails` | Request payload containing the parameters for filtering cluster logs. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |

**Response Interface:** `responses.DownloadClusterLogsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
| `datalakeClusterLogParUrl` | `string` | This string represents the PAR URL for the compute log file. The {@code datalake-cluster-log-par-url} should be used only after the {@code aidp-async-operation-key} status reaches the SUCCEEDED state. If accessed before the operation completes, the file may be incomplete. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Cluster (ClusterClient)](#client-clusterclient) • [Top](#top)


### <a id="operation-clusterclient-getcluster"></a>`getCluster`
**Description:** Returns detailed information about a cluster.

**Request Interface:** `requests.GetClusterRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `clusterKey` | `string` | Cluster key. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.GetClusterResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `cluster` | `model.Cluster` | The returned model.Cluster instance. |

**Payload `Cluster` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | Cluster key. |
| `displayName` | `string` | Cluster name. |
| `description` | `string` | Cluster description. |
| `type` | `model.ClusterType` | ClusterType |
| `timeCreated` | `Date` | Date and time the cluster was created. |
| `timeUpdated` | `Date` | Date and time the cluster was updated. |
| `state` | `Cluster.State` | Common lifecycle states for resources in a compute cluster. ACCEPTED - The resource create request has been accepted. CREATING - The resource is being created and might not be usable until the entire metadata is defined. ACTIVE - The resource is valid and available for access. DELETING - The resource is being deleted, and might require a deep clean of any children. DELETED - The resource has been deleted, and isn't available. FAILED - The resource is in a failed state due to validation or other errors. STOPPING - The resource is being stopped. STOPPED - The resource has been stopped. UPDATING - The resource is being updated and might not be usable until all changes are commited. STARTING - The resource is being started. RESTARTING - The resource is being restarted. |
| `stateDetails` | `string` | A message that describes the current state of the workspace cluster in more detail. For example, can be used to provide actionable information for a resource in the Failed state. |
| `nodeType` | `string` | Cluster node type encodes the node shape and associated resources. |
| `createdBy` | `string` | OCID of the user who created this record. |
| `createdByName` | `string` | Name of the user who created this record. |
| `updatedBy` | `string` | OCID of the user who updated this record. |
| `updatedByName` | `string` | Name of the user who updated this record. |
| `stoppedBy` | `string` | OCID of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped. |
| `stoppedByName` | `string` | Name of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped. |
**Return:** [Back to Cluster (ClusterClient)](#client-clusterclient) • [Top](#top)


### <a id="operation-clusterclient-getdefaultcluster"></a>`getDefaultCluster`
**Description:** Gets information about the master catalog default cluster.

**Request Interface:** `requests.GetDefaultClusterRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.GetDefaultClusterResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `defaultCluster` | `model.DefaultCluster` | The returned model.DefaultCluster instance. |

**Payload `DefaultCluster` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `workspaceKey` | `string` | The key of the AI Data Platform Workbench workspace where the default cluster is. |
| `autoTerminationMinutes` | `number` | Optional timeout value in minutes used to automatically stop idle compute clusters. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `jdbcEndpointUrl` | `string` | Spark JDBC URL. |
| `logId` | `string` | The OCID of the log where cluster logs are published and retrieved. This logId is always created within the logGroupId returned in the response payload. |
| `logGroupId` | `string` | The unique OCID that identifies a specific log group within OCI Logging. This log group is exclusively associated with the AI Data Platform Workbench instance and is created in the same compartment within the customer\u2019s tenancy as the AI Data Platform Workbench instance. |
**Return:** [Back to Cluster (ClusterClient)](#client-clusterclient) • [Top](#top)


### <a id="operation-clusterclient-listclusterlibraries"></a>`listClusterLibraries`
**Description:** Gets a list of libraries installed on a cluster.

**Request Interface:** `requests.ListClusterLibrariesRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `clusterKey` | `string` | Cluster key. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `displayName` | `string` | A filter to return only resources that match the given display name exactly. |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListClusterLibrariesRequest.SortBy` | The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ListClusterLibrariesResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `opcPrevPage` | `string` | For list pagination. When this header appears in the response, previous pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `opcTotalItems` | `number` | For list pagination. This header provides total number of items available. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `clusterLibraryCollection` | `model.ClusterLibraryCollection` | The returned model.ClusterLibraryCollection instance. |

**Payload `ClusterLibraryCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.ClusterLibrarySummary>` | List of cluster libraries. |
**Return:** [Back to Cluster (ClusterClient)](#client-clusterclient) • [Top](#top)


### <a id="operation-clusterclient-listclusterpermissions"></a>`listClusterPermissions`
**Description:** Return a list of permissions for a given cluster.

**Request Interface:** `requests.ListClusterPermissionsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `clusterKey` | `string` | Cluster key. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `displayName` | `string` | A filter to return only resources that match the given display name exactly. |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListClusterPermissionsRequest.SortBy` | The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ListClusterPermissionsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `clusterPermissionCollection` | `model.ClusterPermissionCollection` | The returned model.ClusterPermissionCollection instance. |

**Payload `ClusterPermissionCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.ClusterPermissionSummary>` | List of cluster permissions. |
**Return:** [Back to Cluster (ClusterClient)](#client-clusterclient) • [Top](#top)


### <a id="operation-clusterclient-listclusters"></a>`listClusters`
**Description:** Returns a list of all clusters in a given workspace.

**Request Interface:** `requests.ListClustersRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `state` | `string` | A filter to return only resources that match the given lifecycle state. The state value is case-insensitive. |
| `displayName` | `string` | A filter to return only resources that match the given display name exactly. |
| `displayNameContains` | `string` | A filter to return only resources that have a display name containing the text provided. |
| `type` | `string` | Cluster type. When the filter is not provided list shows all cluster types - USER and AI_COMPUTE else it shows only cluster of type chosen. Only clusters of type USER are attachable to a workspace notebook. |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListClustersRequest.SortBy` | The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ListClustersResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `clusterCollection` | `model.ClusterCollection` | The returned model.ClusterCollection instance. |

**Payload `ClusterCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.ClusterSummary>` | List of Clusters. |
**Return:** [Back to Cluster (ClusterClient)](#client-clusterclient) • [Top](#top)


### <a id="operation-clusterclient-manageclusterpermission"></a>`manageClusterPermission`
**Description:** Updates the permissions for a given cluster.

**Request Interface:** `requests.ManageClusterPermissionRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `clusterKey` | `string` | Cluster key. |
| `manageClusterPermissionDetails` | `model.ManageClusterPermissionDetails` | The information to be updated. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ManageClusterPermissionResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Cluster (ClusterClient)](#client-clusterclient) • [Top](#top)


### <a id="operation-clusterclient-patchclusterlibrary"></a>`patchClusterLibrary`
**Description:** Updates libraries of a cluster with the provided patches.

**Request Interface:** `requests.PatchClusterLibraryRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `clusterKey` | `string` | Cluster key. |
| `patchClusterLibraryDetails` | `model.PatchClusterLibraryDetails` | The information to be updated. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.PatchClusterLibraryResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `clusterLibraryCollection` | `model.ClusterLibraryCollection` | The returned model.ClusterLibraryCollection instance. |

**Payload `ClusterLibraryCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.ClusterLibrarySummary>` | List of cluster libraries. |
**Return:** [Back to Cluster (ClusterClient)](#client-clusterclient) • [Top](#top)


### <a id="operation-clusterclient-queryreplicaids"></a>`queryReplicaIds`
**Description:** Queries compute replica identifiers for a compute cluster in the given workspace. The response contains distinct replica identifiers derived from the Monitoring `agentNode` metric dimension.

**Request Interface:** `requests.QueryReplicaIdsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `clusterKey` | `string` | Cluster key. |
| `queryReplicaIdsDetails` | `model.QueryReplicaIdsDetails` | Request body containing replica query parameters. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.QueryReplicaIdsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `queryReplicaIdsResult` | `model.QueryReplicaIdsResult` | The returned model.QueryReplicaIdsResult instance. |

**Payload `QueryReplicaIdsResult` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `replicaIds` | `Array<string>` | Distinct compute replica identifiers derived from the Monitoring {@code agentNode} dimension. |
**Return:** [Back to Cluster (ClusterClient)](#client-clusterclient) • [Top](#top)


### <a id="operation-clusterclient-restartcluster"></a>`restartCluster`
**Description:** Restarts a running cluster.

**Request Interface:** `requests.RestartClusterRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `clusterKey` | `string` | Cluster key. |
| `restartClusterDetails` | `model.RestartClusterDetails` | Details for restarting the cluster. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.RestartClusterResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `cluster` | `model.Cluster` | The returned model.Cluster instance. |

**Payload `Cluster` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | Cluster key. |
| `displayName` | `string` | Cluster name. |
| `description` | `string` | Cluster description. |
| `type` | `model.ClusterType` | ClusterType |
| `timeCreated` | `Date` | Date and time the cluster was created. |
| `timeUpdated` | `Date` | Date and time the cluster was updated. |
| `state` | `Cluster.State` | Common lifecycle states for resources in a compute cluster. ACCEPTED - The resource create request has been accepted. CREATING - The resource is being created and might not be usable until the entire metadata is defined. ACTIVE - The resource is valid and available for access. DELETING - The resource is being deleted, and might require a deep clean of any children. DELETED - The resource has been deleted, and isn't available. FAILED - The resource is in a failed state due to validation or other errors. STOPPING - The resource is being stopped. STOPPED - The resource has been stopped. UPDATING - The resource is being updated and might not be usable until all changes are commited. STARTING - The resource is being started. RESTARTING - The resource is being restarted. |
| `stateDetails` | `string` | A message that describes the current state of the workspace cluster in more detail. For example, can be used to provide actionable information for a resource in the Failed state. |
| `nodeType` | `string` | Cluster node type encodes the node shape and associated resources. |
| `createdBy` | `string` | OCID of the user who created this record. |
| `createdByName` | `string` | Name of the user who created this record. |
| `updatedBy` | `string` | OCID of the user who updated this record. |
| `updatedByName` | `string` | Name of the user who updated this record. |
| `stoppedBy` | `string` | OCID of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped. |
| `stoppedByName` | `string` | Name of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped. |
**Return:** [Back to Cluster (ClusterClient)](#client-clusterclient) • [Top](#top)


### <a id="operation-clusterclient-searchclusterlogs"></a>`searchClusterLogs`
**Description:** Searches logs within the specified cluster and time range. Supports pagination and filtering.

**Request Interface:** `requests.SearchClusterLogsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `clusterKey` | `string` | Cluster key. |
| `searchClusterLogsDetails` | `model.SearchClusterLogsDetails` | Request body containing the search parameters for cluster logs. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |

**Response Interface:** `responses.SearchClusterLogsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `clusterLogCollection` | `model.ClusterLogCollection` | The returned model.ClusterLogCollection instance. |

**Payload `ClusterLogCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.ClusterLogsSummary>` | List of cluster logs. |
**Return:** [Back to Cluster (ClusterClient)](#client-clusterclient) • [Top](#top)


### <a id="operation-clusterclient-startcluster"></a>`startCluster`
**Description:** Starts a cluster that has halted operation.

**Request Interface:** `requests.StartClusterRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `clusterKey` | `string` | Cluster key. |
| `startClusterDetails` | `model.StartClusterDetails` | Details of the cluster being started. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.StartClusterResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `cluster` | `model.Cluster` | The returned model.Cluster instance. |

**Payload `Cluster` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | Cluster key. |
| `displayName` | `string` | Cluster name. |
| `description` | `string` | Cluster description. |
| `type` | `model.ClusterType` | ClusterType |
| `timeCreated` | `Date` | Date and time the cluster was created. |
| `timeUpdated` | `Date` | Date and time the cluster was updated. |
| `state` | `Cluster.State` | Common lifecycle states for resources in a compute cluster. ACCEPTED - The resource create request has been accepted. CREATING - The resource is being created and might not be usable until the entire metadata is defined. ACTIVE - The resource is valid and available for access. DELETING - The resource is being deleted, and might require a deep clean of any children. DELETED - The resource has been deleted, and isn't available. FAILED - The resource is in a failed state due to validation or other errors. STOPPING - The resource is being stopped. STOPPED - The resource has been stopped. UPDATING - The resource is being updated and might not be usable until all changes are commited. STARTING - The resource is being started. RESTARTING - The resource is being restarted. |
| `stateDetails` | `string` | A message that describes the current state of the workspace cluster in more detail. For example, can be used to provide actionable information for a resource in the Failed state. |
| `nodeType` | `string` | Cluster node type encodes the node shape and associated resources. |
| `createdBy` | `string` | OCID of the user who created this record. |
| `createdByName` | `string` | Name of the user who created this record. |
| `updatedBy` | `string` | OCID of the user who updated this record. |
| `updatedByName` | `string` | Name of the user who updated this record. |
| `stoppedBy` | `string` | OCID of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped. |
| `stoppedByName` | `string` | Name of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped. |
**Return:** [Back to Cluster (ClusterClient)](#client-clusterclient) • [Top](#top)


### <a id="operation-clusterclient-stopcluster"></a>`stopCluster`
**Description:** Stops an active cluster.

**Request Interface:** `requests.StopClusterRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `clusterKey` | `string` | Cluster key. |
| `stopClusterDetails` | `model.StopClusterDetails` | Details for stopping the cluster. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.StopClusterResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `cluster` | `model.Cluster` | The returned model.Cluster instance. |

**Payload `Cluster` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | Cluster key. |
| `displayName` | `string` | Cluster name. |
| `description` | `string` | Cluster description. |
| `type` | `model.ClusterType` | ClusterType |
| `timeCreated` | `Date` | Date and time the cluster was created. |
| `timeUpdated` | `Date` | Date and time the cluster was updated. |
| `state` | `Cluster.State` | Common lifecycle states for resources in a compute cluster. ACCEPTED - The resource create request has been accepted. CREATING - The resource is being created and might not be usable until the entire metadata is defined. ACTIVE - The resource is valid and available for access. DELETING - The resource is being deleted, and might require a deep clean of any children. DELETED - The resource has been deleted, and isn't available. FAILED - The resource is in a failed state due to validation or other errors. STOPPING - The resource is being stopped. STOPPED - The resource has been stopped. UPDATING - The resource is being updated and might not be usable until all changes are commited. STARTING - The resource is being started. RESTARTING - The resource is being restarted. |
| `stateDetails` | `string` | A message that describes the current state of the workspace cluster in more detail. For example, can be used to provide actionable information for a resource in the Failed state. |
| `nodeType` | `string` | Cluster node type encodes the node shape and associated resources. |
| `createdBy` | `string` | OCID of the user who created this record. |
| `createdByName` | `string` | Name of the user who created this record. |
| `updatedBy` | `string` | OCID of the user who updated this record. |
| `updatedByName` | `string` | Name of the user who updated this record. |
| `stoppedBy` | `string` | OCID of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped. |
| `stoppedByName` | `string` | Name of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped. |
**Return:** [Back to Cluster (ClusterClient)](#client-clusterclient) • [Top](#top)


### <a id="operation-clusterclient-summarizemetricsdata"></a>`summarizeMetricsData`
**Description:** Provides summarized compute metrics for a compute cluster in the given workspace. This API aggregates metric data points based on a specified namespace, metric name, and aggregation type. The response contains computed metric summaries.

**Request Interface:** `requests.SummarizeMetricsDataRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `clusterKey` | `string` | Cluster key. |
| `summarizeMetricsDataDetails` | `model.SummarizeMetricsDataDetails` | Request body containing metric parameters. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |

**Response Interface:** `responses.SummarizeMetricsDataResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | The ETag for optimistic concurrency control. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `summarizeMetricsResponse` | `model.SummarizeMetricsResponse` | The returned model.SummarizeMetricsResponse instance. |

**Payload `SummarizeMetricsResponse` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `results` | `Array<model.MetricsSummary>` | List of computed metric summary results. |
**Return:** [Back to Cluster (ClusterClient)](#client-clusterclient) • [Top](#top)


### <a id="operation-clusterclient-updatecluster"></a>`updateCluster`
**Description:** Update the details of a given cluster.

**Request Interface:** `requests.UpdateClusterRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `clusterKey` | `string` | Cluster key. |
| `updateClusterDetails` | `model.UpdateAiComputeDetails| model.UpdateSparkClusterDetails` | The information to be updated. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.UpdateClusterResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `cluster` | `model.Cluster` | The returned model.Cluster instance. |

**Payload `Cluster` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | Cluster key. |
| `displayName` | `string` | Cluster name. |
| `description` | `string` | Cluster description. |
| `type` | `model.ClusterType` | ClusterType |
| `timeCreated` | `Date` | Date and time the cluster was created. |
| `timeUpdated` | `Date` | Date and time the cluster was updated. |
| `state` | `Cluster.State` | Common lifecycle states for resources in a compute cluster. ACCEPTED - The resource create request has been accepted. CREATING - The resource is being created and might not be usable until the entire metadata is defined. ACTIVE - The resource is valid and available for access. DELETING - The resource is being deleted, and might require a deep clean of any children. DELETED - The resource has been deleted, and isn't available. FAILED - The resource is in a failed state due to validation or other errors. STOPPING - The resource is being stopped. STOPPED - The resource has been stopped. UPDATING - The resource is being updated and might not be usable until all changes are commited. STARTING - The resource is being started. RESTARTING - The resource is being restarted. |
| `stateDetails` | `string` | A message that describes the current state of the workspace cluster in more detail. For example, can be used to provide actionable information for a resource in the Failed state. |
| `nodeType` | `string` | Cluster node type encodes the node shape and associated resources. |
| `createdBy` | `string` | OCID of the user who created this record. |
| `createdByName` | `string` | Name of the user who created this record. |
| `updatedBy` | `string` | OCID of the user who updated this record. |
| `updatedByName` | `string` | Name of the user who updated this record. |
| `stoppedBy` | `string` | OCID of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped. |
| `stoppedByName` | `string` | Name of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped. |
**Return:** [Back to Cluster (ClusterClient)](#client-clusterclient) • [Top](#top)


## <a id="client-credentialsclient"></a>CredentialsClient
**Operations:**
- [`createCredential`](#operation-credentialsclient-createcredential)
- [`deleteCredential`](#operation-credentialsclient-deletecredential)
- [`getCredential`](#operation-credentialsclient-getcredential)
- [`listCredentials`](#operation-credentialsclient-listcredentials)
- [`updateCredential`](#operation-credentialsclient-updatecredential)

### <a id="operation-credentialsclient-createcredential"></a>`createCredential`
**Description:** Creates a new credential object with the provided details. The operation completes synchronously; callers can invoke list or get to retrieve the resource payload.

**Request Interface:** `requests.CreateCredentialRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `createDataLakeCredentialDetails` | `model.CreateDataLakeCredentialDetails` | Details for the new credential object. When the internal flag is enabled, callers must supply a {@code namespace} value of {@code default} or {@code user_settings} in the payload. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.CreateCredentialResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Credentials (CredentialsClient)](#client-credentialsclient) • [Top](#top)


### <a id="operation-credentialsclient-deletecredential"></a>`deleteCredential`
**Description:** Deletes a credential object. The operation completes synchronously without a response body.

**Request Interface:** `requests.DeleteCredentialRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `credentialKey` | `string` | The unique identifier of an credential |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.DeleteCredentialResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Credentials (CredentialsClient)](#client-credentialsclient) • [Top](#top)


### <a id="operation-credentialsclient-getcredential"></a>`getCredential`
**Description:** Gets detailed information about credential with a given credential key.

**Request Interface:** `requests.GetCredentialRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `credentialKey` | `string` | The unique identifier of an credential |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.GetCredentialResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `credential` | `model.Credential` | The returned model.Credential instance. |

**Payload `Credential` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | The unique identifier for the credential object. |
| `displayName` | `string` | A user-friendly name for the credential object. This value does not have to be unique and can be changed. Must start with a letter and contain only letters, numbers, or underscores. Avoid entering confidential information. |
| `type` | `model.CredentialType` | The type of credential stored. Allowed values are defined in CredentialType. |
| `credentialDescription` | `string` | A brief summary of the credential object and its purpose. |
| `lifecycleState` | `model.CredentialLifecycleState` | The current state of the credential object. Allowed values are defined in CredentialLifecycleState. |
| `lifecycleStateDetails` | `string` | Additional details or reasons regarding the current lifecycle state. Often used to provide actionable information (e.g., for resources in a Failed state). |
| `timeCreated` | `Date` | The date and time when the credential object was created, in RFC 3339 timestamp format. |
| `timeUpdated` | `Date` | The date and time when the credential object was most recently updated, in RFC 3339 timestamp format. |
| `createdBy` | `string` | The unique identifier of the user who created the credential object. |
| `updatedBy` | `string` | The unique identifier of the user who last updated the credential object. |
**Return:** [Back to Credentials (CredentialsClient)](#client-credentialsclient) • [Top](#top)


### <a id="operation-credentialsclient-listcredentials"></a>`listCredentials`
**Description:** Returns a list of credentials.

**Request Interface:** `requests.ListCredentialsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `displayName` | `string` | A filter to return only resources that match the given display name exactly. |
| `displayNameContains` | `string` | A filter to return only resources whose displayName contains the provided value (case-insensitive). |
| `lifecycleState` | `string` | A filter to return only resources whose lifecycleState matches the provided value. |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListCredentialsRequest.SortBy` | The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending. |
| `credentialType` | `model.CredentialType` | The type of the Credential |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.ListCredentialsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `credentialCollection` | `model.CredentialCollection` | The returned model.CredentialCollection instance. |

**Payload `CredentialCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.CredentialSummary>` | List of credential summaries. |
**Return:** [Back to Credentials (CredentialsClient)](#client-credentialsclient) • [Top](#top)


### <a id="operation-credentialsclient-updatecredential"></a>`updateCredential`
**Description:** Updates a credential object. The operation completes synchronously; callers can invoke get to confirm the latest state.

**Request Interface:** `requests.UpdateCredentialRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `credentialKey` | `string` | The unique identifier of an credential |
| `updateDataLakeCredentialDetails` | `model.UpdateDataLakeCredentialDetails` | The information to be updated. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.UpdateCredentialResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Credentials (CredentialsClient)](#client-credentialsclient) • [Top](#top)


## <a id="client-deltashareclient"></a>DeltaShareClient
**Operations:**
- [`createRecipient`](#operation-deltashareclient-createrecipient)
- [`createShare`](#operation-deltashareclient-createshare)
- [`deleteRecipient`](#operation-deltashareclient-deleterecipient)
- [`deleteShare`](#operation-deltashareclient-deleteshare)
- [`getRecipient`](#operation-deltashareclient-getrecipient)
- [`getShare`](#operation-deltashareclient-getshare)
- [`listRecipientPermissions`](#operation-deltashareclient-listrecipientpermissions)
- [`listRecipientShares`](#operation-deltashareclient-listrecipientshares)
- [`listRecipients`](#operation-deltashareclient-listrecipients)
- [`listShareDataAssets`](#operation-deltashareclient-listsharedataassets)
- [`listSharePermissions`](#operation-deltashareclient-listsharepermissions)
- [`listShareRecipients`](#operation-deltashareclient-listsharerecipients)
- [`listShares`](#operation-deltashareclient-listshares)
- [`manageRecipientPermission`](#operation-deltashareclient-managerecipientpermission)
- [`manageShareAccess`](#operation-deltashareclient-manageshareaccess)
- [`manageShareDataAsset`](#operation-deltashareclient-managesharedataasset)
- [`manageSharePermission`](#operation-deltashareclient-managesharepermission)
- [`updateRecipient`](#operation-deltashareclient-updaterecipient)
- [`updateShare`](#operation-deltashareclient-updateshare)

### <a id="operation-deltashareclient-createrecipient"></a>`createRecipient`
**Description:** Creates a recipient for a Delta Share protocol.

**Request Interface:** `requests.CreateRecipientRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `createRecipientDetails` | `model.CreateRecipientDetails` | Details for the new recipient for Delta Share protocol in AI Data Platform Workbench. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.CreateRecipientResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `recipient` | `model.Recipient` | The returned model.Recipient instance. |

**Payload `Recipient` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | Unique identifier for this recipient in AI Data Platform Workbench instance. |
| `displayName` | `string` | A user-friendly name. Has to be unique within the AI Data Platform Workbench instance. |
| `description` | `string` | Short description of the Recipient |
| `timeCreated` | `Date` | The date and time the Delta Share recipient was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z} |
| `timeUpdated` | `Date` | The date and time the Delta Share recipient was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z} |
| `shareCount` | `number` | The number of shares this recipient has access on. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `createdBy` | `string` | The ID of the user who created the recipient. |
| `updatedBy` | `string` | The ID of the user who last updated the recipient. |
| `properties` | `{ [key: string]: string` | Key-value pair representing a defined tag key and value. Example: {@code { \"CostCenter\": \"42\" }} |
| `lifecycleState` | `model.RecipientLifecycleState` | The state of the recipient. |
| `lifecycleStateDetails` | `string` | A message describing the current state in more detail. |
**Return:** [Back to Delta Share (DeltaShareClient)](#client-deltashareclient) • [Top](#top)


### <a id="operation-deltashareclient-createshare"></a>`createShare`
**Description:** Creates a Delta Share protocol.

**Request Interface:** `requests.CreateShareRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `createShareDetails` | `model.CreateShareDetails` | Details for the new share for Delta Share protocol in AI Data Platform Workbench. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.CreateShareResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `share` | `model.Share` | The returned model.Share instance. |

**Payload `Share` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | Unique identifier for this share in AI Data Platform Workbench instance. |
| `displayName` | `string` | A user-friendly name. Has to be unique within the AI Data Platform Workbench instance. |
| `description` | `string` | A description associated with this share. |
| `timeCreated` | `Date` | The date and time the Delta Share was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z} |
| `timeUpdated` | `Date` | The date and time the Delta Share was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z} |
| `createdBy` | `string` | The ID of the user who created the share. |
| `updatedBy` | `string` | The ID of the user who last updated the share. |
| `recipientCount` | `number` | The number of recipients who have access on this share. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `assetCount` | `number` | The number of assets in this share. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `lifecycleState` | `model.ShareLifecycleState` | The state of the Share. |
| `lifecycleStateDetails` | `string` | A message describing the current state in more detail. |
**Return:** [Back to Delta Share (DeltaShareClient)](#client-deltashareclient) • [Top](#top)


### <a id="operation-deltashareclient-deleterecipient"></a>`deleteRecipient`
**Description:** Deletes a Delta Share recipient.

**Request Interface:** `requests.DeleteRecipientRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `recipientKey` | `string` | The key of the recipient resource |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.DeleteRecipientResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Delta Share (DeltaShareClient)](#client-deltashareclient) • [Top](#top)


### <a id="operation-deltashareclient-deleteshare"></a>`deleteShare`
**Description:** Deletes a Delta Share.

**Request Interface:** `requests.DeleteShareRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `shareKey` | `string` | The unique key of the Share. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.DeleteShareResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Delta Share (DeltaShareClient)](#client-deltashareclient) • [Top](#top)


### <a id="operation-deltashareclient-getrecipient"></a>`getRecipient`
**Description:** Gets detailed information about a Delta Share recipient.

**Request Interface:** `requests.GetRecipientRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `recipientKey` | `string` | The key of the recipient resource |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.GetRecipientResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `recipient` | `model.Recipient` | The returned model.Recipient instance. |

**Payload `Recipient` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | Unique identifier for this recipient in AI Data Platform Workbench instance. |
| `displayName` | `string` | A user-friendly name. Has to be unique within the AI Data Platform Workbench instance. |
| `description` | `string` | Short description of the Recipient |
| `timeCreated` | `Date` | The date and time the Delta Share recipient was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z} |
| `timeUpdated` | `Date` | The date and time the Delta Share recipient was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z} |
| `shareCount` | `number` | The number of shares this recipient has access on. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `createdBy` | `string` | The ID of the user who created the recipient. |
| `updatedBy` | `string` | The ID of the user who last updated the recipient. |
| `properties` | `{ [key: string]: string` | Key-value pair representing a defined tag key and value. Example: {@code { \"CostCenter\": \"42\" }} |
| `lifecycleState` | `model.RecipientLifecycleState` | The state of the recipient. |
| `lifecycleStateDetails` | `string` | A message describing the current state in more detail. |
**Return:** [Back to Delta Share (DeltaShareClient)](#client-deltashareclient) • [Top](#top)


### <a id="operation-deltashareclient-getshare"></a>`getShare`
**Description:** Gets detailed information about a Delta Share.

**Request Interface:** `requests.GetShareRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `shareKey` | `string` | The unique key of the Share. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.GetShareResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `share` | `model.Share` | The returned model.Share instance. |

**Payload `Share` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | Unique identifier for this share in AI Data Platform Workbench instance. |
| `displayName` | `string` | A user-friendly name. Has to be unique within the AI Data Platform Workbench instance. |
| `description` | `string` | A description associated with this share. |
| `timeCreated` | `Date` | The date and time the Delta Share was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z} |
| `timeUpdated` | `Date` | The date and time the Delta Share was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z} |
| `createdBy` | `string` | The ID of the user who created the share. |
| `updatedBy` | `string` | The ID of the user who last updated the share. |
| `recipientCount` | `number` | The number of recipients who have access on this share. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `assetCount` | `number` | The number of assets in this share. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `lifecycleState` | `model.ShareLifecycleState` | The state of the Share. |
| `lifecycleStateDetails` | `string` | A message describing the current state in more detail. |
**Return:** [Back to Delta Share (DeltaShareClient)](#client-deltashareclient) • [Top](#top)


### <a id="operation-deltashareclient-listrecipientpermissions"></a>`listRecipientPermissions`
**Description:** Gets a detailed list of Delta Share recipient permissions.

**Request Interface:** `requests.ListRecipientPermissionsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `recipientKey` | `string` | The key of the recipient resource |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListRecipientPermissionsRequest.SortBy` | The field to sort by. Default order for {@code grantee} is ascending. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.ListRecipientPermissionsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `recipientPermissionCollection` | `model.RecipientPermissionCollection` | The returned model.RecipientPermissionCollection instance. |

**Payload `RecipientPermissionCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.RecipientPermissionSummary>` | List of recipient permissions. |
**Return:** [Back to Delta Share (DeltaShareClient)](#client-deltashareclient) • [Top](#top)


### <a id="operation-deltashareclient-listrecipientshares"></a>`listRecipientShares`
**Description:** Returns a list of Delta Shares that the specified recipient has been granted access to.

**Request Interface:** `requests.ListRecipientSharesRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `recipientKey` | `string` | The key of the recipient resource |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `displayName` | `string` | A filter to return only resources that match the given display name exactly. |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListRecipientSharesRequest.SortBy` | The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.ListRecipientSharesResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `shareCollection` | `model.ShareCollection` | The returned model.ShareCollection instance. |

**Payload `ShareCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.ShareSummary>` | List of Shares. |
**Return:** [Back to Delta Share (DeltaShareClient)](#client-deltashareclient) • [Top](#top)


### <a id="operation-deltashareclient-listrecipients"></a>`listRecipients`
**Description:** Gets a list of Delta Share recipients.

**Request Interface:** `requests.ListRecipientsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `displayName` | `string` | A filter to return only resources that match the given display name exactly. |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListRecipientsRequest.SortBy` | The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ListRecipientsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `recipientCollection` | `model.RecipientCollection` | The returned model.RecipientCollection instance. |

**Payload `RecipientCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.RecipientSummary>` | List of recipients. |
**Return:** [Back to Delta Share (DeltaShareClient)](#client-deltashareclient) • [Top](#top)


### <a id="operation-deltashareclient-listsharedataassets"></a>`listShareDataAssets`
**Description:** Gets a list of Delta Share assets.

**Request Interface:** `requests.ListShareDataAssetsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `shareKey` | `string` | The unique key of the Share. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `displayName` | `string` | A filter to return only resources that match the given display name exactly. |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListShareDataAssetsRequest.SortBy` | The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.ListShareDataAssetsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `shareDataAssetCollection` | `model.ShareDataAssetCollection` | The returned model.ShareDataAssetCollection instance. |

**Payload `ShareDataAssetCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.ShareDataAssetSummary>` | List of Shares assets. |
**Return:** [Back to Delta Share (DeltaShareClient)](#client-deltashareclient) • [Top](#top)


### <a id="operation-deltashareclient-listsharepermissions"></a>`listSharePermissions`
**Description:** Returns a list of Delta Shares that the specified recipient has been granted access to.

**Request Interface:** `requests.ListSharePermissionsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `shareKey` | `string` | The unique key of the Share. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListSharePermissionsRequest.SortBy` | The field to sort by. You can provide only one sort order. Default order for {@code grantee} is ascending. Default order for {@code granteeType} is ascending. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.ListSharePermissionsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sharePermissionCollection` | `model.SharePermissionCollection` | The returned model.SharePermissionCollection instance. |

**Payload `SharePermissionCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.SharePermissionSummary>` | List of share permissions. |
**Return:** [Back to Delta Share (DeltaShareClient)](#client-deltashareclient) • [Top](#top)


### <a id="operation-deltashareclient-listsharerecipients"></a>`listShareRecipients`
**Description:** Gets a list of recipients that have been given access on the specified Delta Share.

**Request Interface:** `requests.ListShareRecipientsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `shareKey` | `string` | The unique key of the Share. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `displayName` | `string` | A filter to return only resources that match the given display name exactly. |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListShareRecipientsRequest.SortBy` | The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.ListShareRecipientsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `recipientCollection` | `model.RecipientCollection` | The returned model.RecipientCollection instance. |

**Payload `RecipientCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.RecipientSummary>` | List of recipients. |
**Return:** [Back to Delta Share (DeltaShareClient)](#client-deltashareclient) • [Top](#top)


### <a id="operation-deltashareclient-listshares"></a>`listShares`
**Description:** Gets a list of Delta Shares.

**Request Interface:** `requests.ListSharesRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `displayName` | `string` | A filter to return only resources that match the given display name exactly. |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListSharesRequest.SortBy` | The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ListSharesResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `shareCollection` | `model.ShareCollection` | The returned model.ShareCollection instance. |

**Payload `ShareCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.ShareSummary>` | List of Shares. |
**Return:** [Back to Delta Share (DeltaShareClient)](#client-deltashareclient) • [Top](#top)


### <a id="operation-deltashareclient-managerecipientpermission"></a>`manageRecipientPermission`
**Description:** Updates the permissions of a Delta Share recipient.

**Request Interface:** `requests.ManageRecipientPermissionRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `recipientKey` | `string` | The key of the recipient resource |
| `manageRecipientPermissionDetails` | `model.ManageRecipientPermissionDetails` | The information to be updated. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.ManageRecipientPermissionResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Delta Share (DeltaShareClient)](#client-deltashareclient) • [Top](#top)


### <a id="operation-deltashareclient-manageshareaccess"></a>`manageShareAccess`
**Description:** Updates consumer-side access on a share for a recipient. A provider user can grant or revoke access on a particular share for a given recipient.

**Request Interface:** `requests.ManageShareAccessRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `shareKey` | `string` | The unique key of the Share. |
| `manageShareAccessDetails` | `model.ManageShareAccessDetails` | The information to be updated. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.ManageShareAccessResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Delta Share (DeltaShareClient)](#client-deltashareclient) • [Top](#top)


### <a id="operation-deltashareclient-managesharedataasset"></a>`manageShareDataAsset`
**Description:** Updates data assets on a Delta Share with the provided information.

**Request Interface:** `requests.ManageShareDataAssetRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `shareKey` | `string` | The unique key of the Share. |
| `manageShareDataAssetDetails` | `model.ManageShareDataAssetDetails` | The Delta Share data asset information to be updated. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.ManageShareDataAssetResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Delta Share (DeltaShareClient)](#client-deltashareclient) • [Top](#top)


### <a id="operation-deltashareclient-managesharepermission"></a>`manageSharePermission`
**Description:** Updates permissions on a Delta Share.

**Request Interface:** `requests.ManageSharePermissionRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `shareKey` | `string` | The unique key of the Share. |
| `manageSharePermissionDetails` | `model.ManageSharePermissionDetails` | The information to be updated. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.ManageSharePermissionResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Delta Share (DeltaShareClient)](#client-deltashareclient) • [Top](#top)


### <a id="operation-deltashareclient-updaterecipient"></a>`updateRecipient`
**Description:** Updates the metadata of a Delta Share recipient.

**Request Interface:** `requests.UpdateRecipientRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `recipientKey` | `string` | The key of the recipient resource |
| `updateRecipientDetails` | `model.UpdateRecipientDetails` | The information to be updated for a recipient. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.UpdateRecipientResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Delta Share (DeltaShareClient)](#client-deltashareclient) • [Top](#top)


### <a id="operation-deltashareclient-updateshare"></a>`updateShare`
**Description:** Update a Delta Share with the provided metadata.

**Request Interface:** `requests.UpdateShareRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `shareKey` | `string` | The unique key of the Share. |
| `updateShareDetails` | `model.UpdateShareDetails` | The information to be updated. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.UpdateShareResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Delta Share (DeltaShareClient)](#client-deltashareclient) • [Top](#top)


## <a id="client-gitclient"></a>GitClient
**Operations:**
- [`checkoutBranch`](#operation-gitclient-checkoutbranch)
- [`commitPushGitRepository`](#operation-gitclient-commitpushgitrepository)
- [`createGitBranch`](#operation-gitclient-creategitbranch)
- [`getGitDiffDetail`](#operation-gitclient-getgitdiffdetail)
- [`getGitOperationState`](#operation-gitclient-getgitoperationstate)
- [`getGitRepository`](#operation-gitclient-getgitrepository)
- [`listGitBranches`](#operation-gitclient-listgitbranches)
- [`listGitDiffs`](#operation-gitclient-listgitdiffs)
- [`mergeGitRepository`](#operation-gitclient-mergegitrepository)
- [`pullGitRepository`](#operation-gitclient-pullgitrepository)
- [`rebaseGitRepository`](#operation-gitclient-rebasegitrepository)
- [`resetGitFolderState`](#operation-gitclient-resetgitfolderstate)
- [`resetGitRepository`](#operation-gitclient-resetgitrepository)
- [`resolveGitConflicts`](#operation-gitclient-resolvegitconflicts)
- [`updateGitRepository`](#operation-gitclient-updategitrepository)

### <a id="operation-gitclient-checkoutbranch"></a>`checkoutBranch`
**Description:** (Preview) Checks out a remote branch into the specified workspace folder, ensuring the worktree tracks the requested branch HEAD.

**Request Interface:** `requests.CheckoutBranchRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `gitRepositoryKey` | `string` | The Git repository key. |
| `checkoutBranchDetails` | `model.CheckoutBranchDetails` | Details for the new branch. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |

**Response Interface:** `responses.CheckoutBranchResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
| `gitBranch` | `model.GitBranch` | The returned model.GitBranch instance. |

**Payload `GitBranch` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `branchName` | `string` | The name of the Git branch. |
| `gitUrl` | `string` | The Git repository URL corresponding to the branch. |
| `errorMessage` | `string` | Git error message. |
| `stdOut` | `string` | Git STDOUT message. |
| `stdErr` | `string` | Git STDERR message. |
| `gitExitCode` | `number` | Git exit status. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
**Return:** [Back to Git (GitClient)](#client-gitclient) • [Top](#top)


### <a id="operation-gitclient-commitpushgitrepository"></a>`commitPushGitRepository`
**Description:** (Preview) Stages selected workspace updates, creates a commit, and pushes it upstream so automation can sync with Git providers.

**Request Interface:** `requests.CommitPushGitRepositoryRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `gitRepositoryKey` | `string` | The Git repository key. |
| `commitPushDetails` | `model.CommitPushDetails` | Commit details. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |

**Response Interface:** `responses.CommitPushGitRepositoryResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
**Return:** [Back to Git (GitClient)](#client-gitclient) • [Top](#top)


### <a id="operation-gitclient-creategitbranch"></a>`createGitBranch`
**Description:** (Preview) Creates a new branch in the connected repo so teams can stage changes in isolated workspaces.

**Request Interface:** `requests.CreateGitBranchRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `gitRepositoryKey` | `string` | The Git repository key. |
| `createGitBranchDetails` | `model.CreateGitBranchDetails` | Details for the new Workspace Object. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.CreateGitBranchResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
| `createGitBranch` | `model.CreateGitBranch` | The returned model.CreateGitBranch instance. |

**Payload `CreateGitBranch` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `gitBranchName` | `string` | Git branch name that is cloned. |
| `gitUrl` | `string` | The Git repository URL corresponding to the branch. |
| `errorMessage` | `string` | Git error message. |
| `stdOut` | `string` | Git STDOUT message. |
| `stdErr` | `string` | Git STDERR message. |
| `gitExitCode` | `number` | Git exit status. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `gitFolderPath` | `string` | The path of the current Git folder which has to be created for the new branch. |
**Return:** [Back to Git (GitClient)](#client-gitclient) • [Top](#top)


### <a id="operation-gitclient-getgitdiffdetail"></a>`getGitDiffDetail`
**Description:** (Preview) Returns a unified diff patch for a specific file so editors and review panes can render inline changes.

**Request Interface:** `requests.GetGitDiffDetailRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `gitRepositoryKey` | `string` | The Git repository key. |
| `gitFolderPath` | `string` | The Git folder path. |
| `branchName` | `string` | Expected branch name for the folder context. |
| `gitFilePath` | `string` | File path relative to repository root. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `contextLines` | `number` | Number of context lines to include in the diff. |
| `maxPatchBytes` | `number` | Maximum number of bytes of diff output to return. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.GetGitDiffDetailResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `gitDiffDetail` | `model.GitDiffDetail` | The returned model.GitDiffDetail instance. |

**Payload `GitDiffDetail` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `gitFilePath` | `string` | File path relative to repository root. |
| `isConflict` | `boolean` | Indicates whether the file is currently in a conflicted state. |
| `isBinary` | `boolean` | Indicates whether the file is binary. |
| `patch` | `string` | Unified diff patch text. |
| `isTruncated` | `boolean` | Indicates whether the diff output was truncated. |
| `truncatedReason` | `GitDiffDetail.TruncatedReason` | Indicates the reason for the truncated diff to be returned. |
**Return:** [Back to Git (GitClient)](#client-gitclient) • [Top](#top)


### <a id="operation-gitclient-getgitoperationstate"></a>`getGitOperationState`
**Description:** (Preview) Returns the current Git worktree status—including in-progress operations or detached HEAD indicators—for the workspace folder.

**Request Interface:** `requests.GetGitOperationStateRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `gitRepositoryKey` | `string` | The Git repository key. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `operationName` | `string` | Optional operation the caller intends to perform (for example PULL, PUSH, RESET, CHECKOUT). |
| `branchName` | `string` | Expected branch name for the folder context. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.GetGitOperationStateResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `gitOperationState` | `model.GitOperationState` | The returned model.GitOperationState instance. |

**Payload `GitOperationState` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `gitFolderPath` | `string` | Folder path used to locate the Git worktree. |
| `state` | `GitOperationState.State` | Current Git operation state detected. |
| `isBlocking` | `boolean` | Whether the detected state blocks typical write operations. |
| `isAllowed` | `boolean` | Whether the requested operation is allowed in the current state. If operationName is not provided, this indicates if the repository is in a generally safe state. |
| `message` | `string` | Human-readable hint for UI display. |
| `currentBranch` | `string` | Current branch name. Empty if detached HEAD. |
| `headCommitId` | `string` | Full commit ID of HEAD. |
| `isDetached` | `boolean` | Whether HEAD is detached. |
| `haveConflicts` | `boolean` | Indicates if unmerged/conflicted files exist. This does not include file names. |
| `timeChecked` | `Date` | Time when the state was computed. |
**Return:** [Back to Git (GitClient)](#client-gitclient) • [Top](#top)


### <a id="operation-gitclient-getgitrepository"></a>`getGitRepository`
**Description:** (Preview) Returns repository metadata, credential references, and workspace linkage for a specific AI Data Platform Git repository.

**Request Interface:** `requests.GetGitRepositoryRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `gitRepositoryKey` | `string` | The Git repository key. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `shouldIncludeCredentialKey` | `boolean` | A flag to include credential key in response. If 'true', credential key will be returned in response. Default 'false'. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.GetGitRepositoryResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `gitRepository` | `model.GitRepository` | The returned model.GitRepository instance. |

**Payload `GitRepository` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | Unique key associated with repository. |
| `workspaceKey` | `string` | The workspaceKey associated with the Git repository. |
| `branchName` | `string` | The name of the Git branch. |
| `gitUrl` | `string` | The Git repository url corresponding to the branch. |
| `gitFolderPath` | `string` | The path of the current Git folder which has to be created for the new branch. |
| `credentialKey` | `string` | The credential setting key |
**Return:** [Back to Git (GitClient)](#client-gitclient) • [Top](#top)


### <a id="operation-gitclient-listgitbranches"></a>`listGitBranches`
**Description:** (Preview) Returns branch summaries with optional display-name filters and pagination, so UIs can show branch pickers and search results.

**Request Interface:** `requests.ListGitBranchesRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `gitRepositoryKey` | `string` | The Git repository key. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `displayName` | `string` | A filter to return only resources that match the given display name exactly. |
| `displayNameContains` | `string` | A filter to return only resources that have a display name containing the text provided. |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListGitBranchesRequest.SortBy` | The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ListGitBranchesResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `opcTotalItems` | `number` | For list pagination. This header provides total number of items available. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `gitBranchCollection` | `model.GitBranchCollection` | The returned model.GitBranchCollection instance. |

**Payload `GitBranchCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.GitBranchSummary>` | List of Git branches. |
**Return:** [Back to Git (GitClient)](#client-gitclient) • [Top](#top)


### <a id="operation-gitclient-listgitdiffs"></a>`listGitDiffs`
**Description:** (Preview) Returns file-level diff summaries for the workspace branch, enabling UI views of changed files or conflicts without heavy payloads.

**Request Interface:** `requests.ListGitDiffsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `gitRepositoryKey` | `string` | The Git repository key. |
| `gitFolderPath` | `string` | The Git folder path. |
| `branchName` | `string` | Expected branch name for the folder context. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `compareTo` | `ListGitDiffsRequest.CompareTo` | Determines which reference is used for computing diffs. |
| `filter` | `ListGitDiffsRequest.Filter` | Filter which files are returned. |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListGitDiffsRequest.SortBy` | The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending. |
| `displayName` | `string` | A filter to return only resources that match the given display name exactly. |

**Response Interface:** `responses.ListGitDiffsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `opcTotalItems` | `number` | For list pagination. This header provides total number of items available. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `gitDiffSummaryCollection` | `model.GitDiffSummaryCollection` | The returned model.GitDiffSummaryCollection instance. |

**Payload `GitDiffSummaryCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.GitDiffSummary>` | List of Git diff summaries. |
**Return:** [Back to Git (GitClient)](#client-gitclient) • [Top](#top)


### <a id="operation-gitclient-mergegitrepository"></a>`mergeGitRepository`
**Description:** (Preview) Applies the requested branch or commit onto the workspace branch to preview integration changes before pushing.

**Request Interface:** `requests.MergeGitRepositoryRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `gitRepositoryKey` | `string` | The Git repository key. |
| `gitMergeDetails` | `model.GitMergeDetails` | Folder/branch details to merge. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.MergeGitRepositoryResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
**Return:** [Back to Git (GitClient)](#client-gitclient) • [Top](#top)


### <a id="operation-gitclient-pullgitrepository"></a>`pullGitRepository`
**Description:** (Preview) Performs a Git pull for the workspace branch so developers can sync local files with the latest upstream commits.

**Request Interface:** `requests.PullGitRepositoryRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `gitRepositoryKey` | `string` | The Git repository key. |
| `gitPullDetails` | `model.GitPullDetails` | Folder/branch details to pull. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.PullGitRepositoryResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
**Return:** [Back to Git (GitClient)](#client-gitclient) • [Top](#top)


### <a id="operation-gitclient-rebasegitrepository"></a>`rebaseGitRepository`
**Description:** (Preview) Rebases the workspace branch on top of another commit or branch to linearize history and resolve drift.

**Request Interface:** `requests.RebaseGitRepositoryRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `gitRepositoryKey` | `string` | The Git repository key. |
| `gitRebaseDetails` | `model.GitRebaseDetails` | Details needed to perform rebase operation. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.RebaseGitRepositoryResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
**Return:** [Back to Git (GitClient)](#client-gitclient) • [Top](#top)


### <a id="operation-gitclient-resetgitfolderstate"></a>`resetGitFolderState`
**Description:** (Preview) Halts in-progress Git operations and discards local changes in the workspace folder to regain a clean state.

**Request Interface:** `requests.ResetGitFolderStateRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `gitRepositoryKey` | `string` | The Git repository key. |
| `resetGitFolderStateDetails` | `model.ResetGitFolderStateDetails` | Merge conflict resolution details. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |

**Response Interface:** `responses.ResetGitFolderStateResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
**Return:** [Back to Git (GitClient)](#client-gitclient) • [Top](#top)


### <a id="operation-gitclient-resetgitrepository"></a>`resetGitRepository`
**Description:** (Preview) Performs a Git reset so the workspace branch matches the specified commit, discarding newer local commits.

**Request Interface:** `requests.ResetGitRepositoryRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `gitRepositoryKey` | `string` | The Git repository key. |
| `gitResetDetails` | `model.GitResetDetails` | Details needed to perform Git reset operation. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.ResetGitRepositoryResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
**Return:** [Back to Git (GitClient)](#client-gitclient) • [Top](#top)


### <a id="operation-gitclient-resolvegitconflicts"></a>`resolveGitConflicts`
**Description:** (Preview) Accepts conflict resolution instructions—choose source or target versions—and records the resolution back to the repo.

**Request Interface:** `requests.ResolveGitConflictsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `gitRepositoryKey` | `string` | The Git repository key. |
| `conflictResolveDetails` | `model.ConflictResolveDetails` | Conflict resolution details. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |

**Response Interface:** `responses.ResolveGitConflictsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `gitBranch` | `model.GitBranch` | The returned model.GitBranch instance. |

**Payload `GitBranch` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `branchName` | `string` | The name of the Git branch. |
| `gitUrl` | `string` | The Git repository URL corresponding to the branch. |
| `errorMessage` | `string` | Git error message. |
| `stdOut` | `string` | Git STDOUT message. |
| `stdErr` | `string` | Git STDERR message. |
| `gitExitCode` | `number` | Git exit status. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
**Return:** [Back to Git (GitClient)](#client-gitclient) • [Top](#top)


### <a id="operation-gitclient-updategitrepository"></a>`updateGitRepository`
**Description:** (Preview) Updates stored repository details—such as credentials or default branches—so automation stays aligned with your source control.

**Request Interface:** `requests.UpdateGitRepositoryRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `updateGitRepositoryDetails` | `model.UpdateGitRepositoryDetails` | The information to be updated. |
| `gitRepositoryKey` | `string` | The Git repository key. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.UpdateGitRepositoryResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Git (GitClient)](#client-gitclient) • [Top](#top)


## <a id="client-mlopsclient"></a>MLOpsClient
**Operations:**
- [`createExperiment`](#operation-mlopsclient-createexperiment)
- [`createExperimentRun`](#operation-mlopsclient-createexperimentrun)
- [`createModelVersion`](#operation-mlopsclient-createmodelversion)
- [`createRegisteredModel`](#operation-mlopsclient-createregisteredmodel)
- [`createWorkspaceModelVersion`](#operation-mlopsclient-createworkspacemodelversion)
- [`deleteExperiment`](#operation-mlopsclient-deleteexperiment)
- [`deleteExperimentRun`](#operation-mlopsclient-deleteexperimentrun)
- [`deleteExperimentRunTag`](#operation-mlopsclient-deleteexperimentruntag)
- [`deleteExperimentTag`](#operation-mlopsclient-deleteexperimenttag)
- [`deleteModelVersion`](#operation-mlopsclient-deletemodelversion)
- [`deleteModelVersionTag`](#operation-mlopsclient-deletemodelversiontag)
- [`deleteRegisteredModel`](#operation-mlopsclient-deleteregisteredmodel)
- [`deleteRegisteredModelTag`](#operation-mlopsclient-deleteregisteredmodeltag)
- [`getExperimentById`](#operation-mlopsclient-getexperimentbyid)
- [`getExperimentByName`](#operation-mlopsclient-getexperimentbyname)
- [`getExperimentRunById`](#operation-mlopsclient-getexperimentrunbyid)
- [`getExperimentRunMetricHistory`](#operation-mlopsclient-getexperimentrunmetrichistory)
- [`getModelVersion`](#operation-mlopsclient-getmodelversion)
- [`getRegisteredModel`](#operation-mlopsclient-getregisteredmodel)
- [`listArtifacts`](#operation-mlopsclient-listartifacts)
- [`listExperimentRuns`](#operation-mlopsclient-listexperimentruns)
- [`listExperiments`](#operation-mlopsclient-listexperiments)
- [`listLoggedModels`](#operation-mlopsclient-listloggedmodels)
- [`listModelVersions`](#operation-mlopsclient-listmodelversions)
- [`listRegisteredModels`](#operation-mlopsclient-listregisteredmodels)
- [`logExperimentRunBatch`](#operation-mlopsclient-logexperimentrunbatch)
- [`logExperimentRunInputs`](#operation-mlopsclient-logexperimentruninputs)
- [`logExperimentRunMetric`](#operation-mlopsclient-logexperimentrunmetric)
- [`logExperimentRunModel`](#operation-mlopsclient-logexperimentrunmodel)
- [`logExperimentRunParam`](#operation-mlopsclient-logexperimentrunparam)
- [`renameRegisteredModel`](#operation-mlopsclient-renameregisteredmodel)
- [`restoreExperiment`](#operation-mlopsclient-restoreexperiment)
- [`restoreExperimentRun`](#operation-mlopsclient-restoreexperimentrun)
- [`setExperimentRunTag`](#operation-mlopsclient-setexperimentruntag)
- [`setExperimentTag`](#operation-mlopsclient-setexperimenttag)
- [`setModelVersionTag`](#operation-mlopsclient-setmodelversiontag)
- [`setRegisteredModelTag`](#operation-mlopsclient-setregisteredmodeltag)
- [`transitionModelVersionStage`](#operation-mlopsclient-transitionmodelversionstage)
- [`updateExperiment`](#operation-mlopsclient-updateexperiment)
- [`updateExperimentRun`](#operation-mlopsclient-updateexperimentrun)
- [`updateExperimentRunTags`](#operation-mlopsclient-updateexperimentruntags)
- [`updateExperimentTags`](#operation-mlopsclient-updateexperimenttags)
- [`updateModelVersion`](#operation-mlopsclient-updatemodelversion)
- [`updateModelVersionTags`](#operation-mlopsclient-updatemodelversiontags)
- [`updateRegisteredModel`](#operation-mlopsclient-updateregisteredmodel)
- [`updateRegisteredModelTags`](#operation-mlopsclient-updateregisteredmodeltags)

### <a id="operation-mlopsclient-createexperiment"></a>`createExperiment`
**Description:** (Preview) Creates an experiment in a workspace.

**Request Interface:** `requests.CreateExperimentRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `createExperimentDetails` | `model.CreateExperimentDetails` | Details for the new experiment. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.CreateExperimentResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `createExperimentResponseDetails` | `model.CreateExperimentResponseDetails` | The returned model.CreateExperimentResponseDetails instance. |

**Payload `CreateExperimentResponseDetails` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `experimentId` | `string` | Unique identifier for the experiment. |
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-createexperimentrun"></a>`createExperimentRun`
**Description:** (Preview) Creates a new run within an experiment.

**Request Interface:** `requests.CreateExperimentRunRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `createExperimentRunDetails` | `model.CreateExperimentRunDetails` | Details for the new run. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.CreateExperimentRunResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `createExperimentRunResponseDetails` | `model.CreateExperimentRunResponseDetails` | The returned model.CreateExperimentRunResponseDetails instance. |

**Payload `CreateExperimentRunResponseDetails` Summary:** Details of created run.
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-createmodelversion"></a>`createModelVersion`
**Description:** (Preview) Creates a model version.

**Request Interface:** `requests.CreateModelVersionRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `createModelVersionDetails` | `model.CreateModelVersionDetails` | Details for the new model version. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.CreateModelVersionResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `createModelVersionResponseDetails` | `model.CreateModelVersionResponseDetails` | The returned model.CreateModelVersionResponseDetails instance. |

**Payload `CreateModelVersionResponseDetails` Summary:** Created model version details.
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-createregisteredmodel"></a>`createRegisteredModel`
**Description:** (Preview) Creates a registered model in a workspace.

**Request Interface:** `requests.CreateRegisteredModelRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `createRegisteredModelDetails` | `model.CreateRegisteredModelDetails` | Details for the new registered model. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.CreateRegisteredModelResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `createRegisteredModelResponseDetails` | `model.CreateRegisteredModelResponseDetails` | The returned model.CreateRegisteredModelResponseDetails instance. |

**Payload `CreateRegisteredModelResponseDetails` Summary:** Response object for creating a RegisteredModel
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-createworkspacemodelversion"></a>`createWorkspaceModelVersion`
**Description:** (Preview) Creates a new model version in a specified workspace.

**Request Interface:** `requests.CreateWorkspaceModelVersionRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `createModelVersionDetails` | `model.CreateModelVersionDetails` | Details for the new model version. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.CreateWorkspaceModelVersionResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `createModelVersionResponseDetails` | `model.CreateModelVersionResponseDetails` | The returned model.CreateModelVersionResponseDetails instance. |

**Payload `CreateModelVersionResponseDetails` Summary:** Created model version details.
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-deleteexperiment"></a>`deleteExperiment`
**Description:** (Preview) Deletes an experiment.

**Request Interface:** `requests.DeleteExperimentRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `deleteExperimentDetails` | `model.DeleteExperimentDetails` | Details of the experiment. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.DeleteExperimentResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `deleteExperimentResponseDetails` | `model.DeleteExperimentResponseDetails` | The returned model.DeleteExperimentResponseDetails instance. |

**Payload `DeleteExperimentResponseDetails` Summary:** Response object for deleting an experiment.
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-deleteexperimentrun"></a>`deleteExperimentRun`
**Description:** (Preview) Deletes an experiment run.

**Request Interface:** `requests.DeleteExperimentRunRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `deleteExperimentRunDetails` | `model.DeleteExperimentRunDetails` | Details of the Experiment Run. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.DeleteExperimentRunResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `deleteExperimentRunResponseDetails` | `model.DeleteExperimentRunResponseDetails` | The returned model.DeleteExperimentRunResponseDetails instance. |

**Payload `DeleteExperimentRunResponseDetails` Summary:** Response object for deleting experiment run.
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-deleteexperimentruntag"></a>`deleteExperimentRunTag`
**Description:** (Preview) Deletes a tag on an experiment run.

**Request Interface:** `requests.DeleteExperimentRunTagRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `deleteExperimentRunTagDetails` | `model.DeleteExperimentRunTagDetails` | Tag details to delete on an experiment run. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.DeleteExperimentRunTagResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `deleteExperimentRunTagResponseDetails` | `model.DeleteExperimentRunTagResponseDetails` | The returned model.DeleteExperimentRunTagResponseDetails instance. |

**Payload `DeleteExperimentRunTagResponseDetails` Summary:** Response object for deleting experiment run tag
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-deleteexperimenttag"></a>`deleteExperimentTag`
**Description:** (Preview) Deletes a tag on an experiment.

**Request Interface:** `requests.DeleteExperimentTagRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `deleteExperimentTagDetails` | `model.DeleteExperimentTagDetails` | Tag details to delete on an experiment. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.DeleteExperimentTagResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `deleteExperimentTagResponseDetails` | `model.DeleteExperimentTagResponseDetails` | The returned model.DeleteExperimentTagResponseDetails instance. |

**Payload `DeleteExperimentTagResponseDetails` Summary:** Response object for deleting tag on an experiment.
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-deletemodelversion"></a>`deleteModelVersion`
**Description:** (Preview) Deletes a model version.

**Request Interface:** `requests.DeleteModelVersionRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `deleteModelVersionDetails` | `model.DeleteModelVersionDetails` | Details of the model version to delete. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.DeleteModelVersionResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `deleteModelVersionResponseDetails` | `model.DeleteModelVersionResponseDetails` | The returned model.DeleteModelVersionResponseDetails instance. |

**Payload `DeleteModelVersionResponseDetails` Summary:** Response object for deleting a model version.
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-deletemodelversiontag"></a>`deleteModelVersionTag`
**Description:** (Preview) Deletes a tag on a model version.

**Request Interface:** `requests.DeleteModelVersionTagRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `deleteModelVersionTagDetails` | `model.DeleteModelVersionTagDetails` | Details of a model version tag to delete. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.DeleteModelVersionTagResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `deleteModelVersionTagResponseDetails` | `model.DeleteModelVersionTagResponseDetails` | The returned model.DeleteModelVersionTagResponseDetails instance. |

**Payload `DeleteModelVersionTagResponseDetails` Summary:** Response object for deleting tag of a model version
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-deleteregisteredmodel"></a>`deleteRegisteredModel`
**Description:** (Preview) Deletes a registered model.

**Request Interface:** `requests.DeleteRegisteredModelRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `deleteRegisteredModelDetails` | `model.DeleteRegisteredModelDetails` | Details of the registered model to delete. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.DeleteRegisteredModelResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `deleteRegisteredModelResponseDetails` | `model.DeleteRegisteredModelResponseDetails` | The returned model.DeleteRegisteredModelResponseDetails instance. |

**Payload `DeleteRegisteredModelResponseDetails` Summary:** Response object for deleting a registered model.
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-deleteregisteredmodeltag"></a>`deleteRegisteredModelTag`
**Description:** (Preview) Deletes a tag on a registered model.

**Request Interface:** `requests.DeleteRegisteredModelTagRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `deleteRegisteredModelTagDetails` | `model.DeleteRegisteredModelTagDetails` | Details of a registered model tag. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.DeleteRegisteredModelTagResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `deleteRegisteredModelTagResponseDetails` | `model.DeleteRegisteredModelTagResponseDetails` | The returned model.DeleteRegisteredModelTagResponseDetails instance. |

**Payload `DeleteRegisteredModelTagResponseDetails` Summary:** Response object for deleting tag of a registered model
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-getexperimentbyid"></a>`getExperimentById`
**Description:** (Preview) Returns metadata for an experiment by ID. This method works on deleted experiments.

**Request Interface:** `requests.GetExperimentByIdRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `experimentId` | `string` | The unique ID of the experiment to retrieve. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.GetExperimentByIdResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `experimentResponse` | `model.ExperimentResponse` | The returned model.ExperimentResponse instance. |

**Payload `ExperimentResponse` Summary:** Response object for getting an experiment.
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-getexperimentbyname"></a>`getExperimentByName`
**Description:** (Preview) Returns experiment metadata for a given name. Returns deleted experiments, but prefers the active experiment if an active and deleted experiment share the same name. If multiple deleted experiments share the same name, the API will return one of them.

**Request Interface:** `requests.GetExperimentByNameRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `experimentName` | `string` | The name of the experiment to retrieve. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.GetExperimentByNameResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `experimentResponse` | `model.ExperimentResponse` | The returned model.ExperimentResponse instance. |

**Payload `ExperimentResponse` Summary:** Response object for getting an experiment.
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-getexperimentrunbyid"></a>`getExperimentRunById`
**Description:** (Preview) Returns details of an experiment run by ID.

**Request Interface:** `requests.GetExperimentRunByIdRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `runId` | `string` | ID of the run to fetch. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.GetExperimentRunByIdResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `getExperimentRunResponseDetails` | `model.GetExperimentRunResponseDetails` | The returned model.GetExperimentRunResponseDetails instance. |

**Payload `GetExperimentRunResponseDetails` Summary:** Details of run.
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-getexperimentrunmetrichistory"></a>`getExperimentRunMetricHistory`
**Description:** (Preview) Returns a history of experiment run metrics.

**Request Interface:** `requests.GetExperimentRunMetricHistoryRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `runId` | `string` | ID of the run metric history to fetch. |
| `metricKey` | `string` | Name of the metric key. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `pageToken` | `string` | Pagination token to go to the next page of metric history. |
| `maxResults` | `number` | Maximum number of logged instances of a metric for a run to return per call. Backend servers may restrict the value of max_results depending on performance requirements. Requests that do not specify this value will behave as non-paginated queries where all metric history values for a given metric within a run are returned in a single response. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.GetExperimentRunMetricHistoryResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `experimentRunMetricHistoryCollection` | `model.ExperimentRunMetricHistoryCollection` | The returned model.ExperimentRunMetricHistoryCollection instance. |

**Payload `ExperimentRunMetricHistoryCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `metrics` | `Array<model.ExperimentRunMetric>` | Logged values for the metric. |
| `nextPageToken` | `string` | Token that can be used to retrieve the next page of metric history. An empty token means that no more metric history are available for retrieval. |
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-getmodelversion"></a>`getModelVersion`
**Description:** (Preview) Returns detailed information for a model version.

**Request Interface:** `requests.GetModelVersionRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `name` | `string` | Name of the model version. |
| `version` | `string` | Version number of the model version. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.GetModelVersionResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `getModelVersionResponseDetails` | `model.GetModelVersionResponseDetails` | The returned model.GetModelVersionResponseDetails instance. |

**Payload `GetModelVersionResponseDetails` Summary:** Model version details.
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-getregisteredmodel"></a>`getRegisteredModel`
**Description:** (Preview) Returns details for a specified registered model.

**Request Interface:** `requests.GetRegisteredModelRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `name` | `string` | Name of the registered model. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.GetRegisteredModelResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `getRegisteredModelResponseDetails` | `model.GetRegisteredModelResponseDetails` | The returned model.GetRegisteredModelResponseDetails instance. |

**Payload `GetRegisteredModelResponseDetails` Summary:** Response object for getting a RegisteredModel
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-listartifacts"></a>`listArtifacts`
**Description:** (Preview) Returns a list of artifacts.

**Request Interface:** `requests.ListArtifactsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `runId` | `string` | ID of the run whose artifacts to list. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `path` | `string` | Filter artifacts matching this path (a relative path from the root artifact directory). |
| `pageToken` | `string` | Token indicating the page of artifact results to fetch. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ListArtifactsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `artifactList` | `model.ArtifactList` | The returned model.ArtifactList instance. |

**Payload `ArtifactList` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `rootUri` | `string` | Root artifact directory for the run. |
| `files` | `Array<model.ArtifactFileInfo>` | File location and metadata for artifacts. |
| `nextPageToken` | `string` | Token that can be used to retrieve the next page of artifact results. |
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-listexperimentruns"></a>`listExperimentRuns`
**Description:** (Preview) Returns a list of experiment runs in a workspace.

**Request Interface:** `requests.ListExperimentRunsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `listExperimentRunsDetails` | `model.ListExperimentRunsDetails` | Details of experiment runs to fetch. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ListExperimentRunsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `experimentRunCollection` | `model.ExperimentRunCollection` | The returned model.ExperimentRunCollection instance. |

**Payload `ExperimentRunCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `runs` | `Array<model.ExperimentRun>` | Runs that match the search criteria. |
| `nextPageToken` | `string` | Token that can be used to retrieve the next page of runs. An empty token means that no more runs are available for retrieval. |
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-listexperiments"></a>`listExperiments`
**Description:** (Preview) Returns a list of experiments with the given details.

**Request Interface:** `requests.ListExperimentsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `listExperimentsDetails` | `model.ListExperimentsDetails` | Details of experiments to fetch. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ListExperimentsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `experimentCollection` | `model.ExperimentCollection` | The returned model.ExperimentCollection instance. |

**Payload `ExperimentCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `experiments` | `Array<model.Experiment>` | Experiments that match the search criteria. |
| `nextPageToken` | `string` | Token that can be used to retrieve the next page of experiments. An empty token means that no more experiments are available for retrieval. |
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-listloggedmodels"></a>`listLoggedModels`
**Description:** (Preview) Returns a list of logged models.

**Request Interface:** `requests.ListLoggedModelsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `listLoggedModelsDetails` | `model.ListLoggedModelsDetails` | Details of logged models to fetch. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ListLoggedModelsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `loggedModelCollection` | `model.LoggedModelCollection` | The returned model.LoggedModelCollection instance. |

**Payload `LoggedModelCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `models` | `Array<model.LoggedModel>` | Logged models that match the search criteria |
| `nextPageToken` | `string` | Token that can be used to retrieve the next page of logged-models. An empty token means that no more logged-models are available for retrieval. |
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-listmodelversions"></a>`listModelVersions`
**Description:** (Preview) Returns a list of model versions.

**Request Interface:** `requests.ListModelVersionsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `filter` | `string` | String filter condition, like \"name LIKE 'my-model-name'\". Single boolean condition, with string values wrapped in single quotes. |
| `maxResults` | `number` | Maximum number of model versions to retrieve. |
| `pageToken` | `string` | Pagination token to go to the next page based on a previous search query. |
| `orderBy` | `string` | List of columns to be ordered by including model name, version, stage with an optional \"DESC\" or \"ASC\" annotation, where \"ASC\" is the default. Tiebreaks are done by latest stage transition timestamp, followed by name ASC, followed by version DESC. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ListModelVersionsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `modelVersionCollection` | `model.ModelVersionCollection` | The returned model.ModelVersionCollection instance. |

**Payload `ModelVersionCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `modelVersions` | `Array<model.ModelVersion>` | Model versions that match the search criteria. |
| `nextPageToken` | `string` | Token that can be used to retrieve the next page of model versions. |
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-listregisteredmodels"></a>`listRegisteredModels`
**Description:** (Preview) Returns a list of registered models in a workspace.

**Request Interface:** `requests.ListRegisteredModelsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `filter` | `string` | String filter condition, like \"name LIKE 'my-model-name'\". Interpreted in the backend automatically as \"name LIKE '%my-model-name%'\". Single boolean condition, with string values wrapped in single quotes. |
| `maxResults` | `number` | Maximum number of models desired. Default is 100. Max threshold is 1000. |
| `pageToken` | `string` | Pagination token to go to the next page based on a previous search query. |
| `orderBy` | `string` | List of columns for ordering search results, which can include model name and last updated timestamp with an optional \"DESC\" or \"ASC\" annotation, where \"ASC\" is the default. Tiebreaks are done by model name ASC. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ListRegisteredModelsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `registeredModelCollection` | `model.RegisteredModelCollection` | The returned model.RegisteredModelCollection instance. |

**Payload `RegisteredModelCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `registeredModels` | `Array<model.RegisteredModel>` | Registered models that match the search criteria. |
| `nextPageToken` | `string` | Token that can be used to retrieve the next page of registered models. |
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-logexperimentrunbatch"></a>`logExperimentRunBatch`
**Description:** (Preview) Logs an experiment run batch.

**Request Interface:** `requests.LogExperimentRunBatchRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `logExperimentRunBatchDetails` | `model.LogExperimentRunBatchDetails` | Details of an experiment run batch. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.LogExperimentRunBatchResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `logExperimentRunBatchResponseDetails` | `model.LogExperimentRunBatchResponseDetails` | The returned model.LogExperimentRunBatchResponseDetails instance. |

**Payload `LogExperimentRunBatchResponseDetails` Summary:** Response object for logging experiment run batch.
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-logexperimentruninputs"></a>`logExperimentRunInputs`
**Description:** (Preview) Logs experiment run inputs.

**Request Interface:** `requests.LogExperimentRunInputsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `logExperimentRunInputsDetails` | `model.LogExperimentRunInputsDetails` | Details of experiment run inputs. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.LogExperimentRunInputsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `logExperimentRunInputsResponseDetails` | `model.LogExperimentRunInputsResponseDetails` | The returned model.LogExperimentRunInputsResponseDetails instance. |

**Payload `LogExperimentRunInputsResponseDetails` Summary:** Response object for logging experiment run inputs.
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-logexperimentrunmetric"></a>`logExperimentRunMetric`
**Description:** (Preview) Logs an experiment run metric.

**Request Interface:** `requests.LogExperimentRunMetricRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `logExperimentRunMetricDetails` | `model.LogExperimentRunMetricDetails` | Details of an experiment run metric. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.LogExperimentRunMetricResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `logExperimentRunMetricResponseDetails` | `model.LogExperimentRunMetricResponseDetails` | The returned model.LogExperimentRunMetricResponseDetails instance. |

**Payload `LogExperimentRunMetricResponseDetails` Summary:** Response object for logging experiment run metric.
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-logexperimentrunmodel"></a>`logExperimentRunModel`
**Description:** (Preview) Logs an experiment run model.

**Request Interface:** `requests.LogExperimentRunModelRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `logExperimentRunModelDetails` | `model.LogExperimentRunModelDetails` | Details of an experiment run model. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.LogExperimentRunModelResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `logExperimentRunModelResponseDetails` | `model.LogExperimentRunModelResponseDetails` | The returned model.LogExperimentRunModelResponseDetails instance. |

**Payload `LogExperimentRunModelResponseDetails` Summary:** Response object for logging experiment run model.
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-logexperimentrunparam"></a>`logExperimentRunParam`
**Description:** (Preview) Logs an experiment run parameter.

**Request Interface:** `requests.LogExperimentRunParamRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `logExperimentRunParamDetails` | `model.LogExperimentRunParamDetails` | Details of an experiment run parameter. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.LogExperimentRunParamResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `logExperimentRunParamResponseDetails` | `model.LogExperimentRunParamResponseDetails` | The returned model.LogExperimentRunParamResponseDetails instance. |

**Payload `LogExperimentRunParamResponseDetails` Summary:** Response object for logging experiment run param.
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-renameregisteredmodel"></a>`renameRegisteredModel`
**Description:** (Preview) Renames a registered model.

**Request Interface:** `requests.RenameRegisteredModelRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `renameRegisteredModelDetails` | `model.RenameRegisteredModelDetails` | Details of a registered model rename. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.RenameRegisteredModelResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `renameRegisteredModelResponseDetails` | `model.RenameRegisteredModelResponseDetails` | The returned model.RenameRegisteredModelResponseDetails instance. |

**Payload `RenameRegisteredModelResponseDetails` Summary:** Response object for renaming a registered model.
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-restoreexperiment"></a>`restoreExperiment`
**Description:** (Preview) Restores an experiment.

**Request Interface:** `requests.RestoreExperimentRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `restoreExperimentDetails` | `model.RestoreExperimentDetails` | Restore experiment details. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.RestoreExperimentResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `restoreExperimentResponseDetails` | `model.RestoreExperimentResponseDetails` | The returned model.RestoreExperimentResponseDetails instance. |

**Payload `RestoreExperimentResponseDetails` Summary:** Response object for restoring an experiment.
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-restoreexperimentrun"></a>`restoreExperimentRun`
**Description:** (Preview) Restores an experiment run.

**Request Interface:** `requests.RestoreExperimentRunRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `restoreExperimentRunDetails` | `model.RestoreExperimentRunDetails` | Restore experiment run details. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.RestoreExperimentRunResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `restoreExperimentRunResponseDetails` | `model.RestoreExperimentRunResponseDetails` | The returned model.RestoreExperimentRunResponseDetails instance. |

**Payload `RestoreExperimentRunResponseDetails` Summary:** Response object for restoring experiment run.
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-setexperimentruntag"></a>`setExperimentRunTag`
**Description:** (Preview) Sets a tag on an experiment run.

**Request Interface:** `requests.SetExperimentRunTagRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `setExperimentRunTagDetails` | `model.SetExperimentRunTagDetails` | Tag details to set on an experiment run. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.SetExperimentRunTagResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `setExperimentRunTagResponseDetails` | `model.SetExperimentRunTagResponseDetails` | The returned model.SetExperimentRunTagResponseDetails instance. |

**Payload `SetExperimentRunTagResponseDetails` Summary:** Response object for setting experiment run tag.
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-setexperimenttag"></a>`setExperimentTag`
**Description:** (Preview) Sets a tag on an experiment.

**Request Interface:** `requests.SetExperimentTagRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `setExperimentTagDetails` | `model.SetExperimentTagDetails` | Tag details to set on an experiment. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.SetExperimentTagResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `setExperimentTagResponseDetails` | `model.SetExperimentTagResponseDetails` | The returned model.SetExperimentTagResponseDetails instance. |

**Payload `SetExperimentTagResponseDetails` Summary:** Response object for setting tag on an experiment.
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-setmodelversiontag"></a>`setModelVersionTag`
**Description:** (Preview) Sets a tag on a model version.

**Request Interface:** `requests.SetModelVersionTagRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `setModelVersionTagDetails` | `model.SetModelVersionTagDetails` | Details of a model version tag. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.SetModelVersionTagResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `setModelVersionTagResponseDetails` | `model.SetModelVersionTagResponseDetails` | The returned model.SetModelVersionTagResponseDetails instance. |

**Payload `SetModelVersionTagResponseDetails` Summary:** Response object for setting tag of a model version
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-setregisteredmodeltag"></a>`setRegisteredModelTag`
**Description:** (Preview) Sets a tag on a registered model.

**Request Interface:** `requests.SetRegisteredModelTagRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `setRegisteredModelTagDetails` | `model.SetRegisteredModelTagDetails` | Details of a registered model tag. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.SetRegisteredModelTagResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `setRegisteredModelTagResponseDetails` | `model.SetRegisteredModelTagResponseDetails` | The returned model.SetRegisteredModelTagResponseDetails instance. |

**Payload `SetRegisteredModelTagResponseDetails` Summary:** Response object for tagging a registered model.
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-transitionmodelversionstage"></a>`transitionModelVersionStage`
**Description:** (Preview) Transitions a model version stage.

**Request Interface:** `requests.TransitionModelVersionStageRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `transitionModelVersionStageDetails` | `model.TransitionModelVersionStageDetails` | Details to transition a model version stage. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.TransitionModelVersionStageResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `transitionModelVersionStageResponseDetails` | `model.TransitionModelVersionStageResponseDetails` | The returned model.TransitionModelVersionStageResponseDetails instance. |

**Payload `TransitionModelVersionStageResponseDetails` Summary:** Updated model version details.
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-updateexperiment"></a>`updateExperiment`
**Description:** (Preview) Updates an experiment.

**Request Interface:** `requests.UpdateExperimentRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `updateExperimentDetails` | `model.UpdateExperimentDetails` | Update experiment metadata. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.UpdateExperimentResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `updateExperimentResponseDetails` | `model.UpdateExperimentResponseDetails` | The returned model.UpdateExperimentResponseDetails instance. |

**Payload `UpdateExperimentResponseDetails` Summary:** Response object for updating an experiment.
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-updateexperimentrun"></a>`updateExperimentRun`
**Description:** (Preview) Updates an experiment run.

**Request Interface:** `requests.UpdateExperimentRunRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `updateExperimentRunDetails` | `model.UpdateExperimentRunDetails` | Update experiment run details. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.UpdateExperimentRunResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `updateExperimentRunResponseDetails` | `model.UpdateExperimentRunResponseDetails` | The returned model.UpdateExperimentRunResponseDetails instance. |

**Payload `UpdateExperimentRunResponseDetails` Summary:** Details of updated run info.
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-updateexperimentruntags"></a>`updateExperimentRunTags`
**Description:** (Preview) Updates tags on an experiment run.

**Request Interface:** `requests.UpdateExperimentRunTagsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `updateExperimentRunTagsDetails` | `model.UpdateExperimentRunTagsDetails` | Details of ExperimentRun tags. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.UpdateExperimentRunTagsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `updateExperimentRunTagsResponseDetails` | `model.UpdateExperimentRunTagsResponseDetails` | The returned model.UpdateExperimentRunTagsResponseDetails instance. |

**Payload `UpdateExperimentRunTagsResponseDetails` Summary:** Response object for updating tags of an ExperimentRun.
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-updateexperimenttags"></a>`updateExperimentTags`
**Description:** (Preview) Updates tags on experiment.

**Request Interface:** `requests.UpdateExperimentTagsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `updateExperimentTagsDetails` | `model.UpdateExperimentTagsDetails` | Details of Experiment tags. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.UpdateExperimentTagsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `updateExperimentTagsResponseDetails` | `model.UpdateExperimentTagsResponseDetails` | The returned model.UpdateExperimentTagsResponseDetails instance. |

**Payload `UpdateExperimentTagsResponseDetails` Summary:** Response object for updating tags of an experiment.
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-updatemodelversion"></a>`updateModelVersion`
**Description:** (Preview) Updates a model version

**Request Interface:** `requests.UpdateModelVersionRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `updateModelVersionDetails` | `model.UpdateModelVersionDetails` | Details to update model version. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.UpdateModelVersionResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `updateModelVersionResponseDetails` | `model.UpdateModelVersionResponseDetails` | The returned model.UpdateModelVersionResponseDetails instance. |

**Payload `UpdateModelVersionResponseDetails` Summary:** Updated model version details.
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-updatemodelversiontags"></a>`updateModelVersionTags`
**Description:** (Preview) Updates tags on a model version.

**Request Interface:** `requests.UpdateModelVersionTagsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `updateModelVersionTagsDetails` | `model.UpdateModelVersionTagsDetails` | Details of model version tags to update. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.UpdateModelVersionTagsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `updateModelVersionTagsResponseDetails` | `model.UpdateModelVersionTagsResponseDetails` | The returned model.UpdateModelVersionTagsResponseDetails instance. |

**Payload `UpdateModelVersionTagsResponseDetails` Summary:** Response object for updating tags of a model version.
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-updateregisteredmodel"></a>`updateRegisteredModel`
**Description:** (Preview) Updates a registered model with the provided details.

**Request Interface:** `requests.UpdateRegisteredModelRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `updateRegisteredModelDetails` | `model.UpdateRegisteredModelDetails` | Details to update the registered model. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.UpdateRegisteredModelResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `updateRegisteredModelResponseDetails` | `model.UpdateRegisteredModelResponseDetails` | The returned model.UpdateRegisteredModelResponseDetails instance. |

**Payload `UpdateRegisteredModelResponseDetails` Summary:** Response object for updating a registered model.
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


### <a id="operation-mlopsclient-updateregisteredmodeltags"></a>`updateRegisteredModelTags`
**Description:** (Preview) Updates tags on a registered model.

**Request Interface:** `requests.UpdateRegisteredModelTagsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `updateRegisteredModelTagsDetails` | `model.UpdateRegisteredModelTagsDetails` | Details of registered model tags. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.UpdateRegisteredModelTagsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `updateRegisteredModelTagsResponseDetails` | `model.UpdateRegisteredModelTagsResponseDetails` | The returned model.UpdateRegisteredModelTagsResponseDetails instance. |

**Payload `UpdateRegisteredModelTagsResponseDetails` Summary:** Response object for updating tags of a registered model.
**Return:** [Back to ML Ops (MLOpsClient)](#client-mlopsclient) • [Top](#top)


## <a id="client-notebookclient"></a>NotebookClient
**Operations:**
- [`createContent`](#operation-notebookclient-createcontent)
- [`createSession`](#operation-notebookclient-createsession)
- [`deleteContent`](#operation-notebookclient-deletecontent)
- [`deleteSession`](#operation-notebookclient-deletesession)
- [`exportContents`](#operation-notebookclient-exportcontents)
- [`getContent`](#operation-notebookclient-getcontent)
- [`getSession`](#operation-notebookclient-getsession)
- [`listSessions`](#operation-notebookclient-listsessions)
- [`modifyContent`](#operation-notebookclient-modifycontent)
- [`patchSession`](#operation-notebookclient-patchsession)
- [`updateContent`](#operation-notebookclient-updatecontent)

### <a id="operation-notebookclient-createcontent"></a>`createContent`
**Description:** Creates a new, untitled, empty file or directory, or copies an existing notebook to a specified path. For example, a POST call to /api/contents/path with body containing copy_from set to /path/to/OtherNotebook.ipynb creates a new copy of OtherNotebook at the specified path.

**Request Interface:** `requests.CreateContentRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `contentPath` | `string` | The path to the notebook file. |
| `createContentDetails` | `model.CreateContentDetails` | Notebook content to create a new notebook. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |
| `datalakeTenantId` | `string` | The tenant ID header. |

**Response Interface:** `responses.CreateContentResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `location` | `string` | URL for the new file. |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcWorkRequestId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `content` | `model.Content` | The returned model.Content instance. |

**Payload `Content` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `name` | `string` | Name of notebook, file or directory, equivalent to the last part of the path. |
| `path` | `string` | Full path for notebook, file or directory. |
| `type` | `Content.Type` | Type of content model. |
| `writable` | `boolean` | Indicates whether the requester has permission to edit the file. |
| `created` | `Date` | Creation timestamp. |
| `lastModified` | `Date` | Last modified timestamp. |
| `size` | `number` | Size of file or notebook in bytes. If no size is provided, defaults to null. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `mimetype` | `string` | Mimetype is only applicable for File model. For other models, it is None. If content is not null, and type is 'file', this contains the mimetype of file. For example, text/plain application/octet-stream. Otherwise this is null. |
| `content` | `any` | Content if requested, otherwise is Null. For Notebook model, this contains a nbformat NotebookNode representing the .ipynb file represented by the model. For File model, content field is always Unicode type. For text-format file models, content simply contains the bytes of the file after decoding as UTF-8. Non-text (base64) files are read as bytes, base64 encoded, and then decoded as UTF-8. For Directory model, content field contains a list of content-free models representing the entities in the directory. |
| `format` | `Content.Format` | Format of content. For Notebook model, format field is always 'json'. For File model, format field is either 'text' or 'base64'. For directory model, format field is always 'json'. |
| `hash` | `string` | [optional] The hexdigest hash string of content, if requested, otherwise null. It cannot be null if hashAlgorithm is defined. |
| `hashAlgorithm` | `string` | [optional] The algorithm used to produce the hash, if requested, (otherwise null). It cannot be null if hash is defined. <a href=\"https://docs.python.org/3/library/hashlib.html#hashlib.algorithms_available\" target=\"_blank\" rel=\"noopener noreferrer\">Available algorithms</a>. |
| `description` | `string` | A user-provided description of the file. |
**Return:** [Back to Notebook (NotebookClient)](#client-notebookclient) • [Top](#top)


### <a id="operation-notebookclient-createsession"></a>`createSession`
**Description:** Creates a new session or returns an existing session if a session for the given path already exists.

**Request Interface:** `requests.CreateSessionRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `createSessionDetails` | `model.CreateSessionDetails` | Details to create a new session. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `datalakeTenantId` | `string` | The tenant ID header. |

**Response Interface:** `responses.CreateSessionResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `location` | `string` | URL for session commands. |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcWorkRequestId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request. |
| `session` | `model.Session` | The returned model.Session instance. |

**Payload `Session` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `id` | `string` | UUID of the notebook session. |
| `name` | `string` | A user-friendly name for the notebook session. |
| `path` | `string` | Path to notebook session. For example, /data/test.ipynb |
| `type` | `Session.Type` | Notebook session type. |
| `clusterId` | `string` | Cluster ID. |
| `agentFlowKey` | `string` | Agent Flow Key of an agent flow. |
| `lifecycleState` | `Session.LifecycleState` | lifecycleState of a Notebook Session. |
**Return:** [Back to Notebook (NotebookClient)](#client-notebookclient) • [Top](#top)


### <a id="operation-notebookclient-deletecontent"></a>`deleteContent`
**Description:** Deletes a notebook file or directory.

**Request Interface:** `requests.DeleteContentRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `contentPath` | `string` | The path to the notebook file. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |

**Response Interface:** `responses.DeleteContentResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `location` | `string` | URL for the deleted file. |
| `opcWorkRequestId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Notebook (NotebookClient)](#client-notebookclient) • [Top](#top)


### <a id="operation-notebookclient-deletesession"></a>`deleteSession`
**Description:** Delete a session with given session ID.

**Request Interface:** `requests.DeleteSessionRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `sessionId` | `string` | The ID of the Data Lake Notebook Session |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |

**Response Interface:** `responses.DeleteSessionResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Notebook (NotebookClient)](#client-notebookclient) • [Top](#top)


### <a id="operation-notebookclient-exportcontents"></a>`exportContents`
**Description:** Exports the notebook file contents. You can optionally specify HTML or ipynb format through the request payload. If no format is specified, ipynb is used by default.

**Request Interface:** `requests.ExportContentsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `contentPath` | `string` | The path to the notebook file. |
| `exportContentsDetails` | `model.ExportContentsDetails` | Payload to export contents of a file. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ExportContentsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `exportedContents` | `model.ExportedContents` | The returned model.ExportedContents instance. |

**Payload `ExportedContents` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `name` | `string` | Name of file, equivalent to the last part of the path. |
| `path` | `string` | Full path of the file. |
| `content` | `any` | For ipynb format, this contains a string representing the .ipynb file. For html format, this contains a string representing the HTML page, it has base64 encoded data for images. |
| `format` | `ExportedContents.Format` | Format of content as requested by the client. By default, ipynb format. |
**Return:** [Back to Notebook (NotebookClient)](#client-notebookclient) • [Top](#top)


### <a id="operation-notebookclient-getcontent"></a>`getContent`
**Description:** Returns a list of contents for a given file or directory. You can optionally specify a type and/or format argument via URL parameter. When given, the Content service returns a model in the requested type and/or format. If the request cannot be satisfied, for example if type=text is requested, but the file is binary, then the request returns a 400 message and a JSON response with a Reason field identifying the issue. The value of the Reason field is ‘bad format’ or ‘bad type’, depending on what was requested.

**Request Interface:** `requests.GetContentRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `contentPath` | `string` | The path to the notebook file. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `type` | `GetContentRequest.Type` | Content type. Either file, directory, or notebook. |
| `format` | `GetContentRequest.Format` | The format in which content should be returned. Either text, base64, or JSON. |
| `content` | `number` | Returns content based on param value. When set to 0, content is NOT returned. When set to 1, content is returned. |
| `hash` | `number` | Returns hash hexdigest string of content and the hash algorithm. 0 for no hash, 1 for return hash. 0 is default. It may be ignored by the content manager. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.GetContentResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `lastModified` | `Date` | Last modified date for file. |
| `content` | `model.Content` | The returned model.Content instance. |

**Payload `Content` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `name` | `string` | Name of notebook, file or directory, equivalent to the last part of the path. |
| `path` | `string` | Full path for notebook, file or directory. |
| `type` | `Content.Type` | Type of content model. |
| `writable` | `boolean` | Indicates whether the requester has permission to edit the file. |
| `created` | `Date` | Creation timestamp. |
| `lastModified` | `Date` | Last modified timestamp. |
| `size` | `number` | Size of file or notebook in bytes. If no size is provided, defaults to null. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `mimetype` | `string` | Mimetype is only applicable for File model. For other models, it is None. If content is not null, and type is 'file', this contains the mimetype of file. For example, text/plain application/octet-stream. Otherwise this is null. |
| `content` | `any` | Content if requested, otherwise is Null. For Notebook model, this contains a nbformat NotebookNode representing the .ipynb file represented by the model. For File model, content field is always Unicode type. For text-format file models, content simply contains the bytes of the file after decoding as UTF-8. Non-text (base64) files are read as bytes, base64 encoded, and then decoded as UTF-8. For Directory model, content field contains a list of content-free models representing the entities in the directory. |
| `format` | `Content.Format` | Format of content. For Notebook model, format field is always 'json'. For File model, format field is either 'text' or 'base64'. For directory model, format field is always 'json'. |
| `hash` | `string` | [optional] The hexdigest hash string of content, if requested, otherwise null. It cannot be null if hashAlgorithm is defined. |
| `hashAlgorithm` | `string` | [optional] The algorithm used to produce the hash, if requested, (otherwise null). It cannot be null if hash is defined. <a href=\"https://docs.python.org/3/library/hashlib.html#hashlib.algorithms_available\" target=\"_blank\" rel=\"noopener noreferrer\">Available algorithms</a>. |
| `description` | `string` | A user-provided description of the file. |
**Return:** [Back to Notebook (NotebookClient)](#client-notebookclient) • [Top](#top)


### <a id="operation-notebookclient-getsession"></a>`getSession`
**Description:** Returns session details for a given session ID.

**Request Interface:** `requests.GetSessionRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `sessionId` | `string` | The ID of the Data Lake Notebook Session |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.GetSessionResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `session` | `model.Session` | The returned model.Session instance. |

**Payload `Session` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `id` | `string` | UUID of the notebook session. |
| `name` | `string` | A user-friendly name for the notebook session. |
| `path` | `string` | Path to notebook session. For example, /data/test.ipynb |
| `type` | `Session.Type` | Notebook session type. |
| `clusterId` | `string` | Cluster ID. |
| `agentFlowKey` | `string` | Agent Flow Key of an agent flow. |
| `lifecycleState` | `Session.LifecycleState` | lifecycleState of a Notebook Session. |
**Return:** [Back to Notebook (NotebookClient)](#client-notebookclient) • [Top](#top)


### <a id="operation-notebookclient-listsessions"></a>`listSessions`
**Description:** Returns a list of all available sessions.

**Request Interface:** `requests.ListSessionsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `clusterId` | `string` | Cluster ID attached to a session. |
| `path` | `string` | Notebook file path attached to a session. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `agentFlowKey` | `string` | Agent flow key of the attached agent flow. |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `ListSessionsRequest.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListSessionsRequest.SortBy` | The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. |

**Response Interface:** `responses.ListSessionsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sessionCollection` | `model.SessionCollection` | The returned model.SessionCollection instance. |

**Payload `SessionCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.SessionSummary>` | List of sessions. |
**Return:** [Back to Notebook (NotebookClient)](#client-notebookclient) • [Top](#top)


### <a id="operation-notebookclient-modifycontent"></a>`modifyContent`
**Description:** Renames a file or directory without re-uploading content.

**Request Interface:** `requests.ModifyContentRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `contentPath` | `string` | The path to the notebook file. |
| `modifyContentDetails` | `model.ModifyContentDetails` | New path for file or directory. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ModifyContentResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `location` | `string` | Updated URL for the file or directory. |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcWorkRequestId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `content` | `model.Content` | The returned model.Content instance. |

**Payload `Content` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `name` | `string` | Name of notebook, file or directory, equivalent to the last part of the path. |
| `path` | `string` | Full path for notebook, file or directory. |
| `type` | `Content.Type` | Type of content model. |
| `writable` | `boolean` | Indicates whether the requester has permission to edit the file. |
| `created` | `Date` | Creation timestamp. |
| `lastModified` | `Date` | Last modified timestamp. |
| `size` | `number` | Size of file or notebook in bytes. If no size is provided, defaults to null. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `mimetype` | `string` | Mimetype is only applicable for File model. For other models, it is None. If content is not null, and type is 'file', this contains the mimetype of file. For example, text/plain application/octet-stream. Otherwise this is null. |
| `content` | `any` | Content if requested, otherwise is Null. For Notebook model, this contains a nbformat NotebookNode representing the .ipynb file represented by the model. For File model, content field is always Unicode type. For text-format file models, content simply contains the bytes of the file after decoding as UTF-8. Non-text (base64) files are read as bytes, base64 encoded, and then decoded as UTF-8. For Directory model, content field contains a list of content-free models representing the entities in the directory. |
| `format` | `Content.Format` | Format of content. For Notebook model, format field is always 'json'. For File model, format field is either 'text' or 'base64'. For directory model, format field is always 'json'. |
| `hash` | `string` | [optional] The hexdigest hash string of content, if requested, otherwise null. It cannot be null if hashAlgorithm is defined. |
| `hashAlgorithm` | `string` | [optional] The algorithm used to produce the hash, if requested, (otherwise null). It cannot be null if hash is defined. <a href=\"https://docs.python.org/3/library/hashlib.html#hashlib.algorithms_available\" target=\"_blank\" rel=\"noopener noreferrer\">Available algorithms</a>. |
| `description` | `string` | A user-provided description of the file. |
**Return:** [Back to Notebook (NotebookClient)](#client-notebookclient) • [Top](#top)


### <a id="operation-notebookclient-patchsession"></a>`patchSession`
**Description:** Patches a session with a given ID with the provided details. You can use this to rename a session.

**Request Interface:** `requests.PatchSessionRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `sessionId` | `string` | The ID of the Data Lake Notebook Session |
| `patchSessionDetails` | `model.PatchSessionDetails` | Details to patch for an existing session. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.PatchSessionResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `session` | `model.Session` | The returned model.Session instance. |

**Payload `Session` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `id` | `string` | UUID of the notebook session. |
| `name` | `string` | A user-friendly name for the notebook session. |
| `path` | `string` | Path to notebook session. For example, /data/test.ipynb |
| `type` | `Session.Type` | Notebook session type. |
| `clusterId` | `string` | Cluster ID. |
| `agentFlowKey` | `string` | Agent Flow Key of an agent flow. |
| `lifecycleState` | `Session.LifecycleState` | lifecycleState of a Notebook Session. |
**Return:** [Back to Notebook (NotebookClient)](#client-notebookclient) • [Top](#top)


### <a id="operation-notebookclient-updatecontent"></a>`updateContent`
**Description:** Updates the contents of an existing notebook with the provided details or saves a new notebook.

**Request Interface:** `requests.UpdateContentRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `contentPath` | `string` | The path to the notebook file. |
| `updateContentDetails` | `model.UpdateContentDetails` | Details to update the notebook content model file. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.UpdateContentResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `location` | `string` | URL for the new file. |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcWorkRequestId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `content` | `model.Content` | The returned model.Content instance. |

**Payload `Content` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `name` | `string` | Name of notebook, file or directory, equivalent to the last part of the path. |
| `path` | `string` | Full path for notebook, file or directory. |
| `type` | `Content.Type` | Type of content model. |
| `writable` | `boolean` | Indicates whether the requester has permission to edit the file. |
| `created` | `Date` | Creation timestamp. |
| `lastModified` | `Date` | Last modified timestamp. |
| `size` | `number` | Size of file or notebook in bytes. If no size is provided, defaults to null. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `mimetype` | `string` | Mimetype is only applicable for File model. For other models, it is None. If content is not null, and type is 'file', this contains the mimetype of file. For example, text/plain application/octet-stream. Otherwise this is null. |
| `content` | `any` | Content if requested, otherwise is Null. For Notebook model, this contains a nbformat NotebookNode representing the .ipynb file represented by the model. For File model, content field is always Unicode type. For text-format file models, content simply contains the bytes of the file after decoding as UTF-8. Non-text (base64) files are read as bytes, base64 encoded, and then decoded as UTF-8. For Directory model, content field contains a list of content-free models representing the entities in the directory. |
| `format` | `Content.Format` | Format of content. For Notebook model, format field is always 'json'. For File model, format field is either 'text' or 'base64'. For directory model, format field is always 'json'. |
| `hash` | `string` | [optional] The hexdigest hash string of content, if requested, otherwise null. It cannot be null if hashAlgorithm is defined. |
| `hashAlgorithm` | `string` | [optional] The algorithm used to produce the hash, if requested, (otherwise null). It cannot be null if hash is defined. <a href=\"https://docs.python.org/3/library/hashlib.html#hashlib.algorithms_available\" target=\"_blank\" rel=\"noopener noreferrer\">Available algorithms</a>. |
| `description` | `string` | A user-provided description of the file. |
**Return:** [Back to Notebook (NotebookClient)](#client-notebookclient) • [Top](#top)


## <a id="client-roleclient"></a>RoleClient
**Operations:**
- [`addMemberToRole`](#operation-roleclient-addmembertorole)
- [`createRole`](#operation-roleclient-createrole)
- [`deleteRole`](#operation-roleclient-deleterole)
- [`getRole`](#operation-roleclient-getrole)
- [`listRolePermissions`](#operation-roleclient-listrolepermissions)
- [`listRoles`](#operation-roleclient-listroles)
- [`removeMemberFromRole`](#operation-roleclient-removememberfromrole)
- [`updateRole`](#operation-roleclient-updaterole)

### <a id="operation-roleclient-addmembertorole"></a>`addMemberToRole`
**Description:** Assigns a given user/group/principal to a role.

**Request Interface:** `requests.AddMemberToRoleRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `roleKey` | `string` | The unique key of the Role. |
| `addMemberToRoleDetails` | `model.AddMemberToRoleDetails` | The details of the assignee(s) to which a role is assigned. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.AddMemberToRoleResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Role (RoleClient)](#client-roleclient) • [Top](#top)


### <a id="operation-roleclient-createrole"></a>`createRole`
**Description:** Creates a role.

**Request Interface:** `requests.CreateRoleRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `createRoleDetails` | `model.CreateRoleDetails` | Details for the new role. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.CreateRoleResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `role` | `model.Role` | The returned model.Role instance. |

**Payload `Role` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | A unique key for the role. It cannot be changed. |
| `displayName` | `string` | The role name. It can be changed. |
| `roleType` | `model.RoleType` | Type of role. |
| `timeCreated` | `Date` | The time the role was created. An RFC3339 formatted datetime string. |
| `timeUpdated` | `Date` | The time the Role was updated. An RFC3339 formatted datetime string. |
| `createdBy` | `string` | The user name of the user/principal who created the role. |
| `updatedBy` | `string` | The user name of the user/principal who updated the role. |
| `isAssigned` | `boolean` | The role is assigned to the current user or a group that the user is part of. |
| `assignees` | `Array<model.RoleAssignee>` | The users and groups this role is assigned to. |
| `lifecycleState` | `Role.LifecycleState` | The state of the role. |
| `lifecycleDetails` | `string` | A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state. |
| `description` | `string` | The description of the role. |
**Return:** [Back to Role (RoleClient)](#client-roleclient) • [Top](#top)


### <a id="operation-roleclient-deleterole"></a>`deleteRole`
**Description:** Deletes a role.

**Request Interface:** `requests.DeleteRoleRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `roleKey` | `string` | The unique key of the Role. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.DeleteRoleResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Role (RoleClient)](#client-roleclient) • [Top](#top)


### <a id="operation-roleclient-getrole"></a>`getRole`
**Description:** Returns detailed information about a role.

**Request Interface:** `requests.GetRoleRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `roleKey` | `string` | The unique key of the Role. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `roleScope` | `model.GetRoleScopeType` | The scope of roles to be returned. Defaults to USER. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.GetRoleResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `role` | `model.Role` | The returned model.Role instance. |

**Payload `Role` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | A unique key for the role. It cannot be changed. |
| `displayName` | `string` | The role name. It can be changed. |
| `roleType` | `model.RoleType` | Type of role. |
| `timeCreated` | `Date` | The time the role was created. An RFC3339 formatted datetime string. |
| `timeUpdated` | `Date` | The time the Role was updated. An RFC3339 formatted datetime string. |
| `createdBy` | `string` | The user name of the user/principal who created the role. |
| `updatedBy` | `string` | The user name of the user/principal who updated the role. |
| `isAssigned` | `boolean` | The role is assigned to the current user or a group that the user is part of. |
| `assignees` | `Array<model.RoleAssignee>` | The users and groups this role is assigned to. |
| `lifecycleState` | `Role.LifecycleState` | The state of the role. |
| `lifecycleDetails` | `string` | A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state. |
| `description` | `string` | The description of the role. |
**Return:** [Back to Role (RoleClient)](#client-roleclient) • [Top](#top)


### <a id="operation-roleclient-listrolepermissions"></a>`listRolePermissions`
**Description:** Returns a list of permissions for a given role.

**Request Interface:** `requests.ListRolePermissionsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `roleKey` | `string` | The unique key of the Role. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `permissionScope` | `model.ListRolePermissionScopeType` | The scope of role permissions to be returned. Defaults to ALL |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListRolePermissionsRequest.SortBy` | The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ListRolePermissionsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `rolePermissionCollection` | `model.RolePermissionCollection` | The returned model.RolePermissionCollection instance. |

**Payload `RolePermissionCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.RolePermissionSummary>` | Role permissions. |
**Return:** [Back to Role (RoleClient)](#client-roleclient) • [Top](#top)


### <a id="operation-roleclient-listroles"></a>`listRoles`
**Description:** Returns a list of roles.

**Request Interface:** `requests.ListRolesRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `lifecycleState` | `string` | A filter to return only resources that match the given lifecycle state. The state value is case-insensitive. |
| `displayName` | `string` | A filter to return only resources that match the given display name exactly. |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListRolesRequest.SortBy` | The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ListRolesResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `roleCollection` | `model.RoleCollection` | The returned model.RoleCollection instance. |

**Payload `RoleCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.RoleSummary>` | The role summaries returned. |
**Return:** [Back to Role (RoleClient)](#client-roleclient) • [Top](#top)


### <a id="operation-roleclient-removememberfromrole"></a>`removeMemberFromRole`
**Description:** Revoke a role from a given user or group.

**Request Interface:** `requests.RemoveMemberFromRoleRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `roleKey` | `string` | The unique key of the Role. |
| `removeMemberFromRoleDetails` | `model.RemoveMemberFromRoleDetails` | The details of the user or group from which the role is to be revoked. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.RemoveMemberFromRoleResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Role (RoleClient)](#client-roleclient) • [Top](#top)


### <a id="operation-roleclient-updaterole"></a>`updateRole`
**Description:** Updates a role with the provided information.

**Request Interface:** `requests.UpdateRoleRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `roleKey` | `string` | The unique key of the Role. |
| `updateRoleDetails` | `model.UpdateRoleDetails` | The information to be updated. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.UpdateRoleResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `role` | `model.Role` | The returned model.Role instance. |

**Payload `Role` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | A unique key for the role. It cannot be changed. |
| `displayName` | `string` | The role name. It can be changed. |
| `roleType` | `model.RoleType` | Type of role. |
| `timeCreated` | `Date` | The time the role was created. An RFC3339 formatted datetime string. |
| `timeUpdated` | `Date` | The time the Role was updated. An RFC3339 formatted datetime string. |
| `createdBy` | `string` | The user name of the user/principal who created the role. |
| `updatedBy` | `string` | The user name of the user/principal who updated the role. |
| `isAssigned` | `boolean` | The role is assigned to the current user or a group that the user is part of. |
| `assignees` | `Array<model.RoleAssignee>` | The users and groups this role is assigned to. |
| `lifecycleState` | `Role.LifecycleState` | The state of the role. |
| `lifecycleDetails` | `string` | A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state. |
| `description` | `string` | The description of the role. |
**Return:** [Back to Role (RoleClient)](#client-roleclient) • [Top](#top)


## <a id="client-schemaclient"></a>SchemaClient
**Operations:**
- [`createDataTable`](#operation-schemaclient-createdatatable)
- [`createSchema`](#operation-schemaclient-createschema)
- [`createTable`](#operation-schemaclient-createtable)
- [`createView`](#operation-schemaclient-createview)
- [`deleteSchema`](#operation-schemaclient-deleteschema)
- [`deleteTable`](#operation-schemaclient-deletetable)
- [`deleteView`](#operation-schemaclient-deleteview)
- [`generateTempFileUploadTarget`](#operation-schemaclient-generatetempfileuploadtarget)
- [`getSchema`](#operation-schemaclient-getschema)
- [`getTable`](#operation-schemaclient-gettable)
- [`getView`](#operation-schemaclient-getview)
- [`listSchemaPermissions`](#operation-schemaclient-listschemapermissions)
- [`listSchemas`](#operation-schemaclient-listschemas)
- [`listTablePermissions`](#operation-schemaclient-listtablepermissions)
- [`listTables`](#operation-schemaclient-listtables)
- [`listViewPermissions`](#operation-schemaclient-listviewpermissions)
- [`listViews`](#operation-schemaclient-listviews)
- [`manageSchemaPermission`](#operation-schemaclient-manageschemapermission)
- [`manageTablePermission`](#operation-schemaclient-managetablepermission)
- [`manageViewPermission`](#operation-schemaclient-manageviewpermission)
- [`performInferSchema`](#operation-schemaclient-performinferschema)
- [`performInferSchemaWithPreview`](#operation-schemaclient-performinferschemawithpreview)
- [`refreshSchema`](#operation-schemaclient-refreshschema)
- [`refreshTable`](#operation-schemaclient-refreshtable)
- [`retrievePar`](#operation-schemaclient-retrievepar)
- [`updateSchema`](#operation-schemaclient-updateschema)
- [`updateTable`](#operation-schemaclient-updatetable)
- [`updateView`](#operation-schemaclient-updateview)

### <a id="operation-schemaclient-createdatatable"></a>`createDataTable`
**Description:** Creates a managed table with data loaded from a sample file.

**Request Interface:** `requests.CreateDataTableRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `createDataTableDetails` | `model.CreateDataTableDetails` | Details for the new managed table with data. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.CreateDataTableResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcWorkRequestId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
**Return:** [Back to Schema (SchemaClient)](#client-schemaclient) • [Top](#top)


### <a id="operation-schemaclient-createschema"></a>`createSchema`
**Description:** Creates a schema.

**Request Interface:** `requests.CreateSchemaRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `createSchemaDetails` | `model.CreateSchemaDetails` | Details for the new schema. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.CreateSchemaResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `location` | `string` | URL for the created schema. The schema key is generated after this request is sent. |
| `contentLocation` | `string` | Same as location. |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Schema (SchemaClient)](#client-schemaclient) • [Top](#top)


### <a id="operation-schemaclient-createtable"></a>`createTable`
**Description:** Creates a table.

**Request Interface:** `requests.CreateTableRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `createTableDetails` | `model.CreateTableDetails` | Details for the new table. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.CreateTableResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `location` | `string` | URL for the created Table. The table key is generated after this request is sent. |
| `contentLocation` | `string` | Same as location. |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Schema (SchemaClient)](#client-schemaclient) • [Top](#top)


### <a id="operation-schemaclient-createview"></a>`createView`
**Description:** Creates a view.

**Request Interface:** `requests.CreateViewRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `createViewDetails` | `model.CreateViewDetails` | Details for the new view. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.CreateViewResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `view` | `model.View` | The returned model.View instance. |

**Payload `View` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name> |
| `displayName` | `string` | A user-friendly name. Has to be unique within the scope of the schema and is changeable. |
| `catalogKey` | `string` | The name of the catalog to which this view belongs. |
| `schemaKey` | `string` | The name of the Schema to which this view belongs. |
| `viewText` | `string` | The Query used to create the view. |
| `description` | `string` | The description of the view. |
| `viewFields` | `Array<model.ViewFieldDetails>` | Columns for view. |
| `timeCreated` | `Date` | The date and time the View was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z} |
| `timeUpdated` | `Date` | The date and time the View was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z} |
| `createdBy` | `string` | The ID of the user/principal who created the view. |
| `updatedBy` | `string` | The ID of the user who last updated the view. |
| `viewProperties` | `Array<model.ViewProperty>` | View Properties. |
| `lifecycleState` | `model.ViewLifecycleState` | The state of the view. |
| `lifecycleStateDetails` | `string` | A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state. |
**Return:** [Back to Schema (SchemaClient)](#client-schemaclient) • [Top](#top)


### <a id="operation-schemaclient-deleteschema"></a>`deleteSchema`
**Description:** Deletes a schema.

**Request Interface:** `requests.DeleteSchemaRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `schemaKey` | `string` | The fully qualified name of the schema in the format <catalog_name>.<schema_name>. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `isForced` | `boolean` | A boolean which decides if an entity should be deleted with Cascade effect |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.DeleteSchemaResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Schema (SchemaClient)](#client-schemaclient) • [Top](#top)


### <a id="operation-schemaclient-deletetable"></a>`deleteTable`
**Description:** Deletes a table.

**Request Interface:** `requests.DeleteTableRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `tableKey` | `string` | The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `displayName` | `string` | A filter to return only resources that match the given display name exactly. |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.DeleteTableResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Schema (SchemaClient)](#client-schemaclient) • [Top](#top)


### <a id="operation-schemaclient-deleteview"></a>`deleteView`
**Description:** Deletes a view.

**Request Interface:** `requests.DeleteViewRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `viewKey` | `string` | The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `displayName` | `string` | A filter to return only resources that match the given display name exactly. |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.DeleteViewResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Schema (SchemaClient)](#client-schemaclient) • [Top](#top)


### <a id="operation-schemaclient-generatetempfileuploadtarget"></a>`generateTempFileUploadTarget`
**Description:** Generates a URI for uploading a sample file to a temporary folder in a schema.

**Request Interface:** `requests.GenerateTempFileUploadTargetRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `schemaKey` | `string` | The fully qualified name of the schema in the format <catalog_name>.<schema_name>. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.GenerateTempFileUploadTargetResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `generateTempFileUploadTargetResponseDetails` | `model.GenerateTempFileUploadTargetResponseDetails` | The returned model.GenerateTempFileUploadTargetResponseDetails instance. |

**Payload `GenerateTempFileUploadTargetResponseDetails` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `tempFileUploadTarget` | `string` | The generated target URI to upload the file, it must be prefixed by object stroage URL. |
| `uploadKey` | `string` | The unique key for this request. |
| `ociFilePath` | `string` | The exact URI path of the object storage. |
**Return:** [Back to Schema (SchemaClient)](#client-schemaclient) • [Top](#top)


### <a id="operation-schemaclient-getschema"></a>`getSchema`
**Description:** Returns detailed information about a specified schema.

**Request Interface:** `requests.GetSchemaRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `schemaKey` | `string` | The fully qualified name of the schema in the format <catalog_name>.<schema_name>. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.GetSchemaResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `schema` | `model.Schema` | The returned model.Schema instance. |

**Payload `Schema` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | The fully qualified name of the schema in the format <catalog_name>.<schema_name>. |
| `displayName` | `string` | Schema name. |
| `description` | `string` | Schema description. |
| `timeCreated` | `Date` | The date and time the schema was created. |
| `timeUpdated` | `Date` | The date and time the schema was updated. |
| `createdBy` | `string` | ID of the user who created the schema. |
| `updatedBy` | `string` | ID of the user who last updated the schema. |
| `properties` | `{ [key: string]: string` | Key-value pair representing a defined tag key and value. |
| `catalogName` | `string` | The name of the catalog to which this schema belongs. |
| `lifecycleState` | `model.SchemaLifecycleState` | The current state of the schema. |
| `lifecycleStateDetails` | `string` | A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state. |
| `details` | `{ [key: string]: string` | Deprecated field. Map of key-value pairs. This object will be only provided when the parent catalog is external. |
**Return:** [Back to Schema (SchemaClient)](#client-schemaclient) • [Top](#top)


### <a id="operation-schemaclient-gettable"></a>`getTable`
**Description:** Returns detailed information about a table.

**Request Interface:** `requests.GetTableRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `tableKey` | `string` | The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.GetTableResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `table` | `model.Table` | The returned model.Table instance. |

**Payload `Table` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>. |
| `displayName` | `string` | Table name. |
| `catalogKey` | `string` | The name of the catalog to which this table belongs. |
| `schemaKey` | `string` | The name of the schema to which this table belongs. |
| `location` | `string` | Location of the table data. |
| `description` | `string` | Table description. |
| `tableType` | `model.TableType` | Type of table. Managed, external or mount table. |
| `tableFields` | `Array<model.TableFieldDetails>` | Columns for table. |
| `partitionKeys` | `Array<model.TableFieldDetails>` | Columns to be used in partition for table. |
| `tableProperties` | `Array<model.TableProperty>` | Table properties. |
| `timeCreated` | `Date` | The date and time the table was created. |
| `timeUpdated` | `Date` | The date and time the table was updated. |
| `createdBy` | `string` | The OCID of the user/principal who created the table. |
| `updatedBy` | `string` | The ID of the user who last updated the schema. |
| `lifecycleState` | `model.TableLifecycleState` | The state of the table. |
| `lifecycleStateDetails` | `string` | A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state. |
**Return:** [Back to Schema (SchemaClient)](#client-schemaclient) • [Top](#top)


### <a id="operation-schemaclient-getview"></a>`getView`
**Description:** Returns information about a view.

**Request Interface:** `requests.GetViewRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `viewKey` | `string` | The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.GetViewResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `view` | `model.View` | The returned model.View instance. |

**Payload `View` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name> |
| `displayName` | `string` | A user-friendly name. Has to be unique within the scope of the schema and is changeable. |
| `catalogKey` | `string` | The name of the catalog to which this view belongs. |
| `schemaKey` | `string` | The name of the Schema to which this view belongs. |
| `viewText` | `string` | The Query used to create the view. |
| `description` | `string` | The description of the view. |
| `viewFields` | `Array<model.ViewFieldDetails>` | Columns for view. |
| `timeCreated` | `Date` | The date and time the View was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z} |
| `timeUpdated` | `Date` | The date and time the View was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z} |
| `createdBy` | `string` | The ID of the user/principal who created the view. |
| `updatedBy` | `string` | The ID of the user who last updated the view. |
| `viewProperties` | `Array<model.ViewProperty>` | View Properties. |
| `lifecycleState` | `model.ViewLifecycleState` | The state of the view. |
| `lifecycleStateDetails` | `string` | A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state. |
**Return:** [Back to Schema (SchemaClient)](#client-schemaclient) • [Top](#top)


### <a id="operation-schemaclient-listschemapermissions"></a>`listSchemaPermissions`
**Description:** Returns a list of permissions for a given schema.

**Request Interface:** `requests.ListSchemaPermissionsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `schemaKey` | `string` | The fully qualified name of the schema in the format <catalog_name>.<schema_name>. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListSchemaPermissionsRequest.SortBy` | The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.ListSchemaPermissionsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `schemaPermissionCollection` | `model.SchemaPermissionCollection` | The returned model.SchemaPermissionCollection instance. |

**Payload `SchemaPermissionCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.SchemaPermissionSummary>` | List of schema permissions. |
**Return:** [Back to Schema (SchemaClient)](#client-schemaclient) • [Top](#top)


### <a id="operation-schemaclient-listschemas"></a>`listSchemas`
**Description:** Returns a list of schemas.

**Request Interface:** `requests.ListSchemasRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `catalogKey` | `string` | The key of the catalog. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `displayName` | `string` | A filter to return only resources that match the given display name exactly. |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListSchemasRequest.SortBy` | The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ListSchemasResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `schemaCollection` | `model.SchemaCollection` | The returned model.SchemaCollection instance. |

**Payload `SchemaCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.SchemaSummary>` | List of schemas. |
**Return:** [Back to Schema (SchemaClient)](#client-schemaclient) • [Top](#top)


### <a id="operation-schemaclient-listtablepermissions"></a>`listTablePermissions`
**Description:** Returns a list of permissions for a given table.

**Request Interface:** `requests.ListTablePermissionsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `tableKey` | `string` | The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListTablePermissionsRequest.SortBy` | The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.ListTablePermissionsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `tablePermissionCollection` | `model.TablePermissionCollection` | The returned model.TablePermissionCollection instance. |

**Payload `TablePermissionCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.TablePermissionSummary>` | List of table permissions. |
**Return:** [Back to Schema (SchemaClient)](#client-schemaclient) • [Top](#top)


### <a id="operation-schemaclient-listtables"></a>`listTables`
**Description:** Returns a list of tables in a schema.

**Request Interface:** `requests.ListTablesRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `catalogKey` | `string` | The key of the catalog. |
| `schemaKey` | `string` | The fully qualified name of the Data Lake Schema in the format <catalog_name>.<schema_name> |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `displayName` | `string` | A filter to return only resources that match the given display name exactly. |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListTablesRequest.SortBy` | The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ListTablesResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `tableCollection` | `model.TableCollection` | The returned model.TableCollection instance. |

**Payload `TableCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.TableSummary>` | List of tables. |
**Return:** [Back to Schema (SchemaClient)](#client-schemaclient) • [Top](#top)


### <a id="operation-schemaclient-listviewpermissions"></a>`listViewPermissions`
**Description:** Returns a list of view permissions.

**Request Interface:** `requests.ListViewPermissionsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `viewKey` | `string` | The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListViewPermissionsRequest.SortBy` | The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.ListViewPermissionsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `viewPermissionCollection` | `model.ViewPermissionCollection` | The returned model.ViewPermissionCollection instance. |

**Payload `ViewPermissionCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.ViewPermissionSummary>` | List of view permissions. |
**Return:** [Back to Schema (SchemaClient)](#client-schemaclient) • [Top](#top)


### <a id="operation-schemaclient-listviews"></a>`listViews`
**Description:** Returns a list of views in a schema.

**Request Interface:** `requests.ListViewsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `catalogKey` | `string` | The key of the catalog. |
| `schemaKey` | `string` | The fully qualified name of the Data Lake Schema in the format <catalog_name>.<schema_name> |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `displayName` | `string` | A filter to return only resources that match the given display name exactly. |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListViewsRequest.SortBy` | The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ListViewsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `viewCollection` | `model.ViewCollection` | The returned model.ViewCollection instance. |

**Payload `ViewCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.ViewSummary>` | List of views. |
**Return:** [Back to Schema (SchemaClient)](#client-schemaclient) • [Top](#top)


### <a id="operation-schemaclient-manageschemapermission"></a>`manageSchemaPermission`
**Description:** Updates the permissions for a given schema.

**Request Interface:** `requests.ManageSchemaPermissionRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `schemaKey` | `string` | The fully qualified name of the schema in the format <catalog_name>.<schema_name>. |
| `manageSchemaPermissionDetails` | `model.ManageSchemaPermissionDetails` | The information to be updated. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.ManageSchemaPermissionResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Schema (SchemaClient)](#client-schemaclient) • [Top](#top)


### <a id="operation-schemaclient-managetablepermission"></a>`manageTablePermission`
**Description:** Updates the permissions for a given table.

**Request Interface:** `requests.ManageTablePermissionRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `tableKey` | `string` | The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>. |
| `manageTablePermissionDetails` | `model.ManageTablePermissionDetails` | The information to be updated. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.ManageTablePermissionResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Schema (SchemaClient)](#client-schemaclient) • [Top](#top)


### <a id="operation-schemaclient-manageviewpermission"></a>`manageViewPermission`
**Description:** Updates permissions on a view.

**Request Interface:** `requests.ManageViewPermissionRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `viewKey` | `string` | The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>. |
| `manageViewPermissionDetails` | `model.ManageViewPermissionDetails` | The information to be updated. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.ManageViewPermissionResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Schema (SchemaClient)](#client-schemaclient) • [Top](#top)


### <a id="operation-schemaclient-performinferschema"></a>`performInferSchema`
**Description:** Returns details of a table schema from the specified location.

**Request Interface:** `requests.PerformInferSchemaRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `schemaKey` | `string` | The fully qualified name of the schema in the format <catalog_name>.<schema_name>. |
| `performInferSchemaDetails` | `model.PerformInferSchemaDetails` | Details of the location from which the table schema can be inferred. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.PerformInferSchemaResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `inferSchema` | `model.InferSchema` | The returned model.InferSchema instance. |

**Payload `InferSchema` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `inferSchemaColumn` | `Array<model.InferSchemaColumn>` | Column information obtained by inferring schema. |
**Return:** [Back to Schema (SchemaClient)](#client-schemaclient) • [Top](#top)


### <a id="operation-schemaclient-performinferschemawithpreview"></a>`performInferSchemaWithPreview`
**Description:** Returns table schema and data from the specified location.

**Request Interface:** `requests.PerformInferSchemaWithPreviewRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `schemaKey` | `string` | The fully qualified name of the schema in the format <catalog_name>.<schema_name>. |
| `performInferSchemaDetails` | `model.PerformInferSchemaDetails` | Details of the location from which the table schema and data can be inferred. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.PerformInferSchemaWithPreviewResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `inferSchemaWithPreview` | `model.InferSchemaWithPreview` | The returned model.InferSchemaWithPreview instance. |

**Payload `InferSchemaWithPreview` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `schema` | `Array<model.InferSchemaColumn>` | Column information obtained by inferring schema. |
| `data` | `Array<{ [key: string]: string` | Sample preview data. |
**Return:** [Back to Schema (SchemaClient)](#client-schemaclient) • [Top](#top)


### <a id="operation-schemaclient-refreshschema"></a>`refreshSchema`
**Description:** Refreshes schema through the crawler.

**Request Interface:** `requests.RefreshSchemaRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `schemaKey` | `string` | The fully qualified name of the schema in the format <catalog_name>.<schema_name>. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |

**Response Interface:** `responses.RefreshSchemaResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
**Return:** [Back to Schema (SchemaClient)](#client-schemaclient) • [Top](#top)


### <a id="operation-schemaclient-refreshtable"></a>`refreshTable`
**Description:** Refreshes a table through the crawler.

**Request Interface:** `requests.RefreshTableRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `tableKey` | `string` | The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |

**Response Interface:** `responses.RefreshTableResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
**Return:** [Back to Schema (SchemaClient)](#client-schemaclient) • [Top](#top)


### <a id="operation-schemaclient-retrievepar"></a>`retrievePar`
**Description:** Retrieves PAR for the entities created.

**Request Interface:** `requests.RetrieveParRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `tableKey` | `string` | The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.RetrieveParResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `parDetails` | `model.ParDetails` | The returned model.ParDetails instance. |

**Payload `ParDetails` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `parUrl` | `string` | PAR URL of the table. |
| `tableKey` | `string` | The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>. |
| `timeExpires` | `Date` | The date and time the table was updated. |
| `parAccessType` | `model.ParAccessType` | The operation that can be performed on this resource. |
**Return:** [Back to Schema (SchemaClient)](#client-schemaclient) • [Top](#top)


### <a id="operation-schemaclient-updateschema"></a>`updateSchema`
**Description:** Updates a schema.

**Request Interface:** `requests.UpdateSchemaRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `schemaKey` | `string` | The fully qualified name of the schema in the format <catalog_name>.<schema_name>. |
| `updateSchemaDetails` | `model.UpdateSchemaDetails` | The information to be updated. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.UpdateSchemaResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcWorkRequestId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `schema` | `model.Schema` | The returned model.Schema instance. |

**Payload `Schema` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | The fully qualified name of the schema in the format <catalog_name>.<schema_name>. |
| `displayName` | `string` | Schema name. |
| `description` | `string` | Schema description. |
| `timeCreated` | `Date` | The date and time the schema was created. |
| `timeUpdated` | `Date` | The date and time the schema was updated. |
| `createdBy` | `string` | ID of the user who created the schema. |
| `updatedBy` | `string` | ID of the user who last updated the schema. |
| `properties` | `{ [key: string]: string` | Key-value pair representing a defined tag key and value. |
| `catalogName` | `string` | The name of the catalog to which this schema belongs. |
| `lifecycleState` | `model.SchemaLifecycleState` | The current state of the schema. |
| `lifecycleStateDetails` | `string` | A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state. |
| `details` | `{ [key: string]: string` | Deprecated field. Map of key-value pairs. This object will be only provided when the parent catalog is external. |
**Return:** [Back to Schema (SchemaClient)](#client-schemaclient) • [Top](#top)


### <a id="operation-schemaclient-updatetable"></a>`updateTable`
**Description:** Updates a table with provided details.

**Request Interface:** `requests.UpdateTableRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `tableKey` | `string` | The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>. |
| `updateTableDetails` | `model.UpdateTableDetails` | The information to be updated. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.UpdateTableResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Schema (SchemaClient)](#client-schemaclient) • [Top](#top)


### <a id="operation-schemaclient-updateview"></a>`updateView`
**Description:** Updates a view with given information.

**Request Interface:** `requests.UpdateViewRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `viewKey` | `string` | The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>. |
| `updateViewDetails` | `model.UpdateViewDetails` | The update mode and information to be updated. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.UpdateViewResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `view` | `model.View` | The returned model.View instance. |

**Payload `View` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name> |
| `displayName` | `string` | A user-friendly name. Has to be unique within the scope of the schema and is changeable. |
| `catalogKey` | `string` | The name of the catalog to which this view belongs. |
| `schemaKey` | `string` | The name of the Schema to which this view belongs. |
| `viewText` | `string` | The Query used to create the view. |
| `description` | `string` | The description of the view. |
| `viewFields` | `Array<model.ViewFieldDetails>` | Columns for view. |
| `timeCreated` | `Date` | The date and time the View was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z} |
| `timeUpdated` | `Date` | The date and time the View was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z} |
| `createdBy` | `string` | The ID of the user/principal who created the view. |
| `updatedBy` | `string` | The ID of the user who last updated the view. |
| `viewProperties` | `Array<model.ViewProperty>` | View Properties. |
| `lifecycleState` | `model.ViewLifecycleState` | The state of the view. |
| `lifecycleStateDetails` | `string` | A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state. |
**Return:** [Back to Schema (SchemaClient)](#client-schemaclient) • [Top](#top)


## <a id="client-semanticcatalogclient"></a>SemanticCatalogClient
**Operations:**
- [`exportLineage`](#operation-semanticcatalogclient-exportlineage)
- [`fetchEntityLineage`](#operation-semanticcatalogclient-fetchentitylineage)

### <a id="operation-semanticcatalogclient-exportlineage"></a>`exportLineage`
**Description:** (Preview) Returns complete lineage for the provided anchor node in CSV format.

**Request Interface:** `requests.ExportLineageRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `exportLineageDetails` | `model.ExportLineageDetails` | The information needed to export lineage. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |

**Response Interface:** `responses.ExportLineageResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `contentDisposition` | `string` | Attachment filename in {@code AnchorNodeName_Timestamp.csv} format. |
| `value` | `stream.Readable | ReadableStream` | The returned stream.Readable | ReadableStream instance. |
**Return:** [Back to Semantic Catalog (SemanticCatalogClient)](#client-semanticcatalogclient) • [Top](#top)


### <a id="operation-semanticcatalogclient-fetchentitylineage"></a>`fetchEntityLineage`
**Description:** (Preview) Returns lineage for a given entity object.

**Request Interface:** `requests.FetchEntityLineageRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `fetchEntityLineageDetails` | `model.FetchEntityLineageDetails` | The information needed to obtain desired lineage. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |

**Response Interface:** `responses.FetchEntityLineageResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `entityLineage` | `model.EntityLineage` | The returned model.EntityLineage instance. |

**Payload `EntityLineage` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `nodes` | `Array<model.LineageObject>` | Set of links that are involved in the lineage. |
| `links` | `Array<model.LineageRelationship>` | Set of links between the objects in the 'objects' set. |
**Return:** [Back to Semantic Catalog (SemanticCatalogClient)](#client-semanticcatalogclient) • [Top](#top)


## <a id="client-usersettingclient"></a>UserSettingClient
**Operations:**
- [`createUserSetting`](#operation-usersettingclient-createusersetting)
- [`deleteUserSetting`](#operation-usersettingclient-deleteusersetting)
- [`getUserSetting`](#operation-usersettingclient-getusersetting)
- [`listUserSettings`](#operation-usersettingclient-listusersettings)
- [`updateUserSetting`](#operation-usersettingclient-updateusersetting)

### <a id="operation-usersettingclient-createusersetting"></a>`createUserSetting`
**Description:** (Preview) The User Settings API allows you to manage user-specific configurations and credentials within an AI Data Platform instance. What you can do -> Store user credentials and integrations, including: -> IAM user credentials -> Git account configurations (e.g., GitHub PAT) -> Create and manage multiple settings -> Mark a setting as default for a given type -> Retrieve and filter settings by type or default status Supported setting types -> IAM_USER_CREDENTIAL – OCI user credentials for API access -> GIT_ACCOUNT – Git provider configuration (e.g., GitHub personal access token) Core operations -> Create a user setting -> List all user settings (with filtering and pagination) -> Get a specific setting by key -> Update an existing setting -> Delete a setting

**Request Interface:** `requests.CreateUserSettingRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `createUserSettingDetails` | `model.CreateUserSettingDetails` | Details for the new setting. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |

**Response Interface:** `responses.CreateUserSettingResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `userSetting` | `model.UserSetting` | The returned model.UserSetting instance. |

**Payload `UserSetting` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | The unique identifier for the setting. |
| `name` | `string` | A user-friendly name for the setting. |
| `isDefault` | `boolean` | Indicates whether this setting is the default. |
**Return:** [Back to User Setting (UserSettingClient)](#client-usersettingclient) • [Top](#top)


### <a id="operation-usersettingclient-deleteusersetting"></a>`deleteUserSetting`
**Description:** (Preview) Deletes a user setting and its credentials from this AI Data Platform instance, freeing the default slot for that type.

**Request Interface:** `requests.DeleteUserSettingRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `settingKey` | `string` | The UUID of the user setting. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.DeleteUserSettingResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to User Setting (UserSettingClient)](#client-usersettingclient) • [Top](#top)


### <a id="operation-usersettingclient-getusersetting"></a>`getUserSetting`
**Description:** (Preview) Returns the full definition of user settings identified by its key, including type-specific payload and default flag.

**Request Interface:** `requests.GetUserSettingRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `settingKey` | `string` | The UUID of the user setting. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.GetUserSettingResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `userSetting` | `model.UserSetting` | The returned model.UserSetting instance. |

**Payload `UserSetting` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | The unique identifier for the setting. |
| `name` | `string` | A user-friendly name for the setting. |
| `isDefault` | `boolean` | Indicates whether this setting is the default. |
**Return:** [Back to User Setting (UserSettingClient)](#client-usersettingclient) • [Top](#top)


### <a id="operation-usersettingclient-listusersettings"></a>`listUserSettings`
**Description:** (Preview) Returns a list of all user-specific configurations, with filters for setting type, default flag, and pagination when needed.

**Request Interface:** `requests.ListUserSettingsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `settingType` | `ListUserSettingsRequest.SettingType` | A filter to return only those settings whose value matches the given data type. |
| `isDefault` | `boolean` | A filter to return only resources that are default. |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListUserSettingsRequest.SortBy` | The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending. |
| `displayName` | `string` | A filter to return only resources that match the given display name exactly. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ListUserSettingsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `userSettingCollection` | `model.UserSettingCollection` | The returned model.UserSettingCollection instance. |

**Payload `UserSettingCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.UserSettingSummary>` | List of settings. |
**Return:** [Back to User Setting (UserSettingClient)](#client-usersettingclient) • [Top](#top)


### <a id="operation-usersettingclient-updateusersetting"></a>`updateUserSetting`
**Description:** (Preview) Updates the metadata or payload of an existing user setting, letting you rotate credentials or change defaults.

**Request Interface:** `requests.UpdateUserSettingRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `settingKey` | `string` | The UUID of the user setting. |
| `updateUserSettingDetails` | `model.UpdateUserSettingDetails` | Details for the user setting to be updated. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |

**Response Interface:** `responses.UpdateUserSettingResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `userSetting` | `model.UserSetting` | The returned model.UserSetting instance. |

**Payload `UserSetting` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | The unique identifier for the setting. |
| `name` | `string` | A user-friendly name for the setting. |
| `isDefault` | `boolean` | Indicates whether this setting is the default. |
**Return:** [Back to User Setting (UserSettingClient)](#client-usersettingclient) • [Top](#top)


## <a id="client-volumeclient"></a>VolumeClient
**Operations:**
- [`createVolume`](#operation-volumeclient-createvolume)
- [`deleteDir`](#operation-volumeclient-deletedir)
- [`deleteFile`](#operation-volumeclient-deletefile)
- [`deleteVolume`](#operation-volumeclient-deletevolume)
- [`downloadFile`](#operation-volumeclient-downloadfile)
- [`downloadFileWithPar`](#operation-volumeclient-downloadfilewithpar)
- [`getVolume`](#operation-volumeclient-getvolume)
- [`listFiles`](#operation-volumeclient-listfiles)
- [`listVolumePermissions`](#operation-volumeclient-listvolumepermissions)
- [`listVolumes`](#operation-volumeclient-listvolumes)
- [`makeDir`](#operation-volumeclient-makedir)
- [`manageVolumePermission`](#operation-volumeclient-managevolumepermission)
- [`updateDir`](#operation-volumeclient-updatedir)
- [`updateVolume`](#operation-volumeclient-updatevolume)
- [`uploadFile`](#operation-volumeclient-uploadfile)
- [`uploadFileWithPar`](#operation-volumeclient-uploadfilewithpar)

### <a id="operation-volumeclient-createvolume"></a>`createVolume`
**Description:** Creates a volume.

**Request Interface:** `requests.CreateVolumeRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `createVolumeDetails` | `model.CreateVolumeDetails` | Details for the new volume. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.CreateVolumeResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `location` | `string` | URL for the created volume. The volume key is generated after this request is sent. |
| `contentLocation` | `string` | Same as location. |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcWorkRequestId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `volume` | `model.Volume` | The returned model.Volume instance. |

**Payload `Volume` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | The key of the volume. |
| `displayName` | `string` | A user-friendly name. Has to be unique within the schema and is changeable. |
| `description` | `string` | Short description of the volume |
| `timeCreated` | `Date` | The date and time the Data Lake Volume was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z} |
| `timeUpdated` | `Date` | The date and time the Data Lake Volume was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z} |
| `createdBy` | `string` | The ID of the user that created the volume. |
| `updatedBy` | `string` | The ID of the user that last updated the volume |
| `catalogName` | `string` | The name of the catalog to which this volume belongs. |
| `schemaName` | `string` | The name of the schema to which this volume belongs. |
| `fullName` | `string` | The fully qualified name of this volume. |
| `volumeType` | `Volume.VolumeType` | The type of volume. |
| `storageLocation` | `string` | The storage location of the external volume. Only applicable for external volumes. |
| `lifecycleState` | `Volume.LifecycleState` | The lifecycle state of the volume. The volume is ready for use in ACTIVE state |
| `lifecycleStateDetails` | `string` | Additional details associated with the lifecycle state. |
| `systemTags` | `{ [key: string]: { [key: string]: any` | System tags for this resource. Each key is predefined and scoped to a namespace. <p> Example: {@code {\"orcl-cloud\": {\"free-tier-retained\": \"true\"}}} |
**Return:** [Back to Volume (VolumeClient)](#client-volumeclient) • [Top](#top)


### <a id="operation-volumeclient-deletedir"></a>`deleteDir`
**Description:** Deletes a directory in a volume.

**Request Interface:** `requests.DeleteDirRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `volumeKey` | `string` | The key of the volume. |
| `path` | `string` | The absolute path of the file or folder |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.DeleteDirResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcWorkRequestId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Volume (VolumeClient)](#client-volumeclient) • [Top](#top)


### <a id="operation-volumeclient-deletefile"></a>`deleteFile`
**Description:** Deletes a file or folder in a volume.

**Request Interface:** `requests.DeleteFileRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `volumeKey` | `string` | The key of the volume. |
| `path` | `string` | The absolute path of the file or folder |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.DeleteFileResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcWorkRequestId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Volume (VolumeClient)](#client-volumeclient) • [Top](#top)


### <a id="operation-volumeclient-deletevolume"></a>`deleteVolume`
**Description:** Deletes a volume.

**Request Interface:** `requests.DeleteVolumeRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `volumeKey` | `string` | The key of the volume. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.DeleteVolumeResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcWorkRequestId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Volume (VolumeClient)](#client-volumeclient) • [Top](#top)


### <a id="operation-volumeclient-downloadfile"></a>`downloadFile`
**Description:** Downloads a file from a volume.

**Request Interface:** `requests.DownloadFileRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `volumeKey` | `string` | The key of the volume. |
| `path` | `string` | The absolute path of the file or folder |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.DownloadFileResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `value` | `stream.Readable | ReadableStream` | The returned stream.Readable | ReadableStream instance. |
**Return:** [Back to Volume (VolumeClient)](#client-volumeclient) • [Top](#top)


### <a id="operation-volumeclient-downloadfilewithpar"></a>`downloadFileWithPar`
**Description:** provide the par info for downloading the file for given path.

**Request Interface:** `requests.DownloadFileWithParRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `volumeKey` | `string` | The key of the volume. |
| `path` | `string` | The absolute path of the file or folder |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `shouldGenerateNewPar` | `boolean` | Flag to toggle to generate short living par |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.DownloadFileWithParResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `location` | `string` | URL for the uploaded volume file. |
| `contentLocation` | `string` | Same as location. |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `downloadFileWithParResult` | `model.DownloadFileWithParResult` | The returned model.DownloadFileWithParResult instance. |

**Payload `DownloadFileWithParResult` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `parUrl` | `string` | String representing the PAR URL. |
| `eTag` | `string` | Etag after creating or closing a file. |
| `locationUri` | `string` | The object storage URI which has bucket and namespace information. |
| `size` | `number` | File size in bytes. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `createdBy` | `string` | The user who created the file. |
| `updatedBy` | `string` | The user who last updated the file. |
| `createdTime` | `string` | The time at which the file was created. |
| `updatedTime` | `string` | The last modified time of the file. |
| `description` | `string` | The file description. |
| `systemTags` | `{ [key: string]: { [key: string]: any` | System tags for this resource. Each key is predefined and scoped to a namespace. <p> Example: {@code {\"orcl-cloud\": {\"free-tier-retained\": \"true\"}}} |
**Return:** [Back to Volume (VolumeClient)](#client-volumeclient) • [Top](#top)


### <a id="operation-volumeclient-getvolume"></a>`getVolume`
**Description:** Returns detailed information about a volume.

**Request Interface:** `requests.GetVolumeRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `volumeKey` | `string` | The key of the volume. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.GetVolumeResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `volume` | `model.Volume` | The returned model.Volume instance. |

**Payload `Volume` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | The key of the volume. |
| `displayName` | `string` | A user-friendly name. Has to be unique within the schema and is changeable. |
| `description` | `string` | Short description of the volume |
| `timeCreated` | `Date` | The date and time the Data Lake Volume was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z} |
| `timeUpdated` | `Date` | The date and time the Data Lake Volume was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z} |
| `createdBy` | `string` | The ID of the user that created the volume. |
| `updatedBy` | `string` | The ID of the user that last updated the volume |
| `catalogName` | `string` | The name of the catalog to which this volume belongs. |
| `schemaName` | `string` | The name of the schema to which this volume belongs. |
| `fullName` | `string` | The fully qualified name of this volume. |
| `volumeType` | `Volume.VolumeType` | The type of volume. |
| `storageLocation` | `string` | The storage location of the external volume. Only applicable for external volumes. |
| `lifecycleState` | `Volume.LifecycleState` | The lifecycle state of the volume. The volume is ready for use in ACTIVE state |
| `lifecycleStateDetails` | `string` | Additional details associated with the lifecycle state. |
| `systemTags` | `{ [key: string]: { [key: string]: any` | System tags for this resource. Each key is predefined and scoped to a namespace. <p> Example: {@code {\"orcl-cloud\": {\"free-tier-retained\": \"true\"}}} |
**Return:** [Back to Volume (VolumeClient)](#client-volumeclient) • [Top](#top)


### <a id="operation-volumeclient-listfiles"></a>`listFiles`
**Description:** Returns a list of files in a volume.

**Request Interface:** `requests.ListFilesRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `volumeKey` | `string` | The key of the volume. |
| `path` | `string` | The absolute path of the file or folder |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `isRecursive` | `boolean` | A boolean which decides if nested files should be in the list files in volume response. |
| `displayName` | `string` | A filter to return only resources that match the given display name exactly. |
| `metadataKeys` | `string` | Comma separated keys to have in list response. |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListFilesRequest.SortBy` | The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.ListFilesResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `volumeFileCollection` | `model.VolumeFileCollection` | The returned model.VolumeFileCollection instance. |

**Payload `VolumeFileCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.VolumeFileSummary>` | List of volume files. |
**Return:** [Back to Volume (VolumeClient)](#client-volumeclient) • [Top](#top)


### <a id="operation-volumeclient-listvolumepermissions"></a>`listVolumePermissions`
**Description:** Returns a list of volume permissions.

**Request Interface:** `requests.ListVolumePermissionsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `volumeKey` | `string` | The key of the volume. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListVolumePermissionsRequest.SortBy` | The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ListVolumePermissionsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `volumePermissionCollection` | `model.VolumePermissionCollection` | The returned model.VolumePermissionCollection instance. |

**Payload `VolumePermissionCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.VolumePermissionSummary>` | List of volume permissions. |
**Return:** [Back to Volume (VolumeClient)](#client-volumeclient) • [Top](#top)


### <a id="operation-volumeclient-listvolumes"></a>`listVolumes`
**Description:** Returns a list of volumes.

**Request Interface:** `requests.ListVolumesRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `catalogKey` | `string` | The key of the catalog. |
| `schemaKey` | `string` | The fully qualified name of the Data Lake Schema in the format <catalog_name>.<schema_name> |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `displayName` | `string` | A filter to return only resources that match the given display name exactly. |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListVolumesRequest.SortBy` | The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ListVolumesResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `volumeCollection` | `model.VolumeCollection` | The returned model.VolumeCollection instance. |

**Payload `VolumeCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.VolumeSummary>` | List of volumes. |
**Return:** [Back to Volume (VolumeClient)](#client-volumeclient) • [Top](#top)


### <a id="operation-volumeclient-makedir"></a>`makeDir`
**Description:** Creates a directory in a volume.

**Request Interface:** `requests.MakeDirRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `volumeKey` | `string` | The key of the volume. |
| `path` | `string` | The absolute path of the file or folder |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `description` | `string` | The description of the folder. |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.MakeDirResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `location` | `string` | URL for the created folder. |
| `contentLocation` | `string` | Same as location. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Volume (VolumeClient)](#client-volumeclient) • [Top](#top)


### <a id="operation-volumeclient-managevolumepermission"></a>`manageVolumePermission`
**Description:** Updates the permissions on a volume.

**Request Interface:** `requests.ManageVolumePermissionRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `volumeKey` | `string` | The key of the volume. |
| `manageVolumePermissionDetails` | `model.ManageVolumePermissionDetails` | The information to be updated. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ManageVolumePermissionResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Volume (VolumeClient)](#client-volumeclient) • [Top](#top)


### <a id="operation-volumeclient-updatedir"></a>`updateDir`
**Description:** Updates a directory in volume with the provided information.

**Request Interface:** `requests.UpdateDirRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `volumeKey` | `string` | The key of the volume. |
| `updateDirDetails` | `model.UpdateDirDetails` | The information to be updated. |
| `path` | `string` | The absolute path of the file or folder |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.UpdateDirResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `location` | `string` | URL for the deleted folder. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcWorkRequestId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request. |
**Return:** [Back to Volume (VolumeClient)](#client-volumeclient) • [Top](#top)


### <a id="operation-volumeclient-updatevolume"></a>`updateVolume`
**Description:** Updates a volume with the provided information.

**Request Interface:** `requests.UpdateVolumeRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `volumeKey` | `string` | The key of the volume. |
| `updateVolumeDetails` | `model.UpdateVolumeDetails` | The information to be updated. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.UpdateVolumeResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcWorkRequestId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `volume` | `model.Volume` | The returned model.Volume instance. |

**Payload `Volume` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | The key of the volume. |
| `displayName` | `string` | A user-friendly name. Has to be unique within the schema and is changeable. |
| `description` | `string` | Short description of the volume |
| `timeCreated` | `Date` | The date and time the Data Lake Volume was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z} |
| `timeUpdated` | `Date` | The date and time the Data Lake Volume was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z} |
| `createdBy` | `string` | The ID of the user that created the volume. |
| `updatedBy` | `string` | The ID of the user that last updated the volume |
| `catalogName` | `string` | The name of the catalog to which this volume belongs. |
| `schemaName` | `string` | The name of the schema to which this volume belongs. |
| `fullName` | `string` | The fully qualified name of this volume. |
| `volumeType` | `Volume.VolumeType` | The type of volume. |
| `storageLocation` | `string` | The storage location of the external volume. Only applicable for external volumes. |
| `lifecycleState` | `Volume.LifecycleState` | The lifecycle state of the volume. The volume is ready for use in ACTIVE state |
| `lifecycleStateDetails` | `string` | Additional details associated with the lifecycle state. |
| `systemTags` | `{ [key: string]: { [key: string]: any` | System tags for this resource. Each key is predefined and scoped to a namespace. <p> Example: {@code {\"orcl-cloud\": {\"free-tier-retained\": \"true\"}}} |
**Return:** [Back to Volume (VolumeClient)](#client-volumeclient) • [Top](#top)


### <a id="operation-volumeclient-uploadfile"></a>`uploadFile`
**Description:** Uploads a file to volume. If the file already exists, it is updated.

**Request Interface:** `requests.UploadFileRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `volumeKey` | `string` | The key of the volume. |
| `uploadFileDetails` | `Uint8Array | Buffer | Blob | stream.Readable | ReadableStream | string` | Contents of the file to upload. |
| `path` | `string` | The absolute path of the file or folder |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `isOverwrite` | `boolean` | A boolean which decides if overwrite is allowed |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |
| `isUploadFileBase64Encoded` | `boolean` | A flag to identify if the upload file is base64 encoded |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.UploadFileResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `location` | `string` | URL for the uploaded volume file. |
| `contentLocation` | `string` | Same as location. |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Volume (VolumeClient)](#client-volumeclient) • [Top](#top)


### <a id="operation-volumeclient-uploadfilewithpar"></a>`uploadFileWithPar`
**Description:** Uploads a volume file by generating PAR. If file exists, then it will be updated.

**Request Interface:** `requests.UploadFileWithParRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `volumeKey` | `string` | The key of the volume. |
| `uploadFileWithParDetails` | `model.UploadFileWithParDetails` | Contents of the file to upload. |
| `path` | `string` | The absolute path of the file or folder |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `isOverwrite` | `boolean` | A boolean which decides if overwrite is allowed |
| `shouldGenerateNewPar` | `boolean` | Flag to toggle to generate short living par |
| `shouldCreateRecursively` | `boolean` | A boolean which decides if parent directories should be created recursively during upload. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.UploadFileWithParResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `location` | `string` | URL for the uploaded volume file. |
| `contentLocation` | `string` | Same as location. |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `uploadFileWithParResult` | `model.UploadFileWithParResult` | The returned model.UploadFileWithParResult instance. |

**Payload `UploadFileWithParResult` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `parUrl` | `string` | String representing the PAR URL. |
| `eTag` | `string` | Etag after creating or closing a file. |
| `locationUri` | `string` | The object storage URI which has bucket and namespace information. |
| `size` | `number` | File size in bytes. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `createdBy` | `string` | The user who created the file. |
| `updatedBy` | `string` | The user who last updated the file. |
| `createdTime` | `string` | The time at which the file was created. |
| `updatedTime` | `string` | The last modified time of the file. |
| `description` | `string` | The file description. |
| `systemTags` | `{ [key: string]: { [key: string]: any` | System tags for this resource. Each key is predefined and scoped to a namespace. <p> Example: {@code {\"orcl-cloud\": {\"free-tier-retained\": \"true\"}}} |
**Return:** [Back to Volume (VolumeClient)](#client-volumeclient) • [Top](#top)


## <a id="client-workflowclient"></a>WorkflowClient
**Operations:**
- [`cancelJobRun`](#operation-workflowclient-canceljobrun)
- [`cancelJobRuns`](#operation-workflowclient-canceljobruns)
- [`createJob`](#operation-workflowclient-createjob)
- [`createJobRun`](#operation-workflowclient-createjobrun)
- [`deleteJob`](#operation-workflowclient-deletejob)
- [`deleteJobRun`](#operation-workflowclient-deletejobrun)
- [`exportTaskRunOutput`](#operation-workflowclient-exporttaskrunoutput)
- [`fetchOutput`](#operation-workflowclient-fetchoutput)
- [`getJob`](#operation-workflowclient-getjob)
- [`getJobRun`](#operation-workflowclient-getjobrun)
- [`getTaskRun`](#operation-workflowclient-gettaskrun)
- [`listJobPermissions`](#operation-workflowclient-listjobpermissions)
- [`listJobRuns`](#operation-workflowclient-listjobruns)
- [`listJobs`](#operation-workflowclient-listjobs)
- [`listRecentJobRuns`](#operation-workflowclient-listrecentjobruns)
- [`listTaskRuns`](#operation-workflowclient-listtaskruns)
- [`manageJobPermission`](#operation-workflowclient-managejobpermission)
- [`repairJobRun`](#operation-workflowclient-repairjobrun)
- [`updateJob`](#operation-workflowclient-updatejob)

### <a id="operation-workflowclient-canceljobrun"></a>`cancelJobRun`
**Description:** Cancels a job run.

**Request Interface:** `requests.CancelJobRunRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `jobRunKey` | `string` | Job run key. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.CancelJobRunResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `location` | `string` | URL for the created job run. The job run key is generated after this request is sent. |
| `contentLocation` | `string` | Same as location. |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcWorkRequestId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `jobRun` | `model.JobRun` | The returned model.JobRun instance. |

**Payload `JobRun` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | The OCID of the job. |
| `name` | `string` | A user-friendly name. Does not have to be unique, and is changeable. |
| `jobKey` | `string` | The OCID of the job. |
| `jobName` | `string` | A user-friendly name. Does not have to be unique, and is changeable. |
| `parentJobRunKey` | `string` | The OCID of the job. |
| `rootJobRunKey` | `string` | The OCID of the job. |
| `parentTaskRunKey` | `string` | The OCID of the task run. |
| `tasks` | `Array<model.Task>` | List of tasks in a job. |
| `createdBy` | `string` | The OCID of the IAM user. |
| `createdByName` | `string` | Name of the user who created this record |
| `maxConcurrentRuns` | `number` | Indicates the number of executions for the same job that can be run concurrently. The maximum value cannot exceed 1000. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `originalAttemptRunId` | `string` | The OCID of the job. |
| `parameters` | `Array<model.Parameter>` | An optional list of parameters. |
| `unifiedJobAndJobRunParameters` | `Array<model.Parameter>` | Unified List of job and job run parameters after resolving dynamic value references and parameter resolution as per precedence. |
| `repairHistory` | `Array<model.RepairHistory>` | Array of repaired runs. |
| `systemParameters` | `{ [key: string]: string` | Map of system parameters with their values for this job run. |
| `startTime` | `number` | The time at which the job execution started in epoch milliseconds. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `endTime` | `number` | The time at which the job execution started in epoch milliseconds. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `setupDuration` | `number` | The time (in milliseconds) taken to setup the cluster. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `executionDuration` | `number` | The time (in milliseconds) taken to complete the job execution. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `cleanupDuration` | `number` | The time (in milliseconds) taken to terminate the cluster and to clean up any associated artifacts. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `runDuration` | `number` | The time (in milliseconds) taken to complete the job execution and all its repairs to finish. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `timeCreated` | `Date` | The time at which the job execution started. |
| `timeUpdated` | `Date` | The time at which the job execution was updated. |
| `launched` | `JobRun.Launched` | Identify job run launched by schedule or manually. |
| `version` | `number` | Current version of job run object in repository. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `taskToTaskRunMap` | `{ [key: string]: string` | Task to TaskRun map for given job run. |
| `taskRunSummaryMap` | `{ [key: string]: any` | TaskRun to TaskRunSummary map for given job run. |
| `timeoutSeconds` | `number` | An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `repairedTasks` | `Array<string>` | A list of repaired tasks. |
| `repairMode` | `JobRun.RepairMode` | Repair mode to be used for this repair scope. |
| `lifecycleStates` | `Array<model.LifecycleState>` | The collection of lifecycle states. |
| `runAs` | `string` | This points to the user or service account executing the job. |
**Return:** [Back to Workflow (WorkflowClient)](#client-workflowclient) • [Top](#top)


### <a id="operation-workflowclient-canceljobruns"></a>`cancelJobRuns`
**Description:** Cancels all job runs for a given job.

**Request Interface:** `requests.CancelJobRunsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `jobKey` | `string` | Job key. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |

**Response Interface:** `responses.CancelJobRunsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcWorkRequestId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Workflow (WorkflowClient)](#client-workflowclient) • [Top](#top)


### <a id="operation-workflowclient-createjob"></a>`createJob`
**Description:** Creates a job.

**Request Interface:** `requests.CreateJobRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `createJobDetails` | `model.CreateJobDetails` | Details for the new job. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.CreateJobResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `location` | `string` | URL for the created job. The job key is generated after this request is sent. |
| `contentLocation` | `string` | Same as location. |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcWorkRequestId` | `string` | The OCID of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `job` | `model.Job` | The returned model.Job instance. |

**Payload `Job` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | The OCID of the job. |
| `createdBy` | `string` | The OCID of the IAM user. |
| `createdByName` | `string` | Name of the user who created this record |
| `updatedBy` | `string` | The username of the latest updater. The OCID of the IAM user. |
| `updatedByName` | `string` | Name of the user who updated this record. |
| `runAs` | `string` | This points to the user or service account executing the job. |
| `name` | `string` | A user-friendly name. Does not have to be unique, and is changeable. |
| `description` | `string` | A description for the job. |
| `maxConcurrentRuns` | `number` | Indicates the number of executions for the same job that can be run concurrently. The maximum value cannot exceed 1000. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `path` | `string` | The path to store the job definition in. |
| `jobClusters` | `Array<model.JobCluster>` | List of job cluster configurations. |
| `tasks` | `Array<model.Task>` | List of tasks in a job. |
| `timeCreated` | `Date` | The date and time the DataLake was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2025-05-25T21:10:29.600Z} |
| `timeUpdated` | `Date` | The date and time the DataLake was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2025-05-25T21:10:29.600Z} |
| `parameters` | `Array<model.Parameter>` | An optional list of parameters. |
| `timeoutSeconds` | `number` | An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
**Return:** [Back to Workflow (WorkflowClient)](#client-workflowclient) • [Top](#top)


### <a id="operation-workflowclient-createjobrun"></a>`createJobRun`
**Description:** Creates a job run.

**Request Interface:** `requests.CreateJobRunRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `createJobRunDetails` | `model.CreateJobRunDetails` | Details for the new job run. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.CreateJobRunResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `location` | `string` | URL for the created job run. The job run key is generated after this request is sent. |
| `contentLocation` | `string` | Same as location. |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcWorkRequestId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `jobRun` | `model.JobRun` | The returned model.JobRun instance. |

**Payload `JobRun` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | The OCID of the job. |
| `name` | `string` | A user-friendly name. Does not have to be unique, and is changeable. |
| `jobKey` | `string` | The OCID of the job. |
| `jobName` | `string` | A user-friendly name. Does not have to be unique, and is changeable. |
| `parentJobRunKey` | `string` | The OCID of the job. |
| `rootJobRunKey` | `string` | The OCID of the job. |
| `parentTaskRunKey` | `string` | The OCID of the task run. |
| `tasks` | `Array<model.Task>` | List of tasks in a job. |
| `createdBy` | `string` | The OCID of the IAM user. |
| `createdByName` | `string` | Name of the user who created this record |
| `maxConcurrentRuns` | `number` | Indicates the number of executions for the same job that can be run concurrently. The maximum value cannot exceed 1000. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `originalAttemptRunId` | `string` | The OCID of the job. |
| `parameters` | `Array<model.Parameter>` | An optional list of parameters. |
| `unifiedJobAndJobRunParameters` | `Array<model.Parameter>` | Unified List of job and job run parameters after resolving dynamic value references and parameter resolution as per precedence. |
| `repairHistory` | `Array<model.RepairHistory>` | Array of repaired runs. |
| `systemParameters` | `{ [key: string]: string` | Map of system parameters with their values for this job run. |
| `startTime` | `number` | The time at which the job execution started in epoch milliseconds. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `endTime` | `number` | The time at which the job execution started in epoch milliseconds. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `setupDuration` | `number` | The time (in milliseconds) taken to setup the cluster. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `executionDuration` | `number` | The time (in milliseconds) taken to complete the job execution. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `cleanupDuration` | `number` | The time (in milliseconds) taken to terminate the cluster and to clean up any associated artifacts. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `runDuration` | `number` | The time (in milliseconds) taken to complete the job execution and all its repairs to finish. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `timeCreated` | `Date` | The time at which the job execution started. |
| `timeUpdated` | `Date` | The time at which the job execution was updated. |
| `launched` | `JobRun.Launched` | Identify job run launched by schedule or manually. |
| `version` | `number` | Current version of job run object in repository. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `taskToTaskRunMap` | `{ [key: string]: string` | Task to TaskRun map for given job run. |
| `taskRunSummaryMap` | `{ [key: string]: any` | TaskRun to TaskRunSummary map for given job run. |
| `timeoutSeconds` | `number` | An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `repairedTasks` | `Array<string>` | A list of repaired tasks. |
| `repairMode` | `JobRun.RepairMode` | Repair mode to be used for this repair scope. |
| `lifecycleStates` | `Array<model.LifecycleState>` | The collection of lifecycle states. |
| `runAs` | `string` | This points to the user or service account executing the job. |
**Return:** [Back to Workflow (WorkflowClient)](#client-workflowclient) • [Top](#top)


### <a id="operation-workflowclient-deletejob"></a>`deleteJob`
**Description:** Deletes a job.

**Request Interface:** `requests.DeleteJobRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `jobKey` | `string` | Job key. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.DeleteJobResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Workflow (WorkflowClient)](#client-workflowclient) • [Top](#top)


### <a id="operation-workflowclient-deletejobrun"></a>`deleteJobRun`
**Description:** Deletes a job run.

**Request Interface:** `requests.DeleteJobRunRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `jobRunKey` | `string` | Job run key. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.DeleteJobRunResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Workflow (WorkflowClient)](#client-workflowclient) • [Top](#top)


### <a id="operation-workflowclient-exporttaskrunoutput"></a>`exportTaskRunOutput`
**Description:** Exports task run output in HTML or ipynb format.

**Request Interface:** `requests.ExportTaskRunOutputRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `taskRunKey` | `string` | Task run key. |
| `taskRunOutputKey` | `string` | Task run output key. |
| `exportTaskRunOutputDetails` | `model.ExportTaskRunOutputDetails` | Payload to export task run output to a file. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ExportTaskRunOutputResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `exportedTaskRunOutputContents` | `model.ExportedTaskRunOutputContents` | The returned model.ExportedTaskRunOutputContents instance. |

**Payload `ExportedTaskRunOutputContents` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `name` | `string` | Name of file, equivalent to the last part of the path. |
| `path` | `string` | Full path of the file. |
| `content` | `any` | For ipynb format, this contains a string representing the .ipynb file. For HTML format, this contains a string representing the HTML page. It has base64-encoded data for images. |
| `format` | `ExportedTaskRunOutputContents.Format` | Format of content as requested by the client. HTML format by default. |
**Return:** [Back to Workflow (WorkflowClient)](#client-workflowclient) • [Top](#top)


### <a id="operation-workflowclient-fetchoutput"></a>`fetchOutput`
**Description:** Fetches the task run output from the runtime engine.

**Request Interface:** `requests.FetchOutputRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `taskRunKey` | `string` | Task run key. |
| `fetchOutputDetails` | `model.FetchOutputDetails` | Details for task run output retrieval. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |

**Response Interface:** `responses.FetchOutputResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `taskRunOutput` | `model.TaskRunOutput` | The returned model.TaskRunOutput instance. |

**Payload `TaskRunOutput` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | A unique identifier for the output. |
| `taskType` | `TaskRunOutput.TaskType` | The type of the task. |
| `isTruncated` | `boolean` | True if logs are truncated. |
| `errorTrace` | `string` | If there was an error executing the run, this field contains any available stack traces. |
| `data` | `Array<model.RunOutputData>` | Array of output objects. |
| `outputParameters` | `Array<model.OutputParameter>` | List of output parameters with name and values. |
| `version` | `number` | Current version of job run object in repository. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
**Return:** [Back to Workflow (WorkflowClient)](#client-workflowclient) • [Top](#top)


### <a id="operation-workflowclient-getjob"></a>`getJob`
**Description:** Returns detailed information about a given job.

**Request Interface:** `requests.GetJobRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `jobKey` | `string` | Job key. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.GetJobResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `job` | `model.Job` | The returned model.Job instance. |

**Payload `Job` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | The OCID of the job. |
| `createdBy` | `string` | The OCID of the IAM user. |
| `createdByName` | `string` | Name of the user who created this record |
| `updatedBy` | `string` | The username of the latest updater. The OCID of the IAM user. |
| `updatedByName` | `string` | Name of the user who updated this record. |
| `runAs` | `string` | This points to the user or service account executing the job. |
| `name` | `string` | A user-friendly name. Does not have to be unique, and is changeable. |
| `description` | `string` | A description for the job. |
| `maxConcurrentRuns` | `number` | Indicates the number of executions for the same job that can be run concurrently. The maximum value cannot exceed 1000. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `path` | `string` | The path to store the job definition in. |
| `jobClusters` | `Array<model.JobCluster>` | List of job cluster configurations. |
| `tasks` | `Array<model.Task>` | List of tasks in a job. |
| `timeCreated` | `Date` | The date and time the DataLake was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2025-05-25T21:10:29.600Z} |
| `timeUpdated` | `Date` | The date and time the DataLake was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2025-05-25T21:10:29.600Z} |
| `parameters` | `Array<model.Parameter>` | An optional list of parameters. |
| `timeoutSeconds` | `number` | An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
**Return:** [Back to Workflow (WorkflowClient)](#client-workflowclient) • [Top](#top)


### <a id="operation-workflowclient-getjobrun"></a>`getJobRun`
**Description:** Returns detailed information about a given job run.

**Request Interface:** `requests.GetJobRunRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `jobRunKey` | `string` | Job run key. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldIncludeTaskRunSummaries` | `boolean` | A flag to identify if task run summaries should be included in the job run response. If omitted, the service applies its configured default behavior. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.GetJobRunResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `jobRun` | `model.JobRun` | The returned model.JobRun instance. |

**Payload `JobRun` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | The OCID of the job. |
| `name` | `string` | A user-friendly name. Does not have to be unique, and is changeable. |
| `jobKey` | `string` | The OCID of the job. |
| `jobName` | `string` | A user-friendly name. Does not have to be unique, and is changeable. |
| `parentJobRunKey` | `string` | The OCID of the job. |
| `rootJobRunKey` | `string` | The OCID of the job. |
| `parentTaskRunKey` | `string` | The OCID of the task run. |
| `tasks` | `Array<model.Task>` | List of tasks in a job. |
| `createdBy` | `string` | The OCID of the IAM user. |
| `createdByName` | `string` | Name of the user who created this record |
| `maxConcurrentRuns` | `number` | Indicates the number of executions for the same job that can be run concurrently. The maximum value cannot exceed 1000. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `originalAttemptRunId` | `string` | The OCID of the job. |
| `parameters` | `Array<model.Parameter>` | An optional list of parameters. |
| `unifiedJobAndJobRunParameters` | `Array<model.Parameter>` | Unified List of job and job run parameters after resolving dynamic value references and parameter resolution as per precedence. |
| `repairHistory` | `Array<model.RepairHistory>` | Array of repaired runs. |
| `systemParameters` | `{ [key: string]: string` | Map of system parameters with their values for this job run. |
| `startTime` | `number` | The time at which the job execution started in epoch milliseconds. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `endTime` | `number` | The time at which the job execution started in epoch milliseconds. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `setupDuration` | `number` | The time (in milliseconds) taken to setup the cluster. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `executionDuration` | `number` | The time (in milliseconds) taken to complete the job execution. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `cleanupDuration` | `number` | The time (in milliseconds) taken to terminate the cluster and to clean up any associated artifacts. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `runDuration` | `number` | The time (in milliseconds) taken to complete the job execution and all its repairs to finish. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `timeCreated` | `Date` | The time at which the job execution started. |
| `timeUpdated` | `Date` | The time at which the job execution was updated. |
| `launched` | `JobRun.Launched` | Identify job run launched by schedule or manually. |
| `version` | `number` | Current version of job run object in repository. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `taskToTaskRunMap` | `{ [key: string]: string` | Task to TaskRun map for given job run. |
| `taskRunSummaryMap` | `{ [key: string]: any` | TaskRun to TaskRunSummary map for given job run. |
| `timeoutSeconds` | `number` | An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `repairedTasks` | `Array<string>` | A list of repaired tasks. |
| `repairMode` | `JobRun.RepairMode` | Repair mode to be used for this repair scope. |
| `lifecycleStates` | `Array<model.LifecycleState>` | The collection of lifecycle states. |
| `runAs` | `string` | This points to the user or service account executing the job. |
**Return:** [Back to Workflow (WorkflowClient)](#client-workflowclient) • [Top](#top)


### <a id="operation-workflowclient-gettaskrun"></a>`getTaskRun`
**Description:** Returns detailed information about a task run with a given task run key.

**Request Interface:** `requests.GetTaskRunRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `taskRunKey` | `string` | Task run key. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.GetTaskRunResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `taskRun` | `model.TaskRun` | The returned model.TaskRun instance. |

**Payload `TaskRun` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | The OCID of the task run. |
| `name` | `string` | A user-friendly name. Does not have to be unique, and is changeable. |
| `taskKey` | `string` | The display name of the task. User can specify a value for this. |
| `jobKey` | `string` | The OCID of the job. |
| `jobRunKey` | `string` | The OCID of the job. |
| `parentJobRunKey` | `string` | The OCID of the job. |
| `rootJobRunKey` | `string` | The OCID of the job. |
| `clusterValidationStartTime` | `number` | The time at which the cluster validation started in epoch milliseconds. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `startTime` | `number` | The time at which the job execution started in epoch milliseconds. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `endTime` | `number` | The time at which the job execution started in epoch milliseconds. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `setupDuration` | `number` | The time (in milliseconds) taken to setup the cluster. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `executionDuration` | `number` | The time (in milliseconds) taken to complete the job execution. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `cleanupDuration` | `number` | The time (in milliseconds) taken to terminate the cluster and to clean up any associated artifacts. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `version` | `number` | Current version of job run object in repository. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `retryAttempt` | `number` | Sequence number of the current retry attempt. 0 for the original. 1, 2, 3, ... for subsequent retry attempts. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `retries` | `Array<model.TaskRunRetry>` | List of task retries. |
| `outputKey` | `string` | A unique identifier for the output. |
| `externalId` | `string` | The external ID of the task execution. |
| `systemParameters` | `{ [key: string]: string` | Map of system parameters with their values for this job run. |
| `parameters` | `Array<model.Parameter>` | An optional list of parameters. |
| `lifecycleStates` | `Array<model.LifecycleState>` | The collection of lifecycle states. |
**Return:** [Back to Workflow (WorkflowClient)](#client-workflowclient) • [Top](#top)


### <a id="operation-workflowclient-listjobpermissions"></a>`listJobPermissions`
**Description:** Returns a list of job permissions.

**Request Interface:** `requests.ListJobPermissionsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `jobKey` | `string` | Job key. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListJobPermissionsRequest.SortBy` | The field to sort by. You can provide only one sort order. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ListJobPermissionsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `jobPermissionCollection` | `model.JobPermissionCollection` | The returned model.JobPermissionCollection instance. |

**Payload `JobPermissionCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.JobPermissionSummary>` | List of job permissions. |
**Return:** [Back to Workflow (WorkflowClient)](#client-workflowclient) • [Top](#top)


### <a id="operation-workflowclient-listjobruns"></a>`listJobRuns`
**Description:** Returns a detailed list of job runs.

**Request Interface:** `requests.ListJobRunsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `displayName` | `string` | A filter to return only resources that match the given display name exactly. |
| `jobKey` | `Array<string>` | The field to filter based on job key. |
| `status` | `Array<ListJobRunsRequest.Status>` | The field to filter based on state. |
| `timeCreatedGreaterThanOrEqualTo` | `Date` | Fetch objects from repository that were created after or at the exact timestamp provided in parameter |
| `timeCreatedLessThanOrEqualTo` | `Date` | Fetch objects from repository that were created before or at the exact timestamp provided in parameter. |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated List call. |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListJobRunsRequest.SortBy` | The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ListJobRunsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `opcPrevPage` | `string` | For list pagination. When this header appears in the response, previous pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `jobRunCollection` | `model.JobRunCollection` | The returned model.JobRunCollection instance. |

**Payload `JobRunCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.JobRunSummary>` | List of job runs. |
**Return:** [Back to Workflow (WorkflowClient)](#client-workflowclient) • [Top](#top)


### <a id="operation-workflowclient-listjobs"></a>`listJobs`
**Description:** Returns a list of jobs.

**Request Interface:** `requests.ListJobsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `displayName` | `string` | A filter to return only resources that match the given display name exactly. |
| `jobKey` | `Array<string>` | The field to filter based on job key. |
| `displayNameContains` | `string` | A filter to return only resources that have a display name containing the text provided. |
| `path` | `string` | The fully qualified path where the job is stored. |
| `createdBy` | `string` | A filter to return only resources that are created by given user with username that matches exactly. |
| `updatedBy` | `string` | A filter to return only resources that was last updated by given user with username that matches exactly. |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListJobsRequest.SortBy` | The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ListJobsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items. |
| `opcPrevPage` | `string` | For list pagination. When this header appears in the response, previous pages of results remain. |
| `opcTotalItems` | `number` | For list pagination. This header provides total number of items available. |
| `jobCollection` | `model.JobCollection` | The returned model.JobCollection instance. |

**Payload `JobCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.JobSummary>` | List of jobs. |
**Return:** [Back to Workflow (WorkflowClient)](#client-workflowclient) • [Top](#top)


### <a id="operation-workflowclient-listrecentjobruns"></a>`listRecentJobRuns`
**Description:** Returns a list of the latest job runs for a given job key.

**Request Interface:** `requests.ListRecentJobRunsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `jobKey` | `Array<string>` | The field to filter based on job key. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `recordCount` | `number` | The number of records to fetch. |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated List call. |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListRecentJobRunsRequest.SortBy` | The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ListRecentJobRunsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `jobRunCollection` | `model.JobRunCollection` | The returned model.JobRunCollection instance. |

**Payload `JobRunCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.JobRunSummary>` | List of job runs. |
**Return:** [Back to Workflow (WorkflowClient)](#client-workflowclient) • [Top](#top)


### <a id="operation-workflowclient-listtaskruns"></a>`listTaskRuns`
**Description:** Returns a list of task runs.

**Request Interface:** `requests.ListTaskRunsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `jobRunKey` | `string` | The field to filter based on job run key. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `displayName` | `string` | A filter to return only resources that match the given display name exactly. |
| `status` | `Array<ListTaskRunsRequest.Status>` | The field to filter based on state. |
| `parentJobRunKey` | `string` | The field to filter based on parent job run key. |
| `rootJobRunKey` | `string` | The field to filter based on root job run key. |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListTaskRunsRequest.SortBy` | The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ListTaskRunsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `opcPrevPage` | `string` | For list pagination. When this header appears in the response, previous pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `taskRunCollection` | `model.TaskRunCollection` | The returned model.TaskRunCollection instance. |

**Payload `TaskRunCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.TaskRunSummary>` | List of TaskRuns. |
**Return:** [Back to Workflow (WorkflowClient)](#client-workflowclient) • [Top](#top)


### <a id="operation-workflowclient-managejobpermission"></a>`manageJobPermission`
**Description:** Update job permissions with the provided details.

**Request Interface:** `requests.ManageJobPermissionRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `jobKey` | `string` | Job key. |
| `manageJobPermissionDetails` | `model.ManageJobPermissionDetails` | The information to be updated. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ManageJobPermissionResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Workflow (WorkflowClient)](#client-workflowclient) • [Top](#top)


### <a id="operation-workflowclient-repairjobrun"></a>`repairJobRun`
**Description:** Repairs and reruns a job run.

**Request Interface:** `requests.RepairJobRunRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `jobRunKey` | `string` | Job run key. |
| `repairJobRunDetails` | `model.RepairJobRunDetails` | Details of the job run to be repaired. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.RepairJobRunResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `location` | `string` | URL for the created/repaired job run. The job run key is generated after this request is sent. |
| `contentLocation` | `string` | Same as location. |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcWorkRequestId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `jobRun` | `model.JobRun` | The returned model.JobRun instance. |

**Payload `JobRun` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | The OCID of the job. |
| `name` | `string` | A user-friendly name. Does not have to be unique, and is changeable. |
| `jobKey` | `string` | The OCID of the job. |
| `jobName` | `string` | A user-friendly name. Does not have to be unique, and is changeable. |
| `parentJobRunKey` | `string` | The OCID of the job. |
| `rootJobRunKey` | `string` | The OCID of the job. |
| `parentTaskRunKey` | `string` | The OCID of the task run. |
| `tasks` | `Array<model.Task>` | List of tasks in a job. |
| `createdBy` | `string` | The OCID of the IAM user. |
| `createdByName` | `string` | Name of the user who created this record |
| `maxConcurrentRuns` | `number` | Indicates the number of executions for the same job that can be run concurrently. The maximum value cannot exceed 1000. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `originalAttemptRunId` | `string` | The OCID of the job. |
| `parameters` | `Array<model.Parameter>` | An optional list of parameters. |
| `unifiedJobAndJobRunParameters` | `Array<model.Parameter>` | Unified List of job and job run parameters after resolving dynamic value references and parameter resolution as per precedence. |
| `repairHistory` | `Array<model.RepairHistory>` | Array of repaired runs. |
| `systemParameters` | `{ [key: string]: string` | Map of system parameters with their values for this job run. |
| `startTime` | `number` | The time at which the job execution started in epoch milliseconds. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `endTime` | `number` | The time at which the job execution started in epoch milliseconds. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `setupDuration` | `number` | The time (in milliseconds) taken to setup the cluster. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `executionDuration` | `number` | The time (in milliseconds) taken to complete the job execution. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `cleanupDuration` | `number` | The time (in milliseconds) taken to terminate the cluster and to clean up any associated artifacts. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `runDuration` | `number` | The time (in milliseconds) taken to complete the job execution and all its repairs to finish. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `timeCreated` | `Date` | The time at which the job execution started. |
| `timeUpdated` | `Date` | The time at which the job execution was updated. |
| `launched` | `JobRun.Launched` | Identify job run launched by schedule or manually. |
| `version` | `number` | Current version of job run object in repository. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `taskToTaskRunMap` | `{ [key: string]: string` | Task to TaskRun map for given job run. |
| `taskRunSummaryMap` | `{ [key: string]: any` | TaskRun to TaskRunSummary map for given job run. |
| `timeoutSeconds` | `number` | An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `repairedTasks` | `Array<string>` | A list of repaired tasks. |
| `repairMode` | `JobRun.RepairMode` | Repair mode to be used for this repair scope. |
| `lifecycleStates` | `Array<model.LifecycleState>` | The collection of lifecycle states. |
| `runAs` | `string` | This points to the user or service account executing the job. |
**Return:** [Back to Workflow (WorkflowClient)](#client-workflowclient) • [Top](#top)


### <a id="operation-workflowclient-updatejob"></a>`updateJob`
**Description:** Updates details for a job.

**Request Interface:** `requests.UpdateJobRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `jobKey` | `string` | Job key. |
| `updateJobDetails` | `model.UpdateJobDetails` | The information to be updated. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.UpdateJobResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `job` | `model.Job` | The returned model.Job instance. |

**Payload `Job` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | The OCID of the job. |
| `createdBy` | `string` | The OCID of the IAM user. |
| `createdByName` | `string` | Name of the user who created this record |
| `updatedBy` | `string` | The username of the latest updater. The OCID of the IAM user. |
| `updatedByName` | `string` | Name of the user who updated this record. |
| `runAs` | `string` | This points to the user or service account executing the job. |
| `name` | `string` | A user-friendly name. Does not have to be unique, and is changeable. |
| `description` | `string` | A description for the job. |
| `maxConcurrentRuns` | `number` | Indicates the number of executions for the same job that can be run concurrently. The maximum value cannot exceed 1000. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `path` | `string` | The path to store the job definition in. |
| `jobClusters` | `Array<model.JobCluster>` | List of job cluster configurations. |
| `tasks` | `Array<model.Task>` | List of tasks in a job. |
| `timeCreated` | `Date` | The date and time the DataLake was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2025-05-25T21:10:29.600Z} |
| `timeUpdated` | `Date` | The date and time the DataLake was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2025-05-25T21:10:29.600Z} |
| `parameters` | `Array<model.Parameter>` | An optional list of parameters. |
| `timeoutSeconds` | `number` | An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
**Return:** [Back to Workflow (WorkflowClient)](#client-workflowclient) • [Top](#top)


## <a id="client-workspaceclient"></a>WorkspaceClient
**Operations:**
- [`createGitFolder`](#operation-workspaceclient-creategitfolder)
- [`createWorkspace`](#operation-workspaceclient-createworkspace)
- [`deleteWorkspace`](#operation-workspaceclient-deleteworkspace)
- [`getWorkspace`](#operation-workspaceclient-getworkspace)
- [`listCreateWorkspacePermissions`](#operation-workspaceclient-listcreateworkspacepermissions)
- [`listWorkspacePermissions`](#operation-workspaceclient-listworkspacepermissions)
- [`listWorkspaces`](#operation-workspaceclient-listworkspaces)
- [`manageCreateWorkspacePermission`](#operation-workspaceclient-managecreateworkspacepermission)
- [`manageWorkspacePermission`](#operation-workspaceclient-manageworkspacepermission)
- [`updateWorkspace`](#operation-workspaceclient-updateworkspace)
- [`updateWorkspaceAsyncOperationStatus`](#operation-workspaceclient-updateworkspaceasyncoperationstatus)

### <a id="operation-workspaceclient-creategitfolder"></a>`createGitFolder`
**Description:** Creates a git folder in the workspace

**Request Interface:** `requests.CreateGitFolderRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `createGitFolderDetails` | `model.CreateGitFolderDetails` | The information to be updated. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.CreateGitFolderResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `gitFolder` | `model.GitFolder` | The returned model.GitFolder instance. |

**Payload `GitFolder` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `folderPath` | `string` | The absolute path of the Git folder user wants to create. |
| `gitProviderKey` | `string` | key corresponding to Git service provider in git provider table. |
| `gitRepositoryUrl` | `string` | Git repository url used to clone. |
| `description` | `string` | Short description about the git repository. |
| `branchName` | `string` | Git branch name that is cloned. |
| `folderMetadata` | `{ [key: string]: any` | The metadata about the folder, like branchName. |
**Return:** [Back to Workspace (WorkspaceClient)](#client-workspaceclient) • [Top](#top)


### <a id="operation-workspaceclient-createworkspace"></a>`createWorkspace`
**Description:** Creates a workspace.

**Request Interface:** `requests.CreateWorkspaceRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `createWorkspaceDetails` | `model.CreateWorkspaceDetails` | Details for the new workspace. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.CreateWorkspaceResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `location` | `string` | URL for the created workspace. The workspace key is generated after this request is sent. |
| `contentLocation` | `string` | Same as location. |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `workspace` | `model.Workspace` | The returned model.Workspace instance. |

**Payload `Workspace` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | The key of the AI Data Platform Workbench workspace. |
| `displayName` | `string` | A user-friendly name that has to be unique in a AI Data Platform Workbench instance. |
| `description` | `string` | Description of the workspace. |
| `type` | `Workspace.Type` | Workspace type. Type is DEFAULT for workspace created at AI Data Platform Workbench creation, type is USER for workspace created by AI Data Platform Workbench user. |
| `timeCreated` | `Date` | The date and time the AI Data Platform Workbench workspace was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z} |
| `timeUpdated` | `Date` | The date and time the AI Data Platform Workbench workspace was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z} |
| `lifecycleState` | `Workspace.LifecycleState` | The current state of the AI Data Platform Workbench workspace. |
| `lifecycleDetails` | `string` | A message that describes the current state of the workspace in more detail. For example, can be used to provide actionable information for a resource in the Failed state. |
| `systemTags` | `{ [key: string]: { [key: string]: any` | System tags for this resource. Each key is predefined and scoped to a namespace. <p> Example: {@code {\"orcl-cloud\": {\"free-tier-retained\": \"true\"}}} |
| `createdBy` | `string` | OCID of the user who created this record. |
| `createdByName` | `string` | Name of the user who created this record. |
| `updatedBy` | `string` | OCID of the user who updated this record. |
| `updatedByName` | `string` | Name of the user who updated this record. |
| `defaultCatalogKey` | `string` | The key of the catalog to be used as the default catalog for this workspace. A default catalog in the workspace will allow users to use that catalog without the need to refer it in the notebook. For example, if default catalog is iCat1, and it has schema1 and table1, you can refer to the table in a notebook using: schema1.table1. |
| `isPrivateNetworkEnabled` | `boolean` | A flag to display whether workspace is private network enabled or not. |
| `logGroupId` | `string` | The OCID of the log group that contains the logs. This uniquely identifies a collection of logs within OCI Logging Service. |
| `aicUserSchemaName` | `string` | The name of the AIC user schema if created. |
**Return:** [Back to Workspace (WorkspaceClient)](#client-workspaceclient) • [Top](#top)


### <a id="operation-workspaceclient-deleteworkspace"></a>`deleteWorkspace`
**Description:** Deletes a workspace.

**Request Interface:** `requests.DeleteWorkspaceRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `timeDataLakeDeletion` | `Date` | Deletion time in the case that a workspace is deleted during AI Data Platform Workbench deletion. |

**Response Interface:** `responses.DeleteWorkspaceResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Workspace (WorkspaceClient)](#client-workspaceclient) • [Top](#top)


### <a id="operation-workspaceclient-getworkspace"></a>`getWorkspace`
**Description:** Gets detailed information about a workspace.

**Request Interface:** `requests.GetWorkspaceRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.GetWorkspaceResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `workspace` | `model.Workspace` | The returned model.Workspace instance. |

**Payload `Workspace` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | The key of the AI Data Platform Workbench workspace. |
| `displayName` | `string` | A user-friendly name that has to be unique in a AI Data Platform Workbench instance. |
| `description` | `string` | Description of the workspace. |
| `type` | `Workspace.Type` | Workspace type. Type is DEFAULT for workspace created at AI Data Platform Workbench creation, type is USER for workspace created by AI Data Platform Workbench user. |
| `timeCreated` | `Date` | The date and time the AI Data Platform Workbench workspace was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z} |
| `timeUpdated` | `Date` | The date and time the AI Data Platform Workbench workspace was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z} |
| `lifecycleState` | `Workspace.LifecycleState` | The current state of the AI Data Platform Workbench workspace. |
| `lifecycleDetails` | `string` | A message that describes the current state of the workspace in more detail. For example, can be used to provide actionable information for a resource in the Failed state. |
| `systemTags` | `{ [key: string]: { [key: string]: any` | System tags for this resource. Each key is predefined and scoped to a namespace. <p> Example: {@code {\"orcl-cloud\": {\"free-tier-retained\": \"true\"}}} |
| `createdBy` | `string` | OCID of the user who created this record. |
| `createdByName` | `string` | Name of the user who created this record. |
| `updatedBy` | `string` | OCID of the user who updated this record. |
| `updatedByName` | `string` | Name of the user who updated this record. |
| `defaultCatalogKey` | `string` | The key of the catalog to be used as the default catalog for this workspace. A default catalog in the workspace will allow users to use that catalog without the need to refer it in the notebook. For example, if default catalog is iCat1, and it has schema1 and table1, you can refer to the table in a notebook using: schema1.table1. |
| `isPrivateNetworkEnabled` | `boolean` | A flag to display whether workspace is private network enabled or not. |
| `logGroupId` | `string` | The OCID of the log group that contains the logs. This uniquely identifies a collection of logs within OCI Logging Service. |
| `aicUserSchemaName` | `string` | The name of the AIC user schema if created. |
**Return:** [Back to Workspace (WorkspaceClient)](#client-workspaceclient) • [Top](#top)


### <a id="operation-workspaceclient-listcreateworkspacepermissions"></a>`listCreateWorkspacePermissions`
**Description:** Gets a list of create workspace permission summary objects.

**Request Interface:** `requests.ListCreateWorkspacePermissionsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListCreateWorkspacePermissionsRequest.SortBy` | The field to sort by. You can provide only one sort order. Default order for {@code granteeName} is ascending. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ListCreateWorkspacePermissionsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `createWorkspacePermissionCollection` | `model.CreateWorkspacePermissionCollection` | The returned model.CreateWorkspacePermissionCollection instance. |

**Payload `CreateWorkspacePermissionCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.CreateWorkspacePermissionSummary>` | List of Create Workspace permissions. |
**Return:** [Back to Workspace (WorkspaceClient)](#client-workspaceclient) • [Top](#top)


### <a id="operation-workspaceclient-listworkspacepermissions"></a>`listWorkspacePermissions`
**Description:** Gets a list of workspace permissions.

**Request Interface:** `requests.ListWorkspacePermissionsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListWorkspacePermissionsRequest.SortBy` | The field to sort by. You can provide only one sort order. Default order for {@code granteeName} is ascending. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ListWorkspacePermissionsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `workspacePermissionCollection` | `model.WorkspacePermissionCollection` | The returned model.WorkspacePermissionCollection instance. |

**Payload `WorkspacePermissionCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.WorkspacePermissionSummary>` | List of workspace permissions. |
**Return:** [Back to Workspace (WorkspaceClient)](#client-workspaceclient) • [Top](#top)


### <a id="operation-workspaceclient-listworkspaces"></a>`listWorkspaces`
**Description:** Gets a list of workspaces.

**Request Interface:** `requests.ListWorkspacesRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `lifecycleState` | `string` | A filter to return only resources that match the given lifecycle state. The state value is case-insensitive. |
| `displayName` | `string` | A filter to return only resources that match the given display name exactly. |
| `displayNameContains` | `string` | A filter to return only resources that have a display name containing the text provided. |
| `type` | `string` | When no value is provided, all workspaces are returned. Otherwise, workspace of selected value is returned. |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListWorkspacesRequest.SortBy` | The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending. |
| `isPrivateNetworkEnabled` | `boolean` | A flag to filter the workspaces which are private network enabled or disabled |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ListWorkspacesResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `workspaceCollection` | `model.WorkspaceCollection` | The returned model.WorkspaceCollection instance. |

**Payload `WorkspaceCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.WorkspaceSummary>` | List of workspaces. |
**Return:** [Back to Workspace (WorkspaceClient)](#client-workspaceclient) • [Top](#top)


### <a id="operation-workspaceclient-managecreateworkspacepermission"></a>`manageCreateWorkspacePermission`
**Description:** Updates create workspace permissions on a workspace.

**Request Interface:** `requests.ManageCreateWorkspacePermissionRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `manageCreateWorkspacePermissionDetails` | `model.ManageCreateWorkspacePermissionDetails` | The information to be updated. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ManageCreateWorkspacePermissionResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Workspace (WorkspaceClient)](#client-workspaceclient) • [Top](#top)


### <a id="operation-workspaceclient-manageworkspacepermission"></a>`manageWorkspacePermission`
**Description:** Updates permissions on a workspace.

**Request Interface:** `requests.ManageWorkspacePermissionRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `manageWorkspacePermissionDetails` | `model.ManageWorkspacePermissionDetails` | The information to be updated. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ManageWorkspacePermissionResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Workspace (WorkspaceClient)](#client-workspaceclient) • [Top](#top)


### <a id="operation-workspaceclient-updateworkspace"></a>`updateWorkspace`
**Description:** Updates the details of a workspace.

**Request Interface:** `requests.UpdateWorkspaceRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `updateWorkspaceDetails` | `model.UpdateWorkspaceDetails` | The information to be updated. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.UpdateWorkspaceResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aidpAsyncOperationKey` | `string` | The key of the asynchronous operations associated with an AI Data Platform instance. Use GetAsyncOperation with this key to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `workspace` | `model.Workspace` | The returned model.Workspace instance. |

**Payload `Workspace` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | The key of the AI Data Platform Workbench workspace. |
| `displayName` | `string` | A user-friendly name that has to be unique in a AI Data Platform Workbench instance. |
| `description` | `string` | Description of the workspace. |
| `type` | `Workspace.Type` | Workspace type. Type is DEFAULT for workspace created at AI Data Platform Workbench creation, type is USER for workspace created by AI Data Platform Workbench user. |
| `timeCreated` | `Date` | The date and time the AI Data Platform Workbench workspace was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z} |
| `timeUpdated` | `Date` | The date and time the AI Data Platform Workbench workspace was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z} |
| `lifecycleState` | `Workspace.LifecycleState` | The current state of the AI Data Platform Workbench workspace. |
| `lifecycleDetails` | `string` | A message that describes the current state of the workspace in more detail. For example, can be used to provide actionable information for a resource in the Failed state. |
| `systemTags` | `{ [key: string]: { [key: string]: any` | System tags for this resource. Each key is predefined and scoped to a namespace. <p> Example: {@code {\"orcl-cloud\": {\"free-tier-retained\": \"true\"}}} |
| `createdBy` | `string` | OCID of the user who created this record. |
| `createdByName` | `string` | Name of the user who created this record. |
| `updatedBy` | `string` | OCID of the user who updated this record. |
| `updatedByName` | `string` | Name of the user who updated this record. |
| `defaultCatalogKey` | `string` | The key of the catalog to be used as the default catalog for this workspace. A default catalog in the workspace will allow users to use that catalog without the need to refer it in the notebook. For example, if default catalog is iCat1, and it has schema1 and table1, you can refer to the table in a notebook using: schema1.table1. |
| `isPrivateNetworkEnabled` | `boolean` | A flag to display whether workspace is private network enabled or not. |
| `logGroupId` | `string` | The OCID of the log group that contains the logs. This uniquely identifies a collection of logs within OCI Logging Service. |
| `aicUserSchemaName` | `string` | The name of the AIC user schema if created. |
**Return:** [Back to Workspace (WorkspaceClient)](#client-workspaceclient) • [Top](#top)


### <a id="operation-workspaceclient-updateworkspaceasyncoperationstatus"></a>`updateWorkspaceAsyncOperationStatus`
**Description:** Updates the status of a workspace.

**Request Interface:** `requests.UpdateWorkspaceAsyncOperationStatusRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `asyncOperationKey` | `string` | The unique identifier of an async operation |
| `updateWorkspaceAsyncOperationStatusDetails` | `model.UpdateWorkspaceAsyncOperationStatusDetails` | The information to be updated. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.UpdateWorkspaceAsyncOperationStatusResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcWorkRequestId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `workspace` | `model.Workspace` | The returned model.Workspace instance. |

**Payload `Workspace` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `key` | `string` | The key of the AI Data Platform Workbench workspace. |
| `displayName` | `string` | A user-friendly name that has to be unique in a AI Data Platform Workbench instance. |
| `description` | `string` | Description of the workspace. |
| `type` | `Workspace.Type` | Workspace type. Type is DEFAULT for workspace created at AI Data Platform Workbench creation, type is USER for workspace created by AI Data Platform Workbench user. |
| `timeCreated` | `Date` | The date and time the AI Data Platform Workbench workspace was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z} |
| `timeUpdated` | `Date` | The date and time the AI Data Platform Workbench workspace was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z} |
| `lifecycleState` | `Workspace.LifecycleState` | The current state of the AI Data Platform Workbench workspace. |
| `lifecycleDetails` | `string` | A message that describes the current state of the workspace in more detail. For example, can be used to provide actionable information for a resource in the Failed state. |
| `systemTags` | `{ [key: string]: { [key: string]: any` | System tags for this resource. Each key is predefined and scoped to a namespace. <p> Example: {@code {\"orcl-cloud\": {\"free-tier-retained\": \"true\"}}} |
| `createdBy` | `string` | OCID of the user who created this record. |
| `createdByName` | `string` | Name of the user who created this record. |
| `updatedBy` | `string` | OCID of the user who updated this record. |
| `updatedByName` | `string` | Name of the user who updated this record. |
| `defaultCatalogKey` | `string` | The key of the catalog to be used as the default catalog for this workspace. A default catalog in the workspace will allow users to use that catalog without the need to refer it in the notebook. For example, if default catalog is iCat1, and it has schema1 and table1, you can refer to the table in a notebook using: schema1.table1. |
| `isPrivateNetworkEnabled` | `boolean` | A flag to display whether workspace is private network enabled or not. |
| `logGroupId` | `string` | The OCID of the log group that contains the logs. This uniquely identifies a collection of logs within OCI Logging Service. |
| `aicUserSchemaName` | `string` | The name of the AIC user schema if created. |
**Return:** [Back to Workspace (WorkspaceClient)](#client-workspaceclient) • [Top](#top)


## <a id="client-workspaceobjectclient"></a>WorkspaceObjectClient
**Operations:**
- [`copyWorkspaceObject`](#operation-workspaceobjectclient-copyworkspaceobject)
- [`createWorkspaceObject`](#operation-workspaceobjectclient-createworkspaceobject)
- [`deleteWorkspaceObject`](#operation-workspaceobjectclient-deleteworkspaceobject)
- [`downloadWorkspaceObjectWithPar`](#operation-workspaceobjectclient-downloadworkspaceobjectwithpar)
- [`getWorkspaceObject`](#operation-workspaceobjectclient-getworkspaceobject)
- [`headWorkspaceObject`](#operation-workspaceobjectclient-headworkspaceobject)
- [`listWorkspaceObjectPermissions`](#operation-workspaceobjectclient-listworkspaceobjectpermissions)
- [`listWorkspaceObjects`](#operation-workspaceobjectclient-listworkspaceobjects)
- [`manageWorkspaceObjectPermission`](#operation-workspaceobjectclient-manageworkspaceobjectpermission)
- [`moveWorkspaceObject`](#operation-workspaceobjectclient-moveworkspaceobject)
- [`renameWorkspaceObject`](#operation-workspaceobjectclient-renameworkspaceobject)
- [`updateWorkspaceObject`](#operation-workspaceobjectclient-updateworkspaceobject)
- [`uploadWorkspaceObjectWithPar`](#operation-workspaceobjectclient-uploadworkspaceobjectwithpar)

### <a id="operation-workspaceobjectclient-copyworkspaceobject"></a>`copyWorkspaceObject`
**Description:** Copy a workspace object to different location.

**Request Interface:** `requests.CopyWorkspaceObjectRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `copyWorkspaceObjectDetails` | `model.CopyWorkspaceObjectDetails` | Details for copying the workspace object to a different path. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.CopyWorkspaceObjectResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcWorkRequestId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `workspaceObjectDetails` | `model.WorkspaceObjectDetails` | The returned model.WorkspaceObjectDetails instance. |

**Payload `WorkspaceObjectDetails` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `path` | `string` | The fully qualified path of the workspace object. Example: /Shared/Folder1/Notebook1.ipynb |
| `key` | `string` | The key of the Workspace Object. |
| `displayName` | `string` | The name of the Workspace Object. This will be the name of the file/folder in the workspace. Example: Notebook1.ipynb, Folder1 |
| `timeCreated` | `Date` | The date and time the workspace object was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z} |
| `timeUpdated` | `Date` | The date and time the workspace object was last updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z} |
| `type` | `WorkspaceObjectDetails.Type` | The type of the workspace object. |
| `description` | `string` | The description for the file and folder. |
| `systemTags` | `{ [key: string]: { [key: string]: any` | System tags for this resource. Each key is predefined and scoped to a namespace. <p> Example: {@code {\"orcl-cloud\": {\"free-tier-retained\": \"true\"}}} |
**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#client-workspaceobjectclient) • [Top](#top)


### <a id="operation-workspaceobjectclient-createworkspaceobject"></a>`createWorkspaceObject`
**Description:** Creates a workspace object. You can create a file or folder in the workspace.

**Request Interface:** `requests.CreateWorkspaceObjectRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `createWorkspaceObjectDetails` | `Uint8Array | Buffer | Blob | stream.Readable | ReadableStream | string` | Details for the new workspace object. |
| `path` | `string` | The absolute path of the file or folder |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `type` | `string` | The type of workspace object. |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |
| `isUploadFileBase64Encoded` | `boolean` | A flag to identify if the upload file is base64 encoded |
| `isOverwrite` | `boolean` | A boolean which decides if overwrite is allowed |
| `objectDescription` | `string` | The description of the workspace object |

**Response Interface:** `responses.CreateWorkspaceObjectResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `location` | `string` | URL for the created workspace object. The workspace object key is generated after this request is sent. |
| `contentLocation` | `string` | Same as location. |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `objectKey` | `string` | Unique key of the object. |
| `path` | `string` | The full path of the object. |
| `type` | `string` | Type of the object |
| `timeUpdated` | `Date` | The date and time when Workspace Object was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z} |
| `value` | `stream.Readable | ReadableStream` | The returned stream.Readable | ReadableStream instance. |
**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#client-workspaceobjectclient) • [Top](#top)


### <a id="operation-workspaceobjectclient-deleteworkspaceobject"></a>`deleteWorkspaceObject`
**Description:** Deletes a workspace object.

**Request Interface:** `requests.DeleteWorkspaceObjectRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `objectPath` | `string` | The fully qualified path of the workspace object. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.DeleteWorkspaceObjectResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcWorkRequestId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#client-workspaceobjectclient) • [Top](#top)


### <a id="operation-workspaceobjectclient-downloadworkspaceobjectwithpar"></a>`downloadWorkspaceObjectWithPar`
**Description:** Downloads a workspace file by providing the PAR info for downloading the file for given path.

**Request Interface:** `requests.DownloadWorkspaceObjectWithParRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `path` | `string` | The absolute path of the file or folder |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `shouldGenerateNewPar` | `boolean` | Flag to toggle to generate short living par |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `type` | `string` | The type of workspace object. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.DownloadWorkspaceObjectWithParResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `objectKey` | `string` | Unique key of the object |
| `path` | `string` | The full path of the object |
| `type` | `string` | Type of the object |
| `timeUpdated` | `Date` | The date and time when Workspace Object was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z} |
| `downloadFileWithParResult` | `model.DownloadFileWithParResult` | The returned model.DownloadFileWithParResult instance. |

**Payload `DownloadFileWithParResult` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `parUrl` | `string` | String representing the PAR URL. |
| `eTag` | `string` | Etag after creating or closing a file. |
| `locationUri` | `string` | The object storage URI which has bucket and namespace information. |
| `size` | `number` | File size in bytes. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `createdBy` | `string` | The user who created the file. |
| `updatedBy` | `string` | The user who last updated the file. |
| `createdTime` | `string` | The time at which the file was created. |
| `updatedTime` | `string` | The last modified time of the file. |
| `description` | `string` | The file description. |
| `systemTags` | `{ [key: string]: { [key: string]: any` | System tags for this resource. Each key is predefined and scoped to a namespace. <p> Example: {@code {\"orcl-cloud\": {\"free-tier-retained\": \"true\"}}} |
**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#client-workspaceobjectclient) • [Top](#top)


### <a id="operation-workspaceobjectclient-getworkspaceobject"></a>`getWorkspaceObject`
**Description:** Returns detailed information about a workspace object.

**Request Interface:** `requests.GetWorkspaceObjectRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `objectPath` | `string` | The fully qualified path of the workspace object. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `shouldIncludeMetadata` | `boolean` | Path to list all metadata for a file or folder. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.GetWorkspaceObjectResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `objectKey` | `string` | Unique key of the object. |
| `path` | `string` | The full path of the object. |
| `type` | `string` | Type of the object |
| `timeUpdated` | `Date` | The date and time when Workspace Object was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z} |
| `value` | `stream.Readable | ReadableStream` | The returned stream.Readable | ReadableStream instance. |
**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#client-workspaceobjectclient) • [Top](#top)


### <a id="operation-workspaceobjectclient-headworkspaceobject"></a>`headWorkspaceObject`
**Description:** Returns metadata about a workspace object. The contents of the file are not retrieved.

**Request Interface:** `requests.HeadWorkspaceObjectRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `objectPath` | `string` | The fully qualified path of the workspace object. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `shouldIncludeMetadata` | `boolean` | Path to list all metadata for a file or folder. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.HeadWorkspaceObjectResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `objectKey` | `string` | Unique key of the object. |
| `path` | `string` | The full path of the object. |
| `type` | `string` | Type of the object |
| `timeUpdated` | `Date` | The date and time when Workspace Object was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z} |
| `fileMetadata` | `string` | File metadata of the file. |
| `compositeEtag` | `string` | The file composite (data + metadata) etag. |
**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#client-workspaceobjectclient) • [Top](#top)


### <a id="operation-workspaceobjectclient-listworkspaceobjectpermissions"></a>`listWorkspaceObjectPermissions`
**Description:** Returns a list of workspace object permissions.

**Request Interface:** `requests.ListWorkspaceObjectPermissionsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `objectKey` | `string` | The key of the workspace object. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListWorkspaceObjectPermissionsRequest.SortBy` | The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ListWorkspaceObjectPermissionsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `workspaceObjectPermissionCollection` | `model.WorkspaceObjectPermissionCollection` | The returned model.WorkspaceObjectPermissionCollection instance. |

**Payload `WorkspaceObjectPermissionCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.WorkspaceObjectPermissionSummary>` | List of workspace object permissions. |
**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#client-workspaceobjectclient) • [Top](#top)


### <a id="operation-workspaceobjectclient-listworkspaceobjects"></a>`listWorkspaceObjects`
**Description:** Returns a list of objects in the workspace.

**Request Interface:** `requests.ListWorkspaceObjectsRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `path` | `string` | The absolute path of the file or folder |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `type` | `string` | Filter by object type. For example, NOTEBOOK, LIBRARY, or FILE. |
| `displayName` | `string` | A filter to return only resources that match the given display name exactly. |
| `limit` | `number` | For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `metadataKeys` | `string` | Comma separated keys to have in list response. |
| `page` | `string` | For list pagination. The value of the opc-next-page response header from the previous \"List\" call. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `sortOrder` | `model.SortOrder` | The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). |
| `sortBy` | `ListWorkspaceObjectsRequest.SortBy` | The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.ListWorkspaceObjectsResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `opcNextPage` | `string` | For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine). |
| `workspaceObjectCollection` | `model.WorkspaceObjectCollection` | The returned model.WorkspaceObjectCollection instance. |

**Payload `WorkspaceObjectCollection` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `items` | `Array<model.WorkspaceObjectSummary>` | List of workspace objects. |
**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#client-workspaceobjectclient) • [Top](#top)


### <a id="operation-workspaceobjectclient-manageworkspaceobjectpermission"></a>`manageWorkspaceObjectPermission`
**Description:** Updates permissions on a workspace object.

**Request Interface:** `requests.ManageWorkspaceObjectPermissionRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `objectKey` | `string` | The key of the workspace object. |
| `manageWorkspaceObjectPermissionDetails` | `model.ManageWorkspaceObjectPermissionDetails` | The information to be updated. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.ManageWorkspaceObjectPermissionResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#client-workspaceobjectclient) • [Top](#top)


### <a id="operation-workspaceobjectclient-moveworkspaceobject"></a>`moveWorkspaceObject`
**Description:** Moves a workspace object to different location.

**Request Interface:** `requests.MoveWorkspaceObjectRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `moveWorkspaceObjectDetails` | `model.MoveWorkspaceObjectDetails` | Details for moving the workspace object to a different path. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.MoveWorkspaceObjectResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcWorkRequestId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `workspaceObjectDetails` | `model.WorkspaceObjectDetails` | The returned model.WorkspaceObjectDetails instance. |

**Payload `WorkspaceObjectDetails` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `path` | `string` | The fully qualified path of the workspace object. Example: /Shared/Folder1/Notebook1.ipynb |
| `key` | `string` | The key of the Workspace Object. |
| `displayName` | `string` | The name of the Workspace Object. This will be the name of the file/folder in the workspace. Example: Notebook1.ipynb, Folder1 |
| `timeCreated` | `Date` | The date and time the workspace object was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z} |
| `timeUpdated` | `Date` | The date and time the workspace object was last updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z} |
| `type` | `WorkspaceObjectDetails.Type` | The type of the workspace object. |
| `description` | `string` | The description for the file and folder. |
| `systemTags` | `{ [key: string]: { [key: string]: any` | System tags for this resource. Each key is predefined and scoped to a namespace. <p> Example: {@code {\"orcl-cloud\": {\"free-tier-retained\": \"true\"}}} |
**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#client-workspaceobjectclient) • [Top](#top)


### <a id="operation-workspaceobjectclient-renameworkspaceobject"></a>`renameWorkspaceObject`
**Description:** Renames a workspace object.

**Request Interface:** `requests.RenameWorkspaceObjectRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `renameWorkspaceObjectDetails` | `model.RenameWorkspaceObjectDetails` | Details for renaming the workspace object. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |

**Response Interface:** `responses.RenameWorkspaceObjectResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcWorkRequestId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the asynchronous work request. Use GetWorkRequest with this ID to track the status of the request. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `workspaceObjectDetails` | `model.WorkspaceObjectDetails` | The returned model.WorkspaceObjectDetails instance. |

**Payload `WorkspaceObjectDetails` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `path` | `string` | The fully qualified path of the workspace object. Example: /Shared/Folder1/Notebook1.ipynb |
| `key` | `string` | The key of the Workspace Object. |
| `displayName` | `string` | The name of the Workspace Object. This will be the name of the file/folder in the workspace. Example: Notebook1.ipynb, Folder1 |
| `timeCreated` | `Date` | The date and time the workspace object was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z} |
| `timeUpdated` | `Date` | The date and time the workspace object was last updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z} |
| `type` | `WorkspaceObjectDetails.Type` | The type of the workspace object. |
| `description` | `string` | The description for the file and folder. |
| `systemTags` | `{ [key: string]: { [key: string]: any` | System tags for this resource. Each key is predefined and scoped to a namespace. <p> Example: {@code {\"orcl-cloud\": {\"free-tier-retained\": \"true\"}}} |
**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#client-workspaceobjectclient) • [Top](#top)


### <a id="operation-workspaceobjectclient-updateworkspaceobject"></a>`updateWorkspaceObject`
**Description:** Updates a workspace object with the provided information.

**Request Interface:** `requests.UpdateWorkspaceObjectRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `objectPath` | `string` | The fully qualified path of the workspace object. |
| `updateWorkspaceObjectDetails` | `Uint8Array | Buffer | Blob | stream.Readable | ReadableStream | string` | The information to be updated. |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `objectDescription` | `string` | The description of the workspace object |
| `ifMatch` | `string` | For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |

**Response Interface:** `responses.UpdateWorkspaceObjectResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `objectKey` | `string` | Unique key of the object. |
| `path` | `string` | The full path of the object. |
| `type` | `string` | Type of the object |
| `timeUpdated` | `Date` | The date and time when Workspace Object was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z} |
| `value` | `stream.Readable | ReadableStream` | The returned stream.Readable | ReadableStream instance. |
**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#client-workspaceobjectclient) • [Top](#top)


### <a id="operation-workspaceobjectclient-uploadworkspaceobjectwithpar"></a>`uploadWorkspaceObjectWithPar`
**Description:** Creates a workspace file by generating PAR or updates the metadata by close file. If file exists, then it will be updated.

**Request Interface:** `requests.UploadWorkspaceObjectWithParRequest`


**Required Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `aiDataPlatformId` | `string` | The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance. |
| `workspaceKey` | `string` | The key of the Workspace |
| `uploadFileWithParDetails` | `model.UploadFileWithParDetails` | Contents of the file to upload. |
| `path` | `string` | The absolute path of the file or folder |

**Optional Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `isOverwrite` | `boolean` | A boolean which decides if overwrite is allowed |
| `shouldGenerateNewPar` | `boolean` | Flag to toggle to generate short living par |
| `shouldCreateRecursively` | `boolean` | A boolean which decides if parent directories should be created recursively during upload. |
| `shouldUpdateRecent` | `boolean` | A flag to identify if the recent list should be updated. |
| `opcRetryToken` | `string` | A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash. |
| `type` | `string` | The type of workspace object. |
| `objectDescription` | `string` | The description of the workspace object |

**Response Interface:** `responses.UploadWorkspaceObjectWithParResponse`

**Response Fields:**
| Field | Type | Description |
| --- | --- | --- |
| `etag` | `string` | For optimistic concurrency control. See {@code if-match}. |
| `opcRequestId` | `string` | Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. |
| `objectKey` | `string` | Unique key of the object |
| `path` | `string` | The full path of the object |
| `type` | `string` | Type of the object |
| `timeUpdated` | `Date` | The date and time when Workspace Object was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>. Example: {@code 2016-08-25T21:10:29.600Z} |
| `uploadFileWithParResult` | `model.UploadFileWithParResult` | The returned model.UploadFileWithParResult instance. |

**Payload `UploadFileWithParResult` Summary:**
| Field | Type | Description |
| --- | --- | --- |
| `parUrl` | `string` | String representing the PAR URL. |
| `eTag` | `string` | Etag after creating or closing a file. |
| `locationUri` | `string` | The object storage URI which has bucket and namespace information. |
| `size` | `number` | File size in bytes. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues. |
| `createdBy` | `string` | The user who created the file. |
| `updatedBy` | `string` | The user who last updated the file. |
| `createdTime` | `string` | The time at which the file was created. |
| `updatedTime` | `string` | The last modified time of the file. |
| `description` | `string` | The file description. |
| `systemTags` | `{ [key: string]: { [key: string]: any` | System tags for this resource. Each key is predefined and scoped to a namespace. <p> Example: {@code {\"orcl-cloud\": {\"free-tier-retained\": \"true\"}}} |
**Return:** [Back to Workspace Object (WorkspaceObjectClient)](#client-workspaceobjectclient) • [Top](#top)
