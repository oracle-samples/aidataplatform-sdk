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
- [Agent](#agent)
- [Async Operations](#async-operations)
- [Audit](#audit)
- [Bundle](#bundle)
- [Catalog](#catalog)
- [Cluster](#cluster)
- [Credentials](#credentials)
- [Delta Share](#delta-share)
- [ML Ops](#mlops)
- [Notebook](#notebook)
- [Role](#role)
- [Schema](#schema)
- [User Setting](#user-setting)
- [Volume](#volume)
- [Workflow](#workflow)
- [Workspace](#workspace)
- [Workspace Object](#workspace-object)

## <a id="agent"></a>Agent
Agents, agent deployments, agent sessions, and agent permissions.
**Command Index:**
- [agent copy](#agent-copy)
- [agent create](#agent-create)
- [agent delete](#agent-delete)
- [agent delete-deployment](#agent-delete-deployment)
- [agent delete-session](#agent-delete-session)
- [agent deploy](#agent-deploy)
- [agent get](#agent-get)
- [agent get-deployment](#agent-get-deployment)
- [agent get-session](#agent-get-session)
- [agent get-session-trace](#agent-get-session-trace)
- [agent list](#agent-list)
- [agent list-deployments](#agent-list-deployments)
- [agent list-permissions](#agent-list-permissions)
- [agent list-session-chat-histories](#agent-list-session-chat-histories)
- [agent list-sessions](#agent-list-sessions)
- [agent manage-permission](#agent-manage-permission)
- [agent preview-agent-agent-card](#agent-preview-agent-agent-card)
- [agent redeploy-agent-by-key](#agent-redeploy-agent-by-key)
- [agent update](#agent-update)
- [agent update-deployment-metadata](#agent-update-deployment-metadata)
- [agent validate-agent](#agent-validate-agent)
### Commands

#### `aidp agent copy`
<a id="agent-copy"></a>
Copy an Agent.

**Usage:**

`aidp agent copy <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <AGENT-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `agent-key` (string, required) — The UUID of the Agent
**Options:**
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.

**Request Body (`CopyAgentDetails`):**
- `targetDescription` (string, optional) —
- `targetDisplayName` (string, optional) —
- `targetPathInfo` (string, required) —
- `targetWorkspaceKey` (string, required) —

**Example:**
```json
{
  "targetDescription": "<string>",
  "targetDisplayName": "<string>",
  "targetPathInfo": "<string>",
  "targetWorkspaceKey": "<string>"
}
```
---
**Return:** [Back to Agent](#agent) • [Top](#top)

#### `aidp agent create`
<a id="agent-create"></a>
Create an Agent.

**Usage:**

`aidp agent create <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`AgentCardCapabilitiesDetail`):**
- `isStreaming` (boolean, optional) —

**Example:**
```json
{
  "isStreaming": true
}
```

**Request Body (`AgentCardConfigDetail`):**
- `capabilities` (object, optional) —
- `description` (string, optional) —
- `documentationUrl` (string, optional) —
- `name` (string, required) —
- `provider` (object, optional) —
- `skills` (array, optional) —
- `version` (string, optional) —

**Example:**
```json
{
  "capabilities": {},
  "description": "<string>",
  "documentationUrl": "<string>",
  "name": "<string>",
  "provider": {},
  "skills": [],
  "version": "<string>"
}
```

**Request Body (`AgentCardSkillDetail`):**
- `description` (string, optional) —
- `examples` (array, optional) —
- `id` (string, required) —
- `name` (string, required) —
- `tags` (array, optional) —

**Example:**
```json
{
  "description": "<string>",
  "examples": [],
  "id": "<string>",
  "name": "<string>",
  "tags": []
}
```

**Request Body (`AgentDiagram`):**
- `description` (string, optional) —
- `displayName` (string, optional) —
- `edges` (object, optional) —
- `guardrailsMap` (object, optional) —
- `key` (string, optional) —
- `modelVersion` (string, optional) —
- `nodes` (object, optional) —
- `toolsMap` (object, optional) —

**Example:**
```json
{
  "description": "<string>",
  "displayName": "<string>",
  "edges": {},
  "guardrailsMap": {},
  "key": "<string>",
  "modelVersion": "<string>",
  "nodes": {},
  "toolsMap": {}
}
```

**Request Body (`AgentProvider`):**
- `organization` (string, optional) —
- `url` (string, optional) —

**Example:**
```json
{
  "organization": "<string>",
  "url": "<string>"
}
```

**Request Body (`ContentModerationCategoryConfig`):**
- `action` (string, required) —
- `category` (string, required) —
- `isEnabled` (boolean, required) —
- `threshold` (number, required) —

**Example:**
```json
{
  "action": "BLOCK",
  "category": "HATE_SPEECH",
  "isEnabled": true,
  "threshold": 0
}
```

**Request Body (`ContentModerationPolicy`):**
- `action` (string, optional) —
- `categories` (array, optional) —
- `policyDescription` (string, optional) —
- `policyName` (string, optional) —
- `policyType` (string, optional) —
- `scope` (string, optional) —
- `threshold` (number, optional) —

**Example:**
```json
{
  "action": "<string>",
  "categories": [],
  "policyDescription": "<string>",
  "policyName": "<string>",
  "policyType": "<string>",
  "scope": "<string>",
  "threshold": 0
}
```

**Request Body (`CreateAgentDetails`):**
- `agentCardConfig` (object, optional) —
- `computeKey` (string, optional) —
- `dependenciesFilePath` (string, optional) —
- `description` (string, optional) —
- `diagram` (object, optional) —
- `displayName` (string, required) —
- `entryFilePath` (string, optional) —
- `guardrails` (object, optional) —
- `pathInfo` (string, required) —
- `sessionConfig` (object, optional) —
- `type` (string, optional) —

**Example:**
```json
{
  "agentCardConfig": {},
  "computeKey": "<string>",
  "dependenciesFilePath": "<string>",
  "description": "<string>",
  "diagram": {},
  "displayName": "<string>",
  "entryFilePath": "<string>",
  "guardrails": {},
  "pathInfo": "<string>",
  "sessionConfig": {},
  "type": "CANVAS"
}
```

**Request Body (`CustomPiiRule`):**
- `isCaseSensitive` (boolean, optional) —
- `maxDistance` (integer, optional) —
- `name` (string, required) —
- `pattern` (string, required) —
- `prefix` (string, optional) —
- `priority` (integer, optional) —
- `suffix` (string, optional) —

**Example:**
```json
{
  "isCaseSensitive": true,
  "maxDistance": 0,
  "name": "<string>",
  "pattern": "<string>",
  "prefix": "<string>",
  "priority": 0,
  "suffix": "<string>"
}
```

**Request Body (`DeniedTopic`):**
- `definition` (string, required) —
- `examples` (array, optional) —
- `name` (string, required) —

**Example:**
```json
{
  "definition": "<string>",
  "examples": [],
  "name": "<string>"
}
```

**Request Body (`DeniedTopicsPolicy`):**
- `action` (string, optional) —
- `policyDescription` (string, optional) —
- `policyName` (string, optional) —
- `policyType` (string, optional) —
- `scope` (string, optional) —
- `threshold` (number, optional) —
- `topics` (array, optional) —

**Example:**
```json
{
  "action": "<string>",
  "policyDescription": "<string>",
  "policyName": "<string>",
  "policyType": "<string>",
  "scope": "<string>",
  "threshold": 0,
  "topics": []
}
```

**Request Body (`GuardrailsConfiguration`):**
- `description` (string, optional) —
- `key` (string, optional) —
- `name` (string, optional) —
- `policies` (array, optional) —

**Example:**
```json
{
  "description": "<string>",
  "key": "<string>",
  "name": "<string>",
  "policies": []
}
```

**Request Body (`PiiCategory`):**
- `action` (string, required) —
- `category` (string, required) —
- `isEnabled` (boolean, required) —
- `threshold` (number, optional) —

**Example:**
```json
{
  "action": "BLOCK",
  "category": "PERSON",
  "isEnabled": true,
  "threshold": 0
}
```

**Request Body (`PiiDetectionPolicy`):**
- `action` (string, optional) —
- `customPiiRules` (array, optional) —
- `piiCategories` (array, optional) —
- `policyDescription` (string, optional) —
- `policyName` (string, optional) —
- `policyType` (string, optional) —
- `scope` (string, optional) —
- `threshold` (number, optional) —

**Example:**
```json
{
  "action": "<string>",
  "customPiiRules": [],
  "piiCategories": [],
  "policyDescription": "<string>",
  "policyName": "<string>",
  "policyType": "<string>",
  "scope": "<string>",
  "threshold": 0
}
```

**Request Body (`PromptAttacksPreventionPolicy`):**
- `action` (string, optional) —
- `policyDescription` (string, optional) —
- `policyName` (string, optional) —
- `policyType` (string, optional) —
- `scope` (string, optional) —
- `threshold` (number, optional) —

**Example:**
```json
{
  "action": "<string>",
  "policyDescription": "<string>",
  "policyName": "<string>",
  "policyType": "<string>",
  "scope": "<string>",
  "threshold": 0
}
```

**Request Body (`SafetyPolicy`):**
- `action` (string, required) —
- `policyDescription` (string, optional) —
- `policyName` (string, optional) —
- `policyType` (string, required) —
- `scope` (string, required) —
- `threshold` (number, optional) —

**Example:**
```json
{
  "action": "BLOCK",
  "policyDescription": "<string>",
  "policyName": "<string>",
  "policyType": "CONTENT_MODERATION",
  "scope": "USER_REQUEST",
  "threshold": 0
}
```

**Request Body (`SessionConfiguration`):**
- `sessionRetentionConfig` (object, optional) —
- `variables` (object, optional) —

**Example:**
```json
{
  "sessionRetentionConfig": {},
  "variables": {}
}
```

**Request Body (`SessionRetentionConfiguration`):**
- `retentionPeriodInDays` (integer, optional) —
- `sessionSizeLimit` (integer, optional) —
- `threadCountLimit` (integer, optional) —

**Example:**
```json
{
  "retentionPeriodInDays": 0,
  "sessionSizeLimit": 0,
  "threadCountLimit": 0
}
```

**Request Body (`WordFiltersPolicy`):**
- `action` (string, optional) —
- `policyDescription` (string, optional) —
- `policyName` (string, optional) —
- `policyType` (string, optional) —
- `regexPatterns` (array, optional) —
- `scope` (string, optional) —
- `threshold` (number, optional) —
- `words` (array, optional) —

**Example:**
```json
{
  "action": "<string>",
  "policyDescription": "<string>",
  "policyName": "<string>",
  "policyType": "<string>",
  "regexPatterns": [],
  "scope": "<string>",
  "threshold": 0,
  "words": []
}
```
---
**Return:** [Back to Agent](#agent) • [Top](#top)

#### `aidp agent delete`
<a id="agent-delete"></a>
Delete an Agent from the schema.
Delete an Agent from the schema

**Usage:**

`aidp agent delete <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <AGENT-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `agent-key` (string, required) — The UUID of the Agent
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---
**Return:** [Back to Agent](#agent) • [Top](#top)

#### `aidp agent delete-deployment`
<a id="agent-delete-deployment"></a>
Delete an Agent Deployment.

**Usage:**

`aidp agent delete-deployment <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <AGENT-KEY> <AGENT-DEPLOYMENT-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `agent-key` (string, required) — The UUID of the Agent
- `agent-deployment-key` (string, required) — The UUID of the Agent Deployment
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Agent](#agent) • [Top](#top)

#### `aidp agent delete-session`
<a id="agent-delete-session"></a>
Delete an Agent Session.

**Usage:**

`aidp agent delete-session <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <AGENT-KEY> <SESSION-ID>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `agent-key` (string, required) — The UUID of the Agent
- `session-id` (string, required) — The UUID of the Agent Session
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
---
**Return:** [Back to Agent](#agent) • [Top](#top)

#### `aidp agent deploy`
<a id="agent-deploy"></a>
Deploys an Agent.

**Usage:**

`aidp agent deploy <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <AGENT-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `agent-key` (string, required) — The UUID of the Agent
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`DeployAgentDetails`):**
- `agentComputeKey` (string, optional) —
- `agentKey` (string, required) —
- `description` (string, optional) —
- `displayName` (string, optional) —
- `oAuthConfig` (object, optional) —
- `sessionRetentionConfig` (object, optional) —

**Example:**
```json
{
  "agentComputeKey": "<string>",
  "agentKey": "<string>",
  "description": "<string>",
  "displayName": "<string>",
  "oAuthConfig": {},
  "sessionRetentionConfig": {}
}
```

**Request Body (`OAuthConfiguration`):**
- `audienceClaim` (array, optional) —
- `issuerClaim` (string, optional) —
- `jwksUri` (string, optional) —

**Example:**
```json
{
  "audienceClaim": [],
  "issuerClaim": "<string>",
  "jwksUri": "<string>"
}
```

**Request Body (`SessionRetentionConfiguration`):**
- `retentionPeriodInDays` (integer, optional) —
- `sessionSizeLimit` (integer, optional) —
- `threadCountLimit` (integer, optional) —

**Example:**
```json
{
  "retentionPeriodInDays": 0,
  "sessionSizeLimit": 0,
  "threadCountLimit": 0
}
```
---
**Return:** [Back to Agent](#agent) • [Top](#top)

#### `aidp agent get`
<a id="agent-get"></a>
Returns detailed information about an Agent.

**Usage:**

`aidp agent get <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <AGENT-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `agent-key` (string, required) — The UUID of the Agent
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---
**Return:** [Back to Agent](#agent) • [Top](#top)

#### `aidp agent get-deployment`
<a id="agent-get-deployment"></a>
Returns detailed information about an Agent deployment.

**Usage:**

`aidp agent get-deployment <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <AGENT-KEY> <AGENT-DEPLOYMENT-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `agent-key` (string, required) — The UUID of the Agent
- `agent-deployment-key` (string, required) — The UUID of the Agent Deployment
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Agent](#agent) • [Top](#top)

#### `aidp agent get-session`
<a id="agent-get-session"></a>
Returns detailed information about an Agent Session.

**Usage:**

`aidp agent get-session <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <AGENT-KEY> <SESSION-ID>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `agent-key` (string, required) — The UUID of the Agent
- `session-id` (string, required) — The UUID of the Agent Session
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Agent](#agent) • [Top](#top)

#### `aidp agent get-session-trace`
<a id="agent-get-session-trace"></a>
Returns trace details for a given message key.

**Usage:**

`aidp agent get-session-trace <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <AGENT-KEY> <SESSION-ID> <TRACE-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `agent-key` (string, required) — The UUID of the Agent
- `session-id` (string, required) — The UUID of the Agent Session
- `trace-key` (string, required) — A filter to return only resources that match the given display trace key exactly.
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Agent](#agent) • [Top](#top)

#### `aidp agent list`
<a id="agent-list"></a>
Returns a list of Agents in a schema.

**Usage:**

`aidp agent list <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `compute-key` (string, optional) — Compute key.
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `display-name-contains` (string, optional) — A filter to return only resources that have a display name containing the text provided.
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName"
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Agent](#agent) • [Top](#top)

#### `aidp agent list-deployments`
<a id="agent-list-deployments"></a>
Returns a list of deployments of an agent.

**Usage:**

`aidp agent list-deployments <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <AGENT-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `agent-key` (string, required) — The UUID of the Agent
**Options:**
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `display-name-contains` (string, optional) — A filter to return only resources that have a display name containing the text provided.
- `time-created-greater-than-or-equal-to` (datetime, optional) — Fetch objects from repository that were created after or at the exact timestamp provided in parameter
- `time-created-less-than-or-equal-to` (datetime, optional) — Fetch objects from repository that were created before or at the exact timestamp provided in parameter.
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName"
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Agent](#agent) • [Top](#top)

#### `aidp agent list-permissions`
<a id="agent-list-permissions"></a>
Returns a list of permissions for a given Agent.

**Usage:**

`aidp agent list-permissions <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <AGENT-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `agent-key` (string, required) — The UUID of the Agent
**Options:**
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName"
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---
**Return:** [Back to Agent](#agent) • [Top](#top)

#### `aidp agent list-session-chat-histories`
<a id="agent-list-session-chat-histories"></a>
Returns list of Agent Session chat messages.

**Usage:**

`aidp agent list-session-chat-histories <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <AGENT-KEY> <SESSION-ID>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `agent-key` (string, required) — The UUID of the Agent
- `session-id` (string, required) — The UUID of the Agent Session
**Options:**
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Agent](#agent) • [Top](#top)

#### `aidp agent list-sessions`
<a id="agent-list-sessions"></a>
Returns a list of testing sessions of an Agent.

**Usage:**

`aidp agent list-sessions <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <AGENT-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `agent-key` (string, required) — The UUID of the Agent
**Options:**
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `display-name-contains` (string, optional) — A filter to return only resources that have a display name containing the text provided.
- `time-created-greater-than-or-equal-to` (datetime, optional) — Fetch objects from repository that were created after or at the exact timestamp provided in parameter
- `time-created-less-than-or-equal-to` (datetime, optional) — Fetch objects from repository that were created before or at the exact timestamp provided in parameter.
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName"
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Agent](#agent) • [Top](#top)

#### `aidp agent manage-permission`
<a id="agent-manage-permission"></a>
Update the permissions for a given Agent.

**Usage:**

`aidp agent manage-permission <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <AGENT-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `agent-key` (string, required) — The UUID of the Agent
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`AssignAgentPermissionDetails`):**
- `assignees` (object, required) —
- `excludeColumns` (array, required) —
- `includeColumns` (array, required) —
- `permissions` (array, required) —

**Example:**
```json
{
  "assignees": {},
  "excludeColumns": [],
  "includeColumns": [],
  "permissions": "READ"
}
```

**Request Body (`ManageAgentPermissionDetails`):**
- `assignAgentPermissionDetails` (object, optional) —
- `revokeAgentPermissionDetails` (object, optional) —

**Example:**
```json
{
  "assignAgentPermissionDetails": {},
  "revokeAgentPermissionDetails": {}
}
```

**Request Body (`PermissionAssignees`):**
- `targets` (array, required) —
- `type` (string, required) —

**Example:**
```json
{
  "targets": [],
  "type": "USER"
}
```

**Request Body (`RevokeAgentPermissionDetails`):**
- `assignees` (object, required) —
- `excludeColumns` (array, required) —
- `includeColumns` (array, required) —
- `permissions` (array, required) —

**Example:**
```json
{
  "assignees": {},
  "excludeColumns": [],
  "includeColumns": [],
  "permissions": "READ"
}
```
---
**Return:** [Back to Agent](#agent) • [Top](#top)

#### `aidp agent preview-agent-agent-card`
<a id="agent-preview-agent-agent-card"></a>
Returns the agent card based on the given agent card configuration.

**Usage:**

`aidp agent preview-agent-agent-card <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`AgentCardCapabilitiesDetail`):**
- `isStreaming` (boolean, optional) —

**Example:**
```json
{
  "isStreaming": true
}
```

**Request Body (`AgentCardConfigDetail`):**
- `capabilities` (object, optional) —
- `description` (string, optional) —
- `documentationUrl` (string, optional) —
- `name` (string, required) —
- `provider` (object, optional) —
- `skills` (array, optional) —
- `version` (string, optional) —

**Example:**
```json
{
  "capabilities": {},
  "description": "<string>",
  "documentationUrl": "<string>",
  "name": "<string>",
  "provider": {},
  "skills": [],
  "version": "<string>"
}
```

**Request Body (`AgentCardSkillDetail`):**
- `description` (string, optional) —
- `examples` (array, optional) —
- `id` (string, required) —
- `name` (string, required) —
- `tags` (array, optional) —

**Example:**
```json
{
  "description": "<string>",
  "examples": [],
  "id": "<string>",
  "name": "<string>",
  "tags": []
}
```

**Request Body (`AgentProvider`):**
- `organization` (string, optional) —
- `url` (string, optional) —

**Example:**
```json
{
  "organization": "<string>",
  "url": "<string>"
}
```

**Request Body (`PreviewAgentCardDetails`):**
- `agentCardConfigDetails` (object, required) —

**Example:**
```json
{
  "agentCardConfigDetails": {}
}
```
---
**Return:** [Back to Agent](#agent) • [Top](#top)

#### `aidp agent redeploy-agent-by-key`
<a id="agent-redeploy-agent-by-key"></a>
Redeploys an Agent.

**Usage:**

`aidp agent redeploy-agent-by-key <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <AGENT-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `agent-key` (string, required) — The UUID of the Agent
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`OAuthConfiguration`):**
- `audienceClaim` (array, optional) —
- `issuerClaim` (string, optional) —
- `jwksUri` (string, optional) —

**Example:**
```json
{
  "audienceClaim": [],
  "issuerClaim": "<string>",
  "jwksUri": "<string>"
}
```

**Request Body (`UpdateAgentDeploymentDetails`):**
- `agentComputeKey` (string, optional) —
- `agentKey` (string, required) —
- `description` (string, optional) —
- `displayName` (string, optional) —
- `oAuthConfig` (object, optional) —

**Example:**
```json
{
  "agentComputeKey": "<string>",
  "agentKey": "<string>",
  "description": "<string>",
  "displayName": "<string>",
  "oAuthConfig": {}
}
```
---
**Return:** [Back to Agent](#agent) • [Top](#top)

#### `aidp agent update`
<a id="agent-update"></a>
Update an Agent with provided details.

**Usage:**

`aidp agent update <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <AGENT-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `agent-key` (string, required) — The UUID of the Agent
**Options:**
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`AgentCardCapabilitiesDetail`):**
- `isStreaming` (boolean, optional) —

**Example:**
```json
{
  "isStreaming": true
}
```

**Request Body (`AgentCardConfigDetail`):**
- `capabilities` (object, optional) —
- `description` (string, optional) —
- `documentationUrl` (string, optional) —
- `name` (string, required) —
- `provider` (object, optional) —
- `skills` (array, optional) —
- `version` (string, optional) —

**Example:**
```json
{
  "capabilities": {},
  "description": "<string>",
  "documentationUrl": "<string>",
  "name": "<string>",
  "provider": {},
  "skills": [],
  "version": "<string>"
}
```

**Request Body (`AgentCardSkillDetail`):**
- `description` (string, optional) —
- `examples` (array, optional) —
- `id` (string, required) —
- `name` (string, required) —
- `tags` (array, optional) —

**Example:**
```json
{
  "description": "<string>",
  "examples": [],
  "id": "<string>",
  "name": "<string>",
  "tags": []
}
```

**Request Body (`AgentDiagram`):**
- `description` (string, optional) —
- `displayName` (string, optional) —
- `edges` (object, optional) —
- `guardrailsMap` (object, optional) —
- `key` (string, optional) —
- `modelVersion` (string, optional) —
- `nodes` (object, optional) —
- `toolsMap` (object, optional) —

**Example:**
```json
{
  "description": "<string>",
  "displayName": "<string>",
  "edges": {},
  "guardrailsMap": {},
  "key": "<string>",
  "modelVersion": "<string>",
  "nodes": {},
  "toolsMap": {}
}
```

**Request Body (`AgentProvider`):**
- `organization` (string, optional) —
- `url` (string, optional) —

**Example:**
```json
{
  "organization": "<string>",
  "url": "<string>"
}
```

**Request Body (`ContentModerationCategoryConfig`):**
- `action` (string, required) —
- `category` (string, required) —
- `isEnabled` (boolean, required) —
- `threshold` (number, required) —

**Example:**
```json
{
  "action": "BLOCK",
  "category": "HATE_SPEECH",
  "isEnabled": true,
  "threshold": 0
}
```

**Request Body (`ContentModerationPolicy`):**
- `action` (string, optional) —
- `categories` (array, optional) —
- `policyDescription` (string, optional) —
- `policyName` (string, optional) —
- `policyType` (string, optional) —
- `scope` (string, optional) —
- `threshold` (number, optional) —

**Example:**
```json
{
  "action": "<string>",
  "categories": [],
  "policyDescription": "<string>",
  "policyName": "<string>",
  "policyType": "<string>",
  "scope": "<string>",
  "threshold": 0
}
```

**Request Body (`CustomPiiRule`):**
- `isCaseSensitive` (boolean, optional) —
- `maxDistance` (integer, optional) —
- `name` (string, required) —
- `pattern` (string, required) —
- `prefix` (string, optional) —
- `priority` (integer, optional) —
- `suffix` (string, optional) —

**Example:**
```json
{
  "isCaseSensitive": true,
  "maxDistance": 0,
  "name": "<string>",
  "pattern": "<string>",
  "prefix": "<string>",
  "priority": 0,
  "suffix": "<string>"
}
```

**Request Body (`DeniedTopic`):**
- `definition` (string, required) —
- `examples` (array, optional) —
- `name` (string, required) —

**Example:**
```json
{
  "definition": "<string>",
  "examples": [],
  "name": "<string>"
}
```

**Request Body (`DeniedTopicsPolicy`):**
- `action` (string, optional) —
- `policyDescription` (string, optional) —
- `policyName` (string, optional) —
- `policyType` (string, optional) —
- `scope` (string, optional) —
- `threshold` (number, optional) —
- `topics` (array, optional) —

**Example:**
```json
{
  "action": "<string>",
  "policyDescription": "<string>",
  "policyName": "<string>",
  "policyType": "<string>",
  "scope": "<string>",
  "threshold": 0,
  "topics": []
}
```

**Request Body (`GuardrailsConfiguration`):**
- `description` (string, optional) —
- `key` (string, optional) —
- `name` (string, optional) —
- `policies` (array, optional) —

**Example:**
```json
{
  "description": "<string>",
  "key": "<string>",
  "name": "<string>",
  "policies": []
}
```

**Request Body (`PiiCategory`):**
- `action` (string, required) —
- `category` (string, required) —
- `isEnabled` (boolean, required) —
- `threshold` (number, optional) —

**Example:**
```json
{
  "action": "BLOCK",
  "category": "PERSON",
  "isEnabled": true,
  "threshold": 0
}
```

**Request Body (`PiiDetectionPolicy`):**
- `action` (string, optional) —
- `customPiiRules` (array, optional) —
- `piiCategories` (array, optional) —
- `policyDescription` (string, optional) —
- `policyName` (string, optional) —
- `policyType` (string, optional) —
- `scope` (string, optional) —
- `threshold` (number, optional) —

**Example:**
```json
{
  "action": "<string>",
  "customPiiRules": [],
  "piiCategories": [],
  "policyDescription": "<string>",
  "policyName": "<string>",
  "policyType": "<string>",
  "scope": "<string>",
  "threshold": 0
}
```

**Request Body (`PromptAttacksPreventionPolicy`):**
- `action` (string, optional) —
- `policyDescription` (string, optional) —
- `policyName` (string, optional) —
- `policyType` (string, optional) —
- `scope` (string, optional) —
- `threshold` (number, optional) —

**Example:**
```json
{
  "action": "<string>",
  "policyDescription": "<string>",
  "policyName": "<string>",
  "policyType": "<string>",
  "scope": "<string>",
  "threshold": 0
}
```

**Request Body (`SafetyPolicy`):**
- `action` (string, required) —
- `policyDescription` (string, optional) —
- `policyName` (string, optional) —
- `policyType` (string, required) —
- `scope` (string, required) —
- `threshold` (number, optional) —

**Example:**
```json
{
  "action": "BLOCK",
  "policyDescription": "<string>",
  "policyName": "<string>",
  "policyType": "CONTENT_MODERATION",
  "scope": "USER_REQUEST",
  "threshold": 0
}
```

**Request Body (`SessionConfiguration`):**
- `sessionRetentionConfig` (object, optional) —
- `variables` (object, optional) —

**Example:**
```json
{
  "sessionRetentionConfig": {},
  "variables": {}
}
```

**Request Body (`SessionRetentionConfiguration`):**
- `retentionPeriodInDays` (integer, optional) —
- `sessionSizeLimit` (integer, optional) —
- `threadCountLimit` (integer, optional) —

**Example:**
```json
{
  "retentionPeriodInDays": 0,
  "sessionSizeLimit": 0,
  "threadCountLimit": 0
}
```

**Request Body (`UpdateAgentDetails`):**
- `addedNodes` (array, optional) —
- `agentCardConfig` (object, optional) —
- `computeKey` (string, optional) —
- `deletedNodes` (array, optional) —
- `dependenciesFilePath` (string, optional) —
- `description` (string, optional) —
- `diagram` (object, optional) —
- `displayName` (string, optional) —
- `entryFilePath` (string, optional) —
- `guardrails` (object, optional) —
- `sessionConfig` (object, optional) —
- `updatedNodes` (array, optional) —

**Example:**
```json
{
  "addedNodes": [],
  "agentCardConfig": {},
  "computeKey": "<string>",
  "deletedNodes": [],
  "dependenciesFilePath": "<string>",
  "description": "<string>",
  "diagram": {},
  "displayName": "<string>",
  "entryFilePath": "<string>",
  "guardrails": {},
  "sessionConfig": {},
  "updatedNodes": []
}
```

**Request Body (`WordFiltersPolicy`):**
- `action` (string, optional) —
- `policyDescription` (string, optional) —
- `policyName` (string, optional) —
- `policyType` (string, optional) —
- `regexPatterns` (array, optional) —
- `scope` (string, optional) —
- `threshold` (number, optional) —
- `words` (array, optional) —

**Example:**
```json
{
  "action": "<string>",
  "policyDescription": "<string>",
  "policyName": "<string>",
  "policyType": "<string>",
  "regexPatterns": [],
  "scope": "<string>",
  "threshold": 0,
  "words": []
}
```
---
**Return:** [Back to Agent](#agent) • [Top](#top)

#### `aidp agent update-deployment-metadata`
<a id="agent-update-deployment-metadata"></a>
Update the deployment metadata for an Agent.

**Usage:**

`aidp agent update-deployment-metadata <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <AGENT-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `agent-key` (string, required) — The UUID of the Agent
**Options:**
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.

**Request Body (`AgentCardCapabilitiesDetail`):**
- `isStreaming` (boolean, optional) —

**Example:**
```json
{
  "isStreaming": true
}
```

**Request Body (`AgentCardConfigDetail`):**
- `capabilities` (object, optional) —
- `description` (string, optional) —
- `documentationUrl` (string, optional) —
- `name` (string, required) —
- `provider` (object, optional) —
- `skills` (array, optional) —
- `version` (string, optional) —

**Example:**
```json
{
  "capabilities": {},
  "description": "<string>",
  "documentationUrl": "<string>",
  "name": "<string>",
  "provider": {},
  "skills": [],
  "version": "<string>"
}
```

**Request Body (`AgentCardSkillDetail`):**
- `description` (string, optional) —
- `examples` (array, optional) —
- `id` (string, required) —
- `name` (string, required) —
- `tags` (array, optional) —

**Example:**
```json
{
  "description": "<string>",
  "examples": [],
  "id": "<string>",
  "name": "<string>",
  "tags": []
}
```

**Request Body (`AgentProvider`):**
- `organization` (string, optional) —
- `url` (string, optional) —

**Example:**
```json
{
  "organization": "<string>",
  "url": "<string>"
}
```

**Request Body (`UpdateAgentDeploymentMetadataDetails`):**
- `agentCardConfigDetail` (object, optional) —
- `deploymentKey` (string, optional) —

**Example:**
```json
{
  "agentCardConfigDetail": {},
  "deploymentKey": "<string>"
}
```
---
**Return:** [Back to Agent](#agent) • [Top](#top)

#### `aidp agent validate-agent`
<a id="agent-validate-agent"></a>
Validate the agent json diagram generated by UI.

**Usage:**

`aidp agent validate-agent <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <AGENT-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `agent-key` (string, required) — The UUID of the Agent
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---
**Return:** [Back to Agent](#agent) • [Top](#top)

## <a id="async-operations"></a>Async Operations
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
**Return:** [Back to Async-Operations](#async-operations) • [Top](#top)

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
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeStarted is descending. Allowed values are: "timeStarted"
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Async-Operations](#async-operations) • [Top](#top)

## <a id="audit"></a>Audit
Audit logs.
**Command Index:**
- [audit manage-logs](#audit-manage-logs)
- [audit search-logs](#audit-search-logs)
### Commands

#### `aidp audit manage-logs`
<a id="audit-manage-logs"></a>
Manages audit logs.

**Usage:**

`aidp audit manage-logs <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`ManageAuditLogsDetails`):**
- `action` (string, optional) —
- `retentionPeriod` (integer, optional) —

**Example:**
```json
{
  "action": "ENABLE",
  "retentionPeriod": 0
}
```
---
**Return:** [Back to Audit](#audit) • [Top](#top)

#### `aidp audit search-logs`
<a id="audit-search-logs"></a>
Searches audit logs.

**Usage:**

`aidp audit search-logs <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
**Options:**
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`SearchAuditLogsDetails`):**
- `objectName` (string, optional) —
- `objectType` (string, optional) —
- `operation` (string, optional) —
- `query` (string, optional) —
- `sortBy` (string, optional) —
- `sortOrder` (string, optional) —
- `startedBy` (string, optional) —
- `status` (string, optional) —
- `timeBegin` (datetime, optional) —
- `timeEnd` (datetime, optional) —

**Example:**
```json
{
  "objectName": "<string>",
  "objectType": "DATA_LAKE",
  "operation": "CREATE",
  "query": "<string>",
  "sortBy": "startedBy",
  "sortOrder": "ASC",
  "startedBy": "<string>",
  "status": "SUCCEEDED",
  "timeBegin": "<string>",
  "timeEnd": "<string>"
}
```
---
**Return:** [Back to Audit](#audit) • [Top](#top)

## <a id="bundle"></a>Bundle
Bundles, bundle actions, bundle deployment status, and bundle deployment status actions.
**Command Index:**
- [bundle create](#bundle-create)
- [bundle create-action](#bundle-create-action)
- [bundle deploy](#bundle-deploy)
- [bundle deploy-action](#bundle-deploy-action)
- [bundle fetch-deployment-status](#bundle-fetch-deployment-status)
- [bundle fetch-deployment-status-action](#bundle-fetch-deployment-status-action)
- [bundle purge](#bundle-purge)
- [bundle purge-action](#bundle-purge-action)
- [bundle sync-bundle](#bundle-sync-bundle)
- [bundle sync-bundle-action](#bundle-sync-bundle-action)
### Commands

#### `aidp bundle create`
<a id="bundle-create"></a>
(Deprecated) Creates a new bundle.
(Deprecated) Creates a new bundle. A bundle is a self-contained, portable representation of selected workspace assets, such as jobs and agent flows, along with their dependencies and associated code artifacts. It captures both the resource configurations and the supporting assets required to recreate those resources in another workspace or environment. The bundle manifest is named aidp_workbench.yaml. The bundle preserves the workspace folder structure for code artifacts from the location where it was created, so the generated bundle mirrors the source layout. Dependencies are tracked inside the bundle under each asset type: - job and agent flow dependencies are added under the dependencies folder inside the jobs and agentflows folders - code dependencies are added under the artifacts directory in the bundle Dependency references use template variables, for example: - compute: $${jobs.dependencies.training_compute.compute.key} - nested jobs: $${jobs.dependencies.training_job.job.key} - aicompute: $${jobs.dependencies.training_aicompute.aicompute.key} Bundles also support the special variable $${bundle.root}, which points to the root of the bundle folder and is used for referencing artifacts. Variables and overrides: - bundles support parameterization using variables defined in the bundle manifest (aidp_workbench.yaml) Example manifest defaults: defaults: variables: job_compute_key: "$${jobs.dependencies.small.compute.key}" - variables can be referenced in resource descriptors using the $${var.<name>} syntax Example usage in a job descriptor: "clusterKey": "$${var.job_compute_key}" - workspace-specific overrides can be provided via .aidp/overrides.yaml inside the bundle - this file is intended for environment-specific configuration and should not be committed to Git, allowing the bundle to remain portable and environment-agnostic Example overrides file: variables: job_compute_key: f6e7f5d8-d965-4009-95d9-02e993d9a16b - when an override is provided, the referenced dependency (for example, compute) is not created, and the provided value is used instead - when no override is provided, the system falls back to the default variable value, which may reference a dependency included in the bundle (resulting in that dependency being created) - this mechanism enables environment-specific customization (for example, reusing existing infrastructure in production while creating new resources in development) - the same pattern can be used for other environment-specific parameters such as compute shape, number of OCPUs, or other configuration values Git integration and promotion: - bundles can only be created inside Git-backed workspace folders - bundles are self-contained packages that include resource definitions, dependency references, and associated code artifacts required to recreate the bundled resources - the entire bundle folder can be committed and pushed to a Git repository - bundles can be pulled into another workspace via Git and deployed there - bundles can be promoted across environments (for example, dev → test → prod) using Git workflows - because the bundle includes both resource configuration and code dependencies, it can be used to reliably replicate assets across workspaces This operation is asynchronous. The service validates the request, starts bundle creation, and returns an async operation key in the response headers. Use the async operation APIs to track completion. Typical use cases: - capture selected workspace resources into a version-controlled bundle - prepare a bundle for later deployment or promotion - establish a bundle root that can later be inspected, updated, or deployed Request notes: - path identifies the parent folder in the workspace volume where the bundle should be created - name identifies the bundle folder name - bundledResources identifies which workspace resources should be included

**Usage:**

`aidp bundle create <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`BundledResource`):**
- `resourceKey` (string, required) —
- `resourceType` (string, required) —

**Example:**
```json
{
  "resourceKey": "<string>",
  "resourceType": "JOB"
}
```

**Request Body (`CreateBundleDetails`):**
- `bundledResources` (array, optional) —
- `description` (string, optional) —
- `name` (string, required) —
- `path` (string, required) —

**Example:**
```json
{
  "bundledResources": [],
  "description": "<string>",
  "name": "<string>",
  "path": "<string>"
}
```
---
**Return:** [Back to Bundle](#bundle) • [Top](#top)

#### `aidp bundle create-action`
<a id="bundle-create-action"></a>
(Preview) Creates a new bundle.
(Preview) Creates a new bundle. A bundle is a self-contained, portable representation of selected workspace assets, such as jobs and agent flows, along with their dependencies and associated code artifacts. It captures both the resource configurations and the supporting assets required to recreate those resources in another workspace or environment. The bundle manifest is named aidp_workbench.yaml. The bundle preserves the workspace folder structure for code artifacts from the location where it was created, so the generated bundle mirrors the source layout. Dependencies are tracked inside the bundle under each asset type: - job and agent flow dependencies are added under the dependencies folder inside the jobs and agentflows folders - code dependencies are added under the artifacts directory in the bundle Dependency references use template variables, for example: - compute: $${jobs.dependencies.training_compute.compute.key} - nested jobs: $${jobs.dependencies.training_job.job.key} - aicompute: $${jobs.dependencies.training_aicompute.aicompute.key} Bundles also support the special variable $${bundle.root}, which points to the root of the bundle folder and is used for referencing artifacts. Variables and overrides: - bundles support parameterization using variables defined in the bundle manifest (aidp_workbench.yaml) Example manifest defaults: defaults: variables: job_compute_key: "$${jobs.dependencies.small.compute.key}" - variables can be referenced in resource descriptors using the $${var.<name>} syntax Example usage in a job descriptor: "clusterKey": "$${var.job_compute_key}" - workspace-specific overrides can be provided via .aidp/overrides.yaml inside the bundle - this file is intended for environment-specific configuration and should not be committed to Git, allowing the bundle to remain portable and environment-agnostic Example overrides file: variables: job_compute_key: f6e7f5d8-d965-4009-95d9-02e993d9a16b - when an override is provided, the referenced dependency (for example, compute) is not created, and the provided value is used instead - when no override is provided, the system falls back to the default variable value, which may reference a dependency included in the bundle (resulting in that dependency being created) - this mechanism enables environment-specific customization (for example, reusing existing infrastructure in production while creating new resources in development) - the same pattern can be used for other environment-specific parameters such as compute shape, number of OCPUs, or other configuration values Git integration and promotion: - bundles can only be created inside Git-backed workspace folders - bundles are self-contained packages that include resource definitions, dependency references, and associated code artifacts required to recreate the bundled resources - the entire bundle folder can be committed and pushed to a Git repository - bundles can be pulled into another workspace via Git and deployed there - bundles can be promoted across environments (for example, dev → test → prod) using Git workflows - because the bundle includes both resource configuration and code dependencies, it can be used to reliably replicate assets across workspaces This operation is asynchronous. The service validates the request, starts bundle creation, and returns an async operation key in the response headers. Use the async operation APIs to track completion. Typical use cases: - capture selected workspace resources into a version-controlled bundle - prepare a bundle for later deployment or promotion - establish a bundle root that can later be inspected, updated, or deployed Request notes: - path identifies the parent folder in the workspace volume where the bundle should be created - name identifies the bundle folder name - bundledResources identifies which workspace resources should be included

**Usage:**

`aidp bundle create-action <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`BundledResource`):**
- `resourceKey` (string, required) —
- `resourceType` (string, required) —

**Example:**
```json
{
  "resourceKey": "<string>",
  "resourceType": "JOB"
}
```

**Request Body (`CreateBundleDetails`):**
- `bundledResources` (array, optional) —
- `description` (string, optional) —
- `name` (string, required) —
- `path` (string, required) —

**Example:**
```json
{
  "bundledResources": [],
  "description": "<string>",
  "name": "<string>",
  "path": "<string>"
}
```
---
**Return:** [Back to Bundle](#bundle) • [Top](#top)

#### `aidp bundle deploy`
<a id="bundle-deploy"></a>
(Deprecated) Deploys the specified bundle, creating or updating jobs and agent flows according to the bundle manifest.
(Deprecated) Deploys the specified bundle, creating or updating jobs and agent flows according to the bundle manifest. Returns an async job key for tracking deployment progress. This operation is asynchronous. The request is accepted for background execution and returns an async operation key in the response headers. Deployment typically uses: - the bundle manifest at the bundle root - top-level resource descriptors in the bundle - dependency descriptors referenced by those top-level resources - default or override variable values when present Use this operation when you want to apply the bundle contents into the target workspace state. Request notes: - path identifies the bundle root folder in the workspace volume

**Usage:**

`aidp bundle deploy <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`DeployBundleDetails`):**
- `path` (string, required) —

**Example:**
```json
{
  "path": "<string>"
}
```
---
**Return:** [Back to Bundle](#bundle) • [Top](#top)

#### `aidp bundle deploy-action`
<a id="bundle-deploy-action"></a>
(Preview) Deploys the specified bundle, creating or updating jobs and agent flows according to the bundle manifest.
(Preview) Deploys the specified bundle, creating or updating jobs and agent flows according to the bundle manifest. Returns an async job key for tracking deployment progress. This operation is asynchronous. The request is accepted for background execution and returns an async operation key in the response headers. Deployment typically uses: - the bundle manifest at the bundle root - top-level resource descriptors in the bundle - dependency descriptors referenced by those top-level resources - default or override variable values when present Use this operation when you want to apply the bundle contents into the target workspace state. Request notes: - path identifies the bundle root folder in the workspace volume

**Usage:**

`aidp bundle deploy-action <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`DeployBundleDetails`):**
- `path` (string, required) —

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
(Deprecated) Returns a high-level summary of the most recent deployment activity recorded for the specified bundle.
(Deprecated) Returns a high-level summary of the most recent deployment activity recorded for the specified bundle. This operation is useful after deploy or purge requests when you want the latest bundle-level deployment outcome rather than raw async operation details. The response can include: - overall deployment status - start and completion timestamps - summary message - resources associated with the last recorded deployment result Typical status values include: - IN_PROGRESS - SUCCEEDED - FAILED - NOT_DEPLOYED Request notes: - path identifies the bundle root folder in the workspace volume

**Usage:**

`aidp bundle fetch-deployment-status <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`FetchBundleDeploymentStatusDetails`):**
- `path` (string, required) —

**Example:**
```json
{
  "path": "<string>"
}
```
---
**Return:** [Back to Bundle](#bundle) • [Top](#top)

#### `aidp bundle fetch-deployment-status-action`
<a id="bundle-fetch-deployment-status-action"></a>
(Preview) Returns a high-level summary of the most recent deployment activity recorded for the specified bundle.
(Preview) Returns a high-level summary of the most recent deployment activity recorded for the specified bundle. This operation is useful after deploy or purge requests when you want the latest bundle-level deployment outcome rather than raw async operation details. The response can include: - overall deployment status - start and completion timestamps - summary message - resources associated with the last recorded deployment result Typical status values include: - IN_PROGRESS - SUCCEEDED - FAILED - NOT_DEPLOYED Request notes: - path identifies the bundle root folder in the workspace volume

**Usage:**

`aidp bundle fetch-deployment-status-action <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`FetchBundleDeploymentStatusDetails`):**
- `path` (string, required) —

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
(Deprecated) Tears down all resources deployed by the specified bundle in the workspace.
(Deprecated) Tears down all resources deployed by the specified bundle in the workspace. This operation is intended to tear down resources that were created or managed through bundle deployment. It does not delete the bundle files themselves from the workspace volume. This operation is asynchronous. The service accepts the purge request, starts the background teardown workflow, and returns async operation headers. Typical use cases: - remove resources that were previously deployed from a bundle - clean up a workspace before re-deploying or retiring a bundle Request notes: - path identifies the bundle root folder in the workspace volume

**Usage:**

`aidp bundle purge <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`PurgeBundleDetails`):**
- `path` (string, required) —

**Example:**
```json
{
  "path": "<string>"
}
```
---
**Return:** [Back to Bundle](#bundle) • [Top](#top)

#### `aidp bundle purge-action`
<a id="bundle-purge-action"></a>
(Preview) Tears down all resources deployed by the specified bundle in the workspace.
(Preview) Tears down all resources deployed by the specified bundle in the workspace. This operation is intended to tear down resources that were created or managed through bundle deployment. It does not delete the bundle files themselves from the workspace volume. This operation is asynchronous. The service accepts the purge request, starts the background teardown workflow, and returns async operation headers. Typical use cases: - remove resources that were previously deployed from a bundle - clean up a workspace before re-deploying or retiring a bundle Request notes: - path identifies the bundle root folder in the workspace volume

**Usage:**

`aidp bundle purge-action <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`PurgeBundleDetails`):**
- `path` (string, required) —

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
(Deprecated) Synchronizes the code, descriptors, and mapping in the bundle by reconciling the contents with the resource origins.
(Deprecated) Synchronizes the code, descriptors, and mapping in the bundle by reconciling the contents with the resource origins. Returns an async job key for tracking sync progress. This operation is intended for cases where the bundle should be refreshed to reflect newer source changes while preserving the bundle structure and identity. Sync uses the bundle's recorded origin metadata to rebuild the bundle from the source jobs and agent flows that were captured when the bundle was created. The source metadata is stored in .aidp/resource_origins.yaml and must match the requested AIDP/Data Lake and workspace. The operation refreshes source-controlled bundle content while preserving the bundle identity and runtime metadata. During sync, the service stages a refreshed bundle snapshot under the bundle .aidp directory, compares existing and staged descriptors, preserves existing variable aliases and override references where possible, merges existing manifest default variables, and then promotes the refreshed source-controlled files back into the bundle root. Sync preserves environment-specific and deployment runtime files such as .aidp/overrides.yaml and .aidp/aidp.state.json. These files are not replaced by the refreshed source snapshot. This operation is asynchronous and returns async operation headers when accepted. Typical use cases: - refresh bundle contents after upstream workspace resources have changed - reconcile descriptor or artifact content with current resource origins - preserve local bundle overrides while pulling in source resource updates - keep a Git-backed bundle current before committing or promoting it Request notes: - path identifies the bundle root folder in the workspace volume - the bundle must contain a valid aidp_workbench.yaml - the bundle must contain .aidp/resource_origins.yaml - origin metadata must refer to the same AIDP/Data Lake and workspace as the request

**Usage:**

`aidp bundle sync-bundle <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`SyncBundleDetails`):**
- `path` (string, required) —

**Example:**
```json
{
  "path": "<string>"
}
```
---
**Return:** [Back to Bundle](#bundle) • [Top](#top)

#### `aidp bundle sync-bundle-action`
<a id="bundle-sync-bundle-action"></a>
(Preview) Synchronizes the code, descriptors, and mapping in the bundle by reconciling the contents with the resource origins.
(Preview) Synchronizes the code, descriptors, and mapping in the bundle by reconciling the contents with the resource origins. Returns an async job key for tracking sync progress. This operation is intended for cases where the bundle should be refreshed to reflect newer source changes while preserving the bundle structure and identity. Sync uses the bundle's recorded origin metadata to rebuild the bundle from the source jobs and agent flows that were captured when the bundle was created. The source metadata is stored in .aidp/resource_origins.yaml and must match the requested AIDP/Data Lake and workspace. The operation refreshes source-controlled bundle content while preserving the bundle identity and runtime metadata. During sync, the service stages a refreshed bundle snapshot under the bundle .aidp directory, compares existing and staged descriptors, preserves existing variable aliases and override references where possible, merges existing manifest default variables, and then promotes the refreshed source-controlled files back into the bundle root. Sync preserves environment-specific and deployment runtime files such as .aidp/overrides.yaml and .aidp/aidp.state.json. These files are not replaced by the refreshed source snapshot. This operation is asynchronous and returns async operation headers when accepted. Typical use cases: - refresh bundle contents after upstream workspace resources have changed - reconcile descriptor or artifact content with current resource origins - preserve local bundle overrides while pulling in source resource updates - keep a Git-backed bundle current before committing or promoting it Request notes: - path identifies the bundle root folder in the workspace volume - the bundle must contain a valid aidp_workbench.yaml - the bundle must contain .aidp/resource_origins.yaml - origin metadata must refer to the same AIDP/Data Lake and workspace as the request

**Usage:**

`aidp bundle sync-bundle-action <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`SyncBundleDetails`):**
- `path` (string, required) —

**Example:**
```json
{
  "path": "<string>"
}
```
---
**Return:** [Back to Bundle](#bundle) • [Top](#top)

## <a id="catalog"></a>Catalog
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
Creates a catalog with the given ID.

**Usage:**

`aidp catalog create <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`CreateCatalogDetails`):**
- `catalogType` (string, optional) —
- `connectionDetails` (object, optional) —
- `description` (string, optional) —
- `displayName` (string, required) —
- `properties` (object, optional) —
- `sourceType` (string, optional) —

**Example:**
```json
{
  "catalogType": "EXTERNAL",
  "connectionDetails": {},
  "description": "<string>",
  "displayName": "<string>",
  "properties": {},
  "sourceType": "ADW"
}
```

**Request Body (`CreateConnectionDetails`):**
- `connectionProperties` (object, required) —

**Example:**
```json
{
  "connectionProperties": {}
}
```
---
**Return:** [Back to Catalog](#catalog) • [Top](#top)

#### `aidp catalog delete`
<a id="catalog-delete"></a>
Deletes the specified catalog.

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
Gets detailed information about a catalog with a given catalog key.

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
Gets a list of catalogs with a given ID.

**Usage:**

`aidp catalog list <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
**Options:**
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `catalog-state` (string, optional) — The state of the catalog. Allowed values are: "ACTIVE", "CREATING", "DELETING"
- `catalog-type` (string, optional) — The type of the catalog. Allowed values are: "INTERNAL", "EXTERNAL"
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName"
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Catalog](#catalog) • [Top](#top)

#### `aidp catalog list-permissions`
<a id="catalog-list-permissions"></a>
Gets a list of all permissions in the specified catalog.

**Usage:**

`aidp catalog list-permissions <AI-DATA-PLATFORM-ID> <CATALOG-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `catalog-key` (string, required) — The key of the catalog.
**Options:**
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName"
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---
**Return:** [Back to Catalog](#catalog) • [Top](#top)

#### `aidp catalog manage-permission`
<a id="catalog-manage-permission"></a>
Updates permission details for a catalog.

**Usage:**

`aidp catalog manage-permission <AI-DATA-PLATFORM-ID> <CATALOG-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `catalog-key` (string, required) — The key of the catalog.
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`AssignCatalogPermissionDetails`):**
- `assignees` (object, required) —
- `permissions` (array, required) —

**Example:**
```json
{
  "assignees": {},
  "permissions": "SELECT"
}
```

**Request Body (`ManageCatalogPermissionDetails`):**
- `assignCatalogPermissionDetails` (object, optional) —
- `revokeCatalogPermissionDetails` (object, optional) —

**Example:**
```json
{
  "assignCatalogPermissionDetails": {},
  "revokeCatalogPermissionDetails": {}
}
```

**Request Body (`PermissionAssignees`):**
- `targets` (array, required) —
- `type` (string, required) —

**Example:**
```json
{
  "targets": [],
  "type": "USER"
}
```

**Request Body (`RevokeCatalogPermissionDetails`):**
- `assignees` (object, required) —
- `permissions` (array, required) —

**Example:**
```json
{
  "assignees": {},
  "permissions": "SELECT"
}
```
---
**Return:** [Back to Catalog](#catalog) • [Top](#top)

#### `aidp catalog refresh`
<a id="catalog-refresh"></a>
Refreshes a catalog through a crawler.

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
Tests the connection to an external catalog.

**Usage:**

`aidp catalog test-connection <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`CatalogConnectionDetails`):**
- `connectionProperties` (object, required) —
- `displayName` (string, optional) —

**Example:**
```json
{
  "connectionProperties": {},
  "displayName": "<string>"
}
```

**Request Body (`CatalogTestConnectionDetails`):**
- `connectionDetails` (object, optional) —
- `key` (string, optional) —
- `sourceType` (string, optional) —

**Example:**
```json
{
  "connectionDetails": {},
  "key": "<string>",
  "sourceType": "ADW"
}
```
---
**Return:** [Back to Catalog](#catalog) • [Top](#top)

#### `aidp catalog update`
<a id="catalog-update"></a>
Updates the details of a catalog with the given information.

**Usage:**

`aidp catalog update <AI-DATA-PLATFORM-ID> <CATALOG-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `catalog-key` (string, required) — The key of the catalog.
**Options:**
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`UpdateCatalogDetails`):**
- `connectionDetails` (object, optional) —
- `description` (string, optional) —
- `displayName` (string, optional) —
- `properties` (object, optional) —

**Example:**
```json
{
  "connectionDetails": {},
  "description": "<string>",
  "displayName": "<string>",
  "properties": {}
}
```

**Request Body (`UpdateConnectionDetails`):**
- `connectionProperties` (object, required) —

**Example:**
```json
{
  "connectionProperties": {}
}
```
---
**Return:** [Back to Catalog](#catalog) • [Top](#top)

## <a id="cluster"></a>Cluster
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
- [cluster query-replica-ids](#cluster-query-replica-ids)
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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`AttachToNotebookConfig`):**
- `notebookPath` (string, required) —

**Example:**
```json
{
  "notebookPath": "<string>"
}
```

**Request Body (`ClusterRuntimeConfig`):**
- `initScripts` (array, optional) —
- `type` (string, optional) —

**Example:**
```json
{
  "initScripts": [],
  "type": "SPARK"
}
```

**Request Body (`CreateAiComputeDetails`):**
- `description` (string, optional) —
- `displayName` (string, optional) —
- `driverConfig` (object, optional) —
- `nodeType` (string, optional) —
- `replicaConfig` (object, optional) —
- `type` (string, optional) —

**Example:**
```json
{
  "description": "<string>",
  "displayName": "<string>",
  "driverConfig": {},
  "nodeType": "<string>",
  "replicaConfig": {},
  "type": "<string>"
}
```

**Request Body (`CreateClusterDetails`):**
- `description` (string, optional) —
- `displayName` (string, required) —
- `driverConfig` (object, required) —
- `nodeType` (string, optional) —
- `type` (string, required) —

**Example:**
```json
{
  "description": "<string>",
  "displayName": "<string>",
  "driverConfig": {},
  "nodeType": "<string>",
  "type": "USER"
}
```

**Request Body (`CreateDflComputeDetails`):**
- `description` (string, optional) —
- `displayName` (string, optional) —
- `driverConfig` (object, optional) —
- `nodeType` (string, optional) —
- `type` (string, optional) —

**Example:**
```json
{
  "description": "<string>",
  "displayName": "<string>",
  "driverConfig": {},
  "nodeType": "<string>",
  "type": "<string>"
}
```

**Request Body (`CreateSparkClusterDetails`):**
- `attachToNotebookConfig` (object, optional) —
- `autoTerminationMinutes` (integer, optional) —
- `clusterRuntimeConfig` (object, optional) —
- `description` (string, optional) —
- `displayName` (string, optional) —
- `driverConfig` (object, optional) —
- `loggingConfig` (object, optional) —
- `nodeType` (string, optional) —
- `subscription` (object, optional) —
- `type` (string, optional) —
- `workerConfig` (object, optional) —

**Example:**
```json
{
  "attachToNotebookConfig": {},
  "autoTerminationMinutes": 0,
  "clusterRuntimeConfig": {},
  "description": "<string>",
  "displayName": "<string>",
  "driverConfig": {},
  "loggingConfig": {},
  "nodeType": "<string>",
  "subscription": {},
  "type": "<string>",
  "workerConfig": {}
}
```

**Request Body (`DriverConfig`):**
- `driverNodeType` (string, optional) —
- `driverShape` (string, optional) —
- `driverShapeConfig` (object, optional) —

**Example:**
```json
{
  "driverNodeType": "<string>",
  "driverShape": "<string>",
  "driverShapeConfig": {}
}
```

**Request Body (`InitScriptPath`):**
- `destination` (string, required) —

**Example:**
```json
{
  "destination": "<string>"
}
```

**Request Body (`LogGroup`):**
- `compartmentId` (string, optional) —
- `groupName` (string, optional) —
- `logName` (string, optional) —

**Example:**
```json
{
  "compartmentId": "<string>",
  "groupName": "<string>",
  "logName": "<string>"
}
```

**Request Body (`LoggingConfig`):**
- `type` (string, optional) —

**Example:**
```json
{
  "type": "OCI_LOGGING"
}
```

**Request Body (`OciLogging`):**
- `logGroups` (array, optional) —
- `type` (string, optional) —

**Example:**
```json
{
  "logGroups": [],
  "type": "<string>"
}
```

**Request Body (`ReplicaConfig`):**
- `maxReplica` (integer, optional) —
- `minReplica` (integer, optional) —

**Example:**
```json
{
  "maxReplica": 0,
  "minReplica": 0
}
```

**Request Body (`ShapeConfig`):**
- `gpus` (integer, optional) —
- `memoryInGBs` (integer, optional) —
- `ocpus` (integer, optional) —

**Example:**
```json
{
  "gpus": 0,
  "memoryInGBs": 0,
  "ocpus": 0
}
```

**Request Body (`SparkRuntimeConfig`):**
- `initScripts` (array, optional) —
- `sparkAdvancedConfigurations` (object, optional) —
- `sparkEnvVariables` (object, optional) —
- `sparkVersion` (string, optional) —
- `type` (string, optional) —

**Example:**
```json
{
  "initScripts": [],
  "sparkAdvancedConfigurations": {},
  "sparkEnvVariables": {},
  "sparkVersion": "<string>",
  "type": "<string>"
}
```

**Request Body (`SubscriptionDetails`):**
- `callbackUrl` (string, optional) —
- `serviceName` (string, optional) —

**Example:**
```json
{
  "callbackUrl": "<string>",
  "serviceName": "<string>"
}
```

**Request Body (`WorkerConfig`):**
- `maxWorkerCount` (integer, optional) —
- `minWorkerCount` (integer, optional) —
- `workerShape` (string, optional) —
- `workerShapeConfig` (object, optional) —

**Example:**
```json
{
  "maxWorkerCount": 0,
  "minWorkerCount": 0,
  "workerShape": "<string>",
  "workerShapeConfig": {}
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
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.

**Request Body (`DownloadClusterLogsDetails`):**
- `clientContext` (string, optional) —
- `eventType` (string, optional) —
- `executionContextId` (string, optional) —
- `logContentTypeContains` (string, required) —
- `logLevel` (string, optional) —
- `logStreamTypeContains` (string, optional) —
- `opcRequestId` (string, optional) —
- `subjectContains` (string, optional) —
- `thread` (string, optional) —
- `timeBegin` (datetime, required) —
- `timeEnd` (datetime, required) —

**Example:**
```json
{
  "clientContext": "<string>",
  "eventType": "<string>",
  "executionContextId": "<string>",
  "logContentTypeContains": "<string>",
  "logLevel": "<string>",
  "logStreamTypeContains": "<string>",
  "opcRequestId": "<string>",
  "subjectContains": "<string>",
  "thread": "<string>",
  "timeBegin": "<string>",
  "timeEnd": "<string>"
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
- `state` (string, optional) — A filter to return only resources that match the given lifecycle state. The state value is case-insensitive. Allowed values are: "ACCEPTED", "CREATING", "ACTIVE", "DELETING", "DELETED", "FAILED", "STOPPING", "STOPPED", "UPDATING", "RESTARTING", "STARTING", "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS", "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL", "NETWORK_CONFIGURATION_ATTACH_FAILED", "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS", "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL", "NETWORK_CONFIGURATION_DETACH_FAILED"
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `display-name-contains` (string, optional) — A filter to return only resources that have a display name containing the text provided.
- `type` (string, optional) — Cluster type. When the filter is not provided list shows all cluster types - USER and AI_COMPUTE else it shows only cluster of type chosen. Only clusters of type USER are attachable to a workspace notebook.
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName"
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
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName"
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
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName"
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
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`AssignClusterPermissionDetails`):**
- `assignees` (object, required) —
- `permissions` (array, required) —

**Example:**
```json
{
  "assignees": {},
  "permissions": "READ"
}
```

**Request Body (`ManageClusterPermissionDetails`):**
- `assignClusterPermissionDetails` (object, optional) —
- `revokeClusterPermissionDetails` (object, optional) —

**Example:**
```json
{
  "assignClusterPermissionDetails": {},
  "revokeClusterPermissionDetails": {}
}
```

**Request Body (`PermissionAssignees`):**
- `targets` (array, required) —
- `type` (string, required) —

**Example:**
```json
{
  "targets": [],
  "type": "USER"
}
```

**Request Body (`RevokeClusterPermissionDetails`):**
- `assignees` (object, required) —
- `permissions` (array, required) —

**Example:**
```json
{
  "assignees": {},
  "permissions": "READ"
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
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`ClusterLibraryDetails`):**
- `operation` (string, required) —
- `type` (string, optional) —

**Example:**
```json
{
  "operation": "INSTALL",
  "type": "WORKSPACE_FILE"
}
```

**Request Body (`InstallClusterLibraryDetails`):**
- `operation` (string, optional) —
- `path` (string, optional) —
- `type` (string, optional) —

**Example:**
```json
{
  "operation": "<string>",
  "path": "<string>",
  "type": "<string>"
}
```

**Request Body (`PatchClusterLibraryDetails`):**
- `items` (array, required) —

**Example:**
```json
{
  "items": []
}
```

**Request Body (`UninstallClusterLibraryDetails`):**
- `name` (string, optional) —
- `operation` (string, optional) —
- `type` (string, optional) —

**Example:**
```json
{
  "name": "<string>",
  "operation": "<string>",
  "type": "<string>"
}
```
---
**Return:** [Back to Cluster](#cluster) • [Top](#top)

#### `aidp cluster query-replica-ids`
<a id="cluster-query-replica-ids"></a>
Queries compute replica identifiers for a compute cluster in the given workspace.
Queries compute replica identifiers for a compute cluster in the given workspace. The response contains distinct replica identifiers derived from the Monitoring agentNode metric dimension.

**Usage:**

`aidp cluster query-replica-ids <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <CLUSTER-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `cluster-key` (string, required) — Cluster key.
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`QueryReplicaIdsDetails`):**
- `metricName` (string, required) —
- `timeBegin` (datetime, required) —
- `timeEnd` (datetime, required) —

**Example:**
```json
{
  "metricName": "<string>",
  "timeBegin": "<string>",
  "timeEnd": "<string>"
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
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.

**Request Body (`SearchClusterLogsDetails`):**
- `advancedFilter` (string, optional) —
- `eventType` (string, optional) —
- `executionContextId` (string, optional) —
- `logContentTypeContains` (string, required) —
- `logLevel` (string, optional) —
- `logStreamTypeContains` (string, optional) —
- `messageContains` (string, optional) —
- `opcRequestId` (string, optional) —
- `subjectContains` (string, optional) —
- `thread` (string, optional) —
- `timeBegin` (datetime, required) —
- `timeEnd` (datetime, required) —

**Example:**
```json
{
  "advancedFilter": "<string>",
  "eventType": "<string>",
  "executionContextId": "<string>",
  "logContentTypeContains": "<string>",
  "logLevel": "<string>",
  "logStreamTypeContains": "<string>",
  "messageContains": "<string>",
  "opcRequestId": "<string>",
  "subjectContains": "<string>",
  "thread": "<string>",
  "timeBegin": "<string>",
  "timeEnd": "<string>"
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
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.

**Request Body (`SummarizeMetricsDataDetails`):**
- `agentNode` (string, optional) —
- `aggregationType` (string, required) —
- `interval` (string, required) —
- `metricName` (string, required) —
- `resolution` (string, optional) —
- `timeBegin` (datetime, required) —
- `timeEnd` (datetime, required) —

**Example:**
```json
{
  "agentNode": "<string>",
  "aggregationType": "MAX",
  "interval": "<string>",
  "metricName": "<string>",
  "resolution": "<string>",
  "timeBegin": "<string>",
  "timeEnd": "<string>"
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
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`ClusterRuntimeConfig`):**
- `initScripts` (array, optional) —
- `type` (string, optional) —

**Example:**
```json
{
  "initScripts": [],
  "type": "SPARK"
}
```

**Request Body (`DriverConfig`):**
- `driverNodeType` (string, optional) —
- `driverShape` (string, optional) —
- `driverShapeConfig` (object, optional) —

**Example:**
```json
{
  "driverNodeType": "<string>",
  "driverShape": "<string>",
  "driverShapeConfig": {}
}
```

**Request Body (`InitScriptPath`):**
- `destination` (string, required) —

**Example:**
```json
{
  "destination": "<string>"
}
```

**Request Body (`LogGroup`):**
- `compartmentId` (string, optional) —
- `groupName` (string, optional) —
- `logName` (string, optional) —

**Example:**
```json
{
  "compartmentId": "<string>",
  "groupName": "<string>",
  "logName": "<string>"
}
```

**Request Body (`LoggingConfig`):**
- `type` (string, optional) —

**Example:**
```json
{
  "type": "OCI_LOGGING"
}
```

**Request Body (`OciLogging`):**
- `logGroups` (array, optional) —
- `type` (string, optional) —

**Example:**
```json
{
  "logGroups": [],
  "type": "<string>"
}
```

**Request Body (`ReplicaConfig`):**
- `maxReplica` (integer, optional) —
- `minReplica` (integer, optional) —

**Example:**
```json
{
  "maxReplica": 0,
  "minReplica": 0
}
```

**Request Body (`ShapeConfig`):**
- `gpus` (integer, optional) —
- `memoryInGBs` (integer, optional) —
- `ocpus` (integer, optional) —

**Example:**
```json
{
  "gpus": 0,
  "memoryInGBs": 0,
  "ocpus": 0
}
```

**Request Body (`SparkRuntimeConfig`):**
- `initScripts` (array, optional) —
- `sparkAdvancedConfigurations` (object, optional) —
- `sparkEnvVariables` (object, optional) —
- `sparkVersion` (string, optional) —
- `type` (string, optional) —

**Example:**
```json
{
  "initScripts": [],
  "sparkAdvancedConfigurations": {},
  "sparkEnvVariables": {},
  "sparkVersion": "<string>",
  "type": "<string>"
}
```

**Request Body (`SubscriptionDetails`):**
- `callbackUrl` (string, optional) —
- `serviceName` (string, optional) —

**Example:**
```json
{
  "callbackUrl": "<string>",
  "serviceName": "<string>"
}
```

**Request Body (`UpdateAiComputeDetails`):**
- `description` (string, optional) —
- `displayName` (string, optional) —
- `driverConfig` (object, optional) —
- `nodeType` (string, optional) —
- `replicaConfig` (object, optional) —
- `type` (string, optional) —

**Example:**
```json
{
  "description": "<string>",
  "displayName": "<string>",
  "driverConfig": {},
  "nodeType": "<string>",
  "replicaConfig": {},
  "type": "<string>"
}
```

**Request Body (`UpdateClusterDetails`):**
- `description` (string, optional) —
- `displayName` (string, optional) —
- `driverConfig` (object, optional) —
- `nodeType` (string, optional) —
- `type` (string, required) —

**Example:**
```json
{
  "description": "<string>",
  "displayName": "<string>",
  "driverConfig": {},
  "nodeType": "<string>",
  "type": "USER"
}
```

**Request Body (`UpdateSparkClusterDetails`):**
- `autoTerminationMinutes` (integer, optional) —
- `clusterRuntimeConfig` (object, optional) —
- `description` (string, optional) —
- `displayName` (string, optional) —
- `driverConfig` (object, optional) —
- `loggingConfig` (object, optional) —
- `nodeType` (string, optional) —
- `subscription` (object, optional) —
- `type` (string, optional) —
- `workerConfig` (object, optional) —

**Example:**
```json
{
  "autoTerminationMinutes": 0,
  "clusterRuntimeConfig": {},
  "description": "<string>",
  "displayName": "<string>",
  "driverConfig": {},
  "loggingConfig": {},
  "nodeType": "<string>",
  "subscription": {},
  "type": "<string>",
  "workerConfig": {}
}
```

**Request Body (`WorkerConfig`):**
- `maxWorkerCount` (integer, optional) —
- `minWorkerCount` (integer, optional) —
- `workerShape` (string, optional) —
- `workerShapeConfig` (object, optional) —

**Example:**
```json
{
  "maxWorkerCount": 0,
  "minWorkerCount": 0,
  "workerShape": "<string>",
  "workerShapeConfig": {}
}
```
---
**Return:** [Back to Cluster](#cluster) • [Top](#top)

## <a id="credentials"></a>Credentials
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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`CreateDataLakeCredentialDetails`):**
- `credentialDescription` (string, optional) —
- `credentialDetails` (object, required) —
- `displayName` (string, required) —
- `type` (string, required) —

**Example:**
```json
{
  "credentialDescription": "<string>",
  "credentialDetails": {},
  "displayName": "<string>",
  "type": "SECRET_TOKEN"
}
```

**Request Body (`CredentialDetails`):**
- `credentialType` (string, required) —

**Example:**
```json
{
  "credentialType": "SECRET_TOKEN"
}
```

**Request Body (`SecretPair`):**
- `secretKey` (string, required) —
- `secretValue` (string, required) —

**Example:**
```json
{
  "secretKey": "<string>",
  "secretValue": "<string>"
}
```

**Request Body (`SecretTokenCredentialDetails`):**
- `credentialType` (string, optional) —
- `secretTokenPair` (array, required) —

**Example:**
```json
{
  "credentialType": "<string>",
  "secretTokenPair": []
}
```

**Request Body (`ServiceAccountCredentialDetails`):**
- `credentialType` (string, optional) —
- `fingerprint` (string, required) —
- `isReadOnly` (boolean, required) —
- `privateKey` (string, required) —
- `region` (string, required) —
- `tenancy` (string, required) —
- `userId` (string, required) —

**Example:**
```json
{
  "credentialType": "<string>",
  "fingerprint": "<string>",
  "isReadOnly": true,
  "privateKey": "<string>",
  "region": "<string>",
  "tenancy": "<string>",
  "userId": "<string>"
}
```

**Request Body (`VaultReferenceCredentialDetails`):**
- `credentialType` (string, optional) —
- `secretId` (string, required) —

**Example:**
```json
{
  "credentialType": "<string>",
  "secretId": "<string>"
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
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "name"
- `credential-type` (string, optional) — The type of the Credential Allowed values are: "SECRET_TOKEN", "VAULT_REFERENCE", "SERVICE_ACCOUNT"
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
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`CredentialDetails`):**
- `credentialType` (string, required) —

**Example:**
```json
{
  "credentialType": "SECRET_TOKEN"
}
```

**Request Body (`SecretPair`):**
- `secretKey` (string, required) —
- `secretValue` (string, required) —

**Example:**
```json
{
  "secretKey": "<string>",
  "secretValue": "<string>"
}
```

**Request Body (`SecretTokenCredentialDetails`):**
- `credentialType` (string, optional) —
- `secretTokenPair` (array, required) —

**Example:**
```json
{
  "credentialType": "<string>",
  "secretTokenPair": []
}
```

**Request Body (`ServiceAccountCredentialDetails`):**
- `credentialType` (string, optional) —
- `fingerprint` (string, required) —
- `isReadOnly` (boolean, required) —
- `privateKey` (string, required) —
- `region` (string, required) —
- `tenancy` (string, required) —
- `userId` (string, required) —

**Example:**
```json
{
  "credentialType": "<string>",
  "fingerprint": "<string>",
  "isReadOnly": true,
  "privateKey": "<string>",
  "region": "<string>",
  "tenancy": "<string>",
  "userId": "<string>"
}
```

**Request Body (`UpdateDataLakeCredentialDetails`):**
- `credentialDescription` (string, optional) —
- `credentialDetails` (object, optional) —
- `displayName` (string, optional) —
- `type` (string, optional) —

**Example:**
```json
{
  "credentialDescription": "<string>",
  "credentialDetails": {},
  "displayName": "<string>",
  "type": "SECRET_TOKEN"
}
```

**Request Body (`VaultReferenceCredentialDetails`):**
- `credentialType` (string, optional) —
- `secretId` (string, required) —

**Example:**
```json
{
  "credentialType": "<string>",
  "secretId": "<string>"
}
```
---
**Return:** [Back to Credentials](#credentials) • [Top](#top)

## <a id="delta-share"></a>Delta Share
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
Creates a Delta Share protocol.

**Usage:**

`aidp delta-share create <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`CreateShareDetails`):**
- `description` (string, optional) —
- `displayName` (string, required) —

**Example:**
```json
{
  "description": "<string>",
  "displayName": "<string>"
}
```
---
**Return:** [Back to Delta-Share](#delta-share) • [Top](#top)

#### `aidp delta-share create-recipient`
<a id="delta-share-create-recipient"></a>
Creates a recipient for a Delta Share protocol.

**Usage:**

`aidp delta-share create-recipient <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`CreateRecipientDetails`):**
- `description` (string, optional) —
- `displayName` (string, required) —
- `properties` (object, optional) —

**Example:**
```json
{
  "description": "<string>",
  "displayName": "<string>",
  "properties": {}
}
```
---
**Return:** [Back to Delta-Share](#delta-share) • [Top](#top)

#### `aidp delta-share delete`
<a id="delta-share-delete"></a>
Deletes a Delta Share.

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
**Return:** [Back to Delta-Share](#delta-share) • [Top](#top)

#### `aidp delta-share delete-recipient`
<a id="delta-share-delete-recipient"></a>
Deletes a Delta Share recipient.

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
**Return:** [Back to Delta-Share](#delta-share) • [Top](#top)

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
**Return:** [Back to Delta-Share](#delta-share) • [Top](#top)

#### `aidp delta-share get-recipient`
<a id="delta-share-get-recipient"></a>
Gets detailed information about a Delta Share recipient.

**Usage:**

`aidp delta-share get-recipient <AI-DATA-PLATFORM-ID> <RECIPIENT-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `recipient-key` (string, required) — The key of the recipient resource
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---
**Return:** [Back to Delta-Share](#delta-share) • [Top](#top)

#### `aidp delta-share list`
<a id="delta-share-list"></a>
Gets a list of Delta Shares.

**Usage:**

`aidp delta-share list <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
**Options:**
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName"
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Delta-Share](#delta-share) • [Top](#top)

#### `aidp delta-share list-data-assets`
<a id="delta-share-list-data-assets"></a>
Gets a list of Delta Share assets.

**Usage:**

`aidp delta-share list-data-assets <AI-DATA-PLATFORM-ID> <SHARE-KEY>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `share-key` (string, required) — The unique key of the Share.
**Options:**
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName"
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---
**Return:** [Back to Delta-Share](#delta-share) • [Top](#top)

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
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for grantee is ascending. Default order for granteeType is ascending. Allowed values are: "grantee", "granteeType"
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---
**Return:** [Back to Delta-Share](#delta-share) • [Top](#top)

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
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. Default order for grantee is ascending. Allowed values are: "grantee"
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---
**Return:** [Back to Delta-Share](#delta-share) • [Top](#top)

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
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName"
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---
**Return:** [Back to Delta-Share](#delta-share) • [Top](#top)

#### `aidp delta-share list-recipients`
<a id="delta-share-list-recipients"></a>
Gets a list of Delta Share recipients.

**Usage:**

`aidp delta-share list-recipients <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
**Options:**
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName"
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Delta-Share](#delta-share) • [Top](#top)

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
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName"
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---
**Return:** [Back to Delta-Share](#delta-share) • [Top](#top)

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
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`ManageShareAccessDetails`):**
- `action` (string, required) —
- `recipient` (string, required) —

**Example:**
```json
{
  "action": "GRANT",
  "recipient": "<string>"
}
```
---
**Return:** [Back to Delta-Share](#delta-share) • [Top](#top)

#### `aidp delta-share manage-data-asset`
<a id="delta-share-manage-data-asset"></a>
Updates data assets on a Delta Share with the provided information.

**Usage:**

`aidp delta-share manage-data-asset <AI-DATA-PLATFORM-ID> <SHARE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `share-key` (string, required) — The unique key of the Share.
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`ManageShareDataAssetDetails`):**
- `action` (string, required) —
- `alias` (string, optional) —
- `description` (string, optional) —
- `name` (string, required) —
- `partition` (string, optional) —
- `type` (string, required) —

**Example:**
```json
{
  "action": "ADD",
  "alias": "<string>",
  "description": "<string>",
  "name": "<string>",
  "partition": "<string>",
  "type": "SCHEMA"
}
```
---
**Return:** [Back to Delta-Share](#delta-share) • [Top](#top)

#### `aidp delta-share manage-permission`
<a id="delta-share-manage-permission"></a>
Updates permissions on a Delta Share.

**Usage:**

`aidp delta-share manage-permission <AI-DATA-PLATFORM-ID> <SHARE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `share-key` (string, required) — The unique key of the Share.
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`AssignSharePermissionDetails`):**
- `assignees` (object, required) —
- `permissions` (array, required) —

**Example:**
```json
{
  "assignees": {},
  "permissions": "ADMIN"
}
```

**Request Body (`ManageSharePermissionDetails`):**
- `assignSharePermissionDetails` (object, optional) —
- `revokeSharePermissionDetails` (object, optional) —

**Example:**
```json
{
  "assignSharePermissionDetails": {},
  "revokeSharePermissionDetails": {}
}
```

**Request Body (`PermissionAssignees`):**
- `targets` (array, required) —
- `type` (string, required) —

**Example:**
```json
{
  "targets": [],
  "type": "USER"
}
```

**Request Body (`RevokeSharePermissionDetails`):**
- `assignees` (object, required) —
- `permissions` (array, required) —

**Example:**
```json
{
  "assignees": {},
  "permissions": "ADMIN"
}
```
---
**Return:** [Back to Delta-Share](#delta-share) • [Top](#top)

#### `aidp delta-share manage-recipient-permission`
<a id="delta-share-manage-recipient-permission"></a>
Updates the permissions of a Delta Share recipient.

**Usage:**

`aidp delta-share manage-recipient-permission <AI-DATA-PLATFORM-ID> <RECIPIENT-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `recipient-key` (string, required) — The key of the recipient resource
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`AssignRecipientPermissionDetails`):**
- `assignees` (object, required) —
- `permissions` (array, required) —

**Example:**
```json
{
  "assignees": {},
  "permissions": "ADMIN"
}
```

**Request Body (`ManageRecipientPermissionDetails`):**
- `assignRecipientPermissionDetails` (object, optional) —
- `revokeRecipientPermissionDetails` (object, optional) —

**Example:**
```json
{
  "assignRecipientPermissionDetails": {},
  "revokeRecipientPermissionDetails": {}
}
```

**Request Body (`PermissionAssignees`):**
- `targets` (array, required) —
- `type` (string, required) —

**Example:**
```json
{
  "targets": [],
  "type": "USER"
}
```

**Request Body (`RevokeRecipientPermissionDetails`):**
- `assignees` (object, required) —
- `permissions` (array, required) —

**Example:**
```json
{
  "assignees": {},
  "permissions": "ADMIN"
}
```
---
**Return:** [Back to Delta-Share](#delta-share) • [Top](#top)

#### `aidp delta-share update`
<a id="delta-share-update"></a>
Update a Delta Share with the provided metadata.

**Usage:**

`aidp delta-share update <AI-DATA-PLATFORM-ID> <SHARE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `share-key` (string, required) — The unique key of the Share.
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`UpdateShareDetails`):**
- `description` (string, optional) —
- `displayName` (string, optional) —

**Example:**
```json
{
  "description": "<string>",
  "displayName": "<string>"
}
```
---
**Return:** [Back to Delta-Share](#delta-share) • [Top](#top)

#### `aidp delta-share update-recipient`
<a id="delta-share-update-recipient"></a>
Updates the metadata of a Delta Share recipient.

**Usage:**

`aidp delta-share update-recipient <AI-DATA-PLATFORM-ID> <RECIPIENT-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `recipient-key` (string, required) — The key of the recipient resource
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`UpdateRecipientDetails`):**
- `description` (string, optional) —
- `displayName` (string, optional) —
- `properties` (object, optional) —

**Example:**
```json
{
  "description": "<string>",
  "displayName": "<string>",
  "properties": {}
}
```
---
**Return:** [Back to Delta-Share](#delta-share) • [Top](#top)

## <a id="mlops"></a>ML Ops
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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`CreateExperimentDetails`):**
- `artifact_location` (string, optional) —
- `name` (string, required) —
- `tags` (array, optional) —

**Example:**
```json
{
  "artifact_location": "<string>",
  "name": "<string>",
  "tags": []
}
```

**Request Body (`ExperimentTag`):**
- `key` (string, required) —
- `value` (string, optional) —

**Example:**
```json
{
  "key": "<string>",
  "value": "<string>"
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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`CreateExperimentRunDetails`):**
- `experiment_id` (string, optional) —
- `run_name` (string, optional) —
- `start_time` (integer, optional) —
- `tags` (array, optional) —

**Example:**
```json
{
  "experiment_id": "<string>",
  "run_name": "<string>",
  "start_time": 0,
  "tags": []
}
```

**Request Body (`ExperimentRunTag`):**
- `key` (string, optional) —
- `value` (string, optional) —

**Example:**
```json
{
  "key": "<string>",
  "value": "<string>"
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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`CreateModelVersionDetails`):**
- `description` (string, optional) —
- `model_id` (string, optional) —
- `name` (string, required) —
- `run_id` (string, optional) —
- `run_link` (string, optional) —
- `source` (string, required) —
- `tags` (array, optional) —

**Example:**
```json
{
  "description": "<string>",
  "model_id": "<string>",
  "name": "<string>",
  "run_id": "<string>",
  "run_link": "<string>",
  "source": "<string>",
  "tags": []
}
```

**Request Body (`ModelVersionTag`):**
- `key` (string, optional) —
- `value` (string, optional) —

**Example:**
```json
{
  "key": "<string>",
  "value": "<string>"
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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`CreateRegisteredModelDetails`):**
- `deployment_job_id` (string, optional) —
- `description` (string, optional) —
- `name` (string, required) —
- `tags` (array, optional) —

**Example:**
```json
{
  "deployment_job_id": "<string>",
  "description": "<string>",
  "name": "<string>",
  "tags": []
}
```

**Request Body (`RegisteredModelTag`):**
- `key` (string, optional) —
- `value` (string, optional) —

**Example:**
```json
{
  "key": "<string>",
  "value": "<string>"
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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`CreateModelVersionDetails`):**
- `description` (string, optional) —
- `model_id` (string, optional) —
- `name` (string, required) —
- `run_id` (string, optional) —
- `run_link` (string, optional) —
- `source` (string, required) —
- `tags` (array, optional) —

**Example:**
```json
{
  "description": "<string>",
  "model_id": "<string>",
  "name": "<string>",
  "run_id": "<string>",
  "run_link": "<string>",
  "source": "<string>",
  "tags": []
}
```

**Request Body (`ModelVersionTag`):**
- `key` (string, optional) —
- `value` (string, optional) —

**Example:**
```json
{
  "key": "<string>",
  "value": "<string>"
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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`DeleteExperimentDetails`):**
- `experiment_id` (string, required) —

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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`DeleteExperimentRunDetails`):**
- `run_id` (string, required) —

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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`DeleteExperimentRunTagDetails`):**
- `key` (string, required) —
- `run_id` (string, required) —

**Example:**
```json
{
  "key": "<string>",
  "run_id": "<string>"
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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`DeleteExperimentTagDetails`):**
- `experiment_id` (string, required) —
- `key` (string, required) —

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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`DeleteModelVersionDetails`):**
- `name` (string, required) —
- `version` (string, required) —

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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`DeleteModelVersionTagDetails`):**
- `key` (string, required) —
- `name` (string, required) —
- `version` (string, required) —

**Example:**
```json
{
  "key": "<string>",
  "name": "<string>",
  "version": "<string>"
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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`DeleteRegisteredModelDetails`):**
- `name` (string, required) —

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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`DeleteRegisteredModelTagDetails`):**
- `key` (string, required) —
- `name` (string, required) —

**Example:**
```json
{
  "key": "<string>",
  "name": "<string>"
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
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`ListExperimentRunsDetails`):**
- `experiment_ids` (array, optional) —
- `filter` (string, optional) —
- `max_results` (integer, optional) —
- `order_by` (array, optional) —
- `page_token` (string, optional) —
- `run_view_type` (string, optional) —

**Example:**
```json
{
  "experiment_ids": [],
  "filter": "<string>",
  "max_results": 0,
  "order_by": [],
  "page_token": "<string>",
  "run_view_type": "ACTIVE_ONLY"
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
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`ListExperimentsDetails`):**
- `filter` (string, optional) —
- `max_results` (integer, optional) —
- `order_by` (array, optional) —
- `page_token` (string, optional) —
- `view_type` (string, optional) —

**Example:**
```json
{
  "filter": "<string>",
  "max_results": 0,
  "order_by": [],
  "page_token": "<string>",
  "view_type": "ACTIVE_ONLY"
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
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`ListLoggedModelsDetails`):**
- `experiment_ids` (array, optional) —
- `filter` (string, optional) —
- `max_results` (integer, optional) —
- `order_by` (array, optional) —
- `page_token` (string, optional) —

**Example:**
```json
{
  "experiment_ids": [],
  "filter": "<string>",
  "max_results": 0,
  "order_by": [],
  "page_token": "<string>"
}
```

**Request Body (`LoggedModelOrder`):**
- `ascending` (boolean, optional) —
- `field_name` (string, required) —

**Example:**
```json
{
  "ascending": true,
  "field_name": "<string>"
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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`ExperimentRunMetric`):**
- `key` (string, optional) —
- `step` (integer, optional) —
- `timestamp` (integer, optional) —
- `value` (number, optional) —

**Example:**
```json
{
  "key": "<string>",
  "step": 0,
  "timestamp": 0,
  "value": 0
}
```

**Request Body (`ExperimentRunParam`):**
- `key` (string, optional) —
- `value` (string, optional) —

**Example:**
```json
{
  "key": "<string>",
  "value": "<string>"
}
```

**Request Body (`ExperimentRunTag`):**
- `key` (string, optional) —
- `value` (string, optional) —

**Example:**
```json
{
  "key": "<string>",
  "value": "<string>"
}
```

**Request Body (`LogExperimentRunBatchDetails`):**
- `metrics` (array, optional) —
- `params` (array, optional) —
- `run_id` (string, required) —
- `tags` (array, optional) —

**Example:**
```json
{
  "metrics": [],
  "params": [],
  "run_id": "<string>",
  "tags": []
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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`Dataset`):**
- `digest` (string, required) —
- `name` (string, required) —
- `profile` (string, optional) —
- `schema` (string, optional) —
- `source` (string, required) —
- `source_type` (string, required) —

**Example:**
```json
{
  "digest": "<string>",
  "name": "<string>",
  "profile": "<string>",
  "schema": "<string>",
  "source": "<string>",
  "source_type": "<string>"
}
```

**Request Body (`DatasetInput`):**
- `dataset` (object, required) —
- `tags` (array, optional) —

**Example:**
```json
{
  "dataset": {},
  "tags": []
}
```

**Request Body (`InputTag`):**
- `key` (string, required) —
- `value` (string, required) —

**Example:**
```json
{
  "key": "<string>",
  "value": "<string>"
}
```

**Request Body (`LogExperimentRunInputsDetails`):**
- `dataset_inputs` (array, optional) —
- `run_id` (string, required) —

**Example:**
```json
{
  "dataset_inputs": [],
  "run_id": "<string>"
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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`LogExperimentRunMetricDetails`):**
- `key` (string, required) —
- `run_id` (string, required) —
- `step` (integer, optional) —
- `timestamp` (integer, required) —
- `value` (number, required) —

**Example:**
```json
{
  "key": "<string>",
  "run_id": "<string>",
  "step": 0,
  "timestamp": 0,
  "value": 0
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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`LogExperimentRunModelDetails`):**
- `model_json` (string, required) —
- `run_id` (string, required) —

**Example:**
```json
{
  "model_json": "<string>",
  "run_id": "<string>"
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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`LogExperimentRunParamDetails`):**
- `key` (string, required) —
- `run_id` (string, required) —
- `value` (string, required) —

**Example:**
```json
{
  "key": "<string>",
  "run_id": "<string>",
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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`RenameRegisteredModelDetails`):**
- `name` (string, required) —
- `new_name` (string, optional) —

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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`RestoreExperimentDetails`):**
- `experiment_id` (string, required) —

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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`RestoreExperimentRunDetails`):**
- `run_id` (string, required) —

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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`SetExperimentRunTagDetails`):**
- `key` (string, required) —
- `run_id` (string, required) —
- `value` (string, required) —

**Example:**
```json
{
  "key": "<string>",
  "run_id": "<string>",
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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`SetExperimentTagDetails`):**
- `experiment_id` (string, required) —
- `key` (string, required) —
- `value` (string, required) —

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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`SetModelVersionTagDetails`):**
- `key` (string, required) —
- `name` (string, required) —
- `value` (string, required) —
- `version` (string, required) —

**Example:**
```json
{
  "key": "<string>",
  "name": "<string>",
  "value": "<string>",
  "version": "<string>"
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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`SetRegisteredModelTagDetails`):**
- `key` (string, required) —
- `name` (string, required) —
- `value` (string, required) —

**Example:**
```json
{
  "key": "<string>",
  "name": "<string>",
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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`TransitionModelVersionStageDetails`):**
- `archive_existing_versions` (boolean, required) —
- `name` (string, required) —
- `stage` (string, required) —
- `version` (string, required) —

**Example:**
```json
{
  "archive_existing_versions": true,
  "name": "<string>",
  "stage": "<string>",
  "version": "<string>"
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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`UpdateExperimentDetails`):**
- `experiment_id` (string, required) —
- `new_name` (string, optional) —

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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`UpdateExperimentRunDetails`):**
- `end_time` (integer, optional) —
- `run_id` (string, required) —
- `run_name` (string, optional) —
- `status` (string, optional) —

**Example:**
```json
{
  "end_time": 0,
  "run_id": "<string>",
  "run_name": "<string>",
  "status": "RUNNING"
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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`ExperimentRunTag`):**
- `key` (string, optional) —
- `value` (string, optional) —

**Example:**
```json
{
  "key": "<string>",
  "value": "<string>"
}
```

**Request Body (`ExperimentRunTagKey`):**
- `key` (string, required) —

**Example:**
```json
{
  "key": "<string>"
}
```

**Request Body (`UpdateExperimentRunTagsDetails`):**
- `delete_tags` (array, optional) —
- `run_id` (string, required) —
- `set_tags` (array, optional) —

**Example:**
```json
{
  "delete_tags": [],
  "run_id": "<string>",
  "set_tags": []
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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`ExperimentTag`):**
- `key` (string, required) —
- `value` (string, optional) —

**Example:**
```json
{
  "key": "<string>",
  "value": "<string>"
}
```

**Request Body (`ExperimentTagKey`):**
- `key` (string, required) —

**Example:**
```json
{
  "key": "<string>"
}
```

**Request Body (`UpdateExperimentTagsDetails`):**
- `delete_tags` (array, optional) —
- `experiment_id` (string, required) —
- `set_tags` (array, optional) —

**Example:**
```json
{
  "delete_tags": [],
  "experiment_id": "<string>",
  "set_tags": []
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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`UpdateModelVersionDetails`):**
- `description` (string, optional) —
- `name` (string, required) —
- `version` (string, required) —

**Example:**
```json
{
  "description": "<string>",
  "name": "<string>",
  "version": "<string>"
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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`ModelVersionTag`):**
- `key` (string, optional) —
- `value` (string, optional) —

**Example:**
```json
{
  "key": "<string>",
  "value": "<string>"
}
```

**Request Body (`ModelVersionTagKey`):**
- `key` (string, required) —

**Example:**
```json
{
  "key": "<string>"
}
```

**Request Body (`UpdateModelVersionTagsDetails`):**
- `delete_tags` (array, optional) —
- `name` (string, required) —
- `set_tags` (array, optional) —
- `version` (string, required) —

**Example:**
```json
{
  "delete_tags": [],
  "name": "<string>",
  "set_tags": [],
  "version": "<string>"
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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`UpdateRegisteredModelDetails`):**
- `deployment_job_id` (string, optional) —
- `description` (string, optional) —
- `name` (string, required) —

**Example:**
```json
{
  "deployment_job_id": "<string>",
  "description": "<string>",
  "name": "<string>"
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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`RegisteredModelTag`):**
- `key` (string, optional) —
- `value` (string, optional) —

**Example:**
```json
{
  "key": "<string>",
  "value": "<string>"
}
```

**Request Body (`RegisteredModelTagKey`):**
- `key` (string, required) —

**Example:**
```json
{
  "key": "<string>"
}
```

**Request Body (`UpdateRegisteredModelTagsDetails`):**
- `delete_tags` (array, optional) —
- `name` (string, required) —
- `set_tags` (array, optional) —

**Example:**
```json
{
  "delete_tags": [],
  "name": "<string>",
  "set_tags": []
}
```
---
**Return:** [Back to Mlops](#mlops) • [Top](#top)

## <a id="notebook"></a>Notebook
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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `datalake-tenant-id` (string, optional) — The tenant ID header.

**Request Body (`CreateContentDetails`):**
- `copy_from` (string, optional) —
- `ext` (string, optional) —
- `type` (string, optional) —

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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `datalake-tenant-id` (string, optional) — The tenant ID header.

**Request Body (`CreateSessionDetails`):**
- `agentFlowKey` (string, optional) —
- `cluster_id` (string, optional) —
- `id` (string, optional) —
- `kernel` (object, optional) —
- `name` (string, optional) —
- `path` (string, optional) —
- `type` (string, optional) —

**Example:**
```json
{
  "agentFlowKey": "<string>",
  "cluster_id": "<string>",
  "id": "<string>",
  "kernel": {},
  "name": "<string>",
  "path": "<string>",
  "type": "<string>"
}
```

**Request Body (`Kernel`):**
- `connections` (integer, optional) —
- `execution_state` (string, optional) —
- `id` (string, optional) —
- `last_activity` (string, optional) —
- `name` (string, optional) —

**Example:**
```json
{
  "connections": 0,
  "execution_state": "unknown",
  "id": "<string>",
  "last_activity": "<string>",
  "name": "<string>"
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
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`ExportContentsDetails`):**
- `format` (string, optional) —

**Example:**
```json
{
  "format": "ipynb"
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
- `type` (string, optional) — Content type. Either file, directory, or notebook. Allowed values are: "file", "directory", "notebook"
- `format` (string, optional) — The format in which content should be returned. Either text, base64, or JSON. Allowed values are: "text", "base64", "json"
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
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`ModifyContentDetails`):**
- `path` (string, optional) —

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
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`Kernel`):**
- `connections` (integer, optional) —
- `execution_state` (string, optional) —
- `id` (string, optional) —
- `last_activity` (string, optional) —
- `name` (string, optional) —

**Example:**
```json
{
  "connections": 0,
  "execution_state": "unknown",
  "id": "<string>",
  "last_activity": "<string>",
  "name": "<string>"
}
```

**Request Body (`PatchSessionDetails`):**
- `cluster_id` (string, optional) —
- `id` (string, optional) —
- `kernel` (object, optional) —
- `must_refresh_context` (boolean, optional) —
- `name` (string, optional) —
- `path` (string, optional) —
- `type` (string, optional) —

**Example:**
```json
{
  "cluster_id": "<string>",
  "id": "<string>",
  "kernel": {},
  "must_refresh_context": true,
  "name": "<string>",
  "path": "<string>",
  "type": "<string>"
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
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`UpdateContentDetails`):**
- `content` (object, optional) —
- `format` (string, optional) —
- `name` (string, optional) —
- `path` (string, optional) —
- `type` (string, optional) —

**Example:**
```json
{
  "content": {},
  "format": "NULL",
  "name": "<string>",
  "path": "<string>",
  "type": "notebook"
}
```
---
**Return:** [Back to Notebook](#notebook) • [Top](#top)

## <a id="role"></a>Role
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
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`AddMemberToRoleDetails`):**
- `assignees` (array, required) —

**Example:**
```json
{
  "assignees": []
}
```

**Request Body (`RoleAssignee`):**
- `target` (string, required) —
- `targetName` (string, optional) —
- `type` (string, required) —

**Example:**
```json
{
  "target": "<string>",
  "targetName": "<string>",
  "type": "USER"
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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`CreateRoleDetails`):**
- `description` (string, optional) —
- `displayName` (string, required) —

**Example:**
```json
{
  "description": "<string>",
  "displayName": "<string>"
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
- `role-scope` (string, optional) — The scope of roles to be returned. Defaults to USER. Allowed values are: "USER", "ADMIN", "MEMBER_OF"
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
- `lifecycle-state` (string, optional) — A filter to return only resources that match the given lifecycle state. The state value is case-insensitive. Allowed values are: "ACTIVE"
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName"
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
- `permission-scope` (string, optional) — The scope of role permissions to be returned. Defaults to ALL Allowed values are: "DIRECT", "INHERITED", "ALL"
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName"
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
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`RemoveMemberFromRoleDetails`):**
- `assignees` (array, required) —

**Example:**
```json
{
  "assignees": []
}
```

**Request Body (`RoleAssignee`):**
- `target` (string, required) —
- `targetName` (string, optional) —
- `type` (string, required) —

**Example:**
```json
{
  "target": "<string>",
  "targetName": "<string>",
  "type": "USER"
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
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`UpdateRoleDetails`):**
- `description` (string, optional) —
- `displayName` (string, optional) —

**Example:**
```json
{
  "description": "<string>",
  "displayName": "<string>"
}
```
---
**Return:** [Back to Role](#role) • [Top](#top)

## <a id="schema"></a>Schema
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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`CreateSchemaDetails`):**
- `catalogName` (string, required) —
- `description` (string, optional) —
- `displayName` (string, required) —
- `properties` (object, optional) —

**Example:**
```json
{
  "catalogName": "<string>",
  "description": "<string>",
  "displayName": "<string>",
  "properties": {}
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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`CreateDataTableDetails`):**
- `catalogKey` (string, required) —
- `description` (string, optional) —
- `displayName` (string, required) —
- `fileFormat` (string, required) —
- `managedTableDefinition` (object, required) —
- `objectStorageLocationPath` (string, required) —
- `partitionKeys` (array, optional) —
- `schemaKey` (string, required) —
- `selectedColumns` (array, required) —
- `tableFields` (array, required) —
- `tableProperties` (array, optional) —

**Example:**
```json
{
  "catalogKey": "<string>",
  "description": "<string>",
  "displayName": "<string>",
  "fileFormat": "AVRO",
  "managedTableDefinition": {},
  "objectStorageLocationPath": "<string>",
  "partitionKeys": [],
  "schemaKey": "<string>",
  "selectedColumns": [],
  "tableFields": [],
  "tableProperties": []
}
```

**Request Body (`ManagedTableDefinition`):**
- `managedTableDataFormat` (string, required) —

**Example:**
```json
{
  "managedTableDataFormat": "AVRO"
}
```

**Request Body (`TableFieldDetails`):**
- `fieldDescription` (string, optional) —
- `fieldName` (string, required) —
- `fieldPrecision` (string, optional) —
- `fieldScale` (string, optional) —
- `fieldType` (string, optional) —

**Example:**
```json
{
  "fieldDescription": "<string>",
  "fieldName": "<string>",
  "fieldPrecision": "<string>",
  "fieldScale": "<string>",
  "fieldType": "<string>"
}
```

**Request Body (`TableProperty`):**
- `propertyName` (string, required) —
- `propertyValue` (string, optional) —

**Example:**
```json
{
  "propertyName": "<string>",
  "propertyValue": "<string>"
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
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`CreateTableDetails`):**
- `catalogKey` (string, required) —
- `description` (string, optional) —
- `displayName` (string, required) —
- `externalTableDefinition` (object, optional) —
- `managedTableDefinition` (object, optional) —
- `partitionKeys` (array, optional) —
- `schemaKey` (string, required) —
- `tableFields` (array, optional) —
- `tableProperties` (array, optional) —
- `tableType` (string, required) —

**Example:**
```json
{
  "catalogKey": "<string>",
  "description": "<string>",
  "displayName": "<string>",
  "externalTableDefinition": {},
  "managedTableDefinition": {},
  "partitionKeys": [],
  "schemaKey": "<string>",
  "tableFields": [],
  "tableProperties": [],
  "tableType": "MANAGED"
}
```

**Request Body (`ExternalTableDefinition`):**
- `externalTableDataFormat` (string, required) —
- `externalTableLocationType` (string, optional) —
- `objectStorageLocationPath` (string, optional) —
- `txtFileDefinition` (object, optional) —

**Example:**
```json
{
  "externalTableDataFormat": "AVRO",
  "externalTableLocationType": "OBJECT_STORAGE",
  "objectStorageLocationPath": "<string>",
  "txtFileDefinition": {}
}
```

**Request Body (`ManagedTableDefinition`):**
- `managedTableDataFormat` (string, required) —

**Example:**
```json
{
  "managedTableDataFormat": "AVRO"
}
```

**Request Body (`TableFieldDetails`):**
- `fieldDescription` (string, optional) —
- `fieldName` (string, required) —
- `fieldPrecision` (string, optional) —
- `fieldScale` (string, optional) —
- `fieldType` (string, optional) —

**Example:**
```json
{
  "fieldDescription": "<string>",
  "fieldName": "<string>",
  "fieldPrecision": "<string>",
  "fieldScale": "<string>",
  "fieldType": "<string>"
}
```

**Request Body (`TableProperty`):**
- `propertyName` (string, required) —
- `propertyValue` (string, optional) —

**Example:**
```json
{
  "propertyName": "<string>",
  "propertyValue": "<string>"
}
```

**Request Body (`TxtFileDefinition`):**
- `delimiter` (string, optional) —
- `quote` (string, optional) —

**Example:**
```json
{
  "delimiter": "<string>",
  "quote": "<string>"
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
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`CreateViewDetails`):**
- `catalogKey` (string, required) —
- `description` (string, optional) —
- `displayName` (string, required) —
- `schemaKey` (string, required) —
- `viewFields` (array, optional) —
- `viewProperties` (array, optional) —
- `viewText` (string, required) —

**Example:**
```json
{
  "catalogKey": "<string>",
  "description": "<string>",
  "displayName": "<string>",
  "schemaKey": "<string>",
  "viewFields": [],
  "viewProperties": [],
  "viewText": "<string>"
}
```

**Request Body (`ViewFieldDetails`):**
- `fieldDescription` (string, optional) —
- `fieldName` (string, required) —
- `fieldPrecision` (string, optional) —
- `fieldScale` (string, optional) —
- `fieldType` (string, optional) —

**Example:**
```json
{
  "fieldDescription": "<string>",
  "fieldName": "<string>",
  "fieldPrecision": "<string>",
  "fieldScale": "<string>",
  "fieldType": "<string>"
}
```

**Request Body (`ViewProperty`):**
- `propertyName` (string, required) —
- `propertyValue` (string, optional) —

**Example:**
```json
{
  "propertyName": "<string>",
  "propertyValue": "<string>"
}
```
---
**Return:** [Back to Schema](#schema) • [Top](#top)

#### `aidp schema delete`
<a id="schema-delete"></a>
Deletes a schema.

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
Deletes a table.

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
Deletes a view.

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
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`InferSchemaProperties`):**
- `propertyName` (string, optional) —
- `propertyValue` (string, optional) —

**Example:**
```json
{
  "propertyName": "<string>",
  "propertyValue": "<string>"
}
```

**Request Body (`PerformInferSchemaDetails`):**
- `dataFormat` (string, required) —
- `inferSchemaProperties` (array, optional) —
- `location` (string, required) —
- `numberOfPartitions` (integer, optional) —

**Example:**
```json
{
  "dataFormat": "AVRO",
  "inferSchemaProperties": [],
  "location": "<string>",
  "numberOfPartitions": 0
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
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`InferSchemaProperties`):**
- `propertyName` (string, optional) —
- `propertyValue` (string, optional) —

**Example:**
```json
{
  "propertyName": "<string>",
  "propertyValue": "<string>"
}
```

**Request Body (`PerformInferSchemaDetails`):**
- `dataFormat` (string, required) —
- `inferSchemaProperties` (array, optional) —
- `location` (string, required) —
- `numberOfPartitions` (integer, optional) —

**Example:**
```json
{
  "dataFormat": "AVRO",
  "inferSchemaProperties": [],
  "location": "<string>",
  "numberOfPartitions": 0
}
```
---
**Return:** [Back to Schema](#schema) • [Top](#top)

#### `aidp schema list`
<a id="schema-list"></a>
Returns a list of schemas.

**Usage:**

`aidp schema list <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
**Options:**
- `catalog-key` (string, required) — The key of the catalog.
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName"
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
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName"
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
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName"
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
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName"
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
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName"
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
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName"
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
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`AssignSchemaPermissionDetails`):**
- `assignees` (object, required) —
- `permissions` (array, required) —

**Example:**
```json
{
  "assignees": {},
  "permissions": "SELECT"
}
```

**Request Body (`ManageSchemaPermissionDetails`):**
- `assignSchemaPermissionDetails` (object, optional) —
- `revokeSchemaPermissionDetails` (object, optional) —

**Example:**
```json
{
  "assignSchemaPermissionDetails": {},
  "revokeSchemaPermissionDetails": {}
}
```

**Request Body (`PermissionAssignees`):**
- `targets` (array, required) —
- `type` (string, required) —

**Example:**
```json
{
  "targets": [],
  "type": "USER"
}
```

**Request Body (`RevokeSchemaPermissionDetails`):**
- `assignees` (object, required) —
- `permissions` (array, required) —

**Example:**
```json
{
  "assignees": {},
  "permissions": "SELECT"
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
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`AssignTablePermissionDetails`):**
- `assignees` (object, required) —
- `excludeColumns` (array, required) —
- `includeColumns` (array, required) —
- `permissions` (array, required) —
- `rowFilter` (string, optional) —
- `rowFilterType` (string, optional) —

**Example:**
```json
{
  "assignees": {},
  "excludeColumns": [],
  "includeColumns": [],
  "permissions": "SELECT",
  "rowFilter": "<string>",
  "rowFilterType": "SQL"
}
```

**Request Body (`ManageTablePermissionDetails`):**
- `assignTablePermissionDetails` (object, optional) —
- `revokeTablePermissionDetails` (object, optional) —

**Example:**
```json
{
  "assignTablePermissionDetails": {},
  "revokeTablePermissionDetails": {}
}
```

**Request Body (`PermissionAssignees`):**
- `targets` (array, required) —
- `type` (string, required) —

**Example:**
```json
{
  "targets": [],
  "type": "USER"
}
```

**Request Body (`RevokeTablePermissionDetails`):**
- `assignees` (object, required) —
- `excludeColumns` (array, required) —
- `includeColumns` (array, required) —
- `permissions` (array, required) —
- `rowFilter` (string, optional) —
- `rowFilterType` (string, optional) —

**Example:**
```json
{
  "assignees": {},
  "excludeColumns": [],
  "includeColumns": [],
  "permissions": "SELECT",
  "rowFilter": "<string>",
  "rowFilterType": "SQL"
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
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`AssignViewPermissionDetails`):**
- `assignees` (object, required) —
- `excludeColumns` (array, required) —
- `includeColumns` (array, required) —
- `permissions` (array, required) —

**Example:**
```json
{
  "assignees": {},
  "excludeColumns": [],
  "includeColumns": [],
  "permissions": "SELECT"
}
```

**Request Body (`ManageViewPermissionDetails`):**
- `assignViewPermissionDetails` (object, optional) —
- `revokeViewPermissionDetails` (object, optional) —

**Example:**
```json
{
  "assignViewPermissionDetails": {},
  "revokeViewPermissionDetails": {}
}
```

**Request Body (`PermissionAssignees`):**
- `targets` (array, required) —
- `type` (string, required) —

**Example:**
```json
{
  "targets": [],
  "type": "USER"
}
```

**Request Body (`RevokeViewPermissionDetails`):**
- `assignees` (object, required) —
- `excludeColumns` (array, required) —
- `includeColumns` (array, required) —
- `permissions` (array, required) —

**Example:**
```json
{
  "assignees": {},
  "excludeColumns": [],
  "includeColumns": [],
  "permissions": "SELECT"
}
```
---
**Return:** [Back to Schema](#schema) • [Top](#top)

#### `aidp schema refresh`
<a id="schema-refresh"></a>
Refreshes schema through the crawler.

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
Refreshes a table through the crawler.

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
Retrieves PAR for the entities created.

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
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`UpdateSchemaDetails`):**
- `description` (string, optional) —
- `displayName` (string, optional) —
- `properties` (object, optional) —

**Example:**
```json
{
  "description": "<string>",
  "displayName": "<string>",
  "properties": {}
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
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`RenameTableFieldDetails`):**
- `fieldName` (string, required) —
- `updatedFieldName` (string, required) —

**Example:**
```json
{
  "fieldName": "<string>",
  "updatedFieldName": "<string>"
}
```

**Request Body (`TableFieldDetails`):**
- `fieldDescription` (string, optional) —
- `fieldName` (string, required) —
- `fieldPrecision` (string, optional) —
- `fieldScale` (string, optional) —
- `fieldType` (string, optional) —

**Example:**
```json
{
  "fieldDescription": "<string>",
  "fieldName": "<string>",
  "fieldPrecision": "<string>",
  "fieldScale": "<string>",
  "fieldType": "<string>"
}
```

**Request Body (`TableProperty`):**
- `propertyName` (string, required) —
- `propertyValue` (string, optional) —

**Example:**
```json
{
  "propertyName": "<string>",
  "propertyValue": "<string>"
}
```

**Request Body (`UpdateTableDetails`):**
- `addTableFields` (array, optional) —
- `addTableProperties` (array, optional) —
- `description` (string, optional) —
- `displayName` (string, optional) —
- `dropTableFields` (array, optional) —
- `dropTableProperties` (array, optional) —
- `renameTableFields` (array, optional) —
- `updateTableFields` (array, optional) —

**Example:**
```json
{
  "addTableFields": [],
  "addTableProperties": [],
  "description": "<string>",
  "displayName": "<string>",
  "dropTableFields": [],
  "dropTableProperties": [],
  "renameTableFields": [],
  "updateTableFields": []
}
```

**Request Body (`UpdateTableFieldDetails`):**
- `fieldDescription` (string, optional) —
- `fieldName` (string, required) —

**Example:**
```json
{
  "fieldDescription": "<string>",
  "fieldName": "<string>"
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
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`UpdateViewDetails`):**
- `updateMode` (string, required) —
- `viewUpdateDetails` (object, optional) —

**Example:**
```json
{
  "updateMode": "RENAME_VIEW",
  "viewUpdateDetails": {}
}
```

**Request Body (`ViewFieldDetails`):**
- `fieldDescription` (string, optional) —
- `fieldName` (string, required) —
- `fieldPrecision` (string, optional) —
- `fieldScale` (string, optional) —
- `fieldType` (string, optional) —

**Example:**
```json
{
  "fieldDescription": "<string>",
  "fieldName": "<string>",
  "fieldPrecision": "<string>",
  "fieldScale": "<string>",
  "fieldType": "<string>"
}
```

**Request Body (`ViewProperty`):**
- `propertyName` (string, required) —
- `propertyValue` (string, optional) —

**Example:**
```json
{
  "propertyName": "<string>",
  "propertyValue": "<string>"
}
```

**Request Body (`ViewUpdateDetails`):**
- `addViewProperties` (array, optional) —
- `description` (string, optional) —
- `displayName` (string, optional) —
- `dropViewProperties` (array, optional) —
- `viewFields` (array, optional) —
- `viewText` (string, optional) —

**Example:**
```json
{
  "addViewProperties": [],
  "description": "<string>",
  "displayName": "<string>",
  "dropViewProperties": [],
  "viewFields": [],
  "viewText": "<string>"
}
```
---
**Return:** [Back to Schema](#schema) • [Top](#top)

## <a id="user-setting"></a>User Setting
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
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.

**Request Body (`CreateUserSettingDetails`):**
- `data` (object, required) —
- `isDefault` (boolean, required) —
- `name` (string, required) —

**Example:**
```json
{
  "data": {},
  "isDefault": true,
  "name": "<string>"
}
```

**Request Body (`GitAccountUserSetting`):**
- `entityType` (string, required) —
- `personalAccessToken` (string, optional) —
- `providerName` (string, required) —
- `type` (string, optional) —
- `username` (string, optional) —

**Example:**
```json
{
  "entityType": "PERSONAL_ACCESS_TOKEN",
  "personalAccessToken": "<string>",
  "providerName": "GITHUB",
  "type": "<string>",
  "username": "<string>"
}
```

**Request Body (`IamUserCredentialUserSetting`):**
- `fingerprint` (string, required) —
- `privateApiKey` (string, required) —
- `region` (string, required) —
- `tenancy` (string, required) —
- `type` (string, optional) —
- `userId` (string, required) —

**Example:**
```json
{
  "fingerprint": "<string>",
  "privateApiKey": "<string>",
  "region": "<string>",
  "tenancy": "<string>",
  "type": "<string>",
  "userId": "<string>"
}
```

**Request Body (`OAuthAdminSetting`):**
- `identityProviderUrl` (string, required) —
- `retrieveJksUrl` (string, required) —
- `type` (string, optional) —

**Example:**
```json
{
  "identityProviderUrl": "<string>",
  "retrieveJksUrl": "<string>",
  "type": "<string>"
}
```

**Request Body (`SettingData`):**
- `type` (string, required) —

**Example:**
```json
{
  "type": "IAM_USER_CREDENTIAL"
}
```
---
**Return:** [Back to User-Setting](#user-setting) • [Top](#top)

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
**Return:** [Back to User-Setting](#user-setting) • [Top](#top)

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
**Return:** [Back to User-Setting](#user-setting) • [Top](#top)

#### `aidp user-setting list`
<a id="user-setting-list"></a>
(Preview) Returns a list of all user-specific configurations, with filters for setting type, default flag, and pagination when needed.

**Usage:**

`aidp user-setting list <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
**Options:**
- `setting-type` (string, optional) — A filter to return only those settings whose value matches the given data type. Allowed values are: "IAM_USER_CREDENTIAL", "GIT_ACCOUNT"
- `is-default` (boolean, optional) — A filter to return only resources that are default.
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName"
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to User-Setting](#user-setting) • [Top](#top)

#### `aidp user-setting update`
<a id="user-setting-update"></a>
(Preview) Updates the metadata or payload of an existing user setting, letting you rotate credentials or change defaults.

**Usage:**

`aidp user-setting update <AI-DATA-PLATFORM-ID> <SETTING-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `setting-key` (string, required) — The UUID of the user setting.
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.

**Request Body (`GitAccountUserSetting`):**
- `entityType` (string, required) —
- `personalAccessToken` (string, optional) —
- `providerName` (string, required) —
- `type` (string, optional) —
- `username` (string, optional) —

**Example:**
```json
{
  "entityType": "PERSONAL_ACCESS_TOKEN",
  "personalAccessToken": "<string>",
  "providerName": "GITHUB",
  "type": "<string>",
  "username": "<string>"
}
```

**Request Body (`IamUserCredentialUserSetting`):**
- `fingerprint` (string, required) —
- `privateApiKey` (string, required) —
- `region` (string, required) —
- `tenancy` (string, required) —
- `type` (string, optional) —
- `userId` (string, required) —

**Example:**
```json
{
  "fingerprint": "<string>",
  "privateApiKey": "<string>",
  "region": "<string>",
  "tenancy": "<string>",
  "type": "<string>",
  "userId": "<string>"
}
```

**Request Body (`OAuthAdminSetting`):**
- `identityProviderUrl` (string, required) —
- `retrieveJksUrl` (string, required) —
- `type` (string, optional) —

**Example:**
```json
{
  "identityProviderUrl": "<string>",
  "retrieveJksUrl": "<string>",
  "type": "<string>"
}
```

**Request Body (`SettingData`):**
- `type` (string, required) —

**Example:**
```json
{
  "type": "IAM_USER_CREDENTIAL"
}
```

**Request Body (`UpdateUserSettingDetails`):**
- `data` (object, required) —
- `isDefault` (boolean, required) —
- `name` (string, required) —

**Example:**
```json
{
  "data": {},
  "isDefault": true,
  "name": "<string>"
}
```
---
**Return:** [Back to User-Setting](#user-setting) • [Top](#top)

## <a id="volume"></a>Volume
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
Creates a volume.

**Usage:**

`aidp volume create <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`CreateVolumeDetails`):**
- `catalogName` (string, required) —
- `description` (string, optional) —
- `displayName` (string, required) —
- `schemaName` (string, required) —
- `storageLocation` (string, optional) —
- `volumeType` (string, optional) —

**Example:**
```json
{
  "catalogName": "<string>",
  "description": "<string>",
  "displayName": "<string>",
  "schemaName": "<string>",
  "storageLocation": "<string>",
  "volumeType": "MANAGED"
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
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName"
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
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName"
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
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName"
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
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`AssignVolumePermissionDetails`):**
- `assignees` (object, required) —
- `permissions` (array, required) —

**Example:**
```json
{
  "assignees": {},
  "permissions": "READ"
}
```

**Request Body (`ManageVolumePermissionDetails`):**
- `assignVolumePermissionDetails` (object, optional) —
- `revokeVolumePermissionDetails` (object, optional) —

**Example:**
```json
{
  "assignVolumePermissionDetails": {},
  "revokeVolumePermissionDetails": {}
}
```

**Request Body (`PermissionAssignees`):**
- `targets` (array, required) —
- `type` (string, required) —

**Example:**
```json
{
  "targets": [],
  "type": "USER"
}
```

**Request Body (`RevokeVolumePermissionDetails`):**
- `assignees` (object, required) —
- `permissions` (array, required) —

**Example:**
```json
{
  "assignees": {},
  "permissions": "READ"
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
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`UpdateVolumeDetails`):**
- `description` (string, optional) —
- `displayName` (string, optional) —

**Example:**
```json
{
  "description": "<string>",
  "displayName": "<string>"
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
- `path` (string, required) — The absolute path of the file or folder
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`UpdateDirDetails`):**
- `displayName` (string, optional) —

**Example:**
```json
{
  "displayName": "<string>"
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
- `is-overwrite` (boolean, optional) — A boolean which decides if overwrite is allowed
- `should-generate-new-par` (boolean, optional) — Flag to toggle to generate short living par
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `path` (string, required) — The absolute path of the file or folder
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`UploadFileWithParDetails`):**
- `action` (string, optional) —
- `eTag` (string, optional) —
- `size` (integer, optional) —
- `systemTags` (object, optional) —

**Example:**
```json
{
  "action": "CREATE",
  "eTag": "<string>",
  "size": 0,
  "systemTags": {}
}
```
---
**Return:** [Back to Volume](#volume) • [Top](#top)

## <a id="workflow"></a>Workflow
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
Creates a job.

**Usage:**

`aidp workflow create-job <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`AutoScale`):**
- `maxWorkers` (integer, optional) —
- `minWorkers` (integer, optional) —

**Example:**
```json
{
  "maxWorkers": 0,
  "minWorkers": 0
}
```

**Request Body (`Continuous`):**
- `pauseStatus` (string, optional) —

**Example:**
```json
{
  "pauseStatus": "PAUSED"
}
```

**Request Body (`CreateJobDetails`):**
- `continuous` (object, optional) —
- `description` (string, optional) —
- `gitConfig` (object, optional) —
- `jobClusters` (array, optional) —
- `maxConcurrentRuns` (integer, optional) —
- `name` (string, required) —
- `parameters` (array, optional) —
- `path` (string, optional) —
- `queue` (object, optional) —
- `runAs` (string, optional) —
- `schedule` (object, optional) —
- `tasks` (array, optional) —
- `timeoutSeconds` (integer, optional) —

**Example:**
```json
{
  "continuous": {},
  "description": "<string>",
  "gitConfig": {},
  "jobClusters": [],
  "maxConcurrentRuns": 0,
  "name": "<string>",
  "parameters": [],
  "path": "<string>",
  "queue": {},
  "runAs": "<string>",
  "schedule": {},
  "tasks": [],
  "timeoutSeconds": 0
}
```

**Request Body (`DependsOn`):**
- `outcome` (string, optional) —
- `taskKey` (string, required) —

**Example:**
```json
{
  "outcome": "<string>",
  "taskKey": "<string>"
}
```

**Request Body (`Expression`):**
- `key` (string, required) —
- `value` (string, required) —

**Example:**
```json
{
  "key": "<string>",
  "value": "<string>"
}
```

**Request Body (`GitConfig`):**
- `branch` (string, optional) —
- `credential` (string, optional) —
- `provider` (string, optional) —
- `repositoryUrl` (string, optional) —

**Example:**
```json
{
  "branch": "<string>",
  "credential": "<string>",
  "provider": "GITHUB",
  "repositoryUrl": "<string>"
}
```

**Request Body (`IfElseTask`):**
- `condition` (string, required) —
- `dependsOn` (array, optional) —
- `expressions` (array, required) —
- `isRetryOnTimeout` (boolean, optional) —
- `maxRetries` (integer, optional) —
- `minRetryIntervalMillis` (integer, optional) —
- `parameters` (array, optional) —
- `runIf` (string, optional) —
- `taskKey` (string, optional) —
- `type` (string, optional) —

**Example:**
```json
{
  "condition": "<string>",
  "dependsOn": [],
  "expressions": [],
  "isRetryOnTimeout": true,
  "maxRetries": 0,
  "minRetryIntervalMillis": 0,
  "parameters": [],
  "runIf": "<string>",
  "taskKey": "<string>",
  "type": "<string>"
}
```

**Request Body (`JarTask`):**
- `cluster` (object, required) —
- `commandLineArguments` (string, optional) —
- `dependentLibraries` (array, optional) —
- `dependsOn` (array, optional) —
- `gitConfig` (object, optional) —
- `isRetryOnTimeout` (boolean, optional) —
- `isStreaming` (boolean, optional) —
- `mainClass` (string, required) —
- `maxRetries` (integer, optional) —
- `minRetryIntervalMillis` (integer, optional) —
- `parameters` (array, optional) —
- `runIf` (string, optional) —
- `source` (string, optional) —
- `taskKey` (string, optional) —
- `timeoutSeconds` (integer, optional) —
- `type` (string, optional) —

**Example:**
```json
{
  "cluster": {},
  "commandLineArguments": "<string>",
  "dependentLibraries": [],
  "dependsOn": [],
  "gitConfig": {},
  "isRetryOnTimeout": true,
  "isStreaming": true,
  "mainClass": "<string>",
  "maxRetries": 0,
  "minRetryIntervalMillis": 0,
  "parameters": [],
  "runIf": "<string>",
  "source": "WORKSPACE",
  "taskKey": "<string>",
  "timeoutSeconds": 0,
  "type": "<string>"
}
```

**Request Body (`JobCluster`):**
- `clusterKey` (string, optional) —
- `clusterName` (string, optional) —
- `newCluster` (object, optional) —

**Example:**
```json
{
  "clusterKey": "<string>",
  "clusterName": "<string>",
  "newCluster": {}
}
```

**Request Body (`JobTask`):**
- `dependsOn` (array, optional) —
- `isRetryOnTimeout` (boolean, optional) —
- `jobKey` (string, required) —
- `maxRetries` (integer, optional) —
- `minRetryIntervalMillis` (integer, optional) —
- `parameters` (array, optional) —
- `runIf` (string, optional) —
- `taskKey` (string, optional) —
- `timeoutSeconds` (integer, optional) —
- `type` (string, optional) —

**Example:**
```json
{
  "dependsOn": [],
  "isRetryOnTimeout": true,
  "jobKey": "<string>",
  "maxRetries": 0,
  "minRetryIntervalMillis": 0,
  "parameters": [],
  "runIf": "<string>",
  "taskKey": "<string>",
  "timeoutSeconds": 0,
  "type": "<string>"
}
```

**Request Body (`NewClusterConfiguration`):**
- `autoScale` (object, optional) —
- `clusterName` (string, optional) —
- `numWorkers` (integer, optional) —
- `sparkConf` (string, optional) —
- `sparkVersion` (string, optional) —

**Example:**
```json
{
  "autoScale": {},
  "clusterName": "<string>",
  "numWorkers": 0,
  "sparkConf": "<string>",
  "sparkVersion": "<string>"
}
```

**Request Body (`NotebookTask`):**
- `cluster` (object, required) —
- `dependsOn` (array, optional) —
- `gitConfig` (object, optional) —
- `isRetryOnTimeout` (boolean, optional) —
- `isStreaming` (boolean, optional) —
- `maxRetries` (integer, optional) —
- `minRetryIntervalMillis` (integer, optional) —
- `notebookPath` (string, required) —
- `parameters` (array, optional) —
- `runIf` (string, optional) —
- `source` (string, optional) —
- `taskKey` (string, optional) —
- `timeoutSeconds` (integer, optional) —
- `type` (string, optional) —

**Example:**
```json
{
  "cluster": {},
  "dependsOn": [],
  "gitConfig": {},
  "isRetryOnTimeout": true,
  "isStreaming": true,
  "maxRetries": 0,
  "minRetryIntervalMillis": 0,
  "notebookPath": "<string>",
  "parameters": [],
  "runIf": "<string>",
  "source": "WORKSPACE",
  "taskKey": "<string>",
  "timeoutSeconds": 0,
  "type": "<string>"
}
```

**Request Body (`Parameter`):**
- `name` (string, required) —
- `value` (string, optional) —

**Example:**
```json
{
  "name": "<string>",
  "value": "<string>"
}
```

**Request Body (`PythonTask`):**
- `cluster` (object, required) —
- `commandLineArguments` (string, optional) —
- `dependsOn` (array, optional) —
- `filePath` (string, required) —
- `gitConfig` (object, optional) —
- `isRetryOnTimeout` (boolean, optional) —
- `isStreaming` (boolean, optional) —
- `maxRetries` (integer, optional) —
- `minRetryIntervalMillis` (integer, optional) —
- `runIf` (string, optional) —
- `source` (string, optional) —
- `taskKey` (string, optional) —
- `timeoutSeconds` (integer, optional) —
- `type` (string, optional) —

**Example:**
```json
{
  "cluster": {},
  "commandLineArguments": "<string>",
  "dependsOn": [],
  "filePath": "<string>",
  "gitConfig": {},
  "isRetryOnTimeout": true,
  "isStreaming": true,
  "maxRetries": 0,
  "minRetryIntervalMillis": 0,
  "runIf": "<string>",
  "source": "WORKSPACE",
  "taskKey": "<string>",
  "timeoutSeconds": 0,
  "type": "<string>"
}
```

**Request Body (`Queue`):**
- `isEnabled` (boolean, required) —

**Example:**
```json
{
  "isEnabled": true
}
```

**Request Body (`Schedule`):**
- `pauseStatus` (string, optional) —
- `quartzCronExpression` (string, required) —
- `timezoneId` (string, required) —

**Example:**
```json
{
  "pauseStatus": "PAUSED",
  "quartzCronExpression": "<string>",
  "timezoneId": "<string>"
}
```

**Request Body (`Task`):**
- `dependsOn` (array, optional) —
- `isRetryOnTimeout` (boolean, optional) —
- `maxRetries` (integer, optional) —
- `minRetryIntervalMillis` (integer, optional) —
- `runIf` (string, required) —
- `taskKey` (string, required) —
- `type` (string, required) —

**Example:**
```json
{
  "dependsOn": [],
  "isRetryOnTimeout": true,
  "maxRetries": 0,
  "minRetryIntervalMillis": 0,
  "runIf": "ALL_SUCCESS",
  "taskKey": "<string>",
  "type": "NOTEBOOK_TASK"
}
```
---
**Return:** [Back to Workflow](#workflow) • [Top](#top)

#### `aidp workflow create-job-run`
<a id="workflow-create-job-run"></a>
Creates a job run.

**Usage:**

`aidp workflow create-job-run <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`CreateJobRunDetails`):**
- `jobKey` (string, required) —
- `key` (string, optional) —
- `originalAttemptRunId` (string, optional) —
- `parameters` (array, optional) —
- `queue` (object, optional) —
- `repairHistory` (array, optional) —
- `schedule` (object, optional) —

**Example:**
```json
{
  "jobKey": "<string>",
  "key": "<string>",
  "originalAttemptRunId": "<string>",
  "parameters": [],
  "queue": {},
  "repairHistory": [],
  "schedule": {}
}
```

**Request Body (`LifecycleState`):**
- `endTime` (integer, optional) —
- `errorTrace` (string, optional) —
- `isUserCanceledOrTimedOut` (boolean, optional) —
- `startTime` (integer, optional) —
- `stateMessage` (string, optional) —
- `status` (string, optional) —

**Example:**
```json
{
  "endTime": 0,
  "errorTrace": "<string>",
  "isUserCanceledOrTimedOut": true,
  "startTime": 0,
  "stateMessage": "<string>",
  "status": "PENDING"
}
```

**Request Body (`Parameter`):**
- `name` (string, required) —
- `value` (string, optional) —

**Example:**
```json
{
  "name": "<string>",
  "value": "<string>"
}
```

**Request Body (`Queue`):**
- `isEnabled` (boolean, required) —

**Example:**
```json
{
  "isEnabled": true
}
```

**Request Body (`RepairHistory`):**
- `endTime` (integer, optional) —
- `executionDuration` (integer, optional) —
- `key` (integer, optional) —
- `lifecycleStates` (array, optional) —
- `parameters` (array, optional) —
- `parentTaskRunKey` (string, optional) —
- `repairedTasks` (array, optional) —
- `startTime` (integer, optional) —
- `state` (object, optional) —
- `taskToTaskRunMap` (object, optional) —
- `type` (string, optional) —

**Example:**
```json
{
  "endTime": 0,
  "executionDuration": 0,
  "key": 0,
  "lifecycleStates": [],
  "parameters": [],
  "parentTaskRunKey": "<string>",
  "repairedTasks": [],
  "startTime": 0,
  "state": {},
  "taskToTaskRunMap": {},
  "type": "ORIGINAL"
}
```

**Request Body (`Schedule`):**
- `pauseStatus` (string, optional) —
- `quartzCronExpression` (string, required) —
- `timezoneId` (string, required) —

**Example:**
```json
{
  "pauseStatus": "PAUSED",
  "quartzCronExpression": "<string>",
  "timezoneId": "<string>"
}
```

**Request Body (`State`):**
- `errorTrace` (string, optional) —
- `isUserCanceledOrTimedOut` (boolean, optional) —
- `stateMessage` (string, optional) —
- `status` (string, optional) —

**Example:**
```json
{
  "errorTrace": "<string>",
  "isUserCanceledOrTimedOut": true,
  "stateMessage": "<string>",
  "status": "PENDING"
}
```
---
**Return:** [Back to Workflow](#workflow) • [Top](#top)

#### `aidp workflow delete-job`
<a id="workflow-delete-job"></a>
Deletes a job.

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
Deletes a job run.

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
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`ExportTaskRunOutputDetails`):**
- `format` (string, optional) —

**Example:**
```json
{
  "format": "HTML"
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
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.

**Request Body (`FetchOutputDetails`):**
- `outputKey` (string, optional) —

**Example:**
```json
{
  "outputKey": "<string>"
}
```
---
**Return:** [Back to Workflow](#workflow) • [Top](#top)

#### `aidp workflow get-job`
<a id="workflow-get-job"></a>
Returns detailed information about a given job.

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
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Allowed values are: "timeCreated", "displayName"
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Workflow](#workflow) • [Top](#top)

#### `aidp workflow list-job-runs`
<a id="workflow-list-job-runs"></a>
Returns a detailed list of job runs.

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
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName", "status"
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Workflow](#workflow) • [Top](#top)

#### `aidp workflow list-jobs`
<a id="workflow-list-jobs"></a>
Returns a list of jobs.

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
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName", "status"
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
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName", "status"
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Workflow](#workflow) • [Top](#top)

#### `aidp workflow list-task-runs`
<a id="workflow-list-task-runs"></a>
Returns a list of task runs.

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
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName", "status"
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
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`AssignJobPermissionDetails`):**
- `assignees` (object, required) —
- `permissions` (array, required) —

**Example:**
```json
{
  "assignees": {},
  "permissions": "READ"
}
```

**Request Body (`ManageJobPermissionDetails`):**
- `assignJobPermissionDetails` (object, optional) —
- `revokeJobPermissionDetails` (object, optional) —

**Example:**
```json
{
  "assignJobPermissionDetails": {},
  "revokeJobPermissionDetails": {}
}
```

**Request Body (`PermissionAssignees`):**
- `targets` (array, required) —
- `type` (string, required) —

**Example:**
```json
{
  "targets": [],
  "type": "USER"
}
```

**Request Body (`RevokeJobPermissionDetails`):**
- `assignees` (object, required) —
- `permissions` (array, required) —

**Example:**
```json
{
  "assignees": {},
  "permissions": "READ"
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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`Parameter`):**
- `name` (string, required) —
- `value` (string, optional) —

**Example:**
```json
{
  "name": "<string>",
  "value": "<string>"
}
```

**Request Body (`RepairJobRunDetails`):**
- `parameters` (array, optional) —
- `repairMode` (string, optional) —
- `repairTasks` (array, optional) —
- `taskKeys` (array, optional) —

**Example:**
```json
{
  "parameters": [],
  "repairMode": "RESUME",
  "repairTasks": [],
  "taskKeys": []
}
```

**Request Body (`RepairTaskDetails`):**
- `shouldIncludeDownstream` (boolean, optional) —
- `shouldIncludeUpstream` (boolean, optional) —
- `taskKey` (string, required) —

**Example:**
```json
{
  "shouldIncludeDownstream": true,
  "shouldIncludeUpstream": true,
  "taskKey": "<string>"
}
```
---
**Return:** [Back to Workflow](#workflow) • [Top](#top)

#### `aidp workflow update-job`
<a id="workflow-update-job"></a>
Updates details for a job.

**Usage:**

`aidp workflow update-job <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> <JOB-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
- `job-key` (string, required) — Job key.
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`AutoScale`):**
- `maxWorkers` (integer, optional) —
- `minWorkers` (integer, optional) —

**Example:**
```json
{
  "maxWorkers": 0,
  "minWorkers": 0
}
```

**Request Body (`Continuous`):**
- `pauseStatus` (string, optional) —

**Example:**
```json
{
  "pauseStatus": "PAUSED"
}
```

**Request Body (`DependsOn`):**
- `outcome` (string, optional) —
- `taskKey` (string, required) —

**Example:**
```json
{
  "outcome": "<string>",
  "taskKey": "<string>"
}
```

**Request Body (`Expression`):**
- `key` (string, required) —
- `value` (string, required) —

**Example:**
```json
{
  "key": "<string>",
  "value": "<string>"
}
```

**Request Body (`GitConfig`):**
- `branch` (string, optional) —
- `credential` (string, optional) —
- `provider` (string, optional) —
- `repositoryUrl` (string, optional) —

**Example:**
```json
{
  "branch": "<string>",
  "credential": "<string>",
  "provider": "GITHUB",
  "repositoryUrl": "<string>"
}
```

**Request Body (`IfElseTask`):**
- `condition` (string, required) —
- `dependsOn` (array, optional) —
- `expressions` (array, required) —
- `isRetryOnTimeout` (boolean, optional) —
- `maxRetries` (integer, optional) —
- `minRetryIntervalMillis` (integer, optional) —
- `parameters` (array, optional) —
- `runIf` (string, optional) —
- `taskKey` (string, optional) —
- `type` (string, optional) —

**Example:**
```json
{
  "condition": "<string>",
  "dependsOn": [],
  "expressions": [],
  "isRetryOnTimeout": true,
  "maxRetries": 0,
  "minRetryIntervalMillis": 0,
  "parameters": [],
  "runIf": "<string>",
  "taskKey": "<string>",
  "type": "<string>"
}
```

**Request Body (`JarTask`):**
- `cluster` (object, required) —
- `commandLineArguments` (string, optional) —
- `dependentLibraries` (array, optional) —
- `dependsOn` (array, optional) —
- `gitConfig` (object, optional) —
- `isRetryOnTimeout` (boolean, optional) —
- `isStreaming` (boolean, optional) —
- `mainClass` (string, required) —
- `maxRetries` (integer, optional) —
- `minRetryIntervalMillis` (integer, optional) —
- `parameters` (array, optional) —
- `runIf` (string, optional) —
- `source` (string, optional) —
- `taskKey` (string, optional) —
- `timeoutSeconds` (integer, optional) —
- `type` (string, optional) —

**Example:**
```json
{
  "cluster": {},
  "commandLineArguments": "<string>",
  "dependentLibraries": [],
  "dependsOn": [],
  "gitConfig": {},
  "isRetryOnTimeout": true,
  "isStreaming": true,
  "mainClass": "<string>",
  "maxRetries": 0,
  "minRetryIntervalMillis": 0,
  "parameters": [],
  "runIf": "<string>",
  "source": "WORKSPACE",
  "taskKey": "<string>",
  "timeoutSeconds": 0,
  "type": "<string>"
}
```

**Request Body (`JobCluster`):**
- `clusterKey` (string, optional) —
- `clusterName` (string, optional) —
- `newCluster` (object, optional) —

**Example:**
```json
{
  "clusterKey": "<string>",
  "clusterName": "<string>",
  "newCluster": {}
}
```

**Request Body (`JobTask`):**
- `dependsOn` (array, optional) —
- `isRetryOnTimeout` (boolean, optional) —
- `jobKey` (string, required) —
- `maxRetries` (integer, optional) —
- `minRetryIntervalMillis` (integer, optional) —
- `parameters` (array, optional) —
- `runIf` (string, optional) —
- `taskKey` (string, optional) —
- `timeoutSeconds` (integer, optional) —
- `type` (string, optional) —

**Example:**
```json
{
  "dependsOn": [],
  "isRetryOnTimeout": true,
  "jobKey": "<string>",
  "maxRetries": 0,
  "minRetryIntervalMillis": 0,
  "parameters": [],
  "runIf": "<string>",
  "taskKey": "<string>",
  "timeoutSeconds": 0,
  "type": "<string>"
}
```

**Request Body (`NewClusterConfiguration`):**
- `autoScale` (object, optional) —
- `clusterName` (string, optional) —
- `numWorkers` (integer, optional) —
- `sparkConf` (string, optional) —
- `sparkVersion` (string, optional) —

**Example:**
```json
{
  "autoScale": {},
  "clusterName": "<string>",
  "numWorkers": 0,
  "sparkConf": "<string>",
  "sparkVersion": "<string>"
}
```

**Request Body (`NotebookTask`):**
- `cluster` (object, required) —
- `dependsOn` (array, optional) —
- `gitConfig` (object, optional) —
- `isRetryOnTimeout` (boolean, optional) —
- `isStreaming` (boolean, optional) —
- `maxRetries` (integer, optional) —
- `minRetryIntervalMillis` (integer, optional) —
- `notebookPath` (string, required) —
- `parameters` (array, optional) —
- `runIf` (string, optional) —
- `source` (string, optional) —
- `taskKey` (string, optional) —
- `timeoutSeconds` (integer, optional) —
- `type` (string, optional) —

**Example:**
```json
{
  "cluster": {},
  "dependsOn": [],
  "gitConfig": {},
  "isRetryOnTimeout": true,
  "isStreaming": true,
  "maxRetries": 0,
  "minRetryIntervalMillis": 0,
  "notebookPath": "<string>",
  "parameters": [],
  "runIf": "<string>",
  "source": "WORKSPACE",
  "taskKey": "<string>",
  "timeoutSeconds": 0,
  "type": "<string>"
}
```

**Request Body (`Parameter`):**
- `name` (string, required) —
- `value` (string, optional) —

**Example:**
```json
{
  "name": "<string>",
  "value": "<string>"
}
```

**Request Body (`PythonTask`):**
- `cluster` (object, required) —
- `commandLineArguments` (string, optional) —
- `dependsOn` (array, optional) —
- `filePath` (string, required) —
- `gitConfig` (object, optional) —
- `isRetryOnTimeout` (boolean, optional) —
- `isStreaming` (boolean, optional) —
- `maxRetries` (integer, optional) —
- `minRetryIntervalMillis` (integer, optional) —
- `runIf` (string, optional) —
- `source` (string, optional) —
- `taskKey` (string, optional) —
- `timeoutSeconds` (integer, optional) —
- `type` (string, optional) —

**Example:**
```json
{
  "cluster": {},
  "commandLineArguments": "<string>",
  "dependsOn": [],
  "filePath": "<string>",
  "gitConfig": {},
  "isRetryOnTimeout": true,
  "isStreaming": true,
  "maxRetries": 0,
  "minRetryIntervalMillis": 0,
  "runIf": "<string>",
  "source": "WORKSPACE",
  "taskKey": "<string>",
  "timeoutSeconds": 0,
  "type": "<string>"
}
```

**Request Body (`Queue`):**
- `isEnabled` (boolean, required) —

**Example:**
```json
{
  "isEnabled": true
}
```

**Request Body (`Schedule`):**
- `pauseStatus` (string, optional) —
- `quartzCronExpression` (string, required) —
- `timezoneId` (string, required) —

**Example:**
```json
{
  "pauseStatus": "PAUSED",
  "quartzCronExpression": "<string>",
  "timezoneId": "<string>"
}
```

**Request Body (`Task`):**
- `dependsOn` (array, optional) —
- `isRetryOnTimeout` (boolean, optional) —
- `maxRetries` (integer, optional) —
- `minRetryIntervalMillis` (integer, optional) —
- `runIf` (string, required) —
- `taskKey` (string, required) —
- `type` (string, required) —

**Example:**
```json
{
  "dependsOn": [],
  "isRetryOnTimeout": true,
  "maxRetries": 0,
  "minRetryIntervalMillis": 0,
  "runIf": "ALL_SUCCESS",
  "taskKey": "<string>",
  "type": "NOTEBOOK_TASK"
}
```

**Request Body (`UpdateJobDetails`):**
- `continuous` (object, optional) —
- `description` (string, optional) —
- `gitConfig` (object, optional) —
- `jobClusters` (array, optional) —
- `maxConcurrentRuns` (integer, optional) —
- `name` (string, required) —
- `parameters` (array, optional) —
- `path` (string, optional) —
- `queue` (object, optional) —
- `runAs` (string, optional) —
- `schedule` (object, optional) —
- `tasks` (array, optional) —
- `timeoutSeconds` (integer, optional) —

**Example:**
```json
{
  "continuous": {},
  "description": "<string>",
  "gitConfig": {},
  "jobClusters": [],
  "maxConcurrentRuns": 0,
  "name": "<string>",
  "parameters": [],
  "path": "<string>",
  "queue": {},
  "runAs": "<string>",
  "schedule": {},
  "tasks": [],
  "timeoutSeconds": 0
}
```
---
**Return:** [Back to Workflow](#workflow) • [Top](#top)

## <a id="workspace"></a>Workspace
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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`CreateWorkspaceDetails`):**
- `defaultCatalogKey` (string, optional) —
- `description` (string, optional) —
- `displayName` (string, required) —
- `networkConfigurationDetails` (object, optional) —

**Example:**
```json
{
  "defaultCatalogKey": "<string>",
  "description": "<string>",
  "displayName": "<string>",
  "networkConfigurationDetails": {}
}
```

**Request Body (`Scan`):**
- `fqdn` (string, optional) —
- `port` (string, optional) —

**Example:**
```json
{
  "fqdn": "<string>",
  "port": "<string>"
}
```

**Request Body (`WorkspaceNetworkConfigurationDetails`):**
- `nsgIds` (array, optional) —
- `scanDetails` (array, optional) —
- `subnetId` (string, optional) —

**Example:**
```json
{
  "nsgIds": [],
  "scanDetails": [],
  "subnetId": "<string>"
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
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`CreateGitFolderDetails`):**
- `branchName` (string, required) —
- `credentialKey` (string, required) —
- `description` (string, optional) —
- `folderPath` (string, required) —
- `gitProviderKey` (string, optional) —
- `gitRepositoryUrl` (string, required) —

**Example:**
```json
{
  "branchName": "<string>",
  "credentialKey": "<string>",
  "description": "<string>",
  "folderPath": "<string>",
  "gitProviderKey": "<string>",
  "gitRepositoryUrl": "<string>"
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
- `lifecycle-state` (string, optional) — A filter to return only resources that match the given lifecycle state. The state value is case-insensitive. Allowed values are: "CREATING", "UPDATING", "ACTIVE", "DELETING", "DELETED", "FAILED"
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `display-name-contains` (string, optional) — A filter to return only resources that have a display name containing the text provided.
- `type` (string, optional) — When no value is provided, all workspaces are returned. Otherwise, workspace of selected value is returned. Allowed values are: "DEFAULT", "USER"
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName"
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
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for granteeName is ascending. Allowed values are: "granteeName"
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
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for granteeName is ascending. Allowed values are: "granteeName"
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
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`AssignCreateWorkspacePermissionDetails`):**
- `assignees` (object, required) —

**Example:**
```json
{
  "assignees": {}
}
```

**Request Body (`ManageCreateWorkspacePermissionDetails`):**
- `assignCreateWorkspacePermissionDetails` (object, optional) —
- `revokeCreateWorkspacePermissionDetails` (object, optional) —

**Example:**
```json
{
  "assignCreateWorkspacePermissionDetails": {},
  "revokeCreateWorkspacePermissionDetails": {}
}
```

**Request Body (`PermissionAssignees`):**
- `targets` (array, required) —
- `type` (string, required) —

**Example:**
```json
{
  "targets": [],
  "type": "USER"
}
```

**Request Body (`RevokeCreateWorkspacePermissionDetails`):**
- `assignees` (object, required) —

**Example:**
```json
{
  "assignees": {}
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
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`AssignWorkspacePermissionDetails`):**
- `assignees` (object, required) —
- `permissions` (array, required) —

**Example:**
```json
{
  "assignees": {},
  "permissions": "USER"
}
```

**Request Body (`ManageWorkspacePermissionDetails`):**
- `assignWorkspacePermissionDetails` (object, optional) —
- `revokeWorkspacePermissionDetails` (object, optional) —

**Example:**
```json
{
  "assignWorkspacePermissionDetails": {},
  "revokeWorkspacePermissionDetails": {}
}
```

**Request Body (`PermissionAssignees`):**
- `targets` (array, required) —
- `type` (string, required) —

**Example:**
```json
{
  "targets": [],
  "type": "USER"
}
```

**Request Body (`RevokeWorkspacePermissionDetails`):**
- `assignees` (object, required) —
- `permissions` (array, required) —

**Example:**
```json
{
  "assignees": {},
  "permissions": "USER"
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
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`Scan`):**
- `fqdn` (string, optional) —
- `port` (string, optional) —

**Example:**
```json
{
  "fqdn": "<string>",
  "port": "<string>"
}
```

**Request Body (`UpdateWorkspaceDetails`):**
- `defaultCatalogKey` (string, optional) —
- `description` (string, optional) —
- `displayName` (string, optional) —
- `networkConfigurationDetails` (object, optional) —

**Example:**
```json
{
  "defaultCatalogKey": "<string>",
  "description": "<string>",
  "displayName": "<string>",
  "networkConfigurationDetails": {}
}
```

**Request Body (`WorkspaceNetworkConfigurationDetails`):**
- `nsgIds` (array, optional) —
- `scanDetails` (array, optional) —
- `subnetId` (string, optional) —

**Example:**
```json
{
  "nsgIds": [],
  "scanDetails": [],
  "subnetId": "<string>"
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
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`UpdateWorkspaceAsyncOperationStatusDetails`):**
- `externalId` (string, optional) —
- `properties` (object, optional) —
- `state` (string, required) —
- `stateMessage` (string, optional) —

**Example:**
```json
{
  "externalId": "<string>",
  "properties": {},
  "state": "NETWORK_CONFIGURATION_CREATED",
  "stateMessage": "<string>"
}
```
---
**Return:** [Back to Workspace](#workspace) • [Top](#top)

## <a id="workspace-object"></a>Workspace Object
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
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`CopyWorkspaceObjectDetails`):**
- `bufferSize` (integer, optional) —
- `fromPath` (string, optional) —
- `isDeleteSource` (boolean, optional) —
- `isIncludeOutputs` (boolean, optional) —
- `isOverWrite` (boolean, optional) —
- `toPath` (string, optional) —

**Example:**
```json
{
  "bufferSize": 0,
  "fromPath": "<string>",
  "isDeleteSource": true,
  "isIncludeOutputs": true,
  "isOverWrite": true,
  "toPath": "<string>"
}
```
---
**Return:** [Back to Workspace-Object](#workspace-object) • [Top](#top)

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
- `object-description` (string, optional) — The description of the workspace object
- `type` (string, optional) — The type of workspace object.
- `path` (string, required) — The absolute path of the file or folder
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `is-upload-file-base64-encoded` (boolean, optional) — A flag to identify if the upload file is base64 encoded
- `is-overwrite` (boolean, optional) — A boolean which decides if overwrite is allowed
---
**Return:** [Back to Workspace-Object](#workspace-object) • [Top](#top)

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
**Return:** [Back to Workspace-Object](#workspace-object) • [Top](#top)

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
**Return:** [Back to Workspace-Object](#workspace-object) • [Top](#top)

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
**Return:** [Back to Workspace-Object](#workspace-object) • [Top](#top)

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
**Return:** [Back to Workspace-Object](#workspace-object) • [Top](#top)

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
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName"
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---
**Return:** [Back to Workspace-Object](#workspace-object) • [Top](#top)

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
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName"
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Workspace-Object](#workspace-object) • [Top](#top)

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
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`AssignWorkspaceObjectPermissionDetails`):**
- `assignees` (object, required) —
- `isPermissionsInheritable` (boolean, optional) —
- `permissions` (array, required) —

**Example:**
```json
{
  "assignees": {},
  "isPermissionsInheritable": true,
  "permissions": "READ"
}
```

**Request Body (`ManageWorkspaceObjectPermissionDetails`):**
- `assignWorkspaceObjectPermissionDetails` (object, optional) —
- `revokeWorkspaceObjectPermissionDetails` (object, optional) —

**Example:**
```json
{
  "assignWorkspaceObjectPermissionDetails": {},
  "revokeWorkspaceObjectPermissionDetails": {}
}
```

**Request Body (`PermissionAssignees`):**
- `targets` (array, required) —
- `type` (string, required) —

**Example:**
```json
{
  "targets": [],
  "type": "USER"
}
```

**Request Body (`RevokeWorkspaceObjectPermissionDetails`):**
- `assignees` (object, required) —
- `isPermissionsInheritable` (boolean, optional) —
- `permissions` (array, required) —

**Example:**
```json
{
  "assignees": {},
  "isPermissionsInheritable": true,
  "permissions": "READ"
}
```
---
**Return:** [Back to Workspace-Object](#workspace-object) • [Top](#top)

#### `aidp workspace-object move`
<a id="workspace-object-move"></a>
Moves a workspace object to different location.

**Usage:**

`aidp workspace-object move <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`MoveWorkspaceObjectDetails`):**
- `fromPath` (string, optional) —
- `toPath` (string, optional) —

**Example:**
```json
{
  "fromPath": "<string>",
  "toPath": "<string>"
}
```
---
**Return:** [Back to Workspace-Object](#workspace-object) • [Top](#top)

#### `aidp workspace-object rename`
<a id="workspace-object-rename"></a>
Renames a workspace object.

**Usage:**

`aidp workspace-object rename <AI-DATA-PLATFORM-ID> <WORKSPACE-KEY> --body <JSON>`

**Path Arguments:**
- `ai-data-platform-id` (string, required) — The OCID of the AI Data Platform (Data Lake) instance.
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`RenameWorkspaceObjectDetails`):**
- `newName` (string, optional) —
- `path` (string, optional) —

**Example:**
```json
{
  "newName": "<string>",
  "path": "<string>"
}
```
---
**Return:** [Back to Workspace-Object](#workspace-object) • [Top](#top)

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
- `object-description` (string, optional) — The description of the workspace object
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---
**Return:** [Back to Workspace-Object](#workspace-object) • [Top](#top)

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
- `is-overwrite` (boolean, optional) — A boolean which decides if overwrite is allowed
- `should-generate-new-par` (boolean, optional) — Flag to toggle to generate short living par
- `object-description` (string, optional) — The description of the workspace object
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `path` (string, required) — The absolute path of the file or folder
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `type` (string, optional) — The type of workspace object.

**Request Body (`UploadFileWithParDetails`):**
- `action` (string, optional) —
- `eTag` (string, optional) —
- `size` (integer, optional) —
- `systemTags` (object, optional) —

**Example:**
```json
{
  "action": "CREATE",
  "eTag": "<string>",
  "size": 0,
  "systemTags": {}
}
```
---
**Return:** [Back to Workspace-Object](#workspace-object) • [Top](#top)
